package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceHealthScriptBooleanParameter extends DeviceHealthScriptParameter implements Parsable {
    /** The default value of boolean param */
    private Boolean _defaultValue;
    /**
     * Instantiates a new DeviceHealthScriptBooleanParameter and sets the default values.
     * @return a void
     */
    public DeviceHealthScriptBooleanParameter() {
        super();
        this.setOdataType("#microsoft.graph.deviceHealthScriptBooleanParameter");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceHealthScriptBooleanParameter
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
        return this._defaultValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceHealthScriptBooleanParameter currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("defaultValue", (n) -> { currentObject.setDefaultValue(n.getBooleanValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setDefaultValue(@javax.annotation.Nullable final Boolean value) {
        this._defaultValue = value;
    }
}
