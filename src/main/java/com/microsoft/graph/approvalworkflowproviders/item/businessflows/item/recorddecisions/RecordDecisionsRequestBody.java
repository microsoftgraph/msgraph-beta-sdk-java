package microsoft.graph.approvalworkflowproviders.item.businessflows.item.recorddecisions;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the recordDecisions method.  */
public class RecordDecisionsRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The justification property  */
    private String _justification;
    /** The reviewResult property  */
    private String _reviewResult;
    /**
     * Instantiates a new recordDecisionsRequestBody and sets the default values.
     * @return a void
     */
    public RecordDecisionsRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a recordDecisionsRequestBody
     */
    @javax.annotation.Nonnull
    public static RecordDecisionsRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecordDecisionsRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RecordDecisionsRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("justification", (n) -> { currentObject.setJustification(n.getStringValue()); });
            this.put("reviewResult", (n) -> { currentObject.setReviewResult(n.getStringValue()); });
        }};
    }
    /**
     * Gets the justification property value. The justification property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJustification() {
        return this._justification;
    }
    /**
     * Gets the reviewResult property value. The reviewResult property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReviewResult() {
        return this._reviewResult;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("justification", this.getJustification());
        writer.writeStringValue("reviewResult", this.getReviewResult());
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
     * Sets the justification property value. The justification property
     * @param value Value to set for the justification property.
     * @return a void
     */
    public void setJustification(@javax.annotation.Nullable final String value) {
        this._justification = value;
    }
    /**
     * Sets the reviewResult property value. The reviewResult property
     * @param value Value to set for the reviewResult property.
     * @return a void
     */
    public void setReviewResult(@javax.annotation.Nullable final String value) {
        this._reviewResult = value;
    }
}
