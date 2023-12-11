package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the windows10GeneralConfiguration resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10GeneralConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new Windows10GeneralConfiguration and sets the default values.
     */
    public Windows10GeneralConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10GeneralConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10GeneralConfiguration
     */
    @jakarta.annotation.Nonnull
    public static Windows10GeneralConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10GeneralConfiguration();
    }
    /**
     * Gets the accountsBlockAddingNonMicrosoftAccountEmail property value. Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAccountsBlockAddingNonMicrosoftAccountEmail() {
        return this.backingStore.get("accountsBlockAddingNonMicrosoftAccountEmail");
    }
    /**
     * Gets the activateAppsWithVoice property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getActivateAppsWithVoice() {
        return this.backingStore.get("activateAppsWithVoice");
    }
    /**
     * Gets the antiTheftModeBlocked property value. Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAntiTheftModeBlocked() {
        return this.backingStore.get("antiTheftModeBlocked");
    }
    /**
     * Gets the appManagementMSIAllowUserControlOverInstall property value. This policy setting permits users to change installation options that typically are available only to system administrators.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppManagementMSIAllowUserControlOverInstall() {
        return this.backingStore.get("appManagementMSIAllowUserControlOverInstall");
    }
    /**
     * Gets the appManagementMSIAlwaysInstallWithElevatedPrivileges property value. This policy setting directs Windows Installer to use elevated permissions when it installs any program on the system.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppManagementMSIAlwaysInstallWithElevatedPrivileges() {
        return this.backingStore.get("appManagementMSIAlwaysInstallWithElevatedPrivileges");
    }
    /**
     * Gets the appManagementPackageFamilyNamesToLaunchAfterLogOn property value. List of semi-colon delimited Package Family Names of Windows apps. Listed Windows apps are to be launched after logon.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAppManagementPackageFamilyNamesToLaunchAfterLogOn() {
        return this.backingStore.get("appManagementPackageFamilyNamesToLaunchAfterLogOn");
    }
    /**
     * Gets the appsAllowTrustedAppsSideloading property value. State Management Setting.
     * @return a StateManagementSetting
     */
    @jakarta.annotation.Nullable
    public StateManagementSetting getAppsAllowTrustedAppsSideloading() {
        return this.backingStore.get("appsAllowTrustedAppsSideloading");
    }
    /**
     * Gets the appsBlockWindowsStoreOriginatedApps property value. Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAppsBlockWindowsStoreOriginatedApps() {
        return this.backingStore.get("appsBlockWindowsStoreOriginatedApps");
    }
    /**
     * Gets the authenticationAllowSecondaryDevice property value. Allows secondary authentication devices to work with Windows.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAuthenticationAllowSecondaryDevice() {
        return this.backingStore.get("authenticationAllowSecondaryDevice");
    }
    /**
     * Gets the authenticationPreferredAzureADTenantDomainName property value. Specifies the preferred domain among available domains in the Azure AD tenant.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationPreferredAzureADTenantDomainName() {
        return this.backingStore.get("authenticationPreferredAzureADTenantDomainName");
    }
    /**
     * Gets the authenticationWebSignIn property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getAuthenticationWebSignIn() {
        return this.backingStore.get("authenticationWebSignIn");
    }
    /**
     * Gets the bluetoothAllowedServices property value. Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBluetoothAllowedServices() {
        return this.backingStore.get("bluetoothAllowedServices");
    }
    /**
     * Gets the bluetoothBlockAdvertising property value. Whether or not to Block the user from using bluetooth advertising.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBluetoothBlockAdvertising() {
        return this.backingStore.get("bluetoothBlockAdvertising");
    }
    /**
     * Gets the bluetoothBlockDiscoverableMode property value. Whether or not to Block the user from using bluetooth discoverable mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBluetoothBlockDiscoverableMode() {
        return this.backingStore.get("bluetoothBlockDiscoverableMode");
    }
    /**
     * Gets the bluetoothBlocked property value. Whether or not to Block the user from using bluetooth.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBluetoothBlocked() {
        return this.backingStore.get("bluetoothBlocked");
    }
    /**
     * Gets the bluetoothBlockPrePairing property value. Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBluetoothBlockPrePairing() {
        return this.backingStore.get("bluetoothBlockPrePairing");
    }
    /**
     * Gets the bluetoothBlockPromptedProximalConnections property value. Whether or not to block the users from using Swift Pair and other proximity based scenarios.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBluetoothBlockPromptedProximalConnections() {
        return this.backingStore.get("bluetoothBlockPromptedProximalConnections");
    }
    /**
     * Gets the cameraBlocked property value. Whether or not to Block the user from accessing the camera of the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this.backingStore.get("cameraBlocked");
    }
    /**
     * Gets the cellularBlockDataWhenRoaming property value. Whether or not to Block the user from using data over cellular while roaming.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockDataWhenRoaming() {
        return this.backingStore.get("cellularBlockDataWhenRoaming");
    }
    /**
     * Gets the cellularBlockVpn property value. Whether or not to Block the user from using VPN over cellular.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockVpn() {
        return this.backingStore.get("cellularBlockVpn");
    }
    /**
     * Gets the cellularBlockVpnWhenRoaming property value. Whether or not to Block the user from using VPN when roaming over cellular.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockVpnWhenRoaming() {
        return this.backingStore.get("cellularBlockVpnWhenRoaming");
    }
    /**
     * Gets the cellularData property value. Possible values of the ConfigurationUsage list.
     * @return a ConfigurationUsage
     */
    @jakarta.annotation.Nullable
    public ConfigurationUsage getCellularData() {
        return this.backingStore.get("cellularData");
    }
    /**
     * Gets the certificatesBlockManualRootCertificateInstallation property value. Whether or not to Block the user from doing manual root certificate installation.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCertificatesBlockManualRootCertificateInstallation() {
        return this.backingStore.get("certificatesBlockManualRootCertificateInstallation");
    }
    /**
     * Gets the configureTimeZone property value. Specifies the time zone to be applied to the device. This is the standard Windows name for the target time zone.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConfigureTimeZone() {
        return this.backingStore.get("configureTimeZone");
    }
    /**
     * Gets the connectedDevicesServiceBlocked property value. Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectedDevicesServiceBlocked() {
        return this.backingStore.get("connectedDevicesServiceBlocked");
    }
    /**
     * Gets the copyPasteBlocked property value. Whether or not to Block the user from using copy paste.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCopyPasteBlocked() {
        return this.backingStore.get("copyPasteBlocked");
    }
    /**
     * Gets the cortanaBlocked property value. Whether or not to Block the user from using Cortana.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCortanaBlocked() {
        return this.backingStore.get("cortanaBlocked");
    }
    /**
     * Gets the cryptographyAllowFipsAlgorithmPolicy property value. Specify whether to allow or disallow the Federal Information Processing Standard (FIPS) policy.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCryptographyAllowFipsAlgorithmPolicy() {
        return this.backingStore.get("cryptographyAllowFipsAlgorithmPolicy");
    }
    /**
     * Gets the dataProtectionBlockDirectMemoryAccess property value. This policy setting allows you to block direct memory access (DMA) for all hot pluggable PCI downstream ports until a user logs into Windows.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDataProtectionBlockDirectMemoryAccess() {
        return this.backingStore.get("dataProtectionBlockDirectMemoryAccess");
    }
    /**
     * Gets the defenderBlockEndUserAccess property value. Whether or not to block end user access to Defender.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderBlockEndUserAccess() {
        return this.backingStore.get("defenderBlockEndUserAccess");
    }
    /**
     * Gets the defenderBlockOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderBlockOnAccessProtection() {
        return this.backingStore.get("defenderBlockOnAccessProtection");
    }
    /**
     * Gets the defenderCloudBlockLevel property value. Possible values of Cloud Block Level
     * @return a DefenderCloudBlockLevelType
     */
    @jakarta.annotation.Nullable
    public DefenderCloudBlockLevelType getDefenderCloudBlockLevel() {
        return this.backingStore.get("defenderCloudBlockLevel");
    }
    /**
     * Gets the defenderCloudExtendedTimeout property value. Timeout extension for file scanning by the cloud. Valid values 0 to 50
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDefenderCloudExtendedTimeout() {
        return this.backingStore.get("defenderCloudExtendedTimeout");
    }
    /**
     * Gets the defenderCloudExtendedTimeoutInSeconds property value. Timeout extension for file scanning by the cloud. Valid values 0 to 50
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDefenderCloudExtendedTimeoutInSeconds() {
        return this.backingStore.get("defenderCloudExtendedTimeoutInSeconds");
    }
    /**
     * Gets the defenderDaysBeforeDeletingQuarantinedMalware property value. Number of days before deleting quarantined malware. Valid values 0 to 90
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDefenderDaysBeforeDeletingQuarantinedMalware() {
        return this.backingStore.get("defenderDaysBeforeDeletingQuarantinedMalware");
    }
    /**
     * Gets the defenderDetectedMalwareActions property value. Gets or sets Defenders actions to take on detected Malware per threat level.
     * @return a DefenderDetectedMalwareActions
     */
    @jakarta.annotation.Nullable
    public DefenderDetectedMalwareActions getDefenderDetectedMalwareActions() {
        return this.backingStore.get("defenderDetectedMalwareActions");
    }
    /**
     * Gets the defenderDisableCatchupFullScan property value. When blocked, catch-up scans for scheduled full scans will be turned off.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderDisableCatchupFullScan() {
        return this.backingStore.get("defenderDisableCatchupFullScan");
    }
    /**
     * Gets the defenderDisableCatchupQuickScan property value. When blocked, catch-up scans for scheduled quick scans will be turned off.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderDisableCatchupQuickScan() {
        return this.backingStore.get("defenderDisableCatchupQuickScan");
    }
    /**
     * Gets the defenderFileExtensionsToExclude property value. File extensions to exclude from scans and real time protection.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefenderFileExtensionsToExclude() {
        return this.backingStore.get("defenderFileExtensionsToExclude");
    }
    /**
     * Gets the defenderFilesAndFoldersToExclude property value. Files and folder to exclude from scans and real time protection.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefenderFilesAndFoldersToExclude() {
        return this.backingStore.get("defenderFilesAndFoldersToExclude");
    }
    /**
     * Gets the defenderMonitorFileActivity property value. Possible values for monitoring file activity.
     * @return a DefenderMonitorFileActivity
     */
    @jakarta.annotation.Nullable
    public DefenderMonitorFileActivity getDefenderMonitorFileActivity() {
        return this.backingStore.get("defenderMonitorFileActivity");
    }
    /**
     * Gets the defenderPotentiallyUnwantedAppAction property value. Gets or sets Defenders action to take on Potentially Unwanted Application (PUA), which includes software with behaviors of ad-injection, software bundling, persistent solicitation for payment or subscription, etc. Defender alerts user when PUA is being downloaded or attempts to install itself. Added in Windows 10 for desktop. Possible values are: deviceDefault, block, audit.
     * @return a DefenderPotentiallyUnwantedAppAction
     */
    @jakarta.annotation.Nullable
    public DefenderPotentiallyUnwantedAppAction getDefenderPotentiallyUnwantedAppAction() {
        return this.backingStore.get("defenderPotentiallyUnwantedAppAction");
    }
    /**
     * Gets the defenderPotentiallyUnwantedAppActionSetting property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderPotentiallyUnwantedAppActionSetting() {
        return this.backingStore.get("defenderPotentiallyUnwantedAppActionSetting");
    }
    /**
     * Gets the defenderProcessesToExclude property value. Processes to exclude from scans and real time protection.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefenderProcessesToExclude() {
        return this.backingStore.get("defenderProcessesToExclude");
    }
    /**
     * Gets the defenderPromptForSampleSubmission property value. Possible values for prompting user for samples submission.
     * @return a DefenderPromptForSampleSubmission
     */
    @jakarta.annotation.Nullable
    public DefenderPromptForSampleSubmission getDefenderPromptForSampleSubmission() {
        return this.backingStore.get("defenderPromptForSampleSubmission");
    }
    /**
     * Gets the defenderRequireBehaviorMonitoring property value. Indicates whether or not to require behavior monitoring.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderRequireBehaviorMonitoring() {
        return this.backingStore.get("defenderRequireBehaviorMonitoring");
    }
    /**
     * Gets the defenderRequireCloudProtection property value. Indicates whether or not to require cloud protection.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderRequireCloudProtection() {
        return this.backingStore.get("defenderRequireCloudProtection");
    }
    /**
     * Gets the defenderRequireNetworkInspectionSystem property value. Indicates whether or not to require network inspection system.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderRequireNetworkInspectionSystem() {
        return this.backingStore.get("defenderRequireNetworkInspectionSystem");
    }
    /**
     * Gets the defenderRequireRealTimeMonitoring property value. Indicates whether or not to require real time monitoring.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderRequireRealTimeMonitoring() {
        return this.backingStore.get("defenderRequireRealTimeMonitoring");
    }
    /**
     * Gets the defenderScanArchiveFiles property value. Indicates whether or not to scan archive files.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderScanArchiveFiles() {
        return this.backingStore.get("defenderScanArchiveFiles");
    }
    /**
     * Gets the defenderScanDownloads property value. Indicates whether or not to scan downloads.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderScanDownloads() {
        return this.backingStore.get("defenderScanDownloads");
    }
    /**
     * Gets the defenderScanIncomingMail property value. Indicates whether or not to scan incoming mail messages.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderScanIncomingMail() {
        return this.backingStore.get("defenderScanIncomingMail");
    }
    /**
     * Gets the defenderScanMappedNetworkDrivesDuringFullScan property value. Indicates whether or not to scan mapped network drives during full scan.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderScanMappedNetworkDrivesDuringFullScan() {
        return this.backingStore.get("defenderScanMappedNetworkDrivesDuringFullScan");
    }
    /**
     * Gets the defenderScanMaxCpu property value. Max CPU usage percentage during scan. Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDefenderScanMaxCpu() {
        return this.backingStore.get("defenderScanMaxCpu");
    }
    /**
     * Gets the defenderScanNetworkFiles property value. Indicates whether or not to scan files opened from a network folder.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderScanNetworkFiles() {
        return this.backingStore.get("defenderScanNetworkFiles");
    }
    /**
     * Gets the defenderScanRemovableDrivesDuringFullScan property value. Indicates whether or not to scan removable drives during full scan.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderScanRemovableDrivesDuringFullScan() {
        return this.backingStore.get("defenderScanRemovableDrivesDuringFullScan");
    }
    /**
     * Gets the defenderScanScriptsLoadedInInternetExplorer property value. Indicates whether or not to scan scripts loaded in Internet Explorer browser.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderScanScriptsLoadedInInternetExplorer() {
        return this.backingStore.get("defenderScanScriptsLoadedInInternetExplorer");
    }
    /**
     * Gets the defenderScanType property value. Possible values for system scan type.
     * @return a DefenderScanType
     */
    @jakarta.annotation.Nullable
    public DefenderScanType getDefenderScanType() {
        return this.backingStore.get("defenderScanType");
    }
    /**
     * Gets the defenderScheduledQuickScanTime property value. The time to perform a daily quick scan.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getDefenderScheduledQuickScanTime() {
        return this.backingStore.get("defenderScheduledQuickScanTime");
    }
    /**
     * Gets the defenderScheduledScanTime property value. The defender time for the system scan.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getDefenderScheduledScanTime() {
        return this.backingStore.get("defenderScheduledScanTime");
    }
    /**
     * Gets the defenderScheduleScanEnableLowCpuPriority property value. When enabled, low CPU priority will be used during scheduled scans.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderScheduleScanEnableLowCpuPriority() {
        return this.backingStore.get("defenderScheduleScanEnableLowCpuPriority");
    }
    /**
     * Gets the defenderSignatureUpdateIntervalInHours property value. The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDefenderSignatureUpdateIntervalInHours() {
        return this.backingStore.get("defenderSignatureUpdateIntervalInHours");
    }
    /**
     * Gets the defenderSubmitSamplesConsentType property value. Checks for the user consent level in Windows Defender to send data. Possible values are: sendSafeSamplesAutomatically, alwaysPrompt, neverSend, sendAllSamplesAutomatically.
     * @return a DefenderSubmitSamplesConsentType
     */
    @jakarta.annotation.Nullable
    public DefenderSubmitSamplesConsentType getDefenderSubmitSamplesConsentType() {
        return this.backingStore.get("defenderSubmitSamplesConsentType");
    }
    /**
     * Gets the defenderSystemScanSchedule property value. Possible values for a weekly schedule.
     * @return a WeeklySchedule
     */
    @jakarta.annotation.Nullable
    public WeeklySchedule getDefenderSystemScanSchedule() {
        return this.backingStore.get("defenderSystemScanSchedule");
    }
    /**
     * Gets the developerUnlockSetting property value. State Management Setting.
     * @return a StateManagementSetting
     */
    @jakarta.annotation.Nullable
    public StateManagementSetting getDeveloperUnlockSetting() {
        return this.backingStore.get("developerUnlockSetting");
    }
    /**
     * Gets the deviceManagementBlockFactoryResetOnMobile property value. Indicates whether or not to Block the user from resetting their phone.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceManagementBlockFactoryResetOnMobile() {
        return this.backingStore.get("deviceManagementBlockFactoryResetOnMobile");
    }
    /**
     * Gets the deviceManagementBlockManualUnenroll property value. Indicates whether or not to Block the user from doing manual un-enrollment from device management.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceManagementBlockManualUnenroll() {
        return this.backingStore.get("deviceManagementBlockManualUnenroll");
    }
    /**
     * Gets the diagnosticsDataSubmissionMode property value. Allow the device to send diagnostic and usage telemetry data, such as Watson.
     * @return a DiagnosticDataSubmissionMode
     */
    @jakarta.annotation.Nullable
    public DiagnosticDataSubmissionMode getDiagnosticsDataSubmissionMode() {
        return this.backingStore.get("diagnosticsDataSubmissionMode");
    }
    /**
     * Gets the displayAppListWithGdiDPIScalingTurnedOff property value. List of legacy applications that have GDI DPI Scaling turned off.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDisplayAppListWithGdiDPIScalingTurnedOff() {
        return this.backingStore.get("displayAppListWithGdiDPIScalingTurnedOff");
    }
    /**
     * Gets the displayAppListWithGdiDPIScalingTurnedOn property value. List of legacy applications that have GDI DPI Scaling turned on.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDisplayAppListWithGdiDPIScalingTurnedOn() {
        return this.backingStore.get("displayAppListWithGdiDPIScalingTurnedOn");
    }
    /**
     * Gets the edgeAllowStartPagesModification property value. Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeAllowStartPagesModification() {
        return this.backingStore.get("edgeAllowStartPagesModification");
    }
    /**
     * Gets the edgeBlockAccessToAboutFlags property value. Indicates whether or not to prevent access to about flags on Edge browser.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockAccessToAboutFlags() {
        return this.backingStore.get("edgeBlockAccessToAboutFlags");
    }
    /**
     * Gets the edgeBlockAddressBarDropdown property value. Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockAddressBarDropdown() {
        return this.backingStore.get("edgeBlockAddressBarDropdown");
    }
    /**
     * Gets the edgeBlockAutofill property value. Indicates whether or not to block auto fill.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockAutofill() {
        return this.backingStore.get("edgeBlockAutofill");
    }
    /**
     * Gets the edgeBlockCompatibilityList property value. Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockCompatibilityList() {
        return this.backingStore.get("edgeBlockCompatibilityList");
    }
    /**
     * Gets the edgeBlockDeveloperTools property value. Indicates whether or not to block developer tools in the Edge browser.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockDeveloperTools() {
        return this.backingStore.get("edgeBlockDeveloperTools");
    }
    /**
     * Gets the edgeBlocked property value. Indicates whether or not to Block the user from using the Edge browser.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlocked() {
        return this.backingStore.get("edgeBlocked");
    }
    /**
     * Gets the edgeBlockEditFavorites property value. Indicates whether or not to Block the user from making changes to Favorites.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockEditFavorites() {
        return this.backingStore.get("edgeBlockEditFavorites");
    }
    /**
     * Gets the edgeBlockExtensions property value. Indicates whether or not to block extensions in the Edge browser.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockExtensions() {
        return this.backingStore.get("edgeBlockExtensions");
    }
    /**
     * Gets the edgeBlockFullScreenMode property value. Allow or prevent Edge from entering the full screen mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockFullScreenMode() {
        return this.backingStore.get("edgeBlockFullScreenMode");
    }
    /**
     * Gets the edgeBlockInPrivateBrowsing property value. Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockInPrivateBrowsing() {
        return this.backingStore.get("edgeBlockInPrivateBrowsing");
    }
    /**
     * Gets the edgeBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockJavaScript() {
        return this.backingStore.get("edgeBlockJavaScript");
    }
    /**
     * Gets the edgeBlockLiveTileDataCollection property value. Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockLiveTileDataCollection() {
        return this.backingStore.get("edgeBlockLiveTileDataCollection");
    }
    /**
     * Gets the edgeBlockPasswordManager property value. Indicates whether or not to Block password manager.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockPasswordManager() {
        return this.backingStore.get("edgeBlockPasswordManager");
    }
    /**
     * Gets the edgeBlockPopups property value. Indicates whether or not to block popups.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockPopups() {
        return this.backingStore.get("edgeBlockPopups");
    }
    /**
     * Gets the edgeBlockPrelaunch property value. Decide whether Microsoft Edge is prelaunched at Windows startup.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockPrelaunch() {
        return this.backingStore.get("edgeBlockPrelaunch");
    }
    /**
     * Gets the edgeBlockPrinting property value. Configure Edge to allow or block printing.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockPrinting() {
        return this.backingStore.get("edgeBlockPrinting");
    }
    /**
     * Gets the edgeBlockSavingHistory property value. Configure Edge to allow browsing history to be saved or to never save browsing history.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockSavingHistory() {
        return this.backingStore.get("edgeBlockSavingHistory");
    }
    /**
     * Gets the edgeBlockSearchEngineCustomization property value. Indicates whether or not to block the user from adding new search engine or changing the default search engine.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockSearchEngineCustomization() {
        return this.backingStore.get("edgeBlockSearchEngineCustomization");
    }
    /**
     * Gets the edgeBlockSearchSuggestions property value. Indicates whether or not to block the user from using the search suggestions in the address bar.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockSearchSuggestions() {
        return this.backingStore.get("edgeBlockSearchSuggestions");
    }
    /**
     * Gets the edgeBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockSendingDoNotTrackHeader() {
        return this.backingStore.get("edgeBlockSendingDoNotTrackHeader");
    }
    /**
     * Gets the edgeBlockSendingIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockSendingIntranetTrafficToInternetExplorer() {
        return this.backingStore.get("edgeBlockSendingIntranetTrafficToInternetExplorer");
    }
    /**
     * Gets the edgeBlockSideloadingExtensions property value. Indicates whether the user can sideload extensions.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockSideloadingExtensions() {
        return this.backingStore.get("edgeBlockSideloadingExtensions");
    }
    /**
     * Gets the edgeBlockTabPreloading property value. Configure whether Edge preloads the new tab page at Windows startup.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockTabPreloading() {
        return this.backingStore.get("edgeBlockTabPreloading");
    }
    /**
     * Gets the edgeBlockWebContentOnNewTabPage property value. Configure to load a blank page in Edge instead of the default New tab page and prevent users from changing it.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeBlockWebContentOnNewTabPage() {
        return this.backingStore.get("edgeBlockWebContentOnNewTabPage");
    }
    /**
     * Gets the edgeClearBrowsingDataOnExit property value. Clear browsing data on exiting Microsoft Edge.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeClearBrowsingDataOnExit() {
        return this.backingStore.get("edgeClearBrowsingDataOnExit");
    }
    /**
     * Gets the edgeCookiePolicy property value. Possible values to specify which cookies are allowed in Microsoft Edge.
     * @return a EdgeCookiePolicy
     */
    @jakarta.annotation.Nullable
    public EdgeCookiePolicy getEdgeCookiePolicy() {
        return this.backingStore.get("edgeCookiePolicy");
    }
    /**
     * Gets the edgeDisableFirstRunPage property value. Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeDisableFirstRunPage() {
        return this.backingStore.get("edgeDisableFirstRunPage");
    }
    /**
     * Gets the edgeEnterpriseModeSiteListLocation property value. Indicates the enterprise mode site list location. Could be a local file, local network or http location.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEdgeEnterpriseModeSiteListLocation() {
        return this.backingStore.get("edgeEnterpriseModeSiteListLocation");
    }
    /**
     * Gets the edgeFavoritesBarVisibility property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @jakarta.annotation.Nullable
    public VisibilitySetting getEdgeFavoritesBarVisibility() {
        return this.backingStore.get("edgeFavoritesBarVisibility");
    }
    /**
     * Gets the edgeFavoritesListLocation property value. The location of the favorites list to provision. Could be a local file, local network or http location.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEdgeFavoritesListLocation() {
        return this.backingStore.get("edgeFavoritesListLocation");
    }
    /**
     * Gets the edgeFirstRunUrl property value. The first run URL for when Edge browser is opened for the first time.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEdgeFirstRunUrl() {
        return this.backingStore.get("edgeFirstRunUrl");
    }
    /**
     * Gets the edgeHomeButtonConfiguration property value. Causes the Home button to either hide, load the default Start page, load a New tab page, or a custom URL
     * @return a EdgeHomeButtonConfiguration
     */
    @jakarta.annotation.Nullable
    public EdgeHomeButtonConfiguration getEdgeHomeButtonConfiguration() {
        return this.backingStore.get("edgeHomeButtonConfiguration");
    }
    /**
     * Gets the edgeHomeButtonConfigurationEnabled property value. Enable the Home button configuration.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeHomeButtonConfigurationEnabled() {
        return this.backingStore.get("edgeHomeButtonConfigurationEnabled");
    }
    /**
     * Gets the edgeHomepageUrls property value. The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEdgeHomepageUrls() {
        return this.backingStore.get("edgeHomepageUrls");
    }
    /**
     * Gets the edgeKioskModeRestriction property value. Specify how the Microsoft Edge settings are restricted based on kiosk mode.
     * @return a EdgeKioskModeRestrictionType
     */
    @jakarta.annotation.Nullable
    public EdgeKioskModeRestrictionType getEdgeKioskModeRestriction() {
        return this.backingStore.get("edgeKioskModeRestriction");
    }
    /**
     * Gets the edgeKioskResetAfterIdleTimeInMinutes property value. Specifies the time in minutes from the last user activity before Microsoft Edge kiosk resets.  Valid values are 0-1440. The default is 5. 0 indicates no reset. Valid values 0 to 1440
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEdgeKioskResetAfterIdleTimeInMinutes() {
        return this.backingStore.get("edgeKioskResetAfterIdleTimeInMinutes");
    }
    /**
     * Gets the edgeNewTabPageURL property value. Specify the page opened when new tabs are created.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEdgeNewTabPageURL() {
        return this.backingStore.get("edgeNewTabPageURL");
    }
    /**
     * Gets the edgeOpensWith property value. Possible values for the EdgeOpensWith setting.
     * @return a EdgeOpenOptions
     */
    @jakarta.annotation.Nullable
    public EdgeOpenOptions getEdgeOpensWith() {
        return this.backingStore.get("edgeOpensWith");
    }
    /**
     * Gets the edgePreventCertificateErrorOverride property value. Allow or prevent users from overriding certificate errors.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgePreventCertificateErrorOverride() {
        return this.backingStore.get("edgePreventCertificateErrorOverride");
    }
    /**
     * Gets the edgeRequiredExtensionPackageFamilyNames property value. Specify the list of package family names of browser extensions that are required and cannot be turned off by the user.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEdgeRequiredExtensionPackageFamilyNames() {
        return this.backingStore.get("edgeRequiredExtensionPackageFamilyNames");
    }
    /**
     * Gets the edgeRequireSmartScreen property value. Indicates whether or not to Require the user to use the smart screen filter.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeRequireSmartScreen() {
        return this.backingStore.get("edgeRequireSmartScreen");
    }
    /**
     * Gets the edgeSearchEngine property value. Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set.
     * @return a EdgeSearchEngineBase
     */
    @jakarta.annotation.Nullable
    public EdgeSearchEngineBase getEdgeSearchEngine() {
        return this.backingStore.get("edgeSearchEngine");
    }
    /**
     * Gets the edgeSendIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeSendIntranetTrafficToInternetExplorer() {
        return this.backingStore.get("edgeSendIntranetTrafficToInternetExplorer");
    }
    /**
     * Gets the edgeShowMessageWhenOpeningInternetExplorerSites property value. What message will be displayed by Edge before switching to Internet Explorer.
     * @return a InternetExplorerMessageSetting
     */
    @jakarta.annotation.Nullable
    public InternetExplorerMessageSetting getEdgeShowMessageWhenOpeningInternetExplorerSites() {
        return this.backingStore.get("edgeShowMessageWhenOpeningInternetExplorerSites");
    }
    /**
     * Gets the edgeSyncFavoritesWithInternetExplorer property value. Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEdgeSyncFavoritesWithInternetExplorer() {
        return this.backingStore.get("edgeSyncFavoritesWithInternetExplorer");
    }
    /**
     * Gets the edgeTelemetryForMicrosoft365Analytics property value. Type of browsing data sent to Microsoft 365 analytics
     * @return a EdgeTelemetryMode
     */
    @jakarta.annotation.Nullable
    public EdgeTelemetryMode getEdgeTelemetryForMicrosoft365Analytics() {
        return this.backingStore.get("edgeTelemetryForMicrosoft365Analytics");
    }
    /**
     * Gets the enableAutomaticRedeployment property value. Allow users with administrative rights to delete all user data and settings using CTRL + Win + R at the device lock screen so that the device can be automatically re-configured and re-enrolled into management.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableAutomaticRedeployment() {
        return this.backingStore.get("enableAutomaticRedeployment");
    }
    /**
     * Gets the energySaverOnBatteryThresholdPercentage property value. This setting allows you to specify battery charge level at which Energy Saver is turned on. While on battery, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEnergySaverOnBatteryThresholdPercentage() {
        return this.backingStore.get("energySaverOnBatteryThresholdPercentage");
    }
    /**
     * Gets the energySaverPluggedInThresholdPercentage property value. This setting allows you to specify battery charge level at which Energy Saver is turned on. While plugged in, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEnergySaverPluggedInThresholdPercentage() {
        return this.backingStore.get("energySaverPluggedInThresholdPercentage");
    }
    /**
     * Gets the enterpriseCloudPrintDiscoveryEndPoint property value. Endpoint for discovering cloud printers.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEnterpriseCloudPrintDiscoveryEndPoint() {
        return this.backingStore.get("enterpriseCloudPrintDiscoveryEndPoint");
    }
    /**
     * Gets the enterpriseCloudPrintDiscoveryMaxLimit property value. Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEnterpriseCloudPrintDiscoveryMaxLimit() {
        return this.backingStore.get("enterpriseCloudPrintDiscoveryMaxLimit");
    }
    /**
     * Gets the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property value. OAuth resource URI for printer discovery service as configured in Azure portal.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier() {
        return this.backingStore.get("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier");
    }
    /**
     * Gets the enterpriseCloudPrintOAuthAuthority property value. Authentication endpoint for acquiring OAuth tokens.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEnterpriseCloudPrintOAuthAuthority() {
        return this.backingStore.get("enterpriseCloudPrintOAuthAuthority");
    }
    /**
     * Gets the enterpriseCloudPrintOAuthClientIdentifier property value. GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEnterpriseCloudPrintOAuthClientIdentifier() {
        return this.backingStore.get("enterpriseCloudPrintOAuthClientIdentifier");
    }
    /**
     * Gets the enterpriseCloudPrintResourceIdentifier property value. OAuth resource URI for print service as configured in the Azure portal.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEnterpriseCloudPrintResourceIdentifier() {
        return this.backingStore.get("enterpriseCloudPrintResourceIdentifier");
    }
    /**
     * Gets the experienceBlockDeviceDiscovery property value. Indicates whether or not to enable device discovery UX.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getExperienceBlockDeviceDiscovery() {
        return this.backingStore.get("experienceBlockDeviceDiscovery");
    }
    /**
     * Gets the experienceBlockErrorDialogWhenNoSIM property value. Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getExperienceBlockErrorDialogWhenNoSIM() {
        return this.backingStore.get("experienceBlockErrorDialogWhenNoSIM");
    }
    /**
     * Gets the experienceBlockTaskSwitcher property value. Indicates whether or not to enable task switching on the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getExperienceBlockTaskSwitcher() {
        return this.backingStore.get("experienceBlockTaskSwitcher");
    }
    /**
     * Gets the experienceDoNotSyncBrowserSettings property value. Allow(Not Configured) or prevent(Block) the syncing of Microsoft Edge Browser settings. Option to prevent syncing across devices, but allow user override.
     * @return a BrowserSyncSetting
     */
    @jakarta.annotation.Nullable
    public BrowserSyncSetting getExperienceDoNotSyncBrowserSettings() {
        return this.backingStore.get("experienceDoNotSyncBrowserSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountsBlockAddingNonMicrosoftAccountEmail", (n) -> { this.setAccountsBlockAddingNonMicrosoftAccountEmail(n.getBooleanValue()); });
        deserializerMap.put("activateAppsWithVoice", (n) -> { this.setActivateAppsWithVoice(n.getEnumValue(Enablement::forValue)); });
        deserializerMap.put("antiTheftModeBlocked", (n) -> { this.setAntiTheftModeBlocked(n.getBooleanValue()); });
        deserializerMap.put("appManagementMSIAllowUserControlOverInstall", (n) -> { this.setAppManagementMSIAllowUserControlOverInstall(n.getBooleanValue()); });
        deserializerMap.put("appManagementMSIAlwaysInstallWithElevatedPrivileges", (n) -> { this.setAppManagementMSIAlwaysInstallWithElevatedPrivileges(n.getBooleanValue()); });
        deserializerMap.put("appManagementPackageFamilyNamesToLaunchAfterLogOn", (n) -> { this.setAppManagementPackageFamilyNamesToLaunchAfterLogOn(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("appsAllowTrustedAppsSideloading", (n) -> { this.setAppsAllowTrustedAppsSideloading(n.getEnumValue(StateManagementSetting::forValue)); });
        deserializerMap.put("appsBlockWindowsStoreOriginatedApps", (n) -> { this.setAppsBlockWindowsStoreOriginatedApps(n.getBooleanValue()); });
        deserializerMap.put("authenticationAllowSecondaryDevice", (n) -> { this.setAuthenticationAllowSecondaryDevice(n.getBooleanValue()); });
        deserializerMap.put("authenticationPreferredAzureADTenantDomainName", (n) -> { this.setAuthenticationPreferredAzureADTenantDomainName(n.getStringValue()); });
        deserializerMap.put("authenticationWebSignIn", (n) -> { this.setAuthenticationWebSignIn(n.getEnumValue(Enablement::forValue)); });
        deserializerMap.put("bluetoothAllowedServices", (n) -> { this.setBluetoothAllowedServices(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("bluetoothBlockAdvertising", (n) -> { this.setBluetoothBlockAdvertising(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlockDiscoverableMode", (n) -> { this.setBluetoothBlockDiscoverableMode(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlocked", (n) -> { this.setBluetoothBlocked(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlockPrePairing", (n) -> { this.setBluetoothBlockPrePairing(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlockPromptedProximalConnections", (n) -> { this.setBluetoothBlockPromptedProximalConnections(n.getBooleanValue()); });
        deserializerMap.put("cameraBlocked", (n) -> { this.setCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockDataWhenRoaming", (n) -> { this.setCellularBlockDataWhenRoaming(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockVpn", (n) -> { this.setCellularBlockVpn(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockVpnWhenRoaming", (n) -> { this.setCellularBlockVpnWhenRoaming(n.getBooleanValue()); });
        deserializerMap.put("cellularData", (n) -> { this.setCellularData(n.getEnumValue(ConfigurationUsage::forValue)); });
        deserializerMap.put("certificatesBlockManualRootCertificateInstallation", (n) -> { this.setCertificatesBlockManualRootCertificateInstallation(n.getBooleanValue()); });
        deserializerMap.put("configureTimeZone", (n) -> { this.setConfigureTimeZone(n.getStringValue()); });
        deserializerMap.put("connectedDevicesServiceBlocked", (n) -> { this.setConnectedDevicesServiceBlocked(n.getBooleanValue()); });
        deserializerMap.put("copyPasteBlocked", (n) -> { this.setCopyPasteBlocked(n.getBooleanValue()); });
        deserializerMap.put("cortanaBlocked", (n) -> { this.setCortanaBlocked(n.getBooleanValue()); });
        deserializerMap.put("cryptographyAllowFipsAlgorithmPolicy", (n) -> { this.setCryptographyAllowFipsAlgorithmPolicy(n.getBooleanValue()); });
        deserializerMap.put("dataProtectionBlockDirectMemoryAccess", (n) -> { this.setDataProtectionBlockDirectMemoryAccess(n.getBooleanValue()); });
        deserializerMap.put("defenderBlockEndUserAccess", (n) -> { this.setDefenderBlockEndUserAccess(n.getBooleanValue()); });
        deserializerMap.put("defenderBlockOnAccessProtection", (n) -> { this.setDefenderBlockOnAccessProtection(n.getBooleanValue()); });
        deserializerMap.put("defenderCloudBlockLevel", (n) -> { this.setDefenderCloudBlockLevel(n.getEnumValue(DefenderCloudBlockLevelType::forValue)); });
        deserializerMap.put("defenderCloudExtendedTimeout", (n) -> { this.setDefenderCloudExtendedTimeout(n.getIntegerValue()); });
        deserializerMap.put("defenderCloudExtendedTimeoutInSeconds", (n) -> { this.setDefenderCloudExtendedTimeoutInSeconds(n.getIntegerValue()); });
        deserializerMap.put("defenderDaysBeforeDeletingQuarantinedMalware", (n) -> { this.setDefenderDaysBeforeDeletingQuarantinedMalware(n.getIntegerValue()); });
        deserializerMap.put("defenderDetectedMalwareActions", (n) -> { this.setDefenderDetectedMalwareActions(n.getObjectValue(DefenderDetectedMalwareActions::createFromDiscriminatorValue)); });
        deserializerMap.put("defenderDisableCatchupFullScan", (n) -> { this.setDefenderDisableCatchupFullScan(n.getBooleanValue()); });
        deserializerMap.put("defenderDisableCatchupQuickScan", (n) -> { this.setDefenderDisableCatchupQuickScan(n.getBooleanValue()); });
        deserializerMap.put("defenderFileExtensionsToExclude", (n) -> { this.setDefenderFileExtensionsToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderFilesAndFoldersToExclude", (n) -> { this.setDefenderFilesAndFoldersToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderMonitorFileActivity", (n) -> { this.setDefenderMonitorFileActivity(n.getEnumValue(DefenderMonitorFileActivity::forValue)); });
        deserializerMap.put("defenderPotentiallyUnwantedAppAction", (n) -> { this.setDefenderPotentiallyUnwantedAppAction(n.getEnumValue(DefenderPotentiallyUnwantedAppAction::forValue)); });
        deserializerMap.put("defenderPotentiallyUnwantedAppActionSetting", (n) -> { this.setDefenderPotentiallyUnwantedAppActionSetting(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderProcessesToExclude", (n) -> { this.setDefenderProcessesToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderPromptForSampleSubmission", (n) -> { this.setDefenderPromptForSampleSubmission(n.getEnumValue(DefenderPromptForSampleSubmission::forValue)); });
        deserializerMap.put("defenderRequireBehaviorMonitoring", (n) -> { this.setDefenderRequireBehaviorMonitoring(n.getBooleanValue()); });
        deserializerMap.put("defenderRequireCloudProtection", (n) -> { this.setDefenderRequireCloudProtection(n.getBooleanValue()); });
        deserializerMap.put("defenderRequireNetworkInspectionSystem", (n) -> { this.setDefenderRequireNetworkInspectionSystem(n.getBooleanValue()); });
        deserializerMap.put("defenderRequireRealTimeMonitoring", (n) -> { this.setDefenderRequireRealTimeMonitoring(n.getBooleanValue()); });
        deserializerMap.put("defenderScanArchiveFiles", (n) -> { this.setDefenderScanArchiveFiles(n.getBooleanValue()); });
        deserializerMap.put("defenderScanDownloads", (n) -> { this.setDefenderScanDownloads(n.getBooleanValue()); });
        deserializerMap.put("defenderScanIncomingMail", (n) -> { this.setDefenderScanIncomingMail(n.getBooleanValue()); });
        deserializerMap.put("defenderScanMappedNetworkDrivesDuringFullScan", (n) -> { this.setDefenderScanMappedNetworkDrivesDuringFullScan(n.getBooleanValue()); });
        deserializerMap.put("defenderScanMaxCpu", (n) -> { this.setDefenderScanMaxCpu(n.getIntegerValue()); });
        deserializerMap.put("defenderScanNetworkFiles", (n) -> { this.setDefenderScanNetworkFiles(n.getBooleanValue()); });
        deserializerMap.put("defenderScanRemovableDrivesDuringFullScan", (n) -> { this.setDefenderScanRemovableDrivesDuringFullScan(n.getBooleanValue()); });
        deserializerMap.put("defenderScanScriptsLoadedInInternetExplorer", (n) -> { this.setDefenderScanScriptsLoadedInInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("defenderScanType", (n) -> { this.setDefenderScanType(n.getEnumValue(DefenderScanType::forValue)); });
        deserializerMap.put("defenderScheduledQuickScanTime", (n) -> { this.setDefenderScheduledQuickScanTime(n.getLocalTimeValue()); });
        deserializerMap.put("defenderScheduledScanTime", (n) -> { this.setDefenderScheduledScanTime(n.getLocalTimeValue()); });
        deserializerMap.put("defenderScheduleScanEnableLowCpuPriority", (n) -> { this.setDefenderScheduleScanEnableLowCpuPriority(n.getBooleanValue()); });
        deserializerMap.put("defenderSignatureUpdateIntervalInHours", (n) -> { this.setDefenderSignatureUpdateIntervalInHours(n.getIntegerValue()); });
        deserializerMap.put("defenderSubmitSamplesConsentType", (n) -> { this.setDefenderSubmitSamplesConsentType(n.getEnumValue(DefenderSubmitSamplesConsentType::forValue)); });
        deserializerMap.put("defenderSystemScanSchedule", (n) -> { this.setDefenderSystemScanSchedule(n.getEnumValue(WeeklySchedule::forValue)); });
        deserializerMap.put("developerUnlockSetting", (n) -> { this.setDeveloperUnlockSetting(n.getEnumValue(StateManagementSetting::forValue)); });
        deserializerMap.put("deviceManagementBlockFactoryResetOnMobile", (n) -> { this.setDeviceManagementBlockFactoryResetOnMobile(n.getBooleanValue()); });
        deserializerMap.put("deviceManagementBlockManualUnenroll", (n) -> { this.setDeviceManagementBlockManualUnenroll(n.getBooleanValue()); });
        deserializerMap.put("diagnosticsDataSubmissionMode", (n) -> { this.setDiagnosticsDataSubmissionMode(n.getEnumValue(DiagnosticDataSubmissionMode::forValue)); });
        deserializerMap.put("displayAppListWithGdiDPIScalingTurnedOff", (n) -> { this.setDisplayAppListWithGdiDPIScalingTurnedOff(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("displayAppListWithGdiDPIScalingTurnedOn", (n) -> { this.setDisplayAppListWithGdiDPIScalingTurnedOn(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("edgeAllowStartPagesModification", (n) -> { this.setEdgeAllowStartPagesModification(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockAccessToAboutFlags", (n) -> { this.setEdgeBlockAccessToAboutFlags(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockAddressBarDropdown", (n) -> { this.setEdgeBlockAddressBarDropdown(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockAutofill", (n) -> { this.setEdgeBlockAutofill(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockCompatibilityList", (n) -> { this.setEdgeBlockCompatibilityList(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockDeveloperTools", (n) -> { this.setEdgeBlockDeveloperTools(n.getBooleanValue()); });
        deserializerMap.put("edgeBlocked", (n) -> { this.setEdgeBlocked(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockEditFavorites", (n) -> { this.setEdgeBlockEditFavorites(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockExtensions", (n) -> { this.setEdgeBlockExtensions(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockFullScreenMode", (n) -> { this.setEdgeBlockFullScreenMode(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockInPrivateBrowsing", (n) -> { this.setEdgeBlockInPrivateBrowsing(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockJavaScript", (n) -> { this.setEdgeBlockJavaScript(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockLiveTileDataCollection", (n) -> { this.setEdgeBlockLiveTileDataCollection(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockPasswordManager", (n) -> { this.setEdgeBlockPasswordManager(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockPopups", (n) -> { this.setEdgeBlockPopups(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockPrelaunch", (n) -> { this.setEdgeBlockPrelaunch(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockPrinting", (n) -> { this.setEdgeBlockPrinting(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockSavingHistory", (n) -> { this.setEdgeBlockSavingHistory(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockSearchEngineCustomization", (n) -> { this.setEdgeBlockSearchEngineCustomization(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockSearchSuggestions", (n) -> { this.setEdgeBlockSearchSuggestions(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockSendingDoNotTrackHeader", (n) -> { this.setEdgeBlockSendingDoNotTrackHeader(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockSendingIntranetTrafficToInternetExplorer", (n) -> { this.setEdgeBlockSendingIntranetTrafficToInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockSideloadingExtensions", (n) -> { this.setEdgeBlockSideloadingExtensions(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockTabPreloading", (n) -> { this.setEdgeBlockTabPreloading(n.getBooleanValue()); });
        deserializerMap.put("edgeBlockWebContentOnNewTabPage", (n) -> { this.setEdgeBlockWebContentOnNewTabPage(n.getBooleanValue()); });
        deserializerMap.put("edgeClearBrowsingDataOnExit", (n) -> { this.setEdgeClearBrowsingDataOnExit(n.getBooleanValue()); });
        deserializerMap.put("edgeCookiePolicy", (n) -> { this.setEdgeCookiePolicy(n.getEnumValue(EdgeCookiePolicy::forValue)); });
        deserializerMap.put("edgeDisableFirstRunPage", (n) -> { this.setEdgeDisableFirstRunPage(n.getBooleanValue()); });
        deserializerMap.put("edgeEnterpriseModeSiteListLocation", (n) -> { this.setEdgeEnterpriseModeSiteListLocation(n.getStringValue()); });
        deserializerMap.put("edgeFavoritesBarVisibility", (n) -> { this.setEdgeFavoritesBarVisibility(n.getEnumValue(VisibilitySetting::forValue)); });
        deserializerMap.put("edgeFavoritesListLocation", (n) -> { this.setEdgeFavoritesListLocation(n.getStringValue()); });
        deserializerMap.put("edgeFirstRunUrl", (n) -> { this.setEdgeFirstRunUrl(n.getStringValue()); });
        deserializerMap.put("edgeHomeButtonConfiguration", (n) -> { this.setEdgeHomeButtonConfiguration(n.getObjectValue(EdgeHomeButtonConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("edgeHomeButtonConfigurationEnabled", (n) -> { this.setEdgeHomeButtonConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("edgeHomepageUrls", (n) -> { this.setEdgeHomepageUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("edgeKioskModeRestriction", (n) -> { this.setEdgeKioskModeRestriction(n.getEnumValue(EdgeKioskModeRestrictionType::forValue)); });
        deserializerMap.put("edgeKioskResetAfterIdleTimeInMinutes", (n) -> { this.setEdgeKioskResetAfterIdleTimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("edgeNewTabPageURL", (n) -> { this.setEdgeNewTabPageURL(n.getStringValue()); });
        deserializerMap.put("edgeOpensWith", (n) -> { this.setEdgeOpensWith(n.getEnumValue(EdgeOpenOptions::forValue)); });
        deserializerMap.put("edgePreventCertificateErrorOverride", (n) -> { this.setEdgePreventCertificateErrorOverride(n.getBooleanValue()); });
        deserializerMap.put("edgeRequiredExtensionPackageFamilyNames", (n) -> { this.setEdgeRequiredExtensionPackageFamilyNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("edgeRequireSmartScreen", (n) -> { this.setEdgeRequireSmartScreen(n.getBooleanValue()); });
        deserializerMap.put("edgeSearchEngine", (n) -> { this.setEdgeSearchEngine(n.getObjectValue(EdgeSearchEngineBase::createFromDiscriminatorValue)); });
        deserializerMap.put("edgeSendIntranetTrafficToInternetExplorer", (n) -> { this.setEdgeSendIntranetTrafficToInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("edgeShowMessageWhenOpeningInternetExplorerSites", (n) -> { this.setEdgeShowMessageWhenOpeningInternetExplorerSites(n.getEnumValue(InternetExplorerMessageSetting::forValue)); });
        deserializerMap.put("edgeSyncFavoritesWithInternetExplorer", (n) -> { this.setEdgeSyncFavoritesWithInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("edgeTelemetryForMicrosoft365Analytics", (n) -> { this.setEdgeTelemetryForMicrosoft365Analytics(n.getEnumValue(EdgeTelemetryMode::forValue)); });
        deserializerMap.put("enableAutomaticRedeployment", (n) -> { this.setEnableAutomaticRedeployment(n.getBooleanValue()); });
        deserializerMap.put("energySaverOnBatteryThresholdPercentage", (n) -> { this.setEnergySaverOnBatteryThresholdPercentage(n.getIntegerValue()); });
        deserializerMap.put("energySaverPluggedInThresholdPercentage", (n) -> { this.setEnergySaverPluggedInThresholdPercentage(n.getIntegerValue()); });
        deserializerMap.put("enterpriseCloudPrintDiscoveryEndPoint", (n) -> { this.setEnterpriseCloudPrintDiscoveryEndPoint(n.getStringValue()); });
        deserializerMap.put("enterpriseCloudPrintDiscoveryMaxLimit", (n) -> { this.setEnterpriseCloudPrintDiscoveryMaxLimit(n.getIntegerValue()); });
        deserializerMap.put("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier", (n) -> { this.setEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier(n.getStringValue()); });
        deserializerMap.put("enterpriseCloudPrintOAuthAuthority", (n) -> { this.setEnterpriseCloudPrintOAuthAuthority(n.getStringValue()); });
        deserializerMap.put("enterpriseCloudPrintOAuthClientIdentifier", (n) -> { this.setEnterpriseCloudPrintOAuthClientIdentifier(n.getStringValue()); });
        deserializerMap.put("enterpriseCloudPrintResourceIdentifier", (n) -> { this.setEnterpriseCloudPrintResourceIdentifier(n.getStringValue()); });
        deserializerMap.put("experienceBlockDeviceDiscovery", (n) -> { this.setExperienceBlockDeviceDiscovery(n.getBooleanValue()); });
        deserializerMap.put("experienceBlockErrorDialogWhenNoSIM", (n) -> { this.setExperienceBlockErrorDialogWhenNoSIM(n.getBooleanValue()); });
        deserializerMap.put("experienceBlockTaskSwitcher", (n) -> { this.setExperienceBlockTaskSwitcher(n.getBooleanValue()); });
        deserializerMap.put("experienceDoNotSyncBrowserSettings", (n) -> { this.setExperienceDoNotSyncBrowserSettings(n.getEnumValue(BrowserSyncSetting::forValue)); });
        deserializerMap.put("findMyFiles", (n) -> { this.setFindMyFiles(n.getEnumValue(Enablement::forValue)); });
        deserializerMap.put("gameDvrBlocked", (n) -> { this.setGameDvrBlocked(n.getBooleanValue()); });
        deserializerMap.put("inkWorkspaceAccess", (n) -> { this.setInkWorkspaceAccess(n.getEnumValue(InkAccessSetting::forValue)); });
        deserializerMap.put("inkWorkspaceAccessState", (n) -> { this.setInkWorkspaceAccessState(n.getEnumValue(StateManagementSetting::forValue)); });
        deserializerMap.put("inkWorkspaceBlockSuggestedApps", (n) -> { this.setInkWorkspaceBlockSuggestedApps(n.getBooleanValue()); });
        deserializerMap.put("internetSharingBlocked", (n) -> { this.setInternetSharingBlocked(n.getBooleanValue()); });
        deserializerMap.put("locationServicesBlocked", (n) -> { this.setLocationServicesBlocked(n.getBooleanValue()); });
        deserializerMap.put("lockScreenActivateAppsWithVoice", (n) -> { this.setLockScreenActivateAppsWithVoice(n.getEnumValue(Enablement::forValue)); });
        deserializerMap.put("lockScreenAllowTimeoutConfiguration", (n) -> { this.setLockScreenAllowTimeoutConfiguration(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockActionCenterNotifications", (n) -> { this.setLockScreenBlockActionCenterNotifications(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockCortana", (n) -> { this.setLockScreenBlockCortana(n.getBooleanValue()); });
        deserializerMap.put("lockScreenBlockToastNotifications", (n) -> { this.setLockScreenBlockToastNotifications(n.getBooleanValue()); });
        deserializerMap.put("lockScreenTimeoutInSeconds", (n) -> { this.setLockScreenTimeoutInSeconds(n.getIntegerValue()); });
        deserializerMap.put("logonBlockFastUserSwitching", (n) -> { this.setLogonBlockFastUserSwitching(n.getBooleanValue()); });
        deserializerMap.put("messagingBlockMMS", (n) -> { this.setMessagingBlockMMS(n.getBooleanValue()); });
        deserializerMap.put("messagingBlockRichCommunicationServices", (n) -> { this.setMessagingBlockRichCommunicationServices(n.getBooleanValue()); });
        deserializerMap.put("messagingBlockSync", (n) -> { this.setMessagingBlockSync(n.getBooleanValue()); });
        deserializerMap.put("microsoftAccountBlocked", (n) -> { this.setMicrosoftAccountBlocked(n.getBooleanValue()); });
        deserializerMap.put("microsoftAccountBlockSettingsSync", (n) -> { this.setMicrosoftAccountBlockSettingsSync(n.getBooleanValue()); });
        deserializerMap.put("microsoftAccountSignInAssistantSettings", (n) -> { this.setMicrosoftAccountSignInAssistantSettings(n.getEnumValue(SignInAssistantOptions::forValue)); });
        deserializerMap.put("networkProxyApplySettingsDeviceWide", (n) -> { this.setNetworkProxyApplySettingsDeviceWide(n.getBooleanValue()); });
        deserializerMap.put("networkProxyAutomaticConfigurationUrl", (n) -> { this.setNetworkProxyAutomaticConfigurationUrl(n.getStringValue()); });
        deserializerMap.put("networkProxyDisableAutoDetect", (n) -> { this.setNetworkProxyDisableAutoDetect(n.getBooleanValue()); });
        deserializerMap.put("networkProxyServer", (n) -> { this.setNetworkProxyServer(n.getObjectValue(Windows10NetworkProxyServer::createFromDiscriminatorValue)); });
        deserializerMap.put("nfcBlocked", (n) -> { this.setNfcBlocked(n.getBooleanValue()); });
        deserializerMap.put("oneDriveDisableFileSync", (n) -> { this.setOneDriveDisableFileSync(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockSimple", (n) -> { this.setPasswordBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumAgeInDays", (n) -> { this.setPasswordMinimumAgeInDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumCharacterSetCount", (n) -> { this.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequired", (n) -> { this.setPasswordRequired(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType::forValue)); });
        deserializerMap.put("passwordRequireWhenResumeFromIdleState", (n) -> { this.setPasswordRequireWhenResumeFromIdleState(n.getBooleanValue()); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { this.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("personalizationDesktopImageUrl", (n) -> { this.setPersonalizationDesktopImageUrl(n.getStringValue()); });
        deserializerMap.put("personalizationLockScreenImageUrl", (n) -> { this.setPersonalizationLockScreenImageUrl(n.getStringValue()); });
        deserializerMap.put("powerButtonActionOnBattery", (n) -> { this.setPowerButtonActionOnBattery(n.getEnumValue(PowerActionType::forValue)); });
        deserializerMap.put("powerButtonActionPluggedIn", (n) -> { this.setPowerButtonActionPluggedIn(n.getEnumValue(PowerActionType::forValue)); });
        deserializerMap.put("powerHybridSleepOnBattery", (n) -> { this.setPowerHybridSleepOnBattery(n.getEnumValue(Enablement::forValue)); });
        deserializerMap.put("powerHybridSleepPluggedIn", (n) -> { this.setPowerHybridSleepPluggedIn(n.getEnumValue(Enablement::forValue)); });
        deserializerMap.put("powerLidCloseActionOnBattery", (n) -> { this.setPowerLidCloseActionOnBattery(n.getEnumValue(PowerActionType::forValue)); });
        deserializerMap.put("powerLidCloseActionPluggedIn", (n) -> { this.setPowerLidCloseActionPluggedIn(n.getEnumValue(PowerActionType::forValue)); });
        deserializerMap.put("powerSleepButtonActionOnBattery", (n) -> { this.setPowerSleepButtonActionOnBattery(n.getEnumValue(PowerActionType::forValue)); });
        deserializerMap.put("powerSleepButtonActionPluggedIn", (n) -> { this.setPowerSleepButtonActionPluggedIn(n.getEnumValue(PowerActionType::forValue)); });
        deserializerMap.put("printerBlockAddition", (n) -> { this.setPrinterBlockAddition(n.getBooleanValue()); });
        deserializerMap.put("printerDefaultName", (n) -> { this.setPrinterDefaultName(n.getStringValue()); });
        deserializerMap.put("printerNames", (n) -> { this.setPrinterNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("privacyAccessControls", (n) -> { this.setPrivacyAccessControls(n.getCollectionOfObjectValues(WindowsPrivacyDataAccessControlItem::createFromDiscriminatorValue)); });
        deserializerMap.put("privacyAdvertisingId", (n) -> { this.setPrivacyAdvertisingId(n.getEnumValue(StateManagementSetting::forValue)); });
        deserializerMap.put("privacyAutoAcceptPairingAndConsentPrompts", (n) -> { this.setPrivacyAutoAcceptPairingAndConsentPrompts(n.getBooleanValue()); });
        deserializerMap.put("privacyBlockActivityFeed", (n) -> { this.setPrivacyBlockActivityFeed(n.getBooleanValue()); });
        deserializerMap.put("privacyBlockInputPersonalization", (n) -> { this.setPrivacyBlockInputPersonalization(n.getBooleanValue()); });
        deserializerMap.put("privacyBlockPublishUserActivities", (n) -> { this.setPrivacyBlockPublishUserActivities(n.getBooleanValue()); });
        deserializerMap.put("privacyDisableLaunchExperience", (n) -> { this.setPrivacyDisableLaunchExperience(n.getBooleanValue()); });
        deserializerMap.put("resetProtectionModeBlocked", (n) -> { this.setResetProtectionModeBlocked(n.getBooleanValue()); });
        deserializerMap.put("safeSearchFilter", (n) -> { this.setSafeSearchFilter(n.getEnumValue(SafeSearchFilterType::forValue)); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { this.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("searchBlockDiacritics", (n) -> { this.setSearchBlockDiacritics(n.getBooleanValue()); });
        deserializerMap.put("searchBlockWebResults", (n) -> { this.setSearchBlockWebResults(n.getBooleanValue()); });
        deserializerMap.put("searchDisableAutoLanguageDetection", (n) -> { this.setSearchDisableAutoLanguageDetection(n.getBooleanValue()); });
        deserializerMap.put("searchDisableIndexerBackoff", (n) -> { this.setSearchDisableIndexerBackoff(n.getBooleanValue()); });
        deserializerMap.put("searchDisableIndexingEncryptedItems", (n) -> { this.setSearchDisableIndexingEncryptedItems(n.getBooleanValue()); });
        deserializerMap.put("searchDisableIndexingRemovableDrive", (n) -> { this.setSearchDisableIndexingRemovableDrive(n.getBooleanValue()); });
        deserializerMap.put("searchDisableLocation", (n) -> { this.setSearchDisableLocation(n.getBooleanValue()); });
        deserializerMap.put("searchDisableUseLocation", (n) -> { this.setSearchDisableUseLocation(n.getBooleanValue()); });
        deserializerMap.put("searchEnableAutomaticIndexSizeManangement", (n) -> { this.setSearchEnableAutomaticIndexSizeManangement(n.getBooleanValue()); });
        deserializerMap.put("searchEnableRemoteQueries", (n) -> { this.setSearchEnableRemoteQueries(n.getBooleanValue()); });
        deserializerMap.put("securityBlockAzureADJoinedDevicesAutoEncryption", (n) -> { this.setSecurityBlockAzureADJoinedDevicesAutoEncryption(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockAccountsPage", (n) -> { this.setSettingsBlockAccountsPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockAddProvisioningPackage", (n) -> { this.setSettingsBlockAddProvisioningPackage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockAppsPage", (n) -> { this.setSettingsBlockAppsPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockChangeLanguage", (n) -> { this.setSettingsBlockChangeLanguage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockChangePowerSleep", (n) -> { this.setSettingsBlockChangePowerSleep(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockChangeRegion", (n) -> { this.setSettingsBlockChangeRegion(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockChangeSystemTime", (n) -> { this.setSettingsBlockChangeSystemTime(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockDevicesPage", (n) -> { this.setSettingsBlockDevicesPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockEaseOfAccessPage", (n) -> { this.setSettingsBlockEaseOfAccessPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockEditDeviceName", (n) -> { this.setSettingsBlockEditDeviceName(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockGamingPage", (n) -> { this.setSettingsBlockGamingPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockNetworkInternetPage", (n) -> { this.setSettingsBlockNetworkInternetPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockPersonalizationPage", (n) -> { this.setSettingsBlockPersonalizationPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockPrivacyPage", (n) -> { this.setSettingsBlockPrivacyPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockRemoveProvisioningPackage", (n) -> { this.setSettingsBlockRemoveProvisioningPackage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockSettingsApp", (n) -> { this.setSettingsBlockSettingsApp(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockSystemPage", (n) -> { this.setSettingsBlockSystemPage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockTimeLanguagePage", (n) -> { this.setSettingsBlockTimeLanguagePage(n.getBooleanValue()); });
        deserializerMap.put("settingsBlockUpdateSecurityPage", (n) -> { this.setSettingsBlockUpdateSecurityPage(n.getBooleanValue()); });
        deserializerMap.put("sharedUserAppDataAllowed", (n) -> { this.setSharedUserAppDataAllowed(n.getBooleanValue()); });
        deserializerMap.put("smartScreenAppInstallControl", (n) -> { this.setSmartScreenAppInstallControl(n.getEnumValue(AppInstallControlType::forValue)); });
        deserializerMap.put("smartScreenBlockPromptOverride", (n) -> { this.setSmartScreenBlockPromptOverride(n.getBooleanValue()); });
        deserializerMap.put("smartScreenBlockPromptOverrideForFiles", (n) -> { this.setSmartScreenBlockPromptOverrideForFiles(n.getBooleanValue()); });
        deserializerMap.put("smartScreenEnableAppInstallControl", (n) -> { this.setSmartScreenEnableAppInstallControl(n.getBooleanValue()); });
        deserializerMap.put("startBlockUnpinningAppsFromTaskbar", (n) -> { this.setStartBlockUnpinningAppsFromTaskbar(n.getBooleanValue()); });
        deserializerMap.put("startMenuAppListVisibility", (n) -> { this.setStartMenuAppListVisibility(n.getEnumSetValue(WindowsStartMenuAppListVisibilityType::forValue)); });
        deserializerMap.put("startMenuHideChangeAccountSettings", (n) -> { this.setStartMenuHideChangeAccountSettings(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideFrequentlyUsedApps", (n) -> { this.setStartMenuHideFrequentlyUsedApps(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideHibernate", (n) -> { this.setStartMenuHideHibernate(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideLock", (n) -> { this.setStartMenuHideLock(n.getBooleanValue()); });
        deserializerMap.put("startMenuHidePowerButton", (n) -> { this.setStartMenuHidePowerButton(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideRecentJumpLists", (n) -> { this.setStartMenuHideRecentJumpLists(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideRecentlyAddedApps", (n) -> { this.setStartMenuHideRecentlyAddedApps(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideRestartOptions", (n) -> { this.setStartMenuHideRestartOptions(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideShutDown", (n) -> { this.setStartMenuHideShutDown(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideSignOut", (n) -> { this.setStartMenuHideSignOut(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideSleep", (n) -> { this.setStartMenuHideSleep(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideSwitchAccount", (n) -> { this.setStartMenuHideSwitchAccount(n.getBooleanValue()); });
        deserializerMap.put("startMenuHideUserTile", (n) -> { this.setStartMenuHideUserTile(n.getBooleanValue()); });
        deserializerMap.put("startMenuLayoutEdgeAssetsXml", (n) -> { this.setStartMenuLayoutEdgeAssetsXml(n.getByteArrayValue()); });
        deserializerMap.put("startMenuLayoutXml", (n) -> { this.setStartMenuLayoutXml(n.getByteArrayValue()); });
        deserializerMap.put("startMenuMode", (n) -> { this.setStartMenuMode(n.getEnumValue(WindowsStartMenuModeType::forValue)); });
        deserializerMap.put("startMenuPinnedFolderDocuments", (n) -> { this.setStartMenuPinnedFolderDocuments(n.getEnumValue(VisibilitySetting::forValue)); });
        deserializerMap.put("startMenuPinnedFolderDownloads", (n) -> { this.setStartMenuPinnedFolderDownloads(n.getEnumValue(VisibilitySetting::forValue)); });
        deserializerMap.put("startMenuPinnedFolderFileExplorer", (n) -> { this.setStartMenuPinnedFolderFileExplorer(n.getEnumValue(VisibilitySetting::forValue)); });
        deserializerMap.put("startMenuPinnedFolderHomeGroup", (n) -> { this.setStartMenuPinnedFolderHomeGroup(n.getEnumValue(VisibilitySetting::forValue)); });
        deserializerMap.put("startMenuPinnedFolderMusic", (n) -> { this.setStartMenuPinnedFolderMusic(n.getEnumValue(VisibilitySetting::forValue)); });
        deserializerMap.put("startMenuPinnedFolderNetwork", (n) -> { this.setStartMenuPinnedFolderNetwork(n.getEnumValue(VisibilitySetting::forValue)); });
        deserializerMap.put("startMenuPinnedFolderPersonalFolder", (n) -> { this.setStartMenuPinnedFolderPersonalFolder(n.getEnumValue(VisibilitySetting::forValue)); });
        deserializerMap.put("startMenuPinnedFolderPictures", (n) -> { this.setStartMenuPinnedFolderPictures(n.getEnumValue(VisibilitySetting::forValue)); });
        deserializerMap.put("startMenuPinnedFolderSettings", (n) -> { this.setStartMenuPinnedFolderSettings(n.getEnumValue(VisibilitySetting::forValue)); });
        deserializerMap.put("startMenuPinnedFolderVideos", (n) -> { this.setStartMenuPinnedFolderVideos(n.getEnumValue(VisibilitySetting::forValue)); });
        deserializerMap.put("storageBlockRemovableStorage", (n) -> { this.setStorageBlockRemovableStorage(n.getBooleanValue()); });
        deserializerMap.put("storageRequireMobileDeviceEncryption", (n) -> { this.setStorageRequireMobileDeviceEncryption(n.getBooleanValue()); });
        deserializerMap.put("storageRestrictAppDataToSystemVolume", (n) -> { this.setStorageRestrictAppDataToSystemVolume(n.getBooleanValue()); });
        deserializerMap.put("storageRestrictAppInstallToSystemVolume", (n) -> { this.setStorageRestrictAppInstallToSystemVolume(n.getBooleanValue()); });
        deserializerMap.put("systemTelemetryProxyServer", (n) -> { this.setSystemTelemetryProxyServer(n.getStringValue()); });
        deserializerMap.put("taskManagerBlockEndTask", (n) -> { this.setTaskManagerBlockEndTask(n.getBooleanValue()); });
        deserializerMap.put("tenantLockdownRequireNetworkDuringOutOfBoxExperience", (n) -> { this.setTenantLockdownRequireNetworkDuringOutOfBoxExperience(n.getBooleanValue()); });
        deserializerMap.put("uninstallBuiltInApps", (n) -> { this.setUninstallBuiltInApps(n.getBooleanValue()); });
        deserializerMap.put("usbBlocked", (n) -> { this.setUsbBlocked(n.getBooleanValue()); });
        deserializerMap.put("voiceRecordingBlocked", (n) -> { this.setVoiceRecordingBlocked(n.getBooleanValue()); });
        deserializerMap.put("webRtcBlockLocalhostIpAddress", (n) -> { this.setWebRtcBlockLocalhostIpAddress(n.getBooleanValue()); });
        deserializerMap.put("wiFiBlockAutomaticConnectHotspots", (n) -> { this.setWiFiBlockAutomaticConnectHotspots(n.getBooleanValue()); });
        deserializerMap.put("wiFiBlocked", (n) -> { this.setWiFiBlocked(n.getBooleanValue()); });
        deserializerMap.put("wiFiBlockManualConfiguration", (n) -> { this.setWiFiBlockManualConfiguration(n.getBooleanValue()); });
        deserializerMap.put("wiFiScanInterval", (n) -> { this.setWiFiScanInterval(n.getIntegerValue()); });
        deserializerMap.put("windows10AppsForceUpdateSchedule", (n) -> { this.setWindows10AppsForceUpdateSchedule(n.getObjectValue(Windows10AppsForceUpdateSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsSpotlightBlockConsumerSpecificFeatures", (n) -> { this.setWindowsSpotlightBlockConsumerSpecificFeatures(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlocked", (n) -> { this.setWindowsSpotlightBlocked(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockOnActionCenter", (n) -> { this.setWindowsSpotlightBlockOnActionCenter(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockTailoredExperiences", (n) -> { this.setWindowsSpotlightBlockTailoredExperiences(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockThirdPartyNotifications", (n) -> { this.setWindowsSpotlightBlockThirdPartyNotifications(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockWelcomeExperience", (n) -> { this.setWindowsSpotlightBlockWelcomeExperience(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightBlockWindowsTips", (n) -> { this.setWindowsSpotlightBlockWindowsTips(n.getBooleanValue()); });
        deserializerMap.put("windowsSpotlightConfigureOnLockScreen", (n) -> { this.setWindowsSpotlightConfigureOnLockScreen(n.getEnumValue(WindowsSpotlightEnablementSettings::forValue)); });
        deserializerMap.put("windowsStoreBlockAutoUpdate", (n) -> { this.setWindowsStoreBlockAutoUpdate(n.getBooleanValue()); });
        deserializerMap.put("windowsStoreBlocked", (n) -> { this.setWindowsStoreBlocked(n.getBooleanValue()); });
        deserializerMap.put("windowsStoreEnablePrivateStoreOnly", (n) -> { this.setWindowsStoreEnablePrivateStoreOnly(n.getBooleanValue()); });
        deserializerMap.put("wirelessDisplayBlockProjectionToThisDevice", (n) -> { this.setWirelessDisplayBlockProjectionToThisDevice(n.getBooleanValue()); });
        deserializerMap.put("wirelessDisplayBlockUserInputFromReceiver", (n) -> { this.setWirelessDisplayBlockUserInputFromReceiver(n.getBooleanValue()); });
        deserializerMap.put("wirelessDisplayRequirePinForPairing", (n) -> { this.setWirelessDisplayRequirePinForPairing(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the findMyFiles property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getFindMyFiles() {
        return this.backingStore.get("findMyFiles");
    }
    /**
     * Gets the gameDvrBlocked property value. Indicates whether or not to block DVR and broadcasting.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGameDvrBlocked() {
        return this.backingStore.get("gameDvrBlocked");
    }
    /**
     * Gets the inkWorkspaceAccess property value. Values for the InkWorkspaceAccess setting.
     * @return a InkAccessSetting
     */
    @jakarta.annotation.Nullable
    public InkAccessSetting getInkWorkspaceAccess() {
        return this.backingStore.get("inkWorkspaceAccess");
    }
    /**
     * Gets the inkWorkspaceAccessState property value. State Management Setting.
     * @return a StateManagementSetting
     */
    @jakarta.annotation.Nullable
    public StateManagementSetting getInkWorkspaceAccessState() {
        return this.backingStore.get("inkWorkspaceAccessState");
    }
    /**
     * Gets the inkWorkspaceBlockSuggestedApps property value. Specify whether to show recommended app suggestions in the ink workspace.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInkWorkspaceBlockSuggestedApps() {
        return this.backingStore.get("inkWorkspaceBlockSuggestedApps");
    }
    /**
     * Gets the internetSharingBlocked property value. Indicates whether or not to Block the user from using internet sharing.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInternetSharingBlocked() {
        return this.backingStore.get("internetSharingBlocked");
    }
    /**
     * Gets the locationServicesBlocked property value. Indicates whether or not to Block the user from location services.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocationServicesBlocked() {
        return this.backingStore.get("locationServicesBlocked");
    }
    /**
     * Gets the lockScreenActivateAppsWithVoice property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getLockScreenActivateAppsWithVoice() {
        return this.backingStore.get("lockScreenActivateAppsWithVoice");
    }
    /**
     * Gets the lockScreenAllowTimeoutConfiguration property value. Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLockScreenAllowTimeoutConfiguration() {
        return this.backingStore.get("lockScreenAllowTimeoutConfiguration");
    }
    /**
     * Gets the lockScreenBlockActionCenterNotifications property value. Indicates whether or not to block action center notifications over lock screen.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLockScreenBlockActionCenterNotifications() {
        return this.backingStore.get("lockScreenBlockActionCenterNotifications");
    }
    /**
     * Gets the lockScreenBlockCortana property value. Indicates whether or not the user can interact with Cortana using speech while the system is locked.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLockScreenBlockCortana() {
        return this.backingStore.get("lockScreenBlockCortana");
    }
    /**
     * Gets the lockScreenBlockToastNotifications property value. Indicates whether to allow toast notifications above the device lock screen.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLockScreenBlockToastNotifications() {
        return this.backingStore.get("lockScreenBlockToastNotifications");
    }
    /**
     * Gets the lockScreenTimeoutInSeconds property value. Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLockScreenTimeoutInSeconds() {
        return this.backingStore.get("lockScreenTimeoutInSeconds");
    }
    /**
     * Gets the logonBlockFastUserSwitching property value. Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLogonBlockFastUserSwitching() {
        return this.backingStore.get("logonBlockFastUserSwitching");
    }
    /**
     * Gets the messagingBlockMMS property value. Indicates whether or not to block the MMS send/receive functionality on the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMessagingBlockMMS() {
        return this.backingStore.get("messagingBlockMMS");
    }
    /**
     * Gets the messagingBlockRichCommunicationServices property value. Indicates whether or not to block the RCS send/receive functionality on the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMessagingBlockRichCommunicationServices() {
        return this.backingStore.get("messagingBlockRichCommunicationServices");
    }
    /**
     * Gets the messagingBlockSync property value. Indicates whether or not to block text message back up and restore and Messaging Everywhere.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMessagingBlockSync() {
        return this.backingStore.get("messagingBlockSync");
    }
    /**
     * Gets the microsoftAccountBlocked property value. Indicates whether or not to Block a Microsoft account.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMicrosoftAccountBlocked() {
        return this.backingStore.get("microsoftAccountBlocked");
    }
    /**
     * Gets the microsoftAccountBlockSettingsSync property value. Indicates whether or not to Block Microsoft account settings sync.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMicrosoftAccountBlockSettingsSync() {
        return this.backingStore.get("microsoftAccountBlockSettingsSync");
    }
    /**
     * Gets the microsoftAccountSignInAssistantSettings property value. Values for the SignInAssistantSettings.
     * @return a SignInAssistantOptions
     */
    @jakarta.annotation.Nullable
    public SignInAssistantOptions getMicrosoftAccountSignInAssistantSettings() {
        return this.backingStore.get("microsoftAccountSignInAssistantSettings");
    }
    /**
     * Gets the networkProxyApplySettingsDeviceWide property value. If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account thats enrolled into MDM.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNetworkProxyApplySettingsDeviceWide() {
        return this.backingStore.get("networkProxyApplySettingsDeviceWide");
    }
    /**
     * Gets the networkProxyAutomaticConfigurationUrl property value. Address to the proxy auto-config (PAC) script you want to use.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNetworkProxyAutomaticConfigurationUrl() {
        return this.backingStore.get("networkProxyAutomaticConfigurationUrl");
    }
    /**
     * Gets the networkProxyDisableAutoDetect property value. Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNetworkProxyDisableAutoDetect() {
        return this.backingStore.get("networkProxyDisableAutoDetect");
    }
    /**
     * Gets the networkProxyServer property value. Specifies manual proxy server settings.
     * @return a Windows10NetworkProxyServer
     */
    @jakarta.annotation.Nullable
    public Windows10NetworkProxyServer getNetworkProxyServer() {
        return this.backingStore.get("networkProxyServer");
    }
    /**
     * Gets the nfcBlocked property value. Indicates whether or not to Block the user from using near field communication.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNfcBlocked() {
        return this.backingStore.get("nfcBlocked");
    }
    /**
     * Gets the oneDriveDisableFileSync property value. Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getOneDriveDisableFileSync() {
        return this.backingStore.get("oneDriveDisableFileSync");
    }
    /**
     * Gets the passwordBlockSimple property value. Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this.backingStore.get("passwordBlockSimple");
    }
    /**
     * Gets the passwordExpirationDays property value. The password expiration in days. Valid values 0 to 730
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.backingStore.get("passwordExpirationDays");
    }
    /**
     * Gets the passwordMinimumAgeInDays property value. This security setting determines the period of time (in days) that a password must be used before the user can change it. Valid values 0 to 998
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumAgeInDays() {
        return this.backingStore.get("passwordMinimumAgeInDays");
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this.backingStore.get("passwordMinimumCharacterSetCount");
    }
    /**
     * Gets the passwordMinimumLength property value. The minimum password length. Valid values 4 to 16
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.backingStore.get("passwordMinimumLength");
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.backingStore.get("passwordMinutesOfInactivityBeforeScreenTimeout");
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent reuse of. Valid values 0 to 50
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.backingStore.get("passwordPreviousPasswordBlockCount");
    }
    /**
     * Gets the passwordRequired property value. Indicates whether or not to require the user to have a password.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.backingStore.get("passwordRequired");
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a RequiredPasswordType
     */
    @jakarta.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this.backingStore.get("passwordRequiredType");
    }
    /**
     * Gets the passwordRequireWhenResumeFromIdleState property value. Indicates whether or not to require a password upon resuming from an idle state.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequireWhenResumeFromIdleState() {
        return this.backingStore.get("passwordRequireWhenResumeFromIdleState");
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset. Valid values 0 to 999
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this.backingStore.get("passwordSignInFailureCountBeforeFactoryReset");
    }
    /**
     * Gets the personalizationDesktopImageUrl property value. A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPersonalizationDesktopImageUrl() {
        return this.backingStore.get("personalizationDesktopImageUrl");
    }
    /**
     * Gets the personalizationLockScreenImageUrl property value. A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a file Url to a local image on the file system that needs to be used as the Lock Screen Image.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPersonalizationLockScreenImageUrl() {
        return this.backingStore.get("personalizationLockScreenImageUrl");
    }
    /**
     * Gets the powerButtonActionOnBattery property value. Power action types
     * @return a PowerActionType
     */
    @jakarta.annotation.Nullable
    public PowerActionType getPowerButtonActionOnBattery() {
        return this.backingStore.get("powerButtonActionOnBattery");
    }
    /**
     * Gets the powerButtonActionPluggedIn property value. Power action types
     * @return a PowerActionType
     */
    @jakarta.annotation.Nullable
    public PowerActionType getPowerButtonActionPluggedIn() {
        return this.backingStore.get("powerButtonActionPluggedIn");
    }
    /**
     * Gets the powerHybridSleepOnBattery property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getPowerHybridSleepOnBattery() {
        return this.backingStore.get("powerHybridSleepOnBattery");
    }
    /**
     * Gets the powerHybridSleepPluggedIn property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getPowerHybridSleepPluggedIn() {
        return this.backingStore.get("powerHybridSleepPluggedIn");
    }
    /**
     * Gets the powerLidCloseActionOnBattery property value. Power action types
     * @return a PowerActionType
     */
    @jakarta.annotation.Nullable
    public PowerActionType getPowerLidCloseActionOnBattery() {
        return this.backingStore.get("powerLidCloseActionOnBattery");
    }
    /**
     * Gets the powerLidCloseActionPluggedIn property value. Power action types
     * @return a PowerActionType
     */
    @jakarta.annotation.Nullable
    public PowerActionType getPowerLidCloseActionPluggedIn() {
        return this.backingStore.get("powerLidCloseActionPluggedIn");
    }
    /**
     * Gets the powerSleepButtonActionOnBattery property value. Power action types
     * @return a PowerActionType
     */
    @jakarta.annotation.Nullable
    public PowerActionType getPowerSleepButtonActionOnBattery() {
        return this.backingStore.get("powerSleepButtonActionOnBattery");
    }
    /**
     * Gets the powerSleepButtonActionPluggedIn property value. Power action types
     * @return a PowerActionType
     */
    @jakarta.annotation.Nullable
    public PowerActionType getPowerSleepButtonActionPluggedIn() {
        return this.backingStore.get("powerSleepButtonActionPluggedIn");
    }
    /**
     * Gets the printerBlockAddition property value. Prevent user installation of additional printers from printers settings.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPrinterBlockAddition() {
        return this.backingStore.get("printerBlockAddition");
    }
    /**
     * Gets the printerDefaultName property value. Name (network host name) of an installed printer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrinterDefaultName() {
        return this.backingStore.get("printerDefaultName");
    }
    /**
     * Gets the printerNames property value. Automatically provision printers based on their names (network host names).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPrinterNames() {
        return this.backingStore.get("printerNames");
    }
    /**
     * Gets the privacyAccessControls property value. Indicates a list of applications with their access control levels over privacy data categories, and/or the default access levels per category. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<WindowsPrivacyDataAccessControlItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsPrivacyDataAccessControlItem> getPrivacyAccessControls() {
        return this.backingStore.get("privacyAccessControls");
    }
    /**
     * Gets the privacyAdvertisingId property value. State Management Setting.
     * @return a StateManagementSetting
     */
    @jakarta.annotation.Nullable
    public StateManagementSetting getPrivacyAdvertisingId() {
        return this.backingStore.get("privacyAdvertisingId");
    }
    /**
     * Gets the privacyAutoAcceptPairingAndConsentPrompts property value. Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPrivacyAutoAcceptPairingAndConsentPrompts() {
        return this.backingStore.get("privacyAutoAcceptPairingAndConsentPrompts");
    }
    /**
     * Gets the privacyBlockActivityFeed property value. Blocks the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPrivacyBlockActivityFeed() {
        return this.backingStore.get("privacyBlockActivityFeed");
    }
    /**
     * Gets the privacyBlockInputPersonalization property value. Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPrivacyBlockInputPersonalization() {
        return this.backingStore.get("privacyBlockInputPersonalization");
    }
    /**
     * Gets the privacyBlockPublishUserActivities property value. Blocks the shared experiences/discovery of recently used resources in task switcher etc.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPrivacyBlockPublishUserActivities() {
        return this.backingStore.get("privacyBlockPublishUserActivities");
    }
    /**
     * Gets the privacyDisableLaunchExperience property value. This policy prevents the privacy experience from launching during user logon for new and upgraded users.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPrivacyDisableLaunchExperience() {
        return this.backingStore.get("privacyDisableLaunchExperience");
    }
    /**
     * Gets the resetProtectionModeBlocked property value. Indicates whether or not to Block the user from reset protection mode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getResetProtectionModeBlocked() {
        return this.backingStore.get("resetProtectionModeBlocked");
    }
    /**
     * Gets the safeSearchFilter property value. Specifies what level of safe search (filtering adult content) is required
     * @return a SafeSearchFilterType
     */
    @jakarta.annotation.Nullable
    public SafeSearchFilterType getSafeSearchFilter() {
        return this.backingStore.get("safeSearchFilter");
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to Block the user from taking Screenshots.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.backingStore.get("screenCaptureBlocked");
    }
    /**
     * Gets the searchBlockDiacritics property value. Specifies if search can use diacritics.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSearchBlockDiacritics() {
        return this.backingStore.get("searchBlockDiacritics");
    }
    /**
     * Gets the searchBlockWebResults property value. Indicates whether or not to block the web search.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSearchBlockWebResults() {
        return this.backingStore.get("searchBlockWebResults");
    }
    /**
     * Gets the searchDisableAutoLanguageDetection property value. Specifies whether to use automatic language detection when indexing content and properties.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSearchDisableAutoLanguageDetection() {
        return this.backingStore.get("searchDisableAutoLanguageDetection");
    }
    /**
     * Gets the searchDisableIndexerBackoff property value. Indicates whether or not to disable the search indexer backoff feature.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSearchDisableIndexerBackoff() {
        return this.backingStore.get("searchDisableIndexerBackoff");
    }
    /**
     * Gets the searchDisableIndexingEncryptedItems property value. Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSearchDisableIndexingEncryptedItems() {
        return this.backingStore.get("searchDisableIndexingEncryptedItems");
    }
    /**
     * Gets the searchDisableIndexingRemovableDrive property value. Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSearchDisableIndexingRemovableDrive() {
        return this.backingStore.get("searchDisableIndexingRemovableDrive");
    }
    /**
     * Gets the searchDisableLocation property value. Specifies if search can use location information.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSearchDisableLocation() {
        return this.backingStore.get("searchDisableLocation");
    }
    /**
     * Gets the searchDisableUseLocation property value. Specifies if search can use location information.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSearchDisableUseLocation() {
        return this.backingStore.get("searchDisableUseLocation");
    }
    /**
     * Gets the searchEnableAutomaticIndexSizeManangement property value. Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSearchEnableAutomaticIndexSizeManangement() {
        return this.backingStore.get("searchEnableAutomaticIndexSizeManangement");
    }
    /**
     * Gets the searchEnableRemoteQueries property value. Indicates whether or not to block remote queries of this computers index.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSearchEnableRemoteQueries() {
        return this.backingStore.get("searchEnableRemoteQueries");
    }
    /**
     * Gets the securityBlockAzureADJoinedDevicesAutoEncryption property value. Specify whether to allow automatic device encryption during OOBE when the device is Azure AD joined (desktop only).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityBlockAzureADJoinedDevicesAutoEncryption() {
        return this.backingStore.get("securityBlockAzureADJoinedDevicesAutoEncryption");
    }
    /**
     * Gets the settingsBlockAccountsPage property value. Indicates whether or not to block access to Accounts in Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockAccountsPage() {
        return this.backingStore.get("settingsBlockAccountsPage");
    }
    /**
     * Gets the settingsBlockAddProvisioningPackage property value. Indicates whether or not to block the user from installing provisioning packages.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockAddProvisioningPackage() {
        return this.backingStore.get("settingsBlockAddProvisioningPackage");
    }
    /**
     * Gets the settingsBlockAppsPage property value. Indicates whether or not to block access to Apps in Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockAppsPage() {
        return this.backingStore.get("settingsBlockAppsPage");
    }
    /**
     * Gets the settingsBlockChangeLanguage property value. Indicates whether or not to block the user from changing the language settings.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockChangeLanguage() {
        return this.backingStore.get("settingsBlockChangeLanguage");
    }
    /**
     * Gets the settingsBlockChangePowerSleep property value. Indicates whether or not to block the user from changing power and sleep settings.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockChangePowerSleep() {
        return this.backingStore.get("settingsBlockChangePowerSleep");
    }
    /**
     * Gets the settingsBlockChangeRegion property value. Indicates whether or not to block the user from changing the region settings.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockChangeRegion() {
        return this.backingStore.get("settingsBlockChangeRegion");
    }
    /**
     * Gets the settingsBlockChangeSystemTime property value. Indicates whether or not to block the user from changing date and time settings.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockChangeSystemTime() {
        return this.backingStore.get("settingsBlockChangeSystemTime");
    }
    /**
     * Gets the settingsBlockDevicesPage property value. Indicates whether or not to block access to Devices in Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockDevicesPage() {
        return this.backingStore.get("settingsBlockDevicesPage");
    }
    /**
     * Gets the settingsBlockEaseOfAccessPage property value. Indicates whether or not to block access to Ease of Access in Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockEaseOfAccessPage() {
        return this.backingStore.get("settingsBlockEaseOfAccessPage");
    }
    /**
     * Gets the settingsBlockEditDeviceName property value. Indicates whether or not to block the user from editing the device name.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockEditDeviceName() {
        return this.backingStore.get("settingsBlockEditDeviceName");
    }
    /**
     * Gets the settingsBlockGamingPage property value. Indicates whether or not to block access to Gaming in Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockGamingPage() {
        return this.backingStore.get("settingsBlockGamingPage");
    }
    /**
     * Gets the settingsBlockNetworkInternetPage property value. Indicates whether or not to block access to Network & Internet in Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockNetworkInternetPage() {
        return this.backingStore.get("settingsBlockNetworkInternetPage");
    }
    /**
     * Gets the settingsBlockPersonalizationPage property value. Indicates whether or not to block access to Personalization in Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockPersonalizationPage() {
        return this.backingStore.get("settingsBlockPersonalizationPage");
    }
    /**
     * Gets the settingsBlockPrivacyPage property value. Indicates whether or not to block access to Privacy in Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockPrivacyPage() {
        return this.backingStore.get("settingsBlockPrivacyPage");
    }
    /**
     * Gets the settingsBlockRemoveProvisioningPackage property value. Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockRemoveProvisioningPackage() {
        return this.backingStore.get("settingsBlockRemoveProvisioningPackage");
    }
    /**
     * Gets the settingsBlockSettingsApp property value. Indicates whether or not to block access to Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockSettingsApp() {
        return this.backingStore.get("settingsBlockSettingsApp");
    }
    /**
     * Gets the settingsBlockSystemPage property value. Indicates whether or not to block access to System in Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockSystemPage() {
        return this.backingStore.get("settingsBlockSystemPage");
    }
    /**
     * Gets the settingsBlockTimeLanguagePage property value. Indicates whether or not to block access to Time & Language in Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockTimeLanguagePage() {
        return this.backingStore.get("settingsBlockTimeLanguagePage");
    }
    /**
     * Gets the settingsBlockUpdateSecurityPage property value. Indicates whether or not to block access to Update & Security in Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSettingsBlockUpdateSecurityPage() {
        return this.backingStore.get("settingsBlockUpdateSecurityPage");
    }
    /**
     * Gets the sharedUserAppDataAllowed property value. Indicates whether or not to block multiple users of the same app to share data.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSharedUserAppDataAllowed() {
        return this.backingStore.get("sharedUserAppDataAllowed");
    }
    /**
     * Gets the smartScreenAppInstallControl property value. App Install control Setting
     * @return a AppInstallControlType
     */
    @jakarta.annotation.Nullable
    public AppInstallControlType getSmartScreenAppInstallControl() {
        return this.backingStore.get("smartScreenAppInstallControl");
    }
    /**
     * Gets the smartScreenBlockPromptOverride property value. Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSmartScreenBlockPromptOverride() {
        return this.backingStore.get("smartScreenBlockPromptOverride");
    }
    /**
     * Gets the smartScreenBlockPromptOverrideForFiles property value. Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSmartScreenBlockPromptOverrideForFiles() {
        return this.backingStore.get("smartScreenBlockPromptOverrideForFiles");
    }
    /**
     * Gets the smartScreenEnableAppInstallControl property value. This property will be deprecated in July 2019 and will be replaced by property SmartScreenAppInstallControl. Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSmartScreenEnableAppInstallControl() {
        return this.backingStore.get("smartScreenEnableAppInstallControl");
    }
    /**
     * Gets the startBlockUnpinningAppsFromTaskbar property value. Indicates whether or not to block the user from unpinning apps from taskbar.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartBlockUnpinningAppsFromTaskbar() {
        return this.backingStore.get("startBlockUnpinningAppsFromTaskbar");
    }
    /**
     * Gets the startMenuAppListVisibility property value. Type of start menu app list visibility.
     * @return a EnumSet<WindowsStartMenuAppListVisibilityType>
     */
    @jakarta.annotation.Nullable
    public EnumSet<WindowsStartMenuAppListVisibilityType> getStartMenuAppListVisibility() {
        return this.backingStore.get("startMenuAppListVisibility");
    }
    /**
     * Gets the startMenuHideChangeAccountSettings property value. Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartMenuHideChangeAccountSettings() {
        return this.backingStore.get("startMenuHideChangeAccountSettings");
    }
    /**
     * Gets the startMenuHideFrequentlyUsedApps property value. Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartMenuHideFrequentlyUsedApps() {
        return this.backingStore.get("startMenuHideFrequentlyUsedApps");
    }
    /**
     * Gets the startMenuHideHibernate property value. Enabling this policy hides hibernate from appearing in the power button in the start menu.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartMenuHideHibernate() {
        return this.backingStore.get("startMenuHideHibernate");
    }
    /**
     * Gets the startMenuHideLock property value. Enabling this policy hides lock from appearing in the user tile in the start menu.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartMenuHideLock() {
        return this.backingStore.get("startMenuHideLock");
    }
    /**
     * Gets the startMenuHidePowerButton property value. Enabling this policy hides the power button from appearing in the start menu.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartMenuHidePowerButton() {
        return this.backingStore.get("startMenuHidePowerButton");
    }
    /**
     * Gets the startMenuHideRecentJumpLists property value. Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartMenuHideRecentJumpLists() {
        return this.backingStore.get("startMenuHideRecentJumpLists");
    }
    /**
     * Gets the startMenuHideRecentlyAddedApps property value. Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartMenuHideRecentlyAddedApps() {
        return this.backingStore.get("startMenuHideRecentlyAddedApps");
    }
    /**
     * Gets the startMenuHideRestartOptions property value. Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartMenuHideRestartOptions() {
        return this.backingStore.get("startMenuHideRestartOptions");
    }
    /**
     * Gets the startMenuHideShutDown property value. Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartMenuHideShutDown() {
        return this.backingStore.get("startMenuHideShutDown");
    }
    /**
     * Gets the startMenuHideSignOut property value. Enabling this policy hides sign out from appearing in the user tile in the start menu.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartMenuHideSignOut() {
        return this.backingStore.get("startMenuHideSignOut");
    }
    /**
     * Gets the startMenuHideSleep property value. Enabling this policy hides sleep from appearing in the power button in the start menu.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartMenuHideSleep() {
        return this.backingStore.get("startMenuHideSleep");
    }
    /**
     * Gets the startMenuHideSwitchAccount property value. Enabling this policy hides switch account from appearing in the user tile in the start menu.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartMenuHideSwitchAccount() {
        return this.backingStore.get("startMenuHideSwitchAccount");
    }
    /**
     * Gets the startMenuHideUserTile property value. Enabling this policy hides the user tile from appearing in the start menu.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStartMenuHideUserTile() {
        return this.backingStore.get("startMenuHideUserTile");
    }
    /**
     * Gets the startMenuLayoutEdgeAssetsXml property value. This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getStartMenuLayoutEdgeAssetsXml() {
        return this.backingStore.get("startMenuLayoutEdgeAssetsXml");
    }
    /**
     * Gets the startMenuLayoutXml property value. Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getStartMenuLayoutXml() {
        return this.backingStore.get("startMenuLayoutXml");
    }
    /**
     * Gets the startMenuMode property value. Type of display modes for the start menu.
     * @return a WindowsStartMenuModeType
     */
    @jakarta.annotation.Nullable
    public WindowsStartMenuModeType getStartMenuMode() {
        return this.backingStore.get("startMenuMode");
    }
    /**
     * Gets the startMenuPinnedFolderDocuments property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @jakarta.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderDocuments() {
        return this.backingStore.get("startMenuPinnedFolderDocuments");
    }
    /**
     * Gets the startMenuPinnedFolderDownloads property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @jakarta.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderDownloads() {
        return this.backingStore.get("startMenuPinnedFolderDownloads");
    }
    /**
     * Gets the startMenuPinnedFolderFileExplorer property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @jakarta.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderFileExplorer() {
        return this.backingStore.get("startMenuPinnedFolderFileExplorer");
    }
    /**
     * Gets the startMenuPinnedFolderHomeGroup property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @jakarta.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderHomeGroup() {
        return this.backingStore.get("startMenuPinnedFolderHomeGroup");
    }
    /**
     * Gets the startMenuPinnedFolderMusic property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @jakarta.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderMusic() {
        return this.backingStore.get("startMenuPinnedFolderMusic");
    }
    /**
     * Gets the startMenuPinnedFolderNetwork property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @jakarta.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderNetwork() {
        return this.backingStore.get("startMenuPinnedFolderNetwork");
    }
    /**
     * Gets the startMenuPinnedFolderPersonalFolder property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @jakarta.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderPersonalFolder() {
        return this.backingStore.get("startMenuPinnedFolderPersonalFolder");
    }
    /**
     * Gets the startMenuPinnedFolderPictures property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @jakarta.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderPictures() {
        return this.backingStore.get("startMenuPinnedFolderPictures");
    }
    /**
     * Gets the startMenuPinnedFolderSettings property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @jakarta.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderSettings() {
        return this.backingStore.get("startMenuPinnedFolderSettings");
    }
    /**
     * Gets the startMenuPinnedFolderVideos property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @jakarta.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderVideos() {
        return this.backingStore.get("startMenuPinnedFolderVideos");
    }
    /**
     * Gets the storageBlockRemovableStorage property value. Indicates whether or not to Block the user from using removable storage.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageBlockRemovableStorage() {
        return this.backingStore.get("storageBlockRemovableStorage");
    }
    /**
     * Gets the storageRequireMobileDeviceEncryption property value. Indicating whether or not to require encryption on a mobile device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageRequireMobileDeviceEncryption() {
        return this.backingStore.get("storageRequireMobileDeviceEncryption");
    }
    /**
     * Gets the storageRestrictAppDataToSystemVolume property value. Indicates whether application data is restricted to the system drive.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageRestrictAppDataToSystemVolume() {
        return this.backingStore.get("storageRestrictAppDataToSystemVolume");
    }
    /**
     * Gets the storageRestrictAppInstallToSystemVolume property value. Indicates whether the installation of applications is restricted to the system drive.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageRestrictAppInstallToSystemVolume() {
        return this.backingStore.get("storageRestrictAppInstallToSystemVolume");
    }
    /**
     * Gets the systemTelemetryProxyServer property value. Gets or sets the fully qualified domain name (FQDN) or IP address of a proxy server to forward Connected User Experiences and Telemetry requests.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSystemTelemetryProxyServer() {
        return this.backingStore.get("systemTelemetryProxyServer");
    }
    /**
     * Gets the taskManagerBlockEndTask property value. Specify whether non-administrators can use Task Manager to end tasks.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTaskManagerBlockEndTask() {
        return this.backingStore.get("taskManagerBlockEndTask");
    }
    /**
     * Gets the tenantLockdownRequireNetworkDuringOutOfBoxExperience property value. Whether the device is required to connect to the network.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTenantLockdownRequireNetworkDuringOutOfBoxExperience() {
        return this.backingStore.get("tenantLockdownRequireNetworkDuringOutOfBoxExperience");
    }
    /**
     * Gets the uninstallBuiltInApps property value. Indicates whether or not to uninstall a fixed list of built-in Windows apps.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUninstallBuiltInApps() {
        return this.backingStore.get("uninstallBuiltInApps");
    }
    /**
     * Gets the usbBlocked property value. Indicates whether or not to Block the user from USB connection.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUsbBlocked() {
        return this.backingStore.get("usbBlocked");
    }
    /**
     * Gets the voiceRecordingBlocked property value. Indicates whether or not to Block the user from voice recording.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getVoiceRecordingBlocked() {
        return this.backingStore.get("voiceRecordingBlocked");
    }
    /**
     * Gets the webRtcBlockLocalhostIpAddress property value. Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWebRtcBlockLocalhostIpAddress() {
        return this.backingStore.get("webRtcBlockLocalhostIpAddress");
    }
    /**
     * Gets the wiFiBlockAutomaticConnectHotspots property value. Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWiFiBlockAutomaticConnectHotspots() {
        return this.backingStore.get("wiFiBlockAutomaticConnectHotspots");
    }
    /**
     * Gets the wiFiBlocked property value. Indicates whether or not to Block the user from using Wi-Fi.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWiFiBlocked() {
        return this.backingStore.get("wiFiBlocked");
    }
    /**
     * Gets the wiFiBlockManualConfiguration property value. Indicates whether or not to Block the user from using Wi-Fi manual configuration.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWiFiBlockManualConfiguration() {
        return this.backingStore.get("wiFiBlockManualConfiguration");
    }
    /**
     * Gets the wiFiScanInterval property value. Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWiFiScanInterval() {
        return this.backingStore.get("wiFiScanInterval");
    }
    /**
     * Gets the windows10AppsForceUpdateSchedule property value. Windows 10 force update schedule for Apps.
     * @return a Windows10AppsForceUpdateSchedule
     */
    @jakarta.annotation.Nullable
    public Windows10AppsForceUpdateSchedule getWindows10AppsForceUpdateSchedule() {
        return this.backingStore.get("windows10AppsForceUpdateSchedule");
    }
    /**
     * Gets the windowsSpotlightBlockConsumerSpecificFeatures property value. Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsSpotlightBlockConsumerSpecificFeatures() {
        return this.backingStore.get("windowsSpotlightBlockConsumerSpecificFeatures");
    }
    /**
     * Gets the windowsSpotlightBlocked property value. Allows IT admins to turn off all Windows Spotlight features
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsSpotlightBlocked() {
        return this.backingStore.get("windowsSpotlightBlocked");
    }
    /**
     * Gets the windowsSpotlightBlockOnActionCenter property value. Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsSpotlightBlockOnActionCenter() {
        return this.backingStore.get("windowsSpotlightBlockOnActionCenter");
    }
    /**
     * Gets the windowsSpotlightBlockTailoredExperiences property value. Block personalized content in Windows spotlight based on users device usage.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsSpotlightBlockTailoredExperiences() {
        return this.backingStore.get("windowsSpotlightBlockTailoredExperiences");
    }
    /**
     * Gets the windowsSpotlightBlockThirdPartyNotifications property value. Block third party content delivered via Windows Spotlight
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsSpotlightBlockThirdPartyNotifications() {
        return this.backingStore.get("windowsSpotlightBlockThirdPartyNotifications");
    }
    /**
     * Gets the windowsSpotlightBlockWelcomeExperience property value. Block Windows Spotlight Windows welcome experience
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsSpotlightBlockWelcomeExperience() {
        return this.backingStore.get("windowsSpotlightBlockWelcomeExperience");
    }
    /**
     * Gets the windowsSpotlightBlockWindowsTips property value. Allows IT admins to turn off the popup of Windows Tips.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsSpotlightBlockWindowsTips() {
        return this.backingStore.get("windowsSpotlightBlockWindowsTips");
    }
    /**
     * Gets the windowsSpotlightConfigureOnLockScreen property value. Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     * @return a WindowsSpotlightEnablementSettings
     */
    @jakarta.annotation.Nullable
    public WindowsSpotlightEnablementSettings getWindowsSpotlightConfigureOnLockScreen() {
        return this.backingStore.get("windowsSpotlightConfigureOnLockScreen");
    }
    /**
     * Gets the windowsStoreBlockAutoUpdate property value. Indicates whether or not to block automatic update of apps from Windows Store.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsStoreBlockAutoUpdate() {
        return this.backingStore.get("windowsStoreBlockAutoUpdate");
    }
    /**
     * Gets the windowsStoreBlocked property value. Indicates whether or not to Block the user from using the Windows store.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsStoreBlocked() {
        return this.backingStore.get("windowsStoreBlocked");
    }
    /**
     * Gets the windowsStoreEnablePrivateStoreOnly property value. Indicates whether or not to enable Private Store Only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsStoreEnablePrivateStoreOnly() {
        return this.backingStore.get("windowsStoreEnablePrivateStoreOnly");
    }
    /**
     * Gets the wirelessDisplayBlockProjectionToThisDevice property value. Indicates whether or not to allow other devices from discovering this PC for projection.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWirelessDisplayBlockProjectionToThisDevice() {
        return this.backingStore.get("wirelessDisplayBlockProjectionToThisDevice");
    }
    /**
     * Gets the wirelessDisplayBlockUserInputFromReceiver property value. Indicates whether or not to allow user input from wireless display receiver.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWirelessDisplayBlockUserInputFromReceiver() {
        return this.backingStore.get("wirelessDisplayBlockUserInputFromReceiver");
    }
    /**
     * Gets the wirelessDisplayRequirePinForPairing property value. Indicates whether or not to require a PIN for new devices to initiate pairing.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWirelessDisplayRequirePinForPairing() {
        return this.backingStore.get("wirelessDisplayRequirePinForPairing");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("accountsBlockAddingNonMicrosoftAccountEmail", this.getAccountsBlockAddingNonMicrosoftAccountEmail());
        writer.writeEnumValue("activateAppsWithVoice", this.getActivateAppsWithVoice());
        writer.writeBooleanValue("antiTheftModeBlocked", this.getAntiTheftModeBlocked());
        writer.writeBooleanValue("appManagementMSIAllowUserControlOverInstall", this.getAppManagementMSIAllowUserControlOverInstall());
        writer.writeBooleanValue("appManagementMSIAlwaysInstallWithElevatedPrivileges", this.getAppManagementMSIAlwaysInstallWithElevatedPrivileges());
        writer.writeCollectionOfPrimitiveValues("appManagementPackageFamilyNamesToLaunchAfterLogOn", this.getAppManagementPackageFamilyNamesToLaunchAfterLogOn());
        writer.writeEnumValue("appsAllowTrustedAppsSideloading", this.getAppsAllowTrustedAppsSideloading());
        writer.writeBooleanValue("appsBlockWindowsStoreOriginatedApps", this.getAppsBlockWindowsStoreOriginatedApps());
        writer.writeBooleanValue("authenticationAllowSecondaryDevice", this.getAuthenticationAllowSecondaryDevice());
        writer.writeStringValue("authenticationPreferredAzureADTenantDomainName", this.getAuthenticationPreferredAzureADTenantDomainName());
        writer.writeEnumValue("authenticationWebSignIn", this.getAuthenticationWebSignIn());
        writer.writeCollectionOfPrimitiveValues("bluetoothAllowedServices", this.getBluetoothAllowedServices());
        writer.writeBooleanValue("bluetoothBlockAdvertising", this.getBluetoothBlockAdvertising());
        writer.writeBooleanValue("bluetoothBlockDiscoverableMode", this.getBluetoothBlockDiscoverableMode());
        writer.writeBooleanValue("bluetoothBlocked", this.getBluetoothBlocked());
        writer.writeBooleanValue("bluetoothBlockPrePairing", this.getBluetoothBlockPrePairing());
        writer.writeBooleanValue("bluetoothBlockPromptedProximalConnections", this.getBluetoothBlockPromptedProximalConnections());
        writer.writeBooleanValue("cameraBlocked", this.getCameraBlocked());
        writer.writeBooleanValue("cellularBlockDataWhenRoaming", this.getCellularBlockDataWhenRoaming());
        writer.writeBooleanValue("cellularBlockVpn", this.getCellularBlockVpn());
        writer.writeBooleanValue("cellularBlockVpnWhenRoaming", this.getCellularBlockVpnWhenRoaming());
        writer.writeEnumValue("cellularData", this.getCellularData());
        writer.writeBooleanValue("certificatesBlockManualRootCertificateInstallation", this.getCertificatesBlockManualRootCertificateInstallation());
        writer.writeStringValue("configureTimeZone", this.getConfigureTimeZone());
        writer.writeBooleanValue("connectedDevicesServiceBlocked", this.getConnectedDevicesServiceBlocked());
        writer.writeBooleanValue("copyPasteBlocked", this.getCopyPasteBlocked());
        writer.writeBooleanValue("cortanaBlocked", this.getCortanaBlocked());
        writer.writeBooleanValue("cryptographyAllowFipsAlgorithmPolicy", this.getCryptographyAllowFipsAlgorithmPolicy());
        writer.writeBooleanValue("dataProtectionBlockDirectMemoryAccess", this.getDataProtectionBlockDirectMemoryAccess());
        writer.writeBooleanValue("defenderBlockEndUserAccess", this.getDefenderBlockEndUserAccess());
        writer.writeBooleanValue("defenderBlockOnAccessProtection", this.getDefenderBlockOnAccessProtection());
        writer.writeEnumValue("defenderCloudBlockLevel", this.getDefenderCloudBlockLevel());
        writer.writeIntegerValue("defenderCloudExtendedTimeout", this.getDefenderCloudExtendedTimeout());
        writer.writeIntegerValue("defenderCloudExtendedTimeoutInSeconds", this.getDefenderCloudExtendedTimeoutInSeconds());
        writer.writeIntegerValue("defenderDaysBeforeDeletingQuarantinedMalware", this.getDefenderDaysBeforeDeletingQuarantinedMalware());
        writer.writeObjectValue("defenderDetectedMalwareActions", this.getDefenderDetectedMalwareActions());
        writer.writeBooleanValue("defenderDisableCatchupFullScan", this.getDefenderDisableCatchupFullScan());
        writer.writeBooleanValue("defenderDisableCatchupQuickScan", this.getDefenderDisableCatchupQuickScan());
        writer.writeCollectionOfPrimitiveValues("defenderFileExtensionsToExclude", this.getDefenderFileExtensionsToExclude());
        writer.writeCollectionOfPrimitiveValues("defenderFilesAndFoldersToExclude", this.getDefenderFilesAndFoldersToExclude());
        writer.writeEnumValue("defenderMonitorFileActivity", this.getDefenderMonitorFileActivity());
        writer.writeEnumValue("defenderPotentiallyUnwantedAppAction", this.getDefenderPotentiallyUnwantedAppAction());
        writer.writeEnumValue("defenderPotentiallyUnwantedAppActionSetting", this.getDefenderPotentiallyUnwantedAppActionSetting());
        writer.writeCollectionOfPrimitiveValues("defenderProcessesToExclude", this.getDefenderProcessesToExclude());
        writer.writeEnumValue("defenderPromptForSampleSubmission", this.getDefenderPromptForSampleSubmission());
        writer.writeBooleanValue("defenderRequireBehaviorMonitoring", this.getDefenderRequireBehaviorMonitoring());
        writer.writeBooleanValue("defenderRequireCloudProtection", this.getDefenderRequireCloudProtection());
        writer.writeBooleanValue("defenderRequireNetworkInspectionSystem", this.getDefenderRequireNetworkInspectionSystem());
        writer.writeBooleanValue("defenderRequireRealTimeMonitoring", this.getDefenderRequireRealTimeMonitoring());
        writer.writeBooleanValue("defenderScanArchiveFiles", this.getDefenderScanArchiveFiles());
        writer.writeBooleanValue("defenderScanDownloads", this.getDefenderScanDownloads());
        writer.writeBooleanValue("defenderScanIncomingMail", this.getDefenderScanIncomingMail());
        writer.writeBooleanValue("defenderScanMappedNetworkDrivesDuringFullScan", this.getDefenderScanMappedNetworkDrivesDuringFullScan());
        writer.writeIntegerValue("defenderScanMaxCpu", this.getDefenderScanMaxCpu());
        writer.writeBooleanValue("defenderScanNetworkFiles", this.getDefenderScanNetworkFiles());
        writer.writeBooleanValue("defenderScanRemovableDrivesDuringFullScan", this.getDefenderScanRemovableDrivesDuringFullScan());
        writer.writeBooleanValue("defenderScanScriptsLoadedInInternetExplorer", this.getDefenderScanScriptsLoadedInInternetExplorer());
        writer.writeEnumValue("defenderScanType", this.getDefenderScanType());
        writer.writeLocalTimeValue("defenderScheduledQuickScanTime", this.getDefenderScheduledQuickScanTime());
        writer.writeLocalTimeValue("defenderScheduledScanTime", this.getDefenderScheduledScanTime());
        writer.writeBooleanValue("defenderScheduleScanEnableLowCpuPriority", this.getDefenderScheduleScanEnableLowCpuPriority());
        writer.writeIntegerValue("defenderSignatureUpdateIntervalInHours", this.getDefenderSignatureUpdateIntervalInHours());
        writer.writeEnumValue("defenderSubmitSamplesConsentType", this.getDefenderSubmitSamplesConsentType());
        writer.writeEnumValue("defenderSystemScanSchedule", this.getDefenderSystemScanSchedule());
        writer.writeEnumValue("developerUnlockSetting", this.getDeveloperUnlockSetting());
        writer.writeBooleanValue("deviceManagementBlockFactoryResetOnMobile", this.getDeviceManagementBlockFactoryResetOnMobile());
        writer.writeBooleanValue("deviceManagementBlockManualUnenroll", this.getDeviceManagementBlockManualUnenroll());
        writer.writeEnumValue("diagnosticsDataSubmissionMode", this.getDiagnosticsDataSubmissionMode());
        writer.writeCollectionOfPrimitiveValues("displayAppListWithGdiDPIScalingTurnedOff", this.getDisplayAppListWithGdiDPIScalingTurnedOff());
        writer.writeCollectionOfPrimitiveValues("displayAppListWithGdiDPIScalingTurnedOn", this.getDisplayAppListWithGdiDPIScalingTurnedOn());
        writer.writeBooleanValue("edgeAllowStartPagesModification", this.getEdgeAllowStartPagesModification());
        writer.writeBooleanValue("edgeBlockAccessToAboutFlags", this.getEdgeBlockAccessToAboutFlags());
        writer.writeBooleanValue("edgeBlockAddressBarDropdown", this.getEdgeBlockAddressBarDropdown());
        writer.writeBooleanValue("edgeBlockAutofill", this.getEdgeBlockAutofill());
        writer.writeBooleanValue("edgeBlockCompatibilityList", this.getEdgeBlockCompatibilityList());
        writer.writeBooleanValue("edgeBlockDeveloperTools", this.getEdgeBlockDeveloperTools());
        writer.writeBooleanValue("edgeBlocked", this.getEdgeBlocked());
        writer.writeBooleanValue("edgeBlockEditFavorites", this.getEdgeBlockEditFavorites());
        writer.writeBooleanValue("edgeBlockExtensions", this.getEdgeBlockExtensions());
        writer.writeBooleanValue("edgeBlockFullScreenMode", this.getEdgeBlockFullScreenMode());
        writer.writeBooleanValue("edgeBlockInPrivateBrowsing", this.getEdgeBlockInPrivateBrowsing());
        writer.writeBooleanValue("edgeBlockJavaScript", this.getEdgeBlockJavaScript());
        writer.writeBooleanValue("edgeBlockLiveTileDataCollection", this.getEdgeBlockLiveTileDataCollection());
        writer.writeBooleanValue("edgeBlockPasswordManager", this.getEdgeBlockPasswordManager());
        writer.writeBooleanValue("edgeBlockPopups", this.getEdgeBlockPopups());
        writer.writeBooleanValue("edgeBlockPrelaunch", this.getEdgeBlockPrelaunch());
        writer.writeBooleanValue("edgeBlockPrinting", this.getEdgeBlockPrinting());
        writer.writeBooleanValue("edgeBlockSavingHistory", this.getEdgeBlockSavingHistory());
        writer.writeBooleanValue("edgeBlockSearchEngineCustomization", this.getEdgeBlockSearchEngineCustomization());
        writer.writeBooleanValue("edgeBlockSearchSuggestions", this.getEdgeBlockSearchSuggestions());
        writer.writeBooleanValue("edgeBlockSendingDoNotTrackHeader", this.getEdgeBlockSendingDoNotTrackHeader());
        writer.writeBooleanValue("edgeBlockSendingIntranetTrafficToInternetExplorer", this.getEdgeBlockSendingIntranetTrafficToInternetExplorer());
        writer.writeBooleanValue("edgeBlockSideloadingExtensions", this.getEdgeBlockSideloadingExtensions());
        writer.writeBooleanValue("edgeBlockTabPreloading", this.getEdgeBlockTabPreloading());
        writer.writeBooleanValue("edgeBlockWebContentOnNewTabPage", this.getEdgeBlockWebContentOnNewTabPage());
        writer.writeBooleanValue("edgeClearBrowsingDataOnExit", this.getEdgeClearBrowsingDataOnExit());
        writer.writeEnumValue("edgeCookiePolicy", this.getEdgeCookiePolicy());
        writer.writeBooleanValue("edgeDisableFirstRunPage", this.getEdgeDisableFirstRunPage());
        writer.writeStringValue("edgeEnterpriseModeSiteListLocation", this.getEdgeEnterpriseModeSiteListLocation());
        writer.writeEnumValue("edgeFavoritesBarVisibility", this.getEdgeFavoritesBarVisibility());
        writer.writeStringValue("edgeFavoritesListLocation", this.getEdgeFavoritesListLocation());
        writer.writeStringValue("edgeFirstRunUrl", this.getEdgeFirstRunUrl());
        writer.writeObjectValue("edgeHomeButtonConfiguration", this.getEdgeHomeButtonConfiguration());
        writer.writeBooleanValue("edgeHomeButtonConfigurationEnabled", this.getEdgeHomeButtonConfigurationEnabled());
        writer.writeCollectionOfPrimitiveValues("edgeHomepageUrls", this.getEdgeHomepageUrls());
        writer.writeEnumValue("edgeKioskModeRestriction", this.getEdgeKioskModeRestriction());
        writer.writeIntegerValue("edgeKioskResetAfterIdleTimeInMinutes", this.getEdgeKioskResetAfterIdleTimeInMinutes());
        writer.writeStringValue("edgeNewTabPageURL", this.getEdgeNewTabPageURL());
        writer.writeEnumValue("edgeOpensWith", this.getEdgeOpensWith());
        writer.writeBooleanValue("edgePreventCertificateErrorOverride", this.getEdgePreventCertificateErrorOverride());
        writer.writeCollectionOfPrimitiveValues("edgeRequiredExtensionPackageFamilyNames", this.getEdgeRequiredExtensionPackageFamilyNames());
        writer.writeBooleanValue("edgeRequireSmartScreen", this.getEdgeRequireSmartScreen());
        writer.writeObjectValue("edgeSearchEngine", this.getEdgeSearchEngine());
        writer.writeBooleanValue("edgeSendIntranetTrafficToInternetExplorer", this.getEdgeSendIntranetTrafficToInternetExplorer());
        writer.writeEnumValue("edgeShowMessageWhenOpeningInternetExplorerSites", this.getEdgeShowMessageWhenOpeningInternetExplorerSites());
        writer.writeBooleanValue("edgeSyncFavoritesWithInternetExplorer", this.getEdgeSyncFavoritesWithInternetExplorer());
        writer.writeEnumValue("edgeTelemetryForMicrosoft365Analytics", this.getEdgeTelemetryForMicrosoft365Analytics());
        writer.writeBooleanValue("enableAutomaticRedeployment", this.getEnableAutomaticRedeployment());
        writer.writeIntegerValue("energySaverOnBatteryThresholdPercentage", this.getEnergySaverOnBatteryThresholdPercentage());
        writer.writeIntegerValue("energySaverPluggedInThresholdPercentage", this.getEnergySaverPluggedInThresholdPercentage());
        writer.writeStringValue("enterpriseCloudPrintDiscoveryEndPoint", this.getEnterpriseCloudPrintDiscoveryEndPoint());
        writer.writeIntegerValue("enterpriseCloudPrintDiscoveryMaxLimit", this.getEnterpriseCloudPrintDiscoveryMaxLimit());
        writer.writeStringValue("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier", this.getEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier());
        writer.writeStringValue("enterpriseCloudPrintOAuthAuthority", this.getEnterpriseCloudPrintOAuthAuthority());
        writer.writeStringValue("enterpriseCloudPrintOAuthClientIdentifier", this.getEnterpriseCloudPrintOAuthClientIdentifier());
        writer.writeStringValue("enterpriseCloudPrintResourceIdentifier", this.getEnterpriseCloudPrintResourceIdentifier());
        writer.writeBooleanValue("experienceBlockDeviceDiscovery", this.getExperienceBlockDeviceDiscovery());
        writer.writeBooleanValue("experienceBlockErrorDialogWhenNoSIM", this.getExperienceBlockErrorDialogWhenNoSIM());
        writer.writeBooleanValue("experienceBlockTaskSwitcher", this.getExperienceBlockTaskSwitcher());
        writer.writeEnumValue("experienceDoNotSyncBrowserSettings", this.getExperienceDoNotSyncBrowserSettings());
        writer.writeEnumValue("findMyFiles", this.getFindMyFiles());
        writer.writeBooleanValue("gameDvrBlocked", this.getGameDvrBlocked());
        writer.writeEnumValue("inkWorkspaceAccess", this.getInkWorkspaceAccess());
        writer.writeEnumValue("inkWorkspaceAccessState", this.getInkWorkspaceAccessState());
        writer.writeBooleanValue("inkWorkspaceBlockSuggestedApps", this.getInkWorkspaceBlockSuggestedApps());
        writer.writeBooleanValue("internetSharingBlocked", this.getInternetSharingBlocked());
        writer.writeBooleanValue("locationServicesBlocked", this.getLocationServicesBlocked());
        writer.writeEnumValue("lockScreenActivateAppsWithVoice", this.getLockScreenActivateAppsWithVoice());
        writer.writeBooleanValue("lockScreenAllowTimeoutConfiguration", this.getLockScreenAllowTimeoutConfiguration());
        writer.writeBooleanValue("lockScreenBlockActionCenterNotifications", this.getLockScreenBlockActionCenterNotifications());
        writer.writeBooleanValue("lockScreenBlockCortana", this.getLockScreenBlockCortana());
        writer.writeBooleanValue("lockScreenBlockToastNotifications", this.getLockScreenBlockToastNotifications());
        writer.writeIntegerValue("lockScreenTimeoutInSeconds", this.getLockScreenTimeoutInSeconds());
        writer.writeBooleanValue("logonBlockFastUserSwitching", this.getLogonBlockFastUserSwitching());
        writer.writeBooleanValue("messagingBlockMMS", this.getMessagingBlockMMS());
        writer.writeBooleanValue("messagingBlockRichCommunicationServices", this.getMessagingBlockRichCommunicationServices());
        writer.writeBooleanValue("messagingBlockSync", this.getMessagingBlockSync());
        writer.writeBooleanValue("microsoftAccountBlocked", this.getMicrosoftAccountBlocked());
        writer.writeBooleanValue("microsoftAccountBlockSettingsSync", this.getMicrosoftAccountBlockSettingsSync());
        writer.writeEnumValue("microsoftAccountSignInAssistantSettings", this.getMicrosoftAccountSignInAssistantSettings());
        writer.writeBooleanValue("networkProxyApplySettingsDeviceWide", this.getNetworkProxyApplySettingsDeviceWide());
        writer.writeStringValue("networkProxyAutomaticConfigurationUrl", this.getNetworkProxyAutomaticConfigurationUrl());
        writer.writeBooleanValue("networkProxyDisableAutoDetect", this.getNetworkProxyDisableAutoDetect());
        writer.writeObjectValue("networkProxyServer", this.getNetworkProxyServer());
        writer.writeBooleanValue("nfcBlocked", this.getNfcBlocked());
        writer.writeBooleanValue("oneDriveDisableFileSync", this.getOneDriveDisableFileSync());
        writer.writeBooleanValue("passwordBlockSimple", this.getPasswordBlockSimple());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumAgeInDays", this.getPasswordMinimumAgeInDays());
        writer.writeIntegerValue("passwordMinimumCharacterSetCount", this.getPasswordMinimumCharacterSetCount());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeScreenTimeout", this.getPasswordMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeBooleanValue("passwordRequired", this.getPasswordRequired());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeBooleanValue("passwordRequireWhenResumeFromIdleState", this.getPasswordRequireWhenResumeFromIdleState());
        writer.writeIntegerValue("passwordSignInFailureCountBeforeFactoryReset", this.getPasswordSignInFailureCountBeforeFactoryReset());
        writer.writeStringValue("personalizationDesktopImageUrl", this.getPersonalizationDesktopImageUrl());
        writer.writeStringValue("personalizationLockScreenImageUrl", this.getPersonalizationLockScreenImageUrl());
        writer.writeEnumValue("powerButtonActionOnBattery", this.getPowerButtonActionOnBattery());
        writer.writeEnumValue("powerButtonActionPluggedIn", this.getPowerButtonActionPluggedIn());
        writer.writeEnumValue("powerHybridSleepOnBattery", this.getPowerHybridSleepOnBattery());
        writer.writeEnumValue("powerHybridSleepPluggedIn", this.getPowerHybridSleepPluggedIn());
        writer.writeEnumValue("powerLidCloseActionOnBattery", this.getPowerLidCloseActionOnBattery());
        writer.writeEnumValue("powerLidCloseActionPluggedIn", this.getPowerLidCloseActionPluggedIn());
        writer.writeEnumValue("powerSleepButtonActionOnBattery", this.getPowerSleepButtonActionOnBattery());
        writer.writeEnumValue("powerSleepButtonActionPluggedIn", this.getPowerSleepButtonActionPluggedIn());
        writer.writeBooleanValue("printerBlockAddition", this.getPrinterBlockAddition());
        writer.writeStringValue("printerDefaultName", this.getPrinterDefaultName());
        writer.writeCollectionOfPrimitiveValues("printerNames", this.getPrinterNames());
        writer.writeCollectionOfObjectValues("privacyAccessControls", this.getPrivacyAccessControls());
        writer.writeEnumValue("privacyAdvertisingId", this.getPrivacyAdvertisingId());
        writer.writeBooleanValue("privacyAutoAcceptPairingAndConsentPrompts", this.getPrivacyAutoAcceptPairingAndConsentPrompts());
        writer.writeBooleanValue("privacyBlockActivityFeed", this.getPrivacyBlockActivityFeed());
        writer.writeBooleanValue("privacyBlockInputPersonalization", this.getPrivacyBlockInputPersonalization());
        writer.writeBooleanValue("privacyBlockPublishUserActivities", this.getPrivacyBlockPublishUserActivities());
        writer.writeBooleanValue("privacyDisableLaunchExperience", this.getPrivacyDisableLaunchExperience());
        writer.writeBooleanValue("resetProtectionModeBlocked", this.getResetProtectionModeBlocked());
        writer.writeEnumValue("safeSearchFilter", this.getSafeSearchFilter());
        writer.writeBooleanValue("screenCaptureBlocked", this.getScreenCaptureBlocked());
        writer.writeBooleanValue("searchBlockDiacritics", this.getSearchBlockDiacritics());
        writer.writeBooleanValue("searchBlockWebResults", this.getSearchBlockWebResults());
        writer.writeBooleanValue("searchDisableAutoLanguageDetection", this.getSearchDisableAutoLanguageDetection());
        writer.writeBooleanValue("searchDisableIndexerBackoff", this.getSearchDisableIndexerBackoff());
        writer.writeBooleanValue("searchDisableIndexingEncryptedItems", this.getSearchDisableIndexingEncryptedItems());
        writer.writeBooleanValue("searchDisableIndexingRemovableDrive", this.getSearchDisableIndexingRemovableDrive());
        writer.writeBooleanValue("searchDisableLocation", this.getSearchDisableLocation());
        writer.writeBooleanValue("searchDisableUseLocation", this.getSearchDisableUseLocation());
        writer.writeBooleanValue("searchEnableAutomaticIndexSizeManangement", this.getSearchEnableAutomaticIndexSizeManangement());
        writer.writeBooleanValue("searchEnableRemoteQueries", this.getSearchEnableRemoteQueries());
        writer.writeBooleanValue("securityBlockAzureADJoinedDevicesAutoEncryption", this.getSecurityBlockAzureADJoinedDevicesAutoEncryption());
        writer.writeBooleanValue("settingsBlockAccountsPage", this.getSettingsBlockAccountsPage());
        writer.writeBooleanValue("settingsBlockAddProvisioningPackage", this.getSettingsBlockAddProvisioningPackage());
        writer.writeBooleanValue("settingsBlockAppsPage", this.getSettingsBlockAppsPage());
        writer.writeBooleanValue("settingsBlockChangeLanguage", this.getSettingsBlockChangeLanguage());
        writer.writeBooleanValue("settingsBlockChangePowerSleep", this.getSettingsBlockChangePowerSleep());
        writer.writeBooleanValue("settingsBlockChangeRegion", this.getSettingsBlockChangeRegion());
        writer.writeBooleanValue("settingsBlockChangeSystemTime", this.getSettingsBlockChangeSystemTime());
        writer.writeBooleanValue("settingsBlockDevicesPage", this.getSettingsBlockDevicesPage());
        writer.writeBooleanValue("settingsBlockEaseOfAccessPage", this.getSettingsBlockEaseOfAccessPage());
        writer.writeBooleanValue("settingsBlockEditDeviceName", this.getSettingsBlockEditDeviceName());
        writer.writeBooleanValue("settingsBlockGamingPage", this.getSettingsBlockGamingPage());
        writer.writeBooleanValue("settingsBlockNetworkInternetPage", this.getSettingsBlockNetworkInternetPage());
        writer.writeBooleanValue("settingsBlockPersonalizationPage", this.getSettingsBlockPersonalizationPage());
        writer.writeBooleanValue("settingsBlockPrivacyPage", this.getSettingsBlockPrivacyPage());
        writer.writeBooleanValue("settingsBlockRemoveProvisioningPackage", this.getSettingsBlockRemoveProvisioningPackage());
        writer.writeBooleanValue("settingsBlockSettingsApp", this.getSettingsBlockSettingsApp());
        writer.writeBooleanValue("settingsBlockSystemPage", this.getSettingsBlockSystemPage());
        writer.writeBooleanValue("settingsBlockTimeLanguagePage", this.getSettingsBlockTimeLanguagePage());
        writer.writeBooleanValue("settingsBlockUpdateSecurityPage", this.getSettingsBlockUpdateSecurityPage());
        writer.writeBooleanValue("sharedUserAppDataAllowed", this.getSharedUserAppDataAllowed());
        writer.writeEnumValue("smartScreenAppInstallControl", this.getSmartScreenAppInstallControl());
        writer.writeBooleanValue("smartScreenBlockPromptOverride", this.getSmartScreenBlockPromptOverride());
        writer.writeBooleanValue("smartScreenBlockPromptOverrideForFiles", this.getSmartScreenBlockPromptOverrideForFiles());
        writer.writeBooleanValue("smartScreenEnableAppInstallControl", this.getSmartScreenEnableAppInstallControl());
        writer.writeBooleanValue("startBlockUnpinningAppsFromTaskbar", this.getStartBlockUnpinningAppsFromTaskbar());
        writer.writeEnumSetValue("startMenuAppListVisibility", this.getStartMenuAppListVisibility());
        writer.writeBooleanValue("startMenuHideChangeAccountSettings", this.getStartMenuHideChangeAccountSettings());
        writer.writeBooleanValue("startMenuHideFrequentlyUsedApps", this.getStartMenuHideFrequentlyUsedApps());
        writer.writeBooleanValue("startMenuHideHibernate", this.getStartMenuHideHibernate());
        writer.writeBooleanValue("startMenuHideLock", this.getStartMenuHideLock());
        writer.writeBooleanValue("startMenuHidePowerButton", this.getStartMenuHidePowerButton());
        writer.writeBooleanValue("startMenuHideRecentJumpLists", this.getStartMenuHideRecentJumpLists());
        writer.writeBooleanValue("startMenuHideRecentlyAddedApps", this.getStartMenuHideRecentlyAddedApps());
        writer.writeBooleanValue("startMenuHideRestartOptions", this.getStartMenuHideRestartOptions());
        writer.writeBooleanValue("startMenuHideShutDown", this.getStartMenuHideShutDown());
        writer.writeBooleanValue("startMenuHideSignOut", this.getStartMenuHideSignOut());
        writer.writeBooleanValue("startMenuHideSleep", this.getStartMenuHideSleep());
        writer.writeBooleanValue("startMenuHideSwitchAccount", this.getStartMenuHideSwitchAccount());
        writer.writeBooleanValue("startMenuHideUserTile", this.getStartMenuHideUserTile());
        writer.writeByteArrayValue("startMenuLayoutEdgeAssetsXml", this.getStartMenuLayoutEdgeAssetsXml());
        writer.writeByteArrayValue("startMenuLayoutXml", this.getStartMenuLayoutXml());
        writer.writeEnumValue("startMenuMode", this.getStartMenuMode());
        writer.writeEnumValue("startMenuPinnedFolderDocuments", this.getStartMenuPinnedFolderDocuments());
        writer.writeEnumValue("startMenuPinnedFolderDownloads", this.getStartMenuPinnedFolderDownloads());
        writer.writeEnumValue("startMenuPinnedFolderFileExplorer", this.getStartMenuPinnedFolderFileExplorer());
        writer.writeEnumValue("startMenuPinnedFolderHomeGroup", this.getStartMenuPinnedFolderHomeGroup());
        writer.writeEnumValue("startMenuPinnedFolderMusic", this.getStartMenuPinnedFolderMusic());
        writer.writeEnumValue("startMenuPinnedFolderNetwork", this.getStartMenuPinnedFolderNetwork());
        writer.writeEnumValue("startMenuPinnedFolderPersonalFolder", this.getStartMenuPinnedFolderPersonalFolder());
        writer.writeEnumValue("startMenuPinnedFolderPictures", this.getStartMenuPinnedFolderPictures());
        writer.writeEnumValue("startMenuPinnedFolderSettings", this.getStartMenuPinnedFolderSettings());
        writer.writeEnumValue("startMenuPinnedFolderVideos", this.getStartMenuPinnedFolderVideos());
        writer.writeBooleanValue("storageBlockRemovableStorage", this.getStorageBlockRemovableStorage());
        writer.writeBooleanValue("storageRequireMobileDeviceEncryption", this.getStorageRequireMobileDeviceEncryption());
        writer.writeBooleanValue("storageRestrictAppDataToSystemVolume", this.getStorageRestrictAppDataToSystemVolume());
        writer.writeBooleanValue("storageRestrictAppInstallToSystemVolume", this.getStorageRestrictAppInstallToSystemVolume());
        writer.writeStringValue("systemTelemetryProxyServer", this.getSystemTelemetryProxyServer());
        writer.writeBooleanValue("taskManagerBlockEndTask", this.getTaskManagerBlockEndTask());
        writer.writeBooleanValue("tenantLockdownRequireNetworkDuringOutOfBoxExperience", this.getTenantLockdownRequireNetworkDuringOutOfBoxExperience());
        writer.writeBooleanValue("uninstallBuiltInApps", this.getUninstallBuiltInApps());
        writer.writeBooleanValue("usbBlocked", this.getUsbBlocked());
        writer.writeBooleanValue("voiceRecordingBlocked", this.getVoiceRecordingBlocked());
        writer.writeBooleanValue("webRtcBlockLocalhostIpAddress", this.getWebRtcBlockLocalhostIpAddress());
        writer.writeBooleanValue("wiFiBlockAutomaticConnectHotspots", this.getWiFiBlockAutomaticConnectHotspots());
        writer.writeBooleanValue("wiFiBlocked", this.getWiFiBlocked());
        writer.writeBooleanValue("wiFiBlockManualConfiguration", this.getWiFiBlockManualConfiguration());
        writer.writeIntegerValue("wiFiScanInterval", this.getWiFiScanInterval());
        writer.writeObjectValue("windows10AppsForceUpdateSchedule", this.getWindows10AppsForceUpdateSchedule());
        writer.writeBooleanValue("windowsSpotlightBlockConsumerSpecificFeatures", this.getWindowsSpotlightBlockConsumerSpecificFeatures());
        writer.writeBooleanValue("windowsSpotlightBlocked", this.getWindowsSpotlightBlocked());
        writer.writeBooleanValue("windowsSpotlightBlockOnActionCenter", this.getWindowsSpotlightBlockOnActionCenter());
        writer.writeBooleanValue("windowsSpotlightBlockTailoredExperiences", this.getWindowsSpotlightBlockTailoredExperiences());
        writer.writeBooleanValue("windowsSpotlightBlockThirdPartyNotifications", this.getWindowsSpotlightBlockThirdPartyNotifications());
        writer.writeBooleanValue("windowsSpotlightBlockWelcomeExperience", this.getWindowsSpotlightBlockWelcomeExperience());
        writer.writeBooleanValue("windowsSpotlightBlockWindowsTips", this.getWindowsSpotlightBlockWindowsTips());
        writer.writeEnumValue("windowsSpotlightConfigureOnLockScreen", this.getWindowsSpotlightConfigureOnLockScreen());
        writer.writeBooleanValue("windowsStoreBlockAutoUpdate", this.getWindowsStoreBlockAutoUpdate());
        writer.writeBooleanValue("windowsStoreBlocked", this.getWindowsStoreBlocked());
        writer.writeBooleanValue("windowsStoreEnablePrivateStoreOnly", this.getWindowsStoreEnablePrivateStoreOnly());
        writer.writeBooleanValue("wirelessDisplayBlockProjectionToThisDevice", this.getWirelessDisplayBlockProjectionToThisDevice());
        writer.writeBooleanValue("wirelessDisplayBlockUserInputFromReceiver", this.getWirelessDisplayBlockUserInputFromReceiver());
        writer.writeBooleanValue("wirelessDisplayRequirePinForPairing", this.getWirelessDisplayRequirePinForPairing());
    }
    /**
     * Sets the accountsBlockAddingNonMicrosoftAccountEmail property value. Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account.
     * @param value Value to set for the accountsBlockAddingNonMicrosoftAccountEmail property.
     */
    public void setAccountsBlockAddingNonMicrosoftAccountEmail(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("accountsBlockAddingNonMicrosoftAccountEmail", value);
    }
    /**
     * Sets the activateAppsWithVoice property value. Possible values of a property
     * @param value Value to set for the activateAppsWithVoice property.
     */
    public void setActivateAppsWithVoice(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("activateAppsWithVoice", value);
    }
    /**
     * Sets the antiTheftModeBlocked property value. Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
     * @param value Value to set for the antiTheftModeBlocked property.
     */
    public void setAntiTheftModeBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("antiTheftModeBlocked", value);
    }
    /**
     * Sets the appManagementMSIAllowUserControlOverInstall property value. This policy setting permits users to change installation options that typically are available only to system administrators.
     * @param value Value to set for the appManagementMSIAllowUserControlOverInstall property.
     */
    public void setAppManagementMSIAllowUserControlOverInstall(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appManagementMSIAllowUserControlOverInstall", value);
    }
    /**
     * Sets the appManagementMSIAlwaysInstallWithElevatedPrivileges property value. This policy setting directs Windows Installer to use elevated permissions when it installs any program on the system.
     * @param value Value to set for the appManagementMSIAlwaysInstallWithElevatedPrivileges property.
     */
    public void setAppManagementMSIAlwaysInstallWithElevatedPrivileges(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appManagementMSIAlwaysInstallWithElevatedPrivileges", value);
    }
    /**
     * Sets the appManagementPackageFamilyNamesToLaunchAfterLogOn property value. List of semi-colon delimited Package Family Names of Windows apps. Listed Windows apps are to be launched after logon.
     * @param value Value to set for the appManagementPackageFamilyNamesToLaunchAfterLogOn property.
     */
    public void setAppManagementPackageFamilyNamesToLaunchAfterLogOn(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("appManagementPackageFamilyNamesToLaunchAfterLogOn", value);
    }
    /**
     * Sets the appsAllowTrustedAppsSideloading property value. State Management Setting.
     * @param value Value to set for the appsAllowTrustedAppsSideloading property.
     */
    public void setAppsAllowTrustedAppsSideloading(@jakarta.annotation.Nullable final StateManagementSetting value) {
        this.backingStore.set("appsAllowTrustedAppsSideloading", value);
    }
    /**
     * Sets the appsBlockWindowsStoreOriginatedApps property value. Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded.
     * @param value Value to set for the appsBlockWindowsStoreOriginatedApps property.
     */
    public void setAppsBlockWindowsStoreOriginatedApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appsBlockWindowsStoreOriginatedApps", value);
    }
    /**
     * Sets the authenticationAllowSecondaryDevice property value. Allows secondary authentication devices to work with Windows.
     * @param value Value to set for the authenticationAllowSecondaryDevice property.
     */
    public void setAuthenticationAllowSecondaryDevice(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("authenticationAllowSecondaryDevice", value);
    }
    /**
     * Sets the authenticationPreferredAzureADTenantDomainName property value. Specifies the preferred domain among available domains in the Azure AD tenant.
     * @param value Value to set for the authenticationPreferredAzureADTenantDomainName property.
     */
    public void setAuthenticationPreferredAzureADTenantDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("authenticationPreferredAzureADTenantDomainName", value);
    }
    /**
     * Sets the authenticationWebSignIn property value. Possible values of a property
     * @param value Value to set for the authenticationWebSignIn property.
     */
    public void setAuthenticationWebSignIn(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("authenticationWebSignIn", value);
    }
    /**
     * Sets the bluetoothAllowedServices property value. Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
     * @param value Value to set for the bluetoothAllowedServices property.
     */
    public void setBluetoothAllowedServices(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("bluetoothAllowedServices", value);
    }
    /**
     * Sets the bluetoothBlockAdvertising property value. Whether or not to Block the user from using bluetooth advertising.
     * @param value Value to set for the bluetoothBlockAdvertising property.
     */
    public void setBluetoothBlockAdvertising(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bluetoothBlockAdvertising", value);
    }
    /**
     * Sets the bluetoothBlockDiscoverableMode property value. Whether or not to Block the user from using bluetooth discoverable mode.
     * @param value Value to set for the bluetoothBlockDiscoverableMode property.
     */
    public void setBluetoothBlockDiscoverableMode(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bluetoothBlockDiscoverableMode", value);
    }
    /**
     * Sets the bluetoothBlocked property value. Whether or not to Block the user from using bluetooth.
     * @param value Value to set for the bluetoothBlocked property.
     */
    public void setBluetoothBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bluetoothBlocked", value);
    }
    /**
     * Sets the bluetoothBlockPrePairing property value. Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
     * @param value Value to set for the bluetoothBlockPrePairing property.
     */
    public void setBluetoothBlockPrePairing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bluetoothBlockPrePairing", value);
    }
    /**
     * Sets the bluetoothBlockPromptedProximalConnections property value. Whether or not to block the users from using Swift Pair and other proximity based scenarios.
     * @param value Value to set for the bluetoothBlockPromptedProximalConnections property.
     */
    public void setBluetoothBlockPromptedProximalConnections(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bluetoothBlockPromptedProximalConnections", value);
    }
    /**
     * Sets the cameraBlocked property value. Whether or not to Block the user from accessing the camera of the device.
     * @param value Value to set for the cameraBlocked property.
     */
    public void setCameraBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cameraBlocked", value);
    }
    /**
     * Sets the cellularBlockDataWhenRoaming property value. Whether or not to Block the user from using data over cellular while roaming.
     * @param value Value to set for the cellularBlockDataWhenRoaming property.
     */
    public void setCellularBlockDataWhenRoaming(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cellularBlockDataWhenRoaming", value);
    }
    /**
     * Sets the cellularBlockVpn property value. Whether or not to Block the user from using VPN over cellular.
     * @param value Value to set for the cellularBlockVpn property.
     */
    public void setCellularBlockVpn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cellularBlockVpn", value);
    }
    /**
     * Sets the cellularBlockVpnWhenRoaming property value. Whether or not to Block the user from using VPN when roaming over cellular.
     * @param value Value to set for the cellularBlockVpnWhenRoaming property.
     */
    public void setCellularBlockVpnWhenRoaming(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cellularBlockVpnWhenRoaming", value);
    }
    /**
     * Sets the cellularData property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the cellularData property.
     */
    public void setCellularData(@jakarta.annotation.Nullable final ConfigurationUsage value) {
        this.backingStore.set("cellularData", value);
    }
    /**
     * Sets the certificatesBlockManualRootCertificateInstallation property value. Whether or not to Block the user from doing manual root certificate installation.
     * @param value Value to set for the certificatesBlockManualRootCertificateInstallation property.
     */
    public void setCertificatesBlockManualRootCertificateInstallation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("certificatesBlockManualRootCertificateInstallation", value);
    }
    /**
     * Sets the configureTimeZone property value. Specifies the time zone to be applied to the device. This is the standard Windows name for the target time zone.
     * @param value Value to set for the configureTimeZone property.
     */
    public void setConfigureTimeZone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("configureTimeZone", value);
    }
    /**
     * Sets the connectedDevicesServiceBlocked property value. Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences.
     * @param value Value to set for the connectedDevicesServiceBlocked property.
     */
    public void setConnectedDevicesServiceBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("connectedDevicesServiceBlocked", value);
    }
    /**
     * Sets the copyPasteBlocked property value. Whether or not to Block the user from using copy paste.
     * @param value Value to set for the copyPasteBlocked property.
     */
    public void setCopyPasteBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("copyPasteBlocked", value);
    }
    /**
     * Sets the cortanaBlocked property value. Whether or not to Block the user from using Cortana.
     * @param value Value to set for the cortanaBlocked property.
     */
    public void setCortanaBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cortanaBlocked", value);
    }
    /**
     * Sets the cryptographyAllowFipsAlgorithmPolicy property value. Specify whether to allow or disallow the Federal Information Processing Standard (FIPS) policy.
     * @param value Value to set for the cryptographyAllowFipsAlgorithmPolicy property.
     */
    public void setCryptographyAllowFipsAlgorithmPolicy(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cryptographyAllowFipsAlgorithmPolicy", value);
    }
    /**
     * Sets the dataProtectionBlockDirectMemoryAccess property value. This policy setting allows you to block direct memory access (DMA) for all hot pluggable PCI downstream ports until a user logs into Windows.
     * @param value Value to set for the dataProtectionBlockDirectMemoryAccess property.
     */
    public void setDataProtectionBlockDirectMemoryAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("dataProtectionBlockDirectMemoryAccess", value);
    }
    /**
     * Sets the defenderBlockEndUserAccess property value. Whether or not to block end user access to Defender.
     * @param value Value to set for the defenderBlockEndUserAccess property.
     */
    public void setDefenderBlockEndUserAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderBlockEndUserAccess", value);
    }
    /**
     * Sets the defenderBlockOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @param value Value to set for the defenderBlockOnAccessProtection property.
     */
    public void setDefenderBlockOnAccessProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderBlockOnAccessProtection", value);
    }
    /**
     * Sets the defenderCloudBlockLevel property value. Possible values of Cloud Block Level
     * @param value Value to set for the defenderCloudBlockLevel property.
     */
    public void setDefenderCloudBlockLevel(@jakarta.annotation.Nullable final DefenderCloudBlockLevelType value) {
        this.backingStore.set("defenderCloudBlockLevel", value);
    }
    /**
     * Sets the defenderCloudExtendedTimeout property value. Timeout extension for file scanning by the cloud. Valid values 0 to 50
     * @param value Value to set for the defenderCloudExtendedTimeout property.
     */
    public void setDefenderCloudExtendedTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("defenderCloudExtendedTimeout", value);
    }
    /**
     * Sets the defenderCloudExtendedTimeoutInSeconds property value. Timeout extension for file scanning by the cloud. Valid values 0 to 50
     * @param value Value to set for the defenderCloudExtendedTimeoutInSeconds property.
     */
    public void setDefenderCloudExtendedTimeoutInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("defenderCloudExtendedTimeoutInSeconds", value);
    }
    /**
     * Sets the defenderDaysBeforeDeletingQuarantinedMalware property value. Number of days before deleting quarantined malware. Valid values 0 to 90
     * @param value Value to set for the defenderDaysBeforeDeletingQuarantinedMalware property.
     */
    public void setDefenderDaysBeforeDeletingQuarantinedMalware(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("defenderDaysBeforeDeletingQuarantinedMalware", value);
    }
    /**
     * Sets the defenderDetectedMalwareActions property value. Gets or sets Defenders actions to take on detected Malware per threat level.
     * @param value Value to set for the defenderDetectedMalwareActions property.
     */
    public void setDefenderDetectedMalwareActions(@jakarta.annotation.Nullable final DefenderDetectedMalwareActions value) {
        this.backingStore.set("defenderDetectedMalwareActions", value);
    }
    /**
     * Sets the defenderDisableCatchupFullScan property value. When blocked, catch-up scans for scheduled full scans will be turned off.
     * @param value Value to set for the defenderDisableCatchupFullScan property.
     */
    public void setDefenderDisableCatchupFullScan(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderDisableCatchupFullScan", value);
    }
    /**
     * Sets the defenderDisableCatchupQuickScan property value. When blocked, catch-up scans for scheduled quick scans will be turned off.
     * @param value Value to set for the defenderDisableCatchupQuickScan property.
     */
    public void setDefenderDisableCatchupQuickScan(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderDisableCatchupQuickScan", value);
    }
    /**
     * Sets the defenderFileExtensionsToExclude property value. File extensions to exclude from scans and real time protection.
     * @param value Value to set for the defenderFileExtensionsToExclude property.
     */
    public void setDefenderFileExtensionsToExclude(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defenderFileExtensionsToExclude", value);
    }
    /**
     * Sets the defenderFilesAndFoldersToExclude property value. Files and folder to exclude from scans and real time protection.
     * @param value Value to set for the defenderFilesAndFoldersToExclude property.
     */
    public void setDefenderFilesAndFoldersToExclude(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defenderFilesAndFoldersToExclude", value);
    }
    /**
     * Sets the defenderMonitorFileActivity property value. Possible values for monitoring file activity.
     * @param value Value to set for the defenderMonitorFileActivity property.
     */
    public void setDefenderMonitorFileActivity(@jakarta.annotation.Nullable final DefenderMonitorFileActivity value) {
        this.backingStore.set("defenderMonitorFileActivity", value);
    }
    /**
     * Sets the defenderPotentiallyUnwantedAppAction property value. Gets or sets Defenders action to take on Potentially Unwanted Application (PUA), which includes software with behaviors of ad-injection, software bundling, persistent solicitation for payment or subscription, etc. Defender alerts user when PUA is being downloaded or attempts to install itself. Added in Windows 10 for desktop. Possible values are: deviceDefault, block, audit.
     * @param value Value to set for the defenderPotentiallyUnwantedAppAction property.
     */
    public void setDefenderPotentiallyUnwantedAppAction(@jakarta.annotation.Nullable final DefenderPotentiallyUnwantedAppAction value) {
        this.backingStore.set("defenderPotentiallyUnwantedAppAction", value);
    }
    /**
     * Sets the defenderPotentiallyUnwantedAppActionSetting property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderPotentiallyUnwantedAppActionSetting property.
     */
    public void setDefenderPotentiallyUnwantedAppActionSetting(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderPotentiallyUnwantedAppActionSetting", value);
    }
    /**
     * Sets the defenderProcessesToExclude property value. Processes to exclude from scans and real time protection.
     * @param value Value to set for the defenderProcessesToExclude property.
     */
    public void setDefenderProcessesToExclude(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defenderProcessesToExclude", value);
    }
    /**
     * Sets the defenderPromptForSampleSubmission property value. Possible values for prompting user for samples submission.
     * @param value Value to set for the defenderPromptForSampleSubmission property.
     */
    public void setDefenderPromptForSampleSubmission(@jakarta.annotation.Nullable final DefenderPromptForSampleSubmission value) {
        this.backingStore.set("defenderPromptForSampleSubmission", value);
    }
    /**
     * Sets the defenderRequireBehaviorMonitoring property value. Indicates whether or not to require behavior monitoring.
     * @param value Value to set for the defenderRequireBehaviorMonitoring property.
     */
    public void setDefenderRequireBehaviorMonitoring(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderRequireBehaviorMonitoring", value);
    }
    /**
     * Sets the defenderRequireCloudProtection property value. Indicates whether or not to require cloud protection.
     * @param value Value to set for the defenderRequireCloudProtection property.
     */
    public void setDefenderRequireCloudProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderRequireCloudProtection", value);
    }
    /**
     * Sets the defenderRequireNetworkInspectionSystem property value. Indicates whether or not to require network inspection system.
     * @param value Value to set for the defenderRequireNetworkInspectionSystem property.
     */
    public void setDefenderRequireNetworkInspectionSystem(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderRequireNetworkInspectionSystem", value);
    }
    /**
     * Sets the defenderRequireRealTimeMonitoring property value. Indicates whether or not to require real time monitoring.
     * @param value Value to set for the defenderRequireRealTimeMonitoring property.
     */
    public void setDefenderRequireRealTimeMonitoring(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderRequireRealTimeMonitoring", value);
    }
    /**
     * Sets the defenderScanArchiveFiles property value. Indicates whether or not to scan archive files.
     * @param value Value to set for the defenderScanArchiveFiles property.
     */
    public void setDefenderScanArchiveFiles(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderScanArchiveFiles", value);
    }
    /**
     * Sets the defenderScanDownloads property value. Indicates whether or not to scan downloads.
     * @param value Value to set for the defenderScanDownloads property.
     */
    public void setDefenderScanDownloads(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderScanDownloads", value);
    }
    /**
     * Sets the defenderScanIncomingMail property value. Indicates whether or not to scan incoming mail messages.
     * @param value Value to set for the defenderScanIncomingMail property.
     */
    public void setDefenderScanIncomingMail(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderScanIncomingMail", value);
    }
    /**
     * Sets the defenderScanMappedNetworkDrivesDuringFullScan property value. Indicates whether or not to scan mapped network drives during full scan.
     * @param value Value to set for the defenderScanMappedNetworkDrivesDuringFullScan property.
     */
    public void setDefenderScanMappedNetworkDrivesDuringFullScan(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderScanMappedNetworkDrivesDuringFullScan", value);
    }
    /**
     * Sets the defenderScanMaxCpu property value. Max CPU usage percentage during scan. Valid values 0 to 100
     * @param value Value to set for the defenderScanMaxCpu property.
     */
    public void setDefenderScanMaxCpu(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("defenderScanMaxCpu", value);
    }
    /**
     * Sets the defenderScanNetworkFiles property value. Indicates whether or not to scan files opened from a network folder.
     * @param value Value to set for the defenderScanNetworkFiles property.
     */
    public void setDefenderScanNetworkFiles(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderScanNetworkFiles", value);
    }
    /**
     * Sets the defenderScanRemovableDrivesDuringFullScan property value. Indicates whether or not to scan removable drives during full scan.
     * @param value Value to set for the defenderScanRemovableDrivesDuringFullScan property.
     */
    public void setDefenderScanRemovableDrivesDuringFullScan(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderScanRemovableDrivesDuringFullScan", value);
    }
    /**
     * Sets the defenderScanScriptsLoadedInInternetExplorer property value. Indicates whether or not to scan scripts loaded in Internet Explorer browser.
     * @param value Value to set for the defenderScanScriptsLoadedInInternetExplorer property.
     */
    public void setDefenderScanScriptsLoadedInInternetExplorer(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderScanScriptsLoadedInInternetExplorer", value);
    }
    /**
     * Sets the defenderScanType property value. Possible values for system scan type.
     * @param value Value to set for the defenderScanType property.
     */
    public void setDefenderScanType(@jakarta.annotation.Nullable final DefenderScanType value) {
        this.backingStore.set("defenderScanType", value);
    }
    /**
     * Sets the defenderScheduledQuickScanTime property value. The time to perform a daily quick scan.
     * @param value Value to set for the defenderScheduledQuickScanTime property.
     */
    public void setDefenderScheduledQuickScanTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("defenderScheduledQuickScanTime", value);
    }
    /**
     * Sets the defenderScheduledScanTime property value. The defender time for the system scan.
     * @param value Value to set for the defenderScheduledScanTime property.
     */
    public void setDefenderScheduledScanTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("defenderScheduledScanTime", value);
    }
    /**
     * Sets the defenderScheduleScanEnableLowCpuPriority property value. When enabled, low CPU priority will be used during scheduled scans.
     * @param value Value to set for the defenderScheduleScanEnableLowCpuPriority property.
     */
    public void setDefenderScheduleScanEnableLowCpuPriority(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderScheduleScanEnableLowCpuPriority", value);
    }
    /**
     * Sets the defenderSignatureUpdateIntervalInHours property value. The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
     * @param value Value to set for the defenderSignatureUpdateIntervalInHours property.
     */
    public void setDefenderSignatureUpdateIntervalInHours(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("defenderSignatureUpdateIntervalInHours", value);
    }
    /**
     * Sets the defenderSubmitSamplesConsentType property value. Checks for the user consent level in Windows Defender to send data. Possible values are: sendSafeSamplesAutomatically, alwaysPrompt, neverSend, sendAllSamplesAutomatically.
     * @param value Value to set for the defenderSubmitSamplesConsentType property.
     */
    public void setDefenderSubmitSamplesConsentType(@jakarta.annotation.Nullable final DefenderSubmitSamplesConsentType value) {
        this.backingStore.set("defenderSubmitSamplesConsentType", value);
    }
    /**
     * Sets the defenderSystemScanSchedule property value. Possible values for a weekly schedule.
     * @param value Value to set for the defenderSystemScanSchedule property.
     */
    public void setDefenderSystemScanSchedule(@jakarta.annotation.Nullable final WeeklySchedule value) {
        this.backingStore.set("defenderSystemScanSchedule", value);
    }
    /**
     * Sets the developerUnlockSetting property value. State Management Setting.
     * @param value Value to set for the developerUnlockSetting property.
     */
    public void setDeveloperUnlockSetting(@jakarta.annotation.Nullable final StateManagementSetting value) {
        this.backingStore.set("developerUnlockSetting", value);
    }
    /**
     * Sets the deviceManagementBlockFactoryResetOnMobile property value. Indicates whether or not to Block the user from resetting their phone.
     * @param value Value to set for the deviceManagementBlockFactoryResetOnMobile property.
     */
    public void setDeviceManagementBlockFactoryResetOnMobile(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceManagementBlockFactoryResetOnMobile", value);
    }
    /**
     * Sets the deviceManagementBlockManualUnenroll property value. Indicates whether or not to Block the user from doing manual un-enrollment from device management.
     * @param value Value to set for the deviceManagementBlockManualUnenroll property.
     */
    public void setDeviceManagementBlockManualUnenroll(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceManagementBlockManualUnenroll", value);
    }
    /**
     * Sets the diagnosticsDataSubmissionMode property value. Allow the device to send diagnostic and usage telemetry data, such as Watson.
     * @param value Value to set for the diagnosticsDataSubmissionMode property.
     */
    public void setDiagnosticsDataSubmissionMode(@jakarta.annotation.Nullable final DiagnosticDataSubmissionMode value) {
        this.backingStore.set("diagnosticsDataSubmissionMode", value);
    }
    /**
     * Sets the displayAppListWithGdiDPIScalingTurnedOff property value. List of legacy applications that have GDI DPI Scaling turned off.
     * @param value Value to set for the displayAppListWithGdiDPIScalingTurnedOff property.
     */
    public void setDisplayAppListWithGdiDPIScalingTurnedOff(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("displayAppListWithGdiDPIScalingTurnedOff", value);
    }
    /**
     * Sets the displayAppListWithGdiDPIScalingTurnedOn property value. List of legacy applications that have GDI DPI Scaling turned on.
     * @param value Value to set for the displayAppListWithGdiDPIScalingTurnedOn property.
     */
    public void setDisplayAppListWithGdiDPIScalingTurnedOn(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("displayAppListWithGdiDPIScalingTurnedOn", value);
    }
    /**
     * Sets the edgeAllowStartPagesModification property value. Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge.
     * @param value Value to set for the edgeAllowStartPagesModification property.
     */
    public void setEdgeAllowStartPagesModification(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeAllowStartPagesModification", value);
    }
    /**
     * Sets the edgeBlockAccessToAboutFlags property value. Indicates whether or not to prevent access to about flags on Edge browser.
     * @param value Value to set for the edgeBlockAccessToAboutFlags property.
     */
    public void setEdgeBlockAccessToAboutFlags(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockAccessToAboutFlags", value);
    }
    /**
     * Sets the edgeBlockAddressBarDropdown property value. Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services.
     * @param value Value to set for the edgeBlockAddressBarDropdown property.
     */
    public void setEdgeBlockAddressBarDropdown(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockAddressBarDropdown", value);
    }
    /**
     * Sets the edgeBlockAutofill property value. Indicates whether or not to block auto fill.
     * @param value Value to set for the edgeBlockAutofill property.
     */
    public void setEdgeBlockAutofill(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockAutofill", value);
    }
    /**
     * Sets the edgeBlockCompatibilityList property value. Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues.
     * @param value Value to set for the edgeBlockCompatibilityList property.
     */
    public void setEdgeBlockCompatibilityList(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockCompatibilityList", value);
    }
    /**
     * Sets the edgeBlockDeveloperTools property value. Indicates whether or not to block developer tools in the Edge browser.
     * @param value Value to set for the edgeBlockDeveloperTools property.
     */
    public void setEdgeBlockDeveloperTools(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockDeveloperTools", value);
    }
    /**
     * Sets the edgeBlocked property value. Indicates whether or not to Block the user from using the Edge browser.
     * @param value Value to set for the edgeBlocked property.
     */
    public void setEdgeBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlocked", value);
    }
    /**
     * Sets the edgeBlockEditFavorites property value. Indicates whether or not to Block the user from making changes to Favorites.
     * @param value Value to set for the edgeBlockEditFavorites property.
     */
    public void setEdgeBlockEditFavorites(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockEditFavorites", value);
    }
    /**
     * Sets the edgeBlockExtensions property value. Indicates whether or not to block extensions in the Edge browser.
     * @param value Value to set for the edgeBlockExtensions property.
     */
    public void setEdgeBlockExtensions(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockExtensions", value);
    }
    /**
     * Sets the edgeBlockFullScreenMode property value. Allow or prevent Edge from entering the full screen mode.
     * @param value Value to set for the edgeBlockFullScreenMode property.
     */
    public void setEdgeBlockFullScreenMode(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockFullScreenMode", value);
    }
    /**
     * Sets the edgeBlockInPrivateBrowsing property value. Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
     * @param value Value to set for the edgeBlockInPrivateBrowsing property.
     */
    public void setEdgeBlockInPrivateBrowsing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockInPrivateBrowsing", value);
    }
    /**
     * Sets the edgeBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @param value Value to set for the edgeBlockJavaScript property.
     */
    public void setEdgeBlockJavaScript(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockJavaScript", value);
    }
    /**
     * Sets the edgeBlockLiveTileDataCollection property value. Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge.
     * @param value Value to set for the edgeBlockLiveTileDataCollection property.
     */
    public void setEdgeBlockLiveTileDataCollection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockLiveTileDataCollection", value);
    }
    /**
     * Sets the edgeBlockPasswordManager property value. Indicates whether or not to Block password manager.
     * @param value Value to set for the edgeBlockPasswordManager property.
     */
    public void setEdgeBlockPasswordManager(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockPasswordManager", value);
    }
    /**
     * Sets the edgeBlockPopups property value. Indicates whether or not to block popups.
     * @param value Value to set for the edgeBlockPopups property.
     */
    public void setEdgeBlockPopups(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockPopups", value);
    }
    /**
     * Sets the edgeBlockPrelaunch property value. Decide whether Microsoft Edge is prelaunched at Windows startup.
     * @param value Value to set for the edgeBlockPrelaunch property.
     */
    public void setEdgeBlockPrelaunch(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockPrelaunch", value);
    }
    /**
     * Sets the edgeBlockPrinting property value. Configure Edge to allow or block printing.
     * @param value Value to set for the edgeBlockPrinting property.
     */
    public void setEdgeBlockPrinting(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockPrinting", value);
    }
    /**
     * Sets the edgeBlockSavingHistory property value. Configure Edge to allow browsing history to be saved or to never save browsing history.
     * @param value Value to set for the edgeBlockSavingHistory property.
     */
    public void setEdgeBlockSavingHistory(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockSavingHistory", value);
    }
    /**
     * Sets the edgeBlockSearchEngineCustomization property value. Indicates whether or not to block the user from adding new search engine or changing the default search engine.
     * @param value Value to set for the edgeBlockSearchEngineCustomization property.
     */
    public void setEdgeBlockSearchEngineCustomization(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockSearchEngineCustomization", value);
    }
    /**
     * Sets the edgeBlockSearchSuggestions property value. Indicates whether or not to block the user from using the search suggestions in the address bar.
     * @param value Value to set for the edgeBlockSearchSuggestions property.
     */
    public void setEdgeBlockSearchSuggestions(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockSearchSuggestions", value);
    }
    /**
     * Sets the edgeBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @param value Value to set for the edgeBlockSendingDoNotTrackHeader property.
     */
    public void setEdgeBlockSendingDoNotTrackHeader(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockSendingDoNotTrackHeader", value);
    }
    /**
     * Sets the edgeBlockSendingIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
     * @param value Value to set for the edgeBlockSendingIntranetTrafficToInternetExplorer property.
     */
    public void setEdgeBlockSendingIntranetTrafficToInternetExplorer(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockSendingIntranetTrafficToInternetExplorer", value);
    }
    /**
     * Sets the edgeBlockSideloadingExtensions property value. Indicates whether the user can sideload extensions.
     * @param value Value to set for the edgeBlockSideloadingExtensions property.
     */
    public void setEdgeBlockSideloadingExtensions(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockSideloadingExtensions", value);
    }
    /**
     * Sets the edgeBlockTabPreloading property value. Configure whether Edge preloads the new tab page at Windows startup.
     * @param value Value to set for the edgeBlockTabPreloading property.
     */
    public void setEdgeBlockTabPreloading(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockTabPreloading", value);
    }
    /**
     * Sets the edgeBlockWebContentOnNewTabPage property value. Configure to load a blank page in Edge instead of the default New tab page and prevent users from changing it.
     * @param value Value to set for the edgeBlockWebContentOnNewTabPage property.
     */
    public void setEdgeBlockWebContentOnNewTabPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeBlockWebContentOnNewTabPage", value);
    }
    /**
     * Sets the edgeClearBrowsingDataOnExit property value. Clear browsing data on exiting Microsoft Edge.
     * @param value Value to set for the edgeClearBrowsingDataOnExit property.
     */
    public void setEdgeClearBrowsingDataOnExit(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeClearBrowsingDataOnExit", value);
    }
    /**
     * Sets the edgeCookiePolicy property value. Possible values to specify which cookies are allowed in Microsoft Edge.
     * @param value Value to set for the edgeCookiePolicy property.
     */
    public void setEdgeCookiePolicy(@jakarta.annotation.Nullable final EdgeCookiePolicy value) {
        this.backingStore.set("edgeCookiePolicy", value);
    }
    /**
     * Sets the edgeDisableFirstRunPage property value. Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page.
     * @param value Value to set for the edgeDisableFirstRunPage property.
     */
    public void setEdgeDisableFirstRunPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeDisableFirstRunPage", value);
    }
    /**
     * Sets the edgeEnterpriseModeSiteListLocation property value. Indicates the enterprise mode site list location. Could be a local file, local network or http location.
     * @param value Value to set for the edgeEnterpriseModeSiteListLocation property.
     */
    public void setEdgeEnterpriseModeSiteListLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("edgeEnterpriseModeSiteListLocation", value);
    }
    /**
     * Sets the edgeFavoritesBarVisibility property value. Generic visibility state.
     * @param value Value to set for the edgeFavoritesBarVisibility property.
     */
    public void setEdgeFavoritesBarVisibility(@jakarta.annotation.Nullable final VisibilitySetting value) {
        this.backingStore.set("edgeFavoritesBarVisibility", value);
    }
    /**
     * Sets the edgeFavoritesListLocation property value. The location of the favorites list to provision. Could be a local file, local network or http location.
     * @param value Value to set for the edgeFavoritesListLocation property.
     */
    public void setEdgeFavoritesListLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("edgeFavoritesListLocation", value);
    }
    /**
     * Sets the edgeFirstRunUrl property value. The first run URL for when Edge browser is opened for the first time.
     * @param value Value to set for the edgeFirstRunUrl property.
     */
    public void setEdgeFirstRunUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("edgeFirstRunUrl", value);
    }
    /**
     * Sets the edgeHomeButtonConfiguration property value. Causes the Home button to either hide, load the default Start page, load a New tab page, or a custom URL
     * @param value Value to set for the edgeHomeButtonConfiguration property.
     */
    public void setEdgeHomeButtonConfiguration(@jakarta.annotation.Nullable final EdgeHomeButtonConfiguration value) {
        this.backingStore.set("edgeHomeButtonConfiguration", value);
    }
    /**
     * Sets the edgeHomeButtonConfigurationEnabled property value. Enable the Home button configuration.
     * @param value Value to set for the edgeHomeButtonConfigurationEnabled property.
     */
    public void setEdgeHomeButtonConfigurationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeHomeButtonConfigurationEnabled", value);
    }
    /**
     * Sets the edgeHomepageUrls property value. The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
     * @param value Value to set for the edgeHomepageUrls property.
     */
    public void setEdgeHomepageUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("edgeHomepageUrls", value);
    }
    /**
     * Sets the edgeKioskModeRestriction property value. Specify how the Microsoft Edge settings are restricted based on kiosk mode.
     * @param value Value to set for the edgeKioskModeRestriction property.
     */
    public void setEdgeKioskModeRestriction(@jakarta.annotation.Nullable final EdgeKioskModeRestrictionType value) {
        this.backingStore.set("edgeKioskModeRestriction", value);
    }
    /**
     * Sets the edgeKioskResetAfterIdleTimeInMinutes property value. Specifies the time in minutes from the last user activity before Microsoft Edge kiosk resets.  Valid values are 0-1440. The default is 5. 0 indicates no reset. Valid values 0 to 1440
     * @param value Value to set for the edgeKioskResetAfterIdleTimeInMinutes property.
     */
    public void setEdgeKioskResetAfterIdleTimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("edgeKioskResetAfterIdleTimeInMinutes", value);
    }
    /**
     * Sets the edgeNewTabPageURL property value. Specify the page opened when new tabs are created.
     * @param value Value to set for the edgeNewTabPageURL property.
     */
    public void setEdgeNewTabPageURL(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("edgeNewTabPageURL", value);
    }
    /**
     * Sets the edgeOpensWith property value. Possible values for the EdgeOpensWith setting.
     * @param value Value to set for the edgeOpensWith property.
     */
    public void setEdgeOpensWith(@jakarta.annotation.Nullable final EdgeOpenOptions value) {
        this.backingStore.set("edgeOpensWith", value);
    }
    /**
     * Sets the edgePreventCertificateErrorOverride property value. Allow or prevent users from overriding certificate errors.
     * @param value Value to set for the edgePreventCertificateErrorOverride property.
     */
    public void setEdgePreventCertificateErrorOverride(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgePreventCertificateErrorOverride", value);
    }
    /**
     * Sets the edgeRequiredExtensionPackageFamilyNames property value. Specify the list of package family names of browser extensions that are required and cannot be turned off by the user.
     * @param value Value to set for the edgeRequiredExtensionPackageFamilyNames property.
     */
    public void setEdgeRequiredExtensionPackageFamilyNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("edgeRequiredExtensionPackageFamilyNames", value);
    }
    /**
     * Sets the edgeRequireSmartScreen property value. Indicates whether or not to Require the user to use the smart screen filter.
     * @param value Value to set for the edgeRequireSmartScreen property.
     */
    public void setEdgeRequireSmartScreen(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeRequireSmartScreen", value);
    }
    /**
     * Sets the edgeSearchEngine property value. Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set.
     * @param value Value to set for the edgeSearchEngine property.
     */
    public void setEdgeSearchEngine(@jakarta.annotation.Nullable final EdgeSearchEngineBase value) {
        this.backingStore.set("edgeSearchEngine", value);
    }
    /**
     * Sets the edgeSendIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
     * @param value Value to set for the edgeSendIntranetTrafficToInternetExplorer property.
     */
    public void setEdgeSendIntranetTrafficToInternetExplorer(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeSendIntranetTrafficToInternetExplorer", value);
    }
    /**
     * Sets the edgeShowMessageWhenOpeningInternetExplorerSites property value. What message will be displayed by Edge before switching to Internet Explorer.
     * @param value Value to set for the edgeShowMessageWhenOpeningInternetExplorerSites property.
     */
    public void setEdgeShowMessageWhenOpeningInternetExplorerSites(@jakarta.annotation.Nullable final InternetExplorerMessageSetting value) {
        this.backingStore.set("edgeShowMessageWhenOpeningInternetExplorerSites", value);
    }
    /**
     * Sets the edgeSyncFavoritesWithInternetExplorer property value. Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers.
     * @param value Value to set for the edgeSyncFavoritesWithInternetExplorer property.
     */
    public void setEdgeSyncFavoritesWithInternetExplorer(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("edgeSyncFavoritesWithInternetExplorer", value);
    }
    /**
     * Sets the edgeTelemetryForMicrosoft365Analytics property value. Type of browsing data sent to Microsoft 365 analytics
     * @param value Value to set for the edgeTelemetryForMicrosoft365Analytics property.
     */
    public void setEdgeTelemetryForMicrosoft365Analytics(@jakarta.annotation.Nullable final EdgeTelemetryMode value) {
        this.backingStore.set("edgeTelemetryForMicrosoft365Analytics", value);
    }
    /**
     * Sets the enableAutomaticRedeployment property value. Allow users with administrative rights to delete all user data and settings using CTRL + Win + R at the device lock screen so that the device can be automatically re-configured and re-enrolled into management.
     * @param value Value to set for the enableAutomaticRedeployment property.
     */
    public void setEnableAutomaticRedeployment(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enableAutomaticRedeployment", value);
    }
    /**
     * Sets the energySaverOnBatteryThresholdPercentage property value. This setting allows you to specify battery charge level at which Energy Saver is turned on. While on battery, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100
     * @param value Value to set for the energySaverOnBatteryThresholdPercentage property.
     */
    public void setEnergySaverOnBatteryThresholdPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("energySaverOnBatteryThresholdPercentage", value);
    }
    /**
     * Sets the energySaverPluggedInThresholdPercentage property value. This setting allows you to specify battery charge level at which Energy Saver is turned on. While plugged in, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100
     * @param value Value to set for the energySaverPluggedInThresholdPercentage property.
     */
    public void setEnergySaverPluggedInThresholdPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("energySaverPluggedInThresholdPercentage", value);
    }
    /**
     * Sets the enterpriseCloudPrintDiscoveryEndPoint property value. Endpoint for discovering cloud printers.
     * @param value Value to set for the enterpriseCloudPrintDiscoveryEndPoint property.
     */
    public void setEnterpriseCloudPrintDiscoveryEndPoint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("enterpriseCloudPrintDiscoveryEndPoint", value);
    }
    /**
     * Sets the enterpriseCloudPrintDiscoveryMaxLimit property value. Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535
     * @param value Value to set for the enterpriseCloudPrintDiscoveryMaxLimit property.
     */
    public void setEnterpriseCloudPrintDiscoveryMaxLimit(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("enterpriseCloudPrintDiscoveryMaxLimit", value);
    }
    /**
     * Sets the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property value. OAuth resource URI for printer discovery service as configured in Azure portal.
     * @param value Value to set for the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property.
     */
    public void setEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier", value);
    }
    /**
     * Sets the enterpriseCloudPrintOAuthAuthority property value. Authentication endpoint for acquiring OAuth tokens.
     * @param value Value to set for the enterpriseCloudPrintOAuthAuthority property.
     */
    public void setEnterpriseCloudPrintOAuthAuthority(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("enterpriseCloudPrintOAuthAuthority", value);
    }
    /**
     * Sets the enterpriseCloudPrintOAuthClientIdentifier property value. GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
     * @param value Value to set for the enterpriseCloudPrintOAuthClientIdentifier property.
     */
    public void setEnterpriseCloudPrintOAuthClientIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("enterpriseCloudPrintOAuthClientIdentifier", value);
    }
    /**
     * Sets the enterpriseCloudPrintResourceIdentifier property value. OAuth resource URI for print service as configured in the Azure portal.
     * @param value Value to set for the enterpriseCloudPrintResourceIdentifier property.
     */
    public void setEnterpriseCloudPrintResourceIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("enterpriseCloudPrintResourceIdentifier", value);
    }
    /**
     * Sets the experienceBlockDeviceDiscovery property value. Indicates whether or not to enable device discovery UX.
     * @param value Value to set for the experienceBlockDeviceDiscovery property.
     */
    public void setExperienceBlockDeviceDiscovery(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("experienceBlockDeviceDiscovery", value);
    }
    /**
     * Sets the experienceBlockErrorDialogWhenNoSIM property value. Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
     * @param value Value to set for the experienceBlockErrorDialogWhenNoSIM property.
     */
    public void setExperienceBlockErrorDialogWhenNoSIM(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("experienceBlockErrorDialogWhenNoSIM", value);
    }
    /**
     * Sets the experienceBlockTaskSwitcher property value. Indicates whether or not to enable task switching on the device.
     * @param value Value to set for the experienceBlockTaskSwitcher property.
     */
    public void setExperienceBlockTaskSwitcher(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("experienceBlockTaskSwitcher", value);
    }
    /**
     * Sets the experienceDoNotSyncBrowserSettings property value. Allow(Not Configured) or prevent(Block) the syncing of Microsoft Edge Browser settings. Option to prevent syncing across devices, but allow user override.
     * @param value Value to set for the experienceDoNotSyncBrowserSettings property.
     */
    public void setExperienceDoNotSyncBrowserSettings(@jakarta.annotation.Nullable final BrowserSyncSetting value) {
        this.backingStore.set("experienceDoNotSyncBrowserSettings", value);
    }
    /**
     * Sets the findMyFiles property value. Possible values of a property
     * @param value Value to set for the findMyFiles property.
     */
    public void setFindMyFiles(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("findMyFiles", value);
    }
    /**
     * Sets the gameDvrBlocked property value. Indicates whether or not to block DVR and broadcasting.
     * @param value Value to set for the gameDvrBlocked property.
     */
    public void setGameDvrBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("gameDvrBlocked", value);
    }
    /**
     * Sets the inkWorkspaceAccess property value. Values for the InkWorkspaceAccess setting.
     * @param value Value to set for the inkWorkspaceAccess property.
     */
    public void setInkWorkspaceAccess(@jakarta.annotation.Nullable final InkAccessSetting value) {
        this.backingStore.set("inkWorkspaceAccess", value);
    }
    /**
     * Sets the inkWorkspaceAccessState property value. State Management Setting.
     * @param value Value to set for the inkWorkspaceAccessState property.
     */
    public void setInkWorkspaceAccessState(@jakarta.annotation.Nullable final StateManagementSetting value) {
        this.backingStore.set("inkWorkspaceAccessState", value);
    }
    /**
     * Sets the inkWorkspaceBlockSuggestedApps property value. Specify whether to show recommended app suggestions in the ink workspace.
     * @param value Value to set for the inkWorkspaceBlockSuggestedApps property.
     */
    public void setInkWorkspaceBlockSuggestedApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("inkWorkspaceBlockSuggestedApps", value);
    }
    /**
     * Sets the internetSharingBlocked property value. Indicates whether or not to Block the user from using internet sharing.
     * @param value Value to set for the internetSharingBlocked property.
     */
    public void setInternetSharingBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("internetSharingBlocked", value);
    }
    /**
     * Sets the locationServicesBlocked property value. Indicates whether or not to Block the user from location services.
     * @param value Value to set for the locationServicesBlocked property.
     */
    public void setLocationServicesBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("locationServicesBlocked", value);
    }
    /**
     * Sets the lockScreenActivateAppsWithVoice property value. Possible values of a property
     * @param value Value to set for the lockScreenActivateAppsWithVoice property.
     */
    public void setLockScreenActivateAppsWithVoice(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("lockScreenActivateAppsWithVoice", value);
    }
    /**
     * Sets the lockScreenAllowTimeoutConfiguration property value. Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
     * @param value Value to set for the lockScreenAllowTimeoutConfiguration property.
     */
    public void setLockScreenAllowTimeoutConfiguration(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("lockScreenAllowTimeoutConfiguration", value);
    }
    /**
     * Sets the lockScreenBlockActionCenterNotifications property value. Indicates whether or not to block action center notifications over lock screen.
     * @param value Value to set for the lockScreenBlockActionCenterNotifications property.
     */
    public void setLockScreenBlockActionCenterNotifications(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("lockScreenBlockActionCenterNotifications", value);
    }
    /**
     * Sets the lockScreenBlockCortana property value. Indicates whether or not the user can interact with Cortana using speech while the system is locked.
     * @param value Value to set for the lockScreenBlockCortana property.
     */
    public void setLockScreenBlockCortana(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("lockScreenBlockCortana", value);
    }
    /**
     * Sets the lockScreenBlockToastNotifications property value. Indicates whether to allow toast notifications above the device lock screen.
     * @param value Value to set for the lockScreenBlockToastNotifications property.
     */
    public void setLockScreenBlockToastNotifications(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("lockScreenBlockToastNotifications", value);
    }
    /**
     * Sets the lockScreenTimeoutInSeconds property value. Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800
     * @param value Value to set for the lockScreenTimeoutInSeconds property.
     */
    public void setLockScreenTimeoutInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("lockScreenTimeoutInSeconds", value);
    }
    /**
     * Sets the logonBlockFastUserSwitching property value. Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
     * @param value Value to set for the logonBlockFastUserSwitching property.
     */
    public void setLogonBlockFastUserSwitching(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("logonBlockFastUserSwitching", value);
    }
    /**
     * Sets the messagingBlockMMS property value. Indicates whether or not to block the MMS send/receive functionality on the device.
     * @param value Value to set for the messagingBlockMMS property.
     */
    public void setMessagingBlockMMS(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("messagingBlockMMS", value);
    }
    /**
     * Sets the messagingBlockRichCommunicationServices property value. Indicates whether or not to block the RCS send/receive functionality on the device.
     * @param value Value to set for the messagingBlockRichCommunicationServices property.
     */
    public void setMessagingBlockRichCommunicationServices(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("messagingBlockRichCommunicationServices", value);
    }
    /**
     * Sets the messagingBlockSync property value. Indicates whether or not to block text message back up and restore and Messaging Everywhere.
     * @param value Value to set for the messagingBlockSync property.
     */
    public void setMessagingBlockSync(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("messagingBlockSync", value);
    }
    /**
     * Sets the microsoftAccountBlocked property value. Indicates whether or not to Block a Microsoft account.
     * @param value Value to set for the microsoftAccountBlocked property.
     */
    public void setMicrosoftAccountBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("microsoftAccountBlocked", value);
    }
    /**
     * Sets the microsoftAccountBlockSettingsSync property value. Indicates whether or not to Block Microsoft account settings sync.
     * @param value Value to set for the microsoftAccountBlockSettingsSync property.
     */
    public void setMicrosoftAccountBlockSettingsSync(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("microsoftAccountBlockSettingsSync", value);
    }
    /**
     * Sets the microsoftAccountSignInAssistantSettings property value. Values for the SignInAssistantSettings.
     * @param value Value to set for the microsoftAccountSignInAssistantSettings property.
     */
    public void setMicrosoftAccountSignInAssistantSettings(@jakarta.annotation.Nullable final SignInAssistantOptions value) {
        this.backingStore.set("microsoftAccountSignInAssistantSettings", value);
    }
    /**
     * Sets the networkProxyApplySettingsDeviceWide property value. If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account thats enrolled into MDM.
     * @param value Value to set for the networkProxyApplySettingsDeviceWide property.
     */
    public void setNetworkProxyApplySettingsDeviceWide(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("networkProxyApplySettingsDeviceWide", value);
    }
    /**
     * Sets the networkProxyAutomaticConfigurationUrl property value. Address to the proxy auto-config (PAC) script you want to use.
     * @param value Value to set for the networkProxyAutomaticConfigurationUrl property.
     */
    public void setNetworkProxyAutomaticConfigurationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkProxyAutomaticConfigurationUrl", value);
    }
    /**
     * Sets the networkProxyDisableAutoDetect property value. Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script.
     * @param value Value to set for the networkProxyDisableAutoDetect property.
     */
    public void setNetworkProxyDisableAutoDetect(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("networkProxyDisableAutoDetect", value);
    }
    /**
     * Sets the networkProxyServer property value. Specifies manual proxy server settings.
     * @param value Value to set for the networkProxyServer property.
     */
    public void setNetworkProxyServer(@jakarta.annotation.Nullable final Windows10NetworkProxyServer value) {
        this.backingStore.set("networkProxyServer", value);
    }
    /**
     * Sets the nfcBlocked property value. Indicates whether or not to Block the user from using near field communication.
     * @param value Value to set for the nfcBlocked property.
     */
    public void setNfcBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("nfcBlocked", value);
    }
    /**
     * Sets the oneDriveDisableFileSync property value. Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
     * @param value Value to set for the oneDriveDisableFileSync property.
     */
    public void setOneDriveDisableFileSync(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("oneDriveDisableFileSync", value);
    }
    /**
     * Sets the passwordBlockSimple property value. Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords.
     * @param value Value to set for the passwordBlockSimple property.
     */
    public void setPasswordBlockSimple(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordBlockSimple", value);
    }
    /**
     * Sets the passwordExpirationDays property value. The password expiration in days. Valid values 0 to 730
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordExpirationDays", value);
    }
    /**
     * Sets the passwordMinimumAgeInDays property value. This security setting determines the period of time (in days) that a password must be used before the user can change it. Valid values 0 to 998
     * @param value Value to set for the passwordMinimumAgeInDays property.
     */
    public void setPasswordMinimumAgeInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumAgeInDays", value);
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     */
    public void setPasswordMinimumCharacterSetCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumCharacterSetCount", value);
    }
    /**
     * Sets the passwordMinimumLength property value. The minimum password length. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumLength", value);
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     */
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinutesOfInactivityBeforeScreenTimeout", value);
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent reuse of. Valid values 0 to 50
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordPreviousPasswordBlockCount", value);
    }
    /**
     * Sets the passwordRequired property value. Indicates whether or not to require the user to have a password.
     * @param value Value to set for the passwordRequired property.
     */
    public void setPasswordRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordRequired", value);
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final RequiredPasswordType value) {
        this.backingStore.set("passwordRequiredType", value);
    }
    /**
     * Sets the passwordRequireWhenResumeFromIdleState property value. Indicates whether or not to require a password upon resuming from an idle state.
     * @param value Value to set for the passwordRequireWhenResumeFromIdleState property.
     */
    public void setPasswordRequireWhenResumeFromIdleState(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordRequireWhenResumeFromIdleState", value);
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset. Valid values 0 to 999
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     */
    public void setPasswordSignInFailureCountBeforeFactoryReset(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordSignInFailureCountBeforeFactoryReset", value);
    }
    /**
     * Sets the personalizationDesktopImageUrl property value. A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image.
     * @param value Value to set for the personalizationDesktopImageUrl property.
     */
    public void setPersonalizationDesktopImageUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("personalizationDesktopImageUrl", value);
    }
    /**
     * Sets the personalizationLockScreenImageUrl property value. A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a file Url to a local image on the file system that needs to be used as the Lock Screen Image.
     * @param value Value to set for the personalizationLockScreenImageUrl property.
     */
    public void setPersonalizationLockScreenImageUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("personalizationLockScreenImageUrl", value);
    }
    /**
     * Sets the powerButtonActionOnBattery property value. Power action types
     * @param value Value to set for the powerButtonActionOnBattery property.
     */
    public void setPowerButtonActionOnBattery(@jakarta.annotation.Nullable final PowerActionType value) {
        this.backingStore.set("powerButtonActionOnBattery", value);
    }
    /**
     * Sets the powerButtonActionPluggedIn property value. Power action types
     * @param value Value to set for the powerButtonActionPluggedIn property.
     */
    public void setPowerButtonActionPluggedIn(@jakarta.annotation.Nullable final PowerActionType value) {
        this.backingStore.set("powerButtonActionPluggedIn", value);
    }
    /**
     * Sets the powerHybridSleepOnBattery property value. Possible values of a property
     * @param value Value to set for the powerHybridSleepOnBattery property.
     */
    public void setPowerHybridSleepOnBattery(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("powerHybridSleepOnBattery", value);
    }
    /**
     * Sets the powerHybridSleepPluggedIn property value. Possible values of a property
     * @param value Value to set for the powerHybridSleepPluggedIn property.
     */
    public void setPowerHybridSleepPluggedIn(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("powerHybridSleepPluggedIn", value);
    }
    /**
     * Sets the powerLidCloseActionOnBattery property value. Power action types
     * @param value Value to set for the powerLidCloseActionOnBattery property.
     */
    public void setPowerLidCloseActionOnBattery(@jakarta.annotation.Nullable final PowerActionType value) {
        this.backingStore.set("powerLidCloseActionOnBattery", value);
    }
    /**
     * Sets the powerLidCloseActionPluggedIn property value. Power action types
     * @param value Value to set for the powerLidCloseActionPluggedIn property.
     */
    public void setPowerLidCloseActionPluggedIn(@jakarta.annotation.Nullable final PowerActionType value) {
        this.backingStore.set("powerLidCloseActionPluggedIn", value);
    }
    /**
     * Sets the powerSleepButtonActionOnBattery property value. Power action types
     * @param value Value to set for the powerSleepButtonActionOnBattery property.
     */
    public void setPowerSleepButtonActionOnBattery(@jakarta.annotation.Nullable final PowerActionType value) {
        this.backingStore.set("powerSleepButtonActionOnBattery", value);
    }
    /**
     * Sets the powerSleepButtonActionPluggedIn property value. Power action types
     * @param value Value to set for the powerSleepButtonActionPluggedIn property.
     */
    public void setPowerSleepButtonActionPluggedIn(@jakarta.annotation.Nullable final PowerActionType value) {
        this.backingStore.set("powerSleepButtonActionPluggedIn", value);
    }
    /**
     * Sets the printerBlockAddition property value. Prevent user installation of additional printers from printers settings.
     * @param value Value to set for the printerBlockAddition property.
     */
    public void setPrinterBlockAddition(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("printerBlockAddition", value);
    }
    /**
     * Sets the printerDefaultName property value. Name (network host name) of an installed printer.
     * @param value Value to set for the printerDefaultName property.
     */
    public void setPrinterDefaultName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("printerDefaultName", value);
    }
    /**
     * Sets the printerNames property value. Automatically provision printers based on their names (network host names).
     * @param value Value to set for the printerNames property.
     */
    public void setPrinterNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("printerNames", value);
    }
    /**
     * Sets the privacyAccessControls property value. Indicates a list of applications with their access control levels over privacy data categories, and/or the default access levels per category. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the privacyAccessControls property.
     */
    public void setPrivacyAccessControls(@jakarta.annotation.Nullable final java.util.List<WindowsPrivacyDataAccessControlItem> value) {
        this.backingStore.set("privacyAccessControls", value);
    }
    /**
     * Sets the privacyAdvertisingId property value. State Management Setting.
     * @param value Value to set for the privacyAdvertisingId property.
     */
    public void setPrivacyAdvertisingId(@jakarta.annotation.Nullable final StateManagementSetting value) {
        this.backingStore.set("privacyAdvertisingId", value);
    }
    /**
     * Sets the privacyAutoAcceptPairingAndConsentPrompts property value. Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps.
     * @param value Value to set for the privacyAutoAcceptPairingAndConsentPrompts property.
     */
    public void setPrivacyAutoAcceptPairingAndConsentPrompts(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("privacyAutoAcceptPairingAndConsentPrompts", value);
    }
    /**
     * Sets the privacyBlockActivityFeed property value. Blocks the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @param value Value to set for the privacyBlockActivityFeed property.
     */
    public void setPrivacyBlockActivityFeed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("privacyBlockActivityFeed", value);
    }
    /**
     * Sets the privacyBlockInputPersonalization property value. Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @param value Value to set for the privacyBlockInputPersonalization property.
     */
    public void setPrivacyBlockInputPersonalization(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("privacyBlockInputPersonalization", value);
    }
    /**
     * Sets the privacyBlockPublishUserActivities property value. Blocks the shared experiences/discovery of recently used resources in task switcher etc.
     * @param value Value to set for the privacyBlockPublishUserActivities property.
     */
    public void setPrivacyBlockPublishUserActivities(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("privacyBlockPublishUserActivities", value);
    }
    /**
     * Sets the privacyDisableLaunchExperience property value. This policy prevents the privacy experience from launching during user logon for new and upgraded users.
     * @param value Value to set for the privacyDisableLaunchExperience property.
     */
    public void setPrivacyDisableLaunchExperience(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("privacyDisableLaunchExperience", value);
    }
    /**
     * Sets the resetProtectionModeBlocked property value. Indicates whether or not to Block the user from reset protection mode.
     * @param value Value to set for the resetProtectionModeBlocked property.
     */
    public void setResetProtectionModeBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("resetProtectionModeBlocked", value);
    }
    /**
     * Sets the safeSearchFilter property value. Specifies what level of safe search (filtering adult content) is required
     * @param value Value to set for the safeSearchFilter property.
     */
    public void setSafeSearchFilter(@jakarta.annotation.Nullable final SafeSearchFilterType value) {
        this.backingStore.set("safeSearchFilter", value);
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to Block the user from taking Screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     */
    public void setScreenCaptureBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("screenCaptureBlocked", value);
    }
    /**
     * Sets the searchBlockDiacritics property value. Specifies if search can use diacritics.
     * @param value Value to set for the searchBlockDiacritics property.
     */
    public void setSearchBlockDiacritics(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("searchBlockDiacritics", value);
    }
    /**
     * Sets the searchBlockWebResults property value. Indicates whether or not to block the web search.
     * @param value Value to set for the searchBlockWebResults property.
     */
    public void setSearchBlockWebResults(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("searchBlockWebResults", value);
    }
    /**
     * Sets the searchDisableAutoLanguageDetection property value. Specifies whether to use automatic language detection when indexing content and properties.
     * @param value Value to set for the searchDisableAutoLanguageDetection property.
     */
    public void setSearchDisableAutoLanguageDetection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("searchDisableAutoLanguageDetection", value);
    }
    /**
     * Sets the searchDisableIndexerBackoff property value. Indicates whether or not to disable the search indexer backoff feature.
     * @param value Value to set for the searchDisableIndexerBackoff property.
     */
    public void setSearchDisableIndexerBackoff(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("searchDisableIndexerBackoff", value);
    }
    /**
     * Sets the searchDisableIndexingEncryptedItems property value. Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer.
     * @param value Value to set for the searchDisableIndexingEncryptedItems property.
     */
    public void setSearchDisableIndexingEncryptedItems(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("searchDisableIndexingEncryptedItems", value);
    }
    /**
     * Sets the searchDisableIndexingRemovableDrive property value. Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
     * @param value Value to set for the searchDisableIndexingRemovableDrive property.
     */
    public void setSearchDisableIndexingRemovableDrive(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("searchDisableIndexingRemovableDrive", value);
    }
    /**
     * Sets the searchDisableLocation property value. Specifies if search can use location information.
     * @param value Value to set for the searchDisableLocation property.
     */
    public void setSearchDisableLocation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("searchDisableLocation", value);
    }
    /**
     * Sets the searchDisableUseLocation property value. Specifies if search can use location information.
     * @param value Value to set for the searchDisableUseLocation property.
     */
    public void setSearchDisableUseLocation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("searchDisableUseLocation", value);
    }
    /**
     * Sets the searchEnableAutomaticIndexSizeManangement property value. Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
     * @param value Value to set for the searchEnableAutomaticIndexSizeManangement property.
     */
    public void setSearchEnableAutomaticIndexSizeManangement(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("searchEnableAutomaticIndexSizeManangement", value);
    }
    /**
     * Sets the searchEnableRemoteQueries property value. Indicates whether or not to block remote queries of this computers index.
     * @param value Value to set for the searchEnableRemoteQueries property.
     */
    public void setSearchEnableRemoteQueries(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("searchEnableRemoteQueries", value);
    }
    /**
     * Sets the securityBlockAzureADJoinedDevicesAutoEncryption property value. Specify whether to allow automatic device encryption during OOBE when the device is Azure AD joined (desktop only).
     * @param value Value to set for the securityBlockAzureADJoinedDevicesAutoEncryption property.
     */
    public void setSecurityBlockAzureADJoinedDevicesAutoEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityBlockAzureADJoinedDevicesAutoEncryption", value);
    }
    /**
     * Sets the settingsBlockAccountsPage property value. Indicates whether or not to block access to Accounts in Settings app.
     * @param value Value to set for the settingsBlockAccountsPage property.
     */
    public void setSettingsBlockAccountsPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockAccountsPage", value);
    }
    /**
     * Sets the settingsBlockAddProvisioningPackage property value. Indicates whether or not to block the user from installing provisioning packages.
     * @param value Value to set for the settingsBlockAddProvisioningPackage property.
     */
    public void setSettingsBlockAddProvisioningPackage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockAddProvisioningPackage", value);
    }
    /**
     * Sets the settingsBlockAppsPage property value. Indicates whether or not to block access to Apps in Settings app.
     * @param value Value to set for the settingsBlockAppsPage property.
     */
    public void setSettingsBlockAppsPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockAppsPage", value);
    }
    /**
     * Sets the settingsBlockChangeLanguage property value. Indicates whether or not to block the user from changing the language settings.
     * @param value Value to set for the settingsBlockChangeLanguage property.
     */
    public void setSettingsBlockChangeLanguage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockChangeLanguage", value);
    }
    /**
     * Sets the settingsBlockChangePowerSleep property value. Indicates whether or not to block the user from changing power and sleep settings.
     * @param value Value to set for the settingsBlockChangePowerSleep property.
     */
    public void setSettingsBlockChangePowerSleep(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockChangePowerSleep", value);
    }
    /**
     * Sets the settingsBlockChangeRegion property value. Indicates whether or not to block the user from changing the region settings.
     * @param value Value to set for the settingsBlockChangeRegion property.
     */
    public void setSettingsBlockChangeRegion(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockChangeRegion", value);
    }
    /**
     * Sets the settingsBlockChangeSystemTime property value. Indicates whether or not to block the user from changing date and time settings.
     * @param value Value to set for the settingsBlockChangeSystemTime property.
     */
    public void setSettingsBlockChangeSystemTime(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockChangeSystemTime", value);
    }
    /**
     * Sets the settingsBlockDevicesPage property value. Indicates whether or not to block access to Devices in Settings app.
     * @param value Value to set for the settingsBlockDevicesPage property.
     */
    public void setSettingsBlockDevicesPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockDevicesPage", value);
    }
    /**
     * Sets the settingsBlockEaseOfAccessPage property value. Indicates whether or not to block access to Ease of Access in Settings app.
     * @param value Value to set for the settingsBlockEaseOfAccessPage property.
     */
    public void setSettingsBlockEaseOfAccessPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockEaseOfAccessPage", value);
    }
    /**
     * Sets the settingsBlockEditDeviceName property value. Indicates whether or not to block the user from editing the device name.
     * @param value Value to set for the settingsBlockEditDeviceName property.
     */
    public void setSettingsBlockEditDeviceName(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockEditDeviceName", value);
    }
    /**
     * Sets the settingsBlockGamingPage property value. Indicates whether or not to block access to Gaming in Settings app.
     * @param value Value to set for the settingsBlockGamingPage property.
     */
    public void setSettingsBlockGamingPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockGamingPage", value);
    }
    /**
     * Sets the settingsBlockNetworkInternetPage property value. Indicates whether or not to block access to Network & Internet in Settings app.
     * @param value Value to set for the settingsBlockNetworkInternetPage property.
     */
    public void setSettingsBlockNetworkInternetPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockNetworkInternetPage", value);
    }
    /**
     * Sets the settingsBlockPersonalizationPage property value. Indicates whether or not to block access to Personalization in Settings app.
     * @param value Value to set for the settingsBlockPersonalizationPage property.
     */
    public void setSettingsBlockPersonalizationPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockPersonalizationPage", value);
    }
    /**
     * Sets the settingsBlockPrivacyPage property value. Indicates whether or not to block access to Privacy in Settings app.
     * @param value Value to set for the settingsBlockPrivacyPage property.
     */
    public void setSettingsBlockPrivacyPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockPrivacyPage", value);
    }
    /**
     * Sets the settingsBlockRemoveProvisioningPackage property value. Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
     * @param value Value to set for the settingsBlockRemoveProvisioningPackage property.
     */
    public void setSettingsBlockRemoveProvisioningPackage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockRemoveProvisioningPackage", value);
    }
    /**
     * Sets the settingsBlockSettingsApp property value. Indicates whether or not to block access to Settings app.
     * @param value Value to set for the settingsBlockSettingsApp property.
     */
    public void setSettingsBlockSettingsApp(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockSettingsApp", value);
    }
    /**
     * Sets the settingsBlockSystemPage property value. Indicates whether or not to block access to System in Settings app.
     * @param value Value to set for the settingsBlockSystemPage property.
     */
    public void setSettingsBlockSystemPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockSystemPage", value);
    }
    /**
     * Sets the settingsBlockTimeLanguagePage property value. Indicates whether or not to block access to Time & Language in Settings app.
     * @param value Value to set for the settingsBlockTimeLanguagePage property.
     */
    public void setSettingsBlockTimeLanguagePage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockTimeLanguagePage", value);
    }
    /**
     * Sets the settingsBlockUpdateSecurityPage property value. Indicates whether or not to block access to Update & Security in Settings app.
     * @param value Value to set for the settingsBlockUpdateSecurityPage property.
     */
    public void setSettingsBlockUpdateSecurityPage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("settingsBlockUpdateSecurityPage", value);
    }
    /**
     * Sets the sharedUserAppDataAllowed property value. Indicates whether or not to block multiple users of the same app to share data.
     * @param value Value to set for the sharedUserAppDataAllowed property.
     */
    public void setSharedUserAppDataAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("sharedUserAppDataAllowed", value);
    }
    /**
     * Sets the smartScreenAppInstallControl property value. App Install control Setting
     * @param value Value to set for the smartScreenAppInstallControl property.
     */
    public void setSmartScreenAppInstallControl(@jakarta.annotation.Nullable final AppInstallControlType value) {
        this.backingStore.set("smartScreenAppInstallControl", value);
    }
    /**
     * Sets the smartScreenBlockPromptOverride property value. Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
     * @param value Value to set for the smartScreenBlockPromptOverride property.
     */
    public void setSmartScreenBlockPromptOverride(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smartScreenBlockPromptOverride", value);
    }
    /**
     * Sets the smartScreenBlockPromptOverrideForFiles property value. Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
     * @param value Value to set for the smartScreenBlockPromptOverrideForFiles property.
     */
    public void setSmartScreenBlockPromptOverrideForFiles(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smartScreenBlockPromptOverrideForFiles", value);
    }
    /**
     * Sets the smartScreenEnableAppInstallControl property value. This property will be deprecated in July 2019 and will be replaced by property SmartScreenAppInstallControl. Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
     * @param value Value to set for the smartScreenEnableAppInstallControl property.
     */
    public void setSmartScreenEnableAppInstallControl(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smartScreenEnableAppInstallControl", value);
    }
    /**
     * Sets the startBlockUnpinningAppsFromTaskbar property value. Indicates whether or not to block the user from unpinning apps from taskbar.
     * @param value Value to set for the startBlockUnpinningAppsFromTaskbar property.
     */
    public void setStartBlockUnpinningAppsFromTaskbar(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("startBlockUnpinningAppsFromTaskbar", value);
    }
    /**
     * Sets the startMenuAppListVisibility property value. Type of start menu app list visibility.
     * @param value Value to set for the startMenuAppListVisibility property.
     */
    public void setStartMenuAppListVisibility(@jakarta.annotation.Nullable final EnumSet<WindowsStartMenuAppListVisibilityType> value) {
        this.backingStore.set("startMenuAppListVisibility", value);
    }
    /**
     * Sets the startMenuHideChangeAccountSettings property value. Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideChangeAccountSettings property.
     */
    public void setStartMenuHideChangeAccountSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("startMenuHideChangeAccountSettings", value);
    }
    /**
     * Sets the startMenuHideFrequentlyUsedApps property value. Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideFrequentlyUsedApps property.
     */
    public void setStartMenuHideFrequentlyUsedApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("startMenuHideFrequentlyUsedApps", value);
    }
    /**
     * Sets the startMenuHideHibernate property value. Enabling this policy hides hibernate from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideHibernate property.
     */
    public void setStartMenuHideHibernate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("startMenuHideHibernate", value);
    }
    /**
     * Sets the startMenuHideLock property value. Enabling this policy hides lock from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideLock property.
     */
    public void setStartMenuHideLock(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("startMenuHideLock", value);
    }
    /**
     * Sets the startMenuHidePowerButton property value. Enabling this policy hides the power button from appearing in the start menu.
     * @param value Value to set for the startMenuHidePowerButton property.
     */
    public void setStartMenuHidePowerButton(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("startMenuHidePowerButton", value);
    }
    /**
     * Sets the startMenuHideRecentJumpLists property value. Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideRecentJumpLists property.
     */
    public void setStartMenuHideRecentJumpLists(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("startMenuHideRecentJumpLists", value);
    }
    /**
     * Sets the startMenuHideRecentlyAddedApps property value. Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideRecentlyAddedApps property.
     */
    public void setStartMenuHideRecentlyAddedApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("startMenuHideRecentlyAddedApps", value);
    }
    /**
     * Sets the startMenuHideRestartOptions property value. Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideRestartOptions property.
     */
    public void setStartMenuHideRestartOptions(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("startMenuHideRestartOptions", value);
    }
    /**
     * Sets the startMenuHideShutDown property value. Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideShutDown property.
     */
    public void setStartMenuHideShutDown(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("startMenuHideShutDown", value);
    }
    /**
     * Sets the startMenuHideSignOut property value. Enabling this policy hides sign out from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideSignOut property.
     */
    public void setStartMenuHideSignOut(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("startMenuHideSignOut", value);
    }
    /**
     * Sets the startMenuHideSleep property value. Enabling this policy hides sleep from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideSleep property.
     */
    public void setStartMenuHideSleep(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("startMenuHideSleep", value);
    }
    /**
     * Sets the startMenuHideSwitchAccount property value. Enabling this policy hides switch account from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideSwitchAccount property.
     */
    public void setStartMenuHideSwitchAccount(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("startMenuHideSwitchAccount", value);
    }
    /**
     * Sets the startMenuHideUserTile property value. Enabling this policy hides the user tile from appearing in the start menu.
     * @param value Value to set for the startMenuHideUserTile property.
     */
    public void setStartMenuHideUserTile(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("startMenuHideUserTile", value);
    }
    /**
     * Sets the startMenuLayoutEdgeAssetsXml property value. This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array.
     * @param value Value to set for the startMenuLayoutEdgeAssetsXml property.
     */
    public void setStartMenuLayoutEdgeAssetsXml(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("startMenuLayoutEdgeAssetsXml", value);
    }
    /**
     * Sets the startMenuLayoutXml property value. Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
     * @param value Value to set for the startMenuLayoutXml property.
     */
    public void setStartMenuLayoutXml(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("startMenuLayoutXml", value);
    }
    /**
     * Sets the startMenuMode property value. Type of display modes for the start menu.
     * @param value Value to set for the startMenuMode property.
     */
    public void setStartMenuMode(@jakarta.annotation.Nullable final WindowsStartMenuModeType value) {
        this.backingStore.set("startMenuMode", value);
    }
    /**
     * Sets the startMenuPinnedFolderDocuments property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderDocuments property.
     */
    public void setStartMenuPinnedFolderDocuments(@jakarta.annotation.Nullable final VisibilitySetting value) {
        this.backingStore.set("startMenuPinnedFolderDocuments", value);
    }
    /**
     * Sets the startMenuPinnedFolderDownloads property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderDownloads property.
     */
    public void setStartMenuPinnedFolderDownloads(@jakarta.annotation.Nullable final VisibilitySetting value) {
        this.backingStore.set("startMenuPinnedFolderDownloads", value);
    }
    /**
     * Sets the startMenuPinnedFolderFileExplorer property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderFileExplorer property.
     */
    public void setStartMenuPinnedFolderFileExplorer(@jakarta.annotation.Nullable final VisibilitySetting value) {
        this.backingStore.set("startMenuPinnedFolderFileExplorer", value);
    }
    /**
     * Sets the startMenuPinnedFolderHomeGroup property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderHomeGroup property.
     */
    public void setStartMenuPinnedFolderHomeGroup(@jakarta.annotation.Nullable final VisibilitySetting value) {
        this.backingStore.set("startMenuPinnedFolderHomeGroup", value);
    }
    /**
     * Sets the startMenuPinnedFolderMusic property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderMusic property.
     */
    public void setStartMenuPinnedFolderMusic(@jakarta.annotation.Nullable final VisibilitySetting value) {
        this.backingStore.set("startMenuPinnedFolderMusic", value);
    }
    /**
     * Sets the startMenuPinnedFolderNetwork property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderNetwork property.
     */
    public void setStartMenuPinnedFolderNetwork(@jakarta.annotation.Nullable final VisibilitySetting value) {
        this.backingStore.set("startMenuPinnedFolderNetwork", value);
    }
    /**
     * Sets the startMenuPinnedFolderPersonalFolder property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderPersonalFolder property.
     */
    public void setStartMenuPinnedFolderPersonalFolder(@jakarta.annotation.Nullable final VisibilitySetting value) {
        this.backingStore.set("startMenuPinnedFolderPersonalFolder", value);
    }
    /**
     * Sets the startMenuPinnedFolderPictures property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderPictures property.
     */
    public void setStartMenuPinnedFolderPictures(@jakarta.annotation.Nullable final VisibilitySetting value) {
        this.backingStore.set("startMenuPinnedFolderPictures", value);
    }
    /**
     * Sets the startMenuPinnedFolderSettings property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderSettings property.
     */
    public void setStartMenuPinnedFolderSettings(@jakarta.annotation.Nullable final VisibilitySetting value) {
        this.backingStore.set("startMenuPinnedFolderSettings", value);
    }
    /**
     * Sets the startMenuPinnedFolderVideos property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderVideos property.
     */
    public void setStartMenuPinnedFolderVideos(@jakarta.annotation.Nullable final VisibilitySetting value) {
        this.backingStore.set("startMenuPinnedFolderVideos", value);
    }
    /**
     * Sets the storageBlockRemovableStorage property value. Indicates whether or not to Block the user from using removable storage.
     * @param value Value to set for the storageBlockRemovableStorage property.
     */
    public void setStorageBlockRemovableStorage(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageBlockRemovableStorage", value);
    }
    /**
     * Sets the storageRequireMobileDeviceEncryption property value. Indicating whether or not to require encryption on a mobile device.
     * @param value Value to set for the storageRequireMobileDeviceEncryption property.
     */
    public void setStorageRequireMobileDeviceEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageRequireMobileDeviceEncryption", value);
    }
    /**
     * Sets the storageRestrictAppDataToSystemVolume property value. Indicates whether application data is restricted to the system drive.
     * @param value Value to set for the storageRestrictAppDataToSystemVolume property.
     */
    public void setStorageRestrictAppDataToSystemVolume(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageRestrictAppDataToSystemVolume", value);
    }
    /**
     * Sets the storageRestrictAppInstallToSystemVolume property value. Indicates whether the installation of applications is restricted to the system drive.
     * @param value Value to set for the storageRestrictAppInstallToSystemVolume property.
     */
    public void setStorageRestrictAppInstallToSystemVolume(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageRestrictAppInstallToSystemVolume", value);
    }
    /**
     * Sets the systemTelemetryProxyServer property value. Gets or sets the fully qualified domain name (FQDN) or IP address of a proxy server to forward Connected User Experiences and Telemetry requests.
     * @param value Value to set for the systemTelemetryProxyServer property.
     */
    public void setSystemTelemetryProxyServer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("systemTelemetryProxyServer", value);
    }
    /**
     * Sets the taskManagerBlockEndTask property value. Specify whether non-administrators can use Task Manager to end tasks.
     * @param value Value to set for the taskManagerBlockEndTask property.
     */
    public void setTaskManagerBlockEndTask(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("taskManagerBlockEndTask", value);
    }
    /**
     * Sets the tenantLockdownRequireNetworkDuringOutOfBoxExperience property value. Whether the device is required to connect to the network.
     * @param value Value to set for the tenantLockdownRequireNetworkDuringOutOfBoxExperience property.
     */
    public void setTenantLockdownRequireNetworkDuringOutOfBoxExperience(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("tenantLockdownRequireNetworkDuringOutOfBoxExperience", value);
    }
    /**
     * Sets the uninstallBuiltInApps property value. Indicates whether or not to uninstall a fixed list of built-in Windows apps.
     * @param value Value to set for the uninstallBuiltInApps property.
     */
    public void setUninstallBuiltInApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("uninstallBuiltInApps", value);
    }
    /**
     * Sets the usbBlocked property value. Indicates whether or not to Block the user from USB connection.
     * @param value Value to set for the usbBlocked property.
     */
    public void setUsbBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("usbBlocked", value);
    }
    /**
     * Sets the voiceRecordingBlocked property value. Indicates whether or not to Block the user from voice recording.
     * @param value Value to set for the voiceRecordingBlocked property.
     */
    public void setVoiceRecordingBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("voiceRecordingBlocked", value);
    }
    /**
     * Sets the webRtcBlockLocalhostIpAddress property value. Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
     * @param value Value to set for the webRtcBlockLocalhostIpAddress property.
     */
    public void setWebRtcBlockLocalhostIpAddress(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("webRtcBlockLocalhostIpAddress", value);
    }
    /**
     * Sets the wiFiBlockAutomaticConnectHotspots property value. Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     * @param value Value to set for the wiFiBlockAutomaticConnectHotspots property.
     */
    public void setWiFiBlockAutomaticConnectHotspots(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("wiFiBlockAutomaticConnectHotspots", value);
    }
    /**
     * Sets the wiFiBlocked property value. Indicates whether or not to Block the user from using Wi-Fi.
     * @param value Value to set for the wiFiBlocked property.
     */
    public void setWiFiBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("wiFiBlocked", value);
    }
    /**
     * Sets the wiFiBlockManualConfiguration property value. Indicates whether or not to Block the user from using Wi-Fi manual configuration.
     * @param value Value to set for the wiFiBlockManualConfiguration property.
     */
    public void setWiFiBlockManualConfiguration(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("wiFiBlockManualConfiguration", value);
    }
    /**
     * Sets the wiFiScanInterval property value. Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500
     * @param value Value to set for the wiFiScanInterval property.
     */
    public void setWiFiScanInterval(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("wiFiScanInterval", value);
    }
    /**
     * Sets the windows10AppsForceUpdateSchedule property value. Windows 10 force update schedule for Apps.
     * @param value Value to set for the windows10AppsForceUpdateSchedule property.
     */
    public void setWindows10AppsForceUpdateSchedule(@jakarta.annotation.Nullable final Windows10AppsForceUpdateSchedule value) {
        this.backingStore.set("windows10AppsForceUpdateSchedule", value);
    }
    /**
     * Sets the windowsSpotlightBlockConsumerSpecificFeatures property value. Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles.
     * @param value Value to set for the windowsSpotlightBlockConsumerSpecificFeatures property.
     */
    public void setWindowsSpotlightBlockConsumerSpecificFeatures(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windowsSpotlightBlockConsumerSpecificFeatures", value);
    }
    /**
     * Sets the windowsSpotlightBlocked property value. Allows IT admins to turn off all Windows Spotlight features
     * @param value Value to set for the windowsSpotlightBlocked property.
     */
    public void setWindowsSpotlightBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windowsSpotlightBlocked", value);
    }
    /**
     * Sets the windowsSpotlightBlockOnActionCenter property value. Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed
     * @param value Value to set for the windowsSpotlightBlockOnActionCenter property.
     */
    public void setWindowsSpotlightBlockOnActionCenter(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windowsSpotlightBlockOnActionCenter", value);
    }
    /**
     * Sets the windowsSpotlightBlockTailoredExperiences property value. Block personalized content in Windows spotlight based on users device usage.
     * @param value Value to set for the windowsSpotlightBlockTailoredExperiences property.
     */
    public void setWindowsSpotlightBlockTailoredExperiences(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windowsSpotlightBlockTailoredExperiences", value);
    }
    /**
     * Sets the windowsSpotlightBlockThirdPartyNotifications property value. Block third party content delivered via Windows Spotlight
     * @param value Value to set for the windowsSpotlightBlockThirdPartyNotifications property.
     */
    public void setWindowsSpotlightBlockThirdPartyNotifications(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windowsSpotlightBlockThirdPartyNotifications", value);
    }
    /**
     * Sets the windowsSpotlightBlockWelcomeExperience property value. Block Windows Spotlight Windows welcome experience
     * @param value Value to set for the windowsSpotlightBlockWelcomeExperience property.
     */
    public void setWindowsSpotlightBlockWelcomeExperience(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windowsSpotlightBlockWelcomeExperience", value);
    }
    /**
     * Sets the windowsSpotlightBlockWindowsTips property value. Allows IT admins to turn off the popup of Windows Tips.
     * @param value Value to set for the windowsSpotlightBlockWindowsTips property.
     */
    public void setWindowsSpotlightBlockWindowsTips(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windowsSpotlightBlockWindowsTips", value);
    }
    /**
     * Sets the windowsSpotlightConfigureOnLockScreen property value. Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     * @param value Value to set for the windowsSpotlightConfigureOnLockScreen property.
     */
    public void setWindowsSpotlightConfigureOnLockScreen(@jakarta.annotation.Nullable final WindowsSpotlightEnablementSettings value) {
        this.backingStore.set("windowsSpotlightConfigureOnLockScreen", value);
    }
    /**
     * Sets the windowsStoreBlockAutoUpdate property value. Indicates whether or not to block automatic update of apps from Windows Store.
     * @param value Value to set for the windowsStoreBlockAutoUpdate property.
     */
    public void setWindowsStoreBlockAutoUpdate(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windowsStoreBlockAutoUpdate", value);
    }
    /**
     * Sets the windowsStoreBlocked property value. Indicates whether or not to Block the user from using the Windows store.
     * @param value Value to set for the windowsStoreBlocked property.
     */
    public void setWindowsStoreBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windowsStoreBlocked", value);
    }
    /**
     * Sets the windowsStoreEnablePrivateStoreOnly property value. Indicates whether or not to enable Private Store Only.
     * @param value Value to set for the windowsStoreEnablePrivateStoreOnly property.
     */
    public void setWindowsStoreEnablePrivateStoreOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windowsStoreEnablePrivateStoreOnly", value);
    }
    /**
     * Sets the wirelessDisplayBlockProjectionToThisDevice property value. Indicates whether or not to allow other devices from discovering this PC for projection.
     * @param value Value to set for the wirelessDisplayBlockProjectionToThisDevice property.
     */
    public void setWirelessDisplayBlockProjectionToThisDevice(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("wirelessDisplayBlockProjectionToThisDevice", value);
    }
    /**
     * Sets the wirelessDisplayBlockUserInputFromReceiver property value. Indicates whether or not to allow user input from wireless display receiver.
     * @param value Value to set for the wirelessDisplayBlockUserInputFromReceiver property.
     */
    public void setWirelessDisplayBlockUserInputFromReceiver(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("wirelessDisplayBlockUserInputFromReceiver", value);
    }
    /**
     * Sets the wirelessDisplayRequirePinForPairing property value. Indicates whether or not to require a PIN for new devices to initiate pairing.
     * @param value Value to set for the wirelessDisplayRequirePinForPairing property.
     */
    public void setWirelessDisplayRequirePinForPairing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("wirelessDisplayRequirePinForPairing", value);
    }
}
