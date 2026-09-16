package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PolicyLocationAgent extends PolicyLocationApplication implements Parsable {
    /**
     * Instantiates a new {@link PolicyLocationAgent} and sets the default values.
     */
    public PolicyLocationAgent() {
        super();
        this.setOdataType("#microsoft.graph.policyLocationAgent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PolicyLocationAgent}
     */
    @jakarta.annotation.Nonnull
    public static PolicyLocationAgent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PolicyLocationAgent();
    }
    /**
     * Gets the agentMetadata property value. The agentMetadata property
     * @return a {@link AgentMetadata}
     */
    @jakarta.annotation.Nullable
    public AgentMetadata getAgentMetadata() {
        return this.backingStore.get("agentMetadata");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentMetadata", (n) -> { this.setAgentMetadata(n.getObjectValue(AgentMetadata::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("agentMetadata", this.getAgentMetadata());
    }
    /**
     * Sets the agentMetadata property value. The agentMetadata property
     * @param value Value to set for the agentMetadata property.
     */
    public void setAgentMetadata(@jakarta.annotation.Nullable final AgentMetadata value) {
        this.backingStore.set("agentMetadata", value);
    }
}
