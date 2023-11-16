package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddContentHeaderAction extends InformationProtectionAction implements Parsable {
    /**
     * Instantiates a new AddContentHeaderAction and sets the default values.
     */
    public AddContentHeaderAction() {
        super();
        this.setOdataType("#microsoft.graph.security.addContentHeaderAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AddContentHeaderAction
     */
    @jakarta.annotation.Nonnull
    public static AddContentHeaderAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddContentHeaderAction();
    }
    /**
     * Gets the alignment property value. The alignment property
     * @return a ContentAlignment
     */
    @jakarta.annotation.Nullable
    public ContentAlignment getAlignment() {
        return this.BackingStore.get("alignment");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFontColor() {
        return this.BackingStore.get("fontColor");
    }
    /**
     * Gets the fontName property value. Name of the font to use for the header.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFontName() {
        return this.BackingStore.get("fontName");
    }
    /**
     * Gets the fontSize property value. Font size to use for the header.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFontSize() {
        return this.BackingStore.get("fontSize");
    }
    /**
     * Gets the margin property value. The margin of the header from the top of the document.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMargin() {
        return this.BackingStore.get("margin");
    }
    /**
     * Gets the text property value. The contents of the header itself.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.BackingStore.get("text");
    }
    /**
     * Gets the uiElementName property value. The name of the UI element where the header should be placed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUiElementName() {
        return this.BackingStore.get("uiElementName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAlignment(@jakarta.annotation.Nullable final ContentAlignment value) {
        this.BackingStore.set("alignment", value);
    }
    /**
     * Sets the fontColor property value. Color of the font to use for the header.
     * @param value Value to set for the fontColor property.
     */
    public void setFontColor(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("fontColor", value);
    }
    /**
     * Sets the fontName property value. Name of the font to use for the header.
     * @param value Value to set for the fontName property.
     */
    public void setFontName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("fontName", value);
    }
    /**
     * Sets the fontSize property value. Font size to use for the header.
     * @param value Value to set for the fontSize property.
     */
    public void setFontSize(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("fontSize", value);
    }
    /**
     * Sets the margin property value. The margin of the header from the top of the document.
     * @param value Value to set for the margin property.
     */
    public void setMargin(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("margin", value);
    }
    /**
     * Sets the text property value. The contents of the header itself.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("text", value);
    }
    /**
     * Sets the uiElementName property value. The name of the UI element where the header should be placed.
     * @param value Value to set for the uiElementName property.
     */
    public void setUiElementName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("uiElementName", value);
    }
}
