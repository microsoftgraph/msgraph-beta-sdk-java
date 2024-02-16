package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Management Compliance Policy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementCompliancePolicy extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementCompliancePolicy} and sets the default values.
     */
    public DeviceManagementCompliancePolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementCompliancePolicy}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementCompliancePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementCompliancePolicy();
    }
    /**
     * Gets the assignments property value. Policy assignments
     * @return a {@link java.util.List<DeviceManagementConfigurationPolicyAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationPolicyAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * Gets the createdDateTime property value. Policy creation date and time. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the creationSource property value. Policy creation source
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreationSource() {
        return this.backingStore.get("creationSource");
    }
    /**
     * Gets the description property value. Policy description
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(DeviceManagementConfigurationPolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("creationSource", (n) -> { this.setCreationSource(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("isAssigned", (n) -> { this.setIsAssigned(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("platforms", (n) -> { this.setPlatforms(n.getEnumSetValue(DeviceManagementConfigurationPlatforms::forValue)); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("scheduledActionsForRule", (n) -> { this.setScheduledActionsForRule(n.getCollectionOfObjectValues(DeviceManagementComplianceScheduledActionForRule::createFromDiscriminatorValue)); });
        deserializerMap.put("settingCount", (n) -> { this.setSettingCount(n.getIntegerValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getCollectionOfObjectValues(DeviceManagementConfigurationSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("technologies", (n) -> { this.setTechnologies(n.getEnumSetValue(DeviceManagementConfigurationTechnologies::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isAssigned property value. Policy assignment status. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAssigned() {
        return this.backingStore.get("isAssigned");
    }
    /**
     * Gets the lastModifiedDateTime property value. Policy last modification date and time. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the name property value. Policy name
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the platforms property value. Supported platform types.
     * @return a {@link EnumSet<DeviceManagementConfigurationPlatforms>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementConfigurationPlatforms> getPlatforms() {
        return this.backingStore.get("platforms");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the scheduledActionsForRule property value. The list of scheduled action for this rule
     * @return a {@link java.util.List<DeviceManagementComplianceScheduledActionForRule>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementComplianceScheduledActionForRule> getScheduledActionsForRule() {
        return this.backingStore.get("scheduledActionsForRule");
    }
    /**
     * Gets the settingCount property value. Number of settings. This property is read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSettingCount() {
        return this.backingStore.get("settingCount");
    }
    /**
     * Gets the settings property value. Policy settings
     * @return a {@link java.util.List<DeviceManagementConfigurationSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSetting> getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the technologies property value. Describes which technology this setting can be deployed with
     * @return a {@link EnumSet<DeviceManagementConfigurationTechnologies>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementConfigurationTechnologies> getTechnologies() {
        return this.backingStore.get("technologies");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeStringValue("creationSource", this.getCreationSource());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumSetValue("platforms", this.getPlatforms());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeCollectionOfObjectValues("scheduledActionsForRule", this.getScheduledActionsForRule());
        writer.writeCollectionOfObjectValues("settings", this.getSettings());
        writer.writeEnumSetValue("technologies", this.getTechnologies());
    }
    /**
     * Sets the assignments property value. Policy assignments
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationPolicyAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the createdDateTime property value. Policy creation date and time. This property is read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the creationSource property value. Policy creation source
     * @param value Value to set for the creationSource property.
     */
    public void setCreationSource(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("creationSource", value);
    }
    /**
     * Sets the description property value. Policy description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the isAssigned property value. Policy assignment status. This property is read-only.
     * @param value Value to set for the isAssigned property.
     */
    public void setIsAssigned(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAssigned", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Policy last modification date and time. This property is read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the name property value. Policy name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the platforms property value. Supported platform types.
     * @param value Value to set for the platforms property.
     */
    public void setPlatforms(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationPlatforms> value) {
        this.backingStore.set("platforms", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the scheduledActionsForRule property value. The list of scheduled action for this rule
     * @param value Value to set for the scheduledActionsForRule property.
     */
    public void setScheduledActionsForRule(@jakarta.annotation.Nullable final java.util.List<DeviceManagementComplianceScheduledActionForRule> value) {
        this.backingStore.set("scheduledActionsForRule", value);
    }
    /**
     * Sets the settingCount property value. Number of settings. This property is read-only.
     * @param value Value to set for the settingCount property.
     */
    public void setSettingCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("settingCount", value);
    }
    /**
     * Sets the settings property value. Policy settings
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSetting> value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the technologies property value. Describes which technology this setting can be deployed with
     * @param value Value to set for the technologies property.
     */
    public void setTechnologies(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationTechnologies> value) {
        this.backingStore.set("technologies", value);
    }
}
