package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MessageRecipient extends Entity implements Parsable {
    /**
     * The deliveryStatus property
     */
    private MessageStatus deliveryStatus;
    /**
     * The events property
     */
    private java.util.List<MessageEvent> events;
    /**
     * The recipientEmail property
     */
    private String recipientEmail;
    /**
     * Instantiates a new messageRecipient and sets the default values.
     */
    public MessageRecipient() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a messageRecipient
     */
    @jakarta.annotation.Nonnull
    public static MessageRecipient createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageRecipient();
    }
    /**
     * Gets the deliveryStatus property value. The deliveryStatus property
     * @return a messageStatus
     */
    @jakarta.annotation.Nullable
    public MessageStatus getDeliveryStatus() {
        return this.deliveryStatus;
    }
    /**
     * Gets the events property value. The events property
     * @return a messageEvent
     */
    @jakarta.annotation.Nullable
    public java.util.List<MessageEvent> getEvents() {
        return this.events;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deliveryStatus", (n) -> { this.setDeliveryStatus(n.getEnumValue(MessageStatus.class)); });
        deserializerMap.put("events", (n) -> { this.setEvents(n.getCollectionOfObjectValues(MessageEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("recipientEmail", (n) -> { this.setRecipientEmail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the recipientEmail property value. The recipientEmail property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRecipientEmail() {
        return this.recipientEmail;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("deliveryStatus", this.getDeliveryStatus());
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeStringValue("recipientEmail", this.getRecipientEmail());
    }
    /**
     * Sets the deliveryStatus property value. The deliveryStatus property
     * @param value Value to set for the deliveryStatus property.
     */
    public void setDeliveryStatus(@jakarta.annotation.Nullable final MessageStatus value) {
        this.deliveryStatus = value;
    }
    /**
     * Sets the events property value. The events property
     * @param value Value to set for the events property.
     */
    public void setEvents(@jakarta.annotation.Nullable final java.util.List<MessageEvent> value) {
        this.events = value;
    }
    /**
     * Sets the recipientEmail property value. The recipientEmail property
     * @param value Value to set for the recipientEmail property.
     */
    public void setRecipientEmail(@jakarta.annotation.Nullable final String value) {
        this.recipientEmail = value;
    }
}
