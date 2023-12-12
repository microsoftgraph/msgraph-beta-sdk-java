package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageTrace extends Entity implements Parsable {
    /**
     * Instantiates a new MessageTrace and sets the default values.
     */
    public MessageTrace() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MessageTrace
     */
    @jakarta.annotation.Nonnull
    public static MessageTrace createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageTrace();
    }
    /**
     * Gets the destinationIPAddress property value. The destinationIPAddress property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestinationIPAddress() {
        return this.backingStore.get("destinationIPAddress");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("destinationIPAddress", (n) -> { this.setDestinationIPAddress(n.getStringValue()); });
        deserializerMap.put("messageId", (n) -> { this.setMessageId(n.getStringValue()); });
        deserializerMap.put("receivedDateTime", (n) -> { this.setReceivedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("recipients", (n) -> { this.setRecipients(n.getCollectionOfObjectValues(MessageRecipient::createFromDiscriminatorValue)); });
        deserializerMap.put("senderEmail", (n) -> { this.setSenderEmail(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getIntegerValue()); });
        deserializerMap.put("sourceIPAddress", (n) -> { this.setSourceIPAddress(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the messageId property value. The messageId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessageId() {
        return this.backingStore.get("messageId");
    }
    /**
     * Gets the receivedDateTime property value. The receivedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReceivedDateTime() {
        return this.backingStore.get("receivedDateTime");
    }
    /**
     * Gets the recipients property value. The recipients property
     * @return a java.util.List<MessageRecipient>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MessageRecipient> getRecipients() {
        return this.backingStore.get("recipients");
    }
    /**
     * Gets the senderEmail property value. The senderEmail property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSenderEmail() {
        return this.backingStore.get("senderEmail");
    }
    /**
     * Gets the size property value. The size property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSize() {
        return this.backingStore.get("size");
    }
    /**
     * Gets the sourceIPAddress property value. The sourceIPAddress property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceIPAddress() {
        return this.backingStore.get("sourceIPAddress");
    }
    /**
     * Gets the subject property value. The subject property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("destinationIPAddress", this.getDestinationIPAddress());
        writer.writeStringValue("messageId", this.getMessageId());
        writer.writeOffsetDateTimeValue("receivedDateTime", this.getReceivedDateTime());
        writer.writeCollectionOfObjectValues("recipients", this.getRecipients());
        writer.writeStringValue("senderEmail", this.getSenderEmail());
        writer.writeIntegerValue("size", this.getSize());
        writer.writeStringValue("sourceIPAddress", this.getSourceIPAddress());
        writer.writeStringValue("subject", this.getSubject());
    }
    /**
     * Sets the destinationIPAddress property value. The destinationIPAddress property
     * @param value Value to set for the destinationIPAddress property.
     */
    public void setDestinationIPAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("destinationIPAddress", value);
    }
    /**
     * Sets the messageId property value. The messageId property
     * @param value Value to set for the messageId property.
     */
    public void setMessageId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("messageId", value);
    }
    /**
     * Sets the receivedDateTime property value. The receivedDateTime property
     * @param value Value to set for the receivedDateTime property.
     */
    public void setReceivedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("receivedDateTime", value);
    }
    /**
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     */
    public void setRecipients(@jakarta.annotation.Nullable final java.util.List<MessageRecipient> value) {
        this.backingStore.set("recipients", value);
    }
    /**
     * Sets the senderEmail property value. The senderEmail property
     * @param value Value to set for the senderEmail property.
     */
    public void setSenderEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("senderEmail", value);
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("size", value);
    }
    /**
     * Sets the sourceIPAddress property value. The sourceIPAddress property
     * @param value Value to set for the sourceIPAddress property.
     */
    public void setSourceIPAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceIPAddress", value);
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
}
