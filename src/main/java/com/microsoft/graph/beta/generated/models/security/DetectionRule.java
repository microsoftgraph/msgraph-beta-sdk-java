package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DetectionRule extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DetectionRule} and sets the default values.
     */
    public DetectionRule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DetectionRule}
     */
    @jakarta.annotation.Nonnull
    public static DetectionRule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DetectionRule();
    }
    /**
     * Gets the createdBy property value. Name of the user or application that created the rule. Read-only. Supports $filter (eq, ne, not, in, startsWith, endsWith, contains).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Timestamp of rule creation. Read-only. Supports $filter (eq, ne, not, le, ge, lt, gt) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. A user-supplied description of the detection rule. Supports $filter (eq, ne, not, in, startsWith, endsWith, contains).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the detectionAction property value. The detectionAction property
     * @return a {@link DetectionAction}
     */
    @jakarta.annotation.Nullable
    public DetectionAction getDetectionAction() {
        return this.backingStore.get("detectionAction");
    }
    /**
     * Gets the detectorId property value. Internal detector identifier. Deprecated. This property will be removed from this resource on 2026-10-01.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetectorId() {
        return this.backingStore.get("detectorId");
    }
    /**
     * Gets the displayName property value. The display name of the rule. Supports $filter (eq, ne, not, in, startsWith, endsWith, contains) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("detectionAction", (n) -> { this.setDetectionAction(n.getObjectValue(DetectionAction::createFromDiscriminatorValue)); });
        deserializerMap.put("detectorId", (n) -> { this.setDetectorId(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastRunDetails", (n) -> { this.setLastRunDetails(n.getObjectValue(RunDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("queryCondition", (n) -> { this.setQueryCondition(n.getObjectValue(QueryCondition::createFromDiscriminatorValue)); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(RuleSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(DetectionRuleStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. Indicates whether the rule is turned on for the tenant. Supports $filter (eq, ne, not). Deprecated. Use status instead. This property will be removed from this resource on 2026-10-01.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the lastModifiedBy property value. Name of the user or application that last updated the rule. Read-only. Supports $filter (eq, ne, not, in, startsWith, endsWith, contains).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. Timestamp of when the rule was last updated. Read-only. Supports $filter (eq, ne, not, le, ge, lt, gt) and $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the lastRunDetails property value. Runtime execution details for the most recent rule run. Supports $filter on the following nested properties:String: lastRunDetails/failureReason  supports eq, ne, not, in, startsWith, endsWith, contains.DateTimeOffset: lastRunDetails/lastRunDateTime  supports eq, ne, not, le, ge, lt, gt.Enum: lastRunDetails/status, lastRunDetails/errorCode  each supports eq, ne, not, in.Deprecated. This property will be removed from this resource on 2026-10-01. Runtime execution details aren&apos;t exposed in the v1.0 API.
     * @return a {@link RunDetails}
     */
    @jakarta.annotation.Nullable
    public RunDetails getLastRunDetails() {
        return this.backingStore.get("lastRunDetails");
    }
    /**
     * Gets the queryCondition property value. The queryCondition property
     * @return a {@link QueryCondition}
     */
    @jakarta.annotation.Nullable
    public QueryCondition getQueryCondition() {
        return this.backingStore.get("queryCondition");
    }
    /**
     * Gets the schedule property value. The schedule property
     * @return a {@link RuleSchedule}
     */
    @jakarta.annotation.Nullable
    public RuleSchedule getSchedule() {
        return this.backingStore.get("schedule");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link DetectionRuleStatus}
     */
    @jakarta.annotation.Nullable
    public DetectionRuleStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("detectionAction", this.getDetectionAction());
        writer.writeStringValue("detectorId", this.getDetectorId());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("lastRunDetails", this.getLastRunDetails());
        writer.writeObjectValue("queryCondition", this.getQueryCondition());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the createdBy property value. Name of the user or application that created the rule. Read-only. Supports $filter (eq, ne, not, in, startsWith, endsWith, contains).
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Timestamp of rule creation. Read-only. Supports $filter (eq, ne, not, le, ge, lt, gt) and $orderby.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. A user-supplied description of the detection rule. Supports $filter (eq, ne, not, in, startsWith, endsWith, contains).
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the detectionAction property value. The detectionAction property
     * @param value Value to set for the detectionAction property.
     */
    public void setDetectionAction(@jakarta.annotation.Nullable final DetectionAction value) {
        this.backingStore.set("detectionAction", value);
    }
    /**
     * Sets the detectorId property value. Internal detector identifier. Deprecated. This property will be removed from this resource on 2026-10-01.
     * @param value Value to set for the detectorId property.
     */
    public void setDetectorId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("detectorId", value);
    }
    /**
     * Sets the displayName property value. The display name of the rule. Supports $filter (eq, ne, not, in, startsWith, endsWith, contains) and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the isEnabled property value. Indicates whether the rule is turned on for the tenant. Supports $filter (eq, ne, not). Deprecated. Use status instead. This property will be removed from this resource on 2026-10-01.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the lastModifiedBy property value. Name of the user or application that last updated the rule. Read-only. Supports $filter (eq, ne, not, in, startsWith, endsWith, contains).
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Timestamp of when the rule was last updated. Read-only. Supports $filter (eq, ne, not, le, ge, lt, gt) and $orderby.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the lastRunDetails property value. Runtime execution details for the most recent rule run. Supports $filter on the following nested properties:String: lastRunDetails/failureReason  supports eq, ne, not, in, startsWith, endsWith, contains.DateTimeOffset: lastRunDetails/lastRunDateTime  supports eq, ne, not, le, ge, lt, gt.Enum: lastRunDetails/status, lastRunDetails/errorCode  each supports eq, ne, not, in.Deprecated. This property will be removed from this resource on 2026-10-01. Runtime execution details aren&apos;t exposed in the v1.0 API.
     * @param value Value to set for the lastRunDetails property.
     */
    public void setLastRunDetails(@jakarta.annotation.Nullable final RunDetails value) {
        this.backingStore.set("lastRunDetails", value);
    }
    /**
     * Sets the queryCondition property value. The queryCondition property
     * @param value Value to set for the queryCondition property.
     */
    public void setQueryCondition(@jakarta.annotation.Nullable final QueryCondition value) {
        this.backingStore.set("queryCondition", value);
    }
    /**
     * Sets the schedule property value. The schedule property
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final RuleSchedule value) {
        this.backingStore.set("schedule", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final DetectionRuleStatus value) {
        this.backingStore.set("status", value);
    }
}
