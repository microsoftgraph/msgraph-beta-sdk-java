package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Properties of the  Integer script parameter.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceHealthScriptIntegerParameter extends DeviceHealthScriptParameter implements Parsable {
    /**
     * Instantiates a new {@link DeviceHealthScriptIntegerParameter} and sets the default values.
     */
    public DeviceHealthScriptIntegerParameter() {
        super();
        this.setOdataType("#microsoft.graph.deviceHealthScriptIntegerParameter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DeviceHealthScriptIntegerParameter}
     */
    @jakarta.annotation.Nonnull
    public static DeviceHealthScriptIntegerParameter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptIntegerParameter();
    }
    /**
     * Gets the defaultValue property value. The default value of Integer param. Valid values -2147483648 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDefaultValue() {
        return this.backingStore.get("defaultValue");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("defaultValue", this.getDefaultValue());
    }
    /**
     * Sets the defaultValue property value. The default value of Integer param. Valid values -2147483648 to 2147483647
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("defaultValue", value);
    }
}
