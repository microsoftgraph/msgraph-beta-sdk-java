package com.microsoft.graph.beta.models;

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
     * Instantiates a new {@link CloudPcOnPremisesConnection} and sets the default values.
     */
    public CloudPcOnPremisesConnection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcOnPremisesConnection}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcOnPremisesConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcOnPremisesConnection();
    }
    /**
     * Gets the adDomainName property value. The fully qualified domain name (FQDN) of the Active Directory domain you want to join. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdDomainName() {
        return this.backingStore.get("adDomainName");
    }
    /**
     * Gets the adDomainPassword property value. The password associated with adDomainUsername.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdDomainPassword() {
        return this.backingStore.get("adDomainPassword");
    }
    /**
     * Gets the adDomainUsername property value. The username of an Active Directory account (user or service account) that has permissions to create computer objects in Active Directory. Required format: admin@contoso.com. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdDomainUsername() {
        return this.backingStore.get("adDomainUsername");
    }
    /**
     * Gets the alternateResourceUrl property value. The interface URL of the partner service&apos;s resource that links to this Azure network connection. Returned only on $select.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlternateResourceUrl() {
        return this.backingStore.get("alternateResourceUrl");
    }
    /**
     * Gets the connectionType property value. Specifies the method by which a provisioned Cloud PC is joined to Microsoft Entra. The azureADJoin option indicates the absence of an on-premises Active Directory (AD) in the current tenant that results in the Cloud PC device only joining to Microsoft Entra. The hybridAzureADJoin option indicates the presence of an on-premises AD in the current tenant and that the Cloud PC joins both the on-premises AD and Microsoft Entra. The selected option also determines the types of users who can be assigned and can sign into a Cloud PC. The azureADJoin option allows both cloud-only and hybrid users to be assigned and sign in, whereas hybridAzureADJoin is restricted to hybrid users only. The default value is hybridAzureADJoin. The possible values are: hybridAzureADJoin, azureADJoin, unknownFutureValue.
     * @return a {@link CloudPcOnPremisesConnectionType}
     */
    @jakarta.annotation.Nullable
    public CloudPcOnPremisesConnectionType getConnectionType() {
        return this.backingStore.get("connectionType");
    }
    /**
     * Gets the displayName property value. The display name for the Azure network connection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("adDomainName", (n) -> { this.setAdDomainName(n.getStringValue()); });
        deserializerMap.put("adDomainPassword", (n) -> { this.setAdDomainPassword(n.getStringValue()); });
        deserializerMap.put("adDomainUsername", (n) -> { this.setAdDomainUsername(n.getStringValue()); });
        deserializerMap.put("alternateResourceUrl", (n) -> { this.setAlternateResourceUrl(n.getStringValue()); });
        deserializerMap.put("connectionType", (n) -> { this.setConnectionType(n.getEnumValue(CloudPcOnPremisesConnectionType::forValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("healthCheckPaused", (n) -> { this.setHealthCheckPaused(n.getBooleanValue()); });
        deserializerMap.put("healthCheckStatus", (n) -> { this.setHealthCheckStatus(n.getEnumValue(CloudPcOnPremisesConnectionStatus::forValue)); });
        deserializerMap.put("healthCheckStatusDetail", (n) -> { this.setHealthCheckStatusDetail(n.getObjectValue(CloudPcOnPremisesConnectionStatusDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("healthCheckStatusDetails", (n) -> { this.setHealthCheckStatusDetails(n.getObjectValue(CloudPcOnPremisesConnectionStatusDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("inUse", (n) -> { this.setInUse(n.getBooleanValue()); });
        deserializerMap.put("inUseByCloudPc", (n) -> { this.setInUseByCloudPc(n.getBooleanValue()); });
        deserializerMap.put("managedBy", (n) -> { this.setManagedBy(n.getEnumSetValue(CloudPcManagementService::forValue)); });
        deserializerMap.put("organizationalUnit", (n) -> { this.setOrganizationalUnit(n.getStringValue()); });
        deserializerMap.put("resourceGroupId", (n) -> { this.setResourceGroupId(n.getStringValue()); });
        deserializerMap.put("scopeIds", (n) -> { this.setScopeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("subnetId", (n) -> { this.setSubnetId(n.getStringValue()); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("subscriptionName", (n) -> { this.setSubscriptionName(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(CloudPcOnPremisesConnectionType::forValue)); });
        deserializerMap.put("virtualNetworkId", (n) -> { this.setVirtualNetworkId(n.getStringValue()); });
        deserializerMap.put("virtualNetworkLocation", (n) -> { this.setVirtualNetworkLocation(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthCheckPaused property value. false if the regular health checks on the network/domain configuration are currently active. true if the checks are paused. If you perform a create or update operation on a onPremisesNetworkConnection resource, this value is set to false for 4 weeks. If you retry a health check on network/domain configuration, this value is set to false for two weeks. If the onPremisesNetworkConnection resource is attached in a provisioningPolicy or used by a Cloud PC in the past 4 weeks, healthCheckPaused is set to false. Read-only. Default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHealthCheckPaused() {
        return this.backingStore.get("healthCheckPaused");
    }
    /**
     * Gets the healthCheckStatus property value. The healthCheckStatus property
     * @return a {@link CloudPcOnPremisesConnectionStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcOnPremisesConnectionStatus getHealthCheckStatus() {
        return this.backingStore.get("healthCheckStatus");
    }
    /**
     * Gets the healthCheckStatusDetail property value. Indicates the results of health checks performed on the on-premises connection. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     * @return a {@link CloudPcOnPremisesConnectionStatusDetail}
     */
    @jakarta.annotation.Nullable
    public CloudPcOnPremisesConnectionStatusDetail getHealthCheckStatusDetail() {
        return this.backingStore.get("healthCheckStatusDetail");
    }
    /**
     * Gets the healthCheckStatusDetails property value. The details of the connection&apos;s health checks and the corresponding results. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     * @return a {@link CloudPcOnPremisesConnectionStatusDetails}
     */
    @jakarta.annotation.Nullable
    public CloudPcOnPremisesConnectionStatusDetails getHealthCheckStatusDetails() {
        return this.backingStore.get("healthCheckStatusDetails");
    }
    /**
     * Gets the inUse property value. When true, the Azure network connection is in use. When false, the connection isn&apos;t in use. You can&apos;t delete a connection thats in use. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getInUse() {
        return this.backingStore.get("inUse");
    }
    /**
     * Gets the inUseByCloudPc property value. Indicates whether a Cloud PC is using this on-premises network connection. true if at least one Cloud PC is using it. Otherwise, false. Read-only. Default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getInUseByCloudPc() {
        return this.backingStore.get("inUseByCloudPc");
    }
    /**
     * Gets the managedBy property value. The managedBy property
     * @return a {@link EnumSet<CloudPcManagementService>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<CloudPcManagementService> getManagedBy() {
        return this.backingStore.get("managedBy");
    }
    /**
     * Gets the organizationalUnit property value. The organizational unit (OU) in which the computer account is created. If left null, the OU configured as the default (a well-known computer object container) in your Active Directory domain (OU) is used. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationalUnit() {
        return this.backingStore.get("organizationalUnit");
    }
    /**
     * Gets the resourceGroupId property value. The ID of the target resource group. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceGroupId() {
        return this.backingStore.get("resourceGroupId");
    }
    /**
     * Gets the scopeIds property value. The scopeIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getScopeIds() {
        return this.backingStore.get("scopeIds");
    }
    /**
     * Gets the subnetId property value. The ID of the target subnet. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkId}/subnets/{subnetName}.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubnetId() {
        return this.backingStore.get("subnetId");
    }
    /**
     * Gets the subscriptionId property value. The ID of the target Azure subscription associated with your tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.backingStore.get("subscriptionId");
    }
    /**
     * Gets the subscriptionName property value. The name of the target Azure subscription. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionName() {
        return this.backingStore.get("subscriptionName");
    }
    /**
     * Gets the type property value. Specifies the method by which a provisioned Cloud PC is joined to Microsoft Entra. The azureADJoin option indicates the absence of an on-premises Active Directory (AD) in the current tenant that results in the Cloud PC device only joining to Microsoft Entra. The hybridAzureADJoin option indicates the presence of an on-premises AD in the current tenant and that the Cloud PC joins both the on-premises AD and Microsoft Entra. The selected option also determines the types of users who can be assigned and can sign into a Cloud PC. The azureADJoin option allows both cloud-only and hybrid users to be assigned and sign in, whereas hybridAzureADJoin is restricted to hybrid users only. The default value is hybridAzureADJoin. The possible values are: hybridAzureADJoin, azureADJoin, unknownFutureValue. The type property is deprecated and stopped returning data on January 31, 2024. Going forward, use the connectionType property.
     * @return a {@link CloudPcOnPremisesConnectionType}
     */
    @jakarta.annotation.Nullable
    public CloudPcOnPremisesConnectionType getType() {
        return this.backingStore.get("type");
    }
    /**
     * Gets the virtualNetworkId property value. The ID of the target virtual network. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVirtualNetworkId() {
        return this.backingStore.get("virtualNetworkId");
    }
    /**
     * Gets the virtualNetworkLocation property value. Indicates the resource location of the virtual target network. Read-only, computed value.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVirtualNetworkLocation() {
        return this.backingStore.get("virtualNetworkLocation");
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
        writer.writeEnumValue("connectionType", this.getConnectionType());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("healthCheckPaused", this.getHealthCheckPaused());
        writer.writeEnumValue("healthCheckStatus", this.getHealthCheckStatus());
        writer.writeObjectValue("healthCheckStatusDetail", this.getHealthCheckStatusDetail());
        writer.writeObjectValue("healthCheckStatusDetails", this.getHealthCheckStatusDetails());
        writer.writeBooleanValue("inUse", this.getInUse());
        writer.writeBooleanValue("inUseByCloudPc", this.getInUseByCloudPc());
        writer.writeEnumSetValue("managedBy", this.getManagedBy());
        writer.writeStringValue("organizationalUnit", this.getOrganizationalUnit());
        writer.writeStringValue("resourceGroupId", this.getResourceGroupId());
        writer.writeCollectionOfPrimitiveValues("scopeIds", this.getScopeIds());
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
        this.backingStore.set("adDomainName", value);
    }
    /**
     * Sets the adDomainPassword property value. The password associated with adDomainUsername.
     * @param value Value to set for the adDomainPassword property.
     */
    public void setAdDomainPassword(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("adDomainPassword", value);
    }
    /**
     * Sets the adDomainUsername property value. The username of an Active Directory account (user or service account) that has permissions to create computer objects in Active Directory. Required format: admin@contoso.com. Optional.
     * @param value Value to set for the adDomainUsername property.
     */
    public void setAdDomainUsername(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("adDomainUsername", value);
    }
    /**
     * Sets the alternateResourceUrl property value. The interface URL of the partner service&apos;s resource that links to this Azure network connection. Returned only on $select.
     * @param value Value to set for the alternateResourceUrl property.
     */
    public void setAlternateResourceUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("alternateResourceUrl", value);
    }
    /**
     * Sets the connectionType property value. Specifies the method by which a provisioned Cloud PC is joined to Microsoft Entra. The azureADJoin option indicates the absence of an on-premises Active Directory (AD) in the current tenant that results in the Cloud PC device only joining to Microsoft Entra. The hybridAzureADJoin option indicates the presence of an on-premises AD in the current tenant and that the Cloud PC joins both the on-premises AD and Microsoft Entra. The selected option also determines the types of users who can be assigned and can sign into a Cloud PC. The azureADJoin option allows both cloud-only and hybrid users to be assigned and sign in, whereas hybridAzureADJoin is restricted to hybrid users only. The default value is hybridAzureADJoin. The possible values are: hybridAzureADJoin, azureADJoin, unknownFutureValue.
     * @param value Value to set for the connectionType property.
     */
    public void setConnectionType(@jakarta.annotation.Nullable final CloudPcOnPremisesConnectionType value) {
        this.backingStore.set("connectionType", value);
    }
    /**
     * Sets the displayName property value. The display name for the Azure network connection.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the healthCheckPaused property value. false if the regular health checks on the network/domain configuration are currently active. true if the checks are paused. If you perform a create or update operation on a onPremisesNetworkConnection resource, this value is set to false for 4 weeks. If you retry a health check on network/domain configuration, this value is set to false for two weeks. If the onPremisesNetworkConnection resource is attached in a provisioningPolicy or used by a Cloud PC in the past 4 weeks, healthCheckPaused is set to false. Read-only. Default is false.
     * @param value Value to set for the healthCheckPaused property.
     */
    public void setHealthCheckPaused(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("healthCheckPaused", value);
    }
    /**
     * Sets the healthCheckStatus property value. The healthCheckStatus property
     * @param value Value to set for the healthCheckStatus property.
     */
    public void setHealthCheckStatus(@jakarta.annotation.Nullable final CloudPcOnPremisesConnectionStatus value) {
        this.backingStore.set("healthCheckStatus", value);
    }
    /**
     * Sets the healthCheckStatusDetail property value. Indicates the results of health checks performed on the on-premises connection. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     * @param value Value to set for the healthCheckStatusDetail property.
     */
    public void setHealthCheckStatusDetail(@jakarta.annotation.Nullable final CloudPcOnPremisesConnectionStatusDetail value) {
        this.backingStore.set("healthCheckStatusDetail", value);
    }
    /**
     * Sets the healthCheckStatusDetails property value. The details of the connection&apos;s health checks and the corresponding results. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     * @param value Value to set for the healthCheckStatusDetails property.
     */
    public void setHealthCheckStatusDetails(@jakarta.annotation.Nullable final CloudPcOnPremisesConnectionStatusDetails value) {
        this.backingStore.set("healthCheckStatusDetails", value);
    }
    /**
     * Sets the inUse property value. When true, the Azure network connection is in use. When false, the connection isn&apos;t in use. You can&apos;t delete a connection thats in use. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     * @param value Value to set for the inUse property.
     */
    public void setInUse(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("inUse", value);
    }
    /**
     * Sets the inUseByCloudPc property value. Indicates whether a Cloud PC is using this on-premises network connection. true if at least one Cloud PC is using it. Otherwise, false. Read-only. Default is false.
     * @param value Value to set for the inUseByCloudPc property.
     */
    public void setInUseByCloudPc(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("inUseByCloudPc", value);
    }
    /**
     * Sets the managedBy property value. The managedBy property
     * @param value Value to set for the managedBy property.
     */
    public void setManagedBy(@jakarta.annotation.Nullable final EnumSet<CloudPcManagementService> value) {
        this.backingStore.set("managedBy", value);
    }
    /**
     * Sets the organizationalUnit property value. The organizational unit (OU) in which the computer account is created. If left null, the OU configured as the default (a well-known computer object container) in your Active Directory domain (OU) is used. Optional.
     * @param value Value to set for the organizationalUnit property.
     */
    public void setOrganizationalUnit(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("organizationalUnit", value);
    }
    /**
     * Sets the resourceGroupId property value. The ID of the target resource group. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}.
     * @param value Value to set for the resourceGroupId property.
     */
    public void setResourceGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceGroupId", value);
    }
    /**
     * Sets the scopeIds property value. The scopeIds property
     * @param value Value to set for the scopeIds property.
     */
    public void setScopeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("scopeIds", value);
    }
    /**
     * Sets the subnetId property value. The ID of the target subnet. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkId}/subnets/{subnetName}.
     * @param value Value to set for the subnetId property.
     */
    public void setSubnetId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subnetId", value);
    }
    /**
     * Sets the subscriptionId property value. The ID of the target Azure subscription associated with your tenant.
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subscriptionId", value);
    }
    /**
     * Sets the subscriptionName property value. The name of the target Azure subscription. Read-only.
     * @param value Value to set for the subscriptionName property.
     */
    public void setSubscriptionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subscriptionName", value);
    }
    /**
     * Sets the type property value. Specifies the method by which a provisioned Cloud PC is joined to Microsoft Entra. The azureADJoin option indicates the absence of an on-premises Active Directory (AD) in the current tenant that results in the Cloud PC device only joining to Microsoft Entra. The hybridAzureADJoin option indicates the presence of an on-premises AD in the current tenant and that the Cloud PC joins both the on-premises AD and Microsoft Entra. The selected option also determines the types of users who can be assigned and can sign into a Cloud PC. The azureADJoin option allows both cloud-only and hybrid users to be assigned and sign in, whereas hybridAzureADJoin is restricted to hybrid users only. The default value is hybridAzureADJoin. The possible values are: hybridAzureADJoin, azureADJoin, unknownFutureValue. The type property is deprecated and stopped returning data on January 31, 2024. Going forward, use the connectionType property.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final CloudPcOnPremisesConnectionType value) {
        this.backingStore.set("type", value);
    }
    /**
     * Sets the virtualNetworkId property value. The ID of the target virtual network. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}.
     * @param value Value to set for the virtualNetworkId property.
     */
    public void setVirtualNetworkId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("virtualNetworkId", value);
    }
    /**
     * Sets the virtualNetworkLocation property value. Indicates the resource location of the virtual target network. Read-only, computed value.
     * @param value Value to set for the virtualNetworkLocation property.
     */
    public void setVirtualNetworkLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("virtualNetworkLocation", value);
    }
}
