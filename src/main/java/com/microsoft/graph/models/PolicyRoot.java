package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyRoot implements AdditionalDataHolder, Parsable {
    /**
     * The policy that contains directory-level access review settings.
     */
    private AccessReviewPolicy accessReviewPolicy;
    /**
     * The policy that controls the idle time out for web sessions for applications.
     */
    private java.util.List<ActivityBasedTimeoutPolicy> activityBasedTimeoutPolicies;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The policy by which consent requests are created and managed for the entire tenant.
     */
    private AdminConsentRequestPolicy adminConsentRequestPolicy;
    /**
     * The policies that enforce app management restrictions for specific applications and service principals, overriding the defaultAppManagementPolicy.
     */
    private java.util.List<AppManagementPolicy> appManagementPolicies;
    /**
     * The policy configuration of the self-service sign-up experience of external users.
     */
    private AuthenticationFlowsPolicy authenticationFlowsPolicy;
    /**
     * The authentication methods and the users that are allowed to use them to sign in and perform multi-factor authentication (MFA) in Azure Active Directory (Azure AD).
     */
    private AuthenticationMethodsPolicy authenticationMethodsPolicy;
    /**
     * The authentication method combinations that are to be used in scenarios defined by Azure AD Conditional Access.
     */
    private java.util.List<AuthenticationStrengthPolicy> authenticationStrengthPolicies;
    /**
     * The policy that controls Azure AD authorization settings.
     */
    private java.util.List<AuthorizationPolicy> authorizationPolicy;
    /**
     * The Azure AD B2C policies that define how end users register via local accounts.
     */
    private B2cAuthenticationMethodsPolicy b2cAuthenticationMethodsPolicy;
    /**
     * The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application.
     */
    private java.util.List<ClaimsMappingPolicy> claimsMappingPolicies;
    /**
     * The custom rules that define an access scenario.
     */
    private java.util.List<ConditionalAccessPolicy> conditionalAccessPolicies;
    /**
     * The custom rules that define an access scenario when interacting with external Azure AD tenants.
     */
    private CrossTenantAccessPolicy crossTenantAccessPolicy;
    /**
     * The tenant-wide policy that enforces app management restrictions for all applications and service principals.
     */
    private TenantAppManagementPolicy defaultAppManagementPolicy;
    /**
     * The deviceRegistrationPolicy property
     */
    private DeviceRegistrationPolicy deviceRegistrationPolicy;
    /**
     * The directoryRoleAccessReviewPolicy property
     */
    private DirectoryRoleAccessReviewPolicy directoryRoleAccessReviewPolicy;
    /**
     * Represents the tenant-wide policy that controls whether external users can leave an Azure AD tenant via self-service controls.
     */
    private ExternalIdentitiesPolicy externalIdentitiesPolicy;
    /**
     * The feature rollout policy associated with a directory object.
     */
    private java.util.List<FeatureRolloutPolicy> featureRolloutPolicies;
    /**
     * The federatedTokenValidationPolicy property
     */
    private FederatedTokenValidationPolicy federatedTokenValidationPolicy;
    /**
     * The policy to control Azure AD authentication behavior for federated users.
     */
    private java.util.List<HomeRealmDiscoveryPolicy> homeRealmDiscoveryPolicies;
    /**
     * The policy that represents the security defaults that protect against common attacks.
     */
    private IdentitySecurityDefaultsEnforcementPolicy identitySecurityDefaultsEnforcementPolicy;
    /**
     * The policy that defines auto-enrollment configuration for a mobility management (MDM or MAM) application.
     */
    private java.util.List<MobilityManagementPolicy> mobileAppManagementPolicies;
    /**
     * The mobileDeviceManagementPolicies property
     */
    private java.util.List<MobilityManagementPolicy> mobileDeviceManagementPolicies;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The policy that specifies the conditions under which consent can be granted.
     */
    private java.util.List<PermissionGrantPolicy> permissionGrantPolicies;
    /**
     * Represents the role management policies.
     */
    private java.util.List<UnifiedRoleManagementPolicy> roleManagementPolicies;
    /**
     * Represents the role management policy assignments.
     */
    private java.util.List<UnifiedRoleManagementPolicyAssignment> roleManagementPolicyAssignments;
    /**
     * The servicePrincipalCreationPolicies property
     */
    private java.util.List<ServicePrincipalCreationPolicy> servicePrincipalCreationPolicies;
    /**
     * The policy that specifies the characteristics of SAML tokens issued by Azure AD.
     */
    private java.util.List<TokenIssuancePolicy> tokenIssuancePolicies;
    /**
     * The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Azure AD.
     */
    private java.util.List<TokenLifetimePolicy> tokenLifetimePolicies;
    /**
     * Instantiates a new PolicyRoot and sets the default values.
     */
    public PolicyRoot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PolicyRoot
     */
    @jakarta.annotation.Nonnull
    public static PolicyRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyRoot();
    }
    /**
     * Gets the accessReviewPolicy property value. The policy that contains directory-level access review settings.
     * @return a AccessReviewPolicy
     */
    @jakarta.annotation.Nullable
    public AccessReviewPolicy getAccessReviewPolicy() {
        return this.accessReviewPolicy;
    }
    /**
     * Gets the activityBasedTimeoutPolicies property value. The policy that controls the idle time out for web sessions for applications.
     * @return a java.util.List<ActivityBasedTimeoutPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActivityBasedTimeoutPolicy> getActivityBasedTimeoutPolicies() {
        return this.activityBasedTimeoutPolicies;
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the adminConsentRequestPolicy property value. The policy by which consent requests are created and managed for the entire tenant.
     * @return a AdminConsentRequestPolicy
     */
    @jakarta.annotation.Nullable
    public AdminConsentRequestPolicy getAdminConsentRequestPolicy() {
        return this.adminConsentRequestPolicy;
    }
    /**
     * Gets the appManagementPolicies property value. The policies that enforce app management restrictions for specific applications and service principals, overriding the defaultAppManagementPolicy.
     * @return a java.util.List<AppManagementPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppManagementPolicy> getAppManagementPolicies() {
        return this.appManagementPolicies;
    }
    /**
     * Gets the authenticationFlowsPolicy property value. The policy configuration of the self-service sign-up experience of external users.
     * @return a AuthenticationFlowsPolicy
     */
    @jakarta.annotation.Nullable
    public AuthenticationFlowsPolicy getAuthenticationFlowsPolicy() {
        return this.authenticationFlowsPolicy;
    }
    /**
     * Gets the authenticationMethodsPolicy property value. The authentication methods and the users that are allowed to use them to sign in and perform multi-factor authentication (MFA) in Azure Active Directory (Azure AD).
     * @return a AuthenticationMethodsPolicy
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodsPolicy getAuthenticationMethodsPolicy() {
        return this.authenticationMethodsPolicy;
    }
    /**
     * Gets the authenticationStrengthPolicies property value. The authentication method combinations that are to be used in scenarios defined by Azure AD Conditional Access.
     * @return a java.util.List<AuthenticationStrengthPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationStrengthPolicy> getAuthenticationStrengthPolicies() {
        return this.authenticationStrengthPolicies;
    }
    /**
     * Gets the authorizationPolicy property value. The policy that controls Azure AD authorization settings.
     * @return a java.util.List<AuthorizationPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthorizationPolicy> getAuthorizationPolicy() {
        return this.authorizationPolicy;
    }
    /**
     * Gets the b2cAuthenticationMethodsPolicy property value. The Azure AD B2C policies that define how end users register via local accounts.
     * @return a B2cAuthenticationMethodsPolicy
     */
    @jakarta.annotation.Nullable
    public B2cAuthenticationMethodsPolicy getB2cAuthenticationMethodsPolicy() {
        return this.b2cAuthenticationMethodsPolicy;
    }
    /**
     * Gets the claimsMappingPolicies property value. The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application.
     * @return a java.util.List<ClaimsMappingPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ClaimsMappingPolicy> getClaimsMappingPolicies() {
        return this.claimsMappingPolicies;
    }
    /**
     * Gets the conditionalAccessPolicies property value. The custom rules that define an access scenario.
     * @return a java.util.List<ConditionalAccessPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConditionalAccessPolicy> getConditionalAccessPolicies() {
        return this.conditionalAccessPolicies;
    }
    /**
     * Gets the crossTenantAccessPolicy property value. The custom rules that define an access scenario when interacting with external Azure AD tenants.
     * @return a CrossTenantAccessPolicy
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicy getCrossTenantAccessPolicy() {
        return this.crossTenantAccessPolicy;
    }
    /**
     * Gets the defaultAppManagementPolicy property value. The tenant-wide policy that enforces app management restrictions for all applications and service principals.
     * @return a TenantAppManagementPolicy
     */
    @jakarta.annotation.Nullable
    public TenantAppManagementPolicy getDefaultAppManagementPolicy() {
        return this.defaultAppManagementPolicy;
    }
    /**
     * Gets the deviceRegistrationPolicy property value. The deviceRegistrationPolicy property
     * @return a DeviceRegistrationPolicy
     */
    @jakarta.annotation.Nullable
    public DeviceRegistrationPolicy getDeviceRegistrationPolicy() {
        return this.deviceRegistrationPolicy;
    }
    /**
     * Gets the directoryRoleAccessReviewPolicy property value. The directoryRoleAccessReviewPolicy property
     * @return a DirectoryRoleAccessReviewPolicy
     */
    @jakarta.annotation.Nullable
    public DirectoryRoleAccessReviewPolicy getDirectoryRoleAccessReviewPolicy() {
        return this.directoryRoleAccessReviewPolicy;
    }
    /**
     * Gets the externalIdentitiesPolicy property value. Represents the tenant-wide policy that controls whether external users can leave an Azure AD tenant via self-service controls.
     * @return a ExternalIdentitiesPolicy
     */
    @jakarta.annotation.Nullable
    public ExternalIdentitiesPolicy getExternalIdentitiesPolicy() {
        return this.externalIdentitiesPolicy;
    }
    /**
     * Gets the featureRolloutPolicies property value. The feature rollout policy associated with a directory object.
     * @return a java.util.List<FeatureRolloutPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<FeatureRolloutPolicy> getFeatureRolloutPolicies() {
        return this.featureRolloutPolicies;
    }
    /**
     * Gets the federatedTokenValidationPolicy property value. The federatedTokenValidationPolicy property
     * @return a FederatedTokenValidationPolicy
     */
    @jakarta.annotation.Nullable
    public FederatedTokenValidationPolicy getFederatedTokenValidationPolicy() {
        return this.federatedTokenValidationPolicy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(29);
        deserializerMap.put("accessReviewPolicy", (n) -> { this.setAccessReviewPolicy(n.getObjectValue(AccessReviewPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("activityBasedTimeoutPolicies", (n) -> { this.setActivityBasedTimeoutPolicies(n.getCollectionOfObjectValues(ActivityBasedTimeoutPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("adminConsentRequestPolicy", (n) -> { this.setAdminConsentRequestPolicy(n.getObjectValue(AdminConsentRequestPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("appManagementPolicies", (n) -> { this.setAppManagementPolicies(n.getCollectionOfObjectValues(AppManagementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationFlowsPolicy", (n) -> { this.setAuthenticationFlowsPolicy(n.getObjectValue(AuthenticationFlowsPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationMethodsPolicy", (n) -> { this.setAuthenticationMethodsPolicy(n.getObjectValue(AuthenticationMethodsPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("authenticationStrengthPolicies", (n) -> { this.setAuthenticationStrengthPolicies(n.getCollectionOfObjectValues(AuthenticationStrengthPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("authorizationPolicy", (n) -> { this.setAuthorizationPolicy(n.getCollectionOfObjectValues(AuthorizationPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("b2cAuthenticationMethodsPolicy", (n) -> { this.setB2cAuthenticationMethodsPolicy(n.getObjectValue(B2cAuthenticationMethodsPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("claimsMappingPolicies", (n) -> { this.setClaimsMappingPolicies(n.getCollectionOfObjectValues(ClaimsMappingPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionalAccessPolicies", (n) -> { this.setConditionalAccessPolicies(n.getCollectionOfObjectValues(ConditionalAccessPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("crossTenantAccessPolicy", (n) -> { this.setCrossTenantAccessPolicy(n.getObjectValue(CrossTenantAccessPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultAppManagementPolicy", (n) -> { this.setDefaultAppManagementPolicy(n.getObjectValue(TenantAppManagementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceRegistrationPolicy", (n) -> { this.setDeviceRegistrationPolicy(n.getObjectValue(DeviceRegistrationPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("directoryRoleAccessReviewPolicy", (n) -> { this.setDirectoryRoleAccessReviewPolicy(n.getObjectValue(DirectoryRoleAccessReviewPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("externalIdentitiesPolicy", (n) -> { this.setExternalIdentitiesPolicy(n.getObjectValue(ExternalIdentitiesPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("featureRolloutPolicies", (n) -> { this.setFeatureRolloutPolicies(n.getCollectionOfObjectValues(FeatureRolloutPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("federatedTokenValidationPolicy", (n) -> { this.setFederatedTokenValidationPolicy(n.getObjectValue(FederatedTokenValidationPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("homeRealmDiscoveryPolicies", (n) -> { this.setHomeRealmDiscoveryPolicies(n.getCollectionOfObjectValues(HomeRealmDiscoveryPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("identitySecurityDefaultsEnforcementPolicy", (n) -> { this.setIdentitySecurityDefaultsEnforcementPolicy(n.getObjectValue(IdentitySecurityDefaultsEnforcementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("mobileAppManagementPolicies", (n) -> { this.setMobileAppManagementPolicies(n.getCollectionOfObjectValues(MobilityManagementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("mobileDeviceManagementPolicies", (n) -> { this.setMobileDeviceManagementPolicies(n.getCollectionOfObjectValues(MobilityManagementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("permissionGrantPolicies", (n) -> { this.setPermissionGrantPolicies(n.getCollectionOfObjectValues(PermissionGrantPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("roleManagementPolicies", (n) -> { this.setRoleManagementPolicies(n.getCollectionOfObjectValues(UnifiedRoleManagementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("roleManagementPolicyAssignments", (n) -> { this.setRoleManagementPolicyAssignments(n.getCollectionOfObjectValues(UnifiedRoleManagementPolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("servicePrincipalCreationPolicies", (n) -> { this.setServicePrincipalCreationPolicies(n.getCollectionOfObjectValues(ServicePrincipalCreationPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("tokenIssuancePolicies", (n) -> { this.setTokenIssuancePolicies(n.getCollectionOfObjectValues(TokenIssuancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("tokenLifetimePolicies", (n) -> { this.setTokenLifetimePolicies(n.getCollectionOfObjectValues(TokenLifetimePolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the homeRealmDiscoveryPolicies property value. The policy to control Azure AD authentication behavior for federated users.
     * @return a java.util.List<HomeRealmDiscoveryPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<HomeRealmDiscoveryPolicy> getHomeRealmDiscoveryPolicies() {
        return this.homeRealmDiscoveryPolicies;
    }
    /**
     * Gets the identitySecurityDefaultsEnforcementPolicy property value. The policy that represents the security defaults that protect against common attacks.
     * @return a IdentitySecurityDefaultsEnforcementPolicy
     */
    @jakarta.annotation.Nullable
    public IdentitySecurityDefaultsEnforcementPolicy getIdentitySecurityDefaultsEnforcementPolicy() {
        return this.identitySecurityDefaultsEnforcementPolicy;
    }
    /**
     * Gets the mobileAppManagementPolicies property value. The policy that defines auto-enrollment configuration for a mobility management (MDM or MAM) application.
     * @return a java.util.List<MobilityManagementPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobilityManagementPolicy> getMobileAppManagementPolicies() {
        return this.mobileAppManagementPolicies;
    }
    /**
     * Gets the mobileDeviceManagementPolicies property value. The mobileDeviceManagementPolicies property
     * @return a java.util.List<MobilityManagementPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobilityManagementPolicy> getMobileDeviceManagementPolicies() {
        return this.mobileDeviceManagementPolicies;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the permissionGrantPolicies property value. The policy that specifies the conditions under which consent can be granted.
     * @return a java.util.List<PermissionGrantPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PermissionGrantPolicy> getPermissionGrantPolicies() {
        return this.permissionGrantPolicies;
    }
    /**
     * Gets the roleManagementPolicies property value. Represents the role management policies.
     * @return a java.util.List<UnifiedRoleManagementPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicy> getRoleManagementPolicies() {
        return this.roleManagementPolicies;
    }
    /**
     * Gets the roleManagementPolicyAssignments property value. Represents the role management policy assignments.
     * @return a java.util.List<UnifiedRoleManagementPolicyAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicyAssignment> getRoleManagementPolicyAssignments() {
        return this.roleManagementPolicyAssignments;
    }
    /**
     * Gets the servicePrincipalCreationPolicies property value. The servicePrincipalCreationPolicies property
     * @return a java.util.List<ServicePrincipalCreationPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServicePrincipalCreationPolicy> getServicePrincipalCreationPolicies() {
        return this.servicePrincipalCreationPolicies;
    }
    /**
     * Gets the tokenIssuancePolicies property value. The policy that specifies the characteristics of SAML tokens issued by Azure AD.
     * @return a java.util.List<TokenIssuancePolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenIssuancePolicy> getTokenIssuancePolicies() {
        return this.tokenIssuancePolicies;
    }
    /**
     * Gets the tokenLifetimePolicies property value. The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Azure AD.
     * @return a java.util.List<TokenLifetimePolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenLifetimePolicy> getTokenLifetimePolicies() {
        return this.tokenLifetimePolicies;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("accessReviewPolicy", this.getAccessReviewPolicy());
        writer.writeCollectionOfObjectValues("activityBasedTimeoutPolicies", this.getActivityBasedTimeoutPolicies());
        writer.writeObjectValue("adminConsentRequestPolicy", this.getAdminConsentRequestPolicy());
        writer.writeCollectionOfObjectValues("appManagementPolicies", this.getAppManagementPolicies());
        writer.writeObjectValue("authenticationFlowsPolicy", this.getAuthenticationFlowsPolicy());
        writer.writeObjectValue("authenticationMethodsPolicy", this.getAuthenticationMethodsPolicy());
        writer.writeCollectionOfObjectValues("authenticationStrengthPolicies", this.getAuthenticationStrengthPolicies());
        writer.writeCollectionOfObjectValues("authorizationPolicy", this.getAuthorizationPolicy());
        writer.writeObjectValue("b2cAuthenticationMethodsPolicy", this.getB2cAuthenticationMethodsPolicy());
        writer.writeCollectionOfObjectValues("claimsMappingPolicies", this.getClaimsMappingPolicies());
        writer.writeCollectionOfObjectValues("conditionalAccessPolicies", this.getConditionalAccessPolicies());
        writer.writeObjectValue("crossTenantAccessPolicy", this.getCrossTenantAccessPolicy());
        writer.writeObjectValue("defaultAppManagementPolicy", this.getDefaultAppManagementPolicy());
        writer.writeObjectValue("deviceRegistrationPolicy", this.getDeviceRegistrationPolicy());
        writer.writeObjectValue("directoryRoleAccessReviewPolicy", this.getDirectoryRoleAccessReviewPolicy());
        writer.writeObjectValue("externalIdentitiesPolicy", this.getExternalIdentitiesPolicy());
        writer.writeCollectionOfObjectValues("featureRolloutPolicies", this.getFeatureRolloutPolicies());
        writer.writeObjectValue("federatedTokenValidationPolicy", this.getFederatedTokenValidationPolicy());
        writer.writeCollectionOfObjectValues("homeRealmDiscoveryPolicies", this.getHomeRealmDiscoveryPolicies());
        writer.writeObjectValue("identitySecurityDefaultsEnforcementPolicy", this.getIdentitySecurityDefaultsEnforcementPolicy());
        writer.writeCollectionOfObjectValues("mobileAppManagementPolicies", this.getMobileAppManagementPolicies());
        writer.writeCollectionOfObjectValues("mobileDeviceManagementPolicies", this.getMobileDeviceManagementPolicies());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("permissionGrantPolicies", this.getPermissionGrantPolicies());
        writer.writeCollectionOfObjectValues("roleManagementPolicies", this.getRoleManagementPolicies());
        writer.writeCollectionOfObjectValues("roleManagementPolicyAssignments", this.getRoleManagementPolicyAssignments());
        writer.writeCollectionOfObjectValues("servicePrincipalCreationPolicies", this.getServicePrincipalCreationPolicies());
        writer.writeCollectionOfObjectValues("tokenIssuancePolicies", this.getTokenIssuancePolicies());
        writer.writeCollectionOfObjectValues("tokenLifetimePolicies", this.getTokenLifetimePolicies());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessReviewPolicy property value. The policy that contains directory-level access review settings.
     * @param value Value to set for the accessReviewPolicy property.
     */
    public void setAccessReviewPolicy(@jakarta.annotation.Nullable final AccessReviewPolicy value) {
        this.accessReviewPolicy = value;
    }
    /**
     * Sets the activityBasedTimeoutPolicies property value. The policy that controls the idle time out for web sessions for applications.
     * @param value Value to set for the activityBasedTimeoutPolicies property.
     */
    public void setActivityBasedTimeoutPolicies(@jakarta.annotation.Nullable final java.util.List<ActivityBasedTimeoutPolicy> value) {
        this.activityBasedTimeoutPolicies = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the adminConsentRequestPolicy property value. The policy by which consent requests are created and managed for the entire tenant.
     * @param value Value to set for the adminConsentRequestPolicy property.
     */
    public void setAdminConsentRequestPolicy(@jakarta.annotation.Nullable final AdminConsentRequestPolicy value) {
        this.adminConsentRequestPolicy = value;
    }
    /**
     * Sets the appManagementPolicies property value. The policies that enforce app management restrictions for specific applications and service principals, overriding the defaultAppManagementPolicy.
     * @param value Value to set for the appManagementPolicies property.
     */
    public void setAppManagementPolicies(@jakarta.annotation.Nullable final java.util.List<AppManagementPolicy> value) {
        this.appManagementPolicies = value;
    }
    /**
     * Sets the authenticationFlowsPolicy property value. The policy configuration of the self-service sign-up experience of external users.
     * @param value Value to set for the authenticationFlowsPolicy property.
     */
    public void setAuthenticationFlowsPolicy(@jakarta.annotation.Nullable final AuthenticationFlowsPolicy value) {
        this.authenticationFlowsPolicy = value;
    }
    /**
     * Sets the authenticationMethodsPolicy property value. The authentication methods and the users that are allowed to use them to sign in and perform multi-factor authentication (MFA) in Azure Active Directory (Azure AD).
     * @param value Value to set for the authenticationMethodsPolicy property.
     */
    public void setAuthenticationMethodsPolicy(@jakarta.annotation.Nullable final AuthenticationMethodsPolicy value) {
        this.authenticationMethodsPolicy = value;
    }
    /**
     * Sets the authenticationStrengthPolicies property value. The authentication method combinations that are to be used in scenarios defined by Azure AD Conditional Access.
     * @param value Value to set for the authenticationStrengthPolicies property.
     */
    public void setAuthenticationStrengthPolicies(@jakarta.annotation.Nullable final java.util.List<AuthenticationStrengthPolicy> value) {
        this.authenticationStrengthPolicies = value;
    }
    /**
     * Sets the authorizationPolicy property value. The policy that controls Azure AD authorization settings.
     * @param value Value to set for the authorizationPolicy property.
     */
    public void setAuthorizationPolicy(@jakarta.annotation.Nullable final java.util.List<AuthorizationPolicy> value) {
        this.authorizationPolicy = value;
    }
    /**
     * Sets the b2cAuthenticationMethodsPolicy property value. The Azure AD B2C policies that define how end users register via local accounts.
     * @param value Value to set for the b2cAuthenticationMethodsPolicy property.
     */
    public void setB2cAuthenticationMethodsPolicy(@jakarta.annotation.Nullable final B2cAuthenticationMethodsPolicy value) {
        this.b2cAuthenticationMethodsPolicy = value;
    }
    /**
     * Sets the claimsMappingPolicies property value. The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application.
     * @param value Value to set for the claimsMappingPolicies property.
     */
    public void setClaimsMappingPolicies(@jakarta.annotation.Nullable final java.util.List<ClaimsMappingPolicy> value) {
        this.claimsMappingPolicies = value;
    }
    /**
     * Sets the conditionalAccessPolicies property value. The custom rules that define an access scenario.
     * @param value Value to set for the conditionalAccessPolicies property.
     */
    public void setConditionalAccessPolicies(@jakarta.annotation.Nullable final java.util.List<ConditionalAccessPolicy> value) {
        this.conditionalAccessPolicies = value;
    }
    /**
     * Sets the crossTenantAccessPolicy property value. The custom rules that define an access scenario when interacting with external Azure AD tenants.
     * @param value Value to set for the crossTenantAccessPolicy property.
     */
    public void setCrossTenantAccessPolicy(@jakarta.annotation.Nullable final CrossTenantAccessPolicy value) {
        this.crossTenantAccessPolicy = value;
    }
    /**
     * Sets the defaultAppManagementPolicy property value. The tenant-wide policy that enforces app management restrictions for all applications and service principals.
     * @param value Value to set for the defaultAppManagementPolicy property.
     */
    public void setDefaultAppManagementPolicy(@jakarta.annotation.Nullable final TenantAppManagementPolicy value) {
        this.defaultAppManagementPolicy = value;
    }
    /**
     * Sets the deviceRegistrationPolicy property value. The deviceRegistrationPolicy property
     * @param value Value to set for the deviceRegistrationPolicy property.
     */
    public void setDeviceRegistrationPolicy(@jakarta.annotation.Nullable final DeviceRegistrationPolicy value) {
        this.deviceRegistrationPolicy = value;
    }
    /**
     * Sets the directoryRoleAccessReviewPolicy property value. The directoryRoleAccessReviewPolicy property
     * @param value Value to set for the directoryRoleAccessReviewPolicy property.
     */
    public void setDirectoryRoleAccessReviewPolicy(@jakarta.annotation.Nullable final DirectoryRoleAccessReviewPolicy value) {
        this.directoryRoleAccessReviewPolicy = value;
    }
    /**
     * Sets the externalIdentitiesPolicy property value. Represents the tenant-wide policy that controls whether external users can leave an Azure AD tenant via self-service controls.
     * @param value Value to set for the externalIdentitiesPolicy property.
     */
    public void setExternalIdentitiesPolicy(@jakarta.annotation.Nullable final ExternalIdentitiesPolicy value) {
        this.externalIdentitiesPolicy = value;
    }
    /**
     * Sets the featureRolloutPolicies property value. The feature rollout policy associated with a directory object.
     * @param value Value to set for the featureRolloutPolicies property.
     */
    public void setFeatureRolloutPolicies(@jakarta.annotation.Nullable final java.util.List<FeatureRolloutPolicy> value) {
        this.featureRolloutPolicies = value;
    }
    /**
     * Sets the federatedTokenValidationPolicy property value. The federatedTokenValidationPolicy property
     * @param value Value to set for the federatedTokenValidationPolicy property.
     */
    public void setFederatedTokenValidationPolicy(@jakarta.annotation.Nullable final FederatedTokenValidationPolicy value) {
        this.federatedTokenValidationPolicy = value;
    }
    /**
     * Sets the homeRealmDiscoveryPolicies property value. The policy to control Azure AD authentication behavior for federated users.
     * @param value Value to set for the homeRealmDiscoveryPolicies property.
     */
    public void setHomeRealmDiscoveryPolicies(@jakarta.annotation.Nullable final java.util.List<HomeRealmDiscoveryPolicy> value) {
        this.homeRealmDiscoveryPolicies = value;
    }
    /**
     * Sets the identitySecurityDefaultsEnforcementPolicy property value. The policy that represents the security defaults that protect against common attacks.
     * @param value Value to set for the identitySecurityDefaultsEnforcementPolicy property.
     */
    public void setIdentitySecurityDefaultsEnforcementPolicy(@jakarta.annotation.Nullable final IdentitySecurityDefaultsEnforcementPolicy value) {
        this.identitySecurityDefaultsEnforcementPolicy = value;
    }
    /**
     * Sets the mobileAppManagementPolicies property value. The policy that defines auto-enrollment configuration for a mobility management (MDM or MAM) application.
     * @param value Value to set for the mobileAppManagementPolicies property.
     */
    public void setMobileAppManagementPolicies(@jakarta.annotation.Nullable final java.util.List<MobilityManagementPolicy> value) {
        this.mobileAppManagementPolicies = value;
    }
    /**
     * Sets the mobileDeviceManagementPolicies property value. The mobileDeviceManagementPolicies property
     * @param value Value to set for the mobileDeviceManagementPolicies property.
     */
    public void setMobileDeviceManagementPolicies(@jakarta.annotation.Nullable final java.util.List<MobilityManagementPolicy> value) {
        this.mobileDeviceManagementPolicies = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the permissionGrantPolicies property value. The policy that specifies the conditions under which consent can be granted.
     * @param value Value to set for the permissionGrantPolicies property.
     */
    public void setPermissionGrantPolicies(@jakarta.annotation.Nullable final java.util.List<PermissionGrantPolicy> value) {
        this.permissionGrantPolicies = value;
    }
    /**
     * Sets the roleManagementPolicies property value. Represents the role management policies.
     * @param value Value to set for the roleManagementPolicies property.
     */
    public void setRoleManagementPolicies(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicy> value) {
        this.roleManagementPolicies = value;
    }
    /**
     * Sets the roleManagementPolicyAssignments property value. Represents the role management policy assignments.
     * @param value Value to set for the roleManagementPolicyAssignments property.
     */
    public void setRoleManagementPolicyAssignments(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicyAssignment> value) {
        this.roleManagementPolicyAssignments = value;
    }
    /**
     * Sets the servicePrincipalCreationPolicies property value. The servicePrincipalCreationPolicies property
     * @param value Value to set for the servicePrincipalCreationPolicies property.
     */
    public void setServicePrincipalCreationPolicies(@jakarta.annotation.Nullable final java.util.List<ServicePrincipalCreationPolicy> value) {
        this.servicePrincipalCreationPolicies = value;
    }
    /**
     * Sets the tokenIssuancePolicies property value. The policy that specifies the characteristics of SAML tokens issued by Azure AD.
     * @param value Value to set for the tokenIssuancePolicies property.
     */
    public void setTokenIssuancePolicies(@jakarta.annotation.Nullable final java.util.List<TokenIssuancePolicy> value) {
        this.tokenIssuancePolicies = value;
    }
    /**
     * Sets the tokenLifetimePolicies property value. The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Azure AD.
     * @param value Value to set for the tokenLifetimePolicies property.
     */
    public void setTokenLifetimePolicies(@jakarta.annotation.Nullable final java.util.List<TokenLifetimePolicy> value) {
        this.tokenLifetimePolicies = value;
    }
}
