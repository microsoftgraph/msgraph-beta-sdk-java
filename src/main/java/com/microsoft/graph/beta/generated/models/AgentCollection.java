package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentCollection extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AgentCollection} and sets the default values.
     */
    public AgentCollection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentCollection}
     */
    @jakarta.annotation.Nonnull
    public static AgentCollection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentCollection();
    }
    /**
     * Gets the createdBy property value. Object ID of the user or app that created the agent instance.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Timestamp when agent collection was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Description / purpose of the collection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. Friendly name of the collection.
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
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedBy", (n) -> { this.setManagedBy(n.getStringValue()); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(AgentInstance::createFromDiscriminatorValue)); });
        deserializerMap.put("originatingStore", (n) -> { this.setOriginatingStore(n.getStringValue()); });
        deserializerMap.put("ownerIds", (n) -> { this.setOwnerIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. Timestamp of last update.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the managedBy property value. appId (referred to as Application (client) ID on the Microsoft Entra admin center) of the service principal managing this agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedBy() {
        return this.backingStore.get("managedBy");
    }
    /**
     * Gets the members property value. List of agent instances that are members of this collection. Supports $expand.
     * @return a {@link java.util.List<AgentInstance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgentInstance> getMembers() {
        return this.backingStore.get("members");
    }
    /**
     * Gets the originatingStore property value. Source system/store where the collection originated. For example Copilot Studio.
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("managedBy", this.getManagedBy());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeStringValue("originatingStore", this.getOriginatingStore());
        writer.writeCollectionOfPrimitiveValues("ownerIds", this.getOwnerIds());
    }
    /**
     * Sets the createdBy property value. Object ID of the user or app that created the agent instance.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Timestamp when agent collection was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Description / purpose of the collection.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. Friendly name of the collection.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Timestamp of last update.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the managedBy property value. appId (referred to as Application (client) ID on the Microsoft Entra admin center) of the service principal managing this agent.
     * @param value Value to set for the managedBy property.
     */
    public void setManagedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedBy", value);
    }
    /**
     * Sets the members property value. List of agent instances that are members of this collection. Supports $expand.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<AgentInstance> value) {
        this.backingStore.set("members", value);
    }
    /**
     * Sets the originatingStore property value. Source system/store where the collection originated. For example Copilot Studio.
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
}
