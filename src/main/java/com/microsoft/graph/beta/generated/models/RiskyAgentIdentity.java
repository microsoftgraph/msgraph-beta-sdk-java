package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RiskyAgentIdentity extends RiskyAgent implements Parsable {
    /**
     * Instantiates a new {@link RiskyAgentIdentity} and sets the default values.
     */
    public RiskyAgentIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RiskyAgentIdentity}
     */
    @jakarta.annotation.Nonnull
    public static RiskyAgentIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RiskyAgentIdentity();
    }
    /**
     * Gets the agentIdentity property value. The agentIdentity property
     * @return a {@link AgentIdentity}
     */
    @jakarta.annotation.Nullable
    public AgentIdentity getAgentIdentity() {
        return this.backingStore.get("agentIdentity");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentIdentity", (n) -> { this.setAgentIdentity(n.getObjectValue(AgentIdentity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("agentIdentity", this.getAgentIdentity());
    }
    /**
     * Sets the agentIdentity property value. The agentIdentity property
     * @param value Value to set for the agentIdentity property.
     */
    public void setAgentIdentity(@jakarta.annotation.Nullable final AgentIdentity value) {
        this.backingStore.set("agentIdentity", value);
    }
}
