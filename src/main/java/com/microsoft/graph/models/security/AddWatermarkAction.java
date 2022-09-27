package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AddWatermarkAction extends InformationProtectionAction implements Parsable {
    /** Color of the font to use for the watermark. */
    private String _fontColor;
    /** Name of the font to use for the watermark. */
    private String _fontName;
    /** Font size to use for the watermark. */
    private Integer _fontSize;
    /** The layout property */
    private WatermarkLayout _layout;
    /** The contents of the watermark itself. */
    private String _text;
    /** The name of the UI element where the watermark should be placed. */
    private String _uiElementName;
    /**
     * Instantiates a new AddWatermarkAction and sets the default values.
     * @return a void
     */
    public AddWatermarkAction() {
        super();
        this.setOdataType("#microsoft.graph.security.addWatermarkAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AddWatermarkAction
     */
    @javax.annotation.Nonnull
    public static AddWatermarkAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddWatermarkAction();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AddWatermarkAction currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("fontColor", (n) -> { currentObject.setFontColor(n.getStringValue()); });
            this.put("fontName", (n) -> { currentObject.setFontName(n.getStringValue()); });
            this.put("fontSize", (n) -> { currentObject.setFontSize(n.getIntegerValue()); });
            this.put("layout", (n) -> { currentObject.setLayout(n.getEnumValue(WatermarkLayout.class)); });
            this.put("text", (n) -> { currentObject.setText(n.getStringValue()); });
            this.put("uiElementName", (n) -> { currentObject.setUiElementName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fontColor property value. Color of the font to use for the watermark.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFontColor() {
        return this._fontColor;
    }
    /**
     * Gets the fontName property value. Name of the font to use for the watermark.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFontName() {
        return this._fontName;
    }
    /**
     * Gets the fontSize property value. Font size to use for the watermark.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFontSize() {
        return this._fontSize;
    }
    /**
     * Gets the layout property value. The layout property
     * @return a watermarkLayout
     */
    @javax.annotation.Nullable
    public WatermarkLayout getLayout() {
        return this._layout;
    }
    /**
     * Gets the text property value. The contents of the watermark itself.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getText() {
        return this._text;
    }
    /**
     * Gets the uiElementName property value. The name of the UI element where the watermark should be placed.
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
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("fontColor", this.getFontColor());
        writer.writeStringValue("fontName", this.getFontName());
        writer.writeIntegerValue("fontSize", this.getFontSize());
        writer.writeEnumValue("layout", this.getLayout());
        writer.writeStringValue("text", this.getText());
        writer.writeStringValue("uiElementName", this.getUiElementName());
    }
    /**
     * Sets the fontColor property value. Color of the font to use for the watermark.
     * @param value Value to set for the fontColor property.
     * @return a void
     */
    public void setFontColor(@javax.annotation.Nullable final String value) {
        this._fontColor = value;
    }
    /**
     * Sets the fontName property value. Name of the font to use for the watermark.
     * @param value Value to set for the fontName property.
     * @return a void
     */
    public void setFontName(@javax.annotation.Nullable final String value) {
        this._fontName = value;
    }
    /**
     * Sets the fontSize property value. Font size to use for the watermark.
     * @param value Value to set for the fontSize property.
     * @return a void
     */
    public void setFontSize(@javax.annotation.Nullable final Integer value) {
        this._fontSize = value;
    }
    /**
     * Sets the layout property value. The layout property
     * @param value Value to set for the layout property.
     * @return a void
     */
    public void setLayout(@javax.annotation.Nullable final WatermarkLayout value) {
        this._layout = value;
    }
    /**
     * Sets the text property value. The contents of the watermark itself.
     * @param value Value to set for the text property.
     * @return a void
     */
    public void setText(@javax.annotation.Nullable final String value) {
        this._text = value;
    }
    /**
     * Sets the uiElementName property value. The name of the UI element where the watermark should be placed.
     * @param value Value to set for the uiElementName property.
     * @return a void
     */
    public void setUiElementName(@javax.annotation.Nullable final String value) {
        this._uiElementName = value;
    }
}
