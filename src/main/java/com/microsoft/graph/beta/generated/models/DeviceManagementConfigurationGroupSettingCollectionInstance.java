package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Instance of a GroupSettingCollection
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationGroupSettingCollectionInstance extends DeviceManagementConfigurationSettingInstance implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationGroupSettingCollectionInstance} and sets the default values.
     */
    public DeviceManagementConfigurationGroupSettingCollectionInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationGroupSettingCollectionInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationGroupSettingCollectionInstance}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationGroupSettingCollectionInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationGroupSettingCollectionInstance();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupSettingCollectionValue", (n) -> { this.setGroupSettingCollectionValue(n.getCollectionOfObjectValues(DeviceManagementConfigurationGroupSettingValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupSettingCollectionValue property value. A collection of GroupSetting values
     * @return a {@link java.util.List<DeviceManagementConfigurationGroupSettingValue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationGroupSettingValue> getGroupSettingCollectionValue() {
        return this.backingStore.get("groupSettingCollectionValue");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("groupSettingCollectionValue", this.getGroupSettingCollectionValue());
    }
    /**
     * Sets the groupSettingCollectionValue property value. A collection of GroupSetting values
     * @param value Value to set for the groupSettingCollectionValue property.
     */
    public void setGroupSettingCollectionValue(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationGroupSettingValue> value) {
        this.backingStore.set("groupSettingCollectionValue", value);
    }
}
