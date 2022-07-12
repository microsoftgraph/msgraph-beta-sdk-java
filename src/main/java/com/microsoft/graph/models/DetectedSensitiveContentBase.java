package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DetectedSensitiveContentBase implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The confidence property */
    private Integer _confidence;
    /** The displayName property */
    private String _displayName;
    /** The id property */
    private String _id;
    /** The recommendedConfidence property */
    private Integer _recommendedConfidence;
    /** The type property */
    private String _type;
    /** The uniqueCount property */
    private Integer _uniqueCount;
    /**
     * Instantiates a new detectedSensitiveContentBase and sets the default values.
     * @return a void
     */
    public DetectedSensitiveContentBase() {
        this.setAdditionalData(new HashMap<>());
        this.setOdatatype("#microsoft.graph.detectedSensitiveContentBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a detectedSensitiveContentBase
     */
    @javax.annotation.Nonnull
    public static DetectedSensitiveContentBase createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.detectedSensitiveContent": return new DetectedSensitiveContent();
                case "#microsoft.graph.exactMatchDetectedSensitiveContent": return new ExactMatchDetectedSensitiveContent();
            }
        }
        return new DetectedSensitiveContentBase();
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
     * Gets the confidence property value. The confidence property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConfidence() {
        return this._confidence;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DetectedSensitiveContentBase currentObject = this;
        return new HashMap<>(6) {{
            this.put("confidence", (n) -> { currentObject.setConfidence(n.getIntegerValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("recommendedConfidence", (n) -> { currentObject.setRecommendedConfidence(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdatatype(n.getStringValue()); });
            this.put("uniqueCount", (n) -> { currentObject.setUniqueCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the id property value. The id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the @odata.type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdatatype() {
        return this._type;
    }
    /**
     * Gets the recommendedConfidence property value. The recommendedConfidence property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRecommendedConfidence() {
        return this._recommendedConfidence;
    }
    /**
     * Gets the uniqueCount property value. The uniqueCount property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUniqueCount() {
        return this._uniqueCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("confidence", this.getConfidence());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("id", this.getId());
        writer.writeIntegerValue("recommendedConfidence", this.getRecommendedConfidence());
        writer.writeStringValue("@odata.type", this.getOdatatype());
        writer.writeIntegerValue("uniqueCount", this.getUniqueCount());
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
     * Sets the confidence property value. The confidence property
     * @param value Value to set for the confidence property.
     * @return a void
     */
    public void setConfidence(@javax.annotation.Nullable final Integer value) {
        this._confidence = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the @odata.type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setOdatatype(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
    /**
     * Sets the recommendedConfidence property value. The recommendedConfidence property
     * @param value Value to set for the recommendedConfidence property.
     * @return a void
     */
    public void setRecommendedConfidence(@javax.annotation.Nullable final Integer value) {
        this._recommendedConfidence = value;
    }
    /**
     * Sets the uniqueCount property value. The uniqueCount property
     * @param value Value to set for the uniqueCount property.
     * @return a void
     */
    public void setUniqueCount(@javax.annotation.Nullable final Integer value) {
        this._uniqueCount = value;
    }
}
