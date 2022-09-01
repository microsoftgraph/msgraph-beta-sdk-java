package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsDeviceStartupHistory extends Entity implements Parsable {
    /** The user experience analytics device core boot time in milliseconds. */
    private Integer _coreBootTimeInMs;
    /** The user experience analytics device core login time in milliseconds. */
    private Integer _coreLoginTimeInMs;
    /** The user experience analytics device id. */
    private String _deviceId;
    /** The user experience analytics device feature update time in milliseconds. */
    private Integer _featureUpdateBootTimeInMs;
    /** The User experience analytics Device group policy boot time in milliseconds. */
    private Integer _groupPolicyBootTimeInMs;
    /** The User experience analytics Device group policy login time in milliseconds. */
    private Integer _groupPolicyLoginTimeInMs;
    /** The user experience analytics device boot record is a feature update. */
    private Boolean _isFeatureUpdate;
    /** The user experience analytics device first login. */
    private Boolean _isFirstLogin;
    /** The user experience analytics device boot record's operating system version. */
    private String _operatingSystemVersion;
    /** The user experience analytics responsive desktop time in milliseconds. */
    private Integer _responsiveDesktopTimeInMs;
    /** Operating System restart category */
    private UserExperienceAnalyticsOperatingSystemRestartCategory _restartCategory;
    /** OS restart fault bucket. The fault bucket is used to find additional information about a system crash. */
    private String _restartFaultBucket;
    /** OS restart stop code. This shows the bug check code which can be used to look up the blue screen reason. */
    private String _restartStopCode;
    /** The user experience analytics device boot start time. */
    private OffsetDateTime _startTime;
    /** The user experience analytics device total boot time in milliseconds. */
    private Integer _totalBootTimeInMs;
    /** The user experience analytics device total login time in milliseconds. */
    private Integer _totalLoginTimeInMs;
    /**
     * Instantiates a new UserExperienceAnalyticsDeviceStartupHistory and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsDeviceStartupHistory() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsDeviceStartupHistory");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsDeviceStartupHistory
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceStartupHistory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceStartupHistory();
    }
    /**
     * Gets the coreBootTimeInMs property value. The user experience analytics device core boot time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCoreBootTimeInMs() {
        return this._coreBootTimeInMs;
    }
    /**
     * Gets the coreLoginTimeInMs property value. The user experience analytics device core login time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCoreLoginTimeInMs() {
        return this._coreLoginTimeInMs;
    }
    /**
     * Gets the deviceId property value. The user experience analytics device id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the featureUpdateBootTimeInMs property value. The user experience analytics device feature update time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFeatureUpdateBootTimeInMs() {
        return this._featureUpdateBootTimeInMs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsDeviceStartupHistory currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("coreBootTimeInMs", (n) -> { currentObject.setCoreBootTimeInMs(n.getIntegerValue()); });
            this.put("coreLoginTimeInMs", (n) -> { currentObject.setCoreLoginTimeInMs(n.getIntegerValue()); });
            this.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
            this.put("featureUpdateBootTimeInMs", (n) -> { currentObject.setFeatureUpdateBootTimeInMs(n.getIntegerValue()); });
            this.put("groupPolicyBootTimeInMs", (n) -> { currentObject.setGroupPolicyBootTimeInMs(n.getIntegerValue()); });
            this.put("groupPolicyLoginTimeInMs", (n) -> { currentObject.setGroupPolicyLoginTimeInMs(n.getIntegerValue()); });
            this.put("isFeatureUpdate", (n) -> { currentObject.setIsFeatureUpdate(n.getBooleanValue()); });
            this.put("isFirstLogin", (n) -> { currentObject.setIsFirstLogin(n.getBooleanValue()); });
            this.put("operatingSystemVersion", (n) -> { currentObject.setOperatingSystemVersion(n.getStringValue()); });
            this.put("responsiveDesktopTimeInMs", (n) -> { currentObject.setResponsiveDesktopTimeInMs(n.getIntegerValue()); });
            this.put("restartCategory", (n) -> { currentObject.setRestartCategory(n.getEnumValue(UserExperienceAnalyticsOperatingSystemRestartCategory.class)); });
            this.put("restartFaultBucket", (n) -> { currentObject.setRestartFaultBucket(n.getStringValue()); });
            this.put("restartStopCode", (n) -> { currentObject.setRestartStopCode(n.getStringValue()); });
            this.put("startTime", (n) -> { currentObject.setStartTime(n.getOffsetDateTimeValue()); });
            this.put("totalBootTimeInMs", (n) -> { currentObject.setTotalBootTimeInMs(n.getIntegerValue()); });
            this.put("totalLoginTimeInMs", (n) -> { currentObject.setTotalLoginTimeInMs(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the groupPolicyBootTimeInMs property value. The User experience analytics Device group policy boot time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGroupPolicyBootTimeInMs() {
        return this._groupPolicyBootTimeInMs;
    }
    /**
     * Gets the groupPolicyLoginTimeInMs property value. The User experience analytics Device group policy login time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGroupPolicyLoginTimeInMs() {
        return this._groupPolicyLoginTimeInMs;
    }
    /**
     * Gets the isFeatureUpdate property value. The user experience analytics device boot record is a feature update.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFeatureUpdate() {
        return this._isFeatureUpdate;
    }
    /**
     * Gets the isFirstLogin property value. The user experience analytics device first login.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFirstLogin() {
        return this._isFirstLogin;
    }
    /**
     * Gets the operatingSystemVersion property value. The user experience analytics device boot record's operating system version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystemVersion() {
        return this._operatingSystemVersion;
    }
    /**
     * Gets the responsiveDesktopTimeInMs property value. The user experience analytics responsive desktop time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getResponsiveDesktopTimeInMs() {
        return this._responsiveDesktopTimeInMs;
    }
    /**
     * Gets the restartCategory property value. Operating System restart category
     * @return a userExperienceAnalyticsOperatingSystemRestartCategory
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsOperatingSystemRestartCategory getRestartCategory() {
        return this._restartCategory;
    }
    /**
     * Gets the restartFaultBucket property value. OS restart fault bucket. The fault bucket is used to find additional information about a system crash.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRestartFaultBucket() {
        return this._restartFaultBucket;
    }
    /**
     * Gets the restartStopCode property value. OS restart stop code. This shows the bug check code which can be used to look up the blue screen reason.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRestartStopCode() {
        return this._restartStopCode;
    }
    /**
     * Gets the startTime property value. The user experience analytics device boot start time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartTime() {
        return this._startTime;
    }
    /**
     * Gets the totalBootTimeInMs property value. The user experience analytics device total boot time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalBootTimeInMs() {
        return this._totalBootTimeInMs;
    }
    /**
     * Gets the totalLoginTimeInMs property value. The user experience analytics device total login time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalLoginTimeInMs() {
        return this._totalLoginTimeInMs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("coreBootTimeInMs", this.getCoreBootTimeInMs());
        writer.writeIntegerValue("coreLoginTimeInMs", this.getCoreLoginTimeInMs());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeIntegerValue("featureUpdateBootTimeInMs", this.getFeatureUpdateBootTimeInMs());
        writer.writeIntegerValue("groupPolicyBootTimeInMs", this.getGroupPolicyBootTimeInMs());
        writer.writeIntegerValue("groupPolicyLoginTimeInMs", this.getGroupPolicyLoginTimeInMs());
        writer.writeBooleanValue("isFeatureUpdate", this.getIsFeatureUpdate());
        writer.writeBooleanValue("isFirstLogin", this.getIsFirstLogin());
        writer.writeStringValue("operatingSystemVersion", this.getOperatingSystemVersion());
        writer.writeIntegerValue("responsiveDesktopTimeInMs", this.getResponsiveDesktopTimeInMs());
        writer.writeEnumValue("restartCategory", this.getRestartCategory());
        writer.writeStringValue("restartFaultBucket", this.getRestartFaultBucket());
        writer.writeStringValue("restartStopCode", this.getRestartStopCode());
        writer.writeOffsetDateTimeValue("startTime", this.getStartTime());
        writer.writeIntegerValue("totalBootTimeInMs", this.getTotalBootTimeInMs());
        writer.writeIntegerValue("totalLoginTimeInMs", this.getTotalLoginTimeInMs());
    }
    /**
     * Sets the coreBootTimeInMs property value. The user experience analytics device core boot time in milliseconds.
     * @param value Value to set for the coreBootTimeInMs property.
     * @return a void
     */
    public void setCoreBootTimeInMs(@javax.annotation.Nullable final Integer value) {
        this._coreBootTimeInMs = value;
    }
    /**
     * Sets the coreLoginTimeInMs property value. The user experience analytics device core login time in milliseconds.
     * @param value Value to set for the coreLoginTimeInMs property.
     * @return a void
     */
    public void setCoreLoginTimeInMs(@javax.annotation.Nullable final Integer value) {
        this._coreLoginTimeInMs = value;
    }
    /**
     * Sets the deviceId property value. The user experience analytics device id.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the featureUpdateBootTimeInMs property value. The user experience analytics device feature update time in milliseconds.
     * @param value Value to set for the featureUpdateBootTimeInMs property.
     * @return a void
     */
    public void setFeatureUpdateBootTimeInMs(@javax.annotation.Nullable final Integer value) {
        this._featureUpdateBootTimeInMs = value;
    }
    /**
     * Sets the groupPolicyBootTimeInMs property value. The User experience analytics Device group policy boot time in milliseconds.
     * @param value Value to set for the groupPolicyBootTimeInMs property.
     * @return a void
     */
    public void setGroupPolicyBootTimeInMs(@javax.annotation.Nullable final Integer value) {
        this._groupPolicyBootTimeInMs = value;
    }
    /**
     * Sets the groupPolicyLoginTimeInMs property value. The User experience analytics Device group policy login time in milliseconds.
     * @param value Value to set for the groupPolicyLoginTimeInMs property.
     * @return a void
     */
    public void setGroupPolicyLoginTimeInMs(@javax.annotation.Nullable final Integer value) {
        this._groupPolicyLoginTimeInMs = value;
    }
    /**
     * Sets the isFeatureUpdate property value. The user experience analytics device boot record is a feature update.
     * @param value Value to set for the isFeatureUpdate property.
     * @return a void
     */
    public void setIsFeatureUpdate(@javax.annotation.Nullable final Boolean value) {
        this._isFeatureUpdate = value;
    }
    /**
     * Sets the isFirstLogin property value. The user experience analytics device first login.
     * @param value Value to set for the isFirstLogin property.
     * @return a void
     */
    public void setIsFirstLogin(@javax.annotation.Nullable final Boolean value) {
        this._isFirstLogin = value;
    }
    /**
     * Sets the operatingSystemVersion property value. The user experience analytics device boot record's operating system version.
     * @param value Value to set for the operatingSystemVersion property.
     * @return a void
     */
    public void setOperatingSystemVersion(@javax.annotation.Nullable final String value) {
        this._operatingSystemVersion = value;
    }
    /**
     * Sets the responsiveDesktopTimeInMs property value. The user experience analytics responsive desktop time in milliseconds.
     * @param value Value to set for the responsiveDesktopTimeInMs property.
     * @return a void
     */
    public void setResponsiveDesktopTimeInMs(@javax.annotation.Nullable final Integer value) {
        this._responsiveDesktopTimeInMs = value;
    }
    /**
     * Sets the restartCategory property value. Operating System restart category
     * @param value Value to set for the restartCategory property.
     * @return a void
     */
    public void setRestartCategory(@javax.annotation.Nullable final UserExperienceAnalyticsOperatingSystemRestartCategory value) {
        this._restartCategory = value;
    }
    /**
     * Sets the restartFaultBucket property value. OS restart fault bucket. The fault bucket is used to find additional information about a system crash.
     * @param value Value to set for the restartFaultBucket property.
     * @return a void
     */
    public void setRestartFaultBucket(@javax.annotation.Nullable final String value) {
        this._restartFaultBucket = value;
    }
    /**
     * Sets the restartStopCode property value. OS restart stop code. This shows the bug check code which can be used to look up the blue screen reason.
     * @param value Value to set for the restartStopCode property.
     * @return a void
     */
    public void setRestartStopCode(@javax.annotation.Nullable final String value) {
        this._restartStopCode = value;
    }
    /**
     * Sets the startTime property value. The user experience analytics device boot start time.
     * @param value Value to set for the startTime property.
     * @return a void
     */
    public void setStartTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startTime = value;
    }
    /**
     * Sets the totalBootTimeInMs property value. The user experience analytics device total boot time in milliseconds.
     * @param value Value to set for the totalBootTimeInMs property.
     * @return a void
     */
    public void setTotalBootTimeInMs(@javax.annotation.Nullable final Integer value) {
        this._totalBootTimeInMs = value;
    }
    /**
     * Sets the totalLoginTimeInMs property value. The user experience analytics device total login time in milliseconds.
     * @param value Value to set for the totalLoginTimeInMs property.
     * @return a void
     */
    public void setTotalLoginTimeInMs(@javax.annotation.Nullable final Integer value) {
        this._totalLoginTimeInMs = value;
    }
}
