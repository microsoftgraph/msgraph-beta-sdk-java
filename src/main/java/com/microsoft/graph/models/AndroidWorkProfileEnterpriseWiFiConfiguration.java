package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidWorkProfileEnterpriseWiFiConfiguration extends AndroidWorkProfileWiFiConfiguration implements Parsable {
    /** Indicates the Authentication Method the client (device) needs to use when the EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential. */
    private WiFiAuthenticationMethod authenticationMethod;
    /** Extensible Authentication Protocol (EAP) Configuration Types. */
    private AndroidEapType eapType;
    /** Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication). This is the certificate presented by client to the Wi-Fi endpoint. The authentication server sitting behind the Wi-Fi endpoint must accept this certificate to successfully establish a Wi-Fi connection. */
    private AndroidWorkProfileCertificateProfileBase identityCertificateForClientAuthentication;
    /** Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo. */
    private NonEapAuthenticationMethodForEapTtlsType innerAuthenticationProtocolForEapTtls;
    /** Non-EAP Method for Authentication (Inner Identity) when EAP Type is PEAP and Authenticationmethod is Username and Password. Possible values are: none, microsoftChapVersionTwo. */
    private NonEapAuthenticationMethodForPeap innerAuthenticationProtocolForPeap;
    /** Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS or PEAP. The String provided here is used to mask the username of individual users when they attempt to connect to Wi-Fi network. */
    private String outerIdentityPrivacyTemporaryValue;
    /** URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file. */
    private String proxyAutomaticConfigurationUrl;
    /** Wi-Fi Proxy Settings. */
    private WiFiProxySetting proxySettings;
    /** Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS, EAP-TTLS or PEAP. This is the certificate presented by the Wi-Fi endpoint when the device attempts to connect to Wi-Fi endpoint. The device (or user) must accept this certificate to continue the connection attempt. */
    private AndroidWorkProfileTrustedRootCertificate rootCertificateForServerValidation;
    /** Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users' devices when they connect to this Wi-Fi network. */
    private java.util.List<String> trustedServerCertificateNames;
    /**
     * Instantiates a new AndroidWorkProfileEnterpriseWiFiConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileEnterpriseWiFiConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidWorkProfileEnterpriseWiFiConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidWorkProfileEnterpriseWiFiConfiguration
     */
    @javax.annotation.Nonnull
    public static AndroidWorkProfileEnterpriseWiFiConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidWorkProfileEnterpriseWiFiConfiguration();
    }
    /**
     * Gets the authenticationMethod property value. Indicates the Authentication Method the client (device) needs to use when the EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential.
     * @return a wiFiAuthenticationMethod
     */
    @javax.annotation.Nullable
    public WiFiAuthenticationMethod getAuthenticationMethod() {
        return this.authenticationMethod;
    }
    /**
     * Gets the eapType property value. Extensible Authentication Protocol (EAP) Configuration Types.
     * @return a androidEapType
     */
    @javax.annotation.Nullable
    public AndroidEapType getEapType() {
        return this.eapType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(WiFiAuthenticationMethod.class)); });
        deserializerMap.put("eapType", (n) -> { this.setEapType(n.getEnumValue(AndroidEapType.class)); });
        deserializerMap.put("identityCertificateForClientAuthentication", (n) -> { this.setIdentityCertificateForClientAuthentication(n.getObjectValue(AndroidWorkProfileCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("innerAuthenticationProtocolForEapTtls", (n) -> { this.setInnerAuthenticationProtocolForEapTtls(n.getEnumValue(NonEapAuthenticationMethodForEapTtlsType.class)); });
        deserializerMap.put("innerAuthenticationProtocolForPeap", (n) -> { this.setInnerAuthenticationProtocolForPeap(n.getEnumValue(NonEapAuthenticationMethodForPeap.class)); });
        deserializerMap.put("outerIdentityPrivacyTemporaryValue", (n) -> { this.setOuterIdentityPrivacyTemporaryValue(n.getStringValue()); });
        deserializerMap.put("proxyAutomaticConfigurationUrl", (n) -> { this.setProxyAutomaticConfigurationUrl(n.getStringValue()); });
        deserializerMap.put("proxySettings", (n) -> { this.setProxySettings(n.getEnumValue(WiFiProxySetting.class)); });
        deserializerMap.put("rootCertificateForServerValidation", (n) -> { this.setRootCertificateForServerValidation(n.getObjectValue(AndroidWorkProfileTrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("trustedServerCertificateNames", (n) -> { this.setTrustedServerCertificateNames(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication). This is the certificate presented by client to the Wi-Fi endpoint. The authentication server sitting behind the Wi-Fi endpoint must accept this certificate to successfully establish a Wi-Fi connection.
     * @return a androidWorkProfileCertificateProfileBase
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileCertificateProfileBase getIdentityCertificateForClientAuthentication() {
        return this.identityCertificateForClientAuthentication;
    }
    /**
     * Gets the innerAuthenticationProtocolForEapTtls property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @return a nonEapAuthenticationMethodForEapTtlsType
     */
    @javax.annotation.Nullable
    public NonEapAuthenticationMethodForEapTtlsType getInnerAuthenticationProtocolForEapTtls() {
        return this.innerAuthenticationProtocolForEapTtls;
    }
    /**
     * Gets the innerAuthenticationProtocolForPeap property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is PEAP and Authenticationmethod is Username and Password. Possible values are: none, microsoftChapVersionTwo.
     * @return a nonEapAuthenticationMethodForPeap
     */
    @javax.annotation.Nullable
    public NonEapAuthenticationMethodForPeap getInnerAuthenticationProtocolForPeap() {
        return this.innerAuthenticationProtocolForPeap;
    }
    /**
     * Gets the outerIdentityPrivacyTemporaryValue property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS or PEAP. The String provided here is used to mask the username of individual users when they attempt to connect to Wi-Fi network.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOuterIdentityPrivacyTemporaryValue() {
        return this.outerIdentityPrivacyTemporaryValue;
    }
    /**
     * Gets the proxyAutomaticConfigurationUrl property value. URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProxyAutomaticConfigurationUrl() {
        return this.proxyAutomaticConfigurationUrl;
    }
    /**
     * Gets the proxySettings property value. Wi-Fi Proxy Settings.
     * @return a wiFiProxySetting
     */
    @javax.annotation.Nullable
    public WiFiProxySetting getProxySettings() {
        return this.proxySettings;
    }
    /**
     * Gets the rootCertificateForServerValidation property value. Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS, EAP-TTLS or PEAP. This is the certificate presented by the Wi-Fi endpoint when the device attempts to connect to Wi-Fi endpoint. The device (or user) must accept this certificate to continue the connection attempt.
     * @return a androidWorkProfileTrustedRootCertificate
     */
    @javax.annotation.Nullable
    public AndroidWorkProfileTrustedRootCertificate getRootCertificateForServerValidation() {
        return this.rootCertificateForServerValidation;
    }
    /**
     * Gets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users' devices when they connect to this Wi-Fi network.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTrustedServerCertificateNames() {
        return this.trustedServerCertificateNames;
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
        writer.writeEnumValue("eapType", this.getEapType());
        writer.writeObjectValue("identityCertificateForClientAuthentication", this.getIdentityCertificateForClientAuthentication());
        writer.writeEnumValue("innerAuthenticationProtocolForEapTtls", this.getInnerAuthenticationProtocolForEapTtls());
        writer.writeEnumValue("innerAuthenticationProtocolForPeap", this.getInnerAuthenticationProtocolForPeap());
        writer.writeStringValue("outerIdentityPrivacyTemporaryValue", this.getOuterIdentityPrivacyTemporaryValue());
        writer.writeStringValue("proxyAutomaticConfigurationUrl", this.getProxyAutomaticConfigurationUrl());
        writer.writeEnumValue("proxySettings", this.getProxySettings());
        writer.writeObjectValue("rootCertificateForServerValidation", this.getRootCertificateForServerValidation());
        writer.writeCollectionOfPrimitiveValues("trustedServerCertificateNames", this.getTrustedServerCertificateNames());
    }
    /**
     * Sets the authenticationMethod property value. Indicates the Authentication Method the client (device) needs to use when the EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuthenticationMethod(@javax.annotation.Nullable final WiFiAuthenticationMethod value) {
        this.authenticationMethod = value;
    }
    /**
     * Sets the eapType property value. Extensible Authentication Protocol (EAP) Configuration Types.
     * @param value Value to set for the eapType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEapType(@javax.annotation.Nullable final AndroidEapType value) {
        this.eapType = value;
    }
    /**
     * Sets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication). This is the certificate presented by client to the Wi-Fi endpoint. The authentication server sitting behind the Wi-Fi endpoint must accept this certificate to successfully establish a Wi-Fi connection.
     * @param value Value to set for the identityCertificateForClientAuthentication property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityCertificateForClientAuthentication(@javax.annotation.Nullable final AndroidWorkProfileCertificateProfileBase value) {
        this.identityCertificateForClientAuthentication = value;
    }
    /**
     * Sets the innerAuthenticationProtocolForEapTtls property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @param value Value to set for the innerAuthenticationProtocolForEapTtls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInnerAuthenticationProtocolForEapTtls(@javax.annotation.Nullable final NonEapAuthenticationMethodForEapTtlsType value) {
        this.innerAuthenticationProtocolForEapTtls = value;
    }
    /**
     * Sets the innerAuthenticationProtocolForPeap property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is PEAP and Authenticationmethod is Username and Password. Possible values are: none, microsoftChapVersionTwo.
     * @param value Value to set for the innerAuthenticationProtocolForPeap property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInnerAuthenticationProtocolForPeap(@javax.annotation.Nullable final NonEapAuthenticationMethodForPeap value) {
        this.innerAuthenticationProtocolForPeap = value;
    }
    /**
     * Sets the outerIdentityPrivacyTemporaryValue property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS or PEAP. The String provided here is used to mask the username of individual users when they attempt to connect to Wi-Fi network.
     * @param value Value to set for the outerIdentityPrivacyTemporaryValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOuterIdentityPrivacyTemporaryValue(@javax.annotation.Nullable final String value) {
        this.outerIdentityPrivacyTemporaryValue = value;
    }
    /**
     * Sets the proxyAutomaticConfigurationUrl property value. URL of the proxy server automatic configuration script when automatic configuration is selected. This URL is typically the location of PAC (Proxy Auto Configuration) file.
     * @param value Value to set for the proxyAutomaticConfigurationUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProxyAutomaticConfigurationUrl(@javax.annotation.Nullable final String value) {
        this.proxyAutomaticConfigurationUrl = value;
    }
    /**
     * Sets the proxySettings property value. Wi-Fi Proxy Settings.
     * @param value Value to set for the proxySettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProxySettings(@javax.annotation.Nullable final WiFiProxySetting value) {
        this.proxySettings = value;
    }
    /**
     * Sets the rootCertificateForServerValidation property value. Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS, EAP-TTLS or PEAP. This is the certificate presented by the Wi-Fi endpoint when the device attempts to connect to Wi-Fi endpoint. The device (or user) must accept this certificate to continue the connection attempt.
     * @param value Value to set for the rootCertificateForServerValidation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRootCertificateForServerValidation(@javax.annotation.Nullable final AndroidWorkProfileTrustedRootCertificate value) {
        this.rootCertificateForServerValidation = value;
    }
    /**
     * Sets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users' devices when they connect to this Wi-Fi network.
     * @param value Value to set for the trustedServerCertificateNames property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrustedServerCertificateNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this.trustedServerCertificateNames = value;
    }
}
