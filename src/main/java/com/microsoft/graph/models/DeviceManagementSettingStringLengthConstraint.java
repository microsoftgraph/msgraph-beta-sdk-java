package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Constraint enforcing a given string length range
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementSettingStringLengthConstraint extends DeviceManagementConstraint implements Parsable {
    /**
     * The maximum permitted string length
     */
    private Integer maximumLength;
    /**
     * The minimum permitted string length
     */
    private Integer minimumLength;
    /**
     * Instantiates a new deviceManagementSettingStringLengthConstraint and sets the default values.
     */
    public DeviceManagementSettingStringLengthConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementSettingStringLengthConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementSettingStringLengthConstraint
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementSettingStringLengthConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementSettingStringLengthConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("maximumLength", (n) -> { this.setMaximumLength(n.getIntegerValue()); });
        deserializerMap.put("minimumLength", (n) -> { this.setMinimumLength(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumLength property value. The maximum permitted string length
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumLength() {
        return this.maximumLength;
    }
    /**
     * Gets the minimumLength property value. The minimum permitted string length
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumLength() {
        return this.minimumLength;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("maximumLength", this.getMaximumLength());
        writer.writeIntegerValue("minimumLength", this.getMinimumLength());
    }
    /**
     * Sets the maximumLength property value. The maximum permitted string length
     * @param value Value to set for the maximumLength property.
     */
    public void setMaximumLength(@jakarta.annotation.Nullable final Integer value) {
        this.maximumLength = value;
    }
    /**
     * Sets the minimumLength property value. The minimum permitted string length
     * @param value Value to set for the minimumLength property.
     */
    public void setMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.minimumLength = value;
    }
}
