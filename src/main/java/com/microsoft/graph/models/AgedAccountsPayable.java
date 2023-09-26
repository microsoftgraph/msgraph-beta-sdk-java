package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgedAccountsPayable implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The agedAsOfDate property
     */
    private LocalDate agedAsOfDate;
    /**
     * The balanceDue property
     */
    private Decimal balanceDue;
    /**
     * The currencyCode property
     */
    private String currencyCode;
    /**
     * The currentAmount property
     */
    private Decimal currentAmount;
    /**
     * The id property
     */
    private UUID id;
    /**
     * The name property
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The period1Amount property
     */
    private Decimal period1Amount;
    /**
     * The period2Amount property
     */
    private Decimal period2Amount;
    /**
     * The period3Amount property
     */
    private Decimal period3Amount;
    /**
     * The periodLengthFilter property
     */
    private String periodLengthFilter;
    /**
     * The vendorId property
     */
    private String vendorId;
    /**
     * The vendorNumber property
     */
    private String vendorNumber;
    /**
     * Instantiates a new AgedAccountsPayable and sets the default values.
     */
    public AgedAccountsPayable() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AgedAccountsPayable
     */
    @jakarta.annotation.Nonnull
    public static AgedAccountsPayable createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgedAccountsPayable();
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
     * Gets the agedAsOfDate property value. The agedAsOfDate property
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getAgedAsOfDate() {
        return this.agedAsOfDate;
    }
    /**
     * Gets the balanceDue property value. The balanceDue property
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getBalanceDue() {
        return this.balanceDue;
    }
    /**
     * Gets the currencyCode property value. The currencyCode property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCurrencyCode() {
        return this.currencyCode;
    }
    /**
     * Gets the currentAmount property value. The currentAmount property
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getCurrentAmount() {
        return this.currentAmount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("agedAsOfDate", (n) -> { this.setAgedAsOfDate(n.getLocalDateValue()); });
        deserializerMap.put("balanceDue", (n) -> { this.setBalanceDue(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("currencyCode", (n) -> { this.setCurrencyCode(n.getStringValue()); });
        deserializerMap.put("currentAmount", (n) -> { this.setCurrentAmount(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("period1Amount", (n) -> { this.setPeriod1Amount(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("period2Amount", (n) -> { this.setPeriod2Amount(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("period3Amount", (n) -> { this.setPeriod3Amount(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("periodLengthFilter", (n) -> { this.setPeriodLengthFilter(n.getStringValue()); });
        deserializerMap.put("vendorId", (n) -> { this.setVendorId(n.getStringValue()); });
        deserializerMap.put("vendorNumber", (n) -> { this.setVendorNumber(n.getStringValue()); });
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
     * Gets the name property value. The name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the period1Amount property value. The period1Amount property
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getPeriod1Amount() {
        return this.period1Amount;
    }
    /**
     * Gets the period2Amount property value. The period2Amount property
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getPeriod2Amount() {
        return this.period2Amount;
    }
    /**
     * Gets the period3Amount property value. The period3Amount property
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getPeriod3Amount() {
        return this.period3Amount;
    }
    /**
     * Gets the periodLengthFilter property value. The periodLengthFilter property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPeriodLengthFilter() {
        return this.periodLengthFilter;
    }
    /**
     * Gets the vendorId property value. The vendorId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVendorId() {
        return this.vendorId;
    }
    /**
     * Gets the vendorNumber property value. The vendorNumber property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVendorNumber() {
        return this.vendorNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalDateValue("agedAsOfDate", this.getAgedAsOfDate());
        writer.writeObjectValue("balanceDue", this.getBalanceDue());
        writer.writeStringValue("currencyCode", this.getCurrencyCode());
        writer.writeObjectValue("currentAmount", this.getCurrentAmount());
        writer.writeUUIDValue("id", this.getId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("period1Amount", this.getPeriod1Amount());
        writer.writeObjectValue("period2Amount", this.getPeriod2Amount());
        writer.writeObjectValue("period3Amount", this.getPeriod3Amount());
        writer.writeStringValue("periodLengthFilter", this.getPeriodLengthFilter());
        writer.writeStringValue("vendorId", this.getVendorId());
        writer.writeStringValue("vendorNumber", this.getVendorNumber());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the agedAsOfDate property value. The agedAsOfDate property
     * @param value Value to set for the agedAsOfDate property.
     */
    public void setAgedAsOfDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.agedAsOfDate = value;
    }
    /**
     * Sets the balanceDue property value. The balanceDue property
     * @param value Value to set for the balanceDue property.
     */
    public void setBalanceDue(@jakarta.annotation.Nullable final Decimal value) {
        this.balanceDue = value;
    }
    /**
     * Sets the currencyCode property value. The currencyCode property
     * @param value Value to set for the currencyCode property.
     */
    public void setCurrencyCode(@jakarta.annotation.Nullable final String value) {
        this.currencyCode = value;
    }
    /**
     * Sets the currentAmount property value. The currentAmount property
     * @param value Value to set for the currentAmount property.
     */
    public void setCurrentAmount(@jakarta.annotation.Nullable final Decimal value) {
        this.currentAmount = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the period1Amount property value. The period1Amount property
     * @param value Value to set for the period1Amount property.
     */
    public void setPeriod1Amount(@jakarta.annotation.Nullable final Decimal value) {
        this.period1Amount = value;
    }
    /**
     * Sets the period2Amount property value. The period2Amount property
     * @param value Value to set for the period2Amount property.
     */
    public void setPeriod2Amount(@jakarta.annotation.Nullable final Decimal value) {
        this.period2Amount = value;
    }
    /**
     * Sets the period3Amount property value. The period3Amount property
     * @param value Value to set for the period3Amount property.
     */
    public void setPeriod3Amount(@jakarta.annotation.Nullable final Decimal value) {
        this.period3Amount = value;
    }
    /**
     * Sets the periodLengthFilter property value. The periodLengthFilter property
     * @param value Value to set for the periodLengthFilter property.
     */
    public void setPeriodLengthFilter(@jakarta.annotation.Nullable final String value) {
        this.periodLengthFilter = value;
    }
    /**
     * Sets the vendorId property value. The vendorId property
     * @param value Value to set for the vendorId property.
     */
    public void setVendorId(@jakarta.annotation.Nullable final String value) {
        this.vendorId = value;
    }
    /**
     * Sets the vendorNumber property value. The vendorNumber property
     * @param value Value to set for the vendorNumber property.
     */
    public void setVendorNumber(@jakarta.annotation.Nullable final String value) {
        this.vendorNumber = value;
    }
}
