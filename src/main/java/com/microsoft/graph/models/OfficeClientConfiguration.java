package com.microsoft.graph.models;

import com.microsoft.graph.models.WindowsOfficeClientConfiguration;
import com.microsoft.graph.models.WindowsOfficeClientSecurityConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class OfficeClientConfiguration extends Entity implements Parsable {
    /** The list of group assignments for the policy. */
    private java.util.List<OfficeClientConfigurationAssignment> _assignments;
    /** List of office Client check-in status. */
    private java.util.List<OfficeClientCheckinStatus> _checkinStatuses;
    /** Not yet documented */
    private String _description;
    /** Admin provided description of the office client configuration policy. */
    private String _displayName;
    /** Policy settings JSON string in binary format, these values cannot be changed by the user. */
    private byte[] _policyPayload;
    /** Priority value should be unique value for each policy under a tenant and will be used for conflict resolution, lower values mean priority is high. */
    private Integer _priority;
    /** User check-in summary for the policy. */
    private OfficeUserCheckinSummary _userCheckinSummary;
    /** Preference settings JSON string in binary format, these values can be overridden by the user. */
    private byte[] _userPreferencePayload;
    /**
     * Instantiates a new officeClientConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OfficeClientConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a officeClientConfiguration
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
     * Gets the assignments property value. The list of group assignments for the policy.
     * @return a officeClientConfigurationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<OfficeClientConfigurationAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the checkinStatuses property value. List of office Client check-in status.
     * @return a officeClientCheckinStatus
     */
    @javax.annotation.Nullable
    public java.util.List<OfficeClientCheckinStatus> getCheckinStatuses() {
        return this._checkinStatuses;
    }
    /**
     * Gets the description property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Admin provided description of the office client configuration policy.
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * Gets the policyPayload property value. Policy settings JSON string in binary format, these values cannot be changed by the user.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getPolicyPayload() {
        return this._policyPayload;
    }
    /**
     * Gets the priority property value. Priority value should be unique value for each policy under a tenant and will be used for conflict resolution, lower values mean priority is high.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Gets the userCheckinSummary property value. User check-in summary for the policy.
     * @return a officeUserCheckinSummary
     */
    @javax.annotation.Nullable
    public OfficeUserCheckinSummary getUserCheckinSummary() {
        return this._userCheckinSummary;
    }
    /**
     * Gets the userPreferencePayload property value. Preference settings JSON string in binary format, these values can be overridden by the user.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getUserPreferencePayload() {
        return this._userPreferencePayload;
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
     * Sets the assignments property value. The list of group assignments for the policy.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<OfficeClientConfigurationAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the checkinStatuses property value. List of office Client check-in status.
     * @param value Value to set for the checkinStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCheckinStatuses(@javax.annotation.Nullable final java.util.List<OfficeClientCheckinStatus> value) {
        this._checkinStatuses = value;
    }
    /**
     * Sets the description property value. Not yet documented
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Admin provided description of the office client configuration policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the policyPayload property value. Policy settings JSON string in binary format, these values cannot be changed by the user.
     * @param value Value to set for the policyPayload property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyPayload(@javax.annotation.Nullable final byte[] value) {
        this._policyPayload = value;
    }
    /**
     * Sets the priority property value. Priority value should be unique value for each policy under a tenant and will be used for conflict resolution, lower values mean priority is high.
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
    /**
     * Sets the userCheckinSummary property value. User check-in summary for the policy.
     * @param value Value to set for the userCheckinSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserCheckinSummary(@javax.annotation.Nullable final OfficeUserCheckinSummary value) {
        this._userCheckinSummary = value;
    }
    /**
     * Sets the userPreferencePayload property value. Preference settings JSON string in binary format, these values can be overridden by the user.
     * @param value Value to set for the userPreferencePayload property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPreferencePayload(@javax.annotation.Nullable final byte[] value) {
        this._userPreferencePayload = value;
    }
}
