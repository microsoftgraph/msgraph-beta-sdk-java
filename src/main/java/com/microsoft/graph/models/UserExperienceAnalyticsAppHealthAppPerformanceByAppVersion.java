package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion extends Entity implements Parsable {
    /** The number of crashes for the app. Valid values -2147483648 to 2147483647  */
    private Integer _appCrashCount;
    /** The friendly name of the application.  */
    private String _appDisplayName;
    /** The name of the application.  */
    private String _appName;
    /** The publisher of the application.  */
    private String _appPublisher;
    /** The total usage time of the application in minutes. Valid values -2147483648 to 2147483647  */
    private Integer _appUsageDuration;
    /** The version of the application.  */
    private String _appVersion;
    /** The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647  */
    private Integer _meanTimeToFailureInMinutes;
    /**
     * Instantiates a new userExperienceAnalyticsAppHealthAppPerformanceByAppVersion and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAppHealthAppPerformanceByAppVersion
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion();
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
     * Gets the appUsageDuration property value. The total usage time of the application in minutes. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getAppUsageDuration() {
        return this._appUsageDuration;
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("appCrashCount", (n) -> { currentObject.setAppCrashCount(n.getIntegerValue()); });
            this.put("appDisplayName", (n) -> { currentObject.setAppDisplayName(n.getStringValue()); });
            this.put("appName", (n) -> { currentObject.setAppName(n.getStringValue()); });
            this.put("appPublisher", (n) -> { currentObject.setAppPublisher(n.getStringValue()); });
            this.put("appUsageDuration", (n) -> { currentObject.setAppUsageDuration(n.getIntegerValue()); });
            this.put("appVersion", (n) -> { currentObject.setAppVersion(n.getStringValue()); });
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
        writer.writeIntegerValue("appCrashCount", this.getAppCrashCount());
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appName", this.getAppName());
        writer.writeStringValue("appPublisher", this.getAppPublisher());
        writer.writeIntegerValue("appUsageDuration", this.getAppUsageDuration());
        writer.writeStringValue("appVersion", this.getAppVersion());
        writer.writeIntegerValue("meanTimeToFailureInMinutes", this.getMeanTimeToFailureInMinutes());
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
     * Sets the appUsageDuration property value. The total usage time of the application in minutes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the appUsageDuration property.
     * @return a void
     */
    public void setAppUsageDuration(@javax.annotation.Nullable final Integer value) {
        this._appUsageDuration = value;
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
     * Sets the meanTimeToFailureInMinutes property value. The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the meanTimeToFailureInMinutes property.
     * @return a void
     */
    public void setMeanTimeToFailureInMinutes(@javax.annotation.Nullable final Integer value) {
        this._meanTimeToFailureInMinutes = value;
    }
}
