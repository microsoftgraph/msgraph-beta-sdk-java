package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementTemplateSettingCategory extends DeviceManagementSettingCategory implements Parsable {
    /**
     * The settings this category contains
     */
    private java.util.List<DeviceManagementSettingInstance> recommendedSettings;
    /**
     * Instantiates a new DeviceManagementTemplateSettingCategory and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementTemplateSettingCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementTemplateSettingCategory
     */
    @javax.annotation.Nonnull
    public static DeviceManagementTemplateSettingCategory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementTemplateSettingCategory();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("recommendedSettings", (n) -> { this.setRecommendedSettings(n.getCollectionOfObjectValues(DeviceManagementSettingInstance::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the recommendedSettings property value. The settings this category contains
     * @return a deviceManagementSettingInstance
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementSettingInstance> getRecommendedSettings() {
        return this.recommendedSettings;
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
        writer.writeCollectionOfObjectValues("recommendedSettings", this.getRecommendedSettings());
    }
    /**
     * Sets the recommendedSettings property value. The settings this category contains
     * @param value Value to set for the recommendedSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecommendedSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementSettingInstance> value) {
        this.recommendedSettings = value;
    }
}
