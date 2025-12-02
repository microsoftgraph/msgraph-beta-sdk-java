package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentSignIn extends SignInIdentity implements Parsable {
    /**
     * Instantiates a new {@link AgentSignIn} and sets the default values.
     */
    public AgentSignIn() {
        super();
        this.setOdataType("#microsoft.graph.agentSignIn");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentSignIn}
     */
    @jakarta.annotation.Nonnull
    public static AgentSignIn createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentSignIn();
    }
    /**
     * Gets the agentServicePrincipalId property value. Agent identity object IDs included in the policy.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentServicePrincipalId() {
        return this.backingStore.get("agentServicePrincipalId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentServicePrincipalId", (n) -> { this.setAgentServicePrincipalId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("agentServicePrincipalId", this.getAgentServicePrincipalId());
    }
    /**
     * Sets the agentServicePrincipalId property value. Agent identity object IDs included in the policy.
     * @param value Value to set for the agentServicePrincipalId property.
     */
    public void setAgentServicePrincipalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentServicePrincipalId", value);
    }
}
