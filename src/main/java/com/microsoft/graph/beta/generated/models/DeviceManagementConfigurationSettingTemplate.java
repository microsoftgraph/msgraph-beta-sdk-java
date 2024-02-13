package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Setting Template
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationSettingTemplate extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationSettingTemplate} and sets the default values.
     */
    public DeviceManagementConfigurationSettingTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationSettingTemplate}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSettingTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSettingTemplate();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("settingDefinitions", (n) -> { this.setSettingDefinitions(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("settingInstanceTemplate", (n) -> { this.setSettingInstanceTemplate(n.getObjectValue(DeviceManagementConfigurationSettingInstanceTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settingDefinitions property value. List of related Setting Definitions
     * @return a {@link java.util.List<DeviceManagementConfigurationSettingDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingDefinition> getSettingDefinitions() {
        return this.backingStore.get("settingDefinitions");
    }
    /**
     * Gets the settingInstanceTemplate property value. Setting Instance Template
     * @return a {@link DeviceManagementConfigurationSettingInstanceTemplate}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSettingInstanceTemplate getSettingInstanceTemplate() {
        return this.backingStore.get("settingInstanceTemplate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("settingDefinitions", this.getSettingDefinitions());
        writer.writeObjectValue("settingInstanceTemplate", this.getSettingInstanceTemplate());
    }
    /**
     * Sets the settingDefinitions property value. List of related Setting Definitions
     * @param value Value to set for the settingDefinitions property.
     */
    public void setSettingDefinitions(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingDefinition> value) {
        this.backingStore.set("settingDefinitions", value);
    }
    /**
     * Sets the settingInstanceTemplate property value. Setting Instance Template
     * @param value Value to set for the settingInstanceTemplate property.
     */
    public void setSettingInstanceTemplate(@jakarta.annotation.Nullable final DeviceManagementConfigurationSettingInstanceTemplate value) {
        this.backingStore.set("settingInstanceTemplate", value);
    }
}
