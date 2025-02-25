package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationChoiceSettingDefinition extends DeviceManagementConfigurationSettingDefinition implements Parsable {
    /**
     * Instantiates a new {@link DeviceManagementConfigurationChoiceSettingDefinition} and sets the default values.
     */
    public DeviceManagementConfigurationChoiceSettingDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceManagementConfigurationChoiceSettingDefinition}
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementConfigurationChoiceSettingCollectionDefinition": return new DeviceManagementConfigurationChoiceSettingCollectionDefinition();
            }
        }
        return new DeviceManagementConfigurationChoiceSettingDefinition();
    }
    /**
     * Gets the defaultOptionId property value. Default option for the choice setting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultOptionId() {
        return this.backingStore.get("defaultOptionId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultOptionId", (n) -> { this.setDefaultOptionId(n.getStringValue()); });
        deserializerMap.put("options", (n) -> { this.setOptions(n.getCollectionOfObjectValues(DeviceManagementConfigurationOptionDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the options property value. Options for the setting that can be selected.
     * @return a {@link java.util.List<DeviceManagementConfigurationOptionDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationOptionDefinition> getOptions() {
        return this.backingStore.get("options");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("defaultOptionId", this.getDefaultOptionId());
        writer.writeCollectionOfObjectValues("options", this.getOptions());
    }
    /**
     * Sets the defaultOptionId property value. Default option for the choice setting.
     * @param value Value to set for the defaultOptionId property.
     */
    public void setDefaultOptionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultOptionId", value);
    }
    /**
     * Sets the options property value. Options for the setting that can be selected.
     * @param value Value to set for the options property.
     */
    public void setOptions(@jakarta.annotation.Nullable final java.util.List<DeviceManagementConfigurationOptionDefinition> value) {
        this.backingStore.set("options", value);
    }
}
