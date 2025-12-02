package com.microsoft.graph.beta.models;

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
public class CloudPCUserSettingsPersistenceUsageResult implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudPCUserSettingsPersistenceUsageResult} and sets the default values.
     */
    public CloudPCUserSettingsPersistenceUsageResult() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPCUserSettingsPersistenceUsageResult}
     */
    @jakarta.annotation.Nonnull
    public static CloudPCUserSettingsPersistenceUsageResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPCUserSettingsPersistenceUsageResult();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("remainingAvailableStorageInGB", (n) -> { this.setRemainingAvailableStorageInGB(n.getIntegerValue()); });
        deserializerMap.put("totalAllocatedStorageInGB", (n) -> { this.setTotalAllocatedStorageInGB(n.getIntegerValue()); });
        deserializerMap.put("usedStorageInGB", (n) -> { this.setUsedStorageInGB(n.getIntegerValue()); });
        return deserializerMap;
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
     * Gets the remainingAvailableStorageInGB property value. The remaining available preallocated user settings persistence profile storage for a specific Cloud PC policy assignment. This value equals the total preallocated storage size minus the used preallocated storage size. Required. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRemainingAvailableStorageInGB() {
        return this.backingStore.get("remainingAvailableStorageInGB");
    }
    /**
     * Gets the totalAllocatedStorageInGB property value. The total preallocated user settings persistence profile storage for a specific Cloud PC policy assignment. The system calculates the total size based on the number of licenses assigned to this policy and the size of each Cloud PC disk. Required. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalAllocatedStorageInGB() {
        return this.backingStore.get("totalAllocatedStorageInGB");
    }
    /**
     * Gets the usedStorageInGB property value. The total used preallocated user settings persistence storage for a specific Cloud PC policy assignment. This value represents the total allocated size for users who signed in. Required. Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUsedStorageInGB() {
        return this.backingStore.get("usedStorageInGB");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("remainingAvailableStorageInGB", this.getRemainingAvailableStorageInGB());
        writer.writeIntegerValue("totalAllocatedStorageInGB", this.getTotalAllocatedStorageInGB());
        writer.writeIntegerValue("usedStorageInGB", this.getUsedStorageInGB());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the remainingAvailableStorageInGB property value. The remaining available preallocated user settings persistence profile storage for a specific Cloud PC policy assignment. This value equals the total preallocated storage size minus the used preallocated storage size. Required. Read-only.
     * @param value Value to set for the remainingAvailableStorageInGB property.
     */
    public void setRemainingAvailableStorageInGB(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("remainingAvailableStorageInGB", value);
    }
    /**
     * Sets the totalAllocatedStorageInGB property value. The total preallocated user settings persistence profile storage for a specific Cloud PC policy assignment. The system calculates the total size based on the number of licenses assigned to this policy and the size of each Cloud PC disk. Required. Read-only.
     * @param value Value to set for the totalAllocatedStorageInGB property.
     */
    public void setTotalAllocatedStorageInGB(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalAllocatedStorageInGB", value);
    }
    /**
     * Sets the usedStorageInGB property value. The total used preallocated user settings persistence storage for a specific Cloud PC policy assignment. This value represents the total allocated size for users who signed in. Required. Read-only.
     * @param value Value to set for the usedStorageInGB property.
     */
    public void setUsedStorageInGB(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("usedStorageInGB", value);
    }
}
