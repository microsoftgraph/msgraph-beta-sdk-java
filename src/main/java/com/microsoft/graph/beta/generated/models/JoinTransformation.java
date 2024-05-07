package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JoinTransformation extends CustomClaimTransformation implements Parsable {
    /**
     * Instantiates a new {@link JoinTransformation} and sets the default values.
     */
    public JoinTransformation() {
        super();
        this.setOdataType("#microsoft.graph.joinTransformation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link JoinTransformation}
     */
    @jakarta.annotation.Nonnull
    public static JoinTransformation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JoinTransformation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("input2", (n) -> { this.setInput2(n.getObjectValue(TransformationAttribute::createFromDiscriminatorValue)); });
        deserializerMap.put("separator", (n) -> { this.setSeparator(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the input2 property value. The input2 property
     * @return a {@link TransformationAttribute}
     */
    @jakarta.annotation.Nullable
    public TransformationAttribute getInput2() {
        return this.backingStore.get("input2");
    }
    /**
     * Gets the separator property value. The separator property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSeparator() {
        return this.backingStore.get("separator");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("input2", this.getInput2());
        writer.writeStringValue("separator", this.getSeparator());
    }
    /**
     * Sets the input2 property value. The input2 property
     * @param value Value to set for the input2 property.
     */
    public void setInput2(@jakarta.annotation.Nullable final TransformationAttribute value) {
        this.backingStore.set("input2", value);
    }
    /**
     * Sets the separator property value. The separator property
     * @param value Value to set for the separator property.
     */
    public void setSeparator(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("separator", value);
    }
}
