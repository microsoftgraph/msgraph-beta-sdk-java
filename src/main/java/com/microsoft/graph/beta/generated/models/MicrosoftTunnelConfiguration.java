package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents a collection of Microsoft Tunnel settings
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftTunnelConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MicrosoftTunnelConfiguration} and sets the default values.
     */
    public MicrosoftTunnelConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MicrosoftTunnelConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftTunnelConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftTunnelConfiguration();
    }
    /**
     * Gets the advancedSettings property value. Additional settings that may be applied to the server
     * @return a {@link java.util.List<KeyValuePair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getAdvancedSettings() {
        return this.backingStore.get("advancedSettings");
    }
    /**
     * Gets the defaultDomainSuffix property value. The Default Domain appendix that will be used by the clients
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultDomainSuffix() {
        return this.backingStore.get("defaultDomainSuffix");
    }
    /**
     * Gets the description property value. The configuration's description (optional)
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the disableUdpConnections property value. When DisableUdpConnections is set, the clients and VPN server will not use DTLS connections to transfer data.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableUdpConnections() {
        return this.backingStore.get("disableUdpConnections");
    }
    /**
     * Gets the displayName property value. The display name for the server configuration. This property is required when a server is created.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the dnsServers property value. The DNS servers that will be used by the clients
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDnsServers() {
        return this.backingStore.get("dnsServers");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("advancedSettings", (n) -> { this.setAdvancedSettings(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultDomainSuffix", (n) -> { this.setDefaultDomainSuffix(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("disableUdpConnections", (n) -> { this.setDisableUdpConnections(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("dnsServers", (n) -> { this.setDnsServers(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("ipv6Network", (n) -> { this.setIpv6Network(n.getStringValue()); });
        deserializerMap.put("lastUpdateDateTime", (n) -> { this.setLastUpdateDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("listenPort", (n) -> { this.setListenPort(n.getIntegerValue()); });
        deserializerMap.put("network", (n) -> { this.setNetwork(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("routeExcludes", (n) -> { this.setRouteExcludes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("routeIncludes", (n) -> { this.setRouteIncludes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("routesExclude", (n) -> { this.setRoutesExclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("routesInclude", (n) -> { this.setRoutesInclude(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("splitDNS", (n) -> { this.setSplitDNS(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the ipv6Network property value. The IPv6 subnet that will be used to allocate virtual address for the clients
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIpv6Network() {
        return this.backingStore.get("ipv6Network");
    }
    /**
     * Gets the lastUpdateDateTime property value. When the configuration was last updated
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this.backingStore.get("lastUpdateDateTime");
    }
    /**
     * Gets the listenPort property value. The port that both TCP and UPD will listen over on the server
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getListenPort() {
        return this.backingStore.get("listenPort");
    }
    /**
     * Gets the network property value. The IPv4 subnet that will be used to allocate virtual address for the clients
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNetwork() {
        return this.backingStore.get("network");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the routeExcludes property value. Subsets of the routes that will not be routed by the server
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRouteExcludes() {
        return this.backingStore.get("routeExcludes");
    }
    /**
     * Gets the routeIncludes property value. The routes that will be routed by the server
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRouteIncludes() {
        return this.backingStore.get("routeIncludes");
    }
    /**
     * Gets the routesExclude property value. Subsets of the routes that will not be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteExcludes'.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoutesExclude() {
        return this.backingStore.get("routesExclude");
    }
    /**
     * Gets the routesInclude property value. The routes that will be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteIncludes'.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoutesInclude() {
        return this.backingStore.get("routesInclude");
    }
    /**
     * Gets the splitDNS property value. The domains that will be resolved using the provided dns servers
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSplitDNS() {
        return this.backingStore.get("splitDNS");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("advancedSettings", this.getAdvancedSettings());
        writer.writeStringValue("defaultDomainSuffix", this.getDefaultDomainSuffix());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("disableUdpConnections", this.getDisableUdpConnections());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("dnsServers", this.getDnsServers());
        writer.writeStringValue("ipv6Network", this.getIpv6Network());
        writer.writeOffsetDateTimeValue("lastUpdateDateTime", this.getLastUpdateDateTime());
        writer.writeIntegerValue("listenPort", this.getListenPort());
        writer.writeStringValue("network", this.getNetwork());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeCollectionOfPrimitiveValues("routeExcludes", this.getRouteExcludes());
        writer.writeCollectionOfPrimitiveValues("routeIncludes", this.getRouteIncludes());
        writer.writeCollectionOfPrimitiveValues("routesExclude", this.getRoutesExclude());
        writer.writeCollectionOfPrimitiveValues("routesInclude", this.getRoutesInclude());
        writer.writeCollectionOfPrimitiveValues("splitDNS", this.getSplitDNS());
    }
    /**
     * Sets the advancedSettings property value. Additional settings that may be applied to the server
     * @param value Value to set for the advancedSettings property.
     */
    public void setAdvancedSettings(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("advancedSettings", value);
    }
    /**
     * Sets the defaultDomainSuffix property value. The Default Domain appendix that will be used by the clients
     * @param value Value to set for the defaultDomainSuffix property.
     */
    public void setDefaultDomainSuffix(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultDomainSuffix", value);
    }
    /**
     * Sets the description property value. The configuration's description (optional)
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the disableUdpConnections property value. When DisableUdpConnections is set, the clients and VPN server will not use DTLS connections to transfer data.
     * @param value Value to set for the disableUdpConnections property.
     */
    public void setDisableUdpConnections(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableUdpConnections", value);
    }
    /**
     * Sets the displayName property value. The display name for the server configuration. This property is required when a server is created.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the dnsServers property value. The DNS servers that will be used by the clients
     * @param value Value to set for the dnsServers property.
     */
    public void setDnsServers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("dnsServers", value);
    }
    /**
     * Sets the ipv6Network property value. The IPv6 subnet that will be used to allocate virtual address for the clients
     * @param value Value to set for the ipv6Network property.
     */
    public void setIpv6Network(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipv6Network", value);
    }
    /**
     * Sets the lastUpdateDateTime property value. When the configuration was last updated
     * @param value Value to set for the lastUpdateDateTime property.
     */
    public void setLastUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdateDateTime", value);
    }
    /**
     * Sets the listenPort property value. The port that both TCP and UPD will listen over on the server
     * @param value Value to set for the listenPort property.
     */
    public void setListenPort(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("listenPort", value);
    }
    /**
     * Sets the network property value. The IPv4 subnet that will be used to allocate virtual address for the clients
     * @param value Value to set for the network property.
     */
    public void setNetwork(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("network", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the routeExcludes property value. Subsets of the routes that will not be routed by the server
     * @param value Value to set for the routeExcludes property.
     */
    public void setRouteExcludes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("routeExcludes", value);
    }
    /**
     * Sets the routeIncludes property value. The routes that will be routed by the server
     * @param value Value to set for the routeIncludes property.
     */
    public void setRouteIncludes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("routeIncludes", value);
    }
    /**
     * Sets the routesExclude property value. Subsets of the routes that will not be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteExcludes'.
     * @param value Value to set for the routesExclude property.
     */
    public void setRoutesExclude(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("routesExclude", value);
    }
    /**
     * Sets the routesInclude property value. The routes that will be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteIncludes'.
     * @param value Value to set for the routesInclude property.
     */
    public void setRoutesInclude(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("routesInclude", value);
    }
    /**
     * Sets the splitDNS property value. The domains that will be resolved using the provided dns servers
     * @param value Value to set for the splitDNS property.
     */
    public void setSplitDNS(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("splitDNS", value);
    }
}
