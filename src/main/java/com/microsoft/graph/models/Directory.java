package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the directory singleton. */
public class Directory extends Entity implements Parsable {
    /** Conceptual container for user and group directory objects. */
    private java.util.List<AdministrativeUnit> _administrativeUnits;
    /** Group of related custom security attribute definitions. */
    private java.util.List<AttributeSet> _attributeSets;
    /** Schema of a custom security attributes (key-value pairs). */
    private java.util.List<CustomSecurityAttributeDefinition> _customSecurityAttributeDefinitions;
    /** Recently deleted items. Read-only. Nullable. */
    private java.util.List<DirectoryObject> _deletedItems;
    /** The featureRolloutPolicies property */
    private java.util.List<FeatureRolloutPolicy> _featureRolloutPolicies;
    /** Configure domain federation with organizations whose identity provider (IdP) supports either the SAML or WS-Fed protocol. */
    private java.util.List<IdentityProviderBase> _federationConfigurations;
    /** The impactedResources property */
    private java.util.List<RecommendationResource> _impactedResources;
    /** The inboundSharedUserProfiles property */
    private java.util.List<InboundSharedUserProfile> _inboundSharedUserProfiles;
    /** The outboundSharedUserProfiles property */
    private java.util.List<OutboundSharedUserProfile> _outboundSharedUserProfiles;
    /** The recommendations property */
    private java.util.List<Recommendation> _recommendations;
    /** The sharedEmailDomains property */
    private java.util.List<SharedEmailDomain> _sharedEmailDomains;
    /**
     * Instantiates a new directory and sets the default values.
     * @return a void
     */
    public Directory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a directory
     */
    @javax.annotation.Nonnull
    public static Directory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Directory();
    }
    /**
     * Gets the administrativeUnits property value. Conceptual container for user and group directory objects.
     * @return a administrativeUnit
     */
    @javax.annotation.Nullable
    public java.util.List<AdministrativeUnit> getAdministrativeUnits() {
        return this._administrativeUnits;
    }
    /**
     * Gets the attributeSets property value. Group of related custom security attribute definitions.
     * @return a attributeSet
     */
    @javax.annotation.Nullable
    public java.util.List<AttributeSet> getAttributeSets() {
        return this._attributeSets;
    }
    /**
     * Gets the customSecurityAttributeDefinitions property value. Schema of a custom security attributes (key-value pairs).
     * @return a customSecurityAttributeDefinition
     */
    @javax.annotation.Nullable
    public java.util.List<CustomSecurityAttributeDefinition> getCustomSecurityAttributeDefinitions() {
        return this._customSecurityAttributeDefinitions;
    }
    /**
     * Gets the deletedItems property value. Recently deleted items. Read-only. Nullable.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getDeletedItems() {
        return this._deletedItems;
    }
    /**
     * Gets the featureRolloutPolicies property value. The featureRolloutPolicies property
     * @return a featureRolloutPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<FeatureRolloutPolicy> getFeatureRolloutPolicies() {
        return this._featureRolloutPolicies;
    }
    /**
     * Gets the federationConfigurations property value. Configure domain federation with organizations whose identity provider (IdP) supports either the SAML or WS-Fed protocol.
     * @return a identityProviderBase
     */
    @javax.annotation.Nullable
    public java.util.List<IdentityProviderBase> getFederationConfigurations() {
        return this._federationConfigurations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Directory currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("administrativeUnits", (n) -> { currentObject.setAdministrativeUnits(n.getCollectionOfObjectValues(AdministrativeUnit::createFromDiscriminatorValue)); });
            this.put("attributeSets", (n) -> { currentObject.setAttributeSets(n.getCollectionOfObjectValues(AttributeSet::createFromDiscriminatorValue)); });
            this.put("customSecurityAttributeDefinitions", (n) -> { currentObject.setCustomSecurityAttributeDefinitions(n.getCollectionOfObjectValues(CustomSecurityAttributeDefinition::createFromDiscriminatorValue)); });
            this.put("deletedItems", (n) -> { currentObject.setDeletedItems(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("featureRolloutPolicies", (n) -> { currentObject.setFeatureRolloutPolicies(n.getCollectionOfObjectValues(FeatureRolloutPolicy::createFromDiscriminatorValue)); });
            this.put("federationConfigurations", (n) -> { currentObject.setFederationConfigurations(n.getCollectionOfObjectValues(IdentityProviderBase::createFromDiscriminatorValue)); });
            this.put("impactedResources", (n) -> { currentObject.setImpactedResources(n.getCollectionOfObjectValues(RecommendationResource::createFromDiscriminatorValue)); });
            this.put("inboundSharedUserProfiles", (n) -> { currentObject.setInboundSharedUserProfiles(n.getCollectionOfObjectValues(InboundSharedUserProfile::createFromDiscriminatorValue)); });
            this.put("outboundSharedUserProfiles", (n) -> { currentObject.setOutboundSharedUserProfiles(n.getCollectionOfObjectValues(OutboundSharedUserProfile::createFromDiscriminatorValue)); });
            this.put("recommendations", (n) -> { currentObject.setRecommendations(n.getCollectionOfObjectValues(Recommendation::createFromDiscriminatorValue)); });
            this.put("sharedEmailDomains", (n) -> { currentObject.setSharedEmailDomains(n.getCollectionOfObjectValues(SharedEmailDomain::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the impactedResources property value. The impactedResources property
     * @return a recommendationResource
     */
    @javax.annotation.Nullable
    public java.util.List<RecommendationResource> getImpactedResources() {
        return this._impactedResources;
    }
    /**
     * Gets the inboundSharedUserProfiles property value. The inboundSharedUserProfiles property
     * @return a inboundSharedUserProfile
     */
    @javax.annotation.Nullable
    public java.util.List<InboundSharedUserProfile> getInboundSharedUserProfiles() {
        return this._inboundSharedUserProfiles;
    }
    /**
     * Gets the outboundSharedUserProfiles property value. The outboundSharedUserProfiles property
     * @return a outboundSharedUserProfile
     */
    @javax.annotation.Nullable
    public java.util.List<OutboundSharedUserProfile> getOutboundSharedUserProfiles() {
        return this._outboundSharedUserProfiles;
    }
    /**
     * Gets the recommendations property value. The recommendations property
     * @return a recommendation
     */
    @javax.annotation.Nullable
    public java.util.List<Recommendation> getRecommendations() {
        return this._recommendations;
    }
    /**
     * Gets the sharedEmailDomains property value. The sharedEmailDomains property
     * @return a sharedEmailDomain
     */
    @javax.annotation.Nullable
    public java.util.List<SharedEmailDomain> getSharedEmailDomains() {
        return this._sharedEmailDomains;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("administrativeUnits", this.getAdministrativeUnits());
        writer.writeCollectionOfObjectValues("attributeSets", this.getAttributeSets());
        writer.writeCollectionOfObjectValues("customSecurityAttributeDefinitions", this.getCustomSecurityAttributeDefinitions());
        writer.writeCollectionOfObjectValues("deletedItems", this.getDeletedItems());
        writer.writeCollectionOfObjectValues("featureRolloutPolicies", this.getFeatureRolloutPolicies());
        writer.writeCollectionOfObjectValues("federationConfigurations", this.getFederationConfigurations());
        writer.writeCollectionOfObjectValues("impactedResources", this.getImpactedResources());
        writer.writeCollectionOfObjectValues("inboundSharedUserProfiles", this.getInboundSharedUserProfiles());
        writer.writeCollectionOfObjectValues("outboundSharedUserProfiles", this.getOutboundSharedUserProfiles());
        writer.writeCollectionOfObjectValues("recommendations", this.getRecommendations());
        writer.writeCollectionOfObjectValues("sharedEmailDomains", this.getSharedEmailDomains());
    }
    /**
     * Sets the administrativeUnits property value. Conceptual container for user and group directory objects.
     * @param value Value to set for the administrativeUnits property.
     * @return a void
     */
    public void setAdministrativeUnits(@javax.annotation.Nullable final java.util.List<AdministrativeUnit> value) {
        this._administrativeUnits = value;
    }
    /**
     * Sets the attributeSets property value. Group of related custom security attribute definitions.
     * @param value Value to set for the attributeSets property.
     * @return a void
     */
    public void setAttributeSets(@javax.annotation.Nullable final java.util.List<AttributeSet> value) {
        this._attributeSets = value;
    }
    /**
     * Sets the customSecurityAttributeDefinitions property value. Schema of a custom security attributes (key-value pairs).
     * @param value Value to set for the customSecurityAttributeDefinitions property.
     * @return a void
     */
    public void setCustomSecurityAttributeDefinitions(@javax.annotation.Nullable final java.util.List<CustomSecurityAttributeDefinition> value) {
        this._customSecurityAttributeDefinitions = value;
    }
    /**
     * Sets the deletedItems property value. Recently deleted items. Read-only. Nullable.
     * @param value Value to set for the deletedItems property.
     * @return a void
     */
    public void setDeletedItems(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._deletedItems = value;
    }
    /**
     * Sets the featureRolloutPolicies property value. The featureRolloutPolicies property
     * @param value Value to set for the featureRolloutPolicies property.
     * @return a void
     */
    public void setFeatureRolloutPolicies(@javax.annotation.Nullable final java.util.List<FeatureRolloutPolicy> value) {
        this._featureRolloutPolicies = value;
    }
    /**
     * Sets the federationConfigurations property value. Configure domain federation with organizations whose identity provider (IdP) supports either the SAML or WS-Fed protocol.
     * @param value Value to set for the federationConfigurations property.
     * @return a void
     */
    public void setFederationConfigurations(@javax.annotation.Nullable final java.util.List<IdentityProviderBase> value) {
        this._federationConfigurations = value;
    }
    /**
     * Sets the impactedResources property value. The impactedResources property
     * @param value Value to set for the impactedResources property.
     * @return a void
     */
    public void setImpactedResources(@javax.annotation.Nullable final java.util.List<RecommendationResource> value) {
        this._impactedResources = value;
    }
    /**
     * Sets the inboundSharedUserProfiles property value. The inboundSharedUserProfiles property
     * @param value Value to set for the inboundSharedUserProfiles property.
     * @return a void
     */
    public void setInboundSharedUserProfiles(@javax.annotation.Nullable final java.util.List<InboundSharedUserProfile> value) {
        this._inboundSharedUserProfiles = value;
    }
    /**
     * Sets the outboundSharedUserProfiles property value. The outboundSharedUserProfiles property
     * @param value Value to set for the outboundSharedUserProfiles property.
     * @return a void
     */
    public void setOutboundSharedUserProfiles(@javax.annotation.Nullable final java.util.List<OutboundSharedUserProfile> value) {
        this._outboundSharedUserProfiles = value;
    }
    /**
     * Sets the recommendations property value. The recommendations property
     * @param value Value to set for the recommendations property.
     * @return a void
     */
    public void setRecommendations(@javax.annotation.Nullable final java.util.List<Recommendation> value) {
        this._recommendations = value;
    }
    /**
     * Sets the sharedEmailDomains property value. The sharedEmailDomains property
     * @param value Value to set for the sharedEmailDomains property.
     * @return a void
     */
    public void setSharedEmailDomains(@javax.annotation.Nullable final java.util.List<SharedEmailDomain> value) {
        this._sharedEmailDomains = value;
    }
}
