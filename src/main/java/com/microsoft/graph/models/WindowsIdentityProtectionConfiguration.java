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
public class WindowsIdentityProtectionConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Boolean value used to enable enhanced anti-spoofing for facial feature recognition on Windows Hello face authentication.
     */
    private Boolean enhancedAntiSpoofingForFacialFeaturesEnabled;
    /**
     * Integer value specifies the period (in days) that a PIN can be used before the system requires the user to change it. Valid values are 0 to 730 inclusive. Valid values 0 to 730
     */
    private Integer pinExpirationInDays;
    /**
     * Possible values of the ConfigurationUsage list.
     */
    private ConfigurationUsage pinLowercaseCharactersUsage;
    /**
     * Integer value that sets the maximum number of characters allowed for the work PIN. Valid values are 4 to 127 inclusive and greater than or equal to the value set for the minimum PIN. Valid values 4 to 127
     */
    private Integer pinMaximumLength;
    /**
     * Integer value that sets the minimum number of characters required for the Windows Hello for Business PIN. Valid values are 4 to 127 inclusive and less than or equal to the value set for the maximum PIN. Valid values 4 to 127
     */
    private Integer pinMinimumLength;
    /**
     * Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset. Valid values 0 to 50
     */
    private Integer pinPreviousBlockCount;
    /**
     * Boolean value that enables a user to change their PIN by using the Windows Hello for Business PIN recovery service.
     */
    private Boolean pinRecoveryEnabled;
    /**
     * Possible values of the ConfigurationUsage list.
     */
    private ConfigurationUsage pinSpecialCharactersUsage;
    /**
     * Possible values of the ConfigurationUsage list.
     */
    private ConfigurationUsage pinUppercaseCharactersUsage;
    /**
     * Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM.
     */
    private Boolean securityDeviceRequired;
    /**
     * Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures.
     */
    private Boolean unlockWithBiometricsEnabled;
    /**
     * Boolean value that enables Windows Hello for Business to use certificates to authenticate on-premise resources.
     */
    private Boolean useCertificatesForOnPremisesAuthEnabled;
    /**
     * Boolean value used to enable the Windows Hello security key as a logon credential.
     */
    private Boolean useSecurityKeyForSignin;
    /**
     * Boolean value that blocks Windows Hello for Business as a method for signing into Windows.
     */
    private Boolean windowsHelloForBusinessBlocked;
    /**
     * Instantiates a new windowsIdentityProtectionConfiguration and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WindowsIdentityProtectionConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsIdentityProtectionConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsIdentityProtectionConfiguration
     */
    @jakarta.annotation.Nonnull
    public static WindowsIdentityProtectionConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsIdentityProtectionConfiguration();
    }
    /**
     * Gets the enhancedAntiSpoofingForFacialFeaturesEnabled property value. Boolean value used to enable enhanced anti-spoofing for facial feature recognition on Windows Hello face authentication.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnhancedAntiSpoofingForFacialFeaturesEnabled() {
        return this.enhancedAntiSpoofingForFacialFeaturesEnabled;
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
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPinExpirationInDays() {
        return this.pinExpirationInDays;
    }
    /**
     * Gets the pinLowercaseCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @jakarta.annotation.Nullable
    public ConfigurationUsage getPinLowercaseCharactersUsage() {
        return this.pinLowercaseCharactersUsage;
    }
    /**
     * Gets the pinMaximumLength property value. Integer value that sets the maximum number of characters allowed for the work PIN. Valid values are 4 to 127 inclusive and greater than or equal to the value set for the minimum PIN. Valid values 4 to 127
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPinMaximumLength() {
        return this.pinMaximumLength;
    }
    /**
     * Gets the pinMinimumLength property value. Integer value that sets the minimum number of characters required for the Windows Hello for Business PIN. Valid values are 4 to 127 inclusive and less than or equal to the value set for the maximum PIN. Valid values 4 to 127
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPinMinimumLength() {
        return this.pinMinimumLength;
    }
    /**
     * Gets the pinPreviousBlockCount property value. Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset. Valid values 0 to 50
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPinPreviousBlockCount() {
        return this.pinPreviousBlockCount;
    }
    /**
     * Gets the pinRecoveryEnabled property value. Boolean value that enables a user to change their PIN by using the Windows Hello for Business PIN recovery service.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPinRecoveryEnabled() {
        return this.pinRecoveryEnabled;
    }
    /**
     * Gets the pinSpecialCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @jakarta.annotation.Nullable
    public ConfigurationUsage getPinSpecialCharactersUsage() {
        return this.pinSpecialCharactersUsage;
    }
    /**
     * Gets the pinUppercaseCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @jakarta.annotation.Nullable
    public ConfigurationUsage getPinUppercaseCharactersUsage() {
        return this.pinUppercaseCharactersUsage;
    }
    /**
     * Gets the securityDeviceRequired property value. Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityDeviceRequired() {
        return this.securityDeviceRequired;
    }
    /**
     * Gets the unlockWithBiometricsEnabled property value. Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUnlockWithBiometricsEnabled() {
        return this.unlockWithBiometricsEnabled;
    }
    /**
     * Gets the useCertificatesForOnPremisesAuthEnabled property value. Boolean value that enables Windows Hello for Business to use certificates to authenticate on-premise resources.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseCertificatesForOnPremisesAuthEnabled() {
        return this.useCertificatesForOnPremisesAuthEnabled;
    }
    /**
     * Gets the useSecurityKeyForSignin property value. Boolean value used to enable the Windows Hello security key as a logon credential.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseSecurityKeyForSignin() {
        return this.useSecurityKeyForSignin;
    }
    /**
     * Gets the windowsHelloForBusinessBlocked property value. Boolean value that blocks Windows Hello for Business as a method for signing into Windows.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsHelloForBusinessBlocked() {
        return this.windowsHelloForBusinessBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnhancedAntiSpoofingForFacialFeaturesEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enhancedAntiSpoofingForFacialFeaturesEnabled = value;
    }
    /**
     * Sets the pinExpirationInDays property value. Integer value specifies the period (in days) that a PIN can be used before the system requires the user to change it. Valid values are 0 to 730 inclusive. Valid values 0 to 730
     * @param value Value to set for the pinExpirationInDays property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPinExpirationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.pinExpirationInDays = value;
    }
    /**
     * Sets the pinLowercaseCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the pinLowercaseCharactersUsage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPinLowercaseCharactersUsage(@jakarta.annotation.Nullable final ConfigurationUsage value) {
        this.pinLowercaseCharactersUsage = value;
    }
    /**
     * Sets the pinMaximumLength property value. Integer value that sets the maximum number of characters allowed for the work PIN. Valid values are 4 to 127 inclusive and greater than or equal to the value set for the minimum PIN. Valid values 4 to 127
     * @param value Value to set for the pinMaximumLength property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPinMaximumLength(@jakarta.annotation.Nullable final Integer value) {
        this.pinMaximumLength = value;
    }
    /**
     * Sets the pinMinimumLength property value. Integer value that sets the minimum number of characters required for the Windows Hello for Business PIN. Valid values are 4 to 127 inclusive and less than or equal to the value set for the maximum PIN. Valid values 4 to 127
     * @param value Value to set for the pinMinimumLength property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPinMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.pinMinimumLength = value;
    }
    /**
     * Sets the pinPreviousBlockCount property value. Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset. Valid values 0 to 50
     * @param value Value to set for the pinPreviousBlockCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPinPreviousBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.pinPreviousBlockCount = value;
    }
    /**
     * Sets the pinRecoveryEnabled property value. Boolean value that enables a user to change their PIN by using the Windows Hello for Business PIN recovery service.
     * @param value Value to set for the pinRecoveryEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPinRecoveryEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.pinRecoveryEnabled = value;
    }
    /**
     * Sets the pinSpecialCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the pinSpecialCharactersUsage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPinSpecialCharactersUsage(@jakarta.annotation.Nullable final ConfigurationUsage value) {
        this.pinSpecialCharactersUsage = value;
    }
    /**
     * Sets the pinUppercaseCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the pinUppercaseCharactersUsage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPinUppercaseCharactersUsage(@jakarta.annotation.Nullable final ConfigurationUsage value) {
        this.pinUppercaseCharactersUsage = value;
    }
    /**
     * Sets the securityDeviceRequired property value. Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM.
     * @param value Value to set for the securityDeviceRequired property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSecurityDeviceRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.securityDeviceRequired = value;
    }
    /**
     * Sets the unlockWithBiometricsEnabled property value. Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures.
     * @param value Value to set for the unlockWithBiometricsEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUnlockWithBiometricsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.unlockWithBiometricsEnabled = value;
    }
    /**
     * Sets the useCertificatesForOnPremisesAuthEnabled property value. Boolean value that enables Windows Hello for Business to use certificates to authenticate on-premise resources.
     * @param value Value to set for the useCertificatesForOnPremisesAuthEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUseCertificatesForOnPremisesAuthEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.useCertificatesForOnPremisesAuthEnabled = value;
    }
    /**
     * Sets the useSecurityKeyForSignin property value. Boolean value used to enable the Windows Hello security key as a logon credential.
     * @param value Value to set for the useSecurityKeyForSignin property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUseSecurityKeyForSignin(@jakarta.annotation.Nullable final Boolean value) {
        this.useSecurityKeyForSignin = value;
    }
    /**
     * Sets the windowsHelloForBusinessBlocked property value. Boolean value that blocks Windows Hello for Business as a method for signing into Windows.
     * @param value Value to set for the windowsHelloForBusinessBlocked property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setWindowsHelloForBusinessBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.windowsHelloForBusinessBlocked = value;
    }
}
