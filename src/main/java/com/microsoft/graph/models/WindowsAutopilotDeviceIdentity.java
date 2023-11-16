package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The windowsAutopilotDeviceIdentity resource represents a Windows Autopilot Device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsAutopilotDeviceIdentity extends Entity implements Parsable {
    /**
     * Instantiates a new WindowsAutopilotDeviceIdentity and sets the default values.
     */
    public WindowsAutopilotDeviceIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsAutopilotDeviceIdentity
     */
    @jakarta.annotation.Nonnull
    public static WindowsAutopilotDeviceIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAutopilotDeviceIdentity();
    }
    /**
     * Gets the addressableUserName property value. Addressable user name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAddressableUserName() {
        return this.BackingStore.get("addressableUserName");
    }
    /**
     * Gets the azureActiveDirectoryDeviceId property value. AAD Device ID - to be deprecated
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureActiveDirectoryDeviceId() {
        return this.BackingStore.get("azureActiveDirectoryDeviceId");
    }
    /**
     * Gets the azureAdDeviceId property value. AAD Device ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this.BackingStore.get("azureAdDeviceId");
    }
    /**
     * Gets the deploymentProfile property value. Deployment profile currently assigned to the Windows autopilot device.
     * @return a WindowsAutopilotDeploymentProfile
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotDeploymentProfile getDeploymentProfile() {
        return this.BackingStore.get("deploymentProfile");
    }
    /**
     * Gets the deploymentProfileAssignedDateTime property value. Profile set time of the Windows autopilot device.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeploymentProfileAssignedDateTime() {
        return this.BackingStore.get("deploymentProfileAssignedDateTime");
    }
    /**
     * Gets the deploymentProfileAssignmentDetailedStatus property value. The deploymentProfileAssignmentDetailedStatus property
     * @return a WindowsAutopilotProfileAssignmentDetailedStatus
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotProfileAssignmentDetailedStatus getDeploymentProfileAssignmentDetailedStatus() {
        return this.BackingStore.get("deploymentProfileAssignmentDetailedStatus");
    }
    /**
     * Gets the deploymentProfileAssignmentStatus property value. The deploymentProfileAssignmentStatus property
     * @return a WindowsAutopilotProfileAssignmentStatus
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotProfileAssignmentStatus getDeploymentProfileAssignmentStatus() {
        return this.BackingStore.get("deploymentProfileAssignmentStatus");
    }
    /**
     * Gets the deviceAccountPassword property value. Surface Hub Device Account Password
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceAccountPassword() {
        return this.BackingStore.get("deviceAccountPassword");
    }
    /**
     * Gets the deviceAccountUpn property value. Surface Hub Device Account Upn
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceAccountUpn() {
        return this.BackingStore.get("deviceAccountUpn");
    }
    /**
     * Gets the deviceFriendlyName property value. Surface Hub Device Friendly Name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceFriendlyName() {
        return this.BackingStore.get("deviceFriendlyName");
    }
    /**
     * Gets the displayName property value. Display Name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * Gets the enrollmentState property value. The enrollmentState property
     * @return a EnrollmentState
     */
    @jakarta.annotation.Nullable
    public EnrollmentState getEnrollmentState() {
        return this.BackingStore.get("enrollmentState");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addressableUserName", (n) -> { this.setAddressableUserName(n.getStringValue()); });
        deserializerMap.put("azureActiveDirectoryDeviceId", (n) -> { this.setAzureActiveDirectoryDeviceId(n.getStringValue()); });
        deserializerMap.put("azureAdDeviceId", (n) -> { this.setAzureAdDeviceId(n.getStringValue()); });
        deserializerMap.put("deploymentProfile", (n) -> { this.setDeploymentProfile(n.getObjectValue(WindowsAutopilotDeploymentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("deploymentProfileAssignedDateTime", (n) -> { this.setDeploymentProfileAssignedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploymentProfileAssignmentDetailedStatus", (n) -> { this.setDeploymentProfileAssignmentDetailedStatus(n.getEnumValue(WindowsAutopilotProfileAssignmentDetailedStatus.class)); });
        deserializerMap.put("deploymentProfileAssignmentStatus", (n) -> { this.setDeploymentProfileAssignmentStatus(n.getEnumValue(WindowsAutopilotProfileAssignmentStatus.class)); });
        deserializerMap.put("deviceAccountPassword", (n) -> { this.setDeviceAccountPassword(n.getStringValue()); });
        deserializerMap.put("deviceAccountUpn", (n) -> { this.setDeviceAccountUpn(n.getStringValue()); });
        deserializerMap.put("deviceFriendlyName", (n) -> { this.setDeviceFriendlyName(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("enrollmentState", (n) -> { this.setEnrollmentState(n.getEnumValue(EnrollmentState.class)); });
        deserializerMap.put("groupTag", (n) -> { this.setGroupTag(n.getStringValue()); });
        deserializerMap.put("intendedDeploymentProfile", (n) -> { this.setIntendedDeploymentProfile(n.getObjectValue(WindowsAutopilotDeploymentProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("lastContactedDateTime", (n) -> { this.setLastContactedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("productKey", (n) -> { this.setProductKey(n.getStringValue()); });
        deserializerMap.put("purchaseOrderIdentifier", (n) -> { this.setPurchaseOrderIdentifier(n.getStringValue()); });
        deserializerMap.put("remediationState", (n) -> { this.setRemediationState(n.getEnumValue(WindowsAutopilotDeviceRemediationState.class)); });
        deserializerMap.put("remediationStateLastModifiedDateTime", (n) -> { this.setRemediationStateLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resourceName", (n) -> { this.setResourceName(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("skuNumber", (n) -> { this.setSkuNumber(n.getStringValue()); });
        deserializerMap.put("systemFamily", (n) -> { this.setSystemFamily(n.getStringValue()); });
        deserializerMap.put("userlessEnrollmentStatus", (n) -> { this.setUserlessEnrollmentStatus(n.getEnumValue(WindowsAutopilotUserlessEnrollmentStatus.class)); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupTag property value. Group Tag of the Windows autopilot device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupTag() {
        return this.BackingStore.get("groupTag");
    }
    /**
     * Gets the intendedDeploymentProfile property value. Deployment profile intended to be assigned to the Windows autopilot device.
     * @return a WindowsAutopilotDeploymentProfile
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotDeploymentProfile getIntendedDeploymentProfile() {
        return this.BackingStore.get("intendedDeploymentProfile");
    }
    /**
     * Gets the lastContactedDateTime property value. Intune Last Contacted Date Time of the Windows autopilot device.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastContactedDateTime() {
        return this.BackingStore.get("lastContactedDateTime");
    }
    /**
     * Gets the managedDeviceId property value. Managed Device ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.BackingStore.get("managedDeviceId");
    }
    /**
     * Gets the manufacturer property value. Oem manufacturer of the Windows autopilot device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.BackingStore.get("manufacturer");
    }
    /**
     * Gets the model property value. Model name of the Windows autopilot device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.BackingStore.get("model");
    }
    /**
     * Gets the productKey property value. Product Key of the Windows autopilot device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProductKey() {
        return this.BackingStore.get("productKey");
    }
    /**
     * Gets the purchaseOrderIdentifier property value. Purchase Order Identifier of the Windows autopilot device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPurchaseOrderIdentifier() {
        return this.BackingStore.get("purchaseOrderIdentifier");
    }
    /**
     * Gets the remediationState property value. Device remediation status, indicating whether or not hardware has been changed for an Autopilot-registered device.
     * @return a WindowsAutopilotDeviceRemediationState
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotDeviceRemediationState getRemediationState() {
        return this.BackingStore.get("remediationState");
    }
    /**
     * Gets the remediationStateLastModifiedDateTime property value. RemediationState set time of Autopilot device.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRemediationStateLastModifiedDateTime() {
        return this.BackingStore.get("remediationStateLastModifiedDateTime");
    }
    /**
     * Gets the resourceName property value. Resource Name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceName() {
        return this.BackingStore.get("resourceName");
    }
    /**
     * Gets the serialNumber property value. Serial number of the Windows autopilot device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.BackingStore.get("serialNumber");
    }
    /**
     * Gets the skuNumber property value. SKU Number
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSkuNumber() {
        return this.BackingStore.get("skuNumber");
    }
    /**
     * Gets the systemFamily property value. System Family
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSystemFamily() {
        return this.BackingStore.get("systemFamily");
    }
    /**
     * Gets the userlessEnrollmentStatus property value. Userless enrollment block status, indicating whether the next device enrollment will be blocked.
     * @return a WindowsAutopilotUserlessEnrollmentStatus
     */
    @jakarta.annotation.Nullable
    public WindowsAutopilotUserlessEnrollmentStatus getUserlessEnrollmentStatus() {
        return this.BackingStore.get("userlessEnrollmentStatus");
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name.
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
        writer.writeStringValue("addressableUserName", this.getAddressableUserName());
        writer.writeStringValue("azureActiveDirectoryDeviceId", this.getAzureActiveDirectoryDeviceId());
        writer.writeStringValue("azureAdDeviceId", this.getAzureAdDeviceId());
        writer.writeObjectValue("deploymentProfile", this.getDeploymentProfile());
        writer.writeOffsetDateTimeValue("deploymentProfileAssignedDateTime", this.getDeploymentProfileAssignedDateTime());
        writer.writeEnumValue("deploymentProfileAssignmentDetailedStatus", this.getDeploymentProfileAssignmentDetailedStatus());
        writer.writeEnumValue("deploymentProfileAssignmentStatus", this.getDeploymentProfileAssignmentStatus());
        writer.writeStringValue("deviceAccountPassword", this.getDeviceAccountPassword());
        writer.writeStringValue("deviceAccountUpn", this.getDeviceAccountUpn());
        writer.writeStringValue("deviceFriendlyName", this.getDeviceFriendlyName());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("enrollmentState", this.getEnrollmentState());
        writer.writeStringValue("groupTag", this.getGroupTag());
        writer.writeObjectValue("intendedDeploymentProfile", this.getIntendedDeploymentProfile());
        writer.writeOffsetDateTimeValue("lastContactedDateTime", this.getLastContactedDateTime());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("productKey", this.getProductKey());
        writer.writeStringValue("purchaseOrderIdentifier", this.getPurchaseOrderIdentifier());
        writer.writeEnumValue("remediationState", this.getRemediationState());
        writer.writeOffsetDateTimeValue("remediationStateLastModifiedDateTime", this.getRemediationStateLastModifiedDateTime());
        writer.writeStringValue("resourceName", this.getResourceName());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeStringValue("skuNumber", this.getSkuNumber());
        writer.writeStringValue("systemFamily", this.getSystemFamily());
        writer.writeEnumValue("userlessEnrollmentStatus", this.getUserlessEnrollmentStatus());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the addressableUserName property value. Addressable user name.
     * @param value Value to set for the addressableUserName property.
     */
    public void setAddressableUserName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("addressableUserName", value);
    }
    /**
     * Sets the azureActiveDirectoryDeviceId property value. AAD Device ID - to be deprecated
     * @param value Value to set for the azureActiveDirectoryDeviceId property.
     */
    public void setAzureActiveDirectoryDeviceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("azureActiveDirectoryDeviceId", value);
    }
    /**
     * Sets the azureAdDeviceId property value. AAD Device ID
     * @param value Value to set for the azureAdDeviceId property.
     */
    public void setAzureAdDeviceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("azureAdDeviceId", value);
    }
    /**
     * Sets the deploymentProfile property value. Deployment profile currently assigned to the Windows autopilot device.
     * @param value Value to set for the deploymentProfile property.
     */
    public void setDeploymentProfile(@jakarta.annotation.Nullable final WindowsAutopilotDeploymentProfile value) {
        this.BackingStore.set("deploymentProfile", value);
    }
    /**
     * Sets the deploymentProfileAssignedDateTime property value. Profile set time of the Windows autopilot device.
     * @param value Value to set for the deploymentProfileAssignedDateTime property.
     */
    public void setDeploymentProfileAssignedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("deploymentProfileAssignedDateTime", value);
    }
    /**
     * Sets the deploymentProfileAssignmentDetailedStatus property value. The deploymentProfileAssignmentDetailedStatus property
     * @param value Value to set for the deploymentProfileAssignmentDetailedStatus property.
     */
    public void setDeploymentProfileAssignmentDetailedStatus(@jakarta.annotation.Nullable final WindowsAutopilotProfileAssignmentDetailedStatus value) {
        this.BackingStore.set("deploymentProfileAssignmentDetailedStatus", value);
    }
    /**
     * Sets the deploymentProfileAssignmentStatus property value. The deploymentProfileAssignmentStatus property
     * @param value Value to set for the deploymentProfileAssignmentStatus property.
     */
    public void setDeploymentProfileAssignmentStatus(@jakarta.annotation.Nullable final WindowsAutopilotProfileAssignmentStatus value) {
        this.BackingStore.set("deploymentProfileAssignmentStatus", value);
    }
    /**
     * Sets the deviceAccountPassword property value. Surface Hub Device Account Password
     * @param value Value to set for the deviceAccountPassword property.
     */
    public void setDeviceAccountPassword(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("deviceAccountPassword", value);
    }
    /**
     * Sets the deviceAccountUpn property value. Surface Hub Device Account Upn
     * @param value Value to set for the deviceAccountUpn property.
     */
    public void setDeviceAccountUpn(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("deviceAccountUpn", value);
    }
    /**
     * Sets the deviceFriendlyName property value. Surface Hub Device Friendly Name
     * @param value Value to set for the deviceFriendlyName property.
     */
    public void setDeviceFriendlyName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("deviceFriendlyName", value);
    }
    /**
     * Sets the displayName property value. Display Name
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the enrollmentState property value. The enrollmentState property
     * @param value Value to set for the enrollmentState property.
     */
    public void setEnrollmentState(@jakarta.annotation.Nullable final EnrollmentState value) {
        this.BackingStore.set("enrollmentState", value);
    }
    /**
     * Sets the groupTag property value. Group Tag of the Windows autopilot device.
     * @param value Value to set for the groupTag property.
     */
    public void setGroupTag(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("groupTag", value);
    }
    /**
     * Sets the intendedDeploymentProfile property value. Deployment profile intended to be assigned to the Windows autopilot device.
     * @param value Value to set for the intendedDeploymentProfile property.
     */
    public void setIntendedDeploymentProfile(@jakarta.annotation.Nullable final WindowsAutopilotDeploymentProfile value) {
        this.BackingStore.set("intendedDeploymentProfile", value);
    }
    /**
     * Sets the lastContactedDateTime property value. Intune Last Contacted Date Time of the Windows autopilot device.
     * @param value Value to set for the lastContactedDateTime property.
     */
    public void setLastContactedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastContactedDateTime", value);
    }
    /**
     * Sets the managedDeviceId property value. Managed Device ID
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("managedDeviceId", value);
    }
    /**
     * Sets the manufacturer property value. Oem manufacturer of the Windows autopilot device.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("manufacturer", value);
    }
    /**
     * Sets the model property value. Model name of the Windows autopilot device.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("model", value);
    }
    /**
     * Sets the productKey property value. Product Key of the Windows autopilot device.
     * @param value Value to set for the productKey property.
     */
    public void setProductKey(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("productKey", value);
    }
    /**
     * Sets the purchaseOrderIdentifier property value. Purchase Order Identifier of the Windows autopilot device.
     * @param value Value to set for the purchaseOrderIdentifier property.
     */
    public void setPurchaseOrderIdentifier(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("purchaseOrderIdentifier", value);
    }
    /**
     * Sets the remediationState property value. Device remediation status, indicating whether or not hardware has been changed for an Autopilot-registered device.
     * @param value Value to set for the remediationState property.
     */
    public void setRemediationState(@jakarta.annotation.Nullable final WindowsAutopilotDeviceRemediationState value) {
        this.BackingStore.set("remediationState", value);
    }
    /**
     * Sets the remediationStateLastModifiedDateTime property value. RemediationState set time of Autopilot device.
     * @param value Value to set for the remediationStateLastModifiedDateTime property.
     */
    public void setRemediationStateLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("remediationStateLastModifiedDateTime", value);
    }
    /**
     * Sets the resourceName property value. Resource Name.
     * @param value Value to set for the resourceName property.
     */
    public void setResourceName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("resourceName", value);
    }
    /**
     * Sets the serialNumber property value. Serial number of the Windows autopilot device.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("serialNumber", value);
    }
    /**
     * Sets the skuNumber property value. SKU Number
     * @param value Value to set for the skuNumber property.
     */
    public void setSkuNumber(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("skuNumber", value);
    }
    /**
     * Sets the systemFamily property value. System Family
     * @param value Value to set for the systemFamily property.
     */
    public void setSystemFamily(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("systemFamily", value);
    }
    /**
     * Sets the userlessEnrollmentStatus property value. Userless enrollment block status, indicating whether the next device enrollment will be blocked.
     * @param value Value to set for the userlessEnrollmentStatus property.
     */
    public void setUserlessEnrollmentStatus(@jakarta.annotation.Nullable final WindowsAutopilotUserlessEnrollmentStatus value) {
        this.BackingStore.set("userlessEnrollmentStatus", value);
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("userPrincipalName", value);
    }
}
