package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementTemplateSettingCategory extends DeviceManagementSettingCategory implements Parsable {
    /** The settings this category contains */
    private java.util.List<DeviceManagementSettingInstance> _recommendedSettings;
    /**
     * Instantiates a new DeviceManagementTemplateSettingCategory and sets the default values.
     * @return a void
     */
    public DeviceManagementTemplateSettingCategory() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementTemplateSettingCategory");
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementTemplateSettingCategory currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("recommendedSettings", (n) -> { currentObject.setRecommendedSettings(n.getCollectionOfObjectValues(DeviceManagementSettingInstance::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the recommendedSettings property value. The settings this category contains
     * @return a deviceManagementSettingInstance
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementSettingInstance> getRecommendedSettings() {
        return this._recommendedSettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setRecommendedSettings(@javax.annotation.Nullable final java.util.List<DeviceManagementSettingInstance> value) {
        this._recommendedSettings = value;
    }
}
