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
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class PurchaseInvoice extends Entity implements Parsable {
    /** The buyFromAddress property */
    private PostalAddressType _buyFromAddress;
    /** The currency property */
    private Currency _currency;
    /** The currencyCode property */
    private String _currencyCode;
    /** The currencyId property */
    private String _currencyId;
    /** The discountAmount property */
    private BigDecimal _discountAmount;
    /** The discountAppliedBeforeTax property */
    private Boolean _discountAppliedBeforeTax;
    /** The dueDate property */
    private LocalDate _dueDate;
    /** The invoiceDate property */
    private LocalDate _invoiceDate;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The number property */
    private String _number;
    /** The payToAddress property */
    private PostalAddressType _payToAddress;
    /** The payToContact property */
    private String _payToContact;
    /** The payToName property */
    private String _payToName;
    /** The payToVendorId property */
    private String _payToVendorId;
    /** The payToVendorNumber property */
    private String _payToVendorNumber;
    /** The pricesIncludeTax property */
    private Boolean _pricesIncludeTax;
    /** The purchaseInvoiceLines property */
    private java.util.List<PurchaseInvoiceLine> _purchaseInvoiceLines;
    /** The shipToAddress property */
    private PostalAddressType _shipToAddress;
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
    /** The vendor property */
    private Vendor _vendor;
    /** The vendorId property */
    private String _vendorId;
    /** The vendorInvoiceNumber property */
    private String _vendorInvoiceNumber;
    /** The vendorName property */
    private String _vendorName;
    /** The vendorNumber property */
    private String _vendorNumber;
    /**
     * Instantiates a new purchaseInvoice and sets the default values.
     * @return a void
     */
    public PurchaseInvoice() {
        super();
        this.setOdataType("#microsoft.graph.purchaseInvoice");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a purchaseInvoice
     */
    @javax.annotation.Nonnull
    public static PurchaseInvoice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PurchaseInvoice();
    }
    /**
     * Gets the buyFromAddress property value. The buyFromAddress property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getBuyFromAddress() {
        return this._buyFromAddress;
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PurchaseInvoice currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("buyFromAddress", (n) -> { currentObject.setBuyFromAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
            this.put("currency", (n) -> { currentObject.setCurrency(n.getObjectValue(Currency::createFromDiscriminatorValue)); });
            this.put("currencyCode", (n) -> { currentObject.setCurrencyCode(n.getStringValue()); });
            this.put("currencyId", (n) -> { currentObject.setCurrencyId(n.getStringValue()); });
            this.put("discountAmount", (n) -> { currentObject.setDiscountAmount(n.getBigDecimalValue()); });
            this.put("discountAppliedBeforeTax", (n) -> { currentObject.setDiscountAppliedBeforeTax(n.getBooleanValue()); });
            this.put("dueDate", (n) -> { currentObject.setDueDate(n.getLocalDateValue()); });
            this.put("invoiceDate", (n) -> { currentObject.setInvoiceDate(n.getLocalDateValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("number", (n) -> { currentObject.setNumber(n.getStringValue()); });
            this.put("payToAddress", (n) -> { currentObject.setPayToAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
            this.put("payToContact", (n) -> { currentObject.setPayToContact(n.getStringValue()); });
            this.put("payToName", (n) -> { currentObject.setPayToName(n.getStringValue()); });
            this.put("payToVendorId", (n) -> { currentObject.setPayToVendorId(n.getStringValue()); });
            this.put("payToVendorNumber", (n) -> { currentObject.setPayToVendorNumber(n.getStringValue()); });
            this.put("pricesIncludeTax", (n) -> { currentObject.setPricesIncludeTax(n.getBooleanValue()); });
            this.put("purchaseInvoiceLines", (n) -> { currentObject.setPurchaseInvoiceLines(n.getCollectionOfObjectValues(PurchaseInvoiceLine::createFromDiscriminatorValue)); });
            this.put("shipToAddress", (n) -> { currentObject.setShipToAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
            this.put("shipToContact", (n) -> { currentObject.setShipToContact(n.getStringValue()); });
            this.put("shipToName", (n) -> { currentObject.setShipToName(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
            this.put("totalAmountExcludingTax", (n) -> { currentObject.setTotalAmountExcludingTax(n.getBigDecimalValue()); });
            this.put("totalAmountIncludingTax", (n) -> { currentObject.setTotalAmountIncludingTax(n.getBigDecimalValue()); });
            this.put("totalTaxAmount", (n) -> { currentObject.setTotalTaxAmount(n.getBigDecimalValue()); });
            this.put("vendor", (n) -> { currentObject.setVendor(n.getObjectValue(Vendor::createFromDiscriminatorValue)); });
            this.put("vendorId", (n) -> { currentObject.setVendorId(n.getStringValue()); });
            this.put("vendorInvoiceNumber", (n) -> { currentObject.setVendorInvoiceNumber(n.getStringValue()); });
            this.put("vendorName", (n) -> { currentObject.setVendorName(n.getStringValue()); });
            this.put("vendorNumber", (n) -> { currentObject.setVendorNumber(n.getStringValue()); });
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
     * Gets the payToAddress property value. The payToAddress property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getPayToAddress() {
        return this._payToAddress;
    }
    /**
     * Gets the payToContact property value. The payToContact property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayToContact() {
        return this._payToContact;
    }
    /**
     * Gets the payToName property value. The payToName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayToName() {
        return this._payToName;
    }
    /**
     * Gets the payToVendorId property value. The payToVendorId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayToVendorId() {
        return this._payToVendorId;
    }
    /**
     * Gets the payToVendorNumber property value. The payToVendorNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayToVendorNumber() {
        return this._payToVendorNumber;
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
     * Gets the purchaseInvoiceLines property value. The purchaseInvoiceLines property
     * @return a purchaseInvoiceLine
     */
    @javax.annotation.Nullable
    public java.util.List<PurchaseInvoiceLine> getPurchaseInvoiceLines() {
        return this._purchaseInvoiceLines;
    }
    /**
     * Gets the shipToAddress property value. The shipToAddress property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getShipToAddress() {
        return this._shipToAddress;
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
     * Gets the vendor property value. The vendor property
     * @return a vendor
     */
    @javax.annotation.Nullable
    public Vendor getVendor() {
        return this._vendor;
    }
    /**
     * Gets the vendorId property value. The vendorId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVendorId() {
        return this._vendorId;
    }
    /**
     * Gets the vendorInvoiceNumber property value. The vendorInvoiceNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVendorInvoiceNumber() {
        return this._vendorInvoiceNumber;
    }
    /**
     * Gets the vendorName property value. The vendorName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVendorName() {
        return this._vendorName;
    }
    /**
     * Gets the vendorNumber property value. The vendorNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVendorNumber() {
        return this._vendorNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("buyFromAddress", this.getBuyFromAddress());
        writer.writeObjectValue("currency", this.getCurrency());
        writer.writeStringValue("currencyCode", this.getCurrencyCode());
        writer.writeStringValue("currencyId", this.getCurrencyId());
        writer.writeBigDecimalValue("discountAmount", this.getDiscountAmount());
        writer.writeBooleanValue("discountAppliedBeforeTax", this.getDiscountAppliedBeforeTax());
        writer.writeLocalDateValue("dueDate", this.getDueDate());
        writer.writeLocalDateValue("invoiceDate", this.getInvoiceDate());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("number", this.getNumber());
        writer.writeObjectValue("payToAddress", this.getPayToAddress());
        writer.writeStringValue("payToContact", this.getPayToContact());
        writer.writeStringValue("payToName", this.getPayToName());
        writer.writeStringValue("payToVendorId", this.getPayToVendorId());
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
        writer.writeStringValue("vendorId", this.getVendorId());
        writer.writeStringValue("vendorInvoiceNumber", this.getVendorInvoiceNumber());
        writer.writeStringValue("vendorName", this.getVendorName());
        writer.writeStringValue("vendorNumber", this.getVendorNumber());
    }
    /**
     * Sets the buyFromAddress property value. The buyFromAddress property
     * @param value Value to set for the buyFromAddress property.
     * @return a void
     */
    public void setBuyFromAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this._buyFromAddress = value;
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
     * Sets the dueDate property value. The dueDate property
     * @param value Value to set for the dueDate property.
     * @return a void
     */
    public void setDueDate(@javax.annotation.Nullable final LocalDate value) {
        this._dueDate = value;
    }
    /**
     * Sets the invoiceDate property value. The invoiceDate property
     * @param value Value to set for the invoiceDate property.
     * @return a void
     */
    public void setInvoiceDate(@javax.annotation.Nullable final LocalDate value) {
        this._invoiceDate = value;
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
     * Sets the payToAddress property value. The payToAddress property
     * @param value Value to set for the payToAddress property.
     * @return a void
     */
    public void setPayToAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this._payToAddress = value;
    }
    /**
     * Sets the payToContact property value. The payToContact property
     * @param value Value to set for the payToContact property.
     * @return a void
     */
    public void setPayToContact(@javax.annotation.Nullable final String value) {
        this._payToContact = value;
    }
    /**
     * Sets the payToName property value. The payToName property
     * @param value Value to set for the payToName property.
     * @return a void
     */
    public void setPayToName(@javax.annotation.Nullable final String value) {
        this._payToName = value;
    }
    /**
     * Sets the payToVendorId property value. The payToVendorId property
     * @param value Value to set for the payToVendorId property.
     * @return a void
     */
    public void setPayToVendorId(@javax.annotation.Nullable final String value) {
        this._payToVendorId = value;
    }
    /**
     * Sets the payToVendorNumber property value. The payToVendorNumber property
     * @param value Value to set for the payToVendorNumber property.
     * @return a void
     */
    public void setPayToVendorNumber(@javax.annotation.Nullable final String value) {
        this._payToVendorNumber = value;
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
     * Sets the purchaseInvoiceLines property value. The purchaseInvoiceLines property
     * @param value Value to set for the purchaseInvoiceLines property.
     * @return a void
     */
    public void setPurchaseInvoiceLines(@javax.annotation.Nullable final java.util.List<PurchaseInvoiceLine> value) {
        this._purchaseInvoiceLines = value;
    }
    /**
     * Sets the shipToAddress property value. The shipToAddress property
     * @param value Value to set for the shipToAddress property.
     * @return a void
     */
    public void setShipToAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this._shipToAddress = value;
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
    /**
     * Sets the vendor property value. The vendor property
     * @param value Value to set for the vendor property.
     * @return a void
     */
    public void setVendor(@javax.annotation.Nullable final Vendor value) {
        this._vendor = value;
    }
    /**
     * Sets the vendorId property value. The vendorId property
     * @param value Value to set for the vendorId property.
     * @return a void
     */
    public void setVendorId(@javax.annotation.Nullable final String value) {
        this._vendorId = value;
    }
    /**
     * Sets the vendorInvoiceNumber property value. The vendorInvoiceNumber property
     * @param value Value to set for the vendorInvoiceNumber property.
     * @return a void
     */
    public void setVendorInvoiceNumber(@javax.annotation.Nullable final String value) {
        this._vendorInvoiceNumber = value;
    }
    /**
     * Sets the vendorName property value. The vendorName property
     * @param value Value to set for the vendorName property.
     * @return a void
     */
    public void setVendorName(@javax.annotation.Nullable final String value) {
        this._vendorName = value;
    }
    /**
     * Sets the vendorNumber property value. The vendorNumber property
     * @param value Value to set for the vendorNumber property.
     * @return a void
     */
    public void setVendorNumber(@javax.annotation.Nullable final String value) {
        this._vendorNumber = value;
    }
}
