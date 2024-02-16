package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Setting value
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationChoiceSettingValue extends DeviceManagementConfigurationSettingValue implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationChoiceSettingValue} and sets the default values.
     */
    public DeviceManagementConfigurationChoiceSettingValue() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationChoiceSettingValue");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationChoiceSettingValue}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingValue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingValue();
    }
    /**
     * Gets the children property value. Child settings.
     * @return a {@link java.util.List<DeviceManagementConfigurationSettingInstance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationSettingInstance> getChildren() {
        return this.backingStore.get("children");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("children", (n) -> { this.setChildren(n.getCollectionOfObjectValues(DeviceManagementConfigurationSettingInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. Choice setting value: an OptionDefinition ItemId.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("children", this.getChildren());
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the children property value. Child settings.
     * @param value Value to set for the children property.
     */
    public void setChildren(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationSettingInstance> value) {
        this.backingStore.set("children", value);
    }
    /**
     * Sets the value property value. Choice setting value: an OptionDefinition ItemId.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("value", value);
    }
}
