package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExtractTransformation extends CustomClaimTransformation implements Parsable {
    /**
     * Instantiates a new {@link ExtractTransformation} and sets the default values.
     */
    public ExtractTransformation() {
        super();
        this.setOdataType("#microsoft.graph.extractTransformation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExtractTransformation}
     */
    @jakarta.annotation.Nonnull
    public static ExtractTransformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExtractTransformation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        deserializerMap.put("value2", (n) -> { this.setValue2(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the type property value. The type of extract transformation to apply.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.backingStore.get("type");
    }
    /**
     * Gets the value property value. The value to be used as part of the transformation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Gets the value2 property value. An optional secondary value to be used when dealing with between extract operations.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue2() {
        return this.backingStore.get("value2");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("value", this.getValue());
        writer.writeStringValue("value2", this.getValue2());
    }
    /**
     * Sets the type property value. The type of extract transformation to apply.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("type", value);
    }
    /**
     * Sets the value property value. The value to be used as part of the transformation.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("value", value);
    }
    /**
     * Sets the value2 property value. An optional secondary value to be used when dealing with between extract operations.
     * @param value Value to set for the value2 property.
     */
    public void setValue2(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("value2", value);
    }
}
