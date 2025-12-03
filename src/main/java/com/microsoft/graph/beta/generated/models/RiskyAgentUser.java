package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RiskyAgentUser extends RiskyAgent implements Parsable {
    /**
     * Instantiates a new {@link RiskyAgentUser} and sets the default values.
     */
    public RiskyAgentUser() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RiskyAgentUser}
     */
    @jakarta.annotation.Nonnull
    public static RiskyAgentUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RiskyAgentUser();
    }
    /**
     * Gets the agentUser property value. The agentUser property
     * @return a {@link AgentUser}
     */
    @jakarta.annotation.Nullable
    public AgentUser getAgentUser() {
        return this.backingStore.get("agentUser");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentUser", (n) -> { this.setAgentUser(n.getObjectValue(AgentUser::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("agentUser", this.getAgentUser());
    }
    /**
     * Sets the agentUser property value. The agentUser property
     * @param value Value to set for the agentUser property.
     */
    public void setAgentUser(@jakarta.annotation.Nullable final AgentUser value) {
        this.backingStore.set("agentUser", value);
    }
}
