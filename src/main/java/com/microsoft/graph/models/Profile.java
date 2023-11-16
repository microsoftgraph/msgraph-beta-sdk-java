package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Profile extends Entity implements Parsable {
    /**
     * Instantiates a new Profile and sets the default values.
     */
    public Profile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Profile
     */
    @jakarta.annotation.Nonnull
    public static Profile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Profile();
    }
    /**
     * Gets the account property value. The account property
     * @return a java.util.List<UserAccountInformation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserAccountInformation> getAccount() {
        return this.BackingStore.get("account");
    }
    /**
     * Gets the addresses property value. Represents details of addresses associated with the user.
     * @return a java.util.List<ItemAddress>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemAddress> getAddresses() {
        return this.BackingStore.get("addresses");
    }
    /**
     * Gets the anniversaries property value. Represents the details of meaningful dates associated with a person.
     * @return a java.util.List<PersonAnnualEvent>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PersonAnnualEvent> getAnniversaries() {
        return this.BackingStore.get("anniversaries");
    }
    /**
     * Gets the awards property value. Represents the details of awards or honors associated with a person.
     * @return a java.util.List<PersonAward>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PersonAward> getAwards() {
        return this.BackingStore.get("awards");
    }
    /**
     * Gets the certifications property value. Represents the details of certifications associated with a person.
     * @return a java.util.List<PersonCertification>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PersonCertification> getCertifications() {
        return this.BackingStore.get("certifications");
    }
    /**
     * Gets the educationalActivities property value. Represents data that a user has supplied related to undergraduate, graduate, postgraduate or other educational activities.
     * @return a java.util.List<EducationalActivity>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EducationalActivity> getEducationalActivities() {
        return this.BackingStore.get("educationalActivities");
    }
    /**
     * Gets the emails property value. Represents detailed information about email addresses associated with the user.
     * @return a java.util.List<ItemEmail>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemEmail> getEmails() {
        return this.BackingStore.get("emails");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("account", (n) -> { this.setAccount(n.getCollectionOfObjectValues(UserAccountInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("addresses", (n) -> { this.setAddresses(n.getCollectionOfObjectValues(ItemAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("anniversaries", (n) -> { this.setAnniversaries(n.getCollectionOfObjectValues(PersonAnnualEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("awards", (n) -> { this.setAwards(n.getCollectionOfObjectValues(PersonAward::createFromDiscriminatorValue)); });
        deserializerMap.put("certifications", (n) -> { this.setCertifications(n.getCollectionOfObjectValues(PersonCertification::createFromDiscriminatorValue)); });
        deserializerMap.put("educationalActivities", (n) -> { this.setEducationalActivities(n.getCollectionOfObjectValues(EducationalActivity::createFromDiscriminatorValue)); });
        deserializerMap.put("emails", (n) -> { this.setEmails(n.getCollectionOfObjectValues(ItemEmail::createFromDiscriminatorValue)); });
        deserializerMap.put("interests", (n) -> { this.setInterests(n.getCollectionOfObjectValues(PersonInterest::createFromDiscriminatorValue)); });
        deserializerMap.put("languages", (n) -> { this.setLanguages(n.getCollectionOfObjectValues(LanguageProficiency::createFromDiscriminatorValue)); });
        deserializerMap.put("names", (n) -> { this.setNames(n.getCollectionOfObjectValues(PersonName::createFromDiscriminatorValue)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getCollectionOfObjectValues(PersonAnnotation::createFromDiscriminatorValue)); });
        deserializerMap.put("patents", (n) -> { this.setPatents(n.getCollectionOfObjectValues(ItemPatent::createFromDiscriminatorValue)); });
        deserializerMap.put("phones", (n) -> { this.setPhones(n.getCollectionOfObjectValues(ItemPhone::createFromDiscriminatorValue)); });
        deserializerMap.put("positions", (n) -> { this.setPositions(n.getCollectionOfObjectValues(WorkPosition::createFromDiscriminatorValue)); });
        deserializerMap.put("projects", (n) -> { this.setProjects(n.getCollectionOfObjectValues(ProjectParticipation::createFromDiscriminatorValue)); });
        deserializerMap.put("publications", (n) -> { this.setPublications(n.getCollectionOfObjectValues(ItemPublication::createFromDiscriminatorValue)); });
        deserializerMap.put("skills", (n) -> { this.setSkills(n.getCollectionOfObjectValues(SkillProficiency::createFromDiscriminatorValue)); });
        deserializerMap.put("webAccounts", (n) -> { this.setWebAccounts(n.getCollectionOfObjectValues(WebAccount::createFromDiscriminatorValue)); });
        deserializerMap.put("websites", (n) -> { this.setWebsites(n.getCollectionOfObjectValues(PersonWebsite::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the interests property value. Provides detailed information about interests the user has associated with themselves in various services.
     * @return a java.util.List<PersonInterest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PersonInterest> getInterests() {
        return this.BackingStore.get("interests");
    }
    /**
     * Gets the languages property value. Represents detailed information about languages that a user has added to their profile.
     * @return a java.util.List<LanguageProficiency>
     */
    @jakarta.annotation.Nullable
    public java.util.List<LanguageProficiency> getLanguages() {
        return this.BackingStore.get("languages");
    }
    /**
     * Gets the names property value. Represents the names a user has added to their profile.
     * @return a java.util.List<PersonName>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PersonName> getNames() {
        return this.BackingStore.get("names");
    }
    /**
     * Gets the notes property value. Represents notes that a user has added to their profile.
     * @return a java.util.List<PersonAnnotation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PersonAnnotation> getNotes() {
        return this.BackingStore.get("notes");
    }
    /**
     * Gets the patents property value. Represents patents that a user has added to their profile.
     * @return a java.util.List<ItemPatent>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemPatent> getPatents() {
        return this.BackingStore.get("patents");
    }
    /**
     * Gets the phones property value. Represents detailed information about phone numbers associated with a user in various services.
     * @return a java.util.List<ItemPhone>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemPhone> getPhones() {
        return this.BackingStore.get("phones");
    }
    /**
     * Gets the positions property value. Represents detailed information about work positions associated with a user's profile.
     * @return a java.util.List<WorkPosition>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WorkPosition> getPositions() {
        return this.BackingStore.get("positions");
    }
    /**
     * Gets the projects property value. Represents detailed information about projects associated with a user.
     * @return a java.util.List<ProjectParticipation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProjectParticipation> getProjects() {
        return this.BackingStore.get("projects");
    }
    /**
     * Gets the publications property value. Represents details of any publications a user has added to their profile.
     * @return a java.util.List<ItemPublication>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemPublication> getPublications() {
        return this.BackingStore.get("publications");
    }
    /**
     * Gets the skills property value. Represents detailed information about skills associated with a user in various services.
     * @return a java.util.List<SkillProficiency>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SkillProficiency> getSkills() {
        return this.BackingStore.get("skills");
    }
    /**
     * Gets the webAccounts property value. Represents web accounts the user has indicated they use or has added to their user profile.
     * @return a java.util.List<WebAccount>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WebAccount> getWebAccounts() {
        return this.BackingStore.get("webAccounts");
    }
    /**
     * Gets the websites property value. Represents detailed information about websites associated with a user in various services.
     * @return a java.util.List<PersonWebsite>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PersonWebsite> getWebsites() {
        return this.BackingStore.get("websites");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("account", this.getAccount());
        writer.writeCollectionOfObjectValues("addresses", this.getAddresses());
        writer.writeCollectionOfObjectValues("anniversaries", this.getAnniversaries());
        writer.writeCollectionOfObjectValues("awards", this.getAwards());
        writer.writeCollectionOfObjectValues("certifications", this.getCertifications());
        writer.writeCollectionOfObjectValues("educationalActivities", this.getEducationalActivities());
        writer.writeCollectionOfObjectValues("emails", this.getEmails());
        writer.writeCollectionOfObjectValues("interests", this.getInterests());
        writer.writeCollectionOfObjectValues("languages", this.getLanguages());
        writer.writeCollectionOfObjectValues("names", this.getNames());
        writer.writeCollectionOfObjectValues("notes", this.getNotes());
        writer.writeCollectionOfObjectValues("patents", this.getPatents());
        writer.writeCollectionOfObjectValues("phones", this.getPhones());
        writer.writeCollectionOfObjectValues("positions", this.getPositions());
        writer.writeCollectionOfObjectValues("projects", this.getProjects());
        writer.writeCollectionOfObjectValues("publications", this.getPublications());
        writer.writeCollectionOfObjectValues("skills", this.getSkills());
        writer.writeCollectionOfObjectValues("webAccounts", this.getWebAccounts());
        writer.writeCollectionOfObjectValues("websites", this.getWebsites());
    }
    /**
     * Sets the account property value. The account property
     * @param value Value to set for the account property.
     */
    public void setAccount(@jakarta.annotation.Nullable final java.util.List<UserAccountInformation> value) {
        this.BackingStore.set("account", value);
    }
    /**
     * Sets the addresses property value. Represents details of addresses associated with the user.
     * @param value Value to set for the addresses property.
     */
    public void setAddresses(@jakarta.annotation.Nullable final java.util.List<ItemAddress> value) {
        this.BackingStore.set("addresses", value);
    }
    /**
     * Sets the anniversaries property value. Represents the details of meaningful dates associated with a person.
     * @param value Value to set for the anniversaries property.
     */
    public void setAnniversaries(@jakarta.annotation.Nullable final java.util.List<PersonAnnualEvent> value) {
        this.BackingStore.set("anniversaries", value);
    }
    /**
     * Sets the awards property value. Represents the details of awards or honors associated with a person.
     * @param value Value to set for the awards property.
     */
    public void setAwards(@jakarta.annotation.Nullable final java.util.List<PersonAward> value) {
        this.BackingStore.set("awards", value);
    }
    /**
     * Sets the certifications property value. Represents the details of certifications associated with a person.
     * @param value Value to set for the certifications property.
     */
    public void setCertifications(@jakarta.annotation.Nullable final java.util.List<PersonCertification> value) {
        this.BackingStore.set("certifications", value);
    }
    /**
     * Sets the educationalActivities property value. Represents data that a user has supplied related to undergraduate, graduate, postgraduate or other educational activities.
     * @param value Value to set for the educationalActivities property.
     */
    public void setEducationalActivities(@jakarta.annotation.Nullable final java.util.List<EducationalActivity> value) {
        this.BackingStore.set("educationalActivities", value);
    }
    /**
     * Sets the emails property value. Represents detailed information about email addresses associated with the user.
     * @param value Value to set for the emails property.
     */
    public void setEmails(@jakarta.annotation.Nullable final java.util.List<ItemEmail> value) {
        this.BackingStore.set("emails", value);
    }
    /**
     * Sets the interests property value. Provides detailed information about interests the user has associated with themselves in various services.
     * @param value Value to set for the interests property.
     */
    public void setInterests(@jakarta.annotation.Nullable final java.util.List<PersonInterest> value) {
        this.BackingStore.set("interests", value);
    }
    /**
     * Sets the languages property value. Represents detailed information about languages that a user has added to their profile.
     * @param value Value to set for the languages property.
     */
    public void setLanguages(@jakarta.annotation.Nullable final java.util.List<LanguageProficiency> value) {
        this.BackingStore.set("languages", value);
    }
    /**
     * Sets the names property value. Represents the names a user has added to their profile.
     * @param value Value to set for the names property.
     */
    public void setNames(@jakarta.annotation.Nullable final java.util.List<PersonName> value) {
        this.BackingStore.set("names", value);
    }
    /**
     * Sets the notes property value. Represents notes that a user has added to their profile.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final java.util.List<PersonAnnotation> value) {
        this.BackingStore.set("notes", value);
    }
    /**
     * Sets the patents property value. Represents patents that a user has added to their profile.
     * @param value Value to set for the patents property.
     */
    public void setPatents(@jakarta.annotation.Nullable final java.util.List<ItemPatent> value) {
        this.BackingStore.set("patents", value);
    }
    /**
     * Sets the phones property value. Represents detailed information about phone numbers associated with a user in various services.
     * @param value Value to set for the phones property.
     */
    public void setPhones(@jakarta.annotation.Nullable final java.util.List<ItemPhone> value) {
        this.BackingStore.set("phones", value);
    }
    /**
     * Sets the positions property value. Represents detailed information about work positions associated with a user's profile.
     * @param value Value to set for the positions property.
     */
    public void setPositions(@jakarta.annotation.Nullable final java.util.List<WorkPosition> value) {
        this.BackingStore.set("positions", value);
    }
    /**
     * Sets the projects property value. Represents detailed information about projects associated with a user.
     * @param value Value to set for the projects property.
     */
    public void setProjects(@jakarta.annotation.Nullable final java.util.List<ProjectParticipation> value) {
        this.BackingStore.set("projects", value);
    }
    /**
     * Sets the publications property value. Represents details of any publications a user has added to their profile.
     * @param value Value to set for the publications property.
     */
    public void setPublications(@jakarta.annotation.Nullable final java.util.List<ItemPublication> value) {
        this.BackingStore.set("publications", value);
    }
    /**
     * Sets the skills property value. Represents detailed information about skills associated with a user in various services.
     * @param value Value to set for the skills property.
     */
    public void setSkills(@jakarta.annotation.Nullable final java.util.List<SkillProficiency> value) {
        this.BackingStore.set("skills", value);
    }
    /**
     * Sets the webAccounts property value. Represents web accounts the user has indicated they use or has added to their user profile.
     * @param value Value to set for the webAccounts property.
     */
    public void setWebAccounts(@jakarta.annotation.Nullable final java.util.List<WebAccount> value) {
        this.BackingStore.set("webAccounts", value);
    }
    /**
     * Sets the websites property value. Represents detailed information about websites associated with a user in various services.
     * @param value Value to set for the websites property.
     */
    public void setWebsites(@jakarta.annotation.Nullable final java.util.List<PersonWebsite> value) {
        this.BackingStore.set("websites", value);
    }
}
