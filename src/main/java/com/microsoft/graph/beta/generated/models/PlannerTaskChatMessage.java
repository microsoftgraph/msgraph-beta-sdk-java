package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerTaskChatMessage extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PlannerTaskChatMessage} and sets the default values.
     */
    public PlannerTaskChatMessage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerTaskChatMessage}
     */
    @jakarta.annotation.Nonnull
    public static PlannerTaskChatMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskChatMessage();
    }
    /**
     * Gets the content property value. The content of the chat message. Supports plain text and sanitized HTML.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the createdBy property value. The identity of the user who created the message.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. The date and time when the message was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deletedDateTime property value. The deletedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this.backingStore.get("deletedDateTime");
    }
    /**
     * Gets the editedDateTime property value. The editedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEditedDateTime() {
        return this.backingStore.get("editedDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deletedDateTime", (n) -> { this.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("editedDateTime", (n) -> { this.setEditedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("mentions", (n) -> { this.setMentions(n.getCollectionOfObjectValues(PlannerTaskChatMention::createFromDiscriminatorValue)); });
        deserializerMap.put("messageType", (n) -> { this.setMessageType(n.getEnumValue(PlannerTaskChatMessageType::forValue)); });
        deserializerMap.put("parentEntityId", (n) -> { this.setParentEntityId(n.getStringValue()); });
        deserializerMap.put("reactions", (n) -> { this.setReactions(n.getCollectionOfObjectValues(PlannerTaskChatReaction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mentions property value. The list of mentions in the message.
     * @return a {@link java.util.List<PlannerTaskChatMention>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerTaskChatMention> getMentions() {
        return this.backingStore.get("mentions");
    }
    /**
     * Gets the messageType property value. The messageType property
     * @return a {@link PlannerTaskChatMessageType}
     */
    @jakarta.annotation.Nullable
    public PlannerTaskChatMessageType getMessageType() {
        return this.backingStore.get("messageType");
    }
    /**
     * Gets the parentEntityId property value. The ID of the parent plannerTask that this message belongs to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentEntityId() {
        return this.backingStore.get("parentEntityId");
    }
    /**
     * Gets the reactions property value. The reactions on the message.
     * @return a {@link java.util.List<PlannerTaskChatReaction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlannerTaskChatReaction> getReactions() {
        return this.backingStore.get("reactions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeOffsetDateTimeValue("deletedDateTime", this.getDeletedDateTime());
        writer.writeOffsetDateTimeValue("editedDateTime", this.getEditedDateTime());
        writer.writeCollectionOfObjectValues("mentions", this.getMentions());
        writer.writeEnumValue("messageType", this.getMessageType());
        writer.writeStringValue("parentEntityId", this.getParentEntityId());
        writer.writeCollectionOfObjectValues("reactions", this.getReactions());
    }
    /**
     * Sets the content property value. The content of the chat message. Supports plain text and sanitized HTML.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the createdBy property value. The identity of the user who created the message.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. The date and time when the message was created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deletedDateTime property value. The deletedDateTime property
     * @param value Value to set for the deletedDateTime property.
     */
    public void setDeletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("deletedDateTime", value);
    }
    /**
     * Sets the editedDateTime property value. The editedDateTime property
     * @param value Value to set for the editedDateTime property.
     */
    public void setEditedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("editedDateTime", value);
    }
    /**
     * Sets the mentions property value. The list of mentions in the message.
     * @param value Value to set for the mentions property.
     */
    public void setMentions(@jakarta.annotation.Nullable final java.util.List<PlannerTaskChatMention> value) {
        this.backingStore.set("mentions", value);
    }
    /**
     * Sets the messageType property value. The messageType property
     * @param value Value to set for the messageType property.
     */
    public void setMessageType(@jakarta.annotation.Nullable final PlannerTaskChatMessageType value) {
        this.backingStore.set("messageType", value);
    }
    /**
     * Sets the parentEntityId property value. The ID of the parent plannerTask that this message belongs to.
     * @param value Value to set for the parentEntityId property.
     */
    public void setParentEntityId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentEntityId", value);
    }
    /**
     * Sets the reactions property value. The reactions on the message.
     * @param value Value to set for the reactions property.
     */
    public void setReactions(@jakarta.annotation.Nullable final java.util.List<PlannerTaskChatReaction> value) {
        this.backingStore.set("reactions", value);
    }
}
