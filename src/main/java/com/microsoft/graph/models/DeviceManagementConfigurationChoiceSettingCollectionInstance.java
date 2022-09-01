package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationChoiceSettingCollectionInstance extends DeviceManagementConfigurationSettingInstance implements Parsable {
    /** Choice setting collection value */
    private java.util.List<DeviceManagementConfigurationChoiceSettingValue> _choiceSettingCollectionValue;
    /**
     * Instantiates a new DeviceManagementConfigurationChoiceSettingCollectionInstance and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingCollectionInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingCollectionInstance();
    }
    /**
     * Gets the choiceSettingCollectionValue property value. Choice setting collection value
     * @return a deviceManagementConfigurationChoiceSettingValue
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementConfigurationChoiceSettingValue> getChoiceSettingCollectionValue() {
        return this._choiceSettingCollectionValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationChoiceSettingCollectionInstance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("choiceSettingCollectionValue", (n) -> { currentObject.setChoiceSettingCollectionValue(n.getCollectionOfObjectValues(DeviceManagementConfigurationChoiceSettingValue::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("choiceSettingCollectionValue", this.getChoiceSettingCollectionValue());
    }
    /**
     * Sets the choiceSettingCollectionValue property value. Choice setting collection value
     * @param value Value to set for the choiceSettingCollectionValue property.
     * @return a void
     */
    public void setChoiceSettingCollectionValue(@javax.annotation.Nullable final java.util.List<DeviceManagementConfigurationChoiceSettingValue> value) {
        this._choiceSettingCollectionValue = value;
    }
}
