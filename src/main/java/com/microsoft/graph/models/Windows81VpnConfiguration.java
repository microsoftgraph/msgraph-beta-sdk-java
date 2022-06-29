package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows81VpnConfiguration extends WindowsVpnConfiguration implements Parsable {
    /** Value indicating whether this policy only applies to Windows 8.1. This property is read-only. */
    private Boolean _applyOnlyToWindows81;
    /** Connection type. Possible values are: pulseSecure, f5EdgeClient, dellSonicWallMobileConnect, checkPointCapsuleVpn. */
    private WindowsVpnConnectionType _connectionType;
    /** Enable split tunneling for the VPN. */
    private Boolean _enableSplitTunneling;
    /** Login group or domain when connection type is set to Dell SonicWALL Mobile Connection. */
    private String _loginGroupOrDomain;
    /** Proxy Server. */
    private Windows81VpnProxyServer _proxyServer;
    /**
     * Instantiates a new Windows81VpnConfiguration and sets the default values.
     * @return a void
     */
    public Windows81VpnConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows81VpnConfiguration
     */
    @javax.annotation.Nonnull
    public static Windows81VpnConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsPhone81VpnConfiguration": return new WindowsPhone81VpnConfiguration();
            }
        }
        return new Windows81VpnConfiguration();
    }
    /**
     * Gets the applyOnlyToWindows81 property value. Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplyOnlyToWindows81() {
        return this._applyOnlyToWindows81;
    }
    /**
     * Gets the connectionType property value. Connection type. Possible values are: pulseSecure, f5EdgeClient, dellSonicWallMobileConnect, checkPointCapsuleVpn.
     * @return a windowsVpnConnectionType
     */
    @javax.annotation.Nullable
    public WindowsVpnConnectionType getConnectionType() {
        return this._connectionType;
    }
    /**
     * Gets the enableSplitTunneling property value. Enable split tunneling for the VPN.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableSplitTunneling() {
        return this._enableSplitTunneling;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows81VpnConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applyOnlyToWindows81", (n) -> { currentObject.setApplyOnlyToWindows81(n.getBooleanValue()); });
            this.put("connectionType", (n) -> { currentObject.setConnectionType(n.getEnumValue(WindowsVpnConnectionType.class)); });
            this.put("enableSplitTunneling", (n) -> { currentObject.setEnableSplitTunneling(n.getBooleanValue()); });
            this.put("loginGroupOrDomain", (n) -> { currentObject.setLoginGroupOrDomain(n.getStringValue()); });
            this.put("proxyServer", (n) -> { currentObject.setProxyServer(n.getObjectValue(Windows81VpnProxyServer::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the loginGroupOrDomain property value. Login group or domain when connection type is set to Dell SonicWALL Mobile Connection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLoginGroupOrDomain() {
        return this._loginGroupOrDomain;
    }
    /**
     * Gets the proxyServer property value. Proxy Server.
     * @return a windows81VpnProxyServer
     */
    @javax.annotation.Nullable
    public Windows81VpnProxyServer getProxyServer() {
        return this._proxyServer;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("applyOnlyToWindows81", this.getApplyOnlyToWindows81());
        writer.writeEnumValue("connectionType", this.getConnectionType());
        writer.writeBooleanValue("enableSplitTunneling", this.getEnableSplitTunneling());
        writer.writeStringValue("loginGroupOrDomain", this.getLoginGroupOrDomain());
        writer.writeObjectValue("proxyServer", this.getProxyServer());
    }
    /**
     * Sets the applyOnlyToWindows81 property value. Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     * @param value Value to set for the applyOnlyToWindows81 property.
     * @return a void
     */
    public void setApplyOnlyToWindows81(@javax.annotation.Nullable final Boolean value) {
        this._applyOnlyToWindows81 = value;
    }
    /**
     * Sets the connectionType property value. Connection type. Possible values are: pulseSecure, f5EdgeClient, dellSonicWallMobileConnect, checkPointCapsuleVpn.
     * @param value Value to set for the connectionType property.
     * @return a void
     */
    public void setConnectionType(@javax.annotation.Nullable final WindowsVpnConnectionType value) {
        this._connectionType = value;
    }
    /**
     * Sets the enableSplitTunneling property value. Enable split tunneling for the VPN.
     * @param value Value to set for the enableSplitTunneling property.
     * @return a void
     */
    public void setEnableSplitTunneling(@javax.annotation.Nullable final Boolean value) {
        this._enableSplitTunneling = value;
    }
    /**
     * Sets the loginGroupOrDomain property value. Login group or domain when connection type is set to Dell SonicWALL Mobile Connection.
     * @param value Value to set for the loginGroupOrDomain property.
     * @return a void
     */
    public void setLoginGroupOrDomain(@javax.annotation.Nullable final String value) {
        this._loginGroupOrDomain = value;
    }
    /**
     * Sets the proxyServer property value. Proxy Server.
     * @param value Value to set for the proxyServer property.
     * @return a void
     */
    public void setProxyServer(@javax.annotation.Nullable final Windows81VpnProxyServer value) {
        this._proxyServer = value;
    }
}
