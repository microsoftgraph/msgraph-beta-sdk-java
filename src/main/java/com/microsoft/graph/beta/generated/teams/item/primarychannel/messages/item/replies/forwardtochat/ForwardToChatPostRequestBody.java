package com.microsoft.graph.beta.teams.item.primarychannel.messages.item.replies.forwardtochat;

import com.microsoft.graph.beta.models.ChatMessage;
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
public class ForwardToChatPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ForwardToChatPostRequestBody} and sets the default values.
     */
    public ForwardToChatPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ForwardToChatPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ForwardToChatPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ForwardToChatPostRequestBody();
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
     * Gets the additionalMessage property value. The additionalMessage property
     * @return a {@link ChatMessage}
     */
    @jakarta.annotation.Nullable
    public ChatMessage getAdditionalMessage() {
        return this.backingStore.get("additionalMessage");
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("additionalMessage", (n) -> { this.setAdditionalMessage(n.getObjectValue(ChatMessage::createFromDiscriminatorValue)); });
        deserializerMap.put("messageIds", (n) -> { this.setMessageIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("targetChatIds", (n) -> { this.setTargetChatIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the messageIds property value. The messageIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMessageIds() {
        return this.backingStore.get("messageIds");
    }
    /**
     * Gets the targetChatIds property value. The targetChatIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTargetChatIds() {
        return this.backingStore.get("targetChatIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("additionalMessage", this.getAdditionalMessage());
        writer.writeCollectionOfPrimitiveValues("messageIds", this.getMessageIds());
        writer.writeCollectionOfPrimitiveValues("targetChatIds", this.getTargetChatIds());
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
     * Sets the additionalMessage property value. The additionalMessage property
     * @param value Value to set for the additionalMessage property.
     */
    public void setAdditionalMessage(@jakarta.annotation.Nullable final ChatMessage value) {
        this.backingStore.set("additionalMessage", value);
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
     * Sets the messageIds property value. The messageIds property
     * @param value Value to set for the messageIds property.
     */
    public void setMessageIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("messageIds", value);
    }
    /**
     * Sets the targetChatIds property value. The targetChatIds property
     * @param value Value to set for the targetChatIds property.
     */
    public void setTargetChatIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("targetChatIds", value);
    }
}
