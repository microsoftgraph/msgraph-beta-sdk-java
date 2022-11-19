package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics anomaly entity contains anomaly details. */
public class UserExperienceAnalyticsAnomaly extends Entity implements Parsable {
    /** Indicates the first occurrence date and time for the anomaly. */
    private OffsetDateTime _anomalyFirstOccurrenceDateTime;
    /** The unique identifier of the anomaly. */
    private String _anomalyId;
    /** Indicates the latest occurrence date and time for the anomaly. */
    private OffsetDateTime _anomalyLatestOccurrenceDateTime;
    /** The name of the anomaly. */
    private String _anomalyName;
    /** Indicates the category of the anomaly. Eg: anomaly type can be device, application, stop error, driver or other. */
    private UserExperienceAnalyticsAnomalyType _anomalyType;
    /** The name of the application or module that caused the anomaly. */
    private String _assetName;
    /** The publisher of the application or module that caused the anomaly. */
    private String _assetPublisher;
    /** The version of the application or module that caused the anomaly. */
    private String _assetVersion;
    /** The unique identifier of the anomaly detection model. */
    private String _detectionModelId;
    /** The number of devices impacted by the anomaly. Valid values -2147483648 to 2147483647 */
    private Integer _deviceImpactedCount;
    /** The unique identifier of the anomaly detection model. */
    private String _issueId;
    /** Indicates the severity of the anomaly. Eg: anomaly severity can be high, medium, low, informational or other. */
    private UserExperienceAnalyticsAnomalySeverity _severity;
    /** Indicates the state of the anomaly. Eg: anomaly severity can be new, active, disabled, removed or other. */
    private UserExperienceAnalyticsAnomalyState _state;
    /**
     * Instantiates a new userExperienceAnalyticsAnomaly and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAnomaly() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsAnomaly");
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
        return this._anomalyFirstOccurrenceDateTime;
    }
    /**
     * Gets the anomalyId property value. The unique identifier of the anomaly.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAnomalyId() {
        return this._anomalyId;
    }
    /**
     * Gets the anomalyLatestOccurrenceDateTime property value. Indicates the latest occurrence date and time for the anomaly.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAnomalyLatestOccurrenceDateTime() {
        return this._anomalyLatestOccurrenceDateTime;
    }
    /**
     * Gets the anomalyName property value. The name of the anomaly.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAnomalyName() {
        return this._anomalyName;
    }
    /**
     * Gets the anomalyType property value. Indicates the category of the anomaly. Eg: anomaly type can be device, application, stop error, driver or other.
     * @return a userExperienceAnalyticsAnomalyType
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAnomalyType getAnomalyType() {
        return this._anomalyType;
    }
    /**
     * Gets the assetName property value. The name of the application or module that caused the anomaly.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssetName() {
        return this._assetName;
    }
    /**
     * Gets the assetPublisher property value. The publisher of the application or module that caused the anomaly.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssetPublisher() {
        return this._assetPublisher;
    }
    /**
     * Gets the assetVersion property value. The version of the application or module that caused the anomaly.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssetVersion() {
        return this._assetVersion;
    }
    /**
     * Gets the detectionModelId property value. The unique identifier of the anomaly detection model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDetectionModelId() {
        return this._detectionModelId;
    }
    /**
     * Gets the deviceImpactedCount property value. The number of devices impacted by the anomaly. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceImpactedCount() {
        return this._deviceImpactedCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsAnomaly currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("anomalyFirstOccurrenceDateTime", (n) -> { currentObject.setAnomalyFirstOccurrenceDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("anomalyId", (n) -> { currentObject.setAnomalyId(n.getStringValue()); });
        deserializerMap.put("anomalyLatestOccurrenceDateTime", (n) -> { currentObject.setAnomalyLatestOccurrenceDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("anomalyName", (n) -> { currentObject.setAnomalyName(n.getStringValue()); });
        deserializerMap.put("anomalyType", (n) -> { currentObject.setAnomalyType(n.getEnumValue(UserExperienceAnalyticsAnomalyType.class)); });
        deserializerMap.put("assetName", (n) -> { currentObject.setAssetName(n.getStringValue()); });
        deserializerMap.put("assetPublisher", (n) -> { currentObject.setAssetPublisher(n.getStringValue()); });
        deserializerMap.put("assetVersion", (n) -> { currentObject.setAssetVersion(n.getStringValue()); });
        deserializerMap.put("detectionModelId", (n) -> { currentObject.setDetectionModelId(n.getStringValue()); });
        deserializerMap.put("deviceImpactedCount", (n) -> { currentObject.setDeviceImpactedCount(n.getIntegerValue()); });
        deserializerMap.put("issueId", (n) -> { currentObject.setIssueId(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { currentObject.setSeverity(n.getEnumValue(UserExperienceAnalyticsAnomalySeverity.class)); });
        deserializerMap.put("state", (n) -> { currentObject.setState(n.getEnumValue(UserExperienceAnalyticsAnomalyState.class)); });
        return deserializerMap
    }
    /**
     * Gets the issueId property value. The unique identifier of the anomaly detection model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIssueId() {
        return this._issueId;
    }
    /**
     * Gets the severity property value. Indicates the severity of the anomaly. Eg: anomaly severity can be high, medium, low, informational or other.
     * @return a userExperienceAnalyticsAnomalySeverity
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAnomalySeverity getSeverity() {
        return this._severity;
    }
    /**
     * Gets the state property value. Indicates the state of the anomaly. Eg: anomaly severity can be new, active, disabled, removed or other.
     * @return a userExperienceAnalyticsAnomalyState
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsAnomalyState getState() {
        return this._state;
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
        this._anomalyFirstOccurrenceDateTime = value;
    }
    /**
     * Sets the anomalyId property value. The unique identifier of the anomaly.
     * @param value Value to set for the anomalyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnomalyId(@javax.annotation.Nullable final String value) {
        this._anomalyId = value;
    }
    /**
     * Sets the anomalyLatestOccurrenceDateTime property value. Indicates the latest occurrence date and time for the anomaly.
     * @param value Value to set for the anomalyLatestOccurrenceDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnomalyLatestOccurrenceDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._anomalyLatestOccurrenceDateTime = value;
    }
    /**
     * Sets the anomalyName property value. The name of the anomaly.
     * @param value Value to set for the anomalyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnomalyName(@javax.annotation.Nullable final String value) {
        this._anomalyName = value;
    }
    /**
     * Sets the anomalyType property value. Indicates the category of the anomaly. Eg: anomaly type can be device, application, stop error, driver or other.
     * @param value Value to set for the anomalyType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnomalyType(@javax.annotation.Nullable final UserExperienceAnalyticsAnomalyType value) {
        this._anomalyType = value;
    }
    /**
     * Sets the assetName property value. The name of the application or module that caused the anomaly.
     * @param value Value to set for the assetName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssetName(@javax.annotation.Nullable final String value) {
        this._assetName = value;
    }
    /**
     * Sets the assetPublisher property value. The publisher of the application or module that caused the anomaly.
     * @param value Value to set for the assetPublisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssetPublisher(@javax.annotation.Nullable final String value) {
        this._assetPublisher = value;
    }
    /**
     * Sets the assetVersion property value. The version of the application or module that caused the anomaly.
     * @param value Value to set for the assetVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssetVersion(@javax.annotation.Nullable final String value) {
        this._assetVersion = value;
    }
    /**
     * Sets the detectionModelId property value. The unique identifier of the anomaly detection model.
     * @param value Value to set for the detectionModelId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionModelId(@javax.annotation.Nullable final String value) {
        this._detectionModelId = value;
    }
    /**
     * Sets the deviceImpactedCount property value. The number of devices impacted by the anomaly. Valid values -2147483648 to 2147483647
     * @param value Value to set for the deviceImpactedCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceImpactedCount(@javax.annotation.Nullable final Integer value) {
        this._deviceImpactedCount = value;
    }
    /**
     * Sets the issueId property value. The unique identifier of the anomaly detection model.
     * @param value Value to set for the issueId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIssueId(@javax.annotation.Nullable final String value) {
        this._issueId = value;
    }
    /**
     * Sets the severity property value. Indicates the severity of the anomaly. Eg: anomaly severity can be high, medium, low, informational or other.
     * @param value Value to set for the severity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeverity(@javax.annotation.Nullable final UserExperienceAnalyticsAnomalySeverity value) {
        this._severity = value;
    }
    /**
     * Sets the state property value. Indicates the state of the anomaly. Eg: anomaly severity can be new, active, disabled, removed or other.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final UserExperienceAnalyticsAnomalyState value) {
        this._state = value;
    }
}
