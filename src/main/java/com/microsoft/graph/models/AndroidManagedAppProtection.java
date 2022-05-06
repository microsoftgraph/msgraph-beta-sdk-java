package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidManagedAppProtection extends TargetedManagedAppProtection implements Parsable {
    /** Semicolon seperated list of device manufacturers allowed, as a string, for the managed app to work.  */
    private String _allowedAndroidDeviceManufacturers;
    /** List of device models allowed, as a string, for the managed app to work.  */
    private java.util.List<String> _allowedAndroidDeviceModels;
    /** Defines a managed app behavior, either block or wipe, if the specified device manufacturer is not allowed. Possible values are: block, wipe, warn.  */
    private ManagedAppRemediationAction _appActionIfAndroidDeviceManufacturerNotAllowed;
    /** Defines a managed app behavior, either block or wipe, if the specified device model is not allowed.  */
    private ManagedAppRemediationAction _appActionIfAndroidDeviceModelNotAllowed;
    /** Defines a managed app behavior, either warn or block, if the specified Android App Verification requirment fails. Possible values are: block, wipe, warn.  */
    private ManagedAppRemediationAction _appActionIfAndroidSafetyNetAppsVerificationFailed;
    /** Defines a managed app behavior, either warn or block, if the specified Android SafetyNet Attestation requirment fails. Possible values are: block, wipe, warn.  */
    private ManagedAppRemediationAction _appActionIfAndroidSafetyNetDeviceAttestationFailed;
    /** Defines a managed app behavior, either warn, block or wipe, if the screen lock is required on android device but is not set.  */
    private ManagedAppRemediationAction _appActionIfDeviceLockNotSet;
    /** If the device does not have a passcode of high complexity or higher, trigger the stored action.  */
    private ManagedAppRemediationAction _appActionIfDevicePasscodeComplexityLessThanHigh;
    /** If the device does not have a passcode of low complexity or higher, trigger the stored action.  */
    private ManagedAppRemediationAction _appActionIfDevicePasscodeComplexityLessThanLow;
    /** If the device does not have a passcode of medium complexity or higher, trigger the stored action.  */
    private ManagedAppRemediationAction _appActionIfDevicePasscodeComplexityLessThanMedium;
    /** If Keyboard Restriction is enabled, only keyboards in this approved list will be allowed. A key should be Android package id for a keyboard and value should be a friendly name  */
    private java.util.List<KeyValuePair> _approvedKeyboards;
    /** List of apps to which the policy is deployed.  */
    private java.util.List<ManagedMobileApp> _apps;
    /** Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True.  */
    private Boolean _biometricAuthenticationBlocked;
    /** Maximum number of days Company Portal update can be deferred on the device or app access will be blocked.  */
    private Integer _blockAfterCompanyPortalUpdateDeferralInDays;
    /** Whether the app should connect to the configured VPN on launch.  */
    private Boolean _connectToVpnOnLaunch;
    /** Friendly name of the preferred custom browser to open weblink on Android.  */
    private String _customBrowserDisplayName;
    /** Unique identifier of a custom browser to open weblink on Android.  */
    private String _customBrowserPackageId;
    /** Friendly name of a custom dialer app to click-to-open a phone number on Android.  */
    private String _customDialerAppDisplayName;
    /** PackageId of a custom dialer app to click-to-open a phone number on Android.  */
    private String _customDialerAppPackageId;
    /** Count of apps to which the current policy is deployed.  */
    private Integer _deployedAppCount;
    /** Navigation property to deployment summary of the configuration.  */
    private ManagedAppPolicyDeploymentSummary _deploymentSummary;
    /** Defines if any kind of lock must be required on android device  */
    private Boolean _deviceLockRequired;
    /** When this setting is enabled, app level encryption is disabled if device level encryption is enabled  */
    private Boolean _disableAppEncryptionIfDeviceEncryptionIsEnabled;
    /** Indicates whether application data for managed apps should be encrypted  */
    private Boolean _encryptAppData;
    /** App packages in this list will be exempt from the policy and will be able to receive data from managed apps.  */
    private java.util.List<KeyValuePair> _exemptedAppPackages;
    /** Indicates if keyboard restriction is enabled. If enabled list of approved keyboards must be provided as well.  */
    private Boolean _keyboardsRestricted;
    /** Minimum version of the Company portal that must be installed on the device or app access will be blocked  */
    private String _minimumRequiredCompanyPortalVersion;
    /** Define the oldest required Android security patch level a user can have to gain secure access to the app.  */
    private String _minimumRequiredPatchVersion;
    /** Minimum version of the Company portal that must be installed on the device or the user will receive a warning  */
    private String _minimumWarningCompanyPortalVersion;
    /** Define the oldest recommended Android security patch level a user can have for secure access to the app.  */
    private String _minimumWarningPatchVersion;
    /** Minimum version of the Company portal that must be installed on the device or the company data on the app will be wiped  */
    private String _minimumWipeCompanyPortalVersion;
    /** Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data.  */
    private String _minimumWipePatchVersion;
    /** Defines the Android SafetyNet Apps Verification requirement for a managed app to work. Possible values are: none, enabled.  */
    private AndroidManagedAppSafetyNetAppsVerificationType _requiredAndroidSafetyNetAppsVerificationType;
    /** Defines the Android SafetyNet Device Attestation requirement for a managed app to work. Possible values are: none, basicIntegrity, basicIntegrityAndDeviceCertification.  */
    private AndroidManagedAppSafetyNetDeviceAttestationType _requiredAndroidSafetyNetDeviceAttestationType;
    /** Defines the Android SafetyNet evaluation type requirement for a managed app to work.  */
    private AndroidManagedAppSafetyNetEvaluationType _requiredAndroidSafetyNetEvaluationType;
    /** Indicates whether a managed user can take screen captures of managed apps  */
    private Boolean _screenCaptureBlocked;
    /** Maximum number of days Company Portal update can be deferred on the device or the user will receive the warning  */
    private Integer _warnAfterCompanyPortalUpdateDeferralInDays;
    /** Maximum number of days Company Portal update can be deferred on the device or the company data on the app will be wiped  */
    private Integer _wipeAfterCompanyPortalUpdateDeferralInDays;
    /**
     * Instantiates a new androidManagedAppProtection and sets the default values.
     * @return a void
     */
    public AndroidManagedAppProtection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidManagedAppProtection
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
     * Gets the appActionIfAndroidDeviceManufacturerNotAllowed property value. Defines a managed app behavior, either block or wipe, if the specified device manufacturer is not allowed. Possible values are: block, wipe, warn.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfAndroidDeviceManufacturerNotAllowed() {
        return this._appActionIfAndroidDeviceManufacturerNotAllowed;
    }
    /**
     * Gets the appActionIfAndroidDeviceModelNotAllowed property value. Defines a managed app behavior, either block or wipe, if the specified device model is not allowed.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfAndroidDeviceModelNotAllowed() {
        return this._appActionIfAndroidDeviceModelNotAllowed;
    }
    /**
     * Gets the appActionIfAndroidSafetyNetAppsVerificationFailed property value. Defines a managed app behavior, either warn or block, if the specified Android App Verification requirment fails. Possible values are: block, wipe, warn.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfAndroidSafetyNetAppsVerificationFailed() {
        return this._appActionIfAndroidSafetyNetAppsVerificationFailed;
    }
    /**
     * Gets the appActionIfAndroidSafetyNetDeviceAttestationFailed property value. Defines a managed app behavior, either warn or block, if the specified Android SafetyNet Attestation requirment fails. Possible values are: block, wipe, warn.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfAndroidSafetyNetDeviceAttestationFailed() {
        return this._appActionIfAndroidSafetyNetDeviceAttestationFailed;
    }
    /**
     * Gets the appActionIfDeviceLockNotSet property value. Defines a managed app behavior, either warn, block or wipe, if the screen lock is required on android device but is not set.
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
        final AndroidManagedAppProtection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowedAndroidDeviceManufacturers", (n) -> { currentObject.setAllowedAndroidDeviceManufacturers(n.getStringValue()); });
            this.put("allowedAndroidDeviceModels", (n) -> { currentObject.setAllowedAndroidDeviceModels(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("appActionIfAndroidDeviceManufacturerNotAllowed", (n) -> { currentObject.setAppActionIfAndroidDeviceManufacturerNotAllowed(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfAndroidDeviceModelNotAllowed", (n) -> { currentObject.setAppActionIfAndroidDeviceModelNotAllowed(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfAndroidSafetyNetAppsVerificationFailed", (n) -> { currentObject.setAppActionIfAndroidSafetyNetAppsVerificationFailed(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfAndroidSafetyNetDeviceAttestationFailed", (n) -> { currentObject.setAppActionIfAndroidSafetyNetDeviceAttestationFailed(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfDeviceLockNotSet", (n) -> { currentObject.setAppActionIfDeviceLockNotSet(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfDevicePasscodeComplexityLessThanHigh", (n) -> { currentObject.setAppActionIfDevicePasscodeComplexityLessThanHigh(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfDevicePasscodeComplexityLessThanLow", (n) -> { currentObject.setAppActionIfDevicePasscodeComplexityLessThanLow(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfDevicePasscodeComplexityLessThanMedium", (n) -> { currentObject.setAppActionIfDevicePasscodeComplexityLessThanMedium(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("approvedKeyboards", (n) -> { currentObject.setApprovedKeyboards(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("apps", (n) -> { currentObject.setApps(n.getCollectionOfObjectValues(ManagedMobileApp::createFromDiscriminatorValue)); });
            this.put("biometricAuthenticationBlocked", (n) -> { currentObject.setBiometricAuthenticationBlocked(n.getBooleanValue()); });
            this.put("blockAfterCompanyPortalUpdateDeferralInDays", (n) -> { currentObject.setBlockAfterCompanyPortalUpdateDeferralInDays(n.getIntegerValue()); });
            this.put("connectToVpnOnLaunch", (n) -> { currentObject.setConnectToVpnOnLaunch(n.getBooleanValue()); });
            this.put("customBrowserDisplayName", (n) -> { currentObject.setCustomBrowserDisplayName(n.getStringValue()); });
            this.put("customBrowserPackageId", (n) -> { currentObject.setCustomBrowserPackageId(n.getStringValue()); });
            this.put("customDialerAppDisplayName", (n) -> { currentObject.setCustomDialerAppDisplayName(n.getStringValue()); });
            this.put("customDialerAppPackageId", (n) -> { currentObject.setCustomDialerAppPackageId(n.getStringValue()); });
            this.put("deployedAppCount", (n) -> { currentObject.setDeployedAppCount(n.getIntegerValue()); });
            this.put("deploymentSummary", (n) -> { currentObject.setDeploymentSummary(n.getObjectValue(ManagedAppPolicyDeploymentSummary::createFromDiscriminatorValue)); });
            this.put("deviceLockRequired", (n) -> { currentObject.setDeviceLockRequired(n.getBooleanValue()); });
            this.put("disableAppEncryptionIfDeviceEncryptionIsEnabled", (n) -> { currentObject.setDisableAppEncryptionIfDeviceEncryptionIsEnabled(n.getBooleanValue()); });
            this.put("encryptAppData", (n) -> { currentObject.setEncryptAppData(n.getBooleanValue()); });
            this.put("exemptedAppPackages", (n) -> { currentObject.setExemptedAppPackages(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("keyboardsRestricted", (n) -> { currentObject.setKeyboardsRestricted(n.getBooleanValue()); });
            this.put("minimumRequiredCompanyPortalVersion", (n) -> { currentObject.setMinimumRequiredCompanyPortalVersion(n.getStringValue()); });
            this.put("minimumRequiredPatchVersion", (n) -> { currentObject.setMinimumRequiredPatchVersion(n.getStringValue()); });
            this.put("minimumWarningCompanyPortalVersion", (n) -> { currentObject.setMinimumWarningCompanyPortalVersion(n.getStringValue()); });
            this.put("minimumWarningPatchVersion", (n) -> { currentObject.setMinimumWarningPatchVersion(n.getStringValue()); });
            this.put("minimumWipeCompanyPortalVersion", (n) -> { currentObject.setMinimumWipeCompanyPortalVersion(n.getStringValue()); });
            this.put("minimumWipePatchVersion", (n) -> { currentObject.setMinimumWipePatchVersion(n.getStringValue()); });
            this.put("requiredAndroidSafetyNetAppsVerificationType", (n) -> { currentObject.setRequiredAndroidSafetyNetAppsVerificationType(n.getEnumValue(AndroidManagedAppSafetyNetAppsVerificationType.class)); });
            this.put("requiredAndroidSafetyNetDeviceAttestationType", (n) -> { currentObject.setRequiredAndroidSafetyNetDeviceAttestationType(n.getEnumValue(AndroidManagedAppSafetyNetDeviceAttestationType.class)); });
            this.put("requiredAndroidSafetyNetEvaluationType", (n) -> { currentObject.setRequiredAndroidSafetyNetEvaluationType(n.getEnumValue(AndroidManagedAppSafetyNetEvaluationType.class)); });
            this.put("screenCaptureBlocked", (n) -> { currentObject.setScreenCaptureBlocked(n.getBooleanValue()); });
            this.put("warnAfterCompanyPortalUpdateDeferralInDays", (n) -> { currentObject.setWarnAfterCompanyPortalUpdateDeferralInDays(n.getIntegerValue()); });
            this.put("wipeAfterCompanyPortalUpdateDeferralInDays", (n) -> { currentObject.setWipeAfterCompanyPortalUpdateDeferralInDays(n.getIntegerValue()); });
        }};
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
     * Gets the requiredAndroidSafetyNetAppsVerificationType property value. Defines the Android SafetyNet Apps Verification requirement for a managed app to work. Possible values are: none, enabled.
     * @return a androidManagedAppSafetyNetAppsVerificationType
     */
    @javax.annotation.Nullable
    public AndroidManagedAppSafetyNetAppsVerificationType getRequiredAndroidSafetyNetAppsVerificationType() {
        return this._requiredAndroidSafetyNetAppsVerificationType;
    }
    /**
     * Gets the requiredAndroidSafetyNetDeviceAttestationType property value. Defines the Android SafetyNet Device Attestation requirement for a managed app to work. Possible values are: none, basicIntegrity, basicIntegrityAndDeviceCertification.
     * @return a androidManagedAppSafetyNetDeviceAttestationType
     */
    @javax.annotation.Nullable
    public AndroidManagedAppSafetyNetDeviceAttestationType getRequiredAndroidSafetyNetDeviceAttestationType() {
        return this._requiredAndroidSafetyNetDeviceAttestationType;
    }
    /**
     * Gets the requiredAndroidSafetyNetEvaluationType property value. Defines the Android SafetyNet evaluation type requirement for a managed app to work.
     * @return a androidManagedAppSafetyNetEvaluationType
     */
    @javax.annotation.Nullable
    public AndroidManagedAppSafetyNetEvaluationType getRequiredAndroidSafetyNetEvaluationType() {
        return this._requiredAndroidSafetyNetEvaluationType;
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
        writer.writeBooleanValue("keyboardsRestricted", this.getKeyboardsRestricted());
        writer.writeStringValue("minimumRequiredCompanyPortalVersion", this.getMinimumRequiredCompanyPortalVersion());
        writer.writeStringValue("minimumRequiredPatchVersion", this.getMinimumRequiredPatchVersion());
        writer.writeStringValue("minimumWarningCompanyPortalVersion", this.getMinimumWarningCompanyPortalVersion());
        writer.writeStringValue("minimumWarningPatchVersion", this.getMinimumWarningPatchVersion());
        writer.writeStringValue("minimumWipeCompanyPortalVersion", this.getMinimumWipeCompanyPortalVersion());
        writer.writeStringValue("minimumWipePatchVersion", this.getMinimumWipePatchVersion());
        writer.writeEnumValue("requiredAndroidSafetyNetAppsVerificationType", this.getRequiredAndroidSafetyNetAppsVerificationType());
        writer.writeEnumValue("requiredAndroidSafetyNetDeviceAttestationType", this.getRequiredAndroidSafetyNetDeviceAttestationType());
        writer.writeEnumValue("requiredAndroidSafetyNetEvaluationType", this.getRequiredAndroidSafetyNetEvaluationType());
        writer.writeBooleanValue("screenCaptureBlocked", this.getScreenCaptureBlocked());
        writer.writeIntegerValue("warnAfterCompanyPortalUpdateDeferralInDays", this.getWarnAfterCompanyPortalUpdateDeferralInDays());
        writer.writeIntegerValue("wipeAfterCompanyPortalUpdateDeferralInDays", this.getWipeAfterCompanyPortalUpdateDeferralInDays());
    }
    /**
     * Sets the allowedAndroidDeviceManufacturers property value. Semicolon seperated list of device manufacturers allowed, as a string, for the managed app to work.
     * @param value Value to set for the allowedAndroidDeviceManufacturers property.
     * @return a void
     */
    public void setAllowedAndroidDeviceManufacturers(@javax.annotation.Nullable final String value) {
        this._allowedAndroidDeviceManufacturers = value;
    }
    /**
     * Sets the allowedAndroidDeviceModels property value. List of device models allowed, as a string, for the managed app to work.
     * @param value Value to set for the allowedAndroidDeviceModels property.
     * @return a void
     */
    public void setAllowedAndroidDeviceModels(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedAndroidDeviceModels = value;
    }
    /**
     * Sets the appActionIfAndroidDeviceManufacturerNotAllowed property value. Defines a managed app behavior, either block or wipe, if the specified device manufacturer is not allowed. Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfAndroidDeviceManufacturerNotAllowed property.
     * @return a void
     */
    public void setAppActionIfAndroidDeviceManufacturerNotAllowed(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfAndroidDeviceManufacturerNotAllowed = value;
    }
    /**
     * Sets the appActionIfAndroidDeviceModelNotAllowed property value. Defines a managed app behavior, either block or wipe, if the specified device model is not allowed.
     * @param value Value to set for the appActionIfAndroidDeviceModelNotAllowed property.
     * @return a void
     */
    public void setAppActionIfAndroidDeviceModelNotAllowed(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfAndroidDeviceModelNotAllowed = value;
    }
    /**
     * Sets the appActionIfAndroidSafetyNetAppsVerificationFailed property value. Defines a managed app behavior, either warn or block, if the specified Android App Verification requirment fails. Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfAndroidSafetyNetAppsVerificationFailed property.
     * @return a void
     */
    public void setAppActionIfAndroidSafetyNetAppsVerificationFailed(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfAndroidSafetyNetAppsVerificationFailed = value;
    }
    /**
     * Sets the appActionIfAndroidSafetyNetDeviceAttestationFailed property value. Defines a managed app behavior, either warn or block, if the specified Android SafetyNet Attestation requirment fails. Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfAndroidSafetyNetDeviceAttestationFailed property.
     * @return a void
     */
    public void setAppActionIfAndroidSafetyNetDeviceAttestationFailed(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfAndroidSafetyNetDeviceAttestationFailed = value;
    }
    /**
     * Sets the appActionIfDeviceLockNotSet property value. Defines a managed app behavior, either warn, block or wipe, if the screen lock is required on android device but is not set.
     * @param value Value to set for the appActionIfDeviceLockNotSet property.
     * @return a void
     */
    public void setAppActionIfDeviceLockNotSet(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfDeviceLockNotSet = value;
    }
    /**
     * Sets the appActionIfDevicePasscodeComplexityLessThanHigh property value. If the device does not have a passcode of high complexity or higher, trigger the stored action.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanHigh property.
     * @return a void
     */
    public void setAppActionIfDevicePasscodeComplexityLessThanHigh(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfDevicePasscodeComplexityLessThanHigh = value;
    }
    /**
     * Sets the appActionIfDevicePasscodeComplexityLessThanLow property value. If the device does not have a passcode of low complexity or higher, trigger the stored action.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanLow property.
     * @return a void
     */
    public void setAppActionIfDevicePasscodeComplexityLessThanLow(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfDevicePasscodeComplexityLessThanLow = value;
    }
    /**
     * Sets the appActionIfDevicePasscodeComplexityLessThanMedium property value. If the device does not have a passcode of medium complexity or higher, trigger the stored action.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanMedium property.
     * @return a void
     */
    public void setAppActionIfDevicePasscodeComplexityLessThanMedium(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfDevicePasscodeComplexityLessThanMedium = value;
    }
    /**
     * Sets the approvedKeyboards property value. If Keyboard Restriction is enabled, only keyboards in this approved list will be allowed. A key should be Android package id for a keyboard and value should be a friendly name
     * @param value Value to set for the approvedKeyboards property.
     * @return a void
     */
    public void setApprovedKeyboards(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._approvedKeyboards = value;
    }
    /**
     * Sets the apps property value. List of apps to which the policy is deployed.
     * @param value Value to set for the apps property.
     * @return a void
     */
    public void setApps(@javax.annotation.Nullable final java.util.List<ManagedMobileApp> value) {
        this._apps = value;
    }
    /**
     * Sets the biometricAuthenticationBlocked property value. Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True.
     * @param value Value to set for the biometricAuthenticationBlocked property.
     * @return a void
     */
    public void setBiometricAuthenticationBlocked(@javax.annotation.Nullable final Boolean value) {
        this._biometricAuthenticationBlocked = value;
    }
    /**
     * Sets the blockAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or app access will be blocked.
     * @param value Value to set for the blockAfterCompanyPortalUpdateDeferralInDays property.
     * @return a void
     */
    public void setBlockAfterCompanyPortalUpdateDeferralInDays(@javax.annotation.Nullable final Integer value) {
        this._blockAfterCompanyPortalUpdateDeferralInDays = value;
    }
    /**
     * Sets the connectToVpnOnLaunch property value. Whether the app should connect to the configured VPN on launch.
     * @param value Value to set for the connectToVpnOnLaunch property.
     * @return a void
     */
    public void setConnectToVpnOnLaunch(@javax.annotation.Nullable final Boolean value) {
        this._connectToVpnOnLaunch = value;
    }
    /**
     * Sets the customBrowserDisplayName property value. Friendly name of the preferred custom browser to open weblink on Android.
     * @param value Value to set for the customBrowserDisplayName property.
     * @return a void
     */
    public void setCustomBrowserDisplayName(@javax.annotation.Nullable final String value) {
        this._customBrowserDisplayName = value;
    }
    /**
     * Sets the customBrowserPackageId property value. Unique identifier of a custom browser to open weblink on Android.
     * @param value Value to set for the customBrowserPackageId property.
     * @return a void
     */
    public void setCustomBrowserPackageId(@javax.annotation.Nullable final String value) {
        this._customBrowserPackageId = value;
    }
    /**
     * Sets the customDialerAppDisplayName property value. Friendly name of a custom dialer app to click-to-open a phone number on Android.
     * @param value Value to set for the customDialerAppDisplayName property.
     * @return a void
     */
    public void setCustomDialerAppDisplayName(@javax.annotation.Nullable final String value) {
        this._customDialerAppDisplayName = value;
    }
    /**
     * Sets the customDialerAppPackageId property value. PackageId of a custom dialer app to click-to-open a phone number on Android.
     * @param value Value to set for the customDialerAppPackageId property.
     * @return a void
     */
    public void setCustomDialerAppPackageId(@javax.annotation.Nullable final String value) {
        this._customDialerAppPackageId = value;
    }
    /**
     * Sets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @param value Value to set for the deployedAppCount property.
     * @return a void
     */
    public void setDeployedAppCount(@javax.annotation.Nullable final Integer value) {
        this._deployedAppCount = value;
    }
    /**
     * Sets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @param value Value to set for the deploymentSummary property.
     * @return a void
     */
    public void setDeploymentSummary(@javax.annotation.Nullable final ManagedAppPolicyDeploymentSummary value) {
        this._deploymentSummary = value;
    }
    /**
     * Sets the deviceLockRequired property value. Defines if any kind of lock must be required on android device
     * @param value Value to set for the deviceLockRequired property.
     * @return a void
     */
    public void setDeviceLockRequired(@javax.annotation.Nullable final Boolean value) {
        this._deviceLockRequired = value;
    }
    /**
     * Sets the disableAppEncryptionIfDeviceEncryptionIsEnabled property value. When this setting is enabled, app level encryption is disabled if device level encryption is enabled
     * @param value Value to set for the disableAppEncryptionIfDeviceEncryptionIsEnabled property.
     * @return a void
     */
    public void setDisableAppEncryptionIfDeviceEncryptionIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._disableAppEncryptionIfDeviceEncryptionIsEnabled = value;
    }
    /**
     * Sets the encryptAppData property value. Indicates whether application data for managed apps should be encrypted
     * @param value Value to set for the encryptAppData property.
     * @return a void
     */
    public void setEncryptAppData(@javax.annotation.Nullable final Boolean value) {
        this._encryptAppData = value;
    }
    /**
     * Sets the exemptedAppPackages property value. App packages in this list will be exempt from the policy and will be able to receive data from managed apps.
     * @param value Value to set for the exemptedAppPackages property.
     * @return a void
     */
    public void setExemptedAppPackages(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._exemptedAppPackages = value;
    }
    /**
     * Sets the keyboardsRestricted property value. Indicates if keyboard restriction is enabled. If enabled list of approved keyboards must be provided as well.
     * @param value Value to set for the keyboardsRestricted property.
     * @return a void
     */
    public void setKeyboardsRestricted(@javax.annotation.Nullable final Boolean value) {
        this._keyboardsRestricted = value;
    }
    /**
     * Sets the minimumRequiredCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or app access will be blocked
     * @param value Value to set for the minimumRequiredCompanyPortalVersion property.
     * @return a void
     */
    public void setMinimumRequiredCompanyPortalVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredCompanyPortalVersion = value;
    }
    /**
     * Sets the minimumRequiredPatchVersion property value. Define the oldest required Android security patch level a user can have to gain secure access to the app.
     * @param value Value to set for the minimumRequiredPatchVersion property.
     * @return a void
     */
    public void setMinimumRequiredPatchVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredPatchVersion = value;
    }
    /**
     * Sets the minimumWarningCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or the user will receive a warning
     * @param value Value to set for the minimumWarningCompanyPortalVersion property.
     * @return a void
     */
    public void setMinimumWarningCompanyPortalVersion(@javax.annotation.Nullable final String value) {
        this._minimumWarningCompanyPortalVersion = value;
    }
    /**
     * Sets the minimumWarningPatchVersion property value. Define the oldest recommended Android security patch level a user can have for secure access to the app.
     * @param value Value to set for the minimumWarningPatchVersion property.
     * @return a void
     */
    public void setMinimumWarningPatchVersion(@javax.annotation.Nullable final String value) {
        this._minimumWarningPatchVersion = value;
    }
    /**
     * Sets the minimumWipeCompanyPortalVersion property value. Minimum version of the Company portal that must be installed on the device or the company data on the app will be wiped
     * @param value Value to set for the minimumWipeCompanyPortalVersion property.
     * @return a void
     */
    public void setMinimumWipeCompanyPortalVersion(@javax.annotation.Nullable final String value) {
        this._minimumWipeCompanyPortalVersion = value;
    }
    /**
     * Sets the minimumWipePatchVersion property value. Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data.
     * @param value Value to set for the minimumWipePatchVersion property.
     * @return a void
     */
    public void setMinimumWipePatchVersion(@javax.annotation.Nullable final String value) {
        this._minimumWipePatchVersion = value;
    }
    /**
     * Sets the requiredAndroidSafetyNetAppsVerificationType property value. Defines the Android SafetyNet Apps Verification requirement for a managed app to work. Possible values are: none, enabled.
     * @param value Value to set for the requiredAndroidSafetyNetAppsVerificationType property.
     * @return a void
     */
    public void setRequiredAndroidSafetyNetAppsVerificationType(@javax.annotation.Nullable final AndroidManagedAppSafetyNetAppsVerificationType value) {
        this._requiredAndroidSafetyNetAppsVerificationType = value;
    }
    /**
     * Sets the requiredAndroidSafetyNetDeviceAttestationType property value. Defines the Android SafetyNet Device Attestation requirement for a managed app to work. Possible values are: none, basicIntegrity, basicIntegrityAndDeviceCertification.
     * @param value Value to set for the requiredAndroidSafetyNetDeviceAttestationType property.
     * @return a void
     */
    public void setRequiredAndroidSafetyNetDeviceAttestationType(@javax.annotation.Nullable final AndroidManagedAppSafetyNetDeviceAttestationType value) {
        this._requiredAndroidSafetyNetDeviceAttestationType = value;
    }
    /**
     * Sets the requiredAndroidSafetyNetEvaluationType property value. Defines the Android SafetyNet evaluation type requirement for a managed app to work.
     * @param value Value to set for the requiredAndroidSafetyNetEvaluationType property.
     * @return a void
     */
    public void setRequiredAndroidSafetyNetEvaluationType(@javax.annotation.Nullable final AndroidManagedAppSafetyNetEvaluationType value) {
        this._requiredAndroidSafetyNetEvaluationType = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether a managed user can take screen captures of managed apps
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this._screenCaptureBlocked = value;
    }
    /**
     * Sets the warnAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or the user will receive the warning
     * @param value Value to set for the warnAfterCompanyPortalUpdateDeferralInDays property.
     * @return a void
     */
    public void setWarnAfterCompanyPortalUpdateDeferralInDays(@javax.annotation.Nullable final Integer value) {
        this._warnAfterCompanyPortalUpdateDeferralInDays = value;
    }
    /**
     * Sets the wipeAfterCompanyPortalUpdateDeferralInDays property value. Maximum number of days Company Portal update can be deferred on the device or the company data on the app will be wiped
     * @param value Value to set for the wipeAfterCompanyPortalUpdateDeferralInDays property.
     * @return a void
     */
    public void setWipeAfterCompanyPortalUpdateDeferralInDays(@javax.annotation.Nullable final Integer value) {
        this._wipeAfterCompanyPortalUpdateDeferralInDays = value;
    }
}
