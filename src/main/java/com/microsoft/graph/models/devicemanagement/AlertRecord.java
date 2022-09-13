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
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class AlertRecord extends Entity implements Parsable {
    /** The alertImpact property */
    private AlertImpact _alertImpact;
    /** The alertRuleId property */
    private String _alertRuleId;
    /** The alertRuleTemplate property */
    private AlertRuleTemplate _alertRuleTemplate;
    /** The detectedDateTime property */
    private OffsetDateTime _detectedDateTime;
    /** The displayName property */
    private String _displayName;
    /** The lastUpdatedDateTime property */
    private OffsetDateTime _lastUpdatedDateTime;
    /** The resolvedDateTime property */
    private OffsetDateTime _resolvedDateTime;
    /** The severity property */
    private RuleSeverityType _severity;
    /** The status property */
    private AlertStatusType _status;
    /**
     * Instantiates a new alertRecord and sets the default values.
     * @return a void
     */
    public AlertRecord() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagement.alertRecord");
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
     * Gets the alertImpact property value. The alertImpact property
     * @return a alertImpact
     */
    @javax.annotation.Nullable
    public AlertImpact getAlertImpact() {
        return this._alertImpact;
    }
    /**
     * Gets the alertRuleId property value. The alertRuleId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlertRuleId() {
        return this._alertRuleId;
    }
    /**
     * Gets the alertRuleTemplate property value. The alertRuleTemplate property
     * @return a alertRuleTemplate
     */
    @javax.annotation.Nullable
    public AlertRuleTemplate getAlertRuleTemplate() {
        return this._alertRuleTemplate;
    }
    /**
     * Gets the detectedDateTime property value. The detectedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDetectedDateTime() {
        return this._detectedDateTime;
    }
    /**
     * Gets the displayName property value. The displayName property
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
        final AlertRecord currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("alertImpact", (n) -> { currentObject.setAlertImpact(n.getObjectValue(AlertImpact::createFromDiscriminatorValue)); });
            this.put("alertRuleId", (n) -> { currentObject.setAlertRuleId(n.getStringValue()); });
            this.put("alertRuleTemplate", (n) -> { currentObject.setAlertRuleTemplate(n.getEnumValue(AlertRuleTemplate.class)); });
            this.put("detectedDateTime", (n) -> { currentObject.setDetectedDateTime(n.getOffsetDateTimeValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastUpdatedDateTime", (n) -> { currentObject.setLastUpdatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("resolvedDateTime", (n) -> { currentObject.setResolvedDateTime(n.getOffsetDateTimeValue()); });
            this.put("severity", (n) -> { currentObject.setSeverity(n.getEnumValue(RuleSeverityType.class)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(AlertStatusType.class)); });
        }};
    }
    /**
     * Gets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the resolvedDateTime property value. The resolvedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getResolvedDateTime() {
        return this._resolvedDateTime;
    }
    /**
     * Gets the severity property value. The severity property
     * @return a ruleSeverityType
     */
    @javax.annotation.Nullable
    public RuleSeverityType getSeverity() {
        return this._severity;
    }
    /**
     * Gets the status property value. The status property
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
     * Sets the alertImpact property value. The alertImpact property
     * @param value Value to set for the alertImpact property.
     * @return a void
     */
    public void setAlertImpact(@javax.annotation.Nullable final AlertImpact value) {
        this._alertImpact = value;
    }
    /**
     * Sets the alertRuleId property value. The alertRuleId property
     * @param value Value to set for the alertRuleId property.
     * @return a void
     */
    public void setAlertRuleId(@javax.annotation.Nullable final String value) {
        this._alertRuleId = value;
    }
    /**
     * Sets the alertRuleTemplate property value. The alertRuleTemplate property
     * @param value Value to set for the alertRuleTemplate property.
     * @return a void
     */
    public void setAlertRuleTemplate(@javax.annotation.Nullable final AlertRuleTemplate value) {
        this._alertRuleTemplate = value;
    }
    /**
     * Sets the detectedDateTime property value. The detectedDateTime property
     * @param value Value to set for the detectedDateTime property.
     * @return a void
     */
    public void setDetectedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._detectedDateTime = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. The lastUpdatedDateTime property
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the resolvedDateTime property value. The resolvedDateTime property
     * @param value Value to set for the resolvedDateTime property.
     * @return a void
     */
    public void setResolvedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._resolvedDateTime = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     * @return a void
     */
    public void setSeverity(@javax.annotation.Nullable final RuleSeverityType value) {
        this._severity = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final AlertStatusType value) {
        this._status = value;
    }
}
