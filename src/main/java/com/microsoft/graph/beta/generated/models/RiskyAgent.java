package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RiskyAgent extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RiskyAgent} and sets the default values.
     */
    public RiskyAgent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RiskyAgent}
     */
    @jakarta.annotation.Nonnull
    public static RiskyAgent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.riskyAgentDiscoveredAgentIdentity": return new RiskyAgentDiscoveredAgentIdentity();
                case "#microsoft.graph.riskyAgentIdentity": return new RiskyAgentIdentity();
                case "#microsoft.graph.riskyAgentIdentityBlueprintPrincipal": return new RiskyAgentIdentityBlueprintPrincipal();
                case "#microsoft.graph.riskyAgentUser": return new RiskyAgentUser();
            }
        }
        return new RiskyAgent();
    }
    /**
     * Gets the additionalInfo property value. The additionalInfo property
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
     * Gets the agentPlatform property value. The agentPlatform property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentPlatform() {
        return this.backingStore.get("agentPlatform");
    }
    /**
     * Gets the associatedUserId property value. The associatedUserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssociatedUserId() {
        return this.backingStore.get("associatedUserId");
    }
    /**
     * Gets the blastRadiusRisk property value. The blastRadiusRisk property
     * @return a {@link BlastRadiusRisk}
     */
    @jakarta.annotation.Nullable
    public BlastRadiusRisk getBlastRadiusRisk() {
        return this.backingStore.get("blastRadiusRisk");
    }
    /**
     * Gets the blueprintId property value. The identifier of the blueprint associated with the agent. Nullable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBlueprintId() {
        return this.backingStore.get("blueprintId");
    }
    /**
     * Gets the deviceId property value. The deviceId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the exposureRisk property value. The exposureRisk property
     * @return a {@link ExposureRisk}
     */
    @jakarta.annotation.Nullable
    public ExposureRisk getExposureRisk() {
        return this.backingStore.get("exposureRisk");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("additionalInfo", (n) -> { this.setAdditionalInfo(n.getStringValue()); });
        deserializerMap.put("agentDisplayName", (n) -> { this.setAgentDisplayName(n.getStringValue()); });
        deserializerMap.put("agentPlatform", (n) -> { this.setAgentPlatform(n.getStringValue()); });
        deserializerMap.put("associatedUserId", (n) -> { this.setAssociatedUserId(n.getStringValue()); });
        deserializerMap.put("blastRadiusRisk", (n) -> { this.setBlastRadiusRisk(n.getObjectValue(BlastRadiusRisk::createFromDiscriminatorValue)); });
        deserializerMap.put("blueprintId", (n) -> { this.setBlueprintId(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("exposureRisk", (n) -> { this.setExposureRisk(n.getObjectValue(ExposureRisk::createFromDiscriminatorValue)); });
        deserializerMap.put("identityType", (n) -> { this.setIdentityType(n.getEnumValue(AgentIdentityType::forValue)); });
        deserializerMap.put("isDeleted", (n) -> { this.setIsDeleted(n.getBooleanValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isProcessing", (n) -> { this.setIsProcessing(n.getBooleanValue()); });
        deserializerMap.put("machineId", (n) -> { this.setMachineId(n.getStringValue()); });
        deserializerMap.put("riskDetail", (n) -> { this.setRiskDetail(n.getEnumValue(RiskDetail::forValue)); });
        deserializerMap.put("riskLastModifiedDateTime", (n) -> { this.setRiskLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("riskLevel", (n) -> { this.setRiskLevel(n.getEnumValue(RiskLevel::forValue)); });
        deserializerMap.put("riskState", (n) -> { this.setRiskState(n.getEnumValue(RiskState::forValue)); });
        deserializerMap.put("runtimeRisk", (n) -> { this.setRuntimeRisk(n.getObjectValue(RuntimeRisk::createFromDiscriminatorValue)); });
        deserializerMap.put("sources", (n) -> { this.setSources(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the identityType property value. The identityType property
     * @return a {@link AgentIdentityType}
     */
    @jakarta.annotation.Nullable
    public AgentIdentityType getIdentityType() {
        return this.backingStore.get("identityType");
    }
    /**
     * Gets the isDeleted property value. Indicates whether the agent is deleted.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeleted() {
        return this.backingStore.get("isDeleted");
    }
    /**
     * Gets the isEnabled property value. Indicates whether the agent is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.backingStore.get("isEnabled");
    }
    /**
     * Gets the isProcessing property value. Indicates whether an agent&apos;s risky state is processing in the backend.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsProcessing() {
        return this.backingStore.get("isProcessing");
    }
    /**
     * Gets the machineId property value. The machineId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMachineId() {
        return this.backingStore.get("machineId");
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
     * Gets the riskLastModifiedDateTime property value. The date and time that the risky agent was last updated. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $filter (eq, le, and ge).
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRiskLastModifiedDateTime() {
        return this.backingStore.get("riskLastModifiedDateTime");
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
     * Gets the runtimeRisk property value. The runtimeRisk property
     * @return a {@link RuntimeRisk}
     */
    @jakarta.annotation.Nullable
    public RuntimeRisk getRuntimeRisk() {
        return this.backingStore.get("runtimeRisk");
    }
    /**
     * Gets the sources property value. The sources property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSources() {
        return this.backingStore.get("sources");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("additionalInfo", this.getAdditionalInfo());
        writer.writeStringValue("agentDisplayName", this.getAgentDisplayName());
        writer.writeStringValue("agentPlatform", this.getAgentPlatform());
        writer.writeStringValue("associatedUserId", this.getAssociatedUserId());
        writer.writeObjectValue("blastRadiusRisk", this.getBlastRadiusRisk());
        writer.writeStringValue("blueprintId", this.getBlueprintId());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeObjectValue("exposureRisk", this.getExposureRisk());
        writer.writeEnumValue("identityType", this.getIdentityType());
        writer.writeBooleanValue("isDeleted", this.getIsDeleted());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeBooleanValue("isProcessing", this.getIsProcessing());
        writer.writeStringValue("machineId", this.getMachineId());
        writer.writeEnumValue("riskDetail", this.getRiskDetail());
        writer.writeOffsetDateTimeValue("riskLastModifiedDateTime", this.getRiskLastModifiedDateTime());
        writer.writeEnumValue("riskLevel", this.getRiskLevel());
        writer.writeEnumValue("riskState", this.getRiskState());
        writer.writeObjectValue("runtimeRisk", this.getRuntimeRisk());
        writer.writeCollectionOfPrimitiveValues("sources", this.getSources());
    }
    /**
     * Sets the additionalInfo property value. The additionalInfo property
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
     * Sets the agentPlatform property value. The agentPlatform property
     * @param value Value to set for the agentPlatform property.
     */
    public void setAgentPlatform(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentPlatform", value);
    }
    /**
     * Sets the associatedUserId property value. The associatedUserId property
     * @param value Value to set for the associatedUserId property.
     */
    public void setAssociatedUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("associatedUserId", value);
    }
    /**
     * Sets the blastRadiusRisk property value. The blastRadiusRisk property
     * @param value Value to set for the blastRadiusRisk property.
     */
    public void setBlastRadiusRisk(@jakarta.annotation.Nullable final BlastRadiusRisk value) {
        this.backingStore.set("blastRadiusRisk", value);
    }
    /**
     * Sets the blueprintId property value. The identifier of the blueprint associated with the agent. Nullable.
     * @param value Value to set for the blueprintId property.
     */
    public void setBlueprintId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("blueprintId", value);
    }
    /**
     * Sets the deviceId property value. The deviceId property
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the exposureRisk property value. The exposureRisk property
     * @param value Value to set for the exposureRisk property.
     */
    public void setExposureRisk(@jakarta.annotation.Nullable final ExposureRisk value) {
        this.backingStore.set("exposureRisk", value);
    }
    /**
     * Sets the identityType property value. The identityType property
     * @param value Value to set for the identityType property.
     */
    public void setIdentityType(@jakarta.annotation.Nullable final AgentIdentityType value) {
        this.backingStore.set("identityType", value);
    }
    /**
     * Sets the isDeleted property value. Indicates whether the agent is deleted.
     * @param value Value to set for the isDeleted property.
     */
    public void setIsDeleted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDeleted", value);
    }
    /**
     * Sets the isEnabled property value. Indicates whether the agent is enabled.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabled", value);
    }
    /**
     * Sets the isProcessing property value. Indicates whether an agent&apos;s risky state is processing in the backend.
     * @param value Value to set for the isProcessing property.
     */
    public void setIsProcessing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isProcessing", value);
    }
    /**
     * Sets the machineId property value. The machineId property
     * @param value Value to set for the machineId property.
     */
    public void setMachineId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("machineId", value);
    }
    /**
     * Sets the riskDetail property value. The riskDetail property
     * @param value Value to set for the riskDetail property.
     */
    public void setRiskDetail(@jakarta.annotation.Nullable final RiskDetail value) {
        this.backingStore.set("riskDetail", value);
    }
    /**
     * Sets the riskLastModifiedDateTime property value. The date and time that the risky agent was last updated. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.  Supports $filter (eq, le, and ge).
     * @param value Value to set for the riskLastModifiedDateTime property.
     */
    public void setRiskLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("riskLastModifiedDateTime", value);
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
    /**
     * Sets the runtimeRisk property value. The runtimeRisk property
     * @param value Value to set for the runtimeRisk property.
     */
    public void setRuntimeRisk(@jakarta.annotation.Nullable final RuntimeRisk value) {
        this.backingStore.set("runtimeRisk", value);
    }
    /**
     * Sets the sources property value. The sources property
     * @param value Value to set for the sources property.
     */
    public void setSources(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("sources", value);
    }
}
