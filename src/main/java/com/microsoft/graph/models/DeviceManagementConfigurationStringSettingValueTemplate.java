package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * String Setting Value Template
 */
public class DeviceManagementConfigurationStringSettingValueTemplate extends DeviceManagementConfigurationSimpleSettingValueTemplate implements Parsable {
    /**
     * String Setting Value Default Template.
     */
    private DeviceManagementConfigurationStringSettingValueDefaultTemplate defaultValue;
    /**
     * Instantiates a new deviceManagementConfigurationStringSettingValueTemplate and sets the default values.
     */
    public DeviceManagementConfigurationStringSettingValueTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationStringSettingValueTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationStringSettingValueTemplate
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationStringSettingValueTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationStringSettingValueTemplate();
    }
    /**
     * Gets the defaultValue property value. String Setting Value Default Template.
     * @return a deviceManagementConfigurationStringSettingValueDefaultTemplate
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationStringSettingValueDefaultTemplate getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getObjectValue(DeviceManagementConfigurationStringSettingValueDefaultTemplate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("defaultValue", this.getDefaultValue());
    }
    /**
     * Sets the defaultValue property value. String Setting Value Default Template.
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final DeviceManagementConfigurationStringSettingValueDefaultTemplate value) {
        this.defaultValue = value;
    }
}
