package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Document extends Entity implements Parsable {
    /** The comments property */
    private java.util.List<DocumentComment> comments;
    /**
     * Instantiates a new Document and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Document() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Document
     */
    @javax.annotation.Nonnull
    public static Document createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Document();
    }
    /**
     * Gets the comments property value. The comments property
     * @return a documentComment
     */
    @javax.annotation.Nullable
    public java.util.List<DocumentComment> getComments() {
        return this.comments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("comments", (n) -> { this.setComments(n.getCollectionOfObjectValues(DocumentComment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("comments", this.getComments());
    }
    /**
     * Sets the comments property value. The comments property
     * @param value Value to set for the comments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComments(@javax.annotation.Nullable final java.util.List<DocumentComment> value) {
        this.comments = value;
    }
}
