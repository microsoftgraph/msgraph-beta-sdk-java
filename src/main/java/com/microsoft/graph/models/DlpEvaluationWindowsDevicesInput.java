package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DlpEvaluationWindowsDevicesInput extends DlpEvaluationInput implements Parsable {
    /** The contentProperties property */
    private ContentProperties _contentProperties;
    /** The sharedBy property */
    private String _sharedBy;
    /**
     * Instantiates a new DlpEvaluationWindowsDevicesInput and sets the default values.
     * @return a void
     */
    public DlpEvaluationWindowsDevicesInput() {
        super();
        this.setOdataType("#microsoft.graph.dlpEvaluationWindowsDevicesInput");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DlpEvaluationWindowsDevicesInput
     */
    @javax.annotation.Nonnull
    public static DlpEvaluationWindowsDevicesInput createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DlpEvaluationWindowsDevicesInput();
    }
    /**
     * Gets the contentProperties property value. The contentProperties property
     * @return a contentProperties
     */
    @javax.annotation.Nullable
    public ContentProperties getContentProperties() {
        return this._contentProperties;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DlpEvaluationWindowsDevicesInput currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("contentProperties", (n) -> { currentObject.setContentProperties(n.getObjectValue(ContentProperties::createFromDiscriminatorValue)); });
            this.put("sharedBy", (n) -> { currentObject.setSharedBy(n.getStringValue()); });
        }};
    }
    /**
     * Gets the sharedBy property value. The sharedBy property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSharedBy() {
        return this._sharedBy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("contentProperties", this.getContentProperties());
        writer.writeStringValue("sharedBy", this.getSharedBy());
    }
    /**
     * Sets the contentProperties property value. The contentProperties property
     * @param value Value to set for the contentProperties property.
     * @return a void
     */
    public void setContentProperties(@javax.annotation.Nullable final ContentProperties value) {
        this._contentProperties = value;
    }
    /**
     * Sets the sharedBy property value. The sharedBy property
     * @param value Value to set for the sharedBy property.
     * @return a void
     */
    public void setSharedBy(@javax.annotation.Nullable final String value) {
        this._sharedBy = value;
    }
}
