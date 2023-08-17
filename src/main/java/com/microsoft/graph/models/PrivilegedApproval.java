package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivilegedApproval extends Entity implements Parsable {
    /**
     * The approvalDuration property
     */
    private PeriodAndDuration approvalDuration;
    /**
     * The approvalState property
     */
    private ApprovalState approvalState;
    /**
     * The approvalType property
     */
    private String approvalType;
    /**
     * The approverReason property
     */
    private String approverReason;
    /**
     * The endDateTime property
     */
    private OffsetDateTime endDateTime;
    /**
     * The request property
     */
    private PrivilegedRoleAssignmentRequest request;
    /**
     * The requestorReason property
     */
    private String requestorReason;
    /**
     * The roleId property
     */
    private String roleId;
    /**
     * The roleInfo property
     */
    private PrivilegedRole roleInfo;
    /**
     * The startDateTime property
     */
    private OffsetDateTime startDateTime;
    /**
     * The userId property
     */
    private String userId;
    /**
     * Instantiates a new privilegedApproval and sets the default values.
     */
    public PrivilegedApproval() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedApproval
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedApproval createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedApproval();
    }
    /**
     * Gets the approvalDuration property value. The approvalDuration property
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getApprovalDuration() {
        return this.approvalDuration;
    }
    /**
     * Gets the approvalState property value. The approvalState property
     * @return a approvalState
     */
    @jakarta.annotation.Nullable
    public ApprovalState getApprovalState() {
        return this.approvalState;
    }
    /**
     * Gets the approvalType property value. The approvalType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getApprovalType() {
        return this.approvalType;
    }
    /**
     * Gets the approverReason property value. The approverReason property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getApproverReason() {
        return this.approverReason;
    }
    /**
     * Gets the endDateTime property value. The endDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approvalDuration", (n) -> { this.setApprovalDuration(n.getPeriodAndDurationValue()); });
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
    @jakarta.annotation.Nullable
    public PrivilegedRoleAssignmentRequest getRequest() {
        return this.request;
    }
    /**
     * Gets the requestorReason property value. The requestorReason property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRequestorReason() {
        return this.requestorReason;
    }
    /**
     * Gets the roleId property value. The roleId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRoleId() {
        return this.roleId;
    }
    /**
     * Gets the roleInfo property value. The roleInfo property
     * @return a privilegedRole
     */
    @jakarta.annotation.Nullable
    public PrivilegedRole getRoleInfo() {
        return this.roleInfo;
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the userId property value. The userId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writePeriodAndDurationValue("approvalDuration", this.getApprovalDuration());
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
     */
    public void setApprovalDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.approvalDuration = value;
    }
    /**
     * Sets the approvalState property value. The approvalState property
     * @param value Value to set for the approvalState property.
     */
    public void setApprovalState(@jakarta.annotation.Nullable final ApprovalState value) {
        this.approvalState = value;
    }
    /**
     * Sets the approvalType property value. The approvalType property
     * @param value Value to set for the approvalType property.
     */
    public void setApprovalType(@jakarta.annotation.Nullable final String value) {
        this.approvalType = value;
    }
    /**
     * Sets the approverReason property value. The approverReason property
     * @param value Value to set for the approverReason property.
     */
    public void setApproverReason(@jakarta.annotation.Nullable final String value) {
        this.approverReason = value;
    }
    /**
     * Sets the endDateTime property value. The endDateTime property
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the request property value. The request property
     * @param value Value to set for the request property.
     */
    public void setRequest(@jakarta.annotation.Nullable final PrivilegedRoleAssignmentRequest value) {
        this.request = value;
    }
    /**
     * Sets the requestorReason property value. The requestorReason property
     * @param value Value to set for the requestorReason property.
     */
    public void setRequestorReason(@jakarta.annotation.Nullable final String value) {
        this.requestorReason = value;
    }
    /**
     * Sets the roleId property value. The roleId property
     * @param value Value to set for the roleId property.
     */
    public void setRoleId(@jakarta.annotation.Nullable final String value) {
        this.roleId = value;
    }
    /**
     * Sets the roleInfo property value. The roleInfo property
     * @param value Value to set for the roleInfo property.
     */
    public void setRoleInfo(@jakarta.annotation.Nullable final PrivilegedRole value) {
        this.roleInfo = value;
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
