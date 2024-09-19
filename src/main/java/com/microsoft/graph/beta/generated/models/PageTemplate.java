package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PageTemplate extends BaseSitePage implements Parsable {
    /**
     * Instantiates a new {@link PageTemplate} and sets the default values.
     */
    public PageTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PageTemplate}
     */
    @jakarta.annotation.Nonnull
    public static PageTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PageTemplate();
    }
    /**
     * Gets the canvasLayout property value. The layout of the content in a given SharePoint page template, including horizontal sections and vertical sections.
     * @return a {@link CanvasLayout}
     */
    @jakarta.annotation.Nullable
    public CanvasLayout getCanvasLayout() {
        return this.backingStore.get("canvasLayout");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("canvasLayout", (n) -> { this.setCanvasLayout(n.getObjectValue(CanvasLayout::createFromDiscriminatorValue)); });
        deserializerMap.put("titleArea", (n) -> { this.setTitleArea(n.getObjectValue(TitleArea::createFromDiscriminatorValue)); });
        deserializerMap.put("webParts", (n) -> { this.setWebParts(n.getCollectionOfObjectValues(WebPart::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the titleArea property value. The title area on the SharePoint page template.
     * @return a {@link TitleArea}
     */
    @jakarta.annotation.Nullable
    public TitleArea getTitleArea() {
        return this.backingStore.get("titleArea");
    }
    /**
     * Gets the webParts property value. The collection of web parts on the SharePoint page.
     * @return a {@link java.util.List<WebPart>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<WebPart> getWebParts() {
        return this.backingStore.get("webParts");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("canvasLayout", this.getCanvasLayout());
        writer.writeObjectValue("titleArea", this.getTitleArea());
        writer.writeCollectionOfObjectValues("webParts", this.getWebParts());
    }
    /**
     * Sets the canvasLayout property value. The layout of the content in a given SharePoint page template, including horizontal sections and vertical sections.
     * @param value Value to set for the canvasLayout property.
     */
    public void setCanvasLayout(@jakarta.annotation.Nullable final CanvasLayout value) {
        this.backingStore.set("canvasLayout", value);
    }
    /**
     * Sets the titleArea property value. The title area on the SharePoint page template.
     * @param value Value to set for the titleArea property.
     */
    public void setTitleArea(@jakarta.annotation.Nullable final TitleArea value) {
        this.backingStore.set("titleArea", value);
    }
    /**
     * Sets the webParts property value. The collection of web parts on the SharePoint page.
     * @param value Value to set for the webParts property.
     */
    public void setWebParts(@jakarta.annotation.Nullable final java.util.List<WebPart> value) {
        this.backingStore.set("webParts", value);
    }
}
