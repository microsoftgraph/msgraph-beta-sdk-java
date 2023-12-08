package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity representing an intent setting category
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementIntentSettingCategory extends DeviceManagementSettingCategory implements Parsable {
    /**
     * Instantiates a new DeviceManagementIntentSettingCategory and sets the default values.
     */
    public DeviceManagementIntentSettingCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementIntentSettingCategory
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementIntentSettingCategory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementIntentSettingCategory();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getCollectionOfObjectValues(DeviceManagementSettingInstance::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the settings property value. The settings this category contains
     * @return a java.util.List<DeviceManagementSettingInstance>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementSettingInstance> getSettings() {
        return this.backingStore.get("settings");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("settings", this.getSettings());
    }
    /**
     * Sets the settings property value. The settings this category contains
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final java.util.List<DeviceManagementSettingInstance> value) {
        this.backingStore.set("settings", value);
    }
}
