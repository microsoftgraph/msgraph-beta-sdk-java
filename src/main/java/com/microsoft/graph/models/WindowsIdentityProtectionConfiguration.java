package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This entity provides descriptions of the declared methods, properties and relationships exposed by Windows Hello for Business.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsIdentityProtectionConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new WindowsIdentityProtectionConfiguration and sets the default values.
     */
    public WindowsIdentityProtectionConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsIdentityProtectionConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsIdentityProtectionConfiguration
     */
    @jakarta.annotation.Nonnull
    public static WindowsIdentityProtectionConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsIdentityProtectionConfiguration();
    }
    /**
     * Gets the enhancedAntiSpoofingForFacialFeaturesEnabled property value. Boolean value used to enable enhanced anti-spoofing for facial feature recognition on Windows Hello face authentication.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnhancedAntiSpoofingForFacialFeaturesEnabled() {
        return this.backingStore.get("enhancedAntiSpoofingForFacialFeaturesEnabled");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enhancedAntiSpoofingForFacialFeaturesEnabled", (n) -> { this.setEnhancedAntiSpoofingForFacialFeaturesEnabled(n.getBooleanValue()); });
        deserializerMap.put("pinExpirationInDays", (n) -> { this.setPinExpirationInDays(n.getIntegerValue()); });
        deserializerMap.put("pinLowercaseCharactersUsage", (n) -> { this.setPinLowercaseCharactersUsage(n.getEnumValue(ConfigurationUsage.class)); });
        deserializerMap.put("pinMaximumLength", (n) -> { this.setPinMaximumLength(n.getIntegerValue()); });
        deserializerMap.put("pinMinimumLength", (n) -> { this.setPinMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("pinPreviousBlockCount", (n) -> { this.setPinPreviousBlockCount(n.getIntegerValue()); });
        deserializerMap.put("pinRecoveryEnabled", (n) -> { this.setPinRecoveryEnabled(n.getBooleanValue()); });
        deserializerMap.put("pinSpecialCharactersUsage", (n) -> { this.setPinSpecialCharactersUsage(n.getEnumValue(ConfigurationUsage.class)); });
        deserializerMap.put("pinUppercaseCharactersUsage", (n) -> { this.setPinUppercaseCharactersUsage(n.getEnumValue(ConfigurationUsage.class)); });
        deserializerMap.put("securityDeviceRequired", (n) -> { this.setSecurityDeviceRequired(n.getBooleanValue()); });
        deserializerMap.put("unlockWithBiometricsEnabled", (n) -> { this.setUnlockWithBiometricsEnabled(n.getBooleanValue()); });
        deserializerMap.put("useCertificatesForOnPremisesAuthEnabled", (n) -> { this.setUseCertificatesForOnPremisesAuthEnabled(n.getBooleanValue()); });
        deserializerMap.put("useSecurityKeyForSignin", (n) -> { this.setUseSecurityKeyForSignin(n.getBooleanValue()); });
        deserializerMap.put("windowsHelloForBusinessBlocked", (n) -> { this.setWindowsHelloForBusinessBlocked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the pinExpirationInDays property value. Integer value specifies the period (in days) that a PIN can be used before the system requires the user to change it. Valid values are 0 to 730 inclusive. Valid values 0 to 730
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPinExpirationInDays() {
        return this.backingStore.get("pinExpirationInDays");
    }
    /**
     * Gets the pinLowercaseCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @return a ConfigurationUsage
     */
    @jakarta.annotation.Nullable
    public ConfigurationUsage getPinLowercaseCharactersUsage() {
        return this.backingStore.get("pinLowercaseCharactersUsage");
    }
    /**
     * Gets the pinMaximumLength property value. Integer value that sets the maximum number of characters allowed for the work PIN. Valid values are 4 to 127 inclusive and greater than or equal to the value set for the minimum PIN. Valid values 4 to 127
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPinMaximumLength() {
        return this.backingStore.get("pinMaximumLength");
    }
    /**
     * Gets the pinMinimumLength property value. Integer value that sets the minimum number of characters required for the Windows Hello for Business PIN. Valid values are 4 to 127 inclusive and less than or equal to the value set for the maximum PIN. Valid values 4 to 127
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPinMinimumLength() {
        return this.backingStore.get("pinMinimumLength");
    }
    /**
     * Gets the pinPreviousBlockCount property value. Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset. Valid values 0 to 50
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPinPreviousBlockCount() {
        return this.backingStore.get("pinPreviousBlockCount");
    }
    /**
     * Gets the pinRecoveryEnabled property value. Boolean value that enables a user to change their PIN by using the Windows Hello for Business PIN recovery service.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPinRecoveryEnabled() {
        return this.backingStore.get("pinRecoveryEnabled");
    }
    /**
     * Gets the pinSpecialCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @return a ConfigurationUsage
     */
    @jakarta.annotation.Nullable
    public ConfigurationUsage getPinSpecialCharactersUsage() {
        return this.backingStore.get("pinSpecialCharactersUsage");
    }
    /**
     * Gets the pinUppercaseCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @return a ConfigurationUsage
     */
    @jakarta.annotation.Nullable
    public ConfigurationUsage getPinUppercaseCharactersUsage() {
        return this.backingStore.get("pinUppercaseCharactersUsage");
    }
    /**
     * Gets the securityDeviceRequired property value. Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityDeviceRequired() {
        return this.backingStore.get("securityDeviceRequired");
    }
    /**
     * Gets the unlockWithBiometricsEnabled property value. Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUnlockWithBiometricsEnabled() {
        return this.backingStore.get("unlockWithBiometricsEnabled");
    }
    /**
     * Gets the useCertificatesForOnPremisesAuthEnabled property value. Boolean value that enables Windows Hello for Business to use certificates to authenticate on-premise resources.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseCertificatesForOnPremisesAuthEnabled() {
        return this.backingStore.get("useCertificatesForOnPremisesAuthEnabled");
    }
    /**
     * Gets the useSecurityKeyForSignin property value. Boolean value used to enable the Windows Hello security key as a logon credential.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseSecurityKeyForSignin() {
        return this.backingStore.get("useSecurityKeyForSignin");
    }
    /**
     * Gets the windowsHelloForBusinessBlocked property value. Boolean value that blocks Windows Hello for Business as a method for signing into Windows.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsHelloForBusinessBlocked() {
        return this.backingStore.get("windowsHelloForBusinessBlocked");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("enhancedAntiSpoofingForFacialFeaturesEnabled", this.getEnhancedAntiSpoofingForFacialFeaturesEnabled());
        writer.writeIntegerValue("pinExpirationInDays", this.getPinExpirationInDays());
        writer.writeEnumValue("pinLowercaseCharactersUsage", this.getPinLowercaseCharactersUsage());
        writer.writeIntegerValue("pinMaximumLength", this.getPinMaximumLength());
        writer.writeIntegerValue("pinMinimumLength", this.getPinMinimumLength());
        writer.writeIntegerValue("pinPreviousBlockCount", this.getPinPreviousBlockCount());
        writer.writeBooleanValue("pinRecoveryEnabled", this.getPinRecoveryEnabled());
        writer.writeEnumValue("pinSpecialCharactersUsage", this.getPinSpecialCharactersUsage());
        writer.writeEnumValue("pinUppercaseCharactersUsage", this.getPinUppercaseCharactersUsage());
        writer.writeBooleanValue("securityDeviceRequired", this.getSecurityDeviceRequired());
        writer.writeBooleanValue("unlockWithBiometricsEnabled", this.getUnlockWithBiometricsEnabled());
        writer.writeBooleanValue("useCertificatesForOnPremisesAuthEnabled", this.getUseCertificatesForOnPremisesAuthEnabled());
        writer.writeBooleanValue("useSecurityKeyForSignin", this.getUseSecurityKeyForSignin());
        writer.writeBooleanValue("windowsHelloForBusinessBlocked", this.getWindowsHelloForBusinessBlocked());
    }
    /**
     * Sets the enhancedAntiSpoofingForFacialFeaturesEnabled property value. Boolean value used to enable enhanced anti-spoofing for facial feature recognition on Windows Hello face authentication.
     * @param value Value to set for the enhancedAntiSpoofingForFacialFeaturesEnabled property.
     */
    public void setEnhancedAntiSpoofingForFacialFeaturesEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enhancedAntiSpoofingForFacialFeaturesEnabled", value);
    }
    /**
     * Sets the pinExpirationInDays property value. Integer value specifies the period (in days) that a PIN can be used before the system requires the user to change it. Valid values are 0 to 730 inclusive. Valid values 0 to 730
     * @param value Value to set for the pinExpirationInDays property.
     */
    public void setPinExpirationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pinExpirationInDays", value);
    }
    /**
     * Sets the pinLowercaseCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the pinLowercaseCharactersUsage property.
     */
    public void setPinLowercaseCharactersUsage(@jakarta.annotation.Nullable final ConfigurationUsage value) {
        this.backingStore.set("pinLowercaseCharactersUsage", value);
    }
    /**
     * Sets the pinMaximumLength property value. Integer value that sets the maximum number of characters allowed for the work PIN. Valid values are 4 to 127 inclusive and greater than or equal to the value set for the minimum PIN. Valid values 4 to 127
     * @param value Value to set for the pinMaximumLength property.
     */
    public void setPinMaximumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pinMaximumLength", value);
    }
    /**
     * Sets the pinMinimumLength property value. Integer value that sets the minimum number of characters required for the Windows Hello for Business PIN. Valid values are 4 to 127 inclusive and less than or equal to the value set for the maximum PIN. Valid values 4 to 127
     * @param value Value to set for the pinMinimumLength property.
     */
    public void setPinMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pinMinimumLength", value);
    }
    /**
     * Sets the pinPreviousBlockCount property value. Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset. Valid values 0 to 50
     * @param value Value to set for the pinPreviousBlockCount property.
     */
    public void setPinPreviousBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pinPreviousBlockCount", value);
    }
    /**
     * Sets the pinRecoveryEnabled property value. Boolean value that enables a user to change their PIN by using the Windows Hello for Business PIN recovery service.
     * @param value Value to set for the pinRecoveryEnabled property.
     */
    public void setPinRecoveryEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("pinRecoveryEnabled", value);
    }
    /**
     * Sets the pinSpecialCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the pinSpecialCharactersUsage property.
     */
    public void setPinSpecialCharactersUsage(@jakarta.annotation.Nullable final ConfigurationUsage value) {
        this.backingStore.set("pinSpecialCharactersUsage", value);
    }
    /**
     * Sets the pinUppercaseCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the pinUppercaseCharactersUsage property.
     */
    public void setPinUppercaseCharactersUsage(@jakarta.annotation.Nullable final ConfigurationUsage value) {
        this.backingStore.set("pinUppercaseCharactersUsage", value);
    }
    /**
     * Sets the securityDeviceRequired property value. Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM.
     * @param value Value to set for the securityDeviceRequired property.
     */
    public void setSecurityDeviceRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityDeviceRequired", value);
    }
    /**
     * Sets the unlockWithBiometricsEnabled property value. Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures.
     * @param value Value to set for the unlockWithBiometricsEnabled property.
     */
    public void setUnlockWithBiometricsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("unlockWithBiometricsEnabled", value);
    }
    /**
     * Sets the useCertificatesForOnPremisesAuthEnabled property value. Boolean value that enables Windows Hello for Business to use certificates to authenticate on-premise resources.
     * @param value Value to set for the useCertificatesForOnPremisesAuthEnabled property.
     */
    public void setUseCertificatesForOnPremisesAuthEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("useCertificatesForOnPremisesAuthEnabled", value);
    }
    /**
     * Sets the useSecurityKeyForSignin property value. Boolean value used to enable the Windows Hello security key as a logon credential.
     * @param value Value to set for the useSecurityKeyForSignin property.
     */
    public void setUseSecurityKeyForSignin(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("useSecurityKeyForSignin", value);
    }
    /**
     * Sets the windowsHelloForBusinessBlocked property value. Boolean value that blocks Windows Hello for Business as a method for signing into Windows.
     * @param value Value to set for the windowsHelloForBusinessBlocked property.
     */
    public void setWindowsHelloForBusinessBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windowsHelloForBusinessBlocked", value);
    }
}
