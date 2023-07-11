package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Base properties of the script parameter.
 */
public class DeviceHealthScriptBooleanParameter extends DeviceHealthScriptParameter implements Parsable {
    /**
     * The default value of boolean param
     */
    private Boolean defaultValue;
    /**
     * Instantiates a new deviceHealthScriptBooleanParameter and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceHealthScriptBooleanParameter() {
        super();
        this.setOdataType("#microsoft.graph.deviceHealthScriptBooleanParameter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptBooleanParameter
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScriptBooleanParameter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptBooleanParameter();
    }
    /**
     * Gets the defaultValue property value. The default value of boolean param
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getBooleanValue()); });
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
        writer.writeBooleanValue("defaultValue", this.getDefaultValue());
    }
    /**
     * Sets the defaultValue property value. The default value of boolean param
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultValue(@javax.annotation.Nullable final Boolean value) {
        this.defaultValue = value;
    }
}
