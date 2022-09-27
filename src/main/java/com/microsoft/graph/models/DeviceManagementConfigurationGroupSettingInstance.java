package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationGroupSettingInstance extends DeviceManagementConfigurationSettingInstance implements Parsable {
    /** The groupSettingValue property */
    private DeviceManagementConfigurationGroupSettingValue _groupSettingValue;
    /**
     * Instantiates a new DeviceManagementConfigurationGroupSettingInstance and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationGroupSettingInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationGroupSettingInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationGroupSettingInstance
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationGroupSettingInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationGroupSettingInstance();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationGroupSettingInstance currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("groupSettingValue", (n) -> { currentObject.setGroupSettingValue(n.getObjectValue(DeviceManagementConfigurationGroupSettingValue::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the groupSettingValue property value. The groupSettingValue property
     * @return a deviceManagementConfigurationGroupSettingValue
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationGroupSettingValue getGroupSettingValue() {
        return this._groupSettingValue;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("groupSettingValue", this.getGroupSettingValue());
    }
    /**
     * Sets the groupSettingValue property value. The groupSettingValue property
     * @param value Value to set for the groupSettingValue property.
     * @return a void
     */
    public void setGroupSettingValue(@javax.annotation.Nullable final DeviceManagementConfigurationGroupSettingValue value) {
        this._groupSettingValue = value;
    }
}
