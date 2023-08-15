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
public class DeviceManagementConfigurationSecretSettingValue extends DeviceManagementConfigurationSimpleSettingValue implements Parsable {
    /**
     * Value of the secret setting.
     */
    private String value;
    /**
     * type tracking the encryption state of a secret setting value
     */
    private DeviceManagementConfigurationSecretSettingValueState valueState;
    /**
     * Instantiates a new deviceManagementConfigurationSecretSettingValue and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSecretSettingValue() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSecretSettingValue");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSecretSettingValue
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Gets the valueState property value. type tracking the encryption state of a secret setting value
     * @return a deviceManagementConfigurationSecretSettingValueState
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationSecretSettingValueState getValueState() {
        return this.valueState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("value", this.getValue());
        writer.writeEnumValue("valueState", this.getValueState());
    }
    /**
     * Sets the value property value. Value of the secret setting.
     * @param value Value to set for the value property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
    /**
     * Sets the valueState property value. type tracking the encryption state of a secret setting value
     * @param value Value to set for the valueState property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setValueState(@jakarta.annotation.Nullable final DeviceManagementConfigurationSecretSettingValueState value) {
        this.valueState = value;
    }
}
