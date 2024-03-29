package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Simple setting collection instance
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationSimpleSettingCollectionInstance extends DeviceManagementConfigurationSettingInstance implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationSimpleSettingCollectionInstance} and sets the default values.
     */
    public DeviceManagementConfigurationSimpleSettingCollectionInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSimpleSettingCollectionInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationSimpleSettingCollectionInstance}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSimpleSettingCollectionInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSimpleSettingCollectionInstance();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("simpleSettingCollectionValue", (n) -> { this.setSimpleSettingCollectionValue(n.getCollectionOfObjectValues(DeviceManagementConfigurationSimpleSettingValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the simpleSettingCollectionValue property value. Simple setting collection instance value
     * @return a {@link java.util.List<DeviceManagementConfigurationSimpleSettingValue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSimpleSettingValue> getSimpleSettingCollectionValue() {
        return this.backingStore.get("simpleSettingCollectionValue");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("simpleSettingCollectionValue", this.getSimpleSettingCollectionValue());
    }
    /**
     * Sets the simpleSettingCollectionValue property value. Simple setting collection instance value
     * @param value Value to set for the simpleSettingCollectionValue property.
     */
    public void setSimpleSettingCollectionValue(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSimpleSettingValue> value) {
        this.backingStore.set("simpleSettingCollectionValue", value);
    }
}
