package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents an intent to apply settings to a device
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementIntent extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceManagementIntent and sets the default values.
     */
    public DeviceManagementIntent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementIntent
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementIntent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementIntent();
    }
    /**
     * Gets the assignments property value. Collection of assignments
     * @return a java.util.List<DeviceManagementIntentAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementIntentAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the categories property value. Collection of setting categories within the intent
     * @return a java.util.List<DeviceManagementIntentSettingCategory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementIntentSettingCategory> getCategories() {
        return this.backingStore.get("categories");
    }
    /**
     * Gets the description property value. The user given description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the deviceSettingStateSummaries property value. Collection of settings and their states and counts of devices that belong to corresponding state for all settings within the intent
     * @return a java.util.List<DeviceManagementIntentDeviceSettingStateSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementIntentDeviceSettingStateSummary> getDeviceSettingStateSummaries() {
        return this.backingStore.get("deviceSettingStateSummaries");
    }
    /**
     * Gets the deviceStates property value. Collection of states of all devices that the intent is applied to
     * @return a java.util.List<DeviceManagementIntentDeviceState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementIntentDeviceState> getDeviceStates() {
        return this.backingStore.get("deviceStates");
    }
    /**
     * Gets the deviceStateSummary property value. A summary of device states and counts of devices that belong to corresponding state for all devices that the intent is applied to
     * @return a DeviceManagementIntentDeviceStateSummary
     */
    @jakarta.annotation.Nullable
    public DeviceManagementIntentDeviceStateSummary getDeviceStateSummary() {
        return this.backingStore.get("deviceStateSummary");
    }
    /**
     * Gets the displayName property value. The user given display name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAssigned() {
        return this.backingStore.get("isAssigned");
    }
    /**
     * Gets the isMigratingToConfigurationPolicy property value. Signifies whether or not the intent is being migrated to the configurationPolicies endpoint
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMigratingToConfigurationPolicy() {
        return this.backingStore.get("isMigratingToConfigurationPolicy");
    }
    /**
     * Gets the lastModifiedDateTime property value. When the intent was last modified
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the settings property value. Collection of all settings to be applied
     * @return a java.util.List<DeviceManagementSettingInstance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementSettingInstance> getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the templateId property value. The ID of the template this intent was created from (if any)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTemplateId() {
        return this.backingStore.get("templateId");
    }
    /**
     * Gets the userStates property value. Collection of states of all users that the intent is applied to
     * @return a java.util.List<DeviceManagementIntentUserState>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementIntentUserState> getUserStates() {
        return this.backingStore.get("userStates");
    }
    /**
     * Gets the userStateSummary property value. A summary of user states and counts of users that belong to corresponding state for all users that the intent is applied to
     * @return a DeviceManagementIntentUserStateSummary
     */
    @jakarta.annotation.Nullable
    public DeviceManagementIntentUserStateSummary getUserStateSummary() {
        return this.backingStore.get("userStateSummary");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceManagementIntentAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the categories property value. Collection of setting categories within the intent
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<DeviceManagementIntentSettingCategory> value) {
        this.backingStore.set("categories", value);
    }
    /**
     * Sets the description property value. The user given description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the deviceSettingStateSummaries property value. Collection of settings and their states and counts of devices that belong to corresponding state for all settings within the intent
     * @param value Value to set for the deviceSettingStateSummaries property.
     */
    public void setDeviceSettingStateSummaries(@jakarta.annotation.Nullable final java.util.List<DeviceManagementIntentDeviceSettingStateSummary> value) {
        this.backingStore.set("deviceSettingStateSummaries", value);
    }
    /**
     * Sets the deviceStates property value. Collection of states of all devices that the intent is applied to
     * @param value Value to set for the deviceStates property.
     */
    public void setDeviceStates(@jakarta.annotation.Nullable final java.util.List<DeviceManagementIntentDeviceState> value) {
        this.backingStore.set("deviceStates", value);
    }
    /**
     * Sets the deviceStateSummary property value. A summary of device states and counts of devices that belong to corresponding state for all devices that the intent is applied to
     * @param value Value to set for the deviceStateSummary property.
     */
    public void setDeviceStateSummary(@jakarta.annotation.Nullable final DeviceManagementIntentDeviceStateSummary value) {
        this.backingStore.set("deviceStateSummary", value);
    }
    /**
     * Sets the displayName property value. The user given display name
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isAssigned property value. Signifies whether or not the intent is assigned to users
     * @param value Value to set for the isAssigned property.
     */
    public void setIsAssigned(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAssigned", value);
    }
    /**
     * Sets the isMigratingToConfigurationPolicy property value. Signifies whether or not the intent is being migrated to the configurationPolicies endpoint
     * @param value Value to set for the isMigratingToConfigurationPolicy property.
     */
    public void setIsMigratingToConfigurationPolicy(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMigratingToConfigurationPolicy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. When the intent was last modified
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the settings property value. Collection of all settings to be applied
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final java.util.List<DeviceManagementSettingInstance> value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the templateId property value. The ID of the template this intent was created from (if any)
     * @param value Value to set for the templateId property.
     */
    public void setTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("templateId", value);
    }
    /**
     * Sets the userStates property value. Collection of states of all users that the intent is applied to
     * @param value Value to set for the userStates property.
     */
    public void setUserStates(@jakarta.annotation.Nullable final java.util.List<DeviceManagementIntentUserState> value) {
        this.backingStore.set("userStates", value);
    }
    /**
     * Sets the userStateSummary property value. A summary of user states and counts of users that belong to corresponding state for all users that the intent is applied to
     * @param value Value to set for the userStateSummary property.
     */
    public void setUserStateSummary(@jakarta.annotation.Nullable final DeviceManagementIntentUserStateSummary value) {
        this.backingStore.set("userStateSummary", value);
    }
}
