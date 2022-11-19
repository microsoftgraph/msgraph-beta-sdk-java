package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivilegedRoleAssignmentRequest extends Entity implements Parsable {
    /** The state of the assignment. The value can be Eligible for eligible assignment Active - if it is directly assigned Active by administrators, or activated on an eligible assignment by the users. */
    private String _assignmentState;
    /** The duration of a role assignment. */
    private String _duration;
    /** The reason for the role assignment. */
    private String _reason;
    /** Read-only. The request create time. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _requestedDateTime;
    /** The id of the role. */
    private String _roleId;
    /** The roleInfo object of the role assignment request. */
    private PrivilegedRole _roleInfo;
    /** The schedule object of the role assignment request. */
    private GovernanceSchedule _schedule;
    /** Read-only.The status of the role assignment request. The value can be NotStarted,Completed,RequestedApproval,Scheduled,Approved,ApprovalDenied,ApprovalAborted,Cancelling,Cancelled,Revoked,RequestExpired. */
    private String _status;
    /** The ticketNumber for the role assignment. */
    private String _ticketNumber;
    /** The ticketSystem for the role assignment. */
    private String _ticketSystem;
    /** Representing the type of the operation on the role assignment. The value can be AdminAdd: Administrators add users to roles;UserAdd: Users add role assignments. */
    private String _type;
    /** The id of the user. */
    private String _userId;
    /**
     * Instantiates a new privilegedRoleAssignmentRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrivilegedRoleAssignmentRequest() {
        super();
        this.setOdataType("#microsoft.graph.privilegedRoleAssignmentRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedRoleAssignmentRequest
     */
    @javax.annotation.Nonnull
    public static PrivilegedRoleAssignmentRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedRoleAssignmentRequest();
    }
    /**
     * Gets the assignmentState property value. The state of the assignment. The value can be Eligible for eligible assignment Active - if it is directly assigned Active by administrators, or activated on an eligible assignment by the users.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssignmentState() {
        return this._assignmentState;
    }
    /**
     * Gets the duration property value. The duration of a role assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDuration() {
        return this._duration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrivilegedRoleAssignmentRequest currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignmentState", (n) -> { currentObject.setAssignmentState(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { currentObject.setDuration(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { currentObject.setReason(n.getStringValue()); });
        deserializerMap.put("requestedDateTime", (n) -> { currentObject.setRequestedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleId", (n) -> { currentObject.setRoleId(n.getStringValue()); });
        deserializerMap.put("roleInfo", (n) -> { currentObject.setRoleInfo(n.getObjectValue(PrivilegedRole::createFromDiscriminatorValue)); });
        deserializerMap.put("schedule", (n) -> { currentObject.setSchedule(n.getObjectValue(GovernanceSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
        deserializerMap.put("ticketNumber", (n) -> { currentObject.setTicketNumber(n.getStringValue()); });
        deserializerMap.put("ticketSystem", (n) -> { currentObject.setTicketSystem(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reason property value. The reason for the role assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReason() {
        return this._reason;
    }
    /**
     * Gets the requestedDateTime property value. Read-only. The request create time. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRequestedDateTime() {
        return this._requestedDateTime;
    }
    /**
     * Gets the roleId property value. The id of the role.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleId() {
        return this._roleId;
    }
    /**
     * Gets the roleInfo property value. The roleInfo object of the role assignment request.
     * @return a privilegedRole
     */
    @javax.annotation.Nullable
    public PrivilegedRole getRoleInfo() {
        return this._roleInfo;
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
     * Gets the status property value. Read-only.The status of the role assignment request. The value can be NotStarted,Completed,RequestedApproval,Scheduled,Approved,ApprovalDenied,ApprovalAborted,Cancelling,Cancelled,Revoked,RequestExpired.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Gets the ticketNumber property value. The ticketNumber for the role assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTicketNumber() {
        return this._ticketNumber;
    }
    /**
     * Gets the ticketSystem property value. The ticketSystem for the role assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTicketSystem() {
        return this._ticketSystem;
    }
    /**
     * Gets the type property value. Representing the type of the operation on the role assignment. The value can be AdminAdd: Administrators add users to roles;UserAdd: Users add role assignments.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Gets the userId property value. The id of the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
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
        writer.writeStringValue("assignmentState", this.getAssignmentState());
        writer.writeStringValue("duration", this.getDuration());
        writer.writeStringValue("reason", this.getReason());
        writer.writeOffsetDateTimeValue("requestedDateTime", this.getRequestedDateTime());
        writer.writeStringValue("roleId", this.getRoleId());
        writer.writeObjectValue("roleInfo", this.getRoleInfo());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("ticketNumber", this.getTicketNumber());
        writer.writeStringValue("ticketSystem", this.getTicketSystem());
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the assignmentState property value. The state of the assignment. The value can be Eligible for eligible assignment Active - if it is directly assigned Active by administrators, or activated on an eligible assignment by the users.
     * @param value Value to set for the assignmentState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentState(@javax.annotation.Nullable final String value) {
        this._assignmentState = value;
    }
    /**
     * Sets the duration property value. The duration of a role assignment.
     * @param value Value to set for the duration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDuration(@javax.annotation.Nullable final String value) {
        this._duration = value;
    }
    /**
     * Sets the reason property value. The reason for the role assignment.
     * @param value Value to set for the reason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReason(@javax.annotation.Nullable final String value) {
        this._reason = value;
    }
    /**
     * Sets the requestedDateTime property value. Read-only. The request create time. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the requestedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._requestedDateTime = value;
    }
    /**
     * Sets the roleId property value. The id of the role.
     * @param value Value to set for the roleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleId(@javax.annotation.Nullable final String value) {
        this._roleId = value;
    }
    /**
     * Sets the roleInfo property value. The roleInfo object of the role assignment request.
     * @param value Value to set for the roleInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleInfo(@javax.annotation.Nullable final PrivilegedRole value) {
        this._roleInfo = value;
    }
    /**
     * Sets the schedule property value. The schedule object of the role assignment request.
     * @param value Value to set for the schedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchedule(@javax.annotation.Nullable final GovernanceSchedule value) {
        this._schedule = value;
    }
    /**
     * Sets the status property value. Read-only.The status of the role assignment request. The value can be NotStarted,Completed,RequestedApproval,Scheduled,Approved,ApprovalDenied,ApprovalAborted,Cancelling,Cancelled,Revoked,RequestExpired.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
    /**
     * Sets the ticketNumber property value. The ticketNumber for the role assignment.
     * @param value Value to set for the ticketNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTicketNumber(@javax.annotation.Nullable final String value) {
        this._ticketNumber = value;
    }
    /**
     * Sets the ticketSystem property value. The ticketSystem for the role assignment.
     * @param value Value to set for the ticketSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTicketSystem(@javax.annotation.Nullable final String value) {
        this._ticketSystem = value;
    }
    /**
     * Sets the type property value. Representing the type of the operation on the role assignment. The value can be AdminAdd: Administrators add users to roles;UserAdd: Users add role assignments.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
    /**
     * Sets the userId property value. The id of the user.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
