package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationIntegerSettingValueDefinition extends DeviceManagementConfigurationSettingValueDefinition implements Parsable {
    /** Maximum allowed value of the integer */
    private Long _maximumValue;
    /** Minimum allowed value of the integer */
    private Long _minimumValue;
    /**
     * Instantiates a new DeviceManagementConfigurationIntegerSettingValueDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationIntegerSettingValueDefinition() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationIntegerSettingValueDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceManagementConfigurationIntegerSettingValueDefinition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationIntegerSettingValueDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationIntegerSettingValueDefinition();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationIntegerSettingValueDefinition currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumValue", (n) -> { currentObject.setMaximumValue(n.getLongValue()); });
        deserializerMap.put("minimumValue", (n) -> { currentObject.setMinimumValue(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumValue property value. Maximum allowed value of the integer
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMaximumValue() {
        return this._maximumValue;
    }
    /**
     * Gets the minimumValue property value. Minimum allowed value of the integer
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMinimumValue() {
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
        writer.writeLongValue("maximumValue", this.getMaximumValue());
        writer.writeLongValue("minimumValue", this.getMinimumValue());
    }
    /**
     * Sets the maximumValue property value. Maximum allowed value of the integer
     * @param value Value to set for the maximumValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumValue(@javax.annotation.Nullable final Long value) {
        this._maximumValue = value;
    }
    /**
     * Sets the minimumValue property value. Minimum allowed value of the integer
     * @param value Value to set for the minimumValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumValue(@javax.annotation.Nullable final Long value) {
        this._minimumValue = value;
    }
}
