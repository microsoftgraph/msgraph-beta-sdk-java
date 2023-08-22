package com.microsoft.graph.models.devicemanagement;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AlertRecord extends Entity implements Parsable {
    /**
     * The impact of the alert event. Consists of a list of key-value pair and a number followed by the aggregation type. For example, 6 affectedCloudPcCount means that 6 Cloud PCs are affected. 12 affectedCloudPcPercentage means 12% of Cloud PCs are affected. The list of key-value pair indicates the details of the alert impact.
     */
    private AlertImpact alertImpact;
    /**
     * The corresponding ID of the alert rule.
     */
    private String alertRuleId;
    /**
     * The rule template of the alert event. The possible values are: cloudPcProvisionScenario, cloudPcImageUploadScenario, cloudPcOnPremiseNetworkConnectionCheckScenario, unknownFutureValue, cloudPcInGracePeriodScenario. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: cloudPcInGracePeriodScenario.
     */
    private AlertRuleTemplate alertRuleTemplate;
    /**
     * The date and time when the alert event was detected. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime detectedDateTime;
    /**
     * The display name of the alert record.
     */
    private String displayName;
    /**
     * The date and time when the alert record was last updated. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime lastUpdatedDateTime;
    /**
     * The date and time when the alert event was resolved. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime resolvedDateTime;
    /**
     * The severity of the alert event. The possible values are: unknown, informational, warning, critical, unknownFutureValue.
     */
    private RuleSeverityType severity;
    /**
     * The status of the alert record. The possible values are: active, resolved, unknownFutureValue.
     */
    private AlertStatusType status;
    /**
     * Instantiates a new alertRecord and sets the default values.
     */
    public AlertRecord() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alertRecord
     */
    @jakarta.annotation.Nonnull
    public static AlertRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlertRecord();
    }
    /**
     * Gets the alertImpact property value. The impact of the alert event. Consists of a list of key-value pair and a number followed by the aggregation type. For example, 6 affectedCloudPcCount means that 6 Cloud PCs are affected. 12 affectedCloudPcPercentage means 12% of Cloud PCs are affected. The list of key-value pair indicates the details of the alert impact.
     * @return a alertImpact
     */
    @jakarta.annotation.Nullable
    public AlertImpact getAlertImpact() {
        return this.alertImpact;
    }
    /**
     * Gets the alertRuleId property value. The corresponding ID of the alert rule.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAlertRuleId() {
        return this.alertRuleId;
    }
    /**
     * Gets the alertRuleTemplate property value. The rule template of the alert event. The possible values are: cloudPcProvisionScenario, cloudPcImageUploadScenario, cloudPcOnPremiseNetworkConnectionCheckScenario, unknownFutureValue, cloudPcInGracePeriodScenario. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: cloudPcInGracePeriodScenario.
     * @return a alertRuleTemplate
     */
    @jakarta.annotation.Nullable
    public AlertRuleTemplate getAlertRuleTemplate() {
        return this.alertRuleTemplate;
    }
    /**
     * Gets the detectedDateTime property value. The date and time when the alert event was detected. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDetectedDateTime() {
        return this.detectedDateTime;
    }
    /**
     * Gets the displayName property value. The display name of the alert record.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }
    /**
     * Gets the resolvedDateTime property value. The date and time when the alert event was resolved. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getResolvedDateTime() {
        return this.resolvedDateTime;
    }
    /**
     * Gets the severity property value. The severity of the alert event. The possible values are: unknown, informational, warning, critical, unknownFutureValue.
     * @return a ruleSeverityType
     */
    @jakarta.annotation.Nullable
    public RuleSeverityType getSeverity() {
        return this.severity;
    }
    /**
     * Gets the status property value. The status of the alert record. The possible values are: active, resolved, unknownFutureValue.
     * @return a alertStatusType
     */
    @jakarta.annotation.Nullable
    public AlertStatusType getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the alertImpact property value. The impact of the alert event. Consists of a list of key-value pair and a number followed by the aggregation type. For example, 6 affectedCloudPcCount means that 6 Cloud PCs are affected. 12 affectedCloudPcPercentage means 12% of Cloud PCs are affected. The list of key-value pair indicates the details of the alert impact.
     * @param value Value to set for the alertImpact property.
     */
    public void setAlertImpact(@jakarta.annotation.Nullable final AlertImpact value) {
        this.alertImpact = value;
    }
    /**
     * Sets the alertRuleId property value. The corresponding ID of the alert rule.
     * @param value Value to set for the alertRuleId property.
     */
    public void setAlertRuleId(@jakarta.annotation.Nullable final String value) {
        this.alertRuleId = value;
    }
    /**
     * Sets the alertRuleTemplate property value. The rule template of the alert event. The possible values are: cloudPcProvisionScenario, cloudPcImageUploadScenario, cloudPcOnPremiseNetworkConnectionCheckScenario, unknownFutureValue, cloudPcInGracePeriodScenario. Note that you must use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: cloudPcInGracePeriodScenario.
     * @param value Value to set for the alertRuleTemplate property.
     */
    public void setAlertRuleTemplate(@jakarta.annotation.Nullable final AlertRuleTemplate value) {
        this.alertRuleTemplate = value;
    }
    /**
     * Sets the detectedDateTime property value. The date and time when the alert event was detected. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the detectedDateTime property.
     */
    public void setDetectedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.detectedDateTime = value;
    }
    /**
     * Sets the displayName property value. The display name of the alert record.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The date and time when the alert record was last updated. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastUpdatedDateTime property.
     */
    public void setLastUpdatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUpdatedDateTime = value;
    }
    /**
     * Sets the resolvedDateTime property value. The date and time when the alert event was resolved. The Timestamp type represents date and time information using ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the resolvedDateTime property.
     */
    public void setResolvedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.resolvedDateTime = value;
    }
    /**
     * Sets the severity property value. The severity of the alert event. The possible values are: unknown, informational, warning, critical, unknownFutureValue.
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final RuleSeverityType value) {
        this.severity = value;
    }
    /**
     * Sets the status property value. The status of the alert record. The possible values are: active, resolved, unknownFutureValue.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AlertStatusType value) {
        this.status = value;
    }
}
