package com.microsoft.graph.models;

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
     * Instantiates a new ScheduledPermissionsRequest and sets the default values.
     */
    public ScheduledPermissionsRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ScheduledPermissionsRequest
     */
    @jakarta.annotation.Nonnull
    public static ScheduledPermissionsRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ScheduledPermissionsRequest();
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("justification", (n) -> { this.setJustification(n.getStringValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("requestedPermissions", (n) -> { this.setRequestedPermissions(n.getObjectValue(PermissionsDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("scheduleInfo", (n) -> { this.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("statusDetail", (n) -> { this.setStatusDetail(n.getEnumValue(StatusDetail.class)); });
        deserializerMap.put("ticketInfo", (n) -> { this.setTicketInfo(n.getObjectValue(TicketInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the justification property value. The justification property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJustification() {
        return this.BackingStore.get("justification");
    }
    /**
     * Gets the notes property value. The notes property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.BackingStore.get("notes");
    }
    /**
     * Gets the requestedPermissions property value. The requestedPermissions property
     * @return a PermissionsDefinition
     */
    @jakarta.annotation.Nullable
    public PermissionsDefinition getRequestedPermissions() {
        return this.BackingStore.get("requestedPermissions");
    }
    /**
     * Gets the scheduleInfo property value. The scheduleInfo property
     * @return a RequestSchedule
     */
    @jakarta.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this.BackingStore.get("scheduleInfo");
    }
    /**
     * Gets the statusDetail property value. The statusDetail property
     * @return a StatusDetail
     */
    @jakarta.annotation.Nullable
    public StatusDetail getStatusDetail() {
        return this.BackingStore.get("statusDetail");
    }
    /**
     * Gets the ticketInfo property value. The ticketInfo property
     * @return a TicketInfo
     */
    @jakarta.annotation.Nullable
    public TicketInfo getTicketInfo() {
        return this.BackingStore.get("ticketInfo");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("justification", this.getJustification());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeObjectValue("requestedPermissions", this.getRequestedPermissions());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
        writer.writeEnumValue("statusDetail", this.getStatusDetail());
        writer.writeObjectValue("ticketInfo", this.getTicketInfo());
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the justification property value. The justification property
     * @param value Value to set for the justification property.
     */
    public void setJustification(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("justification", value);
    }
    /**
     * Sets the notes property value. The notes property
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("notes", value);
    }
    /**
     * Sets the requestedPermissions property value. The requestedPermissions property
     * @param value Value to set for the requestedPermissions property.
     */
    public void setRequestedPermissions(@jakarta.annotation.Nullable final PermissionsDefinition value) {
        this.BackingStore.set("requestedPermissions", value);
    }
    /**
     * Sets the scheduleInfo property value. The scheduleInfo property
     * @param value Value to set for the scheduleInfo property.
     */
    public void setScheduleInfo(@jakarta.annotation.Nullable final RequestSchedule value) {
        this.BackingStore.set("scheduleInfo", value);
    }
    /**
     * Sets the statusDetail property value. The statusDetail property
     * @param value Value to set for the statusDetail property.
     */
    public void setStatusDetail(@jakarta.annotation.Nullable final StatusDetail value) {
        this.BackingStore.set("statusDetail", value);
    }
    /**
     * Sets the ticketInfo property value. The ticketInfo property
     * @param value Value to set for the ticketInfo property.
     */
    public void setTicketInfo(@jakarta.annotation.Nullable final TicketInfo value) {
        this.BackingStore.set("ticketInfo", value);
    }
}
