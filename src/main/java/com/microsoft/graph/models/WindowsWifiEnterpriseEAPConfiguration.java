package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsWifiEnterpriseEAPConfiguration extends WindowsWifiConfiguration implements Parsable {
    /** Specify the authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential. */
    private WiFiAuthenticationMethod _authenticationMethod;
    /** Specify the number of seconds for the client to wait after an authentication attempt before failing. Valid range 1-3600. */
    private Integer _authenticationPeriodInSeconds;
    /** Specify the number of seconds between a failed authentication and the next authentication attempt. Valid range 1-3600. */
    private Integer _authenticationRetryDelayPeriodInSeconds;
    /** Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If you’re using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: none, user, machine, machineOrUser, guest. */
    private WifiAuthenticationType _authenticationType;
    /** Specify whether to cache user credentials on the device so that users don’t need to keep entering them each time they connect. */
    private Boolean _cacheCredentials;
    /** Specify whether to prevent the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP. */
    private Boolean _disableUserPromptForServerValidation;
    /** Specify the number of seconds to wait before sending an EAPOL (Extensible Authentication Protocol over LAN) Start message. Valid range 1-3600. */
    private Integer _eapolStartPeriodInSeconds;
    /** Extensible Authentication Protocol (EAP) configuration types. */
    private EapType _eapType;
    /** Specify whether the wifi connection should enable pairwise master key caching. */
    private Boolean _enablePairwiseMasterKeyCaching;
    /** Specify whether pre-authentication should be enabled. */
    private Boolean _enablePreAuthentication;
    /** Specify identity certificate for client authentication. */
    private WindowsCertificateProfileBase _identityCertificateForClientAuthentication;
    /** Specify inner authentication protocol for EAP TTLS. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo. */
    private NonEapAuthenticationMethodForEapTtlsType _innerAuthenticationProtocolForEAPTTLS;
    /** Specify the maximum authentication failures allowed for a set of credentials. Valid range 1-100. */
    private Integer _maximumAuthenticationFailures;
    /** Specify maximum authentication timeout (in seconds).  Valid range: 1-120 */
    private Integer _maximumAuthenticationTimeoutInSeconds;
    /** Specifiy the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100. */
    private Integer _maximumEAPOLStartMessages;
    /** Specify maximum number of pairwise master keys in cache.  Valid range: 1-255 */
    private Integer _maximumNumberOfPairwiseMasterKeysInCache;
    /** Specify maximum pairwise master key cache time (in minutes).  Valid range: 5-1440 */
    private Integer _maximumPairwiseMasterKeyCacheTimeInMinutes;
    /** Specify maximum pre-authentication attempts.  Valid range: 1-16 */
    private Integer _maximumPreAuthenticationAttempts;
    /** Specify the network single sign on type. Possible values are: disabled, prelogon, postlogon. */
    private NetworkSingleSignOnType _networkSingleSignOn;
    /** Specify the string to replace usernames for privacy when using EAP TTLS or PEAP. */
    private String _outerIdentityPrivacyTemporaryValue;
    /** Specify whether to enable verification of server's identity by validating the certificate when EAP type is selected as PEAP. */
    private Boolean _performServerValidation;
    /** Specify whether the wifi connection should prompt for additional authentication credentials. */
    private Boolean _promptForAdditionalAuthenticationCredentials;
    /** Specify whether to enable cryptographic binding when EAP type is selected as PEAP. */
    private Boolean _requireCryptographicBinding;
    /** Specify root certificate for client validation. */
    private Windows81TrustedRootCertificate _rootCertificateForClientValidation;
    /** Specify root certificate for server validation. This collection can contain a maximum of 500 elements. */
    private java.util.List<Windows81TrustedRootCertificate> _rootCertificatesForServerValidation;
    /** Specify trusted server certificate names. */
    private java.util.List<String> _trustedServerCertificateNames;
    /** Specifiy whether to change the virtual LAN used by the device based on the user’s credentials. Cannot be used when NetworkSingleSignOnType is set to ​Disabled. */
    private Boolean _userBasedVirtualLan;
    /**
     * Instantiates a new WindowsWifiEnterpriseEAPConfiguration and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static WindowsWifiEnterpriseEAPConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsWifiEnterpriseEAPConfiguration();
    }
    /**
     * Gets the authenticationMethod property value. Specify the authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential.
     * @return a wiFiAuthenticationMethod
     */
    @javax.annotation.Nullable
    public WiFiAuthenticationMethod getAuthenticationMethod() {
        return this._authenticationMethod;
    }
    /**
     * Gets the authenticationPeriodInSeconds property value. Specify the number of seconds for the client to wait after an authentication attempt before failing. Valid range 1-3600.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAuthenticationPeriodInSeconds() {
        return this._authenticationPeriodInSeconds;
    }
    /**
     * Gets the authenticationRetryDelayPeriodInSeconds property value. Specify the number of seconds between a failed authentication and the next authentication attempt. Valid range 1-3600.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAuthenticationRetryDelayPeriodInSeconds() {
        return this._authenticationRetryDelayPeriodInSeconds;
    }
    /**
     * Gets the authenticationType property value. Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If you’re using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: none, user, machine, machineOrUser, guest.
     * @return a wifiAuthenticationType
     */
    @javax.annotation.Nullable
    public WifiAuthenticationType getAuthenticationType() {
        return this._authenticationType;
    }
    /**
     * Gets the cacheCredentials property value. Specify whether to cache user credentials on the device so that users don’t need to keep entering them each time they connect.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCacheCredentials() {
        return this._cacheCredentials;
    }
    /**
     * Gets the disableUserPromptForServerValidation property value. Specify whether to prevent the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableUserPromptForServerValidation() {
        return this._disableUserPromptForServerValidation;
    }
    /**
     * Gets the eapolStartPeriodInSeconds property value. Specify the number of seconds to wait before sending an EAPOL (Extensible Authentication Protocol over LAN) Start message. Valid range 1-3600.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEapolStartPeriodInSeconds() {
        return this._eapolStartPeriodInSeconds;
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
     * Gets the enablePairwiseMasterKeyCaching property value. Specify whether the wifi connection should enable pairwise master key caching.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnablePairwiseMasterKeyCaching() {
        return this._enablePairwiseMasterKeyCaching;
    }
    /**
     * Gets the enablePreAuthentication property value. Specify whether pre-authentication should be enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnablePreAuthentication() {
        return this._enablePreAuthentication;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsWifiEnterpriseEAPConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getEnumValue(WiFiAuthenticationMethod.class)); });
            this.put("authenticationPeriodInSeconds", (n) -> { currentObject.setAuthenticationPeriodInSeconds(n.getIntegerValue()); });
            this.put("authenticationRetryDelayPeriodInSeconds", (n) -> { currentObject.setAuthenticationRetryDelayPeriodInSeconds(n.getIntegerValue()); });
            this.put("authenticationType", (n) -> { currentObject.setAuthenticationType(n.getEnumValue(WifiAuthenticationType.class)); });
            this.put("cacheCredentials", (n) -> { currentObject.setCacheCredentials(n.getBooleanValue()); });
            this.put("disableUserPromptForServerValidation", (n) -> { currentObject.setDisableUserPromptForServerValidation(n.getBooleanValue()); });
            this.put("eapolStartPeriodInSeconds", (n) -> { currentObject.setEapolStartPeriodInSeconds(n.getIntegerValue()); });
            this.put("eapType", (n) -> { currentObject.setEapType(n.getEnumValue(EapType.class)); });
            this.put("enablePairwiseMasterKeyCaching", (n) -> { currentObject.setEnablePairwiseMasterKeyCaching(n.getBooleanValue()); });
            this.put("enablePreAuthentication", (n) -> { currentObject.setEnablePreAuthentication(n.getBooleanValue()); });
            this.put("identityCertificateForClientAuthentication", (n) -> { currentObject.setIdentityCertificateForClientAuthentication(n.getObjectValue(WindowsCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("innerAuthenticationProtocolForEAPTTLS", (n) -> { currentObject.setInnerAuthenticationProtocolForEAPTTLS(n.getEnumValue(NonEapAuthenticationMethodForEapTtlsType.class)); });
            this.put("maximumAuthenticationFailures", (n) -> { currentObject.setMaximumAuthenticationFailures(n.getIntegerValue()); });
            this.put("maximumAuthenticationTimeoutInSeconds", (n) -> { currentObject.setMaximumAuthenticationTimeoutInSeconds(n.getIntegerValue()); });
            this.put("maximumEAPOLStartMessages", (n) -> { currentObject.setMaximumEAPOLStartMessages(n.getIntegerValue()); });
            this.put("maximumNumberOfPairwiseMasterKeysInCache", (n) -> { currentObject.setMaximumNumberOfPairwiseMasterKeysInCache(n.getIntegerValue()); });
            this.put("maximumPairwiseMasterKeyCacheTimeInMinutes", (n) -> { currentObject.setMaximumPairwiseMasterKeyCacheTimeInMinutes(n.getIntegerValue()); });
            this.put("maximumPreAuthenticationAttempts", (n) -> { currentObject.setMaximumPreAuthenticationAttempts(n.getIntegerValue()); });
            this.put("networkSingleSignOn", (n) -> { currentObject.setNetworkSingleSignOn(n.getEnumValue(NetworkSingleSignOnType.class)); });
            this.put("outerIdentityPrivacyTemporaryValue", (n) -> { currentObject.setOuterIdentityPrivacyTemporaryValue(n.getStringValue()); });
            this.put("performServerValidation", (n) -> { currentObject.setPerformServerValidation(n.getBooleanValue()); });
            this.put("promptForAdditionalAuthenticationCredentials", (n) -> { currentObject.setPromptForAdditionalAuthenticationCredentials(n.getBooleanValue()); });
            this.put("requireCryptographicBinding", (n) -> { currentObject.setRequireCryptographicBinding(n.getBooleanValue()); });
            this.put("rootCertificateForClientValidation", (n) -> { currentObject.setRootCertificateForClientValidation(n.getObjectValue(Windows81TrustedRootCertificate::createFromDiscriminatorValue)); });
            this.put("rootCertificatesForServerValidation", (n) -> { currentObject.setRootCertificatesForServerValidation(n.getCollectionOfObjectValues(Windows81TrustedRootCertificate::createFromDiscriminatorValue)); });
            this.put("trustedServerCertificateNames", (n) -> { currentObject.setTrustedServerCertificateNames(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("userBasedVirtualLan", (n) -> { currentObject.setUserBasedVirtualLan(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the identityCertificateForClientAuthentication property value. Specify identity certificate for client authentication.
     * @return a windowsCertificateProfileBase
     */
    @javax.annotation.Nullable
    public WindowsCertificateProfileBase getIdentityCertificateForClientAuthentication() {
        return this._identityCertificateForClientAuthentication;
    }
    /**
     * Gets the innerAuthenticationProtocolForEAPTTLS property value. Specify inner authentication protocol for EAP TTLS. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @return a nonEapAuthenticationMethodForEapTtlsType
     */
    @javax.annotation.Nullable
    public NonEapAuthenticationMethodForEapTtlsType getInnerAuthenticationProtocolForEAPTTLS() {
        return this._innerAuthenticationProtocolForEAPTTLS;
    }
    /**
     * Gets the maximumAuthenticationFailures property value. Specify the maximum authentication failures allowed for a set of credentials. Valid range 1-100.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumAuthenticationFailures() {
        return this._maximumAuthenticationFailures;
    }
    /**
     * Gets the maximumAuthenticationTimeoutInSeconds property value. Specify maximum authentication timeout (in seconds).  Valid range: 1-120
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumAuthenticationTimeoutInSeconds() {
        return this._maximumAuthenticationTimeoutInSeconds;
    }
    /**
     * Gets the maximumEAPOLStartMessages property value. Specifiy the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumEAPOLStartMessages() {
        return this._maximumEAPOLStartMessages;
    }
    /**
     * Gets the maximumNumberOfPairwiseMasterKeysInCache property value. Specify maximum number of pairwise master keys in cache.  Valid range: 1-255
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumNumberOfPairwiseMasterKeysInCache() {
        return this._maximumNumberOfPairwiseMasterKeysInCache;
    }
    /**
     * Gets the maximumPairwiseMasterKeyCacheTimeInMinutes property value. Specify maximum pairwise master key cache time (in minutes).  Valid range: 5-1440
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumPairwiseMasterKeyCacheTimeInMinutes() {
        return this._maximumPairwiseMasterKeyCacheTimeInMinutes;
    }
    /**
     * Gets the maximumPreAuthenticationAttempts property value. Specify maximum pre-authentication attempts.  Valid range: 1-16
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumPreAuthenticationAttempts() {
        return this._maximumPreAuthenticationAttempts;
    }
    /**
     * Gets the networkSingleSignOn property value. Specify the network single sign on type. Possible values are: disabled, prelogon, postlogon.
     * @return a networkSingleSignOnType
     */
    @javax.annotation.Nullable
    public NetworkSingleSignOnType getNetworkSingleSignOn() {
        return this._networkSingleSignOn;
    }
    /**
     * Gets the outerIdentityPrivacyTemporaryValue property value. Specify the string to replace usernames for privacy when using EAP TTLS or PEAP.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOuterIdentityPrivacyTemporaryValue() {
        return this._outerIdentityPrivacyTemporaryValue;
    }
    /**
     * Gets the performServerValidation property value. Specify whether to enable verification of server's identity by validating the certificate when EAP type is selected as PEAP.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPerformServerValidation() {
        return this._performServerValidation;
    }
    /**
     * Gets the promptForAdditionalAuthenticationCredentials property value. Specify whether the wifi connection should prompt for additional authentication credentials.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPromptForAdditionalAuthenticationCredentials() {
        return this._promptForAdditionalAuthenticationCredentials;
    }
    /**
     * Gets the requireCryptographicBinding property value. Specify whether to enable cryptographic binding when EAP type is selected as PEAP.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireCryptographicBinding() {
        return this._requireCryptographicBinding;
    }
    /**
     * Gets the rootCertificateForClientValidation property value. Specify root certificate for client validation.
     * @return a windows81TrustedRootCertificate
     */
    @javax.annotation.Nullable
    public Windows81TrustedRootCertificate getRootCertificateForClientValidation() {
        return this._rootCertificateForClientValidation;
    }
    /**
     * Gets the rootCertificatesForServerValidation property value. Specify root certificate for server validation. This collection can contain a maximum of 500 elements.
     * @return a windows81TrustedRootCertificate
     */
    @javax.annotation.Nullable
    public java.util.List<Windows81TrustedRootCertificate> getRootCertificatesForServerValidation() {
        return this._rootCertificatesForServerValidation;
    }
    /**
     * Gets the trustedServerCertificateNames property value. Specify trusted server certificate names.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTrustedServerCertificateNames() {
        return this._trustedServerCertificateNames;
    }
    /**
     * Gets the userBasedVirtualLan property value. Specifiy whether to change the virtual LAN used by the device based on the user’s credentials. Cannot be used when NetworkSingleSignOnType is set to ​Disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUserBasedVirtualLan() {
        return this._userBasedVirtualLan;
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
     * @return a void
     */
    public void setAuthenticationMethod(@javax.annotation.Nullable final WiFiAuthenticationMethod value) {
        this._authenticationMethod = value;
    }
    /**
     * Sets the authenticationPeriodInSeconds property value. Specify the number of seconds for the client to wait after an authentication attempt before failing. Valid range 1-3600.
     * @param value Value to set for the authenticationPeriodInSeconds property.
     * @return a void
     */
    public void setAuthenticationPeriodInSeconds(@javax.annotation.Nullable final Integer value) {
        this._authenticationPeriodInSeconds = value;
    }
    /**
     * Sets the authenticationRetryDelayPeriodInSeconds property value. Specify the number of seconds between a failed authentication and the next authentication attempt. Valid range 1-3600.
     * @param value Value to set for the authenticationRetryDelayPeriodInSeconds property.
     * @return a void
     */
    public void setAuthenticationRetryDelayPeriodInSeconds(@javax.annotation.Nullable final Integer value) {
        this._authenticationRetryDelayPeriodInSeconds = value;
    }
    /**
     * Sets the authenticationType property value. Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If you’re using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: none, user, machine, machineOrUser, guest.
     * @param value Value to set for the authenticationType property.
     * @return a void
     */
    public void setAuthenticationType(@javax.annotation.Nullable final WifiAuthenticationType value) {
        this._authenticationType = value;
    }
    /**
     * Sets the cacheCredentials property value. Specify whether to cache user credentials on the device so that users don’t need to keep entering them each time they connect.
     * @param value Value to set for the cacheCredentials property.
     * @return a void
     */
    public void setCacheCredentials(@javax.annotation.Nullable final Boolean value) {
        this._cacheCredentials = value;
    }
    /**
     * Sets the disableUserPromptForServerValidation property value. Specify whether to prevent the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP.
     * @param value Value to set for the disableUserPromptForServerValidation property.
     * @return a void
     */
    public void setDisableUserPromptForServerValidation(@javax.annotation.Nullable final Boolean value) {
        this._disableUserPromptForServerValidation = value;
    }
    /**
     * Sets the eapolStartPeriodInSeconds property value. Specify the number of seconds to wait before sending an EAPOL (Extensible Authentication Protocol over LAN) Start message. Valid range 1-3600.
     * @param value Value to set for the eapolStartPeriodInSeconds property.
     * @return a void
     */
    public void setEapolStartPeriodInSeconds(@javax.annotation.Nullable final Integer value) {
        this._eapolStartPeriodInSeconds = value;
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
     * Sets the enablePairwiseMasterKeyCaching property value. Specify whether the wifi connection should enable pairwise master key caching.
     * @param value Value to set for the enablePairwiseMasterKeyCaching property.
     * @return a void
     */
    public void setEnablePairwiseMasterKeyCaching(@javax.annotation.Nullable final Boolean value) {
        this._enablePairwiseMasterKeyCaching = value;
    }
    /**
     * Sets the enablePreAuthentication property value. Specify whether pre-authentication should be enabled.
     * @param value Value to set for the enablePreAuthentication property.
     * @return a void
     */
    public void setEnablePreAuthentication(@javax.annotation.Nullable final Boolean value) {
        this._enablePreAuthentication = value;
    }
    /**
     * Sets the identityCertificateForClientAuthentication property value. Specify identity certificate for client authentication.
     * @param value Value to set for the identityCertificateForClientAuthentication property.
     * @return a void
     */
    public void setIdentityCertificateForClientAuthentication(@javax.annotation.Nullable final WindowsCertificateProfileBase value) {
        this._identityCertificateForClientAuthentication = value;
    }
    /**
     * Sets the innerAuthenticationProtocolForEAPTTLS property value. Specify inner authentication protocol for EAP TTLS. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     * @param value Value to set for the innerAuthenticationProtocolForEAPTTLS property.
     * @return a void
     */
    public void setInnerAuthenticationProtocolForEAPTTLS(@javax.annotation.Nullable final NonEapAuthenticationMethodForEapTtlsType value) {
        this._innerAuthenticationProtocolForEAPTTLS = value;
    }
    /**
     * Sets the maximumAuthenticationFailures property value. Specify the maximum authentication failures allowed for a set of credentials. Valid range 1-100.
     * @param value Value to set for the maximumAuthenticationFailures property.
     * @return a void
     */
    public void setMaximumAuthenticationFailures(@javax.annotation.Nullable final Integer value) {
        this._maximumAuthenticationFailures = value;
    }
    /**
     * Sets the maximumAuthenticationTimeoutInSeconds property value. Specify maximum authentication timeout (in seconds).  Valid range: 1-120
     * @param value Value to set for the maximumAuthenticationTimeoutInSeconds property.
     * @return a void
     */
    public void setMaximumAuthenticationTimeoutInSeconds(@javax.annotation.Nullable final Integer value) {
        this._maximumAuthenticationTimeoutInSeconds = value;
    }
    /**
     * Sets the maximumEAPOLStartMessages property value. Specifiy the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100.
     * @param value Value to set for the maximumEAPOLStartMessages property.
     * @return a void
     */
    public void setMaximumEAPOLStartMessages(@javax.annotation.Nullable final Integer value) {
        this._maximumEAPOLStartMessages = value;
    }
    /**
     * Sets the maximumNumberOfPairwiseMasterKeysInCache property value. Specify maximum number of pairwise master keys in cache.  Valid range: 1-255
     * @param value Value to set for the maximumNumberOfPairwiseMasterKeysInCache property.
     * @return a void
     */
    public void setMaximumNumberOfPairwiseMasterKeysInCache(@javax.annotation.Nullable final Integer value) {
        this._maximumNumberOfPairwiseMasterKeysInCache = value;
    }
    /**
     * Sets the maximumPairwiseMasterKeyCacheTimeInMinutes property value. Specify maximum pairwise master key cache time (in minutes).  Valid range: 5-1440
     * @param value Value to set for the maximumPairwiseMasterKeyCacheTimeInMinutes property.
     * @return a void
     */
    public void setMaximumPairwiseMasterKeyCacheTimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this._maximumPairwiseMasterKeyCacheTimeInMinutes = value;
    }
    /**
     * Sets the maximumPreAuthenticationAttempts property value. Specify maximum pre-authentication attempts.  Valid range: 1-16
     * @param value Value to set for the maximumPreAuthenticationAttempts property.
     * @return a void
     */
    public void setMaximumPreAuthenticationAttempts(@javax.annotation.Nullable final Integer value) {
        this._maximumPreAuthenticationAttempts = value;
    }
    /**
     * Sets the networkSingleSignOn property value. Specify the network single sign on type. Possible values are: disabled, prelogon, postlogon.
     * @param value Value to set for the networkSingleSignOn property.
     * @return a void
     */
    public void setNetworkSingleSignOn(@javax.annotation.Nullable final NetworkSingleSignOnType value) {
        this._networkSingleSignOn = value;
    }
    /**
     * Sets the outerIdentityPrivacyTemporaryValue property value. Specify the string to replace usernames for privacy when using EAP TTLS or PEAP.
     * @param value Value to set for the outerIdentityPrivacyTemporaryValue property.
     * @return a void
     */
    public void setOuterIdentityPrivacyTemporaryValue(@javax.annotation.Nullable final String value) {
        this._outerIdentityPrivacyTemporaryValue = value;
    }
    /**
     * Sets the performServerValidation property value. Specify whether to enable verification of server's identity by validating the certificate when EAP type is selected as PEAP.
     * @param value Value to set for the performServerValidation property.
     * @return a void
     */
    public void setPerformServerValidation(@javax.annotation.Nullable final Boolean value) {
        this._performServerValidation = value;
    }
    /**
     * Sets the promptForAdditionalAuthenticationCredentials property value. Specify whether the wifi connection should prompt for additional authentication credentials.
     * @param value Value to set for the promptForAdditionalAuthenticationCredentials property.
     * @return a void
     */
    public void setPromptForAdditionalAuthenticationCredentials(@javax.annotation.Nullable final Boolean value) {
        this._promptForAdditionalAuthenticationCredentials = value;
    }
    /**
     * Sets the requireCryptographicBinding property value. Specify whether to enable cryptographic binding when EAP type is selected as PEAP.
     * @param value Value to set for the requireCryptographicBinding property.
     * @return a void
     */
    public void setRequireCryptographicBinding(@javax.annotation.Nullable final Boolean value) {
        this._requireCryptographicBinding = value;
    }
    /**
     * Sets the rootCertificateForClientValidation property value. Specify root certificate for client validation.
     * @param value Value to set for the rootCertificateForClientValidation property.
     * @return a void
     */
    public void setRootCertificateForClientValidation(@javax.annotation.Nullable final Windows81TrustedRootCertificate value) {
        this._rootCertificateForClientValidation = value;
    }
    /**
     * Sets the rootCertificatesForServerValidation property value. Specify root certificate for server validation. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the rootCertificatesForServerValidation property.
     * @return a void
     */
    public void setRootCertificatesForServerValidation(@javax.annotation.Nullable final java.util.List<Windows81TrustedRootCertificate> value) {
        this._rootCertificatesForServerValidation = value;
    }
    /**
     * Sets the trustedServerCertificateNames property value. Specify trusted server certificate names.
     * @param value Value to set for the trustedServerCertificateNames property.
     * @return a void
     */
    public void setTrustedServerCertificateNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._trustedServerCertificateNames = value;
    }
    /**
     * Sets the userBasedVirtualLan property value. Specifiy whether to change the virtual LAN used by the device based on the user’s credentials. Cannot be used when NetworkSingleSignOnType is set to ​Disabled.
     * @param value Value to set for the userBasedVirtualLan property.
     * @return a void
     */
    public void setUserBasedVirtualLan(@javax.annotation.Nullable final Boolean value) {
        this._userBasedVirtualLan = value;
    }
}
