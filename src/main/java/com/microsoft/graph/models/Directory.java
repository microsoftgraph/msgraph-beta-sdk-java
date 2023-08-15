package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Directory extends Entity implements Parsable {
    /**
     * Conceptual container for user and group directory objects.
     */
    private java.util.List<AdministrativeUnit> administrativeUnits;
    /**
     * Group of related custom security attribute definitions.
     */
    private java.util.List<AttributeSet> attributeSets;
    /**
     * The certificateAuthorities property
     */
    private CertificateAuthorityPath certificateAuthorities;
    /**
     * Schema of a custom security attributes (key-value pairs).
     */
    private java.util.List<CustomSecurityAttributeDefinition> customSecurityAttributeDefinitions;
    /**
     * The deletedItems property
     */
    private java.util.List<DirectoryObject> deletedItems;
    /**
     * The featureRolloutPolicies property
     */
    private java.util.List<FeatureRolloutPolicy> featureRolloutPolicies;
    /**
     * Configure domain federation with organizations whose identity provider (IdP) supports either the SAML or WS-Fed protocol.
     */
    private java.util.List<IdentityProviderBase> federationConfigurations;
    /**
     * The impactedResources property
     */
    private java.util.List<ImpactedResource> impactedResources;
    /**
     * A collection of external Azure AD users whose profile data has been shared with the Azure AD tenant. Nullable.
     */
    private java.util.List<InboundSharedUserProfile> inboundSharedUserProfiles;
    /**
     * A container for on-premises directory synchronization functionalities that are available for the organization.
     */
    private java.util.List<OnPremisesDirectorySynchronization> onPremisesSynchronization;
    /**
     * The outboundSharedUserProfiles property
     */
    private java.util.List<OutboundSharedUserProfile> outboundSharedUserProfiles;
    /**
     * List of recommended improvements to improve tenant posture.
     */
    private java.util.List<Recommendation> recommendations;
    /**
     * The sharedEmailDomains property
     */
    private java.util.List<SharedEmailDomain> sharedEmailDomains;
    /**
     * List of commercial subscriptions that an organization has acquired.
     */
    private java.util.List<CompanySubscription> subscriptions;
    /**
     * Instantiates a new directory and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public Directory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a directory
     */
    @jakarta.annotation.Nonnull
    public static Directory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Directory();
    }
    /**
     * Gets the administrativeUnits property value. Conceptual container for user and group directory objects.
     * @return a administrativeUnit
     */
    @jakarta.annotation.Nullable
    public java.util.List<AdministrativeUnit> getAdministrativeUnits() {
        return this.administrativeUnits;
    }
    /**
     * Gets the attributeSets property value. Group of related custom security attribute definitions.
     * @return a attributeSet
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttributeSet> getAttributeSets() {
        return this.attributeSets;
    }
    /**
     * Gets the certificateAuthorities property value. The certificateAuthorities property
     * @return a certificateAuthorityPath
     */
    @jakarta.annotation.Nullable
    public CertificateAuthorityPath getCertificateAuthorities() {
        return this.certificateAuthorities;
    }
    /**
     * Gets the customSecurityAttributeDefinitions property value. Schema of a custom security attributes (key-value pairs).
     * @return a customSecurityAttributeDefinition
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomSecurityAttributeDefinition> getCustomSecurityAttributeDefinitions() {
        return this.customSecurityAttributeDefinitions;
    }
    /**
     * Gets the deletedItems property value. The deletedItems property
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getDeletedItems() {
        return this.deletedItems;
    }
    /**
     * Gets the featureRolloutPolicies property value. The featureRolloutPolicies property
     * @return a featureRolloutPolicy
     */
    @jakarta.annotation.Nullable
    public java.util.List<FeatureRolloutPolicy> getFeatureRolloutPolicies() {
        return this.featureRolloutPolicies;
    }
    /**
     * Gets the federationConfigurations property value. Configure domain federation with organizations whose identity provider (IdP) supports either the SAML or WS-Fed protocol.
     * @return a identityProviderBase
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityProviderBase> getFederationConfigurations() {
        return this.federationConfigurations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("administrativeUnits", (n) -> { this.setAdministrativeUnits(n.getCollectionOfObjectValues(AdministrativeUnit::createFromDiscriminatorValue)); });
        deserializerMap.put("attributeSets", (n) -> { this.setAttributeSets(n.getCollectionOfObjectValues(AttributeSet::createFromDiscriminatorValue)); });
        deserializerMap.put("certificateAuthorities", (n) -> { this.setCertificateAuthorities(n.getObjectValue(CertificateAuthorityPath::createFromDiscriminatorValue)); });
        deserializerMap.put("customSecurityAttributeDefinitions", (n) -> { this.setCustomSecurityAttributeDefinitions(n.getCollectionOfObjectValues(CustomSecurityAttributeDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedItems", (n) -> { this.setDeletedItems(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("featureRolloutPolicies", (n) -> { this.setFeatureRolloutPolicies(n.getCollectionOfObjectValues(FeatureRolloutPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("federationConfigurations", (n) -> { this.setFederationConfigurations(n.getCollectionOfObjectValues(IdentityProviderBase::createFromDiscriminatorValue)); });
        deserializerMap.put("impactedResources", (n) -> { this.setImpactedResources(n.getCollectionOfObjectValues(ImpactedResource::createFromDiscriminatorValue)); });
        deserializerMap.put("inboundSharedUserProfiles", (n) -> { this.setInboundSharedUserProfiles(n.getCollectionOfObjectValues(InboundSharedUserProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesSynchronization", (n) -> { this.setOnPremisesSynchronization(n.getCollectionOfObjectValues(OnPremisesDirectorySynchronization::createFromDiscriminatorValue)); });
        deserializerMap.put("outboundSharedUserProfiles", (n) -> { this.setOutboundSharedUserProfiles(n.getCollectionOfObjectValues(OutboundSharedUserProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("recommendations", (n) -> { this.setRecommendations(n.getCollectionOfObjectValues(Recommendation::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedEmailDomains", (n) -> { this.setSharedEmailDomains(n.getCollectionOfObjectValues(SharedEmailDomain::createFromDiscriminatorValue)); });
        deserializerMap.put("subscriptions", (n) -> { this.setSubscriptions(n.getCollectionOfObjectValues(CompanySubscription::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the impactedResources property value. The impactedResources property
     * @return a impactedResource
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImpactedResource> getImpactedResources() {
        return this.impactedResources;
    }
    /**
     * Gets the inboundSharedUserProfiles property value. A collection of external Azure AD users whose profile data has been shared with the Azure AD tenant. Nullable.
     * @return a inboundSharedUserProfile
     */
    @jakarta.annotation.Nullable
    public java.util.List<InboundSharedUserProfile> getInboundSharedUserProfiles() {
        return this.inboundSharedUserProfiles;
    }
    /**
     * Gets the onPremisesSynchronization property value. A container for on-premises directory synchronization functionalities that are available for the organization.
     * @return a onPremisesDirectorySynchronization
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnPremisesDirectorySynchronization> getOnPremisesSynchronization() {
        return this.onPremisesSynchronization;
    }
    /**
     * Gets the outboundSharedUserProfiles property value. The outboundSharedUserProfiles property
     * @return a outboundSharedUserProfile
     */
    @jakarta.annotation.Nullable
    public java.util.List<OutboundSharedUserProfile> getOutboundSharedUserProfiles() {
        return this.outboundSharedUserProfiles;
    }
    /**
     * Gets the recommendations property value. List of recommended improvements to improve tenant posture.
     * @return a recommendation
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recommendation> getRecommendations() {
        return this.recommendations;
    }
    /**
     * Gets the sharedEmailDomains property value. The sharedEmailDomains property
     * @return a sharedEmailDomain
     */
    @jakarta.annotation.Nullable
    public java.util.List<SharedEmailDomain> getSharedEmailDomains() {
        return this.sharedEmailDomains;
    }
    /**
     * Gets the subscriptions property value. List of commercial subscriptions that an organization has acquired.
     * @return a companySubscription
     */
    @jakarta.annotation.Nullable
    public java.util.List<CompanySubscription> getSubscriptions() {
        return this.subscriptions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("administrativeUnits", this.getAdministrativeUnits());
        writer.writeCollectionOfObjectValues("attributeSets", this.getAttributeSets());
        writer.writeObjectValue("certificateAuthorities", this.getCertificateAuthorities());
        writer.writeCollectionOfObjectValues("customSecurityAttributeDefinitions", this.getCustomSecurityAttributeDefinitions());
        writer.writeCollectionOfObjectValues("deletedItems", this.getDeletedItems());
        writer.writeCollectionOfObjectValues("featureRolloutPolicies", this.getFeatureRolloutPolicies());
        writer.writeCollectionOfObjectValues("federationConfigurations", this.getFederationConfigurations());
        writer.writeCollectionOfObjectValues("impactedResources", this.getImpactedResources());
        writer.writeCollectionOfObjectValues("inboundSharedUserProfiles", this.getInboundSharedUserProfiles());
        writer.writeCollectionOfObjectValues("onPremisesSynchronization", this.getOnPremisesSynchronization());
        writer.writeCollectionOfObjectValues("outboundSharedUserProfiles", this.getOutboundSharedUserProfiles());
        writer.writeCollectionOfObjectValues("recommendations", this.getRecommendations());
        writer.writeCollectionOfObjectValues("sharedEmailDomains", this.getSharedEmailDomains());
        writer.writeCollectionOfObjectValues("subscriptions", this.getSubscriptions());
    }
    /**
     * Sets the administrativeUnits property value. Conceptual container for user and group directory objects.
     * @param value Value to set for the administrativeUnits property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdministrativeUnits(@jakarta.annotation.Nullable final java.util.List<AdministrativeUnit> value) {
        this.administrativeUnits = value;
    }
    /**
     * Sets the attributeSets property value. Group of related custom security attribute definitions.
     * @param value Value to set for the attributeSets property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAttributeSets(@jakarta.annotation.Nullable final java.util.List<AttributeSet> value) {
        this.attributeSets = value;
    }
    /**
     * Sets the certificateAuthorities property value. The certificateAuthorities property
     * @param value Value to set for the certificateAuthorities property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCertificateAuthorities(@jakarta.annotation.Nullable final CertificateAuthorityPath value) {
        this.certificateAuthorities = value;
    }
    /**
     * Sets the customSecurityAttributeDefinitions property value. Schema of a custom security attributes (key-value pairs).
     * @param value Value to set for the customSecurityAttributeDefinitions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCustomSecurityAttributeDefinitions(@jakarta.annotation.Nullable final java.util.List<CustomSecurityAttributeDefinition> value) {
        this.customSecurityAttributeDefinitions = value;
    }
    /**
     * Sets the deletedItems property value. The deletedItems property
     * @param value Value to set for the deletedItems property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeletedItems(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.deletedItems = value;
    }
    /**
     * Sets the featureRolloutPolicies property value. The featureRolloutPolicies property
     * @param value Value to set for the featureRolloutPolicies property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFeatureRolloutPolicies(@jakarta.annotation.Nullable final java.util.List<FeatureRolloutPolicy> value) {
        this.featureRolloutPolicies = value;
    }
    /**
     * Sets the federationConfigurations property value. Configure domain federation with organizations whose identity provider (IdP) supports either the SAML or WS-Fed protocol.
     * @param value Value to set for the federationConfigurations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFederationConfigurations(@jakarta.annotation.Nullable final java.util.List<IdentityProviderBase> value) {
        this.federationConfigurations = value;
    }
    /**
     * Sets the impactedResources property value. The impactedResources property
     * @param value Value to set for the impactedResources property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setImpactedResources(@jakarta.annotation.Nullable final java.util.List<ImpactedResource> value) {
        this.impactedResources = value;
    }
    /**
     * Sets the inboundSharedUserProfiles property value. A collection of external Azure AD users whose profile data has been shared with the Azure AD tenant. Nullable.
     * @param value Value to set for the inboundSharedUserProfiles property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setInboundSharedUserProfiles(@jakarta.annotation.Nullable final java.util.List<InboundSharedUserProfile> value) {
        this.inboundSharedUserProfiles = value;
    }
    /**
     * Sets the onPremisesSynchronization property value. A container for on-premises directory synchronization functionalities that are available for the organization.
     * @param value Value to set for the onPremisesSynchronization property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOnPremisesSynchronization(@jakarta.annotation.Nullable final java.util.List<OnPremisesDirectorySynchronization> value) {
        this.onPremisesSynchronization = value;
    }
    /**
     * Sets the outboundSharedUserProfiles property value. The outboundSharedUserProfiles property
     * @param value Value to set for the outboundSharedUserProfiles property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOutboundSharedUserProfiles(@jakarta.annotation.Nullable final java.util.List<OutboundSharedUserProfile> value) {
        this.outboundSharedUserProfiles = value;
    }
    /**
     * Sets the recommendations property value. List of recommended improvements to improve tenant posture.
     * @param value Value to set for the recommendations property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setRecommendations(@jakarta.annotation.Nullable final java.util.List<Recommendation> value) {
        this.recommendations = value;
    }
    /**
     * Sets the sharedEmailDomains property value. The sharedEmailDomains property
     * @param value Value to set for the sharedEmailDomains property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSharedEmailDomains(@jakarta.annotation.Nullable final java.util.List<SharedEmailDomain> value) {
        this.sharedEmailDomains = value;
    }
    /**
     * Sets the subscriptions property value. List of commercial subscriptions that an organization has acquired.
     * @param value Value to set for the subscriptions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSubscriptions(@jakarta.annotation.Nullable final java.util.List<CompanySubscription> value) {
        this.subscriptions = value;
    }
}
