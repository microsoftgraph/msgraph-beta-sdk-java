package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentTerm implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The calculateDiscountOnCreditMemos property
     */
    private Boolean calculateDiscountOnCreditMemos;
    /**
     * The code property
     */
    private String code;
    /**
     * The discountDateCalculation property
     */
    private String discountDateCalculation;
    /**
     * The discountPercent property
     */
    private BigDecimal discountPercent;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The dueDateCalculation property
     */
    private String dueDateCalculation;
    /**
     * The id property
     */
    private UUID id;
    /**
     * The lastModifiedDateTime property
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new paymentTerm and sets the default values.
     */
    public PaymentTerm() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a paymentTerm
     */
    @jakarta.annotation.Nonnull
    public static PaymentTerm createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentTerm();
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
     * Gets the calculateDiscountOnCreditMemos property value. The calculateDiscountOnCreditMemos property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCalculateDiscountOnCreditMemos() {
        return this.calculateDiscountOnCreditMemos;
    }
    /**
     * Gets the code property value. The code property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * Gets the discountDateCalculation property value. The discountDateCalculation property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDiscountDateCalculation() {
        return this.discountDateCalculation;
    }
    /**
     * Gets the discountPercent property value. The discountPercent property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getDiscountPercent() {
        return this.discountPercent;
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
     * Gets the dueDateCalculation property value. The dueDateCalculation property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDueDateCalculation() {
        return this.dueDateCalculation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("calculateDiscountOnCreditMemos", (n) -> { this.setCalculateDiscountOnCreditMemos(n.getBooleanValue()); });
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("discountDateCalculation", (n) -> { this.setDiscountDateCalculation(n.getStringValue()); });
        deserializerMap.put("discountPercent", (n) -> { this.setDiscountPercent(n.getBigDecimalValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("dueDateCalculation", (n) -> { this.setDueDateCalculation(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
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
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
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
        writer.writeBooleanValue("calculateDiscountOnCreditMemos", this.getCalculateDiscountOnCreditMemos());
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("discountDateCalculation", this.getDiscountDateCalculation());
        writer.writeBigDecimalValue("discountPercent", this.getDiscountPercent());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("dueDateCalculation", this.getDueDateCalculation());
        writer.writeUUIDValue("id", this.getId());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
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
     * Sets the calculateDiscountOnCreditMemos property value. The calculateDiscountOnCreditMemos property
     * @param value Value to set for the calculateDiscountOnCreditMemos property.
     */
    public void setCalculateDiscountOnCreditMemos(@jakarta.annotation.Nullable final Boolean value) {
        this.calculateDiscountOnCreditMemos = value;
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the discountDateCalculation property value. The discountDateCalculation property
     * @param value Value to set for the discountDateCalculation property.
     */
    public void setDiscountDateCalculation(@jakarta.annotation.Nullable final String value) {
        this.discountDateCalculation = value;
    }
    /**
     * Sets the discountPercent property value. The discountPercent property
     * @param value Value to set for the discountPercent property.
     */
    public void setDiscountPercent(@jakarta.annotation.Nullable final BigDecimal value) {
        this.discountPercent = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the dueDateCalculation property value. The dueDateCalculation property
     * @param value Value to set for the dueDateCalculation property.
     */
    public void setDueDateCalculation(@jakarta.annotation.Nullable final String value) {
        this.dueDateCalculation = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
