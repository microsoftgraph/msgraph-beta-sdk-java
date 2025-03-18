package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ForwardToChatResult extends ActionResultPart implements Parsable {
    /**
     * Instantiates a new {@link ForwardToChatResult} and sets the default values.
     */
    public ForwardToChatResult() {
        super();
        this.setOdataType("#microsoft.graph.forwardToChatResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ForwardToChatResult}
     */
    @jakarta.annotation.Nonnull
    public static ForwardToChatResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ForwardToChatResult();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("forwardedMessageId", (n) -> { this.setForwardedMessageId(n.getStringValue()); });
        deserializerMap.put("targetChatId", (n) -> { this.setTargetChatId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the forwardedMessageId property value. The chatMessage ID generated after a message is successfully forwarded to the target chat ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getForwardedMessageId() {
        return this.backingStore.get("forwardedMessageId");
    }
    /**
     * Gets the targetChatId property value. The target chat ID where the message was forwarded.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetChatId() {
        return this.backingStore.get("targetChatId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("forwardedMessageId", this.getForwardedMessageId());
        writer.writeStringValue("targetChatId", this.getTargetChatId());
    }
    /**
     * Sets the forwardedMessageId property value. The chatMessage ID generated after a message is successfully forwarded to the target chat ID.
     * @param value Value to set for the forwardedMessageId property.
     */
    public void setForwardedMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("forwardedMessageId", value);
    }
    /**
     * Sets the targetChatId property value. The target chat ID where the message was forwarded.
     * @param value Value to set for the targetChatId property.
     */
    public void setTargetChatId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetChatId", value);
    }
}
