package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsWiredNetworkConfiguration extends DeviceConfiguration implements Parsable {
    /** Specify the duration for which automatic authentication attempts will be blocked from occuring after a failed authentication attempt. */
    private Integer _authenticationBlockPeriodInMinutes;
    /** Specify the authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential. Possible values are: certificate, usernameAndPassword, derivedCredential, unknownFutureValue. */
    private WiredNetworkAuthenticationMethod _authenticationMethod;
    /** Specify the number of seconds for the client to wait after an authentication attempt before failing. Valid range 1-3600. */
    private Integer _authenticationPeriodInSeconds;
    /** Specify the number of seconds between a failed authentication and the next authentication attempt. Valid range 1-3600. */
    private Integer _authenticationRetryDelayPeriodInSeconds;
    /** Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If you're using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: none, user, machine, machineOrUser, guest. Possible values are: none, user, machine, machineOrUser, guest, unknownFutureValue. */
    private WiredNetworkAuthenticationType _authenticationType;
    /** When TRUE, caches user credentials on the device so that users don't need to keep entering them each time they connect. When FALSE, do not cache credentials. Default value is FALSE. */
    private Boolean _cacheCredentials;
    /** When TRUE, prevents the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP. When FALSE, does not prevent the user from being prompted. Default value is FALSE. */
    private Boolean _disableUserPromptForServerValidation;
    /** Specify the number of seconds to wait before sending an EAPOL (Extensible Authentication Protocol over LAN) Start message. Valid range 1-3600. */
    private Integer _eapolStartPeriodInSeconds;
    /** Extensible Authentication Protocol (EAP). Indicates the type of EAP protocol set on the Wi-Fi endpoint (router). Possible values are: eapTls, leap, eapSim, eapTtls, peap, eapFast, teap. Possible values are: eapTls, leap, eapSim, eapTtls, peap, eapFast, teap. */
    private EapType _eapType;
    /** When TRUE, the automatic configuration service for wired networks requires the use of 802.1X for port authentication. When FALSE, 802.1X is not required. Default value is FALSE. */
    private Boolean _enforce8021X;
    /** When TRUE, forces FIPS compliance. When FALSE, does not enable FIPS compliance. Default value is FALSE. */
    private Boolean _forceFIPSCompliance;
    /** Specify identity certificate for client authentication. */
    private WindowsCertificateProfileBase _identityCertificateForClientAuthentication;
    /** Specify inner authentication protocol for EAP TTLS. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo. */
    private NonEapAuthenticationMethodForEapTtlsType _innerAuthenticationProtocolForEAPTTLS;
    /** Specify the maximum authentication failures allowed for a set of credentials. Valid range 1-100. */
    private Integer _maximumAuthenticationFailures;
    /** Specify the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100. */
    private Integer _maximumEAPOLStartMessages;
    /** Specify the string to replace usernames for privacy when using EAP TTLS or PEAP. */
    private String _outerIdentityPrivacyTemporaryValue;
    /** When TRUE, enables verification of server's identity by validating the certificate when EAP type is selected as PEAP. When FALSE, the certificate is not validated. Default value is TRUE. */
    private Boolean _performServerValidation;
    /** When TRUE, enables cryptographic binding when EAP type is selected as PEAP. When FALSE, does not enable cryptogrpahic binding. Default value is TRUE. */
    private Boolean _requireCryptographicBinding;
    /** Specify root certificate for client validation. */
    private Windows81TrustedRootCertificate _rootCertificateForClientValidation;
    /** Specify root certificates for server validation. This collection can contain a maximum of 500 elements. */
    private java.util.List<Windows81TrustedRootCertificate> _rootCertificatesForServerValidation;
    /** Specify the secondary authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential. Possible values are: certificate, usernameAndPassword, derivedCredential, unknownFutureValue. */
    private WiredNetworkAuthenticationMethod _secondaryAuthenticationMethod;
    /** Specify secondary identity certificate for client authentication. */
    private WindowsCertificateProfileBase _secondaryIdentityCertificateForClientAuthentication;
    /** Specify secondary root certificate for client validation. */
    private Windows81TrustedRootCertificate _secondaryRootCertificateForClientValidation;
    /** Specify trusted server certificate names. */
    private java.util.List<String> _trustedServerCertificateNames;
    /**
     * Instantiates a new WindowsWiredNetworkConfiguration and sets the default values.
     * @return a void
     */
    public WindowsWiredNetworkConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsWiredNetworkConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsWiredNetworkConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsWiredNetworkConfiguration();
    }
    /**
     * Gets the authenticationBlockPeriodInMinutes property value. Specify the duration for which automatic authentication attempts will be blocked from occuring after a failed authentication attempt.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAuthenticationBlockPeriodInMinutes() {
        return this._authenticationBlockPeriodInMinutes;
    }
    /**
     * Gets the authenticationMethod property value. Specify the authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential. Possible values are: certificate, usernameAndPassword, derivedCredential, unknownFutureValue.
     * @return a wiredNetworkAuthenticationMethod
     */
    @javax.annotation.Nullable
    public WiredNetworkAuthenticationMethod getAuthenticationMethod() {
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
     * Gets the authenticationType property value. Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If you're using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: none, user, machine, machineOrUser, guest. Possible values are: none, user, machine, machineOrUser, guest, unknownFutureValue.
     * @return a wiredNetworkAuthenticationType
     */
    @javax.annotation.Nullable
    public WiredNetworkAuthenticationType getAuthenticationType() {
        return this._authenticationType;
    }
    /**
     * Gets the cacheCredentials property value. When TRUE, caches user credentials on the device so that users don't need to keep entering them each time they connect. When FALSE, do not cache credentials. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCacheCredentials() {
        return this._cacheCredentials;
    }
    /**
     * Gets the disableUserPromptForServerValidation property value. When TRUE, prevents the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP. When FALSE, does not prevent the user from being prompted. Default value is FALSE.
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
     * Gets the eapType property value. Extensible Authentication Protocol (EAP). Indicates the type of EAP protocol set on the Wi-Fi endpoint (router). Possible values are: eapTls, leap, eapSim, eapTtls, peap, eapFast, teap. Possible values are: eapTls, leap, eapSim, eapTtls, peap, eapFast, teap.
     * @return a eapType
     */
    @javax.annotation.Nullable
    public EapType getEapType() {
        return this._eapType;
    }
    /**
     * Gets the enforce8021X property value. When TRUE, the automatic configuration service for wired networks requires the use of 802.1X for port authentication. When FALSE, 802.1X is not required. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnforce8021X() {
        return this._enforce8021X;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsWiredNetworkConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authenticationBlockPeriodInMinutes", (n) -> { currentObject.setAuthenticationBlockPeriodInMinutes(n.getIntegerValue()); });
            this.put("authenticationMethod", (n) -> { currentObject.setAuthenticationMethod(n.getEnumValue(WiredNetworkAuthenticationMethod.class)); });
            this.put("authenticationPeriodInSeconds", (n) -> { currentObject.setAuthenticationPeriodInSeconds(n.getIntegerValue()); });
            this.put("authenticationRetryDelayPeriodInSeconds", (n) -> { currentObject.setAuthenticationRetryDelayPeriodInSeconds(n.getIntegerValue()); });
            this.put("authenticationType", (n) -> { currentObject.setAuthenticationType(n.getEnumValue(WiredNetworkAuthenticationType.class)); });
            this.put("cacheCredentials", (n) -> { currentObject.setCacheCredentials(n.getBooleanValue()); });
            this.put("disableUserPromptForServerValidation", (n) -> { currentObject.setDisableUserPromptForServerValidation(n.getBooleanValue()); });
            this.put("eapolStartPeriodInSeconds", (n) -> { currentObject.setEapolStartPeriodInSeconds(n.getIntegerValue()); });
            this.put("eapType", (n) -> { currentObject.setEapType(n.getEnumValue(EapType.class)); });
            this.put("enforce8021X", (n) -> { currentObject.setEnforce8021X(n.getBooleanValue()); });
            this.put("forceFIPSCompliance", (n) -> { currentObject.setForceFIPSCompliance(n.getBooleanValue()); });
            this.put("identityCertificateForClientAuthentication", (n) -> { currentObject.setIdentityCertificateForClientAuthentication(n.getObjectValue(WindowsCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("innerAuthenticationProtocolForEAPTTLS", (n) -> { currentObject.setInnerAuthenticationProtocolForEAPTTLS(n.getEnumValue(NonEapAuthenticationMethodForEapTtlsType.class)); });
            this.put("maximumAuthenticationFailures", (n) -> { currentObject.setMaximumAuthenticationFailures(n.getIntegerValue()); });
            this.put("maximumEAPOLStartMessages", (n) -> { currentObject.setMaximumEAPOLStartMessages(n.getIntegerValue()); });
            this.put("outerIdentityPrivacyTemporaryValue", (n) -> { currentObject.setOuterIdentityPrivacyTemporaryValue(n.getStringValue()); });
            this.put("performServerValidation", (n) -> { currentObject.setPerformServerValidation(n.getBooleanValue()); });
            this.put("requireCryptographicBinding", (n) -> { currentObject.setRequireCryptographicBinding(n.getBooleanValue()); });
            this.put("rootCertificateForClientValidation", (n) -> { currentObject.setRootCertificateForClientValidation(n.getObjectValue(Windows81TrustedRootCertificate::createFromDiscriminatorValue)); });
            this.put("rootCertificatesForServerValidation", (n) -> { currentObject.setRootCertificatesForServerValidation(n.getCollectionOfObjectValues(Windows81TrustedRootCertificate::createFromDiscriminatorValue)); });
            this.put("secondaryAuthenticationMethod", (n) -> { currentObject.setSecondaryAuthenticationMethod(n.getEnumValue(WiredNetworkAuthenticationMethod.class)); });
            this.put("secondaryIdentityCertificateForClientAuthentication", (n) -> { currentObject.setSecondaryIdentityCertificateForClientAuthentication(n.getObjectValue(WindowsCertificateProfileBase::createFromDiscriminatorValue)); });
            this.put("secondaryRootCertificateForClientValidation", (n) -> { currentObject.setSecondaryRootCertificateForClientValidation(n.getObjectValue(Windows81TrustedRootCertificate::createFromDiscriminatorValue)); });
            this.put("trustedServerCertificateNames", (n) -> { currentObject.setTrustedServerCertificateNames(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the forceFIPSCompliance property value. When TRUE, forces FIPS compliance. When FALSE, does not enable FIPS compliance. Default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getForceFIPSCompliance() {
        return this._forceFIPSCompliance;
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
     * Gets the innerAuthenticationProtocolForEAPTTLS property value. Specify inner authentication protocol for EAP TTLS. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
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
     * Gets the maximumEAPOLStartMessages property value. Specify the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumEAPOLStartMessages() {
        return this._maximumEAPOLStartMessages;
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
     * Gets the performServerValidation property value. When TRUE, enables verification of server's identity by validating the certificate when EAP type is selected as PEAP. When FALSE, the certificate is not validated. Default value is TRUE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPerformServerValidation() {
        return this._performServerValidation;
    }
    /**
     * Gets the requireCryptographicBinding property value. When TRUE, enables cryptographic binding when EAP type is selected as PEAP. When FALSE, does not enable cryptogrpahic binding. Default value is TRUE.
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
     * Gets the rootCertificatesForServerValidation property value. Specify root certificates for server validation. This collection can contain a maximum of 500 elements.
     * @return a windows81TrustedRootCertificate
     */
    @javax.annotation.Nullable
    public java.util.List<Windows81TrustedRootCertificate> getRootCertificatesForServerValidation() {
        return this._rootCertificatesForServerValidation;
    }
    /**
     * Gets the secondaryAuthenticationMethod property value. Specify the secondary authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential. Possible values are: certificate, usernameAndPassword, derivedCredential, unknownFutureValue.
     * @return a wiredNetworkAuthenticationMethod
     */
    @javax.annotation.Nullable
    public WiredNetworkAuthenticationMethod getSecondaryAuthenticationMethod() {
        return this._secondaryAuthenticationMethod;
    }
    /**
     * Gets the secondaryIdentityCertificateForClientAuthentication property value. Specify secondary identity certificate for client authentication.
     * @return a windowsCertificateProfileBase
     */
    @javax.annotation.Nullable
    public WindowsCertificateProfileBase getSecondaryIdentityCertificateForClientAuthentication() {
        return this._secondaryIdentityCertificateForClientAuthentication;
    }
    /**
     * Gets the secondaryRootCertificateForClientValidation property value. Specify secondary root certificate for client validation.
     * @return a windows81TrustedRootCertificate
     */
    @javax.annotation.Nullable
    public Windows81TrustedRootCertificate getSecondaryRootCertificateForClientValidation() {
        return this._secondaryRootCertificateForClientValidation;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setAuthenticationBlockPeriodInMinutes(@javax.annotation.Nullable final Integer value) {
        this._authenticationBlockPeriodInMinutes = value;
    }
    /**
     * Sets the authenticationMethod property value. Specify the authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential. Possible values are: certificate, usernameAndPassword, derivedCredential, unknownFutureValue.
     * @param value Value to set for the authenticationMethod property.
     * @return a void
     */
    public void setAuthenticationMethod(@javax.annotation.Nullable final WiredNetworkAuthenticationMethod value) {
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
     * Sets the authenticationType property value. Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If you're using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: none, user, machine, machineOrUser, guest. Possible values are: none, user, machine, machineOrUser, guest, unknownFutureValue.
     * @param value Value to set for the authenticationType property.
     * @return a void
     */
    public void setAuthenticationType(@javax.annotation.Nullable final WiredNetworkAuthenticationType value) {
        this._authenticationType = value;
    }
    /**
     * Sets the cacheCredentials property value. When TRUE, caches user credentials on the device so that users don't need to keep entering them each time they connect. When FALSE, do not cache credentials. Default value is FALSE.
     * @param value Value to set for the cacheCredentials property.
     * @return a void
     */
    public void setCacheCredentials(@javax.annotation.Nullable final Boolean value) {
        this._cacheCredentials = value;
    }
    /**
     * Sets the disableUserPromptForServerValidation property value. When TRUE, prevents the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP. When FALSE, does not prevent the user from being prompted. Default value is FALSE.
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
     * Sets the eapType property value. Extensible Authentication Protocol (EAP). Indicates the type of EAP protocol set on the Wi-Fi endpoint (router). Possible values are: eapTls, leap, eapSim, eapTtls, peap, eapFast, teap. Possible values are: eapTls, leap, eapSim, eapTtls, peap, eapFast, teap.
     * @param value Value to set for the eapType property.
     * @return a void
     */
    public void setEapType(@javax.annotation.Nullable final EapType value) {
        this._eapType = value;
    }
    /**
     * Sets the enforce8021X property value. When TRUE, the automatic configuration service for wired networks requires the use of 802.1X for port authentication. When FALSE, 802.1X is not required. Default value is FALSE.
     * @param value Value to set for the enforce8021X property.
     * @return a void
     */
    public void setEnforce8021X(@javax.annotation.Nullable final Boolean value) {
        this._enforce8021X = value;
    }
    /**
     * Sets the forceFIPSCompliance property value. When TRUE, forces FIPS compliance. When FALSE, does not enable FIPS compliance. Default value is FALSE.
     * @param value Value to set for the forceFIPSCompliance property.
     * @return a void
     */
    public void setForceFIPSCompliance(@javax.annotation.Nullable final Boolean value) {
        this._forceFIPSCompliance = value;
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
     * Sets the innerAuthenticationProtocolForEAPTTLS property value. Specify inner authentication protocol for EAP TTLS. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
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
     * Sets the maximumEAPOLStartMessages property value. Specify the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100.
     * @param value Value to set for the maximumEAPOLStartMessages property.
     * @return a void
     */
    public void setMaximumEAPOLStartMessages(@javax.annotation.Nullable final Integer value) {
        this._maximumEAPOLStartMessages = value;
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
     * Sets the performServerValidation property value. When TRUE, enables verification of server's identity by validating the certificate when EAP type is selected as PEAP. When FALSE, the certificate is not validated. Default value is TRUE.
     * @param value Value to set for the performServerValidation property.
     * @return a void
     */
    public void setPerformServerValidation(@javax.annotation.Nullable final Boolean value) {
        this._performServerValidation = value;
    }
    /**
     * Sets the requireCryptographicBinding property value. When TRUE, enables cryptographic binding when EAP type is selected as PEAP. When FALSE, does not enable cryptogrpahic binding. Default value is TRUE.
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
     * Sets the rootCertificatesForServerValidation property value. Specify root certificates for server validation. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the rootCertificatesForServerValidation property.
     * @return a void
     */
    public void setRootCertificatesForServerValidation(@javax.annotation.Nullable final java.util.List<Windows81TrustedRootCertificate> value) {
        this._rootCertificatesForServerValidation = value;
    }
    /**
     * Sets the secondaryAuthenticationMethod property value. Specify the secondary authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential. Possible values are: certificate, usernameAndPassword, derivedCredential, unknownFutureValue.
     * @param value Value to set for the secondaryAuthenticationMethod property.
     * @return a void
     */
    public void setSecondaryAuthenticationMethod(@javax.annotation.Nullable final WiredNetworkAuthenticationMethod value) {
        this._secondaryAuthenticationMethod = value;
    }
    /**
     * Sets the secondaryIdentityCertificateForClientAuthentication property value. Specify secondary identity certificate for client authentication.
     * @param value Value to set for the secondaryIdentityCertificateForClientAuthentication property.
     * @return a void
     */
    public void setSecondaryIdentityCertificateForClientAuthentication(@javax.annotation.Nullable final WindowsCertificateProfileBase value) {
        this._secondaryIdentityCertificateForClientAuthentication = value;
    }
    /**
     * Sets the secondaryRootCertificateForClientValidation property value. Specify secondary root certificate for client validation.
     * @param value Value to set for the secondaryRootCertificateForClientValidation property.
     * @return a void
     */
    public void setSecondaryRootCertificateForClientValidation(@javax.annotation.Nullable final Windows81TrustedRootCertificate value) {
        this._secondaryRootCertificateForClientValidation = value;
    }
    /**
     * Sets the trustedServerCertificateNames property value. Specify trusted server certificate names.
     * @param value Value to set for the trustedServerCertificateNames property.
     * @return a void
     */
    public void setTrustedServerCertificateNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._trustedServerCertificateNames = value;
    }
}
