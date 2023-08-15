package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Presentation extends Entity implements Parsable {
    /**
     * The comments property
     */
    private java.util.List<DocumentComment> comments;
    /**
     * Instantiates a new presentation and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Presentation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a presentation
     */
    @jakarta.annotation.Nonnull
    public static Presentation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Presentation();
    }
    /**
     * Gets the comments property value. The comments property
     * @return a documentComment
     */
    @jakarta.annotation.Nullable
    public java.util.List<DocumentComment> getComments() {
        return this.comments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("comments", this.getComments());
    }
    /**
     * Sets the comments property value. The comments property
     * @param value Value to set for the comments property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setComments(@jakarta.annotation.Nullable final java.util.List<DocumentComment> value) {
        this.comments = value;
    }
}
