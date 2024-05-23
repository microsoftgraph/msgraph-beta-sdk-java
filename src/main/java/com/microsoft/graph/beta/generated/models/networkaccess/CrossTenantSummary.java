package com.microsoft.graph.beta.models.networkaccess;

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
public class CrossTenantSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CrossTenantSummary} and sets the default values.
     */
    public CrossTenantSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CrossTenantSummary}
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantSummary();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the authTransactionCount property value. The total number of authentication sessions between startDateTime and endDateTime.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAuthTransactionCount() {
        return this.backingStore.get("authTransactionCount");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the deviceCount property value. The number of unique devices that performed cross-tenant access.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceCount() {
        return this.backingStore.get("deviceCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("authTransactionCount", (n) -> { this.setAuthTransactionCount(n.getIntegerValue()); });
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("newTenantCount", (n) -> { this.setNewTenantCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("rarelyUsedTenantCount", (n) -> { this.setRarelyUsedTenantCount(n.getIntegerValue()); });
        deserializerMap.put("tenantCount", (n) -> { this.setTenantCount(n.getIntegerValue()); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the newTenantCount property value. The number of unique tenants that were accessed between endDateTime and discoveryPivotDateTime, but weren't accessed between discoveryPivotDateTime and startDateTime.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNewTenantCount() {
        return this.backingStore.get("newTenantCount");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the rarelyUsedTenantCount property value. The number of tenants that are rarely used.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRarelyUsedTenantCount() {
        return this.backingStore.get("rarelyUsedTenantCount");
    }
    /**
     * Gets the tenantCount property value. The number of unique tenants that were accessed, not including the device's tenant.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTenantCount() {
        return this.backingStore.get("tenantCount");
    }
    /**
     * Gets the userCount property value. The number of unique users that performed cross-tenant access.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUserCount() {
        return this.backingStore.get("userCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("authTransactionCount", this.getAuthTransactionCount());
        writer.writeIntegerValue("deviceCount", this.getDeviceCount());
        writer.writeIntegerValue("newTenantCount", this.getNewTenantCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("rarelyUsedTenantCount", this.getRarelyUsedTenantCount());
        writer.writeIntegerValue("tenantCount", this.getTenantCount());
        writer.writeIntegerValue("userCount", this.getUserCount());
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
     * Sets the authTransactionCount property value. The total number of authentication sessions between startDateTime and endDateTime.
     * @param value Value to set for the authTransactionCount property.
     */
    public void setAuthTransactionCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("authTransactionCount", value);
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
     * Sets the deviceCount property value. The number of unique devices that performed cross-tenant access.
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deviceCount", value);
    }
    /**
     * Sets the newTenantCount property value. The number of unique tenants that were accessed between endDateTime and discoveryPivotDateTime, but weren't accessed between discoveryPivotDateTime and startDateTime.
     * @param value Value to set for the newTenantCount property.
     */
    public void setNewTenantCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("newTenantCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the rarelyUsedTenantCount property value. The number of tenants that are rarely used.
     * @param value Value to set for the rarelyUsedTenantCount property.
     */
    public void setRarelyUsedTenantCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("rarelyUsedTenantCount", value);
    }
    /**
     * Sets the tenantCount property value. The number of unique tenants that were accessed, not including the device's tenant.
     * @param value Value to set for the tenantCount property.
     */
    public void setTenantCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("tenantCount", value);
    }
    /**
     * Sets the userCount property value. The number of unique users that performed cross-tenant access.
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("userCount", value);
    }
}
