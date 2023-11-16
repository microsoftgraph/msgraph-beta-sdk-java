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
public class DeviceManagementConfigurationChoiceSettingCollectionInstance extends DeviceManagementConfigurationSettingInstance implements Parsable {
    /**
     * Instantiates a new DeviceManagementConfigurationChoiceSettingCollectionInstance and sets the default values.
     */
    public DeviceManagementConfigurationChoiceSettingCollectionInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationChoiceSettingCollectionInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationChoiceSettingCollectionInstance
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingCollectionInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingCollectionInstance();
    }
    /**
     * Gets the choiceSettingCollectionValue property value. Choice setting collection value
     * @return a java.util.List<DeviceManagementConfigurationChoiceSettingValue>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationChoiceSettingValue> getChoiceSettingCollectionValue() {
        return this.backingStore.get("choiceSettingCollectionValue");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("choiceSettingCollectionValue", (n) -> { this.setChoiceSettingCollectionValue(n.getCollectionOfObjectValues(DeviceManagementConfigurationChoiceSettingValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("choiceSettingCollectionValue", this.getChoiceSettingCollectionValue());
    }
    /**
     * Sets the choiceSettingCollectionValue property value. Choice setting collection value
     * @param value Value to set for the choiceSettingCollectionValue property.
     */
    public void setChoiceSettingCollectionValue(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationChoiceSettingValue> value) {
        this.backingStore.set("choiceSettingCollectionValue", value);
    }
}
