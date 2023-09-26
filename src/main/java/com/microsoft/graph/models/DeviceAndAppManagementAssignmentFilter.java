package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class containing the properties used for Assignment Filter.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceAndAppManagementAssignmentFilter extends Entity implements Parsable {
    /**
     * Supported filter management types whether its devices or apps.
     */
    private AssignmentFilterManagementType assignmentFilterManagementType;
    /**
     * The creation time of the assignment filter. The value cannot be modified and is automatically populated during new assignment filter process. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Optional description of the Assignment Filter.
     */
    private String description;
    /**
     * The name of the Assignment Filter.
     */
    private String displayName;
    /**
     * Last modified time of the Assignment Filter. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Indicates associated assignments for a specific filter.
     */
    private java.util.List<PayloadByFilter> payloads;
    /**
     * Supported platform types.
     */
    private DevicePlatformType platform;
    /**
     * Indicates role scope tags assigned for the assignment filter.
     */
    private java.util.List<String> roleScopeTags;
    /**
     * Rule definition of the assignment filter.
     */
    private String rule;
    /**
     * Instantiates a new DeviceAndAppManagementAssignmentFilter and sets the default values.
     */
    public DeviceAndAppManagementAssignmentFilter() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceAndAppManagementAssignmentFilter
     */
    @jakarta.annotation.Nonnull
    public static DeviceAndAppManagementAssignmentFilter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.payloadCompatibleAssignmentFilter": return new PayloadCompatibleAssignmentFilter();
            }
        }
        return new DeviceAndAppManagementAssignmentFilter();
    }
    /**
     * Gets the assignmentFilterManagementType property value. Supported filter management types whether its devices or apps.
     * @return a AssignmentFilterManagementType
     */
    @jakarta.annotation.Nullable
    public AssignmentFilterManagementType getAssignmentFilterManagementType() {
        return this.assignmentFilterManagementType;
    }
    /**
     * Gets the createdDateTime property value. The creation time of the assignment filter. The value cannot be modified and is automatically populated during new assignment filter process. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the description property value. Optional description of the Assignment Filter.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The name of the Assignment Filter.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignmentFilterManagementType", (n) -> { this.setAssignmentFilterManagementType(n.getEnumValue(AssignmentFilterManagementType.class)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("payloads", (n) -> { this.setPayloads(n.getCollectionOfObjectValues(PayloadByFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(DevicePlatformType.class)); });
        deserializerMap.put("roleScopeTags", (n) -> { this.setRoleScopeTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("rule", (n) -> { this.setRule(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Last modified time of the Assignment Filter. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the payloads property value. Indicates associated assignments for a specific filter.
     * @return a java.util.List<PayloadByFilter>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PayloadByFilter> getPayloads() {
        return this.payloads;
    }
    /**
     * Gets the platform property value. Supported platform types.
     * @return a DevicePlatformType
     */
    @jakarta.annotation.Nullable
    public DevicePlatformType getPlatform() {
        return this.platform;
    }
    /**
     * Gets the roleScopeTags property value. Indicates role scope tags assigned for the assignment filter.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTags() {
        return this.roleScopeTags;
    }
    /**
     * Gets the rule property value. Rule definition of the assignment filter.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRule() {
        return this.rule;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("assignmentFilterManagementType", this.getAssignmentFilterManagementType());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfObjectValues("payloads", this.getPayloads());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeCollectionOfPrimitiveValues("roleScopeTags", this.getRoleScopeTags());
        writer.writeStringValue("rule", this.getRule());
    }
    /**
     * Sets the assignmentFilterManagementType property value. Supported filter management types whether its devices or apps.
     * @param value Value to set for the assignmentFilterManagementType property.
     */
    public void setAssignmentFilterManagementType(@jakarta.annotation.Nullable final AssignmentFilterManagementType value) {
        this.assignmentFilterManagementType = value;
    }
    /**
     * Sets the createdDateTime property value. The creation time of the assignment filter. The value cannot be modified and is automatically populated during new assignment filter process. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the description property value. Optional description of the Assignment Filter.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The name of the Assignment Filter.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Last modified time of the Assignment Filter. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the payloads property value. Indicates associated assignments for a specific filter.
     * @param value Value to set for the payloads property.
     */
    public void setPayloads(@jakarta.annotation.Nullable final java.util.List<PayloadByFilter> value) {
        this.payloads = value;
    }
    /**
     * Sets the platform property value. Supported platform types.
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final DevicePlatformType value) {
        this.platform = value;
    }
    /**
     * Sets the roleScopeTags property value. Indicates role scope tags assigned for the assignment filter.
     * @param value Value to set for the roleScopeTags property.
     */
    public void setRoleScopeTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTags = value;
    }
    /**
     * Sets the rule property value. Rule definition of the assignment filter.
     * @param value Value to set for the rule property.
     */
    public void setRule(@jakarta.annotation.Nullable final String value) {
        this.rule = value;
    }
}
