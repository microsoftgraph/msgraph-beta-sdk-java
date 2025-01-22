package com.microsoft.graph.beta.models;

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
     * Instantiates a new {@link CloudPC} and sets the default values.
     */
    public CloudPC() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPC}
     */
    @jakarta.annotation.Nonnull
    public static CloudPC createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPC();
    }
    /**
     * Gets the aadDeviceId property value. The Microsoft Entra device ID of the Cloud PC.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAadDeviceId() {
        return this.backingStore.get("aadDeviceId");
    }
    /**
     * Gets the allotmentDisplayName property value. The allotment name divides tenant licenses into smaller batches or groups that help restrict the number of licenses available for use in a specific assignment. When the provisioningType is dedicated, the allotment name is null. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAllotmentDisplayName() {
        return this.backingStore.get("allotmentDisplayName");
    }
    /**
     * Gets the connectionSetting property value. The connection setting of the Cloud PC. Possible values: enableSingleSignOn. Read Only.
     * @return a {@link CloudPcConnectionSetting}
     */
    @jakarta.annotation.Nullable
    public CloudPcConnectionSetting getConnectionSetting() {
        return this.backingStore.get("connectionSetting");
    }
    /**
     * Gets the connectionSettings property value. The connectionSettings property
     * @return a {@link CloudPcConnectionSettings}
     */
    @jakarta.annotation.Nullable
    public CloudPcConnectionSettings getConnectionSettings() {
        return this.backingStore.get("connectionSettings");
    }
    /**
     * Gets the connectivityResult property value. The connectivity health check result of a Cloud PC, including the updated timestamp and whether the Cloud PC can be connected.
     * @return a {@link CloudPcConnectivityResult}
     */
    @jakarta.annotation.Nullable
    public CloudPcConnectivityResult getConnectivityResult() {
        return this.backingStore.get("connectivityResult");
    }
    /**
     * Gets the deviceRegionName property value. The name of the geographical region where the Cloud PC is currently provisioned. For example, westus3, eastus2, and southeastasia. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceRegionName() {
        return this.backingStore.get("deviceRegionName");
    }
    /**
     * Gets the disasterRecoveryCapability property value. The disaster recovery status of the Cloud PC, including the primary region, secondary region, and capability type. The default value is null that indicates that the disaster recovery setting is disabled. To receive a response with the disasterRecoveryCapability property, $select and $filter it by disasterRecoveryCapability/{subProperty} in the request URL. For more information, see Example 3: List Cloud PCs filtered by disaster recovery capability type. Read-only.
     * @return a {@link CloudPcDisasterRecoveryCapability}
     */
    @jakarta.annotation.Nullable
    public CloudPcDisasterRecoveryCapability getDisasterRecoveryCapability() {
        return this.backingStore.get("disasterRecoveryCapability");
    }
    /**
     * Gets the diskEncryptionState property value. The disk encryption applied to the Cloud PC. Possible values: notAvailable, notEncrypted, encryptedUsingPlatformManagedKey, encryptedUsingCustomerManagedKey, and unknownFutureValue.
     * @return a {@link CloudPcDiskEncryptionState}
     */
    @jakarta.annotation.Nullable
    public CloudPcDiskEncryptionState getDiskEncryptionState() {
        return this.backingStore.get("diskEncryptionState");
    }
    /**
     * Gets the displayName property value. The display name of the Cloud PC.
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
        deserializerMap.put("aadDeviceId", (n) -> { this.setAadDeviceId(n.getStringValue()); });
        deserializerMap.put("allotmentDisplayName", (n) -> { this.setAllotmentDisplayName(n.getStringValue()); });
        deserializerMap.put("connectionSetting", (n) -> { this.setConnectionSetting(n.getObjectValue(CloudPcConnectionSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("connectionSettings", (n) -> { this.setConnectionSettings(n.getObjectValue(CloudPcConnectionSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("connectivityResult", (n) -> { this.setConnectivityResult(n.getObjectValue(CloudPcConnectivityResult::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceRegionName", (n) -> { this.setDeviceRegionName(n.getStringValue()); });
        deserializerMap.put("disasterRecoveryCapability", (n) -> { this.setDisasterRecoveryCapability(n.getObjectValue(CloudPcDisasterRecoveryCapability::createFromDiscriminatorValue)); });
        deserializerMap.put("diskEncryptionState", (n) -> { this.setDiskEncryptionState(n.getEnumValue(CloudPcDiskEncryptionState::forValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("frontlineCloudPcAvailability", (n) -> { this.setFrontlineCloudPcAvailability(n.getEnumValue(FrontlineCloudPcAvailability::forValue)); });
        deserializerMap.put("gracePeriodEndDateTime", (n) -> { this.setGracePeriodEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("imageDisplayName", (n) -> { this.setImageDisplayName(n.getStringValue()); });
        deserializerMap.put("lastLoginResult", (n) -> { this.setLastLoginResult(n.getObjectValue(CloudPcLoginResult::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastRemoteActionResult", (n) -> { this.setLastRemoteActionResult(n.getObjectValue(CloudPcRemoteActionResult::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("managedDeviceName", (n) -> { this.setManagedDeviceName(n.getStringValue()); });
        deserializerMap.put("onPremisesConnectionName", (n) -> { this.setOnPremisesConnectionName(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getEnumValue(CloudPcOperatingSystem::forValue)); });
        deserializerMap.put("partnerAgentInstallResults", (n) -> { this.setPartnerAgentInstallResults(n.getCollectionOfObjectValues(CloudPcPartnerAgentInstallResult::createFromDiscriminatorValue)); });
        deserializerMap.put("powerState", (n) -> { this.setPowerState(n.getEnumValue(CloudPcPowerState::forValue)); });
        deserializerMap.put("provisioningPolicyId", (n) -> { this.setProvisioningPolicyId(n.getStringValue()); });
        deserializerMap.put("provisioningPolicyName", (n) -> { this.setProvisioningPolicyName(n.getStringValue()); });
        deserializerMap.put("provisioningType", (n) -> { this.setProvisioningType(n.getEnumValue(CloudPcProvisioningType::forValue)); });
        deserializerMap.put("scopeIds", (n) -> { this.setScopeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("servicePlanId", (n) -> { this.setServicePlanId(n.getStringValue()); });
        deserializerMap.put("servicePlanName", (n) -> { this.setServicePlanName(n.getStringValue()); });
        deserializerMap.put("servicePlanType", (n) -> { this.setServicePlanType(n.getEnumValue(CloudPcServicePlanType::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CloudPcStatus::forValue)); });
        deserializerMap.put("statusDetail", (n) -> { this.setStatusDetail(n.getObjectValue(CloudPcStatusDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("statusDetails", (n) -> { this.setStatusDetails(n.getObjectValue(CloudPcStatusDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("userAccountType", (n) -> { this.setUserAccountType(n.getEnumValue(CloudPcUserAccountType::forValue)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the frontlineCloudPcAvailability property value. The current availability of a frontline assigned Cloud PC. Possible values: notApplicable, available,notAvailable and unknownFutureValue. Default value is notApplicable. Read Only.
     * @return a {@link FrontlineCloudPcAvailability}
     */
    @jakarta.annotation.Nullable
    public FrontlineCloudPcAvailability getFrontlineCloudPcAvailability() {
        return this.backingStore.get("frontlineCloudPcAvailability");
    }
    /**
     * Gets the gracePeriodEndDateTime property value. The date and time when the grace period ends and reprovisioning or deprovisioning happens. Required only if the status is inGracePeriod. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGracePeriodEndDateTime() {
        return this.backingStore.get("gracePeriodEndDateTime");
    }
    /**
     * Gets the imageDisplayName property value. Name of the OS image that's on the Cloud PC.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageDisplayName() {
        return this.backingStore.get("imageDisplayName");
    }
    /**
     * Gets the lastLoginResult property value. The last login result of the Cloud PC. For example, { 'time': '2014-01-01T00:00:00Z'}.
     * @return a {@link CloudPcLoginResult}
     */
    @jakarta.annotation.Nullable
    public CloudPcLoginResult getLastLoginResult() {
        return this.backingStore.get("lastLoginResult");
    }
    /**
     * Gets the lastModifiedDateTime property value. The last modified date and time of the Cloud PC. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the lastRemoteActionResult property value. The last remote action result of the enterprise Cloud PCs. The supported remote actions are: Reboot, Rename, Reprovision, Restore, Troubleshoot.
     * @return a {@link CloudPcRemoteActionResult}
     */
    @jakarta.annotation.Nullable
    public CloudPcRemoteActionResult getLastRemoteActionResult() {
        return this.backingStore.get("lastRemoteActionResult");
    }
    /**
     * Gets the managedDeviceId property value. The Intune device ID of the Cloud PC.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.backingStore.get("managedDeviceId");
    }
    /**
     * Gets the managedDeviceName property value. The Intune device name of the Cloud PC.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceName() {
        return this.backingStore.get("managedDeviceName");
    }
    /**
     * Gets the onPremisesConnectionName property value. The Azure network connection that is applied during the provisioning of Cloud PCs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnPremisesConnectionName() {
        return this.backingStore.get("onPremisesConnectionName");
    }
    /**
     * Gets the osVersion property value. The version of the operating system (OS) to provision on Cloud PCs. Possible values are: windows10, windows11, unknownFutureValue.
     * @return a {@link CloudPcOperatingSystem}
     */
    @jakarta.annotation.Nullable
    public CloudPcOperatingSystem getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the partnerAgentInstallResults property value. The results of every partner agent's installation status on Cloud PC.
     * @return a {@link java.util.List<CloudPcPartnerAgentInstallResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcPartnerAgentInstallResult> getPartnerAgentInstallResults() {
        return this.backingStore.get("partnerAgentInstallResults");
    }
    /**
     * Gets the powerState property value. The power state of a Cloud PC. The possible values are: running, poweredOff, unknown. This property only supports shift work Cloud PCs.
     * @return a {@link CloudPcPowerState}
     */
    @jakarta.annotation.Nullable
    public CloudPcPowerState getPowerState() {
        return this.backingStore.get("powerState");
    }
    /**
     * Gets the provisioningPolicyId property value. The provisioning policy ID of the Cloud PC.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvisioningPolicyId() {
        return this.backingStore.get("provisioningPolicyId");
    }
    /**
     * Gets the provisioningPolicyName property value. The provisioning policy that is applied during the provisioning of Cloud PCs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvisioningPolicyName() {
        return this.backingStore.get("provisioningPolicyName");
    }
    /**
     * Gets the provisioningType property value. The type of licenses to be used when provisioning Cloud PCs using this policy. Possible values are: dedicated, shared, unknownFutureValue,sharedByUser, sharedByEntraGroup. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: sharedByUser, sharedByEntraGroup. The default value is dedicated. CAUTION: The shared member is deprecated and will stop returning on April 30, 2027 in the future, use the sharedByUser member.
     * @return a {@link CloudPcProvisioningType}
     */
    @jakarta.annotation.Nullable
    public CloudPcProvisioningType getProvisioningType() {
        return this.backingStore.get("provisioningType");
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
     * Gets the servicePlanId property value. The service plan ID of the Cloud PC.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePlanId() {
        return this.backingStore.get("servicePlanId");
    }
    /**
     * Gets the servicePlanName property value. The service plan name of the Cloud PC.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePlanName() {
        return this.backingStore.get("servicePlanName");
    }
    /**
     * Gets the servicePlanType property value. The service plan type of the Cloud PC.
     * @return a {@link CloudPcServicePlanType}
     */
    @jakarta.annotation.Nullable
    public CloudPcServicePlanType getServicePlanType() {
        return this.backingStore.get("servicePlanType");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link CloudPcStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the statusDetail property value. Indicates the detailed status associated with Cloud PC, including error/warning code, error/warning message, additionalInformation. For example, { 'code': 'internalServerError', 'message': 'There was an error during the Cloud PC upgrade. Please contact support.', 'additionalInformation': null }.
     * @return a {@link CloudPcStatusDetail}
     */
    @jakarta.annotation.Nullable
    public CloudPcStatusDetail getStatusDetail() {
        return this.backingStore.get("statusDetail");
    }
    /**
     * Gets the statusDetails property value. The details of the Cloud PC status. For example, { 'code': 'internalServerError', 'message': 'There was an error during the Cloud PC upgrade. Please contact support.', 'additionalInformation': null }. This property is deprecated and will no longer be supported effective August 31, 2024. Use statusDetail instead.
     * @return a {@link CloudPcStatusDetails}
     */
    @jakarta.annotation.Nullable
    public CloudPcStatusDetails getStatusDetails() {
        return this.backingStore.get("statusDetails");
    }
    /**
     * Gets the userAccountType property value. The account type of the user on provisioned Cloud PCs. Possible values are: standardUser, administrator, unknownFutureValue.
     * @return a {@link CloudPcUserAccountType}
     */
    @jakarta.annotation.Nullable
    public CloudPcUserAccountType getUserAccountType() {
        return this.backingStore.get("userAccountType");
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user assigned to the Cloud PC.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("aadDeviceId", this.getAadDeviceId());
        writer.writeStringValue("allotmentDisplayName", this.getAllotmentDisplayName());
        writer.writeObjectValue("connectionSetting", this.getConnectionSetting());
        writer.writeObjectValue("connectionSettings", this.getConnectionSettings());
        writer.writeObjectValue("connectivityResult", this.getConnectivityResult());
        writer.writeStringValue("deviceRegionName", this.getDeviceRegionName());
        writer.writeObjectValue("disasterRecoveryCapability", this.getDisasterRecoveryCapability());
        writer.writeEnumValue("diskEncryptionState", this.getDiskEncryptionState());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("frontlineCloudPcAvailability", this.getFrontlineCloudPcAvailability());
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
        writer.writeObjectValue("statusDetail", this.getStatusDetail());
        writer.writeObjectValue("statusDetails", this.getStatusDetails());
        writer.writeEnumValue("userAccountType", this.getUserAccountType());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the aadDeviceId property value. The Microsoft Entra device ID of the Cloud PC.
     * @param value Value to set for the aadDeviceId property.
     */
    public void setAadDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("aadDeviceId", value);
    }
    /**
     * Sets the allotmentDisplayName property value. The allotment name divides tenant licenses into smaller batches or groups that help restrict the number of licenses available for use in a specific assignment. When the provisioningType is dedicated, the allotment name is null. Read-only.
     * @param value Value to set for the allotmentDisplayName property.
     */
    public void setAllotmentDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("allotmentDisplayName", value);
    }
    /**
     * Sets the connectionSetting property value. The connection setting of the Cloud PC. Possible values: enableSingleSignOn. Read Only.
     * @param value Value to set for the connectionSetting property.
     */
    public void setConnectionSetting(@jakarta.annotation.Nullable final CloudPcConnectionSetting value) {
        this.backingStore.set("connectionSetting", value);
    }
    /**
     * Sets the connectionSettings property value. The connectionSettings property
     * @param value Value to set for the connectionSettings property.
     */
    public void setConnectionSettings(@jakarta.annotation.Nullable final CloudPcConnectionSettings value) {
        this.backingStore.set("connectionSettings", value);
    }
    /**
     * Sets the connectivityResult property value. The connectivity health check result of a Cloud PC, including the updated timestamp and whether the Cloud PC can be connected.
     * @param value Value to set for the connectivityResult property.
     */
    public void setConnectivityResult(@jakarta.annotation.Nullable final CloudPcConnectivityResult value) {
        this.backingStore.set("connectivityResult", value);
    }
    /**
     * Sets the deviceRegionName property value. The name of the geographical region where the Cloud PC is currently provisioned. For example, westus3, eastus2, and southeastasia. Read-only.
     * @param value Value to set for the deviceRegionName property.
     */
    public void setDeviceRegionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceRegionName", value);
    }
    /**
     * Sets the disasterRecoveryCapability property value. The disaster recovery status of the Cloud PC, including the primary region, secondary region, and capability type. The default value is null that indicates that the disaster recovery setting is disabled. To receive a response with the disasterRecoveryCapability property, $select and $filter it by disasterRecoveryCapability/{subProperty} in the request URL. For more information, see Example 3: List Cloud PCs filtered by disaster recovery capability type. Read-only.
     * @param value Value to set for the disasterRecoveryCapability property.
     */
    public void setDisasterRecoveryCapability(@jakarta.annotation.Nullable final CloudPcDisasterRecoveryCapability value) {
        this.backingStore.set("disasterRecoveryCapability", value);
    }
    /**
     * Sets the diskEncryptionState property value. The disk encryption applied to the Cloud PC. Possible values: notAvailable, notEncrypted, encryptedUsingPlatformManagedKey, encryptedUsingCustomerManagedKey, and unknownFutureValue.
     * @param value Value to set for the diskEncryptionState property.
     */
    public void setDiskEncryptionState(@jakarta.annotation.Nullable final CloudPcDiskEncryptionState value) {
        this.backingStore.set("diskEncryptionState", value);
    }
    /**
     * Sets the displayName property value. The display name of the Cloud PC.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the frontlineCloudPcAvailability property value. The current availability of a frontline assigned Cloud PC. Possible values: notApplicable, available,notAvailable and unknownFutureValue. Default value is notApplicable. Read Only.
     * @param value Value to set for the frontlineCloudPcAvailability property.
     */
    public void setFrontlineCloudPcAvailability(@jakarta.annotation.Nullable final FrontlineCloudPcAvailability value) {
        this.backingStore.set("frontlineCloudPcAvailability", value);
    }
    /**
     * Sets the gracePeriodEndDateTime property value. The date and time when the grace period ends and reprovisioning or deprovisioning happens. Required only if the status is inGracePeriod. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the gracePeriodEndDateTime property.
     */
    public void setGracePeriodEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("gracePeriodEndDateTime", value);
    }
    /**
     * Sets the imageDisplayName property value. Name of the OS image that's on the Cloud PC.
     * @param value Value to set for the imageDisplayName property.
     */
    public void setImageDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("imageDisplayName", value);
    }
    /**
     * Sets the lastLoginResult property value. The last login result of the Cloud PC. For example, { 'time': '2014-01-01T00:00:00Z'}.
     * @param value Value to set for the lastLoginResult property.
     */
    public void setLastLoginResult(@jakarta.annotation.Nullable final CloudPcLoginResult value) {
        this.backingStore.set("lastLoginResult", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The last modified date and time of the Cloud PC. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014, is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the lastRemoteActionResult property value. The last remote action result of the enterprise Cloud PCs. The supported remote actions are: Reboot, Rename, Reprovision, Restore, Troubleshoot.
     * @param value Value to set for the lastRemoteActionResult property.
     */
    public void setLastRemoteActionResult(@jakarta.annotation.Nullable final CloudPcRemoteActionResult value) {
        this.backingStore.set("lastRemoteActionResult", value);
    }
    /**
     * Sets the managedDeviceId property value. The Intune device ID of the Cloud PC.
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceId", value);
    }
    /**
     * Sets the managedDeviceName property value. The Intune device name of the Cloud PC.
     * @param value Value to set for the managedDeviceName property.
     */
    public void setManagedDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceName", value);
    }
    /**
     * Sets the onPremisesConnectionName property value. The Azure network connection that is applied during the provisioning of Cloud PCs.
     * @param value Value to set for the onPremisesConnectionName property.
     */
    public void setOnPremisesConnectionName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onPremisesConnectionName", value);
    }
    /**
     * Sets the osVersion property value. The version of the operating system (OS) to provision on Cloud PCs. Possible values are: windows10, windows11, unknownFutureValue.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final CloudPcOperatingSystem value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the partnerAgentInstallResults property value. The results of every partner agent's installation status on Cloud PC.
     * @param value Value to set for the partnerAgentInstallResults property.
     */
    public void setPartnerAgentInstallResults(@jakarta.annotation.Nullable final java.util.List<CloudPcPartnerAgentInstallResult> value) {
        this.backingStore.set("partnerAgentInstallResults", value);
    }
    /**
     * Sets the powerState property value. The power state of a Cloud PC. The possible values are: running, poweredOff, unknown. This property only supports shift work Cloud PCs.
     * @param value Value to set for the powerState property.
     */
    public void setPowerState(@jakarta.annotation.Nullable final CloudPcPowerState value) {
        this.backingStore.set("powerState", value);
    }
    /**
     * Sets the provisioningPolicyId property value. The provisioning policy ID of the Cloud PC.
     * @param value Value to set for the provisioningPolicyId property.
     */
    public void setProvisioningPolicyId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("provisioningPolicyId", value);
    }
    /**
     * Sets the provisioningPolicyName property value. The provisioning policy that is applied during the provisioning of Cloud PCs.
     * @param value Value to set for the provisioningPolicyName property.
     */
    public void setProvisioningPolicyName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("provisioningPolicyName", value);
    }
    /**
     * Sets the provisioningType property value. The type of licenses to be used when provisioning Cloud PCs using this policy. Possible values are: dedicated, shared, unknownFutureValue,sharedByUser, sharedByEntraGroup. Use the Prefer: include-unknown-enum-members request header to get the following values from this evolvable enum: sharedByUser, sharedByEntraGroup. The default value is dedicated. CAUTION: The shared member is deprecated and will stop returning on April 30, 2027 in the future, use the sharedByUser member.
     * @param value Value to set for the provisioningType property.
     */
    public void setProvisioningType(@jakarta.annotation.Nullable final CloudPcProvisioningType value) {
        this.backingStore.set("provisioningType", value);
    }
    /**
     * Sets the scopeIds property value. The scopeIds property
     * @param value Value to set for the scopeIds property.
     */
    public void setScopeIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("scopeIds", value);
    }
    /**
     * Sets the servicePlanId property value. The service plan ID of the Cloud PC.
     * @param value Value to set for the servicePlanId property.
     */
    public void setServicePlanId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePlanId", value);
    }
    /**
     * Sets the servicePlanName property value. The service plan name of the Cloud PC.
     * @param value Value to set for the servicePlanName property.
     */
    public void setServicePlanName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePlanName", value);
    }
    /**
     * Sets the servicePlanType property value. The service plan type of the Cloud PC.
     * @param value Value to set for the servicePlanType property.
     */
    public void setServicePlanType(@jakarta.annotation.Nullable final CloudPcServicePlanType value) {
        this.backingStore.set("servicePlanType", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CloudPcStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the statusDetail property value. Indicates the detailed status associated with Cloud PC, including error/warning code, error/warning message, additionalInformation. For example, { 'code': 'internalServerError', 'message': 'There was an error during the Cloud PC upgrade. Please contact support.', 'additionalInformation': null }.
     * @param value Value to set for the statusDetail property.
     */
    public void setStatusDetail(@jakarta.annotation.Nullable final CloudPcStatusDetail value) {
        this.backingStore.set("statusDetail", value);
    }
    /**
     * Sets the statusDetails property value. The details of the Cloud PC status. For example, { 'code': 'internalServerError', 'message': 'There was an error during the Cloud PC upgrade. Please contact support.', 'additionalInformation': null }. This property is deprecated and will no longer be supported effective August 31, 2024. Use statusDetail instead.
     * @param value Value to set for the statusDetails property.
     */
    public void setStatusDetails(@jakarta.annotation.Nullable final CloudPcStatusDetails value) {
        this.backingStore.set("statusDetails", value);
    }
    /**
     * Sets the userAccountType property value. The account type of the user on provisioned Cloud PCs. Possible values are: standardUser, administrator, unknownFutureValue.
     * @param value Value to set for the userAccountType property.
     */
    public void setUserAccountType(@jakarta.annotation.Nullable final CloudPcUserAccountType value) {
        this.backingStore.set("userAccountType", value);
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user assigned to the Cloud PC.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
