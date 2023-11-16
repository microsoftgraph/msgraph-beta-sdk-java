package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing the configurations in this profile you can instruct the Android device to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidForWorkVpnConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new AndroidForWorkVpnConfiguration and sets the default values.
     */
    public AndroidForWorkVpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidForWorkVpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidForWorkVpnConfiguration
     */
    @jakarta.annotation.Nonnull
    public static AndroidForWorkVpnConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidForWorkVpnConfiguration();
    }
    /**
     * Gets the authenticationMethod property value. VPN Authentication Method.
     * @return a VpnAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public VpnAuthenticationMethod getAuthenticationMethod() {
        return this.BackingStore.get("authenticationMethod");
    }
    /**
     * Gets the connectionName property value. Connection name displayed to the user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectionName() {
        return this.BackingStore.get("connectionName");
    }
    /**
     * Gets the connectionType property value. Android For Work VPN connection type.
     * @return a AndroidForWorkVpnConnectionType
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkVpnConnectionType getConnectionType() {
        return this.BackingStore.get("connectionType");
    }
    /**
     * Gets the customData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @return a java.util.List<KeyValue>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValue> getCustomData() {
        return this.BackingStore.get("customData");
    }
    /**
     * Gets the customKeyValueData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getCustomKeyValueData() {
        return this.BackingStore.get("customKeyValueData");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(VpnAuthenticationMethod.class)); });
        deserializerMap.put("connectionName", (n) -> { this.setConnectionName(n.getStringValue()); });
        deserializerMap.put("connectionType", (n) -> { this.setConnectionType(n.getEnumValue(AndroidForWorkVpnConnectionType.class)); });
        deserializerMap.put("customData", (n) -> { this.setCustomData(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("customKeyValueData", (n) -> { this.setCustomKeyValueData(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("fingerprint", (n) -> { this.setFingerprint(n.getStringValue()); });
        deserializerMap.put("identityCertificate", (n) -> { this.setIdentityCertificate(n.getObjectValue(AndroidForWorkCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("realm", (n) -> { this.setRealm(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        deserializerMap.put("servers", (n) -> { this.setServers(n.getCollectionOfObjectValues(VpnServer::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fingerprint property value. Fingerprint is a string that will be used to verify the VPN server can be trusted, which is only applicable when connection type is Check Point Capsule VPN.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFingerprint() {
        return this.BackingStore.get("fingerprint");
    }
    /**
     * Gets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @return a AndroidForWorkCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public AndroidForWorkCertificateProfileBase getIdentityCertificate() {
        return this.BackingStore.get("identityCertificate");
    }
    /**
     * Gets the realm property value. Realm when connection type is set to Pulse Secure.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRealm() {
        return this.BackingStore.get("realm");
    }
    /**
     * Gets the role property value. Role when connection type is set to Pulse Secure.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRole() {
        return this.BackingStore.get("role");
    }
    /**
     * Gets the servers property value. List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<VpnServer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VpnServer> getServers() {
        return this.BackingStore.get("servers");
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
        writer.writeEnumValue("connectionType", this.getConnectionType());
        writer.writeCollectionOfObjectValues("customData", this.getCustomData());
        writer.writeCollectionOfObjectValues("customKeyValueData", this.getCustomKeyValueData());
        writer.writeStringValue("fingerprint", this.getFingerprint());
        writer.writeObjectValue("identityCertificate", this.getIdentityCertificate());
        writer.writeStringValue("realm", this.getRealm());
        writer.writeStringValue("role", this.getRole());
        writer.writeCollectionOfObjectValues("servers", this.getServers());
    }
    /**
     * Sets the authenticationMethod property value. VPN Authentication Method.
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final VpnAuthenticationMethod value) {
        this.BackingStore.set("authenticationMethod", value);
    }
    /**
     * Sets the connectionName property value. Connection name displayed to the user.
     * @param value Value to set for the connectionName property.
     */
    public void setConnectionName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("connectionName", value);
    }
    /**
     * Sets the connectionType property value. Android For Work VPN connection type.
     * @param value Value to set for the connectionType property.
     */
    public void setConnectionType(@jakarta.annotation.Nullable final AndroidForWorkVpnConnectionType value) {
        this.BackingStore.set("connectionType", value);
    }
    /**
     * Sets the customData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customData property.
     */
    public void setCustomData(@jakarta.annotation.Nullable final java.util.List<KeyValue> value) {
        this.BackingStore.set("customData", value);
    }
    /**
     * Sets the customKeyValueData property value. Custom data when connection type is set to Citrix. This collection can contain a maximum of 25 elements.
     * @param value Value to set for the customKeyValueData property.
     */
    public void setCustomKeyValueData(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.BackingStore.set("customKeyValueData", value);
    }
    /**
     * Sets the fingerprint property value. Fingerprint is a string that will be used to verify the VPN server can be trusted, which is only applicable when connection type is Check Point Capsule VPN.
     * @param value Value to set for the fingerprint property.
     */
    public void setFingerprint(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("fingerprint", value);
    }
    /**
     * Sets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @param value Value to set for the identityCertificate property.
     */
    public void setIdentityCertificate(@jakarta.annotation.Nullable final AndroidForWorkCertificateProfileBase value) {
        this.BackingStore.set("identityCertificate", value);
    }
    /**
     * Sets the realm property value. Realm when connection type is set to Pulse Secure.
     * @param value Value to set for the realm property.
     */
    public void setRealm(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("realm", value);
    }
    /**
     * Sets the role property value. Role when connection type is set to Pulse Secure.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("role", value);
    }
    /**
     * Sets the servers property value. List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the servers property.
     */
    public void setServers(@jakarta.annotation.Nullable final java.util.List<VpnServer> value) {
        this.BackingStore.set("servers", value);
    }
}
