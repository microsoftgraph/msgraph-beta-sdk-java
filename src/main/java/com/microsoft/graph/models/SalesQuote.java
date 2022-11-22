package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class SalesQuote extends Entity implements Parsable {
    /** The acceptedDate property */
    private LocalDate _acceptedDate;
    /** The billingPostalAddress property */
    private PostalAddressType _billingPostalAddress;
    /** The billToCustomerId property */
    private String _billToCustomerId;
    /** The billToCustomerNumber property */
    private String _billToCustomerNumber;
    /** The billToName property */
    private String _billToName;
    /** The currency property */
    private Currency _currency;
    /** The currencyCode property */
    private String _currencyCode;
    /** The currencyId property */
    private String _currencyId;
    /** The customer property */
    private Customer _customer;
    /** The customerId property */
    private String _customerId;
    /** The customerName property */
    private String _customerName;
    /** The customerNumber property */
    private String _customerNumber;
    /** The discountAmount property */
    private BigDecimal _discountAmount;
    /** The documentDate property */
    private LocalDate _documentDate;
    /** The dueDate property */
    private LocalDate _dueDate;
    /** The email property */
    private String _email;
    /** The externalDocumentNumber property */
    private String _externalDocumentNumber;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The number property */
    private String _number;
    /** The paymentTerm property */
    private PaymentTerm _paymentTerm;
    /** The paymentTermsId property */
    private String _paymentTermsId;
    /** The phoneNumber property */
    private String _phoneNumber;
    /** The salesperson property */
    private String _salesperson;
    /** The salesQuoteLines property */
    private java.util.List<SalesQuoteLine> _salesQuoteLines;
    /** The sellingPostalAddress property */
    private PostalAddressType _sellingPostalAddress;
    /** The sentDate property */
    private OffsetDateTime _sentDate;
    /** The shipmentMethod property */
    private ShipmentMethod _shipmentMethod;
    /** The shipmentMethodId property */
    private String _shipmentMethodId;
    /** The shippingPostalAddress property */
    private PostalAddressType _shippingPostalAddress;
    /** The shipToContact property */
    private String _shipToContact;
    /** The shipToName property */
    private String _shipToName;
    /** The status property */
    private String _status;
    /** The totalAmountExcludingTax property */
    private BigDecimal _totalAmountExcludingTax;
    /** The totalAmountIncludingTax property */
    private BigDecimal _totalAmountIncludingTax;
    /** The totalTaxAmount property */
    private BigDecimal _totalTaxAmount;
    /** The validUntilDate property */
    private LocalDate _validUntilDate;
    /**
     * Instantiates a new salesQuote and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SalesQuote() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a salesQuote
     */
    @javax.annotation.Nonnull
    public static SalesQuote createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SalesQuote();
    }
    /**
     * Gets the acceptedDate property value. The acceptedDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getAcceptedDate() {
        return this._acceptedDate;
    }
    /**
     * Gets the billingPostalAddress property value. The billingPostalAddress property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getBillingPostalAddress() {
        return this._billingPostalAddress;
    }
    /**
     * Gets the billToCustomerId property value. The billToCustomerId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillToCustomerId() {
        return this._billToCustomerId;
    }
    /**
     * Gets the billToCustomerNumber property value. The billToCustomerNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillToCustomerNumber() {
        return this._billToCustomerNumber;
    }
    /**
     * Gets the billToName property value. The billToName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillToName() {
        return this._billToName;
    }
    /**
     * Gets the currency property value. The currency property
     * @return a currency
     */
    @javax.annotation.Nullable
    public Currency getCurrency() {
        return this._currency;
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
     * Gets the currencyId property value. The currencyId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrencyId() {
        return this._currencyId;
    }
    /**
     * Gets the customer property value. The customer property
     * @return a customer
     */
    @javax.annotation.Nullable
    public Customer getCustomer() {
        return this._customer;
    }
    /**
     * Gets the customerId property value. The customerId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomerId() {
        return this._customerId;
    }
    /**
     * Gets the customerName property value. The customerName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomerName() {
        return this._customerName;
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
     * Gets the discountAmount property value. The discountAmount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getDiscountAmount() {
        return this._discountAmount;
    }
    /**
     * Gets the documentDate property value. The documentDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getDocumentDate() {
        return this._documentDate;
    }
    /**
     * Gets the dueDate property value. The dueDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getDueDate() {
        return this._dueDate;
    }
    /**
     * Gets the email property value. The email property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this._email;
    }
    /**
     * Gets the externalDocumentNumber property value. The externalDocumentNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalDocumentNumber() {
        return this._externalDocumentNumber;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acceptedDate", (n) -> { this.setAcceptedDate(n.getLocalDateValue()); });
        deserializerMap.put("billingPostalAddress", (n) -> { this.setBillingPostalAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
        deserializerMap.put("billToCustomerId", (n) -> { this.setBillToCustomerId(n.getStringValue()); });
        deserializerMap.put("billToCustomerNumber", (n) -> { this.setBillToCustomerNumber(n.getStringValue()); });
        deserializerMap.put("billToName", (n) -> { this.setBillToName(n.getStringValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getObjectValue(Currency::createFromDiscriminatorValue)); });
        deserializerMap.put("currencyCode", (n) -> { this.setCurrencyCode(n.getStringValue()); });
        deserializerMap.put("currencyId", (n) -> { this.setCurrencyId(n.getStringValue()); });
        deserializerMap.put("customer", (n) -> { this.setCustomer(n.getObjectValue(Customer::createFromDiscriminatorValue)); });
        deserializerMap.put("customerId", (n) -> { this.setCustomerId(n.getStringValue()); });
        deserializerMap.put("customerName", (n) -> { this.setCustomerName(n.getStringValue()); });
        deserializerMap.put("customerNumber", (n) -> { this.setCustomerNumber(n.getStringValue()); });
        deserializerMap.put("discountAmount", (n) -> { this.setDiscountAmount(n.getBigDecimalValue()); });
        deserializerMap.put("documentDate", (n) -> { this.setDocumentDate(n.getLocalDateValue()); });
        deserializerMap.put("dueDate", (n) -> { this.setDueDate(n.getLocalDateValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("externalDocumentNumber", (n) -> { this.setExternalDocumentNumber(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("paymentTerm", (n) -> { this.setPaymentTerm(n.getObjectValue(PaymentTerm::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentTermsId", (n) -> { this.setPaymentTermsId(n.getStringValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("salesperson", (n) -> { this.setSalesperson(n.getStringValue()); });
        deserializerMap.put("salesQuoteLines", (n) -> { this.setSalesQuoteLines(n.getCollectionOfObjectValues(SalesQuoteLine::createFromDiscriminatorValue)); });
        deserializerMap.put("sellingPostalAddress", (n) -> { this.setSellingPostalAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
        deserializerMap.put("sentDate", (n) -> { this.setSentDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("shipmentMethod", (n) -> { this.setShipmentMethod(n.getObjectValue(ShipmentMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("shipmentMethodId", (n) -> { this.setShipmentMethodId(n.getStringValue()); });
        deserializerMap.put("shippingPostalAddress", (n) -> { this.setShippingPostalAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
        deserializerMap.put("shipToContact", (n) -> { this.setShipToContact(n.getStringValue()); });
        deserializerMap.put("shipToName", (n) -> { this.setShipToName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("totalAmountExcludingTax", (n) -> { this.setTotalAmountExcludingTax(n.getBigDecimalValue()); });
        deserializerMap.put("totalAmountIncludingTax", (n) -> { this.setTotalAmountIncludingTax(n.getBigDecimalValue()); });
        deserializerMap.put("totalTaxAmount", (n) -> { this.setTotalTaxAmount(n.getBigDecimalValue()); });
        deserializerMap.put("validUntilDate", (n) -> { this.setValidUntilDate(n.getLocalDateValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the number property value. The number property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNumber() {
        return this._number;
    }
    /**
     * Gets the paymentTerm property value. The paymentTerm property
     * @return a paymentTerm
     */
    @javax.annotation.Nullable
    public PaymentTerm getPaymentTerm() {
        return this._paymentTerm;
    }
    /**
     * Gets the paymentTermsId property value. The paymentTermsId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPaymentTermsId() {
        return this._paymentTermsId;
    }
    /**
     * Gets the phoneNumber property value. The phoneNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return this._phoneNumber;
    }
    /**
     * Gets the salesperson property value. The salesperson property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSalesperson() {
        return this._salesperson;
    }
    /**
     * Gets the salesQuoteLines property value. The salesQuoteLines property
     * @return a salesQuoteLine
     */
    @javax.annotation.Nullable
    public java.util.List<SalesQuoteLine> getSalesQuoteLines() {
        return this._salesQuoteLines;
    }
    /**
     * Gets the sellingPostalAddress property value. The sellingPostalAddress property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getSellingPostalAddress() {
        return this._sellingPostalAddress;
    }
    /**
     * Gets the sentDate property value. The sentDate property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSentDate() {
        return this._sentDate;
    }
    /**
     * Gets the shipmentMethod property value. The shipmentMethod property
     * @return a shipmentMethod
     */
    @javax.annotation.Nullable
    public ShipmentMethod getShipmentMethod() {
        return this._shipmentMethod;
    }
    /**
     * Gets the shipmentMethodId property value. The shipmentMethodId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getShipmentMethodId() {
        return this._shipmentMethodId;
    }
    /**
     * Gets the shippingPostalAddress property value. The shippingPostalAddress property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getShippingPostalAddress() {
        return this._shippingPostalAddress;
    }
    /**
     * Gets the shipToContact property value. The shipToContact property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getShipToContact() {
        return this._shipToContact;
    }
    /**
     * Gets the shipToName property value. The shipToName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getShipToName() {
        return this._shipToName;
    }
    /**
     * Gets the status property value. The status property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Gets the totalAmountExcludingTax property value. The totalAmountExcludingTax property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getTotalAmountExcludingTax() {
        return this._totalAmountExcludingTax;
    }
    /**
     * Gets the totalAmountIncludingTax property value. The totalAmountIncludingTax property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getTotalAmountIncludingTax() {
        return this._totalAmountIncludingTax;
    }
    /**
     * Gets the totalTaxAmount property value. The totalTaxAmount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getTotalTaxAmount() {
        return this._totalTaxAmount;
    }
    /**
     * Gets the validUntilDate property value. The validUntilDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getValidUntilDate() {
        return this._validUntilDate;
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
        writer.writeLocalDateValue("acceptedDate", this.getAcceptedDate());
        writer.writeObjectValue("billingPostalAddress", this.getBillingPostalAddress());
        writer.writeStringValue("billToCustomerId", this.getBillToCustomerId());
        writer.writeStringValue("billToCustomerNumber", this.getBillToCustomerNumber());
        writer.writeStringValue("billToName", this.getBillToName());
        writer.writeObjectValue("currency", this.getCurrency());
        writer.writeStringValue("currencyCode", this.getCurrencyCode());
        writer.writeStringValue("currencyId", this.getCurrencyId());
        writer.writeObjectValue("customer", this.getCustomer());
        writer.writeStringValue("customerId", this.getCustomerId());
        writer.writeStringValue("customerName", this.getCustomerName());
        writer.writeStringValue("customerNumber", this.getCustomerNumber());
        writer.writeBigDecimalValue("discountAmount", this.getDiscountAmount());
        writer.writeLocalDateValue("documentDate", this.getDocumentDate());
        writer.writeLocalDateValue("dueDate", this.getDueDate());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("externalDocumentNumber", this.getExternalDocumentNumber());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("number", this.getNumber());
        writer.writeObjectValue("paymentTerm", this.getPaymentTerm());
        writer.writeStringValue("paymentTermsId", this.getPaymentTermsId());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeStringValue("salesperson", this.getSalesperson());
        writer.writeCollectionOfObjectValues("salesQuoteLines", this.getSalesQuoteLines());
        writer.writeObjectValue("sellingPostalAddress", this.getSellingPostalAddress());
        writer.writeOffsetDateTimeValue("sentDate", this.getSentDate());
        writer.writeObjectValue("shipmentMethod", this.getShipmentMethod());
        writer.writeStringValue("shipmentMethodId", this.getShipmentMethodId());
        writer.writeObjectValue("shippingPostalAddress", this.getShippingPostalAddress());
        writer.writeStringValue("shipToContact", this.getShipToContact());
        writer.writeStringValue("shipToName", this.getShipToName());
        writer.writeStringValue("status", this.getStatus());
        writer.writeBigDecimalValue("totalAmountExcludingTax", this.getTotalAmountExcludingTax());
        writer.writeBigDecimalValue("totalAmountIncludingTax", this.getTotalAmountIncludingTax());
        writer.writeBigDecimalValue("totalTaxAmount", this.getTotalTaxAmount());
        writer.writeLocalDateValue("validUntilDate", this.getValidUntilDate());
    }
    /**
     * Sets the acceptedDate property value. The acceptedDate property
     * @param value Value to set for the acceptedDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcceptedDate(@javax.annotation.Nullable final LocalDate value) {
        this._acceptedDate = value;
    }
    /**
     * Sets the billingPostalAddress property value. The billingPostalAddress property
     * @param value Value to set for the billingPostalAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingPostalAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this._billingPostalAddress = value;
    }
    /**
     * Sets the billToCustomerId property value. The billToCustomerId property
     * @param value Value to set for the billToCustomerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillToCustomerId(@javax.annotation.Nullable final String value) {
        this._billToCustomerId = value;
    }
    /**
     * Sets the billToCustomerNumber property value. The billToCustomerNumber property
     * @param value Value to set for the billToCustomerNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillToCustomerNumber(@javax.annotation.Nullable final String value) {
        this._billToCustomerNumber = value;
    }
    /**
     * Sets the billToName property value. The billToName property
     * @param value Value to set for the billToName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillToName(@javax.annotation.Nullable final String value) {
        this._billToName = value;
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrency(@javax.annotation.Nullable final Currency value) {
        this._currency = value;
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
     * Sets the currencyId property value. The currencyId property
     * @param value Value to set for the currencyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrencyId(@javax.annotation.Nullable final String value) {
        this._currencyId = value;
    }
    /**
     * Sets the customer property value. The customer property
     * @param value Value to set for the customer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomer(@javax.annotation.Nullable final Customer value) {
        this._customer = value;
    }
    /**
     * Sets the customerId property value. The customerId property
     * @param value Value to set for the customerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerId(@javax.annotation.Nullable final String value) {
        this._customerId = value;
    }
    /**
     * Sets the customerName property value. The customerName property
     * @param value Value to set for the customerName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerName(@javax.annotation.Nullable final String value) {
        this._customerName = value;
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
     * Sets the discountAmount property value. The discountAmount property
     * @param value Value to set for the discountAmount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiscountAmount(@javax.annotation.Nullable final BigDecimal value) {
        this._discountAmount = value;
    }
    /**
     * Sets the documentDate property value. The documentDate property
     * @param value Value to set for the documentDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDocumentDate(@javax.annotation.Nullable final LocalDate value) {
        this._documentDate = value;
    }
    /**
     * Sets the dueDate property value. The dueDate property
     * @param value Value to set for the dueDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDueDate(@javax.annotation.Nullable final LocalDate value) {
        this._dueDate = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the externalDocumentNumber property value. The externalDocumentNumber property
     * @param value Value to set for the externalDocumentNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalDocumentNumber(@javax.annotation.Nullable final String value) {
        this._externalDocumentNumber = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumber(@javax.annotation.Nullable final String value) {
        this._number = value;
    }
    /**
     * Sets the paymentTerm property value. The paymentTerm property
     * @param value Value to set for the paymentTerm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPaymentTerm(@javax.annotation.Nullable final PaymentTerm value) {
        this._paymentTerm = value;
    }
    /**
     * Sets the paymentTermsId property value. The paymentTermsId property
     * @param value Value to set for the paymentTermsId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPaymentTermsId(@javax.annotation.Nullable final String value) {
        this._paymentTermsId = value;
    }
    /**
     * Sets the phoneNumber property value. The phoneNumber property
     * @param value Value to set for the phoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneNumber(@javax.annotation.Nullable final String value) {
        this._phoneNumber = value;
    }
    /**
     * Sets the salesperson property value. The salesperson property
     * @param value Value to set for the salesperson property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesperson(@javax.annotation.Nullable final String value) {
        this._salesperson = value;
    }
    /**
     * Sets the salesQuoteLines property value. The salesQuoteLines property
     * @param value Value to set for the salesQuoteLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesQuoteLines(@javax.annotation.Nullable final java.util.List<SalesQuoteLine> value) {
        this._salesQuoteLines = value;
    }
    /**
     * Sets the sellingPostalAddress property value. The sellingPostalAddress property
     * @param value Value to set for the sellingPostalAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSellingPostalAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this._sellingPostalAddress = value;
    }
    /**
     * Sets the sentDate property value. The sentDate property
     * @param value Value to set for the sentDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSentDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this._sentDate = value;
    }
    /**
     * Sets the shipmentMethod property value. The shipmentMethod property
     * @param value Value to set for the shipmentMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShipmentMethod(@javax.annotation.Nullable final ShipmentMethod value) {
        this._shipmentMethod = value;
    }
    /**
     * Sets the shipmentMethodId property value. The shipmentMethodId property
     * @param value Value to set for the shipmentMethodId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShipmentMethodId(@javax.annotation.Nullable final String value) {
        this._shipmentMethodId = value;
    }
    /**
     * Sets the shippingPostalAddress property value. The shippingPostalAddress property
     * @param value Value to set for the shippingPostalAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShippingPostalAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this._shippingPostalAddress = value;
    }
    /**
     * Sets the shipToContact property value. The shipToContact property
     * @param value Value to set for the shipToContact property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShipToContact(@javax.annotation.Nullable final String value) {
        this._shipToContact = value;
    }
    /**
     * Sets the shipToName property value. The shipToName property
     * @param value Value to set for the shipToName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShipToName(@javax.annotation.Nullable final String value) {
        this._shipToName = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
    /**
     * Sets the totalAmountExcludingTax property value. The totalAmountExcludingTax property
     * @param value Value to set for the totalAmountExcludingTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalAmountExcludingTax(@javax.annotation.Nullable final BigDecimal value) {
        this._totalAmountExcludingTax = value;
    }
    /**
     * Sets the totalAmountIncludingTax property value. The totalAmountIncludingTax property
     * @param value Value to set for the totalAmountIncludingTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalAmountIncludingTax(@javax.annotation.Nullable final BigDecimal value) {
        this._totalAmountIncludingTax = value;
    }
    /**
     * Sets the totalTaxAmount property value. The totalTaxAmount property
     * @param value Value to set for the totalTaxAmount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalTaxAmount(@javax.annotation.Nullable final BigDecimal value) {
        this._totalTaxAmount = value;
    }
    /**
     * Sets the validUntilDate property value. The validUntilDate property
     * @param value Value to set for the validUntilDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setValidUntilDate(@javax.annotation.Nullable final LocalDate value) {
        this._validUntilDate = value;
    }
}
