package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivilegedApproval extends Entity implements Parsable {
    /** The approvalDuration property */
    private Period approvalDuration;
    /** The approvalState property */
    private ApprovalState approvalState;
    /** The approvalType property */
    private String approvalType;
    /** The approverReason property */
    private String approverReason;
    /** The endDateTime property */
    private OffsetDateTime endDateTime;
    /** The request property */
    private PrivilegedRoleAssignmentRequest request;
    /** The requestorReason property */
    private String requestorReason;
    /** The roleId property */
    private String roleId;
    /** The roleInfo property */
    private PrivilegedRole roleInfo;
    /** The startDateTime property */
    private OffsetDateTime startDateTime;
    /** The userId property */
    private String userId;
    /**
     * Instantiates a new PrivilegedApproval and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrivilegedApproval() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivilegedApproval
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
        return this.approvalDuration;
    }
    /**
     * Gets the approvalState property value. The approvalState property
     * @return a approvalState
     */
    @javax.annotation.Nullable
    public ApprovalState getApprovalState() {
        return this.approvalState;
    }
    /**
     * Gets the approvalType property value. The approvalType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApprovalType() {
        return this.approvalType;
    }
    /**
     * Gets the approverReason property value. The approverReason property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApproverReason() {
        return this.approverReason;
    }
    /**
     * Gets the endDateTime property value. The endDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approvalDuration", (n) -> { this.setApprovalDuration(n.getPeriodValue()); });
        deserializerMap.put("approvalState", (n) -> { this.setApprovalState(n.getEnumValue(ApprovalState.class)); });
        deserializerMap.put("approvalType", (n) -> { this.setApprovalType(n.getStringValue()); });
        deserializerMap.put("approverReason", (n) -> { this.setApproverReason(n.getStringValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("request", (n) -> { this.setRequest(n.getObjectValue(PrivilegedRoleAssignmentRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("requestorReason", (n) -> { this.setRequestorReason(n.getStringValue()); });
        deserializerMap.put("roleId", (n) -> { this.setRoleId(n.getStringValue()); });
        deserializerMap.put("roleInfo", (n) -> { this.setRoleInfo(n.getObjectValue(PrivilegedRole::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the request property value. The request property
     * @return a privilegedRoleAssignmentRequest
     */
    @javax.annotation.Nullable
    public PrivilegedRoleAssignmentRequest getRequest() {
        return this.request;
    }
    /**
     * Gets the requestorReason property value. The requestorReason property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestorReason() {
        return this.requestorReason;
    }
    /**
     * Gets the roleId property value. The roleId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleId() {
        return this.roleId;
    }
    /**
     * Gets the roleInfo property value. The roleInfo property
     * @return a privilegedRole
     */
    @javax.annotation.Nullable
    public PrivilegedRole getRoleInfo() {
        return this.roleInfo;
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the userId property value. The userId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
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
    @javax.annotation.Nonnull
    public void setApprovalDuration(@javax.annotation.Nullable final Period value) {
        this.approvalDuration = value;
    }
    /**
     * Sets the approvalState property value. The approvalState property
     * @param value Value to set for the approvalState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApprovalState(@javax.annotation.Nullable final ApprovalState value) {
        this.approvalState = value;
    }
    /**
     * Sets the approvalType property value. The approvalType property
     * @param value Value to set for the approvalType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApprovalType(@javax.annotation.Nullable final String value) {
        this.approvalType = value;
    }
    /**
     * Sets the approverReason property value. The approverReason property
     * @param value Value to set for the approverReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApproverReason(@javax.annotation.Nullable final String value) {
        this.approverReason = value;
    }
    /**
     * Sets the endDateTime property value. The endDateTime property
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the request property value. The request property
     * @param value Value to set for the request property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequest(@javax.annotation.Nullable final PrivilegedRoleAssignmentRequest value) {
        this.request = value;
    }
    /**
     * Sets the requestorReason property value. The requestorReason property
     * @param value Value to set for the requestorReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestorReason(@javax.annotation.Nullable final String value) {
        this.requestorReason = value;
    }
    /**
     * Sets the roleId property value. The roleId property
     * @param value Value to set for the roleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleId(@javax.annotation.Nullable final String value) {
        this.roleId = value;
    }
    /**
     * Sets the roleInfo property value. The roleInfo property
     * @param value Value to set for the roleInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleInfo(@javax.annotation.Nullable final PrivilegedRole value) {
        this.roleInfo = value;
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
}
