package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AgedAccountsReceivable extends Entity implements Parsable {
    /** The agedAsOfDate property */
    private LocalDate _agedAsOfDate;
    /** The balanceDue property */
    private BigDecimal _balanceDue;
    /** The currencyCode property */
    private String _currencyCode;
    /** The currentAmount property */
    private BigDecimal _currentAmount;
    /** The customerNumber property */
    private String _customerNumber;
    /** The name property */
    private String _name;
    /** The period1Amount property */
    private BigDecimal _period1Amount;
    /** The period2Amount property */
    private BigDecimal _period2Amount;
    /** The period3Amount property */
    private BigDecimal _period3Amount;
    /** The periodLengthFilter property */
    private String _periodLengthFilter;
    /**
     * Instantiates a new AgedAccountsReceivable and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AgedAccountsReceivable() {
        super();
        this.setOdataType("#microsoft.graph.agedAccountsReceivable");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AgedAccountsReceivable
     */
    @javax.annotation.Nonnull
    public static AgedAccountsReceivable createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgedAccountsReceivable();
    }
    /**
     * Gets the agedAsOfDate property value. The agedAsOfDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getAgedAsOfDate() {
        return this._agedAsOfDate;
    }
    /**
     * Gets the balanceDue property value. The balanceDue property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getBalanceDue() {
        return this._balanceDue;
    }
    /**
     * Gets the currencyCode property value. The currencyCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrencyCode() {
        return this._currencyCode;
    }
    /**
     * Gets the currentAmount property value. The currentAmount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getCurrentAmount() {
        return this._currentAmount;
    }
    /**
     * Gets the customerNumber property value. The customerNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomerNumber() {
        return this._customerNumber;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AgedAccountsReceivable currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agedAsOfDate", (n) -> { currentObject.setAgedAsOfDate(n.getLocalDateValue()); });
        deserializerMap.put("balanceDue", (n) -> { currentObject.setBalanceDue(n.getBigDecimalValue()); });
        deserializerMap.put("currencyCode", (n) -> { currentObject.setCurrencyCode(n.getStringValue()); });
        deserializerMap.put("currentAmount", (n) -> { currentObject.setCurrentAmount(n.getBigDecimalValue()); });
        deserializerMap.put("customerNumber", (n) -> { currentObject.setCustomerNumber(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        deserializerMap.put("period1Amount", (n) -> { currentObject.setPeriod1Amount(n.getBigDecimalValue()); });
        deserializerMap.put("period2Amount", (n) -> { currentObject.setPeriod2Amount(n.getBigDecimalValue()); });
        deserializerMap.put("period3Amount", (n) -> { currentObject.setPeriod3Amount(n.getBigDecimalValue()); });
        deserializerMap.put("periodLengthFilter", (n) -> { currentObject.setPeriodLengthFilter(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the period1Amount property value. The period1Amount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getPeriod1Amount() {
        return this._period1Amount;
    }
    /**
     * Gets the period2Amount property value. The period2Amount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getPeriod2Amount() {
        return this._period2Amount;
    }
    /**
     * Gets the period3Amount property value. The period3Amount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getPeriod3Amount() {
        return this._period3Amount;
    }
    /**
     * Gets the periodLengthFilter property value. The periodLengthFilter property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPeriodLengthFilter() {
        return this._periodLengthFilter;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLocalDateValue("agedAsOfDate", this.getAgedAsOfDate());
        writer.writeBigDecimalValue("balanceDue", this.getBalanceDue());
        writer.writeStringValue("currencyCode", this.getCurrencyCode());
        writer.writeBigDecimalValue("currentAmount", this.getCurrentAmount());
        writer.writeStringValue("customerNumber", this.getCustomerNumber());
        writer.writeStringValue("name", this.getName());
        writer.writeBigDecimalValue("period1Amount", this.getPeriod1Amount());
        writer.writeBigDecimalValue("period2Amount", this.getPeriod2Amount());
        writer.writeBigDecimalValue("period3Amount", this.getPeriod3Amount());
        writer.writeStringValue("periodLengthFilter", this.getPeriodLengthFilter());
    }
    /**
     * Sets the agedAsOfDate property value. The agedAsOfDate property
     * @param value Value to set for the agedAsOfDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgedAsOfDate(@javax.annotation.Nullable final LocalDate value) {
        this._agedAsOfDate = value;
    }
    /**
     * Sets the balanceDue property value. The balanceDue property
     * @param value Value to set for the balanceDue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBalanceDue(@javax.annotation.Nullable final BigDecimal value) {
        this._balanceDue = value;
    }
    /**
     * Sets the currencyCode property value. The currencyCode property
     * @param value Value to set for the currencyCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrencyCode(@javax.annotation.Nullable final String value) {
        this._currencyCode = value;
    }
    /**
     * Sets the currentAmount property value. The currentAmount property
     * @param value Value to set for the currentAmount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrentAmount(@javax.annotation.Nullable final BigDecimal value) {
        this._currentAmount = value;
    }
    /**
     * Sets the customerNumber property value. The customerNumber property
     * @param value Value to set for the customerNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerNumber(@javax.annotation.Nullable final String value) {
        this._customerNumber = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the period1Amount property value. The period1Amount property
     * @param value Value to set for the period1Amount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeriod1Amount(@javax.annotation.Nullable final BigDecimal value) {
        this._period1Amount = value;
    }
    /**
     * Sets the period2Amount property value. The period2Amount property
     * @param value Value to set for the period2Amount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeriod2Amount(@javax.annotation.Nullable final BigDecimal value) {
        this._period2Amount = value;
    }
    /**
     * Sets the period3Amount property value. The period3Amount property
     * @param value Value to set for the period3Amount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeriod3Amount(@javax.annotation.Nullable final BigDecimal value) {
        this._period3Amount = value;
    }
    /**
     * Sets the periodLengthFilter property value. The periodLengthFilter property
     * @param value Value to set for the periodLengthFilter property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeriodLengthFilter(@javax.annotation.Nullable final String value) {
        this._periodLengthFilter = value;
    }
}
