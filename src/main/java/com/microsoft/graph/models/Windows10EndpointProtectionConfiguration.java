package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10EndpointProtectionConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Gets or sets whether applications inside Microsoft Defender Application Guard can access the devices camera and microphone.
     */
    private Boolean applicationGuardAllowCameraMicrophoneRedirection;
    /**
     * Allow users to download files from Edge in the application guard container and save them on the host file system
     */
    private Boolean applicationGuardAllowFileSaveOnHost;
    /**
     * Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)
     */
    private Boolean applicationGuardAllowPersistence;
    /**
     * Allow printing to Local Printers from Container
     */
    private Boolean applicationGuardAllowPrintToLocalPrinters;
    /**
     * Allow printing to Network Printers from Container
     */
    private Boolean applicationGuardAllowPrintToNetworkPrinters;
    /**
     * Allow printing to PDF from Container
     */
    private Boolean applicationGuardAllowPrintToPDF;
    /**
     * Allow printing to XPS from Container
     */
    private Boolean applicationGuardAllowPrintToXPS;
    /**
     * Allow application guard to use virtual GPU
     */
    private Boolean applicationGuardAllowVirtualGPU;
    /**
     * Possible values for applicationGuardBlockClipboardSharingType
     */
    private ApplicationGuardBlockClipboardSharingType applicationGuardBlockClipboardSharing;
    /**
     * Possible values for applicationGuardBlockFileTransfer
     */
    private ApplicationGuardBlockFileTransferType applicationGuardBlockFileTransfer;
    /**
     * Block enterprise sites to load non-enterprise content, such as third party plug-ins
     */
    private Boolean applicationGuardBlockNonEnterpriseContent;
    /**
     * Allows certain device level Root Certificates to be shared with the Microsoft Defender Application Guard container.
     */
    private java.util.List<String> applicationGuardCertificateThumbprints;
    /**
     * Enable Windows Defender Application Guard
     */
    private Boolean applicationGuardEnabled;
    /**
     * Possible values for ApplicationGuardEnabledOptions
     */
    private ApplicationGuardEnabledOptions applicationGuardEnabledOptions;
    /**
     * Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.)
     */
    private Boolean applicationGuardForceAuditing;
    /**
     * Possible values of AppLocker Application Control Types
     */
    private AppLockerApplicationControlType appLockerApplicationControl;
    /**
     * Allows the admin to allow standard users to enable encrpytion during Azure AD Join.
     */
    private Boolean bitLockerAllowStandardUserEncryption;
    /**
     * Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
     */
    private Boolean bitLockerDisableWarningForOtherDiskEncryption;
    /**
     * Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
     */
    private Boolean bitLockerEnableStorageCardEncryptionOnMobile;
    /**
     * Allows the admin to require encryption to be turned on using BitLocker.
     */
    private Boolean bitLockerEncryptDevice;
    /**
     * BitLocker Fixed Drive Policy.
     */
    private BitLockerFixedDrivePolicy bitLockerFixedDrivePolicy;
    /**
     * BitLocker recovery password rotation type
     */
    private BitLockerRecoveryPasswordRotationType bitLockerRecoveryPasswordRotation;
    /**
     * BitLocker Removable Drive Policy.
     */
    private BitLockerRemovableDrivePolicy bitLockerRemovableDrivePolicy;
    /**
     * BitLocker System Drive Policy.
     */
    private BitLockerSystemDrivePolicy bitLockerSystemDrivePolicy;
    /**
     * List of folder paths to be added to the list of protected folders
     */
    private java.util.List<String> defenderAdditionalGuardedFolders;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderAdobeReaderLaunchChildProcess;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderAdvancedRansomewareProtectionType;
    /**
     * Allows or disallows Windows Defender Behavior Monitoring functionality.
     */
    private Boolean defenderAllowBehaviorMonitoring;
    /**
     * To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.
     */
    private Boolean defenderAllowCloudProtection;
    /**
     * Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.
     */
    private Boolean defenderAllowEndUserAccess;
    /**
     * Allows or disallows Windows Defender Intrusion Prevention functionality.
     */
    private Boolean defenderAllowIntrusionPreventionSystem;
    /**
     * Allows or disallows Windows Defender On Access Protection functionality.
     */
    private Boolean defenderAllowOnAccessProtection;
    /**
     * Allows or disallows Windows Defender Realtime Monitoring functionality.
     */
    private Boolean defenderAllowRealTimeMonitoring;
    /**
     * Allows or disallows scanning of archives.
     */
    private Boolean defenderAllowScanArchiveFiles;
    /**
     * Allows or disallows Windows Defender IOAVP Protection functionality.
     */
    private Boolean defenderAllowScanDownloads;
    /**
     * Allows or disallows a scanning of network files.
     */
    private Boolean defenderAllowScanNetworkFiles;
    /**
     * Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.
     */
    private Boolean defenderAllowScanRemovableDrivesDuringFullScan;
    /**
     * Allows or disallows Windows Defender Script Scanning functionality.
     */
    private Boolean defenderAllowScanScriptsLoadedInInternetExplorer;
    /**
     * List of exe files and folders to be excluded from attack surface reduction rules
     */
    private java.util.List<String> defenderAttackSurfaceReductionExcludedPaths;
    /**
     * Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.
     */
    private Boolean defenderBlockEndUserAccess;
    /**
     * Possible values of Defender Attack Surface Reduction Rules
     */
    private DefenderAttackSurfaceType defenderBlockPersistenceThroughWmiType;
    /**
     * This policy setting allows you to manage whether a check for new virus and spyware definitions will occur before running a scan.
     */
    private Boolean defenderCheckForSignaturesBeforeRunningScan;
    /**
     * Added in Windows 10, version 1709. This policy setting determines how aggressive Windows Defender Antivirus will be in blocking and scanning suspicious files. Value type is integer. This feature requires the 'Join Microsoft MAPS' setting enabled in order to function. Possible values are: notConfigured, high, highPlus, zeroTolerance.
     */
    private DefenderCloudBlockLevelType defenderCloudBlockLevel;
    /**
     * Added in Windows 10, version 1709. This feature allows Windows Defender Antivirus to block a suspicious file for up to 60 seconds, and scan it in the cloud to make sure it's safe. Value type is integer, range is 0 - 50. This feature depends on three other MAPS settings the must all be enabled- 'Configure the 'Block at First Sight' feature; 'Join Microsoft MAPS'; 'Send file samples when further analysis is required'. Valid values 0 to 50
     */
    private Integer defenderCloudExtendedTimeoutInSeconds;
    /**
     * Time period (in days) that quarantine items will be stored on the system. Valid values 0 to 90
     */
    private Integer defenderDaysBeforeDeletingQuarantinedMalware;
    /**
     * Allows an administrator to specify any valid threat severity levels and the corresponding default action ID to take.
     */
    private DefenderDetectedMalwareActions defenderDetectedMalwareActions;
    /**
     * Allows or disallows Windows Defender Behavior Monitoring functionality.
     */
    private Boolean defenderDisableBehaviorMonitoring;
    /**
     * This policy setting allows you to configure catch-up scans for scheduled full scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.
     */
    private Boolean defenderDisableCatchupFullScan;
    /**
     * This policy setting allows you to configure catch-up scans for scheduled quick scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.
     */
    private Boolean defenderDisableCatchupQuickScan;
    /**
     * To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.
     */
    private Boolean defenderDisableCloudProtection;
    /**
     * Allows or disallows Windows Defender Intrusion Prevention functionality.
     */
    private Boolean defenderDisableIntrusionPreventionSystem;
    /**
     * Allows or disallows Windows Defender On Access Protection functionality.
     */
    private Boolean defenderDisableOnAccessProtection;
    /**
     * Allows or disallows Windows Defender Realtime Monitoring functionality.
     */
    private Boolean defenderDisableRealTimeMonitoring;
    /**
     * Allows or disallows scanning of archives.
     */
    private Boolean defenderDisableScanArchiveFiles;
    /**
     * Allows or disallows Windows Defender IOAVP Protection functionality.
     */
    private Boolean defenderDisableScanDownloads;
    /**
     * Allows or disallows a scanning of network files.
     */
    private Boolean defenderDisableScanNetworkFiles;
    /**
     * Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.
     */
    private Boolean defenderDisableScanRemovableDrivesDuringFullScan;
    /**
     * Allows or disallows Windows Defender Script Scanning functionality.
     */
    private Boolean defenderDisableScanScriptsLoadedInInternetExplorer;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderEmailContentExecution;
    /**
     * Possible values of Defender Attack Surface Reduction Rules
     */
    private DefenderAttackSurfaceType defenderEmailContentExecutionType;
    /**
     * This policy setting allows you to enable or disable low CPU priority for scheduled scans.
     */
    private Boolean defenderEnableLowCpuPriority;
    /**
     * Allows or disallows scanning of email.
     */
    private Boolean defenderEnableScanIncomingMail;
    /**
     * Allows or disallows a full scan of mapped network drives.
     */
    private Boolean defenderEnableScanMappedNetworkDrivesDuringFullScan;
    /**
     * Xml content containing information regarding exploit protection details.
     */
    private byte[] defenderExploitProtectionXml;
    /**
     * Name of the file from which DefenderExploitProtectionXml was obtained.
     */
    private String defenderExploitProtectionXmlFileName;
    /**
     * File extensions to exclude from scans and real time protection.
     */
    private java.util.List<String> defenderFileExtensionsToExclude;
    /**
     * Files and folder to exclude from scans and real time protection.
     */
    private java.util.List<String> defenderFilesAndFoldersToExclude;
    /**
     * List of paths to exe that are allowed to access protected folders
     */
    private java.util.List<String> defenderGuardedFoldersAllowedAppPaths;
    /**
     * Possible values of Folder Protection
     */
    private FolderProtectionType defenderGuardMyFoldersType;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderNetworkProtectionType;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderOfficeAppsExecutableContentCreationOrLaunch;
    /**
     * Possible values of Defender Attack Surface Reduction Rules
     */
    private DefenderAttackSurfaceType defenderOfficeAppsExecutableContentCreationOrLaunchType;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderOfficeAppsLaunchChildProcess;
    /**
     * Possible values of Defender Attack Surface Reduction Rules
     */
    private DefenderAttackSurfaceType defenderOfficeAppsLaunchChildProcessType;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderOfficeAppsOtherProcessInjection;
    /**
     * Possible values of Defender Attack Surface Reduction Rules
     */
    private DefenderAttackSurfaceType defenderOfficeAppsOtherProcessInjectionType;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderOfficeCommunicationAppsLaunchChildProcess;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderOfficeMacroCodeAllowWin32Imports;
    /**
     * Possible values of Defender Attack Surface Reduction Rules
     */
    private DefenderAttackSurfaceType defenderOfficeMacroCodeAllowWin32ImportsType;
    /**
     * Added in Windows 10, version 1607. Specifies the level of detection for potentially unwanted applications (PUAs). Windows Defender alerts you when potentially unwanted software is being downloaded or attempts to install itself on your computer. Possible values are: userDefined, enable, auditMode, warn, notConfigured.
     */
    private DefenderProtectionType defenderPotentiallyUnwantedAppAction;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderPreventCredentialStealingType;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderProcessCreation;
    /**
     * Possible values of Defender Attack Surface Reduction Rules
     */
    private DefenderAttackSurfaceType defenderProcessCreationType;
    /**
     * Processes to exclude from scans and real time protection.
     */
    private java.util.List<String> defenderProcessesToExclude;
    /**
     * Controls which sets of files should be monitored. Possible values are: monitorAllFiles, monitorIncomingFilesOnly, monitorOutgoingFilesOnly.
     */
    private DefenderRealtimeScanDirection defenderScanDirection;
    /**
     * Represents the average CPU load factor for the Windows Defender scan (in percent). The default value is 50. Valid values 0 to 100
     */
    private Integer defenderScanMaxCpuPercentage;
    /**
     * Selects whether to perform a quick scan or full scan. Possible values are: userDefined, disabled, quick, full.
     */
    private DefenderScanType defenderScanType;
    /**
     * Selects the time of day that the Windows Defender quick scan should run. For example, a value of 0=12:00AM, a value of 60=1:00AM, a value of 120=2:00, and so on, up to a value of 1380=11:00PM. The default value is 120
     */
    private LocalTime defenderScheduledQuickScanTime;
    /**
     * Selects the day that the Windows Defender scan should run. Possible values are: userDefined, everyday, sunday, monday, tuesday, wednesday, thursday, friday, saturday, noScheduledScan.
     */
    private WeeklySchedule defenderScheduledScanDay;
    /**
     * Selects the time of day that the Windows Defender scan should run.
     */
    private LocalTime defenderScheduledScanTime;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderScriptDownloadedPayloadExecution;
    /**
     * Possible values of Defender Attack Surface Reduction Rules
     */
    private DefenderAttackSurfaceType defenderScriptDownloadedPayloadExecutionType;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderScriptObfuscatedMacroCode;
    /**
     * Possible values of Defender Attack Surface Reduction Rules
     */
    private DefenderAttackSurfaceType defenderScriptObfuscatedMacroCodeType;
    /**
     * Indicates whether or not to block user from overriding Exploit Protection settings.
     */
    private Boolean defenderSecurityCenterBlockExploitProtectionOverride;
    /**
     * Used to disable the display of the account protection area.
     */
    private Boolean defenderSecurityCenterDisableAccountUI;
    /**
     * Used to disable the display of the app and browser protection area.
     */
    private Boolean defenderSecurityCenterDisableAppBrowserUI;
    /**
     * Used to disable the display of the Clear TPM button.
     */
    private Boolean defenderSecurityCenterDisableClearTpmUI;
    /**
     * Used to disable the display of the family options area.
     */
    private Boolean defenderSecurityCenterDisableFamilyUI;
    /**
     * Used to disable the display of the hardware protection area.
     */
    private Boolean defenderSecurityCenterDisableHardwareUI;
    /**
     * Used to disable the display of the device performance and health area.
     */
    private Boolean defenderSecurityCenterDisableHealthUI;
    /**
     * Used to disable the display of the firewall and network protection area.
     */
    private Boolean defenderSecurityCenterDisableNetworkUI;
    /**
     * Used to disable the display of the notification area control. The user needs to either sign out and sign in or reboot the computer for this setting to take effect.
     */
    private Boolean defenderSecurityCenterDisableNotificationAreaUI;
    /**
     * Used to disable the display of the ransomware protection area.
     */
    private Boolean defenderSecurityCenterDisableRansomwareUI;
    /**
     * Used to disable the display of the secure boot area under Device security.
     */
    private Boolean defenderSecurityCenterDisableSecureBootUI;
    /**
     * Used to disable the display of the security process troubleshooting under Device security.
     */
    private Boolean defenderSecurityCenterDisableTroubleshootingUI;
    /**
     * Used to disable the display of the virus and threat protection area.
     */
    private Boolean defenderSecurityCenterDisableVirusUI;
    /**
     * Used to disable the display of update TPM Firmware when a vulnerable firmware is detected.
     */
    private Boolean defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI;
    /**
     * The email address that is displayed to users.
     */
    private String defenderSecurityCenterHelpEmail;
    /**
     * The phone number or Skype ID that is displayed to users.
     */
    private String defenderSecurityCenterHelpPhone;
    /**
     * The help portal URL this is displayed to users.
     */
    private String defenderSecurityCenterHelpURL;
    /**
     * Possible values for defenderSecurityCenterITContactDisplay
     */
    private DefenderSecurityCenterITContactDisplayType defenderSecurityCenterITContactDisplay;
    /**
     * Possible values for defenderSecurityCenterNotificationsFromApp
     */
    private DefenderSecurityCenterNotificationsFromAppType defenderSecurityCenterNotificationsFromApp;
    /**
     * The company name that is displayed to the users.
     */
    private String defenderSecurityCenterOrganizationDisplayName;
    /**
     * Specifies the interval (in hours) that will be used to check for signatures, so instead of using the ScheduleDay and ScheduleTime the check for new signatures will be set according to the interval. Valid values 0 to 24
     */
    private Integer defenderSignatureUpdateIntervalInHours;
    /**
     * Checks for the user consent level in Windows Defender to send data. Possible values are: sendSafeSamplesAutomatically, alwaysPrompt, neverSend, sendAllSamplesAutomatically.
     */
    private DefenderSubmitSamplesConsentType defenderSubmitSamplesConsentType;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderUntrustedExecutable;
    /**
     * Possible values of Defender Attack Surface Reduction Rules
     */
    private DefenderAttackSurfaceType defenderUntrustedExecutableType;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderUntrustedUSBProcess;
    /**
     * Possible values of Defender Attack Surface Reduction Rules
     */
    private DefenderAttackSurfaceType defenderUntrustedUSBProcessType;
    /**
     * This property will be deprecated in May 2019 and will be replaced with property DeviceGuardSecureBootWithDMA. Specifies whether Platform Security Level is enabled at next reboot.
     */
    private Boolean deviceGuardEnableSecureBootWithDMA;
    /**
     * Turns On Virtualization Based Security(VBS).
     */
    private Boolean deviceGuardEnableVirtualizationBasedSecurity;
    /**
     * Possible values of a property
     */
    private Enablement deviceGuardLaunchSystemGuard;
    /**
     * Possible values of Credential Guard settings.
     */
    private DeviceGuardLocalSystemAuthorityCredentialGuardType deviceGuardLocalSystemAuthorityCredentialGuardSettings;
    /**
     * Possible values of Secure Boot with DMA
     */
    private SecureBootWithDMAType deviceGuardSecureBootWithDMA;
    /**
     * Possible values of the DmaGuardDeviceEnumerationPolicy.
     */
    private DmaGuardDeviceEnumerationPolicyType dmaGuardDeviceEnumerationPolicy;
    /**
     * Blocks stateful FTP connections to the device
     */
    private Boolean firewallBlockStatefulFTP;
    /**
     * Possible values for firewallCertificateRevocationListCheckMethod
     */
    private FirewallCertificateRevocationListCheckMethodType firewallCertificateRevocationListCheckMethod;
    /**
     * Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600
     */
    private Integer firewallIdleTimeoutForSecurityAssociationInSeconds;
    /**
     * Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
     */
    private Boolean firewallIPSecExemptionsAllowDHCP;
    /**
     * Configures IPSec exemptions to allow ICMP
     */
    private Boolean firewallIPSecExemptionsAllowICMP;
    /**
     * Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
     */
    private Boolean firewallIPSecExemptionsAllowNeighborDiscovery;
    /**
     * Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
     */
    private Boolean firewallIPSecExemptionsAllowRouterDiscovery;
    /**
     * Configures IPSec exemptions to no exemptions
     */
    private Boolean firewallIPSecExemptionsNone;
    /**
     * If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set
     */
    private Boolean firewallMergeKeyingModuleSettings;
    /**
     * Possible values for firewallPacketQueueingMethod
     */
    private FirewallPacketQueueingMethodType firewallPacketQueueingMethod;
    /**
     * Possible values for firewallPreSharedKeyEncodingMethod
     */
    private FirewallPreSharedKeyEncodingMethodType firewallPreSharedKeyEncodingMethod;
    /**
     * Configures the firewall profile settings for domain networks
     */
    private WindowsFirewallNetworkProfile firewallProfileDomain;
    /**
     * Configures the firewall profile settings for private networks
     */
    private WindowsFirewallNetworkProfile firewallProfilePrivate;
    /**
     * Configures the firewall profile settings for public networks
     */
    private WindowsFirewallNetworkProfile firewallProfilePublic;
    /**
     * Configures the firewall rule settings. This collection can contain a maximum of 150 elements.
     */
    private java.util.List<WindowsFirewallRule> firewallRules;
    /**
     * Possible values for LanManagerAuthenticationLevel
     */
    private LanManagerAuthenticationLevel lanManagerAuthenticationLevel;
    /**
     * If enabled,the SMB client will allow insecure guest logons. If not configured, the SMB client will reject insecure guest logons.
     */
    private Boolean lanManagerWorkstationDisableInsecureGuestLogons;
    /**
     * Define a different account name to be associated with the security identifier (SID) for the account 'Administrator'.
     */
    private String localSecurityOptionsAdministratorAccountName;
    /**
     * Possible values for LocalSecurityOptionsAdministratorElevationPromptBehavior
     */
    private LocalSecurityOptionsAdministratorElevationPromptBehaviorType localSecurityOptionsAdministratorElevationPromptBehavior;
    /**
     * This security setting determines whether to allows anonymous users to perform certain activities, such as enumerating the names of domain accounts and network shares.
     */
    private Boolean localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares;
    /**
     * Block PKU2U authentication requests to this device to use online identities.
     */
    private Boolean localSecurityOptionsAllowPKU2UAuthenticationRequests;
    /**
     * Edit the default Security Descriptor Definition Language string to allow or deny users and groups to make remote calls to the SAM.
     */
    private String localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager;
    /**
     * UI helper boolean for LocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager entity
     */
    private Boolean localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool;
    /**
     * This security setting determines whether a computer can be shut down without having to log on to Windows.
     */
    private Boolean localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn;
    /**
     * Allow UIAccess apps to prompt for elevation without using the secure desktop.
     */
    private Boolean localSecurityOptionsAllowUIAccessApplicationElevation;
    /**
     * Allow UIAccess apps to prompt for elevation without using the secure desktop.Default is enabled
     */
    private Boolean localSecurityOptionsAllowUIAccessApplicationsForSecureLocations;
    /**
     * Prevent a portable computer from being undocked without having to log in.
     */
    private Boolean localSecurityOptionsAllowUndockWithoutHavingToLogon;
    /**
     * Prevent users from adding new Microsoft accounts to this computer.
     */
    private Boolean localSecurityOptionsBlockMicrosoftAccounts;
    /**
     * Enable Local accounts that are not password protected to log on from locations other than the physical device.Default is enabled
     */
    private Boolean localSecurityOptionsBlockRemoteLogonWithBlankPassword;
    /**
     * Enabling this settings allows only interactively logged on user to access CD-ROM media.
     */
    private Boolean localSecurityOptionsBlockRemoteOpticalDriveAccess;
    /**
     * Restrict installing printer drivers as part of connecting to a shared printer to admins only.
     */
    private Boolean localSecurityOptionsBlockUsersInstallingPrinterDrivers;
    /**
     * This security setting determines whether the virtual memory pagefile is cleared when the system is shut down.
     */
    private Boolean localSecurityOptionsClearVirtualMemoryPageFile;
    /**
     * This security setting determines whether packet signing is required by the SMB client component.
     */
    private Boolean localSecurityOptionsClientDigitallySignCommunicationsAlways;
    /**
     * If this security setting is enabled, the Server Message Block (SMB) redirector is allowed to send plaintext passwords to non-Microsoft SMB servers that do not support password encryption during authentication.
     */
    private Boolean localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers;
    /**
     * App installations requiring elevated privileges will prompt for admin credentials.Default is enabled
     */
    private Boolean localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation;
    /**
     * Determines whether the Local Administrator account is enabled or disabled.
     */
    private Boolean localSecurityOptionsDisableAdministratorAccount;
    /**
     * This security setting determines whether the SMB client attempts to negotiate SMB packet signing.
     */
    private Boolean localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees;
    /**
     * Determines if the Guest account is enabled or disabled.
     */
    private Boolean localSecurityOptionsDisableGuestAccount;
    /**
     * This security setting determines whether packet signing is required by the SMB server component.
     */
    private Boolean localSecurityOptionsDisableServerDigitallySignCommunicationsAlways;
    /**
     * This security setting determines whether the SMB server will negotiate SMB packet signing with clients that request it.
     */
    private Boolean localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees;
    /**
     * This security setting determines what additional permissions will be granted for anonymous connections to the computer.
     */
    private Boolean localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts;
    /**
     * Require CTRL+ALT+DEL to be pressed before a user can log on.
     */
    private Boolean localSecurityOptionsDoNotRequireCtrlAltDel;
    /**
     * This security setting determines if, at the next password change, the LAN Manager (LM) hash value for the new password is stored. Its not stored by default.
     */
    private Boolean localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange;
    /**
     * Possible values for LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser
     */
    private LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser;
    /**
     * Define a different account name to be associated with the security identifier (SID) for the account 'Guest'.
     */
    private String localSecurityOptionsGuestAccountName;
    /**
     * Do not display the username of the last person who signed in on this device.
     */
    private Boolean localSecurityOptionsHideLastSignedInUser;
    /**
     * Do not display the username of the person signing in to this device after credentials are entered and before the devices desktop is shown.
     */
    private Boolean localSecurityOptionsHideUsernameAtSignIn;
    /**
     * Possible values for LocalSecurityOptionsInformationDisplayedOnLockScreen
     */
    private LocalSecurityOptionsInformationDisplayedOnLockScreenType localSecurityOptionsInformationDisplayedOnLockScreen;
    /**
     * Possible values for LocalSecurityOptionsInformationShownOnLockScreenType
     */
    private LocalSecurityOptionsInformationShownOnLockScreenType localSecurityOptionsInformationShownOnLockScreen;
    /**
     * Set message text for users attempting to log in.
     */
    private String localSecurityOptionsLogOnMessageText;
    /**
     * Set message title for users attempting to log in.
     */
    private String localSecurityOptionsLogOnMessageTitle;
    /**
     * Define maximum minutes of inactivity on the interactive desktops login screen until the screen saver runs. Valid values 0 to 9999
     */
    private Integer localSecurityOptionsMachineInactivityLimit;
    /**
     * Define maximum minutes of inactivity on the interactive desktops login screen until the screen saver runs. Valid values 0 to 9999
     */
    private Integer localSecurityOptionsMachineInactivityLimitInMinutes;
    /**
     * Possible values for LocalSecurityOptionsMinimumSessionSecurity
     */
    private LocalSecurityOptionsMinimumSessionSecurity localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients;
    /**
     * Possible values for LocalSecurityOptionsMinimumSessionSecurity
     */
    private LocalSecurityOptionsMinimumSessionSecurity localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers;
    /**
     * Enforce PKI certification path validation for a given executable file before it is permitted to run.
     */
    private Boolean localSecurityOptionsOnlyElevateSignedExecutables;
    /**
     * By default, this security setting restricts anonymous access to shares and pipes to the settings for named pipes that can be accessed anonymously and Shares that can be accessed anonymously
     */
    private Boolean localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares;
    /**
     * Possible values for LocalSecurityOptionsSmartCardRemovalBehaviorType
     */
    private LocalSecurityOptionsSmartCardRemovalBehaviorType localSecurityOptionsSmartCardRemovalBehavior;
    /**
     * Possible values for LocalSecurityOptionsStandardUserElevationPromptBehavior
     */
    private LocalSecurityOptionsStandardUserElevationPromptBehaviorType localSecurityOptionsStandardUserElevationPromptBehavior;
    /**
     * Enable all elevation requests to go to the interactive user's desktop rather than the secure desktop. Prompt behavior policy settings for admins and standard users are used.
     */
    private Boolean localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation;
    /**
     * Defines whether the built-in admin account uses Admin Approval Mode or runs all apps with full admin privileges.Default is enabled
     */
    private Boolean localSecurityOptionsUseAdminApprovalMode;
    /**
     * Define whether Admin Approval Mode and all UAC policy settings are enabled, default is enabled
     */
    private Boolean localSecurityOptionsUseAdminApprovalModeForAdministrators;
    /**
     * Virtualize file and registry write failures to per user locations
     */
    private Boolean localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations;
    /**
     * Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files.
     */
    private Boolean smartScreenBlockOverrideForFiles;
    /**
     * Allows IT Admins to configure SmartScreen for Windows.
     */
    private Boolean smartScreenEnableInShell;
    /**
     * This user right is used by Credential Manager during Backup/Restore. Users' saved credentials might be compromised if this privilege is given to other entities. Only states NotConfigured and Allowed are supported
     */
    private DeviceManagementUserRightsSetting userRightsAccessCredentialManagerAsTrustedCaller;
    /**
     * This user right allows a process to impersonate any user without authentication. The process can therefore gain access to the same local resources as that user. Only states NotConfigured and Allowed are supported
     */
    private DeviceManagementUserRightsSetting userRightsActAsPartOfTheOperatingSystem;
    /**
     * This user right determines which users and groups are allowed to connect to the computer over the network. State Allowed is supported.
     */
    private DeviceManagementUserRightsSetting userRightsAllowAccessFromNetwork;
    /**
     * This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when backing up files and directories. Only states NotConfigured and Allowed are supported
     */
    private DeviceManagementUserRightsSetting userRightsBackupData;
    /**
     * This user right determines which users and groups are block from connecting to the computer over the network. State Block is supported.
     */
    private DeviceManagementUserRightsSetting userRightsBlockAccessFromNetwork;
    /**
     * This user right determines which users and groups can change the time and date on the internal clock of the computer. Only states NotConfigured and Allowed are supported
     */
    private DeviceManagementUserRightsSetting userRightsChangeSystemTime;
    /**
     * This security setting determines whether users can create global objects that are available to all sessions. Users who can create global objects could affect processes that run under other users' sessions, which could lead to application failure or data corruption. Only states NotConfigured and Allowed are supported
     */
    private DeviceManagementUserRightsSetting userRightsCreateGlobalObjects;
    /**
     * This user right determines which users and groups can call an internal API to create and change the size of a page file. Only states NotConfigured and Allowed are supported
     */
    private DeviceManagementUserRightsSetting userRightsCreatePageFile;
    /**
     * This user right determines which accounts can be used by processes to create a directory object using the object manager. Only states NotConfigured and Allowed are supported
     */
    private DeviceManagementUserRightsSetting userRightsCreatePermanentSharedObjects;
    /**
     * This user right determines if the user can create a symbolic link from the computer to which they are logged on. Only states NotConfigured and Allowed are supported
     */
    private DeviceManagementUserRightsSetting userRightsCreateSymbolicLinks;
    /**
     * This user right determines which users/groups can be used by processes to create a token that can then be used to get access to any local resources when the process uses an internal API to create an access token. Only states NotConfigured and Allowed are supported
     */
    private DeviceManagementUserRightsSetting userRightsCreateToken;
    /**
     * This user right determines which users can attach a debugger to any process or to the kernel. Only states NotConfigured and Allowed are supported
     */
    private DeviceManagementUserRightsSetting userRightsDebugPrograms;
    /**
     * This user right determines which users can set the Trusted for Delegation setting on a user or computer object. Only states NotConfigured and Allowed are supported.
     */
    private DeviceManagementUserRightsSetting userRightsDelegation;
    /**
     * This user right determines which users cannot log on to the computer. States NotConfigured, Blocked are supported
     */
    private DeviceManagementUserRightsSetting userRightsDenyLocalLogOn;
    /**
     * This user right determines which accounts can be used by a process to add entries to the security log. The security log is used to trace unauthorized system access.  Only states NotConfigured and Allowed are supported.
     */
    private DeviceManagementUserRightsSetting userRightsGenerateSecurityAudits;
    /**
     * Assigning this user right to a user allows programs running on behalf of that user to impersonate a client. Requiring this user right for this kind of impersonation prevents an unauthorized user from convincing a client to connect to a service that they have created and then impersonating that client, which can elevate the unauthorized user's permissions to administrative or system levels. Only states NotConfigured and Allowed are supported.
     */
    private DeviceManagementUserRightsSetting userRightsImpersonateClient;
    /**
     * This user right determines which accounts can use a process with Write Property access to another process to increase the execution priority assigned to the other process. Only states NotConfigured and Allowed are supported.
     */
    private DeviceManagementUserRightsSetting userRightsIncreaseSchedulingPriority;
    /**
     * This user right determines which users can dynamically load and unload device drivers or other code in to kernel mode. Only states NotConfigured and Allowed are supported.
     */
    private DeviceManagementUserRightsSetting userRightsLoadUnloadDrivers;
    /**
     * This user right determines which users can log on to the computer. States NotConfigured, Allowed are supported
     */
    private DeviceManagementUserRightsSetting userRightsLocalLogOn;
    /**
     * This user right determines which accounts can use a process to keep data in physical memory, which prevents the system from paging the data to virtual memory on disk. Only states NotConfigured and Allowed are supported.
     */
    private DeviceManagementUserRightsSetting userRightsLockMemory;
    /**
     * This user right determines which users can specify object access auditing options for individual resources, such as files, Active Directory objects, and registry keys. Only states NotConfigured and Allowed are supported.
     */
    private DeviceManagementUserRightsSetting userRightsManageAuditingAndSecurityLogs;
    /**
     * This user right determines which users and groups can run maintenance tasks on a volume, such as remote defragmentation. Only states NotConfigured and Allowed are supported.
     */
    private DeviceManagementUserRightsSetting userRightsManageVolumes;
    /**
     * This user right determines who can modify firmware environment values. Only states NotConfigured and Allowed are supported.
     */
    private DeviceManagementUserRightsSetting userRightsModifyFirmwareEnvironment;
    /**
     * This user right determines which user accounts can modify the integrity label of objects, such as files, registry keys, or processes owned by other users. Only states NotConfigured and Allowed are supported.
     */
    private DeviceManagementUserRightsSetting userRightsModifyObjectLabels;
    /**
     * This user right determines which users can use performance monitoring tools to monitor the performance of system processes. Only states NotConfigured and Allowed are supported.
     */
    private DeviceManagementUserRightsSetting userRightsProfileSingleProcess;
    /**
     * This user right determines which users and groups are prohibited from logging on as a Remote Desktop Services client. Only states NotConfigured and Blocked are supported
     */
    private DeviceManagementUserRightsSetting userRightsRemoteDesktopServicesLogOn;
    /**
     * This user right determines which users are allowed to shut down a computer from a remote location on the network. Misuse of this user right can result in a denial of service. Only states NotConfigured and Allowed are supported.
     */
    private DeviceManagementUserRightsSetting userRightsRemoteShutdown;
    /**
     * This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when restoring backed up files and directories, and determines which users can set any valid security principal as the owner of an object. Only states NotConfigured and Allowed are supported.
     */
    private DeviceManagementUserRightsSetting userRightsRestoreData;
    /**
     * This user right determines which users can take ownership of any securable object in the system, including Active Directory objects, files and folders, printers, registry keys, processes, and threads. Only states NotConfigured and Allowed are supported.
     */
    private DeviceManagementUserRightsSetting userRightsTakeOwnership;
    /**
     * Defender TamperProtection setting options
     */
    private WindowsDefenderTamperProtectionOptions windowsDefenderTamperProtection;
    /**
     * Possible values of xbox service start type
     */
    private ServiceStartType xboxServicesAccessoryManagementServiceStartupMode;
    /**
     * This setting determines whether xbox game save is enabled (1) or disabled (0).
     */
    private Boolean xboxServicesEnableXboxGameSaveTask;
    /**
     * Possible values of xbox service start type
     */
    private ServiceStartType xboxServicesLiveAuthManagerServiceStartupMode;
    /**
     * Possible values of xbox service start type
     */
    private ServiceStartType xboxServicesLiveGameSaveServiceStartupMode;
    /**
     * Possible values of xbox service start type
     */
    private ServiceStartType xboxServicesLiveNetworkingServiceStartupMode;
    /**
     * Instantiates a new Windows10EndpointProtectionConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows10EndpointProtectionConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10EndpointProtectionConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10EndpointProtectionConfiguration
     */
    @javax.annotation.Nonnull
    public static Windows10EndpointProtectionConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EndpointProtectionConfiguration();
    }
    /**
     * Gets the applicationGuardAllowCameraMicrophoneRedirection property value. Gets or sets whether applications inside Microsoft Defender Application Guard can access the devices camera and microphone.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowCameraMicrophoneRedirection() {
        return this.applicationGuardAllowCameraMicrophoneRedirection;
    }
    /**
     * Gets the applicationGuardAllowFileSaveOnHost property value. Allow users to download files from Edge in the application guard container and save them on the host file system
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowFileSaveOnHost() {
        return this.applicationGuardAllowFileSaveOnHost;
    }
    /**
     * Gets the applicationGuardAllowPersistence property value. Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPersistence() {
        return this.applicationGuardAllowPersistence;
    }
    /**
     * Gets the applicationGuardAllowPrintToLocalPrinters property value. Allow printing to Local Printers from Container
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToLocalPrinters() {
        return this.applicationGuardAllowPrintToLocalPrinters;
    }
    /**
     * Gets the applicationGuardAllowPrintToNetworkPrinters property value. Allow printing to Network Printers from Container
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToNetworkPrinters() {
        return this.applicationGuardAllowPrintToNetworkPrinters;
    }
    /**
     * Gets the applicationGuardAllowPrintToPDF property value. Allow printing to PDF from Container
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToPDF() {
        return this.applicationGuardAllowPrintToPDF;
    }
    /**
     * Gets the applicationGuardAllowPrintToXPS property value. Allow printing to XPS from Container
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToXPS() {
        return this.applicationGuardAllowPrintToXPS;
    }
    /**
     * Gets the applicationGuardAllowVirtualGPU property value. Allow application guard to use virtual GPU
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowVirtualGPU() {
        return this.applicationGuardAllowVirtualGPU;
    }
    /**
     * Gets the applicationGuardBlockClipboardSharing property value. Possible values for applicationGuardBlockClipboardSharingType
     * @return a ApplicationGuardBlockClipboardSharingType
     */
    @javax.annotation.Nullable
    public ApplicationGuardBlockClipboardSharingType getApplicationGuardBlockClipboardSharing() {
        return this.applicationGuardBlockClipboardSharing;
    }
    /**
     * Gets the applicationGuardBlockFileTransfer property value. Possible values for applicationGuardBlockFileTransfer
     * @return a ApplicationGuardBlockFileTransferType
     */
    @javax.annotation.Nullable
    public ApplicationGuardBlockFileTransferType getApplicationGuardBlockFileTransfer() {
        return this.applicationGuardBlockFileTransfer;
    }
    /**
     * Gets the applicationGuardBlockNonEnterpriseContent property value. Block enterprise sites to load non-enterprise content, such as third party plug-ins
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardBlockNonEnterpriseContent() {
        return this.applicationGuardBlockNonEnterpriseContent;
    }
    /**
     * Gets the applicationGuardCertificateThumbprints property value. Allows certain device level Root Certificates to be shared with the Microsoft Defender Application Guard container.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getApplicationGuardCertificateThumbprints() {
        return this.applicationGuardCertificateThumbprints;
    }
    /**
     * Gets the applicationGuardEnabled property value. Enable Windows Defender Application Guard
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardEnabled() {
        return this.applicationGuardEnabled;
    }
    /**
     * Gets the applicationGuardEnabledOptions property value. Possible values for ApplicationGuardEnabledOptions
     * @return a ApplicationGuardEnabledOptions
     */
    @javax.annotation.Nullable
    public ApplicationGuardEnabledOptions getApplicationGuardEnabledOptions() {
        return this.applicationGuardEnabledOptions;
    }
    /**
     * Gets the applicationGuardForceAuditing property value. Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardForceAuditing() {
        return this.applicationGuardForceAuditing;
    }
    /**
     * Gets the appLockerApplicationControl property value. Possible values of AppLocker Application Control Types
     * @return a AppLockerApplicationControlType
     */
    @javax.annotation.Nullable
    public AppLockerApplicationControlType getAppLockerApplicationControl() {
        return this.appLockerApplicationControl;
    }
    /**
     * Gets the bitLockerAllowStandardUserEncryption property value. Allows the admin to allow standard users to enable encrpytion during Azure AD Join.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBitLockerAllowStandardUserEncryption() {
        return this.bitLockerAllowStandardUserEncryption;
    }
    /**
     * Gets the bitLockerDisableWarningForOtherDiskEncryption property value. Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBitLockerDisableWarningForOtherDiskEncryption() {
        return this.bitLockerDisableWarningForOtherDiskEncryption;
    }
    /**
     * Gets the bitLockerEnableStorageCardEncryptionOnMobile property value. Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBitLockerEnableStorageCardEncryptionOnMobile() {
        return this.bitLockerEnableStorageCardEncryptionOnMobile;
    }
    /**
     * Gets the bitLockerEncryptDevice property value. Allows the admin to require encryption to be turned on using BitLocker.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBitLockerEncryptDevice() {
        return this.bitLockerEncryptDevice;
    }
    /**
     * Gets the bitLockerFixedDrivePolicy property value. BitLocker Fixed Drive Policy.
     * @return a bitLockerFixedDrivePolicy
     */
    @javax.annotation.Nullable
    public BitLockerFixedDrivePolicy getBitLockerFixedDrivePolicy() {
        return this.bitLockerFixedDrivePolicy;
    }
    /**
     * Gets the bitLockerRecoveryPasswordRotation property value. BitLocker recovery password rotation type
     * @return a BitLockerRecoveryPasswordRotationType
     */
    @javax.annotation.Nullable
    public BitLockerRecoveryPasswordRotationType getBitLockerRecoveryPasswordRotation() {
        return this.bitLockerRecoveryPasswordRotation;
    }
    /**
     * Gets the bitLockerRemovableDrivePolicy property value. BitLocker Removable Drive Policy.
     * @return a bitLockerRemovableDrivePolicy
     */
    @javax.annotation.Nullable
    public BitLockerRemovableDrivePolicy getBitLockerRemovableDrivePolicy() {
        return this.bitLockerRemovableDrivePolicy;
    }
    /**
     * Gets the bitLockerSystemDrivePolicy property value. BitLocker System Drive Policy.
     * @return a bitLockerSystemDrivePolicy
     */
    @javax.annotation.Nullable
    public BitLockerSystemDrivePolicy getBitLockerSystemDrivePolicy() {
        return this.bitLockerSystemDrivePolicy;
    }
    /**
     * Gets the defenderAdditionalGuardedFolders property value. List of folder paths to be added to the list of protected folders
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderAdditionalGuardedFolders() {
        return this.defenderAdditionalGuardedFolders;
    }
    /**
     * Gets the defenderAdobeReaderLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderAdobeReaderLaunchChildProcess() {
        return this.defenderAdobeReaderLaunchChildProcess;
    }
    /**
     * Gets the defenderAdvancedRansomewareProtectionType property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderAdvancedRansomewareProtectionType() {
        return this.defenderAdvancedRansomewareProtectionType;
    }
    /**
     * Gets the defenderAllowBehaviorMonitoring property value. Allows or disallows Windows Defender Behavior Monitoring functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowBehaviorMonitoring() {
        return this.defenderAllowBehaviorMonitoring;
    }
    /**
     * Gets the defenderAllowCloudProtection property value. To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowCloudProtection() {
        return this.defenderAllowCloudProtection;
    }
    /**
     * Gets the defenderAllowEndUserAccess property value. Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowEndUserAccess() {
        return this.defenderAllowEndUserAccess;
    }
    /**
     * Gets the defenderAllowIntrusionPreventionSystem property value. Allows or disallows Windows Defender Intrusion Prevention functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowIntrusionPreventionSystem() {
        return this.defenderAllowIntrusionPreventionSystem;
    }
    /**
     * Gets the defenderAllowOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowOnAccessProtection() {
        return this.defenderAllowOnAccessProtection;
    }
    /**
     * Gets the defenderAllowRealTimeMonitoring property value. Allows or disallows Windows Defender Realtime Monitoring functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowRealTimeMonitoring() {
        return this.defenderAllowRealTimeMonitoring;
    }
    /**
     * Gets the defenderAllowScanArchiveFiles property value. Allows or disallows scanning of archives.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowScanArchiveFiles() {
        return this.defenderAllowScanArchiveFiles;
    }
    /**
     * Gets the defenderAllowScanDownloads property value. Allows or disallows Windows Defender IOAVP Protection functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowScanDownloads() {
        return this.defenderAllowScanDownloads;
    }
    /**
     * Gets the defenderAllowScanNetworkFiles property value. Allows or disallows a scanning of network files.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowScanNetworkFiles() {
        return this.defenderAllowScanNetworkFiles;
    }
    /**
     * Gets the defenderAllowScanRemovableDrivesDuringFullScan property value. Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowScanRemovableDrivesDuringFullScan() {
        return this.defenderAllowScanRemovableDrivesDuringFullScan;
    }
    /**
     * Gets the defenderAllowScanScriptsLoadedInInternetExplorer property value. Allows or disallows Windows Defender Script Scanning functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowScanScriptsLoadedInInternetExplorer() {
        return this.defenderAllowScanScriptsLoadedInInternetExplorer;
    }
    /**
     * Gets the defenderAttackSurfaceReductionExcludedPaths property value. List of exe files and folders to be excluded from attack surface reduction rules
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderAttackSurfaceReductionExcludedPaths() {
        return this.defenderAttackSurfaceReductionExcludedPaths;
    }
    /**
     * Gets the defenderBlockEndUserAccess property value. Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderBlockEndUserAccess() {
        return this.defenderBlockEndUserAccess;
    }
    /**
     * Gets the defenderBlockPersistenceThroughWmiType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderBlockPersistenceThroughWmiType() {
        return this.defenderBlockPersistenceThroughWmiType;
    }
    /**
     * Gets the defenderCheckForSignaturesBeforeRunningScan property value. This policy setting allows you to manage whether a check for new virus and spyware definitions will occur before running a scan.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderCheckForSignaturesBeforeRunningScan() {
        return this.defenderCheckForSignaturesBeforeRunningScan;
    }
    /**
     * Gets the defenderCloudBlockLevel property value. Added in Windows 10, version 1709. This policy setting determines how aggressive Windows Defender Antivirus will be in blocking and scanning suspicious files. Value type is integer. This feature requires the 'Join Microsoft MAPS' setting enabled in order to function. Possible values are: notConfigured, high, highPlus, zeroTolerance.
     * @return a defenderCloudBlockLevelType
     */
    @javax.annotation.Nullable
    public DefenderCloudBlockLevelType getDefenderCloudBlockLevel() {
        return this.defenderCloudBlockLevel;
    }
    /**
     * Gets the defenderCloudExtendedTimeoutInSeconds property value. Added in Windows 10, version 1709. This feature allows Windows Defender Antivirus to block a suspicious file for up to 60 seconds, and scan it in the cloud to make sure it's safe. Value type is integer, range is 0 - 50. This feature depends on three other MAPS settings the must all be enabled- 'Configure the 'Block at First Sight' feature; 'Join Microsoft MAPS'; 'Send file samples when further analysis is required'. Valid values 0 to 50
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderCloudExtendedTimeoutInSeconds() {
        return this.defenderCloudExtendedTimeoutInSeconds;
    }
    /**
     * Gets the defenderDaysBeforeDeletingQuarantinedMalware property value. Time period (in days) that quarantine items will be stored on the system. Valid values 0 to 90
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderDaysBeforeDeletingQuarantinedMalware() {
        return this.defenderDaysBeforeDeletingQuarantinedMalware;
    }
    /**
     * Gets the defenderDetectedMalwareActions property value. Allows an administrator to specify any valid threat severity levels and the corresponding default action ID to take.
     * @return a defenderDetectedMalwareActions
     */
    @javax.annotation.Nullable
    public DefenderDetectedMalwareActions getDefenderDetectedMalwareActions() {
        return this.defenderDetectedMalwareActions;
    }
    /**
     * Gets the defenderDisableBehaviorMonitoring property value. Allows or disallows Windows Defender Behavior Monitoring functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableBehaviorMonitoring() {
        return this.defenderDisableBehaviorMonitoring;
    }
    /**
     * Gets the defenderDisableCatchupFullScan property value. This policy setting allows you to configure catch-up scans for scheduled full scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableCatchupFullScan() {
        return this.defenderDisableCatchupFullScan;
    }
    /**
     * Gets the defenderDisableCatchupQuickScan property value. This policy setting allows you to configure catch-up scans for scheduled quick scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableCatchupQuickScan() {
        return this.defenderDisableCatchupQuickScan;
    }
    /**
     * Gets the defenderDisableCloudProtection property value. To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableCloudProtection() {
        return this.defenderDisableCloudProtection;
    }
    /**
     * Gets the defenderDisableIntrusionPreventionSystem property value. Allows or disallows Windows Defender Intrusion Prevention functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableIntrusionPreventionSystem() {
        return this.defenderDisableIntrusionPreventionSystem;
    }
    /**
     * Gets the defenderDisableOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableOnAccessProtection() {
        return this.defenderDisableOnAccessProtection;
    }
    /**
     * Gets the defenderDisableRealTimeMonitoring property value. Allows or disallows Windows Defender Realtime Monitoring functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableRealTimeMonitoring() {
        return this.defenderDisableRealTimeMonitoring;
    }
    /**
     * Gets the defenderDisableScanArchiveFiles property value. Allows or disallows scanning of archives.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableScanArchiveFiles() {
        return this.defenderDisableScanArchiveFiles;
    }
    /**
     * Gets the defenderDisableScanDownloads property value. Allows or disallows Windows Defender IOAVP Protection functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableScanDownloads() {
        return this.defenderDisableScanDownloads;
    }
    /**
     * Gets the defenderDisableScanNetworkFiles property value. Allows or disallows a scanning of network files.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableScanNetworkFiles() {
        return this.defenderDisableScanNetworkFiles;
    }
    /**
     * Gets the defenderDisableScanRemovableDrivesDuringFullScan property value. Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableScanRemovableDrivesDuringFullScan() {
        return this.defenderDisableScanRemovableDrivesDuringFullScan;
    }
    /**
     * Gets the defenderDisableScanScriptsLoadedInInternetExplorer property value. Allows or disallows Windows Defender Script Scanning functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableScanScriptsLoadedInInternetExplorer() {
        return this.defenderDisableScanScriptsLoadedInInternetExplorer;
    }
    /**
     * Gets the defenderEmailContentExecution property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderEmailContentExecution() {
        return this.defenderEmailContentExecution;
    }
    /**
     * Gets the defenderEmailContentExecutionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderEmailContentExecutionType() {
        return this.defenderEmailContentExecutionType;
    }
    /**
     * Gets the defenderEnableLowCpuPriority property value. This policy setting allows you to enable or disable low CPU priority for scheduled scans.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderEnableLowCpuPriority() {
        return this.defenderEnableLowCpuPriority;
    }
    /**
     * Gets the defenderEnableScanIncomingMail property value. Allows or disallows scanning of email.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderEnableScanIncomingMail() {
        return this.defenderEnableScanIncomingMail;
    }
    /**
     * Gets the defenderEnableScanMappedNetworkDrivesDuringFullScan property value. Allows or disallows a full scan of mapped network drives.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderEnableScanMappedNetworkDrivesDuringFullScan() {
        return this.defenderEnableScanMappedNetworkDrivesDuringFullScan;
    }
    /**
     * Gets the defenderExploitProtectionXml property value. Xml content containing information regarding exploit protection details.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getDefenderExploitProtectionXml() {
        return this.defenderExploitProtectionXml;
    }
    /**
     * Gets the defenderExploitProtectionXmlFileName property value. Name of the file from which DefenderExploitProtectionXml was obtained.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefenderExploitProtectionXmlFileName() {
        return this.defenderExploitProtectionXmlFileName;
    }
    /**
     * Gets the defenderFileExtensionsToExclude property value. File extensions to exclude from scans and real time protection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderFileExtensionsToExclude() {
        return this.defenderFileExtensionsToExclude;
    }
    /**
     * Gets the defenderFilesAndFoldersToExclude property value. Files and folder to exclude from scans and real time protection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderFilesAndFoldersToExclude() {
        return this.defenderFilesAndFoldersToExclude;
    }
    /**
     * Gets the defenderGuardedFoldersAllowedAppPaths property value. List of paths to exe that are allowed to access protected folders
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderGuardedFoldersAllowedAppPaths() {
        return this.defenderGuardedFoldersAllowedAppPaths;
    }
    /**
     * Gets the defenderGuardMyFoldersType property value. Possible values of Folder Protection
     * @return a FolderProtectionType
     */
    @javax.annotation.Nullable
    public FolderProtectionType getDefenderGuardMyFoldersType() {
        return this.defenderGuardMyFoldersType;
    }
    /**
     * Gets the defenderNetworkProtectionType property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderNetworkProtectionType() {
        return this.defenderNetworkProtectionType;
    }
    /**
     * Gets the defenderOfficeAppsExecutableContentCreationOrLaunch property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeAppsExecutableContentCreationOrLaunch() {
        return this.defenderOfficeAppsExecutableContentCreationOrLaunch;
    }
    /**
     * Gets the defenderOfficeAppsExecutableContentCreationOrLaunchType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderOfficeAppsExecutableContentCreationOrLaunchType() {
        return this.defenderOfficeAppsExecutableContentCreationOrLaunchType;
    }
    /**
     * Gets the defenderOfficeAppsLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeAppsLaunchChildProcess() {
        return this.defenderOfficeAppsLaunchChildProcess;
    }
    /**
     * Gets the defenderOfficeAppsLaunchChildProcessType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderOfficeAppsLaunchChildProcessType() {
        return this.defenderOfficeAppsLaunchChildProcessType;
    }
    /**
     * Gets the defenderOfficeAppsOtherProcessInjection property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeAppsOtherProcessInjection() {
        return this.defenderOfficeAppsOtherProcessInjection;
    }
    /**
     * Gets the defenderOfficeAppsOtherProcessInjectionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderOfficeAppsOtherProcessInjectionType() {
        return this.defenderOfficeAppsOtherProcessInjectionType;
    }
    /**
     * Gets the defenderOfficeCommunicationAppsLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeCommunicationAppsLaunchChildProcess() {
        return this.defenderOfficeCommunicationAppsLaunchChildProcess;
    }
    /**
     * Gets the defenderOfficeMacroCodeAllowWin32Imports property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeMacroCodeAllowWin32Imports() {
        return this.defenderOfficeMacroCodeAllowWin32Imports;
    }
    /**
     * Gets the defenderOfficeMacroCodeAllowWin32ImportsType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderOfficeMacroCodeAllowWin32ImportsType() {
        return this.defenderOfficeMacroCodeAllowWin32ImportsType;
    }
    /**
     * Gets the defenderPotentiallyUnwantedAppAction property value. Added in Windows 10, version 1607. Specifies the level of detection for potentially unwanted applications (PUAs). Windows Defender alerts you when potentially unwanted software is being downloaded or attempts to install itself on your computer. Possible values are: userDefined, enable, auditMode, warn, notConfigured.
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderPotentiallyUnwantedAppAction() {
        return this.defenderPotentiallyUnwantedAppAction;
    }
    /**
     * Gets the defenderPreventCredentialStealingType property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderPreventCredentialStealingType() {
        return this.defenderPreventCredentialStealingType;
    }
    /**
     * Gets the defenderProcessCreation property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderProcessCreation() {
        return this.defenderProcessCreation;
    }
    /**
     * Gets the defenderProcessCreationType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderProcessCreationType() {
        return this.defenderProcessCreationType;
    }
    /**
     * Gets the defenderProcessesToExclude property value. Processes to exclude from scans and real time protection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderProcessesToExclude() {
        return this.defenderProcessesToExclude;
    }
    /**
     * Gets the defenderScanDirection property value. Controls which sets of files should be monitored. Possible values are: monitorAllFiles, monitorIncomingFilesOnly, monitorOutgoingFilesOnly.
     * @return a defenderRealtimeScanDirection
     */
    @javax.annotation.Nullable
    public DefenderRealtimeScanDirection getDefenderScanDirection() {
        return this.defenderScanDirection;
    }
    /**
     * Gets the defenderScanMaxCpuPercentage property value. Represents the average CPU load factor for the Windows Defender scan (in percent). The default value is 50. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderScanMaxCpuPercentage() {
        return this.defenderScanMaxCpuPercentage;
    }
    /**
     * Gets the defenderScanType property value. Selects whether to perform a quick scan or full scan. Possible values are: userDefined, disabled, quick, full.
     * @return a defenderScanType
     */
    @javax.annotation.Nullable
    public DefenderScanType getDefenderScanType() {
        return this.defenderScanType;
    }
    /**
     * Gets the defenderScheduledQuickScanTime property value. Selects the time of day that the Windows Defender quick scan should run. For example, a value of 0=12:00AM, a value of 60=1:00AM, a value of 120=2:00, and so on, up to a value of 1380=11:00PM. The default value is 120
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getDefenderScheduledQuickScanTime() {
        return this.defenderScheduledQuickScanTime;
    }
    /**
     * Gets the defenderScheduledScanDay property value. Selects the day that the Windows Defender scan should run. Possible values are: userDefined, everyday, sunday, monday, tuesday, wednesday, thursday, friday, saturday, noScheduledScan.
     * @return a weeklySchedule
     */
    @javax.annotation.Nullable
    public WeeklySchedule getDefenderScheduledScanDay() {
        return this.defenderScheduledScanDay;
    }
    /**
     * Gets the defenderScheduledScanTime property value. Selects the time of day that the Windows Defender scan should run.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getDefenderScheduledScanTime() {
        return this.defenderScheduledScanTime;
    }
    /**
     * Gets the defenderScriptDownloadedPayloadExecution property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderScriptDownloadedPayloadExecution() {
        return this.defenderScriptDownloadedPayloadExecution;
    }
    /**
     * Gets the defenderScriptDownloadedPayloadExecutionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderScriptDownloadedPayloadExecutionType() {
        return this.defenderScriptDownloadedPayloadExecutionType;
    }
    /**
     * Gets the defenderScriptObfuscatedMacroCode property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderScriptObfuscatedMacroCode() {
        return this.defenderScriptObfuscatedMacroCode;
    }
    /**
     * Gets the defenderScriptObfuscatedMacroCodeType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderScriptObfuscatedMacroCodeType() {
        return this.defenderScriptObfuscatedMacroCodeType;
    }
    /**
     * Gets the defenderSecurityCenterBlockExploitProtectionOverride property value. Indicates whether or not to block user from overriding Exploit Protection settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterBlockExploitProtectionOverride() {
        return this.defenderSecurityCenterBlockExploitProtectionOverride;
    }
    /**
     * Gets the defenderSecurityCenterDisableAccountUI property value. Used to disable the display of the account protection area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableAccountUI() {
        return this.defenderSecurityCenterDisableAccountUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableAppBrowserUI property value. Used to disable the display of the app and browser protection area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableAppBrowserUI() {
        return this.defenderSecurityCenterDisableAppBrowserUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableClearTpmUI property value. Used to disable the display of the Clear TPM button.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableClearTpmUI() {
        return this.defenderSecurityCenterDisableClearTpmUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableFamilyUI property value. Used to disable the display of the family options area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableFamilyUI() {
        return this.defenderSecurityCenterDisableFamilyUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableHardwareUI property value. Used to disable the display of the hardware protection area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableHardwareUI() {
        return this.defenderSecurityCenterDisableHardwareUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableHealthUI property value. Used to disable the display of the device performance and health area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableHealthUI() {
        return this.defenderSecurityCenterDisableHealthUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableNetworkUI property value. Used to disable the display of the firewall and network protection area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableNetworkUI() {
        return this.defenderSecurityCenterDisableNetworkUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableNotificationAreaUI property value. Used to disable the display of the notification area control. The user needs to either sign out and sign in or reboot the computer for this setting to take effect.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableNotificationAreaUI() {
        return this.defenderSecurityCenterDisableNotificationAreaUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableRansomwareUI property value. Used to disable the display of the ransomware protection area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableRansomwareUI() {
        return this.defenderSecurityCenterDisableRansomwareUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableSecureBootUI property value. Used to disable the display of the secure boot area under Device security.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableSecureBootUI() {
        return this.defenderSecurityCenterDisableSecureBootUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableTroubleshootingUI property value. Used to disable the display of the security process troubleshooting under Device security.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableTroubleshootingUI() {
        return this.defenderSecurityCenterDisableTroubleshootingUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableVirusUI property value. Used to disable the display of the virus and threat protection area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableVirusUI() {
        return this.defenderSecurityCenterDisableVirusUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI property value. Used to disable the display of update TPM Firmware when a vulnerable firmware is detected.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI() {
        return this.defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI;
    }
    /**
     * Gets the defenderSecurityCenterHelpEmail property value. The email address that is displayed to users.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefenderSecurityCenterHelpEmail() {
        return this.defenderSecurityCenterHelpEmail;
    }
    /**
     * Gets the defenderSecurityCenterHelpPhone property value. The phone number or Skype ID that is displayed to users.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefenderSecurityCenterHelpPhone() {
        return this.defenderSecurityCenterHelpPhone;
    }
    /**
     * Gets the defenderSecurityCenterHelpURL property value. The help portal URL this is displayed to users.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefenderSecurityCenterHelpURL() {
        return this.defenderSecurityCenterHelpURL;
    }
    /**
     * Gets the defenderSecurityCenterITContactDisplay property value. Possible values for defenderSecurityCenterITContactDisplay
     * @return a DefenderSecurityCenterITContactDisplayType
     */
    @javax.annotation.Nullable
    public DefenderSecurityCenterITContactDisplayType getDefenderSecurityCenterITContactDisplay() {
        return this.defenderSecurityCenterITContactDisplay;
    }
    /**
     * Gets the defenderSecurityCenterNotificationsFromApp property value. Possible values for defenderSecurityCenterNotificationsFromApp
     * @return a DefenderSecurityCenterNotificationsFromAppType
     */
    @javax.annotation.Nullable
    public DefenderSecurityCenterNotificationsFromAppType getDefenderSecurityCenterNotificationsFromApp() {
        return this.defenderSecurityCenterNotificationsFromApp;
    }
    /**
     * Gets the defenderSecurityCenterOrganizationDisplayName property value. The company name that is displayed to the users.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefenderSecurityCenterOrganizationDisplayName() {
        return this.defenderSecurityCenterOrganizationDisplayName;
    }
    /**
     * Gets the defenderSignatureUpdateIntervalInHours property value. Specifies the interval (in hours) that will be used to check for signatures, so instead of using the ScheduleDay and ScheduleTime the check for new signatures will be set according to the interval. Valid values 0 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderSignatureUpdateIntervalInHours() {
        return this.defenderSignatureUpdateIntervalInHours;
    }
    /**
     * Gets the defenderSubmitSamplesConsentType property value. Checks for the user consent level in Windows Defender to send data. Possible values are: sendSafeSamplesAutomatically, alwaysPrompt, neverSend, sendAllSamplesAutomatically.
     * @return a defenderSubmitSamplesConsentType
     */
    @javax.annotation.Nullable
    public DefenderSubmitSamplesConsentType getDefenderSubmitSamplesConsentType() {
        return this.defenderSubmitSamplesConsentType;
    }
    /**
     * Gets the defenderUntrustedExecutable property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderUntrustedExecutable() {
        return this.defenderUntrustedExecutable;
    }
    /**
     * Gets the defenderUntrustedExecutableType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderUntrustedExecutableType() {
        return this.defenderUntrustedExecutableType;
    }
    /**
     * Gets the defenderUntrustedUSBProcess property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderUntrustedUSBProcess() {
        return this.defenderUntrustedUSBProcess;
    }
    /**
     * Gets the defenderUntrustedUSBProcessType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a DefenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderUntrustedUSBProcessType() {
        return this.defenderUntrustedUSBProcessType;
    }
    /**
     * Gets the deviceGuardEnableSecureBootWithDMA property value. This property will be deprecated in May 2019 and will be replaced with property DeviceGuardSecureBootWithDMA. Specifies whether Platform Security Level is enabled at next reboot.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceGuardEnableSecureBootWithDMA() {
        return this.deviceGuardEnableSecureBootWithDMA;
    }
    /**
     * Gets the deviceGuardEnableVirtualizationBasedSecurity property value. Turns On Virtualization Based Security(VBS).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceGuardEnableVirtualizationBasedSecurity() {
        return this.deviceGuardEnableVirtualizationBasedSecurity;
    }
    /**
     * Gets the deviceGuardLaunchSystemGuard property value. Possible values of a property
     * @return a Enablement
     */
    @javax.annotation.Nullable
    public Enablement getDeviceGuardLaunchSystemGuard() {
        return this.deviceGuardLaunchSystemGuard;
    }
    /**
     * Gets the deviceGuardLocalSystemAuthorityCredentialGuardSettings property value. Possible values of Credential Guard settings.
     * @return a DeviceGuardLocalSystemAuthorityCredentialGuardType
     */
    @javax.annotation.Nullable
    public DeviceGuardLocalSystemAuthorityCredentialGuardType getDeviceGuardLocalSystemAuthorityCredentialGuardSettings() {
        return this.deviceGuardLocalSystemAuthorityCredentialGuardSettings;
    }
    /**
     * Gets the deviceGuardSecureBootWithDMA property value. Possible values of Secure Boot with DMA
     * @return a SecureBootWithDMAType
     */
    @javax.annotation.Nullable
    public SecureBootWithDMAType getDeviceGuardSecureBootWithDMA() {
        return this.deviceGuardSecureBootWithDMA;
    }
    /**
     * Gets the dmaGuardDeviceEnumerationPolicy property value. Possible values of the DmaGuardDeviceEnumerationPolicy.
     * @return a DmaGuardDeviceEnumerationPolicyType
     */
    @javax.annotation.Nullable
    public DmaGuardDeviceEnumerationPolicyType getDmaGuardDeviceEnumerationPolicy() {
        return this.dmaGuardDeviceEnumerationPolicy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
        deserializerMap.put("applicationGuardBlockClipboardSharing", (n) -> { this.setApplicationGuardBlockClipboardSharing(n.getEnumValue(ApplicationGuardBlockClipboardSharingType.class)); });
        deserializerMap.put("applicationGuardBlockFileTransfer", (n) -> { this.setApplicationGuardBlockFileTransfer(n.getEnumValue(ApplicationGuardBlockFileTransferType.class)); });
        deserializerMap.put("applicationGuardBlockNonEnterpriseContent", (n) -> { this.setApplicationGuardBlockNonEnterpriseContent(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardCertificateThumbprints", (n) -> { this.setApplicationGuardCertificateThumbprints(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("applicationGuardEnabled", (n) -> { this.setApplicationGuardEnabled(n.getBooleanValue()); });
        deserializerMap.put("applicationGuardEnabledOptions", (n) -> { this.setApplicationGuardEnabledOptions(n.getEnumValue(ApplicationGuardEnabledOptions.class)); });
        deserializerMap.put("applicationGuardForceAuditing", (n) -> { this.setApplicationGuardForceAuditing(n.getBooleanValue()); });
        deserializerMap.put("appLockerApplicationControl", (n) -> { this.setAppLockerApplicationControl(n.getEnumValue(AppLockerApplicationControlType.class)); });
        deserializerMap.put("bitLockerAllowStandardUserEncryption", (n) -> { this.setBitLockerAllowStandardUserEncryption(n.getBooleanValue()); });
        deserializerMap.put("bitLockerDisableWarningForOtherDiskEncryption", (n) -> { this.setBitLockerDisableWarningForOtherDiskEncryption(n.getBooleanValue()); });
        deserializerMap.put("bitLockerEnableStorageCardEncryptionOnMobile", (n) -> { this.setBitLockerEnableStorageCardEncryptionOnMobile(n.getBooleanValue()); });
        deserializerMap.put("bitLockerEncryptDevice", (n) -> { this.setBitLockerEncryptDevice(n.getBooleanValue()); });
        deserializerMap.put("bitLockerFixedDrivePolicy", (n) -> { this.setBitLockerFixedDrivePolicy(n.getObjectValue(BitLockerFixedDrivePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("bitLockerRecoveryPasswordRotation", (n) -> { this.setBitLockerRecoveryPasswordRotation(n.getEnumValue(BitLockerRecoveryPasswordRotationType.class)); });
        deserializerMap.put("bitLockerRemovableDrivePolicy", (n) -> { this.setBitLockerRemovableDrivePolicy(n.getObjectValue(BitLockerRemovableDrivePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("bitLockerSystemDrivePolicy", (n) -> { this.setBitLockerSystemDrivePolicy(n.getObjectValue(BitLockerSystemDrivePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("defenderAdditionalGuardedFolders", (n) -> { this.setDefenderAdditionalGuardedFolders(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderAdobeReaderLaunchChildProcess", (n) -> { this.setDefenderAdobeReaderLaunchChildProcess(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderAdvancedRansomewareProtectionType", (n) -> { this.setDefenderAdvancedRansomewareProtectionType(n.getEnumValue(DefenderProtectionType.class)); });
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
        deserializerMap.put("defenderBlockPersistenceThroughWmiType", (n) -> { this.setDefenderBlockPersistenceThroughWmiType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
        deserializerMap.put("defenderCheckForSignaturesBeforeRunningScan", (n) -> { this.setDefenderCheckForSignaturesBeforeRunningScan(n.getBooleanValue()); });
        deserializerMap.put("defenderCloudBlockLevel", (n) -> { this.setDefenderCloudBlockLevel(n.getEnumValue(DefenderCloudBlockLevelType.class)); });
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
        deserializerMap.put("defenderEmailContentExecution", (n) -> { this.setDefenderEmailContentExecution(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderEmailContentExecutionType", (n) -> { this.setDefenderEmailContentExecutionType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
        deserializerMap.put("defenderEnableLowCpuPriority", (n) -> { this.setDefenderEnableLowCpuPriority(n.getBooleanValue()); });
        deserializerMap.put("defenderEnableScanIncomingMail", (n) -> { this.setDefenderEnableScanIncomingMail(n.getBooleanValue()); });
        deserializerMap.put("defenderEnableScanMappedNetworkDrivesDuringFullScan", (n) -> { this.setDefenderEnableScanMappedNetworkDrivesDuringFullScan(n.getBooleanValue()); });
        deserializerMap.put("defenderExploitProtectionXml", (n) -> { this.setDefenderExploitProtectionXml(n.getByteArrayValue()); });
        deserializerMap.put("defenderExploitProtectionXmlFileName", (n) -> { this.setDefenderExploitProtectionXmlFileName(n.getStringValue()); });
        deserializerMap.put("defenderFileExtensionsToExclude", (n) -> { this.setDefenderFileExtensionsToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderFilesAndFoldersToExclude", (n) -> { this.setDefenderFilesAndFoldersToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderGuardedFoldersAllowedAppPaths", (n) -> { this.setDefenderGuardedFoldersAllowedAppPaths(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderGuardMyFoldersType", (n) -> { this.setDefenderGuardMyFoldersType(n.getEnumValue(FolderProtectionType.class)); });
        deserializerMap.put("defenderNetworkProtectionType", (n) -> { this.setDefenderNetworkProtectionType(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderOfficeAppsExecutableContentCreationOrLaunch", (n) -> { this.setDefenderOfficeAppsExecutableContentCreationOrLaunch(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderOfficeAppsExecutableContentCreationOrLaunchType", (n) -> { this.setDefenderOfficeAppsExecutableContentCreationOrLaunchType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
        deserializerMap.put("defenderOfficeAppsLaunchChildProcess", (n) -> { this.setDefenderOfficeAppsLaunchChildProcess(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderOfficeAppsLaunchChildProcessType", (n) -> { this.setDefenderOfficeAppsLaunchChildProcessType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
        deserializerMap.put("defenderOfficeAppsOtherProcessInjection", (n) -> { this.setDefenderOfficeAppsOtherProcessInjection(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderOfficeAppsOtherProcessInjectionType", (n) -> { this.setDefenderOfficeAppsOtherProcessInjectionType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
        deserializerMap.put("defenderOfficeCommunicationAppsLaunchChildProcess", (n) -> { this.setDefenderOfficeCommunicationAppsLaunchChildProcess(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderOfficeMacroCodeAllowWin32Imports", (n) -> { this.setDefenderOfficeMacroCodeAllowWin32Imports(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderOfficeMacroCodeAllowWin32ImportsType", (n) -> { this.setDefenderOfficeMacroCodeAllowWin32ImportsType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
        deserializerMap.put("defenderPotentiallyUnwantedAppAction", (n) -> { this.setDefenderPotentiallyUnwantedAppAction(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderPreventCredentialStealingType", (n) -> { this.setDefenderPreventCredentialStealingType(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderProcessCreation", (n) -> { this.setDefenderProcessCreation(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderProcessCreationType", (n) -> { this.setDefenderProcessCreationType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
        deserializerMap.put("defenderProcessesToExclude", (n) -> { this.setDefenderProcessesToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderScanDirection", (n) -> { this.setDefenderScanDirection(n.getEnumValue(DefenderRealtimeScanDirection.class)); });
        deserializerMap.put("defenderScanMaxCpuPercentage", (n) -> { this.setDefenderScanMaxCpuPercentage(n.getIntegerValue()); });
        deserializerMap.put("defenderScanType", (n) -> { this.setDefenderScanType(n.getEnumValue(DefenderScanType.class)); });
        deserializerMap.put("defenderScheduledQuickScanTime", (n) -> { this.setDefenderScheduledQuickScanTime(n.getLocalTimeValue()); });
        deserializerMap.put("defenderScheduledScanDay", (n) -> { this.setDefenderScheduledScanDay(n.getEnumValue(WeeklySchedule.class)); });
        deserializerMap.put("defenderScheduledScanTime", (n) -> { this.setDefenderScheduledScanTime(n.getLocalTimeValue()); });
        deserializerMap.put("defenderScriptDownloadedPayloadExecution", (n) -> { this.setDefenderScriptDownloadedPayloadExecution(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderScriptDownloadedPayloadExecutionType", (n) -> { this.setDefenderScriptDownloadedPayloadExecutionType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
        deserializerMap.put("defenderScriptObfuscatedMacroCode", (n) -> { this.setDefenderScriptObfuscatedMacroCode(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderScriptObfuscatedMacroCodeType", (n) -> { this.setDefenderScriptObfuscatedMacroCodeType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
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
        deserializerMap.put("defenderSecurityCenterITContactDisplay", (n) -> { this.setDefenderSecurityCenterITContactDisplay(n.getEnumValue(DefenderSecurityCenterITContactDisplayType.class)); });
        deserializerMap.put("defenderSecurityCenterNotificationsFromApp", (n) -> { this.setDefenderSecurityCenterNotificationsFromApp(n.getEnumValue(DefenderSecurityCenterNotificationsFromAppType.class)); });
        deserializerMap.put("defenderSecurityCenterOrganizationDisplayName", (n) -> { this.setDefenderSecurityCenterOrganizationDisplayName(n.getStringValue()); });
        deserializerMap.put("defenderSignatureUpdateIntervalInHours", (n) -> { this.setDefenderSignatureUpdateIntervalInHours(n.getIntegerValue()); });
        deserializerMap.put("defenderSubmitSamplesConsentType", (n) -> { this.setDefenderSubmitSamplesConsentType(n.getEnumValue(DefenderSubmitSamplesConsentType.class)); });
        deserializerMap.put("defenderUntrustedExecutable", (n) -> { this.setDefenderUntrustedExecutable(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderUntrustedExecutableType", (n) -> { this.setDefenderUntrustedExecutableType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
        deserializerMap.put("defenderUntrustedUSBProcess", (n) -> { this.setDefenderUntrustedUSBProcess(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderUntrustedUSBProcessType", (n) -> { this.setDefenderUntrustedUSBProcessType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
        deserializerMap.put("deviceGuardEnableSecureBootWithDMA", (n) -> { this.setDeviceGuardEnableSecureBootWithDMA(n.getBooleanValue()); });
        deserializerMap.put("deviceGuardEnableVirtualizationBasedSecurity", (n) -> { this.setDeviceGuardEnableVirtualizationBasedSecurity(n.getBooleanValue()); });
        deserializerMap.put("deviceGuardLaunchSystemGuard", (n) -> { this.setDeviceGuardLaunchSystemGuard(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("deviceGuardLocalSystemAuthorityCredentialGuardSettings", (n) -> { this.setDeviceGuardLocalSystemAuthorityCredentialGuardSettings(n.getEnumValue(DeviceGuardLocalSystemAuthorityCredentialGuardType.class)); });
        deserializerMap.put("deviceGuardSecureBootWithDMA", (n) -> { this.setDeviceGuardSecureBootWithDMA(n.getEnumValue(SecureBootWithDMAType.class)); });
        deserializerMap.put("dmaGuardDeviceEnumerationPolicy", (n) -> { this.setDmaGuardDeviceEnumerationPolicy(n.getEnumValue(DmaGuardDeviceEnumerationPolicyType.class)); });
        deserializerMap.put("firewallBlockStatefulFTP", (n) -> { this.setFirewallBlockStatefulFTP(n.getBooleanValue()); });
        deserializerMap.put("firewallCertificateRevocationListCheckMethod", (n) -> { this.setFirewallCertificateRevocationListCheckMethod(n.getEnumValue(FirewallCertificateRevocationListCheckMethodType.class)); });
        deserializerMap.put("firewallIdleTimeoutForSecurityAssociationInSeconds", (n) -> { this.setFirewallIdleTimeoutForSecurityAssociationInSeconds(n.getIntegerValue()); });
        deserializerMap.put("firewallIPSecExemptionsAllowDHCP", (n) -> { this.setFirewallIPSecExemptionsAllowDHCP(n.getBooleanValue()); });
        deserializerMap.put("firewallIPSecExemptionsAllowICMP", (n) -> { this.setFirewallIPSecExemptionsAllowICMP(n.getBooleanValue()); });
        deserializerMap.put("firewallIPSecExemptionsAllowNeighborDiscovery", (n) -> { this.setFirewallIPSecExemptionsAllowNeighborDiscovery(n.getBooleanValue()); });
        deserializerMap.put("firewallIPSecExemptionsAllowRouterDiscovery", (n) -> { this.setFirewallIPSecExemptionsAllowRouterDiscovery(n.getBooleanValue()); });
        deserializerMap.put("firewallIPSecExemptionsNone", (n) -> { this.setFirewallIPSecExemptionsNone(n.getBooleanValue()); });
        deserializerMap.put("firewallMergeKeyingModuleSettings", (n) -> { this.setFirewallMergeKeyingModuleSettings(n.getBooleanValue()); });
        deserializerMap.put("firewallPacketQueueingMethod", (n) -> { this.setFirewallPacketQueueingMethod(n.getEnumValue(FirewallPacketQueueingMethodType.class)); });
        deserializerMap.put("firewallPreSharedKeyEncodingMethod", (n) -> { this.setFirewallPreSharedKeyEncodingMethod(n.getEnumValue(FirewallPreSharedKeyEncodingMethodType.class)); });
        deserializerMap.put("firewallProfileDomain", (n) -> { this.setFirewallProfileDomain(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("firewallProfilePrivate", (n) -> { this.setFirewallProfilePrivate(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("firewallProfilePublic", (n) -> { this.setFirewallProfilePublic(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("firewallRules", (n) -> { this.setFirewallRules(n.getCollectionOfObjectValues(WindowsFirewallRule::createFromDiscriminatorValue)); });
        deserializerMap.put("lanManagerAuthenticationLevel", (n) -> { this.setLanManagerAuthenticationLevel(n.getEnumValue(LanManagerAuthenticationLevel.class)); });
        deserializerMap.put("lanManagerWorkstationDisableInsecureGuestLogons", (n) -> { this.setLanManagerWorkstationDisableInsecureGuestLogons(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsAdministratorAccountName", (n) -> { this.setLocalSecurityOptionsAdministratorAccountName(n.getStringValue()); });
        deserializerMap.put("localSecurityOptionsAdministratorElevationPromptBehavior", (n) -> { this.setLocalSecurityOptionsAdministratorElevationPromptBehavior(n.getEnumValue(LocalSecurityOptionsAdministratorElevationPromptBehaviorType.class)); });
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
        deserializerMap.put("localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser", (n) -> { this.setLocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser(n.getEnumValue(LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType.class)); });
        deserializerMap.put("localSecurityOptionsGuestAccountName", (n) -> { this.setLocalSecurityOptionsGuestAccountName(n.getStringValue()); });
        deserializerMap.put("localSecurityOptionsHideLastSignedInUser", (n) -> { this.setLocalSecurityOptionsHideLastSignedInUser(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsHideUsernameAtSignIn", (n) -> { this.setLocalSecurityOptionsHideUsernameAtSignIn(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsInformationDisplayedOnLockScreen", (n) -> { this.setLocalSecurityOptionsInformationDisplayedOnLockScreen(n.getEnumValue(LocalSecurityOptionsInformationDisplayedOnLockScreenType.class)); });
        deserializerMap.put("localSecurityOptionsInformationShownOnLockScreen", (n) -> { this.setLocalSecurityOptionsInformationShownOnLockScreen(n.getEnumValue(LocalSecurityOptionsInformationShownOnLockScreenType.class)); });
        deserializerMap.put("localSecurityOptionsLogOnMessageText", (n) -> { this.setLocalSecurityOptionsLogOnMessageText(n.getStringValue()); });
        deserializerMap.put("localSecurityOptionsLogOnMessageTitle", (n) -> { this.setLocalSecurityOptionsLogOnMessageTitle(n.getStringValue()); });
        deserializerMap.put("localSecurityOptionsMachineInactivityLimit", (n) -> { this.setLocalSecurityOptionsMachineInactivityLimit(n.getIntegerValue()); });
        deserializerMap.put("localSecurityOptionsMachineInactivityLimitInMinutes", (n) -> { this.setLocalSecurityOptionsMachineInactivityLimitInMinutes(n.getIntegerValue()); });
        deserializerMap.put("localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients", (n) -> { this.setLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients(n.getEnumValue(LocalSecurityOptionsMinimumSessionSecurity.class)); });
        deserializerMap.put("localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers", (n) -> { this.setLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers(n.getEnumValue(LocalSecurityOptionsMinimumSessionSecurity.class)); });
        deserializerMap.put("localSecurityOptionsOnlyElevateSignedExecutables", (n) -> { this.setLocalSecurityOptionsOnlyElevateSignedExecutables(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares", (n) -> { this.setLocalSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares(n.getBooleanValue()); });
        deserializerMap.put("localSecurityOptionsSmartCardRemovalBehavior", (n) -> { this.setLocalSecurityOptionsSmartCardRemovalBehavior(n.getEnumValue(LocalSecurityOptionsSmartCardRemovalBehaviorType.class)); });
        deserializerMap.put("localSecurityOptionsStandardUserElevationPromptBehavior", (n) -> { this.setLocalSecurityOptionsStandardUserElevationPromptBehavior(n.getEnumValue(LocalSecurityOptionsStandardUserElevationPromptBehaviorType.class)); });
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
        deserializerMap.put("windowsDefenderTamperProtection", (n) -> { this.setWindowsDefenderTamperProtection(n.getEnumValue(WindowsDefenderTamperProtectionOptions.class)); });
        deserializerMap.put("xboxServicesAccessoryManagementServiceStartupMode", (n) -> { this.setXboxServicesAccessoryManagementServiceStartupMode(n.getEnumValue(ServiceStartType.class)); });
        deserializerMap.put("xboxServicesEnableXboxGameSaveTask", (n) -> { this.setXboxServicesEnableXboxGameSaveTask(n.getBooleanValue()); });
        deserializerMap.put("xboxServicesLiveAuthManagerServiceStartupMode", (n) -> { this.setXboxServicesLiveAuthManagerServiceStartupMode(n.getEnumValue(ServiceStartType.class)); });
        deserializerMap.put("xboxServicesLiveGameSaveServiceStartupMode", (n) -> { this.setXboxServicesLiveGameSaveServiceStartupMode(n.getEnumValue(ServiceStartType.class)); });
        deserializerMap.put("xboxServicesLiveNetworkingServiceStartupMode", (n) -> { this.setXboxServicesLiveNetworkingServiceStartupMode(n.getEnumValue(ServiceStartType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the firewallBlockStatefulFTP property value. Blocks stateful FTP connections to the device
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallBlockStatefulFTP() {
        return this.firewallBlockStatefulFTP;
    }
    /**
     * Gets the firewallCertificateRevocationListCheckMethod property value. Possible values for firewallCertificateRevocationListCheckMethod
     * @return a FirewallCertificateRevocationListCheckMethodType
     */
    @javax.annotation.Nullable
    public FirewallCertificateRevocationListCheckMethodType getFirewallCertificateRevocationListCheckMethod() {
        return this.firewallCertificateRevocationListCheckMethod;
    }
    /**
     * Gets the firewallIdleTimeoutForSecurityAssociationInSeconds property value. Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFirewallIdleTimeoutForSecurityAssociationInSeconds() {
        return this.firewallIdleTimeoutForSecurityAssociationInSeconds;
    }
    /**
     * Gets the firewallIPSecExemptionsAllowDHCP property value. Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowDHCP() {
        return this.firewallIPSecExemptionsAllowDHCP;
    }
    /**
     * Gets the firewallIPSecExemptionsAllowICMP property value. Configures IPSec exemptions to allow ICMP
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowICMP() {
        return this.firewallIPSecExemptionsAllowICMP;
    }
    /**
     * Gets the firewallIPSecExemptionsAllowNeighborDiscovery property value. Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowNeighborDiscovery() {
        return this.firewallIPSecExemptionsAllowNeighborDiscovery;
    }
    /**
     * Gets the firewallIPSecExemptionsAllowRouterDiscovery property value. Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowRouterDiscovery() {
        return this.firewallIPSecExemptionsAllowRouterDiscovery;
    }
    /**
     * Gets the firewallIPSecExemptionsNone property value. Configures IPSec exemptions to no exemptions
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsNone() {
        return this.firewallIPSecExemptionsNone;
    }
    /**
     * Gets the firewallMergeKeyingModuleSettings property value. If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallMergeKeyingModuleSettings() {
        return this.firewallMergeKeyingModuleSettings;
    }
    /**
     * Gets the firewallPacketQueueingMethod property value. Possible values for firewallPacketQueueingMethod
     * @return a FirewallPacketQueueingMethodType
     */
    @javax.annotation.Nullable
    public FirewallPacketQueueingMethodType getFirewallPacketQueueingMethod() {
        return this.firewallPacketQueueingMethod;
    }
    /**
     * Gets the firewallPreSharedKeyEncodingMethod property value. Possible values for firewallPreSharedKeyEncodingMethod
     * @return a FirewallPreSharedKeyEncodingMethodType
     */
    @javax.annotation.Nullable
    public FirewallPreSharedKeyEncodingMethodType getFirewallPreSharedKeyEncodingMethod() {
        return this.firewallPreSharedKeyEncodingMethod;
    }
    /**
     * Gets the firewallProfileDomain property value. Configures the firewall profile settings for domain networks
     * @return a windowsFirewallNetworkProfile
     */
    @javax.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfileDomain() {
        return this.firewallProfileDomain;
    }
    /**
     * Gets the firewallProfilePrivate property value. Configures the firewall profile settings for private networks
     * @return a windowsFirewallNetworkProfile
     */
    @javax.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfilePrivate() {
        return this.firewallProfilePrivate;
    }
    /**
     * Gets the firewallProfilePublic property value. Configures the firewall profile settings for public networks
     * @return a windowsFirewallNetworkProfile
     */
    @javax.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfilePublic() {
        return this.firewallProfilePublic;
    }
    /**
     * Gets the firewallRules property value. Configures the firewall rule settings. This collection can contain a maximum of 150 elements.
     * @return a windowsFirewallRule
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsFirewallRule> getFirewallRules() {
        return this.firewallRules;
    }
    /**
     * Gets the lanManagerAuthenticationLevel property value. Possible values for LanManagerAuthenticationLevel
     * @return a LanManagerAuthenticationLevel
     */
    @javax.annotation.Nullable
    public LanManagerAuthenticationLevel getLanManagerAuthenticationLevel() {
        return this.lanManagerAuthenticationLevel;
    }
    /**
     * Gets the lanManagerWorkstationDisableInsecureGuestLogons property value. If enabled,the SMB client will allow insecure guest logons. If not configured, the SMB client will reject insecure guest logons.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLanManagerWorkstationDisableInsecureGuestLogons() {
        return this.lanManagerWorkstationDisableInsecureGuestLogons;
    }
    /**
     * Gets the localSecurityOptionsAdministratorAccountName property value. Define a different account name to be associated with the security identifier (SID) for the account 'Administrator'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalSecurityOptionsAdministratorAccountName() {
        return this.localSecurityOptionsAdministratorAccountName;
    }
    /**
     * Gets the localSecurityOptionsAdministratorElevationPromptBehavior property value. Possible values for LocalSecurityOptionsAdministratorElevationPromptBehavior
     * @return a LocalSecurityOptionsAdministratorElevationPromptBehaviorType
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsAdministratorElevationPromptBehaviorType getLocalSecurityOptionsAdministratorElevationPromptBehavior() {
        return this.localSecurityOptionsAdministratorElevationPromptBehavior;
    }
    /**
     * Gets the localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares property value. This security setting determines whether to allows anonymous users to perform certain activities, such as enumerating the names of domain accounts and network shares.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares() {
        return this.localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares;
    }
    /**
     * Gets the localSecurityOptionsAllowPKU2UAuthenticationRequests property value. Block PKU2U authentication requests to this device to use online identities.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowPKU2UAuthenticationRequests() {
        return this.localSecurityOptionsAllowPKU2UAuthenticationRequests;
    }
    /**
     * Gets the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager property value. Edit the default Security Descriptor Definition Language string to allow or deny users and groups to make remote calls to the SAM.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager() {
        return this.localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager;
    }
    /**
     * Gets the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool property value. UI helper boolean for LocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager entity
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool() {
        return this.localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool;
    }
    /**
     * Gets the localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn property value. This security setting determines whether a computer can be shut down without having to log on to Windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn() {
        return this.localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn;
    }
    /**
     * Gets the localSecurityOptionsAllowUIAccessApplicationElevation property value. Allow UIAccess apps to prompt for elevation without using the secure desktop.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowUIAccessApplicationElevation() {
        return this.localSecurityOptionsAllowUIAccessApplicationElevation;
    }
    /**
     * Gets the localSecurityOptionsAllowUIAccessApplicationsForSecureLocations property value. Allow UIAccess apps to prompt for elevation without using the secure desktop.Default is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowUIAccessApplicationsForSecureLocations() {
        return this.localSecurityOptionsAllowUIAccessApplicationsForSecureLocations;
    }
    /**
     * Gets the localSecurityOptionsAllowUndockWithoutHavingToLogon property value. Prevent a portable computer from being undocked without having to log in.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowUndockWithoutHavingToLogon() {
        return this.localSecurityOptionsAllowUndockWithoutHavingToLogon;
    }
    /**
     * Gets the localSecurityOptionsBlockMicrosoftAccounts property value. Prevent users from adding new Microsoft accounts to this computer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsBlockMicrosoftAccounts() {
        return this.localSecurityOptionsBlockMicrosoftAccounts;
    }
    /**
     * Gets the localSecurityOptionsBlockRemoteLogonWithBlankPassword property value. Enable Local accounts that are not password protected to log on from locations other than the physical device.Default is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsBlockRemoteLogonWithBlankPassword() {
        return this.localSecurityOptionsBlockRemoteLogonWithBlankPassword;
    }
    /**
     * Gets the localSecurityOptionsBlockRemoteOpticalDriveAccess property value. Enabling this settings allows only interactively logged on user to access CD-ROM media.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsBlockRemoteOpticalDriveAccess() {
        return this.localSecurityOptionsBlockRemoteOpticalDriveAccess;
    }
    /**
     * Gets the localSecurityOptionsBlockUsersInstallingPrinterDrivers property value. Restrict installing printer drivers as part of connecting to a shared printer to admins only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsBlockUsersInstallingPrinterDrivers() {
        return this.localSecurityOptionsBlockUsersInstallingPrinterDrivers;
    }
    /**
     * Gets the localSecurityOptionsClearVirtualMemoryPageFile property value. This security setting determines whether the virtual memory pagefile is cleared when the system is shut down.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsClearVirtualMemoryPageFile() {
        return this.localSecurityOptionsClearVirtualMemoryPageFile;
    }
    /**
     * Gets the localSecurityOptionsClientDigitallySignCommunicationsAlways property value. This security setting determines whether packet signing is required by the SMB client component.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsClientDigitallySignCommunicationsAlways() {
        return this.localSecurityOptionsClientDigitallySignCommunicationsAlways;
    }
    /**
     * Gets the localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers property value. If this security setting is enabled, the Server Message Block (SMB) redirector is allowed to send plaintext passwords to non-Microsoft SMB servers that do not support password encryption during authentication.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers() {
        return this.localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers;
    }
    /**
     * Gets the localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation property value. App installations requiring elevated privileges will prompt for admin credentials.Default is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDetectApplicationInstallationsAndPromptForElevation() {
        return this.localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation;
    }
    /**
     * Gets the localSecurityOptionsDisableAdministratorAccount property value. Determines whether the Local Administrator account is enabled or disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableAdministratorAccount() {
        return this.localSecurityOptionsDisableAdministratorAccount;
    }
    /**
     * Gets the localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees property value. This security setting determines whether the SMB client attempts to negotiate SMB packet signing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees() {
        return this.localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees;
    }
    /**
     * Gets the localSecurityOptionsDisableGuestAccount property value. Determines if the Guest account is enabled or disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableGuestAccount() {
        return this.localSecurityOptionsDisableGuestAccount;
    }
    /**
     * Gets the localSecurityOptionsDisableServerDigitallySignCommunicationsAlways property value. This security setting determines whether packet signing is required by the SMB server component.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableServerDigitallySignCommunicationsAlways() {
        return this.localSecurityOptionsDisableServerDigitallySignCommunicationsAlways;
    }
    /**
     * Gets the localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees property value. This security setting determines whether the SMB server will negotiate SMB packet signing with clients that request it.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees() {
        return this.localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees;
    }
    /**
     * Gets the localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts property value. This security setting determines what additional permissions will be granted for anonymous connections to the computer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts() {
        return this.localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts;
    }
    /**
     * Gets the localSecurityOptionsDoNotRequireCtrlAltDel property value. Require CTRL+ALT+DEL to be pressed before a user can log on.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDoNotRequireCtrlAltDel() {
        return this.localSecurityOptionsDoNotRequireCtrlAltDel;
    }
    /**
     * Gets the localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange property value. This security setting determines if, at the next password change, the LAN Manager (LM) hash value for the new password is stored. Its not stored by default.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange() {
        return this.localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange;
    }
    /**
     * Gets the localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser property value. Possible values for LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser
     * @return a LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType getLocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser() {
        return this.localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser;
    }
    /**
     * Gets the localSecurityOptionsGuestAccountName property value. Define a different account name to be associated with the security identifier (SID) for the account 'Guest'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalSecurityOptionsGuestAccountName() {
        return this.localSecurityOptionsGuestAccountName;
    }
    /**
     * Gets the localSecurityOptionsHideLastSignedInUser property value. Do not display the username of the last person who signed in on this device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsHideLastSignedInUser() {
        return this.localSecurityOptionsHideLastSignedInUser;
    }
    /**
     * Gets the localSecurityOptionsHideUsernameAtSignIn property value. Do not display the username of the person signing in to this device after credentials are entered and before the devices desktop is shown.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsHideUsernameAtSignIn() {
        return this.localSecurityOptionsHideUsernameAtSignIn;
    }
    /**
     * Gets the localSecurityOptionsInformationDisplayedOnLockScreen property value. Possible values for LocalSecurityOptionsInformationDisplayedOnLockScreen
     * @return a LocalSecurityOptionsInformationDisplayedOnLockScreenType
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsInformationDisplayedOnLockScreenType getLocalSecurityOptionsInformationDisplayedOnLockScreen() {
        return this.localSecurityOptionsInformationDisplayedOnLockScreen;
    }
    /**
     * Gets the localSecurityOptionsInformationShownOnLockScreen property value. Possible values for LocalSecurityOptionsInformationShownOnLockScreenType
     * @return a LocalSecurityOptionsInformationShownOnLockScreenType
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsInformationShownOnLockScreenType getLocalSecurityOptionsInformationShownOnLockScreen() {
        return this.localSecurityOptionsInformationShownOnLockScreen;
    }
    /**
     * Gets the localSecurityOptionsLogOnMessageText property value. Set message text for users attempting to log in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalSecurityOptionsLogOnMessageText() {
        return this.localSecurityOptionsLogOnMessageText;
    }
    /**
     * Gets the localSecurityOptionsLogOnMessageTitle property value. Set message title for users attempting to log in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalSecurityOptionsLogOnMessageTitle() {
        return this.localSecurityOptionsLogOnMessageTitle;
    }
    /**
     * Gets the localSecurityOptionsMachineInactivityLimit property value. Define maximum minutes of inactivity on the interactive desktops login screen until the screen saver runs. Valid values 0 to 9999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLocalSecurityOptionsMachineInactivityLimit() {
        return this.localSecurityOptionsMachineInactivityLimit;
    }
    /**
     * Gets the localSecurityOptionsMachineInactivityLimitInMinutes property value. Define maximum minutes of inactivity on the interactive desktops login screen until the screen saver runs. Valid values 0 to 9999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLocalSecurityOptionsMachineInactivityLimitInMinutes() {
        return this.localSecurityOptionsMachineInactivityLimitInMinutes;
    }
    /**
     * Gets the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients property value. Possible values for LocalSecurityOptionsMinimumSessionSecurity
     * @return a LocalSecurityOptionsMinimumSessionSecurity
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsMinimumSessionSecurity getLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients() {
        return this.localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients;
    }
    /**
     * Gets the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers property value. Possible values for LocalSecurityOptionsMinimumSessionSecurity
     * @return a LocalSecurityOptionsMinimumSessionSecurity
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsMinimumSessionSecurity getLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers() {
        return this.localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers;
    }
    /**
     * Gets the localSecurityOptionsOnlyElevateSignedExecutables property value. Enforce PKI certification path validation for a given executable file before it is permitted to run.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsOnlyElevateSignedExecutables() {
        return this.localSecurityOptionsOnlyElevateSignedExecutables;
    }
    /**
     * Gets the localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares property value. By default, this security setting restricts anonymous access to shares and pipes to the settings for named pipes that can be accessed anonymously and Shares that can be accessed anonymously
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares() {
        return this.localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares;
    }
    /**
     * Gets the localSecurityOptionsSmartCardRemovalBehavior property value. Possible values for LocalSecurityOptionsSmartCardRemovalBehaviorType
     * @return a LocalSecurityOptionsSmartCardRemovalBehaviorType
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsSmartCardRemovalBehaviorType getLocalSecurityOptionsSmartCardRemovalBehavior() {
        return this.localSecurityOptionsSmartCardRemovalBehavior;
    }
    /**
     * Gets the localSecurityOptionsStandardUserElevationPromptBehavior property value. Possible values for LocalSecurityOptionsStandardUserElevationPromptBehavior
     * @return a LocalSecurityOptionsStandardUserElevationPromptBehaviorType
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsStandardUserElevationPromptBehaviorType getLocalSecurityOptionsStandardUserElevationPromptBehavior() {
        return this.localSecurityOptionsStandardUserElevationPromptBehavior;
    }
    /**
     * Gets the localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation property value. Enable all elevation requests to go to the interactive user's desktop rather than the secure desktop. Prompt behavior policy settings for admins and standard users are used.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation() {
        return this.localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation;
    }
    /**
     * Gets the localSecurityOptionsUseAdminApprovalMode property value. Defines whether the built-in admin account uses Admin Approval Mode or runs all apps with full admin privileges.Default is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsUseAdminApprovalMode() {
        return this.localSecurityOptionsUseAdminApprovalMode;
    }
    /**
     * Gets the localSecurityOptionsUseAdminApprovalModeForAdministrators property value. Define whether Admin Approval Mode and all UAC policy settings are enabled, default is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsUseAdminApprovalModeForAdministrators() {
        return this.localSecurityOptionsUseAdminApprovalModeForAdministrators;
    }
    /**
     * Gets the localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations property value. Virtualize file and registry write failures to per user locations
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations() {
        return this.localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations;
    }
    /**
     * Gets the smartScreenBlockOverrideForFiles property value. Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenBlockOverrideForFiles() {
        return this.smartScreenBlockOverrideForFiles;
    }
    /**
     * Gets the smartScreenEnableInShell property value. Allows IT Admins to configure SmartScreen for Windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenEnableInShell() {
        return this.smartScreenEnableInShell;
    }
    /**
     * Gets the userRightsAccessCredentialManagerAsTrustedCaller property value. This user right is used by Credential Manager during Backup/Restore. Users' saved credentials might be compromised if this privilege is given to other entities. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsAccessCredentialManagerAsTrustedCaller() {
        return this.userRightsAccessCredentialManagerAsTrustedCaller;
    }
    /**
     * Gets the userRightsActAsPartOfTheOperatingSystem property value. This user right allows a process to impersonate any user without authentication. The process can therefore gain access to the same local resources as that user. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsActAsPartOfTheOperatingSystem() {
        return this.userRightsActAsPartOfTheOperatingSystem;
    }
    /**
     * Gets the userRightsAllowAccessFromNetwork property value. This user right determines which users and groups are allowed to connect to the computer over the network. State Allowed is supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsAllowAccessFromNetwork() {
        return this.userRightsAllowAccessFromNetwork;
    }
    /**
     * Gets the userRightsBackupData property value. This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when backing up files and directories. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsBackupData() {
        return this.userRightsBackupData;
    }
    /**
     * Gets the userRightsBlockAccessFromNetwork property value. This user right determines which users and groups are block from connecting to the computer over the network. State Block is supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsBlockAccessFromNetwork() {
        return this.userRightsBlockAccessFromNetwork;
    }
    /**
     * Gets the userRightsChangeSystemTime property value. This user right determines which users and groups can change the time and date on the internal clock of the computer. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsChangeSystemTime() {
        return this.userRightsChangeSystemTime;
    }
    /**
     * Gets the userRightsCreateGlobalObjects property value. This security setting determines whether users can create global objects that are available to all sessions. Users who can create global objects could affect processes that run under other users' sessions, which could lead to application failure or data corruption. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreateGlobalObjects() {
        return this.userRightsCreateGlobalObjects;
    }
    /**
     * Gets the userRightsCreatePageFile property value. This user right determines which users and groups can call an internal API to create and change the size of a page file. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreatePageFile() {
        return this.userRightsCreatePageFile;
    }
    /**
     * Gets the userRightsCreatePermanentSharedObjects property value. This user right determines which accounts can be used by processes to create a directory object using the object manager. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreatePermanentSharedObjects() {
        return this.userRightsCreatePermanentSharedObjects;
    }
    /**
     * Gets the userRightsCreateSymbolicLinks property value. This user right determines if the user can create a symbolic link from the computer to which they are logged on. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreateSymbolicLinks() {
        return this.userRightsCreateSymbolicLinks;
    }
    /**
     * Gets the userRightsCreateToken property value. This user right determines which users/groups can be used by processes to create a token that can then be used to get access to any local resources when the process uses an internal API to create an access token. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreateToken() {
        return this.userRightsCreateToken;
    }
    /**
     * Gets the userRightsDebugPrograms property value. This user right determines which users can attach a debugger to any process or to the kernel. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsDebugPrograms() {
        return this.userRightsDebugPrograms;
    }
    /**
     * Gets the userRightsDelegation property value. This user right determines which users can set the Trusted for Delegation setting on a user or computer object. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsDelegation() {
        return this.userRightsDelegation;
    }
    /**
     * Gets the userRightsDenyLocalLogOn property value. This user right determines which users cannot log on to the computer. States NotConfigured, Blocked are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsDenyLocalLogOn() {
        return this.userRightsDenyLocalLogOn;
    }
    /**
     * Gets the userRightsGenerateSecurityAudits property value. This user right determines which accounts can be used by a process to add entries to the security log. The security log is used to trace unauthorized system access.  Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsGenerateSecurityAudits() {
        return this.userRightsGenerateSecurityAudits;
    }
    /**
     * Gets the userRightsImpersonateClient property value. Assigning this user right to a user allows programs running on behalf of that user to impersonate a client. Requiring this user right for this kind of impersonation prevents an unauthorized user from convincing a client to connect to a service that they have created and then impersonating that client, which can elevate the unauthorized user's permissions to administrative or system levels. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsImpersonateClient() {
        return this.userRightsImpersonateClient;
    }
    /**
     * Gets the userRightsIncreaseSchedulingPriority property value. This user right determines which accounts can use a process with Write Property access to another process to increase the execution priority assigned to the other process. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsIncreaseSchedulingPriority() {
        return this.userRightsIncreaseSchedulingPriority;
    }
    /**
     * Gets the userRightsLoadUnloadDrivers property value. This user right determines which users can dynamically load and unload device drivers or other code in to kernel mode. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsLoadUnloadDrivers() {
        return this.userRightsLoadUnloadDrivers;
    }
    /**
     * Gets the userRightsLocalLogOn property value. This user right determines which users can log on to the computer. States NotConfigured, Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsLocalLogOn() {
        return this.userRightsLocalLogOn;
    }
    /**
     * Gets the userRightsLockMemory property value. This user right determines which accounts can use a process to keep data in physical memory, which prevents the system from paging the data to virtual memory on disk. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsLockMemory() {
        return this.userRightsLockMemory;
    }
    /**
     * Gets the userRightsManageAuditingAndSecurityLogs property value. This user right determines which users can specify object access auditing options for individual resources, such as files, Active Directory objects, and registry keys. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsManageAuditingAndSecurityLogs() {
        return this.userRightsManageAuditingAndSecurityLogs;
    }
    /**
     * Gets the userRightsManageVolumes property value. This user right determines which users and groups can run maintenance tasks on a volume, such as remote defragmentation. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsManageVolumes() {
        return this.userRightsManageVolumes;
    }
    /**
     * Gets the userRightsModifyFirmwareEnvironment property value. This user right determines who can modify firmware environment values. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsModifyFirmwareEnvironment() {
        return this.userRightsModifyFirmwareEnvironment;
    }
    /**
     * Gets the userRightsModifyObjectLabels property value. This user right determines which user accounts can modify the integrity label of objects, such as files, registry keys, or processes owned by other users. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsModifyObjectLabels() {
        return this.userRightsModifyObjectLabels;
    }
    /**
     * Gets the userRightsProfileSingleProcess property value. This user right determines which users can use performance monitoring tools to monitor the performance of system processes. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsProfileSingleProcess() {
        return this.userRightsProfileSingleProcess;
    }
    /**
     * Gets the userRightsRemoteDesktopServicesLogOn property value. This user right determines which users and groups are prohibited from logging on as a Remote Desktop Services client. Only states NotConfigured and Blocked are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsRemoteDesktopServicesLogOn() {
        return this.userRightsRemoteDesktopServicesLogOn;
    }
    /**
     * Gets the userRightsRemoteShutdown property value. This user right determines which users are allowed to shut down a computer from a remote location on the network. Misuse of this user right can result in a denial of service. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsRemoteShutdown() {
        return this.userRightsRemoteShutdown;
    }
    /**
     * Gets the userRightsRestoreData property value. This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when restoring backed up files and directories, and determines which users can set any valid security principal as the owner of an object. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsRestoreData() {
        return this.userRightsRestoreData;
    }
    /**
     * Gets the userRightsTakeOwnership property value. This user right determines which users can take ownership of any securable object in the system, including Active Directory objects, files and folders, printers, registry keys, processes, and threads. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsTakeOwnership() {
        return this.userRightsTakeOwnership;
    }
    /**
     * Gets the windowsDefenderTamperProtection property value. Defender TamperProtection setting options
     * @return a WindowsDefenderTamperProtectionOptions
     */
    @javax.annotation.Nullable
    public WindowsDefenderTamperProtectionOptions getWindowsDefenderTamperProtection() {
        return this.windowsDefenderTamperProtection;
    }
    /**
     * Gets the xboxServicesAccessoryManagementServiceStartupMode property value. Possible values of xbox service start type
     * @return a ServiceStartType
     */
    @javax.annotation.Nullable
    public ServiceStartType getXboxServicesAccessoryManagementServiceStartupMode() {
        return this.xboxServicesAccessoryManagementServiceStartupMode;
    }
    /**
     * Gets the xboxServicesEnableXboxGameSaveTask property value. This setting determines whether xbox game save is enabled (1) or disabled (0).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getXboxServicesEnableXboxGameSaveTask() {
        return this.xboxServicesEnableXboxGameSaveTask;
    }
    /**
     * Gets the xboxServicesLiveAuthManagerServiceStartupMode property value. Possible values of xbox service start type
     * @return a ServiceStartType
     */
    @javax.annotation.Nullable
    public ServiceStartType getXboxServicesLiveAuthManagerServiceStartupMode() {
        return this.xboxServicesLiveAuthManagerServiceStartupMode;
    }
    /**
     * Gets the xboxServicesLiveGameSaveServiceStartupMode property value. Possible values of xbox service start type
     * @return a ServiceStartType
     */
    @javax.annotation.Nullable
    public ServiceStartType getXboxServicesLiveGameSaveServiceStartupMode() {
        return this.xboxServicesLiveGameSaveServiceStartupMode;
    }
    /**
     * Gets the xboxServicesLiveNetworkingServiceStartupMode property value. Possible values of xbox service start type
     * @return a ServiceStartType
     */
    @javax.annotation.Nullable
    public ServiceStartType getXboxServicesLiveNetworkingServiceStartupMode() {
        return this.xboxServicesLiveNetworkingServiceStartupMode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardAllowCameraMicrophoneRedirection(@javax.annotation.Nullable final Boolean value) {
        this.applicationGuardAllowCameraMicrophoneRedirection = value;
    }
    /**
     * Sets the applicationGuardAllowFileSaveOnHost property value. Allow users to download files from Edge in the application guard container and save them on the host file system
     * @param value Value to set for the applicationGuardAllowFileSaveOnHost property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardAllowFileSaveOnHost(@javax.annotation.Nullable final Boolean value) {
        this.applicationGuardAllowFileSaveOnHost = value;
    }
    /**
     * Sets the applicationGuardAllowPersistence property value. Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)
     * @param value Value to set for the applicationGuardAllowPersistence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardAllowPersistence(@javax.annotation.Nullable final Boolean value) {
        this.applicationGuardAllowPersistence = value;
    }
    /**
     * Sets the applicationGuardAllowPrintToLocalPrinters property value. Allow printing to Local Printers from Container
     * @param value Value to set for the applicationGuardAllowPrintToLocalPrinters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardAllowPrintToLocalPrinters(@javax.annotation.Nullable final Boolean value) {
        this.applicationGuardAllowPrintToLocalPrinters = value;
    }
    /**
     * Sets the applicationGuardAllowPrintToNetworkPrinters property value. Allow printing to Network Printers from Container
     * @param value Value to set for the applicationGuardAllowPrintToNetworkPrinters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardAllowPrintToNetworkPrinters(@javax.annotation.Nullable final Boolean value) {
        this.applicationGuardAllowPrintToNetworkPrinters = value;
    }
    /**
     * Sets the applicationGuardAllowPrintToPDF property value. Allow printing to PDF from Container
     * @param value Value to set for the applicationGuardAllowPrintToPDF property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardAllowPrintToPDF(@javax.annotation.Nullable final Boolean value) {
        this.applicationGuardAllowPrintToPDF = value;
    }
    /**
     * Sets the applicationGuardAllowPrintToXPS property value. Allow printing to XPS from Container
     * @param value Value to set for the applicationGuardAllowPrintToXPS property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardAllowPrintToXPS(@javax.annotation.Nullable final Boolean value) {
        this.applicationGuardAllowPrintToXPS = value;
    }
    /**
     * Sets the applicationGuardAllowVirtualGPU property value. Allow application guard to use virtual GPU
     * @param value Value to set for the applicationGuardAllowVirtualGPU property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardAllowVirtualGPU(@javax.annotation.Nullable final Boolean value) {
        this.applicationGuardAllowVirtualGPU = value;
    }
    /**
     * Sets the applicationGuardBlockClipboardSharing property value. Possible values for applicationGuardBlockClipboardSharingType
     * @param value Value to set for the applicationGuardBlockClipboardSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardBlockClipboardSharing(@javax.annotation.Nullable final ApplicationGuardBlockClipboardSharingType value) {
        this.applicationGuardBlockClipboardSharing = value;
    }
    /**
     * Sets the applicationGuardBlockFileTransfer property value. Possible values for applicationGuardBlockFileTransfer
     * @param value Value to set for the applicationGuardBlockFileTransfer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardBlockFileTransfer(@javax.annotation.Nullable final ApplicationGuardBlockFileTransferType value) {
        this.applicationGuardBlockFileTransfer = value;
    }
    /**
     * Sets the applicationGuardBlockNonEnterpriseContent property value. Block enterprise sites to load non-enterprise content, such as third party plug-ins
     * @param value Value to set for the applicationGuardBlockNonEnterpriseContent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardBlockNonEnterpriseContent(@javax.annotation.Nullable final Boolean value) {
        this.applicationGuardBlockNonEnterpriseContent = value;
    }
    /**
     * Sets the applicationGuardCertificateThumbprints property value. Allows certain device level Root Certificates to be shared with the Microsoft Defender Application Guard container.
     * @param value Value to set for the applicationGuardCertificateThumbprints property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardCertificateThumbprints(@javax.annotation.Nullable final java.util.List<String> value) {
        this.applicationGuardCertificateThumbprints = value;
    }
    /**
     * Sets the applicationGuardEnabled property value. Enable Windows Defender Application Guard
     * @param value Value to set for the applicationGuardEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardEnabled(@javax.annotation.Nullable final Boolean value) {
        this.applicationGuardEnabled = value;
    }
    /**
     * Sets the applicationGuardEnabledOptions property value. Possible values for ApplicationGuardEnabledOptions
     * @param value Value to set for the applicationGuardEnabledOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardEnabledOptions(@javax.annotation.Nullable final ApplicationGuardEnabledOptions value) {
        this.applicationGuardEnabledOptions = value;
    }
    /**
     * Sets the applicationGuardForceAuditing property value. Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.)
     * @param value Value to set for the applicationGuardForceAuditing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationGuardForceAuditing(@javax.annotation.Nullable final Boolean value) {
        this.applicationGuardForceAuditing = value;
    }
    /**
     * Sets the appLockerApplicationControl property value. Possible values of AppLocker Application Control Types
     * @param value Value to set for the appLockerApplicationControl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppLockerApplicationControl(@javax.annotation.Nullable final AppLockerApplicationControlType value) {
        this.appLockerApplicationControl = value;
    }
    /**
     * Sets the bitLockerAllowStandardUserEncryption property value. Allows the admin to allow standard users to enable encrpytion during Azure AD Join.
     * @param value Value to set for the bitLockerAllowStandardUserEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitLockerAllowStandardUserEncryption(@javax.annotation.Nullable final Boolean value) {
        this.bitLockerAllowStandardUserEncryption = value;
    }
    /**
     * Sets the bitLockerDisableWarningForOtherDiskEncryption property value. Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
     * @param value Value to set for the bitLockerDisableWarningForOtherDiskEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitLockerDisableWarningForOtherDiskEncryption(@javax.annotation.Nullable final Boolean value) {
        this.bitLockerDisableWarningForOtherDiskEncryption = value;
    }
    /**
     * Sets the bitLockerEnableStorageCardEncryptionOnMobile property value. Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
     * @param value Value to set for the bitLockerEnableStorageCardEncryptionOnMobile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitLockerEnableStorageCardEncryptionOnMobile(@javax.annotation.Nullable final Boolean value) {
        this.bitLockerEnableStorageCardEncryptionOnMobile = value;
    }
    /**
     * Sets the bitLockerEncryptDevice property value. Allows the admin to require encryption to be turned on using BitLocker.
     * @param value Value to set for the bitLockerEncryptDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitLockerEncryptDevice(@javax.annotation.Nullable final Boolean value) {
        this.bitLockerEncryptDevice = value;
    }
    /**
     * Sets the bitLockerFixedDrivePolicy property value. BitLocker Fixed Drive Policy.
     * @param value Value to set for the bitLockerFixedDrivePolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitLockerFixedDrivePolicy(@javax.annotation.Nullable final BitLockerFixedDrivePolicy value) {
        this.bitLockerFixedDrivePolicy = value;
    }
    /**
     * Sets the bitLockerRecoveryPasswordRotation property value. BitLocker recovery password rotation type
     * @param value Value to set for the bitLockerRecoveryPasswordRotation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitLockerRecoveryPasswordRotation(@javax.annotation.Nullable final BitLockerRecoveryPasswordRotationType value) {
        this.bitLockerRecoveryPasswordRotation = value;
    }
    /**
     * Sets the bitLockerRemovableDrivePolicy property value. BitLocker Removable Drive Policy.
     * @param value Value to set for the bitLockerRemovableDrivePolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitLockerRemovableDrivePolicy(@javax.annotation.Nullable final BitLockerRemovableDrivePolicy value) {
        this.bitLockerRemovableDrivePolicy = value;
    }
    /**
     * Sets the bitLockerSystemDrivePolicy property value. BitLocker System Drive Policy.
     * @param value Value to set for the bitLockerSystemDrivePolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBitLockerSystemDrivePolicy(@javax.annotation.Nullable final BitLockerSystemDrivePolicy value) {
        this.bitLockerSystemDrivePolicy = value;
    }
    /**
     * Sets the defenderAdditionalGuardedFolders property value. List of folder paths to be added to the list of protected folders
     * @param value Value to set for the defenderAdditionalGuardedFolders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAdditionalGuardedFolders(@javax.annotation.Nullable final java.util.List<String> value) {
        this.defenderAdditionalGuardedFolders = value;
    }
    /**
     * Sets the defenderAdobeReaderLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderAdobeReaderLaunchChildProcess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAdobeReaderLaunchChildProcess(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderAdobeReaderLaunchChildProcess = value;
    }
    /**
     * Sets the defenderAdvancedRansomewareProtectionType property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderAdvancedRansomewareProtectionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAdvancedRansomewareProtectionType(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderAdvancedRansomewareProtectionType = value;
    }
    /**
     * Sets the defenderAllowBehaviorMonitoring property value. Allows or disallows Windows Defender Behavior Monitoring functionality.
     * @param value Value to set for the defenderAllowBehaviorMonitoring property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAllowBehaviorMonitoring(@javax.annotation.Nullable final Boolean value) {
        this.defenderAllowBehaviorMonitoring = value;
    }
    /**
     * Sets the defenderAllowCloudProtection property value. To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.
     * @param value Value to set for the defenderAllowCloudProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAllowCloudProtection(@javax.annotation.Nullable final Boolean value) {
        this.defenderAllowCloudProtection = value;
    }
    /**
     * Sets the defenderAllowEndUserAccess property value. Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.
     * @param value Value to set for the defenderAllowEndUserAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAllowEndUserAccess(@javax.annotation.Nullable final Boolean value) {
        this.defenderAllowEndUserAccess = value;
    }
    /**
     * Sets the defenderAllowIntrusionPreventionSystem property value. Allows or disallows Windows Defender Intrusion Prevention functionality.
     * @param value Value to set for the defenderAllowIntrusionPreventionSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAllowIntrusionPreventionSystem(@javax.annotation.Nullable final Boolean value) {
        this.defenderAllowIntrusionPreventionSystem = value;
    }
    /**
     * Sets the defenderAllowOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @param value Value to set for the defenderAllowOnAccessProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAllowOnAccessProtection(@javax.annotation.Nullable final Boolean value) {
        this.defenderAllowOnAccessProtection = value;
    }
    /**
     * Sets the defenderAllowRealTimeMonitoring property value. Allows or disallows Windows Defender Realtime Monitoring functionality.
     * @param value Value to set for the defenderAllowRealTimeMonitoring property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAllowRealTimeMonitoring(@javax.annotation.Nullable final Boolean value) {
        this.defenderAllowRealTimeMonitoring = value;
    }
    /**
     * Sets the defenderAllowScanArchiveFiles property value. Allows or disallows scanning of archives.
     * @param value Value to set for the defenderAllowScanArchiveFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAllowScanArchiveFiles(@javax.annotation.Nullable final Boolean value) {
        this.defenderAllowScanArchiveFiles = value;
    }
    /**
     * Sets the defenderAllowScanDownloads property value. Allows or disallows Windows Defender IOAVP Protection functionality.
     * @param value Value to set for the defenderAllowScanDownloads property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAllowScanDownloads(@javax.annotation.Nullable final Boolean value) {
        this.defenderAllowScanDownloads = value;
    }
    /**
     * Sets the defenderAllowScanNetworkFiles property value. Allows or disallows a scanning of network files.
     * @param value Value to set for the defenderAllowScanNetworkFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAllowScanNetworkFiles(@javax.annotation.Nullable final Boolean value) {
        this.defenderAllowScanNetworkFiles = value;
    }
    /**
     * Sets the defenderAllowScanRemovableDrivesDuringFullScan property value. Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.
     * @param value Value to set for the defenderAllowScanRemovableDrivesDuringFullScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAllowScanRemovableDrivesDuringFullScan(@javax.annotation.Nullable final Boolean value) {
        this.defenderAllowScanRemovableDrivesDuringFullScan = value;
    }
    /**
     * Sets the defenderAllowScanScriptsLoadedInInternetExplorer property value. Allows or disallows Windows Defender Script Scanning functionality.
     * @param value Value to set for the defenderAllowScanScriptsLoadedInInternetExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAllowScanScriptsLoadedInInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this.defenderAllowScanScriptsLoadedInInternetExplorer = value;
    }
    /**
     * Sets the defenderAttackSurfaceReductionExcludedPaths property value. List of exe files and folders to be excluded from attack surface reduction rules
     * @param value Value to set for the defenderAttackSurfaceReductionExcludedPaths property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderAttackSurfaceReductionExcludedPaths(@javax.annotation.Nullable final java.util.List<String> value) {
        this.defenderAttackSurfaceReductionExcludedPaths = value;
    }
    /**
     * Sets the defenderBlockEndUserAccess property value. Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.
     * @param value Value to set for the defenderBlockEndUserAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderBlockEndUserAccess(@javax.annotation.Nullable final Boolean value) {
        this.defenderBlockEndUserAccess = value;
    }
    /**
     * Sets the defenderBlockPersistenceThroughWmiType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderBlockPersistenceThroughWmiType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderBlockPersistenceThroughWmiType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.defenderBlockPersistenceThroughWmiType = value;
    }
    /**
     * Sets the defenderCheckForSignaturesBeforeRunningScan property value. This policy setting allows you to manage whether a check for new virus and spyware definitions will occur before running a scan.
     * @param value Value to set for the defenderCheckForSignaturesBeforeRunningScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderCheckForSignaturesBeforeRunningScan(@javax.annotation.Nullable final Boolean value) {
        this.defenderCheckForSignaturesBeforeRunningScan = value;
    }
    /**
     * Sets the defenderCloudBlockLevel property value. Added in Windows 10, version 1709. This policy setting determines how aggressive Windows Defender Antivirus will be in blocking and scanning suspicious files. Value type is integer. This feature requires the 'Join Microsoft MAPS' setting enabled in order to function. Possible values are: notConfigured, high, highPlus, zeroTolerance.
     * @param value Value to set for the defenderCloudBlockLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderCloudBlockLevel(@javax.annotation.Nullable final DefenderCloudBlockLevelType value) {
        this.defenderCloudBlockLevel = value;
    }
    /**
     * Sets the defenderCloudExtendedTimeoutInSeconds property value. Added in Windows 10, version 1709. This feature allows Windows Defender Antivirus to block a suspicious file for up to 60 seconds, and scan it in the cloud to make sure it's safe. Value type is integer, range is 0 - 50. This feature depends on three other MAPS settings the must all be enabled- 'Configure the 'Block at First Sight' feature; 'Join Microsoft MAPS'; 'Send file samples when further analysis is required'. Valid values 0 to 50
     * @param value Value to set for the defenderCloudExtendedTimeoutInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderCloudExtendedTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this.defenderCloudExtendedTimeoutInSeconds = value;
    }
    /**
     * Sets the defenderDaysBeforeDeletingQuarantinedMalware property value. Time period (in days) that quarantine items will be stored on the system. Valid values 0 to 90
     * @param value Value to set for the defenderDaysBeforeDeletingQuarantinedMalware property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDaysBeforeDeletingQuarantinedMalware(@javax.annotation.Nullable final Integer value) {
        this.defenderDaysBeforeDeletingQuarantinedMalware = value;
    }
    /**
     * Sets the defenderDetectedMalwareActions property value. Allows an administrator to specify any valid threat severity levels and the corresponding default action ID to take.
     * @param value Value to set for the defenderDetectedMalwareActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDetectedMalwareActions(@javax.annotation.Nullable final DefenderDetectedMalwareActions value) {
        this.defenderDetectedMalwareActions = value;
    }
    /**
     * Sets the defenderDisableBehaviorMonitoring property value. Allows or disallows Windows Defender Behavior Monitoring functionality.
     * @param value Value to set for the defenderDisableBehaviorMonitoring property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDisableBehaviorMonitoring(@javax.annotation.Nullable final Boolean value) {
        this.defenderDisableBehaviorMonitoring = value;
    }
    /**
     * Sets the defenderDisableCatchupFullScan property value. This policy setting allows you to configure catch-up scans for scheduled full scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.
     * @param value Value to set for the defenderDisableCatchupFullScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDisableCatchupFullScan(@javax.annotation.Nullable final Boolean value) {
        this.defenderDisableCatchupFullScan = value;
    }
    /**
     * Sets the defenderDisableCatchupQuickScan property value. This policy setting allows you to configure catch-up scans for scheduled quick scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.
     * @param value Value to set for the defenderDisableCatchupQuickScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDisableCatchupQuickScan(@javax.annotation.Nullable final Boolean value) {
        this.defenderDisableCatchupQuickScan = value;
    }
    /**
     * Sets the defenderDisableCloudProtection property value. To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.
     * @param value Value to set for the defenderDisableCloudProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDisableCloudProtection(@javax.annotation.Nullable final Boolean value) {
        this.defenderDisableCloudProtection = value;
    }
    /**
     * Sets the defenderDisableIntrusionPreventionSystem property value. Allows or disallows Windows Defender Intrusion Prevention functionality.
     * @param value Value to set for the defenderDisableIntrusionPreventionSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDisableIntrusionPreventionSystem(@javax.annotation.Nullable final Boolean value) {
        this.defenderDisableIntrusionPreventionSystem = value;
    }
    /**
     * Sets the defenderDisableOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @param value Value to set for the defenderDisableOnAccessProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDisableOnAccessProtection(@javax.annotation.Nullable final Boolean value) {
        this.defenderDisableOnAccessProtection = value;
    }
    /**
     * Sets the defenderDisableRealTimeMonitoring property value. Allows or disallows Windows Defender Realtime Monitoring functionality.
     * @param value Value to set for the defenderDisableRealTimeMonitoring property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDisableRealTimeMonitoring(@javax.annotation.Nullable final Boolean value) {
        this.defenderDisableRealTimeMonitoring = value;
    }
    /**
     * Sets the defenderDisableScanArchiveFiles property value. Allows or disallows scanning of archives.
     * @param value Value to set for the defenderDisableScanArchiveFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDisableScanArchiveFiles(@javax.annotation.Nullable final Boolean value) {
        this.defenderDisableScanArchiveFiles = value;
    }
    /**
     * Sets the defenderDisableScanDownloads property value. Allows or disallows Windows Defender IOAVP Protection functionality.
     * @param value Value to set for the defenderDisableScanDownloads property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDisableScanDownloads(@javax.annotation.Nullable final Boolean value) {
        this.defenderDisableScanDownloads = value;
    }
    /**
     * Sets the defenderDisableScanNetworkFiles property value. Allows or disallows a scanning of network files.
     * @param value Value to set for the defenderDisableScanNetworkFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDisableScanNetworkFiles(@javax.annotation.Nullable final Boolean value) {
        this.defenderDisableScanNetworkFiles = value;
    }
    /**
     * Sets the defenderDisableScanRemovableDrivesDuringFullScan property value. Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.
     * @param value Value to set for the defenderDisableScanRemovableDrivesDuringFullScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDisableScanRemovableDrivesDuringFullScan(@javax.annotation.Nullable final Boolean value) {
        this.defenderDisableScanRemovableDrivesDuringFullScan = value;
    }
    /**
     * Sets the defenderDisableScanScriptsLoadedInInternetExplorer property value. Allows or disallows Windows Defender Script Scanning functionality.
     * @param value Value to set for the defenderDisableScanScriptsLoadedInInternetExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDisableScanScriptsLoadedInInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this.defenderDisableScanScriptsLoadedInInternetExplorer = value;
    }
    /**
     * Sets the defenderEmailContentExecution property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderEmailContentExecution property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderEmailContentExecution(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderEmailContentExecution = value;
    }
    /**
     * Sets the defenderEmailContentExecutionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderEmailContentExecutionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderEmailContentExecutionType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.defenderEmailContentExecutionType = value;
    }
    /**
     * Sets the defenderEnableLowCpuPriority property value. This policy setting allows you to enable or disable low CPU priority for scheduled scans.
     * @param value Value to set for the defenderEnableLowCpuPriority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderEnableLowCpuPriority(@javax.annotation.Nullable final Boolean value) {
        this.defenderEnableLowCpuPriority = value;
    }
    /**
     * Sets the defenderEnableScanIncomingMail property value. Allows or disallows scanning of email.
     * @param value Value to set for the defenderEnableScanIncomingMail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderEnableScanIncomingMail(@javax.annotation.Nullable final Boolean value) {
        this.defenderEnableScanIncomingMail = value;
    }
    /**
     * Sets the defenderEnableScanMappedNetworkDrivesDuringFullScan property value. Allows or disallows a full scan of mapped network drives.
     * @param value Value to set for the defenderEnableScanMappedNetworkDrivesDuringFullScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderEnableScanMappedNetworkDrivesDuringFullScan(@javax.annotation.Nullable final Boolean value) {
        this.defenderEnableScanMappedNetworkDrivesDuringFullScan = value;
    }
    /**
     * Sets the defenderExploitProtectionXml property value. Xml content containing information regarding exploit protection details.
     * @param value Value to set for the defenderExploitProtectionXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderExploitProtectionXml(@javax.annotation.Nullable final byte[] value) {
        this.defenderExploitProtectionXml = value;
    }
    /**
     * Sets the defenderExploitProtectionXmlFileName property value. Name of the file from which DefenderExploitProtectionXml was obtained.
     * @param value Value to set for the defenderExploitProtectionXmlFileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderExploitProtectionXmlFileName(@javax.annotation.Nullable final String value) {
        this.defenderExploitProtectionXmlFileName = value;
    }
    /**
     * Sets the defenderFileExtensionsToExclude property value. File extensions to exclude from scans and real time protection.
     * @param value Value to set for the defenderFileExtensionsToExclude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderFileExtensionsToExclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this.defenderFileExtensionsToExclude = value;
    }
    /**
     * Sets the defenderFilesAndFoldersToExclude property value. Files and folder to exclude from scans and real time protection.
     * @param value Value to set for the defenderFilesAndFoldersToExclude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderFilesAndFoldersToExclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this.defenderFilesAndFoldersToExclude = value;
    }
    /**
     * Sets the defenderGuardedFoldersAllowedAppPaths property value. List of paths to exe that are allowed to access protected folders
     * @param value Value to set for the defenderGuardedFoldersAllowedAppPaths property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderGuardedFoldersAllowedAppPaths(@javax.annotation.Nullable final java.util.List<String> value) {
        this.defenderGuardedFoldersAllowedAppPaths = value;
    }
    /**
     * Sets the defenderGuardMyFoldersType property value. Possible values of Folder Protection
     * @param value Value to set for the defenderGuardMyFoldersType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderGuardMyFoldersType(@javax.annotation.Nullable final FolderProtectionType value) {
        this.defenderGuardMyFoldersType = value;
    }
    /**
     * Sets the defenderNetworkProtectionType property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderNetworkProtectionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderNetworkProtectionType(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderNetworkProtectionType = value;
    }
    /**
     * Sets the defenderOfficeAppsExecutableContentCreationOrLaunch property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeAppsExecutableContentCreationOrLaunch property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderOfficeAppsExecutableContentCreationOrLaunch(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderOfficeAppsExecutableContentCreationOrLaunch = value;
    }
    /**
     * Sets the defenderOfficeAppsExecutableContentCreationOrLaunchType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderOfficeAppsExecutableContentCreationOrLaunchType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderOfficeAppsExecutableContentCreationOrLaunchType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.defenderOfficeAppsExecutableContentCreationOrLaunchType = value;
    }
    /**
     * Sets the defenderOfficeAppsLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeAppsLaunchChildProcess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderOfficeAppsLaunchChildProcess(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderOfficeAppsLaunchChildProcess = value;
    }
    /**
     * Sets the defenderOfficeAppsLaunchChildProcessType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderOfficeAppsLaunchChildProcessType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderOfficeAppsLaunchChildProcessType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.defenderOfficeAppsLaunchChildProcessType = value;
    }
    /**
     * Sets the defenderOfficeAppsOtherProcessInjection property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeAppsOtherProcessInjection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderOfficeAppsOtherProcessInjection(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderOfficeAppsOtherProcessInjection = value;
    }
    /**
     * Sets the defenderOfficeAppsOtherProcessInjectionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderOfficeAppsOtherProcessInjectionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderOfficeAppsOtherProcessInjectionType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.defenderOfficeAppsOtherProcessInjectionType = value;
    }
    /**
     * Sets the defenderOfficeCommunicationAppsLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeCommunicationAppsLaunchChildProcess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderOfficeCommunicationAppsLaunchChildProcess(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderOfficeCommunicationAppsLaunchChildProcess = value;
    }
    /**
     * Sets the defenderOfficeMacroCodeAllowWin32Imports property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeMacroCodeAllowWin32Imports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderOfficeMacroCodeAllowWin32Imports(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderOfficeMacroCodeAllowWin32Imports = value;
    }
    /**
     * Sets the defenderOfficeMacroCodeAllowWin32ImportsType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderOfficeMacroCodeAllowWin32ImportsType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderOfficeMacroCodeAllowWin32ImportsType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.defenderOfficeMacroCodeAllowWin32ImportsType = value;
    }
    /**
     * Sets the defenderPotentiallyUnwantedAppAction property value. Added in Windows 10, version 1607. Specifies the level of detection for potentially unwanted applications (PUAs). Windows Defender alerts you when potentially unwanted software is being downloaded or attempts to install itself on your computer. Possible values are: userDefined, enable, auditMode, warn, notConfigured.
     * @param value Value to set for the defenderPotentiallyUnwantedAppAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderPotentiallyUnwantedAppAction(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderPotentiallyUnwantedAppAction = value;
    }
    /**
     * Sets the defenderPreventCredentialStealingType property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderPreventCredentialStealingType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderPreventCredentialStealingType(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderPreventCredentialStealingType = value;
    }
    /**
     * Sets the defenderProcessCreation property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderProcessCreation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderProcessCreation(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderProcessCreation = value;
    }
    /**
     * Sets the defenderProcessCreationType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderProcessCreationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderProcessCreationType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.defenderProcessCreationType = value;
    }
    /**
     * Sets the defenderProcessesToExclude property value. Processes to exclude from scans and real time protection.
     * @param value Value to set for the defenderProcessesToExclude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderProcessesToExclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this.defenderProcessesToExclude = value;
    }
    /**
     * Sets the defenderScanDirection property value. Controls which sets of files should be monitored. Possible values are: monitorAllFiles, monitorIncomingFilesOnly, monitorOutgoingFilesOnly.
     * @param value Value to set for the defenderScanDirection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanDirection(@javax.annotation.Nullable final DefenderRealtimeScanDirection value) {
        this.defenderScanDirection = value;
    }
    /**
     * Sets the defenderScanMaxCpuPercentage property value. Represents the average CPU load factor for the Windows Defender scan (in percent). The default value is 50. Valid values 0 to 100
     * @param value Value to set for the defenderScanMaxCpuPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanMaxCpuPercentage(@javax.annotation.Nullable final Integer value) {
        this.defenderScanMaxCpuPercentage = value;
    }
    /**
     * Sets the defenderScanType property value. Selects whether to perform a quick scan or full scan. Possible values are: userDefined, disabled, quick, full.
     * @param value Value to set for the defenderScanType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanType(@javax.annotation.Nullable final DefenderScanType value) {
        this.defenderScanType = value;
    }
    /**
     * Sets the defenderScheduledQuickScanTime property value. Selects the time of day that the Windows Defender quick scan should run. For example, a value of 0=12:00AM, a value of 60=1:00AM, a value of 120=2:00, and so on, up to a value of 1380=11:00PM. The default value is 120
     * @param value Value to set for the defenderScheduledQuickScanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScheduledQuickScanTime(@javax.annotation.Nullable final LocalTime value) {
        this.defenderScheduledQuickScanTime = value;
    }
    /**
     * Sets the defenderScheduledScanDay property value. Selects the day that the Windows Defender scan should run. Possible values are: userDefined, everyday, sunday, monday, tuesday, wednesday, thursday, friday, saturday, noScheduledScan.
     * @param value Value to set for the defenderScheduledScanDay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScheduledScanDay(@javax.annotation.Nullable final WeeklySchedule value) {
        this.defenderScheduledScanDay = value;
    }
    /**
     * Sets the defenderScheduledScanTime property value. Selects the time of day that the Windows Defender scan should run.
     * @param value Value to set for the defenderScheduledScanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScheduledScanTime(@javax.annotation.Nullable final LocalTime value) {
        this.defenderScheduledScanTime = value;
    }
    /**
     * Sets the defenderScriptDownloadedPayloadExecution property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderScriptDownloadedPayloadExecution property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScriptDownloadedPayloadExecution(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderScriptDownloadedPayloadExecution = value;
    }
    /**
     * Sets the defenderScriptDownloadedPayloadExecutionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderScriptDownloadedPayloadExecutionType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScriptDownloadedPayloadExecutionType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.defenderScriptDownloadedPayloadExecutionType = value;
    }
    /**
     * Sets the defenderScriptObfuscatedMacroCode property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderScriptObfuscatedMacroCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScriptObfuscatedMacroCode(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderScriptObfuscatedMacroCode = value;
    }
    /**
     * Sets the defenderScriptObfuscatedMacroCodeType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderScriptObfuscatedMacroCodeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScriptObfuscatedMacroCodeType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.defenderScriptObfuscatedMacroCodeType = value;
    }
    /**
     * Sets the defenderSecurityCenterBlockExploitProtectionOverride property value. Indicates whether or not to block user from overriding Exploit Protection settings.
     * @param value Value to set for the defenderSecurityCenterBlockExploitProtectionOverride property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterBlockExploitProtectionOverride(@javax.annotation.Nullable final Boolean value) {
        this.defenderSecurityCenterBlockExploitProtectionOverride = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableAccountUI property value. Used to disable the display of the account protection area.
     * @param value Value to set for the defenderSecurityCenterDisableAccountUI property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterDisableAccountUI(@javax.annotation.Nullable final Boolean value) {
        this.defenderSecurityCenterDisableAccountUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableAppBrowserUI property value. Used to disable the display of the app and browser protection area.
     * @param value Value to set for the defenderSecurityCenterDisableAppBrowserUI property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterDisableAppBrowserUI(@javax.annotation.Nullable final Boolean value) {
        this.defenderSecurityCenterDisableAppBrowserUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableClearTpmUI property value. Used to disable the display of the Clear TPM button.
     * @param value Value to set for the defenderSecurityCenterDisableClearTpmUI property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterDisableClearTpmUI(@javax.annotation.Nullable final Boolean value) {
        this.defenderSecurityCenterDisableClearTpmUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableFamilyUI property value. Used to disable the display of the family options area.
     * @param value Value to set for the defenderSecurityCenterDisableFamilyUI property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterDisableFamilyUI(@javax.annotation.Nullable final Boolean value) {
        this.defenderSecurityCenterDisableFamilyUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableHardwareUI property value. Used to disable the display of the hardware protection area.
     * @param value Value to set for the defenderSecurityCenterDisableHardwareUI property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterDisableHardwareUI(@javax.annotation.Nullable final Boolean value) {
        this.defenderSecurityCenterDisableHardwareUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableHealthUI property value. Used to disable the display of the device performance and health area.
     * @param value Value to set for the defenderSecurityCenterDisableHealthUI property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterDisableHealthUI(@javax.annotation.Nullable final Boolean value) {
        this.defenderSecurityCenterDisableHealthUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableNetworkUI property value. Used to disable the display of the firewall and network protection area.
     * @param value Value to set for the defenderSecurityCenterDisableNetworkUI property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterDisableNetworkUI(@javax.annotation.Nullable final Boolean value) {
        this.defenderSecurityCenterDisableNetworkUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableNotificationAreaUI property value. Used to disable the display of the notification area control. The user needs to either sign out and sign in or reboot the computer for this setting to take effect.
     * @param value Value to set for the defenderSecurityCenterDisableNotificationAreaUI property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterDisableNotificationAreaUI(@javax.annotation.Nullable final Boolean value) {
        this.defenderSecurityCenterDisableNotificationAreaUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableRansomwareUI property value. Used to disable the display of the ransomware protection area.
     * @param value Value to set for the defenderSecurityCenterDisableRansomwareUI property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterDisableRansomwareUI(@javax.annotation.Nullable final Boolean value) {
        this.defenderSecurityCenterDisableRansomwareUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableSecureBootUI property value. Used to disable the display of the secure boot area under Device security.
     * @param value Value to set for the defenderSecurityCenterDisableSecureBootUI property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterDisableSecureBootUI(@javax.annotation.Nullable final Boolean value) {
        this.defenderSecurityCenterDisableSecureBootUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableTroubleshootingUI property value. Used to disable the display of the security process troubleshooting under Device security.
     * @param value Value to set for the defenderSecurityCenterDisableTroubleshootingUI property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterDisableTroubleshootingUI(@javax.annotation.Nullable final Boolean value) {
        this.defenderSecurityCenterDisableTroubleshootingUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableVirusUI property value. Used to disable the display of the virus and threat protection area.
     * @param value Value to set for the defenderSecurityCenterDisableVirusUI property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterDisableVirusUI(@javax.annotation.Nullable final Boolean value) {
        this.defenderSecurityCenterDisableVirusUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI property value. Used to disable the display of update TPM Firmware when a vulnerable firmware is detected.
     * @param value Value to set for the defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI(@javax.annotation.Nullable final Boolean value) {
        this.defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI = value;
    }
    /**
     * Sets the defenderSecurityCenterHelpEmail property value. The email address that is displayed to users.
     * @param value Value to set for the defenderSecurityCenterHelpEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterHelpEmail(@javax.annotation.Nullable final String value) {
        this.defenderSecurityCenterHelpEmail = value;
    }
    /**
     * Sets the defenderSecurityCenterHelpPhone property value. The phone number or Skype ID that is displayed to users.
     * @param value Value to set for the defenderSecurityCenterHelpPhone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterHelpPhone(@javax.annotation.Nullable final String value) {
        this.defenderSecurityCenterHelpPhone = value;
    }
    /**
     * Sets the defenderSecurityCenterHelpURL property value. The help portal URL this is displayed to users.
     * @param value Value to set for the defenderSecurityCenterHelpURL property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterHelpURL(@javax.annotation.Nullable final String value) {
        this.defenderSecurityCenterHelpURL = value;
    }
    /**
     * Sets the defenderSecurityCenterITContactDisplay property value. Possible values for defenderSecurityCenterITContactDisplay
     * @param value Value to set for the defenderSecurityCenterITContactDisplay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterITContactDisplay(@javax.annotation.Nullable final DefenderSecurityCenterITContactDisplayType value) {
        this.defenderSecurityCenterITContactDisplay = value;
    }
    /**
     * Sets the defenderSecurityCenterNotificationsFromApp property value. Possible values for defenderSecurityCenterNotificationsFromApp
     * @param value Value to set for the defenderSecurityCenterNotificationsFromApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterNotificationsFromApp(@javax.annotation.Nullable final DefenderSecurityCenterNotificationsFromAppType value) {
        this.defenderSecurityCenterNotificationsFromApp = value;
    }
    /**
     * Sets the defenderSecurityCenterOrganizationDisplayName property value. The company name that is displayed to the users.
     * @param value Value to set for the defenderSecurityCenterOrganizationDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSecurityCenterOrganizationDisplayName(@javax.annotation.Nullable final String value) {
        this.defenderSecurityCenterOrganizationDisplayName = value;
    }
    /**
     * Sets the defenderSignatureUpdateIntervalInHours property value. Specifies the interval (in hours) that will be used to check for signatures, so instead of using the ScheduleDay and ScheduleTime the check for new signatures will be set according to the interval. Valid values 0 to 24
     * @param value Value to set for the defenderSignatureUpdateIntervalInHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSignatureUpdateIntervalInHours(@javax.annotation.Nullable final Integer value) {
        this.defenderSignatureUpdateIntervalInHours = value;
    }
    /**
     * Sets the defenderSubmitSamplesConsentType property value. Checks for the user consent level in Windows Defender to send data. Possible values are: sendSafeSamplesAutomatically, alwaysPrompt, neverSend, sendAllSamplesAutomatically.
     * @param value Value to set for the defenderSubmitSamplesConsentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSubmitSamplesConsentType(@javax.annotation.Nullable final DefenderSubmitSamplesConsentType value) {
        this.defenderSubmitSamplesConsentType = value;
    }
    /**
     * Sets the defenderUntrustedExecutable property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderUntrustedExecutable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderUntrustedExecutable(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderUntrustedExecutable = value;
    }
    /**
     * Sets the defenderUntrustedExecutableType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderUntrustedExecutableType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderUntrustedExecutableType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.defenderUntrustedExecutableType = value;
    }
    /**
     * Sets the defenderUntrustedUSBProcess property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderUntrustedUSBProcess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderUntrustedUSBProcess(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderUntrustedUSBProcess = value;
    }
    /**
     * Sets the defenderUntrustedUSBProcessType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderUntrustedUSBProcessType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderUntrustedUSBProcessType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this.defenderUntrustedUSBProcessType = value;
    }
    /**
     * Sets the deviceGuardEnableSecureBootWithDMA property value. This property will be deprecated in May 2019 and will be replaced with property DeviceGuardSecureBootWithDMA. Specifies whether Platform Security Level is enabled at next reboot.
     * @param value Value to set for the deviceGuardEnableSecureBootWithDMA property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceGuardEnableSecureBootWithDMA(@javax.annotation.Nullable final Boolean value) {
        this.deviceGuardEnableSecureBootWithDMA = value;
    }
    /**
     * Sets the deviceGuardEnableVirtualizationBasedSecurity property value. Turns On Virtualization Based Security(VBS).
     * @param value Value to set for the deviceGuardEnableVirtualizationBasedSecurity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceGuardEnableVirtualizationBasedSecurity(@javax.annotation.Nullable final Boolean value) {
        this.deviceGuardEnableVirtualizationBasedSecurity = value;
    }
    /**
     * Sets the deviceGuardLaunchSystemGuard property value. Possible values of a property
     * @param value Value to set for the deviceGuardLaunchSystemGuard property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceGuardLaunchSystemGuard(@javax.annotation.Nullable final Enablement value) {
        this.deviceGuardLaunchSystemGuard = value;
    }
    /**
     * Sets the deviceGuardLocalSystemAuthorityCredentialGuardSettings property value. Possible values of Credential Guard settings.
     * @param value Value to set for the deviceGuardLocalSystemAuthorityCredentialGuardSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceGuardLocalSystemAuthorityCredentialGuardSettings(@javax.annotation.Nullable final DeviceGuardLocalSystemAuthorityCredentialGuardType value) {
        this.deviceGuardLocalSystemAuthorityCredentialGuardSettings = value;
    }
    /**
     * Sets the deviceGuardSecureBootWithDMA property value. Possible values of Secure Boot with DMA
     * @param value Value to set for the deviceGuardSecureBootWithDMA property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceGuardSecureBootWithDMA(@javax.annotation.Nullable final SecureBootWithDMAType value) {
        this.deviceGuardSecureBootWithDMA = value;
    }
    /**
     * Sets the dmaGuardDeviceEnumerationPolicy property value. Possible values of the DmaGuardDeviceEnumerationPolicy.
     * @param value Value to set for the dmaGuardDeviceEnumerationPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDmaGuardDeviceEnumerationPolicy(@javax.annotation.Nullable final DmaGuardDeviceEnumerationPolicyType value) {
        this.dmaGuardDeviceEnumerationPolicy = value;
    }
    /**
     * Sets the firewallBlockStatefulFTP property value. Blocks stateful FTP connections to the device
     * @param value Value to set for the firewallBlockStatefulFTP property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallBlockStatefulFTP(@javax.annotation.Nullable final Boolean value) {
        this.firewallBlockStatefulFTP = value;
    }
    /**
     * Sets the firewallCertificateRevocationListCheckMethod property value. Possible values for firewallCertificateRevocationListCheckMethod
     * @param value Value to set for the firewallCertificateRevocationListCheckMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallCertificateRevocationListCheckMethod(@javax.annotation.Nullable final FirewallCertificateRevocationListCheckMethodType value) {
        this.firewallCertificateRevocationListCheckMethod = value;
    }
    /**
     * Sets the firewallIdleTimeoutForSecurityAssociationInSeconds property value. Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600
     * @param value Value to set for the firewallIdleTimeoutForSecurityAssociationInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallIdleTimeoutForSecurityAssociationInSeconds(@javax.annotation.Nullable final Integer value) {
        this.firewallIdleTimeoutForSecurityAssociationInSeconds = value;
    }
    /**
     * Sets the firewallIPSecExemptionsAllowDHCP property value. Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
     * @param value Value to set for the firewallIPSecExemptionsAllowDHCP property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallIPSecExemptionsAllowDHCP(@javax.annotation.Nullable final Boolean value) {
        this.firewallIPSecExemptionsAllowDHCP = value;
    }
    /**
     * Sets the firewallIPSecExemptionsAllowICMP property value. Configures IPSec exemptions to allow ICMP
     * @param value Value to set for the firewallIPSecExemptionsAllowICMP property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallIPSecExemptionsAllowICMP(@javax.annotation.Nullable final Boolean value) {
        this.firewallIPSecExemptionsAllowICMP = value;
    }
    /**
     * Sets the firewallIPSecExemptionsAllowNeighborDiscovery property value. Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
     * @param value Value to set for the firewallIPSecExemptionsAllowNeighborDiscovery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallIPSecExemptionsAllowNeighborDiscovery(@javax.annotation.Nullable final Boolean value) {
        this.firewallIPSecExemptionsAllowNeighborDiscovery = value;
    }
    /**
     * Sets the firewallIPSecExemptionsAllowRouterDiscovery property value. Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
     * @param value Value to set for the firewallIPSecExemptionsAllowRouterDiscovery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallIPSecExemptionsAllowRouterDiscovery(@javax.annotation.Nullable final Boolean value) {
        this.firewallIPSecExemptionsAllowRouterDiscovery = value;
    }
    /**
     * Sets the firewallIPSecExemptionsNone property value. Configures IPSec exemptions to no exemptions
     * @param value Value to set for the firewallIPSecExemptionsNone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallIPSecExemptionsNone(@javax.annotation.Nullable final Boolean value) {
        this.firewallIPSecExemptionsNone = value;
    }
    /**
     * Sets the firewallMergeKeyingModuleSettings property value. If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set
     * @param value Value to set for the firewallMergeKeyingModuleSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallMergeKeyingModuleSettings(@javax.annotation.Nullable final Boolean value) {
        this.firewallMergeKeyingModuleSettings = value;
    }
    /**
     * Sets the firewallPacketQueueingMethod property value. Possible values for firewallPacketQueueingMethod
     * @param value Value to set for the firewallPacketQueueingMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallPacketQueueingMethod(@javax.annotation.Nullable final FirewallPacketQueueingMethodType value) {
        this.firewallPacketQueueingMethod = value;
    }
    /**
     * Sets the firewallPreSharedKeyEncodingMethod property value. Possible values for firewallPreSharedKeyEncodingMethod
     * @param value Value to set for the firewallPreSharedKeyEncodingMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallPreSharedKeyEncodingMethod(@javax.annotation.Nullable final FirewallPreSharedKeyEncodingMethodType value) {
        this.firewallPreSharedKeyEncodingMethod = value;
    }
    /**
     * Sets the firewallProfileDomain property value. Configures the firewall profile settings for domain networks
     * @param value Value to set for the firewallProfileDomain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallProfileDomain(@javax.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this.firewallProfileDomain = value;
    }
    /**
     * Sets the firewallProfilePrivate property value. Configures the firewall profile settings for private networks
     * @param value Value to set for the firewallProfilePrivate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallProfilePrivate(@javax.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this.firewallProfilePrivate = value;
    }
    /**
     * Sets the firewallProfilePublic property value. Configures the firewall profile settings for public networks
     * @param value Value to set for the firewallProfilePublic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallProfilePublic(@javax.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this.firewallProfilePublic = value;
    }
    /**
     * Sets the firewallRules property value. Configures the firewall rule settings. This collection can contain a maximum of 150 elements.
     * @param value Value to set for the firewallRules property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallRules(@javax.annotation.Nullable final java.util.List<WindowsFirewallRule> value) {
        this.firewallRules = value;
    }
    /**
     * Sets the lanManagerAuthenticationLevel property value. Possible values for LanManagerAuthenticationLevel
     * @param value Value to set for the lanManagerAuthenticationLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanManagerAuthenticationLevel(@javax.annotation.Nullable final LanManagerAuthenticationLevel value) {
        this.lanManagerAuthenticationLevel = value;
    }
    /**
     * Sets the lanManagerWorkstationDisableInsecureGuestLogons property value. If enabled,the SMB client will allow insecure guest logons. If not configured, the SMB client will reject insecure guest logons.
     * @param value Value to set for the lanManagerWorkstationDisableInsecureGuestLogons property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLanManagerWorkstationDisableInsecureGuestLogons(@javax.annotation.Nullable final Boolean value) {
        this.lanManagerWorkstationDisableInsecureGuestLogons = value;
    }
    /**
     * Sets the localSecurityOptionsAdministratorAccountName property value. Define a different account name to be associated with the security identifier (SID) for the account 'Administrator'.
     * @param value Value to set for the localSecurityOptionsAdministratorAccountName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsAdministratorAccountName(@javax.annotation.Nullable final String value) {
        this.localSecurityOptionsAdministratorAccountName = value;
    }
    /**
     * Sets the localSecurityOptionsAdministratorElevationPromptBehavior property value. Possible values for LocalSecurityOptionsAdministratorElevationPromptBehavior
     * @param value Value to set for the localSecurityOptionsAdministratorElevationPromptBehavior property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsAdministratorElevationPromptBehavior(@javax.annotation.Nullable final LocalSecurityOptionsAdministratorElevationPromptBehaviorType value) {
        this.localSecurityOptionsAdministratorElevationPromptBehavior = value;
    }
    /**
     * Sets the localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares property value. This security setting determines whether to allows anonymous users to perform certain activities, such as enumerating the names of domain accounts and network shares.
     * @param value Value to set for the localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares = value;
    }
    /**
     * Sets the localSecurityOptionsAllowPKU2UAuthenticationRequests property value. Block PKU2U authentication requests to this device to use online identities.
     * @param value Value to set for the localSecurityOptionsAllowPKU2UAuthenticationRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsAllowPKU2UAuthenticationRequests(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsAllowPKU2UAuthenticationRequests = value;
    }
    /**
     * Sets the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager property value. Edit the default Security Descriptor Definition Language string to allow or deny users and groups to make remote calls to the SAM.
     * @param value Value to set for the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager(@javax.annotation.Nullable final String value) {
        this.localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager = value;
    }
    /**
     * Sets the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool property value. UI helper boolean for LocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager entity
     * @param value Value to set for the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool = value;
    }
    /**
     * Sets the localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn property value. This security setting determines whether a computer can be shut down without having to log on to Windows.
     * @param value Value to set for the localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn = value;
    }
    /**
     * Sets the localSecurityOptionsAllowUIAccessApplicationElevation property value. Allow UIAccess apps to prompt for elevation without using the secure desktop.
     * @param value Value to set for the localSecurityOptionsAllowUIAccessApplicationElevation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsAllowUIAccessApplicationElevation(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsAllowUIAccessApplicationElevation = value;
    }
    /**
     * Sets the localSecurityOptionsAllowUIAccessApplicationsForSecureLocations property value. Allow UIAccess apps to prompt for elevation without using the secure desktop.Default is enabled
     * @param value Value to set for the localSecurityOptionsAllowUIAccessApplicationsForSecureLocations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsAllowUIAccessApplicationsForSecureLocations(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsAllowUIAccessApplicationsForSecureLocations = value;
    }
    /**
     * Sets the localSecurityOptionsAllowUndockWithoutHavingToLogon property value. Prevent a portable computer from being undocked without having to log in.
     * @param value Value to set for the localSecurityOptionsAllowUndockWithoutHavingToLogon property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsAllowUndockWithoutHavingToLogon(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsAllowUndockWithoutHavingToLogon = value;
    }
    /**
     * Sets the localSecurityOptionsBlockMicrosoftAccounts property value. Prevent users from adding new Microsoft accounts to this computer.
     * @param value Value to set for the localSecurityOptionsBlockMicrosoftAccounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsBlockMicrosoftAccounts(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsBlockMicrosoftAccounts = value;
    }
    /**
     * Sets the localSecurityOptionsBlockRemoteLogonWithBlankPassword property value. Enable Local accounts that are not password protected to log on from locations other than the physical device.Default is enabled
     * @param value Value to set for the localSecurityOptionsBlockRemoteLogonWithBlankPassword property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsBlockRemoteLogonWithBlankPassword(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsBlockRemoteLogonWithBlankPassword = value;
    }
    /**
     * Sets the localSecurityOptionsBlockRemoteOpticalDriveAccess property value. Enabling this settings allows only interactively logged on user to access CD-ROM media.
     * @param value Value to set for the localSecurityOptionsBlockRemoteOpticalDriveAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsBlockRemoteOpticalDriveAccess(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsBlockRemoteOpticalDriveAccess = value;
    }
    /**
     * Sets the localSecurityOptionsBlockUsersInstallingPrinterDrivers property value. Restrict installing printer drivers as part of connecting to a shared printer to admins only.
     * @param value Value to set for the localSecurityOptionsBlockUsersInstallingPrinterDrivers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsBlockUsersInstallingPrinterDrivers(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsBlockUsersInstallingPrinterDrivers = value;
    }
    /**
     * Sets the localSecurityOptionsClearVirtualMemoryPageFile property value. This security setting determines whether the virtual memory pagefile is cleared when the system is shut down.
     * @param value Value to set for the localSecurityOptionsClearVirtualMemoryPageFile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsClearVirtualMemoryPageFile(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsClearVirtualMemoryPageFile = value;
    }
    /**
     * Sets the localSecurityOptionsClientDigitallySignCommunicationsAlways property value. This security setting determines whether packet signing is required by the SMB client component.
     * @param value Value to set for the localSecurityOptionsClientDigitallySignCommunicationsAlways property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsClientDigitallySignCommunicationsAlways(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsClientDigitallySignCommunicationsAlways = value;
    }
    /**
     * Sets the localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers property value. If this security setting is enabled, the Server Message Block (SMB) redirector is allowed to send plaintext passwords to non-Microsoft SMB servers that do not support password encryption during authentication.
     * @param value Value to set for the localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers = value;
    }
    /**
     * Sets the localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation property value. App installations requiring elevated privileges will prompt for admin credentials.Default is enabled
     * @param value Value to set for the localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsDetectApplicationInstallationsAndPromptForElevation(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation = value;
    }
    /**
     * Sets the localSecurityOptionsDisableAdministratorAccount property value. Determines whether the Local Administrator account is enabled or disabled.
     * @param value Value to set for the localSecurityOptionsDisableAdministratorAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsDisableAdministratorAccount(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsDisableAdministratorAccount = value;
    }
    /**
     * Sets the localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees property value. This security setting determines whether the SMB client attempts to negotiate SMB packet signing.
     * @param value Value to set for the localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees = value;
    }
    /**
     * Sets the localSecurityOptionsDisableGuestAccount property value. Determines if the Guest account is enabled or disabled.
     * @param value Value to set for the localSecurityOptionsDisableGuestAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsDisableGuestAccount(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsDisableGuestAccount = value;
    }
    /**
     * Sets the localSecurityOptionsDisableServerDigitallySignCommunicationsAlways property value. This security setting determines whether packet signing is required by the SMB server component.
     * @param value Value to set for the localSecurityOptionsDisableServerDigitallySignCommunicationsAlways property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsDisableServerDigitallySignCommunicationsAlways(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsDisableServerDigitallySignCommunicationsAlways = value;
    }
    /**
     * Sets the localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees property value. This security setting determines whether the SMB server will negotiate SMB packet signing with clients that request it.
     * @param value Value to set for the localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees = value;
    }
    /**
     * Sets the localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts property value. This security setting determines what additional permissions will be granted for anonymous connections to the computer.
     * @param value Value to set for the localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts = value;
    }
    /**
     * Sets the localSecurityOptionsDoNotRequireCtrlAltDel property value. Require CTRL+ALT+DEL to be pressed before a user can log on.
     * @param value Value to set for the localSecurityOptionsDoNotRequireCtrlAltDel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsDoNotRequireCtrlAltDel(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsDoNotRequireCtrlAltDel = value;
    }
    /**
     * Sets the localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange property value. This security setting determines if, at the next password change, the LAN Manager (LM) hash value for the new password is stored. Its not stored by default.
     * @param value Value to set for the localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange = value;
    }
    /**
     * Sets the localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser property value. Possible values for LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser
     * @param value Value to set for the localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser(@javax.annotation.Nullable final LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType value) {
        this.localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser = value;
    }
    /**
     * Sets the localSecurityOptionsGuestAccountName property value. Define a different account name to be associated with the security identifier (SID) for the account 'Guest'.
     * @param value Value to set for the localSecurityOptionsGuestAccountName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsGuestAccountName(@javax.annotation.Nullable final String value) {
        this.localSecurityOptionsGuestAccountName = value;
    }
    /**
     * Sets the localSecurityOptionsHideLastSignedInUser property value. Do not display the username of the last person who signed in on this device.
     * @param value Value to set for the localSecurityOptionsHideLastSignedInUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsHideLastSignedInUser(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsHideLastSignedInUser = value;
    }
    /**
     * Sets the localSecurityOptionsHideUsernameAtSignIn property value. Do not display the username of the person signing in to this device after credentials are entered and before the devices desktop is shown.
     * @param value Value to set for the localSecurityOptionsHideUsernameAtSignIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsHideUsernameAtSignIn(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsHideUsernameAtSignIn = value;
    }
    /**
     * Sets the localSecurityOptionsInformationDisplayedOnLockScreen property value. Possible values for LocalSecurityOptionsInformationDisplayedOnLockScreen
     * @param value Value to set for the localSecurityOptionsInformationDisplayedOnLockScreen property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsInformationDisplayedOnLockScreen(@javax.annotation.Nullable final LocalSecurityOptionsInformationDisplayedOnLockScreenType value) {
        this.localSecurityOptionsInformationDisplayedOnLockScreen = value;
    }
    /**
     * Sets the localSecurityOptionsInformationShownOnLockScreen property value. Possible values for LocalSecurityOptionsInformationShownOnLockScreenType
     * @param value Value to set for the localSecurityOptionsInformationShownOnLockScreen property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsInformationShownOnLockScreen(@javax.annotation.Nullable final LocalSecurityOptionsInformationShownOnLockScreenType value) {
        this.localSecurityOptionsInformationShownOnLockScreen = value;
    }
    /**
     * Sets the localSecurityOptionsLogOnMessageText property value. Set message text for users attempting to log in.
     * @param value Value to set for the localSecurityOptionsLogOnMessageText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsLogOnMessageText(@javax.annotation.Nullable final String value) {
        this.localSecurityOptionsLogOnMessageText = value;
    }
    /**
     * Sets the localSecurityOptionsLogOnMessageTitle property value. Set message title for users attempting to log in.
     * @param value Value to set for the localSecurityOptionsLogOnMessageTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsLogOnMessageTitle(@javax.annotation.Nullable final String value) {
        this.localSecurityOptionsLogOnMessageTitle = value;
    }
    /**
     * Sets the localSecurityOptionsMachineInactivityLimit property value. Define maximum minutes of inactivity on the interactive desktops login screen until the screen saver runs. Valid values 0 to 9999
     * @param value Value to set for the localSecurityOptionsMachineInactivityLimit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsMachineInactivityLimit(@javax.annotation.Nullable final Integer value) {
        this.localSecurityOptionsMachineInactivityLimit = value;
    }
    /**
     * Sets the localSecurityOptionsMachineInactivityLimitInMinutes property value. Define maximum minutes of inactivity on the interactive desktops login screen until the screen saver runs. Valid values 0 to 9999
     * @param value Value to set for the localSecurityOptionsMachineInactivityLimitInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsMachineInactivityLimitInMinutes(@javax.annotation.Nullable final Integer value) {
        this.localSecurityOptionsMachineInactivityLimitInMinutes = value;
    }
    /**
     * Sets the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients property value. Possible values for LocalSecurityOptionsMinimumSessionSecurity
     * @param value Value to set for the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients(@javax.annotation.Nullable final LocalSecurityOptionsMinimumSessionSecurity value) {
        this.localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients = value;
    }
    /**
     * Sets the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers property value. Possible values for LocalSecurityOptionsMinimumSessionSecurity
     * @param value Value to set for the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers(@javax.annotation.Nullable final LocalSecurityOptionsMinimumSessionSecurity value) {
        this.localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers = value;
    }
    /**
     * Sets the localSecurityOptionsOnlyElevateSignedExecutables property value. Enforce PKI certification path validation for a given executable file before it is permitted to run.
     * @param value Value to set for the localSecurityOptionsOnlyElevateSignedExecutables property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsOnlyElevateSignedExecutables(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsOnlyElevateSignedExecutables = value;
    }
    /**
     * Sets the localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares property value. By default, this security setting restricts anonymous access to shares and pipes to the settings for named pipes that can be accessed anonymously and Shares that can be accessed anonymously
     * @param value Value to set for the localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares = value;
    }
    /**
     * Sets the localSecurityOptionsSmartCardRemovalBehavior property value. Possible values for LocalSecurityOptionsSmartCardRemovalBehaviorType
     * @param value Value to set for the localSecurityOptionsSmartCardRemovalBehavior property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsSmartCardRemovalBehavior(@javax.annotation.Nullable final LocalSecurityOptionsSmartCardRemovalBehaviorType value) {
        this.localSecurityOptionsSmartCardRemovalBehavior = value;
    }
    /**
     * Sets the localSecurityOptionsStandardUserElevationPromptBehavior property value. Possible values for LocalSecurityOptionsStandardUserElevationPromptBehavior
     * @param value Value to set for the localSecurityOptionsStandardUserElevationPromptBehavior property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsStandardUserElevationPromptBehavior(@javax.annotation.Nullable final LocalSecurityOptionsStandardUserElevationPromptBehaviorType value) {
        this.localSecurityOptionsStandardUserElevationPromptBehavior = value;
    }
    /**
     * Sets the localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation property value. Enable all elevation requests to go to the interactive user's desktop rather than the secure desktop. Prompt behavior policy settings for admins and standard users are used.
     * @param value Value to set for the localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation = value;
    }
    /**
     * Sets the localSecurityOptionsUseAdminApprovalMode property value. Defines whether the built-in admin account uses Admin Approval Mode or runs all apps with full admin privileges.Default is enabled
     * @param value Value to set for the localSecurityOptionsUseAdminApprovalMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsUseAdminApprovalMode(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsUseAdminApprovalMode = value;
    }
    /**
     * Sets the localSecurityOptionsUseAdminApprovalModeForAdministrators property value. Define whether Admin Approval Mode and all UAC policy settings are enabled, default is enabled
     * @param value Value to set for the localSecurityOptionsUseAdminApprovalModeForAdministrators property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsUseAdminApprovalModeForAdministrators(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsUseAdminApprovalModeForAdministrators = value;
    }
    /**
     * Sets the localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations property value. Virtualize file and registry write failures to per user locations
     * @param value Value to set for the localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations(@javax.annotation.Nullable final Boolean value) {
        this.localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations = value;
    }
    /**
     * Sets the smartScreenBlockOverrideForFiles property value. Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files.
     * @param value Value to set for the smartScreenBlockOverrideForFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmartScreenBlockOverrideForFiles(@javax.annotation.Nullable final Boolean value) {
        this.smartScreenBlockOverrideForFiles = value;
    }
    /**
     * Sets the smartScreenEnableInShell property value. Allows IT Admins to configure SmartScreen for Windows.
     * @param value Value to set for the smartScreenEnableInShell property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmartScreenEnableInShell(@javax.annotation.Nullable final Boolean value) {
        this.smartScreenEnableInShell = value;
    }
    /**
     * Sets the userRightsAccessCredentialManagerAsTrustedCaller property value. This user right is used by Credential Manager during Backup/Restore. Users' saved credentials might be compromised if this privilege is given to other entities. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsAccessCredentialManagerAsTrustedCaller property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsAccessCredentialManagerAsTrustedCaller(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsAccessCredentialManagerAsTrustedCaller = value;
    }
    /**
     * Sets the userRightsActAsPartOfTheOperatingSystem property value. This user right allows a process to impersonate any user without authentication. The process can therefore gain access to the same local resources as that user. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsActAsPartOfTheOperatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsActAsPartOfTheOperatingSystem(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsActAsPartOfTheOperatingSystem = value;
    }
    /**
     * Sets the userRightsAllowAccessFromNetwork property value. This user right determines which users and groups are allowed to connect to the computer over the network. State Allowed is supported.
     * @param value Value to set for the userRightsAllowAccessFromNetwork property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsAllowAccessFromNetwork(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsAllowAccessFromNetwork = value;
    }
    /**
     * Sets the userRightsBackupData property value. This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when backing up files and directories. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsBackupData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsBackupData(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsBackupData = value;
    }
    /**
     * Sets the userRightsBlockAccessFromNetwork property value. This user right determines which users and groups are block from connecting to the computer over the network. State Block is supported.
     * @param value Value to set for the userRightsBlockAccessFromNetwork property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsBlockAccessFromNetwork(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsBlockAccessFromNetwork = value;
    }
    /**
     * Sets the userRightsChangeSystemTime property value. This user right determines which users and groups can change the time and date on the internal clock of the computer. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsChangeSystemTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsChangeSystemTime(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsChangeSystemTime = value;
    }
    /**
     * Sets the userRightsCreateGlobalObjects property value. This security setting determines whether users can create global objects that are available to all sessions. Users who can create global objects could affect processes that run under other users' sessions, which could lead to application failure or data corruption. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreateGlobalObjects property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsCreateGlobalObjects(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsCreateGlobalObjects = value;
    }
    /**
     * Sets the userRightsCreatePageFile property value. This user right determines which users and groups can call an internal API to create and change the size of a page file. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreatePageFile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsCreatePageFile(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsCreatePageFile = value;
    }
    /**
     * Sets the userRightsCreatePermanentSharedObjects property value. This user right determines which accounts can be used by processes to create a directory object using the object manager. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreatePermanentSharedObjects property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsCreatePermanentSharedObjects(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsCreatePermanentSharedObjects = value;
    }
    /**
     * Sets the userRightsCreateSymbolicLinks property value. This user right determines if the user can create a symbolic link from the computer to which they are logged on. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreateSymbolicLinks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsCreateSymbolicLinks(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsCreateSymbolicLinks = value;
    }
    /**
     * Sets the userRightsCreateToken property value. This user right determines which users/groups can be used by processes to create a token that can then be used to get access to any local resources when the process uses an internal API to create an access token. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreateToken property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsCreateToken(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsCreateToken = value;
    }
    /**
     * Sets the userRightsDebugPrograms property value. This user right determines which users can attach a debugger to any process or to the kernel. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsDebugPrograms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsDebugPrograms(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsDebugPrograms = value;
    }
    /**
     * Sets the userRightsDelegation property value. This user right determines which users can set the Trusted for Delegation setting on a user or computer object. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsDelegation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsDelegation(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsDelegation = value;
    }
    /**
     * Sets the userRightsDenyLocalLogOn property value. This user right determines which users cannot log on to the computer. States NotConfigured, Blocked are supported
     * @param value Value to set for the userRightsDenyLocalLogOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsDenyLocalLogOn(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsDenyLocalLogOn = value;
    }
    /**
     * Sets the userRightsGenerateSecurityAudits property value. This user right determines which accounts can be used by a process to add entries to the security log. The security log is used to trace unauthorized system access.  Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsGenerateSecurityAudits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsGenerateSecurityAudits(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsGenerateSecurityAudits = value;
    }
    /**
     * Sets the userRightsImpersonateClient property value. Assigning this user right to a user allows programs running on behalf of that user to impersonate a client. Requiring this user right for this kind of impersonation prevents an unauthorized user from convincing a client to connect to a service that they have created and then impersonating that client, which can elevate the unauthorized user's permissions to administrative or system levels. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsImpersonateClient property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsImpersonateClient(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsImpersonateClient = value;
    }
    /**
     * Sets the userRightsIncreaseSchedulingPriority property value. This user right determines which accounts can use a process with Write Property access to another process to increase the execution priority assigned to the other process. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsIncreaseSchedulingPriority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsIncreaseSchedulingPriority(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsIncreaseSchedulingPriority = value;
    }
    /**
     * Sets the userRightsLoadUnloadDrivers property value. This user right determines which users can dynamically load and unload device drivers or other code in to kernel mode. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsLoadUnloadDrivers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsLoadUnloadDrivers(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsLoadUnloadDrivers = value;
    }
    /**
     * Sets the userRightsLocalLogOn property value. This user right determines which users can log on to the computer. States NotConfigured, Allowed are supported
     * @param value Value to set for the userRightsLocalLogOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsLocalLogOn(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsLocalLogOn = value;
    }
    /**
     * Sets the userRightsLockMemory property value. This user right determines which accounts can use a process to keep data in physical memory, which prevents the system from paging the data to virtual memory on disk. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsLockMemory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsLockMemory(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsLockMemory = value;
    }
    /**
     * Sets the userRightsManageAuditingAndSecurityLogs property value. This user right determines which users can specify object access auditing options for individual resources, such as files, Active Directory objects, and registry keys. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsManageAuditingAndSecurityLogs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsManageAuditingAndSecurityLogs(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsManageAuditingAndSecurityLogs = value;
    }
    /**
     * Sets the userRightsManageVolumes property value. This user right determines which users and groups can run maintenance tasks on a volume, such as remote defragmentation. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsManageVolumes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsManageVolumes(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsManageVolumes = value;
    }
    /**
     * Sets the userRightsModifyFirmwareEnvironment property value. This user right determines who can modify firmware environment values. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsModifyFirmwareEnvironment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsModifyFirmwareEnvironment(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsModifyFirmwareEnvironment = value;
    }
    /**
     * Sets the userRightsModifyObjectLabels property value. This user right determines which user accounts can modify the integrity label of objects, such as files, registry keys, or processes owned by other users. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsModifyObjectLabels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsModifyObjectLabels(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsModifyObjectLabels = value;
    }
    /**
     * Sets the userRightsProfileSingleProcess property value. This user right determines which users can use performance monitoring tools to monitor the performance of system processes. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsProfileSingleProcess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsProfileSingleProcess(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsProfileSingleProcess = value;
    }
    /**
     * Sets the userRightsRemoteDesktopServicesLogOn property value. This user right determines which users and groups are prohibited from logging on as a Remote Desktop Services client. Only states NotConfigured and Blocked are supported
     * @param value Value to set for the userRightsRemoteDesktopServicesLogOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsRemoteDesktopServicesLogOn(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsRemoteDesktopServicesLogOn = value;
    }
    /**
     * Sets the userRightsRemoteShutdown property value. This user right determines which users are allowed to shut down a computer from a remote location on the network. Misuse of this user right can result in a denial of service. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsRemoteShutdown property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsRemoteShutdown(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsRemoteShutdown = value;
    }
    /**
     * Sets the userRightsRestoreData property value. This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when restoring backed up files and directories, and determines which users can set any valid security principal as the owner of an object. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsRestoreData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsRestoreData(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsRestoreData = value;
    }
    /**
     * Sets the userRightsTakeOwnership property value. This user right determines which users can take ownership of any securable object in the system, including Active Directory objects, files and folders, printers, registry keys, processes, and threads. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsTakeOwnership property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserRightsTakeOwnership(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this.userRightsTakeOwnership = value;
    }
    /**
     * Sets the windowsDefenderTamperProtection property value. Defender TamperProtection setting options
     * @param value Value to set for the windowsDefenderTamperProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsDefenderTamperProtection(@javax.annotation.Nullable final WindowsDefenderTamperProtectionOptions value) {
        this.windowsDefenderTamperProtection = value;
    }
    /**
     * Sets the xboxServicesAccessoryManagementServiceStartupMode property value. Possible values of xbox service start type
     * @param value Value to set for the xboxServicesAccessoryManagementServiceStartupMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setXboxServicesAccessoryManagementServiceStartupMode(@javax.annotation.Nullable final ServiceStartType value) {
        this.xboxServicesAccessoryManagementServiceStartupMode = value;
    }
    /**
     * Sets the xboxServicesEnableXboxGameSaveTask property value. This setting determines whether xbox game save is enabled (1) or disabled (0).
     * @param value Value to set for the xboxServicesEnableXboxGameSaveTask property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setXboxServicesEnableXboxGameSaveTask(@javax.annotation.Nullable final Boolean value) {
        this.xboxServicesEnableXboxGameSaveTask = value;
    }
    /**
     * Sets the xboxServicesLiveAuthManagerServiceStartupMode property value. Possible values of xbox service start type
     * @param value Value to set for the xboxServicesLiveAuthManagerServiceStartupMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setXboxServicesLiveAuthManagerServiceStartupMode(@javax.annotation.Nullable final ServiceStartType value) {
        this.xboxServicesLiveAuthManagerServiceStartupMode = value;
    }
    /**
     * Sets the xboxServicesLiveGameSaveServiceStartupMode property value. Possible values of xbox service start type
     * @param value Value to set for the xboxServicesLiveGameSaveServiceStartupMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setXboxServicesLiveGameSaveServiceStartupMode(@javax.annotation.Nullable final ServiceStartType value) {
        this.xboxServicesLiveGameSaveServiceStartupMode = value;
    }
    /**
     * Sets the xboxServicesLiveNetworkingServiceStartupMode property value. Possible values of xbox service start type
     * @param value Value to set for the xboxServicesLiveNetworkingServiceStartupMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setXboxServicesLiveNetworkingServiceStartupMode(@javax.annotation.Nullable final ServiceStartType value) {
        this.xboxServicesLiveNetworkingServiceStartupMode = value;
    }
}
