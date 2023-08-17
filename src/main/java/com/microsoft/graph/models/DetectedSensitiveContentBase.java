package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class DetectedSensitiveContentBase implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The confidence property
     */
    private Integer confidence;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The id property
     */
    private UUID id;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The recommendedConfidence property
     */
    private Integer recommendedConfidence;
    /**
     * The uniqueCount property
     */
    private Integer uniqueCount;
    /**
     * Instantiates a new detectedSensitiveContentBase and sets the default values.
     */
    public DetectedSensitiveContentBase() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a detectedSensitiveContentBase
     */
    @jakarta.annotation.Nonnull
    public static DetectedSensitiveContentBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.detectedSensitiveContent": return new DetectedSensitiveContent();
                case "#microsoft.graph.exactMatchDetectedSensitiveContent": return new ExactMatchDetectedSensitiveContent();
                case "#microsoft.graph.machineLearningDetectedSensitiveContent": return new MachineLearningDetectedSensitiveContent();
            }
        }
        return new DetectedSensitiveContentBase();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the confidence property value. The confidence property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getConfidence() {
        return this.confidence;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("confidence", (n) -> { this.setConfidence(n.getIntegerValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recommendedConfidence", (n) -> { this.setRecommendedConfidence(n.getIntegerValue()); });
        deserializerMap.put("uniqueCount", (n) -> { this.setUniqueCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the recommendedConfidence property value. The recommendedConfidence property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getRecommendedConfidence() {
        return this.recommendedConfidence;
    }
    /**
     * Gets the uniqueCount property value. The uniqueCount property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getUniqueCount() {
        return this.uniqueCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("confidence", this.getConfidence());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeUUIDValue("id", this.getId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("recommendedConfidence", this.getRecommendedConfidence());
        writer.writeIntegerValue("uniqueCount", this.getUniqueCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the confidence property value. The confidence property
     * @param value Value to set for the confidence property.
     */
    public void setConfidence(@jakarta.annotation.Nullable final Integer value) {
        this.confidence = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the recommendedConfidence property value. The recommendedConfidence property
     * @param value Value to set for the recommendedConfidence property.
     */
    public void setRecommendedConfidence(@jakarta.annotation.Nullable final Integer value) {
        this.recommendedConfidence = value;
    }
    /**
     * Sets the uniqueCount property value. The uniqueCount property
     * @param value Value to set for the uniqueCount property.
     */
    public void setUniqueCount(@jakarta.annotation.Nullable final Integer value) {
        this.uniqueCount = value;
    }
}
