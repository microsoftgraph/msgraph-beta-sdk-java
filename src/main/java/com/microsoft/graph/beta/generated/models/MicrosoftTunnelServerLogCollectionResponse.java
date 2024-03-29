package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that stores the server log collection status.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftTunnelServerLogCollectionResponse extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MicrosoftTunnelServerLogCollectionResponse} and sets the default values.
     */
    public MicrosoftTunnelServerLogCollectionResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MicrosoftTunnelServerLogCollectionResponse}
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftTunnelServerLogCollectionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftTunnelServerLogCollectionResponse();
    }
    /**
     * Gets the endDateTime property value. The end time of the logs collected
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * Gets the expiryDateTime property value. The time when the log collection is expired
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiryDateTime() {
        return this.backingStore.get("expiryDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expiryDateTime", (n) -> { this.setExpiryDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requestDateTime", (n) -> { this.setRequestDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("serverId", (n) -> { this.setServerId(n.getStringValue()); });
        deserializerMap.put("sizeInBytes", (n) -> { this.setSizeInBytes(n.getLongValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(MicrosoftTunnelLogCollectionStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the requestDateTime property value. The time when the log collection was requested
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRequestDateTime() {
        return this.backingStore.get("requestDateTime");
    }
    /**
     * Gets the serverId property value. ID of the server the log collection is requested upon
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServerId() {
        return this.backingStore.get("serverId");
    }
    /**
     * Gets the sizeInBytes property value. The size of the logs in bytes
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSizeInBytes() {
        return this.backingStore.get("sizeInBytes");
    }
    /**
     * Gets the startDateTime property value. The start time of the logs collected
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the status property value. Enum type that represent the status of log collection
     * @return a {@link MicrosoftTunnelLogCollectionStatus}
     */
    @jakarta.annotation.Nullable
    public MicrosoftTunnelLogCollectionStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeOffsetDateTimeValue("expiryDateTime", this.getExpiryDateTime());
        writer.writeOffsetDateTimeValue("requestDateTime", this.getRequestDateTime());
        writer.writeStringValue("serverId", this.getServerId());
        writer.writeLongValue("sizeInBytes", this.getSizeInBytes());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the endDateTime property value. The end time of the logs collected
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the expiryDateTime property value. The time when the log collection is expired
     * @param value Value to set for the expiryDateTime property.
     */
    public void setExpiryDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expiryDateTime", value);
    }
    /**
     * Sets the requestDateTime property value. The time when the log collection was requested
     * @param value Value to set for the requestDateTime property.
     */
    public void setRequestDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("requestDateTime", value);
    }
    /**
     * Sets the serverId property value. ID of the server the log collection is requested upon
     * @param value Value to set for the serverId property.
     */
    public void setServerId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serverId", value);
    }
    /**
     * Sets the sizeInBytes property value. The size of the logs in bytes
     * @param value Value to set for the sizeInBytes property.
     */
    public void setSizeInBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sizeInBytes", value);
    }
    /**
     * Sets the startDateTime property value. The start time of the logs collected
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the status property value. Enum type that represent the status of log collection
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final MicrosoftTunnelLogCollectionStatus value) {
        this.backingStore.set("status", value);
    }
}
