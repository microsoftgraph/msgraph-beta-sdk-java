package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Conversation is a first class object in the system, and consists of persistent metadata plus a stream of messages,typically alternating request/response, implicitly forming a turn.Represents a conversation with Copilot Chat.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotConversation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CopilotConversation} and sets the default values.
     */
    public CopilotConversation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotConversation}
     */
    @jakarta.annotation.Nonnull
    public static CopilotConversation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotConversation();
    }
    /**
     * Gets the createdDateTime property value. The date and time when the conversation was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the displayName property value. The display name of the conversation.
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
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("messages", (n) -> { this.setMessages(n.getCollectionOfObjectValues(CopilotConversationMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(CopilotConversationState::forValue)); });
        deserializerMap.put("turnCount", (n) -> { this.setTurnCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the messages property value. The ordered list of messages in the conversation.
     * @return a {@link java.util.List<CopilotConversationMessage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CopilotConversationMessage> getMessages() {
        return this.backingStore.get("messages");
    }
    /**
     * Gets the state property value. The state of a Copilot conversation.
     * @return a {@link CopilotConversationState}
     */
    @jakarta.annotation.Nullable
    public CopilotConversationState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Gets the turnCount property value. The number of turns in the conversation.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTurnCount() {
        return this.backingStore.get("turnCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("messages", this.getMessages());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the createdDateTime property value. The date and time when the conversation was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the displayName property value. The display name of the conversation.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the messages property value. The ordered list of messages in the conversation.
     * @param value Value to set for the messages property.
     */
    public void setMessages(@jakarta.annotation.Nullable final java.util.List<CopilotConversationMessage> value) {
        this.backingStore.set("messages", value);
    }
    /**
     * Sets the state property value. The state of a Copilot conversation.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final CopilotConversationState value) {
        this.backingStore.set("state", value);
    }
    /**
     * Sets the turnCount property value. The number of turns in the conversation.
     * @param value Value to set for the turnCount property.
     */
    public void setTurnCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("turnCount", value);
    }
}
