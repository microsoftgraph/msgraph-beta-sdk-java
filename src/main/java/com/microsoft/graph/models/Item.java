package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class Item extends Entity implements Parsable {
    /** The baseUnitOfMeasureId property */
    private UUID baseUnitOfMeasureId;
    /** The blocked property */
    private Boolean blocked;
    /** The displayName property */
    private String displayName;
    /** The gtin property */
    private String gtin;
    /** The inventory property */
    private BigDecimal inventory;
    /** The itemCategory property */
    private ItemCategory itemCategory;
    /** The itemCategoryCode property */
    private String itemCategoryCode;
    /** The itemCategoryId property */
    private UUID itemCategoryId;
    /** The lastModifiedDateTime property */
    private OffsetDateTime lastModifiedDateTime;
    /** The number property */
    private String number;
    /** The picture property */
    private java.util.List<Picture> picture;
    /** The priceIncludesTax property */
    private Boolean priceIncludesTax;
    /** The taxGroupCode property */
    private String taxGroupCode;
    /** The taxGroupId property */
    private UUID taxGroupId;
    /** The type property */
    private String type;
    /** The unitCost property */
    private BigDecimal unitCost;
    /** The unitPrice property */
    private BigDecimal unitPrice;
    /**
     * Instantiates a new Item and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Item() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Item
     */
    @javax.annotation.Nonnull
    public static Item createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Item();
    }
    /**
     * Gets the baseUnitOfMeasureId property value. The baseUnitOfMeasureId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getBaseUnitOfMeasureId() {
        return this.baseUnitOfMeasureId;
    }
    /**
     * Gets the blocked property value. The blocked property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlocked() {
        return this.blocked;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("baseUnitOfMeasureId", (n) -> { this.setBaseUnitOfMeasureId(n.getUUIDValue()); });
        deserializerMap.put("blocked", (n) -> { this.setBlocked(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("gtin", (n) -> { this.setGtin(n.getStringValue()); });
        deserializerMap.put("inventory", (n) -> { this.setInventory(n.getBigDecimalValue()); });
        deserializerMap.put("itemCategory", (n) -> { this.setItemCategory(n.getObjectValue(ItemCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("itemCategoryCode", (n) -> { this.setItemCategoryCode(n.getStringValue()); });
        deserializerMap.put("itemCategoryId", (n) -> { this.setItemCategoryId(n.getUUIDValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("picture", (n) -> { this.setPicture(n.getCollectionOfObjectValues(Picture::createFromDiscriminatorValue)); });
        deserializerMap.put("priceIncludesTax", (n) -> { this.setPriceIncludesTax(n.getBooleanValue()); });
        deserializerMap.put("taxGroupCode", (n) -> { this.setTaxGroupCode(n.getStringValue()); });
        deserializerMap.put("taxGroupId", (n) -> { this.setTaxGroupId(n.getUUIDValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("unitCost", (n) -> { this.setUnitCost(n.getBigDecimalValue()); });
        deserializerMap.put("unitPrice", (n) -> { this.setUnitPrice(n.getBigDecimalValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gtin property value. The gtin property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGtin() {
        return this.gtin;
    }
    /**
     * Gets the inventory property value. The inventory property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getInventory() {
        return this.inventory;
    }
    /**
     * Gets the itemCategory property value. The itemCategory property
     * @return a itemCategory
     */
    @javax.annotation.Nullable
    public ItemCategory getItemCategory() {
        return this.itemCategory;
    }
    /**
     * Gets the itemCategoryCode property value. The itemCategoryCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getItemCategoryCode() {
        return this.itemCategoryCode;
    }
    /**
     * Gets the itemCategoryId property value. The itemCategoryId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getItemCategoryId() {
        return this.itemCategoryId;
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
     * Gets the picture property value. The picture property
     * @return a picture
     */
    @javax.annotation.Nullable
    public java.util.List<Picture> getPicture() {
        return this.picture;
    }
    /**
     * Gets the priceIncludesTax property value. The priceIncludesTax property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPriceIncludesTax() {
        return this.priceIncludesTax;
    }
    /**
     * Gets the taxGroupCode property value. The taxGroupCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTaxGroupCode() {
        return this.taxGroupCode;
    }
    /**
     * Gets the taxGroupId property value. The taxGroupId property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getTaxGroupId() {
        return this.taxGroupId;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the unitCost property value. The unitCost property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getUnitCost() {
        return this.unitCost;
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
        writer.writeUUIDValue("baseUnitOfMeasureId", this.getBaseUnitOfMeasureId());
        writer.writeBooleanValue("blocked", this.getBlocked());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("gtin", this.getGtin());
        writer.writeBigDecimalValue("inventory", this.getInventory());
        writer.writeObjectValue("itemCategory", this.getItemCategory());
        writer.writeStringValue("itemCategoryCode", this.getItemCategoryCode());
        writer.writeUUIDValue("itemCategoryId", this.getItemCategoryId());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("number", this.getNumber());
        writer.writeCollectionOfObjectValues("picture", this.getPicture());
        writer.writeBooleanValue("priceIncludesTax", this.getPriceIncludesTax());
        writer.writeStringValue("taxGroupCode", this.getTaxGroupCode());
        writer.writeUUIDValue("taxGroupId", this.getTaxGroupId());
        writer.writeStringValue("type", this.getType());
        writer.writeBigDecimalValue("unitCost", this.getUnitCost());
        writer.writeBigDecimalValue("unitPrice", this.getUnitPrice());
    }
    /**
     * Sets the baseUnitOfMeasureId property value. The baseUnitOfMeasureId property
     * @param value Value to set for the baseUnitOfMeasureId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBaseUnitOfMeasureId(@javax.annotation.Nullable final UUID value) {
        this.baseUnitOfMeasureId = value;
    }
    /**
     * Sets the blocked property value. The blocked property
     * @param value Value to set for the blocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlocked(@javax.annotation.Nullable final Boolean value) {
        this.blocked = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the gtin property value. The gtin property
     * @param value Value to set for the gtin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGtin(@javax.annotation.Nullable final String value) {
        this.gtin = value;
    }
    /**
     * Sets the inventory property value. The inventory property
     * @param value Value to set for the inventory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInventory(@javax.annotation.Nullable final BigDecimal value) {
        this.inventory = value;
    }
    /**
     * Sets the itemCategory property value. The itemCategory property
     * @param value Value to set for the itemCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemCategory(@javax.annotation.Nullable final ItemCategory value) {
        this.itemCategory = value;
    }
    /**
     * Sets the itemCategoryCode property value. The itemCategoryCode property
     * @param value Value to set for the itemCategoryCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemCategoryCode(@javax.annotation.Nullable final String value) {
        this.itemCategoryCode = value;
    }
    /**
     * Sets the itemCategoryId property value. The itemCategoryId property
     * @param value Value to set for the itemCategoryId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemCategoryId(@javax.annotation.Nullable final UUID value) {
        this.itemCategoryId = value;
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
     * Sets the picture property value. The picture property
     * @param value Value to set for the picture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPicture(@javax.annotation.Nullable final java.util.List<Picture> value) {
        this.picture = value;
    }
    /**
     * Sets the priceIncludesTax property value. The priceIncludesTax property
     * @param value Value to set for the priceIncludesTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriceIncludesTax(@javax.annotation.Nullable final Boolean value) {
        this.priceIncludesTax = value;
    }
    /**
     * Sets the taxGroupCode property value. The taxGroupCode property
     * @param value Value to set for the taxGroupCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaxGroupCode(@javax.annotation.Nullable final String value) {
        this.taxGroupCode = value;
    }
    /**
     * Sets the taxGroupId property value. The taxGroupId property
     * @param value Value to set for the taxGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaxGroupId(@javax.annotation.Nullable final UUID value) {
        this.taxGroupId = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the unitCost property value. The unitCost property
     * @param value Value to set for the unitCost property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnitCost(@javax.annotation.Nullable final BigDecimal value) {
        this.unitCost = value;
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
