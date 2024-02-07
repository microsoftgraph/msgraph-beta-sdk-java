package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics battery health runtime entity contains count of devices broken down into 3 categories - devices with runtime > 5 hours, devices with runtime 3-5 hours and devices with runtime < 3 hours.This API provides the count of devices in these 3 categories.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsBatteryHealthRuntimeDetails extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsBatteryHealthRuntimeDetails and sets the default values.
     */
    public UserExperienceAnalyticsBatteryHealthRuntimeDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsBatteryHealthRuntimeDetails
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthRuntimeDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthRuntimeDetails();
    }
    /**
     * Gets the activeDevices property value. Number of active devices within the tenant. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getActiveDevices() {
        return this.backingStore.get("activeDevices");
    }
    /**
     * Gets the batteryRuntimeFair property value. Number of devices whose active runtime is greater than 3 hours but lesser than 5 hours. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBatteryRuntimeFair() {
        return this.backingStore.get("batteryRuntimeFair");
    }
    /**
     * Gets the batteryRuntimeGood property value. Number of devices  whose active runtime is greater than 5 hours. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBatteryRuntimeGood() {
        return this.backingStore.get("batteryRuntimeGood");
    }
    /**
     * Gets the batteryRuntimePoor property value. Number of devices whose active runtime is lesser than 3 hours. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBatteryRuntimePoor() {
        return this.backingStore.get("batteryRuntimePoor");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDevices", (n) -> { this.setActiveDevices(n.getIntegerValue()); });
        deserializerMap.put("batteryRuntimeFair", (n) -> { this.setBatteryRuntimeFair(n.getIntegerValue()); });
        deserializerMap.put("batteryRuntimeGood", (n) -> { this.setBatteryRuntimeGood(n.getIntegerValue()); });
        deserializerMap.put("batteryRuntimePoor", (n) -> { this.setBatteryRuntimePoor(n.getIntegerValue()); });
        deserializerMap.put("lastRefreshedDateTime", (n) -> { this.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastRefreshedDateTime property value. Recorded date time of this runtime details instance.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this.backingStore.get("lastRefreshedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeDevices", this.getActiveDevices());
        writer.writeIntegerValue("batteryRuntimeFair", this.getBatteryRuntimeFair());
        writer.writeIntegerValue("batteryRuntimeGood", this.getBatteryRuntimeGood());
        writer.writeIntegerValue("batteryRuntimePoor", this.getBatteryRuntimePoor());
        writer.writeOffsetDateTimeValue("lastRefreshedDateTime", this.getLastRefreshedDateTime());
    }
    /**
     * Sets the activeDevices property value. Number of active devices within the tenant. Valid values 0 to 2147483647
     * @param value Value to set for the activeDevices property.
     */
    public void setActiveDevices(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("activeDevices", value);
    }
    /**
     * Sets the batteryRuntimeFair property value. Number of devices whose active runtime is greater than 3 hours but lesser than 5 hours. Valid values 0 to 2147483647
     * @param value Value to set for the batteryRuntimeFair property.
     */
    public void setBatteryRuntimeFair(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("batteryRuntimeFair", value);
    }
    /**
     * Sets the batteryRuntimeGood property value. Number of devices  whose active runtime is greater than 5 hours. Valid values 0 to 2147483647
     * @param value Value to set for the batteryRuntimeGood property.
     */
    public void setBatteryRuntimeGood(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("batteryRuntimeGood", value);
    }
    /**
     * Sets the batteryRuntimePoor property value. Number of devices whose active runtime is lesser than 3 hours. Valid values 0 to 2147483647
     * @param value Value to set for the batteryRuntimePoor property.
     */
    public void setBatteryRuntimePoor(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("batteryRuntimePoor", value);
    }
    /**
     * Sets the lastRefreshedDateTime property value. Recorded date time of this runtime details instance.
     * @param value Value to set for the lastRefreshedDateTime property.
     */
    public void setLastRefreshedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastRefreshedDateTime", value);
    }
}
