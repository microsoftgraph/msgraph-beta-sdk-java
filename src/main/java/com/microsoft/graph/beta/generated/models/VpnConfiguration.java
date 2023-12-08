package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Base VPN Configuration profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VpnConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new VpnConfiguration and sets the default values.
     */
    public VpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.vpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VpnConfiguration
     */
    @jakarta.annotation.Nonnull
    public static VpnConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a VpnAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public VpnAuthenticationMethod getAuthenticationMethod() {
        return this.backingStore.get("authenticationMethod");
    }
    /**
     * Gets the connectionName property value. Connection name displayed to the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectionName() {
        return this.backingStore.get("connectionName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(VpnAuthenticationMethod::forValue)); });
        deserializerMap.put("connectionName", (n) -> { this.setConnectionName(n.getStringValue()); });
        deserializerMap.put("realm", (n) -> { this.setRealm(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("servers", (n) -> { this.setServers(n.getCollectionOfObjectValues(VpnServer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the realm property value. Realm when connection type is set to Pulse Secure.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRealm() {
        return this.backingStore.get("realm");
    }
    /**
     * Gets the role property value. Role when connection type is set to Pulse Secure.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRole() {
        return this.backingStore.get("role");
    }
    /**
     * Gets the servers property value. List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<VpnServer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VpnServer> getServers() {
        return this.backingStore.get("servers");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final VpnAuthenticationMethod value) {
        this.backingStore.set("authenticationMethod", value);
    }
    /**
     * Sets the connectionName property value. Connection name displayed to the user.
     * @param value Value to set for the connectionName property.
     */
    public void setConnectionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectionName", value);
    }
    /**
     * Sets the realm property value. Realm when connection type is set to Pulse Secure.
     * @param value Value to set for the realm property.
     */
    public void setRealm(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("realm", value);
    }
    /**
     * Sets the role property value. Role when connection type is set to Pulse Secure.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("role", value);
    }
    /**
     * Sets the servers property value. List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the servers property.
     */
    public void setServers(@jakarta.annotation.Nullable final java.util.List<VpnServer> value) {
        this.backingStore.set("servers", value);
    }
}
