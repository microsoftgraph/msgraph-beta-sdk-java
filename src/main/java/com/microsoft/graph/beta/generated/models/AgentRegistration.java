package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity that represents an agent registration containing metadata, endpointconfiguration, tools, and publishing information.This entity provides developers and administrators with all details needed tomanage agent instances including their instructions, owners, publishing status,and associated tools.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentRegistration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AgentRegistration} and sets the default values.
     */
    public AgentRegistration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentRegistration}
     */
    @jakarta.annotation.Nonnull
    public static AgentRegistration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentRegistration();
    }
    /**
     * Gets the agentCard property value. Flexible Json manifest containing agent card information following public manifestspecifications. Can include displayName, description, iconUrl, version, provider,capabilities, skills, security, and other manifest-defined fields.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAgentCard() {
        return this.backingStore.get("agentCard");
    }
    /**
     * Gets the agentIdentityBlueprintId property value. Agent identity blueprint identifier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentIdentityBlueprintId() {
        return this.backingStore.get("agentIdentityBlueprintId");
    }
    /**
     * Gets the agentIdentityId property value. Entra agent identity identifier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentIdentityId() {
        return this.backingStore.get("agentIdentityId");
    }
    /**
     * Gets the createdBy property value. The unique identifier of the user or app who created the agent registration.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the description property value. The agent description providing an overview of its purpose and capabilities.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Display name for the agent instance.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("agentCard", (n) -> { this.setAgentCard(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("agentIdentityBlueprintId", (n) -> { this.setAgentIdentityBlueprintId(n.getStringValue()); });
        deserializerMap.put("agentIdentityId", (n) -> { this.setAgentIdentityId(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastPublishedBy", (n) -> { this.setLastPublishedBy(n.getStringValue()); });
        deserializerMap.put("managedByAppId", (n) -> { this.setManagedByAppId(n.getStringValue()); });
        deserializerMap.put("originatingStore", (n) -> { this.setOriginatingStore(n.getStringValue()); });
        deserializerMap.put("ownerIds", (n) -> { this.setOwnerIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("sourceAgentId", (n) -> { this.setSourceAgentId(n.getStringValue()); });
        deserializerMap.put("sourceCreatedDateTime", (n) -> { this.setSourceCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sourceLastModifiedDateTime", (n) -> { this.setSourceLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastPublishedBy property value. The unique identifier of the last person to publish the agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastPublishedBy() {
        return this.backingStore.get("lastPublishedBy");
    }
    /**
     * Gets the managedByAppId property value. Application identifier managing this agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedByAppId() {
        return this.backingStore.get("managedByAppId");
    }
    /**
     * Gets the originatingStore property value. Name of the store/system where the agent originated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginatingStore() {
        return this.backingStore.get("originatingStore");
    }
    /**
     * Gets the ownerIds property value. List of owner identifiers  for the agent in case of user registering agent. Either owners or managedby is required
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOwnerIds() {
        return this.backingStore.get("ownerIds");
    }
    /**
     * Gets the sourceAgentId property value. Original agent identifier from source system.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceAgentId() {
        return this.backingStore.get("sourceAgentId");
    }
    /**
     * Gets the sourceCreatedDateTime property value. The date and time when the agent instance was created from source.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSourceCreatedDateTime() {
        return this.backingStore.get("sourceCreatedDateTime");
    }
    /**
     * Gets the sourceLastModifiedDateTime property value. The date and time when the agent instance was last modified from source.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSourceLastModifiedDateTime() {
        return this.backingStore.get("sourceLastModifiedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("agentCard", this.getAgentCard());
        writer.writeStringValue("agentIdentityBlueprintId", this.getAgentIdentityBlueprintId());
        writer.writeStringValue("agentIdentityId", this.getAgentIdentityId());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("lastPublishedBy", this.getLastPublishedBy());
        writer.writeStringValue("managedByAppId", this.getManagedByAppId());
        writer.writeStringValue("originatingStore", this.getOriginatingStore());
        writer.writeCollectionOfPrimitiveValues("ownerIds", this.getOwnerIds());
        writer.writeStringValue("sourceAgentId", this.getSourceAgentId());
        writer.writeOffsetDateTimeValue("sourceCreatedDateTime", this.getSourceCreatedDateTime());
        writer.writeOffsetDateTimeValue("sourceLastModifiedDateTime", this.getSourceLastModifiedDateTime());
    }
    /**
     * Sets the agentCard property value. Flexible Json manifest containing agent card information following public manifestspecifications. Can include displayName, description, iconUrl, version, provider,capabilities, skills, security, and other manifest-defined fields.
     * @param value Value to set for the agentCard property.
     */
    public void setAgentCard(@jakarta.annotation.Nullable final UntypedNode value) {
        this.backingStore.set("agentCard", value);
    }
    /**
     * Sets the agentIdentityBlueprintId property value. Agent identity blueprint identifier.
     * @param value Value to set for the agentIdentityBlueprintId property.
     */
    public void setAgentIdentityBlueprintId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentIdentityBlueprintId", value);
    }
    /**
     * Sets the agentIdentityId property value. Entra agent identity identifier.
     * @param value Value to set for the agentIdentityId property.
     */
    public void setAgentIdentityId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentIdentityId", value);
    }
    /**
     * Sets the createdBy property value. The unique identifier of the user or app who created the agent registration.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the description property value. The agent description providing an overview of its purpose and capabilities.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Display name for the agent instance.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastPublishedBy property value. The unique identifier of the last person to publish the agent.
     * @param value Value to set for the lastPublishedBy property.
     */
    public void setLastPublishedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastPublishedBy", value);
    }
    /**
     * Sets the managedByAppId property value. Application identifier managing this agent.
     * @param value Value to set for the managedByAppId property.
     */
    public void setManagedByAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedByAppId", value);
    }
    /**
     * Sets the originatingStore property value. Name of the store/system where the agent originated.
     * @param value Value to set for the originatingStore property.
     */
    public void setOriginatingStore(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originatingStore", value);
    }
    /**
     * Sets the ownerIds property value. List of owner identifiers  for the agent in case of user registering agent. Either owners or managedby is required
     * @param value Value to set for the ownerIds property.
     */
    public void setOwnerIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ownerIds", value);
    }
    /**
     * Sets the sourceAgentId property value. Original agent identifier from source system.
     * @param value Value to set for the sourceAgentId property.
     */
    public void setSourceAgentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceAgentId", value);
    }
    /**
     * Sets the sourceCreatedDateTime property value. The date and time when the agent instance was created from source.
     * @param value Value to set for the sourceCreatedDateTime property.
     */
    public void setSourceCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("sourceCreatedDateTime", value);
    }
    /**
     * Sets the sourceLastModifiedDateTime property value. The date and time when the agent instance was last modified from source.
     * @param value Value to set for the sourceLastModifiedDateTime property.
     */
    public void setSourceLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("sourceLastModifiedDateTime", value);
    }
}
