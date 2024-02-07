package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermissionsRequestChange extends Entity implements Parsable {
    /**
     * Instantiates a new PermissionsRequestChange and sets the default values.
     */
    public PermissionsRequestChange() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PermissionsRequestChange
     */
    @jakarta.annotation.Nonnull
    public static PermissionsRequestChange createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PermissionsRequestChange();
    }
    /**
     * Gets the activeOccurrenceStatus property value. The status of the active occurence of the schedule if one exists. The possible values are: grantingFailed, granted, granting, revoked, revoking, revokingFailed, unknownFutureValue.
     * @return a PermissionsRequestOccurrenceStatus
     */
    @jakarta.annotation.Nullable
    public PermissionsRequestOccurrenceStatus getActiveOccurrenceStatus() {
        return this.backingStore.get("activeOccurrenceStatus");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeOccurrenceStatus", (n) -> { this.setActiveOccurrenceStatus(n.getEnumValue(PermissionsRequestOccurrenceStatus::forValue)); });
        deserializerMap.put("modificationDateTime", (n) -> { this.setModificationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("permissionsRequestId", (n) -> { this.setPermissionsRequestId(n.getStringValue()); });
        deserializerMap.put("statusDetail", (n) -> { this.setStatusDetail(n.getEnumValue(StatusDetail::forValue)); });
        deserializerMap.put("ticketId", (n) -> { this.setTicketId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the modificationDateTime property value. Time when the change occurred.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModificationDateTime() {
        return this.backingStore.get("modificationDateTime");
    }
    /**
     * Gets the permissionsRequestId property value. The ID of the scheduledPermissionsRequest object.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPermissionsRequestId() {
        return this.backingStore.get("permissionsRequestId");
    }
    /**
     * Gets the statusDetail property value. The statusDetail property
     * @return a StatusDetail
     */
    @jakarta.annotation.Nullable
    public StatusDetail getStatusDetail() {
        return this.backingStore.get("statusDetail");
    }
    /**
     * Gets the ticketId property value. Represents the ticketing system identifier.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTicketId() {
        return this.backingStore.get("ticketId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("activeOccurrenceStatus", this.getActiveOccurrenceStatus());
        writer.writeOffsetDateTimeValue("modificationDateTime", this.getModificationDateTime());
        writer.writeStringValue("permissionsRequestId", this.getPermissionsRequestId());
        writer.writeEnumValue("statusDetail", this.getStatusDetail());
        writer.writeStringValue("ticketId", this.getTicketId());
    }
    /**
     * Sets the activeOccurrenceStatus property value. The status of the active occurence of the schedule if one exists. The possible values are: grantingFailed, granted, granting, revoked, revoking, revokingFailed, unknownFutureValue.
     * @param value Value to set for the activeOccurrenceStatus property.
     */
    public void setActiveOccurrenceStatus(@jakarta.annotation.Nullable final PermissionsRequestOccurrenceStatus value) {
        this.backingStore.set("activeOccurrenceStatus", value);
    }
    /**
     * Sets the modificationDateTime property value. Time when the change occurred.
     * @param value Value to set for the modificationDateTime property.
     */
    public void setModificationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("modificationDateTime", value);
    }
    /**
     * Sets the permissionsRequestId property value. The ID of the scheduledPermissionsRequest object.
     * @param value Value to set for the permissionsRequestId property.
     */
    public void setPermissionsRequestId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("permissionsRequestId", value);
    }
    /**
     * Sets the statusDetail property value. The statusDetail property
     * @param value Value to set for the statusDetail property.
     */
    public void setStatusDetail(@jakarta.annotation.Nullable final StatusDetail value) {
        this.backingStore.set("statusDetail", value);
    }
    /**
     * Sets the ticketId property value. Represents the ticketing system identifier.
     * @param value Value to set for the ticketId property.
     */
    public void setTicketId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ticketId", value);
    }
}
