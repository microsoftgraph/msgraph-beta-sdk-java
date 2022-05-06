package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivilegedApproval extends Entity implements Parsable {
    /** The approvalDuration property  */
    private Period _approvalDuration;
    /** Possible values are: pending, approved, denied, aborted, canceled.  */
    private ApprovalState _approvalState;
    /** The approvalType property  */
    private String _approvalType;
    /** The approverReason property  */
    private String _approverReason;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z  */
    private OffsetDateTime _endDateTime;
    /** Read-only. The role assignment request for this approval object  */
    private PrivilegedRoleAssignmentRequest _request;
    /** The requestorReason property  */
    private String _requestorReason;
    /** The roleId property  */
    private String _roleId;
    /** Read-only. Nullable.  */
    private PrivilegedRole _roleInfo;
    /** The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z  */
    private OffsetDateTime _startDateTime;
    /** The userId property  */
    private String _userId;
    /**
     * Instantiates a new privilegedApproval and sets the default values.
     * @return a void
     */
    public PrivilegedApproval() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedApproval
     */
    @javax.annotation.Nonnull
    public static PrivilegedApproval createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedApproval();
    }
    /**
     * Gets the approvalDuration property value. The approvalDuration property
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getApprovalDuration() {
        return this._approvalDuration;
    }
    /**
     * Gets the approvalState property value. Possible values are: pending, approved, denied, aborted, canceled.
     * @return a approvalState
     */
    @javax.annotation.Nullable
    public ApprovalState getApprovalState() {
        return this._approvalState;
    }
    /**
     * Gets the approvalType property value. The approvalType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApprovalType() {
        return this._approvalType;
    }
    /**
     * Gets the approverReason property value. The approverReason property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApproverReason() {
        return this._approverReason;
    }
    /**
     * Gets the endDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrivilegedApproval currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("approvalDuration", (n) -> { currentObject.setApprovalDuration(n.getPeriodValue()); });
            this.put("approvalState", (n) -> { currentObject.setApprovalState(n.getEnumValue(ApprovalState.class)); });
            this.put("approvalType", (n) -> { currentObject.setApprovalType(n.getStringValue()); });
            this.put("approverReason", (n) -> { currentObject.setApproverReason(n.getStringValue()); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("request", (n) -> { currentObject.setRequest(n.getObjectValue(PrivilegedRoleAssignmentRequest::createFromDiscriminatorValue)); });
            this.put("requestorReason", (n) -> { currentObject.setRequestorReason(n.getStringValue()); });
            this.put("roleId", (n) -> { currentObject.setRoleId(n.getStringValue()); });
            this.put("roleInfo", (n) -> { currentObject.setRoleInfo(n.getObjectValue(PrivilegedRole::createFromDiscriminatorValue)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the request property value. Read-only. The role assignment request for this approval object
     * @return a privilegedRoleAssignmentRequest
     */
    @javax.annotation.Nullable
    public PrivilegedRoleAssignmentRequest getRequest() {
        return this._request;
    }
    /**
     * Gets the requestorReason property value. The requestorReason property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestorReason() {
        return this._requestorReason;
    }
    /**
     * Gets the roleId property value. The roleId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleId() {
        return this._roleId;
    }
    /**
     * Gets the roleInfo property value. Read-only. Nullable.
     * @return a privilegedRole
     */
    @javax.annotation.Nullable
    public PrivilegedRole getRoleInfo() {
        return this._roleInfo;
    }
    /**
     * Gets the startDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the userId property value. The userId property
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writePeriodValue("approvalDuration", this.getApprovalDuration());
        writer.writeEnumValue("approvalState", this.getApprovalState());
        writer.writeStringValue("approvalType", this.getApprovalType());
        writer.writeStringValue("approverReason", this.getApproverReason());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeObjectValue("request", this.getRequest());
        writer.writeStringValue("requestorReason", this.getRequestorReason());
        writer.writeStringValue("roleId", this.getRoleId());
        writer.writeObjectValue("roleInfo", this.getRoleInfo());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the approvalDuration property value. The approvalDuration property
     * @param value Value to set for the approvalDuration property.
     * @return a void
     */
    public void setApprovalDuration(@javax.annotation.Nullable final Period value) {
        this._approvalDuration = value;
    }
    /**
     * Sets the approvalState property value. Possible values are: pending, approved, denied, aborted, canceled.
     * @param value Value to set for the approvalState property.
     * @return a void
     */
    public void setApprovalState(@javax.annotation.Nullable final ApprovalState value) {
        this._approvalState = value;
    }
    /**
     * Sets the approvalType property value. The approvalType property
     * @param value Value to set for the approvalType property.
     * @return a void
     */
    public void setApprovalType(@javax.annotation.Nullable final String value) {
        this._approvalType = value;
    }
    /**
     * Sets the approverReason property value. The approverReason property
     * @param value Value to set for the approverReason property.
     * @return a void
     */
    public void setApproverReason(@javax.annotation.Nullable final String value) {
        this._approverReason = value;
    }
    /**
     * Sets the endDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the request property value. Read-only. The role assignment request for this approval object
     * @param value Value to set for the request property.
     * @return a void
     */
    public void setRequest(@javax.annotation.Nullable final PrivilegedRoleAssignmentRequest value) {
        this._request = value;
    }
    /**
     * Sets the requestorReason property value. The requestorReason property
     * @param value Value to set for the requestorReason property.
     * @return a void
     */
    public void setRequestorReason(@javax.annotation.Nullable final String value) {
        this._requestorReason = value;
    }
    /**
     * Sets the roleId property value. The roleId property
     * @param value Value to set for the roleId property.
     * @return a void
     */
    public void setRoleId(@javax.annotation.Nullable final String value) {
        this._roleId = value;
    }
    /**
     * Sets the roleInfo property value. Read-only. Nullable.
     * @param value Value to set for the roleInfo property.
     * @return a void
     */
    public void setRoleInfo(@javax.annotation.Nullable final PrivilegedRole value) {
        this._roleInfo = value;
    }
    /**
     * Sets the startDateTime property value. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
