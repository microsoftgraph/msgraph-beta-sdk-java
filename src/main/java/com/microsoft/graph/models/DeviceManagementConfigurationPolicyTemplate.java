package com.microsoft.graph.models;

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
     * Instantiates a new DeviceManagementConfigurationPolicyTemplate and sets the default values.
     */
    public DeviceManagementConfigurationPolicyTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationPolicyTemplate
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationPolicyTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationPolicyTemplate();
    }
    /**
     * Gets the allowUnmanagedSettings property value. Allow unmanaged setting templates
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowUnmanagedSettings() {
        return this.BackingStore.get("allowUnmanagedSettings");
    }
    /**
     * Gets the baseId property value. Template base identifier
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBaseId() {
        return this.BackingStore.get("baseId");
    }
    /**
     * Gets the description property value. Template description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. Template display name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the displayVersion property value. Description of template version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayVersion() {
        return this.BackingStore.get("displayVersion");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowUnmanagedSettings", (n) -> { this.setAllowUnmanagedSettings(n.getBooleanValue()); });
        deserializerMap.put("baseId", (n) -> { this.setBaseId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("displayVersion", (n) -> { this.setDisplayVersion(n.getStringValue()); });
        deserializerMap.put("lifecycleState", (n) -> { this.setLifecycleState(n.getEnumValue(DeviceManagementTemplateLifecycleState.class)); });
        deserializerMap.put("platforms", (n) -> { this.setPlatforms(n.getEnumSetValue(DeviceManagementConfigurationPlatforms.class)); });
        deserializerMap.put("settingTemplateCount", (n) -> { this.setSettingTemplateCount(n.getIntegerValue()); });
        deserializerMap.put("settingTemplates", (n) -> { this.setSettingTemplates(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("technologies", (n) -> { this.setTechnologies(n.getEnumSetValue(DeviceManagementConfigurationTechnologies.class)); });
        deserializerMap.put("templateFamily", (n) -> { this.setTemplateFamily(n.getEnumValue(DeviceManagementConfigurationTemplateFamily.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lifecycleState property value. Describes current lifecycle state of a template
     * @return a DeviceManagementTemplateLifecycleState
     */
    @jakarta.annotation.Nullable
    public DeviceManagementTemplateLifecycleState getLifecycleState() {
        return this.BackingStore.get("lifecycleState");
    }
    /**
     * Gets the platforms property value. Supported platform types.
     * @return a EnumSet<DeviceManagementConfigurationPlatforms>
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementConfigurationPlatforms> getPlatforms() {
        return this.BackingStore.get("platforms");
    }
    /**
     * Gets the settingTemplateCount property value. Number of setting templates. Valid values 0 to 2147483647. This property is read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSettingTemplateCount() {
        return this.BackingStore.get("settingTemplateCount");
    }
    /**
     * Gets the settingTemplates property value. Setting templates
     * @return a java.util.List<DeviceManagementConfigurationSettingTemplate>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingTemplate> getSettingTemplates() {
        return this.BackingStore.get("settingTemplates");
    }
    /**
     * Gets the technologies property value. Describes which technology this setting can be deployed with
     * @return a EnumSet<DeviceManagementConfigurationTechnologies>
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementConfigurationTechnologies> getTechnologies() {
        return this.BackingStore.get("technologies");
    }
    /**
     * Gets the templateFamily property value. Describes the TemplateFamily for the Template entity
     * @return a DeviceManagementConfigurationTemplateFamily
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationTemplateFamily getTemplateFamily() {
        return this.BackingStore.get("templateFamily");
    }
    /**
     * Gets the version property value. Template version. Valid values 1 to 2147483647. This property is read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.BackingStore.get("version");
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
        this.BackingStore.set("allowUnmanagedSettings", value);
    }
    /**
     * Sets the baseId property value. Template base identifier
     * @param value Value to set for the baseId property.
     */
    public void setBaseId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("baseId", value);
    }
    /**
     * Sets the description property value. Template description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Template display name
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the displayVersion property value. Description of template version
     * @param value Value to set for the displayVersion property.
     */
    public void setDisplayVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayVersion", value);
    }
    /**
     * Sets the lifecycleState property value. Describes current lifecycle state of a template
     * @param value Value to set for the lifecycleState property.
     */
    public void setLifecycleState(@jakarta.annotation.Nullable final DeviceManagementTemplateLifecycleState value) {
        this.BackingStore.set("lifecycleState", value);
    }
    /**
     * Sets the platforms property value. Supported platform types.
     * @param value Value to set for the platforms property.
     */
    public void setPlatforms(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationPlatforms> value) {
        this.BackingStore.set("platforms", value);
    }
    /**
     * Sets the settingTemplateCount property value. Number of setting templates. Valid values 0 to 2147483647. This property is read-only.
     * @param value Value to set for the settingTemplateCount property.
     */
    public void setSettingTemplateCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("settingTemplateCount", value);
    }
    /**
     * Sets the settingTemplates property value. Setting templates
     * @param value Value to set for the settingTemplates property.
     */
    public void setSettingTemplates(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingTemplate> value) {
        this.BackingStore.set("settingTemplates", value);
    }
    /**
     * Sets the technologies property value. Describes which technology this setting can be deployed with
     * @param value Value to set for the technologies property.
     */
    public void setTechnologies(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationTechnologies> value) {
        this.BackingStore.set("technologies", value);
    }
    /**
     * Sets the templateFamily property value. Describes the TemplateFamily for the Template entity
     * @param value Value to set for the templateFamily property.
     */
    public void setTemplateFamily(@jakarta.annotation.Nullable final DeviceManagementConfigurationTemplateFamily value) {
        this.BackingStore.set("templateFamily", value);
    }
    /**
     * Sets the version property value. Template version. Valid values 1 to 2147483647. This property is read-only.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("version", value);
    }
}
