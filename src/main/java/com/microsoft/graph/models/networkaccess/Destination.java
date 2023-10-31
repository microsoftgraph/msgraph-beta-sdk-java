package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Destination implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The deviceCount property
     */
    private Integer deviceCount;
    /**
     * The fqdn property
     */
    private String fqdn;
    /**
     * The ip property
     */
    private String ip;
    /**
     * The lastAccessDateTime property
     */
    private OffsetDateTime lastAccessDateTime;
    /**
     * The networkingProtocol property
     */
    private NetworkingProtocol networkingProtocol;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The port property
     */
    private Integer port;
    /**
     * The trafficType property
     */
    private TrafficType trafficType;
    /**
     * The transactionCount property
     */
    private Integer transactionCount;
    /**
     * The userCount property
     */
    private Integer userCount;
    /**
     * Instantiates a new Destination and sets the default values.
     */
    public Destination() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Destination
     */
    @jakarta.annotation.Nonnull
    public static Destination createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Destination();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the deviceCount property value. The deviceCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceCount() {
        return this.deviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("fqdn", (n) -> { this.setFqdn(n.getStringValue()); });
        deserializerMap.put("ip", (n) -> { this.setIp(n.getStringValue()); });
        deserializerMap.put("lastAccessDateTime", (n) -> { this.setLastAccessDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("networkingProtocol", (n) -> { this.setNetworkingProtocol(n.getEnumValue(NetworkingProtocol.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("trafficType", (n) -> { this.setTrafficType(n.getEnumValue(TrafficType.class)); });
        deserializerMap.put("transactionCount", (n) -> { this.setTransactionCount(n.getIntegerValue()); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fqdn property value. The fqdn property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFqdn() {
        return this.fqdn;
    }
    /**
     * Gets the ip property value. The ip property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIp() {
        return this.ip;
    }
    /**
     * Gets the lastAccessDateTime property value. The lastAccessDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastAccessDateTime() {
        return this.lastAccessDateTime;
    }
    /**
     * Gets the networkingProtocol property value. The networkingProtocol property
     * @return a NetworkingProtocol
     */
    @jakarta.annotation.Nullable
    public NetworkingProtocol getNetworkingProtocol() {
        return this.networkingProtocol;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the port property value. The port property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.port;
    }
    /**
     * Gets the trafficType property value. The trafficType property
     * @return a TrafficType
     */
    @jakarta.annotation.Nullable
    public TrafficType getTrafficType() {
        return this.trafficType;
    }
    /**
     * Gets the transactionCount property value. The transactionCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTransactionCount() {
        return this.transactionCount;
    }
    /**
     * Gets the userCount property value. The userCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUserCount() {
        return this.userCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("deviceCount", this.getDeviceCount());
        writer.writeStringValue("fqdn", this.getFqdn());
        writer.writeStringValue("ip", this.getIp());
        writer.writeOffsetDateTimeValue("lastAccessDateTime", this.getLastAccessDateTime());
        writer.writeEnumValue("networkingProtocol", this.getNetworkingProtocol());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeEnumValue("trafficType", this.getTrafficType());
        writer.writeIntegerValue("transactionCount", this.getTransactionCount());
        writer.writeIntegerValue("userCount", this.getUserCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceCount property value. The deviceCount property
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.deviceCount = value;
    }
    /**
     * Sets the fqdn property value. The fqdn property
     * @param value Value to set for the fqdn property.
     */
    public void setFqdn(@jakarta.annotation.Nullable final String value) {
        this.fqdn = value;
    }
    /**
     * Sets the ip property value. The ip property
     * @param value Value to set for the ip property.
     */
    public void setIp(@jakarta.annotation.Nullable final String value) {
        this.ip = value;
    }
    /**
     * Sets the lastAccessDateTime property value. The lastAccessDateTime property
     * @param value Value to set for the lastAccessDateTime property.
     */
    public void setLastAccessDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastAccessDateTime = value;
    }
    /**
     * Sets the networkingProtocol property value. The networkingProtocol property
     * @param value Value to set for the networkingProtocol property.
     */
    public void setNetworkingProtocol(@jakarta.annotation.Nullable final NetworkingProtocol value) {
        this.networkingProtocol = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the port property value. The port property
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.port = value;
    }
    /**
     * Sets the trafficType property value. The trafficType property
     * @param value Value to set for the trafficType property.
     */
    public void setTrafficType(@jakarta.annotation.Nullable final TrafficType value) {
        this.trafficType = value;
    }
    /**
     * Sets the transactionCount property value. The transactionCount property
     * @param value Value to set for the transactionCount property.
     */
    public void setTransactionCount(@jakarta.annotation.Nullable final Integer value) {
        this.transactionCount = value;
    }
    /**
     * Sets the userCount property value. The userCount property
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.userCount = value;
    }
}
