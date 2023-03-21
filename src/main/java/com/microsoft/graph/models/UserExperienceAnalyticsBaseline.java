package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserExperienceAnalyticsBaseline extends Entity implements Parsable {
    /** The user experience analytics app health metrics. */
    private UserExperienceAnalyticsCategory appHealthMetrics;
    /** The user experience analytics battery health metrics. */
    private UserExperienceAnalyticsCategory batteryHealthMetrics;
    /** The user experience analytics best practices metrics. */
    private UserExperienceAnalyticsCategory bestPracticesMetrics;
    /** The date the custom baseline was created. */
    private OffsetDateTime createdDateTime;
    /** The user experience analytics device boot performance metrics. */
    private UserExperienceAnalyticsCategory deviceBootPerformanceMetrics;
    /** The name of the user experience analytics baseline. */
    private String displayName;
    /** Signifies if the current baseline is the commercial median baseline or a custom baseline. */
    private Boolean isBuiltIn;
    /** The user experience analytics reboot analytics metrics. */
    private UserExperienceAnalyticsCategory rebootAnalyticsMetrics;
    /** The user experience analytics resource performance metrics. */
    private UserExperienceAnalyticsCategory resourcePerformanceMetrics;
    /** The user experience analytics work from anywhere metrics. */
    private UserExperienceAnalyticsCategory workFromAnywhereMetrics;
    /**
     * Instantiates a new UserExperienceAnalyticsBaseline and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsBaseline() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsBaseline
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsBaseline createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsBaseline();
    }
    /**
     * Gets the appHealthMetrics property value. The user experience analytics app health metrics.
     * @return a userExperienceAnalyticsCategory
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsCategory getAppHealthMetrics() {
        return this.appHealthMetrics;
    }
    /**
     * Gets the batteryHealthMetrics property value. The user experience analytics battery health metrics.
     * @return a userExperienceAnalyticsCategory
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsCategory getBatteryHealthMetrics() {
        return this.batteryHealthMetrics;
    }
    /**
     * Gets the bestPracticesMetrics property value. The user experience analytics best practices metrics.
     * @return a userExperienceAnalyticsCategory
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsCategory getBestPracticesMetrics() {
        return this.bestPracticesMetrics;
    }
    /**
     * Gets the createdDateTime property value. The date the custom baseline was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the deviceBootPerformanceMetrics property value. The user experience analytics device boot performance metrics.
     * @return a userExperienceAnalyticsCategory
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsCategory getDeviceBootPerformanceMetrics() {
        return this.deviceBootPerformanceMetrics;
    }
    /**
     * Gets the displayName property value. The name of the user experience analytics baseline.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appHealthMetrics", (n) -> { this.setAppHealthMetrics(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("batteryHealthMetrics", (n) -> { this.setBatteryHealthMetrics(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("bestPracticesMetrics", (n) -> { this.setBestPracticesMetrics(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceBootPerformanceMetrics", (n) -> { this.setDeviceBootPerformanceMetrics(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isBuiltIn", (n) -> { this.setIsBuiltIn(n.getBooleanValue()); });
        deserializerMap.put("rebootAnalyticsMetrics", (n) -> { this.setRebootAnalyticsMetrics(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("resourcePerformanceMetrics", (n) -> { this.setResourcePerformanceMetrics(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("workFromAnywhereMetrics", (n) -> { this.setWorkFromAnywhereMetrics(n.getObjectValue(UserExperienceAnalyticsCategory::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isBuiltIn property value. Signifies if the current baseline is the commercial median baseline or a custom baseline.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBuiltIn() {
        return this.isBuiltIn;
    }
    /**
     * Gets the rebootAnalyticsMetrics property value. The user experience analytics reboot analytics metrics.
     * @return a userExperienceAnalyticsCategory
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsCategory getRebootAnalyticsMetrics() {
        return this.rebootAnalyticsMetrics;
    }
    /**
     * Gets the resourcePerformanceMetrics property value. The user experience analytics resource performance metrics.
     * @return a userExperienceAnalyticsCategory
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsCategory getResourcePerformanceMetrics() {
        return this.resourcePerformanceMetrics;
    }
    /**
     * Gets the workFromAnywhereMetrics property value. The user experience analytics work from anywhere metrics.
     * @return a userExperienceAnalyticsCategory
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsCategory getWorkFromAnywhereMetrics() {
        return this.workFromAnywhereMetrics;
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
        writer.writeObjectValue("appHealthMetrics", this.getAppHealthMetrics());
        writer.writeObjectValue("batteryHealthMetrics", this.getBatteryHealthMetrics());
        writer.writeObjectValue("bestPracticesMetrics", this.getBestPracticesMetrics());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("deviceBootPerformanceMetrics", this.getDeviceBootPerformanceMetrics());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isBuiltIn", this.getIsBuiltIn());
        writer.writeObjectValue("rebootAnalyticsMetrics", this.getRebootAnalyticsMetrics());
        writer.writeObjectValue("resourcePerformanceMetrics", this.getResourcePerformanceMetrics());
        writer.writeObjectValue("workFromAnywhereMetrics", this.getWorkFromAnywhereMetrics());
    }
    /**
     * Sets the appHealthMetrics property value. The user experience analytics app health metrics.
     * @param value Value to set for the appHealthMetrics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppHealthMetrics(@javax.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.appHealthMetrics = value;
    }
    /**
     * Sets the batteryHealthMetrics property value. The user experience analytics battery health metrics.
     * @param value Value to set for the batteryHealthMetrics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBatteryHealthMetrics(@javax.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.batteryHealthMetrics = value;
    }
    /**
     * Sets the bestPracticesMetrics property value. The user experience analytics best practices metrics.
     * @param value Value to set for the bestPracticesMetrics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBestPracticesMetrics(@javax.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.bestPracticesMetrics = value;
    }
    /**
     * Sets the createdDateTime property value. The date the custom baseline was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the deviceBootPerformanceMetrics property value. The user experience analytics device boot performance metrics.
     * @param value Value to set for the deviceBootPerformanceMetrics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceBootPerformanceMetrics(@javax.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.deviceBootPerformanceMetrics = value;
    }
    /**
     * Sets the displayName property value. The name of the user experience analytics baseline.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the isBuiltIn property value. Signifies if the current baseline is the commercial median baseline or a custom baseline.
     * @param value Value to set for the isBuiltIn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsBuiltIn(@javax.annotation.Nullable final Boolean value) {
        this.isBuiltIn = value;
    }
    /**
     * Sets the rebootAnalyticsMetrics property value. The user experience analytics reboot analytics metrics.
     * @param value Value to set for the rebootAnalyticsMetrics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRebootAnalyticsMetrics(@javax.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.rebootAnalyticsMetrics = value;
    }
    /**
     * Sets the resourcePerformanceMetrics property value. The user experience analytics resource performance metrics.
     * @param value Value to set for the resourcePerformanceMetrics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourcePerformanceMetrics(@javax.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.resourcePerformanceMetrics = value;
    }
    /**
     * Sets the workFromAnywhereMetrics property value. The user experience analytics work from anywhere metrics.
     * @param value Value to set for the workFromAnywhereMetrics property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkFromAnywhereMetrics(@javax.annotation.Nullable final UserExperienceAnalyticsCategory value) {
        this.workFromAnywhereMetrics = value;
    }
}
