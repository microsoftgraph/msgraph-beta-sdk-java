package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AospDeviceOwnerEnterpriseWiFiConfiguration extends AospDeviceOwnerWiFiConfiguration implements Parsable {
    /** Indicates the Authentication Method the client (device) needs to use when the EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential. */
    private WiFiAuthenticationMethod _authenticationMethod;
    /** Extensible Authentication Protocol (EAP) Configuration Types. */
    private AndroidEapType _eapType;
    /** Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication). This is the certificate presented by client to the Wi-Fi endpoint. The authentication server sitting behind the Wi-Fi endpoint must accept this certificate to successfully establish a Wi-Fi connection. */
    private AospDeviceOwnerCertificateProfileBase _identityCertificateForClientAuthentication;
    /** Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo. */
    private NonEapAuthenticationMethodForEapTtlsType _innerAuthenticationProtocolForEapTtls;
    /** Non-EAP Method for Authentication (Inner Identity) when EAP Type is PEAP and Authenticationmethod is Username and Password. This collection can contain a maximum of 500 elements. Possible values are: none, microsoftChapVersionTwo. */
    private NonEapAuthenticationMethodForPeap _innerAuthenticationProtocolForPeap;
    /** Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS or PEAP. The String provided here is used to mask the username of individual users when they attempt to connect to Wi-Fi network. */
    private String _outerIdentityPrivacyTemporaryValue;
    /** Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS, EAP-TTLS or PEAP. This is the certificate presented by the Wi-Fi endpoint when the device attempts to connect to Wi-Fi endpoint. The device (or user) must accept this certificate to continue the connection attempt. */
    private AospDeviceOwnerTrustedRootCertificate _rootCertificateForServerValidation;
    /** Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users' devices when they connect to this Wi-Fi network. */
    private java.util.List<String> _trustedServerCertificateNames;
    /**
     * Instantiates a new AospDeviceOwnerEnterpriseWiFiConfiguration and sets the default values.
     * @return a void
     */
    public AospDeviceOwnerEnterpriseWiFiConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AospDeviceOwnerEnterpriseWiFiConfiguration
     */
    @javax.annotation.Nonnull
    public static AospDeviceOwnerEnterpriseWiFiConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AospDeviceOwnerEnterpriseWiFiConfiguration();
    }
    /**
     * Gets the authenticationMethod property value. Indicates the Authentication Method the client (device) needs to use when the EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential.
     * @return a wiFiAuthenticationMethod
     */
    @javax.annotation.Nullable
    public WiFiAuthenticationMethod getAuthenticationMethod() {
        return this._authenticationMethod;
    }
    /**
     * Gets the eapType property value. Extensible Authentication Protocol (EAP) Configuration Types.
     * @return a androidEapType
     */
    @javax.annotation.Nullable
    public AndroidEapType getEapType() {
        return this._eapType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AospDeviceOwnerEnterpriseWiFiConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getEnumValue(WiFiAuthenticationMethod.class)); });
            this.put("eapType", (n) -> { currentObject.setEapType(n.getEnumValue(AndroidEapType.class)); });
            this.put("identityCertificateForClientAuthentication", (n) -> { currentObject.setIdentityCertificateForClientAuthentication(n.getObjectValue(AospDeviceOwnerCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("innerAuthenticationProtocolForEapTtls", (n) -> { currentObject.setInnerAuthenticationProtocolForEapTtls(n.getEnumValue(NonEapAuthenticationMethodForEapTtlsType.class)); });
            this.put("innerAuthenticationProtocolForPeap", (n) -> { currentObject.setInnerAuthenticationProtocolForPeap(n.getEnumValue(NonEapAuthenticationMethodForPeap.class)); });
            this.put("outerIdentityPrivacyTemporaryValue", (n) -> { currentObject.setOuterIdentityPrivacyTemporaryValue(n.getStringValue()); });
            this.put("rootCertificateForServerValidation", (n) -> { currentObject.setRootCertificateForServerValidation(n.getObjectValue(AospDeviceOwnerTrustedRootCertificate::createFromDiscriminatorValue)); });
            this.put("trustedServerCertificateNames", (n) -> { currentObject.setTrustedServerCertificateNames(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication). This is the certificate presented by client to the Wi-Fi endpoint. The authentication server sitting behind the Wi-Fi endpoint must accept this certificate to successfully establish a Wi-Fi connection.
     * @return a aospDeviceOwnerCertificateProfileBase
     */
    @javax.annotation.Nullable
    public AospDeviceOwnerCertificateProfileBase getIdentityCertificateForClientAuthentication() {
        return this._identityCertificateForClientAuthentication;
    }
    /**
     * Gets the innerAuthenticationProtocolForEapTtls property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @return a nonEapAuthenticationMethodForEapTtlsType
     */
    @javax.annotation.Nullable
    public NonEapAuthenticationMethodForEapTtlsType getInnerAuthenticationProtocolForEapTtls() {
        return this._innerAuthenticationProtocolForEapTtls;
    }
    /**
     * Gets the innerAuthenticationProtocolForPeap property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is PEAP and Authenticationmethod is Username and Password. This collection can contain a maximum of 500 elements. Possible values are: none, microsoftChapVersionTwo.
     * @return a nonEapAuthenticationMethodForPeap
     */
    @javax.annotation.Nullable
    public NonEapAuthenticationMethodForPeap getInnerAuthenticationProtocolForPeap() {
        return this._innerAuthenticationProtocolForPeap;
    }
    /**
     * Gets the outerIdentityPrivacyTemporaryValue property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS or PEAP. The String provided here is used to mask the username of individual users when they attempt to connect to Wi-Fi network.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOuterIdentityPrivacyTemporaryValue() {
        return this._outerIdentityPrivacyTemporaryValue;
    }
    /**
     * Gets the rootCertificateForServerValidation property value. Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS, EAP-TTLS or PEAP. This is the certificate presented by the Wi-Fi endpoint when the device attempts to connect to Wi-Fi endpoint. The device (or user) must accept this certificate to continue the connection attempt.
     * @return a aospDeviceOwnerTrustedRootCertificate
     */
    @javax.annotation.Nullable
    public AospDeviceOwnerTrustedRootCertificate getRootCertificateForServerValidation() {
        return this._rootCertificateForServerValidation;
    }
    /**
     * Gets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users' devices when they connect to this Wi-Fi network.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTrustedServerCertificateNames() {
        return this._trustedServerCertificateNames;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setAuthenticationMethod(@javax.annotation.Nullable final WiFiAuthenticationMethod value) {
        this._authenticationMethod = value;
    }
    /**
     * Sets the eapType property value. Extensible Authentication Protocol (EAP) Configuration Types.
     * @param value Value to set for the eapType property.
     * @return a void
     */
    public void setEapType(@javax.annotation.Nullable final AndroidEapType value) {
        this._eapType = value;
    }
    /**
     * Sets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication). This is the certificate presented by client to the Wi-Fi endpoint. The authentication server sitting behind the Wi-Fi endpoint must accept this certificate to successfully establish a Wi-Fi connection.
     * @param value Value to set for the identityCertificateForClientAuthentication property.
     * @return a void
     */
    public void setIdentityCertificateForClientAuthentication(@javax.annotation.Nullable final AospDeviceOwnerCertificateProfileBase value) {
        this._identityCertificateForClientAuthentication = value;
    }
    /**
     * Sets the innerAuthenticationProtocolForEapTtls property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @param value Value to set for the innerAuthenticationProtocolForEapTtls property.
     * @return a void
     */
    public void setInnerAuthenticationProtocolForEapTtls(@javax.annotation.Nullable final NonEapAuthenticationMethodForEapTtlsType value) {
        this._innerAuthenticationProtocolForEapTtls = value;
    }
    /**
     * Sets the innerAuthenticationProtocolForPeap property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is PEAP and Authenticationmethod is Username and Password. This collection can contain a maximum of 500 elements. Possible values are: none, microsoftChapVersionTwo.
     * @param value Value to set for the innerAuthenticationProtocolForPeap property.
     * @return a void
     */
    public void setInnerAuthenticationProtocolForPeap(@javax.annotation.Nullable final NonEapAuthenticationMethodForPeap value) {
        this._innerAuthenticationProtocolForPeap = value;
    }
    /**
     * Sets the outerIdentityPrivacyTemporaryValue property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS or PEAP. The String provided here is used to mask the username of individual users when they attempt to connect to Wi-Fi network.
     * @param value Value to set for the outerIdentityPrivacyTemporaryValue property.
     * @return a void
     */
    public void setOuterIdentityPrivacyTemporaryValue(@javax.annotation.Nullable final String value) {
        this._outerIdentityPrivacyTemporaryValue = value;
    }
    /**
     * Sets the rootCertificateForServerValidation property value. Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS, EAP-TTLS or PEAP. This is the certificate presented by the Wi-Fi endpoint when the device attempts to connect to Wi-Fi endpoint. The device (or user) must accept this certificate to continue the connection attempt.
     * @param value Value to set for the rootCertificateForServerValidation property.
     * @return a void
     */
    public void setRootCertificateForServerValidation(@javax.annotation.Nullable final AospDeviceOwnerTrustedRootCertificate value) {
        this._rootCertificateForServerValidation = value;
    }
    /**
     * Sets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users' devices when they connect to this Wi-Fi network.
     * @param value Value to set for the trustedServerCertificateNames property.
     * @return a void
     */
    public void setTrustedServerCertificateNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._trustedServerCertificateNames = value;
    }
}
