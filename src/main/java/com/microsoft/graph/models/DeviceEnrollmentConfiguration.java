package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceEnrollmentConfiguration extends Entity implements Parsable {
    /** The list of group assignments for the device configuration profile */
    private java.util.List<EnrollmentConfigurationAssignment> _assignments;
    /** Created date time in UTC of the device enrollment configuration */
    private OffsetDateTime _createdDateTime;
    /** The description of the device enrollment configuration */
    private String _description;
    /** Describes the TemplateFamily for the Template entity */
    private DeviceEnrollmentConfigurationType _deviceEnrollmentConfigurationType;
    /** The display name of the device enrollment configuration */
    private String _displayName;
    /** Last modified date time in UTC of the device enrollment configuration */
    private OffsetDateTime _lastModifiedDateTime;
    /** Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value. */
    private Integer _priority;
    /** Optional role scope tags for the enrollment restrictions. */
    private java.util.List<String> _roleScopeTagIds;
    /** The version of the device enrollment configuration */
    private Integer _version;
    /**
     * Instantiates a new DeviceEnrollmentConfiguration and sets the default values.
     * @return a void
     */
    public DeviceEnrollmentConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.deviceEnrollmentConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceEnrollmentConfiguration
     */
    @javax.annotation.Nonnull
    public static DeviceEnrollmentConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceComanagementAuthorityConfiguration": return new DeviceComanagementAuthorityConfiguration();
                case "#microsoft.graph.deviceEnrollmentLimitConfiguration": return new DeviceEnrollmentLimitConfiguration();
                case "#microsoft.graph.deviceEnrollmentNotificationConfiguration": return new DeviceEnrollmentNotificationConfiguration();
                case "#microsoft.graph.deviceEnrollmentPlatformRestrictionConfiguration": return new DeviceEnrollmentPlatformRestrictionConfiguration();
                case "#microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration": return new DeviceEnrollmentPlatformRestrictionsConfiguration();
                case "#microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration": return new DeviceEnrollmentWindowsHelloForBusinessConfiguration();
                case "#microsoft.graph.windows10EnrollmentCompletionPageConfiguration": return new Windows10EnrollmentCompletionPageConfiguration();
            }
        }
        return new DeviceEnrollmentConfiguration();
    }
    /**
     * Gets the assignments property value. The list of group assignments for the device configuration profile
     * @return a enrollmentConfigurationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<EnrollmentConfigurationAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. Created date time in UTC of the device enrollment configuration
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. The description of the device enrollment configuration
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceEnrollmentConfigurationType property value. Describes the TemplateFamily for the Template entity
     * @return a deviceEnrollmentConfigurationType
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentConfigurationType getDeviceEnrollmentConfigurationType() {
        return this._deviceEnrollmentConfigurationType;
    }
    /**
     * Gets the displayName property value. The display name of the device enrollment configuration
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceEnrollmentConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(EnrollmentConfigurationAssignment::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceEnrollmentConfigurationType", (n) -> { currentObject.setDeviceEnrollmentConfigurationType(n.getEnumValue(DeviceEnrollmentConfigurationType.class)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modified date time in UTC of the device enrollment configuration
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the priority property value. Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Gets the roleScopeTagIds property value. Optional role scope tags for the enrollment restrictions.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the version property value. The version of the device enrollment configuration
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("deviceEnrollmentConfigurationType", this.getDeviceEnrollmentConfigurationType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. The list of group assignments for the device configuration profile
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<EnrollmentConfigurationAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. Created date time in UTC of the device enrollment configuration
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of the device enrollment configuration
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceEnrollmentConfigurationType property value. Describes the TemplateFamily for the Template entity
     * @param value Value to set for the deviceEnrollmentConfigurationType property.
     * @return a void
     */
    public void setDeviceEnrollmentConfigurationType(@javax.annotation.Nullable final DeviceEnrollmentConfigurationType value) {
        this._deviceEnrollmentConfigurationType = value;
    }
    /**
     * Sets the displayName property value. The display name of the device enrollment configuration
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modified date time in UTC of the device enrollment configuration
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the priority property value. Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value.
     * @param value Value to set for the priority property.
     * @return a void
     */
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
    /**
     * Sets the roleScopeTagIds property value. Optional role scope tags for the enrollment restrictions.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the version property value. The version of the device enrollment configuration
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
