package com.microsoft.graph.models;

import com.microsoft.graph.models.AndroidDeviceOwnerVpnConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VpnConfiguration extends DeviceConfiguration implements Parsable {
    /** VPN Authentication Method. */
    private VpnAuthenticationMethod _authenticationMethod;
    /** Connection name displayed to the user. */
    private String _connectionName;
    /** Realm when connection type is set to Pulse Secure. */
    private String _realm;
    /** Role when connection type is set to Pulse Secure. */
    private String _role;
    /** List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements. */
    private java.util.List<VpnServer> _servers;
    /**
     * Instantiates a new VpnConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.vpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VpnConfiguration
     */
    @javax.annotation.Nonnull
    public static VpnConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidDeviceOwnerVpnConfiguration": return new AndroidDeviceOwnerVpnConfiguration();
            }
        }
        return new VpnConfiguration();
    }
    /**
     * Gets the authenticationMethod property value. VPN Authentication Method.
     * @return a vpnAuthenticationMethod
     */
    @javax.annotation.Nullable
    public VpnAuthenticationMethod getAuthenticationMethod() {
        return this._authenticationMethod;
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VpnConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getEnumValue(VpnAuthenticationMethod.class)); });
        deserializerMap.put("connectionName", (n) -> { currentObject.setConnectionName(n.getStringValue()); });
        deserializerMap.put("realm", (n) -> { currentObject.setRealm(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { currentObject.setRole(n.getStringValue()); });
        deserializerMap.put("servers", (n) -> { currentObject.setServers(n.getCollectionOfObjectValues(VpnServer::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the realm property value. Realm when connection type is set to Pulse Secure.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRealm() {
        return this._realm;
    }
    /**
     * Gets the role property value. Role when connection type is set to Pulse Secure.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRole() {
        return this._role;
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
        writer.writeEnumValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeStringValue("connectionName", this.getConnectionName());
        writer.writeStringValue("realm", this.getRealm());
        writer.writeStringValue("role", this.getRole());
        writer.writeCollectionOfObjectValues("servers", this.getServers());
    }
    /**
     * Sets the authenticationMethod property value. VPN Authentication Method.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationMethod(@javax.annotation.Nullable final VpnAuthenticationMethod value) {
        this._authenticationMethod = value;
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
     * Sets the realm property value. Realm when connection type is set to Pulse Secure.
     * @param value Value to set for the realm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRealm(@javax.annotation.Nullable final String value) {
        this._realm = value;
    }
    /**
     * Sets the role property value. Role when connection type is set to Pulse Secure.
     * @param value Value to set for the role property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRole(@javax.annotation.Nullable final String value) {
        this._role = value;
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
