package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VirtualEventRegistrant extends Entity implements Parsable {
    /** The cancelationDateTime property */
    private OffsetDateTime cancelationDateTime;
    /** The email property */
    private String email;
    /** The firstName property */
    private String firstName;
    /** The lastName property */
    private String lastName;
    /** The registrationDateTime property */
    private OffsetDateTime registrationDateTime;
    /** The registrationQuestionAnswers property */
    private java.util.List<VirtualEventRegistrationQuestionAnswer> registrationQuestionAnswers;
    /** The status property */
    private VirtualEventAttendeeRegistrationStatus status;
    /** The userId property */
    private String userId;
    /**
     * Instantiates a new virtualEventRegistrant and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VirtualEventRegistrant() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a virtualEventRegistrant
     */
    @javax.annotation.Nonnull
    public static VirtualEventRegistrant createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventRegistrant();
    }
    /**
     * Gets the cancelationDateTime property value. The cancelationDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCancelationDateTime() {
        return this.cancelationDateTime;
    }
    /**
     * Gets the email property value. The email property
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
        deserializerMap.put("cancelationDateTime", (n) -> { this.setCancelationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("registrationDateTime", (n) -> { this.setRegistrationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("registrationQuestionAnswers", (n) -> { this.setRegistrationQuestionAnswers(n.getCollectionOfObjectValues(VirtualEventRegistrationQuestionAnswer::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(VirtualEventAttendeeRegistrationStatus.class)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. The firstName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the lastName property value. The lastName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the registrationDateTime property value. The registrationDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRegistrationDateTime() {
        return this.registrationDateTime;
    }
    /**
     * Gets the registrationQuestionAnswers property value. The registrationQuestionAnswers property
     * @return a virtualEventRegistrationQuestionAnswer
     */
    @javax.annotation.Nullable
    public java.util.List<VirtualEventRegistrationQuestionAnswer> getRegistrationQuestionAnswers() {
        return this.registrationQuestionAnswers;
    }
    /**
     * Gets the status property value. The status property
     * @return a virtualEventAttendeeRegistrationStatus
     */
    @javax.annotation.Nullable
    public VirtualEventAttendeeRegistrationStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the userId property value. The userId property
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
        writer.writeOffsetDateTimeValue("cancelationDateTime", this.getCancelationDateTime());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeOffsetDateTimeValue("registrationDateTime", this.getRegistrationDateTime());
        writer.writeCollectionOfObjectValues("registrationQuestionAnswers", this.getRegistrationQuestionAnswers());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the cancelationDateTime property value. The cancelationDateTime property
     * @param value Value to set for the cancelationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCancelationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.cancelationDateTime = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the firstName property value. The firstName property
     * @param value Value to set for the firstName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirstName(@javax.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the lastName property value. The lastName property
     * @param value Value to set for the lastName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastName(@javax.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the registrationDateTime property value. The registrationDateTime property
     * @param value Value to set for the registrationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistrationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.registrationDateTime = value;
    }
    /**
     * Sets the registrationQuestionAnswers property value. The registrationQuestionAnswers property
     * @param value Value to set for the registrationQuestionAnswers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistrationQuestionAnswers(@javax.annotation.Nullable final java.util.List<VirtualEventRegistrationQuestionAnswer> value) {
        this.registrationQuestionAnswers = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final VirtualEventAttendeeRegistrationStatus value) {
        this.status = value;
    }
    /**
     * Sets the userId property value. The userId property
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
}
