package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Policy used to configure detailed management settings for a specified set of apps for all users not targeted by a TargetedManagedAppProtection Policy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DefaultManagedAppProtection extends ManagedAppProtection implements Parsable {
    /**
     * Instantiates a new DefaultManagedAppProtection and sets the default values.
     */
    public DefaultManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.defaultManagedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DefaultManagedAppProtection
     */
    @jakarta.annotation.Nonnull
    public static DefaultManagedAppProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DefaultManagedAppProtection();
    }
    /**
     * Gets the allowedAndroidDeviceManufacturers property value. Semicolon seperated list of device manufacturers allowed, as a string, for the managed app to work. (Android only)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAllowedAndroidDeviceManufacturers() {
        return this.backingStore.get("allowedAndroidDeviceManufacturers");
    }
    /**
     * Gets the allowedAndroidDeviceModels property value. List of device models allowed, as a string, for the managed app to work. (Android Only)
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedAndroidDeviceModels() {
        return this.backingStore.get("allowedAndroidDeviceModels");
    }
    /**
     * Gets the allowedIosDeviceModels property value. Semicolon seperated list of device models allowed, as a string, for the managed app to work. (iOS Only)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAllowedIosDeviceModels() {
        return this.backingStore.get("allowedIosDeviceModels");
    }
    /**
     * Gets the appActionIfAccountIsClockedOut property value. Defines a managed app behavior, either block or warn, if the user is clocked out (non-working time). Possible values are: block, wipe, warn.
     * @return a DefaultManagedAppProtectionAppActionIfAccountIsClockedOut
     */
    @jakarta.annotation.Nullable
    public DefaultManagedAppProtectionAppActionIfAccountIsClockedOut getAppActionIfAccountIsClockedOut() {
        return this.backingStore.get("appActionIfAccountIsClockedOut");
    }
    /**
     * Gets the appActionIfAndroidDeviceManufacturerNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @return a ManagedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfAndroidDeviceManufacturerNotAllowed() {
        return this.backingStore.get("appActionIfAndroidDeviceManufacturerNotAllowed");
    }
    /**
     * Gets the appActionIfAndroidDeviceModelNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @return a ManagedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfAndroidDeviceModelNotAllowed() {
        return this.backingStore.get("appActionIfAndroidDeviceModelNotAllowed");
    }
    /**
     * Gets the appActionIfAndroidSafetyNetAppsVerificationFailed property value. An admin initiated action to be applied on a managed app.
     * @return a ManagedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfAndroidSafetyNetAppsVerificationFailed() {
        return this.backingStore.get("appActionIfAndroidSafetyNetAppsVerificationFailed");
    }
    /**
     * Gets the appActionIfAndroidSafetyNetDeviceAttestationFailed property value. An admin initiated action to be applied on a managed app.
     * @return a ManagedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfAndroidSafetyNetDeviceAttestationFailed() {
        return this.backingStore.get("appActionIfAndroidSafetyNetDeviceAttestationFailed");
    }
    /**
     * Gets the appActionIfDeviceLockNotSet property value. An admin initiated action to be applied on a managed app.
     * @return a ManagedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfDeviceLockNotSet() {
        return this.backingStore.get("appActionIfDeviceLockNotSet");
    }
    /**
     * Gets the appActionIfDevicePasscodeComplexityLessThanHigh property value. If the device does not have a passcode of high complexity or higher, trigger the stored action. Possible values are: block, wipe, warn.
     * @return a DefaultManagedAppProtectionAppActionIfDevicePasscodeComplexityLessThanHigh
     */
    @jakarta.annotation.Nullable
    public DefaultManagedAppProtectionAppActionIfDevicePasscodeComplexityLessThanHigh getAppActionIfDevicePasscodeComplexityLessThanHigh() {
        return this.backingStore.get("appActionIfDevicePasscodeComplexityLessThanHigh");
    }
    /**
     * Gets the appActionIfDevicePasscodeComplexityLessThanLow property value. If the device does not have a passcode of low complexity or higher, trigger the stored action. Possible values are: block, wipe, warn.
     * @return a DefaultManagedAppProtectionAppActionIfDevicePasscodeComplexityLessThanLow
     */
    @jakarta.annotation.Nullable
    public DefaultManagedAppProtectionAppActionIfDevicePasscodeComplexityLessThanLow getAppActionIfDevicePasscodeComplexityLessThanLow() {
        return this.backingStore.get("appActionIfDevicePasscodeComplexityLessThanLow");
    }
    /**
     * Gets the appActionIfDevicePasscodeComplexityLessThanMedium property value. If the device does not have a passcode of medium complexity or higher, trigger the stored action. Possible values are: block, wipe, warn.
     * @return a DefaultManagedAppProtectionAppActionIfDevicePasscodeComplexityLessThanMedium
     */
    @jakarta.annotation.Nullable
    public DefaultManagedAppProtectionAppActionIfDevicePasscodeComplexityLessThanMedium getAppActionIfDevicePasscodeComplexityLessThanMedium() {
        return this.backingStore.get("appActionIfDevicePasscodeComplexityLessThanMedium");
    }
    /**
     * Gets the appActionIfIosDeviceModelNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @return a ManagedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfIosDeviceModelNotAllowed() {
        return this.backingStore.get("appActionIfIosDeviceModelNotAllowed");
    }
    /**
     * Gets the appDataEncryptionType property value. Represents the level to which app data is encrypted for managed apps
     * @return a ManagedAppDataEncryptionType
     */
    @jakarta.annotation.Nullable
    public ManagedAppDataEncryptionType getAppDataEncryptionType() {
        return this.backingStore.get("appDataEncryptionType");
    }
    /**
     * Gets the apps property value. List of apps to which the policy is deployed.
     * @return a java.util.List<ManagedMobileApp>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedMobileApp> getApps() {
        return this.backingStore.get("apps");
    }
    /**
     * Gets the biometricAuthenticationBlocked property value. Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True. (Android Only)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBiometricAuthenticationBlocked() {
        return this.backingStore.get("biometricAuthenticationBlocked");
    }
    /**
     * Gets the blockAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or app access will be blocked.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBlockAfterCompanyPortalUpdateDeferralInDays() {
        return this.backingStore.get("blockAfterCompanyPortalUpdateDeferralInDays");
    }
    /**
     * Gets the connectToVpnOnLaunch property value. Whether the app should connect to the configured VPN on launch (Android only).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectToVpnOnLaunch() {
        return this.backingStore.get("connectToVpnOnLaunch");
    }
    /**
     * Gets the customBrowserDisplayName property value. Friendly name of the preferred custom browser to open weblink on Android. (Android only)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomBrowserDisplayName() {
        return this.backingStore.get("customBrowserDisplayName");
    }
    /**
     * Gets the customBrowserPackageId property value. Unique identifier of a custom browser to open weblink on Android. (Android only)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomBrowserPackageId() {
        return this.backingStore.get("customBrowserPackageId");
    }
    /**
     * Gets the customBrowserProtocol property value. A custom browser protocol to open weblink on iOS. (iOS only)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomBrowserProtocol() {
        return this.backingStore.get("customBrowserProtocol");
    }
    /**
     * Gets the customDialerAppDisplayName property value. Friendly name of a custom dialer app to click-to-open a phone number on Android.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomDialerAppDisplayName() {
        return this.backingStore.get("customDialerAppDisplayName");
    }
    /**
     * Gets the customDialerAppPackageId property value. PackageId of a custom dialer app to click-to-open a phone number on Android.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomDialerAppPackageId() {
        return this.backingStore.get("customDialerAppPackageId");
    }
    /**
     * Gets the customDialerAppProtocol property value. Protocol of a custom dialer app to click-to-open a phone number on iOS, for example, skype:.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomDialerAppProtocol() {
        return this.backingStore.get("customDialerAppProtocol");
    }
    /**
     * Gets the customSettings property value. A set of string key and string value pairs to be sent to the affected users, unalterned by this service
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getCustomSettings() {
        return this.backingStore.get("customSettings");
    }
    /**
     * Gets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeployedAppCount() {
        return this.backingStore.get("deployedAppCount");
    }
    /**
     * Gets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @return a ManagedAppPolicyDeploymentSummary
     */
    @jakarta.annotation.Nullable
    public ManagedAppPolicyDeploymentSummary getDeploymentSummary() {
        return this.backingStore.get("deploymentSummary");
    }
    /**
     * Gets the deviceLockRequired property value. Defines if any kind of lock must be required on device. (android only)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceLockRequired() {
        return this.backingStore.get("deviceLockRequired");
    }
    /**
     * Gets the disableAppEncryptionIfDeviceEncryptionIsEnabled property value. When this setting is enabled, app level encryption is disabled if device level encryption is enabled. (Android only)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableAppEncryptionIfDeviceEncryptionIsEnabled() {
        return this.backingStore.get("disableAppEncryptionIfDeviceEncryptionIsEnabled");
    }
    /**
     * Gets the disableProtectionOfManagedOutboundOpenInData property value. Disable protection of data transferred to other apps through IOS OpenIn option. This setting is only allowed to be True when AllowedOutboundDataTransferDestinations is set to ManagedApps. (iOS Only)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableProtectionOfManagedOutboundOpenInData() {
        return this.backingStore.get("disableProtectionOfManagedOutboundOpenInData");
    }
    /**
     * Gets the encryptAppData property value. Indicates whether managed-app data should be encrypted. (Android only)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEncryptAppData() {
        return this.backingStore.get("encryptAppData");
    }
    /**
     * Gets the exemptedAppPackages property value. Android App packages in this list will be exempt from the policy and will be able to receive data from managed apps. (Android only)
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getExemptedAppPackages() {
        return this.backingStore.get("exemptedAppPackages");
    }
    /**
     * Gets the exemptedAppProtocols property value. iOS Apps in this list will be exempt from the policy and will be able to receive data from managed apps. (iOS Only)
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getExemptedAppProtocols() {
        return this.backingStore.get("exemptedAppProtocols");
    }
    /**
     * Gets the faceIdBlocked property value. Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. (iOS Only)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFaceIdBlocked() {
        return this.backingStore.get("faceIdBlocked");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedAndroidDeviceManufacturers", (n) -> { this.setAllowedAndroidDeviceManufacturers(n.getStringValue()); });
        deserializerMap.put("allowedAndroidDeviceModels", (n) -> { this.setAllowedAndroidDeviceModels(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allowedIosDeviceModels", (n) -> { this.setAllowedIosDeviceModels(n.getStringValue()); });
        deserializerMap.put("appActionIfAccountIsClockedOut", (n) -> { this.setAppActionIfAccountIsClockedOut(n.getEnumValue(DefaultManagedAppProtectionAppActionIfAccountIsClockedOut::forValue)); });
        deserializerMap.put("appActionIfAndroidDeviceManufacturerNotAllowed", (n) -> { this.setAppActionIfAndroidDeviceManufacturerNotAllowed(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appActionIfAndroidDeviceModelNotAllowed", (n) -> { this.setAppActionIfAndroidDeviceModelNotAllowed(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appActionIfAndroidSafetyNetAppsVerificationFailed", (n) -> { this.setAppActionIfAndroidSafetyNetAppsVerificationFailed(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appActionIfAndroidSafetyNetDeviceAttestationFailed", (n) -> { this.setAppActionIfAndroidSafetyNetDeviceAttestationFailed(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appActionIfDeviceLockNotSet", (n) -> { this.setAppActionIfDeviceLockNotSet(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appActionIfDevicePasscodeComplexityLessThanHigh", (n) -> { this.setAppActionIfDevicePasscodeComplexityLessThanHigh(n.getEnumValue(DefaultManagedAppProtectionAppActionIfDevicePasscodeComplexityLessThanHigh::forValue)); });
        deserializerMap.put("appActionIfDevicePasscodeComplexityLessThanLow", (n) -> { this.setAppActionIfDevicePasscodeComplexityLessThanLow(n.getEnumValue(DefaultManagedAppProtectionAppActionIfDevicePasscodeComplexityLessThanLow::forValue)); });
        deserializerMap.put("appActionIfDevicePasscodeComplexityLessThanMedium", (n) -> { this.setAppActionIfDevicePasscodeComplexityLessThanMedium(n.getEnumValue(DefaultManagedAppProtectionAppActionIfDevicePasscodeComplexityLessThanMedium::forValue)); });
        deserializerMap.put("appActionIfIosDeviceModelNotAllowed", (n) -> { this.setAppActionIfIosDeviceModelNotAllowed(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appDataEncryptionType", (n) -> { this.setAppDataEncryptionType(n.getEnumValue(ManagedAppDataEncryptionType::forValue)); });
        deserializerMap.put("apps", (n) -> { this.setApps(n.getCollectionOfObjectValues(ManagedMobileApp::createFromDiscriminatorValue)); });
        deserializerMap.put("biometricAuthenticationBlocked", (n) -> { this.setBiometricAuthenticationBlocked(n.getBooleanValue()); });
        deserializerMap.put("blockAfterCompanyPortalUpdateDeferralInDays", (n) -> { this.setBlockAfterCompanyPortalUpdateDeferralInDays(n.getIntegerValue()); });
        deserializerMap.put("connectToVpnOnLaunch", (n) -> { this.setConnectToVpnOnLaunch(n.getBooleanValue()); });
        deserializerMap.put("customBrowserDisplayName", (n) -> { this.setCustomBrowserDisplayName(n.getStringValue()); });
        deserializerMap.put("customBrowserPackageId", (n) -> { this.setCustomBrowserPackageId(n.getStringValue()); });
        deserializerMap.put("customBrowserProtocol", (n) -> { this.setCustomBrowserProtocol(n.getStringValue()); });
        deserializerMap.put("customDialerAppDisplayName", (n) -> { this.setCustomDialerAppDisplayName(n.getStringValue()); });
        deserializerMap.put("customDialerAppPackageId", (n) -> { this.setCustomDialerAppPackageId(n.getStringValue()); });
        deserializerMap.put("customDialerAppProtocol", (n) -> { this.setCustomDialerAppProtocol(n.getStringValue()); });
        deserializerMap.put("customSettings", (n) -> { this.setCustomSettings(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("deployedAppCount", (n) -> { this.setDeployedAppCount(n.getIntegerValue()); });
        deserializerMap.put("deploymentSummary", (n) -> { this.setDeploymentSummary(n.getObjectValue(ManagedAppPolicyDeploymentSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceLockRequired", (n) -> { this.setDeviceLockRequired(n.getBooleanValue()); });
        deserializerMap.put("disableAppEncryptionIfDeviceEncryptionIsEnabled", (n) -> { this.setDisableAppEncryptionIfDeviceEncryptionIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("disableProtectionOfManagedOutboundOpenInData", (n) -> { this.setDisableProtectionOfManagedOutboundOpenInData(n.getBooleanValue()); });
        deserializerMap.put("encryptAppData", (n) -> { this.setEncryptAppData(n.getBooleanValue()); });
        deserializerMap.put("exemptedAppPackages", (n) -> { this.setExemptedAppPackages(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("exemptedAppProtocols", (n) -> { this.setExemptedAppProtocols(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("faceIdBlocked", (n) -> { this.setFaceIdBlocked(n.getBooleanValue()); });
        deserializerMap.put("filterOpenInToOnlyManagedApps", (n) -> { this.setFilterOpenInToOnlyManagedApps(n.getBooleanValue()); });
        deserializerMap.put("fingerprintAndBiometricEnabled", (n) -> { this.setFingerprintAndBiometricEnabled(n.getBooleanValue()); });
        deserializerMap.put("messagingRedirectAppDisplayName", (n) -> { this.setMessagingRedirectAppDisplayName(n.getStringValue()); });
        deserializerMap.put("messagingRedirectAppPackageId", (n) -> { this.setMessagingRedirectAppPackageId(n.getStringValue()); });
        deserializerMap.put("messagingRedirectAppUrlScheme", (n) -> { this.setMessagingRedirectAppUrlScheme(n.getStringValue()); });
        deserializerMap.put("minimumRequiredCompanyPortalVersion", (n) -> { this.setMinimumRequiredCompanyPortalVersion(n.getStringValue()); });
        deserializerMap.put("minimumRequiredPatchVersion", (n) -> { this.setMinimumRequiredPatchVersion(n.getStringValue()); });
        deserializerMap.put("minimumRequiredSdkVersion", (n) -> { this.setMinimumRequiredSdkVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningCompanyPortalVersion", (n) -> { this.setMinimumWarningCompanyPortalVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningPatchVersion", (n) -> { this.setMinimumWarningPatchVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningSdkVersion", (n) -> { this.setMinimumWarningSdkVersion(n.getStringValue()); });
        deserializerMap.put("minimumWipeCompanyPortalVersion", (n) -> { this.setMinimumWipeCompanyPortalVersion(n.getStringValue()); });
        deserializerMap.put("minimumWipePatchVersion", (n) -> { this.setMinimumWipePatchVersion(n.getStringValue()); });
        deserializerMap.put("minimumWipeSdkVersion", (n) -> { this.setMinimumWipeSdkVersion(n.getStringValue()); });
        deserializerMap.put("protectInboundDataFromUnknownSources", (n) -> { this.setProtectInboundDataFromUnknownSources(n.getBooleanValue()); });
        deserializerMap.put("requireClass3Biometrics", (n) -> { this.setRequireClass3Biometrics(n.getBooleanValue()); });
        deserializerMap.put("requiredAndroidSafetyNetAppsVerificationType", (n) -> { this.setRequiredAndroidSafetyNetAppsVerificationType(n.getEnumValue(AndroidManagedAppSafetyNetAppsVerificationType::forValue)); });
        deserializerMap.put("requiredAndroidSafetyNetDeviceAttestationType", (n) -> { this.setRequiredAndroidSafetyNetDeviceAttestationType(n.getEnumValue(AndroidManagedAppSafetyNetDeviceAttestationType::forValue)); });
        deserializerMap.put("requiredAndroidSafetyNetEvaluationType", (n) -> { this.setRequiredAndroidSafetyNetEvaluationType(n.getEnumValue(AndroidManagedAppSafetyNetEvaluationType::forValue)); });
        deserializerMap.put("requirePinAfterBiometricChange", (n) -> { this.setRequirePinAfterBiometricChange(n.getBooleanValue()); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { this.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("thirdPartyKeyboardsBlocked", (n) -> { this.setThirdPartyKeyboardsBlocked(n.getBooleanValue()); });
        deserializerMap.put("warnAfterCompanyPortalUpdateDeferralInDays", (n) -> { this.setWarnAfterCompanyPortalUpdateDeferralInDays(n.getIntegerValue()); });
        deserializerMap.put("wipeAfterCompanyPortalUpdateDeferralInDays", (n) -> { this.setWipeAfterCompanyPortalUpdateDeferralInDays(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filterOpenInToOnlyManagedApps property value. Defines if open-in operation is supported from the managed app to the filesharing locations selected. This setting only applies when AllowedOutboundDataTransferDestinations is set to ManagedApps and DisableProtectionOfManagedOutboundOpenInData is set to False. (iOS Only)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFilterOpenInToOnlyManagedApps() {
        return this.backingStore.get("filterOpenInToOnlyManagedApps");
    }
    /**
     * Gets the fingerprintAndBiometricEnabled property value. Indicate to the client to enable both biometrics and fingerprints for the app.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFingerprintAndBiometricEnabled() {
        return this.backingStore.get("fingerprintAndBiometricEnabled");
    }
    /**
     * Gets the messagingRedirectAppDisplayName property value. When a specific app redirection is enforced by protectedMessagingRedirectAppType in an App Protection Policy, this value defines the app name which are allowed to be used.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessagingRedirectAppDisplayName() {
        return this.backingStore.get("messagingRedirectAppDisplayName");
    }
    /**
     * Gets the messagingRedirectAppPackageId property value. When a specific app redirection is enforced by protectedMessagingRedirectAppType in an App Protection Policy, this value defines the app package ids which are allowed to be used.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessagingRedirectAppPackageId() {
        return this.backingStore.get("messagingRedirectAppPackageId");
    }
    /**
     * Gets the messagingRedirectAppUrlScheme property value. When a specific app redirection is enforced by protectedMessagingRedirectAppType in an App Protection Policy, this value defines the app url redirect schemes which are allowed to be used.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessagingRedirectAppUrlScheme() {
        return this.backingStore.get("messagingRedirectAppUrlScheme");
    }
    /**
     * Gets the minimumRequiredCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or app access will be blocked
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredCompanyPortalVersion() {
        return this.backingStore.get("minimumRequiredCompanyPortalVersion");
    }
    /**
     * Gets the minimumRequiredPatchVersion property value. Define the oldest required Android security patch level a user can have to gain secure access to the app. (Android only)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredPatchVersion() {
        return this.backingStore.get("minimumRequiredPatchVersion");
    }
    /**
     * Gets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data. (iOS Only)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredSdkVersion() {
        return this.backingStore.get("minimumRequiredSdkVersion");
    }
    /**
     * Gets the minimumWarningCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or the user will receive a warning
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumWarningCompanyPortalVersion() {
        return this.backingStore.get("minimumWarningCompanyPortalVersion");
    }
    /**
     * Gets the minimumWarningPatchVersion property value. Define the oldest recommended Android security patch level a user can have for secure access to the app. (Android only)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumWarningPatchVersion() {
        return this.backingStore.get("minimumWarningPatchVersion");
    }
    /**
     * Gets the minimumWarningSdkVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data. (iOS only)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumWarningSdkVersion() {
        return this.backingStore.get("minimumWarningSdkVersion");
    }
    /**
     * Gets the minimumWipeCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or the company data on the app will be wiped
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumWipeCompanyPortalVersion() {
        return this.backingStore.get("minimumWipeCompanyPortalVersion");
    }
    /**
     * Gets the minimumWipePatchVersion property value. Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data. (Android only)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumWipePatchVersion() {
        return this.backingStore.get("minimumWipePatchVersion");
    }
    /**
     * Gets the minimumWipeSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumWipeSdkVersion() {
        return this.backingStore.get("minimumWipeSdkVersion");
    }
    /**
     * Gets the protectInboundDataFromUnknownSources property value. Protect incoming data from unknown source. This setting is only allowed to be True when AllowedInboundDataTransferSources is set to AllApps. (iOS Only)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProtectInboundDataFromUnknownSources() {
        return this.backingStore.get("protectInboundDataFromUnknownSources");
    }
    /**
     * Gets the requireClass3Biometrics property value. Require user to apply Class 3 Biometrics on their Android device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireClass3Biometrics() {
        return this.backingStore.get("requireClass3Biometrics");
    }
    /**
     * Gets the requiredAndroidSafetyNetAppsVerificationType property value. An admin enforced Android SafetyNet Device Attestation requirement on a managed app.
     * @return a AndroidManagedAppSafetyNetAppsVerificationType
     */
    @jakarta.annotation.Nullable
    public AndroidManagedAppSafetyNetAppsVerificationType getRequiredAndroidSafetyNetAppsVerificationType() {
        return this.backingStore.get("requiredAndroidSafetyNetAppsVerificationType");
    }
    /**
     * Gets the requiredAndroidSafetyNetDeviceAttestationType property value. An admin enforced Android SafetyNet Device Attestation requirement on a managed app.
     * @return a AndroidManagedAppSafetyNetDeviceAttestationType
     */
    @jakarta.annotation.Nullable
    public AndroidManagedAppSafetyNetDeviceAttestationType getRequiredAndroidSafetyNetDeviceAttestationType() {
        return this.backingStore.get("requiredAndroidSafetyNetDeviceAttestationType");
    }
    /**
     * Gets the requiredAndroidSafetyNetEvaluationType property value. An admin enforced Android SafetyNet evaluation type requirement on a managed app.
     * @return a AndroidManagedAppSafetyNetEvaluationType
     */
    @jakarta.annotation.Nullable
    public AndroidManagedAppSafetyNetEvaluationType getRequiredAndroidSafetyNetEvaluationType() {
        return this.backingStore.get("requiredAndroidSafetyNetEvaluationType");
    }
    /**
     * Gets the requirePinAfterBiometricChange property value. A PIN prompt will override biometric prompts if class 3 biometrics are updated on the device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequirePinAfterBiometricChange() {
        return this.backingStore.get("requirePinAfterBiometricChange");
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether screen capture is blocked. (Android only)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.backingStore.get("screenCaptureBlocked");
    }
    /**
     * Gets the thirdPartyKeyboardsBlocked property value. Defines if third party keyboards are allowed while accessing a managed app. (iOS Only)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getThirdPartyKeyboardsBlocked() {
        return this.backingStore.get("thirdPartyKeyboardsBlocked");
    }
    /**
     * Gets the warnAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or the user will receive the warning
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWarnAfterCompanyPortalUpdateDeferralInDays() {
        return this.backingStore.get("warnAfterCompanyPortalUpdateDeferralInDays");
    }
    /**
     * Gets the wipeAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or the company data on the app will be wiped
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWipeAfterCompanyPortalUpdateDeferralInDays() {
        return this.backingStore.get("wipeAfterCompanyPortalUpdateDeferralInDays");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("allowedAndroidDeviceManufacturers", this.getAllowedAndroidDeviceManufacturers());
        writer.writeCollectionOfPrimitiveValues("allowedAndroidDeviceModels", this.getAllowedAndroidDeviceModels());
        writer.writeStringValue("allowedIosDeviceModels", this.getAllowedIosDeviceModels());
        writer.writeEnumValue("appActionIfAccountIsClockedOut", this.getAppActionIfAccountIsClockedOut());
        writer.writeEnumValue("appActionIfAndroidDeviceManufacturerNotAllowed", this.getAppActionIfAndroidDeviceManufacturerNotAllowed());
        writer.writeEnumValue("appActionIfAndroidDeviceModelNotAllowed", this.getAppActionIfAndroidDeviceModelNotAllowed());
        writer.writeEnumValue("appActionIfAndroidSafetyNetAppsVerificationFailed", this.getAppActionIfAndroidSafetyNetAppsVerificationFailed());
        writer.writeEnumValue("appActionIfAndroidSafetyNetDeviceAttestationFailed", this.getAppActionIfAndroidSafetyNetDeviceAttestationFailed());
        writer.writeEnumValue("appActionIfDeviceLockNotSet", this.getAppActionIfDeviceLockNotSet());
        writer.writeEnumValue("appActionIfDevicePasscodeComplexityLessThanHigh", this.getAppActionIfDevicePasscodeComplexityLessThanHigh());
        writer.writeEnumValue("appActionIfDevicePasscodeComplexityLessThanLow", this.getAppActionIfDevicePasscodeComplexityLessThanLow());
        writer.writeEnumValue("appActionIfDevicePasscodeComplexityLessThanMedium", this.getAppActionIfDevicePasscodeComplexityLessThanMedium());
        writer.writeEnumValue("appActionIfIosDeviceModelNotAllowed", this.getAppActionIfIosDeviceModelNotAllowed());
        writer.writeEnumValue("appDataEncryptionType", this.getAppDataEncryptionType());
        writer.writeCollectionOfObjectValues("apps", this.getApps());
        writer.writeBooleanValue("biometricAuthenticationBlocked", this.getBiometricAuthenticationBlocked());
        writer.writeIntegerValue("blockAfterCompanyPortalUpdateDeferralInDays", this.getBlockAfterCompanyPortalUpdateDeferralInDays());
        writer.writeBooleanValue("connectToVpnOnLaunch", this.getConnectToVpnOnLaunch());
        writer.writeStringValue("customBrowserDisplayName", this.getCustomBrowserDisplayName());
        writer.writeStringValue("customBrowserPackageId", this.getCustomBrowserPackageId());
        writer.writeStringValue("customBrowserProtocol", this.getCustomBrowserProtocol());
        writer.writeStringValue("customDialerAppDisplayName", this.getCustomDialerAppDisplayName());
        writer.writeStringValue("customDialerAppPackageId", this.getCustomDialerAppPackageId());
        writer.writeStringValue("customDialerAppProtocol", this.getCustomDialerAppProtocol());
        writer.writeCollectionOfObjectValues("customSettings", this.getCustomSettings());
        writer.writeIntegerValue("deployedAppCount", this.getDeployedAppCount());
        writer.writeObjectValue("deploymentSummary", this.getDeploymentSummary());
        writer.writeBooleanValue("deviceLockRequired", this.getDeviceLockRequired());
        writer.writeBooleanValue("disableAppEncryptionIfDeviceEncryptionIsEnabled", this.getDisableAppEncryptionIfDeviceEncryptionIsEnabled());
        writer.writeBooleanValue("disableProtectionOfManagedOutboundOpenInData", this.getDisableProtectionOfManagedOutboundOpenInData());
        writer.writeBooleanValue("encryptAppData", this.getEncryptAppData());
        writer.writeCollectionOfObjectValues("exemptedAppPackages", this.getExemptedAppPackages());
        writer.writeCollectionOfObjectValues("exemptedAppProtocols", this.getExemptedAppProtocols());
        writer.writeBooleanValue("faceIdBlocked", this.getFaceIdBlocked());
        writer.writeBooleanValue("filterOpenInToOnlyManagedApps", this.getFilterOpenInToOnlyManagedApps());
        writer.writeBooleanValue("fingerprintAndBiometricEnabled", this.getFingerprintAndBiometricEnabled());
        writer.writeStringValue("messagingRedirectAppDisplayName", this.getMessagingRedirectAppDisplayName());
        writer.writeStringValue("messagingRedirectAppPackageId", this.getMessagingRedirectAppPackageId());
        writer.writeStringValue("messagingRedirectAppUrlScheme", this.getMessagingRedirectAppUrlScheme());
        writer.writeStringValue("minimumRequiredCompanyPortalVersion", this.getMinimumRequiredCompanyPortalVersion());
        writer.writeStringValue("minimumRequiredPatchVersion", this.getMinimumRequiredPatchVersion());
        writer.writeStringValue("minimumRequiredSdkVersion", this.getMinimumRequiredSdkVersion());
        writer.writeStringValue("minimumWarningCompanyPortalVersion", this.getMinimumWarningCompanyPortalVersion());
        writer.writeStringValue("minimumWarningPatchVersion", this.getMinimumWarningPatchVersion());
        writer.writeStringValue("minimumWarningSdkVersion", this.getMinimumWarningSdkVersion());
        writer.writeStringValue("minimumWipeCompanyPortalVersion", this.getMinimumWipeCompanyPortalVersion());
        writer.writeStringValue("minimumWipePatchVersion", this.getMinimumWipePatchVersion());
        writer.writeStringValue("minimumWipeSdkVersion", this.getMinimumWipeSdkVersion());
        writer.writeBooleanValue("protectInboundDataFromUnknownSources", this.getProtectInboundDataFromUnknownSources());
        writer.writeBooleanValue("requireClass3Biometrics", this.getRequireClass3Biometrics());
        writer.writeEnumValue("requiredAndroidSafetyNetAppsVerificationType", this.getRequiredAndroidSafetyNetAppsVerificationType());
        writer.writeEnumValue("requiredAndroidSafetyNetDeviceAttestationType", this.getRequiredAndroidSafetyNetDeviceAttestationType());
        writer.writeEnumValue("requiredAndroidSafetyNetEvaluationType", this.getRequiredAndroidSafetyNetEvaluationType());
        writer.writeBooleanValue("requirePinAfterBiometricChange", this.getRequirePinAfterBiometricChange());
        writer.writeBooleanValue("screenCaptureBlocked", this.getScreenCaptureBlocked());
        writer.writeBooleanValue("thirdPartyKeyboardsBlocked", this.getThirdPartyKeyboardsBlocked());
        writer.writeIntegerValue("warnAfterCompanyPortalUpdateDeferralInDays", this.getWarnAfterCompanyPortalUpdateDeferralInDays());
        writer.writeIntegerValue("wipeAfterCompanyPortalUpdateDeferralInDays", this.getWipeAfterCompanyPortalUpdateDeferralInDays());
    }
    /**
     * Sets the allowedAndroidDeviceManufacturers property value. Semicolon seperated list of device manufacturers allowed, as a string, for the managed app to work. (Android only)
     * @param value Value to set for the allowedAndroidDeviceManufacturers property.
     */
    public void setAllowedAndroidDeviceManufacturers(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("allowedAndroidDeviceManufacturers", value);
    }
    /**
     * Sets the allowedAndroidDeviceModels property value. List of device models allowed, as a string, for the managed app to work. (Android Only)
     * @param value Value to set for the allowedAndroidDeviceModels property.
     */
    public void setAllowedAndroidDeviceModels(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("allowedAndroidDeviceModels", value);
    }
    /**
     * Sets the allowedIosDeviceModels property value. Semicolon seperated list of device models allowed, as a string, for the managed app to work. (iOS Only)
     * @param value Value to set for the allowedIosDeviceModels property.
     */
    public void setAllowedIosDeviceModels(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("allowedIosDeviceModels", value);
    }
    /**
     * Sets the appActionIfAccountIsClockedOut property value. Defines a managed app behavior, either block or warn, if the user is clocked out (non-working time). Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfAccountIsClockedOut property.
     */
    public void setAppActionIfAccountIsClockedOut(@jakarta.annotation.Nullable final DefaultManagedAppProtectionAppActionIfAccountIsClockedOut value) {
        this.backingStore.set("appActionIfAccountIsClockedOut", value);
    }
    /**
     * Sets the appActionIfAndroidDeviceManufacturerNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfAndroidDeviceManufacturerNotAllowed property.
     */
    public void setAppActionIfAndroidDeviceManufacturerNotAllowed(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.backingStore.set("appActionIfAndroidDeviceManufacturerNotAllowed", value);
    }
    /**
     * Sets the appActionIfAndroidDeviceModelNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfAndroidDeviceModelNotAllowed property.
     */
    public void setAppActionIfAndroidDeviceModelNotAllowed(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.backingStore.set("appActionIfAndroidDeviceModelNotAllowed", value);
    }
    /**
     * Sets the appActionIfAndroidSafetyNetAppsVerificationFailed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfAndroidSafetyNetAppsVerificationFailed property.
     */
    public void setAppActionIfAndroidSafetyNetAppsVerificationFailed(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.backingStore.set("appActionIfAndroidSafetyNetAppsVerificationFailed", value);
    }
    /**
     * Sets the appActionIfAndroidSafetyNetDeviceAttestationFailed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfAndroidSafetyNetDeviceAttestationFailed property.
     */
    public void setAppActionIfAndroidSafetyNetDeviceAttestationFailed(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.backingStore.set("appActionIfAndroidSafetyNetDeviceAttestationFailed", value);
    }
    /**
     * Sets the appActionIfDeviceLockNotSet property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfDeviceLockNotSet property.
     */
    public void setAppActionIfDeviceLockNotSet(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.backingStore.set("appActionIfDeviceLockNotSet", value);
    }
    /**
     * Sets the appActionIfDevicePasscodeComplexityLessThanHigh property value. If the device does not have a passcode of high complexity or higher, trigger the stored action. Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanHigh property.
     */
    public void setAppActionIfDevicePasscodeComplexityLessThanHigh(@jakarta.annotation.Nullable final DefaultManagedAppProtectionAppActionIfDevicePasscodeComplexityLessThanHigh value) {
        this.backingStore.set("appActionIfDevicePasscodeComplexityLessThanHigh", value);
    }
    /**
     * Sets the appActionIfDevicePasscodeComplexityLessThanLow property value. If the device does not have a passcode of low complexity or higher, trigger the stored action. Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanLow property.
     */
    public void setAppActionIfDevicePasscodeComplexityLessThanLow(@jakarta.annotation.Nullable final DefaultManagedAppProtectionAppActionIfDevicePasscodeComplexityLessThanLow value) {
        this.backingStore.set("appActionIfDevicePasscodeComplexityLessThanLow", value);
    }
    /**
     * Sets the appActionIfDevicePasscodeComplexityLessThanMedium property value. If the device does not have a passcode of medium complexity or higher, trigger the stored action. Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanMedium property.
     */
    public void setAppActionIfDevicePasscodeComplexityLessThanMedium(@jakarta.annotation.Nullable final DefaultManagedAppProtectionAppActionIfDevicePasscodeComplexityLessThanMedium value) {
        this.backingStore.set("appActionIfDevicePasscodeComplexityLessThanMedium", value);
    }
    /**
     * Sets the appActionIfIosDeviceModelNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfIosDeviceModelNotAllowed property.
     */
    public void setAppActionIfIosDeviceModelNotAllowed(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.backingStore.set("appActionIfIosDeviceModelNotAllowed", value);
    }
    /**
     * Sets the appDataEncryptionType property value. Represents the level to which app data is encrypted for managed apps
     * @param value Value to set for the appDataEncryptionType property.
     */
    public void setAppDataEncryptionType(@jakarta.annotation.Nullable final ManagedAppDataEncryptionType value) {
        this.backingStore.set("appDataEncryptionType", value);
    }
    /**
     * Sets the apps property value. List of apps to which the policy is deployed.
     * @param value Value to set for the apps property.
     */
    public void setApps(@jakarta.annotation.Nullable final java.util.List<ManagedMobileApp> value) {
        this.backingStore.set("apps", value);
    }
    /**
     * Sets the biometricAuthenticationBlocked property value. Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True. (Android Only)
     * @param value Value to set for the biometricAuthenticationBlocked property.
     */
    public void setBiometricAuthenticationBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("biometricAuthenticationBlocked", value);
    }
    /**
     * Sets the blockAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or app access will be blocked.
     * @param value Value to set for the blockAfterCompanyPortalUpdateDeferralInDays property.
     */
    public void setBlockAfterCompanyPortalUpdateDeferralInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("blockAfterCompanyPortalUpdateDeferralInDays", value);
    }
    /**
     * Sets the connectToVpnOnLaunch property value. Whether the app should connect to the configured VPN on launch (Android only).
     * @param value Value to set for the connectToVpnOnLaunch property.
     */
    public void setConnectToVpnOnLaunch(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("connectToVpnOnLaunch", value);
    }
    /**
     * Sets the customBrowserDisplayName property value. Friendly name of the preferred custom browser to open weblink on Android. (Android only)
     * @param value Value to set for the customBrowserDisplayName property.
     */
    public void setCustomBrowserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customBrowserDisplayName", value);
    }
    /**
     * Sets the customBrowserPackageId property value. Unique identifier of a custom browser to open weblink on Android. (Android only)
     * @param value Value to set for the customBrowserPackageId property.
     */
    public void setCustomBrowserPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customBrowserPackageId", value);
    }
    /**
     * Sets the customBrowserProtocol property value. A custom browser protocol to open weblink on iOS. (iOS only)
     * @param value Value to set for the customBrowserProtocol property.
     */
    public void setCustomBrowserProtocol(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customBrowserProtocol", value);
    }
    /**
     * Sets the customDialerAppDisplayName property value. Friendly name of a custom dialer app to click-to-open a phone number on Android.
     * @param value Value to set for the customDialerAppDisplayName property.
     */
    public void setCustomDialerAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customDialerAppDisplayName", value);
    }
    /**
     * Sets the customDialerAppPackageId property value. PackageId of a custom dialer app to click-to-open a phone number on Android.
     * @param value Value to set for the customDialerAppPackageId property.
     */
    public void setCustomDialerAppPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customDialerAppPackageId", value);
    }
    /**
     * Sets the customDialerAppProtocol property value. Protocol of a custom dialer app to click-to-open a phone number on iOS, for example, skype:.
     * @param value Value to set for the customDialerAppProtocol property.
     */
    public void setCustomDialerAppProtocol(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customDialerAppProtocol", value);
    }
    /**
     * Sets the customSettings property value. A set of string key and string value pairs to be sent to the affected users, unalterned by this service
     * @param value Value to set for the customSettings property.
     */
    public void setCustomSettings(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("customSettings", value);
    }
    /**
     * Sets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @param value Value to set for the deployedAppCount property.
     */
    public void setDeployedAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deployedAppCount", value);
    }
    /**
     * Sets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @param value Value to set for the deploymentSummary property.
     */
    public void setDeploymentSummary(@jakarta.annotation.Nullable final ManagedAppPolicyDeploymentSummary value) {
        this.backingStore.set("deploymentSummary", value);
    }
    /**
     * Sets the deviceLockRequired property value. Defines if any kind of lock must be required on device. (android only)
     * @param value Value to set for the deviceLockRequired property.
     */
    public void setDeviceLockRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceLockRequired", value);
    }
    /**
     * Sets the disableAppEncryptionIfDeviceEncryptionIsEnabled property value. When this setting is enabled, app level encryption is disabled if device level encryption is enabled. (Android only)
     * @param value Value to set for the disableAppEncryptionIfDeviceEncryptionIsEnabled property.
     */
    public void setDisableAppEncryptionIfDeviceEncryptionIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableAppEncryptionIfDeviceEncryptionIsEnabled", value);
    }
    /**
     * Sets the disableProtectionOfManagedOutboundOpenInData property value. Disable protection of data transferred to other apps through IOS OpenIn option. This setting is only allowed to be True when AllowedOutboundDataTransferDestinations is set to ManagedApps. (iOS Only)
     * @param value Value to set for the disableProtectionOfManagedOutboundOpenInData property.
     */
    public void setDisableProtectionOfManagedOutboundOpenInData(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableProtectionOfManagedOutboundOpenInData", value);
    }
    /**
     * Sets the encryptAppData property value. Indicates whether managed-app data should be encrypted. (Android only)
     * @param value Value to set for the encryptAppData property.
     */
    public void setEncryptAppData(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("encryptAppData", value);
    }
    /**
     * Sets the exemptedAppPackages property value. Android App packages in this list will be exempt from the policy and will be able to receive data from managed apps. (Android only)
     * @param value Value to set for the exemptedAppPackages property.
     */
    public void setExemptedAppPackages(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("exemptedAppPackages", value);
    }
    /**
     * Sets the exemptedAppProtocols property value. iOS Apps in this list will be exempt from the policy and will be able to receive data from managed apps. (iOS Only)
     * @param value Value to set for the exemptedAppProtocols property.
     */
    public void setExemptedAppProtocols(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("exemptedAppProtocols", value);
    }
    /**
     * Sets the faceIdBlocked property value. Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. (iOS Only)
     * @param value Value to set for the faceIdBlocked property.
     */
    public void setFaceIdBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("faceIdBlocked", value);
    }
    /**
     * Sets the filterOpenInToOnlyManagedApps property value. Defines if open-in operation is supported from the managed app to the filesharing locations selected. This setting only applies when AllowedOutboundDataTransferDestinations is set to ManagedApps and DisableProtectionOfManagedOutboundOpenInData is set to False. (iOS Only)
     * @param value Value to set for the filterOpenInToOnlyManagedApps property.
     */
    public void setFilterOpenInToOnlyManagedApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("filterOpenInToOnlyManagedApps", value);
    }
    /**
     * Sets the fingerprintAndBiometricEnabled property value. Indicate to the client to enable both biometrics and fingerprints for the app.
     * @param value Value to set for the fingerprintAndBiometricEnabled property.
     */
    public void setFingerprintAndBiometricEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fingerprintAndBiometricEnabled", value);
    }
    /**
     * Sets the messagingRedirectAppDisplayName property value. When a specific app redirection is enforced by protectedMessagingRedirectAppType in an App Protection Policy, this value defines the app name which are allowed to be used.
     * @param value Value to set for the messagingRedirectAppDisplayName property.
     */
    public void setMessagingRedirectAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("messagingRedirectAppDisplayName", value);
    }
    /**
     * Sets the messagingRedirectAppPackageId property value. When a specific app redirection is enforced by protectedMessagingRedirectAppType in an App Protection Policy, this value defines the app package ids which are allowed to be used.
     * @param value Value to set for the messagingRedirectAppPackageId property.
     */
    public void setMessagingRedirectAppPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("messagingRedirectAppPackageId", value);
    }
    /**
     * Sets the messagingRedirectAppUrlScheme property value. When a specific app redirection is enforced by protectedMessagingRedirectAppType in an App Protection Policy, this value defines the app url redirect schemes which are allowed to be used.
     * @param value Value to set for the messagingRedirectAppUrlScheme property.
     */
    public void setMessagingRedirectAppUrlScheme(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("messagingRedirectAppUrlScheme", value);
    }
    /**
     * Sets the minimumRequiredCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or app access will be blocked
     * @param value Value to set for the minimumRequiredCompanyPortalVersion property.
     */
    public void setMinimumRequiredCompanyPortalVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumRequiredCompanyPortalVersion", value);
    }
    /**
     * Sets the minimumRequiredPatchVersion property value. Define the oldest required Android security patch level a user can have to gain secure access to the app. (Android only)
     * @param value Value to set for the minimumRequiredPatchVersion property.
     */
    public void setMinimumRequiredPatchVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumRequiredPatchVersion", value);
    }
    /**
     * Sets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data. (iOS Only)
     * @param value Value to set for the minimumRequiredSdkVersion property.
     */
    public void setMinimumRequiredSdkVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumRequiredSdkVersion", value);
    }
    /**
     * Sets the minimumWarningCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or the user will receive a warning
     * @param value Value to set for the minimumWarningCompanyPortalVersion property.
     */
    public void setMinimumWarningCompanyPortalVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWarningCompanyPortalVersion", value);
    }
    /**
     * Sets the minimumWarningPatchVersion property value. Define the oldest recommended Android security patch level a user can have for secure access to the app. (Android only)
     * @param value Value to set for the minimumWarningPatchVersion property.
     */
    public void setMinimumWarningPatchVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWarningPatchVersion", value);
    }
    /**
     * Sets the minimumWarningSdkVersion property value. Versions less than the specified version will result in warning message on the managed app from accessing company data. (iOS only)
     * @param value Value to set for the minimumWarningSdkVersion property.
     */
    public void setMinimumWarningSdkVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWarningSdkVersion", value);
    }
    /**
     * Sets the minimumWipeCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or the company data on the app will be wiped
     * @param value Value to set for the minimumWipeCompanyPortalVersion property.
     */
    public void setMinimumWipeCompanyPortalVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWipeCompanyPortalVersion", value);
    }
    /**
     * Sets the minimumWipePatchVersion property value. Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data. (Android only)
     * @param value Value to set for the minimumWipePatchVersion property.
     */
    public void setMinimumWipePatchVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWipePatchVersion", value);
    }
    /**
     * Sets the minimumWipeSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumWipeSdkVersion property.
     */
    public void setMinimumWipeSdkVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWipeSdkVersion", value);
    }
    /**
     * Sets the protectInboundDataFromUnknownSources property value. Protect incoming data from unknown source. This setting is only allowed to be True when AllowedInboundDataTransferSources is set to AllApps. (iOS Only)
     * @param value Value to set for the protectInboundDataFromUnknownSources property.
     */
    public void setProtectInboundDataFromUnknownSources(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("protectInboundDataFromUnknownSources", value);
    }
    /**
     * Sets the requireClass3Biometrics property value. Require user to apply Class 3 Biometrics on their Android device.
     * @param value Value to set for the requireClass3Biometrics property.
     */
    public void setRequireClass3Biometrics(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requireClass3Biometrics", value);
    }
    /**
     * Sets the requiredAndroidSafetyNetAppsVerificationType property value. An admin enforced Android SafetyNet Device Attestation requirement on a managed app.
     * @param value Value to set for the requiredAndroidSafetyNetAppsVerificationType property.
     */
    public void setRequiredAndroidSafetyNetAppsVerificationType(@jakarta.annotation.Nullable final AndroidManagedAppSafetyNetAppsVerificationType value) {
        this.backingStore.set("requiredAndroidSafetyNetAppsVerificationType", value);
    }
    /**
     * Sets the requiredAndroidSafetyNetDeviceAttestationType property value. An admin enforced Android SafetyNet Device Attestation requirement on a managed app.
     * @param value Value to set for the requiredAndroidSafetyNetDeviceAttestationType property.
     */
    public void setRequiredAndroidSafetyNetDeviceAttestationType(@jakarta.annotation.Nullable final AndroidManagedAppSafetyNetDeviceAttestationType value) {
        this.backingStore.set("requiredAndroidSafetyNetDeviceAttestationType", value);
    }
    /**
     * Sets the requiredAndroidSafetyNetEvaluationType property value. An admin enforced Android SafetyNet evaluation type requirement on a managed app.
     * @param value Value to set for the requiredAndroidSafetyNetEvaluationType property.
     */
    public void setRequiredAndroidSafetyNetEvaluationType(@jakarta.annotation.Nullable final AndroidManagedAppSafetyNetEvaluationType value) {
        this.backingStore.set("requiredAndroidSafetyNetEvaluationType", value);
    }
    /**
     * Sets the requirePinAfterBiometricChange property value. A PIN prompt will override biometric prompts if class 3 biometrics are updated on the device.
     * @param value Value to set for the requirePinAfterBiometricChange property.
     */
    public void setRequirePinAfterBiometricChange(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requirePinAfterBiometricChange", value);
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether screen capture is blocked. (Android only)
     * @param value Value to set for the screenCaptureBlocked property.
     */
    public void setScreenCaptureBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("screenCaptureBlocked", value);
    }
    /**
     * Sets the thirdPartyKeyboardsBlocked property value. Defines if third party keyboards are allowed while accessing a managed app. (iOS Only)
     * @param value Value to set for the thirdPartyKeyboardsBlocked property.
     */
    public void setThirdPartyKeyboardsBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("thirdPartyKeyboardsBlocked", value);
    }
    /**
     * Sets the warnAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or the user will receive the warning
     * @param value Value to set for the warnAfterCompanyPortalUpdateDeferralInDays property.
     */
    public void setWarnAfterCompanyPortalUpdateDeferralInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("warnAfterCompanyPortalUpdateDeferralInDays", value);
    }
    /**
     * Sets the wipeAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or the company data on the app will be wiped
     * @param value Value to set for the wipeAfterCompanyPortalUpdateDeferralInDays property.
     */
    public void setWipeAfterCompanyPortalUpdateDeferralInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("wipeAfterCompanyPortalUpdateDeferralInDays", value);
    }
}
