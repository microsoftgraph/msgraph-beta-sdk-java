package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics battery health os performance entity contains battery related information for all operating system versions in their organization.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsBatteryHealthOsPerformance extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsBatteryHealthOsPerformance and sets the default values.
     */
    public UserExperienceAnalyticsBatteryHealthOsPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsBatteryHealthOsPerformance
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthOsPerformance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthOsPerformance();
    }
    /**
     * Gets the activeDevices property value. Number of active devices for that os version. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getActiveDevices() {
        return this.backingStore.get("activeDevices");
    }
    /**
     * Gets the averageBatteryAgeInDays property value. The mean of the battery age for all devices running a particular operating system version in a tenant. Unit in days. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAverageBatteryAgeInDays() {
        return this.backingStore.get("averageBatteryAgeInDays");
    }
    /**
     * Gets the averageEstimatedRuntimeInMinutes property value. The mean of the estimated runtimes on full charge for all devices running a particular operating system version. Unit in minutes. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAverageEstimatedRuntimeInMinutes() {
        return this.backingStore.get("averageEstimatedRuntimeInMinutes");
    }
    /**
     * Gets the averageMaxCapacityPercentage property value. The mean of the maximum capacity for all devices running a particular operating system version. Maximum capacity measures the full charge vs. design capacity for a devices batteries.. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAverageMaxCapacityPercentage() {
        return this.backingStore.get("averageMaxCapacityPercentage");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDevices", (n) -> { this.setActiveDevices(n.getIntegerValue()); });
        deserializerMap.put("averageBatteryAgeInDays", (n) -> { this.setAverageBatteryAgeInDays(n.getIntegerValue()); });
        deserializerMap.put("averageEstimatedRuntimeInMinutes", (n) -> { this.setAverageEstimatedRuntimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("averageMaxCapacityPercentage", (n) -> { this.setAverageMaxCapacityPercentage(n.getIntegerValue()); });
        deserializerMap.put("meanFullBatteryDrainCount", (n) -> { this.setMeanFullBatteryDrainCount(n.getIntegerValue()); });
        deserializerMap.put("medianEstimatedRuntimeInMinutes", (n) -> { this.setMedianEstimatedRuntimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("medianFullBatteryDrainCount", (n) -> { this.setMedianFullBatteryDrainCount(n.getIntegerValue()); });
        deserializerMap.put("medianMaxCapacityPercentage", (n) -> { this.setMedianMaxCapacityPercentage(n.getIntegerValue()); });
        deserializerMap.put("osBatteryHealthScore", (n) -> { this.setOsBatteryHealthScore(n.getIntegerValue()); });
        deserializerMap.put("osBuildNumber", (n) -> { this.setOsBuildNumber(n.getStringValue()); });
        deserializerMap.put("osHealthStatus", (n) -> { this.setOsHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState::forValue)); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the meanFullBatteryDrainCount property value. The mean of number of times the battery has been discharged an amount that equals 100% of its capacity for all devices running a particular operating system version in a tenant. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMeanFullBatteryDrainCount() {
        return this.backingStore.get("meanFullBatteryDrainCount");
    }
    /**
     * Gets the medianEstimatedRuntimeInMinutes property value. The median of the estimated runtimes on full charge for all devices running a particular operating system version. Unit in minutes. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMedianEstimatedRuntimeInMinutes() {
        return this.backingStore.get("medianEstimatedRuntimeInMinutes");
    }
    /**
     * Gets the medianFullBatteryDrainCount property value. The median of number of times the battery has been discharged an amount that equals 100% of its capacity for all devices running a particular operating system version in a tenant. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMedianFullBatteryDrainCount() {
        return this.backingStore.get("medianFullBatteryDrainCount");
    }
    /**
     * Gets the medianMaxCapacityPercentage property value. The median of the maximum capacity for all devices running a particular operating system version. Maximum capacity measures the full charge vs. design capacity for a devices batteries.. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMedianMaxCapacityPercentage() {
        return this.backingStore.get("medianMaxCapacityPercentage");
    }
    /**
     * Gets the osBatteryHealthScore property value. A weighted average of battery health score across all devices running a particular operating system version. Values range from 0-100. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOsBatteryHealthScore() {
        return this.backingStore.get("osBatteryHealthScore");
    }
    /**
     * Gets the osBuildNumber property value. Build number of the operating system.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsBuildNumber() {
        return this.backingStore.get("osBuildNumber");
    }
    /**
     * Gets the osHealthStatus property value. The osHealthStatus property
     * @return a UserExperienceAnalyticsHealthState
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsHealthState getOsHealthStatus() {
        return this.backingStore.get("osHealthStatus");
    }
    /**
     * Gets the osVersion property value. Version of the operating system.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeDevices", this.getActiveDevices());
        writer.writeIntegerValue("averageBatteryAgeInDays", this.getAverageBatteryAgeInDays());
        writer.writeIntegerValue("averageEstimatedRuntimeInMinutes", this.getAverageEstimatedRuntimeInMinutes());
        writer.writeIntegerValue("averageMaxCapacityPercentage", this.getAverageMaxCapacityPercentage());
        writer.writeIntegerValue("meanFullBatteryDrainCount", this.getMeanFullBatteryDrainCount());
        writer.writeIntegerValue("medianEstimatedRuntimeInMinutes", this.getMedianEstimatedRuntimeInMinutes());
        writer.writeIntegerValue("medianFullBatteryDrainCount", this.getMedianFullBatteryDrainCount());
        writer.writeIntegerValue("medianMaxCapacityPercentage", this.getMedianMaxCapacityPercentage());
        writer.writeIntegerValue("osBatteryHealthScore", this.getOsBatteryHealthScore());
        writer.writeStringValue("osBuildNumber", this.getOsBuildNumber());
        writer.writeEnumValue("osHealthStatus", this.getOsHealthStatus());
        writer.writeStringValue("osVersion", this.getOsVersion());
    }
    /**
     * Sets the activeDevices property value. Number of active devices for that os version. Valid values 0 to 2147483647
     * @param value Value to set for the activeDevices property.
     */
    public void setActiveDevices(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("activeDevices", value);
    }
    /**
     * Sets the averageBatteryAgeInDays property value. The mean of the battery age for all devices running a particular operating system version in a tenant. Unit in days. Valid values 0 to 2147483647
     * @param value Value to set for the averageBatteryAgeInDays property.
     */
    public void setAverageBatteryAgeInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("averageBatteryAgeInDays", value);
    }
    /**
     * Sets the averageEstimatedRuntimeInMinutes property value. The mean of the estimated runtimes on full charge for all devices running a particular operating system version. Unit in minutes. Valid values 0 to 2147483647
     * @param value Value to set for the averageEstimatedRuntimeInMinutes property.
     */
    public void setAverageEstimatedRuntimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("averageEstimatedRuntimeInMinutes", value);
    }
    /**
     * Sets the averageMaxCapacityPercentage property value. The mean of the maximum capacity for all devices running a particular operating system version. Maximum capacity measures the full charge vs. design capacity for a devices batteries.. Valid values 0 to 2147483647
     * @param value Value to set for the averageMaxCapacityPercentage property.
     */
    public void setAverageMaxCapacityPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("averageMaxCapacityPercentage", value);
    }
    /**
     * Sets the meanFullBatteryDrainCount property value. The mean of number of times the battery has been discharged an amount that equals 100% of its capacity for all devices running a particular operating system version in a tenant. Valid values 0 to 2147483647
     * @param value Value to set for the meanFullBatteryDrainCount property.
     */
    public void setMeanFullBatteryDrainCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("meanFullBatteryDrainCount", value);
    }
    /**
     * Sets the medianEstimatedRuntimeInMinutes property value. The median of the estimated runtimes on full charge for all devices running a particular operating system version. Unit in minutes. Valid values 0 to 2147483647
     * @param value Value to set for the medianEstimatedRuntimeInMinutes property.
     */
    public void setMedianEstimatedRuntimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("medianEstimatedRuntimeInMinutes", value);
    }
    /**
     * Sets the medianFullBatteryDrainCount property value. The median of number of times the battery has been discharged an amount that equals 100% of its capacity for all devices running a particular operating system version in a tenant. Valid values 0 to 2147483647
     * @param value Value to set for the medianFullBatteryDrainCount property.
     */
    public void setMedianFullBatteryDrainCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("medianFullBatteryDrainCount", value);
    }
    /**
     * Sets the medianMaxCapacityPercentage property value. The median of the maximum capacity for all devices running a particular operating system version. Maximum capacity measures the full charge vs. design capacity for a devices batteries.. Valid values 0 to 2147483647
     * @param value Value to set for the medianMaxCapacityPercentage property.
     */
    public void setMedianMaxCapacityPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("medianMaxCapacityPercentage", value);
    }
    /**
     * Sets the osBatteryHealthScore property value. A weighted average of battery health score across all devices running a particular operating system version. Values range from 0-100. Valid values 0 to 2147483647
     * @param value Value to set for the osBatteryHealthScore property.
     */
    public void setOsBatteryHealthScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("osBatteryHealthScore", value);
    }
    /**
     * Sets the osBuildNumber property value. Build number of the operating system.
     * @param value Value to set for the osBuildNumber property.
     */
    public void setOsBuildNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osBuildNumber", value);
    }
    /**
     * Sets the osHealthStatus property value. The osHealthStatus property
     * @param value Value to set for the osHealthStatus property.
     */
    public void setOsHealthStatus(@jakarta.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this.backingStore.set("osHealthStatus", value);
    }
    /**
     * Sets the osVersion property value. Version of the operating system.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
}
