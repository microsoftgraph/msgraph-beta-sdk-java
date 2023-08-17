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
     * Represents the version of the Global Secure Access client agent software. Supports $filter (eq) and $orderby.
     */
    private String agentVersion;
    /**
     * Represents a unique identifier assigned to a connection. Supports $filter (eq) and $orderby.
     */
    private String connectionId;
    /**
     * Represents the date and time when a network access traffic log entry was created. Supports $filter (eq) and $orderby.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Represents the Fully Qualified Domain Name (FQDN) of the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     */
    private String destinationFQDN;
    /**
     * Represents the IP address of the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     */
    private String destinationIp;
    /**
     * Represents the network port number on the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     */
    private Integer destinationPort;
    /**
     * Represents the category classification of a device within a network infrastructure. The possible values are: client, branch, unknownFutureValue. Supports $filter (eq) and $orderby.
     */
    private DeviceCategory deviceCategory;
    /**
     * Represents a unique identifier assigned to a device within a network infrastructure. Supports $filter (eq) and $orderby.
     */
    private String deviceId;
    /**
     * Represents the operating system installed on a device within a network infrastructure. Supports $filter (eq) and $orderby.
     */
    private String deviceOperatingSystem;
    /**
     * Represents the version or release number of the operating system installed on a device within a network infrastructure. Supports $filter (eq) and $orderby.
     */
    private String deviceOperatingSystemVersion;
    /**
     * Represents the headers included in a network request or response. Supports $filter (eq) and $orderby.
     */
    private Headers headers;
    /**
     * Represents the networking protocol used for communication.The possible values are: ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII, unknownFutureValue. Supports $filter (eq) and $orderby.
     */
    private NetworkingProtocol networkProtocol;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Represents a unique identifier assigned to a policy. Supports $filter (eq) and $orderby.
     */
    private String policyId;
    /**
     * Represents a unique identifier assigned to a policy rule. Supports $filter (eq) and $orderby.
     */
    private String policyRuleId;
    /**
     * Represents the total number of bytes received in a network communication or data transfer. Supports $filter (eq) and $orderby.
     */
    private Long receivedBytes;
    /**
     * Represents the total number of bytes sent in a network communication or data transfer. Supports $filter (eq) and $orderby.
     */
    private Long sentBytes;
    /**
     * Represents a unique identifier assigned to a session or connection within a network infrastructure. Supports $filter (eq) and $orderby.
     */
    private String sessionId;
    /**
     * Represents the source IP address in a network communication. Supports $filter (eq) and $orderby.
     */
    private String sourceIp;
    /**
     * Represents the network port number on the source host or device in a network communication. Supports $filter (eq) and $orderby.
     */
    private Integer sourcePort;
    /**
     * Represents a unique identifier assigned to a tenant within a network infrastructure. Supports $filter (eq) and $orderby.
     */
    private String tenantId;
    /**
     * The trafficType property
     */
    private TrafficType trafficType;
    /**
     * Represents a unique identifier assigned to a specific transaction or operation. Key. Supports $filter (eq) and $orderby.
     */
    private String transactionId;
    /**
     * Represents the transport protocol used for communication.The possible values are: ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII, unknownFutureValue. Supports $filter (eq) and $orderby.
     */
    private NetworkingProtocol transportProtocol;
    /**
     * Represents a unique identifier assigned to a user. Supports $filter (eq) and $orderby.
     */
    private String userId;
    /**
     * Represents the user principal name (UPN) associated with a user. Supports $filter (eq) and $orderby.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new networkAccessTraffic and sets the default values.
     */
    public NetworkAccessTraffic() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a networkAccessTraffic
     */
    @jakarta.annotation.Nonnull
    public static NetworkAccessTraffic createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkAccessTraffic();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the agentVersion property value. Represents the version of the Global Secure Access client agent software. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAgentVersion() {
        return this.agentVersion;
    }
    /**
     * Gets the connectionId property value. Represents a unique identifier assigned to a connection. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getConnectionId() {
        return this.connectionId;
    }
    /**
     * Gets the createdDateTime property value. Represents the date and time when a network access traffic log entry was created. Supports $filter (eq) and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the destinationFQDN property value. Represents the Fully Qualified Domain Name (FQDN) of the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDestinationFQDN() {
        return this.destinationFQDN;
    }
    /**
     * Gets the destinationIp property value. Represents the IP address of the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDestinationIp() {
        return this.destinationIp;
    }
    /**
     * Gets the destinationPort property value. Represents the network port number on the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDestinationPort() {
        return this.destinationPort;
    }
    /**
     * Gets the deviceCategory property value. Represents the category classification of a device within a network infrastructure. The possible values are: client, branch, unknownFutureValue. Supports $filter (eq) and $orderby.
     * @return a deviceCategory
     */
    @jakarta.annotation.Nullable
    public DeviceCategory getDeviceCategory() {
        return this.deviceCategory;
    }
    /**
     * Gets the deviceId property value. Represents a unique identifier assigned to a device within a network infrastructure. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceOperatingSystem property value. Represents the operating system installed on a device within a network infrastructure. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceOperatingSystem() {
        return this.deviceOperatingSystem;
    }
    /**
     * Gets the deviceOperatingSystemVersion property value. Represents the version or release number of the operating system installed on a device within a network infrastructure. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceOperatingSystemVersion() {
        return this.deviceOperatingSystemVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * Gets the headers property value. Represents the headers included in a network request or response. Supports $filter (eq) and $orderby.
     * @return a headers
     */
    @jakarta.annotation.Nullable
    public Headers getHeaders() {
        return this.headers;
    }
    /**
     * Gets the networkProtocol property value. Represents the networking protocol used for communication.The possible values are: ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII, unknownFutureValue. Supports $filter (eq) and $orderby.
     * @return a networkingProtocol
     */
    @jakarta.annotation.Nullable
    public NetworkingProtocol getNetworkProtocol() {
        return this.networkProtocol;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the policyId property value. Represents a unique identifier assigned to a policy. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.policyId;
    }
    /**
     * Gets the policyRuleId property value. Represents a unique identifier assigned to a policy rule. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getPolicyRuleId() {
        return this.policyRuleId;
    }
    /**
     * Gets the receivedBytes property value. Represents the total number of bytes received in a network communication or data transfer. Supports $filter (eq) and $orderby.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getReceivedBytes() {
        return this.receivedBytes;
    }
    /**
     * Gets the sentBytes property value. Represents the total number of bytes sent in a network communication or data transfer. Supports $filter (eq) and $orderby.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getSentBytes() {
        return this.sentBytes;
    }
    /**
     * Gets the sessionId property value. Represents a unique identifier assigned to a session or connection within a network infrastructure. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSessionId() {
        return this.sessionId;
    }
    /**
     * Gets the sourceIp property value. Represents the source IP address in a network communication. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getSourceIp() {
        return this.sourceIp;
    }
    /**
     * Gets the sourcePort property value. Represents the network port number on the source host or device in a network communication. Supports $filter (eq) and $orderby.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSourcePort() {
        return this.sourcePort;
    }
    /**
     * Gets the tenantId property value. Represents a unique identifier assigned to a tenant within a network infrastructure. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the trafficType property value. The trafficType property
     * @return a trafficType
     */
    @jakarta.annotation.Nullable
    public TrafficType getTrafficType() {
        return this.trafficType;
    }
    /**
     * Gets the transactionId property value. Represents a unique identifier assigned to a specific transaction or operation. Key. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTransactionId() {
        return this.transactionId;
    }
    /**
     * Gets the transportProtocol property value. Represents the transport protocol used for communication.The possible values are: ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII, unknownFutureValue. Supports $filter (eq) and $orderby.
     * @return a networkingProtocol
     */
    @jakarta.annotation.Nullable
    public NetworkingProtocol getTransportProtocol() {
        return this.transportProtocol;
    }
    /**
     * Gets the userId property value. Represents a unique identifier assigned to a user. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPrincipalName property value. Represents the user principal name (UPN) associated with a user. Supports $filter (eq) and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the agentVersion property value. Represents the version of the Global Secure Access client agent software. Supports $filter (eq) and $orderby.
     * @param value Value to set for the agentVersion property.
     */
    public void setAgentVersion(@jakarta.annotation.Nullable final String value) {
        this.agentVersion = value;
    }
    /**
     * Sets the connectionId property value. Represents a unique identifier assigned to a connection. Supports $filter (eq) and $orderby.
     * @param value Value to set for the connectionId property.
     */
    public void setConnectionId(@jakarta.annotation.Nullable final String value) {
        this.connectionId = value;
    }
    /**
     * Sets the createdDateTime property value. Represents the date and time when a network access traffic log entry was created. Supports $filter (eq) and $orderby.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the destinationFQDN property value. Represents the Fully Qualified Domain Name (FQDN) of the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     * @param value Value to set for the destinationFQDN property.
     */
    public void setDestinationFQDN(@jakarta.annotation.Nullable final String value) {
        this.destinationFQDN = value;
    }
    /**
     * Sets the destinationIp property value. Represents the IP address of the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     * @param value Value to set for the destinationIp property.
     */
    public void setDestinationIp(@jakarta.annotation.Nullable final String value) {
        this.destinationIp = value;
    }
    /**
     * Sets the destinationPort property value. Represents the network port number on the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     * @param value Value to set for the destinationPort property.
     */
    public void setDestinationPort(@jakarta.annotation.Nullable final Integer value) {
        this.destinationPort = value;
    }
    /**
     * Sets the deviceCategory property value. Represents the category classification of a device within a network infrastructure. The possible values are: client, branch, unknownFutureValue. Supports $filter (eq) and $orderby.
     * @param value Value to set for the deviceCategory property.
     */
    public void setDeviceCategory(@jakarta.annotation.Nullable final DeviceCategory value) {
        this.deviceCategory = value;
    }
    /**
     * Sets the deviceId property value. Represents a unique identifier assigned to a device within a network infrastructure. Supports $filter (eq) and $orderby.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceOperatingSystem property value. Represents the operating system installed on a device within a network infrastructure. Supports $filter (eq) and $orderby.
     * @param value Value to set for the deviceOperatingSystem property.
     */
    public void setDeviceOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.deviceOperatingSystem = value;
    }
    /**
     * Sets the deviceOperatingSystemVersion property value. Represents the version or release number of the operating system installed on a device within a network infrastructure. Supports $filter (eq) and $orderby.
     * @param value Value to set for the deviceOperatingSystemVersion property.
     */
    public void setDeviceOperatingSystemVersion(@jakarta.annotation.Nullable final String value) {
        this.deviceOperatingSystemVersion = value;
    }
    /**
     * Sets the headers property value. Represents the headers included in a network request or response. Supports $filter (eq) and $orderby.
     * @param value Value to set for the headers property.
     */
    public void setHeaders(@jakarta.annotation.Nullable final Headers value) {
        this.headers = value;
    }
    /**
     * Sets the networkProtocol property value. Represents the networking protocol used for communication.The possible values are: ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII, unknownFutureValue. Supports $filter (eq) and $orderby.
     * @param value Value to set for the networkProtocol property.
     */
    public void setNetworkProtocol(@jakarta.annotation.Nullable final NetworkingProtocol value) {
        this.networkProtocol = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the policyId property value. Represents a unique identifier assigned to a policy. Supports $filter (eq) and $orderby.
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.policyId = value;
    }
    /**
     * Sets the policyRuleId property value. Represents a unique identifier assigned to a policy rule. Supports $filter (eq) and $orderby.
     * @param value Value to set for the policyRuleId property.
     */
    public void setPolicyRuleId(@jakarta.annotation.Nullable final String value) {
        this.policyRuleId = value;
    }
    /**
     * Sets the receivedBytes property value. Represents the total number of bytes received in a network communication or data transfer. Supports $filter (eq) and $orderby.
     * @param value Value to set for the receivedBytes property.
     */
    public void setReceivedBytes(@jakarta.annotation.Nullable final Long value) {
        this.receivedBytes = value;
    }
    /**
     * Sets the sentBytes property value. Represents the total number of bytes sent in a network communication or data transfer. Supports $filter (eq) and $orderby.
     * @param value Value to set for the sentBytes property.
     */
    public void setSentBytes(@jakarta.annotation.Nullable final Long value) {
        this.sentBytes = value;
    }
    /**
     * Sets the sessionId property value. Represents a unique identifier assigned to a session or connection within a network infrastructure. Supports $filter (eq) and $orderby.
     * @param value Value to set for the sessionId property.
     */
    public void setSessionId(@jakarta.annotation.Nullable final String value) {
        this.sessionId = value;
    }
    /**
     * Sets the sourceIp property value. Represents the source IP address in a network communication. Supports $filter (eq) and $orderby.
     * @param value Value to set for the sourceIp property.
     */
    public void setSourceIp(@jakarta.annotation.Nullable final String value) {
        this.sourceIp = value;
    }
    /**
     * Sets the sourcePort property value. Represents the network port number on the source host or device in a network communication. Supports $filter (eq) and $orderby.
     * @param value Value to set for the sourcePort property.
     */
    public void setSourcePort(@jakarta.annotation.Nullable final Integer value) {
        this.sourcePort = value;
    }
    /**
     * Sets the tenantId property value. Represents a unique identifier assigned to a tenant within a network infrastructure. Supports $filter (eq) and $orderby.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the trafficType property value. The trafficType property
     * @param value Value to set for the trafficType property.
     */
    public void setTrafficType(@jakarta.annotation.Nullable final TrafficType value) {
        this.trafficType = value;
    }
    /**
     * Sets the transactionId property value. Represents a unique identifier assigned to a specific transaction or operation. Key. Supports $filter (eq) and $orderby.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final String value) {
        this.transactionId = value;
    }
    /**
     * Sets the transportProtocol property value. Represents the transport protocol used for communication.The possible values are: ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII, unknownFutureValue. Supports $filter (eq) and $orderby.
     * @param value Value to set for the transportProtocol property.
     */
    public void setTransportProtocol(@jakarta.annotation.Nullable final NetworkingProtocol value) {
        this.transportProtocol = value;
    }
    /**
     * Sets the userId property value. Represents a unique identifier assigned to a user. Supports $filter (eq) and $orderby.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPrincipalName property value. Represents the user principal name (UPN) associated with a user. Supports $filter (eq) and $orderby.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
