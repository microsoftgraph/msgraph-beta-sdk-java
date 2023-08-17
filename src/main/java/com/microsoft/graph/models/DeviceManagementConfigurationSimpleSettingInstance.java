package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Simple setting instance
 */
public class DeviceManagementConfigurationSimpleSettingInstance extends DeviceManagementConfigurationSettingInstance implements Parsable {
    /**
     * The simpleSettingValue property
     */
    private DeviceManagementConfigurationSimpleSettingValue simpleSettingValue;
    /**
     * Instantiates a new deviceManagementConfigurationSimpleSettingInstance and sets the default values.
     */
    public DeviceManagementConfigurationSimpleSettingInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSimpleSettingInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSimpleSettingInstance
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSimpleSettingInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSimpleSettingInstance();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("simpleSettingValue", (n) -> { this.setSimpleSettingValue(n.getObjectValue(DeviceManagementConfigurationSimpleSettingValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the simpleSettingValue property value. The simpleSettingValue property
     * @return a deviceManagementConfigurationSimpleSettingValue
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSimpleSettingValue getSimpleSettingValue() {
        return this.simpleSettingValue;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("simpleSettingValue", this.getSimpleSettingValue());
    }
    /**
     * Sets the simpleSettingValue property value. The simpleSettingValue property
     * @param value Value to set for the simpleSettingValue property.
     */
    public void setSimpleSettingValue(@jakarta.annotation.Nullable final DeviceManagementConfigurationSimpleSettingValue value) {
        this.simpleSettingValue = value;
    }
}
