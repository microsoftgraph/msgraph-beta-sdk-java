package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics resource performance entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsResourcePerformance extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsResourcePerformance and sets the default values.
     */
    public UserExperienceAnalyticsResourcePerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsResourcePerformance
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsResourcePerformance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsResourcePerformance();
    }
    /**
     * Gets the averageSpikeTimeScore property value. AverageSpikeTimeScore of a device or a model type. Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAverageSpikeTimeScore() {
        return this.backingStore.get("averageSpikeTimeScore");
    }
    /**
     * Gets the cpuClockSpeedInMHz property value. The clock speed of the processor, in MHz. Valid values 0 to 1000000
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getCpuClockSpeedInMHz() {
        return this.backingStore.get("cpuClockSpeedInMHz");
    }
    /**
     * Gets the cpuDisplayName property value. The name of the processor on the device, For example, 11th Gen Intel(R) Core(TM) i7.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCpuDisplayName() {
        return this.backingStore.get("cpuDisplayName");
    }
    /**
     * Gets the cpuSpikeTimePercentage property value. CPU spike time in percentage. Valid values 0 to 100
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getCpuSpikeTimePercentage() {
        return this.backingStore.get("cpuSpikeTimePercentage");
    }
    /**
     * Gets the cpuSpikeTimePercentageThreshold property value. Threshold of cpuSpikeTimeScore. Valid values 0 to 100
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getCpuSpikeTimePercentageThreshold() {
        return this.backingStore.get("cpuSpikeTimePercentageThreshold");
    }
    /**
     * Gets the cpuSpikeTimeScore property value. The user experience analytics device CPU spike time score. Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCpuSpikeTimeScore() {
        return this.backingStore.get("cpuSpikeTimeScore");
    }
    /**
     * Gets the deviceCount property value. User experience analytics summarized device count.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDeviceCount() {
        return this.backingStore.get("deviceCount");
    }
    /**
     * Gets the deviceId property value. The id of the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the deviceName property value. The name of the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the deviceResourcePerformanceScore property value. Resource performance score of a specific device. Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceResourcePerformanceScore() {
        return this.backingStore.get("deviceResourcePerformanceScore");
    }
    /**
     * Gets the diskType property value. The diskType property
     * @return a DiskType
     */
    @jakarta.annotation.Nullable
    public DiskType getDiskType() {
        return this.backingStore.get("diskType");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("averageSpikeTimeScore", (n) -> { this.setAverageSpikeTimeScore(n.getIntegerValue()); });
        deserializerMap.put("cpuClockSpeedInMHz", (n) -> { this.setCpuClockSpeedInMHz(n.getDoubleValue()); });
        deserializerMap.put("cpuDisplayName", (n) -> { this.setCpuDisplayName(n.getStringValue()); });
        deserializerMap.put("cpuSpikeTimePercentage", (n) -> { this.setCpuSpikeTimePercentage(n.getDoubleValue()); });
        deserializerMap.put("cpuSpikeTimePercentageThreshold", (n) -> { this.setCpuSpikeTimePercentageThreshold(n.getDoubleValue()); });
        deserializerMap.put("cpuSpikeTimeScore", (n) -> { this.setCpuSpikeTimeScore(n.getIntegerValue()); });
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getLongValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceResourcePerformanceScore", (n) -> { this.setDeviceResourcePerformanceScore(n.getIntegerValue()); });
        deserializerMap.put("diskType", (n) -> { this.setDiskType(n.getEnumValue(DiskType::forValue)); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState::forValue)); });
        deserializerMap.put("machineType", (n) -> { this.setMachineType(n.getEnumValue(UserExperienceAnalyticsMachineType::forValue)); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("ramSpikeTimePercentage", (n) -> { this.setRamSpikeTimePercentage(n.getDoubleValue()); });
        deserializerMap.put("ramSpikeTimePercentageThreshold", (n) -> { this.setRamSpikeTimePercentageThreshold(n.getDoubleValue()); });
        deserializerMap.put("ramSpikeTimeScore", (n) -> { this.setRamSpikeTimeScore(n.getIntegerValue()); });
        deserializerMap.put("totalProcessorCoreCount", (n) -> { this.setTotalProcessorCoreCount(n.getIntegerValue()); });
        deserializerMap.put("totalRamInMB", (n) -> { this.setTotalRamInMB(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a UserExperienceAnalyticsHealthState
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsHealthState getHealthStatus() {
        return this.backingStore.get("healthStatus");
    }
    /**
     * Gets the machineType property value. Indicates if machine is physical or virtual. Possible values are: physical or virtual
     * @return a UserExperienceAnalyticsMachineType
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsMachineType getMachineType() {
        return this.backingStore.get("machineType");
    }
    /**
     * Gets the manufacturer property value. The user experience analytics device manufacturer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. The user experience analytics device model.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the ramSpikeTimePercentage property value. RAM spike time in percentage. Valid values 0 to 100
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getRamSpikeTimePercentage() {
        return this.backingStore.get("ramSpikeTimePercentage");
    }
    /**
     * Gets the ramSpikeTimePercentageThreshold property value. Threshold of ramSpikeTimeScore. Valid values 0 to 100
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getRamSpikeTimePercentageThreshold() {
        return this.backingStore.get("ramSpikeTimePercentageThreshold");
    }
    /**
     * Gets the ramSpikeTimeScore property value. The user experience analytics device RAM spike time score. Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRamSpikeTimeScore() {
        return this.backingStore.get("ramSpikeTimeScore");
    }
    /**
     * Gets the totalProcessorCoreCount property value. The count of cores of the processor of device. Valid values 0 to 512
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalProcessorCoreCount() {
        return this.backingStore.get("totalProcessorCoreCount");
    }
    /**
     * Gets the totalRamInMB property value. The total RAM of the device, in MB. Valid values 0 to 1000000
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getTotalRamInMB() {
        return this.backingStore.get("totalRamInMB");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("averageSpikeTimeScore", this.getAverageSpikeTimeScore());
        writer.writeDoubleValue("cpuClockSpeedInMHz", this.getCpuClockSpeedInMHz());
        writer.writeStringValue("cpuDisplayName", this.getCpuDisplayName());
        writer.writeDoubleValue("cpuSpikeTimePercentage", this.getCpuSpikeTimePercentage());
        writer.writeDoubleValue("cpuSpikeTimePercentageThreshold", this.getCpuSpikeTimePercentageThreshold());
        writer.writeIntegerValue("cpuSpikeTimeScore", this.getCpuSpikeTimeScore());
        writer.writeLongValue("deviceCount", this.getDeviceCount());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeIntegerValue("deviceResourcePerformanceScore", this.getDeviceResourcePerformanceScore());
        writer.writeEnumValue("diskType", this.getDiskType());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeEnumValue("machineType", this.getMachineType());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeDoubleValue("ramSpikeTimePercentage", this.getRamSpikeTimePercentage());
        writer.writeDoubleValue("ramSpikeTimePercentageThreshold", this.getRamSpikeTimePercentageThreshold());
        writer.writeIntegerValue("ramSpikeTimeScore", this.getRamSpikeTimeScore());
        writer.writeIntegerValue("totalProcessorCoreCount", this.getTotalProcessorCoreCount());
        writer.writeDoubleValue("totalRamInMB", this.getTotalRamInMB());
    }
    /**
     * Sets the averageSpikeTimeScore property value. AverageSpikeTimeScore of a device or a model type. Valid values 0 to 100
     * @param value Value to set for the averageSpikeTimeScore property.
     */
    public void setAverageSpikeTimeScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("averageSpikeTimeScore", value);
    }
    /**
     * Sets the cpuClockSpeedInMHz property value. The clock speed of the processor, in MHz. Valid values 0 to 1000000
     * @param value Value to set for the cpuClockSpeedInMHz property.
     */
    public void setCpuClockSpeedInMHz(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("cpuClockSpeedInMHz", value);
    }
    /**
     * Sets the cpuDisplayName property value. The name of the processor on the device, For example, 11th Gen Intel(R) Core(TM) i7.
     * @param value Value to set for the cpuDisplayName property.
     */
    public void setCpuDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cpuDisplayName", value);
    }
    /**
     * Sets the cpuSpikeTimePercentage property value. CPU spike time in percentage. Valid values 0 to 100
     * @param value Value to set for the cpuSpikeTimePercentage property.
     */
    public void setCpuSpikeTimePercentage(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("cpuSpikeTimePercentage", value);
    }
    /**
     * Sets the cpuSpikeTimePercentageThreshold property value. Threshold of cpuSpikeTimeScore. Valid values 0 to 100
     * @param value Value to set for the cpuSpikeTimePercentageThreshold property.
     */
    public void setCpuSpikeTimePercentageThreshold(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("cpuSpikeTimePercentageThreshold", value);
    }
    /**
     * Sets the cpuSpikeTimeScore property value. The user experience analytics device CPU spike time score. Valid values 0 to 100
     * @param value Value to set for the cpuSpikeTimeScore property.
     */
    public void setCpuSpikeTimeScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("cpuSpikeTimeScore", value);
    }
    /**
     * Sets the deviceCount property value. User experience analytics summarized device count.
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("deviceCount", value);
    }
    /**
     * Sets the deviceId property value. The id of the device.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceName property value. The name of the device.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the deviceResourcePerformanceScore property value. Resource performance score of a specific device. Valid values 0 to 100
     * @param value Value to set for the deviceResourcePerformanceScore property.
     */
    public void setDeviceResourcePerformanceScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deviceResourcePerformanceScore", value);
    }
    /**
     * Sets the diskType property value. The diskType property
     * @param value Value to set for the diskType property.
     */
    public void setDiskType(@jakarta.annotation.Nullable final DiskType value) {
        this.backingStore.set("diskType", value);
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this.backingStore.set("healthStatus", value);
    }
    /**
     * Sets the machineType property value. Indicates if machine is physical or virtual. Possible values are: physical or virtual
     * @param value Value to set for the machineType property.
     */
    public void setMachineType(@jakarta.annotation.Nullable final UserExperienceAnalyticsMachineType value) {
        this.backingStore.set("machineType", value);
    }
    /**
     * Sets the manufacturer property value. The user experience analytics device manufacturer.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. The user experience analytics device model.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the ramSpikeTimePercentage property value. RAM spike time in percentage. Valid values 0 to 100
     * @param value Value to set for the ramSpikeTimePercentage property.
     */
    public void setRamSpikeTimePercentage(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("ramSpikeTimePercentage", value);
    }
    /**
     * Sets the ramSpikeTimePercentageThreshold property value. Threshold of ramSpikeTimeScore. Valid values 0 to 100
     * @param value Value to set for the ramSpikeTimePercentageThreshold property.
     */
    public void setRamSpikeTimePercentageThreshold(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("ramSpikeTimePercentageThreshold", value);
    }
    /**
     * Sets the ramSpikeTimeScore property value. The user experience analytics device RAM spike time score. Valid values 0 to 100
     * @param value Value to set for the ramSpikeTimeScore property.
     */
    public void setRamSpikeTimeScore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("ramSpikeTimeScore", value);
    }
    /**
     * Sets the totalProcessorCoreCount property value. The count of cores of the processor of device. Valid values 0 to 512
     * @param value Value to set for the totalProcessorCoreCount property.
     */
    public void setTotalProcessorCoreCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalProcessorCoreCount", value);
    }
    /**
     * Sets the totalRamInMB property value. The total RAM of the device, in MB. Valid values 0 to 1000000
     * @param value Value to set for the totalRamInMB property.
     */
    public void setTotalRamInMB(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("totalRamInMB", value);
    }
}
