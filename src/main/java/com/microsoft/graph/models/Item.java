package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Item implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The baseUnitOfMeasureId property
     */
    private UUID baseUnitOfMeasureId;
    /**
     * The blocked property
     */
    private Boolean blocked;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The gtin property
     */
    private String gtin;
    /**
     * The id property
     */
    private UUID id;
    /**
     * The inventory property
     */
    private BigDecimal inventory;
    /**
     * The itemCategory property
     */
    private ItemCategory itemCategory;
    /**
     * The itemCategoryCode property
     */
    private String itemCategoryCode;
    /**
     * The itemCategoryId property
     */
    private UUID itemCategoryId;
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
     * The picture property
     */
    private java.util.List<Picture> picture;
    /**
     * The priceIncludesTax property
     */
    private Boolean priceIncludesTax;
    /**
     * The taxGroupCode property
     */
    private String taxGroupCode;
    /**
     * The taxGroupId property
     */
    private UUID taxGroupId;
    /**
     * The type property
     */
    private String type;
    /**
     * The unitCost property
     */
    private BigDecimal unitCost;
    /**
     * The unitPrice property
     */
    private BigDecimal unitPrice;
    /**
     * Instantiates a new item and sets the default values.
     */
    public Item() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a item
     */
    @jakarta.annotation.Nonnull
    public static Item createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Item();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the baseUnitOfMeasureId property value. The baseUnitOfMeasureId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getBaseUnitOfMeasureId() {
        return this.baseUnitOfMeasureId;
    }
    /**
     * Gets the blocked property value. The blocked property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlocked() {
        return this.blocked;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("baseUnitOfMeasureId", (n) -> { this.setBaseUnitOfMeasureId(n.getUUIDValue()); });
        deserializerMap.put("blocked", (n) -> { this.setBlocked(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("gtin", (n) -> { this.setGtin(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("inventory", (n) -> { this.setInventory(n.getBigDecimalValue()); });
        deserializerMap.put("itemCategory", (n) -> { this.setItemCategory(n.getObjectValue(ItemCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("itemCategoryCode", (n) -> { this.setItemCategoryCode(n.getStringValue()); });
        deserializerMap.put("itemCategoryId", (n) -> { this.setItemCategoryId(n.getUUIDValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
    @jakarta.annotation.Nullable
    public String getGtin() {
        return this.gtin;
    }
    /**
     * Gets the id property value. The id property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the inventory property value. The inventory property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getInventory() {
        return this.inventory;
    }
    /**
     * Gets the itemCategory property value. The itemCategory property
     * @return a itemCategory
     */
    @jakarta.annotation.Nullable
    public ItemCategory getItemCategory() {
        return this.itemCategory;
    }
    /**
     * Gets the itemCategoryCode property value. The itemCategoryCode property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getItemCategoryCode() {
        return this.itemCategoryCode;
    }
    /**
     * Gets the itemCategoryId property value. The itemCategoryId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getItemCategoryId() {
        return this.itemCategoryId;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the number property value. The number property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the picture property value. The picture property
     * @return a picture
     */
    @jakarta.annotation.Nullable
    public java.util.List<Picture> getPicture() {
        return this.picture;
    }
    /**
     * Gets the priceIncludesTax property value. The priceIncludesTax property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPriceIncludesTax() {
        return this.priceIncludesTax;
    }
    /**
     * Gets the taxGroupCode property value. The taxGroupCode property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTaxGroupCode() {
        return this.taxGroupCode;
    }
    /**
     * Gets the taxGroupId property value. The taxGroupId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getTaxGroupId() {
        return this.taxGroupId;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the unitCost property value. The unitCost property
     * @return a decimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getUnitCost() {
        return this.unitCost;
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
        writer.writeUUIDValue("baseUnitOfMeasureId", this.getBaseUnitOfMeasureId());
        writer.writeBooleanValue("blocked", this.getBlocked());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("gtin", this.getGtin());
        writer.writeUUIDValue("id", this.getId());
        writer.writeBigDecimalValue("inventory", this.getInventory());
        writer.writeObjectValue("itemCategory", this.getItemCategory());
        writer.writeStringValue("itemCategoryCode", this.getItemCategoryCode());
        writer.writeUUIDValue("itemCategoryId", this.getItemCategoryId());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("picture", this.getPicture());
        writer.writeBooleanValue("priceIncludesTax", this.getPriceIncludesTax());
        writer.writeStringValue("taxGroupCode", this.getTaxGroupCode());
        writer.writeUUIDValue("taxGroupId", this.getTaxGroupId());
        writer.writeStringValue("type", this.getType());
        writer.writeBigDecimalValue("unitCost", this.getUnitCost());
        writer.writeBigDecimalValue("unitPrice", this.getUnitPrice());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the baseUnitOfMeasureId property value. The baseUnitOfMeasureId property
     * @param value Value to set for the baseUnitOfMeasureId property.
     */
    public void setBaseUnitOfMeasureId(@jakarta.annotation.Nullable final UUID value) {
        this.baseUnitOfMeasureId = value;
    }
    /**
     * Sets the blocked property value. The blocked property
     * @param value Value to set for the blocked property.
     */
    public void setBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.blocked = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the gtin property value. The gtin property
     * @param value Value to set for the gtin property.
     */
    public void setGtin(@jakarta.annotation.Nullable final String value) {
        this.gtin = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the inventory property value. The inventory property
     * @param value Value to set for the inventory property.
     */
    public void setInventory(@jakarta.annotation.Nullable final BigDecimal value) {
        this.inventory = value;
    }
    /**
     * Sets the itemCategory property value. The itemCategory property
     * @param value Value to set for the itemCategory property.
     */
    public void setItemCategory(@jakarta.annotation.Nullable final ItemCategory value) {
        this.itemCategory = value;
    }
    /**
     * Sets the itemCategoryCode property value. The itemCategoryCode property
     * @param value Value to set for the itemCategoryCode property.
     */
    public void setItemCategoryCode(@jakarta.annotation.Nullable final String value) {
        this.itemCategoryCode = value;
    }
    /**
     * Sets the itemCategoryId property value. The itemCategoryId property
     * @param value Value to set for the itemCategoryId property.
     */
    public void setItemCategoryId(@jakarta.annotation.Nullable final UUID value) {
        this.itemCategoryId = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.number = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the picture property value. The picture property
     * @param value Value to set for the picture property.
     */
    public void setPicture(@jakarta.annotation.Nullable final java.util.List<Picture> value) {
        this.picture = value;
    }
    /**
     * Sets the priceIncludesTax property value. The priceIncludesTax property
     * @param value Value to set for the priceIncludesTax property.
     */
    public void setPriceIncludesTax(@jakarta.annotation.Nullable final Boolean value) {
        this.priceIncludesTax = value;
    }
    /**
     * Sets the taxGroupCode property value. The taxGroupCode property
     * @param value Value to set for the taxGroupCode property.
     */
    public void setTaxGroupCode(@jakarta.annotation.Nullable final String value) {
        this.taxGroupCode = value;
    }
    /**
     * Sets the taxGroupId property value. The taxGroupId property
     * @param value Value to set for the taxGroupId property.
     */
    public void setTaxGroupId(@jakarta.annotation.Nullable final UUID value) {
        this.taxGroupId = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the unitCost property value. The unitCost property
     * @param value Value to set for the unitCost property.
     */
    public void setUnitCost(@jakarta.annotation.Nullable final BigDecimal value) {
        this.unitCost = value;
    }
    /**
     * Sets the unitPrice property value. The unitPrice property
     * @param value Value to set for the unitPrice property.
     */
    public void setUnitPrice(@jakarta.annotation.Nullable final BigDecimal value) {
        this.unitPrice = value;
    }
}
