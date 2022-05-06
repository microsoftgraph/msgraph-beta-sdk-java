package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeCard extends ChangeTrackedEntity implements Parsable {
    /** The list of breaks associated with the timeCard.  */
    private java.util.List<TimeCardBreak> _breaks;
    /** The clock-in event of the timeCard.  */
    private TimeCardEvent _clockInEvent;
    /** The clock-out event of the timeCard.  */
    private TimeCardEvent _clockOutEvent;
    /** Indicate if this timeCard entry is confirmed. Possible values are none, user, manager, unknownFutureValue.  */
    private ConfirmedBy _confirmedBy;
    /** Notes about the timeCard.  */
    private ItemBody _notes;
    /** The original timeCardEntry of the timeCard, before user edits.  */
    private TimeCardEntry _originalEntry;
    /** The current state of the timeCard during its life cycle.Possible values are: clockedIn, onBreak, clockedOut, unknownFutureValue.  */
    private TimeCardState _state;
    /** User ID to which  the timeCard belongs.  */
    private String _userId;
    /**
     * Instantiates a new timeCard and sets the default values.
     * @return a void
     */
    public TimeCard() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a timeCard
     */
    @javax.annotation.Nonnull
    public static TimeCard createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeCard();
    }
    /**
     * Gets the breaks property value. The list of breaks associated with the timeCard.
     * @return a timeCardBreak
     */
    @javax.annotation.Nullable
    public java.util.List<TimeCardBreak> getBreaks() {
        return this._breaks;
    }
    /**
     * Gets the clockInEvent property value. The clock-in event of the timeCard.
     * @return a timeCardEvent
     */
    @javax.annotation.Nullable
    public TimeCardEvent getClockInEvent() {
        return this._clockInEvent;
    }
    /**
     * Gets the clockOutEvent property value. The clock-out event of the timeCard.
     * @return a timeCardEvent
     */
    @javax.annotation.Nullable
    public TimeCardEvent getClockOutEvent() {
        return this._clockOutEvent;
    }
    /**
     * Gets the confirmedBy property value. Indicate if this timeCard entry is confirmed. Possible values are none, user, manager, unknownFutureValue.
     * @return a confirmedBy
     */
    @javax.annotation.Nullable
    public ConfirmedBy getConfirmedBy() {
        return this._confirmedBy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TimeCard currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("breaks", (n) -> { currentObject.setBreaks(n.getCollectionOfObjectValues(TimeCardBreak::createFromDiscriminatorValue)); });
            this.put("clockInEvent", (n) -> { currentObject.setClockInEvent(n.getObjectValue(TimeCardEvent::createFromDiscriminatorValue)); });
            this.put("clockOutEvent", (n) -> { currentObject.setClockOutEvent(n.getObjectValue(TimeCardEvent::createFromDiscriminatorValue)); });
            this.put("confirmedBy", (n) -> { currentObject.setConfirmedBy(n.getEnumValue(ConfirmedBy.class)); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
            this.put("originalEntry", (n) -> { currentObject.setOriginalEntry(n.getObjectValue(TimeCardEntry::createFromDiscriminatorValue)); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(TimeCardState.class)); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the notes property value. Notes about the timeCard.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getNotes() {
        return this._notes;
    }
    /**
     * Gets the originalEntry property value. The original timeCardEntry of the timeCard, before user edits.
     * @return a timeCardEntry
     */
    @javax.annotation.Nullable
    public TimeCardEntry getOriginalEntry() {
        return this._originalEntry;
    }
    /**
     * Gets the state property value. The current state of the timeCard during its life cycle.Possible values are: clockedIn, onBreak, clockedOut, unknownFutureValue.
     * @return a timeCardState
     */
    @javax.annotation.Nullable
    public TimeCardState getState() {
        return this._state;
    }
    /**
     * Gets the userId property value. User ID to which  the timeCard belongs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("breaks", this.getBreaks());
        writer.writeObjectValue("clockInEvent", this.getClockInEvent());
        writer.writeObjectValue("clockOutEvent", this.getClockOutEvent());
        writer.writeEnumValue("confirmedBy", this.getConfirmedBy());
        writer.writeObjectValue("notes", this.getNotes());
        writer.writeObjectValue("originalEntry", this.getOriginalEntry());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the breaks property value. The list of breaks associated with the timeCard.
     * @param value Value to set for the breaks property.
     * @return a void
     */
    public void setBreaks(@javax.annotation.Nullable final java.util.List<TimeCardBreak> value) {
        this._breaks = value;
    }
    /**
     * Sets the clockInEvent property value. The clock-in event of the timeCard.
     * @param value Value to set for the clockInEvent property.
     * @return a void
     */
    public void setClockInEvent(@javax.annotation.Nullable final TimeCardEvent value) {
        this._clockInEvent = value;
    }
    /**
     * Sets the clockOutEvent property value. The clock-out event of the timeCard.
     * @param value Value to set for the clockOutEvent property.
     * @return a void
     */
    public void setClockOutEvent(@javax.annotation.Nullable final TimeCardEvent value) {
        this._clockOutEvent = value;
    }
    /**
     * Sets the confirmedBy property value. Indicate if this timeCard entry is confirmed. Possible values are none, user, manager, unknownFutureValue.
     * @param value Value to set for the confirmedBy property.
     * @return a void
     */
    public void setConfirmedBy(@javax.annotation.Nullable final ConfirmedBy value) {
        this._confirmedBy = value;
    }
    /**
     * Sets the notes property value. Notes about the timeCard.
     * @param value Value to set for the notes property.
     * @return a void
     */
    public void setNotes(@javax.annotation.Nullable final ItemBody value) {
        this._notes = value;
    }
    /**
     * Sets the originalEntry property value. The original timeCardEntry of the timeCard, before user edits.
     * @param value Value to set for the originalEntry property.
     * @return a void
     */
    public void setOriginalEntry(@javax.annotation.Nullable final TimeCardEntry value) {
        this._originalEntry = value;
    }
    /**
     * Sets the state property value. The current state of the timeCard during its life cycle.Possible values are: clockedIn, onBreak, clockedOut, unknownFutureValue.
     * @param value Value to set for the state property.
     * @return a void
     */
    public void setState(@javax.annotation.Nullable final TimeCardState value) {
        this._state = value;
    }
    /**
     * Sets the userId property value. User ID to which  the timeCard belongs.
     * @param value Value to set for the userId property.
     * @return a void
     */
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
}
