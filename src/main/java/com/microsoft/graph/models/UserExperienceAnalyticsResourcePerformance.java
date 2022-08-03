package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsResourcePerformance extends Entity implements Parsable {
    /** AverageSpikeTimeScore of a device or a model type. Valid values 0 to 100 */
    private Integer _averageSpikeTimeScore;
    /** CPU spike time in percentage. Valid values 0 to 100 */
    private Double _cpuSpikeTimePercentage;
    /** Threshold of cpuSpikeTimeScore. Valid values 0 to 100 */
    private Double _cpuSpikeTimePercentageThreshold;
    /** The user experience analytics device CPU spike time score. Valid values 0 to 100 */
    private Integer _cpuSpikeTimeScore;
    /** User experience analytics summarized device count. */
    private Long _deviceCount;
    /** The id of the device. */
    private String _deviceId;
    /** The name of the device. */
    private String _deviceName;
    /** Resource performance score of a specific device. Valid values 0 to 100 */
    private Integer _deviceResourcePerformanceScore;
    /** The user experience analytics device manufacturer. */
    private String _manufacturer;
    /** The user experience analytics device model. */
    private String _model;
    /** RAM spike time in percentage. Valid values 0 to 100 */
    private Double _ramSpikeTimePercentage;
    /** Threshold of ramSpikeTimeScore. Valid values 0 to 100 */
    private Double _ramSpikeTimePercentageThreshold;
    /** The user experience analytics device RAM spike time score. Valid values 0 to 100 */
    private Integer _ramSpikeTimeScore;
    /**
     * Instantiates a new UserExperienceAnalyticsResourcePerformance and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsResourcePerformance() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsResourcePerformance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsResourcePerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsResourcePerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsResourcePerformance();
    }
    /**
     * Gets the averageSpikeTimeScore property value. AverageSpikeTimeScore of a device or a model type. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAverageSpikeTimeScore() {
        return this._averageSpikeTimeScore;
    }
    /**
     * Gets the cpuSpikeTimePercentage property value. CPU spike time in percentage. Valid values 0 to 100
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCpuSpikeTimePercentage() {
        return this._cpuSpikeTimePercentage;
    }
    /**
     * Gets the cpuSpikeTimePercentageThreshold property value. Threshold of cpuSpikeTimeScore. Valid values 0 to 100
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCpuSpikeTimePercentageThreshold() {
        return this._cpuSpikeTimePercentageThreshold;
    }
    /**
     * Gets the cpuSpikeTimeScore property value. The user experience analytics device CPU spike time score. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCpuSpikeTimeScore() {
        return this._cpuSpikeTimeScore;
    }
    /**
     * Gets the deviceCount property value. User experience analytics summarized device count.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getDeviceCount() {
        return this._deviceCount;
    }
    /**
     * Gets the deviceId property value. The id of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the deviceName property value. The name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the deviceResourcePerformanceScore property value. Resource performance score of a specific device. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceResourcePerformanceScore() {
        return this._deviceResourcePerformanceScore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsResourcePerformance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("averageSpikeTimeScore", (n) -> { currentObject.setAverageSpikeTimeScore(n.getIntegerValue()); });
            this.put("cpuSpikeTimePercentage", (n) -> { currentObject.setCpuSpikeTimePercentage(n.getDoubleValue()); });
            this.put("cpuSpikeTimePercentageThreshold", (n) -> { currentObject.setCpuSpikeTimePercentageThreshold(n.getDoubleValue()); });
            this.put("cpuSpikeTimeScore", (n) -> { currentObject.setCpuSpikeTimeScore(n.getIntegerValue()); });
            this.put("deviceCount", (n) -> { currentObject.setDeviceCount(n.getLongValue()); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("deviceResourcePerformanceScore", (n) -> { currentObject.setDeviceResourcePerformanceScore(n.getIntegerValue()); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
            this.put("ramSpikeTimePercentage", (n) -> { currentObject.setRamSpikeTimePercentage(n.getDoubleValue()); });
            this.put("ramSpikeTimePercentageThreshold", (n) -> { currentObject.setRamSpikeTimePercentageThreshold(n.getDoubleValue()); });
            this.put("ramSpikeTimeScore", (n) -> { currentObject.setRamSpikeTimeScore(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the manufacturer property value. The user experience analytics device manufacturer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the model property value. The user experience analytics device model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the ramSpikeTimePercentage property value. RAM spike time in percentage. Valid values 0 to 100
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getRamSpikeTimePercentage() {
        return this._ramSpikeTimePercentage;
    }
    /**
     * Gets the ramSpikeTimePercentageThreshold property value. Threshold of ramSpikeTimeScore. Valid values 0 to 100
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getRamSpikeTimePercentageThreshold() {
        return this._ramSpikeTimePercentageThreshold;
    }
    /**
     * Gets the ramSpikeTimeScore property value. The user experience analytics device RAM spike time score. Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRamSpikeTimeScore() {
        return this._ramSpikeTimeScore;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setAverageSpikeTimeScore(@javax.annotation.Nullable final Integer value) {
        this._averageSpikeTimeScore = value;
    }
    /**
     * Sets the cpuSpikeTimePercentage property value. CPU spike time in percentage. Valid values 0 to 100
     * @param value Value to set for the cpuSpikeTimePercentage property.
     * @return a void
     */
    public void setCpuSpikeTimePercentage(@javax.annotation.Nullable final Double value) {
        this._cpuSpikeTimePercentage = value;
    }
    /**
     * Sets the cpuSpikeTimePercentageThreshold property value. Threshold of cpuSpikeTimeScore. Valid values 0 to 100
     * @param value Value to set for the cpuSpikeTimePercentageThreshold property.
     * @return a void
     */
    public void setCpuSpikeTimePercentageThreshold(@javax.annotation.Nullable final Double value) {
        this._cpuSpikeTimePercentageThreshold = value;
    }
    /**
     * Sets the cpuSpikeTimeScore property value. The user experience analytics device CPU spike time score. Valid values 0 to 100
     * @param value Value to set for the cpuSpikeTimeScore property.
     * @return a void
     */
    public void setCpuSpikeTimeScore(@javax.annotation.Nullable final Integer value) {
        this._cpuSpikeTimeScore = value;
    }
    /**
     * Sets the deviceCount property value. User experience analytics summarized device count.
     * @param value Value to set for the deviceCount property.
     * @return a void
     */
    public void setDeviceCount(@javax.annotation.Nullable final Long value) {
        this._deviceCount = value;
    }
    /**
     * Sets the deviceId property value. The id of the device.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the deviceName property value. The name of the device.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the deviceResourcePerformanceScore property value. Resource performance score of a specific device. Valid values 0 to 100
     * @param value Value to set for the deviceResourcePerformanceScore property.
     * @return a void
     */
    public void setDeviceResourcePerformanceScore(@javax.annotation.Nullable final Integer value) {
        this._deviceResourcePerformanceScore = value;
    }
    /**
     * Sets the manufacturer property value. The user experience analytics device manufacturer.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the model property value. The user experience analytics device model.
     * @param value Value to set for the model property.
     * @return a void
     */
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the ramSpikeTimePercentage property value. RAM spike time in percentage. Valid values 0 to 100
     * @param value Value to set for the ramSpikeTimePercentage property.
     * @return a void
     */
    public void setRamSpikeTimePercentage(@javax.annotation.Nullable final Double value) {
        this._ramSpikeTimePercentage = value;
    }
    /**
     * Sets the ramSpikeTimePercentageThreshold property value. Threshold of ramSpikeTimeScore. Valid values 0 to 100
     * @param value Value to set for the ramSpikeTimePercentageThreshold property.
     * @return a void
     */
    public void setRamSpikeTimePercentageThreshold(@javax.annotation.Nullable final Double value) {
        this._ramSpikeTimePercentageThreshold = value;
    }
    /**
     * Sets the ramSpikeTimeScore property value. The user experience analytics device RAM spike time score. Valid values 0 to 100
     * @param value Value to set for the ramSpikeTimeScore property.
     * @return a void
     */
    public void setRamSpikeTimeScore(@javax.annotation.Nullable final Integer value) {
        this._ramSpikeTimeScore = value;
    }
}
