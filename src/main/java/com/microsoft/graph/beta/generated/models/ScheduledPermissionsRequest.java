package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ScheduledPermissionsRequest extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ScheduledPermissionsRequest} and sets the default values.
     */
    public ScheduledPermissionsRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ScheduledPermissionsRequest}
     */
    @jakarta.annotation.Nonnull
    public static ScheduledPermissionsRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScheduledPermissionsRequest();
    }
    /**
     * Gets the action property value. The action property
     * @return a {@link UnifiedRoleScheduleRequestActions}
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleScheduleRequestActions getAction() {
        return this.backingStore.get("action");
    }
    /**
     * Gets the createdDateTime property value. Defines when the identity created the request.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(UnifiedRoleScheduleRequestActions::forValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("requestedPermissions", (n) -> { this.setRequestedPermissions(n.getObjectValue(PermissionsDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("scheduleInfo", (n) -> { this.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("statusDetail", (n) -> { this.setStatusDetail(n.getEnumValue(StatusDetail::forValue)); });
        deserializerMap.put("ticketInfo", (n) -> { this.setTicketInfo(n.getObjectValue(TicketInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the justification property value. The identity&apos;s justification for the request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.backingStore.get("justification");
    }
    /**
     * Gets the notes property value. Additional context for the permissions request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Gets the requestedPermissions property value. The requestedPermissions property
     * @return a {@link PermissionsDefinition}
     */
    @jakarta.annotation.Nullable
    public PermissionsDefinition getRequestedPermissions() {
        return this.backingStore.get("requestedPermissions");
    }
    /**
     * Gets the scheduleInfo property value. When to assign the requested permissions.
     * @return a {@link RequestSchedule}
     */
    @jakarta.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this.backingStore.get("scheduleInfo");
    }
    /**
     * Gets the statusDetail property value. The statusDetail property
     * @return a {@link StatusDetail}
     */
    @jakarta.annotation.Nullable
    public StatusDetail getStatusDetail() {
        return this.backingStore.get("statusDetail");
    }
    /**
     * Gets the ticketInfo property value. Ticketing-related metadata that you can use to correlate to the request.
     * @return a {@link TicketInfo}
     */
    @jakarta.annotation.Nullable
    public TicketInfo getTicketInfo() {
        return this.backingStore.get("ticketInfo");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeObjectValue("requestedPermissions", this.getRequestedPermissions());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
        writer.writeEnumValue("statusDetail", this.getStatusDetail());
        writer.writeObjectValue("ticketInfo", this.getTicketInfo());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final UnifiedRoleScheduleRequestActions value) {
        this.backingStore.set("action", value);
    }
    /**
     * Sets the createdDateTime property value. Defines when the identity created the request.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the justification property value. The identity&apos;s justification for the request.
     * @param value Value to set for the justification property.
     */
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("justification", value);
    }
    /**
     * Sets the notes property value. Additional context for the permissions request.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notes", value);
    }
    /**
     * Sets the requestedPermissions property value. The requestedPermissions property
     * @param value Value to set for the requestedPermissions property.
     */
    public void setRequestedPermissions(@jakarta.annotation.Nullable final PermissionsDefinition value) {
        this.backingStore.set("requestedPermissions", value);
    }
    /**
     * Sets the scheduleInfo property value. When to assign the requested permissions.
     * @param value Value to set for the scheduleInfo property.
     */
    public void setScheduleInfo(@jakarta.annotation.Nullable final RequestSchedule value) {
        this.backingStore.set("scheduleInfo", value);
    }
    /**
     * Sets the statusDetail property value. The statusDetail property
     * @param value Value to set for the statusDetail property.
     */
    public void setStatusDetail(@jakarta.annotation.Nullable final StatusDetail value) {
        this.backingStore.set("statusDetail", value);
    }
    /**
     * Sets the ticketInfo property value. Ticketing-related metadata that you can use to correlate to the request.
     * @param value Value to set for the ticketInfo property.
     */
    public void setTicketInfo(@jakarta.annotation.Nullable final TicketInfo value) {
        this.backingStore.set("ticketInfo", value);
    }
}
