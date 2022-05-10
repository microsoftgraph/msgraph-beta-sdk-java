package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails extends Entity implements Parsable {
    /** The number of crashes for the app. Valid values -2147483648 to 2147483647 */
    private Integer _appCrashCount;
    /** The friendly name of the application. */
    private String _appDisplayName;
    /** The name of the application. */
    private String _appName;
    /** The publisher of the application. */
    private String _appPublisher;
    /** The version of the application. */
    private String _appVersion;
    /** The total number of devices that have reported one or more application crashes for this application and version. Valid values -2147483648 to 2147483647 */
    private Integer _deviceCountWithCrashes;
    /** Is the version of application the latest version for that app that is in use. */
    private Boolean _isLatestUsedVersion;
    /** Is the version of application the most used version for that app. */
    private Boolean _isMostUsedVersion;
    /**
     * Instantiates a new userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails();
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
     * Gets the appVersion property value. The version of the application.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppVersion() {
        return this._appVersion;
    }
    /**
     * Gets the deviceCountWithCrashes property value. The total number of devices that have reported one or more application crashes for this application and version. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceCountWithCrashes() {
        return this._deviceCountWithCrashes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appCrashCount", (n) -> { currentObject.setAppCrashCount(n.getIntegerValue()); });
            this.put("appDisplayName", (n) -> { currentObject.setAppDisplayName(n.getStringValue()); });
            this.put("appName", (n) -> { currentObject.setAppName(n.getStringValue()); });
            this.put("appPublisher", (n) -> { currentObject.setAppPublisher(n.getStringValue()); });
            this.put("appVersion", (n) -> { currentObject.setAppVersion(n.getStringValue()); });
            this.put("deviceCountWithCrashes", (n) -> { currentObject.setDeviceCountWithCrashes(n.getIntegerValue()); });
            this.put("isLatestUsedVersion", (n) -> { currentObject.setIsLatestUsedVersion(n.getBooleanValue()); });
            this.put("isMostUsedVersion", (n) -> { currentObject.setIsMostUsedVersion(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isLatestUsedVersion property value. Is the version of application the latest version for that app that is in use.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsLatestUsedVersion() {
        return this._isLatestUsedVersion;
    }
    /**
     * Gets the isMostUsedVersion property value. Is the version of application the most used version for that app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMostUsedVersion() {
        return this._isMostUsedVersion;
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
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appName", this.getAppName());
        writer.writeStringValue("appPublisher", this.getAppPublisher());
        writer.writeStringValue("appVersion", this.getAppVersion());
        writer.writeIntegerValue("deviceCountWithCrashes", this.getDeviceCountWithCrashes());
        writer.writeBooleanValue("isLatestUsedVersion", this.getIsLatestUsedVersion());
        writer.writeBooleanValue("isMostUsedVersion", this.getIsMostUsedVersion());
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
     * Sets the appVersion property value. The version of the application.
     * @param value Value to set for the appVersion property.
     * @return a void
     */
    public void setAppVersion(@javax.annotation.Nullable final String value) {
        this._appVersion = value;
    }
    /**
     * Sets the deviceCountWithCrashes property value. The total number of devices that have reported one or more application crashes for this application and version. Valid values -2147483648 to 2147483647
     * @param value Value to set for the deviceCountWithCrashes property.
     * @return a void
     */
    public void setDeviceCountWithCrashes(@javax.annotation.Nullable final Integer value) {
        this._deviceCountWithCrashes = value;
    }
    /**
     * Sets the isLatestUsedVersion property value. Is the version of application the latest version for that app that is in use.
     * @param value Value to set for the isLatestUsedVersion property.
     * @return a void
     */
    public void setIsLatestUsedVersion(@javax.annotation.Nullable final Boolean value) {
        this._isLatestUsedVersion = value;
    }
    /**
     * Sets the isMostUsedVersion property value. Is the version of application the most used version for that app.
     * @param value Value to set for the isMostUsedVersion property.
     * @return a void
     */
    public void setIsMostUsedVersion(@javax.annotation.Nullable final Boolean value) {
        this._isMostUsedVersion = value;
    }
}
