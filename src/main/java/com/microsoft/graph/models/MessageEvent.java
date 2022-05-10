package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MessageEvent extends Entity implements Parsable {
    /** The dateTime property */
    private OffsetDateTime _dateTime;
    /** The description property */
    private String _description;
    /** The eventType property */
    private MessageEventType _eventType;
    /**
     * Instantiates a new messageEvent and sets the default values.
     * @return a void
     */
    public MessageEvent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a messageEvent
     */
    @javax.annotation.Nonnull
    public static MessageEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageEvent();
    }
    /**
     * Gets the dateTime property value. The dateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDateTime() {
        return this._dateTime;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the eventType property value. The eventType property
     * @return a messageEventType
     */
    @javax.annotation.Nullable
    public MessageEventType getEventType() {
        return this._eventType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MessageEvent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("dateTime", (n) -> { currentObject.setDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("eventType", (n) -> { currentObject.setEventType(n.getEnumValue(MessageEventType.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("dateTime", this.getDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("eventType", this.getEventType());
    }
    /**
     * Sets the dateTime property value. The dateTime property
     * @param value Value to set for the dateTime property.
     * @return a void
     */
    public void setDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._dateTime = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the eventType property value. The eventType property
     * @param value Value to set for the eventType property.
     * @return a void
     */
    public void setEventType(@javax.annotation.Nullable final MessageEventType value) {
        this._eventType = value;
    }
}
