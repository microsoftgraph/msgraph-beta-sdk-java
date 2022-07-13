package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class ActivityStatistics extends Entity implements Parsable {
    /** The type of activity for which statistics are returned. The possible values are: call, chat, email, focus, and meeting. */
    private AnalyticsActivityType _activity;
    /** Total hours spent on the activity. The value is represented in ISO 8601 format for durations. */
    private Period _duration;
    /** Date when the activity ended, expressed in ISO 8601 format for calendar dates. For example, the property value could be '2019-07-03' that follows the YYYY-MM-DD format. */
    private LocalDate _endDate;
    /** Date when the activity started, expressed in ISO 8601 format for calendar dates. For example, the property value could be '2019-07-04' that follows the YYYY-MM-DD format. */
    private LocalDate _startDate;
    /** The time zone that the user sets in Microsoft Outlook is used for the computation. For example, the property value could be 'Pacific Standard Time.' */
    private String _timeZoneUsed;
    /**
     * Instantiates a new activityStatistics and sets the default values.
     * @return a void
     */
    public ActivityStatistics() {
        super();
        this.setType("#microsoft.graph.activityStatistics");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a activityStatistics
     */
    @javax.annotation.Nonnull
    public static ActivityStatistics createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
    @javax.annotation.Nullable
    public AnalyticsActivityType getActivity() {
        return this._activity;
    }
    /**
     * Gets the duration property value. Total hours spent on the activity. The value is represented in ISO 8601 format for durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getDuration() {
        return this._duration;
    }
    /**
     * Gets the endDate property value. Date when the activity ended, expressed in ISO 8601 format for calendar dates. For example, the property value could be '2019-07-03' that follows the YYYY-MM-DD format.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getEndDate() {
        return this._endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ActivityStatistics currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activity", (n) -> { currentObject.setActivity(n.getEnumValue(AnalyticsActivityType.class)); });
            this.put("duration", (n) -> { currentObject.setDuration(n.getPeriodValue()); });
            this.put("endDate", (n) -> { currentObject.setEndDate(n.getLocalDateValue()); });
            this.put("startDate", (n) -> { currentObject.setStartDate(n.getLocalDateValue()); });
            this.put("timeZoneUsed", (n) -> { currentObject.setTimeZoneUsed(n.getStringValue()); });
        }};
    }
    /**
     * Gets the startDate property value. Date when the activity started, expressed in ISO 8601 format for calendar dates. For example, the property value could be '2019-07-04' that follows the YYYY-MM-DD format.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getStartDate() {
        return this._startDate;
    }
    /**
     * Gets the timeZoneUsed property value. The time zone that the user sets in Microsoft Outlook is used for the computation. For example, the property value could be 'Pacific Standard Time.'
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimeZoneUsed() {
        return this._timeZoneUsed;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("activity", this.getActivity());
        writer.writePeriodValue("duration", this.getDuration());
        writer.writeLocalDateValue("endDate", this.getEndDate());
        writer.writeLocalDateValue("startDate", this.getStartDate());
        writer.writeStringValue("timeZoneUsed", this.getTimeZoneUsed());
    }
    /**
     * Sets the activity property value. The type of activity for which statistics are returned. The possible values are: call, chat, email, focus, and meeting.
     * @param value Value to set for the activity property.
     * @return a void
     */
    public void setActivity(@javax.annotation.Nullable final AnalyticsActivityType value) {
        this._activity = value;
    }
    /**
     * Sets the duration property value. Total hours spent on the activity. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the duration property.
     * @return a void
     */
    public void setDuration(@javax.annotation.Nullable final Period value) {
        this._duration = value;
    }
    /**
     * Sets the endDate property value. Date when the activity ended, expressed in ISO 8601 format for calendar dates. For example, the property value could be '2019-07-03' that follows the YYYY-MM-DD format.
     * @param value Value to set for the endDate property.
     * @return a void
     */
    public void setEndDate(@javax.annotation.Nullable final LocalDate value) {
        this._endDate = value;
    }
    /**
     * Sets the startDate property value. Date when the activity started, expressed in ISO 8601 format for calendar dates. For example, the property value could be '2019-07-04' that follows the YYYY-MM-DD format.
     * @param value Value to set for the startDate property.
     * @return a void
     */
    public void setStartDate(@javax.annotation.Nullable final LocalDate value) {
        this._startDate = value;
    }
    /**
     * Sets the timeZoneUsed property value. The time zone that the user sets in Microsoft Outlook is used for the computation. For example, the property value could be 'Pacific Standard Time.'
     * @param value Value to set for the timeZoneUsed property.
     * @return a void
     */
    public void setTimeZoneUsed(@javax.annotation.Nullable final String value) {
        this._timeZoneUsed = value;
    }
}
