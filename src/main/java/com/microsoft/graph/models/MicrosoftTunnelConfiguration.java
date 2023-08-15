package com.microsoft.graph.models;

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
public class MicrosoftTunnelConfiguration extends Entity implements Parsable {
    /**
     * Additional settings that may be applied to the server
     */
    private java.util.List<KeyValuePair> advancedSettings;
    /**
     * The Default Domain appendix that will be used by the clients
     */
    private String defaultDomainSuffix;
    /**
     * The configuration's description (optional)
     */
    private String description;
    /**
     * When DisableUdpConnections is set, the clients and VPN server will not use DTLS connections to transfer data.
     */
    private Boolean disableUdpConnections;
    /**
     * The display name for the server configuration. This property is required when a server is created.
     */
    private String displayName;
    /**
     * The DNS servers that will be used by the clients
     */
    private java.util.List<String> dnsServers;
    /**
     * When the configuration was last updated
     */
    private OffsetDateTime lastUpdateDateTime;
    /**
     * The port that both TCP and UPD will listen over on the server
     */
    private Integer listenPort;
    /**
     * The subnet that will be used to allocate virtual address for the clients
     */
    private String network;
    /**
     * List of Scope Tags for this Entity instance
     */
    private java.util.List<String> roleScopeTagIds;
    /**
     * Subsets of the routes that will not be routed by the server
     */
    private java.util.List<String> routeExcludes;
    /**
     * The routes that will be routed by the server
     */
    private java.util.List<String> routeIncludes;
    /**
     * Subsets of the routes that will not be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteExcludes'.
     */
    private java.util.List<String> routesExclude;
    /**
     * The routes that will be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteIncludes'.
     */
    private java.util.List<String> routesInclude;
    /**
     * The domains that will be resolved using the provided dns servers
     */
    private java.util.List<String> splitDNS;
    /**
     * Instantiates a new microsoftTunnelConfiguration and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MicrosoftTunnelConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a microsoftTunnelConfiguration
     */
    @jakarta.annotation.Nonnull
    public static MicrosoftTunnelConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftTunnelConfiguration();
    }
    /**
     * Gets the advancedSettings property value. Additional settings that may be applied to the server
     * @return a keyValuePair
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getAdvancedSettings() {
        return this.advancedSettings;
    }
    /**
     * Gets the defaultDomainSuffix property value. The Default Domain appendix that will be used by the clients
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDefaultDomainSuffix() {
        return this.defaultDomainSuffix;
    }
    /**
     * Gets the description property value. The configuration's description (optional)
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the disableUdpConnections property value. When DisableUdpConnections is set, the clients and VPN server will not use DTLS connections to transfer data.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableUdpConnections() {
        return this.disableUdpConnections;
    }
    /**
     * Gets the displayName property value. The display name for the server configuration. This property is required when a server is created.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the dnsServers property value. The DNS servers that will be used by the clients
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDnsServers() {
        return this.dnsServers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * Gets the lastUpdateDateTime property value. When the configuration was last updated
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this.lastUpdateDateTime;
    }
    /**
     * Gets the listenPort property value. The port that both TCP and UPD will listen over on the server
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getListenPort() {
        return this.listenPort;
    }
    /**
     * Gets the network property value. The subnet that will be used to allocate virtual address for the clients
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNetwork() {
        return this.network;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the routeExcludes property value. Subsets of the routes that will not be routed by the server
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRouteExcludes() {
        return this.routeExcludes;
    }
    /**
     * Gets the routeIncludes property value. The routes that will be routed by the server
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRouteIncludes() {
        return this.routeIncludes;
    }
    /**
     * Gets the routesExclude property value. Subsets of the routes that will not be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteExcludes'.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoutesExclude() {
        return this.routesExclude;
    }
    /**
     * Gets the routesInclude property value. The routes that will be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteIncludes'.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoutesInclude() {
        return this.routesInclude;
    }
    /**
     * Gets the splitDNS property value. The domains that will be resolved using the provided dns servers
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSplitDNS() {
        return this.splitDNS;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("advancedSettings", this.getAdvancedSettings());
        writer.writeStringValue("defaultDomainSuffix", this.getDefaultDomainSuffix());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("disableUdpConnections", this.getDisableUdpConnections());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("dnsServers", this.getDnsServers());
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdvancedSettings(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.advancedSettings = value;
    }
    /**
     * Sets the defaultDomainSuffix property value. The Default Domain appendix that will be used by the clients
     * @param value Value to set for the defaultDomainSuffix property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDefaultDomainSuffix(@jakarta.annotation.Nullable final String value) {
        this.defaultDomainSuffix = value;
    }
    /**
     * Sets the description property value. The configuration's description (optional)
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the disableUdpConnections property value. When DisableUdpConnections is set, the clients and VPN server will not use DTLS connections to transfer data.
     * @param value Value to set for the disableUdpConnections property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisableUdpConnections(@jakarta.annotation.Nullable final Boolean value) {
        this.disableUdpConnections = value;
    }
    /**
     * Sets the displayName property value. The display name for the server configuration. This property is required when a server is created.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the dnsServers property value. The DNS servers that will be used by the clients
     * @param value Value to set for the dnsServers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDnsServers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.dnsServers = value;
    }
    /**
     * Sets the lastUpdateDateTime property value. When the configuration was last updated
     * @param value Value to set for the lastUpdateDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastUpdateDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdateDateTime = value;
    }
    /**
     * Sets the listenPort property value. The port that both TCP and UPD will listen over on the server
     * @param value Value to set for the listenPort property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setListenPort(@jakarta.annotation.Nullable final Integer value) {
        this.listenPort = value;
    }
    /**
     * Sets the network property value. The subnet that will be used to allocate virtual address for the clients
     * @param value Value to set for the network property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNetwork(@jakarta.annotation.Nullable final String value) {
        this.network = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the routeExcludes property value. Subsets of the routes that will not be routed by the server
     * @param value Value to set for the routeExcludes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRouteExcludes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.routeExcludes = value;
    }
    /**
     * Sets the routeIncludes property value. The routes that will be routed by the server
     * @param value Value to set for the routeIncludes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRouteIncludes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.routeIncludes = value;
    }
    /**
     * Sets the routesExclude property value. Subsets of the routes that will not be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteExcludes'.
     * @param value Value to set for the routesExclude property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoutesExclude(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.routesExclude = value;
    }
    /**
     * Sets the routesInclude property value. The routes that will be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteIncludes'.
     * @param value Value to set for the routesInclude property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRoutesInclude(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.routesInclude = value;
    }
    /**
     * Sets the splitDNS property value. The domains that will be resolved using the provided dns servers
     * @param value Value to set for the splitDNS property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSplitDNS(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.splitDNS = value;
    }
}
