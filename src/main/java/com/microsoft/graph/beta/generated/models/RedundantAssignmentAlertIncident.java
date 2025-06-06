package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RedundantAssignmentAlertIncident extends UnifiedRoleManagementAlertIncident implements Parsable {
    /**
     * Instantiates a new {@link RedundantAssignmentAlertIncident} and sets the default values.
     */
    public RedundantAssignmentAlertIncident() {
        super();
        this.setOdataType("#microsoft.graph.redundantAssignmentAlertIncident");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RedundantAssignmentAlertIncident}
     */
    @jakarta.annotation.Nonnull
    public static RedundantAssignmentAlertIncident createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedundantAssignmentAlertIncident();
    }
    /**
     * Gets the assigneeDisplayName property value. Display name of the subject that the incident applies to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssigneeDisplayName() {
        return this.backingStore.get("assigneeDisplayName");
    }
    /**
     * Gets the assigneeId property value. The identifier of the subject that the incident applies to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssigneeId() {
        return this.backingStore.get("assigneeId");
    }
    /**
     * Gets the assigneeUserPrincipalName property value. User principal name of the subject that the incident applies to. Applies to user principals only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssigneeUserPrincipalName() {
        return this.backingStore.get("assigneeUserPrincipalName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assigneeDisplayName", (n) -> { this.setAssigneeDisplayName(n.getStringValue()); });
        deserializerMap.put("assigneeId", (n) -> { this.setAssigneeId(n.getStringValue()); });
        deserializerMap.put("assigneeUserPrincipalName", (n) -> { this.setAssigneeUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("lastActivationDateTime", (n) -> { this.setLastActivationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleDefinitionId", (n) -> { this.setRoleDefinitionId(n.getStringValue()); });
        deserializerMap.put("roleDisplayName", (n) -> { this.setRoleDisplayName(n.getStringValue()); });
        deserializerMap.put("roleTemplateId", (n) -> { this.setRoleTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastActivationDateTime property value. Date and time of the last activation of the eligible assignment.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActivationDateTime() {
        return this.backingStore.get("lastActivationDateTime");
    }
    /**
     * Gets the roleDefinitionId property value. The identifier for the directory role definition that&apos;s in scope of this incident.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.backingStore.get("roleDefinitionId");
    }
    /**
     * Gets the roleDisplayName property value. The display name for the directory role.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoleDisplayName() {
        return this.backingStore.get("roleDisplayName");
    }
    /**
     * Gets the roleTemplateId property value. The globally unique identifier for the directory role.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoleTemplateId() {
        return this.backingStore.get("roleTemplateId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assigneeDisplayName", this.getAssigneeDisplayName());
        writer.writeStringValue("assigneeId", this.getAssigneeId());
        writer.writeStringValue("assigneeUserPrincipalName", this.getAssigneeUserPrincipalName());
        writer.writeOffsetDateTimeValue("lastActivationDateTime", this.getLastActivationDateTime());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
        writer.writeStringValue("roleDisplayName", this.getRoleDisplayName());
        writer.writeStringValue("roleTemplateId", this.getRoleTemplateId());
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
     * Sets the assigneeUserPrincipalName property value. User principal name of the subject that the incident applies to. Applies to user principals only.
     * @param value Value to set for the assigneeUserPrincipalName property.
     */
    public void setAssigneeUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assigneeUserPrincipalName", value);
    }
    /**
     * Sets the lastActivationDateTime property value. Date and time of the last activation of the eligible assignment.
     * @param value Value to set for the lastActivationDateTime property.
     */
    public void setLastActivationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastActivationDateTime", value);
    }
    /**
     * Sets the roleDefinitionId property value. The identifier for the directory role definition that&apos;s in scope of this incident.
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
}
