package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    private Decimal amountExcludingTax;
    /**
     * The amountIncludingTax property
     */
    private Decimal amountIncludingTax;
    /**
     * The description property
     */
    private String description;
    /**
     * The discountAmount property
     */
    private Decimal discountAmount;
    /**
     * The discountAppliedBeforeTax property
     */
    private Boolean discountAppliedBeforeTax;
    /**
     * The discountPercent property
     */
    private Decimal discountPercent;
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
    private Decimal netAmount;
    /**
     * The netAmountIncludingTax property
     */
    private Decimal netAmountIncludingTax;
    /**
     * The netTaxAmount property
     */
    private Decimal netTaxAmount;
    /**
     * The quantity property
     */
    private Decimal quantity;
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
    private Decimal taxPercent;
    /**
     * The totalTaxAmount property
     */
    private Decimal totalTaxAmount;
    /**
     * The unitOfMeasureId property
     */
    private UUID unitOfMeasureId;
    /**
     * The unitPrice property
     */
    private Decimal unitPrice;
    /**
     * Instantiates a new SalesQuoteLine and sets the default values.
     */
    public SalesQuoteLine() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SalesQuoteLine
     */
    @jakarta.annotation.Nonnull
    public static SalesQuoteLine createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SalesQuoteLine();
    }
    /**
     * Gets the account property value. The account property
     * @return a Account
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
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getAmountExcludingTax() {
        return this.amountExcludingTax;
    }
    /**
     * Gets the amountIncludingTax property value. The amountIncludingTax property
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getAmountIncludingTax() {
        return this.amountIncludingTax;
    }
    /**
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the discountAmount property value. The discountAmount property
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getDiscountAmount() {
        return this.discountAmount;
    }
    /**
     * Gets the discountAppliedBeforeTax property value. The discountAppliedBeforeTax property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDiscountAppliedBeforeTax() {
        return this.discountAppliedBeforeTax;
    }
    /**
     * Gets the discountPercent property value. The discountPercent property
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getDiscountPercent() {
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
        deserializerMap.put("amountExcludingTax", (n) -> { this.setAmountExcludingTax(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("amountIncludingTax", (n) -> { this.setAmountIncludingTax(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("discountAmount", (n) -> { this.setDiscountAmount(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("discountAppliedBeforeTax", (n) -> { this.setDiscountAppliedBeforeTax(n.getBooleanValue()); });
        deserializerMap.put("discountPercent", (n) -> { this.setDiscountPercent(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("documentId", (n) -> { this.setDocumentId(n.getUUIDValue()); });
        deserializerMap.put("item", (n) -> { this.setItem(n.getObjectValue(Item::createFromDiscriminatorValue)); });
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getUUIDValue()); });
        deserializerMap.put("lineType", (n) -> { this.setLineType(n.getStringValue()); });
        deserializerMap.put("netAmount", (n) -> { this.setNetAmount(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("netAmountIncludingTax", (n) -> { this.setNetAmountIncludingTax(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("netTaxAmount", (n) -> { this.setNetTaxAmount(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("quantity", (n) -> { this.setQuantity(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("sequence", (n) -> { this.setSequence(n.getIntegerValue()); });
        deserializerMap.put("taxCode", (n) -> { this.setTaxCode(n.getStringValue()); });
        deserializerMap.put("taxPercent", (n) -> { this.setTaxPercent(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("totalTaxAmount", (n) -> { this.setTotalTaxAmount(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        deserializerMap.put("unitOfMeasureId", (n) -> { this.setUnitOfMeasureId(n.getUUIDValue()); });
        deserializerMap.put("unitPrice", (n) -> { this.setUnitPrice(n.getObjectValue(Decimal::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the item property value. The item property
     * @return a Item
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLineType() {
        return this.lineType;
    }
    /**
     * Gets the netAmount property value. The netAmount property
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getNetAmount() {
        return this.netAmount;
    }
    /**
     * Gets the netAmountIncludingTax property value. The netAmountIncludingTax property
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getNetAmountIncludingTax() {
        return this.netAmountIncludingTax;
    }
    /**
     * Gets the netTaxAmount property value. The netTaxAmount property
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getNetTaxAmount() {
        return this.netTaxAmount;
    }
    /**
     * Gets the quantity property value. The quantity property
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getQuantity() {
        return this.quantity;
    }
    /**
     * Gets the sequence property value. The sequence property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSequence() {
        return this.sequence;
    }
    /**
     * Gets the taxCode property value. The taxCode property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTaxCode() {
        return this.taxCode;
    }
    /**
     * Gets the taxPercent property value. The taxPercent property
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getTaxPercent() {
        return this.taxPercent;
    }
    /**
     * Gets the totalTaxAmount property value. The totalTaxAmount property
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getTotalTaxAmount() {
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
     * @return a Decimal
     */
    @jakarta.annotation.Nullable
    public Decimal getUnitPrice() {
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
        writer.writeObjectValue("amountExcludingTax", this.getAmountExcludingTax());
        writer.writeObjectValue("amountIncludingTax", this.getAmountIncludingTax());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("discountAmount", this.getDiscountAmount());
        writer.writeBooleanValue("discountAppliedBeforeTax", this.getDiscountAppliedBeforeTax());
        writer.writeObjectValue("discountPercent", this.getDiscountPercent());
        writer.writeUUIDValue("documentId", this.getDocumentId());
        writer.writeObjectValue("item", this.getItem());
        writer.writeUUIDValue("itemId", this.getItemId());
        writer.writeStringValue("lineType", this.getLineType());
        writer.writeObjectValue("netAmount", this.getNetAmount());
        writer.writeObjectValue("netAmountIncludingTax", this.getNetAmountIncludingTax());
        writer.writeObjectValue("netTaxAmount", this.getNetTaxAmount());
        writer.writeObjectValue("quantity", this.getQuantity());
        writer.writeIntegerValue("sequence", this.getSequence());
        writer.writeStringValue("taxCode", this.getTaxCode());
        writer.writeObjectValue("taxPercent", this.getTaxPercent());
        writer.writeObjectValue("totalTaxAmount", this.getTotalTaxAmount());
        writer.writeUUIDValue("unitOfMeasureId", this.getUnitOfMeasureId());
        writer.writeObjectValue("unitPrice", this.getUnitPrice());
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
    public void setAmountExcludingTax(@jakarta.annotation.Nullable final Decimal value) {
        this.amountExcludingTax = value;
    }
    /**
     * Sets the amountIncludingTax property value. The amountIncludingTax property
     * @param value Value to set for the amountIncludingTax property.
     */
    public void setAmountIncludingTax(@jakarta.annotation.Nullable final Decimal value) {
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
    public void setDiscountAmount(@jakarta.annotation.Nullable final Decimal value) {
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
    public void setDiscountPercent(@jakarta.annotation.Nullable final Decimal value) {
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
    public void setNetAmount(@jakarta.annotation.Nullable final Decimal value) {
        this.netAmount = value;
    }
    /**
     * Sets the netAmountIncludingTax property value. The netAmountIncludingTax property
     * @param value Value to set for the netAmountIncludingTax property.
     */
    public void setNetAmountIncludingTax(@jakarta.annotation.Nullable final Decimal value) {
        this.netAmountIncludingTax = value;
    }
    /**
     * Sets the netTaxAmount property value. The netTaxAmount property
     * @param value Value to set for the netTaxAmount property.
     */
    public void setNetTaxAmount(@jakarta.annotation.Nullable final Decimal value) {
        this.netTaxAmount = value;
    }
    /**
     * Sets the quantity property value. The quantity property
     * @param value Value to set for the quantity property.
     */
    public void setQuantity(@jakarta.annotation.Nullable final Decimal value) {
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
    public void setTaxPercent(@jakarta.annotation.Nullable final Decimal value) {
        this.taxPercent = value;
    }
    /**
     * Sets the totalTaxAmount property value. The totalTaxAmount property
     * @param value Value to set for the totalTaxAmount property.
     */
    public void setTotalTaxAmount(@jakarta.annotation.Nullable final Decimal value) {
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
    public void setUnitPrice(@jakarta.annotation.Nullable final Decimal value) {
        this.unitPrice = value;
    }
}
