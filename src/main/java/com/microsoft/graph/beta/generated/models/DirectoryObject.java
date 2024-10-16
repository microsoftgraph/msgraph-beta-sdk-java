package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DirectoryObject extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DirectoryObject} and sets the default values.
     */
    public DirectoryObject() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DirectoryObject}
     */
    @jakarta.annotation.Nonnull
    public static DirectoryObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.activityBasedTimeoutPolicy": return new ActivityBasedTimeoutPolicy();
                case "#microsoft.graph.administrativeUnit": return new AdministrativeUnit();
                case "#microsoft.graph.application": return new Application();
                case "#microsoft.graph.appManagementPolicy": return new AppManagementPolicy();
                case "#microsoft.graph.authorizationPolicy": return new AuthorizationPolicy();
                case "#microsoft.graph.certificateAuthorityDetail": return new CertificateAuthorityDetail();
                case "#microsoft.graph.certificateBasedApplicationConfiguration": return new CertificateBasedApplicationConfiguration();
                case "#microsoft.graph.certificateBasedAuthPki": return new CertificateBasedAuthPki();
                case "#microsoft.graph.claimsMappingPolicy": return new ClaimsMappingPolicy();
                case "#microsoft.graph.contract": return new Contract();
                case "#microsoft.graph.crossTenantAccessPolicy": return new CrossTenantAccessPolicy();
                case "#microsoft.graph.device": return new Device();
                case "#microsoft.graph.directoryObjectPartnerReference": return new DirectoryObjectPartnerReference();
                case "#microsoft.graph.directoryRole": return new DirectoryRole();
                case "#microsoft.graph.directoryRoleTemplate": return new DirectoryRoleTemplate();
                case "#microsoft.graph.directorySettingTemplate": return new DirectorySettingTemplate();
                case "#microsoft.graph.endpoint": return new Endpoint();
                case "#microsoft.graph.extensionProperty": return new ExtensionProperty();
                case "#microsoft.graph.externalIdentitiesPolicy": return new ExternalIdentitiesPolicy();
                case "#microsoft.graph.externalProfile": return new ExternalProfile();
                case "#microsoft.graph.externalUserProfile": return new ExternalUserProfile();
                case "#microsoft.graph.federatedTokenValidationPolicy": return new FederatedTokenValidationPolicy();
                case "#microsoft.graph.group": return new Group();
                case "#microsoft.graph.homeRealmDiscoveryPolicy": return new HomeRealmDiscoveryPolicy();
                case "#microsoft.graph.identitySecurityDefaultsEnforcementPolicy": return new IdentitySecurityDefaultsEnforcementPolicy();
                case "#microsoft.graph.multiTenantOrganizationMember": return new MultiTenantOrganizationMember();
                case "#microsoft.graph.organization": return new Organization();
                case "#microsoft.graph.orgContact": return new OrgContact();
                case "#microsoft.graph.pendingExternalUserProfile": return new PendingExternalUserProfile();
                case "#microsoft.graph.permissionGrantPolicy": return new PermissionGrantPolicy();
                case "#microsoft.graph.permissionGrantPreApprovalPolicy": return new PermissionGrantPreApprovalPolicy();
                case "#microsoft.graph.policyBase": return new PolicyBase();
                case "#microsoft.graph.resourceSpecificPermissionGrant": return new ResourceSpecificPermissionGrant();
                case "#microsoft.graph.servicePrincipal": return new ServicePrincipal();
                case "#microsoft.graph.servicePrincipalCreationPolicy": return new ServicePrincipalCreationPolicy();
                case "#microsoft.graph.stsPolicy": return new StsPolicy();
                case "#microsoft.graph.tenantAppManagementPolicy": return new TenantAppManagementPolicy();
                case "#microsoft.graph.tenantRelationshipAccessPolicyBase": return new TenantRelationshipAccessPolicyBase();
                case "#microsoft.graph.tokenIssuancePolicy": return new TokenIssuancePolicy();
                case "#microsoft.graph.tokenLifetimePolicy": return new TokenLifetimePolicy();
                case "#microsoft.graph.trustedCertificateAuthorityAsEntityBase": return new TrustedCertificateAuthorityAsEntityBase();
                case "#microsoft.graph.user": return new User();
            }
        }
        return new DirectoryObject();
    }
    /**
     * Gets the deletedDateTime property value. Date and time when this object was deleted. Always null when the object hasn't been deleted.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeletedDateTime() {
        return this.backingStore.get("deletedDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deletedDateTime", (n) -> { this.setDeletedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("deletedDateTime", this.getDeletedDateTime());
    }
    /**
     * Sets the deletedDateTime property value. Date and time when this object was deleted. Always null when the object hasn't been deleted.
     * @param value Value to set for the deletedDateTime property.
     */
    public void setDeletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("deletedDateTime", value);
    }
}
