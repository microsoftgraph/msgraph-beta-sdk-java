package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementIntegerSettingInstance extends DeviceManagementSettingInstance implements Parsable {
    /** The integer value */
    private Integer _value;
    /**
     * Instantiates a new DeviceManagementIntegerSettingInstance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementIntegerSettingInstance() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementIntegerSettingInstance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementIntegerSettingInstance
     */
    @javax.annotation.Nonnull
    public static DeviceManagementIntegerSettingInstance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementIntegerSettingInstance();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementIntegerSettingInstance currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("value", (n) -> { currentObject.setValue(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the value property value. The integer value
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getValue() {
        return this._value;
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
        writer.writeIntegerValue("value", this.getValue());
    }
    /**
     * Sets the value property value. The integer value
     * @param value Value to set for the value property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValue(@javax.annotation.Nullable final Integer value) {
        this._value = value;
    }
}
