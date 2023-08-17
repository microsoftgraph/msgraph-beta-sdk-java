package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class SalesInvoiceLine extends Entity implements Parsable {
    /**
     * The account property
     */
    private Account account;
    /**
     * The accountId property
     */
    private UUID accountId;
    /**
     * The amountExcludingTax property
     */
    private BigDecimal amountExcludingTax;
    /**
     * The amountIncludingTax property
     */
    private BigDecimal amountIncludingTax;
    /**
     * The description property
     */
    private String description;
    /**
     * The discountAmount property
     */
    private BigDecimal discountAmount;
    /**
     * The discountAppliedBeforeTax property
     */
    private Boolean discountAppliedBeforeTax;
    /**
     * The discountPercent property
     */
    private BigDecimal discountPercent;
    /**
     * The documentId property
     */
    private UUID documentId;
    /**
     * The invoiceDiscountAllocation property
     */
    private BigDecimal invoiceDiscountAllocation;
    /**
     * The item property
     */
    private Item item;
    /**
     * The itemId property
     */
    private UUID itemId;
    /**
     * The lineType property
     */
    private String lineType;
    /**
     * The netAmount property
     */
    private BigDecimal netAmount;
    /**
     * The netAmountIncludingTax property
     */
    private BigDecimal netAmountIncludingTax;
    /**
     * The netTaxAmount property
     */
    private BigDecimal netTaxAmount;
    /**
     * The quantity property
     */
    private BigDecimal quantity;
    /**
     * The sequence property
     */
    private Integer sequence;
    /**
     * The shipmentDate property
     */
    private LocalDate shipmentDate;
    /**
     * The taxCode property
     */
    private String taxCode;
    /**
     * The taxPercent property
     */
    private BigDecimal taxPercent;
    /**
     * The totalTaxAmount property
     */
    private BigDecimal totalTaxAmount;
    /**
     * The unitOfMeasureId property
     */
    private UUID unitOfMeasureId;
    /**
     * The unitPrice property
     */
    private BigDecimal unitPrice;
    /**
     * Instantiates a new salesInvoiceLine and sets the default values.
     */
    public SalesInvoiceLine() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a salesInvoiceLine
     */
    @jakarta.annotation.Nonnull
    public static SalesInvoiceLine createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SalesInvoiceLine();
    }
    /**
     * Gets the account property value. The account property
     * @return a account
     */
    @jakarta.annotation.Nullable
    public Account getAccount() {
        return this.account;
    }
    /**
     * Gets the accountId property value. The accountId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getAccountId() {
        return this.accountId;
    }
    /**
     * Gets the amountExcludingTax property value. The amountExcludingTax property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getAmountExcludingTax() {
        return this.amountExcludingTax;
    }
    /**
     * Gets the amountIncludingTax property value. The amountIncludingTax property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getAmountIncludingTax() {
        return this.amountIncludingTax;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the discountAmount property value. The discountAmount property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getDiscountAmount() {
        return this.discountAmount;
    }
    /**
     * Gets the discountAppliedBeforeTax property value. The discountAppliedBeforeTax property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDiscountAppliedBeforeTax() {
        return this.discountAppliedBeforeTax;
    }
    /**
     * Gets the discountPercent property value. The discountPercent property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getDiscountPercent() {
        return this.discountPercent;
    }
    /**
     * Gets the documentId property value. The documentId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getDocumentId() {
        return this.documentId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("account", (n) -> { this.setAccount(n.getObjectValue(Account::createFromDiscriminatorValue)); });
        deserializerMap.put("accountId", (n) -> { this.setAccountId(n.getUUIDValue()); });
        deserializerMap.put("amountExcludingTax", (n) -> { this.setAmountExcludingTax(n.getBigDecimalValue()); });
        deserializerMap.put("amountIncludingTax", (n) -> { this.setAmountIncludingTax(n.getBigDecimalValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("discountAmount", (n) -> { this.setDiscountAmount(n.getBigDecimalValue()); });
        deserializerMap.put("discountAppliedBeforeTax", (n) -> { this.setDiscountAppliedBeforeTax(n.getBooleanValue()); });
        deserializerMap.put("discountPercent", (n) -> { this.setDiscountPercent(n.getBigDecimalValue()); });
        deserializerMap.put("documentId", (n) -> { this.setDocumentId(n.getUUIDValue()); });
        deserializerMap.put("invoiceDiscountAllocation", (n) -> { this.setInvoiceDiscountAllocation(n.getBigDecimalValue()); });
        deserializerMap.put("item", (n) -> { this.setItem(n.getObjectValue(Item::createFromDiscriminatorValue)); });
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getUUIDValue()); });
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
        deserializerMap.put("unitOfMeasureId", (n) -> { this.setUnitOfMeasureId(n.getUUIDValue()); });
        deserializerMap.put("unitPrice", (n) -> { this.setUnitPrice(n.getBigDecimalValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invoiceDiscountAllocation property value. The invoiceDiscountAllocation property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getInvoiceDiscountAllocation() {
        return this.invoiceDiscountAllocation;
    }
    /**
     * Gets the item property value. The item property
     * @return a item
     */
    @jakarta.annotation.Nullable
    public Item getItem() {
        return this.item;
    }
    /**
     * Gets the itemId property value. The itemId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getItemId() {
        return this.itemId;
    }
    /**
     * Gets the lineType property value. The lineType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLineType() {
        return this.lineType;
    }
    /**
     * Gets the netAmount property value. The netAmount property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getNetAmount() {
        return this.netAmount;
    }
    /**
     * Gets the netAmountIncludingTax property value. The netAmountIncludingTax property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getNetAmountIncludingTax() {
        return this.netAmountIncludingTax;
    }
    /**
     * Gets the netTaxAmount property value. The netTaxAmount property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getNetTaxAmount() {
        return this.netTaxAmount;
    }
    /**
     * Gets the quantity property value. The quantity property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    /**
     * Gets the sequence property value. The sequence property
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getSequence() {
        return this.sequence;
    }
    /**
     * Gets the shipmentDate property value. The shipmentDate property
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getShipmentDate() {
        return this.shipmentDate;
    }
    /**
     * Gets the taxCode property value. The taxCode property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTaxCode() {
        return this.taxCode;
    }
    /**
     * Gets the taxPercent property value. The taxPercent property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getTaxPercent() {
        return this.taxPercent;
    }
    /**
     * Gets the totalTaxAmount property value. The totalTaxAmount property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getTotalTaxAmount() {
        return this.totalTaxAmount;
    }
    /**
     * Gets the unitOfMeasureId property value. The unitOfMeasureId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getUnitOfMeasureId() {
        return this.unitOfMeasureId;
    }
    /**
     * Gets the unitPrice property value. The unitPrice property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("account", this.getAccount());
        writer.writeUUIDValue("accountId", this.getAccountId());
        writer.writeBigDecimalValue("amountExcludingTax", this.getAmountExcludingTax());
        writer.writeBigDecimalValue("amountIncludingTax", this.getAmountIncludingTax());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBigDecimalValue("discountAmount", this.getDiscountAmount());
        writer.writeBooleanValue("discountAppliedBeforeTax", this.getDiscountAppliedBeforeTax());
        writer.writeBigDecimalValue("discountPercent", this.getDiscountPercent());
        writer.writeUUIDValue("documentId", this.getDocumentId());
        writer.writeBigDecimalValue("invoiceDiscountAllocation", this.getInvoiceDiscountAllocation());
        writer.writeObjectValue("item", this.getItem());
        writer.writeUUIDValue("itemId", this.getItemId());
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
        writer.writeUUIDValue("unitOfMeasureId", this.getUnitOfMeasureId());
        writer.writeBigDecimalValue("unitPrice", this.getUnitPrice());
    }
    /**
     * Sets the account property value. The account property
     * @param value Value to set for the account property.
     */
    public void setAccount(@jakarta.annotation.Nullable final Account value) {
        this.account = value;
    }
    /**
     * Sets the accountId property value. The accountId property
     * @param value Value to set for the accountId property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final UUID value) {
        this.accountId = value;
    }
    /**
     * Sets the amountExcludingTax property value. The amountExcludingTax property
     * @param value Value to set for the amountExcludingTax property.
     */
    public void setAmountExcludingTax(@jakarta.annotation.Nullable final BigDecimal value) {
        this.amountExcludingTax = value;
    }
    /**
     * Sets the amountIncludingTax property value. The amountIncludingTax property
     * @param value Value to set for the amountIncludingTax property.
     */
    public void setAmountIncludingTax(@jakarta.annotation.Nullable final BigDecimal value) {
        this.amountIncludingTax = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the discountAmount property value. The discountAmount property
     * @param value Value to set for the discountAmount property.
     */
    public void setDiscountAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.discountAmount = value;
    }
    /**
     * Sets the discountAppliedBeforeTax property value. The discountAppliedBeforeTax property
     * @param value Value to set for the discountAppliedBeforeTax property.
     */
    public void setDiscountAppliedBeforeTax(@jakarta.annotation.Nullable final Boolean value) {
        this.discountAppliedBeforeTax = value;
    }
    /**
     * Sets the discountPercent property value. The discountPercent property
     * @param value Value to set for the discountPercent property.
     */
    public void setDiscountPercent(@jakarta.annotation.Nullable final BigDecimal value) {
        this.discountPercent = value;
    }
    /**
     * Sets the documentId property value. The documentId property
     * @param value Value to set for the documentId property.
     */
    public void setDocumentId(@jakarta.annotation.Nullable final UUID value) {
        this.documentId = value;
    }
    /**
     * Sets the invoiceDiscountAllocation property value. The invoiceDiscountAllocation property
     * @param value Value to set for the invoiceDiscountAllocation property.
     */
    public void setInvoiceDiscountAllocation(@jakarta.annotation.Nullable final BigDecimal value) {
        this.invoiceDiscountAllocation = value;
    }
    /**
     * Sets the item property value. The item property
     * @param value Value to set for the item property.
     */
    public void setItem(@jakarta.annotation.Nullable final Item value) {
        this.item = value;
    }
    /**
     * Sets the itemId property value. The itemId property
     * @param value Value to set for the itemId property.
     */
    public void setItemId(@jakarta.annotation.Nullable final UUID value) {
        this.itemId = value;
    }
    /**
     * Sets the lineType property value. The lineType property
     * @param value Value to set for the lineType property.
     */
    public void setLineType(@jakarta.annotation.Nullable final String value) {
        this.lineType = value;
    }
    /**
     * Sets the netAmount property value. The netAmount property
     * @param value Value to set for the netAmount property.
     */
    public void setNetAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.netAmount = value;
    }
    /**
     * Sets the netAmountIncludingTax property value. The netAmountIncludingTax property
     * @param value Value to set for the netAmountIncludingTax property.
     */
    public void setNetAmountIncludingTax(@jakarta.annotation.Nullable final BigDecimal value) {
        this.netAmountIncludingTax = value;
    }
    /**
     * Sets the netTaxAmount property value. The netTaxAmount property
     * @param value Value to set for the netTaxAmount property.
     */
    public void setNetTaxAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.netTaxAmount = value;
    }
    /**
     * Sets the quantity property value. The quantity property
     * @param value Value to set for the quantity property.
     */
    public void setQuantity(@jakarta.annotation.Nullable final BigDecimal value) {
        this.quantity = value;
    }
    /**
     * Sets the sequence property value. The sequence property
     * @param value Value to set for the sequence property.
     */
    public void setSequence(@jakarta.annotation.Nullable final Integer value) {
        this.sequence = value;
    }
    /**
     * Sets the shipmentDate property value. The shipmentDate property
     * @param value Value to set for the shipmentDate property.
     */
    public void setShipmentDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.shipmentDate = value;
    }
    /**
     * Sets the taxCode property value. The taxCode property
     * @param value Value to set for the taxCode property.
     */
    public void setTaxCode(@jakarta.annotation.Nullable final String value) {
        this.taxCode = value;
    }
    /**
     * Sets the taxPercent property value. The taxPercent property
     * @param value Value to set for the taxPercent property.
     */
    public void setTaxPercent(@jakarta.annotation.Nullable final BigDecimal value) {
        this.taxPercent = value;
    }
    /**
     * Sets the totalTaxAmount property value. The totalTaxAmount property
     * @param value Value to set for the totalTaxAmount property.
     */
    public void setTotalTaxAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.totalTaxAmount = value;
    }
    /**
     * Sets the unitOfMeasureId property value. The unitOfMeasureId property
     * @param value Value to set for the unitOfMeasureId property.
     */
    public void setUnitOfMeasureId(@jakarta.annotation.Nullable final UUID value) {
        this.unitOfMeasureId = value;
    }
    /**
     * Sets the unitPrice property value. The unitPrice property
     * @param value Value to set for the unitPrice property.
     */
    public void setUnitPrice(@jakarta.annotation.Nullable final BigDecimal value) {
        this.unitPrice = value;
    }
}
