package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsBatteryHealthDevicePerformance extends Entity implements Parsable {
    /** Estimated battery age. Unit in days. Valid values -2147483648 to 2147483647 */
    private Integer _batteryAgeInDays;
    /** A weighted average of a device’s maximum capacity score and runtime estimate score. Values range from 0-100. Valid values -2147483648 to 2147483647 */
    private Integer _deviceBatteryHealthScore;
    /** The unique identifier of the device, Intune DeviceID. */
    private String _deviceId;
    /** Device friendly name. */
    private String _deviceName;
    /** The estimated runtime of the device when the battery is fully charged. Unit in minutes. Valid values -2147483648 to 2147483647 */
    private Integer _estimatedRuntimeInMinutes;
    /** The healthStatus property */
    private UserExperienceAnalyticsHealthState _healthStatus;
    /** The manufacturer name of the device. */
    private String _manufacturer;
    /** Ratio of current capacity and design capacity of the battery with the lowest capacity. Unit in percentage and values range from 0-100. Valid values -2147483648 to 2147483647 */
    private Integer _maxCapacityPercentage;
    /** The model name of the device. */
    private String _model;
    /**
     * Instantiates a new UserExperienceAnalyticsBatteryHealthDevicePerformance and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsBatteryHealthDevicePerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsBatteryHealthDevicePerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsBatteryHealthDevicePerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBatteryHealthDevicePerformance();
    }
    /**
     * Gets the batteryAgeInDays property value. Estimated battery age. Unit in days. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBatteryAgeInDays() {
        return this._batteryAgeInDays;
    }
    /**
     * Gets the deviceBatteryHealthScore property value. A weighted average of a device’s maximum capacity score and runtime estimate score. Values range from 0-100. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceBatteryHealthScore() {
        return this._deviceBatteryHealthScore;
    }
    /**
     * Gets the deviceId property value. The unique identifier of the device, Intune DeviceID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the deviceName property value. Device friendly name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the estimatedRuntimeInMinutes property value. The estimated runtime of the device when the battery is fully charged. Unit in minutes. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEstimatedRuntimeInMinutes() {
        return this._estimatedRuntimeInMinutes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsBatteryHealthDevicePerformance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("batteryAgeInDays", (n) -> { currentObject.setBatteryAgeInDays(n.getIntegerValue()); });
            this.put("deviceBatteryHealthScore", (n) -> { currentObject.setDeviceBatteryHealthScore(n.getIntegerValue()); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("estimatedRuntimeInMinutes", (n) -> { currentObject.setEstimatedRuntimeInMinutes(n.getIntegerValue()); });
            this.put("healthStatus", (n) -> { currentObject.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState.class)); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("maxCapacityPercentage", (n) -> { currentObject.setMaxCapacityPercentage(n.getIntegerValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
        }};
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a userExperienceAnalyticsHealthState
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsHealthState getHealthStatus() {
        return this._healthStatus;
    }
    /**
     * Gets the manufacturer property value. The manufacturer name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the maxCapacityPercentage property value. Ratio of current capacity and design capacity of the battery with the lowest capacity. Unit in percentage and values range from 0-100. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxCapacityPercentage() {
        return this._maxCapacityPercentage;
    }
    /**
     * Gets the model property value. The model name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("batteryAgeInDays", this.getBatteryAgeInDays());
        writer.writeIntegerValue("deviceBatteryHealthScore", this.getDeviceBatteryHealthScore());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeIntegerValue("estimatedRuntimeInMinutes", this.getEstimatedRuntimeInMinutes());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeIntegerValue("maxCapacityPercentage", this.getMaxCapacityPercentage());
        writer.writeStringValue("model", this.getModel());
    }
    /**
     * Sets the batteryAgeInDays property value. Estimated battery age. Unit in days. Valid values -2147483648 to 2147483647
     * @param value Value to set for the batteryAgeInDays property.
     * @return a void
     */
    public void setBatteryAgeInDays(@javax.annotation.Nullable final Integer value) {
        this._batteryAgeInDays = value;
    }
    /**
     * Sets the deviceBatteryHealthScore property value. A weighted average of a device’s maximum capacity score and runtime estimate score. Values range from 0-100. Valid values -2147483648 to 2147483647
     * @param value Value to set for the deviceBatteryHealthScore property.
     * @return a void
     */
    public void setDeviceBatteryHealthScore(@javax.annotation.Nullable final Integer value) {
        this._deviceBatteryHealthScore = value;
    }
    /**
     * Sets the deviceId property value. The unique identifier of the device, Intune DeviceID.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the deviceName property value. Device friendly name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the estimatedRuntimeInMinutes property value. The estimated runtime of the device when the battery is fully charged. Unit in minutes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the estimatedRuntimeInMinutes property.
     * @return a void
     */
    public void setEstimatedRuntimeInMinutes(@javax.annotation.Nullable final Integer value) {
        this._estimatedRuntimeInMinutes = value;
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    public void setHealthStatus(@javax.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this._healthStatus = value;
    }
    /**
     * Sets the manufacturer property value. The manufacturer name of the device.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the maxCapacityPercentage property value. Ratio of current capacity and design capacity of the battery with the lowest capacity. Unit in percentage and values range from 0-100. Valid values -2147483648 to 2147483647
     * @param value Value to set for the maxCapacityPercentage property.
     * @return a void
     */
    public void setMaxCapacityPercentage(@javax.annotation.Nullable final Integer value) {
        this._maxCapacityPercentage = value;
    }
    /**
     * Sets the model property value. The model name of the device.
     * @param value Value to set for the model property.
     * @return a void
     */
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
}
