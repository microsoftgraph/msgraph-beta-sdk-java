package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceManagementConfigurationChoiceSettingCollectionDefinition;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationChoiceSettingDefinition extends DeviceManagementConfigurationSettingDefinition implements Parsable {
    /** Default option for choice setting */
    private String _defaultOptionId;
    /** Options for the setting that can be selected */
    private java.util.List<DeviceManagementConfigurationOptionDefinition> _options;
    /**
     * Instantiates a new DeviceManagementConfigurationChoiceSettingDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingDefinition() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationChoiceSettingDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationChoiceSettingDefinition
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
     * Gets the defaultOptionId property value. Default option for choice setting
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultOptionId() {
        return this._defaultOptionId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationChoiceSettingDefinition currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("defaultOptionId", (n) -> { currentObject.setDefaultOptionId(n.getStringValue()); });
            this.put("options", (n) -> { currentObject.setOptions(n.getCollectionOfObjectValues(DeviceManagementConfigurationOptionDefinition::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the options property value. Options for the setting that can be selected
     * @return a deviceManagementConfigurationOptionDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationOptionDefinition> getOptions() {
        return this._options;
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
     * Sets the defaultOptionId property value. Default option for choice setting
     * @param value Value to set for the defaultOptionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultOptionId(@javax.annotation.Nullable final String value) {
        this._defaultOptionId = value;
    }
    /**
     * Sets the options property value. Options for the setting that can be selected
     * @param value Value to set for the options property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOptions(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationOptionDefinition> value) {
        this._options = value;
    }
}
