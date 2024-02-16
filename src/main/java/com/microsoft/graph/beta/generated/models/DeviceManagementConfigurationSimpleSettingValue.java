package com.microsoft.graph.beta.models;

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
public class DeviceManagementConfigurationSimpleSettingValue extends DeviceManagementConfigurationSettingValue implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationSimpleSettingValue} and sets the default values.
     */
    public DeviceManagementConfigurationSimpleSettingValue() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSimpleSettingValue");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationSimpleSettingValue}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSimpleSettingValue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementConfigurationIntegerSettingValue": return new DeviceManagementConfigurationIntegerSettingValue();
                case "#microsoft.graph.deviceManagementConfigurationReferenceSettingValue": return new DeviceManagementConfigurationReferenceSettingValue();
                case "#microsoft.graph.deviceManagementConfigurationSecretSettingValue": return new DeviceManagementConfigurationSecretSettingValue();
                case "#microsoft.graph.deviceManagementConfigurationStringSettingValue": return new DeviceManagementConfigurationStringSettingValue();
            }
        }
        return new DeviceManagementConfigurationSimpleSettingValue();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
