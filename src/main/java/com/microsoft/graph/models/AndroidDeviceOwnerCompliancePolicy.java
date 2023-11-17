package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the AndroidDeviceOwnerCompliancePolicy resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceOwnerCompliancePolicy extends DeviceCompliancePolicy implements Parsable {
    /**
     * Instantiates a new AndroidDeviceOwnerCompliancePolicy and sets the default values.
     */
    public AndroidDeviceOwnerCompliancePolicy() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceOwnerCompliancePolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceOwnerCompliancePolicy
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerCompliancePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerCompliancePolicy();
    }
    /**
     * Gets the advancedThreatProtectionRequiredSecurityLevel property value. MDATP Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     * @return a DeviceThreatProtectionLevel
     */
    @jakarta.annotation.Nullable
    public DeviceThreatProtectionLevel getAdvancedThreatProtectionRequiredSecurityLevel() {
        return this.backingStore.get("advancedThreatProtectionRequiredSecurityLevel");
    }
    /**
     * Gets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceThreatProtectionEnabled() {
        return this.backingStore.get("deviceThreatProtectionEnabled");
    }
    /**
     * Gets the deviceThreatProtectionRequiredSecurityLevel property value. Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     * @return a DeviceThreatProtectionLevel
     */
    @jakarta.annotation.Nullable
    public DeviceThreatProtectionLevel getDeviceThreatProtectionRequiredSecurityLevel() {
        return this.backingStore.get("deviceThreatProtectionRequiredSecurityLevel");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("advancedThreatProtectionRequiredSecurityLevel", (n) -> { this.setAdvancedThreatProtectionRequiredSecurityLevel(n.getEnumValue(DeviceThreatProtectionLevel.class)); });
        deserializerMap.put("deviceThreatProtectionEnabled", (n) -> { this.setDeviceThreatProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("deviceThreatProtectionRequiredSecurityLevel", (n) -> { this.setDeviceThreatProtectionRequiredSecurityLevel(n.getEnumValue(DeviceThreatProtectionLevel.class)); });
        deserializerMap.put("minAndroidSecurityPatchLevel", (n) -> { this.setMinAndroidSecurityPatchLevel(n.getStringValue()); });
        deserializerMap.put("osMaximumVersion", (n) -> { this.setOsMaximumVersion(n.getStringValue()); });
        deserializerMap.put("osMinimumVersion", (n) -> { this.setOsMinimumVersion(n.getStringValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLetterCharacters", (n) -> { this.setPasswordMinimumLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLowerCaseCharacters", (n) -> { this.setPasswordMinimumLowerCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumNonLetterCharacters", (n) -> { this.setPasswordMinimumNonLetterCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumNumericCharacters", (n) -> { this.setPasswordMinimumNumericCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumSymbolCharacters", (n) -> { this.setPasswordMinimumSymbolCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumUpperCaseCharacters", (n) -> { this.setPasswordMinimumUpperCaseCharacters(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeLock", (n) -> { this.setPasswordMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordCountToBlock", (n) -> { this.setPasswordPreviousPasswordCountToBlock(n.getIntegerValue()); });
        deserializerMap.put("passwordRequired", (n) -> { this.setPasswordRequired(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordType.class)); });
        deserializerMap.put("requireNoPendingSystemUpdates", (n) -> { this.setRequireNoPendingSystemUpdates(n.getBooleanValue()); });
        deserializerMap.put("securityRequireIntuneAppIntegrity", (n) -> { this.setSecurityRequireIntuneAppIntegrity(n.getBooleanValue()); });
        deserializerMap.put("securityRequireSafetyNetAttestationBasicIntegrity", (n) -> { this.setSecurityRequireSafetyNetAttestationBasicIntegrity(n.getBooleanValue()); });
        deserializerMap.put("securityRequireSafetyNetAttestationCertifiedDevice", (n) -> { this.setSecurityRequireSafetyNetAttestationCertifiedDevice(n.getBooleanValue()); });
        deserializerMap.put("storageRequireEncryption", (n) -> { this.setStorageRequireEncryption(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the minAndroidSecurityPatchLevel property value. Minimum Android security patch level.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMinAndroidSecurityPatchLevel() {
        return this.backingStore.get("minAndroidSecurityPatchLevel");
    }
    /**
     * Gets the osMaximumVersion property value. Maximum Android version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsMaximumVersion() {
        return this.backingStore.get("osMaximumVersion");
    }
    /**
     * Gets the osMinimumVersion property value. Minimum Android version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsMinimumVersion() {
        return this.backingStore.get("osMinimumVersion");
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.backingStore.get("passwordExpirationDays");
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum password length. Valid values 4 to 16
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.backingStore.get("passwordMinimumLength");
    }
    /**
     * Gets the passwordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for device password. Valid values 1 to 16
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLetterCharacters() {
        return this.backingStore.get("passwordMinimumLetterCharacters");
    }
    /**
     * Gets the passwordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLowerCaseCharacters() {
        return this.backingStore.get("passwordMinimumLowerCaseCharacters");
    }
    /**
     * Gets the passwordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumNonLetterCharacters() {
        return this.backingStore.get("passwordMinimumNonLetterCharacters");
    }
    /**
     * Gets the passwordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumNumericCharacters() {
        return this.backingStore.get("passwordMinimumNumericCharacters");
    }
    /**
     * Gets the passwordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumSymbolCharacters() {
        return this.backingStore.get("passwordMinimumSymbolCharacters");
    }
    /**
     * Gets the passwordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumUpperCaseCharacters() {
        return this.backingStore.get("passwordMinimumUpperCaseCharacters");
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeLock() {
        return this.backingStore.get("passwordMinutesOfInactivityBeforeLock");
    }
    /**
     * Gets the passwordPreviousPasswordCountToBlock property value. Number of previous passwords to block. Valid values 1 to 24
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordCountToBlock() {
        return this.backingStore.get("passwordPreviousPasswordCountToBlock");
    }
    /**
     * Gets the passwordRequired property value. Require a password to unlock device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.backingStore.get("passwordRequired");
    }
    /**
     * Gets the passwordRequiredType property value. Type of characters in password. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @return a AndroidDeviceOwnerRequiredPasswordType
     */
    @jakarta.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordType getPasswordRequiredType() {
        return this.backingStore.get("passwordRequiredType");
    }
    /**
     * Gets the requireNoPendingSystemUpdates property value. Require device to have no pending Android system updates.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireNoPendingSystemUpdates() {
        return this.backingStore.get("requireNoPendingSystemUpdates");
    }
    /**
     * Gets the securityRequireIntuneAppIntegrity property value. If setting is set to true, checks that the Intune app installed on fully managed, dedicated, or corporate-owned work profile Android Enterprise enrolled devices, is the one provided by Microsoft from the Managed Google Playstore. If the check fails, the device will be reported as non-compliant.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityRequireIntuneAppIntegrity() {
        return this.backingStore.get("securityRequireIntuneAppIntegrity");
    }
    /**
     * Gets the securityRequireSafetyNetAttestationBasicIntegrity property value. Require the device to pass the SafetyNet basic integrity check.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityRequireSafetyNetAttestationBasicIntegrity() {
        return this.backingStore.get("securityRequireSafetyNetAttestationBasicIntegrity");
    }
    /**
     * Gets the securityRequireSafetyNetAttestationCertifiedDevice property value. Require the device to pass the SafetyNet certified device check.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityRequireSafetyNetAttestationCertifiedDevice() {
        return this.backingStore.get("securityRequireSafetyNetAttestationCertifiedDevice");
    }
    /**
     * Gets the storageRequireEncryption property value. Require encryption on Android devices.
     * @return a Boolean
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
        writer.writeBooleanValue("deviceThreatProtectionEnabled", this.getDeviceThreatProtectionEnabled());
        writer.writeEnumValue("deviceThreatProtectionRequiredSecurityLevel", this.getDeviceThreatProtectionRequiredSecurityLevel());
        writer.writeStringValue("minAndroidSecurityPatchLevel", this.getMinAndroidSecurityPatchLevel());
        writer.writeStringValue("osMaximumVersion", this.getOsMaximumVersion());
        writer.writeStringValue("osMinimumVersion", this.getOsMinimumVersion());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinimumLetterCharacters", this.getPasswordMinimumLetterCharacters());
        writer.writeIntegerValue("passwordMinimumLowerCaseCharacters", this.getPasswordMinimumLowerCaseCharacters());
        writer.writeIntegerValue("passwordMinimumNonLetterCharacters", this.getPasswordMinimumNonLetterCharacters());
        writer.writeIntegerValue("passwordMinimumNumericCharacters", this.getPasswordMinimumNumericCharacters());
        writer.writeIntegerValue("passwordMinimumSymbolCharacters", this.getPasswordMinimumSymbolCharacters());
        writer.writeIntegerValue("passwordMinimumUpperCaseCharacters", this.getPasswordMinimumUpperCaseCharacters());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeLock", this.getPasswordMinutesOfInactivityBeforeLock());
        writer.writeIntegerValue("passwordPreviousPasswordCountToBlock", this.getPasswordPreviousPasswordCountToBlock());
        writer.writeBooleanValue("passwordRequired", this.getPasswordRequired());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeBooleanValue("requireNoPendingSystemUpdates", this.getRequireNoPendingSystemUpdates());
        writer.writeBooleanValue("securityRequireIntuneAppIntegrity", this.getSecurityRequireIntuneAppIntegrity());
        writer.writeBooleanValue("securityRequireSafetyNetAttestationBasicIntegrity", this.getSecurityRequireSafetyNetAttestationBasicIntegrity());
        writer.writeBooleanValue("securityRequireSafetyNetAttestationCertifiedDevice", this.getSecurityRequireSafetyNetAttestationCertifiedDevice());
        writer.writeBooleanValue("storageRequireEncryption", this.getStorageRequireEncryption());
    }
    /**
     * Sets the advancedThreatProtectionRequiredSecurityLevel property value. MDATP Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     * @param value Value to set for the advancedThreatProtectionRequiredSecurityLevel property.
     */
    public void setAdvancedThreatProtectionRequiredSecurityLevel(@jakarta.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this.backingStore.set("advancedThreatProtectionRequiredSecurityLevel", value);
    }
    /**
     * Sets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection.
     * @param value Value to set for the deviceThreatProtectionEnabled property.
     */
    public void setDeviceThreatProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceThreatProtectionEnabled", value);
    }
    /**
     * Sets the deviceThreatProtectionRequiredSecurityLevel property value. Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
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
     * Sets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeLock property.
     */
    public void setPasswordMinutesOfInactivityBeforeLock(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordMinutesOfInactivityBeforeLock", value);
    }
    /**
     * Sets the passwordPreviousPasswordCountToBlock property value. Number of previous passwords to block. Valid values 1 to 24
     * @param value Value to set for the passwordPreviousPasswordCountToBlock property.
     */
    public void setPasswordPreviousPasswordCountToBlock(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passwordPreviousPasswordCountToBlock", value);
    }
    /**
     * Sets the passwordRequired property value. Require a password to unlock device.
     * @param value Value to set for the passwordRequired property.
     */
    public void setPasswordRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("passwordRequired", value);
    }
    /**
     * Sets the passwordRequiredType property value. Type of characters in password. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordType value) {
        this.backingStore.set("passwordRequiredType", value);
    }
    /**
     * Sets the requireNoPendingSystemUpdates property value. Require device to have no pending Android system updates.
     * @param value Value to set for the requireNoPendingSystemUpdates property.
     */
    public void setRequireNoPendingSystemUpdates(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requireNoPendingSystemUpdates", value);
    }
    /**
     * Sets the securityRequireIntuneAppIntegrity property value. If setting is set to true, checks that the Intune app installed on fully managed, dedicated, or corporate-owned work profile Android Enterprise enrolled devices, is the one provided by Microsoft from the Managed Google Playstore. If the check fails, the device will be reported as non-compliant.
     * @param value Value to set for the securityRequireIntuneAppIntegrity property.
     */
    public void setSecurityRequireIntuneAppIntegrity(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityRequireIntuneAppIntegrity", value);
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
     * Sets the storageRequireEncryption property value. Require encryption on Android devices.
     * @param value Value to set for the storageRequireEncryption property.
     */
    public void setStorageRequireEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("storageRequireEncryption", value);
    }
}
