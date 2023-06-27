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
public class PurchaseInvoice implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The buyFromAddress property
     */
    private PostalAddressType buyFromAddress;
    /**
     * The currency property
     */
    private Currency currency;
    /**
     * The currencyCode property
     */
    private String currencyCode;
    /**
     * The currencyId property
     */
    private UUID currencyId;
    /**
     * The discountAmount property
     */
    private BigDecimal discountAmount;
    /**
     * The discountAppliedBeforeTax property
     */
    private Boolean discountAppliedBeforeTax;
    /**
     * The dueDate property
     */
    private LocalDate dueDate;
    /**
     * The id property
     */
    private UUID id;
    /**
     * The invoiceDate property
     */
    private LocalDate invoiceDate;
    /**
     * The lastModifiedDateTime property
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The number property
     */
    private String number;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The payToAddress property
     */
    private PostalAddressType payToAddress;
    /**
     * The payToContact property
     */
    private String payToContact;
    /**
     * The payToName property
     */
    private String payToName;
    /**
     * The payToVendorId property
     */
    private UUID payToVendorId;
    /**
     * The payToVendorNumber property
     */
    private String payToVendorNumber;
    /**
     * The pricesIncludeTax property
     */
    private Boolean pricesIncludeTax;
    /**
     * The purchaseInvoiceLines property
     */
    private java.util.List<PurchaseInvoiceLine> purchaseInvoiceLines;
    /**
     * The shipToAddress property
     */
    private PostalAddressType shipToAddress;
    /**
     * The shipToContact property
     */
    private String shipToContact;
    /**
     * The shipToName property
     */
    private String shipToName;
    /**
     * The status property
     */
    private String status;
    /**
     * The totalAmountExcludingTax property
     */
    private BigDecimal totalAmountExcludingTax;
    /**
     * The totalAmountIncludingTax property
     */
    private BigDecimal totalAmountIncludingTax;
    /**
     * The totalTaxAmount property
     */
    private BigDecimal totalTaxAmount;
    /**
     * The vendor property
     */
    private Vendor vendor;
    /**
     * The vendorId property
     */
    private UUID vendorId;
    /**
     * The vendorInvoiceNumber property
     */
    private String vendorInvoiceNumber;
    /**
     * The vendorName property
     */
    private String vendorName;
    /**
     * The vendorNumber property
     */
    private String vendorNumber;
    /**
     * Instantiates a new PurchaseInvoice and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PurchaseInvoice() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PurchaseInvoice
     */
    @javax.annotation.Nonnull
    public static PurchaseInvoice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PurchaseInvoice();
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
     * Gets the buyFromAddress property value. The buyFromAddress property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getBuyFromAddress() {
        return this.buyFromAddress;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(31);
        deserializerMap.put("buyFromAddress", (n) -> { this.setBuyFromAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getObjectValue(Currency::createFromDiscriminatorValue)); });
        deserializerMap.put("currencyCode", (n) -> { this.setCurrencyCode(n.getStringValue()); });
        deserializerMap.put("currencyId", (n) -> { this.setCurrencyId(n.getUUIDValue()); });
        deserializerMap.put("discountAmount", (n) -> { this.setDiscountAmount(n.getBigDecimalValue()); });
        deserializerMap.put("discountAppliedBeforeTax", (n) -> { this.setDiscountAppliedBeforeTax(n.getBooleanValue()); });
        deserializerMap.put("dueDate", (n) -> { this.setDueDate(n.getLocalDateValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("invoiceDate", (n) -> { this.setInvoiceDate(n.getLocalDateValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("payToAddress", (n) -> { this.setPayToAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
        deserializerMap.put("payToContact", (n) -> { this.setPayToContact(n.getStringValue()); });
        deserializerMap.put("payToName", (n) -> { this.setPayToName(n.getStringValue()); });
        deserializerMap.put("payToVendorId", (n) -> { this.setPayToVendorId(n.getUUIDValue()); });
        deserializerMap.put("payToVendorNumber", (n) -> { this.setPayToVendorNumber(n.getStringValue()); });
        deserializerMap.put("pricesIncludeTax", (n) -> { this.setPricesIncludeTax(n.getBooleanValue()); });
        deserializerMap.put("purchaseInvoiceLines", (n) -> { this.setPurchaseInvoiceLines(n.getCollectionOfObjectValues(PurchaseInvoiceLine::createFromDiscriminatorValue)); });
        deserializerMap.put("shipToAddress", (n) -> { this.setShipToAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
        deserializerMap.put("shipToContact", (n) -> { this.setShipToContact(n.getStringValue()); });
        deserializerMap.put("shipToName", (n) -> { this.setShipToName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("totalAmountExcludingTax", (n) -> { this.setTotalAmountExcludingTax(n.getBigDecimalValue()); });
        deserializerMap.put("totalAmountIncludingTax", (n) -> { this.setTotalAmountIncludingTax(n.getBigDecimalValue()); });
        deserializerMap.put("totalTaxAmount", (n) -> { this.setTotalTaxAmount(n.getBigDecimalValue()); });
        deserializerMap.put("vendor", (n) -> { this.setVendor(n.getObjectValue(Vendor::createFromDiscriminatorValue)); });
        deserializerMap.put("vendorId", (n) -> { this.setVendorId(n.getUUIDValue()); });
        deserializerMap.put("vendorInvoiceNumber", (n) -> { this.setVendorInvoiceNumber(n.getStringValue()); });
        deserializerMap.put("vendorName", (n) -> { this.setVendorName(n.getStringValue()); });
        deserializerMap.put("vendorNumber", (n) -> { this.setVendorNumber(n.getStringValue()); });
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
     * Gets the payToAddress property value. The payToAddress property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getPayToAddress() {
        return this.payToAddress;
    }
    /**
     * Gets the payToContact property value. The payToContact property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayToContact() {
        return this.payToContact;
    }
    /**
     * Gets the payToName property value. The payToName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayToName() {
        return this.payToName;
    }
    /**
     * Gets the payToVendorId property value. The payToVendorId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getPayToVendorId() {
        return this.payToVendorId;
    }
    /**
     * Gets the payToVendorNumber property value. The payToVendorNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayToVendorNumber() {
        return this.payToVendorNumber;
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
     * Gets the purchaseInvoiceLines property value. The purchaseInvoiceLines property
     * @return a purchaseInvoiceLine
     */
    @javax.annotation.Nullable
    public java.util.List<PurchaseInvoiceLine> getPurchaseInvoiceLines() {
        return this.purchaseInvoiceLines;
    }
    /**
     * Gets the shipToAddress property value. The shipToAddress property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getShipToAddress() {
        return this.shipToAddress;
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
     * Gets the vendor property value. The vendor property
     * @return a vendor
     */
    @javax.annotation.Nullable
    public Vendor getVendor() {
        return this.vendor;
    }
    /**
     * Gets the vendorId property value. The vendorId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getVendorId() {
        return this.vendorId;
    }
    /**
     * Gets the vendorInvoiceNumber property value. The vendorInvoiceNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVendorInvoiceNumber() {
        return this.vendorInvoiceNumber;
    }
    /**
     * Gets the vendorName property value. The vendorName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVendorName() {
        return this.vendorName;
    }
    /**
     * Gets the vendorNumber property value. The vendorNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVendorNumber() {
        return this.vendorNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("buyFromAddress", this.getBuyFromAddress());
        writer.writeObjectValue("currency", this.getCurrency());
        writer.writeStringValue("currencyCode", this.getCurrencyCode());
        writer.writeUUIDValue("currencyId", this.getCurrencyId());
        writer.writeBigDecimalValue("discountAmount", this.getDiscountAmount());
        writer.writeBooleanValue("discountAppliedBeforeTax", this.getDiscountAppliedBeforeTax());
        writer.writeLocalDateValue("dueDate", this.getDueDate());
        writer.writeUUIDValue("id", this.getId());
        writer.writeLocalDateValue("invoiceDate", this.getInvoiceDate());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("payToAddress", this.getPayToAddress());
        writer.writeStringValue("payToContact", this.getPayToContact());
        writer.writeStringValue("payToName", this.getPayToName());
        writer.writeUUIDValue("payToVendorId", this.getPayToVendorId());
        writer.writeStringValue("payToVendorNumber", this.getPayToVendorNumber());
        writer.writeBooleanValue("pricesIncludeTax", this.getPricesIncludeTax());
        writer.writeCollectionOfObjectValues("purchaseInvoiceLines", this.getPurchaseInvoiceLines());
        writer.writeObjectValue("shipToAddress", this.getShipToAddress());
        writer.writeStringValue("shipToContact", this.getShipToContact());
        writer.writeStringValue("shipToName", this.getShipToName());
        writer.writeStringValue("status", this.getStatus());
        writer.writeBigDecimalValue("totalAmountExcludingTax", this.getTotalAmountExcludingTax());
        writer.writeBigDecimalValue("totalAmountIncludingTax", this.getTotalAmountIncludingTax());
        writer.writeBigDecimalValue("totalTaxAmount", this.getTotalTaxAmount());
        writer.writeObjectValue("vendor", this.getVendor());
        writer.writeUUIDValue("vendorId", this.getVendorId());
        writer.writeStringValue("vendorInvoiceNumber", this.getVendorInvoiceNumber());
        writer.writeStringValue("vendorName", this.getVendorName());
        writer.writeStringValue("vendorNumber", this.getVendorNumber());
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
     * Sets the buyFromAddress property value. The buyFromAddress property
     * @param value Value to set for the buyFromAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBuyFromAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this.buyFromAddress = value;
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
     * Sets the payToAddress property value. The payToAddress property
     * @param value Value to set for the payToAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayToAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this.payToAddress = value;
    }
    /**
     * Sets the payToContact property value. The payToContact property
     * @param value Value to set for the payToContact property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayToContact(@javax.annotation.Nullable final String value) {
        this.payToContact = value;
    }
    /**
     * Sets the payToName property value. The payToName property
     * @param value Value to set for the payToName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayToName(@javax.annotation.Nullable final String value) {
        this.payToName = value;
    }
    /**
     * Sets the payToVendorId property value. The payToVendorId property
     * @param value Value to set for the payToVendorId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayToVendorId(@javax.annotation.Nullable final UUID value) {
        this.payToVendorId = value;
    }
    /**
     * Sets the payToVendorNumber property value. The payToVendorNumber property
     * @param value Value to set for the payToVendorNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayToVendorNumber(@javax.annotation.Nullable final String value) {
        this.payToVendorNumber = value;
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
     * Sets the purchaseInvoiceLines property value. The purchaseInvoiceLines property
     * @param value Value to set for the purchaseInvoiceLines property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPurchaseInvoiceLines(@javax.annotation.Nullable final java.util.List<PurchaseInvoiceLine> value) {
        this.purchaseInvoiceLines = value;
    }
    /**
     * Sets the shipToAddress property value. The shipToAddress property
     * @param value Value to set for the shipToAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShipToAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this.shipToAddress = value;
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
    /**
     * Sets the vendor property value. The vendor property
     * @param value Value to set for the vendor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVendor(@javax.annotation.Nullable final Vendor value) {
        this.vendor = value;
    }
    /**
     * Sets the vendorId property value. The vendorId property
     * @param value Value to set for the vendorId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVendorId(@javax.annotation.Nullable final UUID value) {
        this.vendorId = value;
    }
    /**
     * Sets the vendorInvoiceNumber property value. The vendorInvoiceNumber property
     * @param value Value to set for the vendorInvoiceNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVendorInvoiceNumber(@javax.annotation.Nullable final String value) {
        this.vendorInvoiceNumber = value;
    }
    /**
     * Sets the vendorName property value. The vendorName property
     * @param value Value to set for the vendorName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVendorName(@javax.annotation.Nullable final String value) {
        this.vendorName = value;
    }
    /**
     * Sets the vendorNumber property value. The vendorNumber property
     * @param value Value to set for the vendorNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVendorNumber(@javax.annotation.Nullable final String value) {
        this.vendorNumber = value;
    }
}
