package com.microsoft.graph.models;

import com.microsoft.graph.models.EducationalActivity;
import com.microsoft.graph.models.ItemAddress;
import com.microsoft.graph.models.ItemEmail;
import com.microsoft.graph.models.ItemPatent;
import com.microsoft.graph.models.ItemPhone;
import com.microsoft.graph.models.ItemPublication;
import com.microsoft.graph.models.LanguageProficiency;
import com.microsoft.graph.models.PersonAnnotation;
import com.microsoft.graph.models.PersonAnnualEvent;
import com.microsoft.graph.models.PersonAward;
import com.microsoft.graph.models.PersonCertification;
import com.microsoft.graph.models.PersonInterest;
import com.microsoft.graph.models.PersonName;
import com.microsoft.graph.models.PersonResponsibility;
import com.microsoft.graph.models.PersonWebsite;
import com.microsoft.graph.models.ProjectParticipation;
import com.microsoft.graph.models.SkillProficiency;
import com.microsoft.graph.models.UserAccountInformation;
import com.microsoft.graph.models.WebAccount;
import com.microsoft.graph.models.WorkPosition;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class ItemFacet extends Entity implements Parsable {
    /** The audiences that are able to see the values contained within the associated entity. Possible values are: me, family, contacts, groupMembers, organization, federatedOrganizations, everyone, unknownFutureValue. */
    private AllowedAudiences _allowedAudiences;
    /** The createdBy property */
    private IdentitySet _createdBy;
    /** Provides the dateTimeOffset for when the entity was created. */
    private OffsetDateTime _createdDateTime;
    /** Contains inference detail if the entity is inferred by the creating or modifying application. */
    private InferenceData _inference;
    /** The isSearchable property */
    private Boolean _isSearchable;
    /** The lastModifiedBy property */
    private IdentitySet _lastModifiedBy;
    /** Provides the dateTimeOffset for when the entity was created. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Where the values within an entity originated if synced from another service. */
    private PersonDataSources _source;
    /**
     * Instantiates a new itemFacet and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ItemFacet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemFacet
     */
    @javax.annotation.Nonnull
    public static ItemFacet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.educationalActivity": return new EducationalActivity();
                case "#microsoft.graph.itemAddress": return new ItemAddress();
                case "#microsoft.graph.itemEmail": return new ItemEmail();
                case "#microsoft.graph.itemPatent": return new ItemPatent();
                case "#microsoft.graph.itemPhone": return new ItemPhone();
                case "#microsoft.graph.itemPublication": return new ItemPublication();
                case "#microsoft.graph.languageProficiency": return new LanguageProficiency();
                case "#microsoft.graph.personAnnotation": return new PersonAnnotation();
                case "#microsoft.graph.personAnnualEvent": return new PersonAnnualEvent();
                case "#microsoft.graph.personAward": return new PersonAward();
                case "#microsoft.graph.personCertification": return new PersonCertification();
                case "#microsoft.graph.personInterest": return new PersonInterest();
                case "#microsoft.graph.personName": return new PersonName();
                case "#microsoft.graph.personResponsibility": return new PersonResponsibility();
                case "#microsoft.graph.personWebsite": return new PersonWebsite();
                case "#microsoft.graph.projectParticipation": return new ProjectParticipation();
                case "#microsoft.graph.skillProficiency": return new SkillProficiency();
                case "#microsoft.graph.userAccountInformation": return new UserAccountInformation();
                case "#microsoft.graph.webAccount": return new WebAccount();
                case "#microsoft.graph.workPosition": return new WorkPosition();
            }
        }
        return new ItemFacet();
    }
    /**
     * Gets the allowedAudiences property value. The audiences that are able to see the values contained within the associated entity. Possible values are: me, family, contacts, groupMembers, organization, federatedOrganizations, everyone, unknownFutureValue.
     * @return a allowedAudiences
     */
    @javax.annotation.Nullable
    public AllowedAudiences getAllowedAudiences() {
        return this._allowedAudiences;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedAudiences", (n) -> { this.setAllowedAudiences(n.getEnumValue(AllowedAudiences.class)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("inference", (n) -> { this.setInference(n.getObjectValue(InferenceData::createFromDiscriminatorValue)); });
        deserializerMap.put("isSearchable", (n) -> { this.setIsSearchable(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getObjectValue(PersonDataSources::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the inference property value. Contains inference detail if the entity is inferred by the creating or modifying application.
     * @return a inferenceData
     */
    @javax.annotation.Nullable
    public InferenceData getInference() {
        return this._inference;
    }
    /**
     * Gets the isSearchable property value. The isSearchable property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSearchable() {
        return this._isSearchable;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the source property value. Where the values within an entity originated if synced from another service.
     * @return a personDataSources
     */
    @javax.annotation.Nullable
    public PersonDataSources getSource() {
        return this._source;
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
        writer.writeEnumValue("allowedAudiences", this.getAllowedAudiences());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("inference", this.getInference());
        writer.writeBooleanValue("isSearchable", this.getIsSearchable());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("source", this.getSource());
    }
    /**
     * Sets the allowedAudiences property value. The audiences that are able to see the values contained within the associated entity. Possible values are: me, family, contacts, groupMembers, organization, federatedOrganizations, everyone, unknownFutureValue.
     * @param value Value to set for the allowedAudiences property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedAudiences(@javax.annotation.Nullable final AllowedAudiences value) {
        this._allowedAudiences = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the inference property value. Contains inference detail if the entity is inferred by the creating or modifying application.
     * @param value Value to set for the inference property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInference(@javax.annotation.Nullable final InferenceData value) {
        this._inference = value;
    }
    /**
     * Sets the isSearchable property value. The isSearchable property
     * @param value Value to set for the isSearchable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSearchable(@javax.annotation.Nullable final Boolean value) {
        this._isSearchable = value;
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the source property value. Where the values within an entity originated if synced from another service.
     * @param value Value to set for the source property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSource(@javax.annotation.Nullable final PersonDataSources value) {
        this._source = value;
    }
}
