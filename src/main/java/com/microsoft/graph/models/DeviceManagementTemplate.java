package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents a defined collection of device settings
 */
public class DeviceManagementTemplate extends Entity implements Parsable {
    /**
     * Collection of setting categories within the template
     */
    private java.util.List<DeviceManagementTemplateSettingCategory> categories;
    /**
     * The template's description
     */
    private String description;
    /**
     * The template's display name
     */
    private String displayName;
    /**
     * Number of Intents created from this template.
     */
    private Integer intentCount;
    /**
     * The template is deprecated or not. Intents cannot be created from a deprecated template.
     */
    private Boolean isDeprecated;
    /**
     * Collection of templates this template can migrate to
     */
    private java.util.List<DeviceManagementTemplate> migratableTo;
    /**
     * Supported platform types for policies.
     */
    private PolicyPlatformType platformType;
    /**
     * When the template was published
     */
    private OffsetDateTime publishedDateTime;
    /**
     * Collection of all settings this template has
     */
    private java.util.List<DeviceManagementSettingInstance> settings;
    /**
     * Template subtype
     */
    private DeviceManagementTemplateSubtype templateSubtype;
    /**
     * Template type
     */
    private DeviceManagementTemplateType templateType;
    /**
     * The template's version information
     */
    private String versionInfo;
    /**
     * Instantiates a new deviceManagementTemplate and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementTemplate
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.securityBaselineTemplate": return new SecurityBaselineTemplate();
            }
        }
        return new DeviceManagementTemplate();
    }
    /**
     * Gets the categories property value. Collection of setting categories within the template
     * @return a deviceManagementTemplateSettingCategory
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementTemplateSettingCategory> getCategories() {
        return this.categories;
    }
    /**
     * Gets the description property value. The template's description
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The template's display name
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfObjectValues(DeviceManagementTemplateSettingCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("intentCount", (n) -> { this.setIntentCount(n.getIntegerValue()); });
        deserializerMap.put("isDeprecated", (n) -> { this.setIsDeprecated(n.getBooleanValue()); });
        deserializerMap.put("migratableTo", (n) -> { this.setMigratableTo(n.getCollectionOfObjectValues(DeviceManagementTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("platformType", (n) -> { this.setPlatformType(n.getEnumValue(PolicyPlatformType.class)); });
        deserializerMap.put("publishedDateTime", (n) -> { this.setPublishedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getCollectionOfObjectValues(DeviceManagementSettingInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("templateSubtype", (n) -> { this.setTemplateSubtype(n.getEnumValue(DeviceManagementTemplateSubtype.class)); });
        deserializerMap.put("templateType", (n) -> { this.setTemplateType(n.getEnumValue(DeviceManagementTemplateType.class)); });
        deserializerMap.put("versionInfo", (n) -> { this.setVersionInfo(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intentCount property value. Number of Intents created from this template.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getIntentCount() {
        return this.intentCount;
    }
    /**
     * Gets the isDeprecated property value. The template is deprecated or not. Intents cannot be created from a deprecated template.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeprecated() {
        return this.isDeprecated;
    }
    /**
     * Gets the migratableTo property value. Collection of templates this template can migrate to
     * @return a deviceManagementTemplate
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementTemplate> getMigratableTo() {
        return this.migratableTo;
    }
    /**
     * Gets the platformType property value. Supported platform types for policies.
     * @return a policyPlatformType
     */
    @jakarta.annotation.Nullable
    public PolicyPlatformType getPlatformType() {
        return this.platformType;
    }
    /**
     * Gets the publishedDateTime property value. When the template was published
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this.publishedDateTime;
    }
    /**
     * Gets the settings property value. Collection of all settings this template has
     * @return a deviceManagementSettingInstance
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementSettingInstance> getSettings() {
        return this.settings;
    }
    /**
     * Gets the templateSubtype property value. Template subtype
     * @return a deviceManagementTemplateSubtype
     */
    @jakarta.annotation.Nullable
    public DeviceManagementTemplateSubtype getTemplateSubtype() {
        return this.templateSubtype;
    }
    /**
     * Gets the templateType property value. Template type
     * @return a deviceManagementTemplateType
     */
    @jakarta.annotation.Nullable
    public DeviceManagementTemplateType getTemplateType() {
        return this.templateType;
    }
    /**
     * Gets the versionInfo property value. The template's version information
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVersionInfo() {
        return this.versionInfo;
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
        writer.writeCollectionOfObjectValues("categories", this.getCategories());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("intentCount", this.getIntentCount());
        writer.writeBooleanValue("isDeprecated", this.getIsDeprecated());
        writer.writeCollectionOfObjectValues("migratableTo", this.getMigratableTo());
        writer.writeEnumValue("platformType", this.getPlatformType());
        writer.writeOffsetDateTimeValue("publishedDateTime", this.getPublishedDateTime());
        writer.writeCollectionOfObjectValues("settings", this.getSettings());
        writer.writeEnumValue("templateSubtype", this.getTemplateSubtype());
        writer.writeEnumValue("templateType", this.getTemplateType());
        writer.writeStringValue("versionInfo", this.getVersionInfo());
    }
    /**
     * Sets the categories property value. Collection of setting categories within the template
     * @param value Value to set for the categories property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<DeviceManagementTemplateSettingCategory> value) {
        this.categories = value;
    }
    /**
     * Sets the description property value. The template's description
     * @param value Value to set for the description property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The template's display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the intentCount property value. Number of Intents created from this template.
     * @param value Value to set for the intentCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIntentCount(@jakarta.annotation.Nullable final Integer value) {
        this.intentCount = value;
    }
    /**
     * Sets the isDeprecated property value. The template is deprecated or not. Intents cannot be created from a deprecated template.
     * @param value Value to set for the isDeprecated property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIsDeprecated(@jakarta.annotation.Nullable final Boolean value) {
        this.isDeprecated = value;
    }
    /**
     * Sets the migratableTo property value. Collection of templates this template can migrate to
     * @param value Value to set for the migratableTo property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMigratableTo(@jakarta.annotation.Nullable final java.util.List<DeviceManagementTemplate> value) {
        this.migratableTo = value;
    }
    /**
     * Sets the platformType property value. Supported platform types for policies.
     * @param value Value to set for the platformType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPlatformType(@jakarta.annotation.Nullable final PolicyPlatformType value) {
        this.platformType = value;
    }
    /**
     * Sets the publishedDateTime property value. When the template was published
     * @param value Value to set for the publishedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPublishedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.publishedDateTime = value;
    }
    /**
     * Sets the settings property value. Collection of all settings this template has
     * @param value Value to set for the settings property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSettings(@jakarta.annotation.Nullable final java.util.List<DeviceManagementSettingInstance> value) {
        this.settings = value;
    }
    /**
     * Sets the templateSubtype property value. Template subtype
     * @param value Value to set for the templateSubtype property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTemplateSubtype(@jakarta.annotation.Nullable final DeviceManagementTemplateSubtype value) {
        this.templateSubtype = value;
    }
    /**
     * Sets the templateType property value. Template type
     * @param value Value to set for the templateType property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTemplateType(@jakarta.annotation.Nullable final DeviceManagementTemplateType value) {
        this.templateType = value;
    }
    /**
     * Sets the versionInfo property value. The template's version information
     * @param value Value to set for the versionInfo property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setVersionInfo(@jakarta.annotation.Nullable final String value) {
        this.versionInfo = value;
    }
}
