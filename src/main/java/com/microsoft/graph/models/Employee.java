package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class Employee extends Entity implements Parsable {
    /** The address property */
    private PostalAddressType _address;
    /** The birthDate property */
    private LocalDate _birthDate;
    /** The displayName property */
    private String _displayName;
    /** The email property */
    private String _email;
    /** The employmentDate property */
    private LocalDate _employmentDate;
    /** The givenName property */
    private String _givenName;
    /** The jobTitle property */
    private String _jobTitle;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The middleName property */
    private String _middleName;
    /** The mobilePhone property */
    private String _mobilePhone;
    /** The number property */
    private String _number;
    /** The personalEmail property */
    private String _personalEmail;
    /** The phoneNumber property */
    private String _phoneNumber;
    /** The picture property */
    private java.util.List<Picture> _picture;
    /** The statisticsGroupCode property */
    private String _statisticsGroupCode;
    /** The status property */
    private String _status;
    /** The surname property */
    private String _surname;
    /** The terminationDate property */
    private LocalDate _terminationDate;
    /**
     * Instantiates a new employee and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Employee() {
        super();
        this.setOdataType("#microsoft.graph.employee");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a employee
     */
    @javax.annotation.Nonnull
    public static Employee createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Employee();
    }
    /**
     * Gets the address property value. The address property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getAddress() {
        return this._address;
    }
    /**
     * Gets the birthDate property value. The birthDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getBirthDate() {
        return this._birthDate;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the email property value. The email property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this._email;
    }
    /**
     * Gets the employmentDate property value. The employmentDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getEmploymentDate() {
        return this._employmentDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Employee currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("address", (n) -> { currentObject.setAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
            this.put("birthDate", (n) -> { currentObject.setBirthDate(n.getLocalDateValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("email", (n) -> { currentObject.setEmail(n.getStringValue()); });
            this.put("employmentDate", (n) -> { currentObject.setEmploymentDate(n.getLocalDateValue()); });
            this.put("givenName", (n) -> { currentObject.setGivenName(n.getStringValue()); });
            this.put("jobTitle", (n) -> { currentObject.setJobTitle(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("middleName", (n) -> { currentObject.setMiddleName(n.getStringValue()); });
            this.put("mobilePhone", (n) -> { currentObject.setMobilePhone(n.getStringValue()); });
            this.put("number", (n) -> { currentObject.setNumber(n.getStringValue()); });
            this.put("personalEmail", (n) -> { currentObject.setPersonalEmail(n.getStringValue()); });
            this.put("phoneNumber", (n) -> { currentObject.setPhoneNumber(n.getStringValue()); });
            this.put("picture", (n) -> { currentObject.setPicture(n.getCollectionOfObjectValues(Picture::createFromDiscriminatorValue)); });
            this.put("statisticsGroupCode", (n) -> { currentObject.setStatisticsGroupCode(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getStringValue()); });
            this.put("surname", (n) -> { currentObject.setSurname(n.getStringValue()); });
            this.put("terminationDate", (n) -> { currentObject.setTerminationDate(n.getLocalDateValue()); });
        }};
    }
    /**
     * Gets the givenName property value. The givenName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGivenName() {
        return this._givenName;
    }
    /**
     * Gets the jobTitle property value. The jobTitle property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobTitle() {
        return this._jobTitle;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the middleName property value. The middleName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMiddleName() {
        return this._middleName;
    }
    /**
     * Gets the mobilePhone property value. The mobilePhone property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMobilePhone() {
        return this._mobilePhone;
    }
    /**
     * Gets the number property value. The number property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNumber() {
        return this._number;
    }
    /**
     * Gets the personalEmail property value. The personalEmail property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPersonalEmail() {
        return this._personalEmail;
    }
    /**
     * Gets the phoneNumber property value. The phoneNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return this._phoneNumber;
    }
    /**
     * Gets the picture property value. The picture property
     * @return a picture
     */
    @javax.annotation.Nullable
    public java.util.List<Picture> getPicture() {
        return this._picture;
    }
    /**
     * Gets the statisticsGroupCode property value. The statisticsGroupCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatisticsGroupCode() {
        return this._statisticsGroupCode;
    }
    /**
     * Gets the status property value. The status property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Gets the surname property value. The surname property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSurname() {
        return this._surname;
    }
    /**
     * Gets the terminationDate property value. The terminationDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getTerminationDate() {
        return this._terminationDate;
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
        writer.writeObjectValue("address", this.getAddress());
        writer.writeLocalDateValue("birthDate", this.getBirthDate());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeLocalDateValue("employmentDate", this.getEmploymentDate());
        writer.writeStringValue("givenName", this.getGivenName());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("middleName", this.getMiddleName());
        writer.writeStringValue("mobilePhone", this.getMobilePhone());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("personalEmail", this.getPersonalEmail());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeCollectionOfObjectValues("picture", this.getPicture());
        writer.writeStringValue("statisticsGroupCode", this.getStatisticsGroupCode());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("surname", this.getSurname());
        writer.writeLocalDateValue("terminationDate", this.getTerminationDate());
    }
    /**
     * Sets the address property value. The address property
     * @param value Value to set for the address property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this._address = value;
    }
    /**
     * Sets the birthDate property value. The birthDate property
     * @param value Value to set for the birthDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBirthDate(@javax.annotation.Nullable final LocalDate value) {
        this._birthDate = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this._email = value;
    }
    /**
     * Sets the employmentDate property value. The employmentDate property
     * @param value Value to set for the employmentDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmploymentDate(@javax.annotation.Nullable final LocalDate value) {
        this._employmentDate = value;
    }
    /**
     * Sets the givenName property value. The givenName property
     * @param value Value to set for the givenName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGivenName(@javax.annotation.Nullable final String value) {
        this._givenName = value;
    }
    /**
     * Sets the jobTitle property value. The jobTitle property
     * @param value Value to set for the jobTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobTitle(@javax.annotation.Nullable final String value) {
        this._jobTitle = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the middleName property value. The middleName property
     * @param value Value to set for the middleName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMiddleName(@javax.annotation.Nullable final String value) {
        this._middleName = value;
    }
    /**
     * Sets the mobilePhone property value. The mobilePhone property
     * @param value Value to set for the mobilePhone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobilePhone(@javax.annotation.Nullable final String value) {
        this._mobilePhone = value;
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumber(@javax.annotation.Nullable final String value) {
        this._number = value;
    }
    /**
     * Sets the personalEmail property value. The personalEmail property
     * @param value Value to set for the personalEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalEmail(@javax.annotation.Nullable final String value) {
        this._personalEmail = value;
    }
    /**
     * Sets the phoneNumber property value. The phoneNumber property
     * @param value Value to set for the phoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneNumber(@javax.annotation.Nullable final String value) {
        this._phoneNumber = value;
    }
    /**
     * Sets the picture property value. The picture property
     * @param value Value to set for the picture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPicture(@javax.annotation.Nullable final java.util.List<Picture> value) {
        this._picture = value;
    }
    /**
     * Sets the statisticsGroupCode property value. The statisticsGroupCode property
     * @param value Value to set for the statisticsGroupCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatisticsGroupCode(@javax.annotation.Nullable final String value) {
        this._statisticsGroupCode = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
    /**
     * Sets the surname property value. The surname property
     * @param value Value to set for the surname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSurname(@javax.annotation.Nullable final String value) {
        this._surname = value;
    }
    /**
     * Sets the terminationDate property value. The terminationDate property
     * @param value Value to set for the terminationDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTerminationDate(@javax.annotation.Nullable final LocalDate value) {
        this._terminationDate = value;
    }
}
