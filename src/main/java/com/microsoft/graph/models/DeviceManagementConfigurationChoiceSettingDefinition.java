package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationChoiceSettingDefinition extends DeviceManagementConfigurationSettingDefinition implements Parsable {
    /**
     * Default option for the choice setting.
     */
    private String defaultOptionId;
    /**
     * Options for the setting that can be selected.
     */
    private java.util.List<DeviceManagementConfigurationOptionDefinition> options;
    /**
     * Instantiates a new deviceManagementConfigurationChoiceSettingDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationChoiceSettingDefinition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultOptionId() {
        return this.defaultOptionId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultOptionId", (n) -> { this.setDefaultOptionId(n.getStringValue()); });
        deserializerMap.put("options", (n) -> { this.setOptions(n.getCollectionOfObjectValues(DeviceManagementConfigurationOptionDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the options property value. Options for the setting that can be selected.
     * @return a deviceManagementConfigurationOptionDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationOptionDefinition> getOptions() {
        return this.options;
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
        writer.writeStringValue("defaultOptionId", this.getDefaultOptionId());
        writer.writeCollectionOfObjectValues("options", this.getOptions());
    }
    /**
     * Sets the defaultOptionId property value. Default option for the choice setting.
     * @param value Value to set for the defaultOptionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultOptionId(@javax.annotation.Nullable final String value) {
        this.defaultOptionId = value;
    }
    /**
     * Sets the options property value. Options for the setting that can be selected.
     * @param value Value to set for the options property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOptions(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationOptionDefinition> value) {
        this.options = value;
    }
}
