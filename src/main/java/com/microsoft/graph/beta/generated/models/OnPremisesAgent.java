package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnPremisesAgent extends Entity implements Parsable {
    /**
     * Instantiates a new {@link OnPremisesAgent} and sets the default values.
     */
    public OnPremisesAgent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnPremisesAgent}
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesAgent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesAgent();
    }
    /**
     * Gets the agentGroups property value. List of onPremisesAgentGroups that an onPremisesAgent is assigned to. Read-only. Nullable.
     * @return a {@link java.util.List<OnPremisesAgentGroup>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnPremisesAgentGroup> getAgentGroups() {
        return this.backingStore.get("agentGroups");
    }
    /**
     * Gets the externalIp property value. The external IP address as detected by the service for the agent machine. Read-only
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalIp() {
        return this.backingStore.get("externalIp");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentGroups", (n) -> { this.setAgentGroups(n.getCollectionOfObjectValues(OnPremisesAgentGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("externalIp", (n) -> { this.setExternalIp(n.getStringValue()); });
        deserializerMap.put("machineName", (n) -> { this.setMachineName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AgentStatus::forValue)); });
        deserializerMap.put("supportedPublishingTypes", (n) -> { this.setSupportedPublishingTypes(n.getCollectionOfEnumValues(OnPremisesPublishingType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the machineName property value. The name of the machine that the agent is running on. Read-only
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMachineName() {
        return this.backingStore.get("machineName");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link AgentStatus}
     */
    @jakarta.annotation.Nullable
    public AgentStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the supportedPublishingTypes property value. The supportedPublishingTypes property
     * @return a {@link java.util.List<OnPremisesPublishingType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnPremisesPublishingType> getSupportedPublishingTypes() {
        return this.backingStore.get("supportedPublishingTypes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("agentGroups", this.getAgentGroups());
        writer.writeStringValue("externalIp", this.getExternalIp());
        writer.writeStringValue("machineName", this.getMachineName());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfEnumValues("supportedPublishingTypes", this.getSupportedPublishingTypes());
    }
    /**
     * Sets the agentGroups property value. List of onPremisesAgentGroups that an onPremisesAgent is assigned to. Read-only. Nullable.
     * @param value Value to set for the agentGroups property.
     */
    public void setAgentGroups(@jakarta.annotation.Nullable final java.util.List<OnPremisesAgentGroup> value) {
        this.backingStore.set("agentGroups", value);
    }
    /**
     * Sets the externalIp property value. The external IP address as detected by the service for the agent machine. Read-only
     * @param value Value to set for the externalIp property.
     */
    public void setExternalIp(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalIp", value);
    }
    /**
     * Sets the machineName property value. The name of the machine that the agent is running on. Read-only
     * @param value Value to set for the machineName property.
     */
    public void setMachineName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("machineName", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AgentStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the supportedPublishingTypes property value. The supportedPublishingTypes property
     * @param value Value to set for the supportedPublishingTypes property.
     */
    public void setSupportedPublishingTypes(@jakarta.annotation.Nullable final java.util.List<OnPremisesPublishingType> value) {
        this.backingStore.set("supportedPublishingTypes", value);
    }
}
