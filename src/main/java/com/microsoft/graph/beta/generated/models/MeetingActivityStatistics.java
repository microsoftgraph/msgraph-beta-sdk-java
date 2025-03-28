package com.microsoft.graph.beta.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MeetingActivityStatistics extends ActivityStatistics implements Parsable {
    /**
     * Instantiates a new {@link MeetingActivityStatistics} and sets the default values.
     */
    public MeetingActivityStatistics() {
        super();
        this.setOdataType("#microsoft.graph.meetingActivityStatistics");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MeetingActivityStatistics}
     */
    @jakarta.annotation.Nonnull
    public static MeetingActivityStatistics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingActivityStatistics();
    }
    /**
     * Gets the afterHours property value. Time spent on meetings outside of working hours, which is based on the user&apos;s Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getAfterHours() {
        return this.backingStore.get("afterHours");
    }
    /**
     * Gets the conflicting property value. Time spent in conflicting meetings (meetings that overlap with other meetings that the person accepted and where the persons status is set to Busy). The value is represented in ISO 8601 format for durations.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getConflicting() {
        return this.backingStore.get("conflicting");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("afterHours", (n) -> { this.setAfterHours(n.getPeriodAndDurationValue()); });
        deserializerMap.put("conflicting", (n) -> { this.setConflicting(n.getPeriodAndDurationValue()); });
        deserializerMap.put("long", (n) -> { this.setLong(n.getPeriodAndDurationValue()); });
        deserializerMap.put("multitasking", (n) -> { this.setMultitasking(n.getPeriodAndDurationValue()); });
        deserializerMap.put("organized", (n) -> { this.setOrganized(n.getPeriodAndDurationValue()); });
        deserializerMap.put("recurring", (n) -> { this.setRecurring(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Gets the long property value. Time spent in long meetings (more than an hour in duration). The value is represented in ISO 8601 format for durations.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getLong() {
        return this.backingStore.get("long");
    }
    /**
     * Gets the multitasking property value. Time spent in meetings where the person was multitasking (read/sent more than a minimum number of emails and/or sent more than a minimum number of messages in Teams or in Skype for Business). The value is represented in ISO 8601 format for durations.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getMultitasking() {
        return this.backingStore.get("multitasking");
    }
    /**
     * Gets the organized property value. Time spent in meetings organized by the user. The value is represented in ISO 8601 format for durations.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getOrganized() {
        return this.backingStore.get("organized");
    }
    /**
     * Gets the recurring property value. Time spent on recurring meetings. The value is represented in ISO 8601 format for durations.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getRecurring() {
        return this.backingStore.get("recurring");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writePeriodAndDurationValue("afterHours", this.getAfterHours());
        writer.writePeriodAndDurationValue("conflicting", this.getConflicting());
        writer.writePeriodAndDurationValue("long", this.getLong());
        writer.writePeriodAndDurationValue("multitasking", this.getMultitasking());
        writer.writePeriodAndDurationValue("organized", this.getOrganized());
        writer.writePeriodAndDurationValue("recurring", this.getRecurring());
    }
    /**
     * Sets the afterHours property value. Time spent on meetings outside of working hours, which is based on the user&apos;s Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the afterHours property.
     */
    public void setAfterHours(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("afterHours", value);
    }
    /**
     * Sets the conflicting property value. Time spent in conflicting meetings (meetings that overlap with other meetings that the person accepted and where the persons status is set to Busy). The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the conflicting property.
     */
    public void setConflicting(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("conflicting", value);
    }
    /**
     * Sets the long property value. Time spent in long meetings (more than an hour in duration). The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the long property.
     */
    public void setLong(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("long", value);
    }
    /**
     * Sets the multitasking property value. Time spent in meetings where the person was multitasking (read/sent more than a minimum number of emails and/or sent more than a minimum number of messages in Teams or in Skype for Business). The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the multitasking property.
     */
    public void setMultitasking(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("multitasking", value);
    }
    /**
     * Sets the organized property value. Time spent in meetings organized by the user. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the organized property.
     */
    public void setOrganized(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("organized", value);
    }
    /**
     * Sets the recurring property value. Time spent on recurring meetings. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the recurring property.
     */
    public void setRecurring(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("recurring", value);
    }
}
