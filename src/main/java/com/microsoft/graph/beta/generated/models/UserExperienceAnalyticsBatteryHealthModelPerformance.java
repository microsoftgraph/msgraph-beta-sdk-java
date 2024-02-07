package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics battery health model performance entity contains battery related information for all unique device models in their organization.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsBatteryHealthModelPerformance extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsBatteryHealthModelPerformance and sets the default values.
     */
    public UserExperienceAnalyticsBatteryHealthModelPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsBatteryHealthModelPerformance
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthModelPerformance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthModelPerformance();
    }
    /**
     * Gets the activeDevices property value. Number of active devices for that model. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getActiveDevices() {
        return this.backingStore.get("activeDevices");
    }
    /**
     * Gets the averageBatteryAgeInDays property value. The mean of the battery age for all devices of a given model in a tenant. Unit in days. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAverageBatteryAgeInDays() {
        return this.backingStore.get("averageBatteryAgeInDays");
    }
    /**
     * Gets the averageEstimatedRuntimeInMinutes property value. The mean of the estimated runtimes on full charge for all devices of a given model. Unit in minutes. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAverageEstimatedRuntimeInMinutes() {
        return this.backingStore.get("averageEstimatedRuntimeInMinutes");
    }
    /**
     * Gets the averageMaxCapacityPercentage property value. The mean of the maximum capacity for all devices of a given model. Maximum capacity measures the full charge vs. design capacity for a devices batteries.. Valid values 0 to 2147483647
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
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("meanFullBatteryDrainCount", (n) -> { this.setMeanFullBatteryDrainCount(n.getIntegerValue()); });
        deserializerMap.put("medianEstimatedRuntimeInMinutes", (n) -> { this.setMedianEstimatedRuntimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("medianFullBatteryDrainCount", (n) -> { this.setMedianFullBatteryDrainCount(n.getIntegerValue()); });
        deserializerMap.put("medianMaxCapacityPercentage", (n) -> { this.setMedianMaxCapacityPercentage(n.getIntegerValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("modelBatteryHealthScore", (n) -> { this.setModelBatteryHealthScore(n.getIntegerValue()); });
        deserializerMap.put("modelHealthStatus", (n) -> { this.setModelHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the manufacturer property value. Name of the device manufacturer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the meanFullBatteryDrainCount property value. The mean of number of times the battery has been discharged an amount that equals 100% of its capacity for all devices of a given model in a tenant. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMeanFullBatteryDrainCount() {
        return this.backingStore.get("meanFullBatteryDrainCount");
    }
    /**
     * Gets the medianEstimatedRuntimeInMinutes property value. The median of the estimated runtimes on full charge for all devices of a given model. Unit in minutes. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMedianEstimatedRuntimeInMinutes() {
        return this.backingStore.get("medianEstimatedRuntimeInMinutes");
    }
    /**
     * Gets the medianFullBatteryDrainCount property value. The median of number of times the battery has been discharged an amount that equals 100% of its capacity for all devices of a given model in a tenant. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMedianFullBatteryDrainCount() {
        return this.backingStore.get("medianFullBatteryDrainCount");
    }
    /**
     * Gets the medianMaxCapacityPercentage property value. The median of the maximum capacity for all devices of a given model. Maximum capacity measures the full charge vs. design capacity for a devices batteries.. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMedianMaxCapacityPercentage() {
        return this.backingStore.get("medianMaxCapacityPercentage");
    }
    /**
     * Gets the model property value. The model name of the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the modelBatteryHealthScore property value. A weighted average of a models maximum capacity score and runtime estimate score. Values range from 0-100. Valid values 0 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getModelBatteryHealthScore() {
        return this.backingStore.get("modelBatteryHealthScore");
    }
    /**
     * Gets the modelHealthStatus property value. The modelHealthStatus property
     * @return a UserExperienceAnalyticsHealthState
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsHealthState getModelHealthStatus() {
        return this.backingStore.get("modelHealthStatus");
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
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeIntegerValue("meanFullBatteryDrainCount", this.getMeanFullBatteryDrainCount());
        writer.writeIntegerValue("medianEstimatedRuntimeInMinutes", this.getMedianEstimatedRuntimeInMinutes());
        writer.writeIntegerValue("medianFullBatteryDrainCount", this.getMedianFullBatteryDrainCount());
        writer.writeIntegerValue("medianMaxCapacityPercentage", this.getMedianMaxCapacityPercentage());
        writer.writeStringValue("model", this.getModel());
        writer.writeIntegerValue("modelBatteryHealthScore", this.getModelBatteryHealthScore());
        writer.writeEnumValue("modelHealthStatus", this.getModelHealthStatus());
    }
    /**
     * Sets the activeDevices property value. Number of active devices for that model. Valid values 0 to 2147483647
     * @param value Value to set for the activeDevices property.
     */
    public void setActiveDevices(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("activeDevices", value);
    }
    /**
     * Sets the averageBatteryAgeInDays property value. The mean of the battery age for all devices of a given model in a tenant. Unit in days. Valid values 0 to 2147483647
     * @param value Value to set for the averageBatteryAgeInDays property.
     */
    public void setAverageBatteryAgeInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("averageBatteryAgeInDays", value);
    }
    /**
     * Sets the averageEstimatedRuntimeInMinutes property value. The mean of the estimated runtimes on full charge for all devices of a given model. Unit in minutes. Valid values 0 to 2147483647
     * @param value Value to set for the averageEstimatedRuntimeInMinutes property.
     */
    public void setAverageEstimatedRuntimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("averageEstimatedRuntimeInMinutes", value);
    }
    /**
     * Sets the averageMaxCapacityPercentage property value. The mean of the maximum capacity for all devices of a given model. Maximum capacity measures the full charge vs. design capacity for a devices batteries.. Valid values 0 to 2147483647
     * @param value Value to set for the averageMaxCapacityPercentage property.
     */
    public void setAverageMaxCapacityPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("averageMaxCapacityPercentage", value);
    }
    /**
     * Sets the manufacturer property value. Name of the device manufacturer.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the meanFullBatteryDrainCount property value. The mean of number of times the battery has been discharged an amount that equals 100% of its capacity for all devices of a given model in a tenant. Valid values 0 to 2147483647
     * @param value Value to set for the meanFullBatteryDrainCount property.
     */
    public void setMeanFullBatteryDrainCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("meanFullBatteryDrainCount", value);
    }
    /**
     * Sets the medianEstimatedRuntimeInMinutes property value. The median of the estimated runtimes on full charge for all devices of a given model. Unit in minutes. Valid values 0 to 2147483647
     * @param value Value to set for the medianEstimatedRuntimeInMinutes property.
     */
    public void setMedianEstimatedRuntimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("medianEstimatedRuntimeInMinutes", value);
    }
    /**
     * Sets the medianFullBatteryDrainCount property value. The median of number of times the battery has been discharged an amount that equals 100% of its capacity for all devices of a given model in a tenant. Valid values 0 to 2147483647
     * @param value Value to set for the medianFullBatteryDrainCount property.
     */
    public void setMedianFullBatteryDrainCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("medianFullBatteryDrainCount", value);
    }
    /**
     * Sets the medianMaxCapacityPercentage property value. The median of the maximum capacity for all devices of a given model. Maximum capacity measures the full charge vs. design capacity for a devices batteries.. Valid values 0 to 2147483647
     * @param value Value to set for the medianMaxCapacityPercentage property.
     */
    public void setMedianMaxCapacityPercentage(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("medianMaxCapacityPercentage", value);
    }
    /**
     * Sets the model property value. The model name of the device.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the modelBatteryHealthScore property value. A weighted average of a models maximum capacity score and runtime estimate score. Values range from 0-100. Valid values 0 to 2147483647
     * @param value Value to set for the modelBatteryHealthScore property.
     */
    public void setModelBatteryHealthScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("modelBatteryHealthScore", value);
    }
    /**
     * Sets the modelHealthStatus property value. The modelHealthStatus property
     * @param value Value to set for the modelHealthStatus property.
     */
    public void setModelHealthStatus(@jakarta.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this.backingStore.set("modelHealthStatus", value);
    }
}
