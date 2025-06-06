package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This class contains compliance settings for Android.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidCompliancePolicy extends DeviceCompliancePolicy implements Parsable {
    /**
     * Instantiates a new {@link AndroidCompliancePolicy} and sets the default values.
     */
    public AndroidCompliancePolicy() {
        super();
        this.setOdataType("#microsoft.graph.androidCompliancePolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidCompliancePolicy}
     */
    @jakarta.annotation.Nonnull
    public static AndroidCompliancePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidCompliancePolicy();
    }
    /**
     * Gets the advancedThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @return a {@link DeviceThreatProtectionLevel}
     */
    @jakarta.annotation.Nullable
    public DeviceThreatProtectionLevel getAdvancedThreatProtectionRequiredSecurityLevel() {
        return this.backingStore.get("advancedThreatProtectionRequiredSecurityLevel");
    }
    /**
     * Gets the conditionStatementId property value. Condition statement id.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionStatementId() {
        return this.backingStore.get("conditionStatementId");
    }
    /**
     * Gets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceThreatProtectionEnabled() {
        return this.backingStore.get("deviceThreatProtectionEnabled");
    }
    /**
     * Gets the deviceThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @return a {@link DeviceThreatProtectionLevel}
     */
    @jakarta.annotation.Nullable
    public DeviceThreatProtectionLevel getDeviceThreatProtectionRequiredSecurityLevel() {
        return this.backingStore.get("deviceThreatProtectionRequiredSecurityLevel");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("advancedThreatProtectionRequiredSecurityLevel", (n) -> { this.setAdvancedThreatProtectionRequiredSecurityLevel(n.getEnumValue(DeviceThreatProtectionLevel::forValue)); });
        deserializerMap.put("conditionStatementId", (n) -> { this.setConditionStatementId(n.getStringValue()); });
        deserializerMap.put("deviceThreatProtectionEnabled", (n) -> { this.setDeviceThreatProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("deviceThreatProtectionRequiredSecurityLevel", (n) -> { this.setDeviceThreatProtectionRequiredSecurityLevel(n.getEnumValue(DeviceThreatProtectionLevel::forValue)); });
        deserializerMap.put("minAndroidSecurityPatchLevel", (n) -> { this.setMinAndroidSecurityPatchLevel(n.getStringValue()); });
        deserializerMap.put("osMaximumVersion", (n) -> { this.setOsMaximumVersion(n.getStringValue()); });
        deserializerMap.put("osMinimumVersion", (n) -> { this.setOsMinimumVersion(n.getStringValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeLock", (n) -> { this.setPasswordMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequired", (n) -> { this.setPasswordRequired(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(AndroidRequiredPasswordType::forValue)); });
        deserializerMap.put("passwordSignInFailureCountBeforeFactoryReset", (n) -> { this.setPasswordSignInFailureCountBeforeFactoryReset(n.getIntegerValue()); });
        deserializerMap.put("requiredPasswordComplexity", (n) -> { this.setRequiredPasswordComplexity(n.getEnumValue(AndroidRequiredPasswordComplexity::forValue)); });
        deserializerMap.put("restrictedApps", (n) -> { this.setRestrictedApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("securityBlockDeviceAdministratorManagedDevices", (n) -> { this.setSecurityBlockDeviceAdministratorManagedDevices(n.getBooleanValue()); });
        deserializerMap.put("securityBlockJailbrokenDevices", (n) -> { this.setSecurityBlockJailbrokenDevices(n.getBooleanValue()); });
        deserializerMap.put("securityDisableUsbDebugging", (n) -> { this.setSecurityDisableUsbDebugging(n.getBooleanValue()); });
        deserializerMap.put("securityPreventInstallAppsFromUnknownSources", (n) -> { this.setSecurityPreventInstallAppsFromUnknownSources(n.getBooleanValue()); });
        deserializerMap.put("securityRequireCompanyPortalAppIntegrity", (n) -> { this.setSecurityRequireCompanyPortalAppIntegrity(n.getBooleanValue()); });
        deserializerMap.put("securityRequireGooglePlayServices", (n) -> { this.setSecurityRequireGooglePlayServices(n.getBooleanValue()); });
        deserializerMap.put("securityRequireSafetyNetAttestationBasicIntegrity", (n) -> { this.setSecurityRequireSafetyNetAttestationBasicIntegrity(n.getBooleanValue()); });
        deserializerMap.put("securityRequireSafetyNetAttestationCertifiedDevice", (n) -> { this.setSecurityRequireSafetyNetAttestationCertifiedDevice(n.getBooleanValue()); });
        deserializerMap.put("securityRequireUpToDateSecurityProviders", (n) -> { this.setSecurityRequireUpToDateSecurityProviders(n.getBooleanValue()); });
        deserializerMap.put("securityRequireVerifyApps", (n) -> { this.setSecurityRequireVerifyApps(n.getBooleanValue()); });
        deserializerMap.put("storageRequireEncryption", (n) -> { this.setStorageRequireEncryption(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the minAndroidSecurityPatchLevel property value. Minimum Android security patch level.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinAndroidSecurityPatchLevel() {
        return this.backingStore.get("minAndroidSecurityPatchLevel");
    }
    /**
     * Gets the osMaximumVersion property value. Maximum Android version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsMaximumVersion() {
        return this.backingStore.get("osMaximumVersion");
    }
    /**
     * Gets the osMinimumVersion property value. Minimum Android version.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsMinimumVersion() {
        return this.backingStore.get("osMinimumVersion");
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.backingStore.get("passwordExpirationDays");
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum password length. Valid values 4 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.backingStore.get("passwordMinimumLength");
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeLock() {
        return this.backingStore.get("passwordMinutesOfInactivityBeforeLock");
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 1 to 24
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.backingStore.get("passwordPreviousPasswordBlockCount");
    }
    /**
     * Gets the passwordRequired property value. Require a password to unlock device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.backingStore.get("passwordRequired");
    }
    /**
     * Gets the passwordRequiredType property value. Android required password type.
     * @return a {@link AndroidRequiredPasswordType}
     */
    @jakarta.annotation.Nullable
    public AndroidRequiredPasswordType getPasswordRequiredType() {
        return this.backingStore.get("passwordRequiredType");
    }
    /**
     * Gets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign-in failures allowed before factory reset. Valid values 1 to 16
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordSignInFailureCountBeforeFactoryReset() {
        return this.backingStore.get("passwordSignInFailureCountBeforeFactoryReset");
    }
    /**
     * Gets the requiredPasswordComplexity property value. The password complexity types that can be set on Android. One of: NONE, LOW, MEDIUM, HIGH. This is an API targeted to Android 11+.
     * @return a {@link AndroidRequiredPasswordComplexity}
     */
    @jakarta.annotation.Nullable
    public AndroidRequiredPasswordComplexity getRequiredPasswordComplexity() {
        return this.backingStore.get("requiredPasswordComplexity");
    }
    /**
     * Gets the restrictedApps property value. Require the device to not have the specified apps installed. This collection can contain a maximum of 100 elements.
     * @return a {@link java.util.List<AppListItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getRestrictedApps() {
        return this.backingStore.get("restrictedApps");
    }
    /**
     * Gets the securityBlockDeviceAdministratorManagedDevices property value. Block device administrator managed devices.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityBlockDeviceAdministratorManagedDevices() {
        return this.backingStore.get("securityBlockDeviceAdministratorManagedDevices");
    }
    /**
     * Gets the securityBlockJailbrokenDevices property value. Indicates the device should not be rooted. When TRUE, if the device is detected as rooted it will be reported non-compliant. When FALSE, the device is not reported as non-compliant regardless of device rooted state. Default is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityBlockJailbrokenDevices() {
        return this.backingStore.get("securityBlockJailbrokenDevices");
    }
    /**
     * Gets the securityDisableUsbDebugging property value. Disable USB debugging on Android devices.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityDisableUsbDebugging() {
        return this.backingStore.get("securityDisableUsbDebugging");
    }
    /**
     * Gets the securityPreventInstallAppsFromUnknownSources property value. Require that devices disallow installation of apps from unknown sources.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityPreventInstallAppsFromUnknownSources() {
        return this.backingStore.get("securityPreventInstallAppsFromUnknownSources");
    }
    /**
     * Gets the securityRequireCompanyPortalAppIntegrity property value. Require the device to pass the Company Portal client app runtime integrity check.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityRequireCompanyPortalAppIntegrity() {
        return this.backingStore.get("securityRequireCompanyPortalAppIntegrity");
    }
    /**
     * Gets the securityRequireGooglePlayServices property value. Require Google Play Services to be installed and enabled on the device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityRequireGooglePlayServices() {
        return this.backingStore.get("securityRequireGooglePlayServices");
    }
    /**
     * Gets the securityRequireSafetyNetAttestationBasicIntegrity property value. Require the device to pass the SafetyNet basic integrity check.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityRequireSafetyNetAttestationBasicIntegrity() {
        return this.backingStore.get("securityRequireSafetyNetAttestationBasicIntegrity");
    }
    /**
     * Gets the securityRequireSafetyNetAttestationCertifiedDevice property value. Require the device to pass the SafetyNet certified device check.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityRequireSafetyNetAttestationCertifiedDevice() {
        return this.backingStore.get("securityRequireSafetyNetAttestationCertifiedDevice");
    }
    /**
     * Gets the securityRequireUpToDateSecurityProviders property value. Require the device to have up to date security providers. The device will require Google Play Services to be enabled and up to date.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityRequireUpToDateSecurityProviders() {
        return this.backingStore.get("securityRequireUpToDateSecurityProviders");
    }
    /**
     * Gets the securityRequireVerifyApps property value. Require the Android Verify apps feature is turned on.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityRequireVerifyApps() {
        return this.backingStore.get("securityRequireVerifyApps");
    }
    /**
     * Gets the storageRequireEncryption property value. Require encryption on Android devices.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageRequireEncryption() {
        return this.backingStore.get("storageRequireEncryption");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("advancedThreatProtectionRequiredSecurityLevel", this.getAdvancedThreatProtectionRequiredSecurityLevel());
        writer.writeStringValue("conditionStatementId", this.getConditionStatementId());
        writer.writeBooleanValue("deviceThreatProtectionEnabled", this.getDeviceThreatProtectionEnabled());
        writer.writeEnumValue("deviceThreatProtectionRequiredSecurityLevel", this.getDeviceThreatProtectionRequiredSecurityLevel());
        writer.writeStringValue("minAndroidSecurityPatchLevel", this.getMinAndroidSecurityPatchLevel());
        writer.writeStringValue("osMaximumVersion", this.getOsMaximumVersion());
        writer.writeStringValue("osMinimumVersion", this.getOsMinimumVersion());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeLock", this.getPasswordMinutesOfInactivityBeforeLock());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeBooleanValue("passwordRequired", this.getPasswordRequired());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeIntegerValue("passwordSignInFailureCountBeforeFactoryReset", this.getPasswordSignInFailureCountBeforeFactoryReset());
        writer.writeEnumValue("requiredPasswordComplexity", this.getRequiredPasswordComplexity());
        writer.writeCollectionOfObjectValues("restrictedApps", this.getRestrictedApps());
        writer.writeBooleanValue("securityBlockDeviceAdministratorManagedDevices", this.getSecurityBlockDeviceAdministratorManagedDevices());
        writer.writeBooleanValue("securityBlockJailbrokenDevices", this.getSecurityBlockJailbrokenDevices());
        writer.writeBooleanValue("securityDisableUsbDebugging", this.getSecurityDisableUsbDebugging());
        writer.writeBooleanValue("securityPreventInstallAppsFromUnknownSources", this.getSecurityPreventInstallAppsFromUnknownSources());
        writer.writeBooleanValue("securityRequireCompanyPortalAppIntegrity", this.getSecurityRequireCompanyPortalAppIntegrity());
        writer.writeBooleanValue("securityRequireGooglePlayServices", this.getSecurityRequireGooglePlayServices());
        writer.writeBooleanValue("securityRequireSafetyNetAttestationBasicIntegrity", this.getSecurityRequireSafetyNetAttestationBasicIntegrity());
        writer.writeBooleanValue("securityRequireSafetyNetAttestationCertifiedDevice", this.getSecurityRequireSafetyNetAttestationCertifiedDevice());
        writer.writeBooleanValue("securityRequireUpToDateSecurityProviders", this.getSecurityRequireUpToDateSecurityProviders());
        writer.writeBooleanValue("securityRequireVerifyApps", this.getSecurityRequireVerifyApps());
        writer.writeBooleanValue("storageRequireEncryption", this.getStorageRequireEncryption());
    }
    /**
     * Sets the advancedThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @param value Value to set for the advancedThreatProtectionRequiredSecurityLevel property.
     */
    public void setAdvancedThreatProtectionRequiredSecurityLevel(@jakarta.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this.backingStore.set("advancedThreatProtectionRequiredSecurityLevel", value);
    }
    /**
     * Sets the conditionStatementId property value. Condition statement id.
     * @param value Value to set for the conditionStatementId property.
     */
    public void setConditionStatementId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("conditionStatementId", value);
    }
    /**
     * Sets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection.
     * @param value Value to set for the deviceThreatProtectionEnabled property.
     */
    public void setDeviceThreatProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceThreatProtectionEnabled", value);
    }
    /**
     * Sets the deviceThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @param value Value to set for the deviceThreatProtectionRequiredSecurityLevel property.
     */
    public void setDeviceThreatProtectionRequiredSecurityLevel(@jakarta.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this.backingStore.set("deviceThreatProtectionRequiredSecurityLevel", value);
    }
    /**
     * Sets the minAndroidSecurityPatchLevel property value. Minimum Android security patch level.
     * @param value Value to set for the minAndroidSecurityPatchLevel property.
     */
    public void setMinAndroidSecurityPatchLevel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("minAndroidSecurityPatchLevel", value);
    }
    /**
     * Sets the osMaximumVersion property value. Maximum Android version.
     * @param value Value to set for the osMaximumVersion property.
     */
    public void setOsMaximumVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osMaximumVersion", value);
    }
    /**
     * Sets the osMinimumVersion property value. Minimum Android version.
     * @param value Value to set for the osMinimumVersion property.
     */
    public void setOsMinimumVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osMinimumVersion", value);
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordExpirationDays", value);
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum password length. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinimumLength", value);
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeLock property.
     */
    public void setPasswordMinutesOfInactivityBeforeLock(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinutesOfInactivityBeforeLock", value);
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 1 to 24
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordPreviousPasswordBlockCount", value);
    }
    /**
     * Sets the passwordRequired property value. Require a password to unlock device.
     * @param value Value to set for the passwordRequired property.
     */
    public void setPasswordRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordRequired", value);
    }
    /**
     * Sets the passwordRequiredType property value. Android required password type.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final AndroidRequiredPasswordType value) {
        this.backingStore.set("passwordRequiredType", value);
    }
    /**
     * Sets the passwordSignInFailureCountBeforeFactoryReset property value. Number of sign-in failures allowed before factory reset. Valid values 1 to 16
     * @param value Value to set for the passwordSignInFailureCountBeforeFactoryReset property.
     */
    public void setPasswordSignInFailureCountBeforeFactoryReset(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordSignInFailureCountBeforeFactoryReset", value);
    }
    /**
     * Sets the requiredPasswordComplexity property value. The password complexity types that can be set on Android. One of: NONE, LOW, MEDIUM, HIGH. This is an API targeted to Android 11+.
     * @param value Value to set for the requiredPasswordComplexity property.
     */
    public void setRequiredPasswordComplexity(@jakarta.annotation.Nullable final AndroidRequiredPasswordComplexity value) {
        this.backingStore.set("requiredPasswordComplexity", value);
    }
    /**
     * Sets the restrictedApps property value. Require the device to not have the specified apps installed. This collection can contain a maximum of 100 elements.
     * @param value Value to set for the restrictedApps property.
     */
    public void setRestrictedApps(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.backingStore.set("restrictedApps", value);
    }
    /**
     * Sets the securityBlockDeviceAdministratorManagedDevices property value. Block device administrator managed devices.
     * @param value Value to set for the securityBlockDeviceAdministratorManagedDevices property.
     */
    public void setSecurityBlockDeviceAdministratorManagedDevices(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityBlockDeviceAdministratorManagedDevices", value);
    }
    /**
     * Sets the securityBlockJailbrokenDevices property value. Indicates the device should not be rooted. When TRUE, if the device is detected as rooted it will be reported non-compliant. When FALSE, the device is not reported as non-compliant regardless of device rooted state. Default is FALSE.
     * @param value Value to set for the securityBlockJailbrokenDevices property.
     */
    public void setSecurityBlockJailbrokenDevices(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityBlockJailbrokenDevices", value);
    }
    /**
     * Sets the securityDisableUsbDebugging property value. Disable USB debugging on Android devices.
     * @param value Value to set for the securityDisableUsbDebugging property.
     */
    public void setSecurityDisableUsbDebugging(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityDisableUsbDebugging", value);
    }
    /**
     * Sets the securityPreventInstallAppsFromUnknownSources property value. Require that devices disallow installation of apps from unknown sources.
     * @param value Value to set for the securityPreventInstallAppsFromUnknownSources property.
     */
    public void setSecurityPreventInstallAppsFromUnknownSources(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityPreventInstallAppsFromUnknownSources", value);
    }
    /**
     * Sets the securityRequireCompanyPortalAppIntegrity property value. Require the device to pass the Company Portal client app runtime integrity check.
     * @param value Value to set for the securityRequireCompanyPortalAppIntegrity property.
     */
    public void setSecurityRequireCompanyPortalAppIntegrity(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityRequireCompanyPortalAppIntegrity", value);
    }
    /**
     * Sets the securityRequireGooglePlayServices property value. Require Google Play Services to be installed and enabled on the device.
     * @param value Value to set for the securityRequireGooglePlayServices property.
     */
    public void setSecurityRequireGooglePlayServices(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityRequireGooglePlayServices", value);
    }
    /**
     * Sets the securityRequireSafetyNetAttestationBasicIntegrity property value. Require the device to pass the SafetyNet basic integrity check.
     * @param value Value to set for the securityRequireSafetyNetAttestationBasicIntegrity property.
     */
    public void setSecurityRequireSafetyNetAttestationBasicIntegrity(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityRequireSafetyNetAttestationBasicIntegrity", value);
    }
    /**
     * Sets the securityRequireSafetyNetAttestationCertifiedDevice property value. Require the device to pass the SafetyNet certified device check.
     * @param value Value to set for the securityRequireSafetyNetAttestationCertifiedDevice property.
     */
    public void setSecurityRequireSafetyNetAttestationCertifiedDevice(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityRequireSafetyNetAttestationCertifiedDevice", value);
    }
    /**
     * Sets the securityRequireUpToDateSecurityProviders property value. Require the device to have up to date security providers. The device will require Google Play Services to be enabled and up to date.
     * @param value Value to set for the securityRequireUpToDateSecurityProviders property.
     */
    public void setSecurityRequireUpToDateSecurityProviders(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityRequireUpToDateSecurityProviders", value);
    }
    /**
     * Sets the securityRequireVerifyApps property value. Require the Android Verify apps feature is turned on.
     * @param value Value to set for the securityRequireVerifyApps property.
     */
    public void setSecurityRequireVerifyApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityRequireVerifyApps", value);
    }
    /**
     * Sets the storageRequireEncryption property value. Require encryption on Android devices.
     * @param value Value to set for the storageRequireEncryption property.
     */
    public void setStorageRequireEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageRequireEncryption", value);
    }
}
