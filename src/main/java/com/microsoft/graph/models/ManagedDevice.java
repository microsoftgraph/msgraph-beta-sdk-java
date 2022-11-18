package com.microsoft.graph.models;

import com.microsoft.graph.models.WindowsManagedDevice;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedDevice extends Entity implements Parsable {
    /** Whether the device is Azure Active Directory registered. This property is read-only. */
    private Boolean _aadRegistered;
    /** Code that allows the Activation Lock on a device to be bypassed. This property is read-only. */
    private String _activationLockBypassCode;
    /** Android security patch level. This property is read-only. */
    private String _androidSecurityPatchLevel;
    /** Managed device mobile app configuration states for this device. */
    private java.util.List<AssignmentFilterEvaluationStatusDetails> _assignmentFilterEvaluationStatusDetails;
    /** Reports if the managed device is enrolled via auto-pilot. This property is read-only. */
    private Boolean _autopilotEnrolled;
    /** The unique identifier for the Azure Active Directory device. Read only. This property is read-only. */
    private String _azureActiveDirectoryDeviceId;
    /** The unique identifier for the Azure Active Directory device. Read only. This property is read-only. */
    private String _azureADDeviceId;
    /** Whether the device is Azure Active Directory registered. This property is read-only. */
    private Boolean _azureADRegistered;
    /** Reports if the managed device has an escrowed Bootstrap Token. This is only for macOS devices. To get, include BootstrapTokenEscrowed in the select clause and query with a device id. If FALSE, no bootstrap token is escrowed. If TRUE, the device has escrowed a bootstrap token with Intune. This property is read-only. */
    private Boolean _bootstrapTokenEscrowed;
    /** Chassis type. */
    private ChassisType _chassisType;
    /** List of properties of the ChromeOS Device. */
    private java.util.List<ChromeOSDeviceProperty> _chromeOSDeviceInfo;
    /** The cloudPcRemoteActionResults property */
    private java.util.List<CloudPcRemoteActionResult> _cloudPcRemoteActionResults;
    /** The DateTime when device compliance grace period expires. This property is read-only. */
    private OffsetDateTime _complianceGracePeriodExpirationDateTime;
    /** Compliance state. */
    private ComplianceState _complianceState;
    /** ConfigrMgr client enabled features. This property is read-only. */
    private ConfigurationManagerClientEnabledFeatures _configurationManagerClientEnabledFeatures;
    /** Configuration manager client health state, valid only for devices managed by MDM/ConfigMgr Agent */
    private ConfigurationManagerClientHealthState _configurationManagerClientHealthState;
    /** Configuration manager client information, valid only for devices managed, duel-managed or tri-managed by ConfigMgr Agent */
    private ConfigurationManagerClientInformation _configurationManagerClientInformation;
    /** All applications currently installed on the device */
    private java.util.List<DetectedApp> _detectedApps;
    /** List of ComplexType deviceActionResult objects. This property is read-only. */
    private java.util.List<DeviceActionResult> _deviceActionResults;
    /** Device category */
    private DeviceCategory _deviceCategory;
    /** Device category display name. This property is read-only. */
    private String _deviceCategoryDisplayName;
    /** Device compliance policy states for this device. */
    private java.util.List<DeviceCompliancePolicyState> _deviceCompliancePolicyStates;
    /** Device configuration states for this device. */
    private java.util.List<DeviceConfigurationState> _deviceConfigurationStates;
    /** Possible ways of adding a mobile device to management. */
    private DeviceEnrollmentType _deviceEnrollmentType;
    /** Indicates whether the device is DFCI managed. When TRUE the device is DFCI managed. When FALSE, the device is not DFCI managed. The default value is FALSE. */
    private Boolean _deviceFirmwareConfigurationInterfaceManaged;
    /** The device health attestation state. This property is read-only. */
    private DeviceHealthAttestationState _deviceHealthAttestationState;
    /** Name of the device. This property is read-only. */
    private String _deviceName;
    /** Device registration status. */
    private DeviceRegistrationState _deviceRegistrationState;
    /** Device type. */
    private DeviceType _deviceType;
    /** Whether the device is Exchange ActiveSync activated. This property is read-only. */
    private Boolean _easActivated;
    /** Exchange ActivationSync activation time of the device. This property is read-only. */
    private OffsetDateTime _easActivationDateTime;
    /** Exchange ActiveSync Id of the device. This property is read-only. */
    private String _easDeviceId;
    /** Email(s) for the user associated with the device. This property is read-only. */
    private String _emailAddress;
    /** Enrollment time of the device. This property is read-only. */
    private OffsetDateTime _enrolledDateTime;
    /** Name of the enrollment profile assigned to the device. Default value is empty string, indicating no enrollment profile was assgined. This property is read-only. */
    private String _enrollmentProfileName;
    /** Ethernet MAC. This property is read-only. */
    private String _ethernetMacAddress;
    /** Device Exchange Access State. */
    private DeviceManagementExchangeAccessState _exchangeAccessState;
    /** Device Exchange Access State Reason. */
    private DeviceManagementExchangeAccessStateReason _exchangeAccessStateReason;
    /** Last time the device contacted Exchange. This property is read-only. */
    private OffsetDateTime _exchangeLastSuccessfulSyncDateTime;
    /** Free Storage in Bytes. Default value is 0. Read-only. This property is read-only. */
    private Long _freeStorageSpaceInBytes;
    /** The hardward details for the device.  Includes information such as storage space, manufacturer, serial number, etc. Return default value in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only. */
    private HardwareInformation _hardwareInformation;
    /** Integrated Circuit Card Identifier, it is A SIM card's unique identification number. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only. */
    private String _iccid;
    /** IMEI. This property is read-only. */
    private String _imei;
    /** Device encryption status. This property is read-only. */
    private Boolean _isEncrypted;
    /** Device supervised status. This property is read-only. */
    private Boolean _isSupervised;
    /** whether the device is jail broken or rooted. This property is read-only. */
    private String _jailBroken;
    /** Device enrollment join type. */
    private JoinType _joinType;
    /** The date and time that the device last completed a successful sync with Intune. This property is read-only. */
    private OffsetDateTime _lastSyncDateTime;
    /** List of log collection requests */
    private java.util.List<DeviceLogCollectionResponse> _logCollectionRequests;
    /** State of lost mode, indicating if lost mode is enabled or disabled */
    private LostModeState _lostModeState;
    /** Managed device mobile app configuration states for this device. */
    private java.util.List<ManagedDeviceMobileAppConfigurationState> _managedDeviceMobileAppConfigurationStates;
    /** Automatically generated name to identify a device. Can be overwritten to a user friendly name. */
    private String _managedDeviceName;
    /** Owner type of device. */
    private ManagedDeviceOwnerType _managedDeviceOwnerType;
    /** Management agent type. */
    private ManagementAgentType _managementAgent;
    /** Reports device management certificate expiration date. This property is read-only. */
    private OffsetDateTime _managementCertificateExpirationDate;
    /** Device management features. */
    private ManagedDeviceManagementFeatures _managementFeatures;
    /** Management state of device in Microsoft Intune. */
    private ManagementState _managementState;
    /** Manufacturer of the device. This property is read-only. */
    private String _manufacturer;
    /** MEID. This property is read-only. */
    private String _meid;
    /** Model of the device. This property is read-only. */
    private String _model;
    /** Notes on the device created by IT Admin. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select.  $Search is not supported. */
    private String _notes;
    /** Operating system of the device. Windows, iOS, etc. This property is read-only. */
    private String _operatingSystem;
    /** Operating system version of the device. This property is read-only. */
    private String _osVersion;
    /** Owner type of device. */
    private OwnerType _ownerType;
    /** Available health states for the Device Health API */
    private ManagedDevicePartnerReportedHealthState _partnerReportedThreatState;
    /** Phone number of the device. This property is read-only. */
    private String _phoneNumber;
    /** Total Memory in Bytes. Return default value 0 in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. Default value is 0. Read-only. This property is read-only. */
    private Long _physicalMemoryInBytes;
    /** Reports the DateTime the preferMdmOverGroupPolicy setting was set.  When set, the Intune MDM settings will override Group Policy settings if there is a conflict. Read Only. This property is read-only. */
    private OffsetDateTime _preferMdmOverGroupPolicyAppliedDateTime;
    /** Processor architecture */
    private ManagedDeviceArchitecture _processorArchitecture;
    /** An error string that identifies issues when creating Remote Assistance session objects. This property is read-only. */
    private String _remoteAssistanceSessionErrorDetails;
    /** Url that allows a Remote Assistance session to be established with the device. This property is read-only. */
    private String _remoteAssistanceSessionUrl;
    /** Reports if the managed iOS device is user approval enrollment. This property is read-only. */
    private Boolean _requireUserEnrollmentApproval;
    /** Indicates the time after when a device will be auto retired because of scheduled action. This property is read-only. */
    private OffsetDateTime _retireAfterDateTime;
    /** List of Scope Tag IDs for this Device instance. */
    private java.util.List<String> _roleScopeTagIds;
    /** Security baseline states for this device. */
    private java.util.List<SecurityBaselineState> _securityBaselineStates;
    /** SerialNumber. This property is read-only. */
    private String _serialNumber;
    /** Device sku family */
    private String _skuFamily;
    /** Device sku number, see also: https://learn.microsoft.com/windows/win32/api/sysinfoapi/nf-sysinfoapi-getproductinfo. Valid values 0 to 2147483647. This property is read-only. */
    private Integer _skuNumber;
    /** Specification version. This property is read-only. */
    private String _specificationVersion;
    /** Subscriber Carrier. This property is read-only. */
    private String _subscriberCarrier;
    /** Total Storage in Bytes. This property is read-only. */
    private Long _totalStorageSpaceInBytes;
    /** Unique Device Identifier for iOS and macOS devices. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only. */
    private String _udid;
    /** User display name. This property is read-only. */
    private String _userDisplayName;
    /** Unique Identifier for the user associated with the device. This property is read-only. */
    private String _userId;
    /** Device user principal name. This property is read-only. */
    private String _userPrincipalName;
    /** The primary users associated with the managed device. */
    private java.util.List<User> _users;
    /** Indicates the last logged on users of a device. This property is read-only. */
    private java.util.List<LoggedOnUser> _usersLoggedOn;
    /** Wi-Fi MAC. This property is read-only. */
    private String _wiFiMacAddress;
    /** Count of active malware for this windows device. This property is read-only. */
    private Integer _windowsActiveMalwareCount;
    /** The device protection status. This property is read-only. */
    private WindowsProtectionState _windowsProtectionState;
    /** Count of remediated malware for this windows device. This property is read-only. */
    private Integer _windowsRemediatedMalwareCount;
    /**
     * Instantiates a new managedDevice and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedDevice() {
        super();
        this.setOdataType("#microsoft.graph.managedDevice");
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
        return this._aadRegistered;
    }
    /**
     * Gets the activationLockBypassCode property value. Code that allows the Activation Lock on a device to be bypassed. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActivationLockBypassCode() {
        return this._activationLockBypassCode;
    }
    /**
     * Gets the androidSecurityPatchLevel property value. Android security patch level. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAndroidSecurityPatchLevel() {
        return this._androidSecurityPatchLevel;
    }
    /**
     * Gets the assignmentFilterEvaluationStatusDetails property value. Managed device mobile app configuration states for this device.
     * @return a assignmentFilterEvaluationStatusDetails
     */
    @javax.annotation.Nullable
    public java.util.List<AssignmentFilterEvaluationStatusDetails> getAssignmentFilterEvaluationStatusDetails() {
        return this._assignmentFilterEvaluationStatusDetails;
    }
    /**
     * Gets the autopilotEnrolled property value. Reports if the managed device is enrolled via auto-pilot. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutopilotEnrolled() {
        return this._autopilotEnrolled;
    }
    /**
     * Gets the azureActiveDirectoryDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureActiveDirectoryDeviceId() {
        return this._azureActiveDirectoryDeviceId;
    }
    /**
     * Gets the azureADDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureADDeviceId() {
        return this._azureADDeviceId;
    }
    /**
     * Gets the azureADRegistered property value. Whether the device is Azure Active Directory registered. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAzureADRegistered() {
        return this._azureADRegistered;
    }
    /**
     * Gets the bootstrapTokenEscrowed property value. Reports if the managed device has an escrowed Bootstrap Token. This is only for macOS devices. To get, include BootstrapTokenEscrowed in the select clause and query with a device id. If FALSE, no bootstrap token is escrowed. If TRUE, the device has escrowed a bootstrap token with Intune. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBootstrapTokenEscrowed() {
        return this._bootstrapTokenEscrowed;
    }
    /**
     * Gets the chassisType property value. Chassis type.
     * @return a chassisType
     */
    @javax.annotation.Nullable
    public ChassisType getChassisType() {
        return this._chassisType;
    }
    /**
     * Gets the chromeOSDeviceInfo property value. List of properties of the ChromeOS Device.
     * @return a chromeOSDeviceProperty
     */
    @javax.annotation.Nullable
    public java.util.List<ChromeOSDeviceProperty> getChromeOSDeviceInfo() {
        return this._chromeOSDeviceInfo;
    }
    /**
     * Gets the cloudPcRemoteActionResults property value. The cloudPcRemoteActionResults property
     * @return a cloudPcRemoteActionResult
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcRemoteActionResult> getCloudPcRemoteActionResults() {
        return this._cloudPcRemoteActionResults;
    }
    /**
     * Gets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getComplianceGracePeriodExpirationDateTime() {
        return this._complianceGracePeriodExpirationDateTime;
    }
    /**
     * Gets the complianceState property value. Compliance state.
     * @return a complianceState
     */
    @javax.annotation.Nullable
    public ComplianceState getComplianceState() {
        return this._complianceState;
    }
    /**
     * Gets the configurationManagerClientEnabledFeatures property value. ConfigrMgr client enabled features. This property is read-only.
     * @return a configurationManagerClientEnabledFeatures
     */
    @javax.annotation.Nullable
    public ConfigurationManagerClientEnabledFeatures getConfigurationManagerClientEnabledFeatures() {
        return this._configurationManagerClientEnabledFeatures;
    }
    /**
     * Gets the configurationManagerClientHealthState property value. Configuration manager client health state, valid only for devices managed by MDM/ConfigMgr Agent
     * @return a configurationManagerClientHealthState
     */
    @javax.annotation.Nullable
    public ConfigurationManagerClientHealthState getConfigurationManagerClientHealthState() {
        return this._configurationManagerClientHealthState;
    }
    /**
     * Gets the configurationManagerClientInformation property value. Configuration manager client information, valid only for devices managed, duel-managed or tri-managed by ConfigMgr Agent
     * @return a configurationManagerClientInformation
     */
    @javax.annotation.Nullable
    public ConfigurationManagerClientInformation getConfigurationManagerClientInformation() {
        return this._configurationManagerClientInformation;
    }
    /**
     * Gets the detectedApps property value. All applications currently installed on the device
     * @return a detectedApp
     */
    @javax.annotation.Nullable
    public java.util.List<DetectedApp> getDetectedApps() {
        return this._detectedApps;
    }
    /**
     * Gets the deviceActionResults property value. List of ComplexType deviceActionResult objects. This property is read-only.
     * @return a deviceActionResult
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceActionResult> getDeviceActionResults() {
        return this._deviceActionResults;
    }
    /**
     * Gets the deviceCategory property value. Device category
     * @return a deviceCategory
     */
    @javax.annotation.Nullable
    public DeviceCategory getDeviceCategory() {
        return this._deviceCategory;
    }
    /**
     * Gets the deviceCategoryDisplayName property value. Device category display name. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceCategoryDisplayName() {
        return this._deviceCategoryDisplayName;
    }
    /**
     * Gets the deviceCompliancePolicyStates property value. Device compliance policy states for this device.
     * @return a deviceCompliancePolicyState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceCompliancePolicyState> getDeviceCompliancePolicyStates() {
        return this._deviceCompliancePolicyStates;
    }
    /**
     * Gets the deviceConfigurationStates property value. Device configuration states for this device.
     * @return a deviceConfigurationState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationState> getDeviceConfigurationStates() {
        return this._deviceConfigurationStates;
    }
    /**
     * Gets the deviceEnrollmentType property value. Possible ways of adding a mobile device to management.
     * @return a deviceEnrollmentType
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentType getDeviceEnrollmentType() {
        return this._deviceEnrollmentType;
    }
    /**
     * Gets the deviceFirmwareConfigurationInterfaceManaged property value. Indicates whether the device is DFCI managed. When TRUE the device is DFCI managed. When FALSE, the device is not DFCI managed. The default value is FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceFirmwareConfigurationInterfaceManaged() {
        return this._deviceFirmwareConfigurationInterfaceManaged;
    }
    /**
     * Gets the deviceHealthAttestationState property value. The device health attestation state. This property is read-only.
     * @return a deviceHealthAttestationState
     */
    @javax.annotation.Nullable
    public DeviceHealthAttestationState getDeviceHealthAttestationState() {
        return this._deviceHealthAttestationState;
    }
    /**
     * Gets the deviceName property value. Name of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the deviceRegistrationState property value. Device registration status.
     * @return a deviceRegistrationState
     */
    @javax.annotation.Nullable
    public DeviceRegistrationState getDeviceRegistrationState() {
        return this._deviceRegistrationState;
    }
    /**
     * Gets the deviceType property value. Device type.
     * @return a deviceType
     */
    @javax.annotation.Nullable
    public DeviceType getDeviceType() {
        return this._deviceType;
    }
    /**
     * Gets the easActivated property value. Whether the device is Exchange ActiveSync activated. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEasActivated() {
        return this._easActivated;
    }
    /**
     * Gets the easActivationDateTime property value. Exchange ActivationSync activation time of the device. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEasActivationDateTime() {
        return this._easActivationDateTime;
    }
    /**
     * Gets the easDeviceId property value. Exchange ActiveSync Id of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEasDeviceId() {
        return this._easDeviceId;
    }
    /**
     * Gets the emailAddress property value. Email(s) for the user associated with the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailAddress() {
        return this._emailAddress;
    }
    /**
     * Gets the enrolledDateTime property value. Enrollment time of the device. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEnrolledDateTime() {
        return this._enrolledDateTime;
    }
    /**
     * Gets the enrollmentProfileName property value. Name of the enrollment profile assigned to the device. Default value is empty string, indicating no enrollment profile was assgined. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnrollmentProfileName() {
        return this._enrollmentProfileName;
    }
    /**
     * Gets the ethernetMacAddress property value. Ethernet MAC. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEthernetMacAddress() {
        return this._ethernetMacAddress;
    }
    /**
     * Gets the exchangeAccessState property value. Device Exchange Access State.
     * @return a deviceManagementExchangeAccessState
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeAccessState getExchangeAccessState() {
        return this._exchangeAccessState;
    }
    /**
     * Gets the exchangeAccessStateReason property value. Device Exchange Access State Reason.
     * @return a deviceManagementExchangeAccessStateReason
     */
    @javax.annotation.Nullable
    public DeviceManagementExchangeAccessStateReason getExchangeAccessStateReason() {
        return this._exchangeAccessStateReason;
    }
    /**
     * Gets the exchangeLastSuccessfulSyncDateTime property value. Last time the device contacted Exchange. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExchangeLastSuccessfulSyncDateTime() {
        return this._exchangeLastSuccessfulSyncDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedDevice currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("aadRegistered", (n) -> { currentObject.setAadRegistered(n.getBooleanValue()); });
            this.put("activationLockBypassCode", (n) -> { currentObject.setActivationLockBypassCode(n.getStringValue()); });
            this.put("androidSecurityPatchLevel", (n) -> { currentObject.setAndroidSecurityPatchLevel(n.getStringValue()); });
            this.put("assignmentFilterEvaluationStatusDetails", (n) -> { currentObject.setAssignmentFilterEvaluationStatusDetails(n.getCollectionOfObjectValues(AssignmentFilterEvaluationStatusDetails::createFromDiscriminatorValue)); });
            this.put("autopilotEnrolled", (n) -> { currentObject.setAutopilotEnrolled(n.getBooleanValue()); });
            this.put("azureActiveDirectoryDeviceId", (n) -> { currentObject.setAzureActiveDirectoryDeviceId(n.getStringValue()); });
            this.put("azureADDeviceId", (n) -> { currentObject.setAzureADDeviceId(n.getStringValue()); });
            this.put("azureADRegistered", (n) -> { currentObject.setAzureADRegistered(n.getBooleanValue()); });
            this.put("bootstrapTokenEscrowed", (n) -> { currentObject.setBootstrapTokenEscrowed(n.getBooleanValue()); });
            this.put("chassisType", (n) -> { currentObject.setChassisType(n.getEnumValue(ChassisType.class)); });
            this.put("chromeOSDeviceInfo", (n) -> { currentObject.setChromeOSDeviceInfo(n.getCollectionOfObjectValues(ChromeOSDeviceProperty::createFromDiscriminatorValue)); });
            this.put("cloudPcRemoteActionResults", (n) -> { currentObject.setCloudPcRemoteActionResults(n.getCollectionOfObjectValues(CloudPcRemoteActionResult::createFromDiscriminatorValue)); });
            this.put("complianceGracePeriodExpirationDateTime", (n) -> { currentObject.setComplianceGracePeriodExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("complianceState", (n) -> { currentObject.setComplianceState(n.getEnumValue(ComplianceState.class)); });
            this.put("configurationManagerClientEnabledFeatures", (n) -> { currentObject.setConfigurationManagerClientEnabledFeatures(n.getObjectValue(ConfigurationManagerClientEnabledFeatures::createFromDiscriminatorValue)); });
            this.put("configurationManagerClientHealthState", (n) -> { currentObject.setConfigurationManagerClientHealthState(n.getObjectValue(ConfigurationManagerClientHealthState::createFromDiscriminatorValue)); });
            this.put("configurationManagerClientInformation", (n) -> { currentObject.setConfigurationManagerClientInformation(n.getObjectValue(ConfigurationManagerClientInformation::createFromDiscriminatorValue)); });
            this.put("detectedApps", (n) -> { currentObject.setDetectedApps(n.getCollectionOfObjectValues(DetectedApp::createFromDiscriminatorValue)); });
            this.put("deviceActionResults", (n) -> { currentObject.setDeviceActionResults(n.getCollectionOfObjectValues(DeviceActionResult::createFromDiscriminatorValue)); });
            this.put("deviceCategory", (n) -> { currentObject.setDeviceCategory(n.getObjectValue(DeviceCategory::createFromDiscriminatorValue)); });
            this.put("deviceCategoryDisplayName", (n) -> { currentObject.setDeviceCategoryDisplayName(n.getStringValue()); });
            this.put("deviceCompliancePolicyStates", (n) -> { currentObject.setDeviceCompliancePolicyStates(n.getCollectionOfObjectValues(DeviceCompliancePolicyState::createFromDiscriminatorValue)); });
            this.put("deviceConfigurationStates", (n) -> { currentObject.setDeviceConfigurationStates(n.getCollectionOfObjectValues(DeviceConfigurationState::createFromDiscriminatorValue)); });
            this.put("deviceEnrollmentType", (n) -> { currentObject.setDeviceEnrollmentType(n.getEnumValue(DeviceEnrollmentType.class)); });
            this.put("deviceFirmwareConfigurationInterfaceManaged", (n) -> { currentObject.setDeviceFirmwareConfigurationInterfaceManaged(n.getBooleanValue()); });
            this.put("deviceHealthAttestationState", (n) -> { currentObject.setDeviceHealthAttestationState(n.getObjectValue(DeviceHealthAttestationState::createFromDiscriminatorValue)); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("deviceRegistrationState", (n) -> { currentObject.setDeviceRegistrationState(n.getEnumValue(DeviceRegistrationState.class)); });
            this.put("deviceType", (n) -> { currentObject.setDeviceType(n.getEnumValue(DeviceType.class)); });
            this.put("easActivated", (n) -> { currentObject.setEasActivated(n.getBooleanValue()); });
            this.put("easActivationDateTime", (n) -> { currentObject.setEasActivationDateTime(n.getOffsetDateTimeValue()); });
            this.put("easDeviceId", (n) -> { currentObject.setEasDeviceId(n.getStringValue()); });
            this.put("emailAddress", (n) -> { currentObject.setEmailAddress(n.getStringValue()); });
            this.put("enrolledDateTime", (n) -> { currentObject.setEnrolledDateTime(n.getOffsetDateTimeValue()); });
            this.put("enrollmentProfileName", (n) -> { currentObject.setEnrollmentProfileName(n.getStringValue()); });
            this.put("ethernetMacAddress", (n) -> { currentObject.setEthernetMacAddress(n.getStringValue()); });
            this.put("exchangeAccessState", (n) -> { currentObject.setExchangeAccessState(n.getEnumValue(DeviceManagementExchangeAccessState.class)); });
            this.put("exchangeAccessStateReason", (n) -> { currentObject.setExchangeAccessStateReason(n.getEnumValue(DeviceManagementExchangeAccessStateReason.class)); });
            this.put("exchangeLastSuccessfulSyncDateTime", (n) -> { currentObject.setExchangeLastSuccessfulSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("freeStorageSpaceInBytes", (n) -> { currentObject.setFreeStorageSpaceInBytes(n.getLongValue()); });
            this.put("hardwareInformation", (n) -> { currentObject.setHardwareInformation(n.getObjectValue(HardwareInformation::createFromDiscriminatorValue)); });
            this.put("iccid", (n) -> { currentObject.setIccid(n.getStringValue()); });
            this.put("imei", (n) -> { currentObject.setImei(n.getStringValue()); });
            this.put("isEncrypted", (n) -> { currentObject.setIsEncrypted(n.getBooleanValue()); });
            this.put("isSupervised", (n) -> { currentObject.setIsSupervised(n.getBooleanValue()); });
            this.put("jailBroken", (n) -> { currentObject.setJailBroken(n.getStringValue()); });
            this.put("joinType", (n) -> { currentObject.setJoinType(n.getEnumValue(JoinType.class)); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("logCollectionRequests", (n) -> { currentObject.setLogCollectionRequests(n.getCollectionOfObjectValues(DeviceLogCollectionResponse::createFromDiscriminatorValue)); });
            this.put("lostModeState", (n) -> { currentObject.setLostModeState(n.getEnumValue(LostModeState.class)); });
            this.put("managedDeviceMobileAppConfigurationStates", (n) -> { currentObject.setManagedDeviceMobileAppConfigurationStates(n.getCollectionOfObjectValues(ManagedDeviceMobileAppConfigurationState::createFromDiscriminatorValue)); });
            this.put("managedDeviceName", (n) -> { currentObject.setManagedDeviceName(n.getStringValue()); });
            this.put("managedDeviceOwnerType", (n) -> { currentObject.setManagedDeviceOwnerType(n.getEnumValue(ManagedDeviceOwnerType.class)); });
            this.put("managementAgent", (n) -> { currentObject.setManagementAgent(n.getEnumValue(ManagementAgentType.class)); });
            this.put("managementCertificateExpirationDate", (n) -> { currentObject.setManagementCertificateExpirationDate(n.getOffsetDateTimeValue()); });
            this.put("managementFeatures", (n) -> { currentObject.setManagementFeatures(n.getEnumValue(ManagedDeviceManagementFeatures.class)); });
            this.put("managementState", (n) -> { currentObject.setManagementState(n.getEnumValue(ManagementState.class)); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("meid", (n) -> { currentObject.setMeid(n.getStringValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
            this.put("notes", (n) -> { currentObject.setNotes(n.getStringValue()); });
            this.put("operatingSystem", (n) -> { currentObject.setOperatingSystem(n.getStringValue()); });
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
            this.put("ownerType", (n) -> { currentObject.setOwnerType(n.getEnumValue(OwnerType.class)); });
            this.put("partnerReportedThreatState", (n) -> { currentObject.setPartnerReportedThreatState(n.getEnumValue(ManagedDevicePartnerReportedHealthState.class)); });
            this.put("phoneNumber", (n) -> { currentObject.setPhoneNumber(n.getStringValue()); });
            this.put("physicalMemoryInBytes", (n) -> { currentObject.setPhysicalMemoryInBytes(n.getLongValue()); });
            this.put("preferMdmOverGroupPolicyAppliedDateTime", (n) -> { currentObject.setPreferMdmOverGroupPolicyAppliedDateTime(n.getOffsetDateTimeValue()); });
            this.put("processorArchitecture", (n) -> { currentObject.setProcessorArchitecture(n.getEnumValue(ManagedDeviceArchitecture.class)); });
            this.put("remoteAssistanceSessionErrorDetails", (n) -> { currentObject.setRemoteAssistanceSessionErrorDetails(n.getStringValue()); });
            this.put("remoteAssistanceSessionUrl", (n) -> { currentObject.setRemoteAssistanceSessionUrl(n.getStringValue()); });
            this.put("requireUserEnrollmentApproval", (n) -> { currentObject.setRequireUserEnrollmentApproval(n.getBooleanValue()); });
            this.put("retireAfterDateTime", (n) -> { currentObject.setRetireAfterDateTime(n.getOffsetDateTimeValue()); });
            this.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("securityBaselineStates", (n) -> { currentObject.setSecurityBaselineStates(n.getCollectionOfObjectValues(SecurityBaselineState::createFromDiscriminatorValue)); });
            this.put("serialNumber", (n) -> { currentObject.setSerialNumber(n.getStringValue()); });
            this.put("skuFamily", (n) -> { currentObject.setSkuFamily(n.getStringValue()); });
            this.put("skuNumber", (n) -> { currentObject.setSkuNumber(n.getIntegerValue()); });
            this.put("specificationVersion", (n) -> { currentObject.setSpecificationVersion(n.getStringValue()); });
            this.put("subscriberCarrier", (n) -> { currentObject.setSubscriberCarrier(n.getStringValue()); });
            this.put("totalStorageSpaceInBytes", (n) -> { currentObject.setTotalStorageSpaceInBytes(n.getLongValue()); });
            this.put("udid", (n) -> { currentObject.setUdid(n.getStringValue()); });
            this.put("userDisplayName", (n) -> { currentObject.setUserDisplayName(n.getStringValue()); });
            this.put("userId", (n) -> { currentObject.setUserId(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
            this.put("users", (n) -> { currentObject.setUsers(n.getCollectionOfObjectValues(User::createFromDiscriminatorValue)); });
            this.put("usersLoggedOn", (n) -> { currentObject.setUsersLoggedOn(n.getCollectionOfObjectValues(LoggedOnUser::createFromDiscriminatorValue)); });
            this.put("wiFiMacAddress", (n) -> { currentObject.setWiFiMacAddress(n.getStringValue()); });
            this.put("windowsActiveMalwareCount", (n) -> { currentObject.setWindowsActiveMalwareCount(n.getIntegerValue()); });
            this.put("windowsProtectionState", (n) -> { currentObject.setWindowsProtectionState(n.getObjectValue(WindowsProtectionState::createFromDiscriminatorValue)); });
            this.put("windowsRemediatedMalwareCount", (n) -> { currentObject.setWindowsRemediatedMalwareCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the freeStorageSpaceInBytes property value. Free Storage in Bytes. Default value is 0. Read-only. This property is read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getFreeStorageSpaceInBytes() {
        return this._freeStorageSpaceInBytes;
    }
    /**
     * Gets the hardwareInformation property value. The hardward details for the device.  Includes information such as storage space, manufacturer, serial number, etc. Return default value in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a hardwareInformation
     */
    @javax.annotation.Nullable
    public HardwareInformation getHardwareInformation() {
        return this._hardwareInformation;
    }
    /**
     * Gets the iccid property value. Integrated Circuit Card Identifier, it is A SIM card's unique identification number. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIccid() {
        return this._iccid;
    }
    /**
     * Gets the imei property value. IMEI. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImei() {
        return this._imei;
    }
    /**
     * Gets the isEncrypted property value. Device encryption status. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEncrypted() {
        return this._isEncrypted;
    }
    /**
     * Gets the isSupervised property value. Device supervised status. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSupervised() {
        return this._isSupervised;
    }
    /**
     * Gets the jailBroken property value. whether the device is jail broken or rooted. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJailBroken() {
        return this._jailBroken;
    }
    /**
     * Gets the joinType property value. Device enrollment join type.
     * @return a joinType
     */
    @javax.annotation.Nullable
    public JoinType getJoinType() {
        return this._joinType;
    }
    /**
     * Gets the lastSyncDateTime property value. The date and time that the device last completed a successful sync with Intune. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the logCollectionRequests property value. List of log collection requests
     * @return a deviceLogCollectionResponse
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceLogCollectionResponse> getLogCollectionRequests() {
        return this._logCollectionRequests;
    }
    /**
     * Gets the lostModeState property value. State of lost mode, indicating if lost mode is enabled or disabled
     * @return a lostModeState
     */
    @javax.annotation.Nullable
    public LostModeState getLostModeState() {
        return this._lostModeState;
    }
    /**
     * Gets the managedDeviceMobileAppConfigurationStates property value. Managed device mobile app configuration states for this device.
     * @return a managedDeviceMobileAppConfigurationState
     */
    @javax.annotation.Nullable
    public java.util.List<ManagedDeviceMobileAppConfigurationState> getManagedDeviceMobileAppConfigurationStates() {
        return this._managedDeviceMobileAppConfigurationStates;
    }
    /**
     * Gets the managedDeviceName property value. Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceName() {
        return this._managedDeviceName;
    }
    /**
     * Gets the managedDeviceOwnerType property value. Owner type of device.
     * @return a managedDeviceOwnerType
     */
    @javax.annotation.Nullable
    public ManagedDeviceOwnerType getManagedDeviceOwnerType() {
        return this._managedDeviceOwnerType;
    }
    /**
     * Gets the managementAgent property value. Management agent type.
     * @return a managementAgentType
     */
    @javax.annotation.Nullable
    public ManagementAgentType getManagementAgent() {
        return this._managementAgent;
    }
    /**
     * Gets the managementCertificateExpirationDate property value. Reports device management certificate expiration date. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getManagementCertificateExpirationDate() {
        return this._managementCertificateExpirationDate;
    }
    /**
     * Gets the managementFeatures property value. Device management features.
     * @return a managedDeviceManagementFeatures
     */
    @javax.annotation.Nullable
    public ManagedDeviceManagementFeatures getManagementFeatures() {
        return this._managementFeatures;
    }
    /**
     * Gets the managementState property value. Management state of device in Microsoft Intune.
     * @return a managementState
     */
    @javax.annotation.Nullable
    public ManagementState getManagementState() {
        return this._managementState;
    }
    /**
     * Gets the manufacturer property value. Manufacturer of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the meid property value. MEID. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMeid() {
        return this._meid;
    }
    /**
     * Gets the model property value. Model of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the notes property value. Notes on the device created by IT Admin. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select.  $Search is not supported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotes() {
        return this._notes;
    }
    /**
     * Gets the operatingSystem property value. Operating system of the device. Windows, iOS, etc. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystem() {
        return this._operatingSystem;
    }
    /**
     * Gets the osVersion property value. Operating system version of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the ownerType property value. Owner type of device.
     * @return a ownerType
     */
    @javax.annotation.Nullable
    public OwnerType getOwnerType() {
        return this._ownerType;
    }
    /**
     * Gets the partnerReportedThreatState property value. Available health states for the Device Health API
     * @return a managedDevicePartnerReportedHealthState
     */
    @javax.annotation.Nullable
    public ManagedDevicePartnerReportedHealthState getPartnerReportedThreatState() {
        return this._partnerReportedThreatState;
    }
    /**
     * Gets the phoneNumber property value. Phone number of the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return this._phoneNumber;
    }
    /**
     * Gets the physicalMemoryInBytes property value. Total Memory in Bytes. Return default value 0 in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. Default value is 0. Read-only. This property is read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getPhysicalMemoryInBytes() {
        return this._physicalMemoryInBytes;
    }
    /**
     * Gets the preferMdmOverGroupPolicyAppliedDateTime property value. Reports the DateTime the preferMdmOverGroupPolicy setting was set.  When set, the Intune MDM settings will override Group Policy settings if there is a conflict. Read Only. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getPreferMdmOverGroupPolicyAppliedDateTime() {
        return this._preferMdmOverGroupPolicyAppliedDateTime;
    }
    /**
     * Gets the processorArchitecture property value. Processor architecture
     * @return a managedDeviceArchitecture
     */
    @javax.annotation.Nullable
    public ManagedDeviceArchitecture getProcessorArchitecture() {
        return this._processorArchitecture;
    }
    /**
     * Gets the remoteAssistanceSessionErrorDetails property value. An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemoteAssistanceSessionErrorDetails() {
        return this._remoteAssistanceSessionErrorDetails;
    }
    /**
     * Gets the remoteAssistanceSessionUrl property value. Url that allows a Remote Assistance session to be established with the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemoteAssistanceSessionUrl() {
        return this._remoteAssistanceSessionUrl;
    }
    /**
     * Gets the requireUserEnrollmentApproval property value. Reports if the managed iOS device is user approval enrollment. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireUserEnrollmentApproval() {
        return this._requireUserEnrollmentApproval;
    }
    /**
     * Gets the retireAfterDateTime property value. Indicates the time after when a device will be auto retired because of scheduled action. This property is read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRetireAfterDateTime() {
        return this._retireAfterDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tag IDs for this Device instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the securityBaselineStates property value. Security baseline states for this device.
     * @return a securityBaselineState
     */
    @javax.annotation.Nullable
    public java.util.List<SecurityBaselineState> getSecurityBaselineStates() {
        return this._securityBaselineStates;
    }
    /**
     * Gets the serialNumber property value. SerialNumber. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this._serialNumber;
    }
    /**
     * Gets the skuFamily property value. Device sku family
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuFamily() {
        return this._skuFamily;
    }
    /**
     * Gets the skuNumber property value. Device sku number, see also: https://learn.microsoft.com/windows/win32/api/sysinfoapi/nf-sysinfoapi-getproductinfo. Valid values 0 to 2147483647. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSkuNumber() {
        return this._skuNumber;
    }
    /**
     * Gets the specificationVersion property value. Specification version. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSpecificationVersion() {
        return this._specificationVersion;
    }
    /**
     * Gets the subscriberCarrier property value. Subscriber Carrier. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubscriberCarrier() {
        return this._subscriberCarrier;
    }
    /**
     * Gets the totalStorageSpaceInBytes property value. Total Storage in Bytes. This property is read-only.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotalStorageSpaceInBytes() {
        return this._totalStorageSpaceInBytes;
    }
    /**
     * Gets the udid property value. Unique Device Identifier for iOS and macOS devices. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUdid() {
        return this._udid;
    }
    /**
     * Gets the userDisplayName property value. User display name. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserDisplayName() {
        return this._userDisplayName;
    }
    /**
     * Gets the userId property value. Unique Identifier for the user associated with the device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserId() {
        return this._userId;
    }
    /**
     * Gets the userPrincipalName property value. Device user principal name. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Gets the users property value. The primary users associated with the managed device.
     * @return a user
     */
    @javax.annotation.Nullable
    public java.util.List<User> getUsers() {
        return this._users;
    }
    /**
     * Gets the usersLoggedOn property value. Indicates the last logged on users of a device. This property is read-only.
     * @return a loggedOnUser
     */
    @javax.annotation.Nullable
    public java.util.List<LoggedOnUser> getUsersLoggedOn() {
        return this._usersLoggedOn;
    }
    /**
     * Gets the wiFiMacAddress property value. Wi-Fi MAC. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWiFiMacAddress() {
        return this._wiFiMacAddress;
    }
    /**
     * Gets the windowsActiveMalwareCount property value. Count of active malware for this windows device. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWindowsActiveMalwareCount() {
        return this._windowsActiveMalwareCount;
    }
    /**
     * Gets the windowsProtectionState property value. The device protection status. This property is read-only.
     * @return a windowsProtectionState
     */
    @javax.annotation.Nullable
    public WindowsProtectionState getWindowsProtectionState() {
        return this._windowsProtectionState;
    }
    /**
     * Gets the windowsRemediatedMalwareCount property value. Count of remediated malware for this windows device. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWindowsRemediatedMalwareCount() {
        return this._windowsRemediatedMalwareCount;
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
        this._aadRegistered = value;
    }
    /**
     * Sets the activationLockBypassCode property value. Code that allows the Activation Lock on a device to be bypassed. This property is read-only.
     * @param value Value to set for the activationLockBypassCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivationLockBypassCode(@javax.annotation.Nullable final String value) {
        this._activationLockBypassCode = value;
    }
    /**
     * Sets the androidSecurityPatchLevel property value. Android security patch level. This property is read-only.
     * @param value Value to set for the androidSecurityPatchLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAndroidSecurityPatchLevel(@javax.annotation.Nullable final String value) {
        this._androidSecurityPatchLevel = value;
    }
    /**
     * Sets the assignmentFilterEvaluationStatusDetails property value. Managed device mobile app configuration states for this device.
     * @param value Value to set for the assignmentFilterEvaluationStatusDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignmentFilterEvaluationStatusDetails(@javax.annotation.Nullable final java.util.List<AssignmentFilterEvaluationStatusDetails> value) {
        this._assignmentFilterEvaluationStatusDetails = value;
    }
    /**
     * Sets the autopilotEnrolled property value. Reports if the managed device is enrolled via auto-pilot. This property is read-only.
     * @param value Value to set for the autopilotEnrolled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAutopilotEnrolled(@javax.annotation.Nullable final Boolean value) {
        this._autopilotEnrolled = value;
    }
    /**
     * Sets the azureActiveDirectoryDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @param value Value to set for the azureActiveDirectoryDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureActiveDirectoryDeviceId(@javax.annotation.Nullable final String value) {
        this._azureActiveDirectoryDeviceId = value;
    }
    /**
     * Sets the azureADDeviceId property value. The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     * @param value Value to set for the azureADDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureADDeviceId(@javax.annotation.Nullable final String value) {
        this._azureADDeviceId = value;
    }
    /**
     * Sets the azureADRegistered property value. Whether the device is Azure Active Directory registered. This property is read-only.
     * @param value Value to set for the azureADRegistered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureADRegistered(@javax.annotation.Nullable final Boolean value) {
        this._azureADRegistered = value;
    }
    /**
     * Sets the bootstrapTokenEscrowed property value. Reports if the managed device has an escrowed Bootstrap Token. This is only for macOS devices. To get, include BootstrapTokenEscrowed in the select clause and query with a device id. If FALSE, no bootstrap token is escrowed. If TRUE, the device has escrowed a bootstrap token with Intune. This property is read-only.
     * @param value Value to set for the bootstrapTokenEscrowed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBootstrapTokenEscrowed(@javax.annotation.Nullable final Boolean value) {
        this._bootstrapTokenEscrowed = value;
    }
    /**
     * Sets the chassisType property value. Chassis type.
     * @param value Value to set for the chassisType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChassisType(@javax.annotation.Nullable final ChassisType value) {
        this._chassisType = value;
    }
    /**
     * Sets the chromeOSDeviceInfo property value. List of properties of the ChromeOS Device.
     * @param value Value to set for the chromeOSDeviceInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChromeOSDeviceInfo(@javax.annotation.Nullable final java.util.List<ChromeOSDeviceProperty> value) {
        this._chromeOSDeviceInfo = value;
    }
    /**
     * Sets the cloudPcRemoteActionResults property value. The cloudPcRemoteActionResults property
     * @param value Value to set for the cloudPcRemoteActionResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudPcRemoteActionResults(@javax.annotation.Nullable final java.util.List<CloudPcRemoteActionResult> value) {
        this._cloudPcRemoteActionResults = value;
    }
    /**
     * Sets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires. This property is read-only.
     * @param value Value to set for the complianceGracePeriodExpirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceGracePeriodExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._complianceGracePeriodExpirationDateTime = value;
    }
    /**
     * Sets the complianceState property value. Compliance state.
     * @param value Value to set for the complianceState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceState(@javax.annotation.Nullable final ComplianceState value) {
        this._complianceState = value;
    }
    /**
     * Sets the configurationManagerClientEnabledFeatures property value. ConfigrMgr client enabled features. This property is read-only.
     * @param value Value to set for the configurationManagerClientEnabledFeatures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationManagerClientEnabledFeatures(@javax.annotation.Nullable final ConfigurationManagerClientEnabledFeatures value) {
        this._configurationManagerClientEnabledFeatures = value;
    }
    /**
     * Sets the configurationManagerClientHealthState property value. Configuration manager client health state, valid only for devices managed by MDM/ConfigMgr Agent
     * @param value Value to set for the configurationManagerClientHealthState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationManagerClientHealthState(@javax.annotation.Nullable final ConfigurationManagerClientHealthState value) {
        this._configurationManagerClientHealthState = value;
    }
    /**
     * Sets the configurationManagerClientInformation property value. Configuration manager client information, valid only for devices managed, duel-managed or tri-managed by ConfigMgr Agent
     * @param value Value to set for the configurationManagerClientInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationManagerClientInformation(@javax.annotation.Nullable final ConfigurationManagerClientInformation value) {
        this._configurationManagerClientInformation = value;
    }
    /**
     * Sets the detectedApps property value. All applications currently installed on the device
     * @param value Value to set for the detectedApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectedApps(@javax.annotation.Nullable final java.util.List<DetectedApp> value) {
        this._detectedApps = value;
    }
    /**
     * Sets the deviceActionResults property value. List of ComplexType deviceActionResult objects. This property is read-only.
     * @param value Value to set for the deviceActionResults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceActionResults(@javax.annotation.Nullable final java.util.List<DeviceActionResult> value) {
        this._deviceActionResults = value;
    }
    /**
     * Sets the deviceCategory property value. Device category
     * @param value Value to set for the deviceCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCategory(@javax.annotation.Nullable final DeviceCategory value) {
        this._deviceCategory = value;
    }
    /**
     * Sets the deviceCategoryDisplayName property value. Device category display name. This property is read-only.
     * @param value Value to set for the deviceCategoryDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCategoryDisplayName(@javax.annotation.Nullable final String value) {
        this._deviceCategoryDisplayName = value;
    }
    /**
     * Sets the deviceCompliancePolicyStates property value. Device compliance policy states for this device.
     * @param value Value to set for the deviceCompliancePolicyStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCompliancePolicyStates(@javax.annotation.Nullable final java.util.List<DeviceCompliancePolicyState> value) {
        this._deviceCompliancePolicyStates = value;
    }
    /**
     * Sets the deviceConfigurationStates property value. Device configuration states for this device.
     * @param value Value to set for the deviceConfigurationStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfigurationStates(@javax.annotation.Nullable final java.util.List<DeviceConfigurationState> value) {
        this._deviceConfigurationStates = value;
    }
    /**
     * Sets the deviceEnrollmentType property value. Possible ways of adding a mobile device to management.
     * @param value Value to set for the deviceEnrollmentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceEnrollmentType(@javax.annotation.Nullable final DeviceEnrollmentType value) {
        this._deviceEnrollmentType = value;
    }
    /**
     * Sets the deviceFirmwareConfigurationInterfaceManaged property value. Indicates whether the device is DFCI managed. When TRUE the device is DFCI managed. When FALSE, the device is not DFCI managed. The default value is FALSE.
     * @param value Value to set for the deviceFirmwareConfigurationInterfaceManaged property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceFirmwareConfigurationInterfaceManaged(@javax.annotation.Nullable final Boolean value) {
        this._deviceFirmwareConfigurationInterfaceManaged = value;
    }
    /**
     * Sets the deviceHealthAttestationState property value. The device health attestation state. This property is read-only.
     * @param value Value to set for the deviceHealthAttestationState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceHealthAttestationState(@javax.annotation.Nullable final DeviceHealthAttestationState value) {
        this._deviceHealthAttestationState = value;
    }
    /**
     * Sets the deviceName property value. Name of the device. This property is read-only.
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the deviceRegistrationState property value. Device registration status.
     * @param value Value to set for the deviceRegistrationState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceRegistrationState(@javax.annotation.Nullable final DeviceRegistrationState value) {
        this._deviceRegistrationState = value;
    }
    /**
     * Sets the deviceType property value. Device type.
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceType(@javax.annotation.Nullable final DeviceType value) {
        this._deviceType = value;
    }
    /**
     * Sets the easActivated property value. Whether the device is Exchange ActiveSync activated. This property is read-only.
     * @param value Value to set for the easActivated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEasActivated(@javax.annotation.Nullable final Boolean value) {
        this._easActivated = value;
    }
    /**
     * Sets the easActivationDateTime property value. Exchange ActivationSync activation time of the device. This property is read-only.
     * @param value Value to set for the easActivationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEasActivationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._easActivationDateTime = value;
    }
    /**
     * Sets the easDeviceId property value. Exchange ActiveSync Id of the device. This property is read-only.
     * @param value Value to set for the easDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEasDeviceId(@javax.annotation.Nullable final String value) {
        this._easDeviceId = value;
    }
    /**
     * Sets the emailAddress property value. Email(s) for the user associated with the device. This property is read-only.
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailAddress(@javax.annotation.Nullable final String value) {
        this._emailAddress = value;
    }
    /**
     * Sets the enrolledDateTime property value. Enrollment time of the device. This property is read-only.
     * @param value Value to set for the enrolledDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrolledDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._enrolledDateTime = value;
    }
    /**
     * Sets the enrollmentProfileName property value. Name of the enrollment profile assigned to the device. Default value is empty string, indicating no enrollment profile was assgined. This property is read-only.
     * @param value Value to set for the enrollmentProfileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentProfileName(@javax.annotation.Nullable final String value) {
        this._enrollmentProfileName = value;
    }
    /**
     * Sets the ethernetMacAddress property value. Ethernet MAC. This property is read-only.
     * @param value Value to set for the ethernetMacAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEthernetMacAddress(@javax.annotation.Nullable final String value) {
        this._ethernetMacAddress = value;
    }
    /**
     * Sets the exchangeAccessState property value. Device Exchange Access State.
     * @param value Value to set for the exchangeAccessState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeAccessState(@javax.annotation.Nullable final DeviceManagementExchangeAccessState value) {
        this._exchangeAccessState = value;
    }
    /**
     * Sets the exchangeAccessStateReason property value. Device Exchange Access State Reason.
     * @param value Value to set for the exchangeAccessStateReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeAccessStateReason(@javax.annotation.Nullable final DeviceManagementExchangeAccessStateReason value) {
        this._exchangeAccessStateReason = value;
    }
    /**
     * Sets the exchangeLastSuccessfulSyncDateTime property value. Last time the device contacted Exchange. This property is read-only.
     * @param value Value to set for the exchangeLastSuccessfulSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeLastSuccessfulSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._exchangeLastSuccessfulSyncDateTime = value;
    }
    /**
     * Sets the freeStorageSpaceInBytes property value. Free Storage in Bytes. Default value is 0. Read-only. This property is read-only.
     * @param value Value to set for the freeStorageSpaceInBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFreeStorageSpaceInBytes(@javax.annotation.Nullable final Long value) {
        this._freeStorageSpaceInBytes = value;
    }
    /**
     * Sets the hardwareInformation property value. The hardward details for the device.  Includes information such as storage space, manufacturer, serial number, etc. Return default value in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the hardwareInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHardwareInformation(@javax.annotation.Nullable final HardwareInformation value) {
        this._hardwareInformation = value;
    }
    /**
     * Sets the iccid property value. Integrated Circuit Card Identifier, it is A SIM card's unique identification number. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the iccid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIccid(@javax.annotation.Nullable final String value) {
        this._iccid = value;
    }
    /**
     * Sets the imei property value. IMEI. This property is read-only.
     * @param value Value to set for the imei property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImei(@javax.annotation.Nullable final String value) {
        this._imei = value;
    }
    /**
     * Sets the isEncrypted property value. Device encryption status. This property is read-only.
     * @param value Value to set for the isEncrypted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEncrypted(@javax.annotation.Nullable final Boolean value) {
        this._isEncrypted = value;
    }
    /**
     * Sets the isSupervised property value. Device supervised status. This property is read-only.
     * @param value Value to set for the isSupervised property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSupervised(@javax.annotation.Nullable final Boolean value) {
        this._isSupervised = value;
    }
    /**
     * Sets the jailBroken property value. whether the device is jail broken or rooted. This property is read-only.
     * @param value Value to set for the jailBroken property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJailBroken(@javax.annotation.Nullable final String value) {
        this._jailBroken = value;
    }
    /**
     * Sets the joinType property value. Device enrollment join type.
     * @param value Value to set for the joinType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinType(@javax.annotation.Nullable final JoinType value) {
        this._joinType = value;
    }
    /**
     * Sets the lastSyncDateTime property value. The date and time that the device last completed a successful sync with Intune. This property is read-only.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the logCollectionRequests property value. List of log collection requests
     * @param value Value to set for the logCollectionRequests property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLogCollectionRequests(@javax.annotation.Nullable final java.util.List<DeviceLogCollectionResponse> value) {
        this._logCollectionRequests = value;
    }
    /**
     * Sets the lostModeState property value. State of lost mode, indicating if lost mode is enabled or disabled
     * @param value Value to set for the lostModeState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLostModeState(@javax.annotation.Nullable final LostModeState value) {
        this._lostModeState = value;
    }
    /**
     * Sets the managedDeviceMobileAppConfigurationStates property value. Managed device mobile app configuration states for this device.
     * @param value Value to set for the managedDeviceMobileAppConfigurationStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceMobileAppConfigurationStates(@javax.annotation.Nullable final java.util.List<ManagedDeviceMobileAppConfigurationState> value) {
        this._managedDeviceMobileAppConfigurationStates = value;
    }
    /**
     * Sets the managedDeviceName property value. Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     * @param value Value to set for the managedDeviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceName(@javax.annotation.Nullable final String value) {
        this._managedDeviceName = value;
    }
    /**
     * Sets the managedDeviceOwnerType property value. Owner type of device.
     * @param value Value to set for the managedDeviceOwnerType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceOwnerType(@javax.annotation.Nullable final ManagedDeviceOwnerType value) {
        this._managedDeviceOwnerType = value;
    }
    /**
     * Sets the managementAgent property value. Management agent type.
     * @param value Value to set for the managementAgent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementAgent(@javax.annotation.Nullable final ManagementAgentType value) {
        this._managementAgent = value;
    }
    /**
     * Sets the managementCertificateExpirationDate property value. Reports device management certificate expiration date. This property is read-only.
     * @param value Value to set for the managementCertificateExpirationDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementCertificateExpirationDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this._managementCertificateExpirationDate = value;
    }
    /**
     * Sets the managementFeatures property value. Device management features.
     * @param value Value to set for the managementFeatures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementFeatures(@javax.annotation.Nullable final ManagedDeviceManagementFeatures value) {
        this._managementFeatures = value;
    }
    /**
     * Sets the managementState property value. Management state of device in Microsoft Intune.
     * @param value Value to set for the managementState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementState(@javax.annotation.Nullable final ManagementState value) {
        this._managementState = value;
    }
    /**
     * Sets the manufacturer property value. Manufacturer of the device. This property is read-only.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the meid property value. MEID. This property is read-only.
     * @param value Value to set for the meid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeid(@javax.annotation.Nullable final String value) {
        this._meid = value;
    }
    /**
     * Sets the model property value. Model of the device. This property is read-only.
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the notes property value. Notes on the device created by IT Admin. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select.  $Search is not supported.
     * @param value Value to set for the notes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotes(@javax.annotation.Nullable final String value) {
        this._notes = value;
    }
    /**
     * Sets the operatingSystem property value. Operating system of the device. Windows, iOS, etc. This property is read-only.
     * @param value Value to set for the operatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystem(@javax.annotation.Nullable final String value) {
        this._operatingSystem = value;
    }
    /**
     * Sets the osVersion property value. Operating system version of the device. This property is read-only.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
    /**
     * Sets the ownerType property value. Owner type of device.
     * @param value Value to set for the ownerType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnerType(@javax.annotation.Nullable final OwnerType value) {
        this._ownerType = value;
    }
    /**
     * Sets the partnerReportedThreatState property value. Available health states for the Device Health API
     * @param value Value to set for the partnerReportedThreatState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPartnerReportedThreatState(@javax.annotation.Nullable final ManagedDevicePartnerReportedHealthState value) {
        this._partnerReportedThreatState = value;
    }
    /**
     * Sets the phoneNumber property value. Phone number of the device. This property is read-only.
     * @param value Value to set for the phoneNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhoneNumber(@javax.annotation.Nullable final String value) {
        this._phoneNumber = value;
    }
    /**
     * Sets the physicalMemoryInBytes property value. Total Memory in Bytes. Return default value 0 in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. Default value is 0. Read-only. This property is read-only.
     * @param value Value to set for the physicalMemoryInBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhysicalMemoryInBytes(@javax.annotation.Nullable final Long value) {
        this._physicalMemoryInBytes = value;
    }
    /**
     * Sets the preferMdmOverGroupPolicyAppliedDateTime property value. Reports the DateTime the preferMdmOverGroupPolicy setting was set.  When set, the Intune MDM settings will override Group Policy settings if there is a conflict. Read Only. This property is read-only.
     * @param value Value to set for the preferMdmOverGroupPolicyAppliedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreferMdmOverGroupPolicyAppliedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._preferMdmOverGroupPolicyAppliedDateTime = value;
    }
    /**
     * Sets the processorArchitecture property value. Processor architecture
     * @param value Value to set for the processorArchitecture property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessorArchitecture(@javax.annotation.Nullable final ManagedDeviceArchitecture value) {
        this._processorArchitecture = value;
    }
    /**
     * Sets the remoteAssistanceSessionErrorDetails property value. An error string that identifies issues when creating Remote Assistance session objects. This property is read-only.
     * @param value Value to set for the remoteAssistanceSessionErrorDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteAssistanceSessionErrorDetails(@javax.annotation.Nullable final String value) {
        this._remoteAssistanceSessionErrorDetails = value;
    }
    /**
     * Sets the remoteAssistanceSessionUrl property value. Url that allows a Remote Assistance session to be established with the device. This property is read-only.
     * @param value Value to set for the remoteAssistanceSessionUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteAssistanceSessionUrl(@javax.annotation.Nullable final String value) {
        this._remoteAssistanceSessionUrl = value;
    }
    /**
     * Sets the requireUserEnrollmentApproval property value. Reports if the managed iOS device is user approval enrollment. This property is read-only.
     * @param value Value to set for the requireUserEnrollmentApproval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequireUserEnrollmentApproval(@javax.annotation.Nullable final Boolean value) {
        this._requireUserEnrollmentApproval = value;
    }
    /**
     * Sets the retireAfterDateTime property value. Indicates the time after when a device will be auto retired because of scheduled action. This property is read-only.
     * @param value Value to set for the retireAfterDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRetireAfterDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._retireAfterDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tag IDs for this Device instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the securityBaselineStates property value. Security baseline states for this device.
     * @param value Value to set for the securityBaselineStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityBaselineStates(@javax.annotation.Nullable final java.util.List<SecurityBaselineState> value) {
        this._securityBaselineStates = value;
    }
    /**
     * Sets the serialNumber property value. SerialNumber. This property is read-only.
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this._serialNumber = value;
    }
    /**
     * Sets the skuFamily property value. Device sku family
     * @param value Value to set for the skuFamily property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkuFamily(@javax.annotation.Nullable final String value) {
        this._skuFamily = value;
    }
    /**
     * Sets the skuNumber property value. Device sku number, see also: https://learn.microsoft.com/windows/win32/api/sysinfoapi/nf-sysinfoapi-getproductinfo. Valid values 0 to 2147483647. This property is read-only.
     * @param value Value to set for the skuNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkuNumber(@javax.annotation.Nullable final Integer value) {
        this._skuNumber = value;
    }
    /**
     * Sets the specificationVersion property value. Specification version. This property is read-only.
     * @param value Value to set for the specificationVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSpecificationVersion(@javax.annotation.Nullable final String value) {
        this._specificationVersion = value;
    }
    /**
     * Sets the subscriberCarrier property value. Subscriber Carrier. This property is read-only.
     * @param value Value to set for the subscriberCarrier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubscriberCarrier(@javax.annotation.Nullable final String value) {
        this._subscriberCarrier = value;
    }
    /**
     * Sets the totalStorageSpaceInBytes property value. Total Storage in Bytes. This property is read-only.
     * @param value Value to set for the totalStorageSpaceInBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalStorageSpaceInBytes(@javax.annotation.Nullable final Long value) {
        this._totalStorageSpaceInBytes = value;
    }
    /**
     * Sets the udid property value. Unique Device Identifier for iOS and macOS devices. Return default value null in LIST managedDevices. Real value only returned in singel device GET call with device id and included in select parameter. Supports: $select. $Search is not supported. Read-only. This property is read-only.
     * @param value Value to set for the udid property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUdid(@javax.annotation.Nullable final String value) {
        this._udid = value;
    }
    /**
     * Sets the userDisplayName property value. User display name. This property is read-only.
     * @param value Value to set for the userDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserDisplayName(@javax.annotation.Nullable final String value) {
        this._userDisplayName = value;
    }
    /**
     * Sets the userId property value. Unique Identifier for the user associated with the device. This property is read-only.
     * @param value Value to set for the userId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserId(@javax.annotation.Nullable final String value) {
        this._userId = value;
    }
    /**
     * Sets the userPrincipalName property value. Device user principal name. This property is read-only.
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
    /**
     * Sets the users property value. The primary users associated with the managed device.
     * @param value Value to set for the users property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsers(@javax.annotation.Nullable final java.util.List<User> value) {
        this._users = value;
    }
    /**
     * Sets the usersLoggedOn property value. Indicates the last logged on users of a device. This property is read-only.
     * @param value Value to set for the usersLoggedOn property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsersLoggedOn(@javax.annotation.Nullable final java.util.List<LoggedOnUser> value) {
        this._usersLoggedOn = value;
    }
    /**
     * Sets the wiFiMacAddress property value. Wi-Fi MAC. This property is read-only.
     * @param value Value to set for the wiFiMacAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWiFiMacAddress(@javax.annotation.Nullable final String value) {
        this._wiFiMacAddress = value;
    }
    /**
     * Sets the windowsActiveMalwareCount property value. Count of active malware for this windows device. This property is read-only.
     * @param value Value to set for the windowsActiveMalwareCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsActiveMalwareCount(@javax.annotation.Nullable final Integer value) {
        this._windowsActiveMalwareCount = value;
    }
    /**
     * Sets the windowsProtectionState property value. The device protection status. This property is read-only.
     * @param value Value to set for the windowsProtectionState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsProtectionState(@javax.annotation.Nullable final WindowsProtectionState value) {
        this._windowsProtectionState = value;
    }
    /**
     * Sets the windowsRemediatedMalwareCount property value. Count of remediated malware for this windows device. This property is read-only.
     * @param value Value to set for the windowsRemediatedMalwareCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsRemediatedMalwareCount(@javax.annotation.Nullable final Integer value) {
        this._windowsRemediatedMalwareCount = value;
    }
}
