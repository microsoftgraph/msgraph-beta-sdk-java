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
 * Bandwidth business hours and percentages type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeliveryOptimizationBandwidthBusinessHoursLimit implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new DeliveryOptimizationBandwidthBusinessHoursLimit and sets the default values.
     */
    public DeliveryOptimizationBandwidthBusinessHoursLimit() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeliveryOptimizationBandwidthBusinessHoursLimit
     */
    @jakarta.annotation.Nonnull
    public static DeliveryOptimizationBandwidthBusinessHoursLimit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeliveryOptimizationBandwidthBusinessHoursLimit();
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
     * Gets the bandwidthBeginBusinessHours property value. Specifies the beginning of business hours using a 24-hour clock (0-23). Valid values 0 to 23
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBandwidthBeginBusinessHours() {
        return this.backingStore.get("bandwidthBeginBusinessHours");
    }
    /**
     * Gets the bandwidthEndBusinessHours property value. Specifies the end of business hours using a 24-hour clock (0-23). Valid values 0 to 23
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBandwidthEndBusinessHours() {
        return this.backingStore.get("bandwidthEndBusinessHours");
    }
    /**
     * Gets the bandwidthPercentageDuringBusinessHours property value. Specifies the percentage of bandwidth to limit during business hours (0-100). Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBandwidthPercentageDuringBusinessHours() {
        return this.backingStore.get("bandwidthPercentageDuringBusinessHours");
    }
    /**
     * Gets the bandwidthPercentageOutsideBusinessHours property value. Specifies the percentage of bandwidth to limit outsidse business hours (0-100). Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBandwidthPercentageOutsideBusinessHours() {
        return this.backingStore.get("bandwidthPercentageOutsideBusinessHours");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("bandwidthBeginBusinessHours", (n) -> { this.setBandwidthBeginBusinessHours(n.getIntegerValue()); });
        deserializerMap.put("bandwidthEndBusinessHours", (n) -> { this.setBandwidthEndBusinessHours(n.getIntegerValue()); });
        deserializerMap.put("bandwidthPercentageDuringBusinessHours", (n) -> { this.setBandwidthPercentageDuringBusinessHours(n.getIntegerValue()); });
        deserializerMap.put("bandwidthPercentageOutsideBusinessHours", (n) -> { this.setBandwidthPercentageOutsideBusinessHours(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("bandwidthBeginBusinessHours", this.getBandwidthBeginBusinessHours());
        writer.writeIntegerValue("bandwidthEndBusinessHours", this.getBandwidthEndBusinessHours());
        writer.writeIntegerValue("bandwidthPercentageDuringBusinessHours", this.getBandwidthPercentageDuringBusinessHours());
        writer.writeIntegerValue("bandwidthPercentageOutsideBusinessHours", this.getBandwidthPercentageOutsideBusinessHours());
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
     * Sets the bandwidthBeginBusinessHours property value. Specifies the beginning of business hours using a 24-hour clock (0-23). Valid values 0 to 23
     * @param value Value to set for the bandwidthBeginBusinessHours property.
     */
    public void setBandwidthBeginBusinessHours(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("bandwidthBeginBusinessHours", value);
    }
    /**
     * Sets the bandwidthEndBusinessHours property value. Specifies the end of business hours using a 24-hour clock (0-23). Valid values 0 to 23
     * @param value Value to set for the bandwidthEndBusinessHours property.
     */
    public void setBandwidthEndBusinessHours(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("bandwidthEndBusinessHours", value);
    }
    /**
     * Sets the bandwidthPercentageDuringBusinessHours property value. Specifies the percentage of bandwidth to limit during business hours (0-100). Valid values 0 to 100
     * @param value Value to set for the bandwidthPercentageDuringBusinessHours property.
     */
    public void setBandwidthPercentageDuringBusinessHours(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("bandwidthPercentageDuringBusinessHours", value);
    }
    /**
     * Sets the bandwidthPercentageOutsideBusinessHours property value. Specifies the percentage of bandwidth to limit outsidse business hours (0-100). Valid values 0 to 100
     * @param value Value to set for the bandwidthPercentageOutsideBusinessHours property.
     */
    public void setBandwidthPercentageOutsideBusinessHours(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("bandwidthPercentageOutsideBusinessHours", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
