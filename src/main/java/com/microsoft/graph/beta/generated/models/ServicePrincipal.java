package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePrincipal extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link ServicePrincipal} and sets the default values.
     */
    public ServicePrincipal() {
        super();
        this.setOdataType("#microsoft.graph.servicePrincipal");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ServicePrincipal}
     */
    @jakarta.annotation.Nonnull
    public static ServicePrincipal createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipal();
    }
    /**
     * Gets the accountEnabled property value. true if the service principal account is enabled; otherwise, false. If set to false, then no users are able to sign in to this app, even if they&apos;re assigned to it. Supports $filter (eq, ne, not, in).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAccountEnabled() {
        return this.backingStore.get("accountEnabled");
    }
    /**
     * Gets the addIns property value. Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its &apos;FileHandler&apos; functionality. This lets services like Microsoft 365 call the application in the context of a document the user is working on.
     * @return a {@link java.util.List<AddIn>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AddIn> getAddIns() {
        return this.backingStore.get("addIns");
    }
    /**
     * Gets the alternativeNames property value. Used to retrieve service principals by subscription, identify resource group and full resource IDs for managed identities. Supports $filter (eq, not, ge, le, startsWith).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAlternativeNames() {
        return this.backingStore.get("alternativeNames");
    }
    /**
     * Gets the appDescription property value. The description exposed by the associated application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppDescription() {
        return this.backingStore.get("appDescription");
    }
    /**
     * Gets the appDisplayName property value. The display name exposed by the associated application. Maximum length is 256 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppDisplayName() {
        return this.backingStore.get("appDisplayName");
    }
    /**
     * Gets the appId property value. The unique identifier for the associated application (its appId property). Alternate key. Supports $filter (eq, ne, not, in, startsWith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * Gets the applicationTemplateId property value. Unique identifier of the applicationTemplate. Supports $filter (eq, not, ne). Read-only. null if the app wasn&apos;t created from an application template.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationTemplateId() {
        return this.backingStore.get("applicationTemplateId");
    }
    /**
     * Gets the appManagementPolicies property value. The appManagementPolicy applied to this service principal.
     * @return a {@link java.util.List<AppManagementPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppManagementPolicy> getAppManagementPolicies() {
        return this.backingStore.get("appManagementPolicies");
    }
    /**
     * Gets the appOwnerOrganizationId property value. Contains the tenant ID where the application is registered. This is applicable only to service principals backed by applications. Supports $filter (eq, ne, NOT, ge, le).
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getAppOwnerOrganizationId() {
        return this.backingStore.get("appOwnerOrganizationId");
    }
    /**
     * Gets the appRoleAssignedTo property value. App role assignments for this app or service, granted to users, groups, and other service principals.Supports $expand.
     * @return a {@link java.util.List<AppRoleAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppRoleAssignment> getAppRoleAssignedTo() {
        return this.backingStore.get("appRoleAssignedTo");
    }
    /**
     * Gets the appRoleAssignmentRequired property value. Specifies whether users or other service principals need to be granted an app role assignment for this service principal before users can sign in or apps can get tokens. The default value is false. Not nullable. Supports $filter (eq, ne, NOT).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAppRoleAssignmentRequired() {
        return this.backingStore.get("appRoleAssignmentRequired");
    }
    /**
     * Gets the appRoleAssignments property value. App role assignment for another app or service, granted to this service principal. Supports $expand.
     * @return a {@link java.util.List<AppRoleAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppRoleAssignment> getAppRoleAssignments() {
        return this.backingStore.get("appRoleAssignments");
    }
    /**
     * Gets the appRoles property value. The roles exposed by the application, which this service principal represents. For more information, see the appRoles property definition on the application entity. Not nullable.
     * @return a {@link java.util.List<AppRole>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AppRole> getAppRoles() {
        return this.backingStore.get("appRoles");
    }
    /**
     * Gets the claimsMappingPolicies property value. The claimsMappingPolicies assigned to this service principal. Supports $expand.
     * @return a {@link java.util.List<ClaimsMappingPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ClaimsMappingPolicy> getClaimsMappingPolicies() {
        return this.backingStore.get("claimsMappingPolicies");
    }
    /**
     * Gets the claimsPolicy property value. A claims policy that allows application admins to customize the claims that will be emitted in tokens affected by this policy.
     * @return a {@link CustomClaimsPolicy}
     */
    @jakarta.annotation.Nullable
    public CustomClaimsPolicy getClaimsPolicy() {
        return this.backingStore.get("claimsPolicy");
    }
    /**
     * Gets the createdObjects property value. Directory objects created by this service principal. Read-only. Nullable.
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getCreatedObjects() {
        return this.backingStore.get("createdObjects");
    }
    /**
     * Gets the customSecurityAttributes property value. An open complex type that holds the value of a custom security attribute that is assigned to a directory object. Nullable. Returned only on $select. Supports $filter (eq, ne, not, startsWith). Filter value is case sensitive.To read this property, the calling app must be assigned the CustomSecAttributeAssignment.Read.All permission. To write this property, the calling app must be assigned the CustomSecAttributeAssignment.ReadWrite.All permissions. To read or write this property in delegated scenarios, the admin must be assigned the Attribute Assignment Administrator role.
     * @return a {@link CustomSecurityAttributeValue}
     */
    @jakarta.annotation.Nullable
    public CustomSecurityAttributeValue getCustomSecurityAttributes() {
        return this.backingStore.get("customSecurityAttributes");
    }
    /**
     * Gets the delegatedPermissionClassifications property value. The permission classifications for delegated permissions exposed by the app that this service principal represents. Supports $expand.
     * @return a {@link java.util.List<DelegatedPermissionClassification>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DelegatedPermissionClassification> getDelegatedPermissionClassifications() {
        return this.backingStore.get("delegatedPermissionClassifications");
    }
    /**
     * Gets the description property value. Free text field to provide an internal end-user facing description of the service principal. End-user portals such MyApps displays the application description in this field. The maximum allowed size is 1,024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the disabledByMicrosoftStatus property value. Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisabledByMicrosoftStatus() {
        return this.backingStore.get("disabledByMicrosoftStatus");
    }
    /**
     * Gets the displayName property value. The display name for the service principal. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the endpoints property value. Endpoints available for discovery. Services like Sharepoint populate this property with a tenant specific SharePoint endpoints that other applications can discover and use in their experiences.
     * @return a {@link java.util.List<Endpoint>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Endpoint> getEndpoints() {
        return this.backingStore.get("endpoints");
    }
    /**
     * Gets the errorUrl property value. Deprecated. Don&apos;t use.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorUrl() {
        return this.backingStore.get("errorUrl");
    }
    /**
     * Gets the federatedIdentityCredentials property value. The federatedIdentityCredentials property
     * @return a {@link java.util.List<FederatedIdentityCredential>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FederatedIdentityCredential> getFederatedIdentityCredentials() {
        return this.backingStore.get("federatedIdentityCredentials");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountEnabled", (n) -> { this.setAccountEnabled(n.getBooleanValue()); });
        deserializerMap.put("addIns", (n) -> { this.setAddIns(n.getCollectionOfObjectValues(AddIn::createFromDiscriminatorValue)); });
        deserializerMap.put("alternativeNames", (n) -> { this.setAlternativeNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("appDescription", (n) -> { this.setAppDescription(n.getStringValue()); });
        deserializerMap.put("appDisplayName", (n) -> { this.setAppDisplayName(n.getStringValue()); });
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("applicationTemplateId", (n) -> { this.setApplicationTemplateId(n.getStringValue()); });
        deserializerMap.put("appManagementPolicies", (n) -> { this.setAppManagementPolicies(n.getCollectionOfObjectValues(AppManagementPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("appOwnerOrganizationId", (n) -> { this.setAppOwnerOrganizationId(n.getUUIDValue()); });
        deserializerMap.put("appRoleAssignedTo", (n) -> { this.setAppRoleAssignedTo(n.getCollectionOfObjectValues(AppRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("appRoleAssignmentRequired", (n) -> { this.setAppRoleAssignmentRequired(n.getBooleanValue()); });
        deserializerMap.put("appRoleAssignments", (n) -> { this.setAppRoleAssignments(n.getCollectionOfObjectValues(AppRoleAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("appRoles", (n) -> { this.setAppRoles(n.getCollectionOfObjectValues(AppRole::createFromDiscriminatorValue)); });
        deserializerMap.put("claimsMappingPolicies", (n) -> { this.setClaimsMappingPolicies(n.getCollectionOfObjectValues(ClaimsMappingPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("claimsPolicy", (n) -> { this.setClaimsPolicy(n.getObjectValue(CustomClaimsPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("createdObjects", (n) -> { this.setCreatedObjects(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("customSecurityAttributes", (n) -> { this.setCustomSecurityAttributes(n.getObjectValue(CustomSecurityAttributeValue::createFromDiscriminatorValue)); });
        deserializerMap.put("delegatedPermissionClassifications", (n) -> { this.setDelegatedPermissionClassifications(n.getCollectionOfObjectValues(DelegatedPermissionClassification::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("disabledByMicrosoftStatus", (n) -> { this.setDisabledByMicrosoftStatus(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endpoints", (n) -> { this.setEndpoints(n.getCollectionOfObjectValues(Endpoint::createFromDiscriminatorValue)); });
        deserializerMap.put("errorUrl", (n) -> { this.setErrorUrl(n.getStringValue()); });
        deserializerMap.put("federatedIdentityCredentials", (n) -> { this.setFederatedIdentityCredentials(n.getCollectionOfObjectValues(FederatedIdentityCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("homepage", (n) -> { this.setHomepage(n.getStringValue()); });
        deserializerMap.put("homeRealmDiscoveryPolicies", (n) -> { this.setHomeRealmDiscoveryPolicies(n.getCollectionOfObjectValues(HomeRealmDiscoveryPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("info", (n) -> { this.setInfo(n.getObjectValue(InformationalUrl::createFromDiscriminatorValue)); });
        deserializerMap.put("keyCredentials", (n) -> { this.setKeyCredentials(n.getCollectionOfObjectValues(KeyCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("licenseDetails", (n) -> { this.setLicenseDetails(n.getCollectionOfObjectValues(LicenseDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("loginUrl", (n) -> { this.setLoginUrl(n.getStringValue()); });
        deserializerMap.put("logoutUrl", (n) -> { this.setLogoutUrl(n.getStringValue()); });
        deserializerMap.put("memberOf", (n) -> { this.setMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("notificationEmailAddresses", (n) -> { this.setNotificationEmailAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("oauth2PermissionGrants", (n) -> { this.setOauth2PermissionGrants(n.getCollectionOfObjectValues(OAuth2PermissionGrant::createFromDiscriminatorValue)); });
        deserializerMap.put("ownedObjects", (n) -> { this.setOwnedObjects(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("owners", (n) -> { this.setOwners(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("passwordCredentials", (n) -> { this.setPasswordCredentials(n.getCollectionOfObjectValues(PasswordCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("passwordSingleSignOnSettings", (n) -> { this.setPasswordSingleSignOnSettings(n.getObjectValue(PasswordSingleSignOnSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionGrantPreApprovalPolicies", (n) -> { this.setPermissionGrantPreApprovalPolicies(n.getCollectionOfObjectValues(PermissionGrantPreApprovalPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("preferredSingleSignOnMode", (n) -> { this.setPreferredSingleSignOnMode(n.getStringValue()); });
        deserializerMap.put("preferredTokenSigningKeyEndDateTime", (n) -> { this.setPreferredTokenSigningKeyEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("preferredTokenSigningKeyThumbprint", (n) -> { this.setPreferredTokenSigningKeyThumbprint(n.getStringValue()); });
        deserializerMap.put("publishedPermissionScopes", (n) -> { this.setPublishedPermissionScopes(n.getCollectionOfObjectValues(PermissionScope::createFromDiscriminatorValue)); });
        deserializerMap.put("publisherName", (n) -> { this.setPublisherName(n.getStringValue()); });
        deserializerMap.put("remoteDesktopSecurityConfiguration", (n) -> { this.setRemoteDesktopSecurityConfiguration(n.getObjectValue(RemoteDesktopSecurityConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("replyUrls", (n) -> { this.setReplyUrls(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("samlMetadataUrl", (n) -> { this.setSamlMetadataUrl(n.getStringValue()); });
        deserializerMap.put("samlSingleSignOnSettings", (n) -> { this.setSamlSingleSignOnSettings(n.getObjectValue(SamlSingleSignOnSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("servicePrincipalNames", (n) -> { this.setServicePrincipalNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("servicePrincipalType", (n) -> { this.setServicePrincipalType(n.getStringValue()); });
        deserializerMap.put("signInAudience", (n) -> { this.setSignInAudience(n.getStringValue()); });
        deserializerMap.put("synchronization", (n) -> { this.setSynchronization(n.getObjectValue(Synchronization::createFromDiscriminatorValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tokenEncryptionKeyId", (n) -> { this.setTokenEncryptionKeyId(n.getUUIDValue()); });
        deserializerMap.put("tokenIssuancePolicies", (n) -> { this.setTokenIssuancePolicies(n.getCollectionOfObjectValues(TokenIssuancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("tokenLifetimePolicies", (n) -> { this.setTokenLifetimePolicies(n.getCollectionOfObjectValues(TokenLifetimePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("transitiveMemberOf", (n) -> { this.setTransitiveMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("verifiedPublisher", (n) -> { this.setVerifiedPublisher(n.getObjectValue(VerifiedPublisher::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the homepage property value. Home page or landing page of the application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHomepage() {
        return this.backingStore.get("homepage");
    }
    /**
     * Gets the homeRealmDiscoveryPolicies property value. The homeRealmDiscoveryPolicies assigned to this service principal. Supports $expand.
     * @return a {@link java.util.List<HomeRealmDiscoveryPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HomeRealmDiscoveryPolicy> getHomeRealmDiscoveryPolicies() {
        return this.backingStore.get("homeRealmDiscoveryPolicies");
    }
    /**
     * Gets the info property value. Basic profile information of the acquired application such as app&apos;s marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Microsoft Entra apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     * @return a {@link InformationalUrl}
     */
    @jakarta.annotation.Nullable
    public InformationalUrl getInfo() {
        return this.backingStore.get("info");
    }
    /**
     * Gets the keyCredentials property value. The collection of key credentials associated with the service principal. Not nullable. Supports $filter (eq, not, ge, le).
     * @return a {@link java.util.List<KeyCredential>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyCredential> getKeyCredentials() {
        return this.backingStore.get("keyCredentials");
    }
    /**
     * Gets the licenseDetails property value. The licenseDetails property
     * @return a {@link java.util.List<LicenseDetails>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LicenseDetails> getLicenseDetails() {
        return this.backingStore.get("licenseDetails");
    }
    /**
     * Gets the loginUrl property value. Specifies the URL where the service provider redirects the user to Microsoft Entra ID to authenticate. Microsoft Entra ID uses the URL to launch the application from Microsoft 365 or the Microsoft Entra My Apps. When blank, Microsoft Entra ID performs IdP-initiated sign-on for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the Microsoft Entra My Apps, or the Microsoft Entra SSO URL.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLoginUrl() {
        return this.backingStore.get("loginUrl");
    }
    /**
     * Gets the logoutUrl property value. Specifies the URL that the Microsoft&apos;s authorization service uses to sign out a user using OpenId Connect front-channel, back-channel, or SAML sign out protocols.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLogoutUrl() {
        return this.backingStore.get("logoutUrl");
    }
    /**
     * Gets the memberOf property value. Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable. Supports $expand.
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getMemberOf() {
        return this.backingStore.get("memberOf");
    }
    /**
     * Gets the notes property value. Free text field to capture information about the service principal, typically used for operational purposes. Maximum allowed size is 1,024 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Gets the notificationEmailAddresses property value. Specifies the list of email addresses where Microsoft Entra ID sends a notification when the active certificate is near the expiration date. This is only for the certificates used to sign the SAML token issued for Microsoft Entra Gallery applications.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNotificationEmailAddresses() {
        return this.backingStore.get("notificationEmailAddresses");
    }
    /**
     * Gets the oauth2PermissionGrants property value. Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     * @return a {@link java.util.List<OAuth2PermissionGrant>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OAuth2PermissionGrant> getOauth2PermissionGrants() {
        return this.backingStore.get("oauth2PermissionGrants");
    }
    /**
     * Gets the ownedObjects property value. Directory objects that are owned by this service principal. Read-only. Nullable. Supports $expand and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getOwnedObjects() {
        return this.backingStore.get("ownedObjects");
    }
    /**
     * Gets the owners property value. Directory objects that are owners of this servicePrincipal. The owners are a set of nonadmin users or servicePrincipals who are allowed to modify this object. Supports $expand and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getOwners() {
        return this.backingStore.get("owners");
    }
    /**
     * Gets the passwordCredentials property value. The collection of password credentials associated with the service principal. Not nullable.
     * @return a {@link java.util.List<PasswordCredential>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PasswordCredential> getPasswordCredentials() {
        return this.backingStore.get("passwordCredentials");
    }
    /**
     * Gets the passwordSingleSignOnSettings property value. The collection for settings related to password single sign-on. Use $select=passwordSingleSignOnSettings to read the property. Read-only for applicationTemplates except for custom applicationTemplates.
     * @return a {@link PasswordSingleSignOnSettings}
     */
    @jakarta.annotation.Nullable
    public PasswordSingleSignOnSettings getPasswordSingleSignOnSettings() {
        return this.backingStore.get("passwordSingleSignOnSettings");
    }
    /**
     * Gets the permissionGrantPreApprovalPolicies property value. The permissionGrantPreApprovalPolicies property
     * @return a {@link java.util.List<PermissionGrantPreApprovalPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PermissionGrantPreApprovalPolicy> getPermissionGrantPreApprovalPolicies() {
        return this.backingStore.get("permissionGrantPreApprovalPolicies");
    }
    /**
     * Gets the preferredSingleSignOnMode property value. Specifies the single sign-on mode configured for this application. Microsoft Entra ID uses the preferred single sign-on mode to launch the application from Microsoft 365 or the Microsoft Entra My Apps. The supported values are password, saml, notSupported, and oidc. Note: This field might be null for older SAML apps and for OIDC applications where it isn&apos;t set automatically.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreferredSingleSignOnMode() {
        return this.backingStore.get("preferredSingleSignOnMode");
    }
    /**
     * Gets the preferredTokenSigningKeyEndDateTime property value. Specifies the expiration date of the keyCredential used for token signing, marked by preferredTokenSigningKeyThumbprint. Updating this attribute isn&apos;t currently supported. For details, see ServicePrincipal property differences.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPreferredTokenSigningKeyEndDateTime() {
        return this.backingStore.get("preferredTokenSigningKeyEndDateTime");
    }
    /**
     * Gets the preferredTokenSigningKeyThumbprint property value. This property can be used on SAML applications (apps that have preferredSingleSignOnMode set to saml) to control which certificate is used to sign the SAML responses. For applications that aren&apos;t SAML, don&apos;t write or otherwise rely on this property.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreferredTokenSigningKeyThumbprint() {
        return this.backingStore.get("preferredTokenSigningKeyThumbprint");
    }
    /**
     * Gets the publishedPermissionScopes property value. The delegated permissions exposed by the application. For more information, see the oauth2PermissionScopes property on the application entity&apos;s api property. Not nullable. Note: This property is named oauth2PermissionScopes in v1.0.
     * @return a {@link java.util.List<PermissionScope>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PermissionScope> getPublishedPermissionScopes() {
        return this.backingStore.get("publishedPermissionScopes");
    }
    /**
     * Gets the publisherName property value. The name of the Microsoft Entra tenant that published the application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublisherName() {
        return this.backingStore.get("publisherName");
    }
    /**
     * Gets the remoteDesktopSecurityConfiguration property value. The remoteDesktopSecurityConfiguration object applied to this service principal. Supports $filter (eq) for isRemoteDesktopProtocolEnabled property.
     * @return a {@link RemoteDesktopSecurityConfiguration}
     */
    @jakarta.annotation.Nullable
    public RemoteDesktopSecurityConfiguration getRemoteDesktopSecurityConfiguration() {
        return this.backingStore.get("remoteDesktopSecurityConfiguration");
    }
    /**
     * Gets the replyUrls property value. The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0 authorization codes and access tokens are sent to for the associated application. Not nullable.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getReplyUrls() {
        return this.backingStore.get("replyUrls");
    }
    /**
     * Gets the samlMetadataUrl property value. The url where the service exposes SAML metadata for federation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSamlMetadataUrl() {
        return this.backingStore.get("samlMetadataUrl");
    }
    /**
     * Gets the samlSingleSignOnSettings property value. The collection for settings related to saml single sign-on.
     * @return a {@link SamlSingleSignOnSettings}
     */
    @jakarta.annotation.Nullable
    public SamlSingleSignOnSettings getSamlSingleSignOnSettings() {
        return this.backingStore.get("samlSingleSignOnSettings");
    }
    /**
     * Gets the servicePrincipalNames property value. Contains the list of identifiersUris, copied over from the associated application. More values can be added to hybrid applications. These values can be used to identify the permissions exposed by this app within Microsoft Entra ID. For example,Client apps can specify a resource URI that is based on the values of this property to acquire an access token, which is the URI returned in the &apos;aud&apos; claim.The any operator is required for filter expressions on multi-valued properties. Not nullable.  Supports $filter (eq, not, ge, le, startsWith).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getServicePrincipalNames() {
        return this.backingStore.get("servicePrincipalNames");
    }
    /**
     * Gets the servicePrincipalType property value. Identifies if the service principal represents an application or a managed identity. This is set by Microsoft Entra ID internally. For a service principal that represents an application this is set as Application. For a service principal that represents a managed identity this is set as ManagedIdentity. The SocialIdp type is for internal use.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalType() {
        return this.backingStore.get("servicePrincipalType");
    }
    /**
     * Gets the signInAudience property value. Specifies the Microsoft accounts that are supported for the current application. Read-only. Supported values are:AzureADMyOrg: Users with a Microsoft work or school account in my organization&apos;s Microsoft Entra tenant (single-tenant).AzureADMultipleOrgs: Users with a Microsoft work or school account in any organization&apos;s Microsoft Entra tenant (multitenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any organization&apos;s Microsoft Entra tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignInAudience() {
        return this.backingStore.get("signInAudience");
    }
    /**
     * Gets the synchronization property value. Represents the capability for Microsoft Entra identity synchronization through the Microsoft Graph API.
     * @return a {@link Synchronization}
     */
    @jakarta.annotation.Nullable
    public Synchronization getSynchronization() {
        return this.backingStore.get("synchronization");
    }
    /**
     * Gets the tags property value. Custom strings that can be used to categorize and identify the service principal. Not nullable. The value is the union of strings set here and on the associated application entity&apos;s tags property.Supports $filter (eq, not, ge, le, startsWith).
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Gets the tokenEncryptionKeyId property value. Specifies the keyId of a public key from the keyCredentials collection. When configured, Microsoft Entra ID issues tokens for this application encrypted using the key specified by this property. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getTokenEncryptionKeyId() {
        return this.backingStore.get("tokenEncryptionKeyId");
    }
    /**
     * Gets the tokenIssuancePolicies property value. The tokenIssuancePolicies assigned to this service principal. Supports $expand.
     * @return a {@link java.util.List<TokenIssuancePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenIssuancePolicy> getTokenIssuancePolicies() {
        return this.backingStore.get("tokenIssuancePolicies");
    }
    /**
     * Gets the tokenLifetimePolicies property value. The tokenLifetimePolicies assigned to this service principal. Supports $expand.
     * @return a {@link java.util.List<TokenLifetimePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TokenLifetimePolicy> getTokenLifetimePolicies() {
        return this.backingStore.get("tokenLifetimePolicies");
    }
    /**
     * Gets the transitiveMemberOf property value. The transitiveMemberOf property
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveMemberOf() {
        return this.backingStore.get("transitiveMemberOf");
    }
    /**
     * Gets the verifiedPublisher property value. Specifies the verified publisher of the application that&apos;s linked to this service principal.
     * @return a {@link VerifiedPublisher}
     */
    @jakarta.annotation.Nullable
    public VerifiedPublisher getVerifiedPublisher() {
        return this.backingStore.get("verifiedPublisher");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("accountEnabled", this.getAccountEnabled());
        writer.writeCollectionOfObjectValues("addIns", this.getAddIns());
        writer.writeCollectionOfPrimitiveValues("alternativeNames", this.getAlternativeNames());
        writer.writeStringValue("appDescription", this.getAppDescription());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("applicationTemplateId", this.getApplicationTemplateId());
        writer.writeCollectionOfObjectValues("appManagementPolicies", this.getAppManagementPolicies());
        writer.writeUUIDValue("appOwnerOrganizationId", this.getAppOwnerOrganizationId());
        writer.writeCollectionOfObjectValues("appRoleAssignedTo", this.getAppRoleAssignedTo());
        writer.writeBooleanValue("appRoleAssignmentRequired", this.getAppRoleAssignmentRequired());
        writer.writeCollectionOfObjectValues("appRoleAssignments", this.getAppRoleAssignments());
        writer.writeCollectionOfObjectValues("appRoles", this.getAppRoles());
        writer.writeCollectionOfObjectValues("claimsMappingPolicies", this.getClaimsMappingPolicies());
        writer.writeObjectValue("claimsPolicy", this.getClaimsPolicy());
        writer.writeCollectionOfObjectValues("createdObjects", this.getCreatedObjects());
        writer.writeObjectValue("customSecurityAttributes", this.getCustomSecurityAttributes());
        writer.writeCollectionOfObjectValues("delegatedPermissionClassifications", this.getDelegatedPermissionClassifications());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("disabledByMicrosoftStatus", this.getDisabledByMicrosoftStatus());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("endpoints", this.getEndpoints());
        writer.writeStringValue("errorUrl", this.getErrorUrl());
        writer.writeCollectionOfObjectValues("federatedIdentityCredentials", this.getFederatedIdentityCredentials());
        writer.writeStringValue("homepage", this.getHomepage());
        writer.writeCollectionOfObjectValues("homeRealmDiscoveryPolicies", this.getHomeRealmDiscoveryPolicies());
        writer.writeObjectValue("info", this.getInfo());
        writer.writeCollectionOfObjectValues("keyCredentials", this.getKeyCredentials());
        writer.writeCollectionOfObjectValues("licenseDetails", this.getLicenseDetails());
        writer.writeStringValue("loginUrl", this.getLoginUrl());
        writer.writeStringValue("logoutUrl", this.getLogoutUrl());
        writer.writeCollectionOfObjectValues("memberOf", this.getMemberOf());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeCollectionOfPrimitiveValues("notificationEmailAddresses", this.getNotificationEmailAddresses());
        writer.writeCollectionOfObjectValues("oauth2PermissionGrants", this.getOauth2PermissionGrants());
        writer.writeCollectionOfObjectValues("ownedObjects", this.getOwnedObjects());
        writer.writeCollectionOfObjectValues("owners", this.getOwners());
        writer.writeCollectionOfObjectValues("passwordCredentials", this.getPasswordCredentials());
        writer.writeObjectValue("passwordSingleSignOnSettings", this.getPasswordSingleSignOnSettings());
        writer.writeCollectionOfObjectValues("permissionGrantPreApprovalPolicies", this.getPermissionGrantPreApprovalPolicies());
        writer.writeStringValue("preferredSingleSignOnMode", this.getPreferredSingleSignOnMode());
        writer.writeOffsetDateTimeValue("preferredTokenSigningKeyEndDateTime", this.getPreferredTokenSigningKeyEndDateTime());
        writer.writeStringValue("preferredTokenSigningKeyThumbprint", this.getPreferredTokenSigningKeyThumbprint());
        writer.writeCollectionOfObjectValues("publishedPermissionScopes", this.getPublishedPermissionScopes());
        writer.writeStringValue("publisherName", this.getPublisherName());
        writer.writeObjectValue("remoteDesktopSecurityConfiguration", this.getRemoteDesktopSecurityConfiguration());
        writer.writeCollectionOfPrimitiveValues("replyUrls", this.getReplyUrls());
        writer.writeStringValue("samlMetadataUrl", this.getSamlMetadataUrl());
        writer.writeObjectValue("samlSingleSignOnSettings", this.getSamlSingleSignOnSettings());
        writer.writeCollectionOfPrimitiveValues("servicePrincipalNames", this.getServicePrincipalNames());
        writer.writeStringValue("servicePrincipalType", this.getServicePrincipalType());
        writer.writeStringValue("signInAudience", this.getSignInAudience());
        writer.writeObjectValue("synchronization", this.getSynchronization());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeUUIDValue("tokenEncryptionKeyId", this.getTokenEncryptionKeyId());
        writer.writeCollectionOfObjectValues("tokenIssuancePolicies", this.getTokenIssuancePolicies());
        writer.writeCollectionOfObjectValues("tokenLifetimePolicies", this.getTokenLifetimePolicies());
        writer.writeCollectionOfObjectValues("transitiveMemberOf", this.getTransitiveMemberOf());
        writer.writeObjectValue("verifiedPublisher", this.getVerifiedPublisher());
    }
    /**
     * Sets the accountEnabled property value. true if the service principal account is enabled; otherwise, false. If set to false, then no users are able to sign in to this app, even if they&apos;re assigned to it. Supports $filter (eq, ne, not, in).
     * @param value Value to set for the accountEnabled property.
     */
    public void setAccountEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("accountEnabled", value);
    }
    /**
     * Sets the addIns property value. Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its &apos;FileHandler&apos; functionality. This lets services like Microsoft 365 call the application in the context of a document the user is working on.
     * @param value Value to set for the addIns property.
     */
    public void setAddIns(@jakarta.annotation.Nullable final java.util.List<AddIn> value) {
        this.backingStore.set("addIns", value);
    }
    /**
     * Sets the alternativeNames property value. Used to retrieve service principals by subscription, identify resource group and full resource IDs for managed identities. Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the alternativeNames property.
     */
    public void setAlternativeNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("alternativeNames", value);
    }
    /**
     * Sets the appDescription property value. The description exposed by the associated application.
     * @param value Value to set for the appDescription property.
     */
    public void setAppDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appDescription", value);
    }
    /**
     * Sets the appDisplayName property value. The display name exposed by the associated application. Maximum length is 256 characters.
     * @param value Value to set for the appDisplayName property.
     */
    public void setAppDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appDisplayName", value);
    }
    /**
     * Sets the appId property value. The unique identifier for the associated application (its appId property). Alternate key. Supports $filter (eq, ne, not, in, startsWith).
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the applicationTemplateId property value. Unique identifier of the applicationTemplate. Supports $filter (eq, not, ne). Read-only. null if the app wasn&apos;t created from an application template.
     * @param value Value to set for the applicationTemplateId property.
     */
    public void setApplicationTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationTemplateId", value);
    }
    /**
     * Sets the appManagementPolicies property value. The appManagementPolicy applied to this service principal.
     * @param value Value to set for the appManagementPolicies property.
     */
    public void setAppManagementPolicies(@jakarta.annotation.Nullable final java.util.List<AppManagementPolicy> value) {
        this.backingStore.set("appManagementPolicies", value);
    }
    /**
     * Sets the appOwnerOrganizationId property value. Contains the tenant ID where the application is registered. This is applicable only to service principals backed by applications. Supports $filter (eq, ne, NOT, ge, le).
     * @param value Value to set for the appOwnerOrganizationId property.
     */
    public void setAppOwnerOrganizationId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("appOwnerOrganizationId", value);
    }
    /**
     * Sets the appRoleAssignedTo property value. App role assignments for this app or service, granted to users, groups, and other service principals.Supports $expand.
     * @param value Value to set for the appRoleAssignedTo property.
     */
    public void setAppRoleAssignedTo(@jakarta.annotation.Nullable final java.util.List<AppRoleAssignment> value) {
        this.backingStore.set("appRoleAssignedTo", value);
    }
    /**
     * Sets the appRoleAssignmentRequired property value. Specifies whether users or other service principals need to be granted an app role assignment for this service principal before users can sign in or apps can get tokens. The default value is false. Not nullable. Supports $filter (eq, ne, NOT).
     * @param value Value to set for the appRoleAssignmentRequired property.
     */
    public void setAppRoleAssignmentRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("appRoleAssignmentRequired", value);
    }
    /**
     * Sets the appRoleAssignments property value. App role assignment for another app or service, granted to this service principal. Supports $expand.
     * @param value Value to set for the appRoleAssignments property.
     */
    public void setAppRoleAssignments(@jakarta.annotation.Nullable final java.util.List<AppRoleAssignment> value) {
        this.backingStore.set("appRoleAssignments", value);
    }
    /**
     * Sets the appRoles property value. The roles exposed by the application, which this service principal represents. For more information, see the appRoles property definition on the application entity. Not nullable.
     * @param value Value to set for the appRoles property.
     */
    public void setAppRoles(@jakarta.annotation.Nullable final java.util.List<AppRole> value) {
        this.backingStore.set("appRoles", value);
    }
    /**
     * Sets the claimsMappingPolicies property value. The claimsMappingPolicies assigned to this service principal. Supports $expand.
     * @param value Value to set for the claimsMappingPolicies property.
     */
    public void setClaimsMappingPolicies(@jakarta.annotation.Nullable final java.util.List<ClaimsMappingPolicy> value) {
        this.backingStore.set("claimsMappingPolicies", value);
    }
    /**
     * Sets the claimsPolicy property value. A claims policy that allows application admins to customize the claims that will be emitted in tokens affected by this policy.
     * @param value Value to set for the claimsPolicy property.
     */
    public void setClaimsPolicy(@jakarta.annotation.Nullable final CustomClaimsPolicy value) {
        this.backingStore.set("claimsPolicy", value);
    }
    /**
     * Sets the createdObjects property value. Directory objects created by this service principal. Read-only. Nullable.
     * @param value Value to set for the createdObjects property.
     */
    public void setCreatedObjects(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("createdObjects", value);
    }
    /**
     * Sets the customSecurityAttributes property value. An open complex type that holds the value of a custom security attribute that is assigned to a directory object. Nullable. Returned only on $select. Supports $filter (eq, ne, not, startsWith). Filter value is case sensitive.To read this property, the calling app must be assigned the CustomSecAttributeAssignment.Read.All permission. To write this property, the calling app must be assigned the CustomSecAttributeAssignment.ReadWrite.All permissions. To read or write this property in delegated scenarios, the admin must be assigned the Attribute Assignment Administrator role.
     * @param value Value to set for the customSecurityAttributes property.
     */
    public void setCustomSecurityAttributes(@jakarta.annotation.Nullable final CustomSecurityAttributeValue value) {
        this.backingStore.set("customSecurityAttributes", value);
    }
    /**
     * Sets the delegatedPermissionClassifications property value. The permission classifications for delegated permissions exposed by the app that this service principal represents. Supports $expand.
     * @param value Value to set for the delegatedPermissionClassifications property.
     */
    public void setDelegatedPermissionClassifications(@jakarta.annotation.Nullable final java.util.List<DelegatedPermissionClassification> value) {
        this.backingStore.set("delegatedPermissionClassifications", value);
    }
    /**
     * Sets the description property value. Free text field to provide an internal end-user facing description of the service principal. End-user portals such MyApps displays the application description in this field. The maximum allowed size is 1,024 characters. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the disabledByMicrosoftStatus property value. Specifies whether Microsoft has disabled the registered application. Possible values are: null (default value), NotDisabled, and DisabledDueToViolationOfServicesAgreement (reasons may include suspicious, abusive, or malicious activity, or a violation of the Microsoft Services Agreement).  Supports $filter (eq, ne, not).
     * @param value Value to set for the disabledByMicrosoftStatus property.
     */
    public void setDisabledByMicrosoftStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("disabledByMicrosoftStatus", value);
    }
    /**
     * Sets the displayName property value. The display name for the service principal. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the endpoints property value. Endpoints available for discovery. Services like Sharepoint populate this property with a tenant specific SharePoint endpoints that other applications can discover and use in their experiences.
     * @param value Value to set for the endpoints property.
     */
    public void setEndpoints(@jakarta.annotation.Nullable final java.util.List<Endpoint> value) {
        this.backingStore.set("endpoints", value);
    }
    /**
     * Sets the errorUrl property value. Deprecated. Don&apos;t use.
     * @param value Value to set for the errorUrl property.
     */
    public void setErrorUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("errorUrl", value);
    }
    /**
     * Sets the federatedIdentityCredentials property value. The federatedIdentityCredentials property
     * @param value Value to set for the federatedIdentityCredentials property.
     */
    public void setFederatedIdentityCredentials(@jakarta.annotation.Nullable final java.util.List<FederatedIdentityCredential> value) {
        this.backingStore.set("federatedIdentityCredentials", value);
    }
    /**
     * Sets the homepage property value. Home page or landing page of the application.
     * @param value Value to set for the homepage property.
     */
    public void setHomepage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("homepage", value);
    }
    /**
     * Sets the homeRealmDiscoveryPolicies property value. The homeRealmDiscoveryPolicies assigned to this service principal. Supports $expand.
     * @param value Value to set for the homeRealmDiscoveryPolicies property.
     */
    public void setHomeRealmDiscoveryPolicies(@jakarta.annotation.Nullable final java.util.List<HomeRealmDiscoveryPolicy> value) {
        this.backingStore.set("homeRealmDiscoveryPolicies", value);
    }
    /**
     * Sets the info property value. Basic profile information of the acquired application such as app&apos;s marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Microsoft Entra apps. Supports $filter (eq, ne, not, ge, le, and eq on null values).
     * @param value Value to set for the info property.
     */
    public void setInfo(@jakarta.annotation.Nullable final InformationalUrl value) {
        this.backingStore.set("info", value);
    }
    /**
     * Sets the keyCredentials property value. The collection of key credentials associated with the service principal. Not nullable. Supports $filter (eq, not, ge, le).
     * @param value Value to set for the keyCredentials property.
     */
    public void setKeyCredentials(@jakarta.annotation.Nullable final java.util.List<KeyCredential> value) {
        this.backingStore.set("keyCredentials", value);
    }
    /**
     * Sets the licenseDetails property value. The licenseDetails property
     * @param value Value to set for the licenseDetails property.
     */
    public void setLicenseDetails(@jakarta.annotation.Nullable final java.util.List<LicenseDetails> value) {
        this.backingStore.set("licenseDetails", value);
    }
    /**
     * Sets the loginUrl property value. Specifies the URL where the service provider redirects the user to Microsoft Entra ID to authenticate. Microsoft Entra ID uses the URL to launch the application from Microsoft 365 or the Microsoft Entra My Apps. When blank, Microsoft Entra ID performs IdP-initiated sign-on for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the Microsoft Entra My Apps, or the Microsoft Entra SSO URL.
     * @param value Value to set for the loginUrl property.
     */
    public void setLoginUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("loginUrl", value);
    }
    /**
     * Sets the logoutUrl property value. Specifies the URL that the Microsoft&apos;s authorization service uses to sign out a user using OpenId Connect front-channel, back-channel, or SAML sign out protocols.
     * @param value Value to set for the logoutUrl property.
     */
    public void setLogoutUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("logoutUrl", value);
    }
    /**
     * Sets the memberOf property value. Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable. Supports $expand.
     * @param value Value to set for the memberOf property.
     */
    public void setMemberOf(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("memberOf", value);
    }
    /**
     * Sets the notes property value. Free text field to capture information about the service principal, typically used for operational purposes. Maximum allowed size is 1,024 characters.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notes", value);
    }
    /**
     * Sets the notificationEmailAddresses property value. Specifies the list of email addresses where Microsoft Entra ID sends a notification when the active certificate is near the expiration date. This is only for the certificates used to sign the SAML token issued for Microsoft Entra Gallery applications.
     * @param value Value to set for the notificationEmailAddresses property.
     */
    public void setNotificationEmailAddresses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("notificationEmailAddresses", value);
    }
    /**
     * Sets the oauth2PermissionGrants property value. Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     * @param value Value to set for the oauth2PermissionGrants property.
     */
    public void setOauth2PermissionGrants(@jakarta.annotation.Nullable final java.util.List<OAuth2PermissionGrant> value) {
        this.backingStore.set("oauth2PermissionGrants", value);
    }
    /**
     * Sets the ownedObjects property value. Directory objects that are owned by this service principal. Read-only. Nullable. Supports $expand and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     * @param value Value to set for the ownedObjects property.
     */
    public void setOwnedObjects(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("ownedObjects", value);
    }
    /**
     * Sets the owners property value. Directory objects that are owners of this servicePrincipal. The owners are a set of nonadmin users or servicePrincipals who are allowed to modify this object. Supports $expand and $filter (/$count eq 0, /$count ne 0, /$count eq 1, /$count ne 1).
     * @param value Value to set for the owners property.
     */
    public void setOwners(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("owners", value);
    }
    /**
     * Sets the passwordCredentials property value. The collection of password credentials associated with the service principal. Not nullable.
     * @param value Value to set for the passwordCredentials property.
     */
    public void setPasswordCredentials(@jakarta.annotation.Nullable final java.util.List<PasswordCredential> value) {
        this.backingStore.set("passwordCredentials", value);
    }
    /**
     * Sets the passwordSingleSignOnSettings property value. The collection for settings related to password single sign-on. Use $select=passwordSingleSignOnSettings to read the property. Read-only for applicationTemplates except for custom applicationTemplates.
     * @param value Value to set for the passwordSingleSignOnSettings property.
     */
    public void setPasswordSingleSignOnSettings(@jakarta.annotation.Nullable final PasswordSingleSignOnSettings value) {
        this.backingStore.set("passwordSingleSignOnSettings", value);
    }
    /**
     * Sets the permissionGrantPreApprovalPolicies property value. The permissionGrantPreApprovalPolicies property
     * @param value Value to set for the permissionGrantPreApprovalPolicies property.
     */
    public void setPermissionGrantPreApprovalPolicies(@jakarta.annotation.Nullable final java.util.List<PermissionGrantPreApprovalPolicy> value) {
        this.backingStore.set("permissionGrantPreApprovalPolicies", value);
    }
    /**
     * Sets the preferredSingleSignOnMode property value. Specifies the single sign-on mode configured for this application. Microsoft Entra ID uses the preferred single sign-on mode to launch the application from Microsoft 365 or the Microsoft Entra My Apps. The supported values are password, saml, notSupported, and oidc. Note: This field might be null for older SAML apps and for OIDC applications where it isn&apos;t set automatically.
     * @param value Value to set for the preferredSingleSignOnMode property.
     */
    public void setPreferredSingleSignOnMode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preferredSingleSignOnMode", value);
    }
    /**
     * Sets the preferredTokenSigningKeyEndDateTime property value. Specifies the expiration date of the keyCredential used for token signing, marked by preferredTokenSigningKeyThumbprint. Updating this attribute isn&apos;t currently supported. For details, see ServicePrincipal property differences.
     * @param value Value to set for the preferredTokenSigningKeyEndDateTime property.
     */
    public void setPreferredTokenSigningKeyEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("preferredTokenSigningKeyEndDateTime", value);
    }
    /**
     * Sets the preferredTokenSigningKeyThumbprint property value. This property can be used on SAML applications (apps that have preferredSingleSignOnMode set to saml) to control which certificate is used to sign the SAML responses. For applications that aren&apos;t SAML, don&apos;t write or otherwise rely on this property.
     * @param value Value to set for the preferredTokenSigningKeyThumbprint property.
     */
    public void setPreferredTokenSigningKeyThumbprint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preferredTokenSigningKeyThumbprint", value);
    }
    /**
     * Sets the publishedPermissionScopes property value. The delegated permissions exposed by the application. For more information, see the oauth2PermissionScopes property on the application entity&apos;s api property. Not nullable. Note: This property is named oauth2PermissionScopes in v1.0.
     * @param value Value to set for the publishedPermissionScopes property.
     */
    public void setPublishedPermissionScopes(@jakarta.annotation.Nullable final java.util.List<PermissionScope> value) {
        this.backingStore.set("publishedPermissionScopes", value);
    }
    /**
     * Sets the publisherName property value. The name of the Microsoft Entra tenant that published the application.
     * @param value Value to set for the publisherName property.
     */
    public void setPublisherName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisherName", value);
    }
    /**
     * Sets the remoteDesktopSecurityConfiguration property value. The remoteDesktopSecurityConfiguration object applied to this service principal. Supports $filter (eq) for isRemoteDesktopProtocolEnabled property.
     * @param value Value to set for the remoteDesktopSecurityConfiguration property.
     */
    public void setRemoteDesktopSecurityConfiguration(@jakarta.annotation.Nullable final RemoteDesktopSecurityConfiguration value) {
        this.backingStore.set("remoteDesktopSecurityConfiguration", value);
    }
    /**
     * Sets the replyUrls property value. The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0 authorization codes and access tokens are sent to for the associated application. Not nullable.
     * @param value Value to set for the replyUrls property.
     */
    public void setReplyUrls(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("replyUrls", value);
    }
    /**
     * Sets the samlMetadataUrl property value. The url where the service exposes SAML metadata for federation.
     * @param value Value to set for the samlMetadataUrl property.
     */
    public void setSamlMetadataUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("samlMetadataUrl", value);
    }
    /**
     * Sets the samlSingleSignOnSettings property value. The collection for settings related to saml single sign-on.
     * @param value Value to set for the samlSingleSignOnSettings property.
     */
    public void setSamlSingleSignOnSettings(@jakarta.annotation.Nullable final SamlSingleSignOnSettings value) {
        this.backingStore.set("samlSingleSignOnSettings", value);
    }
    /**
     * Sets the servicePrincipalNames property value. Contains the list of identifiersUris, copied over from the associated application. More values can be added to hybrid applications. These values can be used to identify the permissions exposed by this app within Microsoft Entra ID. For example,Client apps can specify a resource URI that is based on the values of this property to acquire an access token, which is the URI returned in the &apos;aud&apos; claim.The any operator is required for filter expressions on multi-valued properties. Not nullable.  Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the servicePrincipalNames property.
     */
    public void setServicePrincipalNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("servicePrincipalNames", value);
    }
    /**
     * Sets the servicePrincipalType property value. Identifies if the service principal represents an application or a managed identity. This is set by Microsoft Entra ID internally. For a service principal that represents an application this is set as Application. For a service principal that represents a managed identity this is set as ManagedIdentity. The SocialIdp type is for internal use.
     * @param value Value to set for the servicePrincipalType property.
     */
    public void setServicePrincipalType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePrincipalType", value);
    }
    /**
     * Sets the signInAudience property value. Specifies the Microsoft accounts that are supported for the current application. Read-only. Supported values are:AzureADMyOrg: Users with a Microsoft work or school account in my organization&apos;s Microsoft Entra tenant (single-tenant).AzureADMultipleOrgs: Users with a Microsoft work or school account in any organization&apos;s Microsoft Entra tenant (multitenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any organization&apos;s Microsoft Entra tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
     * @param value Value to set for the signInAudience property.
     */
    public void setSignInAudience(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signInAudience", value);
    }
    /**
     * Sets the synchronization property value. Represents the capability for Microsoft Entra identity synchronization through the Microsoft Graph API.
     * @param value Value to set for the synchronization property.
     */
    public void setSynchronization(@jakarta.annotation.Nullable final Synchronization value) {
        this.backingStore.set("synchronization", value);
    }
    /**
     * Sets the tags property value. Custom strings that can be used to categorize and identify the service principal. Not nullable. The value is the union of strings set here and on the associated application entity&apos;s tags property.Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("tags", value);
    }
    /**
     * Sets the tokenEncryptionKeyId property value. Specifies the keyId of a public key from the keyCredentials collection. When configured, Microsoft Entra ID issues tokens for this application encrypted using the key specified by this property. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     * @param value Value to set for the tokenEncryptionKeyId property.
     */
    public void setTokenEncryptionKeyId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("tokenEncryptionKeyId", value);
    }
    /**
     * Sets the tokenIssuancePolicies property value. The tokenIssuancePolicies assigned to this service principal. Supports $expand.
     * @param value Value to set for the tokenIssuancePolicies property.
     */
    public void setTokenIssuancePolicies(@jakarta.annotation.Nullable final java.util.List<TokenIssuancePolicy> value) {
        this.backingStore.set("tokenIssuancePolicies", value);
    }
    /**
     * Sets the tokenLifetimePolicies property value. The tokenLifetimePolicies assigned to this service principal. Supports $expand.
     * @param value Value to set for the tokenLifetimePolicies property.
     */
    public void setTokenLifetimePolicies(@jakarta.annotation.Nullable final java.util.List<TokenLifetimePolicy> value) {
        this.backingStore.set("tokenLifetimePolicies", value);
    }
    /**
     * Sets the transitiveMemberOf property value. The transitiveMemberOf property
     * @param value Value to set for the transitiveMemberOf property.
     */
    public void setTransitiveMemberOf(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("transitiveMemberOf", value);
    }
    /**
     * Sets the verifiedPublisher property value. Specifies the verified publisher of the application that&apos;s linked to this service principal.
     * @param value Value to set for the verifiedPublisher property.
     */
    public void setVerifiedPublisher(@jakarta.annotation.Nullable final VerifiedPublisher value) {
        this.backingStore.set("verifiedPublisher", value);
    }
}
