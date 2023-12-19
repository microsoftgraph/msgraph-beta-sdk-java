package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing the configurations in this profile you can instruct the iOS device to connect to desired Wi-Fi endpoint. By specifying the authentication method and security types expected by Wi-Fi endpoint you can make the Wi-Fi connection seamless for end user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosEnterpriseWiFiConfiguration extends IosWiFiConfiguration implements Parsable {
    /**
     * Instantiates a new IosEnterpriseWiFiConfiguration and sets the default values.
     */
    public IosEnterpriseWiFiConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosEnterpriseWiFiConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosEnterpriseWiFiConfiguration
     */
    @jakarta.annotation.Nonnull
    public static IosEnterpriseWiFiConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosEnterpriseWiFiConfiguration();
    }
    /**
     * Gets the authenticationMethod property value. Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential.
     * @return a IosEnterpriseWiFiConfigurationAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public IosEnterpriseWiFiConfigurationAuthenticationMethod getAuthenticationMethod() {
        return this.backingStore.get("authenticationMethod");
    }
    /**
     * Gets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @return a DeviceManagementDerivedCredentialSettings
     */
    @jakarta.annotation.Nullable
    public DeviceManagementDerivedCredentialSettings getDerivedCredentialSettings() {
        return this.backingStore.get("derivedCredentialSettings");
    }
    /**
     * Gets the eapFastConfiguration property value. EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: noProtectedAccessCredential, useProtectedAccessCredential, useProtectedAccessCredentialAndProvision, useProtectedAccessCredentialAndProvisionAnonymously.
     * @return a IosEnterpriseWiFiConfigurationEapFastConfiguration
     */
    @jakarta.annotation.Nullable
    public IosEnterpriseWiFiConfigurationEapFastConfiguration getEapFastConfiguration() {
        return this.backingStore.get("eapFastConfiguration");
    }
    /**
     * Gets the eapType property value. Extensible Authentication Protocol (EAP) configuration types.
     * @return a EapType
     */
    @jakarta.annotation.Nullable
    public EapType getEapType() {
        return this.backingStore.get("eapType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(IosEnterpriseWiFiConfigurationAuthenticationMethod::forValue)); });
        deserializerMap.put("derivedCredentialSettings", (n) -> { this.setDerivedCredentialSettings(n.getObjectValue(DeviceManagementDerivedCredentialSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("eapFastConfiguration", (n) -> { this.setEapFastConfiguration(n.getEnumValue(IosEnterpriseWiFiConfigurationEapFastConfiguration::forValue)); });
        deserializerMap.put("eapType", (n) -> { this.setEapType(n.getEnumValue(EapType::forValue)); });
        deserializerMap.put("identityCertificateForClientAuthentication", (n) -> { this.setIdentityCertificateForClientAuthentication(n.getObjectValue(IosCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("innerAuthenticationProtocolForEapTtls", (n) -> { this.setInnerAuthenticationProtocolForEapTtls(n.getEnumValue(IosEnterpriseWiFiConfigurationInnerAuthenticationProtocolForEapTtls::forValue)); });
        deserializerMap.put("outerIdentityPrivacyTemporaryValue", (n) -> { this.setOuterIdentityPrivacyTemporaryValue(n.getStringValue()); });
        deserializerMap.put("passwordFormatString", (n) -> { this.setPasswordFormatString(n.getStringValue()); });
        deserializerMap.put("rootCertificatesForServerValidation", (n) -> { this.setRootCertificatesForServerValidation(n.getCollectionOfObjectValues(IosTrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("trustedServerCertificateNames", (n) -> { this.setTrustedServerCertificateNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("usernameFormatString", (n) -> { this.setUsernameFormatString(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityCertificateForClientAuthentication property value. Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication).
     * @return a IosCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public IosCertificateProfileBase getIdentityCertificateForClientAuthentication() {
        return this.backingStore.get("identityCertificateForClientAuthentication");
    }
    /**
     * Gets the innerAuthenticationProtocolForEapTtls property value. Non-EAP Method for Authentication when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @return a IosEnterpriseWiFiConfigurationInnerAuthenticationProtocolForEapTtls
     */
    @jakarta.annotation.Nullable
    public IosEnterpriseWiFiConfigurationInnerAuthenticationProtocolForEapTtls getInnerAuthenticationProtocolForEapTtls() {
        return this.backingStore.get("innerAuthenticationProtocolForEapTtls");
    }
    /**
     * Gets the outerIdentityPrivacyTemporaryValue property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP - TTLS, EAP - FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this Wi-Fi connection using their real username is displayed as 'anonymous'.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOuterIdentityPrivacyTemporaryValue() {
        return this.backingStore.get("outerIdentityPrivacyTemporaryValue");
    }
    /**
     * Gets the passwordFormatString property value. Password format string used to build the password to connect to wifi
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPasswordFormatString() {
        return this.backingStore.get("passwordFormatString");
    }
    /**
     * Gets the rootCertificatesForServerValidation property value. Trusted Root Certificates for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. If you provide this value you do not need to provide trustedServerCertificateNames, and vice versa. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<IosTrustedRootCertificate>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IosTrustedRootCertificate> getRootCertificatesForServerValidation() {
        return this.backingStore.get("rootCertificatesForServerValidation");
    }
    /**
     * Gets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users' devices when they connect to this Wi-Fi network.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTrustedServerCertificateNames() {
        return this.backingStore.get("trustedServerCertificateNames");
    }
    /**
     * Gets the usernameFormatString property value. Username format string used to build the username to connect to wifi
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsernameFormatString() {
        return this.backingStore.get("usernameFormatString");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final IosEnterpriseWiFiConfigurationAuthenticationMethod value) {
        this.backingStore.set("authenticationMethod", value);
    }
    /**
     * Sets the derivedCredentialSettings property value. Tenant level settings for the Derived Credentials to be used for authentication.
     * @param value Value to set for the derivedCredentialSettings property.
     */
    public void setDerivedCredentialSettings(@jakarta.annotation.Nullable final DeviceManagementDerivedCredentialSettings value) {
        this.backingStore.set("derivedCredentialSettings", value);
    }
    /**
     * Sets the eapFastConfiguration property value. EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: noProtectedAccessCredential, useProtectedAccessCredential, useProtectedAccessCredentialAndProvision, useProtectedAccessCredentialAndProvisionAnonymously.
     * @param value Value to set for the eapFastConfiguration property.
     */
    public void setEapFastConfiguration(@jakarta.annotation.Nullable final IosEnterpriseWiFiConfigurationEapFastConfiguration value) {
        this.backingStore.set("eapFastConfiguration", value);
    }
    /**
     * Sets the eapType property value. Extensible Authentication Protocol (EAP) configuration types.
     * @param value Value to set for the eapType property.
     */
    public void setEapType(@jakarta.annotation.Nullable final EapType value) {
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
     * Sets the innerAuthenticationProtocolForEapTtls property value. Non-EAP Method for Authentication when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @param value Value to set for the innerAuthenticationProtocolForEapTtls property.
     */
    public void setInnerAuthenticationProtocolForEapTtls(@jakarta.annotation.Nullable final IosEnterpriseWiFiConfigurationInnerAuthenticationProtocolForEapTtls value) {
        this.backingStore.set("innerAuthenticationProtocolForEapTtls", value);
    }
    /**
     * Sets the outerIdentityPrivacyTemporaryValue property value. Enable identity privacy (Outer Identity) when EAP Type is configured to EAP - TTLS, EAP - FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this Wi-Fi connection using their real username is displayed as 'anonymous'.
     * @param value Value to set for the outerIdentityPrivacyTemporaryValue property.
     */
    public void setOuterIdentityPrivacyTemporaryValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("outerIdentityPrivacyTemporaryValue", value);
    }
    /**
     * Sets the passwordFormatString property value. Password format string used to build the password to connect to wifi
     * @param value Value to set for the passwordFormatString property.
     */
    public void setPasswordFormatString(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("passwordFormatString", value);
    }
    /**
     * Sets the rootCertificatesForServerValidation property value. Trusted Root Certificates for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. If you provide this value you do not need to provide trustedServerCertificateNames, and vice versa. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the rootCertificatesForServerValidation property.
     */
    public void setRootCertificatesForServerValidation(@jakarta.annotation.Nullable final java.util.List<IosTrustedRootCertificate> value) {
        this.backingStore.set("rootCertificatesForServerValidation", value);
    }
    /**
     * Sets the trustedServerCertificateNames property value. Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users' devices when they connect to this Wi-Fi network.
     * @param value Value to set for the trustedServerCertificateNames property.
     */
    public void setTrustedServerCertificateNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("trustedServerCertificateNames", value);
    }
    /**
     * Sets the usernameFormatString property value. Username format string used to build the username to connect to wifi
     * @param value Value to set for the usernameFormatString property.
     */
    public void setUsernameFormatString(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("usernameFormatString", value);
    }
}
