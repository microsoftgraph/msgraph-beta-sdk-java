package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcOnPremisesConnection extends Entity implements Parsable {
    /** The fully qualified domain name (FQDN) of the Active Directory domain you want to join. Optional. */
    private String _adDomainName;
    /** The password associated with adDomainUsername. */
    private String _adDomainPassword;
    /** The username of an Active Directory account (user or service account) that has permissions to create computer objects in Active Directory. Required format: admin@contoso.com. Optional. */
    private String _adDomainUsername;
    /** The interface URL of the partner service's resource that links to this Azure network connection. Returned only on $select. */
    private String _alternateResourceUrl;
    /** The display name for the Azure network connection. */
    private String _displayName;
    /** The healthCheckStatus property */
    private CloudPcOnPremisesConnectionStatus _healthCheckStatus;
    /** The details of the connection's health checks and the corresponding results. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only. */
    private CloudPcOnPremisesConnectionStatusDetails _healthCheckStatusDetails;
    /** When true, the Azure network connection is in use. When false, the connection is not in use. You cannot delete a connection thats in use. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only. */
    private Boolean _inUse;
    /** The managedBy property */
    private CloudPcManagementService _managedBy;
    /** The organizational unit (OU) in which the computer account is created. If left null, the OU thats configured as the default (a well-known computer object container) in your Active Directory domain (OU) is used. Optional. */
    private String _organizationalUnit;
    /** The ID of the target resource group. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}. */
    private String _resourceGroupId;
    /** The ID of the target subnet. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkId}/subnets/{subnetName}. */
    private String _subnetId;
    /** The ID of the target Azure subscription thats associated with your tenant. */
    private String _subscriptionId;
    /** The name of the target Azure subscription. Read-only. */
    private String _subscriptionName;
    /** Specifies how the provisioned Cloud PC will be joined to Azure Active Directory. Default value is hybridAzureADJoin. Possible values are: azureADJoin, hybridAzureADJoin, unknownFutureValue. */
    private CloudPcOnPremisesConnectionType _type;
    /** The ID of the target virtual network. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}. */
    private String _virtualNetworkId;
    /**
     * Instantiates a new CloudPcOnPremisesConnection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcOnPremisesConnection() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcOnPremisesConnection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcOnPremisesConnection
     */
    @javax.annotation.Nonnull
    public static CloudPcOnPremisesConnection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcOnPremisesConnection();
    }
    /**
     * Gets the adDomainName property value. The fully qualified domain name (FQDN) of the Active Directory domain you want to join. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdDomainName() {
        return this._adDomainName;
    }
    /**
     * Gets the adDomainPassword property value. The password associated with adDomainUsername.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdDomainPassword() {
        return this._adDomainPassword;
    }
    /**
     * Gets the adDomainUsername property value. The username of an Active Directory account (user or service account) that has permissions to create computer objects in Active Directory. Required format: admin@contoso.com. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAdDomainUsername() {
        return this._adDomainUsername;
    }
    /**
     * Gets the alternateResourceUrl property value. The interface URL of the partner service's resource that links to this Azure network connection. Returned only on $select.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlternateResourceUrl() {
        return this._alternateResourceUrl;
    }
    /**
     * Gets the displayName property value. The display name for the Azure network connection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcOnPremisesConnection currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("adDomainName", (n) -> { currentObject.setAdDomainName(n.getStringValue()); });
        deserializerMap.put("adDomainPassword", (n) -> { currentObject.setAdDomainPassword(n.getStringValue()); });
        deserializerMap.put("adDomainUsername", (n) -> { currentObject.setAdDomainUsername(n.getStringValue()); });
        deserializerMap.put("alternateResourceUrl", (n) -> { currentObject.setAlternateResourceUrl(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("healthCheckStatus", (n) -> { currentObject.setHealthCheckStatus(n.getEnumValue(CloudPcOnPremisesConnectionStatus.class)); });
        deserializerMap.put("healthCheckStatusDetails", (n) -> { currentObject.setHealthCheckStatusDetails(n.getObjectValue(CloudPcOnPremisesConnectionStatusDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("inUse", (n) -> { currentObject.setInUse(n.getBooleanValue()); });
        deserializerMap.put("managedBy", (n) -> { currentObject.setManagedBy(n.getEnumValue(CloudPcManagementService.class)); });
        deserializerMap.put("organizationalUnit", (n) -> { currentObject.setOrganizationalUnit(n.getStringValue()); });
        deserializerMap.put("resourceGroupId", (n) -> { currentObject.setResourceGroupId(n.getStringValue()); });
        deserializerMap.put("subnetId", (n) -> { currentObject.setSubnetId(n.getStringValue()); });
        deserializerMap.put("subscriptionId", (n) -> { currentObject.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("subscriptionName", (n) -> { currentObject.setSubscriptionName(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { currentObject.setType(n.getEnumValue(CloudPcOnPremisesConnectionType.class)); });
        deserializerMap.put("virtualNetworkId", (n) -> { currentObject.setVirtualNetworkId(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the healthCheckStatus property value. The healthCheckStatus property
     * @return a cloudPcOnPremisesConnectionStatus
     */
    @javax.annotation.Nullable
    public CloudPcOnPremisesConnectionStatus getHealthCheckStatus() {
        return this._healthCheckStatus;
    }
    /**
     * Gets the healthCheckStatusDetails property value. The details of the connection's health checks and the corresponding results. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     * @return a cloudPcOnPremisesConnectionStatusDetails
     */
    @javax.annotation.Nullable
    public CloudPcOnPremisesConnectionStatusDetails getHealthCheckStatusDetails() {
        return this._healthCheckStatusDetails;
    }
    /**
     * Gets the inUse property value. When true, the Azure network connection is in use. When false, the connection is not in use. You cannot delete a connection thats in use. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInUse() {
        return this._inUse;
    }
    /**
     * Gets the managedBy property value. The managedBy property
     * @return a cloudPcManagementService
     */
    @javax.annotation.Nullable
    public CloudPcManagementService getManagedBy() {
        return this._managedBy;
    }
    /**
     * Gets the organizationalUnit property value. The organizational unit (OU) in which the computer account is created. If left null, the OU thats configured as the default (a well-known computer object container) in your Active Directory domain (OU) is used. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganizationalUnit() {
        return this._organizationalUnit;
    }
    /**
     * Gets the resourceGroupId property value. The ID of the target resource group. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceGroupId() {
        return this._resourceGroupId;
    }
    /**
     * Gets the subnetId property value. The ID of the target subnet. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkId}/subnets/{subnetName}.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubnetId() {
        return this._subnetId;
    }
    /**
     * Gets the subscriptionId property value. The ID of the target Azure subscription thats associated with your tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriptionId() {
        return this._subscriptionId;
    }
    /**
     * Gets the subscriptionName property value. The name of the target Azure subscription. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriptionName() {
        return this._subscriptionName;
    }
    /**
     * Gets the type property value. Specifies how the provisioned Cloud PC will be joined to Azure Active Directory. Default value is hybridAzureADJoin. Possible values are: azureADJoin, hybridAzureADJoin, unknownFutureValue.
     * @return a cloudPcOnPremisesConnectionType
     */
    @javax.annotation.Nullable
    public CloudPcOnPremisesConnectionType getType() {
        return this._type;
    }
    /**
     * Gets the virtualNetworkId property value. The ID of the target virtual network. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVirtualNetworkId() {
        return this._virtualNetworkId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
        writer.writeEnumValue("managedBy", this.getManagedBy());
        writer.writeStringValue("organizationalUnit", this.getOrganizationalUnit());
        writer.writeStringValue("resourceGroupId", this.getResourceGroupId());
        writer.writeStringValue("subnetId", this.getSubnetId());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("subscriptionName", this.getSubscriptionName());
        writer.writeEnumValue("type", this.getType());
        writer.writeStringValue("virtualNetworkId", this.getVirtualNetworkId());
    }
    /**
     * Sets the adDomainName property value. The fully qualified domain name (FQDN) of the Active Directory domain you want to join. Optional.
     * @param value Value to set for the adDomainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdDomainName(@javax.annotation.Nullable final String value) {
        this._adDomainName = value;
    }
    /**
     * Sets the adDomainPassword property value. The password associated with adDomainUsername.
     * @param value Value to set for the adDomainPassword property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdDomainPassword(@javax.annotation.Nullable final String value) {
        this._adDomainPassword = value;
    }
    /**
     * Sets the adDomainUsername property value. The username of an Active Directory account (user or service account) that has permissions to create computer objects in Active Directory. Required format: admin@contoso.com. Optional.
     * @param value Value to set for the adDomainUsername property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdDomainUsername(@javax.annotation.Nullable final String value) {
        this._adDomainUsername = value;
    }
    /**
     * Sets the alternateResourceUrl property value. The interface URL of the partner service's resource that links to this Azure network connection. Returned only on $select.
     * @param value Value to set for the alternateResourceUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlternateResourceUrl(@javax.annotation.Nullable final String value) {
        this._alternateResourceUrl = value;
    }
    /**
     * Sets the displayName property value. The display name for the Azure network connection.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the healthCheckStatus property value. The healthCheckStatus property
     * @param value Value to set for the healthCheckStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthCheckStatus(@javax.annotation.Nullable final CloudPcOnPremisesConnectionStatus value) {
        this._healthCheckStatus = value;
    }
    /**
     * Sets the healthCheckStatusDetails property value. The details of the connection's health checks and the corresponding results. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     * @param value Value to set for the healthCheckStatusDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthCheckStatusDetails(@javax.annotation.Nullable final CloudPcOnPremisesConnectionStatusDetails value) {
        this._healthCheckStatusDetails = value;
    }
    /**
     * Sets the inUse property value. When true, the Azure network connection is in use. When false, the connection is not in use. You cannot delete a connection thats in use. Returned only on $select. For an example that shows how to get the inUse property, see Example 2: Get the selected properties of an Azure network connection, including healthCheckStatusDetails. Read-only.
     * @param value Value to set for the inUse property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInUse(@javax.annotation.Nullable final Boolean value) {
        this._inUse = value;
    }
    /**
     * Sets the managedBy property value. The managedBy property
     * @param value Value to set for the managedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedBy(@javax.annotation.Nullable final CloudPcManagementService value) {
        this._managedBy = value;
    }
    /**
     * Sets the organizationalUnit property value. The organizational unit (OU) in which the computer account is created. If left null, the OU thats configured as the default (a well-known computer object container) in your Active Directory domain (OU) is used. Optional.
     * @param value Value to set for the organizationalUnit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationalUnit(@javax.annotation.Nullable final String value) {
        this._organizationalUnit = value;
    }
    /**
     * Sets the resourceGroupId property value. The ID of the target resource group. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}.
     * @param value Value to set for the resourceGroupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceGroupId(@javax.annotation.Nullable final String value) {
        this._resourceGroupId = value;
    }
    /**
     * Sets the subnetId property value. The ID of the target subnet. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkId}/subnets/{subnetName}.
     * @param value Value to set for the subnetId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubnetId(@javax.annotation.Nullable final String value) {
        this._subnetId = value;
    }
    /**
     * Sets the subscriptionId property value. The ID of the target Azure subscription thats associated with your tenant.
     * @param value Value to set for the subscriptionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionId(@javax.annotation.Nullable final String value) {
        this._subscriptionId = value;
    }
    /**
     * Sets the subscriptionName property value. The name of the target Azure subscription. Read-only.
     * @param value Value to set for the subscriptionName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriptionName(@javax.annotation.Nullable final String value) {
        this._subscriptionName = value;
    }
    /**
     * Sets the type property value. Specifies how the provisioned Cloud PC will be joined to Azure Active Directory. Default value is hybridAzureADJoin. Possible values are: azureADJoin, hybridAzureADJoin, unknownFutureValue.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final CloudPcOnPremisesConnectionType value) {
        this._type = value;
    }
    /**
     * Sets the virtualNetworkId property value. The ID of the target virtual network. Required format: /subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}.
     * @param value Value to set for the virtualNetworkId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVirtualNetworkId(@javax.annotation.Nullable final String value) {
        this._virtualNetworkId = value;
    }
}
