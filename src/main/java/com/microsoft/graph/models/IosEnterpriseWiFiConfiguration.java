package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosEnterpriseWiFiConfiguration extends IosWiFiConfiguration implements Parsable {
    /** Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential. */
    private WiFiAuthenticationMethod _authenticationMethod;
    /** Tenant level settings for the Derived Credentials to be used for authentication. */
    private DeviceManagementDerivedCredentialSettings _derivedCredentialSettings;
    /** EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: noProtectedAccessCredential, useProtectedAccessCredential, useProtectedAccessCredentialAndProvision, useProtectedAccessCredentialAndProvisionAnonymously. */
    private EapFastConfiguration _eapFastConfiguration;
    /** Extensible Authentication Protocol (EAP) configuration types. */
    private EapType _eapType;
    /** Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication). */
    private IosCertificateProfileBase _identityCertificateForClientAuthentication;
    /** Non-EAP Method for Authentication when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo. */
    private NonEapAuthenticationMethodForEapTtlsType _innerAuthenticationProtocolForEapTtls;
    /** Enable identity privacy (Outer Identity) when EAP Type is configured to EAP - TTLS, EAP - FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this Wi-Fi connection using their real username is displayed as 'anonymous'. */
    private String _outerIdentityPrivacyTemporaryValue;
    /** Password format string used to build the password to connect to wifi */
    private String _passwordFormatString;
    /** Trusted Root Certificates for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. If you provide this value you do not need to provide trustedServerCertificateNames, and vice versa. This collection can contain a maximum of 500 elements. */
    private java.util.List<IosTrustedRootCertificate> _rootCertificatesForServerValidation;
    /** Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users' devices when they connect to this Wi-Fi network. */
    private java.util.List<String> _trustedServerCertificateNames;
    /** Username format string used to build the username to connect to wifi */
    private String _usernameFormatString;
    /**
     * Instantiates a new IosEnterpriseWiFiConfiguration and sets the default values.
     * @return a void
     */
    public IosEnterpriseWiFiConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosEnterpriseWiFiConfiguration
     */
    @javax.annotation.Nonnull
    public static IosEnterpriseWiFiConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosEnterpriseWiFiConfiguration();
    }
    /**
     * Gets the authenticationMethod property value. Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential.
     * @return a wiFiAuthenticationMethod
     */
    @javax.annotation.Nullable
    public WiFiAuthenticationMethod getAuthenticationMethod() {
        return this._authenticationMethod;
    }
    /**
     * Gets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @return a deviceManagementDerivedCredentialSettings
     */
    @javax.annotation.Nullable
    public DeviceManagementDerivedCredentialSettings getDerivedCredentialSettings() {
        return this._derivedCredentialSettings;
    }
    /**
     * Gets the eapFastConfiguration property value. EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: noProtectedAccessCredential, useProtectedAccessCredential, useProtectedAccessCredentialAndProvision, useProtectedAccessCredentialAndProvisionAnonymously.
     * @return a eapFastConfiguration
     */
    @javax.annotation.Nullable
    public EapFastConfiguration getEapFastConfiguration() {
        return this._eapFastConfiguration;
    }
    /**
     * Gets the eapType property value. Extensible Authentication Protocol (EAP) configuration types.
     * @return a eapType
     */
    @javax.annotation.Nullable
    public EapType getEapType() {
        return this._eapType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final IosEnterpriseWiFiConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getEnumValue(WiFiAuthenticationMethod.class)); });
            this.put("derivedCredentialSettings", (n) -> { currentObject.setDerivedCredentialSettings(n.getObjectValue(DeviceManagementDerivedCredentialSettings::createFromDiscriminatorValue)); });
            this.put("eapFastConfiguration", (n) -> { currentObject.setEapFastConfiguration(n.getEnumValue(EapFastConfiguration.class)); });
            this.put("eapType", (n) -> { currentObject.setEapType(n.getEnumValue(EapType.class)); });
            this.put("identityCertificateForClientAuthentication", (n) -> { currentObject.setIdentityCertificateForClientAuthentication(n.getObjectValue(IosCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("innerAuthenticationProtocolForEapTtls", (n) -> { currentObject.setInnerAuthenticationProtocolForEapTtls(n.getEnumValue(NonEapAuthenticationMethodForEapTtlsType.class)); });
            this.put("outerIdentityPrivacyTemporaryValue", (n) -> { currentObject.setOuterIdentityPrivacyTemporaryValue(n.getStringValue()); });
            this.put("passwordFormatString", (n) -> { currentObject.setPasswordFormatString(n.getStringValue()); });
            this.put("rootCertificatesForServerValidation", (n) -> { currentObject.setRootCertificatesForServerValidation(n.getCollectionOfObjectValues(IosTrustedRootCertificate::createFromDiscriminatorValue)); });
            this.put("trustedServerCertificateNames", (n) -> { currentObject.setTrustedServerCertificateNames(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("usernameFormatString", (n) -> { currentObject.setUsernameFormatString(n.getStringValue()); });
        }};
    }
    /**
     * Gets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication).
     * @return a iosCertificateProfileBase
     */
    @javax.annotation.Nullable
    public IosCertificateProfileBase getIdentityCertificateForClientAuthentication() {
        return this._identityCertificateForClientAuthentication;
    }
    /**
     * Gets the innerAuthenticationProtocolForEapTtls property value. Non-EAP Method for Authentication when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @return a nonEapAuthenticationMethodForEapTtlsType
     */
    @javax.annotation.Nullable
    public NonEapAuthenticationMethodForEapTtlsType getInnerAuthenticationProtocolForEapTtls() {
        return this._innerAuthenticationProtocolForEapTtls;
    }
    /**
     * Gets the outerIdentityPrivacyTemporaryValue property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP - TTLS, EAP - FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this Wi-Fi connection using their real username is displayed as 'anonymous'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOuterIdentityPrivacyTemporaryValue() {
        return this._outerIdentityPrivacyTemporaryValue;
    }
    /**
     * Gets the passwordFormatString property value. Password format string used to build the password to connect to wifi
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPasswordFormatString() {
        return this._passwordFormatString;
    }
    /**
     * Gets the rootCertificatesForServerValidation property value. Trusted Root Certificates for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. If you provide this value you do not need to provide trustedServerCertificateNames, and vice versa. This collection can contain a maximum of 500 elements.
     * @return a iosTrustedRootCertificate
     */
    @javax.annotation.Nullable
    public java.util.List<IosTrustedRootCertificate> getRootCertificatesForServerValidation() {
        return this._rootCertificatesForServerValidation;
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
     * Gets the usernameFormatString property value. Username format string used to build the username to connect to wifi
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUsernameFormatString() {
        return this._usernameFormatString;
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
        writer.writeObjectValue("derivedCredentialSettings", this.getDerivedCredentialSettings());
        writer.writeEnumValue("eapFastConfiguration", this.getEapFastConfiguration());
        writer.writeEnumValue("eapType", this.getEapType());
        writer.writeObjectValue("identityCertificateForClientAuthentication", this.getIdentityCertificateForClientAuthentication());
        writer.writeEnumValue("innerAuthenticationProtocolForEapTtls", this.getInnerAuthenticationProtocolForEapTtls());
        writer.writeStringValue("outerIdentityPrivacyTemporaryValue", this.getOuterIdentityPrivacyTemporaryValue());
        writer.writeStringValue("passwordFormatString", this.getPasswordFormatString());
        writer.writeCollectionOfObjectValues("rootCertificatesForServerValidation", this.getRootCertificatesForServerValidation());
        writer.writeCollectionOfPrimitiveValues("trustedServerCertificateNames", this.getTrustedServerCertificateNames());
        writer.writeStringValue("usernameFormatString", this.getUsernameFormatString());
    }
    /**
     * Sets the authenticationMethod property value. Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    public void setAuthenticationMethod(@javax.annotation.Nullable final WiFiAuthenticationMethod value) {
        this._authenticationMethod = value;
    }
    /**
     * Sets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @param value Value to set for the derivedCredentialSettings property.
     * @return a void
     */
    public void setDerivedCredentialSettings(@javax.annotation.Nullable final DeviceManagementDerivedCredentialSettings value) {
        this._derivedCredentialSettings = value;
    }
    /**
     * Sets the eapFastConfiguration property value. EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: noProtectedAccessCredential, useProtectedAccessCredential, useProtectedAccessCredentialAndProvision, useProtectedAccessCredentialAndProvisionAnonymously.
     * @param value Value to set for the eapFastConfiguration property.
     * @return a void
     */
    public void setEapFastConfiguration(@javax.annotation.Nullable final EapFastConfiguration value) {
        this._eapFastConfiguration = value;
    }
    /**
     * Sets the eapType property value. Extensible Authentication Protocol (EAP) configuration types.
     * @param value Value to set for the eapType property.
     * @return a void
     */
    public void setEapType(@javax.annotation.Nullable final EapType value) {
        this._eapType = value;
    }
    /**
     * Sets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication).
     * @param value Value to set for the identityCertificateForClientAuthentication property.
     * @return a void
     */
    public void setIdentityCertificateForClientAuthentication(@javax.annotation.Nullable final IosCertificateProfileBase value) {
        this._identityCertificateForClientAuthentication = value;
    }
    /**
     * Sets the innerAuthenticationProtocolForEapTtls property value. Non-EAP Method for Authentication when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @param value Value to set for the innerAuthenticationProtocolForEapTtls property.
     * @return a void
     */
    public void setInnerAuthenticationProtocolForEapTtls(@javax.annotation.Nullable final NonEapAuthenticationMethodForEapTtlsType value) {
        this._innerAuthenticationProtocolForEapTtls = value;
    }
    /**
     * Sets the outerIdentityPrivacyTemporaryValue property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP - TTLS, EAP - FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this Wi-Fi connection using their real username is displayed as 'anonymous'.
     * @param value Value to set for the outerIdentityPrivacyTemporaryValue property.
     * @return a void
     */
    public void setOuterIdentityPrivacyTemporaryValue(@javax.annotation.Nullable final String value) {
        this._outerIdentityPrivacyTemporaryValue = value;
    }
    /**
     * Sets the passwordFormatString property value. Password format string used to build the password to connect to wifi
     * @param value Value to set for the passwordFormatString property.
     * @return a void
     */
    public void setPasswordFormatString(@javax.annotation.Nullable final String value) {
        this._passwordFormatString = value;
    }
    /**
     * Sets the rootCertificatesForServerValidation property value. Trusted Root Certificates for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. If you provide this value you do not need to provide trustedServerCertificateNames, and vice versa. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the rootCertificatesForServerValidation property.
     * @return a void
     */
    public void setRootCertificatesForServerValidation(@javax.annotation.Nullable final java.util.List<IosTrustedRootCertificate> value) {
        this._rootCertificatesForServerValidation = value;
    }
    /**
     * Sets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users' devices when they connect to this Wi-Fi network.
     * @param value Value to set for the trustedServerCertificateNames property.
     * @return a void
     */
    public void setTrustedServerCertificateNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._trustedServerCertificateNames = value;
    }
    /**
     * Sets the usernameFormatString property value. Username format string used to build the username to connect to wifi
     * @param value Value to set for the usernameFormatString property.
     * @return a void
     */
    public void setUsernameFormatString(@javax.annotation.Nullable final String value) {
        this._usernameFormatString = value;
    }
}
