package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class SalesQuoteLine extends Entity implements Parsable {
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
     * Instantiates a new SalesQuoteLine and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SalesQuoteLine() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SalesQuoteLine
     */
    @javax.annotation.Nonnull
    public static SalesQuoteLine createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SalesQuoteLine();
    }
    /**
     * Gets the account property value. The account property
     * @return a account
     */
    @javax.annotation.Nullable
    public Account getAccount() {
        return this.account;
    }
    /**
     * Gets the accountId property value. The accountId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getAccountId() {
        return this.accountId;
    }
    /**
     * Gets the amountExcludingTax property value. The amountExcludingTax property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getAmountExcludingTax() {
        return this.amountExcludingTax;
    }
    /**
     * Gets the amountIncludingTax property value. The amountIncludingTax property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getAmountIncludingTax() {
        return this.amountIncludingTax;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
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
     * Gets the discountPercent property value. The discountPercent property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getDiscountPercent() {
        return this.discountPercent;
    }
    /**
     * Gets the documentId property value. The documentId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getDocumentId() {
        return this.documentId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
        deserializerMap.put("unitOfMeasureId", (n) -> { this.setUnitOfMeasureId(n.getUUIDValue()); });
        deserializerMap.put("unitPrice", (n) -> { this.setUnitPrice(n.getBigDecimalValue()); });
        return deserializerMap;
    }
    /**
     * Gets the item property value. The item property
     * @return a item
     */
    @javax.annotation.Nullable
    public Item getItem() {
        return this.item;
    }
    /**
     * Gets the itemId property value. The itemId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getItemId() {
        return this.itemId;
    }
    /**
     * Gets the lineType property value. The lineType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLineType() {
        return this.lineType;
    }
    /**
     * Gets the netAmount property value. The netAmount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getNetAmount() {
        return this.netAmount;
    }
    /**
     * Gets the netAmountIncludingTax property value. The netAmountIncludingTax property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getNetAmountIncludingTax() {
        return this.netAmountIncludingTax;
    }
    /**
     * Gets the netTaxAmount property value. The netTaxAmount property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getNetTaxAmount() {
        return this.netTaxAmount;
    }
    /**
     * Gets the quantity property value. The quantity property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    /**
     * Gets the sequence property value. The sequence property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSequence() {
        return this.sequence;
    }
    /**
     * Gets the taxCode property value. The taxCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTaxCode() {
        return this.taxCode;
    }
    /**
     * Gets the taxPercent property value. The taxPercent property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getTaxPercent() {
        return this.taxPercent;
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
     * Gets the unitOfMeasureId property value. The unitOfMeasureId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getUnitOfMeasureId() {
        return this.unitOfMeasureId;
    }
    /**
     * Gets the unitPrice property value. The unitPrice property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
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
        writer.writeUUIDValue("accountId", this.getAccountId());
        writer.writeBigDecimalValue("amountExcludingTax", this.getAmountExcludingTax());
        writer.writeBigDecimalValue("amountIncludingTax", this.getAmountIncludingTax());
        writer.writeStringValue("description", this.getDescription());
        writer.writeBigDecimalValue("discountAmount", this.getDiscountAmount());
        writer.writeBooleanValue("discountAppliedBeforeTax", this.getDiscountAppliedBeforeTax());
        writer.writeBigDecimalValue("discountPercent", this.getDiscountPercent());
        writer.writeUUIDValue("documentId", this.getDocumentId());
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
        writer.writeUUIDValue("unitOfMeasureId", this.getUnitOfMeasureId());
        writer.writeBigDecimalValue("unitPrice", this.getUnitPrice());
    }
    /**
     * Sets the account property value. The account property
     * @param value Value to set for the account property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccount(@javax.annotation.Nullable final Account value) {
        this.account = value;
    }
    /**
     * Sets the accountId property value. The accountId property
     * @param value Value to set for the accountId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountId(@javax.annotation.Nullable final UUID value) {
        this.accountId = value;
    }
    /**
     * Sets the amountExcludingTax property value. The amountExcludingTax property
     * @param value Value to set for the amountExcludingTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAmountExcludingTax(@javax.annotation.Nullable final BigDecimal value) {
        this.amountExcludingTax = value;
    }
    /**
     * Sets the amountIncludingTax property value. The amountIncludingTax property
     * @param value Value to set for the amountIncludingTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAmountIncludingTax(@javax.annotation.Nullable final BigDecimal value) {
        this.amountIncludingTax = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
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
     * Sets the discountPercent property value. The discountPercent property
     * @param value Value to set for the discountPercent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiscountPercent(@javax.annotation.Nullable final BigDecimal value) {
        this.discountPercent = value;
    }
    /**
     * Sets the documentId property value. The documentId property
     * @param value Value to set for the documentId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDocumentId(@javax.annotation.Nullable final UUID value) {
        this.documentId = value;
    }
    /**
     * Sets the item property value. The item property
     * @param value Value to set for the item property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItem(@javax.annotation.Nullable final Item value) {
        this.item = value;
    }
    /**
     * Sets the itemId property value. The itemId property
     * @param value Value to set for the itemId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemId(@javax.annotation.Nullable final UUID value) {
        this.itemId = value;
    }
    /**
     * Sets the lineType property value. The lineType property
     * @param value Value to set for the lineType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLineType(@javax.annotation.Nullable final String value) {
        this.lineType = value;
    }
    /**
     * Sets the netAmount property value. The netAmount property
     * @param value Value to set for the netAmount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetAmount(@javax.annotation.Nullable final BigDecimal value) {
        this.netAmount = value;
    }
    /**
     * Sets the netAmountIncludingTax property value. The netAmountIncludingTax property
     * @param value Value to set for the netAmountIncludingTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetAmountIncludingTax(@javax.annotation.Nullable final BigDecimal value) {
        this.netAmountIncludingTax = value;
    }
    /**
     * Sets the netTaxAmount property value. The netTaxAmount property
     * @param value Value to set for the netTaxAmount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNetTaxAmount(@javax.annotation.Nullable final BigDecimal value) {
        this.netTaxAmount = value;
    }
    /**
     * Sets the quantity property value. The quantity property
     * @param value Value to set for the quantity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuantity(@javax.annotation.Nullable final BigDecimal value) {
        this.quantity = value;
    }
    /**
     * Sets the sequence property value. The sequence property
     * @param value Value to set for the sequence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSequence(@javax.annotation.Nullable final Integer value) {
        this.sequence = value;
    }
    /**
     * Sets the taxCode property value. The taxCode property
     * @param value Value to set for the taxCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaxCode(@javax.annotation.Nullable final String value) {
        this.taxCode = value;
    }
    /**
     * Sets the taxPercent property value. The taxPercent property
     * @param value Value to set for the taxPercent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaxPercent(@javax.annotation.Nullable final BigDecimal value) {
        this.taxPercent = value;
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
     * Sets the unitOfMeasureId property value. The unitOfMeasureId property
     * @param value Value to set for the unitOfMeasureId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnitOfMeasureId(@javax.annotation.Nullable final UUID value) {
        this.unitOfMeasureId = value;
    }
    /**
     * Sets the unitPrice property value. The unitPrice property
     * @param value Value to set for the unitPrice property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnitPrice(@javax.annotation.Nullable final BigDecimal value) {
        this.unitPrice = value;
    }
}
