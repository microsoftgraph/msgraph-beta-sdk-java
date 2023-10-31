package com.microsoft.graph.models.industrydata;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IndustryDataRunEntityCountMetric implements AdditionalDataHolder, Parsable {
    /**
     * The count of entries for the entity marked as Active.
     */
    private Integer active;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The count of entries for the entity marked as Inactive.
     */
    private Integer inactive;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Total count of the entity.
     */
    private Integer total;
    /**
     * Instantiates a new IndustryDataRunEntityCountMetric and sets the default values.
     */
    public IndustryDataRunEntityCountMetric() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IndustryDataRunEntityCountMetric
     */
    @jakarta.annotation.Nonnull
    public static IndustryDataRunEntityCountMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IndustryDataRunEntityCountMetric();
    }
    /**
     * Gets the active property value. The count of entries for the entity marked as Active.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getActive() {
        return this.active;
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("active", (n) -> { this.setActive(n.getIntegerValue()); });
        deserializerMap.put("inactive", (n) -> { this.setInactive(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inactive property value. The count of entries for the entity marked as Inactive.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInactive() {
        return this.inactive;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the total property value. Total count of the entity.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the active property value. The count of entries for the entity marked as Active.
     * @param value Value to set for the active property.
     */
    public void setActive(@jakarta.annotation.Nullable final Integer value) {
        this.active = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the inactive property value. The count of entries for the entity marked as Inactive.
     * @param value Value to set for the inactive property.
     */
    public void setInactive(@jakarta.annotation.Nullable final Integer value) {
        this.inactive = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the total property value. Total count of the entity.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.total = value;
    }
}
