package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsAppHealthDevicePerformance extends Entity implements Parsable {
    /** The number of app crashes for the device. Valid values -2147483648 to 2147483647 */
    private Integer _appCrashCount;
    /** The number of app hangs for the device. Valid values -2147483648 to 2147483647 */
    private Integer _appHangCount;
    /** The number of distinct app crashes for the device. Valid values -2147483648 to 2147483647 */
    private Integer _crashedAppCount;
    /** The app health score of the device. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _deviceAppHealthScore;
    /** The overall app health status of the device. */
    private String _deviceAppHealthStatus;
    /** The name of the device. */
    private String _deviceDisplayName;
    /** The id of the device. */
    private String _deviceId;
    /** The manufacturer name of the device. */
    private String _deviceManufacturer;
    /** The model name of the device. */
    private String _deviceModel;
    /** The healthStatus property */
    private UserExperienceAnalyticsHealthState _healthStatus;
    /** The mean time to failure for the device in minutes. Valid values -2147483648 to 2147483647 */
    private Integer _meanTimeToFailureInMinutes;
    /** The date and time when the statistics were last computed. */
    private OffsetDateTime _processedDateTime;
    /**
     * Instantiates a new UserExperienceAnalyticsAppHealthDevicePerformance and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsAppHealthDevicePerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsAppHealthDevicePerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthDevicePerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthDevicePerformance();
    }
    /**
     * Gets the appCrashCount property value. The number of app crashes for the device. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAppCrashCount() {
        return this._appCrashCount;
    }
    /**
     * Gets the appHangCount property value. The number of app hangs for the device. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAppHangCount() {
        return this._appHangCount;
    }
    /**
     * Gets the crashedAppCount property value. The number of distinct app crashes for the device. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCrashedAppCount() {
        return this._crashedAppCount;
    }
    /**
     * Gets the deviceAppHealthScore property value. The app health score of the device. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getDeviceAppHealthScore() {
        return this._deviceAppHealthScore;
    }
    /**
     * Gets the deviceAppHealthStatus property value. The overall app health status of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceAppHealthStatus() {
        return this._deviceAppHealthStatus;
    }
    /**
     * Gets the deviceDisplayName property value. The name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceDisplayName() {
        return this._deviceDisplayName;
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
     * Gets the deviceManufacturer property value. The manufacturer name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceManufacturer() {
        return this._deviceManufacturer;
    }
    /**
     * Gets the deviceModel property value. The model name of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceModel() {
        return this._deviceModel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsAppHealthDevicePerformance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appCrashCount", (n) -> { currentObject.setAppCrashCount(n.getIntegerValue()); });
            this.put("appHangCount", (n) -> { currentObject.setAppHangCount(n.getIntegerValue()); });
            this.put("crashedAppCount", (n) -> { currentObject.setCrashedAppCount(n.getIntegerValue()); });
            this.put("deviceAppHealthScore", (n) -> { currentObject.setDeviceAppHealthScore(n.getDoubleValue()); });
            this.put("deviceAppHealthStatus", (n) -> { currentObject.setDeviceAppHealthStatus(n.getStringValue()); });
            this.put("deviceDisplayName", (n) -> { currentObject.setDeviceDisplayName(n.getStringValue()); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("deviceManufacturer", (n) -> { currentObject.setDeviceManufacturer(n.getStringValue()); });
            this.put("deviceModel", (n) -> { currentObject.setDeviceModel(n.getStringValue()); });
            this.put("healthStatus", (n) -> { currentObject.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState.class)); });
            this.put("meanTimeToFailureInMinutes", (n) -> { currentObject.setMeanTimeToFailureInMinutes(n.getIntegerValue()); });
            this.put("processedDateTime", (n) -> { currentObject.setProcessedDateTime(n.getOffsetDateTimeValue()); });
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
     * Gets the meanTimeToFailureInMinutes property value. The mean time to failure for the device in minutes. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMeanTimeToFailureInMinutes() {
        return this._meanTimeToFailureInMinutes;
    }
    /**
     * Gets the processedDateTime property value. The date and time when the statistics were last computed.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getProcessedDateTime() {
        return this._processedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("appCrashCount", this.getAppCrashCount());
        writer.writeIntegerValue("appHangCount", this.getAppHangCount());
        writer.writeIntegerValue("crashedAppCount", this.getCrashedAppCount());
        writer.writeDoubleValue("deviceAppHealthScore", this.getDeviceAppHealthScore());
        writer.writeStringValue("deviceAppHealthStatus", this.getDeviceAppHealthStatus());
        writer.writeStringValue("deviceDisplayName", this.getDeviceDisplayName());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceManufacturer", this.getDeviceManufacturer());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeIntegerValue("meanTimeToFailureInMinutes", this.getMeanTimeToFailureInMinutes());
        writer.writeOffsetDateTimeValue("processedDateTime", this.getProcessedDateTime());
    }
    /**
     * Sets the appCrashCount property value. The number of app crashes for the device. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appCrashCount property.
     * @return a void
     */
    public void setAppCrashCount(@javax.annotation.Nullable final Integer value) {
        this._appCrashCount = value;
    }
    /**
     * Sets the appHangCount property value. The number of app hangs for the device. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appHangCount property.
     * @return a void
     */
    public void setAppHangCount(@javax.annotation.Nullable final Integer value) {
        this._appHangCount = value;
    }
    /**
     * Sets the crashedAppCount property value. The number of distinct app crashes for the device. Valid values -2147483648 to 2147483647
     * @param value Value to set for the crashedAppCount property.
     * @return a void
     */
    public void setCrashedAppCount(@javax.annotation.Nullable final Integer value) {
        this._crashedAppCount = value;
    }
    /**
     * Sets the deviceAppHealthScore property value. The app health score of the device. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the deviceAppHealthScore property.
     * @return a void
     */
    public void setDeviceAppHealthScore(@javax.annotation.Nullable final Double value) {
        this._deviceAppHealthScore = value;
    }
    /**
     * Sets the deviceAppHealthStatus property value. The overall app health status of the device.
     * @param value Value to set for the deviceAppHealthStatus property.
     * @return a void
     */
    public void setDeviceAppHealthStatus(@javax.annotation.Nullable final String value) {
        this._deviceAppHealthStatus = value;
    }
    /**
     * Sets the deviceDisplayName property value. The name of the device.
     * @param value Value to set for the deviceDisplayName property.
     * @return a void
     */
    public void setDeviceDisplayName(@javax.annotation.Nullable final String value) {
        this._deviceDisplayName = value;
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
     * Sets the deviceManufacturer property value. The manufacturer name of the device.
     * @param value Value to set for the deviceManufacturer property.
     * @return a void
     */
    public void setDeviceManufacturer(@javax.annotation.Nullable final String value) {
        this._deviceManufacturer = value;
    }
    /**
     * Sets the deviceModel property value. The model name of the device.
     * @param value Value to set for the deviceModel property.
     * @return a void
     */
    public void setDeviceModel(@javax.annotation.Nullable final String value) {
        this._deviceModel = value;
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
     * Sets the meanTimeToFailureInMinutes property value. The mean time to failure for the device in minutes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the meanTimeToFailureInMinutes property.
     * @return a void
     */
    public void setMeanTimeToFailureInMinutes(@javax.annotation.Nullable final Integer value) {
        this._meanTimeToFailureInMinutes = value;
    }
    /**
     * Sets the processedDateTime property value. The date and time when the statistics were last computed.
     * @param value Value to set for the processedDateTime property.
     * @return a void
     */
    public void setProcessedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._processedDateTime = value;
    }
}
