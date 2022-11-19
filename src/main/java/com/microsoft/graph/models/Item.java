package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class Item extends Entity implements Parsable {
    /** The baseUnitOfMeasureId property */
    private String _baseUnitOfMeasureId;
    /** The blocked property */
    private Boolean _blocked;
    /** The displayName property */
    private String _displayName;
    /** The gtin property */
    private String _gtin;
    /** The inventory property */
    private BigDecimal _inventory;
    /** The itemCategory property */
    private ItemCategory _itemCategory;
    /** The itemCategoryCode property */
    private String _itemCategoryCode;
    /** The itemCategoryId property */
    private String _itemCategoryId;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The number property */
    private String _number;
    /** The picture property */
    private java.util.List<Picture> _picture;
    /** The priceIncludesTax property */
    private Boolean _priceIncludesTax;
    /** The taxGroupCode property */
    private String _taxGroupCode;
    /** The taxGroupId property */
    private String _taxGroupId;
    /** The type property */
    private String _type;
    /** The unitCost property */
    private BigDecimal _unitCost;
    /** The unitPrice property */
    private BigDecimal _unitPrice;
    /**
     * Instantiates a new item and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Item() {
        super();
        this.setOdataType("#microsoft.graph.item");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a item
     */
    @javax.annotation.Nonnull
    public static Item createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Item();
    }
    /**
     * Gets the baseUnitOfMeasureId property value. The baseUnitOfMeasureId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBaseUnitOfMeasureId() {
        return this._baseUnitOfMeasureId;
    }
    /**
     * Gets the blocked property value. The blocked property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlocked() {
        return this._blocked;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Item currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("baseUnitOfMeasureId", (n) -> { currentObject.setBaseUnitOfMeasureId(n.getStringValue()); });
        deserializerMap.put("blocked", (n) -> { currentObject.setBlocked(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("gtin", (n) -> { currentObject.setGtin(n.getStringValue()); });
        deserializerMap.put("inventory", (n) -> { currentObject.setInventory(n.getBigDecimalValue()); });
        deserializerMap.put("itemCategory", (n) -> { currentObject.setItemCategory(n.getObjectValue(ItemCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("itemCategoryCode", (n) -> { currentObject.setItemCategoryCode(n.getStringValue()); });
        deserializerMap.put("itemCategoryId", (n) -> { currentObject.setItemCategoryId(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("number", (n) -> { currentObject.setNumber(n.getStringValue()); });
        deserializerMap.put("picture", (n) -> { currentObject.setPicture(n.getCollectionOfObjectValues(Picture::createFromDiscriminatorValue)); });
        deserializerMap.put("priceIncludesTax", (n) -> { currentObject.setPriceIncludesTax(n.getBooleanValue()); });
        deserializerMap.put("taxGroupCode", (n) -> { currentObject.setTaxGroupCode(n.getStringValue()); });
        deserializerMap.put("taxGroupId", (n) -> { currentObject.setTaxGroupId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        deserializerMap.put("unitCost", (n) -> { currentObject.setUnitCost(n.getBigDecimalValue()); });
        deserializerMap.put("unitPrice", (n) -> { currentObject.setUnitPrice(n.getBigDecimalValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gtin property value. The gtin property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGtin() {
        return this._gtin;
    }
    /**
     * Gets the inventory property value. The inventory property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getInventory() {
        return this._inventory;
    }
    /**
     * Gets the itemCategory property value. The itemCategory property
     * @return a itemCategory
     */
    @javax.annotation.Nullable
    public ItemCategory getItemCategory() {
        return this._itemCategory;
    }
    /**
     * Gets the itemCategoryCode property value. The itemCategoryCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getItemCategoryCode() {
        return this._itemCategoryCode;
    }
    /**
     * Gets the itemCategoryId property value. The itemCategoryId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getItemCategoryId() {
        return this._itemCategoryId;
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
     * Gets the picture property value. The picture property
     * @return a picture
     */
    @javax.annotation.Nullable
    public java.util.List<Picture> getPicture() {
        return this._picture;
    }
    /**
     * Gets the priceIncludesTax property value. The priceIncludesTax property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPriceIncludesTax() {
        return this._priceIncludesTax;
    }
    /**
     * Gets the taxGroupCode property value. The taxGroupCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTaxGroupCode() {
        return this._taxGroupCode;
    }
    /**
     * Gets the taxGroupId property value. The taxGroupId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTaxGroupId() {
        return this._taxGroupId;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Gets the unitCost property value. The unitCost property
     * @return a decimal
     */
    @javax.annotation.Nullable
    public BigDecimal getUnitCost() {
        return this._unitCost;
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
        writer.writeStringValue("baseUnitOfMeasureId", this.getBaseUnitOfMeasureId());
        writer.writeBooleanValue("blocked", this.getBlocked());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("gtin", this.getGtin());
        writer.writeBigDecimalValue("inventory", this.getInventory());
        writer.writeObjectValue("itemCategory", this.getItemCategory());
        writer.writeStringValue("itemCategoryCode", this.getItemCategoryCode());
        writer.writeStringValue("itemCategoryId", this.getItemCategoryId());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("number", this.getNumber());
        writer.writeCollectionOfObjectValues("picture", this.getPicture());
        writer.writeBooleanValue("priceIncludesTax", this.getPriceIncludesTax());
        writer.writeStringValue("taxGroupCode", this.getTaxGroupCode());
        writer.writeStringValue("taxGroupId", this.getTaxGroupId());
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
    public void setBaseUnitOfMeasureId(@javax.annotation.Nullable final String value) {
        this._baseUnitOfMeasureId = value;
    }
    /**
     * Sets the blocked property value. The blocked property
     * @param value Value to set for the blocked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBlocked(@javax.annotation.Nullable final Boolean value) {
        this._blocked = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the gtin property value. The gtin property
     * @param value Value to set for the gtin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGtin(@javax.annotation.Nullable final String value) {
        this._gtin = value;
    }
    /**
     * Sets the inventory property value. The inventory property
     * @param value Value to set for the inventory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInventory(@javax.annotation.Nullable final BigDecimal value) {
        this._inventory = value;
    }
    /**
     * Sets the itemCategory property value. The itemCategory property
     * @param value Value to set for the itemCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemCategory(@javax.annotation.Nullable final ItemCategory value) {
        this._itemCategory = value;
    }
    /**
     * Sets the itemCategoryCode property value. The itemCategoryCode property
     * @param value Value to set for the itemCategoryCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemCategoryCode(@javax.annotation.Nullable final String value) {
        this._itemCategoryCode = value;
    }
    /**
     * Sets the itemCategoryId property value. The itemCategoryId property
     * @param value Value to set for the itemCategoryId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setItemCategoryId(@javax.annotation.Nullable final String value) {
        this._itemCategoryId = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumber(@javax.annotation.Nullable final String value) {
        this._number = value;
    }
    /**
     * Sets the picture property value. The picture property
     * @param value Value to set for the picture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPicture(@javax.annotation.Nullable final java.util.List<Picture> value) {
        this._picture = value;
    }
    /**
     * Sets the priceIncludesTax property value. The priceIncludesTax property
     * @param value Value to set for the priceIncludesTax property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriceIncludesTax(@javax.annotation.Nullable final Boolean value) {
        this._priceIncludesTax = value;
    }
    /**
     * Sets the taxGroupCode property value. The taxGroupCode property
     * @param value Value to set for the taxGroupCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaxGroupCode(@javax.annotation.Nullable final String value) {
        this._taxGroupCode = value;
    }
    /**
     * Sets the taxGroupId property value. The taxGroupId property
     * @param value Value to set for the taxGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTaxGroupId(@javax.annotation.Nullable final String value) {
        this._taxGroupId = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
    /**
     * Sets the unitCost property value. The unitCost property
     * @param value Value to set for the unitCost property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnitCost(@javax.annotation.Nullable final BigDecimal value) {
        this._unitCost = value;
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
