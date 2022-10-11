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
/** Provides operations to manage the collection of accessReview entities. */
public class SalesInvoice extends Entity implements Parsable {
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
    /** The customerPurchaseOrderReference property */
    private String _customerPurchaseOrderReference;
    /** The discountAmount property */
    private BigDecimal _discountAmount;
    /** The discountAppliedBeforeTax property */
    private Boolean _discountAppliedBeforeTax;
    /** The dueDate property */
    private LocalDate _dueDate;
    /** The email property */
    private String _email;
    /** The externalDocumentNumber property */
    private String _externalDocumentNumber;
    /** The invoiceDate property */
    private LocalDate _invoiceDate;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The number property */
    private String _number;
    /** The orderId property */
    private String _orderId;
    /** The orderNumber property */
    private String _orderNumber;
    /** The paymentTerm property */
    private PaymentTerm _paymentTerm;
    /** The paymentTermsId property */
    private String _paymentTermsId;
    /** The phoneNumber property */
    private String _phoneNumber;
    /** The pricesIncludeTax property */
    private Boolean _pricesIncludeTax;
    /** The salesInvoiceLines property */
    private java.util.List<SalesInvoiceLine> _salesInvoiceLines;
    /** The salesperson property */
    private String _salesperson;
    /** The sellingPostalAddress property */
    private PostalAddressType _sellingPostalAddress;
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
    /**
     * Instantiates a new salesInvoice and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SalesInvoice() {
        super();
        this.setOdataType("#microsoft.graph.salesInvoice");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a salesInvoice
     */
    @javax.annotation.Nonnull
    public static SalesInvoice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SalesInvoice();
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
     * Gets the customerPurchaseOrderReference property value. The customerPurchaseOrderReference property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomerPurchaseOrderReference() {
        return this._customerPurchaseOrderReference;
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
        final SalesInvoice currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
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
            this.put("customerPurchaseOrderReference", (n) -> { currentObject.setCustomerPurchaseOrderReference(n.getStringValue()); });
            this.put("discountAmount", (n) -> { currentObject.setDiscountAmount(n.getBigDecimalValue()); });
            this.put("discountAppliedBeforeTax", (n) -> { currentObject.setDiscountAppliedBeforeTax(n.getBooleanValue()); });
            this.put("dueDate", (n) -> { currentObject.setDueDate(n.getLocalDateValue()); });
            this.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
            this.put("externalDocumentNumber", (n) -> { currentObject.setExternalDocumentNumber(n.getStringValue()); });
            this.put("invoiceDate", (n) -> { currentObject.setInvoiceDate(n.getLocalDateValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("number", (n) -> { currentObject.setNumber(n.getStringValue()); });
            this.put("orderId", (n) -> { currentObject.setOrderId(n.getStringValue()); });
            this.put("orderNumber", (n) -> { currentObject.setOrderNumber(n.getStringValue()); });
            this.put("paymentTerm", (n) -> { currentObject.setPaymentTerm(n.getObjectValue(PaymentTerm::createFromDiscriminatorValue)); });
            this.put("paymentTermsId", (n) -> { currentObject.setPaymentTermsId(n.getStringValue()); });
            this.put("phoneNumber", (n) -> { currentObject.setPhoneNumber(n.getStringValue()); });
            this.put("pricesIncludeTax", (n) -> { currentObject.setPricesIncludeTax(n.getBooleanValue()); });
            this.put("salesInvoiceLines", (n) -> { currentObject.setSalesInvoiceLines(n.getCollectionOfObjectValues(SalesInvoiceLine::createFromDiscriminatorValue)); });
            this.put("salesperson", (n) -> { currentObject.setSalesperson(n.getStringValue()); });
            this.put("sellingPostalAddress", (n) -> { currentObject.setSellingPostalAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
            this.put("shipmentMethod", (n) -> { currentObject.setShipmentMethod(n.getObjectValue(ShipmentMethod::createFromDiscriminatorValue)); });
            this.put("shipmentMethodId", (n) -> { currentObject.setShipmentMethodId(n.getStringValue()); });
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
     * Gets the invoiceDate property value. The invoiceDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getInvoiceDate() {
        return this._invoiceDate;
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
     * Gets the orderId property value. The orderId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrderId() {
        return this._orderId;
    }
    /**
     * Gets the orderNumber property value. The orderNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrderNumber() {
        return this._orderNumber;
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
     * Gets the salesInvoiceLines property value. The salesInvoiceLines property
     * @return a salesInvoiceLine
     */
    @javax.annotation.Nullable
    public java.util.List<SalesInvoiceLine> getSalesInvoiceLines() {
        return this._salesInvoiceLines;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
        writer.writeStringValue("customerPurchaseOrderReference", this.getCustomerPurchaseOrderReference());
        writer.writeBigDecimalValue("discountAmount", this.getDiscountAmount());
        writer.writeBooleanValue("discountAppliedBeforeTax", this.getDiscountAppliedBeforeTax());
        writer.writeLocalDateValue("dueDate", this.getDueDate());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("externalDocumentNumber", this.getExternalDocumentNumber());
        writer.writeLocalDateValue("invoiceDate", this.getInvoiceDate());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("orderId", this.getOrderId());
        writer.writeStringValue("orderNumber", this.getOrderNumber());
        writer.writeObjectValue("paymentTerm", this.getPaymentTerm());
        writer.writeStringValue("paymentTermsId", this.getPaymentTermsId());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeBooleanValue("pricesIncludeTax", this.getPricesIncludeTax());
        writer.writeCollectionOfObjectValues("salesInvoiceLines", this.getSalesInvoiceLines());
        writer.writeStringValue("salesperson", this.getSalesperson());
        writer.writeObjectValue("sellingPostalAddress", this.getSellingPostalAddress());
        writer.writeObjectValue("shipmentMethod", this.getShipmentMethod());
        writer.writeStringValue("shipmentMethodId", this.getShipmentMethodId());
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
     * Sets the customerPurchaseOrderReference property value. The customerPurchaseOrderReference property
     * @param value Value to set for the customerPurchaseOrderReference property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerPurchaseOrderReference(@javax.annotation.Nullable final String value) {
        this._customerPurchaseOrderReference = value;
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
     * Sets the discountAppliedBeforeTax property value. The discountAppliedBeforeTax property
     * @param value Value to set for the discountAppliedBeforeTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiscountAppliedBeforeTax(@javax.annotation.Nullable final Boolean value) {
        this._discountAppliedBeforeTax = value;
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
     * Sets the invoiceDate property value. The invoiceDate property
     * @param value Value to set for the invoiceDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvoiceDate(@javax.annotation.Nullable final LocalDate value) {
        this._invoiceDate = value;
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
     * Sets the orderId property value. The orderId property
     * @param value Value to set for the orderId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrderId(@javax.annotation.Nullable final String value) {
        this._orderId = value;
    }
    /**
     * Sets the orderNumber property value. The orderNumber property
     * @param value Value to set for the orderNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrderNumber(@javax.annotation.Nullable final String value) {
        this._orderNumber = value;
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
     * Sets the pricesIncludeTax property value. The pricesIncludeTax property
     * @param value Value to set for the pricesIncludeTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPricesIncludeTax(@javax.annotation.Nullable final Boolean value) {
        this._pricesIncludeTax = value;
    }
    /**
     * Sets the salesInvoiceLines property value. The salesInvoiceLines property
     * @param value Value to set for the salesInvoiceLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesInvoiceLines(@javax.annotation.Nullable final java.util.List<SalesInvoiceLine> value) {
        this._salesInvoiceLines = value;
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
     * Sets the sellingPostalAddress property value. The sellingPostalAddress property
     * @param value Value to set for the sellingPostalAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSellingPostalAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this._sellingPostalAddress = value;
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
}
