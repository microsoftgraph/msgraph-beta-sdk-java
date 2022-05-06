package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VisualProperties implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The body of a visual user notification. Body is optional.  */
    private String _body;
    /** The title of a visual user notification. This field is required for visual notification payloads.  */
    private String _title;
    /**
     * Instantiates a new visualProperties and sets the default values.
     * @return a void
     */
    public VisualProperties() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a visualProperties
     */
    @javax.annotation.Nonnull
    public static VisualProperties createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VisualProperties();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the body property value. The body of a visual user notification. Body is optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBody() {
        return this._body;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VisualProperties currentObject = this;
        return new HashMap<>(2) {{
            this.put("body", (n) -> { currentObject.setBody(n.getStringValue()); });
            this.put("title", (n) -> { currentObject.setTitle(n.getStringValue()); });
        }};
    }
    /**
     * Gets the title property value. The title of a visual user notification. This field is required for visual notification payloads.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this._title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("body", this.getBody());
        writer.writeStringValue("title", this.getTitle());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the body property value. The body of a visual user notification. Body is optional.
     * @param value Value to set for the body property.
     * @return a void
     */
    public void setBody(@javax.annotation.Nullable final String value) {
        this._body = value;
    }
    /**
     * Sets the title property value. The title of a visual user notification. This field is required for visual notification payloads.
     * @param value Value to set for the title property.
     * @return a void
     */
    public void setTitle(@javax.annotation.Nullable final String value) {
        this._title = value;
    }
}
