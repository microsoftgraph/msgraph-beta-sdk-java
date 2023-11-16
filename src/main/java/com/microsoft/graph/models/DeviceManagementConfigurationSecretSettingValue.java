package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Graph model for a secret setting value
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationSecretSettingValue extends DeviceManagementConfigurationSimpleSettingValue implements Parsable {
    /**
     * Instantiates a new DeviceManagementConfigurationSecretSettingValue and sets the default values.
     */
    public DeviceManagementConfigurationSecretSettingValue() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSecretSettingValue");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationSecretSettingValue
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSecretSettingValue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSecretSettingValue();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        deserializerMap.put("valueState", (n) -> { this.setValueState(n.getEnumValue(DeviceManagementConfigurationSecretSettingValueState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. Value of the secret setting.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Gets the valueState property value. type tracking the encryption state of a secret setting value
     * @return a DeviceManagementConfigurationSecretSettingValueState
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSecretSettingValueState getValueState() {
        return this.backingStore.get("valueState");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("value", this.getValue());
        writer.writeEnumValue("valueState", this.getValueState());
    }
    /**
     * Sets the value property value. Value of the secret setting.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("value", value);
    }
    /**
     * Sets the valueState property value. type tracking the encryption state of a secret setting value
     * @param value Value to set for the valueState property.
     */
    public void setValueState(@jakarta.annotation.Nullable final DeviceManagementConfigurationSecretSettingValueState value) {
        this.backingStore.set("valueState", value);
    }
}
