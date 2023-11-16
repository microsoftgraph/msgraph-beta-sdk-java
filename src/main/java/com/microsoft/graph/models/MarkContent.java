package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MarkContent extends LabelActionBase implements Parsable {
    /**
     * Instantiates a new MarkContent and sets the default values.
     */
    public MarkContent() {
        super();
        this.setOdataType("#microsoft.graph.markContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MarkContent
     */
    @jakarta.annotation.Nonnull
    public static MarkContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.addFooter": return new AddFooter();
                case "#microsoft.graph.addHeader": return new AddHeader();
                case "#microsoft.graph.addWatermark": return new AddWatermark();
            }
        }
        return new MarkContent();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fontColor", (n) -> { this.setFontColor(n.getStringValue()); });
        deserializerMap.put("fontSize", (n) -> { this.setFontSize(n.getLongValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fontColor property value. The fontColor property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFontColor() {
        return this.BackingStore.get("fontColor");
    }
    /**
     * Gets the fontSize property value. The fontSize property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getFontSize() {
        return this.BackingStore.get("fontSize");
    }
    /**
     * Gets the text property value. The text property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.BackingStore.get("text");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("fontColor", this.getFontColor());
        writer.writeLongValue("fontSize", this.getFontSize());
        writer.writeStringValue("text", this.getText());
    }
    /**
     * Sets the fontColor property value. The fontColor property
     * @param value Value to set for the fontColor property.
     */
    public void setFontColor(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("fontColor", value);
    }
    /**
     * Sets the fontSize property value. The fontSize property
     * @param value Value to set for the fontSize property.
     */
    public void setFontSize(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("fontSize", value);
    }
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("text", value);
    }
}
