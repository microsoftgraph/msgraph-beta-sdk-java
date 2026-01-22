package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing the configurations in this profile you can instruct the Android Work Profile device to connect to desired Wi-Fi endpoint. By specifying the authentication method and security types expected by Wi-Fi endpoint you can make the Wi-Fi connection seamless for end user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidWorkProfileEnterpriseWiFiConfiguration extends AndroidWorkProfileWiFiConfiguration implements Parsable {
    /**
     * Instantiates a new {@link AndroidWorkProfileEnterpriseWiFiConfiguration} and sets the default values.
     */
    public AndroidWorkProfileEnterpriseWiFiConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidWorkProfileEnterpriseWiFiConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AndroidWorkProfileEnterpriseWiFiConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AndroidWorkProfileEnterpriseWiFiConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidWorkProfileEnterpriseWiFiConfiguration();
    }
    /**
     * Gets the authenticationMethod property value. Indicates the Authentication Method the client (device) needs to use when the EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential.
     * @return a {@link WiFiAuthenticationMethod}
     */
    @jakarta.annotation.Nullable
    public WiFiAuthenticationMethod getAuthenticationMethod() {
        return this.backingStore.get("authenticationMethod");
    }
    /**
     * Gets the eapType property value. Extensible Authentication Protocol (EAP) Configuration Types.
     * @return a {@link AndroidEapType}
     */
    @jakarta.annotation.Nullable
    public AndroidEapType getEapType() {
        return this.backingStore.get("eapType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(WiFiAuthenticationMethod::forValue)); });
        deserializerMap.put("eapType", (n) -> { this.setEapType(n.getEnumValue(AndroidEapType::forValue)); });
        deserializerMap.put("identityCertificateForClientAuthentication", (n) -> { this.setIdentityCertificateForClientAuthentication(n.getObjectValue(AndroidWorkProfileCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("innerAuthenticationProtocolForEapTtls", (n) -> { this.setInnerAuthenticationProtocolForEapTtls(n.getEnumValue(NonEapAuthenticationMethodForEapTtlsType::forValue)); });
        deserializerMap.put("innerAuthenticationProtocolForPeap", (n) -> { this.setInnerAuthenticationProtocolForPeap(n.getEnumValue(NonEapAuthenticationMethodForPeap::forValue)); });
        deserializerMap.put("outerIdentityPrivacyTemporaryValue", (n) -> { this.setOuterIdentityPrivacyTemporaryValue(n.getStringValue()); });
        deserializerMap.put("rootCertificateForServerValidation", (n) -> { this.setRootCertificateForServerValidation(n.getObjectValue(AndroidWorkProfileTrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("trustedServerCertificateNames", (n) -> { this.setTrustedServerCertificateNames(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication). This is the certificate presented by client to the Wi-Fi endpoint. The authentication server sitting behind the Wi-Fi endpoint must accept this certificate to successfully establish a Wi-Fi connection.
     * @return a {@link AndroidWorkProfileCertificateProfileBase}
     */
    @jakarta.annotation.Nullable
    public AndroidWorkProfileCertificateProfileBase getIdentityCertificateForClientAuthentication() {
        return this.backingStore.get("identityCertificateForClientAuthentication");
    }
    /**
     * Gets the innerAuthenticationProtocolForEapTtls property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @return a {@link NonEapAuthenticationMethodForEapTtlsType}
     */
    @jakarta.annotation.Nullable
    public NonEapAuthenticationMethodForEapTtlsType getInnerAuthenticationProtocolForEapTtls() {
        return this.backingStore.get("innerAuthenticationProtocolForEapTtls");
    }
    /**
     * Gets the innerAuthenticationProtocolForPeap property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is PEAP and Authenticationmethod is Username and Password. Possible values are: none, microsoftChapVersionTwo.
     * @return a {@link NonEapAuthenticationMethodForPeap}
     */
    @jakarta.annotation.Nullable
    public NonEapAuthenticationMethodForPeap getInnerAuthenticationProtocolForPeap() {
        return this.backingStore.get("innerAuthenticationProtocolForPeap");
    }
    /**
     * Gets the outerIdentityPrivacyTemporaryValue property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS or PEAP. The String provided here is used to mask the username of individual users when they attempt to connect to Wi-Fi network.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOuterIdentityPrivacyTemporaryValue() {
        return this.backingStore.get("outerIdentityPrivacyTemporaryValue");
    }
    /**
     * Gets the rootCertificateForServerValidation property value. Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS, EAP-TTLS or PEAP. This is the certificate presented by the Wi-Fi endpoint when the device attempts to connect to Wi-Fi endpoint. The device (or user) must accept this certificate to continue the connection attempt.
     * @return a {@link AndroidWorkProfileTrustedRootCertificate}
     */
    @jakarta.annotation.Nullable
    public AndroidWorkProfileTrustedRootCertificate getRootCertificateForServerValidation() {
        return this.backingStore.get("rootCertificateForServerValidation");
    }
    /**
     * Gets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users&apos; devices when they connect to this Wi-Fi network.
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
        writer.writeEnumValue("eapType", this.getEapType());
        writer.writeObjectValue("identityCertificateForClientAuthentication", this.getIdentityCertificateForClientAuthentication());
        writer.writeEnumValue("innerAuthenticationProtocolForEapTtls", this.getInnerAuthenticationProtocolForEapTtls());
        writer.writeEnumValue("innerAuthenticationProtocolForPeap", this.getInnerAuthenticationProtocolForPeap());
        writer.writeStringValue("outerIdentityPrivacyTemporaryValue", this.getOuterIdentityPrivacyTemporaryValue());
        writer.writeObjectValue("rootCertificateForServerValidation", this.getRootCertificateForServerValidation());
        writer.writeCollectionOfPrimitiveValues("trustedServerCertificateNames", this.getTrustedServerCertificateNames());
    }
    /**
     * Sets the authenticationMethod property value. Indicates the Authentication Method the client (device) needs to use when the EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential.
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final WiFiAuthenticationMethod value) {
        this.backingStore.set("authenticationMethod", value);
    }
    /**
     * Sets the eapType property value. Extensible Authentication Protocol (EAP) Configuration Types.
     * @param value Value to set for the eapType property.
     */
    public void setEapType(@jakarta.annotation.Nullable final AndroidEapType value) {
        this.backingStore.set("eapType", value);
    }
    /**
     * Sets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication). This is the certificate presented by client to the Wi-Fi endpoint. The authentication server sitting behind the Wi-Fi endpoint must accept this certificate to successfully establish a Wi-Fi connection.
     * @param value Value to set for the identityCertificateForClientAuthentication property.
     */
    public void setIdentityCertificateForClientAuthentication(@jakarta.annotation.Nullable final AndroidWorkProfileCertificateProfileBase value) {
        this.backingStore.set("identityCertificateForClientAuthentication", value);
    }
    /**
     * Sets the innerAuthenticationProtocolForEapTtls property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @param value Value to set for the innerAuthenticationProtocolForEapTtls property.
     */
    public void setInnerAuthenticationProtocolForEapTtls(@jakarta.annotation.Nullable final NonEapAuthenticationMethodForEapTtlsType value) {
        this.backingStore.set("innerAuthenticationProtocolForEapTtls", value);
    }
    /**
     * Sets the innerAuthenticationProtocolForPeap property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is PEAP and Authenticationmethod is Username and Password. Possible values are: none, microsoftChapVersionTwo.
     * @param value Value to set for the innerAuthenticationProtocolForPeap property.
     */
    public void setInnerAuthenticationProtocolForPeap(@jakarta.annotation.Nullable final NonEapAuthenticationMethodForPeap value) {
        this.backingStore.set("innerAuthenticationProtocolForPeap", value);
    }
    /**
     * Sets the outerIdentityPrivacyTemporaryValue property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS or PEAP. The String provided here is used to mask the username of individual users when they attempt to connect to Wi-Fi network.
     * @param value Value to set for the outerIdentityPrivacyTemporaryValue property.
     */
    public void setOuterIdentityPrivacyTemporaryValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("outerIdentityPrivacyTemporaryValue", value);
    }
    /**
     * Sets the rootCertificateForServerValidation property value. Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS, EAP-TTLS or PEAP. This is the certificate presented by the Wi-Fi endpoint when the device attempts to connect to Wi-Fi endpoint. The device (or user) must accept this certificate to continue the connection attempt.
     * @param value Value to set for the rootCertificateForServerValidation property.
     */
    public void setRootCertificateForServerValidation(@jakarta.annotation.Nullable final AndroidWorkProfileTrustedRootCertificate value) {
        this.backingStore.set("rootCertificateForServerValidation", value);
    }
    /**
     * Sets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users&apos; devices when they connect to this Wi-Fi network.
     * @param value Value to set for the trustedServerCertificateNames property.
     */
    public void setTrustedServerCertificateNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("trustedServerCertificateNames", value);
    }
}
