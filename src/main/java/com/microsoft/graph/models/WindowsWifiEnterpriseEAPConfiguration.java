package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This entity provides descriptions of the declared methods, properties and relationships exposed by the Wifi CSP.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsWifiEnterpriseEAPConfiguration extends WindowsWifiConfiguration implements Parsable {
    /**
     * Specify the authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential.
     */
    private WiFiAuthenticationMethod authenticationMethod;
    /**
     * Specify the number of seconds for the client to wait after an authentication attempt before failing. Valid range 1-3600.
     */
    private Integer authenticationPeriodInSeconds;
    /**
     * Specify the number of seconds between a failed authentication and the next authentication attempt. Valid range 1-3600.
     */
    private Integer authenticationRetryDelayPeriodInSeconds;
    /**
     * Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If youre using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: none, user, machine, machineOrUser, guest.
     */
    private WifiAuthenticationType authenticationType;
    /**
     * Specify whether to cache user credentials on the device so that users dont need to keep entering them each time they connect.
     */
    private Boolean cacheCredentials;
    /**
     * Specify whether to prevent the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP.
     */
    private Boolean disableUserPromptForServerValidation;
    /**
     * Specify the number of seconds to wait before sending an EAPOL (Extensible Authentication Protocol over LAN) Start message. Valid range 1-3600.
     */
    private Integer eapolStartPeriodInSeconds;
    /**
     * Extensible Authentication Protocol (EAP) configuration types.
     */
    private EapType eapType;
    /**
     * Specify whether the wifi connection should enable pairwise master key caching.
     */
    private Boolean enablePairwiseMasterKeyCaching;
    /**
     * Specify whether pre-authentication should be enabled.
     */
    private Boolean enablePreAuthentication;
    /**
     * Specify identity certificate for client authentication.
     */
    private WindowsCertificateProfileBase identityCertificateForClientAuthentication;
    /**
     * Specify inner authentication protocol for EAP TTLS. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     */
    private NonEapAuthenticationMethodForEapTtlsType innerAuthenticationProtocolForEAPTTLS;
    /**
     * Specify the maximum authentication failures allowed for a set of credentials. Valid range 1-100.
     */
    private Integer maximumAuthenticationFailures;
    /**
     * Specify maximum authentication timeout (in seconds).  Valid range: 1-120
     */
    private Integer maximumAuthenticationTimeoutInSeconds;
    /**
     * Specifiy the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100.
     */
    private Integer maximumEAPOLStartMessages;
    /**
     * Specify maximum number of pairwise master keys in cache.  Valid range: 1-255
     */
    private Integer maximumNumberOfPairwiseMasterKeysInCache;
    /**
     * Specify maximum pairwise master key cache time (in minutes).  Valid range: 5-1440
     */
    private Integer maximumPairwiseMasterKeyCacheTimeInMinutes;
    /**
     * Specify maximum pre-authentication attempts.  Valid range: 1-16
     */
    private Integer maximumPreAuthenticationAttempts;
    /**
     * Specify the network single sign on type. Possible values are: disabled, prelogon, postlogon.
     */
    private NetworkSingleSignOnType networkSingleSignOn;
    /**
     * Specify the string to replace usernames for privacy when using EAP TTLS or PEAP.
     */
    private String outerIdentityPrivacyTemporaryValue;
    /**
     * Specify whether to enable verification of server's identity by validating the certificate when EAP type is selected as PEAP.
     */
    private Boolean performServerValidation;
    /**
     * Specify whether the wifi connection should prompt for additional authentication credentials.
     */
    private Boolean promptForAdditionalAuthenticationCredentials;
    /**
     * Specify whether to enable cryptographic binding when EAP type is selected as PEAP.
     */
    private Boolean requireCryptographicBinding;
    /**
     * Specify root certificate for client validation.
     */
    private Windows81TrustedRootCertificate rootCertificateForClientValidation;
    /**
     * Specify root certificate for server validation. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<Windows81TrustedRootCertificate> rootCertificatesForServerValidation;
    /**
     * Specify trusted server certificate names.
     */
    private java.util.List<String> trustedServerCertificateNames;
    /**
     * Specifiy whether to change the virtual LAN used by the device based on the users credentials. Cannot be used when NetworkSingleSignOnType is set to Disabled.
     */
    private Boolean userBasedVirtualLan;
    /**
     * Instantiates a new WindowsWifiEnterpriseEAPConfiguration and sets the default values.
     */
    public WindowsWifiEnterpriseEAPConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsWifiEnterpriseEAPConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsWifiEnterpriseEAPConfiguration
     */
    @jakarta.annotation.Nonnull
    public static WindowsWifiEnterpriseEAPConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsWifiEnterpriseEAPConfiguration();
    }
    /**
     * Gets the authenticationMethod property value. Specify the authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential.
     * @return a WiFiAuthenticationMethod
     */
    @jakarta.annotation.Nullable
    public WiFiAuthenticationMethod getAuthenticationMethod() {
        return this.authenticationMethod;
    }
    /**
     * Gets the authenticationPeriodInSeconds property value. Specify the number of seconds for the client to wait after an authentication attempt before failing. Valid range 1-3600.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAuthenticationPeriodInSeconds() {
        return this.authenticationPeriodInSeconds;
    }
    /**
     * Gets the authenticationRetryDelayPeriodInSeconds property value. Specify the number of seconds between a failed authentication and the next authentication attempt. Valid range 1-3600.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAuthenticationRetryDelayPeriodInSeconds() {
        return this.authenticationRetryDelayPeriodInSeconds;
    }
    /**
     * Gets the authenticationType property value. Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If youre using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: none, user, machine, machineOrUser, guest.
     * @return a WifiAuthenticationType
     */
    @jakarta.annotation.Nullable
    public WifiAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }
    /**
     * Gets the cacheCredentials property value. Specify whether to cache user credentials on the device so that users dont need to keep entering them each time they connect.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCacheCredentials() {
        return this.cacheCredentials;
    }
    /**
     * Gets the disableUserPromptForServerValidation property value. Specify whether to prevent the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableUserPromptForServerValidation() {
        return this.disableUserPromptForServerValidation;
    }
    /**
     * Gets the eapolStartPeriodInSeconds property value. Specify the number of seconds to wait before sending an EAPOL (Extensible Authentication Protocol over LAN) Start message. Valid range 1-3600.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEapolStartPeriodInSeconds() {
        return this.eapolStartPeriodInSeconds;
    }
    /**
     * Gets the eapType property value. Extensible Authentication Protocol (EAP) configuration types.
     * @return a EapType
     */
    @jakarta.annotation.Nullable
    public EapType getEapType() {
        return this.eapType;
    }
    /**
     * Gets the enablePairwiseMasterKeyCaching property value. Specify whether the wifi connection should enable pairwise master key caching.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnablePairwiseMasterKeyCaching() {
        return this.enablePairwiseMasterKeyCaching;
    }
    /**
     * Gets the enablePreAuthentication property value. Specify whether pre-authentication should be enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnablePreAuthentication() {
        return this.enablePreAuthentication;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationMethod", (n) -> { this.setAuthenticationMethod(n.getEnumValue(WiFiAuthenticationMethod.class)); });
        deserializerMap.put("authenticationPeriodInSeconds", (n) -> { this.setAuthenticationPeriodInSeconds(n.getIntegerValue()); });
        deserializerMap.put("authenticationRetryDelayPeriodInSeconds", (n) -> { this.setAuthenticationRetryDelayPeriodInSeconds(n.getIntegerValue()); });
        deserializerMap.put("authenticationType", (n) -> { this.setAuthenticationType(n.getEnumValue(WifiAuthenticationType.class)); });
        deserializerMap.put("cacheCredentials", (n) -> { this.setCacheCredentials(n.getBooleanValue()); });
        deserializerMap.put("disableUserPromptForServerValidation", (n) -> { this.setDisableUserPromptForServerValidation(n.getBooleanValue()); });
        deserializerMap.put("eapolStartPeriodInSeconds", (n) -> { this.setEapolStartPeriodInSeconds(n.getIntegerValue()); });
        deserializerMap.put("eapType", (n) -> { this.setEapType(n.getEnumValue(EapType.class)); });
        deserializerMap.put("enablePairwiseMasterKeyCaching", (n) -> { this.setEnablePairwiseMasterKeyCaching(n.getBooleanValue()); });
        deserializerMap.put("enablePreAuthentication", (n) -> { this.setEnablePreAuthentication(n.getBooleanValue()); });
        deserializerMap.put("identityCertificateForClientAuthentication", (n) -> { this.setIdentityCertificateForClientAuthentication(n.getObjectValue(WindowsCertificateProfileBase::createFromDiscriminatorValue)); });
        deserializerMap.put("innerAuthenticationProtocolForEAPTTLS", (n) -> { this.setInnerAuthenticationProtocolForEAPTTLS(n.getEnumValue(NonEapAuthenticationMethodForEapTtlsType.class)); });
        deserializerMap.put("maximumAuthenticationFailures", (n) -> { this.setMaximumAuthenticationFailures(n.getIntegerValue()); });
        deserializerMap.put("maximumAuthenticationTimeoutInSeconds", (n) -> { this.setMaximumAuthenticationTimeoutInSeconds(n.getIntegerValue()); });
        deserializerMap.put("maximumEAPOLStartMessages", (n) -> { this.setMaximumEAPOLStartMessages(n.getIntegerValue()); });
        deserializerMap.put("maximumNumberOfPairwiseMasterKeysInCache", (n) -> { this.setMaximumNumberOfPairwiseMasterKeysInCache(n.getIntegerValue()); });
        deserializerMap.put("maximumPairwiseMasterKeyCacheTimeInMinutes", (n) -> { this.setMaximumPairwiseMasterKeyCacheTimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("maximumPreAuthenticationAttempts", (n) -> { this.setMaximumPreAuthenticationAttempts(n.getIntegerValue()); });
        deserializerMap.put("networkSingleSignOn", (n) -> { this.setNetworkSingleSignOn(n.getEnumValue(NetworkSingleSignOnType.class)); });
        deserializerMap.put("outerIdentityPrivacyTemporaryValue", (n) -> { this.setOuterIdentityPrivacyTemporaryValue(n.getStringValue()); });
        deserializerMap.put("performServerValidation", (n) -> { this.setPerformServerValidation(n.getBooleanValue()); });
        deserializerMap.put("promptForAdditionalAuthenticationCredentials", (n) -> { this.setPromptForAdditionalAuthenticationCredentials(n.getBooleanValue()); });
        deserializerMap.put("requireCryptographicBinding", (n) -> { this.setRequireCryptographicBinding(n.getBooleanValue()); });
        deserializerMap.put("rootCertificateForClientValidation", (n) -> { this.setRootCertificateForClientValidation(n.getObjectValue(Windows81TrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("rootCertificatesForServerValidation", (n) -> { this.setRootCertificatesForServerValidation(n.getCollectionOfObjectValues(Windows81TrustedRootCertificate::createFromDiscriminatorValue)); });
        deserializerMap.put("trustedServerCertificateNames", (n) -> { this.setTrustedServerCertificateNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("userBasedVirtualLan", (n) -> { this.setUserBasedVirtualLan(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityCertificateForClientAuthentication property value. Specify identity certificate for client authentication.
     * @return a WindowsCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public WindowsCertificateProfileBase getIdentityCertificateForClientAuthentication() {
        return this.identityCertificateForClientAuthentication;
    }
    /**
     * Gets the innerAuthenticationProtocolForEAPTTLS property value. Specify inner authentication protocol for EAP TTLS. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @return a NonEapAuthenticationMethodForEapTtlsType
     */
    @jakarta.annotation.Nullable
    public NonEapAuthenticationMethodForEapTtlsType getInnerAuthenticationProtocolForEAPTTLS() {
        return this.innerAuthenticationProtocolForEAPTTLS;
    }
    /**
     * Gets the maximumAuthenticationFailures property value. Specify the maximum authentication failures allowed for a set of credentials. Valid range 1-100.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumAuthenticationFailures() {
        return this.maximumAuthenticationFailures;
    }
    /**
     * Gets the maximumAuthenticationTimeoutInSeconds property value. Specify maximum authentication timeout (in seconds).  Valid range: 1-120
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumAuthenticationTimeoutInSeconds() {
        return this.maximumAuthenticationTimeoutInSeconds;
    }
    /**
     * Gets the maximumEAPOLStartMessages property value. Specifiy the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumEAPOLStartMessages() {
        return this.maximumEAPOLStartMessages;
    }
    /**
     * Gets the maximumNumberOfPairwiseMasterKeysInCache property value. Specify maximum number of pairwise master keys in cache.  Valid range: 1-255
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumNumberOfPairwiseMasterKeysInCache() {
        return this.maximumNumberOfPairwiseMasterKeysInCache;
    }
    /**
     * Gets the maximumPairwiseMasterKeyCacheTimeInMinutes property value. Specify maximum pairwise master key cache time (in minutes).  Valid range: 5-1440
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumPairwiseMasterKeyCacheTimeInMinutes() {
        return this.maximumPairwiseMasterKeyCacheTimeInMinutes;
    }
    /**
     * Gets the maximumPreAuthenticationAttempts property value. Specify maximum pre-authentication attempts.  Valid range: 1-16
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumPreAuthenticationAttempts() {
        return this.maximumPreAuthenticationAttempts;
    }
    /**
     * Gets the networkSingleSignOn property value. Specify the network single sign on type. Possible values are: disabled, prelogon, postlogon.
     * @return a NetworkSingleSignOnType
     */
    @jakarta.annotation.Nullable
    public NetworkSingleSignOnType getNetworkSingleSignOn() {
        return this.networkSingleSignOn;
    }
    /**
     * Gets the outerIdentityPrivacyTemporaryValue property value. Specify the string to replace usernames for privacy when using EAP TTLS or PEAP.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOuterIdentityPrivacyTemporaryValue() {
        return this.outerIdentityPrivacyTemporaryValue;
    }
    /**
     * Gets the performServerValidation property value. Specify whether to enable verification of server's identity by validating the certificate when EAP type is selected as PEAP.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPerformServerValidation() {
        return this.performServerValidation;
    }
    /**
     * Gets the promptForAdditionalAuthenticationCredentials property value. Specify whether the wifi connection should prompt for additional authentication credentials.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPromptForAdditionalAuthenticationCredentials() {
        return this.promptForAdditionalAuthenticationCredentials;
    }
    /**
     * Gets the requireCryptographicBinding property value. Specify whether to enable cryptographic binding when EAP type is selected as PEAP.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireCryptographicBinding() {
        return this.requireCryptographicBinding;
    }
    /**
     * Gets the rootCertificateForClientValidation property value. Specify root certificate for client validation.
     * @return a Windows81TrustedRootCertificate
     */
    @jakarta.annotation.Nullable
    public Windows81TrustedRootCertificate getRootCertificateForClientValidation() {
        return this.rootCertificateForClientValidation;
    }
    /**
     * Gets the rootCertificatesForServerValidation property value. Specify root certificate for server validation. This collection can contain a maximum of 500 elements.
     * @return a java.util.List<Windows81TrustedRootCertificate>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Windows81TrustedRootCertificate> getRootCertificatesForServerValidation() {
        return this.rootCertificatesForServerValidation;
    }
    /**
     * Gets the trustedServerCertificateNames property value. Specify trusted server certificate names.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTrustedServerCertificateNames() {
        return this.trustedServerCertificateNames;
    }
    /**
     * Gets the userBasedVirtualLan property value. Specifiy whether to change the virtual LAN used by the device based on the users credentials. Cannot be used when NetworkSingleSignOnType is set to Disabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUserBasedVirtualLan() {
        return this.userBasedVirtualLan;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("authenticationMethod", this.getAuthenticationMethod());
        writer.writeIntegerValue("authenticationPeriodInSeconds", this.getAuthenticationPeriodInSeconds());
        writer.writeIntegerValue("authenticationRetryDelayPeriodInSeconds", this.getAuthenticationRetryDelayPeriodInSeconds());
        writer.writeEnumValue("authenticationType", this.getAuthenticationType());
        writer.writeBooleanValue("cacheCredentials", this.getCacheCredentials());
        writer.writeBooleanValue("disableUserPromptForServerValidation", this.getDisableUserPromptForServerValidation());
        writer.writeIntegerValue("eapolStartPeriodInSeconds", this.getEapolStartPeriodInSeconds());
        writer.writeEnumValue("eapType", this.getEapType());
        writer.writeBooleanValue("enablePairwiseMasterKeyCaching", this.getEnablePairwiseMasterKeyCaching());
        writer.writeBooleanValue("enablePreAuthentication", this.getEnablePreAuthentication());
        writer.writeObjectValue("identityCertificateForClientAuthentication", this.getIdentityCertificateForClientAuthentication());
        writer.writeEnumValue("innerAuthenticationProtocolForEAPTTLS", this.getInnerAuthenticationProtocolForEAPTTLS());
        writer.writeIntegerValue("maximumAuthenticationFailures", this.getMaximumAuthenticationFailures());
        writer.writeIntegerValue("maximumAuthenticationTimeoutInSeconds", this.getMaximumAuthenticationTimeoutInSeconds());
        writer.writeIntegerValue("maximumEAPOLStartMessages", this.getMaximumEAPOLStartMessages());
        writer.writeIntegerValue("maximumNumberOfPairwiseMasterKeysInCache", this.getMaximumNumberOfPairwiseMasterKeysInCache());
        writer.writeIntegerValue("maximumPairwiseMasterKeyCacheTimeInMinutes", this.getMaximumPairwiseMasterKeyCacheTimeInMinutes());
        writer.writeIntegerValue("maximumPreAuthenticationAttempts", this.getMaximumPreAuthenticationAttempts());
        writer.writeEnumValue("networkSingleSignOn", this.getNetworkSingleSignOn());
        writer.writeStringValue("outerIdentityPrivacyTemporaryValue", this.getOuterIdentityPrivacyTemporaryValue());
        writer.writeBooleanValue("performServerValidation", this.getPerformServerValidation());
        writer.writeBooleanValue("promptForAdditionalAuthenticationCredentials", this.getPromptForAdditionalAuthenticationCredentials());
        writer.writeBooleanValue("requireCryptographicBinding", this.getRequireCryptographicBinding());
        writer.writeObjectValue("rootCertificateForClientValidation", this.getRootCertificateForClientValidation());
        writer.writeCollectionOfObjectValues("rootCertificatesForServerValidation", this.getRootCertificatesForServerValidation());
        writer.writeCollectionOfPrimitiveValues("trustedServerCertificateNames", this.getTrustedServerCertificateNames());
        writer.writeBooleanValue("userBasedVirtualLan", this.getUserBasedVirtualLan());
    }
    /**
     * Sets the authenticationMethod property value. Specify the authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential.
     * @param value Value to set for the authenticationMethod property.
     */
    public void setAuthenticationMethod(@jakarta.annotation.Nullable final WiFiAuthenticationMethod value) {
        this.authenticationMethod = value;
    }
    /**
     * Sets the authenticationPeriodInSeconds property value. Specify the number of seconds for the client to wait after an authentication attempt before failing. Valid range 1-3600.
     * @param value Value to set for the authenticationPeriodInSeconds property.
     */
    public void setAuthenticationPeriodInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.authenticationPeriodInSeconds = value;
    }
    /**
     * Sets the authenticationRetryDelayPeriodInSeconds property value. Specify the number of seconds between a failed authentication and the next authentication attempt. Valid range 1-3600.
     * @param value Value to set for the authenticationRetryDelayPeriodInSeconds property.
     */
    public void setAuthenticationRetryDelayPeriodInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.authenticationRetryDelayPeriodInSeconds = value;
    }
    /**
     * Sets the authenticationType property value. Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If youre using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: none, user, machine, machineOrUser, guest.
     * @param value Value to set for the authenticationType property.
     */
    public void setAuthenticationType(@jakarta.annotation.Nullable final WifiAuthenticationType value) {
        this.authenticationType = value;
    }
    /**
     * Sets the cacheCredentials property value. Specify whether to cache user credentials on the device so that users dont need to keep entering them each time they connect.
     * @param value Value to set for the cacheCredentials property.
     */
    public void setCacheCredentials(@jakarta.annotation.Nullable final Boolean value) {
        this.cacheCredentials = value;
    }
    /**
     * Sets the disableUserPromptForServerValidation property value. Specify whether to prevent the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP.
     * @param value Value to set for the disableUserPromptForServerValidation property.
     */
    public void setDisableUserPromptForServerValidation(@jakarta.annotation.Nullable final Boolean value) {
        this.disableUserPromptForServerValidation = value;
    }
    /**
     * Sets the eapolStartPeriodInSeconds property value. Specify the number of seconds to wait before sending an EAPOL (Extensible Authentication Protocol over LAN) Start message. Valid range 1-3600.
     * @param value Value to set for the eapolStartPeriodInSeconds property.
     */
    public void setEapolStartPeriodInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.eapolStartPeriodInSeconds = value;
    }
    /**
     * Sets the eapType property value. Extensible Authentication Protocol (EAP) configuration types.
     * @param value Value to set for the eapType property.
     */
    public void setEapType(@jakarta.annotation.Nullable final EapType value) {
        this.eapType = value;
    }
    /**
     * Sets the enablePairwiseMasterKeyCaching property value. Specify whether the wifi connection should enable pairwise master key caching.
     * @param value Value to set for the enablePairwiseMasterKeyCaching property.
     */
    public void setEnablePairwiseMasterKeyCaching(@jakarta.annotation.Nullable final Boolean value) {
        this.enablePairwiseMasterKeyCaching = value;
    }
    /**
     * Sets the enablePreAuthentication property value. Specify whether pre-authentication should be enabled.
     * @param value Value to set for the enablePreAuthentication property.
     */
    public void setEnablePreAuthentication(@jakarta.annotation.Nullable final Boolean value) {
        this.enablePreAuthentication = value;
    }
    /**
     * Sets the identityCertificateForClientAuthentication property value. Specify identity certificate for client authentication.
     * @param value Value to set for the identityCertificateForClientAuthentication property.
     */
    public void setIdentityCertificateForClientAuthentication(@jakarta.annotation.Nullable final WindowsCertificateProfileBase value) {
        this.identityCertificateForClientAuthentication = value;
    }
    /**
     * Sets the innerAuthenticationProtocolForEAPTTLS property value. Specify inner authentication protocol for EAP TTLS. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @param value Value to set for the innerAuthenticationProtocolForEAPTTLS property.
     */
    public void setInnerAuthenticationProtocolForEAPTTLS(@jakarta.annotation.Nullable final NonEapAuthenticationMethodForEapTtlsType value) {
        this.innerAuthenticationProtocolForEAPTTLS = value;
    }
    /**
     * Sets the maximumAuthenticationFailures property value. Specify the maximum authentication failures allowed for a set of credentials. Valid range 1-100.
     * @param value Value to set for the maximumAuthenticationFailures property.
     */
    public void setMaximumAuthenticationFailures(@jakarta.annotation.Nullable final Integer value) {
        this.maximumAuthenticationFailures = value;
    }
    /**
     * Sets the maximumAuthenticationTimeoutInSeconds property value. Specify maximum authentication timeout (in seconds).  Valid range: 1-120
     * @param value Value to set for the maximumAuthenticationTimeoutInSeconds property.
     */
    public void setMaximumAuthenticationTimeoutInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.maximumAuthenticationTimeoutInSeconds = value;
    }
    /**
     * Sets the maximumEAPOLStartMessages property value. Specifiy the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100.
     * @param value Value to set for the maximumEAPOLStartMessages property.
     */
    public void setMaximumEAPOLStartMessages(@jakarta.annotation.Nullable final Integer value) {
        this.maximumEAPOLStartMessages = value;
    }
    /**
     * Sets the maximumNumberOfPairwiseMasterKeysInCache property value. Specify maximum number of pairwise master keys in cache.  Valid range: 1-255
     * @param value Value to set for the maximumNumberOfPairwiseMasterKeysInCache property.
     */
    public void setMaximumNumberOfPairwiseMasterKeysInCache(@jakarta.annotation.Nullable final Integer value) {
        this.maximumNumberOfPairwiseMasterKeysInCache = value;
    }
    /**
     * Sets the maximumPairwiseMasterKeyCacheTimeInMinutes property value. Specify maximum pairwise master key cache time (in minutes).  Valid range: 5-1440
     * @param value Value to set for the maximumPairwiseMasterKeyCacheTimeInMinutes property.
     */
    public void setMaximumPairwiseMasterKeyCacheTimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.maximumPairwiseMasterKeyCacheTimeInMinutes = value;
    }
    /**
     * Sets the maximumPreAuthenticationAttempts property value. Specify maximum pre-authentication attempts.  Valid range: 1-16
     * @param value Value to set for the maximumPreAuthenticationAttempts property.
     */
    public void setMaximumPreAuthenticationAttempts(@jakarta.annotation.Nullable final Integer value) {
        this.maximumPreAuthenticationAttempts = value;
    }
    /**
     * Sets the networkSingleSignOn property value. Specify the network single sign on type. Possible values are: disabled, prelogon, postlogon.
     * @param value Value to set for the networkSingleSignOn property.
     */
    public void setNetworkSingleSignOn(@jakarta.annotation.Nullable final NetworkSingleSignOnType value) {
        this.networkSingleSignOn = value;
    }
    /**
     * Sets the outerIdentityPrivacyTemporaryValue property value. Specify the string to replace usernames for privacy when using EAP TTLS or PEAP.
     * @param value Value to set for the outerIdentityPrivacyTemporaryValue property.
     */
    public void setOuterIdentityPrivacyTemporaryValue(@jakarta.annotation.Nullable final String value) {
        this.outerIdentityPrivacyTemporaryValue = value;
    }
    /**
     * Sets the performServerValidation property value. Specify whether to enable verification of server's identity by validating the certificate when EAP type is selected as PEAP.
     * @param value Value to set for the performServerValidation property.
     */
    public void setPerformServerValidation(@jakarta.annotation.Nullable final Boolean value) {
        this.performServerValidation = value;
    }
    /**
     * Sets the promptForAdditionalAuthenticationCredentials property value. Specify whether the wifi connection should prompt for additional authentication credentials.
     * @param value Value to set for the promptForAdditionalAuthenticationCredentials property.
     */
    public void setPromptForAdditionalAuthenticationCredentials(@jakarta.annotation.Nullable final Boolean value) {
        this.promptForAdditionalAuthenticationCredentials = value;
    }
    /**
     * Sets the requireCryptographicBinding property value. Specify whether to enable cryptographic binding when EAP type is selected as PEAP.
     * @param value Value to set for the requireCryptographicBinding property.
     */
    public void setRequireCryptographicBinding(@jakarta.annotation.Nullable final Boolean value) {
        this.requireCryptographicBinding = value;
    }
    /**
     * Sets the rootCertificateForClientValidation property value. Specify root certificate for client validation.
     * @param value Value to set for the rootCertificateForClientValidation property.
     */
    public void setRootCertificateForClientValidation(@jakarta.annotation.Nullable final Windows81TrustedRootCertificate value) {
        this.rootCertificateForClientValidation = value;
    }
    /**
     * Sets the rootCertificatesForServerValidation property value. Specify root certificate for server validation. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the rootCertificatesForServerValidation property.
     */
    public void setRootCertificatesForServerValidation(@jakarta.annotation.Nullable final java.util.List<Windows81TrustedRootCertificate> value) {
        this.rootCertificatesForServerValidation = value;
    }
    /**
     * Sets the trustedServerCertificateNames property value. Specify trusted server certificate names.
     * @param value Value to set for the trustedServerCertificateNames property.
     */
    public void setTrustedServerCertificateNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.trustedServerCertificateNames = value;
    }
    /**
     * Sets the userBasedVirtualLan property value. Specifiy whether to change the virtual LAN used by the device based on the users credentials. Cannot be used when NetworkSingleSignOnType is set to Disabled.
     * @param value Value to set for the userBasedVirtualLan property.
     */
    public void setUserBasedVirtualLan(@jakarta.annotation.Nullable final Boolean value) {
        this.userBasedVirtualLan = value;
    }
}
