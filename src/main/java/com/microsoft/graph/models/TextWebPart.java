package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TextWebPart extends WebPart implements Parsable {
    /** The HTML string in text web part. */
    private String innerHtml;
    /**
     * Instantiates a new TextWebPart and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TextWebPart() {
        super();
        this.setOdataType("#microsoft.graph.textWebPart");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TextWebPart
     */
    @javax.annotation.Nonnull
    public static TextWebPart createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TextWebPart();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("innerHtml", (n) -> { this.setInnerHtml(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the innerHtml property value. The HTML string in text web part.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInnerHtml() {
        return this.innerHtml;
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
        writer.writeStringValue("innerHtml", this.getInnerHtml());
    }
    /**
     * Sets the innerHtml property value. The HTML string in text web part.
     * @param value Value to set for the innerHtml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInnerHtml(@javax.annotation.Nullable final String value) {
        this.innerHtml = value;
    }
}
