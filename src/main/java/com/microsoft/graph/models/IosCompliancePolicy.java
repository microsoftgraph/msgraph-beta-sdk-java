package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosCompliancePolicy extends DeviceCompliancePolicy implements Parsable {
    /** Device threat protection levels for the Device Threat Protection API. */
    private DeviceThreatProtectionLevel _advancedThreatProtectionRequiredSecurityLevel;
    /** Require that devices have enabled device threat protection . */
    private Boolean _deviceThreatProtectionEnabled;
    /** Device threat protection levels for the Device Threat Protection API. */
    private DeviceThreatProtectionLevel _deviceThreatProtectionRequiredSecurityLevel;
    /** Indicates whether or not to require a managed email profile. */
    private Boolean _managedEmailProfileRequired;
    /** Maximum IOS build version. */
    private String _osMaximumBuildVersion;
    /** Maximum IOS version. */
    private String _osMaximumVersion;
    /** Minimum IOS build version. */
    private String _osMinimumBuildVersion;
    /** Minimum IOS version. */
    private String _osMinimumVersion;
    /** Indicates whether or not to block simple passcodes. */
    private Boolean _passcodeBlockSimple;
    /** Number of days before the passcode expires. Valid values 1 to 65535 */
    private Integer _passcodeExpirationDays;
    /** The number of character sets required in the password. */
    private Integer _passcodeMinimumCharacterSetCount;
    /** Minimum length of passcode. Valid values 4 to 14 */
    private Integer _passcodeMinimumLength;
    /** Minutes of inactivity before a passcode is required. */
    private Integer _passcodeMinutesOfInactivityBeforeLock;
    /** Minutes of inactivity before the screen times out. */
    private Integer _passcodeMinutesOfInactivityBeforeScreenTimeout;
    /** Number of previous passcodes to block. Valid values 1 to 24 */
    private Integer _passcodePreviousPasscodeBlockCount;
    /** Indicates whether or not to require a passcode. */
    private Boolean _passcodeRequired;
    /** Possible values of required passwords. */
    private RequiredPasswordType _passcodeRequiredType;
    /** Require the device to not have the specified apps installed. This collection can contain a maximum of 100 elements. */
    private java.util.List<AppListItem> _restrictedApps;
    /** Devices must not be jailbroken or rooted. */
    private Boolean _securityBlockJailbrokenDevices;
    /**
     * Instantiates a new IosCompliancePolicy and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static IosCompliancePolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosCompliancePolicy();
    }
    /**
     * Gets the advancedThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @return a deviceThreatProtectionLevel
     */
    @javax.annotation.Nullable
    public DeviceThreatProtectionLevel getAdvancedThreatProtectionRequiredSecurityLevel() {
        return this._advancedThreatProtectionRequiredSecurityLevel;
    }
    /**
     * Gets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection .
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceThreatProtectionEnabled() {
        return this._deviceThreatProtectionEnabled;
    }
    /**
     * Gets the deviceThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
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
        final IosCompliancePolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("advancedThreatProtectionRequiredSecurityLevel", (n) -> { currentObject.setAdvancedThreatProtectionRequiredSecurityLevel(n.getEnumValue(DeviceThreatProtectionLevel.class)); });
            this.put("deviceThreatProtectionEnabled", (n) -> { currentObject.setDeviceThreatProtectionEnabled(n.getBooleanValue()); });
            this.put("deviceThreatProtectionRequiredSecurityLevel", (n) -> { currentObject.setDeviceThreatProtectionRequiredSecurityLevel(n.getEnumValue(DeviceThreatProtectionLevel.class)); });
            this.put("managedEmailProfileRequired", (n) -> { currentObject.setManagedEmailProfileRequired(n.getBooleanValue()); });
            this.put("osMaximumBuildVersion", (n) -> { currentObject.setOsMaximumBuildVersion(n.getStringValue()); });
            this.put("osMaximumVersion", (n) -> { currentObject.setOsMaximumVersion(n.getStringValue()); });
            this.put("osMinimumBuildVersion", (n) -> { currentObject.setOsMinimumBuildVersion(n.getStringValue()); });
            this.put("osMinimumVersion", (n) -> { currentObject.setOsMinimumVersion(n.getStringValue()); });
            this.put("passcodeBlockSimple", (n) -> { currentObject.setPasscodeBlockSimple(n.getBooleanValue()); });
            this.put("passcodeExpirationDays", (n) -> { currentObject.setPasscodeExpirationDays(n.getIntegerValue()); });
            this.put("passcodeMinimumCharacterSetCount", (n) -> { currentObject.setPasscodeMinimumCharacterSetCount(n.getIntegerValue()); });
            this.put("passcodeMinimumLength", (n) -> { currentObject.setPasscodeMinimumLength(n.getIntegerValue()); });
            this.put("passcodeMinutesOfInactivityBeforeLock", (n) -> { currentObject.setPasscodeMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
            this.put("passcodeMinutesOfInactivityBeforeScreenTimeout", (n) -> { currentObject.setPasscodeMinutesOfInactivityBeforeScreenTimeout(n.getIntegerValue()); });
            this.put("passcodePreviousPasscodeBlockCount", (n) -> { currentObject.setPasscodePreviousPasscodeBlockCount(n.getIntegerValue()); });
            this.put("passcodeRequired", (n) -> { currentObject.setPasscodeRequired(n.getBooleanValue()); });
            this.put("passcodeRequiredType", (n) -> { currentObject.setPasscodeRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
            this.put("restrictedApps", (n) -> { currentObject.setRestrictedApps(n.getCollectionOfObjectValues(AppListItem::createFromDiscriminatorValue)); });
            this.put("securityBlockJailbrokenDevices", (n) -> { currentObject.setSecurityBlockJailbrokenDevices(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the managedEmailProfileRequired property value. Indicates whether or not to require a managed email profile.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getManagedEmailProfileRequired() {
        return this._managedEmailProfileRequired;
    }
    /**
     * Gets the osMaximumBuildVersion property value. Maximum IOS build version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsMaximumBuildVersion() {
        return this._osMaximumBuildVersion;
    }
    /**
     * Gets the osMaximumVersion property value. Maximum IOS version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsMaximumVersion() {
        return this._osMaximumVersion;
    }
    /**
     * Gets the osMinimumBuildVersion property value. Minimum IOS build version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsMinimumBuildVersion() {
        return this._osMinimumBuildVersion;
    }
    /**
     * Gets the osMinimumVersion property value. Minimum IOS version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsMinimumVersion() {
        return this._osMinimumVersion;
    }
    /**
     * Gets the passcodeBlockSimple property value. Indicates whether or not to block simple passcodes.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasscodeBlockSimple() {
        return this._passcodeBlockSimple;
    }
    /**
     * Gets the passcodeExpirationDays property value. Number of days before the passcode expires. Valid values 1 to 65535
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodeExpirationDays() {
        return this._passcodeExpirationDays;
    }
    /**
     * Gets the passcodeMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodeMinimumCharacterSetCount() {
        return this._passcodeMinimumCharacterSetCount;
    }
    /**
     * Gets the passcodeMinimumLength property value. Minimum length of passcode. Valid values 4 to 14
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodeMinimumLength() {
        return this._passcodeMinimumLength;
    }
    /**
     * Gets the passcodeMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a passcode is required.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodeMinutesOfInactivityBeforeLock() {
        return this._passcodeMinutesOfInactivityBeforeLock;
    }
    /**
     * Gets the passcodeMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodeMinutesOfInactivityBeforeScreenTimeout() {
        return this._passcodeMinutesOfInactivityBeforeScreenTimeout;
    }
    /**
     * Gets the passcodePreviousPasscodeBlockCount property value. Number of previous passcodes to block. Valid values 1 to 24
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodePreviousPasscodeBlockCount() {
        return this._passcodePreviousPasscodeBlockCount;
    }
    /**
     * Gets the passcodeRequired property value. Indicates whether or not to require a passcode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPasscodeRequired() {
        return this._passcodeRequired;
    }
    /**
     * Gets the passcodeRequiredType property value. Possible values of required passwords.
     * @return a requiredPasswordType
     */
    @javax.annotation.Nullable
    public RequiredPasswordType getPasscodeRequiredType() {
        return this._passcodeRequiredType;
    }
    /**
     * Gets the restrictedApps property value. Require the device to not have the specified apps installed. This collection can contain a maximum of 100 elements.
     * @return a appListItem
     */
    @javax.annotation.Nullable
    public java.util.List<AppListItem> getRestrictedApps() {
        return this._restrictedApps;
    }
    /**
     * Gets the securityBlockJailbrokenDevices property value. Devices must not be jailbroken or rooted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityBlockJailbrokenDevices() {
        return this._securityBlockJailbrokenDevices;
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
     * @return a void
     */
    public void setAdvancedThreatProtectionRequiredSecurityLevel(@javax.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this._advancedThreatProtectionRequiredSecurityLevel = value;
    }
    /**
     * Sets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection .
     * @param value Value to set for the deviceThreatProtectionEnabled property.
     * @return a void
     */
    public void setDeviceThreatProtectionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._deviceThreatProtectionEnabled = value;
    }
    /**
     * Sets the deviceThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @param value Value to set for the deviceThreatProtectionRequiredSecurityLevel property.
     * @return a void
     */
    public void setDeviceThreatProtectionRequiredSecurityLevel(@javax.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this._deviceThreatProtectionRequiredSecurityLevel = value;
    }
    /**
     * Sets the managedEmailProfileRequired property value. Indicates whether or not to require a managed email profile.
     * @param value Value to set for the managedEmailProfileRequired property.
     * @return a void
     */
    public void setManagedEmailProfileRequired(@javax.annotation.Nullable final Boolean value) {
        this._managedEmailProfileRequired = value;
    }
    /**
     * Sets the osMaximumBuildVersion property value. Maximum IOS build version.
     * @param value Value to set for the osMaximumBuildVersion property.
     * @return a void
     */
    public void setOsMaximumBuildVersion(@javax.annotation.Nullable final String value) {
        this._osMaximumBuildVersion = value;
    }
    /**
     * Sets the osMaximumVersion property value. Maximum IOS version.
     * @param value Value to set for the osMaximumVersion property.
     * @return a void
     */
    public void setOsMaximumVersion(@javax.annotation.Nullable final String value) {
        this._osMaximumVersion = value;
    }
    /**
     * Sets the osMinimumBuildVersion property value. Minimum IOS build version.
     * @param value Value to set for the osMinimumBuildVersion property.
     * @return a void
     */
    public void setOsMinimumBuildVersion(@javax.annotation.Nullable final String value) {
        this._osMinimumBuildVersion = value;
    }
    /**
     * Sets the osMinimumVersion property value. Minimum IOS version.
     * @param value Value to set for the osMinimumVersion property.
     * @return a void
     */
    public void setOsMinimumVersion(@javax.annotation.Nullable final String value) {
        this._osMinimumVersion = value;
    }
    /**
     * Sets the passcodeBlockSimple property value. Indicates whether or not to block simple passcodes.
     * @param value Value to set for the passcodeBlockSimple property.
     * @return a void
     */
    public void setPasscodeBlockSimple(@javax.annotation.Nullable final Boolean value) {
        this._passcodeBlockSimple = value;
    }
    /**
     * Sets the passcodeExpirationDays property value. Number of days before the passcode expires. Valid values 1 to 65535
     * @param value Value to set for the passcodeExpirationDays property.
     * @return a void
     */
    public void setPasscodeExpirationDays(@javax.annotation.Nullable final Integer value) {
        this._passcodeExpirationDays = value;
    }
    /**
     * Sets the passcodeMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passcodeMinimumCharacterSetCount property.
     * @return a void
     */
    public void setPasscodeMinimumCharacterSetCount(@javax.annotation.Nullable final Integer value) {
        this._passcodeMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passcodeMinimumLength property value. Minimum length of passcode. Valid values 4 to 14
     * @param value Value to set for the passcodeMinimumLength property.
     * @return a void
     */
    public void setPasscodeMinimumLength(@javax.annotation.Nullable final Integer value) {
        this._passcodeMinimumLength = value;
    }
    /**
     * Sets the passcodeMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a passcode is required.
     * @param value Value to set for the passcodeMinutesOfInactivityBeforeLock property.
     * @return a void
     */
    public void setPasscodeMinutesOfInactivityBeforeLock(@javax.annotation.Nullable final Integer value) {
        this._passcodeMinutesOfInactivityBeforeLock = value;
    }
    /**
     * Sets the passcodeMinutesOfInactivityBeforeScreenTimeout property value. Minutes of inactivity before the screen times out.
     * @param value Value to set for the passcodeMinutesOfInactivityBeforeScreenTimeout property.
     * @return a void
     */
    public void setPasscodeMinutesOfInactivityBeforeScreenTimeout(@javax.annotation.Nullable final Integer value) {
        this._passcodeMinutesOfInactivityBeforeScreenTimeout = value;
    }
    /**
     * Sets the passcodePreviousPasscodeBlockCount property value. Number of previous passcodes to block. Valid values 1 to 24
     * @param value Value to set for the passcodePreviousPasscodeBlockCount property.
     * @return a void
     */
    public void setPasscodePreviousPasscodeBlockCount(@javax.annotation.Nullable final Integer value) {
        this._passcodePreviousPasscodeBlockCount = value;
    }
    /**
     * Sets the passcodeRequired property value. Indicates whether or not to require a passcode.
     * @param value Value to set for the passcodeRequired property.
     * @return a void
     */
    public void setPasscodeRequired(@javax.annotation.Nullable final Boolean value) {
        this._passcodeRequired = value;
    }
    /**
     * Sets the passcodeRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passcodeRequiredType property.
     * @return a void
     */
    public void setPasscodeRequiredType(@javax.annotation.Nullable final RequiredPasswordType value) {
        this._passcodeRequiredType = value;
    }
    /**
     * Sets the restrictedApps property value. Require the device to not have the specified apps installed. This collection can contain a maximum of 100 elements.
     * @param value Value to set for the restrictedApps property.
     * @return a void
     */
    public void setRestrictedApps(@javax.annotation.Nullable final java.util.List<AppListItem> value) {
        this._restrictedApps = value;
    }
    /**
     * Sets the securityBlockJailbrokenDevices property value. Devices must not be jailbroken or rooted.
     * @param value Value to set for the securityBlockJailbrokenDevices property.
     * @return a void
     */
    public void setSecurityBlockJailbrokenDevices(@javax.annotation.Nullable final Boolean value) {
        this._securityBlockJailbrokenDevices = value;
    }
}
