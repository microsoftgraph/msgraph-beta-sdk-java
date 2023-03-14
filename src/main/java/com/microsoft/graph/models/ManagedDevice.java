package com.microsoft.graph.models;

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
public class ManagedDevice extends Entity implements Parsable {
    /** Whether the device is Azure Active Directory registered. This property is read-only. */
    private Boolean aadRegistered;
    /** The code that allows the Activation Lock on managed device to be bypassed. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity in LIST call. Individual GET call with select query options is needed to retrieve actual values. Supports: $select. $Search is not supported. Read-only. This property is read-only. */
    private String activationLockBypassCode;
    /** Android security patch level. This property is read-only. */
    private String androidSecurityPatchLevel;
    /** Managed device mobile app configuration states for this device. */
    private java.util.List<AssignmentFilterEvaluationStatusDetails> assignmentFilterEvaluationStatusDetails;
    /** Reports if the managed device is enrolled via auto-pilot. This property is read-only. */
    private Boolean autopilotEnrolled;
    /** The unique identifier for the Azure Active Directory device. Read only. This property is read-only. */
    private String azureActiveDirectoryDeviceId;
    /** The unique identifier for the Azure Active Directory device. Read only. This property is read-only. */
    private String azureADDeviceId;
    /** Whether the device is Azure Active Directory registered. This property is read-only. */
    private Boolean azureADRegistered;
    /** Reports if the managed device has an escrowed Bootstrap Token. This is only for macOS devices. To get, include BootstrapTokenEscrowed in the select clause and query with a device id. If FALSE, no bootstrap token is escrowed. If TRUE, the device has escrowed a bootstrap token with Intune. This property is read-only. */
    private Boolean bootstrapTokenEscrowed;
    /** Chassis type. */
    private ChassisType chassisType;
    /** List of properties of the ChromeOS Device. */
    private java.util.List<ChromeOSDeviceProperty> chromeOSDeviceInfo;
    /** The cloudPcRemoteActionResults property */
    private java.util.List<CloudPcRemoteActionResult> cloudPcRemoteActionResults;
    /** The DateTime when device compliance grace period expires. This property is read-only. */
    private OffsetDateTime complianceGracePeriodExpirationDateTime;
    /** Compliance state. */
    private ComplianceState complianceState;
    /** ConfigrMgr client enabled features. This property is read-only. */
    private ConfigurationManagerClientEnabledFeatures configurationManagerClientEnabledFeatures;
    /** Configuration manager client health state, valid only for devices managed by MDM/ConfigMgr Agent */
    private ConfigurationManagerClientHealthState configurationManagerClientHealthState;
    /** Configuration manager client information, valid only for devices managed, duel-managed or tri-managed by ConfigMgr Agent */
    private ConfigurationManagerClientInformation configurationManagerClientInformation;
    /** All applications currently installed on the device */
    private java.util.List<DetectedApp> detectedApps;
    /** List of ComplexType deviceActionResult objects. This property is read-only. */
    private java.util.List<DeviceActionResult> deviceActionResults;
    /** Device category */
    private DeviceCategory deviceCategory;
    /** Device category display name. This property is read-only. */
    private String deviceCategoryDisplayName;
    /** Device compliance policy states for this device. */
    private java.util.List<DeviceCompliancePolicyState> deviceCompliancePolicyStates;
    /** Device configuration states for this device. */
    private java.util.List<DeviceConfigurationState> deviceConfigurationStates;
    /** Possible ways of adding a mobile device to management. */
    private DeviceEnrollmentType deviceEnrollmentType;
    /** Indicates whether the device is DFCI managed. When TRUE the device is DFCI managed. When FALSE, the device is not DFCI managed. The default value is FALSE. */
    private Boolean deviceFirmwareConfigurationInterfaceManaged;
    /** The device health attestation state. This property is read-only. */
    private DeviceHealthAttestationState deviceHealthAttestationState;
    /** Results of device health scripts that ran for this device. Default is empty list. This property is read-only. */
    private java.util.List<DeviceHealthScriptPolicyState> deviceHealthScriptStates;
    /** Name of the device. This property is read-only. */
    private String deviceName;
    /** Device registration status. */
    private DeviceRegistrationState deviceRegistrationState;
    /** Device type. */
    private DeviceType deviceType;
    /** Whether the device is Exchange ActiveSync activated. This property is read-only. */
    private Boolean easActivated;
    /** Exchange ActivationSync activation time of the device. This property is read-only. */
    private OffsetDateTime easActivationDateTime;
    /** Exchange ActiveSync Id of the device. This property is read-only. */
    private String easDeviceId;
    /** Email(s) for the user associated with the device. This property is read-only. */
    private String emailAddress;
    /** Enrollment time of the device. This property is read-only. */
    private OffsetDateTime enrolledDateTime;
    /** Name of the enrollment profile assigned to the device. Default value is empty string, indicating no enrollment profile was assgined. This property is read-only. */
    private String enrollmentProfileName;
    /** Indicates Ethernet MAC Address of the device. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity. Individual get call with select query options is needed to retrieve actual values. Example: deviceManagement/managedDevices({managedDeviceId})?$select=ethernetMacAddress Supports: $select. $Search is not supported. Read-only. This property is read-only. */
    private String ethernetMacAddress;
    /** Device Exchange Access State. */
    private DeviceManagementExchangeAccessState exchangeAccessState;
    /** Device Exchange Access State Reason. */
    private DeviceManagementExchangeAccessStateReason exchangeAccessStateReason;
    /** Last time the device contacted Exchange. This property is read-only. */
    private OffsetDateTime exchangeLastSuccessfulSyncDateTime;
    /** Free Storage in Bytes. Default value is 0. Read-only. This property is read-only. */
    private Long freeStorageSpaceInBytes;
    /** The hardward details for the device.  Includes information such as storage space, manufacturer, serial number, etc. Return default value in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only. */
    private HardwareInformation hardwareInformation;
    /** Integrated Circuit Card Identifier, it is A SIM card's unique identification number. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only. */
    private String iccid;
    /** IMEI. This property is read-only. */
    private String imei;
    /** Device encryption status. This property is read-only. */
    private Boolean isEncrypted;
    /** Device supervised status. This property is read-only. */
    private Boolean isSupervised;
    /** whether the device is jail broken or rooted. This property is read-only. */
    private String jailBroken;
    /** Device enrollment join type. */
    private JoinType joinType;
    /** The date and time that the device last completed a successful sync with Intune. This property is read-only. */
    private OffsetDateTime lastSyncDateTime;
    /** List of log collection requests */
    private java.util.List<DeviceLogCollectionResponse> logCollectionRequests;
    /** State of lost mode, indicating if lost mode is enabled or disabled */
    private LostModeState lostModeState;
    /** Managed device mobile app configuration states for this device. */
    private java.util.List<ManagedDeviceMobileAppConfigurationState> managedDeviceMobileAppConfigurationStates;
    /** Automatically generated name to identify a device. Can be overwritten to a user friendly name. */
    private String managedDeviceName;
    /** Owner type of device. */
    private ManagedDeviceOwnerType managedDeviceOwnerType;
    /** Management agent type. */
    private ManagementAgentType managementAgent;
    /** Reports device management certificate expiration date. This property is read-only. */
    private OffsetDateTime managementCertificateExpirationDate;
    /** Device management features. */
    private ManagedDeviceManagementFeatures managementFeatures;
    /** Management state of device in Microsoft Intune. */
    private ManagementState managementState;
    /** Manufacturer of the device. This property is read-only. */
    private String manufacturer;
    /** MEID. This property is read-only. */
    private String meid;
    /** Model of the device. This property is read-only. */
    private String model;
    /** Notes on the device created by IT Admin. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select.  $Search is not supported. */
    private String notes;
    /** Operating system of the device. Windows, iOS, etc. This property is read-only. */
    private String operatingSystem;
    /** Operating system version of the device. This property is read-only. */
    private String osVersion;
    /** Owner type of device. */
    private OwnerType ownerType;
    /** Available health states for the Device Health API */
    private ManagedDevicePartnerReportedHealthState partnerReportedThreatState;
    /** Phone number of the device. This property is read-only. */
    private String phoneNumber;
    /** Total Memory in Bytes. Return default value 0 in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. Default value is 0. Read-only. This property is read-only. */
    private Long physicalMemoryInBytes;
    /** Reports the DateTime the preferMdmOverGroupPolicy setting was set.  When set, the Intune MDM settings will override Group Policy settings if there is a conflict. Read Only. This property is read-only. */
    private OffsetDateTime preferMdmOverGroupPolicyAppliedDateTime;
    /** Processor architecture */
    private ManagedDeviceArchitecture processorArchitecture;
    /** An error string that identifies issues when creating Remote Assistance session objects. This property is read-only. */
    private String remoteAssistanceSessionErrorDetails;
    /** Url that allows a Remote Assistance session to be established with the device. This property is read-only. */
    private String remoteAssistanceSessionUrl;
    /** Reports if the managed iOS device is user approval enrollment. This property is read-only. */
    private Boolean requireUserEnrollmentApproval;
    /** Indicates the time after when a device will be auto retired because of scheduled action. This property is read-only. */
    private OffsetDateTime retireAfterDateTime;
    /** List of Scope Tag IDs for this Device instance. */
    private java.util.List<String> roleScopeTagIds;
    /** Security baseline states for this device. */
    private java.util.List<SecurityBaselineState> securityBaselineStates;
    /** SerialNumber. This property is read-only. */
    private String serialNumber;
    /** Device sku family */
    private String skuFamily;
    /** Device sku number, see also: https://learn.microsoft.com/windows/win32/api/sysinfoapi/nf-sysinfoapi-getproductinfo. Valid values 0 to 2147483647. This property is read-only. */
    private Integer skuNumber;
    /** Specification version. This property is read-only. */
    private String specificationVersion;
    /** Subscriber Carrier. This property is read-only. */
    private String subscriberCarrier;
    /** Total Storage in Bytes. This property is read-only. */
    private Long totalStorageSpaceInBytes;
    /** Unique Device Identifier for iOS and macOS devices. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only. */
    private String udid;
    /** User display name. This property is read-only. */
    private String userDisplayName;
    /** Unique Identifier for the user associated with the device. This property is read-only. */
    private String userId;
    /** Device user principal name. This property is read-only. */
    private String userPrincipalName;
    /** The primary users associated with the managed device. */
    private java.util.List<User> users;
    /** Indicates the last logged on users of a device. This property is read-only. */
    private java.util.List<LoggedOnUser> usersLoggedOn;
    /** Wi-Fi MAC. This property is read-only. */
    private String wiFiMacAddress;
    /** Count of active malware for this windows device. This property is read-only. */
    private Integer windowsActiveMalwareCount;
    /** The device protection status. This property is read-only. */
    private WindowsProtectionState windowsProtectionState;
    /** Count of remediated malware for this windows device. This property is read-only. */
    private Integer windowsRemediatedMalwareCount;
    /**
     * Instantiates a new managedDevice and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedDevice() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDevice
     */
    @javax.annotation.Nonnull
    public static ManagedDevice createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAadRegistered() {
        return this.aadRegistered;
    }
    /**
     * Gets the activationLockBypassCode property value. The code that allows the Activation Lock on managed device to be bypassed. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity in LIST call. Individual GET call with select query options is needed to retrieve actual values. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivationLockBypassCode() {
        return this.activationLockBypassCode;
    }
    /**
     * Gets the androidSecurityPatchLevel property value. Android security patch level. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAndroidSecurityPatchLevel() {
        return this.androidSecurityPatchLevel;
    }
    /**
     * Gets the assignmentFilterEvaluationStatusDetails property value. Managed device mobile app configuration states for this device.
     * @return a assignmentFilterEvaluationStatusDetails
     */
    @javax.annotation.Nullable
    public java.util.List<AssignmentFilterEvaluationStatusDetails> getAssignmentFilterEvaluationStatusDetails() {
        return this.assignmentFilterEvaluationStatusDetails;
    }
    /**
     * Gets the autopilotEnrolled property value. Reports if the managed device is enrolled via auto-pilot. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutopilotEnrolled() {
        return this.autopilotEnrolled;
    }
    /**
     * Gets the azureActiveDirectoryDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureActiveDirectoryDeviceId() {
        return this.azureActiveDirectoryDeviceId;
    }
    /**
     * Gets the azureADDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureADDeviceId() {
        return this.azureADDeviceId;
    }
    /**
     * Gets the azureADRegistered property value. Whether the device is Azure Active Directory registered. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAzureADRegistered() {
        return this.azureADRegistered;
    }
    /**
     * Gets the bootstrapTokenEscrowed property value. Reports if the managed device has an escrowed Bootstrap Token. This is only for macOS devices. To get, include BootstrapTokenEscrowed in the select clause and query with a device id. If FALSE, no bootstrap token is escrowed. If TRUE, the device has escrowed a bootstrap token with Intune. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBootstrapTokenEscrowed() {
        return this.bootstrapTokenEscrowed;
    }
    /**
     * Gets the chassisType property value. Chassis type.
     * @return a chassisType
     */
    @javax.annotation.Nullable
    public ChassisType getChassisType() {
        return this.chassisType;
    }
    /**
     * Gets the chromeOSDeviceInfo property value. List of properties of the ChromeOS Device.
     * @return a chromeOSDeviceProperty
     */
    @javax.annotation.Nullable
    public java.util.List<ChromeOSDeviceProperty> getChromeOSDeviceInfo() {
        return this.chromeOSDeviceInfo;
    }
    /**
     * Gets the cloudPcRemoteActionResults property value. The cloudPcRemoteActionResults property
     * @return a cloudPcRemoteActionResult
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcRemoteActionResult> getCloudPcRemoteActionResults() {
        return this.cloudPcRemoteActionResults;
    }
    /**
     * Gets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getComplianceGracePeriodExpirationDateTime() {
        return this.complianceGracePeriodExpirationDateTime;
    }
    /**
     * Gets the complianceState property value. Compliance state.
     * @return a complianceState
     */
    @javax.annotation.Nullable
    public ComplianceState getComplianceState() {
        return this.complianceState;
    }
    /**
     * Gets the configurationManagerClientEnabledFeatures property value. ConfigrMgr client enabled features. This property is read-only.
     * @return a configurationManagerClientEnabledFeatures
     */
    @javax.annotation.Nullable
    public ConfigurationManagerClientEnabledFeatures getConfigurationManagerClientEnabledFeatures() {
        return this.configurationManagerClientEnabledFeatures;
    }
    /**
     * Gets the configurationManagerClientHealthState property value. Configuration manager client health state, valid only for devices managed by MDM/ConfigMgr Agent
     * @return a configurationManagerClientHealthState
     */
    @javax.annotation.Nullable
    public ConfigurationManagerClientHealthState getConfigurationManagerClientHealthState() {
        return this.configurationManagerClientHealthState;
    }
    /**
     * Gets the configurationManagerClientInformation property value. Configuration manager client information, valid only for devices managed, duel-managed or tri-managed by ConfigMgr Agent
     * @return a configurationManagerClientInformation
     */
    @javax.annotation.Nullable
    public ConfigurationManagerClientInformation getConfigurationManagerClientInformation() {
        return this.configurationManagerClientInformation;
    }
    /**
     * Gets the detectedApps property value. All applications currently installed on the device
     * @return a detectedApp
     */
    @javax.annotation.Nullable
    public java.util.List<DetectedApp> getDetectedApps() {
        return this.detectedApps;
    }
    /**
     * Gets the deviceActionResults property value. List of ComplexType deviceActionResult objects. This property is read-only.
     * @return a deviceActionResult
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceActionResult> getDeviceActionResults() {
        return this.deviceActionResults;
    }
    /**
     * Gets the deviceCategory property value. Device category
     * @return a deviceCategory
     */
    @javax.annotation.Nullable
    public DeviceCategory getDeviceCategory() {
        return this.deviceCategory;
    }
    /**
     * Gets the deviceCategoryDisplayName property value. Device category display name. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceCategoryDisplayName() {
        return this.deviceCategoryDisplayName;
    }
    /**
     * Gets the deviceCompliancePolicyStates property value. Device compliance policy states for this device.
     * @return a deviceCompliancePolicyState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCompliancePolicyState> getDeviceCompliancePolicyStates() {
        return this.deviceCompliancePolicyStates;
    }
    /**
     * Gets the deviceConfigurationStates property value. Device configuration states for this device.
     * @return a deviceConfigurationState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationState> getDeviceConfigurationStates() {
        return this.deviceConfigurationStates;
    }
    /**
     * Gets the deviceEnrollmentType property value. Possible ways of adding a mobile device to management.
     * @return a deviceEnrollmentType
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentType getDeviceEnrollmentType() {
        return this.deviceEnrollmentType;
    }
    /**
     * Gets the deviceFirmwareConfigurationInterfaceManaged property value. Indicates whether the device is DFCI managed. When TRUE the device is DFCI managed. When FALSE, the device is not DFCI managed. The default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceFirmwareConfigurationInterfaceManaged() {
        return this.deviceFirmwareConfigurationInterfaceManaged;
    }
    /**
     * Gets the deviceHealthAttestationState property value. The device health attestation state. This property is read-only.
     * @return a deviceHealthAttestationState
     */
    @javax.annotation.Nullable
    public DeviceHealthAttestationState getDeviceHealthAttestationState() {
        return this.deviceHealthAttestationState;
    }
    /**
     * Gets the deviceHealthScriptStates property value. Results of device health scripts that ran for this device. Default is empty list. This property is read-only.
     * @return a deviceHealthScriptPolicyState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceHealthScriptPolicyState> getDeviceHealthScriptStates() {
        return this.deviceHealthScriptStates;
    }
    /**
     * Gets the deviceName property value. Name of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the deviceRegistrationState property value. Device registration status.
     * @return a deviceRegistrationState
     */
    @javax.annotation.Nullable
    public DeviceRegistrationState getDeviceRegistrationState() {
        return this.deviceRegistrationState;
    }
    /**
     * Gets the deviceType property value. Device type.
     * @return a deviceType
     */
    @javax.annotation.Nullable
    public DeviceType getDeviceType() {
        return this.deviceType;
    }
    /**
     * Gets the easActivated property value. Whether the device is Exchange ActiveSync activated. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEasActivated() {
        return this.easActivated;
    }
    /**
     * Gets the easActivationDateTime property value. Exchange ActivationSync activation time of the device. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEasActivationDateTime() {
        return this.easActivationDateTime;
    }
    /**
     * Gets the easDeviceId property value. Exchange ActiveSync Id of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEasDeviceId() {
        return this.easDeviceId;
    }
    /**
     * Gets the emailAddress property value. Email(s) for the user associated with the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * Gets the enrolledDateTime property value. Enrollment time of the device. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEnrolledDateTime() {
        return this.enrolledDateTime;
    }
    /**
     * Gets the enrollmentProfileName property value. Name of the enrollment profile assigned to the device. Default value is empty string, indicating no enrollment profile was assgined. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnrollmentProfileName() {
        return this.enrollmentProfileName;
    }
    /**
     * Gets the ethernetMacAddress property value. Indicates Ethernet MAC Address of the device. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity. Individual get call with select query options is needed to retrieve actual values. Example: deviceManagement/managedDevices({managedDeviceId})?$select=ethernetMacAddress Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEthernetMacAddress() {
        return this.ethernetMacAddress;
    }
    /**
     * Gets the exchangeAccessState property value. Device Exchange Access State.
     * @return a deviceManagementExchangeAccessState
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeAccessState getExchangeAccessState() {
        return this.exchangeAccessState;
    }
    /**
     * Gets the exchangeAccessStateReason property value. Device Exchange Access State Reason.
     * @return a deviceManagementExchangeAccessStateReason
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeAccessStateReason getExchangeAccessStateReason() {
        return this.exchangeAccessStateReason;
    }
    /**
     * Gets the exchangeLastSuccessfulSyncDateTime property value. Last time the device contacted Exchange. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExchangeLastSuccessfulSyncDateTime() {
        return this.exchangeLastSuccessfulSyncDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
        deserializerMap.put("chassisType", (n) -> { this.setChassisType(n.getEnumValue(ChassisType.class)); });
        deserializerMap.put("chromeOSDeviceInfo", (n) -> { this.setChromeOSDeviceInfo(n.getCollectionOfObjectValues(ChromeOSDeviceProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPcRemoteActionResults", (n) -> { this.setCloudPcRemoteActionResults(n.getCollectionOfObjectValues(CloudPcRemoteActionResult::createFromDiscriminatorValue)); });
        deserializerMap.put("complianceGracePeriodExpirationDateTime", (n) -> { this.setComplianceGracePeriodExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("complianceState", (n) -> { this.setComplianceState(n.getEnumValue(ComplianceState.class)); });
        deserializerMap.put("configurationManagerClientEnabledFeatures", (n) -> { this.setConfigurationManagerClientEnabledFeatures(n.getObjectValue(ConfigurationManagerClientEnabledFeatures::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationManagerClientHealthState", (n) -> { this.setConfigurationManagerClientHealthState(n.getObjectValue(ConfigurationManagerClientHealthState::createFromDiscriminatorValue)); });
        deserializerMap.put("configurationManagerClientInformation", (n) -> { this.setConfigurationManagerClientInformation(n.getObjectValue(ConfigurationManagerClientInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("detectedApps", (n) -> { this.setDetectedApps(n.getCollectionOfObjectValues(DetectedApp::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceActionResults", (n) -> { this.setDeviceActionResults(n.getCollectionOfObjectValues(DeviceActionResult::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCategory", (n) -> { this.setDeviceCategory(n.getObjectValue(DeviceCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceCategoryDisplayName", (n) -> { this.setDeviceCategoryDisplayName(n.getStringValue()); });
        deserializerMap.put("deviceCompliancePolicyStates", (n) -> { this.setDeviceCompliancePolicyStates(n.getCollectionOfObjectValues(DeviceCompliancePolicyState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceConfigurationStates", (n) -> { this.setDeviceConfigurationStates(n.getCollectionOfObjectValues(DeviceConfigurationState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceEnrollmentType", (n) -> { this.setDeviceEnrollmentType(n.getEnumValue(DeviceEnrollmentType.class)); });
        deserializerMap.put("deviceFirmwareConfigurationInterfaceManaged", (n) -> { this.setDeviceFirmwareConfigurationInterfaceManaged(n.getBooleanValue()); });
        deserializerMap.put("deviceHealthAttestationState", (n) -> { this.setDeviceHealthAttestationState(n.getObjectValue(DeviceHealthAttestationState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceHealthScriptStates", (n) -> { this.setDeviceHealthScriptStates(n.getCollectionOfObjectValues(DeviceHealthScriptPolicyState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceRegistrationState", (n) -> { this.setDeviceRegistrationState(n.getEnumValue(DeviceRegistrationState.class)); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getEnumValue(DeviceType.class)); });
        deserializerMap.put("easActivated", (n) -> { this.setEasActivated(n.getBooleanValue()); });
        deserializerMap.put("easActivationDateTime", (n) -> { this.setEasActivationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("easDeviceId", (n) -> { this.setEasDeviceId(n.getStringValue()); });
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("enrolledDateTime", (n) -> { this.setEnrolledDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("enrollmentProfileName", (n) -> { this.setEnrollmentProfileName(n.getStringValue()); });
        deserializerMap.put("ethernetMacAddress", (n) -> { this.setEthernetMacAddress(n.getStringValue()); });
        deserializerMap.put("exchangeAccessState", (n) -> { this.setExchangeAccessState(n.getEnumValue(DeviceManagementExchangeAccessState.class)); });
        deserializerMap.put("exchangeAccessStateReason", (n) -> { this.setExchangeAccessStateReason(n.getEnumValue(DeviceManagementExchangeAccessStateReason.class)); });
        deserializerMap.put("exchangeLastSuccessfulSyncDateTime", (n) -> { this.setExchangeLastSuccessfulSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("freeStorageSpaceInBytes", (n) -> { this.setFreeStorageSpaceInBytes(n.getLongValue()); });
        deserializerMap.put("hardwareInformation", (n) -> { this.setHardwareInformation(n.getObjectValue(HardwareInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("iccid", (n) -> { this.setIccid(n.getStringValue()); });
        deserializerMap.put("imei", (n) -> { this.setImei(n.getStringValue()); });
        deserializerMap.put("isEncrypted", (n) -> { this.setIsEncrypted(n.getBooleanValue()); });
        deserializerMap.put("isSupervised", (n) -> { this.setIsSupervised(n.getBooleanValue()); });
        deserializerMap.put("jailBroken", (n) -> { this.setJailBroken(n.getStringValue()); });
        deserializerMap.put("joinType", (n) -> { this.setJoinType(n.getEnumValue(JoinType.class)); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("logCollectionRequests", (n) -> { this.setLogCollectionRequests(n.getCollectionOfObjectValues(DeviceLogCollectionResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("lostModeState", (n) -> { this.setLostModeState(n.getEnumValue(LostModeState.class)); });
        deserializerMap.put("managedDeviceMobileAppConfigurationStates", (n) -> { this.setManagedDeviceMobileAppConfigurationStates(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfigurationState::createFromDiscriminatorValue)); });
        deserializerMap.put("managedDeviceName", (n) -> { this.setManagedDeviceName(n.getStringValue()); });
        deserializerMap.put("managedDeviceOwnerType", (n) -> { this.setManagedDeviceOwnerType(n.getEnumValue(ManagedDeviceOwnerType.class)); });
        deserializerMap.put("managementAgent", (n) -> { this.setManagementAgent(n.getEnumValue(ManagementAgentType.class)); });
        deserializerMap.put("managementCertificateExpirationDate", (n) -> { this.setManagementCertificateExpirationDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managementFeatures", (n) -> { this.setManagementFeatures(n.getEnumValue(ManagedDeviceManagementFeatures.class)); });
        deserializerMap.put("managementState", (n) -> { this.setManagementState(n.getEnumValue(ManagementState.class)); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("meid", (n) -> { this.setMeid(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("operatingSystem", (n) -> { this.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("ownerType", (n) -> { this.setOwnerType(n.getEnumValue(OwnerType.class)); });
        deserializerMap.put("partnerReportedThreatState", (n) -> { this.setPartnerReportedThreatState(n.getEnumValue(ManagedDevicePartnerReportedHealthState.class)); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("physicalMemoryInBytes", (n) -> { this.setPhysicalMemoryInBytes(n.getLongValue()); });
        deserializerMap.put("preferMdmOverGroupPolicyAppliedDateTime", (n) -> { this.setPreferMdmOverGroupPolicyAppliedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("processorArchitecture", (n) -> { this.setProcessorArchitecture(n.getEnumValue(ManagedDeviceArchitecture.class)); });
        deserializerMap.put("remoteAssistanceSessionErrorDetails", (n) -> { this.setRemoteAssistanceSessionErrorDetails(n.getStringValue()); });
        deserializerMap.put("remoteAssistanceSessionUrl", (n) -> { this.setRemoteAssistanceSessionUrl(n.getStringValue()); });
        deserializerMap.put("requireUserEnrollmentApproval", (n) -> { this.setRequireUserEnrollmentApproval(n.getBooleanValue()); });
        deserializerMap.put("retireAfterDateTime", (n) -> { this.setRetireAfterDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("securityBaselineStates", (n) -> { this.setSecurityBaselineStates(n.getCollectionOfObjectValues(SecurityBaselineState::createFromDiscriminatorValue)); });
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
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getFreeStorageSpaceInBytes() {
        return this.freeStorageSpaceInBytes;
    }
    /**
     * Gets the hardwareInformation property value. The hardward details for the device.  Includes information such as storage space, manufacturer, serial number, etc. Return default value in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a hardwareInformation
     */
    @javax.annotation.Nullable
    public HardwareInformation getHardwareInformation() {
        return this.hardwareInformation;
    }
    /**
     * Gets the iccid property value. Integrated Circuit Card Identifier, it is A SIM card's unique identification number. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIccid() {
        return this.iccid;
    }
    /**
     * Gets the imei property value. IMEI. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImei() {
        return this.imei;
    }
    /**
     * Gets the isEncrypted property value. Device encryption status. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEncrypted() {
        return this.isEncrypted;
    }
    /**
     * Gets the isSupervised property value. Device supervised status. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSupervised() {
        return this.isSupervised;
    }
    /**
     * Gets the jailBroken property value. whether the device is jail broken or rooted. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJailBroken() {
        return this.jailBroken;
    }
    /**
     * Gets the joinType property value. Device enrollment join type.
     * @return a joinType
     */
    @javax.annotation.Nullable
    public JoinType getJoinType() {
        return this.joinType;
    }
    /**
     * Gets the lastSyncDateTime property value. The date and time that the device last completed a successful sync with Intune. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.lastSyncDateTime;
    }
    /**
     * Gets the logCollectionRequests property value. List of log collection requests
     * @return a deviceLogCollectionResponse
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceLogCollectionResponse> getLogCollectionRequests() {
        return this.logCollectionRequests;
    }
    /**
     * Gets the lostModeState property value. State of lost mode, indicating if lost mode is enabled or disabled
     * @return a lostModeState
     */
    @javax.annotation.Nullable
    public LostModeState getLostModeState() {
        return this.lostModeState;
    }
    /**
     * Gets the managedDeviceMobileAppConfigurationStates property value. Managed device mobile app configuration states for this device.
     * @return a managedDeviceMobileAppConfigurationState
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfigurationState> getManagedDeviceMobileAppConfigurationStates() {
        return this.managedDeviceMobileAppConfigurationStates;
    }
    /**
     * Gets the managedDeviceName property value. Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceName() {
        return this.managedDeviceName;
    }
    /**
     * Gets the managedDeviceOwnerType property value. Owner type of device.
     * @return a managedDeviceOwnerType
     */
    @javax.annotation.Nullable
    public ManagedDeviceOwnerType getManagedDeviceOwnerType() {
        return this.managedDeviceOwnerType;
    }
    /**
     * Gets the managementAgent property value. Management agent type.
     * @return a managementAgentType
     */
    @javax.annotation.Nullable
    public ManagementAgentType getManagementAgent() {
        return this.managementAgent;
    }
    /**
     * Gets the managementCertificateExpirationDate property value. Reports device management certificate expiration date. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getManagementCertificateExpirationDate() {
        return this.managementCertificateExpirationDate;
    }
    /**
     * Gets the managementFeatures property value. Device management features.
     * @return a managedDeviceManagementFeatures
     */
    @javax.annotation.Nullable
    public ManagedDeviceManagementFeatures getManagementFeatures() {
        return this.managementFeatures;
    }
    /**
     * Gets the managementState property value. Management state of device in Microsoft Intune.
     * @return a managementState
     */
    @javax.annotation.Nullable
    public ManagementState getManagementState() {
        return this.managementState;
    }
    /**
     * Gets the manufacturer property value. Manufacturer of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the meid property value. MEID. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMeid() {
        return this.meid;
    }
    /**
     * Gets the model property value. Model of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the notes property value. Notes on the device created by IT Admin. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select.  $Search is not supported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the operatingSystem property value. Operating system of the device. Windows, iOS, etc. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    /**
     * Gets the osVersion property value. Operating system version of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the ownerType property value. Owner type of device.
     * @return a ownerType
     */
    @javax.annotation.Nullable
    public OwnerType getOwnerType() {
        return this.ownerType;
    }
    /**
     * Gets the partnerReportedThreatState property value. Available health states for the Device Health API
     * @return a managedDevicePartnerReportedHealthState
     */
    @javax.annotation.Nullable
    public ManagedDevicePartnerReportedHealthState getPartnerReportedThreatState() {
        return this.partnerReportedThreatState;
    }
    /**
     * Gets the phoneNumber property value. Phone number of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the physicalMemoryInBytes property value. Total Memory in Bytes. Return default value 0 in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. Default value is 0. Read-only. This property is read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getPhysicalMemoryInBytes() {
        return this.physicalMemoryInBytes;
    }
    /**
     * Gets the preferMdmOverGroupPolicyAppliedDateTime property value. Reports the DateTime the preferMdmOverGroupPolicy setting was set.  When set, the Intune MDM settings will override Group Policy settings if there is a conflict. Read Only. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPreferMdmOverGroupPolicyAppliedDateTime() {
        return this.preferMdmOverGroupPolicyAppliedDateTime;
    }
    /**
     * Gets the processorArchitecture property value. Processor architecture
     * @return a managedDeviceArchitecture
     */
    @javax.annotation.Nullable
    public ManagedDeviceArchitecture getProcessorArchitecture() {
        return this.processorArchitecture;
    }
    /**
     * Gets the remoteAssistanceSessionErrorDetails property value. An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemoteAssistanceSessionErrorDetails() {
        return this.remoteAssistanceSessionErrorDetails;
    }
    /**
     * Gets the remoteAssistanceSessionUrl property value. Url that allows a Remote Assistance session to be established with the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemoteAssistanceSessionUrl() {
        return this.remoteAssistanceSessionUrl;
    }
    /**
     * Gets the requireUserEnrollmentApproval property value. Reports if the managed iOS device is user approval enrollment. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireUserEnrollmentApproval() {
        return this.requireUserEnrollmentApproval;
    }
    /**
     * Gets the retireAfterDateTime property value. Indicates the time after when a device will be auto retired because of scheduled action. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRetireAfterDateTime() {
        return this.retireAfterDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tag IDs for this Device instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
    }
    /**
     * Gets the securityBaselineStates property value. Security baseline states for this device.
     * @return a securityBaselineState
     */
    @javax.annotation.Nullable
    public java.util.List<SecurityBaselineState> getSecurityBaselineStates() {
        return this.securityBaselineStates;
    }
    /**
     * Gets the serialNumber property value. SerialNumber. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * Gets the skuFamily property value. Device sku family
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuFamily() {
        return this.skuFamily;
    }
    /**
     * Gets the skuNumber property value. Device sku number, see also: https://learn.microsoft.com/windows/win32/api/sysinfoapi/nf-sysinfoapi-getproductinfo. Valid values 0 to 2147483647. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSkuNumber() {
        return this.skuNumber;
    }
    /**
     * Gets the specificationVersion property value. Specification version. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSpecificationVersion() {
        return this.specificationVersion;
    }
    /**
     * Gets the subscriberCarrier property value. Subscriber Carrier. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriberCarrier() {
        return this.subscriberCarrier;
    }
    /**
     * Gets the totalStorageSpaceInBytes property value. Total Storage in Bytes. This property is read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotalStorageSpaceInBytes() {
        return this.totalStorageSpaceInBytes;
    }
    /**
     * Gets the udid property value. Unique Device Identifier for iOS and macOS devices. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUdid() {
        return this.udid;
    }
    /**
     * Gets the userDisplayName property value. User display name. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this.userDisplayName;
    }
    /**
     * Gets the userId property value. Unique Identifier for the user associated with the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userPrincipalName property value. Device user principal name. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Gets the users property value. The primary users associated with the managed device.
     * @return a user
     */
    @javax.annotation.Nullable
    public java.util.List<User> getUsers() {
        return this.users;
    }
    /**
     * Gets the usersLoggedOn property value. Indicates the last logged on users of a device. This property is read-only.
     * @return a loggedOnUser
     */
    @javax.annotation.Nullable
    public java.util.List<LoggedOnUser> getUsersLoggedOn() {
        return this.usersLoggedOn;
    }
    /**
     * Gets the wiFiMacAddress property value. Wi-Fi MAC. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWiFiMacAddress() {
        return this.wiFiMacAddress;
    }
    /**
     * Gets the windowsActiveMalwareCount property value. Count of active malware for this windows device. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWindowsActiveMalwareCount() {
        return this.windowsActiveMalwareCount;
    }
    /**
     * Gets the windowsProtectionState property value. The device protection status. This property is read-only.
     * @return a windowsProtectionState
     */
    @javax.annotation.Nullable
    public WindowsProtectionState getWindowsProtectionState() {
        return this.windowsProtectionState;
    }
    /**
     * Gets the windowsRemediatedMalwareCount property value. Count of remediated malware for this windows device. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWindowsRemediatedMalwareCount() {
        return this.windowsRemediatedMalwareCount;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAadRegistered(@javax.annotation.Nullable final Boolean value) {
        this.aadRegistered = value;
    }
    /**
     * Sets the activationLockBypassCode property value. The code that allows the Activation Lock on managed device to be bypassed. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity in LIST call. Individual GET call with select query options is needed to retrieve actual values. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the activationLockBypassCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivationLockBypassCode(@javax.annotation.Nullable final String value) {
        this.activationLockBypassCode = value;
    }
    /**
     * Sets the androidSecurityPatchLevel property value. Android security patch level. This property is read-only.
     * @param value Value to set for the androidSecurityPatchLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidSecurityPatchLevel(@javax.annotation.Nullable final String value) {
        this.androidSecurityPatchLevel = value;
    }
    /**
     * Sets the assignmentFilterEvaluationStatusDetails property value. Managed device mobile app configuration states for this device.
     * @param value Value to set for the assignmentFilterEvaluationStatusDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentFilterEvaluationStatusDetails(@javax.annotation.Nullable final java.util.List<AssignmentFilterEvaluationStatusDetails> value) {
        this.assignmentFilterEvaluationStatusDetails = value;
    }
    /**
     * Sets the autopilotEnrolled property value. Reports if the managed device is enrolled via auto-pilot. This property is read-only.
     * @param value Value to set for the autopilotEnrolled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutopilotEnrolled(@javax.annotation.Nullable final Boolean value) {
        this.autopilotEnrolled = value;
    }
    /**
     * Sets the azureActiveDirectoryDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @param value Value to set for the azureActiveDirectoryDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureActiveDirectoryDeviceId(@javax.annotation.Nullable final String value) {
        this.azureActiveDirectoryDeviceId = value;
    }
    /**
     * Sets the azureADDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @param value Value to set for the azureADDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureADDeviceId(@javax.annotation.Nullable final String value) {
        this.azureADDeviceId = value;
    }
    /**
     * Sets the azureADRegistered property value. Whether the device is Azure Active Directory registered. This property is read-only.
     * @param value Value to set for the azureADRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureADRegistered(@javax.annotation.Nullable final Boolean value) {
        this.azureADRegistered = value;
    }
    /**
     * Sets the bootstrapTokenEscrowed property value. Reports if the managed device has an escrowed Bootstrap Token. This is only for macOS devices. To get, include BootstrapTokenEscrowed in the select clause and query with a device id. If FALSE, no bootstrap token is escrowed. If TRUE, the device has escrowed a bootstrap token with Intune. This property is read-only.
     * @param value Value to set for the bootstrapTokenEscrowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBootstrapTokenEscrowed(@javax.annotation.Nullable final Boolean value) {
        this.bootstrapTokenEscrowed = value;
    }
    /**
     * Sets the chassisType property value. Chassis type.
     * @param value Value to set for the chassisType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChassisType(@javax.annotation.Nullable final ChassisType value) {
        this.chassisType = value;
    }
    /**
     * Sets the chromeOSDeviceInfo property value. List of properties of the ChromeOS Device.
     * @param value Value to set for the chromeOSDeviceInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChromeOSDeviceInfo(@javax.annotation.Nullable final java.util.List<ChromeOSDeviceProperty> value) {
        this.chromeOSDeviceInfo = value;
    }
    /**
     * Sets the cloudPcRemoteActionResults property value. The cloudPcRemoteActionResults property
     * @param value Value to set for the cloudPcRemoteActionResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudPcRemoteActionResults(@javax.annotation.Nullable final java.util.List<CloudPcRemoteActionResult> value) {
        this.cloudPcRemoteActionResults = value;
    }
    /**
     * Sets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires. This property is read-only.
     * @param value Value to set for the complianceGracePeriodExpirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceGracePeriodExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.complianceGracePeriodExpirationDateTime = value;
    }
    /**
     * Sets the complianceState property value. Compliance state.
     * @param value Value to set for the complianceState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceState(@javax.annotation.Nullable final ComplianceState value) {
        this.complianceState = value;
    }
    /**
     * Sets the configurationManagerClientEnabledFeatures property value. ConfigrMgr client enabled features. This property is read-only.
     * @param value Value to set for the configurationManagerClientEnabledFeatures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationManagerClientEnabledFeatures(@javax.annotation.Nullable final ConfigurationManagerClientEnabledFeatures value) {
        this.configurationManagerClientEnabledFeatures = value;
    }
    /**
     * Sets the configurationManagerClientHealthState property value. Configuration manager client health state, valid only for devices managed by MDM/ConfigMgr Agent
     * @param value Value to set for the configurationManagerClientHealthState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationManagerClientHealthState(@javax.annotation.Nullable final ConfigurationManagerClientHealthState value) {
        this.configurationManagerClientHealthState = value;
    }
    /**
     * Sets the configurationManagerClientInformation property value. Configuration manager client information, valid only for devices managed, duel-managed or tri-managed by ConfigMgr Agent
     * @param value Value to set for the configurationManagerClientInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationManagerClientInformation(@javax.annotation.Nullable final ConfigurationManagerClientInformation value) {
        this.configurationManagerClientInformation = value;
    }
    /**
     * Sets the detectedApps property value. All applications currently installed on the device
     * @param value Value to set for the detectedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectedApps(@javax.annotation.Nullable final java.util.List<DetectedApp> value) {
        this.detectedApps = value;
    }
    /**
     * Sets the deviceActionResults property value. List of ComplexType deviceActionResult objects. This property is read-only.
     * @param value Value to set for the deviceActionResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceActionResults(@javax.annotation.Nullable final java.util.List<DeviceActionResult> value) {
        this.deviceActionResults = value;
    }
    /**
     * Sets the deviceCategory property value. Device category
     * @param value Value to set for the deviceCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCategory(@javax.annotation.Nullable final DeviceCategory value) {
        this.deviceCategory = value;
    }
    /**
     * Sets the deviceCategoryDisplayName property value. Device category display name. This property is read-only.
     * @param value Value to set for the deviceCategoryDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCategoryDisplayName(@javax.annotation.Nullable final String value) {
        this.deviceCategoryDisplayName = value;
    }
    /**
     * Sets the deviceCompliancePolicyStates property value. Device compliance policy states for this device.
     * @param value Value to set for the deviceCompliancePolicyStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCompliancePolicyStates(@javax.annotation.Nullable final java.util.List<DeviceCompliancePolicyState> value) {
        this.deviceCompliancePolicyStates = value;
    }
    /**
     * Sets the deviceConfigurationStates property value. Device configuration states for this device.
     * @param value Value to set for the deviceConfigurationStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfigurationStates(@javax.annotation.Nullable final java.util.List<DeviceConfigurationState> value) {
        this.deviceConfigurationStates = value;
    }
    /**
     * Sets the deviceEnrollmentType property value. Possible ways of adding a mobile device to management.
     * @param value Value to set for the deviceEnrollmentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceEnrollmentType(@javax.annotation.Nullable final DeviceEnrollmentType value) {
        this.deviceEnrollmentType = value;
    }
    /**
     * Sets the deviceFirmwareConfigurationInterfaceManaged property value. Indicates whether the device is DFCI managed. When TRUE the device is DFCI managed. When FALSE, the device is not DFCI managed. The default value is FALSE.
     * @param value Value to set for the deviceFirmwareConfigurationInterfaceManaged property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceFirmwareConfigurationInterfaceManaged(@javax.annotation.Nullable final Boolean value) {
        this.deviceFirmwareConfigurationInterfaceManaged = value;
    }
    /**
     * Sets the deviceHealthAttestationState property value. The device health attestation state. This property is read-only.
     * @param value Value to set for the deviceHealthAttestationState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceHealthAttestationState(@javax.annotation.Nullable final DeviceHealthAttestationState value) {
        this.deviceHealthAttestationState = value;
    }
    /**
     * Sets the deviceHealthScriptStates property value. Results of device health scripts that ran for this device. Default is empty list. This property is read-only.
     * @param value Value to set for the deviceHealthScriptStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceHealthScriptStates(@javax.annotation.Nullable final java.util.List<DeviceHealthScriptPolicyState> value) {
        this.deviceHealthScriptStates = value;
    }
    /**
     * Sets the deviceName property value. Name of the device. This property is read-only.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the deviceRegistrationState property value. Device registration status.
     * @param value Value to set for the deviceRegistrationState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceRegistrationState(@javax.annotation.Nullable final DeviceRegistrationState value) {
        this.deviceRegistrationState = value;
    }
    /**
     * Sets the deviceType property value. Device type.
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceType(@javax.annotation.Nullable final DeviceType value) {
        this.deviceType = value;
    }
    /**
     * Sets the easActivated property value. Whether the device is Exchange ActiveSync activated. This property is read-only.
     * @param value Value to set for the easActivated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEasActivated(@javax.annotation.Nullable final Boolean value) {
        this.easActivated = value;
    }
    /**
     * Sets the easActivationDateTime property value. Exchange ActivationSync activation time of the device. This property is read-only.
     * @param value Value to set for the easActivationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEasActivationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.easActivationDateTime = value;
    }
    /**
     * Sets the easDeviceId property value. Exchange ActiveSync Id of the device. This property is read-only.
     * @param value Value to set for the easDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEasDeviceId(@javax.annotation.Nullable final String value) {
        this.easDeviceId = value;
    }
    /**
     * Sets the emailAddress property value. Email(s) for the user associated with the device. This property is read-only.
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailAddress(@javax.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the enrolledDateTime property value. Enrollment time of the device. This property is read-only.
     * @param value Value to set for the enrolledDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrolledDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.enrolledDateTime = value;
    }
    /**
     * Sets the enrollmentProfileName property value. Name of the enrollment profile assigned to the device. Default value is empty string, indicating no enrollment profile was assgined. This property is read-only.
     * @param value Value to set for the enrollmentProfileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentProfileName(@javax.annotation.Nullable final String value) {
        this.enrollmentProfileName = value;
    }
    /**
     * Sets the ethernetMacAddress property value. Indicates Ethernet MAC Address of the device. Default, is Null (Non-Default property) for this property when returned as part of managedDevice entity. Individual get call with select query options is needed to retrieve actual values. Example: deviceManagement/managedDevices({managedDeviceId})?$select=ethernetMacAddress Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the ethernetMacAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEthernetMacAddress(@javax.annotation.Nullable final String value) {
        this.ethernetMacAddress = value;
    }
    /**
     * Sets the exchangeAccessState property value. Device Exchange Access State.
     * @param value Value to set for the exchangeAccessState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeAccessState(@javax.annotation.Nullable final DeviceManagementExchangeAccessState value) {
        this.exchangeAccessState = value;
    }
    /**
     * Sets the exchangeAccessStateReason property value. Device Exchange Access State Reason.
     * @param value Value to set for the exchangeAccessStateReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeAccessStateReason(@javax.annotation.Nullable final DeviceManagementExchangeAccessStateReason value) {
        this.exchangeAccessStateReason = value;
    }
    /**
     * Sets the exchangeLastSuccessfulSyncDateTime property value. Last time the device contacted Exchange. This property is read-only.
     * @param value Value to set for the exchangeLastSuccessfulSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeLastSuccessfulSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.exchangeLastSuccessfulSyncDateTime = value;
    }
    /**
     * Sets the freeStorageSpaceInBytes property value. Free Storage in Bytes. Default value is 0. Read-only. This property is read-only.
     * @param value Value to set for the freeStorageSpaceInBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFreeStorageSpaceInBytes(@javax.annotation.Nullable final Long value) {
        this.freeStorageSpaceInBytes = value;
    }
    /**
     * Sets the hardwareInformation property value. The hardward details for the device.  Includes information such as storage space, manufacturer, serial number, etc. Return default value in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the hardwareInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHardwareInformation(@javax.annotation.Nullable final HardwareInformation value) {
        this.hardwareInformation = value;
    }
    /**
     * Sets the iccid property value. Integrated Circuit Card Identifier, it is A SIM card's unique identification number. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the iccid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIccid(@javax.annotation.Nullable final String value) {
        this.iccid = value;
    }
    /**
     * Sets the imei property value. IMEI. This property is read-only.
     * @param value Value to set for the imei property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImei(@javax.annotation.Nullable final String value) {
        this.imei = value;
    }
    /**
     * Sets the isEncrypted property value. Device encryption status. This property is read-only.
     * @param value Value to set for the isEncrypted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEncrypted(@javax.annotation.Nullable final Boolean value) {
        this.isEncrypted = value;
    }
    /**
     * Sets the isSupervised property value. Device supervised status. This property is read-only.
     * @param value Value to set for the isSupervised property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSupervised(@javax.annotation.Nullable final Boolean value) {
        this.isSupervised = value;
    }
    /**
     * Sets the jailBroken property value. whether the device is jail broken or rooted. This property is read-only.
     * @param value Value to set for the jailBroken property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJailBroken(@javax.annotation.Nullable final String value) {
        this.jailBroken = value;
    }
    /**
     * Sets the joinType property value. Device enrollment join type.
     * @param value Value to set for the joinType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinType(@javax.annotation.Nullable final JoinType value) {
        this.joinType = value;
    }
    /**
     * Sets the lastSyncDateTime property value. The date and time that the device last completed a successful sync with Intune. This property is read-only.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncDateTime = value;
    }
    /**
     * Sets the logCollectionRequests property value. List of log collection requests
     * @param value Value to set for the logCollectionRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogCollectionRequests(@javax.annotation.Nullable final java.util.List<DeviceLogCollectionResponse> value) {
        this.logCollectionRequests = value;
    }
    /**
     * Sets the lostModeState property value. State of lost mode, indicating if lost mode is enabled or disabled
     * @param value Value to set for the lostModeState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLostModeState(@javax.annotation.Nullable final LostModeState value) {
        this.lostModeState = value;
    }
    /**
     * Sets the managedDeviceMobileAppConfigurationStates property value. Managed device mobile app configuration states for this device.
     * @param value Value to set for the managedDeviceMobileAppConfigurationStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceMobileAppConfigurationStates(@javax.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfigurationState> value) {
        this.managedDeviceMobileAppConfigurationStates = value;
    }
    /**
     * Sets the managedDeviceName property value. Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     * @param value Value to set for the managedDeviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceName(@javax.annotation.Nullable final String value) {
        this.managedDeviceName = value;
    }
    /**
     * Sets the managedDeviceOwnerType property value. Owner type of device.
     * @param value Value to set for the managedDeviceOwnerType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceOwnerType(@javax.annotation.Nullable final ManagedDeviceOwnerType value) {
        this.managedDeviceOwnerType = value;
    }
    /**
     * Sets the managementAgent property value. Management agent type.
     * @param value Value to set for the managementAgent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementAgent(@javax.annotation.Nullable final ManagementAgentType value) {
        this.managementAgent = value;
    }
    /**
     * Sets the managementCertificateExpirationDate property value. Reports device management certificate expiration date. This property is read-only.
     * @param value Value to set for the managementCertificateExpirationDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementCertificateExpirationDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this.managementCertificateExpirationDate = value;
    }
    /**
     * Sets the managementFeatures property value. Device management features.
     * @param value Value to set for the managementFeatures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementFeatures(@javax.annotation.Nullable final ManagedDeviceManagementFeatures value) {
        this.managementFeatures = value;
    }
    /**
     * Sets the managementState property value. Management state of device in Microsoft Intune.
     * @param value Value to set for the managementState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementState(@javax.annotation.Nullable final ManagementState value) {
        this.managementState = value;
    }
    /**
     * Sets the manufacturer property value. Manufacturer of the device. This property is read-only.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the meid property value. MEID. This property is read-only.
     * @param value Value to set for the meid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeid(@javax.annotation.Nullable final String value) {
        this.meid = value;
    }
    /**
     * Sets the model property value. Model of the device. This property is read-only.
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the notes property value. Notes on the device created by IT Admin. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select.  $Search is not supported.
     * @param value Value to set for the notes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotes(@javax.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the operatingSystem property value. Operating system of the device. Windows, iOS, etc. This property is read-only.
     * @param value Value to set for the operatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystem(@javax.annotation.Nullable final String value) {
        this.operatingSystem = value;
    }
    /**
     * Sets the osVersion property value. Operating system version of the device. This property is read-only.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the ownerType property value. Owner type of device.
     * @param value Value to set for the ownerType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnerType(@javax.annotation.Nullable final OwnerType value) {
        this.ownerType = value;
    }
    /**
     * Sets the partnerReportedThreatState property value. Available health states for the Device Health API
     * @param value Value to set for the partnerReportedThreatState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartnerReportedThreatState(@javax.annotation.Nullable final ManagedDevicePartnerReportedHealthState value) {
        this.partnerReportedThreatState = value;
    }
    /**
     * Sets the phoneNumber property value. Phone number of the device. This property is read-only.
     * @param value Value to set for the phoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneNumber(@javax.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the physicalMemoryInBytes property value. Total Memory in Bytes. Return default value 0 in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. Default value is 0. Read-only. This property is read-only.
     * @param value Value to set for the physicalMemoryInBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhysicalMemoryInBytes(@javax.annotation.Nullable final Long value) {
        this.physicalMemoryInBytes = value;
    }
    /**
     * Sets the preferMdmOverGroupPolicyAppliedDateTime property value. Reports the DateTime the preferMdmOverGroupPolicy setting was set.  When set, the Intune MDM settings will override Group Policy settings if there is a conflict. Read Only. This property is read-only.
     * @param value Value to set for the preferMdmOverGroupPolicyAppliedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreferMdmOverGroupPolicyAppliedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.preferMdmOverGroupPolicyAppliedDateTime = value;
    }
    /**
     * Sets the processorArchitecture property value. Processor architecture
     * @param value Value to set for the processorArchitecture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessorArchitecture(@javax.annotation.Nullable final ManagedDeviceArchitecture value) {
        this.processorArchitecture = value;
    }
    /**
     * Sets the remoteAssistanceSessionErrorDetails property value. An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.
     * @param value Value to set for the remoteAssistanceSessionErrorDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteAssistanceSessionErrorDetails(@javax.annotation.Nullable final String value) {
        this.remoteAssistanceSessionErrorDetails = value;
    }
    /**
     * Sets the remoteAssistanceSessionUrl property value. Url that allows a Remote Assistance session to be established with the device. This property is read-only.
     * @param value Value to set for the remoteAssistanceSessionUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteAssistanceSessionUrl(@javax.annotation.Nullable final String value) {
        this.remoteAssistanceSessionUrl = value;
    }
    /**
     * Sets the requireUserEnrollmentApproval property value. Reports if the managed iOS device is user approval enrollment. This property is read-only.
     * @param value Value to set for the requireUserEnrollmentApproval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequireUserEnrollmentApproval(@javax.annotation.Nullable final Boolean value) {
        this.requireUserEnrollmentApproval = value;
    }
    /**
     * Sets the retireAfterDateTime property value. Indicates the time after when a device will be auto retired because of scheduled action. This property is read-only.
     * @param value Value to set for the retireAfterDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRetireAfterDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.retireAfterDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tag IDs for this Device instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
    /**
     * Sets the securityBaselineStates property value. Security baseline states for this device.
     * @param value Value to set for the securityBaselineStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityBaselineStates(@javax.annotation.Nullable final java.util.List<SecurityBaselineState> value) {
        this.securityBaselineStates = value;
    }
    /**
     * Sets the serialNumber property value. SerialNumber. This property is read-only.
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this.serialNumber = value;
    }
    /**
     * Sets the skuFamily property value. Device sku family
     * @param value Value to set for the skuFamily property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkuFamily(@javax.annotation.Nullable final String value) {
        this.skuFamily = value;
    }
    /**
     * Sets the skuNumber property value. Device sku number, see also: https://learn.microsoft.com/windows/win32/api/sysinfoapi/nf-sysinfoapi-getproductinfo. Valid values 0 to 2147483647. This property is read-only.
     * @param value Value to set for the skuNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkuNumber(@javax.annotation.Nullable final Integer value) {
        this.skuNumber = value;
    }
    /**
     * Sets the specificationVersion property value. Specification version. This property is read-only.
     * @param value Value to set for the specificationVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpecificationVersion(@javax.annotation.Nullable final String value) {
        this.specificationVersion = value;
    }
    /**
     * Sets the subscriberCarrier property value. Subscriber Carrier. This property is read-only.
     * @param value Value to set for the subscriberCarrier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriberCarrier(@javax.annotation.Nullable final String value) {
        this.subscriberCarrier = value;
    }
    /**
     * Sets the totalStorageSpaceInBytes property value. Total Storage in Bytes. This property is read-only.
     * @param value Value to set for the totalStorageSpaceInBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalStorageSpaceInBytes(@javax.annotation.Nullable final Long value) {
        this.totalStorageSpaceInBytes = value;
    }
    /**
     * Sets the udid property value. Unique Device Identifier for iOS and macOS devices. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the udid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUdid(@javax.annotation.Nullable final String value) {
        this.udid = value;
    }
    /**
     * Sets the userDisplayName property value. User display name. This property is read-only.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this.userDisplayName = value;
    }
    /**
     * Sets the userId property value. Unique Identifier for the user associated with the device. This property is read-only.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userPrincipalName property value. Device user principal name. This property is read-only.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
    /**
     * Sets the users property value. The primary users associated with the managed device.
     * @param value Value to set for the users property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsers(@javax.annotation.Nullable final java.util.List<User> value) {
        this.users = value;
    }
    /**
     * Sets the usersLoggedOn property value. Indicates the last logged on users of a device. This property is read-only.
     * @param value Value to set for the usersLoggedOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsersLoggedOn(@javax.annotation.Nullable final java.util.List<LoggedOnUser> value) {
        this.usersLoggedOn = value;
    }
    /**
     * Sets the wiFiMacAddress property value. Wi-Fi MAC. This property is read-only.
     * @param value Value to set for the wiFiMacAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiMacAddress(@javax.annotation.Nullable final String value) {
        this.wiFiMacAddress = value;
    }
    /**
     * Sets the windowsActiveMalwareCount property value. Count of active malware for this windows device. This property is read-only.
     * @param value Value to set for the windowsActiveMalwareCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsActiveMalwareCount(@javax.annotation.Nullable final Integer value) {
        this.windowsActiveMalwareCount = value;
    }
    /**
     * Sets the windowsProtectionState property value. The device protection status. This property is read-only.
     * @param value Value to set for the windowsProtectionState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsProtectionState(@javax.annotation.Nullable final WindowsProtectionState value) {
        this.windowsProtectionState = value;
    }
    /**
     * Sets the windowsRemediatedMalwareCount property value. Count of remediated malware for this windows device. This property is read-only.
     * @param value Value to set for the windowsRemediatedMalwareCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsRemediatedMalwareCount(@javax.annotation.Nullable final Integer value) {
        this.windowsRemediatedMalwareCount = value;
    }
}
