package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A key-value pair with a string key and a real (floating-point) value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class KeyRealValuePair extends KeyTypedValuePair implements Parsable {
    /**
     * Instantiates a new KeyRealValuePair and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static KeyRealValuePair createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new KeyRealValuePair();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The real (floating-point) value of the key-value pair.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeDoubleValue("value", this.getValue());
    }
    /**
     * Sets the value property value. The real (floating-point) value of the key-value pair.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("value", value);
    }
}
