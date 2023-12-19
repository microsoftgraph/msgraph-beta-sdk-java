package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the Windows10EndpointProtectionConfiguration resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10EndpointProtectionConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new Windows10EndpointProtectionConfiguration and sets the default values.
     */
    public Windows10EndpointProtectionConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10EndpointProtectionConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10EndpointProtectionConfiguration
     */
    @jakarta.annotation.Nonnull
    public static Windows10EndpointProtectionConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EndpointProtectionConfiguration();
    }
    /**
     * Gets the applicationGuardAllowCameraMicrophoneRedirection property value. Gets or sets whether applications inside Microsoft Defender Application Guard can access the devices camera and microphone.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardAllowCameraMicrophoneRedirection() {
        return this.backingStore.get("applicationGuardAllowCameraMicrophoneRedirection");
    }
    /**
     * Gets the applicationGuardAllowFileSaveOnHost property value. Allow users to download files from Edge in the application guard container and save them on the host file system
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardAllowFileSaveOnHost() {
        return this.backingStore.get("applicationGuardAllowFileSaveOnHost");
    }
    /**
     * Gets the applicationGuardAllowPersistence property value. Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardAllowPersistence() {
        return this.backingStore.get("applicationGuardAllowPersistence");
    }
    /**
     * Gets the applicationGuardAllowPrintToLocalPrinters property value. Allow printing to Local Printers from Container
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToLocalPrinters() {
        return this.backingStore.get("applicationGuardAllowPrintToLocalPrinters");
    }
    /**
     * Gets the applicationGuardAllowPrintToNetworkPrinters property value. Allow printing to Network Printers from Container
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToNetworkPrinters() {
        return this.backingStore.get("applicationGuardAllowPrintToNetworkPrinters");
    }
    /**
     * Gets the applicationGuardAllowPrintToPDF property value. Allow printing to PDF from Container
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToPDF() {
        return this.backingStore.get("applicationGuardAllowPrintToPDF");
    }
    /**
     * Gets the applicationGuardAllowPrintToXPS property value. Allow printing to XPS from Container
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToXPS() {
        return this.backingStore.get("applicationGuardAllowPrintToXPS");
    }
    /**
     * Gets the applicationGuardAllowVirtualGPU property value. Allow application guard to use virtual GPU
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardAllowVirtualGPU() {
        return this.backingStore.get("applicationGuardAllowVirtualGPU");
    }
    /**
     * Gets the applicationGuardBlockClipboardSharing property value. Possible values for applicationGuardBlockClipboardSharingType
     * @return a ApplicationGuardBlockClipboardSharingType
     */
    @jakarta.annotation.Nullable
    public ApplicationGuardBlockClipboardSharingType getApplicationGuardBlockClipboardSharing() {
        return this.backingStore.get("applicationGuardBlockClipboardSharing");
    }
    /**
     * Gets the applicationGuardBlockFileTransfer property value. Possible values for applicationGuardBlockFileTransfer
     * @return a ApplicationGuardBlockFileTransferType
     */
    @jakarta.annotation.Nullable
    public ApplicationGuardBlockFileTransferType getApplicationGuardBlockFileTransfer() {
        return this.backingStore.get("applicationGuardBlockFileTransfer");
    }
    /**
     * Gets the applicationGuardBlockNonEnterpriseContent property value. Block enterprise sites to load non-enterprise content, such as third party plug-ins
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardBlockNonEnterpriseContent() {
        return this.backingStore.get("applicationGuardBlockNonEnterpriseContent");
    }
    /**
     * Gets the applicationGuardCertificateThumbprints property value. Allows certain device level Root Certificates to be shared with the Microsoft Defender Application Guard container.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getApplicationGuardCertificateThumbprints() {
        return this.backingStore.get("applicationGuardCertificateThumbprints");
    }
    /**
     * Gets the applicationGuardEnabled property value. Enable Windows Defender Application Guard
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardEnabled() {
        return this.backingStore.get("applicationGuardEnabled");
    }
    /**
     * Gets the applicationGuardEnabledOptions property value. Possible values for ApplicationGuardEnabledOptions
     * @return a ApplicationGuardEnabledOptions
     */
    @jakarta.annotation.Nullable
    public ApplicationGuardEnabledOptions getApplicationGuardEnabledOptions() {
        return this.backingStore.get("applicationGuardEnabledOptions");
    }
    /**
     * Gets the applicationGuardForceAuditing property value. Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationGuardForceAuditing() {
        return this.backingStore.get("applicationGuardForceAuditing");
    }
    /**
     * Gets the appLockerApplicationControl property value. Possible values of AppLocker Application Control Types
     * @return a AppLockerApplicationControlType
     */
    @jakarta.annotation.Nullable
    public AppLockerApplicationControlType getAppLockerApplicationControl() {
        return this.backingStore.get("appLockerApplicationControl");
    }
    /**
     * Gets the bitLockerAllowStandardUserEncryption property value. Allows the admin to allow standard users to enable encrpytion during Azure AD Join.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBitLockerAllowStandardUserEncryption() {
        return this.backingStore.get("bitLockerAllowStandardUserEncryption");
    }
    /**
     * Gets the bitLockerDisableWarningForOtherDiskEncryption property value. Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBitLockerDisableWarningForOtherDiskEncryption() {
        return this.backingStore.get("bitLockerDisableWarningForOtherDiskEncryption");
    }
    /**
     * Gets the bitLockerEnableStorageCardEncryptionOnMobile property value. Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBitLockerEnableStorageCardEncryptionOnMobile() {
        return this.backingStore.get("bitLockerEnableStorageCardEncryptionOnMobile");
    }
    /**
     * Gets the bitLockerEncryptDevice property value. Allows the admin to require encryption to be turned on using BitLocker.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBitLockerEncryptDevice() {
        return this.backingStore.get("bitLockerEncryptDevice");
    }
    /**
     * Gets the bitLockerFixedDrivePolicy property value. BitLocker Fixed Drive Policy.
     * @return a BitLockerFixedDrivePolicy
     */
    @jakarta.annotation.Nullable
    public BitLockerFixedDrivePolicy getBitLockerFixedDrivePolicy() {
        return this.backingStore.get("bitLockerFixedDrivePolicy");
    }
    /**
     * Gets the bitLockerRecoveryPasswordRotation property value. BitLocker recovery password rotation type
     * @return a BitLockerRecoveryPasswordRotationType
     */
    @jakarta.annotation.Nullable
    public BitLockerRecoveryPasswordRotationType getBitLockerRecoveryPasswordRotation() {
        return this.backingStore.get("bitLockerRecoveryPasswordRotation");
    }
    /**
     * Gets the bitLockerRemovableDrivePolicy property value. BitLocker Removable Drive Policy.
     * @return a BitLockerRemovableDrivePolicy
     */
    @jakarta.annotation.Nullable
    public BitLockerRemovableDrivePolicy getBitLockerRemovableDrivePolicy() {
        return this.backingStore.get("bitLockerRemovableDrivePolicy");
    }
    /**
     * Gets the bitLockerSystemDrivePolicy property value. BitLocker System Drive Policy.
     * @return a BitLockerSystemDrivePolicy
     */
    @jakarta.annotation.Nullable
    public BitLockerSystemDrivePolicy getBitLockerSystemDrivePolicy() {
        return this.backingStore.get("bitLockerSystemDrivePolicy");
    }
    /**
     * Gets the defenderAdditionalGuardedFolders property value. List of folder paths to be added to the list of protected folders
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefenderAdditionalGuardedFolders() {
        return this.backingStore.get("defenderAdditionalGuardedFolders");
    }
    /**
     * Gets the defenderAdobeReaderLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderAdobeReaderLaunchChildProcess() {
        return this.backingStore.get("defenderAdobeReaderLaunchChildProcess");
    }
    /**
     * Gets the defenderAdvancedRansomewareProtectionType property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderAdvancedRansomewareProtectionType() {
        return this.backingStore.get("defenderAdvancedRansomewareProtectionType");
    }
    /**
     * Gets the defenderAllowBehaviorMonitoring property value. Allows or disallows Windows Defender Behavior Monitoring functionality.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderAllowBehaviorMonitoring() {
        return this.backingStore.get("defenderAllowBehaviorMonitoring");
    }
    /**
     * Gets the defenderAllowCloudProtection property value. To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderAllowCloudProtection() {
        return this.backingStore.get("defenderAllowCloudProtection");
    }
    /**
     * Gets the defenderAllowEndUserAccess property value. Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderAllowEndUserAccess() {
        return this.backingStore.get("defenderAllowEndUserAccess");
    }
    /**
     * Gets the defenderAllowIntrusionPreventionSystem property value. Allows or disallows Windows Defender Intrusion Prevention functionality.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderAllowIntrusionPreventionSystem() {
        return this.backingStore.get("defenderAllowIntrusionPreventionSystem");
    }
    /**
     * Gets the defenderAllowOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderAllowOnAccessProtection() {
        return this.backingStore.get("defenderAllowOnAccessProtection");
    }
    /**
     * Gets the defenderAllowRealTimeMonitoring property value. Allows or disallows Windows Defender Realtime Monitoring functionality.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderAllowRealTimeMonitoring() {
        return this.backingStore.get("defenderAllowRealTimeMonitoring");
    }
    /**
     * Gets the defenderAllowScanArchiveFiles property value. Allows or disallows scanning of archives.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderAllowScanArchiveFiles() {
        return this.backingStore.get("defenderAllowScanArchiveFiles");
    }
    /**
     * Gets the defenderAllowScanDownloads property value. Allows or disallows Windows Defender IOAVP Protection functionality.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderAllowScanDownloads() {
        return this.backingStore.get("defenderAllowScanDownloads");
    }
    /**
     * Gets the defenderAllowScanNetworkFiles property value. Allows or disallows a scanning of network files.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderAllowScanNetworkFiles() {
        return this.backingStore.get("defenderAllowScanNetworkFiles");
    }
    /**
     * Gets the defenderAllowScanRemovableDrivesDuringFullScan property value. Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderAllowScanRemovableDrivesDuringFullScan() {
        return this.backingStore.get("defenderAllowScanRemovableDrivesDuringFullScan");
    }
    /**
     * Gets the defenderAllowScanScriptsLoadedInInternetExplorer property value. Allows or disallows Windows Defender Script Scanning functionality.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderAllowScanScriptsLoadedInInternetExplorer() {
        return this.backingStore.get("defenderAllowScanScriptsLoadedInInternetExplorer");
    }
    /**
     * Gets the defenderAttackSurfaceReductionExcludedPaths property value. List of exe files and folders to be excluded from attack surface reduction rules
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefenderAttackSurfaceReductionExcludedPaths() {
        return this.backingStore.get("defenderAttackSurfaceReductionExcludedPaths");
    }
    /**
     * Gets the defenderBlockEndUserAccess property value. Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderBlockEndUserAccess() {
        return this.backingStore.get("defenderBlockEndUserAccess");
    }
    /**
     * Gets the defenderBlockPersistenceThroughWmiType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @jakarta.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderBlockPersistenceThroughWmiType() {
        return this.backingStore.get("defenderBlockPersistenceThroughWmiType");
    }
    /**
     * Gets the defenderCheckForSignaturesBeforeRunningScan property value. This policy setting allows you to manage whether a check for new virus and spyware definitions will occur before running a scan.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderCheckForSignaturesBeforeRunningScan() {
        return this.backingStore.get("defenderCheckForSignaturesBeforeRunningScan");
    }
    /**
     * Gets the defenderCloudBlockLevel property value. Added in Windows 10, version 1709. This policy setting determines how aggressive Windows Defender Antivirus will be in blocking and scanning suspicious files. Value type is integer. This feature requires the 'Join Microsoft MAPS' setting enabled in order to function. Possible values are: notConfigured, high, highPlus, zeroTolerance.
     * @return a Windows10EndpointProtectionConfigurationDefenderCloudBlockLevel
     */
    @jakarta.annotation.Nullable
    public Windows10EndpointProtectionConfigurationDefenderCloudBlockLevel getDefenderCloudBlockLevel() {
        return this.backingStore.get("defenderCloudBlockLevel");
    }
    /**
     * Gets the defenderCloudExtendedTimeoutInSeconds property value. Added in Windows 10, version 1709. This feature allows Windows Defender Antivirus to block a suspicious file for up to 60 seconds, and scan it in the cloud to make sure it's safe. Value type is integer, range is 0 - 50. This feature depends on three other MAPS settings the must all be enabled- 'Configure the 'Block at First Sight' feature; 'Join Microsoft MAPS'; 'Send file samples when further analysis is required'. Valid values 0 to 50
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDefenderCloudExtendedTimeoutInSeconds() {
        return this.backingStore.get("defenderCloudExtendedTimeoutInSeconds");
    }
    /**
     * Gets the defenderDaysBeforeDeletingQuarantinedMalware property value. Time period (in days) that quarantine items will be stored on the system. Valid values 0 to 90
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDefenderDaysBeforeDeletingQuarantinedMalware() {
        return this.backingStore.get("defenderDaysBeforeDeletingQuarantinedMalware");
    }
    /**
     * Gets the defenderDetectedMalwareActions property value. Allows an administrator to specify any valid threat severity levels and the corresponding default action ID to take.
     * @return a DefenderDetectedMalwareActions
     */
    @jakarta.annotation.Nullable
    public DefenderDetectedMalwareActions getDefenderDetectedMalwareActions() {
        return this.backingStore.get("defenderDetectedMalwareActions");
    }
    /**
     * Gets the defenderDisableBehaviorMonitoring property value. Allows or disallows Windows Defender Behavior Monitoring functionality.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderDisableBehaviorMonitoring() {
        return this.backingStore.get("defenderDisableBehaviorMonitoring");
    }
    /**
     * Gets the defenderDisableCatchupFullScan property value. This policy setting allows you to configure catch-up scans for scheduled full scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderDisableCatchupFullScan() {
        return this.backingStore.get("defenderDisableCatchupFullScan");
    }
    /**
     * Gets the defenderDisableCatchupQuickScan property value. This policy setting allows you to configure catch-up scans for scheduled quick scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderDisableCatchupQuickScan() {
        return this.backingStore.get("defenderDisableCatchupQuickScan");
    }
    /**
     * Gets the defenderDisableCloudProtection property value. To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderDisableCloudProtection() {
        return this.backingStore.get("defenderDisableCloudProtection");
    }
    /**
     * Gets the defenderDisableIntrusionPreventionSystem property value. Allows or disallows Windows Defender Intrusion Prevention functionality.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderDisableIntrusionPreventionSystem() {
        return this.backingStore.get("defenderDisableIntrusionPreventionSystem");
    }
    /**
     * Gets the defenderDisableOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderDisableOnAccessProtection() {
        return this.backingStore.get("defenderDisableOnAccessProtection");
    }
    /**
     * Gets the defenderDisableRealTimeMonitoring property value. Allows or disallows Windows Defender Realtime Monitoring functionality.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderDisableRealTimeMonitoring() {
        return this.backingStore.get("defenderDisableRealTimeMonitoring");
    }
    /**
     * Gets the defenderDisableScanArchiveFiles property value. Allows or disallows scanning of archives.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderDisableScanArchiveFiles() {
        return this.backingStore.get("defenderDisableScanArchiveFiles");
    }
    /**
     * Gets the defenderDisableScanDownloads property value. Allows or disallows Windows Defender IOAVP Protection functionality.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderDisableScanDownloads() {
        return this.backingStore.get("defenderDisableScanDownloads");
    }
    /**
     * Gets the defenderDisableScanNetworkFiles property value. Allows or disallows a scanning of network files.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderDisableScanNetworkFiles() {
        return this.backingStore.get("defenderDisableScanNetworkFiles");
    }
    /**
     * Gets the defenderDisableScanRemovableDrivesDuringFullScan property value. Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderDisableScanRemovableDrivesDuringFullScan() {
        return this.backingStore.get("defenderDisableScanRemovableDrivesDuringFullScan");
    }
    /**
     * Gets the defenderDisableScanScriptsLoadedInInternetExplorer property value. Allows or disallows Windows Defender Script Scanning functionality.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderDisableScanScriptsLoadedInInternetExplorer() {
        return this.backingStore.get("defenderDisableScanScriptsLoadedInInternetExplorer");
    }
    /**
     * Gets the defenderEmailContentExecution property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderEmailContentExecution() {
        return this.backingStore.get("defenderEmailContentExecution");
    }
    /**
     * Gets the defenderEmailContentExecutionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @jakarta.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderEmailContentExecutionType() {
        return this.backingStore.get("defenderEmailContentExecutionType");
    }
    /**
     * Gets the defenderEnableLowCpuPriority property value. This policy setting allows you to enable or disable low CPU priority for scheduled scans.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderEnableLowCpuPriority() {
        return this.backingStore.get("defenderEnableLowCpuPriority");
    }
    /**
     * Gets the defenderEnableScanIncomingMail property value. Allows or disallows scanning of email.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderEnableScanIncomingMail() {
        return this.backingStore.get("defenderEnableScanIncomingMail");
    }
    /**
     * Gets the defenderEnableScanMappedNetworkDrivesDuringFullScan property value. Allows or disallows a full scan of mapped network drives.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderEnableScanMappedNetworkDrivesDuringFullScan() {
        return this.backingStore.get("defenderEnableScanMappedNetworkDrivesDuringFullScan");
    }
    /**
     * Gets the defenderExploitProtectionXml property value. Xml content containing information regarding exploit protection details.
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getDefenderExploitProtectionXml() {
        return this.backingStore.get("defenderExploitProtectionXml");
    }
    /**
     * Gets the defenderExploitProtectionXmlFileName property value. Name of the file from which DefenderExploitProtectionXml was obtained.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefenderExploitProtectionXmlFileName() {
        return this.backingStore.get("defenderExploitProtectionXmlFileName");
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
     * Gets the defenderGuardedFoldersAllowedAppPaths property value. List of paths to exe that are allowed to access protected folders
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefenderGuardedFoldersAllowedAppPaths() {
        return this.backingStore.get("defenderGuardedFoldersAllowedAppPaths");
    }
    /**
     * Gets the defenderGuardMyFoldersType property value. Possible values of Folder Protection
     * @return a FolderProtectionType
     */
    @jakarta.annotation.Nullable
    public FolderProtectionType getDefenderGuardMyFoldersType() {
        return this.backingStore.get("defenderGuardMyFoldersType");
    }
    /**
     * Gets the defenderNetworkProtectionType property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderNetworkProtectionType() {
        return this.backingStore.get("defenderNetworkProtectionType");
    }
    /**
     * Gets the defenderOfficeAppsExecutableContentCreationOrLaunch property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeAppsExecutableContentCreationOrLaunch() {
        return this.backingStore.get("defenderOfficeAppsExecutableContentCreationOrLaunch");
    }
    /**
     * Gets the defenderOfficeAppsExecutableContentCreationOrLaunchType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @jakarta.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderOfficeAppsExecutableContentCreationOrLaunchType() {
        return this.backingStore.get("defenderOfficeAppsExecutableContentCreationOrLaunchType");
    }
    /**
     * Gets the defenderOfficeAppsLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeAppsLaunchChildProcess() {
        return this.backingStore.get("defenderOfficeAppsLaunchChildProcess");
    }
    /**
     * Gets the defenderOfficeAppsLaunchChildProcessType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @jakarta.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderOfficeAppsLaunchChildProcessType() {
        return this.backingStore.get("defenderOfficeAppsLaunchChildProcessType");
    }
    /**
     * Gets the defenderOfficeAppsOtherProcessInjection property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeAppsOtherProcessInjection() {
        return this.backingStore.get("defenderOfficeAppsOtherProcessInjection");
    }
    /**
     * Gets the defenderOfficeAppsOtherProcessInjectionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @jakarta.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderOfficeAppsOtherProcessInjectionType() {
        return this.backingStore.get("defenderOfficeAppsOtherProcessInjectionType");
    }
    /**
     * Gets the defenderOfficeCommunicationAppsLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeCommunicationAppsLaunchChildProcess() {
        return this.backingStore.get("defenderOfficeCommunicationAppsLaunchChildProcess");
    }
    /**
     * Gets the defenderOfficeMacroCodeAllowWin32Imports property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeMacroCodeAllowWin32Imports() {
        return this.backingStore.get("defenderOfficeMacroCodeAllowWin32Imports");
    }
    /**
     * Gets the defenderOfficeMacroCodeAllowWin32ImportsType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @jakarta.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderOfficeMacroCodeAllowWin32ImportsType() {
        return this.backingStore.get("defenderOfficeMacroCodeAllowWin32ImportsType");
    }
    /**
     * Gets the defenderPotentiallyUnwantedAppAction property value. Added in Windows 10, version 1607. Specifies the level of detection for potentially unwanted applications (PUAs). Windows Defender alerts you when potentially unwanted software is being downloaded or attempts to install itself on your computer. Possible values are: userDefined, enable, auditMode, warn, notConfigured.
     * @return a Windows10EndpointProtectionConfigurationDefenderPotentiallyUnwantedAppAction
     */
    @jakarta.annotation.Nullable
    public Windows10EndpointProtectionConfigurationDefenderPotentiallyUnwantedAppAction getDefenderPotentiallyUnwantedAppAction() {
        return this.backingStore.get("defenderPotentiallyUnwantedAppAction");
    }
    /**
     * Gets the defenderPreventCredentialStealingType property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderPreventCredentialStealingType() {
        return this.backingStore.get("defenderPreventCredentialStealingType");
    }
    /**
     * Gets the defenderProcessCreation property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderProcessCreation() {
        return this.backingStore.get("defenderProcessCreation");
    }
    /**
     * Gets the defenderProcessCreationType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @jakarta.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderProcessCreationType() {
        return this.backingStore.get("defenderProcessCreationType");
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
     * Gets the defenderScanDirection property value. Controls which sets of files should be monitored. Possible values are: monitorAllFiles, monitorIncomingFilesOnly, monitorOutgoingFilesOnly.
     * @return a Windows10EndpointProtectionConfigurationDefenderScanDirection
     */
    @jakarta.annotation.Nullable
    public Windows10EndpointProtectionConfigurationDefenderScanDirection getDefenderScanDirection() {
        return this.backingStore.get("defenderScanDirection");
    }
    /**
     * Gets the defenderScanMaxCpuPercentage property value. Represents the average CPU load factor for the Windows Defender scan (in percent). The default value is 50. Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDefenderScanMaxCpuPercentage() {
        return this.backingStore.get("defenderScanMaxCpuPercentage");
    }
    /**
     * Gets the defenderScanType property value. Selects whether to perform a quick scan or full scan. Possible values are: userDefined, disabled, quick, full.
     * @return a Windows10EndpointProtectionConfigurationDefenderScanType
     */
    @jakarta.annotation.Nullable
    public Windows10EndpointProtectionConfigurationDefenderScanType getDefenderScanType() {
        return this.backingStore.get("defenderScanType");
    }
    /**
     * Gets the defenderScheduledQuickScanTime property value. Selects the time of day that the Windows Defender quick scan should run. For example, a value of 0=12:00AM, a value of 60=1:00AM, a value of 120=2:00, and so on, up to a value of 1380=11:00PM. The default value is 120
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getDefenderScheduledQuickScanTime() {
        return this.backingStore.get("defenderScheduledQuickScanTime");
    }
    /**
     * Gets the defenderScheduledScanDay property value. Selects the day that the Windows Defender scan should run. Possible values are: userDefined, everyday, sunday, monday, tuesday, wednesday, thursday, friday, saturday, noScheduledScan.
     * @return a Windows10EndpointProtectionConfigurationDefenderScheduledScanDay
     */
    @jakarta.annotation.Nullable
    public Windows10EndpointProtectionConfigurationDefenderScheduledScanDay getDefenderScheduledScanDay() {
        return this.backingStore.get("defenderScheduledScanDay");
    }
    /**
     * Gets the defenderScheduledScanTime property value. Selects the time of day that the Windows Defender scan should run.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getDefenderScheduledScanTime() {
        return this.backingStore.get("defenderScheduledScanTime");
    }
    /**
     * Gets the defenderScriptDownloadedPayloadExecution property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderScriptDownloadedPayloadExecution() {
        return this.backingStore.get("defenderScriptDownloadedPayloadExecution");
    }
    /**
     * Gets the defenderScriptDownloadedPayloadExecutionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @jakarta.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderScriptDownloadedPayloadExecutionType() {
        return this.backingStore.get("defenderScriptDownloadedPayloadExecutionType");
    }
    /**
     * Gets the defenderScriptObfuscatedMacroCode property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderScriptObfuscatedMacroCode() {
        return this.backingStore.get("defenderScriptObfuscatedMacroCode");
    }
    /**
     * Gets the defenderScriptObfuscatedMacroCodeType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @jakarta.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderScriptObfuscatedMacroCodeType() {
        return this.backingStore.get("defenderScriptObfuscatedMacroCodeType");
    }
    /**
     * Gets the defenderSecurityCenterBlockExploitProtectionOverride property value. Indicates whether or not to block user from overriding Exploit Protection settings.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterBlockExploitProtectionOverride() {
        return this.backingStore.get("defenderSecurityCenterBlockExploitProtectionOverride");
    }
    /**
     * Gets the defenderSecurityCenterDisableAccountUI property value. Used to disable the display of the account protection area.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableAccountUI() {
        return this.backingStore.get("defenderSecurityCenterDisableAccountUI");
    }
    /**
     * Gets the defenderSecurityCenterDisableAppBrowserUI property value. Used to disable the display of the app and browser protection area.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableAppBrowserUI() {
        return this.backingStore.get("defenderSecurityCenterDisableAppBrowserUI");
    }
    /**
     * Gets the defenderSecurityCenterDisableClearTpmUI property value. Used to disable the display of the Clear TPM button.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableClearTpmUI() {
        return this.backingStore.get("defenderSecurityCenterDisableClearTpmUI");
    }
    /**
     * Gets the defenderSecurityCenterDisableFamilyUI property value. Used to disable the display of the family options area.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableFamilyUI() {
        return this.backingStore.get("defenderSecurityCenterDisableFamilyUI");
    }
    /**
     * Gets the defenderSecurityCenterDisableHardwareUI property value. Used to disable the display of the hardware protection area.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableHardwareUI() {
        return this.backingStore.get("defenderSecurityCenterDisableHardwareUI");
    }
    /**
     * Gets the defenderSecurityCenterDisableHealthUI property value. Used to disable the display of the device performance and health area.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableHealthUI() {
        return this.backingStore.get("defenderSecurityCenterDisableHealthUI");
    }
    /**
     * Gets the defenderSecurityCenterDisableNetworkUI property value. Used to disable the display of the firewall and network protection area.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableNetworkUI() {
        return this.backingStore.get("defenderSecurityCenterDisableNetworkUI");
    }
    /**
     * Gets the defenderSecurityCenterDisableNotificationAreaUI property value. Used to disable the display of the notification area control. The user needs to either sign out and sign in or reboot the computer for this setting to take effect.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableNotificationAreaUI() {
        return this.backingStore.get("defenderSecurityCenterDisableNotificationAreaUI");
    }
    /**
     * Gets the defenderSecurityCenterDisableRansomwareUI property value. Used to disable the display of the ransomware protection area.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableRansomwareUI() {
        return this.backingStore.get("defenderSecurityCenterDisableRansomwareUI");
    }
    /**
     * Gets the defenderSecurityCenterDisableSecureBootUI property value. Used to disable the display of the secure boot area under Device security.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableSecureBootUI() {
        return this.backingStore.get("defenderSecurityCenterDisableSecureBootUI");
    }
    /**
     * Gets the defenderSecurityCenterDisableTroubleshootingUI property value. Used to disable the display of the security process troubleshooting under Device security.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableTroubleshootingUI() {
        return this.backingStore.get("defenderSecurityCenterDisableTroubleshootingUI");
    }
    /**
     * Gets the defenderSecurityCenterDisableVirusUI property value. Used to disable the display of the virus and threat protection area.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableVirusUI() {
        return this.backingStore.get("defenderSecurityCenterDisableVirusUI");
    }
    /**
     * Gets the defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI property value. Used to disable the display of update TPM Firmware when a vulnerable firmware is detected.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI() {
        return this.backingStore.get("defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI");
    }
    /**
     * Gets the defenderSecurityCenterHelpEmail property value. The email address that is displayed to users.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefenderSecurityCenterHelpEmail() {
        return this.backingStore.get("defenderSecurityCenterHelpEmail");
    }
    /**
     * Gets the defenderSecurityCenterHelpPhone property value. The phone number or Skype ID that is displayed to users.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefenderSecurityCenterHelpPhone() {
        return this.backingStore.get("defenderSecurityCenterHelpPhone");
    }
    /**
     * Gets the defenderSecurityCenterHelpURL property value. The help portal URL this is displayed to users.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefenderSecurityCenterHelpURL() {
        return this.backingStore.get("defenderSecurityCenterHelpURL");
    }
    /**
     * Gets the defenderSecurityCenterITContactDisplay property value. Possible values for defenderSecurityCenterITContactDisplay
     * @return a DefenderSecurityCenterITContactDisplayType
     */
    @jakarta.annotation.Nullable
    public DefenderSecurityCenterITContactDisplayType getDefenderSecurityCenterITContactDisplay() {
        return this.backingStore.get("defenderSecurityCenterITContactDisplay");
    }
    /**
     * Gets the defenderSecurityCenterNotificationsFromApp property value. Possible values for defenderSecurityCenterNotificationsFromApp
     * @return a DefenderSecurityCenterNotificationsFromAppType
     */
    @jakarta.annotation.Nullable
    public DefenderSecurityCenterNotificationsFromAppType getDefenderSecurityCenterNotificationsFromApp() {
        return this.backingStore.get("defenderSecurityCenterNotificationsFromApp");
    }
    /**
     * Gets the defenderSecurityCenterOrganizationDisplayName property value. The company name that is displayed to the users.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefenderSecurityCenterOrganizationDisplayName() {
        return this.backingStore.get("defenderSecurityCenterOrganizationDisplayName");
    }
    /**
     * Gets the defenderSignatureUpdateIntervalInHours property value. Specifies the interval (in hours) that will be used to check for signatures, so instead of using the ScheduleDay and ScheduleTime the check for new signatures will be set according to the interval. Valid values 0 to 24
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDefenderSignatureUpdateIntervalInHours() {
        return this.backingStore.get("defenderSignatureUpdateIntervalInHours");
    }
    /**
     * Gets the defenderSubmitSamplesConsentType property value. Checks for the user consent level in Windows Defender to send data. Possible values are: sendSafeSamplesAutomatically, alwaysPrompt, neverSend, sendAllSamplesAutomatically.
     * @return a Windows10EndpointProtectionConfigurationDefenderSubmitSamplesConsentType
     */
    @jakarta.annotation.Nullable
    public Windows10EndpointProtectionConfigurationDefenderSubmitSamplesConsentType getDefenderSubmitSamplesConsentType() {
        return this.backingStore.get("defenderSubmitSamplesConsentType");
    }
    /**
     * Gets the defenderUntrustedExecutable property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderUntrustedExecutable() {
        return this.backingStore.get("defenderUntrustedExecutable");
    }
    /**
     * Gets the defenderUntrustedExecutableType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @jakarta.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderUntrustedExecutableType() {
        return this.backingStore.get("defenderUntrustedExecutableType");
    }
    /**
     * Gets the defenderUntrustedUSBProcess property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @jakarta.annotation.Nullable
    public DefenderProtectionType getDefenderUntrustedUSBProcess() {
        return this.backingStore.get("defenderUntrustedUSBProcess");
    }
    /**
     * Gets the defenderUntrustedUSBProcessType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @jakarta.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderUntrustedUSBProcessType() {
        return this.backingStore.get("defenderUntrustedUSBProcessType");
    }
    /**
     * Gets the deviceGuardEnableSecureBootWithDMA property value. This property will be deprecated in May 2019 and will be replaced with property DeviceGuardSecureBootWithDMA. Specifies whether Platform Security Level is enabled at next reboot.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceGuardEnableSecureBootWithDMA() {
        return this.backingStore.get("deviceGuardEnableSecureBootWithDMA");
    }
    /**
     * Gets the deviceGuardEnableVirtualizationBasedSecurity property value. Turns On Virtualization Based Security(VBS).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceGuardEnableVirtualizationBasedSecurity() {
        return this.backingStore.get("deviceGuardEnableVirtualizationBasedSecurity");
    }
    /**
     * Gets the deviceGuardLaunchSystemGuard property value. Possible values of a property
     * @return a Enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getDeviceGuardLaunchSystemGuard() {
        return this.backingStore.get("deviceGuardLaunchSystemGuard");
    }
    /**
     * Gets the deviceGuardLocalSystemAuthorityCredentialGuardSettings property value. Possible values of Credential Guard settings.
     * @return a DeviceGuardLocalSystemAuthorityCredentialGuardType
     */
    @jakarta.annotation.Nullable
    public DeviceGuardLocalSystemAuthorityCredentialGuardType getDeviceGuardLocalSystemAuthorityCredentialGuardSettings() {
        return this.backingStore.get("deviceGuardLocalSystemAuthorityCredentialGuardSettings");
    }
    /**
     * Gets the deviceGuardSecureBootWithDMA property value. Possible values of Secure Boot with DMA
     * @return a SecureBootWithDMAType
     */
    @jakarta.annotation.Nullable
    public SecureBootWithDMAType getDeviceGuardSecureBootWithDMA() {
        return this.backingStore.get("deviceGuardSecureBootWithDMA");
    }
    /**
     * Gets the dmaGuardDeviceEnumerationPolicy property value. Possible values of the DmaGuardDeviceEnumerationPolicy.
     * @return a DmaGuardDeviceEnumerationPolicyType
     */
    @jakarta.annotation.Nullable
    public DmaGuardDeviceEnumerationPolicyType getDmaGuardDeviceEnumerationPolicy() {
        return this.backingStore.get("dmaGuardDeviceEnumerationPolicy");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationGuardAllowCameraMicrophoneRedirection", (n) -> { this.setApplicationGuardAllowCameraMicrophoneRedirection(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardAllowFileSaveOnHost", (n) -> { this.setApplicationGuardAllowFileSaveOnHost(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardAllowPersistence", (n) -> { this.setApplicationGuardAllowPersistence(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardAllowPrintToLocalPrinters", (n) -> { this.setApplicationGuardAllowPrintToLocalPrinters(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardAllowPrintToNetworkPrinters", (n) -> { this.setApplicationGuardAllowPrintToNetworkPrinters(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardAllowPrintToPDF", (n) -> { this.setApplicationGuardAllowPrintToPDF(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardAllowPrintToXPS", (n) -> { this.setApplicationGuardAllowPrintToXPS(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardAllowVirtualGPU", (n) -> { this.setApplicationGuardAllowVirtualGPU(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardBlockClipboardSharing", (n) -> { this.setApplicationGuardBlockClipboardSharing(n.getEnumValue(ApplicationGuardBlockClipboardSharingType::forValue)); });
        deserializerMap.put("applicationGuardBlockFileTransfer", (n) -> { this.setApplicationGuardBlockFileTransfer(n.getEnumValue(ApplicationGuardBlockFileTransferType::forValue)); });
        deserializerMap.put("applicationGuardBlockNonEnterpriseContent", (n) -> { this.setApplicationGuardBlockNonEnterpriseContent(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardCertificateThumbprints", (n) -> { this.setApplicationGuardCertificateThumbprints(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("applicationGuardEnabled", (n) -> { this.setApplicationGuardEnabled(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardEnabledOptions", (n) -> { this.setApplicationGuardEnabledOptions(n.getEnumValue(ApplicationGuardEnabledOptions::forValue)); });
        deserializerMap.put("applicationGuardForceAuditing", (n) -> { this.setApplicationGuardForceAuditing(n.getBooleanValue()); });
        deserializerMap.put("appLockerApplicationControl", (n) -> { this.setAppLockerApplicationControl(n.getEnumValue(AppLockerApplicationControlType::forValue)); });
        deserializerMap.put("bitLockerAllowStandardUserEncryption", (n) -> { this.setBitLockerAllowStandardUserEncryption(n.getBooleanValue()); });
        deserializerMap.put("bitLockerDisableWarningForOtherDiskEncryption", (n) -> { this.setBitLockerDisableWarningForOtherDiskEncryption(n.getBooleanValue()); });
        deserializerMap.put("bitLockerEnableStorageCardEncryptionOnMobile", (n) -> { this.setBitLockerEnableStorageCardEncryptionOnMobile(n.getBooleanValue()); });
        deserializerMap.put("bitLockerEncryptDevice", (n) -> { this.setBitLockerEncryptDevice(n.getBooleanValue()); });
        deserializerMap.put("bitLockerFixedDrivePolicy", (n) -> { this.setBitLockerFixedDrivePolicy(n.getObjectValue(BitLockerFixedDrivePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("bitLockerRecoveryPasswordRotation", (n) -> { this.setBitLockerRecoveryPasswordRotation(n.getEnumValue(BitLockerRecoveryPasswordRotationType::forValue)); });
        deserializerMap.put("bitLockerRemovableDrivePolicy", (n) -> { this.setBitLockerRemovableDrivePolicy(n.getObjectValue(BitLockerRemovableDrivePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("bitLockerSystemDrivePolicy", (n) -> { this.setBitLockerSystemDrivePolicy(n.getObjectValue(BitLockerSystemDrivePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("defenderAdditionalGuardedFolders", (n) -> { this.setDefenderAdditionalGuardedFolders(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderAdobeReaderLaunchChildProcess", (n) -> { this.setDefenderAdobeReaderLaunchChildProcess(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderAdvancedRansomewareProtectionType", (n) -> { this.setDefenderAdvancedRansomewareProtectionType(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderAllowBehaviorMonitoring", (n) -> { this.setDefenderAllowBehaviorMonitoring(n.getBooleanValue()); });
        deserializerMap.put("defenderAllowCloudProtection", (n) -> { this.setDefenderAllowCloudProtection(n.getBooleanValue()); });
        deserializerMap.put("defenderAllowEndUserAccess", (n) -> { this.setDefenderAllowEndUserAccess(n.getBooleanValue()); });
        deserializerMap.put("defenderAllowIntrusionPreventionSystem", (n) -> { this.setDefenderAllowIntrusionPreventionSystem(n.getBooleanValue()); });
        deserializerMap.put("defenderAllowOnAccessProtection", (n) -> { this.setDefenderAllowOnAccessProtection(n.getBooleanValue()); });
        deserializerMap.put("defenderAllowRealTimeMonitoring", (n) -> { this.setDefenderAllowRealTimeMonitoring(n.getBooleanValue()); });
        deserializerMap.put("defenderAllowScanArchiveFiles", (n) -> { this.setDefenderAllowScanArchiveFiles(n.getBooleanValue()); });
        deserializerMap.put("defenderAllowScanDownloads", (n) -> { this.setDefenderAllowScanDownloads(n.getBooleanValue()); });
        deserializerMap.put("defenderAllowScanNetworkFiles", (n) -> { this.setDefenderAllowScanNetworkFiles(n.getBooleanValue()); });
        deserializerMap.put("defenderAllowScanRemovableDrivesDuringFullScan", (n) -> { this.setDefenderAllowScanRemovableDrivesDuringFullScan(n.getBooleanValue()); });
        deserializerMap.put("defenderAllowScanScriptsLoadedInInternetExplorer", (n) -> { this.setDefenderAllowScanScriptsLoadedInInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("defenderAttackSurfaceReductionExcludedPaths", (n) -> { this.setDefenderAttackSurfaceReductionExcludedPaths(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderBlockEndUserAccess", (n) -> { this.setDefenderBlockEndUserAccess(n.getBooleanValue()); });
        deserializerMap.put("defenderBlockPersistenceThroughWmiType", (n) -> { this.setDefenderBlockPersistenceThroughWmiType(n.getEnumValue(DefenderAttackSurfaceType::forValue)); });
        deserializerMap.put("defenderCheckForSignaturesBeforeRunningScan", (n) -> { this.setDefenderCheckForSignaturesBeforeRunningScan(n.getBooleanValue()); });
        deserializerMap.put("defenderCloudBlockLevel", (n) -> { this.setDefenderCloudBlockLevel(n.getEnumValue(Windows10EndpointProtectionConfigurationDefenderCloudBlockLevel::forValue)); });
        deserializerMap.put("defenderCloudExtendedTimeoutInSeconds", (n) -> { this.setDefenderCloudExtendedTimeoutInSeconds(n.getIntegerValue()); });
        deserializerMap.put("defenderDaysBeforeDeletingQuarantinedMalware", (n) -> { this.setDefenderDaysBeforeDeletingQuarantinedMalware(n.getIntegerValue()); });
        deserializerMap.put("defenderDetectedMalwareActions", (n) -> { this.setDefenderDetectedMalwareActions(n.getObjectValue(DefenderDetectedMalwareActions::createFromDiscriminatorValue)); });
        deserializerMap.put("defenderDisableBehaviorMonitoring", (n) -> { this.setDefenderDisableBehaviorMonitoring(n.getBooleanValue()); });
        deserializerMap.put("defenderDisableCatchupFullScan", (n) -> { this.setDefenderDisableCatchupFullScan(n.getBooleanValue()); });
        deserializerMap.put("defenderDisableCatchupQuickScan", (n) -> { this.setDefenderDisableCatchupQuickScan(n.getBooleanValue()); });
        deserializerMap.put("defenderDisableCloudProtection", (n) -> { this.setDefenderDisableCloudProtection(n.getBooleanValue()); });
        deserializerMap.put("defenderDisableIntrusionPreventionSystem", (n) -> { this.setDefenderDisableIntrusionPreventionSystem(n.getBooleanValue()); });
        deserializerMap.put("defenderDisableOnAccessProtection", (n) -> { this.setDefenderDisableOnAccessProtection(n.getBooleanValue()); });
        deserializerMap.put("defenderDisableRealTimeMonitoring", (n) -> { this.setDefenderDisableRealTimeMonitoring(n.getBooleanValue()); });
        deserializerMap.put("defenderDisableScanArchiveFiles", (n) -> { this.setDefenderDisableScanArchiveFiles(n.getBooleanValue()); });
        deserializerMap.put("defenderDisableScanDownloads", (n) -> { this.setDefenderDisableScanDownloads(n.getBooleanValue()); });
        deserializerMap.put("defenderDisableScanNetworkFiles", (n) -> { this.setDefenderDisableScanNetworkFiles(n.getBooleanValue()); });
        deserializerMap.put("defenderDisableScanRemovableDrivesDuringFullScan", (n) -> { this.setDefenderDisableScanRemovableDrivesDuringFullScan(n.getBooleanValue()); });
        deserializerMap.put("defenderDisableScanScriptsLoadedInInternetExplorer", (n) -> { this.setDefenderDisableScanScriptsLoadedInInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("defenderEmailContentExecution", (n) -> { this.setDefenderEmailContentExecution(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderEmailContentExecutionType", (n) -> { this.setDefenderEmailContentExecutionType(n.getEnumValue(DefenderAttackSurfaceType::forValue)); });
        deserializerMap.put("defenderEnableLowCpuPriority", (n) -> { this.setDefenderEnableLowCpuPriority(n.getBooleanValue()); });
        deserializerMap.put("defenderEnableScanIncomingMail", (n) -> { this.setDefenderEnableScanIncomingMail(n.getBooleanValue()); });
        deserializerMap.put("defenderEnableScanMappedNetworkDrivesDuringFullScan", (n) -> { this.setDefenderEnableScanMappedNetworkDrivesDuringFullScan(n.getBooleanValue()); });
        deserializerMap.put("defenderExploitProtectionXml", (n) -> { this.setDefenderExploitProtectionXml(n.getByteArrayValue()); });
        deserializerMap.put("defenderExploitProtectionXmlFileName", (n) -> { this.setDefenderExploitProtectionXmlFileName(n.getStringValue()); });
        deserializerMap.put("defenderFileExtensionsToExclude", (n) -> { this.setDefenderFileExtensionsToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderFilesAndFoldersToExclude", (n) -> { this.setDefenderFilesAndFoldersToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderGuardedFoldersAllowedAppPaths", (n) -> { this.setDefenderGuardedFoldersAllowedAppPaths(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderGuardMyFoldersType", (n) -> { this.setDefenderGuardMyFoldersType(n.getEnumValue(FolderProtectionType::forValue)); });
        deserializerMap.put("defenderNetworkProtectionType", (n) -> { this.setDefenderNetworkProtectionType(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderOfficeAppsExecutableContentCreationOrLaunch", (n) -> { this.setDefenderOfficeAppsExecutableContentCreationOrLaunch(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderOfficeAppsExecutableContentCreationOrLaunchType", (n) -> { this.setDefenderOfficeAppsExecutableContentCreationOrLaunchType(n.getEnumValue(DefenderAttackSurfaceType::forValue)); });
        deserializerMap.put("defenderOfficeAppsLaunchChildProcess", (n) -> { this.setDefenderOfficeAppsLaunchChildProcess(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderOfficeAppsLaunchChildProcessType", (n) -> { this.setDefenderOfficeAppsLaunchChildProcessType(n.getEnumValue(DefenderAttackSurfaceType::forValue)); });
        deserializerMap.put("defenderOfficeAppsOtherProcessInjection", (n) -> { this.setDefenderOfficeAppsOtherProcessInjection(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderOfficeAppsOtherProcessInjectionType", (n) -> { this.setDefenderOfficeAppsOtherProcessInjectionType(n.getEnumValue(DefenderAttackSurfaceType::forValue)); });
        deserializerMap.put("defenderOfficeCommunicationAppsLaunchChildProcess", (n) -> { this.setDefenderOfficeCommunicationAppsLaunchChildProcess(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderOfficeMacroCodeAllowWin32Imports", (n) -> { this.setDefenderOfficeMacroCodeAllowWin32Imports(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderOfficeMacroCodeAllowWin32ImportsType", (n) -> { this.setDefenderOfficeMacroCodeAllowWin32ImportsType(n.getEnumValue(DefenderAttackSurfaceType::forValue)); });
        deserializerMap.put("defenderPotentiallyUnwantedAppAction", (n) -> { this.setDefenderPotentiallyUnwantedAppAction(n.getEnumValue(Windows10EndpointProtectionConfigurationDefenderPotentiallyUnwantedAppAction::forValue)); });
        deserializerMap.put("defenderPreventCredentialStealingType", (n) -> { this.setDefenderPreventCredentialStealingType(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderProcessCreation", (n) -> { this.setDefenderProcessCreation(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderProcessCreationType", (n) -> { this.setDefenderProcessCreationType(n.getEnumValue(DefenderAttackSurfaceType::forValue)); });
        deserializerMap.put("defenderProcessesToExclude", (n) -> { this.setDefenderProcessesToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderScanDirection", (n) -> { this.setDefenderScanDirection(n.getEnumValue(Windows10EndpointProtectionConfigurationDefenderScanDirection::forValue)); });
        deserializerMap.put("defenderScanMaxCpuPercentage", (n) -> { this.setDefenderScanMaxCpuPercentage(n.getIntegerValue()); });
        deserializerMap.put("defenderScanType", (n) -> { this.setDefenderScanType(n.getEnumValue(Windows10EndpointProtectionConfigurationDefenderScanType::forValue)); });
        deserializerMap.put("defenderScheduledQuickScanTime", (n) -> { this.setDefenderScheduledQuickScanTime(n.getLocalTimeValue()); });
        deserializerMap.put("defenderScheduledScanDay", (n) -> { this.setDefenderScheduledScanDay(n.getEnumValue(Windows10EndpointProtectionConfigurationDefenderScheduledScanDay::forValue)); });
        deserializerMap.put("defenderScheduledScanTime", (n) -> { this.setDefenderScheduledScanTime(n.getLocalTimeValue()); });
        deserializerMap.put("defenderScriptDownloadedPayloadExecution", (n) -> { this.setDefenderScriptDownloadedPayloadExecution(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderScriptDownloadedPayloadExecutionType", (n) -> { this.setDefenderScriptDownloadedPayloadExecutionType(n.getEnumValue(DefenderAttackSurfaceType::forValue)); });
        deserializerMap.put("defenderScriptObfuscatedMacroCode", (n) -> { this.setDefenderScriptObfuscatedMacroCode(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderScriptObfuscatedMacroCodeType", (n) -> { this.setDefenderScriptObfuscatedMacroCodeType(n.getEnumValue(DefenderAttackSurfaceType::forValue)); });
        deserializerMap.put("defenderSecurityCenterBlockExploitProtectionOverride", (n) -> { this.setDefenderSecurityCenterBlockExploitProtectionOverride(n.getBooleanValue()); });
        deserializerMap.put("defenderSecurityCenterDisableAccountUI", (n) -> { this.setDefenderSecurityCenterDisableAccountUI(n.getBooleanValue()); });
        deserializerMap.put("defenderSecurityCenterDisableAppBrowserUI", (n) -> { this.setDefenderSecurityCenterDisableAppBrowserUI(n.getBooleanValue()); });
        deserializerMap.put("defenderSecurityCenterDisableClearTpmUI", (n) -> { this.setDefenderSecurityCenterDisableClearTpmUI(n.getBooleanValue()); });
        deserializerMap.put("defenderSecurityCenterDisableFamilyUI", (n) -> { this.setDefenderSecurityCenterDisableFamilyUI(n.getBooleanValue()); });
        deserializerMap.put("defenderSecurityCenterDisableHardwareUI", (n) -> { this.setDefenderSecurityCenterDisableHardwareUI(n.getBooleanValue()); });
        deserializerMap.put("defenderSecurityCenterDisableHealthUI", (n) -> { this.setDefenderSecurityCenterDisableHealthUI(n.getBooleanValue()); });
        deserializerMap.put("defenderSecurityCenterDisableNetworkUI", (n) -> { this.setDefenderSecurityCenterDisableNetworkUI(n.getBooleanValue()); });
        deserializerMap.put("defenderSecurityCenterDisableNotificationAreaUI", (n) -> { this.setDefenderSecurityCenterDisableNotificationAreaUI(n.getBooleanValue()); });
        deserializerMap.put("defenderSecurityCenterDisableRansomwareUI", (n) -> { this.setDefenderSecurityCenterDisableRansomwareUI(n.getBooleanValue()); });
        deserializerMap.put("defenderSecurityCenterDisableSecureBootUI", (n) -> { this.setDefenderSecurityCenterDisableSecureBootUI(n.getBooleanValue()); });
        deserializerMap.put("defenderSecurityCenterDisableTroubleshootingUI", (n) -> { this.setDefenderSecurityCenterDisableTroubleshootingUI(n.getBooleanValue()); });
        deserializerMap.put("defenderSecurityCenterDisableVirusUI", (n) -> { this.setDefenderSecurityCenterDisableVirusUI(n.getBooleanValue()); });
        deserializerMap.put("defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI", (n) -> { this.setDefenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI(n.getBooleanValue()); });
        deserializerMap.put("defenderSecurityCenterHelpEmail", (n) -> { this.setDefenderSecurityCenterHelpEmail(n.getStringValue()); });
        deserializerMap.put("defenderSecurityCenterHelpPhone", (n) -> { this.setDefenderSecurityCenterHelpPhone(n.getStringValue()); });
        deserializerMap.put("defenderSecurityCenterHelpURL", (n) -> { this.setDefenderSecurityCenterHelpURL(n.getStringValue()); });
        deserializerMap.put("defenderSecurityCenterITContactDisplay", (n) -> { this.setDefenderSecurityCenterITContactDisplay(n.getEnumValue(DefenderSecurityCenterITContactDisplayType::forValue)); });
        deserializerMap.put("defenderSecurityCenterNotificationsFromApp", (n) -> { this.setDefenderSecurityCenterNotificationsFromApp(n.getEnumValue(DefenderSecurityCenterNotificationsFromAppType::forValue)); });
        deserializerMap.put("defenderSecurityCenterOrganizationDisplayName", (n) -> { this.setDefenderSecurityCenterOrganizationDisplayName(n.getStringValue()); });
        deserializerMap.put("defenderSignatureUpdateIntervalInHours", (n) -> { this.setDefenderSignatureUpdateIntervalInHours(n.getIntegerValue()); });
        deserializerMap.put("defenderSubmitSamplesConsentType", (n) -> { this.setDefenderSubmitSamplesConsentType(n.getEnumValue(Windows10EndpointProtectionConfigurationDefenderSubmitSamplesConsentType::forValue)); });
        deserializerMap.put("defenderUntrustedExecutable", (n) -> { this.setDefenderUntrustedExecutable(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderUntrustedExecutableType", (n) -> { this.setDefenderUntrustedExecutableType(n.getEnumValue(DefenderAttackSurfaceType::forValue)); });
        deserializerMap.put("defenderUntrustedUSBProcess", (n) -> { this.setDefenderUntrustedUSBProcess(n.getEnumValue(DefenderProtectionType::forValue)); });
        deserializerMap.put("defenderUntrustedUSBProcessType", (n) -> { this.setDefenderUntrustedUSBProcessType(n.getEnumValue(DefenderAttackSurfaceType::forValue)); });
        deserializerMap.put("deviceGuardEnableSecureBootWithDMA", (n) -> { this.setDeviceGuardEnableSecureBootWithDMA(n.getBooleanValue()); });
        deserializerMap.put("deviceGuardEnableVirtualizationBasedSecurity", (n) -> { this.setDeviceGuardEnableVirtualizationBasedSecurity(n.getBooleanValue()); });
        deserializerMap.put("deviceGuardLaunchSystemGuard", (n) -> { this.setDeviceGuardLaunchSystemGuard(n.getEnumValue(Enablement::forValue)); });
        deserializerMap.put("deviceGuardLocalSystemAuthorityCredentialGuardSettings", (n) -> { this.setDeviceGuardLocalSystemAuthorityCredentialGuardSettings(n.getEnumValue(DeviceGuardLocalSystemAuthorityCredentialGuardType::forValue)); });
        deserializerMap.put("deviceGuardSecureBootWithDMA", (n) -> { this.setDeviceGuardSecureBootWithDMA(n.getEnumValue(SecureBootWithDMAType::forValue)); });
        deserializerMap.put("dmaGuardDeviceEnumerationPolicy", (n) -> { this.setDmaGuardDeviceEnumerationPolicy(n.getEnumValue(DmaGuardDeviceEnumerationPolicyType::forValue)); });
        deserializerMap.put("firewallBlockStatefulFTP", (n) -> { this.setFirewallBlockStatefulFTP(n.getBooleanValue()); });
        deserializerMap.put("firewallCertificateRevocationListCheckMethod", (n) -> { this.setFirewallCertificateRevocationListCheckMethod(n.getEnumValue(FirewallCertificateRevocationListCheckMethodType::forValue)); });
        deserializerMap.put("firewallIdleTimeoutForSecurityAssociationInSeconds", (n) -> { this.setFirewallIdleTimeoutForSecurityAssociationInSeconds(n.getIntegerValue()); });
        deserializerMap.put("firewallIPSecExemptionsAllowDHCP", (n) -> { this.setFirewallIPSecExemptionsAllowDHCP(n.getBooleanValue()); });
        deserializerMap.put("firewallIPSecExemptionsAllowICMP", (n) -> { this.setFirewallIPSecExemptionsAllowICMP(n.getBooleanValue()); });
        deserializerMap.put("firewallIPSecExemptionsAllowNeighborDiscovery", (n) -> { this.setFirewallIPSecExemptionsAllowNeighborDiscovery(n.getBooleanValue()); });
        deserializerMap.put("firewallIPSecExemptionsAllowRouterDiscovery", (n) -> { this.setFirewallIPSecExemptionsAllowRouterDiscovery(n.getBooleanValue()); });
        deserializerMap.put("firewallIPSecExemptionsNone", (n) -> { this.setFirewallIPSecExemptionsNone(n.getBooleanValue()); });
        deserializerMap.put("firewallMergeKeyingModuleSettings", (n) -> { this.setFirewallMergeKeyingModuleSettings(n.getBooleanValue()); });
        deserializerMap.put("firewallPacketQueueingMethod", (n) -> { this.setFirewallPacketQueueingMethod(n.getEnumValue(FirewallPacketQueueingMethodType::forValue)); });
        deserializerMap.put("firewallPreSharedKeyEncodingMethod", (n) -> { this.setFirewallPreSharedKeyEncodingMethod(n.getEnumValue(FirewallPreSharedKeyEncodingMethodType::forValue)); });
        deserializerMap.put("firewallProfileDomain", (n) -> { this.setFirewallProfileDomain(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("firewallProfilePrivate", (n) -> { this.setFirewallProfilePrivate(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("firewallProfilePublic", (n) -> { this.setFirewallProfilePublic(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("firewallRules", (n) -> { this.setFirewallRules(n.getCollectionOfObjectValues(WindowsFirewallRule::createFromDiscriminatorValue)); });
        deserializerMap.put("lanManagerAuthenticationLevel", (n) -> { this.setLanManagerAuthenticationLevel(n.getEnumValue(LanManagerAuthenticationLevel::forValue)); });
        deserializerMap.put("lanManagerWorkstationDisableInsecureGuestLogons", (n) -> { this.setLanManagerWorkstationDisableInsecureGuestLogons(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsAdministratorAccountName", (n) -> { this.setLocalSecurityOptionsAdministratorAccountName(n.getStringValue()); });
        deserializerMap.put("localSecurityOptionsAdministratorElevationPromptBehavior", (n) -> { this.setLocalSecurityOptionsAdministratorElevationPromptBehavior(n.getEnumValue(LocalSecurityOptionsAdministratorElevationPromptBehaviorType::forValue)); });
        deserializerMap.put("localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares", (n) -> { this.setLocalSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsAllowPKU2UAuthenticationRequests", (n) -> { this.setLocalSecurityOptionsAllowPKU2UAuthenticationRequests(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager", (n) -> { this.setLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager(n.getStringValue()); });
        deserializerMap.put("localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool", (n) -> { this.setLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn", (n) -> { this.setLocalSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsAllowUIAccessApplicationElevation", (n) -> { this.setLocalSecurityOptionsAllowUIAccessApplicationElevation(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsAllowUIAccessApplicationsForSecureLocations", (n) -> { this.setLocalSecurityOptionsAllowUIAccessApplicationsForSecureLocations(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsAllowUndockWithoutHavingToLogon", (n) -> { this.setLocalSecurityOptionsAllowUndockWithoutHavingToLogon(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsBlockMicrosoftAccounts", (n) -> { this.setLocalSecurityOptionsBlockMicrosoftAccounts(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsBlockRemoteLogonWithBlankPassword", (n) -> { this.setLocalSecurityOptionsBlockRemoteLogonWithBlankPassword(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsBlockRemoteOpticalDriveAccess", (n) -> { this.setLocalSecurityOptionsBlockRemoteOpticalDriveAccess(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsBlockUsersInstallingPrinterDrivers", (n) -> { this.setLocalSecurityOptionsBlockUsersInstallingPrinterDrivers(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsClearVirtualMemoryPageFile", (n) -> { this.setLocalSecurityOptionsClearVirtualMemoryPageFile(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsClientDigitallySignCommunicationsAlways", (n) -> { this.setLocalSecurityOptionsClientDigitallySignCommunicationsAlways(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers", (n) -> { this.setLocalSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation", (n) -> { this.setLocalSecurityOptionsDetectApplicationInstallationsAndPromptForElevation(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsDisableAdministratorAccount", (n) -> { this.setLocalSecurityOptionsDisableAdministratorAccount(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees", (n) -> { this.setLocalSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsDisableGuestAccount", (n) -> { this.setLocalSecurityOptionsDisableGuestAccount(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsDisableServerDigitallySignCommunicationsAlways", (n) -> { this.setLocalSecurityOptionsDisableServerDigitallySignCommunicationsAlways(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees", (n) -> { this.setLocalSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts", (n) -> { this.setLocalSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsDoNotRequireCtrlAltDel", (n) -> { this.setLocalSecurityOptionsDoNotRequireCtrlAltDel(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange", (n) -> { this.setLocalSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser", (n) -> { this.setLocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser(n.getEnumValue(LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType::forValue)); });
        deserializerMap.put("localSecurityOptionsGuestAccountName", (n) -> { this.setLocalSecurityOptionsGuestAccountName(n.getStringValue()); });
        deserializerMap.put("localSecurityOptionsHideLastSignedInUser", (n) -> { this.setLocalSecurityOptionsHideLastSignedInUser(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsHideUsernameAtSignIn", (n) -> { this.setLocalSecurityOptionsHideUsernameAtSignIn(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsInformationDisplayedOnLockScreen", (n) -> { this.setLocalSecurityOptionsInformationDisplayedOnLockScreen(n.getEnumValue(LocalSecurityOptionsInformationDisplayedOnLockScreenType::forValue)); });
        deserializerMap.put("localSecurityOptionsInformationShownOnLockScreen", (n) -> { this.setLocalSecurityOptionsInformationShownOnLockScreen(n.getEnumValue(LocalSecurityOptionsInformationShownOnLockScreenType::forValue)); });
        deserializerMap.put("localSecurityOptionsLogOnMessageText", (n) -> { this.setLocalSecurityOptionsLogOnMessageText(n.getStringValue()); });
        deserializerMap.put("localSecurityOptionsLogOnMessageTitle", (n) -> { this.setLocalSecurityOptionsLogOnMessageTitle(n.getStringValue()); });
        deserializerMap.put("localSecurityOptionsMachineInactivityLimit", (n) -> { this.setLocalSecurityOptionsMachineInactivityLimit(n.getIntegerValue()); });
        deserializerMap.put("localSecurityOptionsMachineInactivityLimitInMinutes", (n) -> { this.setLocalSecurityOptionsMachineInactivityLimitInMinutes(n.getIntegerValue()); });
        deserializerMap.put("localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients", (n) -> { this.setLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients(n.getEnumValue(LocalSecurityOptionsMinimumSessionSecurity::forValue)); });
        deserializerMap.put("localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers", (n) -> { this.setLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers(n.getEnumValue(LocalSecurityOptionsMinimumSessionSecurity::forValue)); });
        deserializerMap.put("localSecurityOptionsOnlyElevateSignedExecutables", (n) -> { this.setLocalSecurityOptionsOnlyElevateSignedExecutables(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares", (n) -> { this.setLocalSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsSmartCardRemovalBehavior", (n) -> { this.setLocalSecurityOptionsSmartCardRemovalBehavior(n.getEnumValue(LocalSecurityOptionsSmartCardRemovalBehaviorType::forValue)); });
        deserializerMap.put("localSecurityOptionsStandardUserElevationPromptBehavior", (n) -> { this.setLocalSecurityOptionsStandardUserElevationPromptBehavior(n.getEnumValue(LocalSecurityOptionsStandardUserElevationPromptBehaviorType::forValue)); });
        deserializerMap.put("localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation", (n) -> { this.setLocalSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsUseAdminApprovalMode", (n) -> { this.setLocalSecurityOptionsUseAdminApprovalMode(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsUseAdminApprovalModeForAdministrators", (n) -> { this.setLocalSecurityOptionsUseAdminApprovalModeForAdministrators(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations", (n) -> { this.setLocalSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations(n.getBooleanValue()); });
        deserializerMap.put("smartScreenBlockOverrideForFiles", (n) -> { this.setSmartScreenBlockOverrideForFiles(n.getBooleanValue()); });
        deserializerMap.put("smartScreenEnableInShell", (n) -> { this.setSmartScreenEnableInShell(n.getBooleanValue()); });
        deserializerMap.put("userRightsAccessCredentialManagerAsTrustedCaller", (n) -> { this.setUserRightsAccessCredentialManagerAsTrustedCaller(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsActAsPartOfTheOperatingSystem", (n) -> { this.setUserRightsActAsPartOfTheOperatingSystem(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsAllowAccessFromNetwork", (n) -> { this.setUserRightsAllowAccessFromNetwork(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsBackupData", (n) -> { this.setUserRightsBackupData(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsBlockAccessFromNetwork", (n) -> { this.setUserRightsBlockAccessFromNetwork(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsChangeSystemTime", (n) -> { this.setUserRightsChangeSystemTime(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsCreateGlobalObjects", (n) -> { this.setUserRightsCreateGlobalObjects(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsCreatePageFile", (n) -> { this.setUserRightsCreatePageFile(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsCreatePermanentSharedObjects", (n) -> { this.setUserRightsCreatePermanentSharedObjects(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsCreateSymbolicLinks", (n) -> { this.setUserRightsCreateSymbolicLinks(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsCreateToken", (n) -> { this.setUserRightsCreateToken(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsDebugPrograms", (n) -> { this.setUserRightsDebugPrograms(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsDelegation", (n) -> { this.setUserRightsDelegation(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsDenyLocalLogOn", (n) -> { this.setUserRightsDenyLocalLogOn(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsGenerateSecurityAudits", (n) -> { this.setUserRightsGenerateSecurityAudits(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsImpersonateClient", (n) -> { this.setUserRightsImpersonateClient(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsIncreaseSchedulingPriority", (n) -> { this.setUserRightsIncreaseSchedulingPriority(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsLoadUnloadDrivers", (n) -> { this.setUserRightsLoadUnloadDrivers(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsLocalLogOn", (n) -> { this.setUserRightsLocalLogOn(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsLockMemory", (n) -> { this.setUserRightsLockMemory(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsManageAuditingAndSecurityLogs", (n) -> { this.setUserRightsManageAuditingAndSecurityLogs(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsManageVolumes", (n) -> { this.setUserRightsManageVolumes(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsModifyFirmwareEnvironment", (n) -> { this.setUserRightsModifyFirmwareEnvironment(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsModifyObjectLabels", (n) -> { this.setUserRightsModifyObjectLabels(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsProfileSingleProcess", (n) -> { this.setUserRightsProfileSingleProcess(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsRemoteDesktopServicesLogOn", (n) -> { this.setUserRightsRemoteDesktopServicesLogOn(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsRemoteShutdown", (n) -> { this.setUserRightsRemoteShutdown(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsRestoreData", (n) -> { this.setUserRightsRestoreData(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userRightsTakeOwnership", (n) -> { this.setUserRightsTakeOwnership(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsDefenderTamperProtection", (n) -> { this.setWindowsDefenderTamperProtection(n.getEnumValue(WindowsDefenderTamperProtectionOptions::forValue)); });
        deserializerMap.put("xboxServicesAccessoryManagementServiceStartupMode", (n) -> { this.setXboxServicesAccessoryManagementServiceStartupMode(n.getEnumValue(ServiceStartType::forValue)); });
        deserializerMap.put("xboxServicesEnableXboxGameSaveTask", (n) -> { this.setXboxServicesEnableXboxGameSaveTask(n.getBooleanValue()); });
        deserializerMap.put("xboxServicesLiveAuthManagerServiceStartupMode", (n) -> { this.setXboxServicesLiveAuthManagerServiceStartupMode(n.getEnumValue(ServiceStartType::forValue)); });
        deserializerMap.put("xboxServicesLiveGameSaveServiceStartupMode", (n) -> { this.setXboxServicesLiveGameSaveServiceStartupMode(n.getEnumValue(ServiceStartType::forValue)); });
        deserializerMap.put("xboxServicesLiveNetworkingServiceStartupMode", (n) -> { this.setXboxServicesLiveNetworkingServiceStartupMode(n.getEnumValue(ServiceStartType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firewallBlockStatefulFTP property value. Blocks stateful FTP connections to the device
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallBlockStatefulFTP() {
        return this.backingStore.get("firewallBlockStatefulFTP");
    }
    /**
     * Gets the firewallCertificateRevocationListCheckMethod property value. Possible values for firewallCertificateRevocationListCheckMethod
     * @return a FirewallCertificateRevocationListCheckMethodType
     */
    @jakarta.annotation.Nullable
    public FirewallCertificateRevocationListCheckMethodType getFirewallCertificateRevocationListCheckMethod() {
        return this.backingStore.get("firewallCertificateRevocationListCheckMethod");
    }
    /**
     * Gets the firewallIdleTimeoutForSecurityAssociationInSeconds property value. Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFirewallIdleTimeoutForSecurityAssociationInSeconds() {
        return this.backingStore.get("firewallIdleTimeoutForSecurityAssociationInSeconds");
    }
    /**
     * Gets the firewallIPSecExemptionsAllowDHCP property value. Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowDHCP() {
        return this.backingStore.get("firewallIPSecExemptionsAllowDHCP");
    }
    /**
     * Gets the firewallIPSecExemptionsAllowICMP property value. Configures IPSec exemptions to allow ICMP
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowICMP() {
        return this.backingStore.get("firewallIPSecExemptionsAllowICMP");
    }
    /**
     * Gets the firewallIPSecExemptionsAllowNeighborDiscovery property value. Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowNeighborDiscovery() {
        return this.backingStore.get("firewallIPSecExemptionsAllowNeighborDiscovery");
    }
    /**
     * Gets the firewallIPSecExemptionsAllowRouterDiscovery property value. Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowRouterDiscovery() {
        return this.backingStore.get("firewallIPSecExemptionsAllowRouterDiscovery");
    }
    /**
     * Gets the firewallIPSecExemptionsNone property value. Configures IPSec exemptions to no exemptions
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsNone() {
        return this.backingStore.get("firewallIPSecExemptionsNone");
    }
    /**
     * Gets the firewallMergeKeyingModuleSettings property value. If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallMergeKeyingModuleSettings() {
        return this.backingStore.get("firewallMergeKeyingModuleSettings");
    }
    /**
     * Gets the firewallPacketQueueingMethod property value. Possible values for firewallPacketQueueingMethod
     * @return a FirewallPacketQueueingMethodType
     */
    @jakarta.annotation.Nullable
    public FirewallPacketQueueingMethodType getFirewallPacketQueueingMethod() {
        return this.backingStore.get("firewallPacketQueueingMethod");
    }
    /**
     * Gets the firewallPreSharedKeyEncodingMethod property value. Possible values for firewallPreSharedKeyEncodingMethod
     * @return a FirewallPreSharedKeyEncodingMethodType
     */
    @jakarta.annotation.Nullable
    public FirewallPreSharedKeyEncodingMethodType getFirewallPreSharedKeyEncodingMethod() {
        return this.backingStore.get("firewallPreSharedKeyEncodingMethod");
    }
    /**
     * Gets the firewallProfileDomain property value. Configures the firewall profile settings for domain networks
     * @return a WindowsFirewallNetworkProfile
     */
    @jakarta.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfileDomain() {
        return this.backingStore.get("firewallProfileDomain");
    }
    /**
     * Gets the firewallProfilePrivate property value. Configures the firewall profile settings for private networks
     * @return a WindowsFirewallNetworkProfile
     */
    @jakarta.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfilePrivate() {
        return this.backingStore.get("firewallProfilePrivate");
    }
    /**
     * Gets the firewallProfilePublic property value. Configures the firewall profile settings for public networks
     * @return a WindowsFirewallNetworkProfile
     */
    @jakarta.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfilePublic() {
        return this.backingStore.get("firewallProfilePublic");
    }
    /**
     * Gets the firewallRules property value. Configures the firewall rule settings. This collection can contain a maximum of 150 elements.
     * @return a java.util.List<WindowsFirewallRule>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsFirewallRule> getFirewallRules() {
        return this.backingStore.get("firewallRules");
    }
    /**
     * Gets the lanManagerAuthenticationLevel property value. Possible values for LanManagerAuthenticationLevel
     * @return a LanManagerAuthenticationLevel
     */
    @jakarta.annotation.Nullable
    public LanManagerAuthenticationLevel getLanManagerAuthenticationLevel() {
        return this.backingStore.get("lanManagerAuthenticationLevel");
    }
    /**
     * Gets the lanManagerWorkstationDisableInsecureGuestLogons property value. If enabled,the SMB client will allow insecure guest logons. If not configured, the SMB client will reject insecure guest logons.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLanManagerWorkstationDisableInsecureGuestLogons() {
        return this.backingStore.get("lanManagerWorkstationDisableInsecureGuestLogons");
    }
    /**
     * Gets the localSecurityOptionsAdministratorAccountName property value. Define a different account name to be associated with the security identifier (SID) for the account 'Administrator'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocalSecurityOptionsAdministratorAccountName() {
        return this.backingStore.get("localSecurityOptionsAdministratorAccountName");
    }
    /**
     * Gets the localSecurityOptionsAdministratorElevationPromptBehavior property value. Possible values for LocalSecurityOptionsAdministratorElevationPromptBehavior
     * @return a LocalSecurityOptionsAdministratorElevationPromptBehaviorType
     */
    @jakarta.annotation.Nullable
    public LocalSecurityOptionsAdministratorElevationPromptBehaviorType getLocalSecurityOptionsAdministratorElevationPromptBehavior() {
        return this.backingStore.get("localSecurityOptionsAdministratorElevationPromptBehavior");
    }
    /**
     * Gets the localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares property value. This security setting determines whether to allows anonymous users to perform certain activities, such as enumerating the names of domain accounts and network shares.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares() {
        return this.backingStore.get("localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares");
    }
    /**
     * Gets the localSecurityOptionsAllowPKU2UAuthenticationRequests property value. Block PKU2U authentication requests to this device to use online identities.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowPKU2UAuthenticationRequests() {
        return this.backingStore.get("localSecurityOptionsAllowPKU2UAuthenticationRequests");
    }
    /**
     * Gets the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager property value. Edit the default Security Descriptor Definition Language string to allow or deny users and groups to make remote calls to the SAM.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager() {
        return this.backingStore.get("localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager");
    }
    /**
     * Gets the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool property value. UI helper boolean for LocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager entity
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool() {
        return this.backingStore.get("localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool");
    }
    /**
     * Gets the localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn property value. This security setting determines whether a computer can be shut down without having to log on to Windows.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn() {
        return this.backingStore.get("localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn");
    }
    /**
     * Gets the localSecurityOptionsAllowUIAccessApplicationElevation property value. Allow UIAccess apps to prompt for elevation without using the secure desktop.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowUIAccessApplicationElevation() {
        return this.backingStore.get("localSecurityOptionsAllowUIAccessApplicationElevation");
    }
    /**
     * Gets the localSecurityOptionsAllowUIAccessApplicationsForSecureLocations property value. Allow UIAccess apps to prompt for elevation without using the secure desktop.Default is enabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowUIAccessApplicationsForSecureLocations() {
        return this.backingStore.get("localSecurityOptionsAllowUIAccessApplicationsForSecureLocations");
    }
    /**
     * Gets the localSecurityOptionsAllowUndockWithoutHavingToLogon property value. Prevent a portable computer from being undocked without having to log in.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowUndockWithoutHavingToLogon() {
        return this.backingStore.get("localSecurityOptionsAllowUndockWithoutHavingToLogon");
    }
    /**
     * Gets the localSecurityOptionsBlockMicrosoftAccounts property value. Prevent users from adding new Microsoft accounts to this computer.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsBlockMicrosoftAccounts() {
        return this.backingStore.get("localSecurityOptionsBlockMicrosoftAccounts");
    }
    /**
     * Gets the localSecurityOptionsBlockRemoteLogonWithBlankPassword property value. Enable Local accounts that are not password protected to log on from locations other than the physical device.Default is enabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsBlockRemoteLogonWithBlankPassword() {
        return this.backingStore.get("localSecurityOptionsBlockRemoteLogonWithBlankPassword");
    }
    /**
     * Gets the localSecurityOptionsBlockRemoteOpticalDriveAccess property value. Enabling this settings allows only interactively logged on user to access CD-ROM media.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsBlockRemoteOpticalDriveAccess() {
        return this.backingStore.get("localSecurityOptionsBlockRemoteOpticalDriveAccess");
    }
    /**
     * Gets the localSecurityOptionsBlockUsersInstallingPrinterDrivers property value. Restrict installing printer drivers as part of connecting to a shared printer to admins only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsBlockUsersInstallingPrinterDrivers() {
        return this.backingStore.get("localSecurityOptionsBlockUsersInstallingPrinterDrivers");
    }
    /**
     * Gets the localSecurityOptionsClearVirtualMemoryPageFile property value. This security setting determines whether the virtual memory pagefile is cleared when the system is shut down.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsClearVirtualMemoryPageFile() {
        return this.backingStore.get("localSecurityOptionsClearVirtualMemoryPageFile");
    }
    /**
     * Gets the localSecurityOptionsClientDigitallySignCommunicationsAlways property value. This security setting determines whether packet signing is required by the SMB client component.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsClientDigitallySignCommunicationsAlways() {
        return this.backingStore.get("localSecurityOptionsClientDigitallySignCommunicationsAlways");
    }
    /**
     * Gets the localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers property value. If this security setting is enabled, the Server Message Block (SMB) redirector is allowed to send plaintext passwords to non-Microsoft SMB servers that do not support password encryption during authentication.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers() {
        return this.backingStore.get("localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers");
    }
    /**
     * Gets the localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation property value. App installations requiring elevated privileges will prompt for admin credentials.Default is enabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsDetectApplicationInstallationsAndPromptForElevation() {
        return this.backingStore.get("localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation");
    }
    /**
     * Gets the localSecurityOptionsDisableAdministratorAccount property value. Determines whether the Local Administrator account is enabled or disabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableAdministratorAccount() {
        return this.backingStore.get("localSecurityOptionsDisableAdministratorAccount");
    }
    /**
     * Gets the localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees property value. This security setting determines whether the SMB client attempts to negotiate SMB packet signing.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees() {
        return this.backingStore.get("localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees");
    }
    /**
     * Gets the localSecurityOptionsDisableGuestAccount property value. Determines if the Guest account is enabled or disabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableGuestAccount() {
        return this.backingStore.get("localSecurityOptionsDisableGuestAccount");
    }
    /**
     * Gets the localSecurityOptionsDisableServerDigitallySignCommunicationsAlways property value. This security setting determines whether packet signing is required by the SMB server component.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableServerDigitallySignCommunicationsAlways() {
        return this.backingStore.get("localSecurityOptionsDisableServerDigitallySignCommunicationsAlways");
    }
    /**
     * Gets the localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees property value. This security setting determines whether the SMB server will negotiate SMB packet signing with clients that request it.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees() {
        return this.backingStore.get("localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees");
    }
    /**
     * Gets the localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts property value. This security setting determines what additional permissions will be granted for anonymous connections to the computer.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts() {
        return this.backingStore.get("localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts");
    }
    /**
     * Gets the localSecurityOptionsDoNotRequireCtrlAltDel property value. Require CTRL+ALT+DEL to be pressed before a user can log on.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsDoNotRequireCtrlAltDel() {
        return this.backingStore.get("localSecurityOptionsDoNotRequireCtrlAltDel");
    }
    /**
     * Gets the localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange property value. This security setting determines if, at the next password change, the LAN Manager (LM) hash value for the new password is stored. Its not stored by default.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange() {
        return this.backingStore.get("localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange");
    }
    /**
     * Gets the localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser property value. Possible values for LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser
     * @return a LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType
     */
    @jakarta.annotation.Nullable
    public LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType getLocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser() {
        return this.backingStore.get("localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser");
    }
    /**
     * Gets the localSecurityOptionsGuestAccountName property value. Define a different account name to be associated with the security identifier (SID) for the account 'Guest'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocalSecurityOptionsGuestAccountName() {
        return this.backingStore.get("localSecurityOptionsGuestAccountName");
    }
    /**
     * Gets the localSecurityOptionsHideLastSignedInUser property value. Do not display the username of the last person who signed in on this device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsHideLastSignedInUser() {
        return this.backingStore.get("localSecurityOptionsHideLastSignedInUser");
    }
    /**
     * Gets the localSecurityOptionsHideUsernameAtSignIn property value. Do not display the username of the person signing in to this device after credentials are entered and before the devices desktop is shown.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsHideUsernameAtSignIn() {
        return this.backingStore.get("localSecurityOptionsHideUsernameAtSignIn");
    }
    /**
     * Gets the localSecurityOptionsInformationDisplayedOnLockScreen property value. Possible values for LocalSecurityOptionsInformationDisplayedOnLockScreen
     * @return a LocalSecurityOptionsInformationDisplayedOnLockScreenType
     */
    @jakarta.annotation.Nullable
    public LocalSecurityOptionsInformationDisplayedOnLockScreenType getLocalSecurityOptionsInformationDisplayedOnLockScreen() {
        return this.backingStore.get("localSecurityOptionsInformationDisplayedOnLockScreen");
    }
    /**
     * Gets the localSecurityOptionsInformationShownOnLockScreen property value. Possible values for LocalSecurityOptionsInformationShownOnLockScreenType
     * @return a LocalSecurityOptionsInformationShownOnLockScreenType
     */
    @jakarta.annotation.Nullable
    public LocalSecurityOptionsInformationShownOnLockScreenType getLocalSecurityOptionsInformationShownOnLockScreen() {
        return this.backingStore.get("localSecurityOptionsInformationShownOnLockScreen");
    }
    /**
     * Gets the localSecurityOptionsLogOnMessageText property value. Set message text for users attempting to log in.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocalSecurityOptionsLogOnMessageText() {
        return this.backingStore.get("localSecurityOptionsLogOnMessageText");
    }
    /**
     * Gets the localSecurityOptionsLogOnMessageTitle property value. Set message title for users attempting to log in.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLocalSecurityOptionsLogOnMessageTitle() {
        return this.backingStore.get("localSecurityOptionsLogOnMessageTitle");
    }
    /**
     * Gets the localSecurityOptionsMachineInactivityLimit property value. Define maximum minutes of inactivity on the interactive desktops login screen until the screen saver runs. Valid values 0 to 9999
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLocalSecurityOptionsMachineInactivityLimit() {
        return this.backingStore.get("localSecurityOptionsMachineInactivityLimit");
    }
    /**
     * Gets the localSecurityOptionsMachineInactivityLimitInMinutes property value. Define maximum minutes of inactivity on the interactive desktops login screen until the screen saver runs. Valid values 0 to 9999
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLocalSecurityOptionsMachineInactivityLimitInMinutes() {
        return this.backingStore.get("localSecurityOptionsMachineInactivityLimitInMinutes");
    }
    /**
     * Gets the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients property value. Possible values for LocalSecurityOptionsMinimumSessionSecurity
     * @return a LocalSecurityOptionsMinimumSessionSecurity
     */
    @jakarta.annotation.Nullable
    public LocalSecurityOptionsMinimumSessionSecurity getLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients() {
        return this.backingStore.get("localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients");
    }
    /**
     * Gets the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers property value. Possible values for LocalSecurityOptionsMinimumSessionSecurity
     * @return a LocalSecurityOptionsMinimumSessionSecurity
     */
    @jakarta.annotation.Nullable
    public LocalSecurityOptionsMinimumSessionSecurity getLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers() {
        return this.backingStore.get("localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers");
    }
    /**
     * Gets the localSecurityOptionsOnlyElevateSignedExecutables property value. Enforce PKI certification path validation for a given executable file before it is permitted to run.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsOnlyElevateSignedExecutables() {
        return this.backingStore.get("localSecurityOptionsOnlyElevateSignedExecutables");
    }
    /**
     * Gets the localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares property value. By default, this security setting restricts anonymous access to shares and pipes to the settings for named pipes that can be accessed anonymously and Shares that can be accessed anonymously
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares() {
        return this.backingStore.get("localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares");
    }
    /**
     * Gets the localSecurityOptionsSmartCardRemovalBehavior property value. Possible values for LocalSecurityOptionsSmartCardRemovalBehaviorType
     * @return a LocalSecurityOptionsSmartCardRemovalBehaviorType
     */
    @jakarta.annotation.Nullable
    public LocalSecurityOptionsSmartCardRemovalBehaviorType getLocalSecurityOptionsSmartCardRemovalBehavior() {
        return this.backingStore.get("localSecurityOptionsSmartCardRemovalBehavior");
    }
    /**
     * Gets the localSecurityOptionsStandardUserElevationPromptBehavior property value. Possible values for LocalSecurityOptionsStandardUserElevationPromptBehavior
     * @return a LocalSecurityOptionsStandardUserElevationPromptBehaviorType
     */
    @jakarta.annotation.Nullable
    public LocalSecurityOptionsStandardUserElevationPromptBehaviorType getLocalSecurityOptionsStandardUserElevationPromptBehavior() {
        return this.backingStore.get("localSecurityOptionsStandardUserElevationPromptBehavior");
    }
    /**
     * Gets the localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation property value. Enable all elevation requests to go to the interactive user's desktop rather than the secure desktop. Prompt behavior policy settings for admins and standard users are used.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation() {
        return this.backingStore.get("localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation");
    }
    /**
     * Gets the localSecurityOptionsUseAdminApprovalMode property value. Defines whether the built-in admin account uses Admin Approval Mode or runs all apps with full admin privileges.Default is enabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsUseAdminApprovalMode() {
        return this.backingStore.get("localSecurityOptionsUseAdminApprovalMode");
    }
    /**
     * Gets the localSecurityOptionsUseAdminApprovalModeForAdministrators property value. Define whether Admin Approval Mode and all UAC policy settings are enabled, default is enabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsUseAdminApprovalModeForAdministrators() {
        return this.backingStore.get("localSecurityOptionsUseAdminApprovalModeForAdministrators");
    }
    /**
     * Gets the localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations property value. Virtualize file and registry write failures to per user locations
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations() {
        return this.backingStore.get("localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations");
    }
    /**
     * Gets the smartScreenBlockOverrideForFiles property value. Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSmartScreenBlockOverrideForFiles() {
        return this.backingStore.get("smartScreenBlockOverrideForFiles");
    }
    /**
     * Gets the smartScreenEnableInShell property value. Allows IT Admins to configure SmartScreen for Windows.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSmartScreenEnableInShell() {
        return this.backingStore.get("smartScreenEnableInShell");
    }
    /**
     * Gets the userRightsAccessCredentialManagerAsTrustedCaller property value. This user right is used by Credential Manager during Backup/Restore. Users' saved credentials might be compromised if this privilege is given to other entities. Only states NotConfigured and Allowed are supported
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsAccessCredentialManagerAsTrustedCaller() {
        return this.backingStore.get("userRightsAccessCredentialManagerAsTrustedCaller");
    }
    /**
     * Gets the userRightsActAsPartOfTheOperatingSystem property value. This user right allows a process to impersonate any user without authentication. The process can therefore gain access to the same local resources as that user. Only states NotConfigured and Allowed are supported
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsActAsPartOfTheOperatingSystem() {
        return this.backingStore.get("userRightsActAsPartOfTheOperatingSystem");
    }
    /**
     * Gets the userRightsAllowAccessFromNetwork property value. This user right determines which users and groups are allowed to connect to the computer over the network. State Allowed is supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsAllowAccessFromNetwork() {
        return this.backingStore.get("userRightsAllowAccessFromNetwork");
    }
    /**
     * Gets the userRightsBackupData property value. This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when backing up files and directories. Only states NotConfigured and Allowed are supported
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsBackupData() {
        return this.backingStore.get("userRightsBackupData");
    }
    /**
     * Gets the userRightsBlockAccessFromNetwork property value. This user right determines which users and groups are block from connecting to the computer over the network. State Block is supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsBlockAccessFromNetwork() {
        return this.backingStore.get("userRightsBlockAccessFromNetwork");
    }
    /**
     * Gets the userRightsChangeSystemTime property value. This user right determines which users and groups can change the time and date on the internal clock of the computer. Only states NotConfigured and Allowed are supported
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsChangeSystemTime() {
        return this.backingStore.get("userRightsChangeSystemTime");
    }
    /**
     * Gets the userRightsCreateGlobalObjects property value. This security setting determines whether users can create global objects that are available to all sessions. Users who can create global objects could affect processes that run under other users' sessions, which could lead to application failure or data corruption. Only states NotConfigured and Allowed are supported
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreateGlobalObjects() {
        return this.backingStore.get("userRightsCreateGlobalObjects");
    }
    /**
     * Gets the userRightsCreatePageFile property value. This user right determines which users and groups can call an internal API to create and change the size of a page file. Only states NotConfigured and Allowed are supported
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreatePageFile() {
        return this.backingStore.get("userRightsCreatePageFile");
    }
    /**
     * Gets the userRightsCreatePermanentSharedObjects property value. This user right determines which accounts can be used by processes to create a directory object using the object manager. Only states NotConfigured and Allowed are supported
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreatePermanentSharedObjects() {
        return this.backingStore.get("userRightsCreatePermanentSharedObjects");
    }
    /**
     * Gets the userRightsCreateSymbolicLinks property value. This user right determines if the user can create a symbolic link from the computer to which they are logged on. Only states NotConfigured and Allowed are supported
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreateSymbolicLinks() {
        return this.backingStore.get("userRightsCreateSymbolicLinks");
    }
    /**
     * Gets the userRightsCreateToken property value. This user right determines which users/groups can be used by processes to create a token that can then be used to get access to any local resources when the process uses an internal API to create an access token. Only states NotConfigured and Allowed are supported
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreateToken() {
        return this.backingStore.get("userRightsCreateToken");
    }
    /**
     * Gets the userRightsDebugPrograms property value. This user right determines which users can attach a debugger to any process or to the kernel. Only states NotConfigured and Allowed are supported
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsDebugPrograms() {
        return this.backingStore.get("userRightsDebugPrograms");
    }
    /**
     * Gets the userRightsDelegation property value. This user right determines which users can set the Trusted for Delegation setting on a user or computer object. Only states NotConfigured and Allowed are supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsDelegation() {
        return this.backingStore.get("userRightsDelegation");
    }
    /**
     * Gets the userRightsDenyLocalLogOn property value. This user right determines which users cannot log on to the computer. States NotConfigured, Blocked are supported
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsDenyLocalLogOn() {
        return this.backingStore.get("userRightsDenyLocalLogOn");
    }
    /**
     * Gets the userRightsGenerateSecurityAudits property value. This user right determines which accounts can be used by a process to add entries to the security log. The security log is used to trace unauthorized system access.  Only states NotConfigured and Allowed are supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsGenerateSecurityAudits() {
        return this.backingStore.get("userRightsGenerateSecurityAudits");
    }
    /**
     * Gets the userRightsImpersonateClient property value. Assigning this user right to a user allows programs running on behalf of that user to impersonate a client. Requiring this user right for this kind of impersonation prevents an unauthorized user from convincing a client to connect to a service that they have created and then impersonating that client, which can elevate the unauthorized user's permissions to administrative or system levels. Only states NotConfigured and Allowed are supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsImpersonateClient() {
        return this.backingStore.get("userRightsImpersonateClient");
    }
    /**
     * Gets the userRightsIncreaseSchedulingPriority property value. This user right determines which accounts can use a process with Write Property access to another process to increase the execution priority assigned to the other process. Only states NotConfigured and Allowed are supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsIncreaseSchedulingPriority() {
        return this.backingStore.get("userRightsIncreaseSchedulingPriority");
    }
    /**
     * Gets the userRightsLoadUnloadDrivers property value. This user right determines which users can dynamically load and unload device drivers or other code in to kernel mode. Only states NotConfigured and Allowed are supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsLoadUnloadDrivers() {
        return this.backingStore.get("userRightsLoadUnloadDrivers");
    }
    /**
     * Gets the userRightsLocalLogOn property value. This user right determines which users can log on to the computer. States NotConfigured, Allowed are supported
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsLocalLogOn() {
        return this.backingStore.get("userRightsLocalLogOn");
    }
    /**
     * Gets the userRightsLockMemory property value. This user right determines which accounts can use a process to keep data in physical memory, which prevents the system from paging the data to virtual memory on disk. Only states NotConfigured and Allowed are supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsLockMemory() {
        return this.backingStore.get("userRightsLockMemory");
    }
    /**
     * Gets the userRightsManageAuditingAndSecurityLogs property value. This user right determines which users can specify object access auditing options for individual resources, such as files, Active Directory objects, and registry keys. Only states NotConfigured and Allowed are supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsManageAuditingAndSecurityLogs() {
        return this.backingStore.get("userRightsManageAuditingAndSecurityLogs");
    }
    /**
     * Gets the userRightsManageVolumes property value. This user right determines which users and groups can run maintenance tasks on a volume, such as remote defragmentation. Only states NotConfigured and Allowed are supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsManageVolumes() {
        return this.backingStore.get("userRightsManageVolumes");
    }
    /**
     * Gets the userRightsModifyFirmwareEnvironment property value. This user right determines who can modify firmware environment values. Only states NotConfigured and Allowed are supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsModifyFirmwareEnvironment() {
        return this.backingStore.get("userRightsModifyFirmwareEnvironment");
    }
    /**
     * Gets the userRightsModifyObjectLabels property value. This user right determines which user accounts can modify the integrity label of objects, such as files, registry keys, or processes owned by other users. Only states NotConfigured and Allowed are supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsModifyObjectLabels() {
        return this.backingStore.get("userRightsModifyObjectLabels");
    }
    /**
     * Gets the userRightsProfileSingleProcess property value. This user right determines which users can use performance monitoring tools to monitor the performance of system processes. Only states NotConfigured and Allowed are supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsProfileSingleProcess() {
        return this.backingStore.get("userRightsProfileSingleProcess");
    }
    /**
     * Gets the userRightsRemoteDesktopServicesLogOn property value. This user right determines which users and groups are prohibited from logging on as a Remote Desktop Services client. Only states NotConfigured and Blocked are supported
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsRemoteDesktopServicesLogOn() {
        return this.backingStore.get("userRightsRemoteDesktopServicesLogOn");
    }
    /**
     * Gets the userRightsRemoteShutdown property value. This user right determines which users are allowed to shut down a computer from a remote location on the network. Misuse of this user right can result in a denial of service. Only states NotConfigured and Allowed are supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsRemoteShutdown() {
        return this.backingStore.get("userRightsRemoteShutdown");
    }
    /**
     * Gets the userRightsRestoreData property value. This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when restoring backed up files and directories, and determines which users can set any valid security principal as the owner of an object. Only states NotConfigured and Allowed are supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsRestoreData() {
        return this.backingStore.get("userRightsRestoreData");
    }
    /**
     * Gets the userRightsTakeOwnership property value. This user right determines which users can take ownership of any securable object in the system, including Active Directory objects, files and folders, printers, registry keys, processes, and threads. Only states NotConfigured and Allowed are supported.
     * @return a DeviceManagementUserRightsSetting
     */
    @jakarta.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsTakeOwnership() {
        return this.backingStore.get("userRightsTakeOwnership");
    }
    /**
     * Gets the windowsDefenderTamperProtection property value. Defender TamperProtection setting options
     * @return a WindowsDefenderTamperProtectionOptions
     */
    @jakarta.annotation.Nullable
    public WindowsDefenderTamperProtectionOptions getWindowsDefenderTamperProtection() {
        return this.backingStore.get("windowsDefenderTamperProtection");
    }
    /**
     * Gets the xboxServicesAccessoryManagementServiceStartupMode property value. Possible values of xbox service start type
     * @return a ServiceStartType
     */
    @jakarta.annotation.Nullable
    public ServiceStartType getXboxServicesAccessoryManagementServiceStartupMode() {
        return this.backingStore.get("xboxServicesAccessoryManagementServiceStartupMode");
    }
    /**
     * Gets the xboxServicesEnableXboxGameSaveTask property value. This setting determines whether xbox game save is enabled (1) or disabled (0).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getXboxServicesEnableXboxGameSaveTask() {
        return this.backingStore.get("xboxServicesEnableXboxGameSaveTask");
    }
    /**
     * Gets the xboxServicesLiveAuthManagerServiceStartupMode property value. Possible values of xbox service start type
     * @return a ServiceStartType
     */
    @jakarta.annotation.Nullable
    public ServiceStartType getXboxServicesLiveAuthManagerServiceStartupMode() {
        return this.backingStore.get("xboxServicesLiveAuthManagerServiceStartupMode");
    }
    /**
     * Gets the xboxServicesLiveGameSaveServiceStartupMode property value. Possible values of xbox service start type
     * @return a ServiceStartType
     */
    @jakarta.annotation.Nullable
    public ServiceStartType getXboxServicesLiveGameSaveServiceStartupMode() {
        return this.backingStore.get("xboxServicesLiveGameSaveServiceStartupMode");
    }
    /**
     * Gets the xboxServicesLiveNetworkingServiceStartupMode property value. Possible values of xbox service start type
     * @return a ServiceStartType
     */
    @jakarta.annotation.Nullable
    public ServiceStartType getXboxServicesLiveNetworkingServiceStartupMode() {
        return this.backingStore.get("xboxServicesLiveNetworkingServiceStartupMode");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("applicationGuardAllowCameraMicrophoneRedirection", this.getApplicationGuardAllowCameraMicrophoneRedirection());
        writer.writeBooleanValue("applicationGuardAllowFileSaveOnHost", this.getApplicationGuardAllowFileSaveOnHost());
        writer.writeBooleanValue("applicationGuardAllowPersistence", this.getApplicationGuardAllowPersistence());
        writer.writeBooleanValue("applicationGuardAllowPrintToLocalPrinters", this.getApplicationGuardAllowPrintToLocalPrinters());
        writer.writeBooleanValue("applicationGuardAllowPrintToNetworkPrinters", this.getApplicationGuardAllowPrintToNetworkPrinters());
        writer.writeBooleanValue("applicationGuardAllowPrintToPDF", this.getApplicationGuardAllowPrintToPDF());
        writer.writeBooleanValue("applicationGuardAllowPrintToXPS", this.getApplicationGuardAllowPrintToXPS());
        writer.writeBooleanValue("applicationGuardAllowVirtualGPU", this.getApplicationGuardAllowVirtualGPU());
        writer.writeEnumValue("applicationGuardBlockClipboardSharing", this.getApplicationGuardBlockClipboardSharing());
        writer.writeEnumValue("applicationGuardBlockFileTransfer", this.getApplicationGuardBlockFileTransfer());
        writer.writeBooleanValue("applicationGuardBlockNonEnterpriseContent", this.getApplicationGuardBlockNonEnterpriseContent());
        writer.writeCollectionOfPrimitiveValues("applicationGuardCertificateThumbprints", this.getApplicationGuardCertificateThumbprints());
        writer.writeBooleanValue("applicationGuardEnabled", this.getApplicationGuardEnabled());
        writer.writeEnumValue("applicationGuardEnabledOptions", this.getApplicationGuardEnabledOptions());
        writer.writeBooleanValue("applicationGuardForceAuditing", this.getApplicationGuardForceAuditing());
        writer.writeEnumValue("appLockerApplicationControl", this.getAppLockerApplicationControl());
        writer.writeBooleanValue("bitLockerAllowStandardUserEncryption", this.getBitLockerAllowStandardUserEncryption());
        writer.writeBooleanValue("bitLockerDisableWarningForOtherDiskEncryption", this.getBitLockerDisableWarningForOtherDiskEncryption());
        writer.writeBooleanValue("bitLockerEnableStorageCardEncryptionOnMobile", this.getBitLockerEnableStorageCardEncryptionOnMobile());
        writer.writeBooleanValue("bitLockerEncryptDevice", this.getBitLockerEncryptDevice());
        writer.writeObjectValue("bitLockerFixedDrivePolicy", this.getBitLockerFixedDrivePolicy());
        writer.writeEnumValue("bitLockerRecoveryPasswordRotation", this.getBitLockerRecoveryPasswordRotation());
        writer.writeObjectValue("bitLockerRemovableDrivePolicy", this.getBitLockerRemovableDrivePolicy());
        writer.writeObjectValue("bitLockerSystemDrivePolicy", this.getBitLockerSystemDrivePolicy());
        writer.writeCollectionOfPrimitiveValues("defenderAdditionalGuardedFolders", this.getDefenderAdditionalGuardedFolders());
        writer.writeEnumValue("defenderAdobeReaderLaunchChildProcess", this.getDefenderAdobeReaderLaunchChildProcess());
        writer.writeEnumValue("defenderAdvancedRansomewareProtectionType", this.getDefenderAdvancedRansomewareProtectionType());
        writer.writeBooleanValue("defenderAllowBehaviorMonitoring", this.getDefenderAllowBehaviorMonitoring());
        writer.writeBooleanValue("defenderAllowCloudProtection", this.getDefenderAllowCloudProtection());
        writer.writeBooleanValue("defenderAllowEndUserAccess", this.getDefenderAllowEndUserAccess());
        writer.writeBooleanValue("defenderAllowIntrusionPreventionSystem", this.getDefenderAllowIntrusionPreventionSystem());
        writer.writeBooleanValue("defenderAllowOnAccessProtection", this.getDefenderAllowOnAccessProtection());
        writer.writeBooleanValue("defenderAllowRealTimeMonitoring", this.getDefenderAllowRealTimeMonitoring());
        writer.writeBooleanValue("defenderAllowScanArchiveFiles", this.getDefenderAllowScanArchiveFiles());
        writer.writeBooleanValue("defenderAllowScanDownloads", this.getDefenderAllowScanDownloads());
        writer.writeBooleanValue("defenderAllowScanNetworkFiles", this.getDefenderAllowScanNetworkFiles());
        writer.writeBooleanValue("defenderAllowScanRemovableDrivesDuringFullScan", this.getDefenderAllowScanRemovableDrivesDuringFullScan());
        writer.writeBooleanValue("defenderAllowScanScriptsLoadedInInternetExplorer", this.getDefenderAllowScanScriptsLoadedInInternetExplorer());
        writer.writeCollectionOfPrimitiveValues("defenderAttackSurfaceReductionExcludedPaths", this.getDefenderAttackSurfaceReductionExcludedPaths());
        writer.writeBooleanValue("defenderBlockEndUserAccess", this.getDefenderBlockEndUserAccess());
        writer.writeEnumValue("defenderBlockPersistenceThroughWmiType", this.getDefenderBlockPersistenceThroughWmiType());
        writer.writeBooleanValue("defenderCheckForSignaturesBeforeRunningScan", this.getDefenderCheckForSignaturesBeforeRunningScan());
        writer.writeEnumValue("defenderCloudBlockLevel", this.getDefenderCloudBlockLevel());
        writer.writeIntegerValue("defenderCloudExtendedTimeoutInSeconds", this.getDefenderCloudExtendedTimeoutInSeconds());
        writer.writeIntegerValue("defenderDaysBeforeDeletingQuarantinedMalware", this.getDefenderDaysBeforeDeletingQuarantinedMalware());
        writer.writeObjectValue("defenderDetectedMalwareActions", this.getDefenderDetectedMalwareActions());
        writer.writeBooleanValue("defenderDisableBehaviorMonitoring", this.getDefenderDisableBehaviorMonitoring());
        writer.writeBooleanValue("defenderDisableCatchupFullScan", this.getDefenderDisableCatchupFullScan());
        writer.writeBooleanValue("defenderDisableCatchupQuickScan", this.getDefenderDisableCatchupQuickScan());
        writer.writeBooleanValue("defenderDisableCloudProtection", this.getDefenderDisableCloudProtection());
        writer.writeBooleanValue("defenderDisableIntrusionPreventionSystem", this.getDefenderDisableIntrusionPreventionSystem());
        writer.writeBooleanValue("defenderDisableOnAccessProtection", this.getDefenderDisableOnAccessProtection());
        writer.writeBooleanValue("defenderDisableRealTimeMonitoring", this.getDefenderDisableRealTimeMonitoring());
        writer.writeBooleanValue("defenderDisableScanArchiveFiles", this.getDefenderDisableScanArchiveFiles());
        writer.writeBooleanValue("defenderDisableScanDownloads", this.getDefenderDisableScanDownloads());
        writer.writeBooleanValue("defenderDisableScanNetworkFiles", this.getDefenderDisableScanNetworkFiles());
        writer.writeBooleanValue("defenderDisableScanRemovableDrivesDuringFullScan", this.getDefenderDisableScanRemovableDrivesDuringFullScan());
        writer.writeBooleanValue("defenderDisableScanScriptsLoadedInInternetExplorer", this.getDefenderDisableScanScriptsLoadedInInternetExplorer());
        writer.writeEnumValue("defenderEmailContentExecution", this.getDefenderEmailContentExecution());
        writer.writeEnumValue("defenderEmailContentExecutionType", this.getDefenderEmailContentExecutionType());
        writer.writeBooleanValue("defenderEnableLowCpuPriority", this.getDefenderEnableLowCpuPriority());
        writer.writeBooleanValue("defenderEnableScanIncomingMail", this.getDefenderEnableScanIncomingMail());
        writer.writeBooleanValue("defenderEnableScanMappedNetworkDrivesDuringFullScan", this.getDefenderEnableScanMappedNetworkDrivesDuringFullScan());
        writer.writeByteArrayValue("defenderExploitProtectionXml", this.getDefenderExploitProtectionXml());
        writer.writeStringValue("defenderExploitProtectionXmlFileName", this.getDefenderExploitProtectionXmlFileName());
        writer.writeCollectionOfPrimitiveValues("defenderFileExtensionsToExclude", this.getDefenderFileExtensionsToExclude());
        writer.writeCollectionOfPrimitiveValues("defenderFilesAndFoldersToExclude", this.getDefenderFilesAndFoldersToExclude());
        writer.writeCollectionOfPrimitiveValues("defenderGuardedFoldersAllowedAppPaths", this.getDefenderGuardedFoldersAllowedAppPaths());
        writer.writeEnumValue("defenderGuardMyFoldersType", this.getDefenderGuardMyFoldersType());
        writer.writeEnumValue("defenderNetworkProtectionType", this.getDefenderNetworkProtectionType());
        writer.writeEnumValue("defenderOfficeAppsExecutableContentCreationOrLaunch", this.getDefenderOfficeAppsExecutableContentCreationOrLaunch());
        writer.writeEnumValue("defenderOfficeAppsExecutableContentCreationOrLaunchType", this.getDefenderOfficeAppsExecutableContentCreationOrLaunchType());
        writer.writeEnumValue("defenderOfficeAppsLaunchChildProcess", this.getDefenderOfficeAppsLaunchChildProcess());
        writer.writeEnumValue("defenderOfficeAppsLaunchChildProcessType", this.getDefenderOfficeAppsLaunchChildProcessType());
        writer.writeEnumValue("defenderOfficeAppsOtherProcessInjection", this.getDefenderOfficeAppsOtherProcessInjection());
        writer.writeEnumValue("defenderOfficeAppsOtherProcessInjectionType", this.getDefenderOfficeAppsOtherProcessInjectionType());
        writer.writeEnumValue("defenderOfficeCommunicationAppsLaunchChildProcess", this.getDefenderOfficeCommunicationAppsLaunchChildProcess());
        writer.writeEnumValue("defenderOfficeMacroCodeAllowWin32Imports", this.getDefenderOfficeMacroCodeAllowWin32Imports());
        writer.writeEnumValue("defenderOfficeMacroCodeAllowWin32ImportsType", this.getDefenderOfficeMacroCodeAllowWin32ImportsType());
        writer.writeEnumValue("defenderPotentiallyUnwantedAppAction", this.getDefenderPotentiallyUnwantedAppAction());
        writer.writeEnumValue("defenderPreventCredentialStealingType", this.getDefenderPreventCredentialStealingType());
        writer.writeEnumValue("defenderProcessCreation", this.getDefenderProcessCreation());
        writer.writeEnumValue("defenderProcessCreationType", this.getDefenderProcessCreationType());
        writer.writeCollectionOfPrimitiveValues("defenderProcessesToExclude", this.getDefenderProcessesToExclude());
        writer.writeEnumValue("defenderScanDirection", this.getDefenderScanDirection());
        writer.writeIntegerValue("defenderScanMaxCpuPercentage", this.getDefenderScanMaxCpuPercentage());
        writer.writeEnumValue("defenderScanType", this.getDefenderScanType());
        writer.writeLocalTimeValue("defenderScheduledQuickScanTime", this.getDefenderScheduledQuickScanTime());
        writer.writeEnumValue("defenderScheduledScanDay", this.getDefenderScheduledScanDay());
        writer.writeLocalTimeValue("defenderScheduledScanTime", this.getDefenderScheduledScanTime());
        writer.writeEnumValue("defenderScriptDownloadedPayloadExecution", this.getDefenderScriptDownloadedPayloadExecution());
        writer.writeEnumValue("defenderScriptDownloadedPayloadExecutionType", this.getDefenderScriptDownloadedPayloadExecutionType());
        writer.writeEnumValue("defenderScriptObfuscatedMacroCode", this.getDefenderScriptObfuscatedMacroCode());
        writer.writeEnumValue("defenderScriptObfuscatedMacroCodeType", this.getDefenderScriptObfuscatedMacroCodeType());
        writer.writeBooleanValue("defenderSecurityCenterBlockExploitProtectionOverride", this.getDefenderSecurityCenterBlockExploitProtectionOverride());
        writer.writeBooleanValue("defenderSecurityCenterDisableAccountUI", this.getDefenderSecurityCenterDisableAccountUI());
        writer.writeBooleanValue("defenderSecurityCenterDisableAppBrowserUI", this.getDefenderSecurityCenterDisableAppBrowserUI());
        writer.writeBooleanValue("defenderSecurityCenterDisableClearTpmUI", this.getDefenderSecurityCenterDisableClearTpmUI());
        writer.writeBooleanValue("defenderSecurityCenterDisableFamilyUI", this.getDefenderSecurityCenterDisableFamilyUI());
        writer.writeBooleanValue("defenderSecurityCenterDisableHardwareUI", this.getDefenderSecurityCenterDisableHardwareUI());
        writer.writeBooleanValue("defenderSecurityCenterDisableHealthUI", this.getDefenderSecurityCenterDisableHealthUI());
        writer.writeBooleanValue("defenderSecurityCenterDisableNetworkUI", this.getDefenderSecurityCenterDisableNetworkUI());
        writer.writeBooleanValue("defenderSecurityCenterDisableNotificationAreaUI", this.getDefenderSecurityCenterDisableNotificationAreaUI());
        writer.writeBooleanValue("defenderSecurityCenterDisableRansomwareUI", this.getDefenderSecurityCenterDisableRansomwareUI());
        writer.writeBooleanValue("defenderSecurityCenterDisableSecureBootUI", this.getDefenderSecurityCenterDisableSecureBootUI());
        writer.writeBooleanValue("defenderSecurityCenterDisableTroubleshootingUI", this.getDefenderSecurityCenterDisableTroubleshootingUI());
        writer.writeBooleanValue("defenderSecurityCenterDisableVirusUI", this.getDefenderSecurityCenterDisableVirusUI());
        writer.writeBooleanValue("defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI", this.getDefenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI());
        writer.writeStringValue("defenderSecurityCenterHelpEmail", this.getDefenderSecurityCenterHelpEmail());
        writer.writeStringValue("defenderSecurityCenterHelpPhone", this.getDefenderSecurityCenterHelpPhone());
        writer.writeStringValue("defenderSecurityCenterHelpURL", this.getDefenderSecurityCenterHelpURL());
        writer.writeEnumValue("defenderSecurityCenterITContactDisplay", this.getDefenderSecurityCenterITContactDisplay());
        writer.writeEnumValue("defenderSecurityCenterNotificationsFromApp", this.getDefenderSecurityCenterNotificationsFromApp());
        writer.writeStringValue("defenderSecurityCenterOrganizationDisplayName", this.getDefenderSecurityCenterOrganizationDisplayName());
        writer.writeIntegerValue("defenderSignatureUpdateIntervalInHours", this.getDefenderSignatureUpdateIntervalInHours());
        writer.writeEnumValue("defenderSubmitSamplesConsentType", this.getDefenderSubmitSamplesConsentType());
        writer.writeEnumValue("defenderUntrustedExecutable", this.getDefenderUntrustedExecutable());
        writer.writeEnumValue("defenderUntrustedExecutableType", this.getDefenderUntrustedExecutableType());
        writer.writeEnumValue("defenderUntrustedUSBProcess", this.getDefenderUntrustedUSBProcess());
        writer.writeEnumValue("defenderUntrustedUSBProcessType", this.getDefenderUntrustedUSBProcessType());
        writer.writeBooleanValue("deviceGuardEnableSecureBootWithDMA", this.getDeviceGuardEnableSecureBootWithDMA());
        writer.writeBooleanValue("deviceGuardEnableVirtualizationBasedSecurity", this.getDeviceGuardEnableVirtualizationBasedSecurity());
        writer.writeEnumValue("deviceGuardLaunchSystemGuard", this.getDeviceGuardLaunchSystemGuard());
        writer.writeEnumValue("deviceGuardLocalSystemAuthorityCredentialGuardSettings", this.getDeviceGuardLocalSystemAuthorityCredentialGuardSettings());
        writer.writeEnumValue("deviceGuardSecureBootWithDMA", this.getDeviceGuardSecureBootWithDMA());
        writer.writeEnumValue("dmaGuardDeviceEnumerationPolicy", this.getDmaGuardDeviceEnumerationPolicy());
        writer.writeBooleanValue("firewallBlockStatefulFTP", this.getFirewallBlockStatefulFTP());
        writer.writeEnumValue("firewallCertificateRevocationListCheckMethod", this.getFirewallCertificateRevocationListCheckMethod());
        writer.writeIntegerValue("firewallIdleTimeoutForSecurityAssociationInSeconds", this.getFirewallIdleTimeoutForSecurityAssociationInSeconds());
        writer.writeBooleanValue("firewallIPSecExemptionsAllowDHCP", this.getFirewallIPSecExemptionsAllowDHCP());
        writer.writeBooleanValue("firewallIPSecExemptionsAllowICMP", this.getFirewallIPSecExemptionsAllowICMP());
        writer.writeBooleanValue("firewallIPSecExemptionsAllowNeighborDiscovery", this.getFirewallIPSecExemptionsAllowNeighborDiscovery());
        writer.writeBooleanValue("firewallIPSecExemptionsAllowRouterDiscovery", this.getFirewallIPSecExemptionsAllowRouterDiscovery());
        writer.writeBooleanValue("firewallIPSecExemptionsNone", this.getFirewallIPSecExemptionsNone());
        writer.writeBooleanValue("firewallMergeKeyingModuleSettings", this.getFirewallMergeKeyingModuleSettings());
        writer.writeEnumValue("firewallPacketQueueingMethod", this.getFirewallPacketQueueingMethod());
        writer.writeEnumValue("firewallPreSharedKeyEncodingMethod", this.getFirewallPreSharedKeyEncodingMethod());
        writer.writeObjectValue("firewallProfileDomain", this.getFirewallProfileDomain());
        writer.writeObjectValue("firewallProfilePrivate", this.getFirewallProfilePrivate());
        writer.writeObjectValue("firewallProfilePublic", this.getFirewallProfilePublic());
        writer.writeCollectionOfObjectValues("firewallRules", this.getFirewallRules());
        writer.writeEnumValue("lanManagerAuthenticationLevel", this.getLanManagerAuthenticationLevel());
        writer.writeBooleanValue("lanManagerWorkstationDisableInsecureGuestLogons", this.getLanManagerWorkstationDisableInsecureGuestLogons());
        writer.writeStringValue("localSecurityOptionsAdministratorAccountName", this.getLocalSecurityOptionsAdministratorAccountName());
        writer.writeEnumValue("localSecurityOptionsAdministratorElevationPromptBehavior", this.getLocalSecurityOptionsAdministratorElevationPromptBehavior());
        writer.writeBooleanValue("localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares", this.getLocalSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares());
        writer.writeBooleanValue("localSecurityOptionsAllowPKU2UAuthenticationRequests", this.getLocalSecurityOptionsAllowPKU2UAuthenticationRequests());
        writer.writeStringValue("localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager", this.getLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager());
        writer.writeBooleanValue("localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool", this.getLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool());
        writer.writeBooleanValue("localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn", this.getLocalSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn());
        writer.writeBooleanValue("localSecurityOptionsAllowUIAccessApplicationElevation", this.getLocalSecurityOptionsAllowUIAccessApplicationElevation());
        writer.writeBooleanValue("localSecurityOptionsAllowUIAccessApplicationsForSecureLocations", this.getLocalSecurityOptionsAllowUIAccessApplicationsForSecureLocations());
        writer.writeBooleanValue("localSecurityOptionsAllowUndockWithoutHavingToLogon", this.getLocalSecurityOptionsAllowUndockWithoutHavingToLogon());
        writer.writeBooleanValue("localSecurityOptionsBlockMicrosoftAccounts", this.getLocalSecurityOptionsBlockMicrosoftAccounts());
        writer.writeBooleanValue("localSecurityOptionsBlockRemoteLogonWithBlankPassword", this.getLocalSecurityOptionsBlockRemoteLogonWithBlankPassword());
        writer.writeBooleanValue("localSecurityOptionsBlockRemoteOpticalDriveAccess", this.getLocalSecurityOptionsBlockRemoteOpticalDriveAccess());
        writer.writeBooleanValue("localSecurityOptionsBlockUsersInstallingPrinterDrivers", this.getLocalSecurityOptionsBlockUsersInstallingPrinterDrivers());
        writer.writeBooleanValue("localSecurityOptionsClearVirtualMemoryPageFile", this.getLocalSecurityOptionsClearVirtualMemoryPageFile());
        writer.writeBooleanValue("localSecurityOptionsClientDigitallySignCommunicationsAlways", this.getLocalSecurityOptionsClientDigitallySignCommunicationsAlways());
        writer.writeBooleanValue("localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers", this.getLocalSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers());
        writer.writeBooleanValue("localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation", this.getLocalSecurityOptionsDetectApplicationInstallationsAndPromptForElevation());
        writer.writeBooleanValue("localSecurityOptionsDisableAdministratorAccount", this.getLocalSecurityOptionsDisableAdministratorAccount());
        writer.writeBooleanValue("localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees", this.getLocalSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees());
        writer.writeBooleanValue("localSecurityOptionsDisableGuestAccount", this.getLocalSecurityOptionsDisableGuestAccount());
        writer.writeBooleanValue("localSecurityOptionsDisableServerDigitallySignCommunicationsAlways", this.getLocalSecurityOptionsDisableServerDigitallySignCommunicationsAlways());
        writer.writeBooleanValue("localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees", this.getLocalSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees());
        writer.writeBooleanValue("localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts", this.getLocalSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts());
        writer.writeBooleanValue("localSecurityOptionsDoNotRequireCtrlAltDel", this.getLocalSecurityOptionsDoNotRequireCtrlAltDel());
        writer.writeBooleanValue("localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange", this.getLocalSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange());
        writer.writeEnumValue("localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser", this.getLocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser());
        writer.writeStringValue("localSecurityOptionsGuestAccountName", this.getLocalSecurityOptionsGuestAccountName());
        writer.writeBooleanValue("localSecurityOptionsHideLastSignedInUser", this.getLocalSecurityOptionsHideLastSignedInUser());
        writer.writeBooleanValue("localSecurityOptionsHideUsernameAtSignIn", this.getLocalSecurityOptionsHideUsernameAtSignIn());
        writer.writeEnumValue("localSecurityOptionsInformationDisplayedOnLockScreen", this.getLocalSecurityOptionsInformationDisplayedOnLockScreen());
        writer.writeEnumValue("localSecurityOptionsInformationShownOnLockScreen", this.getLocalSecurityOptionsInformationShownOnLockScreen());
        writer.writeStringValue("localSecurityOptionsLogOnMessageText", this.getLocalSecurityOptionsLogOnMessageText());
        writer.writeStringValue("localSecurityOptionsLogOnMessageTitle", this.getLocalSecurityOptionsLogOnMessageTitle());
        writer.writeIntegerValue("localSecurityOptionsMachineInactivityLimit", this.getLocalSecurityOptionsMachineInactivityLimit());
        writer.writeIntegerValue("localSecurityOptionsMachineInactivityLimitInMinutes", this.getLocalSecurityOptionsMachineInactivityLimitInMinutes());
        writer.writeEnumValue("localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients", this.getLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients());
        writer.writeEnumValue("localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers", this.getLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers());
        writer.writeBooleanValue("localSecurityOptionsOnlyElevateSignedExecutables", this.getLocalSecurityOptionsOnlyElevateSignedExecutables());
        writer.writeBooleanValue("localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares", this.getLocalSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares());
        writer.writeEnumValue("localSecurityOptionsSmartCardRemovalBehavior", this.getLocalSecurityOptionsSmartCardRemovalBehavior());
        writer.writeEnumValue("localSecurityOptionsStandardUserElevationPromptBehavior", this.getLocalSecurityOptionsStandardUserElevationPromptBehavior());
        writer.writeBooleanValue("localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation", this.getLocalSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation());
        writer.writeBooleanValue("localSecurityOptionsUseAdminApprovalMode", this.getLocalSecurityOptionsUseAdminApprovalMode());
        writer.writeBooleanValue("localSecurityOptionsUseAdminApprovalModeForAdministrators", this.getLocalSecurityOptionsUseAdminApprovalModeForAdministrators());
        writer.writeBooleanValue("localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations", this.getLocalSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations());
        writer.writeBooleanValue("smartScreenBlockOverrideForFiles", this.getSmartScreenBlockOverrideForFiles());
        writer.writeBooleanValue("smartScreenEnableInShell", this.getSmartScreenEnableInShell());
        writer.writeObjectValue("userRightsAccessCredentialManagerAsTrustedCaller", this.getUserRightsAccessCredentialManagerAsTrustedCaller());
        writer.writeObjectValue("userRightsActAsPartOfTheOperatingSystem", this.getUserRightsActAsPartOfTheOperatingSystem());
        writer.writeObjectValue("userRightsAllowAccessFromNetwork", this.getUserRightsAllowAccessFromNetwork());
        writer.writeObjectValue("userRightsBackupData", this.getUserRightsBackupData());
        writer.writeObjectValue("userRightsBlockAccessFromNetwork", this.getUserRightsBlockAccessFromNetwork());
        writer.writeObjectValue("userRightsChangeSystemTime", this.getUserRightsChangeSystemTime());
        writer.writeObjectValue("userRightsCreateGlobalObjects", this.getUserRightsCreateGlobalObjects());
        writer.writeObjectValue("userRightsCreatePageFile", this.getUserRightsCreatePageFile());
        writer.writeObjectValue("userRightsCreatePermanentSharedObjects", this.getUserRightsCreatePermanentSharedObjects());
        writer.writeObjectValue("userRightsCreateSymbolicLinks", this.getUserRightsCreateSymbolicLinks());
        writer.writeObjectValue("userRightsCreateToken", this.getUserRightsCreateToken());
        writer.writeObjectValue("userRightsDebugPrograms", this.getUserRightsDebugPrograms());
        writer.writeObjectValue("userRightsDelegation", this.getUserRightsDelegation());
        writer.writeObjectValue("userRightsDenyLocalLogOn", this.getUserRightsDenyLocalLogOn());
        writer.writeObjectValue("userRightsGenerateSecurityAudits", this.getUserRightsGenerateSecurityAudits());
        writer.writeObjectValue("userRightsImpersonateClient", this.getUserRightsImpersonateClient());
        writer.writeObjectValue("userRightsIncreaseSchedulingPriority", this.getUserRightsIncreaseSchedulingPriority());
        writer.writeObjectValue("userRightsLoadUnloadDrivers", this.getUserRightsLoadUnloadDrivers());
        writer.writeObjectValue("userRightsLocalLogOn", this.getUserRightsLocalLogOn());
        writer.writeObjectValue("userRightsLockMemory", this.getUserRightsLockMemory());
        writer.writeObjectValue("userRightsManageAuditingAndSecurityLogs", this.getUserRightsManageAuditingAndSecurityLogs());
        writer.writeObjectValue("userRightsManageVolumes", this.getUserRightsManageVolumes());
        writer.writeObjectValue("userRightsModifyFirmwareEnvironment", this.getUserRightsModifyFirmwareEnvironment());
        writer.writeObjectValue("userRightsModifyObjectLabels", this.getUserRightsModifyObjectLabels());
        writer.writeObjectValue("userRightsProfileSingleProcess", this.getUserRightsProfileSingleProcess());
        writer.writeObjectValue("userRightsRemoteDesktopServicesLogOn", this.getUserRightsRemoteDesktopServicesLogOn());
        writer.writeObjectValue("userRightsRemoteShutdown", this.getUserRightsRemoteShutdown());
        writer.writeObjectValue("userRightsRestoreData", this.getUserRightsRestoreData());
        writer.writeObjectValue("userRightsTakeOwnership", this.getUserRightsTakeOwnership());
        writer.writeEnumValue("windowsDefenderTamperProtection", this.getWindowsDefenderTamperProtection());
        writer.writeEnumValue("xboxServicesAccessoryManagementServiceStartupMode", this.getXboxServicesAccessoryManagementServiceStartupMode());
        writer.writeBooleanValue("xboxServicesEnableXboxGameSaveTask", this.getXboxServicesEnableXboxGameSaveTask());
        writer.writeEnumValue("xboxServicesLiveAuthManagerServiceStartupMode", this.getXboxServicesLiveAuthManagerServiceStartupMode());
        writer.writeEnumValue("xboxServicesLiveGameSaveServiceStartupMode", this.getXboxServicesLiveGameSaveServiceStartupMode());
        writer.writeEnumValue("xboxServicesLiveNetworkingServiceStartupMode", this.getXboxServicesLiveNetworkingServiceStartupMode());
    }
    /**
     * Sets the applicationGuardAllowCameraMicrophoneRedirection property value. Gets or sets whether applications inside Microsoft Defender Application Guard can access the devices camera and microphone.
     * @param value Value to set for the applicationGuardAllowCameraMicrophoneRedirection property.
     */
    public void setApplicationGuardAllowCameraMicrophoneRedirection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardAllowCameraMicrophoneRedirection", value);
    }
    /**
     * Sets the applicationGuardAllowFileSaveOnHost property value. Allow users to download files from Edge in the application guard container and save them on the host file system
     * @param value Value to set for the applicationGuardAllowFileSaveOnHost property.
     */
    public void setApplicationGuardAllowFileSaveOnHost(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardAllowFileSaveOnHost", value);
    }
    /**
     * Sets the applicationGuardAllowPersistence property value. Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)
     * @param value Value to set for the applicationGuardAllowPersistence property.
     */
    public void setApplicationGuardAllowPersistence(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardAllowPersistence", value);
    }
    /**
     * Sets the applicationGuardAllowPrintToLocalPrinters property value. Allow printing to Local Printers from Container
     * @param value Value to set for the applicationGuardAllowPrintToLocalPrinters property.
     */
    public void setApplicationGuardAllowPrintToLocalPrinters(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardAllowPrintToLocalPrinters", value);
    }
    /**
     * Sets the applicationGuardAllowPrintToNetworkPrinters property value. Allow printing to Network Printers from Container
     * @param value Value to set for the applicationGuardAllowPrintToNetworkPrinters property.
     */
    public void setApplicationGuardAllowPrintToNetworkPrinters(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardAllowPrintToNetworkPrinters", value);
    }
    /**
     * Sets the applicationGuardAllowPrintToPDF property value. Allow printing to PDF from Container
     * @param value Value to set for the applicationGuardAllowPrintToPDF property.
     */
    public void setApplicationGuardAllowPrintToPDF(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardAllowPrintToPDF", value);
    }
    /**
     * Sets the applicationGuardAllowPrintToXPS property value. Allow printing to XPS from Container
     * @param value Value to set for the applicationGuardAllowPrintToXPS property.
     */
    public void setApplicationGuardAllowPrintToXPS(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardAllowPrintToXPS", value);
    }
    /**
     * Sets the applicationGuardAllowVirtualGPU property value. Allow application guard to use virtual GPU
     * @param value Value to set for the applicationGuardAllowVirtualGPU property.
     */
    public void setApplicationGuardAllowVirtualGPU(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardAllowVirtualGPU", value);
    }
    /**
     * Sets the applicationGuardBlockClipboardSharing property value. Possible values for applicationGuardBlockClipboardSharingType
     * @param value Value to set for the applicationGuardBlockClipboardSharing property.
     */
    public void setApplicationGuardBlockClipboardSharing(@jakarta.annotation.Nullable final ApplicationGuardBlockClipboardSharingType value) {
        this.backingStore.set("applicationGuardBlockClipboardSharing", value);
    }
    /**
     * Sets the applicationGuardBlockFileTransfer property value. Possible values for applicationGuardBlockFileTransfer
     * @param value Value to set for the applicationGuardBlockFileTransfer property.
     */
    public void setApplicationGuardBlockFileTransfer(@jakarta.annotation.Nullable final ApplicationGuardBlockFileTransferType value) {
        this.backingStore.set("applicationGuardBlockFileTransfer", value);
    }
    /**
     * Sets the applicationGuardBlockNonEnterpriseContent property value. Block enterprise sites to load non-enterprise content, such as third party plug-ins
     * @param value Value to set for the applicationGuardBlockNonEnterpriseContent property.
     */
    public void setApplicationGuardBlockNonEnterpriseContent(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardBlockNonEnterpriseContent", value);
    }
    /**
     * Sets the applicationGuardCertificateThumbprints property value. Allows certain device level Root Certificates to be shared with the Microsoft Defender Application Guard container.
     * @param value Value to set for the applicationGuardCertificateThumbprints property.
     */
    public void setApplicationGuardCertificateThumbprints(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("applicationGuardCertificateThumbprints", value);
    }
    /**
     * Sets the applicationGuardEnabled property value. Enable Windows Defender Application Guard
     * @param value Value to set for the applicationGuardEnabled property.
     */
    public void setApplicationGuardEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardEnabled", value);
    }
    /**
     * Sets the applicationGuardEnabledOptions property value. Possible values for ApplicationGuardEnabledOptions
     * @param value Value to set for the applicationGuardEnabledOptions property.
     */
    public void setApplicationGuardEnabledOptions(@jakarta.annotation.Nullable final ApplicationGuardEnabledOptions value) {
        this.backingStore.set("applicationGuardEnabledOptions", value);
    }
    /**
     * Sets the applicationGuardForceAuditing property value. Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.)
     * @param value Value to set for the applicationGuardForceAuditing property.
     */
    public void setApplicationGuardForceAuditing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationGuardForceAuditing", value);
    }
    /**
     * Sets the appLockerApplicationControl property value. Possible values of AppLocker Application Control Types
     * @param value Value to set for the appLockerApplicationControl property.
     */
    public void setAppLockerApplicationControl(@jakarta.annotation.Nullable final AppLockerApplicationControlType value) {
        this.backingStore.set("appLockerApplicationControl", value);
    }
    /**
     * Sets the bitLockerAllowStandardUserEncryption property value. Allows the admin to allow standard users to enable encrpytion during Azure AD Join.
     * @param value Value to set for the bitLockerAllowStandardUserEncryption property.
     */
    public void setBitLockerAllowStandardUserEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bitLockerAllowStandardUserEncryption", value);
    }
    /**
     * Sets the bitLockerDisableWarningForOtherDiskEncryption property value. Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
     * @param value Value to set for the bitLockerDisableWarningForOtherDiskEncryption property.
     */
    public void setBitLockerDisableWarningForOtherDiskEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bitLockerDisableWarningForOtherDiskEncryption", value);
    }
    /**
     * Sets the bitLockerEnableStorageCardEncryptionOnMobile property value. Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
     * @param value Value to set for the bitLockerEnableStorageCardEncryptionOnMobile property.
     */
    public void setBitLockerEnableStorageCardEncryptionOnMobile(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bitLockerEnableStorageCardEncryptionOnMobile", value);
    }
    /**
     * Sets the bitLockerEncryptDevice property value. Allows the admin to require encryption to be turned on using BitLocker.
     * @param value Value to set for the bitLockerEncryptDevice property.
     */
    public void setBitLockerEncryptDevice(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bitLockerEncryptDevice", value);
    }
    /**
     * Sets the bitLockerFixedDrivePolicy property value. BitLocker Fixed Drive Policy.
     * @param value Value to set for the bitLockerFixedDrivePolicy property.
     */
    public void setBitLockerFixedDrivePolicy(@jakarta.annotation.Nullable final BitLockerFixedDrivePolicy value) {
        this.backingStore.set("bitLockerFixedDrivePolicy", value);
    }
    /**
     * Sets the bitLockerRecoveryPasswordRotation property value. BitLocker recovery password rotation type
     * @param value Value to set for the bitLockerRecoveryPasswordRotation property.
     */
    public void setBitLockerRecoveryPasswordRotation(@jakarta.annotation.Nullable final BitLockerRecoveryPasswordRotationType value) {
        this.backingStore.set("bitLockerRecoveryPasswordRotation", value);
    }
    /**
     * Sets the bitLockerRemovableDrivePolicy property value. BitLocker Removable Drive Policy.
     * @param value Value to set for the bitLockerRemovableDrivePolicy property.
     */
    public void setBitLockerRemovableDrivePolicy(@jakarta.annotation.Nullable final BitLockerRemovableDrivePolicy value) {
        this.backingStore.set("bitLockerRemovableDrivePolicy", value);
    }
    /**
     * Sets the bitLockerSystemDrivePolicy property value. BitLocker System Drive Policy.
     * @param value Value to set for the bitLockerSystemDrivePolicy property.
     */
    public void setBitLockerSystemDrivePolicy(@jakarta.annotation.Nullable final BitLockerSystemDrivePolicy value) {
        this.backingStore.set("bitLockerSystemDrivePolicy", value);
    }
    /**
     * Sets the defenderAdditionalGuardedFolders property value. List of folder paths to be added to the list of protected folders
     * @param value Value to set for the defenderAdditionalGuardedFolders property.
     */
    public void setDefenderAdditionalGuardedFolders(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defenderAdditionalGuardedFolders", value);
    }
    /**
     * Sets the defenderAdobeReaderLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderAdobeReaderLaunchChildProcess property.
     */
    public void setDefenderAdobeReaderLaunchChildProcess(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderAdobeReaderLaunchChildProcess", value);
    }
    /**
     * Sets the defenderAdvancedRansomewareProtectionType property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderAdvancedRansomewareProtectionType property.
     */
    public void setDefenderAdvancedRansomewareProtectionType(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderAdvancedRansomewareProtectionType", value);
    }
    /**
     * Sets the defenderAllowBehaviorMonitoring property value. Allows or disallows Windows Defender Behavior Monitoring functionality.
     * @param value Value to set for the defenderAllowBehaviorMonitoring property.
     */
    public void setDefenderAllowBehaviorMonitoring(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderAllowBehaviorMonitoring", value);
    }
    /**
     * Sets the defenderAllowCloudProtection property value. To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.
     * @param value Value to set for the defenderAllowCloudProtection property.
     */
    public void setDefenderAllowCloudProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderAllowCloudProtection", value);
    }
    /**
     * Sets the defenderAllowEndUserAccess property value. Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.
     * @param value Value to set for the defenderAllowEndUserAccess property.
     */
    public void setDefenderAllowEndUserAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderAllowEndUserAccess", value);
    }
    /**
     * Sets the defenderAllowIntrusionPreventionSystem property value. Allows or disallows Windows Defender Intrusion Prevention functionality.
     * @param value Value to set for the defenderAllowIntrusionPreventionSystem property.
     */
    public void setDefenderAllowIntrusionPreventionSystem(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderAllowIntrusionPreventionSystem", value);
    }
    /**
     * Sets the defenderAllowOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @param value Value to set for the defenderAllowOnAccessProtection property.
     */
    public void setDefenderAllowOnAccessProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderAllowOnAccessProtection", value);
    }
    /**
     * Sets the defenderAllowRealTimeMonitoring property value. Allows or disallows Windows Defender Realtime Monitoring functionality.
     * @param value Value to set for the defenderAllowRealTimeMonitoring property.
     */
    public void setDefenderAllowRealTimeMonitoring(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderAllowRealTimeMonitoring", value);
    }
    /**
     * Sets the defenderAllowScanArchiveFiles property value. Allows or disallows scanning of archives.
     * @param value Value to set for the defenderAllowScanArchiveFiles property.
     */
    public void setDefenderAllowScanArchiveFiles(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderAllowScanArchiveFiles", value);
    }
    /**
     * Sets the defenderAllowScanDownloads property value. Allows or disallows Windows Defender IOAVP Protection functionality.
     * @param value Value to set for the defenderAllowScanDownloads property.
     */
    public void setDefenderAllowScanDownloads(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderAllowScanDownloads", value);
    }
    /**
     * Sets the defenderAllowScanNetworkFiles property value. Allows or disallows a scanning of network files.
     * @param value Value to set for the defenderAllowScanNetworkFiles property.
     */
    public void setDefenderAllowScanNetworkFiles(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderAllowScanNetworkFiles", value);
    }
    /**
     * Sets the defenderAllowScanRemovableDrivesDuringFullScan property value. Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.
     * @param value Value to set for the defenderAllowScanRemovableDrivesDuringFullScan property.
     */
    public void setDefenderAllowScanRemovableDrivesDuringFullScan(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderAllowScanRemovableDrivesDuringFullScan", value);
    }
    /**
     * Sets the defenderAllowScanScriptsLoadedInInternetExplorer property value. Allows or disallows Windows Defender Script Scanning functionality.
     * @param value Value to set for the defenderAllowScanScriptsLoadedInInternetExplorer property.
     */
    public void setDefenderAllowScanScriptsLoadedInInternetExplorer(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderAllowScanScriptsLoadedInInternetExplorer", value);
    }
    /**
     * Sets the defenderAttackSurfaceReductionExcludedPaths property value. List of exe files and folders to be excluded from attack surface reduction rules
     * @param value Value to set for the defenderAttackSurfaceReductionExcludedPaths property.
     */
    public void setDefenderAttackSurfaceReductionExcludedPaths(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defenderAttackSurfaceReductionExcludedPaths", value);
    }
    /**
     * Sets the defenderBlockEndUserAccess property value. Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.
     * @param value Value to set for the defenderBlockEndUserAccess property.
     */
    public void setDefenderBlockEndUserAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderBlockEndUserAccess", value);
    }
    /**
     * Sets the defenderBlockPersistenceThroughWmiType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderBlockPersistenceThroughWmiType property.
     */
    public void setDefenderBlockPersistenceThroughWmiType(@jakarta.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.backingStore.set("defenderBlockPersistenceThroughWmiType", value);
    }
    /**
     * Sets the defenderCheckForSignaturesBeforeRunningScan property value. This policy setting allows you to manage whether a check for new virus and spyware definitions will occur before running a scan.
     * @param value Value to set for the defenderCheckForSignaturesBeforeRunningScan property.
     */
    public void setDefenderCheckForSignaturesBeforeRunningScan(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderCheckForSignaturesBeforeRunningScan", value);
    }
    /**
     * Sets the defenderCloudBlockLevel property value. Added in Windows 10, version 1709. This policy setting determines how aggressive Windows Defender Antivirus will be in blocking and scanning suspicious files. Value type is integer. This feature requires the 'Join Microsoft MAPS' setting enabled in order to function. Possible values are: notConfigured, high, highPlus, zeroTolerance.
     * @param value Value to set for the defenderCloudBlockLevel property.
     */
    public void setDefenderCloudBlockLevel(@jakarta.annotation.Nullable final Windows10EndpointProtectionConfigurationDefenderCloudBlockLevel value) {
        this.backingStore.set("defenderCloudBlockLevel", value);
    }
    /**
     * Sets the defenderCloudExtendedTimeoutInSeconds property value. Added in Windows 10, version 1709. This feature allows Windows Defender Antivirus to block a suspicious file for up to 60 seconds, and scan it in the cloud to make sure it's safe. Value type is integer, range is 0 - 50. This feature depends on three other MAPS settings the must all be enabled- 'Configure the 'Block at First Sight' feature; 'Join Microsoft MAPS'; 'Send file samples when further analysis is required'. Valid values 0 to 50
     * @param value Value to set for the defenderCloudExtendedTimeoutInSeconds property.
     */
    public void setDefenderCloudExtendedTimeoutInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("defenderCloudExtendedTimeoutInSeconds", value);
    }
    /**
     * Sets the defenderDaysBeforeDeletingQuarantinedMalware property value. Time period (in days) that quarantine items will be stored on the system. Valid values 0 to 90
     * @param value Value to set for the defenderDaysBeforeDeletingQuarantinedMalware property.
     */
    public void setDefenderDaysBeforeDeletingQuarantinedMalware(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("defenderDaysBeforeDeletingQuarantinedMalware", value);
    }
    /**
     * Sets the defenderDetectedMalwareActions property value. Allows an administrator to specify any valid threat severity levels and the corresponding default action ID to take.
     * @param value Value to set for the defenderDetectedMalwareActions property.
     */
    public void setDefenderDetectedMalwareActions(@jakarta.annotation.Nullable final DefenderDetectedMalwareActions value) {
        this.backingStore.set("defenderDetectedMalwareActions", value);
    }
    /**
     * Sets the defenderDisableBehaviorMonitoring property value. Allows or disallows Windows Defender Behavior Monitoring functionality.
     * @param value Value to set for the defenderDisableBehaviorMonitoring property.
     */
    public void setDefenderDisableBehaviorMonitoring(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderDisableBehaviorMonitoring", value);
    }
    /**
     * Sets the defenderDisableCatchupFullScan property value. This policy setting allows you to configure catch-up scans for scheduled full scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.
     * @param value Value to set for the defenderDisableCatchupFullScan property.
     */
    public void setDefenderDisableCatchupFullScan(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderDisableCatchupFullScan", value);
    }
    /**
     * Sets the defenderDisableCatchupQuickScan property value. This policy setting allows you to configure catch-up scans for scheduled quick scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.
     * @param value Value to set for the defenderDisableCatchupQuickScan property.
     */
    public void setDefenderDisableCatchupQuickScan(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderDisableCatchupQuickScan", value);
    }
    /**
     * Sets the defenderDisableCloudProtection property value. To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.
     * @param value Value to set for the defenderDisableCloudProtection property.
     */
    public void setDefenderDisableCloudProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderDisableCloudProtection", value);
    }
    /**
     * Sets the defenderDisableIntrusionPreventionSystem property value. Allows or disallows Windows Defender Intrusion Prevention functionality.
     * @param value Value to set for the defenderDisableIntrusionPreventionSystem property.
     */
    public void setDefenderDisableIntrusionPreventionSystem(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderDisableIntrusionPreventionSystem", value);
    }
    /**
     * Sets the defenderDisableOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @param value Value to set for the defenderDisableOnAccessProtection property.
     */
    public void setDefenderDisableOnAccessProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderDisableOnAccessProtection", value);
    }
    /**
     * Sets the defenderDisableRealTimeMonitoring property value. Allows or disallows Windows Defender Realtime Monitoring functionality.
     * @param value Value to set for the defenderDisableRealTimeMonitoring property.
     */
    public void setDefenderDisableRealTimeMonitoring(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderDisableRealTimeMonitoring", value);
    }
    /**
     * Sets the defenderDisableScanArchiveFiles property value. Allows or disallows scanning of archives.
     * @param value Value to set for the defenderDisableScanArchiveFiles property.
     */
    public void setDefenderDisableScanArchiveFiles(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderDisableScanArchiveFiles", value);
    }
    /**
     * Sets the defenderDisableScanDownloads property value. Allows or disallows Windows Defender IOAVP Protection functionality.
     * @param value Value to set for the defenderDisableScanDownloads property.
     */
    public void setDefenderDisableScanDownloads(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderDisableScanDownloads", value);
    }
    /**
     * Sets the defenderDisableScanNetworkFiles property value. Allows or disallows a scanning of network files.
     * @param value Value to set for the defenderDisableScanNetworkFiles property.
     */
    public void setDefenderDisableScanNetworkFiles(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderDisableScanNetworkFiles", value);
    }
    /**
     * Sets the defenderDisableScanRemovableDrivesDuringFullScan property value. Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.
     * @param value Value to set for the defenderDisableScanRemovableDrivesDuringFullScan property.
     */
    public void setDefenderDisableScanRemovableDrivesDuringFullScan(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderDisableScanRemovableDrivesDuringFullScan", value);
    }
    /**
     * Sets the defenderDisableScanScriptsLoadedInInternetExplorer property value. Allows or disallows Windows Defender Script Scanning functionality.
     * @param value Value to set for the defenderDisableScanScriptsLoadedInInternetExplorer property.
     */
    public void setDefenderDisableScanScriptsLoadedInInternetExplorer(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderDisableScanScriptsLoadedInInternetExplorer", value);
    }
    /**
     * Sets the defenderEmailContentExecution property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderEmailContentExecution property.
     */
    public void setDefenderEmailContentExecution(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderEmailContentExecution", value);
    }
    /**
     * Sets the defenderEmailContentExecutionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderEmailContentExecutionType property.
     */
    public void setDefenderEmailContentExecutionType(@jakarta.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.backingStore.set("defenderEmailContentExecutionType", value);
    }
    /**
     * Sets the defenderEnableLowCpuPriority property value. This policy setting allows you to enable or disable low CPU priority for scheduled scans.
     * @param value Value to set for the defenderEnableLowCpuPriority property.
     */
    public void setDefenderEnableLowCpuPriority(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderEnableLowCpuPriority", value);
    }
    /**
     * Sets the defenderEnableScanIncomingMail property value. Allows or disallows scanning of email.
     * @param value Value to set for the defenderEnableScanIncomingMail property.
     */
    public void setDefenderEnableScanIncomingMail(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderEnableScanIncomingMail", value);
    }
    /**
     * Sets the defenderEnableScanMappedNetworkDrivesDuringFullScan property value. Allows or disallows a full scan of mapped network drives.
     * @param value Value to set for the defenderEnableScanMappedNetworkDrivesDuringFullScan property.
     */
    public void setDefenderEnableScanMappedNetworkDrivesDuringFullScan(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderEnableScanMappedNetworkDrivesDuringFullScan", value);
    }
    /**
     * Sets the defenderExploitProtectionXml property value. Xml content containing information regarding exploit protection details.
     * @param value Value to set for the defenderExploitProtectionXml property.
     */
    public void setDefenderExploitProtectionXml(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("defenderExploitProtectionXml", value);
    }
    /**
     * Sets the defenderExploitProtectionXmlFileName property value. Name of the file from which DefenderExploitProtectionXml was obtained.
     * @param value Value to set for the defenderExploitProtectionXmlFileName property.
     */
    public void setDefenderExploitProtectionXmlFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defenderExploitProtectionXmlFileName", value);
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
     * Sets the defenderGuardedFoldersAllowedAppPaths property value. List of paths to exe that are allowed to access protected folders
     * @param value Value to set for the defenderGuardedFoldersAllowedAppPaths property.
     */
    public void setDefenderGuardedFoldersAllowedAppPaths(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defenderGuardedFoldersAllowedAppPaths", value);
    }
    /**
     * Sets the defenderGuardMyFoldersType property value. Possible values of Folder Protection
     * @param value Value to set for the defenderGuardMyFoldersType property.
     */
    public void setDefenderGuardMyFoldersType(@jakarta.annotation.Nullable final FolderProtectionType value) {
        this.backingStore.set("defenderGuardMyFoldersType", value);
    }
    /**
     * Sets the defenderNetworkProtectionType property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderNetworkProtectionType property.
     */
    public void setDefenderNetworkProtectionType(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderNetworkProtectionType", value);
    }
    /**
     * Sets the defenderOfficeAppsExecutableContentCreationOrLaunch property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeAppsExecutableContentCreationOrLaunch property.
     */
    public void setDefenderOfficeAppsExecutableContentCreationOrLaunch(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderOfficeAppsExecutableContentCreationOrLaunch", value);
    }
    /**
     * Sets the defenderOfficeAppsExecutableContentCreationOrLaunchType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderOfficeAppsExecutableContentCreationOrLaunchType property.
     */
    public void setDefenderOfficeAppsExecutableContentCreationOrLaunchType(@jakarta.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.backingStore.set("defenderOfficeAppsExecutableContentCreationOrLaunchType", value);
    }
    /**
     * Sets the defenderOfficeAppsLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeAppsLaunchChildProcess property.
     */
    public void setDefenderOfficeAppsLaunchChildProcess(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderOfficeAppsLaunchChildProcess", value);
    }
    /**
     * Sets the defenderOfficeAppsLaunchChildProcessType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderOfficeAppsLaunchChildProcessType property.
     */
    public void setDefenderOfficeAppsLaunchChildProcessType(@jakarta.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.backingStore.set("defenderOfficeAppsLaunchChildProcessType", value);
    }
    /**
     * Sets the defenderOfficeAppsOtherProcessInjection property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeAppsOtherProcessInjection property.
     */
    public void setDefenderOfficeAppsOtherProcessInjection(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderOfficeAppsOtherProcessInjection", value);
    }
    /**
     * Sets the defenderOfficeAppsOtherProcessInjectionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderOfficeAppsOtherProcessInjectionType property.
     */
    public void setDefenderOfficeAppsOtherProcessInjectionType(@jakarta.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.backingStore.set("defenderOfficeAppsOtherProcessInjectionType", value);
    }
    /**
     * Sets the defenderOfficeCommunicationAppsLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeCommunicationAppsLaunchChildProcess property.
     */
    public void setDefenderOfficeCommunicationAppsLaunchChildProcess(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderOfficeCommunicationAppsLaunchChildProcess", value);
    }
    /**
     * Sets the defenderOfficeMacroCodeAllowWin32Imports property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeMacroCodeAllowWin32Imports property.
     */
    public void setDefenderOfficeMacroCodeAllowWin32Imports(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderOfficeMacroCodeAllowWin32Imports", value);
    }
    /**
     * Sets the defenderOfficeMacroCodeAllowWin32ImportsType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderOfficeMacroCodeAllowWin32ImportsType property.
     */
    public void setDefenderOfficeMacroCodeAllowWin32ImportsType(@jakarta.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.backingStore.set("defenderOfficeMacroCodeAllowWin32ImportsType", value);
    }
    /**
     * Sets the defenderPotentiallyUnwantedAppAction property value. Added in Windows 10, version 1607. Specifies the level of detection for potentially unwanted applications (PUAs). Windows Defender alerts you when potentially unwanted software is being downloaded or attempts to install itself on your computer. Possible values are: userDefined, enable, auditMode, warn, notConfigured.
     * @param value Value to set for the defenderPotentiallyUnwantedAppAction property.
     */
    public void setDefenderPotentiallyUnwantedAppAction(@jakarta.annotation.Nullable final Windows10EndpointProtectionConfigurationDefenderPotentiallyUnwantedAppAction value) {
        this.backingStore.set("defenderPotentiallyUnwantedAppAction", value);
    }
    /**
     * Sets the defenderPreventCredentialStealingType property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderPreventCredentialStealingType property.
     */
    public void setDefenderPreventCredentialStealingType(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderPreventCredentialStealingType", value);
    }
    /**
     * Sets the defenderProcessCreation property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderProcessCreation property.
     */
    public void setDefenderProcessCreation(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderProcessCreation", value);
    }
    /**
     * Sets the defenderProcessCreationType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderProcessCreationType property.
     */
    public void setDefenderProcessCreationType(@jakarta.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.backingStore.set("defenderProcessCreationType", value);
    }
    /**
     * Sets the defenderProcessesToExclude property value. Processes to exclude from scans and real time protection.
     * @param value Value to set for the defenderProcessesToExclude property.
     */
    public void setDefenderProcessesToExclude(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defenderProcessesToExclude", value);
    }
    /**
     * Sets the defenderScanDirection property value. Controls which sets of files should be monitored. Possible values are: monitorAllFiles, monitorIncomingFilesOnly, monitorOutgoingFilesOnly.
     * @param value Value to set for the defenderScanDirection property.
     */
    public void setDefenderScanDirection(@jakarta.annotation.Nullable final Windows10EndpointProtectionConfigurationDefenderScanDirection value) {
        this.backingStore.set("defenderScanDirection", value);
    }
    /**
     * Sets the defenderScanMaxCpuPercentage property value. Represents the average CPU load factor for the Windows Defender scan (in percent). The default value is 50. Valid values 0 to 100
     * @param value Value to set for the defenderScanMaxCpuPercentage property.
     */
    public void setDefenderScanMaxCpuPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("defenderScanMaxCpuPercentage", value);
    }
    /**
     * Sets the defenderScanType property value. Selects whether to perform a quick scan or full scan. Possible values are: userDefined, disabled, quick, full.
     * @param value Value to set for the defenderScanType property.
     */
    public void setDefenderScanType(@jakarta.annotation.Nullable final Windows10EndpointProtectionConfigurationDefenderScanType value) {
        this.backingStore.set("defenderScanType", value);
    }
    /**
     * Sets the defenderScheduledQuickScanTime property value. Selects the time of day that the Windows Defender quick scan should run. For example, a value of 0=12:00AM, a value of 60=1:00AM, a value of 120=2:00, and so on, up to a value of 1380=11:00PM. The default value is 120
     * @param value Value to set for the defenderScheduledQuickScanTime property.
     */
    public void setDefenderScheduledQuickScanTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("defenderScheduledQuickScanTime", value);
    }
    /**
     * Sets the defenderScheduledScanDay property value. Selects the day that the Windows Defender scan should run. Possible values are: userDefined, everyday, sunday, monday, tuesday, wednesday, thursday, friday, saturday, noScheduledScan.
     * @param value Value to set for the defenderScheduledScanDay property.
     */
    public void setDefenderScheduledScanDay(@jakarta.annotation.Nullable final Windows10EndpointProtectionConfigurationDefenderScheduledScanDay value) {
        this.backingStore.set("defenderScheduledScanDay", value);
    }
    /**
     * Sets the defenderScheduledScanTime property value. Selects the time of day that the Windows Defender scan should run.
     * @param value Value to set for the defenderScheduledScanTime property.
     */
    public void setDefenderScheduledScanTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.backingStore.set("defenderScheduledScanTime", value);
    }
    /**
     * Sets the defenderScriptDownloadedPayloadExecution property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderScriptDownloadedPayloadExecution property.
     */
    public void setDefenderScriptDownloadedPayloadExecution(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderScriptDownloadedPayloadExecution", value);
    }
    /**
     * Sets the defenderScriptDownloadedPayloadExecutionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderScriptDownloadedPayloadExecutionType property.
     */
    public void setDefenderScriptDownloadedPayloadExecutionType(@jakarta.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.backingStore.set("defenderScriptDownloadedPayloadExecutionType", value);
    }
    /**
     * Sets the defenderScriptObfuscatedMacroCode property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderScriptObfuscatedMacroCode property.
     */
    public void setDefenderScriptObfuscatedMacroCode(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderScriptObfuscatedMacroCode", value);
    }
    /**
     * Sets the defenderScriptObfuscatedMacroCodeType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderScriptObfuscatedMacroCodeType property.
     */
    public void setDefenderScriptObfuscatedMacroCodeType(@jakarta.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.backingStore.set("defenderScriptObfuscatedMacroCodeType", value);
    }
    /**
     * Sets the defenderSecurityCenterBlockExploitProtectionOverride property value. Indicates whether or not to block user from overriding Exploit Protection settings.
     * @param value Value to set for the defenderSecurityCenterBlockExploitProtectionOverride property.
     */
    public void setDefenderSecurityCenterBlockExploitProtectionOverride(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterBlockExploitProtectionOverride", value);
    }
    /**
     * Sets the defenderSecurityCenterDisableAccountUI property value. Used to disable the display of the account protection area.
     * @param value Value to set for the defenderSecurityCenterDisableAccountUI property.
     */
    public void setDefenderSecurityCenterDisableAccountUI(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterDisableAccountUI", value);
    }
    /**
     * Sets the defenderSecurityCenterDisableAppBrowserUI property value. Used to disable the display of the app and browser protection area.
     * @param value Value to set for the defenderSecurityCenterDisableAppBrowserUI property.
     */
    public void setDefenderSecurityCenterDisableAppBrowserUI(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterDisableAppBrowserUI", value);
    }
    /**
     * Sets the defenderSecurityCenterDisableClearTpmUI property value. Used to disable the display of the Clear TPM button.
     * @param value Value to set for the defenderSecurityCenterDisableClearTpmUI property.
     */
    public void setDefenderSecurityCenterDisableClearTpmUI(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterDisableClearTpmUI", value);
    }
    /**
     * Sets the defenderSecurityCenterDisableFamilyUI property value. Used to disable the display of the family options area.
     * @param value Value to set for the defenderSecurityCenterDisableFamilyUI property.
     */
    public void setDefenderSecurityCenterDisableFamilyUI(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterDisableFamilyUI", value);
    }
    /**
     * Sets the defenderSecurityCenterDisableHardwareUI property value. Used to disable the display of the hardware protection area.
     * @param value Value to set for the defenderSecurityCenterDisableHardwareUI property.
     */
    public void setDefenderSecurityCenterDisableHardwareUI(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterDisableHardwareUI", value);
    }
    /**
     * Sets the defenderSecurityCenterDisableHealthUI property value. Used to disable the display of the device performance and health area.
     * @param value Value to set for the defenderSecurityCenterDisableHealthUI property.
     */
    public void setDefenderSecurityCenterDisableHealthUI(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterDisableHealthUI", value);
    }
    /**
     * Sets the defenderSecurityCenterDisableNetworkUI property value. Used to disable the display of the firewall and network protection area.
     * @param value Value to set for the defenderSecurityCenterDisableNetworkUI property.
     */
    public void setDefenderSecurityCenterDisableNetworkUI(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterDisableNetworkUI", value);
    }
    /**
     * Sets the defenderSecurityCenterDisableNotificationAreaUI property value. Used to disable the display of the notification area control. The user needs to either sign out and sign in or reboot the computer for this setting to take effect.
     * @param value Value to set for the defenderSecurityCenterDisableNotificationAreaUI property.
     */
    public void setDefenderSecurityCenterDisableNotificationAreaUI(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterDisableNotificationAreaUI", value);
    }
    /**
     * Sets the defenderSecurityCenterDisableRansomwareUI property value. Used to disable the display of the ransomware protection area.
     * @param value Value to set for the defenderSecurityCenterDisableRansomwareUI property.
     */
    public void setDefenderSecurityCenterDisableRansomwareUI(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterDisableRansomwareUI", value);
    }
    /**
     * Sets the defenderSecurityCenterDisableSecureBootUI property value. Used to disable the display of the secure boot area under Device security.
     * @param value Value to set for the defenderSecurityCenterDisableSecureBootUI property.
     */
    public void setDefenderSecurityCenterDisableSecureBootUI(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterDisableSecureBootUI", value);
    }
    /**
     * Sets the defenderSecurityCenterDisableTroubleshootingUI property value. Used to disable the display of the security process troubleshooting under Device security.
     * @param value Value to set for the defenderSecurityCenterDisableTroubleshootingUI property.
     */
    public void setDefenderSecurityCenterDisableTroubleshootingUI(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterDisableTroubleshootingUI", value);
    }
    /**
     * Sets the defenderSecurityCenterDisableVirusUI property value. Used to disable the display of the virus and threat protection area.
     * @param value Value to set for the defenderSecurityCenterDisableVirusUI property.
     */
    public void setDefenderSecurityCenterDisableVirusUI(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterDisableVirusUI", value);
    }
    /**
     * Sets the defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI property value. Used to disable the display of update TPM Firmware when a vulnerable firmware is detected.
     * @param value Value to set for the defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI property.
     */
    public void setDefenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI", value);
    }
    /**
     * Sets the defenderSecurityCenterHelpEmail property value. The email address that is displayed to users.
     * @param value Value to set for the defenderSecurityCenterHelpEmail property.
     */
    public void setDefenderSecurityCenterHelpEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defenderSecurityCenterHelpEmail", value);
    }
    /**
     * Sets the defenderSecurityCenterHelpPhone property value. The phone number or Skype ID that is displayed to users.
     * @param value Value to set for the defenderSecurityCenterHelpPhone property.
     */
    public void setDefenderSecurityCenterHelpPhone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defenderSecurityCenterHelpPhone", value);
    }
    /**
     * Sets the defenderSecurityCenterHelpURL property value. The help portal URL this is displayed to users.
     * @param value Value to set for the defenderSecurityCenterHelpURL property.
     */
    public void setDefenderSecurityCenterHelpURL(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defenderSecurityCenterHelpURL", value);
    }
    /**
     * Sets the defenderSecurityCenterITContactDisplay property value. Possible values for defenderSecurityCenterITContactDisplay
     * @param value Value to set for the defenderSecurityCenterITContactDisplay property.
     */
    public void setDefenderSecurityCenterITContactDisplay(@jakarta.annotation.Nullable final DefenderSecurityCenterITContactDisplayType value) {
        this.backingStore.set("defenderSecurityCenterITContactDisplay", value);
    }
    /**
     * Sets the defenderSecurityCenterNotificationsFromApp property value. Possible values for defenderSecurityCenterNotificationsFromApp
     * @param value Value to set for the defenderSecurityCenterNotificationsFromApp property.
     */
    public void setDefenderSecurityCenterNotificationsFromApp(@jakarta.annotation.Nullable final DefenderSecurityCenterNotificationsFromAppType value) {
        this.backingStore.set("defenderSecurityCenterNotificationsFromApp", value);
    }
    /**
     * Sets the defenderSecurityCenterOrganizationDisplayName property value. The company name that is displayed to the users.
     * @param value Value to set for the defenderSecurityCenterOrganizationDisplayName property.
     */
    public void setDefenderSecurityCenterOrganizationDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defenderSecurityCenterOrganizationDisplayName", value);
    }
    /**
     * Sets the defenderSignatureUpdateIntervalInHours property value. Specifies the interval (in hours) that will be used to check for signatures, so instead of using the ScheduleDay and ScheduleTime the check for new signatures will be set according to the interval. Valid values 0 to 24
     * @param value Value to set for the defenderSignatureUpdateIntervalInHours property.
     */
    public void setDefenderSignatureUpdateIntervalInHours(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("defenderSignatureUpdateIntervalInHours", value);
    }
    /**
     * Sets the defenderSubmitSamplesConsentType property value. Checks for the user consent level in Windows Defender to send data. Possible values are: sendSafeSamplesAutomatically, alwaysPrompt, neverSend, sendAllSamplesAutomatically.
     * @param value Value to set for the defenderSubmitSamplesConsentType property.
     */
    public void setDefenderSubmitSamplesConsentType(@jakarta.annotation.Nullable final Windows10EndpointProtectionConfigurationDefenderSubmitSamplesConsentType value) {
        this.backingStore.set("defenderSubmitSamplesConsentType", value);
    }
    /**
     * Sets the defenderUntrustedExecutable property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderUntrustedExecutable property.
     */
    public void setDefenderUntrustedExecutable(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderUntrustedExecutable", value);
    }
    /**
     * Sets the defenderUntrustedExecutableType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderUntrustedExecutableType property.
     */
    public void setDefenderUntrustedExecutableType(@jakarta.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.backingStore.set("defenderUntrustedExecutableType", value);
    }
    /**
     * Sets the defenderUntrustedUSBProcess property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderUntrustedUSBProcess property.
     */
    public void setDefenderUntrustedUSBProcess(@jakarta.annotation.Nullable final DefenderProtectionType value) {
        this.backingStore.set("defenderUntrustedUSBProcess", value);
    }
    /**
     * Sets the defenderUntrustedUSBProcessType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderUntrustedUSBProcessType property.
     */
    public void setDefenderUntrustedUSBProcessType(@jakarta.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.backingStore.set("defenderUntrustedUSBProcessType", value);
    }
    /**
     * Sets the deviceGuardEnableSecureBootWithDMA property value. This property will be deprecated in May 2019 and will be replaced with property DeviceGuardSecureBootWithDMA. Specifies whether Platform Security Level is enabled at next reboot.
     * @param value Value to set for the deviceGuardEnableSecureBootWithDMA property.
     */
    public void setDeviceGuardEnableSecureBootWithDMA(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceGuardEnableSecureBootWithDMA", value);
    }
    /**
     * Sets the deviceGuardEnableVirtualizationBasedSecurity property value. Turns On Virtualization Based Security(VBS).
     * @param value Value to set for the deviceGuardEnableVirtualizationBasedSecurity property.
     */
    public void setDeviceGuardEnableVirtualizationBasedSecurity(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceGuardEnableVirtualizationBasedSecurity", value);
    }
    /**
     * Sets the deviceGuardLaunchSystemGuard property value. Possible values of a property
     * @param value Value to set for the deviceGuardLaunchSystemGuard property.
     */
    public void setDeviceGuardLaunchSystemGuard(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("deviceGuardLaunchSystemGuard", value);
    }
    /**
     * Sets the deviceGuardLocalSystemAuthorityCredentialGuardSettings property value. Possible values of Credential Guard settings.
     * @param value Value to set for the deviceGuardLocalSystemAuthorityCredentialGuardSettings property.
     */
    public void setDeviceGuardLocalSystemAuthorityCredentialGuardSettings(@jakarta.annotation.Nullable final DeviceGuardLocalSystemAuthorityCredentialGuardType value) {
        this.backingStore.set("deviceGuardLocalSystemAuthorityCredentialGuardSettings", value);
    }
    /**
     * Sets the deviceGuardSecureBootWithDMA property value. Possible values of Secure Boot with DMA
     * @param value Value to set for the deviceGuardSecureBootWithDMA property.
     */
    public void setDeviceGuardSecureBootWithDMA(@jakarta.annotation.Nullable final SecureBootWithDMAType value) {
        this.backingStore.set("deviceGuardSecureBootWithDMA", value);
    }
    /**
     * Sets the dmaGuardDeviceEnumerationPolicy property value. Possible values of the DmaGuardDeviceEnumerationPolicy.
     * @param value Value to set for the dmaGuardDeviceEnumerationPolicy property.
     */
    public void setDmaGuardDeviceEnumerationPolicy(@jakarta.annotation.Nullable final DmaGuardDeviceEnumerationPolicyType value) {
        this.backingStore.set("dmaGuardDeviceEnumerationPolicy", value);
    }
    /**
     * Sets the firewallBlockStatefulFTP property value. Blocks stateful FTP connections to the device
     * @param value Value to set for the firewallBlockStatefulFTP property.
     */
    public void setFirewallBlockStatefulFTP(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallBlockStatefulFTP", value);
    }
    /**
     * Sets the firewallCertificateRevocationListCheckMethod property value. Possible values for firewallCertificateRevocationListCheckMethod
     * @param value Value to set for the firewallCertificateRevocationListCheckMethod property.
     */
    public void setFirewallCertificateRevocationListCheckMethod(@jakarta.annotation.Nullable final FirewallCertificateRevocationListCheckMethodType value) {
        this.backingStore.set("firewallCertificateRevocationListCheckMethod", value);
    }
    /**
     * Sets the firewallIdleTimeoutForSecurityAssociationInSeconds property value. Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600
     * @param value Value to set for the firewallIdleTimeoutForSecurityAssociationInSeconds property.
     */
    public void setFirewallIdleTimeoutForSecurityAssociationInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("firewallIdleTimeoutForSecurityAssociationInSeconds", value);
    }
    /**
     * Sets the firewallIPSecExemptionsAllowDHCP property value. Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
     * @param value Value to set for the firewallIPSecExemptionsAllowDHCP property.
     */
    public void setFirewallIPSecExemptionsAllowDHCP(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallIPSecExemptionsAllowDHCP", value);
    }
    /**
     * Sets the firewallIPSecExemptionsAllowICMP property value. Configures IPSec exemptions to allow ICMP
     * @param value Value to set for the firewallIPSecExemptionsAllowICMP property.
     */
    public void setFirewallIPSecExemptionsAllowICMP(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallIPSecExemptionsAllowICMP", value);
    }
    /**
     * Sets the firewallIPSecExemptionsAllowNeighborDiscovery property value. Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
     * @param value Value to set for the firewallIPSecExemptionsAllowNeighborDiscovery property.
     */
    public void setFirewallIPSecExemptionsAllowNeighborDiscovery(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallIPSecExemptionsAllowNeighborDiscovery", value);
    }
    /**
     * Sets the firewallIPSecExemptionsAllowRouterDiscovery property value. Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
     * @param value Value to set for the firewallIPSecExemptionsAllowRouterDiscovery property.
     */
    public void setFirewallIPSecExemptionsAllowRouterDiscovery(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallIPSecExemptionsAllowRouterDiscovery", value);
    }
    /**
     * Sets the firewallIPSecExemptionsNone property value. Configures IPSec exemptions to no exemptions
     * @param value Value to set for the firewallIPSecExemptionsNone property.
     */
    public void setFirewallIPSecExemptionsNone(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallIPSecExemptionsNone", value);
    }
    /**
     * Sets the firewallMergeKeyingModuleSettings property value. If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set
     * @param value Value to set for the firewallMergeKeyingModuleSettings property.
     */
    public void setFirewallMergeKeyingModuleSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallMergeKeyingModuleSettings", value);
    }
    /**
     * Sets the firewallPacketQueueingMethod property value. Possible values for firewallPacketQueueingMethod
     * @param value Value to set for the firewallPacketQueueingMethod property.
     */
    public void setFirewallPacketQueueingMethod(@jakarta.annotation.Nullable final FirewallPacketQueueingMethodType value) {
        this.backingStore.set("firewallPacketQueueingMethod", value);
    }
    /**
     * Sets the firewallPreSharedKeyEncodingMethod property value. Possible values for firewallPreSharedKeyEncodingMethod
     * @param value Value to set for the firewallPreSharedKeyEncodingMethod property.
     */
    public void setFirewallPreSharedKeyEncodingMethod(@jakarta.annotation.Nullable final FirewallPreSharedKeyEncodingMethodType value) {
        this.backingStore.set("firewallPreSharedKeyEncodingMethod", value);
    }
    /**
     * Sets the firewallProfileDomain property value. Configures the firewall profile settings for domain networks
     * @param value Value to set for the firewallProfileDomain property.
     */
    public void setFirewallProfileDomain(@jakarta.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this.backingStore.set("firewallProfileDomain", value);
    }
    /**
     * Sets the firewallProfilePrivate property value. Configures the firewall profile settings for private networks
     * @param value Value to set for the firewallProfilePrivate property.
     */
    public void setFirewallProfilePrivate(@jakarta.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this.backingStore.set("firewallProfilePrivate", value);
    }
    /**
     * Sets the firewallProfilePublic property value. Configures the firewall profile settings for public networks
     * @param value Value to set for the firewallProfilePublic property.
     */
    public void setFirewallProfilePublic(@jakarta.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this.backingStore.set("firewallProfilePublic", value);
    }
    /**
     * Sets the firewallRules property value. Configures the firewall rule settings. This collection can contain a maximum of 150 elements.
     * @param value Value to set for the firewallRules property.
     */
    public void setFirewallRules(@jakarta.annotation.Nullable final java.util.List<WindowsFirewallRule> value) {
        this.backingStore.set("firewallRules", value);
    }
    /**
     * Sets the lanManagerAuthenticationLevel property value. Possible values for LanManagerAuthenticationLevel
     * @param value Value to set for the lanManagerAuthenticationLevel property.
     */
    public void setLanManagerAuthenticationLevel(@jakarta.annotation.Nullable final LanManagerAuthenticationLevel value) {
        this.backingStore.set("lanManagerAuthenticationLevel", value);
    }
    /**
     * Sets the lanManagerWorkstationDisableInsecureGuestLogons property value. If enabled,the SMB client will allow insecure guest logons. If not configured, the SMB client will reject insecure guest logons.
     * @param value Value to set for the lanManagerWorkstationDisableInsecureGuestLogons property.
     */
    public void setLanManagerWorkstationDisableInsecureGuestLogons(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("lanManagerWorkstationDisableInsecureGuestLogons", value);
    }
    /**
     * Sets the localSecurityOptionsAdministratorAccountName property value. Define a different account name to be associated with the security identifier (SID) for the account 'Administrator'.
     * @param value Value to set for the localSecurityOptionsAdministratorAccountName property.
     */
    public void setLocalSecurityOptionsAdministratorAccountName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("localSecurityOptionsAdministratorAccountName", value);
    }
    /**
     * Sets the localSecurityOptionsAdministratorElevationPromptBehavior property value. Possible values for LocalSecurityOptionsAdministratorElevationPromptBehavior
     * @param value Value to set for the localSecurityOptionsAdministratorElevationPromptBehavior property.
     */
    public void setLocalSecurityOptionsAdministratorElevationPromptBehavior(@jakarta.annotation.Nullable final LocalSecurityOptionsAdministratorElevationPromptBehaviorType value) {
        this.backingStore.set("localSecurityOptionsAdministratorElevationPromptBehavior", value);
    }
    /**
     * Sets the localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares property value. This security setting determines whether to allows anonymous users to perform certain activities, such as enumerating the names of domain accounts and network shares.
     * @param value Value to set for the localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares property.
     */
    public void setLocalSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares", value);
    }
    /**
     * Sets the localSecurityOptionsAllowPKU2UAuthenticationRequests property value. Block PKU2U authentication requests to this device to use online identities.
     * @param value Value to set for the localSecurityOptionsAllowPKU2UAuthenticationRequests property.
     */
    public void setLocalSecurityOptionsAllowPKU2UAuthenticationRequests(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsAllowPKU2UAuthenticationRequests", value);
    }
    /**
     * Sets the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager property value. Edit the default Security Descriptor Definition Language string to allow or deny users and groups to make remote calls to the SAM.
     * @param value Value to set for the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager property.
     */
    public void setLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager", value);
    }
    /**
     * Sets the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool property value. UI helper boolean for LocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager entity
     * @param value Value to set for the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool property.
     */
    public void setLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool", value);
    }
    /**
     * Sets the localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn property value. This security setting determines whether a computer can be shut down without having to log on to Windows.
     * @param value Value to set for the localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn property.
     */
    public void setLocalSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn", value);
    }
    /**
     * Sets the localSecurityOptionsAllowUIAccessApplicationElevation property value. Allow UIAccess apps to prompt for elevation without using the secure desktop.
     * @param value Value to set for the localSecurityOptionsAllowUIAccessApplicationElevation property.
     */
    public void setLocalSecurityOptionsAllowUIAccessApplicationElevation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsAllowUIAccessApplicationElevation", value);
    }
    /**
     * Sets the localSecurityOptionsAllowUIAccessApplicationsForSecureLocations property value. Allow UIAccess apps to prompt for elevation without using the secure desktop.Default is enabled
     * @param value Value to set for the localSecurityOptionsAllowUIAccessApplicationsForSecureLocations property.
     */
    public void setLocalSecurityOptionsAllowUIAccessApplicationsForSecureLocations(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsAllowUIAccessApplicationsForSecureLocations", value);
    }
    /**
     * Sets the localSecurityOptionsAllowUndockWithoutHavingToLogon property value. Prevent a portable computer from being undocked without having to log in.
     * @param value Value to set for the localSecurityOptionsAllowUndockWithoutHavingToLogon property.
     */
    public void setLocalSecurityOptionsAllowUndockWithoutHavingToLogon(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsAllowUndockWithoutHavingToLogon", value);
    }
    /**
     * Sets the localSecurityOptionsBlockMicrosoftAccounts property value. Prevent users from adding new Microsoft accounts to this computer.
     * @param value Value to set for the localSecurityOptionsBlockMicrosoftAccounts property.
     */
    public void setLocalSecurityOptionsBlockMicrosoftAccounts(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsBlockMicrosoftAccounts", value);
    }
    /**
     * Sets the localSecurityOptionsBlockRemoteLogonWithBlankPassword property value. Enable Local accounts that are not password protected to log on from locations other than the physical device.Default is enabled
     * @param value Value to set for the localSecurityOptionsBlockRemoteLogonWithBlankPassword property.
     */
    public void setLocalSecurityOptionsBlockRemoteLogonWithBlankPassword(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsBlockRemoteLogonWithBlankPassword", value);
    }
    /**
     * Sets the localSecurityOptionsBlockRemoteOpticalDriveAccess property value. Enabling this settings allows only interactively logged on user to access CD-ROM media.
     * @param value Value to set for the localSecurityOptionsBlockRemoteOpticalDriveAccess property.
     */
    public void setLocalSecurityOptionsBlockRemoteOpticalDriveAccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsBlockRemoteOpticalDriveAccess", value);
    }
    /**
     * Sets the localSecurityOptionsBlockUsersInstallingPrinterDrivers property value. Restrict installing printer drivers as part of connecting to a shared printer to admins only.
     * @param value Value to set for the localSecurityOptionsBlockUsersInstallingPrinterDrivers property.
     */
    public void setLocalSecurityOptionsBlockUsersInstallingPrinterDrivers(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsBlockUsersInstallingPrinterDrivers", value);
    }
    /**
     * Sets the localSecurityOptionsClearVirtualMemoryPageFile property value. This security setting determines whether the virtual memory pagefile is cleared when the system is shut down.
     * @param value Value to set for the localSecurityOptionsClearVirtualMemoryPageFile property.
     */
    public void setLocalSecurityOptionsClearVirtualMemoryPageFile(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsClearVirtualMemoryPageFile", value);
    }
    /**
     * Sets the localSecurityOptionsClientDigitallySignCommunicationsAlways property value. This security setting determines whether packet signing is required by the SMB client component.
     * @param value Value to set for the localSecurityOptionsClientDigitallySignCommunicationsAlways property.
     */
    public void setLocalSecurityOptionsClientDigitallySignCommunicationsAlways(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsClientDigitallySignCommunicationsAlways", value);
    }
    /**
     * Sets the localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers property value. If this security setting is enabled, the Server Message Block (SMB) redirector is allowed to send plaintext passwords to non-Microsoft SMB servers that do not support password encryption during authentication.
     * @param value Value to set for the localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers property.
     */
    public void setLocalSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers", value);
    }
    /**
     * Sets the localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation property value. App installations requiring elevated privileges will prompt for admin credentials.Default is enabled
     * @param value Value to set for the localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation property.
     */
    public void setLocalSecurityOptionsDetectApplicationInstallationsAndPromptForElevation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation", value);
    }
    /**
     * Sets the localSecurityOptionsDisableAdministratorAccount property value. Determines whether the Local Administrator account is enabled or disabled.
     * @param value Value to set for the localSecurityOptionsDisableAdministratorAccount property.
     */
    public void setLocalSecurityOptionsDisableAdministratorAccount(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsDisableAdministratorAccount", value);
    }
    /**
     * Sets the localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees property value. This security setting determines whether the SMB client attempts to negotiate SMB packet signing.
     * @param value Value to set for the localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees property.
     */
    public void setLocalSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees", value);
    }
    /**
     * Sets the localSecurityOptionsDisableGuestAccount property value. Determines if the Guest account is enabled or disabled.
     * @param value Value to set for the localSecurityOptionsDisableGuestAccount property.
     */
    public void setLocalSecurityOptionsDisableGuestAccount(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsDisableGuestAccount", value);
    }
    /**
     * Sets the localSecurityOptionsDisableServerDigitallySignCommunicationsAlways property value. This security setting determines whether packet signing is required by the SMB server component.
     * @param value Value to set for the localSecurityOptionsDisableServerDigitallySignCommunicationsAlways property.
     */
    public void setLocalSecurityOptionsDisableServerDigitallySignCommunicationsAlways(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsDisableServerDigitallySignCommunicationsAlways", value);
    }
    /**
     * Sets the localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees property value. This security setting determines whether the SMB server will negotiate SMB packet signing with clients that request it.
     * @param value Value to set for the localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees property.
     */
    public void setLocalSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees", value);
    }
    /**
     * Sets the localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts property value. This security setting determines what additional permissions will be granted for anonymous connections to the computer.
     * @param value Value to set for the localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts property.
     */
    public void setLocalSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts", value);
    }
    /**
     * Sets the localSecurityOptionsDoNotRequireCtrlAltDel property value. Require CTRL+ALT+DEL to be pressed before a user can log on.
     * @param value Value to set for the localSecurityOptionsDoNotRequireCtrlAltDel property.
     */
    public void setLocalSecurityOptionsDoNotRequireCtrlAltDel(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsDoNotRequireCtrlAltDel", value);
    }
    /**
     * Sets the localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange property value. This security setting determines if, at the next password change, the LAN Manager (LM) hash value for the new password is stored. Its not stored by default.
     * @param value Value to set for the localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange property.
     */
    public void setLocalSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange", value);
    }
    /**
     * Sets the localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser property value. Possible values for LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser
     * @param value Value to set for the localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser property.
     */
    public void setLocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser(@jakarta.annotation.Nullable final LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType value) {
        this.backingStore.set("localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser", value);
    }
    /**
     * Sets the localSecurityOptionsGuestAccountName property value. Define a different account name to be associated with the security identifier (SID) for the account 'Guest'.
     * @param value Value to set for the localSecurityOptionsGuestAccountName property.
     */
    public void setLocalSecurityOptionsGuestAccountName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("localSecurityOptionsGuestAccountName", value);
    }
    /**
     * Sets the localSecurityOptionsHideLastSignedInUser property value. Do not display the username of the last person who signed in on this device.
     * @param value Value to set for the localSecurityOptionsHideLastSignedInUser property.
     */
    public void setLocalSecurityOptionsHideLastSignedInUser(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsHideLastSignedInUser", value);
    }
    /**
     * Sets the localSecurityOptionsHideUsernameAtSignIn property value. Do not display the username of the person signing in to this device after credentials are entered and before the devices desktop is shown.
     * @param value Value to set for the localSecurityOptionsHideUsernameAtSignIn property.
     */
    public void setLocalSecurityOptionsHideUsernameAtSignIn(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsHideUsernameAtSignIn", value);
    }
    /**
     * Sets the localSecurityOptionsInformationDisplayedOnLockScreen property value. Possible values for LocalSecurityOptionsInformationDisplayedOnLockScreen
     * @param value Value to set for the localSecurityOptionsInformationDisplayedOnLockScreen property.
     */
    public void setLocalSecurityOptionsInformationDisplayedOnLockScreen(@jakarta.annotation.Nullable final LocalSecurityOptionsInformationDisplayedOnLockScreenType value) {
        this.backingStore.set("localSecurityOptionsInformationDisplayedOnLockScreen", value);
    }
    /**
     * Sets the localSecurityOptionsInformationShownOnLockScreen property value. Possible values for LocalSecurityOptionsInformationShownOnLockScreenType
     * @param value Value to set for the localSecurityOptionsInformationShownOnLockScreen property.
     */
    public void setLocalSecurityOptionsInformationShownOnLockScreen(@jakarta.annotation.Nullable final LocalSecurityOptionsInformationShownOnLockScreenType value) {
        this.backingStore.set("localSecurityOptionsInformationShownOnLockScreen", value);
    }
    /**
     * Sets the localSecurityOptionsLogOnMessageText property value. Set message text for users attempting to log in.
     * @param value Value to set for the localSecurityOptionsLogOnMessageText property.
     */
    public void setLocalSecurityOptionsLogOnMessageText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("localSecurityOptionsLogOnMessageText", value);
    }
    /**
     * Sets the localSecurityOptionsLogOnMessageTitle property value. Set message title for users attempting to log in.
     * @param value Value to set for the localSecurityOptionsLogOnMessageTitle property.
     */
    public void setLocalSecurityOptionsLogOnMessageTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("localSecurityOptionsLogOnMessageTitle", value);
    }
    /**
     * Sets the localSecurityOptionsMachineInactivityLimit property value. Define maximum minutes of inactivity on the interactive desktops login screen until the screen saver runs. Valid values 0 to 9999
     * @param value Value to set for the localSecurityOptionsMachineInactivityLimit property.
     */
    public void setLocalSecurityOptionsMachineInactivityLimit(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("localSecurityOptionsMachineInactivityLimit", value);
    }
    /**
     * Sets the localSecurityOptionsMachineInactivityLimitInMinutes property value. Define maximum minutes of inactivity on the interactive desktops login screen until the screen saver runs. Valid values 0 to 9999
     * @param value Value to set for the localSecurityOptionsMachineInactivityLimitInMinutes property.
     */
    public void setLocalSecurityOptionsMachineInactivityLimitInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("localSecurityOptionsMachineInactivityLimitInMinutes", value);
    }
    /**
     * Sets the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients property value. Possible values for LocalSecurityOptionsMinimumSessionSecurity
     * @param value Value to set for the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients property.
     */
    public void setLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients(@jakarta.annotation.Nullable final LocalSecurityOptionsMinimumSessionSecurity value) {
        this.backingStore.set("localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients", value);
    }
    /**
     * Sets the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers property value. Possible values for LocalSecurityOptionsMinimumSessionSecurity
     * @param value Value to set for the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers property.
     */
    public void setLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers(@jakarta.annotation.Nullable final LocalSecurityOptionsMinimumSessionSecurity value) {
        this.backingStore.set("localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers", value);
    }
    /**
     * Sets the localSecurityOptionsOnlyElevateSignedExecutables property value. Enforce PKI certification path validation for a given executable file before it is permitted to run.
     * @param value Value to set for the localSecurityOptionsOnlyElevateSignedExecutables property.
     */
    public void setLocalSecurityOptionsOnlyElevateSignedExecutables(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsOnlyElevateSignedExecutables", value);
    }
    /**
     * Sets the localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares property value. By default, this security setting restricts anonymous access to shares and pipes to the settings for named pipes that can be accessed anonymously and Shares that can be accessed anonymously
     * @param value Value to set for the localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares property.
     */
    public void setLocalSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares", value);
    }
    /**
     * Sets the localSecurityOptionsSmartCardRemovalBehavior property value. Possible values for LocalSecurityOptionsSmartCardRemovalBehaviorType
     * @param value Value to set for the localSecurityOptionsSmartCardRemovalBehavior property.
     */
    public void setLocalSecurityOptionsSmartCardRemovalBehavior(@jakarta.annotation.Nullable final LocalSecurityOptionsSmartCardRemovalBehaviorType value) {
        this.backingStore.set("localSecurityOptionsSmartCardRemovalBehavior", value);
    }
    /**
     * Sets the localSecurityOptionsStandardUserElevationPromptBehavior property value. Possible values for LocalSecurityOptionsStandardUserElevationPromptBehavior
     * @param value Value to set for the localSecurityOptionsStandardUserElevationPromptBehavior property.
     */
    public void setLocalSecurityOptionsStandardUserElevationPromptBehavior(@jakarta.annotation.Nullable final LocalSecurityOptionsStandardUserElevationPromptBehaviorType value) {
        this.backingStore.set("localSecurityOptionsStandardUserElevationPromptBehavior", value);
    }
    /**
     * Sets the localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation property value. Enable all elevation requests to go to the interactive user's desktop rather than the secure desktop. Prompt behavior policy settings for admins and standard users are used.
     * @param value Value to set for the localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation property.
     */
    public void setLocalSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation", value);
    }
    /**
     * Sets the localSecurityOptionsUseAdminApprovalMode property value. Defines whether the built-in admin account uses Admin Approval Mode or runs all apps with full admin privileges.Default is enabled
     * @param value Value to set for the localSecurityOptionsUseAdminApprovalMode property.
     */
    public void setLocalSecurityOptionsUseAdminApprovalMode(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsUseAdminApprovalMode", value);
    }
    /**
     * Sets the localSecurityOptionsUseAdminApprovalModeForAdministrators property value. Define whether Admin Approval Mode and all UAC policy settings are enabled, default is enabled
     * @param value Value to set for the localSecurityOptionsUseAdminApprovalModeForAdministrators property.
     */
    public void setLocalSecurityOptionsUseAdminApprovalModeForAdministrators(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsUseAdminApprovalModeForAdministrators", value);
    }
    /**
     * Sets the localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations property value. Virtualize file and registry write failures to per user locations
     * @param value Value to set for the localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations property.
     */
    public void setLocalSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations", value);
    }
    /**
     * Sets the smartScreenBlockOverrideForFiles property value. Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files.
     * @param value Value to set for the smartScreenBlockOverrideForFiles property.
     */
    public void setSmartScreenBlockOverrideForFiles(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smartScreenBlockOverrideForFiles", value);
    }
    /**
     * Sets the smartScreenEnableInShell property value. Allows IT Admins to configure SmartScreen for Windows.
     * @param value Value to set for the smartScreenEnableInShell property.
     */
    public void setSmartScreenEnableInShell(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("smartScreenEnableInShell", value);
    }
    /**
     * Sets the userRightsAccessCredentialManagerAsTrustedCaller property value. This user right is used by Credential Manager during Backup/Restore. Users' saved credentials might be compromised if this privilege is given to other entities. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsAccessCredentialManagerAsTrustedCaller property.
     */
    public void setUserRightsAccessCredentialManagerAsTrustedCaller(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsAccessCredentialManagerAsTrustedCaller", value);
    }
    /**
     * Sets the userRightsActAsPartOfTheOperatingSystem property value. This user right allows a process to impersonate any user without authentication. The process can therefore gain access to the same local resources as that user. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsActAsPartOfTheOperatingSystem property.
     */
    public void setUserRightsActAsPartOfTheOperatingSystem(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsActAsPartOfTheOperatingSystem", value);
    }
    /**
     * Sets the userRightsAllowAccessFromNetwork property value. This user right determines which users and groups are allowed to connect to the computer over the network. State Allowed is supported.
     * @param value Value to set for the userRightsAllowAccessFromNetwork property.
     */
    public void setUserRightsAllowAccessFromNetwork(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsAllowAccessFromNetwork", value);
    }
    /**
     * Sets the userRightsBackupData property value. This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when backing up files and directories. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsBackupData property.
     */
    public void setUserRightsBackupData(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsBackupData", value);
    }
    /**
     * Sets the userRightsBlockAccessFromNetwork property value. This user right determines which users and groups are block from connecting to the computer over the network. State Block is supported.
     * @param value Value to set for the userRightsBlockAccessFromNetwork property.
     */
    public void setUserRightsBlockAccessFromNetwork(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsBlockAccessFromNetwork", value);
    }
    /**
     * Sets the userRightsChangeSystemTime property value. This user right determines which users and groups can change the time and date on the internal clock of the computer. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsChangeSystemTime property.
     */
    public void setUserRightsChangeSystemTime(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsChangeSystemTime", value);
    }
    /**
     * Sets the userRightsCreateGlobalObjects property value. This security setting determines whether users can create global objects that are available to all sessions. Users who can create global objects could affect processes that run under other users' sessions, which could lead to application failure or data corruption. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreateGlobalObjects property.
     */
    public void setUserRightsCreateGlobalObjects(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsCreateGlobalObjects", value);
    }
    /**
     * Sets the userRightsCreatePageFile property value. This user right determines which users and groups can call an internal API to create and change the size of a page file. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreatePageFile property.
     */
    public void setUserRightsCreatePageFile(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsCreatePageFile", value);
    }
    /**
     * Sets the userRightsCreatePermanentSharedObjects property value. This user right determines which accounts can be used by processes to create a directory object using the object manager. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreatePermanentSharedObjects property.
     */
    public void setUserRightsCreatePermanentSharedObjects(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsCreatePermanentSharedObjects", value);
    }
    /**
     * Sets the userRightsCreateSymbolicLinks property value. This user right determines if the user can create a symbolic link from the computer to which they are logged on. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreateSymbolicLinks property.
     */
    public void setUserRightsCreateSymbolicLinks(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsCreateSymbolicLinks", value);
    }
    /**
     * Sets the userRightsCreateToken property value. This user right determines which users/groups can be used by processes to create a token that can then be used to get access to any local resources when the process uses an internal API to create an access token. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreateToken property.
     */
    public void setUserRightsCreateToken(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsCreateToken", value);
    }
    /**
     * Sets the userRightsDebugPrograms property value. This user right determines which users can attach a debugger to any process or to the kernel. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsDebugPrograms property.
     */
    public void setUserRightsDebugPrograms(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsDebugPrograms", value);
    }
    /**
     * Sets the userRightsDelegation property value. This user right determines which users can set the Trusted for Delegation setting on a user or computer object. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsDelegation property.
     */
    public void setUserRightsDelegation(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsDelegation", value);
    }
    /**
     * Sets the userRightsDenyLocalLogOn property value. This user right determines which users cannot log on to the computer. States NotConfigured, Blocked are supported
     * @param value Value to set for the userRightsDenyLocalLogOn property.
     */
    public void setUserRightsDenyLocalLogOn(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsDenyLocalLogOn", value);
    }
    /**
     * Sets the userRightsGenerateSecurityAudits property value. This user right determines which accounts can be used by a process to add entries to the security log. The security log is used to trace unauthorized system access.  Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsGenerateSecurityAudits property.
     */
    public void setUserRightsGenerateSecurityAudits(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsGenerateSecurityAudits", value);
    }
    /**
     * Sets the userRightsImpersonateClient property value. Assigning this user right to a user allows programs running on behalf of that user to impersonate a client. Requiring this user right for this kind of impersonation prevents an unauthorized user from convincing a client to connect to a service that they have created and then impersonating that client, which can elevate the unauthorized user's permissions to administrative or system levels. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsImpersonateClient property.
     */
    public void setUserRightsImpersonateClient(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsImpersonateClient", value);
    }
    /**
     * Sets the userRightsIncreaseSchedulingPriority property value. This user right determines which accounts can use a process with Write Property access to another process to increase the execution priority assigned to the other process. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsIncreaseSchedulingPriority property.
     */
    public void setUserRightsIncreaseSchedulingPriority(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsIncreaseSchedulingPriority", value);
    }
    /**
     * Sets the userRightsLoadUnloadDrivers property value. This user right determines which users can dynamically load and unload device drivers or other code in to kernel mode. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsLoadUnloadDrivers property.
     */
    public void setUserRightsLoadUnloadDrivers(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsLoadUnloadDrivers", value);
    }
    /**
     * Sets the userRightsLocalLogOn property value. This user right determines which users can log on to the computer. States NotConfigured, Allowed are supported
     * @param value Value to set for the userRightsLocalLogOn property.
     */
    public void setUserRightsLocalLogOn(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsLocalLogOn", value);
    }
    /**
     * Sets the userRightsLockMemory property value. This user right determines which accounts can use a process to keep data in physical memory, which prevents the system from paging the data to virtual memory on disk. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsLockMemory property.
     */
    public void setUserRightsLockMemory(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsLockMemory", value);
    }
    /**
     * Sets the userRightsManageAuditingAndSecurityLogs property value. This user right determines which users can specify object access auditing options for individual resources, such as files, Active Directory objects, and registry keys. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsManageAuditingAndSecurityLogs property.
     */
    public void setUserRightsManageAuditingAndSecurityLogs(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsManageAuditingAndSecurityLogs", value);
    }
    /**
     * Sets the userRightsManageVolumes property value. This user right determines which users and groups can run maintenance tasks on a volume, such as remote defragmentation. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsManageVolumes property.
     */
    public void setUserRightsManageVolumes(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsManageVolumes", value);
    }
    /**
     * Sets the userRightsModifyFirmwareEnvironment property value. This user right determines who can modify firmware environment values. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsModifyFirmwareEnvironment property.
     */
    public void setUserRightsModifyFirmwareEnvironment(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsModifyFirmwareEnvironment", value);
    }
    /**
     * Sets the userRightsModifyObjectLabels property value. This user right determines which user accounts can modify the integrity label of objects, such as files, registry keys, or processes owned by other users. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsModifyObjectLabels property.
     */
    public void setUserRightsModifyObjectLabels(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsModifyObjectLabels", value);
    }
    /**
     * Sets the userRightsProfileSingleProcess property value. This user right determines which users can use performance monitoring tools to monitor the performance of system processes. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsProfileSingleProcess property.
     */
    public void setUserRightsProfileSingleProcess(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsProfileSingleProcess", value);
    }
    /**
     * Sets the userRightsRemoteDesktopServicesLogOn property value. This user right determines which users and groups are prohibited from logging on as a Remote Desktop Services client. Only states NotConfigured and Blocked are supported
     * @param value Value to set for the userRightsRemoteDesktopServicesLogOn property.
     */
    public void setUserRightsRemoteDesktopServicesLogOn(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsRemoteDesktopServicesLogOn", value);
    }
    /**
     * Sets the userRightsRemoteShutdown property value. This user right determines which users are allowed to shut down a computer from a remote location on the network. Misuse of this user right can result in a denial of service. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsRemoteShutdown property.
     */
    public void setUserRightsRemoteShutdown(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsRemoteShutdown", value);
    }
    /**
     * Sets the userRightsRestoreData property value. This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when restoring backed up files and directories, and determines which users can set any valid security principal as the owner of an object. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsRestoreData property.
     */
    public void setUserRightsRestoreData(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsRestoreData", value);
    }
    /**
     * Sets the userRightsTakeOwnership property value. This user right determines which users can take ownership of any securable object in the system, including Active Directory objects, files and folders, printers, registry keys, processes, and threads. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsTakeOwnership property.
     */
    public void setUserRightsTakeOwnership(@jakarta.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.backingStore.set("userRightsTakeOwnership", value);
    }
    /**
     * Sets the windowsDefenderTamperProtection property value. Defender TamperProtection setting options
     * @param value Value to set for the windowsDefenderTamperProtection property.
     */
    public void setWindowsDefenderTamperProtection(@jakarta.annotation.Nullable final WindowsDefenderTamperProtectionOptions value) {
        this.backingStore.set("windowsDefenderTamperProtection", value);
    }
    /**
     * Sets the xboxServicesAccessoryManagementServiceStartupMode property value. Possible values of xbox service start type
     * @param value Value to set for the xboxServicesAccessoryManagementServiceStartupMode property.
     */
    public void setXboxServicesAccessoryManagementServiceStartupMode(@jakarta.annotation.Nullable final ServiceStartType value) {
        this.backingStore.set("xboxServicesAccessoryManagementServiceStartupMode", value);
    }
    /**
     * Sets the xboxServicesEnableXboxGameSaveTask property value. This setting determines whether xbox game save is enabled (1) or disabled (0).
     * @param value Value to set for the xboxServicesEnableXboxGameSaveTask property.
     */
    public void setXboxServicesEnableXboxGameSaveTask(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("xboxServicesEnableXboxGameSaveTask", value);
    }
    /**
     * Sets the xboxServicesLiveAuthManagerServiceStartupMode property value. Possible values of xbox service start type
     * @param value Value to set for the xboxServicesLiveAuthManagerServiceStartupMode property.
     */
    public void setXboxServicesLiveAuthManagerServiceStartupMode(@jakarta.annotation.Nullable final ServiceStartType value) {
        this.backingStore.set("xboxServicesLiveAuthManagerServiceStartupMode", value);
    }
    /**
     * Sets the xboxServicesLiveGameSaveServiceStartupMode property value. Possible values of xbox service start type
     * @param value Value to set for the xboxServicesLiveGameSaveServiceStartupMode property.
     */
    public void setXboxServicesLiveGameSaveServiceStartupMode(@jakarta.annotation.Nullable final ServiceStartType value) {
        this.backingStore.set("xboxServicesLiveGameSaveServiceStartupMode", value);
    }
    /**
     * Sets the xboxServicesLiveNetworkingServiceStartupMode property value. Possible values of xbox service start type
     * @param value Value to set for the xboxServicesLiveNetworkingServiceStartupMode property.
     */
    public void setXboxServicesLiveNetworkingServiceStartupMode(@jakarta.annotation.Nullable final ServiceStartType value) {
        this.backingStore.set("xboxServicesLiveNetworkingServiceStartupMode", value);
    }
}
