package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Policy used to configure detailed management settings targeted to specific security groups and for a specified set of apps on an Android device
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidManagedAppProtection extends TargetedManagedAppProtection implements Parsable {
    /**
     * Instantiates a new AndroidManagedAppProtection and sets the default values.
     */
    public AndroidManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.androidManagedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidManagedAppProtection
     */
    @jakarta.annotation.Nonnull
    public static AndroidManagedAppProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedAppProtection();
    }
    /**
     * Gets the allowedAndroidDeviceManufacturers property value. Semicolon seperated list of device manufacturers allowed, as a string, for the managed app to work.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAllowedAndroidDeviceManufacturers() {
        return this.backingStore.get("allowedAndroidDeviceManufacturers");
    }
    /**
     * Gets the allowedAndroidDeviceModels property value. List of device models allowed, as a string, for the managed app to work.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedAndroidDeviceModels() {
        return this.backingStore.get("allowedAndroidDeviceModels");
    }
    /**
     * Gets the appActionIfAccountIsClockedOut property value. Defines a managed app behavior, either block or warn, if the user is clocked out (non-working time).
     * @return a ManagedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfAccountIsClockedOut() {
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
     * Gets the appActionIfDevicePasscodeComplexityLessThanHigh property value. If the device does not have a passcode of high complexity or higher, trigger the stored action.
     * @return a ManagedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfDevicePasscodeComplexityLessThanHigh() {
        return this.backingStore.get("appActionIfDevicePasscodeComplexityLessThanHigh");
    }
    /**
     * Gets the appActionIfDevicePasscodeComplexityLessThanLow property value. If the device does not have a passcode of low complexity or higher, trigger the stored action.
     * @return a ManagedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfDevicePasscodeComplexityLessThanLow() {
        return this.backingStore.get("appActionIfDevicePasscodeComplexityLessThanLow");
    }
    /**
     * Gets the appActionIfDevicePasscodeComplexityLessThanMedium property value. If the device does not have a passcode of medium complexity or higher, trigger the stored action.
     * @return a ManagedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfDevicePasscodeComplexityLessThanMedium() {
        return this.backingStore.get("appActionIfDevicePasscodeComplexityLessThanMedium");
    }
    /**
     * Gets the appActionIfSamsungKnoxAttestationRequired property value. Defines the behavior of a managed app when Samsung Knox Attestation is required. Possible values are null, warn, block & wipe. If the admin does not set this action, the default is null, which indicates this setting is not configured.
     * @return a ManagedAppRemediationAction
     */
    @jakarta.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfSamsungKnoxAttestationRequired() {
        return this.backingStore.get("appActionIfSamsungKnoxAttestationRequired");
    }
    /**
     * Gets the approvedKeyboards property value. If Keyboard Restriction is enabled, only keyboards in this approved list will be allowed. A key should be Android package id for a keyboard and value should be a friendly name
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getApprovedKeyboards() {
        return this.backingStore.get("approvedKeyboards");
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
     * Gets the biometricAuthenticationBlocked property value. Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True.
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
     * Gets the connectToVpnOnLaunch property value. Whether the app should connect to the configured VPN on launch.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConnectToVpnOnLaunch() {
        return this.backingStore.get("connectToVpnOnLaunch");
    }
    /**
     * Gets the customBrowserDisplayName property value. Friendly name of the preferred custom browser to open weblink on Android.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomBrowserDisplayName() {
        return this.backingStore.get("customBrowserDisplayName");
    }
    /**
     * Gets the customBrowserPackageId property value. Unique identifier of a custom browser to open weblink on Android.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomBrowserPackageId() {
        return this.backingStore.get("customBrowserPackageId");
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
     * Gets the deviceLockRequired property value. Defines if any kind of lock must be required on android device
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceLockRequired() {
        return this.backingStore.get("deviceLockRequired");
    }
    /**
     * Gets the disableAppEncryptionIfDeviceEncryptionIsEnabled property value. When this setting is enabled, app level encryption is disabled if device level encryption is enabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableAppEncryptionIfDeviceEncryptionIsEnabled() {
        return this.backingStore.get("disableAppEncryptionIfDeviceEncryptionIsEnabled");
    }
    /**
     * Gets the encryptAppData property value. Indicates whether application data for managed apps should be encrypted
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEncryptAppData() {
        return this.backingStore.get("encryptAppData");
    }
    /**
     * Gets the exemptedAppPackages property value. App packages in this list will be exempt from the policy and will be able to receive data from managed apps.
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getExemptedAppPackages() {
        return this.backingStore.get("exemptedAppPackages");
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
        deserializerMap.put("appActionIfAccountIsClockedOut", (n) -> { this.setAppActionIfAccountIsClockedOut(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appActionIfAndroidDeviceManufacturerNotAllowed", (n) -> { this.setAppActionIfAndroidDeviceManufacturerNotAllowed(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appActionIfAndroidDeviceModelNotAllowed", (n) -> { this.setAppActionIfAndroidDeviceModelNotAllowed(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appActionIfAndroidSafetyNetAppsVerificationFailed", (n) -> { this.setAppActionIfAndroidSafetyNetAppsVerificationFailed(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appActionIfAndroidSafetyNetDeviceAttestationFailed", (n) -> { this.setAppActionIfAndroidSafetyNetDeviceAttestationFailed(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appActionIfDeviceLockNotSet", (n) -> { this.setAppActionIfDeviceLockNotSet(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appActionIfDevicePasscodeComplexityLessThanHigh", (n) -> { this.setAppActionIfDevicePasscodeComplexityLessThanHigh(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appActionIfDevicePasscodeComplexityLessThanLow", (n) -> { this.setAppActionIfDevicePasscodeComplexityLessThanLow(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appActionIfDevicePasscodeComplexityLessThanMedium", (n) -> { this.setAppActionIfDevicePasscodeComplexityLessThanMedium(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("appActionIfSamsungKnoxAttestationRequired", (n) -> { this.setAppActionIfSamsungKnoxAttestationRequired(n.getEnumValue(ManagedAppRemediationAction::forValue)); });
        deserializerMap.put("approvedKeyboards", (n) -> { this.setApprovedKeyboards(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("apps", (n) -> { this.setApps(n.getCollectionOfObjectValues(ManagedMobileApp::createFromDiscriminatorValue)); });
        deserializerMap.put("biometricAuthenticationBlocked", (n) -> { this.setBiometricAuthenticationBlocked(n.getBooleanValue()); });
        deserializerMap.put("blockAfterCompanyPortalUpdateDeferralInDays", (n) -> { this.setBlockAfterCompanyPortalUpdateDeferralInDays(n.getIntegerValue()); });
        deserializerMap.put("connectToVpnOnLaunch", (n) -> { this.setConnectToVpnOnLaunch(n.getBooleanValue()); });
        deserializerMap.put("customBrowserDisplayName", (n) -> { this.setCustomBrowserDisplayName(n.getStringValue()); });
        deserializerMap.put("customBrowserPackageId", (n) -> { this.setCustomBrowserPackageId(n.getStringValue()); });
        deserializerMap.put("customDialerAppDisplayName", (n) -> { this.setCustomDialerAppDisplayName(n.getStringValue()); });
        deserializerMap.put("customDialerAppPackageId", (n) -> { this.setCustomDialerAppPackageId(n.getStringValue()); });
        deserializerMap.put("deployedAppCount", (n) -> { this.setDeployedAppCount(n.getIntegerValue()); });
        deserializerMap.put("deploymentSummary", (n) -> { this.setDeploymentSummary(n.getObjectValue(ManagedAppPolicyDeploymentSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceLockRequired", (n) -> { this.setDeviceLockRequired(n.getBooleanValue()); });
        deserializerMap.put("disableAppEncryptionIfDeviceEncryptionIsEnabled", (n) -> { this.setDisableAppEncryptionIfDeviceEncryptionIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("encryptAppData", (n) -> { this.setEncryptAppData(n.getBooleanValue()); });
        deserializerMap.put("exemptedAppPackages", (n) -> { this.setExemptedAppPackages(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("fingerprintAndBiometricEnabled", (n) -> { this.setFingerprintAndBiometricEnabled(n.getBooleanValue()); });
        deserializerMap.put("keyboardsRestricted", (n) -> { this.setKeyboardsRestricted(n.getBooleanValue()); });
        deserializerMap.put("messagingRedirectAppDisplayName", (n) -> { this.setMessagingRedirectAppDisplayName(n.getStringValue()); });
        deserializerMap.put("messagingRedirectAppPackageId", (n) -> { this.setMessagingRedirectAppPackageId(n.getStringValue()); });
        deserializerMap.put("minimumRequiredCompanyPortalVersion", (n) -> { this.setMinimumRequiredCompanyPortalVersion(n.getStringValue()); });
        deserializerMap.put("minimumRequiredPatchVersion", (n) -> { this.setMinimumRequiredPatchVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningCompanyPortalVersion", (n) -> { this.setMinimumWarningCompanyPortalVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningPatchVersion", (n) -> { this.setMinimumWarningPatchVersion(n.getStringValue()); });
        deserializerMap.put("minimumWipeCompanyPortalVersion", (n) -> { this.setMinimumWipeCompanyPortalVersion(n.getStringValue()); });
        deserializerMap.put("minimumWipePatchVersion", (n) -> { this.setMinimumWipePatchVersion(n.getStringValue()); });
        deserializerMap.put("requireClass3Biometrics", (n) -> { this.setRequireClass3Biometrics(n.getBooleanValue()); });
        deserializerMap.put("requiredAndroidSafetyNetAppsVerificationType", (n) -> { this.setRequiredAndroidSafetyNetAppsVerificationType(n.getEnumValue(AndroidManagedAppSafetyNetAppsVerificationType::forValue)); });
        deserializerMap.put("requiredAndroidSafetyNetDeviceAttestationType", (n) -> { this.setRequiredAndroidSafetyNetDeviceAttestationType(n.getEnumValue(AndroidManagedAppSafetyNetDeviceAttestationType::forValue)); });
        deserializerMap.put("requiredAndroidSafetyNetEvaluationType", (n) -> { this.setRequiredAndroidSafetyNetEvaluationType(n.getEnumValue(AndroidManagedAppSafetyNetEvaluationType::forValue)); });
        deserializerMap.put("requirePinAfterBiometricChange", (n) -> { this.setRequirePinAfterBiometricChange(n.getBooleanValue()); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { this.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("warnAfterCompanyPortalUpdateDeferralInDays", (n) -> { this.setWarnAfterCompanyPortalUpdateDeferralInDays(n.getIntegerValue()); });
        deserializerMap.put("wipeAfterCompanyPortalUpdateDeferralInDays", (n) -> { this.setWipeAfterCompanyPortalUpdateDeferralInDays(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fingerprintAndBiometricEnabled property value. If null, this setting will be ignored. If false both fingerprints and biometrics will not be enabled. If true, both fingerprints and biometrics will be enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFingerprintAndBiometricEnabled() {
        return this.backingStore.get("fingerprintAndBiometricEnabled");
    }
    /**
     * Gets the keyboardsRestricted property value. Indicates if keyboard restriction is enabled. If enabled list of approved keyboards must be provided as well.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeyboardsRestricted() {
        return this.backingStore.get("keyboardsRestricted");
    }
    /**
     * Gets the messagingRedirectAppDisplayName property value. When a specific app redirection is enforced by protectedMessagingRedirectAppType in an App Protection Policy, this value defines the app name which is allowed to be used.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessagingRedirectAppDisplayName() {
        return this.backingStore.get("messagingRedirectAppDisplayName");
    }
    /**
     * Gets the messagingRedirectAppPackageId property value. When a specific app redirection is enforced by protectedMessagingRedirectAppType in an App Protection Policy, this value defines the app package id which is allowed to be used.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessagingRedirectAppPackageId() {
        return this.backingStore.get("messagingRedirectAppPackageId");
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
     * Gets the minimumRequiredPatchVersion property value. Define the oldest required Android security patch level a user can have to gain secure access to the app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumRequiredPatchVersion() {
        return this.backingStore.get("minimumRequiredPatchVersion");
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
     * Gets the minimumWarningPatchVersion property value. Define the oldest recommended Android security patch level a user can have for secure access to the app.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumWarningPatchVersion() {
        return this.backingStore.get("minimumWarningPatchVersion");
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
     * Gets the minimumWipePatchVersion property value. Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinimumWipePatchVersion() {
        return this.backingStore.get("minimumWipePatchVersion");
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
     * Gets the screenCaptureBlocked property value. Indicates whether a managed user can take screen captures of managed apps
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this.backingStore.get("screenCaptureBlocked");
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
        writer.writeEnumValue("appActionIfAccountIsClockedOut", this.getAppActionIfAccountIsClockedOut());
        writer.writeEnumValue("appActionIfAndroidDeviceManufacturerNotAllowed", this.getAppActionIfAndroidDeviceManufacturerNotAllowed());
        writer.writeEnumValue("appActionIfAndroidDeviceModelNotAllowed", this.getAppActionIfAndroidDeviceModelNotAllowed());
        writer.writeEnumValue("appActionIfAndroidSafetyNetAppsVerificationFailed", this.getAppActionIfAndroidSafetyNetAppsVerificationFailed());
        writer.writeEnumValue("appActionIfAndroidSafetyNetDeviceAttestationFailed", this.getAppActionIfAndroidSafetyNetDeviceAttestationFailed());
        writer.writeEnumValue("appActionIfDeviceLockNotSet", this.getAppActionIfDeviceLockNotSet());
        writer.writeEnumValue("appActionIfDevicePasscodeComplexityLessThanHigh", this.getAppActionIfDevicePasscodeComplexityLessThanHigh());
        writer.writeEnumValue("appActionIfDevicePasscodeComplexityLessThanLow", this.getAppActionIfDevicePasscodeComplexityLessThanLow());
        writer.writeEnumValue("appActionIfDevicePasscodeComplexityLessThanMedium", this.getAppActionIfDevicePasscodeComplexityLessThanMedium());
        writer.writeEnumValue("appActionIfSamsungKnoxAttestationRequired", this.getAppActionIfSamsungKnoxAttestationRequired());
        writer.writeCollectionOfObjectValues("approvedKeyboards", this.getApprovedKeyboards());
        writer.writeCollectionOfObjectValues("apps", this.getApps());
        writer.writeBooleanValue("biometricAuthenticationBlocked", this.getBiometricAuthenticationBlocked());
        writer.writeIntegerValue("blockAfterCompanyPortalUpdateDeferralInDays", this.getBlockAfterCompanyPortalUpdateDeferralInDays());
        writer.writeBooleanValue("connectToVpnOnLaunch", this.getConnectToVpnOnLaunch());
        writer.writeStringValue("customBrowserDisplayName", this.getCustomBrowserDisplayName());
        writer.writeStringValue("customBrowserPackageId", this.getCustomBrowserPackageId());
        writer.writeStringValue("customDialerAppDisplayName", this.getCustomDialerAppDisplayName());
        writer.writeStringValue("customDialerAppPackageId", this.getCustomDialerAppPackageId());
        writer.writeIntegerValue("deployedAppCount", this.getDeployedAppCount());
        writer.writeObjectValue("deploymentSummary", this.getDeploymentSummary());
        writer.writeBooleanValue("deviceLockRequired", this.getDeviceLockRequired());
        writer.writeBooleanValue("disableAppEncryptionIfDeviceEncryptionIsEnabled", this.getDisableAppEncryptionIfDeviceEncryptionIsEnabled());
        writer.writeBooleanValue("encryptAppData", this.getEncryptAppData());
        writer.writeCollectionOfObjectValues("exemptedAppPackages", this.getExemptedAppPackages());
        writer.writeBooleanValue("fingerprintAndBiometricEnabled", this.getFingerprintAndBiometricEnabled());
        writer.writeBooleanValue("keyboardsRestricted", this.getKeyboardsRestricted());
        writer.writeStringValue("messagingRedirectAppDisplayName", this.getMessagingRedirectAppDisplayName());
        writer.writeStringValue("messagingRedirectAppPackageId", this.getMessagingRedirectAppPackageId());
        writer.writeStringValue("minimumRequiredCompanyPortalVersion", this.getMinimumRequiredCompanyPortalVersion());
        writer.writeStringValue("minimumRequiredPatchVersion", this.getMinimumRequiredPatchVersion());
        writer.writeStringValue("minimumWarningCompanyPortalVersion", this.getMinimumWarningCompanyPortalVersion());
        writer.writeStringValue("minimumWarningPatchVersion", this.getMinimumWarningPatchVersion());
        writer.writeStringValue("minimumWipeCompanyPortalVersion", this.getMinimumWipeCompanyPortalVersion());
        writer.writeStringValue("minimumWipePatchVersion", this.getMinimumWipePatchVersion());
        writer.writeBooleanValue("requireClass3Biometrics", this.getRequireClass3Biometrics());
        writer.writeEnumValue("requiredAndroidSafetyNetAppsVerificationType", this.getRequiredAndroidSafetyNetAppsVerificationType());
        writer.writeEnumValue("requiredAndroidSafetyNetDeviceAttestationType", this.getRequiredAndroidSafetyNetDeviceAttestationType());
        writer.writeEnumValue("requiredAndroidSafetyNetEvaluationType", this.getRequiredAndroidSafetyNetEvaluationType());
        writer.writeBooleanValue("requirePinAfterBiometricChange", this.getRequirePinAfterBiometricChange());
        writer.writeBooleanValue("screenCaptureBlocked", this.getScreenCaptureBlocked());
        writer.writeIntegerValue("warnAfterCompanyPortalUpdateDeferralInDays", this.getWarnAfterCompanyPortalUpdateDeferralInDays());
        writer.writeIntegerValue("wipeAfterCompanyPortalUpdateDeferralInDays", this.getWipeAfterCompanyPortalUpdateDeferralInDays());
    }
    /**
     * Sets the allowedAndroidDeviceManufacturers property value. Semicolon seperated list of device manufacturers allowed, as a string, for the managed app to work.
     * @param value Value to set for the allowedAndroidDeviceManufacturers property.
     */
    public void setAllowedAndroidDeviceManufacturers(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("allowedAndroidDeviceManufacturers", value);
    }
    /**
     * Sets the allowedAndroidDeviceModels property value. List of device models allowed, as a string, for the managed app to work.
     * @param value Value to set for the allowedAndroidDeviceModels property.
     */
    public void setAllowedAndroidDeviceModels(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("allowedAndroidDeviceModels", value);
    }
    /**
     * Sets the appActionIfAccountIsClockedOut property value. Defines a managed app behavior, either block or warn, if the user is clocked out (non-working time).
     * @param value Value to set for the appActionIfAccountIsClockedOut property.
     */
    public void setAppActionIfAccountIsClockedOut(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
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
     * Sets the appActionIfDevicePasscodeComplexityLessThanHigh property value. If the device does not have a passcode of high complexity or higher, trigger the stored action.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanHigh property.
     */
    public void setAppActionIfDevicePasscodeComplexityLessThanHigh(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.backingStore.set("appActionIfDevicePasscodeComplexityLessThanHigh", value);
    }
    /**
     * Sets the appActionIfDevicePasscodeComplexityLessThanLow property value. If the device does not have a passcode of low complexity or higher, trigger the stored action.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanLow property.
     */
    public void setAppActionIfDevicePasscodeComplexityLessThanLow(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.backingStore.set("appActionIfDevicePasscodeComplexityLessThanLow", value);
    }
    /**
     * Sets the appActionIfDevicePasscodeComplexityLessThanMedium property value. If the device does not have a passcode of medium complexity or higher, trigger the stored action.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanMedium property.
     */
    public void setAppActionIfDevicePasscodeComplexityLessThanMedium(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.backingStore.set("appActionIfDevicePasscodeComplexityLessThanMedium", value);
    }
    /**
     * Sets the appActionIfSamsungKnoxAttestationRequired property value. Defines the behavior of a managed app when Samsung Knox Attestation is required. Possible values are null, warn, block & wipe. If the admin does not set this action, the default is null, which indicates this setting is not configured.
     * @param value Value to set for the appActionIfSamsungKnoxAttestationRequired property.
     */
    public void setAppActionIfSamsungKnoxAttestationRequired(@jakarta.annotation.Nullable final ManagedAppRemediationAction value) {
        this.backingStore.set("appActionIfSamsungKnoxAttestationRequired", value);
    }
    /**
     * Sets the approvedKeyboards property value. If Keyboard Restriction is enabled, only keyboards in this approved list will be allowed. A key should be Android package id for a keyboard and value should be a friendly name
     * @param value Value to set for the approvedKeyboards property.
     */
    public void setApprovedKeyboards(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("approvedKeyboards", value);
    }
    /**
     * Sets the apps property value. List of apps to which the policy is deployed.
     * @param value Value to set for the apps property.
     */
    public void setApps(@jakarta.annotation.Nullable final java.util.List<ManagedMobileApp> value) {
        this.backingStore.set("apps", value);
    }
    /**
     * Sets the biometricAuthenticationBlocked property value. Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True.
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
     * Sets the connectToVpnOnLaunch property value. Whether the app should connect to the configured VPN on launch.
     * @param value Value to set for the connectToVpnOnLaunch property.
     */
    public void setConnectToVpnOnLaunch(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("connectToVpnOnLaunch", value);
    }
    /**
     * Sets the customBrowserDisplayName property value. Friendly name of the preferred custom browser to open weblink on Android.
     * @param value Value to set for the customBrowserDisplayName property.
     */
    public void setCustomBrowserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customBrowserDisplayName", value);
    }
    /**
     * Sets the customBrowserPackageId property value. Unique identifier of a custom browser to open weblink on Android.
     * @param value Value to set for the customBrowserPackageId property.
     */
    public void setCustomBrowserPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customBrowserPackageId", value);
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
     * Sets the deviceLockRequired property value. Defines if any kind of lock must be required on android device
     * @param value Value to set for the deviceLockRequired property.
     */
    public void setDeviceLockRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceLockRequired", value);
    }
    /**
     * Sets the disableAppEncryptionIfDeviceEncryptionIsEnabled property value. When this setting is enabled, app level encryption is disabled if device level encryption is enabled
     * @param value Value to set for the disableAppEncryptionIfDeviceEncryptionIsEnabled property.
     */
    public void setDisableAppEncryptionIfDeviceEncryptionIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableAppEncryptionIfDeviceEncryptionIsEnabled", value);
    }
    /**
     * Sets the encryptAppData property value. Indicates whether application data for managed apps should be encrypted
     * @param value Value to set for the encryptAppData property.
     */
    public void setEncryptAppData(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("encryptAppData", value);
    }
    /**
     * Sets the exemptedAppPackages property value. App packages in this list will be exempt from the policy and will be able to receive data from managed apps.
     * @param value Value to set for the exemptedAppPackages property.
     */
    public void setExemptedAppPackages(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("exemptedAppPackages", value);
    }
    /**
     * Sets the fingerprintAndBiometricEnabled property value. If null, this setting will be ignored. If false both fingerprints and biometrics will not be enabled. If true, both fingerprints and biometrics will be enabled.
     * @param value Value to set for the fingerprintAndBiometricEnabled property.
     */
    public void setFingerprintAndBiometricEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fingerprintAndBiometricEnabled", value);
    }
    /**
     * Sets the keyboardsRestricted property value. Indicates if keyboard restriction is enabled. If enabled list of approved keyboards must be provided as well.
     * @param value Value to set for the keyboardsRestricted property.
     */
    public void setKeyboardsRestricted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("keyboardsRestricted", value);
    }
    /**
     * Sets the messagingRedirectAppDisplayName property value. When a specific app redirection is enforced by protectedMessagingRedirectAppType in an App Protection Policy, this value defines the app name which is allowed to be used.
     * @param value Value to set for the messagingRedirectAppDisplayName property.
     */
    public void setMessagingRedirectAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("messagingRedirectAppDisplayName", value);
    }
    /**
     * Sets the messagingRedirectAppPackageId property value. When a specific app redirection is enforced by protectedMessagingRedirectAppType in an App Protection Policy, this value defines the app package id which is allowed to be used.
     * @param value Value to set for the messagingRedirectAppPackageId property.
     */
    public void setMessagingRedirectAppPackageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("messagingRedirectAppPackageId", value);
    }
    /**
     * Sets the minimumRequiredCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or app access will be blocked
     * @param value Value to set for the minimumRequiredCompanyPortalVersion property.
     */
    public void setMinimumRequiredCompanyPortalVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumRequiredCompanyPortalVersion", value);
    }
    /**
     * Sets the minimumRequiredPatchVersion property value. Define the oldest required Android security patch level a user can have to gain secure access to the app.
     * @param value Value to set for the minimumRequiredPatchVersion property.
     */
    public void setMinimumRequiredPatchVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumRequiredPatchVersion", value);
    }
    /**
     * Sets the minimumWarningCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or the user will receive a warning
     * @param value Value to set for the minimumWarningCompanyPortalVersion property.
     */
    public void setMinimumWarningCompanyPortalVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWarningCompanyPortalVersion", value);
    }
    /**
     * Sets the minimumWarningPatchVersion property value. Define the oldest recommended Android security patch level a user can have for secure access to the app.
     * @param value Value to set for the minimumWarningPatchVersion property.
     */
    public void setMinimumWarningPatchVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWarningPatchVersion", value);
    }
    /**
     * Sets the minimumWipeCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or the company data on the app will be wiped
     * @param value Value to set for the minimumWipeCompanyPortalVersion property.
     */
    public void setMinimumWipeCompanyPortalVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWipeCompanyPortalVersion", value);
    }
    /**
     * Sets the minimumWipePatchVersion property value. Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data.
     * @param value Value to set for the minimumWipePatchVersion property.
     */
    public void setMinimumWipePatchVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minimumWipePatchVersion", value);
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
     * Sets the screenCaptureBlocked property value. Indicates whether a managed user can take screen captures of managed apps
     * @param value Value to set for the screenCaptureBlocked property.
     */
    public void setScreenCaptureBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("screenCaptureBlocked", value);
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
