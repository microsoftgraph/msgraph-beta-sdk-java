package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class DocumentCommentReply extends Entity implements Parsable {
    /** The content property */
    private String _content;
    /** The location property */
    private String _location;
    /**
     * Instantiates a new documentCommentReply and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DocumentCommentReply() {
        super();
        this.setOdataType("#microsoft.graph.documentCommentReply");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a documentCommentReply
     */
    @javax.annotation.Nonnull
    public static DocumentCommentReply createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DocumentCommentReply();
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
        final DocumentCommentReply currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { currentObject.setContent(n.getStringValue()); });
        deserializerMap.put("location", (n) -> { currentObject.setLocation(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the location property value. The location property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocation() {
        return this._location;
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
        writer.writeStringValue("location", this.getLocation());
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
     * Sets the location property value. The location property
     * @param value Value to set for the location property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocation(@javax.annotation.Nullable final String value) {
        this._location = value;
    }
}
