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
     * Instantiates a new ItemFacet and sets the default values.
     */
    public ItemFacet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ItemFacet
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
     * @return a EnumSet<AllowedAudiences>
     */
    @jakarta.annotation.Nullable
    public EnumSet<AllowedAudiences> getAllowedAudiences() {
        return this.backingStore.get("allowedAudiences");
    }
    /**
     * Gets the createdBy property value. The createdBy property
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowedAudiences", (n) -> { this.setAllowedAudiences(n.getEnumSetValue(AllowedAudiences::forValue)); });
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
     * @return a InferenceData
     */
    @jakarta.annotation.Nullable
    public InferenceData getInference() {
        return this.backingStore.get("inference");
    }
    /**
     * Gets the isSearchable property value. The isSearchable property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSearchable() {
        return this.backingStore.get("isSearchable");
    }
    /**
     * Gets the lastModifiedBy property value. The lastModifiedBy property
     * @return a IdentitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the source property value. Where the values within an entity originated if synced from another service.
     * @return a PersonDataSources
     */
    @jakarta.annotation.Nullable
    public PersonDataSources getSource() {
        return this.backingStore.get("source");
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
        this.backingStore.set("allowedAudiences", value);
    }
    /**
     * Sets the createdBy property value. The createdBy property
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the inference property value. Contains inference detail if the entity is inferred by the creating or modifying application.
     * @param value Value to set for the inference property.
     */
    public void setInference(@jakarta.annotation.Nullable final InferenceData value) {
        this.backingStore.set("inference", value);
    }
    /**
     * Sets the isSearchable property value. The isSearchable property
     * @param value Value to set for the isSearchable property.
     */
    public void setIsSearchable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSearchable", value);
    }
    /**
     * Sets the lastModifiedBy property value. The lastModifiedBy property
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Provides the dateTimeOffset for when the entity was created.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the source property value. Where the values within an entity originated if synced from another service.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final PersonDataSources value) {
        this.backingStore.set("source", value);
    }
}
