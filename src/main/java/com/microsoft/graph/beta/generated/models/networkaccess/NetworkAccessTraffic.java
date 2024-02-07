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
public class NetworkAccessTraffic implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new NetworkAccessTraffic and sets the default values.
     */
    public NetworkAccessTraffic() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NetworkAccessTraffic
     */
    @jakarta.annotation.Nonnull
    public static NetworkAccessTraffic createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkAccessTraffic();
    }
    /**
     * Gets the action property value. The action property
     * @return a FilteringPolicyAction
     */
    @jakarta.annotation.Nullable
    public FilteringPolicyAction getAction() {
        return this.backingStore.get("action");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
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
     * Gets the agentVersion property value. Represents the version of the Global Secure Access client agent software. Supports $filter (eq) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAgentVersion() {
        return this.backingStore.get("agentVersion");
    }
    /**
     * Gets the applicationSnapshot property value. The applicationSnapshot property
     * @return a ApplicationSnapshot
     */
    @jakarta.annotation.Nullable
    public ApplicationSnapshot getApplicationSnapshot() {
        return this.backingStore.get("applicationSnapshot");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the connectionId property value. Represents a unique identifier assigned to a connection. Supports $filter (eq) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectionId() {
        return this.backingStore.get("connectionId");
    }
    /**
     * Gets the createdDateTime property value. Represents the date and time when a network access traffic log entry was created. Supports $filter (eq) and $orderby.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the destinationFQDN property value. Represents the Fully Qualified Domain Name (FQDN) of the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestinationFQDN() {
        return this.backingStore.get("destinationFQDN");
    }
    /**
     * Gets the destinationIp property value. Represents the IP address of the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestinationIp() {
        return this.backingStore.get("destinationIp");
    }
    /**
     * Gets the destinationPort property value. Represents the network port number on the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDestinationPort() {
        return this.backingStore.get("destinationPort");
    }
    /**
     * Gets the destinationUrl property value. The destinationUrl property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestinationUrl() {
        return this.backingStore.get("destinationUrl");
    }
    /**
     * Gets the destinationWebCategory property value. The destinationWebCategory property
     * @return a WebCategory
     */
    @jakarta.annotation.Nullable
    public WebCategory getDestinationWebCategory() {
        return this.backingStore.get("destinationWebCategory");
    }
    /**
     * Gets the deviceCategory property value. Represents the category classification of a device within a network infrastructure. The possible values are: client, branch, unknownFutureValue. Supports $filter (eq) and $orderby.
     * @return a DeviceCategory
     */
    @jakarta.annotation.Nullable
    public DeviceCategory getDeviceCategory() {
        return this.backingStore.get("deviceCategory");
    }
    /**
     * Gets the deviceId property value. Represents a unique identifier assigned to a device within a network infrastructure. Supports $filter (eq) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the deviceOperatingSystem property value. Represents the operating system installed on a device within a network infrastructure. Supports $filter (eq) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceOperatingSystem() {
        return this.backingStore.get("deviceOperatingSystem");
    }
    /**
     * Gets the deviceOperatingSystemVersion property value. Represents the version or release number of the operating system installed on a device within a network infrastructure. Supports $filter (eq) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceOperatingSystemVersion() {
        return this.backingStore.get("deviceOperatingSystemVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(38);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(FilteringPolicyAction::forValue)); });
        deserializerMap.put("agentVersion", (n) -> { this.setAgentVersion(n.getStringValue()); });
        deserializerMap.put("applicationSnapshot", (n) -> { this.setApplicationSnapshot(n.getObjectValue(ApplicationSnapshot::createFromDiscriminatorValue)); });
        deserializerMap.put("connectionId", (n) -> { this.setConnectionId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("destinationFQDN", (n) -> { this.setDestinationFQDN(n.getStringValue()); });
        deserializerMap.put("destinationIp", (n) -> { this.setDestinationIp(n.getStringValue()); });
        deserializerMap.put("destinationPort", (n) -> { this.setDestinationPort(n.getIntegerValue()); });
        deserializerMap.put("destinationUrl", (n) -> { this.setDestinationUrl(n.getStringValue()); });
        deserializerMap.put("destinationWebCategory", (n) -> { this.setDestinationWebCategory(n.getObjectValue(WebCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCategory", (n) -> { this.setDeviceCategory(n.getEnumValue(DeviceCategory::forValue)); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceOperatingSystem", (n) -> { this.setDeviceOperatingSystem(n.getStringValue()); });
        deserializerMap.put("deviceOperatingSystemVersion", (n) -> { this.setDeviceOperatingSystemVersion(n.getStringValue()); });
        deserializerMap.put("filteringProfileId", (n) -> { this.setFilteringProfileId(n.getStringValue()); });
        deserializerMap.put("filteringProfileName", (n) -> { this.setFilteringProfileName(n.getStringValue()); });
        deserializerMap.put("headers", (n) -> { this.setHeaders(n.getObjectValue(Headers::createFromDiscriminatorValue)); });
        deserializerMap.put("initiatingProcessName", (n) -> { this.setInitiatingProcessName(n.getStringValue()); });
        deserializerMap.put("networkProtocol", (n) -> { this.setNetworkProtocol(n.getEnumValue(NetworkingProtocol::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("policyId", (n) -> { this.setPolicyId(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { this.setPolicyName(n.getStringValue()); });
        deserializerMap.put("policyRuleId", (n) -> { this.setPolicyRuleId(n.getStringValue()); });
        deserializerMap.put("policyRuleName", (n) -> { this.setPolicyRuleName(n.getStringValue()); });
        deserializerMap.put("privateAccessDetails", (n) -> { this.setPrivateAccessDetails(n.getObjectValue(PrivateAccessDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("receivedBytes", (n) -> { this.setReceivedBytes(n.getLongValue()); });
        deserializerMap.put("resourceTenantId", (n) -> { this.setResourceTenantId(n.getStringValue()); });
        deserializerMap.put("sentBytes", (n) -> { this.setSentBytes(n.getLongValue()); });
        deserializerMap.put("sessionId", (n) -> { this.setSessionId(n.getStringValue()); });
        deserializerMap.put("sourceIp", (n) -> { this.setSourceIp(n.getStringValue()); });
        deserializerMap.put("sourcePort", (n) -> { this.setSourcePort(n.getIntegerValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("threatType", (n) -> { this.setThreatType(n.getStringValue()); });
        deserializerMap.put("trafficType", (n) -> { this.setTrafficType(n.getEnumValue(TrafficType::forValue)); });
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getStringValue()); });
        deserializerMap.put("transportProtocol", (n) -> { this.setTransportProtocol(n.getEnumValue(NetworkingProtocol::forValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filteringProfileId property value. The filteringProfileId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFilteringProfileId() {
        return this.backingStore.get("filteringProfileId");
    }
    /**
     * Gets the filteringProfileName property value. The filteringProfileName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFilteringProfileName() {
        return this.backingStore.get("filteringProfileName");
    }
    /**
     * Gets the headers property value. Represents the headers included in a network request or response. Supports $filter (eq) and $orderby.
     * @return a Headers
     */
    @jakarta.annotation.Nullable
    public Headers getHeaders() {
        return this.backingStore.get("headers");
    }
    /**
     * Gets the initiatingProcessName property value. The initiatingProcessName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInitiatingProcessName() {
        return this.backingStore.get("initiatingProcessName");
    }
    /**
     * Gets the networkProtocol property value. Represents the networking protocol used for communication.The possible values are: ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII, unknownFutureValue. Supports $filter (eq) and $orderby.
     * @return a NetworkingProtocol
     */
    @jakarta.annotation.Nullable
    public NetworkingProtocol getNetworkProtocol() {
        return this.backingStore.get("networkProtocol");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the policyId property value. Represents a unique identifier assigned to a policy. Supports $filter (eq) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPolicyId() {
        return this.backingStore.get("policyId");
    }
    /**
     * Gets the policyName property value. The policyName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPolicyName() {
        return this.backingStore.get("policyName");
    }
    /**
     * Gets the policyRuleId property value. Represents a unique identifier assigned to a policy rule. Supports $filter (eq) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPolicyRuleId() {
        return this.backingStore.get("policyRuleId");
    }
    /**
     * Gets the policyRuleName property value. The policyRuleName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPolicyRuleName() {
        return this.backingStore.get("policyRuleName");
    }
    /**
     * Gets the privateAccessDetails property value. The privateAccessDetails property
     * @return a PrivateAccessDetails
     */
    @jakarta.annotation.Nullable
    public PrivateAccessDetails getPrivateAccessDetails() {
        return this.backingStore.get("privateAccessDetails");
    }
    /**
     * Gets the receivedBytes property value. Represents the total number of bytes received in a network communication or data transfer. Supports $filter (eq) and $orderby.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getReceivedBytes() {
        return this.backingStore.get("receivedBytes");
    }
    /**
     * Gets the resourceTenantId property value. The resourceTenantId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceTenantId() {
        return this.backingStore.get("resourceTenantId");
    }
    /**
     * Gets the sentBytes property value. Represents the total number of bytes sent in a network communication or data transfer. Supports $filter (eq) and $orderby.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSentBytes() {
        return this.backingStore.get("sentBytes");
    }
    /**
     * Gets the sessionId property value. Represents a unique identifier assigned to a session or connection within a network infrastructure. Supports $filter (eq) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSessionId() {
        return this.backingStore.get("sessionId");
    }
    /**
     * Gets the sourceIp property value. Represents the source IP address in a network communication. Supports $filter (eq) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceIp() {
        return this.backingStore.get("sourceIp");
    }
    /**
     * Gets the sourcePort property value. Represents the network port number on the source host or device in a network communication. Supports $filter (eq) and $orderby.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSourcePort() {
        return this.backingStore.get("sourcePort");
    }
    /**
     * Gets the tenantId property value. Represents a unique identifier assigned to a tenant within a network infrastructure. Supports $filter (eq) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the threatType property value. The threatType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getThreatType() {
        return this.backingStore.get("threatType");
    }
    /**
     * Gets the trafficType property value. The trafficType property
     * @return a TrafficType
     */
    @jakarta.annotation.Nullable
    public TrafficType getTrafficType() {
        return this.backingStore.get("trafficType");
    }
    /**
     * Gets the transactionId property value. Represents a unique identifier assigned to a specific transaction or operation. Key. Supports $filter (eq) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTransactionId() {
        return this.backingStore.get("transactionId");
    }
    /**
     * Gets the transportProtocol property value. Represents the transport protocol used for communication.The possible values are: ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII, unknownFutureValue. Supports $filter (eq) and $orderby.
     * @return a NetworkingProtocol
     */
    @jakarta.annotation.Nullable
    public NetworkingProtocol getTransportProtocol() {
        return this.backingStore.get("transportProtocol");
    }
    /**
     * Gets the userId property value. Represents a unique identifier assigned to a user. Supports $filter (eq) and $orderby.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userPrincipalName property value. Represents the user principal name (UPN) associated with a user. Supports $filter (eq) and $orderby.
     * @return a String
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
        writer.writeEnumValue("action", this.getAction());
        writer.writeStringValue("agentVersion", this.getAgentVersion());
        writer.writeObjectValue("applicationSnapshot", this.getApplicationSnapshot());
        writer.writeStringValue("connectionId", this.getConnectionId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("destinationFQDN", this.getDestinationFQDN());
        writer.writeStringValue("destinationIp", this.getDestinationIp());
        writer.writeIntegerValue("destinationPort", this.getDestinationPort());
        writer.writeStringValue("destinationUrl", this.getDestinationUrl());
        writer.writeObjectValue("destinationWebCategory", this.getDestinationWebCategory());
        writer.writeEnumValue("deviceCategory", this.getDeviceCategory());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceOperatingSystem", this.getDeviceOperatingSystem());
        writer.writeStringValue("deviceOperatingSystemVersion", this.getDeviceOperatingSystemVersion());
        writer.writeStringValue("filteringProfileId", this.getFilteringProfileId());
        writer.writeStringValue("filteringProfileName", this.getFilteringProfileName());
        writer.writeObjectValue("headers", this.getHeaders());
        writer.writeStringValue("initiatingProcessName", this.getInitiatingProcessName());
        writer.writeEnumValue("networkProtocol", this.getNetworkProtocol());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("policyId", this.getPolicyId());
        writer.writeStringValue("policyName", this.getPolicyName());
        writer.writeStringValue("policyRuleId", this.getPolicyRuleId());
        writer.writeStringValue("policyRuleName", this.getPolicyRuleName());
        writer.writeObjectValue("privateAccessDetails", this.getPrivateAccessDetails());
        writer.writeLongValue("receivedBytes", this.getReceivedBytes());
        writer.writeStringValue("resourceTenantId", this.getResourceTenantId());
        writer.writeLongValue("sentBytes", this.getSentBytes());
        writer.writeStringValue("sessionId", this.getSessionId());
        writer.writeStringValue("sourceIp", this.getSourceIp());
        writer.writeIntegerValue("sourcePort", this.getSourcePort());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeStringValue("threatType", this.getThreatType());
        writer.writeEnumValue("trafficType", this.getTrafficType());
        writer.writeStringValue("transactionId", this.getTransactionId());
        writer.writeEnumValue("transportProtocol", this.getTransportProtocol());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final FilteringPolicyAction value) {
        this.backingStore.set("action", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the agentVersion property value. Represents the version of the Global Secure Access client agent software. Supports $filter (eq) and $orderby.
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the connectionId property value. Represents a unique identifier assigned to a connection. Supports $filter (eq) and $orderby.
     * @param value Value to set for the connectionId property.
     */
    public void setConnectionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectionId", value);
    }
    /**
     * Sets the createdDateTime property value. Represents the date and time when a network access traffic log entry was created. Supports $filter (eq) and $orderby.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the destinationFQDN property value. Represents the Fully Qualified Domain Name (FQDN) of the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     * @param value Value to set for the destinationFQDN property.
     */
    public void setDestinationFQDN(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationFQDN", value);
    }
    /**
     * Sets the destinationIp property value. Represents the IP address of the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     * @param value Value to set for the destinationIp property.
     */
    public void setDestinationIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationIp", value);
    }
    /**
     * Sets the destinationPort property value. Represents the network port number on the destination host or server in a network communication. Supports $filter (eq) and $orderby.
     * @param value Value to set for the destinationPort property.
     */
    public void setDestinationPort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("destinationPort", value);
    }
    /**
     * Sets the destinationUrl property value. The destinationUrl property
     * @param value Value to set for the destinationUrl property.
     */
    public void setDestinationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationUrl", value);
    }
    /**
     * Sets the destinationWebCategory property value. The destinationWebCategory property
     * @param value Value to set for the destinationWebCategory property.
     */
    public void setDestinationWebCategory(@jakarta.annotation.Nullable final WebCategory value) {
        this.backingStore.set("destinationWebCategory", value);
    }
    /**
     * Sets the deviceCategory property value. Represents the category classification of a device within a network infrastructure. The possible values are: client, branch, unknownFutureValue. Supports $filter (eq) and $orderby.
     * @param value Value to set for the deviceCategory property.
     */
    public void setDeviceCategory(@jakarta.annotation.Nullable final DeviceCategory value) {
        this.backingStore.set("deviceCategory", value);
    }
    /**
     * Sets the deviceId property value. Represents a unique identifier assigned to a device within a network infrastructure. Supports $filter (eq) and $orderby.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceOperatingSystem property value. Represents the operating system installed on a device within a network infrastructure. Supports $filter (eq) and $orderby.
     * @param value Value to set for the deviceOperatingSystem property.
     */
    public void setDeviceOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceOperatingSystem", value);
    }
    /**
     * Sets the deviceOperatingSystemVersion property value. Represents the version or release number of the operating system installed on a device within a network infrastructure. Supports $filter (eq) and $orderby.
     * @param value Value to set for the deviceOperatingSystemVersion property.
     */
    public void setDeviceOperatingSystemVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceOperatingSystemVersion", value);
    }
    /**
     * Sets the filteringProfileId property value. The filteringProfileId property
     * @param value Value to set for the filteringProfileId property.
     */
    public void setFilteringProfileId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filteringProfileId", value);
    }
    /**
     * Sets the filteringProfileName property value. The filteringProfileName property
     * @param value Value to set for the filteringProfileName property.
     */
    public void setFilteringProfileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("filteringProfileName", value);
    }
    /**
     * Sets the headers property value. Represents the headers included in a network request or response. Supports $filter (eq) and $orderby.
     * @param value Value to set for the headers property.
     */
    public void setHeaders(@jakarta.annotation.Nullable final Headers value) {
        this.backingStore.set("headers", value);
    }
    /**
     * Sets the initiatingProcessName property value. The initiatingProcessName property
     * @param value Value to set for the initiatingProcessName property.
     */
    public void setInitiatingProcessName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("initiatingProcessName", value);
    }
    /**
     * Sets the networkProtocol property value. Represents the networking protocol used for communication.The possible values are: ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII, unknownFutureValue. Supports $filter (eq) and $orderby.
     * @param value Value to set for the networkProtocol property.
     */
    public void setNetworkProtocol(@jakarta.annotation.Nullable final NetworkingProtocol value) {
        this.backingStore.set("networkProtocol", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the policyId property value. Represents a unique identifier assigned to a policy. Supports $filter (eq) and $orderby.
     * @param value Value to set for the policyId property.
     */
    public void setPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyId", value);
    }
    /**
     * Sets the policyName property value. The policyName property
     * @param value Value to set for the policyName property.
     */
    public void setPolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyName", value);
    }
    /**
     * Sets the policyRuleId property value. Represents a unique identifier assigned to a policy rule. Supports $filter (eq) and $orderby.
     * @param value Value to set for the policyRuleId property.
     */
    public void setPolicyRuleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyRuleId", value);
    }
    /**
     * Sets the policyRuleName property value. The policyRuleName property
     * @param value Value to set for the policyRuleName property.
     */
    public void setPolicyRuleName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("policyRuleName", value);
    }
    /**
     * Sets the privateAccessDetails property value. The privateAccessDetails property
     * @param value Value to set for the privateAccessDetails property.
     */
    public void setPrivateAccessDetails(@jakarta.annotation.Nullable final PrivateAccessDetails value) {
        this.backingStore.set("privateAccessDetails", value);
    }
    /**
     * Sets the receivedBytes property value. Represents the total number of bytes received in a network communication or data transfer. Supports $filter (eq) and $orderby.
     * @param value Value to set for the receivedBytes property.
     */
    public void setReceivedBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("receivedBytes", value);
    }
    /**
     * Sets the resourceTenantId property value. The resourceTenantId property
     * @param value Value to set for the resourceTenantId property.
     */
    public void setResourceTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceTenantId", value);
    }
    /**
     * Sets the sentBytes property value. Represents the total number of bytes sent in a network communication or data transfer. Supports $filter (eq) and $orderby.
     * @param value Value to set for the sentBytes property.
     */
    public void setSentBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("sentBytes", value);
    }
    /**
     * Sets the sessionId property value. Represents a unique identifier assigned to a session or connection within a network infrastructure. Supports $filter (eq) and $orderby.
     * @param value Value to set for the sessionId property.
     */
    public void setSessionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sessionId", value);
    }
    /**
     * Sets the sourceIp property value. Represents the source IP address in a network communication. Supports $filter (eq) and $orderby.
     * @param value Value to set for the sourceIp property.
     */
    public void setSourceIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceIp", value);
    }
    /**
     * Sets the sourcePort property value. Represents the network port number on the source host or device in a network communication. Supports $filter (eq) and $orderby.
     * @param value Value to set for the sourcePort property.
     */
    public void setSourcePort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("sourcePort", value);
    }
    /**
     * Sets the tenantId property value. Represents a unique identifier assigned to a tenant within a network infrastructure. Supports $filter (eq) and $orderby.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the threatType property value. The threatType property
     * @param value Value to set for the threatType property.
     */
    public void setThreatType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("threatType", value);
    }
    /**
     * Sets the trafficType property value. The trafficType property
     * @param value Value to set for the trafficType property.
     */
    public void setTrafficType(@jakarta.annotation.Nullable final TrafficType value) {
        this.backingStore.set("trafficType", value);
    }
    /**
     * Sets the transactionId property value. Represents a unique identifier assigned to a specific transaction or operation. Key. Supports $filter (eq) and $orderby.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("transactionId", value);
    }
    /**
     * Sets the transportProtocol property value. Represents the transport protocol used for communication.The possible values are: ip, icmp, igmp, ggp, ipv4, tcp, pup, udp, idp, ipv6, ipv6RoutingHeader, ipv6FragmentHeader, ipSecEncapsulatingSecurityPayload, ipSecAuthenticationHeader, icmpV6, ipv6NoNextHeader, ipv6DestinationOptions, nd, raw, ipx, spx, spxII, unknownFutureValue. Supports $filter (eq) and $orderby.
     * @param value Value to set for the transportProtocol property.
     */
    public void setTransportProtocol(@jakarta.annotation.Nullable final NetworkingProtocol value) {
        this.backingStore.set("transportProtocol", value);
    }
    /**
     * Sets the userId property value. Represents a unique identifier assigned to a user. Supports $filter (eq) and $orderby.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userPrincipalName property value. Represents the user principal name (UPN) associated with a user. Supports $filter (eq) and $orderby.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
