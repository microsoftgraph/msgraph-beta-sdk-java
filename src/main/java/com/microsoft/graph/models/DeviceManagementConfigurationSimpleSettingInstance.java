package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationSimpleSettingInstance extends DeviceManagementConfigurationSettingInstance implements Parsable {
    /** The simpleSettingValue property */
    private DeviceManagementConfigurationSimpleSettingValue _simpleSettingValue;
    /**
     * Instantiates a new DeviceManagementConfigurationSimpleSettingInstance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSimpleSettingInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSimpleSettingInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationSimpleSettingInstance
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSimpleSettingInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSimpleSettingInstance();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationSimpleSettingInstance currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("simpleSettingValue", (n) -> { currentObject.setSimpleSettingValue(n.getObjectValue(DeviceManagementConfigurationSimpleSettingValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the simpleSettingValue property value. The simpleSettingValue property
     * @return a deviceManagementConfigurationSimpleSettingValue
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSimpleSettingValue getSimpleSettingValue() {
        return this._simpleSettingValue;
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
        writer.writeObjectValue("simpleSettingValue", this.getSimpleSettingValue());
    }
    /**
     * Sets the simpleSettingValue property value. The simpleSettingValue property
     * @param value Value to set for the simpleSettingValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSimpleSettingValue(@javax.annotation.Nullable final DeviceManagementConfigurationSimpleSettingValue value) {
        this._simpleSettingValue = value;
    }
}
