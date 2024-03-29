package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EdiscoveryReviewSet extends DataSet implements Parsable {
    /**
     * Instantiates a new {@link EdiscoveryReviewSet} and sets the default values.
     */
    public EdiscoveryReviewSet() {
        super();
        this.setOdataType("#microsoft.graph.security.ediscoveryReviewSet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EdiscoveryReviewSet}
     */
    @jakarta.annotation.Nonnull
    public static EdiscoveryReviewSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryReviewSet();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("files", (n) -> { this.setFiles(n.getCollectionOfObjectValues(EdiscoveryFile::createFromDiscriminatorValue)); });
        deserializerMap.put("queries", (n) -> { this.setQueries(n.getCollectionOfObjectValues(EdiscoveryReviewSetQuery::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the files property value. Represents files within the review set.
     * @return a {@link java.util.List<EdiscoveryFile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdiscoveryFile> getFiles() {
        return this.backingStore.get("files");
    }
    /**
     * Gets the queries property value. Represents queries within the review set.
     * @return a {@link java.util.List<EdiscoveryReviewSetQuery>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EdiscoveryReviewSetQuery> getQueries() {
        return this.backingStore.get("queries");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("files", this.getFiles());
        writer.writeCollectionOfObjectValues("queries", this.getQueries());
    }
    /**
     * Sets the files property value. Represents files within the review set.
     * @param value Value to set for the files property.
     */
    public void setFiles(@jakarta.annotation.Nullable final java.util.List<EdiscoveryFile> value) {
        this.backingStore.set("files", value);
    }
    /**
     * Sets the queries property value. Represents queries within the review set.
     * @param value Value to set for the queries property.
     */
    public void setQueries(@jakarta.annotation.Nullable final java.util.List<EdiscoveryReviewSetQuery> value) {
        this.backingStore.set("queries", value);
    }
}
