package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Employee implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new Employee and sets the default values.
     */
    public Employee() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Employee
     */
    @jakarta.annotation.Nonnull
    public static Employee createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Employee();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the address property value. The address property
     * @return a PostalAddressType
     */
    @jakarta.annotation.Nullable
    public PostalAddressType getAddress() {
        return this.backingStore.get("address");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the birthDate property value. The birthDate property
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getBirthDate() {
        return this.backingStore.get("birthDate");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the email property value. The email property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * Gets the employmentDate property value. The employmentDate property
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getEmploymentDate() {
        return this.backingStore.get("employmentDate");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGivenName() {
        return this.backingStore.get("givenName");
    }
    /**
     * Gets the id property value. The id property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.backingStore.get("id");
    }
    /**
     * Gets the jobTitle property value. The jobTitle property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getJobTitle() {
        return this.backingStore.get("jobTitle");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the middleName property value. The middleName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMiddleName() {
        return this.backingStore.get("middleName");
    }
    /**
     * Gets the mobilePhone property value. The mobilePhone property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMobilePhone() {
        return this.backingStore.get("mobilePhone");
    }
    /**
     * Gets the number property value. The number property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.backingStore.get("number");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the personalEmail property value. The personalEmail property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPersonalEmail() {
        return this.backingStore.get("personalEmail");
    }
    /**
     * Gets the phoneNumber property value. The phoneNumber property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.backingStore.get("phoneNumber");
    }
    /**
     * Gets the picture property value. The picture property
     * @return a java.util.List<Picture>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Picture> getPicture() {
        return this.backingStore.get("picture");
    }
    /**
     * Gets the statisticsGroupCode property value. The statisticsGroupCode property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatisticsGroupCode() {
        return this.backingStore.get("statisticsGroupCode");
    }
    /**
     * Gets the status property value. The status property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the surname property value. The surname property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSurname() {
        return this.backingStore.get("surname");
    }
    /**
     * Gets the terminationDate property value. The terminationDate property
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getTerminationDate() {
        return this.backingStore.get("terminationDate");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the address property value. The address property
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final PostalAddressType value) {
        this.backingStore.set("address", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the birthDate property value. The birthDate property
     * @param value Value to set for the birthDate property.
     */
    public void setBirthDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("birthDate", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the email property value. The email property
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
    /**
     * Sets the employmentDate property value. The employmentDate property
     * @param value Value to set for the employmentDate property.
     */
    public void setEmploymentDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("employmentDate", value);
    }
    /**
     * Sets the givenName property value. The givenName property
     * @param value Value to set for the givenName property.
     */
    public void setGivenName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("givenName", value);
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.backingStore.set("id", value);
    }
    /**
     * Sets the jobTitle property value. The jobTitle property
     * @param value Value to set for the jobTitle property.
     */
    public void setJobTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("jobTitle", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the middleName property value. The middleName property
     * @param value Value to set for the middleName property.
     */
    public void setMiddleName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("middleName", value);
    }
    /**
     * Sets the mobilePhone property value. The mobilePhone property
     * @param value Value to set for the mobilePhone property.
     */
    public void setMobilePhone(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mobilePhone", value);
    }
    /**
     * Sets the number property value. The number property
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("number", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the personalEmail property value. The personalEmail property
     * @param value Value to set for the personalEmail property.
     */
    public void setPersonalEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("personalEmail", value);
    }
    /**
     * Sets the phoneNumber property value. The phoneNumber property
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phoneNumber", value);
    }
    /**
     * Sets the picture property value. The picture property
     * @param value Value to set for the picture property.
     */
    public void setPicture(@jakarta.annotation.Nullable final java.util.List<Picture> value) {
        this.backingStore.set("picture", value);
    }
    /**
     * Sets the statisticsGroupCode property value. The statisticsGroupCode property
     * @param value Value to set for the statisticsGroupCode property.
     */
    public void setStatisticsGroupCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("statisticsGroupCode", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the surname property value. The surname property
     * @param value Value to set for the surname property.
     */
    public void setSurname(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("surname", value);
    }
    /**
     * Sets the terminationDate property value. The terminationDate property
     * @param value Value to set for the terminationDate property.
     */
    public void setTerminationDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("terminationDate", value);
    }
}
