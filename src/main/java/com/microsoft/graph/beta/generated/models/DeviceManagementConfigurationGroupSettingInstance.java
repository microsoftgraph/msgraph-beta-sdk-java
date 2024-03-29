package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Instance of a GroupSetting
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationGroupSettingInstance extends DeviceManagementConfigurationSettingInstance implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationGroupSettingInstance} and sets the default values.
     */
    public DeviceManagementConfigurationGroupSettingInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationGroupSettingInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationGroupSettingInstance}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationGroupSettingInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationGroupSettingInstance();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupSettingValue", (n) -> { this.setGroupSettingValue(n.getObjectValue(DeviceManagementConfigurationGroupSettingValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupSettingValue property value. The groupSettingValue property
     * @return a {@link DeviceManagementConfigurationGroupSettingValue}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationGroupSettingValue getGroupSettingValue() {
        return this.backingStore.get("groupSettingValue");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("groupSettingValue", this.getGroupSettingValue());
    }
    /**
     * Sets the groupSettingValue property value. The groupSettingValue property
     * @param value Value to set for the groupSettingValue property.
     */
    public void setGroupSettingValue(@jakarta.annotation.Nullable final DeviceManagementConfigurationGroupSettingValue value) {
        this.backingStore.set("groupSettingValue", value);
    }
}
