package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcOnPremisesConnection extends Entity implements Parsable {
    /**
     * The fully qualified domain name (FQDN) of the Active Directory domain you want to join. Optional.
     */
    private String adDomainName;
    /**
     * The password associated with adDomainUsername.
     */
    private String adDomainPassword;
    /**
     * The username of an Active Directory account (user or service account) that has permissions to create computer objects in Active Directory. Required format: admin@contoso.com. Optional.
     */
    private String adDomainUsername;
    /**
     * The interface URL of the partner service's resource that links to this Azure network connection. Returned only on $select.
     */
    private String alternateResourceUrl;
    /**
     * The display name for the Azure network connection.
     */
    private String displayName;
    /**
     * The healthCheckStatus property
     */
    private CloudPcOnPremisesConnectionStatus healthCheckStatus;
    /**
     * The details of the connection's health checks and the corresponding results. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     */
    private CloudPcOnPremisesConnectionStatusDetails healthCheckStatusDetails;
    /**
     * When true, the Azure network connection is in use. When false, the connection isn't in use. You can't delete a connection thats in use. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     */
    private Boolean inUse;
    /**
     * The managedBy property
     */
    private EnumSet<CloudPcManagementService> managedBy;
    /**
     * The organizational unit (OU) in which the computer account is created. If left null, the OU thats configured as the default (a well-known computer object container) in your Active Directory domain (OU) is used. Optional.
     */
    private String organizationalUnit;
    /**
     * The ID of the target resource group. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}.
     */
    private String resourceGroupId;
    /**
     * The ID of the target subnet. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkId}/subnets/{subnetName}.
     */
    private String subnetId;
    /**
     * The ID of the target Azure subscription thats associated with your tenant.
     */
    private String subscriptionId;
    /**
     * The name of the target Azure subscription. Read-only.
     */
    private String subscriptionName;
    /**
     * Specifies how the provisioned Cloud PC is joined to Microsoft Entra ID. Default value is hybridAzureADJoin. Possible values are: azureADJoin, hybridAzureADJoin, unknownFutureValue.
     */
    private CloudPcOnPremisesConnectionType type;
    /**
     * The ID of the target virtual network. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}.
     */
    private String virtualNetworkId;
    /**
     * Indicates resource location of the virtual target network. Read-only, computed value.
     */
    private String virtualNetworkLocation;
    /**
     * Instantiates a new CloudPcOnPremisesConnection and sets the default values.
     */
    public CloudPcOnPremisesConnection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcOnPremisesConnection
     */
    @jakarta.annotation.Nonnull
    public static CloudPcOnPremisesConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcOnPremisesConnection();
    }
    /**
     * Gets the adDomainName property value. The fully qualified domain name (FQDN) of the Active Directory domain you want to join. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdDomainName() {
        return this.adDomainName;
    }
    /**
     * Gets the adDomainPassword property value. The password associated with adDomainUsername.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdDomainPassword() {
        return this.adDomainPassword;
    }
    /**
     * Gets the adDomainUsername property value. The username of an Active Directory account (user or service account) that has permissions to create computer objects in Active Directory. Required format: admin@contoso.com. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdDomainUsername() {
        return this.adDomainUsername;
    }
    /**
     * Gets the alternateResourceUrl property value. The interface URL of the partner service's resource that links to this Azure network connection. Returned only on $select.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAlternateResourceUrl() {
        return this.alternateResourceUrl;
    }
    /**
     * Gets the displayName property value. The display name for the Azure network connection.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("adDomainName", (n) -> { this.setAdDomainName(n.getStringValue()); });
        deserializerMap.put("adDomainPassword", (n) -> { this.setAdDomainPassword(n.getStringValue()); });
        deserializerMap.put("adDomainUsername", (n) -> { this.setAdDomainUsername(n.getStringValue()); });
        deserializerMap.put("alternateResourceUrl", (n) -> { this.setAlternateResourceUrl(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("healthCheckStatus", (n) -> { this.setHealthCheckStatus(n.getEnumValue(CloudPcOnPremisesConnectionStatus.class)); });
        deserializerMap.put("healthCheckStatusDetails", (n) -> { this.setHealthCheckStatusDetails(n.getObjectValue(CloudPcOnPremisesConnectionStatusDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("inUse", (n) -> { this.setInUse(n.getBooleanValue()); });
        deserializerMap.put("managedBy", (n) -> { this.setManagedBy(n.getEnumSetValue(CloudPcManagementService.class)); });
        deserializerMap.put("organizationalUnit", (n) -> { this.setOrganizationalUnit(n.getStringValue()); });
        deserializerMap.put("resourceGroupId", (n) -> { this.setResourceGroupId(n.getStringValue()); });
        deserializerMap.put("subnetId", (n) -> { this.setSubnetId(n.getStringValue()); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("subscriptionName", (n) -> { this.setSubscriptionName(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(CloudPcOnPremisesConnectionType.class)); });
        deserializerMap.put("virtualNetworkId", (n) -> { this.setVirtualNetworkId(n.getStringValue()); });
        deserializerMap.put("virtualNetworkLocation", (n) -> { this.setVirtualNetworkLocation(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthCheckStatus property value. The healthCheckStatus property
     * @return a CloudPcOnPremisesConnectionStatus
     */
    @jakarta.annotation.Nullable
    public CloudPcOnPremisesConnectionStatus getHealthCheckStatus() {
        return this.healthCheckStatus;
    }
    /**
     * Gets the healthCheckStatusDetails property value. The details of the connection's health checks and the corresponding results. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     * @return a CloudPcOnPremisesConnectionStatusDetails
     */
    @jakarta.annotation.Nullable
    public CloudPcOnPremisesConnectionStatusDetails getHealthCheckStatusDetails() {
        return this.healthCheckStatusDetails;
    }
    /**
     * Gets the inUse property value. When true, the Azure network connection is in use. When false, the connection isn't in use. You can't delete a connection thats in use. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getInUse() {
        return this.inUse;
    }
    /**
     * Gets the managedBy property value. The managedBy property
     * @return a EnumSet<CloudPcManagementService>
     */
    @jakarta.annotation.Nullable
    public EnumSet<CloudPcManagementService> getManagedBy() {
        return this.managedBy;
    }
    /**
     * Gets the organizationalUnit property value. The organizational unit (OU) in which the computer account is created. If left null, the OU thats configured as the default (a well-known computer object container) in your Active Directory domain (OU) is used. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrganizationalUnit() {
        return this.organizationalUnit;
    }
    /**
     * Gets the resourceGroupId property value. The ID of the target resource group. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * Gets the subnetId property value. The ID of the target subnet. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkId}/subnets/{subnetName}.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubnetId() {
        return this.subnetId;
    }
    /**
     * Gets the subscriptionId property value. The ID of the target Azure subscription thats associated with your tenant.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Gets the subscriptionName property value. The name of the target Azure subscription. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionName() {
        return this.subscriptionName;
    }
    /**
     * Gets the type property value. Specifies how the provisioned Cloud PC is joined to Microsoft Entra ID. Default value is hybridAzureADJoin. Possible values are: azureADJoin, hybridAzureADJoin, unknownFutureValue.
     * @return a CloudPcOnPremisesConnectionType
     */
    @jakarta.annotation.Nullable
    public CloudPcOnPremisesConnectionType getType() {
        return this.type;
    }
    /**
     * Gets the virtualNetworkId property value. The ID of the target virtual network. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVirtualNetworkId() {
        return this.virtualNetworkId;
    }
    /**
     * Gets the virtualNetworkLocation property value. Indicates resource location of the virtual target network. Read-only, computed value.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVirtualNetworkLocation() {
        return this.virtualNetworkLocation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("adDomainName", this.getAdDomainName());
        writer.writeStringValue("adDomainPassword", this.getAdDomainPassword());
        writer.writeStringValue("adDomainUsername", this.getAdDomainUsername());
        writer.writeStringValue("alternateResourceUrl", this.getAlternateResourceUrl());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("healthCheckStatus", this.getHealthCheckStatus());
        writer.writeObjectValue("healthCheckStatusDetails", this.getHealthCheckStatusDetails());
        writer.writeBooleanValue("inUse", this.getInUse());
        writer.writeEnumSetValue("managedBy", this.getManagedBy());
        writer.writeStringValue("organizationalUnit", this.getOrganizationalUnit());
        writer.writeStringValue("resourceGroupId", this.getResourceGroupId());
        writer.writeStringValue("subnetId", this.getSubnetId());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("subscriptionName", this.getSubscriptionName());
        writer.writeEnumValue("type", this.getType());
        writer.writeStringValue("virtualNetworkId", this.getVirtualNetworkId());
        writer.writeStringValue("virtualNetworkLocation", this.getVirtualNetworkLocation());
    }
    /**
     * Sets the adDomainName property value. The fully qualified domain name (FQDN) of the Active Directory domain you want to join. Optional.
     * @param value Value to set for the adDomainName property.
     */
    public void setAdDomainName(@jakarta.annotation.Nullable final String value) {
        this.adDomainName = value;
    }
    /**
     * Sets the adDomainPassword property value. The password associated with adDomainUsername.
     * @param value Value to set for the adDomainPassword property.
     */
    public void setAdDomainPassword(@jakarta.annotation.Nullable final String value) {
        this.adDomainPassword = value;
    }
    /**
     * Sets the adDomainUsername property value. The username of an Active Directory account (user or service account) that has permissions to create computer objects in Active Directory. Required format: admin@contoso.com. Optional.
     * @param value Value to set for the adDomainUsername property.
     */
    public void setAdDomainUsername(@jakarta.annotation.Nullable final String value) {
        this.adDomainUsername = value;
    }
    /**
     * Sets the alternateResourceUrl property value. The interface URL of the partner service's resource that links to this Azure network connection. Returned only on $select.
     * @param value Value to set for the alternateResourceUrl property.
     */
    public void setAlternateResourceUrl(@jakarta.annotation.Nullable final String value) {
        this.alternateResourceUrl = value;
    }
    /**
     * Sets the displayName property value. The display name for the Azure network connection.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the healthCheckStatus property value. The healthCheckStatus property
     * @param value Value to set for the healthCheckStatus property.
     */
    public void setHealthCheckStatus(@jakarta.annotation.Nullable final CloudPcOnPremisesConnectionStatus value) {
        this.healthCheckStatus = value;
    }
    /**
     * Sets the healthCheckStatusDetails property value. The details of the connection's health checks and the corresponding results. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     * @param value Value to set for the healthCheckStatusDetails property.
     */
    public void setHealthCheckStatusDetails(@jakarta.annotation.Nullable final CloudPcOnPremisesConnectionStatusDetails value) {
        this.healthCheckStatusDetails = value;
    }
    /**
     * Sets the inUse property value. When true, the Azure network connection is in use. When false, the connection isn't in use. You can't delete a connection thats in use. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     * @param value Value to set for the inUse property.
     */
    public void setInUse(@jakarta.annotation.Nullable final Boolean value) {
        this.inUse = value;
    }
    /**
     * Sets the managedBy property value. The managedBy property
     * @param value Value to set for the managedBy property.
     */
    public void setManagedBy(@jakarta.annotation.Nullable final EnumSet<CloudPcManagementService> value) {
        this.managedBy = value;
    }
    /**
     * Sets the organizationalUnit property value. The organizational unit (OU) in which the computer account is created. If left null, the OU thats configured as the default (a well-known computer object container) in your Active Directory domain (OU) is used. Optional.
     * @param value Value to set for the organizationalUnit property.
     */
    public void setOrganizationalUnit(@jakarta.annotation.Nullable final String value) {
        this.organizationalUnit = value;
    }
    /**
     * Sets the resourceGroupId property value. The ID of the target resource group. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}.
     * @param value Value to set for the resourceGroupId property.
     */
    public void setResourceGroupId(@jakarta.annotation.Nullable final String value) {
        this.resourceGroupId = value;
    }
    /**
     * Sets the subnetId property value. The ID of the target subnet. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkId}/subnets/{subnetName}.
     * @param value Value to set for the subnetId property.
     */
    public void setSubnetId(@jakarta.annotation.Nullable final String value) {
        this.subnetId = value;
    }
    /**
     * Sets the subscriptionId property value. The ID of the target Azure subscription thats associated with your tenant.
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.subscriptionId = value;
    }
    /**
     * Sets the subscriptionName property value. The name of the target Azure subscription. Read-only.
     * @param value Value to set for the subscriptionName property.
     */
    public void setSubscriptionName(@jakarta.annotation.Nullable final String value) {
        this.subscriptionName = value;
    }
    /**
     * Sets the type property value. Specifies how the provisioned Cloud PC is joined to Microsoft Entra ID. Default value is hybridAzureADJoin. Possible values are: azureADJoin, hybridAzureADJoin, unknownFutureValue.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final CloudPcOnPremisesConnectionType value) {
        this.type = value;
    }
    /**
     * Sets the virtualNetworkId property value. The ID of the target virtual network. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}.
     * @param value Value to set for the virtualNetworkId property.
     */
    public void setVirtualNetworkId(@jakarta.annotation.Nullable final String value) {
        this.virtualNetworkId = value;
    }
    /**
     * Sets the virtualNetworkLocation property value. Indicates resource location of the virtual target network. Read-only, computed value.
     * @param value Value to set for the virtualNetworkLocation property.
     */
    public void setVirtualNetworkLocation(@jakarta.annotation.Nullable final String value) {
        this.virtualNetworkLocation = value;
    }
}
