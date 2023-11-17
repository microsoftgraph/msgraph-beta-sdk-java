package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WebCategoriesSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new WebCategoriesSummary and sets the default values.
     */
    public WebCategoriesSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WebCategoriesSummary
     */
    @jakarta.annotation.Nonnull
    public static WebCategoriesSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebCategoriesSummary();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the deviceCount property value. The number of unique devices that were seen.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDeviceCount() {
        return this.backingStore.get("deviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getLongValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("transactionCount", (n) -> { this.setTransactionCount(n.getLongValue()); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getLongValue()); });
        deserializerMap.put("webCategory", (n) -> { this.setWebCategory(n.getObjectValue(WebCategory::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the transactionCount property value. The number of transactions that were seen.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTransactionCount() {
        return this.backingStore.get("transactionCount");
    }
    /**
     * Gets the userCount property value. The number of unique Microsoft Entra ID users that were seen.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getUserCount() {
        return this.backingStore.get("userCount");
    }
    /**
     * Gets the webCategory property value. The webCategory property
     * @return a WebCategory
     */
    @jakarta.annotation.Nullable
    public WebCategory getWebCategory() {
        return this.backingStore.get("webCategory");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("deviceCount", this.getDeviceCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLongValue("transactionCount", this.getTransactionCount());
        writer.writeLongValue("userCount", this.getUserCount());
        writer.writeObjectValue("webCategory", this.getWebCategory());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the deviceCount property value. The number of unique devices that were seen.
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("deviceCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the transactionCount property value. The number of transactions that were seen.
     * @param value Value to set for the transactionCount property.
     */
    public void setTransactionCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("transactionCount", value);
    }
    /**
     * Sets the userCount property value. The number of unique Microsoft Entra ID users that were seen.
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("userCount", value);
    }
    /**
     * Sets the webCategory property value. The webCategory property
     * @param value Value to set for the webCategory property.
     */
    public void setWebCategory(@jakarta.annotation.Nullable final WebCategory value) {
        this.backingStore.set("webCategory", value);
    }
}
