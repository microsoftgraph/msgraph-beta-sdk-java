package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentIdentity extends ServicePrincipal implements Parsable {
    /**
     * Instantiates a new {@link AgentIdentity} and sets the default values.
     */
    public AgentIdentity() {
        super();
        this.setOdataType("#microsoft.graph.agentIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentIdentity}
     */
    @jakarta.annotation.Nonnull
    public static AgentIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentIdentity();
    }
    /**
     * Gets the agentAppId property value. The agentAppId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentAppId() {
        return this.backingStore.get("agentAppId");
    }
    /**
     * Gets the agentIdentityBlueprintId property value. The appId of the agent identity blueprint that defines the configuration for this agent identity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentIdentityBlueprintId() {
        return this.backingStore.get("agentIdentityBlueprintId");
    }
    /**
     * Gets the createdDateTime property value. The date and time the agent identity was created. Read-only. Inherited from servicePrincipal.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentAppId", (n) -> { this.setAgentAppId(n.getStringValue()); });
        deserializerMap.put("agentIdentityBlueprintId", (n) -> { this.setAgentIdentityBlueprintId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("agentAppId", this.getAgentAppId());
        writer.writeStringValue("agentIdentityBlueprintId", this.getAgentIdentityBlueprintId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
    }
    /**
     * Sets the agentAppId property value. The agentAppId property
     * @param value Value to set for the agentAppId property.
     */
    public void setAgentAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentAppId", value);
    }
    /**
     * Sets the agentIdentityBlueprintId property value. The appId of the agent identity blueprint that defines the configuration for this agent identity.
     * @param value Value to set for the agentIdentityBlueprintId property.
     */
    public void setAgentIdentityBlueprintId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentIdentityBlueprintId", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time the agent identity was created. Read-only. Inherited from servicePrincipal.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
}
