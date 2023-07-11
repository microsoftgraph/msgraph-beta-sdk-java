package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPC extends Entity implements Parsable {
    /**
     * The Azure Active Directory (Azure AD) device ID of the Cloud PC.
     */
    private String aadDeviceId;
    /**
     * The connectivity health check result of a Cloud PC, including the updated timestamp and whether the Cloud PC can be connected.
     */
    private CloudPcConnectivityResult connectivityResult;
    /**
     * The disk encryption applied to the Cloud PC. Possible values: notAvailable, notEncrypted, encryptedUsingPlatformManagedKey, encryptedUsingCustomerManagedKey, and unknownFutureValue.
     */
    private CloudPcDiskEncryptionState diskEncryptionState;
    /**
     * The display name of the Cloud PC.
     */
    private String displayName;
    /**
     * The date and time when the grace period ends and reprovisioning/deprovisioning happens. Required only if the status is inGracePeriod. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime gracePeriodEndDateTime;
    /**
     * Name of the OS image that's on the Cloud PC.
     */
    private String imageDisplayName;
    /**
     * The last login result of the Cloud PC. For example, { 'time': '2014-01-01T00:00:00Z'}.
     */
    private CloudPcLoginResult lastLoginResult;
    /**
     * The last modified date and time of the Cloud PC. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime lastModifiedDateTime;
    /**
     * The last remote action result of the enterprise Cloud PCs. The supported remote actions are: Reboot, Rename, Reprovision, Restore, and Troubleshoot.
     */
    private CloudPcRemoteActionResult lastRemoteActionResult;
    /**
     * The Intune device ID of the Cloud PC.
     */
    private String managedDeviceId;
    /**
     * The Intune device name of the Cloud PC.
     */
    private String managedDeviceName;
    /**
     * The Azure network connection that is applied during the provisioning of Cloud PCs.
     */
    private String onPremisesConnectionName;
    /**
     * The version of the operating system (OS) to provision on Cloud PCs. Possible values are: windows10, windows11, and unknownFutureValue.
     */
    private CloudPcOperatingSystem osVersion;
    /**
     * The results of every partner agent's installation status on Cloud PC.
     */
    private java.util.List<CloudPcPartnerAgentInstallResult> partnerAgentInstallResults;
    /**
     * The power state of a Cloud PC. The possible values are: running, poweredOff and unknown. This property only supports shift work Cloud PCs.
     */
    private CloudPcPowerState powerState;
    /**
     * The provisioning policy ID of the Cloud PC.
     */
    private String provisioningPolicyId;
    /**
     * The provisioning policy that is applied during the provisioning of Cloud PCs.
     */
    private String provisioningPolicyName;
    /**
     * The type of licenses to be used when provisioning Cloud PCs using this policy. Possible values are: dedicated, shared, unknownFutureValue. Default value is dedicated.
     */
    private CloudPcProvisioningType provisioningType;
    /**
     * The service plan ID of the Cloud PC.
     */
    private String servicePlanId;
    /**
     * The service plan name of the Cloud PC.
     */
    private String servicePlanName;
    /**
     * The service plan type of the Cloud PC.
     */
    private CloudPcServicePlanType servicePlanType;
    /**
     * The status property
     */
    private CloudPcStatus status;
    /**
     * The details of the Cloud PC status.
     */
    private CloudPcStatusDetails statusDetails;
    /**
     * The account type of the user on provisioned Cloud PCs. Possible values are: standardUser, administrator, and unknownFutureValue.
     */
    private CloudPcUserAccountType userAccountType;
    /**
     * The user principal name (UPN) of the user assigned to the Cloud PC.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new cloudPC and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPC() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPC
     */
    @javax.annotation.Nonnull
    public static CloudPC createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPC();
    }
    /**
     * Gets the aadDeviceId property value. The Azure Active Directory (Azure AD) device ID of the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAadDeviceId() {
        return this.aadDeviceId;
    }
    /**
     * Gets the connectivityResult property value. The connectivity health check result of a Cloud PC, including the updated timestamp and whether the Cloud PC can be connected.
     * @return a cloudPcConnectivityResult
     */
    @javax.annotation.Nullable
    public CloudPcConnectivityResult getConnectivityResult() {
        return this.connectivityResult;
    }
    /**
     * Gets the diskEncryptionState property value. The disk encryption applied to the Cloud PC. Possible values: notAvailable, notEncrypted, encryptedUsingPlatformManagedKey, encryptedUsingCustomerManagedKey, and unknownFutureValue.
     * @return a cloudPcDiskEncryptionState
     */
    @javax.annotation.Nullable
    public CloudPcDiskEncryptionState getDiskEncryptionState() {
        return this.diskEncryptionState;
    }
    /**
     * Gets the displayName property value. The display name of the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aadDeviceId", (n) -> { this.setAadDeviceId(n.getStringValue()); });
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
     * Gets the gracePeriodEndDateTime property value. The date and time when the grace period ends and reprovisioning/deprovisioning happens. Required only if the status is inGracePeriod. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getGracePeriodEndDateTime() {
        return this.gracePeriodEndDateTime;
    }
    /**
     * Gets the imageDisplayName property value. Name of the OS image that's on the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImageDisplayName() {
        return this.imageDisplayName;
    }
    /**
     * Gets the lastLoginResult property value. The last login result of the Cloud PC. For example, { 'time': '2014-01-01T00:00:00Z'}.
     * @return a cloudPcLoginResult
     */
    @javax.annotation.Nullable
    public CloudPcLoginResult getLastLoginResult() {
        return this.lastLoginResult;
    }
    /**
     * Gets the lastModifiedDateTime property value. The last modified date and time of the Cloud PC. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the lastRemoteActionResult property value. The last remote action result of the enterprise Cloud PCs. The supported remote actions are: Reboot, Rename, Reprovision, Restore, and Troubleshoot.
     * @return a cloudPcRemoteActionResult
     */
    @javax.annotation.Nullable
    public CloudPcRemoteActionResult getLastRemoteActionResult() {
        return this.lastRemoteActionResult;
    }
    /**
     * Gets the managedDeviceId property value. The Intune device ID of the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }
    /**
     * Gets the managedDeviceName property value. The Intune device name of the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceName() {
        return this.managedDeviceName;
    }
    /**
     * Gets the onPremisesConnectionName property value. The Azure network connection that is applied during the provisioning of Cloud PCs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesConnectionName() {
        return this.onPremisesConnectionName;
    }
    /**
     * Gets the osVersion property value. The version of the operating system (OS) to provision on Cloud PCs. Possible values are: windows10, windows11, and unknownFutureValue.
     * @return a cloudPcOperatingSystem
     */
    @javax.annotation.Nullable
    public CloudPcOperatingSystem getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the partnerAgentInstallResults property value. The results of every partner agent's installation status on Cloud PC.
     * @return a cloudPcPartnerAgentInstallResult
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcPartnerAgentInstallResult> getPartnerAgentInstallResults() {
        return this.partnerAgentInstallResults;
    }
    /**
     * Gets the powerState property value. The power state of a Cloud PC. The possible values are: running, poweredOff and unknown. This property only supports shift work Cloud PCs.
     * @return a cloudPcPowerState
     */
    @javax.annotation.Nullable
    public CloudPcPowerState getPowerState() {
        return this.powerState;
    }
    /**
     * Gets the provisioningPolicyId property value. The provisioning policy ID of the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvisioningPolicyId() {
        return this.provisioningPolicyId;
    }
    /**
     * Gets the provisioningPolicyName property value. The provisioning policy that is applied during the provisioning of Cloud PCs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvisioningPolicyName() {
        return this.provisioningPolicyName;
    }
    /**
     * Gets the provisioningType property value. The type of licenses to be used when provisioning Cloud PCs using this policy. Possible values are: dedicated, shared, unknownFutureValue. Default value is dedicated.
     * @return a cloudPcProvisioningType
     */
    @javax.annotation.Nullable
    public CloudPcProvisioningType getProvisioningType() {
        return this.provisioningType;
    }
    /**
     * Gets the servicePlanId property value. The service plan ID of the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePlanId() {
        return this.servicePlanId;
    }
    /**
     * Gets the servicePlanName property value. The service plan name of the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePlanName() {
        return this.servicePlanName;
    }
    /**
     * Gets the servicePlanType property value. The service plan type of the Cloud PC.
     * @return a cloudPcServicePlanType
     */
    @javax.annotation.Nullable
    public CloudPcServicePlanType getServicePlanType() {
        return this.servicePlanType;
    }
    /**
     * Gets the status property value. The status property
     * @return a cloudPcStatus
     */
    @javax.annotation.Nullable
    public CloudPcStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the statusDetails property value. The details of the Cloud PC status.
     * @return a cloudPcStatusDetails
     */
    @javax.annotation.Nullable
    public CloudPcStatusDetails getStatusDetails() {
        return this.statusDetails;
    }
    /**
     * Gets the userAccountType property value. The account type of the user on provisioned Cloud PCs. Possible values are: standardUser, administrator, and unknownFutureValue.
     * @return a cloudPcUserAccountType
     */
    @javax.annotation.Nullable
    public CloudPcUserAccountType getUserAccountType() {
        return this.userAccountType;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user assigned to the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
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
        writer.writeStringValue("aadDeviceId", this.getAadDeviceId());
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
        writer.writeStringValue("servicePlanId", this.getServicePlanId());
        writer.writeStringValue("servicePlanName", this.getServicePlanName());
        writer.writeEnumValue("servicePlanType", this.getServicePlanType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeObjectValue("statusDetails", this.getStatusDetails());
        writer.writeEnumValue("userAccountType", this.getUserAccountType());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the aadDeviceId property value. The Azure Active Directory (Azure AD) device ID of the Cloud PC.
     * @param value Value to set for the aadDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAadDeviceId(@javax.annotation.Nullable final String value) {
        this.aadDeviceId = value;
    }
    /**
     * Sets the connectivityResult property value. The connectivity health check result of a Cloud PC, including the updated timestamp and whether the Cloud PC can be connected.
     * @param value Value to set for the connectivityResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConnectivityResult(@javax.annotation.Nullable final CloudPcConnectivityResult value) {
        this.connectivityResult = value;
    }
    /**
     * Sets the diskEncryptionState property value. The disk encryption applied to the Cloud PC. Possible values: notAvailable, notEncrypted, encryptedUsingPlatformManagedKey, encryptedUsingCustomerManagedKey, and unknownFutureValue.
     * @param value Value to set for the diskEncryptionState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiskEncryptionState(@javax.annotation.Nullable final CloudPcDiskEncryptionState value) {
        this.diskEncryptionState = value;
    }
    /**
     * Sets the displayName property value. The display name of the Cloud PC.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the gracePeriodEndDateTime property value. The date and time when the grace period ends and reprovisioning/deprovisioning happens. Required only if the status is inGracePeriod. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the gracePeriodEndDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGracePeriodEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.gracePeriodEndDateTime = value;
    }
    /**
     * Sets the imageDisplayName property value. Name of the OS image that's on the Cloud PC.
     * @param value Value to set for the imageDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImageDisplayName(@javax.annotation.Nullable final String value) {
        this.imageDisplayName = value;
    }
    /**
     * Sets the lastLoginResult property value. The last login result of the Cloud PC. For example, { 'time': '2014-01-01T00:00:00Z'}.
     * @param value Value to set for the lastLoginResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastLoginResult(@javax.annotation.Nullable final CloudPcLoginResult value) {
        this.lastLoginResult = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The last modified date and time of the Cloud PC. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the lastRemoteActionResult property value. The last remote action result of the enterprise Cloud PCs. The supported remote actions are: Reboot, Rename, Reprovision, Restore, and Troubleshoot.
     * @param value Value to set for the lastRemoteActionResult property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastRemoteActionResult(@javax.annotation.Nullable final CloudPcRemoteActionResult value) {
        this.lastRemoteActionResult = value;
    }
    /**
     * Sets the managedDeviceId property value. The Intune device ID of the Cloud PC.
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this.managedDeviceId = value;
    }
    /**
     * Sets the managedDeviceName property value. The Intune device name of the Cloud PC.
     * @param value Value to set for the managedDeviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceName(@javax.annotation.Nullable final String value) {
        this.managedDeviceName = value;
    }
    /**
     * Sets the onPremisesConnectionName property value. The Azure network connection that is applied during the provisioning of Cloud PCs.
     * @param value Value to set for the onPremisesConnectionName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesConnectionName(@javax.annotation.Nullable final String value) {
        this.onPremisesConnectionName = value;
    }
    /**
     * Sets the osVersion property value. The version of the operating system (OS) to provision on Cloud PCs. Possible values are: windows10, windows11, and unknownFutureValue.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final CloudPcOperatingSystem value) {
        this.osVersion = value;
    }
    /**
     * Sets the partnerAgentInstallResults property value. The results of every partner agent's installation status on Cloud PC.
     * @param value Value to set for the partnerAgentInstallResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartnerAgentInstallResults(@javax.annotation.Nullable final java.util.List<CloudPcPartnerAgentInstallResult> value) {
        this.partnerAgentInstallResults = value;
    }
    /**
     * Sets the powerState property value. The power state of a Cloud PC. The possible values are: running, poweredOff and unknown. This property only supports shift work Cloud PCs.
     * @param value Value to set for the powerState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPowerState(@javax.annotation.Nullable final CloudPcPowerState value) {
        this.powerState = value;
    }
    /**
     * Sets the provisioningPolicyId property value. The provisioning policy ID of the Cloud PC.
     * @param value Value to set for the provisioningPolicyId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisioningPolicyId(@javax.annotation.Nullable final String value) {
        this.provisioningPolicyId = value;
    }
    /**
     * Sets the provisioningPolicyName property value. The provisioning policy that is applied during the provisioning of Cloud PCs.
     * @param value Value to set for the provisioningPolicyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisioningPolicyName(@javax.annotation.Nullable final String value) {
        this.provisioningPolicyName = value;
    }
    /**
     * Sets the provisioningType property value. The type of licenses to be used when provisioning Cloud PCs using this policy. Possible values are: dedicated, shared, unknownFutureValue. Default value is dedicated.
     * @param value Value to set for the provisioningType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisioningType(@javax.annotation.Nullable final CloudPcProvisioningType value) {
        this.provisioningType = value;
    }
    /**
     * Sets the servicePlanId property value. The service plan ID of the Cloud PC.
     * @param value Value to set for the servicePlanId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePlanId(@javax.annotation.Nullable final String value) {
        this.servicePlanId = value;
    }
    /**
     * Sets the servicePlanName property value. The service plan name of the Cloud PC.
     * @param value Value to set for the servicePlanName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePlanName(@javax.annotation.Nullable final String value) {
        this.servicePlanName = value;
    }
    /**
     * Sets the servicePlanType property value. The service plan type of the Cloud PC.
     * @param value Value to set for the servicePlanType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePlanType(@javax.annotation.Nullable final CloudPcServicePlanType value) {
        this.servicePlanType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final CloudPcStatus value) {
        this.status = value;
    }
    /**
     * Sets the statusDetails property value. The details of the Cloud PC status.
     * @param value Value to set for the statusDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatusDetails(@javax.annotation.Nullable final CloudPcStatusDetails value) {
        this.statusDetails = value;
    }
    /**
     * Sets the userAccountType property value. The account type of the user on provisioned Cloud PCs. Possible values are: standardUser, administrator, and unknownFutureValue.
     * @param value Value to set for the userAccountType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserAccountType(@javax.annotation.Nullable final CloudPcUserAccountType value) {
        this.userAccountType = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user assigned to the Cloud PC.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
