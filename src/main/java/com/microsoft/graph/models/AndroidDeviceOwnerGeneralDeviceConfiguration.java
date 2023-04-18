package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceOwnerGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /** Indicates whether or not adding or removing accounts is disabled. */
    private Boolean accountsBlockModification;
    /** Indicates whether or not the user is allowed to enable to unknown sources setting. */
    private Boolean appsAllowInstallFromUnknownSources;
    /** Indicates the value of the app auto update policy. Possible values are: notConfigured, userChoice, never, wiFiOnly, always. */
    private AndroidDeviceOwnerAppAutoUpdatePolicyType appsAutoUpdatePolicy;
    /** Indicates the permission policy for requests for runtime permissions if one is not defined for the app specifically. Possible values are: deviceDefault, prompt, autoGrant, autoDeny. */
    private AndroidDeviceOwnerDefaultAppPermissionPolicyType appsDefaultPermissionPolicy;
    /** Whether or not to recommend all apps skip any first-time-use hints they may have added. */
    private Boolean appsRecommendSkippingFirstUseHints;
    /** A list of managed apps that will have their data cleared during a global sign-out in AAD shared device mode. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> azureAdSharedDeviceDataClearApps;
    /** Indicates whether or not to block a user from configuring bluetooth. */
    private Boolean bluetoothBlockConfiguration;
    /** Indicates whether or not to block a user from sharing contacts via bluetooth. */
    private Boolean bluetoothBlockContactSharing;
    /** Indicates whether or not to disable the use of the camera. */
    private Boolean cameraBlocked;
    /** Indicates whether or not to block Wi-Fi tethering. */
    private Boolean cellularBlockWiFiTethering;
    /** Indicates whether or not to block users from any certificate credential configuration. */
    private Boolean certificateCredentialConfigurationDisabled;
    /** Indicates whether or not text copied from one profile (personal or work) can be pasted in the other. */
    private Boolean crossProfilePoliciesAllowCopyPaste;
    /** Indicates whether data from one profile (personal or work) can be shared with apps in the other profile. Possible values are: notConfigured, crossProfileDataSharingBlocked, dataSharingFromWorkToPersonalBlocked, crossProfileDataSharingAllowed, unkownFutureValue. */
    private AndroidDeviceOwnerCrossProfileDataSharing crossProfilePoliciesAllowDataSharing;
    /** Indicates whether or not contacts stored in work profile are shown in personal profile contact searches/incoming calls. */
    private Boolean crossProfilePoliciesShowWorkContactsInPersonalProfile;
    /** Indicates whether or not to block a user from data roaming. */
    private Boolean dataRoamingBlocked;
    /** Indicates whether or not to block the user from manually changing the date or time on the device */
    private Boolean dateTimeConfigurationBlocked;
    /** Represents the customized detailed help text provided to users when they attempt to modify managed settings on their device. */
    private AndroidDeviceOwnerUserFacingMessage detailedHelpText;
    /** Represents the customized lock screen message provided to users when they attempt to modify managed settings on their device. */
    private AndroidDeviceOwnerUserFacingMessage deviceOwnerLockScreenMessage;
    /** Android Device Owner Enrollment Profile types. */
    private AndroidDeviceOwnerEnrollmentProfileType enrollmentProfile;
    /** Indicates whether or not the factory reset option in settings is disabled. */
    private Boolean factoryResetBlocked;
    /** List of Google account emails that will be required to authenticate after a device is factory reset before it can be set up. */
    private java.util.List<String> factoryResetDeviceAdministratorEmails;
    /** Proxy is set up directly with host, port and excluded hosts. */
    private AndroidDeviceOwnerGlobalProxy globalProxy;
    /** Indicates whether or not google accounts will be blocked. */
    private Boolean googleAccountsBlocked;
    /** Indicateswhether a user can access the device's Settings app while in Kiosk Mode. */
    private Boolean kioskCustomizationDeviceSettingsBlocked;
    /** Whether the power menu is shown when a user long presses the Power button of a device in Kiosk Mode. */
    private Boolean kioskCustomizationPowerButtonActionsBlocked;
    /** Indicates whether system info and notifications are disabled in Kiosk Mode. Possible values are: notConfigured, notificationsAndSystemInfoEnabled, systemInfoOnly. */
    private AndroidDeviceOwnerKioskCustomizationStatusBar kioskCustomizationStatusBar;
    /** Indicates whether system error dialogs for crashed or unresponsive apps are shown in Kiosk Mode. */
    private Boolean kioskCustomizationSystemErrorWarnings;
    /** Indicates which navigation features are enabled in Kiosk Mode. Possible values are: notConfigured, navigationEnabled, homeButtonOnly. */
    private AndroidDeviceOwnerKioskCustomizationSystemNavigation kioskCustomizationSystemNavigation;
    /** Whether or not to enable app ordering in Kiosk Mode. */
    private Boolean kioskModeAppOrderEnabled;
    /** The ordering of items on Kiosk Mode Managed Home Screen. This collection can contain a maximum of 500 elements. */
    private java.util.List<AndroidDeviceOwnerKioskModeAppPositionItem> kioskModeAppPositions;
    /** A list of managed apps that will be shown when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> kioskModeApps;
    /** Whether or not to alphabetize applications within a folder in Kiosk Mode. */
    private Boolean kioskModeAppsInFolderOrderedByName;
    /** Whether or not to allow a user to configure Bluetooth settings in Kiosk Mode. */
    private Boolean kioskModeBluetoothConfigurationEnabled;
    /** Whether or not to allow a user to easy access to the debug menu in Kiosk Mode. */
    private Boolean kioskModeDebugMenuEasyAccessEnabled;
    /** Exit code to allow a user to escape from Kiosk Mode when the device is in Kiosk Mode. */
    private String kioskModeExitCode;
    /** Whether or not to allow a user to use the flashlight in Kiosk Mode. */
    private Boolean kioskModeFlashlightConfigurationEnabled;
    /** Folder icon configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, darkSquare, darkCircle, lightSquare, lightCircle. */
    private AndroidDeviceOwnerKioskModeFolderIcon kioskModeFolderIcon;
    /** Number of rows for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999 */
    private Integer kioskModeGridHeight;
    /** Number of columns for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999 */
    private Integer kioskModeGridWidth;
    /** Icon size configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, smallest, small, regular, large, largest. */
    private AndroidDeviceOwnerKioskModeIconSize kioskModeIconSize;
    /** Whether or not to lock home screen to the end user in Kiosk Mode. */
    private Boolean kioskModeLockHomeScreen;
    /** A list of managed folders for a device in Kiosk Mode. This collection can contain a maximum of 500 elements. */
    private java.util.List<AndroidDeviceOwnerKioskModeManagedFolder> kioskModeManagedFolders;
    /** Whether or not to automatically sign-out of MHS and Shared device mode applications after inactive for Managed Home Screen. */
    private Boolean kioskModeManagedHomeScreenAutoSignout;
    /** Number of seconds to give user notice before automatically signing them out for Managed Home Screen. Valid values 0 to 9999999 */
    private Integer kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds;
    /** Number of seconds device is inactive before automatically signing user out for Managed Home Screen. Valid values 0 to 9999999 */
    private Integer kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds;
    /** Complexity of PIN for sign-in session for Managed Home Screen. Possible values are: notConfigured, simple, complex. */
    private KioskModeManagedHomeScreenPinComplexity kioskModeManagedHomeScreenPinComplexity;
    /** Whether or not require user to set a PIN for sign-in session for Managed Home Screen. */
    private Boolean kioskModeManagedHomeScreenPinRequired;
    /** Whether or not required user to enter session PIN if screensaver has appeared for Managed Home Screen. */
    private Boolean kioskModeManagedHomeScreenPinRequiredToResume;
    /** Custom URL background for sign-in screen for Managed Home Screen. */
    private String kioskModeManagedHomeScreenSignInBackground;
    /** Custom URL branding logo for sign-in screen and session pin page for Managed Home Screen. */
    private String kioskModeManagedHomeScreenSignInBrandingLogo;
    /** Whether or not show sign-in screen for Managed Home Screen. */
    private Boolean kioskModeManagedHomeScreenSignInEnabled;
    /** Whether or not to display the Managed Settings entry point on the managed home screen in Kiosk Mode. */
    private Boolean kioskModeManagedSettingsEntryDisabled;
    /** Whether or not to allow a user to change the media volume in Kiosk Mode. */
    private Boolean kioskModeMediaVolumeConfigurationEnabled;
    /** Screen orientation configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, portrait, landscape, autoRotate. */
    private AndroidDeviceOwnerKioskModeScreenOrientation kioskModeScreenOrientation;
    /** Whether or not to enable screen saver mode or not in Kiosk Mode. */
    private Boolean kioskModeScreenSaverConfigurationEnabled;
    /** Whether or not the device screen should show the screen saver if audio/video is playing in Kiosk Mode. */
    private Boolean kioskModeScreenSaverDetectMediaDisabled;
    /** The number of seconds that the device will display the screen saver for in Kiosk Mode. Valid values 0 to 9999999 */
    private Integer kioskModeScreenSaverDisplayTimeInSeconds;
    /** URL for an image that will be the device's screen saver in Kiosk Mode. */
    private String kioskModeScreenSaverImageUrl;
    /** The number of seconds the device needs to be inactive for before the screen saver is shown in Kiosk Mode. Valid values 1 to 9999999 */
    private Integer kioskModeScreenSaverStartDelayInSeconds;
    /** Whether or not to display application notification badges in Kiosk Mode. */
    private Boolean kioskModeShowAppNotificationBadge;
    /** Whether or not to allow a user to access basic device information. */
    private Boolean kioskModeShowDeviceInfo;
    /** Whether or not to use single app kiosk mode or multi-app kiosk mode. Possible values are: notConfigured, singleAppMode, multiAppMode. */
    private KioskModeType kioskModeUseManagedHomeScreenApp;
    /** Whether or not to display a virtual home button when the device is in Kiosk Mode. */
    private Boolean kioskModeVirtualHomeButtonEnabled;
    /** Indicates whether the virtual home button is a swipe up home button or a floating home button. Possible values are: notConfigured, swipeUp, floating. */
    private AndroidDeviceOwnerVirtualHomeButtonType kioskModeVirtualHomeButtonType;
    /** URL to a publicly accessible image to use for the wallpaper when the device is in Kiosk Mode. */
    private String kioskModeWallpaperUrl;
    /** The restricted set of WIFI SSIDs available for the user to configure in Kiosk Mode. This collection can contain a maximum of 500 elements. */
    private java.util.List<String> kioskModeWifiAllowedSsids;
    /** Whether or not to allow a user to configure Wi-Fi settings in Kiosk Mode. */
    private Boolean kioskModeWiFiConfigurationEnabled;
    /** Indicates whether or not LocateDevice for devices with lost mode (COBO, COPE) is enabled. */
    private Boolean locateDeviceLostModeEnabled;
    /** Indicates whether or not LocateDevice for userless (COSU) devices is disabled. */
    private Boolean locateDeviceUserlessDisabled;
    /** Indicates whether or not to block unmuting the microphone on the device. */
    private Boolean microphoneForceMute;
    /** Indicates whether or not to you want configure Microsoft Launcher. */
    private Boolean microsoftLauncherConfigurationEnabled;
    /** Indicates whether or not the user can modify the wallpaper to personalize their device. */
    private Boolean microsoftLauncherCustomWallpaperAllowUserModification;
    /** Indicates whether or not to configure the wallpaper on the targeted devices. */
    private Boolean microsoftLauncherCustomWallpaperEnabled;
    /** Indicates the URL for the image file to use as the wallpaper on the targeted devices. */
    private String microsoftLauncherCustomWallpaperImageUrl;
    /** Indicates whether or not the user can modify the device dock configuration on the device. */
    private Boolean microsoftLauncherDockPresenceAllowUserModification;
    /** Indicates whether or not you want to configure the device dock. Possible values are: notConfigured, show, hide, disabled. */
    private MicrosoftLauncherDockPresence microsoftLauncherDockPresenceConfiguration;
    /** Indicates whether or not the user can modify the launcher feed on the device. */
    private Boolean microsoftLauncherFeedAllowUserModification;
    /** Indicates whether or not you want to enable the launcher feed on the device. */
    private Boolean microsoftLauncherFeedEnabled;
    /** Indicates the search bar placement configuration on the device. Possible values are: notConfigured, top, bottom, hide. */
    private MicrosoftLauncherSearchBarPlacement microsoftLauncherSearchBarPlacementConfiguration;
    /** Indicates whether or not the device will allow connecting to a temporary network connection at boot time. */
    private Boolean networkEscapeHatchAllowed;
    /** Indicates whether or not to block NFC outgoing beam. */
    private Boolean nfcBlockOutgoingBeam;
    /** Indicates whether or not the keyguard is disabled. */
    private Boolean passwordBlockKeyguard;
    /** List of device keyguard features to block. This collection can contain a maximum of 11 elements. */
    private java.util.List<AndroidKeyguardFeature> passwordBlockKeyguardFeatures;
    /** Indicates the amount of time that a password can be set for before it expires and a new password will be required. Valid values 1 to 365 */
    private Integer passwordExpirationDays;
    /** Indicates the minimum length of the password required on the device. Valid values 4 to 16 */
    private Integer passwordMinimumLength;
    /** Indicates the minimum number of letter characters required for device password. Valid values 1 to 16 */
    private Integer passwordMinimumLetterCharacters;
    /** Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16 */
    private Integer passwordMinimumLowerCaseCharacters;
    /** Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16 */
    private Integer passwordMinimumNonLetterCharacters;
    /** Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16 */
    private Integer passwordMinimumNumericCharacters;
    /** Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16 */
    private Integer passwordMinimumSymbolCharacters;
    /** Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16 */
    private Integer passwordMinimumUpperCaseCharacters;
    /** Minutes of inactivity before the screen times out. */
    private Integer passwordMinutesOfInactivityBeforeScreenTimeout;
    /** Indicates the length of password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24 */
    private Integer passwordPreviousPasswordCountToBlock;
    /** Indicates the minimum password quality required on the device. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword. */
    private AndroidDeviceOwnerRequiredPasswordType passwordRequiredType;
    /** Indicates the timeout period after which a device must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue. */
    private AndroidDeviceOwnerRequiredPasswordUnlock passwordRequireUnlock;
    /** Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11 */
    private Integer passwordSignInFailureCountBeforeFactoryReset;
    /** Indicates whether the user can install apps from unknown sources on the personal profile. */
    private Boolean personalProfileAppsAllowInstallFromUnknownSources;
    /** Indicates whether to disable the use of the camera on the personal profile. */
    private Boolean personalProfileCameraBlocked;
    /** Policy applied to applications in the personal profile. This collection can contain a maximum of 500 elements. */
    private java.util.List<AppListItem> personalProfilePersonalApplications;
    /** Used together with PersonalProfilePersonalApplications to control how apps in the personal profile are allowed or blocked. Possible values are: notConfigured, blockedApps, allowedApps. */
    private PersonalProfilePersonalPlayStoreMode personalProfilePlayStoreMode;
    /** Indicates whether to disable the capability to take screenshots on the personal profile. */
    private Boolean personalProfileScreenCaptureBlocked;
    /** Indicates the Play Store mode of the device. Possible values are: notConfigured, allowList, blockList. */
    private AndroidDeviceOwnerPlayStoreMode playStoreMode;
    /** Indicates whether or not to disable the capability to take screenshots. */
    private Boolean screenCaptureBlocked;
    /** Represents the security common criteria mode enabled provided to users when they attempt to modify managed settings on their device. */
    private Boolean securityCommonCriteriaModeEnabled;
    /** Indicates whether or not the user is allowed to access developer settings like developer options and safe boot on the device. */
    private Boolean securityDeveloperSettingsEnabled;
    /** Indicates whether or not verify apps is required. */
    private Boolean securityRequireVerifyApps;
    /** Represents the customized short help text provided to users when they attempt to modify managed settings on their device. */
    private AndroidDeviceOwnerUserFacingMessage shortHelpText;
    /** Indicates whether or the status bar is disabled, including notifications, quick settings and other screen overlays. */
    private Boolean statusBarBlocked;
    /** List of modes in which the device's display will stay powered-on. This collection can contain a maximum of 4 elements. */
    private java.util.List<AndroidDeviceOwnerBatteryPluggedMode> stayOnModes;
    /** Indicates whether or not to allow USB mass storage. */
    private Boolean storageAllowUsb;
    /** Indicates whether or not to block external media. */
    private Boolean storageBlockExternalMedia;
    /** Indicates whether or not to block USB file transfer. */
    private Boolean storageBlockUsbFileTransfer;
    /** Indicates the annually repeating time periods during which system updates are postponed. This collection can contain a maximum of 500 elements. */
    private java.util.List<AndroidDeviceOwnerSystemUpdateFreezePeriod> systemUpdateFreezePeriods;
    /** The type of system update configuration. Possible values are: deviceDefault, postpone, windowed, automatic. */
    private AndroidDeviceOwnerSystemUpdateInstallType systemUpdateInstallType;
    /** Indicates the number of minutes after midnight that the system update window ends. Valid values 0 to 1440 */
    private Integer systemUpdateWindowEndMinutesAfterMidnight;
    /** Indicates the number of minutes after midnight that the system update window starts. Valid values 0 to 1440 */
    private Integer systemUpdateWindowStartMinutesAfterMidnight;
    /** Whether or not to block Android system prompt windows, like toasts, phone activities, and system alerts. */
    private Boolean systemWindowsBlocked;
    /** Indicates whether or not adding users and profiles is disabled. */
    private Boolean usersBlockAdd;
    /** Indicates whether or not to disable removing other users from the device. */
    private Boolean usersBlockRemove;
    /** Indicates whether or not adjusting the master volume is disabled. */
    private Boolean volumeBlockAdjustment;
    /** If an always on VPN package name is specified, whether or not to lock network traffic when that VPN is disconnected. */
    private Boolean vpnAlwaysOnLockdownMode;
    /** Android app package name for app that will handle an always-on VPN connection. */
    private String vpnAlwaysOnPackageIdentifier;
    /** Indicates whether or not to block the user from editing the wifi connection settings. */
    private Boolean wifiBlockEditConfigurations;
    /** Indicates whether or not to block the user from editing just the networks defined by the policy. */
    private Boolean wifiBlockEditPolicyDefinedConfigurations;
    /** Indicates the number of days that a work profile password can be set before it expires and a new password will be required. Valid values 1 to 365 */
    private Integer workProfilePasswordExpirationDays;
    /** Indicates the minimum length of the work profile password. Valid values 4 to 16 */
    private Integer workProfilePasswordMinimumLength;
    /** Indicates the minimum number of letter characters required for the work profile password. Valid values 1 to 16 */
    private Integer workProfilePasswordMinimumLetterCharacters;
    /** Indicates the minimum number of lower-case characters required for the work profile password. Valid values 1 to 16 */
    private Integer workProfilePasswordMinimumLowerCaseCharacters;
    /** Indicates the minimum number of non-letter characters required for the work profile password. Valid values 1 to 16 */
    private Integer workProfilePasswordMinimumNonLetterCharacters;
    /** Indicates the minimum number of numeric characters required for the work profile password. Valid values 1 to 16 */
    private Integer workProfilePasswordMinimumNumericCharacters;
    /** Indicates the minimum number of symbol characters required for the work profile password. Valid values 1 to 16 */
    private Integer workProfilePasswordMinimumSymbolCharacters;
    /** Indicates the minimum number of upper-case letter characters required for the work profile password. Valid values 1 to 16 */
    private Integer workProfilePasswordMinimumUpperCaseCharacters;
    /** Indicates the length of the work profile password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24 */
    private Integer workProfilePasswordPreviousPasswordCountToBlock;
    /** Indicates the minimum password quality required on the work profile password. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword. */
    private AndroidDeviceOwnerRequiredPasswordType workProfilePasswordRequiredType;
    /** Indicates the timeout period after which a work profile must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue. */
    private AndroidDeviceOwnerRequiredPasswordUnlock workProfilePasswordRequireUnlock;
    /** Indicates the number of times a user can enter an incorrect work profile password before the device is wiped. Valid values 4 to 11 */
    private Integer workProfilePasswordSignInFailureCountBeforeFactoryReset;
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
        return this.accountsBlockModification;
    }
    /**
     * Gets the appsAllowInstallFromUnknownSources property value. Indicates whether or not the user is allowed to enable to unknown sources setting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsAllowInstallFromUnknownSources() {
        return this.appsAllowInstallFromUnknownSources;
    }
    /**
     * Gets the appsAutoUpdatePolicy property value. Indicates the value of the app auto update policy. Possible values are: notConfigured, userChoice, never, wiFiOnly, always.
     * @return a androidDeviceOwnerAppAutoUpdatePolicyType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerAppAutoUpdatePolicyType getAppsAutoUpdatePolicy() {
        return this.appsAutoUpdatePolicy;
    }
    /**
     * Gets the appsDefaultPermissionPolicy property value. Indicates the permission policy for requests for runtime permissions if one is not defined for the app specifically. Possible values are: deviceDefault, prompt, autoGrant, autoDeny.
     * @return a androidDeviceOwnerDefaultAppPermissionPolicyType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerDefaultAppPermissionPolicyType getAppsDefaultPermissionPolicy() {
        return this.appsDefaultPermissionPolicy;
    }
    /**
     * Gets the appsRecommendSkippingFirstUseHints property value. Whether or not to recommend all apps skip any first-time-use hints they may have added.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAppsRecommendSkippingFirstUseHints() {
        return this.appsRecommendSkippingFirstUseHints;
    }
    /**
     * Gets the azureAdSharedDeviceDataClearApps property value. A list of managed apps that will have their data cleared during a global sign-out in AAD shared device mode. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getAzureAdSharedDeviceDataClearApps() {
        return this.azureAdSharedDeviceDataClearApps;
    }
    /**
     * Gets the bluetoothBlockConfiguration property value. Indicates whether or not to block a user from configuring bluetooth.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockConfiguration() {
        return this.bluetoothBlockConfiguration;
    }
    /**
     * Gets the bluetoothBlockContactSharing property value. Indicates whether or not to block a user from sharing contacts via bluetooth.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBluetoothBlockContactSharing() {
        return this.bluetoothBlockContactSharing;
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to disable the use of the camera.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this.cameraBlocked;
    }
    /**
     * Gets the cellularBlockWiFiTethering property value. Indicates whether or not to block Wi-Fi tethering.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCellularBlockWiFiTethering() {
        return this.cellularBlockWiFiTethering;
    }
    /**
     * Gets the certificateCredentialConfigurationDisabled property value. Indicates whether or not to block users from any certificate credential configuration.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCertificateCredentialConfigurationDisabled() {
        return this.certificateCredentialConfigurationDisabled;
    }
    /**
     * Gets the crossProfilePoliciesAllowCopyPaste property value. Indicates whether or not text copied from one profile (personal or work) can be pasted in the other.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCrossProfilePoliciesAllowCopyPaste() {
        return this.crossProfilePoliciesAllowCopyPaste;
    }
    /**
     * Gets the crossProfilePoliciesAllowDataSharing property value. Indicates whether data from one profile (personal or work) can be shared with apps in the other profile. Possible values are: notConfigured, crossProfileDataSharingBlocked, dataSharingFromWorkToPersonalBlocked, crossProfileDataSharingAllowed, unkownFutureValue.
     * @return a androidDeviceOwnerCrossProfileDataSharing
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerCrossProfileDataSharing getCrossProfilePoliciesAllowDataSharing() {
        return this.crossProfilePoliciesAllowDataSharing;
    }
    /**
     * Gets the crossProfilePoliciesShowWorkContactsInPersonalProfile property value. Indicates whether or not contacts stored in work profile are shown in personal profile contact searches/incoming calls.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCrossProfilePoliciesShowWorkContactsInPersonalProfile() {
        return this.crossProfilePoliciesShowWorkContactsInPersonalProfile;
    }
    /**
     * Gets the dataRoamingBlocked property value. Indicates whether or not to block a user from data roaming.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDataRoamingBlocked() {
        return this.dataRoamingBlocked;
    }
    /**
     * Gets the dateTimeConfigurationBlocked property value. Indicates whether or not to block the user from manually changing the date or time on the device
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDateTimeConfigurationBlocked() {
        return this.dateTimeConfigurationBlocked;
    }
    /**
     * Gets the detailedHelpText property value. Represents the customized detailed help text provided to users when they attempt to modify managed settings on their device.
     * @return a androidDeviceOwnerUserFacingMessage
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerUserFacingMessage getDetailedHelpText() {
        return this.detailedHelpText;
    }
    /**
     * Gets the deviceOwnerLockScreenMessage property value. Represents the customized lock screen message provided to users when they attempt to modify managed settings on their device.
     * @return a androidDeviceOwnerUserFacingMessage
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerUserFacingMessage getDeviceOwnerLockScreenMessage() {
        return this.deviceOwnerLockScreenMessage;
    }
    /**
     * Gets the enrollmentProfile property value. Android Device Owner Enrollment Profile types.
     * @return a androidDeviceOwnerEnrollmentProfileType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerEnrollmentProfileType getEnrollmentProfile() {
        return this.enrollmentProfile;
    }
    /**
     * Gets the factoryResetBlocked property value. Indicates whether or not the factory reset option in settings is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFactoryResetBlocked() {
        return this.factoryResetBlocked;
    }
    /**
     * Gets the factoryResetDeviceAdministratorEmails property value. List of Google account emails that will be required to authenticate after a device is factory reset before it can be set up.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getFactoryResetDeviceAdministratorEmails() {
        return this.factoryResetDeviceAdministratorEmails;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountsBlockModification", (n) -> { this.setAccountsBlockModification(n.getBooleanValue()); });
        deserializerMap.put("appsAllowInstallFromUnknownSources", (n) -> { this.setAppsAllowInstallFromUnknownSources(n.getBooleanValue()); });
        deserializerMap.put("appsAutoUpdatePolicy", (n) -> { this.setAppsAutoUpdatePolicy(n.getEnumValue(AndroidDeviceOwnerAppAutoUpdatePolicyType.class)); });
        deserializerMap.put("appsDefaultPermissionPolicy", (n) -> { this.setAppsDefaultPermissionPolicy(n.getEnumValue(AndroidDeviceOwnerDefaultAppPermissionPolicyType.class)); });
        deserializerMap.put("appsRecommendSkippingFirstUseHints", (n) -> { this.setAppsRecommendSkippingFirstUseHints(n.getBooleanValue()); });
        deserializerMap.put("azureAdSharedDeviceDataClearApps", (n) -> { this.setAzureAdSharedDeviceDataClearApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("bluetoothBlockConfiguration", (n) -> { this.setBluetoothBlockConfiguration(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlockContactSharing", (n) -> { this.setBluetoothBlockContactSharing(n.getBooleanValue()); });
        deserializerMap.put("cameraBlocked", (n) -> { this.setCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockWiFiTethering", (n) -> { this.setCellularBlockWiFiTethering(n.getBooleanValue()); });
        deserializerMap.put("certificateCredentialConfigurationDisabled", (n) -> { this.setCertificateCredentialConfigurationDisabled(n.getBooleanValue()); });
        deserializerMap.put("crossProfilePoliciesAllowCopyPaste", (n) -> { this.setCrossProfilePoliciesAllowCopyPaste(n.getBooleanValue()); });
        deserializerMap.put("crossProfilePoliciesAllowDataSharing", (n) -> { this.setCrossProfilePoliciesAllowDataSharing(n.getEnumValue(AndroidDeviceOwnerCrossProfileDataSharing.class)); });
        deserializerMap.put("crossProfilePoliciesShowWorkContactsInPersonalProfile", (n) -> { this.setCrossProfilePoliciesShowWorkContactsInPersonalProfile(n.getBooleanValue()); });
        deserializerMap.put("dataRoamingBlocked", (n) -> { this.setDataRoamingBlocked(n.getBooleanValue()); });
        deserializerMap.put("dateTimeConfigurationBlocked", (n) -> { this.setDateTimeConfigurationBlocked(n.getBooleanValue()); });
        deserializerMap.put("detailedHelpText", (n) -> { this.setDetailedHelpText(n.getObjectValue(AndroidDeviceOwnerUserFacingMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceOwnerLockScreenMessage", (n) -> { this.setDeviceOwnerLockScreenMessage(n.getObjectValue(AndroidDeviceOwnerUserFacingMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("enrollmentProfile", (n) -> { this.setEnrollmentProfile(n.getEnumValue(AndroidDeviceOwnerEnrollmentProfileType.class)); });
        deserializerMap.put("factoryResetBlocked", (n) -> { this.setFactoryResetBlocked(n.getBooleanValue()); });
        deserializerMap.put("factoryResetDeviceAdministratorEmails", (n) -> { this.setFactoryResetDeviceAdministratorEmails(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("globalProxy", (n) -> { this.setGlobalProxy(n.getObjectValue(AndroidDeviceOwnerGlobalProxy::createFromDiscriminatorValue)); });
        deserializerMap.put("googleAccountsBlocked", (n) -> { this.setGoogleAccountsBlocked(n.getBooleanValue()); });
        deserializerMap.put("kioskCustomizationDeviceSettingsBlocked", (n) -> { this.setKioskCustomizationDeviceSettingsBlocked(n.getBooleanValue()); });
        deserializerMap.put("kioskCustomizationPowerButtonActionsBlocked", (n) -> { this.setKioskCustomizationPowerButtonActionsBlocked(n.getBooleanValue()); });
        deserializerMap.put("kioskCustomizationStatusBar", (n) -> { this.setKioskCustomizationStatusBar(n.getEnumValue(AndroidDeviceOwnerKioskCustomizationStatusBar.class)); });
        deserializerMap.put("kioskCustomizationSystemErrorWarnings", (n) -> { this.setKioskCustomizationSystemErrorWarnings(n.getBooleanValue()); });
        deserializerMap.put("kioskCustomizationSystemNavigation", (n) -> { this.setKioskCustomizationSystemNavigation(n.getEnumValue(AndroidDeviceOwnerKioskCustomizationSystemNavigation.class)); });
        deserializerMap.put("kioskModeAppOrderEnabled", (n) -> { this.setKioskModeAppOrderEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAppPositions", (n) -> { this.setKioskModeAppPositions(n.getCollectionOfObjectValues(AndroidDeviceOwnerKioskModeAppPositionItem::createFromDiscriminatorValue)); });
        deserializerMap.put("kioskModeApps", (n) -> { this.setKioskModeApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("kioskModeAppsInFolderOrderedByName", (n) -> { this.setKioskModeAppsInFolderOrderedByName(n.getBooleanValue()); });
        deserializerMap.put("kioskModeBluetoothConfigurationEnabled", (n) -> { this.setKioskModeBluetoothConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeDebugMenuEasyAccessEnabled", (n) -> { this.setKioskModeDebugMenuEasyAccessEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeExitCode", (n) -> { this.setKioskModeExitCode(n.getStringValue()); });
        deserializerMap.put("kioskModeFlashlightConfigurationEnabled", (n) -> { this.setKioskModeFlashlightConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeFolderIcon", (n) -> { this.setKioskModeFolderIcon(n.getEnumValue(AndroidDeviceOwnerKioskModeFolderIcon.class)); });
        deserializerMap.put("kioskModeGridHeight", (n) -> { this.setKioskModeGridHeight(n.getIntegerValue()); });
        deserializerMap.put("kioskModeGridWidth", (n) -> { this.setKioskModeGridWidth(n.getIntegerValue()); });
        deserializerMap.put("kioskModeIconSize", (n) -> { this.setKioskModeIconSize(n.getEnumValue(AndroidDeviceOwnerKioskModeIconSize.class)); });
        deserializerMap.put("kioskModeLockHomeScreen", (n) -> { this.setKioskModeLockHomeScreen(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedFolders", (n) -> { this.setKioskModeManagedFolders(n.getCollectionOfObjectValues(AndroidDeviceOwnerKioskModeManagedFolder::createFromDiscriminatorValue)); });
        deserializerMap.put("kioskModeManagedHomeScreenAutoSignout", (n) -> { this.setKioskModeManagedHomeScreenAutoSignout(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds", (n) -> { this.setKioskModeManagedHomeScreenInactiveSignOutDelayInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds", (n) -> { this.setKioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenPinComplexity", (n) -> { this.setKioskModeManagedHomeScreenPinComplexity(n.getEnumValue(KioskModeManagedHomeScreenPinComplexity.class)); });
        deserializerMap.put("kioskModeManagedHomeScreenPinRequired", (n) -> { this.setKioskModeManagedHomeScreenPinRequired(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenPinRequiredToResume", (n) -> { this.setKioskModeManagedHomeScreenPinRequiredToResume(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenSignInBackground", (n) -> { this.setKioskModeManagedHomeScreenSignInBackground(n.getStringValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenSignInBrandingLogo", (n) -> { this.setKioskModeManagedHomeScreenSignInBrandingLogo(n.getStringValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenSignInEnabled", (n) -> { this.setKioskModeManagedHomeScreenSignInEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedSettingsEntryDisabled", (n) -> { this.setKioskModeManagedSettingsEntryDisabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeMediaVolumeConfigurationEnabled", (n) -> { this.setKioskModeMediaVolumeConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeScreenOrientation", (n) -> { this.setKioskModeScreenOrientation(n.getEnumValue(AndroidDeviceOwnerKioskModeScreenOrientation.class)); });
        deserializerMap.put("kioskModeScreenSaverConfigurationEnabled", (n) -> { this.setKioskModeScreenSaverConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeScreenSaverDetectMediaDisabled", (n) -> { this.setKioskModeScreenSaverDetectMediaDisabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeScreenSaverDisplayTimeInSeconds", (n) -> { this.setKioskModeScreenSaverDisplayTimeInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskModeScreenSaverImageUrl", (n) -> { this.setKioskModeScreenSaverImageUrl(n.getStringValue()); });
        deserializerMap.put("kioskModeScreenSaverStartDelayInSeconds", (n) -> { this.setKioskModeScreenSaverStartDelayInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskModeShowAppNotificationBadge", (n) -> { this.setKioskModeShowAppNotificationBadge(n.getBooleanValue()); });
        deserializerMap.put("kioskModeShowDeviceInfo", (n) -> { this.setKioskModeShowDeviceInfo(n.getBooleanValue()); });
        deserializerMap.put("kioskModeUseManagedHomeScreenApp", (n) -> { this.setKioskModeUseManagedHomeScreenApp(n.getEnumValue(KioskModeType.class)); });
        deserializerMap.put("kioskModeVirtualHomeButtonEnabled", (n) -> { this.setKioskModeVirtualHomeButtonEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeVirtualHomeButtonType", (n) -> { this.setKioskModeVirtualHomeButtonType(n.getEnumValue(AndroidDeviceOwnerVirtualHomeButtonType.class)); });
        deserializerMap.put("kioskModeWallpaperUrl", (n) -> { this.setKioskModeWallpaperUrl(n.getStringValue()); });
        deserializerMap.put("kioskModeWifiAllowedSsids", (n) -> { this.setKioskModeWifiAllowedSsids(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("kioskModeWiFiConfigurationEnabled", (n) -> { this.setKioskModeWiFiConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("locateDeviceLostModeEnabled", (n) -> { this.setLocateDeviceLostModeEnabled(n.getBooleanValue()); });
        deserializerMap.put("locateDeviceUserlessDisabled", (n) -> { this.setLocateDeviceUserlessDisabled(n.getBooleanValue()); });
        deserializerMap.put("microphoneForceMute", (n) -> { this.setMicrophoneForceMute(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherConfigurationEnabled", (n) -> { this.setMicrosoftLauncherConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherCustomWallpaperAllowUserModification", (n) -> { this.setMicrosoftLauncherCustomWallpaperAllowUserModification(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherCustomWallpaperEnabled", (n) -> { this.setMicrosoftLauncherCustomWallpaperEnabled(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherCustomWallpaperImageUrl", (n) -> { this.setMicrosoftLauncherCustomWallpaperImageUrl(n.getStringValue()); });
        deserializerMap.put("microsoftLauncherDockPresenceAllowUserModification", (n) -> { this.setMicrosoftLauncherDockPresenceAllowUserModification(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherDockPresenceConfiguration", (n) -> { this.setMicrosoftLauncherDockPresenceConfiguration(n.getEnumValue(MicrosoftLauncherDockPresence.class)); });
        deserializerMap.put("microsoftLauncherFeedAllowUserModification", (n) -> { this.setMicrosoftLauncherFeedAllowUserModification(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherFeedEnabled", (n) -> { this.setMicrosoftLauncherFeedEnabled(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherSearchBarPlacementConfiguration", (n) -> { this.setMicrosoftLauncherSearchBarPlacementConfiguration(n.getEnumValue(MicrosoftLauncherSearchBarPlacement.class)); });
        deserializerMap.put("networkEscapeHatchAllowed", (n) -> { this.setNetworkEscapeHatchAllowed(n.getBooleanValue()); });
        deserializerMap.put("nfcBlockOutgoingBeam", (n) -> { this.setNfcBlockOutgoingBeam(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockKeyguard", (n) -> { this.setPasswordBlockKeyguard(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockKeyguardFeatures", (n) -> { this.setPasswordBlockKeyguardFeatures(n.getCollectionOfEnumValues(AndroidKeyguardFeature.class)); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLetterCharacters", (n) -> { this.setPasswordMinimumLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLowerCaseCharacters", (n) -> { this.setPasswordMinimumLowerCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumNonLetterCharacters", (n) -> { this.setPasswordMinimumNonLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumNumericCharacters", (n) -> { this.setPasswordMinimumNumericCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumSymbolCharacters", (n) -> { this.setPasswordMinimumSymbolCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumUpperCaseCharacters", (n) -> { this.setPasswordMinimumUpperCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasswordMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordCountToBlock", (n) -> { this.setPasswordPreviousPasswordCountToBlock(n.getIntegerValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordType.class)); });
        deserializerMap.put("passwordRequireUnlock", (n) -> { this.setPasswordRequireUnlock(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordUnlock.class)); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { this.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("personalProfileAppsAllowInstallFromUnknownSources", (n) -> { this.setPersonalProfileAppsAllowInstallFromUnknownSources(n.getBooleanValue()); });
        deserializerMap.put("personalProfileCameraBlocked", (n) -> { this.setPersonalProfileCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("personalProfilePersonalApplications", (n) -> { this.setPersonalProfilePersonalApplications(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("personalProfilePlayStoreMode", (n) -> { this.setPersonalProfilePlayStoreMode(n.getEnumValue(PersonalProfilePersonalPlayStoreMode.class)); });
        deserializerMap.put("personalProfileScreenCaptureBlocked", (n) -> { this.setPersonalProfileScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("playStoreMode", (n) -> { this.setPlayStoreMode(n.getEnumValue(AndroidDeviceOwnerPlayStoreMode.class)); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { this.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("securityCommonCriteriaModeEnabled", (n) -> { this.setSecurityCommonCriteriaModeEnabled(n.getBooleanValue()); });
        deserializerMap.put("securityDeveloperSettingsEnabled", (n) -> { this.setSecurityDeveloperSettingsEnabled(n.getBooleanValue()); });
        deserializerMap.put("securityRequireVerifyApps", (n) -> { this.setSecurityRequireVerifyApps(n.getBooleanValue()); });
        deserializerMap.put("shortHelpText", (n) -> { this.setShortHelpText(n.getObjectValue(AndroidDeviceOwnerUserFacingMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("statusBarBlocked", (n) -> { this.setStatusBarBlocked(n.getBooleanValue()); });
        deserializerMap.put("stayOnModes", (n) -> { this.setStayOnModes(n.getCollectionOfEnumValues(AndroidDeviceOwnerBatteryPluggedMode.class)); });
        deserializerMap.put("storageAllowUsb", (n) -> { this.setStorageAllowUsb(n.getBooleanValue()); });
        deserializerMap.put("storageBlockExternalMedia", (n) -> { this.setStorageBlockExternalMedia(n.getBooleanValue()); });
        deserializerMap.put("storageBlockUsbFileTransfer", (n) -> { this.setStorageBlockUsbFileTransfer(n.getBooleanValue()); });
        deserializerMap.put("systemUpdateFreezePeriods", (n) -> { this.setSystemUpdateFreezePeriods(n.getCollectionOfObjectValues(AndroidDeviceOwnerSystemUpdateFreezePeriod::createFromDiscriminatorValue)); });
        deserializerMap.put("systemUpdateInstallType", (n) -> { this.setSystemUpdateInstallType(n.getEnumValue(AndroidDeviceOwnerSystemUpdateInstallType.class)); });
        deserializerMap.put("systemUpdateWindowEndMinutesAfterMidnight", (n) -> { this.setSystemUpdateWindowEndMinutesAfterMidnight(n.getIntegerValue()); });
        deserializerMap.put("systemUpdateWindowStartMinutesAfterMidnight", (n) -> { this.setSystemUpdateWindowStartMinutesAfterMidnight(n.getIntegerValue()); });
        deserializerMap.put("systemWindowsBlocked", (n) -> { this.setSystemWindowsBlocked(n.getBooleanValue()); });
        deserializerMap.put("usersBlockAdd", (n) -> { this.setUsersBlockAdd(n.getBooleanValue()); });
        deserializerMap.put("usersBlockRemove", (n) -> { this.setUsersBlockRemove(n.getBooleanValue()); });
        deserializerMap.put("volumeBlockAdjustment", (n) -> { this.setVolumeBlockAdjustment(n.getBooleanValue()); });
        deserializerMap.put("vpnAlwaysOnLockdownMode", (n) -> { this.setVpnAlwaysOnLockdownMode(n.getBooleanValue()); });
        deserializerMap.put("vpnAlwaysOnPackageIdentifier", (n) -> { this.setVpnAlwaysOnPackageIdentifier(n.getStringValue()); });
        deserializerMap.put("wifiBlockEditConfigurations", (n) -> { this.setWifiBlockEditConfigurations(n.getBooleanValue()); });
        deserializerMap.put("wifiBlockEditPolicyDefinedConfigurations", (n) -> { this.setWifiBlockEditPolicyDefinedConfigurations(n.getBooleanValue()); });
        deserializerMap.put("workProfilePasswordExpirationDays", (n) -> { this.setWorkProfilePasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumLength", (n) -> { this.setWorkProfilePasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumLetterCharacters", (n) -> { this.setWorkProfilePasswordMinimumLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumLowerCaseCharacters", (n) -> { this.setWorkProfilePasswordMinimumLowerCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumNonLetterCharacters", (n) -> { this.setWorkProfilePasswordMinimumNonLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumNumericCharacters", (n) -> { this.setWorkProfilePasswordMinimumNumericCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumSymbolCharacters", (n) -> { this.setWorkProfilePasswordMinimumSymbolCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordMinimumUpperCaseCharacters", (n) -> { this.setWorkProfilePasswordMinimumUpperCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordPreviousPasswordCountToBlock", (n) -> { this.setWorkProfilePasswordPreviousPasswordCountToBlock(n.getIntegerValue()); });
        deserializerMap.put("workProfilePasswordRequiredType", (n) -> { this.setWorkProfilePasswordRequiredType(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordType.class)); });
        deserializerMap.put("workProfilePasswordRequireUnlock", (n) -> { this.setWorkProfilePasswordRequireUnlock(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordUnlock.class)); });
        deserializerMap.put("workProfilePasswordSignInFailureCountBeforeFactoryReset", (n) -> { this.setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the globalProxy property value. Proxy is set up directly with host, port and excluded hosts.
     * @return a androidDeviceOwnerGlobalProxy
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerGlobalProxy getGlobalProxy() {
        return this.globalProxy;
    }
    /**
     * Gets the googleAccountsBlocked property value. Indicates whether or not google accounts will be blocked.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGoogleAccountsBlocked() {
        return this.googleAccountsBlocked;
    }
    /**
     * Gets the kioskCustomizationDeviceSettingsBlocked property value. Indicateswhether a user can access the device's Settings app while in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskCustomizationDeviceSettingsBlocked() {
        return this.kioskCustomizationDeviceSettingsBlocked;
    }
    /**
     * Gets the kioskCustomizationPowerButtonActionsBlocked property value. Whether the power menu is shown when a user long presses the Power button of a device in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskCustomizationPowerButtonActionsBlocked() {
        return this.kioskCustomizationPowerButtonActionsBlocked;
    }
    /**
     * Gets the kioskCustomizationStatusBar property value. Indicates whether system info and notifications are disabled in Kiosk Mode. Possible values are: notConfigured, notificationsAndSystemInfoEnabled, systemInfoOnly.
     * @return a androidDeviceOwnerKioskCustomizationStatusBar
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerKioskCustomizationStatusBar getKioskCustomizationStatusBar() {
        return this.kioskCustomizationStatusBar;
    }
    /**
     * Gets the kioskCustomizationSystemErrorWarnings property value. Indicates whether system error dialogs for crashed or unresponsive apps are shown in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskCustomizationSystemErrorWarnings() {
        return this.kioskCustomizationSystemErrorWarnings;
    }
    /**
     * Gets the kioskCustomizationSystemNavigation property value. Indicates which navigation features are enabled in Kiosk Mode. Possible values are: notConfigured, navigationEnabled, homeButtonOnly.
     * @return a androidDeviceOwnerKioskCustomizationSystemNavigation
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerKioskCustomizationSystemNavigation getKioskCustomizationSystemNavigation() {
        return this.kioskCustomizationSystemNavigation;
    }
    /**
     * Gets the kioskModeAppOrderEnabled property value. Whether or not to enable app ordering in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAppOrderEnabled() {
        return this.kioskModeAppOrderEnabled;
    }
    /**
     * Gets the kioskModeAppPositions property value. The ordering of items on Kiosk Mode Managed Home Screen. This collection can contain a maximum of 500 elements.
     * @return a androidDeviceOwnerKioskModeAppPositionItem
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerKioskModeAppPositionItem> getKioskModeAppPositions() {
        return this.kioskModeAppPositions;
    }
    /**
     * Gets the kioskModeApps property value. A list of managed apps that will be shown when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getKioskModeApps() {
        return this.kioskModeApps;
    }
    /**
     * Gets the kioskModeAppsInFolderOrderedByName property value. Whether or not to alphabetize applications within a folder in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeAppsInFolderOrderedByName() {
        return this.kioskModeAppsInFolderOrderedByName;
    }
    /**
     * Gets the kioskModeBluetoothConfigurationEnabled property value. Whether or not to allow a user to configure Bluetooth settings in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeBluetoothConfigurationEnabled() {
        return this.kioskModeBluetoothConfigurationEnabled;
    }
    /**
     * Gets the kioskModeDebugMenuEasyAccessEnabled property value. Whether or not to allow a user to easy access to the debug menu in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeDebugMenuEasyAccessEnabled() {
        return this.kioskModeDebugMenuEasyAccessEnabled;
    }
    /**
     * Gets the kioskModeExitCode property value. Exit code to allow a user to escape from Kiosk Mode when the device is in Kiosk Mode.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskModeExitCode() {
        return this.kioskModeExitCode;
    }
    /**
     * Gets the kioskModeFlashlightConfigurationEnabled property value. Whether or not to allow a user to use the flashlight in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeFlashlightConfigurationEnabled() {
        return this.kioskModeFlashlightConfigurationEnabled;
    }
    /**
     * Gets the kioskModeFolderIcon property value. Folder icon configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, darkSquare, darkCircle, lightSquare, lightCircle.
     * @return a androidDeviceOwnerKioskModeFolderIcon
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerKioskModeFolderIcon getKioskModeFolderIcon() {
        return this.kioskModeFolderIcon;
    }
    /**
     * Gets the kioskModeGridHeight property value. Number of rows for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKioskModeGridHeight() {
        return this.kioskModeGridHeight;
    }
    /**
     * Gets the kioskModeGridWidth property value. Number of columns for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKioskModeGridWidth() {
        return this.kioskModeGridWidth;
    }
    /**
     * Gets the kioskModeIconSize property value. Icon size configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, smallest, small, regular, large, largest.
     * @return a androidDeviceOwnerKioskModeIconSize
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerKioskModeIconSize getKioskModeIconSize() {
        return this.kioskModeIconSize;
    }
    /**
     * Gets the kioskModeLockHomeScreen property value. Whether or not to lock home screen to the end user in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeLockHomeScreen() {
        return this.kioskModeLockHomeScreen;
    }
    /**
     * Gets the kioskModeManagedFolders property value. A list of managed folders for a device in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @return a androidDeviceOwnerKioskModeManagedFolder
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerKioskModeManagedFolder> getKioskModeManagedFolders() {
        return this.kioskModeManagedFolders;
    }
    /**
     * Gets the kioskModeManagedHomeScreenAutoSignout property value. Whether or not to automatically sign-out of MHS and Shared device mode applications after inactive for Managed Home Screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeManagedHomeScreenAutoSignout() {
        return this.kioskModeManagedHomeScreenAutoSignout;
    }
    /**
     * Gets the kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds property value. Number of seconds to give user notice before automatically signing them out for Managed Home Screen. Valid values 0 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKioskModeManagedHomeScreenInactiveSignOutDelayInSeconds() {
        return this.kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds;
    }
    /**
     * Gets the kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds property value. Number of seconds device is inactive before automatically signing user out for Managed Home Screen. Valid values 0 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds() {
        return this.kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds;
    }
    /**
     * Gets the kioskModeManagedHomeScreenPinComplexity property value. Complexity of PIN for sign-in session for Managed Home Screen. Possible values are: notConfigured, simple, complex.
     * @return a kioskModeManagedHomeScreenPinComplexity
     */
    @javax.annotation.Nullable
    public KioskModeManagedHomeScreenPinComplexity getKioskModeManagedHomeScreenPinComplexity() {
        return this.kioskModeManagedHomeScreenPinComplexity;
    }
    /**
     * Gets the kioskModeManagedHomeScreenPinRequired property value. Whether or not require user to set a PIN for sign-in session for Managed Home Screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeManagedHomeScreenPinRequired() {
        return this.kioskModeManagedHomeScreenPinRequired;
    }
    /**
     * Gets the kioskModeManagedHomeScreenPinRequiredToResume property value. Whether or not required user to enter session PIN if screensaver has appeared for Managed Home Screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeManagedHomeScreenPinRequiredToResume() {
        return this.kioskModeManagedHomeScreenPinRequiredToResume;
    }
    /**
     * Gets the kioskModeManagedHomeScreenSignInBackground property value. Custom URL background for sign-in screen for Managed Home Screen.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskModeManagedHomeScreenSignInBackground() {
        return this.kioskModeManagedHomeScreenSignInBackground;
    }
    /**
     * Gets the kioskModeManagedHomeScreenSignInBrandingLogo property value. Custom URL branding logo for sign-in screen and session pin page for Managed Home Screen.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskModeManagedHomeScreenSignInBrandingLogo() {
        return this.kioskModeManagedHomeScreenSignInBrandingLogo;
    }
    /**
     * Gets the kioskModeManagedHomeScreenSignInEnabled property value. Whether or not show sign-in screen for Managed Home Screen.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeManagedHomeScreenSignInEnabled() {
        return this.kioskModeManagedHomeScreenSignInEnabled;
    }
    /**
     * Gets the kioskModeManagedSettingsEntryDisabled property value. Whether or not to display the Managed Settings entry point on the managed home screen in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeManagedSettingsEntryDisabled() {
        return this.kioskModeManagedSettingsEntryDisabled;
    }
    /**
     * Gets the kioskModeMediaVolumeConfigurationEnabled property value. Whether or not to allow a user to change the media volume in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeMediaVolumeConfigurationEnabled() {
        return this.kioskModeMediaVolumeConfigurationEnabled;
    }
    /**
     * Gets the kioskModeScreenOrientation property value. Screen orientation configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, portrait, landscape, autoRotate.
     * @return a androidDeviceOwnerKioskModeScreenOrientation
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerKioskModeScreenOrientation getKioskModeScreenOrientation() {
        return this.kioskModeScreenOrientation;
    }
    /**
     * Gets the kioskModeScreenSaverConfigurationEnabled property value. Whether or not to enable screen saver mode or not in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeScreenSaverConfigurationEnabled() {
        return this.kioskModeScreenSaverConfigurationEnabled;
    }
    /**
     * Gets the kioskModeScreenSaverDetectMediaDisabled property value. Whether or not the device screen should show the screen saver if audio/video is playing in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeScreenSaverDetectMediaDisabled() {
        return this.kioskModeScreenSaverDetectMediaDisabled;
    }
    /**
     * Gets the kioskModeScreenSaverDisplayTimeInSeconds property value. The number of seconds that the device will display the screen saver for in Kiosk Mode. Valid values 0 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKioskModeScreenSaverDisplayTimeInSeconds() {
        return this.kioskModeScreenSaverDisplayTimeInSeconds;
    }
    /**
     * Gets the kioskModeScreenSaverImageUrl property value. URL for an image that will be the device's screen saver in Kiosk Mode.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskModeScreenSaverImageUrl() {
        return this.kioskModeScreenSaverImageUrl;
    }
    /**
     * Gets the kioskModeScreenSaverStartDelayInSeconds property value. The number of seconds the device needs to be inactive for before the screen saver is shown in Kiosk Mode. Valid values 1 to 9999999
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getKioskModeScreenSaverStartDelayInSeconds() {
        return this.kioskModeScreenSaverStartDelayInSeconds;
    }
    /**
     * Gets the kioskModeShowAppNotificationBadge property value. Whether or not to display application notification badges in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeShowAppNotificationBadge() {
        return this.kioskModeShowAppNotificationBadge;
    }
    /**
     * Gets the kioskModeShowDeviceInfo property value. Whether or not to allow a user to access basic device information.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeShowDeviceInfo() {
        return this.kioskModeShowDeviceInfo;
    }
    /**
     * Gets the kioskModeUseManagedHomeScreenApp property value. Whether or not to use single app kiosk mode or multi-app kiosk mode. Possible values are: notConfigured, singleAppMode, multiAppMode.
     * @return a kioskModeType
     */
    @javax.annotation.Nullable
    public KioskModeType getKioskModeUseManagedHomeScreenApp() {
        return this.kioskModeUseManagedHomeScreenApp;
    }
    /**
     * Gets the kioskModeVirtualHomeButtonEnabled property value. Whether or not to display a virtual home button when the device is in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeVirtualHomeButtonEnabled() {
        return this.kioskModeVirtualHomeButtonEnabled;
    }
    /**
     * Gets the kioskModeVirtualHomeButtonType property value. Indicates whether the virtual home button is a swipe up home button or a floating home button. Possible values are: notConfigured, swipeUp, floating.
     * @return a androidDeviceOwnerVirtualHomeButtonType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerVirtualHomeButtonType getKioskModeVirtualHomeButtonType() {
        return this.kioskModeVirtualHomeButtonType;
    }
    /**
     * Gets the kioskModeWallpaperUrl property value. URL to a publicly accessible image to use for the wallpaper when the device is in Kiosk Mode.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKioskModeWallpaperUrl() {
        return this.kioskModeWallpaperUrl;
    }
    /**
     * Gets the kioskModeWifiAllowedSsids property value. The restricted set of WIFI SSIDs available for the user to configure in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getKioskModeWifiAllowedSsids() {
        return this.kioskModeWifiAllowedSsids;
    }
    /**
     * Gets the kioskModeWiFiConfigurationEnabled property value. Whether or not to allow a user to configure Wi-Fi settings in Kiosk Mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKioskModeWiFiConfigurationEnabled() {
        return this.kioskModeWiFiConfigurationEnabled;
    }
    /**
     * Gets the locateDeviceLostModeEnabled property value. Indicates whether or not LocateDevice for devices with lost mode (COBO, COPE) is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocateDeviceLostModeEnabled() {
        return this.locateDeviceLostModeEnabled;
    }
    /**
     * Gets the locateDeviceUserlessDisabled property value. Indicates whether or not LocateDevice for userless (COSU) devices is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocateDeviceUserlessDisabled() {
        return this.locateDeviceUserlessDisabled;
    }
    /**
     * Gets the microphoneForceMute property value. Indicates whether or not to block unmuting the microphone on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrophoneForceMute() {
        return this.microphoneForceMute;
    }
    /**
     * Gets the microsoftLauncherConfigurationEnabled property value. Indicates whether or not to you want configure Microsoft Launcher.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftLauncherConfigurationEnabled() {
        return this.microsoftLauncherConfigurationEnabled;
    }
    /**
     * Gets the microsoftLauncherCustomWallpaperAllowUserModification property value. Indicates whether or not the user can modify the wallpaper to personalize their device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftLauncherCustomWallpaperAllowUserModification() {
        return this.microsoftLauncherCustomWallpaperAllowUserModification;
    }
    /**
     * Gets the microsoftLauncherCustomWallpaperEnabled property value. Indicates whether or not to configure the wallpaper on the targeted devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftLauncherCustomWallpaperEnabled() {
        return this.microsoftLauncherCustomWallpaperEnabled;
    }
    /**
     * Gets the microsoftLauncherCustomWallpaperImageUrl property value. Indicates the URL for the image file to use as the wallpaper on the targeted devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMicrosoftLauncherCustomWallpaperImageUrl() {
        return this.microsoftLauncherCustomWallpaperImageUrl;
    }
    /**
     * Gets the microsoftLauncherDockPresenceAllowUserModification property value. Indicates whether or not the user can modify the device dock configuration on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftLauncherDockPresenceAllowUserModification() {
        return this.microsoftLauncherDockPresenceAllowUserModification;
    }
    /**
     * Gets the microsoftLauncherDockPresenceConfiguration property value. Indicates whether or not you want to configure the device dock. Possible values are: notConfigured, show, hide, disabled.
     * @return a microsoftLauncherDockPresence
     */
    @javax.annotation.Nullable
    public MicrosoftLauncherDockPresence getMicrosoftLauncherDockPresenceConfiguration() {
        return this.microsoftLauncherDockPresenceConfiguration;
    }
    /**
     * Gets the microsoftLauncherFeedAllowUserModification property value. Indicates whether or not the user can modify the launcher feed on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftLauncherFeedAllowUserModification() {
        return this.microsoftLauncherFeedAllowUserModification;
    }
    /**
     * Gets the microsoftLauncherFeedEnabled property value. Indicates whether or not you want to enable the launcher feed on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftLauncherFeedEnabled() {
        return this.microsoftLauncherFeedEnabled;
    }
    /**
     * Gets the microsoftLauncherSearchBarPlacementConfiguration property value. Indicates the search bar placement configuration on the device. Possible values are: notConfigured, top, bottom, hide.
     * @return a microsoftLauncherSearchBarPlacement
     */
    @javax.annotation.Nullable
    public MicrosoftLauncherSearchBarPlacement getMicrosoftLauncherSearchBarPlacementConfiguration() {
        return this.microsoftLauncherSearchBarPlacementConfiguration;
    }
    /**
     * Gets the networkEscapeHatchAllowed property value. Indicates whether or not the device will allow connecting to a temporary network connection at boot time.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNetworkEscapeHatchAllowed() {
        return this.networkEscapeHatchAllowed;
    }
    /**
     * Gets the nfcBlockOutgoingBeam property value. Indicates whether or not to block NFC outgoing beam.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNfcBlockOutgoingBeam() {
        return this.nfcBlockOutgoingBeam;
    }
    /**
     * Gets the passwordBlockKeyguard property value. Indicates whether or not the keyguard is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockKeyguard() {
        return this.passwordBlockKeyguard;
    }
    /**
     * Gets the passwordBlockKeyguardFeatures property value. List of device keyguard features to block. This collection can contain a maximum of 11 elements.
     * @return a androidKeyguardFeature
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidKeyguardFeature> getPasswordBlockKeyguardFeatures() {
        return this.passwordBlockKeyguardFeatures;
    }
    /**
     * Gets the passwordExpirationDays property value. Indicates the amount of time that a password can be set for before it expires and a new password will be required. Valid values 1 to 365
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumLength property value. Indicates the minimum length of the password required on the device. Valid values 4 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.passwordMinimumLength;
    }
    /**
     * Gets the passwordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLetterCharacters() {
        return this.passwordMinimumLetterCharacters;
    }
    /**
     * Gets the passwordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLowerCaseCharacters() {
        return this.passwordMinimumLowerCaseCharacters;
    }
    /**
     * Gets the passwordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumNonLetterCharacters() {
        return this.passwordMinimumNonLetterCharacters;
    }
    /**
     * Gets the passwordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumNumericCharacters() {
        return this.passwordMinimumNumericCharacters;
    }
    /**
     * Gets the passwordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumSymbolCharacters() {
        return this.passwordMinimumSymbolCharacters;
    }
    /**
     * Gets the passwordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumUpperCaseCharacters() {
        return this.passwordMinimumUpperCaseCharacters;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.passwordMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passwordPreviousPasswordCountToBlock property value. Indicates the length of password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordCountToBlock() {
        return this.passwordPreviousPasswordCountToBlock;
    }
    /**
     * Gets the passwordRequiredType property value. Indicates the minimum password quality required on the device. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @return a androidDeviceOwnerRequiredPasswordType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordType getPasswordRequiredType() {
        return this.passwordRequiredType;
    }
    /**
     * Gets the passwordRequireUnlock property value. Indicates the timeout period after which a device must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue.
     * @return a androidDeviceOwnerRequiredPasswordUnlock
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordUnlock getPasswordRequireUnlock() {
        return this.passwordRequireUnlock;
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this.passwordSignInFailureCountBeforeFactoryReset;
    }
    /**
     * Gets the personalProfileAppsAllowInstallFromUnknownSources property value. Indicates whether the user can install apps from unknown sources on the personal profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPersonalProfileAppsAllowInstallFromUnknownSources() {
        return this.personalProfileAppsAllowInstallFromUnknownSources;
    }
    /**
     * Gets the personalProfileCameraBlocked property value. Indicates whether to disable the use of the camera on the personal profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPersonalProfileCameraBlocked() {
        return this.personalProfileCameraBlocked;
    }
    /**
     * Gets the personalProfilePersonalApplications property value. Policy applied to applications in the personal profile. This collection can contain a maximum of 500 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getPersonalProfilePersonalApplications() {
        return this.personalProfilePersonalApplications;
    }
    /**
     * Gets the personalProfilePlayStoreMode property value. Used together with PersonalProfilePersonalApplications to control how apps in the personal profile are allowed or blocked. Possible values are: notConfigured, blockedApps, allowedApps.
     * @return a personalProfilePersonalPlayStoreMode
     */
    @javax.annotation.Nullable
    public PersonalProfilePersonalPlayStoreMode getPersonalProfilePlayStoreMode() {
        return this.personalProfilePlayStoreMode;
    }
    /**
     * Gets the personalProfileScreenCaptureBlocked property value. Indicates whether to disable the capability to take screenshots on the personal profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPersonalProfileScreenCaptureBlocked() {
        return this.personalProfileScreenCaptureBlocked;
    }
    /**
     * Gets the playStoreMode property value. Indicates the Play Store mode of the device. Possible values are: notConfigured, allowList, blockList.
     * @return a androidDeviceOwnerPlayStoreMode
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerPlayStoreMode getPlayStoreMode() {
        return this.playStoreMode;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to disable the capability to take screenshots.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.screenCaptureBlocked;
    }
    /**
     * Gets the securityCommonCriteriaModeEnabled property value. Represents the security common criteria mode enabled provided to users when they attempt to modify managed settings on their device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityCommonCriteriaModeEnabled() {
        return this.securityCommonCriteriaModeEnabled;
    }
    /**
     * Gets the securityDeveloperSettingsEnabled property value. Indicates whether or not the user is allowed to access developer settings like developer options and safe boot on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityDeveloperSettingsEnabled() {
        return this.securityDeveloperSettingsEnabled;
    }
    /**
     * Gets the securityRequireVerifyApps property value. Indicates whether or not verify apps is required.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityRequireVerifyApps() {
        return this.securityRequireVerifyApps;
    }
    /**
     * Gets the shortHelpText property value. Represents the customized short help text provided to users when they attempt to modify managed settings on their device.
     * @return a androidDeviceOwnerUserFacingMessage
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerUserFacingMessage getShortHelpText() {
        return this.shortHelpText;
    }
    /**
     * Gets the statusBarBlocked property value. Indicates whether or the status bar is disabled, including notifications, quick settings and other screen overlays.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStatusBarBlocked() {
        return this.statusBarBlocked;
    }
    /**
     * Gets the stayOnModes property value. List of modes in which the device's display will stay powered-on. This collection can contain a maximum of 4 elements.
     * @return a androidDeviceOwnerBatteryPluggedMode
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerBatteryPluggedMode> getStayOnModes() {
        return this.stayOnModes;
    }
    /**
     * Gets the storageAllowUsb property value. Indicates whether or not to allow USB mass storage.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageAllowUsb() {
        return this.storageAllowUsb;
    }
    /**
     * Gets the storageBlockExternalMedia property value. Indicates whether or not to block external media.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockExternalMedia() {
        return this.storageBlockExternalMedia;
    }
    /**
     * Gets the storageBlockUsbFileTransfer property value. Indicates whether or not to block USB file transfer.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageBlockUsbFileTransfer() {
        return this.storageBlockUsbFileTransfer;
    }
    /**
     * Gets the systemUpdateFreezePeriods property value. Indicates the annually repeating time periods during which system updates are postponed. This collection can contain a maximum of 500 elements.
     * @return a androidDeviceOwnerSystemUpdateFreezePeriod
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerSystemUpdateFreezePeriod> getSystemUpdateFreezePeriods() {
        return this.systemUpdateFreezePeriods;
    }
    /**
     * Gets the systemUpdateInstallType property value. The type of system update configuration. Possible values are: deviceDefault, postpone, windowed, automatic.
     * @return a androidDeviceOwnerSystemUpdateInstallType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerSystemUpdateInstallType getSystemUpdateInstallType() {
        return this.systemUpdateInstallType;
    }
    /**
     * Gets the systemUpdateWindowEndMinutesAfterMidnight property value. Indicates the number of minutes after midnight that the system update window ends. Valid values 0 to 1440
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSystemUpdateWindowEndMinutesAfterMidnight() {
        return this.systemUpdateWindowEndMinutesAfterMidnight;
    }
    /**
     * Gets the systemUpdateWindowStartMinutesAfterMidnight property value. Indicates the number of minutes after midnight that the system update window starts. Valid values 0 to 1440
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSystemUpdateWindowStartMinutesAfterMidnight() {
        return this.systemUpdateWindowStartMinutesAfterMidnight;
    }
    /**
     * Gets the systemWindowsBlocked property value. Whether or not to block Android system prompt windows, like toasts, phone activities, and system alerts.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSystemWindowsBlocked() {
        return this.systemWindowsBlocked;
    }
    /**
     * Gets the usersBlockAdd property value. Indicates whether or not adding users and profiles is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUsersBlockAdd() {
        return this.usersBlockAdd;
    }
    /**
     * Gets the usersBlockRemove property value. Indicates whether or not to disable removing other users from the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUsersBlockRemove() {
        return this.usersBlockRemove;
    }
    /**
     * Gets the volumeBlockAdjustment property value. Indicates whether or not adjusting the master volume is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVolumeBlockAdjustment() {
        return this.volumeBlockAdjustment;
    }
    /**
     * Gets the vpnAlwaysOnLockdownMode property value. If an always on VPN package name is specified, whether or not to lock network traffic when that VPN is disconnected.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getVpnAlwaysOnLockdownMode() {
        return this.vpnAlwaysOnLockdownMode;
    }
    /**
     * Gets the vpnAlwaysOnPackageIdentifier property value. Android app package name for app that will handle an always-on VPN connection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVpnAlwaysOnPackageIdentifier() {
        return this.vpnAlwaysOnPackageIdentifier;
    }
    /**
     * Gets the wifiBlockEditConfigurations property value. Indicates whether or not to block the user from editing the wifi connection settings.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWifiBlockEditConfigurations() {
        return this.wifiBlockEditConfigurations;
    }
    /**
     * Gets the wifiBlockEditPolicyDefinedConfigurations property value. Indicates whether or not to block the user from editing just the networks defined by the policy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWifiBlockEditPolicyDefinedConfigurations() {
        return this.wifiBlockEditPolicyDefinedConfigurations;
    }
    /**
     * Gets the workProfilePasswordExpirationDays property value. Indicates the number of days that a work profile password can be set before it expires and a new password will be required. Valid values 1 to 365
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordExpirationDays() {
        return this.workProfilePasswordExpirationDays;
    }
    /**
     * Gets the workProfilePasswordMinimumLength property value. Indicates the minimum length of the work profile password. Valid values 4 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumLength() {
        return this.workProfilePasswordMinimumLength;
    }
    /**
     * Gets the workProfilePasswordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for the work profile password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumLetterCharacters() {
        return this.workProfilePasswordMinimumLetterCharacters;
    }
    /**
     * Gets the workProfilePasswordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower-case characters required for the work profile password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumLowerCaseCharacters() {
        return this.workProfilePasswordMinimumLowerCaseCharacters;
    }
    /**
     * Gets the workProfilePasswordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for the work profile password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumNonLetterCharacters() {
        return this.workProfilePasswordMinimumNonLetterCharacters;
    }
    /**
     * Gets the workProfilePasswordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for the work profile password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumNumericCharacters() {
        return this.workProfilePasswordMinimumNumericCharacters;
    }
    /**
     * Gets the workProfilePasswordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for the work profile password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumSymbolCharacters() {
        return this.workProfilePasswordMinimumSymbolCharacters;
    }
    /**
     * Gets the workProfilePasswordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper-case letter characters required for the work profile password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumUpperCaseCharacters() {
        return this.workProfilePasswordMinimumUpperCaseCharacters;
    }
    /**
     * Gets the workProfilePasswordPreviousPasswordCountToBlock property value. Indicates the length of the work profile password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordPreviousPasswordCountToBlock() {
        return this.workProfilePasswordPreviousPasswordCountToBlock;
    }
    /**
     * Gets the workProfilePasswordRequiredType property value. Indicates the minimum password quality required on the work profile password. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @return a androidDeviceOwnerRequiredPasswordType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordType getWorkProfilePasswordRequiredType() {
        return this.workProfilePasswordRequiredType;
    }
    /**
     * Gets the workProfilePasswordRequireUnlock property value. Indicates the timeout period after which a work profile must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue.
     * @return a androidDeviceOwnerRequiredPasswordUnlock
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordUnlock getWorkProfilePasswordRequireUnlock() {
        return this.workProfilePasswordRequireUnlock;
    }
    /**
     * Gets the workProfilePasswordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect work profile password before the device is wiped. Valid values 4 to 11
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWorkProfilePasswordSignInFailureCountBeforeFactoryReset() {
        return this.workProfilePasswordSignInFailureCountBeforeFactoryReset;
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
        writer.writeBooleanValue("locateDeviceLostModeEnabled", this.getLocateDeviceLostModeEnabled());
        writer.writeBooleanValue("locateDeviceUserlessDisabled", this.getLocateDeviceUserlessDisabled());
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
        this.accountsBlockModification = value;
    }
    /**
     * Sets the appsAllowInstallFromUnknownSources property value. Indicates whether or not the user is allowed to enable to unknown sources setting.
     * @param value Value to set for the appsAllowInstallFromUnknownSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsAllowInstallFromUnknownSources(@javax.annotation.Nullable final Boolean value) {
        this.appsAllowInstallFromUnknownSources = value;
    }
    /**
     * Sets the appsAutoUpdatePolicy property value. Indicates the value of the app auto update policy. Possible values are: notConfigured, userChoice, never, wiFiOnly, always.
     * @param value Value to set for the appsAutoUpdatePolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsAutoUpdatePolicy(@javax.annotation.Nullable final AndroidDeviceOwnerAppAutoUpdatePolicyType value) {
        this.appsAutoUpdatePolicy = value;
    }
    /**
     * Sets the appsDefaultPermissionPolicy property value. Indicates the permission policy for requests for runtime permissions if one is not defined for the app specifically. Possible values are: deviceDefault, prompt, autoGrant, autoDeny.
     * @param value Value to set for the appsDefaultPermissionPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsDefaultPermissionPolicy(@javax.annotation.Nullable final AndroidDeviceOwnerDefaultAppPermissionPolicyType value) {
        this.appsDefaultPermissionPolicy = value;
    }
    /**
     * Sets the appsRecommendSkippingFirstUseHints property value. Whether or not to recommend all apps skip any first-time-use hints they may have added.
     * @param value Value to set for the appsRecommendSkippingFirstUseHints property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppsRecommendSkippingFirstUseHints(@javax.annotation.Nullable final Boolean value) {
        this.appsRecommendSkippingFirstUseHints = value;
    }
    /**
     * Sets the azureAdSharedDeviceDataClearApps property value. A list of managed apps that will have their data cleared during a global sign-out in AAD shared device mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the azureAdSharedDeviceDataClearApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureAdSharedDeviceDataClearApps(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this.azureAdSharedDeviceDataClearApps = value;
    }
    /**
     * Sets the bluetoothBlockConfiguration property value. Indicates whether or not to block a user from configuring bluetooth.
     * @param value Value to set for the bluetoothBlockConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockConfiguration(@javax.annotation.Nullable final Boolean value) {
        this.bluetoothBlockConfiguration = value;
    }
    /**
     * Sets the bluetoothBlockContactSharing property value. Indicates whether or not to block a user from sharing contacts via bluetooth.
     * @param value Value to set for the bluetoothBlockContactSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBluetoothBlockContactSharing(@javax.annotation.Nullable final Boolean value) {
        this.bluetoothBlockContactSharing = value;
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to disable the use of the camera.
     * @param value Value to set for the cameraBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this.cameraBlocked = value;
    }
    /**
     * Sets the cellularBlockWiFiTethering property value. Indicates whether or not to block Wi-Fi tethering.
     * @param value Value to set for the cellularBlockWiFiTethering property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularBlockWiFiTethering(@javax.annotation.Nullable final Boolean value) {
        this.cellularBlockWiFiTethering = value;
    }
    /**
     * Sets the certificateCredentialConfigurationDisabled property value. Indicates whether or not to block users from any certificate credential configuration.
     * @param value Value to set for the certificateCredentialConfigurationDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateCredentialConfigurationDisabled(@javax.annotation.Nullable final Boolean value) {
        this.certificateCredentialConfigurationDisabled = value;
    }
    /**
     * Sets the crossProfilePoliciesAllowCopyPaste property value. Indicates whether or not text copied from one profile (personal or work) can be pasted in the other.
     * @param value Value to set for the crossProfilePoliciesAllowCopyPaste property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCrossProfilePoliciesAllowCopyPaste(@javax.annotation.Nullable final Boolean value) {
        this.crossProfilePoliciesAllowCopyPaste = value;
    }
    /**
     * Sets the crossProfilePoliciesAllowDataSharing property value. Indicates whether data from one profile (personal or work) can be shared with apps in the other profile. Possible values are: notConfigured, crossProfileDataSharingBlocked, dataSharingFromWorkToPersonalBlocked, crossProfileDataSharingAllowed, unkownFutureValue.
     * @param value Value to set for the crossProfilePoliciesAllowDataSharing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCrossProfilePoliciesAllowDataSharing(@javax.annotation.Nullable final AndroidDeviceOwnerCrossProfileDataSharing value) {
        this.crossProfilePoliciesAllowDataSharing = value;
    }
    /**
     * Sets the crossProfilePoliciesShowWorkContactsInPersonalProfile property value. Indicates whether or not contacts stored in work profile are shown in personal profile contact searches/incoming calls.
     * @param value Value to set for the crossProfilePoliciesShowWorkContactsInPersonalProfile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCrossProfilePoliciesShowWorkContactsInPersonalProfile(@javax.annotation.Nullable final Boolean value) {
        this.crossProfilePoliciesShowWorkContactsInPersonalProfile = value;
    }
    /**
     * Sets the dataRoamingBlocked property value. Indicates whether or not to block a user from data roaming.
     * @param value Value to set for the dataRoamingBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataRoamingBlocked(@javax.annotation.Nullable final Boolean value) {
        this.dataRoamingBlocked = value;
    }
    /**
     * Sets the dateTimeConfigurationBlocked property value. Indicates whether or not to block the user from manually changing the date or time on the device
     * @param value Value to set for the dateTimeConfigurationBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDateTimeConfigurationBlocked(@javax.annotation.Nullable final Boolean value) {
        this.dateTimeConfigurationBlocked = value;
    }
    /**
     * Sets the detailedHelpText property value. Represents the customized detailed help text provided to users when they attempt to modify managed settings on their device.
     * @param value Value to set for the detailedHelpText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetailedHelpText(@javax.annotation.Nullable final AndroidDeviceOwnerUserFacingMessage value) {
        this.detailedHelpText = value;
    }
    /**
     * Sets the deviceOwnerLockScreenMessage property value. Represents the customized lock screen message provided to users when they attempt to modify managed settings on their device.
     * @param value Value to set for the deviceOwnerLockScreenMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceOwnerLockScreenMessage(@javax.annotation.Nullable final AndroidDeviceOwnerUserFacingMessage value) {
        this.deviceOwnerLockScreenMessage = value;
    }
    /**
     * Sets the enrollmentProfile property value. Android Device Owner Enrollment Profile types.
     * @param value Value to set for the enrollmentProfile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentProfile(@javax.annotation.Nullable final AndroidDeviceOwnerEnrollmentProfileType value) {
        this.enrollmentProfile = value;
    }
    /**
     * Sets the factoryResetBlocked property value. Indicates whether or not the factory reset option in settings is disabled.
     * @param value Value to set for the factoryResetBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFactoryResetBlocked(@javax.annotation.Nullable final Boolean value) {
        this.factoryResetBlocked = value;
    }
    /**
     * Sets the factoryResetDeviceAdministratorEmails property value. List of Google account emails that will be required to authenticate after a device is factory reset before it can be set up.
     * @param value Value to set for the factoryResetDeviceAdministratorEmails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFactoryResetDeviceAdministratorEmails(@javax.annotation.Nullable final java.util.List<String> value) {
        this.factoryResetDeviceAdministratorEmails = value;
    }
    /**
     * Sets the globalProxy property value. Proxy is set up directly with host, port and excluded hosts.
     * @param value Value to set for the globalProxy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGlobalProxy(@javax.annotation.Nullable final AndroidDeviceOwnerGlobalProxy value) {
        this.globalProxy = value;
    }
    /**
     * Sets the googleAccountsBlocked property value. Indicates whether or not google accounts will be blocked.
     * @param value Value to set for the googleAccountsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGoogleAccountsBlocked(@javax.annotation.Nullable final Boolean value) {
        this.googleAccountsBlocked = value;
    }
    /**
     * Sets the kioskCustomizationDeviceSettingsBlocked property value. Indicateswhether a user can access the device's Settings app while in Kiosk Mode.
     * @param value Value to set for the kioskCustomizationDeviceSettingsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskCustomizationDeviceSettingsBlocked(@javax.annotation.Nullable final Boolean value) {
        this.kioskCustomizationDeviceSettingsBlocked = value;
    }
    /**
     * Sets the kioskCustomizationPowerButtonActionsBlocked property value. Whether the power menu is shown when a user long presses the Power button of a device in Kiosk Mode.
     * @param value Value to set for the kioskCustomizationPowerButtonActionsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskCustomizationPowerButtonActionsBlocked(@javax.annotation.Nullable final Boolean value) {
        this.kioskCustomizationPowerButtonActionsBlocked = value;
    }
    /**
     * Sets the kioskCustomizationStatusBar property value. Indicates whether system info and notifications are disabled in Kiosk Mode. Possible values are: notConfigured, notificationsAndSystemInfoEnabled, systemInfoOnly.
     * @param value Value to set for the kioskCustomizationStatusBar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskCustomizationStatusBar(@javax.annotation.Nullable final AndroidDeviceOwnerKioskCustomizationStatusBar value) {
        this.kioskCustomizationStatusBar = value;
    }
    /**
     * Sets the kioskCustomizationSystemErrorWarnings property value. Indicates whether system error dialogs for crashed or unresponsive apps are shown in Kiosk Mode.
     * @param value Value to set for the kioskCustomizationSystemErrorWarnings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskCustomizationSystemErrorWarnings(@javax.annotation.Nullable final Boolean value) {
        this.kioskCustomizationSystemErrorWarnings = value;
    }
    /**
     * Sets the kioskCustomizationSystemNavigation property value. Indicates which navigation features are enabled in Kiosk Mode. Possible values are: notConfigured, navigationEnabled, homeButtonOnly.
     * @param value Value to set for the kioskCustomizationSystemNavigation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskCustomizationSystemNavigation(@javax.annotation.Nullable final AndroidDeviceOwnerKioskCustomizationSystemNavigation value) {
        this.kioskCustomizationSystemNavigation = value;
    }
    /**
     * Sets the kioskModeAppOrderEnabled property value. Whether or not to enable app ordering in Kiosk Mode.
     * @param value Value to set for the kioskModeAppOrderEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAppOrderEnabled(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeAppOrderEnabled = value;
    }
    /**
     * Sets the kioskModeAppPositions property value. The ordering of items on Kiosk Mode Managed Home Screen. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeAppPositions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAppPositions(@javax.annotation.Nullable final java.util.List<AndroidDeviceOwnerKioskModeAppPositionItem> value) {
        this.kioskModeAppPositions = value;
    }
    /**
     * Sets the kioskModeApps property value. A list of managed apps that will be shown when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeApps(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this.kioskModeApps = value;
    }
    /**
     * Sets the kioskModeAppsInFolderOrderedByName property value. Whether or not to alphabetize applications within a folder in Kiosk Mode.
     * @param value Value to set for the kioskModeAppsInFolderOrderedByName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeAppsInFolderOrderedByName(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeAppsInFolderOrderedByName = value;
    }
    /**
     * Sets the kioskModeBluetoothConfigurationEnabled property value. Whether or not to allow a user to configure Bluetooth settings in Kiosk Mode.
     * @param value Value to set for the kioskModeBluetoothConfigurationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeBluetoothConfigurationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeBluetoothConfigurationEnabled = value;
    }
    /**
     * Sets the kioskModeDebugMenuEasyAccessEnabled property value. Whether or not to allow a user to easy access to the debug menu in Kiosk Mode.
     * @param value Value to set for the kioskModeDebugMenuEasyAccessEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeDebugMenuEasyAccessEnabled(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeDebugMenuEasyAccessEnabled = value;
    }
    /**
     * Sets the kioskModeExitCode property value. Exit code to allow a user to escape from Kiosk Mode when the device is in Kiosk Mode.
     * @param value Value to set for the kioskModeExitCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeExitCode(@javax.annotation.Nullable final String value) {
        this.kioskModeExitCode = value;
    }
    /**
     * Sets the kioskModeFlashlightConfigurationEnabled property value. Whether or not to allow a user to use the flashlight in Kiosk Mode.
     * @param value Value to set for the kioskModeFlashlightConfigurationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeFlashlightConfigurationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeFlashlightConfigurationEnabled = value;
    }
    /**
     * Sets the kioskModeFolderIcon property value. Folder icon configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, darkSquare, darkCircle, lightSquare, lightCircle.
     * @param value Value to set for the kioskModeFolderIcon property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeFolderIcon(@javax.annotation.Nullable final AndroidDeviceOwnerKioskModeFolderIcon value) {
        this.kioskModeFolderIcon = value;
    }
    /**
     * Sets the kioskModeGridHeight property value. Number of rows for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999
     * @param value Value to set for the kioskModeGridHeight property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeGridHeight(@javax.annotation.Nullable final Integer value) {
        this.kioskModeGridHeight = value;
    }
    /**
     * Sets the kioskModeGridWidth property value. Number of columns for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999
     * @param value Value to set for the kioskModeGridWidth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeGridWidth(@javax.annotation.Nullable final Integer value) {
        this.kioskModeGridWidth = value;
    }
    /**
     * Sets the kioskModeIconSize property value. Icon size configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, smallest, small, regular, large, largest.
     * @param value Value to set for the kioskModeIconSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeIconSize(@javax.annotation.Nullable final AndroidDeviceOwnerKioskModeIconSize value) {
        this.kioskModeIconSize = value;
    }
    /**
     * Sets the kioskModeLockHomeScreen property value. Whether or not to lock home screen to the end user in Kiosk Mode.
     * @param value Value to set for the kioskModeLockHomeScreen property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeLockHomeScreen(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeLockHomeScreen = value;
    }
    /**
     * Sets the kioskModeManagedFolders property value. A list of managed folders for a device in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeManagedFolders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedFolders(@javax.annotation.Nullable final java.util.List<AndroidDeviceOwnerKioskModeManagedFolder> value) {
        this.kioskModeManagedFolders = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenAutoSignout property value. Whether or not to automatically sign-out of MHS and Shared device mode applications after inactive for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenAutoSignout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenAutoSignout(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeManagedHomeScreenAutoSignout = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds property value. Number of seconds to give user notice before automatically signing them out for Managed Home Screen. Valid values 0 to 9999999
     * @param value Value to set for the kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenInactiveSignOutDelayInSeconds(@javax.annotation.Nullable final Integer value) {
        this.kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds property value. Number of seconds device is inactive before automatically signing user out for Managed Home Screen. Valid values 0 to 9999999
     * @param value Value to set for the kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds(@javax.annotation.Nullable final Integer value) {
        this.kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenPinComplexity property value. Complexity of PIN for sign-in session for Managed Home Screen. Possible values are: notConfigured, simple, complex.
     * @param value Value to set for the kioskModeManagedHomeScreenPinComplexity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenPinComplexity(@javax.annotation.Nullable final KioskModeManagedHomeScreenPinComplexity value) {
        this.kioskModeManagedHomeScreenPinComplexity = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenPinRequired property value. Whether or not require user to set a PIN for sign-in session for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenPinRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenPinRequired(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeManagedHomeScreenPinRequired = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenPinRequiredToResume property value. Whether or not required user to enter session PIN if screensaver has appeared for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenPinRequiredToResume property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenPinRequiredToResume(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeManagedHomeScreenPinRequiredToResume = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenSignInBackground property value. Custom URL background for sign-in screen for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenSignInBackground property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenSignInBackground(@javax.annotation.Nullable final String value) {
        this.kioskModeManagedHomeScreenSignInBackground = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenSignInBrandingLogo property value. Custom URL branding logo for sign-in screen and session pin page for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenSignInBrandingLogo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenSignInBrandingLogo(@javax.annotation.Nullable final String value) {
        this.kioskModeManagedHomeScreenSignInBrandingLogo = value;
    }
    /**
     * Sets the kioskModeManagedHomeScreenSignInEnabled property value. Whether or not show sign-in screen for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenSignInEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedHomeScreenSignInEnabled(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeManagedHomeScreenSignInEnabled = value;
    }
    /**
     * Sets the kioskModeManagedSettingsEntryDisabled property value. Whether or not to display the Managed Settings entry point on the managed home screen in Kiosk Mode.
     * @param value Value to set for the kioskModeManagedSettingsEntryDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeManagedSettingsEntryDisabled(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeManagedSettingsEntryDisabled = value;
    }
    /**
     * Sets the kioskModeMediaVolumeConfigurationEnabled property value. Whether or not to allow a user to change the media volume in Kiosk Mode.
     * @param value Value to set for the kioskModeMediaVolumeConfigurationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeMediaVolumeConfigurationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeMediaVolumeConfigurationEnabled = value;
    }
    /**
     * Sets the kioskModeScreenOrientation property value. Screen orientation configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, portrait, landscape, autoRotate.
     * @param value Value to set for the kioskModeScreenOrientation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeScreenOrientation(@javax.annotation.Nullable final AndroidDeviceOwnerKioskModeScreenOrientation value) {
        this.kioskModeScreenOrientation = value;
    }
    /**
     * Sets the kioskModeScreenSaverConfigurationEnabled property value. Whether or not to enable screen saver mode or not in Kiosk Mode.
     * @param value Value to set for the kioskModeScreenSaverConfigurationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeScreenSaverConfigurationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeScreenSaverConfigurationEnabled = value;
    }
    /**
     * Sets the kioskModeScreenSaverDetectMediaDisabled property value. Whether or not the device screen should show the screen saver if audio/video is playing in Kiosk Mode.
     * @param value Value to set for the kioskModeScreenSaverDetectMediaDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeScreenSaverDetectMediaDisabled(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeScreenSaverDetectMediaDisabled = value;
    }
    /**
     * Sets the kioskModeScreenSaverDisplayTimeInSeconds property value. The number of seconds that the device will display the screen saver for in Kiosk Mode. Valid values 0 to 9999999
     * @param value Value to set for the kioskModeScreenSaverDisplayTimeInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeScreenSaverDisplayTimeInSeconds(@javax.annotation.Nullable final Integer value) {
        this.kioskModeScreenSaverDisplayTimeInSeconds = value;
    }
    /**
     * Sets the kioskModeScreenSaverImageUrl property value. URL for an image that will be the device's screen saver in Kiosk Mode.
     * @param value Value to set for the kioskModeScreenSaverImageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeScreenSaverImageUrl(@javax.annotation.Nullable final String value) {
        this.kioskModeScreenSaverImageUrl = value;
    }
    /**
     * Sets the kioskModeScreenSaverStartDelayInSeconds property value. The number of seconds the device needs to be inactive for before the screen saver is shown in Kiosk Mode. Valid values 1 to 9999999
     * @param value Value to set for the kioskModeScreenSaverStartDelayInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeScreenSaverStartDelayInSeconds(@javax.annotation.Nullable final Integer value) {
        this.kioskModeScreenSaverStartDelayInSeconds = value;
    }
    /**
     * Sets the kioskModeShowAppNotificationBadge property value. Whether or not to display application notification badges in Kiosk Mode.
     * @param value Value to set for the kioskModeShowAppNotificationBadge property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeShowAppNotificationBadge(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeShowAppNotificationBadge = value;
    }
    /**
     * Sets the kioskModeShowDeviceInfo property value. Whether or not to allow a user to access basic device information.
     * @param value Value to set for the kioskModeShowDeviceInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeShowDeviceInfo(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeShowDeviceInfo = value;
    }
    /**
     * Sets the kioskModeUseManagedHomeScreenApp property value. Whether or not to use single app kiosk mode or multi-app kiosk mode. Possible values are: notConfigured, singleAppMode, multiAppMode.
     * @param value Value to set for the kioskModeUseManagedHomeScreenApp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeUseManagedHomeScreenApp(@javax.annotation.Nullable final KioskModeType value) {
        this.kioskModeUseManagedHomeScreenApp = value;
    }
    /**
     * Sets the kioskModeVirtualHomeButtonEnabled property value. Whether or not to display a virtual home button when the device is in Kiosk Mode.
     * @param value Value to set for the kioskModeVirtualHomeButtonEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeVirtualHomeButtonEnabled(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeVirtualHomeButtonEnabled = value;
    }
    /**
     * Sets the kioskModeVirtualHomeButtonType property value. Indicates whether the virtual home button is a swipe up home button or a floating home button. Possible values are: notConfigured, swipeUp, floating.
     * @param value Value to set for the kioskModeVirtualHomeButtonType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeVirtualHomeButtonType(@javax.annotation.Nullable final AndroidDeviceOwnerVirtualHomeButtonType value) {
        this.kioskModeVirtualHomeButtonType = value;
    }
    /**
     * Sets the kioskModeWallpaperUrl property value. URL to a publicly accessible image to use for the wallpaper when the device is in Kiosk Mode.
     * @param value Value to set for the kioskModeWallpaperUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeWallpaperUrl(@javax.annotation.Nullable final String value) {
        this.kioskModeWallpaperUrl = value;
    }
    /**
     * Sets the kioskModeWifiAllowedSsids property value. The restricted set of WIFI SSIDs available for the user to configure in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeWifiAllowedSsids property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeWifiAllowedSsids(@javax.annotation.Nullable final java.util.List<String> value) {
        this.kioskModeWifiAllowedSsids = value;
    }
    /**
     * Sets the kioskModeWiFiConfigurationEnabled property value. Whether or not to allow a user to configure Wi-Fi settings in Kiosk Mode.
     * @param value Value to set for the kioskModeWiFiConfigurationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKioskModeWiFiConfigurationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.kioskModeWiFiConfigurationEnabled = value;
    }
    /**
     * Sets the locateDeviceLostModeEnabled property value. Indicates whether or not LocateDevice for devices with lost mode (COBO, COPE) is enabled.
     * @param value Value to set for the locateDeviceLostModeEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocateDeviceLostModeEnabled(@javax.annotation.Nullable final Boolean value) {
        this.locateDeviceLostModeEnabled = value;
    }
    /**
     * Sets the locateDeviceUserlessDisabled property value. Indicates whether or not LocateDevice for userless (COSU) devices is disabled.
     * @param value Value to set for the locateDeviceUserlessDisabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocateDeviceUserlessDisabled(@javax.annotation.Nullable final Boolean value) {
        this.locateDeviceUserlessDisabled = value;
    }
    /**
     * Sets the microphoneForceMute property value. Indicates whether or not to block unmuting the microphone on the device.
     * @param value Value to set for the microphoneForceMute property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrophoneForceMute(@javax.annotation.Nullable final Boolean value) {
        this.microphoneForceMute = value;
    }
    /**
     * Sets the microsoftLauncherConfigurationEnabled property value. Indicates whether or not to you want configure Microsoft Launcher.
     * @param value Value to set for the microsoftLauncherConfigurationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherConfigurationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.microsoftLauncherConfigurationEnabled = value;
    }
    /**
     * Sets the microsoftLauncherCustomWallpaperAllowUserModification property value. Indicates whether or not the user can modify the wallpaper to personalize their device.
     * @param value Value to set for the microsoftLauncherCustomWallpaperAllowUserModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherCustomWallpaperAllowUserModification(@javax.annotation.Nullable final Boolean value) {
        this.microsoftLauncherCustomWallpaperAllowUserModification = value;
    }
    /**
     * Sets the microsoftLauncherCustomWallpaperEnabled property value. Indicates whether or not to configure the wallpaper on the targeted devices.
     * @param value Value to set for the microsoftLauncherCustomWallpaperEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherCustomWallpaperEnabled(@javax.annotation.Nullable final Boolean value) {
        this.microsoftLauncherCustomWallpaperEnabled = value;
    }
    /**
     * Sets the microsoftLauncherCustomWallpaperImageUrl property value. Indicates the URL for the image file to use as the wallpaper on the targeted devices.
     * @param value Value to set for the microsoftLauncherCustomWallpaperImageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherCustomWallpaperImageUrl(@javax.annotation.Nullable final String value) {
        this.microsoftLauncherCustomWallpaperImageUrl = value;
    }
    /**
     * Sets the microsoftLauncherDockPresenceAllowUserModification property value. Indicates whether or not the user can modify the device dock configuration on the device.
     * @param value Value to set for the microsoftLauncherDockPresenceAllowUserModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherDockPresenceAllowUserModification(@javax.annotation.Nullable final Boolean value) {
        this.microsoftLauncherDockPresenceAllowUserModification = value;
    }
    /**
     * Sets the microsoftLauncherDockPresenceConfiguration property value. Indicates whether or not you want to configure the device dock. Possible values are: notConfigured, show, hide, disabled.
     * @param value Value to set for the microsoftLauncherDockPresenceConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherDockPresenceConfiguration(@javax.annotation.Nullable final MicrosoftLauncherDockPresence value) {
        this.microsoftLauncherDockPresenceConfiguration = value;
    }
    /**
     * Sets the microsoftLauncherFeedAllowUserModification property value. Indicates whether or not the user can modify the launcher feed on the device.
     * @param value Value to set for the microsoftLauncherFeedAllowUserModification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherFeedAllowUserModification(@javax.annotation.Nullable final Boolean value) {
        this.microsoftLauncherFeedAllowUserModification = value;
    }
    /**
     * Sets the microsoftLauncherFeedEnabled property value. Indicates whether or not you want to enable the launcher feed on the device.
     * @param value Value to set for the microsoftLauncherFeedEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherFeedEnabled(@javax.annotation.Nullable final Boolean value) {
        this.microsoftLauncherFeedEnabled = value;
    }
    /**
     * Sets the microsoftLauncherSearchBarPlacementConfiguration property value. Indicates the search bar placement configuration on the device. Possible values are: notConfigured, top, bottom, hide.
     * @param value Value to set for the microsoftLauncherSearchBarPlacementConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftLauncherSearchBarPlacementConfiguration(@javax.annotation.Nullable final MicrosoftLauncherSearchBarPlacement value) {
        this.microsoftLauncherSearchBarPlacementConfiguration = value;
    }
    /**
     * Sets the networkEscapeHatchAllowed property value. Indicates whether or not the device will allow connecting to a temporary network connection at boot time.
     * @param value Value to set for the networkEscapeHatchAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkEscapeHatchAllowed(@javax.annotation.Nullable final Boolean value) {
        this.networkEscapeHatchAllowed = value;
    }
    /**
     * Sets the nfcBlockOutgoingBeam property value. Indicates whether or not to block NFC outgoing beam.
     * @param value Value to set for the nfcBlockOutgoingBeam property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNfcBlockOutgoingBeam(@javax.annotation.Nullable final Boolean value) {
        this.nfcBlockOutgoingBeam = value;
    }
    /**
     * Sets the passwordBlockKeyguard property value. Indicates whether or not the keyguard is disabled.
     * @param value Value to set for the passwordBlockKeyguard property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockKeyguard(@javax.annotation.Nullable final Boolean value) {
        this.passwordBlockKeyguard = value;
    }
    /**
     * Sets the passwordBlockKeyguardFeatures property value. List of device keyguard features to block. This collection can contain a maximum of 11 elements.
     * @param value Value to set for the passwordBlockKeyguardFeatures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordBlockKeyguardFeatures(@javax.annotation.Nullable final java.util.List<AndroidKeyguardFeature> value) {
        this.passwordBlockKeyguardFeatures = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Indicates the amount of time that a password can be set for before it expires and a new password will be required. Valid values 1 to 365
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this.passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Indicates the minimum length of the password required on the device. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumLetterCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLetterCharacters(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumLetterCharacters = value;
    }
    /**
     * Sets the passwordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumLowerCaseCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumLowerCaseCharacters(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumLowerCaseCharacters = value;
    }
    /**
     * Sets the passwordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumNonLetterCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumNonLetterCharacters(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumNonLetterCharacters = value;
    }
    /**
     * Sets the passwordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumNumericCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumNumericCharacters(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumNumericCharacters = value;
    }
    /**
     * Sets the passwordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumSymbolCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumSymbolCharacters(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumSymbolCharacters = value;
    }
    /**
     * Sets the passwordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumUpperCaseCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinimumUpperCaseCharacters(@javax.annotation.Nullable final Integer value) {
        this.passwordMinimumUpperCaseCharacters = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this.passwordMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passwordPreviousPasswordCountToBlock property value. Indicates the length of password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24
     * @param value Value to set for the passwordPreviousPasswordCountToBlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordPreviousPasswordCountToBlock(@javax.annotation.Nullable final Integer value) {
        this.passwordPreviousPasswordCountToBlock = value;
    }
    /**
     * Sets the passwordRequiredType property value. Indicates the minimum password quality required on the device. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequiredType(@javax.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordType value) {
        this.passwordRequiredType = value;
    }
    /**
     * Sets the passwordRequireUnlock property value. Indicates the timeout period after which a device must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue.
     * @param value Value to set for the passwordRequireUnlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordRequireUnlock(@javax.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordUnlock value) {
        this.passwordRequireUnlock = value;
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this.passwordSignInFailureCountBeforeFactoryReset = value;
    }
    /**
     * Sets the personalProfileAppsAllowInstallFromUnknownSources property value. Indicates whether the user can install apps from unknown sources on the personal profile.
     * @param value Value to set for the personalProfileAppsAllowInstallFromUnknownSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalProfileAppsAllowInstallFromUnknownSources(@javax.annotation.Nullable final Boolean value) {
        this.personalProfileAppsAllowInstallFromUnknownSources = value;
    }
    /**
     * Sets the personalProfileCameraBlocked property value. Indicates whether to disable the use of the camera on the personal profile.
     * @param value Value to set for the personalProfileCameraBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalProfileCameraBlocked(@javax.annotation.Nullable final Boolean value) {
        this.personalProfileCameraBlocked = value;
    }
    /**
     * Sets the personalProfilePersonalApplications property value. Policy applied to applications in the personal profile. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the personalProfilePersonalApplications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalProfilePersonalApplications(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this.personalProfilePersonalApplications = value;
    }
    /**
     * Sets the personalProfilePlayStoreMode property value. Used together with PersonalProfilePersonalApplications to control how apps in the personal profile are allowed or blocked. Possible values are: notConfigured, blockedApps, allowedApps.
     * @param value Value to set for the personalProfilePlayStoreMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalProfilePlayStoreMode(@javax.annotation.Nullable final PersonalProfilePersonalPlayStoreMode value) {
        this.personalProfilePlayStoreMode = value;
    }
    /**
     * Sets the personalProfileScreenCaptureBlocked property value. Indicates whether to disable the capability to take screenshots on the personal profile.
     * @param value Value to set for the personalProfileScreenCaptureBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalProfileScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this.personalProfileScreenCaptureBlocked = value;
    }
    /**
     * Sets the playStoreMode property value. Indicates the Play Store mode of the device. Possible values are: notConfigured, allowList, blockList.
     * @param value Value to set for the playStoreMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlayStoreMode(@javax.annotation.Nullable final AndroidDeviceOwnerPlayStoreMode value) {
        this.playStoreMode = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to disable the capability to take screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this.screenCaptureBlocked = value;
    }
    /**
     * Sets the securityCommonCriteriaModeEnabled property value. Represents the security common criteria mode enabled provided to users when they attempt to modify managed settings on their device.
     * @param value Value to set for the securityCommonCriteriaModeEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityCommonCriteriaModeEnabled(@javax.annotation.Nullable final Boolean value) {
        this.securityCommonCriteriaModeEnabled = value;
    }
    /**
     * Sets the securityDeveloperSettingsEnabled property value. Indicates whether or not the user is allowed to access developer settings like developer options and safe boot on the device.
     * @param value Value to set for the securityDeveloperSettingsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityDeveloperSettingsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.securityDeveloperSettingsEnabled = value;
    }
    /**
     * Sets the securityRequireVerifyApps property value. Indicates whether or not verify apps is required.
     * @param value Value to set for the securityRequireVerifyApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityRequireVerifyApps(@javax.annotation.Nullable final Boolean value) {
        this.securityRequireVerifyApps = value;
    }
    /**
     * Sets the shortHelpText property value. Represents the customized short help text provided to users when they attempt to modify managed settings on their device.
     * @param value Value to set for the shortHelpText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShortHelpText(@javax.annotation.Nullable final AndroidDeviceOwnerUserFacingMessage value) {
        this.shortHelpText = value;
    }
    /**
     * Sets the statusBarBlocked property value. Indicates whether or the status bar is disabled, including notifications, quick settings and other screen overlays.
     * @param value Value to set for the statusBarBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatusBarBlocked(@javax.annotation.Nullable final Boolean value) {
        this.statusBarBlocked = value;
    }
    /**
     * Sets the stayOnModes property value. List of modes in which the device's display will stay powered-on. This collection can contain a maximum of 4 elements.
     * @param value Value to set for the stayOnModes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStayOnModes(@javax.annotation.Nullable final java.util.List<AndroidDeviceOwnerBatteryPluggedMode> value) {
        this.stayOnModes = value;
    }
    /**
     * Sets the storageAllowUsb property value. Indicates whether or not to allow USB mass storage.
     * @param value Value to set for the storageAllowUsb property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageAllowUsb(@javax.annotation.Nullable final Boolean value) {
        this.storageAllowUsb = value;
    }
    /**
     * Sets the storageBlockExternalMedia property value. Indicates whether or not to block external media.
     * @param value Value to set for the storageBlockExternalMedia property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageBlockExternalMedia(@javax.annotation.Nullable final Boolean value) {
        this.storageBlockExternalMedia = value;
    }
    /**
     * Sets the storageBlockUsbFileTransfer property value. Indicates whether or not to block USB file transfer.
     * @param value Value to set for the storageBlockUsbFileTransfer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageBlockUsbFileTransfer(@javax.annotation.Nullable final Boolean value) {
        this.storageBlockUsbFileTransfer = value;
    }
    /**
     * Sets the systemUpdateFreezePeriods property value. Indicates the annually repeating time periods during which system updates are postponed. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the systemUpdateFreezePeriods property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemUpdateFreezePeriods(@javax.annotation.Nullable final java.util.List<AndroidDeviceOwnerSystemUpdateFreezePeriod> value) {
        this.systemUpdateFreezePeriods = value;
    }
    /**
     * Sets the systemUpdateInstallType property value. The type of system update configuration. Possible values are: deviceDefault, postpone, windowed, automatic.
     * @param value Value to set for the systemUpdateInstallType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemUpdateInstallType(@javax.annotation.Nullable final AndroidDeviceOwnerSystemUpdateInstallType value) {
        this.systemUpdateInstallType = value;
    }
    /**
     * Sets the systemUpdateWindowEndMinutesAfterMidnight property value. Indicates the number of minutes after midnight that the system update window ends. Valid values 0 to 1440
     * @param value Value to set for the systemUpdateWindowEndMinutesAfterMidnight property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemUpdateWindowEndMinutesAfterMidnight(@javax.annotation.Nullable final Integer value) {
        this.systemUpdateWindowEndMinutesAfterMidnight = value;
    }
    /**
     * Sets the systemUpdateWindowStartMinutesAfterMidnight property value. Indicates the number of minutes after midnight that the system update window starts. Valid values 0 to 1440
     * @param value Value to set for the systemUpdateWindowStartMinutesAfterMidnight property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemUpdateWindowStartMinutesAfterMidnight(@javax.annotation.Nullable final Integer value) {
        this.systemUpdateWindowStartMinutesAfterMidnight = value;
    }
    /**
     * Sets the systemWindowsBlocked property value. Whether or not to block Android system prompt windows, like toasts, phone activities, and system alerts.
     * @param value Value to set for the systemWindowsBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemWindowsBlocked(@javax.annotation.Nullable final Boolean value) {
        this.systemWindowsBlocked = value;
    }
    /**
     * Sets the usersBlockAdd property value. Indicates whether or not adding users and profiles is disabled.
     * @param value Value to set for the usersBlockAdd property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsersBlockAdd(@javax.annotation.Nullable final Boolean value) {
        this.usersBlockAdd = value;
    }
    /**
     * Sets the usersBlockRemove property value. Indicates whether or not to disable removing other users from the device.
     * @param value Value to set for the usersBlockRemove property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsersBlockRemove(@javax.annotation.Nullable final Boolean value) {
        this.usersBlockRemove = value;
    }
    /**
     * Sets the volumeBlockAdjustment property value. Indicates whether or not adjusting the master volume is disabled.
     * @param value Value to set for the volumeBlockAdjustment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVolumeBlockAdjustment(@javax.annotation.Nullable final Boolean value) {
        this.volumeBlockAdjustment = value;
    }
    /**
     * Sets the vpnAlwaysOnLockdownMode property value. If an always on VPN package name is specified, whether or not to lock network traffic when that VPN is disconnected.
     * @param value Value to set for the vpnAlwaysOnLockdownMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVpnAlwaysOnLockdownMode(@javax.annotation.Nullable final Boolean value) {
        this.vpnAlwaysOnLockdownMode = value;
    }
    /**
     * Sets the vpnAlwaysOnPackageIdentifier property value. Android app package name for app that will handle an always-on VPN connection.
     * @param value Value to set for the vpnAlwaysOnPackageIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVpnAlwaysOnPackageIdentifier(@javax.annotation.Nullable final String value) {
        this.vpnAlwaysOnPackageIdentifier = value;
    }
    /**
     * Sets the wifiBlockEditConfigurations property value. Indicates whether or not to block the user from editing the wifi connection settings.
     * @param value Value to set for the wifiBlockEditConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiBlockEditConfigurations(@javax.annotation.Nullable final Boolean value) {
        this.wifiBlockEditConfigurations = value;
    }
    /**
     * Sets the wifiBlockEditPolicyDefinedConfigurations property value. Indicates whether or not to block the user from editing just the networks defined by the policy.
     * @param value Value to set for the wifiBlockEditPolicyDefinedConfigurations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWifiBlockEditPolicyDefinedConfigurations(@javax.annotation.Nullable final Boolean value) {
        this.wifiBlockEditPolicyDefinedConfigurations = value;
    }
    /**
     * Sets the workProfilePasswordExpirationDays property value. Indicates the number of days that a work profile password can be set before it expires and a new password will be required. Valid values 1 to 365
     * @param value Value to set for the workProfilePasswordExpirationDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this.workProfilePasswordExpirationDays = value;
    }
    /**
     * Sets the workProfilePasswordMinimumLength property value. Indicates the minimum length of the work profile password. Valid values 4 to 16
     * @param value Value to set for the workProfilePasswordMinimumLength property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinimumLength = value;
    }
    /**
     * Sets the workProfilePasswordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumLetterCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumLetterCharacters(@javax.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinimumLetterCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower-case characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumLowerCaseCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumLowerCaseCharacters(@javax.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinimumLowerCaseCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumNonLetterCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumNonLetterCharacters(@javax.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinimumNonLetterCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumNumericCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumNumericCharacters(@javax.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinimumNumericCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumSymbolCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumSymbolCharacters(@javax.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinimumSymbolCharacters = value;
    }
    /**
     * Sets the workProfilePasswordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper-case letter characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumUpperCaseCharacters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordMinimumUpperCaseCharacters(@javax.annotation.Nullable final Integer value) {
        this.workProfilePasswordMinimumUpperCaseCharacters = value;
    }
    /**
     * Sets the workProfilePasswordPreviousPasswordCountToBlock property value. Indicates the length of the work profile password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24
     * @param value Value to set for the workProfilePasswordPreviousPasswordCountToBlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordPreviousPasswordCountToBlock(@javax.annotation.Nullable final Integer value) {
        this.workProfilePasswordPreviousPasswordCountToBlock = value;
    }
    /**
     * Sets the workProfilePasswordRequiredType property value. Indicates the minimum password quality required on the work profile password. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @param value Value to set for the workProfilePasswordRequiredType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordRequiredType(@javax.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordType value) {
        this.workProfilePasswordRequiredType = value;
    }
    /**
     * Sets the workProfilePasswordRequireUnlock property value. Indicates the timeout period after which a work profile must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue.
     * @param value Value to set for the workProfilePasswordRequireUnlock property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordRequireUnlock(@javax.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordUnlock value) {
        this.workProfilePasswordRequireUnlock = value;
    }
    /**
     * Sets the workProfilePasswordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect work profile password before the device is wiped. Valid values 4 to 11
     * @param value Value to set for the workProfilePasswordSignInFailureCountBeforeFactoryReset property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(@javax.annotation.Nullable final Integer value) {
        this.workProfilePasswordSignInFailureCountBeforeFactoryReset = value;
    }
}
