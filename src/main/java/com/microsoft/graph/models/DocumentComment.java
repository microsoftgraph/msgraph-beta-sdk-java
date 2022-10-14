package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class DocumentComment extends Entity implements Parsable {
    /** The content property */
    private String _content;
    /** The replies property */
    private java.util.List<DocumentCommentReply> _replies;
    /**
     * Instantiates a new documentComment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DocumentComment() {
        super();
        this.setOdataType("#microsoft.graph.documentComment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a documentComment
     */
    @javax.annotation.Nonnull
    public static DocumentComment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DocumentComment();
    }
    /**
     * Gets the content property value. The content property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContent() {
        return this._content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DocumentComment currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("content", (n) -> { currentObject.setContent(n.getStringValue()); });
            this.put("replies", (n) -> { currentObject.setReplies(n.getCollectionOfObjectValues(DocumentCommentReply::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the replies property value. The replies property
     * @return a documentCommentReply
     */
    @javax.annotation.Nullable
    public java.util.List<DocumentCommentReply> getReplies() {
        return this._replies;
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
        writer.writeStringValue("content", this.getContent());
        writer.writeCollectionOfObjectValues("replies", this.getReplies());
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final String value) {
        this._content = value;
    }
    /**
     * Sets the replies property value. The replies property
     * @param value Value to set for the replies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplies(@javax.annotation.Nullable final java.util.List<DocumentCommentReply> value) {
        this._replies = value;
    }
}
