package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MarkContent extends LabelActionBase implements Parsable {
    /** The fontColor property */
    private String _fontColor;
    /** The fontSize property */
    private Long _fontSize;
    /** The text property */
    private String _text;
    /**
     * Instantiates a new MarkContent and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static MarkContent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MarkContent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("fontColor", (n) -> { currentObject.setFontColor(n.getStringValue()); });
            this.put("fontSize", (n) -> { currentObject.setFontSize(n.getLongValue()); });
            this.put("text", (n) -> { currentObject.setText(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fontColor property value. The fontColor property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFontColor() {
        return this._fontColor;
    }
    /**
     * Gets the fontSize property value. The fontSize property
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getFontSize() {
        return this._fontSize;
    }
    /**
     * Gets the text property value. The text property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getText() {
        return this._text;
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
        writer.writeLongValue("fontSize", this.getFontSize());
        writer.writeStringValue("text", this.getText());
    }
    /**
     * Sets the fontColor property value. The fontColor property
     * @param value Value to set for the fontColor property.
     * @return a void
     */
    public void setFontColor(@javax.annotation.Nullable final String value) {
        this._fontColor = value;
    }
    /**
     * Sets the fontSize property value. The fontSize property
     * @param value Value to set for the fontSize property.
     * @return a void
     */
    public void setFontSize(@javax.annotation.Nullable final Long value) {
        this._fontSize = value;
    }
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     * @return a void
     */
    public void setText(@javax.annotation.Nullable final String value) {
        this._text = value;
    }
}
