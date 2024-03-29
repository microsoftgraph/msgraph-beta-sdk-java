package com.microsoft.graph.beta.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedApproval extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PrivilegedApproval} and sets the default values.
     */
    public PrivilegedApproval() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PrivilegedApproval}
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedApproval createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedApproval();
    }
    /**
     * Gets the approvalDuration property value. The approvalDuration property
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getApprovalDuration() {
        return this.backingStore.get("approvalDuration");
    }
    /**
     * Gets the approvalState property value. The approvalState property
     * @return a {@link ApprovalState}
     */
    @jakarta.annotation.Nullable
    public ApprovalState getApprovalState() {
        return this.backingStore.get("approvalState");
    }
    /**
     * Gets the approvalType property value. The approvalType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApprovalType() {
        return this.backingStore.get("approvalType");
    }
    /**
     * Gets the approverReason property value. The approverReason property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApproverReason() {
        return this.backingStore.get("approverReason");
    }
    /**
     * Gets the endDateTime property value. The endDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("approvalDuration", (n) -> { this.setApprovalDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("approvalState", (n) -> { this.setApprovalState(n.getEnumValue(ApprovalState::forValue)); });
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
     * @return a {@link PrivilegedRoleAssignmentRequest}
     */
    @jakarta.annotation.Nullable
    public PrivilegedRoleAssignmentRequest getRequest() {
        return this.backingStore.get("request");
    }
    /**
     * Gets the requestorReason property value. The requestorReason property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRequestorReason() {
        return this.backingStore.get("requestorReason");
    }
    /**
     * Gets the roleId property value. The roleId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoleId() {
        return this.backingStore.get("roleId");
    }
    /**
     * Gets the roleInfo property value. The roleInfo property
     * @return a {@link PrivilegedRole}
     */
    @jakarta.annotation.Nullable
    public PrivilegedRole getRoleInfo() {
        return this.backingStore.get("roleInfo");
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the userId property value. The userId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
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
        this.backingStore.set("approvalDuration", value);
    }
    /**
     * Sets the approvalState property value. The approvalState property
     * @param value Value to set for the approvalState property.
     */
    public void setApprovalState(@jakarta.annotation.Nullable final ApprovalState value) {
        this.backingStore.set("approvalState", value);
    }
    /**
     * Sets the approvalType property value. The approvalType property
     * @param value Value to set for the approvalType property.
     */
    public void setApprovalType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("approvalType", value);
    }
    /**
     * Sets the approverReason property value. The approverReason property
     * @param value Value to set for the approverReason property.
     */
    public void setApproverReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("approverReason", value);
    }
    /**
     * Sets the endDateTime property value. The endDateTime property
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the request property value. The request property
     * @param value Value to set for the request property.
     */
    public void setRequest(@jakarta.annotation.Nullable final PrivilegedRoleAssignmentRequest value) {
        this.backingStore.set("request", value);
    }
    /**
     * Sets the requestorReason property value. The requestorReason property
     * @param value Value to set for the requestorReason property.
     */
    public void setRequestorReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("requestorReason", value);
    }
    /**
     * Sets the roleId property value. The roleId property
     * @param value Value to set for the roleId property.
     */
    public void setRoleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleId", value);
    }
    /**
     * Sets the roleInfo property value. The roleInfo property
     * @param value Value to set for the roleInfo property.
     */
    public void setRoleInfo(@jakarta.annotation.Nullable final PrivilegedRole value) {
        this.backingStore.set("roleInfo", value);
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}
