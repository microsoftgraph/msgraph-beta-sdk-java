package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InferenceData implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Confidence score reflecting the accuracy of the data inferred about the user. */
    private Double _confidenceScore;
    /** The OdataType property */
    private String _odataType;
    /** Records if the user has confirmed this inference as being True or False. */
    private Boolean _userHasVerifiedAccuracy;
    /**
     * Instantiates a new inferenceData and sets the default values.
     * @return a void
     */
    public InferenceData() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.inferenceData");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a inferenceData
     */
    @javax.annotation.Nonnull
    public static InferenceData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InferenceData();
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
     * Gets the confidenceScore property value. Confidence score reflecting the accuracy of the data inferred about the user.
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getConfidenceScore() {
        return this._confidenceScore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InferenceData currentObject = this;
        return new HashMap<>(3) {{
            this.put("confidenceScore", (n) -> { currentObject.setConfidenceScore(n.getDoubleValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("userHasVerifiedAccuracy", (n) -> { currentObject.setUserHasVerifiedAccuracy(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the userHasVerifiedAccuracy property value. Records if the user has confirmed this inference as being True or False.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUserHasVerifiedAccuracy() {
        return this._userHasVerifiedAccuracy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("confidenceScore", this.getConfidenceScore());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("userHasVerifiedAccuracy", this.getUserHasVerifiedAccuracy());
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
     * Sets the confidenceScore property value. Confidence score reflecting the accuracy of the data inferred about the user.
     * @param value Value to set for the confidenceScore property.
     * @return a void
     */
    public void setConfidenceScore(@javax.annotation.Nullable final Double value) {
        this._confidenceScore = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the userHasVerifiedAccuracy property value. Records if the user has confirmed this inference as being True or False.
     * @param value Value to set for the userHasVerifiedAccuracy property.
     * @return a void
     */
    public void setUserHasVerifiedAccuracy(@javax.annotation.Nullable final Boolean value) {
        this._userHasVerifiedAccuracy = value;
    }
}
