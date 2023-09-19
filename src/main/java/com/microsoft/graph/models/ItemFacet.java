package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemFacet extends Entity implements Parsable {
    /**
     * The audiences that are able to see the values contained within the associated entity. Possible values are: me, family, contacts, groupMembers, organization, federatedOrganizations, everyone, unknownFutureValue.
     */
    private EnumSet<AllowedAudiences> allowedAudiences;
    /**
     * The createdBy property
     */
    private IdentitySet createdBy;
    /**
     * Provides the dateTimeOffset for when the entity was created.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Contains inference detail if the entity is inferred by the creating or modifying application.
     */
    private InferenceData inference;
    /**
     * The isSearchable property
     */
    private Boolean isSearchable;
    /**
     * The lastModifiedBy property
     */
    private IdentitySet lastModifiedBy;
    /**
     * Provides the dateTimeOffset for when the entity was created.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * Where the values within an entity originated if synced from another service.
     */
    private PersonDataSources source;
    /**
     * Instantiates a new itemFacet and sets the default values.
     */
    public ItemFacet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemFacet
     */
    @jakarta.annotation.Nonnull
    public static ItemFacet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
    @jakarta.annotation.Nullable
    public EnumSet<AllowedAudiences> getAllowedAudiences() {
        return this.allowedAudiences;
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedAudiences", (n) -> { this.setAllowedAudiences(n.getEnumSetValue(AllowedAudiences.class)); });
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
    @jakarta.annotation.Nullable
    public InferenceData getInference() {
        return this.inference;
    }
    /**
     * Gets the isSearchable property value. The isSearchable property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSearchable() {
        return this.isSearchable;
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the source property value. Where the values within an entity originated if synced from another service.
     * @return a personDataSources
     */
    @jakarta.annotation.Nullable
    public PersonDataSources getSource() {
        return this.source;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("allowedAudiences", this.getAllowedAudiences());
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
     */
    public void setAllowedAudiences(@jakarta.annotation.Nullable final EnumSet<AllowedAudiences> value) {
        this.allowedAudiences = value;
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the inference property value. Contains inference detail if the entity is inferred by the creating or modifying application.
     * @param value Value to set for the inference property.
     */
    public void setInference(@jakarta.annotation.Nullable final InferenceData value) {
        this.inference = value;
    }
    /**
     * Sets the isSearchable property value. The isSearchable property
     * @param value Value to set for the isSearchable property.
     */
    public void setIsSearchable(@jakarta.annotation.Nullable final Boolean value) {
        this.isSearchable = value;
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the source property value. Where the values within an entity originated if synced from another service.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final PersonDataSources value) {
        this.source = value;
    }
}
