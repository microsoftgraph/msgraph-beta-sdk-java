package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RemoteNetworkHealthEvent extends Entity implements Parsable {
    /**
     * Instantiates a new RemoteNetworkHealthEvent and sets the default values.
     */
    public RemoteNetworkHealthEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RemoteNetworkHealthEvent
     */
    @jakarta.annotation.Nonnull
    public static RemoteNetworkHealthEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RemoteNetworkHealthEvent();
    }
    /**
     * Gets the bgpRoutesAdvertisedCount property value. The number of BGP routes advertised through tunnel.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBgpRoutesAdvertisedCount() {
        return this.backingStore.get("bgpRoutesAdvertisedCount");
    }
    /**
     * Gets the createdDateTime property value. The time of the original event generation in UTC. Supports $filter (ge, le) and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The description of the event.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the destinationIp property value. The IP address of the destination.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestinationIp() {
        return this.backingStore.get("destinationIp");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bgpRoutesAdvertisedCount", (n) -> { this.setBgpRoutesAdvertisedCount(n.getIntegerValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("destinationIp", (n) -> { this.setDestinationIp(n.getStringValue()); });
        deserializerMap.put("receivedBytes", (n) -> { this.setReceivedBytes(n.getLongValue()); });
        deserializerMap.put("remoteNetworkId", (n) -> { this.setRemoteNetworkId(n.getStringValue()); });
        deserializerMap.put("sentBytes", (n) -> { this.setSentBytes(n.getLongValue()); });
        deserializerMap.put("sourceIp", (n) -> { this.setSourceIp(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(RemoteNetworkStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the receivedBytes property value. The number of bytes sent from the destination to the source.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getReceivedBytes() {
        return this.backingStore.get("receivedBytes");
    }
    /**
     * Gets the remoteNetworkId property value. A unique identifier for each remoteNetwork site. Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRemoteNetworkId() {
        return this.backingStore.get("remoteNetworkId");
    }
    /**
     * Gets the sentBytes property value. The number of bytes sent from the source to the destination for the connection or session.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSentBytes() {
        return this.backingStore.get("sentBytes");
    }
    /**
     * Gets the sourceIp property value. The public IP address.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceIp() {
        return this.backingStore.get("sourceIp");
    }
    /**
     * Gets the status property value. The status property
     * @return a RemoteNetworkStatus
     */
    @jakarta.annotation.Nullable
    public RemoteNetworkStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("bgpRoutesAdvertisedCount", this.getBgpRoutesAdvertisedCount());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("destinationIp", this.getDestinationIp());
        writer.writeLongValue("receivedBytes", this.getReceivedBytes());
        writer.writeStringValue("remoteNetworkId", this.getRemoteNetworkId());
        writer.writeLongValue("sentBytes", this.getSentBytes());
        writer.writeStringValue("sourceIp", this.getSourceIp());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the bgpRoutesAdvertisedCount property value. The number of BGP routes advertised through tunnel.
     * @param value Value to set for the bgpRoutesAdvertisedCount property.
     */
    public void setBgpRoutesAdvertisedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("bgpRoutesAdvertisedCount", value);
    }
    /**
     * Sets the createdDateTime property value. The time of the original event generation in UTC. Supports $filter (ge, le) and $orderby.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description of the event.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the destinationIp property value. The IP address of the destination.
     * @param value Value to set for the destinationIp property.
     */
    public void setDestinationIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationIp", value);
    }
    /**
     * Sets the receivedBytes property value. The number of bytes sent from the destination to the source.
     * @param value Value to set for the receivedBytes property.
     */
    public void setReceivedBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("receivedBytes", value);
    }
    /**
     * Sets the remoteNetworkId property value. A unique identifier for each remoteNetwork site. Supports $filter (eq).
     * @param value Value to set for the remoteNetworkId property.
     */
    public void setRemoteNetworkId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remoteNetworkId", value);
    }
    /**
     * Sets the sentBytes property value. The number of bytes sent from the source to the destination for the connection or session.
     * @param value Value to set for the sentBytes property.
     */
    public void setSentBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sentBytes", value);
    }
    /**
     * Sets the sourceIp property value. The public IP address.
     * @param value Value to set for the sourceIp property.
     */
    public void setSourceIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceIp", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final RemoteNetworkStatus value) {
        this.backingStore.set("status", value);
    }
}
