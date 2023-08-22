package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DiscoveredSensitiveType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The classificationAttributes property
     */
    private java.util.List<ClassificationAttribute> classificationAttributes;
    /**
     * The confidence property
     */
    private Integer confidence;
    /**
     * The count property
     */
    private Integer count;
    /**
     * The id property
     */
    private UUID id;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new discoveredSensitiveType and sets the default values.
     */
    public DiscoveredSensitiveType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a discoveredSensitiveType
     */
    @jakarta.annotation.Nonnull
    public static DiscoveredSensitiveType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DiscoveredSensitiveType();
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
     * Gets the classificationAttributes property value. The classificationAttributes property
     * @return a classificationAttribute
     */
    @jakarta.annotation.Nullable
    public java.util.List<ClassificationAttribute> getClassificationAttributes() {
        return this.classificationAttributes;
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
     * Gets the count property value. The count property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCount() {
        return this.count;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("classificationAttributes", (n) -> { this.setClassificationAttributes(n.getCollectionOfObjectValues(ClassificationAttribute::createFromDiscriminatorValue)); });
        deserializerMap.put("confidence", (n) -> { this.setConfidence(n.getIntegerValue()); });
        deserializerMap.put("count", (n) -> { this.setCount(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("classificationAttributes", this.getClassificationAttributes());
        writer.writeIntegerValue("confidence", this.getConfidence());
        writer.writeIntegerValue("count", this.getCount());
        writer.writeUUIDValue("id", this.getId());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the classificationAttributes property value. The classificationAttributes property
     * @param value Value to set for the classificationAttributes property.
     */
    public void setClassificationAttributes(@jakarta.annotation.Nullable final java.util.List<ClassificationAttribute> value) {
        this.classificationAttributes = value;
    }
    /**
     * Sets the confidence property value. The confidence property
     * @param value Value to set for the confidence property.
     */
    public void setConfidence(@jakarta.annotation.Nullable final Integer value) {
        this.confidence = value;
    }
    /**
     * Sets the count property value. The count property
     * @param value Value to set for the count property.
     */
    public void setCount(@jakarta.annotation.Nullable final Integer value) {
        this.count = value;
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
}
