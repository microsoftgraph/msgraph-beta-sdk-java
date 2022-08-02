package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class GovernanceRoleAssignment extends Entity implements Parsable {
    /** The state of the assignment. The value can be Eligible for eligible assignment or Active if it is directly assigned Active by administrators, or activated on an eligible assignment by the users. */
    private String _assignmentState;
    /** For a non-permanent role assignment, this is the time when the role assignment will be expired. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _endDateTime;
    /** The external ID the resource that is used to identify the role assignment in the provider. */
    private String _externalId;
    /** Read-only. If this is an active assignment and created due to activation on an eligible assignment, it represents the object of that eligible assignment; Otherwise, the value is null. */
    private GovernanceRoleAssignment _linkedEligibleRoleAssignment;
    /** If this is an active assignment and created due to activation on an eligible assignment, it represents the ID of that eligible assignment; Otherwise, the value is null. */
    private String _linkedEligibleRoleAssignmentId;
    /** The type of member. The value can be: Inherited (if the role assignment is inherited from a parent resource scope), Group (if the role assignment is not inherited, but comes from the membership of a group assignment), or User (if the role assignment is neither inherited nor from a group assignment). */
    private String _memberType;
    /** Read-only. The resource associated with the role assignment. */
    private GovernanceResource _resource;
    /** Required. The ID of the resource which the role assignment is associated with. */
    private String _resourceId;
    /** Read-only. The role definition associated with the role assignment. */
    private GovernanceRoleDefinition _roleDefinition;
    /** Required. The ID of the role definition which the role assignment is associated with. */
    private String _roleDefinitionId;
    /** The start time of the role assignment. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _startDateTime;
    /** The status property */
    private String _status;
    /** Read-only. The subject associated with the role assignment. */
    private GovernanceSubject _subject;
    /** Required. The ID of the subject which the role assignment is associated with. */
    private String _subjectId;
    /**
     * Instantiates a new governanceRoleAssignment and sets the default values.
     * @return a void
     */
    public GovernanceRoleAssignment() {
        super();
        this.setOdataType("#microsoft.graph.governanceRoleAssignment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a governanceRoleAssignment
     */
    @javax.annotation.Nonnull
    public static GovernanceRoleAssignment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceRoleAssignment();
    }
    /**
     * Gets the assignmentState property value. The state of the assignment. The value can be Eligible for eligible assignment or Active if it is directly assigned Active by administrators, or activated on an eligible assignment by the users.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignmentState() {
        return this._assignmentState;
    }
    /**
     * Gets the endDateTime property value. For a non-permanent role assignment, this is the time when the role assignment will be expired. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * Gets the externalId property value. The external ID the resource that is used to identify the role assignment in the provider.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this._externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GovernanceRoleAssignment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignmentState", (n) -> { currentObject.setAssignmentState(n.getStringValue()); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("externalId", (n) -> { currentObject.setExternalId(n.getStringValue()); });
            this.put("linkedEligibleRoleAssignment", (n) -> { currentObject.setLinkedEligibleRoleAssignment(n.getObjectValue(GovernanceRoleAssignment::createFromDiscriminatorValue)); });
            this.put("linkedEligibleRoleAssignmentId", (n) -> { currentObject.setLinkedEligibleRoleAssignmentId(n.getStringValue()); });
            this.put("memberType", (n) -> { currentObject.setMemberType(n.getStringValue()); });
            this.put("resource", (n) -> { currentObject.setResource(n.getObjectValue(GovernanceResource::createFromDiscriminatorValue)); });
            this.put("resourceId", (n) -> { currentObject.setResourceId(n.getStringValue()); });
            this.put("roleDefinition", (n) -> { currentObject.setRoleDefinition(n.getObjectValue(GovernanceRoleDefinition::createFromDiscriminatorValue)); });
            this.put("roleDefinitionId", (n) -> { currentObject.setRoleDefinitionId(n.getStringValue()); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getObjectValue(GovernanceSubject::createFromDiscriminatorValue)); });
            this.put("subjectId", (n) -> { currentObject.setSubjectId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the linkedEligibleRoleAssignment property value. Read-only. If this is an active assignment and created due to activation on an eligible assignment, it represents the object of that eligible assignment; Otherwise, the value is null.
     * @return a governanceRoleAssignment
     */
    @javax.annotation.Nullable
    public GovernanceRoleAssignment getLinkedEligibleRoleAssignment() {
        return this._linkedEligibleRoleAssignment;
    }
    /**
     * Gets the linkedEligibleRoleAssignmentId property value. If this is an active assignment and created due to activation on an eligible assignment, it represents the ID of that eligible assignment; Otherwise, the value is null.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLinkedEligibleRoleAssignmentId() {
        return this._linkedEligibleRoleAssignmentId;
    }
    /**
     * Gets the memberType property value. The type of member. The value can be: Inherited (if the role assignment is inherited from a parent resource scope), Group (if the role assignment is not inherited, but comes from the membership of a group assignment), or User (if the role assignment is neither inherited nor from a group assignment).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMemberType() {
        return this._memberType;
    }
    /**
     * Gets the resource property value. Read-only. The resource associated with the role assignment.
     * @return a governanceResource
     */
    @javax.annotation.Nullable
    public GovernanceResource getResource() {
        return this._resource;
    }
    /**
     * Gets the resourceId property value. Required. The ID of the resource which the role assignment is associated with.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this._resourceId;
    }
    /**
     * Gets the roleDefinition property value. Read-only. The role definition associated with the role assignment.
     * @return a governanceRoleDefinition
     */
    @javax.annotation.Nullable
    public GovernanceRoleDefinition getRoleDefinition() {
        return this._roleDefinition;
    }
    /**
     * Gets the roleDefinitionId property value. Required. The ID of the role definition which the role assignment is associated with.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleDefinitionId() {
        return this._roleDefinitionId;
    }
    /**
     * Gets the startDateTime property value. The start time of the role assignment. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Gets the subject property value. Read-only. The subject associated with the role assignment.
     * @return a governanceSubject
     */
    @javax.annotation.Nullable
    public GovernanceSubject getSubject() {
        return this._subject;
    }
    /**
     * Gets the subjectId property value. Required. The ID of the subject which the role assignment is associated with.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubjectId() {
        return this._subjectId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the assignmentState property value. The state of the assignment. The value can be Eligible for eligible assignment or Active if it is directly assigned Active by administrators, or activated on an eligible assignment by the users.
     * @param value Value to set for the assignmentState property.
     * @return a void
     */
    public void setAssignmentState(@javax.annotation.Nullable final String value) {
        this._assignmentState = value;
    }
    /**
     * Sets the endDateTime property value. For a non-permanent role assignment, this is the time when the role assignment will be expired. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the externalId property value. The external ID the resource that is used to identify the role assignment in the provider.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this._externalId = value;
    }
    /**
     * Sets the linkedEligibleRoleAssignment property value. Read-only. If this is an active assignment and created due to activation on an eligible assignment, it represents the object of that eligible assignment; Otherwise, the value is null.
     * @param value Value to set for the linkedEligibleRoleAssignment property.
     * @return a void
     */
    public void setLinkedEligibleRoleAssignment(@javax.annotation.Nullable final GovernanceRoleAssignment value) {
        this._linkedEligibleRoleAssignment = value;
    }
    /**
     * Sets the linkedEligibleRoleAssignmentId property value. If this is an active assignment and created due to activation on an eligible assignment, it represents the ID of that eligible assignment; Otherwise, the value is null.
     * @param value Value to set for the linkedEligibleRoleAssignmentId property.
     * @return a void
     */
    public void setLinkedEligibleRoleAssignmentId(@javax.annotation.Nullable final String value) {
        this._linkedEligibleRoleAssignmentId = value;
    }
    /**
     * Sets the memberType property value. The type of member. The value can be: Inherited (if the role assignment is inherited from a parent resource scope), Group (if the role assignment is not inherited, but comes from the membership of a group assignment), or User (if the role assignment is neither inherited nor from a group assignment).
     * @param value Value to set for the memberType property.
     * @return a void
     */
    public void setMemberType(@javax.annotation.Nullable final String value) {
        this._memberType = value;
    }
    /**
     * Sets the resource property value. Read-only. The resource associated with the role assignment.
     * @param value Value to set for the resource property.
     * @return a void
     */
    public void setResource(@javax.annotation.Nullable final GovernanceResource value) {
        this._resource = value;
    }
    /**
     * Sets the resourceId property value. Required. The ID of the resource which the role assignment is associated with.
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this._resourceId = value;
    }
    /**
     * Sets the roleDefinition property value. Read-only. The role definition associated with the role assignment.
     * @param value Value to set for the roleDefinition property.
     * @return a void
     */
    public void setRoleDefinition(@javax.annotation.Nullable final GovernanceRoleDefinition value) {
        this._roleDefinition = value;
    }
    /**
     * Sets the roleDefinitionId property value. Required. The ID of the role definition which the role assignment is associated with.
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    public void setRoleDefinitionId(@javax.annotation.Nullable final String value) {
        this._roleDefinitionId = value;
    }
    /**
     * Sets the startDateTime property value. The start time of the role assignment. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
    /**
     * Sets the subject property value. Read-only. The subject associated with the role assignment.
     * @param value Value to set for the subject property.
     * @return a void
     */
    public void setSubject(@javax.annotation.Nullable final GovernanceSubject value) {
        this._subject = value;
    }
    /**
     * Sets the subjectId property value. Required. The ID of the subject which the role assignment is associated with.
     * @param value Value to set for the subjectId property.
     * @return a void
     */
    public void setSubjectId(@javax.annotation.Nullable final String value) {
        this._subjectId = value;
    }
}
