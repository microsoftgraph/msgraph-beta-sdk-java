package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MessageRecipient extends Entity implements Parsable {
    /** The deliveryStatus property */
    private MessageStatus _deliveryStatus;
    /** The events property */
    private java.util.List<MessageEvent> _events;
    /** The recipientEmail property */
    private String _recipientEmail;
    /**
     * Instantiates a new MessageRecipient and sets the default values.
     * @return a void
     */
    public MessageRecipient() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MessageRecipient
     */
    @javax.annotation.Nonnull
    public static MessageRecipient createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageRecipient();
    }
    /**
     * Gets the deliveryStatus property value. The deliveryStatus property
     * @return a messageStatus
     */
    @javax.annotation.Nullable
    public MessageStatus getDeliveryStatus() {
        return this._deliveryStatus;
    }
    /**
     * Gets the events property value. The events property
     * @return a messageEvent
     */
    @javax.annotation.Nullable
    public java.util.List<MessageEvent> getEvents() {
        return this._events;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MessageRecipient currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deliveryStatus", (n) -> { currentObject.setDeliveryStatus(n.getEnumValue(MessageStatus.class)); });
            this.put("events", (n) -> { currentObject.setEvents(n.getCollectionOfObjectValues(MessageEvent::createFromDiscriminatorValue)); });
            this.put("recipientEmail", (n) -> { currentObject.setRecipientEmail(n.getStringValue()); });
        }};
    }
    /**
     * Gets the recipientEmail property value. The recipientEmail property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientEmail() {
        return this._recipientEmail;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("deliveryStatus", this.getDeliveryStatus());
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeStringValue("recipientEmail", this.getRecipientEmail());
    }
    /**
     * Sets the deliveryStatus property value. The deliveryStatus property
     * @param value Value to set for the deliveryStatus property.
     * @return a void
     */
    public void setDeliveryStatus(@javax.annotation.Nullable final MessageStatus value) {
        this._deliveryStatus = value;
    }
    /**
     * Sets the events property value. The events property
     * @param value Value to set for the events property.
     * @return a void
     */
    public void setEvents(@javax.annotation.Nullable final java.util.List<MessageEvent> value) {
        this._events = value;
    }
    /**
     * Sets the recipientEmail property value. The recipientEmail property
     * @param value Value to set for the recipientEmail property.
     * @return a void
     */
    public void setRecipientEmail(@javax.annotation.Nullable final String value) {
        this._recipientEmail = value;
    }
}
