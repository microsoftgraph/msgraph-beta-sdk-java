package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * VPN Traffic Rule definition.
 */
public class VpnTrafficRule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * App identifier, if this traffic rule is triggered by an app.
     */
    private String appId;
    /**
     * Indicates the type of app that a VPN traffic rule is associated with.
     */
    private VpnTrafficRuleAppType appType;
    /**
     * Claims associated with this traffic rule.
     */
    private String claims;
    /**
     * Local address range. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<IPv4Range> localAddressRanges;
    /**
     * Local port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     */
    private java.util.List<NumberRange> localPortRanges;
    /**
     * Name.
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Protocols (0-255). Valid values 0 to 255
     */
    private Integer protocols;
    /**
     * Remote address range. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<IPv4Range> remoteAddressRanges;
    /**
     * Remote port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     */
    private java.util.List<NumberRange> remotePortRanges;
    /**
     * Specifies the routing policy for a VPN traffic rule.
     */
    private VpnTrafficRuleRoutingPolicyType routingPolicyType;
    /**
     * Specify whether the rule applies to inbound traffic or outbound traffic.
     */
    private VpnTrafficDirection vpnTrafficDirection;
    /**
     * Instantiates a new vpnTrafficRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VpnTrafficRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vpnTrafficRule
     */
    @javax.annotation.Nonnull
    public static VpnTrafficRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpnTrafficRule();
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
     * Gets the appId property value. App identifier, if this traffic rule is triggered by an app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * Gets the appType property value. Indicates the type of app that a VPN traffic rule is associated with.
     * @return a vpnTrafficRuleAppType
     */
    @javax.annotation.Nullable
    public VpnTrafficRuleAppType getAppType() {
        return this.appType;
    }
    /**
     * Gets the claims property value. Claims associated with this traffic rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClaims() {
        return this.claims;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("appType", (n) -> { this.setAppType(n.getEnumValue(VpnTrafficRuleAppType.class)); });
        deserializerMap.put("claims", (n) -> { this.setClaims(n.getStringValue()); });
        deserializerMap.put("localAddressRanges", (n) -> { this.setLocalAddressRanges(n.getCollectionOfObjectValues(IPv4Range::createFromDiscriminatorValue)); });
        deserializerMap.put("localPortRanges", (n) -> { this.setLocalPortRanges(n.getCollectionOfObjectValues(NumberRange::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("protocols", (n) -> { this.setProtocols(n.getIntegerValue()); });
        deserializerMap.put("remoteAddressRanges", (n) -> { this.setRemoteAddressRanges(n.getCollectionOfObjectValues(IPv4Range::createFromDiscriminatorValue)); });
        deserializerMap.put("remotePortRanges", (n) -> { this.setRemotePortRanges(n.getCollectionOfObjectValues(NumberRange::createFromDiscriminatorValue)); });
        deserializerMap.put("routingPolicyType", (n) -> { this.setRoutingPolicyType(n.getEnumValue(VpnTrafficRuleRoutingPolicyType.class)); });
        deserializerMap.put("vpnTrafficDirection", (n) -> { this.setVpnTrafficDirection(n.getEnumValue(VpnTrafficDirection.class)); });
        return deserializerMap;
    }
    /**
     * Gets the localAddressRanges property value. Local address range. This collection can contain a maximum of 500 elements.
     * @return a iPv4Range
     */
    @javax.annotation.Nullable
    public java.util.List<IPv4Range> getLocalAddressRanges() {
        return this.localAddressRanges;
    }
    /**
     * Gets the localPortRanges property value. Local port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     * @return a numberRange
     */
    @javax.annotation.Nullable
    public java.util.List<NumberRange> getLocalPortRanges() {
        return this.localPortRanges;
    }
    /**
     * Gets the name property value. Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the protocols property value. Protocols (0-255). Valid values 0 to 255
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getProtocols() {
        return this.protocols;
    }
    /**
     * Gets the remoteAddressRanges property value. Remote address range. This collection can contain a maximum of 500 elements.
     * @return a iPv4Range
     */
    @javax.annotation.Nullable
    public java.util.List<IPv4Range> getRemoteAddressRanges() {
        return this.remoteAddressRanges;
    }
    /**
     * Gets the remotePortRanges property value. Remote port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     * @return a numberRange
     */
    @javax.annotation.Nullable
    public java.util.List<NumberRange> getRemotePortRanges() {
        return this.remotePortRanges;
    }
    /**
     * Gets the routingPolicyType property value. Specifies the routing policy for a VPN traffic rule.
     * @return a vpnTrafficRuleRoutingPolicyType
     */
    @javax.annotation.Nullable
    public VpnTrafficRuleRoutingPolicyType getRoutingPolicyType() {
        return this.routingPolicyType;
    }
    /**
     * Gets the vpnTrafficDirection property value. Specify whether the rule applies to inbound traffic or outbound traffic.
     * @return a vpnTrafficDirection
     */
    @javax.annotation.Nullable
    public VpnTrafficDirection getVpnTrafficDirection() {
        return this.vpnTrafficDirection;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeEnumValue("appType", this.getAppType());
        writer.writeStringValue("claims", this.getClaims());
        writer.writeCollectionOfObjectValues("localAddressRanges", this.getLocalAddressRanges());
        writer.writeCollectionOfObjectValues("localPortRanges", this.getLocalPortRanges());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("protocols", this.getProtocols());
        writer.writeCollectionOfObjectValues("remoteAddressRanges", this.getRemoteAddressRanges());
        writer.writeCollectionOfObjectValues("remotePortRanges", this.getRemotePortRanges());
        writer.writeEnumValue("routingPolicyType", this.getRoutingPolicyType());
        writer.writeEnumValue("vpnTrafficDirection", this.getVpnTrafficDirection());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the appId property value. App identifier, if this traffic rule is triggered by an app.
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the appType property value. Indicates the type of app that a VPN traffic rule is associated with.
     * @param value Value to set for the appType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppType(@javax.annotation.Nullable final VpnTrafficRuleAppType value) {
        this.appType = value;
    }
    /**
     * Sets the claims property value. Claims associated with this traffic rule.
     * @param value Value to set for the claims property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClaims(@javax.annotation.Nullable final String value) {
        this.claims = value;
    }
    /**
     * Sets the localAddressRanges property value. Local address range. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the localAddressRanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalAddressRanges(@javax.annotation.Nullable final java.util.List<IPv4Range> value) {
        this.localAddressRanges = value;
    }
    /**
     * Sets the localPortRanges property value. Local port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     * @param value Value to set for the localPortRanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalPortRanges(@javax.annotation.Nullable final java.util.List<NumberRange> value) {
        this.localPortRanges = value;
    }
    /**
     * Sets the name property value. Name.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the protocols property value. Protocols (0-255). Valid values 0 to 255
     * @param value Value to set for the protocols property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProtocols(@javax.annotation.Nullable final Integer value) {
        this.protocols = value;
    }
    /**
     * Sets the remoteAddressRanges property value. Remote address range. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the remoteAddressRanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteAddressRanges(@javax.annotation.Nullable final java.util.List<IPv4Range> value) {
        this.remoteAddressRanges = value;
    }
    /**
     * Sets the remotePortRanges property value. Remote port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     * @param value Value to set for the remotePortRanges property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemotePortRanges(@javax.annotation.Nullable final java.util.List<NumberRange> value) {
        this.remotePortRanges = value;
    }
    /**
     * Sets the routingPolicyType property value. Specifies the routing policy for a VPN traffic rule.
     * @param value Value to set for the routingPolicyType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoutingPolicyType(@javax.annotation.Nullable final VpnTrafficRuleRoutingPolicyType value) {
        this.routingPolicyType = value;
    }
    /**
     * Sets the vpnTrafficDirection property value. Specify whether the rule applies to inbound traffic or outbound traffic.
     * @param value Value to set for the vpnTrafficDirection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVpnTrafficDirection(@javax.annotation.Nullable final VpnTrafficDirection value) {
        this.vpnTrafficDirection = value;
    }
}
