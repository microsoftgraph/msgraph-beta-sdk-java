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
/** Provides operations to manage the collection of accessReview entities. */
public class SalesCreditMemoLine extends Entity implements Parsable {
    /** The account property */
    private Account _account;
    /** The accountId property */
    private String _accountId;
    /** The amountExcludingTax property */
    private BigDecimal _amountExcludingTax;
    /** The amountIncludingTax property */
    private BigDecimal _amountIncludingTax;
    /** The description property */
    private String _description;
    /** The discountAmount property */
    private BigDecimal _discountAmount;
    /** The discountAppliedBeforeTax property */
    private Boolean _discountAppliedBeforeTax;
    /** The discountPercent property */
    private BigDecimal _discountPercent;
    /** The documentId property */
    private String _documentId;
    /** The invoiceDiscountAllocation property */
    private BigDecimal _invoiceDiscountAllocation;
    /** The item property */
    private Item _item;
    /** The itemId property */
    private String _itemId;
    /** The lineType property */
    private String _lineType;
    /** The netAmount property */
    private BigDecimal _netAmount;
    /** The netAmountIncludingTax property */
    private BigDecimal _netAmountIncludingTax;
    /** The netTaxAmount property */
    private BigDecimal _netTaxAmount;
    /** The quantity property */
    private BigDecimal _quantity;
    /** The sequence property */
    private Integer _sequence;
    /** The shipmentDate property */
    private LocalDate _shipmentDate;
    /** The taxCode property */
    private String _taxCode;
    /** The taxPercent property */
    private BigDecimal _taxPercent;
    /** The totalTaxAmount property */
    private BigDecimal _totalTaxAmount;
    /** The unitOfMeasureId property */
    private String _unitOfMeasureId;
    /** The unitPrice property */
    private BigDecimal _unitPrice;
    /**
     * Instantiates a new salesCreditMemoLine and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SalesCreditMemoLine() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a salesCreditMemoLine
     */
    @javax.annotation.Nonnull
    public static SalesCreditMemoLine createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SalesCreditMemoLine();
    }
    /**
     * Gets the account property value. The account property
     * @return a account
     */
    @javax.annotation.Nullable
    public Account getAccount() {
        return this._account;
    }
    /**
     * Gets the accountId property value. The accountId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAccountId() {
        return this._accountId;
    }
    /**
     * Gets the amountExcludingTax property value. The amountExcludingTax property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getAmountExcludingTax() {
        return this._amountExcludingTax;
    }
    /**
     * Gets the amountIncludingTax property value. The amountIncludingTax property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getAmountIncludingTax() {
        return this._amountIncludingTax;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
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
     * Gets the discountPercent property value. The discountPercent property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getDiscountPercent() {
        return this._discountPercent;
    }
    /**
     * Gets the documentId property value. The documentId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDocumentId() {
        return this._documentId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("account", (n) -> { this.setAccount(n.getObjectValue(Account::createFromDiscriminatorValue)); });
        deserializerMap.put("accountId", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("amountExcludingTax", (n) -> { this.setAmountExcludingTax(n.getBigDecimalValue()); });
        deserializerMap.put("amountIncludingTax", (n) -> { this.setAmountIncludingTax(n.getBigDecimalValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("discountAmount", (n) -> { this.setDiscountAmount(n.getBigDecimalValue()); });
        deserializerMap.put("discountAppliedBeforeTax", (n) -> { this.setDiscountAppliedBeforeTax(n.getBooleanValue()); });
        deserializerMap.put("discountPercent", (n) -> { this.setDiscountPercent(n.getBigDecimalValue()); });
        deserializerMap.put("documentId", (n) -> { this.setDocumentId(n.getStringValue()); });
        deserializerMap.put("invoiceDiscountAllocation", (n) -> { this.setInvoiceDiscountAllocation(n.getBigDecimalValue()); });
        deserializerMap.put("item", (n) -> { this.setItem(n.getObjectValue(Item::createFromDiscriminatorValue)); });
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getStringValue()); });
        deserializerMap.put("lineType", (n) -> { this.setLineType(n.getStringValue()); });
        deserializerMap.put("netAmount", (n) -> { this.setNetAmount(n.getBigDecimalValue()); });
        deserializerMap.put("netAmountIncludingTax", (n) -> { this.setNetAmountIncludingTax(n.getBigDecimalValue()); });
        deserializerMap.put("netTaxAmount", (n) -> { this.setNetTaxAmount(n.getBigDecimalValue()); });
        deserializerMap.put("quantity", (n) -> { this.setQuantity(n.getBigDecimalValue()); });
        deserializerMap.put("sequence", (n) -> { this.setSequence(n.getIntegerValue()); });
        deserializerMap.put("shipmentDate", (n) -> { this.setShipmentDate(n.getLocalDateValue()); });
        deserializerMap.put("taxCode", (n) -> { this.setTaxCode(n.getStringValue()); });
        deserializerMap.put("taxPercent", (n) -> { this.setTaxPercent(n.getBigDecimalValue()); });
        deserializerMap.put("totalTaxAmount", (n) -> { this.setTotalTaxAmount(n.getBigDecimalValue()); });
        deserializerMap.put("unitOfMeasureId", (n) -> { this.setUnitOfMeasureId(n.getStringValue()); });
        deserializerMap.put("unitPrice", (n) -> { this.setUnitPrice(n.getBigDecimalValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invoiceDiscountAllocation property value. The invoiceDiscountAllocation property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getInvoiceDiscountAllocation() {
        return this._invoiceDiscountAllocation;
    }
    /**
     * Gets the item property value. The item property
     * @return a item
     */
    @javax.annotation.Nullable
    public Item getItem() {
        return this._item;
    }
    /**
     * Gets the itemId property value. The itemId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getItemId() {
        return this._itemId;
    }
    /**
     * Gets the lineType property value. The lineType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLineType() {
        return this._lineType;
    }
    /**
     * Gets the netAmount property value. The netAmount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getNetAmount() {
        return this._netAmount;
    }
    /**
     * Gets the netAmountIncludingTax property value. The netAmountIncludingTax property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getNetAmountIncludingTax() {
        return this._netAmountIncludingTax;
    }
    /**
     * Gets the netTaxAmount property value. The netTaxAmount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getNetTaxAmount() {
        return this._netTaxAmount;
    }
    /**
     * Gets the quantity property value. The quantity property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getQuantity() {
        return this._quantity;
    }
    /**
     * Gets the sequence property value. The sequence property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSequence() {
        return this._sequence;
    }
    /**
     * Gets the shipmentDate property value. The shipmentDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getShipmentDate() {
        return this._shipmentDate;
    }
    /**
     * Gets the taxCode property value. The taxCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTaxCode() {
        return this._taxCode;
    }
    /**
     * Gets the taxPercent property value. The taxPercent property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getTaxPercent() {
        return this._taxPercent;
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
     * Gets the unitOfMeasureId property value. The unitOfMeasureId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUnitOfMeasureId() {
        return this._unitOfMeasureId;
    }
    /**
     * Gets the unitPrice property value. The unitPrice property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getUnitPrice() {
        return this._unitPrice;
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
        writer.writeObjectValue("account", this.getAccount());
        writer.writeStringValue("accountId", this.getAccountId());
        writer.writeBigDecimalValue("amountExcludingTax", this.getAmountExcludingTax());
        writer.writeBigDecimalValue("amountIncludingTax", this.getAmountIncludingTax());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBigDecimalValue("discountAmount", this.getDiscountAmount());
        writer.writeBooleanValue("discountAppliedBeforeTax", this.getDiscountAppliedBeforeTax());
        writer.writeBigDecimalValue("discountPercent", this.getDiscountPercent());
        writer.writeStringValue("documentId", this.getDocumentId());
        writer.writeBigDecimalValue("invoiceDiscountAllocation", this.getInvoiceDiscountAllocation());
        writer.writeObjectValue("item", this.getItem());
        writer.writeStringValue("itemId", this.getItemId());
        writer.writeStringValue("lineType", this.getLineType());
        writer.writeBigDecimalValue("netAmount", this.getNetAmount());
        writer.writeBigDecimalValue("netAmountIncludingTax", this.getNetAmountIncludingTax());
        writer.writeBigDecimalValue("netTaxAmount", this.getNetTaxAmount());
        writer.writeBigDecimalValue("quantity", this.getQuantity());
        writer.writeIntegerValue("sequence", this.getSequence());
        writer.writeLocalDateValue("shipmentDate", this.getShipmentDate());
        writer.writeStringValue("taxCode", this.getTaxCode());
        writer.writeBigDecimalValue("taxPercent", this.getTaxPercent());
        writer.writeBigDecimalValue("totalTaxAmount", this.getTotalTaxAmount());
        writer.writeStringValue("unitOfMeasureId", this.getUnitOfMeasureId());
        writer.writeBigDecimalValue("unitPrice", this.getUnitPrice());
    }
    /**
     * Sets the account property value. The account property
     * @param value Value to set for the account property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccount(@javax.annotation.Nullable final Account value) {
        this._account = value;
    }
    /**
     * Sets the accountId property value. The accountId property
     * @param value Value to set for the accountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountId(@javax.annotation.Nullable final String value) {
        this._accountId = value;
    }
    /**
     * Sets the amountExcludingTax property value. The amountExcludingTax property
     * @param value Value to set for the amountExcludingTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAmountExcludingTax(@javax.annotation.Nullable final BigDecimal value) {
        this._amountExcludingTax = value;
    }
    /**
     * Sets the amountIncludingTax property value. The amountIncludingTax property
     * @param value Value to set for the amountIncludingTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAmountIncludingTax(@javax.annotation.Nullable final BigDecimal value) {
        this._amountIncludingTax = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
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
     * Sets the discountPercent property value. The discountPercent property
     * @param value Value to set for the discountPercent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiscountPercent(@javax.annotation.Nullable final BigDecimal value) {
        this._discountPercent = value;
    }
    /**
     * Sets the documentId property value. The documentId property
     * @param value Value to set for the documentId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDocumentId(@javax.annotation.Nullable final String value) {
        this._documentId = value;
    }
    /**
     * Sets the invoiceDiscountAllocation property value. The invoiceDiscountAllocation property
     * @param value Value to set for the invoiceDiscountAllocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInvoiceDiscountAllocation(@javax.annotation.Nullable final BigDecimal value) {
        this._invoiceDiscountAllocation = value;
    }
    /**
     * Sets the item property value. The item property
     * @param value Value to set for the item property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItem(@javax.annotation.Nullable final Item value) {
        this._item = value;
    }
    /**
     * Sets the itemId property value. The itemId property
     * @param value Value to set for the itemId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemId(@javax.annotation.Nullable final String value) {
        this._itemId = value;
    }
    /**
     * Sets the lineType property value. The lineType property
     * @param value Value to set for the lineType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLineType(@javax.annotation.Nullable final String value) {
        this._lineType = value;
    }
    /**
     * Sets the netAmount property value. The netAmount property
     * @param value Value to set for the netAmount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetAmount(@javax.annotation.Nullable final BigDecimal value) {
        this._netAmount = value;
    }
    /**
     * Sets the netAmountIncludingTax property value. The netAmountIncludingTax property
     * @param value Value to set for the netAmountIncludingTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetAmountIncludingTax(@javax.annotation.Nullable final BigDecimal value) {
        this._netAmountIncludingTax = value;
    }
    /**
     * Sets the netTaxAmount property value. The netTaxAmount property
     * @param value Value to set for the netTaxAmount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetTaxAmount(@javax.annotation.Nullable final BigDecimal value) {
        this._netTaxAmount = value;
    }
    /**
     * Sets the quantity property value. The quantity property
     * @param value Value to set for the quantity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuantity(@javax.annotation.Nullable final BigDecimal value) {
        this._quantity = value;
    }
    /**
     * Sets the sequence property value. The sequence property
     * @param value Value to set for the sequence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSequence(@javax.annotation.Nullable final Integer value) {
        this._sequence = value;
    }
    /**
     * Sets the shipmentDate property value. The shipmentDate property
     * @param value Value to set for the shipmentDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShipmentDate(@javax.annotation.Nullable final LocalDate value) {
        this._shipmentDate = value;
    }
    /**
     * Sets the taxCode property value. The taxCode property
     * @param value Value to set for the taxCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaxCode(@javax.annotation.Nullable final String value) {
        this._taxCode = value;
    }
    /**
     * Sets the taxPercent property value. The taxPercent property
     * @param value Value to set for the taxPercent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaxPercent(@javax.annotation.Nullable final BigDecimal value) {
        this._taxPercent = value;
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
     * Sets the unitOfMeasureId property value. The unitOfMeasureId property
     * @param value Value to set for the unitOfMeasureId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnitOfMeasureId(@javax.annotation.Nullable final String value) {
        this._unitOfMeasureId = value;
    }
    /**
     * Sets the unitPrice property value. The unitPrice property
     * @param value Value to set for the unitPrice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnitPrice(@javax.annotation.Nullable final BigDecimal value) {
        this._unitPrice = value;
    }
}
