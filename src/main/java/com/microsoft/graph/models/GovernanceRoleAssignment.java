package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GovernanceRoleAssignment extends Entity implements Parsable {
    /**
     * Instantiates a new GovernanceRoleAssignment and sets the default values.
     */
    public GovernanceRoleAssignment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GovernanceRoleAssignment
     */
    @jakarta.annotation.Nonnull
    public static GovernanceRoleAssignment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceRoleAssignment();
    }
    /**
     * Gets the assignmentState property value. The state of the assignment. The value can be Eligible for eligible assignment or Active if it's directly assigned Active by administrators, or activated on an eligible assignment by the users.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssignmentState() {
        return this.backingStore.get("assignmentState");
    }
    /**
     * Gets the endDateTime property value. For a non-permanent role assignment, this is the time when the role assignment is expired. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * Gets the externalId property value. The external ID the resource that is used to identify the role assignment in the provider.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.backingStore.get("externalId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignmentState", (n) -> { this.setAssignmentState(n.getStringValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("linkedEligibleRoleAssignment", (n) -> { this.setLinkedEligibleRoleAssignment(n.getObjectValue(GovernanceRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("linkedEligibleRoleAssignmentId", (n) -> { this.setLinkedEligibleRoleAssignmentId(n.getStringValue()); });
        deserializerMap.put("memberType", (n) -> { this.setMemberType(n.getStringValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(GovernanceResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("roleDefinition", (n) -> { this.setRoleDefinition(n.getObjectValue(GovernanceRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitionId", (n) -> { this.setRoleDefinitionId(n.getStringValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getObjectValue(GovernanceSubject::createFromDiscriminatorValue)); });
        deserializerMap.put("subjectId", (n) -> { this.setSubjectId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the linkedEligibleRoleAssignment property value. Read-only. If this is an active assignment and created due to activation on an eligible assignment, it represents the object of that eligible assignment; Otherwise, the value is null.
     * @return a GovernanceRoleAssignment
     */
    @jakarta.annotation.Nullable
    public GovernanceRoleAssignment getLinkedEligibleRoleAssignment() {
        return this.backingStore.get("linkedEligibleRoleAssignment");
    }
    /**
     * Gets the linkedEligibleRoleAssignmentId property value. If this is an active assignment and created due to activation on an eligible assignment, it represents the ID of that eligible assignment; Otherwise, the value is null.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLinkedEligibleRoleAssignmentId() {
        return this.backingStore.get("linkedEligibleRoleAssignmentId");
    }
    /**
     * Gets the memberType property value. The type of member. The value can be: Inherited (if the role assignment is inherited from a parent resource scope), Group (if the role assignment isn't inherited, but comes from the membership of a group assignment), or User (if the role assignment isn't inherited or from a group assignment).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMemberType() {
        return this.backingStore.get("memberType");
    }
    /**
     * Gets the resource property value. Read-only. The resource associated with the role assignment.
     * @return a GovernanceResource
     */
    @jakarta.annotation.Nullable
    public GovernanceResource getResource() {
        return this.backingStore.get("resource");
    }
    /**
     * Gets the resourceId property value. Required. The ID of the resource that the role assignment is associated with.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.backingStore.get("resourceId");
    }
    /**
     * Gets the roleDefinition property value. Read-only. The role definition associated with the role assignment.
     * @return a GovernanceRoleDefinition
     */
    @jakarta.annotation.Nullable
    public GovernanceRoleDefinition getRoleDefinition() {
        return this.backingStore.get("roleDefinition");
    }
    /**
     * Gets the roleDefinitionId property value. Required. The ID of the role definition that the role assignment is associated with.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.backingStore.get("roleDefinitionId");
    }
    /**
     * Gets the startDateTime property value. The start time of the role assignment. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the status property value. The status property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the subject property value. Read-only. The subject associated with the role assignment.
     * @return a GovernanceSubject
     */
    @jakarta.annotation.Nullable
    public GovernanceSubject getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Gets the subjectId property value. Required. The ID of the subject that the role assignment is associated with.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubjectId() {
        return this.backingStore.get("subjectId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignmentState", this.getAssignmentState());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeObjectValue("linkedEligibleRoleAssignment", this.getLinkedEligibleRoleAssignment());
        writer.writeStringValue("linkedEligibleRoleAssignmentId", this.getLinkedEligibleRoleAssignmentId());
        writer.writeStringValue("memberType", this.getMemberType());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeObjectValue("roleDefinition", this.getRoleDefinition());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("status", this.getStatus());
        writer.writeObjectValue("subject", this.getSubject());
        writer.writeStringValue("subjectId", this.getSubjectId());
    }
    /**
     * Sets the assignmentState property value. The state of the assignment. The value can be Eligible for eligible assignment or Active if it's directly assigned Active by administrators, or activated on an eligible assignment by the users.
     * @param value Value to set for the assignmentState property.
     */
    public void setAssignmentState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignmentState", value);
    }
    /**
     * Sets the endDateTime property value. For a non-permanent role assignment, this is the time when the role assignment is expired. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the externalId property value. The external ID the resource that is used to identify the role assignment in the provider.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalId", value);
    }
    /**
     * Sets the linkedEligibleRoleAssignment property value. Read-only. If this is an active assignment and created due to activation on an eligible assignment, it represents the object of that eligible assignment; Otherwise, the value is null.
     * @param value Value to set for the linkedEligibleRoleAssignment property.
     */
    public void setLinkedEligibleRoleAssignment(@jakarta.annotation.Nullable final GovernanceRoleAssignment value) {
        this.backingStore.set("linkedEligibleRoleAssignment", value);
    }
    /**
     * Sets the linkedEligibleRoleAssignmentId property value. If this is an active assignment and created due to activation on an eligible assignment, it represents the ID of that eligible assignment; Otherwise, the value is null.
     * @param value Value to set for the linkedEligibleRoleAssignmentId property.
     */
    public void setLinkedEligibleRoleAssignmentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("linkedEligibleRoleAssignmentId", value);
    }
    /**
     * Sets the memberType property value. The type of member. The value can be: Inherited (if the role assignment is inherited from a parent resource scope), Group (if the role assignment isn't inherited, but comes from the membership of a group assignment), or User (if the role assignment isn't inherited or from a group assignment).
     * @param value Value to set for the memberType property.
     */
    public void setMemberType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("memberType", value);
    }
    /**
     * Sets the resource property value. Read-only. The resource associated with the role assignment.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final GovernanceResource value) {
        this.backingStore.set("resource", value);
    }
    /**
     * Sets the resourceId property value. Required. The ID of the resource that the role assignment is associated with.
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceId", value);
    }
    /**
     * Sets the roleDefinition property value. Read-only. The role definition associated with the role assignment.
     * @param value Value to set for the roleDefinition property.
     */
    public void setRoleDefinition(@jakarta.annotation.Nullable final GovernanceRoleDefinition value) {
        this.backingStore.set("roleDefinition", value);
    }
    /**
     * Sets the roleDefinitionId property value. Required. The ID of the role definition that the role assignment is associated with.
     * @param value Value to set for the roleDefinitionId property.
     */
    public void setRoleDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleDefinitionId", value);
    }
    /**
     * Sets the startDateTime property value. The start time of the role assignment. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the subject property value. Read-only. The subject associated with the role assignment.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final GovernanceSubject value) {
        this.backingStore.set("subject", value);
    }
    /**
     * Sets the subjectId property value. Required. The ID of the subject that the role assignment is associated with.
     * @param value Value to set for the subjectId property.
     */
    public void setSubjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subjectId", value);
    }
}
