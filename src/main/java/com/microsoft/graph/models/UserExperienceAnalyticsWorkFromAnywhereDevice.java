package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics Device for work from anywhere report */
public class UserExperienceAnalyticsWorkFromAnywhereDevice extends Entity implements Parsable {
    /** The user experience analytics work from anywhere intune device's autopilotProfileAssigned. */
    private Boolean _autoPilotProfileAssigned;
    /** The user experience work from anywhere intune device's autopilotRegistered. */
    private Boolean _autoPilotRegistered;
    /** The user experience work from anywhere azure Ad device Id. */
    private String _azureAdDeviceId;
    /** The user experience work from anywhere device's azure Ad joinType. */
    private String _azureAdJoinType;
    /** The user experience work from anywhere device's azureAdRegistered. */
    private Boolean _azureAdRegistered;
    /** The user experience work from anywhere per device cloud identity score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _cloudIdentityScore;
    /** The user experience work from anywhere per device cloud management score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _cloudManagementScore;
    /** The user experience work from anywhere per device cloud provisioning score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _cloudProvisioningScore;
    /** The user experience work from anywhere device's compliancePolicySetToIntune. */
    private Boolean _compliancePolicySetToIntune;
    /** The user experience work from anywhere device Id. */
    private String _deviceId;
    /** The work from anywhere device's name. */
    private String _deviceName;
    /** The healthStatus property */
    private UserExperienceAnalyticsHealthState _healthStatus;
    /** The user experience work from anywhere device's Cloud Management Gateway for Configuration Manager is enabled. */
    private Boolean _isCloudManagedGatewayEnabled;
    /** The user experience work from anywhere management agent of the device. */
    private String _managedBy;
    /** The user experience work from anywhere device's manufacturer. */
    private String _manufacturer;
    /** The user experience work from anywhere device's model. */
    private String _model;
    /** The user experience work from anywhere device, Is OS check failed for device to upgrade to the latest version of windows. */
    private Boolean _osCheckFailed;
    /** The user experience work from anywhere device's OS Description. */
    private String _osDescription;
    /** The user experience work from anywhere device's OS Version. */
    private String _osVersion;
    /** The user experience work from anywhere device's otherWorkloadsSetToIntune. */
    private Boolean _otherWorkloadsSetToIntune;
    /** The user experience work from anywhere device's ownership. */
    private String _ownership;
    /** The user experience work from anywhere device, Is processor hardware 64-bit architecture check failed for device to upgrade to the latest version of windows. */
    private Boolean _processor64BitCheckFailed;
    /** The user experience work from anywhere device, Is processor hardware core count check failed for device to upgrade to the latest version of windows. */
    private Boolean _processorCoreCountCheckFailed;
    /** The user experience work from anywhere device, Is processor hardware family check failed for device to upgrade to the latest version of windows. */
    private Boolean _processorFamilyCheckFailed;
    /** The user experience work from anywhere device, Is processor hardware speed check failed for device to upgrade to the latest version of windows. */
    private Boolean _processorSpeedCheckFailed;
    /** Is the user experience analytics work from anywhere device RAM hardware check failed for device to upgrade to the latest version of windows */
    private Boolean _ramCheckFailed;
    /** The user experience work from anywhere device, Is secure boot hardware check failed for device to upgrade to the latest version of windows. */
    private Boolean _secureBootCheckFailed;
    /** The user experience work from anywhere device's serial number. */
    private String _serialNumber;
    /** The user experience work from anywhere device, Is storage hardware check failed for device to upgrade to the latest version of windows. */
    private Boolean _storageCheckFailed;
    /** The user experience work from anywhere device's tenantAttached. */
    private Boolean _tenantAttached;
    /** The user experience work from anywhere device, Is Trusted Platform Module (TPM) hardware check failed for device to the latest version of upgrade to windows. */
    private Boolean _tpmCheckFailed;
    /** Work From Anywhere windows device upgrade eligibility status */
    private OperatingSystemUpgradeEligibility _upgradeEligibility;
    /** The user experience work from anywhere per device windows score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _windowsScore;
    /** The user experience work from anywhere per device overall score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 */
    private Double _workFromAnywhereScore;
    /**
     * Instantiates a new userExperienceAnalyticsWorkFromAnywhereDevice and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsWorkFromAnywhereDevice() {
        super();
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereDevice");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsWorkFromAnywhereDevice
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsWorkFromAnywhereDevice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsWorkFromAnywhereDevice();
    }
    /**
     * Gets the autoPilotProfileAssigned property value. The user experience analytics work from anywhere intune device's autopilotProfileAssigned.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutoPilotProfileAssigned() {
        return this._autoPilotProfileAssigned;
    }
    /**
     * Gets the autoPilotRegistered property value. The user experience work from anywhere intune device's autopilotRegistered.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutoPilotRegistered() {
        return this._autoPilotRegistered;
    }
    /**
     * Gets the azureAdDeviceId property value. The user experience work from anywhere azure Ad device Id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureAdDeviceId() {
        return this._azureAdDeviceId;
    }
    /**
     * Gets the azureAdJoinType property value. The user experience work from anywhere device's azure Ad joinType.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureAdJoinType() {
        return this._azureAdJoinType;
    }
    /**
     * Gets the azureAdRegistered property value. The user experience work from anywhere device's azureAdRegistered.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAzureAdRegistered() {
        return this._azureAdRegistered;
    }
    /**
     * Gets the cloudIdentityScore property value. The user experience work from anywhere per device cloud identity score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCloudIdentityScore() {
        return this._cloudIdentityScore;
    }
    /**
     * Gets the cloudManagementScore property value. The user experience work from anywhere per device cloud management score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCloudManagementScore() {
        return this._cloudManagementScore;
    }
    /**
     * Gets the cloudProvisioningScore property value. The user experience work from anywhere per device cloud provisioning score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getCloudProvisioningScore() {
        return this._cloudProvisioningScore;
    }
    /**
     * Gets the compliancePolicySetToIntune property value. The user experience work from anywhere device's compliancePolicySetToIntune.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCompliancePolicySetToIntune() {
        return this._compliancePolicySetToIntune;
    }
    /**
     * Gets the deviceId property value. The user experience work from anywhere device Id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the deviceName property value. The work from anywhere device's name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsWorkFromAnywhereDevice currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("autoPilotProfileAssigned", (n) -> { currentObject.setAutoPilotProfileAssigned(n.getBooleanValue()); });
        deserializerMap.put("autoPilotRegistered", (n) -> { currentObject.setAutoPilotRegistered(n.getBooleanValue()); });
        deserializerMap.put("azureAdDeviceId", (n) -> { currentObject.setAzureAdDeviceId(n.getStringValue()); });
        deserializerMap.put("azureAdJoinType", (n) -> { currentObject.setAzureAdJoinType(n.getStringValue()); });
        deserializerMap.put("azureAdRegistered", (n) -> { currentObject.setAzureAdRegistered(n.getBooleanValue()); });
        deserializerMap.put("cloudIdentityScore", (n) -> { currentObject.setCloudIdentityScore(n.getDoubleValue()); });
        deserializerMap.put("cloudManagementScore", (n) -> { currentObject.setCloudManagementScore(n.getDoubleValue()); });
        deserializerMap.put("cloudProvisioningScore", (n) -> { currentObject.setCloudProvisioningScore(n.getDoubleValue()); });
        deserializerMap.put("compliancePolicySetToIntune", (n) -> { currentObject.setCompliancePolicySetToIntune(n.getBooleanValue()); });
        deserializerMap.put("deviceId", (n) -> { currentObject.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
        deserializerMap.put("healthStatus", (n) -> { currentObject.setHealthStatus(n.getEnumValue(UserExperienceAnalyticsHealthState.class)); });
        deserializerMap.put("isCloudManagedGatewayEnabled", (n) -> { currentObject.setIsCloudManagedGatewayEnabled(n.getBooleanValue()); });
        deserializerMap.put("managedBy", (n) -> { currentObject.setManagedBy(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
        deserializerMap.put("osCheckFailed", (n) -> { currentObject.setOsCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("osDescription", (n) -> { currentObject.setOsDescription(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
        deserializerMap.put("otherWorkloadsSetToIntune", (n) -> { currentObject.setOtherWorkloadsSetToIntune(n.getBooleanValue()); });
        deserializerMap.put("ownership", (n) -> { currentObject.setOwnership(n.getStringValue()); });
        deserializerMap.put("processor64BitCheckFailed", (n) -> { currentObject.setProcessor64BitCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("processorCoreCountCheckFailed", (n) -> { currentObject.setProcessorCoreCountCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("processorFamilyCheckFailed", (n) -> { currentObject.setProcessorFamilyCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("processorSpeedCheckFailed", (n) -> { currentObject.setProcessorSpeedCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("ramCheckFailed", (n) -> { currentObject.setRamCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("secureBootCheckFailed", (n) -> { currentObject.setSecureBootCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("serialNumber", (n) -> { currentObject.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("storageCheckFailed", (n) -> { currentObject.setStorageCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("tenantAttached", (n) -> { currentObject.setTenantAttached(n.getBooleanValue()); });
        deserializerMap.put("tpmCheckFailed", (n) -> { currentObject.setTpmCheckFailed(n.getBooleanValue()); });
        deserializerMap.put("upgradeEligibility", (n) -> { currentObject.setUpgradeEligibility(n.getEnumValue(OperatingSystemUpgradeEligibility.class)); });
        deserializerMap.put("windowsScore", (n) -> { currentObject.setWindowsScore(n.getDoubleValue()); });
        deserializerMap.put("workFromAnywhereScore", (n) -> { currentObject.setWorkFromAnywhereScore(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthStatus property value. The healthStatus property
     * @return a userExperienceAnalyticsHealthState
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsHealthState getHealthStatus() {
        return this._healthStatus;
    }
    /**
     * Gets the isCloudManagedGatewayEnabled property value. The user experience work from anywhere device's Cloud Management Gateway for Configuration Manager is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCloudManagedGatewayEnabled() {
        return this._isCloudManagedGatewayEnabled;
    }
    /**
     * Gets the managedBy property value. The user experience work from anywhere management agent of the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedBy() {
        return this._managedBy;
    }
    /**
     * Gets the manufacturer property value. The user experience work from anywhere device's manufacturer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the model property value. The user experience work from anywhere device's model.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the osCheckFailed property value. The user experience work from anywhere device, Is OS check failed for device to upgrade to the latest version of windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOsCheckFailed() {
        return this._osCheckFailed;
    }
    /**
     * Gets the osDescription property value. The user experience work from anywhere device's OS Description.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsDescription() {
        return this._osDescription;
    }
    /**
     * Gets the osVersion property value. The user experience work from anywhere device's OS Version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the otherWorkloadsSetToIntune property value. The user experience work from anywhere device's otherWorkloadsSetToIntune.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOtherWorkloadsSetToIntune() {
        return this._otherWorkloadsSetToIntune;
    }
    /**
     * Gets the ownership property value. The user experience work from anywhere device's ownership.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnership() {
        return this._ownership;
    }
    /**
     * Gets the processor64BitCheckFailed property value. The user experience work from anywhere device, Is processor hardware 64-bit architecture check failed for device to upgrade to the latest version of windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getProcessor64BitCheckFailed() {
        return this._processor64BitCheckFailed;
    }
    /**
     * Gets the processorCoreCountCheckFailed property value. The user experience work from anywhere device, Is processor hardware core count check failed for device to upgrade to the latest version of windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getProcessorCoreCountCheckFailed() {
        return this._processorCoreCountCheckFailed;
    }
    /**
     * Gets the processorFamilyCheckFailed property value. The user experience work from anywhere device, Is processor hardware family check failed for device to upgrade to the latest version of windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getProcessorFamilyCheckFailed() {
        return this._processorFamilyCheckFailed;
    }
    /**
     * Gets the processorSpeedCheckFailed property value. The user experience work from anywhere device, Is processor hardware speed check failed for device to upgrade to the latest version of windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getProcessorSpeedCheckFailed() {
        return this._processorSpeedCheckFailed;
    }
    /**
     * Gets the ramCheckFailed property value. Is the user experience analytics work from anywhere device RAM hardware check failed for device to upgrade to the latest version of windows
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRamCheckFailed() {
        return this._ramCheckFailed;
    }
    /**
     * Gets the secureBootCheckFailed property value. The user experience work from anywhere device, Is secure boot hardware check failed for device to upgrade to the latest version of windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecureBootCheckFailed() {
        return this._secureBootCheckFailed;
    }
    /**
     * Gets the serialNumber property value. The user experience work from anywhere device's serial number.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this._serialNumber;
    }
    /**
     * Gets the storageCheckFailed property value. The user experience work from anywhere device, Is storage hardware check failed for device to upgrade to the latest version of windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStorageCheckFailed() {
        return this._storageCheckFailed;
    }
    /**
     * Gets the tenantAttached property value. The user experience work from anywhere device's tenantAttached.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTenantAttached() {
        return this._tenantAttached;
    }
    /**
     * Gets the tpmCheckFailed property value. The user experience work from anywhere device, Is Trusted Platform Module (TPM) hardware check failed for device to the latest version of upgrade to windows.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getTpmCheckFailed() {
        return this._tpmCheckFailed;
    }
    /**
     * Gets the upgradeEligibility property value. Work From Anywhere windows device upgrade eligibility status
     * @return a operatingSystemUpgradeEligibility
     */
    @javax.annotation.Nullable
    public OperatingSystemUpgradeEligibility getUpgradeEligibility() {
        return this._upgradeEligibility;
    }
    /**
     * Gets the windowsScore property value. The user experience work from anywhere per device windows score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getWindowsScore() {
        return this._windowsScore;
    }
    /**
     * Gets the workFromAnywhereScore property value. The user experience work from anywhere per device overall score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getWorkFromAnywhereScore() {
        return this._workFromAnywhereScore;
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
        writer.writeBooleanValue("autoPilotProfileAssigned", this.getAutoPilotProfileAssigned());
        writer.writeBooleanValue("autoPilotRegistered", this.getAutoPilotRegistered());
        writer.writeStringValue("azureAdDeviceId", this.getAzureAdDeviceId());
        writer.writeStringValue("azureAdJoinType", this.getAzureAdJoinType());
        writer.writeBooleanValue("azureAdRegistered", this.getAzureAdRegistered());
        writer.writeDoubleValue("cloudIdentityScore", this.getCloudIdentityScore());
        writer.writeDoubleValue("cloudManagementScore", this.getCloudManagementScore());
        writer.writeDoubleValue("cloudProvisioningScore", this.getCloudProvisioningScore());
        writer.writeBooleanValue("compliancePolicySetToIntune", this.getCompliancePolicySetToIntune());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeBooleanValue("isCloudManagedGatewayEnabled", this.getIsCloudManagedGatewayEnabled());
        writer.writeStringValue("managedBy", this.getManagedBy());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeBooleanValue("osCheckFailed", this.getOsCheckFailed());
        writer.writeStringValue("osDescription", this.getOsDescription());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeBooleanValue("otherWorkloadsSetToIntune", this.getOtherWorkloadsSetToIntune());
        writer.writeStringValue("ownership", this.getOwnership());
        writer.writeBooleanValue("processor64BitCheckFailed", this.getProcessor64BitCheckFailed());
        writer.writeBooleanValue("processorCoreCountCheckFailed", this.getProcessorCoreCountCheckFailed());
        writer.writeBooleanValue("processorFamilyCheckFailed", this.getProcessorFamilyCheckFailed());
        writer.writeBooleanValue("processorSpeedCheckFailed", this.getProcessorSpeedCheckFailed());
        writer.writeBooleanValue("ramCheckFailed", this.getRamCheckFailed());
        writer.writeBooleanValue("secureBootCheckFailed", this.getSecureBootCheckFailed());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
        writer.writeBooleanValue("storageCheckFailed", this.getStorageCheckFailed());
        writer.writeBooleanValue("tenantAttached", this.getTenantAttached());
        writer.writeBooleanValue("tpmCheckFailed", this.getTpmCheckFailed());
        writer.writeEnumValue("upgradeEligibility", this.getUpgradeEligibility());
        writer.writeDoubleValue("windowsScore", this.getWindowsScore());
        writer.writeDoubleValue("workFromAnywhereScore", this.getWorkFromAnywhereScore());
    }
    /**
     * Sets the autoPilotProfileAssigned property value. The user experience analytics work from anywhere intune device's autopilotProfileAssigned.
     * @param value Value to set for the autoPilotProfileAssigned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutoPilotProfileAssigned(@javax.annotation.Nullable final Boolean value) {
        this._autoPilotProfileAssigned = value;
    }
    /**
     * Sets the autoPilotRegistered property value. The user experience work from anywhere intune device's autopilotRegistered.
     * @param value Value to set for the autoPilotRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutoPilotRegistered(@javax.annotation.Nullable final Boolean value) {
        this._autoPilotRegistered = value;
    }
    /**
     * Sets the azureAdDeviceId property value. The user experience work from anywhere azure Ad device Id.
     * @param value Value to set for the azureAdDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureAdDeviceId(@javax.annotation.Nullable final String value) {
        this._azureAdDeviceId = value;
    }
    /**
     * Sets the azureAdJoinType property value. The user experience work from anywhere device's azure Ad joinType.
     * @param value Value to set for the azureAdJoinType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureAdJoinType(@javax.annotation.Nullable final String value) {
        this._azureAdJoinType = value;
    }
    /**
     * Sets the azureAdRegistered property value. The user experience work from anywhere device's azureAdRegistered.
     * @param value Value to set for the azureAdRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureAdRegistered(@javax.annotation.Nullable final Boolean value) {
        this._azureAdRegistered = value;
    }
    /**
     * Sets the cloudIdentityScore property value. The user experience work from anywhere per device cloud identity score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudIdentityScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudIdentityScore(@javax.annotation.Nullable final Double value) {
        this._cloudIdentityScore = value;
    }
    /**
     * Sets the cloudManagementScore property value. The user experience work from anywhere per device cloud management score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudManagementScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudManagementScore(@javax.annotation.Nullable final Double value) {
        this._cloudManagementScore = value;
    }
    /**
     * Sets the cloudProvisioningScore property value. The user experience work from anywhere per device cloud provisioning score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the cloudProvisioningScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudProvisioningScore(@javax.annotation.Nullable final Double value) {
        this._cloudProvisioningScore = value;
    }
    /**
     * Sets the compliancePolicySetToIntune property value. The user experience work from anywhere device's compliancePolicySetToIntune.
     * @param value Value to set for the compliancePolicySetToIntune property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompliancePolicySetToIntune(@javax.annotation.Nullable final Boolean value) {
        this._compliancePolicySetToIntune = value;
    }
    /**
     * Sets the deviceId property value. The user experience work from anywhere device Id.
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the deviceName property value. The work from anywhere device's name.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the healthStatus property value. The healthStatus property
     * @param value Value to set for the healthStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHealthStatus(@javax.annotation.Nullable final UserExperienceAnalyticsHealthState value) {
        this._healthStatus = value;
    }
    /**
     * Sets the isCloudManagedGatewayEnabled property value. The user experience work from anywhere device's Cloud Management Gateway for Configuration Manager is enabled.
     * @param value Value to set for the isCloudManagedGatewayEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsCloudManagedGatewayEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isCloudManagedGatewayEnabled = value;
    }
    /**
     * Sets the managedBy property value. The user experience work from anywhere management agent of the device.
     * @param value Value to set for the managedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedBy(@javax.annotation.Nullable final String value) {
        this._managedBy = value;
    }
    /**
     * Sets the manufacturer property value. The user experience work from anywhere device's manufacturer.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the model property value. The user experience work from anywhere device's model.
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the osCheckFailed property value. The user experience work from anywhere device, Is OS check failed for device to upgrade to the latest version of windows.
     * @param value Value to set for the osCheckFailed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsCheckFailed(@javax.annotation.Nullable final Boolean value) {
        this._osCheckFailed = value;
    }
    /**
     * Sets the osDescription property value. The user experience work from anywhere device's OS Description.
     * @param value Value to set for the osDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsDescription(@javax.annotation.Nullable final String value) {
        this._osDescription = value;
    }
    /**
     * Sets the osVersion property value. The user experience work from anywhere device's OS Version.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
    /**
     * Sets the otherWorkloadsSetToIntune property value. The user experience work from anywhere device's otherWorkloadsSetToIntune.
     * @param value Value to set for the otherWorkloadsSetToIntune property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOtherWorkloadsSetToIntune(@javax.annotation.Nullable final Boolean value) {
        this._otherWorkloadsSetToIntune = value;
    }
    /**
     * Sets the ownership property value. The user experience work from anywhere device's ownership.
     * @param value Value to set for the ownership property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnership(@javax.annotation.Nullable final String value) {
        this._ownership = value;
    }
    /**
     * Sets the processor64BitCheckFailed property value. The user experience work from anywhere device, Is processor hardware 64-bit architecture check failed for device to upgrade to the latest version of windows.
     * @param value Value to set for the processor64BitCheckFailed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessor64BitCheckFailed(@javax.annotation.Nullable final Boolean value) {
        this._processor64BitCheckFailed = value;
    }
    /**
     * Sets the processorCoreCountCheckFailed property value. The user experience work from anywhere device, Is processor hardware core count check failed for device to upgrade to the latest version of windows.
     * @param value Value to set for the processorCoreCountCheckFailed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessorCoreCountCheckFailed(@javax.annotation.Nullable final Boolean value) {
        this._processorCoreCountCheckFailed = value;
    }
    /**
     * Sets the processorFamilyCheckFailed property value. The user experience work from anywhere device, Is processor hardware family check failed for device to upgrade to the latest version of windows.
     * @param value Value to set for the processorFamilyCheckFailed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessorFamilyCheckFailed(@javax.annotation.Nullable final Boolean value) {
        this._processorFamilyCheckFailed = value;
    }
    /**
     * Sets the processorSpeedCheckFailed property value. The user experience work from anywhere device, Is processor hardware speed check failed for device to upgrade to the latest version of windows.
     * @param value Value to set for the processorSpeedCheckFailed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessorSpeedCheckFailed(@javax.annotation.Nullable final Boolean value) {
        this._processorSpeedCheckFailed = value;
    }
    /**
     * Sets the ramCheckFailed property value. Is the user experience analytics work from anywhere device RAM hardware check failed for device to upgrade to the latest version of windows
     * @param value Value to set for the ramCheckFailed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRamCheckFailed(@javax.annotation.Nullable final Boolean value) {
        this._ramCheckFailed = value;
    }
    /**
     * Sets the secureBootCheckFailed property value. The user experience work from anywhere device, Is secure boot hardware check failed for device to upgrade to the latest version of windows.
     * @param value Value to set for the secureBootCheckFailed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecureBootCheckFailed(@javax.annotation.Nullable final Boolean value) {
        this._secureBootCheckFailed = value;
    }
    /**
     * Sets the serialNumber property value. The user experience work from anywhere device's serial number.
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this._serialNumber = value;
    }
    /**
     * Sets the storageCheckFailed property value. The user experience work from anywhere device, Is storage hardware check failed for device to upgrade to the latest version of windows.
     * @param value Value to set for the storageCheckFailed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageCheckFailed(@javax.annotation.Nullable final Boolean value) {
        this._storageCheckFailed = value;
    }
    /**
     * Sets the tenantAttached property value. The user experience work from anywhere device's tenantAttached.
     * @param value Value to set for the tenantAttached property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantAttached(@javax.annotation.Nullable final Boolean value) {
        this._tenantAttached = value;
    }
    /**
     * Sets the tpmCheckFailed property value. The user experience work from anywhere device, Is Trusted Platform Module (TPM) hardware check failed for device to the latest version of upgrade to windows.
     * @param value Value to set for the tpmCheckFailed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTpmCheckFailed(@javax.annotation.Nullable final Boolean value) {
        this._tpmCheckFailed = value;
    }
    /**
     * Sets the upgradeEligibility property value. Work From Anywhere windows device upgrade eligibility status
     * @param value Value to set for the upgradeEligibility property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpgradeEligibility(@javax.annotation.Nullable final OperatingSystemUpgradeEligibility value) {
        this._upgradeEligibility = value;
    }
    /**
     * Sets the windowsScore property value. The user experience work from anywhere per device windows score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the windowsScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsScore(@javax.annotation.Nullable final Double value) {
        this._windowsScore = value;
    }
    /**
     * Sets the workFromAnywhereScore property value. The user experience work from anywhere per device overall score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     * @param value Value to set for the workFromAnywhereScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkFromAnywhereScore(@javax.annotation.Nullable final Double value) {
        this._workFromAnywhereScore = value;
    }
}
