package com.microsoft.graph.models;

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
 * VPN On-Demand Rule definition.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VpnOnDemandRule implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new VpnOnDemandRule and sets the default values.
     */
    public VpnOnDemandRule() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VpnOnDemandRule
     */
    @jakarta.annotation.Nonnull
    public static VpnOnDemandRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpnOnDemandRule();
    }
    /**
     * Gets the action property value. VPN On-Demand Rule Connection Action.
     * @return a VpnOnDemandRuleConnectionAction
     */
    @jakarta.annotation.Nullable
    public VpnOnDemandRuleConnectionAction getAction() {
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
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the dnsSearchDomains property value. DNS Search Domains.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDnsSearchDomains() {
        return this.backingStore.get("dnsSearchDomains");
    }
    /**
     * Gets the dnsServerAddressMatch property value. DNS Search Server Address.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDnsServerAddressMatch() {
        return this.backingStore.get("dnsServerAddressMatch");
    }
    /**
     * Gets the domainAction property value. VPN On-Demand Rule Connection Domain Action.
     * @return a VpnOnDemandRuleConnectionDomainAction
     */
    @jakarta.annotation.Nullable
    public VpnOnDemandRuleConnectionDomainAction getDomainAction() {
        return this.backingStore.get("domainAction");
    }
    /**
     * Gets the domains property value. Domains (Only applicable when Action is evaluate connection).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDomains() {
        return this.backingStore.get("domains");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(VpnOnDemandRuleConnectionAction::forValue)); });
        deserializerMap.put("dnsSearchDomains", (n) -> { this.setDnsSearchDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("dnsServerAddressMatch", (n) -> { this.setDnsServerAddressMatch(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("domainAction", (n) -> { this.setDomainAction(n.getEnumValue(VpnOnDemandRuleConnectionDomainAction::forValue)); });
        deserializerMap.put("domains", (n) -> { this.setDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("interfaceTypeMatch", (n) -> { this.setInterfaceTypeMatch(n.getEnumValue(VpnOnDemandRuleInterfaceTypeMatch::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("probeRequiredUrl", (n) -> { this.setProbeRequiredUrl(n.getStringValue()); });
        deserializerMap.put("probeUrl", (n) -> { this.setProbeUrl(n.getStringValue()); });
        deserializerMap.put("ssids", (n) -> { this.setSsids(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the interfaceTypeMatch property value. VPN On-Demand Rule Connection network interface type.
     * @return a VpnOnDemandRuleInterfaceTypeMatch
     */
    @jakarta.annotation.Nullable
    public VpnOnDemandRuleInterfaceTypeMatch getInterfaceTypeMatch() {
        return this.backingStore.get("interfaceTypeMatch");
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
     * Gets the probeRequiredUrl property value. Probe Required Url (Only applicable when Action is evaluate connection and DomainAction is connect if needed).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProbeRequiredUrl() {
        return this.backingStore.get("probeRequiredUrl");
    }
    /**
     * Gets the probeUrl property value. A URL to probe. If this URL is successfully fetched (returning a 200 HTTP status code) without redirection, this rule matches.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProbeUrl() {
        return this.backingStore.get("probeUrl");
    }
    /**
     * Gets the ssids property value. Network Service Set Identifiers (SSIDs).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSsids() {
        return this.backingStore.get("ssids");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("action", this.getAction());
        writer.writeCollectionOfPrimitiveValues("dnsSearchDomains", this.getDnsSearchDomains());
        writer.writeCollectionOfPrimitiveValues("dnsServerAddressMatch", this.getDnsServerAddressMatch());
        writer.writeEnumValue("domainAction", this.getDomainAction());
        writer.writeCollectionOfPrimitiveValues("domains", this.getDomains());
        writer.writeEnumValue("interfaceTypeMatch", this.getInterfaceTypeMatch());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("probeRequiredUrl", this.getProbeRequiredUrl());
        writer.writeStringValue("probeUrl", this.getProbeUrl());
        writer.writeCollectionOfPrimitiveValues("ssids", this.getSsids());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. VPN On-Demand Rule Connection Action.
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final VpnOnDemandRuleConnectionAction value) {
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the dnsSearchDomains property value. DNS Search Domains.
     * @param value Value to set for the dnsSearchDomains property.
     */
    public void setDnsSearchDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("dnsSearchDomains", value);
    }
    /**
     * Sets the dnsServerAddressMatch property value. DNS Search Server Address.
     * @param value Value to set for the dnsServerAddressMatch property.
     */
    public void setDnsServerAddressMatch(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("dnsServerAddressMatch", value);
    }
    /**
     * Sets the domainAction property value. VPN On-Demand Rule Connection Domain Action.
     * @param value Value to set for the domainAction property.
     */
    public void setDomainAction(@jakarta.annotation.Nullable final VpnOnDemandRuleConnectionDomainAction value) {
        this.backingStore.set("domainAction", value);
    }
    /**
     * Sets the domains property value. Domains (Only applicable when Action is evaluate connection).
     * @param value Value to set for the domains property.
     */
    public void setDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("domains", value);
    }
    /**
     * Sets the interfaceTypeMatch property value. VPN On-Demand Rule Connection network interface type.
     * @param value Value to set for the interfaceTypeMatch property.
     */
    public void setInterfaceTypeMatch(@jakarta.annotation.Nullable final VpnOnDemandRuleInterfaceTypeMatch value) {
        this.backingStore.set("interfaceTypeMatch", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the probeRequiredUrl property value. Probe Required Url (Only applicable when Action is evaluate connection and DomainAction is connect if needed).
     * @param value Value to set for the probeRequiredUrl property.
     */
    public void setProbeRequiredUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("probeRequiredUrl", value);
    }
    /**
     * Sets the probeUrl property value. A URL to probe. If this URL is successfully fetched (returning a 200 HTTP status code) without redirection, this rule matches.
     * @param value Value to set for the probeUrl property.
     */
    public void setProbeUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("probeUrl", value);
    }
    /**
     * Sets the ssids property value. Network Service Set Identifiers (SSIDs).
     * @param value Value to set for the ssids property.
     */
    public void setSsids(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ssids", value);
    }
}
