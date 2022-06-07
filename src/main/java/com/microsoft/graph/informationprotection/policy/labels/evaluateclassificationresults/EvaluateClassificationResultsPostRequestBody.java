package microsoft.graph.informationprotection.policy.labels.evaluateclassificationresults;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.ClassificationResult;
import microsoft.graph.models.ContentInfo;
/** Provides operations to call the evaluateClassificationResults method. */
public class EvaluateClassificationResultsPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The classificationResults property */
    private java.util.List<ClassificationResult> _classificationResults;
    /** The contentInfo property */
    private ContentInfo _contentInfo;
    /**
     * Instantiates a new evaluateClassificationResultsPostRequestBody and sets the default values.
     * @return a void
     */
    public EvaluateClassificationResultsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a evaluateClassificationResultsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static EvaluateClassificationResultsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EvaluateClassificationResultsPostRequestBody();
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
     * Gets the classificationResults property value. The classificationResults property
     * @return a classificationResult
     */
    @javax.annotation.Nullable
    public java.util.List<ClassificationResult> getClassificationResults() {
        return this._classificationResults;
    }
    /**
     * Gets the contentInfo property value. The contentInfo property
     * @return a contentInfo
     */
    @javax.annotation.Nullable
    public ContentInfo getContentInfo() {
        return this._contentInfo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EvaluateClassificationResultsPostRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("classificationResults", (n) -> { currentObject.setClassificationResults(n.getCollectionOfObjectValues(ClassificationResult::createFromDiscriminatorValue)); });
            this.put("contentInfo", (n) -> { currentObject.setContentInfo(n.getObjectValue(ContentInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("classificationResults", this.getClassificationResults());
        writer.writeObjectValue("contentInfo", this.getContentInfo());
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
     * Sets the classificationResults property value. The classificationResults property
     * @param value Value to set for the classificationResults property.
     * @return a void
     */
    public void setClassificationResults(@javax.annotation.Nullable final java.util.List<ClassificationResult> value) {
        this._classificationResults = value;
    }
    /**
     * Sets the contentInfo property value. The contentInfo property
     * @param value Value to set for the contentInfo property.
     * @return a void
     */
    public void setContentInfo(@javax.annotation.Nullable final ContentInfo value) {
        this._contentInfo = value;
    }
}
