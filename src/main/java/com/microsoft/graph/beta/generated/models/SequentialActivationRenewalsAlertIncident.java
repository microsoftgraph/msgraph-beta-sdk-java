package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SequentialActivationRenewalsAlertIncident extends UnifiedRoleManagementAlertIncident implements Parsable {
    /**
     * Instantiates a new SequentialActivationRenewalsAlertIncident and sets the default values.
     */
    public SequentialActivationRenewalsAlertIncident() {
        super();
        this.setOdataType("#microsoft.graph.sequentialActivationRenewalsAlertIncident");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SequentialActivationRenewalsAlertIncident
     */
    @jakarta.annotation.Nonnull
    public static SequentialActivationRenewalsAlertIncident createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SequentialActivationRenewalsAlertIncident();
    }
    /**
     * Gets the activationCount property value. The length of sequential activation of the same role.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getActivationCount() {
        return this.backingStore.get("activationCount");
    }
    /**
     * Gets the assigneeDisplayName property value. Display name of the subject that the incident applies to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssigneeDisplayName() {
        return this.backingStore.get("assigneeDisplayName");
    }
    /**
     * Gets the assigneeId property value. The identifier of the subject that the incident applies to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssigneeId() {
        return this.backingStore.get("assigneeId");
    }
    /**
     * Gets the assigneeUserPrincipalName property value. User principal name of the subject that the incident applies to. Applies to user principals.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssigneeUserPrincipalName() {
        return this.backingStore.get("assigneeUserPrincipalName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activationCount", (n) -> { this.setActivationCount(n.getIntegerValue()); });
        deserializerMap.put("assigneeDisplayName", (n) -> { this.setAssigneeDisplayName(n.getStringValue()); });
        deserializerMap.put("assigneeId", (n) -> { this.setAssigneeId(n.getStringValue()); });
        deserializerMap.put("assigneeUserPrincipalName", (n) -> { this.setAssigneeUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("roleDefinitionId", (n) -> { this.setRoleDefinitionId(n.getStringValue()); });
        deserializerMap.put("roleDisplayName", (n) -> { this.setRoleDisplayName(n.getStringValue()); });
        deserializerMap.put("roleTemplateId", (n) -> { this.setRoleTemplateId(n.getStringValue()); });
        deserializerMap.put("sequenceEndDateTime", (n) -> { this.setSequenceEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sequenceStartDateTime", (n) -> { this.setSequenceStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the roleDefinitionId property value. The identifier for the directory role definition that's in scope of this incident.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.backingStore.get("roleDefinitionId");
    }
    /**
     * Gets the roleDisplayName property value. The display name for the directory role.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRoleDisplayName() {
        return this.backingStore.get("roleDisplayName");
    }
    /**
     * Gets the roleTemplateId property value. The globally unique identifier for the directory role.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRoleTemplateId() {
        return this.backingStore.get("roleTemplateId");
    }
    /**
     * Gets the sequenceEndDateTime property value. End date time of the sequential activation event.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSequenceEndDateTime() {
        return this.backingStore.get("sequenceEndDateTime");
    }
    /**
     * Gets the sequenceStartDateTime property value. Start date time of the sequential activation event.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSequenceStartDateTime() {
        return this.backingStore.get("sequenceStartDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activationCount", this.getActivationCount());
        writer.writeStringValue("assigneeDisplayName", this.getAssigneeDisplayName());
        writer.writeStringValue("assigneeId", this.getAssigneeId());
        writer.writeStringValue("assigneeUserPrincipalName", this.getAssigneeUserPrincipalName());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
        writer.writeStringValue("roleDisplayName", this.getRoleDisplayName());
        writer.writeStringValue("roleTemplateId", this.getRoleTemplateId());
        writer.writeOffsetDateTimeValue("sequenceEndDateTime", this.getSequenceEndDateTime());
        writer.writeOffsetDateTimeValue("sequenceStartDateTime", this.getSequenceStartDateTime());
    }
    /**
     * Sets the activationCount property value. The length of sequential activation of the same role.
     * @param value Value to set for the activationCount property.
     */
    public void setActivationCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("activationCount", value);
    }
    /**
     * Sets the assigneeDisplayName property value. Display name of the subject that the incident applies to.
     * @param value Value to set for the assigneeDisplayName property.
     */
    public void setAssigneeDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assigneeDisplayName", value);
    }
    /**
     * Sets the assigneeId property value. The identifier of the subject that the incident applies to.
     * @param value Value to set for the assigneeId property.
     */
    public void setAssigneeId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assigneeId", value);
    }
    /**
     * Sets the assigneeUserPrincipalName property value. User principal name of the subject that the incident applies to. Applies to user principals.
     * @param value Value to set for the assigneeUserPrincipalName property.
     */
    public void setAssigneeUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assigneeUserPrincipalName", value);
    }
    /**
     * Sets the roleDefinitionId property value. The identifier for the directory role definition that's in scope of this incident.
     * @param value Value to set for the roleDefinitionId property.
     */
    public void setRoleDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleDefinitionId", value);
    }
    /**
     * Sets the roleDisplayName property value. The display name for the directory role.
     * @param value Value to set for the roleDisplayName property.
     */
    public void setRoleDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleDisplayName", value);
    }
    /**
     * Sets the roleTemplateId property value. The globally unique identifier for the directory role.
     * @param value Value to set for the roleTemplateId property.
     */
    public void setRoleTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleTemplateId", value);
    }
    /**
     * Sets the sequenceEndDateTime property value. End date time of the sequential activation event.
     * @param value Value to set for the sequenceEndDateTime property.
     */
    public void setSequenceEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("sequenceEndDateTime", value);
    }
    /**
     * Sets the sequenceStartDateTime property value. Start date time of the sequential activation event.
     * @param value Value to set for the sequenceStartDateTime property.
     */
    public void setSequenceStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("sequenceStartDateTime", value);
    }
}
