package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerChatMessage extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link PlannerChatMessage} and sets the default values.
     */
    public PlannerChatMessage() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerChatMessage}
     */
    @jakarta.annotation.Nonnull
    public static PlannerChatMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerChatMessage();
    }
    /**
     * Gets the content property value. Body content of the chat message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.backingStore.get("content");
    }
    /**
     * Gets the createdBy property value. Identity of the user (or application) who created the entity. Read-only.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Date and time the entity was created. The value is represented in ISO 8601 format and is always in UTC time. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deletedTime property value. Date and time the message was deleted.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeletedTime() {
        return this.backingStore.get("deletedTime");
    }
    /**
     * Gets the editedTime property value. Date and time the message was last edited.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEditedTime() {
        return this.backingStore.get("editedTime");
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
        deserializerMap.put("deletedTime", (n) -> { this.setDeletedTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("editedTime", (n) -> { this.setEditedTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isDeleted", (n) -> { this.setIsDeleted(n.getBooleanValue()); });
        deserializerMap.put("isEdited", (n) -> { this.setIsEdited(n.getBooleanValue()); });
        deserializerMap.put("messageType", (n) -> { this.setMessageType(n.getEnumValue(PlannerChatMessageType::forValue)); });
        deserializerMap.put("parentEntityId", (n) -> { this.setParentEntityId(n.getStringValue()); });
        deserializerMap.put("properties", (n) -> { this.setProperties(n.getObjectValue(ChatMessageProperties::createFromDiscriminatorValue)); });
        deserializerMap.put("threadType", (n) -> { this.setThreadType(n.getEnumValue(PlannerChatThreadType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isDeleted property value. Indicates whether the message was deleted.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDeleted() {
        return this.backingStore.get("isDeleted");
    }
    /**
     * Gets the isEdited property value. Indicates whether the message was edited after it was sent.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEdited() {
        return this.backingStore.get("isEdited");
    }
    /**
     * Gets the messageType property value. Format of the message content. The possible values are: richTextHtml, plainText, unknownFutureValue.
     * @return a {@link PlannerChatMessageType}
     */
    @jakarta.annotation.Nullable
    public PlannerChatMessageType getMessageType() {
        return this.backingStore.get("messageType");
    }
    /**
     * Gets the parentEntityId property value. ID of the task or plan the message belongs to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentEntityId() {
        return this.backingStore.get("parentEntityId");
    }
    /**
     * Gets the properties property value. @mentions and reactions associated with the message.
     * @return a {@link ChatMessageProperties}
     */
    @jakarta.annotation.Nullable
    public ChatMessageProperties getProperties() {
        return this.backingStore.get("properties");
    }
    /**
     * Gets the threadType property value. Indicates whether the message belongs to a task-level or plan-level conversation. The possible values are: task, plan, unknownFutureValue.
     * @return a {@link PlannerChatThreadType}
     */
    @jakarta.annotation.Nullable
    public PlannerChatThreadType getThreadType() {
        return this.backingStore.get("threadType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("deletedTime", this.getDeletedTime());
        writer.writeOffsetDateTimeValue("editedTime", this.getEditedTime());
        writer.writeBooleanValue("isDeleted", this.getIsDeleted());
        writer.writeBooleanValue("isEdited", this.getIsEdited());
        writer.writeEnumValue("messageType", this.getMessageType());
        writer.writeStringValue("parentEntityId", this.getParentEntityId());
        writer.writeObjectValue("properties", this.getProperties());
        writer.writeEnumValue("threadType", this.getThreadType());
    }
    /**
     * Sets the content property value. Body content of the chat message.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("content", value);
    }
    /**
     * Sets the createdBy property value. Identity of the user (or application) who created the entity. Read-only.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Date and time the entity was created. The value is represented in ISO 8601 format and is always in UTC time. Read-only.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deletedTime property value. Date and time the message was deleted.
     * @param value Value to set for the deletedTime property.
     */
    public void setDeletedTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("deletedTime", value);
    }
    /**
     * Sets the editedTime property value. Date and time the message was last edited.
     * @param value Value to set for the editedTime property.
     */
    public void setEditedTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("editedTime", value);
    }
    /**
     * Sets the isDeleted property value. Indicates whether the message was deleted.
     * @param value Value to set for the isDeleted property.
     */
    public void setIsDeleted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDeleted", value);
    }
    /**
     * Sets the isEdited property value. Indicates whether the message was edited after it was sent.
     * @param value Value to set for the isEdited property.
     */
    public void setIsEdited(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEdited", value);
    }
    /**
     * Sets the messageType property value. Format of the message content. The possible values are: richTextHtml, plainText, unknownFutureValue.
     * @param value Value to set for the messageType property.
     */
    public void setMessageType(@jakarta.annotation.Nullable final PlannerChatMessageType value) {
        this.backingStore.set("messageType", value);
    }
    /**
     * Sets the parentEntityId property value. ID of the task or plan the message belongs to.
     * @param value Value to set for the parentEntityId property.
     */
    public void setParentEntityId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentEntityId", value);
    }
    /**
     * Sets the properties property value. @mentions and reactions associated with the message.
     * @param value Value to set for the properties property.
     */
    public void setProperties(@jakarta.annotation.Nullable final ChatMessageProperties value) {
        this.backingStore.set("properties", value);
    }
    /**
     * Sets the threadType property value. Indicates whether the message belongs to a task-level or plan-level conversation. The possible values are: task, plan, unknownFutureValue.
     * @param value Value to set for the threadType property.
     */
    public void setThreadType(@jakarta.annotation.Nullable final PlannerChatThreadType value) {
        this.backingStore.set("threadType", value);
    }
}
