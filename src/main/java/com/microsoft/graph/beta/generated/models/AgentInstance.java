package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentInstance extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AgentInstance} and sets the default values.
     */
    public AgentInstance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentInstance}
     */
    @jakarta.annotation.Nonnull
    public static AgentInstance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentInstance();
    }
    /**
     * Gets the additionalInterfaces property value. Additional interfaces/transports supported by the agent.
     * @return a {@link java.util.List<AgentInterface>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgentInterface> getAdditionalInterfaces() {
        return this.backingStore.get("additionalInterfaces");
    }
    /**
     * Gets the agentCardManifest property value. The agent card manifest of the agent instance.
     * @return a {@link AgentCardManifest}
     */
    @jakarta.annotation.Nullable
    public AgentCardManifest getAgentCardManifest() {
        return this.backingStore.get("agentCardManifest");
    }
    /**
     * Gets the agentIdentityBlueprintId property value. Object ID of the agentIdentityBlueprint object.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentIdentityBlueprintId() {
        return this.backingStore.get("agentIdentityBlueprintId");
    }
    /**
     * Gets the agentIdentityId property value. Object ID of the agentIdentity object.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentIdentityId() {
        return this.backingStore.get("agentIdentityId");
    }
    /**
     * Gets the agentUserId property value. Object ID of the agentUser associated with the agent. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAgentUserId() {
        return this.backingStore.get("agentUserId");
    }
    /**
     * Gets the collections property value. The agent collections that the agent instance is a member of.
     * @return a {@link java.util.List<AgentCollection>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgentCollection> getCollections() {
        return this.backingStore.get("collections");
    }
    /**
     * Gets the createdBy property value. Object ID of the user or application that created the agent instance. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Timestamp when agent instance was created. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
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
        deserializerMap.put("additionalInterfaces", (n) -> { this.setAdditionalInterfaces(n.getCollectionOfObjectValues(AgentInterface::createFromDiscriminatorValue)); });
        deserializerMap.put("agentCardManifest", (n) -> { this.setAgentCardManifest(n.getObjectValue(AgentCardManifest::createFromDiscriminatorValue)); });
        deserializerMap.put("agentIdentityBlueprintId", (n) -> { this.setAgentIdentityBlueprintId(n.getStringValue()); });
        deserializerMap.put("agentIdentityId", (n) -> { this.setAgentIdentityId(n.getStringValue()); });
        deserializerMap.put("agentUserId", (n) -> { this.setAgentUserId(n.getStringValue()); });
        deserializerMap.put("collections", (n) -> { this.setCollections(n.getCollectionOfObjectValues(AgentCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedBy", (n) -> { this.setManagedBy(n.getStringValue()); });
        deserializerMap.put("originatingStore", (n) -> { this.setOriginatingStore(n.getStringValue()); });
        deserializerMap.put("ownerIds", (n) -> { this.setOwnerIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("preferredTransport", (n) -> { this.setPreferredTransport(n.getStringValue()); });
        deserializerMap.put("signatures", (n) -> { this.setSignatures(n.getCollectionOfObjectValues(AgentCardSignature::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceAgentId", (n) -> { this.setSourceAgentId(n.getStringValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Timestamp of last modification.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the managedBy property value. appId (referred to as Application (client) ID on the Microsoft Entra admin center) of the application managing this agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedBy() {
        return this.backingStore.get("managedBy");
    }
    /**
     * Gets the originatingStore property value. Name of the store/system where agent originated. For example Copilot Studio.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginatingStore() {
        return this.backingStore.get("originatingStore");
    }
    /**
     * Gets the ownerIds property value. List of object IDs for the owners of the agent instance.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOwnerIds() {
        return this.backingStore.get("ownerIds");
    }
    /**
     * Gets the preferredTransport property value. Preferred transport protocol. The possible values are JSONRPC, GRPC, and HTTP+JSON.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreferredTransport() {
        return this.backingStore.get("preferredTransport");
    }
    /**
     * Gets the signatures property value. Digital signatures for the agent instance.
     * @return a {@link java.util.List<AgentCardSignature>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgentCardSignature> getSignatures() {
        return this.backingStore.get("signatures");
    }
    /**
     * Gets the sourceAgentId property value. Identifier of the agent in the original source system.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceAgentId() {
        return this.backingStore.get("sourceAgentId");
    }
    /**
     * Gets the url property value. Endpoint URL for the agent instance.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.backingStore.get("url");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("additionalInterfaces", this.getAdditionalInterfaces());
        writer.writeObjectValue("agentCardManifest", this.getAgentCardManifest());
        writer.writeStringValue("agentIdentityBlueprintId", this.getAgentIdentityBlueprintId());
        writer.writeStringValue("agentIdentityId", this.getAgentIdentityId());
        writer.writeStringValue("agentUserId", this.getAgentUserId());
        writer.writeCollectionOfObjectValues("collections", this.getCollections());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("managedBy", this.getManagedBy());
        writer.writeStringValue("originatingStore", this.getOriginatingStore());
        writer.writeCollectionOfPrimitiveValues("ownerIds", this.getOwnerIds());
        writer.writeStringValue("preferredTransport", this.getPreferredTransport());
        writer.writeCollectionOfObjectValues("signatures", this.getSignatures());
        writer.writeStringValue("sourceAgentId", this.getSourceAgentId());
        writer.writeStringValue("url", this.getUrl());
    }
    /**
     * Sets the additionalInterfaces property value. Additional interfaces/transports supported by the agent.
     * @param value Value to set for the additionalInterfaces property.
     */
    public void setAdditionalInterfaces(@jakarta.annotation.Nullable final java.util.List<AgentInterface> value) {
        this.backingStore.set("additionalInterfaces", value);
    }
    /**
     * Sets the agentCardManifest property value. The agent card manifest of the agent instance.
     * @param value Value to set for the agentCardManifest property.
     */
    public void setAgentCardManifest(@jakarta.annotation.Nullable final AgentCardManifest value) {
        this.backingStore.set("agentCardManifest", value);
    }
    /**
     * Sets the agentIdentityBlueprintId property value. Object ID of the agentIdentityBlueprint object.
     * @param value Value to set for the agentIdentityBlueprintId property.
     */
    public void setAgentIdentityBlueprintId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentIdentityBlueprintId", value);
    }
    /**
     * Sets the agentIdentityId property value. Object ID of the agentIdentity object.
     * @param value Value to set for the agentIdentityId property.
     */
    public void setAgentIdentityId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentIdentityId", value);
    }
    /**
     * Sets the agentUserId property value. Object ID of the agentUser associated with the agent. Read-only.
     * @param value Value to set for the agentUserId property.
     */
    public void setAgentUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("agentUserId", value);
    }
    /**
     * Sets the collections property value. The agent collections that the agent instance is a member of.
     * @param value Value to set for the collections property.
     */
    public void setCollections(@jakarta.annotation.Nullable final java.util.List<AgentCollection> value) {
        this.backingStore.set("collections", value);
    }
    /**
     * Sets the createdBy property value. Object ID of the user or application that created the agent instance. Read-only.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Timestamp when agent instance was created. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. Display name for the agent instance.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Timestamp of last modification.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the managedBy property value. appId (referred to as Application (client) ID on the Microsoft Entra admin center) of the application managing this agent.
     * @param value Value to set for the managedBy property.
     */
    public void setManagedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedBy", value);
    }
    /**
     * Sets the originatingStore property value. Name of the store/system where agent originated. For example Copilot Studio.
     * @param value Value to set for the originatingStore property.
     */
    public void setOriginatingStore(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originatingStore", value);
    }
    /**
     * Sets the ownerIds property value. List of object IDs for the owners of the agent instance.
     * @param value Value to set for the ownerIds property.
     */
    public void setOwnerIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ownerIds", value);
    }
    /**
     * Sets the preferredTransport property value. Preferred transport protocol. The possible values are JSONRPC, GRPC, and HTTP+JSON.
     * @param value Value to set for the preferredTransport property.
     */
    public void setPreferredTransport(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("preferredTransport", value);
    }
    /**
     * Sets the signatures property value. Digital signatures for the agent instance.
     * @param value Value to set for the signatures property.
     */
    public void setSignatures(@jakarta.annotation.Nullable final java.util.List<AgentCardSignature> value) {
        this.backingStore.set("signatures", value);
    }
    /**
     * Sets the sourceAgentId property value. Identifier of the agent in the original source system.
     * @param value Value to set for the sourceAgentId property.
     */
    public void setSourceAgentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceAgentId", value);
    }
    /**
     * Sets the url property value. Endpoint URL for the agent instance.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("url", value);
    }
}
