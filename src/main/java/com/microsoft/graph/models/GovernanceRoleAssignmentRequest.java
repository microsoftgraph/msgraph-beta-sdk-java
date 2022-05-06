package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GovernanceRoleAssignmentRequest extends Entity implements Parsable {
    /** Required. The state of the assignment. The possible values are: Eligible (for eligible assignment),  Active (if it is directly assigned), Active (by administrators, or activated on an eligible assignment by the users).  */
    private String _assignmentState;
    /** If this is a request for role activation, it represents the id of the eligible assignment being referred; Otherwise, the value is null.  */
    private String _linkedEligibleRoleAssignmentId;
    /** A message provided by users and administrators when create the request about why it is needed.  */
    private String _reason;
    /** Read-only. The request create time. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z  */
    private OffsetDateTime _requestedDateTime;
    /** Read-only. The resource that the request aims to.  */
    private GovernanceResource _resource;
    /** Required. The unique identifier of the Azure resource that is associated with the role assignment request. Azure resources can include subscriptions, resource groups, virtual machines, and SQL databases.  */
    private String _resourceId;
    /** Read-only. The role definition that the request aims to.  */
    private GovernanceRoleDefinition _roleDefinition;
    /** Required. The identifier of the Azure role definition that the role assignment request is associated with.  */
    private String _roleDefinitionId;
    /** The schedule object of the role assignment request.  */
    private GovernanceSchedule _schedule;
    /** The status of the role assignment request.  */
    private GovernanceRoleAssignmentRequestStatus _status;
    /** Read-only. The user/group principal.  */
    private GovernanceSubject _subject;
    /** Required. The unique identifier of the principal or subject that the role assignment request is associated with. Principals can be users, groups, or service principals.  */
    private String _subjectId;
    /** Required. Representing the type of the operation on the role assignment. The possible values are: AdminAdd , UserAdd , AdminUpdate , AdminRemove , UserRemove , UserExtend , AdminExtend , UserRenew , AdminRenew.  */
    private String _type;
    /**
     * Instantiates a new governanceRoleAssignmentRequest and sets the default values.
     * @return a void
     */
    public GovernanceRoleAssignmentRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a governanceRoleAssignmentRequest
     */
    @javax.annotation.Nonnull
    public static GovernanceRoleAssignmentRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceRoleAssignmentRequest();
    }
    /**
     * Gets the assignmentState property value. Required. The state of the assignment. The possible values are: Eligible (for eligible assignment),  Active (if it is directly assigned), Active (by administrators, or activated on an eligible assignment by the users).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignmentState() {
        return this._assignmentState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GovernanceRoleAssignmentRequest currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("assignmentState", (n) -> { currentObject.setAssignmentState(n.getStringValue()); });
            this.put("linkedEligibleRoleAssignmentId", (n) -> { currentObject.setLinkedEligibleRoleAssignmentId(n.getStringValue()); });
            this.put("reason", (n) -> { currentObject.setReason(n.getStringValue()); });
            this.put("requestedDateTime", (n) -> { currentObject.setRequestedDateTime(n.getOffsetDateTimeValue()); });
            this.put("resource", (n) -> { currentObject.setResource(n.getObjectValue(GovernanceResource::createFromDiscriminatorValue)); });
            this.put("resourceId", (n) -> { currentObject.setResourceId(n.getStringValue()); });
            this.put("roleDefinition", (n) -> { currentObject.setRoleDefinition(n.getObjectValue(GovernanceRoleDefinition::createFromDiscriminatorValue)); });
            this.put("roleDefinitionId", (n) -> { currentObject.setRoleDefinitionId(n.getStringValue()); });
            this.put("schedule", (n) -> { currentObject.setSchedule(n.getObjectValue(GovernanceSchedule::createFromDiscriminatorValue)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getObjectValue(GovernanceRoleAssignmentRequestStatus::createFromDiscriminatorValue)); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getObjectValue(GovernanceSubject::createFromDiscriminatorValue)); });
            this.put("subjectId", (n) -> { currentObject.setSubjectId(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the linkedEligibleRoleAssignmentId property value. If this is a request for role activation, it represents the id of the eligible assignment being referred; Otherwise, the value is null.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLinkedEligibleRoleAssignmentId() {
        return this._linkedEligibleRoleAssignmentId;
    }
    /**
     * Gets the reason property value. A message provided by users and administrators when create the request about why it is needed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReason() {
        return this._reason;
    }
    /**
     * Gets the requestedDateTime property value. Read-only. The request create time. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRequestedDateTime() {
        return this._requestedDateTime;
    }
    /**
     * Gets the resource property value. Read-only. The resource that the request aims to.
     * @return a governanceResource
     */
    @javax.annotation.Nullable
    public GovernanceResource getResource() {
        return this._resource;
    }
    /**
     * Gets the resourceId property value. Required. The unique identifier of the Azure resource that is associated with the role assignment request. Azure resources can include subscriptions, resource groups, virtual machines, and SQL databases.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this._resourceId;
    }
    /**
     * Gets the roleDefinition property value. Read-only. The role definition that the request aims to.
     * @return a governanceRoleDefinition
     */
    @javax.annotation.Nullable
    public GovernanceRoleDefinition getRoleDefinition() {
        return this._roleDefinition;
    }
    /**
     * Gets the roleDefinitionId property value. Required. The identifier of the Azure role definition that the role assignment request is associated with.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleDefinitionId() {
        return this._roleDefinitionId;
    }
    /**
     * Gets the schedule property value. The schedule object of the role assignment request.
     * @return a governanceSchedule
     */
    @javax.annotation.Nullable
    public GovernanceSchedule getSchedule() {
        return this._schedule;
    }
    /**
     * Gets the status property value. The status of the role assignment request.
     * @return a governanceRoleAssignmentRequestStatus
     */
    @javax.annotation.Nullable
    public GovernanceRoleAssignmentRequestStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the subject property value. Read-only. The user/group principal.
     * @return a governanceSubject
     */
    @javax.annotation.Nullable
    public GovernanceSubject getSubject() {
        return this._subject;
    }
    /**
     * Gets the subjectId property value. Required. The unique identifier of the principal or subject that the role assignment request is associated with. Principals can be users, groups, or service principals.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubjectId() {
        return this._subjectId;
    }
    /**
     * Gets the type property value. Required. Representing the type of the operation on the role assignment. The possible values are: AdminAdd , UserAdd , AdminUpdate , AdminRemove , UserRemove , UserExtend , AdminExtend , UserRenew , AdminRenew.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
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
     * @return a void
     */
    public void setAssignmentState(@javax.annotation.Nullable final String value) {
        this._assignmentState = value;
    }
    /**
     * Sets the linkedEligibleRoleAssignmentId property value. If this is a request for role activation, it represents the id of the eligible assignment being referred; Otherwise, the value is null.
     * @param value Value to set for the linkedEligibleRoleAssignmentId property.
     * @return a void
     */
    public void setLinkedEligibleRoleAssignmentId(@javax.annotation.Nullable final String value) {
        this._linkedEligibleRoleAssignmentId = value;
    }
    /**
     * Sets the reason property value. A message provided by users and administrators when create the request about why it is needed.
     * @param value Value to set for the reason property.
     * @return a void
     */
    public void setReason(@javax.annotation.Nullable final String value) {
        this._reason = value;
    }
    /**
     * Sets the requestedDateTime property value. Read-only. The request create time. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the requestedDateTime property.
     * @return a void
     */
    public void setRequestedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._requestedDateTime = value;
    }
    /**
     * Sets the resource property value. Read-only. The resource that the request aims to.
     * @param value Value to set for the resource property.
     * @return a void
     */
    public void setResource(@javax.annotation.Nullable final GovernanceResource value) {
        this._resource = value;
    }
    /**
     * Sets the resourceId property value. Required. The unique identifier of the Azure resource that is associated with the role assignment request. Azure resources can include subscriptions, resource groups, virtual machines, and SQL databases.
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this._resourceId = value;
    }
    /**
     * Sets the roleDefinition property value. Read-only. The role definition that the request aims to.
     * @param value Value to set for the roleDefinition property.
     * @return a void
     */
    public void setRoleDefinition(@javax.annotation.Nullable final GovernanceRoleDefinition value) {
        this._roleDefinition = value;
    }
    /**
     * Sets the roleDefinitionId property value. Required. The identifier of the Azure role definition that the role assignment request is associated with.
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    public void setRoleDefinitionId(@javax.annotation.Nullable final String value) {
        this._roleDefinitionId = value;
    }
    /**
     * Sets the schedule property value. The schedule object of the role assignment request.
     * @param value Value to set for the schedule property.
     * @return a void
     */
    public void setSchedule(@javax.annotation.Nullable final GovernanceSchedule value) {
        this._schedule = value;
    }
    /**
     * Sets the status property value. The status of the role assignment request.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final GovernanceRoleAssignmentRequestStatus value) {
        this._status = value;
    }
    /**
     * Sets the subject property value. Read-only. The user/group principal.
     * @param value Value to set for the subject property.
     * @return a void
     */
    public void setSubject(@javax.annotation.Nullable final GovernanceSubject value) {
        this._subject = value;
    }
    /**
     * Sets the subjectId property value. Required. The unique identifier of the principal or subject that the role assignment request is associated with. Principals can be users, groups, or service principals.
     * @param value Value to set for the subjectId property.
     * @return a void
     */
    public void setSubjectId(@javax.annotation.Nullable final String value) {
        this._subjectId = value;
    }
    /**
     * Sets the type property value. Required. Representing the type of the operation on the role assignment. The possible values are: AdminAdd , UserAdd , AdminUpdate , AdminRemove , UserRemove , UserExtend , AdminExtend , UserRenew , AdminRenew.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
}
