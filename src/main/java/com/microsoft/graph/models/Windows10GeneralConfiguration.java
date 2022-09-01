package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10GeneralConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account. */
    private Boolean _accountsBlockAddingNonMicrosoftAccountEmail;
    /** Possible values of a property */
    private Enablement _activateAppsWithVoice;
    /** Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only). */
    private Boolean _antiTheftModeBlocked;
    /** This policy setting permits users to change installation options that typically are available only to system administrators. */
    private Boolean _appManagementMSIAllowUserControlOverInstall;
    /** This policy setting directs Windows Installer to use elevated permissions when it installs any program on the system. */
    private Boolean _appManagementMSIAlwaysInstallWithElevatedPrivileges;
    /** List of semi-colon delimited Package Family Names of Windows apps. Listed Windows apps are to be launched after logon.​ */
    private java.util.List<String> _appManagementPackageFamilyNamesToLaunchAfterLogOn;
    /** State Management Setting. */
    private StateManagementSetting _appsAllowTrustedAppsSideloading;
    /** Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded. */
    private Boolean _appsBlockWindowsStoreOriginatedApps;
    /** Allows secondary authentication devices to work with Windows. */
    private Boolean _authenticationAllowSecondaryDevice;
    /** Specifies the preferred domain among available domains in the Azure AD tenant. */
    private String _authenticationPreferredAzureADTenantDomainName;
    /** Possible values of a property */
    private Enablement _authenticationWebSignIn;
    /** Specify a list of allowed Bluetooth services and profiles in hex formatted strings. */
    private java.util.List<String> _bluetoothAllowedServices;
    /** Whether or not to Block the user from using bluetooth advertising. */
    private Boolean _bluetoothBlockAdvertising;
    /** Whether or not to Block the user from using bluetooth discoverable mode. */
    private Boolean _bluetoothBlockDiscoverableMode;
    /** Whether or not to Block the user from using bluetooth. */
    private Boolean _bluetoothBlocked;
    /** Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device. */
    private Boolean _bluetoothBlockPrePairing;
    /** Whether or not to block the users from using Swift Pair and other proximity based scenarios. */
    private Boolean _bluetoothBlockPromptedProximalConnections;
    /** Whether or not to Block the user from accessing the camera of the device. */
    private Boolean _cameraBlocked;
    /** Whether or not to Block the user from using data over cellular while roaming. */
    private Boolean _cellularBlockDataWhenRoaming;
    /** Whether or not to Block the user from using VPN over cellular. */
    private Boolean _cellularBlockVpn;
    /** Whether or not to Block the user from using VPN when roaming over cellular. */
    private Boolean _cellularBlockVpnWhenRoaming;
    /** Possible values of the ConfigurationUsage list. */
    private ConfigurationUsage _cellularData;
    /** Whether or not to Block the user from doing manual root certificate installation. */
    private Boolean _certificatesBlockManualRootCertificateInstallation;
    /** Specifies the time zone to be applied to the device. This is the standard Windows name for the target time zone. */
    private String _configureTimeZone;
    /** Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences. */
    private Boolean _connectedDevicesServiceBlocked;
    /** Whether or not to Block the user from using copy paste. */
    private Boolean _copyPasteBlocked;
    /** Whether or not to Block the user from using Cortana. */
    private Boolean _cortanaBlocked;
    /** Specify whether to allow or disallow the Federal Information Processing Standard (FIPS) policy. */
    private Boolean _cryptographyAllowFipsAlgorithmPolicy;
    /** This policy setting allows you to block direct memory access (DMA) for all hot pluggable PCI downstream ports until a user logs into Windows. */
    private Boolean _dataProtectionBlockDirectMemoryAccess;
    /** Whether or not to block end user access to Defender. */
    private Boolean _defenderBlockEndUserAccess;
    /** Allows or disallows Windows Defender On Access Protection functionality. */
    private Boolean _defenderBlockOnAccessProtection;
    /** Possible values of Cloud Block Level */
    private DefenderCloudBlockLevelType _defenderCloudBlockLevel;
    /** Timeout extension for file scanning by the cloud. Valid values 0 to 50 */
    private Integer _defenderCloudExtendedTimeout;
    /** Timeout extension for file scanning by the cloud. Valid values 0 to 50 */
    private Integer _defenderCloudExtendedTimeoutInSeconds;
    /** Number of days before deleting quarantined malware. Valid values 0 to 90 */
    private Integer _defenderDaysBeforeDeletingQuarantinedMalware;
    /** Gets or sets Defender’s actions to take on detected Malware per threat level. */
    private DefenderDetectedMalwareActions _defenderDetectedMalwareActions;
    /** When blocked, catch-up scans for scheduled full scans will be turned off. */
    private Boolean _defenderDisableCatchupFullScan;
    /** When blocked, catch-up scans for scheduled quick scans will be turned off. */
    private Boolean _defenderDisableCatchupQuickScan;
    /** File extensions to exclude from scans and real time protection. */
    private java.util.List<String> _defenderFileExtensionsToExclude;
    /** Files and folder to exclude from scans and real time protection. */
    private java.util.List<String> _defenderFilesAndFoldersToExclude;
    /** Possible values for monitoring file activity. */
    private DefenderMonitorFileActivity _defenderMonitorFileActivity;
    /** Gets or sets Defender’s action to take on Potentially Unwanted Application (PUA), which includes software with behaviors of ad-injection, software bundling, persistent solicitation for payment or subscription, etc. Defender alerts user when PUA is being downloaded or attempts to install itself. Added in Windows 10 for desktop. Possible values are: deviceDefault, block, audit. */
    private DefenderPotentiallyUnwantedAppAction _defenderPotentiallyUnwantedAppAction;
    /** Possible values of Defender PUA Protection */
    private DefenderProtectionType _defenderPotentiallyUnwantedAppActionSetting;
    /** Processes to exclude from scans and real time protection. */
    private java.util.List<String> _defenderProcessesToExclude;
    /** Possible values for prompting user for samples submission. */
    private DefenderPromptForSampleSubmission _defenderPromptForSampleSubmission;
    /** Indicates whether or not to require behavior monitoring. */
    private Boolean _defenderRequireBehaviorMonitoring;
    /** Indicates whether or not to require cloud protection. */
    private Boolean _defenderRequireCloudProtection;
    /** Indicates whether or not to require network inspection system. */
    private Boolean _defenderRequireNetworkInspectionSystem;
    /** Indicates whether or not to require real time monitoring. */
    private Boolean _defenderRequireRealTimeMonitoring;
    /** Indicates whether or not to scan archive files. */
    private Boolean _defenderScanArchiveFiles;
    /** Indicates whether or not to scan downloads. */
    private Boolean _defenderScanDownloads;
    /** Indicates whether or not to scan incoming mail messages. */
    private Boolean _defenderScanIncomingMail;
    /** Indicates whether or not to scan mapped network drives during full scan. */
    private Boolean _defenderScanMappedNetworkDrivesDuringFullScan;
    /** Max CPU usage percentage during scan. Valid values 0 to 100 */
    private Integer _defenderScanMaxCpu;
    /** Indicates whether or not to scan files opened from a network folder. */
    private Boolean _defenderScanNetworkFiles;
    /** Indicates whether or not to scan removable drives during full scan. */
    private Boolean _defenderScanRemovableDrivesDuringFullScan;
    /** Indicates whether or not to scan scripts loaded in Internet Explorer browser. */
    private Boolean _defenderScanScriptsLoadedInInternetExplorer;
    /** Possible values for system scan type. */
    private DefenderScanType _defenderScanType;
    /** The time to perform a daily quick scan. */
    private LocalTime _defenderScheduledQuickScanTime;
    /** The defender time for the system scan. */
    private LocalTime _defenderScheduledScanTime;
    /** When enabled, low CPU priority will be used during scheduled scans. */
    private Boolean _defenderScheduleScanEnableLowCpuPriority;
    /** The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24 */
    private Integer _defenderSignatureUpdateIntervalInHours;
    /** Checks for the user consent level in Windows Defender to send data. Possible values are: sendSafeSamplesAutomatically, alwaysPrompt, neverSend, sendAllSamplesAutomatically. */
    private DefenderSubmitSamplesConsentType _defenderSubmitSamplesConsentType;
    /** Possible values for a weekly schedule. */
    private WeeklySchedule _defenderSystemScanSchedule;
    /** State Management Setting. */
    private StateManagementSetting _developerUnlockSetting;
    /** Indicates whether or not to Block the user from resetting their phone. */
    private Boolean _deviceManagementBlockFactoryResetOnMobile;
    /** Indicates whether or not to Block the user from doing manual un-enrollment from device management. */
    private Boolean _deviceManagementBlockManualUnenroll;
    /** Allow the device to send diagnostic and usage telemetry data, such as Watson. */
    private DiagnosticDataSubmissionMode _diagnosticsDataSubmissionMode;
    /** List of legacy applications that have GDI DPI Scaling turned off. */
    private java.util.List<String> _displayAppListWithGdiDPIScalingTurnedOff;
    /** List of legacy applications that have GDI DPI Scaling turned on. */
    private java.util.List<String> _displayAppListWithGdiDPIScalingTurnedOn;
    /** Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge. */
    private Boolean _edgeAllowStartPagesModification;
    /** Indicates whether or not to prevent access to about flags on Edge browser. */
    private Boolean _edgeBlockAccessToAboutFlags;
    /** Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services. */
    private Boolean _edgeBlockAddressBarDropdown;
    /** Indicates whether or not to block auto fill. */
    private Boolean _edgeBlockAutofill;
    /** Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues. */
    private Boolean _edgeBlockCompatibilityList;
    /** Indicates whether or not to block developer tools in the Edge browser. */
    private Boolean _edgeBlockDeveloperTools;
    /** Indicates whether or not to Block the user from using the Edge browser. */
    private Boolean _edgeBlocked;
    /** Indicates whether or not to Block the user from making changes to Favorites. */
    private Boolean _edgeBlockEditFavorites;
    /** Indicates whether or not to block extensions in the Edge browser. */
    private Boolean _edgeBlockExtensions;
    /** Allow or prevent Edge from entering the full screen mode. */
    private Boolean _edgeBlockFullScreenMode;
    /** Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser. */
    private Boolean _edgeBlockInPrivateBrowsing;
    /** Indicates whether or not to Block the user from using JavaScript. */
    private Boolean _edgeBlockJavaScript;
    /** Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge. */
    private Boolean _edgeBlockLiveTileDataCollection;
    /** Indicates whether or not to Block password manager. */
    private Boolean _edgeBlockPasswordManager;
    /** Indicates whether or not to block popups. */
    private Boolean _edgeBlockPopups;
    /** Decide whether Microsoft Edge is prelaunched at Windows startup. */
    private Boolean _edgeBlockPrelaunch;
    /** Configure Edge to allow or block printing. */
    private Boolean _edgeBlockPrinting;
    /** Configure Edge to allow browsing history to be saved or to never save browsing history. */
    private Boolean _edgeBlockSavingHistory;
    /** Indicates whether or not to block the user from adding new search engine or changing the default search engine. */
    private Boolean _edgeBlockSearchEngineCustomization;
    /** Indicates whether or not to block the user from using the search suggestions in the address bar. */
    private Boolean _edgeBlockSearchSuggestions;
    /** Indicates whether or not to Block the user from sending the do not track header. */
    private Boolean _edgeBlockSendingDoNotTrackHeader;
    /** Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead. */
    private Boolean _edgeBlockSendingIntranetTrafficToInternetExplorer;
    /** Indicates whether the user can sideload extensions. */
    private Boolean _edgeBlockSideloadingExtensions;
    /** Configure whether Edge preloads the new tab page at Windows startup. */
    private Boolean _edgeBlockTabPreloading;
    /** Configure to load a blank page in Edge instead of the default New tab page and prevent users from changing it. */
    private Boolean _edgeBlockWebContentOnNewTabPage;
    /** Clear browsing data on exiting Microsoft Edge. */
    private Boolean _edgeClearBrowsingDataOnExit;
    /** Possible values to specify which cookies are allowed in Microsoft Edge. */
    private EdgeCookiePolicy _edgeCookiePolicy;
    /** Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page. */
    private Boolean _edgeDisableFirstRunPage;
    /** Indicates the enterprise mode site list location. Could be a local file, local network or http location. */
    private String _edgeEnterpriseModeSiteListLocation;
    /** Generic visibility state. */
    private VisibilitySetting _edgeFavoritesBarVisibility;
    /** The location of the favorites list to provision. Could be a local file, local network or http location. */
    private String _edgeFavoritesListLocation;
    /** The first run URL for when Edge browser is opened for the first time. */
    private String _edgeFirstRunUrl;
    /** Causes the Home button to either hide, load the default Start page, load a New tab page, or a custom URL */
    private EdgeHomeButtonConfiguration _edgeHomeButtonConfiguration;
    /** Enable the Home button configuration. */
    private Boolean _edgeHomeButtonConfigurationEnabled;
    /** The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser. */
    private java.util.List<String> _edgeHomepageUrls;
    /** Specify how the Microsoft Edge settings are restricted based on kiosk mode. */
    private EdgeKioskModeRestrictionType _edgeKioskModeRestriction;
    /** Specifies the time in minutes from the last user activity before Microsoft Edge kiosk resets.  Valid values are 0-1440. The default is 5. 0 indicates no reset. Valid values 0 to 1440 */
    private Integer _edgeKioskResetAfterIdleTimeInMinutes;
    /** Specify the page opened when new tabs are created. */
    private String _edgeNewTabPageURL;
    /** Possible values for the EdgeOpensWith setting. */
    private EdgeOpenOptions _edgeOpensWith;
    /** Allow or prevent users from overriding certificate errors. */
    private Boolean _edgePreventCertificateErrorOverride;
    /** Specify the list of package family names of browser extensions that are required and cannot be turned off by the user. */
    private java.util.List<String> _edgeRequiredExtensionPackageFamilyNames;
    /** Indicates whether or not to Require the user to use the smart screen filter. */
    private Boolean _edgeRequireSmartScreen;
    /** Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set. */
    private EdgeSearchEngineBase _edgeSearchEngine;
    /** Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. */
    private Boolean _edgeSendIntranetTrafficToInternetExplorer;
    /** What message will be displayed by Edge before switching to Internet Explorer. */
    private InternetExplorerMessageSetting _edgeShowMessageWhenOpeningInternetExplorerSites;
    /** Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers. */
    private Boolean _edgeSyncFavoritesWithInternetExplorer;
    /** Type of browsing data sent to Microsoft 365 analytics */
    private EdgeTelemetryMode _edgeTelemetryForMicrosoft365Analytics;
    /** Allow users with administrative rights to delete all user data and settings using CTRL + Win + R at the device lock screen so that the device can be automatically re-configured and re-enrolled into management. */
    private Boolean _enableAutomaticRedeployment;
    /** This setting allows you to specify battery charge level at which Energy Saver is turned on. While on battery, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100 */
    private Integer _energySaverOnBatteryThresholdPercentage;
    /** This setting allows you to specify battery charge level at which Energy Saver is turned on. While plugged in, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100 */
    private Integer _energySaverPluggedInThresholdPercentage;
    /** Endpoint for discovering cloud printers. */
    private String _enterpriseCloudPrintDiscoveryEndPoint;
    /** Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535 */
    private Integer _enterpriseCloudPrintDiscoveryMaxLimit;
    /** OAuth resource URI for printer discovery service as configured in Azure portal. */
    private String _enterpriseCloudPrintMopriaDiscoveryResourceIdentifier;
    /** Authentication endpoint for acquiring OAuth tokens. */
    private String _enterpriseCloudPrintOAuthAuthority;
    /** GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority. */
    private String _enterpriseCloudPrintOAuthClientIdentifier;
    /** OAuth resource URI for print service as configured in the Azure portal. */
    private String _enterpriseCloudPrintResourceIdentifier;
    /** Indicates whether or not to enable device discovery UX. */
    private Boolean _experienceBlockDeviceDiscovery;
    /** Indicates whether or not to allow the error dialog from displaying if no SIM card is detected. */
    private Boolean _experienceBlockErrorDialogWhenNoSIM;
    /** Indicates whether or not to enable task switching on the device. */
    private Boolean _experienceBlockTaskSwitcher;
    /** Allow(Not Configured) or prevent(Block) the syncing of Microsoft Edge Browser settings. Option to prevent syncing across devices, but allow user override. */
    private BrowserSyncSetting _experienceDoNotSyncBrowserSettings;
    /** Possible values of a property */
    private Enablement _findMyFiles;
    /** Indicates whether or not to block DVR and broadcasting. */
    private Boolean _gameDvrBlocked;
    /** Values for the InkWorkspaceAccess setting. */
    private InkAccessSetting _inkWorkspaceAccess;
    /** State Management Setting. */
    private StateManagementSetting _inkWorkspaceAccessState;
    /** Specify whether to show recommended app suggestions in the ink workspace. */
    private Boolean _inkWorkspaceBlockSuggestedApps;
    /** Indicates whether or not to Block the user from using internet sharing. */
    private Boolean _internetSharingBlocked;
    /** Indicates whether or not to Block the user from location services. */
    private Boolean _locationServicesBlocked;
    /** Possible values of a property */
    private Enablement _lockScreenActivateAppsWithVoice;
    /** Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored. */
    private Boolean _lockScreenAllowTimeoutConfiguration;
    /** Indicates whether or not to block action center notifications over lock screen. */
    private Boolean _lockScreenBlockActionCenterNotifications;
    /** Indicates whether or not the user can interact with Cortana using speech while the system is locked. */
    private Boolean _lockScreenBlockCortana;
    /** Indicates whether to allow toast notifications above the device lock screen. */
    private Boolean _lockScreenBlockToastNotifications;
    /** Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800 */
    private Integer _lockScreenTimeoutInSeconds;
    /** Disables the ability to quickly switch between users that are logged on simultaneously without logging off. */
    private Boolean _logonBlockFastUserSwitching;
    /** Indicates whether or not to block the MMS send/receive functionality on the device. */
    private Boolean _messagingBlockMMS;
    /** Indicates whether or not to block the RCS send/receive functionality on the device. */
    private Boolean _messagingBlockRichCommunicationServices;
    /** Indicates whether or not to block text message back up and restore and Messaging Everywhere. */
    private Boolean _messagingBlockSync;
    /** Indicates whether or not to Block a Microsoft account. */
    private Boolean _microsoftAccountBlocked;
    /** Indicates whether or not to Block Microsoft account settings sync. */
    private Boolean _microsoftAccountBlockSettingsSync;
    /** Values for the SignInAssistantSettings. */
    private SignInAssistantOptions _microsoftAccountSignInAssistantSettings;
    /** If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account that’s enrolled into MDM. */
    private Boolean _networkProxyApplySettingsDeviceWide;
    /** Address to the proxy auto-config (PAC) script you want to use. */
    private String _networkProxyAutomaticConfigurationUrl;
    /** Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script. */
    private Boolean _networkProxyDisableAutoDetect;
    /** Specifies manual proxy server settings. */
    private Windows10NetworkProxyServer _networkProxyServer;
    /** Indicates whether or not to Block the user from using near field communication. */
    private Boolean _nfcBlocked;
    /** Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive. */
    private Boolean _oneDriveDisableFileSync;
    /** Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords. */
    private Boolean _passwordBlockSimple;
    /** The password expiration in days. Valid values 0 to 730 */
    private Integer _passwordExpirationDays;
    /** This security setting determines the period of time (in days) that a password must be used before the user can change it. Valid values 0 to 998 */
    private Integer _passwordMinimumAgeInDays;
    /** The number of character sets required in the password. */
    private Integer _passwordMinimumCharacterSetCount;
    /** The minimum password length. Valid values 4 to 16 */
    private Integer _passwordMinimumLength;
    /** The minutes of inactivity before the screen times out. */
    private Integer _passwordMinutesOfInactivityBeforeScreenTimeout;
    /** The number of previous passwords to prevent reuse of. Valid values 0 to 50 */
    private Integer _passwordPreviousPasswordBlockCount;
    /** Indicates whether or not to require the user to have a password. */
    private Boolean _passwordRequired;
    /** Possible values of required passwords. */
    private RequiredPasswordType _passwordRequiredType;
    /** Indicates whether or not to require a password upon resuming from an idle state. */
    private Boolean _passwordRequireWhenResumeFromIdleState;
    /** The number of sign in failures before factory reset. Valid values 0 to 999 */
    private Integer _passwordSignInFailureCountBeforeFactoryReset;
    /** A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image. */
    private String _personalizationDesktopImageUrl;
    /** A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a file Url to a local image on the file system that needs to be used as the Lock Screen Image. */
    private String _personalizationLockScreenImageUrl;
    /** Power action types */
    private PowerActionType _powerButtonActionOnBattery;
    /** Power action types */
    private PowerActionType _powerButtonActionPluggedIn;
    /** Possible values of a property */
    private Enablement _powerHybridSleepOnBattery;
    /** Possible values of a property */
    private Enablement _powerHybridSleepPluggedIn;
    /** Power action types */
    private PowerActionType _powerLidCloseActionOnBattery;
    /** Power action types */
    private PowerActionType _powerLidCloseActionPluggedIn;
    /** Power action types */
    private PowerActionType _powerSleepButtonActionOnBattery;
    /** Power action types */
    private PowerActionType _powerSleepButtonActionPluggedIn;
    /** Prevent user installation of additional printers from printers settings. */
    private Boolean _printerBlockAddition;
    /** Name (network host name) of an installed printer. */
    private String _printerDefaultName;
    /** Automatically provision printers based on their names (network host names). */
    private java.util.List<String> _printerNames;
    /** Indicates a list of applications with their access control levels over privacy data categories, and/or the default access levels per category. This collection can contain a maximum of 500 elements. */
    private java.util.List<WindowsPrivacyDataAccessControlItem> _privacyAccessControls;
    /** State Management Setting. */
    private StateManagementSetting _privacyAdvertisingId;
    /** Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps. */
    private Boolean _privacyAutoAcceptPairingAndConsentPrompts;
    /** Blocks the usage of cloud based speech services for Cortana, Dictation, or Store applications. */
    private Boolean _privacyBlockActivityFeed;
    /** Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications. */
    private Boolean _privacyBlockInputPersonalization;
    /** Blocks the shared experiences/discovery of recently used resources in task switcher etc. */
    private Boolean _privacyBlockPublishUserActivities;
    /** This policy prevents the privacy experience from launching during user logon for new and upgraded users.​ */
    private Boolean _privacyDisableLaunchExperience;
    /** Indicates whether or not to Block the user from reset protection mode. */
    private Boolean _resetProtectionModeBlocked;
    /** Specifies what level of safe search (filtering adult content) is required */
    private SafeSearchFilterType _safeSearchFilter;
    /** Indicates whether or not to Block the user from taking Screenshots. */
    private Boolean _screenCaptureBlocked;
    /** Specifies if search can use diacritics. */
    private Boolean _searchBlockDiacritics;
    /** Indicates whether or not to block the web search. */
    private Boolean _searchBlockWebResults;
    /** Specifies whether to use automatic language detection when indexing content and properties. */
    private Boolean _searchDisableAutoLanguageDetection;
    /** Indicates whether or not to disable the search indexer backoff feature. */
    private Boolean _searchDisableIndexerBackoff;
    /** Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer. */
    private Boolean _searchDisableIndexingEncryptedItems;
    /** Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed. */
    private Boolean _searchDisableIndexingRemovableDrive;
    /** Specifies if search can use location information. */
    private Boolean _searchDisableLocation;
    /** Specifies if search can use location information. */
    private Boolean _searchDisableUseLocation;
    /** Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops. */
    private Boolean _searchEnableAutomaticIndexSizeManangement;
    /** Indicates whether or not to block remote queries of this computer’s index. */
    private Boolean _searchEnableRemoteQueries;
    /** Specify whether to allow automatic device encryption during OOBE when the device is Azure AD joined (desktop only). */
    private Boolean _securityBlockAzureADJoinedDevicesAutoEncryption;
    /** Indicates whether or not to block access to Accounts in Settings app. */
    private Boolean _settingsBlockAccountsPage;
    /** Indicates whether or not to block the user from installing provisioning packages. */
    private Boolean _settingsBlockAddProvisioningPackage;
    /** Indicates whether or not to block access to Apps in Settings app. */
    private Boolean _settingsBlockAppsPage;
    /** Indicates whether or not to block the user from changing the language settings. */
    private Boolean _settingsBlockChangeLanguage;
    /** Indicates whether or not to block the user from changing power and sleep settings. */
    private Boolean _settingsBlockChangePowerSleep;
    /** Indicates whether or not to block the user from changing the region settings. */
    private Boolean _settingsBlockChangeRegion;
    /** Indicates whether or not to block the user from changing date and time settings. */
    private Boolean _settingsBlockChangeSystemTime;
    /** Indicates whether or not to block access to Devices in Settings app. */
    private Boolean _settingsBlockDevicesPage;
    /** Indicates whether or not to block access to Ease of Access in Settings app. */
    private Boolean _settingsBlockEaseOfAccessPage;
    /** Indicates whether or not to block the user from editing the device name. */
    private Boolean _settingsBlockEditDeviceName;
    /** Indicates whether or not to block access to Gaming in Settings app. */
    private Boolean _settingsBlockGamingPage;
    /** Indicates whether or not to block access to Network & Internet in Settings app. */
    private Boolean _settingsBlockNetworkInternetPage;
    /** Indicates whether or not to block access to Personalization in Settings app. */
    private Boolean _settingsBlockPersonalizationPage;
    /** Indicates whether or not to block access to Privacy in Settings app. */
    private Boolean _settingsBlockPrivacyPage;
    /** Indicates whether or not to block the runtime configuration agent from removing provisioning packages. */
    private Boolean _settingsBlockRemoveProvisioningPackage;
    /** Indicates whether or not to block access to Settings app. */
    private Boolean _settingsBlockSettingsApp;
    /** Indicates whether or not to block access to System in Settings app. */
    private Boolean _settingsBlockSystemPage;
    /** Indicates whether or not to block access to Time & Language in Settings app. */
    private Boolean _settingsBlockTimeLanguagePage;
    /** Indicates whether or not to block access to Update & Security in Settings app. */
    private Boolean _settingsBlockUpdateSecurityPage;
    /** Indicates whether or not to block multiple users of the same app to share data. */
    private Boolean _sharedUserAppDataAllowed;
    /** App Install control Setting */
    private AppInstallControlType _smartScreenAppInstallControl;
    /** Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites. */
    private Boolean _smartScreenBlockPromptOverride;
    /** Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files */
    private Boolean _smartScreenBlockPromptOverrideForFiles;
    /** This property will be deprecated in July 2019 and will be replaced by property SmartScreenAppInstallControl. Allows IT Admins to control whether users are allowed to install apps from places other than the Store. */
    private Boolean _smartScreenEnableAppInstallControl;
    /** Indicates whether or not to block the user from unpinning apps from taskbar. */
    private Boolean _startBlockUnpinningAppsFromTaskbar;
    /** Type of start menu app list visibility. */
    private WindowsStartMenuAppListVisibilityType _startMenuAppListVisibility;
    /** Enabling this policy hides the change account setting from appearing in the user tile in the start menu. */
    private Boolean _startMenuHideChangeAccountSettings;
    /** Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app. */
    private Boolean _startMenuHideFrequentlyUsedApps;
    /** Enabling this policy hides hibernate from appearing in the power button in the start menu. */
    private Boolean _startMenuHideHibernate;
    /** Enabling this policy hides lock from appearing in the user tile in the start menu. */
    private Boolean _startMenuHideLock;
    /** Enabling this policy hides the power button from appearing in the start menu. */
    private Boolean _startMenuHidePowerButton;
    /** Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app. */
    private Boolean _startMenuHideRecentJumpLists;
    /** Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app. */
    private Boolean _startMenuHideRecentlyAddedApps;
    /** Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu. */
    private Boolean _startMenuHideRestartOptions;
    /** Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu. */
    private Boolean _startMenuHideShutDown;
    /** Enabling this policy hides sign out from appearing in the user tile in the start menu. */
    private Boolean _startMenuHideSignOut;
    /** Enabling this policy hides sleep from appearing in the power button in the start menu. */
    private Boolean _startMenuHideSleep;
    /** Enabling this policy hides switch account from appearing in the user tile in the start menu. */
    private Boolean _startMenuHideSwitchAccount;
    /** Enabling this policy hides the user tile from appearing in the start menu. */
    private Boolean _startMenuHideUserTile;
    /** This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array. */
    private byte[] _startMenuLayoutEdgeAssetsXml;
    /** Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format. */
    private byte[] _startMenuLayoutXml;
    /** Type of display modes for the start menu. */
    private WindowsStartMenuModeType _startMenuMode;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderDocuments;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderDownloads;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderFileExplorer;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderHomeGroup;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderMusic;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderNetwork;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderPersonalFolder;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderPictures;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderSettings;
    /** Generic visibility state. */
    private VisibilitySetting _startMenuPinnedFolderVideos;
    /** Indicates whether or not to Block the user from using removable storage. */
    private Boolean _storageBlockRemovableStorage;
    /** Indicating whether or not to require encryption on a mobile device. */
    private Boolean _storageRequireMobileDeviceEncryption;
    /** Indicates whether application data is restricted to the system drive. */
    private Boolean _storageRestrictAppDataToSystemVolume;
    /** Indicates whether the installation of applications is restricted to the system drive. */
    private Boolean _storageRestrictAppInstallToSystemVolume;
    /** Gets or sets the fully qualified domain name (FQDN) or IP address of a proxy server to forward Connected User Experiences and Telemetry requests. */
    private String _systemTelemetryProxyServer;
    /** Specify whether non-administrators can use Task Manager to end tasks. */
    private Boolean _taskManagerBlockEndTask;
    /** Whether the device is required to connect to the network. */
    private Boolean _tenantLockdownRequireNetworkDuringOutOfBoxExperience;
    /** Indicates whether or not to uninstall a fixed list of built-in Windows apps. */
    private Boolean _uninstallBuiltInApps;
    /** Indicates whether or not to Block the user from USB connection. */
    private Boolean _usbBlocked;
    /** Indicates whether or not to Block the user from voice recording. */
    private Boolean _voiceRecordingBlocked;
    /** Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC */
    private Boolean _webRtcBlockLocalhostIpAddress;
    /** Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked. */
    private Boolean _wiFiBlockAutomaticConnectHotspots;
    /** Indicates whether or not to Block the user from using Wi-Fi. */
    private Boolean _wiFiBlocked;
    /** Indicates whether or not to Block the user from using Wi-Fi manual configuration. */
    private Boolean _wiFiBlockManualConfiguration;
    /** Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500 */
    private Integer _wiFiScanInterval;
    /** Windows 10 force update schedule for Apps. */
    private Windows10AppsForceUpdateSchedule _windows10AppsForceUpdateSchedule;
    /** Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles. */
    private Boolean _windowsSpotlightBlockConsumerSpecificFeatures;
    /** Allows IT admins to turn off all Windows Spotlight features */
    private Boolean _windowsSpotlightBlocked;
    /** Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed */
    private Boolean _windowsSpotlightBlockOnActionCenter;
    /** Block personalized content in Windows spotlight based on user’s device usage. */
    private Boolean _windowsSpotlightBlockTailoredExperiences;
    /** Block third party content delivered via Windows Spotlight */
    private Boolean _windowsSpotlightBlockThirdPartyNotifications;
    /** Block Windows Spotlight Windows welcome experience */
    private Boolean _windowsSpotlightBlockWelcomeExperience;
    /** Allows IT admins to turn off the popup of Windows Tips. */
    private Boolean _windowsSpotlightBlockWindowsTips;
    /** Allows IT admind to set a predefined default search engine for MDM-Controlled devices */
    private WindowsSpotlightEnablementSettings _windowsSpotlightConfigureOnLockScreen;
    /** Indicates whether or not to block automatic update of apps from Windows Store. */
    private Boolean _windowsStoreBlockAutoUpdate;
    /** Indicates whether or not to Block the user from using the Windows store. */
    private Boolean _windowsStoreBlocked;
    /** Indicates whether or not to enable Private Store Only. */
    private Boolean _windowsStoreEnablePrivateStoreOnly;
    /** Indicates whether or not to allow other devices from discovering this PC for projection. */
    private Boolean _wirelessDisplayBlockProjectionToThisDevice;
    /** Indicates whether or not to allow user input from wireless display receiver. */
    private Boolean _wirelessDisplayBlockUserInputFromReceiver;
    /** Indicates whether or not to require a PIN for new devices to initiate pairing. */
    private Boolean _wirelessDisplayRequirePinForPairing;
    /**
     * Instantiates a new Windows10GeneralConfiguration and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static Windows10GeneralConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10GeneralConfiguration();
    }
    /**
     * Gets the accountsBlockAddingNonMicrosoftAccountEmail property value. Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccountsBlockAddingNonMicrosoftAccountEmail() {
        return this._accountsBlockAddingNonMicrosoftAccountEmail;
    }
    /**
     * Gets the activateAppsWithVoice property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getActivateAppsWithVoice() {
        return this._activateAppsWithVoice;
    }
    /**
     * Gets the antiTheftModeBlocked property value. Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAntiTheftModeBlocked() {
        return this._antiTheftModeBlocked;
    }
    /**
     * Gets the appManagementMSIAllowUserControlOverInstall property value. This policy setting permits users to change installation options that typically are available only to system administrators.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppManagementMSIAllowUserControlOverInstall() {
        return this._appManagementMSIAllowUserControlOverInstall;
    }
    /**
     * Gets the appManagementMSIAlwaysInstallWithElevatedPrivileges property value. This policy setting directs Windows Installer to use elevated permissions when it installs any program on the system.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppManagementMSIAlwaysInstallWithElevatedPrivileges() {
        return this._appManagementMSIAlwaysInstallWithElevatedPrivileges;
    }
    /**
     * Gets the appManagementPackageFamilyNamesToLaunchAfterLogOn property value. List of semi-colon delimited Package Family Names of Windows apps. Listed Windows apps are to be launched after logon.​
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAppManagementPackageFamilyNamesToLaunchAfterLogOn() {
        return this._appManagementPackageFamilyNamesToLaunchAfterLogOn;
    }
    /**
     * Gets the appsAllowTrustedAppsSideloading property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getAppsAllowTrustedAppsSideloading() {
        return this._appsAllowTrustedAppsSideloading;
    }
    /**
     * Gets the appsBlockWindowsStoreOriginatedApps property value. Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsBlockWindowsStoreOriginatedApps() {
        return this._appsBlockWindowsStoreOriginatedApps;
    }
    /**
     * Gets the authenticationAllowSecondaryDevice property value. Allows secondary authentication devices to work with Windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAuthenticationAllowSecondaryDevice() {
        return this._authenticationAllowSecondaryDevice;
    }
    /**
     * Gets the authenticationPreferredAzureADTenantDomainName property value. Specifies the preferred domain among available domains in the Azure AD tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationPreferredAzureADTenantDomainName() {
        return this._authenticationPreferredAzureADTenantDomainName;
    }
    /**
     * Gets the authenticationWebSignIn property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getAuthenticationWebSignIn() {
        return this._authenticationWebSignIn;
    }
    /**
     * Gets the bluetoothAllowedServices property value. Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBluetoothAllowedServices() {
        return this._bluetoothAllowedServices;
    }
    /**
     * Gets the bluetoothBlockAdvertising property value. Whether or not to Block the user from using bluetooth advertising.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockAdvertising() {
        return this._bluetoothBlockAdvertising;
    }
    /**
     * Gets the bluetoothBlockDiscoverableMode property value. Whether or not to Block the user from using bluetooth discoverable mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockDiscoverableMode() {
        return this._bluetoothBlockDiscoverableMode;
    }
    /**
     * Gets the bluetoothBlocked property value. Whether or not to Block the user from using bluetooth.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlocked() {
        return this._bluetoothBlocked;
    }
    /**
     * Gets the bluetoothBlockPrePairing property value. Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockPrePairing() {
        return this._bluetoothBlockPrePairing;
    }
    /**
     * Gets the bluetoothBlockPromptedProximalConnections property value. Whether or not to block the users from using Swift Pair and other proximity based scenarios.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockPromptedProximalConnections() {
        return this._bluetoothBlockPromptedProximalConnections;
    }
    /**
     * Gets the cameraBlocked property value. Whether or not to Block the user from accessing the camera of the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this._cameraBlocked;
    }
    /**
     * Gets the cellularBlockDataWhenRoaming property value. Whether or not to Block the user from using data over cellular while roaming.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockDataWhenRoaming() {
        return this._cellularBlockDataWhenRoaming;
    }
    /**
     * Gets the cellularBlockVpn property value. Whether or not to Block the user from using VPN over cellular.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockVpn() {
        return this._cellularBlockVpn;
    }
    /**
     * Gets the cellularBlockVpnWhenRoaming property value. Whether or not to Block the user from using VPN when roaming over cellular.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockVpnWhenRoaming() {
        return this._cellularBlockVpnWhenRoaming;
    }
    /**
     * Gets the cellularData property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @javax.annotation.Nullable
    public ConfigurationUsage getCellularData() {
        return this._cellularData;
    }
    /**
     * Gets the certificatesBlockManualRootCertificateInstallation property value. Whether or not to Block the user from doing manual root certificate installation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCertificatesBlockManualRootCertificateInstallation() {
        return this._certificatesBlockManualRootCertificateInstallation;
    }
    /**
     * Gets the configureTimeZone property value. Specifies the time zone to be applied to the device. This is the standard Windows name for the target time zone.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConfigureTimeZone() {
        return this._configureTimeZone;
    }
    /**
     * Gets the connectedDevicesServiceBlocked property value. Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectedDevicesServiceBlocked() {
        return this._connectedDevicesServiceBlocked;
    }
    /**
     * Gets the copyPasteBlocked property value. Whether or not to Block the user from using copy paste.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCopyPasteBlocked() {
        return this._copyPasteBlocked;
    }
    /**
     * Gets the cortanaBlocked property value. Whether or not to Block the user from using Cortana.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCortanaBlocked() {
        return this._cortanaBlocked;
    }
    /**
     * Gets the cryptographyAllowFipsAlgorithmPolicy property value. Specify whether to allow or disallow the Federal Information Processing Standard (FIPS) policy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCryptographyAllowFipsAlgorithmPolicy() {
        return this._cryptographyAllowFipsAlgorithmPolicy;
    }
    /**
     * Gets the dataProtectionBlockDirectMemoryAccess property value. This policy setting allows you to block direct memory access (DMA) for all hot pluggable PCI downstream ports until a user logs into Windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDataProtectionBlockDirectMemoryAccess() {
        return this._dataProtectionBlockDirectMemoryAccess;
    }
    /**
     * Gets the defenderBlockEndUserAccess property value. Whether or not to block end user access to Defender.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderBlockEndUserAccess() {
        return this._defenderBlockEndUserAccess;
    }
    /**
     * Gets the defenderBlockOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderBlockOnAccessProtection() {
        return this._defenderBlockOnAccessProtection;
    }
    /**
     * Gets the defenderCloudBlockLevel property value. Possible values of Cloud Block Level
     * @return a defenderCloudBlockLevelType
     */
    @javax.annotation.Nullable
    public DefenderCloudBlockLevelType getDefenderCloudBlockLevel() {
        return this._defenderCloudBlockLevel;
    }
    /**
     * Gets the defenderCloudExtendedTimeout property value. Timeout extension for file scanning by the cloud. Valid values 0 to 50
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderCloudExtendedTimeout() {
        return this._defenderCloudExtendedTimeout;
    }
    /**
     * Gets the defenderCloudExtendedTimeoutInSeconds property value. Timeout extension for file scanning by the cloud. Valid values 0 to 50
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderCloudExtendedTimeoutInSeconds() {
        return this._defenderCloudExtendedTimeoutInSeconds;
    }
    /**
     * Gets the defenderDaysBeforeDeletingQuarantinedMalware property value. Number of days before deleting quarantined malware. Valid values 0 to 90
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderDaysBeforeDeletingQuarantinedMalware() {
        return this._defenderDaysBeforeDeletingQuarantinedMalware;
    }
    /**
     * Gets the defenderDetectedMalwareActions property value. Gets or sets Defender’s actions to take on detected Malware per threat level.
     * @return a defenderDetectedMalwareActions
     */
    @javax.annotation.Nullable
    public DefenderDetectedMalwareActions getDefenderDetectedMalwareActions() {
        return this._defenderDetectedMalwareActions;
    }
    /**
     * Gets the defenderDisableCatchupFullScan property value. When blocked, catch-up scans for scheduled full scans will be turned off.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableCatchupFullScan() {
        return this._defenderDisableCatchupFullScan;
    }
    /**
     * Gets the defenderDisableCatchupQuickScan property value. When blocked, catch-up scans for scheduled quick scans will be turned off.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableCatchupQuickScan() {
        return this._defenderDisableCatchupQuickScan;
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
     * Gets the defenderMonitorFileActivity property value. Possible values for monitoring file activity.
     * @return a defenderMonitorFileActivity
     */
    @javax.annotation.Nullable
    public DefenderMonitorFileActivity getDefenderMonitorFileActivity() {
        return this._defenderMonitorFileActivity;
    }
    /**
     * Gets the defenderPotentiallyUnwantedAppAction property value. Gets or sets Defender’s action to take on Potentially Unwanted Application (PUA), which includes software with behaviors of ad-injection, software bundling, persistent solicitation for payment or subscription, etc. Defender alerts user when PUA is being downloaded or attempts to install itself. Added in Windows 10 for desktop. Possible values are: deviceDefault, block, audit.
     * @return a defenderPotentiallyUnwantedAppAction
     */
    @javax.annotation.Nullable
    public DefenderPotentiallyUnwantedAppAction getDefenderPotentiallyUnwantedAppAction() {
        return this._defenderPotentiallyUnwantedAppAction;
    }
    /**
     * Gets the defenderPotentiallyUnwantedAppActionSetting property value. Possible values of Defender PUA Protection
     * @return a defenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderPotentiallyUnwantedAppActionSetting() {
        return this._defenderPotentiallyUnwantedAppActionSetting;
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
     * Gets the defenderPromptForSampleSubmission property value. Possible values for prompting user for samples submission.
     * @return a defenderPromptForSampleSubmission
     */
    @javax.annotation.Nullable
    public DefenderPromptForSampleSubmission getDefenderPromptForSampleSubmission() {
        return this._defenderPromptForSampleSubmission;
    }
    /**
     * Gets the defenderRequireBehaviorMonitoring property value. Indicates whether or not to require behavior monitoring.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireBehaviorMonitoring() {
        return this._defenderRequireBehaviorMonitoring;
    }
    /**
     * Gets the defenderRequireCloudProtection property value. Indicates whether or not to require cloud protection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireCloudProtection() {
        return this._defenderRequireCloudProtection;
    }
    /**
     * Gets the defenderRequireNetworkInspectionSystem property value. Indicates whether or not to require network inspection system.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireNetworkInspectionSystem() {
        return this._defenderRequireNetworkInspectionSystem;
    }
    /**
     * Gets the defenderRequireRealTimeMonitoring property value. Indicates whether or not to require real time monitoring.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireRealTimeMonitoring() {
        return this._defenderRequireRealTimeMonitoring;
    }
    /**
     * Gets the defenderScanArchiveFiles property value. Indicates whether or not to scan archive files.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanArchiveFiles() {
        return this._defenderScanArchiveFiles;
    }
    /**
     * Gets the defenderScanDownloads property value. Indicates whether or not to scan downloads.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanDownloads() {
        return this._defenderScanDownloads;
    }
    /**
     * Gets the defenderScanIncomingMail property value. Indicates whether or not to scan incoming mail messages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanIncomingMail() {
        return this._defenderScanIncomingMail;
    }
    /**
     * Gets the defenderScanMappedNetworkDrivesDuringFullScan property value. Indicates whether or not to scan mapped network drives during full scan.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanMappedNetworkDrivesDuringFullScan() {
        return this._defenderScanMappedNetworkDrivesDuringFullScan;
    }
    /**
     * Gets the defenderScanMaxCpu property value. Max CPU usage percentage during scan. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderScanMaxCpu() {
        return this._defenderScanMaxCpu;
    }
    /**
     * Gets the defenderScanNetworkFiles property value. Indicates whether or not to scan files opened from a network folder.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanNetworkFiles() {
        return this._defenderScanNetworkFiles;
    }
    /**
     * Gets the defenderScanRemovableDrivesDuringFullScan property value. Indicates whether or not to scan removable drives during full scan.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanRemovableDrivesDuringFullScan() {
        return this._defenderScanRemovableDrivesDuringFullScan;
    }
    /**
     * Gets the defenderScanScriptsLoadedInInternetExplorer property value. Indicates whether or not to scan scripts loaded in Internet Explorer browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanScriptsLoadedInInternetExplorer() {
        return this._defenderScanScriptsLoadedInInternetExplorer;
    }
    /**
     * Gets the defenderScanType property value. Possible values for system scan type.
     * @return a defenderScanType
     */
    @javax.annotation.Nullable
    public DefenderScanType getDefenderScanType() {
        return this._defenderScanType;
    }
    /**
     * Gets the defenderScheduledQuickScanTime property value. The time to perform a daily quick scan.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getDefenderScheduledQuickScanTime() {
        return this._defenderScheduledQuickScanTime;
    }
    /**
     * Gets the defenderScheduledScanTime property value. The defender time for the system scan.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getDefenderScheduledScanTime() {
        return this._defenderScheduledScanTime;
    }
    /**
     * Gets the defenderScheduleScanEnableLowCpuPriority property value. When enabled, low CPU priority will be used during scheduled scans.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScheduleScanEnableLowCpuPriority() {
        return this._defenderScheduleScanEnableLowCpuPriority;
    }
    /**
     * Gets the defenderSignatureUpdateIntervalInHours property value. The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
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
     * Gets the defenderSystemScanSchedule property value. Possible values for a weekly schedule.
     * @return a weeklySchedule
     */
    @javax.annotation.Nullable
    public WeeklySchedule getDefenderSystemScanSchedule() {
        return this._defenderSystemScanSchedule;
    }
    /**
     * Gets the developerUnlockSetting property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getDeveloperUnlockSetting() {
        return this._developerUnlockSetting;
    }
    /**
     * Gets the deviceManagementBlockFactoryResetOnMobile property value. Indicates whether or not to Block the user from resetting their phone.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceManagementBlockFactoryResetOnMobile() {
        return this._deviceManagementBlockFactoryResetOnMobile;
    }
    /**
     * Gets the deviceManagementBlockManualUnenroll property value. Indicates whether or not to Block the user from doing manual un-enrollment from device management.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceManagementBlockManualUnenroll() {
        return this._deviceManagementBlockManualUnenroll;
    }
    /**
     * Gets the diagnosticsDataSubmissionMode property value. Allow the device to send diagnostic and usage telemetry data, such as Watson.
     * @return a diagnosticDataSubmissionMode
     */
    @javax.annotation.Nullable
    public DiagnosticDataSubmissionMode getDiagnosticsDataSubmissionMode() {
        return this._diagnosticsDataSubmissionMode;
    }
    /**
     * Gets the displayAppListWithGdiDPIScalingTurnedOff property value. List of legacy applications that have GDI DPI Scaling turned off.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDisplayAppListWithGdiDPIScalingTurnedOff() {
        return this._displayAppListWithGdiDPIScalingTurnedOff;
    }
    /**
     * Gets the displayAppListWithGdiDPIScalingTurnedOn property value. List of legacy applications that have GDI DPI Scaling turned on.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDisplayAppListWithGdiDPIScalingTurnedOn() {
        return this._displayAppListWithGdiDPIScalingTurnedOn;
    }
    /**
     * Gets the edgeAllowStartPagesModification property value. Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeAllowStartPagesModification() {
        return this._edgeAllowStartPagesModification;
    }
    /**
     * Gets the edgeBlockAccessToAboutFlags property value. Indicates whether or not to prevent access to about flags on Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockAccessToAboutFlags() {
        return this._edgeBlockAccessToAboutFlags;
    }
    /**
     * Gets the edgeBlockAddressBarDropdown property value. Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockAddressBarDropdown() {
        return this._edgeBlockAddressBarDropdown;
    }
    /**
     * Gets the edgeBlockAutofill property value. Indicates whether or not to block auto fill.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockAutofill() {
        return this._edgeBlockAutofill;
    }
    /**
     * Gets the edgeBlockCompatibilityList property value. Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockCompatibilityList() {
        return this._edgeBlockCompatibilityList;
    }
    /**
     * Gets the edgeBlockDeveloperTools property value. Indicates whether or not to block developer tools in the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockDeveloperTools() {
        return this._edgeBlockDeveloperTools;
    }
    /**
     * Gets the edgeBlocked property value. Indicates whether or not to Block the user from using the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlocked() {
        return this._edgeBlocked;
    }
    /**
     * Gets the edgeBlockEditFavorites property value. Indicates whether or not to Block the user from making changes to Favorites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockEditFavorites() {
        return this._edgeBlockEditFavorites;
    }
    /**
     * Gets the edgeBlockExtensions property value. Indicates whether or not to block extensions in the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockExtensions() {
        return this._edgeBlockExtensions;
    }
    /**
     * Gets the edgeBlockFullScreenMode property value. Allow or prevent Edge from entering the full screen mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockFullScreenMode() {
        return this._edgeBlockFullScreenMode;
    }
    /**
     * Gets the edgeBlockInPrivateBrowsing property value. Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockInPrivateBrowsing() {
        return this._edgeBlockInPrivateBrowsing;
    }
    /**
     * Gets the edgeBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockJavaScript() {
        return this._edgeBlockJavaScript;
    }
    /**
     * Gets the edgeBlockLiveTileDataCollection property value. Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockLiveTileDataCollection() {
        return this._edgeBlockLiveTileDataCollection;
    }
    /**
     * Gets the edgeBlockPasswordManager property value. Indicates whether or not to Block password manager.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockPasswordManager() {
        return this._edgeBlockPasswordManager;
    }
    /**
     * Gets the edgeBlockPopups property value. Indicates whether or not to block popups.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockPopups() {
        return this._edgeBlockPopups;
    }
    /**
     * Gets the edgeBlockPrelaunch property value. Decide whether Microsoft Edge is prelaunched at Windows startup.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockPrelaunch() {
        return this._edgeBlockPrelaunch;
    }
    /**
     * Gets the edgeBlockPrinting property value. Configure Edge to allow or block printing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockPrinting() {
        return this._edgeBlockPrinting;
    }
    /**
     * Gets the edgeBlockSavingHistory property value. Configure Edge to allow browsing history to be saved or to never save browsing history.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSavingHistory() {
        return this._edgeBlockSavingHistory;
    }
    /**
     * Gets the edgeBlockSearchEngineCustomization property value. Indicates whether or not to block the user from adding new search engine or changing the default search engine.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSearchEngineCustomization() {
        return this._edgeBlockSearchEngineCustomization;
    }
    /**
     * Gets the edgeBlockSearchSuggestions property value. Indicates whether or not to block the user from using the search suggestions in the address bar.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSearchSuggestions() {
        return this._edgeBlockSearchSuggestions;
    }
    /**
     * Gets the edgeBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSendingDoNotTrackHeader() {
        return this._edgeBlockSendingDoNotTrackHeader;
    }
    /**
     * Gets the edgeBlockSendingIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSendingIntranetTrafficToInternetExplorer() {
        return this._edgeBlockSendingIntranetTrafficToInternetExplorer;
    }
    /**
     * Gets the edgeBlockSideloadingExtensions property value. Indicates whether the user can sideload extensions.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSideloadingExtensions() {
        return this._edgeBlockSideloadingExtensions;
    }
    /**
     * Gets the edgeBlockTabPreloading property value. Configure whether Edge preloads the new tab page at Windows startup.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockTabPreloading() {
        return this._edgeBlockTabPreloading;
    }
    /**
     * Gets the edgeBlockWebContentOnNewTabPage property value. Configure to load a blank page in Edge instead of the default New tab page and prevent users from changing it.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockWebContentOnNewTabPage() {
        return this._edgeBlockWebContentOnNewTabPage;
    }
    /**
     * Gets the edgeClearBrowsingDataOnExit property value. Clear browsing data on exiting Microsoft Edge.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeClearBrowsingDataOnExit() {
        return this._edgeClearBrowsingDataOnExit;
    }
    /**
     * Gets the edgeCookiePolicy property value. Possible values to specify which cookies are allowed in Microsoft Edge.
     * @return a edgeCookiePolicy
     */
    @javax.annotation.Nullable
    public EdgeCookiePolicy getEdgeCookiePolicy() {
        return this._edgeCookiePolicy;
    }
    /**
     * Gets the edgeDisableFirstRunPage property value. Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeDisableFirstRunPage() {
        return this._edgeDisableFirstRunPage;
    }
    /**
     * Gets the edgeEnterpriseModeSiteListLocation property value. Indicates the enterprise mode site list location. Could be a local file, local network or http location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEdgeEnterpriseModeSiteListLocation() {
        return this._edgeEnterpriseModeSiteListLocation;
    }
    /**
     * Gets the edgeFavoritesBarVisibility property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getEdgeFavoritesBarVisibility() {
        return this._edgeFavoritesBarVisibility;
    }
    /**
     * Gets the edgeFavoritesListLocation property value. The location of the favorites list to provision. Could be a local file, local network or http location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEdgeFavoritesListLocation() {
        return this._edgeFavoritesListLocation;
    }
    /**
     * Gets the edgeFirstRunUrl property value. The first run URL for when Edge browser is opened for the first time.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEdgeFirstRunUrl() {
        return this._edgeFirstRunUrl;
    }
    /**
     * Gets the edgeHomeButtonConfiguration property value. Causes the Home button to either hide, load the default Start page, load a New tab page, or a custom URL
     * @return a edgeHomeButtonConfiguration
     */
    @javax.annotation.Nullable
    public EdgeHomeButtonConfiguration getEdgeHomeButtonConfiguration() {
        return this._edgeHomeButtonConfiguration;
    }
    /**
     * Gets the edgeHomeButtonConfigurationEnabled property value. Enable the Home button configuration.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeHomeButtonConfigurationEnabled() {
        return this._edgeHomeButtonConfigurationEnabled;
    }
    /**
     * Gets the edgeHomepageUrls property value. The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEdgeHomepageUrls() {
        return this._edgeHomepageUrls;
    }
    /**
     * Gets the edgeKioskModeRestriction property value. Specify how the Microsoft Edge settings are restricted based on kiosk mode.
     * @return a edgeKioskModeRestrictionType
     */
    @javax.annotation.Nullable
    public EdgeKioskModeRestrictionType getEdgeKioskModeRestriction() {
        return this._edgeKioskModeRestriction;
    }
    /**
     * Gets the edgeKioskResetAfterIdleTimeInMinutes property value. Specifies the time in minutes from the last user activity before Microsoft Edge kiosk resets.  Valid values are 0-1440. The default is 5. 0 indicates no reset. Valid values 0 to 1440
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEdgeKioskResetAfterIdleTimeInMinutes() {
        return this._edgeKioskResetAfterIdleTimeInMinutes;
    }
    /**
     * Gets the edgeNewTabPageURL property value. Specify the page opened when new tabs are created.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEdgeNewTabPageURL() {
        return this._edgeNewTabPageURL;
    }
    /**
     * Gets the edgeOpensWith property value. Possible values for the EdgeOpensWith setting.
     * @return a edgeOpenOptions
     */
    @javax.annotation.Nullable
    public EdgeOpenOptions getEdgeOpensWith() {
        return this._edgeOpensWith;
    }
    /**
     * Gets the edgePreventCertificateErrorOverride property value. Allow or prevent users from overriding certificate errors.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgePreventCertificateErrorOverride() {
        return this._edgePreventCertificateErrorOverride;
    }
    /**
     * Gets the edgeRequiredExtensionPackageFamilyNames property value. Specify the list of package family names of browser extensions that are required and cannot be turned off by the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEdgeRequiredExtensionPackageFamilyNames() {
        return this._edgeRequiredExtensionPackageFamilyNames;
    }
    /**
     * Gets the edgeRequireSmartScreen property value. Indicates whether or not to Require the user to use the smart screen filter.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeRequireSmartScreen() {
        return this._edgeRequireSmartScreen;
    }
    /**
     * Gets the edgeSearchEngine property value. Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set.
     * @return a edgeSearchEngineBase
     */
    @javax.annotation.Nullable
    public EdgeSearchEngineBase getEdgeSearchEngine() {
        return this._edgeSearchEngine;
    }
    /**
     * Gets the edgeSendIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeSendIntranetTrafficToInternetExplorer() {
        return this._edgeSendIntranetTrafficToInternetExplorer;
    }
    /**
     * Gets the edgeShowMessageWhenOpeningInternetExplorerSites property value. What message will be displayed by Edge before switching to Internet Explorer.
     * @return a internetExplorerMessageSetting
     */
    @javax.annotation.Nullable
    public InternetExplorerMessageSetting getEdgeShowMessageWhenOpeningInternetExplorerSites() {
        return this._edgeShowMessageWhenOpeningInternetExplorerSites;
    }
    /**
     * Gets the edgeSyncFavoritesWithInternetExplorer property value. Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeSyncFavoritesWithInternetExplorer() {
        return this._edgeSyncFavoritesWithInternetExplorer;
    }
    /**
     * Gets the edgeTelemetryForMicrosoft365Analytics property value. Type of browsing data sent to Microsoft 365 analytics
     * @return a edgeTelemetryMode
     */
    @javax.annotation.Nullable
    public EdgeTelemetryMode getEdgeTelemetryForMicrosoft365Analytics() {
        return this._edgeTelemetryForMicrosoft365Analytics;
    }
    /**
     * Gets the enableAutomaticRedeployment property value. Allow users with administrative rights to delete all user data and settings using CTRL + Win + R at the device lock screen so that the device can be automatically re-configured and re-enrolled into management.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableAutomaticRedeployment() {
        return this._enableAutomaticRedeployment;
    }
    /**
     * Gets the energySaverOnBatteryThresholdPercentage property value. This setting allows you to specify battery charge level at which Energy Saver is turned on. While on battery, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnergySaverOnBatteryThresholdPercentage() {
        return this._energySaverOnBatteryThresholdPercentage;
    }
    /**
     * Gets the energySaverPluggedInThresholdPercentage property value. This setting allows you to specify battery charge level at which Energy Saver is turned on. While plugged in, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnergySaverPluggedInThresholdPercentage() {
        return this._energySaverPluggedInThresholdPercentage;
    }
    /**
     * Gets the enterpriseCloudPrintDiscoveryEndPoint property value. Endpoint for discovering cloud printers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintDiscoveryEndPoint() {
        return this._enterpriseCloudPrintDiscoveryEndPoint;
    }
    /**
     * Gets the enterpriseCloudPrintDiscoveryMaxLimit property value. Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnterpriseCloudPrintDiscoveryMaxLimit() {
        return this._enterpriseCloudPrintDiscoveryMaxLimit;
    }
    /**
     * Gets the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property value. OAuth resource URI for printer discovery service as configured in Azure portal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier() {
        return this._enterpriseCloudPrintMopriaDiscoveryResourceIdentifier;
    }
    /**
     * Gets the enterpriseCloudPrintOAuthAuthority property value. Authentication endpoint for acquiring OAuth tokens.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintOAuthAuthority() {
        return this._enterpriseCloudPrintOAuthAuthority;
    }
    /**
     * Gets the enterpriseCloudPrintOAuthClientIdentifier property value. GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintOAuthClientIdentifier() {
        return this._enterpriseCloudPrintOAuthClientIdentifier;
    }
    /**
     * Gets the enterpriseCloudPrintResourceIdentifier property value. OAuth resource URI for print service as configured in the Azure portal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintResourceIdentifier() {
        return this._enterpriseCloudPrintResourceIdentifier;
    }
    /**
     * Gets the experienceBlockDeviceDiscovery property value. Indicates whether or not to enable device discovery UX.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExperienceBlockDeviceDiscovery() {
        return this._experienceBlockDeviceDiscovery;
    }
    /**
     * Gets the experienceBlockErrorDialogWhenNoSIM property value. Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExperienceBlockErrorDialogWhenNoSIM() {
        return this._experienceBlockErrorDialogWhenNoSIM;
    }
    /**
     * Gets the experienceBlockTaskSwitcher property value. Indicates whether or not to enable task switching on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExperienceBlockTaskSwitcher() {
        return this._experienceBlockTaskSwitcher;
    }
    /**
     * Gets the experienceDoNotSyncBrowserSettings property value. Allow(Not Configured) or prevent(Block) the syncing of Microsoft Edge Browser settings. Option to prevent syncing across devices, but allow user override.
     * @return a browserSyncSetting
     */
    @javax.annotation.Nullable
    public BrowserSyncSetting getExperienceDoNotSyncBrowserSettings() {
        return this._experienceDoNotSyncBrowserSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10GeneralConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("accountsBlockAddingNonMicrosoftAccountEmail", (n) -> { currentObject.setAccountsBlockAddingNonMicrosoftAccountEmail(n.getBooleanValue()); });
            this.put("activateAppsWithVoice", (n) -> { currentObject.setActivateAppsWithVoice(n.getEnumValue(Enablement.class)); });
            this.put("antiTheftModeBlocked", (n) -> { currentObject.setAntiTheftModeBlocked(n.getBooleanValue()); });
            this.put("appManagementMSIAllowUserControlOverInstall", (n) -> { currentObject.setAppManagementMSIAllowUserControlOverInstall(n.getBooleanValue()); });
            this.put("appManagementMSIAlwaysInstallWithElevatedPrivileges", (n) -> { currentObject.setAppManagementMSIAlwaysInstallWithElevatedPrivileges(n.getBooleanValue()); });
            this.put("appManagementPackageFamilyNamesToLaunchAfterLogOn", (n) -> { currentObject.setAppManagementPackageFamilyNamesToLaunchAfterLogOn(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("appsAllowTrustedAppsSideloading", (n) -> { currentObject.setAppsAllowTrustedAppsSideloading(n.getEnumValue(StateManagementSetting.class)); });
            this.put("appsBlockWindowsStoreOriginatedApps", (n) -> { currentObject.setAppsBlockWindowsStoreOriginatedApps(n.getBooleanValue()); });
            this.put("authenticationAllowSecondaryDevice", (n) -> { currentObject.setAuthenticationAllowSecondaryDevice(n.getBooleanValue()); });
            this.put("authenticationPreferredAzureADTenantDomainName", (n) -> { currentObject.setAuthenticationPreferredAzureADTenantDomainName(n.getStringValue()); });
            this.put("authenticationWebSignIn", (n) -> { currentObject.setAuthenticationWebSignIn(n.getEnumValue(Enablement.class)); });
            this.put("bluetoothAllowedServices", (n) -> { currentObject.setBluetoothAllowedServices(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("bluetoothBlockAdvertising", (n) -> { currentObject.setBluetoothBlockAdvertising(n.getBooleanValue()); });
            this.put("bluetoothBlockDiscoverableMode", (n) -> { currentObject.setBluetoothBlockDiscoverableMode(n.getBooleanValue()); });
            this.put("bluetoothBlocked", (n) -> { currentObject.setBluetoothBlocked(n.getBooleanValue()); });
            this.put("bluetoothBlockPrePairing", (n) -> { currentObject.setBluetoothBlockPrePairing(n.getBooleanValue()); });
            this.put("bluetoothBlockPromptedProximalConnections", (n) -> { currentObject.setBluetoothBlockPromptedProximalConnections(n.getBooleanValue()); });
            this.put("cameraBlocked", (n) -> { currentObject.setCameraBlocked(n.getBooleanValue()); });
            this.put("cellularBlockDataWhenRoaming", (n) -> { currentObject.setCellularBlockDataWhenRoaming(n.getBooleanValue()); });
            this.put("cellularBlockVpn", (n) -> { currentObject.setCellularBlockVpn(n.getBooleanValue()); });
            this.put("cellularBlockVpnWhenRoaming", (n) -> { currentObject.setCellularBlockVpnWhenRoaming(n.getBooleanValue()); });
            this.put("cellularData", (n) -> { currentObject.setCellularData(n.getEnumValue(ConfigurationUsage.class)); });
            this.put("certificatesBlockManualRootCertificateInstallation", (n) -> { currentObject.setCertificatesBlockManualRootCertificateInstallation(n.getBooleanValue()); });
            this.put("configureTimeZone", (n) -> { currentObject.setConfigureTimeZone(n.getStringValue()); });
            this.put("connectedDevicesServiceBlocked", (n) -> { currentObject.setConnectedDevicesServiceBlocked(n.getBooleanValue()); });
            this.put("copyPasteBlocked", (n) -> { currentObject.setCopyPasteBlocked(n.getBooleanValue()); });
            this.put("cortanaBlocked", (n) -> { currentObject.setCortanaBlocked(n.getBooleanValue()); });
            this.put("cryptographyAllowFipsAlgorithmPolicy", (n) -> { currentObject.setCryptographyAllowFipsAlgorithmPolicy(n.getBooleanValue()); });
            this.put("dataProtectionBlockDirectMemoryAccess", (n) -> { currentObject.setDataProtectionBlockDirectMemoryAccess(n.getBooleanValue()); });
            this.put("defenderBlockEndUserAccess", (n) -> { currentObject.setDefenderBlockEndUserAccess(n.getBooleanValue()); });
            this.put("defenderBlockOnAccessProtection", (n) -> { currentObject.setDefenderBlockOnAccessProtection(n.getBooleanValue()); });
            this.put("defenderCloudBlockLevel", (n) -> { currentObject.setDefenderCloudBlockLevel(n.getEnumValue(DefenderCloudBlockLevelType.class)); });
            this.put("defenderCloudExtendedTimeout", (n) -> { currentObject.setDefenderCloudExtendedTimeout(n.getIntegerValue()); });
            this.put("defenderCloudExtendedTimeoutInSeconds", (n) -> { currentObject.setDefenderCloudExtendedTimeoutInSeconds(n.getIntegerValue()); });
            this.put("defenderDaysBeforeDeletingQuarantinedMalware", (n) -> { currentObject.setDefenderDaysBeforeDeletingQuarantinedMalware(n.getIntegerValue()); });
            this.put("defenderDetectedMalwareActions", (n) -> { currentObject.setDefenderDetectedMalwareActions(n.getObjectValue(DefenderDetectedMalwareActions::createFromDiscriminatorValue)); });
            this.put("defenderDisableCatchupFullScan", (n) -> { currentObject.setDefenderDisableCatchupFullScan(n.getBooleanValue()); });
            this.put("defenderDisableCatchupQuickScan", (n) -> { currentObject.setDefenderDisableCatchupQuickScan(n.getBooleanValue()); });
            this.put("defenderFileExtensionsToExclude", (n) -> { currentObject.setDefenderFileExtensionsToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("defenderFilesAndFoldersToExclude", (n) -> { currentObject.setDefenderFilesAndFoldersToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("defenderMonitorFileActivity", (n) -> { currentObject.setDefenderMonitorFileActivity(n.getEnumValue(DefenderMonitorFileActivity.class)); });
            this.put("defenderPotentiallyUnwantedAppAction", (n) -> { currentObject.setDefenderPotentiallyUnwantedAppAction(n.getEnumValue(DefenderPotentiallyUnwantedAppAction.class)); });
            this.put("defenderPotentiallyUnwantedAppActionSetting", (n) -> { currentObject.setDefenderPotentiallyUnwantedAppActionSetting(n.getEnumValue(DefenderProtectionType.class)); });
            this.put("defenderProcessesToExclude", (n) -> { currentObject.setDefenderProcessesToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("defenderPromptForSampleSubmission", (n) -> { currentObject.setDefenderPromptForSampleSubmission(n.getEnumValue(DefenderPromptForSampleSubmission.class)); });
            this.put("defenderRequireBehaviorMonitoring", (n) -> { currentObject.setDefenderRequireBehaviorMonitoring(n.getBooleanValue()); });
            this.put("defenderRequireCloudProtection", (n) -> { currentObject.setDefenderRequireCloudProtection(n.getBooleanValue()); });
            this.put("defenderRequireNetworkInspectionSystem", (n) -> { currentObject.setDefenderRequireNetworkInspectionSystem(n.getBooleanValue()); });
            this.put("defenderRequireRealTimeMonitoring", (n) -> { currentObject.setDefenderRequireRealTimeMonitoring(n.getBooleanValue()); });
            this.put("defenderScanArchiveFiles", (n) -> { currentObject.setDefenderScanArchiveFiles(n.getBooleanValue()); });
            this.put("defenderScanDownloads", (n) -> { currentObject.setDefenderScanDownloads(n.getBooleanValue()); });
            this.put("defenderScanIncomingMail", (n) -> { currentObject.setDefenderScanIncomingMail(n.getBooleanValue()); });
            this.put("defenderScanMappedNetworkDrivesDuringFullScan", (n) -> { currentObject.setDefenderScanMappedNetworkDrivesDuringFullScan(n.getBooleanValue()); });
            this.put("defenderScanMaxCpu", (n) -> { currentObject.setDefenderScanMaxCpu(n.getIntegerValue()); });
            this.put("defenderScanNetworkFiles", (n) -> { currentObject.setDefenderScanNetworkFiles(n.getBooleanValue()); });
            this.put("defenderScanRemovableDrivesDuringFullScan", (n) -> { currentObject.setDefenderScanRemovableDrivesDuringFullScan(n.getBooleanValue()); });
            this.put("defenderScanScriptsLoadedInInternetExplorer", (n) -> { currentObject.setDefenderScanScriptsLoadedInInternetExplorer(n.getBooleanValue()); });
            this.put("defenderScanType", (n) -> { currentObject.setDefenderScanType(n.getEnumValue(DefenderScanType.class)); });
            this.put("defenderScheduledQuickScanTime", (n) -> { currentObject.setDefenderScheduledQuickScanTime(n.getLocalTimeValue()); });
            this.put("defenderScheduledScanTime", (n) -> { currentObject.setDefenderScheduledScanTime(n.getLocalTimeValue()); });
            this.put("defenderScheduleScanEnableLowCpuPriority", (n) -> { currentObject.setDefenderScheduleScanEnableLowCpuPriority(n.getBooleanValue()); });
            this.put("defenderSignatureUpdateIntervalInHours", (n) -> { currentObject.setDefenderSignatureUpdateIntervalInHours(n.getIntegerValue()); });
            this.put("defenderSubmitSamplesConsentType", (n) -> { currentObject.setDefenderSubmitSamplesConsentType(n.getEnumValue(DefenderSubmitSamplesConsentType.class)); });
            this.put("defenderSystemScanSchedule", (n) -> { currentObject.setDefenderSystemScanSchedule(n.getEnumValue(WeeklySchedule.class)); });
            this.put("developerUnlockSetting", (n) -> { currentObject.setDeveloperUnlockSetting(n.getEnumValue(StateManagementSetting.class)); });
            this.put("deviceManagementBlockFactoryResetOnMobile", (n) -> { currentObject.setDeviceManagementBlockFactoryResetOnMobile(n.getBooleanValue()); });
            this.put("deviceManagementBlockManualUnenroll", (n) -> { currentObject.setDeviceManagementBlockManualUnenroll(n.getBooleanValue()); });
            this.put("diagnosticsDataSubmissionMode", (n) -> { currentObject.setDiagnosticsDataSubmissionMode(n.getEnumValue(DiagnosticDataSubmissionMode.class)); });
            this.put("displayAppListWithGdiDPIScalingTurnedOff", (n) -> { currentObject.setDisplayAppListWithGdiDPIScalingTurnedOff(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("displayAppListWithGdiDPIScalingTurnedOn", (n) -> { currentObject.setDisplayAppListWithGdiDPIScalingTurnedOn(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("edgeAllowStartPagesModification", (n) -> { currentObject.setEdgeAllowStartPagesModification(n.getBooleanValue()); });
            this.put("edgeBlockAccessToAboutFlags", (n) -> { currentObject.setEdgeBlockAccessToAboutFlags(n.getBooleanValue()); });
            this.put("edgeBlockAddressBarDropdown", (n) -> { currentObject.setEdgeBlockAddressBarDropdown(n.getBooleanValue()); });
            this.put("edgeBlockAutofill", (n) -> { currentObject.setEdgeBlockAutofill(n.getBooleanValue()); });
            this.put("edgeBlockCompatibilityList", (n) -> { currentObject.setEdgeBlockCompatibilityList(n.getBooleanValue()); });
            this.put("edgeBlockDeveloperTools", (n) -> { currentObject.setEdgeBlockDeveloperTools(n.getBooleanValue()); });
            this.put("edgeBlocked", (n) -> { currentObject.setEdgeBlocked(n.getBooleanValue()); });
            this.put("edgeBlockEditFavorites", (n) -> { currentObject.setEdgeBlockEditFavorites(n.getBooleanValue()); });
            this.put("edgeBlockExtensions", (n) -> { currentObject.setEdgeBlockExtensions(n.getBooleanValue()); });
            this.put("edgeBlockFullScreenMode", (n) -> { currentObject.setEdgeBlockFullScreenMode(n.getBooleanValue()); });
            this.put("edgeBlockInPrivateBrowsing", (n) -> { currentObject.setEdgeBlockInPrivateBrowsing(n.getBooleanValue()); });
            this.put("edgeBlockJavaScript", (n) -> { currentObject.setEdgeBlockJavaScript(n.getBooleanValue()); });
            this.put("edgeBlockLiveTileDataCollection", (n) -> { currentObject.setEdgeBlockLiveTileDataCollection(n.getBooleanValue()); });
            this.put("edgeBlockPasswordManager", (n) -> { currentObject.setEdgeBlockPasswordManager(n.getBooleanValue()); });
            this.put("edgeBlockPopups", (n) -> { currentObject.setEdgeBlockPopups(n.getBooleanValue()); });
            this.put("edgeBlockPrelaunch", (n) -> { currentObject.setEdgeBlockPrelaunch(n.getBooleanValue()); });
            this.put("edgeBlockPrinting", (n) -> { currentObject.setEdgeBlockPrinting(n.getBooleanValue()); });
            this.put("edgeBlockSavingHistory", (n) -> { currentObject.setEdgeBlockSavingHistory(n.getBooleanValue()); });
            this.put("edgeBlockSearchEngineCustomization", (n) -> { currentObject.setEdgeBlockSearchEngineCustomization(n.getBooleanValue()); });
            this.put("edgeBlockSearchSuggestions", (n) -> { currentObject.setEdgeBlockSearchSuggestions(n.getBooleanValue()); });
            this.put("edgeBlockSendingDoNotTrackHeader", (n) -> { currentObject.setEdgeBlockSendingDoNotTrackHeader(n.getBooleanValue()); });
            this.put("edgeBlockSendingIntranetTrafficToInternetExplorer", (n) -> { currentObject.setEdgeBlockSendingIntranetTrafficToInternetExplorer(n.getBooleanValue()); });
            this.put("edgeBlockSideloadingExtensions", (n) -> { currentObject.setEdgeBlockSideloadingExtensions(n.getBooleanValue()); });
            this.put("edgeBlockTabPreloading", (n) -> { currentObject.setEdgeBlockTabPreloading(n.getBooleanValue()); });
            this.put("edgeBlockWebContentOnNewTabPage", (n) -> { currentObject.setEdgeBlockWebContentOnNewTabPage(n.getBooleanValue()); });
            this.put("edgeClearBrowsingDataOnExit", (n) -> { currentObject.setEdgeClearBrowsingDataOnExit(n.getBooleanValue()); });
            this.put("edgeCookiePolicy", (n) -> { currentObject.setEdgeCookiePolicy(n.getEnumValue(EdgeCookiePolicy.class)); });
            this.put("edgeDisableFirstRunPage", (n) -> { currentObject.setEdgeDisableFirstRunPage(n.getBooleanValue()); });
            this.put("edgeEnterpriseModeSiteListLocation", (n) -> { currentObject.setEdgeEnterpriseModeSiteListLocation(n.getStringValue()); });
            this.put("edgeFavoritesBarVisibility", (n) -> { currentObject.setEdgeFavoritesBarVisibility(n.getEnumValue(VisibilitySetting.class)); });
            this.put("edgeFavoritesListLocation", (n) -> { currentObject.setEdgeFavoritesListLocation(n.getStringValue()); });
            this.put("edgeFirstRunUrl", (n) -> { currentObject.setEdgeFirstRunUrl(n.getStringValue()); });
            this.put("edgeHomeButtonConfiguration", (n) -> { currentObject.setEdgeHomeButtonConfiguration(n.getObjectValue(EdgeHomeButtonConfiguration::createFromDiscriminatorValue)); });
            this.put("edgeHomeButtonConfigurationEnabled", (n) -> { currentObject.setEdgeHomeButtonConfigurationEnabled(n.getBooleanValue()); });
            this.put("edgeHomepageUrls", (n) -> { currentObject.setEdgeHomepageUrls(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("edgeKioskModeRestriction", (n) -> { currentObject.setEdgeKioskModeRestriction(n.getEnumValue(EdgeKioskModeRestrictionType.class)); });
            this.put("edgeKioskResetAfterIdleTimeInMinutes", (n) -> { currentObject.setEdgeKioskResetAfterIdleTimeInMinutes(n.getIntegerValue()); });
            this.put("edgeNewTabPageURL", (n) -> { currentObject.setEdgeNewTabPageURL(n.getStringValue()); });
            this.put("edgeOpensWith", (n) -> { currentObject.setEdgeOpensWith(n.getEnumValue(EdgeOpenOptions.class)); });
            this.put("edgePreventCertificateErrorOverride", (n) -> { currentObject.setEdgePreventCertificateErrorOverride(n.getBooleanValue()); });
            this.put("edgeRequiredExtensionPackageFamilyNames", (n) -> { currentObject.setEdgeRequiredExtensionPackageFamilyNames(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("edgeRequireSmartScreen", (n) -> { currentObject.setEdgeRequireSmartScreen(n.getBooleanValue()); });
            this.put("edgeSearchEngine", (n) -> { currentObject.setEdgeSearchEngine(n.getObjectValue(EdgeSearchEngineBase::createFromDiscriminatorValue)); });
            this.put("edgeSendIntranetTrafficToInternetExplorer", (n) -> { currentObject.setEdgeSendIntranetTrafficToInternetExplorer(n.getBooleanValue()); });
            this.put("edgeShowMessageWhenOpeningInternetExplorerSites", (n) -> { currentObject.setEdgeShowMessageWhenOpeningInternetExplorerSites(n.getEnumValue(InternetExplorerMessageSetting.class)); });
            this.put("edgeSyncFavoritesWithInternetExplorer", (n) -> { currentObject.setEdgeSyncFavoritesWithInternetExplorer(n.getBooleanValue()); });
            this.put("edgeTelemetryForMicrosoft365Analytics", (n) -> { currentObject.setEdgeTelemetryForMicrosoft365Analytics(n.getEnumValue(EdgeTelemetryMode.class)); });
            this.put("enableAutomaticRedeployment", (n) -> { currentObject.setEnableAutomaticRedeployment(n.getBooleanValue()); });
            this.put("energySaverOnBatteryThresholdPercentage", (n) -> { currentObject.setEnergySaverOnBatteryThresholdPercentage(n.getIntegerValue()); });
            this.put("energySaverPluggedInThresholdPercentage", (n) -> { currentObject.setEnergySaverPluggedInThresholdPercentage(n.getIntegerValue()); });
            this.put("enterpriseCloudPrintDiscoveryEndPoint", (n) -> { currentObject.setEnterpriseCloudPrintDiscoveryEndPoint(n.getStringValue()); });
            this.put("enterpriseCloudPrintDiscoveryMaxLimit", (n) -> { currentObject.setEnterpriseCloudPrintDiscoveryMaxLimit(n.getIntegerValue()); });
            this.put("enterpriseCloudPrintMopriaDiscoveryResourceIdentifier", (n) -> { currentObject.setEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier(n.getStringValue()); });
            this.put("enterpriseCloudPrintOAuthAuthority", (n) -> { currentObject.setEnterpriseCloudPrintOAuthAuthority(n.getStringValue()); });
            this.put("enterpriseCloudPrintOAuthClientIdentifier", (n) -> { currentObject.setEnterpriseCloudPrintOAuthClientIdentifier(n.getStringValue()); });
            this.put("enterpriseCloudPrintResourceIdentifier", (n) -> { currentObject.setEnterpriseCloudPrintResourceIdentifier(n.getStringValue()); });
            this.put("experienceBlockDeviceDiscovery", (n) -> { currentObject.setExperienceBlockDeviceDiscovery(n.getBooleanValue()); });
            this.put("experienceBlockErrorDialogWhenNoSIM", (n) -> { currentObject.setExperienceBlockErrorDialogWhenNoSIM(n.getBooleanValue()); });
            this.put("experienceBlockTaskSwitcher", (n) -> { currentObject.setExperienceBlockTaskSwitcher(n.getBooleanValue()); });
            this.put("experienceDoNotSyncBrowserSettings", (n) -> { currentObject.setExperienceDoNotSyncBrowserSettings(n.getEnumValue(BrowserSyncSetting.class)); });
            this.put("findMyFiles", (n) -> { currentObject.setFindMyFiles(n.getEnumValue(Enablement.class)); });
            this.put("gameDvrBlocked", (n) -> { currentObject.setGameDvrBlocked(n.getBooleanValue()); });
            this.put("inkWorkspaceAccess", (n) -> { currentObject.setInkWorkspaceAccess(n.getEnumValue(InkAccessSetting.class)); });
            this.put("inkWorkspaceAccessState", (n) -> { currentObject.setInkWorkspaceAccessState(n.getEnumValue(StateManagementSetting.class)); });
            this.put("inkWorkspaceBlockSuggestedApps", (n) -> { currentObject.setInkWorkspaceBlockSuggestedApps(n.getBooleanValue()); });
            this.put("internetSharingBlocked", (n) -> { currentObject.setInternetSharingBlocked(n.getBooleanValue()); });
            this.put("locationServicesBlocked", (n) -> { currentObject.setLocationServicesBlocked(n.getBooleanValue()); });
            this.put("lockScreenActivateAppsWithVoice", (n) -> { currentObject.setLockScreenActivateAppsWithVoice(n.getEnumValue(Enablement.class)); });
            this.put("lockScreenAllowTimeoutConfiguration", (n) -> { currentObject.setLockScreenAllowTimeoutConfiguration(n.getBooleanValue()); });
            this.put("lockScreenBlockActionCenterNotifications", (n) -> { currentObject.setLockScreenBlockActionCenterNotifications(n.getBooleanValue()); });
            this.put("lockScreenBlockCortana", (n) -> { currentObject.setLockScreenBlockCortana(n.getBooleanValue()); });
            this.put("lockScreenBlockToastNotifications", (n) -> { currentObject.setLockScreenBlockToastNotifications(n.getBooleanValue()); });
            this.put("lockScreenTimeoutInSeconds", (n) -> { currentObject.setLockScreenTimeoutInSeconds(n.getIntegerValue()); });
            this.put("logonBlockFastUserSwitching", (n) -> { currentObject.setLogonBlockFastUserSwitching(n.getBooleanValue()); });
            this.put("messagingBlockMMS", (n) -> { currentObject.setMessagingBlockMMS(n.getBooleanValue()); });
            this.put("messagingBlockRichCommunicationServices", (n) -> { currentObject.setMessagingBlockRichCommunicationServices(n.getBooleanValue()); });
            this.put("messagingBlockSync", (n) -> { currentObject.setMessagingBlockSync(n.getBooleanValue()); });
            this.put("microsoftAccountBlocked", (n) -> { currentObject.setMicrosoftAccountBlocked(n.getBooleanValue()); });
            this.put("microsoftAccountBlockSettingsSync", (n) -> { currentObject.setMicrosoftAccountBlockSettingsSync(n.getBooleanValue()); });
            this.put("microsoftAccountSignInAssistantSettings", (n) -> { currentObject.setMicrosoftAccountSignInAssistantSettings(n.getEnumValue(SignInAssistantOptions.class)); });
            this.put("networkProxyApplySettingsDeviceWide", (n) -> { currentObject.setNetworkProxyApplySettingsDeviceWide(n.getBooleanValue()); });
            this.put("networkProxyAutomaticConfigurationUrl", (n) -> { currentObject.setNetworkProxyAutomaticConfigurationUrl(n.getStringValue()); });
            this.put("networkProxyDisableAutoDetect", (n) -> { currentObject.setNetworkProxyDisableAutoDetect(n.getBooleanValue()); });
            this.put("networkProxyServer", (n) -> { currentObject.setNetworkProxyServer(n.getObjectValue(Windows10NetworkProxyServer::createFromDiscriminatorValue)); });
            this.put("nfcBlocked", (n) -> { currentObject.setNfcBlocked(n.getBooleanValue()); });
            this.put("oneDriveDisableFileSync", (n) -> { currentObject.setOneDriveDisableFileSync(n.getBooleanValue()); });
            this.put("passwordBlockSimple", (n) -> { currentObject.setPasswordBlockSimple(n.getBooleanValue()); });
            this.put("passwordExpirationDays", (n) -> { currentObject.setPasswordExpirationDays(n.getIntegerValue()); });
            this.put("passwordMinimumAgeInDays", (n) -> { currentObject.setPasswordMinimumAgeInDays(n.getIntegerValue()); });
            this.put("passwordMinimumCharacterSetCount", (n) -> { currentObject.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
            this.put("passwordMinimumLength", (n) -> { currentObject.setPasswordMinimumLength(n.getIntegerValue()); });
            this.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { currentObject.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
            this.put("passwordPreviousPasswordBlockCount", (n) -> { currentObject.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
            this.put("passwordRequired", (n) -> { currentObject.setPasswordRequired(n.getBooleanValue()); });
            this.put("passwordRequiredType", (n) -> { currentObject.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
            this.put("passwordRequireWhenResumeFromIdleState", (n) -> { currentObject.setPasswordRequireWhenResumeFromIdleState(n.getBooleanValue()); });
            this.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { currentObject.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
            this.put("personalizationDesktopImageUrl", (n) -> { currentObject.setPersonalizationDesktopImageUrl(n.getStringValue()); });
            this.put("personalizationLockScreenImageUrl", (n) -> { currentObject.setPersonalizationLockScreenImageUrl(n.getStringValue()); });
            this.put("powerButtonActionOnBattery", (n) -> { currentObject.setPowerButtonActionOnBattery(n.getEnumValue(PowerActionType.class)); });
            this.put("powerButtonActionPluggedIn", (n) -> { currentObject.setPowerButtonActionPluggedIn(n.getEnumValue(PowerActionType.class)); });
            this.put("powerHybridSleepOnBattery", (n) -> { currentObject.setPowerHybridSleepOnBattery(n.getEnumValue(Enablement.class)); });
            this.put("powerHybridSleepPluggedIn", (n) -> { currentObject.setPowerHybridSleepPluggedIn(n.getEnumValue(Enablement.class)); });
            this.put("powerLidCloseActionOnBattery", (n) -> { currentObject.setPowerLidCloseActionOnBattery(n.getEnumValue(PowerActionType.class)); });
            this.put("powerLidCloseActionPluggedIn", (n) -> { currentObject.setPowerLidCloseActionPluggedIn(n.getEnumValue(PowerActionType.class)); });
            this.put("powerSleepButtonActionOnBattery", (n) -> { currentObject.setPowerSleepButtonActionOnBattery(n.getEnumValue(PowerActionType.class)); });
            this.put("powerSleepButtonActionPluggedIn", (n) -> { currentObject.setPowerSleepButtonActionPluggedIn(n.getEnumValue(PowerActionType.class)); });
            this.put("printerBlockAddition", (n) -> { currentObject.setPrinterBlockAddition(n.getBooleanValue()); });
            this.put("printerDefaultName", (n) -> { currentObject.setPrinterDefaultName(n.getStringValue()); });
            this.put("printerNames", (n) -> { currentObject.setPrinterNames(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("privacyAccessControls", (n) -> { currentObject.setPrivacyAccessControls(n.getCollectionOfObjectValues(WindowsPrivacyDataAccessControlItem::createFromDiscriminatorValue)); });
            this.put("privacyAdvertisingId", (n) -> { currentObject.setPrivacyAdvertisingId(n.getEnumValue(StateManagementSetting.class)); });
            this.put("privacyAutoAcceptPairingAndConsentPrompts", (n) -> { currentObject.setPrivacyAutoAcceptPairingAndConsentPrompts(n.getBooleanValue()); });
            this.put("privacyBlockActivityFeed", (n) -> { currentObject.setPrivacyBlockActivityFeed(n.getBooleanValue()); });
            this.put("privacyBlockInputPersonalization", (n) -> { currentObject.setPrivacyBlockInputPersonalization(n.getBooleanValue()); });
            this.put("privacyBlockPublishUserActivities", (n) -> { currentObject.setPrivacyBlockPublishUserActivities(n.getBooleanValue()); });
            this.put("privacyDisableLaunchExperience", (n) -> { currentObject.setPrivacyDisableLaunchExperience(n.getBooleanValue()); });
            this.put("resetProtectionModeBlocked", (n) -> { currentObject.setResetProtectionModeBlocked(n.getBooleanValue()); });
            this.put("safeSearchFilter", (n) -> { currentObject.setSafeSearchFilter(n.getEnumValue(SafeSearchFilterType.class)); });
            this.put("screenCaptureBlocked", (n) -> { currentObject.setScreenCaptureBlocked(n.getBooleanValue()); });
            this.put("searchBlockDiacritics", (n) -> { currentObject.setSearchBlockDiacritics(n.getBooleanValue()); });
            this.put("searchBlockWebResults", (n) -> { currentObject.setSearchBlockWebResults(n.getBooleanValue()); });
            this.put("searchDisableAutoLanguageDetection", (n) -> { currentObject.setSearchDisableAutoLanguageDetection(n.getBooleanValue()); });
            this.put("searchDisableIndexerBackoff", (n) -> { currentObject.setSearchDisableIndexerBackoff(n.getBooleanValue()); });
            this.put("searchDisableIndexingEncryptedItems", (n) -> { currentObject.setSearchDisableIndexingEncryptedItems(n.getBooleanValue()); });
            this.put("searchDisableIndexingRemovableDrive", (n) -> { currentObject.setSearchDisableIndexingRemovableDrive(n.getBooleanValue()); });
            this.put("searchDisableLocation", (n) -> { currentObject.setSearchDisableLocation(n.getBooleanValue()); });
            this.put("searchDisableUseLocation", (n) -> { currentObject.setSearchDisableUseLocation(n.getBooleanValue()); });
            this.put("searchEnableAutomaticIndexSizeManangement", (n) -> { currentObject.setSearchEnableAutomaticIndexSizeManangement(n.getBooleanValue()); });
            this.put("searchEnableRemoteQueries", (n) -> { currentObject.setSearchEnableRemoteQueries(n.getBooleanValue()); });
            this.put("securityBlockAzureADJoinedDevicesAutoEncryption", (n) -> { currentObject.setSecurityBlockAzureADJoinedDevicesAutoEncryption(n.getBooleanValue()); });
            this.put("settingsBlockAccountsPage", (n) -> { currentObject.setSettingsBlockAccountsPage(n.getBooleanValue()); });
            this.put("settingsBlockAddProvisioningPackage", (n) -> { currentObject.setSettingsBlockAddProvisioningPackage(n.getBooleanValue()); });
            this.put("settingsBlockAppsPage", (n) -> { currentObject.setSettingsBlockAppsPage(n.getBooleanValue()); });
            this.put("settingsBlockChangeLanguage", (n) -> { currentObject.setSettingsBlockChangeLanguage(n.getBooleanValue()); });
            this.put("settingsBlockChangePowerSleep", (n) -> { currentObject.setSettingsBlockChangePowerSleep(n.getBooleanValue()); });
            this.put("settingsBlockChangeRegion", (n) -> { currentObject.setSettingsBlockChangeRegion(n.getBooleanValue()); });
            this.put("settingsBlockChangeSystemTime", (n) -> { currentObject.setSettingsBlockChangeSystemTime(n.getBooleanValue()); });
            this.put("settingsBlockDevicesPage", (n) -> { currentObject.setSettingsBlockDevicesPage(n.getBooleanValue()); });
            this.put("settingsBlockEaseOfAccessPage", (n) -> { currentObject.setSettingsBlockEaseOfAccessPage(n.getBooleanValue()); });
            this.put("settingsBlockEditDeviceName", (n) -> { currentObject.setSettingsBlockEditDeviceName(n.getBooleanValue()); });
            this.put("settingsBlockGamingPage", (n) -> { currentObject.setSettingsBlockGamingPage(n.getBooleanValue()); });
            this.put("settingsBlockNetworkInternetPage", (n) -> { currentObject.setSettingsBlockNetworkInternetPage(n.getBooleanValue()); });
            this.put("settingsBlockPersonalizationPage", (n) -> { currentObject.setSettingsBlockPersonalizationPage(n.getBooleanValue()); });
            this.put("settingsBlockPrivacyPage", (n) -> { currentObject.setSettingsBlockPrivacyPage(n.getBooleanValue()); });
            this.put("settingsBlockRemoveProvisioningPackage", (n) -> { currentObject.setSettingsBlockRemoveProvisioningPackage(n.getBooleanValue()); });
            this.put("settingsBlockSettingsApp", (n) -> { currentObject.setSettingsBlockSettingsApp(n.getBooleanValue()); });
            this.put("settingsBlockSystemPage", (n) -> { currentObject.setSettingsBlockSystemPage(n.getBooleanValue()); });
            this.put("settingsBlockTimeLanguagePage", (n) -> { currentObject.setSettingsBlockTimeLanguagePage(n.getBooleanValue()); });
            this.put("settingsBlockUpdateSecurityPage", (n) -> { currentObject.setSettingsBlockUpdateSecurityPage(n.getBooleanValue()); });
            this.put("sharedUserAppDataAllowed", (n) -> { currentObject.setSharedUserAppDataAllowed(n.getBooleanValue()); });
            this.put("smartScreenAppInstallControl", (n) -> { currentObject.setSmartScreenAppInstallControl(n.getEnumValue(AppInstallControlType.class)); });
            this.put("smartScreenBlockPromptOverride", (n) -> { currentObject.setSmartScreenBlockPromptOverride(n.getBooleanValue()); });
            this.put("smartScreenBlockPromptOverrideForFiles", (n) -> { currentObject.setSmartScreenBlockPromptOverrideForFiles(n.getBooleanValue()); });
            this.put("smartScreenEnableAppInstallControl", (n) -> { currentObject.setSmartScreenEnableAppInstallControl(n.getBooleanValue()); });
            this.put("startBlockUnpinningAppsFromTaskbar", (n) -> { currentObject.setStartBlockUnpinningAppsFromTaskbar(n.getBooleanValue()); });
            this.put("startMenuAppListVisibility", (n) -> { currentObject.setStartMenuAppListVisibility(n.getEnumValue(WindowsStartMenuAppListVisibilityType.class)); });
            this.put("startMenuHideChangeAccountSettings", (n) -> { currentObject.setStartMenuHideChangeAccountSettings(n.getBooleanValue()); });
            this.put("startMenuHideFrequentlyUsedApps", (n) -> { currentObject.setStartMenuHideFrequentlyUsedApps(n.getBooleanValue()); });
            this.put("startMenuHideHibernate", (n) -> { currentObject.setStartMenuHideHibernate(n.getBooleanValue()); });
            this.put("startMenuHideLock", (n) -> { currentObject.setStartMenuHideLock(n.getBooleanValue()); });
            this.put("startMenuHidePowerButton", (n) -> { currentObject.setStartMenuHidePowerButton(n.getBooleanValue()); });
            this.put("startMenuHideRecentJumpLists", (n) -> { currentObject.setStartMenuHideRecentJumpLists(n.getBooleanValue()); });
            this.put("startMenuHideRecentlyAddedApps", (n) -> { currentObject.setStartMenuHideRecentlyAddedApps(n.getBooleanValue()); });
            this.put("startMenuHideRestartOptions", (n) -> { currentObject.setStartMenuHideRestartOptions(n.getBooleanValue()); });
            this.put("startMenuHideShutDown", (n) -> { currentObject.setStartMenuHideShutDown(n.getBooleanValue()); });
            this.put("startMenuHideSignOut", (n) -> { currentObject.setStartMenuHideSignOut(n.getBooleanValue()); });
            this.put("startMenuHideSleep", (n) -> { currentObject.setStartMenuHideSleep(n.getBooleanValue()); });
            this.put("startMenuHideSwitchAccount", (n) -> { currentObject.setStartMenuHideSwitchAccount(n.getBooleanValue()); });
            this.put("startMenuHideUserTile", (n) -> { currentObject.setStartMenuHideUserTile(n.getBooleanValue()); });
            this.put("startMenuLayoutEdgeAssetsXml", (n) -> { currentObject.setStartMenuLayoutEdgeAssetsXml(n.getByteArrayValue()); });
            this.put("startMenuLayoutXml", (n) -> { currentObject.setStartMenuLayoutXml(n.getByteArrayValue()); });
            this.put("startMenuMode", (n) -> { currentObject.setStartMenuMode(n.getEnumValue(WindowsStartMenuModeType.class)); });
            this.put("startMenuPinnedFolderDocuments", (n) -> { currentObject.setStartMenuPinnedFolderDocuments(n.getEnumValue(VisibilitySetting.class)); });
            this.put("startMenuPinnedFolderDownloads", (n) -> { currentObject.setStartMenuPinnedFolderDownloads(n.getEnumValue(VisibilitySetting.class)); });
            this.put("startMenuPinnedFolderFileExplorer", (n) -> { currentObject.setStartMenuPinnedFolderFileExplorer(n.getEnumValue(VisibilitySetting.class)); });
            this.put("startMenuPinnedFolderHomeGroup", (n) -> { currentObject.setStartMenuPinnedFolderHomeGroup(n.getEnumValue(VisibilitySetting.class)); });
            this.put("startMenuPinnedFolderMusic", (n) -> { currentObject.setStartMenuPinnedFolderMusic(n.getEnumValue(VisibilitySetting.class)); });
            this.put("startMenuPinnedFolderNetwork", (n) -> { currentObject.setStartMenuPinnedFolderNetwork(n.getEnumValue(VisibilitySetting.class)); });
            this.put("startMenuPinnedFolderPersonalFolder", (n) -> { currentObject.setStartMenuPinnedFolderPersonalFolder(n.getEnumValue(VisibilitySetting.class)); });
            this.put("startMenuPinnedFolderPictures", (n) -> { currentObject.setStartMenuPinnedFolderPictures(n.getEnumValue(VisibilitySetting.class)); });
            this.put("startMenuPinnedFolderSettings", (n) -> { currentObject.setStartMenuPinnedFolderSettings(n.getEnumValue(VisibilitySetting.class)); });
            this.put("startMenuPinnedFolderVideos", (n) -> { currentObject.setStartMenuPinnedFolderVideos(n.getEnumValue(VisibilitySetting.class)); });
            this.put("storageBlockRemovableStorage", (n) -> { currentObject.setStorageBlockRemovableStorage(n.getBooleanValue()); });
            this.put("storageRequireMobileDeviceEncryption", (n) -> { currentObject.setStorageRequireMobileDeviceEncryption(n.getBooleanValue()); });
            this.put("storageRestrictAppDataToSystemVolume", (n) -> { currentObject.setStorageRestrictAppDataToSystemVolume(n.getBooleanValue()); });
            this.put("storageRestrictAppInstallToSystemVolume", (n) -> { currentObject.setStorageRestrictAppInstallToSystemVolume(n.getBooleanValue()); });
            this.put("systemTelemetryProxyServer", (n) -> { currentObject.setSystemTelemetryProxyServer(n.getStringValue()); });
            this.put("taskManagerBlockEndTask", (n) -> { currentObject.setTaskManagerBlockEndTask(n.getBooleanValue()); });
            this.put("tenantLockdownRequireNetworkDuringOutOfBoxExperience", (n) -> { currentObject.setTenantLockdownRequireNetworkDuringOutOfBoxExperience(n.getBooleanValue()); });
            this.put("uninstallBuiltInApps", (n) -> { currentObject.setUninstallBuiltInApps(n.getBooleanValue()); });
            this.put("usbBlocked", (n) -> { currentObject.setUsbBlocked(n.getBooleanValue()); });
            this.put("voiceRecordingBlocked", (n) -> { currentObject.setVoiceRecordingBlocked(n.getBooleanValue()); });
            this.put("webRtcBlockLocalhostIpAddress", (n) -> { currentObject.setWebRtcBlockLocalhostIpAddress(n.getBooleanValue()); });
            this.put("wiFiBlockAutomaticConnectHotspots", (n) -> { currentObject.setWiFiBlockAutomaticConnectHotspots(n.getBooleanValue()); });
            this.put("wiFiBlocked", (n) -> { currentObject.setWiFiBlocked(n.getBooleanValue()); });
            this.put("wiFiBlockManualConfiguration", (n) -> { currentObject.setWiFiBlockManualConfiguration(n.getBooleanValue()); });
            this.put("wiFiScanInterval", (n) -> { currentObject.setWiFiScanInterval(n.getIntegerValue()); });
            this.put("windows10AppsForceUpdateSchedule", (n) -> { currentObject.setWindows10AppsForceUpdateSchedule(n.getObjectValue(Windows10AppsForceUpdateSchedule::createFromDiscriminatorValue)); });
            this.put("windowsSpotlightBlockConsumerSpecificFeatures", (n) -> { currentObject.setWindowsSpotlightBlockConsumerSpecificFeatures(n.getBooleanValue()); });
            this.put("windowsSpotlightBlocked", (n) -> { currentObject.setWindowsSpotlightBlocked(n.getBooleanValue()); });
            this.put("windowsSpotlightBlockOnActionCenter", (n) -> { currentObject.setWindowsSpotlightBlockOnActionCenter(n.getBooleanValue()); });
            this.put("windowsSpotlightBlockTailoredExperiences", (n) -> { currentObject.setWindowsSpotlightBlockTailoredExperiences(n.getBooleanValue()); });
            this.put("windowsSpotlightBlockThirdPartyNotifications", (n) -> { currentObject.setWindowsSpotlightBlockThirdPartyNotifications(n.getBooleanValue()); });
            this.put("windowsSpotlightBlockWelcomeExperience", (n) -> { currentObject.setWindowsSpotlightBlockWelcomeExperience(n.getBooleanValue()); });
            this.put("windowsSpotlightBlockWindowsTips", (n) -> { currentObject.setWindowsSpotlightBlockWindowsTips(n.getBooleanValue()); });
            this.put("windowsSpotlightConfigureOnLockScreen", (n) -> { currentObject.setWindowsSpotlightConfigureOnLockScreen(n.getEnumValue(WindowsSpotlightEnablementSettings.class)); });
            this.put("windowsStoreBlockAutoUpdate", (n) -> { currentObject.setWindowsStoreBlockAutoUpdate(n.getBooleanValue()); });
            this.put("windowsStoreBlocked", (n) -> { currentObject.setWindowsStoreBlocked(n.getBooleanValue()); });
            this.put("windowsStoreEnablePrivateStoreOnly", (n) -> { currentObject.setWindowsStoreEnablePrivateStoreOnly(n.getBooleanValue()); });
            this.put("wirelessDisplayBlockProjectionToThisDevice", (n) -> { currentObject.setWirelessDisplayBlockProjectionToThisDevice(n.getBooleanValue()); });
            this.put("wirelessDisplayBlockUserInputFromReceiver", (n) -> { currentObject.setWirelessDisplayBlockUserInputFromReceiver(n.getBooleanValue()); });
            this.put("wirelessDisplayRequirePinForPairing", (n) -> { currentObject.setWirelessDisplayRequirePinForPairing(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the findMyFiles property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getFindMyFiles() {
        return this._findMyFiles;
    }
    /**
     * Gets the gameDvrBlocked property value. Indicates whether or not to block DVR and broadcasting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGameDvrBlocked() {
        return this._gameDvrBlocked;
    }
    /**
     * Gets the inkWorkspaceAccess property value. Values for the InkWorkspaceAccess setting.
     * @return a inkAccessSetting
     */
    @javax.annotation.Nullable
    public InkAccessSetting getInkWorkspaceAccess() {
        return this._inkWorkspaceAccess;
    }
    /**
     * Gets the inkWorkspaceAccessState property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getInkWorkspaceAccessState() {
        return this._inkWorkspaceAccessState;
    }
    /**
     * Gets the inkWorkspaceBlockSuggestedApps property value. Specify whether to show recommended app suggestions in the ink workspace.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInkWorkspaceBlockSuggestedApps() {
        return this._inkWorkspaceBlockSuggestedApps;
    }
    /**
     * Gets the internetSharingBlocked property value. Indicates whether or not to Block the user from using internet sharing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInternetSharingBlocked() {
        return this._internetSharingBlocked;
    }
    /**
     * Gets the locationServicesBlocked property value. Indicates whether or not to Block the user from location services.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocationServicesBlocked() {
        return this._locationServicesBlocked;
    }
    /**
     * Gets the lockScreenActivateAppsWithVoice property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getLockScreenActivateAppsWithVoice() {
        return this._lockScreenActivateAppsWithVoice;
    }
    /**
     * Gets the lockScreenAllowTimeoutConfiguration property value. Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenAllowTimeoutConfiguration() {
        return this._lockScreenAllowTimeoutConfiguration;
    }
    /**
     * Gets the lockScreenBlockActionCenterNotifications property value. Indicates whether or not to block action center notifications over lock screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockActionCenterNotifications() {
        return this._lockScreenBlockActionCenterNotifications;
    }
    /**
     * Gets the lockScreenBlockCortana property value. Indicates whether or not the user can interact with Cortana using speech while the system is locked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockCortana() {
        return this._lockScreenBlockCortana;
    }
    /**
     * Gets the lockScreenBlockToastNotifications property value. Indicates whether to allow toast notifications above the device lock screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockToastNotifications() {
        return this._lockScreenBlockToastNotifications;
    }
    /**
     * Gets the lockScreenTimeoutInSeconds property value. Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLockScreenTimeoutInSeconds() {
        return this._lockScreenTimeoutInSeconds;
    }
    /**
     * Gets the logonBlockFastUserSwitching property value. Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLogonBlockFastUserSwitching() {
        return this._logonBlockFastUserSwitching;
    }
    /**
     * Gets the messagingBlockMMS property value. Indicates whether or not to block the MMS send/receive functionality on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMessagingBlockMMS() {
        return this._messagingBlockMMS;
    }
    /**
     * Gets the messagingBlockRichCommunicationServices property value. Indicates whether or not to block the RCS send/receive functionality on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMessagingBlockRichCommunicationServices() {
        return this._messagingBlockRichCommunicationServices;
    }
    /**
     * Gets the messagingBlockSync property value. Indicates whether or not to block text message back up and restore and Messaging Everywhere.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMessagingBlockSync() {
        return this._messagingBlockSync;
    }
    /**
     * Gets the microsoftAccountBlocked property value. Indicates whether or not to Block a Microsoft account.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftAccountBlocked() {
        return this._microsoftAccountBlocked;
    }
    /**
     * Gets the microsoftAccountBlockSettingsSync property value. Indicates whether or not to Block Microsoft account settings sync.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftAccountBlockSettingsSync() {
        return this._microsoftAccountBlockSettingsSync;
    }
    /**
     * Gets the microsoftAccountSignInAssistantSettings property value. Values for the SignInAssistantSettings.
     * @return a signInAssistantOptions
     */
    @javax.annotation.Nullable
    public SignInAssistantOptions getMicrosoftAccountSignInAssistantSettings() {
        return this._microsoftAccountSignInAssistantSettings;
    }
    /**
     * Gets the networkProxyApplySettingsDeviceWide property value. If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account that’s enrolled into MDM.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNetworkProxyApplySettingsDeviceWide() {
        return this._networkProxyApplySettingsDeviceWide;
    }
    /**
     * Gets the networkProxyAutomaticConfigurationUrl property value. Address to the proxy auto-config (PAC) script you want to use.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkProxyAutomaticConfigurationUrl() {
        return this._networkProxyAutomaticConfigurationUrl;
    }
    /**
     * Gets the networkProxyDisableAutoDetect property value. Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNetworkProxyDisableAutoDetect() {
        return this._networkProxyDisableAutoDetect;
    }
    /**
     * Gets the networkProxyServer property value. Specifies manual proxy server settings.
     * @return a windows10NetworkProxyServer
     */
    @javax.annotation.Nullable
    public Windows10NetworkProxyServer getNetworkProxyServer() {
        return this._networkProxyServer;
    }
    /**
     * Gets the nfcBlocked property value. Indicates whether or not to Block the user from using near field communication.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNfcBlocked() {
        return this._nfcBlocked;
    }
    /**
     * Gets the oneDriveDisableFileSync property value. Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOneDriveDisableFileSync() {
        return this._oneDriveDisableFileSync;
    }
    /**
     * Gets the passwordBlockSimple property value. Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this._passwordBlockSimple;
    }
    /**
     * Gets the passwordExpirationDays property value. The password expiration in days. Valid values 0 to 730
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this._passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumAgeInDays property value. This security setting determines the period of time (in days) that a password must be used before the user can change it. Valid values 0 to 998
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumAgeInDays() {
        return this._passwordMinimumAgeInDays;
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this._passwordMinimumCharacterSetCount;
    }
    /**
     * Gets the passwordMinimumLength property value. The minimum password length. Valid values 4 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this._passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this._passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent reuse of. Valid values 0 to 50
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this._passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequired property value. Indicates whether or not to require the user to have a password.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this._passwordRequired;
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a requiredPasswordType
     */
    @javax.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this._passwordRequiredType;
    }
    /**
     * Gets the passwordRequireWhenResumeFromIdleState property value. Indicates whether or not to require a password upon resuming from an idle state.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequireWhenResumeFromIdleState() {
        return this._passwordRequireWhenResumeFromIdleState;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset. Valid values 0 to 999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this._passwordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the personalizationDesktopImageUrl property value. A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPersonalizationDesktopImageUrl() {
        return this._personalizationDesktopImageUrl;
    }
    /**
     * Gets the personalizationLockScreenImageUrl property value. A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a file Url to a local image on the file system that needs to be used as the Lock Screen Image.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPersonalizationLockScreenImageUrl() {
        return this._personalizationLockScreenImageUrl;
    }
    /**
     * Gets the powerButtonActionOnBattery property value. Power action types
     * @return a powerActionType
     */
    @javax.annotation.Nullable
    public PowerActionType getPowerButtonActionOnBattery() {
        return this._powerButtonActionOnBattery;
    }
    /**
     * Gets the powerButtonActionPluggedIn property value. Power action types
     * @return a powerActionType
     */
    @javax.annotation.Nullable
    public PowerActionType getPowerButtonActionPluggedIn() {
        return this._powerButtonActionPluggedIn;
    }
    /**
     * Gets the powerHybridSleepOnBattery property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getPowerHybridSleepOnBattery() {
        return this._powerHybridSleepOnBattery;
    }
    /**
     * Gets the powerHybridSleepPluggedIn property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getPowerHybridSleepPluggedIn() {
        return this._powerHybridSleepPluggedIn;
    }
    /**
     * Gets the powerLidCloseActionOnBattery property value. Power action types
     * @return a powerActionType
     */
    @javax.annotation.Nullable
    public PowerActionType getPowerLidCloseActionOnBattery() {
        return this._powerLidCloseActionOnBattery;
    }
    /**
     * Gets the powerLidCloseActionPluggedIn property value. Power action types
     * @return a powerActionType
     */
    @javax.annotation.Nullable
    public PowerActionType getPowerLidCloseActionPluggedIn() {
        return this._powerLidCloseActionPluggedIn;
    }
    /**
     * Gets the powerSleepButtonActionOnBattery property value. Power action types
     * @return a powerActionType
     */
    @javax.annotation.Nullable
    public PowerActionType getPowerSleepButtonActionOnBattery() {
        return this._powerSleepButtonActionOnBattery;
    }
    /**
     * Gets the powerSleepButtonActionPluggedIn property value. Power action types
     * @return a powerActionType
     */
    @javax.annotation.Nullable
    public PowerActionType getPowerSleepButtonActionPluggedIn() {
        return this._powerSleepButtonActionPluggedIn;
    }
    /**
     * Gets the printerBlockAddition property value. Prevent user installation of additional printers from printers settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrinterBlockAddition() {
        return this._printerBlockAddition;
    }
    /**
     * Gets the printerDefaultName property value. Name (network host name) of an installed printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrinterDefaultName() {
        return this._printerDefaultName;
    }
    /**
     * Gets the printerNames property value. Automatically provision printers based on their names (network host names).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPrinterNames() {
        return this._printerNames;
    }
    /**
     * Gets the privacyAccessControls property value. Indicates a list of applications with their access control levels over privacy data categories, and/or the default access levels per category. This collection can contain a maximum of 500 elements.
     * @return a windowsPrivacyDataAccessControlItem
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsPrivacyDataAccessControlItem> getPrivacyAccessControls() {
        return this._privacyAccessControls;
    }
    /**
     * Gets the privacyAdvertisingId property value. State Management Setting.
     * @return a stateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getPrivacyAdvertisingId() {
        return this._privacyAdvertisingId;
    }
    /**
     * Gets the privacyAutoAcceptPairingAndConsentPrompts property value. Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyAutoAcceptPairingAndConsentPrompts() {
        return this._privacyAutoAcceptPairingAndConsentPrompts;
    }
    /**
     * Gets the privacyBlockActivityFeed property value. Blocks the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyBlockActivityFeed() {
        return this._privacyBlockActivityFeed;
    }
    /**
     * Gets the privacyBlockInputPersonalization property value. Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyBlockInputPersonalization() {
        return this._privacyBlockInputPersonalization;
    }
    /**
     * Gets the privacyBlockPublishUserActivities property value. Blocks the shared experiences/discovery of recently used resources in task switcher etc.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyBlockPublishUserActivities() {
        return this._privacyBlockPublishUserActivities;
    }
    /**
     * Gets the privacyDisableLaunchExperience property value. This policy prevents the privacy experience from launching during user logon for new and upgraded users.​
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyDisableLaunchExperience() {
        return this._privacyDisableLaunchExperience;
    }
    /**
     * Gets the resetProtectionModeBlocked property value. Indicates whether or not to Block the user from reset protection mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getResetProtectionModeBlocked() {
        return this._resetProtectionModeBlocked;
    }
    /**
     * Gets the safeSearchFilter property value. Specifies what level of safe search (filtering adult content) is required
     * @return a safeSearchFilterType
     */
    @javax.annotation.Nullable
    public SafeSearchFilterType getSafeSearchFilter() {
        return this._safeSearchFilter;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to Block the user from taking Screenshots.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this._screenCaptureBlocked;
    }
    /**
     * Gets the searchBlockDiacritics property value. Specifies if search can use diacritics.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchBlockDiacritics() {
        return this._searchBlockDiacritics;
    }
    /**
     * Gets the searchBlockWebResults property value. Indicates whether or not to block the web search.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchBlockWebResults() {
        return this._searchBlockWebResults;
    }
    /**
     * Gets the searchDisableAutoLanguageDetection property value. Specifies whether to use automatic language detection when indexing content and properties.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableAutoLanguageDetection() {
        return this._searchDisableAutoLanguageDetection;
    }
    /**
     * Gets the searchDisableIndexerBackoff property value. Indicates whether or not to disable the search indexer backoff feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableIndexerBackoff() {
        return this._searchDisableIndexerBackoff;
    }
    /**
     * Gets the searchDisableIndexingEncryptedItems property value. Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableIndexingEncryptedItems() {
        return this._searchDisableIndexingEncryptedItems;
    }
    /**
     * Gets the searchDisableIndexingRemovableDrive property value. Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableIndexingRemovableDrive() {
        return this._searchDisableIndexingRemovableDrive;
    }
    /**
     * Gets the searchDisableLocation property value. Specifies if search can use location information.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableLocation() {
        return this._searchDisableLocation;
    }
    /**
     * Gets the searchDisableUseLocation property value. Specifies if search can use location information.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableUseLocation() {
        return this._searchDisableUseLocation;
    }
    /**
     * Gets the searchEnableAutomaticIndexSizeManangement property value. Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchEnableAutomaticIndexSizeManangement() {
        return this._searchEnableAutomaticIndexSizeManangement;
    }
    /**
     * Gets the searchEnableRemoteQueries property value. Indicates whether or not to block remote queries of this computer’s index.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchEnableRemoteQueries() {
        return this._searchEnableRemoteQueries;
    }
    /**
     * Gets the securityBlockAzureADJoinedDevicesAutoEncryption property value. Specify whether to allow automatic device encryption during OOBE when the device is Azure AD joined (desktop only).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityBlockAzureADJoinedDevicesAutoEncryption() {
        return this._securityBlockAzureADJoinedDevicesAutoEncryption;
    }
    /**
     * Gets the settingsBlockAccountsPage property value. Indicates whether or not to block access to Accounts in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockAccountsPage() {
        return this._settingsBlockAccountsPage;
    }
    /**
     * Gets the settingsBlockAddProvisioningPackage property value. Indicates whether or not to block the user from installing provisioning packages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockAddProvisioningPackage() {
        return this._settingsBlockAddProvisioningPackage;
    }
    /**
     * Gets the settingsBlockAppsPage property value. Indicates whether or not to block access to Apps in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockAppsPage() {
        return this._settingsBlockAppsPage;
    }
    /**
     * Gets the settingsBlockChangeLanguage property value. Indicates whether or not to block the user from changing the language settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangeLanguage() {
        return this._settingsBlockChangeLanguage;
    }
    /**
     * Gets the settingsBlockChangePowerSleep property value. Indicates whether or not to block the user from changing power and sleep settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangePowerSleep() {
        return this._settingsBlockChangePowerSleep;
    }
    /**
     * Gets the settingsBlockChangeRegion property value. Indicates whether or not to block the user from changing the region settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangeRegion() {
        return this._settingsBlockChangeRegion;
    }
    /**
     * Gets the settingsBlockChangeSystemTime property value. Indicates whether or not to block the user from changing date and time settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangeSystemTime() {
        return this._settingsBlockChangeSystemTime;
    }
    /**
     * Gets the settingsBlockDevicesPage property value. Indicates whether or not to block access to Devices in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockDevicesPage() {
        return this._settingsBlockDevicesPage;
    }
    /**
     * Gets the settingsBlockEaseOfAccessPage property value. Indicates whether or not to block access to Ease of Access in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockEaseOfAccessPage() {
        return this._settingsBlockEaseOfAccessPage;
    }
    /**
     * Gets the settingsBlockEditDeviceName property value. Indicates whether or not to block the user from editing the device name.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockEditDeviceName() {
        return this._settingsBlockEditDeviceName;
    }
    /**
     * Gets the settingsBlockGamingPage property value. Indicates whether or not to block access to Gaming in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockGamingPage() {
        return this._settingsBlockGamingPage;
    }
    /**
     * Gets the settingsBlockNetworkInternetPage property value. Indicates whether or not to block access to Network & Internet in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockNetworkInternetPage() {
        return this._settingsBlockNetworkInternetPage;
    }
    /**
     * Gets the settingsBlockPersonalizationPage property value. Indicates whether or not to block access to Personalization in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockPersonalizationPage() {
        return this._settingsBlockPersonalizationPage;
    }
    /**
     * Gets the settingsBlockPrivacyPage property value. Indicates whether or not to block access to Privacy in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockPrivacyPage() {
        return this._settingsBlockPrivacyPage;
    }
    /**
     * Gets the settingsBlockRemoveProvisioningPackage property value. Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockRemoveProvisioningPackage() {
        return this._settingsBlockRemoveProvisioningPackage;
    }
    /**
     * Gets the settingsBlockSettingsApp property value. Indicates whether or not to block access to Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockSettingsApp() {
        return this._settingsBlockSettingsApp;
    }
    /**
     * Gets the settingsBlockSystemPage property value. Indicates whether or not to block access to System in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockSystemPage() {
        return this._settingsBlockSystemPage;
    }
    /**
     * Gets the settingsBlockTimeLanguagePage property value. Indicates whether or not to block access to Time & Language in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockTimeLanguagePage() {
        return this._settingsBlockTimeLanguagePage;
    }
    /**
     * Gets the settingsBlockUpdateSecurityPage property value. Indicates whether or not to block access to Update & Security in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockUpdateSecurityPage() {
        return this._settingsBlockUpdateSecurityPage;
    }
    /**
     * Gets the sharedUserAppDataAllowed property value. Indicates whether or not to block multiple users of the same app to share data.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSharedUserAppDataAllowed() {
        return this._sharedUserAppDataAllowed;
    }
    /**
     * Gets the smartScreenAppInstallControl property value. App Install control Setting
     * @return a appInstallControlType
     */
    @javax.annotation.Nullable
    public AppInstallControlType getSmartScreenAppInstallControl() {
        return this._smartScreenAppInstallControl;
    }
    /**
     * Gets the smartScreenBlockPromptOverride property value. Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenBlockPromptOverride() {
        return this._smartScreenBlockPromptOverride;
    }
    /**
     * Gets the smartScreenBlockPromptOverrideForFiles property value. Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenBlockPromptOverrideForFiles() {
        return this._smartScreenBlockPromptOverrideForFiles;
    }
    /**
     * Gets the smartScreenEnableAppInstallControl property value. This property will be deprecated in July 2019 and will be replaced by property SmartScreenAppInstallControl. Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenEnableAppInstallControl() {
        return this._smartScreenEnableAppInstallControl;
    }
    /**
     * Gets the startBlockUnpinningAppsFromTaskbar property value. Indicates whether or not to block the user from unpinning apps from taskbar.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartBlockUnpinningAppsFromTaskbar() {
        return this._startBlockUnpinningAppsFromTaskbar;
    }
    /**
     * Gets the startMenuAppListVisibility property value. Type of start menu app list visibility.
     * @return a windowsStartMenuAppListVisibilityType
     */
    @javax.annotation.Nullable
    public WindowsStartMenuAppListVisibilityType getStartMenuAppListVisibility() {
        return this._startMenuAppListVisibility;
    }
    /**
     * Gets the startMenuHideChangeAccountSettings property value. Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideChangeAccountSettings() {
        return this._startMenuHideChangeAccountSettings;
    }
    /**
     * Gets the startMenuHideFrequentlyUsedApps property value. Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideFrequentlyUsedApps() {
        return this._startMenuHideFrequentlyUsedApps;
    }
    /**
     * Gets the startMenuHideHibernate property value. Enabling this policy hides hibernate from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideHibernate() {
        return this._startMenuHideHibernate;
    }
    /**
     * Gets the startMenuHideLock property value. Enabling this policy hides lock from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideLock() {
        return this._startMenuHideLock;
    }
    /**
     * Gets the startMenuHidePowerButton property value. Enabling this policy hides the power button from appearing in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHidePowerButton() {
        return this._startMenuHidePowerButton;
    }
    /**
     * Gets the startMenuHideRecentJumpLists property value. Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideRecentJumpLists() {
        return this._startMenuHideRecentJumpLists;
    }
    /**
     * Gets the startMenuHideRecentlyAddedApps property value. Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideRecentlyAddedApps() {
        return this._startMenuHideRecentlyAddedApps;
    }
    /**
     * Gets the startMenuHideRestartOptions property value. Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideRestartOptions() {
        return this._startMenuHideRestartOptions;
    }
    /**
     * Gets the startMenuHideShutDown property value. Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideShutDown() {
        return this._startMenuHideShutDown;
    }
    /**
     * Gets the startMenuHideSignOut property value. Enabling this policy hides sign out from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideSignOut() {
        return this._startMenuHideSignOut;
    }
    /**
     * Gets the startMenuHideSleep property value. Enabling this policy hides sleep from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideSleep() {
        return this._startMenuHideSleep;
    }
    /**
     * Gets the startMenuHideSwitchAccount property value. Enabling this policy hides switch account from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideSwitchAccount() {
        return this._startMenuHideSwitchAccount;
    }
    /**
     * Gets the startMenuHideUserTile property value. Enabling this policy hides the user tile from appearing in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideUserTile() {
        return this._startMenuHideUserTile;
    }
    /**
     * Gets the startMenuLayoutEdgeAssetsXml property value. This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getStartMenuLayoutEdgeAssetsXml() {
        return this._startMenuLayoutEdgeAssetsXml;
    }
    /**
     * Gets the startMenuLayoutXml property value. Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getStartMenuLayoutXml() {
        return this._startMenuLayoutXml;
    }
    /**
     * Gets the startMenuMode property value. Type of display modes for the start menu.
     * @return a windowsStartMenuModeType
     */
    @javax.annotation.Nullable
    public WindowsStartMenuModeType getStartMenuMode() {
        return this._startMenuMode;
    }
    /**
     * Gets the startMenuPinnedFolderDocuments property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderDocuments() {
        return this._startMenuPinnedFolderDocuments;
    }
    /**
     * Gets the startMenuPinnedFolderDownloads property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderDownloads() {
        return this._startMenuPinnedFolderDownloads;
    }
    /**
     * Gets the startMenuPinnedFolderFileExplorer property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderFileExplorer() {
        return this._startMenuPinnedFolderFileExplorer;
    }
    /**
     * Gets the startMenuPinnedFolderHomeGroup property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderHomeGroup() {
        return this._startMenuPinnedFolderHomeGroup;
    }
    /**
     * Gets the startMenuPinnedFolderMusic property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderMusic() {
        return this._startMenuPinnedFolderMusic;
    }
    /**
     * Gets the startMenuPinnedFolderNetwork property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderNetwork() {
        return this._startMenuPinnedFolderNetwork;
    }
    /**
     * Gets the startMenuPinnedFolderPersonalFolder property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderPersonalFolder() {
        return this._startMenuPinnedFolderPersonalFolder;
    }
    /**
     * Gets the startMenuPinnedFolderPictures property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderPictures() {
        return this._startMenuPinnedFolderPictures;
    }
    /**
     * Gets the startMenuPinnedFolderSettings property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderSettings() {
        return this._startMenuPinnedFolderSettings;
    }
    /**
     * Gets the startMenuPinnedFolderVideos property value. Generic visibility state.
     * @return a visibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderVideos() {
        return this._startMenuPinnedFolderVideos;
    }
    /**
     * Gets the storageBlockRemovableStorage property value. Indicates whether or not to Block the user from using removable storage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockRemovableStorage() {
        return this._storageBlockRemovableStorage;
    }
    /**
     * Gets the storageRequireMobileDeviceEncryption property value. Indicating whether or not to require encryption on a mobile device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRequireMobileDeviceEncryption() {
        return this._storageRequireMobileDeviceEncryption;
    }
    /**
     * Gets the storageRestrictAppDataToSystemVolume property value. Indicates whether application data is restricted to the system drive.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRestrictAppDataToSystemVolume() {
        return this._storageRestrictAppDataToSystemVolume;
    }
    /**
     * Gets the storageRestrictAppInstallToSystemVolume property value. Indicates whether the installation of applications is restricted to the system drive.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRestrictAppInstallToSystemVolume() {
        return this._storageRestrictAppInstallToSystemVolume;
    }
    /**
     * Gets the systemTelemetryProxyServer property value. Gets or sets the fully qualified domain name (FQDN) or IP address of a proxy server to forward Connected User Experiences and Telemetry requests.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSystemTelemetryProxyServer() {
        return this._systemTelemetryProxyServer;
    }
    /**
     * Gets the taskManagerBlockEndTask property value. Specify whether non-administrators can use Task Manager to end tasks.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTaskManagerBlockEndTask() {
        return this._taskManagerBlockEndTask;
    }
    /**
     * Gets the tenantLockdownRequireNetworkDuringOutOfBoxExperience property value. Whether the device is required to connect to the network.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTenantLockdownRequireNetworkDuringOutOfBoxExperience() {
        return this._tenantLockdownRequireNetworkDuringOutOfBoxExperience;
    }
    /**
     * Gets the uninstallBuiltInApps property value. Indicates whether or not to uninstall a fixed list of built-in Windows apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUninstallBuiltInApps() {
        return this._uninstallBuiltInApps;
    }
    /**
     * Gets the usbBlocked property value. Indicates whether or not to Block the user from USB connection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUsbBlocked() {
        return this._usbBlocked;
    }
    /**
     * Gets the voiceRecordingBlocked property value. Indicates whether or not to Block the user from voice recording.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVoiceRecordingBlocked() {
        return this._voiceRecordingBlocked;
    }
    /**
     * Gets the webRtcBlockLocalhostIpAddress property value. Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWebRtcBlockLocalhostIpAddress() {
        return this._webRtcBlockLocalhostIpAddress;
    }
    /**
     * Gets the wiFiBlockAutomaticConnectHotspots property value. Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiBlockAutomaticConnectHotspots() {
        return this._wiFiBlockAutomaticConnectHotspots;
    }
    /**
     * Gets the wiFiBlocked property value. Indicates whether or not to Block the user from using Wi-Fi.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiBlocked() {
        return this._wiFiBlocked;
    }
    /**
     * Gets the wiFiBlockManualConfiguration property value. Indicates whether or not to Block the user from using Wi-Fi manual configuration.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiBlockManualConfiguration() {
        return this._wiFiBlockManualConfiguration;
    }
    /**
     * Gets the wiFiScanInterval property value. Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWiFiScanInterval() {
        return this._wiFiScanInterval;
    }
    /**
     * Gets the windows10AppsForceUpdateSchedule property value. Windows 10 force update schedule for Apps.
     * @return a windows10AppsForceUpdateSchedule
     */
    @javax.annotation.Nullable
    public Windows10AppsForceUpdateSchedule getWindows10AppsForceUpdateSchedule() {
        return this._windows10AppsForceUpdateSchedule;
    }
    /**
     * Gets the windowsSpotlightBlockConsumerSpecificFeatures property value. Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockConsumerSpecificFeatures() {
        return this._windowsSpotlightBlockConsumerSpecificFeatures;
    }
    /**
     * Gets the windowsSpotlightBlocked property value. Allows IT admins to turn off all Windows Spotlight features
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlocked() {
        return this._windowsSpotlightBlocked;
    }
    /**
     * Gets the windowsSpotlightBlockOnActionCenter property value. Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockOnActionCenter() {
        return this._windowsSpotlightBlockOnActionCenter;
    }
    /**
     * Gets the windowsSpotlightBlockTailoredExperiences property value. Block personalized content in Windows spotlight based on user’s device usage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockTailoredExperiences() {
        return this._windowsSpotlightBlockTailoredExperiences;
    }
    /**
     * Gets the windowsSpotlightBlockThirdPartyNotifications property value. Block third party content delivered via Windows Spotlight
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockThirdPartyNotifications() {
        return this._windowsSpotlightBlockThirdPartyNotifications;
    }
    /**
     * Gets the windowsSpotlightBlockWelcomeExperience property value. Block Windows Spotlight Windows welcome experience
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockWelcomeExperience() {
        return this._windowsSpotlightBlockWelcomeExperience;
    }
    /**
     * Gets the windowsSpotlightBlockWindowsTips property value. Allows IT admins to turn off the popup of Windows Tips.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockWindowsTips() {
        return this._windowsSpotlightBlockWindowsTips;
    }
    /**
     * Gets the windowsSpotlightConfigureOnLockScreen property value. Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     * @return a windowsSpotlightEnablementSettings
     */
    @javax.annotation.Nullable
    public WindowsSpotlightEnablementSettings getWindowsSpotlightConfigureOnLockScreen() {
        return this._windowsSpotlightConfigureOnLockScreen;
    }
    /**
     * Gets the windowsStoreBlockAutoUpdate property value. Indicates whether or not to block automatic update of apps from Windows Store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsStoreBlockAutoUpdate() {
        return this._windowsStoreBlockAutoUpdate;
    }
    /**
     * Gets the windowsStoreBlocked property value. Indicates whether or not to Block the user from using the Windows store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsStoreBlocked() {
        return this._windowsStoreBlocked;
    }
    /**
     * Gets the windowsStoreEnablePrivateStoreOnly property value. Indicates whether or not to enable Private Store Only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsStoreEnablePrivateStoreOnly() {
        return this._windowsStoreEnablePrivateStoreOnly;
    }
    /**
     * Gets the wirelessDisplayBlockProjectionToThisDevice property value. Indicates whether or not to allow other devices from discovering this PC for projection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWirelessDisplayBlockProjectionToThisDevice() {
        return this._wirelessDisplayBlockProjectionToThisDevice;
    }
    /**
     * Gets the wirelessDisplayBlockUserInputFromReceiver property value. Indicates whether or not to allow user input from wireless display receiver.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWirelessDisplayBlockUserInputFromReceiver() {
        return this._wirelessDisplayBlockUserInputFromReceiver;
    }
    /**
     * Gets the wirelessDisplayRequirePinForPairing property value. Indicates whether or not to require a PIN for new devices to initiate pairing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWirelessDisplayRequirePinForPairing() {
        return this._wirelessDisplayRequirePinForPairing;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeEnumValue("startMenuAppListVisibility", this.getStartMenuAppListVisibility());
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
     * @return a void
     */
    public void setAccountsBlockAddingNonMicrosoftAccountEmail(@javax.annotation.Nullable final Boolean value) {
        this._accountsBlockAddingNonMicrosoftAccountEmail = value;
    }
    /**
     * Sets the activateAppsWithVoice property value. Possible values of a property
     * @param value Value to set for the activateAppsWithVoice property.
     * @return a void
     */
    public void setActivateAppsWithVoice(@javax.annotation.Nullable final Enablement value) {
        this._activateAppsWithVoice = value;
    }
    /**
     * Sets the antiTheftModeBlocked property value. Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
     * @param value Value to set for the antiTheftModeBlocked property.
     * @return a void
     */
    public void setAntiTheftModeBlocked(@javax.annotation.Nullable final Boolean value) {
        this._antiTheftModeBlocked = value;
    }
    /**
     * Sets the appManagementMSIAllowUserControlOverInstall property value. This policy setting permits users to change installation options that typically are available only to system administrators.
     * @param value Value to set for the appManagementMSIAllowUserControlOverInstall property.
     * @return a void
     */
    public void setAppManagementMSIAllowUserControlOverInstall(@javax.annotation.Nullable final Boolean value) {
        this._appManagementMSIAllowUserControlOverInstall = value;
    }
    /**
     * Sets the appManagementMSIAlwaysInstallWithElevatedPrivileges property value. This policy setting directs Windows Installer to use elevated permissions when it installs any program on the system.
     * @param value Value to set for the appManagementMSIAlwaysInstallWithElevatedPrivileges property.
     * @return a void
     */
    public void setAppManagementMSIAlwaysInstallWithElevatedPrivileges(@javax.annotation.Nullable final Boolean value) {
        this._appManagementMSIAlwaysInstallWithElevatedPrivileges = value;
    }
    /**
     * Sets the appManagementPackageFamilyNamesToLaunchAfterLogOn property value. List of semi-colon delimited Package Family Names of Windows apps. Listed Windows apps are to be launched after logon.​
     * @param value Value to set for the appManagementPackageFamilyNamesToLaunchAfterLogOn property.
     * @return a void
     */
    public void setAppManagementPackageFamilyNamesToLaunchAfterLogOn(@javax.annotation.Nullable final java.util.List<String> value) {
        this._appManagementPackageFamilyNamesToLaunchAfterLogOn = value;
    }
    /**
     * Sets the appsAllowTrustedAppsSideloading property value. State Management Setting.
     * @param value Value to set for the appsAllowTrustedAppsSideloading property.
     * @return a void
     */
    public void setAppsAllowTrustedAppsSideloading(@javax.annotation.Nullable final StateManagementSetting value) {
        this._appsAllowTrustedAppsSideloading = value;
    }
    /**
     * Sets the appsBlockWindowsStoreOriginatedApps property value. Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded.
     * @param value Value to set for the appsBlockWindowsStoreOriginatedApps property.
     * @return a void
     */
    public void setAppsBlockWindowsStoreOriginatedApps(@javax.annotation.Nullable final Boolean value) {
        this._appsBlockWindowsStoreOriginatedApps = value;
    }
    /**
     * Sets the authenticationAllowSecondaryDevice property value. Allows secondary authentication devices to work with Windows.
     * @param value Value to set for the authenticationAllowSecondaryDevice property.
     * @return a void
     */
    public void setAuthenticationAllowSecondaryDevice(@javax.annotation.Nullable final Boolean value) {
        this._authenticationAllowSecondaryDevice = value;
    }
    /**
     * Sets the authenticationPreferredAzureADTenantDomainName property value. Specifies the preferred domain among available domains in the Azure AD tenant.
     * @param value Value to set for the authenticationPreferredAzureADTenantDomainName property.
     * @return a void
     */
    public void setAuthenticationPreferredAzureADTenantDomainName(@javax.annotation.Nullable final String value) {
        this._authenticationPreferredAzureADTenantDomainName = value;
    }
    /**
     * Sets the authenticationWebSignIn property value. Possible values of a property
     * @param value Value to set for the authenticationWebSignIn property.
     * @return a void
     */
    public void setAuthenticationWebSignIn(@javax.annotation.Nullable final Enablement value) {
        this._authenticationWebSignIn = value;
    }
    /**
     * Sets the bluetoothAllowedServices property value. Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
     * @param value Value to set for the bluetoothAllowedServices property.
     * @return a void
     */
    public void setBluetoothAllowedServices(@javax.annotation.Nullable final java.util.List<String> value) {
        this._bluetoothAllowedServices = value;
    }
    /**
     * Sets the bluetoothBlockAdvertising property value. Whether or not to Block the user from using bluetooth advertising.
     * @param value Value to set for the bluetoothBlockAdvertising property.
     * @return a void
     */
    public void setBluetoothBlockAdvertising(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlockAdvertising = value;
    }
    /**
     * Sets the bluetoothBlockDiscoverableMode property value. Whether or not to Block the user from using bluetooth discoverable mode.
     * @param value Value to set for the bluetoothBlockDiscoverableMode property.
     * @return a void
     */
    public void setBluetoothBlockDiscoverableMode(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlockDiscoverableMode = value;
    }
    /**
     * Sets the bluetoothBlocked property value. Whether or not to Block the user from using bluetooth.
     * @param value Value to set for the bluetoothBlocked property.
     * @return a void
     */
    public void setBluetoothBlocked(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlocked = value;
    }
    /**
     * Sets the bluetoothBlockPrePairing property value. Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
     * @param value Value to set for the bluetoothBlockPrePairing property.
     * @return a void
     */
    public void setBluetoothBlockPrePairing(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlockPrePairing = value;
    }
    /**
     * Sets the bluetoothBlockPromptedProximalConnections property value. Whether or not to block the users from using Swift Pair and other proximity based scenarios.
     * @param value Value to set for the bluetoothBlockPromptedProximalConnections property.
     * @return a void
     */
    public void setBluetoothBlockPromptedProximalConnections(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlockPromptedProximalConnections = value;
    }
    /**
     * Sets the cameraBlocked property value. Whether or not to Block the user from accessing the camera of the device.
     * @param value Value to set for the cameraBlocked property.
     * @return a void
     */
    public void setCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this._cameraBlocked = value;
    }
    /**
     * Sets the cellularBlockDataWhenRoaming property value. Whether or not to Block the user from using data over cellular while roaming.
     * @param value Value to set for the cellularBlockDataWhenRoaming property.
     * @return a void
     */
    public void setCellularBlockDataWhenRoaming(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockDataWhenRoaming = value;
    }
    /**
     * Sets the cellularBlockVpn property value. Whether or not to Block the user from using VPN over cellular.
     * @param value Value to set for the cellularBlockVpn property.
     * @return a void
     */
    public void setCellularBlockVpn(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockVpn = value;
    }
    /**
     * Sets the cellularBlockVpnWhenRoaming property value. Whether or not to Block the user from using VPN when roaming over cellular.
     * @param value Value to set for the cellularBlockVpnWhenRoaming property.
     * @return a void
     */
    public void setCellularBlockVpnWhenRoaming(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockVpnWhenRoaming = value;
    }
    /**
     * Sets the cellularData property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the cellularData property.
     * @return a void
     */
    public void setCellularData(@javax.annotation.Nullable final ConfigurationUsage value) {
        this._cellularData = value;
    }
    /**
     * Sets the certificatesBlockManualRootCertificateInstallation property value. Whether or not to Block the user from doing manual root certificate installation.
     * @param value Value to set for the certificatesBlockManualRootCertificateInstallation property.
     * @return a void
     */
    public void setCertificatesBlockManualRootCertificateInstallation(@javax.annotation.Nullable final Boolean value) {
        this._certificatesBlockManualRootCertificateInstallation = value;
    }
    /**
     * Sets the configureTimeZone property value. Specifies the time zone to be applied to the device. This is the standard Windows name for the target time zone.
     * @param value Value to set for the configureTimeZone property.
     * @return a void
     */
    public void setConfigureTimeZone(@javax.annotation.Nullable final String value) {
        this._configureTimeZone = value;
    }
    /**
     * Sets the connectedDevicesServiceBlocked property value. Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences.
     * @param value Value to set for the connectedDevicesServiceBlocked property.
     * @return a void
     */
    public void setConnectedDevicesServiceBlocked(@javax.annotation.Nullable final Boolean value) {
        this._connectedDevicesServiceBlocked = value;
    }
    /**
     * Sets the copyPasteBlocked property value. Whether or not to Block the user from using copy paste.
     * @param value Value to set for the copyPasteBlocked property.
     * @return a void
     */
    public void setCopyPasteBlocked(@javax.annotation.Nullable final Boolean value) {
        this._copyPasteBlocked = value;
    }
    /**
     * Sets the cortanaBlocked property value. Whether or not to Block the user from using Cortana.
     * @param value Value to set for the cortanaBlocked property.
     * @return a void
     */
    public void setCortanaBlocked(@javax.annotation.Nullable final Boolean value) {
        this._cortanaBlocked = value;
    }
    /**
     * Sets the cryptographyAllowFipsAlgorithmPolicy property value. Specify whether to allow or disallow the Federal Information Processing Standard (FIPS) policy.
     * @param value Value to set for the cryptographyAllowFipsAlgorithmPolicy property.
     * @return a void
     */
    public void setCryptographyAllowFipsAlgorithmPolicy(@javax.annotation.Nullable final Boolean value) {
        this._cryptographyAllowFipsAlgorithmPolicy = value;
    }
    /**
     * Sets the dataProtectionBlockDirectMemoryAccess property value. This policy setting allows you to block direct memory access (DMA) for all hot pluggable PCI downstream ports until a user logs into Windows.
     * @param value Value to set for the dataProtectionBlockDirectMemoryAccess property.
     * @return a void
     */
    public void setDataProtectionBlockDirectMemoryAccess(@javax.annotation.Nullable final Boolean value) {
        this._dataProtectionBlockDirectMemoryAccess = value;
    }
    /**
     * Sets the defenderBlockEndUserAccess property value. Whether or not to block end user access to Defender.
     * @param value Value to set for the defenderBlockEndUserAccess property.
     * @return a void
     */
    public void setDefenderBlockEndUserAccess(@javax.annotation.Nullable final Boolean value) {
        this._defenderBlockEndUserAccess = value;
    }
    /**
     * Sets the defenderBlockOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @param value Value to set for the defenderBlockOnAccessProtection property.
     * @return a void
     */
    public void setDefenderBlockOnAccessProtection(@javax.annotation.Nullable final Boolean value) {
        this._defenderBlockOnAccessProtection = value;
    }
    /**
     * Sets the defenderCloudBlockLevel property value. Possible values of Cloud Block Level
     * @param value Value to set for the defenderCloudBlockLevel property.
     * @return a void
     */
    public void setDefenderCloudBlockLevel(@javax.annotation.Nullable final DefenderCloudBlockLevelType value) {
        this._defenderCloudBlockLevel = value;
    }
    /**
     * Sets the defenderCloudExtendedTimeout property value. Timeout extension for file scanning by the cloud. Valid values 0 to 50
     * @param value Value to set for the defenderCloudExtendedTimeout property.
     * @return a void
     */
    public void setDefenderCloudExtendedTimeout(@javax.annotation.Nullable final Integer value) {
        this._defenderCloudExtendedTimeout = value;
    }
    /**
     * Sets the defenderCloudExtendedTimeoutInSeconds property value. Timeout extension for file scanning by the cloud. Valid values 0 to 50
     * @param value Value to set for the defenderCloudExtendedTimeoutInSeconds property.
     * @return a void
     */
    public void setDefenderCloudExtendedTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this._defenderCloudExtendedTimeoutInSeconds = value;
    }
    /**
     * Sets the defenderDaysBeforeDeletingQuarantinedMalware property value. Number of days before deleting quarantined malware. Valid values 0 to 90
     * @param value Value to set for the defenderDaysBeforeDeletingQuarantinedMalware property.
     * @return a void
     */
    public void setDefenderDaysBeforeDeletingQuarantinedMalware(@javax.annotation.Nullable final Integer value) {
        this._defenderDaysBeforeDeletingQuarantinedMalware = value;
    }
    /**
     * Sets the defenderDetectedMalwareActions property value. Gets or sets Defender’s actions to take on detected Malware per threat level.
     * @param value Value to set for the defenderDetectedMalwareActions property.
     * @return a void
     */
    public void setDefenderDetectedMalwareActions(@javax.annotation.Nullable final DefenderDetectedMalwareActions value) {
        this._defenderDetectedMalwareActions = value;
    }
    /**
     * Sets the defenderDisableCatchupFullScan property value. When blocked, catch-up scans for scheduled full scans will be turned off.
     * @param value Value to set for the defenderDisableCatchupFullScan property.
     * @return a void
     */
    public void setDefenderDisableCatchupFullScan(@javax.annotation.Nullable final Boolean value) {
        this._defenderDisableCatchupFullScan = value;
    }
    /**
     * Sets the defenderDisableCatchupQuickScan property value. When blocked, catch-up scans for scheduled quick scans will be turned off.
     * @param value Value to set for the defenderDisableCatchupQuickScan property.
     * @return a void
     */
    public void setDefenderDisableCatchupQuickScan(@javax.annotation.Nullable final Boolean value) {
        this._defenderDisableCatchupQuickScan = value;
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
     * Sets the defenderMonitorFileActivity property value. Possible values for monitoring file activity.
     * @param value Value to set for the defenderMonitorFileActivity property.
     * @return a void
     */
    public void setDefenderMonitorFileActivity(@javax.annotation.Nullable final DefenderMonitorFileActivity value) {
        this._defenderMonitorFileActivity = value;
    }
    /**
     * Sets the defenderPotentiallyUnwantedAppAction property value. Gets or sets Defender’s action to take on Potentially Unwanted Application (PUA), which includes software with behaviors of ad-injection, software bundling, persistent solicitation for payment or subscription, etc. Defender alerts user when PUA is being downloaded or attempts to install itself. Added in Windows 10 for desktop. Possible values are: deviceDefault, block, audit.
     * @param value Value to set for the defenderPotentiallyUnwantedAppAction property.
     * @return a void
     */
    public void setDefenderPotentiallyUnwantedAppAction(@javax.annotation.Nullable final DefenderPotentiallyUnwantedAppAction value) {
        this._defenderPotentiallyUnwantedAppAction = value;
    }
    /**
     * Sets the defenderPotentiallyUnwantedAppActionSetting property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderPotentiallyUnwantedAppActionSetting property.
     * @return a void
     */
    public void setDefenderPotentiallyUnwantedAppActionSetting(@javax.annotation.Nullable final DefenderProtectionType value) {
        this._defenderPotentiallyUnwantedAppActionSetting = value;
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
     * Sets the defenderPromptForSampleSubmission property value. Possible values for prompting user for samples submission.
     * @param value Value to set for the defenderPromptForSampleSubmission property.
     * @return a void
     */
    public void setDefenderPromptForSampleSubmission(@javax.annotation.Nullable final DefenderPromptForSampleSubmission value) {
        this._defenderPromptForSampleSubmission = value;
    }
    /**
     * Sets the defenderRequireBehaviorMonitoring property value. Indicates whether or not to require behavior monitoring.
     * @param value Value to set for the defenderRequireBehaviorMonitoring property.
     * @return a void
     */
    public void setDefenderRequireBehaviorMonitoring(@javax.annotation.Nullable final Boolean value) {
        this._defenderRequireBehaviorMonitoring = value;
    }
    /**
     * Sets the defenderRequireCloudProtection property value. Indicates whether or not to require cloud protection.
     * @param value Value to set for the defenderRequireCloudProtection property.
     * @return a void
     */
    public void setDefenderRequireCloudProtection(@javax.annotation.Nullable final Boolean value) {
        this._defenderRequireCloudProtection = value;
    }
    /**
     * Sets the defenderRequireNetworkInspectionSystem property value. Indicates whether or not to require network inspection system.
     * @param value Value to set for the defenderRequireNetworkInspectionSystem property.
     * @return a void
     */
    public void setDefenderRequireNetworkInspectionSystem(@javax.annotation.Nullable final Boolean value) {
        this._defenderRequireNetworkInspectionSystem = value;
    }
    /**
     * Sets the defenderRequireRealTimeMonitoring property value. Indicates whether or not to require real time monitoring.
     * @param value Value to set for the defenderRequireRealTimeMonitoring property.
     * @return a void
     */
    public void setDefenderRequireRealTimeMonitoring(@javax.annotation.Nullable final Boolean value) {
        this._defenderRequireRealTimeMonitoring = value;
    }
    /**
     * Sets the defenderScanArchiveFiles property value. Indicates whether or not to scan archive files.
     * @param value Value to set for the defenderScanArchiveFiles property.
     * @return a void
     */
    public void setDefenderScanArchiveFiles(@javax.annotation.Nullable final Boolean value) {
        this._defenderScanArchiveFiles = value;
    }
    /**
     * Sets the defenderScanDownloads property value. Indicates whether or not to scan downloads.
     * @param value Value to set for the defenderScanDownloads property.
     * @return a void
     */
    public void setDefenderScanDownloads(@javax.annotation.Nullable final Boolean value) {
        this._defenderScanDownloads = value;
    }
    /**
     * Sets the defenderScanIncomingMail property value. Indicates whether or not to scan incoming mail messages.
     * @param value Value to set for the defenderScanIncomingMail property.
     * @return a void
     */
    public void setDefenderScanIncomingMail(@javax.annotation.Nullable final Boolean value) {
        this._defenderScanIncomingMail = value;
    }
    /**
     * Sets the defenderScanMappedNetworkDrivesDuringFullScan property value. Indicates whether or not to scan mapped network drives during full scan.
     * @param value Value to set for the defenderScanMappedNetworkDrivesDuringFullScan property.
     * @return a void
     */
    public void setDefenderScanMappedNetworkDrivesDuringFullScan(@javax.annotation.Nullable final Boolean value) {
        this._defenderScanMappedNetworkDrivesDuringFullScan = value;
    }
    /**
     * Sets the defenderScanMaxCpu property value. Max CPU usage percentage during scan. Valid values 0 to 100
     * @param value Value to set for the defenderScanMaxCpu property.
     * @return a void
     */
    public void setDefenderScanMaxCpu(@javax.annotation.Nullable final Integer value) {
        this._defenderScanMaxCpu = value;
    }
    /**
     * Sets the defenderScanNetworkFiles property value. Indicates whether or not to scan files opened from a network folder.
     * @param value Value to set for the defenderScanNetworkFiles property.
     * @return a void
     */
    public void setDefenderScanNetworkFiles(@javax.annotation.Nullable final Boolean value) {
        this._defenderScanNetworkFiles = value;
    }
    /**
     * Sets the defenderScanRemovableDrivesDuringFullScan property value. Indicates whether or not to scan removable drives during full scan.
     * @param value Value to set for the defenderScanRemovableDrivesDuringFullScan property.
     * @return a void
     */
    public void setDefenderScanRemovableDrivesDuringFullScan(@javax.annotation.Nullable final Boolean value) {
        this._defenderScanRemovableDrivesDuringFullScan = value;
    }
    /**
     * Sets the defenderScanScriptsLoadedInInternetExplorer property value. Indicates whether or not to scan scripts loaded in Internet Explorer browser.
     * @param value Value to set for the defenderScanScriptsLoadedInInternetExplorer property.
     * @return a void
     */
    public void setDefenderScanScriptsLoadedInInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this._defenderScanScriptsLoadedInInternetExplorer = value;
    }
    /**
     * Sets the defenderScanType property value. Possible values for system scan type.
     * @param value Value to set for the defenderScanType property.
     * @return a void
     */
    public void setDefenderScanType(@javax.annotation.Nullable final DefenderScanType value) {
        this._defenderScanType = value;
    }
    /**
     * Sets the defenderScheduledQuickScanTime property value. The time to perform a daily quick scan.
     * @param value Value to set for the defenderScheduledQuickScanTime property.
     * @return a void
     */
    public void setDefenderScheduledQuickScanTime(@javax.annotation.Nullable final LocalTime value) {
        this._defenderScheduledQuickScanTime = value;
    }
    /**
     * Sets the defenderScheduledScanTime property value. The defender time for the system scan.
     * @param value Value to set for the defenderScheduledScanTime property.
     * @return a void
     */
    public void setDefenderScheduledScanTime(@javax.annotation.Nullable final LocalTime value) {
        this._defenderScheduledScanTime = value;
    }
    /**
     * Sets the defenderScheduleScanEnableLowCpuPriority property value. When enabled, low CPU priority will be used during scheduled scans.
     * @param value Value to set for the defenderScheduleScanEnableLowCpuPriority property.
     * @return a void
     */
    public void setDefenderScheduleScanEnableLowCpuPriority(@javax.annotation.Nullable final Boolean value) {
        this._defenderScheduleScanEnableLowCpuPriority = value;
    }
    /**
     * Sets the defenderSignatureUpdateIntervalInHours property value. The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
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
     * Sets the defenderSystemScanSchedule property value. Possible values for a weekly schedule.
     * @param value Value to set for the defenderSystemScanSchedule property.
     * @return a void
     */
    public void setDefenderSystemScanSchedule(@javax.annotation.Nullable final WeeklySchedule value) {
        this._defenderSystemScanSchedule = value;
    }
    /**
     * Sets the developerUnlockSetting property value. State Management Setting.
     * @param value Value to set for the developerUnlockSetting property.
     * @return a void
     */
    public void setDeveloperUnlockSetting(@javax.annotation.Nullable final StateManagementSetting value) {
        this._developerUnlockSetting = value;
    }
    /**
     * Sets the deviceManagementBlockFactoryResetOnMobile property value. Indicates whether or not to Block the user from resetting their phone.
     * @param value Value to set for the deviceManagementBlockFactoryResetOnMobile property.
     * @return a void
     */
    public void setDeviceManagementBlockFactoryResetOnMobile(@javax.annotation.Nullable final Boolean value) {
        this._deviceManagementBlockFactoryResetOnMobile = value;
    }
    /**
     * Sets the deviceManagementBlockManualUnenroll property value. Indicates whether or not to Block the user from doing manual un-enrollment from device management.
     * @param value Value to set for the deviceManagementBlockManualUnenroll property.
     * @return a void
     */
    public void setDeviceManagementBlockManualUnenroll(@javax.annotation.Nullable final Boolean value) {
        this._deviceManagementBlockManualUnenroll = value;
    }
    /**
     * Sets the diagnosticsDataSubmissionMode property value. Allow the device to send diagnostic and usage telemetry data, such as Watson.
     * @param value Value to set for the diagnosticsDataSubmissionMode property.
     * @return a void
     */
    public void setDiagnosticsDataSubmissionMode(@javax.annotation.Nullable final DiagnosticDataSubmissionMode value) {
        this._diagnosticsDataSubmissionMode = value;
    }
    /**
     * Sets the displayAppListWithGdiDPIScalingTurnedOff property value. List of legacy applications that have GDI DPI Scaling turned off.
     * @param value Value to set for the displayAppListWithGdiDPIScalingTurnedOff property.
     * @return a void
     */
    public void setDisplayAppListWithGdiDPIScalingTurnedOff(@javax.annotation.Nullable final java.util.List<String> value) {
        this._displayAppListWithGdiDPIScalingTurnedOff = value;
    }
    /**
     * Sets the displayAppListWithGdiDPIScalingTurnedOn property value. List of legacy applications that have GDI DPI Scaling turned on.
     * @param value Value to set for the displayAppListWithGdiDPIScalingTurnedOn property.
     * @return a void
     */
    public void setDisplayAppListWithGdiDPIScalingTurnedOn(@javax.annotation.Nullable final java.util.List<String> value) {
        this._displayAppListWithGdiDPIScalingTurnedOn = value;
    }
    /**
     * Sets the edgeAllowStartPagesModification property value. Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge.
     * @param value Value to set for the edgeAllowStartPagesModification property.
     * @return a void
     */
    public void setEdgeAllowStartPagesModification(@javax.annotation.Nullable final Boolean value) {
        this._edgeAllowStartPagesModification = value;
    }
    /**
     * Sets the edgeBlockAccessToAboutFlags property value. Indicates whether or not to prevent access to about flags on Edge browser.
     * @param value Value to set for the edgeBlockAccessToAboutFlags property.
     * @return a void
     */
    public void setEdgeBlockAccessToAboutFlags(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockAccessToAboutFlags = value;
    }
    /**
     * Sets the edgeBlockAddressBarDropdown property value. Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services.
     * @param value Value to set for the edgeBlockAddressBarDropdown property.
     * @return a void
     */
    public void setEdgeBlockAddressBarDropdown(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockAddressBarDropdown = value;
    }
    /**
     * Sets the edgeBlockAutofill property value. Indicates whether or not to block auto fill.
     * @param value Value to set for the edgeBlockAutofill property.
     * @return a void
     */
    public void setEdgeBlockAutofill(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockAutofill = value;
    }
    /**
     * Sets the edgeBlockCompatibilityList property value. Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues.
     * @param value Value to set for the edgeBlockCompatibilityList property.
     * @return a void
     */
    public void setEdgeBlockCompatibilityList(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockCompatibilityList = value;
    }
    /**
     * Sets the edgeBlockDeveloperTools property value. Indicates whether or not to block developer tools in the Edge browser.
     * @param value Value to set for the edgeBlockDeveloperTools property.
     * @return a void
     */
    public void setEdgeBlockDeveloperTools(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockDeveloperTools = value;
    }
    /**
     * Sets the edgeBlocked property value. Indicates whether or not to Block the user from using the Edge browser.
     * @param value Value to set for the edgeBlocked property.
     * @return a void
     */
    public void setEdgeBlocked(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlocked = value;
    }
    /**
     * Sets the edgeBlockEditFavorites property value. Indicates whether or not to Block the user from making changes to Favorites.
     * @param value Value to set for the edgeBlockEditFavorites property.
     * @return a void
     */
    public void setEdgeBlockEditFavorites(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockEditFavorites = value;
    }
    /**
     * Sets the edgeBlockExtensions property value. Indicates whether or not to block extensions in the Edge browser.
     * @param value Value to set for the edgeBlockExtensions property.
     * @return a void
     */
    public void setEdgeBlockExtensions(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockExtensions = value;
    }
    /**
     * Sets the edgeBlockFullScreenMode property value. Allow or prevent Edge from entering the full screen mode.
     * @param value Value to set for the edgeBlockFullScreenMode property.
     * @return a void
     */
    public void setEdgeBlockFullScreenMode(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockFullScreenMode = value;
    }
    /**
     * Sets the edgeBlockInPrivateBrowsing property value. Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
     * @param value Value to set for the edgeBlockInPrivateBrowsing property.
     * @return a void
     */
    public void setEdgeBlockInPrivateBrowsing(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockInPrivateBrowsing = value;
    }
    /**
     * Sets the edgeBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @param value Value to set for the edgeBlockJavaScript property.
     * @return a void
     */
    public void setEdgeBlockJavaScript(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockJavaScript = value;
    }
    /**
     * Sets the edgeBlockLiveTileDataCollection property value. Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge.
     * @param value Value to set for the edgeBlockLiveTileDataCollection property.
     * @return a void
     */
    public void setEdgeBlockLiveTileDataCollection(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockLiveTileDataCollection = value;
    }
    /**
     * Sets the edgeBlockPasswordManager property value. Indicates whether or not to Block password manager.
     * @param value Value to set for the edgeBlockPasswordManager property.
     * @return a void
     */
    public void setEdgeBlockPasswordManager(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockPasswordManager = value;
    }
    /**
     * Sets the edgeBlockPopups property value. Indicates whether or not to block popups.
     * @param value Value to set for the edgeBlockPopups property.
     * @return a void
     */
    public void setEdgeBlockPopups(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockPopups = value;
    }
    /**
     * Sets the edgeBlockPrelaunch property value. Decide whether Microsoft Edge is prelaunched at Windows startup.
     * @param value Value to set for the edgeBlockPrelaunch property.
     * @return a void
     */
    public void setEdgeBlockPrelaunch(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockPrelaunch = value;
    }
    /**
     * Sets the edgeBlockPrinting property value. Configure Edge to allow or block printing.
     * @param value Value to set for the edgeBlockPrinting property.
     * @return a void
     */
    public void setEdgeBlockPrinting(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockPrinting = value;
    }
    /**
     * Sets the edgeBlockSavingHistory property value. Configure Edge to allow browsing history to be saved or to never save browsing history.
     * @param value Value to set for the edgeBlockSavingHistory property.
     * @return a void
     */
    public void setEdgeBlockSavingHistory(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockSavingHistory = value;
    }
    /**
     * Sets the edgeBlockSearchEngineCustomization property value. Indicates whether or not to block the user from adding new search engine or changing the default search engine.
     * @param value Value to set for the edgeBlockSearchEngineCustomization property.
     * @return a void
     */
    public void setEdgeBlockSearchEngineCustomization(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockSearchEngineCustomization = value;
    }
    /**
     * Sets the edgeBlockSearchSuggestions property value. Indicates whether or not to block the user from using the search suggestions in the address bar.
     * @param value Value to set for the edgeBlockSearchSuggestions property.
     * @return a void
     */
    public void setEdgeBlockSearchSuggestions(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockSearchSuggestions = value;
    }
    /**
     * Sets the edgeBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @param value Value to set for the edgeBlockSendingDoNotTrackHeader property.
     * @return a void
     */
    public void setEdgeBlockSendingDoNotTrackHeader(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockSendingDoNotTrackHeader = value;
    }
    /**
     * Sets the edgeBlockSendingIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
     * @param value Value to set for the edgeBlockSendingIntranetTrafficToInternetExplorer property.
     * @return a void
     */
    public void setEdgeBlockSendingIntranetTrafficToInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockSendingIntranetTrafficToInternetExplorer = value;
    }
    /**
     * Sets the edgeBlockSideloadingExtensions property value. Indicates whether the user can sideload extensions.
     * @param value Value to set for the edgeBlockSideloadingExtensions property.
     * @return a void
     */
    public void setEdgeBlockSideloadingExtensions(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockSideloadingExtensions = value;
    }
    /**
     * Sets the edgeBlockTabPreloading property value. Configure whether Edge preloads the new tab page at Windows startup.
     * @param value Value to set for the edgeBlockTabPreloading property.
     * @return a void
     */
    public void setEdgeBlockTabPreloading(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockTabPreloading = value;
    }
    /**
     * Sets the edgeBlockWebContentOnNewTabPage property value. Configure to load a blank page in Edge instead of the default New tab page and prevent users from changing it.
     * @param value Value to set for the edgeBlockWebContentOnNewTabPage property.
     * @return a void
     */
    public void setEdgeBlockWebContentOnNewTabPage(@javax.annotation.Nullable final Boolean value) {
        this._edgeBlockWebContentOnNewTabPage = value;
    }
    /**
     * Sets the edgeClearBrowsingDataOnExit property value. Clear browsing data on exiting Microsoft Edge.
     * @param value Value to set for the edgeClearBrowsingDataOnExit property.
     * @return a void
     */
    public void setEdgeClearBrowsingDataOnExit(@javax.annotation.Nullable final Boolean value) {
        this._edgeClearBrowsingDataOnExit = value;
    }
    /**
     * Sets the edgeCookiePolicy property value. Possible values to specify which cookies are allowed in Microsoft Edge.
     * @param value Value to set for the edgeCookiePolicy property.
     * @return a void
     */
    public void setEdgeCookiePolicy(@javax.annotation.Nullable final EdgeCookiePolicy value) {
        this._edgeCookiePolicy = value;
    }
    /**
     * Sets the edgeDisableFirstRunPage property value. Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page.
     * @param value Value to set for the edgeDisableFirstRunPage property.
     * @return a void
     */
    public void setEdgeDisableFirstRunPage(@javax.annotation.Nullable final Boolean value) {
        this._edgeDisableFirstRunPage = value;
    }
    /**
     * Sets the edgeEnterpriseModeSiteListLocation property value. Indicates the enterprise mode site list location. Could be a local file, local network or http location.
     * @param value Value to set for the edgeEnterpriseModeSiteListLocation property.
     * @return a void
     */
    public void setEdgeEnterpriseModeSiteListLocation(@javax.annotation.Nullable final String value) {
        this._edgeEnterpriseModeSiteListLocation = value;
    }
    /**
     * Sets the edgeFavoritesBarVisibility property value. Generic visibility state.
     * @param value Value to set for the edgeFavoritesBarVisibility property.
     * @return a void
     */
    public void setEdgeFavoritesBarVisibility(@javax.annotation.Nullable final VisibilitySetting value) {
        this._edgeFavoritesBarVisibility = value;
    }
    /**
     * Sets the edgeFavoritesListLocation property value. The location of the favorites list to provision. Could be a local file, local network or http location.
     * @param value Value to set for the edgeFavoritesListLocation property.
     * @return a void
     */
    public void setEdgeFavoritesListLocation(@javax.annotation.Nullable final String value) {
        this._edgeFavoritesListLocation = value;
    }
    /**
     * Sets the edgeFirstRunUrl property value. The first run URL for when Edge browser is opened for the first time.
     * @param value Value to set for the edgeFirstRunUrl property.
     * @return a void
     */
    public void setEdgeFirstRunUrl(@javax.annotation.Nullable final String value) {
        this._edgeFirstRunUrl = value;
    }
    /**
     * Sets the edgeHomeButtonConfiguration property value. Causes the Home button to either hide, load the default Start page, load a New tab page, or a custom URL
     * @param value Value to set for the edgeHomeButtonConfiguration property.
     * @return a void
     */
    public void setEdgeHomeButtonConfiguration(@javax.annotation.Nullable final EdgeHomeButtonConfiguration value) {
        this._edgeHomeButtonConfiguration = value;
    }
    /**
     * Sets the edgeHomeButtonConfigurationEnabled property value. Enable the Home button configuration.
     * @param value Value to set for the edgeHomeButtonConfigurationEnabled property.
     * @return a void
     */
    public void setEdgeHomeButtonConfigurationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._edgeHomeButtonConfigurationEnabled = value;
    }
    /**
     * Sets the edgeHomepageUrls property value. The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
     * @param value Value to set for the edgeHomepageUrls property.
     * @return a void
     */
    public void setEdgeHomepageUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this._edgeHomepageUrls = value;
    }
    /**
     * Sets the edgeKioskModeRestriction property value. Specify how the Microsoft Edge settings are restricted based on kiosk mode.
     * @param value Value to set for the edgeKioskModeRestriction property.
     * @return a void
     */
    public void setEdgeKioskModeRestriction(@javax.annotation.Nullable final EdgeKioskModeRestrictionType value) {
        this._edgeKioskModeRestriction = value;
    }
    /**
     * Sets the edgeKioskResetAfterIdleTimeInMinutes property value. Specifies the time in minutes from the last user activity before Microsoft Edge kiosk resets.  Valid values are 0-1440. The default is 5. 0 indicates no reset. Valid values 0 to 1440
     * @param value Value to set for the edgeKioskResetAfterIdleTimeInMinutes property.
     * @return a void
     */
    public void setEdgeKioskResetAfterIdleTimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this._edgeKioskResetAfterIdleTimeInMinutes = value;
    }
    /**
     * Sets the edgeNewTabPageURL property value. Specify the page opened when new tabs are created.
     * @param value Value to set for the edgeNewTabPageURL property.
     * @return a void
     */
    public void setEdgeNewTabPageURL(@javax.annotation.Nullable final String value) {
        this._edgeNewTabPageURL = value;
    }
    /**
     * Sets the edgeOpensWith property value. Possible values for the EdgeOpensWith setting.
     * @param value Value to set for the edgeOpensWith property.
     * @return a void
     */
    public void setEdgeOpensWith(@javax.annotation.Nullable final EdgeOpenOptions value) {
        this._edgeOpensWith = value;
    }
    /**
     * Sets the edgePreventCertificateErrorOverride property value. Allow or prevent users from overriding certificate errors.
     * @param value Value to set for the edgePreventCertificateErrorOverride property.
     * @return a void
     */
    public void setEdgePreventCertificateErrorOverride(@javax.annotation.Nullable final Boolean value) {
        this._edgePreventCertificateErrorOverride = value;
    }
    /**
     * Sets the edgeRequiredExtensionPackageFamilyNames property value. Specify the list of package family names of browser extensions that are required and cannot be turned off by the user.
     * @param value Value to set for the edgeRequiredExtensionPackageFamilyNames property.
     * @return a void
     */
    public void setEdgeRequiredExtensionPackageFamilyNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._edgeRequiredExtensionPackageFamilyNames = value;
    }
    /**
     * Sets the edgeRequireSmartScreen property value. Indicates whether or not to Require the user to use the smart screen filter.
     * @param value Value to set for the edgeRequireSmartScreen property.
     * @return a void
     */
    public void setEdgeRequireSmartScreen(@javax.annotation.Nullable final Boolean value) {
        this._edgeRequireSmartScreen = value;
    }
    /**
     * Sets the edgeSearchEngine property value. Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set.
     * @param value Value to set for the edgeSearchEngine property.
     * @return a void
     */
    public void setEdgeSearchEngine(@javax.annotation.Nullable final EdgeSearchEngineBase value) {
        this._edgeSearchEngine = value;
    }
    /**
     * Sets the edgeSendIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
     * @param value Value to set for the edgeSendIntranetTrafficToInternetExplorer property.
     * @return a void
     */
    public void setEdgeSendIntranetTrafficToInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this._edgeSendIntranetTrafficToInternetExplorer = value;
    }
    /**
     * Sets the edgeShowMessageWhenOpeningInternetExplorerSites property value. What message will be displayed by Edge before switching to Internet Explorer.
     * @param value Value to set for the edgeShowMessageWhenOpeningInternetExplorerSites property.
     * @return a void
     */
    public void setEdgeShowMessageWhenOpeningInternetExplorerSites(@javax.annotation.Nullable final InternetExplorerMessageSetting value) {
        this._edgeShowMessageWhenOpeningInternetExplorerSites = value;
    }
    /**
     * Sets the edgeSyncFavoritesWithInternetExplorer property value. Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers.
     * @param value Value to set for the edgeSyncFavoritesWithInternetExplorer property.
     * @return a void
     */
    public void setEdgeSyncFavoritesWithInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this._edgeSyncFavoritesWithInternetExplorer = value;
    }
    /**
     * Sets the edgeTelemetryForMicrosoft365Analytics property value. Type of browsing data sent to Microsoft 365 analytics
     * @param value Value to set for the edgeTelemetryForMicrosoft365Analytics property.
     * @return a void
     */
    public void setEdgeTelemetryForMicrosoft365Analytics(@javax.annotation.Nullable final EdgeTelemetryMode value) {
        this._edgeTelemetryForMicrosoft365Analytics = value;
    }
    /**
     * Sets the enableAutomaticRedeployment property value. Allow users with administrative rights to delete all user data and settings using CTRL + Win + R at the device lock screen so that the device can be automatically re-configured and re-enrolled into management.
     * @param value Value to set for the enableAutomaticRedeployment property.
     * @return a void
     */
    public void setEnableAutomaticRedeployment(@javax.annotation.Nullable final Boolean value) {
        this._enableAutomaticRedeployment = value;
    }
    /**
     * Sets the energySaverOnBatteryThresholdPercentage property value. This setting allows you to specify battery charge level at which Energy Saver is turned on. While on battery, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100
     * @param value Value to set for the energySaverOnBatteryThresholdPercentage property.
     * @return a void
     */
    public void setEnergySaverOnBatteryThresholdPercentage(@javax.annotation.Nullable final Integer value) {
        this._energySaverOnBatteryThresholdPercentage = value;
    }
    /**
     * Sets the energySaverPluggedInThresholdPercentage property value. This setting allows you to specify battery charge level at which Energy Saver is turned on. While plugged in, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100
     * @param value Value to set for the energySaverPluggedInThresholdPercentage property.
     * @return a void
     */
    public void setEnergySaverPluggedInThresholdPercentage(@javax.annotation.Nullable final Integer value) {
        this._energySaverPluggedInThresholdPercentage = value;
    }
    /**
     * Sets the enterpriseCloudPrintDiscoveryEndPoint property value. Endpoint for discovering cloud printers.
     * @param value Value to set for the enterpriseCloudPrintDiscoveryEndPoint property.
     * @return a void
     */
    public void setEnterpriseCloudPrintDiscoveryEndPoint(@javax.annotation.Nullable final String value) {
        this._enterpriseCloudPrintDiscoveryEndPoint = value;
    }
    /**
     * Sets the enterpriseCloudPrintDiscoveryMaxLimit property value. Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535
     * @param value Value to set for the enterpriseCloudPrintDiscoveryMaxLimit property.
     * @return a void
     */
    public void setEnterpriseCloudPrintDiscoveryMaxLimit(@javax.annotation.Nullable final Integer value) {
        this._enterpriseCloudPrintDiscoveryMaxLimit = value;
    }
    /**
     * Sets the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property value. OAuth resource URI for printer discovery service as configured in Azure portal.
     * @param value Value to set for the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property.
     * @return a void
     */
    public void setEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier(@javax.annotation.Nullable final String value) {
        this._enterpriseCloudPrintMopriaDiscoveryResourceIdentifier = value;
    }
    /**
     * Sets the enterpriseCloudPrintOAuthAuthority property value. Authentication endpoint for acquiring OAuth tokens.
     * @param value Value to set for the enterpriseCloudPrintOAuthAuthority property.
     * @return a void
     */
    public void setEnterpriseCloudPrintOAuthAuthority(@javax.annotation.Nullable final String value) {
        this._enterpriseCloudPrintOAuthAuthority = value;
    }
    /**
     * Sets the enterpriseCloudPrintOAuthClientIdentifier property value. GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
     * @param value Value to set for the enterpriseCloudPrintOAuthClientIdentifier property.
     * @return a void
     */
    public void setEnterpriseCloudPrintOAuthClientIdentifier(@javax.annotation.Nullable final String value) {
        this._enterpriseCloudPrintOAuthClientIdentifier = value;
    }
    /**
     * Sets the enterpriseCloudPrintResourceIdentifier property value. OAuth resource URI for print service as configured in the Azure portal.
     * @param value Value to set for the enterpriseCloudPrintResourceIdentifier property.
     * @return a void
     */
    public void setEnterpriseCloudPrintResourceIdentifier(@javax.annotation.Nullable final String value) {
        this._enterpriseCloudPrintResourceIdentifier = value;
    }
    /**
     * Sets the experienceBlockDeviceDiscovery property value. Indicates whether or not to enable device discovery UX.
     * @param value Value to set for the experienceBlockDeviceDiscovery property.
     * @return a void
     */
    public void setExperienceBlockDeviceDiscovery(@javax.annotation.Nullable final Boolean value) {
        this._experienceBlockDeviceDiscovery = value;
    }
    /**
     * Sets the experienceBlockErrorDialogWhenNoSIM property value. Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
     * @param value Value to set for the experienceBlockErrorDialogWhenNoSIM property.
     * @return a void
     */
    public void setExperienceBlockErrorDialogWhenNoSIM(@javax.annotation.Nullable final Boolean value) {
        this._experienceBlockErrorDialogWhenNoSIM = value;
    }
    /**
     * Sets the experienceBlockTaskSwitcher property value. Indicates whether or not to enable task switching on the device.
     * @param value Value to set for the experienceBlockTaskSwitcher property.
     * @return a void
     */
    public void setExperienceBlockTaskSwitcher(@javax.annotation.Nullable final Boolean value) {
        this._experienceBlockTaskSwitcher = value;
    }
    /**
     * Sets the experienceDoNotSyncBrowserSettings property value. Allow(Not Configured) or prevent(Block) the syncing of Microsoft Edge Browser settings. Option to prevent syncing across devices, but allow user override.
     * @param value Value to set for the experienceDoNotSyncBrowserSettings property.
     * @return a void
     */
    public void setExperienceDoNotSyncBrowserSettings(@javax.annotation.Nullable final BrowserSyncSetting value) {
        this._experienceDoNotSyncBrowserSettings = value;
    }
    /**
     * Sets the findMyFiles property value. Possible values of a property
     * @param value Value to set for the findMyFiles property.
     * @return a void
     */
    public void setFindMyFiles(@javax.annotation.Nullable final Enablement value) {
        this._findMyFiles = value;
    }
    /**
     * Sets the gameDvrBlocked property value. Indicates whether or not to block DVR and broadcasting.
     * @param value Value to set for the gameDvrBlocked property.
     * @return a void
     */
    public void setGameDvrBlocked(@javax.annotation.Nullable final Boolean value) {
        this._gameDvrBlocked = value;
    }
    /**
     * Sets the inkWorkspaceAccess property value. Values for the InkWorkspaceAccess setting.
     * @param value Value to set for the inkWorkspaceAccess property.
     * @return a void
     */
    public void setInkWorkspaceAccess(@javax.annotation.Nullable final InkAccessSetting value) {
        this._inkWorkspaceAccess = value;
    }
    /**
     * Sets the inkWorkspaceAccessState property value. State Management Setting.
     * @param value Value to set for the inkWorkspaceAccessState property.
     * @return a void
     */
    public void setInkWorkspaceAccessState(@javax.annotation.Nullable final StateManagementSetting value) {
        this._inkWorkspaceAccessState = value;
    }
    /**
     * Sets the inkWorkspaceBlockSuggestedApps property value. Specify whether to show recommended app suggestions in the ink workspace.
     * @param value Value to set for the inkWorkspaceBlockSuggestedApps property.
     * @return a void
     */
    public void setInkWorkspaceBlockSuggestedApps(@javax.annotation.Nullable final Boolean value) {
        this._inkWorkspaceBlockSuggestedApps = value;
    }
    /**
     * Sets the internetSharingBlocked property value. Indicates whether or not to Block the user from using internet sharing.
     * @param value Value to set for the internetSharingBlocked property.
     * @return a void
     */
    public void setInternetSharingBlocked(@javax.annotation.Nullable final Boolean value) {
        this._internetSharingBlocked = value;
    }
    /**
     * Sets the locationServicesBlocked property value. Indicates whether or not to Block the user from location services.
     * @param value Value to set for the locationServicesBlocked property.
     * @return a void
     */
    public void setLocationServicesBlocked(@javax.annotation.Nullable final Boolean value) {
        this._locationServicesBlocked = value;
    }
    /**
     * Sets the lockScreenActivateAppsWithVoice property value. Possible values of a property
     * @param value Value to set for the lockScreenActivateAppsWithVoice property.
     * @return a void
     */
    public void setLockScreenActivateAppsWithVoice(@javax.annotation.Nullable final Enablement value) {
        this._lockScreenActivateAppsWithVoice = value;
    }
    /**
     * Sets the lockScreenAllowTimeoutConfiguration property value. Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
     * @param value Value to set for the lockScreenAllowTimeoutConfiguration property.
     * @return a void
     */
    public void setLockScreenAllowTimeoutConfiguration(@javax.annotation.Nullable final Boolean value) {
        this._lockScreenAllowTimeoutConfiguration = value;
    }
    /**
     * Sets the lockScreenBlockActionCenterNotifications property value. Indicates whether or not to block action center notifications over lock screen.
     * @param value Value to set for the lockScreenBlockActionCenterNotifications property.
     * @return a void
     */
    public void setLockScreenBlockActionCenterNotifications(@javax.annotation.Nullable final Boolean value) {
        this._lockScreenBlockActionCenterNotifications = value;
    }
    /**
     * Sets the lockScreenBlockCortana property value. Indicates whether or not the user can interact with Cortana using speech while the system is locked.
     * @param value Value to set for the lockScreenBlockCortana property.
     * @return a void
     */
    public void setLockScreenBlockCortana(@javax.annotation.Nullable final Boolean value) {
        this._lockScreenBlockCortana = value;
    }
    /**
     * Sets the lockScreenBlockToastNotifications property value. Indicates whether to allow toast notifications above the device lock screen.
     * @param value Value to set for the lockScreenBlockToastNotifications property.
     * @return a void
     */
    public void setLockScreenBlockToastNotifications(@javax.annotation.Nullable final Boolean value) {
        this._lockScreenBlockToastNotifications = value;
    }
    /**
     * Sets the lockScreenTimeoutInSeconds property value. Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800
     * @param value Value to set for the lockScreenTimeoutInSeconds property.
     * @return a void
     */
    public void setLockScreenTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this._lockScreenTimeoutInSeconds = value;
    }
    /**
     * Sets the logonBlockFastUserSwitching property value. Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
     * @param value Value to set for the logonBlockFastUserSwitching property.
     * @return a void
     */
    public void setLogonBlockFastUserSwitching(@javax.annotation.Nullable final Boolean value) {
        this._logonBlockFastUserSwitching = value;
    }
    /**
     * Sets the messagingBlockMMS property value. Indicates whether or not to block the MMS send/receive functionality on the device.
     * @param value Value to set for the messagingBlockMMS property.
     * @return a void
     */
    public void setMessagingBlockMMS(@javax.annotation.Nullable final Boolean value) {
        this._messagingBlockMMS = value;
    }
    /**
     * Sets the messagingBlockRichCommunicationServices property value. Indicates whether or not to block the RCS send/receive functionality on the device.
     * @param value Value to set for the messagingBlockRichCommunicationServices property.
     * @return a void
     */
    public void setMessagingBlockRichCommunicationServices(@javax.annotation.Nullable final Boolean value) {
        this._messagingBlockRichCommunicationServices = value;
    }
    /**
     * Sets the messagingBlockSync property value. Indicates whether or not to block text message back up and restore and Messaging Everywhere.
     * @param value Value to set for the messagingBlockSync property.
     * @return a void
     */
    public void setMessagingBlockSync(@javax.annotation.Nullable final Boolean value) {
        this._messagingBlockSync = value;
    }
    /**
     * Sets the microsoftAccountBlocked property value. Indicates whether or not to Block a Microsoft account.
     * @param value Value to set for the microsoftAccountBlocked property.
     * @return a void
     */
    public void setMicrosoftAccountBlocked(@javax.annotation.Nullable final Boolean value) {
        this._microsoftAccountBlocked = value;
    }
    /**
     * Sets the microsoftAccountBlockSettingsSync property value. Indicates whether or not to Block Microsoft account settings sync.
     * @param value Value to set for the microsoftAccountBlockSettingsSync property.
     * @return a void
     */
    public void setMicrosoftAccountBlockSettingsSync(@javax.annotation.Nullable final Boolean value) {
        this._microsoftAccountBlockSettingsSync = value;
    }
    /**
     * Sets the microsoftAccountSignInAssistantSettings property value. Values for the SignInAssistantSettings.
     * @param value Value to set for the microsoftAccountSignInAssistantSettings property.
     * @return a void
     */
    public void setMicrosoftAccountSignInAssistantSettings(@javax.annotation.Nullable final SignInAssistantOptions value) {
        this._microsoftAccountSignInAssistantSettings = value;
    }
    /**
     * Sets the networkProxyApplySettingsDeviceWide property value. If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account that’s enrolled into MDM.
     * @param value Value to set for the networkProxyApplySettingsDeviceWide property.
     * @return a void
     */
    public void setNetworkProxyApplySettingsDeviceWide(@javax.annotation.Nullable final Boolean value) {
        this._networkProxyApplySettingsDeviceWide = value;
    }
    /**
     * Sets the networkProxyAutomaticConfigurationUrl property value. Address to the proxy auto-config (PAC) script you want to use.
     * @param value Value to set for the networkProxyAutomaticConfigurationUrl property.
     * @return a void
     */
    public void setNetworkProxyAutomaticConfigurationUrl(@javax.annotation.Nullable final String value) {
        this._networkProxyAutomaticConfigurationUrl = value;
    }
    /**
     * Sets the networkProxyDisableAutoDetect property value. Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script.
     * @param value Value to set for the networkProxyDisableAutoDetect property.
     * @return a void
     */
    public void setNetworkProxyDisableAutoDetect(@javax.annotation.Nullable final Boolean value) {
        this._networkProxyDisableAutoDetect = value;
    }
    /**
     * Sets the networkProxyServer property value. Specifies manual proxy server settings.
     * @param value Value to set for the networkProxyServer property.
     * @return a void
     */
    public void setNetworkProxyServer(@javax.annotation.Nullable final Windows10NetworkProxyServer value) {
        this._networkProxyServer = value;
    }
    /**
     * Sets the nfcBlocked property value. Indicates whether or not to Block the user from using near field communication.
     * @param value Value to set for the nfcBlocked property.
     * @return a void
     */
    public void setNfcBlocked(@javax.annotation.Nullable final Boolean value) {
        this._nfcBlocked = value;
    }
    /**
     * Sets the oneDriveDisableFileSync property value. Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
     * @param value Value to set for the oneDriveDisableFileSync property.
     * @return a void
     */
    public void setOneDriveDisableFileSync(@javax.annotation.Nullable final Boolean value) {
        this._oneDriveDisableFileSync = value;
    }
    /**
     * Sets the passwordBlockSimple property value. Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords.
     * @param value Value to set for the passwordBlockSimple property.
     * @return a void
     */
    public void setPasswordBlockSimple(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockSimple = value;
    }
    /**
     * Sets the passwordExpirationDays property value. The password expiration in days. Valid values 0 to 730
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumAgeInDays property value. This security setting determines the period of time (in days) that a password must be used before the user can change it. Valid values 0 to 998
     * @param value Value to set for the passwordMinimumAgeInDays property.
     * @return a void
     */
    public void setPasswordMinimumAgeInDays(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumAgeInDays = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     * @return a void
     */
    public void setPasswordMinimumCharacterSetCount(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. The minimum password length. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this._passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent reuse of. Valid values 0 to 50
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this._passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Indicates whether or not to require the user to have a password.
     * @param value Value to set for the passwordRequired property.
     * @return a void
     */
    public void setPasswordRequired(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    public void setPasswordRequiredType(@javax.annotation.Nullable final RequiredPasswordType value) {
        this._passwordRequiredType = value;
    }
    /**
     * Sets the passwordRequireWhenResumeFromIdleState property value. Indicates whether or not to require a password upon resuming from an idle state.
     * @param value Value to set for the passwordRequireWhenResumeFromIdleState property.
     * @return a void
     */
    public void setPasswordRequireWhenResumeFromIdleState(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequireWhenResumeFromIdleState = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset. Valid values 0 to 999
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    public void setPasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this._passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the personalizationDesktopImageUrl property value. A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image.
     * @param value Value to set for the personalizationDesktopImageUrl property.
     * @return a void
     */
    public void setPersonalizationDesktopImageUrl(@javax.annotation.Nullable final String value) {
        this._personalizationDesktopImageUrl = value;
    }
    /**
     * Sets the personalizationLockScreenImageUrl property value. A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a file Url to a local image on the file system that needs to be used as the Lock Screen Image.
     * @param value Value to set for the personalizationLockScreenImageUrl property.
     * @return a void
     */
    public void setPersonalizationLockScreenImageUrl(@javax.annotation.Nullable final String value) {
        this._personalizationLockScreenImageUrl = value;
    }
    /**
     * Sets the powerButtonActionOnBattery property value. Power action types
     * @param value Value to set for the powerButtonActionOnBattery property.
     * @return a void
     */
    public void setPowerButtonActionOnBattery(@javax.annotation.Nullable final PowerActionType value) {
        this._powerButtonActionOnBattery = value;
    }
    /**
     * Sets the powerButtonActionPluggedIn property value. Power action types
     * @param value Value to set for the powerButtonActionPluggedIn property.
     * @return a void
     */
    public void setPowerButtonActionPluggedIn(@javax.annotation.Nullable final PowerActionType value) {
        this._powerButtonActionPluggedIn = value;
    }
    /**
     * Sets the powerHybridSleepOnBattery property value. Possible values of a property
     * @param value Value to set for the powerHybridSleepOnBattery property.
     * @return a void
     */
    public void setPowerHybridSleepOnBattery(@javax.annotation.Nullable final Enablement value) {
        this._powerHybridSleepOnBattery = value;
    }
    /**
     * Sets the powerHybridSleepPluggedIn property value. Possible values of a property
     * @param value Value to set for the powerHybridSleepPluggedIn property.
     * @return a void
     */
    public void setPowerHybridSleepPluggedIn(@javax.annotation.Nullable final Enablement value) {
        this._powerHybridSleepPluggedIn = value;
    }
    /**
     * Sets the powerLidCloseActionOnBattery property value. Power action types
     * @param value Value to set for the powerLidCloseActionOnBattery property.
     * @return a void
     */
    public void setPowerLidCloseActionOnBattery(@javax.annotation.Nullable final PowerActionType value) {
        this._powerLidCloseActionOnBattery = value;
    }
    /**
     * Sets the powerLidCloseActionPluggedIn property value. Power action types
     * @param value Value to set for the powerLidCloseActionPluggedIn property.
     * @return a void
     */
    public void setPowerLidCloseActionPluggedIn(@javax.annotation.Nullable final PowerActionType value) {
        this._powerLidCloseActionPluggedIn = value;
    }
    /**
     * Sets the powerSleepButtonActionOnBattery property value. Power action types
     * @param value Value to set for the powerSleepButtonActionOnBattery property.
     * @return a void
     */
    public void setPowerSleepButtonActionOnBattery(@javax.annotation.Nullable final PowerActionType value) {
        this._powerSleepButtonActionOnBattery = value;
    }
    /**
     * Sets the powerSleepButtonActionPluggedIn property value. Power action types
     * @param value Value to set for the powerSleepButtonActionPluggedIn property.
     * @return a void
     */
    public void setPowerSleepButtonActionPluggedIn(@javax.annotation.Nullable final PowerActionType value) {
        this._powerSleepButtonActionPluggedIn = value;
    }
    /**
     * Sets the printerBlockAddition property value. Prevent user installation of additional printers from printers settings.
     * @param value Value to set for the printerBlockAddition property.
     * @return a void
     */
    public void setPrinterBlockAddition(@javax.annotation.Nullable final Boolean value) {
        this._printerBlockAddition = value;
    }
    /**
     * Sets the printerDefaultName property value. Name (network host name) of an installed printer.
     * @param value Value to set for the printerDefaultName property.
     * @return a void
     */
    public void setPrinterDefaultName(@javax.annotation.Nullable final String value) {
        this._printerDefaultName = value;
    }
    /**
     * Sets the printerNames property value. Automatically provision printers based on their names (network host names).
     * @param value Value to set for the printerNames property.
     * @return a void
     */
    public void setPrinterNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._printerNames = value;
    }
    /**
     * Sets the privacyAccessControls property value. Indicates a list of applications with their access control levels over privacy data categories, and/or the default access levels per category. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the privacyAccessControls property.
     * @return a void
     */
    public void setPrivacyAccessControls(@javax.annotation.Nullable final java.util.List<WindowsPrivacyDataAccessControlItem> value) {
        this._privacyAccessControls = value;
    }
    /**
     * Sets the privacyAdvertisingId property value. State Management Setting.
     * @param value Value to set for the privacyAdvertisingId property.
     * @return a void
     */
    public void setPrivacyAdvertisingId(@javax.annotation.Nullable final StateManagementSetting value) {
        this._privacyAdvertisingId = value;
    }
    /**
     * Sets the privacyAutoAcceptPairingAndConsentPrompts property value. Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps.
     * @param value Value to set for the privacyAutoAcceptPairingAndConsentPrompts property.
     * @return a void
     */
    public void setPrivacyAutoAcceptPairingAndConsentPrompts(@javax.annotation.Nullable final Boolean value) {
        this._privacyAutoAcceptPairingAndConsentPrompts = value;
    }
    /**
     * Sets the privacyBlockActivityFeed property value. Blocks the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @param value Value to set for the privacyBlockActivityFeed property.
     * @return a void
     */
    public void setPrivacyBlockActivityFeed(@javax.annotation.Nullable final Boolean value) {
        this._privacyBlockActivityFeed = value;
    }
    /**
     * Sets the privacyBlockInputPersonalization property value. Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @param value Value to set for the privacyBlockInputPersonalization property.
     * @return a void
     */
    public void setPrivacyBlockInputPersonalization(@javax.annotation.Nullable final Boolean value) {
        this._privacyBlockInputPersonalization = value;
    }
    /**
     * Sets the privacyBlockPublishUserActivities property value. Blocks the shared experiences/discovery of recently used resources in task switcher etc.
     * @param value Value to set for the privacyBlockPublishUserActivities property.
     * @return a void
     */
    public void setPrivacyBlockPublishUserActivities(@javax.annotation.Nullable final Boolean value) {
        this._privacyBlockPublishUserActivities = value;
    }
    /**
     * Sets the privacyDisableLaunchExperience property value. This policy prevents the privacy experience from launching during user logon for new and upgraded users.​
     * @param value Value to set for the privacyDisableLaunchExperience property.
     * @return a void
     */
    public void setPrivacyDisableLaunchExperience(@javax.annotation.Nullable final Boolean value) {
        this._privacyDisableLaunchExperience = value;
    }
    /**
     * Sets the resetProtectionModeBlocked property value. Indicates whether or not to Block the user from reset protection mode.
     * @param value Value to set for the resetProtectionModeBlocked property.
     * @return a void
     */
    public void setResetProtectionModeBlocked(@javax.annotation.Nullable final Boolean value) {
        this._resetProtectionModeBlocked = value;
    }
    /**
     * Sets the safeSearchFilter property value. Specifies what level of safe search (filtering adult content) is required
     * @param value Value to set for the safeSearchFilter property.
     * @return a void
     */
    public void setSafeSearchFilter(@javax.annotation.Nullable final SafeSearchFilterType value) {
        this._safeSearchFilter = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to Block the user from taking Screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this._screenCaptureBlocked = value;
    }
    /**
     * Sets the searchBlockDiacritics property value. Specifies if search can use diacritics.
     * @param value Value to set for the searchBlockDiacritics property.
     * @return a void
     */
    public void setSearchBlockDiacritics(@javax.annotation.Nullable final Boolean value) {
        this._searchBlockDiacritics = value;
    }
    /**
     * Sets the searchBlockWebResults property value. Indicates whether or not to block the web search.
     * @param value Value to set for the searchBlockWebResults property.
     * @return a void
     */
    public void setSearchBlockWebResults(@javax.annotation.Nullable final Boolean value) {
        this._searchBlockWebResults = value;
    }
    /**
     * Sets the searchDisableAutoLanguageDetection property value. Specifies whether to use automatic language detection when indexing content and properties.
     * @param value Value to set for the searchDisableAutoLanguageDetection property.
     * @return a void
     */
    public void setSearchDisableAutoLanguageDetection(@javax.annotation.Nullable final Boolean value) {
        this._searchDisableAutoLanguageDetection = value;
    }
    /**
     * Sets the searchDisableIndexerBackoff property value. Indicates whether or not to disable the search indexer backoff feature.
     * @param value Value to set for the searchDisableIndexerBackoff property.
     * @return a void
     */
    public void setSearchDisableIndexerBackoff(@javax.annotation.Nullable final Boolean value) {
        this._searchDisableIndexerBackoff = value;
    }
    /**
     * Sets the searchDisableIndexingEncryptedItems property value. Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer.
     * @param value Value to set for the searchDisableIndexingEncryptedItems property.
     * @return a void
     */
    public void setSearchDisableIndexingEncryptedItems(@javax.annotation.Nullable final Boolean value) {
        this._searchDisableIndexingEncryptedItems = value;
    }
    /**
     * Sets the searchDisableIndexingRemovableDrive property value. Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
     * @param value Value to set for the searchDisableIndexingRemovableDrive property.
     * @return a void
     */
    public void setSearchDisableIndexingRemovableDrive(@javax.annotation.Nullable final Boolean value) {
        this._searchDisableIndexingRemovableDrive = value;
    }
    /**
     * Sets the searchDisableLocation property value. Specifies if search can use location information.
     * @param value Value to set for the searchDisableLocation property.
     * @return a void
     */
    public void setSearchDisableLocation(@javax.annotation.Nullable final Boolean value) {
        this._searchDisableLocation = value;
    }
    /**
     * Sets the searchDisableUseLocation property value. Specifies if search can use location information.
     * @param value Value to set for the searchDisableUseLocation property.
     * @return a void
     */
    public void setSearchDisableUseLocation(@javax.annotation.Nullable final Boolean value) {
        this._searchDisableUseLocation = value;
    }
    /**
     * Sets the searchEnableAutomaticIndexSizeManangement property value. Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
     * @param value Value to set for the searchEnableAutomaticIndexSizeManangement property.
     * @return a void
     */
    public void setSearchEnableAutomaticIndexSizeManangement(@javax.annotation.Nullable final Boolean value) {
        this._searchEnableAutomaticIndexSizeManangement = value;
    }
    /**
     * Sets the searchEnableRemoteQueries property value. Indicates whether or not to block remote queries of this computer’s index.
     * @param value Value to set for the searchEnableRemoteQueries property.
     * @return a void
     */
    public void setSearchEnableRemoteQueries(@javax.annotation.Nullable final Boolean value) {
        this._searchEnableRemoteQueries = value;
    }
    /**
     * Sets the securityBlockAzureADJoinedDevicesAutoEncryption property value. Specify whether to allow automatic device encryption during OOBE when the device is Azure AD joined (desktop only).
     * @param value Value to set for the securityBlockAzureADJoinedDevicesAutoEncryption property.
     * @return a void
     */
    public void setSecurityBlockAzureADJoinedDevicesAutoEncryption(@javax.annotation.Nullable final Boolean value) {
        this._securityBlockAzureADJoinedDevicesAutoEncryption = value;
    }
    /**
     * Sets the settingsBlockAccountsPage property value. Indicates whether or not to block access to Accounts in Settings app.
     * @param value Value to set for the settingsBlockAccountsPage property.
     * @return a void
     */
    public void setSettingsBlockAccountsPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockAccountsPage = value;
    }
    /**
     * Sets the settingsBlockAddProvisioningPackage property value. Indicates whether or not to block the user from installing provisioning packages.
     * @param value Value to set for the settingsBlockAddProvisioningPackage property.
     * @return a void
     */
    public void setSettingsBlockAddProvisioningPackage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockAddProvisioningPackage = value;
    }
    /**
     * Sets the settingsBlockAppsPage property value. Indicates whether or not to block access to Apps in Settings app.
     * @param value Value to set for the settingsBlockAppsPage property.
     * @return a void
     */
    public void setSettingsBlockAppsPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockAppsPage = value;
    }
    /**
     * Sets the settingsBlockChangeLanguage property value. Indicates whether or not to block the user from changing the language settings.
     * @param value Value to set for the settingsBlockChangeLanguage property.
     * @return a void
     */
    public void setSettingsBlockChangeLanguage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockChangeLanguage = value;
    }
    /**
     * Sets the settingsBlockChangePowerSleep property value. Indicates whether or not to block the user from changing power and sleep settings.
     * @param value Value to set for the settingsBlockChangePowerSleep property.
     * @return a void
     */
    public void setSettingsBlockChangePowerSleep(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockChangePowerSleep = value;
    }
    /**
     * Sets the settingsBlockChangeRegion property value. Indicates whether or not to block the user from changing the region settings.
     * @param value Value to set for the settingsBlockChangeRegion property.
     * @return a void
     */
    public void setSettingsBlockChangeRegion(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockChangeRegion = value;
    }
    /**
     * Sets the settingsBlockChangeSystemTime property value. Indicates whether or not to block the user from changing date and time settings.
     * @param value Value to set for the settingsBlockChangeSystemTime property.
     * @return a void
     */
    public void setSettingsBlockChangeSystemTime(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockChangeSystemTime = value;
    }
    /**
     * Sets the settingsBlockDevicesPage property value. Indicates whether or not to block access to Devices in Settings app.
     * @param value Value to set for the settingsBlockDevicesPage property.
     * @return a void
     */
    public void setSettingsBlockDevicesPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockDevicesPage = value;
    }
    /**
     * Sets the settingsBlockEaseOfAccessPage property value. Indicates whether or not to block access to Ease of Access in Settings app.
     * @param value Value to set for the settingsBlockEaseOfAccessPage property.
     * @return a void
     */
    public void setSettingsBlockEaseOfAccessPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockEaseOfAccessPage = value;
    }
    /**
     * Sets the settingsBlockEditDeviceName property value. Indicates whether or not to block the user from editing the device name.
     * @param value Value to set for the settingsBlockEditDeviceName property.
     * @return a void
     */
    public void setSettingsBlockEditDeviceName(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockEditDeviceName = value;
    }
    /**
     * Sets the settingsBlockGamingPage property value. Indicates whether or not to block access to Gaming in Settings app.
     * @param value Value to set for the settingsBlockGamingPage property.
     * @return a void
     */
    public void setSettingsBlockGamingPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockGamingPage = value;
    }
    /**
     * Sets the settingsBlockNetworkInternetPage property value. Indicates whether or not to block access to Network & Internet in Settings app.
     * @param value Value to set for the settingsBlockNetworkInternetPage property.
     * @return a void
     */
    public void setSettingsBlockNetworkInternetPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockNetworkInternetPage = value;
    }
    /**
     * Sets the settingsBlockPersonalizationPage property value. Indicates whether or not to block access to Personalization in Settings app.
     * @param value Value to set for the settingsBlockPersonalizationPage property.
     * @return a void
     */
    public void setSettingsBlockPersonalizationPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockPersonalizationPage = value;
    }
    /**
     * Sets the settingsBlockPrivacyPage property value. Indicates whether or not to block access to Privacy in Settings app.
     * @param value Value to set for the settingsBlockPrivacyPage property.
     * @return a void
     */
    public void setSettingsBlockPrivacyPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockPrivacyPage = value;
    }
    /**
     * Sets the settingsBlockRemoveProvisioningPackage property value. Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
     * @param value Value to set for the settingsBlockRemoveProvisioningPackage property.
     * @return a void
     */
    public void setSettingsBlockRemoveProvisioningPackage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockRemoveProvisioningPackage = value;
    }
    /**
     * Sets the settingsBlockSettingsApp property value. Indicates whether or not to block access to Settings app.
     * @param value Value to set for the settingsBlockSettingsApp property.
     * @return a void
     */
    public void setSettingsBlockSettingsApp(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockSettingsApp = value;
    }
    /**
     * Sets the settingsBlockSystemPage property value. Indicates whether or not to block access to System in Settings app.
     * @param value Value to set for the settingsBlockSystemPage property.
     * @return a void
     */
    public void setSettingsBlockSystemPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockSystemPage = value;
    }
    /**
     * Sets the settingsBlockTimeLanguagePage property value. Indicates whether or not to block access to Time & Language in Settings app.
     * @param value Value to set for the settingsBlockTimeLanguagePage property.
     * @return a void
     */
    public void setSettingsBlockTimeLanguagePage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockTimeLanguagePage = value;
    }
    /**
     * Sets the settingsBlockUpdateSecurityPage property value. Indicates whether or not to block access to Update & Security in Settings app.
     * @param value Value to set for the settingsBlockUpdateSecurityPage property.
     * @return a void
     */
    public void setSettingsBlockUpdateSecurityPage(@javax.annotation.Nullable final Boolean value) {
        this._settingsBlockUpdateSecurityPage = value;
    }
    /**
     * Sets the sharedUserAppDataAllowed property value. Indicates whether or not to block multiple users of the same app to share data.
     * @param value Value to set for the sharedUserAppDataAllowed property.
     * @return a void
     */
    public void setSharedUserAppDataAllowed(@javax.annotation.Nullable final Boolean value) {
        this._sharedUserAppDataAllowed = value;
    }
    /**
     * Sets the smartScreenAppInstallControl property value. App Install control Setting
     * @param value Value to set for the smartScreenAppInstallControl property.
     * @return a void
     */
    public void setSmartScreenAppInstallControl(@javax.annotation.Nullable final AppInstallControlType value) {
        this._smartScreenAppInstallControl = value;
    }
    /**
     * Sets the smartScreenBlockPromptOverride property value. Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
     * @param value Value to set for the smartScreenBlockPromptOverride property.
     * @return a void
     */
    public void setSmartScreenBlockPromptOverride(@javax.annotation.Nullable final Boolean value) {
        this._smartScreenBlockPromptOverride = value;
    }
    /**
     * Sets the smartScreenBlockPromptOverrideForFiles property value. Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
     * @param value Value to set for the smartScreenBlockPromptOverrideForFiles property.
     * @return a void
     */
    public void setSmartScreenBlockPromptOverrideForFiles(@javax.annotation.Nullable final Boolean value) {
        this._smartScreenBlockPromptOverrideForFiles = value;
    }
    /**
     * Sets the smartScreenEnableAppInstallControl property value. This property will be deprecated in July 2019 and will be replaced by property SmartScreenAppInstallControl. Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
     * @param value Value to set for the smartScreenEnableAppInstallControl property.
     * @return a void
     */
    public void setSmartScreenEnableAppInstallControl(@javax.annotation.Nullable final Boolean value) {
        this._smartScreenEnableAppInstallControl = value;
    }
    /**
     * Sets the startBlockUnpinningAppsFromTaskbar property value. Indicates whether or not to block the user from unpinning apps from taskbar.
     * @param value Value to set for the startBlockUnpinningAppsFromTaskbar property.
     * @return a void
     */
    public void setStartBlockUnpinningAppsFromTaskbar(@javax.annotation.Nullable final Boolean value) {
        this._startBlockUnpinningAppsFromTaskbar = value;
    }
    /**
     * Sets the startMenuAppListVisibility property value. Type of start menu app list visibility.
     * @param value Value to set for the startMenuAppListVisibility property.
     * @return a void
     */
    public void setStartMenuAppListVisibility(@javax.annotation.Nullable final WindowsStartMenuAppListVisibilityType value) {
        this._startMenuAppListVisibility = value;
    }
    /**
     * Sets the startMenuHideChangeAccountSettings property value. Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideChangeAccountSettings property.
     * @return a void
     */
    public void setStartMenuHideChangeAccountSettings(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideChangeAccountSettings = value;
    }
    /**
     * Sets the startMenuHideFrequentlyUsedApps property value. Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideFrequentlyUsedApps property.
     * @return a void
     */
    public void setStartMenuHideFrequentlyUsedApps(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideFrequentlyUsedApps = value;
    }
    /**
     * Sets the startMenuHideHibernate property value. Enabling this policy hides hibernate from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideHibernate property.
     * @return a void
     */
    public void setStartMenuHideHibernate(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideHibernate = value;
    }
    /**
     * Sets the startMenuHideLock property value. Enabling this policy hides lock from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideLock property.
     * @return a void
     */
    public void setStartMenuHideLock(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideLock = value;
    }
    /**
     * Sets the startMenuHidePowerButton property value. Enabling this policy hides the power button from appearing in the start menu.
     * @param value Value to set for the startMenuHidePowerButton property.
     * @return a void
     */
    public void setStartMenuHidePowerButton(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHidePowerButton = value;
    }
    /**
     * Sets the startMenuHideRecentJumpLists property value. Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideRecentJumpLists property.
     * @return a void
     */
    public void setStartMenuHideRecentJumpLists(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideRecentJumpLists = value;
    }
    /**
     * Sets the startMenuHideRecentlyAddedApps property value. Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideRecentlyAddedApps property.
     * @return a void
     */
    public void setStartMenuHideRecentlyAddedApps(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideRecentlyAddedApps = value;
    }
    /**
     * Sets the startMenuHideRestartOptions property value. Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideRestartOptions property.
     * @return a void
     */
    public void setStartMenuHideRestartOptions(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideRestartOptions = value;
    }
    /**
     * Sets the startMenuHideShutDown property value. Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideShutDown property.
     * @return a void
     */
    public void setStartMenuHideShutDown(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideShutDown = value;
    }
    /**
     * Sets the startMenuHideSignOut property value. Enabling this policy hides sign out from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideSignOut property.
     * @return a void
     */
    public void setStartMenuHideSignOut(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideSignOut = value;
    }
    /**
     * Sets the startMenuHideSleep property value. Enabling this policy hides sleep from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideSleep property.
     * @return a void
     */
    public void setStartMenuHideSleep(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideSleep = value;
    }
    /**
     * Sets the startMenuHideSwitchAccount property value. Enabling this policy hides switch account from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideSwitchAccount property.
     * @return a void
     */
    public void setStartMenuHideSwitchAccount(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideSwitchAccount = value;
    }
    /**
     * Sets the startMenuHideUserTile property value. Enabling this policy hides the user tile from appearing in the start menu.
     * @param value Value to set for the startMenuHideUserTile property.
     * @return a void
     */
    public void setStartMenuHideUserTile(@javax.annotation.Nullable final Boolean value) {
        this._startMenuHideUserTile = value;
    }
    /**
     * Sets the startMenuLayoutEdgeAssetsXml property value. This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array.
     * @param value Value to set for the startMenuLayoutEdgeAssetsXml property.
     * @return a void
     */
    public void setStartMenuLayoutEdgeAssetsXml(@javax.annotation.Nullable final byte[] value) {
        this._startMenuLayoutEdgeAssetsXml = value;
    }
    /**
     * Sets the startMenuLayoutXml property value. Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
     * @param value Value to set for the startMenuLayoutXml property.
     * @return a void
     */
    public void setStartMenuLayoutXml(@javax.annotation.Nullable final byte[] value) {
        this._startMenuLayoutXml = value;
    }
    /**
     * Sets the startMenuMode property value. Type of display modes for the start menu.
     * @param value Value to set for the startMenuMode property.
     * @return a void
     */
    public void setStartMenuMode(@javax.annotation.Nullable final WindowsStartMenuModeType value) {
        this._startMenuMode = value;
    }
    /**
     * Sets the startMenuPinnedFolderDocuments property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderDocuments property.
     * @return a void
     */
    public void setStartMenuPinnedFolderDocuments(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderDocuments = value;
    }
    /**
     * Sets the startMenuPinnedFolderDownloads property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderDownloads property.
     * @return a void
     */
    public void setStartMenuPinnedFolderDownloads(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderDownloads = value;
    }
    /**
     * Sets the startMenuPinnedFolderFileExplorer property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderFileExplorer property.
     * @return a void
     */
    public void setStartMenuPinnedFolderFileExplorer(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderFileExplorer = value;
    }
    /**
     * Sets the startMenuPinnedFolderHomeGroup property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderHomeGroup property.
     * @return a void
     */
    public void setStartMenuPinnedFolderHomeGroup(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderHomeGroup = value;
    }
    /**
     * Sets the startMenuPinnedFolderMusic property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderMusic property.
     * @return a void
     */
    public void setStartMenuPinnedFolderMusic(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderMusic = value;
    }
    /**
     * Sets the startMenuPinnedFolderNetwork property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderNetwork property.
     * @return a void
     */
    public void setStartMenuPinnedFolderNetwork(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderNetwork = value;
    }
    /**
     * Sets the startMenuPinnedFolderPersonalFolder property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderPersonalFolder property.
     * @return a void
     */
    public void setStartMenuPinnedFolderPersonalFolder(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderPersonalFolder = value;
    }
    /**
     * Sets the startMenuPinnedFolderPictures property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderPictures property.
     * @return a void
     */
    public void setStartMenuPinnedFolderPictures(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderPictures = value;
    }
    /**
     * Sets the startMenuPinnedFolderSettings property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderSettings property.
     * @return a void
     */
    public void setStartMenuPinnedFolderSettings(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderSettings = value;
    }
    /**
     * Sets the startMenuPinnedFolderVideos property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderVideos property.
     * @return a void
     */
    public void setStartMenuPinnedFolderVideos(@javax.annotation.Nullable final VisibilitySetting value) {
        this._startMenuPinnedFolderVideos = value;
    }
    /**
     * Sets the storageBlockRemovableStorage property value. Indicates whether or not to Block the user from using removable storage.
     * @param value Value to set for the storageBlockRemovableStorage property.
     * @return a void
     */
    public void setStorageBlockRemovableStorage(@javax.annotation.Nullable final Boolean value) {
        this._storageBlockRemovableStorage = value;
    }
    /**
     * Sets the storageRequireMobileDeviceEncryption property value. Indicating whether or not to require encryption on a mobile device.
     * @param value Value to set for the storageRequireMobileDeviceEncryption property.
     * @return a void
     */
    public void setStorageRequireMobileDeviceEncryption(@javax.annotation.Nullable final Boolean value) {
        this._storageRequireMobileDeviceEncryption = value;
    }
    /**
     * Sets the storageRestrictAppDataToSystemVolume property value. Indicates whether application data is restricted to the system drive.
     * @param value Value to set for the storageRestrictAppDataToSystemVolume property.
     * @return a void
     */
    public void setStorageRestrictAppDataToSystemVolume(@javax.annotation.Nullable final Boolean value) {
        this._storageRestrictAppDataToSystemVolume = value;
    }
    /**
     * Sets the storageRestrictAppInstallToSystemVolume property value. Indicates whether the installation of applications is restricted to the system drive.
     * @param value Value to set for the storageRestrictAppInstallToSystemVolume property.
     * @return a void
     */
    public void setStorageRestrictAppInstallToSystemVolume(@javax.annotation.Nullable final Boolean value) {
        this._storageRestrictAppInstallToSystemVolume = value;
    }
    /**
     * Sets the systemTelemetryProxyServer property value. Gets or sets the fully qualified domain name (FQDN) or IP address of a proxy server to forward Connected User Experiences and Telemetry requests.
     * @param value Value to set for the systemTelemetryProxyServer property.
     * @return a void
     */
    public void setSystemTelemetryProxyServer(@javax.annotation.Nullable final String value) {
        this._systemTelemetryProxyServer = value;
    }
    /**
     * Sets the taskManagerBlockEndTask property value. Specify whether non-administrators can use Task Manager to end tasks.
     * @param value Value to set for the taskManagerBlockEndTask property.
     * @return a void
     */
    public void setTaskManagerBlockEndTask(@javax.annotation.Nullable final Boolean value) {
        this._taskManagerBlockEndTask = value;
    }
    /**
     * Sets the tenantLockdownRequireNetworkDuringOutOfBoxExperience property value. Whether the device is required to connect to the network.
     * @param value Value to set for the tenantLockdownRequireNetworkDuringOutOfBoxExperience property.
     * @return a void
     */
    public void setTenantLockdownRequireNetworkDuringOutOfBoxExperience(@javax.annotation.Nullable final Boolean value) {
        this._tenantLockdownRequireNetworkDuringOutOfBoxExperience = value;
    }
    /**
     * Sets the uninstallBuiltInApps property value. Indicates whether or not to uninstall a fixed list of built-in Windows apps.
     * @param value Value to set for the uninstallBuiltInApps property.
     * @return a void
     */
    public void setUninstallBuiltInApps(@javax.annotation.Nullable final Boolean value) {
        this._uninstallBuiltInApps = value;
    }
    /**
     * Sets the usbBlocked property value. Indicates whether or not to Block the user from USB connection.
     * @param value Value to set for the usbBlocked property.
     * @return a void
     */
    public void setUsbBlocked(@javax.annotation.Nullable final Boolean value) {
        this._usbBlocked = value;
    }
    /**
     * Sets the voiceRecordingBlocked property value. Indicates whether or not to Block the user from voice recording.
     * @param value Value to set for the voiceRecordingBlocked property.
     * @return a void
     */
    public void setVoiceRecordingBlocked(@javax.annotation.Nullable final Boolean value) {
        this._voiceRecordingBlocked = value;
    }
    /**
     * Sets the webRtcBlockLocalhostIpAddress property value. Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
     * @param value Value to set for the webRtcBlockLocalhostIpAddress property.
     * @return a void
     */
    public void setWebRtcBlockLocalhostIpAddress(@javax.annotation.Nullable final Boolean value) {
        this._webRtcBlockLocalhostIpAddress = value;
    }
    /**
     * Sets the wiFiBlockAutomaticConnectHotspots property value. Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     * @param value Value to set for the wiFiBlockAutomaticConnectHotspots property.
     * @return a void
     */
    public void setWiFiBlockAutomaticConnectHotspots(@javax.annotation.Nullable final Boolean value) {
        this._wiFiBlockAutomaticConnectHotspots = value;
    }
    /**
     * Sets the wiFiBlocked property value. Indicates whether or not to Block the user from using Wi-Fi.
     * @param value Value to set for the wiFiBlocked property.
     * @return a void
     */
    public void setWiFiBlocked(@javax.annotation.Nullable final Boolean value) {
        this._wiFiBlocked = value;
    }
    /**
     * Sets the wiFiBlockManualConfiguration property value. Indicates whether or not to Block the user from using Wi-Fi manual configuration.
     * @param value Value to set for the wiFiBlockManualConfiguration property.
     * @return a void
     */
    public void setWiFiBlockManualConfiguration(@javax.annotation.Nullable final Boolean value) {
        this._wiFiBlockManualConfiguration = value;
    }
    /**
     * Sets the wiFiScanInterval property value. Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500
     * @param value Value to set for the wiFiScanInterval property.
     * @return a void
     */
    public void setWiFiScanInterval(@javax.annotation.Nullable final Integer value) {
        this._wiFiScanInterval = value;
    }
    /**
     * Sets the windows10AppsForceUpdateSchedule property value. Windows 10 force update schedule for Apps.
     * @param value Value to set for the windows10AppsForceUpdateSchedule property.
     * @return a void
     */
    public void setWindows10AppsForceUpdateSchedule(@javax.annotation.Nullable final Windows10AppsForceUpdateSchedule value) {
        this._windows10AppsForceUpdateSchedule = value;
    }
    /**
     * Sets the windowsSpotlightBlockConsumerSpecificFeatures property value. Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles.
     * @param value Value to set for the windowsSpotlightBlockConsumerSpecificFeatures property.
     * @return a void
     */
    public void setWindowsSpotlightBlockConsumerSpecificFeatures(@javax.annotation.Nullable final Boolean value) {
        this._windowsSpotlightBlockConsumerSpecificFeatures = value;
    }
    /**
     * Sets the windowsSpotlightBlocked property value. Allows IT admins to turn off all Windows Spotlight features
     * @param value Value to set for the windowsSpotlightBlocked property.
     * @return a void
     */
    public void setWindowsSpotlightBlocked(@javax.annotation.Nullable final Boolean value) {
        this._windowsSpotlightBlocked = value;
    }
    /**
     * Sets the windowsSpotlightBlockOnActionCenter property value. Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed
     * @param value Value to set for the windowsSpotlightBlockOnActionCenter property.
     * @return a void
     */
    public void setWindowsSpotlightBlockOnActionCenter(@javax.annotation.Nullable final Boolean value) {
        this._windowsSpotlightBlockOnActionCenter = value;
    }
    /**
     * Sets the windowsSpotlightBlockTailoredExperiences property value. Block personalized content in Windows spotlight based on user’s device usage.
     * @param value Value to set for the windowsSpotlightBlockTailoredExperiences property.
     * @return a void
     */
    public void setWindowsSpotlightBlockTailoredExperiences(@javax.annotation.Nullable final Boolean value) {
        this._windowsSpotlightBlockTailoredExperiences = value;
    }
    /**
     * Sets the windowsSpotlightBlockThirdPartyNotifications property value. Block third party content delivered via Windows Spotlight
     * @param value Value to set for the windowsSpotlightBlockThirdPartyNotifications property.
     * @return a void
     */
    public void setWindowsSpotlightBlockThirdPartyNotifications(@javax.annotation.Nullable final Boolean value) {
        this._windowsSpotlightBlockThirdPartyNotifications = value;
    }
    /**
     * Sets the windowsSpotlightBlockWelcomeExperience property value. Block Windows Spotlight Windows welcome experience
     * @param value Value to set for the windowsSpotlightBlockWelcomeExperience property.
     * @return a void
     */
    public void setWindowsSpotlightBlockWelcomeExperience(@javax.annotation.Nullable final Boolean value) {
        this._windowsSpotlightBlockWelcomeExperience = value;
    }
    /**
     * Sets the windowsSpotlightBlockWindowsTips property value. Allows IT admins to turn off the popup of Windows Tips.
     * @param value Value to set for the windowsSpotlightBlockWindowsTips property.
     * @return a void
     */
    public void setWindowsSpotlightBlockWindowsTips(@javax.annotation.Nullable final Boolean value) {
        this._windowsSpotlightBlockWindowsTips = value;
    }
    /**
     * Sets the windowsSpotlightConfigureOnLockScreen property value. Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     * @param value Value to set for the windowsSpotlightConfigureOnLockScreen property.
     * @return a void
     */
    public void setWindowsSpotlightConfigureOnLockScreen(@javax.annotation.Nullable final WindowsSpotlightEnablementSettings value) {
        this._windowsSpotlightConfigureOnLockScreen = value;
    }
    /**
     * Sets the windowsStoreBlockAutoUpdate property value. Indicates whether or not to block automatic update of apps from Windows Store.
     * @param value Value to set for the windowsStoreBlockAutoUpdate property.
     * @return a void
     */
    public void setWindowsStoreBlockAutoUpdate(@javax.annotation.Nullable final Boolean value) {
        this._windowsStoreBlockAutoUpdate = value;
    }
    /**
     * Sets the windowsStoreBlocked property value. Indicates whether or not to Block the user from using the Windows store.
     * @param value Value to set for the windowsStoreBlocked property.
     * @return a void
     */
    public void setWindowsStoreBlocked(@javax.annotation.Nullable final Boolean value) {
        this._windowsStoreBlocked = value;
    }
    /**
     * Sets the windowsStoreEnablePrivateStoreOnly property value. Indicates whether or not to enable Private Store Only.
     * @param value Value to set for the windowsStoreEnablePrivateStoreOnly property.
     * @return a void
     */
    public void setWindowsStoreEnablePrivateStoreOnly(@javax.annotation.Nullable final Boolean value) {
        this._windowsStoreEnablePrivateStoreOnly = value;
    }
    /**
     * Sets the wirelessDisplayBlockProjectionToThisDevice property value. Indicates whether or not to allow other devices from discovering this PC for projection.
     * @param value Value to set for the wirelessDisplayBlockProjectionToThisDevice property.
     * @return a void
     */
    public void setWirelessDisplayBlockProjectionToThisDevice(@javax.annotation.Nullable final Boolean value) {
        this._wirelessDisplayBlockProjectionToThisDevice = value;
    }
    /**
     * Sets the wirelessDisplayBlockUserInputFromReceiver property value. Indicates whether or not to allow user input from wireless display receiver.
     * @param value Value to set for the wirelessDisplayBlockUserInputFromReceiver property.
     * @return a void
     */
    public void setWirelessDisplayBlockUserInputFromReceiver(@javax.annotation.Nullable final Boolean value) {
        this._wirelessDisplayBlockUserInputFromReceiver = value;
    }
    /**
     * Sets the wirelessDisplayRequirePinForPairing property value. Indicates whether or not to require a PIN for new devices to initiate pairing.
     * @param value Value to set for the wirelessDisplayRequirePinForPairing property.
     * @return a void
     */
    public void setWirelessDisplayRequirePinForPairing(@javax.annotation.Nullable final Boolean value) {
        this._wirelessDisplayRequirePinForPairing = value;
    }
}
