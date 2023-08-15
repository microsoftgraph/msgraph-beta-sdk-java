package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MacOS wired network configuration profile.
 */
public class MacOSWiredNetworkConfiguration extends DeviceConfiguration implements Parsable {
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
     * Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS, EAP-FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this wired network using their real username is displayed as 'anonymous'.
     */
    private String enableOuterIdentityPrivacy;
    /**
     * Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication).
     */
    private MacOSCertificateProfileBase identityCertificateForClientAuthentication;
    /**
     * Apple network interface type.
     */
    private WiredNetworkInterface networkInterface;
    /**
     * Network Name
     */
    private String networkName;
    /**
     * Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     */
    private NonEapAuthenticationMethodForEapTtlsType nonEapAuthenticationMethodForEapTtls;
    /**
     * Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP.
     */
    private MacOSTrustedRootCertificate rootCertificateForServerValidation;
    /**
     * Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this wired network.
     */
    private java.util.List<String> trustedServerCertificateNames;
    /**
     * Instantiates a new macOSWiredNetworkConfiguration and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MacOSWiredNetworkConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSWiredNetworkConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSWiredNetworkConfiguration
     */
    @jakarta.annotation.Nonnull
    public static MacOSWiredNetworkConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSWiredNetworkConfiguration();
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
     * Gets the enableOuterIdentityPrivacy property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS, EAP-FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this wired network using their real username is displayed as 'anonymous'.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEnableOuterIdentityPrivacy() {
        return this.enableOuterIdentityPrivacy;
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
        deserializerMap.put("enableOuterIdentityPrivacy", (n) -> { this.setEnableOuterIdentityPrivacy(n.getStringValue()); });
        deserializerMap.put("identityCertificateForClientAuthentication", (n) -> { this.setIdentityCertificateForClientAuthentication(n.getObjectValue(MacOSCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("networkInterface", (n) -> { this.setNetworkInterface(n.getEnumValue(WiredNetworkInterface.class)); });
        deserializerMap.put("networkName", (n) -> { this.setNetworkName(n.getStringValue()); });
        deserializerMap.put("nonEapAuthenticationMethodForEapTtls", (n) -> { this.setNonEapAuthenticationMethodForEapTtls(n.getEnumValue(NonEapAuthenticationMethodForEapTtlsType.class)); });
        deserializerMap.put("rootCertificateForServerValidation", (n) -> { this.setRootCertificateForServerValidation(n.getObjectValue(MacOSTrustedRootCertificate::createFromDiscriminatorValue)); });
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
     * Gets the networkInterface property value. Apple network interface type.
     * @return a wiredNetworkInterface
     */
    @jakarta.annotation.Nullable
    public WiredNetworkInterface getNetworkInterface() {
        return this.networkInterface;
    }
    /**
     * Gets the networkName property value. Network Name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNetworkName() {
        return this.networkName;
    }
    /**
     * Gets the nonEapAuthenticationMethodForEapTtls property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @return a nonEapAuthenticationMethodForEapTtlsType
     */
    @jakarta.annotation.Nullable
    public NonEapAuthenticationMethodForEapTtlsType getNonEapAuthenticationMethodForEapTtls() {
        return this.nonEapAuthenticationMethodForEapTtls;
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
     * Gets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this wired network.
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
        writer.writeStringValue("enableOuterIdentityPrivacy", this.getEnableOuterIdentityPrivacy());
        writer.writeObjectValue("identityCertificateForClientAuthentication", this.getIdentityCertificateForClientAuthentication());
        writer.writeEnumValue("networkInterface", this.getNetworkInterface());
        writer.writeStringValue("networkName", this.getNetworkName());
        writer.writeEnumValue("nonEapAuthenticationMethodForEapTtls", this.getNonEapAuthenticationMethodForEapTtls());
        writer.writeObjectValue("rootCertificateForServerValidation", this.getRootCertificateForServerValidation());
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
     * Sets the enableOuterIdentityPrivacy property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS, EAP-FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this wired network using their real username is displayed as 'anonymous'.
     * @param value Value to set for the enableOuterIdentityPrivacy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEnableOuterIdentityPrivacy(@jakarta.annotation.Nullable final String value) {
        this.enableOuterIdentityPrivacy = value;
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
     * Sets the networkInterface property value. Apple network interface type.
     * @param value Value to set for the networkInterface property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNetworkInterface(@jakarta.annotation.Nullable final WiredNetworkInterface value) {
        this.networkInterface = value;
    }
    /**
     * Sets the networkName property value. Network Name
     * @param value Value to set for the networkName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNetworkName(@jakarta.annotation.Nullable final String value) {
        this.networkName = value;
    }
    /**
     * Sets the nonEapAuthenticationMethodForEapTtls property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @param value Value to set for the nonEapAuthenticationMethodForEapTtls property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNonEapAuthenticationMethodForEapTtls(@jakarta.annotation.Nullable final NonEapAuthenticationMethodForEapTtlsType value) {
        this.nonEapAuthenticationMethodForEapTtls = value;
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
     * Sets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this wired network.
     * @param value Value to set for the trustedServerCertificateNames property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTrustedServerCertificateNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.trustedServerCertificateNames = value;
    }
}
