package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OfficeClientConfiguration extends Entity implements Parsable {
    /** The assignments property */
    private java.util.List<OfficeClientConfigurationAssignment> assignments;
    /** The checkinStatuses property */
    private java.util.List<OfficeClientCheckinStatus> checkinStatuses;
    /** The description property */
    private String description;
    /** The displayName property */
    private String displayName;
    /** The policyPayload property */
    private byte[] policyPayload;
    /** The priority property */
    private Integer priority;
    /** The userCheckinSummary property */
    private OfficeUserCheckinSummary userCheckinSummary;
    /** The userPreferencePayload property */
    private byte[] userPreferencePayload;
    /**
     * Instantiates a new OfficeClientConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OfficeClientConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OfficeClientConfiguration
     */
    @javax.annotation.Nonnull
    public static OfficeClientConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsOfficeClientConfiguration": return new WindowsOfficeClientConfiguration();
                case "#microsoft.graph.windowsOfficeClientSecurityConfiguration": return new WindowsOfficeClientSecurityConfiguration();
            }
        }
        return new OfficeClientConfiguration();
    }
    /**
     * Gets the assignments property value. The assignments property
     * @return a officeClientConfigurationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<OfficeClientConfigurationAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the checkinStatuses property value. The checkinStatuses property
     * @return a officeClientCheckinStatus
     */
    @javax.annotation.Nullable
    public java.util.List<OfficeClientCheckinStatus> getCheckinStatuses() {
        return this.checkinStatuses;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(OfficeClientConfigurationAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("checkinStatuses", (n) -> { this.setCheckinStatuses(n.getCollectionOfObjectValues(OfficeClientCheckinStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("policyPayload", (n) -> { this.setPolicyPayload(n.getByteArrayValue()); });
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        deserializerMap.put("userCheckinSummary", (n) -> { this.setUserCheckinSummary(n.getObjectValue(OfficeUserCheckinSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("userPreferencePayload", (n) -> { this.setUserPreferencePayload(n.getByteArrayValue()); });
        return deserializerMap;
    }
    /**
     * Gets the policyPayload property value. The policyPayload property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getPolicyPayload() {
        return this.policyPayload;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Gets the userCheckinSummary property value. The userCheckinSummary property
     * @return a officeUserCheckinSummary
     */
    @javax.annotation.Nullable
    public OfficeUserCheckinSummary getUserCheckinSummary() {
        return this.userCheckinSummary;
    }
    /**
     * Gets the userPreferencePayload property value. The userPreferencePayload property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getUserPreferencePayload() {
        return this.userPreferencePayload;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeCollectionOfObjectValues("checkinStatuses", this.getCheckinStatuses());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeByteArrayValue("policyPayload", this.getPolicyPayload());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeObjectValue("userCheckinSummary", this.getUserCheckinSummary());
        writer.writeByteArrayValue("userPreferencePayload", this.getUserPreferencePayload());
    }
    /**
     * Sets the assignments property value. The assignments property
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<OfficeClientConfigurationAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the checkinStatuses property value. The checkinStatuses property
     * @param value Value to set for the checkinStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCheckinStatuses(@javax.annotation.Nullable final java.util.List<OfficeClientCheckinStatus> value) {
        this.checkinStatuses = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the policyPayload property value. The policyPayload property
     * @param value Value to set for the policyPayload property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyPayload(@javax.annotation.Nullable final byte[] value) {
        this.policyPayload = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this.priority = value;
    }
    /**
     * Sets the userCheckinSummary property value. The userCheckinSummary property
     * @param value Value to set for the userCheckinSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserCheckinSummary(@javax.annotation.Nullable final OfficeUserCheckinSummary value) {
        this.userCheckinSummary = value;
    }
    /**
     * Sets the userPreferencePayload property value. The userPreferencePayload property
     * @param value Value to set for the userPreferencePayload property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPreferencePayload(@javax.annotation.Nullable final byte[] value) {
        this.userPreferencePayload = value;
    }
}
