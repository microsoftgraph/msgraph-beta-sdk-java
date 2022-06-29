package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10CompliancePolicy extends DeviceCompliancePolicy implements Parsable {
    /** Require active firewall on Windows devices. */
    private Boolean _activeFirewallRequired;
    /** Require any AntiSpyware solution registered with Windows Decurity Center to be on and monitoring (e.g. Symantec, Windows Defender). */
    private Boolean _antiSpywareRequired;
    /** Require any Antivirus solution registered with Windows Decurity Center to be on and monitoring (e.g. Symantec, Windows Defender). */
    private Boolean _antivirusRequired;
    /** Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled */
    private Boolean _bitLockerEnabled;
    /** Require devices to be reported as healthy by Windows Device Health Attestation. */
    private Boolean _codeIntegrityEnabled;
    /** Require to consider SCCM Compliance state into consideration for Intune Compliance State. */
    private Boolean _configurationManagerComplianceRequired;
    /** Require Windows Defender Antimalware on Windows devices. */
    private Boolean _defenderEnabled;
    /** Require Windows Defender Antimalware minimum version on Windows devices. */
    private String _defenderVersion;
    /** Not yet documented */
    private DeviceCompliancePolicyScript _deviceCompliancePolicyScript;
    /** Require that devices have enabled device threat protection. */
    private Boolean _deviceThreatProtectionEnabled;
    /** Require Device Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet. */
    private DeviceThreatProtectionLevel _deviceThreatProtectionRequiredSecurityLevel;
    /** Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled. */
    private Boolean _earlyLaunchAntiMalwareDriverEnabled;
    /** Maximum Windows Phone version. */
    private String _mobileOsMaximumVersion;
    /** Minimum Windows Phone version. */
    private String _mobileOsMinimumVersion;
    /** Maximum Windows 10 version. */
    private String _osMaximumVersion;
    /** Minimum Windows 10 version. */
    private String _osMinimumVersion;
    /** Indicates whether or not to block simple password. */
    private Boolean _passwordBlockSimple;
    /** The password expiration in days. */
    private Integer _passwordExpirationDays;
    /** The number of character sets required in the password. */
    private Integer _passwordMinimumCharacterSetCount;
    /** The minimum password length. */
    private Integer _passwordMinimumLength;
    /** Minutes of inactivity before a password is required. */
    private Integer _passwordMinutesOfInactivityBeforeLock;
    /** The number of previous passwords to prevent re-use of. */
    private Integer _passwordPreviousPasswordBlockCount;
    /** Require a password to unlock Windows device. */
    private Boolean _passwordRequired;
    /** Require a password to unlock an idle device. */
    private Boolean _passwordRequiredToUnlockFromIdle;
    /** The required password type. Possible values are: deviceDefault, alphanumeric, numeric. */
    private RequiredPasswordType _passwordRequiredType;
    /** Require devices to be reported as healthy by Windows Device Health Attestation. */
    private Boolean _requireHealthyDeviceReport;
    /** Require Windows Defender Antimalware Real-Time Protection on Windows devices. */
    private Boolean _rtpEnabled;
    /** Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled. */
    private Boolean _secureBootEnabled;
    /** Require Windows Defender Antimalware Signature to be up to date on Windows devices. */
    private Boolean _signatureOutOfDate;
    /** Require encryption on windows devices. */
    private Boolean _storageRequireEncryption;
    /** Require Trusted Platform Module(TPM) to be present. */
    private Boolean _tpmRequired;
    /** The valid operating system build ranges on Windows devices. This collection can contain a maximum of 10000 elements. */
    private java.util.List<OperatingSystemVersionRange> _validOperatingSystemBuildRanges;
    /**
     * Instantiates a new Windows10CompliancePolicy and sets the default values.
     * @return a void
     */
    public Windows10CompliancePolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10CompliancePolicy
     */
    @javax.annotation.Nonnull
    public static Windows10CompliancePolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10CompliancePolicy();
    }
    /**
     * Gets the activeFirewallRequired property value. Require active firewall on Windows devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getActiveFirewallRequired() {
        return this._activeFirewallRequired;
    }
    /**
     * Gets the antiSpywareRequired property value. Require any AntiSpyware solution registered with Windows Decurity Center to be on and monitoring (e.g. Symantec, Windows Defender).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAntiSpywareRequired() {
        return this._antiSpywareRequired;
    }
    /**
     * Gets the antivirusRequired property value. Require any Antivirus solution registered with Windows Decurity Center to be on and monitoring (e.g. Symantec, Windows Defender).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAntivirusRequired() {
        return this._antivirusRequired;
    }
    /**
     * Gets the bitLockerEnabled property value. Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBitLockerEnabled() {
        return this._bitLockerEnabled;
    }
    /**
     * Gets the codeIntegrityEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCodeIntegrityEnabled() {
        return this._codeIntegrityEnabled;
    }
    /**
     * Gets the configurationManagerComplianceRequired property value. Require to consider SCCM Compliance state into consideration for Intune Compliance State.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConfigurationManagerComplianceRequired() {
        return this._configurationManagerComplianceRequired;
    }
    /**
     * Gets the defenderEnabled property value. Require Windows Defender Antimalware on Windows devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefenderEnabled() {
        return this._defenderEnabled;
    }
    /**
     * Gets the defenderVersion property value. Require Windows Defender Antimalware minimum version on Windows devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefenderVersion() {
        return this._defenderVersion;
    }
    /**
     * Gets the deviceCompliancePolicyScript property value. Not yet documented
     * @return a deviceCompliancePolicyScript
     */
    @javax.annotation.Nullable
    public DeviceCompliancePolicyScript getDeviceCompliancePolicyScript() {
        return this._deviceCompliancePolicyScript;
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
     * Gets the deviceThreatProtectionRequiredSecurityLevel property value. Require Device Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     * @return a deviceThreatProtectionLevel
     */
    @javax.annotation.Nullable
    public DeviceThreatProtectionLevel getDeviceThreatProtectionRequiredSecurityLevel() {
        return this._deviceThreatProtectionRequiredSecurityLevel;
    }
    /**
     * Gets the earlyLaunchAntiMalwareDriverEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEarlyLaunchAntiMalwareDriverEnabled() {
        return this._earlyLaunchAntiMalwareDriverEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10CompliancePolicy currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activeFirewallRequired", (n) -> { currentObject.setActiveFirewallRequired(n.getBooleanValue()); });
            this.put("antiSpywareRequired", (n) -> { currentObject.setAntiSpywareRequired(n.getBooleanValue()); });
            this.put("antivirusRequired", (n) -> { currentObject.setAntivirusRequired(n.getBooleanValue()); });
            this.put("bitLockerEnabled", (n) -> { currentObject.setBitLockerEnabled(n.getBooleanValue()); });
            this.put("codeIntegrityEnabled", (n) -> { currentObject.setCodeIntegrityEnabled(n.getBooleanValue()); });
            this.put("configurationManagerComplianceRequired", (n) -> { currentObject.setConfigurationManagerComplianceRequired(n.getBooleanValue()); });
            this.put("defenderEnabled", (n) -> { currentObject.setDefenderEnabled(n.getBooleanValue()); });
            this.put("defenderVersion", (n) -> { currentObject.setDefenderVersion(n.getStringValue()); });
            this.put("deviceCompliancePolicyScript", (n) -> { currentObject.setDeviceCompliancePolicyScript(n.getObjectValue(DeviceCompliancePolicyScript::createFromDiscriminatorValue)); });
            this.put("deviceThreatProtectionEnabled", (n) -> { currentObject.setDeviceThreatProtectionEnabled(n.getBooleanValue()); });
            this.put("deviceThreatProtectionRequiredSecurityLevel", (n) -> { currentObject.setDeviceThreatProtectionRequiredSecurityLevel(n.getEnumValue(DeviceThreatProtectionLevel.class)); });
            this.put("earlyLaunchAntiMalwareDriverEnabled", (n) -> { currentObject.setEarlyLaunchAntiMalwareDriverEnabled(n.getBooleanValue()); });
            this.put("mobileOsMaximumVersion", (n) -> { currentObject.setMobileOsMaximumVersion(n.getStringValue()); });
            this.put("mobileOsMinimumVersion", (n) -> { currentObject.setMobileOsMinimumVersion(n.getStringValue()); });
            this.put("osMaximumVersion", (n) -> { currentObject.setOsMaximumVersion(n.getStringValue()); });
            this.put("osMinimumVersion", (n) -> { currentObject.setOsMinimumVersion(n.getStringValue()); });
            this.put("passwordBlockSimple", (n) -> { currentObject.setPasswordBlockSimple(n.getBooleanValue()); });
            this.put("passwordExpirationDays", (n) -> { currentObject.setPasswordExpirationDays(n.getIntegerValue()); });
            this.put("passwordMinimumCharacterSetCount", (n) -> { currentObject.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
            this.put("passwordMinimumLength", (n) -> { currentObject.setPasswordMinimumLength(n.getIntegerValue()); });
            this.put("passwordMinutesOfInactivityBeforeLock", (n) -> { currentObject.setPasswordMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
            this.put("passwordPreviousPasswordBlockCount", (n) -> { currentObject.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
            this.put("passwordRequired", (n) -> { currentObject.setPasswordRequired(n.getBooleanValue()); });
            this.put("passwordRequiredToUnlockFromIdle", (n) -> { currentObject.setPasswordRequiredToUnlockFromIdle(n.getBooleanValue()); });
            this.put("passwordRequiredType", (n) -> { currentObject.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
            this.put("requireHealthyDeviceReport", (n) -> { currentObject.setRequireHealthyDeviceReport(n.getBooleanValue()); });
            this.put("rtpEnabled", (n) -> { currentObject.setRtpEnabled(n.getBooleanValue()); });
            this.put("secureBootEnabled", (n) -> { currentObject.setSecureBootEnabled(n.getBooleanValue()); });
            this.put("signatureOutOfDate", (n) -> { currentObject.setSignatureOutOfDate(n.getBooleanValue()); });
            this.put("storageRequireEncryption", (n) -> { currentObject.setStorageRequireEncryption(n.getBooleanValue()); });
            this.put("tpmRequired", (n) -> { currentObject.setTpmRequired(n.getBooleanValue()); });
            this.put("validOperatingSystemBuildRanges", (n) -> { currentObject.setValidOperatingSystemBuildRanges(n.getCollectionOfObjectValues(OperatingSystemVersionRange::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the mobileOsMaximumVersion property value. Maximum Windows Phone version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMobileOsMaximumVersion() {
        return this._mobileOsMaximumVersion;
    }
    /**
     * Gets the mobileOsMinimumVersion property value. Minimum Windows Phone version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMobileOsMinimumVersion() {
        return this._mobileOsMinimumVersion;
    }
    /**
     * Gets the osMaximumVersion property value. Maximum Windows 10 version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsMaximumVersion() {
        return this._osMaximumVersion;
    }
    /**
     * Gets the osMinimumVersion property value. Minimum Windows 10 version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsMinimumVersion() {
        return this._osMinimumVersion;
    }
    /**
     * Gets the passwordBlockSimple property value. Indicates whether or not to block simple password.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this._passwordBlockSimple;
    }
    /**
     * Gets the passwordExpirationDays property value. The password expiration in days.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this._passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this._passwordMinimumCharacterSetCount;
    }
    /**
     * Gets the passwordMinimumLength property value. The minimum password length.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this._passwordMinimumLength;
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
     * Gets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this._passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequired property value. Require a password to unlock Windows device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this._passwordRequired;
    }
    /**
     * Gets the passwordRequiredToUnlockFromIdle property value. Require a password to unlock an idle device.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasswordRequiredToUnlockFromIdle() {
        return this._passwordRequiredToUnlockFromIdle;
    }
    /**
     * Gets the passwordRequiredType property value. The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
     * @return a requiredPasswordType
     */
    @javax.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this._passwordRequiredType;
    }
    /**
     * Gets the requireHealthyDeviceReport property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireHealthyDeviceReport() {
        return this._requireHealthyDeviceReport;
    }
    /**
     * Gets the rtpEnabled property value. Require Windows Defender Antimalware Real-Time Protection on Windows devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRtpEnabled() {
        return this._rtpEnabled;
    }
    /**
     * Gets the secureBootEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecureBootEnabled() {
        return this._secureBootEnabled;
    }
    /**
     * Gets the signatureOutOfDate property value. Require Windows Defender Antimalware Signature to be up to date on Windows devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSignatureOutOfDate() {
        return this._signatureOutOfDate;
    }
    /**
     * Gets the storageRequireEncryption property value. Require encryption on windows devices.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageRequireEncryption() {
        return this._storageRequireEncryption;
    }
    /**
     * Gets the tpmRequired property value. Require Trusted Platform Module(TPM) to be present.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTpmRequired() {
        return this._tpmRequired;
    }
    /**
     * Gets the validOperatingSystemBuildRanges property value. The valid operating system build ranges on Windows devices. This collection can contain a maximum of 10000 elements.
     * @return a operatingSystemVersionRange
     */
    @javax.annotation.Nullable
    public java.util.List<OperatingSystemVersionRange> getValidOperatingSystemBuildRanges() {
        return this._validOperatingSystemBuildRanges;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("activeFirewallRequired", this.getActiveFirewallRequired());
        writer.writeBooleanValue("antiSpywareRequired", this.getAntiSpywareRequired());
        writer.writeBooleanValue("antivirusRequired", this.getAntivirusRequired());
        writer.writeBooleanValue("bitLockerEnabled", this.getBitLockerEnabled());
        writer.writeBooleanValue("codeIntegrityEnabled", this.getCodeIntegrityEnabled());
        writer.writeBooleanValue("configurationManagerComplianceRequired", this.getConfigurationManagerComplianceRequired());
        writer.writeBooleanValue("defenderEnabled", this.getDefenderEnabled());
        writer.writeStringValue("defenderVersion", this.getDefenderVersion());
        writer.writeObjectValue("deviceCompliancePolicyScript", this.getDeviceCompliancePolicyScript());
        writer.writeBooleanValue("deviceThreatProtectionEnabled", this.getDeviceThreatProtectionEnabled());
        writer.writeEnumValue("deviceThreatProtectionRequiredSecurityLevel", this.getDeviceThreatProtectionRequiredSecurityLevel());
        writer.writeBooleanValue("earlyLaunchAntiMalwareDriverEnabled", this.getEarlyLaunchAntiMalwareDriverEnabled());
        writer.writeStringValue("mobileOsMaximumVersion", this.getMobileOsMaximumVersion());
        writer.writeStringValue("mobileOsMinimumVersion", this.getMobileOsMinimumVersion());
        writer.writeStringValue("osMaximumVersion", this.getOsMaximumVersion());
        writer.writeStringValue("osMinimumVersion", this.getOsMinimumVersion());
        writer.writeBooleanValue("passwordBlockSimple", this.getPasswordBlockSimple());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumCharacterSetCount", this.getPasswordMinimumCharacterSetCount());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeLock", this.getPasswordMinutesOfInactivityBeforeLock());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeBooleanValue("passwordRequired", this.getPasswordRequired());
        writer.writeBooleanValue("passwordRequiredToUnlockFromIdle", this.getPasswordRequiredToUnlockFromIdle());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeBooleanValue("requireHealthyDeviceReport", this.getRequireHealthyDeviceReport());
        writer.writeBooleanValue("rtpEnabled", this.getRtpEnabled());
        writer.writeBooleanValue("secureBootEnabled", this.getSecureBootEnabled());
        writer.writeBooleanValue("signatureOutOfDate", this.getSignatureOutOfDate());
        writer.writeBooleanValue("storageRequireEncryption", this.getStorageRequireEncryption());
        writer.writeBooleanValue("tpmRequired", this.getTpmRequired());
        writer.writeCollectionOfObjectValues("validOperatingSystemBuildRanges", this.getValidOperatingSystemBuildRanges());
    }
    /**
     * Sets the activeFirewallRequired property value. Require active firewall on Windows devices.
     * @param value Value to set for the activeFirewallRequired property.
     * @return a void
     */
    public void setActiveFirewallRequired(@javax.annotation.Nullable final Boolean value) {
        this._activeFirewallRequired = value;
    }
    /**
     * Sets the antiSpywareRequired property value. Require any AntiSpyware solution registered with Windows Decurity Center to be on and monitoring (e.g. Symantec, Windows Defender).
     * @param value Value to set for the antiSpywareRequired property.
     * @return a void
     */
    public void setAntiSpywareRequired(@javax.annotation.Nullable final Boolean value) {
        this._antiSpywareRequired = value;
    }
    /**
     * Sets the antivirusRequired property value. Require any Antivirus solution registered with Windows Decurity Center to be on and monitoring (e.g. Symantec, Windows Defender).
     * @param value Value to set for the antivirusRequired property.
     * @return a void
     */
    public void setAntivirusRequired(@javax.annotation.Nullable final Boolean value) {
        this._antivirusRequired = value;
    }
    /**
     * Sets the bitLockerEnabled property value. Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
     * @param value Value to set for the bitLockerEnabled property.
     * @return a void
     */
    public void setBitLockerEnabled(@javax.annotation.Nullable final Boolean value) {
        this._bitLockerEnabled = value;
    }
    /**
     * Sets the codeIntegrityEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @param value Value to set for the codeIntegrityEnabled property.
     * @return a void
     */
    public void setCodeIntegrityEnabled(@javax.annotation.Nullable final Boolean value) {
        this._codeIntegrityEnabled = value;
    }
    /**
     * Sets the configurationManagerComplianceRequired property value. Require to consider SCCM Compliance state into consideration for Intune Compliance State.
     * @param value Value to set for the configurationManagerComplianceRequired property.
     * @return a void
     */
    public void setConfigurationManagerComplianceRequired(@javax.annotation.Nullable final Boolean value) {
        this._configurationManagerComplianceRequired = value;
    }
    /**
     * Sets the defenderEnabled property value. Require Windows Defender Antimalware on Windows devices.
     * @param value Value to set for the defenderEnabled property.
     * @return a void
     */
    public void setDefenderEnabled(@javax.annotation.Nullable final Boolean value) {
        this._defenderEnabled = value;
    }
    /**
     * Sets the defenderVersion property value. Require Windows Defender Antimalware minimum version on Windows devices.
     * @param value Value to set for the defenderVersion property.
     * @return a void
     */
    public void setDefenderVersion(@javax.annotation.Nullable final String value) {
        this._defenderVersion = value;
    }
    /**
     * Sets the deviceCompliancePolicyScript property value. Not yet documented
     * @param value Value to set for the deviceCompliancePolicyScript property.
     * @return a void
     */
    public void setDeviceCompliancePolicyScript(@javax.annotation.Nullable final DeviceCompliancePolicyScript value) {
        this._deviceCompliancePolicyScript = value;
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
     * Sets the deviceThreatProtectionRequiredSecurityLevel property value. Require Device Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     * @param value Value to set for the deviceThreatProtectionRequiredSecurityLevel property.
     * @return a void
     */
    public void setDeviceThreatProtectionRequiredSecurityLevel(@javax.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this._deviceThreatProtectionRequiredSecurityLevel = value;
    }
    /**
     * Sets the earlyLaunchAntiMalwareDriverEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.
     * @param value Value to set for the earlyLaunchAntiMalwareDriverEnabled property.
     * @return a void
     */
    public void setEarlyLaunchAntiMalwareDriverEnabled(@javax.annotation.Nullable final Boolean value) {
        this._earlyLaunchAntiMalwareDriverEnabled = value;
    }
    /**
     * Sets the mobileOsMaximumVersion property value. Maximum Windows Phone version.
     * @param value Value to set for the mobileOsMaximumVersion property.
     * @return a void
     */
    public void setMobileOsMaximumVersion(@javax.annotation.Nullable final String value) {
        this._mobileOsMaximumVersion = value;
    }
    /**
     * Sets the mobileOsMinimumVersion property value. Minimum Windows Phone version.
     * @param value Value to set for the mobileOsMinimumVersion property.
     * @return a void
     */
    public void setMobileOsMinimumVersion(@javax.annotation.Nullable final String value) {
        this._mobileOsMinimumVersion = value;
    }
    /**
     * Sets the osMaximumVersion property value. Maximum Windows 10 version.
     * @param value Value to set for the osMaximumVersion property.
     * @return a void
     */
    public void setOsMaximumVersion(@javax.annotation.Nullable final String value) {
        this._osMaximumVersion = value;
    }
    /**
     * Sets the osMinimumVersion property value. Minimum Windows 10 version.
     * @param value Value to set for the osMinimumVersion property.
     * @return a void
     */
    public void setOsMinimumVersion(@javax.annotation.Nullable final String value) {
        this._osMinimumVersion = value;
    }
    /**
     * Sets the passwordBlockSimple property value. Indicates whether or not to block simple password.
     * @param value Value to set for the passwordBlockSimple property.
     * @return a void
     */
    public void setPasswordBlockSimple(@javax.annotation.Nullable final Boolean value) {
        this._passwordBlockSimple = value;
    }
    /**
     * Sets the passwordExpirationDays property value. The password expiration in days.
     * @param value Value to set for the passwordExpirationDays property.
     * @return a void
     */
    public void setPasswordExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     * @return a void
     */
    public void setPasswordMinimumCharacterSetCount(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. The minimum password length.
     * @param value Value to set for the passwordMinimumLength property.
     * @return a void
     */
    public void setPasswordMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passwordMinimumLength = value;
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
     * Sets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of.
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     * @return a void
     */
    public void setPasswordPreviousPasswordBlockCount(@javax.annotation.Nullable final Integer value) {
        this._passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Require a password to unlock Windows device.
     * @param value Value to set for the passwordRequired property.
     * @return a void
     */
    public void setPasswordRequired(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredToUnlockFromIdle property value. Require a password to unlock an idle device.
     * @param value Value to set for the passwordRequiredToUnlockFromIdle property.
     * @return a void
     */
    public void setPasswordRequiredToUnlockFromIdle(@javax.annotation.Nullable final Boolean value) {
        this._passwordRequiredToUnlockFromIdle = value;
    }
    /**
     * Sets the passwordRequiredType property value. The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
     * @param value Value to set for the passwordRequiredType property.
     * @return a void
     */
    public void setPasswordRequiredType(@javax.annotation.Nullable final RequiredPasswordType value) {
        this._passwordRequiredType = value;
    }
    /**
     * Sets the requireHealthyDeviceReport property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @param value Value to set for the requireHealthyDeviceReport property.
     * @return a void
     */
    public void setRequireHealthyDeviceReport(@javax.annotation.Nullable final Boolean value) {
        this._requireHealthyDeviceReport = value;
    }
    /**
     * Sets the rtpEnabled property value. Require Windows Defender Antimalware Real-Time Protection on Windows devices.
     * @param value Value to set for the rtpEnabled property.
     * @return a void
     */
    public void setRtpEnabled(@javax.annotation.Nullable final Boolean value) {
        this._rtpEnabled = value;
    }
    /**
     * Sets the secureBootEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
     * @param value Value to set for the secureBootEnabled property.
     * @return a void
     */
    public void setSecureBootEnabled(@javax.annotation.Nullable final Boolean value) {
        this._secureBootEnabled = value;
    }
    /**
     * Sets the signatureOutOfDate property value. Require Windows Defender Antimalware Signature to be up to date on Windows devices.
     * @param value Value to set for the signatureOutOfDate property.
     * @return a void
     */
    public void setSignatureOutOfDate(@javax.annotation.Nullable final Boolean value) {
        this._signatureOutOfDate = value;
    }
    /**
     * Sets the storageRequireEncryption property value. Require encryption on windows devices.
     * @param value Value to set for the storageRequireEncryption property.
     * @return a void
     */
    public void setStorageRequireEncryption(@javax.annotation.Nullable final Boolean value) {
        this._storageRequireEncryption = value;
    }
    /**
     * Sets the tpmRequired property value. Require Trusted Platform Module(TPM) to be present.
     * @param value Value to set for the tpmRequired property.
     * @return a void
     */
    public void setTpmRequired(@javax.annotation.Nullable final Boolean value) {
        this._tpmRequired = value;
    }
    /**
     * Sets the validOperatingSystemBuildRanges property value. The valid operating system build ranges on Windows devices. This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the validOperatingSystemBuildRanges property.
     * @return a void
     */
    public void setValidOperatingSystemBuildRanges(@javax.annotation.Nullable final java.util.List<OperatingSystemVersionRange> value) {
        this._validOperatingSystemBuildRanges = value;
    }
}
