package com.microsoft.graph.models.devicemanagement;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class AlertRecord extends Entity implements Parsable {
    /** The impact of the alert event. Consists of a number followed by the aggregation type. For example, 6 Count and 12 AffectedCloudPcPercentage. */
    private AlertImpact _alertImpact;
    /** The corresponding ID of the alert rule. */
    private String _alertRuleId;
    /** The rule template of the alert event. The possible values are: cloudPcProvisionScenario, cloudPcImageUploadScenario, cloudPcOnPremiseNetworkConnectionCheckScenario, unknownFutureValue. */
    private AlertRuleTemplate _alertRuleTemplate;
    /** The date and time when the alert event was detected. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _detectedDateTime;
    /** The display name of the alert record. */
    private String _displayName;
    /** The date and time when the alert record was last updated. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _lastUpdatedDateTime;
    /** The date and time when the alert event was resolved. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _resolvedDateTime;
    /** The severity of the alert event. The possible values are: unknown, informational, warning, critical, unknownFutureValue. */
    private RuleSeverityType _severity;
    /** The status of the alert record. The possible values are: active, resolved, unknownFutureValue. */
    private AlertStatusType _status;
    /**
     * Instantiates a new alertRecord and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AlertRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alertRecord
     */
    @javax.annotation.Nonnull
    public static AlertRecord createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlertRecord();
    }
    /**
     * Gets the alertImpact property value. The impact of the alert event. Consists of a number followed by the aggregation type. For example, 6 Count and 12 AffectedCloudPcPercentage.
     * @return a alertImpact
     */
    @javax.annotation.Nullable
    public AlertImpact getAlertImpact() {
        return this._alertImpact;
    }
    /**
     * Gets the alertRuleId property value. The corresponding ID of the alert rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlertRuleId() {
        return this._alertRuleId;
    }
    /**
     * Gets the alertRuleTemplate property value. The rule template of the alert event. The possible values are: cloudPcProvisionScenario, cloudPcImageUploadScenario, cloudPcOnPremiseNetworkConnectionCheckScenario, unknownFutureValue.
     * @return a alertRuleTemplate
     */
    @javax.annotation.Nullable
    public AlertRuleTemplate getAlertRuleTemplate() {
        return this._alertRuleTemplate;
    }
    /**
     * Gets the detectedDateTime property value. The date and time when the alert event was detected. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDetectedDateTime() {
        return this._detectedDateTime;
    }
    /**
     * Gets the displayName property value. The display name of the alert record.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alertImpact", (n) -> { this.setAlertImpact(n.getObjectValue(AlertImpact::createFromDiscriminatorValue)); });
        deserializerMap.put("alertRuleId", (n) -> { this.setAlertRuleId(n.getStringValue()); });
        deserializerMap.put("alertRuleTemplate", (n) -> { this.setAlertRuleTemplate(n.getEnumValue(AlertRuleTemplate.class)); });
        deserializerMap.put("detectedDateTime", (n) -> { this.setDetectedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastUpdatedDateTime", (n) -> { this.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resolvedDateTime", (n) -> { this.setResolvedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(RuleSeverityType.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AlertStatusType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastUpdatedDateTime property value. The date and time when the alert record was last updated. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the resolvedDateTime property value. The date and time when the alert event was resolved. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getResolvedDateTime() {
        return this._resolvedDateTime;
    }
    /**
     * Gets the severity property value. The severity of the alert event. The possible values are: unknown, informational, warning, critical, unknownFutureValue.
     * @return a ruleSeverityType
     */
    @javax.annotation.Nullable
    public RuleSeverityType getSeverity() {
        return this._severity;
    }
    /**
     * Gets the status property value. The status of the alert record. The possible values are: active, resolved, unknownFutureValue.
     * @return a alertStatusType
     */
    @javax.annotation.Nullable
    public AlertStatusType getStatus() {
        return this._status;
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
        writer.writeObjectValue("alertImpact", this.getAlertImpact());
        writer.writeStringValue("alertRuleId", this.getAlertRuleId());
        writer.writeEnumValue("alertRuleTemplate", this.getAlertRuleTemplate());
        writer.writeOffsetDateTimeValue("detectedDateTime", this.getDetectedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeOffsetDateTimeValue("resolvedDateTime", this.getResolvedDateTime());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the alertImpact property value. The impact of the alert event. Consists of a number followed by the aggregation type. For example, 6 Count and 12 AffectedCloudPcPercentage.
     * @param value Value to set for the alertImpact property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertImpact(@javax.annotation.Nullable final AlertImpact value) {
        this._alertImpact = value;
    }
    /**
     * Sets the alertRuleId property value. The corresponding ID of the alert rule.
     * @param value Value to set for the alertRuleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertRuleId(@javax.annotation.Nullable final String value) {
        this._alertRuleId = value;
    }
    /**
     * Sets the alertRuleTemplate property value. The rule template of the alert event. The possible values are: cloudPcProvisionScenario, cloudPcImageUploadScenario, cloudPcOnPremiseNetworkConnectionCheckScenario, unknownFutureValue.
     * @param value Value to set for the alertRuleTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertRuleTemplate(@javax.annotation.Nullable final AlertRuleTemplate value) {
        this._alertRuleTemplate = value;
    }
    /**
     * Sets the detectedDateTime property value. The date and time when the alert event was detected. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the detectedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._detectedDateTime = value;
    }
    /**
     * Sets the displayName property value. The display name of the alert record.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The date and time when the alert record was last updated. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the resolvedDateTime property value. The date and time when the alert event was resolved. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the resolvedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResolvedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._resolvedDateTime = value;
    }
    /**
     * Sets the severity property value. The severity of the alert event. The possible values are: unknown, informational, warning, critical, unknownFutureValue.
     * @param value Value to set for the severity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeverity(@javax.annotation.Nullable final RuleSeverityType value) {
        this._severity = value;
    }
    /**
     * Sets the status property value. The status of the alert record. The possible values are: active, resolved, unknownFutureValue.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final AlertStatusType value) {
        this._status = value;
    }
}
