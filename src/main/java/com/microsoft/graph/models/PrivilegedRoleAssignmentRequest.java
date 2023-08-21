package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivilegedRoleAssignmentRequest extends Entity implements Parsable {
    /**
     * The assignmentState property
     */
    private String assignmentState;
    /**
     * The duration property
     */
    private String duration;
    /**
     * The reason property
     */
    private String reason;
    /**
     * The requestedDateTime property
     */
    private OffsetDateTime requestedDateTime;
    /**
     * The roleId property
     */
    private String roleId;
    /**
     * The roleInfo property
     */
    private PrivilegedRole roleInfo;
    /**
     * The schedule property
     */
    private GovernanceSchedule schedule;
    /**
     * The status property
     */
    private String status;
    /**
     * The ticketNumber property
     */
    private String ticketNumber;
    /**
     * The ticketSystem property
     */
    private String ticketSystem;
    /**
     * The type property
     */
    private String type;
    /**
     * The userId property
     */
    private String userId;
    /**
     * Instantiates a new privilegedRoleAssignmentRequest and sets the default values.
     */
    public PrivilegedRoleAssignmentRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedRoleAssignmentRequest
     */
    @jakarta.annotation.Nonnull
    public static PrivilegedRoleAssignmentRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedRoleAssignmentRequest();
    }
    /**
     * Gets the assignmentState property value. The assignmentState property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAssignmentState() {
        return this.assignmentState;
    }
    /**
     * Gets the duration property value. The duration property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDuration() {
        return this.duration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignmentState", (n) -> { this.setAssignmentState(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("requestedDateTime", (n) -> { this.setRequestedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleId", (n) -> { this.setRoleId(n.getStringValue()); });
        deserializerMap.put("roleInfo", (n) -> { this.setRoleInfo(n.getObjectValue(PrivilegedRole::createFromDiscriminatorValue)); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(GovernanceSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("ticketNumber", (n) -> { this.setTicketNumber(n.getStringValue()); });
        deserializerMap.put("ticketSystem", (n) -> { this.setTicketSystem(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reason property value. The reason property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the requestedDateTime property value. The requestedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestedDateTime() {
        return this.requestedDateTime;
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
     * Gets the schedule property value. The schedule property
     * @return a governanceSchedule
     */
    @jakarta.annotation.Nullable
    public GovernanceSchedule getSchedule() {
        return this.schedule;
    }
    /**
     * Gets the status property value. The status property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the ticketNumber property value. The ticketNumber property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTicketNumber() {
        return this.ticketNumber;
    }
    /**
     * Gets the ticketSystem property value. The ticketSystem property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTicketSystem() {
        return this.ticketSystem;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
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
     * Sets the assignmentState property value. The assignmentState property
     * @param value Value to set for the assignmentState property.
     */
    public void setAssignmentState(@jakarta.annotation.Nullable final String value) {
        this.assignmentState = value;
    }
    /**
     * Sets the duration property value. The duration property
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final String value) {
        this.duration = value;
    }
    /**
     * Sets the reason property value. The reason property
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the requestedDateTime property value. The requestedDateTime property
     * @param value Value to set for the requestedDateTime property.
     */
    public void setRequestedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.requestedDateTime = value;
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
     * Sets the schedule property value. The schedule property
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final GovernanceSchedule value) {
        this.schedule = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the ticketNumber property value. The ticketNumber property
     * @param value Value to set for the ticketNumber property.
     */
    public void setTicketNumber(@jakarta.annotation.Nullable final String value) {
        this.ticketNumber = value;
    }
    /**
     * Sets the ticketSystem property value. The ticketSystem property
     * @param value Value to set for the ticketSystem property.
     */
    public void setTicketSystem(@jakarta.annotation.Nullable final String value) {
        this.ticketSystem = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
