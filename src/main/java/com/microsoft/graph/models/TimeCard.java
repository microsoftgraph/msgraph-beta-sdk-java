package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeCard extends ChangeTrackedEntity implements Parsable {
    /** The list of breaks associated with the timeCard. */
    private java.util.List<TimeCardBreak> breaks;
    /** The clock-in event of the timeCard. */
    private TimeCardEvent clockInEvent;
    /** The clock-out event of the timeCard. */
    private TimeCardEvent clockOutEvent;
    /** Indicate if this timeCard entry is confirmed. Possible values are none, user, manager, unknownFutureValue. */
    private ConfirmedBy confirmedBy;
    /** Notes about the timeCard. */
    private ItemBody notes;
    /** The original timeCardEntry of the timeCard, before user edits. */
    private TimeCardEntry originalEntry;
    /** The current state of the timeCard during its life cycle.Possible values are: clockedIn, onBreak, clockedOut, unknownFutureValue. */
    private TimeCardState state;
    /** User ID to which  the timeCard belongs. */
    private String userId;
    /**
     * Instantiates a new TimeCard and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TimeCard() {
        super();
        this.setOdataType("#microsoft.graph.timeCard");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TimeCard
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
        return this.breaks;
    }
    /**
     * Gets the clockInEvent property value. The clock-in event of the timeCard.
     * @return a timeCardEvent
     */
    @javax.annotation.Nullable
    public TimeCardEvent getClockInEvent() {
        return this.clockInEvent;
    }
    /**
     * Gets the clockOutEvent property value. The clock-out event of the timeCard.
     * @return a timeCardEvent
     */
    @javax.annotation.Nullable
    public TimeCardEvent getClockOutEvent() {
        return this.clockOutEvent;
    }
    /**
     * Gets the confirmedBy property value. Indicate if this timeCard entry is confirmed. Possible values are none, user, manager, unknownFutureValue.
     * @return a confirmedBy
     */
    @javax.annotation.Nullable
    public ConfirmedBy getConfirmedBy() {
        return this.confirmedBy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("breaks", (n) -> { this.setBreaks(n.getCollectionOfObjectValues(TimeCardBreak::createFromDiscriminatorValue)); });
        deserializerMap.put("clockInEvent", (n) -> { this.setClockInEvent(n.getObjectValue(TimeCardEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("clockOutEvent", (n) -> { this.setClockOutEvent(n.getObjectValue(TimeCardEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("confirmedBy", (n) -> { this.setConfirmedBy(n.getEnumValue(ConfirmedBy.class)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("originalEntry", (n) -> { this.setOriginalEntry(n.getObjectValue(TimeCardEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(TimeCardState.class)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notes property value. Notes about the timeCard.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getNotes() {
        return this.notes;
    }
    /**
     * Gets the originalEntry property value. The original timeCardEntry of the timeCard, before user edits.
     * @return a timeCardEntry
     */
    @javax.annotation.Nullable
    public TimeCardEntry getOriginalEntry() {
        return this.originalEntry;
    }
    /**
     * Gets the state property value. The current state of the timeCard during its life cycle.Possible values are: clockedIn, onBreak, clockedOut, unknownFutureValue.
     * @return a timeCardState
     */
    @javax.annotation.Nullable
    public TimeCardState getState() {
        return this.state;
    }
    /**
     * Gets the userId property value. User ID to which  the timeCard belongs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
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
    @javax.annotation.Nonnull
    public void setBreaks(@javax.annotation.Nullable final java.util.List<TimeCardBreak> value) {
        this.breaks = value;
    }
    /**
     * Sets the clockInEvent property value. The clock-in event of the timeCard.
     * @param value Value to set for the clockInEvent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClockInEvent(@javax.annotation.Nullable final TimeCardEvent value) {
        this.clockInEvent = value;
    }
    /**
     * Sets the clockOutEvent property value. The clock-out event of the timeCard.
     * @param value Value to set for the clockOutEvent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClockOutEvent(@javax.annotation.Nullable final TimeCardEvent value) {
        this.clockOutEvent = value;
    }
    /**
     * Sets the confirmedBy property value. Indicate if this timeCard entry is confirmed. Possible values are none, user, manager, unknownFutureValue.
     * @param value Value to set for the confirmedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfirmedBy(@javax.annotation.Nullable final ConfirmedBy value) {
        this.confirmedBy = value;
    }
    /**
     * Sets the notes property value. Notes about the timeCard.
     * @param value Value to set for the notes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotes(@javax.annotation.Nullable final ItemBody value) {
        this.notes = value;
    }
    /**
     * Sets the originalEntry property value. The original timeCardEntry of the timeCard, before user edits.
     * @param value Value to set for the originalEntry property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginalEntry(@javax.annotation.Nullable final TimeCardEntry value) {
        this.originalEntry = value;
    }
    /**
     * Sets the state property value. The current state of the timeCard during its life cycle.Possible values are: clockedIn, onBreak, clockedOut, unknownFutureValue.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final TimeCardState value) {
        this.state = value;
    }
    /**
     * Sets the userId property value. User ID to which  the timeCard belongs.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
}
