package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationChoiceSettingInstance extends DeviceManagementConfigurationSettingInstance implements Parsable {
    /** The choiceSettingValue property */
    private DeviceManagementConfigurationChoiceSettingValue _choiceSettingValue;
    /**
     * Instantiates a new DeviceManagementConfigurationChoiceSettingInstance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationChoiceSettingInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationChoiceSettingInstance
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationChoiceSettingInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationChoiceSettingInstance();
    }
    /**
     * Gets the choiceSettingValue property value. The choiceSettingValue property
     * @return a deviceManagementConfigurationChoiceSettingValue
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationChoiceSettingValue getChoiceSettingValue() {
        return this._choiceSettingValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationChoiceSettingInstance currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("choiceSettingValue", (n) -> { currentObject.setChoiceSettingValue(n.getObjectValue(DeviceManagementConfigurationChoiceSettingValue::createFromDiscriminatorValue)); });
        return deserializerMap
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
        writer.writeObjectValue("choiceSettingValue", this.getChoiceSettingValue());
    }
    /**
     * Sets the choiceSettingValue property value. The choiceSettingValue property
     * @param value Value to set for the choiceSettingValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChoiceSettingValue(@javax.annotation.Nullable final DeviceManagementConfigurationChoiceSettingValue value) {
        this._choiceSettingValue = value;
    }
}
