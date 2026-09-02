package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentCommunicationConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AgentCommunicationConfiguration} and sets the default values.
     */
    public AgentCommunicationConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentCommunicationConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AgentCommunicationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentCommunicationConfiguration();
    }
    /**
     * Gets the endpointConfiguration property value. The endpoint binding (bot ID or callback URI) that the agent uses to receive messages.
     * @return a {@link AgentEndpointConfiguration}
     */
    @jakarta.annotation.Nullable
    public AgentEndpointConfiguration getEndpointConfiguration() {
        return this.backingStore.get("endpointConfiguration");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endpointConfiguration", (n) -> { this.setEndpointConfiguration(n.getObjectValue(AgentEndpointConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("isOverridableAtAgentIdLevel", (n) -> { this.setIsOverridableAtAgentIdLevel(n.getBooleanValue()); });
        deserializerMap.put("teamworkConfiguration", (n) -> { this.setTeamworkConfiguration(n.getObjectValue(AgentTeamworkConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isOverridableAtAgentIdLevel property value. Indicates whether individual agent instances created from this blueprint can override the endpointConfiguration. When true, each instance can override it; when false, every instance inherits it. Not nullable.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOverridableAtAgentIdLevel() {
        return this.backingStore.get("isOverridableAtAgentIdLevel");
    }
    /**
     * Gets the teamworkConfiguration property value. The per-conversation-context message notification settings (group chat, channel, one-on-one chat, and meeting chat) that agents use.
     * @return a {@link AgentTeamworkConfiguration}
     */
    @jakarta.annotation.Nullable
    public AgentTeamworkConfiguration getTeamworkConfiguration() {
        return this.backingStore.get("teamworkConfiguration");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("endpointConfiguration", this.getEndpointConfiguration());
        writer.writeBooleanValue("isOverridableAtAgentIdLevel", this.getIsOverridableAtAgentIdLevel());
        writer.writeObjectValue("teamworkConfiguration", this.getTeamworkConfiguration());
    }
    /**
     * Sets the endpointConfiguration property value. The endpoint binding (bot ID or callback URI) that the agent uses to receive messages.
     * @param value Value to set for the endpointConfiguration property.
     */
    public void setEndpointConfiguration(@jakarta.annotation.Nullable final AgentEndpointConfiguration value) {
        this.backingStore.set("endpointConfiguration", value);
    }
    /**
     * Sets the isOverridableAtAgentIdLevel property value. Indicates whether individual agent instances created from this blueprint can override the endpointConfiguration. When true, each instance can override it; when false, every instance inherits it. Not nullable.
     * @param value Value to set for the isOverridableAtAgentIdLevel property.
     */
    public void setIsOverridableAtAgentIdLevel(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOverridableAtAgentIdLevel", value);
    }
    /**
     * Sets the teamworkConfiguration property value. The per-conversation-context message notification settings (group chat, channel, one-on-one chat, and meeting chat) that agents use.
     * @param value Value to set for the teamworkConfiguration property.
     */
    public void setTeamworkConfiguration(@jakarta.annotation.Nullable final AgentTeamworkConfiguration value) {
        this.backingStore.set("teamworkConfiguration", value);
    }
}
