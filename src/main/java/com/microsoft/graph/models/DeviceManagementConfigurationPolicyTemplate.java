package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Management Configuration Policy Template
 */
public class DeviceManagementConfigurationPolicyTemplate extends Entity implements Parsable {
    /**
     * Allow unmanaged setting templates
     */
    private Boolean allowUnmanagedSettings;
    /**
     * Template base identifier
     */
    private String baseId;
    /**
     * Template description
     */
    private String description;
    /**
     * Template display name
     */
    private String displayName;
    /**
     * Description of template version
     */
    private String displayVersion;
    /**
     * Describes current lifecycle state of a template
     */
    private DeviceManagementTemplateLifecycleState lifecycleState;
    /**
     * Supported platform types.
     */
    private DeviceManagementConfigurationPlatforms platforms;
    /**
     * Number of setting templates. Valid values 0 to 2147483647. This property is read-only.
     */
    private Integer settingTemplateCount;
    /**
     * Setting templates
     */
    private java.util.List<DeviceManagementConfigurationSettingTemplate> settingTemplates;
    /**
     * Describes which technology this setting can be deployed with
     */
    private DeviceManagementConfigurationTechnologies technologies;
    /**
     * Describes the TemplateFamily for the Template entity
     */
    private DeviceManagementConfigurationTemplateFamily templateFamily;
    /**
     * Template version. Valid values 1 to 2147483647. This property is read-only.
     */
    private Integer version;
    /**
     * Instantiates a new deviceManagementConfigurationPolicyTemplate and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationPolicyTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationPolicyTemplate
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationPolicyTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationPolicyTemplate();
    }
    /**
     * Gets the allowUnmanagedSettings property value. Allow unmanaged setting templates
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowUnmanagedSettings() {
        return this.allowUnmanagedSettings;
    }
    /**
     * Gets the baseId property value. Template base identifier
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getBaseId() {
        return this.baseId;
    }
    /**
     * Gets the description property value. Template description
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Template display name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the displayVersion property value. Description of template version
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayVersion() {
        return this.displayVersion;
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
        deserializerMap.put("platforms", (n) -> { this.setPlatforms(n.getEnumValue(DeviceManagementConfigurationPlatforms.class)); });
        deserializerMap.put("settingTemplateCount", (n) -> { this.setSettingTemplateCount(n.getIntegerValue()); });
        deserializerMap.put("settingTemplates", (n) -> { this.setSettingTemplates(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("technologies", (n) -> { this.setTechnologies(n.getEnumValue(DeviceManagementConfigurationTechnologies.class)); });
        deserializerMap.put("templateFamily", (n) -> { this.setTemplateFamily(n.getEnumValue(DeviceManagementConfigurationTemplateFamily.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lifecycleState property value. Describes current lifecycle state of a template
     * @return a deviceManagementTemplateLifecycleState
     */
    @jakarta.annotation.Nullable
    public DeviceManagementTemplateLifecycleState getLifecycleState() {
        return this.lifecycleState;
    }
    /**
     * Gets the platforms property value. Supported platform types.
     * @return a deviceManagementConfigurationPlatforms
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationPlatforms getPlatforms() {
        return this.platforms;
    }
    /**
     * Gets the settingTemplateCount property value. Number of setting templates. Valid values 0 to 2147483647. This property is read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSettingTemplateCount() {
        return this.settingTemplateCount;
    }
    /**
     * Gets the settingTemplates property value. Setting templates
     * @return a deviceManagementConfigurationSettingTemplate
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingTemplate> getSettingTemplates() {
        return this.settingTemplates;
    }
    /**
     * Gets the technologies property value. Describes which technology this setting can be deployed with
     * @return a deviceManagementConfigurationTechnologies
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationTechnologies getTechnologies() {
        return this.technologies;
    }
    /**
     * Gets the templateFamily property value. Describes the TemplateFamily for the Template entity
     * @return a deviceManagementConfigurationTemplateFamily
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationTemplateFamily getTemplateFamily() {
        return this.templateFamily;
    }
    /**
     * Gets the version property value. Template version. Valid values 1 to 2147483647. This property is read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowUnmanagedSettings", this.getAllowUnmanagedSettings());
        writer.writeStringValue("baseId", this.getBaseId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("displayVersion", this.getDisplayVersion());
        writer.writeEnumValue("lifecycleState", this.getLifecycleState());
        writer.writeEnumValue("platforms", this.getPlatforms());
        writer.writeCollectionOfObjectValues("settingTemplates", this.getSettingTemplates());
        writer.writeEnumValue("technologies", this.getTechnologies());
        writer.writeEnumValue("templateFamily", this.getTemplateFamily());
    }
    /**
     * Sets the allowUnmanagedSettings property value. Allow unmanaged setting templates
     * @param value Value to set for the allowUnmanagedSettings property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowUnmanagedSettings(@jakarta.annotation.Nullable final Boolean value) {
        this.allowUnmanagedSettings = value;
    }
    /**
     * Sets the baseId property value. Template base identifier
     * @param value Value to set for the baseId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBaseId(@jakarta.annotation.Nullable final String value) {
        this.baseId = value;
    }
    /**
     * Sets the description property value. Template description
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Template display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the displayVersion property value. Description of template version
     * @param value Value to set for the displayVersion property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayVersion(@jakarta.annotation.Nullable final String value) {
        this.displayVersion = value;
    }
    /**
     * Sets the lifecycleState property value. Describes current lifecycle state of a template
     * @param value Value to set for the lifecycleState property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLifecycleState(@jakarta.annotation.Nullable final DeviceManagementTemplateLifecycleState value) {
        this.lifecycleState = value;
    }
    /**
     * Sets the platforms property value. Supported platform types.
     * @param value Value to set for the platforms property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPlatforms(@jakarta.annotation.Nullable final DeviceManagementConfigurationPlatforms value) {
        this.platforms = value;
    }
    /**
     * Sets the settingTemplateCount property value. Number of setting templates. Valid values 0 to 2147483647. This property is read-only.
     * @param value Value to set for the settingTemplateCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSettingTemplateCount(@jakarta.annotation.Nullable final Integer value) {
        this.settingTemplateCount = value;
    }
    /**
     * Sets the settingTemplates property value. Setting templates
     * @param value Value to set for the settingTemplates property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSettingTemplates(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingTemplate> value) {
        this.settingTemplates = value;
    }
    /**
     * Sets the technologies property value. Describes which technology this setting can be deployed with
     * @param value Value to set for the technologies property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTechnologies(@jakarta.annotation.Nullable final DeviceManagementConfigurationTechnologies value) {
        this.technologies = value;
    }
    /**
     * Sets the templateFamily property value. Describes the TemplateFamily for the Template entity
     * @param value Value to set for the templateFamily property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTemplateFamily(@jakarta.annotation.Nullable final DeviceManagementConfigurationTemplateFamily value) {
        this.templateFamily = value;
    }
    /**
     * Sets the version property value. Template version. Valid values 1 to 2147483647. This property is read-only.
     * @param value Value to set for the version property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.version = value;
    }
}
