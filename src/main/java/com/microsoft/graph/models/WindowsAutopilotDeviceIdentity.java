package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The windowsAutopilotDeviceIdentity resource represents a Windows Autopilot Device. */
public class WindowsAutopilotDeviceIdentity extends Entity implements Parsable {
    /** Addressable user name. */
    private String _addressableUserName;
    /** AAD Device ID - to be deprecated */
    private String _azureActiveDirectoryDeviceId;
    /** AAD Device ID */
    private String _azureAdDeviceId;
    /** Deployment profile currently assigned to the Windows autopilot device. */
    private WindowsAutopilotDeploymentProfile _deploymentProfile;
    /** Profile set time of the Windows autopilot device. */
    private OffsetDateTime _deploymentProfileAssignedDateTime;
    /** The deploymentProfileAssignmentDetailedStatus property */
    private WindowsAutopilotProfileAssignmentDetailedStatus _deploymentProfileAssignmentDetailedStatus;
    /** The deploymentProfileAssignmentStatus property */
    private WindowsAutopilotProfileAssignmentStatus _deploymentProfileAssignmentStatus;
    /** Surface Hub Device Account Password */
    private String _deviceAccountPassword;
    /** Surface Hub Device Account Upn */
    private String _deviceAccountUpn;
    /** Surface Hub Device Friendly Name */
    private String _deviceFriendlyName;
    /** Display Name */
    private String _displayName;
    /** The enrollmentState property */
    private EnrollmentState _enrollmentState;
    /** Group Tag of the Windows autopilot device. */
    private String _groupTag;
    /** Deployment profile intended to be assigned to the Windows autopilot device. */
    private WindowsAutopilotDeploymentProfile _intendedDeploymentProfile;
    /** Intune Last Contacted Date Time of the Windows autopilot device. */
    private OffsetDateTime _lastContactedDateTime;
    /** Managed Device ID */
    private String _managedDeviceId;
    /** Oem manufacturer of the Windows autopilot device. */
    private String _manufacturer;
    /** Model name of the Windows autopilot device. */
    private String _model;
    /** Product Key of the Windows autopilot device. */
    private String _productKey;
    /** Purchase Order Identifier of the Windows autopilot device. */
    private String _purchaseOrderIdentifier;
    /** Device remediation status, indicating whether or not hardware has been changed for an Autopilot-registered device. */
    private WindowsAutopilotDeviceRemediationState _remediationState;
    /** RemediationState set time of Autopilot device. */
    private OffsetDateTime _remediationStateLastModifiedDateTime;
    /** Resource Name. */
    private String _resourceName;
    /** Serial number of the Windows autopilot device. */
    private String _serialNumber;
    /** SKU Number */
    private String _skuNumber;
    /** System Family */
    private String _systemFamily;
    /** User Principal Name. */
    private String _userPrincipalName;
    /**
     * Instantiates a new windowsAutopilotDeviceIdentity and sets the default values.
     * @return a void
     */
    public WindowsAutopilotDeviceIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsAutopilotDeviceIdentity
     */
    @javax.annotation.Nonnull
    public static WindowsAutopilotDeviceIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAutopilotDeviceIdentity();
    }
    /**
     * Gets the addressableUserName property value. Addressable user name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAddressableUserName() {
        return this._addressableUserName;
    }
    /**
     * Gets the azureActiveDirectoryDeviceId property value. AAD Device ID - to be deprecated
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureActiveDirectoryDeviceId() {
        return this._azureActiveDirectoryDeviceId;
    }
    /**
     * Gets the azureAdDeviceId property value. AAD Device ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this._azureAdDeviceId;
    }
    /**
     * Gets the deploymentProfile property value. Deployment profile currently assigned to the Windows autopilot device.
     * @return a windowsAutopilotDeploymentProfile
     */
    @javax.annotation.Nullable
    public WindowsAutopilotDeploymentProfile getDeploymentProfile() {
        return this._deploymentProfile;
    }
    /**
     * Gets the deploymentProfileAssignedDateTime property value. Profile set time of the Windows autopilot device.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeploymentProfileAssignedDateTime() {
        return this._deploymentProfileAssignedDateTime;
    }
    /**
     * Gets the deploymentProfileAssignmentDetailedStatus property value. The deploymentProfileAssignmentDetailedStatus property
     * @return a windowsAutopilotProfileAssignmentDetailedStatus
     */
    @javax.annotation.Nullable
    public WindowsAutopilotProfileAssignmentDetailedStatus getDeploymentProfileAssignmentDetailedStatus() {
        return this._deploymentProfileAssignmentDetailedStatus;
    }
    /**
     * Gets the deploymentProfileAssignmentStatus property value. The deploymentProfileAssignmentStatus property
     * @return a windowsAutopilotProfileAssignmentStatus
     */
    @javax.annotation.Nullable
    public WindowsAutopilotProfileAssignmentStatus getDeploymentProfileAssignmentStatus() {
        return this._deploymentProfileAssignmentStatus;
    }
    /**
     * Gets the deviceAccountPassword property value. Surface Hub Device Account Password
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceAccountPassword() {
        return this._deviceAccountPassword;
    }
    /**
     * Gets the deviceAccountUpn property value. Surface Hub Device Account Upn
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceAccountUpn() {
        return this._deviceAccountUpn;
    }
    /**
     * Gets the deviceFriendlyName property value. Surface Hub Device Friendly Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceFriendlyName() {
        return this._deviceFriendlyName;
    }
    /**
     * Gets the displayName property value. Display Name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the enrollmentState property value. The enrollmentState property
     * @return a enrollmentState
     */
    @javax.annotation.Nullable
    public EnrollmentState getEnrollmentState() {
        return this._enrollmentState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsAutopilotDeviceIdentity currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("addressableUserName", (n) -> { currentObject.setAddressableUserName(n.getStringValue()); });
            this.put("azureActiveDirectoryDeviceId", (n) -> { currentObject.setAzureActiveDirectoryDeviceId(n.getStringValue()); });
            this.put("azureAdDeviceId", (n) -> { currentObject.setAzureAdDeviceId(n.getStringValue()); });
            this.put("deploymentProfile", (n) -> { currentObject.setDeploymentProfile(n.getObjectValue(WindowsAutopilotDeploymentProfile::createFromDiscriminatorValue)); });
            this.put("deploymentProfileAssignedDateTime", (n) -> { currentObject.setDeploymentProfileAssignedDateTime(n.getOffsetDateTimeValue()); });
            this.put("deploymentProfileAssignmentDetailedStatus", (n) -> { currentObject.setDeploymentProfileAssignmentDetailedStatus(n.getEnumValue(WindowsAutopilotProfileAssignmentDetailedStatus.class)); });
            this.put("deploymentProfileAssignmentStatus", (n) -> { currentObject.setDeploymentProfileAssignmentStatus(n.getEnumValue(WindowsAutopilotProfileAssignmentStatus.class)); });
            this.put("deviceAccountPassword", (n) -> { currentObject.setDeviceAccountPassword(n.getStringValue()); });
            this.put("deviceAccountUpn", (n) -> { currentObject.setDeviceAccountUpn(n.getStringValue()); });
            this.put("deviceFriendlyName", (n) -> { currentObject.setDeviceFriendlyName(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("enrollmentState", (n) -> { currentObject.setEnrollmentState(n.getEnumValue(EnrollmentState.class)); });
            this.put("groupTag", (n) -> { currentObject.setGroupTag(n.getStringValue()); });
            this.put("intendedDeploymentProfile", (n) -> { currentObject.setIntendedDeploymentProfile(n.getObjectValue(WindowsAutopilotDeploymentProfile::createFromDiscriminatorValue)); });
            this.put("lastContactedDateTime", (n) -> { currentObject.setLastContactedDateTime(n.getOffsetDateTimeValue()); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
            this.put("productKey", (n) -> { currentObject.setProductKey(n.getStringValue()); });
            this.put("purchaseOrderIdentifier", (n) -> { currentObject.setPurchaseOrderIdentifier(n.getStringValue()); });
            this.put("remediationState", (n) -> { currentObject.setRemediationState(n.getEnumValue(WindowsAutopilotDeviceRemediationState.class)); });
            this.put("remediationStateLastModifiedDateTime", (n) -> { currentObject.setRemediationStateLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("resourceName", (n) -> { currentObject.setResourceName(n.getStringValue()); });
            this.put("serialNumber", (n) -> { currentObject.setSerialNumber(n.getStringValue()); });
            this.put("skuNumber", (n) -> { currentObject.setSkuNumber(n.getStringValue()); });
            this.put("systemFamily", (n) -> { currentObject.setSystemFamily(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the groupTag property value. Group Tag of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupTag() {
        return this._groupTag;
    }
    /**
     * Gets the intendedDeploymentProfile property value. Deployment profile intended to be assigned to the Windows autopilot device.
     * @return a windowsAutopilotDeploymentProfile
     */
    @javax.annotation.Nullable
    public WindowsAutopilotDeploymentProfile getIntendedDeploymentProfile() {
        return this._intendedDeploymentProfile;
    }
    /**
     * Gets the lastContactedDateTime property value. Intune Last Contacted Date Time of the Windows autopilot device.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastContactedDateTime() {
        return this._lastContactedDateTime;
    }
    /**
     * Gets the managedDeviceId property value. Managed Device ID
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
    }
    /**
     * Gets the manufacturer property value. Oem manufacturer of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the model property value. Model name of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the productKey property value. Product Key of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductKey() {
        return this._productKey;
    }
    /**
     * Gets the purchaseOrderIdentifier property value. Purchase Order Identifier of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPurchaseOrderIdentifier() {
        return this._purchaseOrderIdentifier;
    }
    /**
     * Gets the remediationState property value. Device remediation status, indicating whether or not hardware has been changed for an Autopilot-registered device.
     * @return a windowsAutopilotDeviceRemediationState
     */
    @javax.annotation.Nullable
    public WindowsAutopilotDeviceRemediationState getRemediationState() {
        return this._remediationState;
    }
    /**
     * Gets the remediationStateLastModifiedDateTime property value. RemediationState set time of Autopilot device.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRemediationStateLastModifiedDateTime() {
        return this._remediationStateLastModifiedDateTime;
    }
    /**
     * Gets the resourceName property value. Resource Name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceName() {
        return this._resourceName;
    }
    /**
     * Gets the serialNumber property value. Serial number of the Windows autopilot device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this._serialNumber;
    }
    /**
     * Gets the skuNumber property value. SKU Number
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuNumber() {
        return this._skuNumber;
    }
    /**
     * Gets the systemFamily property value. System Family
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSystemFamily() {
        return this._systemFamily;
    }
    /**
     * Gets the userPrincipalName property value. User Principal Name.
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
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the addressableUserName property value. Addressable user name.
     * @param value Value to set for the addressableUserName property.
     * @return a void
     */
    public void setAddressableUserName(@javax.annotation.Nullable final String value) {
        this._addressableUserName = value;
    }
    /**
     * Sets the azureActiveDirectoryDeviceId property value. AAD Device ID - to be deprecated
     * @param value Value to set for the azureActiveDirectoryDeviceId property.
     * @return a void
     */
    public void setAzureActiveDirectoryDeviceId(@javax.annotation.Nullable final String value) {
        this._azureActiveDirectoryDeviceId = value;
    }
    /**
     * Sets the azureAdDeviceId property value. AAD Device ID
     * @param value Value to set for the azureAdDeviceId property.
     * @return a void
     */
    public void setAzureAdDeviceId(@javax.annotation.Nullable final String value) {
        this._azureAdDeviceId = value;
    }
    /**
     * Sets the deploymentProfile property value. Deployment profile currently assigned to the Windows autopilot device.
     * @param value Value to set for the deploymentProfile property.
     * @return a void
     */
    public void setDeploymentProfile(@javax.annotation.Nullable final WindowsAutopilotDeploymentProfile value) {
        this._deploymentProfile = value;
    }
    /**
     * Sets the deploymentProfileAssignedDateTime property value. Profile set time of the Windows autopilot device.
     * @param value Value to set for the deploymentProfileAssignedDateTime property.
     * @return a void
     */
    public void setDeploymentProfileAssignedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deploymentProfileAssignedDateTime = value;
    }
    /**
     * Sets the deploymentProfileAssignmentDetailedStatus property value. The deploymentProfileAssignmentDetailedStatus property
     * @param value Value to set for the deploymentProfileAssignmentDetailedStatus property.
     * @return a void
     */
    public void setDeploymentProfileAssignmentDetailedStatus(@javax.annotation.Nullable final WindowsAutopilotProfileAssignmentDetailedStatus value) {
        this._deploymentProfileAssignmentDetailedStatus = value;
    }
    /**
     * Sets the deploymentProfileAssignmentStatus property value. The deploymentProfileAssignmentStatus property
     * @param value Value to set for the deploymentProfileAssignmentStatus property.
     * @return a void
     */
    public void setDeploymentProfileAssignmentStatus(@javax.annotation.Nullable final WindowsAutopilotProfileAssignmentStatus value) {
        this._deploymentProfileAssignmentStatus = value;
    }
    /**
     * Sets the deviceAccountPassword property value. Surface Hub Device Account Password
     * @param value Value to set for the deviceAccountPassword property.
     * @return a void
     */
    public void setDeviceAccountPassword(@javax.annotation.Nullable final String value) {
        this._deviceAccountPassword = value;
    }
    /**
     * Sets the deviceAccountUpn property value. Surface Hub Device Account Upn
     * @param value Value to set for the deviceAccountUpn property.
     * @return a void
     */
    public void setDeviceAccountUpn(@javax.annotation.Nullable final String value) {
        this._deviceAccountUpn = value;
    }
    /**
     * Sets the deviceFriendlyName property value. Surface Hub Device Friendly Name
     * @param value Value to set for the deviceFriendlyName property.
     * @return a void
     */
    public void setDeviceFriendlyName(@javax.annotation.Nullable final String value) {
        this._deviceFriendlyName = value;
    }
    /**
     * Sets the displayName property value. Display Name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enrollmentState property value. The enrollmentState property
     * @param value Value to set for the enrollmentState property.
     * @return a void
     */
    public void setEnrollmentState(@javax.annotation.Nullable final EnrollmentState value) {
        this._enrollmentState = value;
    }
    /**
     * Sets the groupTag property value. Group Tag of the Windows autopilot device.
     * @param value Value to set for the groupTag property.
     * @return a void
     */
    public void setGroupTag(@javax.annotation.Nullable final String value) {
        this._groupTag = value;
    }
    /**
     * Sets the intendedDeploymentProfile property value. Deployment profile intended to be assigned to the Windows autopilot device.
     * @param value Value to set for the intendedDeploymentProfile property.
     * @return a void
     */
    public void setIntendedDeploymentProfile(@javax.annotation.Nullable final WindowsAutopilotDeploymentProfile value) {
        this._intendedDeploymentProfile = value;
    }
    /**
     * Sets the lastContactedDateTime property value. Intune Last Contacted Date Time of the Windows autopilot device.
     * @param value Value to set for the lastContactedDateTime property.
     * @return a void
     */
    public void setLastContactedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastContactedDateTime = value;
    }
    /**
     * Sets the managedDeviceId property value. Managed Device ID
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
    /**
     * Sets the manufacturer property value. Oem manufacturer of the Windows autopilot device.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the model property value. Model name of the Windows autopilot device.
     * @param value Value to set for the model property.
     * @return a void
     */
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the productKey property value. Product Key of the Windows autopilot device.
     * @param value Value to set for the productKey property.
     * @return a void
     */
    public void setProductKey(@javax.annotation.Nullable final String value) {
        this._productKey = value;
    }
    /**
     * Sets the purchaseOrderIdentifier property value. Purchase Order Identifier of the Windows autopilot device.
     * @param value Value to set for the purchaseOrderIdentifier property.
     * @return a void
     */
    public void setPurchaseOrderIdentifier(@javax.annotation.Nullable final String value) {
        this._purchaseOrderIdentifier = value;
    }
    /**
     * Sets the remediationState property value. Device remediation status, indicating whether or not hardware has been changed for an Autopilot-registered device.
     * @param value Value to set for the remediationState property.
     * @return a void
     */
    public void setRemediationState(@javax.annotation.Nullable final WindowsAutopilotDeviceRemediationState value) {
        this._remediationState = value;
    }
    /**
     * Sets the remediationStateLastModifiedDateTime property value. RemediationState set time of Autopilot device.
     * @param value Value to set for the remediationStateLastModifiedDateTime property.
     * @return a void
     */
    public void setRemediationStateLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._remediationStateLastModifiedDateTime = value;
    }
    /**
     * Sets the resourceName property value. Resource Name.
     * @param value Value to set for the resourceName property.
     * @return a void
     */
    public void setResourceName(@javax.annotation.Nullable final String value) {
        this._resourceName = value;
    }
    /**
     * Sets the serialNumber property value. Serial number of the Windows autopilot device.
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this._serialNumber = value;
    }
    /**
     * Sets the skuNumber property value. SKU Number
     * @param value Value to set for the skuNumber property.
     * @return a void
     */
    public void setSkuNumber(@javax.annotation.Nullable final String value) {
        this._skuNumber = value;
    }
    /**
     * Sets the systemFamily property value. System Family
     * @param value Value to set for the systemFamily property.
     * @return a void
     */
    public void setSystemFamily(@javax.annotation.Nullable final String value) {
        this._systemFamily = value;
    }
    /**
     * Sets the userPrincipalName property value. User Principal Name.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
