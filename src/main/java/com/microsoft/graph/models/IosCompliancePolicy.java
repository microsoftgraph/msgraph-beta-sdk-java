package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This class contains compliance settings for IOS.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosCompliancePolicy extends DeviceCompliancePolicy implements Parsable {
    /**
     * Device threat protection levels for the Device Threat Protection API.
     */
    private DeviceThreatProtectionLevel advancedThreatProtectionRequiredSecurityLevel;
    /**
     * Require that devices have enabled device threat protection .
     */
    private Boolean deviceThreatProtectionEnabled;
    /**
     * Device threat protection levels for the Device Threat Protection API.
     */
    private DeviceThreatProtectionLevel deviceThreatProtectionRequiredSecurityLevel;
    /**
     * Indicates whether or not to require a managed email profile.
     */
    private Boolean managedEmailProfileRequired;
    /**
     * Maximum IOS build version.
     */
    private String osMaximumBuildVersion;
    /**
     * Maximum IOS version.
     */
    private String osMaximumVersion;
    /**
     * Minimum IOS build version.
     */
    private String osMinimumBuildVersion;
    /**
     * Minimum IOS version.
     */
    private String osMinimumVersion;
    /**
     * Indicates whether or not to block simple passcodes.
     */
    private Boolean passcodeBlockSimple;
    /**
     * Number of days before the passcode expires. Valid values 1 to 65535
     */
    private Integer passcodeExpirationDays;
    /**
     * The number of character sets required in the password.
     */
    private Integer passcodeMinimumCharacterSetCount;
    /**
     * Minimum length of passcode. Valid values 4 to 14
     */
    private Integer passcodeMinimumLength;
    /**
     * Minutes of inactivity before a passcode is required.
     */
    private Integer passcodeMinutesOfInactivityBeforeLock;
    /**
     * Minutes of inactivity before the screen times out.
     */
    private Integer passcodeMinutesOfInactivityBeforeScreenTimeout;
    /**
     * Number of previous passcodes to block. Valid values 1 to 24
     */
    private Integer passcodePreviousPasscodeBlockCount;
    /**
     * Indicates whether or not to require a passcode.
     */
    private Boolean passcodeRequired;
    /**
     * Possible values of required passwords.
     */
    private RequiredPasswordType passcodeRequiredType;
    /**
     * Require the device to not have the specified apps installed. This collection can contain a maximum of 100 elements.
     */
    private java.util.List<AppListItem> restrictedApps;
    /**
     * Devices must not be jailbroken or rooted.
     */
    private Boolean securityBlockJailbrokenDevices;
    /**
     * Instantiates a new IosCompliancePolicy and sets the default values.
     */
    public IosCompliancePolicy() {
        super();
        this.setOdataType("#microsoft.graph.iosCompliancePolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosCompliancePolicy
     */
    @jakarta.annotation.Nonnull
    public static IosCompliancePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosCompliancePolicy();
    }
    /**
     * Gets the advancedThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @return a DeviceThreatProtectionLevel
     */
    @jakarta.annotation.Nullable
    public DeviceThreatProtectionLevel getAdvancedThreatProtectionRequiredSecurityLevel() {
        return this.advancedThreatProtectionRequiredSecurityLevel;
    }
    /**
     * Gets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection .
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceThreatProtectionEnabled() {
        return this.deviceThreatProtectionEnabled;
    }
    /**
     * Gets the deviceThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @return a DeviceThreatProtectionLevel
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
        deserializerMap.put("managedEmailProfileRequired", (n) -> { this.setManagedEmailProfileRequired(n.getBooleanValue()); });
        deserializerMap.put("osMaximumBuildVersion", (n) -> { this.setOsMaximumBuildVersion(n.getStringValue()); });
        deserializerMap.put("osMaximumVersion", (n) -> { this.setOsMaximumVersion(n.getStringValue()); });
        deserializerMap.put("osMinimumBuildVersion", (n) -> { this.setOsMinimumBuildVersion(n.getStringValue()); });
        deserializerMap.put("osMinimumVersion", (n) -> { this.setOsMinimumVersion(n.getStringValue()); });
        deserializerMap.put("passcodeBlockSimple", (n) -> { this.setPasscodeBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passcodeExpirationDays", (n) -> { this.setPasscodeExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinimumCharacterSetCount", (n) -> { this.setPasscodeMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinimumLength", (n) -> { this.setPasscodeMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinutesOfInactivityBeforeLock", (n) -> { this.setPasscodeMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
        deserializerMap.put("passcodeMinutesOfInactivityBeforeScreenTimeout", (n) -> { this.setPasscodeMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
        deserializerMap.put("passcodePreviousPasscodeBlockCount", (n) -> { this.setPasscodePreviousPasscodeBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passcodeRequired", (n) -> { this.setPasscodeRequired(n.getBooleanValue()); });
        deserializerMap.put("passcodeRequiredType", (n) -> { this.setPasscodeRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        deserializerMap.put("restrictedApps", (n) -> { this.setRestrictedApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("securityBlockJailbrokenDevices", (n) -> { this.setSecurityBlockJailbrokenDevices(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the managedEmailProfileRequired property value. Indicates whether or not to require a managed email profile.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getManagedEmailProfileRequired() {
        return this.managedEmailProfileRequired;
    }
    /**
     * Gets the osMaximumBuildVersion property value. Maximum IOS build version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsMaximumBuildVersion() {
        return this.osMaximumBuildVersion;
    }
    /**
     * Gets the osMaximumVersion property value. Maximum IOS version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsMaximumVersion() {
        return this.osMaximumVersion;
    }
    /**
     * Gets the osMinimumBuildVersion property value. Minimum IOS build version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsMinimumBuildVersion() {
        return this.osMinimumBuildVersion;
    }
    /**
     * Gets the osMinimumVersion property value. Minimum IOS version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsMinimumVersion() {
        return this.osMinimumVersion;
    }
    /**
     * Gets the passcodeBlockSimple property value. Indicates whether or not to block simple passcodes.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasscodeBlockSimple() {
        return this.passcodeBlockSimple;
    }
    /**
     * Gets the passcodeExpirationDays property value. Number of days before the passcode expires. Valid values 1 to 65535
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeExpirationDays() {
        return this.passcodeExpirationDays;
    }
    /**
     * Gets the passcodeMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinimumCharacterSetCount() {
        return this.passcodeMinimumCharacterSetCount;
    }
    /**
     * Gets the passcodeMinimumLength property value. Minimum length of passcode. Valid values 4 to 14
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinimumLength() {
        return this.passcodeMinimumLength;
    }
    /**
     * Gets the passcodeMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a passcode is required.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinutesOfInactivityBeforeLock() {
        return this.passcodeMinutesOfInactivityBeforeLock;
    }
    /**
     * Gets the passcodeMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeMinutesOfInactivityBeforeScreenTimeout() {
        return this.passcodeMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passcodePreviousPasscodeBlockCount property value. Number of previous passcodes to block. Valid values 1 to 24
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodePreviousPasscodeBlockCount() {
        return this.passcodePreviousPasscodeBlockCount;
    }
    /**
     * Gets the passcodeRequired property value. Indicates whether or not to require a passcode.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasscodeRequired() {
        return this.passcodeRequired;
    }
    /**
     * Gets the passcodeRequiredType property value. Possible values of required passwords.
     * @return a RequiredPasswordType
     */
    @jakarta.annotation.Nullable
    public RequiredPasswordType getPasscodeRequiredType() {
        return this.passcodeRequiredType;
    }
    /**
     * Gets the restrictedApps property value. Require the device to not have the specified apps installed. This collection can contain a maximum of 100 elements.
     * @return a java.util.List<AppListItem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppListItem> getRestrictedApps() {
        return this.restrictedApps;
    }
    /**
     * Gets the securityBlockJailbrokenDevices property value. Devices must not be jailbroken or rooted.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityBlockJailbrokenDevices() {
        return this.securityBlockJailbrokenDevices;
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
        writer.writeBooleanValue("managedEmailProfileRequired", this.getManagedEmailProfileRequired());
        writer.writeStringValue("osMaximumBuildVersion", this.getOsMaximumBuildVersion());
        writer.writeStringValue("osMaximumVersion", this.getOsMaximumVersion());
        writer.writeStringValue("osMinimumBuildVersion", this.getOsMinimumBuildVersion());
        writer.writeStringValue("osMinimumVersion", this.getOsMinimumVersion());
        writer.writeBooleanValue("passcodeBlockSimple", this.getPasscodeBlockSimple());
        writer.writeIntegerValue("passcodeExpirationDays", this.getPasscodeExpirationDays());
        writer.writeIntegerValue("passcodeMinimumCharacterSetCount", this.getPasscodeMinimumCharacterSetCount());
        writer.writeIntegerValue("passcodeMinimumLength", this.getPasscodeMinimumLength());
        writer.writeIntegerValue("passcodeMinutesOfInactivityBeforeLock", this.getPasscodeMinutesOfInactivityBeforeLock());
        writer.writeIntegerValue("passcodeMinutesOfInactivityBeforeScreenTimeout", this.getPasscodeMinutesOfInactivityBeforeScreenTimeout());
        writer.writeIntegerValue("passcodePreviousPasscodeBlockCount", this.getPasscodePreviousPasscodeBlockCount());
        writer.writeBooleanValue("passcodeRequired", this.getPasscodeRequired());
        writer.writeEnumValue("passcodeRequiredType", this.getPasscodeRequiredType());
        writer.writeCollectionOfObjectValues("restrictedApps", this.getRestrictedApps());
        writer.writeBooleanValue("securityBlockJailbrokenDevices", this.getSecurityBlockJailbrokenDevices());
    }
    /**
     * Sets the advancedThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @param value Value to set for the advancedThreatProtectionRequiredSecurityLevel property.
     */
    public void setAdvancedThreatProtectionRequiredSecurityLevel(@jakarta.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this.advancedThreatProtectionRequiredSecurityLevel = value;
    }
    /**
     * Sets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection .
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
     * Sets the managedEmailProfileRequired property value. Indicates whether or not to require a managed email profile.
     * @param value Value to set for the managedEmailProfileRequired property.
     */
    public void setManagedEmailProfileRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.managedEmailProfileRequired = value;
    }
    /**
     * Sets the osMaximumBuildVersion property value. Maximum IOS build version.
     * @param value Value to set for the osMaximumBuildVersion property.
     */
    public void setOsMaximumBuildVersion(@jakarta.annotation.Nullable final String value) {
        this.osMaximumBuildVersion = value;
    }
    /**
     * Sets the osMaximumVersion property value. Maximum IOS version.
     * @param value Value to set for the osMaximumVersion property.
     */
    public void setOsMaximumVersion(@jakarta.annotation.Nullable final String value) {
        this.osMaximumVersion = value;
    }
    /**
     * Sets the osMinimumBuildVersion property value. Minimum IOS build version.
     * @param value Value to set for the osMinimumBuildVersion property.
     */
    public void setOsMinimumBuildVersion(@jakarta.annotation.Nullable final String value) {
        this.osMinimumBuildVersion = value;
    }
    /**
     * Sets the osMinimumVersion property value. Minimum IOS version.
     * @param value Value to set for the osMinimumVersion property.
     */
    public void setOsMinimumVersion(@jakarta.annotation.Nullable final String value) {
        this.osMinimumVersion = value;
    }
    /**
     * Sets the passcodeBlockSimple property value. Indicates whether or not to block simple passcodes.
     * @param value Value to set for the passcodeBlockSimple property.
     */
    public void setPasscodeBlockSimple(@jakarta.annotation.Nullable final Boolean value) {
        this.passcodeBlockSimple = value;
    }
    /**
     * Sets the passcodeExpirationDays property value. Number of days before the passcode expires. Valid values 1 to 65535
     * @param value Value to set for the passcodeExpirationDays property.
     */
    public void setPasscodeExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.passcodeExpirationDays = value;
    }
    /**
     * Sets the passcodeMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passcodeMinimumCharacterSetCount property.
     */
    public void setPasscodeMinimumCharacterSetCount(@jakarta.annotation.Nullable final Integer value) {
        this.passcodeMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passcodeMinimumLength property value. Minimum length of passcode. Valid values 4 to 14
     * @param value Value to set for the passcodeMinimumLength property.
     */
    public void setPasscodeMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.passcodeMinimumLength = value;
    }
    /**
     * Sets the passcodeMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a passcode is required.
     * @param value Value to set for the passcodeMinutesOfInactivityBeforeLock property.
     */
    public void setPasscodeMinutesOfInactivityBeforeLock(@jakarta.annotation.Nullable final Integer value) {
        this.passcodeMinutesOfInactivityBeforeLock = value;
    }
    /**
     * Sets the passcodeMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passcodeMinutesOfInactivityBeforeScreenTimeout property.
     */
    public void setPasscodeMinutesOfInactivityBeforeScreenTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.passcodeMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passcodePreviousPasscodeBlockCount property value. Number of previous passcodes to block. Valid values 1 to 24
     * @param value Value to set for the passcodePreviousPasscodeBlockCount property.
     */
    public void setPasscodePreviousPasscodeBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.passcodePreviousPasscodeBlockCount = value;
    }
    /**
     * Sets the passcodeRequired property value. Indicates whether or not to require a passcode.
     * @param value Value to set for the passcodeRequired property.
     */
    public void setPasscodeRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.passcodeRequired = value;
    }
    /**
     * Sets the passcodeRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passcodeRequiredType property.
     */
    public void setPasscodeRequiredType(@jakarta.annotation.Nullable final RequiredPasswordType value) {
        this.passcodeRequiredType = value;
    }
    /**
     * Sets the restrictedApps property value. Require the device to not have the specified apps installed. This collection can contain a maximum of 100 elements.
     * @param value Value to set for the restrictedApps property.
     */
    public void setRestrictedApps(@jakarta.annotation.Nullable final java.util.List<AppListItem> value) {
        this.restrictedApps = value;
    }
    /**
     * Sets the securityBlockJailbrokenDevices property value. Devices must not be jailbroken or rooted.
     * @param value Value to set for the securityBlockJailbrokenDevices property.
     */
    public void setSecurityBlockJailbrokenDevices(@jakarta.annotation.Nullable final Boolean value) {
        this.securityBlockJailbrokenDevices = value;
    }
}
