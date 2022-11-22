package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementSettingIntegerConstraint extends DeviceManagementConstraint implements Parsable {
    /** The maximum permitted value */
    private Integer _maximumValue;
    /** The minimum permitted value */
    private Integer _minimumValue;
    /**
     * Instantiates a new DeviceManagementSettingIntegerConstraint and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementSettingIntegerConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingIntegerConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementSettingIntegerConstraint
     */
    @javax.annotation.Nonnull
    public static DeviceManagementSettingIntegerConstraint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingIntegerConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumValue", (n) -> { this.setMaximumValue(n.getIntegerValue()); });
        deserializerMap.put("minimumValue", (n) -> { this.setMinimumValue(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumValue property value. The maximum permitted value
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumValue() {
        return this._maximumValue;
    }
    /**
     * Gets the minimumValue property value. The minimum permitted value
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumValue() {
        return this._minimumValue;
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
        writer.writeIntegerValue("maximumValue", this.getMaximumValue());
        writer.writeIntegerValue("minimumValue", this.getMinimumValue());
    }
    /**
     * Sets the maximumValue property value. The maximum permitted value
     * @param value Value to set for the maximumValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumValue(@javax.annotation.Nullable final Integer value) {
        this._maximumValue = value;
    }
    /**
     * Sets the minimumValue property value. The minimum permitted value
     * @param value Value to set for the minimumValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumValue(@javax.annotation.Nullable final Integer value) {
        this._minimumValue = value;
    }
}
