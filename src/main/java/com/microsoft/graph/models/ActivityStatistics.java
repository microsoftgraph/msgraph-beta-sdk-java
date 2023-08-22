package com.microsoft.graph.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActivityStatistics extends Entity implements Parsable {
    /**
     * The type of activity for which statistics are returned. The possible values are: call, chat, email, focus, and meeting.
     */
    private AnalyticsActivityType activity;
    /**
     * Total hours spent on the activity. The value is represented in ISO 8601 format for durations.
     */
    private PeriodAndDuration duration;
    /**
     * Date when the activity ended, expressed in ISO 8601 format for calendar dates. For example, the property value could be '2019-07-03' that follows the YYYY-MM-DD format.
     */
    private LocalDate endDate;
    /**
     * Date when the activity started, expressed in ISO 8601 format for calendar dates. For example, the property value could be '2019-07-04' that follows the YYYY-MM-DD format.
     */
    private LocalDate startDate;
    /**
     * The time zone that the user sets in Microsoft Outlook is used for the computation. For example, the property value could be 'Pacific Standard Time.'
     */
    private String timeZoneUsed;
    /**
     * Instantiates a new activityStatistics and sets the default values.
     */
    public ActivityStatistics() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a activityStatistics
     */
    @jakarta.annotation.Nonnull
    public static ActivityStatistics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.callActivityStatistics": return new CallActivityStatistics();
                case "#microsoft.graph.chatActivityStatistics": return new ChatActivityStatistics();
                case "#microsoft.graph.emailActivityStatistics": return new EmailActivityStatistics();
                case "#microsoft.graph.focusActivityStatistics": return new FocusActivityStatistics();
                case "#microsoft.graph.meetingActivityStatistics": return new MeetingActivityStatistics();
            }
        }
        return new ActivityStatistics();
    }
    /**
     * Gets the activity property value. The type of activity for which statistics are returned. The possible values are: call, chat, email, focus, and meeting.
     * @return a analyticsActivityType
     */
    @jakarta.annotation.Nullable
    public AnalyticsActivityType getActivity() {
        return this.activity;
    }
    /**
     * Gets the duration property value. Total hours spent on the activity. The value is represented in ISO 8601 format for durations.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getDuration() {
        return this.duration;
    }
    /**
     * Gets the endDate property value. Date when the activity ended, expressed in ISO 8601 format for calendar dates. For example, the property value could be '2019-07-03' that follows the YYYY-MM-DD format.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getEndDate() {
        return this.endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getEnumValue(AnalyticsActivityType.class)); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getPeriodAndDurationValue()); });
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getLocalDateValue()); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getLocalDateValue()); });
        deserializerMap.put("timeZoneUsed", (n) -> { this.setTimeZoneUsed(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the startDate property value. Date when the activity started, expressed in ISO 8601 format for calendar dates. For example, the property value could be '2019-07-04' that follows the YYYY-MM-DD format.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getStartDate() {
        return this.startDate;
    }
    /**
     * Gets the timeZoneUsed property value. The time zone that the user sets in Microsoft Outlook is used for the computation. For example, the property value could be 'Pacific Standard Time.'
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTimeZoneUsed() {
        return this.timeZoneUsed;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("activity", this.getActivity());
        writer.writePeriodAndDurationValue("duration", this.getDuration());
        writer.writeLocalDateValue("endDate", this.getEndDate());
        writer.writeLocalDateValue("startDate", this.getStartDate());
        writer.writeStringValue("timeZoneUsed", this.getTimeZoneUsed());
    }
    /**
     * Sets the activity property value. The type of activity for which statistics are returned. The possible values are: call, chat, email, focus, and meeting.
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final AnalyticsActivityType value) {
        this.activity = value;
    }
    /**
     * Sets the duration property value. Total hours spent on the activity. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.duration = PeriodAndDuration.ofPeriodAndDuration(value);
    }
    /**
     * Sets the endDate property value. Date when the activity ended, expressed in ISO 8601 format for calendar dates. For example, the property value could be '2019-07-03' that follows the YYYY-MM-DD format.
     * @param value Value to set for the endDate property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.endDate = value;
    }
    /**
     * Sets the startDate property value. Date when the activity started, expressed in ISO 8601 format for calendar dates. For example, the property value could be '2019-07-04' that follows the YYYY-MM-DD format.
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.startDate = value;
    }
    /**
     * Sets the timeZoneUsed property value. The time zone that the user sets in Microsoft Outlook is used for the computation. For example, the property value could be 'Pacific Standard Time.'
     * @param value Value to set for the timeZoneUsed property.
     */
    public void setTimeZoneUsed(@jakarta.annotation.Nullable final String value) {
        this.timeZoneUsed = value;
    }
}
