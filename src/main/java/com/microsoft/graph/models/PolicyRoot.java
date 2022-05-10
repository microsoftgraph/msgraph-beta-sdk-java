package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PolicyRoot implements AdditionalDataHolder, Parsable {
    /** The policy that contains directory-level access review settings. */
    private AccessReviewPolicy _accessReviewPolicy;
    /** The policy that controls the idle time out for web sessions for applications. */
    private java.util.List<ActivityBasedTimeoutPolicy> _activityBasedTimeoutPolicies;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The policy by which consent requests are created and managed for the entire tenant. */
    private AdminConsentRequestPolicy _adminConsentRequestPolicy;
    /** The policies that enforce app management restrictions for specific applications and service principals, overriding the defaultAppManagementPolicy. */
    private java.util.List<AppManagementPolicy> _appManagementPolicies;
    /** The policy configuration of the self-service sign-up experience of external users. */
    private AuthenticationFlowsPolicy _authenticationFlowsPolicy;
    /** The authentication methods and the users that are allowed to use them to sign in and perform multi-factor authentication (MFA) in Azure Active Directory (Azure AD). */
    private AuthenticationMethodsPolicy _authenticationMethodsPolicy;
    /** The policy that controls Azure AD authorization settings. */
    private java.util.List<AuthorizationPolicy> _authorizationPolicy;
    /** The Azure AD B2C policies that define how end users register via local accounts. */
    private B2cAuthenticationMethodsPolicy _b2cAuthenticationMethodsPolicy;
    /** The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application. */
    private java.util.List<ClaimsMappingPolicy> _claimsMappingPolicies;
    /** The custom rules that define an access scenario. */
    private java.util.List<ConditionalAccessPolicy> _conditionalAccessPolicies;
    /** The custom rules that define an access scenario when interacting with external Azure AD tenants. */
    private CrossTenantAccessPolicy _crossTenantAccessPolicy;
    /** The tenant-wide policy that enforces app management restrictions for all applications and service principals. */
    private TenantAppManagementPolicy _defaultAppManagementPolicy;
    /** The directoryRoleAccessReviewPolicy property */
    private DirectoryRoleAccessReviewPolicy _directoryRoleAccessReviewPolicy;
    /** The externalIdentitiesPolicy property */
    private ExternalIdentitiesPolicy _externalIdentitiesPolicy;
    /** The feature rollout policy associated with a directory object. */
    private java.util.List<FeatureRolloutPolicy> _featureRolloutPolicies;
    /** The policy to control Azure AD authentication behavior for federated users. */
    private java.util.List<HomeRealmDiscoveryPolicy> _homeRealmDiscoveryPolicies;
    /** The policy that represents the security defaults that protect against common attacks. */
    private IdentitySecurityDefaultsEnforcementPolicy _identitySecurityDefaultsEnforcementPolicy;
    /** The policy that defines auto-enrollment configuration for a mobility management (MDM or MAM) application. */
    private java.util.List<MobilityManagementPolicy> _mobileAppManagementPolicies;
    /** The mobileDeviceManagementPolicies property */
    private java.util.List<MobilityManagementPolicy> _mobileDeviceManagementPolicies;
    /** The policy that specifies the conditions under which consent can be granted. */
    private java.util.List<PermissionGrantPolicy> _permissionGrantPolicies;
    /** Represents the role management policies. */
    private java.util.List<UnifiedRoleManagementPolicy> _roleManagementPolicies;
    /** Represents the role management policy assignments. */
    private java.util.List<UnifiedRoleManagementPolicyAssignment> _roleManagementPolicyAssignments;
    /** The servicePrincipalCreationPolicies property */
    private java.util.List<ServicePrincipalCreationPolicy> _servicePrincipalCreationPolicies;
    /** The policy that specifies the characteristics of SAML tokens issued by Azure AD. */
    private java.util.List<TokenIssuancePolicy> _tokenIssuancePolicies;
    /** The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Azure AD. */
    private java.util.List<TokenLifetimePolicy> _tokenLifetimePolicies;
    /**
     * Instantiates a new PolicyRoot and sets the default values.
     * @return a void
     */
    public PolicyRoot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PolicyRoot
     */
    @javax.annotation.Nonnull
    public static PolicyRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyRoot();
    }
    /**
     * Gets the accessReviewPolicy property value. The policy that contains directory-level access review settings.
     * @return a accessReviewPolicy
     */
    @javax.annotation.Nullable
    public AccessReviewPolicy getAccessReviewPolicy() {
        return this._accessReviewPolicy;
    }
    /**
     * Gets the activityBasedTimeoutPolicies property value. The policy that controls the idle time out for web sessions for applications.
     * @return a activityBasedTimeoutPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ActivityBasedTimeoutPolicy> getActivityBasedTimeoutPolicies() {
        return this._activityBasedTimeoutPolicies;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the adminConsentRequestPolicy property value. The policy by which consent requests are created and managed for the entire tenant.
     * @return a adminConsentRequestPolicy
     */
    @javax.annotation.Nullable
    public AdminConsentRequestPolicy getAdminConsentRequestPolicy() {
        return this._adminConsentRequestPolicy;
    }
    /**
     * Gets the appManagementPolicies property value. The policies that enforce app management restrictions for specific applications and service principals, overriding the defaultAppManagementPolicy.
     * @return a appManagementPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<AppManagementPolicy> getAppManagementPolicies() {
        return this._appManagementPolicies;
    }
    /**
     * Gets the authenticationFlowsPolicy property value. The policy configuration of the self-service sign-up experience of external users.
     * @return a authenticationFlowsPolicy
     */
    @javax.annotation.Nullable
    public AuthenticationFlowsPolicy getAuthenticationFlowsPolicy() {
        return this._authenticationFlowsPolicy;
    }
    /**
     * Gets the authenticationMethodsPolicy property value. The authentication methods and the users that are allowed to use them to sign in and perform multi-factor authentication (MFA) in Azure Active Directory (Azure AD).
     * @return a authenticationMethodsPolicy
     */
    @javax.annotation.Nullable
    public AuthenticationMethodsPolicy getAuthenticationMethodsPolicy() {
        return this._authenticationMethodsPolicy;
    }
    /**
     * Gets the authorizationPolicy property value. The policy that controls Azure AD authorization settings.
     * @return a authorizationPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<AuthorizationPolicy> getAuthorizationPolicy() {
        return this._authorizationPolicy;
    }
    /**
     * Gets the b2cAuthenticationMethodsPolicy property value. The Azure AD B2C policies that define how end users register via local accounts.
     * @return a b2cAuthenticationMethodsPolicy
     */
    @javax.annotation.Nullable
    public B2cAuthenticationMethodsPolicy getB2cAuthenticationMethodsPolicy() {
        return this._b2cAuthenticationMethodsPolicy;
    }
    /**
     * Gets the claimsMappingPolicies property value. The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application.
     * @return a claimsMappingPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ClaimsMappingPolicy> getClaimsMappingPolicies() {
        return this._claimsMappingPolicies;
    }
    /**
     * Gets the conditionalAccessPolicies property value. The custom rules that define an access scenario.
     * @return a conditionalAccessPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ConditionalAccessPolicy> getConditionalAccessPolicies() {
        return this._conditionalAccessPolicies;
    }
    /**
     * Gets the crossTenantAccessPolicy property value. The custom rules that define an access scenario when interacting with external Azure AD tenants.
     * @return a crossTenantAccessPolicy
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicy getCrossTenantAccessPolicy() {
        return this._crossTenantAccessPolicy;
    }
    /**
     * Gets the defaultAppManagementPolicy property value. The tenant-wide policy that enforces app management restrictions for all applications and service principals.
     * @return a tenantAppManagementPolicy
     */
    @javax.annotation.Nullable
    public TenantAppManagementPolicy getDefaultAppManagementPolicy() {
        return this._defaultAppManagementPolicy;
    }
    /**
     * Gets the directoryRoleAccessReviewPolicy property value. The directoryRoleAccessReviewPolicy property
     * @return a directoryRoleAccessReviewPolicy
     */
    @javax.annotation.Nullable
    public DirectoryRoleAccessReviewPolicy getDirectoryRoleAccessReviewPolicy() {
        return this._directoryRoleAccessReviewPolicy;
    }
    /**
     * Gets the externalIdentitiesPolicy property value. The externalIdentitiesPolicy property
     * @return a externalIdentitiesPolicy
     */
    @javax.annotation.Nullable
    public ExternalIdentitiesPolicy getExternalIdentitiesPolicy() {
        return this._externalIdentitiesPolicy;
    }
    /**
     * Gets the featureRolloutPolicies property value. The feature rollout policy associated with a directory object.
     * @return a featureRolloutPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<FeatureRolloutPolicy> getFeatureRolloutPolicies() {
        return this._featureRolloutPolicies;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PolicyRoot currentObject = this;
        return new HashMap<>(25) {{
            this.put("accessReviewPolicy", (n) -> { currentObject.setAccessReviewPolicy(n.getObjectValue(AccessReviewPolicy::createFromDiscriminatorValue)); });
            this.put("activityBasedTimeoutPolicies", (n) -> { currentObject.setActivityBasedTimeoutPolicies(n.getCollectionOfObjectValues(ActivityBasedTimeoutPolicy::createFromDiscriminatorValue)); });
            this.put("adminConsentRequestPolicy", (n) -> { currentObject.setAdminConsentRequestPolicy(n.getObjectValue(AdminConsentRequestPolicy::createFromDiscriminatorValue)); });
            this.put("appManagementPolicies", (n) -> { currentObject.setAppManagementPolicies(n.getCollectionOfObjectValues(AppManagementPolicy::createFromDiscriminatorValue)); });
            this.put("authenticationFlowsPolicy", (n) -> { currentObject.setAuthenticationFlowsPolicy(n.getObjectValue(AuthenticationFlowsPolicy::createFromDiscriminatorValue)); });
            this.put("authenticationMethodsPolicy", (n) -> { currentObject.setAuthenticationMethodsPolicy(n.getObjectValue(AuthenticationMethodsPolicy::createFromDiscriminatorValue)); });
            this.put("authorizationPolicy", (n) -> { currentObject.setAuthorizationPolicy(n.getCollectionOfObjectValues(AuthorizationPolicy::createFromDiscriminatorValue)); });
            this.put("b2cAuthenticationMethodsPolicy", (n) -> { currentObject.setB2cAuthenticationMethodsPolicy(n.getObjectValue(B2cAuthenticationMethodsPolicy::createFromDiscriminatorValue)); });
            this.put("claimsMappingPolicies", (n) -> { currentObject.setClaimsMappingPolicies(n.getCollectionOfObjectValues(ClaimsMappingPolicy::createFromDiscriminatorValue)); });
            this.put("conditionalAccessPolicies", (n) -> { currentObject.setConditionalAccessPolicies(n.getCollectionOfObjectValues(ConditionalAccessPolicy::createFromDiscriminatorValue)); });
            this.put("crossTenantAccessPolicy", (n) -> { currentObject.setCrossTenantAccessPolicy(n.getObjectValue(CrossTenantAccessPolicy::createFromDiscriminatorValue)); });
            this.put("defaultAppManagementPolicy", (n) -> { currentObject.setDefaultAppManagementPolicy(n.getObjectValue(TenantAppManagementPolicy::createFromDiscriminatorValue)); });
            this.put("directoryRoleAccessReviewPolicy", (n) -> { currentObject.setDirectoryRoleAccessReviewPolicy(n.getObjectValue(DirectoryRoleAccessReviewPolicy::createFromDiscriminatorValue)); });
            this.put("externalIdentitiesPolicy", (n) -> { currentObject.setExternalIdentitiesPolicy(n.getObjectValue(ExternalIdentitiesPolicy::createFromDiscriminatorValue)); });
            this.put("featureRolloutPolicies", (n) -> { currentObject.setFeatureRolloutPolicies(n.getCollectionOfObjectValues(FeatureRolloutPolicy::createFromDiscriminatorValue)); });
            this.put("homeRealmDiscoveryPolicies", (n) -> { currentObject.setHomeRealmDiscoveryPolicies(n.getCollectionOfObjectValues(HomeRealmDiscoveryPolicy::createFromDiscriminatorValue)); });
            this.put("identitySecurityDefaultsEnforcementPolicy", (n) -> { currentObject.setIdentitySecurityDefaultsEnforcementPolicy(n.getObjectValue(IdentitySecurityDefaultsEnforcementPolicy::createFromDiscriminatorValue)); });
            this.put("mobileAppManagementPolicies", (n) -> { currentObject.setMobileAppManagementPolicies(n.getCollectionOfObjectValues(MobilityManagementPolicy::createFromDiscriminatorValue)); });
            this.put("mobileDeviceManagementPolicies", (n) -> { currentObject.setMobileDeviceManagementPolicies(n.getCollectionOfObjectValues(MobilityManagementPolicy::createFromDiscriminatorValue)); });
            this.put("permissionGrantPolicies", (n) -> { currentObject.setPermissionGrantPolicies(n.getCollectionOfObjectValues(PermissionGrantPolicy::createFromDiscriminatorValue)); });
            this.put("roleManagementPolicies", (n) -> { currentObject.setRoleManagementPolicies(n.getCollectionOfObjectValues(UnifiedRoleManagementPolicy::createFromDiscriminatorValue)); });
            this.put("roleManagementPolicyAssignments", (n) -> { currentObject.setRoleManagementPolicyAssignments(n.getCollectionOfObjectValues(UnifiedRoleManagementPolicyAssignment::createFromDiscriminatorValue)); });
            this.put("servicePrincipalCreationPolicies", (n) -> { currentObject.setServicePrincipalCreationPolicies(n.getCollectionOfObjectValues(ServicePrincipalCreationPolicy::createFromDiscriminatorValue)); });
            this.put("tokenIssuancePolicies", (n) -> { currentObject.setTokenIssuancePolicies(n.getCollectionOfObjectValues(TokenIssuancePolicy::createFromDiscriminatorValue)); });
            this.put("tokenLifetimePolicies", (n) -> { currentObject.setTokenLifetimePolicies(n.getCollectionOfObjectValues(TokenLifetimePolicy::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the homeRealmDiscoveryPolicies property value. The policy to control Azure AD authentication behavior for federated users.
     * @return a homeRealmDiscoveryPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<HomeRealmDiscoveryPolicy> getHomeRealmDiscoveryPolicies() {
        return this._homeRealmDiscoveryPolicies;
    }
    /**
     * Gets the identitySecurityDefaultsEnforcementPolicy property value. The policy that represents the security defaults that protect against common attacks.
     * @return a identitySecurityDefaultsEnforcementPolicy
     */
    @javax.annotation.Nullable
    public IdentitySecurityDefaultsEnforcementPolicy getIdentitySecurityDefaultsEnforcementPolicy() {
        return this._identitySecurityDefaultsEnforcementPolicy;
    }
    /**
     * Gets the mobileAppManagementPolicies property value. The policy that defines auto-enrollment configuration for a mobility management (MDM or MAM) application.
     * @return a mobilityManagementPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<MobilityManagementPolicy> getMobileAppManagementPolicies() {
        return this._mobileAppManagementPolicies;
    }
    /**
     * Gets the mobileDeviceManagementPolicies property value. The mobileDeviceManagementPolicies property
     * @return a mobilityManagementPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<MobilityManagementPolicy> getMobileDeviceManagementPolicies() {
        return this._mobileDeviceManagementPolicies;
    }
    /**
     * Gets the permissionGrantPolicies property value. The policy that specifies the conditions under which consent can be granted.
     * @return a permissionGrantPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<PermissionGrantPolicy> getPermissionGrantPolicies() {
        return this._permissionGrantPolicies;
    }
    /**
     * Gets the roleManagementPolicies property value. Represents the role management policies.
     * @return a unifiedRoleManagementPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicy> getRoleManagementPolicies() {
        return this._roleManagementPolicies;
    }
    /**
     * Gets the roleManagementPolicyAssignments property value. Represents the role management policy assignments.
     * @return a unifiedRoleManagementPolicyAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicyAssignment> getRoleManagementPolicyAssignments() {
        return this._roleManagementPolicyAssignments;
    }
    /**
     * Gets the servicePrincipalCreationPolicies property value. The servicePrincipalCreationPolicies property
     * @return a servicePrincipalCreationPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<ServicePrincipalCreationPolicy> getServicePrincipalCreationPolicies() {
        return this._servicePrincipalCreationPolicies;
    }
    /**
     * Gets the tokenIssuancePolicies property value. The policy that specifies the characteristics of SAML tokens issued by Azure AD.
     * @return a tokenIssuancePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<TokenIssuancePolicy> getTokenIssuancePolicies() {
        return this._tokenIssuancePolicies;
    }
    /**
     * Gets the tokenLifetimePolicies property value. The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Azure AD.
     * @return a tokenLifetimePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<TokenLifetimePolicy> getTokenLifetimePolicies() {
        return this._tokenLifetimePolicies;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("accessReviewPolicy", this.getAccessReviewPolicy());
        writer.writeCollectionOfObjectValues("activityBasedTimeoutPolicies", this.getActivityBasedTimeoutPolicies());
        writer.writeObjectValue("adminConsentRequestPolicy", this.getAdminConsentRequestPolicy());
        writer.writeCollectionOfObjectValues("appManagementPolicies", this.getAppManagementPolicies());
        writer.writeObjectValue("authenticationFlowsPolicy", this.getAuthenticationFlowsPolicy());
        writer.writeObjectValue("authenticationMethodsPolicy", this.getAuthenticationMethodsPolicy());
        writer.writeCollectionOfObjectValues("authorizationPolicy", this.getAuthorizationPolicy());
        writer.writeObjectValue("b2cAuthenticationMethodsPolicy", this.getB2cAuthenticationMethodsPolicy());
        writer.writeCollectionOfObjectValues("claimsMappingPolicies", this.getClaimsMappingPolicies());
        writer.writeCollectionOfObjectValues("conditionalAccessPolicies", this.getConditionalAccessPolicies());
        writer.writeObjectValue("crossTenantAccessPolicy", this.getCrossTenantAccessPolicy());
        writer.writeObjectValue("defaultAppManagementPolicy", this.getDefaultAppManagementPolicy());
        writer.writeObjectValue("directoryRoleAccessReviewPolicy", this.getDirectoryRoleAccessReviewPolicy());
        writer.writeObjectValue("externalIdentitiesPolicy", this.getExternalIdentitiesPolicy());
        writer.writeCollectionOfObjectValues("featureRolloutPolicies", this.getFeatureRolloutPolicies());
        writer.writeCollectionOfObjectValues("homeRealmDiscoveryPolicies", this.getHomeRealmDiscoveryPolicies());
        writer.writeObjectValue("identitySecurityDefaultsEnforcementPolicy", this.getIdentitySecurityDefaultsEnforcementPolicy());
        writer.writeCollectionOfObjectValues("mobileAppManagementPolicies", this.getMobileAppManagementPolicies());
        writer.writeCollectionOfObjectValues("mobileDeviceManagementPolicies", this.getMobileDeviceManagementPolicies());
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
     * @return a void
     */
    public void setAccessReviewPolicy(@javax.annotation.Nullable final AccessReviewPolicy value) {
        this._accessReviewPolicy = value;
    }
    /**
     * Sets the activityBasedTimeoutPolicies property value. The policy that controls the idle time out for web sessions for applications.
     * @param value Value to set for the activityBasedTimeoutPolicies property.
     * @return a void
     */
    public void setActivityBasedTimeoutPolicies(@javax.annotation.Nullable final java.util.List<ActivityBasedTimeoutPolicy> value) {
        this._activityBasedTimeoutPolicies = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the adminConsentRequestPolicy property value. The policy by which consent requests are created and managed for the entire tenant.
     * @param value Value to set for the adminConsentRequestPolicy property.
     * @return a void
     */
    public void setAdminConsentRequestPolicy(@javax.annotation.Nullable final AdminConsentRequestPolicy value) {
        this._adminConsentRequestPolicy = value;
    }
    /**
     * Sets the appManagementPolicies property value. The policies that enforce app management restrictions for specific applications and service principals, overriding the defaultAppManagementPolicy.
     * @param value Value to set for the appManagementPolicies property.
     * @return a void
     */
    public void setAppManagementPolicies(@javax.annotation.Nullable final java.util.List<AppManagementPolicy> value) {
        this._appManagementPolicies = value;
    }
    /**
     * Sets the authenticationFlowsPolicy property value. The policy configuration of the self-service sign-up experience of external users.
     * @param value Value to set for the authenticationFlowsPolicy property.
     * @return a void
     */
    public void setAuthenticationFlowsPolicy(@javax.annotation.Nullable final AuthenticationFlowsPolicy value) {
        this._authenticationFlowsPolicy = value;
    }
    /**
     * Sets the authenticationMethodsPolicy property value. The authentication methods and the users that are allowed to use them to sign in and perform multi-factor authentication (MFA) in Azure Active Directory (Azure AD).
     * @param value Value to set for the authenticationMethodsPolicy property.
     * @return a void
     */
    public void setAuthenticationMethodsPolicy(@javax.annotation.Nullable final AuthenticationMethodsPolicy value) {
        this._authenticationMethodsPolicy = value;
    }
    /**
     * Sets the authorizationPolicy property value. The policy that controls Azure AD authorization settings.
     * @param value Value to set for the authorizationPolicy property.
     * @return a void
     */
    public void setAuthorizationPolicy(@javax.annotation.Nullable final java.util.List<AuthorizationPolicy> value) {
        this._authorizationPolicy = value;
    }
    /**
     * Sets the b2cAuthenticationMethodsPolicy property value. The Azure AD B2C policies that define how end users register via local accounts.
     * @param value Value to set for the b2cAuthenticationMethodsPolicy property.
     * @return a void
     */
    public void setB2cAuthenticationMethodsPolicy(@javax.annotation.Nullable final B2cAuthenticationMethodsPolicy value) {
        this._b2cAuthenticationMethodsPolicy = value;
    }
    /**
     * Sets the claimsMappingPolicies property value. The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application.
     * @param value Value to set for the claimsMappingPolicies property.
     * @return a void
     */
    public void setClaimsMappingPolicies(@javax.annotation.Nullable final java.util.List<ClaimsMappingPolicy> value) {
        this._claimsMappingPolicies = value;
    }
    /**
     * Sets the conditionalAccessPolicies property value. The custom rules that define an access scenario.
     * @param value Value to set for the conditionalAccessPolicies property.
     * @return a void
     */
    public void setConditionalAccessPolicies(@javax.annotation.Nullable final java.util.List<ConditionalAccessPolicy> value) {
        this._conditionalAccessPolicies = value;
    }
    /**
     * Sets the crossTenantAccessPolicy property value. The custom rules that define an access scenario when interacting with external Azure AD tenants.
     * @param value Value to set for the crossTenantAccessPolicy property.
     * @return a void
     */
    public void setCrossTenantAccessPolicy(@javax.annotation.Nullable final CrossTenantAccessPolicy value) {
        this._crossTenantAccessPolicy = value;
    }
    /**
     * Sets the defaultAppManagementPolicy property value. The tenant-wide policy that enforces app management restrictions for all applications and service principals.
     * @param value Value to set for the defaultAppManagementPolicy property.
     * @return a void
     */
    public void setDefaultAppManagementPolicy(@javax.annotation.Nullable final TenantAppManagementPolicy value) {
        this._defaultAppManagementPolicy = value;
    }
    /**
     * Sets the directoryRoleAccessReviewPolicy property value. The directoryRoleAccessReviewPolicy property
     * @param value Value to set for the directoryRoleAccessReviewPolicy property.
     * @return a void
     */
    public void setDirectoryRoleAccessReviewPolicy(@javax.annotation.Nullable final DirectoryRoleAccessReviewPolicy value) {
        this._directoryRoleAccessReviewPolicy = value;
    }
    /**
     * Sets the externalIdentitiesPolicy property value. The externalIdentitiesPolicy property
     * @param value Value to set for the externalIdentitiesPolicy property.
     * @return a void
     */
    public void setExternalIdentitiesPolicy(@javax.annotation.Nullable final ExternalIdentitiesPolicy value) {
        this._externalIdentitiesPolicy = value;
    }
    /**
     * Sets the featureRolloutPolicies property value. The feature rollout policy associated with a directory object.
     * @param value Value to set for the featureRolloutPolicies property.
     * @return a void
     */
    public void setFeatureRolloutPolicies(@javax.annotation.Nullable final java.util.List<FeatureRolloutPolicy> value) {
        this._featureRolloutPolicies = value;
    }
    /**
     * Sets the homeRealmDiscoveryPolicies property value. The policy to control Azure AD authentication behavior for federated users.
     * @param value Value to set for the homeRealmDiscoveryPolicies property.
     * @return a void
     */
    public void setHomeRealmDiscoveryPolicies(@javax.annotation.Nullable final java.util.List<HomeRealmDiscoveryPolicy> value) {
        this._homeRealmDiscoveryPolicies = value;
    }
    /**
     * Sets the identitySecurityDefaultsEnforcementPolicy property value. The policy that represents the security defaults that protect against common attacks.
     * @param value Value to set for the identitySecurityDefaultsEnforcementPolicy property.
     * @return a void
     */
    public void setIdentitySecurityDefaultsEnforcementPolicy(@javax.annotation.Nullable final IdentitySecurityDefaultsEnforcementPolicy value) {
        this._identitySecurityDefaultsEnforcementPolicy = value;
    }
    /**
     * Sets the mobileAppManagementPolicies property value. The policy that defines auto-enrollment configuration for a mobility management (MDM or MAM) application.
     * @param value Value to set for the mobileAppManagementPolicies property.
     * @return a void
     */
    public void setMobileAppManagementPolicies(@javax.annotation.Nullable final java.util.List<MobilityManagementPolicy> value) {
        this._mobileAppManagementPolicies = value;
    }
    /**
     * Sets the mobileDeviceManagementPolicies property value. The mobileDeviceManagementPolicies property
     * @param value Value to set for the mobileDeviceManagementPolicies property.
     * @return a void
     */
    public void setMobileDeviceManagementPolicies(@javax.annotation.Nullable final java.util.List<MobilityManagementPolicy> value) {
        this._mobileDeviceManagementPolicies = value;
    }
    /**
     * Sets the permissionGrantPolicies property value. The policy that specifies the conditions under which consent can be granted.
     * @param value Value to set for the permissionGrantPolicies property.
     * @return a void
     */
    public void setPermissionGrantPolicies(@javax.annotation.Nullable final java.util.List<PermissionGrantPolicy> value) {
        this._permissionGrantPolicies = value;
    }
    /**
     * Sets the roleManagementPolicies property value. Represents the role management policies.
     * @param value Value to set for the roleManagementPolicies property.
     * @return a void
     */
    public void setRoleManagementPolicies(@javax.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicy> value) {
        this._roleManagementPolicies = value;
    }
    /**
     * Sets the roleManagementPolicyAssignments property value. Represents the role management policy assignments.
     * @param value Value to set for the roleManagementPolicyAssignments property.
     * @return a void
     */
    public void setRoleManagementPolicyAssignments(@javax.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicyAssignment> value) {
        this._roleManagementPolicyAssignments = value;
    }
    /**
     * Sets the servicePrincipalCreationPolicies property value. The servicePrincipalCreationPolicies property
     * @param value Value to set for the servicePrincipalCreationPolicies property.
     * @return a void
     */
    public void setServicePrincipalCreationPolicies(@javax.annotation.Nullable final java.util.List<ServicePrincipalCreationPolicy> value) {
        this._servicePrincipalCreationPolicies = value;
    }
    /**
     * Sets the tokenIssuancePolicies property value. The policy that specifies the characteristics of SAML tokens issued by Azure AD.
     * @param value Value to set for the tokenIssuancePolicies property.
     * @return a void
     */
    public void setTokenIssuancePolicies(@javax.annotation.Nullable final java.util.List<TokenIssuancePolicy> value) {
        this._tokenIssuancePolicies = value;
    }
    /**
     * Sets the tokenLifetimePolicies property value. The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Azure AD.
     * @param value Value to set for the tokenLifetimePolicies property.
     * @return a void
     */
    public void setTokenLifetimePolicies(@javax.annotation.Nullable final java.util.List<TokenLifetimePolicy> value) {
        this._tokenLifetimePolicies = value;
    }
}
