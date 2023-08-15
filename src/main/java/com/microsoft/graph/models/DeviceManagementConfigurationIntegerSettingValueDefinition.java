package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationIntegerSettingValueDefinition extends DeviceManagementConfigurationSettingValueDefinition implements Parsable {
    /**
     * Maximum allowed value of the integer
     */
    private Long maximumValue;
    /**
     * Minimum allowed value of the integer
     */
    private Long minimumValue;
    /**
     * Instantiates a new deviceManagementConfigurationIntegerSettingValueDefinition and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeviceManagementConfigurationIntegerSettingValueDefinition() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationIntegerSettingValueDefinition");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationIntegerSettingValueDefinition
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationIntegerSettingValueDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationIntegerSettingValueDefinition();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumValue", (n) -> { this.setMaximumValue(n.getLongValue()); });
        deserializerMap.put("minimumValue", (n) -> { this.setMinimumValue(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumValue property value. Maximum allowed value of the integer
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getMaximumValue() {
        return this.maximumValue;
    }
    /**
     * Gets the minimumValue property value. Minimum allowed value of the integer
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getMinimumValue() {
        return this.minimumValue;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setMaximumValue(@jakarta.annotation.Nullable final Long value) {
        this.maximumValue = value;
    }
    /**
     * Sets the minimumValue property value. Minimum allowed value of the integer
     * @param value Value to set for the minimumValue property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMinimumValue(@jakarta.annotation.Nullable final Long value) {
        this.minimumValue = value;
    }
}
