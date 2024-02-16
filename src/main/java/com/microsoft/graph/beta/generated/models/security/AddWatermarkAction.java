package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddWatermarkAction extends InformationProtectionAction implements Parsable {
    /**
     * Instantiates a new {@link AddWatermarkAction} and sets the default values.
     */
    public AddWatermarkAction() {
        super();
        this.setOdataType("#microsoft.graph.security.addWatermarkAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AddWatermarkAction}
     */
    @jakarta.annotation.Nonnull
    public static AddWatermarkAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddWatermarkAction();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fontColor", (n) -> { this.setFontColor(n.getStringValue()); });
        deserializerMap.put("fontName", (n) -> { this.setFontName(n.getStringValue()); });
        deserializerMap.put("fontSize", (n) -> { this.setFontSize(n.getIntegerValue()); });
        deserializerMap.put("layout", (n) -> { this.setLayout(n.getEnumValue(WatermarkLayout::forValue)); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        deserializerMap.put("uiElementName", (n) -> { this.setUiElementName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fontColor property value. Color of the font to use for the watermark.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFontColor() {
        return this.backingStore.get("fontColor");
    }
    /**
     * Gets the fontName property value. Name of the font to use for the watermark.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFontName() {
        return this.backingStore.get("fontName");
    }
    /**
     * Gets the fontSize property value. Font size to use for the watermark.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFontSize() {
        return this.backingStore.get("fontSize");
    }
    /**
     * Gets the layout property value. The layout property
     * @return a {@link WatermarkLayout}
     */
    @jakarta.annotation.Nullable
    public WatermarkLayout getLayout() {
        return this.backingStore.get("layout");
    }
    /**
     * Gets the text property value. The contents of the watermark itself.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.backingStore.get("text");
    }
    /**
     * Gets the uiElementName property value. The name of the UI element where the watermark should be placed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUiElementName() {
        return this.backingStore.get("uiElementName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setFontColor(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fontColor", value);
    }
    /**
     * Sets the fontName property value. Name of the font to use for the watermark.
     * @param value Value to set for the fontName property.
     */
    public void setFontName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fontName", value);
    }
    /**
     * Sets the fontSize property value. Font size to use for the watermark.
     * @param value Value to set for the fontSize property.
     */
    public void setFontSize(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("fontSize", value);
    }
    /**
     * Sets the layout property value. The layout property
     * @param value Value to set for the layout property.
     */
    public void setLayout(@jakarta.annotation.Nullable final WatermarkLayout value) {
        this.backingStore.set("layout", value);
    }
    /**
     * Sets the text property value. The contents of the watermark itself.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("text", value);
    }
    /**
     * Sets the uiElementName property value. The name of the UI element where the watermark should be placed.
     * @param value Value to set for the uiElementName property.
     */
    public void setUiElementName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("uiElementName", value);
    }
}
