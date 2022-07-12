package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExactMatchClassificationResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The classification property */
    private java.util.List<ExactMatchDetectedSensitiveContent> _classification;
    /** The errors property */
    private java.util.List<ClassificationError> _errors;
    /**
     * Instantiates a new exactMatchClassificationResult and sets the default values.
     * @return a void
     */
    public ExactMatchClassificationResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a exactMatchClassificationResult
     */
    @javax.annotation.Nonnull
    public static ExactMatchClassificationResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExactMatchClassificationResult();
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
     * Gets the classification property value. The classification property
     * @return a exactMatchDetectedSensitiveContent
     */
    @javax.annotation.Nullable
    public java.util.List<ExactMatchDetectedSensitiveContent> getClassification() {
        return this._classification;
    }
    /**
     * Gets the errors property value. The errors property
     * @return a classificationError
     */
    @javax.annotation.Nullable
    public java.util.List<ClassificationError> getErrors() {
        return this._errors;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExactMatchClassificationResult currentObject = this;
        return new HashMap<>(2) {{
            this.put("classification", (n) -> { currentObject.setClassification(n.getCollectionOfObjectValues(ExactMatchDetectedSensitiveContent::createFromDiscriminatorValue)); });
            this.put("errors", (n) -> { currentObject.setErrors(n.getCollectionOfObjectValues(ClassificationError::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("classification", this.getClassification());
        writer.writeCollectionOfObjectValues("errors", this.getErrors());
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
     * Sets the classification property value. The classification property
     * @param value Value to set for the classification property.
     * @return a void
     */
    public void setClassification(@javax.annotation.Nullable final java.util.List<ExactMatchDetectedSensitiveContent> value) {
        this._classification = value;
    }
    /**
     * Sets the errors property value. The errors property
     * @param value Value to set for the errors property.
     * @return a void
     */
    public void setErrors(@javax.annotation.Nullable final java.util.List<ClassificationError> value) {
        this._errors = value;
    }
}
