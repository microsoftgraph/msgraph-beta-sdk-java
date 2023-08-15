package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AddWatermarkAction extends InformationProtectionAction implements Parsable {
    /**
     * Color of the font to use for the watermark.
     */
    private String fontColor;
    /**
     * Name of the font to use for the watermark.
     */
    private String fontName;
    /**
     * Font size to use for the watermark.
     */
    private Integer fontSize;
    /**
     * The layout property
     */
    private WatermarkLayout layout;
    /**
     * The contents of the watermark itself.
     */
    private String text;
    /**
     * The name of the UI element where the watermark should be placed.
     */
    private String uiElementName;
    /**
     * Instantiates a new addWatermarkAction and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public AddWatermarkAction() {
        super();
        this.setOdataType("#microsoft.graph.addWatermarkAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a addWatermarkAction
     */
    @jakarta.annotation.Nonnull
    public static AddWatermarkAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddWatermarkAction();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fontColor", (n) -> { this.setFontColor(n.getStringValue()); });
        deserializerMap.put("fontName", (n) -> { this.setFontName(n.getStringValue()); });
        deserializerMap.put("fontSize", (n) -> { this.setFontSize(n.getIntegerValue()); });
        deserializerMap.put("layout", (n) -> { this.setLayout(n.getEnumValue(WatermarkLayout.class)); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        deserializerMap.put("uiElementName", (n) -> { this.setUiElementName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fontColor property value. Color of the font to use for the watermark.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFontColor() {
        return this.fontColor;
    }
    /**
     * Gets the fontName property value. Name of the font to use for the watermark.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFontName() {
        return this.fontName;
    }
    /**
     * Gets the fontSize property value. Font size to use for the watermark.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFontSize() {
        return this.fontSize;
    }
    /**
     * Gets the layout property value. The layout property
     * @return a watermarkLayout
     */
    @jakarta.annotation.Nullable
    public WatermarkLayout getLayout() {
        return this.layout;
    }
    /**
     * Gets the text property value. The contents of the watermark itself.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.text;
    }
    /**
     * Gets the uiElementName property value. The name of the UI element where the watermark should be placed.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUiElementName() {
        return this.uiElementName;
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
    @jakarta.annotation.Nonnull
    public void setFontColor(@jakarta.annotation.Nullable final String value) {
        this.fontColor = value;
    }
    /**
     * Sets the fontName property value. Name of the font to use for the watermark.
     * @param value Value to set for the fontName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFontName(@jakarta.annotation.Nullable final String value) {
        this.fontName = value;
    }
    /**
     * Sets the fontSize property value. Font size to use for the watermark.
     * @param value Value to set for the fontSize property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFontSize(@jakarta.annotation.Nullable final Integer value) {
        this.fontSize = value;
    }
    /**
     * Sets the layout property value. The layout property
     * @param value Value to set for the layout property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLayout(@jakarta.annotation.Nullable final WatermarkLayout value) {
        this.layout = value;
    }
    /**
     * Sets the text property value. The contents of the watermark itself.
     * @param value Value to set for the text property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.text = value;
    }
    /**
     * Sets the uiElementName property value. The name of the UI element where the watermark should be placed.
     * @param value Value to set for the uiElementName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUiElementName(@jakarta.annotation.Nullable final String value) {
        this.uiElementName = value;
    }
}
