package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClassificationResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The confidenceLevel property  */
    private Integer _confidenceLevel;
    /** The count property  */
    private Integer _count;
    /** The sensitiveTypeId property  */
    private String _sensitiveTypeId;
    /**
     * Instantiates a new classificationResult and sets the default values.
     * @return a void
     */
    public ClassificationResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a classificationResult
     */
    @javax.annotation.Nonnull
    public static ClassificationResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassificationResult();
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
     * Gets the confidenceLevel property value. The confidenceLevel property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConfidenceLevel() {
        return this._confidenceLevel;
    }
    /**
     * Gets the count property value. The count property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCount() {
        return this._count;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ClassificationResult currentObject = this;
        return new HashMap<>(3) {{
            this.put("confidenceLevel", (n) -> { currentObject.setConfidenceLevel(n.getIntegerValue()); });
            this.put("count", (n) -> { currentObject.setCount(n.getIntegerValue()); });
            this.put("sensitiveTypeId", (n) -> { currentObject.setSensitiveTypeId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the sensitiveTypeId property value. The sensitiveTypeId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSensitiveTypeId() {
        return this._sensitiveTypeId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("confidenceLevel", this.getConfidenceLevel());
        writer.writeIntegerValue("count", this.getCount());
        writer.writeStringValue("sensitiveTypeId", this.getSensitiveTypeId());
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
     * Sets the confidenceLevel property value. The confidenceLevel property
     * @param value Value to set for the confidenceLevel property.
     * @return a void
     */
    public void setConfidenceLevel(@javax.annotation.Nullable final Integer value) {
        this._confidenceLevel = value;
    }
    /**
     * Sets the count property value. The count property
     * @param value Value to set for the count property.
     * @return a void
     */
    public void setCount(@javax.annotation.Nullable final Integer value) {
        this._count = value;
    }
    /**
     * Sets the sensitiveTypeId property value. The sensitiveTypeId property
     * @param value Value to set for the sensitiveTypeId property.
     * @return a void
     */
    public void setSensitiveTypeId(@javax.annotation.Nullable final String value) {
        this._sensitiveTypeId = value;
    }
}
