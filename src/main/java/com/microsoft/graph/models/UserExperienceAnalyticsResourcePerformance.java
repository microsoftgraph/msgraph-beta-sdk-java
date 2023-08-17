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
public class UserExperienceAnalyticsResourcePerformance extends Entity implements Parsable {
    /**
     * AverageSpikeTimeScore of a device or a model type. Valid values 0 to 100
     */
    private Integer averageSpikeTimeScore;
    /**
     * CPU spike time in percentage. Valid values 0 to 100
     */
    private Double cpuSpikeTimePercentage;
    /**
     * Threshold of cpuSpikeTimeScore. Valid values 0 to 100
     */
    private Double cpuSpikeTimePercentageThreshold;
    /**
     * The user experience analytics device CPU spike time score. Valid values 0 to 100
     */
    private Integer cpuSpikeTimeScore;
    /**
     * User experience analytics summarized device count.
     */
    private Long deviceCount;
    /**
     * The id of the device.
     */
    private String deviceId;
    /**
     * The name of the device.
     */
    private String deviceName;
    /**
     * Resource performance score of a specific device. Valid values 0 to 100
     */
    private Integer deviceResourcePerformanceScore;
    /**
     * The user experience analytics device manufacturer.
     */
    private String manufacturer;
    /**
     * The user experience analytics device model.
     */
    private String model;
    /**
     * RAM spike time in percentage. Valid values 0 to 100
     */
    private Double ramSpikeTimePercentage;
    /**
     * Threshold of ramSpikeTimeScore. Valid values 0 to 100
     */
    private Double ramSpikeTimePercentageThreshold;
    /**
     * The user experience analytics device RAM spike time score. Valid values 0 to 100
     */
    private Integer ramSpikeTimeScore;
    /**
     * Instantiates a new userExperienceAnalyticsResourcePerformance and sets the default values.
     */
    public UserExperienceAnalyticsResourcePerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsResourcePerformance
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsResourcePerformance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsResourcePerformance();
    }
    /**
     * Gets the averageSpikeTimeScore property value. AverageSpikeTimeScore of a device or a model type. Valid values 0 to 100
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getAverageSpikeTimeScore() {
        return this.averageSpikeTimeScore;
    }
    /**
     * Gets the cpuSpikeTimePercentage property value. CPU spike time in percentage. Valid values 0 to 100
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getCpuSpikeTimePercentage() {
        return this.cpuSpikeTimePercentage;
    }
    /**
     * Gets the cpuSpikeTimePercentageThreshold property value. Threshold of cpuSpikeTimeScore. Valid values 0 to 100
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getCpuSpikeTimePercentageThreshold() {
        return this.cpuSpikeTimePercentageThreshold;
    }
    /**
     * Gets the cpuSpikeTimeScore property value. The user experience analytics device CPU spike time score. Valid values 0 to 100
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCpuSpikeTimeScore() {
        return this.cpuSpikeTimeScore;
    }
    /**
     * Gets the deviceCount property value. User experience analytics summarized device count.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getDeviceCount() {
        return this.deviceCount;
    }
    /**
     * Gets the deviceId property value. The id of the device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the deviceName property value. The name of the device.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the deviceResourcePerformanceScore property value. Resource performance score of a specific device. Valid values 0 to 100
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceResourcePerformanceScore() {
        return this.deviceResourcePerformanceScore;
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. The user experience analytics device model.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the ramSpikeTimePercentage property value. RAM spike time in percentage. Valid values 0 to 100
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getRamSpikeTimePercentage() {
        return this.ramSpikeTimePercentage;
    }
    /**
     * Gets the ramSpikeTimePercentageThreshold property value. Threshold of ramSpikeTimeScore. Valid values 0 to 100
     * @return a double
     */
    @jakarta.annotation.Nullable
    public Double getRamSpikeTimePercentageThreshold() {
        return this.ramSpikeTimePercentageThreshold;
    }
    /**
     * Gets the ramSpikeTimeScore property value. The user experience analytics device RAM spike time score. Valid values 0 to 100
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getRamSpikeTimeScore() {
        return this.ramSpikeTimeScore;
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
        this.averageSpikeTimeScore = value;
    }
    /**
     * Sets the cpuSpikeTimePercentage property value. CPU spike time in percentage. Valid values 0 to 100
     * @param value Value to set for the cpuSpikeTimePercentage property.
     */
    public void setCpuSpikeTimePercentage(@jakarta.annotation.Nullable final Double value) {
        this.cpuSpikeTimePercentage = value;
    }
    /**
     * Sets the cpuSpikeTimePercentageThreshold property value. Threshold of cpuSpikeTimeScore. Valid values 0 to 100
     * @param value Value to set for the cpuSpikeTimePercentageThreshold property.
     */
    public void setCpuSpikeTimePercentageThreshold(@jakarta.annotation.Nullable final Double value) {
        this.cpuSpikeTimePercentageThreshold = value;
    }
    /**
     * Sets the cpuSpikeTimeScore property value. The user experience analytics device CPU spike time score. Valid values 0 to 100
     * @param value Value to set for the cpuSpikeTimeScore property.
     */
    public void setCpuSpikeTimeScore(@jakarta.annotation.Nullable final Integer value) {
        this.cpuSpikeTimeScore = value;
    }
    /**
     * Sets the deviceCount property value. User experience analytics summarized device count.
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Long value) {
        this.deviceCount = value;
    }
    /**
     * Sets the deviceId property value. The id of the device.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the deviceName property value. The name of the device.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the deviceResourcePerformanceScore property value. Resource performance score of a specific device. Valid values 0 to 100
     * @param value Value to set for the deviceResourcePerformanceScore property.
     */
    public void setDeviceResourcePerformanceScore(@jakarta.annotation.Nullable final Integer value) {
        this.deviceResourcePerformanceScore = value;
    }
    /**
     * Sets the manufacturer property value. The user experience analytics device manufacturer.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. The user experience analytics device model.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the ramSpikeTimePercentage property value. RAM spike time in percentage. Valid values 0 to 100
     * @param value Value to set for the ramSpikeTimePercentage property.
     */
    public void setRamSpikeTimePercentage(@jakarta.annotation.Nullable final Double value) {
        this.ramSpikeTimePercentage = value;
    }
    /**
     * Sets the ramSpikeTimePercentageThreshold property value. Threshold of ramSpikeTimeScore. Valid values 0 to 100
     * @param value Value to set for the ramSpikeTimePercentageThreshold property.
     */
    public void setRamSpikeTimePercentageThreshold(@jakarta.annotation.Nullable final Double value) {
        this.ramSpikeTimePercentageThreshold = value;
    }
    /**
     * Sets the ramSpikeTimeScore property value. The user experience analytics device RAM spike time score. Valid values 0 to 100
     * @param value Value to set for the ramSpikeTimeScore property.
     */
    public void setRamSpikeTimeScore(@jakarta.annotation.Nullable final Integer value) {
        this.ramSpikeTimeScore = value;
    }
}
