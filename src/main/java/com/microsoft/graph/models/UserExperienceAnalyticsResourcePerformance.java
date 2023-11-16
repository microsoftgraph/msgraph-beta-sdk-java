package com.microsoft.graph.models;

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
        return this.BackingStore.get("averageSpikeTimeScore");
    }
    /**
     * Gets the cpuSpikeTimePercentage property value. CPU spike time in percentage. Valid values 0 to 100
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getCpuSpikeTimePercentage() {
        return this.BackingStore.get("cpuSpikeTimePercentage");
    }
    /**
     * Gets the cpuSpikeTimePercentageThreshold property value. Threshold of cpuSpikeTimeScore. Valid values 0 to 100
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getCpuSpikeTimePercentageThreshold() {
        return this.BackingStore.get("cpuSpikeTimePercentageThreshold");
    }
    /**
     * Gets the cpuSpikeTimeScore property value. The user experience analytics device CPU spike time score. Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCpuSpikeTimeScore() {
        return this.BackingStore.get("cpuSpikeTimeScore");
    }
    /**
     * Gets the deviceCount property value. User experience analytics summarized device count.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDeviceCount() {
        return this.BackingStore.get("deviceCount");
    }
    /**
     * Gets the deviceId property value. The id of the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.BackingStore.get("deviceId");
    }
    /**
     * Gets the deviceName property value. The name of the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.BackingStore.get("deviceName");
    }
    /**
     * Gets the deviceResourcePerformanceScore property value. Resource performance score of a specific device. Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceResourcePerformanceScore() {
        return this.BackingStore.get("deviceResourcePerformanceScore");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("averageSpikeTimeScore", (n) -> { this.setAverageSpikeTimeScore(n.getIntegerValue()); });
        deserializerMap.put("cpuSpikeTimePercentage", (n) -> { this.setCpuSpikeTimePercentage(n.getDoubleValue()); });
        deserializerMap.put("cpuSpikeTimePercentageThreshold", (n) -> { this.setCpuSpikeTimePercentageThreshold(n.getDoubleValue()); });
        deserializerMap.put("cpuSpikeTimeScore", (n) -> { this.setCpuSpikeTimeScore(n.getIntegerValue()); });
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getLongValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceResourcePerformanceScore", (n) -> { this.setDeviceResourcePerformanceScore(n.getIntegerValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("ramSpikeTimePercentage", (n) -> { this.setRamSpikeTimePercentage(n.getDoubleValue()); });
        deserializerMap.put("ramSpikeTimePercentageThreshold", (n) -> { this.setRamSpikeTimePercentageThreshold(n.getDoubleValue()); });
        deserializerMap.put("ramSpikeTimeScore", (n) -> { this.setRamSpikeTimeScore(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the manufacturer property value. The user experience analytics device manufacturer.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.BackingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. The user experience analytics device model.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.BackingStore.get("model");
    }
    /**
     * Gets the ramSpikeTimePercentage property value. RAM spike time in percentage. Valid values 0 to 100
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getRamSpikeTimePercentage() {
        return this.BackingStore.get("ramSpikeTimePercentage");
    }
    /**
     * Gets the ramSpikeTimePercentageThreshold property value. Threshold of ramSpikeTimeScore. Valid values 0 to 100
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getRamSpikeTimePercentageThreshold() {
        return this.BackingStore.get("ramSpikeTimePercentageThreshold");
    }
    /**
     * Gets the ramSpikeTimeScore property value. The user experience analytics device RAM spike time score. Valid values 0 to 100
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRamSpikeTimeScore() {
        return this.BackingStore.get("ramSpikeTimeScore");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("averageSpikeTimeScore", this.getAverageSpikeTimeScore());
        writer.writeDoubleValue("cpuSpikeTimePercentage", this.getCpuSpikeTimePercentage());
        writer.writeDoubleValue("cpuSpikeTimePercentageThreshold", this.getCpuSpikeTimePercentageThreshold());
        writer.writeIntegerValue("cpuSpikeTimeScore", this.getCpuSpikeTimeScore());
        writer.writeLongValue("deviceCount", this.getDeviceCount());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeIntegerValue("deviceResourcePerformanceScore", this.getDeviceResourcePerformanceScore());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeDoubleValue("ramSpikeTimePercentage", this.getRamSpikeTimePercentage());
        writer.writeDoubleValue("ramSpikeTimePercentageThreshold", this.getRamSpikeTimePercentageThreshold());
        writer.writeIntegerValue("ramSpikeTimeScore", this.getRamSpikeTimeScore());
    }
    /**
     * Sets the averageSpikeTimeScore property value. AverageSpikeTimeScore of a device or a model type. Valid values 0 to 100
     * @param value Value to set for the averageSpikeTimeScore property.
     */
    public void setAverageSpikeTimeScore(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("averageSpikeTimeScore", value);
    }
    /**
     * Sets the cpuSpikeTimePercentage property value. CPU spike time in percentage. Valid values 0 to 100
     * @param value Value to set for the cpuSpikeTimePercentage property.
     */
    public void setCpuSpikeTimePercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("cpuSpikeTimePercentage", value);
    }
    /**
     * Sets the cpuSpikeTimePercentageThreshold property value. Threshold of cpuSpikeTimeScore. Valid values 0 to 100
     * @param value Value to set for the cpuSpikeTimePercentageThreshold property.
     */
    public void setCpuSpikeTimePercentageThreshold(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("cpuSpikeTimePercentageThreshold", value);
    }
    /**
     * Sets the cpuSpikeTimeScore property value. The user experience analytics device CPU spike time score. Valid values 0 to 100
     * @param value Value to set for the cpuSpikeTimeScore property.
     */
    public void setCpuSpikeTimeScore(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("cpuSpikeTimeScore", value);
    }
    /**
     * Sets the deviceCount property value. User experience analytics summarized device count.
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("deviceCount", value);
    }
    /**
     * Sets the deviceId property value. The id of the device.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("deviceId", value);
    }
    /**
     * Sets the deviceName property value. The name of the device.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("deviceName", value);
    }
    /**
     * Sets the deviceResourcePerformanceScore property value. Resource performance score of a specific device. Valid values 0 to 100
     * @param value Value to set for the deviceResourcePerformanceScore property.
     */
    public void setDeviceResourcePerformanceScore(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("deviceResourcePerformanceScore", value);
    }
    /**
     * Sets the manufacturer property value. The user experience analytics device manufacturer.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. The user experience analytics device model.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("model", value);
    }
    /**
     * Sets the ramSpikeTimePercentage property value. RAM spike time in percentage. Valid values 0 to 100
     * @param value Value to set for the ramSpikeTimePercentage property.
     */
    public void setRamSpikeTimePercentage(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("ramSpikeTimePercentage", value);
    }
    /**
     * Sets the ramSpikeTimePercentageThreshold property value. Threshold of ramSpikeTimeScore. Valid values 0 to 100
     * @param value Value to set for the ramSpikeTimePercentageThreshold property.
     */
    public void setRamSpikeTimePercentageThreshold(@jakarta.annotation.Nullable final Double value) {
        this.BackingStore.set("ramSpikeTimePercentageThreshold", value);
    }
    /**
     * Sets the ramSpikeTimeScore property value. The user experience analytics device RAM spike time score. Valid values 0 to 100
     * @param value Value to set for the ramSpikeTimeScore property.
     */
    public void setRamSpikeTimeScore(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("ramSpikeTimeScore", value);
    }
}
