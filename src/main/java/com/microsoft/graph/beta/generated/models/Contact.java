package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Contact extends OutlookItem implements Parsable {
    /**
     * Instantiates a new {@link Contact} and sets the default values.
     */
    public Contact() {
        super();
        this.setOdataType("#microsoft.graph.contact");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Contact}
     */
    @jakarta.annotation.Nonnull
    public static Contact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Contact();
    }
    /**
     * Gets the assistantName property value. The name of the contact's assistant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssistantName() {
        return this.backingStore.get("assistantName");
    }
    /**
     * Gets the birthday property value. The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getBirthday() {
        return this.backingStore.get("birthday");
    }
    /**
     * Gets the children property value. The names of the contact's children.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getChildren() {
        return this.backingStore.get("children");
    }
    /**
     * Gets the companyName property value. The name of the contact's company.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.backingStore.get("companyName");
    }
    /**
     * Gets the department property value. The contact's department.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDepartment() {
        return this.backingStore.get("department");
    }
    /**
     * Gets the displayName property value. The contact's display name. You can specify the display name in a create or update operation. Later updates to other properties might cause an automatically generated value to overwrite the displayName value you specified. To preserve a pre-existing value, always include it as displayName in an update operation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the emailAddresses property value. The contact's email addresses.
     * @return a {@link java.util.List<TypedEmailAddress>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TypedEmailAddress> getEmailAddresses() {
        return this.backingStore.get("emailAddresses");
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the contact. Nullable.
     * @return a {@link java.util.List<Extension>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.backingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assistantName", (n) -> { this.setAssistantName(n.getStringValue()); });
        deserializerMap.put("birthday", (n) -> { this.setBirthday(n.getOffsetDateTimeValue()); });
        deserializerMap.put("children", (n) -> { this.setChildren(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("emailAddresses", (n) -> { this.setEmailAddresses(n.getCollectionOfObjectValues(TypedEmailAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("fileAs", (n) -> { this.setFileAs(n.getStringValue()); });
        deserializerMap.put("flag", (n) -> { this.setFlag(n.getObjectValue(FollowupFlag::createFromDiscriminatorValue)); });
        deserializerMap.put("gender", (n) -> { this.setGender(n.getStringValue()); });
        deserializerMap.put("generation", (n) -> { this.setGeneration(n.getStringValue()); });
        deserializerMap.put("givenName", (n) -> { this.setGivenName(n.getStringValue()); });
        deserializerMap.put("imAddresses", (n) -> { this.setImAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("initials", (n) -> { this.setInitials(n.getStringValue()); });
        deserializerMap.put("isFavorite", (n) -> { this.setIsFavorite(n.getBooleanValue()); });
        deserializerMap.put("jobTitle", (n) -> { this.setJobTitle(n.getStringValue()); });
        deserializerMap.put("manager", (n) -> { this.setManager(n.getStringValue()); });
        deserializerMap.put("middleName", (n) -> { this.setMiddleName(n.getStringValue()); });
        deserializerMap.put("multiValueExtendedProperties", (n) -> { this.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("nickName", (n) -> { this.setNickName(n.getStringValue()); });
        deserializerMap.put("officeLocation", (n) -> { this.setOfficeLocation(n.getStringValue()); });
        deserializerMap.put("parentFolderId", (n) -> { this.setParentFolderId(n.getStringValue()); });
        deserializerMap.put("personalNotes", (n) -> { this.setPersonalNotes(n.getStringValue()); });
        deserializerMap.put("phones", (n) -> { this.setPhones(n.getCollectionOfObjectValues(Phone::createFromDiscriminatorValue)); });
        deserializerMap.put("photo", (n) -> { this.setPhoto(n.getObjectValue(ProfilePhoto::createFromDiscriminatorValue)); });
        deserializerMap.put("postalAddresses", (n) -> { this.setPostalAddresses(n.getCollectionOfObjectValues(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("profession", (n) -> { this.setProfession(n.getStringValue()); });
        deserializerMap.put("singleValueExtendedProperties", (n) -> { this.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("spouseName", (n) -> { this.setSpouseName(n.getStringValue()); });
        deserializerMap.put("surname", (n) -> { this.setSurname(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("websites", (n) -> { this.setWebsites(n.getCollectionOfObjectValues(Website::createFromDiscriminatorValue)); });
        deserializerMap.put("weddingAnniversary", (n) -> { this.setWeddingAnniversary(n.getLocalDateValue()); });
        deserializerMap.put("yomiCompanyName", (n) -> { this.setYomiCompanyName(n.getStringValue()); });
        deserializerMap.put("yomiGivenName", (n) -> { this.setYomiGivenName(n.getStringValue()); });
        deserializerMap.put("yomiSurname", (n) -> { this.setYomiSurname(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileAs property value. The name the contact is filed under.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileAs() {
        return this.backingStore.get("fileAs");
    }
    /**
     * Gets the flag property value. The flag value that indicates the status, start date, due date, or completion date for the contact.
     * @return a {@link FollowupFlag}
     */
    @jakarta.annotation.Nullable
    public FollowupFlag getFlag() {
        return this.backingStore.get("flag");
    }
    /**
     * Gets the gender property value. The contact's gender.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGender() {
        return this.backingStore.get("gender");
    }
    /**
     * Gets the generation property value. The contact's suffix.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGeneration() {
        return this.backingStore.get("generation");
    }
    /**
     * Gets the givenName property value. The contact's given name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGivenName() {
        return this.backingStore.get("givenName");
    }
    /**
     * Gets the imAddresses property value. The contact's instant messaging (IM) addresses.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getImAddresses() {
        return this.backingStore.get("imAddresses");
    }
    /**
     * Gets the initials property value. The contact's initials.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInitials() {
        return this.backingStore.get("initials");
    }
    /**
     * Gets the isFavorite property value. The isFavorite property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFavorite() {
        return this.backingStore.get("isFavorite");
    }
    /**
     * Gets the jobTitle property value. The contacts job title.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJobTitle() {
        return this.backingStore.get("jobTitle");
    }
    /**
     * Gets the manager property value. The name of the contact's manager.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManager() {
        return this.backingStore.get("manager");
    }
    /**
     * Gets the middleName property value. The contact's middle name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMiddleName() {
        return this.backingStore.get("middleName");
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
     * @return a {@link java.util.List<MultiValueLegacyExtendedProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.backingStore.get("multiValueExtendedProperties");
    }
    /**
     * Gets the nickName property value. The contact's nickname.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNickName() {
        return this.backingStore.get("nickName");
    }
    /**
     * Gets the officeLocation property value. The location of the contact's office.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfficeLocation() {
        return this.backingStore.get("officeLocation");
    }
    /**
     * Gets the parentFolderId property value. The ID of the contact's parent folder.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentFolderId() {
        return this.backingStore.get("parentFolderId");
    }
    /**
     * Gets the personalNotes property value. The user's notes about the contact.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPersonalNotes() {
        return this.backingStore.get("personalNotes");
    }
    /**
     * Gets the phones property value. Phone numbers associated with the contact, for example, home phone, mobile phone, and business phone.
     * @return a {@link java.util.List<Phone>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Phone> getPhones() {
        return this.backingStore.get("phones");
    }
    /**
     * Gets the photo property value. Optional contact picture. You can get or set a photo for a contact.
     * @return a {@link ProfilePhoto}
     */
    @jakarta.annotation.Nullable
    public ProfilePhoto getPhoto() {
        return this.backingStore.get("photo");
    }
    /**
     * Gets the postalAddresses property value. Addresses associated with the contact, for example, home address and business address.
     * @return a {@link java.util.List<PhysicalAddress>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PhysicalAddress> getPostalAddresses() {
        return this.backingStore.get("postalAddresses");
    }
    /**
     * Gets the profession property value. The contact's profession.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProfession() {
        return this.backingStore.get("profession");
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the contact. Read-only. Nullable.
     * @return a {@link java.util.List<SingleValueLegacyExtendedProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.backingStore.get("singleValueExtendedProperties");
    }
    /**
     * Gets the spouseName property value. The name of the contact's spouse/partner.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSpouseName() {
        return this.backingStore.get("spouseName");
    }
    /**
     * Gets the surname property value. The contact's surname.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSurname() {
        return this.backingStore.get("surname");
    }
    /**
     * Gets the title property value. The contact's title.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Gets the websites property value. Web sites associated with the contact.
     * @return a {@link java.util.List<Website>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Website> getWebsites() {
        return this.backingStore.get("websites");
    }
    /**
     * Gets the weddingAnniversary property value. The contact's wedding anniversary.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getWeddingAnniversary() {
        return this.backingStore.get("weddingAnniversary");
    }
    /**
     * Gets the yomiCompanyName property value. The phonetic Japanese company name of the contact.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getYomiCompanyName() {
        return this.backingStore.get("yomiCompanyName");
    }
    /**
     * Gets the yomiGivenName property value. The phonetic Japanese given name (first name) of the contact.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getYomiGivenName() {
        return this.backingStore.get("yomiGivenName");
    }
    /**
     * Gets the yomiSurname property value. The phonetic Japanese surname (last name)  of the contact.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getYomiSurname() {
        return this.backingStore.get("yomiSurname");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assistantName", this.getAssistantName());
        writer.writeOffsetDateTimeValue("birthday", this.getBirthday());
        writer.writeCollectionOfPrimitiveValues("children", this.getChildren());
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("emailAddresses", this.getEmailAddresses());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeStringValue("fileAs", this.getFileAs());
        writer.writeObjectValue("flag", this.getFlag());
        writer.writeStringValue("gender", this.getGender());
        writer.writeStringValue("generation", this.getGeneration());
        writer.writeStringValue("givenName", this.getGivenName());
        writer.writeCollectionOfPrimitiveValues("imAddresses", this.getImAddresses());
        writer.writeStringValue("initials", this.getInitials());
        writer.writeBooleanValue("isFavorite", this.getIsFavorite());
        writer.writeStringValue("jobTitle", this.getJobTitle());
        writer.writeStringValue("manager", this.getManager());
        writer.writeStringValue("middleName", this.getMiddleName());
        writer.writeCollectionOfObjectValues("multiValueExtendedProperties", this.getMultiValueExtendedProperties());
        writer.writeStringValue("nickName", this.getNickName());
        writer.writeStringValue("officeLocation", this.getOfficeLocation());
        writer.writeStringValue("parentFolderId", this.getParentFolderId());
        writer.writeStringValue("personalNotes", this.getPersonalNotes());
        writer.writeCollectionOfObjectValues("phones", this.getPhones());
        writer.writeObjectValue("photo", this.getPhoto());
        writer.writeCollectionOfObjectValues("postalAddresses", this.getPostalAddresses());
        writer.writeStringValue("profession", this.getProfession());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
        writer.writeStringValue("spouseName", this.getSpouseName());
        writer.writeStringValue("surname", this.getSurname());
        writer.writeStringValue("title", this.getTitle());
        writer.writeCollectionOfObjectValues("websites", this.getWebsites());
        writer.writeLocalDateValue("weddingAnniversary", this.getWeddingAnniversary());
        writer.writeStringValue("yomiCompanyName", this.getYomiCompanyName());
        writer.writeStringValue("yomiGivenName", this.getYomiGivenName());
        writer.writeStringValue("yomiSurname", this.getYomiSurname());
    }
    /**
     * Sets the assistantName property value. The name of the contact's assistant.
     * @param value Value to set for the assistantName property.
     */
    public void setAssistantName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assistantName", value);
    }
    /**
     * Sets the birthday property value. The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the birthday property.
     */
    public void setBirthday(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("birthday", value);
    }
    /**
     * Sets the children property value. The names of the contact's children.
     * @param value Value to set for the children property.
     */
    public void setChildren(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("children", value);
    }
    /**
     * Sets the companyName property value. The name of the contact's company.
     * @param value Value to set for the companyName property.
     */
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("companyName", value);
    }
    /**
     * Sets the department property value. The contact's department.
     * @param value Value to set for the department property.
     */
    public void setDepartment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("department", value);
    }
    /**
     * Sets the displayName property value. The contact's display name. You can specify the display name in a create or update operation. Later updates to other properties might cause an automatically generated value to overwrite the displayName value you specified. To preserve a pre-existing value, always include it as displayName in an update operation.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the emailAddresses property value. The contact's email addresses.
     * @param value Value to set for the emailAddresses property.
     */
    public void setEmailAddresses(@jakarta.annotation.Nullable final java.util.List<TypedEmailAddress> value) {
        this.backingStore.set("emailAddresses", value);
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the contact. Nullable.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<Extension> value) {
        this.backingStore.set("extensions", value);
    }
    /**
     * Sets the fileAs property value. The name the contact is filed under.
     * @param value Value to set for the fileAs property.
     */
    public void setFileAs(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileAs", value);
    }
    /**
     * Sets the flag property value. The flag value that indicates the status, start date, due date, or completion date for the contact.
     * @param value Value to set for the flag property.
     */
    public void setFlag(@jakarta.annotation.Nullable final FollowupFlag value) {
        this.backingStore.set("flag", value);
    }
    /**
     * Sets the gender property value. The contact's gender.
     * @param value Value to set for the gender property.
     */
    public void setGender(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("gender", value);
    }
    /**
     * Sets the generation property value. The contact's suffix.
     * @param value Value to set for the generation property.
     */
    public void setGeneration(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("generation", value);
    }
    /**
     * Sets the givenName property value. The contact's given name.
     * @param value Value to set for the givenName property.
     */
    public void setGivenName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("givenName", value);
    }
    /**
     * Sets the imAddresses property value. The contact's instant messaging (IM) addresses.
     * @param value Value to set for the imAddresses property.
     */
    public void setImAddresses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("imAddresses", value);
    }
    /**
     * Sets the initials property value. The contact's initials.
     * @param value Value to set for the initials property.
     */
    public void setInitials(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("initials", value);
    }
    /**
     * Sets the isFavorite property value. The isFavorite property
     * @param value Value to set for the isFavorite property.
     */
    public void setIsFavorite(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isFavorite", value);
    }
    /**
     * Sets the jobTitle property value. The contacts job title.
     * @param value Value to set for the jobTitle property.
     */
    public void setJobTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("jobTitle", value);
    }
    /**
     * Sets the manager property value. The name of the contact's manager.
     * @param value Value to set for the manager property.
     */
    public void setManager(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manager", value);
    }
    /**
     * Sets the middleName property value. The contact's middle name.
     * @param value Value to set for the middleName property.
     */
    public void setMiddleName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("middleName", value);
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     */
    public void setMultiValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.backingStore.set("multiValueExtendedProperties", value);
    }
    /**
     * Sets the nickName property value. The contact's nickname.
     * @param value Value to set for the nickName property.
     */
    public void setNickName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("nickName", value);
    }
    /**
     * Sets the officeLocation property value. The location of the contact's office.
     * @param value Value to set for the officeLocation property.
     */
    public void setOfficeLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("officeLocation", value);
    }
    /**
     * Sets the parentFolderId property value. The ID of the contact's parent folder.
     * @param value Value to set for the parentFolderId property.
     */
    public void setParentFolderId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("parentFolderId", value);
    }
    /**
     * Sets the personalNotes property value. The user's notes about the contact.
     * @param value Value to set for the personalNotes property.
     */
    public void setPersonalNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("personalNotes", value);
    }
    /**
     * Sets the phones property value. Phone numbers associated with the contact, for example, home phone, mobile phone, and business phone.
     * @param value Value to set for the phones property.
     */
    public void setPhones(@jakarta.annotation.Nullable final java.util.List<Phone> value) {
        this.backingStore.set("phones", value);
    }
    /**
     * Sets the photo property value. Optional contact picture. You can get or set a photo for a contact.
     * @param value Value to set for the photo property.
     */
    public void setPhoto(@jakarta.annotation.Nullable final ProfilePhoto value) {
        this.backingStore.set("photo", value);
    }
    /**
     * Sets the postalAddresses property value. Addresses associated with the contact, for example, home address and business address.
     * @param value Value to set for the postalAddresses property.
     */
    public void setPostalAddresses(@jakarta.annotation.Nullable final java.util.List<PhysicalAddress> value) {
        this.backingStore.set("postalAddresses", value);
    }
    /**
     * Sets the profession property value. The contact's profession.
     * @param value Value to set for the profession property.
     */
    public void setProfession(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("profession", value);
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the contact. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     */
    public void setSingleValueExtendedProperties(@jakarta.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.backingStore.set("singleValueExtendedProperties", value);
    }
    /**
     * Sets the spouseName property value. The name of the contact's spouse/partner.
     * @param value Value to set for the spouseName property.
     */
    public void setSpouseName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("spouseName", value);
    }
    /**
     * Sets the surname property value. The contact's surname.
     * @param value Value to set for the surname property.
     */
    public void setSurname(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("surname", value);
    }
    /**
     * Sets the title property value. The contact's title.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
    /**
     * Sets the websites property value. Web sites associated with the contact.
     * @param value Value to set for the websites property.
     */
    public void setWebsites(@jakarta.annotation.Nullable final java.util.List<Website> value) {
        this.backingStore.set("websites", value);
    }
    /**
     * Sets the weddingAnniversary property value. The contact's wedding anniversary.
     * @param value Value to set for the weddingAnniversary property.
     */
    public void setWeddingAnniversary(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("weddingAnniversary", value);
    }
    /**
     * Sets the yomiCompanyName property value. The phonetic Japanese company name of the contact.
     * @param value Value to set for the yomiCompanyName property.
     */
    public void setYomiCompanyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("yomiCompanyName", value);
    }
    /**
     * Sets the yomiGivenName property value. The phonetic Japanese given name (first name) of the contact.
     * @param value Value to set for the yomiGivenName property.
     */
    public void setYomiGivenName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("yomiGivenName", value);
    }
    /**
     * Sets the yomiSurname property value. The phonetic Japanese surname (last name)  of the contact.
     * @param value Value to set for the yomiSurname property.
     */
    public void setYomiSurname(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("yomiSurname", value);
    }
}
