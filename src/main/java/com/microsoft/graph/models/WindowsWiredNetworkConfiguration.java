package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This entity provides descriptions of the declared methods, properties and relationships exposed by the Wired Network CSP.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsWiredNetworkConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new WindowsWiredNetworkConfiguration and sets the default values.
     */
    public WindowsWiredNetworkConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsWiredNetworkConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsWiredNetworkConfiguration
     */
    @jakarta.annotation.Nonnull
    public static WindowsWiredNetworkConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsWiredNetworkConfiguration();
    }
    /**
     * Gets the authenticationBlockPeriodInMinutes property value. Specify the duration for which automatic authentication attempts will be blocked from occuring after a failed authentication attempt.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAuthenticationBlockPeriodInMinutes() {
        return this.backingStore.get("authenticationBlockPeriodInMinutes");
    }
    /**
     * Gets the authenticationMethod property value. Specify the authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential. Possible values are: certificate, usernameAndPassword, derivedCredential, unknownFutureValue.
     * @return a WiredNetworkAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public WiredNetworkAuthenticationMethod getAuthenticationMethod() {
        return this.backingStore.get("authenticationMethod");
    }
    /**
     * Gets the authenticationPeriodInSeconds property value. Specify the number of seconds for the client to wait after an authentication attempt before failing. Valid range 1-3600.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAuthenticationPeriodInSeconds() {
        return this.backingStore.get("authenticationPeriodInSeconds");
    }
    /**
     * Gets the authenticationRetryDelayPeriodInSeconds property value. Specify the number of seconds between a failed authentication and the next authentication attempt. Valid range 1-3600.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAuthenticationRetryDelayPeriodInSeconds() {
        return this.backingStore.get("authenticationRetryDelayPeriodInSeconds");
    }
    /**
     * Gets the authenticationType property value. Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If you're using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: none, user, machine, machineOrUser, guest. Possible values are: none, user, machine, machineOrUser, guest, unknownFutureValue.
     * @return a WiredNetworkAuthenticationType
     */
    @jakarta.annotation.Nullable
    public WiredNetworkAuthenticationType getAuthenticationType() {
        return this.backingStore.get("authenticationType");
    }
    /**
     * Gets the cacheCredentials property value. When TRUE, caches user credentials on the device so that users don't need to keep entering them each time they connect. When FALSE, do not cache credentials. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCacheCredentials() {
        return this.backingStore.get("cacheCredentials");
    }
    /**
     * Gets the disableUserPromptForServerValidation property value. When TRUE, prevents the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP. When FALSE, does not prevent the user from being prompted. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableUserPromptForServerValidation() {
        return this.backingStore.get("disableUserPromptForServerValidation");
    }
    /**
     * Gets the eapolStartPeriodInSeconds property value. Specify the number of seconds to wait before sending an EAPOL (Extensible Authentication Protocol over LAN) Start message. Valid range 1-3600.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEapolStartPeriodInSeconds() {
        return this.backingStore.get("eapolStartPeriodInSeconds");
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
     * Gets the enforce8021X property value. When TRUE, the automatic configuration service for wired networks requires the use of 802.1X for port authentication. When FALSE, 802.1X is not required. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnforce8021X() {
        return this.backingStore.get("enforce8021X");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationBlockPeriodInMinutes", (n) -> { this.setAuthenticationBlockPeriodInMinutes(n.getIntegerValue()); });
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(WiredNetworkAuthenticationMethod::forValue)); });
        deserializerMap.put("authenticationPeriodInSeconds", (n) -> { this.setAuthenticationPeriodInSeconds(n.getIntegerValue()); });
        deserializerMap.put("authenticationRetryDelayPeriodInSeconds", (n) -> { this.setAuthenticationRetryDelayPeriodInSeconds(n.getIntegerValue()); });
        deserializerMap.put("authenticationType", (n) -> { this.setAuthenticationType(n.getEnumValue(WiredNetworkAuthenticationType::forValue)); });
        deserializerMap.put("cacheCredentials", (n) -> { this.setCacheCredentials(n.getBooleanValue()); });
        deserializerMap.put("disableUserPromptForServerValidation", (n) -> { this.setDisableUserPromptForServerValidation(n.getBooleanValue()); });
        deserializerMap.put("eapolStartPeriodInSeconds", (n) -> { this.setEapolStartPeriodInSeconds(n.getIntegerValue()); });
        deserializerMap.put("eapType", (n) -> { this.setEapType(n.getEnumValue(EapType::forValue)); });
        deserializerMap.put("enforce8021X", (n) -> { this.setEnforce8021X(n.getBooleanValue()); });
        deserializerMap.put("forceFIPSCompliance", (n) -> { this.setForceFIPSCompliance(n.getBooleanValue()); });
        deserializerMap.put("identityCertificateForClientAuthentication", (n) -> { this.setIdentityCertificateForClientAuthentication(n.getObjectValue(WindowsCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("innerAuthenticationProtocolForEAPTTLS", (n) -> { this.setInnerAuthenticationProtocolForEAPTTLS(n.getEnumValue(NonEapAuthenticationMethodForEapTtlsType::forValue)); });
        deserializerMap.put("maximumAuthenticationFailures", (n) -> { this.setMaximumAuthenticationFailures(n.getIntegerValue()); });
        deserializerMap.put("maximumEAPOLStartMessages", (n) -> { this.setMaximumEAPOLStartMessages(n.getIntegerValue()); });
        deserializerMap.put("outerIdentityPrivacyTemporaryValue", (n) -> { this.setOuterIdentityPrivacyTemporaryValue(n.getStringValue()); });
        deserializerMap.put("performServerValidation", (n) -> { this.setPerformServerValidation(n.getBooleanValue()); });
        deserializerMap.put("requireCryptographicBinding", (n) -> { this.setRequireCryptographicBinding(n.getBooleanValue()); });
        deserializerMap.put("rootCertificateForClientValidation", (n) -> { this.setRootCertificateForClientValidation(n.getObjectValue(Windows81TrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("rootCertificatesForServerValidation", (n) -> { this.setRootCertificatesForServerValidation(n.getCollectionOfObjectValues(Windows81TrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("secondaryAuthenticationMethod", (n) -> { this.setSecondaryAuthenticationMethod(n.getEnumValue(WiredNetworkAuthenticationMethod::forValue)); });
        deserializerMap.put("secondaryIdentityCertificateForClientAuthentication", (n) -> { this.setSecondaryIdentityCertificateForClientAuthentication(n.getObjectValue(WindowsCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("secondaryRootCertificateForClientValidation", (n) -> { this.setSecondaryRootCertificateForClientValidation(n.getObjectValue(Windows81TrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("trustedServerCertificateNames", (n) -> { this.setTrustedServerCertificateNames(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the forceFIPSCompliance property value. When TRUE, forces FIPS compliance. When FALSE, does not enable FIPS compliance. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getForceFIPSCompliance() {
        return this.backingStore.get("forceFIPSCompliance");
    }
    /**
     * Gets the identityCertificateForClientAuthentication property value. Specify identity certificate for client authentication.
     * @return a WindowsCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public WindowsCertificateProfileBase getIdentityCertificateForClientAuthentication() {
        return this.backingStore.get("identityCertificateForClientAuthentication");
    }
    /**
     * Gets the innerAuthenticationProtocolForEAPTTLS property value. Specify inner authentication protocol for EAP TTLS. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @return a NonEapAuthenticationMethodForEapTtlsType
     */
    @jakarta.annotation.Nullable
    public NonEapAuthenticationMethodForEapTtlsType getInnerAuthenticationProtocolForEAPTTLS() {
        return this.backingStore.get("innerAuthenticationProtocolForEAPTTLS");
    }
    /**
     * Gets the maximumAuthenticationFailures property value. Specify the maximum authentication failures allowed for a set of credentials. Valid range 1-100.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumAuthenticationFailures() {
        return this.backingStore.get("maximumAuthenticationFailures");
    }
    /**
     * Gets the maximumEAPOLStartMessages property value. Specify the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumEAPOLStartMessages() {
        return this.backingStore.get("maximumEAPOLStartMessages");
    }
    /**
     * Gets the outerIdentityPrivacyTemporaryValue property value. Specify the string to replace usernames for privacy when using EAP TTLS or PEAP.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOuterIdentityPrivacyTemporaryValue() {
        return this.backingStore.get("outerIdentityPrivacyTemporaryValue");
    }
    /**
     * Gets the performServerValidation property value. When TRUE, enables verification of server's identity by validating the certificate when EAP type is selected as PEAP. When FALSE, the certificate is not validated. Default value is TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPerformServerValidation() {
        return this.backingStore.get("performServerValidation");
    }
    /**
     * Gets the requireCryptographicBinding property value. When TRUE, enables cryptographic binding when EAP type is selected as PEAP. When FALSE, does not enable cryptogrpahic binding. Default value is TRUE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireCryptographicBinding() {
        return this.backingStore.get("requireCryptographicBinding");
    }
    /**
     * Gets the rootCertificateForClientValidation property value. Specify root certificate for client validation.
     * @return a Windows81TrustedRootCertificate
     */
    @jakarta.annotation.Nullable
    public Windows81TrustedRootCertificate getRootCertificateForClientValidation() {
        return this.backingStore.get("rootCertificateForClientValidation");
    }
    /**
     * Gets the rootCertificatesForServerValidation property value. Specify root certificates for server validation. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<Windows81TrustedRootCertificate>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Windows81TrustedRootCertificate> getRootCertificatesForServerValidation() {
        return this.backingStore.get("rootCertificatesForServerValidation");
    }
    /**
     * Gets the secondaryAuthenticationMethod property value. Specify the secondary authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential. Possible values are: certificate, usernameAndPassword, derivedCredential, unknownFutureValue.
     * @return a WiredNetworkAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public WiredNetworkAuthenticationMethod getSecondaryAuthenticationMethod() {
        return this.backingStore.get("secondaryAuthenticationMethod");
    }
    /**
     * Gets the secondaryIdentityCertificateForClientAuthentication property value. Specify secondary identity certificate for client authentication.
     * @return a WindowsCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public WindowsCertificateProfileBase getSecondaryIdentityCertificateForClientAuthentication() {
        return this.backingStore.get("secondaryIdentityCertificateForClientAuthentication");
    }
    /**
     * Gets the secondaryRootCertificateForClientValidation property value. Specify secondary root certificate for client validation.
     * @return a Windows81TrustedRootCertificate
     */
    @jakarta.annotation.Nullable
    public Windows81TrustedRootCertificate getSecondaryRootCertificateForClientValidation() {
        return this.backingStore.get("secondaryRootCertificateForClientValidation");
    }
    /**
     * Gets the trustedServerCertificateNames property value. Specify trusted server certificate names.
     * @return a java.util.List<String>
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
        writer.writeIntegerValue("authenticationBlockPeriodInMinutes", this.getAuthenticationBlockPeriodInMinutes());
        writer.writeEnumValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeIntegerValue("authenticationPeriodInSeconds", this.getAuthenticationPeriodInSeconds());
        writer.writeIntegerValue("authenticationRetryDelayPeriodInSeconds", this.getAuthenticationRetryDelayPeriodInSeconds());
        writer.writeEnumValue("authenticationType", this.getAuthenticationType());
        writer.writeBooleanValue("cacheCredentials", this.getCacheCredentials());
        writer.writeBooleanValue("disableUserPromptForServerValidation", this.getDisableUserPromptForServerValidation());
        writer.writeIntegerValue("eapolStartPeriodInSeconds", this.getEapolStartPeriodInSeconds());
        writer.writeEnumValue("eapType", this.getEapType());
        writer.writeBooleanValue("enforce8021X", this.getEnforce8021X());
        writer.writeBooleanValue("forceFIPSCompliance", this.getForceFIPSCompliance());
        writer.writeObjectValue("identityCertificateForClientAuthentication", this.getIdentityCertificateForClientAuthentication());
        writer.writeEnumValue("innerAuthenticationProtocolForEAPTTLS", this.getInnerAuthenticationProtocolForEAPTTLS());
        writer.writeIntegerValue("maximumAuthenticationFailures", this.getMaximumAuthenticationFailures());
        writer.writeIntegerValue("maximumEAPOLStartMessages", this.getMaximumEAPOLStartMessages());
        writer.writeStringValue("outerIdentityPrivacyTemporaryValue", this.getOuterIdentityPrivacyTemporaryValue());
        writer.writeBooleanValue("performServerValidation", this.getPerformServerValidation());
        writer.writeBooleanValue("requireCryptographicBinding", this.getRequireCryptographicBinding());
        writer.writeObjectValue("rootCertificateForClientValidation", this.getRootCertificateForClientValidation());
        writer.writeCollectionOfObjectValues("rootCertificatesForServerValidation", this.getRootCertificatesForServerValidation());
        writer.writeEnumValue("secondaryAuthenticationMethod", this.getSecondaryAuthenticationMethod());
        writer.writeObjectValue("secondaryIdentityCertificateForClientAuthentication", this.getSecondaryIdentityCertificateForClientAuthentication());
        writer.writeObjectValue("secondaryRootCertificateForClientValidation", this.getSecondaryRootCertificateForClientValidation());
        writer.writeCollectionOfPrimitiveValues("trustedServerCertificateNames", this.getTrustedServerCertificateNames());
    }
    /**
     * Sets the authenticationBlockPeriodInMinutes property value. Specify the duration for which automatic authentication attempts will be blocked from occuring after a failed authentication attempt.
     * @param value Value to set for the authenticationBlockPeriodInMinutes property.
     */
    public void setAuthenticationBlockPeriodInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("authenticationBlockPeriodInMinutes", value);
    }
    /**
     * Sets the authenticationMethod property value. Specify the authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential. Possible values are: certificate, usernameAndPassword, derivedCredential, unknownFutureValue.
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final WiredNetworkAuthenticationMethod value) {
        this.backingStore.set("authenticationMethod", value);
    }
    /**
     * Sets the authenticationPeriodInSeconds property value. Specify the number of seconds for the client to wait after an authentication attempt before failing. Valid range 1-3600.
     * @param value Value to set for the authenticationPeriodInSeconds property.
     */
    public void setAuthenticationPeriodInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("authenticationPeriodInSeconds", value);
    }
    /**
     * Sets the authenticationRetryDelayPeriodInSeconds property value. Specify the number of seconds between a failed authentication and the next authentication attempt. Valid range 1-3600.
     * @param value Value to set for the authenticationRetryDelayPeriodInSeconds property.
     */
    public void setAuthenticationRetryDelayPeriodInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("authenticationRetryDelayPeriodInSeconds", value);
    }
    /**
     * Sets the authenticationType property value. Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If you're using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: none, user, machine, machineOrUser, guest. Possible values are: none, user, machine, machineOrUser, guest, unknownFutureValue.
     * @param value Value to set for the authenticationType property.
     */
    public void setAuthenticationType(@jakarta.annotation.Nullable final WiredNetworkAuthenticationType value) {
        this.backingStore.set("authenticationType", value);
    }
    /**
     * Sets the cacheCredentials property value. When TRUE, caches user credentials on the device so that users don't need to keep entering them each time they connect. When FALSE, do not cache credentials. Default value is FALSE.
     * @param value Value to set for the cacheCredentials property.
     */
    public void setCacheCredentials(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("cacheCredentials", value);
    }
    /**
     * Sets the disableUserPromptForServerValidation property value. When TRUE, prevents the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP. When FALSE, does not prevent the user from being prompted. Default value is FALSE.
     * @param value Value to set for the disableUserPromptForServerValidation property.
     */
    public void setDisableUserPromptForServerValidation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableUserPromptForServerValidation", value);
    }
    /**
     * Sets the eapolStartPeriodInSeconds property value. Specify the number of seconds to wait before sending an EAPOL (Extensible Authentication Protocol over LAN) Start message. Valid range 1-3600.
     * @param value Value to set for the eapolStartPeriodInSeconds property.
     */
    public void setEapolStartPeriodInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("eapolStartPeriodInSeconds", value);
    }
    /**
     * Sets the eapType property value. Extensible Authentication Protocol (EAP) configuration types.
     * @param value Value to set for the eapType property.
     */
    public void setEapType(@jakarta.annotation.Nullable final EapType value) {
        this.backingStore.set("eapType", value);
    }
    /**
     * Sets the enforce8021X property value. When TRUE, the automatic configuration service for wired networks requires the use of 802.1X for port authentication. When FALSE, 802.1X is not required. Default value is FALSE.
     * @param value Value to set for the enforce8021X property.
     */
    public void setEnforce8021X(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("enforce8021X", value);
    }
    /**
     * Sets the forceFIPSCompliance property value. When TRUE, forces FIPS compliance. When FALSE, does not enable FIPS compliance. Default value is FALSE.
     * @param value Value to set for the forceFIPSCompliance property.
     */
    public void setForceFIPSCompliance(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("forceFIPSCompliance", value);
    }
    /**
     * Sets the identityCertificateForClientAuthentication property value. Specify identity certificate for client authentication.
     * @param value Value to set for the identityCertificateForClientAuthentication property.
     */
    public void setIdentityCertificateForClientAuthentication(@jakarta.annotation.Nullable final WindowsCertificateProfileBase value) {
        this.backingStore.set("identityCertificateForClientAuthentication", value);
    }
    /**
     * Sets the innerAuthenticationProtocolForEAPTTLS property value. Specify inner authentication protocol for EAP TTLS. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @param value Value to set for the innerAuthenticationProtocolForEAPTTLS property.
     */
    public void setInnerAuthenticationProtocolForEAPTTLS(@jakarta.annotation.Nullable final NonEapAuthenticationMethodForEapTtlsType value) {
        this.backingStore.set("innerAuthenticationProtocolForEAPTTLS", value);
    }
    /**
     * Sets the maximumAuthenticationFailures property value. Specify the maximum authentication failures allowed for a set of credentials. Valid range 1-100.
     * @param value Value to set for the maximumAuthenticationFailures property.
     */
    public void setMaximumAuthenticationFailures(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maximumAuthenticationFailures", value);
    }
    /**
     * Sets the maximumEAPOLStartMessages property value. Specify the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100.
     * @param value Value to set for the maximumEAPOLStartMessages property.
     */
    public void setMaximumEAPOLStartMessages(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maximumEAPOLStartMessages", value);
    }
    /**
     * Sets the outerIdentityPrivacyTemporaryValue property value. Specify the string to replace usernames for privacy when using EAP TTLS or PEAP.
     * @param value Value to set for the outerIdentityPrivacyTemporaryValue property.
     */
    public void setOuterIdentityPrivacyTemporaryValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("outerIdentityPrivacyTemporaryValue", value);
    }
    /**
     * Sets the performServerValidation property value. When TRUE, enables verification of server's identity by validating the certificate when EAP type is selected as PEAP. When FALSE, the certificate is not validated. Default value is TRUE.
     * @param value Value to set for the performServerValidation property.
     */
    public void setPerformServerValidation(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("performServerValidation", value);
    }
    /**
     * Sets the requireCryptographicBinding property value. When TRUE, enables cryptographic binding when EAP type is selected as PEAP. When FALSE, does not enable cryptogrpahic binding. Default value is TRUE.
     * @param value Value to set for the requireCryptographicBinding property.
     */
    public void setRequireCryptographicBinding(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requireCryptographicBinding", value);
    }
    /**
     * Sets the rootCertificateForClientValidation property value. Specify root certificate for client validation.
     * @param value Value to set for the rootCertificateForClientValidation property.
     */
    public void setRootCertificateForClientValidation(@jakarta.annotation.Nullable final Windows81TrustedRootCertificate value) {
        this.backingStore.set("rootCertificateForClientValidation", value);
    }
    /**
     * Sets the rootCertificatesForServerValidation property value. Specify root certificates for server validation. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the rootCertificatesForServerValidation property.
     */
    public void setRootCertificatesForServerValidation(@jakarta.annotation.Nullable final java.util.List<Windows81TrustedRootCertificate> value) {
        this.backingStore.set("rootCertificatesForServerValidation", value);
    }
    /**
     * Sets the secondaryAuthenticationMethod property value. Specify the secondary authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential. Possible values are: certificate, usernameAndPassword, derivedCredential, unknownFutureValue.
     * @param value Value to set for the secondaryAuthenticationMethod property.
     */
    public void setSecondaryAuthenticationMethod(@jakarta.annotation.Nullable final WiredNetworkAuthenticationMethod value) {
        this.backingStore.set("secondaryAuthenticationMethod", value);
    }
    /**
     * Sets the secondaryIdentityCertificateForClientAuthentication property value. Specify secondary identity certificate for client authentication.
     * @param value Value to set for the secondaryIdentityCertificateForClientAuthentication property.
     */
    public void setSecondaryIdentityCertificateForClientAuthentication(@jakarta.annotation.Nullable final WindowsCertificateProfileBase value) {
        this.backingStore.set("secondaryIdentityCertificateForClientAuthentication", value);
    }
    /**
     * Sets the secondaryRootCertificateForClientValidation property value. Specify secondary root certificate for client validation.
     * @param value Value to set for the secondaryRootCertificateForClientValidation property.
     */
    public void setSecondaryRootCertificateForClientValidation(@jakarta.annotation.Nullable final Windows81TrustedRootCertificate value) {
        this.backingStore.set("secondaryRootCertificateForClientValidation", value);
    }
    /**
     * Sets the trustedServerCertificateNames property value. Specify trusted server certificate names.
     * @param value Value to set for the trustedServerCertificateNames property.
     */
    public void setTrustedServerCertificateNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("trustedServerCertificateNames", value);
    }
}
