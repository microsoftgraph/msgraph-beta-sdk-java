package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Person extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Person} and sets the default values.
     */
    public Person() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Person}
     */
    @jakarta.annotation.Nonnull
    public static Person createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Person();
    }
    /**
     * Gets the birthday property value. The person&apos;s birthday.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBirthday() {
        return this.backingStore.get("birthday");
    }
    /**
     * Gets the companyName property value. The name of the person&apos;s company.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.backingStore.get("companyName");
    }
    /**
     * Gets the department property value. The person&apos;s department.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDepartment() {
        return this.backingStore.get("department");
    }
    /**
     * Gets the displayName property value. The person&apos;s display name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the emailAddresses property value. The person&apos;s email addresses.
     * @return a {@link java.util.List<RankedEmailAddress>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RankedEmailAddress> getEmailAddresses() {
        return this.backingStore.get("emailAddresses");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("birthday", (n) -> { this.setBirthday(n.getStringValue()); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("department", (n) -> { this.setDepartment(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("emailAddresses", (n) -> { this.setEmailAddresses(n.getCollectionOfObjectValues(RankedEmailAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("givenName", (n) -> { this.setGivenName(n.getStringValue()); });
        deserializerMap.put("isFavorite", (n) -> { this.setIsFavorite(n.getBooleanValue()); });
        deserializerMap.put("mailboxType", (n) -> { this.setMailboxType(n.getStringValue()); });
        deserializerMap.put("officeLocation", (n) -> { this.setOfficeLocation(n.getStringValue()); });
        deserializerMap.put("personNotes", (n) -> { this.setPersonNotes(n.getStringValue()); });
        deserializerMap.put("personType", (n) -> { this.setPersonType(n.getStringValue()); });
        deserializerMap.put("phones", (n) -> { this.setPhones(n.getCollectionOfObjectValues(Phone::createFromDiscriminatorValue)); });
        deserializerMap.put("postalAddresses", (n) -> { this.setPostalAddresses(n.getCollectionOfObjectValues(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("profession", (n) -> { this.setProfession(n.getStringValue()); });
        deserializerMap.put("sources", (n) -> { this.setSources(n.getCollectionOfObjectValues(PersonDataSource::createFromDiscriminatorValue)); });
        deserializerMap.put("surname", (n) -> { this.setSurname(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("websites", (n) -> { this.setWebsites(n.getCollectionOfObjectValues(Website::createFromDiscriminatorValue)); });
        deserializerMap.put("yomiCompany", (n) -> { this.setYomiCompany(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the givenName property value. The person&apos;s given name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGivenName() {
        return this.backingStore.get("givenName");
    }
    /**
     * Gets the isFavorite property value. True if the user has flagged this person as a favorite.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFavorite() {
        return this.backingStore.get("isFavorite");
    }
    /**
     * Gets the mailboxType property value. The type of mailbox that is represented by the person&apos;s email address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMailboxType() {
        return this.backingStore.get("mailboxType");
    }
    /**
     * Gets the officeLocation property value. The location of the person&apos;s office.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOfficeLocation() {
        return this.backingStore.get("officeLocation");
    }
    /**
     * Gets the personNotes property value. Free-form notes that the user has taken about this person.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPersonNotes() {
        return this.backingStore.get("personNotes");
    }
    /**
     * Gets the personType property value. The type of person, for example distribution list.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPersonType() {
        return this.backingStore.get("personType");
    }
    /**
     * Gets the phones property value. The person&apos;s phone numbers.
     * @return a {@link java.util.List<Phone>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Phone> getPhones() {
        return this.backingStore.get("phones");
    }
    /**
     * Gets the postalAddresses property value. The person&apos;s addresses.
     * @return a {@link java.util.List<Location>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Location> getPostalAddresses() {
        return this.backingStore.get("postalAddresses");
    }
    /**
     * Gets the profession property value. The person&apos;s profession.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProfession() {
        return this.backingStore.get("profession");
    }
    /**
     * Gets the sources property value. The sources the user data comes from, for example Directory or Outlook Contacts.
     * @return a {@link java.util.List<PersonDataSource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PersonDataSource> getSources() {
        return this.backingStore.get("sources");
    }
    /**
     * Gets the surname property value. The person&apos;s surname.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSurname() {
        return this.backingStore.get("surname");
    }
    /**
     * Gets the title property value. The person&apos;s title.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the person. The UPN is an Internet-style login name for the person based on the Internet standard RFC 822. By convention, this should map to the person&apos;s email name. The general format is alias@domain.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Gets the websites property value. The person&apos;s websites.
     * @return a {@link java.util.List<Website>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Website> getWebsites() {
        return this.backingStore.get("websites");
    }
    /**
     * Gets the yomiCompany property value. The phonetic Japanese name of the person&apos;s company.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getYomiCompany() {
        return this.backingStore.get("yomiCompany");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("birthday", this.getBirthday());
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeStringValue("department", this.getDepartment());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("emailAddresses", this.getEmailAddresses());
        writer.writeStringValue("givenName", this.getGivenName());
        writer.writeBooleanValue("isFavorite", this.getIsFavorite());
        writer.writeStringValue("mailboxType", this.getMailboxType());
        writer.writeStringValue("officeLocation", this.getOfficeLocation());
        writer.writeStringValue("personNotes", this.getPersonNotes());
        writer.writeStringValue("personType", this.getPersonType());
        writer.writeCollectionOfObjectValues("phones", this.getPhones());
        writer.writeCollectionOfObjectValues("postalAddresses", this.getPostalAddresses());
        writer.writeStringValue("profession", this.getProfession());
        writer.writeCollectionOfObjectValues("sources", this.getSources());
        writer.writeStringValue("surname", this.getSurname());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
        writer.writeCollectionOfObjectValues("websites", this.getWebsites());
        writer.writeStringValue("yomiCompany", this.getYomiCompany());
    }
    /**
     * Sets the birthday property value. The person&apos;s birthday.
     * @param value Value to set for the birthday property.
     */
    public void setBirthday(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("birthday", value);
    }
    /**
     * Sets the companyName property value. The name of the person&apos;s company.
     * @param value Value to set for the companyName property.
     */
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("companyName", value);
    }
    /**
     * Sets the department property value. The person&apos;s department.
     * @param value Value to set for the department property.
     */
    public void setDepartment(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("department", value);
    }
    /**
     * Sets the displayName property value. The person&apos;s display name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the emailAddresses property value. The person&apos;s email addresses.
     * @param value Value to set for the emailAddresses property.
     */
    public void setEmailAddresses(@jakarta.annotation.Nullable final java.util.List<RankedEmailAddress> value) {
        this.backingStore.set("emailAddresses", value);
    }
    /**
     * Sets the givenName property value. The person&apos;s given name.
     * @param value Value to set for the givenName property.
     */
    public void setGivenName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("givenName", value);
    }
    /**
     * Sets the isFavorite property value. True if the user has flagged this person as a favorite.
     * @param value Value to set for the isFavorite property.
     */
    public void setIsFavorite(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isFavorite", value);
    }
    /**
     * Sets the mailboxType property value. The type of mailbox that is represented by the person&apos;s email address.
     * @param value Value to set for the mailboxType property.
     */
    public void setMailboxType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mailboxType", value);
    }
    /**
     * Sets the officeLocation property value. The location of the person&apos;s office.
     * @param value Value to set for the officeLocation property.
     */
    public void setOfficeLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("officeLocation", value);
    }
    /**
     * Sets the personNotes property value. Free-form notes that the user has taken about this person.
     * @param value Value to set for the personNotes property.
     */
    public void setPersonNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("personNotes", value);
    }
    /**
     * Sets the personType property value. The type of person, for example distribution list.
     * @param value Value to set for the personType property.
     */
    public void setPersonType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("personType", value);
    }
    /**
     * Sets the phones property value. The person&apos;s phone numbers.
     * @param value Value to set for the phones property.
     */
    public void setPhones(@jakarta.annotation.Nullable final java.util.List<Phone> value) {
        this.backingStore.set("phones", value);
    }
    /**
     * Sets the postalAddresses property value. The person&apos;s addresses.
     * @param value Value to set for the postalAddresses property.
     */
    public void setPostalAddresses(@jakarta.annotation.Nullable final java.util.List<Location> value) {
        this.backingStore.set("postalAddresses", value);
    }
    /**
     * Sets the profession property value. The person&apos;s profession.
     * @param value Value to set for the profession property.
     */
    public void setProfession(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("profession", value);
    }
    /**
     * Sets the sources property value. The sources the user data comes from, for example Directory or Outlook Contacts.
     * @param value Value to set for the sources property.
     */
    public void setSources(@jakarta.annotation.Nullable final java.util.List<PersonDataSource> value) {
        this.backingStore.set("sources", value);
    }
    /**
     * Sets the surname property value. The person&apos;s surname.
     * @param value Value to set for the surname property.
     */
    public void setSurname(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("surname", value);
    }
    /**
     * Sets the title property value. The person&apos;s title.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the person. The UPN is an Internet-style login name for the person based on the Internet standard RFC 822. By convention, this should map to the person&apos;s email name. The general format is alias@domain.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
    /**
     * Sets the websites property value. The person&apos;s websites.
     * @param value Value to set for the websites property.
     */
    public void setWebsites(@jakarta.annotation.Nullable final java.util.List<Website> value) {
        this.backingStore.set("websites", value);
    }
    /**
     * Sets the yomiCompany property value. The phonetic Japanese name of the person&apos;s company.
     * @param value Value to set for the yomiCompany property.
     */
    public void setYomiCompany(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("yomiCompany", value);
    }
}
