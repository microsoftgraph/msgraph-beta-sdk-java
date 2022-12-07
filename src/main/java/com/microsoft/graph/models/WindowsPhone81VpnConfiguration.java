package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsPhone81VpnConfiguration extends Windows81VpnConfiguration implements Parsable {
    /** VPN Authentication Method. */
    private VpnAuthenticationMethod _authenticationMethod;
    /** Bypass VPN on company Wi-Fi. */
    private Boolean _bypassVpnOnCompanyWifi;
    /** Bypass VPN on home Wi-Fi. */
    private Boolean _bypassVpnOnHomeWifi;
    /** DNS suffix search list. */
    private java.util.List<String> _dnsSuffixSearchList;
    /** Identity certificate for client authentication when authentication method is certificate. */
    private WindowsPhone81CertificateProfileBase _identityCertificate;
    /** Remember user credentials. */
    private Boolean _rememberUserCredentials;
    /**
     * Instantiates a new WindowsPhone81VpnConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsPhone81VpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsPhone81VpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsPhone81VpnConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsPhone81VpnConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsPhone81VpnConfiguration();
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
     * Gets the bypassVpnOnCompanyWifi property value. Bypass VPN on company Wi-Fi.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBypassVpnOnCompanyWifi() {
        return this._bypassVpnOnCompanyWifi;
    }
    /**
     * Gets the bypassVpnOnHomeWifi property value. Bypass VPN on home Wi-Fi.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBypassVpnOnHomeWifi() {
        return this._bypassVpnOnHomeWifi;
    }
    /**
     * Gets the dnsSuffixSearchList property value. DNS suffix search list.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDnsSuffixSearchList() {
        return this._dnsSuffixSearchList;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(VpnAuthenticationMethod.class)); });
        deserializerMap.put("bypassVpnOnCompanyWifi", (n) -> { this.setBypassVpnOnCompanyWifi(n.getBooleanValue()); });
        deserializerMap.put("bypassVpnOnHomeWifi", (n) -> { this.setBypassVpnOnHomeWifi(n.getBooleanValue()); });
        deserializerMap.put("dnsSuffixSearchList", (n) -> { this.setDnsSuffixSearchList(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("identityCertificate", (n) -> { this.setIdentityCertificate(n.getObjectValue(WindowsPhone81CertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("rememberUserCredentials", (n) -> { this.setRememberUserCredentials(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @return a windowsPhone81CertificateProfileBase
     */
    @javax.annotation.Nullable
    public WindowsPhone81CertificateProfileBase getIdentityCertificate() {
        return this._identityCertificate;
    }
    /**
     * Gets the rememberUserCredentials property value. Remember user credentials.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRememberUserCredentials() {
        return this._rememberUserCredentials;
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
        writer.writeBooleanValue("bypassVpnOnCompanyWifi", this.getBypassVpnOnCompanyWifi());
        writer.writeBooleanValue("bypassVpnOnHomeWifi", this.getBypassVpnOnHomeWifi());
        writer.writeCollectionOfPrimitiveValues("dnsSuffixSearchList", this.getDnsSuffixSearchList());
        writer.writeObjectValue("identityCertificate", this.getIdentityCertificate());
        writer.writeBooleanValue("rememberUserCredentials", this.getRememberUserCredentials());
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
     * Sets the bypassVpnOnCompanyWifi property value. Bypass VPN on company Wi-Fi.
     * @param value Value to set for the bypassVpnOnCompanyWifi property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBypassVpnOnCompanyWifi(@javax.annotation.Nullable final Boolean value) {
        this._bypassVpnOnCompanyWifi = value;
    }
    /**
     * Sets the bypassVpnOnHomeWifi property value. Bypass VPN on home Wi-Fi.
     * @param value Value to set for the bypassVpnOnHomeWifi property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBypassVpnOnHomeWifi(@javax.annotation.Nullable final Boolean value) {
        this._bypassVpnOnHomeWifi = value;
    }
    /**
     * Sets the dnsSuffixSearchList property value. DNS suffix search list.
     * @param value Value to set for the dnsSuffixSearchList property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDnsSuffixSearchList(@javax.annotation.Nullable final java.util.List<String> value) {
        this._dnsSuffixSearchList = value;
    }
    /**
     * Sets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @param value Value to set for the identityCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityCertificate(@javax.annotation.Nullable final WindowsPhone81CertificateProfileBase value) {
        this._identityCertificate = value;
    }
    /**
     * Sets the rememberUserCredentials property value. Remember user credentials.
     * @param value Value to set for the rememberUserCredentials property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRememberUserCredentials(@javax.annotation.Nullable final Boolean value) {
        this._rememberUserCredentials = value;
    }
}
