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
                case "#microsoft.graph.riskyAgentIdentity": return new RiskyAgentIdentity();
                case "#microsoft.graph.riskyAgentIdentityBlueprintPrincipal": return new RiskyAgentIdentityBlueprintPrincipal();
                case "#microsoft.graph.riskyAgentUser": return new RiskyAgentUser();
            }
        }
        return new RiskyAgent();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentDisplayName", (n) -> { this.setAgentDisplayName(n.getStringValue()); });
        deserializerMap.put("isDeleted", (n) -> { this.setIsDeleted(n.getBooleanValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("isProcessing", (n) -> { this.setIsProcessing(n.getBooleanValue()); });
        deserializerMap.put("riskDetail", (n) -> { this.setRiskDetail(n.getEnumValue(RiskDetail::forValue)); });
        deserializerMap.put("riskLastModifiedDateTime", (n) -> { this.setRiskLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("riskLevel", (n) -> { this.setRiskLevel(n.getEnumValue(RiskLevel::forValue)); });
        deserializerMap.put("riskState", (n) -> { this.setRiskState(n.getEnumValue(RiskState::forValue)); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("agentDisplayName", this.getAgentDisplayName());
        writer.writeBooleanValue("isDeleted", this.getIsDeleted());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeBooleanValue("isProcessing", this.getIsProcessing());
        writer.writeEnumValue("riskDetail", this.getRiskDetail());
        writer.writeOffsetDateTimeValue("riskLastModifiedDateTime", this.getRiskLastModifiedDateTime());
        writer.writeEnumValue("riskLevel", this.getRiskLevel());
        writer.writeEnumValue("riskState", this.getRiskState());
    }
    /**
     * Sets the agentDisplayName property value. Name of the agent.  Supports $filter (eq, startsWith).
     * @param value Value to set for the agentDisplayName property.
     */
    public void setAgentDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentDisplayName", value);
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
}
