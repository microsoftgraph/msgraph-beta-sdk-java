package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceHealthScriptIntegerParameter extends DeviceHealthScriptParameter implements Parsable {
    /** The default value of Integer param. Valid values -2147483648 to 2147483647 */
    private Integer defaultValue;
    /**
     * Instantiates a new DeviceHealthScriptIntegerParameter and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceHealthScriptIntegerParameter() {
        super();
        this.setOdataType("#microsoft.graph.deviceHealthScriptIntegerParameter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceHealthScriptIntegerParameter
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScriptIntegerParameter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptIntegerParameter();
    }
    /**
     * Gets the defaultValue property value. The default value of Integer param. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getIntegerValue()); });
        return deserializerMap;
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
        writer.writeIntegerValue("defaultValue", this.getDefaultValue());
    }
    /**
     * Sets the defaultValue property value. The default value of Integer param. Valid values -2147483648 to 2147483647
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultValue(@javax.annotation.Nullable final Integer value) {
        this.defaultValue = value;
    }
}
