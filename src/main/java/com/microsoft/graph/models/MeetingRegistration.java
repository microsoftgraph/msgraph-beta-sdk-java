package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingRegistration extends MeetingRegistrationBase implements Parsable {
    /** Custom registration questions. */
    private java.util.List<MeetingRegistrationQuestion> _customQuestions;
    /** The description of the meeting. */
    private String _description;
    /** The meeting end time in UTC. */
    private OffsetDateTime _endDateTime;
    /** The number of times the registration page has been visited. Read-only. */
    private Integer _registrationPageViewCount;
    /** The URL of the registration page. Read-only. */
    private String _registrationPageWebUrl;
    /** The meeting speaker's information. */
    private java.util.List<MeetingSpeaker> _speakers;
    /** The meeting start time in UTC. */
    private OffsetDateTime _startDateTime;
    /** The subject of the meeting. */
    private String _subject;
    /**
     * Instantiates a new MeetingRegistration and sets the default values.
     * @return a void
     */
    public MeetingRegistration() {
        super();
        this.setOdataType("#microsoft.graph.meetingRegistration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MeetingRegistration
     */
    @javax.annotation.Nonnull
    public static MeetingRegistration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingRegistration();
    }
    /**
     * Gets the customQuestions property value. Custom registration questions.
     * @return a meetingRegistrationQuestion
     */
    @javax.annotation.Nullable
    public java.util.List<MeetingRegistrationQuestion> getCustomQuestions() {
        return this._customQuestions;
    }
    /**
     * Gets the description property value. The description of the meeting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the endDateTime property value. The meeting end time in UTC.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this._endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MeetingRegistration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("customQuestions", (n) -> { currentObject.setCustomQuestions(n.getCollectionOfObjectValues(MeetingRegistrationQuestion::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("endDateTime", (n) -> { currentObject.setEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("registrationPageViewCount", (n) -> { currentObject.setRegistrationPageViewCount(n.getIntegerValue()); });
            this.put("registrationPageWebUrl", (n) -> { currentObject.setRegistrationPageWebUrl(n.getStringValue()); });
            this.put("speakers", (n) -> { currentObject.setSpeakers(n.getCollectionOfObjectValues(MeetingSpeaker::createFromDiscriminatorValue)); });
            this.put("startDateTime", (n) -> { currentObject.setStartDateTime(n.getOffsetDateTimeValue()); });
            this.put("subject", (n) -> { currentObject.setSubject(n.getStringValue()); });
        }};
    }
    /**
     * Gets the registrationPageViewCount property value. The number of times the registration page has been visited. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRegistrationPageViewCount() {
        return this._registrationPageViewCount;
    }
    /**
     * Gets the registrationPageWebUrl property value. The URL of the registration page. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRegistrationPageWebUrl() {
        return this._registrationPageWebUrl;
    }
    /**
     * Gets the speakers property value. The meeting speaker's information.
     * @return a meetingSpeaker
     */
    @javax.annotation.Nullable
    public java.util.List<MeetingSpeaker> getSpeakers() {
        return this._speakers;
    }
    /**
     * Gets the startDateTime property value. The meeting start time in UTC.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Gets the subject property value. The subject of the meeting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this._subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("customQuestions", this.getCustomQuestions());
        writer.writeStringValue("description", this.getDescription());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeIntegerValue("registrationPageViewCount", this.getRegistrationPageViewCount());
        writer.writeStringValue("registrationPageWebUrl", this.getRegistrationPageWebUrl());
        writer.writeCollectionOfObjectValues("speakers", this.getSpeakers());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("subject", this.getSubject());
    }
    /**
     * Sets the customQuestions property value. Custom registration questions.
     * @param value Value to set for the customQuestions property.
     * @return a void
     */
    public void setCustomQuestions(@javax.annotation.Nullable final java.util.List<MeetingRegistrationQuestion> value) {
        this._customQuestions = value;
    }
    /**
     * Sets the description property value. The description of the meeting.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the endDateTime property value. The meeting end time in UTC.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._endDateTime = value;
    }
    /**
     * Sets the registrationPageViewCount property value. The number of times the registration page has been visited. Read-only.
     * @param value Value to set for the registrationPageViewCount property.
     * @return a void
     */
    public void setRegistrationPageViewCount(@javax.annotation.Nullable final Integer value) {
        this._registrationPageViewCount = value;
    }
    /**
     * Sets the registrationPageWebUrl property value. The URL of the registration page. Read-only.
     * @param value Value to set for the registrationPageWebUrl property.
     * @return a void
     */
    public void setRegistrationPageWebUrl(@javax.annotation.Nullable final String value) {
        this._registrationPageWebUrl = value;
    }
    /**
     * Sets the speakers property value. The meeting speaker's information.
     * @param value Value to set for the speakers property.
     * @return a void
     */
    public void setSpeakers(@javax.annotation.Nullable final java.util.List<MeetingSpeaker> value) {
        this._speakers = value;
    }
    /**
     * Sets the startDateTime property value. The meeting start time in UTC.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
    /**
     * Sets the subject property value. The subject of the meeting.
     * @param value Value to set for the subject property.
     * @return a void
     */
    public void setSubject(@javax.annotation.Nullable final String value) {
        this._subject = value;
    }
}
