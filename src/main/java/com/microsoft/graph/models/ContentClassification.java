package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContentClassification implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The confidence property */
    private Integer _confidence;
    /** The matches property */
    private java.util.List<MatchLocation> _matches;
    /** The OdataType property */
    private String _odataType;
    /** The sensitiveTypeId property */
    private String _sensitiveTypeId;
    /** The uniqueCount property */
    private Integer _uniqueCount;
    /**
     * Instantiates a new contentClassification and sets the default values.
     * @return a void
     */
    public ContentClassification() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.contentClassification");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a contentClassification
     */
    @javax.annotation.Nonnull
    public static ContentClassification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentClassification();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ContentClassification currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("confidence", (n) -> { currentObject.setConfidence(n.getIntegerValue()); });
            this.put("matches", (n) -> { currentObject.setMatches(n.getCollectionOfObjectValues(MatchLocation::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("sensitiveTypeId", (n) -> { currentObject.setSensitiveTypeId(n.getStringValue()); });
            this.put("uniqueCount", (n) -> { currentObject.setUniqueCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the matches property value. The matches property
     * @return a matchLocation
     */
    @javax.annotation.Nullable
    public java.util.List<MatchLocation> getMatches() {
        return this._matches;
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
     * Gets the sensitiveTypeId property value. The sensitiveTypeId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSensitiveTypeId() {
        return this._sensitiveTypeId;
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
        writer.writeCollectionOfObjectValues("matches", this.getMatches());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sensitiveTypeId", this.getSensitiveTypeId());
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
     * Sets the matches property value. The matches property
     * @param value Value to set for the matches property.
     * @return a void
     */
    public void setMatches(@javax.annotation.Nullable final java.util.List<MatchLocation> value) {
        this._matches = value;
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
     * Sets the sensitiveTypeId property value. The sensitiveTypeId property
     * @param value Value to set for the sensitiveTypeId property.
     * @return a void
     */
    public void setSensitiveTypeId(@javax.annotation.Nullable final String value) {
        this._sensitiveTypeId = value;
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
