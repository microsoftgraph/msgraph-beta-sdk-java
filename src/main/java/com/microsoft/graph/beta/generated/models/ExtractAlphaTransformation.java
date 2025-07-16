package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExtractAlphaTransformation extends CustomClaimTransformation implements Parsable {
    /**
     * Instantiates a new {@link ExtractAlphaTransformation} and sets the default values.
     */
    public ExtractAlphaTransformation() {
        super();
        this.setOdataType("#microsoft.graph.extractAlphaTransformation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExtractAlphaTransformation}
     */
    @jakarta.annotation.Nonnull
    public static ExtractAlphaTransformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExtractAlphaTransformation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(TransformationExtractType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the type property value. The type property
     * @return a {@link TransformationExtractType}
     */
    @jakarta.annotation.Nullable
    public TransformationExtractType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final TransformationExtractType value) {
        this.backingStore.set("type", value);
    }
}
