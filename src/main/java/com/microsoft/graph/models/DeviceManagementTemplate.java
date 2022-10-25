package com.microsoft.graph.models;

import com.microsoft.graph.models.SecurityBaselineTemplate;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementTemplate extends Entity implements Parsable {
    /** Collection of setting categories within the template */
    private java.util.List<DeviceManagementTemplateSettingCategory> _categories;
    /** The template's description */
    private String _description;
    /** The template's display name */
    private String _displayName;
    /** Number of Intents created from this template. */
    private Integer _intentCount;
    /** The template is deprecated or not. Intents cannot be created from a deprecated template. */
    private Boolean _isDeprecated;
    /** Collection of templates this template can migrate to */
    private java.util.List<DeviceManagementTemplate> _migratableTo;
    /** Supported platform types for policies. */
    private PolicyPlatformType _platformType;
    /** When the template was published */
    private OffsetDateTime _publishedDateTime;
    /** Collection of all settings this template has */
    private java.util.List<DeviceManagementSettingInstance> _settings;
    /** Template subtype */
    private DeviceManagementTemplateSubtype _templateSubtype;
    /** Template type */
    private DeviceManagementTemplateType _templateType;
    /** The template's version information */
    private String _versionInfo;
    /**
     * Instantiates a new DeviceManagementTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementTemplate
     */
    @javax.annotation.Nonnull
    public static DeviceManagementTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementTemplateSettingCategory> getCategories() {
        return this._categories;
    }
    /**
     * Gets the description property value. The template's description
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The template's display name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementTemplate currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("categories", (n) -> { currentObject.setCategories(n.getCollectionOfObjectValues(DeviceManagementTemplateSettingCategory::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("intentCount", (n) -> { currentObject.setIntentCount(n.getIntegerValue()); });
            this.put("isDeprecated", (n) -> { currentObject.setIsDeprecated(n.getBooleanValue()); });
            this.put("migratableTo", (n) -> { currentObject.setMigratableTo(n.getCollectionOfObjectValues(DeviceManagementTemplate::createFromDiscriminatorValue)); });
            this.put("platformType", (n) -> { currentObject.setPlatformType(n.getEnumValue(PolicyPlatformType.class)); });
            this.put("publishedDateTime", (n) -> { currentObject.setPublishedDateTime(n.getOffsetDateTimeValue()); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getCollectionOfObjectValues(DeviceManagementSettingInstance::createFromDiscriminatorValue)); });
            this.put("templateSubtype", (n) -> { currentObject.setTemplateSubtype(n.getEnumValue(DeviceManagementTemplateSubtype.class)); });
            this.put("templateType", (n) -> { currentObject.setTemplateType(n.getEnumValue(DeviceManagementTemplateType.class)); });
            this.put("versionInfo", (n) -> { currentObject.setVersionInfo(n.getStringValue()); });
        }};
    }
    /**
     * Gets the intentCount property value. Number of Intents created from this template.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIntentCount() {
        return this._intentCount;
    }
    /**
     * Gets the isDeprecated property value. The template is deprecated or not. Intents cannot be created from a deprecated template.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDeprecated() {
        return this._isDeprecated;
    }
    /**
     * Gets the migratableTo property value. Collection of templates this template can migrate to
     * @return a deviceManagementTemplate
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementTemplate> getMigratableTo() {
        return this._migratableTo;
    }
    /**
     * Gets the platformType property value. Supported platform types for policies.
     * @return a policyPlatformType
     */
    @javax.annotation.Nullable
    public PolicyPlatformType getPlatformType() {
        return this._platformType;
    }
    /**
     * Gets the publishedDateTime property value. When the template was published
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPublishedDateTime() {
        return this._publishedDateTime;
    }
    /**
     * Gets the settings property value. Collection of all settings this template has
     * @return a deviceManagementSettingInstance
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementSettingInstance> getSettings() {
        return this._settings;
    }
    /**
     * Gets the templateSubtype property value. Template subtype
     * @return a deviceManagementTemplateSubtype
     */
    @javax.annotation.Nullable
    public DeviceManagementTemplateSubtype getTemplateSubtype() {
        return this._templateSubtype;
    }
    /**
     * Gets the templateType property value. Template type
     * @return a deviceManagementTemplateType
     */
    @javax.annotation.Nullable
    public DeviceManagementTemplateType getTemplateType() {
        return this._templateType;
    }
    /**
     * Gets the versionInfo property value. The template's version information
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersionInfo() {
        return this._versionInfo;
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
    @javax.annotation.Nonnull
    public void setCategories(@javax.annotation.Nullable final java.util.List<DeviceManagementTemplateSettingCategory> value) {
        this._categories = value;
    }
    /**
     * Sets the description property value. The template's description
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The template's display name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the intentCount property value. Number of Intents created from this template.
     * @param value Value to set for the intentCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIntentCount(@javax.annotation.Nullable final Integer value) {
        this._intentCount = value;
    }
    /**
     * Sets the isDeprecated property value. The template is deprecated or not. Intents cannot be created from a deprecated template.
     * @param value Value to set for the isDeprecated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDeprecated(@javax.annotation.Nullable final Boolean value) {
        this._isDeprecated = value;
    }
    /**
     * Sets the migratableTo property value. Collection of templates this template can migrate to
     * @param value Value to set for the migratableTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMigratableTo(@javax.annotation.Nullable final java.util.List<DeviceManagementTemplate> value) {
        this._migratableTo = value;
    }
    /**
     * Sets the platformType property value. Supported platform types for policies.
     * @param value Value to set for the platformType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatformType(@javax.annotation.Nullable final PolicyPlatformType value) {
        this._platformType = value;
    }
    /**
     * Sets the publishedDateTime property value. When the template was published
     * @param value Value to set for the publishedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublishedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._publishedDateTime = value;
    }
    /**
     * Sets the settings property value. Collection of all settings this template has
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementSettingInstance> value) {
        this._settings = value;
    }
    /**
     * Sets the templateSubtype property value. Template subtype
     * @param value Value to set for the templateSubtype property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateSubtype(@javax.annotation.Nullable final DeviceManagementTemplateSubtype value) {
        this._templateSubtype = value;
    }
    /**
     * Sets the templateType property value. Template type
     * @param value Value to set for the templateType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateType(@javax.annotation.Nullable final DeviceManagementTemplateType value) {
        this._templateType = value;
    }
    /**
     * Sets the versionInfo property value. The template's version information
     * @param value Value to set for the versionInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersionInfo(@javax.annotation.Nullable final String value) {
        this._versionInfo = value;
    }
}
