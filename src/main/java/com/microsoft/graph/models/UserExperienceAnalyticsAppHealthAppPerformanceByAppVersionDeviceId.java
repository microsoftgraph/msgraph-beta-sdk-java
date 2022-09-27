package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics application performance entity contains app performance by app version device id. */
public class UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId extends Entity implements Parsable {
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
    /** The name of the device. */
    private String _deviceDisplayName;
    /** The id of the device. */
    private String _deviceId;
    /** The date and time when the statistics were last computed. */
    private OffsetDateTime _processedDateTime;
    /**
     * Instantiates a new userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("appCrashCount", (n) -> { currentObject.setAppCrashCount(n.getIntegerValue()); });
            this.put("appDisplayName", (n) -> { currentObject.setAppDisplayName(n.getStringValue()); });
            this.put("appName", (n) -> { currentObject.setAppName(n.getStringValue()); });
            this.put("appPublisher", (n) -> { currentObject.setAppPublisher(n.getStringValue()); });
            this.put("appVersion", (n) -> { currentObject.setAppVersion(n.getStringValue()); });
            this.put("deviceDisplayName", (n) -> { currentObject.setDeviceDisplayName(n.getStringValue()); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("processedDateTime", (n) -> { currentObject.setProcessedDateTime(n.getOffsetDateTimeValue()); });
        }};
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
        writer.writeStringValue("appDisplayName", this.getAppDisplayName());
        writer.writeStringValue("appName", this.getAppName());
        writer.writeStringValue("appPublisher", this.getAppPublisher());
        writer.writeStringValue("appVersion", this.getAppVersion());
        writer.writeStringValue("deviceDisplayName", this.getDeviceDisplayName());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeOffsetDateTimeValue("processedDateTime", this.getProcessedDateTime());
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
     * Sets the processedDateTime property value. The date and time when the statistics were last computed.
     * @param value Value to set for the processedDateTime property.
     * @return a void
     */
    public void setProcessedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._processedDateTime = value;
    }
}
