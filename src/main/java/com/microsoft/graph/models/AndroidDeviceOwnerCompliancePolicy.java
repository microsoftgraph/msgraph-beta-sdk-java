package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceOwnerCompliancePolicy extends DeviceCompliancePolicy implements Parsable {
    /** MDATP Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet. */
    private DeviceThreatProtectionLevel _advancedThreatProtectionRequiredSecurityLevel;
    /** Require that devices have enabled device threat protection. */
    private Boolean _deviceThreatProtectionEnabled;
    /** Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet. */
    private DeviceThreatProtectionLevel _deviceThreatProtectionRequiredSecurityLevel;
    /** Minimum Android security patch level. */
    private String _minAndroidSecurityPatchLevel;
    /** Maximum Android version. */
    private String _osMaximumVersion;
    /** Minimum Android version. */
    private String _osMinimumVersion;
    /** Number of days before the password expires. Valid values 1 to 365 */
    private Integer _passwordExpirationDays;
    /** Minimum password length. Valid values 4 to 16 */
    private Integer _passwordMinimumLength;
    /** Indicates the minimum number of letter characters required for device password. Valid values 1 to 16 */
    private Integer _passwordMinimumLetterCharacters;
    /** Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16 */
    private Integer _passwordMinimumLowerCaseCharacters;
    /** Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16 */
    private Integer _passwordMinimumNonLetterCharacters;
    /** Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16 */
    private Integer _passwordMinimumNumericCharacters;
    /** Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16 */
    private Integer _passwordMinimumSymbolCharacters;
    /** Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16 */
    private Integer _passwordMinimumUpperCaseCharacters;
    /** Minutes of inactivity before a password is required. */
    private Integer _passwordMinutesOfInactivityBeforeLock;
    /** Number of previous passwords to block. Valid values 1 to 24 */
    private Integer _passwordPreviousPasswordCountToBlock;
    /** Require a password to unlock device. */
    private Boolean _passwordRequired;
    /** Type of characters in password. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword. */
    private AndroidDeviceOwnerRequiredPasswordType _passwordRequiredType;
    /** If setting is set to true, checks that the Intune app installed on fully managed, dedicated, or corporate-owned work profile Android Enterprise enrolled devices, is the one provided by Microsoft from the Managed Google Playstore. If the check fails, the device will be reported as non-compliant. */
    private Boolean _securityRequireIntuneAppIntegrity;
    /** Require the device to pass the SafetyNet basic integrity check. */
    private Boolean _securityRequireSafetyNetAttestationBasicIntegrity;
    /** Require the device to pass the SafetyNet certified device check. */
    private Boolean _securityRequireSafetyNetAttestationCertifiedDevice;
    /** Require encryption on Android devices. */
    private Boolean _storageRequireEncryption;
    /**
     * Instantiates a new AndroidDeviceOwnerCompliancePolicy and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static AndroidDeviceOwnerCompliancePolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerCompliancePolicy();
    }
    /**
     * Gets the advancedThreatProtectionRequiredSecurityLevel property value. MDATP Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     * @return a deviceThreatProtectionLevel
     */
    @javax.annotation.Nullable
    public DeviceThreatProtectionLevel getAdvancedThreatProtectionRequiredSecurityLevel() {
        return this._advancedThreatProtectionRequiredSecurityLevel;
    }
    /**
     * Gets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceThreatProtectionEnabled() {
        return this._deviceThreatProtectionEnabled;
    }
    /**
     * Gets the deviceThreatProtectionRequiredSecurityLevel property value. Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     * @return a deviceThreatProtectionLevel
     */
    @javax.annotation.Nullable
    public DeviceThreatProtectionLevel getDeviceThreatProtectionRequiredSecurityLevel() {
        return this._deviceThreatProtectionRequiredSecurityLevel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidDeviceOwnerCompliancePolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("advancedThreatProtectionRequiredSecurityLevel", (n) -> { currentObject.setAdvancedThreatProtectionRequiredSecurityLevel(n.getEnumValue(DeviceThreatProtectionLevel.class)); });
            this.put("deviceThreatProtectionEnabled", (n) -> { currentObject.setDeviceThreatProtectionEnabled(n.getBooleanValue()); });
            this.put("deviceThreatProtectionRequiredSecurityLevel", (n) -> { currentObject.setDeviceThreatProtectionRequiredSecurityLevel(n.getEnumValue(DeviceThreatProtectionLevel.class)); });
            this.put("minAndroidSecurityPatchLevel", (n) -> { currentObject.setMinAndroidSecurityPatchLevel(n.getStringValue()); });
            this.put("osMaximumVersion", (n) -> { currentObject.setOsMaximumVersion(n.getStringValue()); });
            this.put("osMinimumVersion", (n) -> { currentObject.setOsMinimumVersion(n.getStringValue()); });
            this.put("passwordExpirationDays", (n) -> { currentObject.setPasswordExpirationDays(n.getIntegerValue()); });
            this.put("passwordMinimumLength", (n) -> { currentObject.setPasswordMinimumLength(n.getIntegerValue()); });
            this.put("passwordMinimumLetterCharacters", (n) -> { currentObject.setPasswordMinimumLetterCharacters(n.getIntegerValue()); });
            this.put("passwordMinimumLowerCaseCharacters", (n) -> { currentObject.setPasswordMinimumLowerCaseCharacters(n.getIntegerValue()); });
            this.put("passwordMinimumNonLetterCharacters", (n) -> { currentObject.setPasswordMinimumNonLetterCharacters(n.getIntegerValue()); });
            this.put("passwordMinimumNumericCharacters", (n) -> { currentObject.setPasswordMinimumNumericCharacters(n.getIntegerValue()); });
            this.put("passwordMinimumSymbolCharacters", (n) -> { currentObject.setPasswordMinimumSymbolCharacters(n.getIntegerValue()); });
            this.put("passwordMinimumUpperCaseCharacters", (n) -> { currentObject.setPasswordMinimumUpperCaseCharacters(n.getIntegerValue()); });
            this.put("passwordMinutesOfInactivityBeforeLock", (n) -> { currentObject.setPasswordMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
            this.put("passwordPreviousPasswordCountToBlock", (n) -> { currentObject.setPasswordPreviousPasswordCountToBlock(n.getIntegerValue()); });
            this.put("passwordRequired", (n) -> { currentObject.setPasswordRequired(n.getBooleanValue()); });
            this.put("passwordRequiredType", (n) -> { currentObject.setPasswordRequiredType(n.getEnumValue(AndroidDeviceOwnerRequiredPasswordType.class)); });
            this.put("securityRequireIntuneAppIntegrity", (n) -> { currentObject.setSecurityRequireIntuneAppIntegrity(n.getBooleanValue()); });
            this.put("securityRequireSafetyNetAttestationBasicIntegrity", (n) -> { currentObject.setSecurityRequireSafetyNetAttestationBasicIntegrity(n.getBooleanValue()); });
            this.put("securityRequireSafetyNetAttestationCertifiedDevice", (n) -> { currentObject.setSecurityRequireSafetyNetAttestationCertifiedDevice(n.getBooleanValue()); });
            this.put("storageRequireEncryption", (n) -> { currentObject.setStorageRequireEncryption(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the minAndroidSecurityPatchLevel property value. Minimum Android security patch level.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinAndroidSecurityPatchLevel() {
        return this._minAndroidSecurityPatchLevel;
    }
    /**
     * Gets the osMaximumVersion property value. Maximum Android version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsMaximumVersion() {
        return this._osMaximumVersion;
    }
    /**
     * Gets the osMinimumVersion property value. Minimum Android version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsMinimumVersion() {
        return this._osMinimumVersion;
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this._passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum password length. Valid values 4 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this._passwordMinimumLength;
    }
    /**
     * Gets the passwordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLetterCharacters() {
        return this._passwordMinimumLetterCharacters;
    }
    /**
     * Gets the passwordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLowerCaseCharacters() {
        return this._passwordMinimumLowerCaseCharacters;
    }
    /**
     * Gets the passwordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumNonLetterCharacters() {
        return this._passwordMinimumNonLetterCharacters;
    }
    /**
     * Gets the passwordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumNumericCharacters() {
        return this._passwordMinimumNumericCharacters;
    }
    /**
     * Gets the passwordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumSymbolCharacters() {
        return this._passwordMinimumSymbolCharacters;
    }
    /**
     * Gets the passwordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumUpperCaseCharacters() {
        return this._passwordMinimumUpperCaseCharacters;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeLock() {
        return this._passwordMinutesOfInactivityBeforeLock;
    }
    /**
     * Gets the passwordPreviousPasswordCountToBlock property value. Number of previous passwords to block. Valid values 1 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordCountToBlock() {
        return this._passwordPreviousPasswordCountToBlock;
    }
    /**
     * Gets the passwordRequired property value. Require a password to unlock device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this._passwordRequired;
    }
    /**
     * Gets the passwordRequiredType property value. Type of characters in password. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @return a androidDeviceOwnerRequiredPasswordType
     */
    @javax.annotation.Nullable
    public AndroidDeviceOwnerRequiredPasswordType getPasswordRequiredType() {
        return this._passwordRequiredType;
    }
    /**
     * Gets the securityRequireIntuneAppIntegrity property value. If setting is set to true, checks that the Intune app installed on fully managed, dedicated, or corporate-owned work profile Android Enterprise enrolled devices, is the one provided by Microsoft from the Managed Google Playstore. If the check fails, the device will be reported as non-compliant.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityRequireIntuneAppIntegrity() {
        return this._securityRequireIntuneAppIntegrity;
    }
    /**
     * Gets the securityRequireSafetyNetAttestationBasicIntegrity property value. Require the device to pass the SafetyNet basic integrity check.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityRequireSafetyNetAttestationBasicIntegrity() {
        return this._securityRequireSafetyNetAttestationBasicIntegrity;
    }
    /**
     * Gets the securityRequireSafetyNetAttestationCertifiedDevice property value. Require the device to pass the SafetyNet certified device check.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityRequireSafetyNetAttestationCertifiedDevice() {
        return this._securityRequireSafetyNetAttestationCertifiedDevice;
    }
    /**
     * Gets the storageRequireEncryption property value. Require encryption on Android devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRequireEncryption() {
        return this._storageRequireEncryption;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeBooleanValue("securityRequireIntuneAppIntegrity", this.getSecurityRequireIntuneAppIntegrity());
        writer.writeBooleanValue("securityRequireSafetyNetAttestationBasicIntegrity", this.getSecurityRequireSafetyNetAttestationBasicIntegrity());
        writer.writeBooleanValue("securityRequireSafetyNetAttestationCertifiedDevice", this.getSecurityRequireSafetyNetAttestationCertifiedDevice());
        writer.writeBooleanValue("storageRequireEncryption", this.getStorageRequireEncryption());
    }
    /**
     * Sets the advancedThreatProtectionRequiredSecurityLevel property value. MDATP Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     * @param value Value to set for the advancedThreatProtectionRequiredSecurityLevel property.
     * @return a void
     */
    public void setAdvancedThreatProtectionRequiredSecurityLevel(@javax.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this._advancedThreatProtectionRequiredSecurityLevel = value;
    }
    /**
     * Sets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection.
     * @param value Value to set for the deviceThreatProtectionEnabled property.
     * @return a void
     */
    public void setDeviceThreatProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._deviceThreatProtectionEnabled = value;
    }
    /**
     * Sets the deviceThreatProtectionRequiredSecurityLevel property value. Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     * @param value Value to set for the deviceThreatProtectionRequiredSecurityLevel property.
     * @return a void
     */
    public void setDeviceThreatProtectionRequiredSecurityLevel(@javax.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this._deviceThreatProtectionRequiredSecurityLevel = value;
    }
    /**
     * Sets the minAndroidSecurityPatchLevel property value. Minimum Android security patch level.
     * @param value Value to set for the minAndroidSecurityPatchLevel property.
     * @return a void
     */
    public void setMinAndroidSecurityPatchLevel(@javax.annotation.Nullable final String value) {
        this._minAndroidSecurityPatchLevel = value;
    }
    /**
     * Sets the osMaximumVersion property value. Maximum Android version.
     * @param value Value to set for the osMaximumVersion property.
     * @return a void
     */
    public void setOsMaximumVersion(@javax.annotation.Nullable final String value) {
        this._osMaximumVersion = value;
    }
    /**
     * Sets the osMinimumVersion property value. Minimum Android version.
     * @param value Value to set for the osMinimumVersion property.
     * @return a void
     */
    public void setOsMinimumVersion(@javax.annotation.Nullable final String value) {
        this._osMinimumVersion = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 365
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum password length. Valid values 4 to 16
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinimumLetterCharacters property value. Indicates the minimum number of letter characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumLetterCharacters property.
     * @return a void
     */
    public void setPasswordMinimumLetterCharacters(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLetterCharacters = value;
    }
    /**
     * Sets the passwordMinimumLowerCaseCharacters property value. Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumLowerCaseCharacters property.
     * @return a void
     */
    public void setPasswordMinimumLowerCaseCharacters(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLowerCaseCharacters = value;
    }
    /**
     * Sets the passwordMinimumNonLetterCharacters property value. Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumNonLetterCharacters property.
     * @return a void
     */
    public void setPasswordMinimumNonLetterCharacters(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumNonLetterCharacters = value;
    }
    /**
     * Sets the passwordMinimumNumericCharacters property value. Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumNumericCharacters property.
     * @return a void
     */
    public void setPasswordMinimumNumericCharacters(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumNumericCharacters = value;
    }
    /**
     * Sets the passwordMinimumSymbolCharacters property value. Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumSymbolCharacters property.
     * @return a void
     */
    public void setPasswordMinimumSymbolCharacters(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumSymbolCharacters = value;
    }
    /**
     * Sets the passwordMinimumUpperCaseCharacters property value. Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16
     * @param value Value to set for the passwordMinimumUpperCaseCharacters property.
     * @return a void
     */
    public void setPasswordMinimumUpperCaseCharacters(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumUpperCaseCharacters = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeLock property.
     * @return a void
     */
    public void setPasswordMinutesOfInactivityBeforeLock(@javax.annotation.Nullable final Integer value) {
        this._passwordMinutesOfInactivityBeforeLock = value;
    }
    /**
     * Sets the passwordPreviousPasswordCountToBlock property value. Number of previous passwords to block. Valid values 1 to 24
     * @param value Value to set for the passwordPreviousPasswordCountToBlock property.
     * @return a void
     */
    public void setPasswordPreviousPasswordCountToBlock(@javax.annotation.Nullable final Integer value) {
        this._passwordPreviousPasswordCountToBlock = value;
    }
    /**
     * Sets the passwordRequired property value. Require a password to unlock device.
     * @param value Value to set for the passwordRequired property.
     * @return a void
     */
    public void setPasswordRequired(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredType property value. Type of characters in password. Possible values are: deviceDefault, required, numeric, numericComplex, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, customPassword.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    public void setPasswordRequiredType(@javax.annotation.Nullable final AndroidDeviceOwnerRequiredPasswordType value) {
        this._passwordRequiredType = value;
    }
    /**
     * Sets the securityRequireIntuneAppIntegrity property value. If setting is set to true, checks that the Intune app installed on fully managed, dedicated, or corporate-owned work profile Android Enterprise enrolled devices, is the one provided by Microsoft from the Managed Google Playstore. If the check fails, the device will be reported as non-compliant.
     * @param value Value to set for the securityRequireIntuneAppIntegrity property.
     * @return a void
     */
    public void setSecurityRequireIntuneAppIntegrity(@javax.annotation.Nullable final Boolean value) {
        this._securityRequireIntuneAppIntegrity = value;
    }
    /**
     * Sets the securityRequireSafetyNetAttestationBasicIntegrity property value. Require the device to pass the SafetyNet basic integrity check.
     * @param value Value to set for the securityRequireSafetyNetAttestationBasicIntegrity property.
     * @return a void
     */
    public void setSecurityRequireSafetyNetAttestationBasicIntegrity(@javax.annotation.Nullable final Boolean value) {
        this._securityRequireSafetyNetAttestationBasicIntegrity = value;
    }
    /**
     * Sets the securityRequireSafetyNetAttestationCertifiedDevice property value. Require the device to pass the SafetyNet certified device check.
     * @param value Value to set for the securityRequireSafetyNetAttestationCertifiedDevice property.
     * @return a void
     */
    public void setSecurityRequireSafetyNetAttestationCertifiedDevice(@javax.annotation.Nullable final Boolean value) {
        this._securityRequireSafetyNetAttestationCertifiedDevice = value;
    }
    /**
     * Sets the storageRequireEncryption property value. Require encryption on Android devices.
     * @param value Value to set for the storageRequireEncryption property.
     * @return a void
     */
    public void setStorageRequireEncryption(@javax.annotation.Nullable final Boolean value) {
        this._storageRequireEncryption = value;
    }
}
