package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IfEmptyTransformation extends CustomClaimTransformation implements Parsable {
    /**
     * Instantiates a new {@link IfEmptyTransformation} and sets the default values.
     */
    public IfEmptyTransformation() {
        super();
        this.setOdataType("#microsoft.graph.ifEmptyTransformation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IfEmptyTransformation}
     */
    @jakarta.annotation.Nonnull
    public static IfEmptyTransformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IfEmptyTransformation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("output", (n) -> { this.setOutput(n.getObjectValue(TransformationAttribute::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the output property value. The output property
     * @return a {@link TransformationAttribute}
     */
    @jakarta.annotation.Nullable
    public TransformationAttribute getOutput() {
        return this.backingStore.get("output");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("output", this.getOutput());
    }
    /**
     * Sets the output property value. The output property
     * @param value Value to set for the output property.
     */
    public void setOutput(@jakarta.annotation.Nullable final TransformationAttribute value) {
        this.backingStore.set("output", value);
    }
}
