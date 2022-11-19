package com.microsoft.graph.models;

import com.microsoft.graph.models.Windows10VpnConfiguration;
import com.microsoft.graph.models.Windows81VpnConfiguration;
import com.microsoft.graph.models.WindowsPhone81VpnConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsVpnConfiguration extends DeviceConfiguration implements Parsable {
    /** Connection name displayed to the user. */
    private String _connectionName;
    /** Custom XML commands that configures the VPN connection. (UTF8 encoded byte array) */
    private byte[] _customXml;
    /** List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements. */
    private java.util.List<VpnServer> _servers;
    /**
     * Instantiates a new WindowsVpnConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsVpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsVpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsVpnConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsVpnConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windows10VpnConfiguration": return new Windows10VpnConfiguration();
                case "#microsoft.graph.windows81VpnConfiguration": return new Windows81VpnConfiguration();
                case "#microsoft.graph.windowsPhone81VpnConfiguration": return new WindowsPhone81VpnConfiguration();
            }
        }
        return new WindowsVpnConfiguration();
    }
    /**
     * Gets the connectionName property value. Connection name displayed to the user.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConnectionName() {
        return this._connectionName;
    }
    /**
     * Gets the customXml property value. Custom XML commands that configures the VPN connection. (UTF8 encoded byte array)
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getCustomXml() {
        return this._customXml;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsVpnConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("connectionName", (n) -> { currentObject.setConnectionName(n.getStringValue()); });
        deserializerMap.put("customXml", (n) -> { currentObject.setCustomXml(n.getByteArrayValue()); });
        deserializerMap.put("servers", (n) -> { currentObject.setServers(n.getCollectionOfObjectValues(VpnServer::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the servers property value. List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     * @return a vpnServer
     */
    @javax.annotation.Nullable
    public java.util.List<VpnServer> getServers() {
        return this._servers;
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
        writer.writeStringValue("connectionName", this.getConnectionName());
        writer.writeByteArrayValue("customXml", this.getCustomXml());
        writer.writeCollectionOfObjectValues("servers", this.getServers());
    }
    /**
     * Sets the connectionName property value. Connection name displayed to the user.
     * @param value Value to set for the connectionName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectionName(@javax.annotation.Nullable final String value) {
        this._connectionName = value;
    }
    /**
     * Sets the customXml property value. Custom XML commands that configures the VPN connection. (UTF8 encoded byte array)
     * @param value Value to set for the customXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomXml(@javax.annotation.Nullable final byte[] value) {
        this._customXml = value;
    }
    /**
     * Sets the servers property value. List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the servers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServers(@javax.annotation.Nullable final java.util.List<VpnServer> value) {
        this._servers = value;
    }
}
