package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This class contains compliance settings for Mac OS.
 */
public class MacOSCompliancePolicy extends DeviceCompliancePolicy implements Parsable {
    /**
     * Device threat protection levels for the Device Threat Protection API.
     */
    private DeviceThreatProtectionLevel advancedThreatProtectionRequiredSecurityLevel;
    /**
     * Require that devices have enabled device threat protection.
     */
    private Boolean deviceThreatProtectionEnabled;
    /**
     * Device threat protection levels for the Device Threat Protection API.
     */
    private DeviceThreatProtectionLevel deviceThreatProtectionRequiredSecurityLevel;
    /**
     * Corresponds to the 'Block all incoming connections' option.
     */
    private Boolean firewallBlockAllIncoming;
    /**
     * Whether the firewall should be enabled or not.
     */
    private Boolean firewallEnabled;
    /**
     * Corresponds to 'Enable stealth mode.'
     */
    private Boolean firewallEnableStealthMode;
    /**
     * App source options for macOS Gatekeeper.
     */
    private MacOSGatekeeperAppSources gatekeeperAllowedAppSource;
    /**
     * Maximum MacOS build version.
     */
    private String osMaximumBuildVersion;
    /**
     * Maximum MacOS version.
     */
    private String osMaximumVersion;
    /**
     * Minimum MacOS build version.
     */
    private String osMinimumBuildVersion;
    /**
     * Minimum MacOS version.
     */
    private String osMinimumVersion;
    /**
     * Indicates whether or not to block simple passwords.
     */
    private Boolean passwordBlockSimple;
    /**
     * Number of days before the password expires. Valid values 1 to 65535
     */
    private Integer passwordExpirationDays;
    /**
     * The number of character sets required in the password.
     */
    private Integer passwordMinimumCharacterSetCount;
    /**
     * Minimum length of password. Valid values 4 to 14
     */
    private Integer passwordMinimumLength;
    /**
     * Minutes of inactivity before a password is required.
     */
    private Integer passwordMinutesOfInactivityBeforeLock;
    /**
     * Number of previous passwords to block. Valid values 1 to 24
     */
    private Integer passwordPreviousPasswordBlockCount;
    /**
     * Whether or not to require a password.
     */
    private Boolean passwordRequired;
    /**
     * Possible values of required passwords.
     */
    private RequiredPasswordType passwordRequiredType;
    /**
     * Require encryption on Mac OS devices.
     */
    private Boolean storageRequireEncryption;
    /**
     * Require that devices have enabled system integrity protection.
     */
    private Boolean systemIntegrityProtectionEnabled;
    /**
     * Instantiates a new macOSCompliancePolicy and sets the default values.
     */
    public MacOSCompliancePolicy() {
        super();
        this.setOdataType("#microsoft.graph.macOSCompliancePolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSCompliancePolicy
     */
    @jakarta.annotation.Nonnull
    public static MacOSCompliancePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSCompliancePolicy();
    }
    /**
     * Gets the advancedThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @return a deviceThreatProtectionLevel
     */
    @jakarta.annotation.Nullable
    public DeviceThreatProtectionLevel getAdvancedThreatProtectionRequiredSecurityLevel() {
        return this.advancedThreatProtectionRequiredSecurityLevel;
    }
    /**
     * Gets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceThreatProtectionEnabled() {
        return this.deviceThreatProtectionEnabled;
    }
    /**
     * Gets the deviceThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @return a deviceThreatProtectionLevel
     */
    @jakarta.annotation.Nullable
    public DeviceThreatProtectionLevel getDeviceThreatProtectionRequiredSecurityLevel() {
        return this.deviceThreatProtectionRequiredSecurityLevel;
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
        deserializerMap.put("firewallBlockAllIncoming", (n) -> { this.setFirewallBlockAllIncoming(n.getBooleanValue()); });
        deserializerMap.put("firewallEnabled", (n) -> { this.setFirewallEnabled(n.getBooleanValue()); });
        deserializerMap.put("firewallEnableStealthMode", (n) -> { this.setFirewallEnableStealthMode(n.getBooleanValue()); });
        deserializerMap.put("gatekeeperAllowedAppSource", (n) -> { this.setGatekeeperAllowedAppSource(n.getEnumValue(MacOSGatekeeperAppSources.class)); });
        deserializerMap.put("osMaximumBuildVersion", (n) -> { this.setOsMaximumBuildVersion(n.getStringValue()); });
        deserializerMap.put("osMaximumVersion", (n) -> { this.setOsMaximumVersion(n.getStringValue()); });
        deserializerMap.put("osMinimumBuildVersion", (n) -> { this.setOsMinimumBuildVersion(n.getStringValue()); });
        deserializerMap.put("osMinimumVersion", (n) -> { this.setOsMinimumVersion(n.getStringValue()); });
        deserializerMap.put("passwordBlockSimple", (n) -> { this.setPasswordBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumCharacterSetCount", (n) -> { this.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeLock", (n) -> { this.setPasswordMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequired", (n) -> { this.setPasswordRequired(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        deserializerMap.put("storageRequireEncryption", (n) -> { this.setStorageRequireEncryption(n.getBooleanValue()); });
        deserializerMap.put("systemIntegrityProtectionEnabled", (n) -> { this.setSystemIntegrityProtectionEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firewallBlockAllIncoming property value. Corresponds to the 'Block all incoming connections' option.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallBlockAllIncoming() {
        return this.firewallBlockAllIncoming;
    }
    /**
     * Gets the firewallEnabled property value. Whether the firewall should be enabled or not.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallEnabled() {
        return this.firewallEnabled;
    }
    /**
     * Gets the firewallEnableStealthMode property value. Corresponds to 'Enable stealth mode.'
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallEnableStealthMode() {
        return this.firewallEnableStealthMode;
    }
    /**
     * Gets the gatekeeperAllowedAppSource property value. App source options for macOS Gatekeeper.
     * @return a macOSGatekeeperAppSources
     */
    @jakarta.annotation.Nullable
    public MacOSGatekeeperAppSources getGatekeeperAllowedAppSource() {
        return this.gatekeeperAllowedAppSource;
    }
    /**
     * Gets the osMaximumBuildVersion property value. Maximum MacOS build version.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsMaximumBuildVersion() {
        return this.osMaximumBuildVersion;
    }
    /**
     * Gets the osMaximumVersion property value. Maximum MacOS version.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsMaximumVersion() {
        return this.osMaximumVersion;
    }
    /**
     * Gets the osMinimumBuildVersion property value. Minimum MacOS build version.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsMinimumBuildVersion() {
        return this.osMinimumBuildVersion;
    }
    /**
     * Gets the osMinimumVersion property value. Minimum MacOS version.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOsMinimumVersion() {
        return this.osMinimumVersion;
    }
    /**
     * Gets the passwordBlockSimple property value. Indicates whether or not to block simple passwords.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this.passwordBlockSimple;
    }
    /**
     * Gets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 65535
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this.passwordMinimumCharacterSetCount;
    }
    /**
     * Gets the passwordMinimumLength property value. Minimum length of password. Valid values 4 to 14
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeLock() {
        return this.passwordMinutesOfInactivityBeforeLock;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 1 to 24
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequired property value. Whether or not to require a password.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.passwordRequired;
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a requiredPasswordType
     */
    @jakarta.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this.passwordRequiredType;
    }
    /**
     * Gets the storageRequireEncryption property value. Require encryption on Mac OS devices.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageRequireEncryption() {
        return this.storageRequireEncryption;
    }
    /**
     * Gets the systemIntegrityProtectionEnabled property value. Require that devices have enabled system integrity protection.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSystemIntegrityProtectionEnabled() {
        return this.systemIntegrityProtectionEnabled;
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
        writer.writeBooleanValue("firewallBlockAllIncoming", this.getFirewallBlockAllIncoming());
        writer.writeBooleanValue("firewallEnabled", this.getFirewallEnabled());
        writer.writeBooleanValue("firewallEnableStealthMode", this.getFirewallEnableStealthMode());
        writer.writeEnumValue("gatekeeperAllowedAppSource", this.getGatekeeperAllowedAppSource());
        writer.writeStringValue("osMaximumBuildVersion", this.getOsMaximumBuildVersion());
        writer.writeStringValue("osMaximumVersion", this.getOsMaximumVersion());
        writer.writeStringValue("osMinimumBuildVersion", this.getOsMinimumBuildVersion());
        writer.writeStringValue("osMinimumVersion", this.getOsMinimumVersion());
        writer.writeBooleanValue("passwordBlockSimple", this.getPasswordBlockSimple());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumCharacterSetCount", this.getPasswordMinimumCharacterSetCount());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeLock", this.getPasswordMinutesOfInactivityBeforeLock());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeBooleanValue("passwordRequired", this.getPasswordRequired());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeBooleanValue("storageRequireEncryption", this.getStorageRequireEncryption());
        writer.writeBooleanValue("systemIntegrityProtectionEnabled", this.getSystemIntegrityProtectionEnabled());
    }
    /**
     * Sets the advancedThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @param value Value to set for the advancedThreatProtectionRequiredSecurityLevel property.
     */
    public void setAdvancedThreatProtectionRequiredSecurityLevel(@jakarta.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this.advancedThreatProtectionRequiredSecurityLevel = value;
    }
    /**
     * Sets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection.
     * @param value Value to set for the deviceThreatProtectionEnabled property.
     */
    public void setDeviceThreatProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.deviceThreatProtectionEnabled = value;
    }
    /**
     * Sets the deviceThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @param value Value to set for the deviceThreatProtectionRequiredSecurityLevel property.
     */
    public void setDeviceThreatProtectionRequiredSecurityLevel(@jakarta.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this.deviceThreatProtectionRequiredSecurityLevel = value;
    }
    /**
     * Sets the firewallBlockAllIncoming property value. Corresponds to the 'Block all incoming connections' option.
     * @param value Value to set for the firewallBlockAllIncoming property.
     */
    public void setFirewallBlockAllIncoming(@jakarta.annotation.Nullable final Boolean value) {
        this.firewallBlockAllIncoming = value;
    }
    /**
     * Sets the firewallEnabled property value. Whether the firewall should be enabled or not.
     * @param value Value to set for the firewallEnabled property.
     */
    public void setFirewallEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.firewallEnabled = value;
    }
    /**
     * Sets the firewallEnableStealthMode property value. Corresponds to 'Enable stealth mode.'
     * @param value Value to set for the firewallEnableStealthMode property.
     */
    public void setFirewallEnableStealthMode(@jakarta.annotation.Nullable final Boolean value) {
        this.firewallEnableStealthMode = value;
    }
    /**
     * Sets the gatekeeperAllowedAppSource property value. App source options for macOS Gatekeeper.
     * @param value Value to set for the gatekeeperAllowedAppSource property.
     */
    public void setGatekeeperAllowedAppSource(@jakarta.annotation.Nullable final MacOSGatekeeperAppSources value) {
        this.gatekeeperAllowedAppSource = value;
    }
    /**
     * Sets the osMaximumBuildVersion property value. Maximum MacOS build version.
     * @param value Value to set for the osMaximumBuildVersion property.
     */
    public void setOsMaximumBuildVersion(@jakarta.annotation.Nullable final String value) {
        this.osMaximumBuildVersion = value;
    }
    /**
     * Sets the osMaximumVersion property value. Maximum MacOS version.
     * @param value Value to set for the osMaximumVersion property.
     */
    public void setOsMaximumVersion(@jakarta.annotation.Nullable final String value) {
        this.osMaximumVersion = value;
    }
    /**
     * Sets the osMinimumBuildVersion property value. Minimum MacOS build version.
     * @param value Value to set for the osMinimumBuildVersion property.
     */
    public void setOsMinimumBuildVersion(@jakarta.annotation.Nullable final String value) {
        this.osMinimumBuildVersion = value;
    }
    /**
     * Sets the osMinimumVersion property value. Minimum MacOS version.
     * @param value Value to set for the osMinimumVersion property.
     */
    public void setOsMinimumVersion(@jakarta.annotation.Nullable final String value) {
        this.osMinimumVersion = value;
    }
    /**
     * Sets the passwordBlockSimple property value. Indicates whether or not to block simple passwords.
     * @param value Value to set for the passwordBlockSimple property.
     */
    public void setPasswordBlockSimple(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordBlockSimple = value;
    }
    /**
     * Sets the passwordExpirationDays property value. Number of days before the password expires. Valid values 1 to 65535
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     */
    public void setPasswordMinimumCharacterSetCount(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. Minimum length of password. Valid values 4 to 14
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeLock property.
     */
    public void setPasswordMinutesOfInactivityBeforeLock(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinutesOfInactivityBeforeLock = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. Number of previous passwords to block. Valid values 1 to 24
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Whether or not to require a password.
     * @param value Value to set for the passwordRequired property.
     */
    public void setPasswordRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final RequiredPasswordType value) {
        this.passwordRequiredType = value;
    }
    /**
     * Sets the storageRequireEncryption property value. Require encryption on Mac OS devices.
     * @param value Value to set for the storageRequireEncryption property.
     */
    public void setStorageRequireEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.storageRequireEncryption = value;
    }
    /**
     * Sets the systemIntegrityProtectionEnabled property value. Require that devices have enabled system integrity protection.
     * @param value Value to set for the systemIntegrityProtectionEnabled property.
     */
    public void setSystemIntegrityProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.systemIntegrityProtectionEnabled = value;
    }
}
