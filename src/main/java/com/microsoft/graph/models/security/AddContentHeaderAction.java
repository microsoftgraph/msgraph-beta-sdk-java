package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AddContentHeaderAction extends InformationProtectionAction implements Parsable {
    /** The alignment property */
    private ContentAlignment _alignment;
    /** Color of the font to use for the header. */
    private String _fontColor;
    /** Name of the font to use for the header. */
    private String _fontName;
    /** Font size to use for the header. */
    private Integer _fontSize;
    /** The margin of the header from the top of the document. */
    private Integer _margin;
    /** The contents of the header itself. */
    private String _text;
    /** The name of the UI element where the header should be placed. */
    private String _uiElementName;
    /**
     * Instantiates a new AddContentHeaderAction and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AddContentHeaderAction() {
        super();
        this.setOdataType("#microsoft.graph.security.addContentHeaderAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AddContentHeaderAction
     */
    @javax.annotation.Nonnull
    public static AddContentHeaderAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddContentHeaderAction();
    }
    /**
     * Gets the alignment property value. The alignment property
     * @return a contentAlignment
     */
    @javax.annotation.Nullable
    public ContentAlignment getAlignment() {
        return this._alignment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alignment", (n) -> { this.setAlignment(n.getEnumValue(ContentAlignment.class)); });
        deserializerMap.put("fontColor", (n) -> { this.setFontColor(n.getStringValue()); });
        deserializerMap.put("fontName", (n) -> { this.setFontName(n.getStringValue()); });
        deserializerMap.put("fontSize", (n) -> { this.setFontSize(n.getIntegerValue()); });
        deserializerMap.put("margin", (n) -> { this.setMargin(n.getIntegerValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        deserializerMap.put("uiElementName", (n) -> { this.setUiElementName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fontColor property value. Color of the font to use for the header.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFontColor() {
        return this._fontColor;
    }
    /**
     * Gets the fontName property value. Name of the font to use for the header.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFontName() {
        return this._fontName;
    }
    /**
     * Gets the fontSize property value. Font size to use for the header.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFontSize() {
        return this._fontSize;
    }
    /**
     * Gets the margin property value. The margin of the header from the top of the document.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMargin() {
        return this._margin;
    }
    /**
     * Gets the text property value. The contents of the header itself.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getText() {
        return this._text;
    }
    /**
     * Gets the uiElementName property value. The name of the UI element where the header should be placed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUiElementName() {
        return this._uiElementName;
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
        writer.writeEnumValue("alignment", this.getAlignment());
        writer.writeStringValue("fontColor", this.getFontColor());
        writer.writeStringValue("fontName", this.getFontName());
        writer.writeIntegerValue("fontSize", this.getFontSize());
        writer.writeIntegerValue("margin", this.getMargin());
        writer.writeStringValue("text", this.getText());
        writer.writeStringValue("uiElementName", this.getUiElementName());
    }
    /**
     * Sets the alignment property value. The alignment property
     * @param value Value to set for the alignment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlignment(@javax.annotation.Nullable final ContentAlignment value) {
        this._alignment = value;
    }
    /**
     * Sets the fontColor property value. Color of the font to use for the header.
     * @param value Value to set for the fontColor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFontColor(@javax.annotation.Nullable final String value) {
        this._fontColor = value;
    }
    /**
     * Sets the fontName property value. Name of the font to use for the header.
     * @param value Value to set for the fontName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFontName(@javax.annotation.Nullable final String value) {
        this._fontName = value;
    }
    /**
     * Sets the fontSize property value. Font size to use for the header.
     * @param value Value to set for the fontSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFontSize(@javax.annotation.Nullable final Integer value) {
        this._fontSize = value;
    }
    /**
     * Sets the margin property value. The margin of the header from the top of the document.
     * @param value Value to set for the margin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMargin(@javax.annotation.Nullable final Integer value) {
        this._margin = value;
    }
    /**
     * Sets the text property value. The contents of the header itself.
     * @param value Value to set for the text property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setText(@javax.annotation.Nullable final String value) {
        this._text = value;
    }
    /**
     * Sets the uiElementName property value. The name of the UI element where the header should be placed.
     * @param value Value to set for the uiElementName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUiElementName(@javax.annotation.Nullable final String value) {
        this._uiElementName = value;
    }
}
