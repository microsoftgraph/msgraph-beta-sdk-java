package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceLevelAgreementAttainment implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The end date for the calendar month for which SLA attainment is measured.
     */
    private LocalDate endDate;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The level of SLA attainment achieved by the tenant for the calendar month identified, as described in Azure Active Directory SLA performance. Values are truncated, not rounded, so the actual value is always equal to or higher than the displayed value. Values are expressed as a percentage of availability for the tenant.
     */
    private Double score;
    /**
     * The start date for the calendar month for which SLA attainment is measured.
     */
    private LocalDate startDate;
    /**
     * Instantiates a new serviceLevelAgreementAttainment and sets the default values.
     */
    public ServiceLevelAgreementAttainment() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a serviceLevelAgreementAttainment
     */
    @jakarta.annotation.Nonnull
    public static ServiceLevelAgreementAttainment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceLevelAgreementAttainment();
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
     * Gets the endDate property value. The end date for the calendar month for which SLA attainment is measured.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getEndDate() {
        return this.endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getLocalDateValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("score", (n) -> { this.setScore(n.getDoubleValue()); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getLocalDateValue()); });
        return deserializerMap;
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
     * Gets the score property value. The level of SLA attainment achieved by the tenant for the calendar month identified, as described in Azure Active Directory SLA performance. Values are truncated, not rounded, so the actual value is always equal to or higher than the displayed value. Values are expressed as a percentage of availability for the tenant.
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getScore() {
        return this.score;
    }
    /**
     * Gets the startDate property value. The start date for the calendar month for which SLA attainment is measured.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getStartDate() {
        return this.startDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalDateValue("endDate", this.getEndDate());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeDoubleValue("score", this.getScore());
        writer.writeLocalDateValue("startDate", this.getStartDate());
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
     * Sets the endDate property value. The end date for the calendar month for which SLA attainment is measured.
     * @param value Value to set for the endDate property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.endDate = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the score property value. The level of SLA attainment achieved by the tenant for the calendar month identified, as described in Azure Active Directory SLA performance. Values are truncated, not rounded, so the actual value is always equal to or higher than the displayed value. Values are expressed as a percentage of availability for the tenant.
     * @param value Value to set for the score property.
     */
    public void setScore(@jakarta.annotation.Nullable final Double value) {
        this.score = value;
    }
    /**
     * Sets the startDate property value. The start date for the calendar month for which SLA attainment is measured.
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.startDate = value;
    }
}
