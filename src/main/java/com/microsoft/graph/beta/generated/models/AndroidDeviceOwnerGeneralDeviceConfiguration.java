package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the androidDeviceOwnerGeneralDeviceConfiguration resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceOwnerGeneralDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link AndroidDeviceOwnerGeneralDeviceConfiguration} and sets the default values.
     */
    public AndroidDeviceOwnerGeneralDeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidDeviceOwnerGeneralDeviceConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerGeneralDeviceConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerGeneralDeviceConfiguration();
    }
    /**
     * Gets the accountsBlockModification property value. Indicates whether or not adding or removing accounts is disabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAccountsBlockModification() {
        return this.backingStore.get("accountsBlockModification");
    }
    /**
     * Gets the androidDeviceOwnerDelegatedScopeAppSettings property value. Specifies the list of managed apps with app details and its associated delegated scope(s). This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<AndroidDeviceOwnerDelegatedScopeAppSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerDelegatedScopeAppSetting> getAndroidDeviceOwnerDelegatedScopeAppSettings() {
        return this.backingStore.get("androidDeviceOwnerDelegatedScopeAppSettings");
    }
    /**
     * Gets the appsAllowInstallFromUnknownSources property value. Indicates whether or not the user is allowed to enable to unknown sources setting.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAppsAllowInstallFromUnknownSources() {
        return this.backingStore.get("appsAllowInstallFromUnknownSources");
    }
    /**
     * Gets the appsAutoUpdatePolicy property value. Indicates the value of the app auto update policy. Possible values are: notConfigured, userChoice, never, wiFiOnly, always.
     * @return a {@link AndroidDeviceOwnerAppAutoUpdatePolicyType}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerAppAutoUpdatePolicyType getAppsAutoUpdatePolicy() {
        return this.backingStore.get("appsAutoUpdatePolicy");
    }
    /**
     * Gets the appsDefaultPermissionPolicy property value. Indicates the permission policy for requests for runtime permissions if one is not defined for the app specifically. Possible values are: deviceDefault, prompt, autoGrant, autoDeny.
     * @return a {@link AndroidDeviceOwnerDefaultAppPermissionPolicyType}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerDefaultAppPermissionPolicyType getAppsDefaultPermissionPolicy() {
        return this.backingStore.get("appsDefaultPermissionPolicy");
    }
    /**
     * Gets the appsRecommendSkippingFirstUseHints property value. Whether or not to recommend all apps skip any first-time-use hints they may have added.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAppsRecommendSkippingFirstUseHints() {
        return this.backingStore.get("appsRecommendSkippingFirstUseHints");
    }
    /**
     * Gets the azureAdSharedDeviceDataClearApps property value. A list of managed apps that will have their data cleared during a global sign-out in AAD shared device mode. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<AppListItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getAzureAdSharedDeviceDataClearApps() {
        return this.backingStore.get("azureAdSharedDeviceDataClearApps");
    }
    /**
     * Gets the bluetoothBlockConfiguration property value. Indicates whether or not to block a user from configuring bluetooth.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBluetoothBlockConfiguration() {
        return this.backingStore.get("bluetoothBlockConfiguration");
    }
    /**
     * Gets the bluetoothBlockContactSharing property value. Indicates whether or not to block a user from sharing contacts via bluetooth.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBluetoothBlockContactSharing() {
        return this.backingStore.get("bluetoothBlockContactSharing");
    }
    /**
     * Gets the cameraBlocked property value. Indicates whether or not to disable the use of the camera.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCameraBlocked() {
        return this.backingStore.get("cameraBlocked");
    }
    /**
     * Gets the cellularBlockWiFiTethering property value. Indicates whether or not to block Wi-Fi tethering.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCellularBlockWiFiTethering() {
        return this.backingStore.get("cellularBlockWiFiTethering");
    }
    /**
     * Gets the certificateCredentialConfigurationDisabled property value. Indicates whether or not to block users from any certificate credential configuration.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCertificateCredentialConfigurationDisabled() {
        return this.backingStore.get("certificateCredentialConfigurationDisabled");
    }
    /**
     * Gets the crossProfilePoliciesAllowCopyPaste property value. Indicates whether or not text copied from one profile (personal or work) can be pasted in the other.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCrossProfilePoliciesAllowCopyPaste() {
        return this.backingStore.get("crossProfilePoliciesAllowCopyPaste");
    }
    /**
     * Gets the crossProfilePoliciesAllowDataSharing property value. Indicates whether data from one profile (personal or work) can be shared with apps in the other profile. Possible values are: notConfigured, crossProfileDataSharingBlocked, dataSharingFromWorkToPersonalBlocked, crossProfileDataSharingAllowed, unkownFutureValue.
     * @return a {@link AndroidDeviceOwnerCrossProfileDataSharing}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerCrossProfileDataSharing getCrossProfilePoliciesAllowDataSharing() {
        return this.backingStore.get("crossProfilePoliciesAllowDataSharing");
    }
    /**
     * Gets the crossProfilePoliciesShowWorkContactsInPersonalProfile property value. Indicates whether or not contacts stored in work profile are shown in personal profile contact searches/incoming calls.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCrossProfilePoliciesShowWorkContactsInPersonalProfile() {
        return this.backingStore.get("crossProfilePoliciesShowWorkContactsInPersonalProfile");
    }
    /**
     * Gets the dataRoamingBlocked property value. Indicates whether or not to block a user from data roaming.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDataRoamingBlocked() {
        return this.backingStore.get("dataRoamingBlocked");
    }
    /**
     * Gets the dateTimeConfigurationBlocked property value. Indicates whether or not to block the user from manually changing the date or time on the device
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDateTimeConfigurationBlocked() {
        return this.backingStore.get("dateTimeConfigurationBlocked");
    }
    /**
     * Gets the detailedHelpText property value. Represents the customized detailed help text provided to users when they attempt to modify managed settings on their device.
     * @return a {@link AndroidDeviceOwnerUserFacingMessage}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerUserFacingMessage getDetailedHelpText() {
        return this.backingStore.get("detailedHelpText");
    }
    /**
     * Gets the deviceLocationMode property value. Indicates the location setting configuration for fully managed devices (COBO) and corporate owned devices with a work profile (COPE). Possible values are: notConfigured, disabled, unknownFutureValue.
     * @return a {@link AndroidDeviceOwnerLocationMode}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerLocationMode getDeviceLocationMode() {
        return this.backingStore.get("deviceLocationMode");
    }
    /**
     * Gets the deviceOwnerLockScreenMessage property value. Represents the customized lock screen message provided to users when they attempt to modify managed settings on their device.
     * @return a {@link AndroidDeviceOwnerUserFacingMessage}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerUserFacingMessage getDeviceOwnerLockScreenMessage() {
        return this.backingStore.get("deviceOwnerLockScreenMessage");
    }
    /**
     * Gets the enrollmentProfile property value. Android Device Owner Enrollment Profile types.
     * @return a {@link AndroidDeviceOwnerEnrollmentProfileType}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerEnrollmentProfileType getEnrollmentProfile() {
        return this.backingStore.get("enrollmentProfile");
    }
    /**
     * Gets the factoryResetBlocked property value. Indicates whether or not the factory reset option in settings is disabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFactoryResetBlocked() {
        return this.backingStore.get("factoryResetBlocked");
    }
    /**
     * Gets the factoryResetDeviceAdministratorEmails property value. List of Google account emails that will be required to authenticate after a device is factory reset before it can be set up.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFactoryResetDeviceAdministratorEmails() {
        return this.backingStore.get("factoryResetDeviceAdministratorEmails");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountsBlockModification", (n) -> { this.setAccountsBlockModification(n.getBooleanValue()); });
        deserializerMap.put("androidDeviceOwnerDelegatedScopeAppSettings", (n) -> { this.setAndroidDeviceOwnerDelegatedScopeAppSettings(n.getCollectionOfObjectValues(AndroidDeviceOwnerDelegatedScopeAppSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("appsAllowInstallFromUnknownSources", (n) -> { this.setAppsAllowInstallFromUnknownSources(n.getBooleanValue()); });
        deserializerMap.put("appsAutoUpdatePolicy", (n) -> { this.setAppsAutoUpdatePolicy(n.getEnumValue(AndroidDeviceOwnerAppAutoUpdatePolicyType::forValue)); });
        deserializerMap.put("appsDefaultPermissionPolicy", (n) -> { this.setAppsDefaultPermissionPolicy(n.getEnumValue(AndroidDeviceOwnerDefaultAppPermissionPolicyType::forValue)); });
        deserializerMap.put("appsRecommendSkippingFirstUseHints", (n) -> { this.setAppsRecommendSkippingFirstUseHints(n.getBooleanValue()); });
        deserializerMap.put("azureAdSharedDeviceDataClearApps", (n) -> { this.setAzureAdSharedDeviceDataClearApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("bluetoothBlockConfiguration", (n) -> { this.setBluetoothBlockConfiguration(n.getBooleanValue()); });
        deserializerMap.put("bluetoothBlockContactSharing", (n) -> { this.setBluetoothBlockContactSharing(n.getBooleanValue()); });
        deserializerMap.put("cameraBlocked", (n) -> { this.setCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("cellularBlockWiFiTethering", (n) -> { this.setCellularBlockWiFiTethering(n.getBooleanValue()); });
        deserializerMap.put("certificateCredentialConfigurationDisabled", (n) -> { this.setCertificateCredentialConfigurationDisabled(n.getBooleanValue()); });
        deserializerMap.put("crossProfilePoliciesAllowCopyPaste", (n) -> { this.setCrossProfilePoliciesAllowCopyPaste(n.getBooleanValue()); });
        deserializerMap.put("crossProfilePoliciesAllowDataSharing", (n) -> { this.setCrossProfilePoliciesAllowDataSharing(n.getEnumValue(AndroidDeviceOwnerCrossProfileDataSharing::forValue)); });
        deserializerMap.put("crossProfilePoliciesShowWorkContactsInPersonalProfile", (n) -> { this.setCrossProfilePoliciesShowWorkContactsInPersonalProfile(n.getBooleanValue()); });
        deserializerMap.put("dataRoamingBlocked", (n) -> { this.setDataRoamingBlocked(n.getBooleanValue()); });
        deserializerMap.put("dateTimeConfigurationBlocked", (n) -> { this.setDateTimeConfigurationBlocked(n.getBooleanValue()); });
        deserializerMap.put("detailedHelpText", (n) -> { this.setDetailedHelpText(n.getObjectValue(AndroidDeviceOwnerUserFacingMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceLocationMode", (n) -> { this.setDeviceLocationMode(n.getEnumValue(AndroidDeviceOwnerLocationMode::forValue)); });
        deserializerMap.put("deviceOwnerLockScreenMessage", (n) -> { this.setDeviceOwnerLockScreenMessage(n.getObjectValue(AndroidDeviceOwnerUserFacingMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("enrollmentProfile", (n) -> { this.setEnrollmentProfile(n.getEnumValue(AndroidDeviceOwnerEnrollmentProfileType::forValue)); });
        deserializerMap.put("factoryResetBlocked", (n) -> { this.setFactoryResetBlocked(n.getBooleanValue()); });
        deserializerMap.put("factoryResetDeviceAdministratorEmails", (n) -> { this.setFactoryResetDeviceAdministratorEmails(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("globalProxy", (n) -> { this.setGlobalProxy(n.getObjectValue(AndroidDeviceOwnerGlobalProxy::createFromDiscriminatorValue)); });
        deserializerMap.put("googleAccountsBlocked", (n) -> { this.setGoogleAccountsBlocked(n.getBooleanValue()); });
        deserializerMap.put("kioskCustomizationDeviceSettingsBlocked", (n) -> { this.setKioskCustomizationDeviceSettingsBlocked(n.getBooleanValue()); });
        deserializerMap.put("kioskCustomizationPowerButtonActionsBlocked", (n) -> { this.setKioskCustomizationPowerButtonActionsBlocked(n.getBooleanValue()); });
        deserializerMap.put("kioskCustomizationStatusBar", (n) -> { this.setKioskCustomizationStatusBar(n.getEnumValue(AndroidDeviceOwnerKioskCustomizationStatusBar::forValue)); });
        deserializerMap.put("kioskCustomizationSystemErrorWarnings", (n) -> { this.setKioskCustomizationSystemErrorWarnings(n.getBooleanValue()); });
        deserializerMap.put("kioskCustomizationSystemNavigation", (n) -> { this.setKioskCustomizationSystemNavigation(n.getEnumValue(AndroidDeviceOwnerKioskCustomizationSystemNavigation::forValue)); });
        deserializerMap.put("kioskModeAppOrderEnabled", (n) -> { this.setKioskModeAppOrderEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeAppPositions", (n) -> { this.setKioskModeAppPositions(n.getCollectionOfObjectValues(AndroidDeviceOwnerKioskModeAppPositionItem::createFromDiscriminatorValue)); });
        deserializerMap.put("kioskModeApps", (n) -> { this.setKioskModeApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("kioskModeAppsInFolderOrderedByName", (n) -> { this.setKioskModeAppsInFolderOrderedByName(n.getBooleanValue()); });
        deserializerMap.put("kioskModeBluetoothConfigurationEnabled", (n) -> { this.setKioskModeBluetoothConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeDebugMenuEasyAccessEnabled", (n) -> { this.setKioskModeDebugMenuEasyAccessEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeExitCode", (n) -> { this.setKioskModeExitCode(n.getStringValue()); });
        deserializerMap.put("kioskModeFlashlightConfigurationEnabled", (n) -> { this.setKioskModeFlashlightConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeFolderIcon", (n) -> { this.setKioskModeFolderIcon(n.getEnumValue(AndroidDeviceOwnerKioskModeFolderIcon::forValue)); });
        deserializerMap.put("kioskModeGridHeight", (n) -> { this.setKioskModeGridHeight(n.getIntegerValue()); });
        deserializerMap.put("kioskModeGridWidth", (n) -> { this.setKioskModeGridWidth(n.getIntegerValue()); });
        deserializerMap.put("kioskModeIconSize", (n) -> { this.setKioskModeIconSize(n.getEnumValue(AndroidDeviceOwnerKioskModeIconSize::forValue)); });
        deserializerMap.put("kioskModeLockHomeScreen", (n) -> { this.setKioskModeLockHomeScreen(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedFolders", (n) -> { this.setKioskModeManagedFolders(n.getCollectionOfObjectValues(AndroidDeviceOwnerKioskModeManagedFolder::createFromDiscriminatorValue)); });
        deserializerMap.put("kioskModeManagedHomeScreenAutoSignout", (n) -> { this.setKioskModeManagedHomeScreenAutoSignout(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds", (n) -> { this.setKioskModeManagedHomeScreenInactiveSignOutDelayInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds", (n) -> { this.setKioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenPinComplexity", (n) -> { this.setKioskModeManagedHomeScreenPinComplexity(n.getEnumValue(KioskModeManagedHomeScreenPinComplexity::forValue)); });
        deserializerMap.put("kioskModeManagedHomeScreenPinRequired", (n) -> { this.setKioskModeManagedHomeScreenPinRequired(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenPinRequiredToResume", (n) -> { this.setKioskModeManagedHomeScreenPinRequiredToResume(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenSignInBackground", (n) -> { this.setKioskModeManagedHomeScreenSignInBackground(n.getStringValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenSignInBrandingLogo", (n) -> { this.setKioskModeManagedHomeScreenSignInBrandingLogo(n.getStringValue()); });
        deserializerMap.put("kioskModeManagedHomeScreenSignInEnabled", (n) -> { this.setKioskModeManagedHomeScreenSignInEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeManagedSettingsEntryDisabled", (n) -> { this.setKioskModeManagedSettingsEntryDisabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeMediaVolumeConfigurationEnabled", (n) -> { this.setKioskModeMediaVolumeConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeScreenOrientation", (n) -> { this.setKioskModeScreenOrientation(n.getEnumValue(AndroidDeviceOwnerKioskModeScreenOrientation::forValue)); });
        deserializerMap.put("kioskModeScreenSaverConfigurationEnabled", (n) -> { this.setKioskModeScreenSaverConfigurationEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeScreenSaverDetectMediaDisabled", (n) -> { this.setKioskModeScreenSaverDetectMediaDisabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeScreenSaverDisplayTimeInSeconds", (n) -> { this.setKioskModeScreenSaverDisplayTimeInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskModeScreenSaverImageUrl", (n) -> { this.setKioskModeScreenSaverImageUrl(n.getStringValue()); });
        deserializerMap.put("kioskModeScreenSaverStartDelayInSeconds", (n) -> { this.setKioskModeScreenSaverStartDelayInSeconds(n.getIntegerValue()); });
        deserializerMap.put("kioskModeShowAppNotificationBadge", (n) -> { this.setKioskModeShowAppNotificationBadge(n.getBooleanValue()); });
        deserializerMap.put("kioskModeShowDeviceInfo", (n) -> { this.setKioskModeShowDeviceInfo(n.getBooleanValue()); });
        deserializerMap.put("kioskModeUseManagedHomeScreenApp", (n) -> { this.setKioskModeUseManagedHomeScreenApp(n.getEnumValue(KioskModeType::forValue)); });
        deserializerMap.put("kioskModeVirtualHomeButtonEnabled", (n) -> { this.setKioskModeVirtualHomeButtonEnabled(n.getBooleanValue()); });
        deserializerMap.put("kioskModeVirtualHomeButtonType", (n) -> { this.setKioskModeVirtualHomeButtonType(n.getEnumValue(AndroidDeviceOwnerVirtualHomeButtonType::forValue)); });
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
        deserializerMap.put("microsoftLauncherDockPresenceConfiguration", (n) -> { this.setMicrosoftLauncherDockPresenceConfiguration(n.getEnumValue(MicrosoftLauncherDockPresence::forValue)); });
        deserializerMap.put("microsoftLauncherFeedAllowUserModification", (n) -> { this.setMicrosoftLauncherFeedAllowUserModification(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherFeedEnabled", (n) -> { this.setMicrosoftLauncherFeedEnabled(n.getBooleanValue()); });
        deserializerMap.put("microsoftLauncherSearchBarPlacementConfiguration", (n) -> { this.setMicrosoftLauncherSearchBarPlacementConfiguration(n.getEnumValue(MicrosoftLauncherSearchBarPlacement::forValue)); });
        deserializerMap.put("networkEscapeHatchAllowed", (n) -> { this.setNetworkEscapeHatchAllowed(n.getBooleanValue()); });
        deserializerMap.put("nfcBlockOutgoingBeam", (n) -> { this.setNfcBlockOutgoingBeam(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockKeyguard", (n) -> { this.setPasswordBlockKeyguard(n.getBooleanValue()); });
        deserializerMap.put("passwordBlockKeyguardFeatures", (n) -> { this.setPasswordBlockKeyguardFeatures(n.getCollectionOfEnumValues(AndroidKeyguardFeature::forValue)); });
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
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordType::forValue)); });
        deserializerMap.put("passwordRequireUnlock", (n) -> { this.setPasswordRequireUnlock(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordUnlock::forValue)); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { this.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("personalProfileAppsAllowInstallFromUnknownSources", (n) -> { this.setPersonalProfileAppsAllowInstallFromUnknownSources(n.getBooleanValue()); });
        deserializerMap.put("personalProfileCameraBlocked", (n) -> { this.setPersonalProfileCameraBlocked(n.getBooleanValue()); });
        deserializerMap.put("personalProfilePersonalApplications", (n) -> { this.setPersonalProfilePersonalApplications(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("personalProfilePlayStoreMode", (n) -> { this.setPersonalProfilePlayStoreMode(n.getEnumValue(PersonalProfilePersonalPlayStoreMode::forValue)); });
        deserializerMap.put("personalProfileScreenCaptureBlocked", (n) -> { this.setPersonalProfileScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("playStoreMode", (n) -> { this.setPlayStoreMode(n.getEnumValue(AndroidDeviceOwnerPlayStoreMode::forValue)); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { this.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("securityCommonCriteriaModeEnabled", (n) -> { this.setSecurityCommonCriteriaModeEnabled(n.getBooleanValue()); });
        deserializerMap.put("securityDeveloperSettingsEnabled", (n) -> { this.setSecurityDeveloperSettingsEnabled(n.getBooleanValue()); });
        deserializerMap.put("securityRequireVerifyApps", (n) -> { this.setSecurityRequireVerifyApps(n.getBooleanValue()); });
        deserializerMap.put("shareDeviceLocationDisabled", (n) -> { this.setShareDeviceLocationDisabled(n.getBooleanValue()); });
        deserializerMap.put("shortHelpText", (n) -> { this.setShortHelpText(n.getObjectValue(AndroidDeviceOwnerUserFacingMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("statusBarBlocked", (n) -> { this.setStatusBarBlocked(n.getBooleanValue()); });
        deserializerMap.put("stayOnModes", (n) -> { this.setStayOnModes(n.getCollectionOfEnumValues(AndroidDeviceOwnerBatteryPluggedMode::forValue)); });
        deserializerMap.put("storageAllowUsb", (n) -> { this.setStorageAllowUsb(n.getBooleanValue()); });
        deserializerMap.put("storageBlockExternalMedia", (n) -> { this.setStorageBlockExternalMedia(n.getBooleanValue()); });
        deserializerMap.put("storageBlockUsbFileTransfer", (n) -> { this.setStorageBlockUsbFileTransfer(n.getBooleanValue()); });
        deserializerMap.put("systemUpdateFreezePeriods", (n) -> { this.setSystemUpdateFreezePeriods(n.getCollectionOfObjectValues(AndroidDeviceOwnerSystemUpdateFreezePeriod::createFromDiscriminatorValue)); });
        deserializerMap.put("systemUpdateInstallType", (n) -> { this.setSystemUpdateInstallType(n.getEnumValue(AndroidDeviceOwnerSystemUpdateInstallType::forValue)); });
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
        deserializerMap.put("workProfilePasswordRequiredType", (n) -> { this.setWorkProfilePasswordRequiredType(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordType::forValue)); });
        deserializerMap.put("workProfilePasswordRequireUnlock", (n) -> { this.setWorkProfilePasswordRequireUnlock(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordUnlock::forValue)); });
        deserializerMap.put("workProfilePasswordSignInFailureCountBeforeFactoryReset", (n) -> { this.setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the globalProxy property value. Proxy is set up directly with host, port and excluded hosts.
     * @return a {@link AndroidDeviceOwnerGlobalProxy}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerGlobalProxy getGlobalProxy() {
        return this.backingStore.get("globalProxy");
    }
    /**
     * Gets the googleAccountsBlocked property value. Indicates whether or not google accounts will be blocked.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGoogleAccountsBlocked() {
        return this.backingStore.get("googleAccountsBlocked");
    }
    /**
     * Gets the kioskCustomizationDeviceSettingsBlocked property value. Indicateswhether a user can access the device&apos;s Settings app while in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskCustomizationDeviceSettingsBlocked() {
        return this.backingStore.get("kioskCustomizationDeviceSettingsBlocked");
    }
    /**
     * Gets the kioskCustomizationPowerButtonActionsBlocked property value. Whether the power menu is shown when a user long presses the Power button of a device in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskCustomizationPowerButtonActionsBlocked() {
        return this.backingStore.get("kioskCustomizationPowerButtonActionsBlocked");
    }
    /**
     * Gets the kioskCustomizationStatusBar property value. Indicates whether system info and notifications are disabled in Kiosk Mode. Possible values are: notConfigured, notificationsAndSystemInfoEnabled, systemInfoOnly.
     * @return a {@link AndroidDeviceOwnerKioskCustomizationStatusBar}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerKioskCustomizationStatusBar getKioskCustomizationStatusBar() {
        return this.backingStore.get("kioskCustomizationStatusBar");
    }
    /**
     * Gets the kioskCustomizationSystemErrorWarnings property value. Indicates whether system error dialogs for crashed or unresponsive apps are shown in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskCustomizationSystemErrorWarnings() {
        return this.backingStore.get("kioskCustomizationSystemErrorWarnings");
    }
    /**
     * Gets the kioskCustomizationSystemNavigation property value. Indicates which navigation features are enabled in Kiosk Mode. Possible values are: notConfigured, navigationEnabled, homeButtonOnly.
     * @return a {@link AndroidDeviceOwnerKioskCustomizationSystemNavigation}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerKioskCustomizationSystemNavigation getKioskCustomizationSystemNavigation() {
        return this.backingStore.get("kioskCustomizationSystemNavigation");
    }
    /**
     * Gets the kioskModeAppOrderEnabled property value. Whether or not to enable app ordering in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAppOrderEnabled() {
        return this.backingStore.get("kioskModeAppOrderEnabled");
    }
    /**
     * Gets the kioskModeAppPositions property value. The ordering of items on Kiosk Mode Managed Home Screen. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<AndroidDeviceOwnerKioskModeAppPositionItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerKioskModeAppPositionItem> getKioskModeAppPositions() {
        return this.backingStore.get("kioskModeAppPositions");
    }
    /**
     * Gets the kioskModeApps property value. A list of managed apps that will be shown when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<AppListItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getKioskModeApps() {
        return this.backingStore.get("kioskModeApps");
    }
    /**
     * Gets the kioskModeAppsInFolderOrderedByName property value. Whether or not to alphabetize applications within a folder in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeAppsInFolderOrderedByName() {
        return this.backingStore.get("kioskModeAppsInFolderOrderedByName");
    }
    /**
     * Gets the kioskModeBluetoothConfigurationEnabled property value. Whether or not to allow a user to configure Bluetooth settings in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeBluetoothConfigurationEnabled() {
        return this.backingStore.get("kioskModeBluetoothConfigurationEnabled");
    }
    /**
     * Gets the kioskModeDebugMenuEasyAccessEnabled property value. Whether or not to allow a user to easy access to the debug menu in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeDebugMenuEasyAccessEnabled() {
        return this.backingStore.get("kioskModeDebugMenuEasyAccessEnabled");
    }
    /**
     * Gets the kioskModeExitCode property value. Exit code to allow a user to escape from Kiosk Mode when the device is in Kiosk Mode.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKioskModeExitCode() {
        return this.backingStore.get("kioskModeExitCode");
    }
    /**
     * Gets the kioskModeFlashlightConfigurationEnabled property value. Whether or not to allow a user to use the flashlight in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeFlashlightConfigurationEnabled() {
        return this.backingStore.get("kioskModeFlashlightConfigurationEnabled");
    }
    /**
     * Gets the kioskModeFolderIcon property value. Folder icon configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, darkSquare, darkCircle, lightSquare, lightCircle.
     * @return a {@link AndroidDeviceOwnerKioskModeFolderIcon}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerKioskModeFolderIcon getKioskModeFolderIcon() {
        return this.backingStore.get("kioskModeFolderIcon");
    }
    /**
     * Gets the kioskModeGridHeight property value. Number of rows for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getKioskModeGridHeight() {
        return this.backingStore.get("kioskModeGridHeight");
    }
    /**
     * Gets the kioskModeGridWidth property value. Number of columns for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getKioskModeGridWidth() {
        return this.backingStore.get("kioskModeGridWidth");
    }
    /**
     * Gets the kioskModeIconSize property value. Icon size configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, smallest, small, regular, large, largest.
     * @return a {@link AndroidDeviceOwnerKioskModeIconSize}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerKioskModeIconSize getKioskModeIconSize() {
        return this.backingStore.get("kioskModeIconSize");
    }
    /**
     * Gets the kioskModeLockHomeScreen property value. Whether or not to lock home screen to the end user in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeLockHomeScreen() {
        return this.backingStore.get("kioskModeLockHomeScreen");
    }
    /**
     * Gets the kioskModeManagedFolders property value. A list of managed folders for a device in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<AndroidDeviceOwnerKioskModeManagedFolder>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerKioskModeManagedFolder> getKioskModeManagedFolders() {
        return this.backingStore.get("kioskModeManagedFolders");
    }
    /**
     * Gets the kioskModeManagedHomeScreenAutoSignout property value. Whether or not to automatically sign-out of MHS and Shared device mode applications after inactive for Managed Home Screen.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeManagedHomeScreenAutoSignout() {
        return this.backingStore.get("kioskModeManagedHomeScreenAutoSignout");
    }
    /**
     * Gets the kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds property value. Number of seconds to give user notice before automatically signing them out for Managed Home Screen. Valid values 0 to 9999999
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getKioskModeManagedHomeScreenInactiveSignOutDelayInSeconds() {
        return this.backingStore.get("kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds");
    }
    /**
     * Gets the kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds property value. Number of seconds device is inactive before automatically signing user out for Managed Home Screen. Valid values 0 to 9999999
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getKioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds() {
        return this.backingStore.get("kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds");
    }
    /**
     * Gets the kioskModeManagedHomeScreenPinComplexity property value. Complexity of PIN for sign-in session for Managed Home Screen. Possible values are: notConfigured, simple, complex.
     * @return a {@link KioskModeManagedHomeScreenPinComplexity}
     */
    @jakarta.annotation.Nullable
    public KioskModeManagedHomeScreenPinComplexity getKioskModeManagedHomeScreenPinComplexity() {
        return this.backingStore.get("kioskModeManagedHomeScreenPinComplexity");
    }
    /**
     * Gets the kioskModeManagedHomeScreenPinRequired property value. Whether or not require user to set a PIN for sign-in session for Managed Home Screen.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeManagedHomeScreenPinRequired() {
        return this.backingStore.get("kioskModeManagedHomeScreenPinRequired");
    }
    /**
     * Gets the kioskModeManagedHomeScreenPinRequiredToResume property value. Whether or not required user to enter session PIN if screensaver has appeared for Managed Home Screen.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeManagedHomeScreenPinRequiredToResume() {
        return this.backingStore.get("kioskModeManagedHomeScreenPinRequiredToResume");
    }
    /**
     * Gets the kioskModeManagedHomeScreenSignInBackground property value. Custom URL background for sign-in screen for Managed Home Screen.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKioskModeManagedHomeScreenSignInBackground() {
        return this.backingStore.get("kioskModeManagedHomeScreenSignInBackground");
    }
    /**
     * Gets the kioskModeManagedHomeScreenSignInBrandingLogo property value. Custom URL branding logo for sign-in screen and session pin page for Managed Home Screen.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKioskModeManagedHomeScreenSignInBrandingLogo() {
        return this.backingStore.get("kioskModeManagedHomeScreenSignInBrandingLogo");
    }
    /**
     * Gets the kioskModeManagedHomeScreenSignInEnabled property value. Whether or not show sign-in screen for Managed Home Screen.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeManagedHomeScreenSignInEnabled() {
        return this.backingStore.get("kioskModeManagedHomeScreenSignInEnabled");
    }
    /**
     * Gets the kioskModeManagedSettingsEntryDisabled property value. Whether or not to display the Managed Settings entry point on the managed home screen in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeManagedSettingsEntryDisabled() {
        return this.backingStore.get("kioskModeManagedSettingsEntryDisabled");
    }
    /**
     * Gets the kioskModeMediaVolumeConfigurationEnabled property value. Whether or not to allow a user to change the media volume in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeMediaVolumeConfigurationEnabled() {
        return this.backingStore.get("kioskModeMediaVolumeConfigurationEnabled");
    }
    /**
     * Gets the kioskModeScreenOrientation property value. Screen orientation configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, portrait, landscape, autoRotate.
     * @return a {@link AndroidDeviceOwnerKioskModeScreenOrientation}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerKioskModeScreenOrientation getKioskModeScreenOrientation() {
        return this.backingStore.get("kioskModeScreenOrientation");
    }
    /**
     * Gets the kioskModeScreenSaverConfigurationEnabled property value. Whether or not to enable screen saver mode or not in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeScreenSaverConfigurationEnabled() {
        return this.backingStore.get("kioskModeScreenSaverConfigurationEnabled");
    }
    /**
     * Gets the kioskModeScreenSaverDetectMediaDisabled property value. Whether or not the device screen should show the screen saver if audio/video is playing in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeScreenSaverDetectMediaDisabled() {
        return this.backingStore.get("kioskModeScreenSaverDetectMediaDisabled");
    }
    /**
     * Gets the kioskModeScreenSaverDisplayTimeInSeconds property value. The number of seconds that the device will display the screen saver for in Kiosk Mode. Valid values 0 to 9999999
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getKioskModeScreenSaverDisplayTimeInSeconds() {
        return this.backingStore.get("kioskModeScreenSaverDisplayTimeInSeconds");
    }
    /**
     * Gets the kioskModeScreenSaverImageUrl property value. URL for an image that will be the device&apos;s screen saver in Kiosk Mode.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKioskModeScreenSaverImageUrl() {
        return this.backingStore.get("kioskModeScreenSaverImageUrl");
    }
    /**
     * Gets the kioskModeScreenSaverStartDelayInSeconds property value. The number of seconds the device needs to be inactive for before the screen saver is shown in Kiosk Mode. Valid values 1 to 9999999
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getKioskModeScreenSaverStartDelayInSeconds() {
        return this.backingStore.get("kioskModeScreenSaverStartDelayInSeconds");
    }
    /**
     * Gets the kioskModeShowAppNotificationBadge property value. Whether or not to display application notification badges in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeShowAppNotificationBadge() {
        return this.backingStore.get("kioskModeShowAppNotificationBadge");
    }
    /**
     * Gets the kioskModeShowDeviceInfo property value. Whether or not to allow a user to access basic device information.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeShowDeviceInfo() {
        return this.backingStore.get("kioskModeShowDeviceInfo");
    }
    /**
     * Gets the kioskModeUseManagedHomeScreenApp property value. Whether or not to use single app kiosk mode or multi-app kiosk mode. Possible values are: notConfigured, singleAppMode, multiAppMode.
     * @return a {@link KioskModeType}
     */
    @jakarta.annotation.Nullable
    public KioskModeType getKioskModeUseManagedHomeScreenApp() {
        return this.backingStore.get("kioskModeUseManagedHomeScreenApp");
    }
    /**
     * Gets the kioskModeVirtualHomeButtonEnabled property value. Whether or not to display a virtual home button when the device is in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeVirtualHomeButtonEnabled() {
        return this.backingStore.get("kioskModeVirtualHomeButtonEnabled");
    }
    /**
     * Gets the kioskModeVirtualHomeButtonType property value. Indicates whether the virtual home button is a swipe up home button or a floating home button. Possible values are: notConfigured, swipeUp, floating.
     * @return a {@link AndroidDeviceOwnerVirtualHomeButtonType}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerVirtualHomeButtonType getKioskModeVirtualHomeButtonType() {
        return this.backingStore.get("kioskModeVirtualHomeButtonType");
    }
    /**
     * Gets the kioskModeWallpaperUrl property value. URL to a publicly accessible image to use for the wallpaper when the device is in Kiosk Mode.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKioskModeWallpaperUrl() {
        return this.backingStore.get("kioskModeWallpaperUrl");
    }
    /**
     * Gets the kioskModeWifiAllowedSsids property value. The restricted set of WIFI SSIDs available for the user to configure in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getKioskModeWifiAllowedSsids() {
        return this.backingStore.get("kioskModeWifiAllowedSsids");
    }
    /**
     * Gets the kioskModeWiFiConfigurationEnabled property value. Whether or not to allow a user to configure Wi-Fi settings in Kiosk Mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKioskModeWiFiConfigurationEnabled() {
        return this.backingStore.get("kioskModeWiFiConfigurationEnabled");
    }
    /**
     * Gets the locateDeviceLostModeEnabled property value. Indicates whether or not LocateDevice for devices with lost mode (COBO, COPE) is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocateDeviceLostModeEnabled() {
        return this.backingStore.get("locateDeviceLostModeEnabled");
    }
    /**
     * Gets the locateDeviceUserlessDisabled property value. Indicates whether or not LocateDevice for userless (COSU) devices is disabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocateDeviceUserlessDisabled() {
        return this.backingStore.get("locateDeviceUserlessDisabled");
    }
    /**
     * Gets the microphoneForceMute property value. Indicates whether or not to block unmuting the microphone on the device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMicrophoneForceMute() {
        return this.backingStore.get("microphoneForceMute");
    }
    /**
     * Gets the microsoftLauncherConfigurationEnabled property value. Indicates whether or not to you want configure Microsoft Launcher.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMicrosoftLauncherConfigurationEnabled() {
        return this.backingStore.get("microsoftLauncherConfigurationEnabled");
    }
    /**
     * Gets the microsoftLauncherCustomWallpaperAllowUserModification property value. Indicates whether or not the user can modify the wallpaper to personalize their device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMicrosoftLauncherCustomWallpaperAllowUserModification() {
        return this.backingStore.get("microsoftLauncherCustomWallpaperAllowUserModification");
    }
    /**
     * Gets the microsoftLauncherCustomWallpaperEnabled property value. Indicates whether or not to configure the wallpaper on the targeted devices.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMicrosoftLauncherCustomWallpaperEnabled() {
        return this.backingStore.get("microsoftLauncherCustomWallpaperEnabled");
    }
    /**
     * Gets the microsoftLauncherCustomWallpaperImageUrl property value. Indicates the URL for the image file to use as the wallpaper on the targeted devices.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMicrosoftLauncherCustomWallpaperImageUrl() {
        return this.backingStore.get("microsoftLauncherCustomWallpaperImageUrl");
    }
    /**
     * Gets the microsoftLauncherDockPresenceAllowUserModification property value. Indicates whether or not the user can modify the device dock configuration on the device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMicrosoftLauncherDockPresenceAllowUserModification() {
        return this.backingStore.get("microsoftLauncherDockPresenceAllowUserModification");
    }
    /**
     * Gets the microsoftLauncherDockPresenceConfiguration property value. Indicates whether or not you want to configure the device dock. Possible values are: notConfigured, show, hide, disabled.
     * @return a {@link MicrosoftLauncherDockPresence}
     */
    @jakarta.annotation.Nullable
    public MicrosoftLauncherDockPresence getMicrosoftLauncherDockPresenceConfiguration() {
        return this.backingStore.get("microsoftLauncherDockPresenceConfiguration");
    }
    /**
     * Gets the microsoftLauncherFeedAllowUserModification property value. Indicates whether or not the user can modify the launcher feed on the device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMicrosoftLauncherFeedAllowUserModification() {
        return this.backingStore.get("microsoftLauncherFeedAllowUserModification");
    }
    /**
     * Gets the microsoftLauncherFeedEnabled property value. Indicates whether or not you want to enable the launcher feed on the device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMicrosoftLauncherFeedEnabled() {
        return this.backingStore.get("microsoftLauncherFeedEnabled");
    }
    /**
     * Gets the microsoftLauncherSearchBarPlacementConfiguration property value. Indicates the search bar placement configuration on the device. Possible values are: notConfigured, top, bottom, hide.
     * @return a {@link MicrosoftLauncherSearchBarPlacement}
     */
    @jakarta.annotation.Nullable
    public MicrosoftLauncherSearchBarPlacement getMicrosoftLauncherSearchBarPlacementConfiguration() {
        return this.backingStore.get("microsoftLauncherSearchBarPlacementConfiguration");
    }
    /**
     * Gets the networkEscapeHatchAllowed property value. Indicates whether or not the device will allow connecting to a temporary network connection at boot time.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNetworkEscapeHatchAllowed() {
        return this.backingStore.get("networkEscapeHatchAllowed");
    }
    /**
     * Gets the nfcBlockOutgoingBeam property value. Indicates whether or not to block NFC outgoing beam.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNfcBlockOutgoingBeam() {
        return this.backingStore.get("nfcBlockOutgoingBeam");
    }
    /**
     * Gets the passwordBlockKeyguard property value. Indicates whether or not the keyguard is disabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockKeyguard() {
        return this.backingStore.get("passwordBlockKeyguard");
    }
    /**
     * Gets the passwordBlockKeyguardFeatures property value. List of device keyguard features to block. This collection can contain a maximum of 11 elements.
     * @return a {@link java.util.List<AndroidKeyguardFeature>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidKeyguardFeature> getPasswordBlockKeyguardFeatures() {
        return this.backingStore.get("passwordBlockKeyguardFeatures");
    }
    /**
     * Gets the passwordExpirationDays property value. Indicates the amount of time that a password can be set for before it expires and a new password will be required. Valid values 1 to 365
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.backingStore.get("passwordExpirationDays");
    }
    /**
     * Gets the passwordMinimumLength property value. Indicates the minimum length of the password required on the device. Valid values 4 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.backingStore.get("passwordMinimumLength");
    }
    /**
     * Gets the passwordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for device password. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLetterCharacters() {
        return this.backingStore.get("passwordMinimumLetterCharacters");
    }
    /**
     * Gets the passwordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLowerCaseCharacters() {
        return this.backingStore.get("passwordMinimumLowerCaseCharacters");
    }
    /**
     * Gets the passwordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumNonLetterCharacters() {
        return this.backingStore.get("passwordMinimumNonLetterCharacters");
    }
    /**
     * Gets the passwordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumNumericCharacters() {
        return this.backingStore.get("passwordMinimumNumericCharacters");
    }
    /**
     * Gets the passwordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumSymbolCharacters() {
        return this.backingStore.get("passwordMinimumSymbolCharacters");
    }
    /**
     * Gets the passwordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumUpperCaseCharacters() {
        return this.backingStore.get("passwordMinimumUpperCaseCharacters");
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeScreenTimeout() {
        return this.backingStore.get("passwordMinutesOfInactivityBeforeScreenTimeout");
    }
    /**
     * Gets the passwordPreviousPasswordCountToBlock property value. Indicates the length of password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordCountToBlock() {
        return this.backingStore.get("passwordPreviousPasswordCountToBlock");
    }
    /**
     * Gets the passwordRequiredType property value. Indicates the minimum password quality required on the device. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @return a {@link AndroidDeviceOwnerRequiredPasswordType}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordType getPasswordRequiredType() {
        return this.backingStore.get("passwordRequiredType");
    }
    /**
     * Gets the passwordRequireUnlock property value. Indicates the timeout period after which a device must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue.
     * @return a {@link AndroidDeviceOwnerRequiredPasswordUnlock}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordUnlock getPasswordRequireUnlock() {
        return this.backingStore.get("passwordRequireUnlock");
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this.backingStore.get("passwordSignInFailureCountBeforeFactoryReset");
    }
    /**
     * Gets the personalProfileAppsAllowInstallFromUnknownSources property value. Indicates whether the user can install apps from unknown sources on the personal profile.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPersonalProfileAppsAllowInstallFromUnknownSources() {
        return this.backingStore.get("personalProfileAppsAllowInstallFromUnknownSources");
    }
    /**
     * Gets the personalProfileCameraBlocked property value. Indicates whether to disable the use of the camera on the personal profile.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPersonalProfileCameraBlocked() {
        return this.backingStore.get("personalProfileCameraBlocked");
    }
    /**
     * Gets the personalProfilePersonalApplications property value. Policy applied to applications in the personal profile. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<AppListItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getPersonalProfilePersonalApplications() {
        return this.backingStore.get("personalProfilePersonalApplications");
    }
    /**
     * Gets the personalProfilePlayStoreMode property value. Used together with PersonalProfilePersonalApplications to control how apps in the personal profile are allowed or blocked. Possible values are: notConfigured, blockedApps, allowedApps.
     * @return a {@link PersonalProfilePersonalPlayStoreMode}
     */
    @jakarta.annotation.Nullable
    public PersonalProfilePersonalPlayStoreMode getPersonalProfilePlayStoreMode() {
        return this.backingStore.get("personalProfilePlayStoreMode");
    }
    /**
     * Gets the personalProfileScreenCaptureBlocked property value. Indicates whether to disable the capability to take screenshots on the personal profile.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPersonalProfileScreenCaptureBlocked() {
        return this.backingStore.get("personalProfileScreenCaptureBlocked");
    }
    /**
     * Gets the playStoreMode property value. Indicates the Play Store mode of the device. Possible values are: notConfigured, allowList, blockList.
     * @return a {@link AndroidDeviceOwnerPlayStoreMode}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerPlayStoreMode getPlayStoreMode() {
        return this.backingStore.get("playStoreMode");
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether or not to disable the capability to take screenshots.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.backingStore.get("screenCaptureBlocked");
    }
    /**
     * Gets the securityCommonCriteriaModeEnabled property value. Represents the security common criteria mode enabled provided to users when they attempt to modify managed settings on their device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityCommonCriteriaModeEnabled() {
        return this.backingStore.get("securityCommonCriteriaModeEnabled");
    }
    /**
     * Gets the securityDeveloperSettingsEnabled property value. Indicates whether or not the user is allowed to access developer settings like developer options and safe boot on the device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityDeveloperSettingsEnabled() {
        return this.backingStore.get("securityDeveloperSettingsEnabled");
    }
    /**
     * Gets the securityRequireVerifyApps property value. Indicates whether or not verify apps is required.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityRequireVerifyApps() {
        return this.backingStore.get("securityRequireVerifyApps");
    }
    /**
     * Gets the shareDeviceLocationDisabled property value. Indicates whether or not location sharing is disabled for fully managed devices (COBO), and corporate owned devices with a work profile (COPE)
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShareDeviceLocationDisabled() {
        return this.backingStore.get("shareDeviceLocationDisabled");
    }
    /**
     * Gets the shortHelpText property value. Represents the customized short help text provided to users when they attempt to modify managed settings on their device.
     * @return a {@link AndroidDeviceOwnerUserFacingMessage}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerUserFacingMessage getShortHelpText() {
        return this.backingStore.get("shortHelpText");
    }
    /**
     * Gets the statusBarBlocked property value. Indicates whether or the status bar is disabled, including notifications, quick settings and other screen overlays.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getStatusBarBlocked() {
        return this.backingStore.get("statusBarBlocked");
    }
    /**
     * Gets the stayOnModes property value. List of modes in which the device&apos;s display will stay powered-on. This collection can contain a maximum of 4 elements.
     * @return a {@link java.util.List<AndroidDeviceOwnerBatteryPluggedMode>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerBatteryPluggedMode> getStayOnModes() {
        return this.backingStore.get("stayOnModes");
    }
    /**
     * Gets the storageAllowUsb property value. Indicates whether or not to allow USB mass storage.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageAllowUsb() {
        return this.backingStore.get("storageAllowUsb");
    }
    /**
     * Gets the storageBlockExternalMedia property value. Indicates whether or not to block external media.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageBlockExternalMedia() {
        return this.backingStore.get("storageBlockExternalMedia");
    }
    /**
     * Gets the storageBlockUsbFileTransfer property value. Indicates whether or not to block USB file transfer.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageBlockUsbFileTransfer() {
        return this.backingStore.get("storageBlockUsbFileTransfer");
    }
    /**
     * Gets the systemUpdateFreezePeriods property value. Indicates the annually repeating time periods during which system updates are postponed. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<AndroidDeviceOwnerSystemUpdateFreezePeriod>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerSystemUpdateFreezePeriod> getSystemUpdateFreezePeriods() {
        return this.backingStore.get("systemUpdateFreezePeriods");
    }
    /**
     * Gets the systemUpdateInstallType property value. The type of system update configuration. Possible values are: deviceDefault, postpone, windowed, automatic.
     * @return a {@link AndroidDeviceOwnerSystemUpdateInstallType}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerSystemUpdateInstallType getSystemUpdateInstallType() {
        return this.backingStore.get("systemUpdateInstallType");
    }
    /**
     * Gets the systemUpdateWindowEndMinutesAfterMidnight property value. Indicates the number of minutes after midnight that the system update window ends. Valid values 0 to 1440
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSystemUpdateWindowEndMinutesAfterMidnight() {
        return this.backingStore.get("systemUpdateWindowEndMinutesAfterMidnight");
    }
    /**
     * Gets the systemUpdateWindowStartMinutesAfterMidnight property value. Indicates the number of minutes after midnight that the system update window starts. Valid values 0 to 1440
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSystemUpdateWindowStartMinutesAfterMidnight() {
        return this.backingStore.get("systemUpdateWindowStartMinutesAfterMidnight");
    }
    /**
     * Gets the systemWindowsBlocked property value. Whether or not to block Android system prompt windows, like toasts, phone activities, and system alerts.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSystemWindowsBlocked() {
        return this.backingStore.get("systemWindowsBlocked");
    }
    /**
     * Gets the usersBlockAdd property value. Indicates whether or not adding users and profiles is disabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUsersBlockAdd() {
        return this.backingStore.get("usersBlockAdd");
    }
    /**
     * Gets the usersBlockRemove property value. Indicates whether or not to disable removing other users from the device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUsersBlockRemove() {
        return this.backingStore.get("usersBlockRemove");
    }
    /**
     * Gets the volumeBlockAdjustment property value. Indicates whether or not adjusting the master volume is disabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVolumeBlockAdjustment() {
        return this.backingStore.get("volumeBlockAdjustment");
    }
    /**
     * Gets the vpnAlwaysOnLockdownMode property value. If an always on VPN package name is specified, whether or not to lock network traffic when that VPN is disconnected.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVpnAlwaysOnLockdownMode() {
        return this.backingStore.get("vpnAlwaysOnLockdownMode");
    }
    /**
     * Gets the vpnAlwaysOnPackageIdentifier property value. Android app package name for app that will handle an always-on VPN connection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVpnAlwaysOnPackageIdentifier() {
        return this.backingStore.get("vpnAlwaysOnPackageIdentifier");
    }
    /**
     * Gets the wifiBlockEditConfigurations property value. Indicates whether or not to block the user from editing the wifi connection settings.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWifiBlockEditConfigurations() {
        return this.backingStore.get("wifiBlockEditConfigurations");
    }
    /**
     * Gets the wifiBlockEditPolicyDefinedConfigurations property value. Indicates whether or not to block the user from editing just the networks defined by the policy.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWifiBlockEditPolicyDefinedConfigurations() {
        return this.backingStore.get("wifiBlockEditPolicyDefinedConfigurations");
    }
    /**
     * Gets the workProfilePasswordExpirationDays property value. Indicates the number of days that a work profile password can be set before it expires and a new password will be required. Valid values 1 to 365
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordExpirationDays() {
        return this.backingStore.get("workProfilePasswordExpirationDays");
    }
    /**
     * Gets the workProfilePasswordMinimumLength property value. Indicates the minimum length of the work profile password. Valid values 4 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumLength() {
        return this.backingStore.get("workProfilePasswordMinimumLength");
    }
    /**
     * Gets the workProfilePasswordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for the work profile password. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumLetterCharacters() {
        return this.backingStore.get("workProfilePasswordMinimumLetterCharacters");
    }
    /**
     * Gets the workProfilePasswordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower-case characters required for the work profile password. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumLowerCaseCharacters() {
        return this.backingStore.get("workProfilePasswordMinimumLowerCaseCharacters");
    }
    /**
     * Gets the workProfilePasswordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for the work profile password. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumNonLetterCharacters() {
        return this.backingStore.get("workProfilePasswordMinimumNonLetterCharacters");
    }
    /**
     * Gets the workProfilePasswordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for the work profile password. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumNumericCharacters() {
        return this.backingStore.get("workProfilePasswordMinimumNumericCharacters");
    }
    /**
     * Gets the workProfilePasswordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for the work profile password. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumSymbolCharacters() {
        return this.backingStore.get("workProfilePasswordMinimumSymbolCharacters");
    }
    /**
     * Gets the workProfilePasswordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper-case letter characters required for the work profile password. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordMinimumUpperCaseCharacters() {
        return this.backingStore.get("workProfilePasswordMinimumUpperCaseCharacters");
    }
    /**
     * Gets the workProfilePasswordPreviousPasswordCountToBlock property value. Indicates the length of the work profile password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordPreviousPasswordCountToBlock() {
        return this.backingStore.get("workProfilePasswordPreviousPasswordCountToBlock");
    }
    /**
     * Gets the workProfilePasswordRequiredType property value. Indicates the minimum password quality required on the work profile password. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @return a {@link AndroidDeviceOwnerRequiredPasswordType}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordType getWorkProfilePasswordRequiredType() {
        return this.backingStore.get("workProfilePasswordRequiredType");
    }
    /**
     * Gets the workProfilePasswordRequireUnlock property value. Indicates the timeout period after which a work profile must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue.
     * @return a {@link AndroidDeviceOwnerRequiredPasswordUnlock}
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordUnlock getWorkProfilePasswordRequireUnlock() {
        return this.backingStore.get("workProfilePasswordRequireUnlock");
    }
    /**
     * Gets the workProfilePasswordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect work profile password before the device is wiped. Valid values 4 to 11
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWorkProfilePasswordSignInFailureCountBeforeFactoryReset() {
        return this.backingStore.get("workProfilePasswordSignInFailureCountBeforeFactoryReset");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("accountsBlockModification", this.getAccountsBlockModification());
        writer.writeCollectionOfObjectValues("androidDeviceOwnerDelegatedScopeAppSettings", this.getAndroidDeviceOwnerDelegatedScopeAppSettings());
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
        writer.writeEnumValue("deviceLocationMode", this.getDeviceLocationMode());
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
        writer.writeBooleanValue("shareDeviceLocationDisabled", this.getShareDeviceLocationDisabled());
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
     */
    public void setAccountsBlockModification(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("accountsBlockModification", value);
    }
    /**
     * Sets the androidDeviceOwnerDelegatedScopeAppSettings property value. Specifies the list of managed apps with app details and its associated delegated scope(s). This collection can contain a maximum of 500 elements.
     * @param value Value to set for the androidDeviceOwnerDelegatedScopeAppSettings property.
     */
    public void setAndroidDeviceOwnerDelegatedScopeAppSettings(@jakarta.annotation.Nullable final java.util.List<AndroidDeviceOwnerDelegatedScopeAppSetting> value) {
        this.backingStore.set("androidDeviceOwnerDelegatedScopeAppSettings", value);
    }
    /**
     * Sets the appsAllowInstallFromUnknownSources property value. Indicates whether or not the user is allowed to enable to unknown sources setting.
     * @param value Value to set for the appsAllowInstallFromUnknownSources property.
     */
    public void setAppsAllowInstallFromUnknownSources(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appsAllowInstallFromUnknownSources", value);
    }
    /**
     * Sets the appsAutoUpdatePolicy property value. Indicates the value of the app auto update policy. Possible values are: notConfigured, userChoice, never, wiFiOnly, always.
     * @param value Value to set for the appsAutoUpdatePolicy property.
     */
    public void setAppsAutoUpdatePolicy(@jakarta.annotation.Nullable final AndroidDeviceOwnerAppAutoUpdatePolicyType value) {
        this.backingStore.set("appsAutoUpdatePolicy", value);
    }
    /**
     * Sets the appsDefaultPermissionPolicy property value. Indicates the permission policy for requests for runtime permissions if one is not defined for the app specifically. Possible values are: deviceDefault, prompt, autoGrant, autoDeny.
     * @param value Value to set for the appsDefaultPermissionPolicy property.
     */
    public void setAppsDefaultPermissionPolicy(@jakarta.annotation.Nullable final AndroidDeviceOwnerDefaultAppPermissionPolicyType value) {
        this.backingStore.set("appsDefaultPermissionPolicy", value);
    }
    /**
     * Sets the appsRecommendSkippingFirstUseHints property value. Whether or not to recommend all apps skip any first-time-use hints they may have added.
     * @param value Value to set for the appsRecommendSkippingFirstUseHints property.
     */
    public void setAppsRecommendSkippingFirstUseHints(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appsRecommendSkippingFirstUseHints", value);
    }
    /**
     * Sets the azureAdSharedDeviceDataClearApps property value. A list of managed apps that will have their data cleared during a global sign-out in AAD shared device mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the azureAdSharedDeviceDataClearApps property.
     */
    public void setAzureAdSharedDeviceDataClearApps(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.backingStore.set("azureAdSharedDeviceDataClearApps", value);
    }
    /**
     * Sets the bluetoothBlockConfiguration property value. Indicates whether or not to block a user from configuring bluetooth.
     * @param value Value to set for the bluetoothBlockConfiguration property.
     */
    public void setBluetoothBlockConfiguration(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bluetoothBlockConfiguration", value);
    }
    /**
     * Sets the bluetoothBlockContactSharing property value. Indicates whether or not to block a user from sharing contacts via bluetooth.
     * @param value Value to set for the bluetoothBlockContactSharing property.
     */
    public void setBluetoothBlockContactSharing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bluetoothBlockContactSharing", value);
    }
    /**
     * Sets the cameraBlocked property value. Indicates whether or not to disable the use of the camera.
     * @param value Value to set for the cameraBlocked property.
     */
    public void setCameraBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cameraBlocked", value);
    }
    /**
     * Sets the cellularBlockWiFiTethering property value. Indicates whether or not to block Wi-Fi tethering.
     * @param value Value to set for the cellularBlockWiFiTethering property.
     */
    public void setCellularBlockWiFiTethering(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cellularBlockWiFiTethering", value);
    }
    /**
     * Sets the certificateCredentialConfigurationDisabled property value. Indicates whether or not to block users from any certificate credential configuration.
     * @param value Value to set for the certificateCredentialConfigurationDisabled property.
     */
    public void setCertificateCredentialConfigurationDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("certificateCredentialConfigurationDisabled", value);
    }
    /**
     * Sets the crossProfilePoliciesAllowCopyPaste property value. Indicates whether or not text copied from one profile (personal or work) can be pasted in the other.
     * @param value Value to set for the crossProfilePoliciesAllowCopyPaste property.
     */
    public void setCrossProfilePoliciesAllowCopyPaste(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("crossProfilePoliciesAllowCopyPaste", value);
    }
    /**
     * Sets the crossProfilePoliciesAllowDataSharing property value. Indicates whether data from one profile (personal or work) can be shared with apps in the other profile. Possible values are: notConfigured, crossProfileDataSharingBlocked, dataSharingFromWorkToPersonalBlocked, crossProfileDataSharingAllowed, unkownFutureValue.
     * @param value Value to set for the crossProfilePoliciesAllowDataSharing property.
     */
    public void setCrossProfilePoliciesAllowDataSharing(@jakarta.annotation.Nullable final AndroidDeviceOwnerCrossProfileDataSharing value) {
        this.backingStore.set("crossProfilePoliciesAllowDataSharing", value);
    }
    /**
     * Sets the crossProfilePoliciesShowWorkContactsInPersonalProfile property value. Indicates whether or not contacts stored in work profile are shown in personal profile contact searches/incoming calls.
     * @param value Value to set for the crossProfilePoliciesShowWorkContactsInPersonalProfile property.
     */
    public void setCrossProfilePoliciesShowWorkContactsInPersonalProfile(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("crossProfilePoliciesShowWorkContactsInPersonalProfile", value);
    }
    /**
     * Sets the dataRoamingBlocked property value. Indicates whether or not to block a user from data roaming.
     * @param value Value to set for the dataRoamingBlocked property.
     */
    public void setDataRoamingBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("dataRoamingBlocked", value);
    }
    /**
     * Sets the dateTimeConfigurationBlocked property value. Indicates whether or not to block the user from manually changing the date or time on the device
     * @param value Value to set for the dateTimeConfigurationBlocked property.
     */
    public void setDateTimeConfigurationBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("dateTimeConfigurationBlocked", value);
    }
    /**
     * Sets the detailedHelpText property value. Represents the customized detailed help text provided to users when they attempt to modify managed settings on their device.
     * @param value Value to set for the detailedHelpText property.
     */
    public void setDetailedHelpText(@jakarta.annotation.Nullable final AndroidDeviceOwnerUserFacingMessage value) {
        this.backingStore.set("detailedHelpText", value);
    }
    /**
     * Sets the deviceLocationMode property value. Indicates the location setting configuration for fully managed devices (COBO) and corporate owned devices with a work profile (COPE). Possible values are: notConfigured, disabled, unknownFutureValue.
     * @param value Value to set for the deviceLocationMode property.
     */
    public void setDeviceLocationMode(@jakarta.annotation.Nullable final AndroidDeviceOwnerLocationMode value) {
        this.backingStore.set("deviceLocationMode", value);
    }
    /**
     * Sets the deviceOwnerLockScreenMessage property value. Represents the customized lock screen message provided to users when they attempt to modify managed settings on their device.
     * @param value Value to set for the deviceOwnerLockScreenMessage property.
     */
    public void setDeviceOwnerLockScreenMessage(@jakarta.annotation.Nullable final AndroidDeviceOwnerUserFacingMessage value) {
        this.backingStore.set("deviceOwnerLockScreenMessage", value);
    }
    /**
     * Sets the enrollmentProfile property value. Android Device Owner Enrollment Profile types.
     * @param value Value to set for the enrollmentProfile property.
     */
    public void setEnrollmentProfile(@jakarta.annotation.Nullable final AndroidDeviceOwnerEnrollmentProfileType value) {
        this.backingStore.set("enrollmentProfile", value);
    }
    /**
     * Sets the factoryResetBlocked property value. Indicates whether or not the factory reset option in settings is disabled.
     * @param value Value to set for the factoryResetBlocked property.
     */
    public void setFactoryResetBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("factoryResetBlocked", value);
    }
    /**
     * Sets the factoryResetDeviceAdministratorEmails property value. List of Google account emails that will be required to authenticate after a device is factory reset before it can be set up.
     * @param value Value to set for the factoryResetDeviceAdministratorEmails property.
     */
    public void setFactoryResetDeviceAdministratorEmails(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("factoryResetDeviceAdministratorEmails", value);
    }
    /**
     * Sets the globalProxy property value. Proxy is set up directly with host, port and excluded hosts.
     * @param value Value to set for the globalProxy property.
     */
    public void setGlobalProxy(@jakarta.annotation.Nullable final AndroidDeviceOwnerGlobalProxy value) {
        this.backingStore.set("globalProxy", value);
    }
    /**
     * Sets the googleAccountsBlocked property value. Indicates whether or not google accounts will be blocked.
     * @param value Value to set for the googleAccountsBlocked property.
     */
    public void setGoogleAccountsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("googleAccountsBlocked", value);
    }
    /**
     * Sets the kioskCustomizationDeviceSettingsBlocked property value. Indicateswhether a user can access the device&apos;s Settings app while in Kiosk Mode.
     * @param value Value to set for the kioskCustomizationDeviceSettingsBlocked property.
     */
    public void setKioskCustomizationDeviceSettingsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskCustomizationDeviceSettingsBlocked", value);
    }
    /**
     * Sets the kioskCustomizationPowerButtonActionsBlocked property value. Whether the power menu is shown when a user long presses the Power button of a device in Kiosk Mode.
     * @param value Value to set for the kioskCustomizationPowerButtonActionsBlocked property.
     */
    public void setKioskCustomizationPowerButtonActionsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskCustomizationPowerButtonActionsBlocked", value);
    }
    /**
     * Sets the kioskCustomizationStatusBar property value. Indicates whether system info and notifications are disabled in Kiosk Mode. Possible values are: notConfigured, notificationsAndSystemInfoEnabled, systemInfoOnly.
     * @param value Value to set for the kioskCustomizationStatusBar property.
     */
    public void setKioskCustomizationStatusBar(@jakarta.annotation.Nullable final AndroidDeviceOwnerKioskCustomizationStatusBar value) {
        this.backingStore.set("kioskCustomizationStatusBar", value);
    }
    /**
     * Sets the kioskCustomizationSystemErrorWarnings property value. Indicates whether system error dialogs for crashed or unresponsive apps are shown in Kiosk Mode.
     * @param value Value to set for the kioskCustomizationSystemErrorWarnings property.
     */
    public void setKioskCustomizationSystemErrorWarnings(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskCustomizationSystemErrorWarnings", value);
    }
    /**
     * Sets the kioskCustomizationSystemNavigation property value. Indicates which navigation features are enabled in Kiosk Mode. Possible values are: notConfigured, navigationEnabled, homeButtonOnly.
     * @param value Value to set for the kioskCustomizationSystemNavigation property.
     */
    public void setKioskCustomizationSystemNavigation(@jakarta.annotation.Nullable final AndroidDeviceOwnerKioskCustomizationSystemNavigation value) {
        this.backingStore.set("kioskCustomizationSystemNavigation", value);
    }
    /**
     * Sets the kioskModeAppOrderEnabled property value. Whether or not to enable app ordering in Kiosk Mode.
     * @param value Value to set for the kioskModeAppOrderEnabled property.
     */
    public void setKioskModeAppOrderEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeAppOrderEnabled", value);
    }
    /**
     * Sets the kioskModeAppPositions property value. The ordering of items on Kiosk Mode Managed Home Screen. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeAppPositions property.
     */
    public void setKioskModeAppPositions(@jakarta.annotation.Nullable final java.util.List<AndroidDeviceOwnerKioskModeAppPositionItem> value) {
        this.backingStore.set("kioskModeAppPositions", value);
    }
    /**
     * Sets the kioskModeApps property value. A list of managed apps that will be shown when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeApps property.
     */
    public void setKioskModeApps(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.backingStore.set("kioskModeApps", value);
    }
    /**
     * Sets the kioskModeAppsInFolderOrderedByName property value. Whether or not to alphabetize applications within a folder in Kiosk Mode.
     * @param value Value to set for the kioskModeAppsInFolderOrderedByName property.
     */
    public void setKioskModeAppsInFolderOrderedByName(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeAppsInFolderOrderedByName", value);
    }
    /**
     * Sets the kioskModeBluetoothConfigurationEnabled property value. Whether or not to allow a user to configure Bluetooth settings in Kiosk Mode.
     * @param value Value to set for the kioskModeBluetoothConfigurationEnabled property.
     */
    public void setKioskModeBluetoothConfigurationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeBluetoothConfigurationEnabled", value);
    }
    /**
     * Sets the kioskModeDebugMenuEasyAccessEnabled property value. Whether or not to allow a user to easy access to the debug menu in Kiosk Mode.
     * @param value Value to set for the kioskModeDebugMenuEasyAccessEnabled property.
     */
    public void setKioskModeDebugMenuEasyAccessEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeDebugMenuEasyAccessEnabled", value);
    }
    /**
     * Sets the kioskModeExitCode property value. Exit code to allow a user to escape from Kiosk Mode when the device is in Kiosk Mode.
     * @param value Value to set for the kioskModeExitCode property.
     */
    public void setKioskModeExitCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("kioskModeExitCode", value);
    }
    /**
     * Sets the kioskModeFlashlightConfigurationEnabled property value. Whether or not to allow a user to use the flashlight in Kiosk Mode.
     * @param value Value to set for the kioskModeFlashlightConfigurationEnabled property.
     */
    public void setKioskModeFlashlightConfigurationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeFlashlightConfigurationEnabled", value);
    }
    /**
     * Sets the kioskModeFolderIcon property value. Folder icon configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, darkSquare, darkCircle, lightSquare, lightCircle.
     * @param value Value to set for the kioskModeFolderIcon property.
     */
    public void setKioskModeFolderIcon(@jakarta.annotation.Nullable final AndroidDeviceOwnerKioskModeFolderIcon value) {
        this.backingStore.set("kioskModeFolderIcon", value);
    }
    /**
     * Sets the kioskModeGridHeight property value. Number of rows for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999
     * @param value Value to set for the kioskModeGridHeight property.
     */
    public void setKioskModeGridHeight(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("kioskModeGridHeight", value);
    }
    /**
     * Sets the kioskModeGridWidth property value. Number of columns for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999
     * @param value Value to set for the kioskModeGridWidth property.
     */
    public void setKioskModeGridWidth(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("kioskModeGridWidth", value);
    }
    /**
     * Sets the kioskModeIconSize property value. Icon size configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, smallest, small, regular, large, largest.
     * @param value Value to set for the kioskModeIconSize property.
     */
    public void setKioskModeIconSize(@jakarta.annotation.Nullable final AndroidDeviceOwnerKioskModeIconSize value) {
        this.backingStore.set("kioskModeIconSize", value);
    }
    /**
     * Sets the kioskModeLockHomeScreen property value. Whether or not to lock home screen to the end user in Kiosk Mode.
     * @param value Value to set for the kioskModeLockHomeScreen property.
     */
    public void setKioskModeLockHomeScreen(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeLockHomeScreen", value);
    }
    /**
     * Sets the kioskModeManagedFolders property value. A list of managed folders for a device in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeManagedFolders property.
     */
    public void setKioskModeManagedFolders(@jakarta.annotation.Nullable final java.util.List<AndroidDeviceOwnerKioskModeManagedFolder> value) {
        this.backingStore.set("kioskModeManagedFolders", value);
    }
    /**
     * Sets the kioskModeManagedHomeScreenAutoSignout property value. Whether or not to automatically sign-out of MHS and Shared device mode applications after inactive for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenAutoSignout property.
     */
    public void setKioskModeManagedHomeScreenAutoSignout(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeManagedHomeScreenAutoSignout", value);
    }
    /**
     * Sets the kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds property value. Number of seconds to give user notice before automatically signing them out for Managed Home Screen. Valid values 0 to 9999999
     * @param value Value to set for the kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds property.
     */
    public void setKioskModeManagedHomeScreenInactiveSignOutDelayInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds", value);
    }
    /**
     * Sets the kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds property value. Number of seconds device is inactive before automatically signing user out for Managed Home Screen. Valid values 0 to 9999999
     * @param value Value to set for the kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds property.
     */
    public void setKioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds", value);
    }
    /**
     * Sets the kioskModeManagedHomeScreenPinComplexity property value. Complexity of PIN for sign-in session for Managed Home Screen. Possible values are: notConfigured, simple, complex.
     * @param value Value to set for the kioskModeManagedHomeScreenPinComplexity property.
     */
    public void setKioskModeManagedHomeScreenPinComplexity(@jakarta.annotation.Nullable final KioskModeManagedHomeScreenPinComplexity value) {
        this.backingStore.set("kioskModeManagedHomeScreenPinComplexity", value);
    }
    /**
     * Sets the kioskModeManagedHomeScreenPinRequired property value. Whether or not require user to set a PIN for sign-in session for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenPinRequired property.
     */
    public void setKioskModeManagedHomeScreenPinRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeManagedHomeScreenPinRequired", value);
    }
    /**
     * Sets the kioskModeManagedHomeScreenPinRequiredToResume property value. Whether or not required user to enter session PIN if screensaver has appeared for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenPinRequiredToResume property.
     */
    public void setKioskModeManagedHomeScreenPinRequiredToResume(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeManagedHomeScreenPinRequiredToResume", value);
    }
    /**
     * Sets the kioskModeManagedHomeScreenSignInBackground property value. Custom URL background for sign-in screen for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenSignInBackground property.
     */
    public void setKioskModeManagedHomeScreenSignInBackground(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("kioskModeManagedHomeScreenSignInBackground", value);
    }
    /**
     * Sets the kioskModeManagedHomeScreenSignInBrandingLogo property value. Custom URL branding logo for sign-in screen and session pin page for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenSignInBrandingLogo property.
     */
    public void setKioskModeManagedHomeScreenSignInBrandingLogo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("kioskModeManagedHomeScreenSignInBrandingLogo", value);
    }
    /**
     * Sets the kioskModeManagedHomeScreenSignInEnabled property value. Whether or not show sign-in screen for Managed Home Screen.
     * @param value Value to set for the kioskModeManagedHomeScreenSignInEnabled property.
     */
    public void setKioskModeManagedHomeScreenSignInEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeManagedHomeScreenSignInEnabled", value);
    }
    /**
     * Sets the kioskModeManagedSettingsEntryDisabled property value. Whether or not to display the Managed Settings entry point on the managed home screen in Kiosk Mode.
     * @param value Value to set for the kioskModeManagedSettingsEntryDisabled property.
     */
    public void setKioskModeManagedSettingsEntryDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeManagedSettingsEntryDisabled", value);
    }
    /**
     * Sets the kioskModeMediaVolumeConfigurationEnabled property value. Whether or not to allow a user to change the media volume in Kiosk Mode.
     * @param value Value to set for the kioskModeMediaVolumeConfigurationEnabled property.
     */
    public void setKioskModeMediaVolumeConfigurationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeMediaVolumeConfigurationEnabled", value);
    }
    /**
     * Sets the kioskModeScreenOrientation property value. Screen orientation configuration for managed home screen in Kiosk Mode. Possible values are: notConfigured, portrait, landscape, autoRotate.
     * @param value Value to set for the kioskModeScreenOrientation property.
     */
    public void setKioskModeScreenOrientation(@jakarta.annotation.Nullable final AndroidDeviceOwnerKioskModeScreenOrientation value) {
        this.backingStore.set("kioskModeScreenOrientation", value);
    }
    /**
     * Sets the kioskModeScreenSaverConfigurationEnabled property value. Whether or not to enable screen saver mode or not in Kiosk Mode.
     * @param value Value to set for the kioskModeScreenSaverConfigurationEnabled property.
     */
    public void setKioskModeScreenSaverConfigurationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeScreenSaverConfigurationEnabled", value);
    }
    /**
     * Sets the kioskModeScreenSaverDetectMediaDisabled property value. Whether or not the device screen should show the screen saver if audio/video is playing in Kiosk Mode.
     * @param value Value to set for the kioskModeScreenSaverDetectMediaDisabled property.
     */
    public void setKioskModeScreenSaverDetectMediaDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeScreenSaverDetectMediaDisabled", value);
    }
    /**
     * Sets the kioskModeScreenSaverDisplayTimeInSeconds property value. The number of seconds that the device will display the screen saver for in Kiosk Mode. Valid values 0 to 9999999
     * @param value Value to set for the kioskModeScreenSaverDisplayTimeInSeconds property.
     */
    public void setKioskModeScreenSaverDisplayTimeInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("kioskModeScreenSaverDisplayTimeInSeconds", value);
    }
    /**
     * Sets the kioskModeScreenSaverImageUrl property value. URL for an image that will be the device&apos;s screen saver in Kiosk Mode.
     * @param value Value to set for the kioskModeScreenSaverImageUrl property.
     */
    public void setKioskModeScreenSaverImageUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("kioskModeScreenSaverImageUrl", value);
    }
    /**
     * Sets the kioskModeScreenSaverStartDelayInSeconds property value. The number of seconds the device needs to be inactive for before the screen saver is shown in Kiosk Mode. Valid values 1 to 9999999
     * @param value Value to set for the kioskModeScreenSaverStartDelayInSeconds property.
     */
    public void setKioskModeScreenSaverStartDelayInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("kioskModeScreenSaverStartDelayInSeconds", value);
    }
    /**
     * Sets the kioskModeShowAppNotificationBadge property value. Whether or not to display application notification badges in Kiosk Mode.
     * @param value Value to set for the kioskModeShowAppNotificationBadge property.
     */
    public void setKioskModeShowAppNotificationBadge(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeShowAppNotificationBadge", value);
    }
    /**
     * Sets the kioskModeShowDeviceInfo property value. Whether or not to allow a user to access basic device information.
     * @param value Value to set for the kioskModeShowDeviceInfo property.
     */
    public void setKioskModeShowDeviceInfo(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeShowDeviceInfo", value);
    }
    /**
     * Sets the kioskModeUseManagedHomeScreenApp property value. Whether or not to use single app kiosk mode or multi-app kiosk mode. Possible values are: notConfigured, singleAppMode, multiAppMode.
     * @param value Value to set for the kioskModeUseManagedHomeScreenApp property.
     */
    public void setKioskModeUseManagedHomeScreenApp(@jakarta.annotation.Nullable final KioskModeType value) {
        this.backingStore.set("kioskModeUseManagedHomeScreenApp", value);
    }
    /**
     * Sets the kioskModeVirtualHomeButtonEnabled property value. Whether or not to display a virtual home button when the device is in Kiosk Mode.
     * @param value Value to set for the kioskModeVirtualHomeButtonEnabled property.
     */
    public void setKioskModeVirtualHomeButtonEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeVirtualHomeButtonEnabled", value);
    }
    /**
     * Sets the kioskModeVirtualHomeButtonType property value. Indicates whether the virtual home button is a swipe up home button or a floating home button. Possible values are: notConfigured, swipeUp, floating.
     * @param value Value to set for the kioskModeVirtualHomeButtonType property.
     */
    public void setKioskModeVirtualHomeButtonType(@jakarta.annotation.Nullable final AndroidDeviceOwnerVirtualHomeButtonType value) {
        this.backingStore.set("kioskModeVirtualHomeButtonType", value);
    }
    /**
     * Sets the kioskModeWallpaperUrl property value. URL to a publicly accessible image to use for the wallpaper when the device is in Kiosk Mode.
     * @param value Value to set for the kioskModeWallpaperUrl property.
     */
    public void setKioskModeWallpaperUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("kioskModeWallpaperUrl", value);
    }
    /**
     * Sets the kioskModeWifiAllowedSsids property value. The restricted set of WIFI SSIDs available for the user to configure in Kiosk Mode. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the kioskModeWifiAllowedSsids property.
     */
    public void setKioskModeWifiAllowedSsids(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("kioskModeWifiAllowedSsids", value);
    }
    /**
     * Sets the kioskModeWiFiConfigurationEnabled property value. Whether or not to allow a user to configure Wi-Fi settings in Kiosk Mode.
     * @param value Value to set for the kioskModeWiFiConfigurationEnabled property.
     */
    public void setKioskModeWiFiConfigurationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("kioskModeWiFiConfigurationEnabled", value);
    }
    /**
     * Sets the locateDeviceLostModeEnabled property value. Indicates whether or not LocateDevice for devices with lost mode (COBO, COPE) is enabled.
     * @param value Value to set for the locateDeviceLostModeEnabled property.
     */
    public void setLocateDeviceLostModeEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("locateDeviceLostModeEnabled", value);
    }
    /**
     * Sets the locateDeviceUserlessDisabled property value. Indicates whether or not LocateDevice for userless (COSU) devices is disabled.
     * @param value Value to set for the locateDeviceUserlessDisabled property.
     */
    public void setLocateDeviceUserlessDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("locateDeviceUserlessDisabled", value);
    }
    /**
     * Sets the microphoneForceMute property value. Indicates whether or not to block unmuting the microphone on the device.
     * @param value Value to set for the microphoneForceMute property.
     */
    public void setMicrophoneForceMute(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("microphoneForceMute", value);
    }
    /**
     * Sets the microsoftLauncherConfigurationEnabled property value. Indicates whether or not to you want configure Microsoft Launcher.
     * @param value Value to set for the microsoftLauncherConfigurationEnabled property.
     */
    public void setMicrosoftLauncherConfigurationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("microsoftLauncherConfigurationEnabled", value);
    }
    /**
     * Sets the microsoftLauncherCustomWallpaperAllowUserModification property value. Indicates whether or not the user can modify the wallpaper to personalize their device.
     * @param value Value to set for the microsoftLauncherCustomWallpaperAllowUserModification property.
     */
    public void setMicrosoftLauncherCustomWallpaperAllowUserModification(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("microsoftLauncherCustomWallpaperAllowUserModification", value);
    }
    /**
     * Sets the microsoftLauncherCustomWallpaperEnabled property value. Indicates whether or not to configure the wallpaper on the targeted devices.
     * @param value Value to set for the microsoftLauncherCustomWallpaperEnabled property.
     */
    public void setMicrosoftLauncherCustomWallpaperEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("microsoftLauncherCustomWallpaperEnabled", value);
    }
    /**
     * Sets the microsoftLauncherCustomWallpaperImageUrl property value. Indicates the URL for the image file to use as the wallpaper on the targeted devices.
     * @param value Value to set for the microsoftLauncherCustomWallpaperImageUrl property.
     */
    public void setMicrosoftLauncherCustomWallpaperImageUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("microsoftLauncherCustomWallpaperImageUrl", value);
    }
    /**
     * Sets the microsoftLauncherDockPresenceAllowUserModification property value. Indicates whether or not the user can modify the device dock configuration on the device.
     * @param value Value to set for the microsoftLauncherDockPresenceAllowUserModification property.
     */
    public void setMicrosoftLauncherDockPresenceAllowUserModification(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("microsoftLauncherDockPresenceAllowUserModification", value);
    }
    /**
     * Sets the microsoftLauncherDockPresenceConfiguration property value. Indicates whether or not you want to configure the device dock. Possible values are: notConfigured, show, hide, disabled.
     * @param value Value to set for the microsoftLauncherDockPresenceConfiguration property.
     */
    public void setMicrosoftLauncherDockPresenceConfiguration(@jakarta.annotation.Nullable final MicrosoftLauncherDockPresence value) {
        this.backingStore.set("microsoftLauncherDockPresenceConfiguration", value);
    }
    /**
     * Sets the microsoftLauncherFeedAllowUserModification property value. Indicates whether or not the user can modify the launcher feed on the device.
     * @param value Value to set for the microsoftLauncherFeedAllowUserModification property.
     */
    public void setMicrosoftLauncherFeedAllowUserModification(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("microsoftLauncherFeedAllowUserModification", value);
    }
    /**
     * Sets the microsoftLauncherFeedEnabled property value. Indicates whether or not you want to enable the launcher feed on the device.
     * @param value Value to set for the microsoftLauncherFeedEnabled property.
     */
    public void setMicrosoftLauncherFeedEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("microsoftLauncherFeedEnabled", value);
    }
    /**
     * Sets the microsoftLauncherSearchBarPlacementConfiguration property value. Indicates the search bar placement configuration on the device. Possible values are: notConfigured, top, bottom, hide.
     * @param value Value to set for the microsoftLauncherSearchBarPlacementConfiguration property.
     */
    public void setMicrosoftLauncherSearchBarPlacementConfiguration(@jakarta.annotation.Nullable final MicrosoftLauncherSearchBarPlacement value) {
        this.backingStore.set("microsoftLauncherSearchBarPlacementConfiguration", value);
    }
    /**
     * Sets the networkEscapeHatchAllowed property value. Indicates whether or not the device will allow connecting to a temporary network connection at boot time.
     * @param value Value to set for the networkEscapeHatchAllowed property.
     */
    public void setNetworkEscapeHatchAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("networkEscapeHatchAllowed", value);
    }
    /**
     * Sets the nfcBlockOutgoingBeam property value. Indicates whether or not to block NFC outgoing beam.
     * @param value Value to set for the nfcBlockOutgoingBeam property.
     */
    public void setNfcBlockOutgoingBeam(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("nfcBlockOutgoingBeam", value);
    }
    /**
     * Sets the passwordBlockKeyguard property value. Indicates whether or not the keyguard is disabled.
     * @param value Value to set for the passwordBlockKeyguard property.
     */
    public void setPasswordBlockKeyguard(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordBlockKeyguard", value);
    }
    /**
     * Sets the passwordBlockKeyguardFeatures property value. List of device keyguard features to block. This collection can contain a maximum of 11 elements.
     * @param value Value to set for the passwordBlockKeyguardFeatures property.
     */
    public void setPasswordBlockKeyguardFeatures(@jakarta.annotation.Nullable final java.util.List<AndroidKeyguardFeature> value) {
        this.backingStore.set("passwordBlockKeyguardFeatures", value);
    }
    /**
     * Sets the passwordExpirationDays property value. Indicates the amount of time that a password can be set for before it expires and a new password will be required. Valid values 1 to 365
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordExpirationDays", value);
    }
    /**
     * Sets the passwordMinimumLength property value. Indicates the minimum length of the password required on the device. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumLength", value);
    }
    /**
     * Sets the passwordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumLetterCharacters property.
     */
    public void setPasswordMinimumLetterCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumLetterCharacters", value);
    }
    /**
     * Sets the passwordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumLowerCaseCharacters property.
     */
    public void setPasswordMinimumLowerCaseCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumLowerCaseCharacters", value);
    }
    /**
     * Sets the passwordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumNonLetterCharacters property.
     */
    public void setPasswordMinimumNonLetterCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumNonLetterCharacters", value);
    }
    /**
     * Sets the passwordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumNumericCharacters property.
     */
    public void setPasswordMinimumNumericCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumNumericCharacters", value);
    }
    /**
     * Sets the passwordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumSymbolCharacters property.
     */
    public void setPasswordMinimumSymbolCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumSymbolCharacters", value);
    }
    /**
     * Sets the passwordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumUpperCaseCharacters property.
     */
    public void setPasswordMinimumUpperCaseCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumUpperCaseCharacters", value);
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeScreenTimeout property.
     */
    public void setPasswordMinutesOfInactivityBeforeScreenTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinutesOfInactivityBeforeScreenTimeout", value);
    }
    /**
     * Sets the passwordPreviousPasswordCountToBlock property value. Indicates the length of password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24
     * @param value Value to set for the passwordPreviousPasswordCountToBlock property.
     */
    public void setPasswordPreviousPasswordCountToBlock(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordPreviousPasswordCountToBlock", value);
    }
    /**
     * Sets the passwordRequiredType property value. Indicates the minimum password quality required on the device. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordType value) {
        this.backingStore.set("passwordRequiredType", value);
    }
    /**
     * Sets the passwordRequireUnlock property value. Indicates the timeout period after which a device must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue.
     * @param value Value to set for the passwordRequireUnlock property.
     */
    public void setPasswordRequireUnlock(@jakarta.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordUnlock value) {
        this.backingStore.set("passwordRequireUnlock", value);
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     */
    public void setPasswordSignInFailureCountBeforeFactoryReset(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordSignInFailureCountBeforeFactoryReset", value);
    }
    /**
     * Sets the personalProfileAppsAllowInstallFromUnknownSources property value. Indicates whether the user can install apps from unknown sources on the personal profile.
     * @param value Value to set for the personalProfileAppsAllowInstallFromUnknownSources property.
     */
    public void setPersonalProfileAppsAllowInstallFromUnknownSources(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("personalProfileAppsAllowInstallFromUnknownSources", value);
    }
    /**
     * Sets the personalProfileCameraBlocked property value. Indicates whether to disable the use of the camera on the personal profile.
     * @param value Value to set for the personalProfileCameraBlocked property.
     */
    public void setPersonalProfileCameraBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("personalProfileCameraBlocked", value);
    }
    /**
     * Sets the personalProfilePersonalApplications property value. Policy applied to applications in the personal profile. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the personalProfilePersonalApplications property.
     */
    public void setPersonalProfilePersonalApplications(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.backingStore.set("personalProfilePersonalApplications", value);
    }
    /**
     * Sets the personalProfilePlayStoreMode property value. Used together with PersonalProfilePersonalApplications to control how apps in the personal profile are allowed or blocked. Possible values are: notConfigured, blockedApps, allowedApps.
     * @param value Value to set for the personalProfilePlayStoreMode property.
     */
    public void setPersonalProfilePlayStoreMode(@jakarta.annotation.Nullable final PersonalProfilePersonalPlayStoreMode value) {
        this.backingStore.set("personalProfilePlayStoreMode", value);
    }
    /**
     * Sets the personalProfileScreenCaptureBlocked property value. Indicates whether to disable the capability to take screenshots on the personal profile.
     * @param value Value to set for the personalProfileScreenCaptureBlocked property.
     */
    public void setPersonalProfileScreenCaptureBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("personalProfileScreenCaptureBlocked", value);
    }
    /**
     * Sets the playStoreMode property value. Indicates the Play Store mode of the device. Possible values are: notConfigured, allowList, blockList.
     * @param value Value to set for the playStoreMode property.
     */
    public void setPlayStoreMode(@jakarta.annotation.Nullable final AndroidDeviceOwnerPlayStoreMode value) {
        this.backingStore.set("playStoreMode", value);
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether or not to disable the capability to take screenshots.
     * @param value Value to set for the screenCaptureBlocked property.
     */
    public void setScreenCaptureBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("screenCaptureBlocked", value);
    }
    /**
     * Sets the securityCommonCriteriaModeEnabled property value. Represents the security common criteria mode enabled provided to users when they attempt to modify managed settings on their device.
     * @param value Value to set for the securityCommonCriteriaModeEnabled property.
     */
    public void setSecurityCommonCriteriaModeEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityCommonCriteriaModeEnabled", value);
    }
    /**
     * Sets the securityDeveloperSettingsEnabled property value. Indicates whether or not the user is allowed to access developer settings like developer options and safe boot on the device.
     * @param value Value to set for the securityDeveloperSettingsEnabled property.
     */
    public void setSecurityDeveloperSettingsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityDeveloperSettingsEnabled", value);
    }
    /**
     * Sets the securityRequireVerifyApps property value. Indicates whether or not verify apps is required.
     * @param value Value to set for the securityRequireVerifyApps property.
     */
    public void setSecurityRequireVerifyApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityRequireVerifyApps", value);
    }
    /**
     * Sets the shareDeviceLocationDisabled property value. Indicates whether or not location sharing is disabled for fully managed devices (COBO), and corporate owned devices with a work profile (COPE)
     * @param value Value to set for the shareDeviceLocationDisabled property.
     */
    public void setShareDeviceLocationDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("shareDeviceLocationDisabled", value);
    }
    /**
     * Sets the shortHelpText property value. Represents the customized short help text provided to users when they attempt to modify managed settings on their device.
     * @param value Value to set for the shortHelpText property.
     */
    public void setShortHelpText(@jakarta.annotation.Nullable final AndroidDeviceOwnerUserFacingMessage value) {
        this.backingStore.set("shortHelpText", value);
    }
    /**
     * Sets the statusBarBlocked property value. Indicates whether or the status bar is disabled, including notifications, quick settings and other screen overlays.
     * @param value Value to set for the statusBarBlocked property.
     */
    public void setStatusBarBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("statusBarBlocked", value);
    }
    /**
     * Sets the stayOnModes property value. List of modes in which the device&apos;s display will stay powered-on. This collection can contain a maximum of 4 elements.
     * @param value Value to set for the stayOnModes property.
     */
    public void setStayOnModes(@jakarta.annotation.Nullable final java.util.List<AndroidDeviceOwnerBatteryPluggedMode> value) {
        this.backingStore.set("stayOnModes", value);
    }
    /**
     * Sets the storageAllowUsb property value. Indicates whether or not to allow USB mass storage.
     * @param value Value to set for the storageAllowUsb property.
     */
    public void setStorageAllowUsb(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageAllowUsb", value);
    }
    /**
     * Sets the storageBlockExternalMedia property value. Indicates whether or not to block external media.
     * @param value Value to set for the storageBlockExternalMedia property.
     */
    public void setStorageBlockExternalMedia(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageBlockExternalMedia", value);
    }
    /**
     * Sets the storageBlockUsbFileTransfer property value. Indicates whether or not to block USB file transfer.
     * @param value Value to set for the storageBlockUsbFileTransfer property.
     */
    public void setStorageBlockUsbFileTransfer(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageBlockUsbFileTransfer", value);
    }
    /**
     * Sets the systemUpdateFreezePeriods property value. Indicates the annually repeating time periods during which system updates are postponed. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the systemUpdateFreezePeriods property.
     */
    public void setSystemUpdateFreezePeriods(@jakarta.annotation.Nullable final java.util.List<AndroidDeviceOwnerSystemUpdateFreezePeriod> value) {
        this.backingStore.set("systemUpdateFreezePeriods", value);
    }
    /**
     * Sets the systemUpdateInstallType property value. The type of system update configuration. Possible values are: deviceDefault, postpone, windowed, automatic.
     * @param value Value to set for the systemUpdateInstallType property.
     */
    public void setSystemUpdateInstallType(@jakarta.annotation.Nullable final AndroidDeviceOwnerSystemUpdateInstallType value) {
        this.backingStore.set("systemUpdateInstallType", value);
    }
    /**
     * Sets the systemUpdateWindowEndMinutesAfterMidnight property value. Indicates the number of minutes after midnight that the system update window ends. Valid values 0 to 1440
     * @param value Value to set for the systemUpdateWindowEndMinutesAfterMidnight property.
     */
    public void setSystemUpdateWindowEndMinutesAfterMidnight(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("systemUpdateWindowEndMinutesAfterMidnight", value);
    }
    /**
     * Sets the systemUpdateWindowStartMinutesAfterMidnight property value. Indicates the number of minutes after midnight that the system update window starts. Valid values 0 to 1440
     * @param value Value to set for the systemUpdateWindowStartMinutesAfterMidnight property.
     */
    public void setSystemUpdateWindowStartMinutesAfterMidnight(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("systemUpdateWindowStartMinutesAfterMidnight", value);
    }
    /**
     * Sets the systemWindowsBlocked property value. Whether or not to block Android system prompt windows, like toasts, phone activities, and system alerts.
     * @param value Value to set for the systemWindowsBlocked property.
     */
    public void setSystemWindowsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("systemWindowsBlocked", value);
    }
    /**
     * Sets the usersBlockAdd property value. Indicates whether or not adding users and profiles is disabled.
     * @param value Value to set for the usersBlockAdd property.
     */
    public void setUsersBlockAdd(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("usersBlockAdd", value);
    }
    /**
     * Sets the usersBlockRemove property value. Indicates whether or not to disable removing other users from the device.
     * @param value Value to set for the usersBlockRemove property.
     */
    public void setUsersBlockRemove(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("usersBlockRemove", value);
    }
    /**
     * Sets the volumeBlockAdjustment property value. Indicates whether or not adjusting the master volume is disabled.
     * @param value Value to set for the volumeBlockAdjustment property.
     */
    public void setVolumeBlockAdjustment(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("volumeBlockAdjustment", value);
    }
    /**
     * Sets the vpnAlwaysOnLockdownMode property value. If an always on VPN package name is specified, whether or not to lock network traffic when that VPN is disconnected.
     * @param value Value to set for the vpnAlwaysOnLockdownMode property.
     */
    public void setVpnAlwaysOnLockdownMode(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("vpnAlwaysOnLockdownMode", value);
    }
    /**
     * Sets the vpnAlwaysOnPackageIdentifier property value. Android app package name for app that will handle an always-on VPN connection.
     * @param value Value to set for the vpnAlwaysOnPackageIdentifier property.
     */
    public void setVpnAlwaysOnPackageIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("vpnAlwaysOnPackageIdentifier", value);
    }
    /**
     * Sets the wifiBlockEditConfigurations property value. Indicates whether or not to block the user from editing the wifi connection settings.
     * @param value Value to set for the wifiBlockEditConfigurations property.
     */
    public void setWifiBlockEditConfigurations(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("wifiBlockEditConfigurations", value);
    }
    /**
     * Sets the wifiBlockEditPolicyDefinedConfigurations property value. Indicates whether or not to block the user from editing just the networks defined by the policy.
     * @param value Value to set for the wifiBlockEditPolicyDefinedConfigurations property.
     */
    public void setWifiBlockEditPolicyDefinedConfigurations(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("wifiBlockEditPolicyDefinedConfigurations", value);
    }
    /**
     * Sets the workProfilePasswordExpirationDays property value. Indicates the number of days that a work profile password can be set before it expires and a new password will be required. Valid values 1 to 365
     * @param value Value to set for the workProfilePasswordExpirationDays property.
     */
    public void setWorkProfilePasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordExpirationDays", value);
    }
    /**
     * Sets the workProfilePasswordMinimumLength property value. Indicates the minimum length of the work profile password. Valid values 4 to 16
     * @param value Value to set for the workProfilePasswordMinimumLength property.
     */
    public void setWorkProfilePasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinimumLength", value);
    }
    /**
     * Sets the workProfilePasswordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumLetterCharacters property.
     */
    public void setWorkProfilePasswordMinimumLetterCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinimumLetterCharacters", value);
    }
    /**
     * Sets the workProfilePasswordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower-case characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumLowerCaseCharacters property.
     */
    public void setWorkProfilePasswordMinimumLowerCaseCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinimumLowerCaseCharacters", value);
    }
    /**
     * Sets the workProfilePasswordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumNonLetterCharacters property.
     */
    public void setWorkProfilePasswordMinimumNonLetterCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinimumNonLetterCharacters", value);
    }
    /**
     * Sets the workProfilePasswordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumNumericCharacters property.
     */
    public void setWorkProfilePasswordMinimumNumericCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinimumNumericCharacters", value);
    }
    /**
     * Sets the workProfilePasswordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumSymbolCharacters property.
     */
    public void setWorkProfilePasswordMinimumSymbolCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinimumSymbolCharacters", value);
    }
    /**
     * Sets the workProfilePasswordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper-case letter characters required for the work profile password. Valid values 1 to 16
     * @param value Value to set for the workProfilePasswordMinimumUpperCaseCharacters property.
     */
    public void setWorkProfilePasswordMinimumUpperCaseCharacters(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordMinimumUpperCaseCharacters", value);
    }
    /**
     * Sets the workProfilePasswordPreviousPasswordCountToBlock property value. Indicates the length of the work profile password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24
     * @param value Value to set for the workProfilePasswordPreviousPasswordCountToBlock property.
     */
    public void setWorkProfilePasswordPreviousPasswordCountToBlock(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordPreviousPasswordCountToBlock", value);
    }
    /**
     * Sets the workProfilePasswordRequiredType property value. Indicates the minimum password quality required on the work profile password. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @param value Value to set for the workProfilePasswordRequiredType property.
     */
    public void setWorkProfilePasswordRequiredType(@jakarta.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordType value) {
        this.backingStore.set("workProfilePasswordRequiredType", value);
    }
    /**
     * Sets the workProfilePasswordRequireUnlock property value. Indicates the timeout period after which a work profile must be unlocked using a form of strong authentication. Possible values are: deviceDefault, daily, unkownFutureValue.
     * @param value Value to set for the workProfilePasswordRequireUnlock property.
     */
    public void setWorkProfilePasswordRequireUnlock(@jakarta.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordUnlock value) {
        this.backingStore.set("workProfilePasswordRequireUnlock", value);
    }
    /**
     * Sets the workProfilePasswordSignInFailureCountBeforeFactoryReset property value. Indicates the number of times a user can enter an incorrect work profile password before the device is wiped. Valid values 4 to 11
     * @param value Value to set for the workProfilePasswordSignInFailureCountBeforeFactoryReset property.
     */
    public void setWorkProfilePasswordSignInFailureCountBeforeFactoryReset(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("workProfilePasswordSignInFailureCountBeforeFactoryReset", value);
    }
}
