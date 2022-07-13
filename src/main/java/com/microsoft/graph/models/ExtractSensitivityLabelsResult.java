package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExtractSensitivityLabelsResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** List of sensitivity labels assigned to a file. */
    private java.util.List<SensitivityLabelAssignment> _labels;
    /**
     * Instantiates a new extractSensitivityLabelsResult and sets the default values.
     * @return a void
     */
    public ExtractSensitivityLabelsResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a extractSensitivityLabelsResult
     */
    @javax.annotation.Nonnull
    public static ExtractSensitivityLabelsResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExtractSensitivityLabelsResult();
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
        final ExtractSensitivityLabelsResult currentObject = this;
        return new HashMap<>(1) {{
            this.put("labels", (n) -> { currentObject.setLabels(n.getCollectionOfObjectValues(SensitivityLabelAssignment::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the labels property value. List of sensitivity labels assigned to a file.
     * @return a sensitivityLabelAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<SensitivityLabelAssignment> getLabels() {
        return this._labels;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("labels", this.getLabels());
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
     * Sets the labels property value. List of sensitivity labels assigned to a file.
     * @param value Value to set for the labels property.
     * @return a void
     */
    public void setLabels(@javax.annotation.Nullable final java.util.List<SensitivityLabelAssignment> value) {
        this._labels = value;
    }
}
