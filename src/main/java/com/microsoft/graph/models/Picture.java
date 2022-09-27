package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class Picture extends Entity implements Parsable {
    /** The content property */
    private byte[] _content;
    /** The contentType property */
    private String _contentType;
    /** The height property */
    private Integer _height;
    /** The width property */
    private Integer _width;
    /**
     * Instantiates a new picture and sets the default values.
     * @return a void
     */
    public Picture() {
        super();
        this.setOdataType("#microsoft.graph.picture");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a picture
     */
    @javax.annotation.Nonnull
    public static Picture createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Picture();
    }
    /**
     * Gets the content property value. The content property
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getContent() {
        return this._content;
    }
    /**
     * Gets the contentType property value. The contentType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentType() {
        return this._contentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Picture currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("content", (n) -> { currentObject.setContent(n.getByteArrayValue()); });
            this.put("contentType", (n) -> { currentObject.setContentType(n.getStringValue()); });
            this.put("height", (n) -> { currentObject.setHeight(n.getIntegerValue()); });
            this.put("width", (n) -> { currentObject.setWidth(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the height property value. The height property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getHeight() {
        return this._height;
    }
    /**
     * Gets the width property value. The width property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWidth() {
        return this._width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("content", this.getContent());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeIntegerValue("height", this.getHeight());
        writer.writeIntegerValue("width", this.getWidth());
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     * @return a void
     */
    public void setContent(@javax.annotation.Nullable final byte[] value) {
        this._content = value;
    }
    /**
     * Sets the contentType property value. The contentType property
     * @param value Value to set for the contentType property.
     * @return a void
     */
    public void setContentType(@javax.annotation.Nullable final String value) {
        this._contentType = value;
    }
    /**
     * Sets the height property value. The height property
     * @param value Value to set for the height property.
     * @return a void
     */
    public void setHeight(@javax.annotation.Nullable final Integer value) {
        this._height = value;
    }
    /**
     * Sets the width property value. The width property
     * @param value Value to set for the width property.
     * @return a void
     */
    public void setWidth(@javax.annotation.Nullable final Integer value) {
        this._width = value;
    }
}
