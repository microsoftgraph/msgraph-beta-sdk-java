package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SignIn extends Entity implements Parsable {
    /**
     * Instantiates a new SignIn and sets the default values.
     */
    public SignIn() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SignIn
     */
    @jakarta.annotation.Nonnull
    public static SignIn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignIn();
    }
    /**
     * Gets the appDisplayName property value. The application name displayed in the Microsoft Entra admin center.  Supports $filter (eq, startsWith).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.BackingStore.get("appDisplayName");
    }
    /**
     * Gets the appId property value. The application identifier in Microsoft Entra ID.  Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.BackingStore.get("appId");
    }
    /**
     * Gets the appliedConditionalAccessPolicies property value. A list of conditional access policies that are triggered by the corresponding sign-in activity. Apps need additional Conditional Access-related privileges to read the details of this property. For more information, see Viewing applied conditional access (CA) policies in sign-ins.
     * @return a java.util.List<AppliedConditionalAccessPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppliedConditionalAccessPolicy> getAppliedConditionalAccessPolicies() {
        return this.BackingStore.get("appliedConditionalAccessPolicies");
    }
    /**
     * Gets the appliedEventListeners property value. Detailed information about the listeners, such as Azure Logic Apps and Azure Functions, that were triggered by the corresponding events in the sign-in event.
     * @return a java.util.List<AppliedAuthenticationEventListener>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppliedAuthenticationEventListener> getAppliedEventListeners() {
        return this.BackingStore.get("appliedEventListeners");
    }
    /**
     * Gets the appTokenProtectionStatus property value. The appTokenProtectionStatus property
     * @return a TokenProtectionStatus
     */
    @jakarta.annotation.Nullable
    public TokenProtectionStatus getAppTokenProtectionStatus() {
        return this.BackingStore.get("appTokenProtectionStatus");
    }
    /**
     * Gets the authenticationAppDeviceDetails property value. Provides details about the app and device used during a Microsoft Entra authentication step.
     * @return a AuthenticationAppDeviceDetails
     */
    @jakarta.annotation.Nullable
    public AuthenticationAppDeviceDetails getAuthenticationAppDeviceDetails() {
        return this.BackingStore.get("authenticationAppDeviceDetails");
    }
    /**
     * Gets the authenticationAppPolicyEvaluationDetails property value. Provides details of the Microsoft Entra policies applied to a user and client authentication app during an authentication step.
     * @return a java.util.List<AuthenticationAppPolicyDetails>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationAppPolicyDetails> getAuthenticationAppPolicyEvaluationDetails() {
        return this.BackingStore.get("authenticationAppPolicyEvaluationDetails");
    }
    /**
     * Gets the authenticationContextClassReferences property value. Contains a collection of values that represent the conditional access authentication contexts applied to the sign-in.
     * @return a java.util.List<AuthenticationContext>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationContext> getAuthenticationContextClassReferences() {
        return this.BackingStore.get("authenticationContextClassReferences");
    }
    /**
     * Gets the authenticationDetails property value. The result of the authentication attempt and more details on the authentication method.
     * @return a java.util.List<AuthenticationDetail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationDetail> getAuthenticationDetails() {
        return this.BackingStore.get("authenticationDetails");
    }
    /**
     * Gets the authenticationMethodsUsed property value. The authentication methods used. Possible values: SMS, Authenticator App, App Verification code, Password, FIDO, PTA, or PHS.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAuthenticationMethodsUsed() {
        return this.BackingStore.get("authenticationMethodsUsed");
    }
    /**
     * Gets the authenticationProcessingDetails property value. More authentication processing details, such as the agent name for  PTA and PHS, or a server or farm name for federated authentication.
     * @return a java.util.List<KeyValue>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValue> getAuthenticationProcessingDetails() {
        return this.BackingStore.get("authenticationProcessingDetails");
    }
    /**
     * Gets the authenticationProtocol property value. Lists the protocol type or grant type used in the authentication. The possible values are: oAuth2, ropc, wsFederation, saml20, deviceCode, unknownFutureValue, authenticationTransfer, and none. Use none for all authentications that do not have a specific value in that list.
     * @return a EnumSet<ProtocolType>
     */
    @jakarta.annotation.Nullable
    public EnumSet<ProtocolType> getAuthenticationProtocol() {
        return this.BackingStore.get("authenticationProtocol");
    }
    /**
     * Gets the authenticationRequirement property value. This holds the highest level of authentication needed through all the sign-in steps, for sign-in to succeed.  Supports $filter (eq, startsWith).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationRequirement() {
        return this.BackingStore.get("authenticationRequirement");
    }
    /**
     * Gets the authenticationRequirementPolicies property value. Sources of authentication requirement, such as conditional access, per-user MFA, identity protection, and security defaults.
     * @return a java.util.List<AuthenticationRequirementPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationRequirementPolicy> getAuthenticationRequirementPolicies() {
        return this.BackingStore.get("authenticationRequirementPolicies");
    }
    /**
     * Gets the autonomousSystemNumber property value. The Autonomous System Number (ASN) of the network used by the actor.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAutonomousSystemNumber() {
        return this.BackingStore.get("autonomousSystemNumber");
    }
    /**
     * Gets the azureResourceId property value. Contains a fully qualified Azure Resource Manager ID of an Azure resource accessed during the sign-in.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureResourceId() {
        return this.BackingStore.get("azureResourceId");
    }
    /**
     * Gets the clientAppUsed property value. The legacy client used for sign-in activity. For example: Browser, Exchange ActiveSync, Modern clients, IMAP, MAPI, SMTP, or POP.  Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientAppUsed() {
        return this.BackingStore.get("clientAppUsed");
    }
    /**
     * Gets the clientCredentialType property value. Describes the credential type that a user client or service principal provided to Microsoft Entra ID to authenticate itself. You may wish to review clientCredentialType to track and eliminate less secure credential types or to watch for clients and service principals using anomalous credential types. The possible values are: none, clientSecret, clientAssertion, federatedIdentityCredential, managedIdentity, certificate, unknownFutureValue.
     * @return a ClientCredentialType
     */
    @jakarta.annotation.Nullable
    public ClientCredentialType getClientCredentialType() {
        return this.BackingStore.get("clientCredentialType");
    }
    /**
     * Gets the conditionalAccessStatus property value. The status of the conditional access policy triggered. Possible values: success, failure, notApplied, or unknownFutureValue.  Supports $filter (eq).
     * @return a ConditionalAccessStatus
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessStatus getConditionalAccessStatus() {
        return this.BackingStore.get("conditionalAccessStatus");
    }
    /**
     * Gets the correlationId property value. The identifier that's sent from the client when sign-in is initiated. This is used for troubleshooting the corresponding sign-in activity when calling for support.  Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.BackingStore.get("correlationId");
    }
    /**
     * Gets the createdDateTime property value. The date and time the sign-in was initiated. The Timestamp type is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $orderby, $filter (eq, le, and ge).
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * Gets the crossTenantAccessType property value. Describes the type of cross-tenant access used by the actor to access the resource. Possible values are: none, b2bCollaboration, b2bDirectConnect, microsoftSupport, serviceProvider, unknownFutureValue. If the sign in didn't cross tenant boundaries, the value is none.
     * @return a EnumSet<SignInAccessType>
     */
    @jakarta.annotation.Nullable
    public EnumSet<SignInAccessType> getCrossTenantAccessType() {
        return this.BackingStore.get("crossTenantAccessType");
    }
    /**
     * Gets the deviceDetail property value. The device information from where the sign-in occurred. Includes information such as deviceId, OS, and browser.  Supports $filter (eq, startsWith) on browser and operatingSystem properties.
     * @return a DeviceDetail
     */
    @jakarta.annotation.Nullable
    public DeviceDetail getDeviceDetail() {
        return this.BackingStore.get("deviceDetail");
    }
    /**
     * Gets the federatedCredentialId property value. Contains the identifier of an application's federated identity credential, if a federated identity credential was used to sign in.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFederatedCredentialId() {
        return this.BackingStore.get("federatedCredentialId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("appliedConditionalAccessPolicies", (n) -> { this.setAppliedConditionalAccessPolicies(n.getCollectionOfObjectValues(AppliedConditionalAccessPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("appliedEventListeners", (n) -> { this.setAppliedEventListeners(n.getCollectionOfObjectValues(AppliedAuthenticationEventListener::createFromDiscriminatorValue)); });
        deserializerMap.put("appTokenProtectionStatus", (n) -> { this.setAppTokenProtectionStatus(n.getEnumValue(TokenProtectionStatus.class)); });
        deserializerMap.put("authenticationAppDeviceDetails", (n) -> { this.setAuthenticationAppDeviceDetails(n.getObjectValue(AuthenticationAppDeviceDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationAppPolicyEvaluationDetails", (n) -> { this.setAuthenticationAppPolicyEvaluationDetails(n.getCollectionOfObjectValues(AuthenticationAppPolicyDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationContextClassReferences", (n) -> { this.setAuthenticationContextClassReferences(n.getCollectionOfObjectValues(AuthenticationContext::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationDetails", (n) -> { this.setAuthenticationDetails(n.getCollectionOfObjectValues(AuthenticationDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationMethodsUsed", (n) -> { this.setAuthenticationMethodsUsed(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("authenticationProcessingDetails", (n) -> { this.setAuthenticationProcessingDetails(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationProtocol", (n) -> { this.setAuthenticationProtocol(n.getEnumSetValue(ProtocolType.class)); });
        deserializerMap.put("authenticationRequirement", (n) -> { this.setAuthenticationRequirement(n.getStringValue()); });
        deserializerMap.put("authenticationRequirementPolicies", (n) -> { this.setAuthenticationRequirementPolicies(n.getCollectionOfObjectValues(AuthenticationRequirementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("autonomousSystemNumber", (n) -> { this.setAutonomousSystemNumber(n.getIntegerValue()); });
        deserializerMap.put("azureResourceId", (n) -> { this.setAzureResourceId(n.getStringValue()); });
        deserializerMap.put("clientAppUsed", (n) -> { this.setClientAppUsed(n.getStringValue()); });
        deserializerMap.put("clientCredentialType", (n) -> { this.setClientCredentialType(n.getEnumValue(ClientCredentialType.class)); });
        deserializerMap.put("conditionalAccessStatus", (n) -> { this.setConditionalAccessStatus(n.getEnumValue(ConditionalAccessStatus.class)); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("crossTenantAccessType", (n) -> { this.setCrossTenantAccessType(n.getEnumSetValue(SignInAccessType.class)); });
        deserializerMap.put("deviceDetail", (n) -> { this.setDeviceDetail(n.getObjectValue(DeviceDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("federatedCredentialId", (n) -> { this.setFederatedCredentialId(n.getStringValue()); });
        deserializerMap.put("flaggedForReview", (n) -> { this.setFlaggedForReview(n.getBooleanValue()); });
        deserializerMap.put("homeTenantId", (n) -> { this.setHomeTenantId(n.getStringValue()); });
        deserializerMap.put("homeTenantName", (n) -> { this.setHomeTenantName(n.getStringValue()); });
        deserializerMap.put("incomingTokenType", (n) -> { this.setIncomingTokenType(n.getEnumSetValue(IncomingTokenType.class)); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("ipAddressFromResourceProvider", (n) -> { this.setIpAddressFromResourceProvider(n.getStringValue()); });
        deserializerMap.put("isInteractive", (n) -> { this.setIsInteractive(n.getBooleanValue()); });
        deserializerMap.put("isTenantRestricted", (n) -> { this.setIsTenantRestricted(n.getBooleanValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(SignInLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("managedServiceIdentity", (n) -> { this.setManagedServiceIdentity(n.getObjectValue(ManagedIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("mfaDetail", (n) -> { this.setMfaDetail(n.getObjectValue(MfaDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("networkLocationDetails", (n) -> { this.setNetworkLocationDetails(n.getCollectionOfObjectValues(NetworkLocationDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("originalRequestId", (n) -> { this.setOriginalRequestId(n.getStringValue()); });
        deserializerMap.put("originalTransferMethod", (n) -> { this.setOriginalTransferMethod(n.getEnumValue(OriginalTransferMethods.class)); });
        deserializerMap.put("privateLinkDetails", (n) -> { this.setPrivateLinkDetails(n.getObjectValue(PrivateLinkDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("processingTimeInMilliseconds", (n) -> { this.setProcessingTimeInMilliseconds(n.getIntegerValue()); });
        deserializerMap.put("resourceDisplayName", (n) -> { this.setResourceDisplayName(n.getStringValue()); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("resourceServicePrincipalId", (n) -> { this.setResourceServicePrincipalId(n.getStringValue()); });
        deserializerMap.put("resourceTenantId", (n) -> { this.setResourceTenantId(n.getStringValue()); });
        deserializerMap.put("riskDetail", (n) -> { this.setRiskDetail(n.getEnumValue(RiskDetail.class)); });
        deserializerMap.put("riskEventTypes_v2", (n) -> { this.setRiskEventTypesV2(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("riskLevelAggregated", (n) -> { this.setRiskLevelAggregated(n.getEnumValue(RiskLevel.class)); });
        deserializerMap.put("riskLevelDuringSignIn", (n) -> { this.setRiskLevelDuringSignIn(n.getEnumValue(RiskLevel.class)); });
        deserializerMap.put("riskState", (n) -> { this.setRiskState(n.getEnumValue(RiskState.class)); });
        deserializerMap.put("servicePrincipalCredentialKeyId", (n) -> { this.setServicePrincipalCredentialKeyId(n.getStringValue()); });
        deserializerMap.put("servicePrincipalCredentialThumbprint", (n) -> { this.setServicePrincipalCredentialThumbprint(n.getStringValue()); });
        deserializerMap.put("servicePrincipalId", (n) -> { this.setServicePrincipalId(n.getStringValue()); });
        deserializerMap.put("servicePrincipalName", (n) -> { this.setServicePrincipalName(n.getStringValue()); });
        deserializerMap.put("sessionLifetimePolicies", (n) -> { this.setSessionLifetimePolicies(n.getCollectionOfObjectValues(SessionLifetimePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("signInEventTypes", (n) -> { this.setSignInEventTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("signInIdentifier", (n) -> { this.setSignInIdentifier(n.getStringValue()); });
        deserializerMap.put("signInIdentifierType", (n) -> { this.setSignInIdentifierType(n.getEnumValue(SignInIdentifierType.class)); });
        deserializerMap.put("signInTokenProtectionStatus", (n) -> { this.setSignInTokenProtectionStatus(n.getEnumValue(TokenProtectionStatus.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(SignInStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("tokenIssuerName", (n) -> { this.setTokenIssuerName(n.getStringValue()); });
        deserializerMap.put("tokenIssuerType", (n) -> { this.setTokenIssuerType(n.getEnumValue(TokenIssuerType.class)); });
        deserializerMap.put("uniqueTokenIdentifier", (n) -> { this.setUniqueTokenIdentifier(n.getStringValue()); });
        deserializerMap.put("userAgent", (n) -> { this.setUserAgent(n.getStringValue()); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getEnumValue(SignInUserType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the flaggedForReview property value. During a failed sign in, a user may select a button in the Azure portal to mark the failed event for tenant admins. If a user clicked the button to flag the failed sign in, this value is true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFlaggedForReview() {
        return this.BackingStore.get("flaggedForReview");
    }
    /**
     * Gets the homeTenantId property value. The tenant identifier of the user initiating the sign in. Not applicable in Managed Identity or service principal sign ins.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHomeTenantId() {
        return this.BackingStore.get("homeTenantId");
    }
    /**
     * Gets the homeTenantName property value. For user sign ins, the identifier of the tenant that the user is a member of. Only populated in cases where the home tenant has provided affirmative consent to Microsoft Entra ID to show the tenant content.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHomeTenantName() {
        return this.BackingStore.get("homeTenantName");
    }
    /**
     * Gets the incomingTokenType property value. Indicates the token types that were presented to Microsoft Entra ID to authenticate the actor in the sign in. The possible values are: none, primaryRefreshToken, saml11, saml20, unknownFutureValue, remoteDesktopToken.  NOTE Microsoft Entra ID may have also used token types not listed in this Enum type to authenticate the actor. Don't infer the lack of a token if it isn't one of the types listed. Also, please note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: remoteDesktopToken.
     * @return a EnumSet<IncomingTokenType>
     */
    @jakarta.annotation.Nullable
    public EnumSet<IncomingTokenType> getIncomingTokenType() {
        return this.BackingStore.get("incomingTokenType");
    }
    /**
     * Gets the ipAddress property value. The IP address of the client from where the sign-in occurred.  Supports $filter (eq, startsWith).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.BackingStore.get("ipAddress");
    }
    /**
     * Gets the ipAddressFromResourceProvider property value. The IP address a user used to reach a resource provider, used to determine Conditional Access compliance for some policies. For example, when a user interacts with Exchange Online, the IP address Exchange receives from the user may be recorded here. This value is often null.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpAddressFromResourceProvider() {
        return this.BackingStore.get("ipAddressFromResourceProvider");
    }
    /**
     * Gets the isInteractive property value. Indicates whether a user sign in is interactive. In interactive sign in, the user provides an authentication factor to Microsoft Entra ID. These factors include passwords, responses to MFA challenges, biometric factors, or QR codes that a user provides to Microsoft Entra ID or an associated app. In non-interactive sign in, the user doesn't provide an authentication factor. Instead, the client app uses a token or code to authenticate or access a resource on behalf of a user. Non-interactive sign ins are commonly used for a client to sign in on a user's behalf in a process transparent to the user.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInteractive() {
        return this.BackingStore.get("isInteractive");
    }
    /**
     * Gets the isTenantRestricted property value. Shows whether the sign in event was subject to a Microsoft Entra tenant restriction policy.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTenantRestricted() {
        return this.BackingStore.get("isTenantRestricted");
    }
    /**
     * Gets the location property value. The city, state, and two letter country code from where the sign-in occurred.  Supports $filter (eq, startsWith) on city, state, and countryOrRegion properties.
     * @return a SignInLocation
     */
    @jakarta.annotation.Nullable
    public SignInLocation getLocation() {
        return this.BackingStore.get("location");
    }
    /**
     * Gets the managedServiceIdentity property value. Contains information about the managed identity used for the sign in, including its type, associated Azure Resource Manager (ARM) resource ID, and federated token information.
     * @return a ManagedIdentity
     */
    @jakarta.annotation.Nullable
    public ManagedIdentity getManagedServiceIdentity() {
        return this.BackingStore.get("managedServiceIdentity");
    }
    /**
     * Gets the mfaDetail property value. The mfaDetail property
     * @return a MfaDetail
     */
    @jakarta.annotation.Nullable
    public MfaDetail getMfaDetail() {
        return this.BackingStore.get("mfaDetail");
    }
    /**
     * Gets the networkLocationDetails property value. The network location details including the type of network used and its names.
     * @return a java.util.List<NetworkLocationDetail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<NetworkLocationDetail> getNetworkLocationDetails() {
        return this.BackingStore.get("networkLocationDetails");
    }
    /**
     * Gets the originalRequestId property value. The request identifier of the first request in the authentication sequence.  Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOriginalRequestId() {
        return this.BackingStore.get("originalRequestId");
    }
    /**
     * Gets the originalTransferMethod property value. Transfer method used to initiate a session throughout all subsequent request. The possible values are: none, deviceCodeFlow, authenticationTransfer, unknownFutureValue.
     * @return a OriginalTransferMethods
     */
    @jakarta.annotation.Nullable
    public OriginalTransferMethods getOriginalTransferMethod() {
        return this.BackingStore.get("originalTransferMethod");
    }
    /**
     * Gets the privateLinkDetails property value. Contains information about the Microsoft Entra Private Link policy that is associated with the sign in event.
     * @return a PrivateLinkDetails
     */
    @jakarta.annotation.Nullable
    public PrivateLinkDetails getPrivateLinkDetails() {
        return this.BackingStore.get("privateLinkDetails");
    }
    /**
     * Gets the processingTimeInMilliseconds property value. The request processing time in milliseconds in AD STS.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getProcessingTimeInMilliseconds() {
        return this.BackingStore.get("processingTimeInMilliseconds");
    }
    /**
     * Gets the resourceDisplayName property value. The name of the resource that the user signed in to.  Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceDisplayName() {
        return this.BackingStore.get("resourceDisplayName");
    }
    /**
     * Gets the resourceId property value. The identifier of the resource that the user signed in to.  Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.BackingStore.get("resourceId");
    }
    /**
     * Gets the resourceServicePrincipalId property value. The identifier of the service principal representing the target resource in the sign-in event.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceServicePrincipalId() {
        return this.BackingStore.get("resourceServicePrincipalId");
    }
    /**
     * Gets the resourceTenantId property value. The tenant identifier of the resource referenced in the sign in.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceTenantId() {
        return this.BackingStore.get("resourceTenantId");
    }
    /**
     * Gets the riskDetail property value. The reason behind a specific state of a risky user, sign-in, or a risk event. Possible values: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, or unknownFutureValue. The value none means that no action has been performed on the user or sign-in so far.  Supports $filter (eq). Note: Details for this property are only available for Microsoft Entra ID P2 customers. All other customers are returned hidden.
     * @return a RiskDetail
     */
    @jakarta.annotation.Nullable
    public RiskDetail getRiskDetail() {
        return this.BackingStore.get("riskDetail");
    }
    /**
     * Gets the riskEventTypes_v2 property value. The list of risk event types associated with the sign-in. Possible values: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, or unknownFutureValue.  Supports $filter (eq, startsWith).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRiskEventTypesV2() {
        return this.BackingStore.get("riskEventTypesV2");
    }
    /**
     * Gets the riskLevelAggregated property value. The aggregated risk level. Possible values: none, low, medium, high, hidden, or unknownFutureValue. The value hidden means the user or sign-in was not enabled for Microsoft Entra ID Protection.  Supports $filter (eq). Note: Details for this property are only available for Microsoft Entra ID P2 customers. All other customers are returned hidden.
     * @return a RiskLevel
     */
    @jakarta.annotation.Nullable
    public RiskLevel getRiskLevelAggregated() {
        return this.BackingStore.get("riskLevelAggregated");
    }
    /**
     * Gets the riskLevelDuringSignIn property value. The risk level during sign-in. Possible values: none, low, medium, high, hidden, or unknownFutureValue. The value hidden means the user or sign-in wasn't enabled for Microsoft Entra ID Protection.  Supports $filter (eq). Note: Details for this property are only available for Microsoft Entra ID P2 customers. All other customers are returned hidden.
     * @return a RiskLevel
     */
    @jakarta.annotation.Nullable
    public RiskLevel getRiskLevelDuringSignIn() {
        return this.BackingStore.get("riskLevelDuringSignIn");
    }
    /**
     * Gets the riskState property value. The risk state of a risky user, sign-in, or a risk event. Possible values: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, or unknownFutureValue.  Supports $filter (eq).
     * @return a RiskState
     */
    @jakarta.annotation.Nullable
    public RiskState getRiskState() {
        return this.BackingStore.get("riskState");
    }
    /**
     * Gets the servicePrincipalCredentialKeyId property value. The unique identifier of the key credential used by the service principal to authenticate.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalCredentialKeyId() {
        return this.BackingStore.get("servicePrincipalCredentialKeyId");
    }
    /**
     * Gets the servicePrincipalCredentialThumbprint property value. The certificate thumbprint of the certificate used by the service principal to authenticate.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalCredentialThumbprint() {
        return this.BackingStore.get("servicePrincipalCredentialThumbprint");
    }
    /**
     * Gets the servicePrincipalId property value. The application identifier used for sign-in. This field is populated when you're signing in using an application.  Supports $filter (eq, startsWith).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalId() {
        return this.BackingStore.get("servicePrincipalId");
    }
    /**
     * Gets the servicePrincipalName property value. The application name used for sign-in. This field is populated when you're signing in using an application.  Supports $filter (eq, startsWith).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalName() {
        return this.BackingStore.get("servicePrincipalName");
    }
    /**
     * Gets the sessionLifetimePolicies property value. Any conditional access session management policies that were applied during the sign-in event.
     * @return a java.util.List<SessionLifetimePolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SessionLifetimePolicy> getSessionLifetimePolicies() {
        return this.BackingStore.get("sessionLifetimePolicies");
    }
    /**
     * Gets the signInEventTypes property value. Indicates the category of sign in that the event represents. For user sign ins, the category can be interactiveUser or nonInteractiveUser and corresponds to the value for the isInteractive property on the signin resource. For managed identity sign ins, the category is managedIdentity. For service principal sign ins, the category is servicePrincipal. Possible values are: interactiveUser, nonInteractiveUser, servicePrincipal, managedIdentity, unknownFutureValue.  Supports $filter (eq, ne).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSignInEventTypes() {
        return this.BackingStore.get("signInEventTypes");
    }
    /**
     * Gets the signInIdentifier property value. The identification that the user provided to sign in. It may be the userPrincipalName but it's also populated when a user signs in using other identifiers.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSignInIdentifier() {
        return this.BackingStore.get("signInIdentifier");
    }
    /**
     * Gets the signInIdentifierType property value. The type of sign in identifier. Possible values are: userPrincipalName, phoneNumber, proxyAddress, qrCode, onPremisesUserPrincipalName, unknownFutureValue.
     * @return a SignInIdentifierType
     */
    @jakarta.annotation.Nullable
    public SignInIdentifierType getSignInIdentifierType() {
        return this.BackingStore.get("signInIdentifierType");
    }
    /**
     * Gets the signInTokenProtectionStatus property value. Token protection creates a cryptographically secure tie between the token and the device it's issued to. This field indicates whether the signin token was bound to the device or not. The possible values are: none, bound, unbound, unknownFutureValue.
     * @return a TokenProtectionStatus
     */
    @jakarta.annotation.Nullable
    public TokenProtectionStatus getSignInTokenProtectionStatus() {
        return this.BackingStore.get("signInTokenProtectionStatus");
    }
    /**
     * Gets the status property value. The sign-in status. Includes the error code and description of the error (for a sign-in failure).  Supports $filter (eq) on errorCode property.
     * @return a SignInStatus
     */
    @jakarta.annotation.Nullable
    public SignInStatus getStatus() {
        return this.BackingStore.get("status");
    }
    /**
     * Gets the tokenIssuerName property value. The name of the identity provider. For example, sts.microsoft.com.  Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTokenIssuerName() {
        return this.BackingStore.get("tokenIssuerName");
    }
    /**
     * Gets the tokenIssuerType property value. The type of identity provider. The possible values are: AzureAD, ADFederationServices, UnknownFutureValue, AzureADBackupAuth, ADFederationServicesMFAAdapter, NPSExtension. You must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: AzureADBackupAuth , ADFederationServicesMFAAdapter , NPSExtension.
     * @return a TokenIssuerType
     */
    @jakarta.annotation.Nullable
    public TokenIssuerType getTokenIssuerType() {
        return this.BackingStore.get("tokenIssuerType");
    }
    /**
     * Gets the uniqueTokenIdentifier property value. A unique base64 encoded request identifier used to track tokens issued by Microsoft Entra ID as they're redeemed at resource providers.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUniqueTokenIdentifier() {
        return this.BackingStore.get("uniqueTokenIdentifier");
    }
    /**
     * Gets the userAgent property value. The user agent information related to sign-in.  Supports $filter (eq, startsWith).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserAgent() {
        return this.BackingStore.get("userAgent");
    }
    /**
     * Gets the userDisplayName property value. The display name of the user.  Supports $filter (eq, startsWith).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.BackingStore.get("userDisplayName");
    }
    /**
     * Gets the userId property value. The identifier of the user.  Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.BackingStore.get("userId");
    }
    /**
     * Gets the userPrincipalName property value. The UPN of the user.  Supports $filter (eq, startsWith).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.BackingStore.get("userPrincipalName");
    }
    /**
     * Gets the userType property value. Identifies whether the user is a member or guest in the tenant. Possible values are: member, guest, unknownFutureValue.
     * @return a SignInUserType
     */
    @jakarta.annotation.Nullable
    public SignInUserType getUserType() {
        return this.BackingStore.get("userType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeCollectionOfObjectValues("appliedConditionalAccessPolicies", this.getAppliedConditionalAccessPolicies());
        writer.writeCollectionOfObjectValues("appliedEventListeners", this.getAppliedEventListeners());
        writer.writeEnumValue("appTokenProtectionStatus", this.getAppTokenProtectionStatus());
        writer.writeObjectValue("authenticationAppDeviceDetails", this.getAuthenticationAppDeviceDetails());
        writer.writeCollectionOfObjectValues("authenticationAppPolicyEvaluationDetails", this.getAuthenticationAppPolicyEvaluationDetails());
        writer.writeCollectionOfObjectValues("authenticationContextClassReferences", this.getAuthenticationContextClassReferences());
        writer.writeCollectionOfObjectValues("authenticationDetails", this.getAuthenticationDetails());
        writer.writeCollectionOfPrimitiveValues("authenticationMethodsUsed", this.getAuthenticationMethodsUsed());
        writer.writeCollectionOfObjectValues("authenticationProcessingDetails", this.getAuthenticationProcessingDetails());
        writer.writeEnumSetValue("authenticationProtocol", this.getAuthenticationProtocol());
        writer.writeStringValue("authenticationRequirement", this.getAuthenticationRequirement());
        writer.writeCollectionOfObjectValues("authenticationRequirementPolicies", this.getAuthenticationRequirementPolicies());
        writer.writeIntegerValue("autonomousSystemNumber", this.getAutonomousSystemNumber());
        writer.writeStringValue("azureResourceId", this.getAzureResourceId());
        writer.writeStringValue("clientAppUsed", this.getClientAppUsed());
        writer.writeEnumValue("clientCredentialType", this.getClientCredentialType());
        writer.writeEnumValue("conditionalAccessStatus", this.getConditionalAccessStatus());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeEnumSetValue("crossTenantAccessType", this.getCrossTenantAccessType());
        writer.writeObjectValue("deviceDetail", this.getDeviceDetail());
        writer.writeStringValue("federatedCredentialId", this.getFederatedCredentialId());
        writer.writeBooleanValue("flaggedForReview", this.getFlaggedForReview());
        writer.writeStringValue("homeTenantId", this.getHomeTenantId());
        writer.writeStringValue("homeTenantName", this.getHomeTenantName());
        writer.writeEnumSetValue("incomingTokenType", this.getIncomingTokenType());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeStringValue("ipAddressFromResourceProvider", this.getIpAddressFromResourceProvider());
        writer.writeBooleanValue("isInteractive", this.getIsInteractive());
        writer.writeBooleanValue("isTenantRestricted", this.getIsTenantRestricted());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeObjectValue("managedServiceIdentity", this.getManagedServiceIdentity());
        writer.writeObjectValue("mfaDetail", this.getMfaDetail());
        writer.writeCollectionOfObjectValues("networkLocationDetails", this.getNetworkLocationDetails());
        writer.writeStringValue("originalRequestId", this.getOriginalRequestId());
        writer.writeEnumValue("originalTransferMethod", this.getOriginalTransferMethod());
        writer.writeObjectValue("privateLinkDetails", this.getPrivateLinkDetails());
        writer.writeIntegerValue("processingTimeInMilliseconds", this.getProcessingTimeInMilliseconds());
        writer.writeStringValue("resourceDisplayName", this.getResourceDisplayName());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeStringValue("resourceServicePrincipalId", this.getResourceServicePrincipalId());
        writer.writeStringValue("resourceTenantId", this.getResourceTenantId());
        writer.writeEnumValue("riskDetail", this.getRiskDetail());
        writer.writeCollectionOfPrimitiveValues("riskEventTypes_v2", this.getRiskEventTypesV2());
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
        writer.writeEnumValue("signInTokenProtectionStatus", this.getSignInTokenProtectionStatus());
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
     * Sets the appDisplayName property value. The application name displayed in the Microsoft Entra admin center.  Supports $filter (eq, startsWith).
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("appDisplayName", value);
    }
    /**
     * Sets the appId property value. The application identifier in Microsoft Entra ID.  Supports $filter (eq).
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("appId", value);
    }
    /**
     * Sets the appliedConditionalAccessPolicies property value. A list of conditional access policies that are triggered by the corresponding sign-in activity. Apps need additional Conditional Access-related privileges to read the details of this property. For more information, see Viewing applied conditional access (CA) policies in sign-ins.
     * @param value Value to set for the appliedConditionalAccessPolicies property.
     */
    public void setAppliedConditionalAccessPolicies(@jakarta.annotation.Nullable final java.util.List<AppliedConditionalAccessPolicy> value) {
        this.BackingStore.set("appliedConditionalAccessPolicies", value);
    }
    /**
     * Sets the appliedEventListeners property value. Detailed information about the listeners, such as Azure Logic Apps and Azure Functions, that were triggered by the corresponding events in the sign-in event.
     * @param value Value to set for the appliedEventListeners property.
     */
    public void setAppliedEventListeners(@jakarta.annotation.Nullable final java.util.List<AppliedAuthenticationEventListener> value) {
        this.BackingStore.set("appliedEventListeners", value);
    }
    /**
     * Sets the appTokenProtectionStatus property value. The appTokenProtectionStatus property
     * @param value Value to set for the appTokenProtectionStatus property.
     */
    public void setAppTokenProtectionStatus(@jakarta.annotation.Nullable final TokenProtectionStatus value) {
        this.BackingStore.set("appTokenProtectionStatus", value);
    }
    /**
     * Sets the authenticationAppDeviceDetails property value. Provides details about the app and device used during a Microsoft Entra authentication step.
     * @param value Value to set for the authenticationAppDeviceDetails property.
     */
    public void setAuthenticationAppDeviceDetails(@jakarta.annotation.Nullable final AuthenticationAppDeviceDetails value) {
        this.BackingStore.set("authenticationAppDeviceDetails", value);
    }
    /**
     * Sets the authenticationAppPolicyEvaluationDetails property value. Provides details of the Microsoft Entra policies applied to a user and client authentication app during an authentication step.
     * @param value Value to set for the authenticationAppPolicyEvaluationDetails property.
     */
    public void setAuthenticationAppPolicyEvaluationDetails(@jakarta.annotation.Nullable final java.util.List<AuthenticationAppPolicyDetails> value) {
        this.BackingStore.set("authenticationAppPolicyEvaluationDetails", value);
    }
    /**
     * Sets the authenticationContextClassReferences property value. Contains a collection of values that represent the conditional access authentication contexts applied to the sign-in.
     * @param value Value to set for the authenticationContextClassReferences property.
     */
    public void setAuthenticationContextClassReferences(@jakarta.annotation.Nullable final java.util.List<AuthenticationContext> value) {
        this.BackingStore.set("authenticationContextClassReferences", value);
    }
    /**
     * Sets the authenticationDetails property value. The result of the authentication attempt and more details on the authentication method.
     * @param value Value to set for the authenticationDetails property.
     */
    public void setAuthenticationDetails(@jakarta.annotation.Nullable final java.util.List<AuthenticationDetail> value) {
        this.BackingStore.set("authenticationDetails", value);
    }
    /**
     * Sets the authenticationMethodsUsed property value. The authentication methods used. Possible values: SMS, Authenticator App, App Verification code, Password, FIDO, PTA, or PHS.
     * @param value Value to set for the authenticationMethodsUsed property.
     */
    public void setAuthenticationMethodsUsed(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("authenticationMethodsUsed", value);
    }
    /**
     * Sets the authenticationProcessingDetails property value. More authentication processing details, such as the agent name for  PTA and PHS, or a server or farm name for federated authentication.
     * @param value Value to set for the authenticationProcessingDetails property.
     */
    public void setAuthenticationProcessingDetails(@jakarta.annotation.Nullable final java.util.List<KeyValue> value) {
        this.BackingStore.set("authenticationProcessingDetails", value);
    }
    /**
     * Sets the authenticationProtocol property value. Lists the protocol type or grant type used in the authentication. The possible values are: oAuth2, ropc, wsFederation, saml20, deviceCode, unknownFutureValue, authenticationTransfer, and none. Use none for all authentications that do not have a specific value in that list.
     * @param value Value to set for the authenticationProtocol property.
     */
    public void setAuthenticationProtocol(@jakarta.annotation.Nullable final EnumSet<ProtocolType> value) {
        this.BackingStore.set("authenticationProtocol", value);
    }
    /**
     * Sets the authenticationRequirement property value. This holds the highest level of authentication needed through all the sign-in steps, for sign-in to succeed.  Supports $filter (eq, startsWith).
     * @param value Value to set for the authenticationRequirement property.
     */
    public void setAuthenticationRequirement(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("authenticationRequirement", value);
    }
    /**
     * Sets the authenticationRequirementPolicies property value. Sources of authentication requirement, such as conditional access, per-user MFA, identity protection, and security defaults.
     * @param value Value to set for the authenticationRequirementPolicies property.
     */
    public void setAuthenticationRequirementPolicies(@jakarta.annotation.Nullable final java.util.List<AuthenticationRequirementPolicy> value) {
        this.BackingStore.set("authenticationRequirementPolicies", value);
    }
    /**
     * Sets the autonomousSystemNumber property value. The Autonomous System Number (ASN) of the network used by the actor.
     * @param value Value to set for the autonomousSystemNumber property.
     */
    public void setAutonomousSystemNumber(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("autonomousSystemNumber", value);
    }
    /**
     * Sets the azureResourceId property value. Contains a fully qualified Azure Resource Manager ID of an Azure resource accessed during the sign-in.
     * @param value Value to set for the azureResourceId property.
     */
    public void setAzureResourceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("azureResourceId", value);
    }
    /**
     * Sets the clientAppUsed property value. The legacy client used for sign-in activity. For example: Browser, Exchange ActiveSync, Modern clients, IMAP, MAPI, SMTP, or POP.  Supports $filter (eq).
     * @param value Value to set for the clientAppUsed property.
     */
    public void setClientAppUsed(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("clientAppUsed", value);
    }
    /**
     * Sets the clientCredentialType property value. Describes the credential type that a user client or service principal provided to Microsoft Entra ID to authenticate itself. You may wish to review clientCredentialType to track and eliminate less secure credential types or to watch for clients and service principals using anomalous credential types. The possible values are: none, clientSecret, clientAssertion, federatedIdentityCredential, managedIdentity, certificate, unknownFutureValue.
     * @param value Value to set for the clientCredentialType property.
     */
    public void setClientCredentialType(@jakarta.annotation.Nullable final ClientCredentialType value) {
        this.BackingStore.set("clientCredentialType", value);
    }
    /**
     * Sets the conditionalAccessStatus property value. The status of the conditional access policy triggered. Possible values: success, failure, notApplied, or unknownFutureValue.  Supports $filter (eq).
     * @param value Value to set for the conditionalAccessStatus property.
     */
    public void setConditionalAccessStatus(@jakarta.annotation.Nullable final ConditionalAccessStatus value) {
        this.BackingStore.set("conditionalAccessStatus", value);
    }
    /**
     * Sets the correlationId property value. The identifier that's sent from the client when sign-in is initiated. This is used for troubleshooting the corresponding sign-in activity when calling for support.  Supports $filter (eq).
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("correlationId", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time the sign-in was initiated. The Timestamp type is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $orderby, $filter (eq, le, and ge).
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the crossTenantAccessType property value. Describes the type of cross-tenant access used by the actor to access the resource. Possible values are: none, b2bCollaboration, b2bDirectConnect, microsoftSupport, serviceProvider, unknownFutureValue. If the sign in didn't cross tenant boundaries, the value is none.
     * @param value Value to set for the crossTenantAccessType property.
     */
    public void setCrossTenantAccessType(@jakarta.annotation.Nullable final EnumSet<SignInAccessType> value) {
        this.BackingStore.set("crossTenantAccessType", value);
    }
    /**
     * Sets the deviceDetail property value. The device information from where the sign-in occurred. Includes information such as deviceId, OS, and browser.  Supports $filter (eq, startsWith) on browser and operatingSystem properties.
     * @param value Value to set for the deviceDetail property.
     */
    public void setDeviceDetail(@jakarta.annotation.Nullable final DeviceDetail value) {
        this.BackingStore.set("deviceDetail", value);
    }
    /**
     * Sets the federatedCredentialId property value. Contains the identifier of an application's federated identity credential, if a federated identity credential was used to sign in.
     * @param value Value to set for the federatedCredentialId property.
     */
    public void setFederatedCredentialId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("federatedCredentialId", value);
    }
    /**
     * Sets the flaggedForReview property value. During a failed sign in, a user may select a button in the Azure portal to mark the failed event for tenant admins. If a user clicked the button to flag the failed sign in, this value is true.
     * @param value Value to set for the flaggedForReview property.
     */
    public void setFlaggedForReview(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("flaggedForReview", value);
    }
    /**
     * Sets the homeTenantId property value. The tenant identifier of the user initiating the sign in. Not applicable in Managed Identity or service principal sign ins.
     * @param value Value to set for the homeTenantId property.
     */
    public void setHomeTenantId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("homeTenantId", value);
    }
    /**
     * Sets the homeTenantName property value. For user sign ins, the identifier of the tenant that the user is a member of. Only populated in cases where the home tenant has provided affirmative consent to Microsoft Entra ID to show the tenant content.
     * @param value Value to set for the homeTenantName property.
     */
    public void setHomeTenantName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("homeTenantName", value);
    }
    /**
     * Sets the incomingTokenType property value. Indicates the token types that were presented to Microsoft Entra ID to authenticate the actor in the sign in. The possible values are: none, primaryRefreshToken, saml11, saml20, unknownFutureValue, remoteDesktopToken.  NOTE Microsoft Entra ID may have also used token types not listed in this Enum type to authenticate the actor. Don't infer the lack of a token if it isn't one of the types listed. Also, please note that you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable enum: remoteDesktopToken.
     * @param value Value to set for the incomingTokenType property.
     */
    public void setIncomingTokenType(@jakarta.annotation.Nullable final EnumSet<IncomingTokenType> value) {
        this.BackingStore.set("incomingTokenType", value);
    }
    /**
     * Sets the ipAddress property value. The IP address of the client from where the sign-in occurred.  Supports $filter (eq, startsWith).
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("ipAddress", value);
    }
    /**
     * Sets the ipAddressFromResourceProvider property value. The IP address a user used to reach a resource provider, used to determine Conditional Access compliance for some policies. For example, when a user interacts with Exchange Online, the IP address Exchange receives from the user may be recorded here. This value is often null.
     * @param value Value to set for the ipAddressFromResourceProvider property.
     */
    public void setIpAddressFromResourceProvider(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("ipAddressFromResourceProvider", value);
    }
    /**
     * Sets the isInteractive property value. Indicates whether a user sign in is interactive. In interactive sign in, the user provides an authentication factor to Microsoft Entra ID. These factors include passwords, responses to MFA challenges, biometric factors, or QR codes that a user provides to Microsoft Entra ID or an associated app. In non-interactive sign in, the user doesn't provide an authentication factor. Instead, the client app uses a token or code to authenticate or access a resource on behalf of a user. Non-interactive sign ins are commonly used for a client to sign in on a user's behalf in a process transparent to the user.
     * @param value Value to set for the isInteractive property.
     */
    public void setIsInteractive(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isInteractive", value);
    }
    /**
     * Sets the isTenantRestricted property value. Shows whether the sign in event was subject to a Microsoft Entra tenant restriction policy.
     * @param value Value to set for the isTenantRestricted property.
     */
    public void setIsTenantRestricted(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isTenantRestricted", value);
    }
    /**
     * Sets the location property value. The city, state, and two letter country code from where the sign-in occurred.  Supports $filter (eq, startsWith) on city, state, and countryOrRegion properties.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final SignInLocation value) {
        this.BackingStore.set("location", value);
    }
    /**
     * Sets the managedServiceIdentity property value. Contains information about the managed identity used for the sign in, including its type, associated Azure Resource Manager (ARM) resource ID, and federated token information.
     * @param value Value to set for the managedServiceIdentity property.
     */
    public void setManagedServiceIdentity(@jakarta.annotation.Nullable final ManagedIdentity value) {
        this.BackingStore.set("managedServiceIdentity", value);
    }
    /**
     * Sets the mfaDetail property value. The mfaDetail property
     * @param value Value to set for the mfaDetail property.
     */
    public void setMfaDetail(@jakarta.annotation.Nullable final MfaDetail value) {
        this.BackingStore.set("mfaDetail", value);
    }
    /**
     * Sets the networkLocationDetails property value. The network location details including the type of network used and its names.
     * @param value Value to set for the networkLocationDetails property.
     */
    public void setNetworkLocationDetails(@jakarta.annotation.Nullable final java.util.List<NetworkLocationDetail> value) {
        this.BackingStore.set("networkLocationDetails", value);
    }
    /**
     * Sets the originalRequestId property value. The request identifier of the first request in the authentication sequence.  Supports $filter (eq).
     * @param value Value to set for the originalRequestId property.
     */
    public void setOriginalRequestId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("originalRequestId", value);
    }
    /**
     * Sets the originalTransferMethod property value. Transfer method used to initiate a session throughout all subsequent request. The possible values are: none, deviceCodeFlow, authenticationTransfer, unknownFutureValue.
     * @param value Value to set for the originalTransferMethod property.
     */
    public void setOriginalTransferMethod(@jakarta.annotation.Nullable final OriginalTransferMethods value) {
        this.BackingStore.set("originalTransferMethod", value);
    }
    /**
     * Sets the privateLinkDetails property value. Contains information about the Microsoft Entra Private Link policy that is associated with the sign in event.
     * @param value Value to set for the privateLinkDetails property.
     */
    public void setPrivateLinkDetails(@jakarta.annotation.Nullable final PrivateLinkDetails value) {
        this.BackingStore.set("privateLinkDetails", value);
    }
    /**
     * Sets the processingTimeInMilliseconds property value. The request processing time in milliseconds in AD STS.
     * @param value Value to set for the processingTimeInMilliseconds property.
     */
    public void setProcessingTimeInMilliseconds(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("processingTimeInMilliseconds", value);
    }
    /**
     * Sets the resourceDisplayName property value. The name of the resource that the user signed in to.  Supports $filter (eq).
     * @param value Value to set for the resourceDisplayName property.
     */
    public void setResourceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("resourceDisplayName", value);
    }
    /**
     * Sets the resourceId property value. The identifier of the resource that the user signed in to.  Supports $filter (eq).
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("resourceId", value);
    }
    /**
     * Sets the resourceServicePrincipalId property value. The identifier of the service principal representing the target resource in the sign-in event.
     * @param value Value to set for the resourceServicePrincipalId property.
     */
    public void setResourceServicePrincipalId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("resourceServicePrincipalId", value);
    }
    /**
     * Sets the resourceTenantId property value. The tenant identifier of the resource referenced in the sign in.
     * @param value Value to set for the resourceTenantId property.
     */
    public void setResourceTenantId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("resourceTenantId", value);
    }
    /**
     * Sets the riskDetail property value. The reason behind a specific state of a risky user, sign-in, or a risk event. Possible values: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, or unknownFutureValue. The value none means that no action has been performed on the user or sign-in so far.  Supports $filter (eq). Note: Details for this property are only available for Microsoft Entra ID P2 customers. All other customers are returned hidden.
     * @param value Value to set for the riskDetail property.
     */
    public void setRiskDetail(@jakarta.annotation.Nullable final RiskDetail value) {
        this.BackingStore.set("riskDetail", value);
    }
    /**
     * Sets the riskEventTypes_v2 property value. The list of risk event types associated with the sign-in. Possible values: unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence,  generic, or unknownFutureValue.  Supports $filter (eq, startsWith).
     * @param value Value to set for the riskEventTypes_v2 property.
     */
    public void setRiskEventTypesV2(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("riskEventTypesV2", value);
    }
    /**
     * Sets the riskLevelAggregated property value. The aggregated risk level. Possible values: none, low, medium, high, hidden, or unknownFutureValue. The value hidden means the user or sign-in was not enabled for Microsoft Entra ID Protection.  Supports $filter (eq). Note: Details for this property are only available for Microsoft Entra ID P2 customers. All other customers are returned hidden.
     * @param value Value to set for the riskLevelAggregated property.
     */
    public void setRiskLevelAggregated(@jakarta.annotation.Nullable final RiskLevel value) {
        this.BackingStore.set("riskLevelAggregated", value);
    }
    /**
     * Sets the riskLevelDuringSignIn property value. The risk level during sign-in. Possible values: none, low, medium, high, hidden, or unknownFutureValue. The value hidden means the user or sign-in wasn't enabled for Microsoft Entra ID Protection.  Supports $filter (eq). Note: Details for this property are only available for Microsoft Entra ID P2 customers. All other customers are returned hidden.
     * @param value Value to set for the riskLevelDuringSignIn property.
     */
    public void setRiskLevelDuringSignIn(@jakarta.annotation.Nullable final RiskLevel value) {
        this.BackingStore.set("riskLevelDuringSignIn", value);
    }
    /**
     * Sets the riskState property value. The risk state of a risky user, sign-in, or a risk event. Possible values: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, or unknownFutureValue.  Supports $filter (eq).
     * @param value Value to set for the riskState property.
     */
    public void setRiskState(@jakarta.annotation.Nullable final RiskState value) {
        this.BackingStore.set("riskState", value);
    }
    /**
     * Sets the servicePrincipalCredentialKeyId property value. The unique identifier of the key credential used by the service principal to authenticate.
     * @param value Value to set for the servicePrincipalCredentialKeyId property.
     */
    public void setServicePrincipalCredentialKeyId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("servicePrincipalCredentialKeyId", value);
    }
    /**
     * Sets the servicePrincipalCredentialThumbprint property value. The certificate thumbprint of the certificate used by the service principal to authenticate.
     * @param value Value to set for the servicePrincipalCredentialThumbprint property.
     */
    public void setServicePrincipalCredentialThumbprint(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("servicePrincipalCredentialThumbprint", value);
    }
    /**
     * Sets the servicePrincipalId property value. The application identifier used for sign-in. This field is populated when you're signing in using an application.  Supports $filter (eq, startsWith).
     * @param value Value to set for the servicePrincipalId property.
     */
    public void setServicePrincipalId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("servicePrincipalId", value);
    }
    /**
     * Sets the servicePrincipalName property value. The application name used for sign-in. This field is populated when you're signing in using an application.  Supports $filter (eq, startsWith).
     * @param value Value to set for the servicePrincipalName property.
     */
    public void setServicePrincipalName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("servicePrincipalName", value);
    }
    /**
     * Sets the sessionLifetimePolicies property value. Any conditional access session management policies that were applied during the sign-in event.
     * @param value Value to set for the sessionLifetimePolicies property.
     */
    public void setSessionLifetimePolicies(@jakarta.annotation.Nullable final java.util.List<SessionLifetimePolicy> value) {
        this.BackingStore.set("sessionLifetimePolicies", value);
    }
    /**
     * Sets the signInEventTypes property value. Indicates the category of sign in that the event represents. For user sign ins, the category can be interactiveUser or nonInteractiveUser and corresponds to the value for the isInteractive property on the signin resource. For managed identity sign ins, the category is managedIdentity. For service principal sign ins, the category is servicePrincipal. Possible values are: interactiveUser, nonInteractiveUser, servicePrincipal, managedIdentity, unknownFutureValue.  Supports $filter (eq, ne).
     * @param value Value to set for the signInEventTypes property.
     */
    public void setSignInEventTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("signInEventTypes", value);
    }
    /**
     * Sets the signInIdentifier property value. The identification that the user provided to sign in. It may be the userPrincipalName but it's also populated when a user signs in using other identifiers.
     * @param value Value to set for the signInIdentifier property.
     */
    public void setSignInIdentifier(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("signInIdentifier", value);
    }
    /**
     * Sets the signInIdentifierType property value. The type of sign in identifier. Possible values are: userPrincipalName, phoneNumber, proxyAddress, qrCode, onPremisesUserPrincipalName, unknownFutureValue.
     * @param value Value to set for the signInIdentifierType property.
     */
    public void setSignInIdentifierType(@jakarta.annotation.Nullable final SignInIdentifierType value) {
        this.BackingStore.set("signInIdentifierType", value);
    }
    /**
     * Sets the signInTokenProtectionStatus property value. Token protection creates a cryptographically secure tie between the token and the device it's issued to. This field indicates whether the signin token was bound to the device or not. The possible values are: none, bound, unbound, unknownFutureValue.
     * @param value Value to set for the signInTokenProtectionStatus property.
     */
    public void setSignInTokenProtectionStatus(@jakarta.annotation.Nullable final TokenProtectionStatus value) {
        this.BackingStore.set("signInTokenProtectionStatus", value);
    }
    /**
     * Sets the status property value. The sign-in status. Includes the error code and description of the error (for a sign-in failure).  Supports $filter (eq) on errorCode property.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SignInStatus value) {
        this.BackingStore.set("status", value);
    }
    /**
     * Sets the tokenIssuerName property value. The name of the identity provider. For example, sts.microsoft.com.  Supports $filter (eq).
     * @param value Value to set for the tokenIssuerName property.
     */
    public void setTokenIssuerName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("tokenIssuerName", value);
    }
    /**
     * Sets the tokenIssuerType property value. The type of identity provider. The possible values are: AzureAD, ADFederationServices, UnknownFutureValue, AzureADBackupAuth, ADFederationServicesMFAAdapter, NPSExtension. You must use the Prefer: include-unknown-enum-members request header to get the following values in this evolvable enum: AzureADBackupAuth , ADFederationServicesMFAAdapter , NPSExtension.
     * @param value Value to set for the tokenIssuerType property.
     */
    public void setTokenIssuerType(@jakarta.annotation.Nullable final TokenIssuerType value) {
        this.BackingStore.set("tokenIssuerType", value);
    }
    /**
     * Sets the uniqueTokenIdentifier property value. A unique base64 encoded request identifier used to track tokens issued by Microsoft Entra ID as they're redeemed at resource providers.
     * @param value Value to set for the uniqueTokenIdentifier property.
     */
    public void setUniqueTokenIdentifier(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("uniqueTokenIdentifier", value);
    }
    /**
     * Sets the userAgent property value. The user agent information related to sign-in.  Supports $filter (eq, startsWith).
     * @param value Value to set for the userAgent property.
     */
    public void setUserAgent(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("userAgent", value);
    }
    /**
     * Sets the userDisplayName property value. The display name of the user.  Supports $filter (eq, startsWith).
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("userDisplayName", value);
    }
    /**
     * Sets the userId property value. The identifier of the user.  Supports $filter (eq).
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("userId", value);
    }
    /**
     * Sets the userPrincipalName property value. The UPN of the user.  Supports $filter (eq, startsWith).
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("userPrincipalName", value);
    }
    /**
     * Sets the userType property value. Identifies whether the user is a member or guest in the tenant. Possible values are: member, guest, unknownFutureValue.
     * @param value Value to set for the userType property.
     */
    public void setUserType(@jakarta.annotation.Nullable final SignInUserType value) {
        this.BackingStore.set("userType", value);
    }
}
