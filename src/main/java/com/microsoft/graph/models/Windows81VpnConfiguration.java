package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing the configurations in this profile you can instruct the Windows 8.1 (and later) devices to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user.
 */
public class Windows81VpnConfiguration extends WindowsVpnConfiguration implements Parsable {
    /**
     * Value indicating whether this policy only applies to Windows 8.1. This property is read-only.
     */
    private Boolean applyOnlyToWindows81;
    /**
     * Windows VPN connection type.
     */
    private WindowsVpnConnectionType connectionType;
    /**
     * Enable split tunneling for the VPN.
     */
    private Boolean enableSplitTunneling;
    /**
     * Login group or domain when connection type is set to Dell SonicWALL Mobile Connection.
     */
    private String loginGroupOrDomain;
    /**
     * Proxy Server.
     */
    private Windows81VpnProxyServer proxyServer;
    /**
     * Instantiates a new windows81VpnConfiguration and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Windows81VpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows81VpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windows81VpnConfiguration
     */
    @jakarta.annotation.Nonnull
    public static Windows81VpnConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
    @jakarta.annotation.Nullable
    public Boolean getApplyOnlyToWindows81() {
        return this.applyOnlyToWindows81;
    }
    /**
     * Gets the connectionType property value. Windows VPN connection type.
     * @return a windowsVpnConnectionType
     */
    @jakarta.annotation.Nullable
    public WindowsVpnConnectionType getConnectionType() {
        return this.connectionType;
    }
    /**
     * Gets the enableSplitTunneling property value. Enable split tunneling for the VPN.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnableSplitTunneling() {
        return this.enableSplitTunneling;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applyOnlyToWindows81", (n) -> { this.setApplyOnlyToWindows81(n.getBooleanValue()); });
        deserializerMap.put("connectionType", (n) -> { this.setConnectionType(n.getEnumValue(WindowsVpnConnectionType.class)); });
        deserializerMap.put("enableSplitTunneling", (n) -> { this.setEnableSplitTunneling(n.getBooleanValue()); });
        deserializerMap.put("loginGroupOrDomain", (n) -> { this.setLoginGroupOrDomain(n.getStringValue()); });
        deserializerMap.put("proxyServer", (n) -> { this.setProxyServer(n.getObjectValue(Windows81VpnProxyServer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the loginGroupOrDomain property value. Login group or domain when connection type is set to Dell SonicWALL Mobile Connection.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLoginGroupOrDomain() {
        return this.loginGroupOrDomain;
    }
    /**
     * Gets the proxyServer property value. Proxy Server.
     * @return a windows81VpnProxyServer
     */
    @jakarta.annotation.Nullable
    public Windows81VpnProxyServer getProxyServer() {
        return this.proxyServer;
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
    @jakarta.annotation.Nonnull
    public void setApplyOnlyToWindows81(@jakarta.annotation.Nullable final Boolean value) {
        this.applyOnlyToWindows81 = value;
    }
    /**
     * Sets the connectionType property value. Windows VPN connection type.
     * @param value Value to set for the connectionType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setConnectionType(@jakarta.annotation.Nullable final WindowsVpnConnectionType value) {
        this.connectionType = value;
    }
    /**
     * Sets the enableSplitTunneling property value. Enable split tunneling for the VPN.
     * @param value Value to set for the enableSplitTunneling property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnableSplitTunneling(@jakarta.annotation.Nullable final Boolean value) {
        this.enableSplitTunneling = value;
    }
    /**
     * Sets the loginGroupOrDomain property value. Login group or domain when connection type is set to Dell SonicWALL Mobile Connection.
     * @param value Value to set for the loginGroupOrDomain property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLoginGroupOrDomain(@jakarta.annotation.Nullable final String value) {
        this.loginGroupOrDomain = value;
    }
    /**
     * Sets the proxyServer property value. Proxy Server.
     * @param value Value to set for the proxyServer property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setProxyServer(@jakarta.annotation.Nullable final Windows81VpnProxyServer value) {
        this.proxyServer = value;
    }
}
