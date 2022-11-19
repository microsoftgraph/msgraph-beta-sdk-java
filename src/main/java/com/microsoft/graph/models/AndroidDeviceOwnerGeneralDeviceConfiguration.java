package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceOwnerGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not adding or removing accounts is disabled. */
    private Boolean _accountsBlockModification;
    /** Indicates whether or not the user is allowed to enable to unknown sources setting. */
    private Boolean _appsAllowInstallFromUnknownSources;
    /** Indicates the value of the app auto update policy. Possible values are: notConfigured, userChoice, never, wiFiOnly, always. */
    private AndroidDeviceOwnerAppAutoUpdatePolicyType _appsAutoUpdatePolicy;
    /** Indicates the permission policy for requests for runtime permissions if one is not defined for the app specifically. Possible values are: deviceDefault, prompt, autoGrant, autoDeny. */
    private AndroidDeviceOwnerDefaultAppPermissionPolicyType _appsDefaultPermissionPolicy;
    /** Whether or not to recommend all apps skip any first-time-use hints they may have added. */
    private Boolean _appsRecommendSkippingFirstUseHints;
    /** A list of managed apps that will have their data cleared during a global sign-out in AAD shared device mode. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> _azureAdSharedDeviceDataClearApps;
    /** Indicates whether or not to block a user from configuring bluetooth. */
    private Boolean _bluetoothBlockConfiguration;
    /** Indicates whether or not to block a user from sharing contacts via bluetooth. */
    private Boolean _bluetoothBlockContactSharing;
    /** Indicates whether or not to disable the use of the camera. */
    private Boolean _cameraBlocked;
    /** Indicates whether or not to block Wi-Fi tethering. */
    private Boolean _cellularBlockWiFiTethering;
    /** Indicates whether or not to block users from any certificate credential configuration. */
    private Boolean _certificateCredentialConfigurationDisabled;
    /** Indicates whether or not text copied from one profile (personal or work) can be pasted in the other. */
    private Boolean _crossProfilePoliciesAllowCopyPaste;
    /** Indicates whether data from one profile (personal or work) can be shared with apps in the other profile. Possible values are: notConfigured, crossProfileDataSharingBlocked, dataSharingFromWorkToPersonalBlocked, crossProfileDataSharingAllowed, unkownFutureValue. */
    private AndroidDeviceOwnerCrossProfileDataSharing _crossProfilePoliciesAllowDataSharing;
    /** Indicates whether or not contacts stored in work profile are shown in personal profile contact searches/incoming calls. */
    private Boolean _crossProfilePoliciesShowWorkContactsInPersonalProfile;
    /** Indicates whether or not to block a user from data roaming. */
    private Boolean _dataRoamingBlocked;
    /** Indicates whether or not to block the user from manually changing the date or time on the device */
    private Boolean _dateTimeConfigurationBlocked;
    /** Represents the customized detailed help text provided to users when they attempt to modify managed settings on their device. */
    private AndroidDeviceOwnerUserFacingMessage _detailedHelpText;
    /** Represents the customized lock screen message provided to users when they attempt to modify managed settings on their device. */
    private AndroidDeviceOwnerUserFacingMessage _deviceOwnerLockScreenMessage;
    /** Android Device Owner Enrollment Profile types. */
    private AndroidDeviceOwnerEnrollmentProfileType _enrollmentProfile;
    /** Indicates whether or not the factory reset option in settings is disabled. */
    private Boolean _factoryResetBlocked;
    /** List of Google account emails that will be required to authenticate after a device is factory reset before it can be set up. */
    private java.util.List<String> _factoryResetDeviceAdministratorEmails;
    /** Proxy is set up directly with host, port and excluded hosts. */
    private AndroidDeviceOwnerGlobalProxy _globalProxy;
    /** Indicates whether or not google accounts will be blocked. */
    private Boolean _googleAccountsBlocked;
    /** Indicateswhether a user can access the device's Settings app while in Kiosk Mode. */
    private Boolean _kioskCustomizationDeviceSettingsBlocked;
    /** Whether the power menu is shown when a user long presses the Power button of a device in Kiosk Mode. */
    private Boolean _kioskCustomizationPowerButtonActionsBlocked;
    /** Indicates whether system info and notifications are disabled in Kiosk Mode. Possible values are: notConfigured, notificationsAndSystemInfoEnabled, systemInfoOnly. */
    private AndroidDeviceOwnerKioskCustomizationStatusBar _kioskCustomizationStatusBar;
    /** Indicates whether system error dialogs for crashed or unresponsive apps are shown in Kiosk Mode. */
    private Boolean _kioskCustomizationSystemErrorWarnings;
    /** Indicates which navigation features are enabled in Kiosk Mode. Possible values are: notConfigured, navigationEnabled, homeButtonOnly. */
    private AndroidDeviceOwnerKioskCustomizationSystemNavigation _kioskCustomizationSystemNavigation;
    /** Whether or not to enable app ordering in Kiosk Mode. */
    private Boolean _kioskModeAppOrderEnabled;
    /** The ordering of items on Kiosk Mode Managed Home Screen. This collection can contain a maximum of 500 elements. */
    private java.util.List<AndroidDeviceOwnerKioskModeAppPositionItem> _kioskModeAppPositions;
    /** A list of managed apps that will be shown when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> _kioskModeApps;
    /** Whether or not to alphabetize applications within a folder in Kiosk Mode. */
    private Boolean _kioskModeAppsInFolderOrderedByName;
    /** Whether or not to allow a user to configure Bluetooth settings in Kiosk Mode. */
    private Boolean _kioskModeBluetoothConfigurationEnabled;
    /** Whether or not to allow a user to easy access to the debug menu in Kiosk Mode. */
    private Boolean _kioskModeDebugMenuEasyAccessEnabled;
    /** Exit code to allow a user to escape from Kiosk Mode when the device is in Kiosk Mode. */
    private String _kioskModeExitCode;
    /** Whether or not to allow a user to use the flashlight in Kiosk Mode. */
    private Boolean _kioskModeFlashlightConfigurationEnabled;
    /** Folder icon configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, darkSquare, darkCircle, lightSquare, lightCircle. */
    private AndroidDeviceOwnerKioskModeFolderIcon _kioskModeFolderIcon;
    /** Number of rows for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999 */
    private Integer _kioskModeGridHeight;
    /** Number of columns for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999 */
    private Integer _kioskModeGridWidth;
    /** Icon size configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, smallest, small, regular, large, largest. */
    private AndroidDeviceOwnerKioskModeIconSize _kioskModeIconSize;
    /** Whether or not to lock home screen to the end user in Kiosk Mode. */
    private Boolean _kioskModeLockHomeScreen;
    /** A list of managed folders for a device in Kiosk Mode. This collection can contain a maximum of 500 elements. */
    private java.util.List<AndroidDeviceOwnerKioskModeManagedFolder> _kioskModeManagedFolders;
    /** Whether or not to automatically sign-out of MHS and Shared device mode applications after inactive for Managed Home Screen. */
    private Boolean _kioskModeManagedHomeScreenAutoSignout;
    /** Number of seconds to give user notice before automatically signing them out for Managed Home Screen. Valid values 0 to 9999999 */
    private Integer _kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds;
    /** Number of seconds device is inactive before automatically signing user out for Managed Home Screen. Valid values 0 to 9999999 */
    private Integer _kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds;
    /** Complexity of PIN for sign-in session for Managed Home Screen. Possible values are: notConfigured, simple, complex. */
    private KioskModeManagedHomeScreenPinComplexity _kioskModeManagedHomeScreenPinComplexity;
    /** Whether or not require user to set a PIN for sign-in session for Managed Home Screen. */
    private Boolean _kioskModeManagedHomeScreenPinRequired;
    /** Whether or not required user to enter session PIN if screensaver has appeared for Managed Home Screen. */
    private Boolean _kioskModeManagedHomeScreenPinRequiredToResume;
    /** Custom URL background for sign-in screen for Managed Home Screen. */
    private String _kioskModeManagedHomeScreenSignInBackground;
    /** Custom URL branding logo for sign-in screen and session pin page for Managed Home Screen. */
    private String _kioskModeManagedHomeScreenSignInBrandingLogo;
    /** Whether or not show sign-in screen for Managed Home Screen. */
    private Boolean _kioskModeManagedHomeScreenSignInEnabled;
    /** Whether or not to display the Managed Settings entry point on the managed home screen in Kiosk Mode. */
    private Boolean _kioskModeManagedSettingsEntryDisabled;
    /** Whether or not to allow a user to change the media volume in Kiosk Mode. */
    private Boolean _kioskModeMediaVolumeConfigurationEnabled;
    /** Screen orientation configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, portrait, landscape, autoRotate. */
    private AndroidDeviceOwnerKioskModeScreenOrientation _kioskModeScreenOrientation;
    /** Whether or not to enable screen saver mode or not in Kiosk Mode. */
    private Boolean _kioskModeScreenSaverConfigurationEnabled;
    /** Whether or not the device screen should show the screen saver if audio/video is playing in Kiosk Mode. */
    private Boolean _kioskModeScreenSaverDetectMediaDisabled;
    /** The number of seconds that the device will display the screen saver for in Kiosk Mode. Valid values 0 to 9999999 */
    private Integer _kioskModeScreenSaverDisplayTimeInSeconds;
    /** URL for an image that will be the device's screen saver in Kiosk Mode. */
    private String _kioskModeScreenSaverImageUrl;
    /** The number of seconds the device needs to be inactive for before the screen saver is shown in Kiosk Mode. Valid values 1 to 9999999 */
    private Integer _kioskModeScreenSaverStartDelayInSeconds;
    /** Whether or not to display application notification badges in Kiosk Mode. */
    private Boolean _kioskModeShowAppNotificationBadge;
    /** Whether or not to allow a user to access basic device information. */
    private Boolean _kioskModeShowDeviceInfo;
    /** Whether or not to use single app kiosk mode or multi-app kiosk mode. Possible values are: notConfigured, singleAppMode, multiAppMode. */
    private KioskModeType _kioskModeUseManagedHomeScreenApp;
    /** Whether or not to display a virtual home button when the device is in Kiosk Mode. */
    private Boolean _kioskModeVirtualHomeButtonEnabled;
    /** Indicates whether the virtual home button is a swipe up home button or a floating home button. Possible values are: notConfigured, swipeUp, floating. */
    private AndroidDeviceOwnerVirtualHomeButtonType _kioskModeVirtualHomeButtonType;
    /** URL to a publicly accessible image to use for the wallpaper when the device is in Kiosk Mode. */
    private String _kioskModeWallpaperUrl;
    /** The restricted set of WIFI SSIDs available for the user to configure in Kiosk Mode. This collection can contain a maximum of 500 elements. */
    private java.util.List<String> _kioskModeWifiAllowedSsids;
    /** Whether or not to allow a user to configure Wi-Fi settings in Kiosk Mode. */
    private Boolean _kioskModeWiFiConfigurationEnabled;
    /** Indicates whether or not to block unmuting the microphone on the device. */
    private Boolean _microphoneForceMute;
    /** Indicates whether or not to you want configure Microsoft Launcher. */
    private Boolean _microsoftLauncherConfigurationEnabled;
    /** Indicates whether or not the user can modify the wallpaper to personalize their device. */
    private Boolean _microsoftLauncherCustomWallpaperAllowUserModification;
    /** Indicates whether or not to configure the wallpaper on the targeted devices. */
    private Boolean _microsoftLauncherCustomWallpaperEnabled;
    /** Indicates the URL for the image file to use as the wallpaper on the targeted devices. */
    private String _microsoftLauncherCustomWallpaperImageUrl;
    /** Indicates whether or not the user can modify the device dock configuration on the device. */
    private Boolean _microsoftLauncherDockPresenceAllowUserModification;
    /** Indicates whether or not you want to configure the device dock. Possible values are: notConfigured, show, hide, disabled. */
    private MicrosoftLauncherDockPresence _microsoftLauncherDockPresenceConfiguration;
    /** Indicates whether or not the user can modify the launcher feed on the device. */
    private Boolean _microsoftLauncherFeedAllowUserModification;
    /** Indicates whether or not you want to enable the launcher feed on the device. */
    private Boolean _microsoftLauncherFeedEnabled;
    /** Indicates the search bar placement configuration on the device. Possible values are: notConfigured, top, bottom, hide. */
    private MicrosoftLauncherSearchBarPlacement _microsoftLauncherSearchBarPlacementConfiguration;
    /** Indicates whether or not the device will allow connecting to a temporary network connection at boot time. */
    private Boolean _networkEscapeHatchAllowed;
    /** Indicates whether or not to block NFC outgoing beam. */
    private Boolean _nfcBlockOutgoingBeam;
    /** Indicates whether or not the keyguard is disabled. */
    private Boolean _passwordBlockKeyguard;
    /** List of device keyguard features to block. This collection can contain a maximum of 11 elements. */
    private java.util.List<AndroidKeyguardFeature> _passwordBlockKeyguardFeatures;
    /** Indicates the amount of time that a password can be set for before it expires and a new password will be required. Valid values 1 to 365 */
    private Integer _passwordExpirationDays;
    /** Indicates the minimum length of the password required on the device. Valid values 4 to 16 */
    private Integer _passwordMinimumLength;
    /** Indicates the minimum number of letter characters required for device password. Valid values 1 to 16 */
    private Integer _passwordMinimumLetterCharacters;
    /** Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16 */
    private Integer _passwordMinimumLowerCaseCharacters;
    /** Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16 */
    private Integer _passwordMinimumNonLetterCharacters;
    /** Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16 */
    private Integer _passwordMinimumNumericCharacters;
    /** Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16 */
    private Integer _passwordMinimumSymbolCharacters;
    /** Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16 */
    private Integer _passwordMinimumUpperCaseCharacters;
    /** Minutes of inactivity before the screen times out. */
    private Integer _passwordMinutesOfInactivityBeforeScreenTimeout;
    /** Indicates the length of password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24 */
    private Integer _passwordPreviousPasswordCountToBlock;
    /** Indicates the minimum password quality required on the device. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword. */
    private AndroidDeviceOwnerRequiredPasswordType _passwordRequiredType;
    /** Indicates the timeout period after which a device must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue. */
    private AndroidDeviceOwnerRequiredPasswordUnlock _passwordRequireUnlock;
    /** Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11 */
    private Integer _passwordSignInFailureCountBeforeFactoryReset;
    /** Indicates whether the user can install apps from unknown sources on the personal profile. */
    private Boolean _personalProfileAppsAllowInstallFromUnknownSources;
    /** Indicates whether to disable the use of the camera on the personal profile. */
    private Boolean _personalProfileCameraBlocked;
    /** Policy applied to applications in the personal profile. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> _personalProfilePersonalApplications;
    /** Used together with PersonalProfilePersonalApplications to control how apps in the personal profile are allowed or blocked. Possible values are: notConfigured, blockedApps, allowedApps. */
    private PersonalProfilePersonalPlayStoreMode _personalProfilePlayStoreMode;
    /** Indicates whether to disable the capability to take screenshots on the personal profile. */
    private Boolean _personalProfileScreenCaptureBlocked;
    /** Indicates the Play Store mode of the device. Possible values are: notConfigured, allowList, blockList. */
    private AndroidDeviceOwnerPlayStoreMode _playStoreMode;
    /** Indicates whether or not to disable the capability to take screenshots. */
    private Boolean _screenCaptureBlocked;
    /** Represents the security common criteria mode enabled provided to users when they attempt to modify managed settings on their device. */
    private Boolean _securityCommonCriteriaModeEnabled;
    /** Indicates whether or not the user is allowed to access developer settings like developer options and safe boot on the device. */
    private Boolean _securityDeveloperSettingsEnabled;
    /** Indicates whether or not verify apps is required. */
    private Boolean _securityRequireVerifyApps;
    /** Represents the customized short help text provided to users when they attempt to modify managed settings on their device. */
    private AndroidDeviceOwnerUserFacingMessage _shortHelpText;
    /** Indicates whether or the status bar is disabled, including notifications, quick settings and other screen overlays. */
    private Boolean _statusBarBlocked;
    /** List of modes in which the device's display will stay powered-on. This collection can contain a maximum of 4 elements. */
    private java.util.List<AndroidDeviceOwnerBatteryPluggedMode> _stayOnModes;
    /** Indicates whether or not to allow USB mass storage. */
    private Boolean _storageAllowUsb;
    /** Indicates whether or not to block external media. */
    private Boolean _storageBlockExternalMedia;
    /** Indicates whether or not to block USB file transfer. */
    private Boolean _storageBlockUsbFileTransfer;
    /** Indicates the annually repeating time periods during which system updates are postponed. This collection can contain a maximum of 500 elements. */
    private java.util.List<AndroidDeviceOwnerSystemUpdateFreezePeriod> _systemUpdateFreezePeriods;
    /** The type of system update configuration. Possible values are: deviceDefault, postpone, windowed, automatic. */
    private AndroidDeviceOwnerSystemUpdateInstallType _systemUpdateInstallType;
    /** Indicates the number of minutes after midnight that the system update window ends. Valid values 0 to 1440 */
    private Integer _systemUpdateWindowEndMinutesAfterMidnight;
    /** Indicates the number of minutes after midnight that the system update window starts. Valid values 0 to 1440 */
    private Integer _systemUpdateWindowStartMinutesAfterMidnight;
    /** Whether or not to block Android system prompt windows, like toasts, phone activities, and system alerts. */
    private Boolean _systemWindowsBlocked;
    /** Indicates whether or not adding users and profiles is disabled. */
    private Boolean _usersBlockAdd;
    /** Indicates whether or not to disable removing other users from the device. */
    private Boolean _usersBlockRemove;
    /** Indicates whether or not adjusting the master volume is disabled. */
    private Boolean _volumeBlockAdjustment;
    /** If an always on VPN package name is specified, whether or not to lock network traffic when that VPN is disconnected. */
    private Boolean _vpnAlwaysOnLockdownMode;
    /** Android app package name for app that will handle an always-on VPN connection. */
    private String _vpnAlwaysOnPackageIdentifier;
    /** Indicates whether or not to block the user from editing the wifi connection settings. */
    private Boolean _wifiBlockEditConfigurations;
    /** Indicates whether or not to block the user from editing just the networks defined by the policy. */
    private Boolean _wifiBlockEditPolicyDefinedConfigurations;
    /** Indicates the number of days that a work profile password can be set before it expires and a new password will be required. Valid values 1 to 365 */
    private Integer _workProfilePasswordExpirationDays;
    /** Indicates the minimum length of the work profile password. Valid values 4 to 16 */
    private Integer _workProfilePasswordMinimumLength;
    /** Indicates the minimum number of letter characters required for the work profile password. Valid values 1 to 16 */
    private Integer _workProfilePasswordMinimumLetterCharacters;
    /** Indicates the minimum number of lower-case characters required for the work profile password. Valid values 1 to 16 */
    private Integer _workProfilePasswordMinimumLowerCaseCharacters;
    /** Indicates the minimum number of non-letter characters required for the work profile password. Valid values 1 to 16 */
    private Integer _workProfilePasswordMinimumNonLetterCharacters;
    /** Indicates the minimum number of numeric characters required for the work profile password. Valid values 1 to 16 */
    private Integer _workProfilePasswordMinimumNumericCharacters;
    /** Indicates the minimum number of symbol characters required for the work profile password. Valid values 1 to 16 */
    private Integer _workProfilePasswordMinimumSymbolCharacters;
    /** Indicates the minimum number of upper-case letter characters required for the work profile password. Valid values 1 to 16 */
    private Integer _workProfilePasswordMinimumUpperCaseCharacters;
    /** Indicates the length of the work profile password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24 */
    private Integer _workProfilePasswordPreviousPasswordCountToBlock;
    /** Indicates the minimum password quality required on the work profile password. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword. */
    private AndroidDeviceOwnerRequiredPasswordType _workProfilePasswordRequiredType;
    /** Indicates the timeout period after which a work profile must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue. */
    private AndroidDeviceOwnerRequiredPasswordUnlock _workProfilePasswordRequireUnlock;
    /** Indicates the number of times a user can enter an incorrect work profile password before the device is wiped. Valid values 4 to 11 */
    private Integer _workProfilePasswordSignInFailureCountBeforeFactoryReset;
    /**
     * Instantiates a new AndroidDeviceOwnerGeneralDeviceConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerGeneralDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerGeneralDeviceConfiguration
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerGeneralDeviceConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerGeneralDeviceConfiguration();
    }
    /**
     * Gets the accountsBlockModification property value. Indicates whether or not adding or removing accounts is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccountsBlockModification() {
        return this._accountsBlockModification;
    }
    /**
     * Gets the appsAllowInstallFromUnknownSources property value. Indicates whether or not the user is allowed to enable to unknown sources setting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsAllowInstallFromUnknownSources() {
        return this._appsAllowInstallFromUnknownSources;
    }
    /**
     * Gets the appsAutoUpdatePolicy property value. Indicates the value of the app auto update policy. Possible values are: notConfigured, userChoice, never, wiFiOnly, always.
     * @return a androidDeviceOwnerAppAutoUpdatePolicyType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerAppAutoUpdatePolicyType getAppsAutoUpdatePolicy() {
        return this._appsAutoUpdatePolicy;
    }
    /**
     * Gets the appsDefaultPermissionPolicy property value. Indicates the permission policy for requests for runtime permissions if one is not defined for the app specifically. Possible values are: deviceDefault, prompt, autoGrant, autoDeny.
     * @return a androidDeviceOwnerDefaultAppPermissionPolicyType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerDefaultAppPermissionPolicyType getAppsDefaultPermissionPolicy() {
        return this._appsDefaultPermissionPolicy;
    }
    /**
     * Gets the appsRecommendSkippingFirstUseHints property value. Whether or not to recommend all apps skip any first-time-use hints they may have added.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsRecommendSkippingFirstUseHints() {
        return this._appsRecommendSkippingFirstUseHints;
    }
    /**
     * Gets the azureAdSharedDeviceDataClearApps property value. A list of managed apps that will have their data cleared during a global sign-out in AAD shared device mode. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getAzureAdSharedDeviceDataClearApps() {
        return this._azureAdSharedDeviceDataClearApps;
    }
    /**
     * Gets the bluetoothBlockConfiguration property value. Indicates whether or not to block a user from configuring bluetooth.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockConfiguration() {
        return this._bluetoothBlockConfiguration;
    }
    /**
     * Gets the bluetoothBlockContactSharing property value. Indicates whether or not to block a user from sharing contacts via bluetooth.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockContactSharing() {
        return this._bluetoothBlockContactSharing;
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to disable the use of the camera.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this._cameraBlocked;
    }
    /**
     * Gets the cellularBlockWiFiTethering property value. Indicates whether or not to block Wi-Fi tethering.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockWiFiTethering() {
        return this._cellularBlockWiFiTethering;
    }
    /**
     * Gets the certificateCredentialConfigurationDisabled property value. Indicates whether or not to block users from any certificate credential configuration.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCertificateCredentialConfigurationDisabled() {
        return this._certificateCredentialConfigurationDisabled;
    }
    /**
     * Gets the crossProfilePoliciesAllowCopyPaste property value. Indicates whether or not text copied from one profile (personal or work) can be pasted in the other.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCrossProfilePoliciesAllowCopyPaste() {
        return this._crossProfilePoliciesAllowCopyPaste;
    }
    /**
     * Gets the crossProfilePoliciesAllowDataSharing property value. Indicates whether data from one profile (personal or work) can be shared with apps in the other profile. Possible values are: notConfigured, crossProfileDataSharingBlocked, dataSharingFromWorkToPersonalBlocked, crossProfileDataSharingAllowed, unkownFutureValue.
     * @return a androidDeviceOwnerCrossProfileDataSharing
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerCrossProfileDataSharing getCrossProfilePoliciesAllowDataSharing() {
        return this._crossProfilePoliciesAllowDataSharing;
    }
    /**
     * Gets the crossProfilePoliciesShowWorkContactsInPersonalProfile property value. Indicates whether or not contacts stored in work profile are shown in personal profile contact searches/incoming calls.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCrossProfilePoliciesShowWorkContactsInPersonalProfile() {
        return this._crossProfilePoliciesShowWorkContactsInPersonalProfile;
    }
    /**
     * Gets the dataRoamingBlocked property value. Indicates whether or not to block a user from data roaming.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDataRoamingBlocked() {
        return this._dataRoamingBlocked;
    }
    /**
     * Gets the dateTimeConfigurationBlocked property value. Indicates whether or not to block the user from manually changing the date or time on the device
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDateTimeConfigurationBlocked() {
        return this._dateTimeConfigurationBlocked;
    }
    /**
     * Gets the detailedHelpText property value. Represents the customized detailed help text provided to users when they attempt to modify managed settings on their device.
     * @return a androidDeviceOwnerUserFacingMessage
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerUserFacingMessage getDetailedHelpText() {
        return this._detailedHelpText;
    }
    /**
     * Gets the deviceOwnerLockScreenMessage property value. Represents the customized lock screen message provided to users when they attempt to modify managed settings on their device.
     * @return a androidDeviceOwnerUserFacingMessage
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerUserFacingMessage getDeviceOwnerLockScreenMessage() {
        return this._deviceOwnerLockScreenMessage;
    }
    /**
     * Gets the enrollmentProfile property value. Android Device Owner Enrollment Profile types.
     * @return a androidDeviceOwnerEnrollmentProfileType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerEnrollmentProfileType getEnrollmentProfile() {
        return this._enrollmentProfile;
    }
    /**
     * Gets the factoryResetBlocked property value. Indicates whether or not the factory reset option in settings is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFactoryResetBlocked() {
        return this._factoryResetBlocked;
    }
    /**
     * Gets the factoryResetDeviceAdministratorEmails property value. List of Google account emails that will be required to authenticate after a device is factory reset before it can be set up.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFactoryResetDeviceAdministratorEmails() {
        return this._factoryResetDeviceAdministratorEmails;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidDeviceOwnerGeneralDeviceConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountsBlockModification", (n) -> { currentObject.setAccountsBlockModification(n.getBooleanValue()); });
        deserializerMap.put("appsAllowInstallFromUnknownSources", (n) -> { currentObject.setAppsAllowInstallFromUnknownSources(n.getBooleanValue()); });
        deserializerMap.put("appsAutoUpdatePolicy", (n) -> { currentObject.setAppsAutoUpdatePolicy(n.getEnumValue(AndroidDeviceOwnerAppAutoUpdatePolicyType.class)); });
        deserializerMap.put("appsDefaultPermissionPolicy", (n) -> { currentObject.setAppsDefaultPermissionPolicy(n.getEnumValue(AndroidDeviceOwnerDefaultAppPermissionPolicyType.class)); });
        deserializerMap.put("appsRecommendSkippingFirstUseHints", (n) -> { currentObject.setAppsRecommendSkippingFirstUseHints(n.getBooleanValue()); });
        deserializerMap.put("azureAdSharedDeviceDataClearApps", (n) -> { currentObject.setAzureAdSharedDeviceDataClearApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("bluetoothBlockConfiguration", (n) -> { currentObject.setBluetoothBlockConfiguration(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlockContactSharing", (n) -> { currentObject.setBluetoothBlockContactSharing(n.getBooleanValue()); });
        deserializerMap.put("cameraBlocked", (n) -> { currentObject.setCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockWiFiTethering", (n) -> { currentObject.setCellularBlockWiFiTethering(n.getBooleanValue()); });
        deserializerMap.put("certificateCredentialConfigurationDisabled", (n) -> { currentObject.setCertificateCredentialConfigurationDisabled(n.getBooleanValue()); });
        deserializerMap.put("crossProfilePoliciesAllowCopyPaste", (n) -> { currentObject.setCrossProfilePoliciesAllowCopyPaste(n.getBooleanValue()); });
        deserializerMap.put("crossProfilePoliciesAllowDataSharing", (n) -> { currentObject.setCrossProfilePoliciesAllowDataSharing(n.getEnumValue(AndroidDeviceOwnerCrossProfileDataSharing.class)); });
        deserializerMap.put("crossProfilePoliciesShowWorkContactsInPersonalProfile", (n) -> { currentObject.setCrossProfilePoliciesShowWorkContactsInPersonalProfile(n.getBooleanValue()); });
        deserializerMap.put("dataRoamingBlocked", (n) -> { currentObject.setDataRoamingBlocked(n.getBooleanValue()); });
        deserializerMap.put("dateTimeConfigurationBlocked", (n) -> { currentObject.setDateTimeConfigurationBlocked(n.getBooleanValue()); });
        deserializerMap.put("detailedHelpText", (n) -> { currentObject.setDetailedHelpText(n.getObjectValue(AndroidDeviceOwnerUserFacingMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceOwnerLockScreenMessage", (n) -> { currentObject.setDeviceOwnerLockScreenMessage(n.getObjectValue(AndroidDeviceOwnerUserFacingMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("enrollmentProfile", (n) -> { currentObject.setEnrollmentProfile(n.getEnumValue(AndroidDeviceOwnerEnrollmentProfileType.class)); });
        deserializerMap.put("factoryResetBlocked", (n) -> { currentObject.setFactoryResetBlocked(n.getBooleanValue()); });
        deserializerMap.put("factoryResetDeviceAdministratorEmails", (n) -> { currentObject.setFactoryResetDeviceAdministratorEmails(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("globalProxy", (n) -> { currentObject.setGlobalProxy(n.getObjectValue(AndroidDeviceOwnerGlobalProxy::createFromDiscriminatorValue)); });
        deserializerMap.put("googleAccountsBlocked", (n) -> { currentObject.setGoogleAccountsBlocked(n.getBooleanValue()); });
        deserializerMap.put("kioskCustomizationDeviceSettingsBlocked", (n) -> { currentObject.setKioskCustomizationDeviceSettingsBlocked(n.getBooleanValue()); });
        deserializerMap.put("kioskCustomizationPowerButtonActionsBlocked", (n) -> { currentObject.setKioskCustomizationPowerButtonActionsBlocked(n.getBooleanValue()); });
        deserializerMap.put("kioskCustomizationStatusBar", (n) -> { currentObject.setKioskCustomizationStatusBar(n.getEnumValue(AndroidDeviceOwnerKioskCustomizationStatusBar.class)); });
        deserializerMap.put("kioskCustomizationSystemErrorWarnings", (n) -> { currentObject.setKioskCustomizationSystemErrorWarnings(n.getBooleanValue()); });
        deserializerMap.put("kioskCustomizationSystemNavigation", (n) -> { currentObject.setKioskCustomizationSystemNavigation(n.getEnumValue(AndroidDeviceOwnerKioskCustomizationSystemNavigation.class)); });
        deserializerMap.put("kioskModeAppOrderEnabled", (n) -> { currentObject.setKioskModeAppOrderEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAppPositions", (n) -> { currentObject.setKioskModeAppPositions(n.getCollectionOfObjectValues(AndroidDeviceOwnerKioskModeAppPositionItem::createFromDiscriminatorValue)); });
        deserializerMap.put("kioskModeApps", (n) -> { currentObject.setKioskModeApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("kioskModeAppsInFolderOrderedByName", (n) -> { currentObject.setKioskModeAppsInFolderOrderedByName(n.getBooleanValue()); });
        deserializerMap.put("kioskModeBluetoothConfigurationEnabled", (n) -> { currentObject.setKioskModeBluetoothConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeDebugMenuEasyAccessEnabled", (n) -> { currentObject.setKioskModeDebugMenuEasyAccessEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeExitCode", (n) -> { currentObject.setKioskModeExitCode(n.getStringValue()); });
        deserializerMap.put("kioskModeFlashlightConfigurationEnabled", (n) -> { currentObject.setKioskModeFlashlightConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeFolderIcon", (n) -> { currentObject.setKioskModeFolderIcon(n.getEnumValue(AndroidDeviceOwnerKioskModeFolderIcon.class)); });
        deserializerMap.put("kioskModeGridHeight", (n) -> { currentObject.setKioskModeGridHeight(n.getIntegerValue()); });
        deserializerMap.put("kioskModeGridWidth", (n) -> { currentObject.setKioskModeGridWidth(n.getIntegerValue()); });
        deserializerMap.put("kioskModeIconSize", (n) -> { currentObject.setKioskModeIconSize(n.getEnumValue(AndroidDeviceOwnerKioskModeIconSize.class)); });
        deserializerMap.put("kioskModeLockHomeScreen", (n) -> { currentObject.setKioskModeLockHomeScreen(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedFolders", (n) -> { currentObject.setKioskModeManagedFolders(n.getCollectionOfObjectValues(AndroidDeviceOwnerKioskModeManagedFolder::createFromDiscriminatorValue)); });
        deserializerMap.put("kioskModeManagedHomeScreenAutoSignout", (n) -> { currentObject.setKioskModeManagedHomeScreenAutoSignout(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds", (n) -> { currentObject.setKioskModeManagedHomeScreenInactiveSignOutDelayInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds", (n) -> { currentObject.setKioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenPinComplexity", (n) -> { currentObject.setKioskModeManagedHomeScreenPinComplexity(n.getEnumValue(KioskModeManagedHomeScreenPinComplexity.class)); });
        deserializerMap.put("kioskModeManagedHomeScreenPinRequired", (n) -> { currentObject.setKioskModeManagedHomeScreenPinRequired(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenPinRequiredToResume", (n) -> { currentObject.setKioskModeManagedHomeScreenPinRequiredToResume(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenSignInBackground", (n) -> { currentObject.setKioskModeManagedHomeScreenSignInBackground(n.getStringValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenSignInBrandingLogo", (n) -> { currentObject.setKioskModeManagedHomeScreenSignInBrandingLogo(n.getStringValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenSignInEnabled", (n) -> { currentObject.setKioskModeManagedHomeScreenSignInEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedSettingsEntryDisabled", (n) -> { currentObject.setKioskModeManagedSettingsEntryDisabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeMediaVolumeConfigurationEnabled", (n) -> { currentObject.setKioskModeMediaVolumeConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeScreenOrientation", (n) -> { currentObject.setKioskModeScreenOrientation(n.getEnumValue(AndroidDeviceOwnerKioskModeScreenOrientation.class)); });
        deserializerMap.put("kioskModeScreenSaverConfigurationEnabled", (n) -> { currentObject.setKioskModeScreenSaverConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeScreenSaverDetectMediaDisabled", (n) -> { currentObject.setKioskModeScreenSaverDetectMediaDisabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeScreenSaverDisplayTimeInSeconds", (n) -> { currentObject.setKioskModeScreenSaverDisplayTimeInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskModeScreenSaverImageUrl", (n) -> { currentObject.setKioskModeScreenSaverImageUrl(n.getStringValue()); });
        deserializerMap.put("kioskModeScreenSaverStartDelayInSeconds", (n) -> { currentObject.setKioskModeScreenSaverStartDelayInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskModeShowAppNotificationBadge", (n) -> { currentObject.setKioskModeShowAppNotificationBadge(n.getBooleanValue()); });
        deserializerMap.put("kioskModeShowDeviceInfo", (n) -> { currentObject.setKioskModeShowDeviceInfo(n.getBooleanValue()); });
        deserializerMap.put("kioskModeUseManagedHomeScreenApp", (n) -> { currentObject.setKioskModeUseManagedHomeScreenApp(n.getEnumValue(KioskModeType.class)); });
        deserializerMap.put("kioskModeVirtualHomeButtonEnabled", (n) -> { currentObject.setKioskModeVirtualHomeButtonEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeVirtualHomeButtonType", (n) -> { currentObject.setKioskModeVirtualHomeButtonType(n.getEnumValue(AndroidDeviceOwnerVirtualHomeButtonType.class)); });
        deserializerMap.put("kioskModeWallpaperUrl", (n) -> { currentObject.setKioskModeWallpaperUrl(n.getStringValue()); });
        deserializerMap.put("kioskModeWifiAllowedSsids", (n) -> { currentObject.setKioskModeWifiAllowedSsids(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("kioskModeWiFiConfigurationEnabled", (n) -> { currentObject.setKioskModeWiFiConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("microphoneForceMute", (n) -> { currentObject.setMicrophoneForceMute(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherConfigurationEnabled", (n) -> { currentObject.setMicrosoftLauncherConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherCustomWallpaperAllowUserModification", (n) -> { currentObject.setMicrosoftLauncherCustomWallpaperAllowUserModification(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherCustomWallpaperEnabled", (n) -> { currentObject.setMicrosoftLauncherCustomWallpaperEnabled(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherCustomWallpaperImageUrl", (n) -> { currentObject.setMicrosoftLauncherCustomWallpaperImageUrl(n.getStringValue()); });
        deserializerMap.put("microsoftLauncherDockPresenceAllowUserModification", (n) -> { currentObject.setMicrosoftLauncherDockPresenceAllowUserModification(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherDockPresenceConfiguration", (n) -> { currentObject.setMicrosoftLauncherDockPresenceConfiguration(n.getEnumValue(MicrosoftLauncherDockPresence.class)); });
        deserializerMap.put("microsoftLauncherFeedAllowUserModification", (n) -> { currentObject.setMicrosoftLauncherFeedAllowUserModification(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherFeedEnabled", (n) -> { currentObject.setMicrosoftLauncherFeedEnabled(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherSearchBarPlacementConfiguration", (n) -> { currentObject.setMicrosoftLauncherSearchBarPlacementConfiguration(n.getEnumValue(MicrosoftLauncherSearchBarPlacement.class)); });
        deserializerMap.put("networkEscapeHatchAllowed", (n) -> { currentObject.setNetworkEscapeHatchAllowed(n.getBooleanValue()); });
        deserializerMap.put("nfcBlockOutgoingBeam", (n) -> { currentObject.setNfcBlockOutgoingBeam(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockKeyguard", (n) -> { currentObject.setPasswordBlockKeyguard(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockKeyguardFeatures", (n) -> { currentObject.setPasswordBlockKeyguardFeatures(n.getCollectionOfEnumValues(AndroidKeyguardFeature.class)); });
        deserializerMap.put("passwordExpirationDays", (n) -> { currentObject.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { currentObject.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLetterCharacters", (n) -> { currentObject.setPasswordMinimumLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLowerCaseCharacters", (n) -> { currentObject.setPasswordMinimumLowerCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumNonLetterCharacters", (n) -> { currentObject.setPasswordMinimumNonLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumNumericCharacters", (n) -> { currentObject.setPasswordMinimumNumericCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumSymbolCharacters", (n) -> { currentObject.setPasswordMinimumSymbolCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumUpperCaseCharacters", (n) -> { currentObject.setPasswordMinimumUpperCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { currentObject.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordCountToBlock", (n) -> { currentObject.setPasswordPreviousPasswordCountToBlock(n.getIntegerValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { currentObject.setPasswordRequiredType(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordType.class)); });
        deserializerMap.put("passwordRequireUnlock", (n) -> { currentObject.setPasswordRequireUnlock(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordUnlock.class)); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { currentObject.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("personalProfileAppsAllowInstallFromUnknownSources", (n) -> { currentObject.setPersonalProfileAppsAllowInstallFromUnknownSources(n.getBooleanValue()); });
        deserializerMap.put("personalProfileCameraBlocked", (n) -> { currentObject.setPersonalProfileCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("personalProfilePersonalApplications", (n) -> { currentObject.setPersonalProfilePersonalApplications(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("personalProfilePlayStoreMode", (n) -> { currentObject.setPersonalProfilePlayStoreMode(n.getEnumValue(PersonalProfilePersonalPlayStoreMode.class)); });
        deserializerMap.put("personalProfileScreenCaptureBlocked", (n) -> { currentObject.setPersonalProfileScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("playStoreMode", (n) -> { currentObject.setPlayStoreMode(n.getEnumValue(AndroidDeviceOwnerPlayStoreMode.class)); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { currentObject.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("securityCommonCriteriaModeEnabled", (n) -> { currentObject.setSecurityCommonCriteriaModeEnabled(n.getBooleanValue()); });
        deserializerMap.put("securityDeveloperSettingsEnabled", (n) -> { currentObject.setSecurityDeveloperSettingsEnabled(n.getBooleanValue()); });
        deserializerMap.put("securityRequireVerifyApps", (n) -> { currentObject.setSecurityRequireVerifyApps(n.getBooleanValue()); });
        deserializerMap.put("shortHelpText", (n) -> { currentObject.setShortHelpText(n.getObjectValue(AndroidDeviceOwnerUserFacingMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("statusBarBlocked", (n) -> { currentObject.setStatusBarBlocked(n.getBooleanValue()); });
        deserializerMap.put("stayOnModes", (n) -> { currentObject.setStayOnModes(n.getCollectionOfEnumValues(AndroidDeviceOwnerBatteryPluggedMode.class)); });
        deserializerMap.put("storageAllowUsb", (n) -> { currentObject.setStorageAllowUsb(n.getBooleanValue()); });
        deserializerMap.put("storageBlockExternalMedia", (n) -> { currentObject.setStorageBlockExternalMedia(n.getBooleanValue()); });
        deserializerMap.put("storageBlockUsbFileTransfer", (n) -> { currentObject.setStorageBlockUsbFileTransfer(n.getBooleanValue()); });
        deserializerMap.put("systemUpdateFreezePeriods", (n) -> { currentObject.setSystemUpdateFreezePeriods(n.getCollectionOfObjectValues(AndroidDeviceOwnerSystemUpdateFreezePeriod::createFromDiscriminatorValue)); });
        deserializerMap.put("systemUpdateInstallType", (n) -> { currentObject.setSystemUpdateInstallType(n.getEnumValue(AndroidDeviceOwnerSystemUpdateInstallType.class)); });
        deserializerMap.put("systemUpdateWindowEndMinutesAfterMidnight", (n) -> { currentObject.setSystemUpdateWindowEndMinutesAfterMidnight(n.getIntegerValue()); });
        deserializerMap.put("systemUpdateWindowStartMinutesAfterMidnight", (n) -> { currentObject.setSystemUpdateWindowStartMinutesAfterMidnight(n.getIntegerValue()); });
        deserializerMap.put("systemWindowsBlocked", (n) -> { currentObject.setSystemWindowsBlocked(n.getBooleanValue()); });
        deserializerMap.put("usersBlockAdd", (n) -> { currentObject.setUsersBlockAdd(n.getBooleanValue()); });
        deserializerMap.put("usersBlockRemove", (n) -> { currentObject.setUsersBlockRemove(n.getBooleanValue()); });
        deserializerMap.put("volumeBlockAdjustment", (n) -> { currentObject.setVolumeBlockAdjustment(n.getBooleanValue()); });
        deserializerMap.put("vpnAlwaysOnLockdownMode", (n) -> { currentObject.setVpnAlwaysOnLockdownMode(n.getBooleanValue()); });
        deserializerMap.put("vpnAlwaysOnPackageIdentifier", (n) -> { currentObject.setVpnAlwaysOnPackageIdentifier(n.getStringValue()); });
        deserializerMap.put("wifiBlockEditConfigurations", (n) -> { currentObject.setWifiBlockEditConfigurations(n.getBooleanValue()); });
        deserializerMap.put("wifiBlockEditPolicyDefinedConfigurations", (n) -> { currentObject.setWifiBlockEditPolicyDefinedConfigurations(n.getBooleanValue()); });
        deserializerMap.put("workProfilePasswordExpirationDays", (n) -> { currentObject.setWorkProfilePasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumLength", (n) -> { currentObject.setWorkProfilePasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumLetterCharacters", (n) -> { currentObject.setWorkProfilePasswordMinimumLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumLowerCaseCharacters", (n) -> { currentObject.setWorkProfilePasswordMinimumLowerCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumNonLetterCharacters", (n) -> { currentObject.setWorkProfilePasswordMinimumNonLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumNumericCharacters", (n) -> { currentObject.setWorkProfilePasswordMinimumNumericCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumSymbolCharacters", (n) -> { currentObject.setWorkProfilePasswordMinimumSymbolCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumUpperCaseCharacters", (n) -> { currentObject.setWorkProfilePasswordMinimumUpperCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordPreviousPasswordCountToBlock", (n) -> { currentObject.setWorkProfilePasswordPreviousPasswordCountToBlock(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordRequiredType", (n) -> { currentObject.setWorkProfilePasswordRequiredType(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordType.class)); });
        deserializerMap.put("workProfilePasswordRequireUnlock", (n) -> { currentObject.setWorkProfilePasswordRequireUnlock(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordUnlock.class)); });
        deserializerMap.put("workProfilePasswordSignInFailureCountBeforeFactoryReset", (n) -> { currentObject.setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the globalProxy property value. Proxy is set up directly with host, port and excluded hosts.
     * @return a androidDeviceOwnerGlobalProxy
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerGlobalProxy getGlobalProxy() {
        return this._globalProxy;
    }
    /**
     * Gets the googleAccountsBlocked property value. Indicates whether or not google accounts will be blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGoogleAccountsBlocked() {
        return this._googleAccountsBlocked;
    }
    /**
     * Gets the kioskCustomizationDeviceSettingsBlocked property value. Indicateswhether a user can access the device's Settings app while in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskCustomizationDeviceSettingsBlocked() {
        return this._kioskCustomizationDeviceSettingsBlocked;
    }
    /**
     * Gets the kioskCustomizationPowerButtonActionsBlocked property value. Whether the power menu is shown when a user long presses the Power button of a device in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskCustomizationPowerButtonActionsBlocked() {
        return this._kioskCustomizationPowerButtonActionsBlocked;
    }
    /**
     * Gets the kioskCustomizationStatusBar property value. Indicates whether system info and notifications are disabled in Kiosk Mode. Possible values are: notConfigured, notificationsAndSystemInfoEnabled, systemInfoOnly.
     * @return a androidDeviceOwnerKioskCustomizationStatusBar
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerKioskCustomizationStatusBar getKioskCustomizationStatusBar() {
        return this._kioskCustomizationStatusBar;
    }
    /**
     * Gets the kioskCustomizationSystemErrorWarnings property value. Indicates whether system error dialogs for crashed or unresponsive apps are shown in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskCustomizationSystemErrorWarnings() {
        return this._kioskCustomizationSystemErrorWarnings;
    }
    /**
     * Gets the kioskCustomizationSystemNavigation property value. Indicates which navigation features are enabled in Kiosk Mode. Possible values are: notConfigured, navigationEnabled, homeButtonOnly.
     * @return a androidDeviceOwnerKioskCustomizationSystemNavigation
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerKioskCustomizationSystemNavigation getKioskCustomizationSystemNavigation() {
        return this._kioskCustomizationSystemNavigation;
    }
    /**
     * Gets the kioskModeAppOrderEnabled property value. Whether or not to enable app ordering in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAppOrderEnabled() {
        return this._kioskModeAppOrderEnabled;
    }
    /**
     * Gets the kioskModeAppPositions property value. The ordering of items on Kiosk Mode Managed Home Screen. This collection can contain a maximum of 500 elements.
     * @return a androidDeviceOwnerKioskModeAppPositionItem
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerKioskModeAppPositionItem> getKioskModeAppPositions() {
        return this._kioskModeAppPositions;
    }
    /**
     * Gets the kioskModeApps property value. A list of managed apps that will be shown when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getKioskModeApps() {
        return this._kioskModeApps;
    }
    /**
     * Gets the kioskModeAppsInFolderOrderedByName property value. Whether or not to alphabetize applications within a folder in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAppsInFolderOrderedByName() {
        return this._kioskModeAppsInFolderOrderedByName;
    }
    /**
     * Gets the kioskModeBluetoothConfigurationEnabled property value. Whether or not to allow a user to configure Bluetooth settings in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeBluetoothConfigurationEnabled() {
        return this._kioskModeBluetoothConfigurationEnabled;
    }
    /**
     * Gets the kioskModeDebugMenuEasyAccessEnabled property value. Whether or not to allow a user to easy access to the debug menu in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeDebugMenuEasyAccessEnabled() {
        return this._kioskModeDebugMenuEasyAccessEnabled;
    }
    /**
     * Gets the kioskModeExitCode property value. Exit code to allow a user to escape from Kiosk Mode when the device is in Kiosk Mode.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskModeExitCode() {
        return this._kioskModeExitCode;
    }
    /**
     * Gets the kioskModeFlashlightConfigurationEnabled property value. Whether or not to allow a user to use the flashlight in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeFlashlightConfigurationEnabled() {
        return this._kioskModeFlashlightConfigurationEnabled;
    }
    /**
     * Gets the kioskModeFolderIcon property value. Folder icon configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, darkSquare, darkCircle, lightSquare, lightCircle.
     * @return a androidDeviceOwnerKioskModeFolderIcon
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerKioskModeFolderIcon getKioskModeFolderIcon() {
        return this._kioskModeFolderIcon;
    }
    /**
     * Gets the kioskModeGridHeight property value. Number of rows for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKioskModeGridHeight() {
        return this._kioskModeGridHeight;
    }
    /**
     * Gets the kioskModeGridWidth property value. Number of columns for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKioskModeGridWidth() {
        return this._kioskModeGridWidth;
    }
    /**
     * Gets the kioskModeIconSize property value. Icon size configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, smallest, small, regular, large, largest.
     * @return a androidDeviceOwnerKioskModeIconSize
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerKioskModeIconSize getKioskModeIconSize() {
        return this._kioskModeIconSize;
    }
    /**
     * Gets the kioskModeLockHomeScreen property value. Whether or not to lock home screen to the end user in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeLockHomeScreen() {
        return this._kioskModeLockHomeScreen;
    }
    /**
     * Gets the kioskModeManagedFolders property value. A list of managed folders for a device in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @return a androidDeviceOwnerKioskModeManagedFolder
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerKioskModeManagedFolder> getKioskModeManagedFolders() {
        return this._kioskModeManagedFolders;
    }
    /**
     * Gets the kioskModeManagedHomeScreenAutoSignout property value. Whether or not to automatically sign-out of MHS and Shared device mode applications after inactive for Managed Home Screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeManagedHomeScreenAutoSignout() {
        return this._kioskModeManagedHomeScreenAutoSignout;
    }
    /**
     * Gets the kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds property value. Number of seconds to give user notice before automatically signing them out for Managed Home Screen. Valid values 0 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKioskModeManagedHomeScreenInactiveSignOutDelayInSeconds() {
        return this._kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds;
    }
    /**
     * Gets the kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds property value. Number of seconds device is inactive before automatically signing user out for Managed Home Screen. Valid values 0 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds() {
        return this._kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds;
    }
    /**
     * Gets the kioskModeManagedHomeScreenPinComplexity property value. Complexity of PIN for sign-in session for Managed Home Screen. Possible values are: notConfigured, simple, complex.
     * @return a kioskModeManagedHomeScreenPinComplexity
     */
    @javax.annotation.Nullable
    public KioskModeManagedHomeScreenPinComplexity getKioskModeManagedHomeScreenPinComplexity() {
        return this._kioskModeManagedHomeScreenPinComplexity;
    }
    /**
     * Gets the kioskModeManagedHomeScreenPinRequired property value. Whether or not require user to set a PIN for sign-in session for Managed Home Screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeManagedHomeScreenPinRequired() {
        return this._kioskModeManagedHomeScreenPinRequired;
    }
    /**
     * Gets the kioskModeManagedHomeScreenPinRequiredToResume property value. Whether or not required user to enter session PIN if screensaver has appeared for Managed Home Screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeManagedHomeScreenPinRequiredToResume() {
        return this._kioskModeManagedHomeScreenPinRequiredToResume;
    }
    /**
     * Gets the kioskModeManagedHomeScreenSignInBackground property value. Custom URL background for sign-in screen for Managed Home Screen.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskModeManagedHomeScreenSignInBackground() {
        return this._kioskModeManagedHomeScreenSignInBackground;
    }
    /**
     * Gets the kioskModeManagedHomeScreenSignInBrandingLogo property value. Custom URL branding logo for sign-in screen and session pin page for Managed Home Screen.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskModeManagedHomeScreenSignInBrandingLogo() {
        return this._kioskModeManagedHomeScreenSignInBrandingLogo;
    }
    /**
     * Gets the kioskModeManagedHomeScreenSignInEnabled property value. Whether or not show sign-in screen for Managed Home Screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeManagedHomeScreenSignInEnabled() {
        return this._kioskModeManagedHomeScreenSignInEnabled;
    }
    /**
     * Gets the kioskModeManagedSettingsEntryDisabled property value. Whether or not to display the Managed Settings entry point on the managed home screen in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeManagedSettingsEntryDisabled() {
        return this._kioskModeManagedSettingsEntryDisabled;
    }
    /**
     * Gets the kioskModeMediaVolumeConfigurationEnabled property value. Whether or not to allow a user to change the media volume in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeMediaVolumeConfigurationEnabled() {
        return this._kioskModeMediaVolumeConfigurationEnabled;
    }
    /**
     * Gets the kioskModeScreenOrientation property value. Screen orientation configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, portrait, landscape, autoRotate.
     * @return a androidDeviceOwnerKioskModeScreenOrientation
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerKioskModeScreenOrientation getKioskModeScreenOrientation() {
        return this._kioskModeScreenOrientation;
    }
    /**
     * Gets the kioskModeScreenSaverConfigurationEnabled property value. Whether or not to enable screen saver mode or not in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeScreenSaverConfigurationEnabled() {
        return this._kioskModeScreenSaverConfigurationEnabled;
    }
    /**
     * Gets the kioskModeScreenSaverDetectMediaDisabled property value. Whether or not the device screen should show the screen saver if audio/video is playing in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeScreenSaverDetectMediaDisabled() {
        return this._kioskModeScreenSaverDetectMediaDisabled;
    }
    /**
     * Gets the kioskModeScreenSaverDisplayTimeInSeconds property value. The number of seconds that the device will display the screen saver for in Kiosk Mode. Valid values 0 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKioskModeScreenSaverDisplayTimeInSeconds() {
        return this._kioskModeScreenSaverDisplayTimeInSeconds;
    }
    /**
     * Gets the kioskModeScreenSaverImageUrl property value. URL for an image that will be the device's screen saver in Kiosk Mode.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskModeScreenSaverImageUrl() {
        return this._kioskModeScreenSaverImageUrl;
    }
    /**
     * Gets the kioskModeScreenSaverStartDelayInSeconds property value. The number of seconds the device needs to be inactive for before the screen saver is shown in Kiosk Mode. Valid values 1 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKioskModeScreenSaverStartDelayInSeconds() {
        return this._kioskModeScreenSaverStartDelayInSeconds;
    }
    /**
     * Gets the kioskModeShowAppNotificationBadge property value. Whether or not to display application notification badges in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeShowAppNotificationBadge() {
        return this._kioskModeShowAppNotificationBadge;
    }
    /**
     * Gets the kioskModeShowDeviceInfo property value. Whether or not to allow a user to access basic device information.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeShowDeviceInfo() {
        return this._kioskModeShowDeviceInfo;
    }
    /**
     * Gets the kioskModeUseManagedHomeScreenApp property value. Whether or not to use single app kiosk mode or multi-app kiosk mode. Possible values are: notConfigured, singleAppMode, multiAppMode.
     * @return a kioskModeType
     */
    @javax.annotation.Nullable
    public KioskModeType getKioskModeUseManagedHomeScreenApp() {
        return this._kioskModeUseManagedHomeScreenApp;
    }
    /**
     * Gets the kioskModeVirtualHomeButtonEnabled property value. Whether or not to display a virtual home button when the device is in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeVirtualHomeButtonEnabled() {
        return this._kioskModeVirtualHomeButtonEnabled;
    }
    /**
     * Gets the kioskModeVirtualHomeButtonType property value. Indicates whether the virtual home button is a swipe up home button or a floating home button. Possible values are: notConfigured, swipeUp, floating.
     * @return a androidDeviceOwnerVirtualHomeButtonType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerVirtualHomeButtonType getKioskModeVirtualHomeButtonType() {
        return this._kioskModeVirtualHomeButtonType;
    }
    /**
     * Gets the kioskModeWallpaperUrl property value. URL to a publicly accessible image to use for the wallpaper when the device is in Kiosk Mode.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskModeWallpaperUrl() {
        return this._kioskModeWallpaperUrl;
    }
    /**
     * Gets the kioskModeWifiAllowedSsids property value. The restricted set of WIFI SSIDs available for the user to configure in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getKioskModeWifiAllowedSsids() {
        return this._kioskModeWifiAllowedSsids;
    }
    /**
     * Gets the kioskModeWiFiConfigurationEnabled property value. Whether or not to allow a user to configure Wi-Fi settings in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeWiFiConfigurationEnabled() {
        return this._kioskModeWiFiConfigurationEnabled;
    }
    /**
     * Gets the microphoneForceMute property value. Indicates whether or not to block unmuting the microphone on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrophoneForceMute() {
        return this._microphoneForceMute;
    }
    /**
     * Gets the microsoftLauncherConfigurationEnabled property value. Indicates whether or not to you want configure Microsoft Launcher.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftLauncherConfigurationEnabled() {
        return this._microsoftLauncherConfigurationEnabled;
    }
    /**
     * Gets the microsoftLauncherCustomWallpaperAllowUserModification property value. Indicates whether or not the user can modify the wallpaper to personalize their device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftLauncherCustomWallpaperAllowUserModification() {
        return this._microsoftLauncherCustomWallpaperAllowUserModification;
    }
    /**
     * Gets the microsoftLauncherCustomWallpaperEnabled property value. Indicates whether or not to configure the wallpaper on the targeted devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftLauncherCustomWallpaperEnabled() {
        return this._microsoftLauncherCustomWallpaperEnabled;
    }
    /**
     * Gets the microsoftLauncherCustomWallpaperImageUrl property value. Indicates the URL for the image file to use as the wallpaper on the targeted devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMicrosoftLauncherCustomWallpaperImageUrl() {
        return this._microsoftLauncherCustomWallpaperImageUrl;
    }
    /**
     * Gets the microsoftLauncherDockPresenceAllowUserModification property value. Indicates whether or not the user can modify the device dock configuration on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftLauncherDockPresenceAllowUserModification() {
        return this._microsoftLauncherDockPresenceAllowUserModification;
    }
    /**
     * Gets the microsoftLauncherDockPresenceConfiguration property value. Indicates whether or not you want to configure the device dock. Possible values are: notConfigured, show, hide, disabled.
     * @return a microsoftLauncherDockPresence
     */
    @javax.annotation.Nullable
    public MicrosoftLauncherDockPresence getMicrosoftLauncherDockPresenceConfiguration() {
        return this._microsoftLauncherDockPresenceConfiguration;
    }
    /**
     * Gets the microsoftLauncherFeedAllowUserModification property value. Indicates whether or not the user can modify the launcher feed on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftLauncherFeedAllowUserModification() {
        return this._microsoftLauncherFeedAllowUserModification;
    }
    /**
     * Gets the microsoftLauncherFeedEnabled property value. Indicates whether or not you want to enable the launcher feed on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftLauncherFeedEnabled() {
        return this._microsoftLauncherFeedEnabled;
    }
    /**
     * Gets the microsoftLauncherSearchBarPlacementConfiguration property value. Indicates the search bar placement configuration on the device. Possible values are: notConfigured, top, bottom, hide.
     * @return a microsoftLauncherSearchBarPlacement
     */
    @javax.annotation.Nullable
    public MicrosoftLauncherSearchBarPlacement getMicrosoftLauncherSearchBarPlacementConfiguration() {
        return this._microsoftLauncherSearchBarPlacementConfiguration;
    }
    /**
     * Gets the networkEscapeHatchAllowed property value. Indicates whether or not the device will allow connecting to a temporary network connection at boot time.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNetworkEscapeHatchAllowed() {
        return this._networkEscapeHatchAllowed;
    }
    /**
     * Gets the nfcBlockOutgoingBeam property value. Indicates whether or not to block NFC outgoing beam.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNfcBlockOutgoingBeam() {
        return this._nfcBlockOutgoingBeam;
    }
    /**
     * Gets the passwordBlockKeyguard property value. Indicates whether or not the keyguard is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockKeyguard() {
        return this._passwordBlockKeyguard;
    }
    /**
     * Gets the passwordBlockKeyguardFeatures property value. List of device keyguard features to block. This collection can contain a maximum of 11 elements.
     * @return a androidKeyguardFeature
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidKeyguardFeature> getPasswordBlockKeyguardFeatures() {
        return this._passwordBlockKeyguardFeatures;
    }
    /**
     * Gets the passwordExpirationDays property value. Indicates the amount of time that a password can be set for before it expires and a new password will be required. Valid values 1 to 365
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this._passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumLength property value. Indicates the minimum length of the password required on the device. Valid values 4 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this._passwordMinimumLength;
    }
    /**
     * Gets the passwordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLetterCharacters() {
        return this._passwordMinimumLetterCharacters;
    }
    /**
     * Gets the passwordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLowerCaseCharacters() {
        return this._passwordMinimumLowerCaseCharacters;
    }
    /**
     * Gets the passwordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumNonLetterCharacters() {
        return this._passwordMinimumNonLetterCharacters;
    }
    /**
     * Gets the passwordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumNumericCharacters() {
        return this._passwordMinimumNumericCharacters;
    }
    /**
     * Gets the passwordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumSymbolCharacters() {
        return this._passwordMinimumSymbolCharacters;
    }
    /**
     * Gets the passwordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumUpperCaseCharacters() {
        return this._passwordMinimumUpperCaseCharacters;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this._passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordPreviousPasswordCountToBlock property value. Indicates the length of password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordCountToBlock() {
        return this._passwordPreviousPasswordCountToBlock;
    }
    /**
     * Gets the passwordRequiredType property value. Indicates the minimum password quality required on the device. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @return a androidDeviceOwnerRequiredPasswordType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordType getPasswordRequiredType() {
        return this._passwordRequiredType;
    }
    /**
     * Gets the passwordRequireUnlock property value. Indicates the timeout period after which a device must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue.
     * @return a androidDeviceOwnerRequiredPasswordUnlock
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordUnlock getPasswordRequireUnlock() {
        return this._passwordRequireUnlock;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this._passwordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the personalProfileAppsAllowInstallFromUnknownSources property value. Indicates whether the user can install apps from unknown sources on the personal profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPersonalProfileAppsAllowInstallFromUnknownSources() {
        return this._personalProfileAppsAllowInstallFromUnknownSources;
    }
    /**
     * Gets the personalProfileCameraBlocked property value. Indicates whether to disable the use of the camera on the personal profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPersonalProfileCameraBlocked() {
        return this._personalProfileCameraBlocked;
    }
    /**
     * Gets the personalProfilePersonalApplications property value. Policy applied to applications in the personal profile. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getPersonalProfilePersonalApplications() {
        return this._personalProfilePersonalApplications;
    }
    /**
     * Gets the personalProfilePlayStoreMode property value. Used together with PersonalProfilePersonalApplications to control how apps in the personal profile are allowed or blocked. Possible values are: notConfigured, blockedApps, allowedApps.
     * @return a personalProfilePersonalPlayStoreMode
     */
    @javax.annotation.Nullable
    public PersonalProfilePersonalPlayStoreMode getPersonalProfilePlayStoreMode() {
        return this._personalProfilePlayStoreMode;
    }
    /**
     * Gets the personalProfileScreenCaptureBlocked property value. Indicates whether to disable the capability to take screenshots on the personal profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPersonalProfileScreenCaptureBlocked() {
        return this._personalProfileScreenCaptureBlocked;
    }
    /**
     * Gets the playStoreMode property value. Indicates the Play Store mode of the device. Possible values are: notConfigured, allowList, blockList.
     * @return a androidDeviceOwnerPlayStoreMode
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerPlayStoreMode getPlayStoreMode() {
        return this._playStoreMode;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to disable the capability to take screenshots.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this._screenCaptureBlocked;
    }
    /**
     * Gets the securityCommonCriteriaModeEnabled property value. Represents the security common criteria mode enabled provided to users when they attempt to modify managed settings on their device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityCommonCriteriaModeEnabled() {
        return this._securityCommonCriteriaModeEnabled;
    }
    /**
     * Gets the securityDeveloperSettingsEnabled property value. Indicates whether or not the user is allowed to access developer settings like developer options and safe boot on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityDeveloperSettingsEnabled() {
        return this._securityDeveloperSettingsEnabled;
    }
    /**
     * Gets the securityRequireVerifyApps property value. Indicates whether or not verify apps is required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityRequireVerifyApps() {
        return this._securityRequireVerifyApps;
    }
    /**
     * Gets the shortHelpText property value. Represents the customized short help text provided to users when they attempt to modify managed settings on their device.
     * @return a androidDeviceOwnerUserFacingMessage
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerUserFacingMessage getShortHelpText() {
        return this._shortHelpText;
    }
    /**
     * Gets the statusBarBlocked property value. Indicates whether or the status bar is disabled, including notifications, quick settings and other screen overlays.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStatusBarBlocked() {
        return this._statusBarBlocked;
    }
    /**
     * Gets the stayOnModes property value. List of modes in which the device's display will stay powered-on. This collection can contain a maximum of 4 elements.
     * @return a androidDeviceOwnerBatteryPluggedMode
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerBatteryPluggedMode> getStayOnModes() {
        return this._stayOnModes;
    }
    /**
     * Gets the storageAllowUsb property value. Indicates whether or not to allow USB mass storage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageAllowUsb() {
        return this._storageAllowUsb;
    }
    /**
     * Gets the storageBlockExternalMedia property value. Indicates whether or not to block external media.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockExternalMedia() {
        return this._storageBlockExternalMedia;
    }
    /**
     * Gets the storageBlockUsbFileTransfer property value. Indicates whether or not to block USB file transfer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockUsbFileTransfer() {
        return this._storageBlockUsbFileTransfer;
    }
    /**
     * Gets the systemUpdateFreezePeriods property value. Indicates the annually repeating time periods during which system updates are postponed. This collection can contain a maximum of 500 elements.
     * @return a androidDeviceOwnerSystemUpdateFreezePeriod
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerSystemUpdateFreezePeriod> getSystemUpdateFreezePeriods() {
        return this._systemUpdateFreezePeriods;
    }
    /**
     * Gets the systemUpdateInstallType property value. The type of system update configuration. Possible values are: deviceDefault, postpone, windowed, automatic.
     * @return a androidDeviceOwnerSystemUpdateInstallType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerSystemUpdateInstallType getSystemUpdateInstallType() {
        return this._systemUpdateInstallType;
    }
    /**
     * Gets the systemUpdateWindowEndMinutesAfterMidnight property value. Indicates the number of minutes after midnight that the system update window ends. Valid values 0 to 1440
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSystemUpdateWindowEndMinutesAfterMidnight() {
        return this._systemUpdateWindowEndMinutesAfterMidnight;
    }
    /**
     * Gets the systemUpdateWindowStartMinutesAfterMidnight property value. Indicates the number of minutes after midnight that the system update window starts. Valid values 0 to 1440
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSystemUpdateWindowStartMinutesAfterMidnight() {
        return this._systemUpdateWindowStartMinutesAfterMidnight;
    }
    /**
     * Gets the systemWindowsBlocked property value. Whether or not to block Android system prompt windows, like toasts, phone activities, and system alerts.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSystemWindowsBlocked() {
        return this._systemWindowsBlocked;
    }
    /**
     * Gets the usersBlockAdd property value. Indicates whether or not adding users and profiles is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUsersBlockAdd() {
        return this._usersBlockAdd;
    }
    /**
     * Gets the usersBlockRemove property value. Indicates whether or not to disable removing other users from the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUsersBlockRemove() {
        return this._usersBlockRemove;
    }
    /**
     * Gets the volumeBlockAdjustment property value. Indicates whether or not adjusting the master volume is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVolumeBlockAdjustment() {
        return this._volumeBlockAdjustment;
    }
    /**
     * Gets the vpnAlwaysOnLockdownMode property value. If an always on VPN package name is specified, whether or not to lock network traffic when that VPN is disconnected.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVpnAlwaysOnLockdownMode() {
        return this._vpnAlwaysOnLockdownMode;
    }
    /**
     * Gets the vpnAlwaysOnPackageIdentifier property value. Android app package name for app that will handle an always-on VPN connection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVpnAlwaysOnPackageIdentifier() {
        return this._vpnAlwaysOnPackageIdentifier;
    }
    /**
     * Gets the wifiBlockEditConfigurations property value. Indicates whether or not to block the user from editing the wifi connection settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWifiBlockEditConfigurations() {
        return this._wifiBlockEditConfigurations;
    }
    /**
     * Gets the wifiBlockEditPolicyDefinedConfigurations property value. Indicates whether or not to block the user from editing just the networks defined by the policy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWifiBlockEditPolicyDefinedConfigurations() {
        return this._wifiBlockEditPolicyDefinedConfigurations;
    }
    /**
     * Gets the workProfilePasswordExpirationDays property value. Indicates the number of days that a work profile password can be set before it expires and a new password will be required. Valid values 1 to 365
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordExpirationDays() {
        return this._workProfilePasswordExpirationDays;
    }
    /**
     * Gets the workProfilePasswordMinimumLength property value. Indicates the minimum length of the work profile password. Valid values 4 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumLength() {
        return this._workProfilePasswordMinimumLength;
    }
    /**
     * Gets the workProfilePasswordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for the work profile password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumLetterCharacters() {
        return this._workProfilePasswordMinimumLetterCharacters;
    }
    /**
     * Gets the workProfilePasswordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower-case characters required for the work profile password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumLowerCaseCharacters() {
        return this._workProfilePasswordMinimumLowerCaseCharacters;
    }
    /**
     * Gets the workProfilePasswordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for the work profile password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumNonLetterCharacters() {
        return this._workProfilePasswordMinimumNonLetterCharacters;
    }
    /**
     * Gets the workProfilePasswordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for the work profile password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumNumericCharacters() {
        return this._workProfilePasswordMinimumNumericCharacters;
    }
    /**
     * Gets the workProfilePasswordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for the work profile password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumSymbolCharacters() {
        return this._workProfilePasswordMinimumSymbolCharacters;
    }
    /**
     * Gets the workProfilePasswordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper-case letter characters required for the work profile password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumUpperCaseCharacters() {
        return this._workProfilePasswordMinimumUpperCaseCharacters;
    }
    /**
     * Gets the workProfilePasswordPreviousPasswordCountToBlock property value. Indicates the length of the work profile password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordPreviousPasswordCountToBlock() {
        return this._workProfilePasswordPreviousPasswordCountToBlock;
    }
    /**
     * Gets the workProfilePasswordRequiredType property value. Indicates the minimum password quality required on the work profile password. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @return a androidDeviceOwnerRequiredPasswordType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordType getWorkProfilePasswordRequiredType() {
        return this._workProfilePasswordRequiredType;
    }
    /**
     * Gets the workProfilePasswordRequireUnlock property value. Indicates the timeout period after which a work profile must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue.
     * @return a androidDeviceOwnerRequiredPasswordUnlock
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordUnlock getWorkProfilePasswordRequireUnlock() {
        return this._workProfilePasswordRequireUnlock;
    }
    /**
     * Gets the workProfilePasswordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect work profile password before the device is wiped. Valid values 4 to 11
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordSignInFailureCountBeforeFactoryReset() {
        return this._workProfilePasswordSignInFailureCountBeforeFactoryReset;
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
        writer.writeBooleanValue("accountsBlockModification", this.getAccountsBlockModification());
        writer.writeBooleanValue("appsAllowInstallFromUnknownSources", this.getAppsAllowInstallFromUnknownSources());
        writer.writeEnumValue("appsAutoUpdatePolicy", this.getAppsAutoUpdatePolicy());
        writer.writeEnumValue("appsDefaultPermissionPolicy", this.getAppsDefaultPermissionPolicy());
        writer.writeBooleanValue("appsRecommendSkippingFirstUseHints", this.getAppsRecommendSkippingFirstUseHints());
        writer.writeCollectionOfObjectValues("azureAdSharedDeviceDataClearApps", this.getAzureAdSharedDeviceDataClearApps());
        writer.writeBooleanValue("bluetoothBlockConfiguration", this.getBluetoothBlockConfiguration());
        writer.writeBooleanValue("bluetoothBlockContactSharing", this.getBluetoothBlockContactSharing());
        writer.writeBooleanValue("cameraBlocked", this.getCameraBlocked());
        writer.writeBooleanValue("cellularBlockWiFiTethering", this.getCellularBlockWiFiTethering());
        writer.writeBooleanValue("certificateCredentialConfigurationDisabled", this.getCertificateCredentialConfigurationDisabled());
        writer.writeBooleanValue("crossProfilePoliciesAllowCopyPaste", this.getCrossProfilePoliciesAllowCopyPaste());
        writer.writeEnumValue("crossProfilePoliciesAllowDataSharing", this.getCrossProfilePoliciesAllowDataSharing());
        writer.writeBooleanValue("crossProfilePoliciesShowWorkContactsInPersonalProfile", this.getCrossProfilePoliciesShowWorkContactsInPersonalProfile());
        writer.writeBooleanValue("dataRoamingBlocked", this.getDataRoamingBlocked());
        writer.writeBooleanValue("dateTimeConfigurationBlocked", this.getDateTimeConfigurationBlocked());
        writer.writeObjectValue("detailedHelpText", this.getDetailedHelpText());
        writer.writeObjectValue("deviceOwnerLockScreenMessage", this.getDeviceOwnerLockScreenMessage());
        writer.writeEnumValue("enrollmentProfile", this.getEnrollmentProfile());
        writer.writeBooleanValue("factoryResetBlocked", this.getFactoryResetBlocked());
        writer.writeCollectionOfPrimitiveValues("factoryResetDeviceAdministratorEmails", this.getFactoryResetDeviceAdministratorEmails());
        writer.writeObjectValue("globalProxy", this.getGlobalProxy());
        writer.writeBooleanValue("googleAccountsBlocked", this.getGoogleAccountsBlocked());
        writer.writeBooleanValue("kioskCustomizationDeviceSettingsBlocked", this.getKioskCustomizationDeviceSettingsBlocked());
        writer.writeBooleanValue("kioskCustomizationPowerButtonActionsBlocked", this.getKioskCustomizationPowerButtonActionsBlocked());
        writer.writeEnumValue("kioskCustomizationStatusBar", this.getKioskCustomizationStatusBar());
        writer.writeBooleanValue("kioskCustomizationSystemErrorWarnings", this.getKioskCustomizationSystemErrorWarnings());
        writer.writeEnumValue("kioskCustomizationSystemNavigation", this.getKioskCustomizationSystemNavigation());
        writer.writeBooleanValue("kioskModeAppOrderEnabled", this.getKioskModeAppOrderEnabled());
        writer.writeCollectionOfObjectValues("kioskModeAppPositions", this.getKioskModeAppPositions());
        writer.writeCollectionOfObjectValues("kioskModeApps", this.getKioskModeApps());
        writer.writeBooleanValue("kioskModeAppsInFolderOrderedByName", this.getKioskModeAppsInFolderOrderedByName());
        writer.writeBooleanValue("kioskModeBluetoothConfigurationEnabled", this.getKioskModeBluetoothConfigurationEnabled());
        writer.writeBooleanValue("kioskModeDebugMenuEasyAccessEnabled", this.getKioskModeDebugMenuEasyAccessEnabled());
        writer.writeStringValue("kioskModeExitCode", this.getKioskModeExitCode());
        writer.writeBooleanValue("kioskModeFlashlightConfigurationEnabled", this.getKioskModeFlashlightConfigurationEnabled());
        writer.writeEnumValue("kioskModeFolderIcon", this.getKioskModeFolderIcon());
        writer.writeIntegerValue("kioskModeGridHeight", this.getKioskModeGridHeight());
        writer.writeIntegerValue("kioskModeGridWidth", this.getKioskModeGridWidth());
        writer.writeEnumValue("kioskModeIconSize", this.getKioskModeIconSize());
        writer.writeBooleanValue("kioskModeLockHomeScreen", this.getKioskModeLockHomeScreen());
        writer.writeCollectionOfObjectValues("kioskModeManagedFolders", this.getKioskModeManagedFolders());
        writer.writeBooleanValue("kioskModeManagedHomeScreenAutoSignout", this.getKioskModeManagedHomeScreenAutoSignout());
        writer.writeIntegerValue("kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds", this.getKioskModeManagedHomeScreenInactiveSignOutDelayInSeconds());
        writer.writeIntegerValue("kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds", this.getKioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds());
        writer.writeEnumValue("kioskModeManagedHomeScreenPinComplexity", this.getKioskModeManagedHomeScreenPinComplexity());
        writer.writeBooleanValue("kioskModeManagedHomeScreenPinRequired", this.getKioskModeManagedHomeScreenPinRequired());
        writer.writeBooleanValue("kioskModeManagedHomeScreenPinRequiredToResume", this.getKioskModeManagedHomeScreenPinRequiredToResume());
        writer.writeStringValue("kioskModeManagedHomeScreenSignInBackground", this.getKioskModeManagedHomeScreenSignInBackground());
        writer.writeStringValue("kioskModeManagedHomeScreenSignInBrandingLogo", this.getKioskModeManagedHomeScreenSignInBrandingLogo());
        writer.writeBooleanValue("kioskModeManagedHomeScreenSignInEnabled", this.getKioskModeManagedHomeScreenSignInEnabled());
        writer.writeBooleanValue("kioskModeManagedSettingsEntryDisabled", this.getKioskModeManagedSettingsEntryDisabled());
        writer.writeBooleanValue("kioskModeMediaVolumeConfigurationEnabled", this.getKioskModeMediaVolumeConfigurationEnabled());
        writer.writeEnumValue("kioskModeScreenOrientation", this.getKioskModeScreenOrientation());
        writer.writeBooleanValue("kioskModeScreenSaverConfigurationEnabled", this.getKioskModeScreenSaverConfigurationEnabled());
        writer.writeBooleanValue("kioskModeScreenSaverDetectMediaDisabled", this.getKioskModeScreenSaverDetectMediaDisabled());
        writer.writeIntegerValue("kioskModeScreenSaverDisplayTimeInSeconds", this.getKioskModeScreenSaverDisplayTimeInSeconds());
        writer.writeStringValue("kioskModeScreenSaverImageUrl", this.getKioskModeScreenSaverImageUrl());
        writer.writeIntegerValue("kioskModeScreenSaverStartDelayInSeconds", this.getKioskModeScreenSaverStartDelayInSeconds());
        writer.writeBooleanValue("kioskModeShowAppNotificationBadge", this.getKioskModeShowAppNotificationBadge());
        writer.writeBooleanValue("kioskModeShowDeviceInfo", this.getKioskModeShowDeviceInfo());
        writer.writeEnumValue("kioskModeUseManagedHomeScreenApp", this.getKioskModeUseManagedHomeScreenApp());
        writer.writeBooleanValue("kioskModeVirtualHomeButtonEnabled", this.getKioskModeVirtualHomeButtonEnabled());
        writer.writeEnumValue("kioskModeVirtualHomeButtonType", this.getKioskModeVirtualHomeButtonType());
        writer.writeStringValue("kioskModeWallpaperUrl", this.getKioskModeWallpaperUrl());
        writer.writeCollectionOfPrimitiveValues("kioskModeWifiAllowedSsids", this.getKioskModeWifiAllowedSsids());
        writer.writeBooleanValue("kioskModeWiFiConfigurationEnabled", this.getKioskModeWiFiConfigurationEnabled());
        writer.writeBooleanValue("microphoneForceMute", this.getMicrophoneForceMute());
        writer.writeBooleanValue("microsoftLauncherConfigurationEnabled", this.getMicrosoftLauncherConfigurationEnabled());
        writer.writeBooleanValue("microsoftLauncherCustomWallpaperAllowUserModification", this.getMicrosoftLauncherCustomWallpaperAllowUserModification());
        writer.writeBooleanValue("microsoftLauncherCustomWallpaperEnabled", this.getMicrosoftLauncherCustomWallpaperEnabled());
        writer.writeStringValue("microsoftLauncherCustomWallpaperImageUrl", this.getMicrosoftLauncherCustomWallpaperImageUrl());
        writer.writeBooleanValue("microsoftLauncherDockPresenceAllowUserModification", this.getMicrosoftLauncherDockPresenceAllowUserModification());
        writer.writeEnumValue("microsoftLauncherDockPresenceConfiguration", this.getMicrosoftLauncherDockPresenceConfiguration());
        writer.writeBooleanValue("microsoftLauncherFeedAllowUserModification", this.getMicrosoftLauncherFeedAllowUserModification());
        writer.writeBooleanValue("microsoftLauncherFeedEnabled", this.getMicrosoftLauncherFeedEnabled());
        writer.writeEnumValue("microsoftLauncherSearchBarPlacementConfiguration", this.getMicrosoftLauncherSearchBarPlacementConfiguration());
        writer.writeBooleanValue("networkEscapeHatchAllowed", this.getNetworkEscapeHatchAllowed());
        writer.writeBooleanValue("nfcBlockOutgoingBeam", this.getNfcBlockOutgoingBeam());
        writer.writeBooleanValue("passwordBlockKeyguard", this.getPasswordBlockKeyguard());
        writer.writeCollectionOfEnumValues("passwordBlockKeyguardFeatures", this.getPasswordBlockKeyguardFeatures());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinimumLetterCharacters", this.getPasswordMinimumLetterCharacters());
        writer.writeIntegerValue("passwordMinimumLowerCaseCharacters", this.getPasswordMinimumLowerCaseCharacters());
        writer.writeIntegerValue("passwordMinimumNonLetterCharacters", this.getPasswordMinimumNonLetterCharacters());
        writer.writeIntegerValue("passwordMinimumNumericCharacters", this.getPasswordMinimumNumericCharacters());
        writer.writeIntegerValue("passwordMinimumSymbolCharacters", this.getPasswordMinimumSymbolCharacters());
        writer.writeIntegerValue("passwordMinimumUpperCaseCharacters", this.getPasswordMinimumUpperCaseCharacters());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeScreenTimeout", this.getPasswordMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("passwordPreviousPasswordCountToBlock", this.getPasswordPreviousPasswordCountToBlock());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeEnumValue("passwordRequireUnlock", this.getPasswordRequireUnlock());
        writer.writeIntegerValue("passwordSignInFailureCountBeforeFactoryReset", this.getPasswordSignInFailureCountBeforeFactoryReset());
        writer.writeBooleanValue("personalProfileAppsAllowInstallFromUnknownSources", this.getPersonalProfileAppsAllowInstallFromUnknownSources());
        writer.writeBooleanValue("personalProfileCameraBlocked", this.getPersonalProfileCameraBlocked());
        writer.writeCollectionOfObjectValues("personalProfilePersonalApplications", this.getPersonalProfilePersonalApplications());
        writer.writeEnumValue("personalProfilePlayStoreMode", this.getPersonalProfilePlayStoreMode());
        writer.writeBooleanValue("personalProfileScreenCaptureBlocked", this.getPersonalProfileScreenCaptureBlocked());
        writer.writeEnumValue("playStoreMode", this.getPlayStoreMode());
        writer.writeBooleanValue("screenCaptureBlocked", this.getScreenCaptureBlocked());
        writer.writeBooleanValue("securityCommonCriteriaModeEnabled", this.getSecurityCommonCriteriaModeEnabled());
        writer.writeBooleanValue("securityDeveloperSettingsEnabled", this.getSecurityDeveloperSettingsEnabled());
        writer.writeBooleanValue("securityRequireVerifyApps", this.getSecurityRequireVerifyApps());
        writer.writeObjectValue("shortHelpText", this.getShortHelpText());
        writer.writeBooleanValue("statusBarBlocked", this.getStatusBarBlocked());
        writer.writeCollectionOfEnumValues("stayOnModes", this.getStayOnModes());
        writer.writeBooleanValue("storageAllowUsb", this.getStorageAllowUsb());
        writer.writeBooleanValue("storageBlockExternalMedia", this.getStorageBlockExternalMedia());
        writer.writeBooleanValue("storageBlockUsbFileTransfer", this.getStorageBlockUsbFileTransfer());
        writer.writeCollectionOfObjectValues("systemUpdateFreezePeriods", this.getSystemUpdateFreezePeriods());
        writer.writeEnumValue("systemUpdateInstallType", this.getSystemUpdateInstallType());
        writer.writeIntegerValue("systemUpdateWindowEndMinutesAfterMidnight", this.getSystemUpdateWindowEndMinutesAfterMidnight());
        writer.writeIntegerValue("systemUpdateWindowStartMinutesAfterMidnight", this.getSystemUpdateWindowStartMinutesAfterMidnight());
        writer.writeBooleanValue("systemWindowsBlocked", this.getSystemWindowsBlocked());
        writer.writeBooleanValue("usersBlockAdd", this.getUsersBlockAdd());
        writer.writeBooleanValue("usersBlockRemove", this.getUsersBlockRemove());
        writer.writeBooleanValue("volumeBlockAdjustment", this.getVolumeBlockAdjustment());
        writer.writeBooleanValue("vpnAlwaysOnLockdownMode", this.getVpnAlwaysOnLockdownMode());
        writer.writeStringValue("vpnAlwaysOnPackageIdentifier", this.getVpnAlwaysOnPackageIdentifier());
        writer.writeBooleanValue("wifiBlockEditConfigurations", this.getWifiBlockEditConfigurations());
        writer.writeBooleanValue("wifiBlockEditPolicyDefinedConfigurations", this.getWifiBlockEditPolicyDefinedConfigurations());
        writer.writeIntegerValue("workProfilePasswordExpirationDays", this.getWorkProfilePasswordExpirationDays());
        writer.writeIntegerValue("workProfilePasswordMinimumLength", this.getWorkProfilePasswordMinimumLength());
        writer.writeIntegerValue("workProfilePasswordMinimumLetterCharacters", this.getWorkProfilePasswordMinimumLetterCharacters());
        writer.writeIntegerValue("workProfilePasswordMinimumLowerCaseCharacters", this.getWorkProfilePasswordMinimumLowerCaseCharacters());
        writer.writeIntegerValue("workProfilePasswordMinimumNonLetterCharacters", this.getWorkProfilePasswordMinimumNonLetterCharacters());
        writer.writeIntegerValue("workProfilePasswordMinimumNumericCharacters", this.getWorkProfilePasswordMinimumNumericCharacters());
        writer.writeIntegerValue("workProfilePasswordMinimumSymbolCharacters", this.getWorkProfilePasswordMinimumSymbolCharacters());
        writer.writeIntegerValue("workProfilePasswordMinimumUpperCaseCharacters", this.getWorkProfilePasswordMinimumUpperCaseCharacters());
        writer.writeIntegerValue("workProfilePasswordPreviousPasswordCountToBlock", this.getWorkProfilePasswordPreviousPasswordCountToBlock());
        writer.writeEnumValue("workProfilePasswordRequiredType", this.getWorkProfilePasswordRequiredType());
        writer.writeEnumValue("workProfilePasswordRequireUnlock", this.getWorkProfilePasswordRequireUnlock());
        writer.writeIntegerValue("workProfilePasswordSignInFailureCountBeforeFactoryReset", this.getWorkProfilePasswordSignInFailureCountBeforeFactoryReset());
    }
    /**
     * Sets the accountsBlockModification property value. Indicates whether or not adding or removing accounts is disabled.
     * @param value Value to set for the accountsBlockModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountsBlockModification(@javax.annotation.Nullable final Boolean value) {
        this._accountsBlockModification = value;
    }
    /**
     * Sets the appsAllowInstallFromUnknownSources property value. Indicates whether or not the user is allowed to enable to unknown sources setting.
     * @param value Value to set for the appsAllowInstallFromUnknownSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsAllowInstallFromUnknownSources(@javax.annotation.Nullable final Boolean value) {
        this._appsAllowInstallFromUnknownSources = value;
    }
    /**
     * Sets the appsAutoUpdatePolicy property value. Indicates the value of the app auto update policy. Possible values are: notConfigured, userChoice, never, wiFiOnly, always.
     * @param value Value to set for the appsAutoUpdatePolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsAutoUpdatePolicy(@javax.annotation.Nullable final AndroidDeviceOwnerAppAutoUpdatePolicyType value) {
        this._appsAutoUpdatePolicy = value;
    }
    /**
     * Sets the appsDefaultPermissionPolicy property value. Indicates the permission policy for requests for runtime permissions if one is not defined for the app specifically. Possible values are: deviceDefault, prompt, autoGrant, autoDeny.
     * @param value Value to set for the appsDefaultPermissionPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsDefaultPermissionPolicy(@javax.annotation.Nullable final AndroidDeviceOwnerDefaultAppPermissionPolicyType value) {
        this._appsDefaultPermissionPolicy = value;
    }
    /**
     * Sets the appsRecommendSkippingFirstUseHints property value. Whether or not to recommend all apps skip any first-time-use hints they may have added.
     * @param value Value to set for the appsRecommendSkippingFirstUseHints property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsRecommendSkippingFirstUseHints(@javax.annotation.Nullable final Boolean value) {
        this._appsRecommendSkippingFirstUseHints = value;
    }
    /**
     * Sets the azureAdSharedDeviceDataClearApps property value. A list of managed apps that will have their data cleared during a global sign-out in AAD shared device mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the azureAdSharedDeviceDataClearApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureAdSharedDeviceDataClearApps(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._azureAdSharedDeviceDataClearApps = value;
    }
    /**
     * Sets the bluetoothBlockConfiguration property value. Indicates whether or not to block a user from configuring bluetooth.
     * @param value Value to set for the bluetoothBlockConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockConfiguration(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlockConfiguration = value;
    }
    /**
     * Sets the bluetoothBlockContactSharing property value. Indicates whether or not to block a user from sharing contacts via bluetooth.
     * @param value Value to set for the bluetoothBlockContactSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockContactSharing(@javax.annotation.Nullable final Boolean value) {
        this._bluetoothBlockContactSharing = value;
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to disable the use of the camera.
     * @param value Value to set for the cameraBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this._cameraBlocked = value;
    }
    /**
     * Sets the cellularBlockWiFiTethering property value. Indicates whether or not to block Wi-Fi tethering.
     * @param value Value to set for the cellularBlockWiFiTethering property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockWiFiTethering(@javax.annotation.Nullable final Boolean value) {
        this._cellularBlockWiFiTethering = value;
    }
    /**
     * Sets the certificateCredentialConfigurationDisabled property value. Indicates whether or not to block users from any certificate credential configuration.
     * @param value Value to set for the certificateCredentialConfigurationDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateCredentialConfigurationDisabled(@javax.annotation.Nullable final Boolean value) {
        this._certificateCredentialConfigurationDisabled = value;
    }
    /**
     * Sets the crossProfilePoliciesAllowCopyPaste property value. Indicates whether or not text copied from one profile (personal or work) can be pasted in the other.
     * @param value Value to set for the crossProfilePoliciesAllowCopyPaste property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCrossProfilePoliciesAllowCopyPaste(@javax.annotation.Nullable final Boolean value) {
        this._crossProfilePoliciesAllowCopyPaste = value;
    }
    /**
     * Sets the crossProfilePoliciesAllowDataSharing property value. Indicates whether data from one profile (personal or work) can be shared with apps in the other profile. Possible values are: notConfigured, crossProfileDataSharingBlocked, dataSharingFromWorkToPersonalBlocked, crossProfileDataSharingAllowed, unkownFutureValue.
     * @param value Value to set for the crossProfilePoliciesAllowDataSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCrossProfilePoliciesAllowDataSharing(@javax.annotation.Nullable final AndroidDeviceOwnerCrossProfileDataSharing value) {
        this._crossProfilePoliciesAllowDataSharing = value;
    }
    /**
     * Sets the crossProfilePoliciesShowWorkContactsInPersonalProfile property value. Indicates whether or not contacts stored in work profile are shown in personal profile contact searches/incoming calls.
     * @param value Value to set for the crossProfilePoliciesShowWorkContactsInPersonalProfile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCrossProfilePoliciesShowWorkContactsInPersonalProfile(@javax.annotation.Nullable final Boolean value) {
        this._crossProfilePoliciesShowWorkContactsInPersonalProfile = value;
    }
    /**
     * Sets the dataRoamingBlocked property value. Indicates whether or not to block a user from data roaming.
     * @param value Value to set for the dataRoamingBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataRoamingBlocked(@javax.annotation.Nullable final Boolean value) {
        this._dataRoamingBlocked = value;
    }
    /**
     * Sets the dateTimeConfigurationBlocked property value. Indicates whether or not to block the user from manually changing the date or time on the device
     * @param value Value to set for the dateTimeConfigurationBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDateTimeConfigurationBlocked(@javax.annotation.Nullable final Boolean value) {
        this._dateTimeConfigurationBlocked = value;
    }
    /**
     * Sets the detailedHelpText property value. Represents the customized detailed help text provided to users when they attempt to modify managed settings on their device.
     * @param value Value to set for the detailedHelpText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetailedHelpText(@javax.annotation.Nullable final AndroidDeviceOwnerUserFacingMessage value) {
        this._detailedHelpText = value;
    }
    /**
     * Sets the deviceOwnerLockScreenMessage property value. Represents the customized lock screen message provided to users when they attempt to modify managed settings on their device.
     * @param value Value to set for the deviceOwnerLockScreenMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceOwnerLockScreenMessage(@javax.annotation.Nullable final AndroidDeviceOwnerUserFacingMessage value) {
        this._deviceOwnerLockScreenMessage = value;
    }
    /**
     * Sets the enrollmentProfile property value. Android Device Owner Enrollment Profile types.
     * @param value Value to set for the enrollmentProfile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentProfile(@javax.annotation.Nullable final AndroidDeviceOwnerEnrollmentProfileType value) {
        this._enrollmentProfile = value;
    }
    /**
     * Sets the factoryResetBlocked property value. Indicates whether or not the factory reset option in settings is disabled.
     * @param value Value to set for the factoryResetBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFactoryResetBlocked(@javax.annotation.Nullable final Boolean value) {
        this._factoryResetBlocked = value;
    }
    /**
     * Sets the factoryResetDeviceAdministratorEmails property value. List of Google account emails that will be required to authenticate after a device is factory reset before it can be set up.
     * @param value Value to set for the factoryResetDeviceAdministratorEmails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFactoryResetDeviceAdministratorEmails(@javax.annotation.Nullable final java.util.List<String> value) {
        this._factoryResetDeviceAdministratorEmails = value;
    }
    /**
     * Sets the globalProxy property value. Proxy is set up directly with host, port and excluded hosts.
     * @param value Value to set for the globalProxy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGlobalProxy(@javax.annotation.Nullable final AndroidDeviceOwnerGlobalProxy value) {
        this._globalProxy = value;
    }
    /**
     * Sets the googleAccountsBlocked property value. Indicates whether or not google accounts will be blocked.
     * @param value Value to set for the googleAccountsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGoogleAccountsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._googleAccountsBlocked = value;
    }
    /**
     * Sets the kioskCustomizationDeviceSettingsBlocked property value. Indicateswhether a user can access the device's Settings app while in Kiosk Mode.
     * @param value Value to set for the kioskCustomizationDeviceSettingsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskCustomizationDeviceSettingsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._kioskCustomizationDeviceSettingsBlocked = value;
    }
    /**
     * Sets the kioskCustomizationPowerButtonActionsBlocked property value. Whether the power menu is shown when a user long presses the Power button of a device in Kiosk Mode.
     * @param value Value to set for the kioskCustomizationPowerButtonActionsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskCustomizationPowerButtonActionsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._kioskCustomizationPowerButtonActionsBlocked = value;
    }
    /**
     * Sets the kioskCustomizationStatusBar property value. Indicates whether system info and notifications are disabled in Kiosk Mode. Possible values are: notConfigured, notificationsAndSystemInfoEnabled, systemInfoOnly.
     * @param value Value to set for the kioskCustomizationStatusBar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskCustomizationStatusBar(@javax.annotation.Nullable final AndroidDeviceOwnerKioskCustomizationStatusBar value) {
        this._kioskCustomizationStatusBar = value;
    }
    /**
     * Sets the kioskCustomizationSystemErrorWarnings property value. Indicates whether system error dialogs for crashed or unresponsive apps are shown in Kiosk Mode.
     * @param value Value to set for the kioskCustomizationSystemErrorWarnings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskCustomizationSystemErrorWarnings(@javax.annotation.Nullable final Boolean value) {
        this._kioskCustomizationSystemErrorWarnings = value;
    }
    /**
     * Sets the kioskCustomizationSystemNavigation property value. Indicates which navigation features are enabled in Kiosk Mode. Possible values are: notConfigured, navigationEnabled, homeButtonOnly.
     * @param value Value to set for the kioskCustomizationSystemNavigation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskCustomizationSystemNavigation(@javax.annotation.Nullable final AndroidDeviceOwnerKioskCustomizationSystemNavigation value) {
        this._kioskCustomizationSystemNavigation = value;
    }
    /**
     * Sets the kioskModeAppOrderEnabled property value. Whether or not to enable app ordering in Kiosk Mode.
     * @param value Value to set for the kioskModeAppOrderEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAppOrderEnabled(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeAppOrderEnabled = value;
    }
    /**
     * Sets the kioskModeAppPositions property value. The ordering of items on Kiosk Mode Managed Home Screen. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeAppPositions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAppPositions(@javax.annotation.Nullable final java.util.List<AndroidDeviceOwnerKioskModeAppPositionItem> value) {
        this._kioskModeAppPositions = value;
    }
    /**
     * Sets the kioskModeApps property value. A list of managed apps that will be shown when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeApps(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._kioskModeApps = value;
    }
    /**
     * Sets the kioskModeAppsInFolderOrderedByName property value. Whether or not to alphabetize applications within a folder in Kiosk Mode.
     * @param value Value to set for the kioskModeAppsInFolderOrderedByName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAppsInFolderOrderedByName(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeAppsInFolderOrderedByName = value;
    }
    /**
     * Sets the kioskModeBluetoothConfigurationEnabled property value. Whether or not to allow a user to configure Bluetooth settings in Kiosk Mode.
     * @param value Value to set for the kioskModeBluetoothConfigurationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeBluetoothConfigurationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeBluetoothConfigurationEnabled = value;
    }
    /**
     * Sets the kioskModeDebugMenuEasyAccessEnabled property value. Whether or not to allow a user to easy access to the debug menu in Kiosk Mode.
     * @param value Value to set for the kioskModeDebugMenuEasyAccessEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeDebugMenuEasyAccessEnabled(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeDebugMenuEasyAccessEnabled = value;
    }
    /**
     * Sets the kioskModeExitCode property value. Exit code to allow a user to escape from Kiosk Mode when the device is in Kiosk Mode.
     * @param value Value to set for the kioskModeExitCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeExitCode(@javax.annotation.Nullable final String value) {
        this._kioskModeExitCode = value;
    }
    /**
     * Sets the kioskModeFlashlightConfigurationEnabled property value. Whether or not to allow a user to use the flashlight in Kiosk Mode.
     * @param value Value to set for the kioskModeFlashlightConfigurationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeFlashlightConfigurationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeFlashlightConfigurationEnabled = value;
    }
    /**
     * Sets the kioskModeFolderIcon property value. Folder icon configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, darkSquare, darkCircle, lightSquare, lightCircle.
     * @param value Value to set for the kioskModeFolderIcon property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeFolderIcon(@javax.annotation.Nullable final AndroidDeviceOwnerKioskModeFolderIcon value) {
        this._kioskModeFolderIcon = value;
    }
    /**
     * Sets the kioskModeGridHeight property value. Number of rows for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999
     * @param value Value to set for the kioskModeGridHeight property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeGridHeight(@javax.annotation.Nullable final Integer value) {
        this._kioskModeGridHeight = value;
    }
    /**
     * Sets the kioskModeGridWidth property value. Number of columns for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999
     * @param value Value to set for the kioskModeGridWidth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeGridWidth(@javax.annotation.Nullable final Integer value) {
        this._kioskModeGridWidth = value;
    }
    /**
     * Sets the kioskModeIconSize property value. Icon size configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, smallest, small, regular, large, largest.
     * @param value Value to set for the kioskModeIconSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeIconSize(@javax.annotation.Nullable final AndroidDeviceOwnerKioskModeIconSize value) {
        this._kioskModeIconSize = value;
    }
    /**
     * Sets the kioskModeLockHomeScreen property value. Whether or not to lock home screen to the end user in Kiosk Mode.
     * @param value Value to set for the kioskModeLockHomeScreen property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeLockHomeScreen(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeLockHomeScreen = value;
    }
    /**
     * Sets the kioskModeManagedFolders property value. A list of managed folders for a device in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeManagedFolders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedFolders(@javax.annotation.Nullable final java.util.List<AndroidDeviceOwnerKioskModeManagedFolder> value) {
        this._kioskModeManagedFolders = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenAutoSignout property value. Whether or not to automatically sign-out of MHS and Shared device mode applications after inactive for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenAutoSignout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenAutoSignout(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeManagedHomeScreenAutoSignout = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds property value. Number of seconds to give user notice before automatically signing them out for Managed Home Screen. Valid values 0 to 9999999
     * @param value Value to set for the kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenInactiveSignOutDelayInSeconds(@javax.annotation.Nullable final Integer value) {
        this._kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds property value. Number of seconds device is inactive before automatically signing user out for Managed Home Screen. Valid values 0 to 9999999
     * @param value Value to set for the kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds(@javax.annotation.Nullable final Integer value) {
        this._kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenPinComplexity property value. Complexity of PIN for sign-in session for Managed Home Screen. Possible values are: notConfigured, simple, complex.
     * @param value Value to set for the kioskModeManagedHomeScreenPinComplexity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenPinComplexity(@javax.annotation.Nullable final KioskModeManagedHomeScreenPinComplexity value) {
        this._kioskModeManagedHomeScreenPinComplexity = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenPinRequired property value. Whether or not require user to set a PIN for sign-in session for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenPinRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenPinRequired(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeManagedHomeScreenPinRequired = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenPinRequiredToResume property value. Whether or not required user to enter session PIN if screensaver has appeared for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenPinRequiredToResume property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenPinRequiredToResume(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeManagedHomeScreenPinRequiredToResume = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenSignInBackground property value. Custom URL background for sign-in screen for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenSignInBackground property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenSignInBackground(@javax.annotation.Nullable final String value) {
        this._kioskModeManagedHomeScreenSignInBackground = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenSignInBrandingLogo property value. Custom URL branding logo for sign-in screen and session pin page for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenSignInBrandingLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenSignInBrandingLogo(@javax.annotation.Nullable final String value) {
        this._kioskModeManagedHomeScreenSignInBrandingLogo = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenSignInEnabled property value. Whether or not show sign-in screen for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenSignInEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenSignInEnabled(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeManagedHomeScreenSignInEnabled = value;
    }
    /**
     * Sets the kioskModeManagedSettingsEntryDisabled property value. Whether or not to display the Managed Settings entry point on the managed home screen in Kiosk Mode.
     * @param value Value to set for the kioskModeManagedSettingsEntryDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedSettingsEntryDisabled(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeManagedSettingsEntryDisabled = value;
    }
    /**
     * Sets the kioskModeMediaVolumeConfigurationEnabled property value. Whether or not to allow a user to change the media volume in Kiosk Mode.
     * @param value Value to set for the kioskModeMediaVolumeConfigurationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeMediaVolumeConfigurationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeMediaVolumeConfigurationEnabled = value;
    }
    /**
     * Sets the kioskModeScreenOrientation property value. Screen orientation configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, portrait, landscape, autoRotate.
     * @param value Value to set for the kioskModeScreenOrientation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeScreenOrientation(@javax.annotation.Nullable final AndroidDeviceOwnerKioskModeScreenOrientation value) {
        this._kioskModeScreenOrientation = value;
    }
    /**
     * Sets the kioskModeScreenSaverConfigurationEnabled property value. Whether or not to enable screen saver mode or not in Kiosk Mode.
     * @param value Value to set for the kioskModeScreenSaverConfigurationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeScreenSaverConfigurationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeScreenSaverConfigurationEnabled = value;
    }
    /**
     * Sets the kioskModeScreenSaverDetectMediaDisabled property value. Whether or not the device screen should show the screen saver if audio/video is playing in Kiosk Mode.
     * @param value Value to set for the kioskModeScreenSaverDetectMediaDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeScreenSaverDetectMediaDisabled(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeScreenSaverDetectMediaDisabled = value;
    }
    /**
     * Sets the kioskModeScreenSaverDisplayTimeInSeconds property value. The number of seconds that the device will display the screen saver for in Kiosk Mode. Valid values 0 to 9999999
     * @param value Value to set for the kioskModeScreenSaverDisplayTimeInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeScreenSaverDisplayTimeInSeconds(@javax.annotation.Nullable final Integer value) {
        this._kioskModeScreenSaverDisplayTimeInSeconds = value;
    }
    /**
     * Sets the kioskModeScreenSaverImageUrl property value. URL for an image that will be the device's screen saver in Kiosk Mode.
     * @param value Value to set for the kioskModeScreenSaverImageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeScreenSaverImageUrl(@javax.annotation.Nullable final String value) {
        this._kioskModeScreenSaverImageUrl = value;
    }
    /**
     * Sets the kioskModeScreenSaverStartDelayInSeconds property value. The number of seconds the device needs to be inactive for before the screen saver is shown in Kiosk Mode. Valid values 1 to 9999999
     * @param value Value to set for the kioskModeScreenSaverStartDelayInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeScreenSaverStartDelayInSeconds(@javax.annotation.Nullable final Integer value) {
        this._kioskModeScreenSaverStartDelayInSeconds = value;
    }
    /**
     * Sets the kioskModeShowAppNotificationBadge property value. Whether or not to display application notification badges in Kiosk Mode.
     * @param value Value to set for the kioskModeShowAppNotificationBadge property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeShowAppNotificationBadge(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeShowAppNotificationBadge = value;
    }
    /**
     * Sets the kioskModeShowDeviceInfo property value. Whether or not to allow a user to access basic device information.
     * @param value Value to set for the kioskModeShowDeviceInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeShowDeviceInfo(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeShowDeviceInfo = value;
    }
    /**
     * Sets the kioskModeUseManagedHomeScreenApp property value. Whether or not to use single app kiosk mode or multi-app kiosk mode. Possible values are: notConfigured, singleAppMode, multiAppMode.
     * @param value Value to set for the kioskModeUseManagedHomeScreenApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeUseManagedHomeScreenApp(@javax.annotation.Nullable final KioskModeType value) {
        this._kioskModeUseManagedHomeScreenApp = value;
    }
    /**
     * Sets the kioskModeVirtualHomeButtonEnabled property value. Whether or not to display a virtual home button when the device is in Kiosk Mode.
     * @param value Value to set for the kioskModeVirtualHomeButtonEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeVirtualHomeButtonEnabled(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeVirtualHomeButtonEnabled = value;
    }
    /**
     * Sets the kioskModeVirtualHomeButtonType property value. Indicates whether the virtual home button is a swipe up home button or a floating home button. Possible values are: notConfigured, swipeUp, floating.
     * @param value Value to set for the kioskModeVirtualHomeButtonType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeVirtualHomeButtonType(@javax.annotation.Nullable final AndroidDeviceOwnerVirtualHomeButtonType value) {
        this._kioskModeVirtualHomeButtonType = value;
    }
    /**
     * Sets the kioskModeWallpaperUrl property value. URL to a publicly accessible image to use for the wallpaper when the device is in Kiosk Mode.
     * @param value Value to set for the kioskModeWallpaperUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeWallpaperUrl(@javax.annotation.Nullable final String value) {
        this._kioskModeWallpaperUrl = value;
    }
    /**
     * Sets the kioskModeWifiAllowedSsids property value. The restricted set of WIFI SSIDs available for the user to configure in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeWifiAllowedSsids property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeWifiAllowedSsids(@javax.annotation.Nullable final java.util.List<String> value) {
        this._kioskModeWifiAllowedSsids = value;
    }
    /**
     * Sets the kioskModeWiFiConfigurationEnabled property value. Whether or not to allow a user to configure Wi-Fi settings in Kiosk Mode.
     * @param value Value to set for the kioskModeWiFiConfigurationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeWiFiConfigurationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._kioskModeWiFiConfigurationEnabled = value;
    }
    /**
     * Sets the microphoneForceMute property value. Indicates whether or not to block unmuting the microphone on the device.
     * @param value Value to set for the microphoneForceMute property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrophoneForceMute(@javax.annotation.Nullable final Boolean value) {
        this._microphoneForceMute = value;
    }
    /**
     * Sets the microsoftLauncherConfigurationEnabled property value. Indicates whether or not to you want configure Microsoft Launcher.
     * @param value Value to set for the microsoftLauncherConfigurationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherConfigurationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._microsoftLauncherConfigurationEnabled = value;
    }
    /**
     * Sets the microsoftLauncherCustomWallpaperAllowUserModification property value. Indicates whether or not the user can modify the wallpaper to personalize their device.
     * @param value Value to set for the microsoftLauncherCustomWallpaperAllowUserModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherCustomWallpaperAllowUserModification(@javax.annotation.Nullable final Boolean value) {
        this._microsoftLauncherCustomWallpaperAllowUserModification = value;
    }
    /**
     * Sets the microsoftLauncherCustomWallpaperEnabled property value. Indicates whether or not to configure the wallpaper on the targeted devices.
     * @param value Value to set for the microsoftLauncherCustomWallpaperEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherCustomWallpaperEnabled(@javax.annotation.Nullable final Boolean value) {
        this._microsoftLauncherCustomWallpaperEnabled = value;
    }
    /**
     * Sets the microsoftLauncherCustomWallpaperImageUrl property value. Indicates the URL for the image file to use as the wallpaper on the targeted devices.
     * @param value Value to set for the microsoftLauncherCustomWallpaperImageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherCustomWallpaperImageUrl(@javax.annotation.Nullable final String value) {
        this._microsoftLauncherCustomWallpaperImageUrl = value;
    }
    /**
     * Sets the microsoftLauncherDockPresenceAllowUserModification property value. Indicates whether or not the user can modify the device dock configuration on the device.
     * @param value Value to set for the microsoftLauncherDockPresenceAllowUserModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherDockPresenceAllowUserModification(@javax.annotation.Nullable final Boolean value) {
        this._microsoftLauncherDockPresenceAllowUserModification = value;
    }
    /**
     * Sets the microsoftLauncherDockPresenceConfiguration property value. Indicates whether or not you want to configure the device dock. Possible values are: notConfigured, show, hide, disabled.
     * @param value Value to set for the microsoftLauncherDockPresenceConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherDockPresenceConfiguration(@javax.annotation.Nullable final MicrosoftLauncherDockPresence value) {
        this._microsoftLauncherDockPresenceConfiguration = value;
    }
    /**
     * Sets the microsoftLauncherFeedAllowUserModification property value. Indicates whether or not the user can modify the launcher feed on the device.
     * @param value Value to set for the microsoftLauncherFeedAllowUserModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherFeedAllowUserModification(@javax.annotation.Nullable final Boolean value) {
        this._microsoftLauncherFeedAllowUserModification = value;
    }
    /**
     * Sets the microsoftLauncherFeedEnabled property value. Indicates whether or not you want to enable the launcher feed on the device.
     * @param value Value to set for the microsoftLauncherFeedEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherFeedEnabled(@javax.annotation.Nullable final Boolean value) {
        this._microsoftLauncherFeedEnabled = value;
    }
    /**
     * Sets the microsoftLauncherSearchBarPlacementConfiguration property value. Indicates the search bar placement configuration on the device. Possible values are: notConfigured, top, bottom, hide.
     * @param value Value to set for the microsoftLauncherSearchBarPlacementConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherSearchBarPlacementConfiguration(@javax.annotation.Nullable final MicrosoftLauncherSearchBarPlacement value) {
        this._microsoftLauncherSearchBarPlacementConfiguration = value;
    }
    /**
     * Sets the networkEscapeHatchAllowed property value. Indicates whether or not the device will allow connecting to a temporary network connection at boot time.
     * @param value Value to set for the networkEscapeHatchAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkEscapeHatchAllowed(@javax.annotation.Nullable final Boolean value) {
        this._networkEscapeHatchAllowed = value;
    }
    /**
     * Sets the nfcBlockOutgoingBeam property value. Indicates whether or not to block NFC outgoing beam.
     * @param value Value to set for the nfcBlockOutgoingBeam property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNfcBlockOutgoingBeam(@javax.annotation.Nullable final Boolean value) {
        this._nfcBlockOutgoingBeam = value;
    }
    /**
     * Sets the passwordBlockKeyguard property value. Indicates whether or not the keyguard is disabled.
     * @param value Value to set for the passwordBlockKeyguard property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockKeyguard(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockKeyguard = value;
    }
    /**
     * Sets the passwordBlockKeyguardFeatures property value. List of device keyguard features to block. This collection can contain a maximum of 11 elements.
     * @param value Value to set for the passwordBlockKeyguardFeatures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockKeyguardFeatures(@javax.annotation.Nullable final java.util.List<AndroidKeyguardFeature> value) {
        this._passwordBlockKeyguardFeatures = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Indicates the amount of time that a password can be set for before it expires and a new password will be required. Valid values 1 to 365
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Indicates the minimum length of the password required on the device. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumLetterCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLetterCharacters(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLetterCharacters = value;
    }
    /**
     * Sets the passwordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumLowerCaseCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLowerCaseCharacters(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLowerCaseCharacters = value;
    }
    /**
     * Sets the passwordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumNonLetterCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumNonLetterCharacters(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumNonLetterCharacters = value;
    }
    /**
     * Sets the passwordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumNumericCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumNumericCharacters(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumNumericCharacters = value;
    }
    /**
     * Sets the passwordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumSymbolCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumSymbolCharacters(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumSymbolCharacters = value;
    }
    /**
     * Sets the passwordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumUpperCaseCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumUpperCaseCharacters(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumUpperCaseCharacters = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this._passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordPreviousPasswordCountToBlock property value. Indicates the length of password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24
     * @param value Value to set for the passwordPreviousPasswordCountToBlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordPreviousPasswordCountToBlock(@javax.annotation.Nullable final Integer value) {
        this._passwordPreviousPasswordCountToBlock = value;
    }
    /**
     * Sets the passwordRequiredType property value. Indicates the minimum password quality required on the device. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequiredType(@javax.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordType value) {
        this._passwordRequiredType = value;
    }
    /**
     * Sets the passwordRequireUnlock property value. Indicates the timeout period after which a device must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue.
     * @param value Value to set for the passwordRequireUnlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequireUnlock(@javax.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordUnlock value) {
        this._passwordRequireUnlock = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this._passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the personalProfileAppsAllowInstallFromUnknownSources property value. Indicates whether the user can install apps from unknown sources on the personal profile.
     * @param value Value to set for the personalProfileAppsAllowInstallFromUnknownSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalProfileAppsAllowInstallFromUnknownSources(@javax.annotation.Nullable final Boolean value) {
        this._personalProfileAppsAllowInstallFromUnknownSources = value;
    }
    /**
     * Sets the personalProfileCameraBlocked property value. Indicates whether to disable the use of the camera on the personal profile.
     * @param value Value to set for the personalProfileCameraBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalProfileCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this._personalProfileCameraBlocked = value;
    }
    /**
     * Sets the personalProfilePersonalApplications property value. Policy applied to applications in the personal profile. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the personalProfilePersonalApplications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalProfilePersonalApplications(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._personalProfilePersonalApplications = value;
    }
    /**
     * Sets the personalProfilePlayStoreMode property value. Used together with PersonalProfilePersonalApplications to control how apps in the personal profile are allowed or blocked. Possible values are: notConfigured, blockedApps, allowedApps.
     * @param value Value to set for the personalProfilePlayStoreMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalProfilePlayStoreMode(@javax.annotation.Nullable final PersonalProfilePersonalPlayStoreMode value) {
        this._personalProfilePlayStoreMode = value;
    }
    /**
     * Sets the personalProfileScreenCaptureBlocked property value. Indicates whether to disable the capability to take screenshots on the personal profile.
     * @param value Value to set for the personalProfileScreenCaptureBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalProfileScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this._personalProfileScreenCaptureBlocked = value;
    }
    /**
     * Sets the playStoreMode property value. Indicates the Play Store mode of the device. Possible values are: notConfigured, allowList, blockList.
     * @param value Value to set for the playStoreMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlayStoreMode(@javax.annotation.Nullable final AndroidDeviceOwnerPlayStoreMode value) {
        this._playStoreMode = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to disable the capability to take screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this._screenCaptureBlocked = value;
    }
    /**
     * Sets the securityCommonCriteriaModeEnabled property value. Represents the security common criteria mode enabled provided to users when they attempt to modify managed settings on their device.
     * @param value Value to set for the securityCommonCriteriaModeEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityCommonCriteriaModeEnabled(@javax.annotation.Nullable final Boolean value) {
        this._securityCommonCriteriaModeEnabled = value;
    }
    /**
     * Sets the securityDeveloperSettingsEnabled property value. Indicates whether or not the user is allowed to access developer settings like developer options and safe boot on the device.
     * @param value Value to set for the securityDeveloperSettingsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityDeveloperSettingsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._securityDeveloperSettingsEnabled = value;
    }
    /**
     * Sets the securityRequireVerifyApps property value. Indicates whether or not verify apps is required.
     * @param value Value to set for the securityRequireVerifyApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityRequireVerifyApps(@javax.annotation.Nullable final Boolean value) {
        this._securityRequireVerifyApps = value;
    }
    /**
     * Sets the shortHelpText property value. Represents the customized short help text provided to users when they attempt to modify managed settings on their device.
     * @param value Value to set for the shortHelpText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShortHelpText(@javax.annotation.Nullable final AndroidDeviceOwnerUserFacingMessage value) {
        this._shortHelpText = value;
    }
    /**
     * Sets the statusBarBlocked property value. Indicates whether or the status bar is disabled, including notifications, quick settings and other screen overlays.
     * @param value Value to set for the statusBarBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatusBarBlocked(@javax.annotation.Nullable final Boolean value) {
        this._statusBarBlocked = value;
    }
    /**
     * Sets the stayOnModes property value. List of modes in which the device's display will stay powered-on. This collection can contain a maximum of 4 elements.
     * @param value Value to set for the stayOnModes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStayOnModes(@javax.annotation.Nullable final java.util.List<AndroidDeviceOwnerBatteryPluggedMode> value) {
        this._stayOnModes = value;
    }
    /**
     * Sets the storageAllowUsb property value. Indicates whether or not to allow USB mass storage.
     * @param value Value to set for the storageAllowUsb property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageAllowUsb(@javax.annotation.Nullable final Boolean value) {
        this._storageAllowUsb = value;
    }
    /**
     * Sets the storageBlockExternalMedia property value. Indicates whether or not to block external media.
     * @param value Value to set for the storageBlockExternalMedia property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageBlockExternalMedia(@javax.annotation.Nullable final Boolean value) {
        this._storageBlockExternalMedia = value;
    }
    /**
     * Sets the storageBlockUsbFileTransfer property value. Indicates whether or not to block USB file transfer.
     * @param value Value to set for the storageBlockUsbFileTransfer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageBlockUsbFileTransfer(@javax.annotation.Nullable final Boolean value) {
        this._storageBlockUsbFileTransfer = value;
    }
    /**
     * Sets the systemUpdateFreezePeriods property value. Indicates the annually repeating time periods during which system updates are postponed. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the systemUpdateFreezePeriods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemUpdateFreezePeriods(@javax.annotation.Nullable final java.util.List<AndroidDeviceOwnerSystemUpdateFreezePeriod> value) {
        this._systemUpdateFreezePeriods = value;
    }
    /**
     * Sets the systemUpdateInstallType property value. The type of system update configuration. Possible values are: deviceDefault, postpone, windowed, automatic.
     * @param value Value to set for the systemUpdateInstallType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemUpdateInstallType(@javax.annotation.Nullable final AndroidDeviceOwnerSystemUpdateInstallType value) {
        this._systemUpdateInstallType = value;
    }
    /**
     * Sets the systemUpdateWindowEndMinutesAfterMidnight property value. Indicates the number of minutes after midnight that the system update window ends. Valid values 0 to 1440
     * @param value Value to set for the systemUpdateWindowEndMinutesAfterMidnight property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemUpdateWindowEndMinutesAfterMidnight(@javax.annotation.Nullable final Integer value) {
        this._systemUpdateWindowEndMinutesAfterMidnight = value;
    }
    /**
     * Sets the systemUpdateWindowStartMinutesAfterMidnight property value. Indicates the number of minutes after midnight that the system update window starts. Valid values 0 to 1440
     * @param value Value to set for the systemUpdateWindowStartMinutesAfterMidnight property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemUpdateWindowStartMinutesAfterMidnight(@javax.annotation.Nullable final Integer value) {
        this._systemUpdateWindowStartMinutesAfterMidnight = value;
    }
    /**
     * Sets the systemWindowsBlocked property value. Whether or not to block Android system prompt windows, like toasts, phone activities, and system alerts.
     * @param value Value to set for the systemWindowsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemWindowsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._systemWindowsBlocked = value;
    }
    /**
     * Sets the usersBlockAdd property value. Indicates whether or not adding users and profiles is disabled.
     * @param value Value to set for the usersBlockAdd property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsersBlockAdd(@javax.annotation.Nullable final Boolean value) {
        this._usersBlockAdd = value;
    }
    /**
     * Sets the usersBlockRemove property value. Indicates whether or not to disable removing other users from the device.
     * @param value Value to set for the usersBlockRemove property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsersBlockRemove(@javax.annotation.Nullable final Boolean value) {
        this._usersBlockRemove = value;
    }
    /**
     * Sets the volumeBlockAdjustment property value. Indicates whether or not adjusting the master volume is disabled.
     * @param value Value to set for the volumeBlockAdjustment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVolumeBlockAdjustment(@javax.annotation.Nullable final Boolean value) {
        this._volumeBlockAdjustment = value;
    }
    /**
     * Sets the vpnAlwaysOnLockdownMode property value. If an always on VPN package name is specified, whether or not to lock network traffic when that VPN is disconnected.
     * @param value Value to set for the vpnAlwaysOnLockdownMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVpnAlwaysOnLockdownMode(@javax.annotation.Nullable final Boolean value) {
        this._vpnAlwaysOnLockdownMode = value;
    }
    /**
     * Sets the vpnAlwaysOnPackageIdentifier property value. Android app package name for app that will handle an always-on VPN connection.
     * @param value Value to set for the vpnAlwaysOnPackageIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVpnAlwaysOnPackageIdentifier(@javax.annotation.Nullable final String value) {
        this._vpnAlwaysOnPackageIdentifier = value;
    }
    /**
     * Sets the wifiBlockEditConfigurations property value. Indicates whether or not to block the user from editing the wifi connection settings.
     * @param value Value to set for the wifiBlockEditConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiBlockEditConfigurations(@javax.annotation.Nullable final Boolean value) {
        this._wifiBlockEditConfigurations = value;
    }
    /**
     * Sets the wifiBlockEditPolicyDefinedConfigurations property value. Indicates whether or not to block the user from editing just the networks defined by the policy.
     * @param value Value to set for the wifiBlockEditPolicyDefinedConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiBlockEditPolicyDefinedConfigurations(@javax.annotation.Nullable final Boolean value) {
        this._wifiBlockEditPolicyDefinedConfigurations = value;
    }
    /**
     * Sets the workProfilePasswordExpirationDays property value. Indicates the number of days that a work profile password can be set before it expires and a new password will be required. Valid values 1 to 365
     * @param value Value to set for the workProfilePasswordExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordExpirationDays = value;
    }
    /**
     * Sets the workProfilePasswordMinimumLength property value. Indicates the minimum length of the work profile password. Valid values 4 to 16
     * @param value Value to set for the workProfilePasswordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinimumLength = value;
    }
    /**
     * Sets the workProfilePasswordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumLetterCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumLetterCharacters(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinimumLetterCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower-case characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumLowerCaseCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumLowerCaseCharacters(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinimumLowerCaseCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumNonLetterCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumNonLetterCharacters(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinimumNonLetterCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumNumericCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumNumericCharacters(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinimumNumericCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumSymbolCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumSymbolCharacters(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinimumSymbolCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper-case letter characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumUpperCaseCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumUpperCaseCharacters(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordMinimumUpperCaseCharacters = value;
    }
    /**
     * Sets the workProfilePasswordPreviousPasswordCountToBlock property value. Indicates the length of the work profile password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24
     * @param value Value to set for the workProfilePasswordPreviousPasswordCountToBlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordPreviousPasswordCountToBlock(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordPreviousPasswordCountToBlock = value;
    }
    /**
     * Sets the workProfilePasswordRequiredType property value. Indicates the minimum password quality required on the work profile password. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @param value Value to set for the workProfilePasswordRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordRequiredType(@javax.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordType value) {
        this._workProfilePasswordRequiredType = value;
    }
    /**
     * Sets the workProfilePasswordRequireUnlock property value. Indicates the timeout period after which a work profile must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue.
     * @param value Value to set for the workProfilePasswordRequireUnlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordRequireUnlock(@javax.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordUnlock value) {
        this._workProfilePasswordRequireUnlock = value;
    }
    /**
     * Sets the workProfilePasswordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect work profile password before the device is wiped. Valid values 4 to 11
     * @param value Value to set for the workProfilePasswordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this._workProfilePasswordSignInFailureCountBeforeFactoryReset = value;
    }
}
