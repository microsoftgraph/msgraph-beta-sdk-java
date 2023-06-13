package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementIntent extends Entity implements Parsable {
    /** Collection of assignments */
    private java.util.List<DeviceManagementIntentAssignment> assignments;
    /** Collection of setting categories within the intent */
    private java.util.List<DeviceManagementIntentSettingCategory> categories;
    /** The user given description */
    private String description;
    /** Collection of settings and their states and counts of devices that belong to corresponding state for all settings within the intent */
    private java.util.List<DeviceManagementIntentDeviceSettingStateSummary> deviceSettingStateSummaries;
    /** Collection of states of all devices that the intent is applied to */
    private java.util.List<DeviceManagementIntentDeviceState> deviceStates;
    /** A summary of device states and counts of devices that belong to corresponding state for all devices that the intent is applied to */
    private DeviceManagementIntentDeviceStateSummary deviceStateSummary;
    /** The user given display name */
    private String displayName;
    /** Signifies whether or not the intent is assigned to users */
    private Boolean isAssigned;
    /** Signifies whether or not the intent is being migrated to the configurationPolicies endpoint */
    private Boolean isMigratingToConfigurationPolicy;
    /** When the intent was last modified */
    private OffsetDateTime lastModifiedDateTime;
    /** List of Scope Tags for this Entity instance. */
    private java.util.List<String> roleScopeTagIds;
    /** Collection of all settings to be applied */
    private java.util.List<DeviceManagementSettingInstance> settings;
    /** The ID of the template this intent was created from (if any) */
    private String templateId;
    /** Collection of states of all users that the intent is applied to */
    private java.util.List<DeviceManagementIntentUserState> userStates;
    /** A summary of user states and counts of users that belong to corresponding state for all users that the intent is applied to */
    private DeviceManagementIntentUserStateSummary userStateSummary;
    /**
     * Instantiates a new DeviceManagementIntent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementIntent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementIntent
     */
    @javax.annotation.Nonnull
    public static DeviceManagementIntent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementIntent();
    }
    /**
     * Gets the assignments property value. Collection of assignments
     * @return a deviceManagementIntentAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementIntentAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * Gets the categories property value. Collection of setting categories within the intent
     * @return a deviceManagementIntentSettingCategory
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementIntentSettingCategory> getCategories() {
        return this.categories;
    }
    /**
     * Gets the description property value. The user given description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the deviceSettingStateSummaries property value. Collection of settings and their states and counts of devices that belong to corresponding state for all settings within the intent
     * @return a deviceManagementIntentDeviceSettingStateSummary
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementIntentDeviceSettingStateSummary> getDeviceSettingStateSummaries() {
        return this.deviceSettingStateSummaries;
    }
    /**
     * Gets the deviceStates property value. Collection of states of all devices that the intent is applied to
     * @return a deviceManagementIntentDeviceState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementIntentDeviceState> getDeviceStates() {
        return this.deviceStates;
    }
    /**
     * Gets the deviceStateSummary property value. A summary of device states and counts of devices that belong to corresponding state for all devices that the intent is applied to
     * @return a deviceManagementIntentDeviceStateSummary
     */
    @javax.annotation.Nullable
    public DeviceManagementIntentDeviceStateSummary getDeviceStateSummary() {
        return this.deviceStateSummary;
    }
    /**
     * Gets the displayName property value. The user given display name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(DeviceManagementIntentAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfObjectValues(DeviceManagementIntentSettingCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceSettingStateSummaries", (n) -> { this.setDeviceSettingStateSummaries(n.getCollectionOfObjectValues(DeviceManagementIntentDeviceSettingStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStates", (n) -> { this.setDeviceStates(n.getCollectionOfObjectValues(DeviceManagementIntentDeviceState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStateSummary", (n) -> { this.setDeviceStateSummary(n.getObjectValue(DeviceManagementIntentDeviceStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isAssigned", (n) -> { this.setIsAssigned(n.getBooleanValue()); });
        deserializerMap.put("isMigratingToConfigurationPolicy", (n) -> { this.setIsMigratingToConfigurationPolicy(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getCollectionOfObjectValues(DeviceManagementSettingInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("templateId", (n) -> { this.setTemplateId(n.getStringValue()); });
        deserializerMap.put("userStates", (n) -> { this.setUserStates(n.getCollectionOfObjectValues(DeviceManagementIntentUserState::createFromDiscriminatorValue)); });
        deserializerMap.put("userStateSummary", (n) -> { this.setUserStateSummary(n.getObjectValue(DeviceManagementIntentUserStateSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isAssigned property value. Signifies whether or not the intent is assigned to users
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAssigned() {
        return this.isAssigned;
    }
    /**
     * Gets the isMigratingToConfigurationPolicy property value. Signifies whether or not the intent is being migrated to the configurationPolicies endpoint
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMigratingToConfigurationPolicy() {
        return this.isMigratingToConfigurationPolicy;
    }
    /**
     * Gets the lastModifiedDateTime property value. When the intent was last modified
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the settings property value. Collection of all settings to be applied
     * @return a deviceManagementSettingInstance
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementSettingInstance> getSettings() {
        return this.settings;
    }
    /**
     * Gets the templateId property value. The ID of the template this intent was created from (if any)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateId() {
        return this.templateId;
    }
    /**
     * Gets the userStates property value. Collection of states of all users that the intent is applied to
     * @return a deviceManagementIntentUserState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementIntentUserState> getUserStates() {
        return this.userStates;
    }
    /**
     * Gets the userStateSummary property value. A summary of user states and counts of users that belong to corresponding state for all users that the intent is applied to
     * @return a deviceManagementIntentUserStateSummary
     */
    @javax.annotation.Nullable
    public DeviceManagementIntentUserStateSummary getUserStateSummary() {
        return this.userStateSummary;
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
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeCollectionOfObjectValues("categories", this.getCategories());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfObjectValues("deviceSettingStateSummaries", this.getDeviceSettingStateSummaries());
        writer.writeCollectionOfObjectValues("deviceStates", this.getDeviceStates());
        writer.writeObjectValue("deviceStateSummary", this.getDeviceStateSummary());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isAssigned", this.getIsAssigned());
        writer.writeBooleanValue("isMigratingToConfigurationPolicy", this.getIsMigratingToConfigurationPolicy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeCollectionOfObjectValues("settings", this.getSettings());
        writer.writeStringValue("templateId", this.getTemplateId());
        writer.writeCollectionOfObjectValues("userStates", this.getUserStates());
        writer.writeObjectValue("userStateSummary", this.getUserStateSummary());
    }
    /**
     * Sets the assignments property value. Collection of assignments
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<DeviceManagementIntentAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the categories property value. Collection of setting categories within the intent
     * @param value Value to set for the categories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategories(@javax.annotation.Nullable final java.util.List<DeviceManagementIntentSettingCategory> value) {
        this.categories = value;
    }
    /**
     * Sets the description property value. The user given description
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the deviceSettingStateSummaries property value. Collection of settings and their states and counts of devices that belong to corresponding state for all settings within the intent
     * @param value Value to set for the deviceSettingStateSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceSettingStateSummaries(@javax.annotation.Nullable final java.util.List<DeviceManagementIntentDeviceSettingStateSummary> value) {
        this.deviceSettingStateSummaries = value;
    }
    /**
     * Sets the deviceStates property value. Collection of states of all devices that the intent is applied to
     * @param value Value to set for the deviceStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStates(@javax.annotation.Nullable final java.util.List<DeviceManagementIntentDeviceState> value) {
        this.deviceStates = value;
    }
    /**
     * Sets the deviceStateSummary property value. A summary of device states and counts of devices that belong to corresponding state for all devices that the intent is applied to
     * @param value Value to set for the deviceStateSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStateSummary(@javax.annotation.Nullable final DeviceManagementIntentDeviceStateSummary value) {
        this.deviceStateSummary = value;
    }
    /**
     * Sets the displayName property value. The user given display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isAssigned property value. Signifies whether or not the intent is assigned to users
     * @param value Value to set for the isAssigned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAssigned(@javax.annotation.Nullable final Boolean value) {
        this.isAssigned = value;
    }
    /**
     * Sets the isMigratingToConfigurationPolicy property value. Signifies whether or not the intent is being migrated to the configurationPolicies endpoint
     * @param value Value to set for the isMigratingToConfigurationPolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMigratingToConfigurationPolicy(@javax.annotation.Nullable final Boolean value) {
        this.isMigratingToConfigurationPolicy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. When the intent was last modified
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the settings property value. Collection of all settings to be applied
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementSettingInstance> value) {
        this.settings = value;
    }
    /**
     * Sets the templateId property value. The ID of the template this intent was created from (if any)
     * @param value Value to set for the templateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateId(@javax.annotation.Nullable final String value) {
        this.templateId = value;
    }
    /**
     * Sets the userStates property value. Collection of states of all users that the intent is applied to
     * @param value Value to set for the userStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserStates(@javax.annotation.Nullable final java.util.List<DeviceManagementIntentUserState> value) {
        this.userStates = value;
    }
    /**
     * Sets the userStateSummary property value. A summary of user states and counts of users that belong to corresponding state for all users that the intent is applied to
     * @param value Value to set for the userStateSummary property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserStateSummary(@javax.annotation.Nullable final DeviceManagementIntentUserStateSummary value) {
        this.userStateSummary = value;
    }
}
