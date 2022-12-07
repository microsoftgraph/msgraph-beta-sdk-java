package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GovernanceRoleSetting extends Entity implements Parsable {
    /** The rule settings that are evaluated when an administrator tries to add an eligible role assignment. */
    private java.util.List<GovernanceRuleSetting> _adminEligibleSettings;
    /** The rule settings that are evaluated when an administrator tries to add a direct member role assignment. */
    private java.util.List<GovernanceRuleSetting> _adminMemberSettings;
    /** Read-only. Indicate if the roleSetting is a default roleSetting */
    private Boolean _isDefault;
    /** Read-only. The display name of the administrator who last updated the roleSetting. */
    private String _lastUpdatedBy;
    /** Read-only. The time when the role setting was last updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime _lastUpdatedDateTime;
    /** Read-only. The associated resource for this role setting. */
    private GovernanceResource _resource;
    /** Required. The id of the resource that the role setting is associated with. */
    private String _resourceId;
    /** Read-only. The role definition that is enforced with this role setting. */
    private GovernanceRoleDefinition _roleDefinition;
    /** Required. The id of the role definition that the role setting is associated with. */
    private String _roleDefinitionId;
    /** The rule settings that are evaluated when a user tries to add an eligible role assignment. The setting is not supported for now. */
    private java.util.List<GovernanceRuleSetting> _userEligibleSettings;
    /** The rule settings that are evaluated when a user tries to activate his role assignment. */
    private java.util.List<GovernanceRuleSetting> _userMemberSettings;
    /**
     * Instantiates a new governanceRoleSetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GovernanceRoleSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a governanceRoleSetting
     */
    @javax.annotation.Nonnull
    public static GovernanceRoleSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GovernanceRoleSetting();
    }
    /**
     * Gets the adminEligibleSettings property value. The rule settings that are evaluated when an administrator tries to add an eligible role assignment.
     * @return a governanceRuleSetting
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRuleSetting> getAdminEligibleSettings() {
        return this._adminEligibleSettings;
    }
    /**
     * Gets the adminMemberSettings property value. The rule settings that are evaluated when an administrator tries to add a direct member role assignment.
     * @return a governanceRuleSetting
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRuleSetting> getAdminMemberSettings() {
        return this._adminMemberSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefault() {
        return this._isDefault;
    }
    /**
     * Gets the lastUpdatedBy property value. Read-only. The display name of the administrator who last updated the roleSetting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastUpdatedBy() {
        return this._lastUpdatedBy;
    }
    /**
     * Gets the lastUpdatedDateTime property value. Read-only. The time when the role setting was last updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the resource property value. Read-only. The associated resource for this role setting.
     * @return a governanceResource
     */
    @javax.annotation.Nullable
    public GovernanceResource getResource() {
        return this._resource;
    }
    /**
     * Gets the resourceId property value. Required. The id of the resource that the role setting is associated with.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return this._resourceId;
    }
    /**
     * Gets the roleDefinition property value. Read-only. The role definition that is enforced with this role setting.
     * @return a governanceRoleDefinition
     */
    @javax.annotation.Nullable
    public GovernanceRoleDefinition getRoleDefinition() {
        return this._roleDefinition;
    }
    /**
     * Gets the roleDefinitionId property value. Required. The id of the role definition that the role setting is associated with.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleDefinitionId() {
        return this._roleDefinitionId;
    }
    /**
     * Gets the userEligibleSettings property value. The rule settings that are evaluated when a user tries to add an eligible role assignment. The setting is not supported for now.
     * @return a governanceRuleSetting
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRuleSetting> getUserEligibleSettings() {
        return this._userEligibleSettings;
    }
    /**
     * Gets the userMemberSettings property value. The rule settings that are evaluated when a user tries to activate his role assignment.
     * @return a governanceRuleSetting
     */
    @javax.annotation.Nullable
    public java.util.List<GovernanceRuleSetting> getUserMemberSettings() {
        return this._userMemberSettings;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdminEligibleSettings(@javax.annotation.Nullable final java.util.List<GovernanceRuleSetting> value) {
        this._adminEligibleSettings = value;
    }
    /**
     * Sets the adminMemberSettings property value. The rule settings that are evaluated when an administrator tries to add a direct member role assignment.
     * @param value Value to set for the adminMemberSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdminMemberSettings(@javax.annotation.Nullable final java.util.List<GovernanceRuleSetting> value) {
        this._adminMemberSettings = value;
    }
    /**
     * Sets the isDefault property value. Read-only. Indicate if the roleSetting is a default roleSetting
     * @param value Value to set for the isDefault property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefault(@javax.annotation.Nullable final Boolean value) {
        this._isDefault = value;
    }
    /**
     * Sets the lastUpdatedBy property value. Read-only. The display name of the administrator who last updated the roleSetting.
     * @param value Value to set for the lastUpdatedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedBy(@javax.annotation.Nullable final String value) {
        this._lastUpdatedBy = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Read-only. The time when the role setting was last updated. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the resource property value. Read-only. The associated resource for this role setting.
     * @param value Value to set for the resource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResource(@javax.annotation.Nullable final GovernanceResource value) {
        this._resource = value;
    }
    /**
     * Sets the resourceId property value. Required. The id of the resource that the role setting is associated with.
     * @param value Value to set for the resourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceId(@javax.annotation.Nullable final String value) {
        this._resourceId = value;
    }
    /**
     * Sets the roleDefinition property value. Read-only. The role definition that is enforced with this role setting.
     * @param value Value to set for the roleDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinition(@javax.annotation.Nullable final GovernanceRoleDefinition value) {
        this._roleDefinition = value;
    }
    /**
     * Sets the roleDefinitionId property value. Required. The id of the role definition that the role setting is associated with.
     * @param value Value to set for the roleDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleDefinitionId(@javax.annotation.Nullable final String value) {
        this._roleDefinitionId = value;
    }
    /**
     * Sets the userEligibleSettings property value. The rule settings that are evaluated when a user tries to add an eligible role assignment. The setting is not supported for now.
     * @param value Value to set for the userEligibleSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserEligibleSettings(@javax.annotation.Nullable final java.util.List<GovernanceRuleSetting> value) {
        this._userEligibleSettings = value;
    }
    /**
     * Sets the userMemberSettings property value. The rule settings that are evaluated when a user tries to activate his role assignment.
     * @param value Value to set for the userMemberSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserMemberSettings(@javax.annotation.Nullable final java.util.List<GovernanceRuleSetting> value) {
        this._userMemberSettings = value;
    }
}
