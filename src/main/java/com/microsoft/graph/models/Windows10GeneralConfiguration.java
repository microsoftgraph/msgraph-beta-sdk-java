package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10GeneralConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account.
     */
    private Boolean accountsBlockAddingNonMicrosoftAccountEmail;
    /**
     * Possible values of a property
     */
    private Enablement activateAppsWithVoice;
    /**
     * Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
     */
    private Boolean antiTheftModeBlocked;
    /**
     * This policy setting permits users to change installation options that typically are available only to system administrators.
     */
    private Boolean appManagementMSIAllowUserControlOverInstall;
    /**
     * This policy setting directs Windows Installer to use elevated permissions when it installs any program on the system.
     */
    private Boolean appManagementMSIAlwaysInstallWithElevatedPrivileges;
    /**
     * List of semi-colon delimited Package Family Names of Windows apps. Listed Windows apps are to be launched after logon.
     */
    private java.util.List<String> appManagementPackageFamilyNamesToLaunchAfterLogOn;
    /**
     * State Management Setting.
     */
    private StateManagementSetting appsAllowTrustedAppsSideloading;
    /**
     * Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded.
     */
    private Boolean appsBlockWindowsStoreOriginatedApps;
    /**
     * Allows secondary authentication devices to work with Windows.
     */
    private Boolean authenticationAllowSecondaryDevice;
    /**
     * Specifies the preferred domain among available domains in the Azure AD tenant.
     */
    private String authenticationPreferredAzureADTenantDomainName;
    /**
     * Possible values of a property
     */
    private Enablement authenticationWebSignIn;
    /**
     * Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
     */
    private java.util.List<String> bluetoothAllowedServices;
    /**
     * Whether or not to Block the user from using bluetooth advertising.
     */
    private Boolean bluetoothBlockAdvertising;
    /**
     * Whether or not to Block the user from using bluetooth discoverable mode.
     */
    private Boolean bluetoothBlockDiscoverableMode;
    /**
     * Whether or not to Block the user from using bluetooth.
     */
    private Boolean bluetoothBlocked;
    /**
     * Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
     */
    private Boolean bluetoothBlockPrePairing;
    /**
     * Whether or not to block the users from using Swift Pair and other proximity based scenarios.
     */
    private Boolean bluetoothBlockPromptedProximalConnections;
    /**
     * Whether or not to Block the user from accessing the camera of the device.
     */
    private Boolean cameraBlocked;
    /**
     * Whether or not to Block the user from using data over cellular while roaming.
     */
    private Boolean cellularBlockDataWhenRoaming;
    /**
     * Whether or not to Block the user from using VPN over cellular.
     */
    private Boolean cellularBlockVpn;
    /**
     * Whether or not to Block the user from using VPN when roaming over cellular.
     */
    private Boolean cellularBlockVpnWhenRoaming;
    /**
     * Possible values of the ConfigurationUsage list.
     */
    private ConfigurationUsage cellularData;
    /**
     * Whether or not to Block the user from doing manual root certificate installation.
     */
    private Boolean certificatesBlockManualRootCertificateInstallation;
    /**
     * Specifies the time zone to be applied to the device. This is the standard Windows name for the target time zone.
     */
    private String configureTimeZone;
    /**
     * Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences.
     */
    private Boolean connectedDevicesServiceBlocked;
    /**
     * Whether or not to Block the user from using copy paste.
     */
    private Boolean copyPasteBlocked;
    /**
     * Whether or not to Block the user from using Cortana.
     */
    private Boolean cortanaBlocked;
    /**
     * Specify whether to allow or disallow the Federal Information Processing Standard (FIPS) policy.
     */
    private Boolean cryptographyAllowFipsAlgorithmPolicy;
    /**
     * This policy setting allows you to block direct memory access (DMA) for all hot pluggable PCI downstream ports until a user logs into Windows.
     */
    private Boolean dataProtectionBlockDirectMemoryAccess;
    /**
     * Whether or not to block end user access to Defender.
     */
    private Boolean defenderBlockEndUserAccess;
    /**
     * Allows or disallows Windows Defender On Access Protection functionality.
     */
    private Boolean defenderBlockOnAccessProtection;
    /**
     * Possible values of Cloud Block Level
     */
    private DefenderCloudBlockLevelType defenderCloudBlockLevel;
    /**
     * Timeout extension for file scanning by the cloud. Valid values 0 to 50
     */
    private Integer defenderCloudExtendedTimeout;
    /**
     * Timeout extension for file scanning by the cloud. Valid values 0 to 50
     */
    private Integer defenderCloudExtendedTimeoutInSeconds;
    /**
     * Number of days before deleting quarantined malware. Valid values 0 to 90
     */
    private Integer defenderDaysBeforeDeletingQuarantinedMalware;
    /**
     * Gets or sets Defenders actions to take on detected Malware per threat level.
     */
    private DefenderDetectedMalwareActions defenderDetectedMalwareActions;
    /**
     * When blocked, catch-up scans for scheduled full scans will be turned off.
     */
    private Boolean defenderDisableCatchupFullScan;
    /**
     * When blocked, catch-up scans for scheduled quick scans will be turned off.
     */
    private Boolean defenderDisableCatchupQuickScan;
    /**
     * File extensions to exclude from scans and real time protection.
     */
    private java.util.List<String> defenderFileExtensionsToExclude;
    /**
     * Files and folder to exclude from scans and real time protection.
     */
    private java.util.List<String> defenderFilesAndFoldersToExclude;
    /**
     * Possible values for monitoring file activity.
     */
    private DefenderMonitorFileActivity defenderMonitorFileActivity;
    /**
     * Gets or sets Defenders action to take on Potentially Unwanted Application (PUA), which includes software with behaviors of ad-injection, software bundling, persistent solicitation for payment or subscription, etc. Defender alerts user when PUA is being downloaded or attempts to install itself. Added in Windows 10 for desktop. Possible values are: deviceDefault, block, audit.
     */
    private DefenderPotentiallyUnwantedAppAction defenderPotentiallyUnwantedAppAction;
    /**
     * Possible values of Defender PUA Protection
     */
    private DefenderProtectionType defenderPotentiallyUnwantedAppActionSetting;
    /**
     * Processes to exclude from scans and real time protection.
     */
    private java.util.List<String> defenderProcessesToExclude;
    /**
     * Possible values for prompting user for samples submission.
     */
    private DefenderPromptForSampleSubmission defenderPromptForSampleSubmission;
    /**
     * Indicates whether or not to require behavior monitoring.
     */
    private Boolean defenderRequireBehaviorMonitoring;
    /**
     * Indicates whether or not to require cloud protection.
     */
    private Boolean defenderRequireCloudProtection;
    /**
     * Indicates whether or not to require network inspection system.
     */
    private Boolean defenderRequireNetworkInspectionSystem;
    /**
     * Indicates whether or not to require real time monitoring.
     */
    private Boolean defenderRequireRealTimeMonitoring;
    /**
     * Indicates whether or not to scan archive files.
     */
    private Boolean defenderScanArchiveFiles;
    /**
     * Indicates whether or not to scan downloads.
     */
    private Boolean defenderScanDownloads;
    /**
     * Indicates whether or not to scan incoming mail messages.
     */
    private Boolean defenderScanIncomingMail;
    /**
     * Indicates whether or not to scan mapped network drives during full scan.
     */
    private Boolean defenderScanMappedNetworkDrivesDuringFullScan;
    /**
     * Max CPU usage percentage during scan. Valid values 0 to 100
     */
    private Integer defenderScanMaxCpu;
    /**
     * Indicates whether or not to scan files opened from a network folder.
     */
    private Boolean defenderScanNetworkFiles;
    /**
     * Indicates whether or not to scan removable drives during full scan.
     */
    private Boolean defenderScanRemovableDrivesDuringFullScan;
    /**
     * Indicates whether or not to scan scripts loaded in Internet Explorer browser.
     */
    private Boolean defenderScanScriptsLoadedInInternetExplorer;
    /**
     * Possible values for system scan type.
     */
    private DefenderScanType defenderScanType;
    /**
     * The time to perform a daily quick scan.
     */
    private LocalTime defenderScheduledQuickScanTime;
    /**
     * The defender time for the system scan.
     */
    private LocalTime defenderScheduledScanTime;
    /**
     * When enabled, low CPU priority will be used during scheduled scans.
     */
    private Boolean defenderScheduleScanEnableLowCpuPriority;
    /**
     * The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
     */
    private Integer defenderSignatureUpdateIntervalInHours;
    /**
     * Checks for the user consent level in Windows Defender to send data. Possible values are: sendSafeSamplesAutomatically, alwaysPrompt, neverSend, sendAllSamplesAutomatically.
     */
    private DefenderSubmitSamplesConsentType defenderSubmitSamplesConsentType;
    /**
     * Possible values for a weekly schedule.
     */
    private WeeklySchedule defenderSystemScanSchedule;
    /**
     * State Management Setting.
     */
    private StateManagementSetting developerUnlockSetting;
    /**
     * Indicates whether or not to Block the user from resetting their phone.
     */
    private Boolean deviceManagementBlockFactoryResetOnMobile;
    /**
     * Indicates whether or not to Block the user from doing manual un-enrollment from device management.
     */
    private Boolean deviceManagementBlockManualUnenroll;
    /**
     * Allow the device to send diagnostic and usage telemetry data, such as Watson.
     */
    private DiagnosticDataSubmissionMode diagnosticsDataSubmissionMode;
    /**
     * List of legacy applications that have GDI DPI Scaling turned off.
     */
    private java.util.List<String> displayAppListWithGdiDPIScalingTurnedOff;
    /**
     * List of legacy applications that have GDI DPI Scaling turned on.
     */
    private java.util.List<String> displayAppListWithGdiDPIScalingTurnedOn;
    /**
     * Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge.
     */
    private Boolean edgeAllowStartPagesModification;
    /**
     * Indicates whether or not to prevent access to about flags on Edge browser.
     */
    private Boolean edgeBlockAccessToAboutFlags;
    /**
     * Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services.
     */
    private Boolean edgeBlockAddressBarDropdown;
    /**
     * Indicates whether or not to block auto fill.
     */
    private Boolean edgeBlockAutofill;
    /**
     * Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues.
     */
    private Boolean edgeBlockCompatibilityList;
    /**
     * Indicates whether or not to block developer tools in the Edge browser.
     */
    private Boolean edgeBlockDeveloperTools;
    /**
     * Indicates whether or not to Block the user from using the Edge browser.
     */
    private Boolean edgeBlocked;
    /**
     * Indicates whether or not to Block the user from making changes to Favorites.
     */
    private Boolean edgeBlockEditFavorites;
    /**
     * Indicates whether or not to block extensions in the Edge browser.
     */
    private Boolean edgeBlockExtensions;
    /**
     * Allow or prevent Edge from entering the full screen mode.
     */
    private Boolean edgeBlockFullScreenMode;
    /**
     * Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
     */
    private Boolean edgeBlockInPrivateBrowsing;
    /**
     * Indicates whether or not to Block the user from using JavaScript.
     */
    private Boolean edgeBlockJavaScript;
    /**
     * Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge.
     */
    private Boolean edgeBlockLiveTileDataCollection;
    /**
     * Indicates whether or not to Block password manager.
     */
    private Boolean edgeBlockPasswordManager;
    /**
     * Indicates whether or not to block popups.
     */
    private Boolean edgeBlockPopups;
    /**
     * Decide whether Microsoft Edge is prelaunched at Windows startup.
     */
    private Boolean edgeBlockPrelaunch;
    /**
     * Configure Edge to allow or block printing.
     */
    private Boolean edgeBlockPrinting;
    /**
     * Configure Edge to allow browsing history to be saved or to never save browsing history.
     */
    private Boolean edgeBlockSavingHistory;
    /**
     * Indicates whether or not to block the user from adding new search engine or changing the default search engine.
     */
    private Boolean edgeBlockSearchEngineCustomization;
    /**
     * Indicates whether or not to block the user from using the search suggestions in the address bar.
     */
    private Boolean edgeBlockSearchSuggestions;
    /**
     * Indicates whether or not to Block the user from sending the do not track header.
     */
    private Boolean edgeBlockSendingDoNotTrackHeader;
    /**
     * Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
     */
    private Boolean edgeBlockSendingIntranetTrafficToInternetExplorer;
    /**
     * Indicates whether the user can sideload extensions.
     */
    private Boolean edgeBlockSideloadingExtensions;
    /**
     * Configure whether Edge preloads the new tab page at Windows startup.
     */
    private Boolean edgeBlockTabPreloading;
    /**
     * Configure to load a blank page in Edge instead of the default New tab page and prevent users from changing it.
     */
    private Boolean edgeBlockWebContentOnNewTabPage;
    /**
     * Clear browsing data on exiting Microsoft Edge.
     */
    private Boolean edgeClearBrowsingDataOnExit;
    /**
     * Possible values to specify which cookies are allowed in Microsoft Edge.
     */
    private EdgeCookiePolicy edgeCookiePolicy;
    /**
     * Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page.
     */
    private Boolean edgeDisableFirstRunPage;
    /**
     * Indicates the enterprise mode site list location. Could be a local file, local network or http location.
     */
    private String edgeEnterpriseModeSiteListLocation;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting edgeFavoritesBarVisibility;
    /**
     * The location of the favorites list to provision. Could be a local file, local network or http location.
     */
    private String edgeFavoritesListLocation;
    /**
     * The first run URL for when Edge browser is opened for the first time.
     */
    private String edgeFirstRunUrl;
    /**
     * Causes the Home button to either hide, load the default Start page, load a New tab page, or a custom URL
     */
    private EdgeHomeButtonConfiguration edgeHomeButtonConfiguration;
    /**
     * Enable the Home button configuration.
     */
    private Boolean edgeHomeButtonConfigurationEnabled;
    /**
     * The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
     */
    private java.util.List<String> edgeHomepageUrls;
    /**
     * Specify how the Microsoft Edge settings are restricted based on kiosk mode.
     */
    private EdgeKioskModeRestrictionType edgeKioskModeRestriction;
    /**
     * Specifies the time in minutes from the last user activity before Microsoft Edge kiosk resets.  Valid values are 0-1440. The default is 5. 0 indicates no reset. Valid values 0 to 1440
     */
    private Integer edgeKioskResetAfterIdleTimeInMinutes;
    /**
     * Specify the page opened when new tabs are created.
     */
    private String edgeNewTabPageURL;
    /**
     * Possible values for the EdgeOpensWith setting.
     */
    private EdgeOpenOptions edgeOpensWith;
    /**
     * Allow or prevent users from overriding certificate errors.
     */
    private Boolean edgePreventCertificateErrorOverride;
    /**
     * Specify the list of package family names of browser extensions that are required and cannot be turned off by the user.
     */
    private java.util.List<String> edgeRequiredExtensionPackageFamilyNames;
    /**
     * Indicates whether or not to Require the user to use the smart screen filter.
     */
    private Boolean edgeRequireSmartScreen;
    /**
     * Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set.
     */
    private EdgeSearchEngineBase edgeSearchEngine;
    /**
     * Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
     */
    private Boolean edgeSendIntranetTrafficToInternetExplorer;
    /**
     * What message will be displayed by Edge before switching to Internet Explorer.
     */
    private InternetExplorerMessageSetting edgeShowMessageWhenOpeningInternetExplorerSites;
    /**
     * Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers.
     */
    private Boolean edgeSyncFavoritesWithInternetExplorer;
    /**
     * Type of browsing data sent to Microsoft 365 analytics
     */
    private EdgeTelemetryMode edgeTelemetryForMicrosoft365Analytics;
    /**
     * Allow users with administrative rights to delete all user data and settings using CTRL + Win + R at the device lock screen so that the device can be automatically re-configured and re-enrolled into management.
     */
    private Boolean enableAutomaticRedeployment;
    /**
     * This setting allows you to specify battery charge level at which Energy Saver is turned on. While on battery, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100
     */
    private Integer energySaverOnBatteryThresholdPercentage;
    /**
     * This setting allows you to specify battery charge level at which Energy Saver is turned on. While plugged in, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100
     */
    private Integer energySaverPluggedInThresholdPercentage;
    /**
     * Endpoint for discovering cloud printers.
     */
    private String enterpriseCloudPrintDiscoveryEndPoint;
    /**
     * Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535
     */
    private Integer enterpriseCloudPrintDiscoveryMaxLimit;
    /**
     * OAuth resource URI for printer discovery service as configured in Azure portal.
     */
    private String enterpriseCloudPrintMopriaDiscoveryResourceIdentifier;
    /**
     * Authentication endpoint for acquiring OAuth tokens.
     */
    private String enterpriseCloudPrintOAuthAuthority;
    /**
     * GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
     */
    private String enterpriseCloudPrintOAuthClientIdentifier;
    /**
     * OAuth resource URI for print service as configured in the Azure portal.
     */
    private String enterpriseCloudPrintResourceIdentifier;
    /**
     * Indicates whether or not to enable device discovery UX.
     */
    private Boolean experienceBlockDeviceDiscovery;
    /**
     * Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
     */
    private Boolean experienceBlockErrorDialogWhenNoSIM;
    /**
     * Indicates whether or not to enable task switching on the device.
     */
    private Boolean experienceBlockTaskSwitcher;
    /**
     * Allow(Not Configured) or prevent(Block) the syncing of Microsoft Edge Browser settings. Option to prevent syncing across devices, but allow user override.
     */
    private BrowserSyncSetting experienceDoNotSyncBrowserSettings;
    /**
     * Possible values of a property
     */
    private Enablement findMyFiles;
    /**
     * Indicates whether or not to block DVR and broadcasting.
     */
    private Boolean gameDvrBlocked;
    /**
     * Values for the InkWorkspaceAccess setting.
     */
    private InkAccessSetting inkWorkspaceAccess;
    /**
     * State Management Setting.
     */
    private StateManagementSetting inkWorkspaceAccessState;
    /**
     * Specify whether to show recommended app suggestions in the ink workspace.
     */
    private Boolean inkWorkspaceBlockSuggestedApps;
    /**
     * Indicates whether or not to Block the user from using internet sharing.
     */
    private Boolean internetSharingBlocked;
    /**
     * Indicates whether or not to Block the user from location services.
     */
    private Boolean locationServicesBlocked;
    /**
     * Possible values of a property
     */
    private Enablement lockScreenActivateAppsWithVoice;
    /**
     * Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
     */
    private Boolean lockScreenAllowTimeoutConfiguration;
    /**
     * Indicates whether or not to block action center notifications over lock screen.
     */
    private Boolean lockScreenBlockActionCenterNotifications;
    /**
     * Indicates whether or not the user can interact with Cortana using speech while the system is locked.
     */
    private Boolean lockScreenBlockCortana;
    /**
     * Indicates whether to allow toast notifications above the device lock screen.
     */
    private Boolean lockScreenBlockToastNotifications;
    /**
     * Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800
     */
    private Integer lockScreenTimeoutInSeconds;
    /**
     * Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
     */
    private Boolean logonBlockFastUserSwitching;
    /**
     * Indicates whether or not to block the MMS send/receive functionality on the device.
     */
    private Boolean messagingBlockMMS;
    /**
     * Indicates whether or not to block the RCS send/receive functionality on the device.
     */
    private Boolean messagingBlockRichCommunicationServices;
    /**
     * Indicates whether or not to block text message back up and restore and Messaging Everywhere.
     */
    private Boolean messagingBlockSync;
    /**
     * Indicates whether or not to Block a Microsoft account.
     */
    private Boolean microsoftAccountBlocked;
    /**
     * Indicates whether or not to Block Microsoft account settings sync.
     */
    private Boolean microsoftAccountBlockSettingsSync;
    /**
     * Values for the SignInAssistantSettings.
     */
    private SignInAssistantOptions microsoftAccountSignInAssistantSettings;
    /**
     * If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account thats enrolled into MDM.
     */
    private Boolean networkProxyApplySettingsDeviceWide;
    /**
     * Address to the proxy auto-config (PAC) script you want to use.
     */
    private String networkProxyAutomaticConfigurationUrl;
    /**
     * Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script.
     */
    private Boolean networkProxyDisableAutoDetect;
    /**
     * Specifies manual proxy server settings.
     */
    private Windows10NetworkProxyServer networkProxyServer;
    /**
     * Indicates whether or not to Block the user from using near field communication.
     */
    private Boolean nfcBlocked;
    /**
     * Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
     */
    private Boolean oneDriveDisableFileSync;
    /**
     * Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords.
     */
    private Boolean passwordBlockSimple;
    /**
     * The password expiration in days. Valid values 0 to 730
     */
    private Integer passwordExpirationDays;
    /**
     * This security setting determines the period of time (in days) that a password must be used before the user can change it. Valid values 0 to 998
     */
    private Integer passwordMinimumAgeInDays;
    /**
     * The number of character sets required in the password.
     */
    private Integer passwordMinimumCharacterSetCount;
    /**
     * The minimum password length. Valid values 4 to 16
     */
    private Integer passwordMinimumLength;
    /**
     * The minutes of inactivity before the screen times out.
     */
    private Integer passwordMinutesOfInactivityBeforeScreenTimeout;
    /**
     * The number of previous passwords to prevent reuse of. Valid values 0 to 50
     */
    private Integer passwordPreviousPasswordBlockCount;
    /**
     * Indicates whether or not to require the user to have a password.
     */
    private Boolean passwordRequired;
    /**
     * Possible values of required passwords.
     */
    private RequiredPasswordType passwordRequiredType;
    /**
     * Indicates whether or not to require a password upon resuming from an idle state.
     */
    private Boolean passwordRequireWhenResumeFromIdleState;
    /**
     * The number of sign in failures before factory reset. Valid values 0 to 999
     */
    private Integer passwordSignInFailureCountBeforeFactoryReset;
    /**
     * A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image.
     */
    private String personalizationDesktopImageUrl;
    /**
     * A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a file Url to a local image on the file system that needs to be used as the Lock Screen Image.
     */
    private String personalizationLockScreenImageUrl;
    /**
     * Power action types
     */
    private PowerActionType powerButtonActionOnBattery;
    /**
     * Power action types
     */
    private PowerActionType powerButtonActionPluggedIn;
    /**
     * Possible values of a property
     */
    private Enablement powerHybridSleepOnBattery;
    /**
     * Possible values of a property
     */
    private Enablement powerHybridSleepPluggedIn;
    /**
     * Power action types
     */
    private PowerActionType powerLidCloseActionOnBattery;
    /**
     * Power action types
     */
    private PowerActionType powerLidCloseActionPluggedIn;
    /**
     * Power action types
     */
    private PowerActionType powerSleepButtonActionOnBattery;
    /**
     * Power action types
     */
    private PowerActionType powerSleepButtonActionPluggedIn;
    /**
     * Prevent user installation of additional printers from printers settings.
     */
    private Boolean printerBlockAddition;
    /**
     * Name (network host name) of an installed printer.
     */
    private String printerDefaultName;
    /**
     * Automatically provision printers based on their names (network host names).
     */
    private java.util.List<String> printerNames;
    /**
     * Indicates a list of applications with their access control levels over privacy data categories, and/or the default access levels per category. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<WindowsPrivacyDataAccessControlItem> privacyAccessControls;
    /**
     * State Management Setting.
     */
    private StateManagementSetting privacyAdvertisingId;
    /**
     * Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps.
     */
    private Boolean privacyAutoAcceptPairingAndConsentPrompts;
    /**
     * Blocks the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     */
    private Boolean privacyBlockActivityFeed;
    /**
     * Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     */
    private Boolean privacyBlockInputPersonalization;
    /**
     * Blocks the shared experiences/discovery of recently used resources in task switcher etc.
     */
    private Boolean privacyBlockPublishUserActivities;
    /**
     * This policy prevents the privacy experience from launching during user logon for new and upgraded users.
     */
    private Boolean privacyDisableLaunchExperience;
    /**
     * Indicates whether or not to Block the user from reset protection mode.
     */
    private Boolean resetProtectionModeBlocked;
    /**
     * Specifies what level of safe search (filtering adult content) is required
     */
    private SafeSearchFilterType safeSearchFilter;
    /**
     * Indicates whether or not to Block the user from taking Screenshots.
     */
    private Boolean screenCaptureBlocked;
    /**
     * Specifies if search can use diacritics.
     */
    private Boolean searchBlockDiacritics;
    /**
     * Indicates whether or not to block the web search.
     */
    private Boolean searchBlockWebResults;
    /**
     * Specifies whether to use automatic language detection when indexing content and properties.
     */
    private Boolean searchDisableAutoLanguageDetection;
    /**
     * Indicates whether or not to disable the search indexer backoff feature.
     */
    private Boolean searchDisableIndexerBackoff;
    /**
     * Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer.
     */
    private Boolean searchDisableIndexingEncryptedItems;
    /**
     * Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
     */
    private Boolean searchDisableIndexingRemovableDrive;
    /**
     * Specifies if search can use location information.
     */
    private Boolean searchDisableLocation;
    /**
     * Specifies if search can use location information.
     */
    private Boolean searchDisableUseLocation;
    /**
     * Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
     */
    private Boolean searchEnableAutomaticIndexSizeManangement;
    /**
     * Indicates whether or not to block remote queries of this computers index.
     */
    private Boolean searchEnableRemoteQueries;
    /**
     * Specify whether to allow automatic device encryption during OOBE when the device is Azure AD joined (desktop only).
     */
    private Boolean securityBlockAzureADJoinedDevicesAutoEncryption;
    /**
     * Indicates whether or not to block access to Accounts in Settings app.
     */
    private Boolean settingsBlockAccountsPage;
    /**
     * Indicates whether or not to block the user from installing provisioning packages.
     */
    private Boolean settingsBlockAddProvisioningPackage;
    /**
     * Indicates whether or not to block access to Apps in Settings app.
     */
    private Boolean settingsBlockAppsPage;
    /**
     * Indicates whether or not to block the user from changing the language settings.
     */
    private Boolean settingsBlockChangeLanguage;
    /**
     * Indicates whether or not to block the user from changing power and sleep settings.
     */
    private Boolean settingsBlockChangePowerSleep;
    /**
     * Indicates whether or not to block the user from changing the region settings.
     */
    private Boolean settingsBlockChangeRegion;
    /**
     * Indicates whether or not to block the user from changing date and time settings.
     */
    private Boolean settingsBlockChangeSystemTime;
    /**
     * Indicates whether or not to block access to Devices in Settings app.
     */
    private Boolean settingsBlockDevicesPage;
    /**
     * Indicates whether or not to block access to Ease of Access in Settings app.
     */
    private Boolean settingsBlockEaseOfAccessPage;
    /**
     * Indicates whether or not to block the user from editing the device name.
     */
    private Boolean settingsBlockEditDeviceName;
    /**
     * Indicates whether or not to block access to Gaming in Settings app.
     */
    private Boolean settingsBlockGamingPage;
    /**
     * Indicates whether or not to block access to Network & Internet in Settings app.
     */
    private Boolean settingsBlockNetworkInternetPage;
    /**
     * Indicates whether or not to block access to Personalization in Settings app.
     */
    private Boolean settingsBlockPersonalizationPage;
    /**
     * Indicates whether or not to block access to Privacy in Settings app.
     */
    private Boolean settingsBlockPrivacyPage;
    /**
     * Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
     */
    private Boolean settingsBlockRemoveProvisioningPackage;
    /**
     * Indicates whether or not to block access to Settings app.
     */
    private Boolean settingsBlockSettingsApp;
    /**
     * Indicates whether or not to block access to System in Settings app.
     */
    private Boolean settingsBlockSystemPage;
    /**
     * Indicates whether or not to block access to Time & Language in Settings app.
     */
    private Boolean settingsBlockTimeLanguagePage;
    /**
     * Indicates whether or not to block access to Update & Security in Settings app.
     */
    private Boolean settingsBlockUpdateSecurityPage;
    /**
     * Indicates whether or not to block multiple users of the same app to share data.
     */
    private Boolean sharedUserAppDataAllowed;
    /**
     * App Install control Setting
     */
    private AppInstallControlType smartScreenAppInstallControl;
    /**
     * Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
     */
    private Boolean smartScreenBlockPromptOverride;
    /**
     * Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
     */
    private Boolean smartScreenBlockPromptOverrideForFiles;
    /**
     * This property will be deprecated in July 2019 and will be replaced by property SmartScreenAppInstallControl. Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
     */
    private Boolean smartScreenEnableAppInstallControl;
    /**
     * Indicates whether or not to block the user from unpinning apps from taskbar.
     */
    private Boolean startBlockUnpinningAppsFromTaskbar;
    /**
     * Type of start menu app list visibility.
     */
    private WindowsStartMenuAppListVisibilityType startMenuAppListVisibility;
    /**
     * Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
     */
    private Boolean startMenuHideChangeAccountSettings;
    /**
     * Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     */
    private Boolean startMenuHideFrequentlyUsedApps;
    /**
     * Enabling this policy hides hibernate from appearing in the power button in the start menu.
     */
    private Boolean startMenuHideHibernate;
    /**
     * Enabling this policy hides lock from appearing in the user tile in the start menu.
     */
    private Boolean startMenuHideLock;
    /**
     * Enabling this policy hides the power button from appearing in the start menu.
     */
    private Boolean startMenuHidePowerButton;
    /**
     * Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app.
     */
    private Boolean startMenuHideRecentJumpLists;
    /**
     * Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     */
    private Boolean startMenuHideRecentlyAddedApps;
    /**
     * Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
     */
    private Boolean startMenuHideRestartOptions;
    /**
     * Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
     */
    private Boolean startMenuHideShutDown;
    /**
     * Enabling this policy hides sign out from appearing in the user tile in the start menu.
     */
    private Boolean startMenuHideSignOut;
    /**
     * Enabling this policy hides sleep from appearing in the power button in the start menu.
     */
    private Boolean startMenuHideSleep;
    /**
     * Enabling this policy hides switch account from appearing in the user tile in the start menu.
     */
    private Boolean startMenuHideSwitchAccount;
    /**
     * Enabling this policy hides the user tile from appearing in the start menu.
     */
    private Boolean startMenuHideUserTile;
    /**
     * This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array.
     */
    private byte[] startMenuLayoutEdgeAssetsXml;
    /**
     * Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
     */
    private byte[] startMenuLayoutXml;
    /**
     * Type of display modes for the start menu.
     */
    private WindowsStartMenuModeType startMenuMode;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderDocuments;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderDownloads;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderFileExplorer;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderHomeGroup;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderMusic;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderNetwork;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderPersonalFolder;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderPictures;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderSettings;
    /**
     * Generic visibility state.
     */
    private VisibilitySetting startMenuPinnedFolderVideos;
    /**
     * Indicates whether or not to Block the user from using removable storage.
     */
    private Boolean storageBlockRemovableStorage;
    /**
     * Indicating whether or not to require encryption on a mobile device.
     */
    private Boolean storageRequireMobileDeviceEncryption;
    /**
     * Indicates whether application data is restricted to the system drive.
     */
    private Boolean storageRestrictAppDataToSystemVolume;
    /**
     * Indicates whether the installation of applications is restricted to the system drive.
     */
    private Boolean storageRestrictAppInstallToSystemVolume;
    /**
     * Gets or sets the fully qualified domain name (FQDN) or IP address of a proxy server to forward Connected User Experiences and Telemetry requests.
     */
    private String systemTelemetryProxyServer;
    /**
     * Specify whether non-administrators can use Task Manager to end tasks.
     */
    private Boolean taskManagerBlockEndTask;
    /**
     * Whether the device is required to connect to the network.
     */
    private Boolean tenantLockdownRequireNetworkDuringOutOfBoxExperience;
    /**
     * Indicates whether or not to uninstall a fixed list of built-in Windows apps.
     */
    private Boolean uninstallBuiltInApps;
    /**
     * Indicates whether or not to Block the user from USB connection.
     */
    private Boolean usbBlocked;
    /**
     * Indicates whether or not to Block the user from voice recording.
     */
    private Boolean voiceRecordingBlocked;
    /**
     * Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
     */
    private Boolean webRtcBlockLocalhostIpAddress;
    /**
     * Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     */
    private Boolean wiFiBlockAutomaticConnectHotspots;
    /**
     * Indicates whether or not to Block the user from using Wi-Fi.
     */
    private Boolean wiFiBlocked;
    /**
     * Indicates whether or not to Block the user from using Wi-Fi manual configuration.
     */
    private Boolean wiFiBlockManualConfiguration;
    /**
     * Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500
     */
    private Integer wiFiScanInterval;
    /**
     * Windows 10 force update schedule for Apps.
     */
    private Windows10AppsForceUpdateSchedule windows10AppsForceUpdateSchedule;
    /**
     * Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles.
     */
    private Boolean windowsSpotlightBlockConsumerSpecificFeatures;
    /**
     * Allows IT admins to turn off all Windows Spotlight features
     */
    private Boolean windowsSpotlightBlocked;
    /**
     * Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed
     */
    private Boolean windowsSpotlightBlockOnActionCenter;
    /**
     * Block personalized content in Windows spotlight based on users device usage.
     */
    private Boolean windowsSpotlightBlockTailoredExperiences;
    /**
     * Block third party content delivered via Windows Spotlight
     */
    private Boolean windowsSpotlightBlockThirdPartyNotifications;
    /**
     * Block Windows Spotlight Windows welcome experience
     */
    private Boolean windowsSpotlightBlockWelcomeExperience;
    /**
     * Allows IT admins to turn off the popup of Windows Tips.
     */
    private Boolean windowsSpotlightBlockWindowsTips;
    /**
     * Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     */
    private WindowsSpotlightEnablementSettings windowsSpotlightConfigureOnLockScreen;
    /**
     * Indicates whether or not to block automatic update of apps from Windows Store.
     */
    private Boolean windowsStoreBlockAutoUpdate;
    /**
     * Indicates whether or not to Block the user from using the Windows store.
     */
    private Boolean windowsStoreBlocked;
    /**
     * Indicates whether or not to enable Private Store Only.
     */
    private Boolean windowsStoreEnablePrivateStoreOnly;
    /**
     * Indicates whether or not to allow other devices from discovering this PC for projection.
     */
    private Boolean wirelessDisplayBlockProjectionToThisDevice;
    /**
     * Indicates whether or not to allow user input from wireless display receiver.
     */
    private Boolean wirelessDisplayBlockUserInputFromReceiver;
    /**
     * Indicates whether or not to require a PIN for new devices to initiate pairing.
     */
    private Boolean wirelessDisplayRequirePinForPairing;
    /**
     * Instantiates a new Windows10GeneralConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
        return this.accountsBlockAddingNonMicrosoftAccountEmail;
    }
    /**
     * Gets the activateAppsWithVoice property value. Possible values of a property
     * @return a Enablement
     */
    @javax.annotation.Nullable
    public Enablement getActivateAppsWithVoice() {
        return this.activateAppsWithVoice;
    }
    /**
     * Gets the antiTheftModeBlocked property value. Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAntiTheftModeBlocked() {
        return this.antiTheftModeBlocked;
    }
    /**
     * Gets the appManagementMSIAllowUserControlOverInstall property value. This policy setting permits users to change installation options that typically are available only to system administrators.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppManagementMSIAllowUserControlOverInstall() {
        return this.appManagementMSIAllowUserControlOverInstall;
    }
    /**
     * Gets the appManagementMSIAlwaysInstallWithElevatedPrivileges property value. This policy setting directs Windows Installer to use elevated permissions when it installs any program on the system.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppManagementMSIAlwaysInstallWithElevatedPrivileges() {
        return this.appManagementMSIAlwaysInstallWithElevatedPrivileges;
    }
    /**
     * Gets the appManagementPackageFamilyNamesToLaunchAfterLogOn property value. List of semi-colon delimited Package Family Names of Windows apps. Listed Windows apps are to be launched after logon.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAppManagementPackageFamilyNamesToLaunchAfterLogOn() {
        return this.appManagementPackageFamilyNamesToLaunchAfterLogOn;
    }
    /**
     * Gets the appsAllowTrustedAppsSideloading property value. State Management Setting.
     * @return a StateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getAppsAllowTrustedAppsSideloading() {
        return this.appsAllowTrustedAppsSideloading;
    }
    /**
     * Gets the appsBlockWindowsStoreOriginatedApps property value. Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsBlockWindowsStoreOriginatedApps() {
        return this.appsBlockWindowsStoreOriginatedApps;
    }
    /**
     * Gets the authenticationAllowSecondaryDevice property value. Allows secondary authentication devices to work with Windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAuthenticationAllowSecondaryDevice() {
        return this.authenticationAllowSecondaryDevice;
    }
    /**
     * Gets the authenticationPreferredAzureADTenantDomainName property value. Specifies the preferred domain among available domains in the Azure AD tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationPreferredAzureADTenantDomainName() {
        return this.authenticationPreferredAzureADTenantDomainName;
    }
    /**
     * Gets the authenticationWebSignIn property value. Possible values of a property
     * @return a Enablement
     */
    @javax.annotation.Nullable
    public Enablement getAuthenticationWebSignIn() {
        return this.authenticationWebSignIn;
    }
    /**
     * Gets the bluetoothAllowedServices property value. Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBluetoothAllowedServices() {
        return this.bluetoothAllowedServices;
    }
    /**
     * Gets the bluetoothBlockAdvertising property value. Whether or not to Block the user from using bluetooth advertising.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockAdvertising() {
        return this.bluetoothBlockAdvertising;
    }
    /**
     * Gets the bluetoothBlockDiscoverableMode property value. Whether or not to Block the user from using bluetooth discoverable mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockDiscoverableMode() {
        return this.bluetoothBlockDiscoverableMode;
    }
    /**
     * Gets the bluetoothBlocked property value. Whether or not to Block the user from using bluetooth.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlocked() {
        return this.bluetoothBlocked;
    }
    /**
     * Gets the bluetoothBlockPrePairing property value. Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockPrePairing() {
        return this.bluetoothBlockPrePairing;
    }
    /**
     * Gets the bluetoothBlockPromptedProximalConnections property value. Whether or not to block the users from using Swift Pair and other proximity based scenarios.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockPromptedProximalConnections() {
        return this.bluetoothBlockPromptedProximalConnections;
    }
    /**
     * Gets the cameraBlocked property value. Whether or not to Block the user from accessing the camera of the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this.cameraBlocked;
    }
    /**
     * Gets the cellularBlockDataWhenRoaming property value. Whether or not to Block the user from using data over cellular while roaming.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockDataWhenRoaming() {
        return this.cellularBlockDataWhenRoaming;
    }
    /**
     * Gets the cellularBlockVpn property value. Whether or not to Block the user from using VPN over cellular.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockVpn() {
        return this.cellularBlockVpn;
    }
    /**
     * Gets the cellularBlockVpnWhenRoaming property value. Whether or not to Block the user from using VPN when roaming over cellular.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockVpnWhenRoaming() {
        return this.cellularBlockVpnWhenRoaming;
    }
    /**
     * Gets the cellularData property value. Possible values of the ConfigurationUsage list.
     * @return a ConfigurationUsage
     */
    @javax.annotation.Nullable
    public ConfigurationUsage getCellularData() {
        return this.cellularData;
    }
    /**
     * Gets the certificatesBlockManualRootCertificateInstallation property value. Whether or not to Block the user from doing manual root certificate installation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCertificatesBlockManualRootCertificateInstallation() {
        return this.certificatesBlockManualRootCertificateInstallation;
    }
    /**
     * Gets the configureTimeZone property value. Specifies the time zone to be applied to the device. This is the standard Windows name for the target time zone.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConfigureTimeZone() {
        return this.configureTimeZone;
    }
    /**
     * Gets the connectedDevicesServiceBlocked property value. Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectedDevicesServiceBlocked() {
        return this.connectedDevicesServiceBlocked;
    }
    /**
     * Gets the copyPasteBlocked property value. Whether or not to Block the user from using copy paste.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCopyPasteBlocked() {
        return this.copyPasteBlocked;
    }
    /**
     * Gets the cortanaBlocked property value. Whether or not to Block the user from using Cortana.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCortanaBlocked() {
        return this.cortanaBlocked;
    }
    /**
     * Gets the cryptographyAllowFipsAlgorithmPolicy property value. Specify whether to allow or disallow the Federal Information Processing Standard (FIPS) policy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCryptographyAllowFipsAlgorithmPolicy() {
        return this.cryptographyAllowFipsAlgorithmPolicy;
    }
    /**
     * Gets the dataProtectionBlockDirectMemoryAccess property value. This policy setting allows you to block direct memory access (DMA) for all hot pluggable PCI downstream ports until a user logs into Windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDataProtectionBlockDirectMemoryAccess() {
        return this.dataProtectionBlockDirectMemoryAccess;
    }
    /**
     * Gets the defenderBlockEndUserAccess property value. Whether or not to block end user access to Defender.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderBlockEndUserAccess() {
        return this.defenderBlockEndUserAccess;
    }
    /**
     * Gets the defenderBlockOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderBlockOnAccessProtection() {
        return this.defenderBlockOnAccessProtection;
    }
    /**
     * Gets the defenderCloudBlockLevel property value. Possible values of Cloud Block Level
     * @return a DefenderCloudBlockLevelType
     */
    @javax.annotation.Nullable
    public DefenderCloudBlockLevelType getDefenderCloudBlockLevel() {
        return this.defenderCloudBlockLevel;
    }
    /**
     * Gets the defenderCloudExtendedTimeout property value. Timeout extension for file scanning by the cloud. Valid values 0 to 50
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderCloudExtendedTimeout() {
        return this.defenderCloudExtendedTimeout;
    }
    /**
     * Gets the defenderCloudExtendedTimeoutInSeconds property value. Timeout extension for file scanning by the cloud. Valid values 0 to 50
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderCloudExtendedTimeoutInSeconds() {
        return this.defenderCloudExtendedTimeoutInSeconds;
    }
    /**
     * Gets the defenderDaysBeforeDeletingQuarantinedMalware property value. Number of days before deleting quarantined malware. Valid values 0 to 90
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderDaysBeforeDeletingQuarantinedMalware() {
        return this.defenderDaysBeforeDeletingQuarantinedMalware;
    }
    /**
     * Gets the defenderDetectedMalwareActions property value. Gets or sets Defenders actions to take on detected Malware per threat level.
     * @return a defenderDetectedMalwareActions
     */
    @javax.annotation.Nullable
    public DefenderDetectedMalwareActions getDefenderDetectedMalwareActions() {
        return this.defenderDetectedMalwareActions;
    }
    /**
     * Gets the defenderDisableCatchupFullScan property value. When blocked, catch-up scans for scheduled full scans will be turned off.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableCatchupFullScan() {
        return this.defenderDisableCatchupFullScan;
    }
    /**
     * Gets the defenderDisableCatchupQuickScan property value. When blocked, catch-up scans for scheduled quick scans will be turned off.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderDisableCatchupQuickScan() {
        return this.defenderDisableCatchupQuickScan;
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
     * Gets the defenderMonitorFileActivity property value. Possible values for monitoring file activity.
     * @return a DefenderMonitorFileActivity
     */
    @javax.annotation.Nullable
    public DefenderMonitorFileActivity getDefenderMonitorFileActivity() {
        return this.defenderMonitorFileActivity;
    }
    /**
     * Gets the defenderPotentiallyUnwantedAppAction property value. Gets or sets Defenders action to take on Potentially Unwanted Application (PUA), which includes software with behaviors of ad-injection, software bundling, persistent solicitation for payment or subscription, etc. Defender alerts user when PUA is being downloaded or attempts to install itself. Added in Windows 10 for desktop. Possible values are: deviceDefault, block, audit.
     * @return a defenderPotentiallyUnwantedAppAction
     */
    @javax.annotation.Nullable
    public DefenderPotentiallyUnwantedAppAction getDefenderPotentiallyUnwantedAppAction() {
        return this.defenderPotentiallyUnwantedAppAction;
    }
    /**
     * Gets the defenderPotentiallyUnwantedAppActionSetting property value. Possible values of Defender PUA Protection
     * @return a DefenderProtectionType
     */
    @javax.annotation.Nullable
    public DefenderProtectionType getDefenderPotentiallyUnwantedAppActionSetting() {
        return this.defenderPotentiallyUnwantedAppActionSetting;
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
     * Gets the defenderPromptForSampleSubmission property value. Possible values for prompting user for samples submission.
     * @return a DefenderPromptForSampleSubmission
     */
    @javax.annotation.Nullable
    public DefenderPromptForSampleSubmission getDefenderPromptForSampleSubmission() {
        return this.defenderPromptForSampleSubmission;
    }
    /**
     * Gets the defenderRequireBehaviorMonitoring property value. Indicates whether or not to require behavior monitoring.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireBehaviorMonitoring() {
        return this.defenderRequireBehaviorMonitoring;
    }
    /**
     * Gets the defenderRequireCloudProtection property value. Indicates whether or not to require cloud protection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireCloudProtection() {
        return this.defenderRequireCloudProtection;
    }
    /**
     * Gets the defenderRequireNetworkInspectionSystem property value. Indicates whether or not to require network inspection system.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireNetworkInspectionSystem() {
        return this.defenderRequireNetworkInspectionSystem;
    }
    /**
     * Gets the defenderRequireRealTimeMonitoring property value. Indicates whether or not to require real time monitoring.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderRequireRealTimeMonitoring() {
        return this.defenderRequireRealTimeMonitoring;
    }
    /**
     * Gets the defenderScanArchiveFiles property value. Indicates whether or not to scan archive files.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanArchiveFiles() {
        return this.defenderScanArchiveFiles;
    }
    /**
     * Gets the defenderScanDownloads property value. Indicates whether or not to scan downloads.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanDownloads() {
        return this.defenderScanDownloads;
    }
    /**
     * Gets the defenderScanIncomingMail property value. Indicates whether or not to scan incoming mail messages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanIncomingMail() {
        return this.defenderScanIncomingMail;
    }
    /**
     * Gets the defenderScanMappedNetworkDrivesDuringFullScan property value. Indicates whether or not to scan mapped network drives during full scan.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanMappedNetworkDrivesDuringFullScan() {
        return this.defenderScanMappedNetworkDrivesDuringFullScan;
    }
    /**
     * Gets the defenderScanMaxCpu property value. Max CPU usage percentage during scan. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefenderScanMaxCpu() {
        return this.defenderScanMaxCpu;
    }
    /**
     * Gets the defenderScanNetworkFiles property value. Indicates whether or not to scan files opened from a network folder.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanNetworkFiles() {
        return this.defenderScanNetworkFiles;
    }
    /**
     * Gets the defenderScanRemovableDrivesDuringFullScan property value. Indicates whether or not to scan removable drives during full scan.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanRemovableDrivesDuringFullScan() {
        return this.defenderScanRemovableDrivesDuringFullScan;
    }
    /**
     * Gets the defenderScanScriptsLoadedInInternetExplorer property value. Indicates whether or not to scan scripts loaded in Internet Explorer browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScanScriptsLoadedInInternetExplorer() {
        return this.defenderScanScriptsLoadedInInternetExplorer;
    }
    /**
     * Gets the defenderScanType property value. Possible values for system scan type.
     * @return a DefenderScanType
     */
    @javax.annotation.Nullable
    public DefenderScanType getDefenderScanType() {
        return this.defenderScanType;
    }
    /**
     * Gets the defenderScheduledQuickScanTime property value. The time to perform a daily quick scan.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getDefenderScheduledQuickScanTime() {
        return this.defenderScheduledQuickScanTime;
    }
    /**
     * Gets the defenderScheduledScanTime property value. The defender time for the system scan.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getDefenderScheduledScanTime() {
        return this.defenderScheduledScanTime;
    }
    /**
     * Gets the defenderScheduleScanEnableLowCpuPriority property value. When enabled, low CPU priority will be used during scheduled scans.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderScheduleScanEnableLowCpuPriority() {
        return this.defenderScheduleScanEnableLowCpuPriority;
    }
    /**
     * Gets the defenderSignatureUpdateIntervalInHours property value. The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
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
     * Gets the defenderSystemScanSchedule property value. Possible values for a weekly schedule.
     * @return a WeeklySchedule
     */
    @javax.annotation.Nullable
    public WeeklySchedule getDefenderSystemScanSchedule() {
        return this.defenderSystemScanSchedule;
    }
    /**
     * Gets the developerUnlockSetting property value. State Management Setting.
     * @return a StateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getDeveloperUnlockSetting() {
        return this.developerUnlockSetting;
    }
    /**
     * Gets the deviceManagementBlockFactoryResetOnMobile property value. Indicates whether or not to Block the user from resetting their phone.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceManagementBlockFactoryResetOnMobile() {
        return this.deviceManagementBlockFactoryResetOnMobile;
    }
    /**
     * Gets the deviceManagementBlockManualUnenroll property value. Indicates whether or not to Block the user from doing manual un-enrollment from device management.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceManagementBlockManualUnenroll() {
        return this.deviceManagementBlockManualUnenroll;
    }
    /**
     * Gets the diagnosticsDataSubmissionMode property value. Allow the device to send diagnostic and usage telemetry data, such as Watson.
     * @return a DiagnosticDataSubmissionMode
     */
    @javax.annotation.Nullable
    public DiagnosticDataSubmissionMode getDiagnosticsDataSubmissionMode() {
        return this.diagnosticsDataSubmissionMode;
    }
    /**
     * Gets the displayAppListWithGdiDPIScalingTurnedOff property value. List of legacy applications that have GDI DPI Scaling turned off.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDisplayAppListWithGdiDPIScalingTurnedOff() {
        return this.displayAppListWithGdiDPIScalingTurnedOff;
    }
    /**
     * Gets the displayAppListWithGdiDPIScalingTurnedOn property value. List of legacy applications that have GDI DPI Scaling turned on.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDisplayAppListWithGdiDPIScalingTurnedOn() {
        return this.displayAppListWithGdiDPIScalingTurnedOn;
    }
    /**
     * Gets the edgeAllowStartPagesModification property value. Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeAllowStartPagesModification() {
        return this.edgeAllowStartPagesModification;
    }
    /**
     * Gets the edgeBlockAccessToAboutFlags property value. Indicates whether or not to prevent access to about flags on Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockAccessToAboutFlags() {
        return this.edgeBlockAccessToAboutFlags;
    }
    /**
     * Gets the edgeBlockAddressBarDropdown property value. Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockAddressBarDropdown() {
        return this.edgeBlockAddressBarDropdown;
    }
    /**
     * Gets the edgeBlockAutofill property value. Indicates whether or not to block auto fill.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockAutofill() {
        return this.edgeBlockAutofill;
    }
    /**
     * Gets the edgeBlockCompatibilityList property value. Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockCompatibilityList() {
        return this.edgeBlockCompatibilityList;
    }
    /**
     * Gets the edgeBlockDeveloperTools property value. Indicates whether or not to block developer tools in the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockDeveloperTools() {
        return this.edgeBlockDeveloperTools;
    }
    /**
     * Gets the edgeBlocked property value. Indicates whether or not to Block the user from using the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlocked() {
        return this.edgeBlocked;
    }
    /**
     * Gets the edgeBlockEditFavorites property value. Indicates whether or not to Block the user from making changes to Favorites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockEditFavorites() {
        return this.edgeBlockEditFavorites;
    }
    /**
     * Gets the edgeBlockExtensions property value. Indicates whether or not to block extensions in the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockExtensions() {
        return this.edgeBlockExtensions;
    }
    /**
     * Gets the edgeBlockFullScreenMode property value. Allow or prevent Edge from entering the full screen mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockFullScreenMode() {
        return this.edgeBlockFullScreenMode;
    }
    /**
     * Gets the edgeBlockInPrivateBrowsing property value. Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockInPrivateBrowsing() {
        return this.edgeBlockInPrivateBrowsing;
    }
    /**
     * Gets the edgeBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockJavaScript() {
        return this.edgeBlockJavaScript;
    }
    /**
     * Gets the edgeBlockLiveTileDataCollection property value. Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockLiveTileDataCollection() {
        return this.edgeBlockLiveTileDataCollection;
    }
    /**
     * Gets the edgeBlockPasswordManager property value. Indicates whether or not to Block password manager.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockPasswordManager() {
        return this.edgeBlockPasswordManager;
    }
    /**
     * Gets the edgeBlockPopups property value. Indicates whether or not to block popups.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockPopups() {
        return this.edgeBlockPopups;
    }
    /**
     * Gets the edgeBlockPrelaunch property value. Decide whether Microsoft Edge is prelaunched at Windows startup.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockPrelaunch() {
        return this.edgeBlockPrelaunch;
    }
    /**
     * Gets the edgeBlockPrinting property value. Configure Edge to allow or block printing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockPrinting() {
        return this.edgeBlockPrinting;
    }
    /**
     * Gets the edgeBlockSavingHistory property value. Configure Edge to allow browsing history to be saved or to never save browsing history.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSavingHistory() {
        return this.edgeBlockSavingHistory;
    }
    /**
     * Gets the edgeBlockSearchEngineCustomization property value. Indicates whether or not to block the user from adding new search engine or changing the default search engine.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSearchEngineCustomization() {
        return this.edgeBlockSearchEngineCustomization;
    }
    /**
     * Gets the edgeBlockSearchSuggestions property value. Indicates whether or not to block the user from using the search suggestions in the address bar.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSearchSuggestions() {
        return this.edgeBlockSearchSuggestions;
    }
    /**
     * Gets the edgeBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSendingDoNotTrackHeader() {
        return this.edgeBlockSendingDoNotTrackHeader;
    }
    /**
     * Gets the edgeBlockSendingIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSendingIntranetTrafficToInternetExplorer() {
        return this.edgeBlockSendingIntranetTrafficToInternetExplorer;
    }
    /**
     * Gets the edgeBlockSideloadingExtensions property value. Indicates whether the user can sideload extensions.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockSideloadingExtensions() {
        return this.edgeBlockSideloadingExtensions;
    }
    /**
     * Gets the edgeBlockTabPreloading property value. Configure whether Edge preloads the new tab page at Windows startup.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockTabPreloading() {
        return this.edgeBlockTabPreloading;
    }
    /**
     * Gets the edgeBlockWebContentOnNewTabPage property value. Configure to load a blank page in Edge instead of the default New tab page and prevent users from changing it.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeBlockWebContentOnNewTabPage() {
        return this.edgeBlockWebContentOnNewTabPage;
    }
    /**
     * Gets the edgeClearBrowsingDataOnExit property value. Clear browsing data on exiting Microsoft Edge.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeClearBrowsingDataOnExit() {
        return this.edgeClearBrowsingDataOnExit;
    }
    /**
     * Gets the edgeCookiePolicy property value. Possible values to specify which cookies are allowed in Microsoft Edge.
     * @return a EdgeCookiePolicy
     */
    @javax.annotation.Nullable
    public EdgeCookiePolicy getEdgeCookiePolicy() {
        return this.edgeCookiePolicy;
    }
    /**
     * Gets the edgeDisableFirstRunPage property value. Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeDisableFirstRunPage() {
        return this.edgeDisableFirstRunPage;
    }
    /**
     * Gets the edgeEnterpriseModeSiteListLocation property value. Indicates the enterprise mode site list location. Could be a local file, local network or http location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEdgeEnterpriseModeSiteListLocation() {
        return this.edgeEnterpriseModeSiteListLocation;
    }
    /**
     * Gets the edgeFavoritesBarVisibility property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getEdgeFavoritesBarVisibility() {
        return this.edgeFavoritesBarVisibility;
    }
    /**
     * Gets the edgeFavoritesListLocation property value. The location of the favorites list to provision. Could be a local file, local network or http location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEdgeFavoritesListLocation() {
        return this.edgeFavoritesListLocation;
    }
    /**
     * Gets the edgeFirstRunUrl property value. The first run URL for when Edge browser is opened for the first time.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEdgeFirstRunUrl() {
        return this.edgeFirstRunUrl;
    }
    /**
     * Gets the edgeHomeButtonConfiguration property value. Causes the Home button to either hide, load the default Start page, load a New tab page, or a custom URL
     * @return a edgeHomeButtonConfiguration
     */
    @javax.annotation.Nullable
    public EdgeHomeButtonConfiguration getEdgeHomeButtonConfiguration() {
        return this.edgeHomeButtonConfiguration;
    }
    /**
     * Gets the edgeHomeButtonConfigurationEnabled property value. Enable the Home button configuration.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeHomeButtonConfigurationEnabled() {
        return this.edgeHomeButtonConfigurationEnabled;
    }
    /**
     * Gets the edgeHomepageUrls property value. The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEdgeHomepageUrls() {
        return this.edgeHomepageUrls;
    }
    /**
     * Gets the edgeKioskModeRestriction property value. Specify how the Microsoft Edge settings are restricted based on kiosk mode.
     * @return a EdgeKioskModeRestrictionType
     */
    @javax.annotation.Nullable
    public EdgeKioskModeRestrictionType getEdgeKioskModeRestriction() {
        return this.edgeKioskModeRestriction;
    }
    /**
     * Gets the edgeKioskResetAfterIdleTimeInMinutes property value. Specifies the time in minutes from the last user activity before Microsoft Edge kiosk resets.  Valid values are 0-1440. The default is 5. 0 indicates no reset. Valid values 0 to 1440
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEdgeKioskResetAfterIdleTimeInMinutes() {
        return this.edgeKioskResetAfterIdleTimeInMinutes;
    }
    /**
     * Gets the edgeNewTabPageURL property value. Specify the page opened when new tabs are created.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEdgeNewTabPageURL() {
        return this.edgeNewTabPageURL;
    }
    /**
     * Gets the edgeOpensWith property value. Possible values for the EdgeOpensWith setting.
     * @return a EdgeOpenOptions
     */
    @javax.annotation.Nullable
    public EdgeOpenOptions getEdgeOpensWith() {
        return this.edgeOpensWith;
    }
    /**
     * Gets the edgePreventCertificateErrorOverride property value. Allow or prevent users from overriding certificate errors.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgePreventCertificateErrorOverride() {
        return this.edgePreventCertificateErrorOverride;
    }
    /**
     * Gets the edgeRequiredExtensionPackageFamilyNames property value. Specify the list of package family names of browser extensions that are required and cannot be turned off by the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEdgeRequiredExtensionPackageFamilyNames() {
        return this.edgeRequiredExtensionPackageFamilyNames;
    }
    /**
     * Gets the edgeRequireSmartScreen property value. Indicates whether or not to Require the user to use the smart screen filter.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeRequireSmartScreen() {
        return this.edgeRequireSmartScreen;
    }
    /**
     * Gets the edgeSearchEngine property value. Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set.
     * @return a edgeSearchEngineBase
     */
    @javax.annotation.Nullable
    public EdgeSearchEngineBase getEdgeSearchEngine() {
        return this.edgeSearchEngine;
    }
    /**
     * Gets the edgeSendIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeSendIntranetTrafficToInternetExplorer() {
        return this.edgeSendIntranetTrafficToInternetExplorer;
    }
    /**
     * Gets the edgeShowMessageWhenOpeningInternetExplorerSites property value. What message will be displayed by Edge before switching to Internet Explorer.
     * @return a InternetExplorerMessageSetting
     */
    @javax.annotation.Nullable
    public InternetExplorerMessageSetting getEdgeShowMessageWhenOpeningInternetExplorerSites() {
        return this.edgeShowMessageWhenOpeningInternetExplorerSites;
    }
    /**
     * Gets the edgeSyncFavoritesWithInternetExplorer property value. Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEdgeSyncFavoritesWithInternetExplorer() {
        return this.edgeSyncFavoritesWithInternetExplorer;
    }
    /**
     * Gets the edgeTelemetryForMicrosoft365Analytics property value. Type of browsing data sent to Microsoft 365 analytics
     * @return a EdgeTelemetryMode
     */
    @javax.annotation.Nullable
    public EdgeTelemetryMode getEdgeTelemetryForMicrosoft365Analytics() {
        return this.edgeTelemetryForMicrosoft365Analytics;
    }
    /**
     * Gets the enableAutomaticRedeployment property value. Allow users with administrative rights to delete all user data and settings using CTRL + Win + R at the device lock screen so that the device can be automatically re-configured and re-enrolled into management.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableAutomaticRedeployment() {
        return this.enableAutomaticRedeployment;
    }
    /**
     * Gets the energySaverOnBatteryThresholdPercentage property value. This setting allows you to specify battery charge level at which Energy Saver is turned on. While on battery, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnergySaverOnBatteryThresholdPercentage() {
        return this.energySaverOnBatteryThresholdPercentage;
    }
    /**
     * Gets the energySaverPluggedInThresholdPercentage property value. This setting allows you to specify battery charge level at which Energy Saver is turned on. While plugged in, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnergySaverPluggedInThresholdPercentage() {
        return this.energySaverPluggedInThresholdPercentage;
    }
    /**
     * Gets the enterpriseCloudPrintDiscoveryEndPoint property value. Endpoint for discovering cloud printers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintDiscoveryEndPoint() {
        return this.enterpriseCloudPrintDiscoveryEndPoint;
    }
    /**
     * Gets the enterpriseCloudPrintDiscoveryMaxLimit property value. Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnterpriseCloudPrintDiscoveryMaxLimit() {
        return this.enterpriseCloudPrintDiscoveryMaxLimit;
    }
    /**
     * Gets the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property value. OAuth resource URI for printer discovery service as configured in Azure portal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier() {
        return this.enterpriseCloudPrintMopriaDiscoveryResourceIdentifier;
    }
    /**
     * Gets the enterpriseCloudPrintOAuthAuthority property value. Authentication endpoint for acquiring OAuth tokens.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintOAuthAuthority() {
        return this.enterpriseCloudPrintOAuthAuthority;
    }
    /**
     * Gets the enterpriseCloudPrintOAuthClientIdentifier property value. GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintOAuthClientIdentifier() {
        return this.enterpriseCloudPrintOAuthClientIdentifier;
    }
    /**
     * Gets the enterpriseCloudPrintResourceIdentifier property value. OAuth resource URI for print service as configured in the Azure portal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnterpriseCloudPrintResourceIdentifier() {
        return this.enterpriseCloudPrintResourceIdentifier;
    }
    /**
     * Gets the experienceBlockDeviceDiscovery property value. Indicates whether or not to enable device discovery UX.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExperienceBlockDeviceDiscovery() {
        return this.experienceBlockDeviceDiscovery;
    }
    /**
     * Gets the experienceBlockErrorDialogWhenNoSIM property value. Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExperienceBlockErrorDialogWhenNoSIM() {
        return this.experienceBlockErrorDialogWhenNoSIM;
    }
    /**
     * Gets the experienceBlockTaskSwitcher property value. Indicates whether or not to enable task switching on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getExperienceBlockTaskSwitcher() {
        return this.experienceBlockTaskSwitcher;
    }
    /**
     * Gets the experienceDoNotSyncBrowserSettings property value. Allow(Not Configured) or prevent(Block) the syncing of Microsoft Edge Browser settings. Option to prevent syncing across devices, but allow user override.
     * @return a BrowserSyncSetting
     */
    @javax.annotation.Nullable
    public BrowserSyncSetting getExperienceDoNotSyncBrowserSettings() {
        return this.experienceDoNotSyncBrowserSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountsBlockAddingNonMicrosoftAccountEmail", (n) -> { this.setAccountsBlockAddingNonMicrosoftAccountEmail(n.getBooleanValue()); });
        deserializerMap.put("activateAppsWithVoice", (n) -> { this.setActivateAppsWithVoice(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("antiTheftModeBlocked", (n) -> { this.setAntiTheftModeBlocked(n.getBooleanValue()); });
        deserializerMap.put("appManagementMSIAllowUserControlOverInstall", (n) -> { this.setAppManagementMSIAllowUserControlOverInstall(n.getBooleanValue()); });
        deserializerMap.put("appManagementMSIAlwaysInstallWithElevatedPrivileges", (n) -> { this.setAppManagementMSIAlwaysInstallWithElevatedPrivileges(n.getBooleanValue()); });
        deserializerMap.put("appManagementPackageFamilyNamesToLaunchAfterLogOn", (n) -> { this.setAppManagementPackageFamilyNamesToLaunchAfterLogOn(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("appsAllowTrustedAppsSideloading", (n) -> { this.setAppsAllowTrustedAppsSideloading(n.getEnumValue(StateManagementSetting.class)); });
        deserializerMap.put("appsBlockWindowsStoreOriginatedApps", (n) -> { this.setAppsBlockWindowsStoreOriginatedApps(n.getBooleanValue()); });
        deserializerMap.put("authenticationAllowSecondaryDevice", (n) -> { this.setAuthenticationAllowSecondaryDevice(n.getBooleanValue()); });
        deserializerMap.put("authenticationPreferredAzureADTenantDomainName", (n) -> { this.setAuthenticationPreferredAzureADTenantDomainName(n.getStringValue()); });
        deserializerMap.put("authenticationWebSignIn", (n) -> { this.setAuthenticationWebSignIn(n.getEnumValue(Enablement.class)); });
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
        deserializerMap.put("cellularData", (n) -> { this.setCellularData(n.getEnumValue(ConfigurationUsage.class)); });
        deserializerMap.put("certificatesBlockManualRootCertificateInstallation", (n) -> { this.setCertificatesBlockManualRootCertificateInstallation(n.getBooleanValue()); });
        deserializerMap.put("configureTimeZone", (n) -> { this.setConfigureTimeZone(n.getStringValue()); });
        deserializerMap.put("connectedDevicesServiceBlocked", (n) -> { this.setConnectedDevicesServiceBlocked(n.getBooleanValue()); });
        deserializerMap.put("copyPasteBlocked", (n) -> { this.setCopyPasteBlocked(n.getBooleanValue()); });
        deserializerMap.put("cortanaBlocked", (n) -> { this.setCortanaBlocked(n.getBooleanValue()); });
        deserializerMap.put("cryptographyAllowFipsAlgorithmPolicy", (n) -> { this.setCryptographyAllowFipsAlgorithmPolicy(n.getBooleanValue()); });
        deserializerMap.put("dataProtectionBlockDirectMemoryAccess", (n) -> { this.setDataProtectionBlockDirectMemoryAccess(n.getBooleanValue()); });
        deserializerMap.put("defenderBlockEndUserAccess", (n) -> { this.setDefenderBlockEndUserAccess(n.getBooleanValue()); });
        deserializerMap.put("defenderBlockOnAccessProtection", (n) -> { this.setDefenderBlockOnAccessProtection(n.getBooleanValue()); });
        deserializerMap.put("defenderCloudBlockLevel", (n) -> { this.setDefenderCloudBlockLevel(n.getEnumValue(DefenderCloudBlockLevelType.class)); });
        deserializerMap.put("defenderCloudExtendedTimeout", (n) -> { this.setDefenderCloudExtendedTimeout(n.getIntegerValue()); });
        deserializerMap.put("defenderCloudExtendedTimeoutInSeconds", (n) -> { this.setDefenderCloudExtendedTimeoutInSeconds(n.getIntegerValue()); });
        deserializerMap.put("defenderDaysBeforeDeletingQuarantinedMalware", (n) -> { this.setDefenderDaysBeforeDeletingQuarantinedMalware(n.getIntegerValue()); });
        deserializerMap.put("defenderDetectedMalwareActions", (n) -> { this.setDefenderDetectedMalwareActions(n.getObjectValue(DefenderDetectedMalwareActions::createFromDiscriminatorValue)); });
        deserializerMap.put("defenderDisableCatchupFullScan", (n) -> { this.setDefenderDisableCatchupFullScan(n.getBooleanValue()); });
        deserializerMap.put("defenderDisableCatchupQuickScan", (n) -> { this.setDefenderDisableCatchupQuickScan(n.getBooleanValue()); });
        deserializerMap.put("defenderFileExtensionsToExclude", (n) -> { this.setDefenderFileExtensionsToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderFilesAndFoldersToExclude", (n) -> { this.setDefenderFilesAndFoldersToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderMonitorFileActivity", (n) -> { this.setDefenderMonitorFileActivity(n.getEnumValue(DefenderMonitorFileActivity.class)); });
        deserializerMap.put("defenderPotentiallyUnwantedAppAction", (n) -> { this.setDefenderPotentiallyUnwantedAppAction(n.getEnumValue(DefenderPotentiallyUnwantedAppAction.class)); });
        deserializerMap.put("defenderPotentiallyUnwantedAppActionSetting", (n) -> { this.setDefenderPotentiallyUnwantedAppActionSetting(n.getEnumValue(DefenderProtectionType.class)); });
        deserializerMap.put("defenderProcessesToExclude", (n) -> { this.setDefenderProcessesToExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defenderPromptForSampleSubmission", (n) -> { this.setDefenderPromptForSampleSubmission(n.getEnumValue(DefenderPromptForSampleSubmission.class)); });
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
        deserializerMap.put("defenderScanType", (n) -> { this.setDefenderScanType(n.getEnumValue(DefenderScanType.class)); });
        deserializerMap.put("defenderScheduledQuickScanTime", (n) -> { this.setDefenderScheduledQuickScanTime(n.getLocalTimeValue()); });
        deserializerMap.put("defenderScheduledScanTime", (n) -> { this.setDefenderScheduledScanTime(n.getLocalTimeValue()); });
        deserializerMap.put("defenderScheduleScanEnableLowCpuPriority", (n) -> { this.setDefenderScheduleScanEnableLowCpuPriority(n.getBooleanValue()); });
        deserializerMap.put("defenderSignatureUpdateIntervalInHours", (n) -> { this.setDefenderSignatureUpdateIntervalInHours(n.getIntegerValue()); });
        deserializerMap.put("defenderSubmitSamplesConsentType", (n) -> { this.setDefenderSubmitSamplesConsentType(n.getEnumValue(DefenderSubmitSamplesConsentType.class)); });
        deserializerMap.put("defenderSystemScanSchedule", (n) -> { this.setDefenderSystemScanSchedule(n.getEnumValue(WeeklySchedule.class)); });
        deserializerMap.put("developerUnlockSetting", (n) -> { this.setDeveloperUnlockSetting(n.getEnumValue(StateManagementSetting.class)); });
        deserializerMap.put("deviceManagementBlockFactoryResetOnMobile", (n) -> { this.setDeviceManagementBlockFactoryResetOnMobile(n.getBooleanValue()); });
        deserializerMap.put("deviceManagementBlockManualUnenroll", (n) -> { this.setDeviceManagementBlockManualUnenroll(n.getBooleanValue()); });
        deserializerMap.put("diagnosticsDataSubmissionMode", (n) -> { this.setDiagnosticsDataSubmissionMode(n.getEnumValue(DiagnosticDataSubmissionMode.class)); });
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
        deserializerMap.put("edgeCookiePolicy", (n) -> { this.setEdgeCookiePolicy(n.getEnumValue(EdgeCookiePolicy.class)); });
        deserializerMap.put("edgeDisableFirstRunPage", (n) -> { this.setEdgeDisableFirstRunPage(n.getBooleanValue()); });
        deserializerMap.put("edgeEnterpriseModeSiteListLocation", (n) -> { this.setEdgeEnterpriseModeSiteListLocation(n.getStringValue()); });
        deserializerMap.put("edgeFavoritesBarVisibility", (n) -> { this.setEdgeFavoritesBarVisibility(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("edgeFavoritesListLocation", (n) -> { this.setEdgeFavoritesListLocation(n.getStringValue()); });
        deserializerMap.put("edgeFirstRunUrl", (n) -> { this.setEdgeFirstRunUrl(n.getStringValue()); });
        deserializerMap.put("edgeHomeButtonConfiguration", (n) -> { this.setEdgeHomeButtonConfiguration(n.getObjectValue(EdgeHomeButtonConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("edgeHomeButtonConfigurationEnabled", (n) -> { this.setEdgeHomeButtonConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("edgeHomepageUrls", (n) -> { this.setEdgeHomepageUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("edgeKioskModeRestriction", (n) -> { this.setEdgeKioskModeRestriction(n.getEnumValue(EdgeKioskModeRestrictionType.class)); });
        deserializerMap.put("edgeKioskResetAfterIdleTimeInMinutes", (n) -> { this.setEdgeKioskResetAfterIdleTimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("edgeNewTabPageURL", (n) -> { this.setEdgeNewTabPageURL(n.getStringValue()); });
        deserializerMap.put("edgeOpensWith", (n) -> { this.setEdgeOpensWith(n.getEnumValue(EdgeOpenOptions.class)); });
        deserializerMap.put("edgePreventCertificateErrorOverride", (n) -> { this.setEdgePreventCertificateErrorOverride(n.getBooleanValue()); });
        deserializerMap.put("edgeRequiredExtensionPackageFamilyNames", (n) -> { this.setEdgeRequiredExtensionPackageFamilyNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("edgeRequireSmartScreen", (n) -> { this.setEdgeRequireSmartScreen(n.getBooleanValue()); });
        deserializerMap.put("edgeSearchEngine", (n) -> { this.setEdgeSearchEngine(n.getObjectValue(EdgeSearchEngineBase::createFromDiscriminatorValue)); });
        deserializerMap.put("edgeSendIntranetTrafficToInternetExplorer", (n) -> { this.setEdgeSendIntranetTrafficToInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("edgeShowMessageWhenOpeningInternetExplorerSites", (n) -> { this.setEdgeShowMessageWhenOpeningInternetExplorerSites(n.getEnumValue(InternetExplorerMessageSetting.class)); });
        deserializerMap.put("edgeSyncFavoritesWithInternetExplorer", (n) -> { this.setEdgeSyncFavoritesWithInternetExplorer(n.getBooleanValue()); });
        deserializerMap.put("edgeTelemetryForMicrosoft365Analytics", (n) -> { this.setEdgeTelemetryForMicrosoft365Analytics(n.getEnumValue(EdgeTelemetryMode.class)); });
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
        deserializerMap.put("experienceDoNotSyncBrowserSettings", (n) -> { this.setExperienceDoNotSyncBrowserSettings(n.getEnumValue(BrowserSyncSetting.class)); });
        deserializerMap.put("findMyFiles", (n) -> { this.setFindMyFiles(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("gameDvrBlocked", (n) -> { this.setGameDvrBlocked(n.getBooleanValue()); });
        deserializerMap.put("inkWorkspaceAccess", (n) -> { this.setInkWorkspaceAccess(n.getEnumValue(InkAccessSetting.class)); });
        deserializerMap.put("inkWorkspaceAccessState", (n) -> { this.setInkWorkspaceAccessState(n.getEnumValue(StateManagementSetting.class)); });
        deserializerMap.put("inkWorkspaceBlockSuggestedApps", (n) -> { this.setInkWorkspaceBlockSuggestedApps(n.getBooleanValue()); });
        deserializerMap.put("internetSharingBlocked", (n) -> { this.setInternetSharingBlocked(n.getBooleanValue()); });
        deserializerMap.put("locationServicesBlocked", (n) -> { this.setLocationServicesBlocked(n.getBooleanValue()); });
        deserializerMap.put("lockScreenActivateAppsWithVoice", (n) -> { this.setLockScreenActivateAppsWithVoice(n.getEnumValue(Enablement.class)); });
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
        deserializerMap.put("microsoftAccountSignInAssistantSettings", (n) -> { this.setMicrosoftAccountSignInAssistantSettings(n.getEnumValue(SignInAssistantOptions.class)); });
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
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        deserializerMap.put("passwordRequireWhenResumeFromIdleState", (n) -> { this.setPasswordRequireWhenResumeFromIdleState(n.getBooleanValue()); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { this.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("personalizationDesktopImageUrl", (n) -> { this.setPersonalizationDesktopImageUrl(n.getStringValue()); });
        deserializerMap.put("personalizationLockScreenImageUrl", (n) -> { this.setPersonalizationLockScreenImageUrl(n.getStringValue()); });
        deserializerMap.put("powerButtonActionOnBattery", (n) -> { this.setPowerButtonActionOnBattery(n.getEnumValue(PowerActionType.class)); });
        deserializerMap.put("powerButtonActionPluggedIn", (n) -> { this.setPowerButtonActionPluggedIn(n.getEnumValue(PowerActionType.class)); });
        deserializerMap.put("powerHybridSleepOnBattery", (n) -> { this.setPowerHybridSleepOnBattery(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("powerHybridSleepPluggedIn", (n) -> { this.setPowerHybridSleepPluggedIn(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("powerLidCloseActionOnBattery", (n) -> { this.setPowerLidCloseActionOnBattery(n.getEnumValue(PowerActionType.class)); });
        deserializerMap.put("powerLidCloseActionPluggedIn", (n) -> { this.setPowerLidCloseActionPluggedIn(n.getEnumValue(PowerActionType.class)); });
        deserializerMap.put("powerSleepButtonActionOnBattery", (n) -> { this.setPowerSleepButtonActionOnBattery(n.getEnumValue(PowerActionType.class)); });
        deserializerMap.put("powerSleepButtonActionPluggedIn", (n) -> { this.setPowerSleepButtonActionPluggedIn(n.getEnumValue(PowerActionType.class)); });
        deserializerMap.put("printerBlockAddition", (n) -> { this.setPrinterBlockAddition(n.getBooleanValue()); });
        deserializerMap.put("printerDefaultName", (n) -> { this.setPrinterDefaultName(n.getStringValue()); });
        deserializerMap.put("printerNames", (n) -> { this.setPrinterNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("privacyAccessControls", (n) -> { this.setPrivacyAccessControls(n.getCollectionOfObjectValues(WindowsPrivacyDataAccessControlItem::createFromDiscriminatorValue)); });
        deserializerMap.put("privacyAdvertisingId", (n) -> { this.setPrivacyAdvertisingId(n.getEnumValue(StateManagementSetting.class)); });
        deserializerMap.put("privacyAutoAcceptPairingAndConsentPrompts", (n) -> { this.setPrivacyAutoAcceptPairingAndConsentPrompts(n.getBooleanValue()); });
        deserializerMap.put("privacyBlockActivityFeed", (n) -> { this.setPrivacyBlockActivityFeed(n.getBooleanValue()); });
        deserializerMap.put("privacyBlockInputPersonalization", (n) -> { this.setPrivacyBlockInputPersonalization(n.getBooleanValue()); });
        deserializerMap.put("privacyBlockPublishUserActivities", (n) -> { this.setPrivacyBlockPublishUserActivities(n.getBooleanValue()); });
        deserializerMap.put("privacyDisableLaunchExperience", (n) -> { this.setPrivacyDisableLaunchExperience(n.getBooleanValue()); });
        deserializerMap.put("resetProtectionModeBlocked", (n) -> { this.setResetProtectionModeBlocked(n.getBooleanValue()); });
        deserializerMap.put("safeSearchFilter", (n) -> { this.setSafeSearchFilter(n.getEnumValue(SafeSearchFilterType.class)); });
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
        deserializerMap.put("smartScreenAppInstallControl", (n) -> { this.setSmartScreenAppInstallControl(n.getEnumValue(AppInstallControlType.class)); });
        deserializerMap.put("smartScreenBlockPromptOverride", (n) -> { this.setSmartScreenBlockPromptOverride(n.getBooleanValue()); });
        deserializerMap.put("smartScreenBlockPromptOverrideForFiles", (n) -> { this.setSmartScreenBlockPromptOverrideForFiles(n.getBooleanValue()); });
        deserializerMap.put("smartScreenEnableAppInstallControl", (n) -> { this.setSmartScreenEnableAppInstallControl(n.getBooleanValue()); });
        deserializerMap.put("startBlockUnpinningAppsFromTaskbar", (n) -> { this.setStartBlockUnpinningAppsFromTaskbar(n.getBooleanValue()); });
        deserializerMap.put("startMenuAppListVisibility", (n) -> { this.setStartMenuAppListVisibility(n.getEnumValue(WindowsStartMenuAppListVisibilityType.class)); });
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
        deserializerMap.put("startMenuMode", (n) -> { this.setStartMenuMode(n.getEnumValue(WindowsStartMenuModeType.class)); });
        deserializerMap.put("startMenuPinnedFolderDocuments", (n) -> { this.setStartMenuPinnedFolderDocuments(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderDownloads", (n) -> { this.setStartMenuPinnedFolderDownloads(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderFileExplorer", (n) -> { this.setStartMenuPinnedFolderFileExplorer(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderHomeGroup", (n) -> { this.setStartMenuPinnedFolderHomeGroup(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderMusic", (n) -> { this.setStartMenuPinnedFolderMusic(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderNetwork", (n) -> { this.setStartMenuPinnedFolderNetwork(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderPersonalFolder", (n) -> { this.setStartMenuPinnedFolderPersonalFolder(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderPictures", (n) -> { this.setStartMenuPinnedFolderPictures(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderSettings", (n) -> { this.setStartMenuPinnedFolderSettings(n.getEnumValue(VisibilitySetting.class)); });
        deserializerMap.put("startMenuPinnedFolderVideos", (n) -> { this.setStartMenuPinnedFolderVideos(n.getEnumValue(VisibilitySetting.class)); });
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
        deserializerMap.put("windowsSpotlightConfigureOnLockScreen", (n) -> { this.setWindowsSpotlightConfigureOnLockScreen(n.getEnumValue(WindowsSpotlightEnablementSettings.class)); });
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
    @javax.annotation.Nullable
    public Enablement getFindMyFiles() {
        return this.findMyFiles;
    }
    /**
     * Gets the gameDvrBlocked property value. Indicates whether or not to block DVR and broadcasting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGameDvrBlocked() {
        return this.gameDvrBlocked;
    }
    /**
     * Gets the inkWorkspaceAccess property value. Values for the InkWorkspaceAccess setting.
     * @return a InkAccessSetting
     */
    @javax.annotation.Nullable
    public InkAccessSetting getInkWorkspaceAccess() {
        return this.inkWorkspaceAccess;
    }
    /**
     * Gets the inkWorkspaceAccessState property value. State Management Setting.
     * @return a StateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getInkWorkspaceAccessState() {
        return this.inkWorkspaceAccessState;
    }
    /**
     * Gets the inkWorkspaceBlockSuggestedApps property value. Specify whether to show recommended app suggestions in the ink workspace.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInkWorkspaceBlockSuggestedApps() {
        return this.inkWorkspaceBlockSuggestedApps;
    }
    /**
     * Gets the internetSharingBlocked property value. Indicates whether or not to Block the user from using internet sharing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInternetSharingBlocked() {
        return this.internetSharingBlocked;
    }
    /**
     * Gets the locationServicesBlocked property value. Indicates whether or not to Block the user from location services.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocationServicesBlocked() {
        return this.locationServicesBlocked;
    }
    /**
     * Gets the lockScreenActivateAppsWithVoice property value. Possible values of a property
     * @return a Enablement
     */
    @javax.annotation.Nullable
    public Enablement getLockScreenActivateAppsWithVoice() {
        return this.lockScreenActivateAppsWithVoice;
    }
    /**
     * Gets the lockScreenAllowTimeoutConfiguration property value. Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenAllowTimeoutConfiguration() {
        return this.lockScreenAllowTimeoutConfiguration;
    }
    /**
     * Gets the lockScreenBlockActionCenterNotifications property value. Indicates whether or not to block action center notifications over lock screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockActionCenterNotifications() {
        return this.lockScreenBlockActionCenterNotifications;
    }
    /**
     * Gets the lockScreenBlockCortana property value. Indicates whether or not the user can interact with Cortana using speech while the system is locked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockCortana() {
        return this.lockScreenBlockCortana;
    }
    /**
     * Gets the lockScreenBlockToastNotifications property value. Indicates whether to allow toast notifications above the device lock screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLockScreenBlockToastNotifications() {
        return this.lockScreenBlockToastNotifications;
    }
    /**
     * Gets the lockScreenTimeoutInSeconds property value. Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLockScreenTimeoutInSeconds() {
        return this.lockScreenTimeoutInSeconds;
    }
    /**
     * Gets the logonBlockFastUserSwitching property value. Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLogonBlockFastUserSwitching() {
        return this.logonBlockFastUserSwitching;
    }
    /**
     * Gets the messagingBlockMMS property value. Indicates whether or not to block the MMS send/receive functionality on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMessagingBlockMMS() {
        return this.messagingBlockMMS;
    }
    /**
     * Gets the messagingBlockRichCommunicationServices property value. Indicates whether or not to block the RCS send/receive functionality on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMessagingBlockRichCommunicationServices() {
        return this.messagingBlockRichCommunicationServices;
    }
    /**
     * Gets the messagingBlockSync property value. Indicates whether or not to block text message back up and restore and Messaging Everywhere.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMessagingBlockSync() {
        return this.messagingBlockSync;
    }
    /**
     * Gets the microsoftAccountBlocked property value. Indicates whether or not to Block a Microsoft account.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftAccountBlocked() {
        return this.microsoftAccountBlocked;
    }
    /**
     * Gets the microsoftAccountBlockSettingsSync property value. Indicates whether or not to Block Microsoft account settings sync.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftAccountBlockSettingsSync() {
        return this.microsoftAccountBlockSettingsSync;
    }
    /**
     * Gets the microsoftAccountSignInAssistantSettings property value. Values for the SignInAssistantSettings.
     * @return a SignInAssistantOptions
     */
    @javax.annotation.Nullable
    public SignInAssistantOptions getMicrosoftAccountSignInAssistantSettings() {
        return this.microsoftAccountSignInAssistantSettings;
    }
    /**
     * Gets the networkProxyApplySettingsDeviceWide property value. If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account thats enrolled into MDM.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNetworkProxyApplySettingsDeviceWide() {
        return this.networkProxyApplySettingsDeviceWide;
    }
    /**
     * Gets the networkProxyAutomaticConfigurationUrl property value. Address to the proxy auto-config (PAC) script you want to use.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkProxyAutomaticConfigurationUrl() {
        return this.networkProxyAutomaticConfigurationUrl;
    }
    /**
     * Gets the networkProxyDisableAutoDetect property value. Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNetworkProxyDisableAutoDetect() {
        return this.networkProxyDisableAutoDetect;
    }
    /**
     * Gets the networkProxyServer property value. Specifies manual proxy server settings.
     * @return a windows10NetworkProxyServer
     */
    @javax.annotation.Nullable
    public Windows10NetworkProxyServer getNetworkProxyServer() {
        return this.networkProxyServer;
    }
    /**
     * Gets the nfcBlocked property value. Indicates whether or not to Block the user from using near field communication.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNfcBlocked() {
        return this.nfcBlocked;
    }
    /**
     * Gets the oneDriveDisableFileSync property value. Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOneDriveDisableFileSync() {
        return this.oneDriveDisableFileSync;
    }
    /**
     * Gets the passwordBlockSimple property value. Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this.passwordBlockSimple;
    }
    /**
     * Gets the passwordExpirationDays property value. The password expiration in days. Valid values 0 to 730
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumAgeInDays property value. This security setting determines the period of time (in days) that a password must be used before the user can change it. Valid values 0 to 998
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumAgeInDays() {
        return this.passwordMinimumAgeInDays;
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this.passwordMinimumCharacterSetCount;
    }
    /**
     * Gets the passwordMinimumLength property value. The minimum password length. Valid values 4 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent reuse of. Valid values 0 to 50
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequired property value. Indicates whether or not to require the user to have a password.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.passwordRequired;
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a RequiredPasswordType
     */
    @javax.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this.passwordRequiredType;
    }
    /**
     * Gets the passwordRequireWhenResumeFromIdleState property value. Indicates whether or not to require a password upon resuming from an idle state.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequireWhenResumeFromIdleState() {
        return this.passwordRequireWhenResumeFromIdleState;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset. Valid values 0 to 999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this.passwordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the personalizationDesktopImageUrl property value. A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPersonalizationDesktopImageUrl() {
        return this.personalizationDesktopImageUrl;
    }
    /**
     * Gets the personalizationLockScreenImageUrl property value. A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a file Url to a local image on the file system that needs to be used as the Lock Screen Image.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPersonalizationLockScreenImageUrl() {
        return this.personalizationLockScreenImageUrl;
    }
    /**
     * Gets the powerButtonActionOnBattery property value. Power action types
     * @return a PowerActionType
     */
    @javax.annotation.Nullable
    public PowerActionType getPowerButtonActionOnBattery() {
        return this.powerButtonActionOnBattery;
    }
    /**
     * Gets the powerButtonActionPluggedIn property value. Power action types
     * @return a PowerActionType
     */
    @javax.annotation.Nullable
    public PowerActionType getPowerButtonActionPluggedIn() {
        return this.powerButtonActionPluggedIn;
    }
    /**
     * Gets the powerHybridSleepOnBattery property value. Possible values of a property
     * @return a Enablement
     */
    @javax.annotation.Nullable
    public Enablement getPowerHybridSleepOnBattery() {
        return this.powerHybridSleepOnBattery;
    }
    /**
     * Gets the powerHybridSleepPluggedIn property value. Possible values of a property
     * @return a Enablement
     */
    @javax.annotation.Nullable
    public Enablement getPowerHybridSleepPluggedIn() {
        return this.powerHybridSleepPluggedIn;
    }
    /**
     * Gets the powerLidCloseActionOnBattery property value. Power action types
     * @return a PowerActionType
     */
    @javax.annotation.Nullable
    public PowerActionType getPowerLidCloseActionOnBattery() {
        return this.powerLidCloseActionOnBattery;
    }
    /**
     * Gets the powerLidCloseActionPluggedIn property value. Power action types
     * @return a PowerActionType
     */
    @javax.annotation.Nullable
    public PowerActionType getPowerLidCloseActionPluggedIn() {
        return this.powerLidCloseActionPluggedIn;
    }
    /**
     * Gets the powerSleepButtonActionOnBattery property value. Power action types
     * @return a PowerActionType
     */
    @javax.annotation.Nullable
    public PowerActionType getPowerSleepButtonActionOnBattery() {
        return this.powerSleepButtonActionOnBattery;
    }
    /**
     * Gets the powerSleepButtonActionPluggedIn property value. Power action types
     * @return a PowerActionType
     */
    @javax.annotation.Nullable
    public PowerActionType getPowerSleepButtonActionPluggedIn() {
        return this.powerSleepButtonActionPluggedIn;
    }
    /**
     * Gets the printerBlockAddition property value. Prevent user installation of additional printers from printers settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrinterBlockAddition() {
        return this.printerBlockAddition;
    }
    /**
     * Gets the printerDefaultName property value. Name (network host name) of an installed printer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrinterDefaultName() {
        return this.printerDefaultName;
    }
    /**
     * Gets the printerNames property value. Automatically provision printers based on their names (network host names).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPrinterNames() {
        return this.printerNames;
    }
    /**
     * Gets the privacyAccessControls property value. Indicates a list of applications with their access control levels over privacy data categories, and/or the default access levels per category. This collection can contain a maximum of 500 elements.
     * @return a windowsPrivacyDataAccessControlItem
     */
    @javax.annotation.Nullable
    public java.util.List<WindowsPrivacyDataAccessControlItem> getPrivacyAccessControls() {
        return this.privacyAccessControls;
    }
    /**
     * Gets the privacyAdvertisingId property value. State Management Setting.
     * @return a StateManagementSetting
     */
    @javax.annotation.Nullable
    public StateManagementSetting getPrivacyAdvertisingId() {
        return this.privacyAdvertisingId;
    }
    /**
     * Gets the privacyAutoAcceptPairingAndConsentPrompts property value. Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyAutoAcceptPairingAndConsentPrompts() {
        return this.privacyAutoAcceptPairingAndConsentPrompts;
    }
    /**
     * Gets the privacyBlockActivityFeed property value. Blocks the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyBlockActivityFeed() {
        return this.privacyBlockActivityFeed;
    }
    /**
     * Gets the privacyBlockInputPersonalization property value. Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyBlockInputPersonalization() {
        return this.privacyBlockInputPersonalization;
    }
    /**
     * Gets the privacyBlockPublishUserActivities property value. Blocks the shared experiences/discovery of recently used resources in task switcher etc.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyBlockPublishUserActivities() {
        return this.privacyBlockPublishUserActivities;
    }
    /**
     * Gets the privacyDisableLaunchExperience property value. This policy prevents the privacy experience from launching during user logon for new and upgraded users.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPrivacyDisableLaunchExperience() {
        return this.privacyDisableLaunchExperience;
    }
    /**
     * Gets the resetProtectionModeBlocked property value. Indicates whether or not to Block the user from reset protection mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getResetProtectionModeBlocked() {
        return this.resetProtectionModeBlocked;
    }
    /**
     * Gets the safeSearchFilter property value. Specifies what level of safe search (filtering adult content) is required
     * @return a SafeSearchFilterType
     */
    @javax.annotation.Nullable
    public SafeSearchFilterType getSafeSearchFilter() {
        return this.safeSearchFilter;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to Block the user from taking Screenshots.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.screenCaptureBlocked;
    }
    /**
     * Gets the searchBlockDiacritics property value. Specifies if search can use diacritics.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchBlockDiacritics() {
        return this.searchBlockDiacritics;
    }
    /**
     * Gets the searchBlockWebResults property value. Indicates whether or not to block the web search.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchBlockWebResults() {
        return this.searchBlockWebResults;
    }
    /**
     * Gets the searchDisableAutoLanguageDetection property value. Specifies whether to use automatic language detection when indexing content and properties.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableAutoLanguageDetection() {
        return this.searchDisableAutoLanguageDetection;
    }
    /**
     * Gets the searchDisableIndexerBackoff property value. Indicates whether or not to disable the search indexer backoff feature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableIndexerBackoff() {
        return this.searchDisableIndexerBackoff;
    }
    /**
     * Gets the searchDisableIndexingEncryptedItems property value. Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableIndexingEncryptedItems() {
        return this.searchDisableIndexingEncryptedItems;
    }
    /**
     * Gets the searchDisableIndexingRemovableDrive property value. Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableIndexingRemovableDrive() {
        return this.searchDisableIndexingRemovableDrive;
    }
    /**
     * Gets the searchDisableLocation property value. Specifies if search can use location information.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableLocation() {
        return this.searchDisableLocation;
    }
    /**
     * Gets the searchDisableUseLocation property value. Specifies if search can use location information.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchDisableUseLocation() {
        return this.searchDisableUseLocation;
    }
    /**
     * Gets the searchEnableAutomaticIndexSizeManangement property value. Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchEnableAutomaticIndexSizeManangement() {
        return this.searchEnableAutomaticIndexSizeManangement;
    }
    /**
     * Gets the searchEnableRemoteQueries property value. Indicates whether or not to block remote queries of this computers index.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSearchEnableRemoteQueries() {
        return this.searchEnableRemoteQueries;
    }
    /**
     * Gets the securityBlockAzureADJoinedDevicesAutoEncryption property value. Specify whether to allow automatic device encryption during OOBE when the device is Azure AD joined (desktop only).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityBlockAzureADJoinedDevicesAutoEncryption() {
        return this.securityBlockAzureADJoinedDevicesAutoEncryption;
    }
    /**
     * Gets the settingsBlockAccountsPage property value. Indicates whether or not to block access to Accounts in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockAccountsPage() {
        return this.settingsBlockAccountsPage;
    }
    /**
     * Gets the settingsBlockAddProvisioningPackage property value. Indicates whether or not to block the user from installing provisioning packages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockAddProvisioningPackage() {
        return this.settingsBlockAddProvisioningPackage;
    }
    /**
     * Gets the settingsBlockAppsPage property value. Indicates whether or not to block access to Apps in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockAppsPage() {
        return this.settingsBlockAppsPage;
    }
    /**
     * Gets the settingsBlockChangeLanguage property value. Indicates whether or not to block the user from changing the language settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangeLanguage() {
        return this.settingsBlockChangeLanguage;
    }
    /**
     * Gets the settingsBlockChangePowerSleep property value. Indicates whether or not to block the user from changing power and sleep settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangePowerSleep() {
        return this.settingsBlockChangePowerSleep;
    }
    /**
     * Gets the settingsBlockChangeRegion property value. Indicates whether or not to block the user from changing the region settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangeRegion() {
        return this.settingsBlockChangeRegion;
    }
    /**
     * Gets the settingsBlockChangeSystemTime property value. Indicates whether or not to block the user from changing date and time settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockChangeSystemTime() {
        return this.settingsBlockChangeSystemTime;
    }
    /**
     * Gets the settingsBlockDevicesPage property value. Indicates whether or not to block access to Devices in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockDevicesPage() {
        return this.settingsBlockDevicesPage;
    }
    /**
     * Gets the settingsBlockEaseOfAccessPage property value. Indicates whether or not to block access to Ease of Access in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockEaseOfAccessPage() {
        return this.settingsBlockEaseOfAccessPage;
    }
    /**
     * Gets the settingsBlockEditDeviceName property value. Indicates whether or not to block the user from editing the device name.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockEditDeviceName() {
        return this.settingsBlockEditDeviceName;
    }
    /**
     * Gets the settingsBlockGamingPage property value. Indicates whether or not to block access to Gaming in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockGamingPage() {
        return this.settingsBlockGamingPage;
    }
    /**
     * Gets the settingsBlockNetworkInternetPage property value. Indicates whether or not to block access to Network & Internet in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockNetworkInternetPage() {
        return this.settingsBlockNetworkInternetPage;
    }
    /**
     * Gets the settingsBlockPersonalizationPage property value. Indicates whether or not to block access to Personalization in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockPersonalizationPage() {
        return this.settingsBlockPersonalizationPage;
    }
    /**
     * Gets the settingsBlockPrivacyPage property value. Indicates whether or not to block access to Privacy in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockPrivacyPage() {
        return this.settingsBlockPrivacyPage;
    }
    /**
     * Gets the settingsBlockRemoveProvisioningPackage property value. Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockRemoveProvisioningPackage() {
        return this.settingsBlockRemoveProvisioningPackage;
    }
    /**
     * Gets the settingsBlockSettingsApp property value. Indicates whether or not to block access to Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockSettingsApp() {
        return this.settingsBlockSettingsApp;
    }
    /**
     * Gets the settingsBlockSystemPage property value. Indicates whether or not to block access to System in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockSystemPage() {
        return this.settingsBlockSystemPage;
    }
    /**
     * Gets the settingsBlockTimeLanguagePage property value. Indicates whether or not to block access to Time & Language in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockTimeLanguagePage() {
        return this.settingsBlockTimeLanguagePage;
    }
    /**
     * Gets the settingsBlockUpdateSecurityPage property value. Indicates whether or not to block access to Update & Security in Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSettingsBlockUpdateSecurityPage() {
        return this.settingsBlockUpdateSecurityPage;
    }
    /**
     * Gets the sharedUserAppDataAllowed property value. Indicates whether or not to block multiple users of the same app to share data.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSharedUserAppDataAllowed() {
        return this.sharedUserAppDataAllowed;
    }
    /**
     * Gets the smartScreenAppInstallControl property value. App Install control Setting
     * @return a AppInstallControlType
     */
    @javax.annotation.Nullable
    public AppInstallControlType getSmartScreenAppInstallControl() {
        return this.smartScreenAppInstallControl;
    }
    /**
     * Gets the smartScreenBlockPromptOverride property value. Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenBlockPromptOverride() {
        return this.smartScreenBlockPromptOverride;
    }
    /**
     * Gets the smartScreenBlockPromptOverrideForFiles property value. Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenBlockPromptOverrideForFiles() {
        return this.smartScreenBlockPromptOverrideForFiles;
    }
    /**
     * Gets the smartScreenEnableAppInstallControl property value. This property will be deprecated in July 2019 and will be replaced by property SmartScreenAppInstallControl. Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSmartScreenEnableAppInstallControl() {
        return this.smartScreenEnableAppInstallControl;
    }
    /**
     * Gets the startBlockUnpinningAppsFromTaskbar property value. Indicates whether or not to block the user from unpinning apps from taskbar.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartBlockUnpinningAppsFromTaskbar() {
        return this.startBlockUnpinningAppsFromTaskbar;
    }
    /**
     * Gets the startMenuAppListVisibility property value. Type of start menu app list visibility.
     * @return a WindowsStartMenuAppListVisibilityType
     */
    @javax.annotation.Nullable
    public WindowsStartMenuAppListVisibilityType getStartMenuAppListVisibility() {
        return this.startMenuAppListVisibility;
    }
    /**
     * Gets the startMenuHideChangeAccountSettings property value. Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideChangeAccountSettings() {
        return this.startMenuHideChangeAccountSettings;
    }
    /**
     * Gets the startMenuHideFrequentlyUsedApps property value. Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideFrequentlyUsedApps() {
        return this.startMenuHideFrequentlyUsedApps;
    }
    /**
     * Gets the startMenuHideHibernate property value. Enabling this policy hides hibernate from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideHibernate() {
        return this.startMenuHideHibernate;
    }
    /**
     * Gets the startMenuHideLock property value. Enabling this policy hides lock from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideLock() {
        return this.startMenuHideLock;
    }
    /**
     * Gets the startMenuHidePowerButton property value. Enabling this policy hides the power button from appearing in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHidePowerButton() {
        return this.startMenuHidePowerButton;
    }
    /**
     * Gets the startMenuHideRecentJumpLists property value. Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideRecentJumpLists() {
        return this.startMenuHideRecentJumpLists;
    }
    /**
     * Gets the startMenuHideRecentlyAddedApps property value. Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideRecentlyAddedApps() {
        return this.startMenuHideRecentlyAddedApps;
    }
    /**
     * Gets the startMenuHideRestartOptions property value. Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideRestartOptions() {
        return this.startMenuHideRestartOptions;
    }
    /**
     * Gets the startMenuHideShutDown property value. Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideShutDown() {
        return this.startMenuHideShutDown;
    }
    /**
     * Gets the startMenuHideSignOut property value. Enabling this policy hides sign out from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideSignOut() {
        return this.startMenuHideSignOut;
    }
    /**
     * Gets the startMenuHideSleep property value. Enabling this policy hides sleep from appearing in the power button in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideSleep() {
        return this.startMenuHideSleep;
    }
    /**
     * Gets the startMenuHideSwitchAccount property value. Enabling this policy hides switch account from appearing in the user tile in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideSwitchAccount() {
        return this.startMenuHideSwitchAccount;
    }
    /**
     * Gets the startMenuHideUserTile property value. Enabling this policy hides the user tile from appearing in the start menu.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStartMenuHideUserTile() {
        return this.startMenuHideUserTile;
    }
    /**
     * Gets the startMenuLayoutEdgeAssetsXml property value. This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getStartMenuLayoutEdgeAssetsXml() {
        return this.startMenuLayoutEdgeAssetsXml;
    }
    /**
     * Gets the startMenuLayoutXml property value. Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getStartMenuLayoutXml() {
        return this.startMenuLayoutXml;
    }
    /**
     * Gets the startMenuMode property value. Type of display modes for the start menu.
     * @return a WindowsStartMenuModeType
     */
    @javax.annotation.Nullable
    public WindowsStartMenuModeType getStartMenuMode() {
        return this.startMenuMode;
    }
    /**
     * Gets the startMenuPinnedFolderDocuments property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderDocuments() {
        return this.startMenuPinnedFolderDocuments;
    }
    /**
     * Gets the startMenuPinnedFolderDownloads property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderDownloads() {
        return this.startMenuPinnedFolderDownloads;
    }
    /**
     * Gets the startMenuPinnedFolderFileExplorer property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderFileExplorer() {
        return this.startMenuPinnedFolderFileExplorer;
    }
    /**
     * Gets the startMenuPinnedFolderHomeGroup property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderHomeGroup() {
        return this.startMenuPinnedFolderHomeGroup;
    }
    /**
     * Gets the startMenuPinnedFolderMusic property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderMusic() {
        return this.startMenuPinnedFolderMusic;
    }
    /**
     * Gets the startMenuPinnedFolderNetwork property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderNetwork() {
        return this.startMenuPinnedFolderNetwork;
    }
    /**
     * Gets the startMenuPinnedFolderPersonalFolder property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderPersonalFolder() {
        return this.startMenuPinnedFolderPersonalFolder;
    }
    /**
     * Gets the startMenuPinnedFolderPictures property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderPictures() {
        return this.startMenuPinnedFolderPictures;
    }
    /**
     * Gets the startMenuPinnedFolderSettings property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderSettings() {
        return this.startMenuPinnedFolderSettings;
    }
    /**
     * Gets the startMenuPinnedFolderVideos property value. Generic visibility state.
     * @return a VisibilitySetting
     */
    @javax.annotation.Nullable
    public VisibilitySetting getStartMenuPinnedFolderVideos() {
        return this.startMenuPinnedFolderVideos;
    }
    /**
     * Gets the storageBlockRemovableStorage property value. Indicates whether or not to Block the user from using removable storage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockRemovableStorage() {
        return this.storageBlockRemovableStorage;
    }
    /**
     * Gets the storageRequireMobileDeviceEncryption property value. Indicating whether or not to require encryption on a mobile device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRequireMobileDeviceEncryption() {
        return this.storageRequireMobileDeviceEncryption;
    }
    /**
     * Gets the storageRestrictAppDataToSystemVolume property value. Indicates whether application data is restricted to the system drive.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRestrictAppDataToSystemVolume() {
        return this.storageRestrictAppDataToSystemVolume;
    }
    /**
     * Gets the storageRestrictAppInstallToSystemVolume property value. Indicates whether the installation of applications is restricted to the system drive.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRestrictAppInstallToSystemVolume() {
        return this.storageRestrictAppInstallToSystemVolume;
    }
    /**
     * Gets the systemTelemetryProxyServer property value. Gets or sets the fully qualified domain name (FQDN) or IP address of a proxy server to forward Connected User Experiences and Telemetry requests.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSystemTelemetryProxyServer() {
        return this.systemTelemetryProxyServer;
    }
    /**
     * Gets the taskManagerBlockEndTask property value. Specify whether non-administrators can use Task Manager to end tasks.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTaskManagerBlockEndTask() {
        return this.taskManagerBlockEndTask;
    }
    /**
     * Gets the tenantLockdownRequireNetworkDuringOutOfBoxExperience property value. Whether the device is required to connect to the network.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTenantLockdownRequireNetworkDuringOutOfBoxExperience() {
        return this.tenantLockdownRequireNetworkDuringOutOfBoxExperience;
    }
    /**
     * Gets the uninstallBuiltInApps property value. Indicates whether or not to uninstall a fixed list of built-in Windows apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUninstallBuiltInApps() {
        return this.uninstallBuiltInApps;
    }
    /**
     * Gets the usbBlocked property value. Indicates whether or not to Block the user from USB connection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUsbBlocked() {
        return this.usbBlocked;
    }
    /**
     * Gets the voiceRecordingBlocked property value. Indicates whether or not to Block the user from voice recording.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVoiceRecordingBlocked() {
        return this.voiceRecordingBlocked;
    }
    /**
     * Gets the webRtcBlockLocalhostIpAddress property value. Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWebRtcBlockLocalhostIpAddress() {
        return this.webRtcBlockLocalhostIpAddress;
    }
    /**
     * Gets the wiFiBlockAutomaticConnectHotspots property value. Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiBlockAutomaticConnectHotspots() {
        return this.wiFiBlockAutomaticConnectHotspots;
    }
    /**
     * Gets the wiFiBlocked property value. Indicates whether or not to Block the user from using Wi-Fi.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiBlocked() {
        return this.wiFiBlocked;
    }
    /**
     * Gets the wiFiBlockManualConfiguration property value. Indicates whether or not to Block the user from using Wi-Fi manual configuration.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWiFiBlockManualConfiguration() {
        return this.wiFiBlockManualConfiguration;
    }
    /**
     * Gets the wiFiScanInterval property value. Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWiFiScanInterval() {
        return this.wiFiScanInterval;
    }
    /**
     * Gets the windows10AppsForceUpdateSchedule property value. Windows 10 force update schedule for Apps.
     * @return a windows10AppsForceUpdateSchedule
     */
    @javax.annotation.Nullable
    public Windows10AppsForceUpdateSchedule getWindows10AppsForceUpdateSchedule() {
        return this.windows10AppsForceUpdateSchedule;
    }
    /**
     * Gets the windowsSpotlightBlockConsumerSpecificFeatures property value. Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockConsumerSpecificFeatures() {
        return this.windowsSpotlightBlockConsumerSpecificFeatures;
    }
    /**
     * Gets the windowsSpotlightBlocked property value. Allows IT admins to turn off all Windows Spotlight features
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlocked() {
        return this.windowsSpotlightBlocked;
    }
    /**
     * Gets the windowsSpotlightBlockOnActionCenter property value. Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockOnActionCenter() {
        return this.windowsSpotlightBlockOnActionCenter;
    }
    /**
     * Gets the windowsSpotlightBlockTailoredExperiences property value. Block personalized content in Windows spotlight based on users device usage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockTailoredExperiences() {
        return this.windowsSpotlightBlockTailoredExperiences;
    }
    /**
     * Gets the windowsSpotlightBlockThirdPartyNotifications property value. Block third party content delivered via Windows Spotlight
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockThirdPartyNotifications() {
        return this.windowsSpotlightBlockThirdPartyNotifications;
    }
    /**
     * Gets the windowsSpotlightBlockWelcomeExperience property value. Block Windows Spotlight Windows welcome experience
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockWelcomeExperience() {
        return this.windowsSpotlightBlockWelcomeExperience;
    }
    /**
     * Gets the windowsSpotlightBlockWindowsTips property value. Allows IT admins to turn off the popup of Windows Tips.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsSpotlightBlockWindowsTips() {
        return this.windowsSpotlightBlockWindowsTips;
    }
    /**
     * Gets the windowsSpotlightConfigureOnLockScreen property value. Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     * @return a WindowsSpotlightEnablementSettings
     */
    @javax.annotation.Nullable
    public WindowsSpotlightEnablementSettings getWindowsSpotlightConfigureOnLockScreen() {
        return this.windowsSpotlightConfigureOnLockScreen;
    }
    /**
     * Gets the windowsStoreBlockAutoUpdate property value. Indicates whether or not to block automatic update of apps from Windows Store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsStoreBlockAutoUpdate() {
        return this.windowsStoreBlockAutoUpdate;
    }
    /**
     * Gets the windowsStoreBlocked property value. Indicates whether or not to Block the user from using the Windows store.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsStoreBlocked() {
        return this.windowsStoreBlocked;
    }
    /**
     * Gets the windowsStoreEnablePrivateStoreOnly property value. Indicates whether or not to enable Private Store Only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsStoreEnablePrivateStoreOnly() {
        return this.windowsStoreEnablePrivateStoreOnly;
    }
    /**
     * Gets the wirelessDisplayBlockProjectionToThisDevice property value. Indicates whether or not to allow other devices from discovering this PC for projection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWirelessDisplayBlockProjectionToThisDevice() {
        return this.wirelessDisplayBlockProjectionToThisDevice;
    }
    /**
     * Gets the wirelessDisplayBlockUserInputFromReceiver property value. Indicates whether or not to allow user input from wireless display receiver.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWirelessDisplayBlockUserInputFromReceiver() {
        return this.wirelessDisplayBlockUserInputFromReceiver;
    }
    /**
     * Gets the wirelessDisplayRequirePinForPairing property value. Indicates whether or not to require a PIN for new devices to initiate pairing.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWirelessDisplayRequirePinForPairing() {
        return this.wirelessDisplayRequirePinForPairing;
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
    @javax.annotation.Nonnull
    public void setAccountsBlockAddingNonMicrosoftAccountEmail(@javax.annotation.Nullable final Boolean value) {
        this.accountsBlockAddingNonMicrosoftAccountEmail = value;
    }
    /**
     * Sets the activateAppsWithVoice property value. Possible values of a property
     * @param value Value to set for the activateAppsWithVoice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivateAppsWithVoice(@javax.annotation.Nullable final Enablement value) {
        this.activateAppsWithVoice = value;
    }
    /**
     * Sets the antiTheftModeBlocked property value. Indicates whether or not to block the user from selecting an AntiTheft mode preference (Windows 10 Mobile only).
     * @param value Value to set for the antiTheftModeBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAntiTheftModeBlocked(@javax.annotation.Nullable final Boolean value) {
        this.antiTheftModeBlocked = value;
    }
    /**
     * Sets the appManagementMSIAllowUserControlOverInstall property value. This policy setting permits users to change installation options that typically are available only to system administrators.
     * @param value Value to set for the appManagementMSIAllowUserControlOverInstall property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppManagementMSIAllowUserControlOverInstall(@javax.annotation.Nullable final Boolean value) {
        this.appManagementMSIAllowUserControlOverInstall = value;
    }
    /**
     * Sets the appManagementMSIAlwaysInstallWithElevatedPrivileges property value. This policy setting directs Windows Installer to use elevated permissions when it installs any program on the system.
     * @param value Value to set for the appManagementMSIAlwaysInstallWithElevatedPrivileges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppManagementMSIAlwaysInstallWithElevatedPrivileges(@javax.annotation.Nullable final Boolean value) {
        this.appManagementMSIAlwaysInstallWithElevatedPrivileges = value;
    }
    /**
     * Sets the appManagementPackageFamilyNamesToLaunchAfterLogOn property value. List of semi-colon delimited Package Family Names of Windows apps. Listed Windows apps are to be launched after logon.
     * @param value Value to set for the appManagementPackageFamilyNamesToLaunchAfterLogOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppManagementPackageFamilyNamesToLaunchAfterLogOn(@javax.annotation.Nullable final java.util.List<String> value) {
        this.appManagementPackageFamilyNamesToLaunchAfterLogOn = value;
    }
    /**
     * Sets the appsAllowTrustedAppsSideloading property value. State Management Setting.
     * @param value Value to set for the appsAllowTrustedAppsSideloading property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsAllowTrustedAppsSideloading(@javax.annotation.Nullable final StateManagementSetting value) {
        this.appsAllowTrustedAppsSideloading = value;
    }
    /**
     * Sets the appsBlockWindowsStoreOriginatedApps property value. Indicates whether or not to disable the launch of all apps from Windows Store that came pre-installed or were downloaded.
     * @param value Value to set for the appsBlockWindowsStoreOriginatedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsBlockWindowsStoreOriginatedApps(@javax.annotation.Nullable final Boolean value) {
        this.appsBlockWindowsStoreOriginatedApps = value;
    }
    /**
     * Sets the authenticationAllowSecondaryDevice property value. Allows secondary authentication devices to work with Windows.
     * @param value Value to set for the authenticationAllowSecondaryDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationAllowSecondaryDevice(@javax.annotation.Nullable final Boolean value) {
        this.authenticationAllowSecondaryDevice = value;
    }
    /**
     * Sets the authenticationPreferredAzureADTenantDomainName property value. Specifies the preferred domain among available domains in the Azure AD tenant.
     * @param value Value to set for the authenticationPreferredAzureADTenantDomainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationPreferredAzureADTenantDomainName(@javax.annotation.Nullable final String value) {
        this.authenticationPreferredAzureADTenantDomainName = value;
    }
    /**
     * Sets the authenticationWebSignIn property value. Possible values of a property
     * @param value Value to set for the authenticationWebSignIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationWebSignIn(@javax.annotation.Nullable final Enablement value) {
        this.authenticationWebSignIn = value;
    }
    /**
     * Sets the bluetoothAllowedServices property value. Specify a list of allowed Bluetooth services and profiles in hex formatted strings.
     * @param value Value to set for the bluetoothAllowedServices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothAllowedServices(@javax.annotation.Nullable final java.util.List<String> value) {
        this.bluetoothAllowedServices = value;
    }
    /**
     * Sets the bluetoothBlockAdvertising property value. Whether or not to Block the user from using bluetooth advertising.
     * @param value Value to set for the bluetoothBlockAdvertising property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockAdvertising(@javax.annotation.Nullable final Boolean value) {
        this.bluetoothBlockAdvertising = value;
    }
    /**
     * Sets the bluetoothBlockDiscoverableMode property value. Whether or not to Block the user from using bluetooth discoverable mode.
     * @param value Value to set for the bluetoothBlockDiscoverableMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockDiscoverableMode(@javax.annotation.Nullable final Boolean value) {
        this.bluetoothBlockDiscoverableMode = value;
    }
    /**
     * Sets the bluetoothBlocked property value. Whether or not to Block the user from using bluetooth.
     * @param value Value to set for the bluetoothBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlocked(@javax.annotation.Nullable final Boolean value) {
        this.bluetoothBlocked = value;
    }
    /**
     * Sets the bluetoothBlockPrePairing property value. Whether or not to block specific bundled Bluetooth peripherals to automatically pair with the host device.
     * @param value Value to set for the bluetoothBlockPrePairing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockPrePairing(@javax.annotation.Nullable final Boolean value) {
        this.bluetoothBlockPrePairing = value;
    }
    /**
     * Sets the bluetoothBlockPromptedProximalConnections property value. Whether or not to block the users from using Swift Pair and other proximity based scenarios.
     * @param value Value to set for the bluetoothBlockPromptedProximalConnections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockPromptedProximalConnections(@javax.annotation.Nullable final Boolean value) {
        this.bluetoothBlockPromptedProximalConnections = value;
    }
    /**
     * Sets the cameraBlocked property value. Whether or not to Block the user from accessing the camera of the device.
     * @param value Value to set for the cameraBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this.cameraBlocked = value;
    }
    /**
     * Sets the cellularBlockDataWhenRoaming property value. Whether or not to Block the user from using data over cellular while roaming.
     * @param value Value to set for the cellularBlockDataWhenRoaming property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockDataWhenRoaming(@javax.annotation.Nullable final Boolean value) {
        this.cellularBlockDataWhenRoaming = value;
    }
    /**
     * Sets the cellularBlockVpn property value. Whether or not to Block the user from using VPN over cellular.
     * @param value Value to set for the cellularBlockVpn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockVpn(@javax.annotation.Nullable final Boolean value) {
        this.cellularBlockVpn = value;
    }
    /**
     * Sets the cellularBlockVpnWhenRoaming property value. Whether or not to Block the user from using VPN when roaming over cellular.
     * @param value Value to set for the cellularBlockVpnWhenRoaming property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockVpnWhenRoaming(@javax.annotation.Nullable final Boolean value) {
        this.cellularBlockVpnWhenRoaming = value;
    }
    /**
     * Sets the cellularData property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the cellularData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularData(@javax.annotation.Nullable final ConfigurationUsage value) {
        this.cellularData = value;
    }
    /**
     * Sets the certificatesBlockManualRootCertificateInstallation property value. Whether or not to Block the user from doing manual root certificate installation.
     * @param value Value to set for the certificatesBlockManualRootCertificateInstallation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificatesBlockManualRootCertificateInstallation(@javax.annotation.Nullable final Boolean value) {
        this.certificatesBlockManualRootCertificateInstallation = value;
    }
    /**
     * Sets the configureTimeZone property value. Specifies the time zone to be applied to the device. This is the standard Windows name for the target time zone.
     * @param value Value to set for the configureTimeZone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigureTimeZone(@javax.annotation.Nullable final String value) {
        this.configureTimeZone = value;
    }
    /**
     * Sets the connectedDevicesServiceBlocked property value. Whether or not to block Connected Devices Service which enables discovery and connection to other devices, remote messaging, remote app sessions and other cross-device experiences.
     * @param value Value to set for the connectedDevicesServiceBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectedDevicesServiceBlocked(@javax.annotation.Nullable final Boolean value) {
        this.connectedDevicesServiceBlocked = value;
    }
    /**
     * Sets the copyPasteBlocked property value. Whether or not to Block the user from using copy paste.
     * @param value Value to set for the copyPasteBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCopyPasteBlocked(@javax.annotation.Nullable final Boolean value) {
        this.copyPasteBlocked = value;
    }
    /**
     * Sets the cortanaBlocked property value. Whether or not to Block the user from using Cortana.
     * @param value Value to set for the cortanaBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCortanaBlocked(@javax.annotation.Nullable final Boolean value) {
        this.cortanaBlocked = value;
    }
    /**
     * Sets the cryptographyAllowFipsAlgorithmPolicy property value. Specify whether to allow or disallow the Federal Information Processing Standard (FIPS) policy.
     * @param value Value to set for the cryptographyAllowFipsAlgorithmPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCryptographyAllowFipsAlgorithmPolicy(@javax.annotation.Nullable final Boolean value) {
        this.cryptographyAllowFipsAlgorithmPolicy = value;
    }
    /**
     * Sets the dataProtectionBlockDirectMemoryAccess property value. This policy setting allows you to block direct memory access (DMA) for all hot pluggable PCI downstream ports until a user logs into Windows.
     * @param value Value to set for the dataProtectionBlockDirectMemoryAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataProtectionBlockDirectMemoryAccess(@javax.annotation.Nullable final Boolean value) {
        this.dataProtectionBlockDirectMemoryAccess = value;
    }
    /**
     * Sets the defenderBlockEndUserAccess property value. Whether or not to block end user access to Defender.
     * @param value Value to set for the defenderBlockEndUserAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderBlockEndUserAccess(@javax.annotation.Nullable final Boolean value) {
        this.defenderBlockEndUserAccess = value;
    }
    /**
     * Sets the defenderBlockOnAccessProtection property value. Allows or disallows Windows Defender On Access Protection functionality.
     * @param value Value to set for the defenderBlockOnAccessProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderBlockOnAccessProtection(@javax.annotation.Nullable final Boolean value) {
        this.defenderBlockOnAccessProtection = value;
    }
    /**
     * Sets the defenderCloudBlockLevel property value. Possible values of Cloud Block Level
     * @param value Value to set for the defenderCloudBlockLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderCloudBlockLevel(@javax.annotation.Nullable final DefenderCloudBlockLevelType value) {
        this.defenderCloudBlockLevel = value;
    }
    /**
     * Sets the defenderCloudExtendedTimeout property value. Timeout extension for file scanning by the cloud. Valid values 0 to 50
     * @param value Value to set for the defenderCloudExtendedTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderCloudExtendedTimeout(@javax.annotation.Nullable final Integer value) {
        this.defenderCloudExtendedTimeout = value;
    }
    /**
     * Sets the defenderCloudExtendedTimeoutInSeconds property value. Timeout extension for file scanning by the cloud. Valid values 0 to 50
     * @param value Value to set for the defenderCloudExtendedTimeoutInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderCloudExtendedTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this.defenderCloudExtendedTimeoutInSeconds = value;
    }
    /**
     * Sets the defenderDaysBeforeDeletingQuarantinedMalware property value. Number of days before deleting quarantined malware. Valid values 0 to 90
     * @param value Value to set for the defenderDaysBeforeDeletingQuarantinedMalware property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDaysBeforeDeletingQuarantinedMalware(@javax.annotation.Nullable final Integer value) {
        this.defenderDaysBeforeDeletingQuarantinedMalware = value;
    }
    /**
     * Sets the defenderDetectedMalwareActions property value. Gets or sets Defenders actions to take on detected Malware per threat level.
     * @param value Value to set for the defenderDetectedMalwareActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDetectedMalwareActions(@javax.annotation.Nullable final DefenderDetectedMalwareActions value) {
        this.defenderDetectedMalwareActions = value;
    }
    /**
     * Sets the defenderDisableCatchupFullScan property value. When blocked, catch-up scans for scheduled full scans will be turned off.
     * @param value Value to set for the defenderDisableCatchupFullScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDisableCatchupFullScan(@javax.annotation.Nullable final Boolean value) {
        this.defenderDisableCatchupFullScan = value;
    }
    /**
     * Sets the defenderDisableCatchupQuickScan property value. When blocked, catch-up scans for scheduled quick scans will be turned off.
     * @param value Value to set for the defenderDisableCatchupQuickScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderDisableCatchupQuickScan(@javax.annotation.Nullable final Boolean value) {
        this.defenderDisableCatchupQuickScan = value;
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
     * Sets the defenderMonitorFileActivity property value. Possible values for monitoring file activity.
     * @param value Value to set for the defenderMonitorFileActivity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderMonitorFileActivity(@javax.annotation.Nullable final DefenderMonitorFileActivity value) {
        this.defenderMonitorFileActivity = value;
    }
    /**
     * Sets the defenderPotentiallyUnwantedAppAction property value. Gets or sets Defenders action to take on Potentially Unwanted Application (PUA), which includes software with behaviors of ad-injection, software bundling, persistent solicitation for payment or subscription, etc. Defender alerts user when PUA is being downloaded or attempts to install itself. Added in Windows 10 for desktop. Possible values are: deviceDefault, block, audit.
     * @param value Value to set for the defenderPotentiallyUnwantedAppAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderPotentiallyUnwantedAppAction(@javax.annotation.Nullable final DefenderPotentiallyUnwantedAppAction value) {
        this.defenderPotentiallyUnwantedAppAction = value;
    }
    /**
     * Sets the defenderPotentiallyUnwantedAppActionSetting property value. Possible values of Defender PUA Protection
     * @param value Value to set for the defenderPotentiallyUnwantedAppActionSetting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderPotentiallyUnwantedAppActionSetting(@javax.annotation.Nullable final DefenderProtectionType value) {
        this.defenderPotentiallyUnwantedAppActionSetting = value;
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
     * Sets the defenderPromptForSampleSubmission property value. Possible values for prompting user for samples submission.
     * @param value Value to set for the defenderPromptForSampleSubmission property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderPromptForSampleSubmission(@javax.annotation.Nullable final DefenderPromptForSampleSubmission value) {
        this.defenderPromptForSampleSubmission = value;
    }
    /**
     * Sets the defenderRequireBehaviorMonitoring property value. Indicates whether or not to require behavior monitoring.
     * @param value Value to set for the defenderRequireBehaviorMonitoring property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderRequireBehaviorMonitoring(@javax.annotation.Nullable final Boolean value) {
        this.defenderRequireBehaviorMonitoring = value;
    }
    /**
     * Sets the defenderRequireCloudProtection property value. Indicates whether or not to require cloud protection.
     * @param value Value to set for the defenderRequireCloudProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderRequireCloudProtection(@javax.annotation.Nullable final Boolean value) {
        this.defenderRequireCloudProtection = value;
    }
    /**
     * Sets the defenderRequireNetworkInspectionSystem property value. Indicates whether or not to require network inspection system.
     * @param value Value to set for the defenderRequireNetworkInspectionSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderRequireNetworkInspectionSystem(@javax.annotation.Nullable final Boolean value) {
        this.defenderRequireNetworkInspectionSystem = value;
    }
    /**
     * Sets the defenderRequireRealTimeMonitoring property value. Indicates whether or not to require real time monitoring.
     * @param value Value to set for the defenderRequireRealTimeMonitoring property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderRequireRealTimeMonitoring(@javax.annotation.Nullable final Boolean value) {
        this.defenderRequireRealTimeMonitoring = value;
    }
    /**
     * Sets the defenderScanArchiveFiles property value. Indicates whether or not to scan archive files.
     * @param value Value to set for the defenderScanArchiveFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanArchiveFiles(@javax.annotation.Nullable final Boolean value) {
        this.defenderScanArchiveFiles = value;
    }
    /**
     * Sets the defenderScanDownloads property value. Indicates whether or not to scan downloads.
     * @param value Value to set for the defenderScanDownloads property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanDownloads(@javax.annotation.Nullable final Boolean value) {
        this.defenderScanDownloads = value;
    }
    /**
     * Sets the defenderScanIncomingMail property value. Indicates whether or not to scan incoming mail messages.
     * @param value Value to set for the defenderScanIncomingMail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanIncomingMail(@javax.annotation.Nullable final Boolean value) {
        this.defenderScanIncomingMail = value;
    }
    /**
     * Sets the defenderScanMappedNetworkDrivesDuringFullScan property value. Indicates whether or not to scan mapped network drives during full scan.
     * @param value Value to set for the defenderScanMappedNetworkDrivesDuringFullScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanMappedNetworkDrivesDuringFullScan(@javax.annotation.Nullable final Boolean value) {
        this.defenderScanMappedNetworkDrivesDuringFullScan = value;
    }
    /**
     * Sets the defenderScanMaxCpu property value. Max CPU usage percentage during scan. Valid values 0 to 100
     * @param value Value to set for the defenderScanMaxCpu property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanMaxCpu(@javax.annotation.Nullable final Integer value) {
        this.defenderScanMaxCpu = value;
    }
    /**
     * Sets the defenderScanNetworkFiles property value. Indicates whether or not to scan files opened from a network folder.
     * @param value Value to set for the defenderScanNetworkFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanNetworkFiles(@javax.annotation.Nullable final Boolean value) {
        this.defenderScanNetworkFiles = value;
    }
    /**
     * Sets the defenderScanRemovableDrivesDuringFullScan property value. Indicates whether or not to scan removable drives during full scan.
     * @param value Value to set for the defenderScanRemovableDrivesDuringFullScan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanRemovableDrivesDuringFullScan(@javax.annotation.Nullable final Boolean value) {
        this.defenderScanRemovableDrivesDuringFullScan = value;
    }
    /**
     * Sets the defenderScanScriptsLoadedInInternetExplorer property value. Indicates whether or not to scan scripts loaded in Internet Explorer browser.
     * @param value Value to set for the defenderScanScriptsLoadedInInternetExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanScriptsLoadedInInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this.defenderScanScriptsLoadedInInternetExplorer = value;
    }
    /**
     * Sets the defenderScanType property value. Possible values for system scan type.
     * @param value Value to set for the defenderScanType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScanType(@javax.annotation.Nullable final DefenderScanType value) {
        this.defenderScanType = value;
    }
    /**
     * Sets the defenderScheduledQuickScanTime property value. The time to perform a daily quick scan.
     * @param value Value to set for the defenderScheduledQuickScanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScheduledQuickScanTime(@javax.annotation.Nullable final LocalTime value) {
        this.defenderScheduledQuickScanTime = value;
    }
    /**
     * Sets the defenderScheduledScanTime property value. The defender time for the system scan.
     * @param value Value to set for the defenderScheduledScanTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScheduledScanTime(@javax.annotation.Nullable final LocalTime value) {
        this.defenderScheduledScanTime = value;
    }
    /**
     * Sets the defenderScheduleScanEnableLowCpuPriority property value. When enabled, low CPU priority will be used during scheduled scans.
     * @param value Value to set for the defenderScheduleScanEnableLowCpuPriority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderScheduleScanEnableLowCpuPriority(@javax.annotation.Nullable final Boolean value) {
        this.defenderScheduleScanEnableLowCpuPriority = value;
    }
    /**
     * Sets the defenderSignatureUpdateIntervalInHours property value. The signature update interval in hours. Specify 0 not to check. Valid values 0 to 24
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
     * Sets the defenderSystemScanSchedule property value. Possible values for a weekly schedule.
     * @param value Value to set for the defenderSystemScanSchedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefenderSystemScanSchedule(@javax.annotation.Nullable final WeeklySchedule value) {
        this.defenderSystemScanSchedule = value;
    }
    /**
     * Sets the developerUnlockSetting property value. State Management Setting.
     * @param value Value to set for the developerUnlockSetting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeveloperUnlockSetting(@javax.annotation.Nullable final StateManagementSetting value) {
        this.developerUnlockSetting = value;
    }
    /**
     * Sets the deviceManagementBlockFactoryResetOnMobile property value. Indicates whether or not to Block the user from resetting their phone.
     * @param value Value to set for the deviceManagementBlockFactoryResetOnMobile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagementBlockFactoryResetOnMobile(@javax.annotation.Nullable final Boolean value) {
        this.deviceManagementBlockFactoryResetOnMobile = value;
    }
    /**
     * Sets the deviceManagementBlockManualUnenroll property value. Indicates whether or not to Block the user from doing manual un-enrollment from device management.
     * @param value Value to set for the deviceManagementBlockManualUnenroll property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagementBlockManualUnenroll(@javax.annotation.Nullable final Boolean value) {
        this.deviceManagementBlockManualUnenroll = value;
    }
    /**
     * Sets the diagnosticsDataSubmissionMode property value. Allow the device to send diagnostic and usage telemetry data, such as Watson.
     * @param value Value to set for the diagnosticsDataSubmissionMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiagnosticsDataSubmissionMode(@javax.annotation.Nullable final DiagnosticDataSubmissionMode value) {
        this.diagnosticsDataSubmissionMode = value;
    }
    /**
     * Sets the displayAppListWithGdiDPIScalingTurnedOff property value. List of legacy applications that have GDI DPI Scaling turned off.
     * @param value Value to set for the displayAppListWithGdiDPIScalingTurnedOff property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayAppListWithGdiDPIScalingTurnedOff(@javax.annotation.Nullable final java.util.List<String> value) {
        this.displayAppListWithGdiDPIScalingTurnedOff = value;
    }
    /**
     * Sets the displayAppListWithGdiDPIScalingTurnedOn property value. List of legacy applications that have GDI DPI Scaling turned on.
     * @param value Value to set for the displayAppListWithGdiDPIScalingTurnedOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayAppListWithGdiDPIScalingTurnedOn(@javax.annotation.Nullable final java.util.List<String> value) {
        this.displayAppListWithGdiDPIScalingTurnedOn = value;
    }
    /**
     * Sets the edgeAllowStartPagesModification property value. Allow users to change Start pages on Edge. Use the EdgeHomepageUrls to specify the Start pages that the user would see by default when they open Edge.
     * @param value Value to set for the edgeAllowStartPagesModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeAllowStartPagesModification(@javax.annotation.Nullable final Boolean value) {
        this.edgeAllowStartPagesModification = value;
    }
    /**
     * Sets the edgeBlockAccessToAboutFlags property value. Indicates whether or not to prevent access to about flags on Edge browser.
     * @param value Value to set for the edgeBlockAccessToAboutFlags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockAccessToAboutFlags(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockAccessToAboutFlags = value;
    }
    /**
     * Sets the edgeBlockAddressBarDropdown property value. Block the address bar dropdown functionality in Microsoft Edge. Disable this settings to minimize network connections from Microsoft Edge to Microsoft services.
     * @param value Value to set for the edgeBlockAddressBarDropdown property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockAddressBarDropdown(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockAddressBarDropdown = value;
    }
    /**
     * Sets the edgeBlockAutofill property value. Indicates whether or not to block auto fill.
     * @param value Value to set for the edgeBlockAutofill property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockAutofill(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockAutofill = value;
    }
    /**
     * Sets the edgeBlockCompatibilityList property value. Block Microsoft compatibility list in Microsoft Edge. This list from Microsoft helps Edge properly display sites with known compatibility issues.
     * @param value Value to set for the edgeBlockCompatibilityList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockCompatibilityList(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockCompatibilityList = value;
    }
    /**
     * Sets the edgeBlockDeveloperTools property value. Indicates whether or not to block developer tools in the Edge browser.
     * @param value Value to set for the edgeBlockDeveloperTools property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockDeveloperTools(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockDeveloperTools = value;
    }
    /**
     * Sets the edgeBlocked property value. Indicates whether or not to Block the user from using the Edge browser.
     * @param value Value to set for the edgeBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlocked(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlocked = value;
    }
    /**
     * Sets the edgeBlockEditFavorites property value. Indicates whether or not to Block the user from making changes to Favorites.
     * @param value Value to set for the edgeBlockEditFavorites property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockEditFavorites(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockEditFavorites = value;
    }
    /**
     * Sets the edgeBlockExtensions property value. Indicates whether or not to block extensions in the Edge browser.
     * @param value Value to set for the edgeBlockExtensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockExtensions(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockExtensions = value;
    }
    /**
     * Sets the edgeBlockFullScreenMode property value. Allow or prevent Edge from entering the full screen mode.
     * @param value Value to set for the edgeBlockFullScreenMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockFullScreenMode(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockFullScreenMode = value;
    }
    /**
     * Sets the edgeBlockInPrivateBrowsing property value. Indicates whether or not to block InPrivate browsing on corporate networks, in the Edge browser.
     * @param value Value to set for the edgeBlockInPrivateBrowsing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockInPrivateBrowsing(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockInPrivateBrowsing = value;
    }
    /**
     * Sets the edgeBlockJavaScript property value. Indicates whether or not to Block the user from using JavaScript.
     * @param value Value to set for the edgeBlockJavaScript property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockJavaScript(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockJavaScript = value;
    }
    /**
     * Sets the edgeBlockLiveTileDataCollection property value. Block the collection of information by Microsoft for live tile creation when users pin a site to Start from Microsoft Edge.
     * @param value Value to set for the edgeBlockLiveTileDataCollection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockLiveTileDataCollection(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockLiveTileDataCollection = value;
    }
    /**
     * Sets the edgeBlockPasswordManager property value. Indicates whether or not to Block password manager.
     * @param value Value to set for the edgeBlockPasswordManager property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockPasswordManager(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockPasswordManager = value;
    }
    /**
     * Sets the edgeBlockPopups property value. Indicates whether or not to block popups.
     * @param value Value to set for the edgeBlockPopups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockPopups(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockPopups = value;
    }
    /**
     * Sets the edgeBlockPrelaunch property value. Decide whether Microsoft Edge is prelaunched at Windows startup.
     * @param value Value to set for the edgeBlockPrelaunch property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockPrelaunch(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockPrelaunch = value;
    }
    /**
     * Sets the edgeBlockPrinting property value. Configure Edge to allow or block printing.
     * @param value Value to set for the edgeBlockPrinting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockPrinting(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockPrinting = value;
    }
    /**
     * Sets the edgeBlockSavingHistory property value. Configure Edge to allow browsing history to be saved or to never save browsing history.
     * @param value Value to set for the edgeBlockSavingHistory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockSavingHistory(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockSavingHistory = value;
    }
    /**
     * Sets the edgeBlockSearchEngineCustomization property value. Indicates whether or not to block the user from adding new search engine or changing the default search engine.
     * @param value Value to set for the edgeBlockSearchEngineCustomization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockSearchEngineCustomization(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockSearchEngineCustomization = value;
    }
    /**
     * Sets the edgeBlockSearchSuggestions property value. Indicates whether or not to block the user from using the search suggestions in the address bar.
     * @param value Value to set for the edgeBlockSearchSuggestions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockSearchSuggestions(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockSearchSuggestions = value;
    }
    /**
     * Sets the edgeBlockSendingDoNotTrackHeader property value. Indicates whether or not to Block the user from sending the do not track header.
     * @param value Value to set for the edgeBlockSendingDoNotTrackHeader property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockSendingDoNotTrackHeader(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockSendingDoNotTrackHeader = value;
    }
    /**
     * Sets the edgeBlockSendingIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer. Note: the name of this property is misleading; the property is obsolete, use EdgeSendIntranetTrafficToInternetExplorer instead.
     * @param value Value to set for the edgeBlockSendingIntranetTrafficToInternetExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockSendingIntranetTrafficToInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockSendingIntranetTrafficToInternetExplorer = value;
    }
    /**
     * Sets the edgeBlockSideloadingExtensions property value. Indicates whether the user can sideload extensions.
     * @param value Value to set for the edgeBlockSideloadingExtensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockSideloadingExtensions(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockSideloadingExtensions = value;
    }
    /**
     * Sets the edgeBlockTabPreloading property value. Configure whether Edge preloads the new tab page at Windows startup.
     * @param value Value to set for the edgeBlockTabPreloading property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockTabPreloading(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockTabPreloading = value;
    }
    /**
     * Sets the edgeBlockWebContentOnNewTabPage property value. Configure to load a blank page in Edge instead of the default New tab page and prevent users from changing it.
     * @param value Value to set for the edgeBlockWebContentOnNewTabPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeBlockWebContentOnNewTabPage(@javax.annotation.Nullable final Boolean value) {
        this.edgeBlockWebContentOnNewTabPage = value;
    }
    /**
     * Sets the edgeClearBrowsingDataOnExit property value. Clear browsing data on exiting Microsoft Edge.
     * @param value Value to set for the edgeClearBrowsingDataOnExit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeClearBrowsingDataOnExit(@javax.annotation.Nullable final Boolean value) {
        this.edgeClearBrowsingDataOnExit = value;
    }
    /**
     * Sets the edgeCookiePolicy property value. Possible values to specify which cookies are allowed in Microsoft Edge.
     * @param value Value to set for the edgeCookiePolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeCookiePolicy(@javax.annotation.Nullable final EdgeCookiePolicy value) {
        this.edgeCookiePolicy = value;
    }
    /**
     * Sets the edgeDisableFirstRunPage property value. Block the Microsoft web page that opens on the first use of Microsoft Edge. This policy allows enterprises, like those enrolled in zero emissions configurations, to block this page.
     * @param value Value to set for the edgeDisableFirstRunPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeDisableFirstRunPage(@javax.annotation.Nullable final Boolean value) {
        this.edgeDisableFirstRunPage = value;
    }
    /**
     * Sets the edgeEnterpriseModeSiteListLocation property value. Indicates the enterprise mode site list location. Could be a local file, local network or http location.
     * @param value Value to set for the edgeEnterpriseModeSiteListLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeEnterpriseModeSiteListLocation(@javax.annotation.Nullable final String value) {
        this.edgeEnterpriseModeSiteListLocation = value;
    }
    /**
     * Sets the edgeFavoritesBarVisibility property value. Generic visibility state.
     * @param value Value to set for the edgeFavoritesBarVisibility property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeFavoritesBarVisibility(@javax.annotation.Nullable final VisibilitySetting value) {
        this.edgeFavoritesBarVisibility = value;
    }
    /**
     * Sets the edgeFavoritesListLocation property value. The location of the favorites list to provision. Could be a local file, local network or http location.
     * @param value Value to set for the edgeFavoritesListLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeFavoritesListLocation(@javax.annotation.Nullable final String value) {
        this.edgeFavoritesListLocation = value;
    }
    /**
     * Sets the edgeFirstRunUrl property value. The first run URL for when Edge browser is opened for the first time.
     * @param value Value to set for the edgeFirstRunUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeFirstRunUrl(@javax.annotation.Nullable final String value) {
        this.edgeFirstRunUrl = value;
    }
    /**
     * Sets the edgeHomeButtonConfiguration property value. Causes the Home button to either hide, load the default Start page, load a New tab page, or a custom URL
     * @param value Value to set for the edgeHomeButtonConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeHomeButtonConfiguration(@javax.annotation.Nullable final EdgeHomeButtonConfiguration value) {
        this.edgeHomeButtonConfiguration = value;
    }
    /**
     * Sets the edgeHomeButtonConfigurationEnabled property value. Enable the Home button configuration.
     * @param value Value to set for the edgeHomeButtonConfigurationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeHomeButtonConfigurationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.edgeHomeButtonConfigurationEnabled = value;
    }
    /**
     * Sets the edgeHomepageUrls property value. The list of URLs for homepages shodwn on MDM-enrolled devices on Edge browser.
     * @param value Value to set for the edgeHomepageUrls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeHomepageUrls(@javax.annotation.Nullable final java.util.List<String> value) {
        this.edgeHomepageUrls = value;
    }
    /**
     * Sets the edgeKioskModeRestriction property value. Specify how the Microsoft Edge settings are restricted based on kiosk mode.
     * @param value Value to set for the edgeKioskModeRestriction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeKioskModeRestriction(@javax.annotation.Nullable final EdgeKioskModeRestrictionType value) {
        this.edgeKioskModeRestriction = value;
    }
    /**
     * Sets the edgeKioskResetAfterIdleTimeInMinutes property value. Specifies the time in minutes from the last user activity before Microsoft Edge kiosk resets.  Valid values are 0-1440. The default is 5. 0 indicates no reset. Valid values 0 to 1440
     * @param value Value to set for the edgeKioskResetAfterIdleTimeInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeKioskResetAfterIdleTimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this.edgeKioskResetAfterIdleTimeInMinutes = value;
    }
    /**
     * Sets the edgeNewTabPageURL property value. Specify the page opened when new tabs are created.
     * @param value Value to set for the edgeNewTabPageURL property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeNewTabPageURL(@javax.annotation.Nullable final String value) {
        this.edgeNewTabPageURL = value;
    }
    /**
     * Sets the edgeOpensWith property value. Possible values for the EdgeOpensWith setting.
     * @param value Value to set for the edgeOpensWith property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeOpensWith(@javax.annotation.Nullable final EdgeOpenOptions value) {
        this.edgeOpensWith = value;
    }
    /**
     * Sets the edgePreventCertificateErrorOverride property value. Allow or prevent users from overriding certificate errors.
     * @param value Value to set for the edgePreventCertificateErrorOverride property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgePreventCertificateErrorOverride(@javax.annotation.Nullable final Boolean value) {
        this.edgePreventCertificateErrorOverride = value;
    }
    /**
     * Sets the edgeRequiredExtensionPackageFamilyNames property value. Specify the list of package family names of browser extensions that are required and cannot be turned off by the user.
     * @param value Value to set for the edgeRequiredExtensionPackageFamilyNames property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeRequiredExtensionPackageFamilyNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this.edgeRequiredExtensionPackageFamilyNames = value;
    }
    /**
     * Sets the edgeRequireSmartScreen property value. Indicates whether or not to Require the user to use the smart screen filter.
     * @param value Value to set for the edgeRequireSmartScreen property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeRequireSmartScreen(@javax.annotation.Nullable final Boolean value) {
        this.edgeRequireSmartScreen = value;
    }
    /**
     * Sets the edgeSearchEngine property value. Allows IT admins to set a default search engine for MDM-Controlled devices. Users can override this and change their default search engine provided the AllowSearchEngineCustomization policy is not set.
     * @param value Value to set for the edgeSearchEngine property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeSearchEngine(@javax.annotation.Nullable final EdgeSearchEngineBase value) {
        this.edgeSearchEngine = value;
    }
    /**
     * Sets the edgeSendIntranetTrafficToInternetExplorer property value. Indicates whether or not to switch the intranet traffic from Edge to Internet Explorer.
     * @param value Value to set for the edgeSendIntranetTrafficToInternetExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeSendIntranetTrafficToInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this.edgeSendIntranetTrafficToInternetExplorer = value;
    }
    /**
     * Sets the edgeShowMessageWhenOpeningInternetExplorerSites property value. What message will be displayed by Edge before switching to Internet Explorer.
     * @param value Value to set for the edgeShowMessageWhenOpeningInternetExplorerSites property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeShowMessageWhenOpeningInternetExplorerSites(@javax.annotation.Nullable final InternetExplorerMessageSetting value) {
        this.edgeShowMessageWhenOpeningInternetExplorerSites = value;
    }
    /**
     * Sets the edgeSyncFavoritesWithInternetExplorer property value. Enable favorites sync between Internet Explorer and Microsoft Edge. Additions, deletions, modifications and order changes to favorites are shared between browsers.
     * @param value Value to set for the edgeSyncFavoritesWithInternetExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeSyncFavoritesWithInternetExplorer(@javax.annotation.Nullable final Boolean value) {
        this.edgeSyncFavoritesWithInternetExplorer = value;
    }
    /**
     * Sets the edgeTelemetryForMicrosoft365Analytics property value. Type of browsing data sent to Microsoft 365 analytics
     * @param value Value to set for the edgeTelemetryForMicrosoft365Analytics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdgeTelemetryForMicrosoft365Analytics(@javax.annotation.Nullable final EdgeTelemetryMode value) {
        this.edgeTelemetryForMicrosoft365Analytics = value;
    }
    /**
     * Sets the enableAutomaticRedeployment property value. Allow users with administrative rights to delete all user data and settings using CTRL + Win + R at the device lock screen so that the device can be automatically re-configured and re-enrolled into management.
     * @param value Value to set for the enableAutomaticRedeployment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableAutomaticRedeployment(@javax.annotation.Nullable final Boolean value) {
        this.enableAutomaticRedeployment = value;
    }
    /**
     * Sets the energySaverOnBatteryThresholdPercentage property value. This setting allows you to specify battery charge level at which Energy Saver is turned on. While on battery, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100
     * @param value Value to set for the energySaverOnBatteryThresholdPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnergySaverOnBatteryThresholdPercentage(@javax.annotation.Nullable final Integer value) {
        this.energySaverOnBatteryThresholdPercentage = value;
    }
    /**
     * Sets the energySaverPluggedInThresholdPercentage property value. This setting allows you to specify battery charge level at which Energy Saver is turned on. While plugged in, Energy Saver is automatically turned on at (and below) the specified battery charge level. Valid input range (0-100). Valid values 0 to 100
     * @param value Value to set for the energySaverPluggedInThresholdPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnergySaverPluggedInThresholdPercentage(@javax.annotation.Nullable final Integer value) {
        this.energySaverPluggedInThresholdPercentage = value;
    }
    /**
     * Sets the enterpriseCloudPrintDiscoveryEndPoint property value. Endpoint for discovering cloud printers.
     * @param value Value to set for the enterpriseCloudPrintDiscoveryEndPoint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintDiscoveryEndPoint(@javax.annotation.Nullable final String value) {
        this.enterpriseCloudPrintDiscoveryEndPoint = value;
    }
    /**
     * Sets the enterpriseCloudPrintDiscoveryMaxLimit property value. Maximum number of printers that should be queried from a discovery endpoint. This is a mobile only setting. Valid values 1 to 65535
     * @param value Value to set for the enterpriseCloudPrintDiscoveryMaxLimit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintDiscoveryMaxLimit(@javax.annotation.Nullable final Integer value) {
        this.enterpriseCloudPrintDiscoveryMaxLimit = value;
    }
    /**
     * Sets the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property value. OAuth resource URI for printer discovery service as configured in Azure portal.
     * @param value Value to set for the enterpriseCloudPrintMopriaDiscoveryResourceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintMopriaDiscoveryResourceIdentifier(@javax.annotation.Nullable final String value) {
        this.enterpriseCloudPrintMopriaDiscoveryResourceIdentifier = value;
    }
    /**
     * Sets the enterpriseCloudPrintOAuthAuthority property value. Authentication endpoint for acquiring OAuth tokens.
     * @param value Value to set for the enterpriseCloudPrintOAuthAuthority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintOAuthAuthority(@javax.annotation.Nullable final String value) {
        this.enterpriseCloudPrintOAuthAuthority = value;
    }
    /**
     * Sets the enterpriseCloudPrintOAuthClientIdentifier property value. GUID of a client application authorized to retrieve OAuth tokens from the OAuth Authority.
     * @param value Value to set for the enterpriseCloudPrintOAuthClientIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintOAuthClientIdentifier(@javax.annotation.Nullable final String value) {
        this.enterpriseCloudPrintOAuthClientIdentifier = value;
    }
    /**
     * Sets the enterpriseCloudPrintResourceIdentifier property value. OAuth resource URI for print service as configured in the Azure portal.
     * @param value Value to set for the enterpriseCloudPrintResourceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnterpriseCloudPrintResourceIdentifier(@javax.annotation.Nullable final String value) {
        this.enterpriseCloudPrintResourceIdentifier = value;
    }
    /**
     * Sets the experienceBlockDeviceDiscovery property value. Indicates whether or not to enable device discovery UX.
     * @param value Value to set for the experienceBlockDeviceDiscovery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExperienceBlockDeviceDiscovery(@javax.annotation.Nullable final Boolean value) {
        this.experienceBlockDeviceDiscovery = value;
    }
    /**
     * Sets the experienceBlockErrorDialogWhenNoSIM property value. Indicates whether or not to allow the error dialog from displaying if no SIM card is detected.
     * @param value Value to set for the experienceBlockErrorDialogWhenNoSIM property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExperienceBlockErrorDialogWhenNoSIM(@javax.annotation.Nullable final Boolean value) {
        this.experienceBlockErrorDialogWhenNoSIM = value;
    }
    /**
     * Sets the experienceBlockTaskSwitcher property value. Indicates whether or not to enable task switching on the device.
     * @param value Value to set for the experienceBlockTaskSwitcher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExperienceBlockTaskSwitcher(@javax.annotation.Nullable final Boolean value) {
        this.experienceBlockTaskSwitcher = value;
    }
    /**
     * Sets the experienceDoNotSyncBrowserSettings property value. Allow(Not Configured) or prevent(Block) the syncing of Microsoft Edge Browser settings. Option to prevent syncing across devices, but allow user override.
     * @param value Value to set for the experienceDoNotSyncBrowserSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExperienceDoNotSyncBrowserSettings(@javax.annotation.Nullable final BrowserSyncSetting value) {
        this.experienceDoNotSyncBrowserSettings = value;
    }
    /**
     * Sets the findMyFiles property value. Possible values of a property
     * @param value Value to set for the findMyFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFindMyFiles(@javax.annotation.Nullable final Enablement value) {
        this.findMyFiles = value;
    }
    /**
     * Sets the gameDvrBlocked property value. Indicates whether or not to block DVR and broadcasting.
     * @param value Value to set for the gameDvrBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGameDvrBlocked(@javax.annotation.Nullable final Boolean value) {
        this.gameDvrBlocked = value;
    }
    /**
     * Sets the inkWorkspaceAccess property value. Values for the InkWorkspaceAccess setting.
     * @param value Value to set for the inkWorkspaceAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInkWorkspaceAccess(@javax.annotation.Nullable final InkAccessSetting value) {
        this.inkWorkspaceAccess = value;
    }
    /**
     * Sets the inkWorkspaceAccessState property value. State Management Setting.
     * @param value Value to set for the inkWorkspaceAccessState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInkWorkspaceAccessState(@javax.annotation.Nullable final StateManagementSetting value) {
        this.inkWorkspaceAccessState = value;
    }
    /**
     * Sets the inkWorkspaceBlockSuggestedApps property value. Specify whether to show recommended app suggestions in the ink workspace.
     * @param value Value to set for the inkWorkspaceBlockSuggestedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInkWorkspaceBlockSuggestedApps(@javax.annotation.Nullable final Boolean value) {
        this.inkWorkspaceBlockSuggestedApps = value;
    }
    /**
     * Sets the internetSharingBlocked property value. Indicates whether or not to Block the user from using internet sharing.
     * @param value Value to set for the internetSharingBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternetSharingBlocked(@javax.annotation.Nullable final Boolean value) {
        this.internetSharingBlocked = value;
    }
    /**
     * Sets the locationServicesBlocked property value. Indicates whether or not to Block the user from location services.
     * @param value Value to set for the locationServicesBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocationServicesBlocked(@javax.annotation.Nullable final Boolean value) {
        this.locationServicesBlocked = value;
    }
    /**
     * Sets the lockScreenActivateAppsWithVoice property value. Possible values of a property
     * @param value Value to set for the lockScreenActivateAppsWithVoice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenActivateAppsWithVoice(@javax.annotation.Nullable final Enablement value) {
        this.lockScreenActivateAppsWithVoice = value;
    }
    /**
     * Sets the lockScreenAllowTimeoutConfiguration property value. Specify whether to show a user-configurable setting to control the screen timeout while on the lock screen of Windows 10 Mobile devices. If this policy is set to Allow, the value set by lockScreenTimeoutInSeconds is ignored.
     * @param value Value to set for the lockScreenAllowTimeoutConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenAllowTimeoutConfiguration(@javax.annotation.Nullable final Boolean value) {
        this.lockScreenAllowTimeoutConfiguration = value;
    }
    /**
     * Sets the lockScreenBlockActionCenterNotifications property value. Indicates whether or not to block action center notifications over lock screen.
     * @param value Value to set for the lockScreenBlockActionCenterNotifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenBlockActionCenterNotifications(@javax.annotation.Nullable final Boolean value) {
        this.lockScreenBlockActionCenterNotifications = value;
    }
    /**
     * Sets the lockScreenBlockCortana property value. Indicates whether or not the user can interact with Cortana using speech while the system is locked.
     * @param value Value to set for the lockScreenBlockCortana property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenBlockCortana(@javax.annotation.Nullable final Boolean value) {
        this.lockScreenBlockCortana = value;
    }
    /**
     * Sets the lockScreenBlockToastNotifications property value. Indicates whether to allow toast notifications above the device lock screen.
     * @param value Value to set for the lockScreenBlockToastNotifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenBlockToastNotifications(@javax.annotation.Nullable final Boolean value) {
        this.lockScreenBlockToastNotifications = value;
    }
    /**
     * Sets the lockScreenTimeoutInSeconds property value. Set the duration (in seconds) from the screen locking to the screen turning off for Windows 10 Mobile devices. Supported values are 11-1800. Valid values 11 to 1800
     * @param value Value to set for the lockScreenTimeoutInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this.lockScreenTimeoutInSeconds = value;
    }
    /**
     * Sets the logonBlockFastUserSwitching property value. Disables the ability to quickly switch between users that are logged on simultaneously without logging off.
     * @param value Value to set for the logonBlockFastUserSwitching property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogonBlockFastUserSwitching(@javax.annotation.Nullable final Boolean value) {
        this.logonBlockFastUserSwitching = value;
    }
    /**
     * Sets the messagingBlockMMS property value. Indicates whether or not to block the MMS send/receive functionality on the device.
     * @param value Value to set for the messagingBlockMMS property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessagingBlockMMS(@javax.annotation.Nullable final Boolean value) {
        this.messagingBlockMMS = value;
    }
    /**
     * Sets the messagingBlockRichCommunicationServices property value. Indicates whether or not to block the RCS send/receive functionality on the device.
     * @param value Value to set for the messagingBlockRichCommunicationServices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessagingBlockRichCommunicationServices(@javax.annotation.Nullable final Boolean value) {
        this.messagingBlockRichCommunicationServices = value;
    }
    /**
     * Sets the messagingBlockSync property value. Indicates whether or not to block text message back up and restore and Messaging Everywhere.
     * @param value Value to set for the messagingBlockSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessagingBlockSync(@javax.annotation.Nullable final Boolean value) {
        this.messagingBlockSync = value;
    }
    /**
     * Sets the microsoftAccountBlocked property value. Indicates whether or not to Block a Microsoft account.
     * @param value Value to set for the microsoftAccountBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftAccountBlocked(@javax.annotation.Nullable final Boolean value) {
        this.microsoftAccountBlocked = value;
    }
    /**
     * Sets the microsoftAccountBlockSettingsSync property value. Indicates whether or not to Block Microsoft account settings sync.
     * @param value Value to set for the microsoftAccountBlockSettingsSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftAccountBlockSettingsSync(@javax.annotation.Nullable final Boolean value) {
        this.microsoftAccountBlockSettingsSync = value;
    }
    /**
     * Sets the microsoftAccountSignInAssistantSettings property value. Values for the SignInAssistantSettings.
     * @param value Value to set for the microsoftAccountSignInAssistantSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftAccountSignInAssistantSettings(@javax.annotation.Nullable final SignInAssistantOptions value) {
        this.microsoftAccountSignInAssistantSettings = value;
    }
    /**
     * Sets the networkProxyApplySettingsDeviceWide property value. If set, proxy settings will be applied to all processes and accounts in the device. Otherwise, it will be applied to the user account thats enrolled into MDM.
     * @param value Value to set for the networkProxyApplySettingsDeviceWide property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkProxyApplySettingsDeviceWide(@javax.annotation.Nullable final Boolean value) {
        this.networkProxyApplySettingsDeviceWide = value;
    }
    /**
     * Sets the networkProxyAutomaticConfigurationUrl property value. Address to the proxy auto-config (PAC) script you want to use.
     * @param value Value to set for the networkProxyAutomaticConfigurationUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkProxyAutomaticConfigurationUrl(@javax.annotation.Nullable final String value) {
        this.networkProxyAutomaticConfigurationUrl = value;
    }
    /**
     * Sets the networkProxyDisableAutoDetect property value. Disable automatic detection of settings. If enabled, the system will try to find the path to a proxy auto-config (PAC) script.
     * @param value Value to set for the networkProxyDisableAutoDetect property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkProxyDisableAutoDetect(@javax.annotation.Nullable final Boolean value) {
        this.networkProxyDisableAutoDetect = value;
    }
    /**
     * Sets the networkProxyServer property value. Specifies manual proxy server settings.
     * @param value Value to set for the networkProxyServer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkProxyServer(@javax.annotation.Nullable final Windows10NetworkProxyServer value) {
        this.networkProxyServer = value;
    }
    /**
     * Sets the nfcBlocked property value. Indicates whether or not to Block the user from using near field communication.
     * @param value Value to set for the nfcBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNfcBlocked(@javax.annotation.Nullable final Boolean value) {
        this.nfcBlocked = value;
    }
    /**
     * Sets the oneDriveDisableFileSync property value. Gets or sets a value allowing IT admins to prevent apps and features from working with files on OneDrive.
     * @param value Value to set for the oneDriveDisableFileSync property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOneDriveDisableFileSync(@javax.annotation.Nullable final Boolean value) {
        this.oneDriveDisableFileSync = value;
    }
    /**
     * Sets the passwordBlockSimple property value. Specify whether PINs or passwords such as '1111' or '1234' are allowed. For Windows 10 desktops, it also controls the use of picture passwords.
     * @param value Value to set for the passwordBlockSimple property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockSimple(@javax.annotation.Nullable final Boolean value) {
        this.passwordBlockSimple = value;
    }
    /**
     * Sets the passwordExpirationDays property value. The password expiration in days. Valid values 0 to 730
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this.passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumAgeInDays property value. This security setting determines the period of time (in days) that a password must be used before the user can change it. Valid values 0 to 998
     * @param value Value to set for the passwordMinimumAgeInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumAgeInDays(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumAgeInDays = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumCharacterSetCount(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. The minimum password length. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. The minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this.passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent reuse of. Valid values 0 to 50
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this.passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Indicates whether or not to require the user to have a password.
     * @param value Value to set for the passwordRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequired(@javax.annotation.Nullable final Boolean value) {
        this.passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequiredType(@javax.annotation.Nullable final RequiredPasswordType value) {
        this.passwordRequiredType = value;
    }
    /**
     * Sets the passwordRequireWhenResumeFromIdleState property value. Indicates whether or not to require a password upon resuming from an idle state.
     * @param value Value to set for the passwordRequireWhenResumeFromIdleState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequireWhenResumeFromIdleState(@javax.annotation.Nullable final Boolean value) {
        this.passwordRequireWhenResumeFromIdleState = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. The number of sign in failures before factory reset. Valid values 0 to 999
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this.passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the personalizationDesktopImageUrl property value. A http or https Url to a jpg, jpeg or png image that needs to be downloaded and used as the Desktop Image or a file Url to a local image on the file system that needs to used as the Desktop Image.
     * @param value Value to set for the personalizationDesktopImageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalizationDesktopImageUrl(@javax.annotation.Nullable final String value) {
        this.personalizationDesktopImageUrl = value;
    }
    /**
     * Sets the personalizationLockScreenImageUrl property value. A http or https Url to a jpg, jpeg or png image that neeeds to be downloaded and used as the Lock Screen Image or a file Url to a local image on the file system that needs to be used as the Lock Screen Image.
     * @param value Value to set for the personalizationLockScreenImageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalizationLockScreenImageUrl(@javax.annotation.Nullable final String value) {
        this.personalizationLockScreenImageUrl = value;
    }
    /**
     * Sets the powerButtonActionOnBattery property value. Power action types
     * @param value Value to set for the powerButtonActionOnBattery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerButtonActionOnBattery(@javax.annotation.Nullable final PowerActionType value) {
        this.powerButtonActionOnBattery = value;
    }
    /**
     * Sets the powerButtonActionPluggedIn property value. Power action types
     * @param value Value to set for the powerButtonActionPluggedIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerButtonActionPluggedIn(@javax.annotation.Nullable final PowerActionType value) {
        this.powerButtonActionPluggedIn = value;
    }
    /**
     * Sets the powerHybridSleepOnBattery property value. Possible values of a property
     * @param value Value to set for the powerHybridSleepOnBattery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerHybridSleepOnBattery(@javax.annotation.Nullable final Enablement value) {
        this.powerHybridSleepOnBattery = value;
    }
    /**
     * Sets the powerHybridSleepPluggedIn property value. Possible values of a property
     * @param value Value to set for the powerHybridSleepPluggedIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerHybridSleepPluggedIn(@javax.annotation.Nullable final Enablement value) {
        this.powerHybridSleepPluggedIn = value;
    }
    /**
     * Sets the powerLidCloseActionOnBattery property value. Power action types
     * @param value Value to set for the powerLidCloseActionOnBattery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerLidCloseActionOnBattery(@javax.annotation.Nullable final PowerActionType value) {
        this.powerLidCloseActionOnBattery = value;
    }
    /**
     * Sets the powerLidCloseActionPluggedIn property value. Power action types
     * @param value Value to set for the powerLidCloseActionPluggedIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerLidCloseActionPluggedIn(@javax.annotation.Nullable final PowerActionType value) {
        this.powerLidCloseActionPluggedIn = value;
    }
    /**
     * Sets the powerSleepButtonActionOnBattery property value. Power action types
     * @param value Value to set for the powerSleepButtonActionOnBattery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerSleepButtonActionOnBattery(@javax.annotation.Nullable final PowerActionType value) {
        this.powerSleepButtonActionOnBattery = value;
    }
    /**
     * Sets the powerSleepButtonActionPluggedIn property value. Power action types
     * @param value Value to set for the powerSleepButtonActionPluggedIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerSleepButtonActionPluggedIn(@javax.annotation.Nullable final PowerActionType value) {
        this.powerSleepButtonActionPluggedIn = value;
    }
    /**
     * Sets the printerBlockAddition property value. Prevent user installation of additional printers from printers settings.
     * @param value Value to set for the printerBlockAddition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrinterBlockAddition(@javax.annotation.Nullable final Boolean value) {
        this.printerBlockAddition = value;
    }
    /**
     * Sets the printerDefaultName property value. Name (network host name) of an installed printer.
     * @param value Value to set for the printerDefaultName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrinterDefaultName(@javax.annotation.Nullable final String value) {
        this.printerDefaultName = value;
    }
    /**
     * Sets the printerNames property value. Automatically provision printers based on their names (network host names).
     * @param value Value to set for the printerNames property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrinterNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this.printerNames = value;
    }
    /**
     * Sets the privacyAccessControls property value. Indicates a list of applications with their access control levels over privacy data categories, and/or the default access levels per category. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the privacyAccessControls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyAccessControls(@javax.annotation.Nullable final java.util.List<WindowsPrivacyDataAccessControlItem> value) {
        this.privacyAccessControls = value;
    }
    /**
     * Sets the privacyAdvertisingId property value. State Management Setting.
     * @param value Value to set for the privacyAdvertisingId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyAdvertisingId(@javax.annotation.Nullable final StateManagementSetting value) {
        this.privacyAdvertisingId = value;
    }
    /**
     * Sets the privacyAutoAcceptPairingAndConsentPrompts property value. Indicates whether or not to allow the automatic acceptance of the pairing and privacy user consent dialog when launching apps.
     * @param value Value to set for the privacyAutoAcceptPairingAndConsentPrompts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyAutoAcceptPairingAndConsentPrompts(@javax.annotation.Nullable final Boolean value) {
        this.privacyAutoAcceptPairingAndConsentPrompts = value;
    }
    /**
     * Sets the privacyBlockActivityFeed property value. Blocks the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @param value Value to set for the privacyBlockActivityFeed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyBlockActivityFeed(@javax.annotation.Nullable final Boolean value) {
        this.privacyBlockActivityFeed = value;
    }
    /**
     * Sets the privacyBlockInputPersonalization property value. Indicates whether or not to block the usage of cloud based speech services for Cortana, Dictation, or Store applications.
     * @param value Value to set for the privacyBlockInputPersonalization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyBlockInputPersonalization(@javax.annotation.Nullable final Boolean value) {
        this.privacyBlockInputPersonalization = value;
    }
    /**
     * Sets the privacyBlockPublishUserActivities property value. Blocks the shared experiences/discovery of recently used resources in task switcher etc.
     * @param value Value to set for the privacyBlockPublishUserActivities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyBlockPublishUserActivities(@javax.annotation.Nullable final Boolean value) {
        this.privacyBlockPublishUserActivities = value;
    }
    /**
     * Sets the privacyDisableLaunchExperience property value. This policy prevents the privacy experience from launching during user logon for new and upgraded users.
     * @param value Value to set for the privacyDisableLaunchExperience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyDisableLaunchExperience(@javax.annotation.Nullable final Boolean value) {
        this.privacyDisableLaunchExperience = value;
    }
    /**
     * Sets the resetProtectionModeBlocked property value. Indicates whether or not to Block the user from reset protection mode.
     * @param value Value to set for the resetProtectionModeBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResetProtectionModeBlocked(@javax.annotation.Nullable final Boolean value) {
        this.resetProtectionModeBlocked = value;
    }
    /**
     * Sets the safeSearchFilter property value. Specifies what level of safe search (filtering adult content) is required
     * @param value Value to set for the safeSearchFilter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSafeSearchFilter(@javax.annotation.Nullable final SafeSearchFilterType value) {
        this.safeSearchFilter = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to Block the user from taking Screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this.screenCaptureBlocked = value;
    }
    /**
     * Sets the searchBlockDiacritics property value. Specifies if search can use diacritics.
     * @param value Value to set for the searchBlockDiacritics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchBlockDiacritics(@javax.annotation.Nullable final Boolean value) {
        this.searchBlockDiacritics = value;
    }
    /**
     * Sets the searchBlockWebResults property value. Indicates whether or not to block the web search.
     * @param value Value to set for the searchBlockWebResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchBlockWebResults(@javax.annotation.Nullable final Boolean value) {
        this.searchBlockWebResults = value;
    }
    /**
     * Sets the searchDisableAutoLanguageDetection property value. Specifies whether to use automatic language detection when indexing content and properties.
     * @param value Value to set for the searchDisableAutoLanguageDetection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchDisableAutoLanguageDetection(@javax.annotation.Nullable final Boolean value) {
        this.searchDisableAutoLanguageDetection = value;
    }
    /**
     * Sets the searchDisableIndexerBackoff property value. Indicates whether or not to disable the search indexer backoff feature.
     * @param value Value to set for the searchDisableIndexerBackoff property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchDisableIndexerBackoff(@javax.annotation.Nullable final Boolean value) {
        this.searchDisableIndexerBackoff = value;
    }
    /**
     * Sets the searchDisableIndexingEncryptedItems property value. Indicates whether or not to block indexing of WIP-protected items to prevent them from appearing in search results for Cortana or Explorer.
     * @param value Value to set for the searchDisableIndexingEncryptedItems property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchDisableIndexingEncryptedItems(@javax.annotation.Nullable final Boolean value) {
        this.searchDisableIndexingEncryptedItems = value;
    }
    /**
     * Sets the searchDisableIndexingRemovableDrive property value. Indicates whether or not to allow users to add locations on removable drives to libraries and to be indexed.
     * @param value Value to set for the searchDisableIndexingRemovableDrive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchDisableIndexingRemovableDrive(@javax.annotation.Nullable final Boolean value) {
        this.searchDisableIndexingRemovableDrive = value;
    }
    /**
     * Sets the searchDisableLocation property value. Specifies if search can use location information.
     * @param value Value to set for the searchDisableLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchDisableLocation(@javax.annotation.Nullable final Boolean value) {
        this.searchDisableLocation = value;
    }
    /**
     * Sets the searchDisableUseLocation property value. Specifies if search can use location information.
     * @param value Value to set for the searchDisableUseLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchDisableUseLocation(@javax.annotation.Nullable final Boolean value) {
        this.searchDisableUseLocation = value;
    }
    /**
     * Sets the searchEnableAutomaticIndexSizeManangement property value. Specifies minimum amount of hard drive space on the same drive as the index location before indexing stops.
     * @param value Value to set for the searchEnableAutomaticIndexSizeManangement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchEnableAutomaticIndexSizeManangement(@javax.annotation.Nullable final Boolean value) {
        this.searchEnableAutomaticIndexSizeManangement = value;
    }
    /**
     * Sets the searchEnableRemoteQueries property value. Indicates whether or not to block remote queries of this computers index.
     * @param value Value to set for the searchEnableRemoteQueries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearchEnableRemoteQueries(@javax.annotation.Nullable final Boolean value) {
        this.searchEnableRemoteQueries = value;
    }
    /**
     * Sets the securityBlockAzureADJoinedDevicesAutoEncryption property value. Specify whether to allow automatic device encryption during OOBE when the device is Azure AD joined (desktop only).
     * @param value Value to set for the securityBlockAzureADJoinedDevicesAutoEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityBlockAzureADJoinedDevicesAutoEncryption(@javax.annotation.Nullable final Boolean value) {
        this.securityBlockAzureADJoinedDevicesAutoEncryption = value;
    }
    /**
     * Sets the settingsBlockAccountsPage property value. Indicates whether or not to block access to Accounts in Settings app.
     * @param value Value to set for the settingsBlockAccountsPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockAccountsPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockAccountsPage = value;
    }
    /**
     * Sets the settingsBlockAddProvisioningPackage property value. Indicates whether or not to block the user from installing provisioning packages.
     * @param value Value to set for the settingsBlockAddProvisioningPackage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockAddProvisioningPackage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockAddProvisioningPackage = value;
    }
    /**
     * Sets the settingsBlockAppsPage property value. Indicates whether or not to block access to Apps in Settings app.
     * @param value Value to set for the settingsBlockAppsPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockAppsPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockAppsPage = value;
    }
    /**
     * Sets the settingsBlockChangeLanguage property value. Indicates whether or not to block the user from changing the language settings.
     * @param value Value to set for the settingsBlockChangeLanguage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockChangeLanguage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockChangeLanguage = value;
    }
    /**
     * Sets the settingsBlockChangePowerSleep property value. Indicates whether or not to block the user from changing power and sleep settings.
     * @param value Value to set for the settingsBlockChangePowerSleep property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockChangePowerSleep(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockChangePowerSleep = value;
    }
    /**
     * Sets the settingsBlockChangeRegion property value. Indicates whether or not to block the user from changing the region settings.
     * @param value Value to set for the settingsBlockChangeRegion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockChangeRegion(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockChangeRegion = value;
    }
    /**
     * Sets the settingsBlockChangeSystemTime property value. Indicates whether or not to block the user from changing date and time settings.
     * @param value Value to set for the settingsBlockChangeSystemTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockChangeSystemTime(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockChangeSystemTime = value;
    }
    /**
     * Sets the settingsBlockDevicesPage property value. Indicates whether or not to block access to Devices in Settings app.
     * @param value Value to set for the settingsBlockDevicesPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockDevicesPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockDevicesPage = value;
    }
    /**
     * Sets the settingsBlockEaseOfAccessPage property value. Indicates whether or not to block access to Ease of Access in Settings app.
     * @param value Value to set for the settingsBlockEaseOfAccessPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockEaseOfAccessPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockEaseOfAccessPage = value;
    }
    /**
     * Sets the settingsBlockEditDeviceName property value. Indicates whether or not to block the user from editing the device name.
     * @param value Value to set for the settingsBlockEditDeviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockEditDeviceName(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockEditDeviceName = value;
    }
    /**
     * Sets the settingsBlockGamingPage property value. Indicates whether or not to block access to Gaming in Settings app.
     * @param value Value to set for the settingsBlockGamingPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockGamingPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockGamingPage = value;
    }
    /**
     * Sets the settingsBlockNetworkInternetPage property value. Indicates whether or not to block access to Network & Internet in Settings app.
     * @param value Value to set for the settingsBlockNetworkInternetPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockNetworkInternetPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockNetworkInternetPage = value;
    }
    /**
     * Sets the settingsBlockPersonalizationPage property value. Indicates whether or not to block access to Personalization in Settings app.
     * @param value Value to set for the settingsBlockPersonalizationPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockPersonalizationPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockPersonalizationPage = value;
    }
    /**
     * Sets the settingsBlockPrivacyPage property value. Indicates whether or not to block access to Privacy in Settings app.
     * @param value Value to set for the settingsBlockPrivacyPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockPrivacyPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockPrivacyPage = value;
    }
    /**
     * Sets the settingsBlockRemoveProvisioningPackage property value. Indicates whether or not to block the runtime configuration agent from removing provisioning packages.
     * @param value Value to set for the settingsBlockRemoveProvisioningPackage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockRemoveProvisioningPackage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockRemoveProvisioningPackage = value;
    }
    /**
     * Sets the settingsBlockSettingsApp property value. Indicates whether or not to block access to Settings app.
     * @param value Value to set for the settingsBlockSettingsApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockSettingsApp(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockSettingsApp = value;
    }
    /**
     * Sets the settingsBlockSystemPage property value. Indicates whether or not to block access to System in Settings app.
     * @param value Value to set for the settingsBlockSystemPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockSystemPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockSystemPage = value;
    }
    /**
     * Sets the settingsBlockTimeLanguagePage property value. Indicates whether or not to block access to Time & Language in Settings app.
     * @param value Value to set for the settingsBlockTimeLanguagePage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockTimeLanguagePage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockTimeLanguagePage = value;
    }
    /**
     * Sets the settingsBlockUpdateSecurityPage property value. Indicates whether or not to block access to Update & Security in Settings app.
     * @param value Value to set for the settingsBlockUpdateSecurityPage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingsBlockUpdateSecurityPage(@javax.annotation.Nullable final Boolean value) {
        this.settingsBlockUpdateSecurityPage = value;
    }
    /**
     * Sets the sharedUserAppDataAllowed property value. Indicates whether or not to block multiple users of the same app to share data.
     * @param value Value to set for the sharedUserAppDataAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedUserAppDataAllowed(@javax.annotation.Nullable final Boolean value) {
        this.sharedUserAppDataAllowed = value;
    }
    /**
     * Sets the smartScreenAppInstallControl property value. App Install control Setting
     * @param value Value to set for the smartScreenAppInstallControl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmartScreenAppInstallControl(@javax.annotation.Nullable final AppInstallControlType value) {
        this.smartScreenAppInstallControl = value;
    }
    /**
     * Sets the smartScreenBlockPromptOverride property value. Indicates whether or not users can override SmartScreen Filter warnings about potentially malicious websites.
     * @param value Value to set for the smartScreenBlockPromptOverride property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmartScreenBlockPromptOverride(@javax.annotation.Nullable final Boolean value) {
        this.smartScreenBlockPromptOverride = value;
    }
    /**
     * Sets the smartScreenBlockPromptOverrideForFiles property value. Indicates whether or not users can override the SmartScreen Filter warnings about downloading unverified files
     * @param value Value to set for the smartScreenBlockPromptOverrideForFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmartScreenBlockPromptOverrideForFiles(@javax.annotation.Nullable final Boolean value) {
        this.smartScreenBlockPromptOverrideForFiles = value;
    }
    /**
     * Sets the smartScreenEnableAppInstallControl property value. This property will be deprecated in July 2019 and will be replaced by property SmartScreenAppInstallControl. Allows IT Admins to control whether users are allowed to install apps from places other than the Store.
     * @param value Value to set for the smartScreenEnableAppInstallControl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmartScreenEnableAppInstallControl(@javax.annotation.Nullable final Boolean value) {
        this.smartScreenEnableAppInstallControl = value;
    }
    /**
     * Sets the startBlockUnpinningAppsFromTaskbar property value. Indicates whether or not to block the user from unpinning apps from taskbar.
     * @param value Value to set for the startBlockUnpinningAppsFromTaskbar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartBlockUnpinningAppsFromTaskbar(@javax.annotation.Nullable final Boolean value) {
        this.startBlockUnpinningAppsFromTaskbar = value;
    }
    /**
     * Sets the startMenuAppListVisibility property value. Type of start menu app list visibility.
     * @param value Value to set for the startMenuAppListVisibility property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuAppListVisibility(@javax.annotation.Nullable final WindowsStartMenuAppListVisibilityType value) {
        this.startMenuAppListVisibility = value;
    }
    /**
     * Sets the startMenuHideChangeAccountSettings property value. Enabling this policy hides the change account setting from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideChangeAccountSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideChangeAccountSettings(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideChangeAccountSettings = value;
    }
    /**
     * Sets the startMenuHideFrequentlyUsedApps property value. Enabling this policy hides the most used apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideFrequentlyUsedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideFrequentlyUsedApps(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideFrequentlyUsedApps = value;
    }
    /**
     * Sets the startMenuHideHibernate property value. Enabling this policy hides hibernate from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideHibernate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideHibernate(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideHibernate = value;
    }
    /**
     * Sets the startMenuHideLock property value. Enabling this policy hides lock from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideLock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideLock(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideLock = value;
    }
    /**
     * Sets the startMenuHidePowerButton property value. Enabling this policy hides the power button from appearing in the start menu.
     * @param value Value to set for the startMenuHidePowerButton property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHidePowerButton(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHidePowerButton = value;
    }
    /**
     * Sets the startMenuHideRecentJumpLists property value. Enabling this policy hides recent jump lists from appearing on the start menu/taskbar and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideRecentJumpLists property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideRecentJumpLists(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideRecentJumpLists = value;
    }
    /**
     * Sets the startMenuHideRecentlyAddedApps property value. Enabling this policy hides recently added apps from appearing on the start menu and disables the corresponding toggle in the Settings app.
     * @param value Value to set for the startMenuHideRecentlyAddedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideRecentlyAddedApps(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideRecentlyAddedApps = value;
    }
    /**
     * Sets the startMenuHideRestartOptions property value. Enabling this policy hides 'Restart/Update and Restart' from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideRestartOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideRestartOptions(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideRestartOptions = value;
    }
    /**
     * Sets the startMenuHideShutDown property value. Enabling this policy hides shut down/update and shut down from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideShutDown property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideShutDown(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideShutDown = value;
    }
    /**
     * Sets the startMenuHideSignOut property value. Enabling this policy hides sign out from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideSignOut property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideSignOut(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideSignOut = value;
    }
    /**
     * Sets the startMenuHideSleep property value. Enabling this policy hides sleep from appearing in the power button in the start menu.
     * @param value Value to set for the startMenuHideSleep property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideSleep(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideSleep = value;
    }
    /**
     * Sets the startMenuHideSwitchAccount property value. Enabling this policy hides switch account from appearing in the user tile in the start menu.
     * @param value Value to set for the startMenuHideSwitchAccount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideSwitchAccount(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideSwitchAccount = value;
    }
    /**
     * Sets the startMenuHideUserTile property value. Enabling this policy hides the user tile from appearing in the start menu.
     * @param value Value to set for the startMenuHideUserTile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuHideUserTile(@javax.annotation.Nullable final Boolean value) {
        this.startMenuHideUserTile = value;
    }
    /**
     * Sets the startMenuLayoutEdgeAssetsXml property value. This policy setting allows you to import Edge assets to be used with startMenuLayoutXml policy. Start layout can contain secondary tile from Edge app which looks for Edge local asset file. Edge local asset would not exist and cause Edge secondary tile to appear empty in this case. This policy only gets applied when startMenuLayoutXml policy is modified. The value should be a UTF-8 Base64 encoded byte array.
     * @param value Value to set for the startMenuLayoutEdgeAssetsXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuLayoutEdgeAssetsXml(@javax.annotation.Nullable final byte[] value) {
        this.startMenuLayoutEdgeAssetsXml = value;
    }
    /**
     * Sets the startMenuLayoutXml property value. Allows admins to override the default Start menu layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in a UTF8 encoded byte array format.
     * @param value Value to set for the startMenuLayoutXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuLayoutXml(@javax.annotation.Nullable final byte[] value) {
        this.startMenuLayoutXml = value;
    }
    /**
     * Sets the startMenuMode property value. Type of display modes for the start menu.
     * @param value Value to set for the startMenuMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuMode(@javax.annotation.Nullable final WindowsStartMenuModeType value) {
        this.startMenuMode = value;
    }
    /**
     * Sets the startMenuPinnedFolderDocuments property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderDocuments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderDocuments(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderDocuments = value;
    }
    /**
     * Sets the startMenuPinnedFolderDownloads property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderDownloads property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderDownloads(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderDownloads = value;
    }
    /**
     * Sets the startMenuPinnedFolderFileExplorer property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderFileExplorer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderFileExplorer(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderFileExplorer = value;
    }
    /**
     * Sets the startMenuPinnedFolderHomeGroup property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderHomeGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderHomeGroup(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderHomeGroup = value;
    }
    /**
     * Sets the startMenuPinnedFolderMusic property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderMusic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderMusic(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderMusic = value;
    }
    /**
     * Sets the startMenuPinnedFolderNetwork property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderNetwork property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderNetwork(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderNetwork = value;
    }
    /**
     * Sets the startMenuPinnedFolderPersonalFolder property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderPersonalFolder property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderPersonalFolder(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderPersonalFolder = value;
    }
    /**
     * Sets the startMenuPinnedFolderPictures property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderPictures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderPictures(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderPictures = value;
    }
    /**
     * Sets the startMenuPinnedFolderSettings property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderSettings(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderSettings = value;
    }
    /**
     * Sets the startMenuPinnedFolderVideos property value. Generic visibility state.
     * @param value Value to set for the startMenuPinnedFolderVideos property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartMenuPinnedFolderVideos(@javax.annotation.Nullable final VisibilitySetting value) {
        this.startMenuPinnedFolderVideos = value;
    }
    /**
     * Sets the storageBlockRemovableStorage property value. Indicates whether or not to Block the user from using removable storage.
     * @param value Value to set for the storageBlockRemovableStorage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageBlockRemovableStorage(@javax.annotation.Nullable final Boolean value) {
        this.storageBlockRemovableStorage = value;
    }
    /**
     * Sets the storageRequireMobileDeviceEncryption property value. Indicating whether or not to require encryption on a mobile device.
     * @param value Value to set for the storageRequireMobileDeviceEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageRequireMobileDeviceEncryption(@javax.annotation.Nullable final Boolean value) {
        this.storageRequireMobileDeviceEncryption = value;
    }
    /**
     * Sets the storageRestrictAppDataToSystemVolume property value. Indicates whether application data is restricted to the system drive.
     * @param value Value to set for the storageRestrictAppDataToSystemVolume property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageRestrictAppDataToSystemVolume(@javax.annotation.Nullable final Boolean value) {
        this.storageRestrictAppDataToSystemVolume = value;
    }
    /**
     * Sets the storageRestrictAppInstallToSystemVolume property value. Indicates whether the installation of applications is restricted to the system drive.
     * @param value Value to set for the storageRestrictAppInstallToSystemVolume property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageRestrictAppInstallToSystemVolume(@javax.annotation.Nullable final Boolean value) {
        this.storageRestrictAppInstallToSystemVolume = value;
    }
    /**
     * Sets the systemTelemetryProxyServer property value. Gets or sets the fully qualified domain name (FQDN) or IP address of a proxy server to forward Connected User Experiences and Telemetry requests.
     * @param value Value to set for the systemTelemetryProxyServer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemTelemetryProxyServer(@javax.annotation.Nullable final String value) {
        this.systemTelemetryProxyServer = value;
    }
    /**
     * Sets the taskManagerBlockEndTask property value. Specify whether non-administrators can use Task Manager to end tasks.
     * @param value Value to set for the taskManagerBlockEndTask property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaskManagerBlockEndTask(@javax.annotation.Nullable final Boolean value) {
        this.taskManagerBlockEndTask = value;
    }
    /**
     * Sets the tenantLockdownRequireNetworkDuringOutOfBoxExperience property value. Whether the device is required to connect to the network.
     * @param value Value to set for the tenantLockdownRequireNetworkDuringOutOfBoxExperience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantLockdownRequireNetworkDuringOutOfBoxExperience(@javax.annotation.Nullable final Boolean value) {
        this.tenantLockdownRequireNetworkDuringOutOfBoxExperience = value;
    }
    /**
     * Sets the uninstallBuiltInApps property value. Indicates whether or not to uninstall a fixed list of built-in Windows apps.
     * @param value Value to set for the uninstallBuiltInApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUninstallBuiltInApps(@javax.annotation.Nullable final Boolean value) {
        this.uninstallBuiltInApps = value;
    }
    /**
     * Sets the usbBlocked property value. Indicates whether or not to Block the user from USB connection.
     * @param value Value to set for the usbBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsbBlocked(@javax.annotation.Nullable final Boolean value) {
        this.usbBlocked = value;
    }
    /**
     * Sets the voiceRecordingBlocked property value. Indicates whether or not to Block the user from voice recording.
     * @param value Value to set for the voiceRecordingBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVoiceRecordingBlocked(@javax.annotation.Nullable final Boolean value) {
        this.voiceRecordingBlocked = value;
    }
    /**
     * Sets the webRtcBlockLocalhostIpAddress property value. Indicates whether or not user's localhost IP address is displayed while making phone calls using the WebRTC
     * @param value Value to set for the webRtcBlockLocalhostIpAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWebRtcBlockLocalhostIpAddress(@javax.annotation.Nullable final Boolean value) {
        this.webRtcBlockLocalhostIpAddress = value;
    }
    /**
     * Sets the wiFiBlockAutomaticConnectHotspots property value. Indicating whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
     * @param value Value to set for the wiFiBlockAutomaticConnectHotspots property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiBlockAutomaticConnectHotspots(@javax.annotation.Nullable final Boolean value) {
        this.wiFiBlockAutomaticConnectHotspots = value;
    }
    /**
     * Sets the wiFiBlocked property value. Indicates whether or not to Block the user from using Wi-Fi.
     * @param value Value to set for the wiFiBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiBlocked(@javax.annotation.Nullable final Boolean value) {
        this.wiFiBlocked = value;
    }
    /**
     * Sets the wiFiBlockManualConfiguration property value. Indicates whether or not to Block the user from using Wi-Fi manual configuration.
     * @param value Value to set for the wiFiBlockManualConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiBlockManualConfiguration(@javax.annotation.Nullable final Boolean value) {
        this.wiFiBlockManualConfiguration = value;
    }
    /**
     * Sets the wiFiScanInterval property value. Specify how often devices scan for Wi-Fi networks. Supported values are 1-500, where 100 = default, and 500 = low frequency. Valid values 1 to 500
     * @param value Value to set for the wiFiScanInterval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiScanInterval(@javax.annotation.Nullable final Integer value) {
        this.wiFiScanInterval = value;
    }
    /**
     * Sets the windows10AppsForceUpdateSchedule property value. Windows 10 force update schedule for Apps.
     * @param value Value to set for the windows10AppsForceUpdateSchedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindows10AppsForceUpdateSchedule(@javax.annotation.Nullable final Windows10AppsForceUpdateSchedule value) {
        this.windows10AppsForceUpdateSchedule = value;
    }
    /**
     * Sets the windowsSpotlightBlockConsumerSpecificFeatures property value. Allows IT admins to block experiences that are typically for consumers only, such as Start suggestions, Membership notifications, Post-OOBE app install and redirect tiles.
     * @param value Value to set for the windowsSpotlightBlockConsumerSpecificFeatures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockConsumerSpecificFeatures(@javax.annotation.Nullable final Boolean value) {
        this.windowsSpotlightBlockConsumerSpecificFeatures = value;
    }
    /**
     * Sets the windowsSpotlightBlocked property value. Allows IT admins to turn off all Windows Spotlight features
     * @param value Value to set for the windowsSpotlightBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlocked(@javax.annotation.Nullable final Boolean value) {
        this.windowsSpotlightBlocked = value;
    }
    /**
     * Sets the windowsSpotlightBlockOnActionCenter property value. Block suggestions from Microsoft that show after each OS clean install, upgrade or in an on-going basis to introduce users to what is new or changed
     * @param value Value to set for the windowsSpotlightBlockOnActionCenter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockOnActionCenter(@javax.annotation.Nullable final Boolean value) {
        this.windowsSpotlightBlockOnActionCenter = value;
    }
    /**
     * Sets the windowsSpotlightBlockTailoredExperiences property value. Block personalized content in Windows spotlight based on users device usage.
     * @param value Value to set for the windowsSpotlightBlockTailoredExperiences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockTailoredExperiences(@javax.annotation.Nullable final Boolean value) {
        this.windowsSpotlightBlockTailoredExperiences = value;
    }
    /**
     * Sets the windowsSpotlightBlockThirdPartyNotifications property value. Block third party content delivered via Windows Spotlight
     * @param value Value to set for the windowsSpotlightBlockThirdPartyNotifications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockThirdPartyNotifications(@javax.annotation.Nullable final Boolean value) {
        this.windowsSpotlightBlockThirdPartyNotifications = value;
    }
    /**
     * Sets the windowsSpotlightBlockWelcomeExperience property value. Block Windows Spotlight Windows welcome experience
     * @param value Value to set for the windowsSpotlightBlockWelcomeExperience property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockWelcomeExperience(@javax.annotation.Nullable final Boolean value) {
        this.windowsSpotlightBlockWelcomeExperience = value;
    }
    /**
     * Sets the windowsSpotlightBlockWindowsTips property value. Allows IT admins to turn off the popup of Windows Tips.
     * @param value Value to set for the windowsSpotlightBlockWindowsTips property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightBlockWindowsTips(@javax.annotation.Nullable final Boolean value) {
        this.windowsSpotlightBlockWindowsTips = value;
    }
    /**
     * Sets the windowsSpotlightConfigureOnLockScreen property value. Allows IT admind to set a predefined default search engine for MDM-Controlled devices
     * @param value Value to set for the windowsSpotlightConfigureOnLockScreen property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSpotlightConfigureOnLockScreen(@javax.annotation.Nullable final WindowsSpotlightEnablementSettings value) {
        this.windowsSpotlightConfigureOnLockScreen = value;
    }
    /**
     * Sets the windowsStoreBlockAutoUpdate property value. Indicates whether or not to block automatic update of apps from Windows Store.
     * @param value Value to set for the windowsStoreBlockAutoUpdate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsStoreBlockAutoUpdate(@javax.annotation.Nullable final Boolean value) {
        this.windowsStoreBlockAutoUpdate = value;
    }
    /**
     * Sets the windowsStoreBlocked property value. Indicates whether or not to Block the user from using the Windows store.
     * @param value Value to set for the windowsStoreBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsStoreBlocked(@javax.annotation.Nullable final Boolean value) {
        this.windowsStoreBlocked = value;
    }
    /**
     * Sets the windowsStoreEnablePrivateStoreOnly property value. Indicates whether or not to enable Private Store Only.
     * @param value Value to set for the windowsStoreEnablePrivateStoreOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsStoreEnablePrivateStoreOnly(@javax.annotation.Nullable final Boolean value) {
        this.windowsStoreEnablePrivateStoreOnly = value;
    }
    /**
     * Sets the wirelessDisplayBlockProjectionToThisDevice property value. Indicates whether or not to allow other devices from discovering this PC for projection.
     * @param value Value to set for the wirelessDisplayBlockProjectionToThisDevice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWirelessDisplayBlockProjectionToThisDevice(@javax.annotation.Nullable final Boolean value) {
        this.wirelessDisplayBlockProjectionToThisDevice = value;
    }
    /**
     * Sets the wirelessDisplayBlockUserInputFromReceiver property value. Indicates whether or not to allow user input from wireless display receiver.
     * @param value Value to set for the wirelessDisplayBlockUserInputFromReceiver property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWirelessDisplayBlockUserInputFromReceiver(@javax.annotation.Nullable final Boolean value) {
        this.wirelessDisplayBlockUserInputFromReceiver = value;
    }
    /**
     * Sets the wirelessDisplayRequirePinForPairing property value. Indicates whether or not to require a PIN for new devices to initiate pairing.
     * @param value Value to set for the wirelessDisplayRequirePinForPairing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWirelessDisplayRequirePinForPairing(@javax.annotation.Nullable final Boolean value) {
        this.wirelessDisplayRequirePinForPairing = value;
    }
}
