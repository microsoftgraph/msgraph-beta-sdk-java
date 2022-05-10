package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeCardEvent implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether the entry was recorded at the approved location. */
    private Boolean _atApprovedLocation;
    /** The time the entry is recorded. */
    private OffsetDateTime _dateTime;
    /** Notes about the timeCardEvent. */
    private ItemBody _notes;
    /**
     * Instantiates a new timeCardEvent and sets the default values.
     * @return a void
     */
    public TimeCardEvent() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a timeCardEvent
     */
    @javax.annotation.Nonnull
    public static TimeCardEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeCardEvent();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the atApprovedLocation property value. Indicates whether the entry was recorded at the approved location.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAtApprovedLocation() {
        return this._atApprovedLocation;
    }
    /**
     * Gets the dateTime property value. The time the entry is recorded.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDateTime() {
        return this._dateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TimeCardEvent currentObject = this;
        return new HashMap<>(3) {{
            this.put("atApprovedLocation", (n) -> { currentObject.setAtApprovedLocation(n.getBooleanValue()); });
            this.put("dateTime", (n) -> { currentObject.setDateTime(n.getOffsetDateTimeValue()); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the notes property value. Notes about the timeCardEvent.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getNotes() {
        return this._notes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("atApprovedLocation", this.getAtApprovedLocation());
        writer.writeOffsetDateTimeValue("dateTime", this.getDateTime());
        writer.writeObjectValue("notes", this.getNotes());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the atApprovedLocation property value. Indicates whether the entry was recorded at the approved location.
     * @param value Value to set for the atApprovedLocation property.
     * @return a void
     */
    public void setAtApprovedLocation(@javax.annotation.Nullable final Boolean value) {
        this._atApprovedLocation = value;
    }
    /**
     * Sets the dateTime property value. The time the entry is recorded.
     * @param value Value to set for the dateTime property.
     * @return a void
     */
    public void setDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._dateTime = value;
    }
    /**
     * Sets the notes property value. Notes about the timeCardEvent.
     * @param value Value to set for the notes property.
     * @return a void
     */
    public void setNotes(@javax.annotation.Nullable final ItemBody value) {
        this._notes = value;
    }
}
