package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Integer Setting Value Constant Default Template
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationIntegerSettingValueConstantDefaultTemplate extends DeviceManagementConfigurationIntegerSettingValueDefaultTemplate implements Parsable {
    /**
     * Default Constant Value. Valid values -2147483648 to 2147483647
     */
    private Integer constantValue;
    /**
     * Instantiates a new DeviceManagementConfigurationIntegerSettingValueConstantDefaultTemplate and sets the default values.
     */
    public DeviceManagementConfigurationIntegerSettingValueConstantDefaultTemplate() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationIntegerSettingValueConstantDefaultTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationIntegerSettingValueConstantDefaultTemplate
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationIntegerSettingValueConstantDefaultTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationIntegerSettingValueConstantDefaultTemplate();
    }
    /**
     * Gets the constantValue property value. Default Constant Value. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConstantValue() {
        return this.constantValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("constantValue", (n) -> { this.setConstantValue(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("constantValue", this.getConstantValue());
    }
    /**
     * Sets the constantValue property value. Default Constant Value. Valid values -2147483648 to 2147483647
     * @param value Value to set for the constantValue property.
     */
    public void setConstantValue(@jakarta.annotation.Nullable final Integer value) {
        this.constantValue = value;
    }
}
