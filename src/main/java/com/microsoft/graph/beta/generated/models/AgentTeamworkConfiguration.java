package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentTeamworkConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AgentTeamworkConfiguration} and sets the default values.
     */
    public AgentTeamworkConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentTeamworkConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AgentTeamworkConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentTeamworkConfiguration();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the channelConfiguration property value. The message notification settings that the agent uses in channels.
     * @return a {@link AgentConversationConfiguration}
     */
    @jakarta.annotation.Nullable
    public AgentConversationConfiguration getChannelConfiguration() {
        return this.backingStore.get("channelConfiguration");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("channelConfiguration", (n) -> { this.setChannelConfiguration(n.getObjectValue(AgentConversationConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("groupChatConfiguration", (n) -> { this.setGroupChatConfiguration(n.getObjectValue(AgentConversationConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("meetingChatConfiguration", (n) -> { this.setMeetingChatConfiguration(n.getObjectValue(AgentConversationConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("oneOnOneChatConfiguration", (n) -> { this.setOneOnOneChatConfiguration(n.getObjectValue(AgentConversationConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupChatConfiguration property value. The message notification settings that the agent uses in group chats.
     * @return a {@link AgentConversationConfiguration}
     */
    @jakarta.annotation.Nullable
    public AgentConversationConfiguration getGroupChatConfiguration() {
        return this.backingStore.get("groupChatConfiguration");
    }
    /**
     * Gets the meetingChatConfiguration property value. The message notification settings that the agent uses in meeting chats.
     * @return a {@link AgentConversationConfiguration}
     */
    @jakarta.annotation.Nullable
    public AgentConversationConfiguration getMeetingChatConfiguration() {
        return this.backingStore.get("meetingChatConfiguration");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the oneOnOneChatConfiguration property value. The message notification settings that the agent uses in one-on-one chats.
     * @return a {@link AgentConversationConfiguration}
     */
    @jakarta.annotation.Nullable
    public AgentConversationConfiguration getOneOnOneChatConfiguration() {
        return this.backingStore.get("oneOnOneChatConfiguration");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("channelConfiguration", this.getChannelConfiguration());
        writer.writeObjectValue("groupChatConfiguration", this.getGroupChatConfiguration());
        writer.writeObjectValue("meetingChatConfiguration", this.getMeetingChatConfiguration());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("oneOnOneChatConfiguration", this.getOneOnOneChatConfiguration());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the channelConfiguration property value. The message notification settings that the agent uses in channels.
     * @param value Value to set for the channelConfiguration property.
     */
    public void setChannelConfiguration(@jakarta.annotation.Nullable final AgentConversationConfiguration value) {
        this.backingStore.set("channelConfiguration", value);
    }
    /**
     * Sets the groupChatConfiguration property value. The message notification settings that the agent uses in group chats.
     * @param value Value to set for the groupChatConfiguration property.
     */
    public void setGroupChatConfiguration(@jakarta.annotation.Nullable final AgentConversationConfiguration value) {
        this.backingStore.set("groupChatConfiguration", value);
    }
    /**
     * Sets the meetingChatConfiguration property value. The message notification settings that the agent uses in meeting chats.
     * @param value Value to set for the meetingChatConfiguration property.
     */
    public void setMeetingChatConfiguration(@jakarta.annotation.Nullable final AgentConversationConfiguration value) {
        this.backingStore.set("meetingChatConfiguration", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the oneOnOneChatConfiguration property value. The message notification settings that the agent uses in one-on-one chats.
     * @param value Value to set for the oneOnOneChatConfiguration property.
     */
    public void setOneOnOneChatConfiguration(@jakarta.annotation.Nullable final AgentConversationConfiguration value) {
        this.backingStore.set("oneOnOneChatConfiguration", value);
    }
}
