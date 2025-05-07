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
public class Connection extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Connection} and sets the default values.
     */
    public Connection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Connection}
     */
    @jakarta.annotation.Nonnull
    public static Connection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Connection();
    }
    /**
     * Gets the agentVersion property value. The agentVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentVersion() {
        return this.backingStore.get("agentVersion");
    }
    /**
     * Gets the applicationSnapshot property value. The applicationSnapshot property
     * @return a {@link ApplicationSnapshot}
     */
    @jakarta.annotation.Nullable
    public ApplicationSnapshot getApplicationSnapshot() {
        return this.backingStore.get("applicationSnapshot");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the destinationFqdn property value. The destinationFqdn property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationFqdn() {
        return this.backingStore.get("destinationFqdn");
    }
    /**
     * Gets the destinationIp property value. The destinationIp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationIp() {
        return this.backingStore.get("destinationIp");
    }
    /**
     * Gets the destinationPort property value. The destinationPort property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDestinationPort() {
        return this.backingStore.get("destinationPort");
    }
    /**
     * Gets the deviceCategory property value. The deviceCategory property
     * @return a {@link DeviceCategory}
     */
    @jakarta.annotation.Nullable
    public DeviceCategory getDeviceCategory() {
        return this.backingStore.get("deviceCategory");
    }
    /**
     * Gets the deviceId property value. The deviceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the deviceOperatingSystem property value. The deviceOperatingSystem property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceOperatingSystem() {
        return this.backingStore.get("deviceOperatingSystem");
    }
    /**
     * Gets the deviceOperatingSystemVersion property value. The deviceOperatingSystemVersion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceOperatingSystemVersion() {
        return this.backingStore.get("deviceOperatingSystemVersion");
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
        deserializerMap.put("agentVersion", (n) -> { this.setAgentVersion(n.getStringValue()); });
        deserializerMap.put("applicationSnapshot", (n) -> { this.setApplicationSnapshot(n.getObjectValue(ApplicationSnapshot::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("destinationFqdn", (n) -> { this.setDestinationFqdn(n.getStringValue()); });
        deserializerMap.put("destinationIp", (n) -> { this.setDestinationIp(n.getStringValue()); });
        deserializerMap.put("destinationPort", (n) -> { this.setDestinationPort(n.getIntegerValue()); });
        deserializerMap.put("deviceCategory", (n) -> { this.setDeviceCategory(n.getEnumValue(DeviceCategory::forValue)); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceOperatingSystem", (n) -> { this.setDeviceOperatingSystem(n.getStringValue()); });
        deserializerMap.put("deviceOperatingSystemVersion", (n) -> { this.setDeviceOperatingSystemVersion(n.getStringValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("initiatingProcessName", (n) -> { this.setInitiatingProcessName(n.getStringValue()); });
        deserializerMap.put("lastUpdateDateTime", (n) -> { this.setLastUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("networkProtocol", (n) -> { this.setNetworkProtocol(n.getEnumValue(NetworkingProtocol::forValue)); });
        deserializerMap.put("popProcessingRegion", (n) -> { this.setPopProcessingRegion(n.getStringValue()); });
        deserializerMap.put("privateAccessDetails", (n) -> { this.setPrivateAccessDetails(n.getObjectValue(PrivateAccessDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("receivedBytes", (n) -> { this.setReceivedBytes(n.getLongValue()); });
        deserializerMap.put("sentBytes", (n) -> { this.setSentBytes(n.getLongValue()); });
        deserializerMap.put("sourceIp", (n) -> { this.setSourceIp(n.getStringValue()); });
        deserializerMap.put("sourcePort", (n) -> { this.setSourcePort(n.getIntegerValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ConnectionStatus::forValue)); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("trafficType", (n) -> { this.setTrafficType(n.getEnumValue(TrafficType::forValue)); });
        deserializerMap.put("transactionBlockCount", (n) -> { this.setTransactionBlockCount(n.getIntegerValue()); });
        deserializerMap.put("transactionCount", (n) -> { this.setTransactionCount(n.getIntegerValue()); });
        deserializerMap.put("transportProtocol", (n) -> { this.setTransportProtocol(n.getEnumValue(NetworkingProtocol::forValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiatingProcessName property value. The initiatingProcessName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInitiatingProcessName() {
        return this.backingStore.get("initiatingProcessName");
    }
    /**
     * Gets the lastUpdateDateTime property value. The lastUpdateDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this.backingStore.get("lastUpdateDateTime");
    }
    /**
     * Gets the networkProtocol property value. The networkProtocol property
     * @return a {@link NetworkingProtocol}
     */
    @jakarta.annotation.Nullable
    public NetworkingProtocol getNetworkProtocol() {
        return this.backingStore.get("networkProtocol");
    }
    /**
     * Gets the popProcessingRegion property value. The popProcessingRegion property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPopProcessingRegion() {
        return this.backingStore.get("popProcessingRegion");
    }
    /**
     * Gets the privateAccessDetails property value. The privateAccessDetails property
     * @return a {@link PrivateAccessDetails}
     */
    @jakarta.annotation.Nullable
    public PrivateAccessDetails getPrivateAccessDetails() {
        return this.backingStore.get("privateAccessDetails");
    }
    /**
     * Gets the receivedBytes property value. The receivedBytes property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getReceivedBytes() {
        return this.backingStore.get("receivedBytes");
    }
    /**
     * Gets the sentBytes property value. The sentBytes property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSentBytes() {
        return this.backingStore.get("sentBytes");
    }
    /**
     * Gets the sourceIp property value. The sourceIp property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceIp() {
        return this.backingStore.get("sourceIp");
    }
    /**
     * Gets the sourcePort property value. The sourcePort property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSourcePort() {
        return this.backingStore.get("sourcePort");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link ConnectionStatus}
     */
    @jakarta.annotation.Nullable
    public ConnectionStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the trafficType property value. The trafficType property
     * @return a {@link TrafficType}
     */
    @jakarta.annotation.Nullable
    public TrafficType getTrafficType() {
        return this.backingStore.get("trafficType");
    }
    /**
     * Gets the transactionBlockCount property value. The transactionBlockCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTransactionBlockCount() {
        return this.backingStore.get("transactionBlockCount");
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
     * Gets the userId property value. The userId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("agentVersion", this.getAgentVersion());
        writer.writeObjectValue("applicationSnapshot", this.getApplicationSnapshot());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("destinationFqdn", this.getDestinationFqdn());
        writer.writeStringValue("destinationIp", this.getDestinationIp());
        writer.writeIntegerValue("destinationPort", this.getDestinationPort());
        writer.writeEnumValue("deviceCategory", this.getDeviceCategory());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceOperatingSystem", this.getDeviceOperatingSystem());
        writer.writeStringValue("deviceOperatingSystemVersion", this.getDeviceOperatingSystemVersion());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("initiatingProcessName", this.getInitiatingProcessName());
        writer.writeOffsetDateTimeValue("lastUpdateDateTime", this.getLastUpdateDateTime());
        writer.writeEnumValue("networkProtocol", this.getNetworkProtocol());
        writer.writeStringValue("popProcessingRegion", this.getPopProcessingRegion());
        writer.writeObjectValue("privateAccessDetails", this.getPrivateAccessDetails());
        writer.writeLongValue("receivedBytes", this.getReceivedBytes());
        writer.writeLongValue("sentBytes", this.getSentBytes());
        writer.writeStringValue("sourceIp", this.getSourceIp());
        writer.writeIntegerValue("sourcePort", this.getSourcePort());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeEnumValue("trafficType", this.getTrafficType());
        writer.writeIntegerValue("transactionBlockCount", this.getTransactionBlockCount());
        writer.writeIntegerValue("transactionCount", this.getTransactionCount());
        writer.writeEnumValue("transportProtocol", this.getTransportProtocol());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the agentVersion property value. The agentVersion property
     * @param value Value to set for the agentVersion property.
     */
    public void setAgentVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentVersion", value);
    }
    /**
     * Sets the applicationSnapshot property value. The applicationSnapshot property
     * @param value Value to set for the applicationSnapshot property.
     */
    public void setApplicationSnapshot(@jakarta.annotation.Nullable final ApplicationSnapshot value) {
        this.backingStore.set("applicationSnapshot", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the destinationFqdn property value. The destinationFqdn property
     * @param value Value to set for the destinationFqdn property.
     */
    public void setDestinationFqdn(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationFqdn", value);
    }
    /**
     * Sets the destinationIp property value. The destinationIp property
     * @param value Value to set for the destinationIp property.
     */
    public void setDestinationIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationIp", value);
    }
    /**
     * Sets the destinationPort property value. The destinationPort property
     * @param value Value to set for the destinationPort property.
     */
    public void setDestinationPort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("destinationPort", value);
    }
    /**
     * Sets the deviceCategory property value. The deviceCategory property
     * @param value Value to set for the deviceCategory property.
     */
    public void setDeviceCategory(@jakarta.annotation.Nullable final DeviceCategory value) {
        this.backingStore.set("deviceCategory", value);
    }
    /**
     * Sets the deviceId property value. The deviceId property
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceOperatingSystem property value. The deviceOperatingSystem property
     * @param value Value to set for the deviceOperatingSystem property.
     */
    public void setDeviceOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceOperatingSystem", value);
    }
    /**
     * Sets the deviceOperatingSystemVersion property value. The deviceOperatingSystemVersion property
     * @param value Value to set for the deviceOperatingSystemVersion property.
     */
    public void setDeviceOperatingSystemVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceOperatingSystemVersion", value);
    }
    /**
     * Sets the endDateTime property value. The endDateTime property
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the initiatingProcessName property value. The initiatingProcessName property
     * @param value Value to set for the initiatingProcessName property.
     */
    public void setInitiatingProcessName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("initiatingProcessName", value);
    }
    /**
     * Sets the lastUpdateDateTime property value. The lastUpdateDateTime property
     * @param value Value to set for the lastUpdateDateTime property.
     */
    public void setLastUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdateDateTime", value);
    }
    /**
     * Sets the networkProtocol property value. The networkProtocol property
     * @param value Value to set for the networkProtocol property.
     */
    public void setNetworkProtocol(@jakarta.annotation.Nullable final NetworkingProtocol value) {
        this.backingStore.set("networkProtocol", value);
    }
    /**
     * Sets the popProcessingRegion property value. The popProcessingRegion property
     * @param value Value to set for the popProcessingRegion property.
     */
    public void setPopProcessingRegion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("popProcessingRegion", value);
    }
    /**
     * Sets the privateAccessDetails property value. The privateAccessDetails property
     * @param value Value to set for the privateAccessDetails property.
     */
    public void setPrivateAccessDetails(@jakarta.annotation.Nullable final PrivateAccessDetails value) {
        this.backingStore.set("privateAccessDetails", value);
    }
    /**
     * Sets the receivedBytes property value. The receivedBytes property
     * @param value Value to set for the receivedBytes property.
     */
    public void setReceivedBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("receivedBytes", value);
    }
    /**
     * Sets the sentBytes property value. The sentBytes property
     * @param value Value to set for the sentBytes property.
     */
    public void setSentBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sentBytes", value);
    }
    /**
     * Sets the sourceIp property value. The sourceIp property
     * @param value Value to set for the sourceIp property.
     */
    public void setSourceIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceIp", value);
    }
    /**
     * Sets the sourcePort property value. The sourcePort property
     * @param value Value to set for the sourcePort property.
     */
    public void setSourcePort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("sourcePort", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ConnectionStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the trafficType property value. The trafficType property
     * @param value Value to set for the trafficType property.
     */
    public void setTrafficType(@jakarta.annotation.Nullable final TrafficType value) {
        this.backingStore.set("trafficType", value);
    }
    /**
     * Sets the transactionBlockCount property value. The transactionBlockCount property
     * @param value Value to set for the transactionBlockCount property.
     */
    public void setTransactionBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("transactionBlockCount", value);
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
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName property
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
