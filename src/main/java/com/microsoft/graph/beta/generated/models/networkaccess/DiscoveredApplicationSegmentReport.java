package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DiscoveredApplicationSegmentReport implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link DiscoveredApplicationSegmentReport} and sets the default values.
     */
    public DiscoveredApplicationSegmentReport() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DiscoveredApplicationSegmentReport}
     */
    @jakarta.annotation.Nonnull
    public static DiscoveredApplicationSegmentReport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DiscoveredApplicationSegmentReport();
    }
    /**
     * Gets the accessType property value. The accessType property
     * @return a {@link AccessType}
     */
    @jakarta.annotation.Nullable
    public AccessType getAccessType() {
        return this.backingStore.get("accessType");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the deviceCount property value. The deviceCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceCount() {
        return this.backingStore.get("deviceCount");
    }
    /**
     * Gets the discoveredApplicationSegmentId property value. The discoveredApplicationSegmentId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDiscoveredApplicationSegmentId() {
        return this.backingStore.get("discoveredApplicationSegmentId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("accessType", (n) -> { this.setAccessType(n.getEnumValue(AccessType::forValue)); });
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("discoveredApplicationSegmentId", (n) -> { this.setDiscoveredApplicationSegmentId(n.getStringValue()); });
        deserializerMap.put("firstAccessDateTime", (n) -> { this.setFirstAccessDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fqdn", (n) -> { this.setFqdn(n.getStringValue()); });
        deserializerMap.put("ip", (n) -> { this.setIp(n.getStringValue()); });
        deserializerMap.put("lastAccessDateTime", (n) -> { this.setLastAccessDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("totalBytesReceived", (n) -> { this.setTotalBytesReceived(n.getLongValue()); });
        deserializerMap.put("totalBytesSent", (n) -> { this.setTotalBytesSent(n.getLongValue()); });
        deserializerMap.put("transactionCount", (n) -> { this.setTransactionCount(n.getIntegerValue()); });
        deserializerMap.put("transportProtocol", (n) -> { this.setTransportProtocol(n.getEnumValue(NetworkingProtocol::forValue)); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstAccessDateTime property value. The firstAccessDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstAccessDateTime() {
        return this.backingStore.get("firstAccessDateTime");
    }
    /**
     * Gets the fqdn property value. The fqdn property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFqdn() {
        return this.backingStore.get("fqdn");
    }
    /**
     * Gets the ip property value. The ip property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIp() {
        return this.backingStore.get("ip");
    }
    /**
     * Gets the lastAccessDateTime property value. The lastAccessDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastAccessDateTime() {
        return this.backingStore.get("lastAccessDateTime");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the port property value. The port property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.backingStore.get("port");
    }
    /**
     * Gets the totalBytesReceived property value. The totalBytesReceived property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalBytesReceived() {
        return this.backingStore.get("totalBytesReceived");
    }
    /**
     * Gets the totalBytesSent property value. The totalBytesSent property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalBytesSent() {
        return this.backingStore.get("totalBytesSent");
    }
    /**
     * Gets the transactionCount property value. The transactionCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTransactionCount() {
        return this.backingStore.get("transactionCount");
    }
    /**
     * Gets the transportProtocol property value. The transportProtocol property
     * @return a {@link NetworkingProtocol}
     */
    @jakarta.annotation.Nullable
    public NetworkingProtocol getTransportProtocol() {
        return this.backingStore.get("transportProtocol");
    }
    /**
     * Gets the userCount property value. The userCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUserCount() {
        return this.backingStore.get("userCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accessType", this.getAccessType());
        writer.writeIntegerValue("deviceCount", this.getDeviceCount());
        writer.writeStringValue("discoveredApplicationSegmentId", this.getDiscoveredApplicationSegmentId());
        writer.writeOffsetDateTimeValue("firstAccessDateTime", this.getFirstAccessDateTime());
        writer.writeStringValue("fqdn", this.getFqdn());
        writer.writeStringValue("ip", this.getIp());
        writer.writeOffsetDateTimeValue("lastAccessDateTime", this.getLastAccessDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeLongValue("totalBytesReceived", this.getTotalBytesReceived());
        writer.writeLongValue("totalBytesSent", this.getTotalBytesSent());
        writer.writeIntegerValue("transactionCount", this.getTransactionCount());
        writer.writeEnumValue("transportProtocol", this.getTransportProtocol());
        writer.writeIntegerValue("userCount", this.getUserCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessType property value. The accessType property
     * @param value Value to set for the accessType property.
     */
    public void setAccessType(@jakarta.annotation.Nullable final AccessType value) {
        this.backingStore.set("accessType", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the deviceCount property value. The deviceCount property
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deviceCount", value);
    }
    /**
     * Sets the discoveredApplicationSegmentId property value. The discoveredApplicationSegmentId property
     * @param value Value to set for the discoveredApplicationSegmentId property.
     */
    public void setDiscoveredApplicationSegmentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("discoveredApplicationSegmentId", value);
    }
    /**
     * Sets the firstAccessDateTime property value. The firstAccessDateTime property
     * @param value Value to set for the firstAccessDateTime property.
     */
    public void setFirstAccessDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstAccessDateTime", value);
    }
    /**
     * Sets the fqdn property value. The fqdn property
     * @param value Value to set for the fqdn property.
     */
    public void setFqdn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fqdn", value);
    }
    /**
     * Sets the ip property value. The ip property
     * @param value Value to set for the ip property.
     */
    public void setIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ip", value);
    }
    /**
     * Sets the lastAccessDateTime property value. The lastAccessDateTime property
     * @param value Value to set for the lastAccessDateTime property.
     */
    public void setLastAccessDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastAccessDateTime", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the port property value. The port property
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("port", value);
    }
    /**
     * Sets the totalBytesReceived property value. The totalBytesReceived property
     * @param value Value to set for the totalBytesReceived property.
     */
    public void setTotalBytesReceived(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalBytesReceived", value);
    }
    /**
     * Sets the totalBytesSent property value. The totalBytesSent property
     * @param value Value to set for the totalBytesSent property.
     */
    public void setTotalBytesSent(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalBytesSent", value);
    }
    /**
     * Sets the transactionCount property value. The transactionCount property
     * @param value Value to set for the transactionCount property.
     */
    public void setTransactionCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("transactionCount", value);
    }
    /**
     * Sets the transportProtocol property value. The transportProtocol property
     * @param value Value to set for the transportProtocol property.
     */
    public void setTransportProtocol(@jakarta.annotation.Nullable final NetworkingProtocol value) {
        this.backingStore.set("transportProtocol", value);
    }
    /**
     * Sets the userCount property value. The userCount property
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("userCount", value);
    }
}
