package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * IOS wired network configuration profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosWiredNetworkConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link IosWiredNetworkConfiguration} and sets the default values.
     */
    public IosWiredNetworkConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosWiredNetworkConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IosWiredNetworkConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static IosWiredNetworkConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosWiredNetworkConfiguration();
    }
    /**
     * Gets the authenticationMethod property value. Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential, unknownFutureValue.
     * @return a {@link WiredNetworkAuthenticationMethod}
     */
    @jakarta.annotation.Nullable
    public WiredNetworkAuthenticationMethod getAuthenticationMethod() {
        return this.backingStore.get("authenticationMethod");
    }
    /**
     * Gets the eapFastConfiguration property value. EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: noProtectedAccessCredential, useProtectedAccessCredential, useProtectedAccessCredentialAndProvision, useProtectedAccessCredentialAndProvisionAnonymously.
     * @return a {@link EapFastConfiguration}
     */
    @jakarta.annotation.Nullable
    public EapFastConfiguration getEapFastConfiguration() {
        return this.backingStore.get("eapFastConfiguration");
    }
    /**
     * Gets the eapType property value. Extensible Authentication Protocol (EAP) configuration types.
     * @return a {@link IosWiredNetworkEapType}
     */
    @jakarta.annotation.Nullable
    public IosWiredNetworkEapType getEapType() {
        return this.backingStore.get("eapType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(WiredNetworkAuthenticationMethod::forValue)); });
        deserializerMap.put("eapFastConfiguration", (n) -> { this.setEapFastConfiguration(n.getEnumValue(EapFastConfiguration::forValue)); });
        deserializerMap.put("eapType", (n) -> { this.setEapType(n.getEnumValue(IosWiredNetworkEapType::forValue)); });
        deserializerMap.put("identityCertificateForClientAuthentication", (n) -> { this.setIdentityCertificateForClientAuthentication(n.getObjectValue(IosCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("networkInterface", (n) -> { this.setNetworkInterface(n.getEnumValue(WiredNetworkInterface::forValue)); });
        deserializerMap.put("networkName", (n) -> { this.setNetworkName(n.getStringValue()); });
        deserializerMap.put("nonEapAuthenticationMethodForEapTtls", (n) -> { this.setNonEapAuthenticationMethodForEapTtls(n.getEnumValue(NonEapAuthenticationMethodForEapTtlsType::forValue)); });
        deserializerMap.put("outerIdentityPrivacyMaskValue", (n) -> { this.setOuterIdentityPrivacyMaskValue(n.getStringValue()); });
        deserializerMap.put("rootCertificateForServerValidation", (n) -> { this.setRootCertificateForServerValidation(n.getObjectValue(IosTrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("trustedServerCertificateNames", (n) -> { this.setTrustedServerCertificateNames(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication).
     * @return a {@link IosCertificateProfileBase}
     */
    @jakarta.annotation.Nullable
    public IosCertificateProfileBase getIdentityCertificateForClientAuthentication() {
        return this.backingStore.get("identityCertificateForClientAuthentication");
    }
    /**
     * Gets the networkInterface property value. Apple network interface type.
     * @return a {@link WiredNetworkInterface}
     */
    @jakarta.annotation.Nullable
    public WiredNetworkInterface getNetworkInterface() {
        return this.backingStore.get("networkInterface");
    }
    /**
     * Gets the networkName property value. Network Name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNetworkName() {
        return this.backingStore.get("networkName");
    }
    /**
     * Gets the nonEapAuthenticationMethodForEapTtls property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @return a {@link NonEapAuthenticationMethodForEapTtlsType}
     */
    @jakarta.annotation.Nullable
    public NonEapAuthenticationMethodForEapTtlsType getNonEapAuthenticationMethodForEapTtls() {
        return this.backingStore.get("nonEapAuthenticationMethodForEapTtls");
    }
    /**
     * Gets the outerIdentityPrivacyMaskValue property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TLS, EAP-TTLS or PEAP. This property masks usernames with the text you enter. For example, if you use &apos;anonymous&apos;, each user that authenticates with this wired network using their real username is displayed as &apos;anonymous&apos;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOuterIdentityPrivacyMaskValue() {
        return this.backingStore.get("outerIdentityPrivacyMaskValue");
    }
    /**
     * Gets the rootCertificateForServerValidation property value. Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS/TTLS or PEAP.
     * @return a {@link IosTrustedRootCertificate}
     */
    @jakarta.annotation.Nullable
    public IosTrustedRootCertificate getRootCertificateForServerValidation() {
        return this.backingStore.get("rootCertificateForServerValidation");
    }
    /**
     * Gets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this wired network.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTrustedServerCertificateNames() {
        return this.backingStore.get("trustedServerCertificateNames");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeEnumValue("eapFastConfiguration", this.getEapFastConfiguration());
        writer.writeEnumValue("eapType", this.getEapType());
        writer.writeObjectValue("identityCertificateForClientAuthentication", this.getIdentityCertificateForClientAuthentication());
        writer.writeEnumValue("networkInterface", this.getNetworkInterface());
        writer.writeStringValue("networkName", this.getNetworkName());
        writer.writeEnumValue("nonEapAuthenticationMethodForEapTtls", this.getNonEapAuthenticationMethodForEapTtls());
        writer.writeStringValue("outerIdentityPrivacyMaskValue", this.getOuterIdentityPrivacyMaskValue());
        writer.writeObjectValue("rootCertificateForServerValidation", this.getRootCertificateForServerValidation());
        writer.writeCollectionOfPrimitiveValues("trustedServerCertificateNames", this.getTrustedServerCertificateNames());
    }
    /**
     * Sets the authenticationMethod property value. Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential, unknownFutureValue.
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final WiredNetworkAuthenticationMethod value) {
        this.backingStore.set("authenticationMethod", value);
    }
    /**
     * Sets the eapFastConfiguration property value. EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: noProtectedAccessCredential, useProtectedAccessCredential, useProtectedAccessCredentialAndProvision, useProtectedAccessCredentialAndProvisionAnonymously.
     * @param value Value to set for the eapFastConfiguration property.
     */
    public void setEapFastConfiguration(@jakarta.annotation.Nullable final EapFastConfiguration value) {
        this.backingStore.set("eapFastConfiguration", value);
    }
    /**
     * Sets the eapType property value. Extensible Authentication Protocol (EAP) configuration types.
     * @param value Value to set for the eapType property.
     */
    public void setEapType(@jakarta.annotation.Nullable final IosWiredNetworkEapType value) {
        this.backingStore.set("eapType", value);
    }
    /**
     * Sets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication).
     * @param value Value to set for the identityCertificateForClientAuthentication property.
     */
    public void setIdentityCertificateForClientAuthentication(@jakarta.annotation.Nullable final IosCertificateProfileBase value) {
        this.backingStore.set("identityCertificateForClientAuthentication", value);
    }
    /**
     * Sets the networkInterface property value. Apple network interface type.
     * @param value Value to set for the networkInterface property.
     */
    public void setNetworkInterface(@jakarta.annotation.Nullable final WiredNetworkInterface value) {
        this.backingStore.set("networkInterface", value);
    }
    /**
     * Sets the networkName property value. Network Name.
     * @param value Value to set for the networkName property.
     */
    public void setNetworkName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkName", value);
    }
    /**
     * Sets the nonEapAuthenticationMethodForEapTtls property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @param value Value to set for the nonEapAuthenticationMethodForEapTtls property.
     */
    public void setNonEapAuthenticationMethodForEapTtls(@jakarta.annotation.Nullable final NonEapAuthenticationMethodForEapTtlsType value) {
        this.backingStore.set("nonEapAuthenticationMethodForEapTtls", value);
    }
    /**
     * Sets the outerIdentityPrivacyMaskValue property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TLS, EAP-TTLS or PEAP. This property masks usernames with the text you enter. For example, if you use &apos;anonymous&apos;, each user that authenticates with this wired network using their real username is displayed as &apos;anonymous&apos;.
     * @param value Value to set for the outerIdentityPrivacyMaskValue property.
     */
    public void setOuterIdentityPrivacyMaskValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("outerIdentityPrivacyMaskValue", value);
    }
    /**
     * Sets the rootCertificateForServerValidation property value. Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS/TTLS or PEAP.
     * @param value Value to set for the rootCertificateForServerValidation property.
     */
    public void setRootCertificateForServerValidation(@jakarta.annotation.Nullable final IosTrustedRootCertificate value) {
        this.backingStore.set("rootCertificateForServerValidation", value);
    }
    /**
     * Sets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this wired network.
     * @param value Value to set for the trustedServerCertificateNames property.
     */
    public void setTrustedServerCertificateNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("trustedServerCertificateNames", value);
    }
}
