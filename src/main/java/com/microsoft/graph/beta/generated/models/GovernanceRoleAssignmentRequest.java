package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GovernanceRoleAssignmentRequest extends Entity implements Parsable {
    /**
     * Instantiates a new {@link GovernanceRoleAssignmentRequest} and sets the default values.
     */
    public GovernanceRoleAssignmentRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GovernanceRoleAssignmentRequest}
     */
    @jakarta.annotation.Nonnull
    public static GovernanceRoleAssignmentRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceRoleAssignmentRequest();
    }
    /**
     * Gets the assignmentState property value. Required. The state of the assignment. The possible values are: Eligible (for eligible assignment),  Active (if it is directly assigned), Active (by administrators, or activated on an eligible assignment by the users).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignmentState() {
        return this.backingStore.get("assignmentState");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignmentState", (n) -> { this.setAssignmentState(n.getStringValue()); });
        deserializerMap.put("linkedEligibleRoleAssignmentId", (n) -> { this.setLinkedEligibleRoleAssignmentId(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("requestedDateTime", (n) -> { this.setRequestedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(GovernanceResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("roleDefinition", (n) -> { this.setRoleDefinition(n.getObjectValue(GovernanceRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitionId", (n) -> { this.setRoleDefinitionId(n.getStringValue()); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(GovernanceSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(GovernanceRoleAssignmentRequestStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getObjectValue(GovernanceSubject::createFromDiscriminatorValue)); });
        deserializerMap.put("subjectId", (n) -> { this.setSubjectId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the linkedEligibleRoleAssignmentId property value. If this is a request for role activation, it represents the id of the eligible assignment being referred; Otherwise, the value is null.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLinkedEligibleRoleAssignmentId() {
        return this.backingStore.get("linkedEligibleRoleAssignmentId");
    }
    /**
     * Gets the reason property value. A message provided by users and administrators when create the request about why it is needed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.backingStore.get("reason");
    }
    /**
     * Gets the requestedDateTime property value. Read-only. The request create time. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestedDateTime() {
        return this.backingStore.get("requestedDateTime");
    }
    /**
     * Gets the resource property value. Read-only. The resource that the request aims to.
     * @return a {@link GovernanceResource}
     */
    @jakarta.annotation.Nullable
    public GovernanceResource getResource() {
        return this.backingStore.get("resource");
    }
    /**
     * Gets the resourceId property value. Required. The unique identifier of the Azure resource that is associated with the role assignment request. Azure resources can include subscriptions, resource groups, virtual machines, and SQL databases.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.backingStore.get("resourceId");
    }
    /**
     * Gets the roleDefinition property value. Read-only. The role definition that the request aims to.
     * @return a {@link GovernanceRoleDefinition}
     */
    @jakarta.annotation.Nullable
    public GovernanceRoleDefinition getRoleDefinition() {
        return this.backingStore.get("roleDefinition");
    }
    /**
     * Gets the roleDefinitionId property value. Required. The identifier of the Azure role definition that the role assignment request is associated with.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.backingStore.get("roleDefinitionId");
    }
    /**
     * Gets the schedule property value. The schedule object of the role assignment request.
     * @return a {@link GovernanceSchedule}
     */
    @jakarta.annotation.Nullable
    public GovernanceSchedule getSchedule() {
        return this.backingStore.get("schedule");
    }
    /**
     * Gets the status property value. The status of the role assignment request.
     * @return a {@link GovernanceRoleAssignmentRequestStatus}
     */
    @jakarta.annotation.Nullable
    public GovernanceRoleAssignmentRequestStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the subject property value. Read-only. The user/group principal.
     * @return a {@link GovernanceSubject}
     */
    @jakarta.annotation.Nullable
    public GovernanceSubject getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the subjectId property value. Required. The unique identifier of the principal or subject that the role assignment request is associated with. Principals can be users, groups, or service principals.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubjectId() {
        return this.backingStore.get("subjectId");
    }
    /**
     * Gets the type property value. Required. Representing the type of the operation on the role assignment. The possible values are: AdminAdd , UserAdd , AdminUpdate , AdminRemove , UserRemove , UserExtend , AdminExtend , UserRenew , AdminRenew.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignmentState", this.getAssignmentState());
        writer.writeStringValue("linkedEligibleRoleAssignmentId", this.getLinkedEligibleRoleAssignmentId());
        writer.writeStringValue("reason", this.getReason());
        writer.writeOffsetDateTimeValue("requestedDateTime", this.getRequestedDateTime());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeObjectValue("roleDefinition", this.getRoleDefinition());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeObjectValue("status", this.getStatus());
        writer.writeObjectValue("subject", this.getSubject());
        writer.writeStringValue("subjectId", this.getSubjectId());
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the assignmentState property value. Required. The state of the assignment. The possible values are: Eligible (for eligible assignment),  Active (if it is directly assigned), Active (by administrators, or activated on an eligible assignment by the users).
     * @param value Value to set for the assignmentState property.
     */
    public void setAssignmentState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignmentState", value);
    }
    /**
     * Sets the linkedEligibleRoleAssignmentId property value. If this is a request for role activation, it represents the id of the eligible assignment being referred; Otherwise, the value is null.
     * @param value Value to set for the linkedEligibleRoleAssignmentId property.
     */
    public void setLinkedEligibleRoleAssignmentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("linkedEligibleRoleAssignmentId", value);
    }
    /**
     * Sets the reason property value. A message provided by users and administrators when create the request about why it is needed.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reason", value);
    }
    /**
     * Sets the requestedDateTime property value. Read-only. The request create time. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the requestedDateTime property.
     */
    public void setRequestedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("requestedDateTime", value);
    }
    /**
     * Sets the resource property value. Read-only. The resource that the request aims to.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final GovernanceResource value) {
        this.backingStore.set("resource", value);
    }
    /**
     * Sets the resourceId property value. Required. The unique identifier of the Azure resource that is associated with the role assignment request. Azure resources can include subscriptions, resource groups, virtual machines, and SQL databases.
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceId", value);
    }
    /**
     * Sets the roleDefinition property value. Read-only. The role definition that the request aims to.
     * @param value Value to set for the roleDefinition property.
     */
    public void setRoleDefinition(@jakarta.annotation.Nullable final GovernanceRoleDefinition value) {
        this.backingStore.set("roleDefinition", value);
    }
    /**
     * Sets the roleDefinitionId property value. Required. The identifier of the Azure role definition that the role assignment request is associated with.
     * @param value Value to set for the roleDefinitionId property.
     */
    public void setRoleDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleDefinitionId", value);
    }
    /**
     * Sets the schedule property value. The schedule object of the role assignment request.
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final GovernanceSchedule value) {
        this.backingStore.set("schedule", value);
    }
    /**
     * Sets the status property value. The status of the role assignment request.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final GovernanceRoleAssignmentRequestStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the subject property value. Read-only. The user/group principal.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final GovernanceSubject value) {
        this.backingStore.set("subject", value);
    }
    /**
     * Sets the subjectId property value. Required. The unique identifier of the principal or subject that the role assignment request is associated with. Principals can be users, groups, or service principals.
     * @param value Value to set for the subjectId property.
     */
    public void setSubjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subjectId", value);
    }
    /**
     * Sets the type property value. Required. Representing the type of the operation on the role assignment. The possible values are: AdminAdd , UserAdd , AdminUpdate , AdminRemove , UserRemove , UserExtend , AdminExtend , UserRenew , AdminRenew.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("type", value);
    }
}
