package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftTunnelServerLogCollectionResponse extends Entity implements Parsable {
    /** The end time of the logs collected */
    private OffsetDateTime endDateTime;
    /** The time when the log collection is expired */
    private OffsetDateTime expiryDateTime;
    /** The time when the log collection was requested */
    private OffsetDateTime requestDateTime;
    /** ID of the server the log collection is requested upon */
    private String serverId;
    /** The size of the logs in bytes */
    private Long sizeInBytes;
    /** The start time of the logs collected */
    private OffsetDateTime startDateTime;
    /** Enum type that represent the status of log collection */
    private MicrosoftTunnelLogCollectionStatus status;
    /**
     * Instantiates a new MicrosoftTunnelServerLogCollectionResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftTunnelServerLogCollectionResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftTunnelServerLogCollectionResponse
     */
    @javax.annotation.Nonnull
    public static MicrosoftTunnelServerLogCollectionResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftTunnelServerLogCollectionResponse();
    }
    /**
     * Gets the endDateTime property value. The end time of the logs collected
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * Gets the expiryDateTime property value. The time when the log collection is expired
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpiryDateTime() {
        return this.expiryDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expiryDateTime", (n) -> { this.setExpiryDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requestDateTime", (n) -> { this.setRequestDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("serverId", (n) -> { this.setServerId(n.getStringValue()); });
        deserializerMap.put("sizeInBytes", (n) -> { this.setSizeInBytes(n.getLongValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(MicrosoftTunnelLogCollectionStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the requestDateTime property value. The time when the log collection was requested
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRequestDateTime() {
        return this.requestDateTime;
    }
    /**
     * Gets the serverId property value. ID of the server the log collection is requested upon
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServerId() {
        return this.serverId;
    }
    /**
     * Gets the sizeInBytes property value. The size of the logs in bytes
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSizeInBytes() {
        return this.sizeInBytes;
    }
    /**
     * Gets the startDateTime property value. The start time of the logs collected
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the status property value. Enum type that represent the status of log collection
     * @return a microsoftTunnelLogCollectionStatus
     */
    @javax.annotation.Nullable
    public MicrosoftTunnelLogCollectionStatus getStatus() {
        return this.status;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the expiryDateTime property value. The time when the log collection is expired
     * @param value Value to set for the expiryDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpiryDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expiryDateTime = value;
    }
    /**
     * Sets the requestDateTime property value. The time when the log collection was requested
     * @param value Value to set for the requestDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.requestDateTime = value;
    }
    /**
     * Sets the serverId property value. ID of the server the log collection is requested upon
     * @param value Value to set for the serverId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServerId(@javax.annotation.Nullable final String value) {
        this.serverId = value;
    }
    /**
     * Sets the sizeInBytes property value. The size of the logs in bytes
     * @param value Value to set for the sizeInBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSizeInBytes(@javax.annotation.Nullable final Long value) {
        this.sizeInBytes = value;
    }
    /**
     * Sets the startDateTime property value. The start time of the logs collected
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the status property value. Enum type that represent the status of log collection
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final MicrosoftTunnelLogCollectionStatus value) {
        this.status = value;
    }
}
