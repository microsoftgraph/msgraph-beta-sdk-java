package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationFloatSettingValueDefinition extends DeviceManagementConfigurationSettingValueDefinition implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationFloatSettingValueDefinition} and sets the default values.
     */
    public DeviceManagementConfigurationFloatSettingValueDefinition() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationFloatSettingValueDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationFloatSettingValueDefinition}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationFloatSettingValueDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationFloatSettingValueDefinition();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumValue", (n) -> { this.setMaximumValue(n.getDoubleValue()); });
        deserializerMap.put("minimumValue", (n) -> { this.setMinimumValue(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumValue property value. Maximum allowed value of the float(double)
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaximumValue() {
        return this.backingStore.get("maximumValue");
    }
    /**
     * Gets the minimumValue property value. Minimum allowed value of the float
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinimumValue() {
        return this.backingStore.get("minimumValue");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeDoubleValue("maximumValue", this.getMaximumValue());
        writer.writeDoubleValue("minimumValue", this.getMinimumValue());
    }
    /**
     * Sets the maximumValue property value. Maximum allowed value of the float(double)
     * @param value Value to set for the maximumValue property.
     */
    public void setMaximumValue(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("maximumValue", value);
    }
    /**
     * Sets the minimumValue property value. Minimum allowed value of the float
     * @param value Value to set for the minimumValue property.
     */
    public void setMinimumValue(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("minimumValue", value);
    }
}
