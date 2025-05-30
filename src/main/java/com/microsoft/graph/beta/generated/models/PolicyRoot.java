package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PolicyRoot} and sets the default values.
     */
    public PolicyRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyRoot}
     */
    @jakarta.annotation.Nonnull
    public static PolicyRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyRoot();
    }
    /**
     * Gets the accessReviewPolicy property value. The policy that contains directory-level access review settings.
     * @return a {@link AccessReviewPolicy}
     */
    @jakarta.annotation.Nullable
    public AccessReviewPolicy getAccessReviewPolicy() {
        return this.backingStore.get("accessReviewPolicy");
    }
    /**
     * Gets the activityBasedTimeoutPolicies property value. The policy that controls the idle time-out for web sessions for applications.
     * @return a {@link java.util.List<ActivityBasedTimeoutPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActivityBasedTimeoutPolicy> getActivityBasedTimeoutPolicies() {
        return this.backingStore.get("activityBasedTimeoutPolicies");
    }
    /**
     * Gets the adminConsentRequestPolicy property value. The policy by which consent requests are created and managed for the entire tenant.
     * @return a {@link AdminConsentRequestPolicy}
     */
    @jakarta.annotation.Nullable
    public AdminConsentRequestPolicy getAdminConsentRequestPolicy() {
        return this.backingStore.get("adminConsentRequestPolicy");
    }
    /**
     * Gets the appManagementPolicies property value. The policies that enforce app management restrictions for specific applications and service principals, overriding the defaultAppManagementPolicy.
     * @return a {@link java.util.List<AppManagementPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppManagementPolicy> getAppManagementPolicies() {
        return this.backingStore.get("appManagementPolicies");
    }
    /**
     * Gets the authenticationFlowsPolicy property value. The policy configuration of the self-service sign-up experience of guests.
     * @return a {@link AuthenticationFlowsPolicy}
     */
    @jakarta.annotation.Nullable
    public AuthenticationFlowsPolicy getAuthenticationFlowsPolicy() {
        return this.backingStore.get("authenticationFlowsPolicy");
    }
    /**
     * Gets the authenticationMethodsPolicy property value. The authentication methods and the users that are allowed to use them to sign in and perform multifactor authentication (MFA) in Microsoft Entra ID.
     * @return a {@link AuthenticationMethodsPolicy}
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodsPolicy getAuthenticationMethodsPolicy() {
        return this.backingStore.get("authenticationMethodsPolicy");
    }
    /**
     * Gets the authenticationStrengthPolicies property value. The authentication method combinations that are to be used in scenarios defined by Microsoft Entra Conditional Access.
     * @return a {@link java.util.List<AuthenticationStrengthPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationStrengthPolicy> getAuthenticationStrengthPolicies() {
        return this.backingStore.get("authenticationStrengthPolicies");
    }
    /**
     * Gets the authorizationPolicy property value. The policy that controls Microsoft Entra authorization settings.
     * @return a {@link java.util.List<AuthorizationPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthorizationPolicy> getAuthorizationPolicy() {
        return this.backingStore.get("authorizationPolicy");
    }
    /**
     * Gets the b2cAuthenticationMethodsPolicy property value. The Azure AD B2C policies that define how end users register via local accounts.
     * @return a {@link B2cAuthenticationMethodsPolicy}
     */
    @jakarta.annotation.Nullable
    public B2cAuthenticationMethodsPolicy getB2cAuthenticationMethodsPolicy() {
        return this.backingStore.get("b2cAuthenticationMethodsPolicy");
    }
    /**
     * Gets the claimsMappingPolicies property value. The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application.
     * @return a {@link java.util.List<ClaimsMappingPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ClaimsMappingPolicy> getClaimsMappingPolicies() {
        return this.backingStore.get("claimsMappingPolicies");
    }
    /**
     * Gets the crossTenantAccessPolicy property value. The custom rules that define an access scenario when interacting with external Microsoft Entra tenants.
     * @return a {@link CrossTenantAccessPolicy}
     */
    @jakarta.annotation.Nullable
    public CrossTenantAccessPolicy getCrossTenantAccessPolicy() {
        return this.backingStore.get("crossTenantAccessPolicy");
    }
    /**
     * Gets the defaultAppManagementPolicy property value. The tenant-wide policy that enforces app management restrictions for all applications and service principals.
     * @return a {@link TenantAppManagementPolicy}
     */
    @jakarta.annotation.Nullable
    public TenantAppManagementPolicy getDefaultAppManagementPolicy() {
        return this.backingStore.get("defaultAppManagementPolicy");
    }
    /**
     * Gets the deviceRegistrationPolicy property value. Represents the policy scope that controls quota restrictions, additional authentication, and authorization policies to register device identities to your organization.
     * @return a {@link DeviceRegistrationPolicy}
     */
    @jakarta.annotation.Nullable
    public DeviceRegistrationPolicy getDeviceRegistrationPolicy() {
        return this.backingStore.get("deviceRegistrationPolicy");
    }
    /**
     * Gets the directoryRoleAccessReviewPolicy property value. The directoryRoleAccessReviewPolicy property
     * @return a {@link DirectoryRoleAccessReviewPolicy}
     */
    @jakarta.annotation.Nullable
    public DirectoryRoleAccessReviewPolicy getDirectoryRoleAccessReviewPolicy() {
        return this.backingStore.get("directoryRoleAccessReviewPolicy");
    }
    /**
     * Gets the externalIdentitiesPolicy property value. Represents the tenant-wide policy that controls whether guests can leave a Microsoft Entra tenant via self-service controls.
     * @return a {@link ExternalIdentitiesPolicy}
     */
    @jakarta.annotation.Nullable
    public ExternalIdentitiesPolicy getExternalIdentitiesPolicy() {
        return this.backingStore.get("externalIdentitiesPolicy");
    }
    /**
     * Gets the featureRolloutPolicies property value. The feature rollout policy associated with a directory object.
     * @return a {@link java.util.List<FeatureRolloutPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FeatureRolloutPolicy> getFeatureRolloutPolicies() {
        return this.backingStore.get("featureRolloutPolicies");
    }
    /**
     * Gets the federatedTokenValidationPolicy property value. Represents a policy to control enabling or disabling validation of federation authentication tokens.
     * @return a {@link FederatedTokenValidationPolicy}
     */
    @jakarta.annotation.Nullable
    public FederatedTokenValidationPolicy getFederatedTokenValidationPolicy() {
        return this.backingStore.get("federatedTokenValidationPolicy");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
        deserializerMap.put("permissionGrantPolicies", (n) -> { this.setPermissionGrantPolicies(n.getCollectionOfObjectValues(PermissionGrantPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionGrantPreApprovalPolicies", (n) -> { this.setPermissionGrantPreApprovalPolicies(n.getCollectionOfObjectValues(PermissionGrantPreApprovalPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("roleManagementPolicies", (n) -> { this.setRoleManagementPolicies(n.getCollectionOfObjectValues(UnifiedRoleManagementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("roleManagementPolicyAssignments", (n) -> { this.setRoleManagementPolicyAssignments(n.getCollectionOfObjectValues(UnifiedRoleManagementPolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("servicePrincipalCreationPolicies", (n) -> { this.setServicePrincipalCreationPolicies(n.getCollectionOfObjectValues(ServicePrincipalCreationPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("tokenIssuancePolicies", (n) -> { this.setTokenIssuancePolicies(n.getCollectionOfObjectValues(TokenIssuancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("tokenLifetimePolicies", (n) -> { this.setTokenLifetimePolicies(n.getCollectionOfObjectValues(TokenLifetimePolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the homeRealmDiscoveryPolicies property value. The policy to control Microsoft Entra authentication behavior for federated users.
     * @return a {@link java.util.List<HomeRealmDiscoveryPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HomeRealmDiscoveryPolicy> getHomeRealmDiscoveryPolicies() {
        return this.backingStore.get("homeRealmDiscoveryPolicies");
    }
    /**
     * Gets the identitySecurityDefaultsEnforcementPolicy property value. The policy that represents the security defaults that protect against common attacks.
     * @return a {@link IdentitySecurityDefaultsEnforcementPolicy}
     */
    @jakarta.annotation.Nullable
    public IdentitySecurityDefaultsEnforcementPolicy getIdentitySecurityDefaultsEnforcementPolicy() {
        return this.backingStore.get("identitySecurityDefaultsEnforcementPolicy");
    }
    /**
     * Gets the mobileAppManagementPolicies property value. The policy that defines autoenrollment configuration for a mobility management (MDM or MAM) application.
     * @return a {@link java.util.List<MobilityManagementPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobilityManagementPolicy> getMobileAppManagementPolicies() {
        return this.backingStore.get("mobileAppManagementPolicies");
    }
    /**
     * Gets the mobileDeviceManagementPolicies property value. The mobileDeviceManagementPolicies property
     * @return a {@link java.util.List<MobilityManagementPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobilityManagementPolicy> getMobileDeviceManagementPolicies() {
        return this.backingStore.get("mobileDeviceManagementPolicies");
    }
    /**
     * Gets the permissionGrantPolicies property value. The policy that specifies the conditions under which consent can be granted.
     * @return a {@link java.util.List<PermissionGrantPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PermissionGrantPolicy> getPermissionGrantPolicies() {
        return this.backingStore.get("permissionGrantPolicies");
    }
    /**
     * Gets the permissionGrantPreApprovalPolicies property value. Policies that specify the conditions under which consent can be granted to a specific application.
     * @return a {@link java.util.List<PermissionGrantPreApprovalPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PermissionGrantPreApprovalPolicy> getPermissionGrantPreApprovalPolicies() {
        return this.backingStore.get("permissionGrantPreApprovalPolicies");
    }
    /**
     * Gets the roleManagementPolicies property value. Represents the role management policies.
     * @return a {@link java.util.List<UnifiedRoleManagementPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicy> getRoleManagementPolicies() {
        return this.backingStore.get("roleManagementPolicies");
    }
    /**
     * Gets the roleManagementPolicyAssignments property value. Represents the role management policy assignments.
     * @return a {@link java.util.List<UnifiedRoleManagementPolicyAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UnifiedRoleManagementPolicyAssignment> getRoleManagementPolicyAssignments() {
        return this.backingStore.get("roleManagementPolicyAssignments");
    }
    /**
     * Gets the servicePrincipalCreationPolicies property value. The servicePrincipalCreationPolicies property
     * @return a {@link java.util.List<ServicePrincipalCreationPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServicePrincipalCreationPolicy> getServicePrincipalCreationPolicies() {
        return this.backingStore.get("servicePrincipalCreationPolicies");
    }
    /**
     * Gets the tokenIssuancePolicies property value. The policy that specifies the characteristics of SAML tokens issued by Microsoft Entra ID.
     * @return a {@link java.util.List<TokenIssuancePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenIssuancePolicy> getTokenIssuancePolicies() {
        return this.backingStore.get("tokenIssuancePolicies");
    }
    /**
     * Gets the tokenLifetimePolicies property value. The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Microsoft Entra ID.
     * @return a {@link java.util.List<TokenLifetimePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenLifetimePolicy> getTokenLifetimePolicies() {
        return this.backingStore.get("tokenLifetimePolicies");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
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
        writer.writeCollectionOfObjectValues("permissionGrantPolicies", this.getPermissionGrantPolicies());
        writer.writeCollectionOfObjectValues("permissionGrantPreApprovalPolicies", this.getPermissionGrantPreApprovalPolicies());
        writer.writeCollectionOfObjectValues("roleManagementPolicies", this.getRoleManagementPolicies());
        writer.writeCollectionOfObjectValues("roleManagementPolicyAssignments", this.getRoleManagementPolicyAssignments());
        writer.writeCollectionOfObjectValues("servicePrincipalCreationPolicies", this.getServicePrincipalCreationPolicies());
        writer.writeCollectionOfObjectValues("tokenIssuancePolicies", this.getTokenIssuancePolicies());
        writer.writeCollectionOfObjectValues("tokenLifetimePolicies", this.getTokenLifetimePolicies());
    }
    /**
     * Sets the accessReviewPolicy property value. The policy that contains directory-level access review settings.
     * @param value Value to set for the accessReviewPolicy property.
     */
    public void setAccessReviewPolicy(@jakarta.annotation.Nullable final AccessReviewPolicy value) {
        this.backingStore.set("accessReviewPolicy", value);
    }
    /**
     * Sets the activityBasedTimeoutPolicies property value. The policy that controls the idle time-out for web sessions for applications.
     * @param value Value to set for the activityBasedTimeoutPolicies property.
     */
    public void setActivityBasedTimeoutPolicies(@jakarta.annotation.Nullable final java.util.List<ActivityBasedTimeoutPolicy> value) {
        this.backingStore.set("activityBasedTimeoutPolicies", value);
    }
    /**
     * Sets the adminConsentRequestPolicy property value. The policy by which consent requests are created and managed for the entire tenant.
     * @param value Value to set for the adminConsentRequestPolicy property.
     */
    public void setAdminConsentRequestPolicy(@jakarta.annotation.Nullable final AdminConsentRequestPolicy value) {
        this.backingStore.set("adminConsentRequestPolicy", value);
    }
    /**
     * Sets the appManagementPolicies property value. The policies that enforce app management restrictions for specific applications and service principals, overriding the defaultAppManagementPolicy.
     * @param value Value to set for the appManagementPolicies property.
     */
    public void setAppManagementPolicies(@jakarta.annotation.Nullable final java.util.List<AppManagementPolicy> value) {
        this.backingStore.set("appManagementPolicies", value);
    }
    /**
     * Sets the authenticationFlowsPolicy property value. The policy configuration of the self-service sign-up experience of guests.
     * @param value Value to set for the authenticationFlowsPolicy property.
     */
    public void setAuthenticationFlowsPolicy(@jakarta.annotation.Nullable final AuthenticationFlowsPolicy value) {
        this.backingStore.set("authenticationFlowsPolicy", value);
    }
    /**
     * Sets the authenticationMethodsPolicy property value. The authentication methods and the users that are allowed to use them to sign in and perform multifactor authentication (MFA) in Microsoft Entra ID.
     * @param value Value to set for the authenticationMethodsPolicy property.
     */
    public void setAuthenticationMethodsPolicy(@jakarta.annotation.Nullable final AuthenticationMethodsPolicy value) {
        this.backingStore.set("authenticationMethodsPolicy", value);
    }
    /**
     * Sets the authenticationStrengthPolicies property value. The authentication method combinations that are to be used in scenarios defined by Microsoft Entra Conditional Access.
     * @param value Value to set for the authenticationStrengthPolicies property.
     */
    public void setAuthenticationStrengthPolicies(@jakarta.annotation.Nullable final java.util.List<AuthenticationStrengthPolicy> value) {
        this.backingStore.set("authenticationStrengthPolicies", value);
    }
    /**
     * Sets the authorizationPolicy property value. The policy that controls Microsoft Entra authorization settings.
     * @param value Value to set for the authorizationPolicy property.
     */
    public void setAuthorizationPolicy(@jakarta.annotation.Nullable final java.util.List<AuthorizationPolicy> value) {
        this.backingStore.set("authorizationPolicy", value);
    }
    /**
     * Sets the b2cAuthenticationMethodsPolicy property value. The Azure AD B2C policies that define how end users register via local accounts.
     * @param value Value to set for the b2cAuthenticationMethodsPolicy property.
     */
    public void setB2cAuthenticationMethodsPolicy(@jakarta.annotation.Nullable final B2cAuthenticationMethodsPolicy value) {
        this.backingStore.set("b2cAuthenticationMethodsPolicy", value);
    }
    /**
     * Sets the claimsMappingPolicies property value. The claim-mapping policies for WS-Fed, SAML, OAuth 2.0, and OpenID Connect protocols, for tokens issued to a specific application.
     * @param value Value to set for the claimsMappingPolicies property.
     */
    public void setClaimsMappingPolicies(@jakarta.annotation.Nullable final java.util.List<ClaimsMappingPolicy> value) {
        this.backingStore.set("claimsMappingPolicies", value);
    }
    /**
     * Sets the crossTenantAccessPolicy property value. The custom rules that define an access scenario when interacting with external Microsoft Entra tenants.
     * @param value Value to set for the crossTenantAccessPolicy property.
     */
    public void setCrossTenantAccessPolicy(@jakarta.annotation.Nullable final CrossTenantAccessPolicy value) {
        this.backingStore.set("crossTenantAccessPolicy", value);
    }
    /**
     * Sets the defaultAppManagementPolicy property value. The tenant-wide policy that enforces app management restrictions for all applications and service principals.
     * @param value Value to set for the defaultAppManagementPolicy property.
     */
    public void setDefaultAppManagementPolicy(@jakarta.annotation.Nullable final TenantAppManagementPolicy value) {
        this.backingStore.set("defaultAppManagementPolicy", value);
    }
    /**
     * Sets the deviceRegistrationPolicy property value. Represents the policy scope that controls quota restrictions, additional authentication, and authorization policies to register device identities to your organization.
     * @param value Value to set for the deviceRegistrationPolicy property.
     */
    public void setDeviceRegistrationPolicy(@jakarta.annotation.Nullable final DeviceRegistrationPolicy value) {
        this.backingStore.set("deviceRegistrationPolicy", value);
    }
    /**
     * Sets the directoryRoleAccessReviewPolicy property value. The directoryRoleAccessReviewPolicy property
     * @param value Value to set for the directoryRoleAccessReviewPolicy property.
     */
    public void setDirectoryRoleAccessReviewPolicy(@jakarta.annotation.Nullable final DirectoryRoleAccessReviewPolicy value) {
        this.backingStore.set("directoryRoleAccessReviewPolicy", value);
    }
    /**
     * Sets the externalIdentitiesPolicy property value. Represents the tenant-wide policy that controls whether guests can leave a Microsoft Entra tenant via self-service controls.
     * @param value Value to set for the externalIdentitiesPolicy property.
     */
    public void setExternalIdentitiesPolicy(@jakarta.annotation.Nullable final ExternalIdentitiesPolicy value) {
        this.backingStore.set("externalIdentitiesPolicy", value);
    }
    /**
     * Sets the featureRolloutPolicies property value. The feature rollout policy associated with a directory object.
     * @param value Value to set for the featureRolloutPolicies property.
     */
    public void setFeatureRolloutPolicies(@jakarta.annotation.Nullable final java.util.List<FeatureRolloutPolicy> value) {
        this.backingStore.set("featureRolloutPolicies", value);
    }
    /**
     * Sets the federatedTokenValidationPolicy property value. Represents a policy to control enabling or disabling validation of federation authentication tokens.
     * @param value Value to set for the federatedTokenValidationPolicy property.
     */
    public void setFederatedTokenValidationPolicy(@jakarta.annotation.Nullable final FederatedTokenValidationPolicy value) {
        this.backingStore.set("federatedTokenValidationPolicy", value);
    }
    /**
     * Sets the homeRealmDiscoveryPolicies property value. The policy to control Microsoft Entra authentication behavior for federated users.
     * @param value Value to set for the homeRealmDiscoveryPolicies property.
     */
    public void setHomeRealmDiscoveryPolicies(@jakarta.annotation.Nullable final java.util.List<HomeRealmDiscoveryPolicy> value) {
        this.backingStore.set("homeRealmDiscoveryPolicies", value);
    }
    /**
     * Sets the identitySecurityDefaultsEnforcementPolicy property value. The policy that represents the security defaults that protect against common attacks.
     * @param value Value to set for the identitySecurityDefaultsEnforcementPolicy property.
     */
    public void setIdentitySecurityDefaultsEnforcementPolicy(@jakarta.annotation.Nullable final IdentitySecurityDefaultsEnforcementPolicy value) {
        this.backingStore.set("identitySecurityDefaultsEnforcementPolicy", value);
    }
    /**
     * Sets the mobileAppManagementPolicies property value. The policy that defines autoenrollment configuration for a mobility management (MDM or MAM) application.
     * @param value Value to set for the mobileAppManagementPolicies property.
     */
    public void setMobileAppManagementPolicies(@jakarta.annotation.Nullable final java.util.List<MobilityManagementPolicy> value) {
        this.backingStore.set("mobileAppManagementPolicies", value);
    }
    /**
     * Sets the mobileDeviceManagementPolicies property value. The mobileDeviceManagementPolicies property
     * @param value Value to set for the mobileDeviceManagementPolicies property.
     */
    public void setMobileDeviceManagementPolicies(@jakarta.annotation.Nullable final java.util.List<MobilityManagementPolicy> value) {
        this.backingStore.set("mobileDeviceManagementPolicies", value);
    }
    /**
     * Sets the permissionGrantPolicies property value. The policy that specifies the conditions under which consent can be granted.
     * @param value Value to set for the permissionGrantPolicies property.
     */
    public void setPermissionGrantPolicies(@jakarta.annotation.Nullable final java.util.List<PermissionGrantPolicy> value) {
        this.backingStore.set("permissionGrantPolicies", value);
    }
    /**
     * Sets the permissionGrantPreApprovalPolicies property value. Policies that specify the conditions under which consent can be granted to a specific application.
     * @param value Value to set for the permissionGrantPreApprovalPolicies property.
     */
    public void setPermissionGrantPreApprovalPolicies(@jakarta.annotation.Nullable final java.util.List<PermissionGrantPreApprovalPolicy> value) {
        this.backingStore.set("permissionGrantPreApprovalPolicies", value);
    }
    /**
     * Sets the roleManagementPolicies property value. Represents the role management policies.
     * @param value Value to set for the roleManagementPolicies property.
     */
    public void setRoleManagementPolicies(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicy> value) {
        this.backingStore.set("roleManagementPolicies", value);
    }
    /**
     * Sets the roleManagementPolicyAssignments property value. Represents the role management policy assignments.
     * @param value Value to set for the roleManagementPolicyAssignments property.
     */
    public void setRoleManagementPolicyAssignments(@jakarta.annotation.Nullable final java.util.List<UnifiedRoleManagementPolicyAssignment> value) {
        this.backingStore.set("roleManagementPolicyAssignments", value);
    }
    /**
     * Sets the servicePrincipalCreationPolicies property value. The servicePrincipalCreationPolicies property
     * @param value Value to set for the servicePrincipalCreationPolicies property.
     */
    public void setServicePrincipalCreationPolicies(@jakarta.annotation.Nullable final java.util.List<ServicePrincipalCreationPolicy> value) {
        this.backingStore.set("servicePrincipalCreationPolicies", value);
    }
    /**
     * Sets the tokenIssuancePolicies property value. The policy that specifies the characteristics of SAML tokens issued by Microsoft Entra ID.
     * @param value Value to set for the tokenIssuancePolicies property.
     */
    public void setTokenIssuancePolicies(@jakarta.annotation.Nullable final java.util.List<TokenIssuancePolicy> value) {
        this.backingStore.set("tokenIssuancePolicies", value);
    }
    /**
     * Sets the tokenLifetimePolicies property value. The policy that controls the lifetime of a JWT access token, an ID token, or a SAML 1.1/2.0 token issued by Microsoft Entra ID.
     * @param value Value to set for the tokenLifetimePolicies property.
     */
    public void setTokenLifetimePolicies(@jakarta.annotation.Nullable final java.util.List<TokenLifetimePolicy> value) {
        this.backingStore.set("tokenLifetimePolicies", value);
    }
}
