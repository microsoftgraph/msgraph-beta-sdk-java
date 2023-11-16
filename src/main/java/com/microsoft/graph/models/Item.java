package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Item implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    private BackingStore BackingStore;
    /**
     * Instantiates a new Item and sets the default values.
     */
    public Item() {
        this.BackingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Item
     */
    @jakarta.annotation.Nonnull
    public static Item createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Item();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.BackingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the BackingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.BackingStore;
    }
    /**
     * Gets the baseUnitOfMeasureId property value. The baseUnitOfMeasureId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getBaseUnitOfMeasureId() {
        return this.BackingStore.get("baseUnitOfMeasureId");
    }
    /**
     * Gets the blocked property value. The blocked property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlocked() {
        return this.BackingStore.get("blocked");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGtin() {
        return this.BackingStore.get("gtin");
    }
    /**
     * Gets the id property value. The id property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.BackingStore.get("id");
    }
    /**
     * Gets the inventory property value. The inventory property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getInventory() {
        return this.BackingStore.get("inventory");
    }
    /**
     * Gets the itemCategory property value. The itemCategory property
     * @return a ItemCategory
     */
    @jakarta.annotation.Nullable
    public ItemCategory getItemCategory() {
        return this.BackingStore.get("itemCategory");
    }
    /**
     * Gets the itemCategoryCode property value. The itemCategoryCode property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getItemCategoryCode() {
        return this.BackingStore.get("itemCategoryCode");
    }
    /**
     * Gets the itemCategoryId property value. The itemCategoryId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getItemCategoryId() {
        return this.BackingStore.get("itemCategoryId");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the number property value. The number property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.BackingStore.get("number");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.BackingStore.get("odataType");
    }
    /**
     * Gets the picture property value. The picture property
     * @return a java.util.List<Picture>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Picture> getPicture() {
        return this.BackingStore.get("picture");
    }
    /**
     * Gets the priceIncludesTax property value. The priceIncludesTax property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPriceIncludesTax() {
        return this.BackingStore.get("priceIncludesTax");
    }
    /**
     * Gets the taxGroupCode property value. The taxGroupCode property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTaxGroupCode() {
        return this.BackingStore.get("taxGroupCode");
    }
    /**
     * Gets the taxGroupId property value. The taxGroupId property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getTaxGroupId() {
        return this.BackingStore.get("taxGroupId");
    }
    /**
     * Gets the type property value. The type property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.BackingStore.get("type");
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
     * Gets the unitPrice property value. The unitPrice property
     * @return a BigDecimal
     */
    @jakarta.annotation.Nullable
    public BigDecimal getUnitPrice() {
        return this.BackingStore.get("unitPrice");
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.BackingStore.set("additionalData", value);
    }
    /**
     * Sets the BackingStore property value. Stores model information.
     * @param value Value to set for the BackingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.BackingStore = value;
    }
    /**
     * Sets the baseUnitOfMeasureId property value. The baseUnitOfMeasureId property
     * @param value Value to set for the baseUnitOfMeasureId property.
     */
    public void setBaseUnitOfMeasureId(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("baseUnitOfMeasureId", value);
    }
    /**
     * Sets the blocked property value. The blocked property
     * @param value Value to set for the blocked property.
     */
    public void setBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("blocked", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the gtin property value. The gtin property
     * @param value Value to set for the gtin property.
     */
    public void setGtin(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("gtin", value);
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("id", value);
    }
    /**
     * Sets the inventory property value. The inventory property
     * @param value Value to set for the inventory property.
     */
    public void setInventory(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("inventory", value);
    }
    /**
     * Sets the itemCategory property value. The itemCategory property
     * @param value Value to set for the itemCategory property.
     */
    public void setItemCategory(@jakarta.annotation.Nullable final ItemCategory value) {
        this.BackingStore.set("itemCategory", value);
    }
    /**
     * Sets the itemCategoryCode property value. The itemCategoryCode property
     * @param value Value to set for the itemCategoryCode property.
     */
    public void setItemCategoryCode(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("itemCategoryCode", value);
    }
    /**
     * Sets the itemCategoryId property value. The itemCategoryId property
     * @param value Value to set for the itemCategoryId property.
     */
    public void setItemCategoryId(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("itemCategoryId", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("number", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("odataType", value);
    }
    /**
     * Sets the picture property value. The picture property
     * @param value Value to set for the picture property.
     */
    public void setPicture(@jakarta.annotation.Nullable final java.util.List<Picture> value) {
        this.BackingStore.set("picture", value);
    }
    /**
     * Sets the priceIncludesTax property value. The priceIncludesTax property
     * @param value Value to set for the priceIncludesTax property.
     */
    public void setPriceIncludesTax(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("priceIncludesTax", value);
    }
    /**
     * Sets the taxGroupCode property value. The taxGroupCode property
     * @param value Value to set for the taxGroupCode property.
     */
    public void setTaxGroupCode(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("taxGroupCode", value);
    }
    /**
     * Sets the taxGroupId property value. The taxGroupId property
     * @param value Value to set for the taxGroupId property.
     */
    public void setTaxGroupId(@jakarta.annotation.Nullable final UUID value) {
        this.BackingStore.set("taxGroupId", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("type", value);
    }
    /**
     * Sets the unitCost property value. The unitCost property
     * @param value Value to set for the unitCost property.
     */
    public void setUnitCost(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("unitCost", value);
    }
    /**
     * Sets the unitPrice property value. The unitPrice property
     * @param value Value to set for the unitPrice property.
     */
    public void setUnitPrice(@jakarta.annotation.Nullable final BigDecimal value) {
        this.BackingStore.set("unitPrice", value);
    }
}
