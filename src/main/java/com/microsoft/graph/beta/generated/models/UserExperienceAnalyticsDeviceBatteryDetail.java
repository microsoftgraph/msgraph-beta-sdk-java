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
/**
 * Collection of properties describing the current status of the battery.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsDeviceBatteryDetail implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link UserExperienceAnalyticsDeviceBatteryDetail} and sets the default values.
     */
    public UserExperienceAnalyticsDeviceBatteryDetail() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserExperienceAnalyticsDeviceBatteryDetail}
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceBatteryDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceBatteryDetail();
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
     * Gets the batteryId property value. Uniquely identifies the batteries in a single device.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBatteryId() {
        return this.backingStore.get("batteryId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("batteryId", (n) -> { this.setBatteryId(n.getStringValue()); });
        deserializerMap.put("fullBatteryDrainCount", (n) -> { this.setFullBatteryDrainCount(n.getIntegerValue()); });
        deserializerMap.put("maxCapacityPercentage", (n) -> { this.setMaxCapacityPercentage(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fullBatteryDrainCount property value. Number of times the battery has been discharged an amount that equals 100% of its capacity, but not necessarily by discharging it from 100% to 0%. Valid values 0 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFullBatteryDrainCount() {
        return this.backingStore.get("fullBatteryDrainCount");
    }
    /**
     * Gets the maxCapacityPercentage property value. Ratio of current capacity and design capacity of the battery. Unit in percentage and values range from 0-100. Valid values 0 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxCapacityPercentage() {
        return this.backingStore.get("maxCapacityPercentage");
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("batteryId", this.getBatteryId());
        writer.writeIntegerValue("fullBatteryDrainCount", this.getFullBatteryDrainCount());
        writer.writeIntegerValue("maxCapacityPercentage", this.getMaxCapacityPercentage());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the batteryId property value. Uniquely identifies the batteries in a single device.
     * @param value Value to set for the batteryId property.
     */
    public void setBatteryId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("batteryId", value);
    }
    /**
     * Sets the fullBatteryDrainCount property value. Number of times the battery has been discharged an amount that equals 100% of its capacity, but not necessarily by discharging it from 100% to 0%. Valid values 0 to 2147483647
     * @param value Value to set for the fullBatteryDrainCount property.
     */
    public void setFullBatteryDrainCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("fullBatteryDrainCount", value);
    }
    /**
     * Sets the maxCapacityPercentage property value. Ratio of current capacity and design capacity of the battery. Unit in percentage and values range from 0-100. Valid values 0 to 2147483647
     * @param value Value to set for the maxCapacityPercentage property.
     */
    public void setMaxCapacityPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maxCapacityPercentage", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
