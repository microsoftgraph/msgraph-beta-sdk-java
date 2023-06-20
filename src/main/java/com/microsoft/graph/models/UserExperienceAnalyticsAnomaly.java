package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analytics anomaly entity contains anomaly details.
 */
public class UserExperienceAnalyticsAnomaly extends Entity implements Parsable {
    /** Indicates the first occurrence date and time for the anomaly. */
    private OffsetDateTime anomalyFirstOccurrenceDateTime;
    /** The unique identifier of the anomaly. */
    private String anomalyId;
    /** Indicates the latest occurrence date and time for the anomaly. */
    private OffsetDateTime anomalyLatestOccurrenceDateTime;
    /** The name of the anomaly. */
    private String anomalyName;
    /** Indicates the category of the anomaly. Eg: anomaly type can be device, application, stop error, driver or other. */
    private UserExperienceAnalyticsAnomalyType anomalyType;
    /** The name of the application or module that caused the anomaly. */
    private String assetName;
    /** The publisher of the application or module that caused the anomaly. */
    private String assetPublisher;
    /** The version of the application or module that caused the anomaly. */
    private String assetVersion;
    /** The unique identifier of the anomaly detection model. */
    private String detectionModelId;
    /** The number of devices impacted by the anomaly. Valid values -2147483648 to 2147483647 */
    private Integer deviceImpactedCount;
    /** The unique identifier of the anomaly detection model. */
    private String issueId;
    /** Indicates the severity of the anomaly. Eg: anomaly severity can be high, medium, low, informational or other. */
    private UserExperienceAnalyticsAnomalySeverity severity;
    /** Indicates the state of the anomaly. Eg: anomaly severity can be new, active, disabled, removed or other. */
    private UserExperienceAnalyticsAnomalyState state;
    /**
     * Instantiates a new userExperienceAnalyticsAnomaly and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAnomaly() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsAnomaly
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsAnomaly createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAnomaly();
    }
    /**
     * Gets the anomalyFirstOccurrenceDateTime property value. Indicates the first occurrence date and time for the anomaly.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAnomalyFirstOccurrenceDateTime() {
        return this.anomalyFirstOccurrenceDateTime;
    }
    /**
     * Gets the anomalyId property value. The unique identifier of the anomaly.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAnomalyId() {
        return this.anomalyId;
    }
    /**
     * Gets the anomalyLatestOccurrenceDateTime property value. Indicates the latest occurrence date and time for the anomaly.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAnomalyLatestOccurrenceDateTime() {
        return this.anomalyLatestOccurrenceDateTime;
    }
    /**
     * Gets the anomalyName property value. The name of the anomaly.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAnomalyName() {
        return this.anomalyName;
    }
    /**
     * Gets the anomalyType property value. Indicates the category of the anomaly. Eg: anomaly type can be device, application, stop error, driver or other.
     * @return a UserExperienceAnalyticsAnomalyType
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAnomalyType getAnomalyType() {
        return this.anomalyType;
    }
    /**
     * Gets the assetName property value. The name of the application or module that caused the anomaly.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssetName() {
        return this.assetName;
    }
    /**
     * Gets the assetPublisher property value. The publisher of the application or module that caused the anomaly.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssetPublisher() {
        return this.assetPublisher;
    }
    /**
     * Gets the assetVersion property value. The version of the application or module that caused the anomaly.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssetVersion() {
        return this.assetVersion;
    }
    /**
     * Gets the detectionModelId property value. The unique identifier of the anomaly detection model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDetectionModelId() {
        return this.detectionModelId;
    }
    /**
     * Gets the deviceImpactedCount property value. The number of devices impacted by the anomaly. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceImpactedCount() {
        return this.deviceImpactedCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("anomalyFirstOccurrenceDateTime", (n) -> { this.setAnomalyFirstOccurrenceDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("anomalyId", (n) -> { this.setAnomalyId(n.getStringValue()); });
        deserializerMap.put("anomalyLatestOccurrenceDateTime", (n) -> { this.setAnomalyLatestOccurrenceDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("anomalyName", (n) -> { this.setAnomalyName(n.getStringValue()); });
        deserializerMap.put("anomalyType", (n) -> { this.setAnomalyType(n.getEnumValue(UserExperienceAnalyticsAnomalyType.class)); });
        deserializerMap.put("assetName", (n) -> { this.setAssetName(n.getStringValue()); });
        deserializerMap.put("assetPublisher", (n) -> { this.setAssetPublisher(n.getStringValue()); });
        deserializerMap.put("assetVersion", (n) -> { this.setAssetVersion(n.getStringValue()); });
        deserializerMap.put("detectionModelId", (n) -> { this.setDetectionModelId(n.getStringValue()); });
        deserializerMap.put("deviceImpactedCount", (n) -> { this.setDeviceImpactedCount(n.getIntegerValue()); });
        deserializerMap.put("issueId", (n) -> { this.setIssueId(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(UserExperienceAnalyticsAnomalySeverity.class)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(UserExperienceAnalyticsAnomalyState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the issueId property value. The unique identifier of the anomaly detection model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIssueId() {
        return this.issueId;
    }
    /**
     * Gets the severity property value. Indicates the severity of the anomaly. Eg: anomaly severity can be high, medium, low, informational or other.
     * @return a UserExperienceAnalyticsAnomalySeverity
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAnomalySeverity getSeverity() {
        return this.severity;
    }
    /**
     * Gets the state property value. Indicates the state of the anomaly. Eg: anomaly severity can be new, active, disabled, removed or other.
     * @return a UserExperienceAnalyticsAnomalyState
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAnomalyState getState() {
        return this.state;
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
        writer.writeOffsetDateTimeValue("anomalyFirstOccurrenceDateTime", this.getAnomalyFirstOccurrenceDateTime());
        writer.writeStringValue("anomalyId", this.getAnomalyId());
        writer.writeOffsetDateTimeValue("anomalyLatestOccurrenceDateTime", this.getAnomalyLatestOccurrenceDateTime());
        writer.writeStringValue("anomalyName", this.getAnomalyName());
        writer.writeEnumValue("anomalyType", this.getAnomalyType());
        writer.writeStringValue("assetName", this.getAssetName());
        writer.writeStringValue("assetPublisher", this.getAssetPublisher());
        writer.writeStringValue("assetVersion", this.getAssetVersion());
        writer.writeStringValue("detectionModelId", this.getDetectionModelId());
        writer.writeIntegerValue("deviceImpactedCount", this.getDeviceImpactedCount());
        writer.writeStringValue("issueId", this.getIssueId());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the anomalyFirstOccurrenceDateTime property value. Indicates the first occurrence date and time for the anomaly.
     * @param value Value to set for the anomalyFirstOccurrenceDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnomalyFirstOccurrenceDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.anomalyFirstOccurrenceDateTime = value;
    }
    /**
     * Sets the anomalyId property value. The unique identifier of the anomaly.
     * @param value Value to set for the anomalyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnomalyId(@javax.annotation.Nullable final String value) {
        this.anomalyId = value;
    }
    /**
     * Sets the anomalyLatestOccurrenceDateTime property value. Indicates the latest occurrence date and time for the anomaly.
     * @param value Value to set for the anomalyLatestOccurrenceDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnomalyLatestOccurrenceDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.anomalyLatestOccurrenceDateTime = value;
    }
    /**
     * Sets the anomalyName property value. The name of the anomaly.
     * @param value Value to set for the anomalyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnomalyName(@javax.annotation.Nullable final String value) {
        this.anomalyName = value;
    }
    /**
     * Sets the anomalyType property value. Indicates the category of the anomaly. Eg: anomaly type can be device, application, stop error, driver or other.
     * @param value Value to set for the anomalyType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnomalyType(@javax.annotation.Nullable final UserExperienceAnalyticsAnomalyType value) {
        this.anomalyType = value;
    }
    /**
     * Sets the assetName property value. The name of the application or module that caused the anomaly.
     * @param value Value to set for the assetName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssetName(@javax.annotation.Nullable final String value) {
        this.assetName = value;
    }
    /**
     * Sets the assetPublisher property value. The publisher of the application or module that caused the anomaly.
     * @param value Value to set for the assetPublisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssetPublisher(@javax.annotation.Nullable final String value) {
        this.assetPublisher = value;
    }
    /**
     * Sets the assetVersion property value. The version of the application or module that caused the anomaly.
     * @param value Value to set for the assetVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssetVersion(@javax.annotation.Nullable final String value) {
        this.assetVersion = value;
    }
    /**
     * Sets the detectionModelId property value. The unique identifier of the anomaly detection model.
     * @param value Value to set for the detectionModelId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionModelId(@javax.annotation.Nullable final String value) {
        this.detectionModelId = value;
    }
    /**
     * Sets the deviceImpactedCount property value. The number of devices impacted by the anomaly. Valid values -2147483648 to 2147483647
     * @param value Value to set for the deviceImpactedCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceImpactedCount(@javax.annotation.Nullable final Integer value) {
        this.deviceImpactedCount = value;
    }
    /**
     * Sets the issueId property value. The unique identifier of the anomaly detection model.
     * @param value Value to set for the issueId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssueId(@javax.annotation.Nullable final String value) {
        this.issueId = value;
    }
    /**
     * Sets the severity property value. Indicates the severity of the anomaly. Eg: anomaly severity can be high, medium, low, informational or other.
     * @param value Value to set for the severity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeverity(@javax.annotation.Nullable final UserExperienceAnalyticsAnomalySeverity value) {
        this.severity = value;
    }
    /**
     * Sets the state property value. Indicates the state of the anomaly. Eg: anomaly severity can be new, active, disabled, removed or other.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final UserExperienceAnalyticsAnomalyState value) {
        this.state = value;
    }
}
