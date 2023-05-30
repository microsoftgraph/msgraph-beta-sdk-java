package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingActivityStatistics extends ActivityStatistics implements Parsable {
    /** Time spent on meetings outside of working hours, which is based on the user's Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations. */
    private Period afterHours;
    /** Time spent in conflicting meetings (meetings that overlap with other meetings that the person accepted and where the persons status is set to Busy). The value is represented in ISO 8601 format for durations. */
    private Period conflicting;
    /** Time spent in long meetings (more than an hour in duration). The value is represented in ISO 8601 format for durations. */
    private Period longEscaped;
    /** Time spent in meetings where the person was multitasking (read/sent more than a minimum number of emails and/or sent more than a minimum number of messages in Teams or in Skype for Business). The value is represented in ISO 8601 format for durations. */
    private Period multitasking;
    /** Time spent in meetings organized by the user. The value is represented in ISO 8601 format for durations. */
    private Period organized;
    /** Time spent on recurring meetings. The value is represented in ISO 8601 format for durations. */
    private Period recurring;
    /**
     * Instantiates a new MeetingActivityStatistics and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MeetingActivityStatistics() {
        super();
        this.setOdataType("#microsoft.graph.meetingActivityStatistics");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MeetingActivityStatistics
     */
    @javax.annotation.Nonnull
    public static MeetingActivityStatistics createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingActivityStatistics();
    }
    /**
     * Gets the afterHours property value. Time spent on meetings outside of working hours, which is based on the user's Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getAfterHours() {
        return this.afterHours;
    }
    /**
     * Gets the conflicting property value. Time spent in conflicting meetings (meetings that overlap with other meetings that the person accepted and where the persons status is set to Busy). The value is represented in ISO 8601 format for durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getConflicting() {
        return this.conflicting;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("afterHours", (n) -> { this.setAfterHours(n.getPeriodValue()); });
        deserializerMap.put("conflicting", (n) -> { this.setConflicting(n.getPeriodValue()); });
        deserializerMap.put("long", (n) -> { this.setLong(n.getPeriodValue()); });
        deserializerMap.put("multitasking", (n) -> { this.setMultitasking(n.getPeriodValue()); });
        deserializerMap.put("organized", (n) -> { this.setOrganized(n.getPeriodValue()); });
        deserializerMap.put("recurring", (n) -> { this.setRecurring(n.getPeriodValue()); });
        return deserializerMap;
    }
    /**
     * Gets the long property value. Time spent in long meetings (more than an hour in duration). The value is represented in ISO 8601 format for durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getLong() {
        return this.longEscaped;
    }
    /**
     * Gets the multitasking property value. Time spent in meetings where the person was multitasking (read/sent more than a minimum number of emails and/or sent more than a minimum number of messages in Teams or in Skype for Business). The value is represented in ISO 8601 format for durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getMultitasking() {
        return this.multitasking;
    }
    /**
     * Gets the organized property value. Time spent in meetings organized by the user. The value is represented in ISO 8601 format for durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getOrganized() {
        return this.organized;
    }
    /**
     * Gets the recurring property value. Time spent on recurring meetings. The value is represented in ISO 8601 format for durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getRecurring() {
        return this.recurring;
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
        writer.writePeriodValue("afterHours", this.getAfterHours());
        writer.writePeriodValue("conflicting", this.getConflicting());
        writer.writePeriodValue("long", this.getLong());
        writer.writePeriodValue("multitasking", this.getMultitasking());
        writer.writePeriodValue("organized", this.getOrganized());
        writer.writePeriodValue("recurring", this.getRecurring());
    }
    /**
     * Sets the afterHours property value. Time spent on meetings outside of working hours, which is based on the user's Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the afterHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAfterHours(@javax.annotation.Nullable final Period value) {
        this.afterHours = value;
    }
    /**
     * Sets the conflicting property value. Time spent in conflicting meetings (meetings that overlap with other meetings that the person accepted and where the persons status is set to Busy). The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the conflicting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConflicting(@javax.annotation.Nullable final Period value) {
        this.conflicting = value;
    }
    /**
     * Sets the long property value. Time spent in long meetings (more than an hour in duration). The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the long property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLong(@javax.annotation.Nullable final Period value) {
        this.longEscaped = value;
    }
    /**
     * Sets the multitasking property value. Time spent in meetings where the person was multitasking (read/sent more than a minimum number of emails and/or sent more than a minimum number of messages in Teams or in Skype for Business). The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the multitasking property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultitasking(@javax.annotation.Nullable final Period value) {
        this.multitasking = value;
    }
    /**
     * Sets the organized property value. Time spent in meetings organized by the user. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the organized property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganized(@javax.annotation.Nullable final Period value) {
        this.organized = value;
    }
    /**
     * Sets the recurring property value. Time spent on recurring meetings. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the recurring property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecurring(@javax.annotation.Nullable final Period value) {
        this.recurring = value;
    }
}
