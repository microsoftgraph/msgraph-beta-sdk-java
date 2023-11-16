package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Setting instance within policy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationChoiceSettingInstance extends DeviceManagementConfigurationSettingInstance implements Parsable {
    /**
     * Instantiates a new DeviceManagementConfigurationChoiceSettingInstance and sets the default values.
     */
    public DeviceManagementConfigurationChoiceSettingInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationChoiceSettingInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationChoiceSettingInstance
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingInstance();
    }
    /**
     * Gets the choiceSettingValue property value. The choiceSettingValue property
     * @return a DeviceManagementConfigurationChoiceSettingValue
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingValue getChoiceSettingValue() {
        return this.BackingStore.get("choiceSettingValue");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("choiceSettingValue", (n) -> { this.setChoiceSettingValue(n.getObjectValue(DeviceManagementConfigurationChoiceSettingValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("choiceSettingValue", this.getChoiceSettingValue());
    }
    /**
     * Sets the choiceSettingValue property value. The choiceSettingValue property
     * @param value Value to set for the choiceSettingValue property.
     */
    public void setChoiceSettingValue(@jakarta.annotation.Nullable final DeviceManagementConfigurationChoiceSettingValue value) {
        this.BackingStore.set("choiceSettingValue", value);
    }
}
