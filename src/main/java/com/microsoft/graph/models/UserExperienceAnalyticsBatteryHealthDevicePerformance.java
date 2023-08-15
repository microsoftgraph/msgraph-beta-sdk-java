package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics battery health device performance entity contains device level battery information.
 */
public class UserExperienceAnalyticsBatteryHealthDevicePerformance extends Entity implements Parsable {
    /**
     * Estimated battery age. Unit in days. Valid values 0 to 2147483647
     */
    private Integer batteryAgeInDays;
    /**
     * Number of batteries in a user device. Valid values 1 to 2147483647
     */
    private Integer deviceBatteryCount;
    /**
     * A weighted average of a devices maximum capacity score and runtime estimate score. Values range from 0-100. Valid values 0 to 2147483647
     */
    private Integer deviceBatteryHealthScore;
    /**
     * The unique identifier of the device, Intune DeviceID.
     */
    private String deviceId;
    /**
     * Device friendly name.
     */
    private String deviceName;
    /**
     * The estimated runtime of the device when the battery is fully charged. Unit in minutes. Valid values 0 to 2147483647
     */
    private Integer estimatedRuntimeInMinutes;
    /**
     * Number of times the battery has been discharged an amount that equals 100% of its capacity, but not necessarily by discharging it from 100% to 0%. Valid values 0 to 2147483647
     */
    private Integer fullBatteryDrainCount;
    /**
     * The healthStatus property
     */
    private UserExperienceAnalyticsHealthState healthStatus;
    /**
     * The manufacturer name of the device.
     */
    private String manufacturer;
    /**
     * Ratio of current capacity and design capacity of the battery with the lowest capacity. Unit in percentage and values range from 0-100. Valid values 0 to 2147483647
     */
    private Integer maxCapacityPercentage;
    /**
     * The model name of the device.
     */
    private String model;
    /**
     * Instantiates a new userExperienceAnalyticsBatteryHealthDevicePerformance and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsBatteryHealthDevicePerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsBatteryHealthDevicePerformance
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthDevicePerformance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthDevicePerformance();
    }
    /**
     * Gets the batteryAgeInDays property value. Estimated battery age. Unit in days. Valid values 0 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getBatteryAgeInDays() {
        return this.batteryAgeInDays;
    }
    /**
     * Gets the deviceBatteryCount property value. Number of batteries in a user device. Valid values 1 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceBatteryCount() {
        return this.deviceBatteryCount;
    }
    /**
     * Gets the deviceBatteryHealthScore property value. A weighted average of a devices maximum capacity score and runtime estimate score. Values range from 0-100. Valid values 0 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceBatteryHealthScore() {
        return this.deviceBatteryHealthScore;
    }
    /**
     * Gets the deviceId property value. The unique identifier of the device, Intune DeviceID.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceName property value. Device friendly name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the estimatedRuntimeInMinutes property value. The estimated runtime of the device when the battery is fully charged. Unit in minutes. Valid values 0 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getEstimatedRuntimeInMinutes() {
        return this.estimatedRuntimeInMinutes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("batteryAgeInDays", (n) -> { this.setBatteryAgeInDays(n.getIntegerValue()); });
        deserializerMap.put("deviceBatteryCount", (n) -> { this.setDeviceBatteryCount(n.getIntegerValue()); });
        deserializerMap.put("deviceBatteryHealthScore", (n) -> { this.setDeviceBatteryHealthScore(n.getIntegerValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("estimatedRuntimeInMinutes", (n) -> { this.setEstimatedRuntimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("fullBatteryDrainCount", (n) -> { this.setFullBatteryDrainCount(n.getIntegerValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState.class)); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("maxCapacityPercentage", (n) -> { this.setMaxCapacityPercentage(n.getIntegerValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fullBatteryDrainCount property value. Number of times the battery has been discharged an amount that equals 100% of its capacity, but not necessarily by discharging it from 100% to 0%. Valid values 0 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFullBatteryDrainCount() {
        return this.fullBatteryDrainCount;
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a userExperienceAnalyticsHealthState
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsHealthState getHealthStatus() {
        return this.healthStatus;
    }
    /**
     * Gets the manufacturer property value. The manufacturer name of the device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the maxCapacityPercentage property value. Ratio of current capacity and design capacity of the battery with the lowest capacity. Unit in percentage and values range from 0-100. Valid values 0 to 2147483647
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxCapacityPercentage() {
        return this.maxCapacityPercentage;
    }
    /**
     * Gets the model property value. The model name of the device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
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
        writer.writeIntegerValue("batteryAgeInDays", this.getBatteryAgeInDays());
        writer.writeIntegerValue("deviceBatteryCount", this.getDeviceBatteryCount());
        writer.writeIntegerValue("deviceBatteryHealthScore", this.getDeviceBatteryHealthScore());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeIntegerValue("estimatedRuntimeInMinutes", this.getEstimatedRuntimeInMinutes());
        writer.writeIntegerValue("fullBatteryDrainCount", this.getFullBatteryDrainCount());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeIntegerValue("maxCapacityPercentage", this.getMaxCapacityPercentage());
        writer.writeStringValue("model", this.getModel());
    }
    /**
     * Sets the batteryAgeInDays property value. Estimated battery age. Unit in days. Valid values 0 to 2147483647
     * @param value Value to set for the batteryAgeInDays property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setBatteryAgeInDays(@jakarta.annotation.Nullable final Integer value) {
        this.batteryAgeInDays = value;
    }
    /**
     * Sets the deviceBatteryCount property value. Number of batteries in a user device. Valid values 1 to 2147483647
     * @param value Value to set for the deviceBatteryCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceBatteryCount(@jakarta.annotation.Nullable final Integer value) {
        this.deviceBatteryCount = value;
    }
    /**
     * Sets the deviceBatteryHealthScore property value. A weighted average of a devices maximum capacity score and runtime estimate score. Values range from 0-100. Valid values 0 to 2147483647
     * @param value Value to set for the deviceBatteryHealthScore property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceBatteryHealthScore(@jakarta.annotation.Nullable final Integer value) {
        this.deviceBatteryHealthScore = value;
    }
    /**
     * Sets the deviceId property value. The unique identifier of the device, Intune DeviceID.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceName property value. Device friendly name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the estimatedRuntimeInMinutes property value. The estimated runtime of the device when the battery is fully charged. Unit in minutes. Valid values 0 to 2147483647
     * @param value Value to set for the estimatedRuntimeInMinutes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setEstimatedRuntimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.estimatedRuntimeInMinutes = value;
    }
    /**
     * Sets the fullBatteryDrainCount property value. Number of times the battery has been discharged an amount that equals 100% of its capacity, but not necessarily by discharging it from 100% to 0%. Valid values 0 to 2147483647
     * @param value Value to set for the fullBatteryDrainCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFullBatteryDrainCount(@jakarta.annotation.Nullable final Integer value) {
        this.fullBatteryDrainCount = value;
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setHealthStatus(@jakarta.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this.healthStatus = value;
    }
    /**
     * Sets the manufacturer property value. The manufacturer name of the device.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the maxCapacityPercentage property value. Ratio of current capacity and design capacity of the battery with the lowest capacity. Unit in percentage and values range from 0-100. Valid values 0 to 2147483647
     * @param value Value to set for the maxCapacityPercentage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMaxCapacityPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.maxCapacityPercentage = value;
    }
    /**
     * Sets the model property value. The model name of the device.
     * @param value Value to set for the model property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
}
