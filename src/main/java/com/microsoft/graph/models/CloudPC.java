package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPC extends Entity implements Parsable {
    /**
     * Instantiates a new CloudPC and sets the default values.
     */
    public CloudPC() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPC
     */
    @jakarta.annotation.Nonnull
    public static CloudPC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPC();
    }
    /**
     * Gets the aadDeviceId property value. The Microsoft Entra device ID of the Cloud PC.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAadDeviceId() {
        return this.BackingStore.get("aadDeviceId");
    }
    /**
     * Gets the connectionSettings property value. The connectionSettings property
     * @return a CloudPcConnectionSettings
     */
    @jakarta.annotation.Nullable
    public CloudPcConnectionSettings getConnectionSettings() {
        return this.BackingStore.get("connectionSettings");
    }
    /**
     * Gets the connectivityResult property value. The connectivity health check result of a Cloud PC, including the updated timestamp and whether the Cloud PC can be connected.
     * @return a CloudPcConnectivityResult
     */
    @jakarta.annotation.Nullable
    public CloudPcConnectivityResult getConnectivityResult() {
        return this.BackingStore.get("connectivityResult");
    }
    /**
     * Gets the diskEncryptionState property value. The disk encryption applied to the Cloud PC. Possible values: notAvailable, notEncrypted, encryptedUsingPlatformManagedKey, encryptedUsingCustomerManagedKey, and unknownFutureValue.
     * @return a CloudPcDiskEncryptionState
     */
    @jakarta.annotation.Nullable
    public CloudPcDiskEncryptionState getDiskEncryptionState() {
        return this.BackingStore.get("diskEncryptionState");
    }
    /**
     * Gets the displayName property value. The display name of the Cloud PC.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aadDeviceId", (n) -> { this.setAadDeviceId(n.getStringValue()); });
        deserializerMap.put("connectionSettings", (n) -> { this.setConnectionSettings(n.getObjectValue(CloudPcConnectionSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("connectivityResult", (n) -> { this.setConnectivityResult(n.getObjectValue(CloudPcConnectivityResult::createFromDiscriminatorValue)); });
        deserializerMap.put("diskEncryptionState", (n) -> { this.setDiskEncryptionState(n.getEnumValue(CloudPcDiskEncryptionState.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("gracePeriodEndDateTime", (n) -> { this.setGracePeriodEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("imageDisplayName", (n) -> { this.setImageDisplayName(n.getStringValue()); });
        deserializerMap.put("lastLoginResult", (n) -> { this.setLastLoginResult(n.getObjectValue(CloudPcLoginResult::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastRemoteActionResult", (n) -> { this.setLastRemoteActionResult(n.getObjectValue(CloudPcRemoteActionResult::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("managedDeviceName", (n) -> { this.setManagedDeviceName(n.getStringValue()); });
        deserializerMap.put("onPremisesConnectionName", (n) -> { this.setOnPremisesConnectionName(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getEnumValue(CloudPcOperatingSystem.class)); });
        deserializerMap.put("partnerAgentInstallResults", (n) -> { this.setPartnerAgentInstallResults(n.getCollectionOfObjectValues(CloudPcPartnerAgentInstallResult::createFromDiscriminatorValue)); });
        deserializerMap.put("powerState", (n) -> { this.setPowerState(n.getEnumValue(CloudPcPowerState.class)); });
        deserializerMap.put("provisioningPolicyId", (n) -> { this.setProvisioningPolicyId(n.getStringValue()); });
        deserializerMap.put("provisioningPolicyName", (n) -> { this.setProvisioningPolicyName(n.getStringValue()); });
        deserializerMap.put("provisioningType", (n) -> { this.setProvisioningType(n.getEnumValue(CloudPcProvisioningType.class)); });
        deserializerMap.put("scopeIds", (n) -> { this.setScopeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("servicePlanId", (n) -> { this.setServicePlanId(n.getStringValue()); });
        deserializerMap.put("servicePlanName", (n) -> { this.setServicePlanName(n.getStringValue()); });
        deserializerMap.put("servicePlanType", (n) -> { this.setServicePlanType(n.getEnumValue(CloudPcServicePlanType.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CloudPcStatus.class)); });
        deserializerMap.put("statusDetails", (n) -> { this.setStatusDetails(n.getObjectValue(CloudPcStatusDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("userAccountType", (n) -> { this.setUserAccountType(n.getEnumValue(CloudPcUserAccountType.class)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodEndDateTime property value. The date and time when the grace period ends and reprovisioning or deprovisioning happen. Required only if the status is inGracePeriod. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGracePeriodEndDateTime() {
        return this.BackingStore.get("gracePeriodEndDateTime");
    }
    /**
     * Gets the imageDisplayName property value. Name of the OS image that's on the Cloud PC.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getImageDisplayName() {
        return this.BackingStore.get("imageDisplayName");
    }
    /**
     * Gets the lastLoginResult property value. The last login result of the Cloud PC. For example, { 'time': '2014-01-01T00:00:00Z'}.
     * @return a CloudPcLoginResult
     */
    @jakarta.annotation.Nullable
    public CloudPcLoginResult getLastLoginResult() {
        return this.BackingStore.get("lastLoginResult");
    }
    /**
     * Gets the lastModifiedDateTime property value. The last modified date and time of the Cloud PC. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the lastRemoteActionResult property value. The last remote action result of the enterprise Cloud PCs. The supported remote actions are: Reboot, Rename, Reprovision, Restore, and Troubleshoot.
     * @return a CloudPcRemoteActionResult
     */
    @jakarta.annotation.Nullable
    public CloudPcRemoteActionResult getLastRemoteActionResult() {
        return this.BackingStore.get("lastRemoteActionResult");
    }
    /**
     * Gets the managedDeviceId property value. The Intune device ID of the Cloud PC.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.BackingStore.get("managedDeviceId");
    }
    /**
     * Gets the managedDeviceName property value. The Intune device name of the Cloud PC.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceName() {
        return this.BackingStore.get("managedDeviceName");
    }
    /**
     * Gets the onPremisesConnectionName property value. The Azure network connection that is applied during the provisioning of Cloud PCs.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesConnectionName() {
        return this.BackingStore.get("onPremisesConnectionName");
    }
    /**
     * Gets the osVersion property value. The version of the operating system (OS) to provision on Cloud PCs. Possible values are: windows10, windows11, and unknownFutureValue.
     * @return a CloudPcOperatingSystem
     */
    @jakarta.annotation.Nullable
    public CloudPcOperatingSystem getOsVersion() {
        return this.BackingStore.get("osVersion");
    }
    /**
     * Gets the partnerAgentInstallResults property value. The results of every partner agent's installation status on Cloud PC.
     * @return a java.util.List<CloudPcPartnerAgentInstallResult>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcPartnerAgentInstallResult> getPartnerAgentInstallResults() {
        return this.BackingStore.get("partnerAgentInstallResults");
    }
    /**
     * Gets the powerState property value. The power state of a Cloud PC. The possible values are: running, poweredOff and unknown. This property only supports shift work Cloud PCs.
     * @return a CloudPcPowerState
     */
    @jakarta.annotation.Nullable
    public CloudPcPowerState getPowerState() {
        return this.BackingStore.get("powerState");
    }
    /**
     * Gets the provisioningPolicyId property value. The provisioning policy ID of the Cloud PC.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProvisioningPolicyId() {
        return this.BackingStore.get("provisioningPolicyId");
    }
    /**
     * Gets the provisioningPolicyName property value. The provisioning policy that is applied during the provisioning of Cloud PCs.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProvisioningPolicyName() {
        return this.BackingStore.get("provisioningPolicyName");
    }
    /**
     * Gets the provisioningType property value. The type of licenses to be used when provisioning Cloud PCs using this policy. Possible values are: dedicated, shared, unknownFutureValue. Default value is dedicated.
     * @return a CloudPcProvisioningType
     */
    @jakarta.annotation.Nullable
    public CloudPcProvisioningType getProvisioningType() {
        return this.BackingStore.get("provisioningType");
    }
    /**
     * Gets the scopeIds property value. The scopeIds property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getScopeIds() {
        return this.BackingStore.get("scopeIds");
    }
    /**
     * Gets the servicePlanId property value. The service plan ID of the Cloud PC.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePlanId() {
        return this.BackingStore.get("servicePlanId");
    }
    /**
     * Gets the servicePlanName property value. The service plan name of the Cloud PC.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getServicePlanName() {
        return this.BackingStore.get("servicePlanName");
    }
    /**
     * Gets the servicePlanType property value. The service plan type of the Cloud PC.
     * @return a CloudPcServicePlanType
     */
    @jakarta.annotation.Nullable
    public CloudPcServicePlanType getServicePlanType() {
        return this.BackingStore.get("servicePlanType");
    }
    /**
     * Gets the status property value. The status property
     * @return a CloudPcStatus
     */
    @jakarta.annotation.Nullable
    public CloudPcStatus getStatus() {
        return this.BackingStore.get("status");
    }
    /**
     * Gets the statusDetails property value. The details of the Cloud PC status.
     * @return a CloudPcStatusDetails
     */
    @jakarta.annotation.Nullable
    public CloudPcStatusDetails getStatusDetails() {
        return this.BackingStore.get("statusDetails");
    }
    /**
     * Gets the userAccountType property value. The account type of the user on provisioned Cloud PCs. Possible values are: standardUser, administrator, and unknownFutureValue.
     * @return a CloudPcUserAccountType
     */
    @jakarta.annotation.Nullable
    public CloudPcUserAccountType getUserAccountType() {
        return this.BackingStore.get("userAccountType");
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user assigned to the Cloud PC.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.BackingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("aadDeviceId", this.getAadDeviceId());
        writer.writeObjectValue("connectionSettings", this.getConnectionSettings());
        writer.writeObjectValue("connectivityResult", this.getConnectivityResult());
        writer.writeEnumValue("diskEncryptionState", this.getDiskEncryptionState());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("gracePeriodEndDateTime", this.getGracePeriodEndDateTime());
        writer.writeStringValue("imageDisplayName", this.getImageDisplayName());
        writer.writeObjectValue("lastLoginResult", this.getLastLoginResult());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("lastRemoteActionResult", this.getLastRemoteActionResult());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("managedDeviceName", this.getManagedDeviceName());
        writer.writeStringValue("onPremisesConnectionName", this.getOnPremisesConnectionName());
        writer.writeEnumValue("osVersion", this.getOsVersion());
        writer.writeCollectionOfObjectValues("partnerAgentInstallResults", this.getPartnerAgentInstallResults());
        writer.writeEnumValue("powerState", this.getPowerState());
        writer.writeStringValue("provisioningPolicyId", this.getProvisioningPolicyId());
        writer.writeStringValue("provisioningPolicyName", this.getProvisioningPolicyName());
        writer.writeEnumValue("provisioningType", this.getProvisioningType());
        writer.writeCollectionOfPrimitiveValues("scopeIds", this.getScopeIds());
        writer.writeStringValue("servicePlanId", this.getServicePlanId());
        writer.writeStringValue("servicePlanName", this.getServicePlanName());
        writer.writeEnumValue("servicePlanType", this.getServicePlanType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeObjectValue("statusDetails", this.getStatusDetails());
        writer.writeEnumValue("userAccountType", this.getUserAccountType());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the aadDeviceId property value. The Microsoft Entra device ID of the Cloud PC.
     * @param value Value to set for the aadDeviceId property.
     */
    public void setAadDeviceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("aadDeviceId", value);
    }
    /**
     * Sets the connectionSettings property value. The connectionSettings property
     * @param value Value to set for the connectionSettings property.
     */
    public void setConnectionSettings(@jakarta.annotation.Nullable final CloudPcConnectionSettings value) {
        this.BackingStore.set("connectionSettings", value);
    }
    /**
     * Sets the connectivityResult property value. The connectivity health check result of a Cloud PC, including the updated timestamp and whether the Cloud PC can be connected.
     * @param value Value to set for the connectivityResult property.
     */
    public void setConnectivityResult(@jakarta.annotation.Nullable final CloudPcConnectivityResult value) {
        this.BackingStore.set("connectivityResult", value);
    }
    /**
     * Sets the diskEncryptionState property value. The disk encryption applied to the Cloud PC. Possible values: notAvailable, notEncrypted, encryptedUsingPlatformManagedKey, encryptedUsingCustomerManagedKey, and unknownFutureValue.
     * @param value Value to set for the diskEncryptionState property.
     */
    public void setDiskEncryptionState(@jakarta.annotation.Nullable final CloudPcDiskEncryptionState value) {
        this.BackingStore.set("diskEncryptionState", value);
    }
    /**
     * Sets the displayName property value. The display name of the Cloud PC.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the gracePeriodEndDateTime property value. The date and time when the grace period ends and reprovisioning or deprovisioning happen. Required only if the status is inGracePeriod. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the gracePeriodEndDateTime property.
     */
    public void setGracePeriodEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("gracePeriodEndDateTime", value);
    }
    /**
     * Sets the imageDisplayName property value. Name of the OS image that's on the Cloud PC.
     * @param value Value to set for the imageDisplayName property.
     */
    public void setImageDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("imageDisplayName", value);
    }
    /**
     * Sets the lastLoginResult property value. The last login result of the Cloud PC. For example, { 'time': '2014-01-01T00:00:00Z'}.
     * @param value Value to set for the lastLoginResult property.
     */
    public void setLastLoginResult(@jakarta.annotation.Nullable final CloudPcLoginResult value) {
        this.BackingStore.set("lastLoginResult", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The last modified date and time of the Cloud PC. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the lastRemoteActionResult property value. The last remote action result of the enterprise Cloud PCs. The supported remote actions are: Reboot, Rename, Reprovision, Restore, and Troubleshoot.
     * @param value Value to set for the lastRemoteActionResult property.
     */
    public void setLastRemoteActionResult(@jakarta.annotation.Nullable final CloudPcRemoteActionResult value) {
        this.BackingStore.set("lastRemoteActionResult", value);
    }
    /**
     * Sets the managedDeviceId property value. The Intune device ID of the Cloud PC.
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("managedDeviceId", value);
    }
    /**
     * Sets the managedDeviceName property value. The Intune device name of the Cloud PC.
     * @param value Value to set for the managedDeviceName property.
     */
    public void setManagedDeviceName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("managedDeviceName", value);
    }
    /**
     * Sets the onPremisesConnectionName property value. The Azure network connection that is applied during the provisioning of Cloud PCs.
     * @param value Value to set for the onPremisesConnectionName property.
     */
    public void setOnPremisesConnectionName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("onPremisesConnectionName", value);
    }
    /**
     * Sets the osVersion property value. The version of the operating system (OS) to provision on Cloud PCs. Possible values are: windows10, windows11, and unknownFutureValue.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final CloudPcOperatingSystem value) {
        this.BackingStore.set("osVersion", value);
    }
    /**
     * Sets the partnerAgentInstallResults property value. The results of every partner agent's installation status on Cloud PC.
     * @param value Value to set for the partnerAgentInstallResults property.
     */
    public void setPartnerAgentInstallResults(@jakarta.annotation.Nullable final java.util.List<CloudPcPartnerAgentInstallResult> value) {
        this.BackingStore.set("partnerAgentInstallResults", value);
    }
    /**
     * Sets the powerState property value. The power state of a Cloud PC. The possible values are: running, poweredOff and unknown. This property only supports shift work Cloud PCs.
     * @param value Value to set for the powerState property.
     */
    public void setPowerState(@jakarta.annotation.Nullable final CloudPcPowerState value) {
        this.BackingStore.set("powerState", value);
    }
    /**
     * Sets the provisioningPolicyId property value. The provisioning policy ID of the Cloud PC.
     * @param value Value to set for the provisioningPolicyId property.
     */
    public void setProvisioningPolicyId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("provisioningPolicyId", value);
    }
    /**
     * Sets the provisioningPolicyName property value. The provisioning policy that is applied during the provisioning of Cloud PCs.
     * @param value Value to set for the provisioningPolicyName property.
     */
    public void setProvisioningPolicyName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("provisioningPolicyName", value);
    }
    /**
     * Sets the provisioningType property value. The type of licenses to be used when provisioning Cloud PCs using this policy. Possible values are: dedicated, shared, unknownFutureValue. Default value is dedicated.
     * @param value Value to set for the provisioningType property.
     */
    public void setProvisioningType(@jakarta.annotation.Nullable final CloudPcProvisioningType value) {
        this.BackingStore.set("provisioningType", value);
    }
    /**
     * Sets the scopeIds property value. The scopeIds property
     * @param value Value to set for the scopeIds property.
     */
    public void setScopeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("scopeIds", value);
    }
    /**
     * Sets the servicePlanId property value. The service plan ID of the Cloud PC.
     * @param value Value to set for the servicePlanId property.
     */
    public void setServicePlanId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("servicePlanId", value);
    }
    /**
     * Sets the servicePlanName property value. The service plan name of the Cloud PC.
     * @param value Value to set for the servicePlanName property.
     */
    public void setServicePlanName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("servicePlanName", value);
    }
    /**
     * Sets the servicePlanType property value. The service plan type of the Cloud PC.
     * @param value Value to set for the servicePlanType property.
     */
    public void setServicePlanType(@jakarta.annotation.Nullable final CloudPcServicePlanType value) {
        this.BackingStore.set("servicePlanType", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CloudPcStatus value) {
        this.BackingStore.set("status", value);
    }
    /**
     * Sets the statusDetails property value. The details of the Cloud PC status.
     * @param value Value to set for the statusDetails property.
     */
    public void setStatusDetails(@jakarta.annotation.Nullable final CloudPcStatusDetails value) {
        this.BackingStore.set("statusDetails", value);
    }
    /**
     * Sets the userAccountType property value. The account type of the user on provisioned Cloud PCs. Possible values are: standardUser, administrator, and unknownFutureValue.
     * @param value Value to set for the userAccountType property.
     */
    public void setUserAccountType(@jakarta.annotation.Nullable final CloudPcUserAccountType value) {
        this.BackingStore.set("userAccountType", value);
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user assigned to the Cloud PC.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("userPrincipalName", value);
    }
}
