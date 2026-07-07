package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * String Setting Value Constant Default Template Original name: DeviceManagementConfigurationStringSettingValueConstantDefaultTemplate
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationStringSettingValueConstant_a54093e9 extends DeviceManagementConfigurationStringSettingValueDefaultTemplate implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationStringSettingValueConstant_a54093e9} and sets the default values.
     */
    public DeviceManagementConfigurationStringSettingValueConstant_a54093e9() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationStringSettingValueConstantDefaultTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationStringSettingValueConstant_a54093e9}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationStringSettingValueConstant_a54093e9 createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationStringSettingValueConstant_a54093e9();
    }
    /**
     * Gets the constantValue property value. Default Constant Value
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConstantValue() {
        return this.backingStore.get("constantValue");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("constantValue", (n) -> { this.setConstantValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("constantValue", this.getConstantValue());
    }
    /**
     * Sets the constantValue property value. Default Constant Value
     * @param value Value to set for the constantValue property.
     */
    public void setConstantValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("constantValue", value);
    }
}
