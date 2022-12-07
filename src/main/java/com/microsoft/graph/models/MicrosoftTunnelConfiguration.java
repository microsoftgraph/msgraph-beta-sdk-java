package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Entity that represents a collection of Microsoft Tunnel settings */
public class MicrosoftTunnelConfiguration extends Entity implements Parsable {
    /** Additional settings that may be applied to the server */
    private java.util.List<KeyValuePair> _advancedSettings;
    /** The Default Domain appendix that will be used by the clients */
    private String _defaultDomainSuffix;
    /** The configuration's description (optional) */
    private String _description;
    /** When DisableUdpConnections is set, the clients and VPN server will not use DTLS connections to transfer data. */
    private Boolean _disableUdpConnections;
    /** The display name for the server configuration. This property is required when a server is created. */
    private String _displayName;
    /** The DNS servers that will be used by the clients */
    private java.util.List<String> _dnsServers;
    /** When the configuration was last updated */
    private OffsetDateTime _lastUpdateDateTime;
    /** The port that both TCP and UPD will listen over on the server */
    private Integer _listenPort;
    /** The subnet that will be used to allocate virtual address for the clients */
    private String _network;
    /** List of Scope Tags for this Entity instance */
    private java.util.List<String> _roleScopeTagIds;
    /** Subsets of the routes that will not be routed by the server */
    private java.util.List<String> _routeExcludes;
    /** The routes that will be routed by the server */
    private java.util.List<String> _routeIncludes;
    /** Subsets of the routes that will not be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteExcludes'. */
    private java.util.List<String> _routesExclude;
    /** The routes that will be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteIncludes'. */
    private java.util.List<String> _routesInclude;
    /** The domains that will be resolved using the provided dns servers */
    private java.util.List<String> _splitDNS;
    /**
     * Instantiates a new microsoftTunnelConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftTunnelConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a microsoftTunnelConfiguration
     */
    @javax.annotation.Nonnull
    public static MicrosoftTunnelConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftTunnelConfiguration();
    }
    /**
     * Gets the advancedSettings property value. Additional settings that may be applied to the server
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getAdvancedSettings() {
        return this._advancedSettings;
    }
    /**
     * Gets the defaultDomainSuffix property value. The Default Domain appendix that will be used by the clients
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultDomainSuffix() {
        return this._defaultDomainSuffix;
    }
    /**
     * Gets the description property value. The configuration's description (optional)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the disableUdpConnections property value. When DisableUdpConnections is set, the clients and VPN server will not use DTLS connections to transfer data.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableUdpConnections() {
        return this._disableUdpConnections;
    }
    /**
     * Gets the displayName property value. The display name for the server configuration. This property is required when a server is created.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the dnsServers property value. The DNS servers that will be used by the clients
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDnsServers() {
        return this._dnsServers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
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
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdateDateTime() {
        return this._lastUpdateDateTime;
    }
    /**
     * Gets the listenPort property value. The port that both TCP and UPD will listen over on the server
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getListenPort() {
        return this._listenPort;
    }
    /**
     * Gets the network property value. The subnet that will be used to allocate virtual address for the clients
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetwork() {
        return this._network;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the routeExcludes property value. Subsets of the routes that will not be routed by the server
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRouteExcludes() {
        return this._routeExcludes;
    }
    /**
     * Gets the routeIncludes property value. The routes that will be routed by the server
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRouteIncludes() {
        return this._routeIncludes;
    }
    /**
     * Gets the routesExclude property value. Subsets of the routes that will not be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteExcludes'.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoutesExclude() {
        return this._routesExclude;
    }
    /**
     * Gets the routesInclude property value. The routes that will be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteIncludes'.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoutesInclude() {
        return this._routesInclude;
    }
    /**
     * Gets the splitDNS property value. The domains that will be resolved using the provided dns servers
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSplitDNS() {
        return this._splitDNS;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    @javax.annotation.Nonnull
    public void setAdvancedSettings(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._advancedSettings = value;
    }
    /**
     * Sets the defaultDomainSuffix property value. The Default Domain appendix that will be used by the clients
     * @param value Value to set for the defaultDomainSuffix property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultDomainSuffix(@javax.annotation.Nullable final String value) {
        this._defaultDomainSuffix = value;
    }
    /**
     * Sets the description property value. The configuration's description (optional)
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the disableUdpConnections property value. When DisableUdpConnections is set, the clients and VPN server will not use DTLS connections to transfer data.
     * @param value Value to set for the disableUdpConnections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableUdpConnections(@javax.annotation.Nullable final Boolean value) {
        this._disableUdpConnections = value;
    }
    /**
     * Sets the displayName property value. The display name for the server configuration. This property is required when a server is created.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the dnsServers property value. The DNS servers that will be used by the clients
     * @param value Value to set for the dnsServers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDnsServers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._dnsServers = value;
    }
    /**
     * Sets the lastUpdateDateTime property value. When the configuration was last updated
     * @param value Value to set for the lastUpdateDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdateDateTime = value;
    }
    /**
     * Sets the listenPort property value. The port that both TCP and UPD will listen over on the server
     * @param value Value to set for the listenPort property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setListenPort(@javax.annotation.Nullable final Integer value) {
        this._listenPort = value;
    }
    /**
     * Sets the network property value. The subnet that will be used to allocate virtual address for the clients
     * @param value Value to set for the network property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetwork(@javax.annotation.Nullable final String value) {
        this._network = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the routeExcludes property value. Subsets of the routes that will not be routed by the server
     * @param value Value to set for the routeExcludes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRouteExcludes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._routeExcludes = value;
    }
    /**
     * Sets the routeIncludes property value. The routes that will be routed by the server
     * @param value Value to set for the routeIncludes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRouteIncludes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._routeIncludes = value;
    }
    /**
     * Sets the routesExclude property value. Subsets of the routes that will not be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteExcludes'.
     * @param value Value to set for the routesExclude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoutesExclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this._routesExclude = value;
    }
    /**
     * Sets the routesInclude property value. The routes that will be routed by the server. This property is going to be deprecated with the option of using the new property, 'RouteIncludes'.
     * @param value Value to set for the routesInclude property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoutesInclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this._routesInclude = value;
    }
    /**
     * Sets the splitDNS property value. The domains that will be resolved using the provided dns servers
     * @param value Value to set for the splitDNS property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSplitDNS(@javax.annotation.Nullable final java.util.List<String> value) {
        this._splitDNS = value;
    }
}
