package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Devices that are managed or pre-enrolled through Intune
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDevice extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ManagedDevice} and sets the default values.
     */
    public ManagedDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedDevice}
     */
    @jakarta.annotation.Nonnull
    public static ManagedDevice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsManagedDevice": return new WindowsManagedDevice();
            }
        }
        return new ManagedDevice();
    }
    /**
     * Gets the aadRegistered property value. Whether the device is Azure Active Directory registered. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAadRegistered() {
        return this.backingStore.get("aadRegistered");
    }
    /**
     * Gets the activationLockBypassCode property value. The code that allows the Activation Lock on managed device to be bypassed. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity in LIST call. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActivationLockBypassCode() {
        return this.backingStore.get("activationLockBypassCode");
    }
    /**
     * Gets the androidSecurityPatchLevel property value. Android security patch level. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAndroidSecurityPatchLevel() {
        return this.backingStore.get("androidSecurityPatchLevel");
    }
    /**
     * Gets the assignmentFilterEvaluationStatusDetails property value. Managed device mobile app configuration states for this device.
     * @return a {@link java.util.List<AssignmentFilterEvaluationStatusDetails>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssignmentFilterEvaluationStatusDetails> getAssignmentFilterEvaluationStatusDetails() {
        return this.backingStore.get("assignmentFilterEvaluationStatusDetails");
    }
    /**
     * Gets the autopilotEnrolled property value. Reports if the managed device is enrolled via auto-pilot. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutopilotEnrolled() {
        return this.backingStore.get("autopilotEnrolled");
    }
    /**
     * Gets the azureActiveDirectoryDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureActiveDirectoryDeviceId() {
        return this.backingStore.get("azureActiveDirectoryDeviceId");
    }
    /**
     * Gets the azureADDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAzureADDeviceId() {
        return this.backingStore.get("azureADDeviceId");
    }
    /**
     * Gets the azureADRegistered property value. Whether the device is Azure Active Directory registered. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAzureADRegistered() {
        return this.backingStore.get("azureADRegistered");
    }
    /**
     * Gets the bootstrapTokenEscrowed property value. Reports if the managed device has an escrowed Bootstrap Token. This is only for macOS devices. To get, include BootstrapTokenEscrowed in the select clause and query with a device id. If FALSE, no bootstrap token is escrowed. If TRUE, the device has escrowed a bootstrap token with Intune. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBootstrapTokenEscrowed() {
        return this.backingStore.get("bootstrapTokenEscrowed");
    }
    /**
     * Gets the chassisType property value. Chassis type.
     * @return a {@link ChassisType}
     */
    @jakarta.annotation.Nullable
    public ChassisType getChassisType() {
        return this.backingStore.get("chassisType");
    }
    /**
     * Gets the chromeOSDeviceInfo property value. List of properties of the ChromeOS Device. Default is an empty list. To retrieve actual values GET call needs to be made, with device id and included in select parameter.
     * @return a {@link java.util.List<ChromeOSDeviceProperty>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChromeOSDeviceProperty> getChromeOSDeviceInfo() {
        return this.backingStore.get("chromeOSDeviceInfo");
    }
    /**
     * Gets the cloudPcRemoteActionResults property value. The cloudPcRemoteActionResults property
     * @return a {@link java.util.List<CloudPcRemoteActionResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcRemoteActionResult> getCloudPcRemoteActionResults() {
        return this.backingStore.get("cloudPcRemoteActionResults");
    }
    /**
     * Gets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getComplianceGracePeriodExpirationDateTime() {
        return this.backingStore.get("complianceGracePeriodExpirationDateTime");
    }
    /**
     * Gets the complianceState property value. Compliance state.
     * @return a {@link ComplianceState}
     */
    @jakarta.annotation.Nullable
    public ComplianceState getComplianceState() {
        return this.backingStore.get("complianceState");
    }
    /**
     * Gets the configurationManagerClientEnabledFeatures property value. ConfigrMgr client enabled features. This property is read-only.
     * @return a {@link ConfigurationManagerClientEnabledFeatures}
     */
    @jakarta.annotation.Nullable
    public ConfigurationManagerClientEnabledFeatures getConfigurationManagerClientEnabledFeatures() {
        return this.backingStore.get("configurationManagerClientEnabledFeatures");
    }
    /**
     * Gets the configurationManagerClientHealthState property value. Configuration manager client health state, valid only for devices managed by MDM/ConfigMgr Agent
     * @return a {@link ConfigurationManagerClientHealthState}
     */
    @jakarta.annotation.Nullable
    public ConfigurationManagerClientHealthState getConfigurationManagerClientHealthState() {
        return this.backingStore.get("configurationManagerClientHealthState");
    }
    /**
     * Gets the configurationManagerClientInformation property value. Configuration manager client information, valid only for devices managed, duel-managed or tri-managed by ConfigMgr Agent
     * @return a {@link ConfigurationManagerClientInformation}
     */
    @jakarta.annotation.Nullable
    public ConfigurationManagerClientInformation getConfigurationManagerClientInformation() {
        return this.backingStore.get("configurationManagerClientInformation");
    }
    /**
     * Gets the detectedApps property value. All applications currently installed on the device
     * @return a {@link java.util.List<DetectedApp>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DetectedApp> getDetectedApps() {
        return this.backingStore.get("detectedApps");
    }
    /**
     * Gets the deviceActionResults property value. List of ComplexType deviceActionResult objects. This property is read-only.
     * @return a {@link java.util.List<DeviceActionResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceActionResult> getDeviceActionResults() {
        return this.backingStore.get("deviceActionResults");
    }
    /**
     * Gets the deviceCategory property value. Device category
     * @return a {@link DeviceCategory}
     */
    @jakarta.annotation.Nullable
    public DeviceCategory getDeviceCategory() {
        return this.backingStore.get("deviceCategory");
    }
    /**
     * Gets the deviceCategoryDisplayName property value. Device category display name. Default is an empty string. Supports $filter operator 'eq' and 'or'. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceCategoryDisplayName() {
        return this.backingStore.get("deviceCategoryDisplayName");
    }
    /**
     * Gets the deviceCompliancePolicyStates property value. Device compliance policy states for this device.
     * @return a {@link java.util.List<DeviceCompliancePolicyState>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceCompliancePolicyState> getDeviceCompliancePolicyStates() {
        return this.backingStore.get("deviceCompliancePolicyStates");
    }
    /**
     * Gets the deviceConfigurationStates property value. Device configuration states for this device.
     * @return a {@link java.util.List<DeviceConfigurationState>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationState> getDeviceConfigurationStates() {
        return this.backingStore.get("deviceConfigurationStates");
    }
    /**
     * Gets the deviceEnrollmentType property value. Possible ways of adding a mobile device to management.
     * @return a {@link DeviceEnrollmentType}
     */
    @jakarta.annotation.Nullable
    public DeviceEnrollmentType getDeviceEnrollmentType() {
        return this.backingStore.get("deviceEnrollmentType");
    }
    /**
     * Gets the deviceFirmwareConfigurationInterfaceManaged property value. Indicates whether the device is DFCI managed. When TRUE the device is DFCI managed. When FALSE, the device is not DFCI managed. The default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceFirmwareConfigurationInterfaceManaged() {
        return this.backingStore.get("deviceFirmwareConfigurationInterfaceManaged");
    }
    /**
     * Gets the deviceHealthAttestationState property value. The device health attestation state. This property is read-only.
     * @return a {@link DeviceHealthAttestationState}
     */
    @jakarta.annotation.Nullable
    public DeviceHealthAttestationState getDeviceHealthAttestationState() {
        return this.backingStore.get("deviceHealthAttestationState");
    }
    /**
     * Gets the deviceHealthScriptStates property value. Results of device health scripts that ran for this device. Default is empty list. This property is read-only.
     * @return a {@link java.util.List<DeviceHealthScriptPolicyState>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceHealthScriptPolicyState> getDeviceHealthScriptStates() {
        return this.backingStore.get("deviceHealthScriptStates");
    }
    /**
     * Gets the deviceName property value. Name of the device. Supports $filter operator 'eq' and 'contains'. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the deviceRegistrationState property value. Device registration status.
     * @return a {@link DeviceRegistrationState}
     */
    @jakarta.annotation.Nullable
    public DeviceRegistrationState getDeviceRegistrationState() {
        return this.backingStore.get("deviceRegistrationState");
    }
    /**
     * Gets the deviceType property value. Device type.
     * @return a {@link DeviceType}
     */
    @jakarta.annotation.Nullable
    public DeviceType getDeviceType() {
        return this.backingStore.get("deviceType");
    }
    /**
     * Gets the easActivated property value. Whether the device is Exchange ActiveSync activated. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEasActivated() {
        return this.backingStore.get("easActivated");
    }
    /**
     * Gets the easActivationDateTime property value. Exchange ActivationSync activation time of the device. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEasActivationDateTime() {
        return this.backingStore.get("easActivationDateTime");
    }
    /**
     * Gets the easDeviceId property value. Exchange ActiveSync Id of the device. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEasDeviceId() {
        return this.backingStore.get("easDeviceId");
    }
    /**
     * Gets the emailAddress property value. Email(s) for the user associated with the device. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailAddress() {
        return this.backingStore.get("emailAddress");
    }
    /**
     * Gets the enrolledByUserPrincipalName property value. The Entra (Azure AD) User Principal Name (UPN) of the user responsible for the enrollment of the device. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEnrolledByUserPrincipalName() {
        return this.backingStore.get("enrolledByUserPrincipalName");
    }
    /**
     * Gets the enrolledDateTime property value. Enrollment time of the device. Supports $filter operator 'lt' and 'gt'. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEnrolledDateTime() {
        return this.backingStore.get("enrolledDateTime");
    }
    /**
     * Gets the enrollmentProfileName property value. Name of the enrollment profile assigned to the device. Default value is empty string, indicating no enrollment profile was assgined. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEnrollmentProfileName() {
        return this.backingStore.get("enrollmentProfileName");
    }
    /**
     * Gets the ethernetMacAddress property value. Indicates Ethernet MAC Address of the device. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity. Individual get call with select query options is needed to retrieve actual values. Example: deviceManagement/managedDevices({managedDeviceId})?$select=ethernetMacAddress Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEthernetMacAddress() {
        return this.backingStore.get("ethernetMacAddress");
    }
    /**
     * Gets the exchangeAccessState property value. Device Exchange Access State.
     * @return a {@link DeviceManagementExchangeAccessState}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementExchangeAccessState getExchangeAccessState() {
        return this.backingStore.get("exchangeAccessState");
    }
    /**
     * Gets the exchangeAccessStateReason property value. Device Exchange Access State Reason.
     * @return a {@link DeviceManagementExchangeAccessStateReason}
     */
    @jakarta.annotation.Nullable
    public DeviceManagementExchangeAccessStateReason getExchangeAccessStateReason() {
        return this.backingStore.get("exchangeAccessStateReason");
    }
    /**
     * Gets the exchangeLastSuccessfulSyncDateTime property value. Last time the device contacted Exchange. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExchangeLastSuccessfulSyncDateTime() {
        return this.backingStore.get("exchangeLastSuccessfulSyncDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aadRegistered", (n) -> { this.setAadRegistered(n.getBooleanValue()); });
        deserializerMap.put("activationLockBypassCode", (n) -> { this.setActivationLockBypassCode(n.getStringValue()); });
        deserializerMap.put("androidSecurityPatchLevel", (n) -> { this.setAndroidSecurityPatchLevel(n.getStringValue()); });
        deserializerMap.put("assignmentFilterEvaluationStatusDetails", (n) -> { this.setAssignmentFilterEvaluationStatusDetails(n.getCollectionOfObjectValues(AssignmentFilterEvaluationStatusDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("autopilotEnrolled", (n) -> { this.setAutopilotEnrolled(n.getBooleanValue()); });
        deserializerMap.put("azureActiveDirectoryDeviceId", (n) -> { this.setAzureActiveDirectoryDeviceId(n.getStringValue()); });
        deserializerMap.put("azureADDeviceId", (n) -> { this.setAzureADDeviceId(n.getStringValue()); });
        deserializerMap.put("azureADRegistered", (n) -> { this.setAzureADRegistered(n.getBooleanValue()); });
        deserializerMap.put("bootstrapTokenEscrowed", (n) -> { this.setBootstrapTokenEscrowed(n.getBooleanValue()); });
        deserializerMap.put("chassisType", (n) -> { this.setChassisType(n.getEnumValue(ChassisType::forValue)); });
        deserializerMap.put("chromeOSDeviceInfo", (n) -> { this.setChromeOSDeviceInfo(n.getCollectionOfObjectValues(ChromeOSDeviceProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPcRemoteActionResults", (n) -> { this.setCloudPcRemoteActionResults(n.getCollectionOfObjectValues(CloudPcRemoteActionResult::createFromDiscriminatorValue)); });
        deserializerMap.put("complianceGracePeriodExpirationDateTime", (n) -> { this.setComplianceGracePeriodExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("complianceState", (n) -> { this.setComplianceState(n.getEnumValue(ComplianceState::forValue)); });
        deserializerMap.put("configurationManagerClientEnabledFeatures", (n) -> { this.setConfigurationManagerClientEnabledFeatures(n.getObjectValue(ConfigurationManagerClientEnabledFeatures::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationManagerClientHealthState", (n) -> { this.setConfigurationManagerClientHealthState(n.getObjectValue(ConfigurationManagerClientHealthState::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationManagerClientInformation", (n) -> { this.setConfigurationManagerClientInformation(n.getObjectValue(ConfigurationManagerClientInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("detectedApps", (n) -> { this.setDetectedApps(n.getCollectionOfObjectValues(DetectedApp::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceActionResults", (n) -> { this.setDeviceActionResults(n.getCollectionOfObjectValues(DeviceActionResult::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCategory", (n) -> { this.setDeviceCategory(n.getObjectValue(DeviceCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCategoryDisplayName", (n) -> { this.setDeviceCategoryDisplayName(n.getStringValue()); });
        deserializerMap.put("deviceCompliancePolicyStates", (n) -> { this.setDeviceCompliancePolicyStates(n.getCollectionOfObjectValues(DeviceCompliancePolicyState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationStates", (n) -> { this.setDeviceConfigurationStates(n.getCollectionOfObjectValues(DeviceConfigurationState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceEnrollmentType", (n) -> { this.setDeviceEnrollmentType(n.getEnumValue(DeviceEnrollmentType::forValue)); });
        deserializerMap.put("deviceFirmwareConfigurationInterfaceManaged", (n) -> { this.setDeviceFirmwareConfigurationInterfaceManaged(n.getBooleanValue()); });
        deserializerMap.put("deviceHealthAttestationState", (n) -> { this.setDeviceHealthAttestationState(n.getObjectValue(DeviceHealthAttestationState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceHealthScriptStates", (n) -> { this.setDeviceHealthScriptStates(n.getCollectionOfObjectValues(DeviceHealthScriptPolicyState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceRegistrationState", (n) -> { this.setDeviceRegistrationState(n.getEnumValue(DeviceRegistrationState::forValue)); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getEnumValue(DeviceType::forValue)); });
        deserializerMap.put("easActivated", (n) -> { this.setEasActivated(n.getBooleanValue()); });
        deserializerMap.put("easActivationDateTime", (n) -> { this.setEasActivationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("easDeviceId", (n) -> { this.setEasDeviceId(n.getStringValue()); });
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("enrolledByUserPrincipalName", (n) -> { this.setEnrolledByUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("enrolledDateTime", (n) -> { this.setEnrolledDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("enrollmentProfileName", (n) -> { this.setEnrollmentProfileName(n.getStringValue()); });
        deserializerMap.put("ethernetMacAddress", (n) -> { this.setEthernetMacAddress(n.getStringValue()); });
        deserializerMap.put("exchangeAccessState", (n) -> { this.setExchangeAccessState(n.getEnumValue(DeviceManagementExchangeAccessState::forValue)); });
        deserializerMap.put("exchangeAccessStateReason", (n) -> { this.setExchangeAccessStateReason(n.getEnumValue(DeviceManagementExchangeAccessStateReason::forValue)); });
        deserializerMap.put("exchangeLastSuccessfulSyncDateTime", (n) -> { this.setExchangeLastSuccessfulSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("freeStorageSpaceInBytes", (n) -> { this.setFreeStorageSpaceInBytes(n.getLongValue()); });
        deserializerMap.put("hardwareInformation", (n) -> { this.setHardwareInformation(n.getObjectValue(HardwareInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("iccid", (n) -> { this.setIccid(n.getStringValue()); });
        deserializerMap.put("imei", (n) -> { this.setImei(n.getStringValue()); });
        deserializerMap.put("isEncrypted", (n) -> { this.setIsEncrypted(n.getBooleanValue()); });
        deserializerMap.put("isSupervised", (n) -> { this.setIsSupervised(n.getBooleanValue()); });
        deserializerMap.put("jailBroken", (n) -> { this.setJailBroken(n.getStringValue()); });
        deserializerMap.put("joinType", (n) -> { this.setJoinType(n.getEnumValue(JoinType::forValue)); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("logCollectionRequests", (n) -> { this.setLogCollectionRequests(n.getCollectionOfObjectValues(DeviceLogCollectionResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("lostModeState", (n) -> { this.setLostModeState(n.getEnumValue(LostModeState::forValue)); });
        deserializerMap.put("managedDeviceMobileAppConfigurationStates", (n) -> { this.setManagedDeviceMobileAppConfigurationStates(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfigurationState::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceName", (n) -> { this.setManagedDeviceName(n.getStringValue()); });
        deserializerMap.put("managedDeviceOwnerType", (n) -> { this.setManagedDeviceOwnerType(n.getEnumValue(ManagedDeviceOwnerType::forValue)); });
        deserializerMap.put("managementAgent", (n) -> { this.setManagementAgent(n.getEnumValue(ManagementAgentType::forValue)); });
        deserializerMap.put("managementCertificateExpirationDate", (n) -> { this.setManagementCertificateExpirationDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managementFeatures", (n) -> { this.setManagementFeatures(n.getEnumValue(ManagedDeviceManagementFeatures::forValue)); });
        deserializerMap.put("managementState", (n) -> { this.setManagementState(n.getEnumValue(ManagementState::forValue)); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("meid", (n) -> { this.setMeid(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("operatingSystem", (n) -> { this.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("ownerType", (n) -> { this.setOwnerType(n.getEnumValue(OwnerType::forValue)); });
        deserializerMap.put("partnerReportedThreatState", (n) -> { this.setPartnerReportedThreatState(n.getEnumValue(ManagedDevicePartnerReportedHealthState::forValue)); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("physicalMemoryInBytes", (n) -> { this.setPhysicalMemoryInBytes(n.getLongValue()); });
        deserializerMap.put("preferMdmOverGroupPolicyAppliedDateTime", (n) -> { this.setPreferMdmOverGroupPolicyAppliedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("processorArchitecture", (n) -> { this.setProcessorArchitecture(n.getEnumValue(ManagedDeviceArchitecture::forValue)); });
        deserializerMap.put("remoteAssistanceSessionErrorDetails", (n) -> { this.setRemoteAssistanceSessionErrorDetails(n.getStringValue()); });
        deserializerMap.put("remoteAssistanceSessionUrl", (n) -> { this.setRemoteAssistanceSessionUrl(n.getStringValue()); });
        deserializerMap.put("requireUserEnrollmentApproval", (n) -> { this.setRequireUserEnrollmentApproval(n.getBooleanValue()); });
        deserializerMap.put("retireAfterDateTime", (n) -> { this.setRetireAfterDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("securityBaselineStates", (n) -> { this.setSecurityBaselineStates(n.getCollectionOfObjectValues(SecurityBaselineState::createFromDiscriminatorValue)); });
        deserializerMap.put("securityPatchLevel", (n) -> { this.setSecurityPatchLevel(n.getStringValue()); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        deserializerMap.put("skuFamily", (n) -> { this.setSkuFamily(n.getStringValue()); });
        deserializerMap.put("skuNumber", (n) -> { this.setSkuNumber(n.getIntegerValue()); });
        deserializerMap.put("specificationVersion", (n) -> { this.setSpecificationVersion(n.getStringValue()); });
        deserializerMap.put("subscriberCarrier", (n) -> { this.setSubscriberCarrier(n.getStringValue()); });
        deserializerMap.put("totalStorageSpaceInBytes", (n) -> { this.setTotalStorageSpaceInBytes(n.getLongValue()); });
        deserializerMap.put("udid", (n) -> { this.setUdid(n.getStringValue()); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(User::createFromDiscriminatorValue)); });
        deserializerMap.put("usersLoggedOn", (n) -> { this.setUsersLoggedOn(n.getCollectionOfObjectValues(LoggedOnUser::createFromDiscriminatorValue)); });
        deserializerMap.put("wiFiMacAddress", (n) -> { this.setWiFiMacAddress(n.getStringValue()); });
        deserializerMap.put("windowsActiveMalwareCount", (n) -> { this.setWindowsActiveMalwareCount(n.getIntegerValue()); });
        deserializerMap.put("windowsProtectionState", (n) -> { this.setWindowsProtectionState(n.getObjectValue(WindowsProtectionState::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsRemediatedMalwareCount", (n) -> { this.setWindowsRemediatedMalwareCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the freeStorageSpaceInBytes property value. Free Storage in Bytes. Default value is 0. Read-only. This property is read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getFreeStorageSpaceInBytes() {
        return this.backingStore.get("freeStorageSpaceInBytes");
    }
    /**
     * Gets the hardwareInformation property value. The hardward details for the device. Includes information such as storage space, manufacturer, serial number, etc. By default most property of this type are set to null/0/false and enum defaults for associated types. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a {@link HardwareInformation}
     */
    @jakarta.annotation.Nullable
    public HardwareInformation getHardwareInformation() {
        return this.backingStore.get("hardwareInformation");
    }
    /**
     * Gets the iccid property value. Integrated Circuit Card Identifier, it is A SIM card's unique identification number. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIccid() {
        return this.backingStore.get("iccid");
    }
    /**
     * Gets the imei property value. IMEI. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImei() {
        return this.backingStore.get("imei");
    }
    /**
     * Gets the isEncrypted property value. Device encryption status. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEncrypted() {
        return this.backingStore.get("isEncrypted");
    }
    /**
     * Gets the isSupervised property value. Device supervised status. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSupervised() {
        return this.backingStore.get("isSupervised");
    }
    /**
     * Gets the jailBroken property value. Whether the device is jail broken or rooted. Default is an empty string. Supports $filter operator 'eq' and 'or'. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJailBroken() {
        return this.backingStore.get("jailBroken");
    }
    /**
     * Gets the joinType property value. Device enrollment join type.
     * @return a {@link JoinType}
     */
    @jakarta.annotation.Nullable
    public JoinType getJoinType() {
        return this.backingStore.get("joinType");
    }
    /**
     * Gets the lastSyncDateTime property value. The date and time that the device last completed a successful sync with Intune. Supports $filter operator 'lt' and 'gt'. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.backingStore.get("lastSyncDateTime");
    }
    /**
     * Gets the logCollectionRequests property value. List of log collection requests
     * @return a {@link java.util.List<DeviceLogCollectionResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceLogCollectionResponse> getLogCollectionRequests() {
        return this.backingStore.get("logCollectionRequests");
    }
    /**
     * Gets the lostModeState property value. State of lost mode, indicating if lost mode is enabled or disabled
     * @return a {@link LostModeState}
     */
    @jakarta.annotation.Nullable
    public LostModeState getLostModeState() {
        return this.backingStore.get("lostModeState");
    }
    /**
     * Gets the managedDeviceMobileAppConfigurationStates property value. Managed device mobile app configuration states for this device.
     * @return a {@link java.util.List<ManagedDeviceMobileAppConfigurationState>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfigurationState> getManagedDeviceMobileAppConfigurationStates() {
        return this.backingStore.get("managedDeviceMobileAppConfigurationStates");
    }
    /**
     * Gets the managedDeviceName property value. Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceName() {
        return this.backingStore.get("managedDeviceName");
    }
    /**
     * Gets the managedDeviceOwnerType property value. Owner type of device.
     * @return a {@link ManagedDeviceOwnerType}
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceOwnerType getManagedDeviceOwnerType() {
        return this.backingStore.get("managedDeviceOwnerType");
    }
    /**
     * Gets the managementAgent property value. Management agent type.
     * @return a {@link ManagementAgentType}
     */
    @jakarta.annotation.Nullable
    public ManagementAgentType getManagementAgent() {
        return this.backingStore.get("managementAgent");
    }
    /**
     * Gets the managementCertificateExpirationDate property value. Reports device management certificate expiration date. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getManagementCertificateExpirationDate() {
        return this.backingStore.get("managementCertificateExpirationDate");
    }
    /**
     * Gets the managementFeatures property value. Device management features.
     * @return a {@link ManagedDeviceManagementFeatures}
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceManagementFeatures getManagementFeatures() {
        return this.backingStore.get("managementFeatures");
    }
    /**
     * Gets the managementState property value. Management state of device in Microsoft Intune.
     * @return a {@link ManagementState}
     */
    @jakarta.annotation.Nullable
    public ManagementState getManagementState() {
        return this.backingStore.get("managementState");
    }
    /**
     * Gets the manufacturer property value. Manufacturer of the device. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.backingStore.get("manufacturer");
    }
    /**
     * Gets the meid property value. MEID. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMeid() {
        return this.backingStore.get("meid");
    }
    /**
     * Gets the model property value. Model of the device. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.backingStore.get("model");
    }
    /**
     * Gets the notes property value. Notes on the device created by IT Admin. Default is null. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.backingStore.get("notes");
    }
    /**
     * Gets the operatingSystem property value. Operating system of the device. Windows, iOS, etc. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperatingSystem() {
        return this.backingStore.get("operatingSystem");
    }
    /**
     * Gets the osVersion property value. Operating system version of the device. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the ownerType property value. Owner type of device.
     * @return a {@link OwnerType}
     */
    @jakarta.annotation.Nullable
    public OwnerType getOwnerType() {
        return this.backingStore.get("ownerType");
    }
    /**
     * Gets the partnerReportedThreatState property value. Available health states for the Device Health API
     * @return a {@link ManagedDevicePartnerReportedHealthState}
     */
    @jakarta.annotation.Nullable
    public ManagedDevicePartnerReportedHealthState getPartnerReportedThreatState() {
        return this.backingStore.get("partnerReportedThreatState");
    }
    /**
     * Gets the phoneNumber property value. Phone number of the device. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.backingStore.get("phoneNumber");
    }
    /**
     * Gets the physicalMemoryInBytes property value. Total Memory in Bytes. Default is 0. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. Read-only. This property is read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPhysicalMemoryInBytes() {
        return this.backingStore.get("physicalMemoryInBytes");
    }
    /**
     * Gets the preferMdmOverGroupPolicyAppliedDateTime property value. Reports the DateTime the preferMdmOverGroupPolicy setting was set.  When set, the Intune MDM settings will override Group Policy settings if there is a conflict. Read Only. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPreferMdmOverGroupPolicyAppliedDateTime() {
        return this.backingStore.get("preferMdmOverGroupPolicyAppliedDateTime");
    }
    /**
     * Gets the processorArchitecture property value. Processor architecture
     * @return a {@link ManagedDeviceArchitecture}
     */
    @jakarta.annotation.Nullable
    public ManagedDeviceArchitecture getProcessorArchitecture() {
        return this.backingStore.get("processorArchitecture");
    }
    /**
     * Gets the remoteAssistanceSessionErrorDetails property value. An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemoteAssistanceSessionErrorDetails() {
        return this.backingStore.get("remoteAssistanceSessionErrorDetails");
    }
    /**
     * Gets the remoteAssistanceSessionUrl property value. Url that allows a Remote Assistance session to be established with the device. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemoteAssistanceSessionUrl() {
        return this.backingStore.get("remoteAssistanceSessionUrl");
    }
    /**
     * Gets the requireUserEnrollmentApproval property value. Reports if the managed iOS device is user approval enrollment. This property is read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireUserEnrollmentApproval() {
        return this.backingStore.get("requireUserEnrollmentApproval");
    }
    /**
     * Gets the retireAfterDateTime property value. Indicates the time after when a device will be auto retired because of scheduled action. This property is read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRetireAfterDateTime() {
        return this.backingStore.get("retireAfterDateTime");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tag IDs for this Device instance.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.backingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the securityBaselineStates property value. Security baseline states for this device.
     * @return a {@link java.util.List<SecurityBaselineState>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityBaselineState> getSecurityBaselineStates() {
        return this.backingStore.get("securityBaselineStates");
    }
    /**
     * Gets the securityPatchLevel property value. This indicates the security patch level of the operating system. These special updates contain important security fixes. For iOS/MacOS they are in (a) format. For android its in 2017-08-07 format. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecurityPatchLevel() {
        return this.backingStore.get("securityPatchLevel");
    }
    /**
     * Gets the serialNumber property value. SerialNumber. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.backingStore.get("serialNumber");
    }
    /**
     * Gets the skuFamily property value. Device sku family
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSkuFamily() {
        return this.backingStore.get("skuFamily");
    }
    /**
     * Gets the skuNumber property value. Device sku number, see also: https://learn.microsoft.com/windows/win32/api/sysinfoapi/nf-sysinfoapi-getproductinfo. Valid values 0 to 2147483647. This property is read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSkuNumber() {
        return this.backingStore.get("skuNumber");
    }
    /**
     * Gets the specificationVersion property value. Specification version. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSpecificationVersion() {
        return this.backingStore.get("specificationVersion");
    }
    /**
     * Gets the subscriberCarrier property value. Subscriber Carrier. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriberCarrier() {
        return this.backingStore.get("subscriberCarrier");
    }
    /**
     * Gets the totalStorageSpaceInBytes property value. Total Storage in Bytes. This property is read-only.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalStorageSpaceInBytes() {
        return this.backingStore.get("totalStorageSpaceInBytes");
    }
    /**
     * Gets the udid property value. Unique Device Identifier for iOS and macOS devices. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUdid() {
        return this.backingStore.get("udid");
    }
    /**
     * Gets the userDisplayName property value. User display name. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.backingStore.get("userDisplayName");
    }
    /**
     * Gets the userId property value. Unique Identifier for the user associated with the device. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Gets the userPrincipalName property value. Device user principal name. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Gets the users property value. The primary users associated with the managed device.
     * @return a {@link java.util.List<User>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<User> getUsers() {
        return this.backingStore.get("users");
    }
    /**
     * Gets the usersLoggedOn property value. Indicates the last logged on users of a device. This property is read-only.
     * @return a {@link java.util.List<LoggedOnUser>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LoggedOnUser> getUsersLoggedOn() {
        return this.backingStore.get("usersLoggedOn");
    }
    /**
     * Gets the wiFiMacAddress property value. Wi-Fi MAC. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWiFiMacAddress() {
        return this.backingStore.get("wiFiMacAddress");
    }
    /**
     * Gets the windowsActiveMalwareCount property value. Count of active malware for this windows device. Default is 0. To retrieve actual values GET call needs to be made, with device id and included in select parameter. This property is read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWindowsActiveMalwareCount() {
        return this.backingStore.get("windowsActiveMalwareCount");
    }
    /**
     * Gets the windowsProtectionState property value. The device protection status. This property is read-only.
     * @return a {@link WindowsProtectionState}
     */
    @jakarta.annotation.Nullable
    public WindowsProtectionState getWindowsProtectionState() {
        return this.backingStore.get("windowsProtectionState");
    }
    /**
     * Gets the windowsRemediatedMalwareCount property value. Count of remediated malware for this windows device. Default is 0. To retrieve actual values GET call needs to be made, with device id and included in select parameter. This property is read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWindowsRemediatedMalwareCount() {
        return this.backingStore.get("windowsRemediatedMalwareCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignmentFilterEvaluationStatusDetails", this.getAssignmentFilterEvaluationStatusDetails());
        writer.writeEnumValue("chassisType", this.getChassisType());
        writer.writeCollectionOfObjectValues("chromeOSDeviceInfo", this.getChromeOSDeviceInfo());
        writer.writeCollectionOfObjectValues("cloudPcRemoteActionResults", this.getCloudPcRemoteActionResults());
        writer.writeEnumValue("complianceState", this.getComplianceState());
        writer.writeObjectValue("configurationManagerClientHealthState", this.getConfigurationManagerClientHealthState());
        writer.writeObjectValue("configurationManagerClientInformation", this.getConfigurationManagerClientInformation());
        writer.writeCollectionOfObjectValues("detectedApps", this.getDetectedApps());
        writer.writeObjectValue("deviceCategory", this.getDeviceCategory());
        writer.writeCollectionOfObjectValues("deviceCompliancePolicyStates", this.getDeviceCompliancePolicyStates());
        writer.writeCollectionOfObjectValues("deviceConfigurationStates", this.getDeviceConfigurationStates());
        writer.writeEnumValue("deviceEnrollmentType", this.getDeviceEnrollmentType());
        writer.writeBooleanValue("deviceFirmwareConfigurationInterfaceManaged", this.getDeviceFirmwareConfigurationInterfaceManaged());
        writer.writeCollectionOfObjectValues("deviceHealthScriptStates", this.getDeviceHealthScriptStates());
        writer.writeEnumValue("deviceRegistrationState", this.getDeviceRegistrationState());
        writer.writeEnumValue("deviceType", this.getDeviceType());
        writer.writeEnumValue("exchangeAccessState", this.getExchangeAccessState());
        writer.writeEnumValue("exchangeAccessStateReason", this.getExchangeAccessStateReason());
        writer.writeEnumValue("joinType", this.getJoinType());
        writer.writeCollectionOfObjectValues("logCollectionRequests", this.getLogCollectionRequests());
        writer.writeEnumValue("lostModeState", this.getLostModeState());
        writer.writeCollectionOfObjectValues("managedDeviceMobileAppConfigurationStates", this.getManagedDeviceMobileAppConfigurationStates());
        writer.writeStringValue("managedDeviceName", this.getManagedDeviceName());
        writer.writeEnumValue("managedDeviceOwnerType", this.getManagedDeviceOwnerType());
        writer.writeEnumValue("managementAgent", this.getManagementAgent());
        writer.writeEnumValue("managementFeatures", this.getManagementFeatures());
        writer.writeEnumValue("managementState", this.getManagementState());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeEnumValue("ownerType", this.getOwnerType());
        writer.writeEnumValue("partnerReportedThreatState", this.getPartnerReportedThreatState());
        writer.writeEnumValue("processorArchitecture", this.getProcessorArchitecture());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeCollectionOfObjectValues("securityBaselineStates", this.getSecurityBaselineStates());
        writer.writeStringValue("skuFamily", this.getSkuFamily());
        writer.writeCollectionOfObjectValues("users", this.getUsers());
        writer.writeObjectValue("windowsProtectionState", this.getWindowsProtectionState());
    }
    /**
     * Sets the aadRegistered property value. Whether the device is Azure Active Directory registered. This property is read-only.
     * @param value Value to set for the aadRegistered property.
     */
    public void setAadRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("aadRegistered", value);
    }
    /**
     * Sets the activationLockBypassCode property value. The code that allows the Activation Lock on managed device to be bypassed. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity in LIST call. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the activationLockBypassCode property.
     */
    public void setActivationLockBypassCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activationLockBypassCode", value);
    }
    /**
     * Sets the androidSecurityPatchLevel property value. Android security patch level. This property is read-only.
     * @param value Value to set for the androidSecurityPatchLevel property.
     */
    public void setAndroidSecurityPatchLevel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("androidSecurityPatchLevel", value);
    }
    /**
     * Sets the assignmentFilterEvaluationStatusDetails property value. Managed device mobile app configuration states for this device.
     * @param value Value to set for the assignmentFilterEvaluationStatusDetails property.
     */
    public void setAssignmentFilterEvaluationStatusDetails(@jakarta.annotation.Nullable final java.util.List<AssignmentFilterEvaluationStatusDetails> value) {
        this.backingStore.set("assignmentFilterEvaluationStatusDetails", value);
    }
    /**
     * Sets the autopilotEnrolled property value. Reports if the managed device is enrolled via auto-pilot. This property is read-only.
     * @param value Value to set for the autopilotEnrolled property.
     */
    public void setAutopilotEnrolled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("autopilotEnrolled", value);
    }
    /**
     * Sets the azureActiveDirectoryDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @param value Value to set for the azureActiveDirectoryDeviceId property.
     */
    public void setAzureActiveDirectoryDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureActiveDirectoryDeviceId", value);
    }
    /**
     * Sets the azureADDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @param value Value to set for the azureADDeviceId property.
     */
    public void setAzureADDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("azureADDeviceId", value);
    }
    /**
     * Sets the azureADRegistered property value. Whether the device is Azure Active Directory registered. This property is read-only.
     * @param value Value to set for the azureADRegistered property.
     */
    public void setAzureADRegistered(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("azureADRegistered", value);
    }
    /**
     * Sets the bootstrapTokenEscrowed property value. Reports if the managed device has an escrowed Bootstrap Token. This is only for macOS devices. To get, include BootstrapTokenEscrowed in the select clause and query with a device id. If FALSE, no bootstrap token is escrowed. If TRUE, the device has escrowed a bootstrap token with Intune. This property is read-only.
     * @param value Value to set for the bootstrapTokenEscrowed property.
     */
    public void setBootstrapTokenEscrowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("bootstrapTokenEscrowed", value);
    }
    /**
     * Sets the chassisType property value. Chassis type.
     * @param value Value to set for the chassisType property.
     */
    public void setChassisType(@jakarta.annotation.Nullable final ChassisType value) {
        this.backingStore.set("chassisType", value);
    }
    /**
     * Sets the chromeOSDeviceInfo property value. List of properties of the ChromeOS Device. Default is an empty list. To retrieve actual values GET call needs to be made, with device id and included in select parameter.
     * @param value Value to set for the chromeOSDeviceInfo property.
     */
    public void setChromeOSDeviceInfo(@jakarta.annotation.Nullable final java.util.List<ChromeOSDeviceProperty> value) {
        this.backingStore.set("chromeOSDeviceInfo", value);
    }
    /**
     * Sets the cloudPcRemoteActionResults property value. The cloudPcRemoteActionResults property
     * @param value Value to set for the cloudPcRemoteActionResults property.
     */
    public void setCloudPcRemoteActionResults(@jakarta.annotation.Nullable final java.util.List<CloudPcRemoteActionResult> value) {
        this.backingStore.set("cloudPcRemoteActionResults", value);
    }
    /**
     * Sets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires. This property is read-only.
     * @param value Value to set for the complianceGracePeriodExpirationDateTime property.
     */
    public void setComplianceGracePeriodExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("complianceGracePeriodExpirationDateTime", value);
    }
    /**
     * Sets the complianceState property value. Compliance state.
     * @param value Value to set for the complianceState property.
     */
    public void setComplianceState(@jakarta.annotation.Nullable final ComplianceState value) {
        this.backingStore.set("complianceState", value);
    }
    /**
     * Sets the configurationManagerClientEnabledFeatures property value. ConfigrMgr client enabled features. This property is read-only.
     * @param value Value to set for the configurationManagerClientEnabledFeatures property.
     */
    public void setConfigurationManagerClientEnabledFeatures(@jakarta.annotation.Nullable final ConfigurationManagerClientEnabledFeatures value) {
        this.backingStore.set("configurationManagerClientEnabledFeatures", value);
    }
    /**
     * Sets the configurationManagerClientHealthState property value. Configuration manager client health state, valid only for devices managed by MDM/ConfigMgr Agent
     * @param value Value to set for the configurationManagerClientHealthState property.
     */
    public void setConfigurationManagerClientHealthState(@jakarta.annotation.Nullable final ConfigurationManagerClientHealthState value) {
        this.backingStore.set("configurationManagerClientHealthState", value);
    }
    /**
     * Sets the configurationManagerClientInformation property value. Configuration manager client information, valid only for devices managed, duel-managed or tri-managed by ConfigMgr Agent
     * @param value Value to set for the configurationManagerClientInformation property.
     */
    public void setConfigurationManagerClientInformation(@jakarta.annotation.Nullable final ConfigurationManagerClientInformation value) {
        this.backingStore.set("configurationManagerClientInformation", value);
    }
    /**
     * Sets the detectedApps property value. All applications currently installed on the device
     * @param value Value to set for the detectedApps property.
     */
    public void setDetectedApps(@jakarta.annotation.Nullable final java.util.List<DetectedApp> value) {
        this.backingStore.set("detectedApps", value);
    }
    /**
     * Sets the deviceActionResults property value. List of ComplexType deviceActionResult objects. This property is read-only.
     * @param value Value to set for the deviceActionResults property.
     */
    public void setDeviceActionResults(@jakarta.annotation.Nullable final java.util.List<DeviceActionResult> value) {
        this.backingStore.set("deviceActionResults", value);
    }
    /**
     * Sets the deviceCategory property value. Device category
     * @param value Value to set for the deviceCategory property.
     */
    public void setDeviceCategory(@jakarta.annotation.Nullable final DeviceCategory value) {
        this.backingStore.set("deviceCategory", value);
    }
    /**
     * Sets the deviceCategoryDisplayName property value. Device category display name. Default is an empty string. Supports $filter operator 'eq' and 'or'. This property is read-only.
     * @param value Value to set for the deviceCategoryDisplayName property.
     */
    public void setDeviceCategoryDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceCategoryDisplayName", value);
    }
    /**
     * Sets the deviceCompliancePolicyStates property value. Device compliance policy states for this device.
     * @param value Value to set for the deviceCompliancePolicyStates property.
     */
    public void setDeviceCompliancePolicyStates(@jakarta.annotation.Nullable final java.util.List<DeviceCompliancePolicyState> value) {
        this.backingStore.set("deviceCompliancePolicyStates", value);
    }
    /**
     * Sets the deviceConfigurationStates property value. Device configuration states for this device.
     * @param value Value to set for the deviceConfigurationStates property.
     */
    public void setDeviceConfigurationStates(@jakarta.annotation.Nullable final java.util.List<DeviceConfigurationState> value) {
        this.backingStore.set("deviceConfigurationStates", value);
    }
    /**
     * Sets the deviceEnrollmentType property value. Possible ways of adding a mobile device to management.
     * @param value Value to set for the deviceEnrollmentType property.
     */
    public void setDeviceEnrollmentType(@jakarta.annotation.Nullable final DeviceEnrollmentType value) {
        this.backingStore.set("deviceEnrollmentType", value);
    }
    /**
     * Sets the deviceFirmwareConfigurationInterfaceManaged property value. Indicates whether the device is DFCI managed. When TRUE the device is DFCI managed. When FALSE, the device is not DFCI managed. The default value is FALSE.
     * @param value Value to set for the deviceFirmwareConfigurationInterfaceManaged property.
     */
    public void setDeviceFirmwareConfigurationInterfaceManaged(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("deviceFirmwareConfigurationInterfaceManaged", value);
    }
    /**
     * Sets the deviceHealthAttestationState property value. The device health attestation state. This property is read-only.
     * @param value Value to set for the deviceHealthAttestationState property.
     */
    public void setDeviceHealthAttestationState(@jakarta.annotation.Nullable final DeviceHealthAttestationState value) {
        this.backingStore.set("deviceHealthAttestationState", value);
    }
    /**
     * Sets the deviceHealthScriptStates property value. Results of device health scripts that ran for this device. Default is empty list. This property is read-only.
     * @param value Value to set for the deviceHealthScriptStates property.
     */
    public void setDeviceHealthScriptStates(@jakarta.annotation.Nullable final java.util.List<DeviceHealthScriptPolicyState> value) {
        this.backingStore.set("deviceHealthScriptStates", value);
    }
    /**
     * Sets the deviceName property value. Name of the device. Supports $filter operator 'eq' and 'contains'. This property is read-only.
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the deviceRegistrationState property value. Device registration status.
     * @param value Value to set for the deviceRegistrationState property.
     */
    public void setDeviceRegistrationState(@jakarta.annotation.Nullable final DeviceRegistrationState value) {
        this.backingStore.set("deviceRegistrationState", value);
    }
    /**
     * Sets the deviceType property value. Device type.
     * @param value Value to set for the deviceType property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final DeviceType value) {
        this.backingStore.set("deviceType", value);
    }
    /**
     * Sets the easActivated property value. Whether the device is Exchange ActiveSync activated. This property is read-only.
     * @param value Value to set for the easActivated property.
     */
    public void setEasActivated(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("easActivated", value);
    }
    /**
     * Sets the easActivationDateTime property value. Exchange ActivationSync activation time of the device. This property is read-only.
     * @param value Value to set for the easActivationDateTime property.
     */
    public void setEasActivationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("easActivationDateTime", value);
    }
    /**
     * Sets the easDeviceId property value. Exchange ActiveSync Id of the device. This property is read-only.
     * @param value Value to set for the easDeviceId property.
     */
    public void setEasDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("easDeviceId", value);
    }
    /**
     * Sets the emailAddress property value. Email(s) for the user associated with the device. This property is read-only.
     * @param value Value to set for the emailAddress property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailAddress", value);
    }
    /**
     * Sets the enrolledByUserPrincipalName property value. The Entra (Azure AD) User Principal Name (UPN) of the user responsible for the enrollment of the device. This property is read-only.
     * @param value Value to set for the enrolledByUserPrincipalName property.
     */
    public void setEnrolledByUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("enrolledByUserPrincipalName", value);
    }
    /**
     * Sets the enrolledDateTime property value. Enrollment time of the device. Supports $filter operator 'lt' and 'gt'. This property is read-only.
     * @param value Value to set for the enrolledDateTime property.
     */
    public void setEnrolledDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("enrolledDateTime", value);
    }
    /**
     * Sets the enrollmentProfileName property value. Name of the enrollment profile assigned to the device. Default value is empty string, indicating no enrollment profile was assgined. This property is read-only.
     * @param value Value to set for the enrollmentProfileName property.
     */
    public void setEnrollmentProfileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("enrollmentProfileName", value);
    }
    /**
     * Sets the ethernetMacAddress property value. Indicates Ethernet MAC Address of the device. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity. Individual get call with select query options is needed to retrieve actual values. Example: deviceManagement/managedDevices({managedDeviceId})?$select=ethernetMacAddress Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the ethernetMacAddress property.
     */
    public void setEthernetMacAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ethernetMacAddress", value);
    }
    /**
     * Sets the exchangeAccessState property value. Device Exchange Access State.
     * @param value Value to set for the exchangeAccessState property.
     */
    public void setExchangeAccessState(@jakarta.annotation.Nullable final DeviceManagementExchangeAccessState value) {
        this.backingStore.set("exchangeAccessState", value);
    }
    /**
     * Sets the exchangeAccessStateReason property value. Device Exchange Access State Reason.
     * @param value Value to set for the exchangeAccessStateReason property.
     */
    public void setExchangeAccessStateReason(@jakarta.annotation.Nullable final DeviceManagementExchangeAccessStateReason value) {
        this.backingStore.set("exchangeAccessStateReason", value);
    }
    /**
     * Sets the exchangeLastSuccessfulSyncDateTime property value. Last time the device contacted Exchange. This property is read-only.
     * @param value Value to set for the exchangeLastSuccessfulSyncDateTime property.
     */
    public void setExchangeLastSuccessfulSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("exchangeLastSuccessfulSyncDateTime", value);
    }
    /**
     * Sets the freeStorageSpaceInBytes property value. Free Storage in Bytes. Default value is 0. Read-only. This property is read-only.
     * @param value Value to set for the freeStorageSpaceInBytes property.
     */
    public void setFreeStorageSpaceInBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("freeStorageSpaceInBytes", value);
    }
    /**
     * Sets the hardwareInformation property value. The hardward details for the device. Includes information such as storage space, manufacturer, serial number, etc. By default most property of this type are set to null/0/false and enum defaults for associated types. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the hardwareInformation property.
     */
    public void setHardwareInformation(@jakarta.annotation.Nullable final HardwareInformation value) {
        this.backingStore.set("hardwareInformation", value);
    }
    /**
     * Sets the iccid property value. Integrated Circuit Card Identifier, it is A SIM card's unique identification number. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the iccid property.
     */
    public void setIccid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("iccid", value);
    }
    /**
     * Sets the imei property value. IMEI. This property is read-only.
     * @param value Value to set for the imei property.
     */
    public void setImei(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("imei", value);
    }
    /**
     * Sets the isEncrypted property value. Device encryption status. This property is read-only.
     * @param value Value to set for the isEncrypted property.
     */
    public void setIsEncrypted(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEncrypted", value);
    }
    /**
     * Sets the isSupervised property value. Device supervised status. This property is read-only.
     * @param value Value to set for the isSupervised property.
     */
    public void setIsSupervised(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSupervised", value);
    }
    /**
     * Sets the jailBroken property value. Whether the device is jail broken or rooted. Default is an empty string. Supports $filter operator 'eq' and 'or'. This property is read-only.
     * @param value Value to set for the jailBroken property.
     */
    public void setJailBroken(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("jailBroken", value);
    }
    /**
     * Sets the joinType property value. Device enrollment join type.
     * @param value Value to set for the joinType property.
     */
    public void setJoinType(@jakarta.annotation.Nullable final JoinType value) {
        this.backingStore.set("joinType", value);
    }
    /**
     * Sets the lastSyncDateTime property value. The date and time that the device last completed a successful sync with Intune. Supports $filter operator 'lt' and 'gt'. This property is read-only.
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSyncDateTime", value);
    }
    /**
     * Sets the logCollectionRequests property value. List of log collection requests
     * @param value Value to set for the logCollectionRequests property.
     */
    public void setLogCollectionRequests(@jakarta.annotation.Nullable final java.util.List<DeviceLogCollectionResponse> value) {
        this.backingStore.set("logCollectionRequests", value);
    }
    /**
     * Sets the lostModeState property value. State of lost mode, indicating if lost mode is enabled or disabled
     * @param value Value to set for the lostModeState property.
     */
    public void setLostModeState(@jakarta.annotation.Nullable final LostModeState value) {
        this.backingStore.set("lostModeState", value);
    }
    /**
     * Sets the managedDeviceMobileAppConfigurationStates property value. Managed device mobile app configuration states for this device.
     * @param value Value to set for the managedDeviceMobileAppConfigurationStates property.
     */
    public void setManagedDeviceMobileAppConfigurationStates(@jakarta.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfigurationState> value) {
        this.backingStore.set("managedDeviceMobileAppConfigurationStates", value);
    }
    /**
     * Sets the managedDeviceName property value. Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     * @param value Value to set for the managedDeviceName property.
     */
    public void setManagedDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedDeviceName", value);
    }
    /**
     * Sets the managedDeviceOwnerType property value. Owner type of device.
     * @param value Value to set for the managedDeviceOwnerType property.
     */
    public void setManagedDeviceOwnerType(@jakarta.annotation.Nullable final ManagedDeviceOwnerType value) {
        this.backingStore.set("managedDeviceOwnerType", value);
    }
    /**
     * Sets the managementAgent property value. Management agent type.
     * @param value Value to set for the managementAgent property.
     */
    public void setManagementAgent(@jakarta.annotation.Nullable final ManagementAgentType value) {
        this.backingStore.set("managementAgent", value);
    }
    /**
     * Sets the managementCertificateExpirationDate property value. Reports device management certificate expiration date. This property is read-only.
     * @param value Value to set for the managementCertificateExpirationDate property.
     */
    public void setManagementCertificateExpirationDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("managementCertificateExpirationDate", value);
    }
    /**
     * Sets the managementFeatures property value. Device management features.
     * @param value Value to set for the managementFeatures property.
     */
    public void setManagementFeatures(@jakarta.annotation.Nullable final ManagedDeviceManagementFeatures value) {
        this.backingStore.set("managementFeatures", value);
    }
    /**
     * Sets the managementState property value. Management state of device in Microsoft Intune.
     * @param value Value to set for the managementState property.
     */
    public void setManagementState(@jakarta.annotation.Nullable final ManagementState value) {
        this.backingStore.set("managementState", value);
    }
    /**
     * Sets the manufacturer property value. Manufacturer of the device. This property is read-only.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("manufacturer", value);
    }
    /**
     * Sets the meid property value. MEID. This property is read-only.
     * @param value Value to set for the meid property.
     */
    public void setMeid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("meid", value);
    }
    /**
     * Sets the model property value. Model of the device. This property is read-only.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("model", value);
    }
    /**
     * Sets the notes property value. Notes on the device created by IT Admin. Default is null. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("notes", value);
    }
    /**
     * Sets the operatingSystem property value. Operating system of the device. Windows, iOS, etc. This property is read-only.
     * @param value Value to set for the operatingSystem property.
     */
    public void setOperatingSystem(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("operatingSystem", value);
    }
    /**
     * Sets the osVersion property value. Operating system version of the device. This property is read-only.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the ownerType property value. Owner type of device.
     * @param value Value to set for the ownerType property.
     */
    public void setOwnerType(@jakarta.annotation.Nullable final OwnerType value) {
        this.backingStore.set("ownerType", value);
    }
    /**
     * Sets the partnerReportedThreatState property value. Available health states for the Device Health API
     * @param value Value to set for the partnerReportedThreatState property.
     */
    public void setPartnerReportedThreatState(@jakarta.annotation.Nullable final ManagedDevicePartnerReportedHealthState value) {
        this.backingStore.set("partnerReportedThreatState", value);
    }
    /**
     * Sets the phoneNumber property value. Phone number of the device. This property is read-only.
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phoneNumber", value);
    }
    /**
     * Sets the physicalMemoryInBytes property value. Total Memory in Bytes. Default is 0. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. Read-only. This property is read-only.
     * @param value Value to set for the physicalMemoryInBytes property.
     */
    public void setPhysicalMemoryInBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("physicalMemoryInBytes", value);
    }
    /**
     * Sets the preferMdmOverGroupPolicyAppliedDateTime property value. Reports the DateTime the preferMdmOverGroupPolicy setting was set.  When set, the Intune MDM settings will override Group Policy settings if there is a conflict. Read Only. This property is read-only.
     * @param value Value to set for the preferMdmOverGroupPolicyAppliedDateTime property.
     */
    public void setPreferMdmOverGroupPolicyAppliedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("preferMdmOverGroupPolicyAppliedDateTime", value);
    }
    /**
     * Sets the processorArchitecture property value. Processor architecture
     * @param value Value to set for the processorArchitecture property.
     */
    public void setProcessorArchitecture(@jakarta.annotation.Nullable final ManagedDeviceArchitecture value) {
        this.backingStore.set("processorArchitecture", value);
    }
    /**
     * Sets the remoteAssistanceSessionErrorDetails property value. An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.
     * @param value Value to set for the remoteAssistanceSessionErrorDetails property.
     */
    public void setRemoteAssistanceSessionErrorDetails(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remoteAssistanceSessionErrorDetails", value);
    }
    /**
     * Sets the remoteAssistanceSessionUrl property value. Url that allows a Remote Assistance session to be established with the device. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. This property is read-only.
     * @param value Value to set for the remoteAssistanceSessionUrl property.
     */
    public void setRemoteAssistanceSessionUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("remoteAssistanceSessionUrl", value);
    }
    /**
     * Sets the requireUserEnrollmentApproval property value. Reports if the managed iOS device is user approval enrollment. This property is read-only.
     * @param value Value to set for the requireUserEnrollmentApproval property.
     */
    public void setRequireUserEnrollmentApproval(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("requireUserEnrollmentApproval", value);
    }
    /**
     * Sets the retireAfterDateTime property value. Indicates the time after when a device will be auto retired because of scheduled action. This property is read-only.
     * @param value Value to set for the retireAfterDateTime property.
     */
    public void setRetireAfterDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("retireAfterDateTime", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tag IDs for this Device instance.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the securityBaselineStates property value. Security baseline states for this device.
     * @param value Value to set for the securityBaselineStates property.
     */
    public void setSecurityBaselineStates(@jakarta.annotation.Nullable final java.util.List<SecurityBaselineState> value) {
        this.backingStore.set("securityBaselineStates", value);
    }
    /**
     * Sets the securityPatchLevel property value. This indicates the security patch level of the operating system. These special updates contain important security fixes. For iOS/MacOS they are in (a) format. For android its in 2017-08-07 format. This property is read-only.
     * @param value Value to set for the securityPatchLevel property.
     */
    public void setSecurityPatchLevel(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("securityPatchLevel", value);
    }
    /**
     * Sets the serialNumber property value. SerialNumber. This property is read-only.
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serialNumber", value);
    }
    /**
     * Sets the skuFamily property value. Device sku family
     * @param value Value to set for the skuFamily property.
     */
    public void setSkuFamily(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("skuFamily", value);
    }
    /**
     * Sets the skuNumber property value. Device sku number, see also: https://learn.microsoft.com/windows/win32/api/sysinfoapi/nf-sysinfoapi-getproductinfo. Valid values 0 to 2147483647. This property is read-only.
     * @param value Value to set for the skuNumber property.
     */
    public void setSkuNumber(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("skuNumber", value);
    }
    /**
     * Sets the specificationVersion property value. Specification version. This property is read-only.
     * @param value Value to set for the specificationVersion property.
     */
    public void setSpecificationVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("specificationVersion", value);
    }
    /**
     * Sets the subscriberCarrier property value. Subscriber Carrier. This property is read-only.
     * @param value Value to set for the subscriberCarrier property.
     */
    public void setSubscriberCarrier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subscriberCarrier", value);
    }
    /**
     * Sets the totalStorageSpaceInBytes property value. Total Storage in Bytes. This property is read-only.
     * @param value Value to set for the totalStorageSpaceInBytes property.
     */
    public void setTotalStorageSpaceInBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("totalStorageSpaceInBytes", value);
    }
    /**
     * Sets the udid property value. Unique Device Identifier for iOS and macOS devices. Default is an empty string. To retrieve actual values GET call needs to be made, with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the udid property.
     */
    public void setUdid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("udid", value);
    }
    /**
     * Sets the userDisplayName property value. User display name. This property is read-only.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userDisplayName", value);
    }
    /**
     * Sets the userId property value. Unique Identifier for the user associated with the device. This property is read-only.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
    /**
     * Sets the userPrincipalName property value. Device user principal name. This property is read-only.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
    /**
     * Sets the users property value. The primary users associated with the managed device.
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<User> value) {
        this.backingStore.set("users", value);
    }
    /**
     * Sets the usersLoggedOn property value. Indicates the last logged on users of a device. This property is read-only.
     * @param value Value to set for the usersLoggedOn property.
     */
    public void setUsersLoggedOn(@jakarta.annotation.Nullable final java.util.List<LoggedOnUser> value) {
        this.backingStore.set("usersLoggedOn", value);
    }
    /**
     * Sets the wiFiMacAddress property value. Wi-Fi MAC. This property is read-only.
     * @param value Value to set for the wiFiMacAddress property.
     */
    public void setWiFiMacAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("wiFiMacAddress", value);
    }
    /**
     * Sets the windowsActiveMalwareCount property value. Count of active malware for this windows device. Default is 0. To retrieve actual values GET call needs to be made, with device id and included in select parameter. This property is read-only.
     * @param value Value to set for the windowsActiveMalwareCount property.
     */
    public void setWindowsActiveMalwareCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("windowsActiveMalwareCount", value);
    }
    /**
     * Sets the windowsProtectionState property value. The device protection status. This property is read-only.
     * @param value Value to set for the windowsProtectionState property.
     */
    public void setWindowsProtectionState(@jakarta.annotation.Nullable final WindowsProtectionState value) {
        this.backingStore.set("windowsProtectionState", value);
    }
    /**
     * Sets the windowsRemediatedMalwareCount property value. Count of remediated malware for this windows device. Default is 0. To retrieve actual values GET call needs to be made, with device id and included in select parameter. This property is read-only.
     * @param value Value to set for the windowsRemediatedMalwareCount property.
     */
    public void setWindowsRemediatedMalwareCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("windowsRemediatedMalwareCount", value);
    }
}
