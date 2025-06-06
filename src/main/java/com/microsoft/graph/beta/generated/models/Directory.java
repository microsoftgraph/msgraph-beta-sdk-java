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
     * Gets the authenticationMethodDevices property value. Exposes the hardware OATH method in the directory.
     * @return a {@link AuthenticationMethodDevice}
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodDevice getAuthenticationMethodDevices() {
        return this.backingStore.get("authenticationMethodDevices");
    }
    /**
     * Gets the certificateAuthorities property value. Container for certificate authorities-related configurations for applications in the tenant.
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
     * Gets the deletedItems property value. Recently deleted items. Read-only. Nullable.
     * @return a {@link java.util.List<DirectoryObject>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getDeletedItems() {
        return this.backingStore.get("deletedItems");
    }
    /**
     * Gets the deviceLocalCredentials property value. The credentials of the device&apos;s local administrator account backed up to Microsoft Entra ID.
     * @return a {@link java.util.List<DeviceLocalCredentialInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceLocalCredentialInfo> getDeviceLocalCredentials() {
        return this.backingStore.get("deviceLocalCredentials");
    }
    /**
     * Gets the externalUserProfiles property value. Collection of external user profiles that represent collaborators in the directory.
     * @return a {@link java.util.List<ExternalUserProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExternalUserProfile> getExternalUserProfiles() {
        return this.backingStore.get("externalUserProfiles");
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
        deserializerMap.put("authenticationMethodDevices", (n) -> { this.setAuthenticationMethodDevices(n.getObjectValue(AuthenticationMethodDevice::createFromDiscriminatorValue)); });
        deserializerMap.put("certificateAuthorities", (n) -> { this.setCertificateAuthorities(n.getObjectValue(CertificateAuthorityPath::createFromDiscriminatorValue)); });
        deserializerMap.put("customSecurityAttributeDefinitions", (n) -> { this.setCustomSecurityAttributeDefinitions(n.getCollectionOfObjectValues(CustomSecurityAttributeDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("deletedItems", (n) -> { this.setDeletedItems(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceLocalCredentials", (n) -> { this.setDeviceLocalCredentials(n.getCollectionOfObjectValues(DeviceLocalCredentialInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("externalUserProfiles", (n) -> { this.setExternalUserProfiles(n.getCollectionOfObjectValues(ExternalUserProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("featureRolloutPolicies", (n) -> { this.setFeatureRolloutPolicies(n.getCollectionOfObjectValues(FeatureRolloutPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("federationConfigurations", (n) -> { this.setFederationConfigurations(n.getCollectionOfObjectValues(IdentityProviderBase::createFromDiscriminatorValue)); });
        deserializerMap.put("impactedResources", (n) -> { this.setImpactedResources(n.getCollectionOfObjectValues(ImpactedResource::createFromDiscriminatorValue)); });
        deserializerMap.put("inboundSharedUserProfiles", (n) -> { this.setInboundSharedUserProfiles(n.getCollectionOfObjectValues(InboundSharedUserProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesSynchronization", (n) -> { this.setOnPremisesSynchronization(n.getCollectionOfObjectValues(OnPremisesDirectorySynchronization::createFromDiscriminatorValue)); });
        deserializerMap.put("outboundSharedUserProfiles", (n) -> { this.setOutboundSharedUserProfiles(n.getCollectionOfObjectValues(OutboundSharedUserProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("pendingExternalUserProfiles", (n) -> { this.setPendingExternalUserProfiles(n.getCollectionOfObjectValues(PendingExternalUserProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("publicKeyInfrastructure", (n) -> { this.setPublicKeyInfrastructure(n.getObjectValue(PublicKeyInfrastructureRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("recommendationConfiguration", (n) -> { this.setRecommendationConfiguration(n.getObjectValue(RecommendationConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("recommendations", (n) -> { this.setRecommendations(n.getCollectionOfObjectValues(Recommendation::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedEmailDomains", (n) -> { this.setSharedEmailDomains(n.getCollectionOfObjectValues(SharedEmailDomain::createFromDiscriminatorValue)); });
        deserializerMap.put("subscriptions", (n) -> { this.setSubscriptions(n.getCollectionOfObjectValues(CompanySubscription::createFromDiscriminatorValue)); });
        deserializerMap.put("templates", (n) -> { this.setTemplates(n.getObjectValue(Template::createFromDiscriminatorValue)); });
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
     * Gets the inboundSharedUserProfiles property value. A collection of external users whose profile data is shared with the Microsoft Entra tenant. Nullable.
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
     * Gets the pendingExternalUserProfiles property value. Collection of pending external user profiles representing collaborators in the directory that are unredeemed.
     * @return a {@link java.util.List<PendingExternalUserProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PendingExternalUserProfile> getPendingExternalUserProfiles() {
        return this.backingStore.get("pendingExternalUserProfiles");
    }
    /**
     * Gets the publicKeyInfrastructure property value. The collection of public key infrastructure instances for the certificate-based authentication feature for users in a Microsoft Entra tenant.
     * @return a {@link PublicKeyInfrastructureRoot}
     */
    @jakarta.annotation.Nullable
    public PublicKeyInfrastructureRoot getPublicKeyInfrastructure() {
        return this.backingStore.get("publicKeyInfrastructure");
    }
    /**
     * Gets the recommendationConfiguration property value. The recommendationConfiguration property
     * @return a {@link RecommendationConfiguration}
     */
    @jakarta.annotation.Nullable
    public RecommendationConfiguration getRecommendationConfiguration() {
        return this.backingStore.get("recommendationConfiguration");
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
     * Gets the subscriptions property value. List of commercial subscriptions that an organization has.
     * @return a {@link java.util.List<CompanySubscription>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CompanySubscription> getSubscriptions() {
        return this.backingStore.get("subscriptions");
    }
    /**
     * Gets the templates property value. A container for templates, such as device templates used for onboarding devices in Microsoft Entra ID.
     * @return a {@link Template}
     */
    @jakarta.annotation.Nullable
    public Template getTemplates() {
        return this.backingStore.get("templates");
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
        writer.writeObjectValue("authenticationMethodDevices", this.getAuthenticationMethodDevices());
        writer.writeObjectValue("certificateAuthorities", this.getCertificateAuthorities());
        writer.writeCollectionOfObjectValues("customSecurityAttributeDefinitions", this.getCustomSecurityAttributeDefinitions());
        writer.writeCollectionOfObjectValues("deletedItems", this.getDeletedItems());
        writer.writeCollectionOfObjectValues("deviceLocalCredentials", this.getDeviceLocalCredentials());
        writer.writeCollectionOfObjectValues("externalUserProfiles", this.getExternalUserProfiles());
        writer.writeCollectionOfObjectValues("featureRolloutPolicies", this.getFeatureRolloutPolicies());
        writer.writeCollectionOfObjectValues("federationConfigurations", this.getFederationConfigurations());
        writer.writeCollectionOfObjectValues("impactedResources", this.getImpactedResources());
        writer.writeCollectionOfObjectValues("inboundSharedUserProfiles", this.getInboundSharedUserProfiles());
        writer.writeCollectionOfObjectValues("onPremisesSynchronization", this.getOnPremisesSynchronization());
        writer.writeCollectionOfObjectValues("outboundSharedUserProfiles", this.getOutboundSharedUserProfiles());
        writer.writeCollectionOfObjectValues("pendingExternalUserProfiles", this.getPendingExternalUserProfiles());
        writer.writeObjectValue("publicKeyInfrastructure", this.getPublicKeyInfrastructure());
        writer.writeObjectValue("recommendationConfiguration", this.getRecommendationConfiguration());
        writer.writeCollectionOfObjectValues("recommendations", this.getRecommendations());
        writer.writeCollectionOfObjectValues("sharedEmailDomains", this.getSharedEmailDomains());
        writer.writeCollectionOfObjectValues("subscriptions", this.getSubscriptions());
        writer.writeObjectValue("templates", this.getTemplates());
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
     * Sets the authenticationMethodDevices property value. Exposes the hardware OATH method in the directory.
     * @param value Value to set for the authenticationMethodDevices property.
     */
    public void setAuthenticationMethodDevices(@jakarta.annotation.Nullable final AuthenticationMethodDevice value) {
        this.backingStore.set("authenticationMethodDevices", value);
    }
    /**
     * Sets the certificateAuthorities property value. Container for certificate authorities-related configurations for applications in the tenant.
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
     * Sets the deletedItems property value. Recently deleted items. Read-only. Nullable.
     * @param value Value to set for the deletedItems property.
     */
    public void setDeletedItems(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.backingStore.set("deletedItems", value);
    }
    /**
     * Sets the deviceLocalCredentials property value. The credentials of the device&apos;s local administrator account backed up to Microsoft Entra ID.
     * @param value Value to set for the deviceLocalCredentials property.
     */
    public void setDeviceLocalCredentials(@jakarta.annotation.Nullable final java.util.List<DeviceLocalCredentialInfo> value) {
        this.backingStore.set("deviceLocalCredentials", value);
    }
    /**
     * Sets the externalUserProfiles property value. Collection of external user profiles that represent collaborators in the directory.
     * @param value Value to set for the externalUserProfiles property.
     */
    public void setExternalUserProfiles(@jakarta.annotation.Nullable final java.util.List<ExternalUserProfile> value) {
        this.backingStore.set("externalUserProfiles", value);
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
     * Sets the inboundSharedUserProfiles property value. A collection of external users whose profile data is shared with the Microsoft Entra tenant. Nullable.
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
     * Sets the pendingExternalUserProfiles property value. Collection of pending external user profiles representing collaborators in the directory that are unredeemed.
     * @param value Value to set for the pendingExternalUserProfiles property.
     */
    public void setPendingExternalUserProfiles(@jakarta.annotation.Nullable final java.util.List<PendingExternalUserProfile> value) {
        this.backingStore.set("pendingExternalUserProfiles", value);
    }
    /**
     * Sets the publicKeyInfrastructure property value. The collection of public key infrastructure instances for the certificate-based authentication feature for users in a Microsoft Entra tenant.
     * @param value Value to set for the publicKeyInfrastructure property.
     */
    public void setPublicKeyInfrastructure(@jakarta.annotation.Nullable final PublicKeyInfrastructureRoot value) {
        this.backingStore.set("publicKeyInfrastructure", value);
    }
    /**
     * Sets the recommendationConfiguration property value. The recommendationConfiguration property
     * @param value Value to set for the recommendationConfiguration property.
     */
    public void setRecommendationConfiguration(@jakarta.annotation.Nullable final RecommendationConfiguration value) {
        this.backingStore.set("recommendationConfiguration", value);
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
     * Sets the subscriptions property value. List of commercial subscriptions that an organization has.
     * @param value Value to set for the subscriptions property.
     */
    public void setSubscriptions(@jakarta.annotation.Nullable final java.util.List<CompanySubscription> value) {
        this.backingStore.set("subscriptions", value);
    }
    /**
     * Sets the templates property value. A container for templates, such as device templates used for onboarding devices in Microsoft Entra ID.
     * @param value Value to set for the templates property.
     */
    public void setTemplates(@jakarta.annotation.Nullable final Template value) {
        this.backingStore.set("templates", value);
    }
}
