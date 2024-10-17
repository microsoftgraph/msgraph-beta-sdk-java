package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelatedFileHash extends RelatedResource implements Parsable {
    /**
     * Instantiates a new {@link RelatedFileHash} and sets the default values.
     */
    public RelatedFileHash() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.relatedFileHash");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelatedFileHash}
     */
    @jakarta.annotation.Nonnull
    public static RelatedFileHash createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelatedFileHash();
    }
    /**
     * Gets the algorithm property value. The algorithm property
     * @return a {@link Algorithm}
     */
    @jakarta.annotation.Nullable
    public Algorithm getAlgorithm() {
        return this.backingStore.get("algorithm");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("algorithm", (n) -> { this.setAlgorithm(n.getEnumValue(Algorithm::forValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("algorithm", this.getAlgorithm());
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the algorithm property value. The algorithm property
     * @param value Value to set for the algorithm property.
     */
    public void setAlgorithm(@jakarta.annotation.Nullable final Algorithm value) {
        this.backingStore.set("algorithm", value);
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("value", value);
    }
}
