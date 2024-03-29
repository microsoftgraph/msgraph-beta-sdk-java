package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SalesCreditMemo implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link SalesCreditMemo} and sets the default values.
     */
    public SalesCreditMemo() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SalesCreditMemo}
     */
    @jakarta.annotation.Nonnull
    public static SalesCreditMemo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SalesCreditMemo();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the billingPostalAddress property value. The billingPostalAddress property
     * @return a {@link PostalAddressType}
     */
    @jakarta.annotation.Nullable
    public PostalAddressType getBillingPostalAddress() {
        return this.backingStore.get("billingPostalAddress");
    }
    /**
     * Gets the billToCustomerId property value. The billToCustomerId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getBillToCustomerId() {
        return this.backingStore.get("billToCustomerId");
    }
    /**
     * Gets the billToCustomerNumber property value. The billToCustomerNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBillToCustomerNumber() {
        return this.backingStore.get("billToCustomerNumber");
    }
    /**
     * Gets the billToName property value. The billToName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBillToName() {
        return this.backingStore.get("billToName");
    }
    /**
     * Gets the creditMemoDate property value. The creditMemoDate property
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getCreditMemoDate() {
        return this.backingStore.get("creditMemoDate");
    }
    /**
     * Gets the currency property value. The currency property
     * @return a {@link Currency}
     */
    @jakarta.annotation.Nullable
    public Currency getCurrency() {
        return this.backingStore.get("currency");
    }
    /**
     * Gets the currencyCode property value. The currencyCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrencyCode() {
        return this.backingStore.get("currencyCode");
    }
    /**
     * Gets the currencyId property value. The currencyId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getCurrencyId() {
        return this.backingStore.get("currencyId");
    }
    /**
     * Gets the customer property value. The customer property
     * @return a {@link Customer}
     */
    @jakarta.annotation.Nullable
    public Customer getCustomer() {
        return this.backingStore.get("customer");
    }
    /**
     * Gets the customerId property value. The customerId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getCustomerId() {
        return this.backingStore.get("customerId");
    }
    /**
     * Gets the customerName property value. The customerName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerName() {
        return this.backingStore.get("customerName");
    }
    /**
     * Gets the customerNumber property value. The customerNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerNumber() {
        return this.backingStore.get("customerNumber");
    }
    /**
     * Gets the discountAmount property value. The discountAmount property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getDiscountAmount() {
        return this.backingStore.get("discountAmount");
    }
    /**
     * Gets the discountAppliedBeforeTax property value. The discountAppliedBeforeTax property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDiscountAppliedBeforeTax() {
        return this.backingStore.get("discountAppliedBeforeTax");
    }
    /**
     * Gets the dueDate property value. The dueDate property
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getDueDate() {
        return this.backingStore.get("dueDate");
    }
    /**
     * Gets the email property value. The email property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * Gets the externalDocumentNumber property value. The externalDocumentNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalDocumentNumber() {
        return this.backingStore.get("externalDocumentNumber");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(34);
        deserializerMap.put("billingPostalAddress", (n) -> { this.setBillingPostalAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
        deserializerMap.put("billToCustomerId", (n) -> { this.setBillToCustomerId(n.getUUIDValue()); });
        deserializerMap.put("billToCustomerNumber", (n) -> { this.setBillToCustomerNumber(n.getStringValue()); });
        deserializerMap.put("billToName", (n) -> { this.setBillToName(n.getStringValue()); });
        deserializerMap.put("creditMemoDate", (n) -> { this.setCreditMemoDate(n.getLocalDateValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getObjectValue(Currency::createFromDiscriminatorValue)); });
        deserializerMap.put("currencyCode", (n) -> { this.setCurrencyCode(n.getStringValue()); });
        deserializerMap.put("currencyId", (n) -> { this.setCurrencyId(n.getUUIDValue()); });
        deserializerMap.put("customer", (n) -> { this.setCustomer(n.getObjectValue(Customer::createFromDiscriminatorValue)); });
        deserializerMap.put("customerId", (n) -> { this.setCustomerId(n.getUUIDValue()); });
        deserializerMap.put("customerName", (n) -> { this.setCustomerName(n.getStringValue()); });
        deserializerMap.put("customerNumber", (n) -> { this.setCustomerNumber(n.getStringValue()); });
        deserializerMap.put("discountAmount", (n) -> { this.setDiscountAmount(n.getBigDecimalValue()); });
        deserializerMap.put("discountAppliedBeforeTax", (n) -> { this.setDiscountAppliedBeforeTax(n.getBooleanValue()); });
        deserializerMap.put("dueDate", (n) -> { this.setDueDate(n.getLocalDateValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("externalDocumentNumber", (n) -> { this.setExternalDocumentNumber(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("invoiceId", (n) -> { this.setInvoiceId(n.getUUIDValue()); });
        deserializerMap.put("invoiceNumber", (n) -> { this.setInvoiceNumber(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("paymentTerm", (n) -> { this.setPaymentTerm(n.getObjectValue(PaymentTerm::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentTermsId", (n) -> { this.setPaymentTermsId(n.getUUIDValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("pricesIncludeTax", (n) -> { this.setPricesIncludeTax(n.getBooleanValue()); });
        deserializerMap.put("salesCreditMemoLines", (n) -> { this.setSalesCreditMemoLines(n.getCollectionOfObjectValues(SalesCreditMemoLine::createFromDiscriminatorValue)); });
        deserializerMap.put("salesperson", (n) -> { this.setSalesperson(n.getStringValue()); });
        deserializerMap.put("sellingPostalAddress", (n) -> { this.setSellingPostalAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("totalAmountExcludingTax", (n) -> { this.setTotalAmountExcludingTax(n.getBigDecimalValue()); });
        deserializerMap.put("totalAmountIncludingTax", (n) -> { this.setTotalAmountIncludingTax(n.getBigDecimalValue()); });
        deserializerMap.put("totalTaxAmount", (n) -> { this.setTotalTaxAmount(n.getBigDecimalValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the invoiceId property value. The invoiceId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getInvoiceId() {
        return this.backingStore.get("invoiceId");
    }
    /**
     * Gets the invoiceNumber property value. The invoiceNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInvoiceNumber() {
        return this.backingStore.get("invoiceNumber");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the number property value. The number property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.backingStore.get("number");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the paymentTerm property value. The paymentTerm property
     * @return a {@link PaymentTerm}
     */
    @jakarta.annotation.Nullable
    public PaymentTerm getPaymentTerm() {
        return this.backingStore.get("paymentTerm");
    }
    /**
     * Gets the paymentTermsId property value. The paymentTermsId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getPaymentTermsId() {
        return this.backingStore.get("paymentTermsId");
    }
    /**
     * Gets the phoneNumber property value. The phoneNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.backingStore.get("phoneNumber");
    }
    /**
     * Gets the pricesIncludeTax property value. The pricesIncludeTax property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPricesIncludeTax() {
        return this.backingStore.get("pricesIncludeTax");
    }
    /**
     * Gets the salesCreditMemoLines property value. The salesCreditMemoLines property
     * @return a {@link java.util.List<SalesCreditMemoLine>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SalesCreditMemoLine> getSalesCreditMemoLines() {
        return this.backingStore.get("salesCreditMemoLines");
    }
    /**
     * Gets the salesperson property value. The salesperson property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSalesperson() {
        return this.backingStore.get("salesperson");
    }
    /**
     * Gets the sellingPostalAddress property value. The sellingPostalAddress property
     * @return a {@link PostalAddressType}
     */
    @jakarta.annotation.Nullable
    public PostalAddressType getSellingPostalAddress() {
        return this.backingStore.get("sellingPostalAddress");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the totalAmountExcludingTax property value. The totalAmountExcludingTax property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getTotalAmountExcludingTax() {
        return this.backingStore.get("totalAmountExcludingTax");
    }
    /**
     * Gets the totalAmountIncludingTax property value. The totalAmountIncludingTax property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getTotalAmountIncludingTax() {
        return this.backingStore.get("totalAmountIncludingTax");
    }
    /**
     * Gets the totalTaxAmount property value. The totalTaxAmount property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getTotalTaxAmount() {
        return this.backingStore.get("totalTaxAmount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("billingPostalAddress", this.getBillingPostalAddress());
        writer.writeUUIDValue("billToCustomerId", this.getBillToCustomerId());
        writer.writeStringValue("billToCustomerNumber", this.getBillToCustomerNumber());
        writer.writeStringValue("billToName", this.getBillToName());
        writer.writeLocalDateValue("creditMemoDate", this.getCreditMemoDate());
        writer.writeObjectValue("currency", this.getCurrency());
        writer.writeStringValue("currencyCode", this.getCurrencyCode());
        writer.writeUUIDValue("currencyId", this.getCurrencyId());
        writer.writeObjectValue("customer", this.getCustomer());
        writer.writeUUIDValue("customerId", this.getCustomerId());
        writer.writeStringValue("customerName", this.getCustomerName());
        writer.writeStringValue("customerNumber", this.getCustomerNumber());
        writer.writeBigDecimalValue("discountAmount", this.getDiscountAmount());
        writer.writeBooleanValue("discountAppliedBeforeTax", this.getDiscountAppliedBeforeTax());
        writer.writeLocalDateValue("dueDate", this.getDueDate());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("externalDocumentNumber", this.getExternalDocumentNumber());
        writer.writeUUIDValue("id", this.getId());
        writer.writeUUIDValue("invoiceId", this.getInvoiceId());
        writer.writeStringValue("invoiceNumber", this.getInvoiceNumber());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("paymentTerm", this.getPaymentTerm());
        writer.writeUUIDValue("paymentTermsId", this.getPaymentTermsId());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeBooleanValue("pricesIncludeTax", this.getPricesIncludeTax());
        writer.writeCollectionOfObjectValues("salesCreditMemoLines", this.getSalesCreditMemoLines());
        writer.writeStringValue("salesperson", this.getSalesperson());
        writer.writeObjectValue("sellingPostalAddress", this.getSellingPostalAddress());
        writer.writeStringValue("status", this.getStatus());
        writer.writeBigDecimalValue("totalAmountExcludingTax", this.getTotalAmountExcludingTax());
        writer.writeBigDecimalValue("totalAmountIncludingTax", this.getTotalAmountIncludingTax());
        writer.writeBigDecimalValue("totalTaxAmount", this.getTotalTaxAmount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the billingPostalAddress property value. The billingPostalAddress property
     * @param value Value to set for the billingPostalAddress property.
     */
    public void setBillingPostalAddress(@jakarta.annotation.Nullable final PostalAddressType value) {
        this.backingStore.set("billingPostalAddress", value);
    }
    /**
     * Sets the billToCustomerId property value. The billToCustomerId property
     * @param value Value to set for the billToCustomerId property.
     */
    public void setBillToCustomerId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("billToCustomerId", value);
    }
    /**
     * Sets the billToCustomerNumber property value. The billToCustomerNumber property
     * @param value Value to set for the billToCustomerNumber property.
     */
    public void setBillToCustomerNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("billToCustomerNumber", value);
    }
    /**
     * Sets the billToName property value. The billToName property
     * @param value Value to set for the billToName property.
     */
    public void setBillToName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("billToName", value);
    }
    /**
     * Sets the creditMemoDate property value. The creditMemoDate property
     * @param value Value to set for the creditMemoDate property.
     */
    public void setCreditMemoDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("creditMemoDate", value);
    }
    /**
     * Sets the currency property value. The currency property
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final Currency value) {
        this.backingStore.set("currency", value);
    }
    /**
     * Sets the currencyCode property value. The currencyCode property
     * @param value Value to set for the currencyCode property.
     */
    public void setCurrencyCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("currencyCode", value);
    }
    /**
     * Sets the currencyId property value. The currencyId property
     * @param value Value to set for the currencyId property.
     */
    public void setCurrencyId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("currencyId", value);
    }
    /**
     * Sets the customer property value. The customer property
     * @param value Value to set for the customer property.
     */
    public void setCustomer(@jakarta.annotation.Nullable final Customer value) {
        this.backingStore.set("customer", value);
    }
    /**
     * Sets the customerId property value. The customerId property
     * @param value Value to set for the customerId property.
     */
    public void setCustomerId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("customerId", value);
    }
    /**
     * Sets the customerName property value. The customerName property
     * @param value Value to set for the customerName property.
     */
    public void setCustomerName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customerName", value);
    }
    /**
     * Sets the customerNumber property value. The customerNumber property
     * @param value Value to set for the customerNumber property.
     */
    public void setCustomerNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customerNumber", value);
    }
    /**
     * Sets the discountAmount property value. The discountAmount property
     * @param value Value to set for the discountAmount property.
     */
    public void setDiscountAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("discountAmount", value);
    }
    /**
     * Sets the discountAppliedBeforeTax property value. The discountAppliedBeforeTax property
     * @param value Value to set for the discountAppliedBeforeTax property.
     */
    public void setDiscountAppliedBeforeTax(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("discountAppliedBeforeTax", value);
    }
    /**
     * Sets the dueDate property value. The dueDate property
     * @param value Value to set for the dueDate property.
     */
    public void setDueDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("dueDate", value);
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
    /**
     * Sets the externalDocumentNumber property value. The externalDocumentNumber property
     * @param value Value to set for the externalDocumentNumber property.
     */
    public void setExternalDocumentNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalDocumentNumber", value);
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the invoiceId property value. The invoiceId property
     * @param value Value to set for the invoiceId property.
     */
    public void setInvoiceId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("invoiceId", value);
    }
    /**
     * Sets the invoiceNumber property value. The invoiceNumber property
     * @param value Value to set for the invoiceNumber property.
     */
    public void setInvoiceNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("invoiceNumber", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("number", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the paymentTerm property value. The paymentTerm property
     * @param value Value to set for the paymentTerm property.
     */
    public void setPaymentTerm(@jakarta.annotation.Nullable final PaymentTerm value) {
        this.backingStore.set("paymentTerm", value);
    }
    /**
     * Sets the paymentTermsId property value. The paymentTermsId property
     * @param value Value to set for the paymentTermsId property.
     */
    public void setPaymentTermsId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("paymentTermsId", value);
    }
    /**
     * Sets the phoneNumber property value. The phoneNumber property
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phoneNumber", value);
    }
    /**
     * Sets the pricesIncludeTax property value. The pricesIncludeTax property
     * @param value Value to set for the pricesIncludeTax property.
     */
    public void setPricesIncludeTax(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("pricesIncludeTax", value);
    }
    /**
     * Sets the salesCreditMemoLines property value. The salesCreditMemoLines property
     * @param value Value to set for the salesCreditMemoLines property.
     */
    public void setSalesCreditMemoLines(@jakarta.annotation.Nullable final java.util.List<SalesCreditMemoLine> value) {
        this.backingStore.set("salesCreditMemoLines", value);
    }
    /**
     * Sets the salesperson property value. The salesperson property
     * @param value Value to set for the salesperson property.
     */
    public void setSalesperson(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("salesperson", value);
    }
    /**
     * Sets the sellingPostalAddress property value. The sellingPostalAddress property
     * @param value Value to set for the sellingPostalAddress property.
     */
    public void setSellingPostalAddress(@jakarta.annotation.Nullable final PostalAddressType value) {
        this.backingStore.set("sellingPostalAddress", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the totalAmountExcludingTax property value. The totalAmountExcludingTax property
     * @param value Value to set for the totalAmountExcludingTax property.
     */
    public void setTotalAmountExcludingTax(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("totalAmountExcludingTax", value);
    }
    /**
     * Sets the totalAmountIncludingTax property value. The totalAmountIncludingTax property
     * @param value Value to set for the totalAmountIncludingTax property.
     */
    public void setTotalAmountIncludingTax(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("totalAmountIncludingTax", value);
    }
    /**
     * Sets the totalTaxAmount property value. The totalTaxAmount property
     * @param value Value to set for the totalTaxAmount property.
     */
    public void setTotalTaxAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("totalTaxAmount", value);
    }
}
