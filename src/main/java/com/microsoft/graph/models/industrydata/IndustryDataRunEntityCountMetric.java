package com.microsoft.graph.models.industrydata;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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
     * Instantiates a new industryDataRunEntityCountMetric and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IndustryDataRunEntityCountMetric() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a industryDataRunEntityCountMetric
     */
    @javax.annotation.Nonnull
    public static IndustryDataRunEntityCountMetric createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IndustryDataRunEntityCountMetric();
    }
    /**
     * Gets the active property value. The count of entries for the entity marked as Active.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActive() {
        return this.active;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInactive() {
        return this.inactive;
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
     * Gets the total property value. Total count of the entity.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the active property value. The count of entries for the entity marked as Active.
     * @param value Value to set for the active property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActive(@javax.annotation.Nullable final Integer value) {
        this.active = value;
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
     * Sets the inactive property value. The count of entries for the entity marked as Inactive.
     * @param value Value to set for the inactive property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInactive(@javax.annotation.Nullable final Integer value) {
        this.inactive = value;
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
     * Sets the total property value. Total count of the entity.
     * @param value Value to set for the total property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotal(@javax.annotation.Nullable final Integer value) {
        this.total = value;
    }
}
