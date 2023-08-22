package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StaleSignInAlertIncident extends UnifiedRoleManagementAlertIncident implements Parsable {
    /**
     * Display name of the subject that the incident applies to.
     */
    private String assigneeDisplayName;
    /**
     * The identifier of the subject that the incident applies to.
     */
    private String assigneeId;
    /**
     * User principal name of the subject that the incident applies to. Applies to user principals.
     */
    private String assigneeUserPrincipalName;
    /**
     * Date and time of assignment creation.
     */
    private OffsetDateTime assignmentCreatedDateTime;
    /**
     * Date and time of last sign in.
     */
    private OffsetDateTime lastSignInDateTime;
    /**
     * The identifier for the directory role definition that's in scope of this incident.
     */
    private String roleDefinitionId;
    /**
     * The display name for the directory role.
     */
    private String roleDisplayName;
    /**
     * The globally unique identifier for the directory role.
     */
    private String roleTemplateId;
    /**
     * Instantiates a new staleSignInAlertIncident and sets the default values.
     */
    public StaleSignInAlertIncident() {
        super();
        this.setOdataType("#microsoft.graph.staleSignInAlertIncident");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a staleSignInAlertIncident
     */
    @jakarta.annotation.Nonnull
    public static StaleSignInAlertIncident createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StaleSignInAlertIncident();
    }
    /**
     * Gets the assigneeDisplayName property value. Display name of the subject that the incident applies to.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssigneeDisplayName() {
        return this.assigneeDisplayName;
    }
    /**
     * Gets the assigneeId property value. The identifier of the subject that the incident applies to.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssigneeId() {
        return this.assigneeId;
    }
    /**
     * Gets the assigneeUserPrincipalName property value. User principal name of the subject that the incident applies to. Applies to user principals.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssigneeUserPrincipalName() {
        return this.assigneeUserPrincipalName;
    }
    /**
     * Gets the assignmentCreatedDateTime property value. Date and time of assignment creation.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAssignmentCreatedDateTime() {
        return this.assignmentCreatedDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assigneeDisplayName", (n) -> { this.setAssigneeDisplayName(n.getStringValue()); });
        deserializerMap.put("assigneeId", (n) -> { this.setAssigneeId(n.getStringValue()); });
        deserializerMap.put("assigneeUserPrincipalName", (n) -> { this.setAssigneeUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("assignmentCreatedDateTime", (n) -> { this.setAssignmentCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSignInDateTime", (n) -> { this.setLastSignInDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleDefinitionId", (n) -> { this.setRoleDefinitionId(n.getStringValue()); });
        deserializerMap.put("roleDisplayName", (n) -> { this.setRoleDisplayName(n.getStringValue()); });
        deserializerMap.put("roleTemplateId", (n) -> { this.setRoleTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastSignInDateTime property value. Date and time of last sign in.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSignInDateTime() {
        return this.lastSignInDateTime;
    }
    /**
     * Gets the roleDefinitionId property value. The identifier for the directory role definition that's in scope of this incident.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }
    /**
     * Gets the roleDisplayName property value. The display name for the directory role.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRoleDisplayName() {
        return this.roleDisplayName;
    }
    /**
     * Gets the roleTemplateId property value. The globally unique identifier for the directory role.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRoleTemplateId() {
        return this.roleTemplateId;
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
        writer.writeOffsetDateTimeValue("assignmentCreatedDateTime", this.getAssignmentCreatedDateTime());
        writer.writeOffsetDateTimeValue("lastSignInDateTime", this.getLastSignInDateTime());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
        writer.writeStringValue("roleDisplayName", this.getRoleDisplayName());
        writer.writeStringValue("roleTemplateId", this.getRoleTemplateId());
    }
    /**
     * Sets the assigneeDisplayName property value. Display name of the subject that the incident applies to.
     * @param value Value to set for the assigneeDisplayName property.
     */
    public void setAssigneeDisplayName(@jakarta.annotation.Nullable final String value) {
        this.assigneeDisplayName = value;
    }
    /**
     * Sets the assigneeId property value. The identifier of the subject that the incident applies to.
     * @param value Value to set for the assigneeId property.
     */
    public void setAssigneeId(@jakarta.annotation.Nullable final String value) {
        this.assigneeId = value;
    }
    /**
     * Sets the assigneeUserPrincipalName property value. User principal name of the subject that the incident applies to. Applies to user principals.
     * @param value Value to set for the assigneeUserPrincipalName property.
     */
    public void setAssigneeUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.assigneeUserPrincipalName = value;
    }
    /**
     * Sets the assignmentCreatedDateTime property value. Date and time of assignment creation.
     * @param value Value to set for the assignmentCreatedDateTime property.
     */
    public void setAssignmentCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.assignmentCreatedDateTime = value;
    }
    /**
     * Sets the lastSignInDateTime property value. Date and time of last sign in.
     * @param value Value to set for the lastSignInDateTime property.
     */
    public void setLastSignInDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSignInDateTime = value;
    }
    /**
     * Sets the roleDefinitionId property value. The identifier for the directory role definition that's in scope of this incident.
     * @param value Value to set for the roleDefinitionId property.
     */
    public void setRoleDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.roleDefinitionId = value;
    }
    /**
     * Sets the roleDisplayName property value. The display name for the directory role.
     * @param value Value to set for the roleDisplayName property.
     */
    public void setRoleDisplayName(@jakarta.annotation.Nullable final String value) {
        this.roleDisplayName = value;
    }
    /**
     * Sets the roleTemplateId property value. The globally unique identifier for the directory role.
     * @param value Value to set for the roleTemplateId property.
     */
    public void setRoleTemplateId(@jakarta.annotation.Nullable final String value) {
        this.roleTemplateId = value;
    }
}
