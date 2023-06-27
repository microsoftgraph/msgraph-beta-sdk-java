package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class Employee implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The address property
     */
    private PostalAddressType address;
    /**
     * The birthDate property
     */
    private LocalDate birthDate;
    /**
     * The displayName property
     */
    private String displayName;
    /**
     * The email property
     */
    private String email;
    /**
     * The employmentDate property
     */
    private LocalDate employmentDate;
    /**
     * The givenName property
     */
    private String givenName;
    /**
     * The id property
     */
    private UUID id;
    /**
     * The jobTitle property
     */
    private String jobTitle;
    /**
     * The lastModifiedDateTime property
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The middleName property
     */
    private String middleName;
    /**
     * The mobilePhone property
     */
    private String mobilePhone;
    /**
     * The number property
     */
    private String number;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The personalEmail property
     */
    private String personalEmail;
    /**
     * The phoneNumber property
     */
    private String phoneNumber;
    /**
     * The picture property
     */
    private java.util.List<Picture> picture;
    /**
     * The statisticsGroupCode property
     */
    private String statisticsGroupCode;
    /**
     * The status property
     */
    private String status;
    /**
     * The surname property
     */
    private String surname;
    /**
     * The terminationDate property
     */
    private LocalDate terminationDate;
    /**
     * Instantiates a new Employee and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Employee() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Employee
     */
    @javax.annotation.Nonnull
    public static Employee createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Employee();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the address property value. The address property
     * @return a postalAddressType
     */
    @javax.annotation.Nullable
    public PostalAddressType getAddress() {
        return this.address;
    }
    /**
     * Gets the birthDate property value. The birthDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getBirthDate() {
        return this.birthDate;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
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
     * Gets the employmentDate property value. The employmentDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getEmploymentDate() {
        return this.employmentDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PostalAddressType::createFromDiscriminatorValue)); });
        deserializerMap.put("birthDate", (n) -> { this.setBirthDate(n.getLocalDateValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("employmentDate", (n) -> { this.setEmploymentDate(n.getLocalDateValue()); });
        deserializerMap.put("givenName", (n) -> { this.setGivenName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("middleName", (n) -> { this.setMiddleName(n.getStringValue()); });
        deserializerMap.put("mobilePhone", (n) -> { this.setMobilePhone(n.getStringValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("personalEmail", (n) -> { this.setPersonalEmail(n.getStringValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("picture", (n) -> { this.setPicture(n.getCollectionOfObjectValues(Picture::createFromDiscriminatorValue)); });
        deserializerMap.put("statisticsGroupCode", (n) -> { this.setStatisticsGroupCode(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("surname", (n) -> { this.setSurname(n.getStringValue()); });
        deserializerMap.put("terminationDate", (n) -> { this.setTerminationDate(n.getLocalDateValue()); });
        return deserializerMap;
    }
    /**
     * Gets the givenName property value. The givenName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGivenName() {
        return this.givenName;
    }
    /**
     * Gets the id property value. The id property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the jobTitle property value. The jobTitle property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJobTitle() {
        return this.jobTitle;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the middleName property value. The middleName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMiddleName() {
        return this.middleName;
    }
    /**
     * Gets the mobilePhone property value. The mobilePhone property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMobilePhone() {
        return this.mobilePhone;
    }
    /**
     * Gets the number property value. The number property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the personalEmail property value. The personalEmail property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPersonalEmail() {
        return this.personalEmail;
    }
    /**
     * Gets the phoneNumber property value. The phoneNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the picture property value. The picture property
     * @return a Picture
     */
    @javax.annotation.Nullable
    public java.util.List<Picture> getPicture() {
        return this.picture;
    }
    /**
     * Gets the statisticsGroupCode property value. The statisticsGroupCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatisticsGroupCode() {
        return this.statisticsGroupCode;
    }
    /**
     * Gets the status property value. The status property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the surname property value. The surname property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSurname() {
        return this.surname;
    }
    /**
     * Gets the terminationDate property value. The terminationDate property
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getTerminationDate() {
        return this.terminationDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeLocalDateValue("birthDate", this.getBirthDate());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("email", this.getEmail());
        writer.writeLocalDateValue("employmentDate", this.getEmploymentDate());
        writer.writeStringValue("givenName", this.getGivenName());
        writer.writeUUIDValue("id", this.getId());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("middleName", this.getMiddleName());
        writer.writeStringValue("mobilePhone", this.getMobilePhone());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("personalEmail", this.getPersonalEmail());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeCollectionOfObjectValues("picture", this.getPicture());
        writer.writeStringValue("statisticsGroupCode", this.getStatisticsGroupCode());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("surname", this.getSurname());
        writer.writeLocalDateValue("terminationDate", this.getTerminationDate());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the address property value. The address property
     * @param value Value to set for the address property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddress(@javax.annotation.Nullable final PostalAddressType value) {
        this.address = value;
    }
    /**
     * Sets the birthDate property value. The birthDate property
     * @param value Value to set for the birthDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBirthDate(@javax.annotation.Nullable final LocalDate value) {
        this.birthDate = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
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
     * Sets the employmentDate property value. The employmentDate property
     * @param value Value to set for the employmentDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmploymentDate(@javax.annotation.Nullable final LocalDate value) {
        this.employmentDate = value;
    }
    /**
     * Sets the givenName property value. The givenName property
     * @param value Value to set for the givenName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGivenName(@javax.annotation.Nullable final String value) {
        this.givenName = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the jobTitle property value. The jobTitle property
     * @param value Value to set for the jobTitle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJobTitle(@javax.annotation.Nullable final String value) {
        this.jobTitle = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the middleName property value. The middleName property
     * @param value Value to set for the middleName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMiddleName(@javax.annotation.Nullable final String value) {
        this.middleName = value;
    }
    /**
     * Sets the mobilePhone property value. The mobilePhone property
     * @param value Value to set for the mobilePhone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobilePhone(@javax.annotation.Nullable final String value) {
        this.mobilePhone = value;
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumber(@javax.annotation.Nullable final String value) {
        this.number = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the personalEmail property value. The personalEmail property
     * @param value Value to set for the personalEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersonalEmail(@javax.annotation.Nullable final String value) {
        this.personalEmail = value;
    }
    /**
     * Sets the phoneNumber property value. The phoneNumber property
     * @param value Value to set for the phoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneNumber(@javax.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the picture property value. The picture property
     * @param value Value to set for the picture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPicture(@javax.annotation.Nullable final java.util.List<Picture> value) {
        this.picture = value;
    }
    /**
     * Sets the statisticsGroupCode property value. The statisticsGroupCode property
     * @param value Value to set for the statisticsGroupCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatisticsGroupCode(@javax.annotation.Nullable final String value) {
        this.statisticsGroupCode = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the surname property value. The surname property
     * @param value Value to set for the surname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSurname(@javax.annotation.Nullable final String value) {
        this.surname = value;
    }
    /**
     * Sets the terminationDate property value. The terminationDate property
     * @param value Value to set for the terminationDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTerminationDate(@javax.annotation.Nullable final LocalDate value) {
        this.terminationDate = value;
    }
}
