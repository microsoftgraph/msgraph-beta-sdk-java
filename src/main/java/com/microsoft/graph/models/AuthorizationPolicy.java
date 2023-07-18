package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class AuthorizationPolicy extends PolicyBase implements Parsable {
    /**
     * Indicates whether users can sign up for email based subscriptions.
     */
    private Boolean allowedToSignUpEmailBasedSubscriptions;
    /**
     * Indicates whether the Admin Self-Serve Password Reset feature is enabled on the tenant.
     */
    private Boolean allowedToUseSSPR;
    /**
     * Indicates whether a user can join the tenant by email validation.
     */
    private Boolean allowEmailVerifiedUsersToJoinOrganization;
    /**
     * Indicates who can invite external users to the organization. Possible values are: none, adminsAndGuestInviters, adminsGuestInvitersAndAllMembers, everyone. everyone is the default setting for all cloud environments except US Government. See more in the table below.
     */
    private AllowInvitesFrom allowInvitesFrom;
    /**
     * Indicates whether user consent for risky apps is allowed. Default value is false. We recommend that you keep the value set to false.
     */
    private Boolean allowUserConsentForRiskyApps;
    /**
     * To disable the use of the MSOnline PowerShell module set this property to true. This will also disable user-based access to the legacy service endpoint used by the MSOnline PowerShell module. This does not affect Azure AD Connect or Microsoft Graph.
     */
    private Boolean blockMsolPowerShell;
    /**
     * The defaultUserRoleOverrides property
     */
    private java.util.List<DefaultUserRoleOverride> defaultUserRoleOverrides;
    /**
     * The defaultUserRolePermissions property
     */
    private DefaultUserRolePermissions defaultUserRolePermissions;
    /**
     * List of features enabled for private preview on the tenant.
     */
    private java.util.List<String> enabledPreviewFeatures;
    /**
     * Represents role templateId for the role that should be granted to guest user. Refer to List unifiedRoleDefinitions to find the list of available role templates. Currently following roles are supported:  User (a0b1b346-4d3e-4e8b-98f8-753987be4970), Guest User (10dae51f-b6af-4016-8d66-8c2a99b929b3), and Restricted Guest User (2af84b1e-32c8-42b7-82bc-daa82404023b).
     */
    private UUID guestUserRoleId;
    /**
     * Indicates if user consent to apps is allowed, and if it is, which app consent policy (permissionGrantPolicy) governs the permission for users to grant consent. Values should be in the format managePermissionGrantsForSelf.{id}, where {id} is the id of a built-in or custom app consent policy. An empty list indicates user consent to apps is disabled.
     */
    private java.util.List<String> permissionGrantPolicyIdsAssignedToDefaultUserRole;
    /**
     * Instantiates a new authorizationPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthorizationPolicy() {
        super();
        this.setOdataType("#microsoft.graph.authorizationPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authorizationPolicy
     */
    @javax.annotation.Nonnull
    public static AuthorizationPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthorizationPolicy();
    }
    /**
     * Gets the allowedToSignUpEmailBasedSubscriptions property value. Indicates whether users can sign up for email based subscriptions.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowedToSignUpEmailBasedSubscriptions() {
        return this.allowedToSignUpEmailBasedSubscriptions;
    }
    /**
     * Gets the allowedToUseSSPR property value. Indicates whether the Admin Self-Serve Password Reset feature is enabled on the tenant.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowedToUseSSPR() {
        return this.allowedToUseSSPR;
    }
    /**
     * Gets the allowEmailVerifiedUsersToJoinOrganization property value. Indicates whether a user can join the tenant by email validation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowEmailVerifiedUsersToJoinOrganization() {
        return this.allowEmailVerifiedUsersToJoinOrganization;
    }
    /**
     * Gets the allowInvitesFrom property value. Indicates who can invite external users to the organization. Possible values are: none, adminsAndGuestInviters, adminsGuestInvitersAndAllMembers, everyone. everyone is the default setting for all cloud environments except US Government. See more in the table below.
     * @return a allowInvitesFrom
     */
    @javax.annotation.Nullable
    public AllowInvitesFrom getAllowInvitesFrom() {
        return this.allowInvitesFrom;
    }
    /**
     * Gets the allowUserConsentForRiskyApps property value. Indicates whether user consent for risky apps is allowed. Default value is false. We recommend that you keep the value set to false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowUserConsentForRiskyApps() {
        return this.allowUserConsentForRiskyApps;
    }
    /**
     * Gets the blockMsolPowerShell property value. To disable the use of the MSOnline PowerShell module set this property to true. This will also disable user-based access to the legacy service endpoint used by the MSOnline PowerShell module. This does not affect Azure AD Connect or Microsoft Graph.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockMsolPowerShell() {
        return this.blockMsolPowerShell;
    }
    /**
     * Gets the defaultUserRoleOverrides property value. The defaultUserRoleOverrides property
     * @return a defaultUserRoleOverride
     */
    @javax.annotation.Nullable
    public java.util.List<DefaultUserRoleOverride> getDefaultUserRoleOverrides() {
        return this.defaultUserRoleOverrides;
    }
    /**
     * Gets the defaultUserRolePermissions property value. The defaultUserRolePermissions property
     * @return a defaultUserRolePermissions
     */
    @javax.annotation.Nullable
    public DefaultUserRolePermissions getDefaultUserRolePermissions() {
        return this.defaultUserRolePermissions;
    }
    /**
     * Gets the enabledPreviewFeatures property value. List of features enabled for private preview on the tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getEnabledPreviewFeatures() {
        return this.enabledPreviewFeatures;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedToSignUpEmailBasedSubscriptions", (n) -> { this.setAllowedToSignUpEmailBasedSubscriptions(n.getBooleanValue()); });
        deserializerMap.put("allowedToUseSSPR", (n) -> { this.setAllowedToUseSSPR(n.getBooleanValue()); });
        deserializerMap.put("allowEmailVerifiedUsersToJoinOrganization", (n) -> { this.setAllowEmailVerifiedUsersToJoinOrganization(n.getBooleanValue()); });
        deserializerMap.put("allowInvitesFrom", (n) -> { this.setAllowInvitesFrom(n.getEnumValue(AllowInvitesFrom.class)); });
        deserializerMap.put("allowUserConsentForRiskyApps", (n) -> { this.setAllowUserConsentForRiskyApps(n.getBooleanValue()); });
        deserializerMap.put("blockMsolPowerShell", (n) -> { this.setBlockMsolPowerShell(n.getBooleanValue()); });
        deserializerMap.put("defaultUserRoleOverrides", (n) -> { this.setDefaultUserRoleOverrides(n.getCollectionOfObjectValues(DefaultUserRoleOverride::createFromDiscriminatorValue)); });
        deserializerMap.put("defaultUserRolePermissions", (n) -> { this.setDefaultUserRolePermissions(n.getObjectValue(DefaultUserRolePermissions::createFromDiscriminatorValue)); });
        deserializerMap.put("enabledPreviewFeatures", (n) -> { this.setEnabledPreviewFeatures(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("guestUserRoleId", (n) -> { this.setGuestUserRoleId(n.getUUIDValue()); });
        deserializerMap.put("permissionGrantPolicyIdsAssignedToDefaultUserRole", (n) -> { this.setPermissionGrantPolicyIdsAssignedToDefaultUserRole(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the guestUserRoleId property value. Represents role templateId for the role that should be granted to guest user. Refer to List unifiedRoleDefinitions to find the list of available role templates. Currently following roles are supported:  User (a0b1b346-4d3e-4e8b-98f8-753987be4970), Guest User (10dae51f-b6af-4016-8d66-8c2a99b929b3), and Restricted Guest User (2af84b1e-32c8-42b7-82bc-daa82404023b).
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getGuestUserRoleId() {
        return this.guestUserRoleId;
    }
    /**
     * Gets the permissionGrantPolicyIdsAssignedToDefaultUserRole property value. Indicates if user consent to apps is allowed, and if it is, which app consent policy (permissionGrantPolicy) governs the permission for users to grant consent. Values should be in the format managePermissionGrantsForSelf.{id}, where {id} is the id of a built-in or custom app consent policy. An empty list indicates user consent to apps is disabled.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPermissionGrantPolicyIdsAssignedToDefaultUserRole() {
        return this.permissionGrantPolicyIdsAssignedToDefaultUserRole;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowedToSignUpEmailBasedSubscriptions", this.getAllowedToSignUpEmailBasedSubscriptions());
        writer.writeBooleanValue("allowedToUseSSPR", this.getAllowedToUseSSPR());
        writer.writeBooleanValue("allowEmailVerifiedUsersToJoinOrganization", this.getAllowEmailVerifiedUsersToJoinOrganization());
        writer.writeEnumValue("allowInvitesFrom", this.getAllowInvitesFrom());
        writer.writeBooleanValue("allowUserConsentForRiskyApps", this.getAllowUserConsentForRiskyApps());
        writer.writeBooleanValue("blockMsolPowerShell", this.getBlockMsolPowerShell());
        writer.writeCollectionOfObjectValues("defaultUserRoleOverrides", this.getDefaultUserRoleOverrides());
        writer.writeObjectValue("defaultUserRolePermissions", this.getDefaultUserRolePermissions());
        writer.writeCollectionOfPrimitiveValues("enabledPreviewFeatures", this.getEnabledPreviewFeatures());
        writer.writeUUIDValue("guestUserRoleId", this.getGuestUserRoleId());
        writer.writeCollectionOfPrimitiveValues("permissionGrantPolicyIdsAssignedToDefaultUserRole", this.getPermissionGrantPolicyIdsAssignedToDefaultUserRole());
    }
    /**
     * Sets the allowedToSignUpEmailBasedSubscriptions property value. Indicates whether users can sign up for email based subscriptions.
     * @param value Value to set for the allowedToSignUpEmailBasedSubscriptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedToSignUpEmailBasedSubscriptions(@javax.annotation.Nullable final Boolean value) {
        this.allowedToSignUpEmailBasedSubscriptions = value;
    }
    /**
     * Sets the allowedToUseSSPR property value. Indicates whether the Admin Self-Serve Password Reset feature is enabled on the tenant.
     * @param value Value to set for the allowedToUseSSPR property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedToUseSSPR(@javax.annotation.Nullable final Boolean value) {
        this.allowedToUseSSPR = value;
    }
    /**
     * Sets the allowEmailVerifiedUsersToJoinOrganization property value. Indicates whether a user can join the tenant by email validation.
     * @param value Value to set for the allowEmailVerifiedUsersToJoinOrganization property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowEmailVerifiedUsersToJoinOrganization(@javax.annotation.Nullable final Boolean value) {
        this.allowEmailVerifiedUsersToJoinOrganization = value;
    }
    /**
     * Sets the allowInvitesFrom property value. Indicates who can invite external users to the organization. Possible values are: none, adminsAndGuestInviters, adminsGuestInvitersAndAllMembers, everyone. everyone is the default setting for all cloud environments except US Government. See more in the table below.
     * @param value Value to set for the allowInvitesFrom property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowInvitesFrom(@javax.annotation.Nullable final AllowInvitesFrom value) {
        this.allowInvitesFrom = value;
    }
    /**
     * Sets the allowUserConsentForRiskyApps property value. Indicates whether user consent for risky apps is allowed. Default value is false. We recommend that you keep the value set to false.
     * @param value Value to set for the allowUserConsentForRiskyApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowUserConsentForRiskyApps(@javax.annotation.Nullable final Boolean value) {
        this.allowUserConsentForRiskyApps = value;
    }
    /**
     * Sets the blockMsolPowerShell property value. To disable the use of the MSOnline PowerShell module set this property to true. This will also disable user-based access to the legacy service endpoint used by the MSOnline PowerShell module. This does not affect Azure AD Connect or Microsoft Graph.
     * @param value Value to set for the blockMsolPowerShell property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlockMsolPowerShell(@javax.annotation.Nullable final Boolean value) {
        this.blockMsolPowerShell = value;
    }
    /**
     * Sets the defaultUserRoleOverrides property value. The defaultUserRoleOverrides property
     * @param value Value to set for the defaultUserRoleOverrides property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultUserRoleOverrides(@javax.annotation.Nullable final java.util.List<DefaultUserRoleOverride> value) {
        this.defaultUserRoleOverrides = value;
    }
    /**
     * Sets the defaultUserRolePermissions property value. The defaultUserRolePermissions property
     * @param value Value to set for the defaultUserRolePermissions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultUserRolePermissions(@javax.annotation.Nullable final DefaultUserRolePermissions value) {
        this.defaultUserRolePermissions = value;
    }
    /**
     * Sets the enabledPreviewFeatures property value. List of features enabled for private preview on the tenant.
     * @param value Value to set for the enabledPreviewFeatures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabledPreviewFeatures(@javax.annotation.Nullable final java.util.List<String> value) {
        this.enabledPreviewFeatures = value;
    }
    /**
     * Sets the guestUserRoleId property value. Represents role templateId for the role that should be granted to guest user. Refer to List unifiedRoleDefinitions to find the list of available role templates. Currently following roles are supported:  User (a0b1b346-4d3e-4e8b-98f8-753987be4970), Guest User (10dae51f-b6af-4016-8d66-8c2a99b929b3), and Restricted Guest User (2af84b1e-32c8-42b7-82bc-daa82404023b).
     * @param value Value to set for the guestUserRoleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGuestUserRoleId(@javax.annotation.Nullable final UUID value) {
        this.guestUserRoleId = value;
    }
    /**
     * Sets the permissionGrantPolicyIdsAssignedToDefaultUserRole property value. Indicates if user consent to apps is allowed, and if it is, which app consent policy (permissionGrantPolicy) governs the permission for users to grant consent. Values should be in the format managePermissionGrantsForSelf.{id}, where {id} is the id of a built-in or custom app consent policy. An empty list indicates user consent to apps is disabled.
     * @param value Value to set for the permissionGrantPolicyIdsAssignedToDefaultUserRole property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermissionGrantPolicyIdsAssignedToDefaultUserRole(@javax.annotation.Nullable final java.util.List<String> value) {
        this.permissionGrantPolicyIdsAssignedToDefaultUserRole = value;
    }
}
