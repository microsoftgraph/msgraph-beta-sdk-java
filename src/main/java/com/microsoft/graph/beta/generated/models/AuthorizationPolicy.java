package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthorizationPolicy extends PolicyBase implements Parsable {
    /**
     * Instantiates a new {@link AuthorizationPolicy} and sets the default values.
     */
    public AuthorizationPolicy() {
        super();
        this.setOdataType("#microsoft.graph.authorizationPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuthorizationPolicy}
     */
    @jakarta.annotation.Nonnull
    public static AuthorizationPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthorizationPolicy();
    }
    /**
     * Gets the allowedToSignUpEmailBasedSubscriptions property value. Indicates whether users can sign up for email based subscriptions.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowedToSignUpEmailBasedSubscriptions() {
        return this.backingStore.get("allowedToSignUpEmailBasedSubscriptions");
    }
    /**
     * Gets the allowedToUseSSPR property value. Indicates whether administrators of the tenant can use the Self-Service Password Reset (SSPR). For more information, see Self-service password reset for administrators.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowedToUseSSPR() {
        return this.backingStore.get("allowedToUseSSPR");
    }
    /**
     * Gets the allowEmailVerifiedUsersToJoinOrganization property value. Indicates whether a user can join the tenant by email validation.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowEmailVerifiedUsersToJoinOrganization() {
        return this.backingStore.get("allowEmailVerifiedUsersToJoinOrganization");
    }
    /**
     * Gets the allowInvitesFrom property value. Indicates who can invite guests to the organization. Possible values are: none, adminsAndGuestInviters, adminsGuestInvitersAndAllMembers, everyone. everyone is the default setting for all cloud environments except US Government. For more information, see allowInvitesFrom values.
     * @return a {@link AllowInvitesFrom}
     */
    @jakarta.annotation.Nullable
    public AllowInvitesFrom getAllowInvitesFrom() {
        return this.backingStore.get("allowInvitesFrom");
    }
    /**
     * Gets the allowUserConsentForRiskyApps property value. Indicates whether user consent for risky apps is allowed. Default value is false. We recommend that you keep the value set to false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowUserConsentForRiskyApps() {
        return this.backingStore.get("allowUserConsentForRiskyApps");
    }
    /**
     * Gets the blockMsolPowerShell property value. To disable the use of the MSOnline PowerShell module set this property to true. This also disables user-based access to the legacy service endpoint used by the MSOnline PowerShell module. This doesn't affect Microsoft Entra Connect or Microsoft Graph.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockMsolPowerShell() {
        return this.backingStore.get("blockMsolPowerShell");
    }
    /**
     * Gets the defaultUserRoleOverrides property value. The defaultUserRoleOverrides property
     * @return a {@link java.util.List<DefaultUserRoleOverride>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DefaultUserRoleOverride> getDefaultUserRoleOverrides() {
        return this.backingStore.get("defaultUserRoleOverrides");
    }
    /**
     * Gets the defaultUserRolePermissions property value. The defaultUserRolePermissions property
     * @return a {@link DefaultUserRolePermissions}
     */
    @jakarta.annotation.Nullable
    public DefaultUserRolePermissions getDefaultUserRolePermissions() {
        return this.backingStore.get("defaultUserRolePermissions");
    }
    /**
     * Gets the enabledPreviewFeatures property value. List of features enabled for private preview on the tenant.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEnabledPreviewFeatures() {
        return this.backingStore.get("enabledPreviewFeatures");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedToSignUpEmailBasedSubscriptions", (n) -> { this.setAllowedToSignUpEmailBasedSubscriptions(n.getBooleanValue()); });
        deserializerMap.put("allowedToUseSSPR", (n) -> { this.setAllowedToUseSSPR(n.getBooleanValue()); });
        deserializerMap.put("allowEmailVerifiedUsersToJoinOrganization", (n) -> { this.setAllowEmailVerifiedUsersToJoinOrganization(n.getBooleanValue()); });
        deserializerMap.put("allowInvitesFrom", (n) -> { this.setAllowInvitesFrom(n.getEnumValue(AllowInvitesFrom::forValue)); });
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
     * Gets the guestUserRoleId property value. Represents role templateId for the role that should be granted to guests. Refer to List unifiedRoleDefinitions to find the list of available role templates. Currently following roles are supported:  User (a0b1b346-4d3e-4e8b-98f8-753987be4970), Guest User (10dae51f-b6af-4016-8d66-8c2a99b929b3), and Restricted Guest User (2af84b1e-32c8-42b7-82bc-daa82404023b).
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getGuestUserRoleId() {
        return this.backingStore.get("guestUserRoleId");
    }
    /**
     * Gets the permissionGrantPolicyIdsAssignedToDefaultUserRole property value. Indicates if user consent to apps is allowed, and if it is, which app consent policy (permissionGrantPolicy) governs the permission for users to grant consent. Values should be in the format managePermissionGrantsForSelf.{id}, where {id} is the id of a built-in or custom app consent policy. An empty list indicates user consent to apps is disabled.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPermissionGrantPolicyIdsAssignedToDefaultUserRole() {
        return this.backingStore.get("permissionGrantPolicyIdsAssignedToDefaultUserRole");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAllowedToSignUpEmailBasedSubscriptions(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowedToSignUpEmailBasedSubscriptions", value);
    }
    /**
     * Sets the allowedToUseSSPR property value. Indicates whether administrators of the tenant can use the Self-Service Password Reset (SSPR). For more information, see Self-service password reset for administrators.
     * @param value Value to set for the allowedToUseSSPR property.
     */
    public void setAllowedToUseSSPR(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowedToUseSSPR", value);
    }
    /**
     * Sets the allowEmailVerifiedUsersToJoinOrganization property value. Indicates whether a user can join the tenant by email validation.
     * @param value Value to set for the allowEmailVerifiedUsersToJoinOrganization property.
     */
    public void setAllowEmailVerifiedUsersToJoinOrganization(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowEmailVerifiedUsersToJoinOrganization", value);
    }
    /**
     * Sets the allowInvitesFrom property value. Indicates who can invite guests to the organization. Possible values are: none, adminsAndGuestInviters, adminsGuestInvitersAndAllMembers, everyone. everyone is the default setting for all cloud environments except US Government. For more information, see allowInvitesFrom values.
     * @param value Value to set for the allowInvitesFrom property.
     */
    public void setAllowInvitesFrom(@jakarta.annotation.Nullable final AllowInvitesFrom value) {
        this.backingStore.set("allowInvitesFrom", value);
    }
    /**
     * Sets the allowUserConsentForRiskyApps property value. Indicates whether user consent for risky apps is allowed. Default value is false. We recommend that you keep the value set to false.
     * @param value Value to set for the allowUserConsentForRiskyApps property.
     */
    public void setAllowUserConsentForRiskyApps(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowUserConsentForRiskyApps", value);
    }
    /**
     * Sets the blockMsolPowerShell property value. To disable the use of the MSOnline PowerShell module set this property to true. This also disables user-based access to the legacy service endpoint used by the MSOnline PowerShell module. This doesn't affect Microsoft Entra Connect or Microsoft Graph.
     * @param value Value to set for the blockMsolPowerShell property.
     */
    public void setBlockMsolPowerShell(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("blockMsolPowerShell", value);
    }
    /**
     * Sets the defaultUserRoleOverrides property value. The defaultUserRoleOverrides property
     * @param value Value to set for the defaultUserRoleOverrides property.
     */
    public void setDefaultUserRoleOverrides(@jakarta.annotation.Nullable final java.util.List<DefaultUserRoleOverride> value) {
        this.backingStore.set("defaultUserRoleOverrides", value);
    }
    /**
     * Sets the defaultUserRolePermissions property value. The defaultUserRolePermissions property
     * @param value Value to set for the defaultUserRolePermissions property.
     */
    public void setDefaultUserRolePermissions(@jakarta.annotation.Nullable final DefaultUserRolePermissions value) {
        this.backingStore.set("defaultUserRolePermissions", value);
    }
    /**
     * Sets the enabledPreviewFeatures property value. List of features enabled for private preview on the tenant.
     * @param value Value to set for the enabledPreviewFeatures property.
     */
    public void setEnabledPreviewFeatures(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("enabledPreviewFeatures", value);
    }
    /**
     * Sets the guestUserRoleId property value. Represents role templateId for the role that should be granted to guests. Refer to List unifiedRoleDefinitions to find the list of available role templates. Currently following roles are supported:  User (a0b1b346-4d3e-4e8b-98f8-753987be4970), Guest User (10dae51f-b6af-4016-8d66-8c2a99b929b3), and Restricted Guest User (2af84b1e-32c8-42b7-82bc-daa82404023b).
     * @param value Value to set for the guestUserRoleId property.
     */
    public void setGuestUserRoleId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("guestUserRoleId", value);
    }
    /**
     * Sets the permissionGrantPolicyIdsAssignedToDefaultUserRole property value. Indicates if user consent to apps is allowed, and if it is, which app consent policy (permissionGrantPolicy) governs the permission for users to grant consent. Values should be in the format managePermissionGrantsForSelf.{id}, where {id} is the id of a built-in or custom app consent policy. An empty list indicates user consent to apps is disabled.
     * @param value Value to set for the permissionGrantPolicyIdsAssignedToDefaultUserRole property.
     */
    public void setPermissionGrantPolicyIdsAssignedToDefaultUserRole(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("permissionGrantPolicyIdsAssignedToDefaultUserRole", value);
    }
}
