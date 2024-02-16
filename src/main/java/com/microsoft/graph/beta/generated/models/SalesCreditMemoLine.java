package com.microsoft.graph.beta.models;

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
public class SalesCreditMemoLine extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SalesCreditMemoLine} and sets the default values.
     */
    public SalesCreditMemoLine() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SalesCreditMemoLine}
     */
    @jakarta.annotation.Nonnull
    public static SalesCreditMemoLine createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SalesCreditMemoLine();
    }
    /**
     * Gets the account property value. The account property
     * @return a {@link Account}
     */
    @jakarta.annotation.Nullable
    public Account getAccount() {
        return this.backingStore.get("account");
    }
    /**
     * Gets the accountId property value. The accountId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getAccountId() {
        return this.backingStore.get("accountId");
    }
    /**
     * Gets the amountExcludingTax property value. The amountExcludingTax property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getAmountExcludingTax() {
        return this.backingStore.get("amountExcludingTax");
    }
    /**
     * Gets the amountIncludingTax property value. The amountIncludingTax property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getAmountIncludingTax() {
        return this.backingStore.get("amountIncludingTax");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
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
     * Gets the discountPercent property value. The discountPercent property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getDiscountPercent() {
        return this.backingStore.get("discountPercent");
    }
    /**
     * Gets the documentId property value. The documentId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getDocumentId() {
        return this.backingStore.get("documentId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getInvoiceDiscountAllocation() {
        return this.backingStore.get("invoiceDiscountAllocation");
    }
    /**
     * Gets the item property value. The item property
     * @return a {@link Item}
     */
    @jakarta.annotation.Nullable
    public Item getItem() {
        return this.backingStore.get("item");
    }
    /**
     * Gets the itemId property value. The itemId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getItemId() {
        return this.backingStore.get("itemId");
    }
    /**
     * Gets the lineType property value. The lineType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLineType() {
        return this.backingStore.get("lineType");
    }
    /**
     * Gets the netAmount property value. The netAmount property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getNetAmount() {
        return this.backingStore.get("netAmount");
    }
    /**
     * Gets the netAmountIncludingTax property value. The netAmountIncludingTax property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getNetAmountIncludingTax() {
        return this.backingStore.get("netAmountIncludingTax");
    }
    /**
     * Gets the netTaxAmount property value. The netTaxAmount property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getNetTaxAmount() {
        return this.backingStore.get("netTaxAmount");
    }
    /**
     * Gets the quantity property value. The quantity property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getQuantity() {
        return this.backingStore.get("quantity");
    }
    /**
     * Gets the sequence property value. The sequence property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSequence() {
        return this.backingStore.get("sequence");
    }
    /**
     * Gets the shipmentDate property value. The shipmentDate property
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getShipmentDate() {
        return this.backingStore.get("shipmentDate");
    }
    /**
     * Gets the taxCode property value. The taxCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTaxCode() {
        return this.backingStore.get("taxCode");
    }
    /**
     * Gets the taxPercent property value. The taxPercent property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getTaxPercent() {
        return this.backingStore.get("taxPercent");
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
     * Gets the unitOfMeasureId property value. The unitOfMeasureId property
     * @return a {@link UUID}
     */
    @jakarta.annotation.Nullable
    public UUID getUnitOfMeasureId() {
        return this.backingStore.get("unitOfMeasureId");
    }
    /**
     * Gets the unitPrice property value. The unitPrice property
     * @return a {@link BigDecimal}
     */
    @jakarta.annotation.Nullable
    public BigDecimal getUnitPrice() {
        return this.backingStore.get("unitPrice");
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
        this.backingStore.set("account", value);
    }
    /**
     * Sets the accountId property value. The accountId property
     * @param value Value to set for the accountId property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("accountId", value);
    }
    /**
     * Sets the amountExcludingTax property value. The amountExcludingTax property
     * @param value Value to set for the amountExcludingTax property.
     */
    public void setAmountExcludingTax(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("amountExcludingTax", value);
    }
    /**
     * Sets the amountIncludingTax property value. The amountIncludingTax property
     * @param value Value to set for the amountIncludingTax property.
     */
    public void setAmountIncludingTax(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("amountIncludingTax", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
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
     * Sets the discountPercent property value. The discountPercent property
     * @param value Value to set for the discountPercent property.
     */
    public void setDiscountPercent(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("discountPercent", value);
    }
    /**
     * Sets the documentId property value. The documentId property
     * @param value Value to set for the documentId property.
     */
    public void setDocumentId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("documentId", value);
    }
    /**
     * Sets the invoiceDiscountAllocation property value. The invoiceDiscountAllocation property
     * @param value Value to set for the invoiceDiscountAllocation property.
     */
    public void setInvoiceDiscountAllocation(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("invoiceDiscountAllocation", value);
    }
    /**
     * Sets the item property value. The item property
     * @param value Value to set for the item property.
     */
    public void setItem(@jakarta.annotation.Nullable final Item value) {
        this.backingStore.set("item", value);
    }
    /**
     * Sets the itemId property value. The itemId property
     * @param value Value to set for the itemId property.
     */
    public void setItemId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("itemId", value);
    }
    /**
     * Sets the lineType property value. The lineType property
     * @param value Value to set for the lineType property.
     */
    public void setLineType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lineType", value);
    }
    /**
     * Sets the netAmount property value. The netAmount property
     * @param value Value to set for the netAmount property.
     */
    public void setNetAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("netAmount", value);
    }
    /**
     * Sets the netAmountIncludingTax property value. The netAmountIncludingTax property
     * @param value Value to set for the netAmountIncludingTax property.
     */
    public void setNetAmountIncludingTax(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("netAmountIncludingTax", value);
    }
    /**
     * Sets the netTaxAmount property value. The netTaxAmount property
     * @param value Value to set for the netTaxAmount property.
     */
    public void setNetTaxAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("netTaxAmount", value);
    }
    /**
     * Sets the quantity property value. The quantity property
     * @param value Value to set for the quantity property.
     */
    public void setQuantity(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("quantity", value);
    }
    /**
     * Sets the sequence property value. The sequence property
     * @param value Value to set for the sequence property.
     */
    public void setSequence(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("sequence", value);
    }
    /**
     * Sets the shipmentDate property value. The shipmentDate property
     * @param value Value to set for the shipmentDate property.
     */
    public void setShipmentDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("shipmentDate", value);
    }
    /**
     * Sets the taxCode property value. The taxCode property
     * @param value Value to set for the taxCode property.
     */
    public void setTaxCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("taxCode", value);
    }
    /**
     * Sets the taxPercent property value. The taxPercent property
     * @param value Value to set for the taxPercent property.
     */
    public void setTaxPercent(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("taxPercent", value);
    }
    /**
     * Sets the totalTaxAmount property value. The totalTaxAmount property
     * @param value Value to set for the totalTaxAmount property.
     */
    public void setTotalTaxAmount(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("totalTaxAmount", value);
    }
    /**
     * Sets the unitOfMeasureId property value. The unitOfMeasureId property
     * @param value Value to set for the unitOfMeasureId property.
     */
    public void setUnitOfMeasureId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("unitOfMeasureId", value);
    }
    /**
     * Sets the unitPrice property value. The unitPrice property
     * @param value Value to set for the unitPrice property.
     */
    public void setUnitPrice(@jakarta.annotation.Nullable final BigDecimal value) {
        this.backingStore.set("unitPrice", value);
    }
}
