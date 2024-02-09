package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Directory extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Directory} and sets the default values.
     */
    public Directory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Directory}
     */
    @jakarta.annotation.Nonnull
    public static Directory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Directory();
    }
    /**
     * Gets the administrativeUnits property value. Conceptual container for user and group directory objects.
     * @return a {@link java.util.List<AdministrativeUnit>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AdministrativeUnit> getAdministrativeUnits() {
        return this.backingStore.get("administrativeUnits");
    }
    /**
     * Gets the attributeSets property value. Group of related custom security attribute definitions.
     * @return a {@link java.util.List<AttributeSet>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AttributeSet> getAttributeSets() {
        return this.backingStore.get("attributeSets");
    }
    /**
     * Gets the certificateAuthorities property value. The certificateAuthorities property
     * @return a {@link CertificateAuthorityPath}
     */
    @jakarta.annotation.Nullable
    public CertificateAuthorityPath getCertificateAuthorities() {
        return this.backingStore.get("certificateAuthorities");
    }
    /**
     * Gets the customSecurityAttributeDefinitions property value. Schema of a custom security attributes (key-value pairs).
     * @return a {@link java.util.List<CustomSecurityAttributeDefinition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomSecurityAttributeDefinition> getCustomSecurityAttributeDefinitions() {
        return this.backingStore.get("customSecurityAttributeDefinitions");
    }
    /**
     * Gets the deletedItems property value. The deletedItems property
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getDeletedItems() {
        return this.backingStore.get("deletedItems");
    }
    /**
     * Gets the deviceLocalCredentials property value. The credentials of the device's local administrator account backed up to Microsoft Entra ID.
     * @return a {@link java.util.List<DeviceLocalCredentialInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceLocalCredentialInfo> getDeviceLocalCredentials() {
        return this.backingStore.get("deviceLocalCredentials");
    }
    /**
     * Gets the featureRolloutPolicies property value. The featureRolloutPolicies property
     * @return a {@link java.util.List<FeatureRolloutPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FeatureRolloutPolicy> getFeatureRolloutPolicies() {
        return this.backingStore.get("featureRolloutPolicies");
    }
    /**
     * Gets the federationConfigurations property value. Configure domain federation with organizations whose identity provider (IdP) supports either the SAML or WS-Fed protocol.
     * @return a {@link java.util.List<IdentityProviderBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityProviderBase> getFederationConfigurations() {
        return this.backingStore.get("federationConfigurations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("administrativeUnits", (n) -> { this.setAdministrativeUnits(n.getCollectionOfObjectValues(AdministrativeUnit::createFromDiscriminatorValue)); });
        deserializerMap.put("attributeSets", (n) -> { this.setAttributeSets(n.getCollectionOfObjectValues(AttributeSet::createFromDiscriminatorValue)); });
        deserializerMap.put("certificateAuthorities", (n) -> { this.setCertificateAuthorities(n.getObjectValue(CertificateAuthorityPath::createFromDiscriminatorValue)); });
        deserializerMap.put("customSecurityAttributeDefinitions", (n) -> { this.setCustomSecurityAttributeDefinitions(n.getCollectionOfObjectValues(CustomSecurityAttributeDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedItems", (n) -> { this.setDeletedItems(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceLocalCredentials", (n) -> { this.setDeviceLocalCredentials(n.getCollectionOfObjectValues(DeviceLocalCredentialInfo::createFromDiscriminatorValue)); });
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
     * @return a {@link java.util.List<ImpactedResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ImpactedResource> getImpactedResources() {
        return this.backingStore.get("impactedResources");
    }
    /**
     * Gets the inboundSharedUserProfiles property value. A collection of external Azure AD users whose profile data has been shared with the Azure AD tenant. Nullable.
     * @return a {@link java.util.List<InboundSharedUserProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InboundSharedUserProfile> getInboundSharedUserProfiles() {
        return this.backingStore.get("inboundSharedUserProfiles");
    }
    /**
     * Gets the onPremisesSynchronization property value. A container for on-premises directory synchronization functionalities that are available for the organization.
     * @return a {@link java.util.List<OnPremisesDirectorySynchronization>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnPremisesDirectorySynchronization> getOnPremisesSynchronization() {
        return this.backingStore.get("onPremisesSynchronization");
    }
    /**
     * Gets the outboundSharedUserProfiles property value. The outboundSharedUserProfiles property
     * @return a {@link java.util.List<OutboundSharedUserProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OutboundSharedUserProfile> getOutboundSharedUserProfiles() {
        return this.backingStore.get("outboundSharedUserProfiles");
    }
    /**
     * Gets the recommendations property value. List of recommended improvements to improve tenant posture.
     * @return a {@link java.util.List<Recommendation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Recommendation> getRecommendations() {
        return this.backingStore.get("recommendations");
    }
    /**
     * Gets the sharedEmailDomains property value. The sharedEmailDomains property
     * @return a {@link java.util.List<SharedEmailDomain>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SharedEmailDomain> getSharedEmailDomains() {
        return this.backingStore.get("sharedEmailDomains");
    }
    /**
     * Gets the subscriptions property value. List of commercial subscriptions that an organization has acquired.
     * @return a {@link java.util.List<CompanySubscription>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CompanySubscription> getSubscriptions() {
        return this.backingStore.get("subscriptions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("administrativeUnits", this.getAdministrativeUnits());
        writer.writeCollectionOfObjectValues("attributeSets", this.getAttributeSets());
        writer.writeObjectValue("certificateAuthorities", this.getCertificateAuthorities());
        writer.writeCollectionOfObjectValues("customSecurityAttributeDefinitions", this.getCustomSecurityAttributeDefinitions());
        writer.writeCollectionOfObjectValues("deletedItems", this.getDeletedItems());
        writer.writeCollectionOfObjectValues("deviceLocalCredentials", this.getDeviceLocalCredentials());
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
     */
    public void setAdministrativeUnits(@jakarta.annotation.Nullable final java.util.List<AdministrativeUnit> value) {
        this.backingStore.set("administrativeUnits", value);
    }
    /**
     * Sets the attributeSets property value. Group of related custom security attribute definitions.
     * @param value Value to set for the attributeSets property.
     */
    public void setAttributeSets(@jakarta.annotation.Nullable final java.util.List<AttributeSet> value) {
        this.backingStore.set("attributeSets", value);
    }
    /**
     * Sets the certificateAuthorities property value. The certificateAuthorities property
     * @param value Value to set for the certificateAuthorities property.
     */
    public void setCertificateAuthorities(@jakarta.annotation.Nullable final CertificateAuthorityPath value) {
        this.backingStore.set("certificateAuthorities", value);
    }
    /**
     * Sets the customSecurityAttributeDefinitions property value. Schema of a custom security attributes (key-value pairs).
     * @param value Value to set for the customSecurityAttributeDefinitions property.
     */
    public void setCustomSecurityAttributeDefinitions(@jakarta.annotation.Nullable final java.util.List<CustomSecurityAttributeDefinition> value) {
        this.backingStore.set("customSecurityAttributeDefinitions", value);
    }
    /**
     * Sets the deletedItems property value. The deletedItems property
     * @param value Value to set for the deletedItems property.
     */
    public void setDeletedItems(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("deletedItems", value);
    }
    /**
     * Sets the deviceLocalCredentials property value. The credentials of the device's local administrator account backed up to Microsoft Entra ID.
     * @param value Value to set for the deviceLocalCredentials property.
     */
    public void setDeviceLocalCredentials(@jakarta.annotation.Nullable final java.util.List<DeviceLocalCredentialInfo> value) {
        this.backingStore.set("deviceLocalCredentials", value);
    }
    /**
     * Sets the featureRolloutPolicies property value. The featureRolloutPolicies property
     * @param value Value to set for the featureRolloutPolicies property.
     */
    public void setFeatureRolloutPolicies(@jakarta.annotation.Nullable final java.util.List<FeatureRolloutPolicy> value) {
        this.backingStore.set("featureRolloutPolicies", value);
    }
    /**
     * Sets the federationConfigurations property value. Configure domain federation with organizations whose identity provider (IdP) supports either the SAML or WS-Fed protocol.
     * @param value Value to set for the federationConfigurations property.
     */
    public void setFederationConfigurations(@jakarta.annotation.Nullable final java.util.List<IdentityProviderBase> value) {
        this.backingStore.set("federationConfigurations", value);
    }
    /**
     * Sets the impactedResources property value. The impactedResources property
     * @param value Value to set for the impactedResources property.
     */
    public void setImpactedResources(@jakarta.annotation.Nullable final java.util.List<ImpactedResource> value) {
        this.backingStore.set("impactedResources", value);
    }
    /**
     * Sets the inboundSharedUserProfiles property value. A collection of external Azure AD users whose profile data has been shared with the Azure AD tenant. Nullable.
     * @param value Value to set for the inboundSharedUserProfiles property.
     */
    public void setInboundSharedUserProfiles(@jakarta.annotation.Nullable final java.util.List<InboundSharedUserProfile> value) {
        this.backingStore.set("inboundSharedUserProfiles", value);
    }
    /**
     * Sets the onPremisesSynchronization property value. A container for on-premises directory synchronization functionalities that are available for the organization.
     * @param value Value to set for the onPremisesSynchronization property.
     */
    public void setOnPremisesSynchronization(@jakarta.annotation.Nullable final java.util.List<OnPremisesDirectorySynchronization> value) {
        this.backingStore.set("onPremisesSynchronization", value);
    }
    /**
     * Sets the outboundSharedUserProfiles property value. The outboundSharedUserProfiles property
     * @param value Value to set for the outboundSharedUserProfiles property.
     */
    public void setOutboundSharedUserProfiles(@jakarta.annotation.Nullable final java.util.List<OutboundSharedUserProfile> value) {
        this.backingStore.set("outboundSharedUserProfiles", value);
    }
    /**
     * Sets the recommendations property value. List of recommended improvements to improve tenant posture.
     * @param value Value to set for the recommendations property.
     */
    public void setRecommendations(@jakarta.annotation.Nullable final java.util.List<Recommendation> value) {
        this.backingStore.set("recommendations", value);
    }
    /**
     * Sets the sharedEmailDomains property value. The sharedEmailDomains property
     * @param value Value to set for the sharedEmailDomains property.
     */
    public void setSharedEmailDomains(@jakarta.annotation.Nullable final java.util.List<SharedEmailDomain> value) {
        this.backingStore.set("sharedEmailDomains", value);
    }
    /**
     * Sets the subscriptions property value. List of commercial subscriptions that an organization has acquired.
     * @param value Value to set for the subscriptions property.
     */
    public void setSubscriptions(@jakarta.annotation.Nullable final java.util.List<CompanySubscription> value) {
        this.backingStore.set("subscriptions", value);
    }
}
