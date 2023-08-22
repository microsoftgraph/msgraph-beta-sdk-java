package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Simple setting value
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationStringSettingValue extends DeviceManagementConfigurationSimpleSettingValue implements Parsable {
    /**
     * Value of the string setting.
     */
    private String value;
    /**
     * Instantiates a new deviceManagementConfigurationStringSettingValue and sets the default values.
     */
    public DeviceManagementConfigurationStringSettingValue() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationStringSettingValue");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationStringSettingValue
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationStringSettingValue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementConfigurationReferenceSettingValue": return new DeviceManagementConfigurationReferenceSettingValue();
            }
        }
        return new DeviceManagementConfigurationStringSettingValue();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. Value of the string setting.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the value property value. Value of the string setting.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
