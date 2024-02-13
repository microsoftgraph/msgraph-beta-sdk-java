package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GovernanceRoleSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link GovernanceRoleSetting} and sets the default values.
     */
    public GovernanceRoleSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GovernanceRoleSetting}
     */
    @jakarta.annotation.Nonnull
    public static GovernanceRoleSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceRoleSetting();
    }
    /**
     * Gets the adminEligibleSettings property value. The rule settings that are evaluated when an administrator tries to add an eligible role assignment.
     * @return a {@link java.util.List<GovernanceRuleSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceRuleSetting> getAdminEligibleSettings() {
        return this.backingStore.get("adminEligibleSettings");
    }
    /**
     * Gets the adminMemberSettings property value. The rule settings that are evaluated when an administrator tries to add a direct member role assignment.
     * @return a {@link java.util.List<GovernanceRuleSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceRuleSetting> getAdminMemberSettings() {
        return this.backingStore.get("adminMemberSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("adminEligibleSettings", (n) -> { this.setAdminEligibleSettings(n.getCollectionOfObjectValues(GovernanceRuleSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("adminMemberSettings", (n) -> { this.setAdminMemberSettings(n.getCollectionOfObjectValues(GovernanceRuleSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("lastUpdatedBy", (n) -> { this.setLastUpdatedBy(n.getStringValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resource", (n) -> { this.setResource(n.getObjectValue(GovernanceResource::createFromDiscriminatorValue)); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("roleDefinition", (n) -> { this.setRoleDefinition(n.getObjectValue(GovernanceRoleDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("roleDefinitionId", (n) -> { this.setRoleDefinitionId(n.getStringValue()); });
        deserializerMap.put("userEligibleSettings", (n) -> { this.setUserEligibleSettings(n.getCollectionOfObjectValues(GovernanceRuleSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("userMemberSettings", (n) -> { this.setUserMemberSettings(n.getCollectionOfObjectValues(GovernanceRuleSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isDefault property value. Read-only. Indicate if the roleSetting is a default roleSetting
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.backingStore.get("isDefault");
    }
    /**
     * Gets the lastUpdatedBy property value. Read-only. The display name of the administrator who last updated the roleSetting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastUpdatedBy() {
        return this.backingStore.get("lastUpdatedBy");
    }
    /**
     * Gets the lastUpdatedDateTime property value. Read-only. The time when the role setting was last updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.backingStore.get("lastUpdatedDateTime");
    }
    /**
     * Gets the resource property value. Read-only. The associated resource for this role setting.
     * @return a {@link GovernanceResource}
     */
    @jakarta.annotation.Nullable
    public GovernanceResource getResource() {
        return this.backingStore.get("resource");
    }
    /**
     * Gets the resourceId property value. Required. The id of the resource that the role setting is associated with.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.backingStore.get("resourceId");
    }
    /**
     * Gets the roleDefinition property value. Read-only. The role definition that is enforced with this role setting.
     * @return a {@link GovernanceRoleDefinition}
     */
    @jakarta.annotation.Nullable
    public GovernanceRoleDefinition getRoleDefinition() {
        return this.backingStore.get("roleDefinition");
    }
    /**
     * Gets the roleDefinitionId property value. Required. The id of the role definition that the role setting is associated with.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoleDefinitionId() {
        return this.backingStore.get("roleDefinitionId");
    }
    /**
     * Gets the userEligibleSettings property value. The rule settings that are evaluated when a user tries to add an eligible role assignment. The setting is not supported for now.
     * @return a {@link java.util.List<GovernanceRuleSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceRuleSetting> getUserEligibleSettings() {
        return this.backingStore.get("userEligibleSettings");
    }
    /**
     * Gets the userMemberSettings property value. The rule settings that are evaluated when a user tries to activate his role assignment.
     * @return a {@link java.util.List<GovernanceRuleSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<GovernanceRuleSetting> getUserMemberSettings() {
        return this.backingStore.get("userMemberSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("adminEligibleSettings", this.getAdminEligibleSettings());
        writer.writeCollectionOfObjectValues("adminMemberSettings", this.getAdminMemberSettings());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeStringValue("lastUpdatedBy", this.getLastUpdatedBy());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeObjectValue("resource", this.getResource());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeObjectValue("roleDefinition", this.getRoleDefinition());
        writer.writeStringValue("roleDefinitionId", this.getRoleDefinitionId());
        writer.writeCollectionOfObjectValues("userEligibleSettings", this.getUserEligibleSettings());
        writer.writeCollectionOfObjectValues("userMemberSettings", this.getUserMemberSettings());
    }
    /**
     * Sets the adminEligibleSettings property value. The rule settings that are evaluated when an administrator tries to add an eligible role assignment.
     * @param value Value to set for the adminEligibleSettings property.
     */
    public void setAdminEligibleSettings(@jakarta.annotation.Nullable final java.util.List<GovernanceRuleSetting> value) {
        this.backingStore.set("adminEligibleSettings", value);
    }
    /**
     * Sets the adminMemberSettings property value. The rule settings that are evaluated when an administrator tries to add a direct member role assignment.
     * @param value Value to set for the adminMemberSettings property.
     */
    public void setAdminMemberSettings(@jakarta.annotation.Nullable final java.util.List<GovernanceRuleSetting> value) {
        this.backingStore.set("adminMemberSettings", value);
    }
    /**
     * Sets the isDefault property value. Read-only. Indicate if the roleSetting is a default roleSetting
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDefault", value);
    }
    /**
     * Sets the lastUpdatedBy property value. Read-only. The display name of the administrator who last updated the roleSetting.
     * @param value Value to set for the lastUpdatedBy property.
     */
    public void setLastUpdatedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastUpdatedBy", value);
    }
    /**
     * Sets the lastUpdatedDateTime property value. Read-only. The time when the role setting was last updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastUpdatedDateTime", value);
    }
    /**
     * Sets the resource property value. Read-only. The associated resource for this role setting.
     * @param value Value to set for the resource property.
     */
    public void setResource(@jakarta.annotation.Nullable final GovernanceResource value) {
        this.backingStore.set("resource", value);
    }
    /**
     * Sets the resourceId property value. Required. The id of the resource that the role setting is associated with.
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceId", value);
    }
    /**
     * Sets the roleDefinition property value. Read-only. The role definition that is enforced with this role setting.
     * @param value Value to set for the roleDefinition property.
     */
    public void setRoleDefinition(@jakarta.annotation.Nullable final GovernanceRoleDefinition value) {
        this.backingStore.set("roleDefinition", value);
    }
    /**
     * Sets the roleDefinitionId property value. Required. The id of the role definition that the role setting is associated with.
     * @param value Value to set for the roleDefinitionId property.
     */
    public void setRoleDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("roleDefinitionId", value);
    }
    /**
     * Sets the userEligibleSettings property value. The rule settings that are evaluated when a user tries to add an eligible role assignment. The setting is not supported for now.
     * @param value Value to set for the userEligibleSettings property.
     */
    public void setUserEligibleSettings(@jakarta.annotation.Nullable final java.util.List<GovernanceRuleSetting> value) {
        this.backingStore.set("userEligibleSettings", value);
    }
    /**
     * Sets the userMemberSettings property value. The rule settings that are evaluated when a user tries to activate his role assignment.
     * @param value Value to set for the userMemberSettings property.
     */
    public void setUserMemberSettings(@jakarta.annotation.Nullable final java.util.List<GovernanceRuleSetting> value) {
        this.backingStore.set("userMemberSettings", value);
    }
}
