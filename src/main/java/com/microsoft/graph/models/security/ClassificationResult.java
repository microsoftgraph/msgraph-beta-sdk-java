package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClassificationResult implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The confidence level, 0 to 100, of the result. */
    private Integer confidenceLevel;
    /** The number of instances of the specific information type in the input. */
    private Integer count;
    /** The OdataType property */
    private String odataType;
    /** The GUID of the discovered sensitive information type. */
    private String sensitiveTypeId;
    /**
     * Instantiates a new ClassificationResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ClassificationResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClassificationResult
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
        return this.additionalData;
    }
    /**
     * Gets the confidenceLevel property value. The confidence level, 0 to 100, of the result.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConfidenceLevel() {
        return this.confidenceLevel;
    }
    /**
     * Gets the count property value. The number of instances of the specific information type in the input.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCount() {
        return this.count;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("confidenceLevel", (n) -> { this.setConfidenceLevel(n.getIntegerValue()); });
        deserializerMap.put("count", (n) -> { this.setCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sensitiveTypeId", (n) -> { this.setSensitiveTypeId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the sensitiveTypeId property value. The GUID of the discovered sensitive information type.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSensitiveTypeId() {
        return this.sensitiveTypeId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("confidenceLevel", this.getConfidenceLevel());
        writer.writeIntegerValue("count", this.getCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sensitiveTypeId", this.getSensitiveTypeId());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the confidenceLevel property value. The confidence level, 0 to 100, of the result.
     * @param value Value to set for the confidenceLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfidenceLevel(@javax.annotation.Nullable final Integer value) {
        this.confidenceLevel = value;
    }
    /**
     * Sets the count property value. The number of instances of the specific information type in the input.
     * @param value Value to set for the count property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCount(@javax.annotation.Nullable final Integer value) {
        this.count = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sensitiveTypeId property value. The GUID of the discovered sensitive information type.
     * @param value Value to set for the sensitiveTypeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSensitiveTypeId(@javax.annotation.Nullable final String value) {
        this.sensitiveTypeId = value;
    }
}
