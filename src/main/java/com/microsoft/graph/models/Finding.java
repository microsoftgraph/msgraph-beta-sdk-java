package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Finding extends Entity implements Parsable {
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * Instantiates a new Finding and sets the default values.
     */
    public Finding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Finding
     */
    @jakarta.annotation.Nonnull
    public static Finding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.awsExternalSystemAccessFinding": return new AwsExternalSystemAccessFinding();
                case "#microsoft.graph.awsExternalSystemAccessRoleFinding": return new AwsExternalSystemAccessRoleFinding();
                case "#microsoft.graph.awsIdentityAccessManagementKeyAgeFinding": return new AwsIdentityAccessManagementKeyAgeFinding();
                case "#microsoft.graph.awsIdentityAccessManagementKeyUsageFinding": return new AwsIdentityAccessManagementKeyUsageFinding();
                case "#microsoft.graph.awsSecretInformationAccessFinding": return new AwsSecretInformationAccessFinding();
                case "#microsoft.graph.awsSecurityToolAdministrationFinding": return new AwsSecurityToolAdministrationFinding();
                case "#microsoft.graph.encryptedAwsStorageBucketFinding": return new EncryptedAwsStorageBucketFinding();
                case "#microsoft.graph.encryptedAzureStorageAccountFinding": return new EncryptedAzureStorageAccountFinding();
                case "#microsoft.graph.encryptedGcpStorageBucketFinding": return new EncryptedGcpStorageBucketFinding();
                case "#microsoft.graph.externallyAccessibleAwsStorageBucketFinding": return new ExternallyAccessibleAwsStorageBucketFinding();
                case "#microsoft.graph.externallyAccessibleAzureBlobContainerFinding": return new ExternallyAccessibleAzureBlobContainerFinding();
                case "#microsoft.graph.externallyAccessibleGcpStorageBucketFinding": return new ExternallyAccessibleGcpStorageBucketFinding();
                case "#microsoft.graph.identityFinding": return new IdentityFinding();
                case "#microsoft.graph.inactiveAwsResourceFinding": return new InactiveAwsResourceFinding();
                case "#microsoft.graph.inactiveAwsRoleFinding": return new InactiveAwsRoleFinding();
                case "#microsoft.graph.inactiveAzureServicePrincipalFinding": return new InactiveAzureServicePrincipalFinding();
                case "#microsoft.graph.inactiveGcpServiceAccountFinding": return new InactiveGcpServiceAccountFinding();
                case "#microsoft.graph.inactiveGroupFinding": return new InactiveGroupFinding();
                case "#microsoft.graph.inactiveServerlessFunctionFinding": return new InactiveServerlessFunctionFinding();
                case "#microsoft.graph.inactiveUserFinding": return new InactiveUserFinding();
                case "#microsoft.graph.openAwsSecurityGroupFinding": return new OpenAwsSecurityGroupFinding();
                case "#microsoft.graph.openNetworkAzureSecurityGroupFinding": return new OpenNetworkAzureSecurityGroupFinding();
                case "#microsoft.graph.overprovisionedAwsResourceFinding": return new OverprovisionedAwsResourceFinding();
                case "#microsoft.graph.overprovisionedAwsRoleFinding": return new OverprovisionedAwsRoleFinding();
                case "#microsoft.graph.overprovisionedAzureServicePrincipalFinding": return new OverprovisionedAzureServicePrincipalFinding();
                case "#microsoft.graph.overprovisionedGcpServiceAccountFinding": return new OverprovisionedGcpServiceAccountFinding();
                case "#microsoft.graph.overprovisionedServerlessFunctionFinding": return new OverprovisionedServerlessFunctionFinding();
                case "#microsoft.graph.overprovisionedUserFinding": return new OverprovisionedUserFinding();
                case "#microsoft.graph.privilegeEscalationAwsResourceFinding": return new PrivilegeEscalationAwsResourceFinding();
                case "#microsoft.graph.privilegeEscalationAwsRoleFinding": return new PrivilegeEscalationAwsRoleFinding();
                case "#microsoft.graph.privilegeEscalationFinding": return new PrivilegeEscalationFinding();
                case "#microsoft.graph.privilegeEscalationGcpServiceAccountFinding": return new PrivilegeEscalationGcpServiceAccountFinding();
                case "#microsoft.graph.privilegeEscalationUserFinding": return new PrivilegeEscalationUserFinding();
                case "#microsoft.graph.secretInformationAccessAwsResourceFinding": return new SecretInformationAccessAwsResourceFinding();
                case "#microsoft.graph.secretInformationAccessAwsRoleFinding": return new SecretInformationAccessAwsRoleFinding();
                case "#microsoft.graph.secretInformationAccessAwsServerlessFunctionFinding": return new SecretInformationAccessAwsServerlessFunctionFinding();
                case "#microsoft.graph.secretInformationAccessAwsUserFinding": return new SecretInformationAccessAwsUserFinding();
                case "#microsoft.graph.securityToolAwsResourceAdministratorFinding": return new SecurityToolAwsResourceAdministratorFinding();
                case "#microsoft.graph.securityToolAwsRoleAdministratorFinding": return new SecurityToolAwsRoleAdministratorFinding();
                case "#microsoft.graph.securityToolAwsServerlessFunctionAdministratorFinding": return new SecurityToolAwsServerlessFunctionAdministratorFinding();
                case "#microsoft.graph.securityToolAwsUserAdministratorFinding": return new SecurityToolAwsUserAdministratorFinding();
                case "#microsoft.graph.superAwsResourceFinding": return new SuperAwsResourceFinding();
                case "#microsoft.graph.superAwsRoleFinding": return new SuperAwsRoleFinding();
                case "#microsoft.graph.superAzureServicePrincipalFinding": return new SuperAzureServicePrincipalFinding();
                case "#microsoft.graph.superGcpServiceAccountFinding": return new SuperGcpServiceAccountFinding();
                case "#microsoft.graph.superServerlessFunctionFinding": return new SuperServerlessFunctionFinding();
                case "#microsoft.graph.superUserFinding": return new SuperUserFinding();
                case "#microsoft.graph.unenforcedMfaAwsUserFinding": return new UnenforcedMfaAwsUserFinding();
                case "#microsoft.graph.virtualMachineWithAwsStorageBucketAccessFinding": return new VirtualMachineWithAwsStorageBucketAccessFinding();
            }
        }
        return new Finding();
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
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
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
}
