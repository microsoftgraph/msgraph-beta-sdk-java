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
public class UserExperienceAnalyticsBatteryHealthOsPerformance extends Entity implements Parsable {
    /**
     * Number of active devices for that os version. Valid values -2147483648 to 2147483647
     */
    private Integer activeDevices;
    /**
     * The mean of the battery age for all devices running a particular operating system version in a tenant. Unit in days. Valid values -2147483648 to 2147483647
     */
    private Integer averageBatteryAgeInDays;
    /**
     * The mean of the estimated runtimes on full charge for all devices running a particular operating system version. Unit in minutes. Valid values -2147483648 to 2147483647
     */
    private Integer averageEstimatedRuntimeInMinutes;
    /**
     * The mean of the maximum capacity for all devices running a particular operating system version. Maximum capacity measures the full charge vs. design capacity for a devices batteries.. Valid values -2147483648 to 2147483647
     */
    private Integer averageMaxCapacityPercentage;
    /**
     * Build number of the operating system.
     */
    private String osBuildNumber;
    /**
     * Version of the operating system.
     */
    private String osVersion;
    /**
     * Instantiates a new userExperienceAnalyticsBatteryHealthOsPerformance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsBatteryHealthOsPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsBatteryHealthOsPerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthOsPerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthOsPerformance();
    }
    /**
     * Gets the activeDevices property value. Number of active devices for that os version. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveDevices() {
        return this.activeDevices;
    }
    /**
     * Gets the averageBatteryAgeInDays property value. The mean of the battery age for all devices running a particular operating system version in a tenant. Unit in days. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAverageBatteryAgeInDays() {
        return this.averageBatteryAgeInDays;
    }
    /**
     * Gets the averageEstimatedRuntimeInMinutes property value. The mean of the estimated runtimes on full charge for all devices running a particular operating system version. Unit in minutes. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAverageEstimatedRuntimeInMinutes() {
        return this.averageEstimatedRuntimeInMinutes;
    }
    /**
     * Gets the averageMaxCapacityPercentage property value. The mean of the maximum capacity for all devices running a particular operating system version. Maximum capacity measures the full charge vs. design capacity for a devices batteries.. Valid values -2147483648 to 2147483647
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
        deserializerMap.put("osBuildNumber", (n) -> { this.setOsBuildNumber(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the osBuildNumber property value. Build number of the operating system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsBuildNumber() {
        return this.osBuildNumber;
    }
    /**
     * Gets the osVersion property value. Version of the operating system.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
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
        writer.writeStringValue("osBuildNumber", this.getOsBuildNumber());
        writer.writeStringValue("osVersion", this.getOsVersion());
    }
    /**
     * Sets the activeDevices property value. Number of active devices for that os version. Valid values -2147483648 to 2147483647
     * @param value Value to set for the activeDevices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActiveDevices(@javax.annotation.Nullable final Integer value) {
        this.activeDevices = value;
    }
    /**
     * Sets the averageBatteryAgeInDays property value. The mean of the battery age for all devices running a particular operating system version in a tenant. Unit in days. Valid values -2147483648 to 2147483647
     * @param value Value to set for the averageBatteryAgeInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageBatteryAgeInDays(@javax.annotation.Nullable final Integer value) {
        this.averageBatteryAgeInDays = value;
    }
    /**
     * Sets the averageEstimatedRuntimeInMinutes property value. The mean of the estimated runtimes on full charge for all devices running a particular operating system version. Unit in minutes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the averageEstimatedRuntimeInMinutes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageEstimatedRuntimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this.averageEstimatedRuntimeInMinutes = value;
    }
    /**
     * Sets the averageMaxCapacityPercentage property value. The mean of the maximum capacity for all devices running a particular operating system version. Maximum capacity measures the full charge vs. design capacity for a devices batteries.. Valid values -2147483648 to 2147483647
     * @param value Value to set for the averageMaxCapacityPercentage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAverageMaxCapacityPercentage(@javax.annotation.Nullable final Integer value) {
        this.averageMaxCapacityPercentage = value;
    }
    /**
     * Sets the osBuildNumber property value. Build number of the operating system.
     * @param value Value to set for the osBuildNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsBuildNumber(@javax.annotation.Nullable final String value) {
        this.osBuildNumber = value;
    }
    /**
     * Sets the osVersion property value. Version of the operating system.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this.osVersion = value;
    }
}
