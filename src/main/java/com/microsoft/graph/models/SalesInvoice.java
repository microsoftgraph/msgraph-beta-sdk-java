package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class SalesInvoice implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The billingPostalAddress property */
    private PostalAddressType billingPostalAddress;
    /** The billToCustomerId property */
    private UUID billToCustomerId;
    /** The billToCustomerNumber property */
    private String billToCustomerNumber;
    /** The billToName property */
    private String billToName;
    /** The currency property */
    private Currency currency;
    /** The currencyCode property */
    private String currencyCode;
    /** The currencyId property */
    private UUID currencyId;
    /** The customer property */
    private Customer customer;
    /** The customerId property */
    private UUID customerId;
    /** The customerName property */
    private String customerName;
    /** The customerNumber property */
    private String customerNumber;
    /** The customerPurchaseOrderReference property */
    private String customerPurchaseOrderReference;
    /** The discountAmount property */
    private BigDecimal discountAmount;
    /** The discountAppliedBeforeTax property */
    private Boolean discountAppliedBeforeTax;
    /** The dueDate property */
    private LocalDate dueDate;
    /** The email property */
    private String email;
    /** The externalDocumentNumber property */
    private String externalDocumentNumber;
    /** The id property */
    private UUID id;
    /** The invoiceDate property */
    private LocalDate invoiceDate;
    /** The lastModifiedDateTime property */
    private OffsetDateTime lastModifiedDateTime;
    /** The number property */
    private String number;
    /** The OdataType property */
    private String odataType;
    /** The orderId property */
    private UUID orderId;
    /** The orderNumber property */
    private String orderNumber;
    /** The paymentTerm property */
    private PaymentTerm paymentTerm;
    /** The paymentTermsId property */
    private UUID paymentTermsId;
    /** The phoneNumber property */
    private String phoneNumber;
    /** The pricesIncludeTax property */
    private Boolean pricesIncludeTax;
    /** The salesInvoiceLines property */
    private java.util.List<SalesInvoiceLine> salesInvoiceLines;
    /** The salesperson property */
    private String salesperson;
    /** The sellingPostalAddress property */
    private PostalAddressType sellingPostalAddress;
    /** The shipmentMethod property */
    private ShipmentMethod shipmentMethod;
    /** The shipmentMethodId property */
    private UUID shipmentMethodId;
    /** The shippingPostalAddress property */
    private PostalAddressType shippingPostalAddress;
    /** The shipToContact property */
    private String shipToContact;
    /** The shipToName property */
    private String shipToName;
    /** The status property */
    private String status;
    /** The totalAmountExcludingTax property */
    private BigDecimal totalAmountExcludingTax;
    /** The totalAmountIncludingTax property */
    private BigDecimal totalAmountIncludingTax;
    /** The totalTaxAmount property */
    private BigDecimal totalTaxAmount;
    /**
     * Instantiates a new salesInvoice and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SalesInvoice() {
        this.setAdditionalData(new HashMap<>());
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
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the billingPostalAddress property value. The billingPostalAddress property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getBillingPostalAddress() {
        return this.billingPostalAddress;
    }
    /**
     * Gets the billToCustomerId property value. The billToCustomerId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getBillToCustomerId() {
        return this.billToCustomerId;
    }
    /**
     * Gets the billToCustomerNumber property value. The billToCustomerNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillToCustomerNumber() {
        return this.billToCustomerNumber;
    }
    /**
     * Gets the billToName property value. The billToName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBillToName() {
        return this.billToName;
    }
    /**
     * Gets the currency property value. The currency property
     * @return a currency
     */
    @javax.annotation.Nullable
    public Currency getCurrency() {
        return this.currency;
    }
    /**
     * Gets the currencyCode property value. The currencyCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCurrencyCode() {
        return this.currencyCode;
    }
    /**
     * Gets the currencyId property value. The currencyId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getCurrencyId() {
        return this.currencyId;
    }
    /**
     * Gets the customer property value. The customer property
     * @return a customer
     */
    @javax.annotation.Nullable
    public Customer getCustomer() {
        return this.customer;
    }
    /**
     * Gets the customerId property value. The customerId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getCustomerId() {
        return this.customerId;
    }
    /**
     * Gets the customerName property value. The customerName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomerName() {
        return this.customerName;
    }
    /**
     * Gets the customerNumber property value. The customerNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomerNumber() {
        return this.customerNumber;
    }
    /**
     * Gets the customerPurchaseOrderReference property value. The customerPurchaseOrderReference property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomerPurchaseOrderReference() {
        return this.customerPurchaseOrderReference;
    }
    /**
     * Gets the discountAmount property value. The discountAmount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getDiscountAmount() {
        return this.discountAmount;
    }
    /**
     * Gets the discountAppliedBeforeTax property value. The discountAppliedBeforeTax property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDiscountAppliedBeforeTax() {
        return this.discountAppliedBeforeTax;
    }
    /**
     * Gets the dueDate property value. The dueDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getDueDate() {
        return this.dueDate;
    }
    /**
     * Gets the email property value. The email property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * Gets the externalDocumentNumber property value. The externalDocumentNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalDocumentNumber() {
        return this.externalDocumentNumber;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(40);
        deserializerMap.put("billingPostalAddress", (n) -> { this.setBillingPostalAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
        deserializerMap.put("billToCustomerId", (n) -> { this.setBillToCustomerId(n.getUUIDValue()); });
        deserializerMap.put("billToCustomerNumber", (n) -> { this.setBillToCustomerNumber(n.getStringValue()); });
        deserializerMap.put("billToName", (n) -> { this.setBillToName(n.getStringValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getObjectValue(Currency::createFromDiscriminatorValue)); });
        deserializerMap.put("currencyCode", (n) -> { this.setCurrencyCode(n.getStringValue()); });
        deserializerMap.put("currencyId", (n) -> { this.setCurrencyId(n.getUUIDValue()); });
        deserializerMap.put("customer", (n) -> { this.setCustomer(n.getObjectValue(Customer::createFromDiscriminatorValue)); });
        deserializerMap.put("customerId", (n) -> { this.setCustomerId(n.getUUIDValue()); });
        deserializerMap.put("customerName", (n) -> { this.setCustomerName(n.getStringValue()); });
        deserializerMap.put("customerNumber", (n) -> { this.setCustomerNumber(n.getStringValue()); });
        deserializerMap.put("customerPurchaseOrderReference", (n) -> { this.setCustomerPurchaseOrderReference(n.getStringValue()); });
        deserializerMap.put("discountAmount", (n) -> { this.setDiscountAmount(n.getBigDecimalValue()); });
        deserializerMap.put("discountAppliedBeforeTax", (n) -> { this.setDiscountAppliedBeforeTax(n.getBooleanValue()); });
        deserializerMap.put("dueDate", (n) -> { this.setDueDate(n.getLocalDateValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("externalDocumentNumber", (n) -> { this.setExternalDocumentNumber(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("invoiceDate", (n) -> { this.setInvoiceDate(n.getLocalDateValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("orderId", (n) -> { this.setOrderId(n.getUUIDValue()); });
        deserializerMap.put("orderNumber", (n) -> { this.setOrderNumber(n.getStringValue()); });
        deserializerMap.put("paymentTerm", (n) -> { this.setPaymentTerm(n.getObjectValue(PaymentTerm::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentTermsId", (n) -> { this.setPaymentTermsId(n.getUUIDValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("pricesIncludeTax", (n) -> { this.setPricesIncludeTax(n.getBooleanValue()); });
        deserializerMap.put("salesInvoiceLines", (n) -> { this.setSalesInvoiceLines(n.getCollectionOfObjectValues(SalesInvoiceLine::createFromDiscriminatorValue)); });
        deserializerMap.put("salesperson", (n) -> { this.setSalesperson(n.getStringValue()); });
        deserializerMap.put("sellingPostalAddress", (n) -> { this.setSellingPostalAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
        deserializerMap.put("shipmentMethod", (n) -> { this.setShipmentMethod(n.getObjectValue(ShipmentMethod::createFromDiscriminatorValue)); });
        deserializerMap.put("shipmentMethodId", (n) -> { this.setShipmentMethodId(n.getUUIDValue()); });
        deserializerMap.put("shippingPostalAddress", (n) -> { this.setShippingPostalAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
        deserializerMap.put("shipToContact", (n) -> { this.setShipToContact(n.getStringValue()); });
        deserializerMap.put("shipToName", (n) -> { this.setShipToName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("totalAmountExcludingTax", (n) -> { this.setTotalAmountExcludingTax(n.getBigDecimalValue()); });
        deserializerMap.put("totalAmountIncludingTax", (n) -> { this.setTotalAmountIncludingTax(n.getBigDecimalValue()); });
        deserializerMap.put("totalTaxAmount", (n) -> { this.setTotalTaxAmount(n.getBigDecimalValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the invoiceDate property value. The invoiceDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getInvoiceDate() {
        return this.invoiceDate;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the number property value. The number property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNumber() {
        return this.number;
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
     * Gets the orderId property value. The orderId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getOrderId() {
        return this.orderId;
    }
    /**
     * Gets the orderNumber property value. The orderNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }
    /**
     * Gets the paymentTerm property value. The paymentTerm property
     * @return a paymentTerm
     */
    @javax.annotation.Nullable
    public PaymentTerm getPaymentTerm() {
        return this.paymentTerm;
    }
    /**
     * Gets the paymentTermsId property value. The paymentTermsId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getPaymentTermsId() {
        return this.paymentTermsId;
    }
    /**
     * Gets the phoneNumber property value. The phoneNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the pricesIncludeTax property value. The pricesIncludeTax property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPricesIncludeTax() {
        return this.pricesIncludeTax;
    }
    /**
     * Gets the salesInvoiceLines property value. The salesInvoiceLines property
     * @return a salesInvoiceLine
     */
    @javax.annotation.Nullable
    public java.util.List<SalesInvoiceLine> getSalesInvoiceLines() {
        return this.salesInvoiceLines;
    }
    /**
     * Gets the salesperson property value. The salesperson property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSalesperson() {
        return this.salesperson;
    }
    /**
     * Gets the sellingPostalAddress property value. The sellingPostalAddress property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getSellingPostalAddress() {
        return this.sellingPostalAddress;
    }
    /**
     * Gets the shipmentMethod property value. The shipmentMethod property
     * @return a shipmentMethod
     */
    @javax.annotation.Nullable
    public ShipmentMethod getShipmentMethod() {
        return this.shipmentMethod;
    }
    /**
     * Gets the shipmentMethodId property value. The shipmentMethodId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getShipmentMethodId() {
        return this.shipmentMethodId;
    }
    /**
     * Gets the shippingPostalAddress property value. The shippingPostalAddress property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getShippingPostalAddress() {
        return this.shippingPostalAddress;
    }
    /**
     * Gets the shipToContact property value. The shipToContact property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getShipToContact() {
        return this.shipToContact;
    }
    /**
     * Gets the shipToName property value. The shipToName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getShipToName() {
        return this.shipToName;
    }
    /**
     * Gets the status property value. The status property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the totalAmountExcludingTax property value. The totalAmountExcludingTax property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getTotalAmountExcludingTax() {
        return this.totalAmountExcludingTax;
    }
    /**
     * Gets the totalAmountIncludingTax property value. The totalAmountIncludingTax property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getTotalAmountIncludingTax() {
        return this.totalAmountIncludingTax;
    }
    /**
     * Gets the totalTaxAmount property value. The totalTaxAmount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getTotalTaxAmount() {
        return this.totalTaxAmount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("billingPostalAddress", this.getBillingPostalAddress());
        writer.writeUUIDValue("billToCustomerId", this.getBillToCustomerId());
        writer.writeStringValue("billToCustomerNumber", this.getBillToCustomerNumber());
        writer.writeStringValue("billToName", this.getBillToName());
        writer.writeObjectValue("currency", this.getCurrency());
        writer.writeStringValue("currencyCode", this.getCurrencyCode());
        writer.writeUUIDValue("currencyId", this.getCurrencyId());
        writer.writeObjectValue("customer", this.getCustomer());
        writer.writeUUIDValue("customerId", this.getCustomerId());
        writer.writeStringValue("customerName", this.getCustomerName());
        writer.writeStringValue("customerNumber", this.getCustomerNumber());
        writer.writeStringValue("customerPurchaseOrderReference", this.getCustomerPurchaseOrderReference());
        writer.writeBigDecimalValue("discountAmount", this.getDiscountAmount());
        writer.writeBooleanValue("discountAppliedBeforeTax", this.getDiscountAppliedBeforeTax());
        writer.writeLocalDateValue("dueDate", this.getDueDate());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("externalDocumentNumber", this.getExternalDocumentNumber());
        writer.writeUUIDValue("id", this.getId());
        writer.writeLocalDateValue("invoiceDate", this.getInvoiceDate());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeUUIDValue("orderId", this.getOrderId());
        writer.writeStringValue("orderNumber", this.getOrderNumber());
        writer.writeObjectValue("paymentTerm", this.getPaymentTerm());
        writer.writeUUIDValue("paymentTermsId", this.getPaymentTermsId());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeBooleanValue("pricesIncludeTax", this.getPricesIncludeTax());
        writer.writeCollectionOfObjectValues("salesInvoiceLines", this.getSalesInvoiceLines());
        writer.writeStringValue("salesperson", this.getSalesperson());
        writer.writeObjectValue("sellingPostalAddress", this.getSellingPostalAddress());
        writer.writeObjectValue("shipmentMethod", this.getShipmentMethod());
        writer.writeUUIDValue("shipmentMethodId", this.getShipmentMethodId());
        writer.writeObjectValue("shippingPostalAddress", this.getShippingPostalAddress());
        writer.writeStringValue("shipToContact", this.getShipToContact());
        writer.writeStringValue("shipToName", this.getShipToName());
        writer.writeStringValue("status", this.getStatus());
        writer.writeBigDecimalValue("totalAmountExcludingTax", this.getTotalAmountExcludingTax());
        writer.writeBigDecimalValue("totalAmountIncludingTax", this.getTotalAmountIncludingTax());
        writer.writeBigDecimalValue("totalTaxAmount", this.getTotalTaxAmount());
        writer.writeAdditionalData(this.getAdditionalData());
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
     * Sets the billingPostalAddress property value. The billingPostalAddress property
     * @param value Value to set for the billingPostalAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillingPostalAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this.billingPostalAddress = value;
    }
    /**
     * Sets the billToCustomerId property value. The billToCustomerId property
     * @param value Value to set for the billToCustomerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillToCustomerId(@javax.annotation.Nullable final UUID value) {
        this.billToCustomerId = value;
    }
    /**
     * Sets the billToCustomerNumber property value. The billToCustomerNumber property
     * @param value Value to set for the billToCustomerNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillToCustomerNumber(@javax.annotation.Nullable final String value) {
        this.billToCustomerNumber = value;
    }
    /**
     * Sets the billToName property value. The billToName property
     * @param value Value to set for the billToName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBillToName(@javax.annotation.Nullable final String value) {
        this.billToName = value;
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrency(@javax.annotation.Nullable final Currency value) {
        this.currency = value;
    }
    /**
     * Sets the currencyCode property value. The currencyCode property
     * @param value Value to set for the currencyCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrencyCode(@javax.annotation.Nullable final String value) {
        this.currencyCode = value;
    }
    /**
     * Sets the currencyId property value. The currencyId property
     * @param value Value to set for the currencyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCurrencyId(@javax.annotation.Nullable final UUID value) {
        this.currencyId = value;
    }
    /**
     * Sets the customer property value. The customer property
     * @param value Value to set for the customer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomer(@javax.annotation.Nullable final Customer value) {
        this.customer = value;
    }
    /**
     * Sets the customerId property value. The customerId property
     * @param value Value to set for the customerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerId(@javax.annotation.Nullable final UUID value) {
        this.customerId = value;
    }
    /**
     * Sets the customerName property value. The customerName property
     * @param value Value to set for the customerName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerName(@javax.annotation.Nullable final String value) {
        this.customerName = value;
    }
    /**
     * Sets the customerNumber property value. The customerNumber property
     * @param value Value to set for the customerNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerNumber(@javax.annotation.Nullable final String value) {
        this.customerNumber = value;
    }
    /**
     * Sets the customerPurchaseOrderReference property value. The customerPurchaseOrderReference property
     * @param value Value to set for the customerPurchaseOrderReference property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomerPurchaseOrderReference(@javax.annotation.Nullable final String value) {
        this.customerPurchaseOrderReference = value;
    }
    /**
     * Sets the discountAmount property value. The discountAmount property
     * @param value Value to set for the discountAmount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiscountAmount(@javax.annotation.Nullable final BigDecimal value) {
        this.discountAmount = value;
    }
    /**
     * Sets the discountAppliedBeforeTax property value. The discountAppliedBeforeTax property
     * @param value Value to set for the discountAppliedBeforeTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiscountAppliedBeforeTax(@javax.annotation.Nullable final Boolean value) {
        this.discountAppliedBeforeTax = value;
    }
    /**
     * Sets the dueDate property value. The dueDate property
     * @param value Value to set for the dueDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDueDate(@javax.annotation.Nullable final LocalDate value) {
        this.dueDate = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the externalDocumentNumber property value. The externalDocumentNumber property
     * @param value Value to set for the externalDocumentNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalDocumentNumber(@javax.annotation.Nullable final String value) {
        this.externalDocumentNumber = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the invoiceDate property value. The invoiceDate property
     * @param value Value to set for the invoiceDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvoiceDate(@javax.annotation.Nullable final LocalDate value) {
        this.invoiceDate = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumber(@javax.annotation.Nullable final String value) {
        this.number = value;
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
     * Sets the orderId property value. The orderId property
     * @param value Value to set for the orderId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrderId(@javax.annotation.Nullable final UUID value) {
        this.orderId = value;
    }
    /**
     * Sets the orderNumber property value. The orderNumber property
     * @param value Value to set for the orderNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrderNumber(@javax.annotation.Nullable final String value) {
        this.orderNumber = value;
    }
    /**
     * Sets the paymentTerm property value. The paymentTerm property
     * @param value Value to set for the paymentTerm property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPaymentTerm(@javax.annotation.Nullable final PaymentTerm value) {
        this.paymentTerm = value;
    }
    /**
     * Sets the paymentTermsId property value. The paymentTermsId property
     * @param value Value to set for the paymentTermsId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPaymentTermsId(@javax.annotation.Nullable final UUID value) {
        this.paymentTermsId = value;
    }
    /**
     * Sets the phoneNumber property value. The phoneNumber property
     * @param value Value to set for the phoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneNumber(@javax.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the pricesIncludeTax property value. The pricesIncludeTax property
     * @param value Value to set for the pricesIncludeTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPricesIncludeTax(@javax.annotation.Nullable final Boolean value) {
        this.pricesIncludeTax = value;
    }
    /**
     * Sets the salesInvoiceLines property value. The salesInvoiceLines property
     * @param value Value to set for the salesInvoiceLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesInvoiceLines(@javax.annotation.Nullable final java.util.List<SalesInvoiceLine> value) {
        this.salesInvoiceLines = value;
    }
    /**
     * Sets the salesperson property value. The salesperson property
     * @param value Value to set for the salesperson property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalesperson(@javax.annotation.Nullable final String value) {
        this.salesperson = value;
    }
    /**
     * Sets the sellingPostalAddress property value. The sellingPostalAddress property
     * @param value Value to set for the sellingPostalAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSellingPostalAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this.sellingPostalAddress = value;
    }
    /**
     * Sets the shipmentMethod property value. The shipmentMethod property
     * @param value Value to set for the shipmentMethod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShipmentMethod(@javax.annotation.Nullable final ShipmentMethod value) {
        this.shipmentMethod = value;
    }
    /**
     * Sets the shipmentMethodId property value. The shipmentMethodId property
     * @param value Value to set for the shipmentMethodId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShipmentMethodId(@javax.annotation.Nullable final UUID value) {
        this.shipmentMethodId = value;
    }
    /**
     * Sets the shippingPostalAddress property value. The shippingPostalAddress property
     * @param value Value to set for the shippingPostalAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShippingPostalAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this.shippingPostalAddress = value;
    }
    /**
     * Sets the shipToContact property value. The shipToContact property
     * @param value Value to set for the shipToContact property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShipToContact(@javax.annotation.Nullable final String value) {
        this.shipToContact = value;
    }
    /**
     * Sets the shipToName property value. The shipToName property
     * @param value Value to set for the shipToName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShipToName(@javax.annotation.Nullable final String value) {
        this.shipToName = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the totalAmountExcludingTax property value. The totalAmountExcludingTax property
     * @param value Value to set for the totalAmountExcludingTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalAmountExcludingTax(@javax.annotation.Nullable final BigDecimal value) {
        this.totalAmountExcludingTax = value;
    }
    /**
     * Sets the totalAmountIncludingTax property value. The totalAmountIncludingTax property
     * @param value Value to set for the totalAmountIncludingTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalAmountIncludingTax(@javax.annotation.Nullable final BigDecimal value) {
        this.totalAmountIncludingTax = value;
    }
    /**
     * Sets the totalTaxAmount property value. The totalTaxAmount property
     * @param value Value to set for the totalTaxAmount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalTaxAmount(@javax.annotation.Nullable final BigDecimal value) {
        this.totalTaxAmount = value;
    }
}
