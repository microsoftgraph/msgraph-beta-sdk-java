package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSWiredNetworkConfiguration extends DeviceConfiguration implements Parsable {
    /** Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential. */
    private WiFiAuthenticationMethod _authenticationMethod;
    /** EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: noProtectedAccessCredential, useProtectedAccessCredential, useProtectedAccessCredentialAndProvision, useProtectedAccessCredentialAndProvisionAnonymously. */
    private EapFastConfiguration _eapFastConfiguration;
    /** Extensible Authentication Protocol (EAP) configuration types. */
    private EapType _eapType;
    /** Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS, EAP-FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this wired network using their real username is displayed as 'anonymous'. */
    private String _enableOuterIdentityPrivacy;
    /** Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication). */
    private MacOSCertificateProfileBase _identityCertificateForClientAuthentication;
    /** Apple network interface type. */
    private WiredNetworkInterface _networkInterface;
    /** Network Name */
    private String _networkName;
    /** Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo. */
    private NonEapAuthenticationMethodForEapTtlsType _nonEapAuthenticationMethodForEapTtls;
    /** Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. */
    private MacOSTrustedRootCertificate _rootCertificateForServerValidation;
    /** Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this wired network. */
    private java.util.List<String> _trustedServerCertificateNames;
    /**
     * Instantiates a new MacOSWiredNetworkConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSWiredNetworkConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSWiredNetworkConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSWiredNetworkConfiguration
     */
    @javax.annotation.Nonnull
    public static MacOSWiredNetworkConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSWiredNetworkConfiguration();
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
     * Gets the enableOuterIdentityPrivacy property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS, EAP-FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this wired network using their real username is displayed as 'anonymous'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnableOuterIdentityPrivacy() {
        return this._enableOuterIdentityPrivacy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSWiredNetworkConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getEnumValue(WiFiAuthenticationMethod.class)); });
            this.put("eapFastConfiguration", (n) -> { currentObject.setEapFastConfiguration(n.getEnumValue(EapFastConfiguration.class)); });
            this.put("eapType", (n) -> { currentObject.setEapType(n.getEnumValue(EapType.class)); });
            this.put("enableOuterIdentityPrivacy", (n) -> { currentObject.setEnableOuterIdentityPrivacy(n.getStringValue()); });
            this.put("identityCertificateForClientAuthentication", (n) -> { currentObject.setIdentityCertificateForClientAuthentication(n.getObjectValue(MacOSCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("networkInterface", (n) -> { currentObject.setNetworkInterface(n.getEnumValue(WiredNetworkInterface.class)); });
            this.put("networkName", (n) -> { currentObject.setNetworkName(n.getStringValue()); });
            this.put("nonEapAuthenticationMethodForEapTtls", (n) -> { currentObject.setNonEapAuthenticationMethodForEapTtls(n.getEnumValue(NonEapAuthenticationMethodForEapTtlsType.class)); });
            this.put("rootCertificateForServerValidation", (n) -> { currentObject.setRootCertificateForServerValidation(n.getObjectValue(MacOSTrustedRootCertificate::createFromDiscriminatorValue)); });
            this.put("trustedServerCertificateNames", (n) -> { currentObject.setTrustedServerCertificateNames(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication).
     * @return a macOSCertificateProfileBase
     */
    @javax.annotation.Nullable
    public MacOSCertificateProfileBase getIdentityCertificateForClientAuthentication() {
        return this._identityCertificateForClientAuthentication;
    }
    /**
     * Gets the networkInterface property value. Apple network interface type.
     * @return a wiredNetworkInterface
     */
    @javax.annotation.Nullable
    public WiredNetworkInterface getNetworkInterface() {
        return this._networkInterface;
    }
    /**
     * Gets the networkName property value. Network Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkName() {
        return this._networkName;
    }
    /**
     * Gets the nonEapAuthenticationMethodForEapTtls property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @return a nonEapAuthenticationMethodForEapTtlsType
     */
    @javax.annotation.Nullable
    public NonEapAuthenticationMethodForEapTtlsType getNonEapAuthenticationMethodForEapTtls() {
        return this._nonEapAuthenticationMethodForEapTtls;
    }
    /**
     * Gets the rootCertificateForServerValidation property value. Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP.
     * @return a macOSTrustedRootCertificate
     */
    @javax.annotation.Nullable
    public MacOSTrustedRootCertificate getRootCertificateForServerValidation() {
        return this._rootCertificateForServerValidation;
    }
    /**
     * Gets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this wired network.
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
    @javax.annotation.Nonnull
    public void setAuthenticationMethod(@javax.annotation.Nullable final WiFiAuthenticationMethod value) {
        this._authenticationMethod = value;
    }
    /**
     * Sets the eapFastConfiguration property value. EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: noProtectedAccessCredential, useProtectedAccessCredential, useProtectedAccessCredentialAndProvision, useProtectedAccessCredentialAndProvisionAnonymously.
     * @param value Value to set for the eapFastConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEapFastConfiguration(@javax.annotation.Nullable final EapFastConfiguration value) {
        this._eapFastConfiguration = value;
    }
    /**
     * Sets the eapType property value. Extensible Authentication Protocol (EAP) configuration types.
     * @param value Value to set for the eapType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEapType(@javax.annotation.Nullable final EapType value) {
        this._eapType = value;
    }
    /**
     * Sets the enableOuterIdentityPrivacy property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS, EAP-FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this wired network using their real username is displayed as 'anonymous'.
     * @param value Value to set for the enableOuterIdentityPrivacy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableOuterIdentityPrivacy(@javax.annotation.Nullable final String value) {
        this._enableOuterIdentityPrivacy = value;
    }
    /**
     * Sets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication).
     * @param value Value to set for the identityCertificateForClientAuthentication property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityCertificateForClientAuthentication(@javax.annotation.Nullable final MacOSCertificateProfileBase value) {
        this._identityCertificateForClientAuthentication = value;
    }
    /**
     * Sets the networkInterface property value. Apple network interface type.
     * @param value Value to set for the networkInterface property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkInterface(@javax.annotation.Nullable final WiredNetworkInterface value) {
        this._networkInterface = value;
    }
    /**
     * Sets the networkName property value. Network Name
     * @param value Value to set for the networkName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetworkName(@javax.annotation.Nullable final String value) {
        this._networkName = value;
    }
    /**
     * Sets the nonEapAuthenticationMethodForEapTtls property value. Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @param value Value to set for the nonEapAuthenticationMethodForEapTtls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNonEapAuthenticationMethodForEapTtls(@javax.annotation.Nullable final NonEapAuthenticationMethodForEapTtlsType value) {
        this._nonEapAuthenticationMethodForEapTtls = value;
    }
    /**
     * Sets the rootCertificateForServerValidation property value. Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP.
     * @param value Value to set for the rootCertificateForServerValidation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRootCertificateForServerValidation(@javax.annotation.Nullable final MacOSTrustedRootCertificate value) {
        this._rootCertificateForServerValidation = value;
    }
    /**
     * Sets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this wired network.
     * @param value Value to set for the trustedServerCertificateNames property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrustedServerCertificateNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._trustedServerCertificateNames = value;
    }
}
