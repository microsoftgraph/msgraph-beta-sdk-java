package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MeetingRegistrant extends MeetingRegistrantBase implements Parsable {
    /**
     * Instantiates a new MeetingRegistrant and sets the default values.
     */
    public MeetingRegistrant() {
        super();
        this.setOdataType("#microsoft.graph.meetingRegistrant");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MeetingRegistrant
     */
    @jakarta.annotation.Nonnull
    public static MeetingRegistrant createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MeetingRegistrant();
    }
    /**
     * Gets the customQuestionAnswers property value. The registrant's answer to custom questions.
     * @return a java.util.List<CustomQuestionAnswer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomQuestionAnswer> getCustomQuestionAnswers() {
        return this.backingStore.get("customQuestionAnswers");
    }
    /**
     * Gets the email property value. The email address of the registrant.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.backingStore.get("firstName");
    }
    /**
     * Gets the lastName property value. The last name of the registrant.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.backingStore.get("lastName");
    }
    /**
     * Gets the registrationDateTime property value. Time in UTC when the registrant registers for the meeting. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRegistrationDateTime() {
        return this.backingStore.get("registrationDateTime");
    }
    /**
     * Gets the status property value. The registration status of the registrant. Read-only.
     * @return a MeetingRegistrantStatus
     */
    @jakarta.annotation.Nullable
    public MeetingRegistrantStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setCustomQuestionAnswers(@jakarta.annotation.Nullable final java.util.List<CustomQuestionAnswer> value) {
        this.backingStore.set("customQuestionAnswers", value);
    }
    /**
     * Sets the email property value. The email address of the registrant.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
    /**
     * Sets the firstName property value. The first name of the registrant.
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("firstName", value);
    }
    /**
     * Sets the lastName property value. The last name of the registrant.
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastName", value);
    }
    /**
     * Sets the registrationDateTime property value. Time in UTC when the registrant registers for the meeting. Read-only.
     * @param value Value to set for the registrationDateTime property.
     */
    public void setRegistrationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("registrationDateTime", value);
    }
    /**
     * Sets the status property value. The registration status of the registrant. Read-only.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final MeetingRegistrantStatus value) {
        this.backingStore.set("status", value);
    }
}
