package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ChatMessageMentionedIdentitySet extends IdentitySet implements Parsable {
    /** If present, represents a conversation (for example, team or channel) @mentioned in a message. */
    private TeamworkConversationIdentity _conversation;
    /** If present, represents a tag @mentioned in a team message. */
    private TeamworkTagIdentity _tag;
    /**
     * Instantiates a new ChatMessageMentionedIdentitySet and sets the default values.
     * @return a void
     */
    public ChatMessageMentionedIdentitySet() {
        super();
        this.setOdataType("#microsoft.graph.chatMessageMentionedIdentitySet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatMessageMentionedIdentitySet
     */
    @javax.annotation.Nonnull
    public static ChatMessageMentionedIdentitySet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatMessageMentionedIdentitySet();
    }
    /**
     * Gets the conversation property value. If present, represents a conversation (for example, team or channel) @mentioned in a message.
     * @return a teamworkConversationIdentity
     */
    @javax.annotation.Nullable
    public TeamworkConversationIdentity getConversation() {
        return this._conversation;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ChatMessageMentionedIdentitySet currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("conversation", (n) -> { currentObject.setConversation(n.getObjectValue(TeamworkConversationIdentity::createFromDiscriminatorValue)); });
            this.put("tag", (n) -> { currentObject.setTag(n.getObjectValue(TeamworkTagIdentity::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the tag property value. If present, represents a tag @mentioned in a team message.
     * @return a teamworkTagIdentity
     */
    @javax.annotation.Nullable
    public TeamworkTagIdentity getTag() {
        return this._tag;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("conversation", this.getConversation());
        writer.writeObjectValue("tag", this.getTag());
    }
    /**
     * Sets the conversation property value. If present, represents a conversation (for example, team or channel) @mentioned in a message.
     * @param value Value to set for the conversation property.
     * @return a void
     */
    public void setConversation(@javax.annotation.Nullable final TeamworkConversationIdentity value) {
        this._conversation = value;
    }
    /**
     * Sets the tag property value. If present, represents a tag @mentioned in a team message.
     * @param value Value to set for the tag property.
     * @return a void
     */
    public void setTag(@javax.annotation.Nullable final TeamworkTagIdentity value) {
        this._tag = value;
    }
}
