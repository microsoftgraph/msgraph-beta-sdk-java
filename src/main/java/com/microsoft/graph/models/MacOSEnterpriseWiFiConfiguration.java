package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MacOS Wi-Fi WPA-Enterprise/WPA2-Enterprise configuration profile.
 */
public class MacOSEnterpriseWiFiConfiguration extends MacOSWiFiConfiguration implements Parsable {
    /**
     * Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential.
     */
    private WiFiAuthenticationMethod authenticationMethod;
    /**
     * EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: noProtectedAccessCredential, useProtectedAccessCredential, useProtectedAccessCredentialAndProvision, useProtectedAccessCredentialAndProvisionAnonymously.
     */
    private EapFastConfiguration eapFastConfiguration;
    /**
     * Extensible Authentication Protocol (EAP) configuration types.
     */
    private EapType eapType;
    /**
     * Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication).
     */
    private MacOSCertificateProfileBase identityCertificateForClientAuthentication;
    /**
     * Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     */
    private NonEapAuthenticationMethodForEapTtlsType innerAuthenticationProtocolForEapTtls;
    /**
     * Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS, EAP-FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this Wi-Fi connection using their real username is displayed as 'anonymous'.
     */
    private String outerIdentityPrivacyTemporaryValue;
    /**
     * Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP.
     */
    private MacOSTrustedRootCertificate rootCertificateForServerValidation;
    /**
     * Trusted Root Certificates for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. If you provide this value you do not need to provide trustedServerCertificateNames, and vice versa. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<MacOSTrustedRootCertificate> rootCertificatesForServerValidation;
    /**
     * Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this Wi-Fi network.
     */
    private java.util.List<String> trustedServerCertificateNames;
    /**
     * Instantiates a new macOSEnterpriseWiFiConfiguration and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MacOSEnterpriseWiFiConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSEnterpriseWiFiConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSEnterpriseWiFiConfiguration
     */
    @jakarta.annotation.Nonnull
    public static MacOSEnterpriseWiFiConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSEnterpriseWiFiConfiguration();
    }
    /**
     * Gets the authenticationMethod property value. Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential.
     * @return a wiFiAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public WiFiAuthenticationMethod getAuthenticationMethod() {
        return this.authenticationMethod;
    }
    /**
     * Gets the eapFastConfiguration property value. EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: noProtectedAccessCredential, useProtectedAccessCredential, useProtectedAccessCredentialAndProvision, useProtectedAccessCredentialAndProvisionAnonymously.
     * @return a eapFastConfiguration
     */
    @jakarta.annotation.Nullable
    public EapFastConfiguration getEapFastConfiguration() {
        return this.eapFastConfiguration;
    }
    /**
     * Gets the eapType property value. Extensible Authentication Protocol (EAP) configuration types.
     * @return a eapType
     */
    @jakarta.annotation.Nullable
    public EapType getEapType() {
        return this.eapType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(WiFiAuthenticationMethod.class)); });
        deserializerMap.put("eapFastConfiguration", (n) -> { this.setEapFastConfiguration(n.getEnumValue(EapFastConfiguration.class)); });
        deserializerMap.put("eapType", (n) -> { this.setEapType(n.getEnumValue(EapType.class)); });
        deserializerMap.put("identityCertificateForClientAuthentication", (n) -> { this.setIdentityCertificateForClientAuthentication(n.getObjectValue(MacOSCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("innerAuthenticationProtocolForEapTtls", (n) -> { this.setInnerAuthenticationProtocolForEapTtls(n.getEnumValue(NonEapAuthenticationMethodForEapTtlsType.class)); });
        deserializerMap.put("outerIdentityPrivacyTemporaryValue", (n) -> { this.setOuterIdentityPrivacyTemporaryValue(n.getStringValue()); });
        deserializerMap.put("rootCertificateForServerValidation", (n) -> { this.setRootCertificateForServerValidation(n.getObjectValue(MacOSTrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("rootCertificatesForServerValidation", (n) -> { this.setRootCertificatesForServerValidation(n.getCollectionOfObjectValues(MacOSTrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("trustedServerCertificateNames", (n) -> { this.setTrustedServerCertificateNames(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication).
     * @return a macOSCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public MacOSCertificateProfileBase getIdentityCertificateForClientAuthentication() {
        return this.identityCertificateForClientAuthentication;
    }
    /**
     * Gets the innerAuthenticationProtocolForEapTtls property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @return a nonEapAuthenticationMethodForEapTtlsType
     */
    @jakarta.annotation.Nullable
    public NonEapAuthenticationMethodForEapTtlsType getInnerAuthenticationProtocolForEapTtls() {
        return this.innerAuthenticationProtocolForEapTtls;
    }
    /**
     * Gets the outerIdentityPrivacyTemporaryValue property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS, EAP-FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this Wi-Fi connection using their real username is displayed as 'anonymous'.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOuterIdentityPrivacyTemporaryValue() {
        return this.outerIdentityPrivacyTemporaryValue;
    }
    /**
     * Gets the rootCertificateForServerValidation property value. Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP.
     * @return a macOSTrustedRootCertificate
     */
    @jakarta.annotation.Nullable
    public MacOSTrustedRootCertificate getRootCertificateForServerValidation() {
        return this.rootCertificateForServerValidation;
    }
    /**
     * Gets the rootCertificatesForServerValidation property value. Trusted Root Certificates for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. If you provide this value you do not need to provide trustedServerCertificateNames, and vice versa. This collection can contain a maximum of 500 elements.
     * @return a macOSTrustedRootCertificate
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSTrustedRootCertificate> getRootCertificatesForServerValidation() {
        return this.rootCertificatesForServerValidation;
    }
    /**
     * Gets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this Wi-Fi network.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTrustedServerCertificateNames() {
        return this.trustedServerCertificateNames;
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
        writer.writeEnumValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeEnumValue("eapFastConfiguration", this.getEapFastConfiguration());
        writer.writeEnumValue("eapType", this.getEapType());
        writer.writeObjectValue("identityCertificateForClientAuthentication", this.getIdentityCertificateForClientAuthentication());
        writer.writeEnumValue("innerAuthenticationProtocolForEapTtls", this.getInnerAuthenticationProtocolForEapTtls());
        writer.writeStringValue("outerIdentityPrivacyTemporaryValue", this.getOuterIdentityPrivacyTemporaryValue());
        writer.writeObjectValue("rootCertificateForServerValidation", this.getRootCertificateForServerValidation());
        writer.writeCollectionOfObjectValues("rootCertificatesForServerValidation", this.getRootCertificatesForServerValidation());
        writer.writeCollectionOfPrimitiveValues("trustedServerCertificateNames", this.getTrustedServerCertificateNames());
    }
    /**
     * Sets the authenticationMethod property value. Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final WiFiAuthenticationMethod value) {
        this.authenticationMethod = value;
    }
    /**
     * Sets the eapFastConfiguration property value. EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: noProtectedAccessCredential, useProtectedAccessCredential, useProtectedAccessCredentialAndProvision, useProtectedAccessCredentialAndProvisionAnonymously.
     * @param value Value to set for the eapFastConfiguration property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEapFastConfiguration(@jakarta.annotation.Nullable final EapFastConfiguration value) {
        this.eapFastConfiguration = value;
    }
    /**
     * Sets the eapType property value. Extensible Authentication Protocol (EAP) configuration types.
     * @param value Value to set for the eapType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEapType(@jakarta.annotation.Nullable final EapType value) {
        this.eapType = value;
    }
    /**
     * Sets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication).
     * @param value Value to set for the identityCertificateForClientAuthentication property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIdentityCertificateForClientAuthentication(@jakarta.annotation.Nullable final MacOSCertificateProfileBase value) {
        this.identityCertificateForClientAuthentication = value;
    }
    /**
     * Sets the innerAuthenticationProtocolForEapTtls property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @param value Value to set for the innerAuthenticationProtocolForEapTtls property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInnerAuthenticationProtocolForEapTtls(@jakarta.annotation.Nullable final NonEapAuthenticationMethodForEapTtlsType value) {
        this.innerAuthenticationProtocolForEapTtls = value;
    }
    /**
     * Sets the outerIdentityPrivacyTemporaryValue property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS, EAP-FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this Wi-Fi connection using their real username is displayed as 'anonymous'.
     * @param value Value to set for the outerIdentityPrivacyTemporaryValue property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOuterIdentityPrivacyTemporaryValue(@jakarta.annotation.Nullable final String value) {
        this.outerIdentityPrivacyTemporaryValue = value;
    }
    /**
     * Sets the rootCertificateForServerValidation property value. Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP.
     * @param value Value to set for the rootCertificateForServerValidation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRootCertificateForServerValidation(@jakarta.annotation.Nullable final MacOSTrustedRootCertificate value) {
        this.rootCertificateForServerValidation = value;
    }
    /**
     * Sets the rootCertificatesForServerValidation property value. Trusted Root Certificates for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. If you provide this value you do not need to provide trustedServerCertificateNames, and vice versa. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the rootCertificatesForServerValidation property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRootCertificatesForServerValidation(@jakarta.annotation.Nullable final java.util.List<MacOSTrustedRootCertificate> value) {
        this.rootCertificatesForServerValidation = value;
    }
    /**
     * Sets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this Wi-Fi network.
     * @param value Value to set for the trustedServerCertificateNames property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTrustedServerCertificateNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.trustedServerCertificateNames = value;
    }
}
