package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Constraint enforcing the permitted value range for an integer setting
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettingIntegerConstraint extends DeviceManagementConstraint implements Parsable {
    /**
     * Instantiates a new DeviceManagementSettingIntegerConstraint and sets the default values.
     */
    public DeviceManagementSettingIntegerConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingIntegerConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingIntegerConstraint
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingIntegerConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingIntegerConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumValue", (n) -> { this.setMaximumValue(n.getIntegerValue()); });
        deserializerMap.put("minimumValue", (n) -> { this.setMinimumValue(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumValue property value. The maximum permitted value
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumValue() {
        return this.BackingStore.get("maximumValue");
    }
    /**
     * Gets the minimumValue property value. The minimum permitted value
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumValue() {
        return this.BackingStore.get("minimumValue");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("maximumValue", this.getMaximumValue());
        writer.writeIntegerValue("minimumValue", this.getMinimumValue());
    }
    /**
     * Sets the maximumValue property value. The maximum permitted value
     * @param value Value to set for the maximumValue property.
     */
    public void setMaximumValue(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("maximumValue", value);
    }
    /**
     * Sets the minimumValue property value. The minimum permitted value
     * @param value Value to set for the minimumValue property.
     */
    public void setMinimumValue(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("minimumValue", value);
    }
}
