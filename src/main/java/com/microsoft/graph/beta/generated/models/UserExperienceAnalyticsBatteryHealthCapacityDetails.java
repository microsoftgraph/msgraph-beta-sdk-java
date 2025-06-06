package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics battery health capacity entity contains count of devices broken down into 3 categories - devices with capacity &gt; 80%, devices with capacity 50-80% and devices with capacity &lt; 50 %.This API provides the count of devices in these 3 categories..
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsBatteryHealthCapacityDetails extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserExperienceAnalyticsBatteryHealthCapacityDetails} and sets the default values.
     */
    public UserExperienceAnalyticsBatteryHealthCapacityDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserExperienceAnalyticsBatteryHealthCapacityDetails}
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthCapacityDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthCapacityDetails();
    }
    /**
     * Gets the activeDevices property value. Number of active devices within the tenant. Valid values 0 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getActiveDevices() {
        return this.backingStore.get("activeDevices");
    }
    /**
     * Gets the batteryCapacityFair property value. Number of devices whose battery maximum capacity is greater than 50% but lesser than 80%. Valid values 0 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBatteryCapacityFair() {
        return this.backingStore.get("batteryCapacityFair");
    }
    /**
     * Gets the batteryCapacityGood property value. Number of devices whose battery maximum capacity is greater than 80%. Valid values 0 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBatteryCapacityGood() {
        return this.backingStore.get("batteryCapacityGood");
    }
    /**
     * Gets the batteryCapacityPoor property value. Number of devices whose battery maximum capacity is lesser than 50%. Valid values 0 to 2147483647
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBatteryCapacityPoor() {
        return this.backingStore.get("batteryCapacityPoor");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDevices", (n) -> { this.setActiveDevices(n.getIntegerValue()); });
        deserializerMap.put("batteryCapacityFair", (n) -> { this.setBatteryCapacityFair(n.getIntegerValue()); });
        deserializerMap.put("batteryCapacityGood", (n) -> { this.setBatteryCapacityGood(n.getIntegerValue()); });
        deserializerMap.put("batteryCapacityPoor", (n) -> { this.setBatteryCapacityPoor(n.getIntegerValue()); });
        deserializerMap.put("lastRefreshedDateTime", (n) -> { this.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastRefreshedDateTime property value. Recorded date time of this capacity details instance.
     * @return a {@link OffsetDateTime}
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
        writer.writeIntegerValue("batteryCapacityFair", this.getBatteryCapacityFair());
        writer.writeIntegerValue("batteryCapacityGood", this.getBatteryCapacityGood());
        writer.writeIntegerValue("batteryCapacityPoor", this.getBatteryCapacityPoor());
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
     * Sets the batteryCapacityFair property value. Number of devices whose battery maximum capacity is greater than 50% but lesser than 80%. Valid values 0 to 2147483647
     * @param value Value to set for the batteryCapacityFair property.
     */
    public void setBatteryCapacityFair(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("batteryCapacityFair", value);
    }
    /**
     * Sets the batteryCapacityGood property value. Number of devices whose battery maximum capacity is greater than 80%. Valid values 0 to 2147483647
     * @param value Value to set for the batteryCapacityGood property.
     */
    public void setBatteryCapacityGood(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("batteryCapacityGood", value);
    }
    /**
     * Sets the batteryCapacityPoor property value. Number of devices whose battery maximum capacity is lesser than 50%. Valid values 0 to 2147483647
     * @param value Value to set for the batteryCapacityPoor property.
     */
    public void setBatteryCapacityPoor(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("batteryCapacityPoor", value);
    }
    /**
     * Sets the lastRefreshedDateTime property value. Recorded date time of this capacity details instance.
     * @param value Value to set for the lastRefreshedDateTime property.
     */
    public void setLastRefreshedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastRefreshedDateTime", value);
    }
}
