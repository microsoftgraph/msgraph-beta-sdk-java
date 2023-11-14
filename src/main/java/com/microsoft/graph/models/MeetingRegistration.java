package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MeetingRegistration extends MeetingRegistrationBase implements Parsable {
    /**
     * Custom registration questions.
     */
    private java.util.List<MeetingRegistrationQuestion> customQuestions;
    /**
     * The description of the meeting.
     */
    private String description;
    /**
     * The meeting end time in UTC.
     */
    private OffsetDateTime endDateTime;
    /**
     * The number of times the registration page has been visited. Read-only.
     */
    private Integer registrationPageViewCount;
    /**
     * The URL of the registration page. Read-only.
     */
    private String registrationPageWebUrl;
    /**
     * The meeting speaker's information.
     */
    private java.util.List<MeetingSpeaker> speakers;
    /**
     * The meeting start time in UTC.
     */
    private OffsetDateTime startDateTime;
    /**
     * The subject of the meeting.
     */
    private String subject;
    /**
     * Instantiates a new MeetingRegistration and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static MeetingRegistration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingRegistration();
    }
    /**
     * Gets the customQuestions property value. Custom registration questions.
     * @return a java.util.List<MeetingRegistrationQuestion>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingRegistrationQuestion> getCustomQuestions() {
        return this.customQuestions;
    }
    /**
     * Gets the description property value. The description of the meeting.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the endDateTime property value. The meeting end time in UTC.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customQuestions", (n) -> { this.setCustomQuestions(n.getCollectionOfObjectValues(MeetingRegistrationQuestion::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("registrationPageViewCount", (n) -> { this.setRegistrationPageViewCount(n.getIntegerValue()); });
        deserializerMap.put("registrationPageWebUrl", (n) -> { this.setRegistrationPageWebUrl(n.getStringValue()); });
        deserializerMap.put("speakers", (n) -> { this.setSpeakers(n.getCollectionOfObjectValues(MeetingSpeaker::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the registrationPageViewCount property value. The number of times the registration page has been visited. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRegistrationPageViewCount() {
        return this.registrationPageViewCount;
    }
    /**
     * Gets the registrationPageWebUrl property value. The URL of the registration page. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRegistrationPageWebUrl() {
        return this.registrationPageWebUrl;
    }
    /**
     * Gets the speakers property value. The meeting speaker's information.
     * @return a java.util.List<MeetingSpeaker>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MeetingSpeaker> getSpeakers() {
        return this.speakers;
    }
    /**
     * Gets the startDateTime property value. The meeting start time in UTC.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the subject property value. The subject of the meeting.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCustomQuestions(@jakarta.annotation.Nullable final java.util.List<MeetingRegistrationQuestion> value) {
        this.customQuestions = value;
    }
    /**
     * Sets the description property value. The description of the meeting.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the endDateTime property value. The meeting end time in UTC.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the registrationPageViewCount property value. The number of times the registration page has been visited. Read-only.
     * @param value Value to set for the registrationPageViewCount property.
     */
    public void setRegistrationPageViewCount(@jakarta.annotation.Nullable final Integer value) {
        this.registrationPageViewCount = value;
    }
    /**
     * Sets the registrationPageWebUrl property value. The URL of the registration page. Read-only.
     * @param value Value to set for the registrationPageWebUrl property.
     */
    public void setRegistrationPageWebUrl(@jakarta.annotation.Nullable final String value) {
        this.registrationPageWebUrl = value;
    }
    /**
     * Sets the speakers property value. The meeting speaker's information.
     * @param value Value to set for the speakers property.
     */
    public void setSpeakers(@jakarta.annotation.Nullable final java.util.List<MeetingSpeaker> value) {
        this.speakers = value;
    }
    /**
     * Sets the startDateTime property value. The meeting start time in UTC.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the subject property value. The subject of the meeting.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
}
