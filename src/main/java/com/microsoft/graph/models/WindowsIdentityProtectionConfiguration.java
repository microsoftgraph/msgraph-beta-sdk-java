package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsIdentityProtectionConfiguration extends DeviceConfiguration implements Parsable {
    /** Boolean value used to enable enhanced anti-spoofing for facial feature recognition on Windows Hello face authentication. */
    private Boolean _enhancedAntiSpoofingForFacialFeaturesEnabled;
    /** Integer value specifies the period (in days) that a PIN can be used before the system requires the user to change it. Valid values are 0 to 730 inclusive. Valid values 0 to 730 */
    private Integer _pinExpirationInDays;
    /** Possible values of the ConfigurationUsage list. */
    private ConfigurationUsage _pinLowercaseCharactersUsage;
    /** Integer value that sets the maximum number of characters allowed for the work PIN. Valid values are 4 to 127 inclusive and greater than or equal to the value set for the minimum PIN. Valid values 4 to 127 */
    private Integer _pinMaximumLength;
    /** Integer value that sets the minimum number of characters required for the Windows Hello for Business PIN. Valid values are 4 to 127 inclusive and less than or equal to the value set for the maximum PIN. Valid values 4 to 127 */
    private Integer _pinMinimumLength;
    /** Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset. Valid values 0 to 50 */
    private Integer _pinPreviousBlockCount;
    /** Boolean value that enables a user to change their PIN by using the Windows Hello for Business PIN recovery service. */
    private Boolean _pinRecoveryEnabled;
    /** Possible values of the ConfigurationUsage list. */
    private ConfigurationUsage _pinSpecialCharactersUsage;
    /** Possible values of the ConfigurationUsage list. */
    private ConfigurationUsage _pinUppercaseCharactersUsage;
    /** Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM. */
    private Boolean _securityDeviceRequired;
    /** Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures. */
    private Boolean _unlockWithBiometricsEnabled;
    /** Boolean value that enables Windows Hello for Business to use certificates to authenticate on-premise resources. */
    private Boolean _useCertificatesForOnPremisesAuthEnabled;
    /** Boolean value used to enable the Windows Hello security key as a logon credential. */
    private Boolean _useSecurityKeyForSignin;
    /** Boolean value that blocks Windows Hello for Business as a method for signing into Windows. */
    private Boolean _windowsHelloForBusinessBlocked;
    /**
     * Instantiates a new WindowsIdentityProtectionConfiguration and sets the default values.
     * @return a void
     */
    public WindowsIdentityProtectionConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsIdentityProtectionConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsIdentityProtectionConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsIdentityProtectionConfiguration();
    }
    /**
     * Gets the enhancedAntiSpoofingForFacialFeaturesEnabled property value. Boolean value used to enable enhanced anti-spoofing for facial feature recognition on Windows Hello face authentication.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnhancedAntiSpoofingForFacialFeaturesEnabled() {
        return this._enhancedAntiSpoofingForFacialFeaturesEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsIdentityProtectionConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("enhancedAntiSpoofingForFacialFeaturesEnabled", (n) -> { currentObject.setEnhancedAntiSpoofingForFacialFeaturesEnabled(n.getBooleanValue()); });
            this.put("pinExpirationInDays", (n) -> { currentObject.setPinExpirationInDays(n.getIntegerValue()); });
            this.put("pinLowercaseCharactersUsage", (n) -> { currentObject.setPinLowercaseCharactersUsage(n.getEnumValue(ConfigurationUsage.class)); });
            this.put("pinMaximumLength", (n) -> { currentObject.setPinMaximumLength(n.getIntegerValue()); });
            this.put("pinMinimumLength", (n) -> { currentObject.setPinMinimumLength(n.getIntegerValue()); });
            this.put("pinPreviousBlockCount", (n) -> { currentObject.setPinPreviousBlockCount(n.getIntegerValue()); });
            this.put("pinRecoveryEnabled", (n) -> { currentObject.setPinRecoveryEnabled(n.getBooleanValue()); });
            this.put("pinSpecialCharactersUsage", (n) -> { currentObject.setPinSpecialCharactersUsage(n.getEnumValue(ConfigurationUsage.class)); });
            this.put("pinUppercaseCharactersUsage", (n) -> { currentObject.setPinUppercaseCharactersUsage(n.getEnumValue(ConfigurationUsage.class)); });
            this.put("securityDeviceRequired", (n) -> { currentObject.setSecurityDeviceRequired(n.getBooleanValue()); });
            this.put("unlockWithBiometricsEnabled", (n) -> { currentObject.setUnlockWithBiometricsEnabled(n.getBooleanValue()); });
            this.put("useCertificatesForOnPremisesAuthEnabled", (n) -> { currentObject.setUseCertificatesForOnPremisesAuthEnabled(n.getBooleanValue()); });
            this.put("useSecurityKeyForSignin", (n) -> { currentObject.setUseSecurityKeyForSignin(n.getBooleanValue()); });
            this.put("windowsHelloForBusinessBlocked", (n) -> { currentObject.setWindowsHelloForBusinessBlocked(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the pinExpirationInDays property value. Integer value specifies the period (in days) that a PIN can be used before the system requires the user to change it. Valid values are 0 to 730 inclusive. Valid values 0 to 730
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPinExpirationInDays() {
        return this._pinExpirationInDays;
    }
    /**
     * Gets the pinLowercaseCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @javax.annotation.Nullable
    public ConfigurationUsage getPinLowercaseCharactersUsage() {
        return this._pinLowercaseCharactersUsage;
    }
    /**
     * Gets the pinMaximumLength property value. Integer value that sets the maximum number of characters allowed for the work PIN. Valid values are 4 to 127 inclusive and greater than or equal to the value set for the minimum PIN. Valid values 4 to 127
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPinMaximumLength() {
        return this._pinMaximumLength;
    }
    /**
     * Gets the pinMinimumLength property value. Integer value that sets the minimum number of characters required for the Windows Hello for Business PIN. Valid values are 4 to 127 inclusive and less than or equal to the value set for the maximum PIN. Valid values 4 to 127
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPinMinimumLength() {
        return this._pinMinimumLength;
    }
    /**
     * Gets the pinPreviousBlockCount property value. Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset. Valid values 0 to 50
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPinPreviousBlockCount() {
        return this._pinPreviousBlockCount;
    }
    /**
     * Gets the pinRecoveryEnabled property value. Boolean value that enables a user to change their PIN by using the Windows Hello for Business PIN recovery service.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPinRecoveryEnabled() {
        return this._pinRecoveryEnabled;
    }
    /**
     * Gets the pinSpecialCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @javax.annotation.Nullable
    public ConfigurationUsage getPinSpecialCharactersUsage() {
        return this._pinSpecialCharactersUsage;
    }
    /**
     * Gets the pinUppercaseCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @return a configurationUsage
     */
    @javax.annotation.Nullable
    public ConfigurationUsage getPinUppercaseCharactersUsage() {
        return this._pinUppercaseCharactersUsage;
    }
    /**
     * Gets the securityDeviceRequired property value. Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityDeviceRequired() {
        return this._securityDeviceRequired;
    }
    /**
     * Gets the unlockWithBiometricsEnabled property value. Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUnlockWithBiometricsEnabled() {
        return this._unlockWithBiometricsEnabled;
    }
    /**
     * Gets the useCertificatesForOnPremisesAuthEnabled property value. Boolean value that enables Windows Hello for Business to use certificates to authenticate on-premise resources.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseCertificatesForOnPremisesAuthEnabled() {
        return this._useCertificatesForOnPremisesAuthEnabled;
    }
    /**
     * Gets the useSecurityKeyForSignin property value. Boolean value used to enable the Windows Hello security key as a logon credential.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseSecurityKeyForSignin() {
        return this._useSecurityKeyForSignin;
    }
    /**
     * Gets the windowsHelloForBusinessBlocked property value. Boolean value that blocks Windows Hello for Business as a method for signing into Windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsHelloForBusinessBlocked() {
        return this._windowsHelloForBusinessBlocked;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    public void setEnhancedAntiSpoofingForFacialFeaturesEnabled(@javax.annotation.Nullable final Boolean value) {
        this._enhancedAntiSpoofingForFacialFeaturesEnabled = value;
    }
    /**
     * Sets the pinExpirationInDays property value. Integer value specifies the period (in days) that a PIN can be used before the system requires the user to change it. Valid values are 0 to 730 inclusive. Valid values 0 to 730
     * @param value Value to set for the pinExpirationInDays property.
     * @return a void
     */
    public void setPinExpirationInDays(@javax.annotation.Nullable final Integer value) {
        this._pinExpirationInDays = value;
    }
    /**
     * Sets the pinLowercaseCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the pinLowercaseCharactersUsage property.
     * @return a void
     */
    public void setPinLowercaseCharactersUsage(@javax.annotation.Nullable final ConfigurationUsage value) {
        this._pinLowercaseCharactersUsage = value;
    }
    /**
     * Sets the pinMaximumLength property value. Integer value that sets the maximum number of characters allowed for the work PIN. Valid values are 4 to 127 inclusive and greater than or equal to the value set for the minimum PIN. Valid values 4 to 127
     * @param value Value to set for the pinMaximumLength property.
     * @return a void
     */
    public void setPinMaximumLength(@javax.annotation.Nullable final Integer value) {
        this._pinMaximumLength = value;
    }
    /**
     * Sets the pinMinimumLength property value. Integer value that sets the minimum number of characters required for the Windows Hello for Business PIN. Valid values are 4 to 127 inclusive and less than or equal to the value set for the maximum PIN. Valid values 4 to 127
     * @param value Value to set for the pinMinimumLength property.
     * @return a void
     */
    public void setPinMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._pinMinimumLength = value;
    }
    /**
     * Sets the pinPreviousBlockCount property value. Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset. Valid values 0 to 50
     * @param value Value to set for the pinPreviousBlockCount property.
     * @return a void
     */
    public void setPinPreviousBlockCount(@javax.annotation.Nullable final Integer value) {
        this._pinPreviousBlockCount = value;
    }
    /**
     * Sets the pinRecoveryEnabled property value. Boolean value that enables a user to change their PIN by using the Windows Hello for Business PIN recovery service.
     * @param value Value to set for the pinRecoveryEnabled property.
     * @return a void
     */
    public void setPinRecoveryEnabled(@javax.annotation.Nullable final Boolean value) {
        this._pinRecoveryEnabled = value;
    }
    /**
     * Sets the pinSpecialCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the pinSpecialCharactersUsage property.
     * @return a void
     */
    public void setPinSpecialCharactersUsage(@javax.annotation.Nullable final ConfigurationUsage value) {
        this._pinSpecialCharactersUsage = value;
    }
    /**
     * Sets the pinUppercaseCharactersUsage property value. Possible values of the ConfigurationUsage list.
     * @param value Value to set for the pinUppercaseCharactersUsage property.
     * @return a void
     */
    public void setPinUppercaseCharactersUsage(@javax.annotation.Nullable final ConfigurationUsage value) {
        this._pinUppercaseCharactersUsage = value;
    }
    /**
     * Sets the securityDeviceRequired property value. Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM.
     * @param value Value to set for the securityDeviceRequired property.
     * @return a void
     */
    public void setSecurityDeviceRequired(@javax.annotation.Nullable final Boolean value) {
        this._securityDeviceRequired = value;
    }
    /**
     * Sets the unlockWithBiometricsEnabled property value. Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures.
     * @param value Value to set for the unlockWithBiometricsEnabled property.
     * @return a void
     */
    public void setUnlockWithBiometricsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._unlockWithBiometricsEnabled = value;
    }
    /**
     * Sets the useCertificatesForOnPremisesAuthEnabled property value. Boolean value that enables Windows Hello for Business to use certificates to authenticate on-premise resources.
     * @param value Value to set for the useCertificatesForOnPremisesAuthEnabled property.
     * @return a void
     */
    public void setUseCertificatesForOnPremisesAuthEnabled(@javax.annotation.Nullable final Boolean value) {
        this._useCertificatesForOnPremisesAuthEnabled = value;
    }
    /**
     * Sets the useSecurityKeyForSignin property value. Boolean value used to enable the Windows Hello security key as a logon credential.
     * @param value Value to set for the useSecurityKeyForSignin property.
     * @return a void
     */
    public void setUseSecurityKeyForSignin(@javax.annotation.Nullable final Boolean value) {
        this._useSecurityKeyForSignin = value;
    }
    /**
     * Sets the windowsHelloForBusinessBlocked property value. Boolean value that blocks Windows Hello for Business as a method for signing into Windows.
     * @param value Value to set for the windowsHelloForBusinessBlocked property.
     * @return a void
     */
    public void setWindowsHelloForBusinessBlocked(@javax.annotation.Nullable final Boolean value) {
        this._windowsHelloForBusinessBlocked = value;
    }
}
