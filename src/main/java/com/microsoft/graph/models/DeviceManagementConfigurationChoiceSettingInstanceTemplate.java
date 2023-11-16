package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Choice Setting Instance Template
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationChoiceSettingInstanceTemplate extends DeviceManagementConfigurationSettingInstanceTemplate implements Parsable {
    /**
     * Instantiates a new DeviceManagementConfigurationChoiceSettingInstanceTemplate and sets the default values.
     */
    public DeviceManagementConfigurationChoiceSettingInstanceTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationChoiceSettingInstanceTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationChoiceSettingInstanceTemplate
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingInstanceTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingInstanceTemplate();
    }
    /**
     * Gets the choiceSettingValueTemplate property value. Choice Setting Value Template
     * @return a DeviceManagementConfigurationChoiceSettingValueTemplate
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingValueTemplate getChoiceSettingValueTemplate() {
        return this.BackingStore.get("choiceSettingValueTemplate");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("choiceSettingValueTemplate", (n) -> { this.setChoiceSettingValueTemplate(n.getObjectValue(DeviceManagementConfigurationChoiceSettingValueTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("choiceSettingValueTemplate", this.getChoiceSettingValueTemplate());
    }
    /**
     * Sets the choiceSettingValueTemplate property value. Choice Setting Value Template
     * @param value Value to set for the choiceSettingValueTemplate property.
     */
    public void setChoiceSettingValueTemplate(@jakarta.annotation.Nullable final DeviceManagementConfigurationChoiceSettingValueTemplate value) {
        this.BackingStore.set("choiceSettingValueTemplate", value);
    }
}
