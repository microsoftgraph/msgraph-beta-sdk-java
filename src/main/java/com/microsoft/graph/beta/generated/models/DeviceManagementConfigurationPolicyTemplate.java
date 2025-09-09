package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Management Configuration Policy Template
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationPolicyTemplate extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationPolicyTemplate} and sets the default values.
     */
    public DeviceManagementConfigurationPolicyTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationPolicyTemplate}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationPolicyTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationPolicyTemplate();
    }
    /**
     * Gets the allowUnmanagedSettings property value. Allow unmanaged setting templates
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowUnmanagedSettings() {
        return this.backingStore.get("allowUnmanagedSettings");
    }
    /**
     * Gets the baseId property value. Template base identifier
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBaseId() {
        return this.backingStore.get("baseId");
    }
    /**
     * Gets the description property value. Template description
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the disableEntraGroupPolicyAssignment property value. Indicates whether assignments to Entra security groups is disabled
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDisableEntraGroupPolicyAssignment() {
        return this.backingStore.get("disableEntraGroupPolicyAssignment");
    }
    /**
     * Gets the displayName property value. Template display name
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the displayVersion property value. Description of template version
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayVersion() {
        return this.backingStore.get("displayVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowUnmanagedSettings", (n) -> { this.setAllowUnmanagedSettings(n.getBooleanValue()); });
        deserializerMap.put("baseId", (n) -> { this.setBaseId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("disableEntraGroupPolicyAssignment", (n) -> { this.setDisableEntraGroupPolicyAssignment(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("displayVersion", (n) -> { this.setDisplayVersion(n.getStringValue()); });
        deserializerMap.put("lifecycleState", (n) -> { this.setLifecycleState(n.getEnumValue(DeviceManagementTemplateLifecycleState::forValue)); });
        deserializerMap.put("platforms", (n) -> { this.setPlatforms(n.getEnumSetValue(DeviceManagementConfigurationPlatforms::forValue)); });
        deserializerMap.put("settingTemplateCount", (n) -> { this.setSettingTemplateCount(n.getIntegerValue()); });
        deserializerMap.put("settingTemplates", (n) -> { this.setSettingTemplates(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("technologies", (n) -> { this.setTechnologies(n.getEnumSetValue(DeviceManagementConfigurationTechnologies::forValue)); });
        deserializerMap.put("templateFamily", (n) -> { this.setTemplateFamily(n.getEnumValue(DeviceManagementConfigurationTemplateFamily::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lifecycleState property value. Describes current lifecycle state of a template
     * @return a {@link DeviceManagementTemplateLifecycleState}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementTemplateLifecycleState getLifecycleState() {
        return this.backingStore.get("lifecycleState");
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
     * Gets the settingTemplateCount property value. Number of setting templates. Valid values 0 to 2147483647. This property is read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSettingTemplateCount() {
        return this.backingStore.get("settingTemplateCount");
    }
    /**
     * Gets the settingTemplates property value. Setting templates
     * @return a {@link java.util.List<DeviceManagementConfigurationSettingTemplate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingTemplate> getSettingTemplates() {
        return this.backingStore.get("settingTemplates");
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
     * Gets the templateFamily property value. Describes the TemplateFamily for the Template entity
     * @return a {@link DeviceManagementConfigurationTemplateFamily}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationTemplateFamily getTemplateFamily() {
        return this.backingStore.get("templateFamily");
    }
    /**
     * Gets the version property value. Template version. Valid values 1 to 2147483647. This property is read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowUnmanagedSettings", this.getAllowUnmanagedSettings());
        writer.writeStringValue("baseId", this.getBaseId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("disableEntraGroupPolicyAssignment", this.getDisableEntraGroupPolicyAssignment());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("displayVersion", this.getDisplayVersion());
        writer.writeEnumValue("lifecycleState", this.getLifecycleState());
        writer.writeEnumSetValue("platforms", this.getPlatforms());
        writer.writeCollectionOfObjectValues("settingTemplates", this.getSettingTemplates());
        writer.writeEnumSetValue("technologies", this.getTechnologies());
        writer.writeEnumValue("templateFamily", this.getTemplateFamily());
    }
    /**
     * Sets the allowUnmanagedSettings property value. Allow unmanaged setting templates
     * @param value Value to set for the allowUnmanagedSettings property.
     */
    public void setAllowUnmanagedSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowUnmanagedSettings", value);
    }
    /**
     * Sets the baseId property value. Template base identifier
     * @param value Value to set for the baseId property.
     */
    public void setBaseId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("baseId", value);
    }
    /**
     * Sets the description property value. Template description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the disableEntraGroupPolicyAssignment property value. Indicates whether assignments to Entra security groups is disabled
     * @param value Value to set for the disableEntraGroupPolicyAssignment property.
     */
    public void setDisableEntraGroupPolicyAssignment(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("disableEntraGroupPolicyAssignment", value);
    }
    /**
     * Sets the displayName property value. Template display name
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the displayVersion property value. Description of template version
     * @param value Value to set for the displayVersion property.
     */
    public void setDisplayVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayVersion", value);
    }
    /**
     * Sets the lifecycleState property value. Describes current lifecycle state of a template
     * @param value Value to set for the lifecycleState property.
     */
    public void setLifecycleState(@jakarta.annotation.Nullable final DeviceManagementTemplateLifecycleState value) {
        this.backingStore.set("lifecycleState", value);
    }
    /**
     * Sets the platforms property value. Supported platform types.
     * @param value Value to set for the platforms property.
     */
    public void setPlatforms(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationPlatforms> value) {
        this.backingStore.set("platforms", value);
    }
    /**
     * Sets the settingTemplateCount property value. Number of setting templates. Valid values 0 to 2147483647. This property is read-only.
     * @param value Value to set for the settingTemplateCount property.
     */
    public void setSettingTemplateCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("settingTemplateCount", value);
    }
    /**
     * Sets the settingTemplates property value. Setting templates
     * @param value Value to set for the settingTemplates property.
     */
    public void setSettingTemplates(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingTemplate> value) {
        this.backingStore.set("settingTemplates", value);
    }
    /**
     * Sets the technologies property value. Describes which technology this setting can be deployed with
     * @param value Value to set for the technologies property.
     */
    public void setTechnologies(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationTechnologies> value) {
        this.backingStore.set("technologies", value);
    }
    /**
     * Sets the templateFamily property value. Describes the TemplateFamily for the Template entity
     * @param value Value to set for the templateFamily property.
     */
    public void setTemplateFamily(@jakarta.annotation.Nullable final DeviceManagementConfigurationTemplateFamily value) {
        this.backingStore.set("templateFamily", value);
    }
    /**
     * Sets the version property value. Template version. Valid values 1 to 2147483647. This property is read-only.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("version", value);
    }
}
