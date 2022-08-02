package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DefaultManagedAppProtection extends ManagedAppProtection implements Parsable {
    /** Semicolon seperated list of device manufacturers allowed, as a string, for the managed app to work. (Android only) */
    private String _allowedAndroidDeviceManufacturers;
    /** List of device models allowed, as a string, for the managed app to work. (Android Only) */
    private java.util.List<String> _allowedAndroidDeviceModels;
    /** Semicolon seperated list of device models allowed, as a string, for the managed app to work. (iOS Only) */
    private String _allowedIosDeviceModels;
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
    /** If the device does not have a passcode of high complexity or higher, trigger the stored action. Possible values are: block, wipe, warn. */
    private ManagedAppRemediationAction _appActionIfDevicePasscodeComplexityLessThanHigh;
    /** If the device does not have a passcode of low complexity or higher, trigger the stored action. Possible values are: block, wipe, warn. */
    private ManagedAppRemediationAction _appActionIfDevicePasscodeComplexityLessThanLow;
    /** If the device does not have a passcode of medium complexity or higher, trigger the stored action. Possible values are: block, wipe, warn. */
    private ManagedAppRemediationAction _appActionIfDevicePasscodeComplexityLessThanMedium;
    /** An admin initiated action to be applied on a managed app. */
    private ManagedAppRemediationAction _appActionIfIosDeviceModelNotAllowed;
    /** Represents the level to which app data is encrypted for managed apps */
    private ManagedAppDataEncryptionType _appDataEncryptionType;
    /** List of apps to which the policy is deployed. */
    private java.util.List<ManagedMobileApp> _apps;
    /** Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True. (Android Only) */
    private Boolean _biometricAuthenticationBlocked;
    /** Maximum number of days Company Portal update can be deferred on the device or app access will be blocked. */
    private Integer _blockAfterCompanyPortalUpdateDeferralInDays;
    /** Whether the app should connect to the configured VPN on launch (Android only). */
    private Boolean _connectToVpnOnLaunch;
    /** Friendly name of the preferred custom browser to open weblink on Android. (Android only) */
    private String _customBrowserDisplayName;
    /** Unique identifier of a custom browser to open weblink on Android. (Android only) */
    private String _customBrowserPackageId;
    /** A custom browser protocol to open weblink on iOS. (iOS only) */
    private String _customBrowserProtocol;
    /** Friendly name of a custom dialer app to click-to-open a phone number on Android. */
    private String _customDialerAppDisplayName;
    /** PackageId of a custom dialer app to click-to-open a phone number on Android. */
    private String _customDialerAppPackageId;
    /** Protocol of a custom dialer app to click-to-open a phone number on iOS, for example, skype:. */
    private String _customDialerAppProtocol;
    /** A set of string key and string value pairs to be sent to the affected users, unalterned by this service */
    private java.util.List<KeyValuePair> _customSettings;
    /** Count of apps to which the current policy is deployed. */
    private Integer _deployedAppCount;
    /** Navigation property to deployment summary of the configuration. */
    private ManagedAppPolicyDeploymentSummary _deploymentSummary;
    /** Defines if any kind of lock must be required on device. (android only) */
    private Boolean _deviceLockRequired;
    /** When this setting is enabled, app level encryption is disabled if device level encryption is enabled. (Android only) */
    private Boolean _disableAppEncryptionIfDeviceEncryptionIsEnabled;
    /** Disable protection of data transferred to other apps through IOS OpenIn option. This setting is only allowed to be True when AllowedOutboundDataTransferDestinations is set to ManagedApps. (iOS Only) */
    private Boolean _disableProtectionOfManagedOutboundOpenInData;
    /** Indicates whether managed-app data should be encrypted. (Android only) */
    private Boolean _encryptAppData;
    /** Android App packages in this list will be exempt from the policy and will be able to receive data from managed apps. (Android only) */
    private java.util.List<KeyValuePair> _exemptedAppPackages;
    /** iOS Apps in this list will be exempt from the policy and will be able to receive data from managed apps. (iOS Only) */
    private java.util.List<KeyValuePair> _exemptedAppProtocols;
    /** Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. (iOS Only) */
    private Boolean _faceIdBlocked;
    /** Defines if open-in operation is supported from the managed app to the filesharing locations selected. This setting only applies when AllowedOutboundDataTransferDestinations is set to ManagedApps and DisableProtectionOfManagedOutboundOpenInData is set to False. (iOS Only) */
    private Boolean _filterOpenInToOnlyManagedApps;
    /** Indicate to the client to enable both biometrics and fingerprints for the app. */
    private Boolean _fingerprintAndBiometricEnabled;
    /** Minimum version of the Company portal that must be installed on the device or app access will be blocked */
    private String _minimumRequiredCompanyPortalVersion;
    /** Define the oldest required Android security patch level a user can have to gain secure access to the app. (Android only) */
    private String _minimumRequiredPatchVersion;
    /** Versions less than the specified version will block the managed app from accessing company data. (iOS Only) */
    private String _minimumRequiredSdkVersion;
    /** Minimum version of the Company portal that must be installed on the device or the user will receive a warning */
    private String _minimumWarningCompanyPortalVersion;
    /** Define the oldest recommended Android security patch level a user can have for secure access to the app. (Android only) */
    private String _minimumWarningPatchVersion;
    /** Minimum version of the Company portal that must be installed on the device or the company data on the app will be wiped */
    private String _minimumWipeCompanyPortalVersion;
    /** Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data. (Android only) */
    private String _minimumWipePatchVersion;
    /** Versions less than the specified version will block the managed app from accessing company data. */
    private String _minimumWipeSdkVersion;
    /** Protect incoming data from unknown source. This setting is only allowed to be True when AllowedInboundDataTransferSources is set to AllApps. (iOS Only) */
    private Boolean _protectInboundDataFromUnknownSources;
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
    /** Indicates whether screen capture is blocked. (Android only) */
    private Boolean _screenCaptureBlocked;
    /** Defines if third party keyboards are allowed while accessing a managed app. (iOS Only) */
    private Boolean _thirdPartyKeyboardsBlocked;
    /** Maximum number of days Company Portal update can be deferred on the device or the user will receive the warning */
    private Integer _warnAfterCompanyPortalUpdateDeferralInDays;
    /** Maximum number of days Company Portal update can be deferred on the device or the company data on the app will be wiped */
    private Integer _wipeAfterCompanyPortalUpdateDeferralInDays;
    /**
     * Instantiates a new DefaultManagedAppProtection and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static DefaultManagedAppProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DefaultManagedAppProtection();
    }
    /**
     * Gets the allowedAndroidDeviceManufacturers property value. Semicolon seperated list of device manufacturers allowed, as a string, for the managed app to work. (Android only)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAllowedAndroidDeviceManufacturers() {
        return this._allowedAndroidDeviceManufacturers;
    }
    /**
     * Gets the allowedAndroidDeviceModels property value. List of device models allowed, as a string, for the managed app to work. (Android Only)
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAllowedAndroidDeviceModels() {
        return this._allowedAndroidDeviceModels;
    }
    /**
     * Gets the allowedIosDeviceModels property value. Semicolon seperated list of device models allowed, as a string, for the managed app to work. (iOS Only)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAllowedIosDeviceModels() {
        return this._allowedIosDeviceModels;
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
     * Gets the appActionIfDevicePasscodeComplexityLessThanHigh property value. If the device does not have a passcode of high complexity or higher, trigger the stored action. Possible values are: block, wipe, warn.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfDevicePasscodeComplexityLessThanHigh() {
        return this._appActionIfDevicePasscodeComplexityLessThanHigh;
    }
    /**
     * Gets the appActionIfDevicePasscodeComplexityLessThanLow property value. If the device does not have a passcode of low complexity or higher, trigger the stored action. Possible values are: block, wipe, warn.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfDevicePasscodeComplexityLessThanLow() {
        return this._appActionIfDevicePasscodeComplexityLessThanLow;
    }
    /**
     * Gets the appActionIfDevicePasscodeComplexityLessThanMedium property value. If the device does not have a passcode of medium complexity or higher, trigger the stored action. Possible values are: block, wipe, warn.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfDevicePasscodeComplexityLessThanMedium() {
        return this._appActionIfDevicePasscodeComplexityLessThanMedium;
    }
    /**
     * Gets the appActionIfIosDeviceModelNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @return a managedAppRemediationAction
     */
    @javax.annotation.Nullable
    public ManagedAppRemediationAction getAppActionIfIosDeviceModelNotAllowed() {
        return this._appActionIfIosDeviceModelNotAllowed;
    }
    /**
     * Gets the appDataEncryptionType property value. Represents the level to which app data is encrypted for managed apps
     * @return a managedAppDataEncryptionType
     */
    @javax.annotation.Nullable
    public ManagedAppDataEncryptionType getAppDataEncryptionType() {
        return this._appDataEncryptionType;
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
     * Gets the biometricAuthenticationBlocked property value. Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True. (Android Only)
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
     * Gets the connectToVpnOnLaunch property value. Whether the app should connect to the configured VPN on launch (Android only).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectToVpnOnLaunch() {
        return this._connectToVpnOnLaunch;
    }
    /**
     * Gets the customBrowserDisplayName property value. Friendly name of the preferred custom browser to open weblink on Android. (Android only)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomBrowserDisplayName() {
        return this._customBrowserDisplayName;
    }
    /**
     * Gets the customBrowserPackageId property value. Unique identifier of a custom browser to open weblink on Android. (Android only)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomBrowserPackageId() {
        return this._customBrowserPackageId;
    }
    /**
     * Gets the customBrowserProtocol property value. A custom browser protocol to open weblink on iOS. (iOS only)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomBrowserProtocol() {
        return this._customBrowserProtocol;
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
     * Gets the customDialerAppProtocol property value. Protocol of a custom dialer app to click-to-open a phone number on iOS, for example, skype:.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomDialerAppProtocol() {
        return this._customDialerAppProtocol;
    }
    /**
     * Gets the customSettings property value. A set of string key and string value pairs to be sent to the affected users, unalterned by this service
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getCustomSettings() {
        return this._customSettings;
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
     * Gets the deviceLockRequired property value. Defines if any kind of lock must be required on device. (android only)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceLockRequired() {
        return this._deviceLockRequired;
    }
    /**
     * Gets the disableAppEncryptionIfDeviceEncryptionIsEnabled property value. When this setting is enabled, app level encryption is disabled if device level encryption is enabled. (Android only)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableAppEncryptionIfDeviceEncryptionIsEnabled() {
        return this._disableAppEncryptionIfDeviceEncryptionIsEnabled;
    }
    /**
     * Gets the disableProtectionOfManagedOutboundOpenInData property value. Disable protection of data transferred to other apps through IOS OpenIn option. This setting is only allowed to be True when AllowedOutboundDataTransferDestinations is set to ManagedApps. (iOS Only)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableProtectionOfManagedOutboundOpenInData() {
        return this._disableProtectionOfManagedOutboundOpenInData;
    }
    /**
     * Gets the encryptAppData property value. Indicates whether managed-app data should be encrypted. (Android only)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEncryptAppData() {
        return this._encryptAppData;
    }
    /**
     * Gets the exemptedAppPackages property value. Android App packages in this list will be exempt from the policy and will be able to receive data from managed apps. (Android only)
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getExemptedAppPackages() {
        return this._exemptedAppPackages;
    }
    /**
     * Gets the exemptedAppProtocols property value. iOS Apps in this list will be exempt from the policy and will be able to receive data from managed apps. (iOS Only)
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getExemptedAppProtocols() {
        return this._exemptedAppProtocols;
    }
    /**
     * Gets the faceIdBlocked property value. Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. (iOS Only)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFaceIdBlocked() {
        return this._faceIdBlocked;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DefaultManagedAppProtection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowedAndroidDeviceManufacturers", (n) -> { currentObject.setAllowedAndroidDeviceManufacturers(n.getStringValue()); });
            this.put("allowedAndroidDeviceModels", (n) -> { currentObject.setAllowedAndroidDeviceModels(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("allowedIosDeviceModels", (n) -> { currentObject.setAllowedIosDeviceModels(n.getStringValue()); });
            this.put("appActionIfAndroidDeviceManufacturerNotAllowed", (n) -> { currentObject.setAppActionIfAndroidDeviceManufacturerNotAllowed(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfAndroidDeviceModelNotAllowed", (n) -> { currentObject.setAppActionIfAndroidDeviceModelNotAllowed(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfAndroidSafetyNetAppsVerificationFailed", (n) -> { currentObject.setAppActionIfAndroidSafetyNetAppsVerificationFailed(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfAndroidSafetyNetDeviceAttestationFailed", (n) -> { currentObject.setAppActionIfAndroidSafetyNetDeviceAttestationFailed(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfDeviceLockNotSet", (n) -> { currentObject.setAppActionIfDeviceLockNotSet(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfDevicePasscodeComplexityLessThanHigh", (n) -> { currentObject.setAppActionIfDevicePasscodeComplexityLessThanHigh(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfDevicePasscodeComplexityLessThanLow", (n) -> { currentObject.setAppActionIfDevicePasscodeComplexityLessThanLow(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfDevicePasscodeComplexityLessThanMedium", (n) -> { currentObject.setAppActionIfDevicePasscodeComplexityLessThanMedium(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appActionIfIosDeviceModelNotAllowed", (n) -> { currentObject.setAppActionIfIosDeviceModelNotAllowed(n.getEnumValue(ManagedAppRemediationAction.class)); });
            this.put("appDataEncryptionType", (n) -> { currentObject.setAppDataEncryptionType(n.getEnumValue(ManagedAppDataEncryptionType.class)); });
            this.put("apps", (n) -> { currentObject.setApps(n.getCollectionOfObjectValues(ManagedMobileApp::createFromDiscriminatorValue)); });
            this.put("biometricAuthenticationBlocked", (n) -> { currentObject.setBiometricAuthenticationBlocked(n.getBooleanValue()); });
            this.put("blockAfterCompanyPortalUpdateDeferralInDays", (n) -> { currentObject.setBlockAfterCompanyPortalUpdateDeferralInDays(n.getIntegerValue()); });
            this.put("connectToVpnOnLaunch", (n) -> { currentObject.setConnectToVpnOnLaunch(n.getBooleanValue()); });
            this.put("customBrowserDisplayName", (n) -> { currentObject.setCustomBrowserDisplayName(n.getStringValue()); });
            this.put("customBrowserPackageId", (n) -> { currentObject.setCustomBrowserPackageId(n.getStringValue()); });
            this.put("customBrowserProtocol", (n) -> { currentObject.setCustomBrowserProtocol(n.getStringValue()); });
            this.put("customDialerAppDisplayName", (n) -> { currentObject.setCustomDialerAppDisplayName(n.getStringValue()); });
            this.put("customDialerAppPackageId", (n) -> { currentObject.setCustomDialerAppPackageId(n.getStringValue()); });
            this.put("customDialerAppProtocol", (n) -> { currentObject.setCustomDialerAppProtocol(n.getStringValue()); });
            this.put("customSettings", (n) -> { currentObject.setCustomSettings(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("deployedAppCount", (n) -> { currentObject.setDeployedAppCount(n.getIntegerValue()); });
            this.put("deploymentSummary", (n) -> { currentObject.setDeploymentSummary(n.getObjectValue(ManagedAppPolicyDeploymentSummary::createFromDiscriminatorValue)); });
            this.put("deviceLockRequired", (n) -> { currentObject.setDeviceLockRequired(n.getBooleanValue()); });
            this.put("disableAppEncryptionIfDeviceEncryptionIsEnabled", (n) -> { currentObject.setDisableAppEncryptionIfDeviceEncryptionIsEnabled(n.getBooleanValue()); });
            this.put("disableProtectionOfManagedOutboundOpenInData", (n) -> { currentObject.setDisableProtectionOfManagedOutboundOpenInData(n.getBooleanValue()); });
            this.put("encryptAppData", (n) -> { currentObject.setEncryptAppData(n.getBooleanValue()); });
            this.put("exemptedAppPackages", (n) -> { currentObject.setExemptedAppPackages(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("exemptedAppProtocols", (n) -> { currentObject.setExemptedAppProtocols(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("faceIdBlocked", (n) -> { currentObject.setFaceIdBlocked(n.getBooleanValue()); });
            this.put("filterOpenInToOnlyManagedApps", (n) -> { currentObject.setFilterOpenInToOnlyManagedApps(n.getBooleanValue()); });
            this.put("fingerprintAndBiometricEnabled", (n) -> { currentObject.setFingerprintAndBiometricEnabled(n.getBooleanValue()); });
            this.put("minimumRequiredCompanyPortalVersion", (n) -> { currentObject.setMinimumRequiredCompanyPortalVersion(n.getStringValue()); });
            this.put("minimumRequiredPatchVersion", (n) -> { currentObject.setMinimumRequiredPatchVersion(n.getStringValue()); });
            this.put("minimumRequiredSdkVersion", (n) -> { currentObject.setMinimumRequiredSdkVersion(n.getStringValue()); });
            this.put("minimumWarningCompanyPortalVersion", (n) -> { currentObject.setMinimumWarningCompanyPortalVersion(n.getStringValue()); });
            this.put("minimumWarningPatchVersion", (n) -> { currentObject.setMinimumWarningPatchVersion(n.getStringValue()); });
            this.put("minimumWipeCompanyPortalVersion", (n) -> { currentObject.setMinimumWipeCompanyPortalVersion(n.getStringValue()); });
            this.put("minimumWipePatchVersion", (n) -> { currentObject.setMinimumWipePatchVersion(n.getStringValue()); });
            this.put("minimumWipeSdkVersion", (n) -> { currentObject.setMinimumWipeSdkVersion(n.getStringValue()); });
            this.put("protectInboundDataFromUnknownSources", (n) -> { currentObject.setProtectInboundDataFromUnknownSources(n.getBooleanValue()); });
            this.put("requireClass3Biometrics", (n) -> { currentObject.setRequireClass3Biometrics(n.getBooleanValue()); });
            this.put("requiredAndroidSafetyNetAppsVerificationType", (n) -> { currentObject.setRequiredAndroidSafetyNetAppsVerificationType(n.getEnumValue(AndroidManagedAppSafetyNetAppsVerificationType.class)); });
            this.put("requiredAndroidSafetyNetDeviceAttestationType", (n) -> { currentObject.setRequiredAndroidSafetyNetDeviceAttestationType(n.getEnumValue(AndroidManagedAppSafetyNetDeviceAttestationType.class)); });
            this.put("requiredAndroidSafetyNetEvaluationType", (n) -> { currentObject.setRequiredAndroidSafetyNetEvaluationType(n.getEnumValue(AndroidManagedAppSafetyNetEvaluationType.class)); });
            this.put("requirePinAfterBiometricChange", (n) -> { currentObject.setRequirePinAfterBiometricChange(n.getBooleanValue()); });
            this.put("screenCaptureBlocked", (n) -> { currentObject.setScreenCaptureBlocked(n.getBooleanValue()); });
            this.put("thirdPartyKeyboardsBlocked", (n) -> { currentObject.setThirdPartyKeyboardsBlocked(n.getBooleanValue()); });
            this.put("warnAfterCompanyPortalUpdateDeferralInDays", (n) -> { currentObject.setWarnAfterCompanyPortalUpdateDeferralInDays(n.getIntegerValue()); });
            this.put("wipeAfterCompanyPortalUpdateDeferralInDays", (n) -> { currentObject.setWipeAfterCompanyPortalUpdateDeferralInDays(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the filterOpenInToOnlyManagedApps property value. Defines if open-in operation is supported from the managed app to the filesharing locations selected. This setting only applies when AllowedOutboundDataTransferDestinations is set to ManagedApps and DisableProtectionOfManagedOutboundOpenInData is set to False. (iOS Only)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFilterOpenInToOnlyManagedApps() {
        return this._filterOpenInToOnlyManagedApps;
    }
    /**
     * Gets the fingerprintAndBiometricEnabled property value. Indicate to the client to enable both biometrics and fingerprints for the app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFingerprintAndBiometricEnabled() {
        return this._fingerprintAndBiometricEnabled;
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
     * Gets the minimumRequiredPatchVersion property value. Define the oldest required Android security patch level a user can have to gain secure access to the app. (Android only)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredPatchVersion() {
        return this._minimumRequiredPatchVersion;
    }
    /**
     * Gets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data. (iOS Only)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumRequiredSdkVersion() {
        return this._minimumRequiredSdkVersion;
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
     * Gets the minimumWarningPatchVersion property value. Define the oldest recommended Android security patch level a user can have for secure access to the app. (Android only)
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
     * Gets the minimumWipePatchVersion property value. Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data. (Android only)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWipePatchVersion() {
        return this._minimumWipePatchVersion;
    }
    /**
     * Gets the minimumWipeSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumWipeSdkVersion() {
        return this._minimumWipeSdkVersion;
    }
    /**
     * Gets the protectInboundDataFromUnknownSources property value. Protect incoming data from unknown source. This setting is only allowed to be True when AllowedInboundDataTransferSources is set to AllApps. (iOS Only)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getProtectInboundDataFromUnknownSources() {
        return this._protectInboundDataFromUnknownSources;
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
     * Gets the screenCaptureBlocked property value. Indicates whether screen capture is blocked. (Android only)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getScreenCaptureBlocked() {
        return this._screenCaptureBlocked;
    }
    /**
     * Gets the thirdPartyKeyboardsBlocked property value. Defines if third party keyboards are allowed while accessing a managed app. (iOS Only)
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getThirdPartyKeyboardsBlocked() {
        return this._thirdPartyKeyboardsBlocked;
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
        writer.writeStringValue("allowedIosDeviceModels", this.getAllowedIosDeviceModels());
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
        writer.writeStringValue("minimumRequiredCompanyPortalVersion", this.getMinimumRequiredCompanyPortalVersion());
        writer.writeStringValue("minimumRequiredPatchVersion", this.getMinimumRequiredPatchVersion());
        writer.writeStringValue("minimumRequiredSdkVersion", this.getMinimumRequiredSdkVersion());
        writer.writeStringValue("minimumWarningCompanyPortalVersion", this.getMinimumWarningCompanyPortalVersion());
        writer.writeStringValue("minimumWarningPatchVersion", this.getMinimumWarningPatchVersion());
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
     * @return a void
     */
    public void setAllowedAndroidDeviceManufacturers(@javax.annotation.Nullable final String value) {
        this._allowedAndroidDeviceManufacturers = value;
    }
    /**
     * Sets the allowedAndroidDeviceModels property value. List of device models allowed, as a string, for the managed app to work. (Android Only)
     * @param value Value to set for the allowedAndroidDeviceModels property.
     * @return a void
     */
    public void setAllowedAndroidDeviceModels(@javax.annotation.Nullable final java.util.List<String> value) {
        this._allowedAndroidDeviceModels = value;
    }
    /**
     * Sets the allowedIosDeviceModels property value. Semicolon seperated list of device models allowed, as a string, for the managed app to work. (iOS Only)
     * @param value Value to set for the allowedIosDeviceModels property.
     * @return a void
     */
    public void setAllowedIosDeviceModels(@javax.annotation.Nullable final String value) {
        this._allowedIosDeviceModels = value;
    }
    /**
     * Sets the appActionIfAndroidDeviceManufacturerNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfAndroidDeviceManufacturerNotAllowed property.
     * @return a void
     */
    public void setAppActionIfAndroidDeviceManufacturerNotAllowed(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfAndroidDeviceManufacturerNotAllowed = value;
    }
    /**
     * Sets the appActionIfAndroidDeviceModelNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfAndroidDeviceModelNotAllowed property.
     * @return a void
     */
    public void setAppActionIfAndroidDeviceModelNotAllowed(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfAndroidDeviceModelNotAllowed = value;
    }
    /**
     * Sets the appActionIfAndroidSafetyNetAppsVerificationFailed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfAndroidSafetyNetAppsVerificationFailed property.
     * @return a void
     */
    public void setAppActionIfAndroidSafetyNetAppsVerificationFailed(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfAndroidSafetyNetAppsVerificationFailed = value;
    }
    /**
     * Sets the appActionIfAndroidSafetyNetDeviceAttestationFailed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfAndroidSafetyNetDeviceAttestationFailed property.
     * @return a void
     */
    public void setAppActionIfAndroidSafetyNetDeviceAttestationFailed(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfAndroidSafetyNetDeviceAttestationFailed = value;
    }
    /**
     * Sets the appActionIfDeviceLockNotSet property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfDeviceLockNotSet property.
     * @return a void
     */
    public void setAppActionIfDeviceLockNotSet(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfDeviceLockNotSet = value;
    }
    /**
     * Sets the appActionIfDevicePasscodeComplexityLessThanHigh property value. If the device does not have a passcode of high complexity or higher, trigger the stored action. Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanHigh property.
     * @return a void
     */
    public void setAppActionIfDevicePasscodeComplexityLessThanHigh(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfDevicePasscodeComplexityLessThanHigh = value;
    }
    /**
     * Sets the appActionIfDevicePasscodeComplexityLessThanLow property value. If the device does not have a passcode of low complexity or higher, trigger the stored action. Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanLow property.
     * @return a void
     */
    public void setAppActionIfDevicePasscodeComplexityLessThanLow(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfDevicePasscodeComplexityLessThanLow = value;
    }
    /**
     * Sets the appActionIfDevicePasscodeComplexityLessThanMedium property value. If the device does not have a passcode of medium complexity or higher, trigger the stored action. Possible values are: block, wipe, warn.
     * @param value Value to set for the appActionIfDevicePasscodeComplexityLessThanMedium property.
     * @return a void
     */
    public void setAppActionIfDevicePasscodeComplexityLessThanMedium(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfDevicePasscodeComplexityLessThanMedium = value;
    }
    /**
     * Sets the appActionIfIosDeviceModelNotAllowed property value. An admin initiated action to be applied on a managed app.
     * @param value Value to set for the appActionIfIosDeviceModelNotAllowed property.
     * @return a void
     */
    public void setAppActionIfIosDeviceModelNotAllowed(@javax.annotation.Nullable final ManagedAppRemediationAction value) {
        this._appActionIfIosDeviceModelNotAllowed = value;
    }
    /**
     * Sets the appDataEncryptionType property value. Represents the level to which app data is encrypted for managed apps
     * @param value Value to set for the appDataEncryptionType property.
     * @return a void
     */
    public void setAppDataEncryptionType(@javax.annotation.Nullable final ManagedAppDataEncryptionType value) {
        this._appDataEncryptionType = value;
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
     * Sets the biometricAuthenticationBlocked property value. Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True. (Android Only)
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
     * Sets the connectToVpnOnLaunch property value. Whether the app should connect to the configured VPN on launch (Android only).
     * @param value Value to set for the connectToVpnOnLaunch property.
     * @return a void
     */
    public void setConnectToVpnOnLaunch(@javax.annotation.Nullable final Boolean value) {
        this._connectToVpnOnLaunch = value;
    }
    /**
     * Sets the customBrowserDisplayName property value. Friendly name of the preferred custom browser to open weblink on Android. (Android only)
     * @param value Value to set for the customBrowserDisplayName property.
     * @return a void
     */
    public void setCustomBrowserDisplayName(@javax.annotation.Nullable final String value) {
        this._customBrowserDisplayName = value;
    }
    /**
     * Sets the customBrowserPackageId property value. Unique identifier of a custom browser to open weblink on Android. (Android only)
     * @param value Value to set for the customBrowserPackageId property.
     * @return a void
     */
    public void setCustomBrowserPackageId(@javax.annotation.Nullable final String value) {
        this._customBrowserPackageId = value;
    }
    /**
     * Sets the customBrowserProtocol property value. A custom browser protocol to open weblink on iOS. (iOS only)
     * @param value Value to set for the customBrowserProtocol property.
     * @return a void
     */
    public void setCustomBrowserProtocol(@javax.annotation.Nullable final String value) {
        this._customBrowserProtocol = value;
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
     * Sets the customDialerAppProtocol property value. Protocol of a custom dialer app to click-to-open a phone number on iOS, for example, skype:.
     * @param value Value to set for the customDialerAppProtocol property.
     * @return a void
     */
    public void setCustomDialerAppProtocol(@javax.annotation.Nullable final String value) {
        this._customDialerAppProtocol = value;
    }
    /**
     * Sets the customSettings property value. A set of string key and string value pairs to be sent to the affected users, unalterned by this service
     * @param value Value to set for the customSettings property.
     * @return a void
     */
    public void setCustomSettings(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._customSettings = value;
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
     * Sets the deviceLockRequired property value. Defines if any kind of lock must be required on device. (android only)
     * @param value Value to set for the deviceLockRequired property.
     * @return a void
     */
    public void setDeviceLockRequired(@javax.annotation.Nullable final Boolean value) {
        this._deviceLockRequired = value;
    }
    /**
     * Sets the disableAppEncryptionIfDeviceEncryptionIsEnabled property value. When this setting is enabled, app level encryption is disabled if device level encryption is enabled. (Android only)
     * @param value Value to set for the disableAppEncryptionIfDeviceEncryptionIsEnabled property.
     * @return a void
     */
    public void setDisableAppEncryptionIfDeviceEncryptionIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._disableAppEncryptionIfDeviceEncryptionIsEnabled = value;
    }
    /**
     * Sets the disableProtectionOfManagedOutboundOpenInData property value. Disable protection of data transferred to other apps through IOS OpenIn option. This setting is only allowed to be True when AllowedOutboundDataTransferDestinations is set to ManagedApps. (iOS Only)
     * @param value Value to set for the disableProtectionOfManagedOutboundOpenInData property.
     * @return a void
     */
    public void setDisableProtectionOfManagedOutboundOpenInData(@javax.annotation.Nullable final Boolean value) {
        this._disableProtectionOfManagedOutboundOpenInData = value;
    }
    /**
     * Sets the encryptAppData property value. Indicates whether managed-app data should be encrypted. (Android only)
     * @param value Value to set for the encryptAppData property.
     * @return a void
     */
    public void setEncryptAppData(@javax.annotation.Nullable final Boolean value) {
        this._encryptAppData = value;
    }
    /**
     * Sets the exemptedAppPackages property value. Android App packages in this list will be exempt from the policy and will be able to receive data from managed apps. (Android only)
     * @param value Value to set for the exemptedAppPackages property.
     * @return a void
     */
    public void setExemptedAppPackages(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._exemptedAppPackages = value;
    }
    /**
     * Sets the exemptedAppProtocols property value. iOS Apps in this list will be exempt from the policy and will be able to receive data from managed apps. (iOS Only)
     * @param value Value to set for the exemptedAppProtocols property.
     * @return a void
     */
    public void setExemptedAppProtocols(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._exemptedAppProtocols = value;
    }
    /**
     * Sets the faceIdBlocked property value. Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. (iOS Only)
     * @param value Value to set for the faceIdBlocked property.
     * @return a void
     */
    public void setFaceIdBlocked(@javax.annotation.Nullable final Boolean value) {
        this._faceIdBlocked = value;
    }
    /**
     * Sets the filterOpenInToOnlyManagedApps property value. Defines if open-in operation is supported from the managed app to the filesharing locations selected. This setting only applies when AllowedOutboundDataTransferDestinations is set to ManagedApps and DisableProtectionOfManagedOutboundOpenInData is set to False. (iOS Only)
     * @param value Value to set for the filterOpenInToOnlyManagedApps property.
     * @return a void
     */
    public void setFilterOpenInToOnlyManagedApps(@javax.annotation.Nullable final Boolean value) {
        this._filterOpenInToOnlyManagedApps = value;
    }
    /**
     * Sets the fingerprintAndBiometricEnabled property value. Indicate to the client to enable both biometrics and fingerprints for the app.
     * @param value Value to set for the fingerprintAndBiometricEnabled property.
     * @return a void
     */
    public void setFingerprintAndBiometricEnabled(@javax.annotation.Nullable final Boolean value) {
        this._fingerprintAndBiometricEnabled = value;
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
     * Sets the minimumRequiredPatchVersion property value. Define the oldest required Android security patch level a user can have to gain secure access to the app. (Android only)
     * @param value Value to set for the minimumRequiredPatchVersion property.
     * @return a void
     */
    public void setMinimumRequiredPatchVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredPatchVersion = value;
    }
    /**
     * Sets the minimumRequiredSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data. (iOS Only)
     * @param value Value to set for the minimumRequiredSdkVersion property.
     * @return a void
     */
    public void setMinimumRequiredSdkVersion(@javax.annotation.Nullable final String value) {
        this._minimumRequiredSdkVersion = value;
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
     * Sets the minimumWarningPatchVersion property value. Define the oldest recommended Android security patch level a user can have for secure access to the app. (Android only)
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
     * Sets the minimumWipePatchVersion property value. Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data. (Android only)
     * @param value Value to set for the minimumWipePatchVersion property.
     * @return a void
     */
    public void setMinimumWipePatchVersion(@javax.annotation.Nullable final String value) {
        this._minimumWipePatchVersion = value;
    }
    /**
     * Sets the minimumWipeSdkVersion property value. Versions less than the specified version will block the managed app from accessing company data.
     * @param value Value to set for the minimumWipeSdkVersion property.
     * @return a void
     */
    public void setMinimumWipeSdkVersion(@javax.annotation.Nullable final String value) {
        this._minimumWipeSdkVersion = value;
    }
    /**
     * Sets the protectInboundDataFromUnknownSources property value. Protect incoming data from unknown source. This setting is only allowed to be True when AllowedInboundDataTransferSources is set to AllApps. (iOS Only)
     * @param value Value to set for the protectInboundDataFromUnknownSources property.
     * @return a void
     */
    public void setProtectInboundDataFromUnknownSources(@javax.annotation.Nullable final Boolean value) {
        this._protectInboundDataFromUnknownSources = value;
    }
    /**
     * Sets the requireClass3Biometrics property value. Require user to apply Class 3 Biometrics on their Android device.
     * @param value Value to set for the requireClass3Biometrics property.
     * @return a void
     */
    public void setRequireClass3Biometrics(@javax.annotation.Nullable final Boolean value) {
        this._requireClass3Biometrics = value;
    }
    /**
     * Sets the requiredAndroidSafetyNetAppsVerificationType property value. An admin enforced Android SafetyNet Device Attestation requirement on a managed app.
     * @param value Value to set for the requiredAndroidSafetyNetAppsVerificationType property.
     * @return a void
     */
    public void setRequiredAndroidSafetyNetAppsVerificationType(@javax.annotation.Nullable final AndroidManagedAppSafetyNetAppsVerificationType value) {
        this._requiredAndroidSafetyNetAppsVerificationType = value;
    }
    /**
     * Sets the requiredAndroidSafetyNetDeviceAttestationType property value. An admin enforced Android SafetyNet Device Attestation requirement on a managed app.
     * @param value Value to set for the requiredAndroidSafetyNetDeviceAttestationType property.
     * @return a void
     */
    public void setRequiredAndroidSafetyNetDeviceAttestationType(@javax.annotation.Nullable final AndroidManagedAppSafetyNetDeviceAttestationType value) {
        this._requiredAndroidSafetyNetDeviceAttestationType = value;
    }
    /**
     * Sets the requiredAndroidSafetyNetEvaluationType property value. An admin enforced Android SafetyNet evaluation type requirement on a managed app.
     * @param value Value to set for the requiredAndroidSafetyNetEvaluationType property.
     * @return a void
     */
    public void setRequiredAndroidSafetyNetEvaluationType(@javax.annotation.Nullable final AndroidManagedAppSafetyNetEvaluationType value) {
        this._requiredAndroidSafetyNetEvaluationType = value;
    }
    /**
     * Sets the requirePinAfterBiometricChange property value. A PIN prompt will override biometric prompts if class 3 biometrics are updated on the device.
     * @param value Value to set for the requirePinAfterBiometricChange property.
     * @return a void
     */
    public void setRequirePinAfterBiometricChange(@javax.annotation.Nullable final Boolean value) {
        this._requirePinAfterBiometricChange = value;
    }
    /**
     * Sets the screenCaptureBlocked property value. Indicates whether screen capture is blocked. (Android only)
     * @param value Value to set for the screenCaptureBlocked property.
     * @return a void
     */
    public void setScreenCaptureBlocked(@javax.annotation.Nullable final Boolean value) {
        this._screenCaptureBlocked = value;
    }
    /**
     * Sets the thirdPartyKeyboardsBlocked property value. Defines if third party keyboards are allowed while accessing a managed app. (iOS Only)
     * @param value Value to set for the thirdPartyKeyboardsBlocked property.
     * @return a void
     */
    public void setThirdPartyKeyboardsBlocked(@javax.annotation.Nullable final Boolean value) {
        this._thirdPartyKeyboardsBlocked = value;
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
