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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserExperienceAnalyticsAnomaly extends Entity implements Parsable {
    /**
     * Instantiates a new UserExperienceAnalyticsAnomaly and sets the default values.
     */
    public UserExperienceAnalyticsAnomaly() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserExperienceAnalyticsAnomaly
     */
    @jakarta.annotation.Nonnull
    public static UserExperienceAnalyticsAnomaly createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsAnomaly();
    }
    /**
     * Gets the anomalyFirstOccurrenceDateTime property value. Indicates the first occurrence date and time for the anomaly.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAnomalyFirstOccurrenceDateTime() {
        return this.BackingStore.get("anomalyFirstOccurrenceDateTime");
    }
    /**
     * Gets the anomalyId property value. The unique identifier of the anomaly.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAnomalyId() {
        return this.BackingStore.get("anomalyId");
    }
    /**
     * Gets the anomalyLatestOccurrenceDateTime property value. Indicates the latest occurrence date and time for the anomaly.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAnomalyLatestOccurrenceDateTime() {
        return this.BackingStore.get("anomalyLatestOccurrenceDateTime");
    }
    /**
     * Gets the anomalyName property value. The name of the anomaly.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAnomalyName() {
        return this.BackingStore.get("anomalyName");
    }
    /**
     * Gets the anomalyType property value. Indicates the category of the anomaly. Eg: anomaly type can be device, application, stop error, driver or other.
     * @return a UserExperienceAnalyticsAnomalyType
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsAnomalyType getAnomalyType() {
        return this.BackingStore.get("anomalyType");
    }
    /**
     * Gets the assetName property value. The name of the application or module that caused the anomaly.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssetName() {
        return this.BackingStore.get("assetName");
    }
    /**
     * Gets the assetPublisher property value. The publisher of the application or module that caused the anomaly.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssetPublisher() {
        return this.BackingStore.get("assetPublisher");
    }
    /**
     * Gets the assetVersion property value. The version of the application or module that caused the anomaly.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssetVersion() {
        return this.BackingStore.get("assetVersion");
    }
    /**
     * Gets the detectionModelId property value. The unique identifier of the anomaly detection model.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDetectionModelId() {
        return this.BackingStore.get("detectionModelId");
    }
    /**
     * Gets the deviceImpactedCount property value. The number of devices impacted by the anomaly. Valid values -2147483648 to 2147483647
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceImpactedCount() {
        return this.BackingStore.get("deviceImpactedCount");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIssueId() {
        return this.BackingStore.get("issueId");
    }
    /**
     * Gets the severity property value. Indicates the severity of the anomaly. Eg: anomaly severity can be high, medium, low, informational or other.
     * @return a UserExperienceAnalyticsAnomalySeverity
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsAnomalySeverity getSeverity() {
        return this.BackingStore.get("severity");
    }
    /**
     * Gets the state property value. Indicates the state of the anomaly. Eg: anomaly severity can be new, active, disabled, removed or other.
     * @return a UserExperienceAnalyticsAnomalyState
     */
    @jakarta.annotation.Nullable
    public UserExperienceAnalyticsAnomalyState getState() {
        return this.BackingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAnomalyFirstOccurrenceDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("anomalyFirstOccurrenceDateTime", value);
    }
    /**
     * Sets the anomalyId property value. The unique identifier of the anomaly.
     * @param value Value to set for the anomalyId property.
     */
    public void setAnomalyId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("anomalyId", value);
    }
    /**
     * Sets the anomalyLatestOccurrenceDateTime property value. Indicates the latest occurrence date and time for the anomaly.
     * @param value Value to set for the anomalyLatestOccurrenceDateTime property.
     */
    public void setAnomalyLatestOccurrenceDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("anomalyLatestOccurrenceDateTime", value);
    }
    /**
     * Sets the anomalyName property value. The name of the anomaly.
     * @param value Value to set for the anomalyName property.
     */
    public void setAnomalyName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("anomalyName", value);
    }
    /**
     * Sets the anomalyType property value. Indicates the category of the anomaly. Eg: anomaly type can be device, application, stop error, driver or other.
     * @param value Value to set for the anomalyType property.
     */
    public void setAnomalyType(@jakarta.annotation.Nullable final UserExperienceAnalyticsAnomalyType value) {
        this.BackingStore.set("anomalyType", value);
    }
    /**
     * Sets the assetName property value. The name of the application or module that caused the anomaly.
     * @param value Value to set for the assetName property.
     */
    public void setAssetName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("assetName", value);
    }
    /**
     * Sets the assetPublisher property value. The publisher of the application or module that caused the anomaly.
     * @param value Value to set for the assetPublisher property.
     */
    public void setAssetPublisher(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("assetPublisher", value);
    }
    /**
     * Sets the assetVersion property value. The version of the application or module that caused the anomaly.
     * @param value Value to set for the assetVersion property.
     */
    public void setAssetVersion(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("assetVersion", value);
    }
    /**
     * Sets the detectionModelId property value. The unique identifier of the anomaly detection model.
     * @param value Value to set for the detectionModelId property.
     */
    public void setDetectionModelId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("detectionModelId", value);
    }
    /**
     * Sets the deviceImpactedCount property value. The number of devices impacted by the anomaly. Valid values -2147483648 to 2147483647
     * @param value Value to set for the deviceImpactedCount property.
     */
    public void setDeviceImpactedCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("deviceImpactedCount", value);
    }
    /**
     * Sets the issueId property value. The unique identifier of the anomaly detection model.
     * @param value Value to set for the issueId property.
     */
    public void setIssueId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("issueId", value);
    }
    /**
     * Sets the severity property value. Indicates the severity of the anomaly. Eg: anomaly severity can be high, medium, low, informational or other.
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final UserExperienceAnalyticsAnomalySeverity value) {
        this.BackingStore.set("severity", value);
    }
    /**
     * Sets the state property value. Indicates the state of the anomaly. Eg: anomaly severity can be new, active, disabled, removed or other.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final UserExperienceAnalyticsAnomalyState value) {
        this.BackingStore.set("state", value);
    }
}
