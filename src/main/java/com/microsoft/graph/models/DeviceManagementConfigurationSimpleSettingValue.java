package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceManagementConfigurationIntegerSettingValue;
import com.microsoft.graph.models.DeviceManagementConfigurationReferenceSettingValue;
import com.microsoft.graph.models.DeviceManagementConfigurationSecretSettingValue;
import com.microsoft.graph.models.DeviceManagementConfigurationStringSettingValue;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Simple setting value */
public class DeviceManagementConfigurationSimpleSettingValue extends DeviceManagementConfigurationSettingValue implements Parsable {
    /**
     * Instantiates a new deviceManagementConfigurationSimpleSettingValue and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSimpleSettingValue() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSimpleSettingValue");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSimpleSettingValue
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSimpleSettingValue createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
