package com.microsoft.graph.beta.users.item.manageddevices.bulkrestorecloudpc;

import com.microsoft.graph.beta.models.RestoreTimeRange;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BulkRestoreCloudPcPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link BulkRestoreCloudPcPostRequestBody} and sets the default values.
     */
    public BulkRestoreCloudPcPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BulkRestoreCloudPcPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static BulkRestoreCloudPcPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BulkRestoreCloudPcPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("managedDeviceIds", (n) -> { this.setManagedDeviceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("restorePointDateTime", (n) -> { this.setRestorePointDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("timeRange", (n) -> { this.setTimeRange(n.getEnumValue(RestoreTimeRange::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the managedDeviceIds property value. The managedDeviceIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getManagedDeviceIds() {
        return this.backingStore.get("managedDeviceIds");
    }
    /**
     * Gets the restorePointDateTime property value. The restorePointDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRestorePointDateTime() {
        return this.backingStore.get("restorePointDateTime");
    }
    /**
     * Gets the timeRange property value. The timeRange property
     * @return a {@link RestoreTimeRange}
     */
    @jakarta.annotation.Nullable
    public RestoreTimeRange getTimeRange() {
        return this.backingStore.get("timeRange");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("managedDeviceIds", this.getManagedDeviceIds());
        writer.writeOffsetDateTimeValue("restorePointDateTime", this.getRestorePointDateTime());
        writer.writeEnumValue("timeRange", this.getTimeRange());
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
     * Sets the managedDeviceIds property value. The managedDeviceIds property
     * @param value Value to set for the managedDeviceIds property.
     */
    public void setManagedDeviceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("managedDeviceIds", value);
    }
    /**
     * Sets the restorePointDateTime property value. The restorePointDateTime property
     * @param value Value to set for the restorePointDateTime property.
     */
    public void setRestorePointDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("restorePointDateTime", value);
    }
    /**
     * Sets the timeRange property value. The timeRange property
     * @param value Value to set for the timeRange property.
     */
    public void setTimeRange(@jakarta.annotation.Nullable final RestoreTimeRange value) {
        this.backingStore.set("timeRange", value);
    }
}
