package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10EndpointProtectionConfiguration extends DeviceConfiguration implements Parsable {
    /** Gets or sets whether applications inside Microsoft Defender Application Guard can access the device’s camera and microphone. */
    private Boolean _applicationGuardAllowCameraMicrophoneRedirection;
    /** Allow users to download files from Edge in the application guard container and save them on the host file system */
    private Boolean _applicationGuardAllowFileSaveOnHost;
    /** Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.) */
    private Boolean _applicationGuardAllowPersistence;
    /** Allow printing to Local Printers from Container */
    private Boolean _applicationGuardAllowPrintToLocalPrinters;
    /** Allow printing to Network Printers from Container */
    private Boolean _applicationGuardAllowPrintToNetworkPrinters;
    /** Allow printing to PDF from Container */
    private Boolean _applicationGuardAllowPrintToPDF;
    /** Allow printing to XPS from Container */
    private Boolean _applicationGuardAllowPrintToXPS;
    /** Allow application guard to use virtual GPU */
    private Boolean _applicationGuardAllowVirtualGPU;
    /** Possible values for applicationGuardBlockClipboardSharingType */
    private ApplicationGuardBlockClipboardSharingType _applicationGuardBlockClipboardSharing;
    /** Possible values for applicationGuardBlockFileTransfer */
    private ApplicationGuardBlockFileTransferType _applicationGuardBlockFileTransfer;
    /** Block enterprise sites to load non-enterprise content, such as third party plug-ins */
    private Boolean _applicationGuardBlockNonEnterpriseContent;
    /** Allows certain device level Root Certificates to be shared with the Microsoft Defender Application Guard container. */
    private java.util.List<String> _applicationGuardCertificateThumbprints;
    /** Enable Windows Defender Application Guard */
    private Boolean _applicationGuardEnabled;
    /** Possible values for ApplicationGuardEnabledOptions */
    private ApplicationGuardEnabledOptions _applicationGuardEnabledOptions;
    /** Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.) */
    private Boolean _applicationGuardForceAuditing;
    /** Possible values of AppLocker Application Control Types */
    private AppLockerApplicationControlType _appLockerApplicationControl;
    /** Allows the admin to allow standard users to enable encrpytion during Azure AD Join. */
    private Boolean _bitLockerAllowStandardUserEncryption;
    /** Allows the Admin to disable the warning prompt for other disk encryption on the user machines. */
    private Boolean _bitLockerDisableWarningForOtherDiskEncryption;
    /** Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU. */
    private Boolean _bitLockerEnableStorageCardEncryptionOnMobile;
    /** Allows the admin to require encryption to be turned on using BitLocker. */
    private Boolean _bitLockerEncryptDevice;
    /** BitLocker Fixed Drive Policy. */
    private BitLockerFixedDrivePolicy _bitLockerFixedDrivePolicy;
    /** BitLocker recovery password rotation type */
    private BitLockerRecoveryPasswordRotationType _bitLockerRecoveryPasswordRotation;
    /** BitLocker Removable Drive Policy. */
    private BitLockerRemovableDrivePolicy _bitLockerRemovableDrivePolicy;
    /** BitLocker System Drive Policy. */
    private BitLockerSystemDrivePolicy _bitLockerSystemDrivePolicy;
    /** List of folder paths to be added to the list of protected folders */
    private java.util.List<String> _defenderAdditionalGuardedFolders;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderAdobeReaderLaunchChildProcess;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderAdvancedRansomewareProtectionType;
    /** Allows or disallows Windows Defender Behavior Monitoring functionality. */
    private Boolean _defenderAllowBehaviorMonitoring;
    /** To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions. */
    private Boolean _defenderAllowCloudProtection;
    /** Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed. */
    private Boolean _defenderAllowEndUserAccess;
    /** Allows or disallows Windows Defender Intrusion Prevention functionality. */
    private Boolean _defenderAllowIntrusionPreventionSystem;
    /** Allows or disallows Windows Defender On Access Protection functionality. */
    private Boolean _defenderAllowOnAccessProtection;
    /** Allows or disallows Windows Defender Realtime Monitoring functionality. */
    private Boolean _defenderAllowRealTimeMonitoring;
    /** Allows or disallows scanning of archives. */
    private Boolean _defenderAllowScanArchiveFiles;
    /** Allows or disallows Windows Defender IOAVP Protection functionality. */
    private Boolean _defenderAllowScanDownloads;
    /** Allows or disallows a scanning of network files. */
    private Boolean _defenderAllowScanNetworkFiles;
    /** Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned. */
    private Boolean _defenderAllowScanRemovableDrivesDuringFullScan;
    /** Allows or disallows Windows Defender Script Scanning functionality. */
    private Boolean _defenderAllowScanScriptsLoadedInInternetExplorer;
    /** List of exe files and folders to be excluded from attack surface reduction rules */
    private java.util.List<String> _defenderAttackSurfaceReductionExcludedPaths;
    /** Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed. */
    private Boolean _defenderBlockEndUserAccess;
    /** Possible values of Defender Attack Surface Reduction Rules */
    private DefenderAttackSurfaceType _defenderBlockPersistenceThroughWmiType;
    /** This policy setting allows you to manage whether a check for new virus and spyware definitions will occur before running a scan. */
    private Boolean _defenderCheckForSignaturesBeforeRunningScan;
    /** Added in Windows 10, version 1709. This policy setting determines how aggressive Windows Defender Antivirus will be in blocking and scanning suspicious files. Value type is integer. This feature requires the 'Join Microsoft MAPS' setting enabled in order to function. Possible values are: notConfigured, high, highPlus, zeroTolerance. */
    private DefenderCloudBlockLevelType _defenderCloudBlockLevel;
    /** Added in Windows 10, version 1709. This feature allows Windows Defender Antivirus to block a suspicious file for up to 60 seconds, and scan it in the cloud to make sure it's safe. Value type is integer, range is 0 - 50. This feature depends on three other MAPS settings the must all be enabled- 'Configure the 'Block at First Sight' feature; 'Join Microsoft MAPS'; 'Send file samples when further analysis is required'. Valid values 0 to 50 */
    private Integer _defenderCloudExtendedTimeoutInSeconds;
    /** Time period (in days) that quarantine items will be stored on the system. Valid values 0 to 90 */
    private Integer _defenderDaysBeforeDeletingQuarantinedMalware;
    /** Allows an administrator to specify any valid threat severity levels and the corresponding default action ID to take. */
    private DefenderDetectedMalwareActions _defenderDetectedMalwareActions;
    /** Allows or disallows Windows Defender Behavior Monitoring functionality. */
    private Boolean _defenderDisableBehaviorMonitoring;
    /** This policy setting allows you to configure catch-up scans for scheduled full scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time. */
    private Boolean _defenderDisableCatchupFullScan;
    /** This policy setting allows you to configure catch-up scans for scheduled quick scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time. */
    private Boolean _defenderDisableCatchupQuickScan;
    /** To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions. */
    private Boolean _defenderDisableCloudProtection;
    /** Allows or disallows Windows Defender Intrusion Prevention functionality. */
    private Boolean _defenderDisableIntrusionPreventionSystem;
    /** Allows or disallows Windows Defender On Access Protection functionality. */
    private Boolean _defenderDisableOnAccessProtection;
    /** Allows or disallows Windows Defender Realtime Monitoring functionality. */
    private Boolean _defenderDisableRealTimeMonitoring;
    /** Allows or disallows scanning of archives. */
    private Boolean _defenderDisableScanArchiveFiles;
    /** Allows or disallows Windows Defender IOAVP Protection functionality. */
    private Boolean _defenderDisableScanDownloads;
    /** Allows or disallows a scanning of network files. */
    private Boolean _defenderDisableScanNetworkFiles;
    /** Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned. */
    private Boolean _defenderDisableScanRemovableDrivesDuringFullScan;
    /** Allows or disallows Windows Defender Script Scanning functionality. */
    private Boolean _defenderDisableScanScriptsLoadedInInternetExplorer;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderEmailContentExecution;
    /** Possible values of Defender Attack Surface Reduction Rules */
    private DefenderAttackSurfaceType _defenderEmailContentExecutionType;
    /** This policy setting allows you to enable or disable low CPU priority for scheduled scans. */
    private Boolean _defenderEnableLowCpuPriority;
    /** Allows or disallows scanning of email. */
    private Boolean _defenderEnableScanIncomingMail;
    /** Allows or disallows a full scan of mapped network drives. */
    private Boolean _defenderEnableScanMappedNetworkDrivesDuringFullScan;
    /** Xml content containing information regarding exploit protection details. */
    private byte[] _defenderExploitProtectionXml;
    /** Name of the file from which DefenderExploitProtectionXml was obtained. */
    private String _defenderExploitProtectionXmlFileName;
    /** File extensions to exclude from scans and real time protection. */
    private java.util.List<String> _defenderFileExtensionsToExclude;
    /** Files and folder to exclude from scans and real time protection. */
    private java.util.List<String> _defenderFilesAndFoldersToExclude;
    /** List of paths to exe that are allowed to access protected folders */
    private java.util.List<String> _defenderGuardedFoldersAllowedAppPaths;
    /** Possible values of Folder Protection */
    private FolderProtectionType _defenderGuardMyFoldersType;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderNetworkProtectionType;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderOfficeAppsExecutableContentCreationOrLaunch;
    /** Possible values of Defender Attack Surface Reduction Rules */
    private DefenderAttackSurfaceType _defenderOfficeAppsExecutableContentCreationOrLaunchType;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderOfficeAppsLaunchChildProcess;
    /** Possible values of Defender Attack Surface Reduction Rules */
    private DefenderAttackSurfaceType _defenderOfficeAppsLaunchChildProcessType;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderOfficeAppsOtherProcessInjection;
    /** Possible values of Defender Attack Surface Reduction Rules */
    private DefenderAttackSurfaceType _defenderOfficeAppsOtherProcessInjectionType;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderOfficeCommunicationAppsLaunchChildProcess;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderOfficeMacroCodeAllowWin32Imports;
    /** Possible values of Defender Attack Surface Reduction Rules */
    private DefenderAttackSurfaceType _defenderOfficeMacroCodeAllowWin32ImportsType;
    /** Added in Windows 10, version 1607. Specifies the level of detection for potentially unwanted applications (PUAs). Windows Defender alerts you when potentially unwanted software is being downloaded or attempts to install itself on your computer. Possible values are: userDefined, enable, auditMode, warn, notConfigured. */
    private DefenderProtectionType _defenderPotentiallyUnwantedAppAction;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderPreventCredentialStealingType;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderProcessCreation;
    /** Possible values of Defender Attack Surface Reduction Rules */
    private DefenderAttackSurfaceType _defenderProcessCreationType;
    /** Processes to exclude from scans and real time protection. */
    private java.util.List<String> _defenderProcessesToExclude;
    /** Controls which sets of files should be monitored. Possible values are: monitorAllFiles, monitorIncomingFilesOnly, monitorOutgoingFilesOnly. */
    private DefenderRealtimeScanDirection _defenderScanDirection;
    /** Represents the average CPU load factor for the Windows Defender scan (in percent). The default value is 50. Valid values 0 to 100 */
    private Integer _defenderScanMaxCpuPercentage;
    /** Selects whether to perform a quick scan or full scan. Possible values are: userDefined, disabled, quick, full. */
    private DefenderScanType _defenderScanType;
    /** Selects the time of day that the Windows Defender quick scan should run. For example, a value of 0=12:00AM, a value of 60=1:00AM, a value of 120=2:00, and so on, up to a value of 1380=11:00PM. The default value is 120 */
    private LocalTime _defenderScheduledQuickScanTime;
    /** Selects the day that the Windows Defender scan should run. Possible values are: userDefined, everyday, sunday, monday, tuesday, wednesday, thursday, friday, saturday, noScheduledScan. */
    private WeeklySchedule _defenderScheduledScanDay;
    /** Selects the time of day that the Windows Defender scan should run. */
    private LocalTime _defenderScheduledScanTime;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderScriptDownloadedPayloadExecution;
    /** Possible values of Defender Attack Surface Reduction Rules */
    private DefenderAttackSurfaceType _defenderScriptDownloadedPayloadExecutionType;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderScriptObfuscatedMacroCode;
    /** Possible values of Defender Attack Surface Reduction Rules */
    private DefenderAttackSurfaceType _defenderScriptObfuscatedMacroCodeType;
    /** Indicates whether or not to block user from overriding Exploit Protection settings. */
    private Boolean _defenderSecurityCenterBlockExploitProtectionOverride;
    /** Used to disable the display of the account protection area. */
    private Boolean _defenderSecurityCenterDisableAccountUI;
    /** Used to disable the display of the app and browser protection area. */
    private Boolean _defenderSecurityCenterDisableAppBrowserUI;
    /** Used to disable the display of the Clear TPM button. */
    private Boolean _defenderSecurityCenterDisableClearTpmUI;
    /** Used to disable the display of the family options area. */
    private Boolean _defenderSecurityCenterDisableFamilyUI;
    /** Used to disable the display of the hardware protection area. */
    private Boolean _defenderSecurityCenterDisableHardwareUI;
    /** Used to disable the display of the device performance and health area. */
    private Boolean _defenderSecurityCenterDisableHealthUI;
    /** Used to disable the display of the firewall and network protection area. */
    private Boolean _defenderSecurityCenterDisableNetworkUI;
    /** Used to disable the display of the notification area control. The user needs to either sign out and sign in or reboot the computer for this setting to take effect. */
    private Boolean _defenderSecurityCenterDisableNotificationAreaUI;
    /** Used to disable the display of the ransomware protection area. */
    private Boolean _defenderSecurityCenterDisableRansomwareUI;
    /** Used to disable the display of the secure boot area under Device security. */
    private Boolean _defenderSecurityCenterDisableSecureBootUI;
    /** Used to disable the display of the security process troubleshooting under Device security. */
    private Boolean _defenderSecurityCenterDisableTroubleshootingUI;
    /** Used to disable the display of the virus and threat protection area. */
    private Boolean _defenderSecurityCenterDisableVirusUI;
    /** Used to disable the display of update TPM Firmware when a vulnerable firmware is detected. */
    private Boolean _defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI;
    /** The email address that is displayed to users. */
    private String _defenderSecurityCenterHelpEmail;
    /** The phone number or Skype ID that is displayed to users. */
    private String _defenderSecurityCenterHelpPhone;
    /** The help portal URL this is displayed to users. */
    private String _defenderSecurityCenterHelpURL;
    /** Possible values for defenderSecurityCenterITContactDisplay */
    private DefenderSecurityCenterITContactDisplayType _defenderSecurityCenterITContactDisplay;
    /** Possible values for defenderSecurityCenterNotificationsFromApp */
    private DefenderSecurityCenterNotificationsFromAppType _defenderSecurityCenterNotificationsFromApp;
    /** The company name that is displayed to the users. */
    private String _defenderSecurityCenterOrganizationDisplayName;
    /** Specifies the interval (in hours) that will be used to check for signatures, so instead of using the ScheduleDay and ScheduleTime the check for new signatures will be set according to the interval. Valid values 0 to 24 */
    private Integer _defenderSignatureUpdateIntervalInHours;
    /** Checks for the user consent level in Windows Defender to send data. Possible values are: sendSafeSamplesAutomatically, alwaysPrompt, neverSend, sendAllSamplesAutomatically. */
    private DefenderSubmitSamplesConsentType _defenderSubmitSamplesConsentType;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderUntrustedExecutable;
    /** Possible values of Defender Attack Surface Reduction Rules */
    private DefenderAttackSurfaceType _defenderUntrustedExecutableType;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderUntrustedUSBProcess;
    /** Possible values of Defender Attack Surface Reduction Rules */
    private DefenderAttackSurfaceType _defenderUntrustedUSBProcessType;
    /** This property will be deprecated in May 2019 and will be replaced with property DeviceGuardSecureBootWithDMA. Specifies whether Platform Security Level is enabled at next reboot. */
    private Boolean _deviceGuardEnableSecureBootWithDMA;
    /** Turns On Virtualization Based Security(VBS). */
    private Boolean _deviceGuardEnableVirtualizationBasedSecurity;
    /** Possible values of a property */
    private Enablement _deviceGuardLaunchSystemGuard;
    /** Possible values of Credential Guard settings. */
    private DeviceGuardLocalSystemAuthorityCredentialGuardType _deviceGuardLocalSystemAuthorityCredentialGuardSettings;
    /** Possible values of Secure Boot with DMA */
    private SecureBootWithDMAType _deviceGuardSecureBootWithDMA;
    /** Possible values of the DmaGuardDeviceEnumerationPolicy. */
    private DmaGuardDeviceEnumerationPolicyType _dmaGuardDeviceEnumerationPolicy;
    /** Blocks stateful FTP connections to the device */
    private Boolean _firewallBlockStatefulFTP;
    /** Possible values for firewallCertificateRevocationListCheckMethod */
    private FirewallCertificateRevocationListCheckMethodType _firewallCertificateRevocationListCheckMethod;
    /** Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600 */
    private Integer _firewallIdleTimeoutForSecurityAssociationInSeconds;
    /** Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic */
    private Boolean _firewallIPSecExemptionsAllowDHCP;
    /** Configures IPSec exemptions to allow ICMP */
    private Boolean _firewallIPSecExemptionsAllowICMP;
    /** Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes */
    private Boolean _firewallIPSecExemptionsAllowNeighborDiscovery;
    /** Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes */
    private Boolean _firewallIPSecExemptionsAllowRouterDiscovery;
    /** Configures IPSec exemptions to no exemptions */
    private Boolean _firewallIPSecExemptionsNone;
    /** If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set */
    private Boolean _firewallMergeKeyingModuleSettings;
    /** Possible values for firewallPacketQueueingMethod */
    private FirewallPacketQueueingMethodType _firewallPacketQueueingMethod;
    /** Possible values for firewallPreSharedKeyEncodingMethod */
    private FirewallPreSharedKeyEncodingMethodType _firewallPreSharedKeyEncodingMethod;
    /** Configures the firewall profile settings for domain networks */
    private WindowsFirewallNetworkProfile _firewallProfileDomain;
    /** Configures the firewall profile settings for private networks */
    private WindowsFirewallNetworkProfile _firewallProfilePrivate;
    /** Configures the firewall profile settings for public networks */
    private WindowsFirewallNetworkProfile _firewallProfilePublic;
    /** Configures the firewall rule settings. This collection can contain a maximum of 150 elements. */
    private java.util.List<WindowsFirewallRule> _firewallRules;
    /** Possible values for LanManagerAuthenticationLevel */
    private LanManagerAuthenticationLevel _lanManagerAuthenticationLevel;
    /** If enabled,the SMB client will allow insecure guest logons. If not configured, the SMB client will reject insecure guest logons. */
    private Boolean _lanManagerWorkstationDisableInsecureGuestLogons;
    /** Define a different account name to be associated with the security identifier (SID) for the account 'Administrator'. */
    private String _localSecurityOptionsAdministratorAccountName;
    /** Possible values for LocalSecurityOptionsAdministratorElevationPromptBehavior */
    private LocalSecurityOptionsAdministratorElevationPromptBehaviorType _localSecurityOptionsAdministratorElevationPromptBehavior;
    /** This security setting determines whether to allows anonymous users to perform certain activities, such as enumerating the names of domain accounts and network shares. */
    private Boolean _localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares;
    /** Block PKU2U authentication requests to this device to use online identities. */
    private Boolean _localSecurityOptionsAllowPKU2UAuthenticationRequests;
    /** Edit the default Security Descriptor Definition Language string to allow or deny users and groups to make remote calls to the SAM. */
    private String _localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager;
    /** UI helper boolean for LocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager entity */
    private Boolean _localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool;
    /** This security setting determines whether a computer can be shut down without having to log on to Windows. */
    private Boolean _localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn;
    /** Allow UIAccess apps to prompt for elevation without using the secure desktop. */
    private Boolean _localSecurityOptionsAllowUIAccessApplicationElevation;
    /** Allow UIAccess apps to prompt for elevation without using the secure desktop.Default is enabled */
    private Boolean _localSecurityOptionsAllowUIAccessApplicationsForSecureLocations;
    /** Prevent a portable computer from being undocked without having to log in. */
    private Boolean _localSecurityOptionsAllowUndockWithoutHavingToLogon;
    /** Prevent users from adding new Microsoft accounts to this computer. */
    private Boolean _localSecurityOptionsBlockMicrosoftAccounts;
    /** Enable Local accounts that are not password protected to log on from locations other than the physical device.Default is enabled */
    private Boolean _localSecurityOptionsBlockRemoteLogonWithBlankPassword;
    /** Enabling this settings allows only interactively logged on user to access CD-ROM media. */
    private Boolean _localSecurityOptionsBlockRemoteOpticalDriveAccess;
    /** Restrict installing printer drivers as part of connecting to a shared printer to admins only. */
    private Boolean _localSecurityOptionsBlockUsersInstallingPrinterDrivers;
    /** This security setting determines whether the virtual memory pagefile is cleared when the system is shut down. */
    private Boolean _localSecurityOptionsClearVirtualMemoryPageFile;
    /** This security setting determines whether packet signing is required by the SMB client component. */
    private Boolean _localSecurityOptionsClientDigitallySignCommunicationsAlways;
    /** If this security setting is enabled, the Server Message Block (SMB) redirector is allowed to send plaintext passwords to non-Microsoft SMB servers that do not support password encryption during authentication. */
    private Boolean _localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers;
    /** App installations requiring elevated privileges will prompt for admin credentials.Default is enabled */
    private Boolean _localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation;
    /** Determines whether the Local Administrator account is enabled or disabled. */
    private Boolean _localSecurityOptionsDisableAdministratorAccount;
    /** This security setting determines whether the SMB client attempts to negotiate SMB packet signing. */
    private Boolean _localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees;
    /** Determines if the Guest account is enabled or disabled. */
    private Boolean _localSecurityOptionsDisableGuestAccount;
    /** This security setting determines whether packet signing is required by the SMB server component. */
    private Boolean _localSecurityOptionsDisableServerDigitallySignCommunicationsAlways;
    /** This security setting determines whether the SMB server will negotiate SMB packet signing with clients that request it. */
    private Boolean _localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees;
    /** This security setting determines what additional permissions will be granted for anonymous connections to the computer. */
    private Boolean _localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts;
    /** Require CTRL+ALT+DEL to be pressed before a user can log on. */
    private Boolean _localSecurityOptionsDoNotRequireCtrlAltDel;
    /** This security setting determines if, at the next password change, the LAN Manager (LM) hash value for the new password is stored. It’s not stored by default. */
    private Boolean _localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange;
    /** Possible values for LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser */
    private LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType _localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser;
    /** Define a different account name to be associated with the security identifier (SID) for the account 'Guest'. */
    private String _localSecurityOptionsGuestAccountName;
    /** Do not display the username of the last person who signed in on this device. */
    private Boolean _localSecurityOptionsHideLastSignedInUser;
    /** Do not display the username of the person signing in to this device after credentials are entered and before the device’s desktop is shown. */
    private Boolean _localSecurityOptionsHideUsernameAtSignIn;
    /** Possible values for LocalSecurityOptionsInformationDisplayedOnLockScreen */
    private LocalSecurityOptionsInformationDisplayedOnLockScreenType _localSecurityOptionsInformationDisplayedOnLockScreen;
    /** Possible values for LocalSecurityOptionsInformationShownOnLockScreenType */
    private LocalSecurityOptionsInformationShownOnLockScreenType _localSecurityOptionsInformationShownOnLockScreen;
    /** Set message text for users attempting to log in. */
    private String _localSecurityOptionsLogOnMessageText;
    /** Set message title for users attempting to log in. */
    private String _localSecurityOptionsLogOnMessageTitle;
    /** Define maximum minutes of inactivity on the interactive desktop’s login screen until the screen saver runs. Valid values 0 to 9999 */
    private Integer _localSecurityOptionsMachineInactivityLimit;
    /** Define maximum minutes of inactivity on the interactive desktop’s login screen until the screen saver runs. Valid values 0 to 9999 */
    private Integer _localSecurityOptionsMachineInactivityLimitInMinutes;
    /** Possible values for LocalSecurityOptionsMinimumSessionSecurity */
    private LocalSecurityOptionsMinimumSessionSecurity _localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients;
    /** Possible values for LocalSecurityOptionsMinimumSessionSecurity */
    private LocalSecurityOptionsMinimumSessionSecurity _localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers;
    /** Enforce PKI certification path validation for a given executable file before it is permitted to run. */
    private Boolean _localSecurityOptionsOnlyElevateSignedExecutables;
    /** By default, this security setting restricts anonymous access to shares and pipes to the settings for named pipes that can be accessed anonymously and Shares that can be accessed anonymously */
    private Boolean _localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares;
    /** Possible values for LocalSecurityOptionsSmartCardRemovalBehaviorType */
    private LocalSecurityOptionsSmartCardRemovalBehaviorType _localSecurityOptionsSmartCardRemovalBehavior;
    /** Possible values for LocalSecurityOptionsStandardUserElevationPromptBehavior */
    private LocalSecurityOptionsStandardUserElevationPromptBehaviorType _localSecurityOptionsStandardUserElevationPromptBehavior;
    /** Enable all elevation requests to go to the interactive user's desktop rather than the secure desktop. Prompt behavior policy settings for admins and standard users are used. */
    private Boolean _localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation;
    /** Defines whether the built-in admin account uses Admin Approval Mode or runs all apps with full admin privileges.Default is enabled */
    private Boolean _localSecurityOptionsUseAdminApprovalMode;
    /** Define whether Admin Approval Mode and all UAC policy settings are enabled, default is enabled */
    private Boolean _localSecurityOptionsUseAdminApprovalModeForAdministrators;
    /** Virtualize file and registry write failures to per user locations */
    private Boolean _localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations;
    /** Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files. */
    private Boolean _smartScreenBlockOverrideForFiles;
    /** Allows IT Admins to configure SmartScreen for Windows. */
    private Boolean _smartScreenEnableInShell;
    /** This user right is used by Credential Manager during Backup/Restore. Users' saved credentials might be compromised if this privilege is given to other entities. Only states NotConfigured and Allowed are supported */
    private DeviceManagementUserRightsSetting _userRightsAccessCredentialManagerAsTrustedCaller;
    /** This user right allows a process to impersonate any user without authentication. The process can therefore gain access to the same local resources as that user. Only states NotConfigured and Allowed are supported */
    private DeviceManagementUserRightsSetting _userRightsActAsPartOfTheOperatingSystem;
    /** This user right determines which users and groups are allowed to connect to the computer over the network. State Allowed is supported. */
    private DeviceManagementUserRightsSetting _userRightsAllowAccessFromNetwork;
    /** This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when backing up files and directories. Only states NotConfigured and Allowed are supported */
    private DeviceManagementUserRightsSetting _userRightsBackupData;
    /** This user right determines which users and groups are block from connecting to the computer over the network. State Block is supported. */
    private DeviceManagementUserRightsSetting _userRightsBlockAccessFromNetwork;
    /** This user right determines which users and groups can change the time and date on the internal clock of the computer. Only states NotConfigured and Allowed are supported */
    private DeviceManagementUserRightsSetting _userRightsChangeSystemTime;
    /** This security setting determines whether users can create global objects that are available to all sessions. Users who can create global objects could affect processes that run under other users' sessions, which could lead to application failure or data corruption. Only states NotConfigured and Allowed are supported */
    private DeviceManagementUserRightsSetting _userRightsCreateGlobalObjects;
    /** This user right determines which users and groups can call an internal API to create and change the size of a page file. Only states NotConfigured and Allowed are supported */
    private DeviceManagementUserRightsSetting _userRightsCreatePageFile;
    /** This user right determines which accounts can be used by processes to create a directory object using the object manager. Only states NotConfigured and Allowed are supported */
    private DeviceManagementUserRightsSetting _userRightsCreatePermanentSharedObjects;
    /** This user right determines if the user can create a symbolic link from the computer to which they are logged on. Only states NotConfigured and Allowed are supported */
    private DeviceManagementUserRightsSetting _userRightsCreateSymbolicLinks;
    /** This user right determines which users/groups can be used by processes to create a token that can then be used to get access to any local resources when the process uses an internal API to create an access token. Only states NotConfigured and Allowed are supported */
    private DeviceManagementUserRightsSetting _userRightsCreateToken;
    /** This user right determines which users can attach a debugger to any process or to the kernel. Only states NotConfigured and Allowed are supported */
    private DeviceManagementUserRightsSetting _userRightsDebugPrograms;
    /** This user right determines which users can set the Trusted for Delegation setting on a user or computer object. Only states NotConfigured and Allowed are supported. */
    private DeviceManagementUserRightsSetting _userRightsDelegation;
    /** This user right determines which users cannot log on to the computer. States NotConfigured, Blocked are supported */
    private DeviceManagementUserRightsSetting _userRightsDenyLocalLogOn;
    /** This user right determines which accounts can be used by a process to add entries to the security log. The security log is used to trace unauthorized system access.  Only states NotConfigured and Allowed are supported. */
    private DeviceManagementUserRightsSetting _userRightsGenerateSecurityAudits;
    /** Assigning this user right to a user allows programs running on behalf of that user to impersonate a client. Requiring this user right for this kind of impersonation prevents an unauthorized user from convincing a client to connect to a service that they have created and then impersonating that client, which can elevate the unauthorized user's permissions to administrative or system levels. Only states NotConfigured and Allowed are supported. */
    private DeviceManagementUserRightsSetting _userRightsImpersonateClient;
    /** This user right determines which accounts can use a process with Write Property access to another process to increase the execution priority assigned to the other process. Only states NotConfigured and Allowed are supported. */
    private DeviceManagementUserRightsSetting _userRightsIncreaseSchedulingPriority;
    /** This user right determines which users can dynamically load and unload device drivers or other code in to kernel mode. Only states NotConfigured and Allowed are supported. */
    private DeviceManagementUserRightsSetting _userRightsLoadUnloadDrivers;
    /** This user right determines which users can log on to the computer. States NotConfigured, Allowed are supported */
    private DeviceManagementUserRightsSetting _userRightsLocalLogOn;
    /** This user right determines which accounts can use a process to keep data in physical memory, which prevents the system from paging the data to virtual memory on disk. Only states NotConfigured and Allowed are supported. */
    private DeviceManagementUserRightsSetting _userRightsLockMemory;
    /** This user right determines which users can specify object access auditing options for individual resources, such as files, Active Directory objects, and registry keys. Only states NotConfigured and Allowed are supported. */
    private DeviceManagementUserRightsSetting _userRightsManageAuditingAndSecurityLogs;
    /** This user right determines which users and groups can run maintenance tasks on a volume, such as remote defragmentation. Only states NotConfigured and Allowed are supported. */
    private DeviceManagementUserRightsSetting _userRightsManageVolumes;
    /** This user right determines who can modify firmware environment values. Only states NotConfigured and Allowed are supported. */
    private DeviceManagementUserRightsSetting _userRightsModifyFirmwareEnvironment;
    /** This user right determines which user accounts can modify the integrity label of objects, such as files, registry keys, or processes owned by other users. Only states NotConfigured and Allowed are supported. */
    private DeviceManagementUserRightsSetting _userRightsModifyObjectLabels;
    /** This user right determines which users can use performance monitoring tools to monitor the performance of system processes. Only states NotConfigured and Allowed are supported. */
    private DeviceManagementUserRightsSetting _userRightsProfileSingleProcess;
    /** This user right determines which users and groups are prohibited from logging on as a Remote Desktop Services client. Only states NotConfigured and Blocked are supported */
    private DeviceManagementUserRightsSetting _userRightsRemoteDesktopServicesLogOn;
    /** This user right determines which users are allowed to shut down a computer from a remote location on the network. Misuse of this user right can result in a denial of service. Only states NotConfigured and Allowed are supported. */
    private DeviceManagementUserRightsSetting _userRightsRemoteShutdown;
    /** This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when restoring backed up files and directories, and determines which users can set any valid security principal as the owner of an object. Only states NotConfigured and Allowed are supported. */
    private DeviceManagementUserRightsSetting _userRightsRestoreData;
    /** This user right determines which users can take ownership of any securable object in the system, including Active Directory objects, files and folders, printers, registry keys, processes, and threads. Only states NotConfigured and Allowed are supported. */
    private DeviceManagementUserRightsSetting _userRightsTakeOwnership;
    /** Defender TamperProtection setting options */
    private WindowsDefenderTamperProtectionOptions _windowsDefenderTamperProtection;
    /** Possible values of xbox service start type */
    private ServiceStartType _xboxServicesAccessoryManagementServiceStartupMode;
    /** This setting determines whether xbox game save is enabled (1) or disabled (0). */
    private Boolean _xboxServicesEnableXboxGameSaveTask;
    /** Possible values of xbox service start type */
    private ServiceStartType _xboxServicesLiveAuthManagerServiceStartupMode;
    /** Possible values of xbox service start type */
    private ServiceStartType _xboxServicesLiveGameSaveServiceStartupMode;
    /** Possible values of xbox service start type */
    private ServiceStartType _xboxServicesLiveNetworkingServiceStartupMode;
    /**
     * Instantiates a new Windows10EndpointProtectionConfiguration and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static Windows10EndpointProtectionConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EndpointProtectionConfiguration();
    }
    /**
     * Gets the applicationGuardAllowCameraMicrophoneRedirection property value. Gets or sets whether applications inside Microsoft Defender Application Guard can access the device’s camera and microphone.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowCameraMicrophoneRedirection() {
        return this._applicationGuardAllowCameraMicrophoneRedirection;
    }
    /**
     * Gets the applicationGuardAllowFileSaveOnHost property value. Allow users to download files from Edge in the application guard container and save them on the host file system
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowFileSaveOnHost() {
        return this._applicationGuardAllowFileSaveOnHost;
    }
    /**
     * Gets the applicationGuardAllowPersistence property value. Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPersistence() {
        return this._applicationGuardAllowPersistence;
    }
    /**
     * Gets the applicationGuardAllowPrintToLocalPrinters property value. Allow printing to Local Printers from Container
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToLocalPrinters() {
        return this._applicationGuardAllowPrintToLocalPrinters;
    }
    /**
     * Gets the applicationGuardAllowPrintToNetworkPrinters property value. Allow printing to Network Printers from Container
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToNetworkPrinters() {
        return this._applicationGuardAllowPrintToNetworkPrinters;
    }
    /**
     * Gets the applicationGuardAllowPrintToPDF property value. Allow printing to PDF from Container
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToPDF() {
        return this._applicationGuardAllowPrintToPDF;
    }
    /**
     * Gets the applicationGuardAllowPrintToXPS property value. Allow printing to XPS from Container
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowPrintToXPS() {
        return this._applicationGuardAllowPrintToXPS;
    }
    /**
     * Gets the applicationGuardAllowVirtualGPU property value. Allow application guard to use virtual GPU
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardAllowVirtualGPU() {
        return this._applicationGuardAllowVirtualGPU;
    }
    /**
     * Gets the applicationGuardBlockClipboardSharing property value. Possible values for applicationGuardBlockClipboardSharingType
     * @return a applicationGuardBlockClipboardSharingType
     */
    @javax.annotation.Nullable
    public ApplicationGuardBlockClipboardSharingType getApplicationGuardBlockClipboardSharing() {
        return this._applicationGuardBlockClipboardSharing;
    }
    /**
     * Gets the applicationGuardBlockFileTransfer property value. Possible values for applicationGuardBlockFileTransfer
     * @return a applicationGuardBlockFileTransferType
     */
    @javax.annotation.Nullable
    public ApplicationGuardBlockFileTransferType getApplicationGuardBlockFileTransfer() {
        return this._applicationGuardBlockFileTransfer;
    }
    /**
     * Gets the applicationGuardBlockNonEnterpriseContent property value. Block enterprise sites to load non-enterprise content, such as third party plug-ins
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardBlockNonEnterpriseContent() {
        return this._applicationGuardBlockNonEnterpriseContent;
    }
    /**
     * Gets the applicationGuardCertificateThumbprints property value. Allows certain device level Root Certificates to be shared with the Microsoft Defender Application Guard container.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getApplicationGuardCertificateThumbprints() {
        return this._applicationGuardCertificateThumbprints;
    }
    /**
     * Gets the applicationGuardEnabled property value. Enable Windows Defender Application Guard
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardEnabled() {
        return this._applicationGuardEnabled;
    }
    /**
     * Gets the applicationGuardEnabledOptions property value. Possible values for ApplicationGuardEnabledOptions
     * @return a applicationGuardEnabledOptions
     */
    @javax.annotation.Nullable
    public ApplicationGuardEnabledOptions getApplicationGuardEnabledOptions() {
        return this._applicationGuardEnabledOptions;
    }
    /**
     * Gets the applicationGuardForceAuditing property value. Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationGuardForceAuditing() {
        return this._applicationGuardForceAuditing;
    }
    /**
     * Gets the appLockerApplicationControl property value. Possible values of AppLocker Application Control Types
     * @return a appLockerApplicationControlType
     */
    @javax.annotation.Nullable
    public AppLockerApplicationControlType getAppLockerApplicationControl() {
        return this._appLockerApplicationControl;
    }
    /**
     * Gets the bitLockerAllowStandardUserEncryption property value. Allows the admin to allow standard users to enable encrpytion during Azure AD Join.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBitLockerAllowStandardUserEncryption() {
        return this._bitLockerAllowStandardUserEncryption;
    }
    /**
     * Gets the bitLockerDisableWarningForOtherDiskEncryption property value. Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBitLockerDisableWarningForOtherDiskEncryption() {
        return this._bitLockerDisableWarningForOtherDiskEncryption;
    }
    /**
     * Gets the bitLockerEnableStorageCardEncryptionOnMobile property value. Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBitLockerEnableStorageCardEncryptionOnMobile() {
        return this._bitLockerEnableStorageCardEncryptionOnMobile;
    }
    /**
     * Gets the bitLockerEncryptDevice property value. Allows the admin to require encryption to be turned on using BitLocker.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBitLockerEncryptDevice() {
        return this._bitLockerEncryptDevice;
    }
    /**
     * Gets the bitLockerFixedDrivePolicy property value. BitLocker Fixed Drive Policy.
     * @return a bitLockerFixedDrivePolicy
     */
    @javax.annotation.Nullable
    public BitLockerFixedDrivePolicy getBitLockerFixedDrivePolicy() {
        return this._bitLockerFixedDrivePolicy;
    }
    /**
     * Gets the bitLockerRecoveryPasswordRotation property value. BitLocker recovery password rotation type
     * @return a bitLockerRecoveryPasswordRotationType
     */
    @javax.annotation.Nullable
    public BitLockerRecoveryPasswordRotationType getBitLockerRecoveryPasswordRotation() {
        return this._bitLockerRecoveryPasswordRotation;
    }
    /**
     * Gets the bitLockerRemovableDrivePolicy property value. BitLocker Removable Drive Policy.
     * @return a bitLockerRemovableDrivePolicy
     */
    @javax.annotation.Nullable
    public BitLockerRemovableDrivePolicy getBitLockerRemovableDrivePolicy() {
        return this._bitLockerRemovableDrivePolicy;
    }
    /**
     * Gets the bitLockerSystemDrivePolicy property value. BitLocker System Drive Policy.
     * @return a bitLockerSystemDrivePolicy
     */
    @javax.annotation.Nullable
    public BitLockerSystemDrivePolicy getBitLockerSystemDrivePolicy() {
        return this._bitLockerSystemDrivePolicy;
    }
    /**
     * Gets the defenderAdditionalGuardedFolders property value. List of folder paths to be added to the list of protected folders
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderAdditionalGuardedFolders() {
        return this._defenderAdditionalGuardedFolders;
    }
    /**
     * Gets the defenderAdobeReaderLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderAdobeReaderLaunchChildProcess() {
        return this._defenderAdobeReaderLaunchChildProcess;
    }
    /**
     * Gets the defenderAdvancedRansomewareProtectionType property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderAdvancedRansomewareProtectionType() {
        return this._defenderAdvancedRansomewareProtectionType;
    }
    /**
     * Gets the defenderAllowBehaviorMonitoring property value. Allows or disallows Windows Defender Behavior Monitoring functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowBehaviorMonitoring() {
        return this._defenderAllowBehaviorMonitoring;
    }
    /**
     * Gets the defenderAllowCloudProtection property value. To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowCloudProtection() {
        return this._defenderAllowCloudProtection;
    }
    /**
     * Gets the defenderAllowEndUserAccess property value. Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowEndUserAccess() {
        return this._defenderAllowEndUserAccess;
    }
    /**
     * Gets the defenderAllowIntrusionPreventionSystem property value. Allows or disallows Windows Defender Intrusion Prevention functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowIntrusionPreventionSystem() {
        return this._defenderAllowIntrusionPreventionSystem;
    }
    /**
     * Gets the defenderAllowOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowOnAccessProtection() {
        return this._defenderAllowOnAccessProtection;
    }
    /**
     * Gets the defenderAllowRealTimeMonitoring property value. Allows or disallows Windows Defender Realtime Monitoring functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowRealTimeMonitoring() {
        return this._defenderAllowRealTimeMonitoring;
    }
    /**
     * Gets the defenderAllowScanArchiveFiles property value. Allows or disallows scanning of archives.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowScanArchiveFiles() {
        return this._defenderAllowScanArchiveFiles;
    }
    /**
     * Gets the defenderAllowScanDownloads property value. Allows or disallows Windows Defender IOAVP Protection functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowScanDownloads() {
        return this._defenderAllowScanDownloads;
    }
    /**
     * Gets the defenderAllowScanNetworkFiles property value. Allows or disallows a scanning of network files.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowScanNetworkFiles() {
        return this._defenderAllowScanNetworkFiles;
    }
    /**
     * Gets the defenderAllowScanRemovableDrivesDuringFullScan property value. Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowScanRemovableDrivesDuringFullScan() {
        return this._defenderAllowScanRemovableDrivesDuringFullScan;
    }
    /**
     * Gets the defenderAllowScanScriptsLoadedInInternetExplorer property value. Allows or disallows Windows Defender Script Scanning functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderAllowScanScriptsLoadedInInternetExplorer() {
        return this._defenderAllowScanScriptsLoadedInInternetExplorer;
    }
    /**
     * Gets the defenderAttackSurfaceReductionExcludedPaths property value. List of exe files and folders to be excluded from attack surface reduction rules
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderAttackSurfaceReductionExcludedPaths() {
        return this._defenderAttackSurfaceReductionExcludedPaths;
    }
    /**
     * Gets the defenderBlockEndUserAccess property value. Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderBlockEndUserAccess() {
        return this._defenderBlockEndUserAccess;
    }
    /**
     * Gets the defenderBlockPersistenceThroughWmiType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a defenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderBlockPersistenceThroughWmiType() {
        return this._defenderBlockPersistenceThroughWmiType;
    }
    /**
     * Gets the defenderCheckForSignaturesBeforeRunningScan property value. This policy setting allows you to manage whether a check for new virus and spyware definitions will occur before running a scan.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderCheckForSignaturesBeforeRunningScan() {
        return this._defenderCheckForSignaturesBeforeRunningScan;
    }
    /**
     * Gets the defenderCloudBlockLevel property value. Added in Windows 10, version 1709. This policy setting determines how aggressive Windows Defender Antivirus will be in blocking and scanning suspicious files. Value type is integer. This feature requires the 'Join Microsoft MAPS' setting enabled in order to function. Possible values are: notConfigured, high, highPlus, zeroTolerance.
     * @return a defenderCloudBlockLevelType
     */
    @javax.annotation.Nullable
    public DefenderCloudBlockLevelType getDefenderCloudBlockLevel() {
        return this._defenderCloudBlockLevel;
    }
    /**
     * Gets the defenderCloudExtendedTimeoutInSeconds property value. Added in Windows 10, version 1709. This feature allows Windows Defender Antivirus to block a suspicious file for up to 60 seconds, and scan it in the cloud to make sure it's safe. Value type is integer, range is 0 - 50. This feature depends on three other MAPS settings the must all be enabled- 'Configure the 'Block at First Sight' feature; 'Join Microsoft MAPS'; 'Send file samples when further analysis is required'. Valid values 0 to 50
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderCloudExtendedTimeoutInSeconds() {
        return this._defenderCloudExtendedTimeoutInSeconds;
    }
    /**
     * Gets the defenderDaysBeforeDeletingQuarantinedMalware property value. Time period (in days) that quarantine items will be stored on the system. Valid values 0 to 90
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderDaysBeforeDeletingQuarantinedMalware() {
        return this._defenderDaysBeforeDeletingQuarantinedMalware;
    }
    /**
     * Gets the defenderDetectedMalwareActions property value. Allows an administrator to specify any valid threat severity levels and the corresponding default action ID to take.
     * @return a defenderDetectedMalwareActions
     */
    @javax.annotation.Nullable
    public DefenderDetectedMalwareActions getDefenderDetectedMalwareActions() {
        return this._defenderDetectedMalwareActions;
    }
    /**
     * Gets the defenderDisableBehaviorMonitoring property value. Allows or disallows Windows Defender Behavior Monitoring functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableBehaviorMonitoring() {
        return this._defenderDisableBehaviorMonitoring;
    }
    /**
     * Gets the defenderDisableCatchupFullScan property value. This policy setting allows you to configure catch-up scans for scheduled full scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableCatchupFullScan() {
        return this._defenderDisableCatchupFullScan;
    }
    /**
     * Gets the defenderDisableCatchupQuickScan property value. This policy setting allows you to configure catch-up scans for scheduled quick scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableCatchupQuickScan() {
        return this._defenderDisableCatchupQuickScan;
    }
    /**
     * Gets the defenderDisableCloudProtection property value. To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableCloudProtection() {
        return this._defenderDisableCloudProtection;
    }
    /**
     * Gets the defenderDisableIntrusionPreventionSystem property value. Allows or disallows Windows Defender Intrusion Prevention functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableIntrusionPreventionSystem() {
        return this._defenderDisableIntrusionPreventionSystem;
    }
    /**
     * Gets the defenderDisableOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableOnAccessProtection() {
        return this._defenderDisableOnAccessProtection;
    }
    /**
     * Gets the defenderDisableRealTimeMonitoring property value. Allows or disallows Windows Defender Realtime Monitoring functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableRealTimeMonitoring() {
        return this._defenderDisableRealTimeMonitoring;
    }
    /**
     * Gets the defenderDisableScanArchiveFiles property value. Allows or disallows scanning of archives.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableScanArchiveFiles() {
        return this._defenderDisableScanArchiveFiles;
    }
    /**
     * Gets the defenderDisableScanDownloads property value. Allows or disallows Windows Defender IOAVP Protection functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableScanDownloads() {
        return this._defenderDisableScanDownloads;
    }
    /**
     * Gets the defenderDisableScanNetworkFiles property value. Allows or disallows a scanning of network files.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableScanNetworkFiles() {
        return this._defenderDisableScanNetworkFiles;
    }
    /**
     * Gets the defenderDisableScanRemovableDrivesDuringFullScan property value. Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableScanRemovableDrivesDuringFullScan() {
        return this._defenderDisableScanRemovableDrivesDuringFullScan;
    }
    /**
     * Gets the defenderDisableScanScriptsLoadedInInternetExplorer property value. Allows or disallows Windows Defender Script Scanning functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableScanScriptsLoadedInInternetExplorer() {
        return this._defenderDisableScanScriptsLoadedInInternetExplorer;
    }
    /**
     * Gets the defenderEmailContentExecution property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderEmailContentExecution() {
        return this._defenderEmailContentExecution;
    }
    /**
     * Gets the defenderEmailContentExecutionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a defenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderEmailContentExecutionType() {
        return this._defenderEmailContentExecutionType;
    }
    /**
     * Gets the defenderEnableLowCpuPriority property value. This policy setting allows you to enable or disable low CPU priority for scheduled scans.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderEnableLowCpuPriority() {
        return this._defenderEnableLowCpuPriority;
    }
    /**
     * Gets the defenderEnableScanIncomingMail property value. Allows or disallows scanning of email.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderEnableScanIncomingMail() {
        return this._defenderEnableScanIncomingMail;
    }
    /**
     * Gets the defenderEnableScanMappedNetworkDrivesDuringFullScan property value. Allows or disallows a full scan of mapped network drives.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderEnableScanMappedNetworkDrivesDuringFullScan() {
        return this._defenderEnableScanMappedNetworkDrivesDuringFullScan;
    }
    /**
     * Gets the defenderExploitProtectionXml property value. Xml content containing information regarding exploit protection details.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getDefenderExploitProtectionXml() {
        return this._defenderExploitProtectionXml;
    }
    /**
     * Gets the defenderExploitProtectionXmlFileName property value. Name of the file from which DefenderExploitProtectionXml was obtained.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefenderExploitProtectionXmlFileName() {
        return this._defenderExploitProtectionXmlFileName;
    }
    /**
     * Gets the defenderFileExtensionsToExclude property value. File extensions to exclude from scans and real time protection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderFileExtensionsToExclude() {
        return this._defenderFileExtensionsToExclude;
    }
    /**
     * Gets the defenderFilesAndFoldersToExclude property value. Files and folder to exclude from scans and real time protection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderFilesAndFoldersToExclude() {
        return this._defenderFilesAndFoldersToExclude;
    }
    /**
     * Gets the defenderGuardedFoldersAllowedAppPaths property value. List of paths to exe that are allowed to access protected folders
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderGuardedFoldersAllowedAppPaths() {
        return this._defenderGuardedFoldersAllowedAppPaths;
    }
    /**
     * Gets the defenderGuardMyFoldersType property value. Possible values of Folder Protection
     * @return a folderProtectionType
     */
    @javax.annotation.Nullable
    public FolderProtectionType getDefenderGuardMyFoldersType() {
        return this._defenderGuardMyFoldersType;
    }
    /**
     * Gets the defenderNetworkProtectionType property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderNetworkProtectionType() {
        return this._defenderNetworkProtectionType;
    }
    /**
     * Gets the defenderOfficeAppsExecutableContentCreationOrLaunch property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeAppsExecutableContentCreationOrLaunch() {
        return this._defenderOfficeAppsExecutableContentCreationOrLaunch;
    }
    /**
     * Gets the defenderOfficeAppsExecutableContentCreationOrLaunchType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a defenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderOfficeAppsExecutableContentCreationOrLaunchType() {
        return this._defenderOfficeAppsExecutableContentCreationOrLaunchType;
    }
    /**
     * Gets the defenderOfficeAppsLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeAppsLaunchChildProcess() {
        return this._defenderOfficeAppsLaunchChildProcess;
    }
    /**
     * Gets the defenderOfficeAppsLaunchChildProcessType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a defenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderOfficeAppsLaunchChildProcessType() {
        return this._defenderOfficeAppsLaunchChildProcessType;
    }
    /**
     * Gets the defenderOfficeAppsOtherProcessInjection property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeAppsOtherProcessInjection() {
        return this._defenderOfficeAppsOtherProcessInjection;
    }
    /**
     * Gets the defenderOfficeAppsOtherProcessInjectionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a defenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderOfficeAppsOtherProcessInjectionType() {
        return this._defenderOfficeAppsOtherProcessInjectionType;
    }
    /**
     * Gets the defenderOfficeCommunicationAppsLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeCommunicationAppsLaunchChildProcess() {
        return this._defenderOfficeCommunicationAppsLaunchChildProcess;
    }
    /**
     * Gets the defenderOfficeMacroCodeAllowWin32Imports property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderOfficeMacroCodeAllowWin32Imports() {
        return this._defenderOfficeMacroCodeAllowWin32Imports;
    }
    /**
     * Gets the defenderOfficeMacroCodeAllowWin32ImportsType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a defenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderOfficeMacroCodeAllowWin32ImportsType() {
        return this._defenderOfficeMacroCodeAllowWin32ImportsType;
    }
    /**
     * Gets the defenderPotentiallyUnwantedAppAction property value. Added in Windows 10, version 1607. Specifies the level of detection for potentially unwanted applications (PUAs). Windows Defender alerts you when potentially unwanted software is being downloaded or attempts to install itself on your computer. Possible values are: userDefined, enable, auditMode, warn, notConfigured.
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderPotentiallyUnwantedAppAction() {
        return this._defenderPotentiallyUnwantedAppAction;
    }
    /**
     * Gets the defenderPreventCredentialStealingType property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderPreventCredentialStealingType() {
        return this._defenderPreventCredentialStealingType;
    }
    /**
     * Gets the defenderProcessCreation property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderProcessCreation() {
        return this._defenderProcessCreation;
    }
    /**
     * Gets the defenderProcessCreationType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a defenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderProcessCreationType() {
        return this._defenderProcessCreationType;
    }
    /**
     * Gets the defenderProcessesToExclude property value. Processes to exclude from scans and real time protection.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDefenderProcessesToExclude() {
        return this._defenderProcessesToExclude;
    }
    /**
     * Gets the defenderScanDirection property value. Controls which sets of files should be monitored. Possible values are: monitorAllFiles, monitorIncomingFilesOnly, monitorOutgoingFilesOnly.
     * @return a defenderRealtimeScanDirection
     */
    @javax.annotation.Nullable
    public DefenderRealtimeScanDirection getDefenderScanDirection() {
        return this._defenderScanDirection;
    }
    /**
     * Gets the defenderScanMaxCpuPercentage property value. Represents the average CPU load factor for the Windows Defender scan (in percent). The default value is 50. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderScanMaxCpuPercentage() {
        return this._defenderScanMaxCpuPercentage;
    }
    /**
     * Gets the defenderScanType property value. Selects whether to perform a quick scan or full scan. Possible values are: userDefined, disabled, quick, full.
     * @return a defenderScanType
     */
    @javax.annotation.Nullable
    public DefenderScanType getDefenderScanType() {
        return this._defenderScanType;
    }
    /**
     * Gets the defenderScheduledQuickScanTime property value. Selects the time of day that the Windows Defender quick scan should run. For example, a value of 0=12:00AM, a value of 60=1:00AM, a value of 120=2:00, and so on, up to a value of 1380=11:00PM. The default value is 120
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getDefenderScheduledQuickScanTime() {
        return this._defenderScheduledQuickScanTime;
    }
    /**
     * Gets the defenderScheduledScanDay property value. Selects the day that the Windows Defender scan should run. Possible values are: userDefined, everyday, sunday, monday, tuesday, wednesday, thursday, friday, saturday, noScheduledScan.
     * @return a weeklySchedule
     */
    @javax.annotation.Nullable
    public WeeklySchedule getDefenderScheduledScanDay() {
        return this._defenderScheduledScanDay;
    }
    /**
     * Gets the defenderScheduledScanTime property value. Selects the time of day that the Windows Defender scan should run.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getDefenderScheduledScanTime() {
        return this._defenderScheduledScanTime;
    }
    /**
     * Gets the defenderScriptDownloadedPayloadExecution property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderScriptDownloadedPayloadExecution() {
        return this._defenderScriptDownloadedPayloadExecution;
    }
    /**
     * Gets the defenderScriptDownloadedPayloadExecutionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a defenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderScriptDownloadedPayloadExecutionType() {
        return this._defenderScriptDownloadedPayloadExecutionType;
    }
    /**
     * Gets the defenderScriptObfuscatedMacroCode property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderScriptObfuscatedMacroCode() {
        return this._defenderScriptObfuscatedMacroCode;
    }
    /**
     * Gets the defenderScriptObfuscatedMacroCodeType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a defenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderScriptObfuscatedMacroCodeType() {
        return this._defenderScriptObfuscatedMacroCodeType;
    }
    /**
     * Gets the defenderSecurityCenterBlockExploitProtectionOverride property value. Indicates whether or not to block user from overriding Exploit Protection settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterBlockExploitProtectionOverride() {
        return this._defenderSecurityCenterBlockExploitProtectionOverride;
    }
    /**
     * Gets the defenderSecurityCenterDisableAccountUI property value. Used to disable the display of the account protection area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableAccountUI() {
        return this._defenderSecurityCenterDisableAccountUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableAppBrowserUI property value. Used to disable the display of the app and browser protection area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableAppBrowserUI() {
        return this._defenderSecurityCenterDisableAppBrowserUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableClearTpmUI property value. Used to disable the display of the Clear TPM button.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableClearTpmUI() {
        return this._defenderSecurityCenterDisableClearTpmUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableFamilyUI property value. Used to disable the display of the family options area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableFamilyUI() {
        return this._defenderSecurityCenterDisableFamilyUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableHardwareUI property value. Used to disable the display of the hardware protection area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableHardwareUI() {
        return this._defenderSecurityCenterDisableHardwareUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableHealthUI property value. Used to disable the display of the device performance and health area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableHealthUI() {
        return this._defenderSecurityCenterDisableHealthUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableNetworkUI property value. Used to disable the display of the firewall and network protection area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableNetworkUI() {
        return this._defenderSecurityCenterDisableNetworkUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableNotificationAreaUI property value. Used to disable the display of the notification area control. The user needs to either sign out and sign in or reboot the computer for this setting to take effect.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableNotificationAreaUI() {
        return this._defenderSecurityCenterDisableNotificationAreaUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableRansomwareUI property value. Used to disable the display of the ransomware protection area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableRansomwareUI() {
        return this._defenderSecurityCenterDisableRansomwareUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableSecureBootUI property value. Used to disable the display of the secure boot area under Device security.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableSecureBootUI() {
        return this._defenderSecurityCenterDisableSecureBootUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableTroubleshootingUI property value. Used to disable the display of the security process troubleshooting under Device security.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableTroubleshootingUI() {
        return this._defenderSecurityCenterDisableTroubleshootingUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableVirusUI property value. Used to disable the display of the virus and threat protection area.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableVirusUI() {
        return this._defenderSecurityCenterDisableVirusUI;
    }
    /**
     * Gets the defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI property value. Used to disable the display of update TPM Firmware when a vulnerable firmware is detected.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI() {
        return this._defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI;
    }
    /**
     * Gets the defenderSecurityCenterHelpEmail property value. The email address that is displayed to users.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefenderSecurityCenterHelpEmail() {
        return this._defenderSecurityCenterHelpEmail;
    }
    /**
     * Gets the defenderSecurityCenterHelpPhone property value. The phone number or Skype ID that is displayed to users.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefenderSecurityCenterHelpPhone() {
        return this._defenderSecurityCenterHelpPhone;
    }
    /**
     * Gets the defenderSecurityCenterHelpURL property value. The help portal URL this is displayed to users.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefenderSecurityCenterHelpURL() {
        return this._defenderSecurityCenterHelpURL;
    }
    /**
     * Gets the defenderSecurityCenterITContactDisplay property value. Possible values for defenderSecurityCenterITContactDisplay
     * @return a defenderSecurityCenterITContactDisplayType
     */
    @javax.annotation.Nullable
    public DefenderSecurityCenterITContactDisplayType getDefenderSecurityCenterITContactDisplay() {
        return this._defenderSecurityCenterITContactDisplay;
    }
    /**
     * Gets the defenderSecurityCenterNotificationsFromApp property value. Possible values for defenderSecurityCenterNotificationsFromApp
     * @return a defenderSecurityCenterNotificationsFromAppType
     */
    @javax.annotation.Nullable
    public DefenderSecurityCenterNotificationsFromAppType getDefenderSecurityCenterNotificationsFromApp() {
        return this._defenderSecurityCenterNotificationsFromApp;
    }
    /**
     * Gets the defenderSecurityCenterOrganizationDisplayName property value. The company name that is displayed to the users.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefenderSecurityCenterOrganizationDisplayName() {
        return this._defenderSecurityCenterOrganizationDisplayName;
    }
    /**
     * Gets the defenderSignatureUpdateIntervalInHours property value. Specifies the interval (in hours) that will be used to check for signatures, so instead of using the ScheduleDay and ScheduleTime the check for new signatures will be set according to the interval. Valid values 0 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderSignatureUpdateIntervalInHours() {
        return this._defenderSignatureUpdateIntervalInHours;
    }
    /**
     * Gets the defenderSubmitSamplesConsentType property value. Checks for the user consent level in Windows Defender to send data. Possible values are: sendSafeSamplesAutomatically, alwaysPrompt, neverSend, sendAllSamplesAutomatically.
     * @return a defenderSubmitSamplesConsentType
     */
    @javax.annotation.Nullable
    public DefenderSubmitSamplesConsentType getDefenderSubmitSamplesConsentType() {
        return this._defenderSubmitSamplesConsentType;
    }
    /**
     * Gets the defenderUntrustedExecutable property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderUntrustedExecutable() {
        return this._defenderUntrustedExecutable;
    }
    /**
     * Gets the defenderUntrustedExecutableType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a defenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderUntrustedExecutableType() {
        return this._defenderUntrustedExecutableType;
    }
    /**
     * Gets the defenderUntrustedUSBProcess property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderUntrustedUSBProcess() {
        return this._defenderUntrustedUSBProcess;
    }
    /**
     * Gets the defenderUntrustedUSBProcessType property value. Possible values of Defender Attack Surface Reduction Rules
     * @return a defenderAttackSurfaceType
     */
    @javax.annotation.Nullable
    public DefenderAttackSurfaceType getDefenderUntrustedUSBProcessType() {
        return this._defenderUntrustedUSBProcessType;
    }
    /**
     * Gets the deviceGuardEnableSecureBootWithDMA property value. This property will be deprecated in May 2019 and will be replaced with property DeviceGuardSecureBootWithDMA. Specifies whether Platform Security Level is enabled at next reboot.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceGuardEnableSecureBootWithDMA() {
        return this._deviceGuardEnableSecureBootWithDMA;
    }
    /**
     * Gets the deviceGuardEnableVirtualizationBasedSecurity property value. Turns On Virtualization Based Security(VBS).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceGuardEnableVirtualizationBasedSecurity() {
        return this._deviceGuardEnableVirtualizationBasedSecurity;
    }
    /**
     * Gets the deviceGuardLaunchSystemGuard property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getDeviceGuardLaunchSystemGuard() {
        return this._deviceGuardLaunchSystemGuard;
    }
    /**
     * Gets the deviceGuardLocalSystemAuthorityCredentialGuardSettings property value. Possible values of Credential Guard settings.
     * @return a deviceGuardLocalSystemAuthorityCredentialGuardType
     */
    @javax.annotation.Nullable
    public DeviceGuardLocalSystemAuthorityCredentialGuardType getDeviceGuardLocalSystemAuthorityCredentialGuardSettings() {
        return this._deviceGuardLocalSystemAuthorityCredentialGuardSettings;
    }
    /**
     * Gets the deviceGuardSecureBootWithDMA property value. Possible values of Secure Boot with DMA
     * @return a secureBootWithDMAType
     */
    @javax.annotation.Nullable
    public SecureBootWithDMAType getDeviceGuardSecureBootWithDMA() {
        return this._deviceGuardSecureBootWithDMA;
    }
    /**
     * Gets the dmaGuardDeviceEnumerationPolicy property value. Possible values of the DmaGuardDeviceEnumerationPolicy.
     * @return a dmaGuardDeviceEnumerationPolicyType
     */
    @javax.annotation.Nullable
    public DmaGuardDeviceEnumerationPolicyType getDmaGuardDeviceEnumerationPolicy() {
        return this._dmaGuardDeviceEnumerationPolicy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10EndpointProtectionConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applicationGuardAllowCameraMicrophoneRedirection", (n) -> { currentObject.setApplicationGuardAllowCameraMicrophoneRedirection(n.getBooleanValue()); });
            this.put("applicationGuardAllowFileSaveOnHost", (n) -> { currentObject.setApplicationGuardAllowFileSaveOnHost(n.getBooleanValue()); });
            this.put("applicationGuardAllowPersistence", (n) -> { currentObject.setApplicationGuardAllowPersistence(n.getBooleanValue()); });
            this.put("applicationGuardAllowPrintToLocalPrinters", (n) -> { currentObject.setApplicationGuardAllowPrintToLocalPrinters(n.getBooleanValue()); });
            this.put("applicationGuardAllowPrintToNetworkPrinters", (n) -> { currentObject.setApplicationGuardAllowPrintToNetworkPrinters(n.getBooleanValue()); });
            this.put("applicationGuardAllowPrintToPDF", (n) -> { currentObject.setApplicationGuardAllowPrintToPDF(n.getBooleanValue()); });
            this.put("applicationGuardAllowPrintToXPS", (n) -> { currentObject.setApplicationGuardAllowPrintToXPS(n.getBooleanValue()); });
            this.put("applicationGuardAllowVirtualGPU", (n) -> { currentObject.setApplicationGuardAllowVirtualGPU(n.getBooleanValue()); });
            this.put("applicationGuardBlockClipboardSharing", (n) -> { currentObject.setApplicationGuardBlockClipboardSharing(n.getEnumValue(ApplicationGuardBlockClipboardSharingType.class)); });
            this.put("applicationGuardBlockFileTransfer", (n) -> { currentObject.setApplicationGuardBlockFileTransfer(n.getEnumValue(ApplicationGuardBlockFileTransferType.class)); });
            this.put("applicationGuardBlockNonEnterpriseContent", (n) -> { currentObject.setApplicationGuardBlockNonEnterpriseContent(n.getBooleanValue()); });
            this.put("applicationGuardCertificateThumbprints", (n) -> { currentObject.setApplicationGuardCertificateThumbprints(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("applicationGuardEnabled", (n) -> { currentObject.setApplicationGuardEnabled(n.getBooleanValue()); });
            this.put("applicationGuardEnabledOptions", (n) -> { currentObject.setApplicationGuardEnabledOptions(n.getEnumValue(ApplicationGuardEnabledOptions.class)); });
            this.put("applicationGuardForceAuditing", (n) -> { currentObject.setApplicationGuardForceAuditing(n.getBooleanValue()); });
            this.put("appLockerApplicationControl", (n) -> { currentObject.setAppLockerApplicationControl(n.getEnumValue(AppLockerApplicationControlType.class)); });
            this.put("bitLockerAllowStandardUserEncryption", (n) -> { currentObject.setBitLockerAllowStandardUserEncryption(n.getBooleanValue()); });
            this.put("bitLockerDisableWarningForOtherDiskEncryption", (n) -> { currentObject.setBitLockerDisableWarningForOtherDiskEncryption(n.getBooleanValue()); });
            this.put("bitLockerEnableStorageCardEncryptionOnMobile", (n) -> { currentObject.setBitLockerEnableStorageCardEncryptionOnMobile(n.getBooleanValue()); });
            this.put("bitLockerEncryptDevice", (n) -> { currentObject.setBitLockerEncryptDevice(n.getBooleanValue()); });
            this.put("bitLockerFixedDrivePolicy", (n) -> { currentObject.setBitLockerFixedDrivePolicy(n.getObjectValue(BitLockerFixedDrivePolicy::createFromDiscriminatorValue)); });
            this.put("bitLockerRecoveryPasswordRotation", (n) -> { currentObject.setBitLockerRecoveryPasswordRotation(n.getEnumValue(BitLockerRecoveryPasswordRotationType.class)); });
            this.put("bitLockerRemovableDrivePolicy", (n) -> { currentObject.setBitLockerRemovableDrivePolicy(n.getObjectValue(BitLockerRemovableDrivePolicy::createFromDiscriminatorValue)); });
            this.put("bitLockerSystemDrivePolicy", (n) -> { currentObject.setBitLockerSystemDrivePolicy(n.getObjectValue(BitLockerSystemDrivePolicy::createFromDiscriminatorValue)); });
            this.put("defenderAdditionalGuardedFolders", (n) -> { currentObject.setDefenderAdditionalGuardedFolders(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("defenderAdobeReaderLaunchChildProcess", (n) -> { currentObject.setDefenderAdobeReaderLaunchChildProcess(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderAdvancedRansomewareProtectionType", (n) -> { currentObject.setDefenderAdvancedRansomewareProtectionType(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderAllowBehaviorMonitoring", (n) -> { currentObject.setDefenderAllowBehaviorMonitoring(n.getBooleanValue()); });
            this.put("defenderAllowCloudProtection", (n) -> { currentObject.setDefenderAllowCloudProtection(n.getBooleanValue()); });
            this.put("defenderAllowEndUserAccess", (n) -> { currentObject.setDefenderAllowEndUserAccess(n.getBooleanValue()); });
            this.put("defenderAllowIntrusionPreventionSystem", (n) -> { currentObject.setDefenderAllowIntrusionPreventionSystem(n.getBooleanValue()); });
            this.put("defenderAllowOnAccessProtection", (n) -> { currentObject.setDefenderAllowOnAccessProtection(n.getBooleanValue()); });
            this.put("defenderAllowRealTimeMonitoring", (n) -> { currentObject.setDefenderAllowRealTimeMonitoring(n.getBooleanValue()); });
            this.put("defenderAllowScanArchiveFiles", (n) -> { currentObject.setDefenderAllowScanArchiveFiles(n.getBooleanValue()); });
            this.put("defenderAllowScanDownloads", (n) -> { currentObject.setDefenderAllowScanDownloads(n.getBooleanValue()); });
            this.put("defenderAllowScanNetworkFiles", (n) -> { currentObject.setDefenderAllowScanNetworkFiles(n.getBooleanValue()); });
            this.put("defenderAllowScanRemovableDrivesDuringFullScan", (n) -> { currentObject.setDefenderAllowScanRemovableDrivesDuringFullScan(n.getBooleanValue()); });
            this.put("defenderAllowScanScriptsLoadedInInternetExplorer", (n) -> { currentObject.setDefenderAllowScanScriptsLoadedInInternetExplorer(n.getBooleanValue()); });
            this.put("defenderAttackSurfaceReductionExcludedPaths", (n) -> { currentObject.setDefenderAttackSurfaceReductionExcludedPaths(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("defenderBlockEndUserAccess", (n) -> { currentObject.setDefenderBlockEndUserAccess(n.getBooleanValue()); });
            this.put("defenderBlockPersistenceThroughWmiType", (n) -> { currentObject.setDefenderBlockPersistenceThroughWmiType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
            this.put("defenderCheckForSignaturesBeforeRunningScan", (n) -> { currentObject.setDefenderCheckForSignaturesBeforeRunningScan(n.getBooleanValue()); });
            this.put("defenderCloudBlockLevel", (n) -> { currentObject.setDefenderCloudBlockLevel(n.getEnumValue(DefenderCloudBlockLevelType.class)); });
            this.put("defenderCloudExtendedTimeoutInSeconds", (n) -> { currentObject.setDefenderCloudExtendedTimeoutInSeconds(n.getIntegerValue()); });
            this.put("defenderDaysBeforeDeletingQuarantinedMalware", (n) -> { currentObject.setDefenderDaysBeforeDeletingQuarantinedMalware(n.getIntegerValue()); });
            this.put("defenderDetectedMalwareActions", (n) -> { currentObject.setDefenderDetectedMalwareActions(n.getObjectValue(DefenderDetectedMalwareActions::createFromDiscriminatorValue)); });
            this.put("defenderDisableBehaviorMonitoring", (n) -> { currentObject.setDefenderDisableBehaviorMonitoring(n.getBooleanValue()); });
            this.put("defenderDisableCatchupFullScan", (n) -> { currentObject.setDefenderDisableCatchupFullScan(n.getBooleanValue()); });
            this.put("defenderDisableCatchupQuickScan", (n) -> { currentObject.setDefenderDisableCatchupQuickScan(n.getBooleanValue()); });
            this.put("defenderDisableCloudProtection", (n) -> { currentObject.setDefenderDisableCloudProtection(n.getBooleanValue()); });
            this.put("defenderDisableIntrusionPreventionSystem", (n) -> { currentObject.setDefenderDisableIntrusionPreventionSystem(n.getBooleanValue()); });
            this.put("defenderDisableOnAccessProtection", (n) -> { currentObject.setDefenderDisableOnAccessProtection(n.getBooleanValue()); });
            this.put("defenderDisableRealTimeMonitoring", (n) -> { currentObject.setDefenderDisableRealTimeMonitoring(n.getBooleanValue()); });
            this.put("defenderDisableScanArchiveFiles", (n) -> { currentObject.setDefenderDisableScanArchiveFiles(n.getBooleanValue()); });
            this.put("defenderDisableScanDownloads", (n) -> { currentObject.setDefenderDisableScanDownloads(n.getBooleanValue()); });
            this.put("defenderDisableScanNetworkFiles", (n) -> { currentObject.setDefenderDisableScanNetworkFiles(n.getBooleanValue()); });
            this.put("defenderDisableScanRemovableDrivesDuringFullScan", (n) -> { currentObject.setDefenderDisableScanRemovableDrivesDuringFullScan(n.getBooleanValue()); });
            this.put("defenderDisableScanScriptsLoadedInInternetExplorer", (n) -> { currentObject.setDefenderDisableScanScriptsLoadedInInternetExplorer(n.getBooleanValue()); });
            this.put("defenderEmailContentExecution", (n) -> { currentObject.setDefenderEmailContentExecution(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderEmailContentExecutionType", (n) -> { currentObject.setDefenderEmailContentExecutionType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
            this.put("defenderEnableLowCpuPriority", (n) -> { currentObject.setDefenderEnableLowCpuPriority(n.getBooleanValue()); });
            this.put("defenderEnableScanIncomingMail", (n) -> { currentObject.setDefenderEnableScanIncomingMail(n.getBooleanValue()); });
            this.put("defenderEnableScanMappedNetworkDrivesDuringFullScan", (n) -> { currentObject.setDefenderEnableScanMappedNetworkDrivesDuringFullScan(n.getBooleanValue()); });
            this.put("defenderExploitProtectionXml", (n) -> { currentObject.setDefenderExploitProtectionXml(n.getByteArrayValue()); });
            this.put("defenderExploitProtectionXmlFileName", (n) -> { currentObject.setDefenderExploitProtectionXmlFileName(n.getStringValue()); });
            this.put("defenderFileExtensionsToExclude", (n) -> { currentObject.setDefenderFileExtensionsToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("defenderFilesAndFoldersToExclude", (n) -> { currentObject.setDefenderFilesAndFoldersToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("defenderGuardedFoldersAllowedAppPaths", (n) -> { currentObject.setDefenderGuardedFoldersAllowedAppPaths(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("defenderGuardMyFoldersType", (n) -> { currentObject.setDefenderGuardMyFoldersType(n.getEnumValue(FolderProtectionType.class)); });
            this.put("defenderNetworkProtectionType", (n) -> { currentObject.setDefenderNetworkProtectionType(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderOfficeAppsExecutableContentCreationOrLaunch", (n) -> { currentObject.setDefenderOfficeAppsExecutableContentCreationOrLaunch(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderOfficeAppsExecutableContentCreationOrLaunchType", (n) -> { currentObject.setDefenderOfficeAppsExecutableContentCreationOrLaunchType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
            this.put("defenderOfficeAppsLaunchChildProcess", (n) -> { currentObject.setDefenderOfficeAppsLaunchChildProcess(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderOfficeAppsLaunchChildProcessType", (n) -> { currentObject.setDefenderOfficeAppsLaunchChildProcessType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
            this.put("defenderOfficeAppsOtherProcessInjection", (n) -> { currentObject.setDefenderOfficeAppsOtherProcessInjection(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderOfficeAppsOtherProcessInjectionType", (n) -> { currentObject.setDefenderOfficeAppsOtherProcessInjectionType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
            this.put("defenderOfficeCommunicationAppsLaunchChildProcess", (n) -> { currentObject.setDefenderOfficeCommunicationAppsLaunchChildProcess(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderOfficeMacroCodeAllowWin32Imports", (n) -> { currentObject.setDefenderOfficeMacroCodeAllowWin32Imports(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderOfficeMacroCodeAllowWin32ImportsType", (n) -> { currentObject.setDefenderOfficeMacroCodeAllowWin32ImportsType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
            this.put("defenderPotentiallyUnwantedAppAction", (n) -> { currentObject.setDefenderPotentiallyUnwantedAppAction(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderPreventCredentialStealingType", (n) -> { currentObject.setDefenderPreventCredentialStealingType(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderProcessCreation", (n) -> { currentObject.setDefenderProcessCreation(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderProcessCreationType", (n) -> { currentObject.setDefenderProcessCreationType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
            this.put("defenderProcessesToExclude", (n) -> { currentObject.setDefenderProcessesToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("defenderScanDirection", (n) -> { currentObject.setDefenderScanDirection(n.getEnumValue(DefenderRealtimeScanDirection.class)); });
            this.put("defenderScanMaxCpuPercentage", (n) -> { currentObject.setDefenderScanMaxCpuPercentage(n.getIntegerValue()); });
            this.put("defenderScanType", (n) -> { currentObject.setDefenderScanType(n.getEnumValue(DefenderScanType.class)); });
            this.put("defenderScheduledQuickScanTime", (n) -> { currentObject.setDefenderScheduledQuickScanTime(n.getLocalTimeValue()); });
            this.put("defenderScheduledScanDay", (n) -> { currentObject.setDefenderScheduledScanDay(n.getEnumValue(WeeklySchedule.class)); });
            this.put("defenderScheduledScanTime", (n) -> { currentObject.setDefenderScheduledScanTime(n.getLocalTimeValue()); });
            this.put("defenderScriptDownloadedPayloadExecution", (n) -> { currentObject.setDefenderScriptDownloadedPayloadExecution(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderScriptDownloadedPayloadExecutionType", (n) -> { currentObject.setDefenderScriptDownloadedPayloadExecutionType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
            this.put("defenderScriptObfuscatedMacroCode", (n) -> { currentObject.setDefenderScriptObfuscatedMacroCode(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderScriptObfuscatedMacroCodeType", (n) -> { currentObject.setDefenderScriptObfuscatedMacroCodeType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
            this.put("defenderSecurityCenterBlockExploitProtectionOverride", (n) -> { currentObject.setDefenderSecurityCenterBlockExploitProtectionOverride(n.getBooleanValue()); });
            this.put("defenderSecurityCenterDisableAccountUI", (n) -> { currentObject.setDefenderSecurityCenterDisableAccountUI(n.getBooleanValue()); });
            this.put("defenderSecurityCenterDisableAppBrowserUI", (n) -> { currentObject.setDefenderSecurityCenterDisableAppBrowserUI(n.getBooleanValue()); });
            this.put("defenderSecurityCenterDisableClearTpmUI", (n) -> { currentObject.setDefenderSecurityCenterDisableClearTpmUI(n.getBooleanValue()); });
            this.put("defenderSecurityCenterDisableFamilyUI", (n) -> { currentObject.setDefenderSecurityCenterDisableFamilyUI(n.getBooleanValue()); });
            this.put("defenderSecurityCenterDisableHardwareUI", (n) -> { currentObject.setDefenderSecurityCenterDisableHardwareUI(n.getBooleanValue()); });
            this.put("defenderSecurityCenterDisableHealthUI", (n) -> { currentObject.setDefenderSecurityCenterDisableHealthUI(n.getBooleanValue()); });
            this.put("defenderSecurityCenterDisableNetworkUI", (n) -> { currentObject.setDefenderSecurityCenterDisableNetworkUI(n.getBooleanValue()); });
            this.put("defenderSecurityCenterDisableNotificationAreaUI", (n) -> { currentObject.setDefenderSecurityCenterDisableNotificationAreaUI(n.getBooleanValue()); });
            this.put("defenderSecurityCenterDisableRansomwareUI", (n) -> { currentObject.setDefenderSecurityCenterDisableRansomwareUI(n.getBooleanValue()); });
            this.put("defenderSecurityCenterDisableSecureBootUI", (n) -> { currentObject.setDefenderSecurityCenterDisableSecureBootUI(n.getBooleanValue()); });
            this.put("defenderSecurityCenterDisableTroubleshootingUI", (n) -> { currentObject.setDefenderSecurityCenterDisableTroubleshootingUI(n.getBooleanValue()); });
            this.put("defenderSecurityCenterDisableVirusUI", (n) -> { currentObject.setDefenderSecurityCenterDisableVirusUI(n.getBooleanValue()); });
            this.put("defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI", (n) -> { currentObject.setDefenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI(n.getBooleanValue()); });
            this.put("defenderSecurityCenterHelpEmail", (n) -> { currentObject.setDefenderSecurityCenterHelpEmail(n.getStringValue()); });
            this.put("defenderSecurityCenterHelpPhone", (n) -> { currentObject.setDefenderSecurityCenterHelpPhone(n.getStringValue()); });
            this.put("defenderSecurityCenterHelpURL", (n) -> { currentObject.setDefenderSecurityCenterHelpURL(n.getStringValue()); });
            this.put("defenderSecurityCenterITContactDisplay", (n) -> { currentObject.setDefenderSecurityCenterITContactDisplay(n.getEnumValue(DefenderSecurityCenterITContactDisplayType.class)); });
            this.put("defenderSecurityCenterNotificationsFromApp", (n) -> { currentObject.setDefenderSecurityCenterNotificationsFromApp(n.getEnumValue(DefenderSecurityCenterNotificationsFromAppType.class)); });
            this.put("defenderSecurityCenterOrganizationDisplayName", (n) -> { currentObject.setDefenderSecurityCenterOrganizationDisplayName(n.getStringValue()); });
            this.put("defenderSignatureUpdateIntervalInHours", (n) -> { currentObject.setDefenderSignatureUpdateIntervalInHours(n.getIntegerValue()); });
            this.put("defenderSubmitSamplesConsentType", (n) -> { currentObject.setDefenderSubmitSamplesConsentType(n.getEnumValue(DefenderSubmitSamplesConsentType.class)); });
            this.put("defenderUntrustedExecutable", (n) -> { currentObject.setDefenderUntrustedExecutable(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderUntrustedExecutableType", (n) -> { currentObject.setDefenderUntrustedExecutableType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
            this.put("defenderUntrustedUSBProcess", (n) -> { currentObject.setDefenderUntrustedUSBProcess(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderUntrustedUSBProcessType", (n) -> { currentObject.setDefenderUntrustedUSBProcessType(n.getEnumValue(DefenderAttackSurfaceType.class)); });
            this.put("deviceGuardEnableSecureBootWithDMA", (n) -> { currentObject.setDeviceGuardEnableSecureBootWithDMA(n.getBooleanValue()); });
            this.put("deviceGuardEnableVirtualizationBasedSecurity", (n) -> { currentObject.setDeviceGuardEnableVirtualizationBasedSecurity(n.getBooleanValue()); });
            this.put("deviceGuardLaunchSystemGuard", (n) -> { currentObject.setDeviceGuardLaunchSystemGuard(n.getEnumValue(Enablement.class)); });
            this.put("deviceGuardLocalSystemAuthorityCredentialGuardSettings", (n) -> { currentObject.setDeviceGuardLocalSystemAuthorityCredentialGuardSettings(n.getEnumValue(DeviceGuardLocalSystemAuthorityCredentialGuardType.class)); });
            this.put("deviceGuardSecureBootWithDMA", (n) -> { currentObject.setDeviceGuardSecureBootWithDMA(n.getEnumValue(SecureBootWithDMAType.class)); });
            this.put("dmaGuardDeviceEnumerationPolicy", (n) -> { currentObject.setDmaGuardDeviceEnumerationPolicy(n.getEnumValue(DmaGuardDeviceEnumerationPolicyType.class)); });
            this.put("firewallBlockStatefulFTP", (n) -> { currentObject.setFirewallBlockStatefulFTP(n.getBooleanValue()); });
            this.put("firewallCertificateRevocationListCheckMethod", (n) -> { currentObject.setFirewallCertificateRevocationListCheckMethod(n.getEnumValue(FirewallCertificateRevocationListCheckMethodType.class)); });
            this.put("firewallIdleTimeoutForSecurityAssociationInSeconds", (n) -> { currentObject.setFirewallIdleTimeoutForSecurityAssociationInSeconds(n.getIntegerValue()); });
            this.put("firewallIPSecExemptionsAllowDHCP", (n) -> { currentObject.setFirewallIPSecExemptionsAllowDHCP(n.getBooleanValue()); });
            this.put("firewallIPSecExemptionsAllowICMP", (n) -> { currentObject.setFirewallIPSecExemptionsAllowICMP(n.getBooleanValue()); });
            this.put("firewallIPSecExemptionsAllowNeighborDiscovery", (n) -> { currentObject.setFirewallIPSecExemptionsAllowNeighborDiscovery(n.getBooleanValue()); });
            this.put("firewallIPSecExemptionsAllowRouterDiscovery", (n) -> { currentObject.setFirewallIPSecExemptionsAllowRouterDiscovery(n.getBooleanValue()); });
            this.put("firewallIPSecExemptionsNone", (n) -> { currentObject.setFirewallIPSecExemptionsNone(n.getBooleanValue()); });
            this.put("firewallMergeKeyingModuleSettings", (n) -> { currentObject.setFirewallMergeKeyingModuleSettings(n.getBooleanValue()); });
            this.put("firewallPacketQueueingMethod", (n) -> { currentObject.setFirewallPacketQueueingMethod(n.getEnumValue(FirewallPacketQueueingMethodType.class)); });
            this.put("firewallPreSharedKeyEncodingMethod", (n) -> { currentObject.setFirewallPreSharedKeyEncodingMethod(n.getEnumValue(FirewallPreSharedKeyEncodingMethodType.class)); });
            this.put("firewallProfileDomain", (n) -> { currentObject.setFirewallProfileDomain(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
            this.put("firewallProfilePrivate", (n) -> { currentObject.setFirewallProfilePrivate(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
            this.put("firewallProfilePublic", (n) -> { currentObject.setFirewallProfilePublic(n.getObjectValue(WindowsFirewallNetworkProfile::createFromDiscriminatorValue)); });
            this.put("firewallRules", (n) -> { currentObject.setFirewallRules(n.getCollectionOfObjectValues(WindowsFirewallRule::createFromDiscriminatorValue)); });
            this.put("lanManagerAuthenticationLevel", (n) -> { currentObject.setLanManagerAuthenticationLevel(n.getEnumValue(LanManagerAuthenticationLevel.class)); });
            this.put("lanManagerWorkstationDisableInsecureGuestLogons", (n) -> { currentObject.setLanManagerWorkstationDisableInsecureGuestLogons(n.getBooleanValue()); });
            this.put("localSecurityOptionsAdministratorAccountName", (n) -> { currentObject.setLocalSecurityOptionsAdministratorAccountName(n.getStringValue()); });
            this.put("localSecurityOptionsAdministratorElevationPromptBehavior", (n) -> { currentObject.setLocalSecurityOptionsAdministratorElevationPromptBehavior(n.getEnumValue(LocalSecurityOptionsAdministratorElevationPromptBehaviorType.class)); });
            this.put("localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares", (n) -> { currentObject.setLocalSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares(n.getBooleanValue()); });
            this.put("localSecurityOptionsAllowPKU2UAuthenticationRequests", (n) -> { currentObject.setLocalSecurityOptionsAllowPKU2UAuthenticationRequests(n.getBooleanValue()); });
            this.put("localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager", (n) -> { currentObject.setLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager(n.getStringValue()); });
            this.put("localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool", (n) -> { currentObject.setLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool(n.getBooleanValue()); });
            this.put("localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn", (n) -> { currentObject.setLocalSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn(n.getBooleanValue()); });
            this.put("localSecurityOptionsAllowUIAccessApplicationElevation", (n) -> { currentObject.setLocalSecurityOptionsAllowUIAccessApplicationElevation(n.getBooleanValue()); });
            this.put("localSecurityOptionsAllowUIAccessApplicationsForSecureLocations", (n) -> { currentObject.setLocalSecurityOptionsAllowUIAccessApplicationsForSecureLocations(n.getBooleanValue()); });
            this.put("localSecurityOptionsAllowUndockWithoutHavingToLogon", (n) -> { currentObject.setLocalSecurityOptionsAllowUndockWithoutHavingToLogon(n.getBooleanValue()); });
            this.put("localSecurityOptionsBlockMicrosoftAccounts", (n) -> { currentObject.setLocalSecurityOptionsBlockMicrosoftAccounts(n.getBooleanValue()); });
            this.put("localSecurityOptionsBlockRemoteLogonWithBlankPassword", (n) -> { currentObject.setLocalSecurityOptionsBlockRemoteLogonWithBlankPassword(n.getBooleanValue()); });
            this.put("localSecurityOptionsBlockRemoteOpticalDriveAccess", (n) -> { currentObject.setLocalSecurityOptionsBlockRemoteOpticalDriveAccess(n.getBooleanValue()); });
            this.put("localSecurityOptionsBlockUsersInstallingPrinterDrivers", (n) -> { currentObject.setLocalSecurityOptionsBlockUsersInstallingPrinterDrivers(n.getBooleanValue()); });
            this.put("localSecurityOptionsClearVirtualMemoryPageFile", (n) -> { currentObject.setLocalSecurityOptionsClearVirtualMemoryPageFile(n.getBooleanValue()); });
            this.put("localSecurityOptionsClientDigitallySignCommunicationsAlways", (n) -> { currentObject.setLocalSecurityOptionsClientDigitallySignCommunicationsAlways(n.getBooleanValue()); });
            this.put("localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers", (n) -> { currentObject.setLocalSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers(n.getBooleanValue()); });
            this.put("localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation", (n) -> { currentObject.setLocalSecurityOptionsDetectApplicationInstallationsAndPromptForElevation(n.getBooleanValue()); });
            this.put("localSecurityOptionsDisableAdministratorAccount", (n) -> { currentObject.setLocalSecurityOptionsDisableAdministratorAccount(n.getBooleanValue()); });
            this.put("localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees", (n) -> { currentObject.setLocalSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees(n.getBooleanValue()); });
            this.put("localSecurityOptionsDisableGuestAccount", (n) -> { currentObject.setLocalSecurityOptionsDisableGuestAccount(n.getBooleanValue()); });
            this.put("localSecurityOptionsDisableServerDigitallySignCommunicationsAlways", (n) -> { currentObject.setLocalSecurityOptionsDisableServerDigitallySignCommunicationsAlways(n.getBooleanValue()); });
            this.put("localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees", (n) -> { currentObject.setLocalSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees(n.getBooleanValue()); });
            this.put("localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts", (n) -> { currentObject.setLocalSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts(n.getBooleanValue()); });
            this.put("localSecurityOptionsDoNotRequireCtrlAltDel", (n) -> { currentObject.setLocalSecurityOptionsDoNotRequireCtrlAltDel(n.getBooleanValue()); });
            this.put("localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange", (n) -> { currentObject.setLocalSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange(n.getBooleanValue()); });
            this.put("localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser", (n) -> { currentObject.setLocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser(n.getEnumValue(LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType.class)); });
            this.put("localSecurityOptionsGuestAccountName", (n) -> { currentObject.setLocalSecurityOptionsGuestAccountName(n.getStringValue()); });
            this.put("localSecurityOptionsHideLastSignedInUser", (n) -> { currentObject.setLocalSecurityOptionsHideLastSignedInUser(n.getBooleanValue()); });
            this.put("localSecurityOptionsHideUsernameAtSignIn", (n) -> { currentObject.setLocalSecurityOptionsHideUsernameAtSignIn(n.getBooleanValue()); });
            this.put("localSecurityOptionsInformationDisplayedOnLockScreen", (n) -> { currentObject.setLocalSecurityOptionsInformationDisplayedOnLockScreen(n.getEnumValue(LocalSecurityOptionsInformationDisplayedOnLockScreenType.class)); });
            this.put("localSecurityOptionsInformationShownOnLockScreen", (n) -> { currentObject.setLocalSecurityOptionsInformationShownOnLockScreen(n.getEnumValue(LocalSecurityOptionsInformationShownOnLockScreenType.class)); });
            this.put("localSecurityOptionsLogOnMessageText", (n) -> { currentObject.setLocalSecurityOptionsLogOnMessageText(n.getStringValue()); });
            this.put("localSecurityOptionsLogOnMessageTitle", (n) -> { currentObject.setLocalSecurityOptionsLogOnMessageTitle(n.getStringValue()); });
            this.put("localSecurityOptionsMachineInactivityLimit", (n) -> { currentObject.setLocalSecurityOptionsMachineInactivityLimit(n.getIntegerValue()); });
            this.put("localSecurityOptionsMachineInactivityLimitInMinutes", (n) -> { currentObject.setLocalSecurityOptionsMachineInactivityLimitInMinutes(n.getIntegerValue()); });
            this.put("localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients", (n) -> { currentObject.setLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients(n.getEnumValue(LocalSecurityOptionsMinimumSessionSecurity.class)); });
            this.put("localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers", (n) -> { currentObject.setLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers(n.getEnumValue(LocalSecurityOptionsMinimumSessionSecurity.class)); });
            this.put("localSecurityOptionsOnlyElevateSignedExecutables", (n) -> { currentObject.setLocalSecurityOptionsOnlyElevateSignedExecutables(n.getBooleanValue()); });
            this.put("localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares", (n) -> { currentObject.setLocalSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares(n.getBooleanValue()); });
            this.put("localSecurityOptionsSmartCardRemovalBehavior", (n) -> { currentObject.setLocalSecurityOptionsSmartCardRemovalBehavior(n.getEnumValue(LocalSecurityOptionsSmartCardRemovalBehaviorType.class)); });
            this.put("localSecurityOptionsStandardUserElevationPromptBehavior", (n) -> { currentObject.setLocalSecurityOptionsStandardUserElevationPromptBehavior(n.getEnumValue(LocalSecurityOptionsStandardUserElevationPromptBehaviorType.class)); });
            this.put("localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation", (n) -> { currentObject.setLocalSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation(n.getBooleanValue()); });
            this.put("localSecurityOptionsUseAdminApprovalMode", (n) -> { currentObject.setLocalSecurityOptionsUseAdminApprovalMode(n.getBooleanValue()); });
            this.put("localSecurityOptionsUseAdminApprovalModeForAdministrators", (n) -> { currentObject.setLocalSecurityOptionsUseAdminApprovalModeForAdministrators(n.getBooleanValue()); });
            this.put("localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations", (n) -> { currentObject.setLocalSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations(n.getBooleanValue()); });
            this.put("smartScreenBlockOverrideForFiles", (n) -> { currentObject.setSmartScreenBlockOverrideForFiles(n.getBooleanValue()); });
            this.put("smartScreenEnableInShell", (n) -> { currentObject.setSmartScreenEnableInShell(n.getBooleanValue()); });
            this.put("userRightsAccessCredentialManagerAsTrustedCaller", (n) -> { currentObject.setUserRightsAccessCredentialManagerAsTrustedCaller(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsActAsPartOfTheOperatingSystem", (n) -> { currentObject.setUserRightsActAsPartOfTheOperatingSystem(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsAllowAccessFromNetwork", (n) -> { currentObject.setUserRightsAllowAccessFromNetwork(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsBackupData", (n) -> { currentObject.setUserRightsBackupData(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsBlockAccessFromNetwork", (n) -> { currentObject.setUserRightsBlockAccessFromNetwork(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsChangeSystemTime", (n) -> { currentObject.setUserRightsChangeSystemTime(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsCreateGlobalObjects", (n) -> { currentObject.setUserRightsCreateGlobalObjects(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsCreatePageFile", (n) -> { currentObject.setUserRightsCreatePageFile(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsCreatePermanentSharedObjects", (n) -> { currentObject.setUserRightsCreatePermanentSharedObjects(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsCreateSymbolicLinks", (n) -> { currentObject.setUserRightsCreateSymbolicLinks(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsCreateToken", (n) -> { currentObject.setUserRightsCreateToken(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsDebugPrograms", (n) -> { currentObject.setUserRightsDebugPrograms(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsDelegation", (n) -> { currentObject.setUserRightsDelegation(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsDenyLocalLogOn", (n) -> { currentObject.setUserRightsDenyLocalLogOn(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsGenerateSecurityAudits", (n) -> { currentObject.setUserRightsGenerateSecurityAudits(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsImpersonateClient", (n) -> { currentObject.setUserRightsImpersonateClient(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsIncreaseSchedulingPriority", (n) -> { currentObject.setUserRightsIncreaseSchedulingPriority(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsLoadUnloadDrivers", (n) -> { currentObject.setUserRightsLoadUnloadDrivers(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsLocalLogOn", (n) -> { currentObject.setUserRightsLocalLogOn(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsLockMemory", (n) -> { currentObject.setUserRightsLockMemory(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsManageAuditingAndSecurityLogs", (n) -> { currentObject.setUserRightsManageAuditingAndSecurityLogs(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsManageVolumes", (n) -> { currentObject.setUserRightsManageVolumes(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsModifyFirmwareEnvironment", (n) -> { currentObject.setUserRightsModifyFirmwareEnvironment(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsModifyObjectLabels", (n) -> { currentObject.setUserRightsModifyObjectLabels(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsProfileSingleProcess", (n) -> { currentObject.setUserRightsProfileSingleProcess(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsRemoteDesktopServicesLogOn", (n) -> { currentObject.setUserRightsRemoteDesktopServicesLogOn(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsRemoteShutdown", (n) -> { currentObject.setUserRightsRemoteShutdown(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsRestoreData", (n) -> { currentObject.setUserRightsRestoreData(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("userRightsTakeOwnership", (n) -> { currentObject.setUserRightsTakeOwnership(n.getObjectValue(DeviceManagementUserRightsSetting::createFromDiscriminatorValue)); });
            this.put("windowsDefenderTamperProtection", (n) -> { currentObject.setWindowsDefenderTamperProtection(n.getEnumValue(WindowsDefenderTamperProtectionOptions.class)); });
            this.put("xboxServicesAccessoryManagementServiceStartupMode", (n) -> { currentObject.setXboxServicesAccessoryManagementServiceStartupMode(n.getEnumValue(ServiceStartType.class)); });
            this.put("xboxServicesEnableXboxGameSaveTask", (n) -> { currentObject.setXboxServicesEnableXboxGameSaveTask(n.getBooleanValue()); });
            this.put("xboxServicesLiveAuthManagerServiceStartupMode", (n) -> { currentObject.setXboxServicesLiveAuthManagerServiceStartupMode(n.getEnumValue(ServiceStartType.class)); });
            this.put("xboxServicesLiveGameSaveServiceStartupMode", (n) -> { currentObject.setXboxServicesLiveGameSaveServiceStartupMode(n.getEnumValue(ServiceStartType.class)); });
            this.put("xboxServicesLiveNetworkingServiceStartupMode", (n) -> { currentObject.setXboxServicesLiveNetworkingServiceStartupMode(n.getEnumValue(ServiceStartType.class)); });
        }};
    }
    /**
     * Gets the firewallBlockStatefulFTP property value. Blocks stateful FTP connections to the device
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallBlockStatefulFTP() {
        return this._firewallBlockStatefulFTP;
    }
    /**
     * Gets the firewallCertificateRevocationListCheckMethod property value. Possible values for firewallCertificateRevocationListCheckMethod
     * @return a firewallCertificateRevocationListCheckMethodType
     */
    @javax.annotation.Nullable
    public FirewallCertificateRevocationListCheckMethodType getFirewallCertificateRevocationListCheckMethod() {
        return this._firewallCertificateRevocationListCheckMethod;
    }
    /**
     * Gets the firewallIdleTimeoutForSecurityAssociationInSeconds property value. Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFirewallIdleTimeoutForSecurityAssociationInSeconds() {
        return this._firewallIdleTimeoutForSecurityAssociationInSeconds;
    }
    /**
     * Gets the firewallIPSecExemptionsAllowDHCP property value. Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowDHCP() {
        return this._firewallIPSecExemptionsAllowDHCP;
    }
    /**
     * Gets the firewallIPSecExemptionsAllowICMP property value. Configures IPSec exemptions to allow ICMP
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowICMP() {
        return this._firewallIPSecExemptionsAllowICMP;
    }
    /**
     * Gets the firewallIPSecExemptionsAllowNeighborDiscovery property value. Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowNeighborDiscovery() {
        return this._firewallIPSecExemptionsAllowNeighborDiscovery;
    }
    /**
     * Gets the firewallIPSecExemptionsAllowRouterDiscovery property value. Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsAllowRouterDiscovery() {
        return this._firewallIPSecExemptionsAllowRouterDiscovery;
    }
    /**
     * Gets the firewallIPSecExemptionsNone property value. Configures IPSec exemptions to no exemptions
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallIPSecExemptionsNone() {
        return this._firewallIPSecExemptionsNone;
    }
    /**
     * Gets the firewallMergeKeyingModuleSettings property value. If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallMergeKeyingModuleSettings() {
        return this._firewallMergeKeyingModuleSettings;
    }
    /**
     * Gets the firewallPacketQueueingMethod property value. Possible values for firewallPacketQueueingMethod
     * @return a firewallPacketQueueingMethodType
     */
    @javax.annotation.Nullable
    public FirewallPacketQueueingMethodType getFirewallPacketQueueingMethod() {
        return this._firewallPacketQueueingMethod;
    }
    /**
     * Gets the firewallPreSharedKeyEncodingMethod property value. Possible values for firewallPreSharedKeyEncodingMethod
     * @return a firewallPreSharedKeyEncodingMethodType
     */
    @javax.annotation.Nullable
    public FirewallPreSharedKeyEncodingMethodType getFirewallPreSharedKeyEncodingMethod() {
        return this._firewallPreSharedKeyEncodingMethod;
    }
    /**
     * Gets the firewallProfileDomain property value. Configures the firewall profile settings for domain networks
     * @return a windowsFirewallNetworkProfile
     */
    @javax.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfileDomain() {
        return this._firewallProfileDomain;
    }
    /**
     * Gets the firewallProfilePrivate property value. Configures the firewall profile settings for private networks
     * @return a windowsFirewallNetworkProfile
     */
    @javax.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfilePrivate() {
        return this._firewallProfilePrivate;
    }
    /**
     * Gets the firewallProfilePublic property value. Configures the firewall profile settings for public networks
     * @return a windowsFirewallNetworkProfile
     */
    @javax.annotation.Nullable
    public WindowsFirewallNetworkProfile getFirewallProfilePublic() {
        return this._firewallProfilePublic;
    }
    /**
     * Gets the firewallRules property value. Configures the firewall rule settings. This collection can contain a maximum of 150 elements.
     * @return a windowsFirewallRule
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsFirewallRule> getFirewallRules() {
        return this._firewallRules;
    }
    /**
     * Gets the lanManagerAuthenticationLevel property value. Possible values for LanManagerAuthenticationLevel
     * @return a lanManagerAuthenticationLevel
     */
    @javax.annotation.Nullable
    public LanManagerAuthenticationLevel getLanManagerAuthenticationLevel() {
        return this._lanManagerAuthenticationLevel;
    }
    /**
     * Gets the lanManagerWorkstationDisableInsecureGuestLogons property value. If enabled,the SMB client will allow insecure guest logons. If not configured, the SMB client will reject insecure guest logons.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLanManagerWorkstationDisableInsecureGuestLogons() {
        return this._lanManagerWorkstationDisableInsecureGuestLogons;
    }
    /**
     * Gets the localSecurityOptionsAdministratorAccountName property value. Define a different account name to be associated with the security identifier (SID) for the account 'Administrator'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalSecurityOptionsAdministratorAccountName() {
        return this._localSecurityOptionsAdministratorAccountName;
    }
    /**
     * Gets the localSecurityOptionsAdministratorElevationPromptBehavior property value. Possible values for LocalSecurityOptionsAdministratorElevationPromptBehavior
     * @return a localSecurityOptionsAdministratorElevationPromptBehaviorType
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsAdministratorElevationPromptBehaviorType getLocalSecurityOptionsAdministratorElevationPromptBehavior() {
        return this._localSecurityOptionsAdministratorElevationPromptBehavior;
    }
    /**
     * Gets the localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares property value. This security setting determines whether to allows anonymous users to perform certain activities, such as enumerating the names of domain accounts and network shares.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares() {
        return this._localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares;
    }
    /**
     * Gets the localSecurityOptionsAllowPKU2UAuthenticationRequests property value. Block PKU2U authentication requests to this device to use online identities.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowPKU2UAuthenticationRequests() {
        return this._localSecurityOptionsAllowPKU2UAuthenticationRequests;
    }
    /**
     * Gets the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager property value. Edit the default Security Descriptor Definition Language string to allow or deny users and groups to make remote calls to the SAM.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager() {
        return this._localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager;
    }
    /**
     * Gets the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool property value. UI helper boolean for LocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager entity
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool() {
        return this._localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool;
    }
    /**
     * Gets the localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn property value. This security setting determines whether a computer can be shut down without having to log on to Windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn() {
        return this._localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn;
    }
    /**
     * Gets the localSecurityOptionsAllowUIAccessApplicationElevation property value. Allow UIAccess apps to prompt for elevation without using the secure desktop.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowUIAccessApplicationElevation() {
        return this._localSecurityOptionsAllowUIAccessApplicationElevation;
    }
    /**
     * Gets the localSecurityOptionsAllowUIAccessApplicationsForSecureLocations property value. Allow UIAccess apps to prompt for elevation without using the secure desktop.Default is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowUIAccessApplicationsForSecureLocations() {
        return this._localSecurityOptionsAllowUIAccessApplicationsForSecureLocations;
    }
    /**
     * Gets the localSecurityOptionsAllowUndockWithoutHavingToLogon property value. Prevent a portable computer from being undocked without having to log in.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsAllowUndockWithoutHavingToLogon() {
        return this._localSecurityOptionsAllowUndockWithoutHavingToLogon;
    }
    /**
     * Gets the localSecurityOptionsBlockMicrosoftAccounts property value. Prevent users from adding new Microsoft accounts to this computer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsBlockMicrosoftAccounts() {
        return this._localSecurityOptionsBlockMicrosoftAccounts;
    }
    /**
     * Gets the localSecurityOptionsBlockRemoteLogonWithBlankPassword property value. Enable Local accounts that are not password protected to log on from locations other than the physical device.Default is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsBlockRemoteLogonWithBlankPassword() {
        return this._localSecurityOptionsBlockRemoteLogonWithBlankPassword;
    }
    /**
     * Gets the localSecurityOptionsBlockRemoteOpticalDriveAccess property value. Enabling this settings allows only interactively logged on user to access CD-ROM media.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsBlockRemoteOpticalDriveAccess() {
        return this._localSecurityOptionsBlockRemoteOpticalDriveAccess;
    }
    /**
     * Gets the localSecurityOptionsBlockUsersInstallingPrinterDrivers property value. Restrict installing printer drivers as part of connecting to a shared printer to admins only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsBlockUsersInstallingPrinterDrivers() {
        return this._localSecurityOptionsBlockUsersInstallingPrinterDrivers;
    }
    /**
     * Gets the localSecurityOptionsClearVirtualMemoryPageFile property value. This security setting determines whether the virtual memory pagefile is cleared when the system is shut down.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsClearVirtualMemoryPageFile() {
        return this._localSecurityOptionsClearVirtualMemoryPageFile;
    }
    /**
     * Gets the localSecurityOptionsClientDigitallySignCommunicationsAlways property value. This security setting determines whether packet signing is required by the SMB client component.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsClientDigitallySignCommunicationsAlways() {
        return this._localSecurityOptionsClientDigitallySignCommunicationsAlways;
    }
    /**
     * Gets the localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers property value. If this security setting is enabled, the Server Message Block (SMB) redirector is allowed to send plaintext passwords to non-Microsoft SMB servers that do not support password encryption during authentication.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers() {
        return this._localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers;
    }
    /**
     * Gets the localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation property value. App installations requiring elevated privileges will prompt for admin credentials.Default is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDetectApplicationInstallationsAndPromptForElevation() {
        return this._localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation;
    }
    /**
     * Gets the localSecurityOptionsDisableAdministratorAccount property value. Determines whether the Local Administrator account is enabled or disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableAdministratorAccount() {
        return this._localSecurityOptionsDisableAdministratorAccount;
    }
    /**
     * Gets the localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees property value. This security setting determines whether the SMB client attempts to negotiate SMB packet signing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees() {
        return this._localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees;
    }
    /**
     * Gets the localSecurityOptionsDisableGuestAccount property value. Determines if the Guest account is enabled or disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableGuestAccount() {
        return this._localSecurityOptionsDisableGuestAccount;
    }
    /**
     * Gets the localSecurityOptionsDisableServerDigitallySignCommunicationsAlways property value. This security setting determines whether packet signing is required by the SMB server component.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableServerDigitallySignCommunicationsAlways() {
        return this._localSecurityOptionsDisableServerDigitallySignCommunicationsAlways;
    }
    /**
     * Gets the localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees property value. This security setting determines whether the SMB server will negotiate SMB packet signing with clients that request it.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees() {
        return this._localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees;
    }
    /**
     * Gets the localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts property value. This security setting determines what additional permissions will be granted for anonymous connections to the computer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts() {
        return this._localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts;
    }
    /**
     * Gets the localSecurityOptionsDoNotRequireCtrlAltDel property value. Require CTRL+ALT+DEL to be pressed before a user can log on.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDoNotRequireCtrlAltDel() {
        return this._localSecurityOptionsDoNotRequireCtrlAltDel;
    }
    /**
     * Gets the localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange property value. This security setting determines if, at the next password change, the LAN Manager (LM) hash value for the new password is stored. It’s not stored by default.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange() {
        return this._localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange;
    }
    /**
     * Gets the localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser property value. Possible values for LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser
     * @return a localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType getLocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser() {
        return this._localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser;
    }
    /**
     * Gets the localSecurityOptionsGuestAccountName property value. Define a different account name to be associated with the security identifier (SID) for the account 'Guest'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalSecurityOptionsGuestAccountName() {
        return this._localSecurityOptionsGuestAccountName;
    }
    /**
     * Gets the localSecurityOptionsHideLastSignedInUser property value. Do not display the username of the last person who signed in on this device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsHideLastSignedInUser() {
        return this._localSecurityOptionsHideLastSignedInUser;
    }
    /**
     * Gets the localSecurityOptionsHideUsernameAtSignIn property value. Do not display the username of the person signing in to this device after credentials are entered and before the device’s desktop is shown.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsHideUsernameAtSignIn() {
        return this._localSecurityOptionsHideUsernameAtSignIn;
    }
    /**
     * Gets the localSecurityOptionsInformationDisplayedOnLockScreen property value. Possible values for LocalSecurityOptionsInformationDisplayedOnLockScreen
     * @return a localSecurityOptionsInformationDisplayedOnLockScreenType
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsInformationDisplayedOnLockScreenType getLocalSecurityOptionsInformationDisplayedOnLockScreen() {
        return this._localSecurityOptionsInformationDisplayedOnLockScreen;
    }
    /**
     * Gets the localSecurityOptionsInformationShownOnLockScreen property value. Possible values for LocalSecurityOptionsInformationShownOnLockScreenType
     * @return a localSecurityOptionsInformationShownOnLockScreenType
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsInformationShownOnLockScreenType getLocalSecurityOptionsInformationShownOnLockScreen() {
        return this._localSecurityOptionsInformationShownOnLockScreen;
    }
    /**
     * Gets the localSecurityOptionsLogOnMessageText property value. Set message text for users attempting to log in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalSecurityOptionsLogOnMessageText() {
        return this._localSecurityOptionsLogOnMessageText;
    }
    /**
     * Gets the localSecurityOptionsLogOnMessageTitle property value. Set message title for users attempting to log in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocalSecurityOptionsLogOnMessageTitle() {
        return this._localSecurityOptionsLogOnMessageTitle;
    }
    /**
     * Gets the localSecurityOptionsMachineInactivityLimit property value. Define maximum minutes of inactivity on the interactive desktop’s login screen until the screen saver runs. Valid values 0 to 9999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLocalSecurityOptionsMachineInactivityLimit() {
        return this._localSecurityOptionsMachineInactivityLimit;
    }
    /**
     * Gets the localSecurityOptionsMachineInactivityLimitInMinutes property value. Define maximum minutes of inactivity on the interactive desktop’s login screen until the screen saver runs. Valid values 0 to 9999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLocalSecurityOptionsMachineInactivityLimitInMinutes() {
        return this._localSecurityOptionsMachineInactivityLimitInMinutes;
    }
    /**
     * Gets the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients property value. Possible values for LocalSecurityOptionsMinimumSessionSecurity
     * @return a localSecurityOptionsMinimumSessionSecurity
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsMinimumSessionSecurity getLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients() {
        return this._localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients;
    }
    /**
     * Gets the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers property value. Possible values for LocalSecurityOptionsMinimumSessionSecurity
     * @return a localSecurityOptionsMinimumSessionSecurity
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsMinimumSessionSecurity getLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers() {
        return this._localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers;
    }
    /**
     * Gets the localSecurityOptionsOnlyElevateSignedExecutables property value. Enforce PKI certification path validation for a given executable file before it is permitted to run.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsOnlyElevateSignedExecutables() {
        return this._localSecurityOptionsOnlyElevateSignedExecutables;
    }
    /**
     * Gets the localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares property value. By default, this security setting restricts anonymous access to shares and pipes to the settings for named pipes that can be accessed anonymously and Shares that can be accessed anonymously
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares() {
        return this._localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares;
    }
    /**
     * Gets the localSecurityOptionsSmartCardRemovalBehavior property value. Possible values for LocalSecurityOptionsSmartCardRemovalBehaviorType
     * @return a localSecurityOptionsSmartCardRemovalBehaviorType
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsSmartCardRemovalBehaviorType getLocalSecurityOptionsSmartCardRemovalBehavior() {
        return this._localSecurityOptionsSmartCardRemovalBehavior;
    }
    /**
     * Gets the localSecurityOptionsStandardUserElevationPromptBehavior property value. Possible values for LocalSecurityOptionsStandardUserElevationPromptBehavior
     * @return a localSecurityOptionsStandardUserElevationPromptBehaviorType
     */
    @javax.annotation.Nullable
    public LocalSecurityOptionsStandardUserElevationPromptBehaviorType getLocalSecurityOptionsStandardUserElevationPromptBehavior() {
        return this._localSecurityOptionsStandardUserElevationPromptBehavior;
    }
    /**
     * Gets the localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation property value. Enable all elevation requests to go to the interactive user's desktop rather than the secure desktop. Prompt behavior policy settings for admins and standard users are used.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation() {
        return this._localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation;
    }
    /**
     * Gets the localSecurityOptionsUseAdminApprovalMode property value. Defines whether the built-in admin account uses Admin Approval Mode or runs all apps with full admin privileges.Default is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsUseAdminApprovalMode() {
        return this._localSecurityOptionsUseAdminApprovalMode;
    }
    /**
     * Gets the localSecurityOptionsUseAdminApprovalModeForAdministrators property value. Define whether Admin Approval Mode and all UAC policy settings are enabled, default is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsUseAdminApprovalModeForAdministrators() {
        return this._localSecurityOptionsUseAdminApprovalModeForAdministrators;
    }
    /**
     * Gets the localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations property value. Virtualize file and registry write failures to per user locations
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations() {
        return this._localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations;
    }
    /**
     * Gets the smartScreenBlockOverrideForFiles property value. Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenBlockOverrideForFiles() {
        return this._smartScreenBlockOverrideForFiles;
    }
    /**
     * Gets the smartScreenEnableInShell property value. Allows IT Admins to configure SmartScreen for Windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenEnableInShell() {
        return this._smartScreenEnableInShell;
    }
    /**
     * Gets the userRightsAccessCredentialManagerAsTrustedCaller property value. This user right is used by Credential Manager during Backup/Restore. Users' saved credentials might be compromised if this privilege is given to other entities. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsAccessCredentialManagerAsTrustedCaller() {
        return this._userRightsAccessCredentialManagerAsTrustedCaller;
    }
    /**
     * Gets the userRightsActAsPartOfTheOperatingSystem property value. This user right allows a process to impersonate any user without authentication. The process can therefore gain access to the same local resources as that user. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsActAsPartOfTheOperatingSystem() {
        return this._userRightsActAsPartOfTheOperatingSystem;
    }
    /**
     * Gets the userRightsAllowAccessFromNetwork property value. This user right determines which users and groups are allowed to connect to the computer over the network. State Allowed is supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsAllowAccessFromNetwork() {
        return this._userRightsAllowAccessFromNetwork;
    }
    /**
     * Gets the userRightsBackupData property value. This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when backing up files and directories. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsBackupData() {
        return this._userRightsBackupData;
    }
    /**
     * Gets the userRightsBlockAccessFromNetwork property value. This user right determines which users and groups are block from connecting to the computer over the network. State Block is supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsBlockAccessFromNetwork() {
        return this._userRightsBlockAccessFromNetwork;
    }
    /**
     * Gets the userRightsChangeSystemTime property value. This user right determines which users and groups can change the time and date on the internal clock of the computer. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsChangeSystemTime() {
        return this._userRightsChangeSystemTime;
    }
    /**
     * Gets the userRightsCreateGlobalObjects property value. This security setting determines whether users can create global objects that are available to all sessions. Users who can create global objects could affect processes that run under other users' sessions, which could lead to application failure or data corruption. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreateGlobalObjects() {
        return this._userRightsCreateGlobalObjects;
    }
    /**
     * Gets the userRightsCreatePageFile property value. This user right determines which users and groups can call an internal API to create and change the size of a page file. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreatePageFile() {
        return this._userRightsCreatePageFile;
    }
    /**
     * Gets the userRightsCreatePermanentSharedObjects property value. This user right determines which accounts can be used by processes to create a directory object using the object manager. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreatePermanentSharedObjects() {
        return this._userRightsCreatePermanentSharedObjects;
    }
    /**
     * Gets the userRightsCreateSymbolicLinks property value. This user right determines if the user can create a symbolic link from the computer to which they are logged on. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreateSymbolicLinks() {
        return this._userRightsCreateSymbolicLinks;
    }
    /**
     * Gets the userRightsCreateToken property value. This user right determines which users/groups can be used by processes to create a token that can then be used to get access to any local resources when the process uses an internal API to create an access token. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsCreateToken() {
        return this._userRightsCreateToken;
    }
    /**
     * Gets the userRightsDebugPrograms property value. This user right determines which users can attach a debugger to any process or to the kernel. Only states NotConfigured and Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsDebugPrograms() {
        return this._userRightsDebugPrograms;
    }
    /**
     * Gets the userRightsDelegation property value. This user right determines which users can set the Trusted for Delegation setting on a user or computer object. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsDelegation() {
        return this._userRightsDelegation;
    }
    /**
     * Gets the userRightsDenyLocalLogOn property value. This user right determines which users cannot log on to the computer. States NotConfigured, Blocked are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsDenyLocalLogOn() {
        return this._userRightsDenyLocalLogOn;
    }
    /**
     * Gets the userRightsGenerateSecurityAudits property value. This user right determines which accounts can be used by a process to add entries to the security log. The security log is used to trace unauthorized system access.  Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsGenerateSecurityAudits() {
        return this._userRightsGenerateSecurityAudits;
    }
    /**
     * Gets the userRightsImpersonateClient property value. Assigning this user right to a user allows programs running on behalf of that user to impersonate a client. Requiring this user right for this kind of impersonation prevents an unauthorized user from convincing a client to connect to a service that they have created and then impersonating that client, which can elevate the unauthorized user's permissions to administrative or system levels. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsImpersonateClient() {
        return this._userRightsImpersonateClient;
    }
    /**
     * Gets the userRightsIncreaseSchedulingPriority property value. This user right determines which accounts can use a process with Write Property access to another process to increase the execution priority assigned to the other process. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsIncreaseSchedulingPriority() {
        return this._userRightsIncreaseSchedulingPriority;
    }
    /**
     * Gets the userRightsLoadUnloadDrivers property value. This user right determines which users can dynamically load and unload device drivers or other code in to kernel mode. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsLoadUnloadDrivers() {
        return this._userRightsLoadUnloadDrivers;
    }
    /**
     * Gets the userRightsLocalLogOn property value. This user right determines which users can log on to the computer. States NotConfigured, Allowed are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsLocalLogOn() {
        return this._userRightsLocalLogOn;
    }
    /**
     * Gets the userRightsLockMemory property value. This user right determines which accounts can use a process to keep data in physical memory, which prevents the system from paging the data to virtual memory on disk. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsLockMemory() {
        return this._userRightsLockMemory;
    }
    /**
     * Gets the userRightsManageAuditingAndSecurityLogs property value. This user right determines which users can specify object access auditing options for individual resources, such as files, Active Directory objects, and registry keys. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsManageAuditingAndSecurityLogs() {
        return this._userRightsManageAuditingAndSecurityLogs;
    }
    /**
     * Gets the userRightsManageVolumes property value. This user right determines which users and groups can run maintenance tasks on a volume, such as remote defragmentation. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsManageVolumes() {
        return this._userRightsManageVolumes;
    }
    /**
     * Gets the userRightsModifyFirmwareEnvironment property value. This user right determines who can modify firmware environment values. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsModifyFirmwareEnvironment() {
        return this._userRightsModifyFirmwareEnvironment;
    }
    /**
     * Gets the userRightsModifyObjectLabels property value. This user right determines which user accounts can modify the integrity label of objects, such as files, registry keys, or processes owned by other users. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsModifyObjectLabels() {
        return this._userRightsModifyObjectLabels;
    }
    /**
     * Gets the userRightsProfileSingleProcess property value. This user right determines which users can use performance monitoring tools to monitor the performance of system processes. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsProfileSingleProcess() {
        return this._userRightsProfileSingleProcess;
    }
    /**
     * Gets the userRightsRemoteDesktopServicesLogOn property value. This user right determines which users and groups are prohibited from logging on as a Remote Desktop Services client. Only states NotConfigured and Blocked are supported
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsRemoteDesktopServicesLogOn() {
        return this._userRightsRemoteDesktopServicesLogOn;
    }
    /**
     * Gets the userRightsRemoteShutdown property value. This user right determines which users are allowed to shut down a computer from a remote location on the network. Misuse of this user right can result in a denial of service. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsRemoteShutdown() {
        return this._userRightsRemoteShutdown;
    }
    /**
     * Gets the userRightsRestoreData property value. This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when restoring backed up files and directories, and determines which users can set any valid security principal as the owner of an object. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsRestoreData() {
        return this._userRightsRestoreData;
    }
    /**
     * Gets the userRightsTakeOwnership property value. This user right determines which users can take ownership of any securable object in the system, including Active Directory objects, files and folders, printers, registry keys, processes, and threads. Only states NotConfigured and Allowed are supported.
     * @return a deviceManagementUserRightsSetting
     */
    @javax.annotation.Nullable
    public DeviceManagementUserRightsSetting getUserRightsTakeOwnership() {
        return this._userRightsTakeOwnership;
    }
    /**
     * Gets the windowsDefenderTamperProtection property value. Defender TamperProtection setting options
     * @return a windowsDefenderTamperProtectionOptions
     */
    @javax.annotation.Nullable
    public WindowsDefenderTamperProtectionOptions getWindowsDefenderTamperProtection() {
        return this._windowsDefenderTamperProtection;
    }
    /**
     * Gets the xboxServicesAccessoryManagementServiceStartupMode property value. Possible values of xbox service start type
     * @return a serviceStartType
     */
    @javax.annotation.Nullable
    public ServiceStartType getXboxServicesAccessoryManagementServiceStartupMode() {
        return this._xboxServicesAccessoryManagementServiceStartupMode;
    }
    /**
     * Gets the xboxServicesEnableXboxGameSaveTask property value. This setting determines whether xbox game save is enabled (1) or disabled (0).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getXboxServicesEnableXboxGameSaveTask() {
        return this._xboxServicesEnableXboxGameSaveTask;
    }
    /**
     * Gets the xboxServicesLiveAuthManagerServiceStartupMode property value. Possible values of xbox service start type
     * @return a serviceStartType
     */
    @javax.annotation.Nullable
    public ServiceStartType getXboxServicesLiveAuthManagerServiceStartupMode() {
        return this._xboxServicesLiveAuthManagerServiceStartupMode;
    }
    /**
     * Gets the xboxServicesLiveGameSaveServiceStartupMode property value. Possible values of xbox service start type
     * @return a serviceStartType
     */
    @javax.annotation.Nullable
    public ServiceStartType getXboxServicesLiveGameSaveServiceStartupMode() {
        return this._xboxServicesLiveGameSaveServiceStartupMode;
    }
    /**
     * Gets the xboxServicesLiveNetworkingServiceStartupMode property value. Possible values of xbox service start type
     * @return a serviceStartType
     */
    @javax.annotation.Nullable
    public ServiceStartType getXboxServicesLiveNetworkingServiceStartupMode() {
        return this._xboxServicesLiveNetworkingServiceStartupMode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
     * Sets the applicationGuardAllowCameraMicrophoneRedirection property value. Gets or sets whether applications inside Microsoft Defender Application Guard can access the device’s camera and microphone.
     * @param value Value to set for the applicationGuardAllowCameraMicrophoneRedirection property.
     * @return a void
     */
    public void setApplicationGuardAllowCameraMicrophoneRedirection(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardAllowCameraMicrophoneRedirection = value;
    }
    /**
     * Sets the applicationGuardAllowFileSaveOnHost property value. Allow users to download files from Edge in the application guard container and save them on the host file system
     * @param value Value to set for the applicationGuardAllowFileSaveOnHost property.
     * @return a void
     */
    public void setApplicationGuardAllowFileSaveOnHost(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardAllowFileSaveOnHost = value;
    }
    /**
     * Sets the applicationGuardAllowPersistence property value. Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)
     * @param value Value to set for the applicationGuardAllowPersistence property.
     * @return a void
     */
    public void setApplicationGuardAllowPersistence(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardAllowPersistence = value;
    }
    /**
     * Sets the applicationGuardAllowPrintToLocalPrinters property value. Allow printing to Local Printers from Container
     * @param value Value to set for the applicationGuardAllowPrintToLocalPrinters property.
     * @return a void
     */
    public void setApplicationGuardAllowPrintToLocalPrinters(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardAllowPrintToLocalPrinters = value;
    }
    /**
     * Sets the applicationGuardAllowPrintToNetworkPrinters property value. Allow printing to Network Printers from Container
     * @param value Value to set for the applicationGuardAllowPrintToNetworkPrinters property.
     * @return a void
     */
    public void setApplicationGuardAllowPrintToNetworkPrinters(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardAllowPrintToNetworkPrinters = value;
    }
    /**
     * Sets the applicationGuardAllowPrintToPDF property value. Allow printing to PDF from Container
     * @param value Value to set for the applicationGuardAllowPrintToPDF property.
     * @return a void
     */
    public void setApplicationGuardAllowPrintToPDF(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardAllowPrintToPDF = value;
    }
    /**
     * Sets the applicationGuardAllowPrintToXPS property value. Allow printing to XPS from Container
     * @param value Value to set for the applicationGuardAllowPrintToXPS property.
     * @return a void
     */
    public void setApplicationGuardAllowPrintToXPS(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardAllowPrintToXPS = value;
    }
    /**
     * Sets the applicationGuardAllowVirtualGPU property value. Allow application guard to use virtual GPU
     * @param value Value to set for the applicationGuardAllowVirtualGPU property.
     * @return a void
     */
    public void setApplicationGuardAllowVirtualGPU(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardAllowVirtualGPU = value;
    }
    /**
     * Sets the applicationGuardBlockClipboardSharing property value. Possible values for applicationGuardBlockClipboardSharingType
     * @param value Value to set for the applicationGuardBlockClipboardSharing property.
     * @return a void
     */
    public void setApplicationGuardBlockClipboardSharing(@javax.annotation.Nullable final ApplicationGuardBlockClipboardSharingType value) {
        this._applicationGuardBlockClipboardSharing = value;
    }
    /**
     * Sets the applicationGuardBlockFileTransfer property value. Possible values for applicationGuardBlockFileTransfer
     * @param value Value to set for the applicationGuardBlockFileTransfer property.
     * @return a void
     */
    public void setApplicationGuardBlockFileTransfer(@javax.annotation.Nullable final ApplicationGuardBlockFileTransferType value) {
        this._applicationGuardBlockFileTransfer = value;
    }
    /**
     * Sets the applicationGuardBlockNonEnterpriseContent property value. Block enterprise sites to load non-enterprise content, such as third party plug-ins
     * @param value Value to set for the applicationGuardBlockNonEnterpriseContent property.
     * @return a void
     */
    public void setApplicationGuardBlockNonEnterpriseContent(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardBlockNonEnterpriseContent = value;
    }
    /**
     * Sets the applicationGuardCertificateThumbprints property value. Allows certain device level Root Certificates to be shared with the Microsoft Defender Application Guard container.
     * @param value Value to set for the applicationGuardCertificateThumbprints property.
     * @return a void
     */
    public void setApplicationGuardCertificateThumbprints(@javax.annotation.Nullable final java.util.List<String> value) {
        this._applicationGuardCertificateThumbprints = value;
    }
    /**
     * Sets the applicationGuardEnabled property value. Enable Windows Defender Application Guard
     * @param value Value to set for the applicationGuardEnabled property.
     * @return a void
     */
    public void setApplicationGuardEnabled(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardEnabled = value;
    }
    /**
     * Sets the applicationGuardEnabledOptions property value. Possible values for ApplicationGuardEnabledOptions
     * @param value Value to set for the applicationGuardEnabledOptions property.
     * @return a void
     */
    public void setApplicationGuardEnabledOptions(@javax.annotation.Nullable final ApplicationGuardEnabledOptions value) {
        this._applicationGuardEnabledOptions = value;
    }
    /**
     * Sets the applicationGuardForceAuditing property value. Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.)
     * @param value Value to set for the applicationGuardForceAuditing property.
     * @return a void
     */
    public void setApplicationGuardForceAuditing(@javax.annotation.Nullable final Boolean value) {
        this._applicationGuardForceAuditing = value;
    }
    /**
     * Sets the appLockerApplicationControl property value. Possible values of AppLocker Application Control Types
     * @param value Value to set for the appLockerApplicationControl property.
     * @return a void
     */
    public void setAppLockerApplicationControl(@javax.annotation.Nullable final AppLockerApplicationControlType value) {
        this._appLockerApplicationControl = value;
    }
    /**
     * Sets the bitLockerAllowStandardUserEncryption property value. Allows the admin to allow standard users to enable encrpytion during Azure AD Join.
     * @param value Value to set for the bitLockerAllowStandardUserEncryption property.
     * @return a void
     */
    public void setBitLockerAllowStandardUserEncryption(@javax.annotation.Nullable final Boolean value) {
        this._bitLockerAllowStandardUserEncryption = value;
    }
    /**
     * Sets the bitLockerDisableWarningForOtherDiskEncryption property value. Allows the Admin to disable the warning prompt for other disk encryption on the user machines.
     * @param value Value to set for the bitLockerDisableWarningForOtherDiskEncryption property.
     * @return a void
     */
    public void setBitLockerDisableWarningForOtherDiskEncryption(@javax.annotation.Nullable final Boolean value) {
        this._bitLockerDisableWarningForOtherDiskEncryption = value;
    }
    /**
     * Sets the bitLockerEnableStorageCardEncryptionOnMobile property value. Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.
     * @param value Value to set for the bitLockerEnableStorageCardEncryptionOnMobile property.
     * @return a void
     */
    public void setBitLockerEnableStorageCardEncryptionOnMobile(@javax.annotation.Nullable final Boolean value) {
        this._bitLockerEnableStorageCardEncryptionOnMobile = value;
    }
    /**
     * Sets the bitLockerEncryptDevice property value. Allows the admin to require encryption to be turned on using BitLocker.
     * @param value Value to set for the bitLockerEncryptDevice property.
     * @return a void
     */
    public void setBitLockerEncryptDevice(@javax.annotation.Nullable final Boolean value) {
        this._bitLockerEncryptDevice = value;
    }
    /**
     * Sets the bitLockerFixedDrivePolicy property value. BitLocker Fixed Drive Policy.
     * @param value Value to set for the bitLockerFixedDrivePolicy property.
     * @return a void
     */
    public void setBitLockerFixedDrivePolicy(@javax.annotation.Nullable final BitLockerFixedDrivePolicy value) {
        this._bitLockerFixedDrivePolicy = value;
    }
    /**
     * Sets the bitLockerRecoveryPasswordRotation property value. BitLocker recovery password rotation type
     * @param value Value to set for the bitLockerRecoveryPasswordRotation property.
     * @return a void
     */
    public void setBitLockerRecoveryPasswordRotation(@javax.annotation.Nullable final BitLockerRecoveryPasswordRotationType value) {
        this._bitLockerRecoveryPasswordRotation = value;
    }
    /**
     * Sets the bitLockerRemovableDrivePolicy property value. BitLocker Removable Drive Policy.
     * @param value Value to set for the bitLockerRemovableDrivePolicy property.
     * @return a void
     */
    public void setBitLockerRemovableDrivePolicy(@javax.annotation.Nullable final BitLockerRemovableDrivePolicy value) {
        this._bitLockerRemovableDrivePolicy = value;
    }
    /**
     * Sets the bitLockerSystemDrivePolicy property value. BitLocker System Drive Policy.
     * @param value Value to set for the bitLockerSystemDrivePolicy property.
     * @return a void
     */
    public void setBitLockerSystemDrivePolicy(@javax.annotation.Nullable final BitLockerSystemDrivePolicy value) {
        this._bitLockerSystemDrivePolicy = value;
    }
    /**
     * Sets the defenderAdditionalGuardedFolders property value. List of folder paths to be added to the list of protected folders
     * @param value Value to set for the defenderAdditionalGuardedFolders property.
     * @return a void
     */
    public void setDefenderAdditionalGuardedFolders(@javax.annotation.Nullable final java.util.List<String> value) {
        this._defenderAdditionalGuardedFolders = value;
    }
    /**
     * Sets the defenderAdobeReaderLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderAdobeReaderLaunchChildProcess property.
     * @return a void
     */
    public void setDefenderAdobeReaderLaunchChildProcess(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderAdobeReaderLaunchChildProcess = value;
    }
    /**
     * Sets the defenderAdvancedRansomewareProtectionType property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderAdvancedRansomewareProtectionType property.
     * @return a void
     */
    public void setDefenderAdvancedRansomewareProtectionType(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderAdvancedRansomewareProtectionType = value;
    }
    /**
     * Sets the defenderAllowBehaviorMonitoring property value. Allows or disallows Windows Defender Behavior Monitoring functionality.
     * @param value Value to set for the defenderAllowBehaviorMonitoring property.
     * @return a void
     */
    public void setDefenderAllowBehaviorMonitoring(@javax.annotation.Nullable final Boolean value) {
        this._defenderAllowBehaviorMonitoring = value;
    }
    /**
     * Sets the defenderAllowCloudProtection property value. To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.
     * @param value Value to set for the defenderAllowCloudProtection property.
     * @return a void
     */
    public void setDefenderAllowCloudProtection(@javax.annotation.Nullable final Boolean value) {
        this._defenderAllowCloudProtection = value;
    }
    /**
     * Sets the defenderAllowEndUserAccess property value. Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.
     * @param value Value to set for the defenderAllowEndUserAccess property.
     * @return a void
     */
    public void setDefenderAllowEndUserAccess(@javax.annotation.Nullable final Boolean value) {
        this._defenderAllowEndUserAccess = value;
    }
    /**
     * Sets the defenderAllowIntrusionPreventionSystem property value. Allows or disallows Windows Defender Intrusion Prevention functionality.
     * @param value Value to set for the defenderAllowIntrusionPreventionSystem property.
     * @return a void
     */
    public void setDefenderAllowIntrusionPreventionSystem(@javax.annotation.Nullable final Boolean value) {
        this._defenderAllowIntrusionPreventionSystem = value;
    }
    /**
     * Sets the defenderAllowOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @param value Value to set for the defenderAllowOnAccessProtection property.
     * @return a void
     */
    public void setDefenderAllowOnAccessProtection(@javax.annotation.Nullable final Boolean value) {
        this._defenderAllowOnAccessProtection = value;
    }
    /**
     * Sets the defenderAllowRealTimeMonitoring property value. Allows or disallows Windows Defender Realtime Monitoring functionality.
     * @param value Value to set for the defenderAllowRealTimeMonitoring property.
     * @return a void
     */
    public void setDefenderAllowRealTimeMonitoring(@javax.annotation.Nullable final Boolean value) {
        this._defenderAllowRealTimeMonitoring = value;
    }
    /**
     * Sets the defenderAllowScanArchiveFiles property value. Allows or disallows scanning of archives.
     * @param value Value to set for the defenderAllowScanArchiveFiles property.
     * @return a void
     */
    public void setDefenderAllowScanArchiveFiles(@javax.annotation.Nullable final Boolean value) {
        this._defenderAllowScanArchiveFiles = value;
    }
    /**
     * Sets the defenderAllowScanDownloads property value. Allows or disallows Windows Defender IOAVP Protection functionality.
     * @param value Value to set for the defenderAllowScanDownloads property.
     * @return a void
     */
    public void setDefenderAllowScanDownloads(@javax.annotation.Nullable final Boolean value) {
        this._defenderAllowScanDownloads = value;
    }
    /**
     * Sets the defenderAllowScanNetworkFiles property value. Allows or disallows a scanning of network files.
     * @param value Value to set for the defenderAllowScanNetworkFiles property.
     * @return a void
     */
    public void setDefenderAllowScanNetworkFiles(@javax.annotation.Nullable final Boolean value) {
        this._defenderAllowScanNetworkFiles = value;
    }
    /**
     * Sets the defenderAllowScanRemovableDrivesDuringFullScan property value. Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.
     * @param value Value to set for the defenderAllowScanRemovableDrivesDuringFullScan property.
     * @return a void
     */
    public void setDefenderAllowScanRemovableDrivesDuringFullScan(@javax.annotation.Nullable final Boolean value) {
        this._defenderAllowScanRemovableDrivesDuringFullScan = value;
    }
    /**
     * Sets the defenderAllowScanScriptsLoadedInInternetExplorer property value. Allows or disallows Windows Defender Script Scanning functionality.
     * @param value Value to set for the defenderAllowScanScriptsLoadedInInternetExplorer property.
     * @return a void
     */
    public void setDefenderAllowScanScriptsLoadedInInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this._defenderAllowScanScriptsLoadedInInternetExplorer = value;
    }
    /**
     * Sets the defenderAttackSurfaceReductionExcludedPaths property value. List of exe files and folders to be excluded from attack surface reduction rules
     * @param value Value to set for the defenderAttackSurfaceReductionExcludedPaths property.
     * @return a void
     */
    public void setDefenderAttackSurfaceReductionExcludedPaths(@javax.annotation.Nullable final java.util.List<String> value) {
        this._defenderAttackSurfaceReductionExcludedPaths = value;
    }
    /**
     * Sets the defenderBlockEndUserAccess property value. Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.
     * @param value Value to set for the defenderBlockEndUserAccess property.
     * @return a void
     */
    public void setDefenderBlockEndUserAccess(@javax.annotation.Nullable final Boolean value) {
        this._defenderBlockEndUserAccess = value;
    }
    /**
     * Sets the defenderBlockPersistenceThroughWmiType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderBlockPersistenceThroughWmiType property.
     * @return a void
     */
    public void setDefenderBlockPersistenceThroughWmiType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this._defenderBlockPersistenceThroughWmiType = value;
    }
    /**
     * Sets the defenderCheckForSignaturesBeforeRunningScan property value. This policy setting allows you to manage whether a check for new virus and spyware definitions will occur before running a scan.
     * @param value Value to set for the defenderCheckForSignaturesBeforeRunningScan property.
     * @return a void
     */
    public void setDefenderCheckForSignaturesBeforeRunningScan(@javax.annotation.Nullable final Boolean value) {
        this._defenderCheckForSignaturesBeforeRunningScan = value;
    }
    /**
     * Sets the defenderCloudBlockLevel property value. Added in Windows 10, version 1709. This policy setting determines how aggressive Windows Defender Antivirus will be in blocking and scanning suspicious files. Value type is integer. This feature requires the 'Join Microsoft MAPS' setting enabled in order to function. Possible values are: notConfigured, high, highPlus, zeroTolerance.
     * @param value Value to set for the defenderCloudBlockLevel property.
     * @return a void
     */
    public void setDefenderCloudBlockLevel(@javax.annotation.Nullable final DefenderCloudBlockLevelType value) {
        this._defenderCloudBlockLevel = value;
    }
    /**
     * Sets the defenderCloudExtendedTimeoutInSeconds property value. Added in Windows 10, version 1709. This feature allows Windows Defender Antivirus to block a suspicious file for up to 60 seconds, and scan it in the cloud to make sure it's safe. Value type is integer, range is 0 - 50. This feature depends on three other MAPS settings the must all be enabled- 'Configure the 'Block at First Sight' feature; 'Join Microsoft MAPS'; 'Send file samples when further analysis is required'. Valid values 0 to 50
     * @param value Value to set for the defenderCloudExtendedTimeoutInSeconds property.
     * @return a void
     */
    public void setDefenderCloudExtendedTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this._defenderCloudExtendedTimeoutInSeconds = value;
    }
    /**
     * Sets the defenderDaysBeforeDeletingQuarantinedMalware property value. Time period (in days) that quarantine items will be stored on the system. Valid values 0 to 90
     * @param value Value to set for the defenderDaysBeforeDeletingQuarantinedMalware property.
     * @return a void
     */
    public void setDefenderDaysBeforeDeletingQuarantinedMalware(@javax.annotation.Nullable final Integer value) {
        this._defenderDaysBeforeDeletingQuarantinedMalware = value;
    }
    /**
     * Sets the defenderDetectedMalwareActions property value. Allows an administrator to specify any valid threat severity levels and the corresponding default action ID to take.
     * @param value Value to set for the defenderDetectedMalwareActions property.
     * @return a void
     */
    public void setDefenderDetectedMalwareActions(@javax.annotation.Nullable final DefenderDetectedMalwareActions value) {
        this._defenderDetectedMalwareActions = value;
    }
    /**
     * Sets the defenderDisableBehaviorMonitoring property value. Allows or disallows Windows Defender Behavior Monitoring functionality.
     * @param value Value to set for the defenderDisableBehaviorMonitoring property.
     * @return a void
     */
    public void setDefenderDisableBehaviorMonitoring(@javax.annotation.Nullable final Boolean value) {
        this._defenderDisableBehaviorMonitoring = value;
    }
    /**
     * Sets the defenderDisableCatchupFullScan property value. This policy setting allows you to configure catch-up scans for scheduled full scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.
     * @param value Value to set for the defenderDisableCatchupFullScan property.
     * @return a void
     */
    public void setDefenderDisableCatchupFullScan(@javax.annotation.Nullable final Boolean value) {
        this._defenderDisableCatchupFullScan = value;
    }
    /**
     * Sets the defenderDisableCatchupQuickScan property value. This policy setting allows you to configure catch-up scans for scheduled quick scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.
     * @param value Value to set for the defenderDisableCatchupQuickScan property.
     * @return a void
     */
    public void setDefenderDisableCatchupQuickScan(@javax.annotation.Nullable final Boolean value) {
        this._defenderDisableCatchupQuickScan = value;
    }
    /**
     * Sets the defenderDisableCloudProtection property value. To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.
     * @param value Value to set for the defenderDisableCloudProtection property.
     * @return a void
     */
    public void setDefenderDisableCloudProtection(@javax.annotation.Nullable final Boolean value) {
        this._defenderDisableCloudProtection = value;
    }
    /**
     * Sets the defenderDisableIntrusionPreventionSystem property value. Allows or disallows Windows Defender Intrusion Prevention functionality.
     * @param value Value to set for the defenderDisableIntrusionPreventionSystem property.
     * @return a void
     */
    public void setDefenderDisableIntrusionPreventionSystem(@javax.annotation.Nullable final Boolean value) {
        this._defenderDisableIntrusionPreventionSystem = value;
    }
    /**
     * Sets the defenderDisableOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @param value Value to set for the defenderDisableOnAccessProtection property.
     * @return a void
     */
    public void setDefenderDisableOnAccessProtection(@javax.annotation.Nullable final Boolean value) {
        this._defenderDisableOnAccessProtection = value;
    }
    /**
     * Sets the defenderDisableRealTimeMonitoring property value. Allows or disallows Windows Defender Realtime Monitoring functionality.
     * @param value Value to set for the defenderDisableRealTimeMonitoring property.
     * @return a void
     */
    public void setDefenderDisableRealTimeMonitoring(@javax.annotation.Nullable final Boolean value) {
        this._defenderDisableRealTimeMonitoring = value;
    }
    /**
     * Sets the defenderDisableScanArchiveFiles property value. Allows or disallows scanning of archives.
     * @param value Value to set for the defenderDisableScanArchiveFiles property.
     * @return a void
     */
    public void setDefenderDisableScanArchiveFiles(@javax.annotation.Nullable final Boolean value) {
        this._defenderDisableScanArchiveFiles = value;
    }
    /**
     * Sets the defenderDisableScanDownloads property value. Allows or disallows Windows Defender IOAVP Protection functionality.
     * @param value Value to set for the defenderDisableScanDownloads property.
     * @return a void
     */
    public void setDefenderDisableScanDownloads(@javax.annotation.Nullable final Boolean value) {
        this._defenderDisableScanDownloads = value;
    }
    /**
     * Sets the defenderDisableScanNetworkFiles property value. Allows or disallows a scanning of network files.
     * @param value Value to set for the defenderDisableScanNetworkFiles property.
     * @return a void
     */
    public void setDefenderDisableScanNetworkFiles(@javax.annotation.Nullable final Boolean value) {
        this._defenderDisableScanNetworkFiles = value;
    }
    /**
     * Sets the defenderDisableScanRemovableDrivesDuringFullScan property value. Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.
     * @param value Value to set for the defenderDisableScanRemovableDrivesDuringFullScan property.
     * @return a void
     */
    public void setDefenderDisableScanRemovableDrivesDuringFullScan(@javax.annotation.Nullable final Boolean value) {
        this._defenderDisableScanRemovableDrivesDuringFullScan = value;
    }
    /**
     * Sets the defenderDisableScanScriptsLoadedInInternetExplorer property value. Allows or disallows Windows Defender Script Scanning functionality.
     * @param value Value to set for the defenderDisableScanScriptsLoadedInInternetExplorer property.
     * @return a void
     */
    public void setDefenderDisableScanScriptsLoadedInInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this._defenderDisableScanScriptsLoadedInInternetExplorer = value;
    }
    /**
     * Sets the defenderEmailContentExecution property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderEmailContentExecution property.
     * @return a void
     */
    public void setDefenderEmailContentExecution(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderEmailContentExecution = value;
    }
    /**
     * Sets the defenderEmailContentExecutionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderEmailContentExecutionType property.
     * @return a void
     */
    public void setDefenderEmailContentExecutionType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this._defenderEmailContentExecutionType = value;
    }
    /**
     * Sets the defenderEnableLowCpuPriority property value. This policy setting allows you to enable or disable low CPU priority for scheduled scans.
     * @param value Value to set for the defenderEnableLowCpuPriority property.
     * @return a void
     */
    public void setDefenderEnableLowCpuPriority(@javax.annotation.Nullable final Boolean value) {
        this._defenderEnableLowCpuPriority = value;
    }
    /**
     * Sets the defenderEnableScanIncomingMail property value. Allows or disallows scanning of email.
     * @param value Value to set for the defenderEnableScanIncomingMail property.
     * @return a void
     */
    public void setDefenderEnableScanIncomingMail(@javax.annotation.Nullable final Boolean value) {
        this._defenderEnableScanIncomingMail = value;
    }
    /**
     * Sets the defenderEnableScanMappedNetworkDrivesDuringFullScan property value. Allows or disallows a full scan of mapped network drives.
     * @param value Value to set for the defenderEnableScanMappedNetworkDrivesDuringFullScan property.
     * @return a void
     */
    public void setDefenderEnableScanMappedNetworkDrivesDuringFullScan(@javax.annotation.Nullable final Boolean value) {
        this._defenderEnableScanMappedNetworkDrivesDuringFullScan = value;
    }
    /**
     * Sets the defenderExploitProtectionXml property value. Xml content containing information regarding exploit protection details.
     * @param value Value to set for the defenderExploitProtectionXml property.
     * @return a void
     */
    public void setDefenderExploitProtectionXml(@javax.annotation.Nullable final byte[] value) {
        this._defenderExploitProtectionXml = value;
    }
    /**
     * Sets the defenderExploitProtectionXmlFileName property value. Name of the file from which DefenderExploitProtectionXml was obtained.
     * @param value Value to set for the defenderExploitProtectionXmlFileName property.
     * @return a void
     */
    public void setDefenderExploitProtectionXmlFileName(@javax.annotation.Nullable final String value) {
        this._defenderExploitProtectionXmlFileName = value;
    }
    /**
     * Sets the defenderFileExtensionsToExclude property value. File extensions to exclude from scans and real time protection.
     * @param value Value to set for the defenderFileExtensionsToExclude property.
     * @return a void
     */
    public void setDefenderFileExtensionsToExclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this._defenderFileExtensionsToExclude = value;
    }
    /**
     * Sets the defenderFilesAndFoldersToExclude property value. Files and folder to exclude from scans and real time protection.
     * @param value Value to set for the defenderFilesAndFoldersToExclude property.
     * @return a void
     */
    public void setDefenderFilesAndFoldersToExclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this._defenderFilesAndFoldersToExclude = value;
    }
    /**
     * Sets the defenderGuardedFoldersAllowedAppPaths property value. List of paths to exe that are allowed to access protected folders
     * @param value Value to set for the defenderGuardedFoldersAllowedAppPaths property.
     * @return a void
     */
    public void setDefenderGuardedFoldersAllowedAppPaths(@javax.annotation.Nullable final java.util.List<String> value) {
        this._defenderGuardedFoldersAllowedAppPaths = value;
    }
    /**
     * Sets the defenderGuardMyFoldersType property value. Possible values of Folder Protection
     * @param value Value to set for the defenderGuardMyFoldersType property.
     * @return a void
     */
    public void setDefenderGuardMyFoldersType(@javax.annotation.Nullable final FolderProtectionType value) {
        this._defenderGuardMyFoldersType = value;
    }
    /**
     * Sets the defenderNetworkProtectionType property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderNetworkProtectionType property.
     * @return a void
     */
    public void setDefenderNetworkProtectionType(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderNetworkProtectionType = value;
    }
    /**
     * Sets the defenderOfficeAppsExecutableContentCreationOrLaunch property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeAppsExecutableContentCreationOrLaunch property.
     * @return a void
     */
    public void setDefenderOfficeAppsExecutableContentCreationOrLaunch(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderOfficeAppsExecutableContentCreationOrLaunch = value;
    }
    /**
     * Sets the defenderOfficeAppsExecutableContentCreationOrLaunchType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderOfficeAppsExecutableContentCreationOrLaunchType property.
     * @return a void
     */
    public void setDefenderOfficeAppsExecutableContentCreationOrLaunchType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this._defenderOfficeAppsExecutableContentCreationOrLaunchType = value;
    }
    /**
     * Sets the defenderOfficeAppsLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeAppsLaunchChildProcess property.
     * @return a void
     */
    public void setDefenderOfficeAppsLaunchChildProcess(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderOfficeAppsLaunchChildProcess = value;
    }
    /**
     * Sets the defenderOfficeAppsLaunchChildProcessType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderOfficeAppsLaunchChildProcessType property.
     * @return a void
     */
    public void setDefenderOfficeAppsLaunchChildProcessType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this._defenderOfficeAppsLaunchChildProcessType = value;
    }
    /**
     * Sets the defenderOfficeAppsOtherProcessInjection property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeAppsOtherProcessInjection property.
     * @return a void
     */
    public void setDefenderOfficeAppsOtherProcessInjection(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderOfficeAppsOtherProcessInjection = value;
    }
    /**
     * Sets the defenderOfficeAppsOtherProcessInjectionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderOfficeAppsOtherProcessInjectionType property.
     * @return a void
     */
    public void setDefenderOfficeAppsOtherProcessInjectionType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this._defenderOfficeAppsOtherProcessInjectionType = value;
    }
    /**
     * Sets the defenderOfficeCommunicationAppsLaunchChildProcess property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeCommunicationAppsLaunchChildProcess property.
     * @return a void
     */
    public void setDefenderOfficeCommunicationAppsLaunchChildProcess(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderOfficeCommunicationAppsLaunchChildProcess = value;
    }
    /**
     * Sets the defenderOfficeMacroCodeAllowWin32Imports property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderOfficeMacroCodeAllowWin32Imports property.
     * @return a void
     */
    public void setDefenderOfficeMacroCodeAllowWin32Imports(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderOfficeMacroCodeAllowWin32Imports = value;
    }
    /**
     * Sets the defenderOfficeMacroCodeAllowWin32ImportsType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderOfficeMacroCodeAllowWin32ImportsType property.
     * @return a void
     */
    public void setDefenderOfficeMacroCodeAllowWin32ImportsType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this._defenderOfficeMacroCodeAllowWin32ImportsType = value;
    }
    /**
     * Sets the defenderPotentiallyUnwantedAppAction property value. Added in Windows 10, version 1607. Specifies the level of detection for potentially unwanted applications (PUAs). Windows Defender alerts you when potentially unwanted software is being downloaded or attempts to install itself on your computer. Possible values are: userDefined, enable, auditMode, warn, notConfigured.
     * @param value Value to set for the defenderPotentiallyUnwantedAppAction property.
     * @return a void
     */
    public void setDefenderPotentiallyUnwantedAppAction(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderPotentiallyUnwantedAppAction = value;
    }
    /**
     * Sets the defenderPreventCredentialStealingType property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderPreventCredentialStealingType property.
     * @return a void
     */
    public void setDefenderPreventCredentialStealingType(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderPreventCredentialStealingType = value;
    }
    /**
     * Sets the defenderProcessCreation property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderProcessCreation property.
     * @return a void
     */
    public void setDefenderProcessCreation(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderProcessCreation = value;
    }
    /**
     * Sets the defenderProcessCreationType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderProcessCreationType property.
     * @return a void
     */
    public void setDefenderProcessCreationType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this._defenderProcessCreationType = value;
    }
    /**
     * Sets the defenderProcessesToExclude property value. Processes to exclude from scans and real time protection.
     * @param value Value to set for the defenderProcessesToExclude property.
     * @return a void
     */
    public void setDefenderProcessesToExclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this._defenderProcessesToExclude = value;
    }
    /**
     * Sets the defenderScanDirection property value. Controls which sets of files should be monitored. Possible values are: monitorAllFiles, monitorIncomingFilesOnly, monitorOutgoingFilesOnly.
     * @param value Value to set for the defenderScanDirection property.
     * @return a void
     */
    public void setDefenderScanDirection(@javax.annotation.Nullable final DefenderRealtimeScanDirection value) {
        this._defenderScanDirection = value;
    }
    /**
     * Sets the defenderScanMaxCpuPercentage property value. Represents the average CPU load factor for the Windows Defender scan (in percent). The default value is 50. Valid values 0 to 100
     * @param value Value to set for the defenderScanMaxCpuPercentage property.
     * @return a void
     */
    public void setDefenderScanMaxCpuPercentage(@javax.annotation.Nullable final Integer value) {
        this._defenderScanMaxCpuPercentage = value;
    }
    /**
     * Sets the defenderScanType property value. Selects whether to perform a quick scan or full scan. Possible values are: userDefined, disabled, quick, full.
     * @param value Value to set for the defenderScanType property.
     * @return a void
     */
    public void setDefenderScanType(@javax.annotation.Nullable final DefenderScanType value) {
        this._defenderScanType = value;
    }
    /**
     * Sets the defenderScheduledQuickScanTime property value. Selects the time of day that the Windows Defender quick scan should run. For example, a value of 0=12:00AM, a value of 60=1:00AM, a value of 120=2:00, and so on, up to a value of 1380=11:00PM. The default value is 120
     * @param value Value to set for the defenderScheduledQuickScanTime property.
     * @return a void
     */
    public void setDefenderScheduledQuickScanTime(@javax.annotation.Nullable final LocalTime value) {
        this._defenderScheduledQuickScanTime = value;
    }
    /**
     * Sets the defenderScheduledScanDay property value. Selects the day that the Windows Defender scan should run. Possible values are: userDefined, everyday, sunday, monday, tuesday, wednesday, thursday, friday, saturday, noScheduledScan.
     * @param value Value to set for the defenderScheduledScanDay property.
     * @return a void
     */
    public void setDefenderScheduledScanDay(@javax.annotation.Nullable final WeeklySchedule value) {
        this._defenderScheduledScanDay = value;
    }
    /**
     * Sets the defenderScheduledScanTime property value. Selects the time of day that the Windows Defender scan should run.
     * @param value Value to set for the defenderScheduledScanTime property.
     * @return a void
     */
    public void setDefenderScheduledScanTime(@javax.annotation.Nullable final LocalTime value) {
        this._defenderScheduledScanTime = value;
    }
    /**
     * Sets the defenderScriptDownloadedPayloadExecution property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderScriptDownloadedPayloadExecution property.
     * @return a void
     */
    public void setDefenderScriptDownloadedPayloadExecution(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderScriptDownloadedPayloadExecution = value;
    }
    /**
     * Sets the defenderScriptDownloadedPayloadExecutionType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderScriptDownloadedPayloadExecutionType property.
     * @return a void
     */
    public void setDefenderScriptDownloadedPayloadExecutionType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this._defenderScriptDownloadedPayloadExecutionType = value;
    }
    /**
     * Sets the defenderScriptObfuscatedMacroCode property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderScriptObfuscatedMacroCode property.
     * @return a void
     */
    public void setDefenderScriptObfuscatedMacroCode(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderScriptObfuscatedMacroCode = value;
    }
    /**
     * Sets the defenderScriptObfuscatedMacroCodeType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderScriptObfuscatedMacroCodeType property.
     * @return a void
     */
    public void setDefenderScriptObfuscatedMacroCodeType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this._defenderScriptObfuscatedMacroCodeType = value;
    }
    /**
     * Sets the defenderSecurityCenterBlockExploitProtectionOverride property value. Indicates whether or not to block user from overriding Exploit Protection settings.
     * @param value Value to set for the defenderSecurityCenterBlockExploitProtectionOverride property.
     * @return a void
     */
    public void setDefenderSecurityCenterBlockExploitProtectionOverride(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterBlockExploitProtectionOverride = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableAccountUI property value. Used to disable the display of the account protection area.
     * @param value Value to set for the defenderSecurityCenterDisableAccountUI property.
     * @return a void
     */
    public void setDefenderSecurityCenterDisableAccountUI(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterDisableAccountUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableAppBrowserUI property value. Used to disable the display of the app and browser protection area.
     * @param value Value to set for the defenderSecurityCenterDisableAppBrowserUI property.
     * @return a void
     */
    public void setDefenderSecurityCenterDisableAppBrowserUI(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterDisableAppBrowserUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableClearTpmUI property value. Used to disable the display of the Clear TPM button.
     * @param value Value to set for the defenderSecurityCenterDisableClearTpmUI property.
     * @return a void
     */
    public void setDefenderSecurityCenterDisableClearTpmUI(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterDisableClearTpmUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableFamilyUI property value. Used to disable the display of the family options area.
     * @param value Value to set for the defenderSecurityCenterDisableFamilyUI property.
     * @return a void
     */
    public void setDefenderSecurityCenterDisableFamilyUI(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterDisableFamilyUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableHardwareUI property value. Used to disable the display of the hardware protection area.
     * @param value Value to set for the defenderSecurityCenterDisableHardwareUI property.
     * @return a void
     */
    public void setDefenderSecurityCenterDisableHardwareUI(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterDisableHardwareUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableHealthUI property value. Used to disable the display of the device performance and health area.
     * @param value Value to set for the defenderSecurityCenterDisableHealthUI property.
     * @return a void
     */
    public void setDefenderSecurityCenterDisableHealthUI(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterDisableHealthUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableNetworkUI property value. Used to disable the display of the firewall and network protection area.
     * @param value Value to set for the defenderSecurityCenterDisableNetworkUI property.
     * @return a void
     */
    public void setDefenderSecurityCenterDisableNetworkUI(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterDisableNetworkUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableNotificationAreaUI property value. Used to disable the display of the notification area control. The user needs to either sign out and sign in or reboot the computer for this setting to take effect.
     * @param value Value to set for the defenderSecurityCenterDisableNotificationAreaUI property.
     * @return a void
     */
    public void setDefenderSecurityCenterDisableNotificationAreaUI(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterDisableNotificationAreaUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableRansomwareUI property value. Used to disable the display of the ransomware protection area.
     * @param value Value to set for the defenderSecurityCenterDisableRansomwareUI property.
     * @return a void
     */
    public void setDefenderSecurityCenterDisableRansomwareUI(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterDisableRansomwareUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableSecureBootUI property value. Used to disable the display of the secure boot area under Device security.
     * @param value Value to set for the defenderSecurityCenterDisableSecureBootUI property.
     * @return a void
     */
    public void setDefenderSecurityCenterDisableSecureBootUI(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterDisableSecureBootUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableTroubleshootingUI property value. Used to disable the display of the security process troubleshooting under Device security.
     * @param value Value to set for the defenderSecurityCenterDisableTroubleshootingUI property.
     * @return a void
     */
    public void setDefenderSecurityCenterDisableTroubleshootingUI(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterDisableTroubleshootingUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableVirusUI property value. Used to disable the display of the virus and threat protection area.
     * @param value Value to set for the defenderSecurityCenterDisableVirusUI property.
     * @return a void
     */
    public void setDefenderSecurityCenterDisableVirusUI(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterDisableVirusUI = value;
    }
    /**
     * Sets the defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI property value. Used to disable the display of update TPM Firmware when a vulnerable firmware is detected.
     * @param value Value to set for the defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI property.
     * @return a void
     */
    public void setDefenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI(@javax.annotation.Nullable final Boolean value) {
        this._defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI = value;
    }
    /**
     * Sets the defenderSecurityCenterHelpEmail property value. The email address that is displayed to users.
     * @param value Value to set for the defenderSecurityCenterHelpEmail property.
     * @return a void
     */
    public void setDefenderSecurityCenterHelpEmail(@javax.annotation.Nullable final String value) {
        this._defenderSecurityCenterHelpEmail = value;
    }
    /**
     * Sets the defenderSecurityCenterHelpPhone property value. The phone number or Skype ID that is displayed to users.
     * @param value Value to set for the defenderSecurityCenterHelpPhone property.
     * @return a void
     */
    public void setDefenderSecurityCenterHelpPhone(@javax.annotation.Nullable final String value) {
        this._defenderSecurityCenterHelpPhone = value;
    }
    /**
     * Sets the defenderSecurityCenterHelpURL property value. The help portal URL this is displayed to users.
     * @param value Value to set for the defenderSecurityCenterHelpURL property.
     * @return a void
     */
    public void setDefenderSecurityCenterHelpURL(@javax.annotation.Nullable final String value) {
        this._defenderSecurityCenterHelpURL = value;
    }
    /**
     * Sets the defenderSecurityCenterITContactDisplay property value. Possible values for defenderSecurityCenterITContactDisplay
     * @param value Value to set for the defenderSecurityCenterITContactDisplay property.
     * @return a void
     */
    public void setDefenderSecurityCenterITContactDisplay(@javax.annotation.Nullable final DefenderSecurityCenterITContactDisplayType value) {
        this._defenderSecurityCenterITContactDisplay = value;
    }
    /**
     * Sets the defenderSecurityCenterNotificationsFromApp property value. Possible values for defenderSecurityCenterNotificationsFromApp
     * @param value Value to set for the defenderSecurityCenterNotificationsFromApp property.
     * @return a void
     */
    public void setDefenderSecurityCenterNotificationsFromApp(@javax.annotation.Nullable final DefenderSecurityCenterNotificationsFromAppType value) {
        this._defenderSecurityCenterNotificationsFromApp = value;
    }
    /**
     * Sets the defenderSecurityCenterOrganizationDisplayName property value. The company name that is displayed to the users.
     * @param value Value to set for the defenderSecurityCenterOrganizationDisplayName property.
     * @return a void
     */
    public void setDefenderSecurityCenterOrganizationDisplayName(@javax.annotation.Nullable final String value) {
        this._defenderSecurityCenterOrganizationDisplayName = value;
    }
    /**
     * Sets the defenderSignatureUpdateIntervalInHours property value. Specifies the interval (in hours) that will be used to check for signatures, so instead of using the ScheduleDay and ScheduleTime the check for new signatures will be set according to the interval. Valid values 0 to 24
     * @param value Value to set for the defenderSignatureUpdateIntervalInHours property.
     * @return a void
     */
    public void setDefenderSignatureUpdateIntervalInHours(@javax.annotation.Nullable final Integer value) {
        this._defenderSignatureUpdateIntervalInHours = value;
    }
    /**
     * Sets the defenderSubmitSamplesConsentType property value. Checks for the user consent level in Windows Defender to send data. Possible values are: sendSafeSamplesAutomatically, alwaysPrompt, neverSend, sendAllSamplesAutomatically.
     * @param value Value to set for the defenderSubmitSamplesConsentType property.
     * @return a void
     */
    public void setDefenderSubmitSamplesConsentType(@javax.annotation.Nullable final DefenderSubmitSamplesConsentType value) {
        this._defenderSubmitSamplesConsentType = value;
    }
    /**
     * Sets the defenderUntrustedExecutable property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderUntrustedExecutable property.
     * @return a void
     */
    public void setDefenderUntrustedExecutable(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderUntrustedExecutable = value;
    }
    /**
     * Sets the defenderUntrustedExecutableType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderUntrustedExecutableType property.
     * @return a void
     */
    public void setDefenderUntrustedExecutableType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this._defenderUntrustedExecutableType = value;
    }
    /**
     * Sets the defenderUntrustedUSBProcess property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderUntrustedUSBProcess property.
     * @return a void
     */
    public void setDefenderUntrustedUSBProcess(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderUntrustedUSBProcess = value;
    }
    /**
     * Sets the defenderUntrustedUSBProcessType property value. Possible values of Defender Attack Surface Reduction Rules
     * @param value Value to set for the defenderUntrustedUSBProcessType property.
     * @return a void
     */
    public void setDefenderUntrustedUSBProcessType(@javax.annotation.Nullable final DefenderAttackSurfaceType value) {
        this._defenderUntrustedUSBProcessType = value;
    }
    /**
     * Sets the deviceGuardEnableSecureBootWithDMA property value. This property will be deprecated in May 2019 and will be replaced with property DeviceGuardSecureBootWithDMA. Specifies whether Platform Security Level is enabled at next reboot.
     * @param value Value to set for the deviceGuardEnableSecureBootWithDMA property.
     * @return a void
     */
    public void setDeviceGuardEnableSecureBootWithDMA(@javax.annotation.Nullable final Boolean value) {
        this._deviceGuardEnableSecureBootWithDMA = value;
    }
    /**
     * Sets the deviceGuardEnableVirtualizationBasedSecurity property value. Turns On Virtualization Based Security(VBS).
     * @param value Value to set for the deviceGuardEnableVirtualizationBasedSecurity property.
     * @return a void
     */
    public void setDeviceGuardEnableVirtualizationBasedSecurity(@javax.annotation.Nullable final Boolean value) {
        this._deviceGuardEnableVirtualizationBasedSecurity = value;
    }
    /**
     * Sets the deviceGuardLaunchSystemGuard property value. Possible values of a property
     * @param value Value to set for the deviceGuardLaunchSystemGuard property.
     * @return a void
     */
    public void setDeviceGuardLaunchSystemGuard(@javax.annotation.Nullable final Enablement value) {
        this._deviceGuardLaunchSystemGuard = value;
    }
    /**
     * Sets the deviceGuardLocalSystemAuthorityCredentialGuardSettings property value. Possible values of Credential Guard settings.
     * @param value Value to set for the deviceGuardLocalSystemAuthorityCredentialGuardSettings property.
     * @return a void
     */
    public void setDeviceGuardLocalSystemAuthorityCredentialGuardSettings(@javax.annotation.Nullable final DeviceGuardLocalSystemAuthorityCredentialGuardType value) {
        this._deviceGuardLocalSystemAuthorityCredentialGuardSettings = value;
    }
    /**
     * Sets the deviceGuardSecureBootWithDMA property value. Possible values of Secure Boot with DMA
     * @param value Value to set for the deviceGuardSecureBootWithDMA property.
     * @return a void
     */
    public void setDeviceGuardSecureBootWithDMA(@javax.annotation.Nullable final SecureBootWithDMAType value) {
        this._deviceGuardSecureBootWithDMA = value;
    }
    /**
     * Sets the dmaGuardDeviceEnumerationPolicy property value. Possible values of the DmaGuardDeviceEnumerationPolicy.
     * @param value Value to set for the dmaGuardDeviceEnumerationPolicy property.
     * @return a void
     */
    public void setDmaGuardDeviceEnumerationPolicy(@javax.annotation.Nullable final DmaGuardDeviceEnumerationPolicyType value) {
        this._dmaGuardDeviceEnumerationPolicy = value;
    }
    /**
     * Sets the firewallBlockStatefulFTP property value. Blocks stateful FTP connections to the device
     * @param value Value to set for the firewallBlockStatefulFTP property.
     * @return a void
     */
    public void setFirewallBlockStatefulFTP(@javax.annotation.Nullable final Boolean value) {
        this._firewallBlockStatefulFTP = value;
    }
    /**
     * Sets the firewallCertificateRevocationListCheckMethod property value. Possible values for firewallCertificateRevocationListCheckMethod
     * @param value Value to set for the firewallCertificateRevocationListCheckMethod property.
     * @return a void
     */
    public void setFirewallCertificateRevocationListCheckMethod(@javax.annotation.Nullable final FirewallCertificateRevocationListCheckMethodType value) {
        this._firewallCertificateRevocationListCheckMethod = value;
    }
    /**
     * Sets the firewallIdleTimeoutForSecurityAssociationInSeconds property value. Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600
     * @param value Value to set for the firewallIdleTimeoutForSecurityAssociationInSeconds property.
     * @return a void
     */
    public void setFirewallIdleTimeoutForSecurityAssociationInSeconds(@javax.annotation.Nullable final Integer value) {
        this._firewallIdleTimeoutForSecurityAssociationInSeconds = value;
    }
    /**
     * Sets the firewallIPSecExemptionsAllowDHCP property value. Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic
     * @param value Value to set for the firewallIPSecExemptionsAllowDHCP property.
     * @return a void
     */
    public void setFirewallIPSecExemptionsAllowDHCP(@javax.annotation.Nullable final Boolean value) {
        this._firewallIPSecExemptionsAllowDHCP = value;
    }
    /**
     * Sets the firewallIPSecExemptionsAllowICMP property value. Configures IPSec exemptions to allow ICMP
     * @param value Value to set for the firewallIPSecExemptionsAllowICMP property.
     * @return a void
     */
    public void setFirewallIPSecExemptionsAllowICMP(@javax.annotation.Nullable final Boolean value) {
        this._firewallIPSecExemptionsAllowICMP = value;
    }
    /**
     * Sets the firewallIPSecExemptionsAllowNeighborDiscovery property value. Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes
     * @param value Value to set for the firewallIPSecExemptionsAllowNeighborDiscovery property.
     * @return a void
     */
    public void setFirewallIPSecExemptionsAllowNeighborDiscovery(@javax.annotation.Nullable final Boolean value) {
        this._firewallIPSecExemptionsAllowNeighborDiscovery = value;
    }
    /**
     * Sets the firewallIPSecExemptionsAllowRouterDiscovery property value. Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes
     * @param value Value to set for the firewallIPSecExemptionsAllowRouterDiscovery property.
     * @return a void
     */
    public void setFirewallIPSecExemptionsAllowRouterDiscovery(@javax.annotation.Nullable final Boolean value) {
        this._firewallIPSecExemptionsAllowRouterDiscovery = value;
    }
    /**
     * Sets the firewallIPSecExemptionsNone property value. Configures IPSec exemptions to no exemptions
     * @param value Value to set for the firewallIPSecExemptionsNone property.
     * @return a void
     */
    public void setFirewallIPSecExemptionsNone(@javax.annotation.Nullable final Boolean value) {
        this._firewallIPSecExemptionsNone = value;
    }
    /**
     * Sets the firewallMergeKeyingModuleSettings property value. If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set
     * @param value Value to set for the firewallMergeKeyingModuleSettings property.
     * @return a void
     */
    public void setFirewallMergeKeyingModuleSettings(@javax.annotation.Nullable final Boolean value) {
        this._firewallMergeKeyingModuleSettings = value;
    }
    /**
     * Sets the firewallPacketQueueingMethod property value. Possible values for firewallPacketQueueingMethod
     * @param value Value to set for the firewallPacketQueueingMethod property.
     * @return a void
     */
    public void setFirewallPacketQueueingMethod(@javax.annotation.Nullable final FirewallPacketQueueingMethodType value) {
        this._firewallPacketQueueingMethod = value;
    }
    /**
     * Sets the firewallPreSharedKeyEncodingMethod property value. Possible values for firewallPreSharedKeyEncodingMethod
     * @param value Value to set for the firewallPreSharedKeyEncodingMethod property.
     * @return a void
     */
    public void setFirewallPreSharedKeyEncodingMethod(@javax.annotation.Nullable final FirewallPreSharedKeyEncodingMethodType value) {
        this._firewallPreSharedKeyEncodingMethod = value;
    }
    /**
     * Sets the firewallProfileDomain property value. Configures the firewall profile settings for domain networks
     * @param value Value to set for the firewallProfileDomain property.
     * @return a void
     */
    public void setFirewallProfileDomain(@javax.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this._firewallProfileDomain = value;
    }
    /**
     * Sets the firewallProfilePrivate property value. Configures the firewall profile settings for private networks
     * @param value Value to set for the firewallProfilePrivate property.
     * @return a void
     */
    public void setFirewallProfilePrivate(@javax.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this._firewallProfilePrivate = value;
    }
    /**
     * Sets the firewallProfilePublic property value. Configures the firewall profile settings for public networks
     * @param value Value to set for the firewallProfilePublic property.
     * @return a void
     */
    public void setFirewallProfilePublic(@javax.annotation.Nullable final WindowsFirewallNetworkProfile value) {
        this._firewallProfilePublic = value;
    }
    /**
     * Sets the firewallRules property value. Configures the firewall rule settings. This collection can contain a maximum of 150 elements.
     * @param value Value to set for the firewallRules property.
     * @return a void
     */
    public void setFirewallRules(@javax.annotation.Nullable final java.util.List<WindowsFirewallRule> value) {
        this._firewallRules = value;
    }
    /**
     * Sets the lanManagerAuthenticationLevel property value. Possible values for LanManagerAuthenticationLevel
     * @param value Value to set for the lanManagerAuthenticationLevel property.
     * @return a void
     */
    public void setLanManagerAuthenticationLevel(@javax.annotation.Nullable final LanManagerAuthenticationLevel value) {
        this._lanManagerAuthenticationLevel = value;
    }
    /**
     * Sets the lanManagerWorkstationDisableInsecureGuestLogons property value. If enabled,the SMB client will allow insecure guest logons. If not configured, the SMB client will reject insecure guest logons.
     * @param value Value to set for the lanManagerWorkstationDisableInsecureGuestLogons property.
     * @return a void
     */
    public void setLanManagerWorkstationDisableInsecureGuestLogons(@javax.annotation.Nullable final Boolean value) {
        this._lanManagerWorkstationDisableInsecureGuestLogons = value;
    }
    /**
     * Sets the localSecurityOptionsAdministratorAccountName property value. Define a different account name to be associated with the security identifier (SID) for the account 'Administrator'.
     * @param value Value to set for the localSecurityOptionsAdministratorAccountName property.
     * @return a void
     */
    public void setLocalSecurityOptionsAdministratorAccountName(@javax.annotation.Nullable final String value) {
        this._localSecurityOptionsAdministratorAccountName = value;
    }
    /**
     * Sets the localSecurityOptionsAdministratorElevationPromptBehavior property value. Possible values for LocalSecurityOptionsAdministratorElevationPromptBehavior
     * @param value Value to set for the localSecurityOptionsAdministratorElevationPromptBehavior property.
     * @return a void
     */
    public void setLocalSecurityOptionsAdministratorElevationPromptBehavior(@javax.annotation.Nullable final LocalSecurityOptionsAdministratorElevationPromptBehaviorType value) {
        this._localSecurityOptionsAdministratorElevationPromptBehavior = value;
    }
    /**
     * Sets the localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares property value. This security setting determines whether to allows anonymous users to perform certain activities, such as enumerating the names of domain accounts and network shares.
     * @param value Value to set for the localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares property.
     * @return a void
     */
    public void setLocalSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares = value;
    }
    /**
     * Sets the localSecurityOptionsAllowPKU2UAuthenticationRequests property value. Block PKU2U authentication requests to this device to use online identities.
     * @param value Value to set for the localSecurityOptionsAllowPKU2UAuthenticationRequests property.
     * @return a void
     */
    public void setLocalSecurityOptionsAllowPKU2UAuthenticationRequests(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsAllowPKU2UAuthenticationRequests = value;
    }
    /**
     * Sets the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager property value. Edit the default Security Descriptor Definition Language string to allow or deny users and groups to make remote calls to the SAM.
     * @param value Value to set for the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager property.
     * @return a void
     */
    public void setLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager(@javax.annotation.Nullable final String value) {
        this._localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager = value;
    }
    /**
     * Sets the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool property value. UI helper boolean for LocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager entity
     * @param value Value to set for the localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool property.
     * @return a void
     */
    public void setLocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool = value;
    }
    /**
     * Sets the localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn property value. This security setting determines whether a computer can be shut down without having to log on to Windows.
     * @param value Value to set for the localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn property.
     * @return a void
     */
    public void setLocalSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn = value;
    }
    /**
     * Sets the localSecurityOptionsAllowUIAccessApplicationElevation property value. Allow UIAccess apps to prompt for elevation without using the secure desktop.
     * @param value Value to set for the localSecurityOptionsAllowUIAccessApplicationElevation property.
     * @return a void
     */
    public void setLocalSecurityOptionsAllowUIAccessApplicationElevation(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsAllowUIAccessApplicationElevation = value;
    }
    /**
     * Sets the localSecurityOptionsAllowUIAccessApplicationsForSecureLocations property value. Allow UIAccess apps to prompt for elevation without using the secure desktop.Default is enabled
     * @param value Value to set for the localSecurityOptionsAllowUIAccessApplicationsForSecureLocations property.
     * @return a void
     */
    public void setLocalSecurityOptionsAllowUIAccessApplicationsForSecureLocations(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsAllowUIAccessApplicationsForSecureLocations = value;
    }
    /**
     * Sets the localSecurityOptionsAllowUndockWithoutHavingToLogon property value. Prevent a portable computer from being undocked without having to log in.
     * @param value Value to set for the localSecurityOptionsAllowUndockWithoutHavingToLogon property.
     * @return a void
     */
    public void setLocalSecurityOptionsAllowUndockWithoutHavingToLogon(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsAllowUndockWithoutHavingToLogon = value;
    }
    /**
     * Sets the localSecurityOptionsBlockMicrosoftAccounts property value. Prevent users from adding new Microsoft accounts to this computer.
     * @param value Value to set for the localSecurityOptionsBlockMicrosoftAccounts property.
     * @return a void
     */
    public void setLocalSecurityOptionsBlockMicrosoftAccounts(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsBlockMicrosoftAccounts = value;
    }
    /**
     * Sets the localSecurityOptionsBlockRemoteLogonWithBlankPassword property value. Enable Local accounts that are not password protected to log on from locations other than the physical device.Default is enabled
     * @param value Value to set for the localSecurityOptionsBlockRemoteLogonWithBlankPassword property.
     * @return a void
     */
    public void setLocalSecurityOptionsBlockRemoteLogonWithBlankPassword(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsBlockRemoteLogonWithBlankPassword = value;
    }
    /**
     * Sets the localSecurityOptionsBlockRemoteOpticalDriveAccess property value. Enabling this settings allows only interactively logged on user to access CD-ROM media.
     * @param value Value to set for the localSecurityOptionsBlockRemoteOpticalDriveAccess property.
     * @return a void
     */
    public void setLocalSecurityOptionsBlockRemoteOpticalDriveAccess(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsBlockRemoteOpticalDriveAccess = value;
    }
    /**
     * Sets the localSecurityOptionsBlockUsersInstallingPrinterDrivers property value. Restrict installing printer drivers as part of connecting to a shared printer to admins only.
     * @param value Value to set for the localSecurityOptionsBlockUsersInstallingPrinterDrivers property.
     * @return a void
     */
    public void setLocalSecurityOptionsBlockUsersInstallingPrinterDrivers(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsBlockUsersInstallingPrinterDrivers = value;
    }
    /**
     * Sets the localSecurityOptionsClearVirtualMemoryPageFile property value. This security setting determines whether the virtual memory pagefile is cleared when the system is shut down.
     * @param value Value to set for the localSecurityOptionsClearVirtualMemoryPageFile property.
     * @return a void
     */
    public void setLocalSecurityOptionsClearVirtualMemoryPageFile(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsClearVirtualMemoryPageFile = value;
    }
    /**
     * Sets the localSecurityOptionsClientDigitallySignCommunicationsAlways property value. This security setting determines whether packet signing is required by the SMB client component.
     * @param value Value to set for the localSecurityOptionsClientDigitallySignCommunicationsAlways property.
     * @return a void
     */
    public void setLocalSecurityOptionsClientDigitallySignCommunicationsAlways(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsClientDigitallySignCommunicationsAlways = value;
    }
    /**
     * Sets the localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers property value. If this security setting is enabled, the Server Message Block (SMB) redirector is allowed to send plaintext passwords to non-Microsoft SMB servers that do not support password encryption during authentication.
     * @param value Value to set for the localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers property.
     * @return a void
     */
    public void setLocalSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers = value;
    }
    /**
     * Sets the localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation property value. App installations requiring elevated privileges will prompt for admin credentials.Default is enabled
     * @param value Value to set for the localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation property.
     * @return a void
     */
    public void setLocalSecurityOptionsDetectApplicationInstallationsAndPromptForElevation(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation = value;
    }
    /**
     * Sets the localSecurityOptionsDisableAdministratorAccount property value. Determines whether the Local Administrator account is enabled or disabled.
     * @param value Value to set for the localSecurityOptionsDisableAdministratorAccount property.
     * @return a void
     */
    public void setLocalSecurityOptionsDisableAdministratorAccount(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsDisableAdministratorAccount = value;
    }
    /**
     * Sets the localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees property value. This security setting determines whether the SMB client attempts to negotiate SMB packet signing.
     * @param value Value to set for the localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees property.
     * @return a void
     */
    public void setLocalSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees = value;
    }
    /**
     * Sets the localSecurityOptionsDisableGuestAccount property value. Determines if the Guest account is enabled or disabled.
     * @param value Value to set for the localSecurityOptionsDisableGuestAccount property.
     * @return a void
     */
    public void setLocalSecurityOptionsDisableGuestAccount(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsDisableGuestAccount = value;
    }
    /**
     * Sets the localSecurityOptionsDisableServerDigitallySignCommunicationsAlways property value. This security setting determines whether packet signing is required by the SMB server component.
     * @param value Value to set for the localSecurityOptionsDisableServerDigitallySignCommunicationsAlways property.
     * @return a void
     */
    public void setLocalSecurityOptionsDisableServerDigitallySignCommunicationsAlways(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsDisableServerDigitallySignCommunicationsAlways = value;
    }
    /**
     * Sets the localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees property value. This security setting determines whether the SMB server will negotiate SMB packet signing with clients that request it.
     * @param value Value to set for the localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees property.
     * @return a void
     */
    public void setLocalSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees = value;
    }
    /**
     * Sets the localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts property value. This security setting determines what additional permissions will be granted for anonymous connections to the computer.
     * @param value Value to set for the localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts property.
     * @return a void
     */
    public void setLocalSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts = value;
    }
    /**
     * Sets the localSecurityOptionsDoNotRequireCtrlAltDel property value. Require CTRL+ALT+DEL to be pressed before a user can log on.
     * @param value Value to set for the localSecurityOptionsDoNotRequireCtrlAltDel property.
     * @return a void
     */
    public void setLocalSecurityOptionsDoNotRequireCtrlAltDel(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsDoNotRequireCtrlAltDel = value;
    }
    /**
     * Sets the localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange property value. This security setting determines if, at the next password change, the LAN Manager (LM) hash value for the new password is stored. It’s not stored by default.
     * @param value Value to set for the localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange property.
     * @return a void
     */
    public void setLocalSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange = value;
    }
    /**
     * Sets the localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser property value. Possible values for LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser
     * @param value Value to set for the localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser property.
     * @return a void
     */
    public void setLocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser(@javax.annotation.Nullable final LocalSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType value) {
        this._localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser = value;
    }
    /**
     * Sets the localSecurityOptionsGuestAccountName property value. Define a different account name to be associated with the security identifier (SID) for the account 'Guest'.
     * @param value Value to set for the localSecurityOptionsGuestAccountName property.
     * @return a void
     */
    public void setLocalSecurityOptionsGuestAccountName(@javax.annotation.Nullable final String value) {
        this._localSecurityOptionsGuestAccountName = value;
    }
    /**
     * Sets the localSecurityOptionsHideLastSignedInUser property value. Do not display the username of the last person who signed in on this device.
     * @param value Value to set for the localSecurityOptionsHideLastSignedInUser property.
     * @return a void
     */
    public void setLocalSecurityOptionsHideLastSignedInUser(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsHideLastSignedInUser = value;
    }
    /**
     * Sets the localSecurityOptionsHideUsernameAtSignIn property value. Do not display the username of the person signing in to this device after credentials are entered and before the device’s desktop is shown.
     * @param value Value to set for the localSecurityOptionsHideUsernameAtSignIn property.
     * @return a void
     */
    public void setLocalSecurityOptionsHideUsernameAtSignIn(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsHideUsernameAtSignIn = value;
    }
    /**
     * Sets the localSecurityOptionsInformationDisplayedOnLockScreen property value. Possible values for LocalSecurityOptionsInformationDisplayedOnLockScreen
     * @param value Value to set for the localSecurityOptionsInformationDisplayedOnLockScreen property.
     * @return a void
     */
    public void setLocalSecurityOptionsInformationDisplayedOnLockScreen(@javax.annotation.Nullable final LocalSecurityOptionsInformationDisplayedOnLockScreenType value) {
        this._localSecurityOptionsInformationDisplayedOnLockScreen = value;
    }
    /**
     * Sets the localSecurityOptionsInformationShownOnLockScreen property value. Possible values for LocalSecurityOptionsInformationShownOnLockScreenType
     * @param value Value to set for the localSecurityOptionsInformationShownOnLockScreen property.
     * @return a void
     */
    public void setLocalSecurityOptionsInformationShownOnLockScreen(@javax.annotation.Nullable final LocalSecurityOptionsInformationShownOnLockScreenType value) {
        this._localSecurityOptionsInformationShownOnLockScreen = value;
    }
    /**
     * Sets the localSecurityOptionsLogOnMessageText property value. Set message text for users attempting to log in.
     * @param value Value to set for the localSecurityOptionsLogOnMessageText property.
     * @return a void
     */
    public void setLocalSecurityOptionsLogOnMessageText(@javax.annotation.Nullable final String value) {
        this._localSecurityOptionsLogOnMessageText = value;
    }
    /**
     * Sets the localSecurityOptionsLogOnMessageTitle property value. Set message title for users attempting to log in.
     * @param value Value to set for the localSecurityOptionsLogOnMessageTitle property.
     * @return a void
     */
    public void setLocalSecurityOptionsLogOnMessageTitle(@javax.annotation.Nullable final String value) {
        this._localSecurityOptionsLogOnMessageTitle = value;
    }
    /**
     * Sets the localSecurityOptionsMachineInactivityLimit property value. Define maximum minutes of inactivity on the interactive desktop’s login screen until the screen saver runs. Valid values 0 to 9999
     * @param value Value to set for the localSecurityOptionsMachineInactivityLimit property.
     * @return a void
     */
    public void setLocalSecurityOptionsMachineInactivityLimit(@javax.annotation.Nullable final Integer value) {
        this._localSecurityOptionsMachineInactivityLimit = value;
    }
    /**
     * Sets the localSecurityOptionsMachineInactivityLimitInMinutes property value. Define maximum minutes of inactivity on the interactive desktop’s login screen until the screen saver runs. Valid values 0 to 9999
     * @param value Value to set for the localSecurityOptionsMachineInactivityLimitInMinutes property.
     * @return a void
     */
    public void setLocalSecurityOptionsMachineInactivityLimitInMinutes(@javax.annotation.Nullable final Integer value) {
        this._localSecurityOptionsMachineInactivityLimitInMinutes = value;
    }
    /**
     * Sets the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients property value. Possible values for LocalSecurityOptionsMinimumSessionSecurity
     * @param value Value to set for the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients property.
     * @return a void
     */
    public void setLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients(@javax.annotation.Nullable final LocalSecurityOptionsMinimumSessionSecurity value) {
        this._localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients = value;
    }
    /**
     * Sets the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers property value. Possible values for LocalSecurityOptionsMinimumSessionSecurity
     * @param value Value to set for the localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers property.
     * @return a void
     */
    public void setLocalSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers(@javax.annotation.Nullable final LocalSecurityOptionsMinimumSessionSecurity value) {
        this._localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers = value;
    }
    /**
     * Sets the localSecurityOptionsOnlyElevateSignedExecutables property value. Enforce PKI certification path validation for a given executable file before it is permitted to run.
     * @param value Value to set for the localSecurityOptionsOnlyElevateSignedExecutables property.
     * @return a void
     */
    public void setLocalSecurityOptionsOnlyElevateSignedExecutables(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsOnlyElevateSignedExecutables = value;
    }
    /**
     * Sets the localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares property value. By default, this security setting restricts anonymous access to shares and pipes to the settings for named pipes that can be accessed anonymously and Shares that can be accessed anonymously
     * @param value Value to set for the localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares property.
     * @return a void
     */
    public void setLocalSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares = value;
    }
    /**
     * Sets the localSecurityOptionsSmartCardRemovalBehavior property value. Possible values for LocalSecurityOptionsSmartCardRemovalBehaviorType
     * @param value Value to set for the localSecurityOptionsSmartCardRemovalBehavior property.
     * @return a void
     */
    public void setLocalSecurityOptionsSmartCardRemovalBehavior(@javax.annotation.Nullable final LocalSecurityOptionsSmartCardRemovalBehaviorType value) {
        this._localSecurityOptionsSmartCardRemovalBehavior = value;
    }
    /**
     * Sets the localSecurityOptionsStandardUserElevationPromptBehavior property value. Possible values for LocalSecurityOptionsStandardUserElevationPromptBehavior
     * @param value Value to set for the localSecurityOptionsStandardUserElevationPromptBehavior property.
     * @return a void
     */
    public void setLocalSecurityOptionsStandardUserElevationPromptBehavior(@javax.annotation.Nullable final LocalSecurityOptionsStandardUserElevationPromptBehaviorType value) {
        this._localSecurityOptionsStandardUserElevationPromptBehavior = value;
    }
    /**
     * Sets the localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation property value. Enable all elevation requests to go to the interactive user's desktop rather than the secure desktop. Prompt behavior policy settings for admins and standard users are used.
     * @param value Value to set for the localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation property.
     * @return a void
     */
    public void setLocalSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation = value;
    }
    /**
     * Sets the localSecurityOptionsUseAdminApprovalMode property value. Defines whether the built-in admin account uses Admin Approval Mode or runs all apps with full admin privileges.Default is enabled
     * @param value Value to set for the localSecurityOptionsUseAdminApprovalMode property.
     * @return a void
     */
    public void setLocalSecurityOptionsUseAdminApprovalMode(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsUseAdminApprovalMode = value;
    }
    /**
     * Sets the localSecurityOptionsUseAdminApprovalModeForAdministrators property value. Define whether Admin Approval Mode and all UAC policy settings are enabled, default is enabled
     * @param value Value to set for the localSecurityOptionsUseAdminApprovalModeForAdministrators property.
     * @return a void
     */
    public void setLocalSecurityOptionsUseAdminApprovalModeForAdministrators(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsUseAdminApprovalModeForAdministrators = value;
    }
    /**
     * Sets the localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations property value. Virtualize file and registry write failures to per user locations
     * @param value Value to set for the localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations property.
     * @return a void
     */
    public void setLocalSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations(@javax.annotation.Nullable final Boolean value) {
        this._localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations = value;
    }
    /**
     * Sets the smartScreenBlockOverrideForFiles property value. Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files.
     * @param value Value to set for the smartScreenBlockOverrideForFiles property.
     * @return a void
     */
    public void setSmartScreenBlockOverrideForFiles(@javax.annotation.Nullable final Boolean value) {
        this._smartScreenBlockOverrideForFiles = value;
    }
    /**
     * Sets the smartScreenEnableInShell property value. Allows IT Admins to configure SmartScreen for Windows.
     * @param value Value to set for the smartScreenEnableInShell property.
     * @return a void
     */
    public void setSmartScreenEnableInShell(@javax.annotation.Nullable final Boolean value) {
        this._smartScreenEnableInShell = value;
    }
    /**
     * Sets the userRightsAccessCredentialManagerAsTrustedCaller property value. This user right is used by Credential Manager during Backup/Restore. Users' saved credentials might be compromised if this privilege is given to other entities. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsAccessCredentialManagerAsTrustedCaller property.
     * @return a void
     */
    public void setUserRightsAccessCredentialManagerAsTrustedCaller(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsAccessCredentialManagerAsTrustedCaller = value;
    }
    /**
     * Sets the userRightsActAsPartOfTheOperatingSystem property value. This user right allows a process to impersonate any user without authentication. The process can therefore gain access to the same local resources as that user. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsActAsPartOfTheOperatingSystem property.
     * @return a void
     */
    public void setUserRightsActAsPartOfTheOperatingSystem(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsActAsPartOfTheOperatingSystem = value;
    }
    /**
     * Sets the userRightsAllowAccessFromNetwork property value. This user right determines which users and groups are allowed to connect to the computer over the network. State Allowed is supported.
     * @param value Value to set for the userRightsAllowAccessFromNetwork property.
     * @return a void
     */
    public void setUserRightsAllowAccessFromNetwork(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsAllowAccessFromNetwork = value;
    }
    /**
     * Sets the userRightsBackupData property value. This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when backing up files and directories. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsBackupData property.
     * @return a void
     */
    public void setUserRightsBackupData(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsBackupData = value;
    }
    /**
     * Sets the userRightsBlockAccessFromNetwork property value. This user right determines which users and groups are block from connecting to the computer over the network. State Block is supported.
     * @param value Value to set for the userRightsBlockAccessFromNetwork property.
     * @return a void
     */
    public void setUserRightsBlockAccessFromNetwork(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsBlockAccessFromNetwork = value;
    }
    /**
     * Sets the userRightsChangeSystemTime property value. This user right determines which users and groups can change the time and date on the internal clock of the computer. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsChangeSystemTime property.
     * @return a void
     */
    public void setUserRightsChangeSystemTime(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsChangeSystemTime = value;
    }
    /**
     * Sets the userRightsCreateGlobalObjects property value. This security setting determines whether users can create global objects that are available to all sessions. Users who can create global objects could affect processes that run under other users' sessions, which could lead to application failure or data corruption. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreateGlobalObjects property.
     * @return a void
     */
    public void setUserRightsCreateGlobalObjects(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsCreateGlobalObjects = value;
    }
    /**
     * Sets the userRightsCreatePageFile property value. This user right determines which users and groups can call an internal API to create and change the size of a page file. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreatePageFile property.
     * @return a void
     */
    public void setUserRightsCreatePageFile(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsCreatePageFile = value;
    }
    /**
     * Sets the userRightsCreatePermanentSharedObjects property value. This user right determines which accounts can be used by processes to create a directory object using the object manager. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreatePermanentSharedObjects property.
     * @return a void
     */
    public void setUserRightsCreatePermanentSharedObjects(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsCreatePermanentSharedObjects = value;
    }
    /**
     * Sets the userRightsCreateSymbolicLinks property value. This user right determines if the user can create a symbolic link from the computer to which they are logged on. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreateSymbolicLinks property.
     * @return a void
     */
    public void setUserRightsCreateSymbolicLinks(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsCreateSymbolicLinks = value;
    }
    /**
     * Sets the userRightsCreateToken property value. This user right determines which users/groups can be used by processes to create a token that can then be used to get access to any local resources when the process uses an internal API to create an access token. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsCreateToken property.
     * @return a void
     */
    public void setUserRightsCreateToken(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsCreateToken = value;
    }
    /**
     * Sets the userRightsDebugPrograms property value. This user right determines which users can attach a debugger to any process or to the kernel. Only states NotConfigured and Allowed are supported
     * @param value Value to set for the userRightsDebugPrograms property.
     * @return a void
     */
    public void setUserRightsDebugPrograms(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsDebugPrograms = value;
    }
    /**
     * Sets the userRightsDelegation property value. This user right determines which users can set the Trusted for Delegation setting on a user or computer object. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsDelegation property.
     * @return a void
     */
    public void setUserRightsDelegation(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsDelegation = value;
    }
    /**
     * Sets the userRightsDenyLocalLogOn property value. This user right determines which users cannot log on to the computer. States NotConfigured, Blocked are supported
     * @param value Value to set for the userRightsDenyLocalLogOn property.
     * @return a void
     */
    public void setUserRightsDenyLocalLogOn(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsDenyLocalLogOn = value;
    }
    /**
     * Sets the userRightsGenerateSecurityAudits property value. This user right determines which accounts can be used by a process to add entries to the security log. The security log is used to trace unauthorized system access.  Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsGenerateSecurityAudits property.
     * @return a void
     */
    public void setUserRightsGenerateSecurityAudits(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsGenerateSecurityAudits = value;
    }
    /**
     * Sets the userRightsImpersonateClient property value. Assigning this user right to a user allows programs running on behalf of that user to impersonate a client. Requiring this user right for this kind of impersonation prevents an unauthorized user from convincing a client to connect to a service that they have created and then impersonating that client, which can elevate the unauthorized user's permissions to administrative or system levels. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsImpersonateClient property.
     * @return a void
     */
    public void setUserRightsImpersonateClient(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsImpersonateClient = value;
    }
    /**
     * Sets the userRightsIncreaseSchedulingPriority property value. This user right determines which accounts can use a process with Write Property access to another process to increase the execution priority assigned to the other process. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsIncreaseSchedulingPriority property.
     * @return a void
     */
    public void setUserRightsIncreaseSchedulingPriority(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsIncreaseSchedulingPriority = value;
    }
    /**
     * Sets the userRightsLoadUnloadDrivers property value. This user right determines which users can dynamically load and unload device drivers or other code in to kernel mode. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsLoadUnloadDrivers property.
     * @return a void
     */
    public void setUserRightsLoadUnloadDrivers(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsLoadUnloadDrivers = value;
    }
    /**
     * Sets the userRightsLocalLogOn property value. This user right determines which users can log on to the computer. States NotConfigured, Allowed are supported
     * @param value Value to set for the userRightsLocalLogOn property.
     * @return a void
     */
    public void setUserRightsLocalLogOn(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsLocalLogOn = value;
    }
    /**
     * Sets the userRightsLockMemory property value. This user right determines which accounts can use a process to keep data in physical memory, which prevents the system from paging the data to virtual memory on disk. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsLockMemory property.
     * @return a void
     */
    public void setUserRightsLockMemory(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsLockMemory = value;
    }
    /**
     * Sets the userRightsManageAuditingAndSecurityLogs property value. This user right determines which users can specify object access auditing options for individual resources, such as files, Active Directory objects, and registry keys. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsManageAuditingAndSecurityLogs property.
     * @return a void
     */
    public void setUserRightsManageAuditingAndSecurityLogs(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsManageAuditingAndSecurityLogs = value;
    }
    /**
     * Sets the userRightsManageVolumes property value. This user right determines which users and groups can run maintenance tasks on a volume, such as remote defragmentation. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsManageVolumes property.
     * @return a void
     */
    public void setUserRightsManageVolumes(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsManageVolumes = value;
    }
    /**
     * Sets the userRightsModifyFirmwareEnvironment property value. This user right determines who can modify firmware environment values. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsModifyFirmwareEnvironment property.
     * @return a void
     */
    public void setUserRightsModifyFirmwareEnvironment(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsModifyFirmwareEnvironment = value;
    }
    /**
     * Sets the userRightsModifyObjectLabels property value. This user right determines which user accounts can modify the integrity label of objects, such as files, registry keys, or processes owned by other users. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsModifyObjectLabels property.
     * @return a void
     */
    public void setUserRightsModifyObjectLabels(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsModifyObjectLabels = value;
    }
    /**
     * Sets the userRightsProfileSingleProcess property value. This user right determines which users can use performance monitoring tools to monitor the performance of system processes. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsProfileSingleProcess property.
     * @return a void
     */
    public void setUserRightsProfileSingleProcess(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsProfileSingleProcess = value;
    }
    /**
     * Sets the userRightsRemoteDesktopServicesLogOn property value. This user right determines which users and groups are prohibited from logging on as a Remote Desktop Services client. Only states NotConfigured and Blocked are supported
     * @param value Value to set for the userRightsRemoteDesktopServicesLogOn property.
     * @return a void
     */
    public void setUserRightsRemoteDesktopServicesLogOn(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsRemoteDesktopServicesLogOn = value;
    }
    /**
     * Sets the userRightsRemoteShutdown property value. This user right determines which users are allowed to shut down a computer from a remote location on the network. Misuse of this user right can result in a denial of service. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsRemoteShutdown property.
     * @return a void
     */
    public void setUserRightsRemoteShutdown(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsRemoteShutdown = value;
    }
    /**
     * Sets the userRightsRestoreData property value. This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when restoring backed up files and directories, and determines which users can set any valid security principal as the owner of an object. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsRestoreData property.
     * @return a void
     */
    public void setUserRightsRestoreData(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsRestoreData = value;
    }
    /**
     * Sets the userRightsTakeOwnership property value. This user right determines which users can take ownership of any securable object in the system, including Active Directory objects, files and folders, printers, registry keys, processes, and threads. Only states NotConfigured and Allowed are supported.
     * @param value Value to set for the userRightsTakeOwnership property.
     * @return a void
     */
    public void setUserRightsTakeOwnership(@javax.annotation.Nullable final DeviceManagementUserRightsSetting value) {
        this._userRightsTakeOwnership = value;
    }
    /**
     * Sets the windowsDefenderTamperProtection property value. Defender TamperProtection setting options
     * @param value Value to set for the windowsDefenderTamperProtection property.
     * @return a void
     */
    public void setWindowsDefenderTamperProtection(@javax.annotation.Nullable final WindowsDefenderTamperProtectionOptions value) {
        this._windowsDefenderTamperProtection = value;
    }
    /**
     * Sets the xboxServicesAccessoryManagementServiceStartupMode property value. Possible values of xbox service start type
     * @param value Value to set for the xboxServicesAccessoryManagementServiceStartupMode property.
     * @return a void
     */
    public void setXboxServicesAccessoryManagementServiceStartupMode(@javax.annotation.Nullable final ServiceStartType value) {
        this._xboxServicesAccessoryManagementServiceStartupMode = value;
    }
    /**
     * Sets the xboxServicesEnableXboxGameSaveTask property value. This setting determines whether xbox game save is enabled (1) or disabled (0).
     * @param value Value to set for the xboxServicesEnableXboxGameSaveTask property.
     * @return a void
     */
    public void setXboxServicesEnableXboxGameSaveTask(@javax.annotation.Nullable final Boolean value) {
        this._xboxServicesEnableXboxGameSaveTask = value;
    }
    /**
     * Sets the xboxServicesLiveAuthManagerServiceStartupMode property value. Possible values of xbox service start type
     * @param value Value to set for the xboxServicesLiveAuthManagerServiceStartupMode property.
     * @return a void
     */
    public void setXboxServicesLiveAuthManagerServiceStartupMode(@javax.annotation.Nullable final ServiceStartType value) {
        this._xboxServicesLiveAuthManagerServiceStartupMode = value;
    }
    /**
     * Sets the xboxServicesLiveGameSaveServiceStartupMode property value. Possible values of xbox service start type
     * @param value Value to set for the xboxServicesLiveGameSaveServiceStartupMode property.
     * @return a void
     */
    public void setXboxServicesLiveGameSaveServiceStartupMode(@javax.annotation.Nullable final ServiceStartType value) {
        this._xboxServicesLiveGameSaveServiceStartupMode = value;
    }
    /**
     * Sets the xboxServicesLiveNetworkingServiceStartupMode property value. Possible values of xbox service start type
     * @param value Value to set for the xboxServicesLiveNetworkingServiceStartupMode property.
     * @return a void
     */
    public void setXboxServicesLiveNetworkingServiceStartupMode(@javax.annotation.Nullable final ServiceStartType value) {
        this._xboxServicesLiveNetworkingServiceStartupMode = value;
    }
}
