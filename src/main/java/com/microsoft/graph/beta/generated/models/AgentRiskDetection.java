package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentRiskDetection extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AgentRiskDetection} and sets the default values.
     */
    public AgentRiskDetection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentRiskDetection}
     */
    @jakarta.annotation.Nonnull
    public static AgentRiskDetection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentRiskDetection();
    }
    /**
     * Gets the activityDateTime property value. Date and time that the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $filter (eq, le, and ge).
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this.backingStore.get("activityDateTime");
    }
    /**
     * Gets the additionalInfo property value. Additional information associated with the risk detection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdditionalInfo() {
        return this.backingStore.get("additionalInfo");
    }
    /**
     * Gets the agentDisplayName property value. Name of the agent.  Supports $filter (eq, startsWith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentDisplayName() {
        return this.backingStore.get("agentDisplayName");
    }
    /**
     * Gets the agentId property value. The unique identifier for the agent. This is equivalent to &apos;id&apos; to the specific agent type. See riskyAgentIdentity, riskyAgentIdentityBlueprintPrincipal, and riskyAgentUser.  Supports $filter (eq, startsWith).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentId() {
        return this.backingStore.get("agentId");
    }
    /**
     * Gets the detectedDateTime property value. Date and time that the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $filter (eq, le, and ge).
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDetectedDateTime() {
        return this.backingStore.get("detectedDateTime");
    }
    /**
     * Gets the detectionTimingType property value. The detectionTimingType property
     * @return a {@link RiskDetectionTimingType}
     */
    @jakarta.annotation.Nullable
    public RiskDetectionTimingType getDetectionTimingType() {
        return this.backingStore.get("detectionTimingType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activityDateTime", (n) -> { this.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("additionalInfo", (n) -> { this.setAdditionalInfo(n.getStringValue()); });
        deserializerMap.put("agentDisplayName", (n) -> { this.setAgentDisplayName(n.getStringValue()); });
        deserializerMap.put("agentId", (n) -> { this.setAgentId(n.getStringValue()); });
        deserializerMap.put("detectedDateTime", (n) -> { this.setDetectedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("detectionTimingType", (n) -> { this.setDetectionTimingType(n.getEnumValue(RiskDetectionTimingType::forValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("riskDetail", (n) -> { this.setRiskDetail(n.getEnumValue(RiskDetail::forValue)); });
        deserializerMap.put("riskEventType", (n) -> { this.setRiskEventType(n.getStringValue()); });
        deserializerMap.put("riskEvidence", (n) -> { this.setRiskEvidence(n.getStringValue()); });
        deserializerMap.put("riskLevel", (n) -> { this.setRiskLevel(n.getEnumValue(RiskLevel::forValue)); });
        deserializerMap.put("riskState", (n) -> { this.setRiskState(n.getEnumValue(RiskState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time that the risk detection was last updated.  Supports $filter (eq, le, and ge).
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the riskDetail property value. The riskDetail property
     * @return a {@link RiskDetail}
     */
    @jakarta.annotation.Nullable
    public RiskDetail getRiskDetail() {
        return this.backingStore.get("riskDetail");
    }
    /**
     * Gets the riskEventType property value. The type of risk event detected.  Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRiskEventType() {
        return this.backingStore.get("riskEventType");
    }
    /**
     * Gets the riskEvidence property value. Evidence on the risky activity occurred.  Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRiskEvidence() {
        return this.backingStore.get("riskEvidence");
    }
    /**
     * Gets the riskLevel property value. The riskLevel property
     * @return a {@link RiskLevel}
     */
    @jakarta.annotation.Nullable
    public RiskLevel getRiskLevel() {
        return this.backingStore.get("riskLevel");
    }
    /**
     * Gets the riskState property value. The riskState property
     * @return a {@link RiskState}
     */
    @jakarta.annotation.Nullable
    public RiskState getRiskState() {
        return this.backingStore.get("riskState");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeStringValue("additionalInfo", this.getAdditionalInfo());
        writer.writeStringValue("agentDisplayName", this.getAgentDisplayName());
        writer.writeStringValue("agentId", this.getAgentId());
        writer.writeOffsetDateTimeValue("detectedDateTime", this.getDetectedDateTime());
        writer.writeEnumValue("detectionTimingType", this.getDetectionTimingType());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("riskDetail", this.getRiskDetail());
        writer.writeStringValue("riskEventType", this.getRiskEventType());
        writer.writeStringValue("riskEvidence", this.getRiskEvidence());
        writer.writeEnumValue("riskLevel", this.getRiskLevel());
        writer.writeEnumValue("riskState", this.getRiskState());
    }
    /**
     * Sets the activityDateTime property value. Date and time that the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $filter (eq, le, and ge).
     * @param value Value to set for the activityDateTime property.
     */
    public void setActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("activityDateTime", value);
    }
    /**
     * Sets the additionalInfo property value. Additional information associated with the risk detection.
     * @param value Value to set for the additionalInfo property.
     */
    public void setAdditionalInfo(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("additionalInfo", value);
    }
    /**
     * Sets the agentDisplayName property value. Name of the agent.  Supports $filter (eq, startsWith).
     * @param value Value to set for the agentDisplayName property.
     */
    public void setAgentDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentDisplayName", value);
    }
    /**
     * Sets the agentId property value. The unique identifier for the agent. This is equivalent to &apos;id&apos; to the specific agent type. See riskyAgentIdentity, riskyAgentIdentityBlueprintPrincipal, and riskyAgentUser.  Supports $filter (eq, startsWith).
     * @param value Value to set for the agentId property.
     */
    public void setAgentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentId", value);
    }
    /**
     * Sets the detectedDateTime property value. Date and time that the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $filter (eq, le, and ge).
     * @param value Value to set for the detectedDateTime property.
     */
    public void setDetectedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("detectedDateTime", value);
    }
    /**
     * Sets the detectionTimingType property value. The detectionTimingType property
     * @param value Value to set for the detectionTimingType property.
     */
    public void setDetectionTimingType(@jakarta.annotation.Nullable final RiskDetectionTimingType value) {
        this.backingStore.set("detectionTimingType", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time that the risk detection was last updated.  Supports $filter (eq, le, and ge).
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the riskDetail property value. The riskDetail property
     * @param value Value to set for the riskDetail property.
     */
    public void setRiskDetail(@jakarta.annotation.Nullable final RiskDetail value) {
        this.backingStore.set("riskDetail", value);
    }
    /**
     * Sets the riskEventType property value. The type of risk event detected.  Supports $filter (eq).
     * @param value Value to set for the riskEventType property.
     */
    public void setRiskEventType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("riskEventType", value);
    }
    /**
     * Sets the riskEvidence property value. Evidence on the risky activity occurred.  Supports $filter (eq).
     * @param value Value to set for the riskEvidence property.
     */
    public void setRiskEvidence(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("riskEvidence", value);
    }
    /**
     * Sets the riskLevel property value. The riskLevel property
     * @param value Value to set for the riskLevel property.
     */
    public void setRiskLevel(@jakarta.annotation.Nullable final RiskLevel value) {
        this.backingStore.set("riskLevel", value);
    }
    /**
     * Sets the riskState property value. The riskState property
     * @param value Value to set for the riskState property.
     */
    public void setRiskState(@jakarta.annotation.Nullable final RiskState value) {
        this.backingStore.set("riskState", value);
    }
}
