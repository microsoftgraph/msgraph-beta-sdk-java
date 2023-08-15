package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics battery health capacity entity contains count of devices broken down into 3 categories - devices with capacity > 80%, devices with capacity 50-80% and devices with capacity < 50 %.This API provides the count of devices in these 3 categories..
 */
public class UserExperienceAnalyticsBatteryHealthCapacityDetails extends Entity implements Parsable {
    /**
     * Number of active devices within the tenant. Valid values 0 to 2147483647
     */
    private Integer activeDevices;
    /**
     * Number of devices whose battery maximum capacity is greater than 50% but lesser than 80%. Valid values 0 to 2147483647
     */
    private Integer batteryCapacityFair;
    /**
     * Number of devices whose battery maximum capacity is greater than 80%. Valid values 0 to 2147483647
     */
    private Integer batteryCapacityGood;
    /**
     * Number of devices whose battery maximum capacity is lesser than 50%. Valid values 0 to 2147483647
     */
    private Integer batteryCapacityPoor;
    /**
     * Recorded date time of this capacity details instance.
     */
    private OffsetDateTime lastRefreshedDateTime;
    /**
     * Instantiates a new userExperienceAnalyticsBatteryHealthCapacityDetails and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsBatteryHealthCapacityDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsBatteryHealthCapacityDetails
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthCapacityDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthCapacityDetails();
    }
    /**
     * Gets the activeDevices property value. Number of active devices within the tenant. Valid values 0 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getActiveDevices() {
        return this.activeDevices;
    }
    /**
     * Gets the batteryCapacityFair property value. Number of devices whose battery maximum capacity is greater than 50% but lesser than 80%. Valid values 0 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getBatteryCapacityFair() {
        return this.batteryCapacityFair;
    }
    /**
     * Gets the batteryCapacityGood property value. Number of devices whose battery maximum capacity is greater than 80%. Valid values 0 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getBatteryCapacityGood() {
        return this.batteryCapacityGood;
    }
    /**
     * Gets the batteryCapacityPoor property value. Number of devices whose battery maximum capacity is lesser than 50%. Valid values 0 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getBatteryCapacityPoor() {
        return this.batteryCapacityPoor;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
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
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this.lastRefreshedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setActiveDevices(@jakarta.annotation.Nullable final Integer value) {
        this.activeDevices = value;
    }
    /**
     * Sets the batteryCapacityFair property value. Number of devices whose battery maximum capacity is greater than 50% but lesser than 80%. Valid values 0 to 2147483647
     * @param value Value to set for the batteryCapacityFair property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBatteryCapacityFair(@jakarta.annotation.Nullable final Integer value) {
        this.batteryCapacityFair = value;
    }
    /**
     * Sets the batteryCapacityGood property value. Number of devices whose battery maximum capacity is greater than 80%. Valid values 0 to 2147483647
     * @param value Value to set for the batteryCapacityGood property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBatteryCapacityGood(@jakarta.annotation.Nullable final Integer value) {
        this.batteryCapacityGood = value;
    }
    /**
     * Sets the batteryCapacityPoor property value. Number of devices whose battery maximum capacity is lesser than 50%. Valid values 0 to 2147483647
     * @param value Value to set for the batteryCapacityPoor property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBatteryCapacityPoor(@jakarta.annotation.Nullable final Integer value) {
        this.batteryCapacityPoor = value;
    }
    /**
     * Sets the lastRefreshedDateTime property value. Recorded date time of this capacity details instance.
     * @param value Value to set for the lastRefreshedDateTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setLastRefreshedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastRefreshedDateTime = value;
    }
}
