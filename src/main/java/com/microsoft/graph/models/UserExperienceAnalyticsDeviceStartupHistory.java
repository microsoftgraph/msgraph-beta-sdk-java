package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsDeviceStartupHistory extends Entity implements Parsable {
    /** The user experience analytics device core boot time in milliseconds. */
    private Integer coreBootTimeInMs;
    /** The user experience analytics device core login time in milliseconds. */
    private Integer coreLoginTimeInMs;
    /** The user experience analytics device id. */
    private String deviceId;
    /** The user experience analytics device feature update time in milliseconds. */
    private Integer featureUpdateBootTimeInMs;
    /** The User experience analytics Device group policy boot time in milliseconds. */
    private Integer groupPolicyBootTimeInMs;
    /** The User experience analytics Device group policy login time in milliseconds. */
    private Integer groupPolicyLoginTimeInMs;
    /** The user experience analytics device boot record is a feature update. */
    private Boolean isFeatureUpdate;
    /** The user experience analytics device first login. */
    private Boolean isFirstLogin;
    /** The user experience analytics device boot record's operating system version. */
    private String operatingSystemVersion;
    /** The user experience analytics responsive desktop time in milliseconds. */
    private Integer responsiveDesktopTimeInMs;
    /** Operating System restart category */
    private UserExperienceAnalyticsOperatingSystemRestartCategory restartCategory;
    /** OS restart fault bucket. The fault bucket is used to find additional information about a system crash. */
    private String restartFaultBucket;
    /** OS restart stop code. This shows the bug check code which can be used to look up the blue screen reason. */
    private String restartStopCode;
    /** The user experience analytics device boot start time. */
    private OffsetDateTime startTime;
    /** The user experience analytics device total boot time in milliseconds. */
    private Integer totalBootTimeInMs;
    /** The user experience analytics device total login time in milliseconds. */
    private Integer totalLoginTimeInMs;
    /**
     * Instantiates a new UserExperienceAnalyticsDeviceStartupHistory and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsDeviceStartupHistory() {
        super();
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
        return this.coreBootTimeInMs;
    }
    /**
     * Gets the coreLoginTimeInMs property value. The user experience analytics device core login time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCoreLoginTimeInMs() {
        return this.coreLoginTimeInMs;
    }
    /**
     * Gets the deviceId property value. The user experience analytics device id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this.deviceId;
    }
    /**
     * Gets the featureUpdateBootTimeInMs property value. The user experience analytics device feature update time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFeatureUpdateBootTimeInMs() {
        return this.featureUpdateBootTimeInMs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("coreBootTimeInMs", (n) -> { this.setCoreBootTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("coreLoginTimeInMs", (n) -> { this.setCoreLoginTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("featureUpdateBootTimeInMs", (n) -> { this.setFeatureUpdateBootTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("groupPolicyBootTimeInMs", (n) -> { this.setGroupPolicyBootTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("groupPolicyLoginTimeInMs", (n) -> { this.setGroupPolicyLoginTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("isFeatureUpdate", (n) -> { this.setIsFeatureUpdate(n.getBooleanValue()); });
        deserializerMap.put("isFirstLogin", (n) -> { this.setIsFirstLogin(n.getBooleanValue()); });
        deserializerMap.put("operatingSystemVersion", (n) -> { this.setOperatingSystemVersion(n.getStringValue()); });
        deserializerMap.put("responsiveDesktopTimeInMs", (n) -> { this.setResponsiveDesktopTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("restartCategory", (n) -> { this.setRestartCategory(n.getEnumValue(UserExperienceAnalyticsOperatingSystemRestartCategory.class)); });
        deserializerMap.put("restartFaultBucket", (n) -> { this.setRestartFaultBucket(n.getStringValue()); });
        deserializerMap.put("restartStopCode", (n) -> { this.setRestartStopCode(n.getStringValue()); });
        deserializerMap.put("startTime", (n) -> { this.setStartTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("totalBootTimeInMs", (n) -> { this.setTotalBootTimeInMs(n.getIntegerValue()); });
        deserializerMap.put("totalLoginTimeInMs", (n) -> { this.setTotalLoginTimeInMs(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyBootTimeInMs property value. The User experience analytics Device group policy boot time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGroupPolicyBootTimeInMs() {
        return this.groupPolicyBootTimeInMs;
    }
    /**
     * Gets the groupPolicyLoginTimeInMs property value. The User experience analytics Device group policy login time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGroupPolicyLoginTimeInMs() {
        return this.groupPolicyLoginTimeInMs;
    }
    /**
     * Gets the isFeatureUpdate property value. The user experience analytics device boot record is a feature update.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFeatureUpdate() {
        return this.isFeatureUpdate;
    }
    /**
     * Gets the isFirstLogin property value. The user experience analytics device first login.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFirstLogin() {
        return this.isFirstLogin;
    }
    /**
     * Gets the operatingSystemVersion property value. The user experience analytics device boot record's operating system version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }
    /**
     * Gets the responsiveDesktopTimeInMs property value. The user experience analytics responsive desktop time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getResponsiveDesktopTimeInMs() {
        return this.responsiveDesktopTimeInMs;
    }
    /**
     * Gets the restartCategory property value. Operating System restart category
     * @return a userExperienceAnalyticsOperatingSystemRestartCategory
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsOperatingSystemRestartCategory getRestartCategory() {
        return this.restartCategory;
    }
    /**
     * Gets the restartFaultBucket property value. OS restart fault bucket. The fault bucket is used to find additional information about a system crash.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRestartFaultBucket() {
        return this.restartFaultBucket;
    }
    /**
     * Gets the restartStopCode property value. OS restart stop code. This shows the bug check code which can be used to look up the blue screen reason.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRestartStopCode() {
        return this.restartStopCode;
    }
    /**
     * Gets the startTime property value. The user experience analytics device boot start time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }
    /**
     * Gets the totalBootTimeInMs property value. The user experience analytics device total boot time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalBootTimeInMs() {
        return this.totalBootTimeInMs;
    }
    /**
     * Gets the totalLoginTimeInMs property value. The user experience analytics device total login time in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalLoginTimeInMs() {
        return this.totalLoginTimeInMs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setCoreBootTimeInMs(@javax.annotation.Nullable final Integer value) {
        this.coreBootTimeInMs = value;
    }
    /**
     * Sets the coreLoginTimeInMs property value. The user experience analytics device core login time in milliseconds.
     * @param value Value to set for the coreLoginTimeInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCoreLoginTimeInMs(@javax.annotation.Nullable final Integer value) {
        this.coreLoginTimeInMs = value;
    }
    /**
     * Sets the deviceId property value. The user experience analytics device id.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this.deviceId = value;
    }
    /**
     * Sets the featureUpdateBootTimeInMs property value. The user experience analytics device feature update time in milliseconds.
     * @param value Value to set for the featureUpdateBootTimeInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFeatureUpdateBootTimeInMs(@javax.annotation.Nullable final Integer value) {
        this.featureUpdateBootTimeInMs = value;
    }
    /**
     * Sets the groupPolicyBootTimeInMs property value. The User experience analytics Device group policy boot time in milliseconds.
     * @param value Value to set for the groupPolicyBootTimeInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyBootTimeInMs(@javax.annotation.Nullable final Integer value) {
        this.groupPolicyBootTimeInMs = value;
    }
    /**
     * Sets the groupPolicyLoginTimeInMs property value. The User experience analytics Device group policy login time in milliseconds.
     * @param value Value to set for the groupPolicyLoginTimeInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupPolicyLoginTimeInMs(@javax.annotation.Nullable final Integer value) {
        this.groupPolicyLoginTimeInMs = value;
    }
    /**
     * Sets the isFeatureUpdate property value. The user experience analytics device boot record is a feature update.
     * @param value Value to set for the isFeatureUpdate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsFeatureUpdate(@javax.annotation.Nullable final Boolean value) {
        this.isFeatureUpdate = value;
    }
    /**
     * Sets the isFirstLogin property value. The user experience analytics device first login.
     * @param value Value to set for the isFirstLogin property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsFirstLogin(@javax.annotation.Nullable final Boolean value) {
        this.isFirstLogin = value;
    }
    /**
     * Sets the operatingSystemVersion property value. The user experience analytics device boot record's operating system version.
     * @param value Value to set for the operatingSystemVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystemVersion(@javax.annotation.Nullable final String value) {
        this.operatingSystemVersion = value;
    }
    /**
     * Sets the responsiveDesktopTimeInMs property value. The user experience analytics responsive desktop time in milliseconds.
     * @param value Value to set for the responsiveDesktopTimeInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponsiveDesktopTimeInMs(@javax.annotation.Nullable final Integer value) {
        this.responsiveDesktopTimeInMs = value;
    }
    /**
     * Sets the restartCategory property value. Operating System restart category
     * @param value Value to set for the restartCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestartCategory(@javax.annotation.Nullable final UserExperienceAnalyticsOperatingSystemRestartCategory value) {
        this.restartCategory = value;
    }
    /**
     * Sets the restartFaultBucket property value. OS restart fault bucket. The fault bucket is used to find additional information about a system crash.
     * @param value Value to set for the restartFaultBucket property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestartFaultBucket(@javax.annotation.Nullable final String value) {
        this.restartFaultBucket = value;
    }
    /**
     * Sets the restartStopCode property value. OS restart stop code. This shows the bug check code which can be used to look up the blue screen reason.
     * @param value Value to set for the restartStopCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestartStopCode(@javax.annotation.Nullable final String value) {
        this.restartStopCode = value;
    }
    /**
     * Sets the startTime property value. The user experience analytics device boot start time.
     * @param value Value to set for the startTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startTime = value;
    }
    /**
     * Sets the totalBootTimeInMs property value. The user experience analytics device total boot time in milliseconds.
     * @param value Value to set for the totalBootTimeInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalBootTimeInMs(@javax.annotation.Nullable final Integer value) {
        this.totalBootTimeInMs = value;
    }
    /**
     * Sets the totalLoginTimeInMs property value. The user experience analytics device total login time in milliseconds.
     * @param value Value to set for the totalLoginTimeInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalLoginTimeInMs(@javax.annotation.Nullable final Integer value) {
        this.totalLoginTimeInMs = value;
    }
}
