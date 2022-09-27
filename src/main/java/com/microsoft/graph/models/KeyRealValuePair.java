package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class KeyRealValuePair extends KeyTypedValuePair implements Parsable {
    /** The real (floating-point) value of the key-value pair. */
    private Double _value;
    /**
     * Instantiates a new KeyRealValuePair and sets the default values.
     * @return a void
     */
    public KeyRealValuePair() {
        super();
        this.setOdataType("#microsoft.graph.keyRealValuePair");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a KeyRealValuePair
     */
    @javax.annotation.Nonnull
    public static KeyRealValuePair createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KeyRealValuePair();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final KeyRealValuePair currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("value", (n) -> { currentObject.setValue(n.getDoubleValue()); });
        }};
    }
    /**
     * Gets the value property value. The real (floating-point) value of the key-value pair.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeDoubleValue("value", this.getValue());
    }
    /**
     * Sets the value property value. The real (floating-point) value of the key-value pair.
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final Double value) {
        this._value = value;
    }
}
