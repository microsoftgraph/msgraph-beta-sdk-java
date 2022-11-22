package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidManagedAppProtection extends TargetedManagedAppProtection implements Parsable {
    /** Semicolon seperated list of device manufacturers allowed, as a string, for the managed app to work. */
    private String _allowedAndroidDeviceManufacturers;
    /** List of device models allowed, as a string, for the managed app to work. */
    private java.util.List<String> _allowedAndroidDeviceModels;
    /** An admin initiated action to be applied on a managed app. */
    private ManagedAppRemediationAction _appActionIfAndroidDeviceManufacturerNotAllowed;
    /** An admin initiated action to be applied on a managed app. */
    private ManagedAppRemediationAction _appActionIfAndroidDeviceModelNotAllowed;
    /** An admin initiated action to be applied on a managed app. */
    private ManagedAppRemediationAction _appActionIfAndroidSafetyNetAppsVerificationFailed;
    /** An admin initiated action to be applied on a managed app. */
    private ManagedAppRemediationAction _appActionIfAndroidSafetyNetDeviceAttestationFailed;
    /** An admin initiated action to be applied on a managed app. */
    private ManagedAppRemediationAction _appActionIfDeviceLockNotSet;
    /** If the device does not have a passcode of high complexity or higher, trigger the stored action. */
    private ManagedAppRemediationAction _appActionIfDevicePasscodeComplexityLessThanHigh;
    /** If the device does not have a passcode of low complexity or higher, trigger the stored action. */
    private ManagedAppRemediationAction _appActionIfDevicePasscodeComplexityLessThanLow;
    /** If the device does not have a passcode of medium complexity or higher, trigger the stored action. */
    private ManagedAppRemediationAction _appActionIfDevicePasscodeComplexityLessThanMedium;
    /** If Keyboard Restriction is enabled, only keyboards in this approved list will be allowed. A key should be Android package id for a keyboard and value should be a friendly name */
    private java.util.List<KeyValuePair> _approvedKeyboards;
    /** List of apps to which the policy is deployed. */
    private java.util.List<ManagedMobileApp> _apps;
    /** Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True. */
    private Boolean _biometricAuthenticationBlocked;
    /** Maximum number of days Company Portal update can be deferred on the device or app access will be blocked. */
    private Integer _blockAfterCompanyPortalUpdateDeferralInDays;
    /** Whether the app should connect to the configured VPN on launch. */
    private Boolean _connectToVpnOnLaunch;
    /** Friendly name of the preferred custom browser to open weblink on Android. */
    private String _customBrowserDisplayName;
    /** Unique identifier of a custom browser to open weblink on Android. */
    private String _customBrowserPackageId;
    /** Friendly name of a custom dialer app to click-to-open a phone number on Android. */
    private String _customDialerAppDisplayName;
    /** PackageId of a custom dialer app to click-to-open a phone number on Android. */
    private String _customDialerAppPackageId;
    /** Count of apps to which the current policy is deployed. */
    private Integer _deployedAppCount;
    /** Navigation property to deployment summary of the configuration. */
    private ManagedAppPolicyDeploymentSummary _deploymentSummary;
    /** Defines if any kind of lock must be required on android device */
    private Boolean _deviceLockRequired;
    /** When this setting is enabled, app level encryption is disabled if device level encryption is enabled */
    private Boolean _disableAppEncryptionIfDeviceEncryptionIsEnabled;
    /** Indicates whether application data for managed apps should be encrypted */
    private Boolean _encryptAppData;
    /** App packages in this list will be exempt from the policy and will be able to receive data from managed apps. */
    private java.util.List<KeyValuePair> _exemptedAppPackages;
    /** If null, this setting will be ignored. If false both fingerprints and biometrics will not be enabled. If true, both fingerprints and biometrics will be enabled. */
    private Boolean _fingerprintAndBiometricEnabled;
    /** Indicates if keyboard restriction is enabled. If enabled list of approved keyboards must be provided as well. */
    private Boolean _keyboardsRestricted;
    /** Minimum version of the Company portal that must be installed on the device or app access will be blocked */
    private String _minimumRequiredCompanyPortalVersion;
    /** Define the oldest required Android security patch level a user can have to gain secure access to the app. */
    private String _minimumRequiredPatchVersion;
    /** Minimum version of the Company portal that must be installed on the device or the user will receive a warning */
    private String _minimumWarningCompanyPortalVersion;
    /** Define the oldest recommended Android security patch level a user can have for secure access to the app. */
    private String _minimumWarningPatchVersion;
    /** Minimum version of the Company portal that must be installed on the device or the company data on the app will be wiped */
    private String _minimumWipeCompanyPortalVersion;
    /** Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data. */
    private String _minimumWipePatchVersion;
    /** Require user to apply Class 3 Biometrics on their Android device. */
    private Boolean _requireClass3Biometrics;
    /** An admin enforced Android SafetyNet Device Attestation requirement on a managed app. */
    private AndroidManagedAppSafetyNetAppsVerificationType _requiredAndroidSafetyNetAppsVerificationType;
    /** An admin enforced Android SafetyNet Device Attestation requirement on a managed app. */
    private AndroidManagedAppSafetyNetDeviceAttestationType _requiredAndroidSafetyNetDeviceAttestationType;
    /** An admin enforced Android SafetyNet evaluation type requirement on a managed app. */
    private AndroidManagedAppSafetyNetEvaluationType _requiredAndroidSafetyNetEvaluationType;
    /** A PIN prompt will override biometric prompts if class 3 biometrics are updated on the device. */
    private Boolean _requirePinAfterBiometricChange;
    /** Indicates whether a managed user can take screen captures of managed apps */
    private Boolean _screenCaptureBlocked;
    /** Maximum number of days Company Portal update can be deferred on the device or the user will receive the warning */
    private Integer _warnAfterCompanyPortalUpdateDeferralInDays;
    /** Maximum number of days Company Portal update can be deferred on the device or the company data on the app will be wiped */
    private Integer _wipeAfterCompanyPortalUpdateDeferralInDays;
    /**
     * Instantiates a new AndroidManagedAppProtection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.androidManagedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidManagedAppProtection
     */
    @javax.annotation.Nonnull
    public static AndroidManagedAppProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidManagedAppProtection();
    }
    /**
     * Gets the allowedAndroidDeviceManufacturers property value. Semicolon seperated list of device manufacturers allowed, as a string, for the managed app to work.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAllowedAndroidDeviceManufacturers() {
        return this._allowedAndroidDeviceManufacturers;
    }
    /**
     * Gets the allowedAndroidDeviceModels property value. List of device models allowed, as a string, for the managed app to work.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedAndroidDeviceModels() {
        return this._allowedAndroidDeviceModels;
    }
    /**
     * Gets the appActionIfAndroidDeviceManufacturerNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfAndroidDeviceManufacturerNotAllowed() {
        return this._appActionIfAndroidDeviceManufacturerNotAllowed;
    }
    /**
     * Gets the appActionIfAndroidDeviceModelNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfAndroidDeviceModelNotAllowed() {
        return this._appActionIfAndroidDeviceModelNotAllowed;
    }
    /**
     * Gets the appActionIfAndroidSafetyNetAppsVerificationFailed property value. An admin initiated action to be applied on a managed app.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfAndroidSafetyNetAppsVerificationFailed() {
        return this._appActionIfAndroidSafetyNetAppsVerificationFailed;
    }
    /**
     * Gets the appActionIfAndroidSafetyNetDeviceAttestationFailed property value. An admin initiated action to be applied on a managed app.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfAndroidSafetyNetDeviceAttestationFailed() {
        return this._appActionIfAndroidSafetyNetDeviceAttestationFailed;
    }
    /**
     * Gets the appActionIfDeviceLockNotSet property value. An admin initiated action to be applied on a managed app.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfDeviceLockNotSet() {
        return this._appActionIfDeviceLockNotSet;
    }
    /**
     * Gets the appActionIfDevicePasscodeComplexityLessThanHigh property value. If the device does not have a passcode of high complexity or higher, trigger the stored action.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfDevicePasscodeComplexityLessThanHigh() {
        return this._appActionIfDevicePasscodeComplexityLessThanHigh;
    }
    /**
     * Gets the appActionIfDevicePasscodeComplexityLessThanLow property value. If the device does not have a passcode of low complexity or higher, trigger the stored action.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfDevicePasscodeComplexityLessThanLow() {
        return this._appActionIfDevicePasscodeComplexityLessThanLow;
    }
    /**
     * Gets the appActionIfDevicePasscodeComplexityLessThanMedium property value. If the device does not have a passcode of medium complexity or higher, trigger the stored action.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfDevicePasscodeComplexityLessThanMedium() {
        return this._appActionIfDevicePasscodeComplexityLessThanMedium;
    }
    /**
     * Gets the approvedKeyboards property value. If Keyboard Restriction is enabled, only keyboards in this approved list will be allowed. A key should be Android package id for a keyboard and value should be a friendly name
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getApprovedKeyboards() {
        return this._approvedKeyboards;
    }
    /**
     * Gets the apps property value. List of apps to which the policy is deployed.
     * @return a managedMobileApp
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedMobileApp> getApps() {
        return this._apps;
    }
    /**
     * Gets the biometricAuthenticationBlocked property value. Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBiometricAuthenticationBlocked() {
        return this._biometricAuthenticationBlocked;
    }
    /**
     * Gets the blockAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or app access will be blocked.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBlockAfterCompanyPortalUpdateDeferralInDays() {
        return this._blockAfterCompanyPortalUpdateDeferralInDays;
    }
    /**
     * Gets the connectToVpnOnLaunch property value. Whether the app should connect to the configured VPN on launch.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectToVpnOnLaunch() {
        return this._connectToVpnOnLaunch;
    }
    /**
     * Gets the customBrowserDisplayName property value. Friendly name of the preferred custom browser to open weblink on Android.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomBrowserDisplayName() {
        return this._customBrowserDisplayName;
    }
    /**
     * Gets the customBrowserPackageId property value. Unique identifier of a custom browser to open weblink on Android.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomBrowserPackageId() {
        return this._customBrowserPackageId;
    }
    /**
     * Gets the customDialerAppDisplayName property value. Friendly name of a custom dialer app to click-to-open a phone number on Android.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomDialerAppDisplayName() {
        return this._customDialerAppDisplayName;
    }
    /**
     * Gets the customDialerAppPackageId property value. PackageId of a custom dialer app to click-to-open a phone number on Android.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomDialerAppPackageId() {
        return this._customDialerAppPackageId;
    }
    /**
     * Gets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeployedAppCount() {
        return this._deployedAppCount;
    }
    /**
     * Gets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @return a managedAppPolicyDeploymentSummary
     */
    @javax.annotation.Nullable
    public ManagedAppPolicyDeploymentSummary getDeploymentSummary() {
        return this._deploymentSummary;
    }
    /**
     * Gets the deviceLockRequired property value. Defines if any kind of lock must be required on android device
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceLockRequired() {
        return this._deviceLockRequired;
    }
    /**
     * Gets the disableAppEncryptionIfDeviceEncryptionIsEnabled property value. When this setting is enabled, app level encryption is disabled if device level encryption is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableAppEncryptionIfDeviceEncryptionIsEnabled() {
        return this._disableAppEncryptionIfDeviceEncryptionIsEnabled;
    }
    /**
     * Gets the encryptAppData property value. Indicates whether application data for managed apps should be encrypted
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEncryptAppData() {
        return this._encryptAppData;
    }
    /**
     * Gets the exemptedAppPackages property value. App packages in this list will be exempt from the policy and will be able to receive data from managed apps.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getExemptedAppPackages() {
        return this._exemptedAppPackages;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedAndroidDeviceManufacturers", (n) -> { this.setAllowedAndroidDeviceManufacturers(n.getStringValue()); });
        deserializerMap.put("allowedAndroidDeviceModels", (n) -> { this.setAllowedAndroidDeviceModels(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("appActionIfAndroidDeviceManufacturerNotAllowed", (n) -> { this.setAppActionIfAndroidDeviceManufacturerNotAllowed(n.getEnumValue(ManagedAppRemediationAction.class)); });
        deserializerMap.put("appActionIfAndroidDeviceModelNotAllowed", (n) -> { this.setAppActionIfAndroidDeviceModelNotAllowed(n.getEnumValue(ManagedAppRemediationAction.class)); });
        deserializerMap.put("appActionIfAndroidSafetyNetAppsVerificationFailed", (n) -> { this.setAppActionIfAndroidSafetyNetAppsVerificationFailed(n.getEnumValue(ManagedAppRemediationAction.class)); });
        deserializerMap.put("appActionIfAndroidSafetyNetDeviceAttestationFailed", (n) -> { this.setAppActionIfAndroidSafetyNetDeviceAttestationFailed(n.getEnumValue(ManagedAppRemediationAction.class)); });
        deserializerMap.put("appActionIfDeviceLockNotSet", (n) -> { this.setAppActionIfDeviceLockNotSet(n.getEnumValue(ManagedAppRemediationAction.class)); });
        deserializerMap.put("appActionIfDevicePasscodeComplexityLessThanHigh", (n) -> { this.setAppActionIfDevicePasscodeComplexityLessThanHigh(n.getEnumValue(ManagedAppRemediationAction.class)); });
        deserializerMap.put("appActionIfDevicePasscodeComplexityLessThanLow", (n) -> { this.setAppActionIfDevicePasscodeComplexityLessThanLow(n.getEnumValue(ManagedAppRemediationAction.class)); });
        deserializerMap.put("appActionIfDevicePasscodeComplexityLessThanMedium", (n) -> { this.setAppActionIfDevicePasscodeComplexityLessThanMedium(n.getEnumValue(ManagedAppRemediationAction.class)); });
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
        deserializerMap.put("minimumRequiredCompanyPortalVersion", (n) -> { this.setMinimumRequiredCompanyPortalVersion(n.getStringValue()); });
        deserializerMap.put("minimumRequiredPatchVersion", (n) -> { this.setMinimumRequiredPatchVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningCompanyPortalVersion", (n) -> { this.setMinimumWarningCompanyPortalVersion(n.getStringValue()); });
        deserializerMap.put("minimumWarningPatchVersion", (n) -> { this.setMinimumWarningPatchVersion(n.getStringValue()); });
        deserializerMap.put("minimumWipeCompanyPortalVersion", (n) -> { this.setMinimumWipeCompanyPortalVersion(n.getStringValue()); });
        deserializerMap.put("minimumWipePatchVersion", (n) -> { this.setMinimumWipePatchVersion(n.getStringValue()); });
        deserializerMap.put("requireClass3Biometrics", (n) -> { this.setRequireClass3Biometrics(n.getBooleanValue()); });
        deserializerMap.put("requiredAndroidSafetyNetAppsVerificationType", (n) -> { this.setRequiredAndroidSafetyNetAppsVerificationType(n.getEnumValue(AndroidManagedAppSafetyNetAppsVerificationType.class)); });
        deserializerMap.put("requiredAndroidSafetyNetDeviceAttestationType", (n) -> { this.setRequiredAndroidSafetyNetDeviceAttestationType(n.getEnumValue(AndroidManagedAppSafetyNetDeviceAttestationType.class)); });
        deserializerMap.put("requiredAndroidSafetyNetEvaluationType", (n) -> { this.setRequiredAndroidSafetyNetEvaluationType(n.getEnumValue(AndroidManagedAppSafetyNetEvaluationType.class)); });
        deserializerMap.put("requirePinAfterBiometricChange", (n) -> { this.setRequirePinAfterBiometricChange(n.getBooleanValue()); });
        deserializerMap.put("screenCaptureBlocked", (n) -> { this.setScreenCaptureBlocked(n.getBooleanValue()); });
        deserializerMap.put("warnAfterCompanyPortalUpdateDeferralInDays", (n) -> { this.setWarnAfterCompanyPortalUpdateDeferralInDays(n.getIntegerValue()); });
        deserializerMap.put("wipeAfterCompanyPortalUpdateDeferralInDays", (n) -> { this.setWipeAfterCompanyPortalUpdateDeferralInDays(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fingerprintAndBiometricEnabled property value. If null, this setting will be ignored. If false both fingerprints and biometrics will not be enabled. If true, both fingerprints and biometrics will be enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFingerprintAndBiometricEnabled() {
        return this._fingerprintAndBiometricEnabled;
    }
    /**
     * Gets the keyboardsRestricted property value. Indicates if keyboard restriction is enabled. If enabled list of approved keyboards must be provided as well.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeyboardsRestricted() {
        return this._keyboardsRestricted;
    }
    /**
     * Gets the minimumRequiredCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or app access will be blocked
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredCompanyPortalVersion() {
        return this._minimumRequiredCompanyPortalVersion;
    }
    /**
     * Gets the minimumRequiredPatchVersion property value. Define the oldest required Android security patch level a user can have to gain secure access to the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredPatchVersion() {
        return this._minimumRequiredPatchVersion;
    }
    /**
     * Gets the minimumWarningCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or the user will receive a warning
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWarningCompanyPortalVersion() {
        return this._minimumWarningCompanyPortalVersion;
    }
    /**
     * Gets the minimumWarningPatchVersion property value. Define the oldest recommended Android security patch level a user can have for secure access to the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWarningPatchVersion() {
        return this._minimumWarningPatchVersion;
    }
    /**
     * Gets the minimumWipeCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or the company data on the app will be wiped
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWipeCompanyPortalVersion() {
        return this._minimumWipeCompanyPortalVersion;
    }
    /**
     * Gets the minimumWipePatchVersion property value. Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWipePatchVersion() {
        return this._minimumWipePatchVersion;
    }
    /**
     * Gets the requireClass3Biometrics property value. Require user to apply Class 3 Biometrics on their Android device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireClass3Biometrics() {
        return this._requireClass3Biometrics;
    }
    /**
     * Gets the requiredAndroidSafetyNetAppsVerificationType property value. An admin enforced Android SafetyNet Device Attestation requirement on a managed app.
     * @return a androidManagedAppSafetyNetAppsVerificationType
     */
    @javax.annotation.Nullable
    public AndroidManagedAppSafetyNetAppsVerificationType getRequiredAndroidSafetyNetAppsVerificationType() {
        return this._requiredAndroidSafetyNetAppsVerificationType;
    }
    /**
     * Gets the requiredAndroidSafetyNetDeviceAttestationType property value. An admin enforced Android SafetyNet Device Attestation requirement on a managed app.
     * @return a androidManagedAppSafetyNetDeviceAttestationType
     */
    @javax.annotation.Nullable
    public AndroidManagedAppSafetyNetDeviceAttestationType getRequiredAndroidSafetyNetDeviceAttestationType() {
        return this._requiredAndroidSafetyNetDeviceAttestationType;
    }
    /**
     * Gets the requiredAndroidSafetyNetEvaluationType property value. An admin enforced Android SafetyNet evaluation type requirement on a managed app.
     * @return a androidManagedAppSafetyNetEvaluationType
     */
    @javax.annotation.Nullable
    public AndroidManagedAppSafetyNetEvaluationType getRequiredAndroidSafetyNetEvaluationType() {
        return this._requiredAndroidSafetyNetEvaluationType;
    }
    /**
     * Gets the requirePinAfterBiometricChange property value. A PIN prompt will override biometric prompts if class 3 biometrics are updated on the device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequirePinAfterBiometricChange() {
        return this._requirePinAfterBiometricChange;
    }
    /**
     * Gets the screenCaptureBlocked property value. Indicates whether a managed user can take screen captures of managed apps
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this._screenCaptureBlocked;
    }
    /**
     * Gets the warnAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or the user will receive the warning
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWarnAfterCompanyPortalUpdateDeferralInDays() {
        return this._warnAfterCompanyPortalUpdateDeferralInDays;
    }
    /**
     * Gets the wipeAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or the company data on the app will be wiped
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWipeAfterCompanyPortalUpdateDeferralInDays() {
        return this._wipeAfterCompanyPortalUpdateDeferralInDays;
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
        writer.writeStringValue("allowedAndroidDeviceManufacturers", this.getAllowedAndroidDeviceManufacturers());
        writer.writeCollectionOfPrimitiveValues("allowedAndroidDeviceModels", this.getAllowedAndroidDeviceModels());
        writer.writeEnumValue("appActionIfAndroidDeviceManufacturerNotAllowed", this.getAppActionIfAndroidDeviceManufacturerNotAllowed());
        writer.writeEnumValue("appActionIfAndroidDeviceModelNotAllowed", this.getAppActionIfAndroidDeviceModelNotAllowed());
        writer.writeEnumValue("appActionIfAndroidSafetyNetAppsVerificationFailed", this.getAppActionIfAndroidSafetyNetAppsVerificationFailed());
        writer.writeEnumValue("appActionIfAndroidSafetyNetDeviceAttestationFailed", this.getAppActionIfAndroidSafetyNetDeviceAttestationFailed());
        writer.writeEnumValue("appActionIfDeviceLockNotSet", this.getAppActionIfDeviceLockNotSet());
        writer.writeEnumValue("appActionIfDevicePasscodeComplexityLessThanHigh", this.getAppActionIfDevicePasscodeComplexityLessThanHigh());
        writer.writeEnumValue("appActionIfDevicePasscodeComplexityLessThanLow", this.getAppActionIfDevicePasscodeComplexityLessThanLow());
        writer.writeEnumValue("appActionIfDevicePasscodeComplexityLessThanMedium", this.getAppActionIfDevicePasscodeComplexityLessThanMedium());
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedAndroidDeviceManufacturers(@javax.annotation.Nullable final String value) {
        this._allowedAndroidDeviceManufacturers = value;
    }
    /**
     * Sets the allowedAndroidDeviceModels property value. List of device models allowed, as a string, for the managed app to work.
     * @param value Value to set for the allowedAndroidDeviceModels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedAndroidDeviceModels(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedAndroidDeviceModels = value;
    }
    /**
     * Sets the appActionIfAndroidDeviceManufacturerNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfAndroidDeviceManufacturerNotAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppActionIfAndroidDeviceManufacturerNotAllowed(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfAndroidDeviceManufacturerNotAllowed = value;
    }
    /**
     * Sets the appActionIfAndroidDeviceModelNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfAndroidDeviceModelNotAllowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppActionIfAndroidDeviceModelNotAllowed(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfAndroidDeviceModelNotAllowed = value;
    }
    /**
     * Sets the appActionIfAndroidSafetyNetAppsVerificationFailed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfAndroidSafetyNetAppsVerificationFailed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppActionIfAndroidSafetyNetAppsVerificationFailed(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfAndroidSafetyNetAppsVerificationFailed = value;
    }
    /**
     * Sets the appActionIfAndroidSafetyNetDeviceAttestationFailed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfAndroidSafetyNetDeviceAttestationFailed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppActionIfAndroidSafetyNetDeviceAttestationFailed(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfAndroidSafetyNetDeviceAttestationFailed = value;
    }
    /**
     * Sets the appActionIfDeviceLockNotSet property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfDeviceLockNotSet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppActionIfDeviceLockNotSet(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfDeviceLockNotSet = value;
    }
    /**
     * Sets the appActionIfDevicePasscodeComplexityLessThanHigh property value. If the device does not have a passcode of high complexity or higher, trigger the stored action.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanHigh property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppActionIfDevicePasscodeComplexityLessThanHigh(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfDevicePasscodeComplexityLessThanHigh = value;
    }
    /**
     * Sets the appActionIfDevicePasscodeComplexityLessThanLow property value. If the device does not have a passcode of low complexity or higher, trigger the stored action.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanLow property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppActionIfDevicePasscodeComplexityLessThanLow(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfDevicePasscodeComplexityLessThanLow = value;
    }
    /**
     * Sets the appActionIfDevicePasscodeComplexityLessThanMedium property value. If the device does not have a passcode of medium complexity or higher, trigger the stored action.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanMedium property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppActionIfDevicePasscodeComplexityLessThanMedium(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfDevicePasscodeComplexityLessThanMedium = value;
    }
    /**
     * Sets the approvedKeyboards property value. If Keyboard Restriction is enabled, only keyboards in this approved list will be allowed. A key should be Android package id for a keyboard and value should be a friendly name
     * @param value Value to set for the approvedKeyboards property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApprovedKeyboards(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._approvedKeyboards = value;
    }
    /**
     * Sets the apps property value. List of apps to which the policy is deployed.
     * @param value Value to set for the apps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApps(@javax.annotation.Nullable final java.util.List<ManagedMobileApp> value) {
        this._apps = value;
    }
    /**
     * Sets the biometricAuthenticationBlocked property value. Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True.
     * @param value Value to set for the biometricAuthenticationBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBiometricAuthenticationBlocked(@javax.annotation.Nullable final Boolean value) {
        this._biometricAuthenticationBlocked = value;
    }
    /**
     * Sets the blockAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or app access will be blocked.
     * @param value Value to set for the blockAfterCompanyPortalUpdateDeferralInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockAfterCompanyPortalUpdateDeferralInDays(@javax.annotation.Nullable final Integer value) {
        this._blockAfterCompanyPortalUpdateDeferralInDays = value;
    }
    /**
     * Sets the connectToVpnOnLaunch property value. Whether the app should connect to the configured VPN on launch.
     * @param value Value to set for the connectToVpnOnLaunch property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectToVpnOnLaunch(@javax.annotation.Nullable final Boolean value) {
        this._connectToVpnOnLaunch = value;
    }
    /**
     * Sets the customBrowserDisplayName property value. Friendly name of the preferred custom browser to open weblink on Android.
     * @param value Value to set for the customBrowserDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomBrowserDisplayName(@javax.annotation.Nullable final String value) {
        this._customBrowserDisplayName = value;
    }
    /**
     * Sets the customBrowserPackageId property value. Unique identifier of a custom browser to open weblink on Android.
     * @param value Value to set for the customBrowserPackageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomBrowserPackageId(@javax.annotation.Nullable final String value) {
        this._customBrowserPackageId = value;
    }
    /**
     * Sets the customDialerAppDisplayName property value. Friendly name of a custom dialer app to click-to-open a phone number on Android.
     * @param value Value to set for the customDialerAppDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomDialerAppDisplayName(@javax.annotation.Nullable final String value) {
        this._customDialerAppDisplayName = value;
    }
    /**
     * Sets the customDialerAppPackageId property value. PackageId of a custom dialer app to click-to-open a phone number on Android.
     * @param value Value to set for the customDialerAppPackageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomDialerAppPackageId(@javax.annotation.Nullable final String value) {
        this._customDialerAppPackageId = value;
    }
    /**
     * Sets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @param value Value to set for the deployedAppCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeployedAppCount(@javax.annotation.Nullable final Integer value) {
        this._deployedAppCount = value;
    }
    /**
     * Sets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @param value Value to set for the deploymentSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentSummary(@javax.annotation.Nullable final ManagedAppPolicyDeploymentSummary value) {
        this._deploymentSummary = value;
    }
    /**
     * Sets the deviceLockRequired property value. Defines if any kind of lock must be required on android device
     * @param value Value to set for the deviceLockRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceLockRequired(@javax.annotation.Nullable final Boolean value) {
        this._deviceLockRequired = value;
    }
    /**
     * Sets the disableAppEncryptionIfDeviceEncryptionIsEnabled property value. When this setting is enabled, app level encryption is disabled if device level encryption is enabled
     * @param value Value to set for the disableAppEncryptionIfDeviceEncryptionIsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableAppEncryptionIfDeviceEncryptionIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._disableAppEncryptionIfDeviceEncryptionIsEnabled = value;
    }
    /**
     * Sets the encryptAppData property value. Indicates whether application data for managed apps should be encrypted
     * @param value Value to set for the encryptAppData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEncryptAppData(@javax.annotation.Nullable final Boolean value) {
        this._encryptAppData = value;
    }
    /**
     * Sets the exemptedAppPackages property value. App packages in this list will be exempt from the policy and will be able to receive data from managed apps.
     * @param value Value to set for the exemptedAppPackages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExemptedAppPackages(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._exemptedAppPackages = value;
    }
    /**
     * Sets the fingerprintAndBiometricEnabled property value. If null, this setting will be ignored. If false both fingerprints and biometrics will not be enabled. If true, both fingerprints and biometrics will be enabled.
     * @param value Value to set for the fingerprintAndBiometricEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFingerprintAndBiometricEnabled(@javax.annotation.Nullable final Boolean value) {
        this._fingerprintAndBiometricEnabled = value;
    }
    /**
     * Sets the keyboardsRestricted property value. Indicates if keyboard restriction is enabled. If enabled list of approved keyboards must be provided as well.
     * @param value Value to set for the keyboardsRestricted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeyboardsRestricted(@javax.annotation.Nullable final Boolean value) {
        this._keyboardsRestricted = value;
    }
    /**
     * Sets the minimumRequiredCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or app access will be blocked
     * @param value Value to set for the minimumRequiredCompanyPortalVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumRequiredCompanyPortalVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredCompanyPortalVersion = value;
    }
    /**
     * Sets the minimumRequiredPatchVersion property value. Define the oldest required Android security patch level a user can have to gain secure access to the app.
     * @param value Value to set for the minimumRequiredPatchVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumRequiredPatchVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredPatchVersion = value;
    }
    /**
     * Sets the minimumWarningCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or the user will receive a warning
     * @param value Value to set for the minimumWarningCompanyPortalVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumWarningCompanyPortalVersion(@javax.annotation.Nullable final String value) {
        this._minimumWarningCompanyPortalVersion = value;
    }
    /**
     * Sets the minimumWarningPatchVersion property value. Define the oldest recommended Android security patch level a user can have for secure access to the app.
     * @param value Value to set for the minimumWarningPatchVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumWarningPatchVersion(@javax.annotation.Nullable final String value) {
        this._minimumWarningPatchVersion = value;
    }
    /**
     * Sets the minimumWipeCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or the company data on the app will be wiped
     * @param value Value to set for the minimumWipeCompanyPortalVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumWipeCompanyPortalVersion(@javax.annotation.Nullable final String value) {
        this._minimumWipeCompanyPortalVersion = value;
    }
    /**
     * Sets the minimumWipePatchVersion property value. Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data.
     * @param value Value to set for the minimumWipePatchVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumWipePatchVersion(@javax.annotation.Nullable final String value) {
        this._minimumWipePatchVersion = value;
    }
    /**
     * Sets the requireClass3Biometrics property value. Require user to apply Class 3 Biometrics on their Android device.
     * @param value Value to set for the requireClass3Biometrics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequireClass3Biometrics(@javax.annotation.Nullable final Boolean value) {
        this._requireClass3Biometrics = value;
    }
    /**
     * Sets the requiredAndroidSafetyNetAppsVerificationType property value. An admin enforced Android SafetyNet Device Attestation requirement on a managed app.
     * @param value Value to set for the requiredAndroidSafetyNetAppsVerificationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequiredAndroidSafetyNetAppsVerificationType(@javax.annotation.Nullable final AndroidManagedAppSafetyNetAppsVerificationType value) {
        this._requiredAndroidSafetyNetAppsVerificationType = value;
    }
    /**
     * Sets the requiredAndroidSafetyNetDeviceAttestationType property value. An admin enforced Android SafetyNet Device Attestation requirement on a managed app.
     * @param value Value to set for the requiredAndroidSafetyNetDeviceAttestationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequiredAndroidSafetyNetDeviceAttestationType(@javax.annotation.Nullable final AndroidManagedAppSafetyNetDeviceAttestationType value) {
        this._requiredAndroidSafetyNetDeviceAttestationType = value;
    }
    /**
     * Sets the requiredAndroidSafetyNetEvaluationType property value. An admin enforced Android SafetyNet evaluation type requirement on a managed app.
     * @param value Value to set for the requiredAndroidSafetyNetEvaluationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequiredAndroidSafetyNetEvaluationType(@javax.annotation.Nullable final AndroidManagedAppSafetyNetEvaluationType value) {
        this._requiredAndroidSafetyNetEvaluationType = value;
    }
    /**
     * Sets the requirePinAfterBiometricChange property value. A PIN prompt will override biometric prompts if class 3 biometrics are updated on the device.
     * @param value Value to set for the requirePinAfterBiometricChange property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequirePinAfterBiometricChange(@javax.annotation.Nullable final Boolean value) {
        this._requirePinAfterBiometricChange = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether a managed user can take screen captures of managed apps
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this._screenCaptureBlocked = value;
    }
    /**
     * Sets the warnAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or the user will receive the warning
     * @param value Value to set for the warnAfterCompanyPortalUpdateDeferralInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWarnAfterCompanyPortalUpdateDeferralInDays(@javax.annotation.Nullable final Integer value) {
        this._warnAfterCompanyPortalUpdateDeferralInDays = value;
    }
    /**
     * Sets the wipeAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or the company data on the app will be wiped
     * @param value Value to set for the wipeAfterCompanyPortalUpdateDeferralInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWipeAfterCompanyPortalUpdateDeferralInDays(@javax.annotation.Nullable final Integer value) {
        this._wipeAfterCompanyPortalUpdateDeferralInDays = value;
    }
}
