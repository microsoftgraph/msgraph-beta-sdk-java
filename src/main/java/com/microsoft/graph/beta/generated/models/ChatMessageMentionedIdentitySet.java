package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatMessageMentionedIdentitySet extends IdentitySet implements Parsable {
    /**
     * Instantiates a new {@link ChatMessageMentionedIdentitySet} and sets the default values.
     */
    public ChatMessageMentionedIdentitySet() {
        super();
        this.setOdataType("#microsoft.graph.chatMessageMentionedIdentitySet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ChatMessageMentionedIdentitySet}
     */
    @jakarta.annotation.Nonnull
    public static ChatMessageMentionedIdentitySet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatMessageMentionedIdentitySet();
    }
    /**
     * Gets the conversation property value. If present, represents a conversation (for example, team, channel, or chat) @mentioned in a message.
     * @return a {@link TeamworkConversationIdentity}
     */
    @jakarta.annotation.Nullable
    public TeamworkConversationIdentity getConversation() {
        return this.backingStore.get("conversation");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conversation", (n) -> { this.setConversation(n.getObjectValue(TeamworkConversationIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("tag", (n) -> { this.setTag(n.getObjectValue(TeamworkTagIdentity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the tag property value. If present, represents a tag @mentioned in a team message.
     * @return a {@link TeamworkTagIdentity}
     */
    @jakarta.annotation.Nullable
    public TeamworkTagIdentity getTag() {
        return this.backingStore.get("tag");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("conversation", this.getConversation());
        writer.writeObjectValue("tag", this.getTag());
    }
    /**
     * Sets the conversation property value. If present, represents a conversation (for example, team, channel, or chat) @mentioned in a message.
     * @param value Value to set for the conversation property.
     */
    public void setConversation(@jakarta.annotation.Nullable final TeamworkConversationIdentity value) {
        this.backingStore.set("conversation", value);
    }
    /**
     * Sets the tag property value. If present, represents a tag @mentioned in a team message.
     * @param value Value to set for the tag property.
     */
    public void setTag(@jakarta.annotation.Nullable final TeamworkTagIdentity value) {
        this.backingStore.set("tag", value);
    }
}
