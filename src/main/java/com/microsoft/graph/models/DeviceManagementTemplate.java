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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementTemplate extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceManagementTemplate and sets the default values.
     */
    public DeviceManagementTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementTemplate
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
     * @return a java.util.List<DeviceManagementTemplateSettingCategory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementTemplateSettingCategory> getCategories() {
        return this.backingStore.get("categories");
    }
    /**
     * Gets the description property value. The template's description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The template's display name
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
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIntentCount() {
        return this.backingStore.get("intentCount");
    }
    /**
     * Gets the isDeprecated property value. The template is deprecated or not. Intents cannot be created from a deprecated template.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeprecated() {
        return this.backingStore.get("isDeprecated");
    }
    /**
     * Gets the migratableTo property value. Collection of templates this template can migrate to
     * @return a java.util.List<DeviceManagementTemplate>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementTemplate> getMigratableTo() {
        return this.backingStore.get("migratableTo");
    }
    /**
     * Gets the platformType property value. Supported platform types for policies.
     * @return a PolicyPlatformType
     */
    @jakarta.annotation.Nullable
    public PolicyPlatformType getPlatformType() {
        return this.backingStore.get("platformType");
    }
    /**
     * Gets the publishedDateTime property value. When the template was published
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this.backingStore.get("publishedDateTime");
    }
    /**
     * Gets the settings property value. Collection of all settings this template has
     * @return a java.util.List<DeviceManagementSettingInstance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementSettingInstance> getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Gets the templateSubtype property value. Template subtype
     * @return a DeviceManagementTemplateSubtype
     */
    @jakarta.annotation.Nullable
    public DeviceManagementTemplateSubtype getTemplateSubtype() {
        return this.backingStore.get("templateSubtype");
    }
    /**
     * Gets the templateType property value. Template type
     * @return a DeviceManagementTemplateType
     */
    @jakarta.annotation.Nullable
    public DeviceManagementTemplateType getTemplateType() {
        return this.backingStore.get("templateType");
    }
    /**
     * Gets the versionInfo property value. The template's version information
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersionInfo() {
        return this.backingStore.get("versionInfo");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<DeviceManagementTemplateSettingCategory> value) {
        this.backingStore.set("categories", value);
    }
    /**
     * Sets the description property value. The template's description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The template's display name
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the intentCount property value. Number of Intents created from this template.
     * @param value Value to set for the intentCount property.
     */
    public void setIntentCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("intentCount", value);
    }
    /**
     * Sets the isDeprecated property value. The template is deprecated or not. Intents cannot be created from a deprecated template.
     * @param value Value to set for the isDeprecated property.
     */
    public void setIsDeprecated(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDeprecated", value);
    }
    /**
     * Sets the migratableTo property value. Collection of templates this template can migrate to
     * @param value Value to set for the migratableTo property.
     */
    public void setMigratableTo(@jakarta.annotation.Nullable final java.util.List<DeviceManagementTemplate> value) {
        this.backingStore.set("migratableTo", value);
    }
    /**
     * Sets the platformType property value. Supported platform types for policies.
     * @param value Value to set for the platformType property.
     */
    public void setPlatformType(@jakarta.annotation.Nullable final PolicyPlatformType value) {
        this.backingStore.set("platformType", value);
    }
    /**
     * Sets the publishedDateTime property value. When the template was published
     * @param value Value to set for the publishedDateTime property.
     */
    public void setPublishedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("publishedDateTime", value);
    }
    /**
     * Sets the settings property value. Collection of all settings this template has
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final java.util.List<DeviceManagementSettingInstance> value) {
        this.backingStore.set("settings", value);
    }
    /**
     * Sets the templateSubtype property value. Template subtype
     * @param value Value to set for the templateSubtype property.
     */
    public void setTemplateSubtype(@jakarta.annotation.Nullable final DeviceManagementTemplateSubtype value) {
        this.backingStore.set("templateSubtype", value);
    }
    /**
     * Sets the templateType property value. Template type
     * @param value Value to set for the templateType property.
     */
    public void setTemplateType(@jakarta.annotation.Nullable final DeviceManagementTemplateType value) {
        this.backingStore.set("templateType", value);
    }
    /**
     * Sets the versionInfo property value. The template's version information
     * @param value Value to set for the versionInfo property.
     */
    public void setVersionInfo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("versionInfo", value);
    }
}
