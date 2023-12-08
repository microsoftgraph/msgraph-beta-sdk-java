package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing the configurations in this profile you can instruct the Windows Phone 8.1 to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsPhone81VpnConfiguration extends Windows81VpnConfiguration implements Parsable {
    /**
     * Instantiates a new WindowsPhone81VpnConfiguration and sets the default values.
     */
    public WindowsPhone81VpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhone81VpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsPhone81VpnConfiguration
     */
    @jakarta.annotation.Nonnull
    public static WindowsPhone81VpnConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPhone81VpnConfiguration();
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
     * Gets the bypassVpnOnCompanyWifi property value. Bypass VPN on company Wi-Fi.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBypassVpnOnCompanyWifi() {
        return this.backingStore.get("bypassVpnOnCompanyWifi");
    }
    /**
     * Gets the bypassVpnOnHomeWifi property value. Bypass VPN on home Wi-Fi.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBypassVpnOnHomeWifi() {
        return this.backingStore.get("bypassVpnOnHomeWifi");
    }
    /**
     * Gets the dnsSuffixSearchList property value. DNS suffix search list.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDnsSuffixSearchList() {
        return this.backingStore.get("dnsSuffixSearchList");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(VpnAuthenticationMethod::forValue)); });
        deserializerMap.put("bypassVpnOnCompanyWifi", (n) -> { this.setBypassVpnOnCompanyWifi(n.getBooleanValue()); });
        deserializerMap.put("bypassVpnOnHomeWifi", (n) -> { this.setBypassVpnOnHomeWifi(n.getBooleanValue()); });
        deserializerMap.put("dnsSuffixSearchList", (n) -> { this.setDnsSuffixSearchList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("identityCertificate", (n) -> { this.setIdentityCertificate(n.getObjectValue(WindowsPhone81CertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("rememberUserCredentials", (n) -> { this.setRememberUserCredentials(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @return a WindowsPhone81CertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public WindowsPhone81CertificateProfileBase getIdentityCertificate() {
        return this.backingStore.get("identityCertificate");
    }
    /**
     * Gets the rememberUserCredentials property value. Remember user credentials.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRememberUserCredentials() {
        return this.backingStore.get("rememberUserCredentials");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeBooleanValue("bypassVpnOnCompanyWifi", this.getBypassVpnOnCompanyWifi());
        writer.writeBooleanValue("bypassVpnOnHomeWifi", this.getBypassVpnOnHomeWifi());
        writer.writeCollectionOfPrimitiveValues("dnsSuffixSearchList", this.getDnsSuffixSearchList());
        writer.writeObjectValue("identityCertificate", this.getIdentityCertificate());
        writer.writeBooleanValue("rememberUserCredentials", this.getRememberUserCredentials());
    }
    /**
     * Sets the authenticationMethod property value. VPN Authentication Method.
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final VpnAuthenticationMethod value) {
        this.backingStore.set("authenticationMethod", value);
    }
    /**
     * Sets the bypassVpnOnCompanyWifi property value. Bypass VPN on company Wi-Fi.
     * @param value Value to set for the bypassVpnOnCompanyWifi property.
     */
    public void setBypassVpnOnCompanyWifi(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bypassVpnOnCompanyWifi", value);
    }
    /**
     * Sets the bypassVpnOnHomeWifi property value. Bypass VPN on home Wi-Fi.
     * @param value Value to set for the bypassVpnOnHomeWifi property.
     */
    public void setBypassVpnOnHomeWifi(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bypassVpnOnHomeWifi", value);
    }
    /**
     * Sets the dnsSuffixSearchList property value. DNS suffix search list.
     * @param value Value to set for the dnsSuffixSearchList property.
     */
    public void setDnsSuffixSearchList(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("dnsSuffixSearchList", value);
    }
    /**
     * Sets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @param value Value to set for the identityCertificate property.
     */
    public void setIdentityCertificate(@jakarta.annotation.Nullable final WindowsPhone81CertificateProfileBase value) {
        this.backingStore.set("identityCertificate", value);
    }
    /**
     * Sets the rememberUserCredentials property value. Remember user credentials.
     * @param value Value to set for the rememberUserCredentials property.
     */
    public void setRememberUserCredentials(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("rememberUserCredentials", value);
    }
}
