package com.microsoft.graph.beta.models.ediscovery;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddToReviewSetOperation extends CaseOperation implements Parsable {
    /**
     * Instantiates a new {@link AddToReviewSetOperation} and sets the default values.
     */
    public AddToReviewSetOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AddToReviewSetOperation}
     */
    @jakarta.annotation.Nonnull
    public static AddToReviewSetOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddToReviewSetOperation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("reviewSet", (n) -> { this.setReviewSet(n.getObjectValue(ReviewSet::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceCollection", (n) -> { this.setSourceCollection(n.getObjectValue(SourceCollection::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the reviewSet property value. The review set to which items matching the source collection query are added to.
     * @return a {@link ReviewSet}
     */
    @jakarta.annotation.Nullable
    public ReviewSet getReviewSet() {
        return this.backingStore.get("reviewSet");
    }
    /**
     * Gets the sourceCollection property value. The sourceCollection that items are being added from.
     * @return a {@link SourceCollection}
     */
    @jakarta.annotation.Nullable
    public SourceCollection getSourceCollection() {
        return this.backingStore.get("sourceCollection");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("reviewSet", this.getReviewSet());
        writer.writeObjectValue("sourceCollection", this.getSourceCollection());
    }
    /**
     * Sets the reviewSet property value. The review set to which items matching the source collection query are added to.
     * @param value Value to set for the reviewSet property.
     */
    public void setReviewSet(@jakarta.annotation.Nullable final ReviewSet value) {
        this.backingStore.set("reviewSet", value);
    }
    /**
     * Sets the sourceCollection property value. The sourceCollection that items are being added from.
     * @param value Value to set for the sourceCollection property.
     */
    public void setSourceCollection(@jakarta.annotation.Nullable final SourceCollection value) {
        this.backingStore.set("sourceCollection", value);
    }
}
