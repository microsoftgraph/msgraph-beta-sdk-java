package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Casts the previous resource to group. */
public class CloudPC extends Entity implements Parsable {
    /** The Azure Active Directory (Azure AD) device ID of the Cloud PC. */
    private String _aadDeviceId;
    /** The display name of the Cloud PC. */
    private String _displayName;
    /** The date and time when the grace period ends and reprovisioning/deprovisioning happens. Required only if the status is inGracePeriod. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _gracePeriodEndDateTime;
    /** Name of the OS image that's on the Cloud PC. */
    private String _imageDisplayName;
    /** The last login result of the Cloud PC. For example, { 'time': '2014-01-01T00:00:00Z'}. */
    private CloudPcLoginResult _lastLoginResult;
    /** The last modified date and time of the Cloud PC. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The last remote action result of the enterprise Cloud PCs. The supported remote actions are: Reboot, Rename, Reprovision, Restore, and Troubleshoot. */
    private CloudPcRemoteActionResult _lastRemoteActionResult;
    /** The Intune device ID of the Cloud PC. */
    private String _managedDeviceId;
    /** The Intune device name of the Cloud PC. */
    private String _managedDeviceName;
    /** The Azure network connection that is applied during the provisioning of Cloud PCs. */
    private String _onPremisesConnectionName;
    /** The version of the operating system (OS) to provision on Cloud PCs. Possible values are: windows10, windows11, and unknownFutureValue. */
    private CloudPcOperatingSystem _osVersion;
    /** The provisioning policy ID of the Cloud PC. */
    private String _provisioningPolicyId;
    /** The provisioning policy that is applied during the provisioning of Cloud PCs. */
    private String _provisioningPolicyName;
    /** The service plan ID of the Cloud PC. */
    private String _servicePlanId;
    /** The service plan name of the Cloud PC. */
    private String _servicePlanName;
    /** The service plan type of the Cloud PC. */
    private CloudPcServicePlanType _servicePlanType;
    /** The status of the Cloud PC. Possible values are: notProvisioned, provisioning, provisioned, upgrading, inGracePeriod, deprovisioning, failed, restoring. */
    private CloudPcStatus _status;
    /** The details of the Cloud PC status. */
    private CloudPcStatusDetails _statusDetails;
    /** The account type of the user on provisioned Cloud PCs. Possible values are: standardUser, administrator, and unknownFutureValue. */
    private CloudPcUserAccountType _userAccountType;
    /** The user principal name (UPN) of the user assigned to the Cloud PC. */
    private String _userPrincipalName;
    /**
     * Instantiates a new cloudPC and sets the default values.
     * @return a void
     */
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
        return this._aadDeviceId;
    }
    /**
     * Gets the displayName property value. The display name of the Cloud PC.
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
        final CloudPC currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("aadDeviceId", (n) -> { currentObject.setAadDeviceId(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("gracePeriodEndDateTime", (n) -> { currentObject.setGracePeriodEndDateTime(n.getOffsetDateTimeValue()); });
            this.put("imageDisplayName", (n) -> { currentObject.setImageDisplayName(n.getStringValue()); });
            this.put("lastLoginResult", (n) -> { currentObject.setLastLoginResult(n.getObjectValue(CloudPcLoginResult::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastRemoteActionResult", (n) -> { currentObject.setLastRemoteActionResult(n.getObjectValue(CloudPcRemoteActionResult::createFromDiscriminatorValue)); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("managedDeviceName", (n) -> { currentObject.setManagedDeviceName(n.getStringValue()); });
            this.put("onPremisesConnectionName", (n) -> { currentObject.setOnPremisesConnectionName(n.getStringValue()); });
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getEnumValue(CloudPcOperatingSystem.class)); });
            this.put("provisioningPolicyId", (n) -> { currentObject.setProvisioningPolicyId(n.getStringValue()); });
            this.put("provisioningPolicyName", (n) -> { currentObject.setProvisioningPolicyName(n.getStringValue()); });
            this.put("servicePlanId", (n) -> { currentObject.setServicePlanId(n.getStringValue()); });
            this.put("servicePlanName", (n) -> { currentObject.setServicePlanName(n.getStringValue()); });
            this.put("servicePlanType", (n) -> { currentObject.setServicePlanType(n.getEnumValue(CloudPcServicePlanType.class)); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(CloudPcStatus.class)); });
            this.put("statusDetails", (n) -> { currentObject.setStatusDetails(n.getObjectValue(CloudPcStatusDetails::createFromDiscriminatorValue)); });
            this.put("userAccountType", (n) -> { currentObject.setUserAccountType(n.getEnumValue(CloudPcUserAccountType.class)); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the gracePeriodEndDateTime property value. The date and time when the grace period ends and reprovisioning/deprovisioning happens. Required only if the status is inGracePeriod. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getGracePeriodEndDateTime() {
        return this._gracePeriodEndDateTime;
    }
    /**
     * Gets the imageDisplayName property value. Name of the OS image that's on the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImageDisplayName() {
        return this._imageDisplayName;
    }
    /**
     * Gets the lastLoginResult property value. The last login result of the Cloud PC. For example, { 'time': '2014-01-01T00:00:00Z'}.
     * @return a cloudPcLoginResult
     */
    @javax.annotation.Nullable
    public CloudPcLoginResult getLastLoginResult() {
        return this._lastLoginResult;
    }
    /**
     * Gets the lastModifiedDateTime property value. The last modified date and time of the Cloud PC. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the lastRemoteActionResult property value. The last remote action result of the enterprise Cloud PCs. The supported remote actions are: Reboot, Rename, Reprovision, Restore, and Troubleshoot.
     * @return a cloudPcRemoteActionResult
     */
    @javax.annotation.Nullable
    public CloudPcRemoteActionResult getLastRemoteActionResult() {
        return this._lastRemoteActionResult;
    }
    /**
     * Gets the managedDeviceId property value. The Intune device ID of the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
    }
    /**
     * Gets the managedDeviceName property value. The Intune device name of the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceName() {
        return this._managedDeviceName;
    }
    /**
     * Gets the onPremisesConnectionName property value. The Azure network connection that is applied during the provisioning of Cloud PCs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesConnectionName() {
        return this._onPremisesConnectionName;
    }
    /**
     * Gets the osVersion property value. The version of the operating system (OS) to provision on Cloud PCs. Possible values are: windows10, windows11, and unknownFutureValue.
     * @return a cloudPcOperatingSystem
     */
    @javax.annotation.Nullable
    public CloudPcOperatingSystem getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the provisioningPolicyId property value. The provisioning policy ID of the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvisioningPolicyId() {
        return this._provisioningPolicyId;
    }
    /**
     * Gets the provisioningPolicyName property value. The provisioning policy that is applied during the provisioning of Cloud PCs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProvisioningPolicyName() {
        return this._provisioningPolicyName;
    }
    /**
     * Gets the servicePlanId property value. The service plan ID of the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePlanId() {
        return this._servicePlanId;
    }
    /**
     * Gets the servicePlanName property value. The service plan name of the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServicePlanName() {
        return this._servicePlanName;
    }
    /**
     * Gets the servicePlanType property value. The service plan type of the Cloud PC.
     * @return a cloudPcServicePlanType
     */
    @javax.annotation.Nullable
    public CloudPcServicePlanType getServicePlanType() {
        return this._servicePlanType;
    }
    /**
     * Gets the status property value. The status of the Cloud PC. Possible values are: notProvisioned, provisioning, provisioned, upgrading, inGracePeriod, deprovisioning, failed, restoring.
     * @return a cloudPcStatus
     */
    @javax.annotation.Nullable
    public CloudPcStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the statusDetails property value. The details of the Cloud PC status.
     * @return a cloudPcStatusDetails
     */
    @javax.annotation.Nullable
    public CloudPcStatusDetails getStatusDetails() {
        return this._statusDetails;
    }
    /**
     * Gets the userAccountType property value. The account type of the user on provisioned Cloud PCs. Possible values are: standardUser, administrator, and unknownFutureValue.
     * @return a cloudPcUserAccountType
     */
    @javax.annotation.Nullable
    public CloudPcUserAccountType getUserAccountType() {
        return this._userAccountType;
    }
    /**
     * Gets the userPrincipalName property value. The user principal name (UPN) of the user assigned to the Cloud PC.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("aadDeviceId", this.getAadDeviceId());
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
        writer.writeStringValue("provisioningPolicyId", this.getProvisioningPolicyId());
        writer.writeStringValue("provisioningPolicyName", this.getProvisioningPolicyName());
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
    public void setAadDeviceId(@javax.annotation.Nullable final String value) {
        this._aadDeviceId = value;
    }
    /**
     * Sets the displayName property value. The display name of the Cloud PC.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the gracePeriodEndDateTime property value. The date and time when the grace period ends and reprovisioning/deprovisioning happens. Required only if the status is inGracePeriod. The timestamp is shown in ISO 8601 format and Coordinated Universal Time (UTC). For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the gracePeriodEndDateTime property.
     * @return a void
     */
    public void setGracePeriodEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._gracePeriodEndDateTime = value;
    }
    /**
     * Sets the imageDisplayName property value. Name of the OS image that's on the Cloud PC.
     * @param value Value to set for the imageDisplayName property.
     * @return a void
     */
    public void setImageDisplayName(@javax.annotation.Nullable final String value) {
        this._imageDisplayName = value;
    }
    /**
     * Sets the lastLoginResult property value. The last login result of the Cloud PC. For example, { 'time': '2014-01-01T00:00:00Z'}.
     * @param value Value to set for the lastLoginResult property.
     * @return a void
     */
    public void setLastLoginResult(@javax.annotation.Nullable final CloudPcLoginResult value) {
        this._lastLoginResult = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The last modified date and time of the Cloud PC. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the lastRemoteActionResult property value. The last remote action result of the enterprise Cloud PCs. The supported remote actions are: Reboot, Rename, Reprovision, Restore, and Troubleshoot.
     * @param value Value to set for the lastRemoteActionResult property.
     * @return a void
     */
    public void setLastRemoteActionResult(@javax.annotation.Nullable final CloudPcRemoteActionResult value) {
        this._lastRemoteActionResult = value;
    }
    /**
     * Sets the managedDeviceId property value. The Intune device ID of the Cloud PC.
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
    /**
     * Sets the managedDeviceName property value. The Intune device name of the Cloud PC.
     * @param value Value to set for the managedDeviceName property.
     * @return a void
     */
    public void setManagedDeviceName(@javax.annotation.Nullable final String value) {
        this._managedDeviceName = value;
    }
    /**
     * Sets the onPremisesConnectionName property value. The Azure network connection that is applied during the provisioning of Cloud PCs.
     * @param value Value to set for the onPremisesConnectionName property.
     * @return a void
     */
    public void setOnPremisesConnectionName(@javax.annotation.Nullable final String value) {
        this._onPremisesConnectionName = value;
    }
    /**
     * Sets the osVersion property value. The version of the operating system (OS) to provision on Cloud PCs. Possible values are: windows10, windows11, and unknownFutureValue.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    public void setOsVersion(@javax.annotation.Nullable final CloudPcOperatingSystem value) {
        this._osVersion = value;
    }
    /**
     * Sets the provisioningPolicyId property value. The provisioning policy ID of the Cloud PC.
     * @param value Value to set for the provisioningPolicyId property.
     * @return a void
     */
    public void setProvisioningPolicyId(@javax.annotation.Nullable final String value) {
        this._provisioningPolicyId = value;
    }
    /**
     * Sets the provisioningPolicyName property value. The provisioning policy that is applied during the provisioning of Cloud PCs.
     * @param value Value to set for the provisioningPolicyName property.
     * @return a void
     */
    public void setProvisioningPolicyName(@javax.annotation.Nullable final String value) {
        this._provisioningPolicyName = value;
    }
    /**
     * Sets the servicePlanId property value. The service plan ID of the Cloud PC.
     * @param value Value to set for the servicePlanId property.
     * @return a void
     */
    public void setServicePlanId(@javax.annotation.Nullable final String value) {
        this._servicePlanId = value;
    }
    /**
     * Sets the servicePlanName property value. The service plan name of the Cloud PC.
     * @param value Value to set for the servicePlanName property.
     * @return a void
     */
    public void setServicePlanName(@javax.annotation.Nullable final String value) {
        this._servicePlanName = value;
    }
    /**
     * Sets the servicePlanType property value. The service plan type of the Cloud PC.
     * @param value Value to set for the servicePlanType property.
     * @return a void
     */
    public void setServicePlanType(@javax.annotation.Nullable final CloudPcServicePlanType value) {
        this._servicePlanType = value;
    }
    /**
     * Sets the status property value. The status of the Cloud PC. Possible values are: notProvisioned, provisioning, provisioned, upgrading, inGracePeriod, deprovisioning, failed, restoring.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final CloudPcStatus value) {
        this._status = value;
    }
    /**
     * Sets the statusDetails property value. The details of the Cloud PC status.
     * @param value Value to set for the statusDetails property.
     * @return a void
     */
    public void setStatusDetails(@javax.annotation.Nullable final CloudPcStatusDetails value) {
        this._statusDetails = value;
    }
    /**
     * Sets the userAccountType property value. The account type of the user on provisioned Cloud PCs. Possible values are: standardUser, administrator, and unknownFutureValue.
     * @param value Value to set for the userAccountType property.
     * @return a void
     */
    public void setUserAccountType(@javax.annotation.Nullable final CloudPcUserAccountType value) {
        this._userAccountType = value;
    }
    /**
     * Sets the userPrincipalName property value. The user principal name (UPN) of the user assigned to the Cloud PC.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
