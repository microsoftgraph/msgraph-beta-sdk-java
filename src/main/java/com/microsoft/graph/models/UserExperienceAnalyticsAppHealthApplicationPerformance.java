package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsAppHealthApplicationPerformance extends Entity implements Parsable {
    /** The number of devices where the app has been active. Valid values -2147483648 to 2147483647 */
    private Integer _activeDeviceCount;
    /** The number of crashes for the app. Valid values -2147483648 to 2147483647 */
    private Integer _appCrashCount;
    /** The friendly name of the application. */
    private String _appDisplayName;
    /** The number of hangs for the app. Valid values -2147483648 to 2147483647 */
    private Integer _appHangCount;
    /** The health score of the app. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _appHealthScore;
    /** The overall health status of the app. */
    private String _appHealthStatus;
    /** The name of the application. */
    private String _appName;
    /** The publisher of the application. */
    private String _appPublisher;
    /** The total usage time of the application in minutes. Valid values -2147483648 to 2147483647 */
    private Integer _appUsageDuration;
    /** The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647 */
    private Integer _meanTimeToFailureInMinutes;
    /**
     * Instantiates a new UserExperienceAnalyticsAppHealthApplicationPerformance and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsAppHealthApplicationPerformance() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsAppHealthApplicationPerformance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsAppHealthApplicationPerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthApplicationPerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthApplicationPerformance();
    }
    /**
     * Gets the activeDeviceCount property value. The number of devices where the app has been active. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActiveDeviceCount() {
        return this._activeDeviceCount;
    }
    /**
     * Gets the appCrashCount property value. The number of crashes for the app. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAppCrashCount() {
        return this._appCrashCount;
    }
    /**
     * Gets the appDisplayName property value. The friendly name of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppDisplayName() {
        return this._appDisplayName;
    }
    /**
     * Gets the appHangCount property value. The number of hangs for the app. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAppHangCount() {
        return this._appHangCount;
    }
    /**
     * Gets the appHealthScore property value. The health score of the app. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getAppHealthScore() {
        return this._appHealthScore;
    }
    /**
     * Gets the appHealthStatus property value. The overall health status of the app.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppHealthStatus() {
        return this._appHealthStatus;
    }
    /**
     * Gets the appName property value. The name of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppName() {
        return this._appName;
    }
    /**
     * Gets the appPublisher property value. The publisher of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppPublisher() {
        return this._appPublisher;
    }
    /**
     * Gets the appUsageDuration property value. The total usage time of the application in minutes. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAppUsageDuration() {
        return this._appUsageDuration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsAppHealthApplicationPerformance currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activeDeviceCount", (n) -> { currentObject.setActiveDeviceCount(n.getIntegerValue()); });
            this.put("appCrashCount", (n) -> { currentObject.setAppCrashCount(n.getIntegerValue()); });
            this.put("appDisplayName", (n) -> { currentObject.setAppDisplayName(n.getStringValue()); });
            this.put("appHangCount", (n) -> { currentObject.setAppHangCount(n.getIntegerValue()); });
            this.put("appHealthScore", (n) -> { currentObject.setAppHealthScore(n.getDoubleValue()); });
            this.put("appHealthStatus", (n) -> { currentObject.setAppHealthStatus(n.getStringValue()); });
            this.put("appName", (n) -> { currentObject.setAppName(n.getStringValue()); });
            this.put("appPublisher", (n) -> { currentObject.setAppPublisher(n.getStringValue()); });
            this.put("appUsageDuration", (n) -> { currentObject.setAppUsageDuration(n.getIntegerValue()); });
            this.put("meanTimeToFailureInMinutes", (n) -> { currentObject.setMeanTimeToFailureInMinutes(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the meanTimeToFailureInMinutes property value. The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMeanTimeToFailureInMinutes() {
        return this._meanTimeToFailureInMinutes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activeDeviceCount", this.getActiveDeviceCount());
        writer.writeIntegerValue("appCrashCount", this.getAppCrashCount());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeIntegerValue("appHangCount", this.getAppHangCount());
        writer.writeDoubleValue("appHealthScore", this.getAppHealthScore());
        writer.writeStringValue("appHealthStatus", this.getAppHealthStatus());
        writer.writeStringValue("appName", this.getAppName());
        writer.writeStringValue("appPublisher", this.getAppPublisher());
        writer.writeIntegerValue("appUsageDuration", this.getAppUsageDuration());
        writer.writeIntegerValue("meanTimeToFailureInMinutes", this.getMeanTimeToFailureInMinutes());
    }
    /**
     * Sets the activeDeviceCount property value. The number of devices where the app has been active. Valid values -2147483648 to 2147483647
     * @param value Value to set for the activeDeviceCount property.
     * @return a void
     */
    public void setActiveDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._activeDeviceCount = value;
    }
    /**
     * Sets the appCrashCount property value. The number of crashes for the app. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appCrashCount property.
     * @return a void
     */
    public void setAppCrashCount(@javax.annotation.Nullable final Integer value) {
        this._appCrashCount = value;
    }
    /**
     * Sets the appDisplayName property value. The friendly name of the application.
     * @param value Value to set for the appDisplayName property.
     * @return a void
     */
    public void setAppDisplayName(@javax.annotation.Nullable final String value) {
        this._appDisplayName = value;
    }
    /**
     * Sets the appHangCount property value. The number of hangs for the app. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appHangCount property.
     * @return a void
     */
    public void setAppHangCount(@javax.annotation.Nullable final Integer value) {
        this._appHangCount = value;
    }
    /**
     * Sets the appHealthScore property value. The health score of the app. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the appHealthScore property.
     * @return a void
     */
    public void setAppHealthScore(@javax.annotation.Nullable final Double value) {
        this._appHealthScore = value;
    }
    /**
     * Sets the appHealthStatus property value. The overall health status of the app.
     * @param value Value to set for the appHealthStatus property.
     * @return a void
     */
    public void setAppHealthStatus(@javax.annotation.Nullable final String value) {
        this._appHealthStatus = value;
    }
    /**
     * Sets the appName property value. The name of the application.
     * @param value Value to set for the appName property.
     * @return a void
     */
    public void setAppName(@javax.annotation.Nullable final String value) {
        this._appName = value;
    }
    /**
     * Sets the appPublisher property value. The publisher of the application.
     * @param value Value to set for the appPublisher property.
     * @return a void
     */
    public void setAppPublisher(@javax.annotation.Nullable final String value) {
        this._appPublisher = value;
    }
    /**
     * Sets the appUsageDuration property value. The total usage time of the application in minutes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appUsageDuration property.
     * @return a void
     */
    public void setAppUsageDuration(@javax.annotation.Nullable final Integer value) {
        this._appUsageDuration = value;
    }
    /**
     * Sets the meanTimeToFailureInMinutes property value. The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the meanTimeToFailureInMinutes property.
     * @return a void
     */
    public void setMeanTimeToFailureInMinutes(@javax.annotation.Nullable final Integer value) {
        this._meanTimeToFailureInMinutes = value;
    }
}
