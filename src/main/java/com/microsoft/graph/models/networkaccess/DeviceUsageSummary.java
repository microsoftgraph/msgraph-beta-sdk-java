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
public class DeviceUsageSummary implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new DeviceUsageSummary and sets the default values.
     */
    public DeviceUsageSummary() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceUsageSummary
     */
    @jakarta.annotation.Nonnull
    public static DeviceUsageSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceUsageSummary();
    }
    /**
     * Gets the activeDeviceCount property value. The number of distinct device IDs between the discovery pivot time and the end of the reporting period.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getActiveDeviceCount() {
        return this.backingStore.get("activeDeviceCount");
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("activeDeviceCount", (n) -> { this.setActiveDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("inactiveDeviceCount", (n) -> { this.setInactiveDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("totalDeviceCount", (n) -> { this.setTotalDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inactiveDeviceCount property value. The discovery pivot time and the end of the reporting period, but were seen between the start of the reporting period and the discovery pivot time.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInactiveDeviceCount() {
        return this.backingStore.get("inactiveDeviceCount");
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
     * Gets the totalDeviceCount property value. The total number of distinct device IDs that were seen during the reporting period.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalDeviceCount() {
        return this.backingStore.get("totalDeviceCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("activeDeviceCount", this.getActiveDeviceCount());
        writer.writeIntegerValue("inactiveDeviceCount", this.getInactiveDeviceCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("totalDeviceCount", this.getTotalDeviceCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activeDeviceCount property value. The number of distinct device IDs between the discovery pivot time and the end of the reporting period.
     * @param value Value to set for the activeDeviceCount property.
     */
    public void setActiveDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("activeDeviceCount", value);
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
     * Sets the inactiveDeviceCount property value. The discovery pivot time and the end of the reporting period, but were seen between the start of the reporting period and the discovery pivot time.
     * @param value Value to set for the inactiveDeviceCount property.
     */
    public void setInactiveDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("inactiveDeviceCount", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the totalDeviceCount property value. The total number of distinct device IDs that were seen during the reporting period.
     * @param value Value to set for the totalDeviceCount property.
     */
    public void setTotalDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalDeviceCount", value);
    }
}
