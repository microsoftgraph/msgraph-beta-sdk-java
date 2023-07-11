package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MessageTrace extends Entity implements Parsable {
    /**
     * The destinationIPAddress property
     */
    private String destinationIPAddress;
    /**
     * The messageId property
     */
    private String messageId;
    /**
     * The receivedDateTime property
     */
    private OffsetDateTime receivedDateTime;
    /**
     * The recipients property
     */
    private java.util.List<MessageRecipient> recipients;
    /**
     * The senderEmail property
     */
    private String senderEmail;
    /**
     * The size property
     */
    private Integer size;
    /**
     * The sourceIPAddress property
     */
    private String sourceIPAddress;
    /**
     * The subject property
     */
    private String subject;
    /**
     * Instantiates a new messageTrace and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MessageTrace() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a messageTrace
     */
    @javax.annotation.Nonnull
    public static MessageTrace createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageTrace();
    }
    /**
     * Gets the destinationIPAddress property value. The destinationIPAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationIPAddress() {
        return this.destinationIPAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMessageId() {
        return this.messageId;
    }
    /**
     * Gets the receivedDateTime property value. The receivedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReceivedDateTime() {
        return this.receivedDateTime;
    }
    /**
     * Gets the recipients property value. The recipients property
     * @return a messageRecipient
     */
    @javax.annotation.Nullable
    public java.util.List<MessageRecipient> getRecipients() {
        return this.recipients;
    }
    /**
     * Gets the senderEmail property value. The senderEmail property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSenderEmail() {
        return this.senderEmail;
    }
    /**
     * Gets the size property value. The size property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSize() {
        return this.size;
    }
    /**
     * Gets the sourceIPAddress property value. The sourceIPAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceIPAddress() {
        return this.sourceIPAddress;
    }
    /**
     * Gets the subject property value. The subject property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationIPAddress(@javax.annotation.Nullable final String value) {
        this.destinationIPAddress = value;
    }
    /**
     * Sets the messageId property value. The messageId property
     * @param value Value to set for the messageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMessageId(@javax.annotation.Nullable final String value) {
        this.messageId = value;
    }
    /**
     * Sets the receivedDateTime property value. The receivedDateTime property
     * @param value Value to set for the receivedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReceivedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.receivedDateTime = value;
    }
    /**
     * Sets the recipients property value. The recipients property
     * @param value Value to set for the recipients property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipients(@javax.annotation.Nullable final java.util.List<MessageRecipient> value) {
        this.recipients = value;
    }
    /**
     * Sets the senderEmail property value. The senderEmail property
     * @param value Value to set for the senderEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSenderEmail(@javax.annotation.Nullable final String value) {
        this.senderEmail = value;
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSize(@javax.annotation.Nullable final Integer value) {
        this.size = value;
    }
    /**
     * Sets the sourceIPAddress property value. The sourceIPAddress property
     * @param value Value to set for the sourceIPAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceIPAddress(@javax.annotation.Nullable final String value) {
        this.sourceIPAddress = value;
    }
    /**
     * Sets the subject property value. The subject property
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this.subject = value;
    }
}
