package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class SignIn extends Entity implements Parsable {
    /** The application name displayed in the Azure Portal. Supports $filter (eq and startsWith operators only). */
    private String _appDisplayName;
    /** The application identifier in Azure Active Directory. Supports $filter (eq operator only). */
    private String _appId;
    /** A list of conditional access policies that are triggered by the corresponding sign-in activity. */
    private java.util.List<AppliedConditionalAccessPolicy> _appliedConditionalAccessPolicies;
    /** Contains a collection of values that represent the conditional access authentication contexts applied to the sign-in. */
    private java.util.List<AuthenticationContext> _authenticationContextClassReferences;
    /** The result of the authentication attempt and additional details on the authentication method. */
    private java.util.List<AuthenticationDetail> _authenticationDetails;
    /** The authentication methods used. Possible values: SMS, Authenticator App, App Verification code, Password, FIDO, PTA, or PHS. */
    private java.util.List<String> _authenticationMethodsUsed;
    /** Additional authentication processing details, such as the agent name in case of PTA/PHS or Server/farm name in case of federated authentication. */
    private java.util.List<KeyValue> _authenticationProcessingDetails;
    /** Lists the protocol type or grant type used in the authentication. The possible values are: none, oAuth2, ropc, wsFederation, saml20, deviceCode, unknownFutureValue. For authentications that use protocols other than the possible values listed, the protocol type is listed as none. */
    private ProtocolType _authenticationProtocol;
    /** This holds the highest level of authentication needed through all the sign-in steps, for sign-in to succeed. Supports $filter (eq and startsWith operators only). */
    private String _authenticationRequirement;
    /** Sources of authentication requirement, such as conditional access, per-user MFA, identity protection, and security defaults. */
    private java.util.List<AuthenticationRequirementPolicy> _authenticationRequirementPolicies;
    /** The Autonomous System Number (ASN) of the network used by the actor. */
    private Integer _autonomousSystemNumber;
    /** Contains a fully qualified Azure Resource Manager ID of an Azure resource accessed during the sign-in. */
    private String _azureResourceId;
    /** The legacy client used for sign-in activity. For example: Browser, Exchange ActiveSync, Modern clients, IMAP, MAPI, SMTP, or POP. Supports $filter (eq operator only). */
    private String _clientAppUsed;
    /** Describes the credential type that a user client or service principal provided to Azure AD to authenticate itself. You may wish to review clientCredentialType to track and eliminate less secure credential types or to watch for clients and service principals using anomalous credential types. The possible values are: none, clientSecret, clientAssertion, federatedIdentityCredential, managedIdentity, certificate, unknownFutureValue. */
    private ClientCredentialType _clientCredentialType;
    /** The status of the conditional access policy triggered. Possible values: success, failure, notApplied, or unknownFutureValue. Supports $filter (eq operator only). */
    private ConditionalAccessStatus _conditionalAccessStatus;
    /** The identifier that's sent from the client when sign-in is initiated. This is used for troubleshooting the corresponding sign-in activity when calling for support. Supports $filter (eq operator only). */
    private String _correlationId;
    /** The date and time the sign-in was initiated. The Timestamp type is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $orderby and $filter (eq, le, and ge operators only). */
    private OffsetDateTime _createdDateTime;
    /** Describes the type of cross-tenant access used by the actor to access the resource. Possible values are: none, b2bCollaboration, b2bDirectConnect, microsoftSupport, serviceProvider, unknownFutureValue. If the sign in did not cross tenant boundaries, the value is none. */
    private SignInAccessType _crossTenantAccessType;
    /** The device information from where the sign-in occurred. Includes information such as deviceId, OS, and browser. Supports $filter (eq and startsWith operators only) on browser and operatingSystem properties. */
    private DeviceDetail _deviceDetail;
    /** Contains the identifier of an application's federated identity credential, if a federated identity credential was used to sign in. */
    private String _federatedCredentialId;
    /** During a failed sign in, a user may click a button in the Azure portal to mark the failed event for tenant admins. If a user clicked the button to flag the failed sign in, this value is true. */
    private Boolean _flaggedForReview;
    /** The tenant identifier of the user initiating the sign in. Not applicable in Managed Identity or service principal sign ins. */
    private String _homeTenantId;
    /** For user sign ins, the identifier of the tenant that the user is a member of. Only populated in cases where the home tenant has provided affirmative consent to Azure AD to show the tenant content. */
    private String _homeTenantName;
    /** Indicates the token types that were presented to Azure AD to authenticate the actor in the sign in. The possible values are: none, primaryRefreshToken, saml11, saml20, unknownFutureValue, remoteDesktopToken.  NOTE Azure AD may have also used token types not listed in this Enum type to authenticate the actor. Do not infer the lack of a token if it is not one of the types listed. Also, please note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: remoteDesktopToken. */
    private IncomingTokenType _incomingTokenType;
    /** The IP address of the client from where the sign-in occurred. Supports $filter (eq and startsWith operators only). */
    private String _ipAddress;
    /** The IP address a user used to reach a resource provider, used to determine Conditional Access compliance for some policies. For example, when a user interacts with Exchange Online, the IP address Exchange receives from the user may be recorded here. This value is often null. */
    private String _ipAddressFromResourceProvider;
    /** Indicates whether a user sign in is interactive. In interactive sign in, the user provides an authentication factor to Azure AD. These factors include passwords, responses to MFA challenges, biometric factors, or QR codes that a user provides to Azure AD or an associated app. In non-interactive sign in, the user doesn't provide an authentication factor. Instead, the client app uses a token or code to authenticate or access a resource on behalf of a user. Non-interactive sign ins are commonly used for a client to sign in on a user's behalf in a process transparent to the user. */
    private Boolean _isInteractive;
    /** Shows whether the sign in event was subject to an Azure AD tenant restriction policy. */
    private Boolean _isTenantRestricted;
    /** The city, state, and 2 letter country code from where the sign-in occurred. Supports $filter (eq and startsWith operators only) on city, state, and countryOrRegion properties. */
    private SignInLocation _location;
    /** The mfaDetail property */
    private MfaDetail _mfaDetail;
    /** The network location details including the type of network used and its names. */
    private java.util.List<NetworkLocationDetail> _networkLocationDetails;
    /** The request identifier of the first request in the authentication sequence. Supports $filter (eq operator only). */
    private String _originalRequestId;
    /** Contains information about the Azure AD Private Link policy that is associated with the sign in event. */
    private PrivateLinkDetails _privateLinkDetails;
    /** The request processing time in milliseconds in AD STS. */
    private Integer _processingTimeInMilliseconds;
    /** The name of the resource that the user signed in to. Supports $filter (eq operator only). */
    private String _resourceDisplayName;
    /** The identifier of the resource that the user signed in to. Supports $filter (eq operator only). */
    private String _resourceId;
    /** The identifier of the service principal representing the target resource in the sign-in event. */
    private String _resourceServicePrincipalId;
    /** The tenant identifier of the resource referenced in the sign in. */
    private String _resourceTenantId;
    /** The reason behind a specific state of a risky user, sign-in, or a risk event. Possible values: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, or unknownFutureValue. The value none means that no action has been performed on the user or sign-in so far. Supports $filter (eq operator only). Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden. */
    private RiskDetail _riskDetail;
    /** The list of risk event types associated with the sign-in. Possible values: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, or unknownFutureValue. Supports $filter (eq and startsWith operators only). */
    private java.util.List<String> _riskEventTypes_v2;
    /** The aggregated risk level. Possible values: none, low, medium, high, hidden, or unknownFutureValue. The value hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Supports $filter (eq operator only). Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden. */
    private RiskLevel _riskLevelAggregated;
    /** The risk level during sign-in. Possible values: none, low, medium, high, hidden, or unknownFutureValue. The value hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Supports $filter (eq operator only). Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden. */
    private RiskLevel _riskLevelDuringSignIn;
    /** The risk state of a risky user, sign-in, or a risk event. Possible values: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, or unknownFutureValue. Supports $filter (eq operator only). */
    private RiskState _riskState;
    /** The unique identifier of the key credential used by the service principal to authenticate. */
    private String _servicePrincipalCredentialKeyId;
    /** The certificate thumbprint of the certificate used by the service principal to authenticate. */
    private String _servicePrincipalCredentialThumbprint;
    /** The application identifier used for sign-in. This field is populated when you are signing in using an application. Supports $filter (eq and startsWith operators only). */
    private String _servicePrincipalId;
    /** The application name used for sign-in. This field is populated when you are signing in using an application. Supports $filter (eq and startsWith operators only). */
    private String _servicePrincipalName;
    /** Any conditional access session management policies that were applied during the sign-in event. */
    private java.util.List<SessionLifetimePolicy> _sessionLifetimePolicies;
    /** Indicates the category of sign in that the event represents. For user sign ins, the category can be interactiveUser or nonInteractiveUser and corresponds to the value for the isInteractive property on the signin resource. For managed identity sign ins, the category is managedIdentity. For service principal sign ins, the category is servicePrincipal. Possible values are: interactiveUser, nonInteractiveUser, servicePrincipal, managedIdentity, unknownFutureValue. Supports $filter (eq, ne). */
    private java.util.List<String> _signInEventTypes;
    /** The identification that the user provided to sign in. It may be the userPrincipalName but it's also populated when a user signs in using other identifiers. */
    private String _signInIdentifier;
    /** The type of sign in identifier. Possible values are: userPrincipalName, phoneNumber, proxyAddress, qrCode, onPremisesUserPrincipalName, unknownFutureValue. */
    private SignInIdentifierType _signInIdentifierType;
    /** The sign-in status. Includes the error code and description of the error (in case of a sign-in failure). Supports $filter (eq operator only) on errorCode property. */
    private SignInStatus _status;
    /** The name of the identity provider. For example, sts.microsoft.com. Supports $filter (eq operator only). */
    private String _tokenIssuerName;
    /** The type of identity provider. The possible values are: AzureAD, ADFederationServices, UnknownFutureValue, AzureADBackupAuth, ADFederationServicesMFAAdapter, NPSExtension. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: AzureADBackupAuth , ADFederationServicesMFAAdapter , NPSExtension. */
    private TokenIssuerType _tokenIssuerType;
    /** A unique base64 encoded request identifier used to track tokens issued by Azure AD as they are redeemed at resource providers. */
    private String _uniqueTokenIdentifier;
    /** The user agent information related to sign-in. Supports $filter (eq and startsWith operators only). */
    private String _userAgent;
    /** The display name of the user. Supports $filter (eq and startsWith operators only). */
    private String _userDisplayName;
    /** The identifier of the user. Supports $filter (eq operator only). */
    private String _userId;
    /** The UPN of the user. Supports $filter (eq and startsWith operators only). */
    private String _userPrincipalName;
    /** Identifies whether the user is a member or guest in the tenant. Possible values are: member, guest, unknownFutureValue. */
    private SignInUserType _userType;
    /**
     * Instantiates a new signIn and sets the default values.
     * @return a void
     */
    public SignIn() {
        super();
        this.setType("#microsoft.graph.signIn");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a signIn
     */
    @javax.annotation.Nonnull
    public static SignIn createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.restrictedSignIn": return new RestrictedSignIn();
            }
        }
        return new SignIn();
    }
    /**
     * Gets the appDisplayName property value. The application name displayed in the Azure Portal. Supports $filter (eq and startsWith operators only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this._appDisplayName;
    }
    /**
     * Gets the appId property value. The application identifier in Azure Active Directory. Supports $filter (eq operator only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this._appId;
    }
    /**
     * Gets the appliedConditionalAccessPolicies property value. A list of conditional access policies that are triggered by the corresponding sign-in activity.
     * @return a appliedConditionalAccessPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<AppliedConditionalAccessPolicy> getAppliedConditionalAccessPolicies() {
        return this._appliedConditionalAccessPolicies;
    }
    /**
     * Gets the authenticationContextClassReferences property value. Contains a collection of values that represent the conditional access authentication contexts applied to the sign-in.
     * @return a authenticationContext
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationContext> getAuthenticationContextClassReferences() {
        return this._authenticationContextClassReferences;
    }
    /**
     * Gets the authenticationDetails property value. The result of the authentication attempt and additional details on the authentication method.
     * @return a authenticationDetail
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationDetail> getAuthenticationDetails() {
        return this._authenticationDetails;
    }
    /**
     * Gets the authenticationMethodsUsed property value. The authentication methods used. Possible values: SMS, Authenticator App, App Verification code, Password, FIDO, PTA, or PHS.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAuthenticationMethodsUsed() {
        return this._authenticationMethodsUsed;
    }
    /**
     * Gets the authenticationProcessingDetails property value. Additional authentication processing details, such as the agent name in case of PTA/PHS or Server/farm name in case of federated authentication.
     * @return a keyValue
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValue> getAuthenticationProcessingDetails() {
        return this._authenticationProcessingDetails;
    }
    /**
     * Gets the authenticationProtocol property value. Lists the protocol type or grant type used in the authentication. The possible values are: none, oAuth2, ropc, wsFederation, saml20, deviceCode, unknownFutureValue. For authentications that use protocols other than the possible values listed, the protocol type is listed as none.
     * @return a protocolType
     */
    @javax.annotation.Nullable
    public ProtocolType getAuthenticationProtocol() {
        return this._authenticationProtocol;
    }
    /**
     * Gets the authenticationRequirement property value. This holds the highest level of authentication needed through all the sign-in steps, for sign-in to succeed. Supports $filter (eq and startsWith operators only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationRequirement() {
        return this._authenticationRequirement;
    }
    /**
     * Gets the authenticationRequirementPolicies property value. Sources of authentication requirement, such as conditional access, per-user MFA, identity protection, and security defaults.
     * @return a authenticationRequirementPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationRequirementPolicy> getAuthenticationRequirementPolicies() {
        return this._authenticationRequirementPolicies;
    }
    /**
     * Gets the autonomousSystemNumber property value. The Autonomous System Number (ASN) of the network used by the actor.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAutonomousSystemNumber() {
        return this._autonomousSystemNumber;
    }
    /**
     * Gets the azureResourceId property value. Contains a fully qualified Azure Resource Manager ID of an Azure resource accessed during the sign-in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureResourceId() {
        return this._azureResourceId;
    }
    /**
     * Gets the clientAppUsed property value. The legacy client used for sign-in activity. For example: Browser, Exchange ActiveSync, Modern clients, IMAP, MAPI, SMTP, or POP. Supports $filter (eq operator only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientAppUsed() {
        return this._clientAppUsed;
    }
    /**
     * Gets the clientCredentialType property value. Describes the credential type that a user client or service principal provided to Azure AD to authenticate itself. You may wish to review clientCredentialType to track and eliminate less secure credential types or to watch for clients and service principals using anomalous credential types. The possible values are: none, clientSecret, clientAssertion, federatedIdentityCredential, managedIdentity, certificate, unknownFutureValue.
     * @return a clientCredentialType
     */
    @javax.annotation.Nullable
    public ClientCredentialType getClientCredentialType() {
        return this._clientCredentialType;
    }
    /**
     * Gets the conditionalAccessStatus property value. The status of the conditional access policy triggered. Possible values: success, failure, notApplied, or unknownFutureValue. Supports $filter (eq operator only).
     * @return a conditionalAccessStatus
     */
    @javax.annotation.Nullable
    public ConditionalAccessStatus getConditionalAccessStatus() {
        return this._conditionalAccessStatus;
    }
    /**
     * Gets the correlationId property value. The identifier that's sent from the client when sign-in is initiated. This is used for troubleshooting the corresponding sign-in activity when calling for support. Supports $filter (eq operator only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCorrelationId() {
        return this._correlationId;
    }
    /**
     * Gets the createdDateTime property value. The date and time the sign-in was initiated. The Timestamp type is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $orderby and $filter (eq, le, and ge operators only).
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the crossTenantAccessType property value. Describes the type of cross-tenant access used by the actor to access the resource. Possible values are: none, b2bCollaboration, b2bDirectConnect, microsoftSupport, serviceProvider, unknownFutureValue. If the sign in did not cross tenant boundaries, the value is none.
     * @return a signInAccessType
     */
    @javax.annotation.Nullable
    public SignInAccessType getCrossTenantAccessType() {
        return this._crossTenantAccessType;
    }
    /**
     * Gets the deviceDetail property value. The device information from where the sign-in occurred. Includes information such as deviceId, OS, and browser. Supports $filter (eq and startsWith operators only) on browser and operatingSystem properties.
     * @return a deviceDetail
     */
    @javax.annotation.Nullable
    public DeviceDetail getDeviceDetail() {
        return this._deviceDetail;
    }
    /**
     * Gets the federatedCredentialId property value. Contains the identifier of an application's federated identity credential, if a federated identity credential was used to sign in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFederatedCredentialId() {
        return this._federatedCredentialId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SignIn currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appDisplayName", (n) -> { currentObject.setAppDisplayName(n.getStringValue()); });
            this.put("appId", (n) -> { currentObject.setAppId(n.getStringValue()); });
            this.put("appliedConditionalAccessPolicies", (n) -> { currentObject.setAppliedConditionalAccessPolicies(n.getCollectionOfObjectValues(AppliedConditionalAccessPolicy::createFromDiscriminatorValue)); });
            this.put("authenticationContextClassReferences", (n) -> { currentObject.setAuthenticationContextClassReferences(n.getCollectionOfObjectValues(AuthenticationContext::createFromDiscriminatorValue)); });
            this.put("authenticationDetails", (n) -> { currentObject.setAuthenticationDetails(n.getCollectionOfObjectValues(AuthenticationDetail::createFromDiscriminatorValue)); });
            this.put("authenticationMethodsUsed", (n) -> { currentObject.setAuthenticationMethodsUsed(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("authenticationProcessingDetails", (n) -> { currentObject.setAuthenticationProcessingDetails(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
            this.put("authenticationProtocol", (n) -> { currentObject.setAuthenticationProtocol(n.getEnumValue(ProtocolType.class)); });
            this.put("authenticationRequirement", (n) -> { currentObject.setAuthenticationRequirement(n.getStringValue()); });
            this.put("authenticationRequirementPolicies", (n) -> { currentObject.setAuthenticationRequirementPolicies(n.getCollectionOfObjectValues(AuthenticationRequirementPolicy::createFromDiscriminatorValue)); });
            this.put("autonomousSystemNumber", (n) -> { currentObject.setAutonomousSystemNumber(n.getIntegerValue()); });
            this.put("azureResourceId", (n) -> { currentObject.setAzureResourceId(n.getStringValue()); });
            this.put("clientAppUsed", (n) -> { currentObject.setClientAppUsed(n.getStringValue()); });
            this.put("clientCredentialType", (n) -> { currentObject.setClientCredentialType(n.getEnumValue(ClientCredentialType.class)); });
            this.put("conditionalAccessStatus", (n) -> { currentObject.setConditionalAccessStatus(n.getEnumValue(ConditionalAccessStatus.class)); });
            this.put("correlationId", (n) -> { currentObject.setCorrelationId(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("crossTenantAccessType", (n) -> { currentObject.setCrossTenantAccessType(n.getEnumValue(SignInAccessType.class)); });
            this.put("deviceDetail", (n) -> { currentObject.setDeviceDetail(n.getObjectValue(DeviceDetail::createFromDiscriminatorValue)); });
            this.put("federatedCredentialId", (n) -> { currentObject.setFederatedCredentialId(n.getStringValue()); });
            this.put("flaggedForReview", (n) -> { currentObject.setFlaggedForReview(n.getBooleanValue()); });
            this.put("homeTenantId", (n) -> { currentObject.setHomeTenantId(n.getStringValue()); });
            this.put("homeTenantName", (n) -> { currentObject.setHomeTenantName(n.getStringValue()); });
            this.put("incomingTokenType", (n) -> { currentObject.setIncomingTokenType(n.getEnumValue(IncomingTokenType.class)); });
            this.put("ipAddress", (n) -> { currentObject.setIpAddress(n.getStringValue()); });
            this.put("ipAddressFromResourceProvider", (n) -> { currentObject.setIpAddressFromResourceProvider(n.getStringValue()); });
            this.put("isInteractive", (n) -> { currentObject.setIsInteractive(n.getBooleanValue()); });
            this.put("isTenantRestricted", (n) -> { currentObject.setIsTenantRestricted(n.getBooleanValue()); });
            this.put("location", (n) -> { currentObject.setLocation(n.getObjectValue(SignInLocation::createFromDiscriminatorValue)); });
            this.put("mfaDetail", (n) -> { currentObject.setMfaDetail(n.getObjectValue(MfaDetail::createFromDiscriminatorValue)); });
            this.put("networkLocationDetails", (n) -> { currentObject.setNetworkLocationDetails(n.getCollectionOfObjectValues(NetworkLocationDetail::createFromDiscriminatorValue)); });
            this.put("originalRequestId", (n) -> { currentObject.setOriginalRequestId(n.getStringValue()); });
            this.put("privateLinkDetails", (n) -> { currentObject.setPrivateLinkDetails(n.getObjectValue(PrivateLinkDetails::createFromDiscriminatorValue)); });
            this.put("processingTimeInMilliseconds", (n) -> { currentObject.setProcessingTimeInMilliseconds(n.getIntegerValue()); });
            this.put("resourceDisplayName", (n) -> { currentObject.setResourceDisplayName(n.getStringValue()); });
            this.put("resourceId", (n) -> { currentObject.setResourceId(n.getStringValue()); });
            this.put("resourceServicePrincipalId", (n) -> { currentObject.setResourceServicePrincipalId(n.getStringValue()); });
            this.put("resourceTenantId", (n) -> { currentObject.setResourceTenantId(n.getStringValue()); });
            this.put("riskDetail", (n) -> { currentObject.setRiskDetail(n.getEnumValue(RiskDetail.class)); });
            this.put("riskEventTypes_v2", (n) -> { currentObject.setRiskEventTypes_v2(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("riskLevelAggregated", (n) -> { currentObject.setRiskLevelAggregated(n.getEnumValue(RiskLevel.class)); });
            this.put("riskLevelDuringSignIn", (n) -> { currentObject.setRiskLevelDuringSignIn(n.getEnumValue(RiskLevel.class)); });
            this.put("riskState", (n) -> { currentObject.setRiskState(n.getEnumValue(RiskState.class)); });
            this.put("servicePrincipalCredentialKeyId", (n) -> { currentObject.setServicePrincipalCredentialKeyId(n.getStringValue()); });
            this.put("servicePrincipalCredentialThumbprint", (n) -> { currentObject.setServicePrincipalCredentialThumbprint(n.getStringValue()); });
            this.put("servicePrincipalId", (n) -> { currentObject.setServicePrincipalId(n.getStringValue()); });
            this.put("servicePrincipalName", (n) -> { currentObject.setServicePrincipalName(n.getStringValue()); });
            this.put("sessionLifetimePolicies", (n) -> { currentObject.setSessionLifetimePolicies(n.getCollectionOfObjectValues(SessionLifetimePolicy::createFromDiscriminatorValue)); });
            this.put("signInEventTypes", (n) -> { currentObject.setSignInEventTypes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("signInIdentifier", (n) -> { currentObject.setSignInIdentifier(n.getStringValue()); });
            this.put("signInIdentifierType", (n) -> { currentObject.setSignInIdentifierType(n.getEnumValue(SignInIdentifierType.class)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getObjectValue(SignInStatus::createFromDiscriminatorValue)); });
            this.put("tokenIssuerName", (n) -> { currentObject.setTokenIssuerName(n.getStringValue()); });
            this.put("tokenIssuerType", (n) -> { currentObject.setTokenIssuerType(n.getEnumValue(TokenIssuerType.class)); });
            this.put("uniqueTokenIdentifier", (n) -> { currentObject.setUniqueTokenIdentifier(n.getStringValue()); });
            this.put("userAgent", (n) -> { currentObject.setUserAgent(n.getStringValue()); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
            this.put("userType", (n) -> { currentObject.setUserType(n.getEnumValue(SignInUserType.class)); });
        }};
    }
    /**
     * Gets the flaggedForReview property value. During a failed sign in, a user may click a button in the Azure portal to mark the failed event for tenant admins. If a user clicked the button to flag the failed sign in, this value is true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFlaggedForReview() {
        return this._flaggedForReview;
    }
    /**
     * Gets the homeTenantId property value. The tenant identifier of the user initiating the sign in. Not applicable in Managed Identity or service principal sign ins.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHomeTenantId() {
        return this._homeTenantId;
    }
    /**
     * Gets the homeTenantName property value. For user sign ins, the identifier of the tenant that the user is a member of. Only populated in cases where the home tenant has provided affirmative consent to Azure AD to show the tenant content.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHomeTenantName() {
        return this._homeTenantName;
    }
    /**
     * Gets the incomingTokenType property value. Indicates the token types that were presented to Azure AD to authenticate the actor in the sign in. The possible values are: none, primaryRefreshToken, saml11, saml20, unknownFutureValue, remoteDesktopToken.  NOTE Azure AD may have also used token types not listed in this Enum type to authenticate the actor. Do not infer the lack of a token if it is not one of the types listed. Also, please note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: remoteDesktopToken.
     * @return a incomingTokenType
     */
    @javax.annotation.Nullable
    public IncomingTokenType getIncomingTokenType() {
        return this._incomingTokenType;
    }
    /**
     * Gets the ipAddress property value. The IP address of the client from where the sign-in occurred. Supports $filter (eq and startsWith operators only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this._ipAddress;
    }
    /**
     * Gets the ipAddressFromResourceProvider property value. The IP address a user used to reach a resource provider, used to determine Conditional Access compliance for some policies. For example, when a user interacts with Exchange Online, the IP address Exchange receives from the user may be recorded here. This value is often null.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddressFromResourceProvider() {
        return this._ipAddressFromResourceProvider;
    }
    /**
     * Gets the isInteractive property value. Indicates whether a user sign in is interactive. In interactive sign in, the user provides an authentication factor to Azure AD. These factors include passwords, responses to MFA challenges, biometric factors, or QR codes that a user provides to Azure AD or an associated app. In non-interactive sign in, the user doesn't provide an authentication factor. Instead, the client app uses a token or code to authenticate or access a resource on behalf of a user. Non-interactive sign ins are commonly used for a client to sign in on a user's behalf in a process transparent to the user.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsInteractive() {
        return this._isInteractive;
    }
    /**
     * Gets the isTenantRestricted property value. Shows whether the sign in event was subject to an Azure AD tenant restriction policy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsTenantRestricted() {
        return this._isTenantRestricted;
    }
    /**
     * Gets the location property value. The city, state, and 2 letter country code from where the sign-in occurred. Supports $filter (eq and startsWith operators only) on city, state, and countryOrRegion properties.
     * @return a signInLocation
     */
    @javax.annotation.Nullable
    public SignInLocation getLocation() {
        return this._location;
    }
    /**
     * Gets the mfaDetail property value. The mfaDetail property
     * @return a mfaDetail
     */
    @javax.annotation.Nullable
    public MfaDetail getMfaDetail() {
        return this._mfaDetail;
    }
    /**
     * Gets the networkLocationDetails property value. The network location details including the type of network used and its names.
     * @return a networkLocationDetail
     */
    @javax.annotation.Nullable
    public java.util.List<NetworkLocationDetail> getNetworkLocationDetails() {
        return this._networkLocationDetails;
    }
    /**
     * Gets the originalRequestId property value. The request identifier of the first request in the authentication sequence. Supports $filter (eq operator only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginalRequestId() {
        return this._originalRequestId;
    }
    /**
     * Gets the privateLinkDetails property value. Contains information about the Azure AD Private Link policy that is associated with the sign in event.
     * @return a privateLinkDetails
     */
    @javax.annotation.Nullable
    public PrivateLinkDetails getPrivateLinkDetails() {
        return this._privateLinkDetails;
    }
    /**
     * Gets the processingTimeInMilliseconds property value. The request processing time in milliseconds in AD STS.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getProcessingTimeInMilliseconds() {
        return this._processingTimeInMilliseconds;
    }
    /**
     * Gets the resourceDisplayName property value. The name of the resource that the user signed in to. Supports $filter (eq operator only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceDisplayName() {
        return this._resourceDisplayName;
    }
    /**
     * Gets the resourceId property value. The identifier of the resource that the user signed in to. Supports $filter (eq operator only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this._resourceId;
    }
    /**
     * Gets the resourceServicePrincipalId property value. The identifier of the service principal representing the target resource in the sign-in event.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceServicePrincipalId() {
        return this._resourceServicePrincipalId;
    }
    /**
     * Gets the resourceTenantId property value. The tenant identifier of the resource referenced in the sign in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceTenantId() {
        return this._resourceTenantId;
    }
    /**
     * Gets the riskDetail property value. The reason behind a specific state of a risky user, sign-in, or a risk event. Possible values: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, or unknownFutureValue. The value none means that no action has been performed on the user or sign-in so far. Supports $filter (eq operator only). Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden.
     * @return a riskDetail
     */
    @javax.annotation.Nullable
    public RiskDetail getRiskDetail() {
        return this._riskDetail;
    }
    /**
     * Gets the riskEventTypes_v2 property value. The list of risk event types associated with the sign-in. Possible values: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, or unknownFutureValue. Supports $filter (eq and startsWith operators only).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRiskEventTypes_v2() {
        return this._riskEventTypes_v2;
    }
    /**
     * Gets the riskLevelAggregated property value. The aggregated risk level. Possible values: none, low, medium, high, hidden, or unknownFutureValue. The value hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Supports $filter (eq operator only). Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden.
     * @return a riskLevel
     */
    @javax.annotation.Nullable
    public RiskLevel getRiskLevelAggregated() {
        return this._riskLevelAggregated;
    }
    /**
     * Gets the riskLevelDuringSignIn property value. The risk level during sign-in. Possible values: none, low, medium, high, hidden, or unknownFutureValue. The value hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Supports $filter (eq operator only). Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden.
     * @return a riskLevel
     */
    @javax.annotation.Nullable
    public RiskLevel getRiskLevelDuringSignIn() {
        return this._riskLevelDuringSignIn;
    }
    /**
     * Gets the riskState property value. The risk state of a risky user, sign-in, or a risk event. Possible values: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, or unknownFutureValue. Supports $filter (eq operator only).
     * @return a riskState
     */
    @javax.annotation.Nullable
    public RiskState getRiskState() {
        return this._riskState;
    }
    /**
     * Gets the servicePrincipalCredentialKeyId property value. The unique identifier of the key credential used by the service principal to authenticate.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalCredentialKeyId() {
        return this._servicePrincipalCredentialKeyId;
    }
    /**
     * Gets the servicePrincipalCredentialThumbprint property value. The certificate thumbprint of the certificate used by the service principal to authenticate.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalCredentialThumbprint() {
        return this._servicePrincipalCredentialThumbprint;
    }
    /**
     * Gets the servicePrincipalId property value. The application identifier used for sign-in. This field is populated when you are signing in using an application. Supports $filter (eq and startsWith operators only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalId() {
        return this._servicePrincipalId;
    }
    /**
     * Gets the servicePrincipalName property value. The application name used for sign-in. This field is populated when you are signing in using an application. Supports $filter (eq and startsWith operators only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePrincipalName() {
        return this._servicePrincipalName;
    }
    /**
     * Gets the sessionLifetimePolicies property value. Any conditional access session management policies that were applied during the sign-in event.
     * @return a sessionLifetimePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<SessionLifetimePolicy> getSessionLifetimePolicies() {
        return this._sessionLifetimePolicies;
    }
    /**
     * Gets the signInEventTypes property value. Indicates the category of sign in that the event represents. For user sign ins, the category can be interactiveUser or nonInteractiveUser and corresponds to the value for the isInteractive property on the signin resource. For managed identity sign ins, the category is managedIdentity. For service principal sign ins, the category is servicePrincipal. Possible values are: interactiveUser, nonInteractiveUser, servicePrincipal, managedIdentity, unknownFutureValue. Supports $filter (eq, ne).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSignInEventTypes() {
        return this._signInEventTypes;
    }
    /**
     * Gets the signInIdentifier property value. The identification that the user provided to sign in. It may be the userPrincipalName but it's also populated when a user signs in using other identifiers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSignInIdentifier() {
        return this._signInIdentifier;
    }
    /**
     * Gets the signInIdentifierType property value. The type of sign in identifier. Possible values are: userPrincipalName, phoneNumber, proxyAddress, qrCode, onPremisesUserPrincipalName, unknownFutureValue.
     * @return a signInIdentifierType
     */
    @javax.annotation.Nullable
    public SignInIdentifierType getSignInIdentifierType() {
        return this._signInIdentifierType;
    }
    /**
     * Gets the status property value. The sign-in status. Includes the error code and description of the error (in case of a sign-in failure). Supports $filter (eq operator only) on errorCode property.
     * @return a signInStatus
     */
    @javax.annotation.Nullable
    public SignInStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the tokenIssuerName property value. The name of the identity provider. For example, sts.microsoft.com. Supports $filter (eq operator only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTokenIssuerName() {
        return this._tokenIssuerName;
    }
    /**
     * Gets the tokenIssuerType property value. The type of identity provider. The possible values are: AzureAD, ADFederationServices, UnknownFutureValue, AzureADBackupAuth, ADFederationServicesMFAAdapter, NPSExtension. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: AzureADBackupAuth , ADFederationServicesMFAAdapter , NPSExtension.
     * @return a tokenIssuerType
     */
    @javax.annotation.Nullable
    public TokenIssuerType getTokenIssuerType() {
        return this._tokenIssuerType;
    }
    /**
     * Gets the uniqueTokenIdentifier property value. A unique base64 encoded request identifier used to track tokens issued by Azure AD as they are redeemed at resource providers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUniqueTokenIdentifier() {
        return this._uniqueTokenIdentifier;
    }
    /**
     * Gets the userAgent property value. The user agent information related to sign-in. Supports $filter (eq and startsWith operators only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserAgent() {
        return this._userAgent;
    }
    /**
     * Gets the userDisplayName property value. The display name of the user. Supports $filter (eq and startsWith operators only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
    }
    /**
     * Gets the userId property value. The identifier of the user. Supports $filter (eq operator only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userPrincipalName property value. The UPN of the user. Supports $filter (eq and startsWith operators only).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Gets the userType property value. Identifies whether the user is a member or guest in the tenant. Possible values are: member, guest, unknownFutureValue.
     * @return a signInUserType
     */
    @javax.annotation.Nullable
    public SignInUserType getUserType() {
        return this._userType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeCollectionOfObjectValues("appliedConditionalAccessPolicies", this.getAppliedConditionalAccessPolicies());
        writer.writeCollectionOfObjectValues("authenticationContextClassReferences", this.getAuthenticationContextClassReferences());
        writer.writeCollectionOfObjectValues("authenticationDetails", this.getAuthenticationDetails());
        writer.writeCollectionOfPrimitiveValues("authenticationMethodsUsed", this.getAuthenticationMethodsUsed());
        writer.writeCollectionOfObjectValues("authenticationProcessingDetails", this.getAuthenticationProcessingDetails());
        writer.writeEnumValue("authenticationProtocol", this.getAuthenticationProtocol());
        writer.writeStringValue("authenticationRequirement", this.getAuthenticationRequirement());
        writer.writeCollectionOfObjectValues("authenticationRequirementPolicies", this.getAuthenticationRequirementPolicies());
        writer.writeIntegerValue("autonomousSystemNumber", this.getAutonomousSystemNumber());
        writer.writeStringValue("azureResourceId", this.getAzureResourceId());
        writer.writeStringValue("clientAppUsed", this.getClientAppUsed());
        writer.writeEnumValue("clientCredentialType", this.getClientCredentialType());
        writer.writeEnumValue("conditionalAccessStatus", this.getConditionalAccessStatus());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeEnumValue("crossTenantAccessType", this.getCrossTenantAccessType());
        writer.writeObjectValue("deviceDetail", this.getDeviceDetail());
        writer.writeStringValue("federatedCredentialId", this.getFederatedCredentialId());
        writer.writeBooleanValue("flaggedForReview", this.getFlaggedForReview());
        writer.writeStringValue("homeTenantId", this.getHomeTenantId());
        writer.writeStringValue("homeTenantName", this.getHomeTenantName());
        writer.writeEnumValue("incomingTokenType", this.getIncomingTokenType());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("ipAddressFromResourceProvider", this.getIpAddressFromResourceProvider());
        writer.writeBooleanValue("isInteractive", this.getIsInteractive());
        writer.writeBooleanValue("isTenantRestricted", this.getIsTenantRestricted());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeObjectValue("mfaDetail", this.getMfaDetail());
        writer.writeCollectionOfObjectValues("networkLocationDetails", this.getNetworkLocationDetails());
        writer.writeStringValue("originalRequestId", this.getOriginalRequestId());
        writer.writeObjectValue("privateLinkDetails", this.getPrivateLinkDetails());
        writer.writeIntegerValue("processingTimeInMilliseconds", this.getProcessingTimeInMilliseconds());
        writer.writeStringValue("resourceDisplayName", this.getResourceDisplayName());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeStringValue("resourceServicePrincipalId", this.getResourceServicePrincipalId());
        writer.writeStringValue("resourceTenantId", this.getResourceTenantId());
        writer.writeEnumValue("riskDetail", this.getRiskDetail());
        writer.writeCollectionOfPrimitiveValues("riskEventTypes_v2", this.getRiskEventTypes_v2());
        writer.writeEnumValue("riskLevelAggregated", this.getRiskLevelAggregated());
        writer.writeEnumValue("riskLevelDuringSignIn", this.getRiskLevelDuringSignIn());
        writer.writeEnumValue("riskState", this.getRiskState());
        writer.writeStringValue("servicePrincipalCredentialKeyId", this.getServicePrincipalCredentialKeyId());
        writer.writeStringValue("servicePrincipalCredentialThumbprint", this.getServicePrincipalCredentialThumbprint());
        writer.writeStringValue("servicePrincipalId", this.getServicePrincipalId());
        writer.writeStringValue("servicePrincipalName", this.getServicePrincipalName());
        writer.writeCollectionOfObjectValues("sessionLifetimePolicies", this.getSessionLifetimePolicies());
        writer.writeCollectionOfPrimitiveValues("signInEventTypes", this.getSignInEventTypes());
        writer.writeStringValue("signInIdentifier", this.getSignInIdentifier());
        writer.writeEnumValue("signInIdentifierType", this.getSignInIdentifierType());
        writer.writeObjectValue("status", this.getStatus());
        writer.writeStringValue("tokenIssuerName", this.getTokenIssuerName());
        writer.writeEnumValue("tokenIssuerType", this.getTokenIssuerType());
        writer.writeStringValue("uniqueTokenIdentifier", this.getUniqueTokenIdentifier());
        writer.writeStringValue("userAgent", this.getUserAgent());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeEnumValue("userType", this.getUserType());
    }
    /**
     * Sets the appDisplayName property value. The application name displayed in the Azure Portal. Supports $filter (eq and startsWith operators only).
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this._appDisplayName = value;
    }
    /**
     * Sets the appId property value. The application identifier in Azure Active Directory. Supports $filter (eq operator only).
     * @param value Value to set for the appId property.
     * @return a void
     */
    public void setAppId(@javax.annotation.Nullable final String value) {
        this._appId = value;
    }
    /**
     * Sets the appliedConditionalAccessPolicies property value. A list of conditional access policies that are triggered by the corresponding sign-in activity.
     * @param value Value to set for the appliedConditionalAccessPolicies property.
     * @return a void
     */
    public void setAppliedConditionalAccessPolicies(@javax.annotation.Nullable final java.util.List<AppliedConditionalAccessPolicy> value) {
        this._appliedConditionalAccessPolicies = value;
    }
    /**
     * Sets the authenticationContextClassReferences property value. Contains a collection of values that represent the conditional access authentication contexts applied to the sign-in.
     * @param value Value to set for the authenticationContextClassReferences property.
     * @return a void
     */
    public void setAuthenticationContextClassReferences(@javax.annotation.Nullable final java.util.List<AuthenticationContext> value) {
        this._authenticationContextClassReferences = value;
    }
    /**
     * Sets the authenticationDetails property value. The result of the authentication attempt and additional details on the authentication method.
     * @param value Value to set for the authenticationDetails property.
     * @return a void
     */
    public void setAuthenticationDetails(@javax.annotation.Nullable final java.util.List<AuthenticationDetail> value) {
        this._authenticationDetails = value;
    }
    /**
     * Sets the authenticationMethodsUsed property value. The authentication methods used. Possible values: SMS, Authenticator App, App Verification code, Password, FIDO, PTA, or PHS.
     * @param value Value to set for the authenticationMethodsUsed property.
     * @return a void
     */
    public void setAuthenticationMethodsUsed(@javax.annotation.Nullable final java.util.List<String> value) {
        this._authenticationMethodsUsed = value;
    }
    /**
     * Sets the authenticationProcessingDetails property value. Additional authentication processing details, such as the agent name in case of PTA/PHS or Server/farm name in case of federated authentication.
     * @param value Value to set for the authenticationProcessingDetails property.
     * @return a void
     */
    public void setAuthenticationProcessingDetails(@javax.annotation.Nullable final java.util.List<KeyValue> value) {
        this._authenticationProcessingDetails = value;
    }
    /**
     * Sets the authenticationProtocol property value. Lists the protocol type or grant type used in the authentication. The possible values are: none, oAuth2, ropc, wsFederation, saml20, deviceCode, unknownFutureValue. For authentications that use protocols other than the possible values listed, the protocol type is listed as none.
     * @param value Value to set for the authenticationProtocol property.
     * @return a void
     */
    public void setAuthenticationProtocol(@javax.annotation.Nullable final ProtocolType value) {
        this._authenticationProtocol = value;
    }
    /**
     * Sets the authenticationRequirement property value. This holds the highest level of authentication needed through all the sign-in steps, for sign-in to succeed. Supports $filter (eq and startsWith operators only).
     * @param value Value to set for the authenticationRequirement property.
     * @return a void
     */
    public void setAuthenticationRequirement(@javax.annotation.Nullable final String value) {
        this._authenticationRequirement = value;
    }
    /**
     * Sets the authenticationRequirementPolicies property value. Sources of authentication requirement, such as conditional access, per-user MFA, identity protection, and security defaults.
     * @param value Value to set for the authenticationRequirementPolicies property.
     * @return a void
     */
    public void setAuthenticationRequirementPolicies(@javax.annotation.Nullable final java.util.List<AuthenticationRequirementPolicy> value) {
        this._authenticationRequirementPolicies = value;
    }
    /**
     * Sets the autonomousSystemNumber property value. The Autonomous System Number (ASN) of the network used by the actor.
     * @param value Value to set for the autonomousSystemNumber property.
     * @return a void
     */
    public void setAutonomousSystemNumber(@javax.annotation.Nullable final Integer value) {
        this._autonomousSystemNumber = value;
    }
    /**
     * Sets the azureResourceId property value. Contains a fully qualified Azure Resource Manager ID of an Azure resource accessed during the sign-in.
     * @param value Value to set for the azureResourceId property.
     * @return a void
     */
    public void setAzureResourceId(@javax.annotation.Nullable final String value) {
        this._azureResourceId = value;
    }
    /**
     * Sets the clientAppUsed property value. The legacy client used for sign-in activity. For example: Browser, Exchange ActiveSync, Modern clients, IMAP, MAPI, SMTP, or POP. Supports $filter (eq operator only).
     * @param value Value to set for the clientAppUsed property.
     * @return a void
     */
    public void setClientAppUsed(@javax.annotation.Nullable final String value) {
        this._clientAppUsed = value;
    }
    /**
     * Sets the clientCredentialType property value. Describes the credential type that a user client or service principal provided to Azure AD to authenticate itself. You may wish to review clientCredentialType to track and eliminate less secure credential types or to watch for clients and service principals using anomalous credential types. The possible values are: none, clientSecret, clientAssertion, federatedIdentityCredential, managedIdentity, certificate, unknownFutureValue.
     * @param value Value to set for the clientCredentialType property.
     * @return a void
     */
    public void setClientCredentialType(@javax.annotation.Nullable final ClientCredentialType value) {
        this._clientCredentialType = value;
    }
    /**
     * Sets the conditionalAccessStatus property value. The status of the conditional access policy triggered. Possible values: success, failure, notApplied, or unknownFutureValue. Supports $filter (eq operator only).
     * @param value Value to set for the conditionalAccessStatus property.
     * @return a void
     */
    public void setConditionalAccessStatus(@javax.annotation.Nullable final ConditionalAccessStatus value) {
        this._conditionalAccessStatus = value;
    }
    /**
     * Sets the correlationId property value. The identifier that's sent from the client when sign-in is initiated. This is used for troubleshooting the corresponding sign-in activity when calling for support. Supports $filter (eq operator only).
     * @param value Value to set for the correlationId property.
     * @return a void
     */
    public void setCorrelationId(@javax.annotation.Nullable final String value) {
        this._correlationId = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the sign-in was initiated. The Timestamp type is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $orderby and $filter (eq, le, and ge operators only).
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the crossTenantAccessType property value. Describes the type of cross-tenant access used by the actor to access the resource. Possible values are: none, b2bCollaboration, b2bDirectConnect, microsoftSupport, serviceProvider, unknownFutureValue. If the sign in did not cross tenant boundaries, the value is none.
     * @param value Value to set for the crossTenantAccessType property.
     * @return a void
     */
    public void setCrossTenantAccessType(@javax.annotation.Nullable final SignInAccessType value) {
        this._crossTenantAccessType = value;
    }
    /**
     * Sets the deviceDetail property value. The device information from where the sign-in occurred. Includes information such as deviceId, OS, and browser. Supports $filter (eq and startsWith operators only) on browser and operatingSystem properties.
     * @param value Value to set for the deviceDetail property.
     * @return a void
     */
    public void setDeviceDetail(@javax.annotation.Nullable final DeviceDetail value) {
        this._deviceDetail = value;
    }
    /**
     * Sets the federatedCredentialId property value. Contains the identifier of an application's federated identity credential, if a federated identity credential was used to sign in.
     * @param value Value to set for the federatedCredentialId property.
     * @return a void
     */
    public void setFederatedCredentialId(@javax.annotation.Nullable final String value) {
        this._federatedCredentialId = value;
    }
    /**
     * Sets the flaggedForReview property value. During a failed sign in, a user may click a button in the Azure portal to mark the failed event for tenant admins. If a user clicked the button to flag the failed sign in, this value is true.
     * @param value Value to set for the flaggedForReview property.
     * @return a void
     */
    public void setFlaggedForReview(@javax.annotation.Nullable final Boolean value) {
        this._flaggedForReview = value;
    }
    /**
     * Sets the homeTenantId property value. The tenant identifier of the user initiating the sign in. Not applicable in Managed Identity or service principal sign ins.
     * @param value Value to set for the homeTenantId property.
     * @return a void
     */
    public void setHomeTenantId(@javax.annotation.Nullable final String value) {
        this._homeTenantId = value;
    }
    /**
     * Sets the homeTenantName property value. For user sign ins, the identifier of the tenant that the user is a member of. Only populated in cases where the home tenant has provided affirmative consent to Azure AD to show the tenant content.
     * @param value Value to set for the homeTenantName property.
     * @return a void
     */
    public void setHomeTenantName(@javax.annotation.Nullable final String value) {
        this._homeTenantName = value;
    }
    /**
     * Sets the incomingTokenType property value. Indicates the token types that were presented to Azure AD to authenticate the actor in the sign in. The possible values are: none, primaryRefreshToken, saml11, saml20, unknownFutureValue, remoteDesktopToken.  NOTE Azure AD may have also used token types not listed in this Enum type to authenticate the actor. Do not infer the lack of a token if it is not one of the types listed. Also, please note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: remoteDesktopToken.
     * @param value Value to set for the incomingTokenType property.
     * @return a void
     */
    public void setIncomingTokenType(@javax.annotation.Nullable final IncomingTokenType value) {
        this._incomingTokenType = value;
    }
    /**
     * Sets the ipAddress property value. The IP address of the client from where the sign-in occurred. Supports $filter (eq and startsWith operators only).
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this._ipAddress = value;
    }
    /**
     * Sets the ipAddressFromResourceProvider property value. The IP address a user used to reach a resource provider, used to determine Conditional Access compliance for some policies. For example, when a user interacts with Exchange Online, the IP address Exchange receives from the user may be recorded here. This value is often null.
     * @param value Value to set for the ipAddressFromResourceProvider property.
     * @return a void
     */
    public void setIpAddressFromResourceProvider(@javax.annotation.Nullable final String value) {
        this._ipAddressFromResourceProvider = value;
    }
    /**
     * Sets the isInteractive property value. Indicates whether a user sign in is interactive. In interactive sign in, the user provides an authentication factor to Azure AD. These factors include passwords, responses to MFA challenges, biometric factors, or QR codes that a user provides to Azure AD or an associated app. In non-interactive sign in, the user doesn't provide an authentication factor. Instead, the client app uses a token or code to authenticate or access a resource on behalf of a user. Non-interactive sign ins are commonly used for a client to sign in on a user's behalf in a process transparent to the user.
     * @param value Value to set for the isInteractive property.
     * @return a void
     */
    public void setIsInteractive(@javax.annotation.Nullable final Boolean value) {
        this._isInteractive = value;
    }
    /**
     * Sets the isTenantRestricted property value. Shows whether the sign in event was subject to an Azure AD tenant restriction policy.
     * @param value Value to set for the isTenantRestricted property.
     * @return a void
     */
    public void setIsTenantRestricted(@javax.annotation.Nullable final Boolean value) {
        this._isTenantRestricted = value;
    }
    /**
     * Sets the location property value. The city, state, and 2 letter country code from where the sign-in occurred. Supports $filter (eq and startsWith operators only) on city, state, and countryOrRegion properties.
     * @param value Value to set for the location property.
     * @return a void
     */
    public void setLocation(@javax.annotation.Nullable final SignInLocation value) {
        this._location = value;
    }
    /**
     * Sets the mfaDetail property value. The mfaDetail property
     * @param value Value to set for the mfaDetail property.
     * @return a void
     */
    public void setMfaDetail(@javax.annotation.Nullable final MfaDetail value) {
        this._mfaDetail = value;
    }
    /**
     * Sets the networkLocationDetails property value. The network location details including the type of network used and its names.
     * @param value Value to set for the networkLocationDetails property.
     * @return a void
     */
    public void setNetworkLocationDetails(@javax.annotation.Nullable final java.util.List<NetworkLocationDetail> value) {
        this._networkLocationDetails = value;
    }
    /**
     * Sets the originalRequestId property value. The request identifier of the first request in the authentication sequence. Supports $filter (eq operator only).
     * @param value Value to set for the originalRequestId property.
     * @return a void
     */
    public void setOriginalRequestId(@javax.annotation.Nullable final String value) {
        this._originalRequestId = value;
    }
    /**
     * Sets the privateLinkDetails property value. Contains information about the Azure AD Private Link policy that is associated with the sign in event.
     * @param value Value to set for the privateLinkDetails property.
     * @return a void
     */
    public void setPrivateLinkDetails(@javax.annotation.Nullable final PrivateLinkDetails value) {
        this._privateLinkDetails = value;
    }
    /**
     * Sets the processingTimeInMilliseconds property value. The request processing time in milliseconds in AD STS.
     * @param value Value to set for the processingTimeInMilliseconds property.
     * @return a void
     */
    public void setProcessingTimeInMilliseconds(@javax.annotation.Nullable final Integer value) {
        this._processingTimeInMilliseconds = value;
    }
    /**
     * Sets the resourceDisplayName property value. The name of the resource that the user signed in to. Supports $filter (eq operator only).
     * @param value Value to set for the resourceDisplayName property.
     * @return a void
     */
    public void setResourceDisplayName(@javax.annotation.Nullable final String value) {
        this._resourceDisplayName = value;
    }
    /**
     * Sets the resourceId property value. The identifier of the resource that the user signed in to. Supports $filter (eq operator only).
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this._resourceId = value;
    }
    /**
     * Sets the resourceServicePrincipalId property value. The identifier of the service principal representing the target resource in the sign-in event.
     * @param value Value to set for the resourceServicePrincipalId property.
     * @return a void
     */
    public void setResourceServicePrincipalId(@javax.annotation.Nullable final String value) {
        this._resourceServicePrincipalId = value;
    }
    /**
     * Sets the resourceTenantId property value. The tenant identifier of the resource referenced in the sign in.
     * @param value Value to set for the resourceTenantId property.
     * @return a void
     */
    public void setResourceTenantId(@javax.annotation.Nullable final String value) {
        this._resourceTenantId = value;
    }
    /**
     * Sets the riskDetail property value. The reason behind a specific state of a risky user, sign-in, or a risk event. Possible values: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, or unknownFutureValue. The value none means that no action has been performed on the user or sign-in so far. Supports $filter (eq operator only). Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden.
     * @param value Value to set for the riskDetail property.
     * @return a void
     */
    public void setRiskDetail(@javax.annotation.Nullable final RiskDetail value) {
        this._riskDetail = value;
    }
    /**
     * Sets the riskEventTypes_v2 property value. The list of risk event types associated with the sign-in. Possible values: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, or unknownFutureValue. Supports $filter (eq and startsWith operators only).
     * @param value Value to set for the riskEventTypes_v2 property.
     * @return a void
     */
    public void setRiskEventTypes_v2(@javax.annotation.Nullable final java.util.List<String> value) {
        this._riskEventTypes_v2 = value;
    }
    /**
     * Sets the riskLevelAggregated property value. The aggregated risk level. Possible values: none, low, medium, high, hidden, or unknownFutureValue. The value hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Supports $filter (eq operator only). Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden.
     * @param value Value to set for the riskLevelAggregated property.
     * @return a void
     */
    public void setRiskLevelAggregated(@javax.annotation.Nullable final RiskLevel value) {
        this._riskLevelAggregated = value;
    }
    /**
     * Sets the riskLevelDuringSignIn property value. The risk level during sign-in. Possible values: none, low, medium, high, hidden, or unknownFutureValue. The value hidden means the user or sign-in was not enabled for Azure AD Identity Protection. Supports $filter (eq operator only). Note: Details for this property are only available for Azure AD Premium P2 customers. All other customers are returned hidden.
     * @param value Value to set for the riskLevelDuringSignIn property.
     * @return a void
     */
    public void setRiskLevelDuringSignIn(@javax.annotation.Nullable final RiskLevel value) {
        this._riskLevelDuringSignIn = value;
    }
    /**
     * Sets the riskState property value. The risk state of a risky user, sign-in, or a risk event. Possible values: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, or unknownFutureValue. Supports $filter (eq operator only).
     * @param value Value to set for the riskState property.
     * @return a void
     */
    public void setRiskState(@javax.annotation.Nullable final RiskState value) {
        this._riskState = value;
    }
    /**
     * Sets the servicePrincipalCredentialKeyId property value. The unique identifier of the key credential used by the service principal to authenticate.
     * @param value Value to set for the servicePrincipalCredentialKeyId property.
     * @return a void
     */
    public void setServicePrincipalCredentialKeyId(@javax.annotation.Nullable final String value) {
        this._servicePrincipalCredentialKeyId = value;
    }
    /**
     * Sets the servicePrincipalCredentialThumbprint property value. The certificate thumbprint of the certificate used by the service principal to authenticate.
     * @param value Value to set for the servicePrincipalCredentialThumbprint property.
     * @return a void
     */
    public void setServicePrincipalCredentialThumbprint(@javax.annotation.Nullable final String value) {
        this._servicePrincipalCredentialThumbprint = value;
    }
    /**
     * Sets the servicePrincipalId property value. The application identifier used for sign-in. This field is populated when you are signing in using an application. Supports $filter (eq and startsWith operators only).
     * @param value Value to set for the servicePrincipalId property.
     * @return a void
     */
    public void setServicePrincipalId(@javax.annotation.Nullable final String value) {
        this._servicePrincipalId = value;
    }
    /**
     * Sets the servicePrincipalName property value. The application name used for sign-in. This field is populated when you are signing in using an application. Supports $filter (eq and startsWith operators only).
     * @param value Value to set for the servicePrincipalName property.
     * @return a void
     */
    public void setServicePrincipalName(@javax.annotation.Nullable final String value) {
        this._servicePrincipalName = value;
    }
    /**
     * Sets the sessionLifetimePolicies property value. Any conditional access session management policies that were applied during the sign-in event.
     * @param value Value to set for the sessionLifetimePolicies property.
     * @return a void
     */
    public void setSessionLifetimePolicies(@javax.annotation.Nullable final java.util.List<SessionLifetimePolicy> value) {
        this._sessionLifetimePolicies = value;
    }
    /**
     * Sets the signInEventTypes property value. Indicates the category of sign in that the event represents. For user sign ins, the category can be interactiveUser or nonInteractiveUser and corresponds to the value for the isInteractive property on the signin resource. For managed identity sign ins, the category is managedIdentity. For service principal sign ins, the category is servicePrincipal. Possible values are: interactiveUser, nonInteractiveUser, servicePrincipal, managedIdentity, unknownFutureValue. Supports $filter (eq, ne).
     * @param value Value to set for the signInEventTypes property.
     * @return a void
     */
    public void setSignInEventTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._signInEventTypes = value;
    }
    /**
     * Sets the signInIdentifier property value. The identification that the user provided to sign in. It may be the userPrincipalName but it's also populated when a user signs in using other identifiers.
     * @param value Value to set for the signInIdentifier property.
     * @return a void
     */
    public void setSignInIdentifier(@javax.annotation.Nullable final String value) {
        this._signInIdentifier = value;
    }
    /**
     * Sets the signInIdentifierType property value. The type of sign in identifier. Possible values are: userPrincipalName, phoneNumber, proxyAddress, qrCode, onPremisesUserPrincipalName, unknownFutureValue.
     * @param value Value to set for the signInIdentifierType property.
     * @return a void
     */
    public void setSignInIdentifierType(@javax.annotation.Nullable final SignInIdentifierType value) {
        this._signInIdentifierType = value;
    }
    /**
     * Sets the status property value. The sign-in status. Includes the error code and description of the error (in case of a sign-in failure). Supports $filter (eq operator only) on errorCode property.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final SignInStatus value) {
        this._status = value;
    }
    /**
     * Sets the tokenIssuerName property value. The name of the identity provider. For example, sts.microsoft.com. Supports $filter (eq operator only).
     * @param value Value to set for the tokenIssuerName property.
     * @return a void
     */
    public void setTokenIssuerName(@javax.annotation.Nullable final String value) {
        this._tokenIssuerName = value;
    }
    /**
     * Sets the tokenIssuerType property value. The type of identity provider. The possible values are: AzureAD, ADFederationServices, UnknownFutureValue, AzureADBackupAuth, ADFederationServicesMFAAdapter, NPSExtension. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: AzureADBackupAuth , ADFederationServicesMFAAdapter , NPSExtension.
     * @param value Value to set for the tokenIssuerType property.
     * @return a void
     */
    public void setTokenIssuerType(@javax.annotation.Nullable final TokenIssuerType value) {
        this._tokenIssuerType = value;
    }
    /**
     * Sets the uniqueTokenIdentifier property value. A unique base64 encoded request identifier used to track tokens issued by Azure AD as they are redeemed at resource providers.
     * @param value Value to set for the uniqueTokenIdentifier property.
     * @return a void
     */
    public void setUniqueTokenIdentifier(@javax.annotation.Nullable final String value) {
        this._uniqueTokenIdentifier = value;
    }
    /**
     * Sets the userAgent property value. The user agent information related to sign-in. Supports $filter (eq and startsWith operators only).
     * @param value Value to set for the userAgent property.
     * @return a void
     */
    public void setUserAgent(@javax.annotation.Nullable final String value) {
        this._userAgent = value;
    }
    /**
     * Sets the userDisplayName property value. The display name of the user. Supports $filter (eq and startsWith operators only).
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userId property value. The identifier of the user. Supports $filter (eq operator only).
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userPrincipalName property value. The UPN of the user. Supports $filter (eq and startsWith operators only).
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
    /**
     * Sets the userType property value. Identifies whether the user is a member or guest in the tenant. Possible values are: member, guest, unknownFutureValue.
     * @param value Value to set for the userType property.
     * @return a void
     */
    public void setUserType(@javax.annotation.Nullable final SignInUserType value) {
        this._userType = value;
    }
}
