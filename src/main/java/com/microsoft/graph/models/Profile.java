package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Profile extends Entity implements Parsable {
    /** The account property */
    private java.util.List<UserAccountInformation> _account;
    /** Represents details of addresses associated with the user. */
    private java.util.List<ItemAddress> _addresses;
    /** Represents the details of meaningful dates associated with a person. */
    private java.util.List<PersonAnnualEvent> _anniversaries;
    /** Represents the details of awards or honors associated with a person. */
    private java.util.List<PersonAward> _awards;
    /** Represents the details of certifications associated with a person. */
    private java.util.List<PersonCertification> _certifications;
    /** Represents data that a user has supplied related to undergraduate, graduate, postgraduate or other educational activities. */
    private java.util.List<EducationalActivity> _educationalActivities;
    /** Represents detailed information about email addresses associated with the user. */
    private java.util.List<ItemEmail> _emails;
    /** Provides detailed information about interests the user has associated with themselves in various services. */
    private java.util.List<PersonInterest> _interests;
    /** Represents detailed information about languages that a user has added to their profile. */
    private java.util.List<LanguageProficiency> _languages;
    /** Represents the names a user has added to their profile. */
    private java.util.List<PersonName> _names;
    /** Represents notes that a user has added to their profile. */
    private java.util.List<PersonAnnotation> _notes;
    /** Represents patents that a user has added to their profile. */
    private java.util.List<ItemPatent> _patents;
    /** Represents detailed information about phone numbers associated with a user in various services. */
    private java.util.List<ItemPhone> _phones;
    /** Represents detailed information about work positions associated with a user's profile. */
    private java.util.List<WorkPosition> _positions;
    /** Represents detailed information about projects associated with a user. */
    private java.util.List<ProjectParticipation> _projects;
    /** Represents details of any publications a user has added to their profile. */
    private java.util.List<ItemPublication> _publications;
    /** Represents detailed information about skills associated with a user in various services. */
    private java.util.List<SkillProficiency> _skills;
    /** Represents web accounts the user has indicated they use or has added to their user profile. */
    private java.util.List<WebAccount> _webAccounts;
    /** Represents detailed information about websites associated with a user in various services. */
    private java.util.List<PersonWebsite> _websites;
    /**
     * Instantiates a new profile and sets the default values.
     * @return a void
     */
    public Profile() {
        super();
        this.setOdataType("#microsoft.graph.profile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a profile
     */
    @javax.annotation.Nonnull
    public static Profile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Profile();
    }
    /**
     * Gets the account property value. The account property
     * @return a userAccountInformation
     */
    @javax.annotation.Nullable
    public java.util.List<UserAccountInformation> getAccount() {
        return this._account;
    }
    /**
     * Gets the addresses property value. Represents details of addresses associated with the user.
     * @return a itemAddress
     */
    @javax.annotation.Nullable
    public java.util.List<ItemAddress> getAddresses() {
        return this._addresses;
    }
    /**
     * Gets the anniversaries property value. Represents the details of meaningful dates associated with a person.
     * @return a personAnnualEvent
     */
    @javax.annotation.Nullable
    public java.util.List<PersonAnnualEvent> getAnniversaries() {
        return this._anniversaries;
    }
    /**
     * Gets the awards property value. Represents the details of awards or honors associated with a person.
     * @return a personAward
     */
    @javax.annotation.Nullable
    public java.util.List<PersonAward> getAwards() {
        return this._awards;
    }
    /**
     * Gets the certifications property value. Represents the details of certifications associated with a person.
     * @return a personCertification
     */
    @javax.annotation.Nullable
    public java.util.List<PersonCertification> getCertifications() {
        return this._certifications;
    }
    /**
     * Gets the educationalActivities property value. Represents data that a user has supplied related to undergraduate, graduate, postgraduate or other educational activities.
     * @return a educationalActivity
     */
    @javax.annotation.Nullable
    public java.util.List<EducationalActivity> getEducationalActivities() {
        return this._educationalActivities;
    }
    /**
     * Gets the emails property value. Represents detailed information about email addresses associated with the user.
     * @return a itemEmail
     */
    @javax.annotation.Nullable
    public java.util.List<ItemEmail> getEmails() {
        return this._emails;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Profile currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("account", (n) -> { currentObject.setAccount(n.getCollectionOfObjectValues(UserAccountInformation::createFromDiscriminatorValue)); });
            this.put("addresses", (n) -> { currentObject.setAddresses(n.getCollectionOfObjectValues(ItemAddress::createFromDiscriminatorValue)); });
            this.put("anniversaries", (n) -> { currentObject.setAnniversaries(n.getCollectionOfObjectValues(PersonAnnualEvent::createFromDiscriminatorValue)); });
            this.put("awards", (n) -> { currentObject.setAwards(n.getCollectionOfObjectValues(PersonAward::createFromDiscriminatorValue)); });
            this.put("certifications", (n) -> { currentObject.setCertifications(n.getCollectionOfObjectValues(PersonCertification::createFromDiscriminatorValue)); });
            this.put("educationalActivities", (n) -> { currentObject.setEducationalActivities(n.getCollectionOfObjectValues(EducationalActivity::createFromDiscriminatorValue)); });
            this.put("emails", (n) -> { currentObject.setEmails(n.getCollectionOfObjectValues(ItemEmail::createFromDiscriminatorValue)); });
            this.put("interests", (n) -> { currentObject.setInterests(n.getCollectionOfObjectValues(PersonInterest::createFromDiscriminatorValue)); });
            this.put("languages", (n) -> { currentObject.setLanguages(n.getCollectionOfObjectValues(LanguageProficiency::createFromDiscriminatorValue)); });
            this.put("names", (n) -> { currentObject.setNames(n.getCollectionOfObjectValues(PersonName::createFromDiscriminatorValue)); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getCollectionOfObjectValues(PersonAnnotation::createFromDiscriminatorValue)); });
            this.put("patents", (n) -> { currentObject.setPatents(n.getCollectionOfObjectValues(ItemPatent::createFromDiscriminatorValue)); });
            this.put("phones", (n) -> { currentObject.setPhones(n.getCollectionOfObjectValues(ItemPhone::createFromDiscriminatorValue)); });
            this.put("positions", (n) -> { currentObject.setPositions(n.getCollectionOfObjectValues(WorkPosition::createFromDiscriminatorValue)); });
            this.put("projects", (n) -> { currentObject.setProjects(n.getCollectionOfObjectValues(ProjectParticipation::createFromDiscriminatorValue)); });
            this.put("publications", (n) -> { currentObject.setPublications(n.getCollectionOfObjectValues(ItemPublication::createFromDiscriminatorValue)); });
            this.put("skills", (n) -> { currentObject.setSkills(n.getCollectionOfObjectValues(SkillProficiency::createFromDiscriminatorValue)); });
            this.put("webAccounts", (n) -> { currentObject.setWebAccounts(n.getCollectionOfObjectValues(WebAccount::createFromDiscriminatorValue)); });
            this.put("websites", (n) -> { currentObject.setWebsites(n.getCollectionOfObjectValues(PersonWebsite::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the interests property value. Provides detailed information about interests the user has associated with themselves in various services.
     * @return a personInterest
     */
    @javax.annotation.Nullable
    public java.util.List<PersonInterest> getInterests() {
        return this._interests;
    }
    /**
     * Gets the languages property value. Represents detailed information about languages that a user has added to their profile.
     * @return a languageProficiency
     */
    @javax.annotation.Nullable
    public java.util.List<LanguageProficiency> getLanguages() {
        return this._languages;
    }
    /**
     * Gets the names property value. Represents the names a user has added to their profile.
     * @return a personName
     */
    @javax.annotation.Nullable
    public java.util.List<PersonName> getNames() {
        return this._names;
    }
    /**
     * Gets the notes property value. Represents notes that a user has added to their profile.
     * @return a personAnnotation
     */
    @javax.annotation.Nullable
    public java.util.List<PersonAnnotation> getNotes() {
        return this._notes;
    }
    /**
     * Gets the patents property value. Represents patents that a user has added to their profile.
     * @return a itemPatent
     */
    @javax.annotation.Nullable
    public java.util.List<ItemPatent> getPatents() {
        return this._patents;
    }
    /**
     * Gets the phones property value. Represents detailed information about phone numbers associated with a user in various services.
     * @return a itemPhone
     */
    @javax.annotation.Nullable
    public java.util.List<ItemPhone> getPhones() {
        return this._phones;
    }
    /**
     * Gets the positions property value. Represents detailed information about work positions associated with a user's profile.
     * @return a workPosition
     */
    @javax.annotation.Nullable
    public java.util.List<WorkPosition> getPositions() {
        return this._positions;
    }
    /**
     * Gets the projects property value. Represents detailed information about projects associated with a user.
     * @return a projectParticipation
     */
    @javax.annotation.Nullable
    public java.util.List<ProjectParticipation> getProjects() {
        return this._projects;
    }
    /**
     * Gets the publications property value. Represents details of any publications a user has added to their profile.
     * @return a itemPublication
     */
    @javax.annotation.Nullable
    public java.util.List<ItemPublication> getPublications() {
        return this._publications;
    }
    /**
     * Gets the skills property value. Represents detailed information about skills associated with a user in various services.
     * @return a skillProficiency
     */
    @javax.annotation.Nullable
    public java.util.List<SkillProficiency> getSkills() {
        return this._skills;
    }
    /**
     * Gets the webAccounts property value. Represents web accounts the user has indicated they use or has added to their user profile.
     * @return a webAccount
     */
    @javax.annotation.Nullable
    public java.util.List<WebAccount> getWebAccounts() {
        return this._webAccounts;
    }
    /**
     * Gets the websites property value. Represents detailed information about websites associated with a user in various services.
     * @return a personWebsite
     */
    @javax.annotation.Nullable
    public java.util.List<PersonWebsite> getWebsites() {
        return this._websites;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    public void setAccount(@javax.annotation.Nullable final java.util.List<UserAccountInformation> value) {
        this._account = value;
    }
    /**
     * Sets the addresses property value. Represents details of addresses associated with the user.
     * @param value Value to set for the addresses property.
     * @return a void
     */
    public void setAddresses(@javax.annotation.Nullable final java.util.List<ItemAddress> value) {
        this._addresses = value;
    }
    /**
     * Sets the anniversaries property value. Represents the details of meaningful dates associated with a person.
     * @param value Value to set for the anniversaries property.
     * @return a void
     */
    public void setAnniversaries(@javax.annotation.Nullable final java.util.List<PersonAnnualEvent> value) {
        this._anniversaries = value;
    }
    /**
     * Sets the awards property value. Represents the details of awards or honors associated with a person.
     * @param value Value to set for the awards property.
     * @return a void
     */
    public void setAwards(@javax.annotation.Nullable final java.util.List<PersonAward> value) {
        this._awards = value;
    }
    /**
     * Sets the certifications property value. Represents the details of certifications associated with a person.
     * @param value Value to set for the certifications property.
     * @return a void
     */
    public void setCertifications(@javax.annotation.Nullable final java.util.List<PersonCertification> value) {
        this._certifications = value;
    }
    /**
     * Sets the educationalActivities property value. Represents data that a user has supplied related to undergraduate, graduate, postgraduate or other educational activities.
     * @param value Value to set for the educationalActivities property.
     * @return a void
     */
    public void setEducationalActivities(@javax.annotation.Nullable final java.util.List<EducationalActivity> value) {
        this._educationalActivities = value;
    }
    /**
     * Sets the emails property value. Represents detailed information about email addresses associated with the user.
     * @param value Value to set for the emails property.
     * @return a void
     */
    public void setEmails(@javax.annotation.Nullable final java.util.List<ItemEmail> value) {
        this._emails = value;
    }
    /**
     * Sets the interests property value. Provides detailed information about interests the user has associated with themselves in various services.
     * @param value Value to set for the interests property.
     * @return a void
     */
    public void setInterests(@javax.annotation.Nullable final java.util.List<PersonInterest> value) {
        this._interests = value;
    }
    /**
     * Sets the languages property value. Represents detailed information about languages that a user has added to their profile.
     * @param value Value to set for the languages property.
     * @return a void
     */
    public void setLanguages(@javax.annotation.Nullable final java.util.List<LanguageProficiency> value) {
        this._languages = value;
    }
    /**
     * Sets the names property value. Represents the names a user has added to their profile.
     * @param value Value to set for the names property.
     * @return a void
     */
    public void setNames(@javax.annotation.Nullable final java.util.List<PersonName> value) {
        this._names = value;
    }
    /**
     * Sets the notes property value. Represents notes that a user has added to their profile.
     * @param value Value to set for the notes property.
     * @return a void
     */
    public void setNotes(@javax.annotation.Nullable final java.util.List<PersonAnnotation> value) {
        this._notes = value;
    }
    /**
     * Sets the patents property value. Represents patents that a user has added to their profile.
     * @param value Value to set for the patents property.
     * @return a void
     */
    public void setPatents(@javax.annotation.Nullable final java.util.List<ItemPatent> value) {
        this._patents = value;
    }
    /**
     * Sets the phones property value. Represents detailed information about phone numbers associated with a user in various services.
     * @param value Value to set for the phones property.
     * @return a void
     */
    public void setPhones(@javax.annotation.Nullable final java.util.List<ItemPhone> value) {
        this._phones = value;
    }
    /**
     * Sets the positions property value. Represents detailed information about work positions associated with a user's profile.
     * @param value Value to set for the positions property.
     * @return a void
     */
    public void setPositions(@javax.annotation.Nullable final java.util.List<WorkPosition> value) {
        this._positions = value;
    }
    /**
     * Sets the projects property value. Represents detailed information about projects associated with a user.
     * @param value Value to set for the projects property.
     * @return a void
     */
    public void setProjects(@javax.annotation.Nullable final java.util.List<ProjectParticipation> value) {
        this._projects = value;
    }
    /**
     * Sets the publications property value. Represents details of any publications a user has added to their profile.
     * @param value Value to set for the publications property.
     * @return a void
     */
    public void setPublications(@javax.annotation.Nullable final java.util.List<ItemPublication> value) {
        this._publications = value;
    }
    /**
     * Sets the skills property value. Represents detailed information about skills associated with a user in various services.
     * @param value Value to set for the skills property.
     * @return a void
     */
    public void setSkills(@javax.annotation.Nullable final java.util.List<SkillProficiency> value) {
        this._skills = value;
    }
    /**
     * Sets the webAccounts property value. Represents web accounts the user has indicated they use or has added to their user profile.
     * @param value Value to set for the webAccounts property.
     * @return a void
     */
    public void setWebAccounts(@javax.annotation.Nullable final java.util.List<WebAccount> value) {
        this._webAccounts = value;
    }
    /**
     * Sets the websites property value. Represents detailed information about websites associated with a user in various services.
     * @param value Value to set for the websites property.
     * @return a void
     */
    public void setWebsites(@javax.annotation.Nullable final java.util.List<PersonWebsite> value) {
        this._websites = value;
    }
}
