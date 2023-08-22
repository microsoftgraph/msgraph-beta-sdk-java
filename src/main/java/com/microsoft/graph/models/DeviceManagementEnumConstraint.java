package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Constraint that enforces the setting value is from a permitted set of strings
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementEnumConstraint extends DeviceManagementConstraint implements Parsable {
    /**
     * List of valid values for this string
     */
    private java.util.List<DeviceManagementEnumValue> values;
    /**
     * Instantiates a new deviceManagementEnumConstraint and sets the default values.
     */
    public DeviceManagementEnumConstraint() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagementEnumConstraint");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementEnumConstraint
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementEnumConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementEnumConstraint();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfObjectValues(DeviceManagementEnumValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the values property value. List of valid values for this string
     * @return a deviceManagementEnumValue
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceManagementEnumValue> getValues() {
        return this.values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("values", this.getValues());
    }
    /**
     * Sets the values property value. List of valid values for this string
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final java.util.List<DeviceManagementEnumValue> value) {
        this.values = value;
    }
}
