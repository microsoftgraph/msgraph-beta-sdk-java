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
public class CloudPcBulkActionSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new CloudPcBulkActionSummary and sets the default values.
     */
    public CloudPcBulkActionSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcBulkActionSummary
     */
    @jakarta.annotation.Nonnull
    public static CloudPcBulkActionSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcBulkActionSummary();
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
     * Gets the failedCount property value. The failedCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedCount() {
        return this.backingStore.get("failedCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("failedCount", (n) -> { this.setFailedCount(n.getIntegerValue()); });
        deserializerMap.put("inProgressCount", (n) -> { this.setInProgressCount(n.getIntegerValue()); });
        deserializerMap.put("notSupportedCount", (n) -> { this.setNotSupportedCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pendingCount", (n) -> { this.setPendingCount(n.getIntegerValue()); });
        deserializerMap.put("successfulCount", (n) -> { this.setSuccessfulCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inProgressCount property value. The inProgressCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInProgressCount() {
        return this.backingStore.get("inProgressCount");
    }
    /**
     * Gets the notSupportedCount property value. The notSupportedCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotSupportedCount() {
        return this.backingStore.get("notSupportedCount");
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
     * Gets the pendingCount property value. The pendingCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPendingCount() {
        return this.backingStore.get("pendingCount");
    }
    /**
     * Gets the successfulCount property value. The successfulCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessfulCount() {
        return this.backingStore.get("successfulCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("failedCount", this.getFailedCount());
        writer.writeIntegerValue("inProgressCount", this.getInProgressCount());
        writer.writeIntegerValue("notSupportedCount", this.getNotSupportedCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("pendingCount", this.getPendingCount());
        writer.writeIntegerValue("successfulCount", this.getSuccessfulCount());
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
     * Sets the failedCount property value. The failedCount property
     * @param value Value to set for the failedCount property.
     */
    public void setFailedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedCount", value);
    }
    /**
     * Sets the inProgressCount property value. The inProgressCount property
     * @param value Value to set for the inProgressCount property.
     */
    public void setInProgressCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("inProgressCount", value);
    }
    /**
     * Sets the notSupportedCount property value. The notSupportedCount property
     * @param value Value to set for the notSupportedCount property.
     */
    public void setNotSupportedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("notSupportedCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the pendingCount property value. The pendingCount property
     * @param value Value to set for the pendingCount property.
     */
    public void setPendingCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("pendingCount", value);
    }
    /**
     * Sets the successfulCount property value. The successfulCount property
     * @param value Value to set for the successfulCount property.
     */
    public void setSuccessfulCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("successfulCount", value);
    }
}
