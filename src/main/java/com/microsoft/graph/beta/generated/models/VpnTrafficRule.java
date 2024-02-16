package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * VPN Traffic Rule definition.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VpnTrafficRule implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link VpnTrafficRule} and sets the default values.
     */
    public VpnTrafficRule() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VpnTrafficRule}
     */
    @jakarta.annotation.Nonnull
    public static VpnTrafficRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpnTrafficRule();
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
     * Gets the appId property value. App identifier, if this traffic rule is triggered by an app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * Gets the appType property value. Indicates the type of app that a VPN traffic rule is associated with.
     * @return a {@link VpnTrafficRuleAppType}
     */
    @jakarta.annotation.Nullable
    public VpnTrafficRuleAppType getAppType() {
        return this.backingStore.get("appType");
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
     * Gets the claims property value. Claims associated with this traffic rule.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClaims() {
        return this.backingStore.get("claims");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("appType", (n) -> { this.setAppType(n.getEnumValue(VpnTrafficRuleAppType::forValue)); });
        deserializerMap.put("claims", (n) -> { this.setClaims(n.getStringValue()); });
        deserializerMap.put("localAddressRanges", (n) -> { this.setLocalAddressRanges(n.getCollectionOfObjectValues(IPv4Range::createFromDiscriminatorValue)); });
        deserializerMap.put("localPortRanges", (n) -> { this.setLocalPortRanges(n.getCollectionOfObjectValues(NumberRange::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("protocols", (n) -> { this.setProtocols(n.getIntegerValue()); });
        deserializerMap.put("remoteAddressRanges", (n) -> { this.setRemoteAddressRanges(n.getCollectionOfObjectValues(IPv4Range::createFromDiscriminatorValue)); });
        deserializerMap.put("remotePortRanges", (n) -> { this.setRemotePortRanges(n.getCollectionOfObjectValues(NumberRange::createFromDiscriminatorValue)); });
        deserializerMap.put("routingPolicyType", (n) -> { this.setRoutingPolicyType(n.getEnumValue(VpnTrafficRuleRoutingPolicyType::forValue)); });
        deserializerMap.put("vpnTrafficDirection", (n) -> { this.setVpnTrafficDirection(n.getEnumValue(VpnTrafficDirection::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the localAddressRanges property value. Local address range. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<IPv4Range>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IPv4Range> getLocalAddressRanges() {
        return this.backingStore.get("localAddressRanges");
    }
    /**
     * Gets the localPortRanges property value. Local port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<NumberRange>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NumberRange> getLocalPortRanges() {
        return this.backingStore.get("localPortRanges");
    }
    /**
     * Gets the name property value. Name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
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
     * Gets the protocols property value. Protocols (0-255). Valid values 0 to 255
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getProtocols() {
        return this.backingStore.get("protocols");
    }
    /**
     * Gets the remoteAddressRanges property value. Remote address range. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<IPv4Range>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IPv4Range> getRemoteAddressRanges() {
        return this.backingStore.get("remoteAddressRanges");
    }
    /**
     * Gets the remotePortRanges property value. Remote port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<NumberRange>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NumberRange> getRemotePortRanges() {
        return this.backingStore.get("remotePortRanges");
    }
    /**
     * Gets the routingPolicyType property value. Specifies the routing policy for a VPN traffic rule.
     * @return a {@link VpnTrafficRuleRoutingPolicyType}
     */
    @jakarta.annotation.Nullable
    public VpnTrafficRuleRoutingPolicyType getRoutingPolicyType() {
        return this.backingStore.get("routingPolicyType");
    }
    /**
     * Gets the vpnTrafficDirection property value. Specify whether the rule applies to inbound traffic or outbound traffic.
     * @return a {@link VpnTrafficDirection}
     */
    @jakarta.annotation.Nullable
    public VpnTrafficDirection getVpnTrafficDirection() {
        return this.backingStore.get("vpnTrafficDirection");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the appId property value. App identifier, if this traffic rule is triggered by an app.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the appType property value. Indicates the type of app that a VPN traffic rule is associated with.
     * @param value Value to set for the appType property.
     */
    public void setAppType(@jakarta.annotation.Nullable final VpnTrafficRuleAppType value) {
        this.backingStore.set("appType", value);
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
     * Sets the claims property value. Claims associated with this traffic rule.
     * @param value Value to set for the claims property.
     */
    public void setClaims(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("claims", value);
    }
    /**
     * Sets the localAddressRanges property value. Local address range. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the localAddressRanges property.
     */
    public void setLocalAddressRanges(@jakarta.annotation.Nullable final java.util.List<IPv4Range> value) {
        this.backingStore.set("localAddressRanges", value);
    }
    /**
     * Sets the localPortRanges property value. Local port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     * @param value Value to set for the localPortRanges property.
     */
    public void setLocalPortRanges(@jakarta.annotation.Nullable final java.util.List<NumberRange> value) {
        this.backingStore.set("localPortRanges", value);
    }
    /**
     * Sets the name property value. Name.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the protocols property value. Protocols (0-255). Valid values 0 to 255
     * @param value Value to set for the protocols property.
     */
    public void setProtocols(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("protocols", value);
    }
    /**
     * Sets the remoteAddressRanges property value. Remote address range. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the remoteAddressRanges property.
     */
    public void setRemoteAddressRanges(@jakarta.annotation.Nullable final java.util.List<IPv4Range> value) {
        this.backingStore.set("remoteAddressRanges", value);
    }
    /**
     * Sets the remotePortRanges property value. Remote port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     * @param value Value to set for the remotePortRanges property.
     */
    public void setRemotePortRanges(@jakarta.annotation.Nullable final java.util.List<NumberRange> value) {
        this.backingStore.set("remotePortRanges", value);
    }
    /**
     * Sets the routingPolicyType property value. Specifies the routing policy for a VPN traffic rule.
     * @param value Value to set for the routingPolicyType property.
     */
    public void setRoutingPolicyType(@jakarta.annotation.Nullable final VpnTrafficRuleRoutingPolicyType value) {
        this.backingStore.set("routingPolicyType", value);
    }
    /**
     * Sets the vpnTrafficDirection property value. Specify whether the rule applies to inbound traffic or outbound traffic.
     * @param value Value to set for the vpnTrafficDirection property.
     */
    public void setVpnTrafficDirection(@jakarta.annotation.Nullable final VpnTrafficDirection value) {
        this.backingStore.set("vpnTrafficDirection", value);
    }
}
