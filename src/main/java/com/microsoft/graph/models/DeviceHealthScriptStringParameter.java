package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Properties of the  String script parameter.
 */
public class DeviceHealthScriptStringParameter extends DeviceHealthScriptParameter implements Parsable {
    /**
     * The default value of string param
     */
    private String defaultValue;
    /**
     * Instantiates a new deviceHealthScriptStringParameter and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceHealthScriptStringParameter() {
        super();
        this.setOdataType("#microsoft.graph.deviceHealthScriptStringParameter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptStringParameter
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScriptStringParameter createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptStringParameter();
    }
    /**
     * Gets the defaultValue property value. The default value of string param
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getStringValue()); });
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
        writer.writeStringValue("defaultValue", this.getDefaultValue());
    }
    /**
     * Sets the defaultValue property value. The default value of string param
     * @param value Value to set for the defaultValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultValue(@javax.annotation.Nullable final String value) {
        this.defaultValue = value;
    }
}
