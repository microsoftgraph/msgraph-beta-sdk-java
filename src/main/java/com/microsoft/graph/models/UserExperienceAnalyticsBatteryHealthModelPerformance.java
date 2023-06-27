package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsBatteryHealthModelPerformance extends Entity implements Parsable {
    /**
     * Number of active devices for that model. Valid values -2147483648 to 2147483647
     */
    private Integer activeDevices;
    /**
     * The mean of the battery age for all devices of a given model in a tenant. Unit in days. Valid values -2147483648 to 2147483647
     */
    private Integer averageBatteryAgeInDays;
    /**
     * The mean of the estimated runtimes on full charge for all devices of a given model. Unit in minutes. Valid values -2147483648 to 2147483647
     */
    private Integer averageEstimatedRuntimeInMinutes;
    /**
     * The mean of the maximum capacity for all devices of a given model. Maximum capacity measures the full charge vs. design capacity for a devices batteries.. Valid values -2147483648 to 2147483647
     */
    private Integer averageMaxCapacityPercentage;
    /**
     * Name of the device manufacturer.
     */
    private String manufacturer;
    /**
     * The model name of the device.
     */
    private String model;
    /**
     * A weighted average of a models maximum capacity score and runtime estimate score. Values range from 0-100. Valid values -2147483648 to 2147483647
     */
    private Integer modelBatteryHealthScore;
    /**
     * Instantiates a new UserExperienceAnalyticsBatteryHealthModelPerformance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsBatteryHealthModelPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsBatteryHealthModelPerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthModelPerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthModelPerformance();
    }
    /**
     * Gets the activeDevices property value. Number of active devices for that model. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveDevices() {
        return this.activeDevices;
    }
    /**
     * Gets the averageBatteryAgeInDays property value. The mean of the battery age for all devices of a given model in a tenant. Unit in days. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAverageBatteryAgeInDays() {
        return this.averageBatteryAgeInDays;
    }
    /**
     * Gets the averageEstimatedRuntimeInMinutes property value. The mean of the estimated runtimes on full charge for all devices of a given model. Unit in minutes. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAverageEstimatedRuntimeInMinutes() {
        return this.averageEstimatedRuntimeInMinutes;
    }
    /**
     * Gets the averageMaxCapacityPercentage property value. The mean of the maximum capacity for all devices of a given model. Maximum capacity measures the full charge vs. design capacity for a devices batteries.. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAverageMaxCapacityPercentage() {
        return this.averageMaxCapacityPercentage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDevices", (n) -> { this.setActiveDevices(n.getIntegerValue()); });
        deserializerMap.put("averageBatteryAgeInDays", (n) -> { this.setAverageBatteryAgeInDays(n.getIntegerValue()); });
        deserializerMap.put("averageEstimatedRuntimeInMinutes", (n) -> { this.setAverageEstimatedRuntimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("averageMaxCapacityPercentage", (n) -> { this.setAverageMaxCapacityPercentage(n.getIntegerValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("modelBatteryHealthScore", (n) -> { this.setModelBatteryHealthScore(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the manufacturer property value. Name of the device manufacturer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. The model name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the modelBatteryHealthScore property value. A weighted average of a models maximum capacity score and runtime estimate score. Values range from 0-100. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getModelBatteryHealthScore() {
        return this.modelBatteryHealthScore;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeDevices", this.getActiveDevices());
        writer.writeIntegerValue("averageBatteryAgeInDays", this.getAverageBatteryAgeInDays());
        writer.writeIntegerValue("averageEstimatedRuntimeInMinutes", this.getAverageEstimatedRuntimeInMinutes());
        writer.writeIntegerValue("averageMaxCapacityPercentage", this.getAverageMaxCapacityPercentage());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeIntegerValue("modelBatteryHealthScore", this.getModelBatteryHealthScore());
    }
    /**
     * Sets the activeDevices property value. Number of active devices for that model. Valid values -2147483648 to 2147483647
     * @param value Value to set for the activeDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveDevices(@javax.annotation.Nullable final Integer value) {
        this.activeDevices = value;
    }
    /**
     * Sets the averageBatteryAgeInDays property value. The mean of the battery age for all devices of a given model in a tenant. Unit in days. Valid values -2147483648 to 2147483647
     * @param value Value to set for the averageBatteryAgeInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageBatteryAgeInDays(@javax.annotation.Nullable final Integer value) {
        this.averageBatteryAgeInDays = value;
    }
    /**
     * Sets the averageEstimatedRuntimeInMinutes property value. The mean of the estimated runtimes on full charge for all devices of a given model. Unit in minutes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the averageEstimatedRuntimeInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageEstimatedRuntimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this.averageEstimatedRuntimeInMinutes = value;
    }
    /**
     * Sets the averageMaxCapacityPercentage property value. The mean of the maximum capacity for all devices of a given model. Maximum capacity measures the full charge vs. design capacity for a devices batteries.. Valid values -2147483648 to 2147483647
     * @param value Value to set for the averageMaxCapacityPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageMaxCapacityPercentage(@javax.annotation.Nullable final Integer value) {
        this.averageMaxCapacityPercentage = value;
    }
    /**
     * Sets the manufacturer property value. Name of the device manufacturer.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. The model name of the device.
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the modelBatteryHealthScore property value. A weighted average of a models maximum capacity score and runtime estimate score. Values range from 0-100. Valid values -2147483648 to 2147483647
     * @param value Value to set for the modelBatteryHealthScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModelBatteryHealthScore(@javax.annotation.Nullable final Integer value) {
        this.modelBatteryHealthScore = value;
    }
}
