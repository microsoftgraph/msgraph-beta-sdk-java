package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Management Configuration Policy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationCategory extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationCategory} and sets the default values.
     */
    public DeviceManagementConfigurationCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationCategory}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationCategory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationCategory();
    }
    /**
     * Gets the categoryDescription property value. Description of the category header in policy summary.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryDescription() {
        return this.backingStore.get("categoryDescription");
    }
    /**
     * Gets the childCategoryIds property value. List of child ids of the category.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getChildCategoryIds() {
        return this.backingStore.get("childCategoryIds");
    }
    /**
     * Gets the description property value. Description of the category. For example: Display
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Name of the category. For example: Device Lock
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("categoryDescription", (n) -> { this.setCategoryDescription(n.getStringValue()); });
        deserializerMap.put("childCategoryIds", (n) -> { this.setChildCategoryIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("helpText", (n) -> { this.setHelpText(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("parentCategoryId", (n) -> { this.setParentCategoryId(n.getStringValue()); });
        deserializerMap.put("platforms", (n) -> { this.setPlatforms(n.getEnumSetValue(DeviceManagementConfigurationPlatforms::forValue)); });
        deserializerMap.put("rootCategoryId", (n) -> { this.setRootCategoryId(n.getStringValue()); });
        deserializerMap.put("settingUsage", (n) -> { this.setSettingUsage(n.getEnumSetValue(DeviceManagementConfigurationSettingUsage::forValue)); });
        deserializerMap.put("technologies", (n) -> { this.setTechnologies(n.getEnumSetValue(DeviceManagementConfigurationTechnologies::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the helpText property value. Help text of the category. Give more details of the category.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHelpText() {
        return this.backingStore.get("helpText");
    }
    /**
     * Gets the name property value. Name of the item
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the parentCategoryId property value. Direct parent id of the category. If the category is the root, the parent id is same as its id.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentCategoryId() {
        return this.backingStore.get("parentCategoryId");
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
     * Gets the rootCategoryId property value. Root id of the category.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRootCategoryId() {
        return this.backingStore.get("rootCategoryId");
    }
    /**
     * Gets the settingUsage property value. Supported setting types
     * @return a {@link EnumSet<DeviceManagementConfigurationSettingUsage>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<DeviceManagementConfigurationSettingUsage> getSettingUsage() {
        return this.backingStore.get("settingUsage");
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
        writer.writeStringValue("categoryDescription", this.getCategoryDescription());
        writer.writeCollectionOfPrimitiveValues("childCategoryIds", this.getChildCategoryIds());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("helpText", this.getHelpText());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("parentCategoryId", this.getParentCategoryId());
        writer.writeEnumSetValue("platforms", this.getPlatforms());
        writer.writeStringValue("rootCategoryId", this.getRootCategoryId());
        writer.writeEnumSetValue("settingUsage", this.getSettingUsage());
        writer.writeEnumSetValue("technologies", this.getTechnologies());
    }
    /**
     * Sets the categoryDescription property value. Description of the category header in policy summary.
     * @param value Value to set for the categoryDescription property.
     */
    public void setCategoryDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("categoryDescription", value);
    }
    /**
     * Sets the childCategoryIds property value. List of child ids of the category.
     * @param value Value to set for the childCategoryIds property.
     */
    public void setChildCategoryIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("childCategoryIds", value);
    }
    /**
     * Sets the description property value. Description of the category. For example: Display
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Name of the category. For example: Device Lock
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the helpText property value. Help text of the category. Give more details of the category.
     * @param value Value to set for the helpText property.
     */
    public void setHelpText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("helpText", value);
    }
    /**
     * Sets the name property value. Name of the item
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the parentCategoryId property value. Direct parent id of the category. If the category is the root, the parent id is same as its id.
     * @param value Value to set for the parentCategoryId property.
     */
    public void setParentCategoryId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentCategoryId", value);
    }
    /**
     * Sets the platforms property value. Supported platform types.
     * @param value Value to set for the platforms property.
     */
    public void setPlatforms(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationPlatforms> value) {
        this.backingStore.set("platforms", value);
    }
    /**
     * Sets the rootCategoryId property value. Root id of the category.
     * @param value Value to set for the rootCategoryId property.
     */
    public void setRootCategoryId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("rootCategoryId", value);
    }
    /**
     * Sets the settingUsage property value. Supported setting types
     * @param value Value to set for the settingUsage property.
     */
    public void setSettingUsage(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationSettingUsage> value) {
        this.backingStore.set("settingUsage", value);
    }
    /**
     * Sets the technologies property value. Describes which technology this setting can be deployed with
     * @param value Value to set for the technologies property.
     */
    public void setTechnologies(@jakarta.annotation.Nullable final EnumSet<DeviceManagementConfigurationTechnologies> value) {
        this.backingStore.set("technologies", value);
    }
}
