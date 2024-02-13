package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Simple Setting Instance Template
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationSimpleSettingInstanceTemplate extends DeviceManagementConfigurationSettingInstanceTemplate implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationSimpleSettingInstanceTemplate} and sets the default values.
     */
    public DeviceManagementConfigurationSimpleSettingInstanceTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSimpleSettingInstanceTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationSimpleSettingInstanceTemplate}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSimpleSettingInstanceTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSimpleSettingInstanceTemplate();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("simpleSettingValueTemplate", (n) -> { this.setSimpleSettingValueTemplate(n.getObjectValue(DeviceManagementConfigurationSimpleSettingValueTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the simpleSettingValueTemplate property value. Simple Setting Value Template
     * @return a {@link DeviceManagementConfigurationSimpleSettingValueTemplate}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSimpleSettingValueTemplate getSimpleSettingValueTemplate() {
        return this.backingStore.get("simpleSettingValueTemplate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("simpleSettingValueTemplate", this.getSimpleSettingValueTemplate());
    }
    /**
     * Sets the simpleSettingValueTemplate property value. Simple Setting Value Template
     * @param value Value to set for the simpleSettingValueTemplate property.
     */
    public void setSimpleSettingValueTemplate(@jakarta.annotation.Nullable final DeviceManagementConfigurationSimpleSettingValueTemplate value) {
        this.backingStore.set("simpleSettingValueTemplate", value);
    }
}
