package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NetworkAccessTraffic implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The agentVersion property
     */
    private String agentVersion;
    /**
     * The connectionId property
     */
    private String connectionId;
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The destinationFQDN property
     */
    private String destinationFQDN;
    /**
     * The destinationIp property
     */
    private String destinationIp;
    /**
     * The destinationPort property
     */
    private Integer destinationPort;
    /**
     * The deviceCategory property
     */
    private DeviceCategory deviceCategory;
    /**
     * The deviceId property
     */
    private String deviceId;
    /**
     * The deviceOperatingSystem property
     */
    private String deviceOperatingSystem;
    /**
     * The deviceOperatingSystemVersion property
     */
    private String deviceOperatingSystemVersion;
    /**
     * The headers property
     */
    private Headers headers;
    /**
     * The networkProtocol property
     */
    private NetworkingProtocol networkProtocol;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The policyId property
     */
    private String policyId;
    /**
     * The policyRuleId property
     */
    private String policyRuleId;
    /**
     * The receivedBytes property
     */
    private Long receivedBytes;
    /**
     * The sentBytes property
     */
    private Long sentBytes;
    /**
     * The sessionId property
     */
    private String sessionId;
    /**
     * The sourceIp property
     */
    private String sourceIp;
    /**
     * The sourcePort property
     */
    private Integer sourcePort;
    /**
     * The tenantId property
     */
    private String tenantId;
    /**
     * The trafficType property
     */
    private TrafficType trafficType;
    /**
     * The transactionId property
     */
    private String transactionId;
    /**
     * The transportProtocol property
     */
    private NetworkingProtocol transportProtocol;
    /**
     * The userId property
     */
    private String userId;
    /**
     * The userPrincipalName property
     */
    private String userPrincipalName;
    /**
     * Instantiates a new NetworkAccessTraffic and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public NetworkAccessTraffic() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NetworkAccessTraffic
     */
    @javax.annotation.Nonnull
    public static NetworkAccessTraffic createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkAccessTraffic();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the agentVersion property value. The agentVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAgentVersion() {
        return this.agentVersion;
    }
    /**
     * Gets the connectionId property value. The connectionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectionId() {
        return this.connectionId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the destinationFQDN property value. The destinationFQDN property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationFQDN() {
        return this.destinationFQDN;
    }
    /**
     * Gets the destinationIp property value. The destinationIp property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationIp() {
        return this.destinationIp;
    }
    /**
     * Gets the destinationPort property value. The destinationPort property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDestinationPort() {
        return this.destinationPort;
    }
    /**
     * Gets the deviceCategory property value. The deviceCategory property
     * @return a deviceCategory
     */
    @javax.annotation.Nullable
    public DeviceCategory getDeviceCategory() {
        return this.deviceCategory;
    }
    /**
     * Gets the deviceId property value. The deviceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceOperatingSystem property value. The deviceOperatingSystem property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceOperatingSystem() {
        return this.deviceOperatingSystem;
    }
    /**
     * Gets the deviceOperatingSystemVersion property value. The deviceOperatingSystemVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceOperatingSystemVersion() {
        return this.deviceOperatingSystemVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(26);
        deserializerMap.put("agentVersion", (n) -> { this.setAgentVersion(n.getStringValue()); });
        deserializerMap.put("connectionId", (n) -> { this.setConnectionId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("destinationFQDN", (n) -> { this.setDestinationFQDN(n.getStringValue()); });
        deserializerMap.put("destinationIp", (n) -> { this.setDestinationIp(n.getStringValue()); });
        deserializerMap.put("destinationPort", (n) -> { this.setDestinationPort(n.getIntegerValue()); });
        deserializerMap.put("deviceCategory", (n) -> { this.setDeviceCategory(n.getEnumValue(DeviceCategory.class)); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceOperatingSystem", (n) -> { this.setDeviceOperatingSystem(n.getStringValue()); });
        deserializerMap.put("deviceOperatingSystemVersion", (n) -> { this.setDeviceOperatingSystemVersion(n.getStringValue()); });
        deserializerMap.put("headers", (n) -> { this.setHeaders(n.getObjectValue(Headers::createFromDiscriminatorValue)); });
        deserializerMap.put("networkProtocol", (n) -> { this.setNetworkProtocol(n.getEnumValue(NetworkingProtocol.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("policyRuleId", (n) -> { this.setPolicyRuleId(n.getStringValue()); });
        deserializerMap.put("receivedBytes", (n) -> { this.setReceivedBytes(n.getLongValue()); });
        deserializerMap.put("sentBytes", (n) -> { this.setSentBytes(n.getLongValue()); });
        deserializerMap.put("sessionId", (n) -> { this.setSessionId(n.getStringValue()); });
        deserializerMap.put("sourceIp", (n) -> { this.setSourceIp(n.getStringValue()); });
        deserializerMap.put("sourcePort", (n) -> { this.setSourcePort(n.getIntegerValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("trafficType", (n) -> { this.setTrafficType(n.getEnumValue(TrafficType.class)); });
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getStringValue()); });
        deserializerMap.put("transportProtocol", (n) -> { this.setTransportProtocol(n.getEnumValue(NetworkingProtocol.class)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the headers property value. The headers property
     * @return a headers
     */
    @javax.annotation.Nullable
    public Headers getHeaders() {
        return this.headers;
    }
    /**
     * Gets the networkProtocol property value. The networkProtocol property
     * @return a networkingProtocol
     */
    @javax.annotation.Nullable
    public NetworkingProtocol getNetworkProtocol() {
        return this.networkProtocol;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the policyId property value. The policyId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * Gets the policyRuleId property value. The policyRuleId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyRuleId() {
        return this.policyRuleId;
    }
    /**
     * Gets the receivedBytes property value. The receivedBytes property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getReceivedBytes() {
        return this.receivedBytes;
    }
    /**
     * Gets the sentBytes property value. The sentBytes property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getSentBytes() {
        return this.sentBytes;
    }
    /**
     * Gets the sessionId property value. The sessionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSessionId() {
        return this.sessionId;
    }
    /**
     * Gets the sourceIp property value. The sourceIp property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceIp() {
        return this.sourceIp;
    }
    /**
     * Gets the sourcePort property value. The sourcePort property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSourcePort() {
        return this.sourcePort;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the trafficType property value. The trafficType property
     * @return a TrafficType
     */
    @javax.annotation.Nullable
    public TrafficType getTrafficType() {
        return this.trafficType;
    }
    /**
     * Gets the transactionId property value. The transactionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTransactionId() {
        return this.transactionId;
    }
    /**
     * Gets the transportProtocol property value. The transportProtocol property
     * @return a networkingProtocol
     */
    @javax.annotation.Nullable
    public NetworkingProtocol getTransportProtocol() {
        return this.transportProtocol;
    }
    /**
     * Gets the userId property value. The userId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPrincipalName property value. The userPrincipalName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("agentVersion", this.getAgentVersion());
        writer.writeStringValue("connectionId", this.getConnectionId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("destinationFQDN", this.getDestinationFQDN());
        writer.writeStringValue("destinationIp", this.getDestinationIp());
        writer.writeIntegerValue("destinationPort", this.getDestinationPort());
        writer.writeEnumValue("deviceCategory", this.getDeviceCategory());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceOperatingSystem", this.getDeviceOperatingSystem());
        writer.writeStringValue("deviceOperatingSystemVersion", this.getDeviceOperatingSystemVersion());
        writer.writeObjectValue("headers", this.getHeaders());
        writer.writeEnumValue("networkProtocol", this.getNetworkProtocol());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeStringValue("policyRuleId", this.getPolicyRuleId());
        writer.writeLongValue("receivedBytes", this.getReceivedBytes());
        writer.writeLongValue("sentBytes", this.getSentBytes());
        writer.writeStringValue("sessionId", this.getSessionId());
        writer.writeStringValue("sourceIp", this.getSourceIp());
        writer.writeIntegerValue("sourcePort", this.getSourcePort());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeEnumValue("trafficType", this.getTrafficType());
        writer.writeStringValue("transactionId", this.getTransactionId());
        writer.writeEnumValue("transportProtocol", this.getTransportProtocol());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the agentVersion property value. The agentVersion property
     * @param value Value to set for the agentVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgentVersion(@javax.annotation.Nullable final String value) {
        this.agentVersion = value;
    }
    /**
     * Sets the connectionId property value. The connectionId property
     * @param value Value to set for the connectionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionId(@javax.annotation.Nullable final String value) {
        this.connectionId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the destinationFQDN property value. The destinationFQDN property
     * @param value Value to set for the destinationFQDN property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationFQDN(@javax.annotation.Nullable final String value) {
        this.destinationFQDN = value;
    }
    /**
     * Sets the destinationIp property value. The destinationIp property
     * @param value Value to set for the destinationIp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationIp(@javax.annotation.Nullable final String value) {
        this.destinationIp = value;
    }
    /**
     * Sets the destinationPort property value. The destinationPort property
     * @param value Value to set for the destinationPort property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationPort(@javax.annotation.Nullable final Integer value) {
        this.destinationPort = value;
    }
    /**
     * Sets the deviceCategory property value. The deviceCategory property
     * @param value Value to set for the deviceCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCategory(@javax.annotation.Nullable final DeviceCategory value) {
        this.deviceCategory = value;
    }
    /**
     * Sets the deviceId property value. The deviceId property
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceOperatingSystem property value. The deviceOperatingSystem property
     * @param value Value to set for the deviceOperatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceOperatingSystem(@javax.annotation.Nullable final String value) {
        this.deviceOperatingSystem = value;
    }
    /**
     * Sets the deviceOperatingSystemVersion property value. The deviceOperatingSystemVersion property
     * @param value Value to set for the deviceOperatingSystemVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceOperatingSystemVersion(@javax.annotation.Nullable final String value) {
        this.deviceOperatingSystemVersion = value;
    }
    /**
     * Sets the headers property value. The headers property
     * @param value Value to set for the headers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHeaders(@javax.annotation.Nullable final Headers value) {
        this.headers = value;
    }
    /**
     * Sets the networkProtocol property value. The networkProtocol property
     * @param value Value to set for the networkProtocol property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkProtocol(@javax.annotation.Nullable final NetworkingProtocol value) {
        this.networkProtocol = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the policyId property value. The policyId property
     * @param value Value to set for the policyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyId(@javax.annotation.Nullable final String value) {
        this.policyId = value;
    }
    /**
     * Sets the policyRuleId property value. The policyRuleId property
     * @param value Value to set for the policyRuleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyRuleId(@javax.annotation.Nullable final String value) {
        this.policyRuleId = value;
    }
    /**
     * Sets the receivedBytes property value. The receivedBytes property
     * @param value Value to set for the receivedBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReceivedBytes(@javax.annotation.Nullable final Long value) {
        this.receivedBytes = value;
    }
    /**
     * Sets the sentBytes property value. The sentBytes property
     * @param value Value to set for the sentBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSentBytes(@javax.annotation.Nullable final Long value) {
        this.sentBytes = value;
    }
    /**
     * Sets the sessionId property value. The sessionId property
     * @param value Value to set for the sessionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSessionId(@javax.annotation.Nullable final String value) {
        this.sessionId = value;
    }
    /**
     * Sets the sourceIp property value. The sourceIp property
     * @param value Value to set for the sourceIp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceIp(@javax.annotation.Nullable final String value) {
        this.sourceIp = value;
    }
    /**
     * Sets the sourcePort property value. The sourcePort property
     * @param value Value to set for the sourcePort property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourcePort(@javax.annotation.Nullable final Integer value) {
        this.sourcePort = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the trafficType property value. The trafficType property
     * @param value Value to set for the trafficType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrafficType(@javax.annotation.Nullable final TrafficType value) {
        this.trafficType = value;
    }
    /**
     * Sets the transactionId property value. The transactionId property
     * @param value Value to set for the transactionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTransactionId(@javax.annotation.Nullable final String value) {
        this.transactionId = value;
    }
    /**
     * Sets the transportProtocol property value. The transportProtocol property
     * @param value Value to set for the transportProtocol property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTransportProtocol(@javax.annotation.Nullable final NetworkingProtocol value) {
        this.transportProtocol = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPrincipalName property value. The userPrincipalName property
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
