package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity representing a template setting category
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementTemplateSettingCategory extends DeviceManagementSettingCategory implements Parsable {
    /**
     * Instantiates a new DeviceManagementTemplateSettingCategory and sets the default values.
     */
    public DeviceManagementTemplateSettingCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementTemplateSettingCategory
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementTemplateSettingCategory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementTemplateSettingCategory();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("recommendedSettings", (n) -> { this.setRecommendedSettings(n.getCollectionOfObjectValues(DeviceManagementSettingInstance::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the recommendedSettings property value. The settings this category contains
     * @return a java.util.List<DeviceManagementSettingInstance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementSettingInstance> getRecommendedSettings() {
        return this.BackingStore.get("recommendedSettings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("recommendedSettings", this.getRecommendedSettings());
    }
    /**
     * Sets the recommendedSettings property value. The settings this category contains
     * @param value Value to set for the recommendedSettings property.
     */
    public void setRecommendedSettings(@jakarta.annotation.Nullable final java.util.List<DeviceManagementSettingInstance> value) {
        this.BackingStore.set("recommendedSettings", value);
    }
}
