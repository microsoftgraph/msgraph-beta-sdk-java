package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MeetingRegistrant extends MeetingRegistrantBase implements Parsable {
    /** The registrant's answer to custom questions. */
    private java.util.List<CustomQuestionAnswer> customQuestionAnswers;
    /** The email address of the registrant. */
    private String email;
    /** The first name of the registrant. */
    private String firstName;
    /** The last name of the registrant. */
    private String lastName;
    /** Time in UTC when the registrant registers for the meeting. Read-only. */
    private OffsetDateTime registrationDateTime;
    /** The registration status of the registrant. Read-only. */
    private MeetingRegistrantStatus status;
    /**
     * Instantiates a new MeetingRegistrant and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MeetingRegistrant() {
        super();
        this.setOdataType("#microsoft.graph.meetingRegistrant");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MeetingRegistrant
     */
    @javax.annotation.Nonnull
    public static MeetingRegistrant createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingRegistrant();
    }
    /**
     * Gets the customQuestionAnswers property value. The registrant's answer to custom questions.
     * @return a customQuestionAnswer
     */
    @javax.annotation.Nullable
    public java.util.List<CustomQuestionAnswer> getCustomQuestionAnswers() {
        return this.customQuestionAnswers;
    }
    /**
     * Gets the email property value. The email address of the registrant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customQuestionAnswers", (n) -> { this.setCustomQuestionAnswers(n.getCollectionOfObjectValues(CustomQuestionAnswer::createFromDiscriminatorValue)); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("registrationDateTime", (n) -> { this.setRegistrationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(MeetingRegistrantStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. The first name of the registrant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the lastName property value. The last name of the registrant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the registrationDateTime property value. Time in UTC when the registrant registers for the meeting. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRegistrationDateTime() {
        return this.registrationDateTime;
    }
    /**
     * Gets the status property value. The registration status of the registrant. Read-only.
     * @return a meetingRegistrantStatus
     */
    @javax.annotation.Nullable
    public MeetingRegistrantStatus getStatus() {
        return this.status;
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
        writer.writeCollectionOfObjectValues("customQuestionAnswers", this.getCustomQuestionAnswers());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeOffsetDateTimeValue("registrationDateTime", this.getRegistrationDateTime());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the customQuestionAnswers property value. The registrant's answer to custom questions.
     * @param value Value to set for the customQuestionAnswers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomQuestionAnswers(@javax.annotation.Nullable final java.util.List<CustomQuestionAnswer> value) {
        this.customQuestionAnswers = value;
    }
    /**
     * Sets the email property value. The email address of the registrant.
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the firstName property value. The first name of the registrant.
     * @param value Value to set for the firstName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirstName(@javax.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the lastName property value. The last name of the registrant.
     * @param value Value to set for the lastName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastName(@javax.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the registrationDateTime property value. Time in UTC when the registrant registers for the meeting. Read-only.
     * @param value Value to set for the registrationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistrationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.registrationDateTime = value;
    }
    /**
     * Sets the status property value. The registration status of the registrant. Read-only.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final MeetingRegistrantStatus value) {
        this.status = value;
    }
}
