package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesAgent extends Entity implements Parsable {
    /**
     * List of onPremisesAgentGroups that an onPremisesAgent is assigned to. Read-only. Nullable.
     */
    private java.util.List<OnPremisesAgentGroup> agentGroups;
    /**
     * The external IP address as detected by the service for the agent machine. Read-only
     */
    private String externalIp;
    /**
     * The name of the machine that the aggent is running on. Read-only
     */
    private String machineName;
    /**
     * The status property
     */
    private AgentStatus status;
    /**
     * The supportedPublishingTypes property
     */
    private java.util.List<OnPremisesPublishingType> supportedPublishingTypes;
    /**
     * Instantiates a new OnPremisesAgent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesAgent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OnPremisesAgent
     */
    @javax.annotation.Nonnull
    public static OnPremisesAgent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesAgent();
    }
    /**
     * Gets the agentGroups property value. List of onPremisesAgentGroups that an onPremisesAgent is assigned to. Read-only. Nullable.
     * @return a onPremisesAgentGroup
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesAgentGroup> getAgentGroups() {
        return this.agentGroups;
    }
    /**
     * Gets the externalIp property value. The external IP address as detected by the service for the agent machine. Read-only
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalIp() {
        return this.externalIp;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentGroups", (n) -> { this.setAgentGroups(n.getCollectionOfObjectValues(OnPremisesAgentGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("externalIp", (n) -> { this.setExternalIp(n.getStringValue()); });
        deserializerMap.put("machineName", (n) -> { this.setMachineName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AgentStatus.class)); });
        deserializerMap.put("supportedPublishingTypes", (n) -> { this.setSupportedPublishingTypes(n.getCollectionOfEnumValues(OnPremisesPublishingType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the machineName property value. The name of the machine that the aggent is running on. Read-only
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMachineName() {
        return this.machineName;
    }
    /**
     * Gets the status property value. The status property
     * @return a AgentStatus
     */
    @javax.annotation.Nullable
    public AgentStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the supportedPublishingTypes property value. The supportedPublishingTypes property
     * @return a OnPremisesPublishingType
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesPublishingType> getSupportedPublishingTypes() {
        return this.supportedPublishingTypes;
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
        writer.writeCollectionOfObjectValues("agentGroups", this.getAgentGroups());
        writer.writeStringValue("externalIp", this.getExternalIp());
        writer.writeStringValue("machineName", this.getMachineName());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfEnumValues("supportedPublishingTypes", this.getSupportedPublishingTypes());
    }
    /**
     * Sets the agentGroups property value. List of onPremisesAgentGroups that an onPremisesAgent is assigned to. Read-only. Nullable.
     * @param value Value to set for the agentGroups property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAgentGroups(@javax.annotation.Nullable final java.util.List<OnPremisesAgentGroup> value) {
        this.agentGroups = value;
    }
    /**
     * Sets the externalIp property value. The external IP address as detected by the service for the agent machine. Read-only
     * @param value Value to set for the externalIp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalIp(@javax.annotation.Nullable final String value) {
        this.externalIp = value;
    }
    /**
     * Sets the machineName property value. The name of the machine that the aggent is running on. Read-only
     * @param value Value to set for the machineName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMachineName(@javax.annotation.Nullable final String value) {
        this.machineName = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final AgentStatus value) {
        this.status = value;
    }
    /**
     * Sets the supportedPublishingTypes property value. The supportedPublishingTypes property
     * @param value Value to set for the supportedPublishingTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedPublishingTypes(@javax.annotation.Nullable final java.util.List<OnPremisesPublishingType> value) {
        this.supportedPublishingTypes = value;
    }
}
