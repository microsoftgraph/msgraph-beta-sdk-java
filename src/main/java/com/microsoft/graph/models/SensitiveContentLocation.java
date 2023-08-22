package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SensitiveContentLocation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The confidence property
     */
    private Integer confidence;
    /**
     * The evidences property
     */
    private java.util.List<SensitiveContentEvidence> evidences;
    /**
     * The idMatch property
     */
    private String idMatch;
    /**
     * The length property
     */
    private Integer length;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The offset property
     */
    private Integer offset;
    /**
     * Instantiates a new sensitiveContentLocation and sets the default values.
     */
    public SensitiveContentLocation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sensitiveContentLocation
     */
    @jakarta.annotation.Nonnull
    public static SensitiveContentLocation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitiveContentLocation();
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
     * Gets the evidences property value. The evidences property
     * @return a sensitiveContentEvidence
     */
    @jakarta.annotation.Nullable
    public java.util.List<SensitiveContentEvidence> getEvidences() {
        return this.evidences;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("confidence", (n) -> { this.setConfidence(n.getIntegerValue()); });
        deserializerMap.put("evidences", (n) -> { this.setEvidences(n.getCollectionOfObjectValues(SensitiveContentEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("idMatch", (n) -> { this.setIdMatch(n.getStringValue()); });
        deserializerMap.put("length", (n) -> { this.setLength(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the idMatch property value. The idMatch property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getIdMatch() {
        return this.idMatch;
    }
    /**
     * Gets the length property value. The length property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getLength() {
        return this.length;
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
     * Gets the offset property value. The offset property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("confidence", this.getConfidence());
        writer.writeCollectionOfObjectValues("evidences", this.getEvidences());
        writer.writeStringValue("idMatch", this.getIdMatch());
        writer.writeIntegerValue("length", this.getLength());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("offset", this.getOffset());
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
     * Sets the evidences property value. The evidences property
     * @param value Value to set for the evidences property.
     */
    public void setEvidences(@jakarta.annotation.Nullable final java.util.List<SensitiveContentEvidence> value) {
        this.evidences = value;
    }
    /**
     * Sets the idMatch property value. The idMatch property
     * @param value Value to set for the idMatch property.
     */
    public void setIdMatch(@jakarta.annotation.Nullable final String value) {
        this.idMatch = value;
    }
    /**
     * Sets the length property value. The length property
     * @param value Value to set for the length property.
     */
    public void setLength(@jakarta.annotation.Nullable final Integer value) {
        this.length = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the offset property value. The offset property
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
}
