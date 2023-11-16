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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PurchaseInvoiceLine extends Entity implements Parsable {
    /**
     * Instantiates a new PurchaseInvoiceLine and sets the default values.
     */
    public PurchaseInvoiceLine() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PurchaseInvoiceLine
     */
    @jakarta.annotation.Nonnull
    public static PurchaseInvoiceLine createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PurchaseInvoiceLine();
    }
    /**
     * Gets the account property value. The account property
     * @return a Account
     */
    @jakarta.annotation.Nullable
    public Account getAccount() {
        return this.BackingStore.get("account");
    }
    /**
     * Gets the accountId property value. The accountId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getAccountId() {
        return this.BackingStore.get("accountId");
    }
    /**
     * Gets the amountExcludingTax property value. The amountExcludingTax property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getAmountExcludingTax() {
        return this.BackingStore.get("amountExcludingTax");
    }
    /**
     * Gets the amountIncludingTax property value. The amountIncludingTax property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getAmountIncludingTax() {
        return this.BackingStore.get("amountIncludingTax");
    }
    /**
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the discountAmount property value. The discountAmount property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getDiscountAmount() {
        return this.BackingStore.get("discountAmount");
    }
    /**
     * Gets the discountAppliedBeforeTax property value. The discountAppliedBeforeTax property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDiscountAppliedBeforeTax() {
        return this.BackingStore.get("discountAppliedBeforeTax");
    }
    /**
     * Gets the discountPercent property value. The discountPercent property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getDiscountPercent() {
        return this.BackingStore.get("discountPercent");
    }
    /**
     * Gets the documentId property value. The documentId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getDocumentId() {
        return this.BackingStore.get("documentId");
    }
    /**
     * Gets the expectedReceiptDate property value. The expectedReceiptDate property
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getExpectedReceiptDate() {
        return this.BackingStore.get("expectedReceiptDate");
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
        deserializerMap.put("expectedReceiptDate", (n) -> { this.setExpectedReceiptDate(n.getLocalDateValue()); });
        deserializerMap.put("invoiceDiscountAllocation", (n) -> { this.setInvoiceDiscountAllocation(n.getBigDecimalValue()); });
        deserializerMap.put("item", (n) -> { this.setItem(n.getObjectValue(Item::createFromDiscriminatorValue)); });
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getUUIDValue()); });
        deserializerMap.put("lineType", (n) -> { this.setLineType(n.getStringValue()); });
        deserializerMap.put("netAmount", (n) -> { this.setNetAmount(n.getBigDecimalValue()); });
        deserializerMap.put("netAmountIncludingTax", (n) -> { this.setNetAmountIncludingTax(n.getBigDecimalValue()); });
        deserializerMap.put("netTaxAmount", (n) -> { this.setNetTaxAmount(n.getBigDecimalValue()); });
        deserializerMap.put("quantity", (n) -> { this.setQuantity(n.getBigDecimalValue()); });
        deserializerMap.put("sequence", (n) -> { this.setSequence(n.getIntegerValue()); });
        deserializerMap.put("taxCode", (n) -> { this.setTaxCode(n.getStringValue()); });
        deserializerMap.put("taxPercent", (n) -> { this.setTaxPercent(n.getBigDecimalValue()); });
        deserializerMap.put("totalTaxAmount", (n) -> { this.setTotalTaxAmount(n.getBigDecimalValue()); });
        deserializerMap.put("unitCost", (n) -> { this.setUnitCost(n.getBigDecimalValue()); });
        return deserializerMap;
    }
    /**
     * Gets the invoiceDiscountAllocation property value. The invoiceDiscountAllocation property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getInvoiceDiscountAllocation() {
        return this.BackingStore.get("invoiceDiscountAllocation");
    }
    /**
     * Gets the item property value. The item property
     * @return a Item
     */
    @jakarta.annotation.Nullable
    public Item getItem() {
        return this.BackingStore.get("item");
    }
    /**
     * Gets the itemId property value. The itemId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getItemId() {
        return this.BackingStore.get("itemId");
    }
    /**
     * Gets the lineType property value. The lineType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLineType() {
        return this.BackingStore.get("lineType");
    }
    /**
     * Gets the netAmount property value. The netAmount property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getNetAmount() {
        return this.BackingStore.get("netAmount");
    }
    /**
     * Gets the netAmountIncludingTax property value. The netAmountIncludingTax property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getNetAmountIncludingTax() {
        return this.BackingStore.get("netAmountIncludingTax");
    }
    /**
     * Gets the netTaxAmount property value. The netTaxAmount property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getNetTaxAmount() {
        return this.BackingStore.get("netTaxAmount");
    }
    /**
     * Gets the quantity property value. The quantity property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getQuantity() {
        return this.BackingStore.get("quantity");
    }
    /**
     * Gets the sequence property value. The sequence property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSequence() {
        return this.BackingStore.get("sequence");
    }
    /**
     * Gets the taxCode property value. The taxCode property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTaxCode() {
        return this.BackingStore.get("taxCode");
    }
    /**
     * Gets the taxPercent property value. The taxPercent property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getTaxPercent() {
        return this.BackingStore.get("taxPercent");
    }
    /**
     * Gets the totalTaxAmount property value. The totalTaxAmount property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getTotalTaxAmount() {
        return this.BackingStore.get("totalTaxAmount");
    }
    /**
     * Gets the unitCost property value. The unitCost property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getUnitCost() {
        return this.BackingStore.get("unitCost");
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
        writer.writeLocalDateValue("expectedReceiptDate", this.getExpectedReceiptDate());
        writer.writeBigDecimalValue("invoiceDiscountAllocation", this.getInvoiceDiscountAllocation());
        writer.writeObjectValue("item", this.getItem());
        writer.writeUUIDValue("itemId", this.getItemId());
        writer.writeStringValue("lineType", this.getLineType());
        writer.writeBigDecimalValue("netAmount", this.getNetAmount());
        writer.writeBigDecimalValue("netAmountIncludingTax", this.getNetAmountIncludingTax());
        writer.writeBigDecimalValue("netTaxAmount", this.getNetTaxAmount());
        writer.writeBigDecimalValue("quantity", this.getQuantity());
        writer.writeIntegerValue("sequence", this.getSequence());
        writer.writeStringValue("taxCode", this.getTaxCode());
        writer.writeBigDecimalValue("taxPercent", this.getTaxPercent());
        writer.writeBigDecimalValue("totalTaxAmount", this.getTotalTaxAmount());
        writer.writeBigDecimalValue("unitCost", this.getUnitCost());
    }
    /**
     * Sets the account property value. The account property
     * @param value Value to set for the account property.
     */
    public void setAccount(@jakarta.annotation.Nullable final Account value) {
        this.BackingStore.set("account", value);
    }
    /**
     * Sets the accountId property value. The accountId property
     * @param value Value to set for the accountId property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("accountId", value);
    }
    /**
     * Sets the amountExcludingTax property value. The amountExcludingTax property
     * @param value Value to set for the amountExcludingTax property.
     */
    public void setAmountExcludingTax(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("amountExcludingTax", value);
    }
    /**
     * Sets the amountIncludingTax property value. The amountIncludingTax property
     * @param value Value to set for the amountIncludingTax property.
     */
    public void setAmountIncludingTax(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("amountIncludingTax", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the discountAmount property value. The discountAmount property
     * @param value Value to set for the discountAmount property.
     */
    public void setDiscountAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("discountAmount", value);
    }
    /**
     * Sets the discountAppliedBeforeTax property value. The discountAppliedBeforeTax property
     * @param value Value to set for the discountAppliedBeforeTax property.
     */
    public void setDiscountAppliedBeforeTax(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("discountAppliedBeforeTax", value);
    }
    /**
     * Sets the discountPercent property value. The discountPercent property
     * @param value Value to set for the discountPercent property.
     */
    public void setDiscountPercent(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("discountPercent", value);
    }
    /**
     * Sets the documentId property value. The documentId property
     * @param value Value to set for the documentId property.
     */
    public void setDocumentId(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("documentId", value);
    }
    /**
     * Sets the expectedReceiptDate property value. The expectedReceiptDate property
     * @param value Value to set for the expectedReceiptDate property.
     */
    public void setExpectedReceiptDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.BackingStore.set("expectedReceiptDate", value);
    }
    /**
     * Sets the invoiceDiscountAllocation property value. The invoiceDiscountAllocation property
     * @param value Value to set for the invoiceDiscountAllocation property.
     */
    public void setInvoiceDiscountAllocation(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("invoiceDiscountAllocation", value);
    }
    /**
     * Sets the item property value. The item property
     * @param value Value to set for the item property.
     */
    public void setItem(@jakarta.annotation.Nullable final Item value) {
        this.BackingStore.set("item", value);
    }
    /**
     * Sets the itemId property value. The itemId property
     * @param value Value to set for the itemId property.
     */
    public void setItemId(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("itemId", value);
    }
    /**
     * Sets the lineType property value. The lineType property
     * @param value Value to set for the lineType property.
     */
    public void setLineType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("lineType", value);
    }
    /**
     * Sets the netAmount property value. The netAmount property
     * @param value Value to set for the netAmount property.
     */
    public void setNetAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("netAmount", value);
    }
    /**
     * Sets the netAmountIncludingTax property value. The netAmountIncludingTax property
     * @param value Value to set for the netAmountIncludingTax property.
     */
    public void setNetAmountIncludingTax(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("netAmountIncludingTax", value);
    }
    /**
     * Sets the netTaxAmount property value. The netTaxAmount property
     * @param value Value to set for the netTaxAmount property.
     */
    public void setNetTaxAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("netTaxAmount", value);
    }
    /**
     * Sets the quantity property value. The quantity property
     * @param value Value to set for the quantity property.
     */
    public void setQuantity(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("quantity", value);
    }
    /**
     * Sets the sequence property value. The sequence property
     * @param value Value to set for the sequence property.
     */
    public void setSequence(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("sequence", value);
    }
    /**
     * Sets the taxCode property value. The taxCode property
     * @param value Value to set for the taxCode property.
     */
    public void setTaxCode(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("taxCode", value);
    }
    /**
     * Sets the taxPercent property value. The taxPercent property
     * @param value Value to set for the taxPercent property.
     */
    public void setTaxPercent(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("taxPercent", value);
    }
    /**
     * Sets the totalTaxAmount property value. The totalTaxAmount property
     * @param value Value to set for the totalTaxAmount property.
     */
    public void setTotalTaxAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("totalTaxAmount", value);
    }
    /**
     * Sets the unitCost property value. The unitCost property
     * @param value Value to set for the unitCost property.
     */
    public void setUnitCost(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("unitCost", value);
    }
}
