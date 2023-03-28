package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Management Configuration Policy
 */
public class DeviceManagementConfigurationCategory extends Entity implements Parsable {
    /** Description of the category header */
    private String categoryDescription;
    /** List of child ids of the category. */
    private java.util.List<String> childCategoryIds;
    /** Description of the item */
    private String description;
    /** Display name of the item */
    private String displayName;
    /** Help text of the item */
    private String helpText;
    /** Name of the item */
    private String name;
    /** Parent id of the category. */
    private String parentCategoryId;
    /** Supported platform types. */
    private DeviceManagementConfigurationPlatforms platforms;
    /** Root id of the category. */
    private String rootCategoryId;
    /** Supported setting types */
    private DeviceManagementConfigurationSettingUsage settingUsage;
    /** Describes which technology this setting can be deployed with */
    private DeviceManagementConfigurationTechnologies technologies;
    /**
     * Instantiates a new deviceManagementConfigurationCategory and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationCategory
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationCategory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationCategory();
    }
    /**
     * Gets the categoryDescription property value. Description of the category header
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCategoryDescription() {
        return this.categoryDescription;
    }
    /**
     * Gets the childCategoryIds property value. List of child ids of the category.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getChildCategoryIds() {
        return this.childCategoryIds;
    }
    /**
     * Gets the description property value. Description of the item
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Display name of the item
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
        deserializerMap.put("categoryDescription", (n) -> { this.setCategoryDescription(n.getStringValue()); });
        deserializerMap.put("childCategoryIds", (n) -> { this.setChildCategoryIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("helpText", (n) -> { this.setHelpText(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("parentCategoryId", (n) -> { this.setParentCategoryId(n.getStringValue()); });
        deserializerMap.put("platforms", (n) -> { this.setPlatforms(n.getEnumValue(DeviceManagementConfigurationPlatforms.class)); });
        deserializerMap.put("rootCategoryId", (n) -> { this.setRootCategoryId(n.getStringValue()); });
        deserializerMap.put("settingUsage", (n) -> { this.setSettingUsage(n.getEnumValue(DeviceManagementConfigurationSettingUsage.class)); });
        deserializerMap.put("technologies", (n) -> { this.setTechnologies(n.getEnumValue(DeviceManagementConfigurationTechnologies.class)); });
        return deserializerMap;
    }
    /**
     * Gets the helpText property value. Help text of the item
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHelpText() {
        return this.helpText;
    }
    /**
     * Gets the name property value. Name of the item
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the parentCategoryId property value. Parent id of the category.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getParentCategoryId() {
        return this.parentCategoryId;
    }
    /**
     * Gets the platforms property value. Supported platform types.
     * @return a deviceManagementConfigurationPlatforms
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationPlatforms getPlatforms() {
        return this.platforms;
    }
    /**
     * Gets the rootCategoryId property value. Root id of the category.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRootCategoryId() {
        return this.rootCategoryId;
    }
    /**
     * Gets the settingUsage property value. Supported setting types
     * @return a deviceManagementConfigurationSettingUsage
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingUsage getSettingUsage() {
        return this.settingUsage;
    }
    /**
     * Gets the technologies property value. Describes which technology this setting can be deployed with
     * @return a deviceManagementConfigurationTechnologies
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationTechnologies getTechnologies() {
        return this.technologies;
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
        writer.writeStringValue("categoryDescription", this.getCategoryDescription());
        writer.writeCollectionOfPrimitiveValues("childCategoryIds", this.getChildCategoryIds());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("helpText", this.getHelpText());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("parentCategoryId", this.getParentCategoryId());
        writer.writeEnumValue("platforms", this.getPlatforms());
        writer.writeStringValue("rootCategoryId", this.getRootCategoryId());
        writer.writeEnumValue("settingUsage", this.getSettingUsage());
        writer.writeEnumValue("technologies", this.getTechnologies());
    }
    /**
     * Sets the categoryDescription property value. Description of the category header
     * @param value Value to set for the categoryDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategoryDescription(@javax.annotation.Nullable final String value) {
        this.categoryDescription = value;
    }
    /**
     * Sets the childCategoryIds property value. List of child ids of the category.
     * @param value Value to set for the childCategoryIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChildCategoryIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.childCategoryIds = value;
    }
    /**
     * Sets the description property value. Description of the item
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Display name of the item
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the helpText property value. Help text of the item
     * @param value Value to set for the helpText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHelpText(@javax.annotation.Nullable final String value) {
        this.helpText = value;
    }
    /**
     * Sets the name property value. Name of the item
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the parentCategoryId property value. Parent id of the category.
     * @param value Value to set for the parentCategoryId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParentCategoryId(@javax.annotation.Nullable final String value) {
        this.parentCategoryId = value;
    }
    /**
     * Sets the platforms property value. Supported platform types.
     * @param value Value to set for the platforms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatforms(@javax.annotation.Nullable final DeviceManagementConfigurationPlatforms value) {
        this.platforms = value;
    }
    /**
     * Sets the rootCategoryId property value. Root id of the category.
     * @param value Value to set for the rootCategoryId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRootCategoryId(@javax.annotation.Nullable final String value) {
        this.rootCategoryId = value;
    }
    /**
     * Sets the settingUsage property value. Supported setting types
     * @param value Value to set for the settingUsage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingUsage(@javax.annotation.Nullable final DeviceManagementConfigurationSettingUsage value) {
        this.settingUsage = value;
    }
    /**
     * Sets the technologies property value. Describes which technology this setting can be deployed with
     * @param value Value to set for the technologies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTechnologies(@javax.annotation.Nullable final DeviceManagementConfigurationTechnologies value) {
        this.technologies = value;
    }
}
