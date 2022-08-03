package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftTunnelConfiguration extends Entity implements Parsable {
    /** Additional settings that may be applied to the server */
    private java.util.List<KeyValuePair> _advancedSettings;
    /** The Default Domain appendix that will be used by the clients */
    private String _defaultDomainSuffix;
    /** The MicrosoftTunnelConfiguration's description */
    private String _description;
    /** When DisableUdpConnections is set, the clients and VPN server will not use DTLS connections to tansfer data. */
    private Boolean _disableUdpConnections;
    /** The MicrosoftTunnelConfiguration's display name */
    private String _displayName;
    /** The DNS servers that will be used by the clients */
    private java.util.List<String> _dnsServers;
    /** When the MicrosoftTunnelConfiguration was last updated */
    private OffsetDateTime _lastUpdateDateTime;
    /** The port that both TCP and UPD will listen over on the server */
    private Integer _listenPort;
    /** The subnet that will be used to allocate virtual address for the clients */
    private String _network;
    /** List of Scope Tags for this Entity instance. */
    private java.util.List<String> _roleScopeTagIds;
    /** Subsets of the routes that will not be routed by the server */
    private java.util.List<String> _routesExclude;
    /** The routs that will be routed by the server */
    private java.util.List<String> _routesInclude;
    /** The domains that will be resolved using the provided dns servers */
    private java.util.List<String> _splitDNS;
    /**
     * Instantiates a new MicrosoftTunnelConfiguration and sets the default values.
     * @return a void
     */
    public MicrosoftTunnelConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.microsoftTunnelConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftTunnelConfiguration
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
     * Gets the description property value. The MicrosoftTunnelConfiguration's description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the disableUdpConnections property value. When DisableUdpConnections is set, the clients and VPN server will not use DTLS connections to tansfer data.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableUdpConnections() {
        return this._disableUdpConnections;
    }
    /**
     * Gets the displayName property value. The MicrosoftTunnelConfiguration's display name
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
        final MicrosoftTunnelConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("advancedSettings", (n) -> { currentObject.setAdvancedSettings(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("defaultDomainSuffix", (n) -> { currentObject.setDefaultDomainSuffix(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("disableUdpConnections", (n) -> { currentObject.setDisableUdpConnections(n.getBooleanValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("dnsServers", (n) -> { currentObject.setDnsServers(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("lastUpdateDateTime", (n) -> { currentObject.setLastUpdateDateTime(n.getOffsetDateTimeValue()); });
            this.put("listenPort", (n) -> { currentObject.setListenPort(n.getIntegerValue()); });
            this.put("network", (n) -> { currentObject.setNetwork(n.getStringValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("routesExclude", (n) -> { currentObject.setRoutesExclude(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("routesInclude", (n) -> { currentObject.setRoutesInclude(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("splitDNS", (n) -> { currentObject.setSplitDNS(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the lastUpdateDateTime property value. When the MicrosoftTunnelConfiguration was last updated
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
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the routesExclude property value. Subsets of the routes that will not be routed by the server
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoutesExclude() {
        return this._routesExclude;
    }
    /**
     * Gets the routesInclude property value. The routs that will be routed by the server
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
        writer.writeCollectionOfPrimitiveValues("routesExclude", this.getRoutesExclude());
        writer.writeCollectionOfPrimitiveValues("routesInclude", this.getRoutesInclude());
        writer.writeCollectionOfPrimitiveValues("splitDNS", this.getSplitDNS());
    }
    /**
     * Sets the advancedSettings property value. Additional settings that may be applied to the server
     * @param value Value to set for the advancedSettings property.
     * @return a void
     */
    public void setAdvancedSettings(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._advancedSettings = value;
    }
    /**
     * Sets the defaultDomainSuffix property value. The Default Domain appendix that will be used by the clients
     * @param value Value to set for the defaultDomainSuffix property.
     * @return a void
     */
    public void setDefaultDomainSuffix(@javax.annotation.Nullable final String value) {
        this._defaultDomainSuffix = value;
    }
    /**
     * Sets the description property value. The MicrosoftTunnelConfiguration's description
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the disableUdpConnections property value. When DisableUdpConnections is set, the clients and VPN server will not use DTLS connections to tansfer data.
     * @param value Value to set for the disableUdpConnections property.
     * @return a void
     */
    public void setDisableUdpConnections(@javax.annotation.Nullable final Boolean value) {
        this._disableUdpConnections = value;
    }
    /**
     * Sets the displayName property value. The MicrosoftTunnelConfiguration's display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the dnsServers property value. The DNS servers that will be used by the clients
     * @param value Value to set for the dnsServers property.
     * @return a void
     */
    public void setDnsServers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._dnsServers = value;
    }
    /**
     * Sets the lastUpdateDateTime property value. When the MicrosoftTunnelConfiguration was last updated
     * @param value Value to set for the lastUpdateDateTime property.
     * @return a void
     */
    public void setLastUpdateDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdateDateTime = value;
    }
    /**
     * Sets the listenPort property value. The port that both TCP and UPD will listen over on the server
     * @param value Value to set for the listenPort property.
     * @return a void
     */
    public void setListenPort(@javax.annotation.Nullable final Integer value) {
        this._listenPort = value;
    }
    /**
     * Sets the network property value. The subnet that will be used to allocate virtual address for the clients
     * @param value Value to set for the network property.
     * @return a void
     */
    public void setNetwork(@javax.annotation.Nullable final String value) {
        this._network = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the routesExclude property value. Subsets of the routes that will not be routed by the server
     * @param value Value to set for the routesExclude property.
     * @return a void
     */
    public void setRoutesExclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this._routesExclude = value;
    }
    /**
     * Sets the routesInclude property value. The routs that will be routed by the server
     * @param value Value to set for the routesInclude property.
     * @return a void
     */
    public void setRoutesInclude(@javax.annotation.Nullable final java.util.List<String> value) {
        this._routesInclude = value;
    }
    /**
     * Sets the splitDNS property value. The domains that will be resolved using the provided dns servers
     * @param value Value to set for the splitDNS property.
     * @return a void
     */
    public void setSplitDNS(@javax.annotation.Nullable final java.util.List<String> value) {
        this._splitDNS = value;
    }
}
