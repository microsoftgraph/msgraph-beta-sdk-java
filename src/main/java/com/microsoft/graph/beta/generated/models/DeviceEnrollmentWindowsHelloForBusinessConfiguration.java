package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Hello for Business settings lets users access their devices using a gesture, such as biometric authentication, or a PIN. Configure settings for enrolled Windows 10, Windows 10 Mobile and later.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceEnrollmentWindowsHelloForBusinessConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /**
     * Instantiates a new {@link DeviceEnrollmentWindowsHelloForBusinessConfiguration} and sets the default values.
     */
    public DeviceEnrollmentWindowsHelloForBusinessConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceEnrollmentWindowsHelloForBusinessConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static DeviceEnrollmentWindowsHelloForBusinessConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEnrollmentWindowsHelloForBusinessConfiguration();
    }
    /**
     * Gets the enhancedBiometricsState property value. Possible values of a property
     * @return a {@link Enablement}
     */
    @jakarta.annotation.Nullable
    public Enablement getEnhancedBiometricsState() {
        return this.backingStore.get("enhancedBiometricsState");
    }
    /**
     * Gets the enhancedSignInSecurity property value. Setting to configure Enhanced sign-in security. Default is Not Configured
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEnhancedSignInSecurity() {
        return this.backingStore.get("enhancedSignInSecurity");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enhancedBiometricsState", (n) -> { this.setEnhancedBiometricsState(n.getEnumValue(Enablement::forValue)); });
        deserializerMap.put("enhancedSignInSecurity", (n) -> { this.setEnhancedSignInSecurity(n.getIntegerValue()); });
        deserializerMap.put("pinExpirationInDays", (n) -> { this.setPinExpirationInDays(n.getIntegerValue()); });
        deserializerMap.put("pinLowercaseCharactersUsage", (n) -> { this.setPinLowercaseCharactersUsage(n.getEnumValue(WindowsHelloForBusinessPinUsage::forValue)); });
        deserializerMap.put("pinMaximumLength", (n) -> { this.setPinMaximumLength(n.getIntegerValue()); });
        deserializerMap.put("pinMinimumLength", (n) -> { this.setPinMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("pinPreviousBlockCount", (n) -> { this.setPinPreviousBlockCount(n.getIntegerValue()); });
        deserializerMap.put("pinSpecialCharactersUsage", (n) -> { this.setPinSpecialCharactersUsage(n.getEnumValue(WindowsHelloForBusinessPinUsage::forValue)); });
        deserializerMap.put("pinUppercaseCharactersUsage", (n) -> { this.setPinUppercaseCharactersUsage(n.getEnumValue(WindowsHelloForBusinessPinUsage::forValue)); });
        deserializerMap.put("remotePassportEnabled", (n) -> { this.setRemotePassportEnabled(n.getBooleanValue()); });
        deserializerMap.put("securityDeviceRequired", (n) -> { this.setSecurityDeviceRequired(n.getBooleanValue()); });
        deserializerMap.put("securityKeyForSignIn", (n) -> { this.setSecurityKeyForSignIn(n.getEnumValue(Enablement::forValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(Enablement::forValue)); });
        deserializerMap.put("unlockWithBiometricsEnabled", (n) -> { this.setUnlockWithBiometricsEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the pinExpirationInDays property value. Controls the period of time (in days) that a PIN can be used before the system requires the user to change it. This must be set between 0 and 730, inclusive. If set to 0, the user&apos;s PIN will never expire
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPinExpirationInDays() {
        return this.backingStore.get("pinExpirationInDays");
    }
    /**
     * Gets the pinLowercaseCharactersUsage property value. Windows Hello for Business pin usage options
     * @return a {@link WindowsHelloForBusinessPinUsage}
     */
    @jakarta.annotation.Nullable
    public WindowsHelloForBusinessPinUsage getPinLowercaseCharactersUsage() {
        return this.backingStore.get("pinLowercaseCharactersUsage");
    }
    /**
     * Gets the pinMaximumLength property value. Controls the maximum number of characters allowed for the Windows Hello for Business PIN. This value must be between 4 and 127, inclusive. This value must be greater than or equal to the value set for the minimum PIN.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPinMaximumLength() {
        return this.backingStore.get("pinMaximumLength");
    }
    /**
     * Gets the pinMinimumLength property value. Controls the minimum number of characters required for the Windows Hello for Business PIN.  This value must be between 4 and 127, inclusive, and less than or equal to the value set for the maximum PIN.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPinMinimumLength() {
        return this.backingStore.get("pinMinimumLength");
    }
    /**
     * Gets the pinPreviousBlockCount property value. Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPinPreviousBlockCount() {
        return this.backingStore.get("pinPreviousBlockCount");
    }
    /**
     * Gets the pinSpecialCharactersUsage property value. Windows Hello for Business pin usage options
     * @return a {@link WindowsHelloForBusinessPinUsage}
     */
    @jakarta.annotation.Nullable
    public WindowsHelloForBusinessPinUsage getPinSpecialCharactersUsage() {
        return this.backingStore.get("pinSpecialCharactersUsage");
    }
    /**
     * Gets the pinUppercaseCharactersUsage property value. Windows Hello for Business pin usage options
     * @return a {@link WindowsHelloForBusinessPinUsage}
     */
    @jakarta.annotation.Nullable
    public WindowsHelloForBusinessPinUsage getPinUppercaseCharactersUsage() {
        return this.backingStore.get("pinUppercaseCharactersUsage");
    }
    /**
     * Gets the remotePassportEnabled property value. Controls the use of Remote Windows Hello for Business. Remote Windows Hello for Business provides the ability for a portable, registered device to be usable as a companion for desktop authentication. The desktop must be Azure AD joined and the companion device must have a Windows Hello for Business PIN.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRemotePassportEnabled() {
        return this.backingStore.get("remotePassportEnabled");
    }
    /**
     * Gets the securityDeviceRequired property value. Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityDeviceRequired() {
        return this.backingStore.get("securityDeviceRequired");
    }
    /**
     * Gets the securityKeyForSignIn property value. Possible values of a property
     * @return a {@link Enablement}
     */
    @jakarta.annotation.Nullable
    public Enablement getSecurityKeyForSignIn() {
        return this.backingStore.get("securityKeyForSignIn");
    }
    /**
     * Gets the state property value. Possible values of a property
     * @return a {@link Enablement}
     */
    @jakarta.annotation.Nullable
    public Enablement getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the unlockWithBiometricsEnabled property value. Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUnlockWithBiometricsEnabled() {
        return this.backingStore.get("unlockWithBiometricsEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("enhancedBiometricsState", this.getEnhancedBiometricsState());
        writer.writeIntegerValue("enhancedSignInSecurity", this.getEnhancedSignInSecurity());
        writer.writeIntegerValue("pinExpirationInDays", this.getPinExpirationInDays());
        writer.writeEnumValue("pinLowercaseCharactersUsage", this.getPinLowercaseCharactersUsage());
        writer.writeIntegerValue("pinMaximumLength", this.getPinMaximumLength());
        writer.writeIntegerValue("pinMinimumLength", this.getPinMinimumLength());
        writer.writeIntegerValue("pinPreviousBlockCount", this.getPinPreviousBlockCount());
        writer.writeEnumValue("pinSpecialCharactersUsage", this.getPinSpecialCharactersUsage());
        writer.writeEnumValue("pinUppercaseCharactersUsage", this.getPinUppercaseCharactersUsage());
        writer.writeBooleanValue("remotePassportEnabled", this.getRemotePassportEnabled());
        writer.writeBooleanValue("securityDeviceRequired", this.getSecurityDeviceRequired());
        writer.writeEnumValue("securityKeyForSignIn", this.getSecurityKeyForSignIn());
        writer.writeEnumValue("state", this.getState());
        writer.writeBooleanValue("unlockWithBiometricsEnabled", this.getUnlockWithBiometricsEnabled());
    }
    /**
     * Sets the enhancedBiometricsState property value. Possible values of a property
     * @param value Value to set for the enhancedBiometricsState property.
     */
    public void setEnhancedBiometricsState(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("enhancedBiometricsState", value);
    }
    /**
     * Sets the enhancedSignInSecurity property value. Setting to configure Enhanced sign-in security. Default is Not Configured
     * @param value Value to set for the enhancedSignInSecurity property.
     */
    public void setEnhancedSignInSecurity(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("enhancedSignInSecurity", value);
    }
    /**
     * Sets the pinExpirationInDays property value. Controls the period of time (in days) that a PIN can be used before the system requires the user to change it. This must be set between 0 and 730, inclusive. If set to 0, the user&apos;s PIN will never expire
     * @param value Value to set for the pinExpirationInDays property.
     */
    public void setPinExpirationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pinExpirationInDays", value);
    }
    /**
     * Sets the pinLowercaseCharactersUsage property value. Windows Hello for Business pin usage options
     * @param value Value to set for the pinLowercaseCharactersUsage property.
     */
    public void setPinLowercaseCharactersUsage(@jakarta.annotation.Nullable final WindowsHelloForBusinessPinUsage value) {
        this.backingStore.set("pinLowercaseCharactersUsage", value);
    }
    /**
     * Sets the pinMaximumLength property value. Controls the maximum number of characters allowed for the Windows Hello for Business PIN. This value must be between 4 and 127, inclusive. This value must be greater than or equal to the value set for the minimum PIN.
     * @param value Value to set for the pinMaximumLength property.
     */
    public void setPinMaximumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pinMaximumLength", value);
    }
    /**
     * Sets the pinMinimumLength property value. Controls the minimum number of characters required for the Windows Hello for Business PIN.  This value must be between 4 and 127, inclusive, and less than or equal to the value set for the maximum PIN.
     * @param value Value to set for the pinMinimumLength property.
     */
    public void setPinMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pinMinimumLength", value);
    }
    /**
     * Sets the pinPreviousBlockCount property value. Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset.
     * @param value Value to set for the pinPreviousBlockCount property.
     */
    public void setPinPreviousBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pinPreviousBlockCount", value);
    }
    /**
     * Sets the pinSpecialCharactersUsage property value. Windows Hello for Business pin usage options
     * @param value Value to set for the pinSpecialCharactersUsage property.
     */
    public void setPinSpecialCharactersUsage(@jakarta.annotation.Nullable final WindowsHelloForBusinessPinUsage value) {
        this.backingStore.set("pinSpecialCharactersUsage", value);
    }
    /**
     * Sets the pinUppercaseCharactersUsage property value. Windows Hello for Business pin usage options
     * @param value Value to set for the pinUppercaseCharactersUsage property.
     */
    public void setPinUppercaseCharactersUsage(@jakarta.annotation.Nullable final WindowsHelloForBusinessPinUsage value) {
        this.backingStore.set("pinUppercaseCharactersUsage", value);
    }
    /**
     * Sets the remotePassportEnabled property value. Controls the use of Remote Windows Hello for Business. Remote Windows Hello for Business provides the ability for a portable, registered device to be usable as a companion for desktop authentication. The desktop must be Azure AD joined and the companion device must have a Windows Hello for Business PIN.
     * @param value Value to set for the remotePassportEnabled property.
     */
    public void setRemotePassportEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("remotePassportEnabled", value);
    }
    /**
     * Sets the securityDeviceRequired property value. Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM.
     * @param value Value to set for the securityDeviceRequired property.
     */
    public void setSecurityDeviceRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("securityDeviceRequired", value);
    }
    /**
     * Sets the securityKeyForSignIn property value. Possible values of a property
     * @param value Value to set for the securityKeyForSignIn property.
     */
    public void setSecurityKeyForSignIn(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("securityKeyForSignIn", value);
    }
    /**
     * Sets the state property value. Possible values of a property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the unlockWithBiometricsEnabled property value. Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures.
     * @param value Value to set for the unlockWithBiometricsEnabled property.
     */
    public void setUnlockWithBiometricsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("unlockWithBiometricsEnabled", value);
    }
}
