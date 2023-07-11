package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * VPN On-Demand Rule definition.
 */
public class VpnOnDemandRule implements AdditionalDataHolder, Parsable {
    /**
     * VPN On-Demand Rule Connection Action.
     */
    private VpnOnDemandRuleConnectionAction action;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * DNS Search Domains.
     */
    private java.util.List<String> dnsSearchDomains;
    /**
     * DNS Search Server Address.
     */
    private java.util.List<String> dnsServerAddressMatch;
    /**
     * VPN On-Demand Rule Connection Domain Action.
     */
    private VpnOnDemandRuleConnectionDomainAction domainAction;
    /**
     * Domains (Only applicable when Action is evaluate connection).
     */
    private java.util.List<String> domains;
    /**
     * VPN On-Demand Rule Connection network interface type.
     */
    private VpnOnDemandRuleInterfaceTypeMatch interfaceTypeMatch;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Probe Required Url (Only applicable when Action is evaluate connection and DomainAction is connect if needed).
     */
    private String probeRequiredUrl;
    /**
     * A URL to probe. If this URL is successfully fetched (returning a 200 HTTP status code) without redirection, this rule matches.
     */
    private String probeUrl;
    /**
     * Network Service Set Identifiers (SSIDs).
     */
    private java.util.List<String> ssids;
    /**
     * Instantiates a new vpnOnDemandRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VpnOnDemandRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vpnOnDemandRule
     */
    @javax.annotation.Nonnull
    public static VpnOnDemandRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpnOnDemandRule();
    }
    /**
     * Gets the action property value. VPN On-Demand Rule Connection Action.
     * @return a vpnOnDemandRuleConnectionAction
     */
    @javax.annotation.Nullable
    public VpnOnDemandRuleConnectionAction getAction() {
        return this.action;
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
     * Gets the dnsSearchDomains property value. DNS Search Domains.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDnsSearchDomains() {
        return this.dnsSearchDomains;
    }
    /**
     * Gets the dnsServerAddressMatch property value. DNS Search Server Address.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDnsServerAddressMatch() {
        return this.dnsServerAddressMatch;
    }
    /**
     * Gets the domainAction property value. VPN On-Demand Rule Connection Domain Action.
     * @return a vpnOnDemandRuleConnectionDomainAction
     */
    @javax.annotation.Nullable
    public VpnOnDemandRuleConnectionDomainAction getDomainAction() {
        return this.domainAction;
    }
    /**
     * Gets the domains property value. Domains (Only applicable when Action is evaluate connection).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDomains() {
        return this.domains;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("action", (n) -> { this.setAction(n.getEnumValue(VpnOnDemandRuleConnectionAction.class)); });
        deserializerMap.put("dnsSearchDomains", (n) -> { this.setDnsSearchDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("dnsServerAddressMatch", (n) -> { this.setDnsServerAddressMatch(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("domainAction", (n) -> { this.setDomainAction(n.getEnumValue(VpnOnDemandRuleConnectionDomainAction.class)); });
        deserializerMap.put("domains", (n) -> { this.setDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("interfaceTypeMatch", (n) -> { this.setInterfaceTypeMatch(n.getEnumValue(VpnOnDemandRuleInterfaceTypeMatch.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("probeRequiredUrl", (n) -> { this.setProbeRequiredUrl(n.getStringValue()); });
        deserializerMap.put("probeUrl", (n) -> { this.setProbeUrl(n.getStringValue()); });
        deserializerMap.put("ssids", (n) -> { this.setSsids(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the interfaceTypeMatch property value. VPN On-Demand Rule Connection network interface type.
     * @return a vpnOnDemandRuleInterfaceTypeMatch
     */
    @javax.annotation.Nullable
    public VpnOnDemandRuleInterfaceTypeMatch getInterfaceTypeMatch() {
        return this.interfaceTypeMatch;
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
     * Gets the probeRequiredUrl property value. Probe Required Url (Only applicable when Action is evaluate connection and DomainAction is connect if needed).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProbeRequiredUrl() {
        return this.probeRequiredUrl;
    }
    /**
     * Gets the probeUrl property value. A URL to probe. If this URL is successfully fetched (returning a 200 HTTP status code) without redirection, this rule matches.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProbeUrl() {
        return this.probeUrl;
    }
    /**
     * Gets the ssids property value. Network Service Set Identifiers (SSIDs).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSsids() {
        return this.ssids;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAction(@javax.annotation.Nullable final VpnOnDemandRuleConnectionAction value) {
        this.action = value;
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
     * Sets the dnsSearchDomains property value. DNS Search Domains.
     * @param value Value to set for the dnsSearchDomains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDnsSearchDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this.dnsSearchDomains = value;
    }
    /**
     * Sets the dnsServerAddressMatch property value. DNS Search Server Address.
     * @param value Value to set for the dnsServerAddressMatch property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDnsServerAddressMatch(@javax.annotation.Nullable final java.util.List<String> value) {
        this.dnsServerAddressMatch = value;
    }
    /**
     * Sets the domainAction property value. VPN On-Demand Rule Connection Domain Action.
     * @param value Value to set for the domainAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainAction(@javax.annotation.Nullable final VpnOnDemandRuleConnectionDomainAction value) {
        this.domainAction = value;
    }
    /**
     * Sets the domains property value. Domains (Only applicable when Action is evaluate connection).
     * @param value Value to set for the domains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomains(@javax.annotation.Nullable final java.util.List<String> value) {
        this.domains = value;
    }
    /**
     * Sets the interfaceTypeMatch property value. VPN On-Demand Rule Connection network interface type.
     * @param value Value to set for the interfaceTypeMatch property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInterfaceTypeMatch(@javax.annotation.Nullable final VpnOnDemandRuleInterfaceTypeMatch value) {
        this.interfaceTypeMatch = value;
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
     * Sets the probeRequiredUrl property value. Probe Required Url (Only applicable when Action is evaluate connection and DomainAction is connect if needed).
     * @param value Value to set for the probeRequiredUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProbeRequiredUrl(@javax.annotation.Nullable final String value) {
        this.probeRequiredUrl = value;
    }
    /**
     * Sets the probeUrl property value. A URL to probe. If this URL is successfully fetched (returning a 200 HTTP status code) without redirection, this rule matches.
     * @param value Value to set for the probeUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProbeUrl(@javax.annotation.Nullable final String value) {
        this.probeUrl = value;
    }
    /**
     * Sets the ssids property value. Network Service Set Identifiers (SSIDs).
     * @param value Value to set for the ssids property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSsids(@javax.annotation.Nullable final java.util.List<String> value) {
        this.ssids = value;
    }
}
