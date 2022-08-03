package microsoft.graph.models;

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
/** Provides operations to manage the collection of accessReview entities. */
public class SalesOrder extends Entity implements Parsable {
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
    /** The discountAppliedBeforeTax property */
    private Boolean _discountAppliedBeforeTax;
    /** The email property */
    private String _email;
    /** The externalDocumentNumber property */
    private String _externalDocumentNumber;
    /** The fullyShipped property */
    private Boolean _fullyShipped;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The number property */
    private String _number;
    /** The orderDate property */
    private LocalDate _orderDate;
    /** The partialShipping property */
    private Boolean _partialShipping;
    /** The paymentTerm property */
    private PaymentTerm _paymentTerm;
    /** The paymentTermsId property */
    private String _paymentTermsId;
    /** The phoneNumber property */
    private String _phoneNumber;
    /** The pricesIncludeTax property */
    private Boolean _pricesIncludeTax;
    /** The requestedDeliveryDate property */
    private LocalDate _requestedDeliveryDate;
    /** The salesOrderLines property */
    private java.util.List<SalesOrderLine> _salesOrderLines;
    /** The salesperson property */
    private String _salesperson;
    /** The sellingPostalAddress property */
    private PostalAddressType _sellingPostalAddress;
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
    /**
     * Instantiates a new salesOrder and sets the default values.
     * @return a void
     */
    public SalesOrder() {
        super();
        this.setOdataType("#microsoft.graph.salesOrder");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a salesOrder
     */
    @javax.annotation.Nonnull
    public static SalesOrder createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SalesOrder();
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
     * Gets the discountAppliedBeforeTax property value. The discountAppliedBeforeTax property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDiscountAppliedBeforeTax() {
        return this._discountAppliedBeforeTax;
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
        final SalesOrder currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("billingPostalAddress", (n) -> { currentObject.setBillingPostalAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
            this.put("billToCustomerId", (n) -> { currentObject.setBillToCustomerId(n.getStringValue()); });
            this.put("billToCustomerNumber", (n) -> { currentObject.setBillToCustomerNumber(n.getStringValue()); });
            this.put("billToName", (n) -> { currentObject.setBillToName(n.getStringValue()); });
            this.put("currency", (n) -> { currentObject.setCurrency(n.getObjectValue(Currency::createFromDiscriminatorValue)); });
            this.put("currencyCode", (n) -> { currentObject.setCurrencyCode(n.getStringValue()); });
            this.put("currencyId", (n) -> { currentObject.setCurrencyId(n.getStringValue()); });
            this.put("customer", (n) -> { currentObject.setCustomer(n.getObjectValue(Customer::createFromDiscriminatorValue)); });
            this.put("customerId", (n) -> { currentObject.setCustomerId(n.getStringValue()); });
            this.put("customerName", (n) -> { currentObject.setCustomerName(n.getStringValue()); });
            this.put("customerNumber", (n) -> { currentObject.setCustomerNumber(n.getStringValue()); });
            this.put("discountAmount", (n) -> { currentObject.setDiscountAmount(n.getBigDecimalValue()); });
            this.put("discountAppliedBeforeTax", (n) -> { currentObject.setDiscountAppliedBeforeTax(n.getBooleanValue()); });
            this.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
            this.put("externalDocumentNumber", (n) -> { currentObject.setExternalDocumentNumber(n.getStringValue()); });
            this.put("fullyShipped", (n) -> { currentObject.setFullyShipped(n.getBooleanValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("number", (n) -> { currentObject.setNumber(n.getStringValue()); });
            this.put("orderDate", (n) -> { currentObject.setOrderDate(n.getLocalDateValue()); });
            this.put("partialShipping", (n) -> { currentObject.setPartialShipping(n.getBooleanValue()); });
            this.put("paymentTerm", (n) -> { currentObject.setPaymentTerm(n.getObjectValue(PaymentTerm::createFromDiscriminatorValue)); });
            this.put("paymentTermsId", (n) -> { currentObject.setPaymentTermsId(n.getStringValue()); });
            this.put("phoneNumber", (n) -> { currentObject.setPhoneNumber(n.getStringValue()); });
            this.put("pricesIncludeTax", (n) -> { currentObject.setPricesIncludeTax(n.getBooleanValue()); });
            this.put("requestedDeliveryDate", (n) -> { currentObject.setRequestedDeliveryDate(n.getLocalDateValue()); });
            this.put("salesOrderLines", (n) -> { currentObject.setSalesOrderLines(n.getCollectionOfObjectValues(SalesOrderLine::createFromDiscriminatorValue)); });
            this.put("salesperson", (n) -> { currentObject.setSalesperson(n.getStringValue()); });
            this.put("sellingPostalAddress", (n) -> { currentObject.setSellingPostalAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
            this.put("shippingPostalAddress", (n) -> { currentObject.setShippingPostalAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
            this.put("shipToContact", (n) -> { currentObject.setShipToContact(n.getStringValue()); });
            this.put("shipToName", (n) -> { currentObject.setShipToName(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
            this.put("totalAmountExcludingTax", (n) -> { currentObject.setTotalAmountExcludingTax(n.getBigDecimalValue()); });
            this.put("totalAmountIncludingTax", (n) -> { currentObject.setTotalAmountIncludingTax(n.getBigDecimalValue()); });
            this.put("totalTaxAmount", (n) -> { currentObject.setTotalTaxAmount(n.getBigDecimalValue()); });
        }};
    }
    /**
     * Gets the fullyShipped property value. The fullyShipped property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFullyShipped() {
        return this._fullyShipped;
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
     * Gets the orderDate property value. The orderDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getOrderDate() {
        return this._orderDate;
    }
    /**
     * Gets the partialShipping property value. The partialShipping property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPartialShipping() {
        return this._partialShipping;
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
     * Gets the pricesIncludeTax property value. The pricesIncludeTax property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPricesIncludeTax() {
        return this._pricesIncludeTax;
    }
    /**
     * Gets the requestedDeliveryDate property value. The requestedDeliveryDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getRequestedDeliveryDate() {
        return this._requestedDeliveryDate;
    }
    /**
     * Gets the salesOrderLines property value. The salesOrderLines property
     * @return a salesOrderLine
     */
    @javax.annotation.Nullable
    public java.util.List<SalesOrderLine> getSalesOrderLines() {
        return this._salesOrderLines;
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
     * Gets the sellingPostalAddress property value. The sellingPostalAddress property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getSellingPostalAddress() {
        return this._sellingPostalAddress;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
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
        writer.writeBooleanValue("discountAppliedBeforeTax", this.getDiscountAppliedBeforeTax());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("externalDocumentNumber", this.getExternalDocumentNumber());
        writer.writeBooleanValue("fullyShipped", this.getFullyShipped());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("number", this.getNumber());
        writer.writeLocalDateValue("orderDate", this.getOrderDate());
        writer.writeBooleanValue("partialShipping", this.getPartialShipping());
        writer.writeObjectValue("paymentTerm", this.getPaymentTerm());
        writer.writeStringValue("paymentTermsId", this.getPaymentTermsId());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeBooleanValue("pricesIncludeTax", this.getPricesIncludeTax());
        writer.writeLocalDateValue("requestedDeliveryDate", this.getRequestedDeliveryDate());
        writer.writeCollectionOfObjectValues("salesOrderLines", this.getSalesOrderLines());
        writer.writeStringValue("salesperson", this.getSalesperson());
        writer.writeObjectValue("sellingPostalAddress", this.getSellingPostalAddress());
        writer.writeObjectValue("shippingPostalAddress", this.getShippingPostalAddress());
        writer.writeStringValue("shipToContact", this.getShipToContact());
        writer.writeStringValue("shipToName", this.getShipToName());
        writer.writeStringValue("status", this.getStatus());
        writer.writeBigDecimalValue("totalAmountExcludingTax", this.getTotalAmountExcludingTax());
        writer.writeBigDecimalValue("totalAmountIncludingTax", this.getTotalAmountIncludingTax());
        writer.writeBigDecimalValue("totalTaxAmount", this.getTotalTaxAmount());
    }
    /**
     * Sets the billingPostalAddress property value. The billingPostalAddress property
     * @param value Value to set for the billingPostalAddress property.
     * @return a void
     */
    public void setBillingPostalAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this._billingPostalAddress = value;
    }
    /**
     * Sets the billToCustomerId property value. The billToCustomerId property
     * @param value Value to set for the billToCustomerId property.
     * @return a void
     */
    public void setBillToCustomerId(@javax.annotation.Nullable final String value) {
        this._billToCustomerId = value;
    }
    /**
     * Sets the billToCustomerNumber property value. The billToCustomerNumber property
     * @param value Value to set for the billToCustomerNumber property.
     * @return a void
     */
    public void setBillToCustomerNumber(@javax.annotation.Nullable final String value) {
        this._billToCustomerNumber = value;
    }
    /**
     * Sets the billToName property value. The billToName property
     * @param value Value to set for the billToName property.
     * @return a void
     */
    public void setBillToName(@javax.annotation.Nullable final String value) {
        this._billToName = value;
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     * @return a void
     */
    public void setCurrency(@javax.annotation.Nullable final Currency value) {
        this._currency = value;
    }
    /**
     * Sets the currencyCode property value. The currencyCode property
     * @param value Value to set for the currencyCode property.
     * @return a void
     */
    public void setCurrencyCode(@javax.annotation.Nullable final String value) {
        this._currencyCode = value;
    }
    /**
     * Sets the currencyId property value. The currencyId property
     * @param value Value to set for the currencyId property.
     * @return a void
     */
    public void setCurrencyId(@javax.annotation.Nullable final String value) {
        this._currencyId = value;
    }
    /**
     * Sets the customer property value. The customer property
     * @param value Value to set for the customer property.
     * @return a void
     */
    public void setCustomer(@javax.annotation.Nullable final Customer value) {
        this._customer = value;
    }
    /**
     * Sets the customerId property value. The customerId property
     * @param value Value to set for the customerId property.
     * @return a void
     */
    public void setCustomerId(@javax.annotation.Nullable final String value) {
        this._customerId = value;
    }
    /**
     * Sets the customerName property value. The customerName property
     * @param value Value to set for the customerName property.
     * @return a void
     */
    public void setCustomerName(@javax.annotation.Nullable final String value) {
        this._customerName = value;
    }
    /**
     * Sets the customerNumber property value. The customerNumber property
     * @param value Value to set for the customerNumber property.
     * @return a void
     */
    public void setCustomerNumber(@javax.annotation.Nullable final String value) {
        this._customerNumber = value;
    }
    /**
     * Sets the discountAmount property value. The discountAmount property
     * @param value Value to set for the discountAmount property.
     * @return a void
     */
    public void setDiscountAmount(@javax.annotation.Nullable final BigDecimal value) {
        this._discountAmount = value;
    }
    /**
     * Sets the discountAppliedBeforeTax property value. The discountAppliedBeforeTax property
     * @param value Value to set for the discountAppliedBeforeTax property.
     * @return a void
     */
    public void setDiscountAppliedBeforeTax(@javax.annotation.Nullable final Boolean value) {
        this._discountAppliedBeforeTax = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     * @return a void
     */
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the externalDocumentNumber property value. The externalDocumentNumber property
     * @param value Value to set for the externalDocumentNumber property.
     * @return a void
     */
    public void setExternalDocumentNumber(@javax.annotation.Nullable final String value) {
        this._externalDocumentNumber = value;
    }
    /**
     * Sets the fullyShipped property value. The fullyShipped property
     * @param value Value to set for the fullyShipped property.
     * @return a void
     */
    public void setFullyShipped(@javax.annotation.Nullable final Boolean value) {
        this._fullyShipped = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     * @return a void
     */
    public void setNumber(@javax.annotation.Nullable final String value) {
        this._number = value;
    }
    /**
     * Sets the orderDate property value. The orderDate property
     * @param value Value to set for the orderDate property.
     * @return a void
     */
    public void setOrderDate(@javax.annotation.Nullable final LocalDate value) {
        this._orderDate = value;
    }
    /**
     * Sets the partialShipping property value. The partialShipping property
     * @param value Value to set for the partialShipping property.
     * @return a void
     */
    public void setPartialShipping(@javax.annotation.Nullable final Boolean value) {
        this._partialShipping = value;
    }
    /**
     * Sets the paymentTerm property value. The paymentTerm property
     * @param value Value to set for the paymentTerm property.
     * @return a void
     */
    public void setPaymentTerm(@javax.annotation.Nullable final PaymentTerm value) {
        this._paymentTerm = value;
    }
    /**
     * Sets the paymentTermsId property value. The paymentTermsId property
     * @param value Value to set for the paymentTermsId property.
     * @return a void
     */
    public void setPaymentTermsId(@javax.annotation.Nullable final String value) {
        this._paymentTermsId = value;
    }
    /**
     * Sets the phoneNumber property value. The phoneNumber property
     * @param value Value to set for the phoneNumber property.
     * @return a void
     */
    public void setPhoneNumber(@javax.annotation.Nullable final String value) {
        this._phoneNumber = value;
    }
    /**
     * Sets the pricesIncludeTax property value. The pricesIncludeTax property
     * @param value Value to set for the pricesIncludeTax property.
     * @return a void
     */
    public void setPricesIncludeTax(@javax.annotation.Nullable final Boolean value) {
        this._pricesIncludeTax = value;
    }
    /**
     * Sets the requestedDeliveryDate property value. The requestedDeliveryDate property
     * @param value Value to set for the requestedDeliveryDate property.
     * @return a void
     */
    public void setRequestedDeliveryDate(@javax.annotation.Nullable final LocalDate value) {
        this._requestedDeliveryDate = value;
    }
    /**
     * Sets the salesOrderLines property value. The salesOrderLines property
     * @param value Value to set for the salesOrderLines property.
     * @return a void
     */
    public void setSalesOrderLines(@javax.annotation.Nullable final java.util.List<SalesOrderLine> value) {
        this._salesOrderLines = value;
    }
    /**
     * Sets the salesperson property value. The salesperson property
     * @param value Value to set for the salesperson property.
     * @return a void
     */
    public void setSalesperson(@javax.annotation.Nullable final String value) {
        this._salesperson = value;
    }
    /**
     * Sets the sellingPostalAddress property value. The sellingPostalAddress property
     * @param value Value to set for the sellingPostalAddress property.
     * @return a void
     */
    public void setSellingPostalAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this._sellingPostalAddress = value;
    }
    /**
     * Sets the shippingPostalAddress property value. The shippingPostalAddress property
     * @param value Value to set for the shippingPostalAddress property.
     * @return a void
     */
    public void setShippingPostalAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this._shippingPostalAddress = value;
    }
    /**
     * Sets the shipToContact property value. The shipToContact property
     * @param value Value to set for the shipToContact property.
     * @return a void
     */
    public void setShipToContact(@javax.annotation.Nullable final String value) {
        this._shipToContact = value;
    }
    /**
     * Sets the shipToName property value. The shipToName property
     * @param value Value to set for the shipToName property.
     * @return a void
     */
    public void setShipToName(@javax.annotation.Nullable final String value) {
        this._shipToName = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
    /**
     * Sets the totalAmountExcludingTax property value. The totalAmountExcludingTax property
     * @param value Value to set for the totalAmountExcludingTax property.
     * @return a void
     */
    public void setTotalAmountExcludingTax(@javax.annotation.Nullable final BigDecimal value) {
        this._totalAmountExcludingTax = value;
    }
    /**
     * Sets the totalAmountIncludingTax property value. The totalAmountIncludingTax property
     * @param value Value to set for the totalAmountIncludingTax property.
     * @return a void
     */
    public void setTotalAmountIncludingTax(@javax.annotation.Nullable final BigDecimal value) {
        this._totalAmountIncludingTax = value;
    }
    /**
     * Sets the totalTaxAmount property value. The totalTaxAmount property
     * @param value Value to set for the totalTaxAmount property.
     * @return a void
     */
    public void setTotalTaxAmount(@javax.annotation.Nullable final BigDecimal value) {
        this._totalTaxAmount = value;
    }
}
