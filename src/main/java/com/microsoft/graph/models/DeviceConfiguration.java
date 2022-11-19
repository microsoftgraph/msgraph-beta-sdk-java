package com.microsoft.graph.models;

import com.microsoft.graph.models.AndroidCertificateProfileBase;
import com.microsoft.graph.models.AndroidCustomConfiguration;
import com.microsoft.graph.models.AndroidDeviceOwnerCertificateProfileBase;
import com.microsoft.graph.models.AndroidDeviceOwnerDerivedCredentialAuthenticationConfiguration;
import com.microsoft.graph.models.AndroidDeviceOwnerEnterpriseWiFiConfiguration;
import com.microsoft.graph.models.AndroidDeviceOwnerGeneralDeviceConfiguration;
import com.microsoft.graph.models.AndroidDeviceOwnerImportedPFXCertificateProfile;
import com.microsoft.graph.models.AndroidDeviceOwnerPkcsCertificateProfile;
import com.microsoft.graph.models.AndroidDeviceOwnerScepCertificateProfile;
import com.microsoft.graph.models.AndroidDeviceOwnerTrustedRootCertificate;
import com.microsoft.graph.models.AndroidDeviceOwnerVpnConfiguration;
import com.microsoft.graph.models.AndroidDeviceOwnerWiFiConfiguration;
import com.microsoft.graph.models.AndroidEasEmailProfileConfiguration;
import com.microsoft.graph.models.AndroidEnterpriseWiFiConfiguration;
import com.microsoft.graph.models.AndroidForWorkCertificateProfileBase;
import com.microsoft.graph.models.AndroidForWorkCustomConfiguration;
import com.microsoft.graph.models.AndroidForWorkEasEmailProfileBase;
import com.microsoft.graph.models.AndroidForWorkEnterpriseWiFiConfiguration;
import com.microsoft.graph.models.AndroidForWorkGeneralDeviceConfiguration;
import com.microsoft.graph.models.AndroidForWorkGmailEasConfiguration;
import com.microsoft.graph.models.AndroidForWorkImportedPFXCertificateProfile;
import com.microsoft.graph.models.AndroidForWorkNineWorkEasConfiguration;
import com.microsoft.graph.models.AndroidForWorkPkcsCertificateProfile;
import com.microsoft.graph.models.AndroidForWorkScepCertificateProfile;
import com.microsoft.graph.models.AndroidForWorkTrustedRootCertificate;
import com.microsoft.graph.models.AndroidForWorkVpnConfiguration;
import com.microsoft.graph.models.AndroidForWorkWiFiConfiguration;
import com.microsoft.graph.models.AndroidGeneralDeviceConfiguration;
import com.microsoft.graph.models.AndroidImportedPFXCertificateProfile;
import com.microsoft.graph.models.AndroidOmaCpConfiguration;
import com.microsoft.graph.models.AndroidPkcsCertificateProfile;
import com.microsoft.graph.models.AndroidScepCertificateProfile;
import com.microsoft.graph.models.AndroidTrustedRootCertificate;
import com.microsoft.graph.models.AndroidVpnConfiguration;
import com.microsoft.graph.models.AndroidWiFiConfiguration;
import com.microsoft.graph.models.AndroidWorkProfileCertificateProfileBase;
import com.microsoft.graph.models.AndroidWorkProfileCustomConfiguration;
import com.microsoft.graph.models.AndroidWorkProfileEasEmailProfileBase;
import com.microsoft.graph.models.AndroidWorkProfileEnterpriseWiFiConfiguration;
import com.microsoft.graph.models.AndroidWorkProfileGeneralDeviceConfiguration;
import com.microsoft.graph.models.AndroidWorkProfileGmailEasConfiguration;
import com.microsoft.graph.models.AndroidWorkProfileNineWorkEasConfiguration;
import com.microsoft.graph.models.AndroidWorkProfilePkcsCertificateProfile;
import com.microsoft.graph.models.AndroidWorkProfileScepCertificateProfile;
import com.microsoft.graph.models.AndroidWorkProfileTrustedRootCertificate;
import com.microsoft.graph.models.AndroidWorkProfileVpnConfiguration;
import com.microsoft.graph.models.AndroidWorkProfileWiFiConfiguration;
import com.microsoft.graph.models.AospDeviceOwnerCertificateProfileBase;
import com.microsoft.graph.models.AospDeviceOwnerDeviceConfiguration;
import com.microsoft.graph.models.AospDeviceOwnerEnterpriseWiFiConfiguration;
import com.microsoft.graph.models.AospDeviceOwnerPkcsCertificateProfile;
import com.microsoft.graph.models.AospDeviceOwnerScepCertificateProfile;
import com.microsoft.graph.models.AospDeviceOwnerTrustedRootCertificate;
import com.microsoft.graph.models.AospDeviceOwnerWiFiConfiguration;
import com.microsoft.graph.models.AppleDeviceFeaturesConfigurationBase;
import com.microsoft.graph.models.AppleExpeditedCheckinConfigurationBase;
import com.microsoft.graph.models.AppleVpnConfiguration;
import com.microsoft.graph.models.EasEmailProfileConfigurationBase;
import com.microsoft.graph.models.EditionUpgradeConfiguration;
import com.microsoft.graph.models.IosCertificateProfile;
import com.microsoft.graph.models.IosCertificateProfileBase;
import com.microsoft.graph.models.IosCustomConfiguration;
import com.microsoft.graph.models.IosDerivedCredentialAuthenticationConfiguration;
import com.microsoft.graph.models.IosDeviceFeaturesConfiguration;
import com.microsoft.graph.models.IosEasEmailProfileConfiguration;
import com.microsoft.graph.models.IosEducationDeviceConfiguration;
import com.microsoft.graph.models.IosEduDeviceConfiguration;
import com.microsoft.graph.models.IosEnterpriseWiFiConfiguration;
import com.microsoft.graph.models.IosExpeditedCheckinConfiguration;
import com.microsoft.graph.models.IosGeneralDeviceConfiguration;
import com.microsoft.graph.models.IosikEv2VpnConfiguration;
import com.microsoft.graph.models.IosImportedPFXCertificateProfile;
import com.microsoft.graph.models.IosPkcsCertificateProfile;
import com.microsoft.graph.models.IosScepCertificateProfile;
import com.microsoft.graph.models.IosTrustedRootCertificate;
import com.microsoft.graph.models.IosUpdateConfiguration;
import com.microsoft.graph.models.IosVpnConfiguration;
import com.microsoft.graph.models.IosWiFiConfiguration;
import com.microsoft.graph.models.MacOSCertificateProfileBase;
import com.microsoft.graph.models.MacOSCustomAppConfiguration;
import com.microsoft.graph.models.MacOSCustomConfiguration;
import com.microsoft.graph.models.MacOSDeviceFeaturesConfiguration;
import com.microsoft.graph.models.MacOSEndpointProtectionConfiguration;
import com.microsoft.graph.models.MacOSEnterpriseWiFiConfiguration;
import com.microsoft.graph.models.MacOSExtensionsConfiguration;
import com.microsoft.graph.models.MacOSGeneralDeviceConfiguration;
import com.microsoft.graph.models.MacOSImportedPFXCertificateProfile;
import com.microsoft.graph.models.MacOSPkcsCertificateProfile;
import com.microsoft.graph.models.MacOSScepCertificateProfile;
import com.microsoft.graph.models.MacOSSoftwareUpdateConfiguration;
import com.microsoft.graph.models.MacOSTrustedRootCertificate;
import com.microsoft.graph.models.MacOSVpnConfiguration;
import com.microsoft.graph.models.MacOSWiFiConfiguration;
import com.microsoft.graph.models.MacOSWiredNetworkConfiguration;
import com.microsoft.graph.models.SharedPCConfiguration;
import com.microsoft.graph.models.UnsupportedDeviceConfiguration;
import com.microsoft.graph.models.VpnConfiguration;
import com.microsoft.graph.models.Windows10CertificateProfileBase;
import com.microsoft.graph.models.Windows10CustomConfiguration;
import com.microsoft.graph.models.Windows10DeviceFirmwareConfigurationInterface;
import com.microsoft.graph.models.Windows10EasEmailProfileConfiguration;
import com.microsoft.graph.models.Windows10EndpointProtectionConfiguration;
import com.microsoft.graph.models.Windows10EnterpriseModernAppManagementConfiguration;
import com.microsoft.graph.models.Windows10GeneralConfiguration;
import com.microsoft.graph.models.Windows10ImportedPFXCertificateProfile;
import com.microsoft.graph.models.Windows10NetworkBoundaryConfiguration;
import com.microsoft.graph.models.Windows10PFXImportCertificateProfile;
import com.microsoft.graph.models.Windows10PkcsCertificateProfile;
import com.microsoft.graph.models.Windows10SecureAssessmentConfiguration;
import com.microsoft.graph.models.Windows10TeamGeneralConfiguration;
import com.microsoft.graph.models.Windows10VpnConfiguration;
import com.microsoft.graph.models.Windows81CertificateProfileBase;
import com.microsoft.graph.models.Windows81GeneralConfiguration;
import com.microsoft.graph.models.Windows81SCEPCertificateProfile;
import com.microsoft.graph.models.Windows81TrustedRootCertificate;
import com.microsoft.graph.models.Windows81VpnConfiguration;
import com.microsoft.graph.models.Windows81WifiImportConfiguration;
import com.microsoft.graph.models.WindowsCertificateProfileBase;
import com.microsoft.graph.models.WindowsDefenderAdvancedThreatProtectionConfiguration;
import com.microsoft.graph.models.WindowsDeliveryOptimizationConfiguration;
import com.microsoft.graph.models.WindowsDomainJoinConfiguration;
import com.microsoft.graph.models.WindowsHealthMonitoringConfiguration;
import com.microsoft.graph.models.WindowsIdentityProtectionConfiguration;
import com.microsoft.graph.models.WindowsKioskConfiguration;
import com.microsoft.graph.models.WindowsPhone81CertificateProfileBase;
import com.microsoft.graph.models.WindowsPhone81CustomConfiguration;
import com.microsoft.graph.models.WindowsPhone81GeneralConfiguration;
import com.microsoft.graph.models.WindowsPhone81ImportedPFXCertificateProfile;
import com.microsoft.graph.models.WindowsPhone81SCEPCertificateProfile;
import com.microsoft.graph.models.WindowsPhone81TrustedRootCertificate;
import com.microsoft.graph.models.WindowsPhone81VpnConfiguration;
import com.microsoft.graph.models.WindowsPhoneEASEmailProfileConfiguration;
import com.microsoft.graph.models.WindowsUpdateForBusinessConfiguration;
import com.microsoft.graph.models.WindowsVpnConfiguration;
import com.microsoft.graph.models.WindowsWifiConfiguration;
import com.microsoft.graph.models.WindowsWifiEnterpriseEAPConfiguration;
import com.microsoft.graph.models.WindowsWiredNetworkConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Device Configuration. */
public class DeviceConfiguration extends Entity implements Parsable {
    /** The list of assignments for the device configuration profile. */
    private java.util.List<DeviceConfigurationAssignment> _assignments;
    /** DateTime the object was created. */
    private OffsetDateTime _createdDateTime;
    /** Admin provided description of the Device Configuration. */
    private String _description;
    /** The device mode applicability rule for this Policy. */
    private DeviceManagementApplicabilityRuleDeviceMode _deviceManagementApplicabilityRuleDeviceMode;
    /** The OS edition applicability for this Policy. */
    private DeviceManagementApplicabilityRuleOsEdition _deviceManagementApplicabilityRuleOsEdition;
    /** The OS version applicability rule for this Policy. */
    private DeviceManagementApplicabilityRuleOsVersion _deviceManagementApplicabilityRuleOsVersion;
    /** Device Configuration Setting State Device Summary */
    private java.util.List<SettingStateDeviceSummary> _deviceSettingStateSummaries;
    /** Device configuration installation status by device. */
    private java.util.List<DeviceConfigurationDeviceStatus> _deviceStatuses;
    /** Device Configuration devices status overview */
    private DeviceConfigurationDeviceOverview _deviceStatusOverview;
    /** Admin provided name of the device configuration. */
    private String _displayName;
    /** The list of group assignments for the device configuration profile. */
    private java.util.List<DeviceConfigurationGroupAssignment> _groupAssignments;
    /** DateTime the object was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** List of Scope Tags for this Entity instance. */
    private java.util.List<String> _roleScopeTagIds;
    /** Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. */
    private Boolean _supportsScopeTags;
    /** Device configuration installation status by user. */
    private java.util.List<DeviceConfigurationUserStatus> _userStatuses;
    /** Device Configuration users status overview */
    private DeviceConfigurationUserOverview _userStatusOverview;
    /** Version of the device configuration. */
    private Integer _version;
    /**
     * Instantiates a new deviceConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.deviceConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceConfiguration
     */
    @javax.annotation.Nonnull
    public static DeviceConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidCertificateProfileBase": return new AndroidCertificateProfileBase();
                case "#microsoft.graph.androidCustomConfiguration": return new AndroidCustomConfiguration();
                case "#microsoft.graph.androidDeviceOwnerCertificateProfileBase": return new AndroidDeviceOwnerCertificateProfileBase();
                case "#microsoft.graph.androidDeviceOwnerDerivedCredentialAuthenticationConfiguration": return new AndroidDeviceOwnerDerivedCredentialAuthenticationConfiguration();
                case "#microsoft.graph.androidDeviceOwnerEnterpriseWiFiConfiguration": return new AndroidDeviceOwnerEnterpriseWiFiConfiguration();
                case "#microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration": return new AndroidDeviceOwnerGeneralDeviceConfiguration();
                case "#microsoft.graph.androidDeviceOwnerImportedPFXCertificateProfile": return new AndroidDeviceOwnerImportedPFXCertificateProfile();
                case "#microsoft.graph.androidDeviceOwnerPkcsCertificateProfile": return new AndroidDeviceOwnerPkcsCertificateProfile();
                case "#microsoft.graph.androidDeviceOwnerScepCertificateProfile": return new AndroidDeviceOwnerScepCertificateProfile();
                case "#microsoft.graph.androidDeviceOwnerTrustedRootCertificate": return new AndroidDeviceOwnerTrustedRootCertificate();
                case "#microsoft.graph.androidDeviceOwnerVpnConfiguration": return new AndroidDeviceOwnerVpnConfiguration();
                case "#microsoft.graph.androidDeviceOwnerWiFiConfiguration": return new AndroidDeviceOwnerWiFiConfiguration();
                case "#microsoft.graph.androidEasEmailProfileConfiguration": return new AndroidEasEmailProfileConfiguration();
                case "#microsoft.graph.androidEnterpriseWiFiConfiguration": return new AndroidEnterpriseWiFiConfiguration();
                case "#microsoft.graph.androidForWorkCertificateProfileBase": return new AndroidForWorkCertificateProfileBase();
                case "#microsoft.graph.androidForWorkCustomConfiguration": return new AndroidForWorkCustomConfiguration();
                case "#microsoft.graph.androidForWorkEasEmailProfileBase": return new AndroidForWorkEasEmailProfileBase();
                case "#microsoft.graph.androidForWorkEnterpriseWiFiConfiguration": return new AndroidForWorkEnterpriseWiFiConfiguration();
                case "#microsoft.graph.androidForWorkGeneralDeviceConfiguration": return new AndroidForWorkGeneralDeviceConfiguration();
                case "#microsoft.graph.androidForWorkGmailEasConfiguration": return new AndroidForWorkGmailEasConfiguration();
                case "#microsoft.graph.androidForWorkImportedPFXCertificateProfile": return new AndroidForWorkImportedPFXCertificateProfile();
                case "#microsoft.graph.androidForWorkNineWorkEasConfiguration": return new AndroidForWorkNineWorkEasConfiguration();
                case "#microsoft.graph.androidForWorkPkcsCertificateProfile": return new AndroidForWorkPkcsCertificateProfile();
                case "#microsoft.graph.androidForWorkScepCertificateProfile": return new AndroidForWorkScepCertificateProfile();
                case "#microsoft.graph.androidForWorkTrustedRootCertificate": return new AndroidForWorkTrustedRootCertificate();
                case "#microsoft.graph.androidForWorkVpnConfiguration": return new AndroidForWorkVpnConfiguration();
                case "#microsoft.graph.androidForWorkWiFiConfiguration": return new AndroidForWorkWiFiConfiguration();
                case "#microsoft.graph.androidGeneralDeviceConfiguration": return new AndroidGeneralDeviceConfiguration();
                case "#microsoft.graph.androidImportedPFXCertificateProfile": return new AndroidImportedPFXCertificateProfile();
                case "#microsoft.graph.androidOmaCpConfiguration": return new AndroidOmaCpConfiguration();
                case "#microsoft.graph.androidPkcsCertificateProfile": return new AndroidPkcsCertificateProfile();
                case "#microsoft.graph.androidScepCertificateProfile": return new AndroidScepCertificateProfile();
                case "#microsoft.graph.androidTrustedRootCertificate": return new AndroidTrustedRootCertificate();
                case "#microsoft.graph.androidVpnConfiguration": return new AndroidVpnConfiguration();
                case "#microsoft.graph.androidWiFiConfiguration": return new AndroidWiFiConfiguration();
                case "#microsoft.graph.androidWorkProfileCertificateProfileBase": return new AndroidWorkProfileCertificateProfileBase();
                case "#microsoft.graph.androidWorkProfileCustomConfiguration": return new AndroidWorkProfileCustomConfiguration();
                case "#microsoft.graph.androidWorkProfileEasEmailProfileBase": return new AndroidWorkProfileEasEmailProfileBase();
                case "#microsoft.graph.androidWorkProfileEnterpriseWiFiConfiguration": return new AndroidWorkProfileEnterpriseWiFiConfiguration();
                case "#microsoft.graph.androidWorkProfileGeneralDeviceConfiguration": return new AndroidWorkProfileGeneralDeviceConfiguration();
                case "#microsoft.graph.androidWorkProfileGmailEasConfiguration": return new AndroidWorkProfileGmailEasConfiguration();
                case "#microsoft.graph.androidWorkProfileNineWorkEasConfiguration": return new AndroidWorkProfileNineWorkEasConfiguration();
                case "#microsoft.graph.androidWorkProfilePkcsCertificateProfile": return new AndroidWorkProfilePkcsCertificateProfile();
                case "#microsoft.graph.androidWorkProfileScepCertificateProfile": return new AndroidWorkProfileScepCertificateProfile();
                case "#microsoft.graph.androidWorkProfileTrustedRootCertificate": return new AndroidWorkProfileTrustedRootCertificate();
                case "#microsoft.graph.androidWorkProfileVpnConfiguration": return new AndroidWorkProfileVpnConfiguration();
                case "#microsoft.graph.androidWorkProfileWiFiConfiguration": return new AndroidWorkProfileWiFiConfiguration();
                case "#microsoft.graph.aospDeviceOwnerCertificateProfileBase": return new AospDeviceOwnerCertificateProfileBase();
                case "#microsoft.graph.aospDeviceOwnerDeviceConfiguration": return new AospDeviceOwnerDeviceConfiguration();
                case "#microsoft.graph.aospDeviceOwnerEnterpriseWiFiConfiguration": return new AospDeviceOwnerEnterpriseWiFiConfiguration();
                case "#microsoft.graph.aospDeviceOwnerPkcsCertificateProfile": return new AospDeviceOwnerPkcsCertificateProfile();
                case "#microsoft.graph.aospDeviceOwnerScepCertificateProfile": return new AospDeviceOwnerScepCertificateProfile();
                case "#microsoft.graph.aospDeviceOwnerTrustedRootCertificate": return new AospDeviceOwnerTrustedRootCertificate();
                case "#microsoft.graph.aospDeviceOwnerWiFiConfiguration": return new AospDeviceOwnerWiFiConfiguration();
                case "#microsoft.graph.appleDeviceFeaturesConfigurationBase": return new AppleDeviceFeaturesConfigurationBase();
                case "#microsoft.graph.appleExpeditedCheckinConfigurationBase": return new AppleExpeditedCheckinConfigurationBase();
                case "#microsoft.graph.appleVpnConfiguration": return new AppleVpnConfiguration();
                case "#microsoft.graph.easEmailProfileConfigurationBase": return new EasEmailProfileConfigurationBase();
                case "#microsoft.graph.editionUpgradeConfiguration": return new EditionUpgradeConfiguration();
                case "#microsoft.graph.iosCertificateProfile": return new IosCertificateProfile();
                case "#microsoft.graph.iosCertificateProfileBase": return new IosCertificateProfileBase();
                case "#microsoft.graph.iosCustomConfiguration": return new IosCustomConfiguration();
                case "#microsoft.graph.iosDerivedCredentialAuthenticationConfiguration": return new IosDerivedCredentialAuthenticationConfiguration();
                case "#microsoft.graph.iosDeviceFeaturesConfiguration": return new IosDeviceFeaturesConfiguration();
                case "#microsoft.graph.iosEasEmailProfileConfiguration": return new IosEasEmailProfileConfiguration();
                case "#microsoft.graph.iosEducationDeviceConfiguration": return new IosEducationDeviceConfiguration();
                case "#microsoft.graph.iosEduDeviceConfiguration": return new IosEduDeviceConfiguration();
                case "#microsoft.graph.iosEnterpriseWiFiConfiguration": return new IosEnterpriseWiFiConfiguration();
                case "#microsoft.graph.iosExpeditedCheckinConfiguration": return new IosExpeditedCheckinConfiguration();
                case "#microsoft.graph.iosGeneralDeviceConfiguration": return new IosGeneralDeviceConfiguration();
                case "#microsoft.graph.iosikEv2VpnConfiguration": return new IosikEv2VpnConfiguration();
                case "#microsoft.graph.iosImportedPFXCertificateProfile": return new IosImportedPFXCertificateProfile();
                case "#microsoft.graph.iosPkcsCertificateProfile": return new IosPkcsCertificateProfile();
                case "#microsoft.graph.iosScepCertificateProfile": return new IosScepCertificateProfile();
                case "#microsoft.graph.iosTrustedRootCertificate": return new IosTrustedRootCertificate();
                case "#microsoft.graph.iosUpdateConfiguration": return new IosUpdateConfiguration();
                case "#microsoft.graph.iosVpnConfiguration": return new IosVpnConfiguration();
                case "#microsoft.graph.iosWiFiConfiguration": return new IosWiFiConfiguration();
                case "#microsoft.graph.macOSCertificateProfileBase": return new MacOSCertificateProfileBase();
                case "#microsoft.graph.macOSCustomAppConfiguration": return new MacOSCustomAppConfiguration();
                case "#microsoft.graph.macOSCustomConfiguration": return new MacOSCustomConfiguration();
                case "#microsoft.graph.macOSDeviceFeaturesConfiguration": return new MacOSDeviceFeaturesConfiguration();
                case "#microsoft.graph.macOSEndpointProtectionConfiguration": return new MacOSEndpointProtectionConfiguration();
                case "#microsoft.graph.macOSEnterpriseWiFiConfiguration": return new MacOSEnterpriseWiFiConfiguration();
                case "#microsoft.graph.macOSExtensionsConfiguration": return new MacOSExtensionsConfiguration();
                case "#microsoft.graph.macOSGeneralDeviceConfiguration": return new MacOSGeneralDeviceConfiguration();
                case "#microsoft.graph.macOSImportedPFXCertificateProfile": return new MacOSImportedPFXCertificateProfile();
                case "#microsoft.graph.macOSPkcsCertificateProfile": return new MacOSPkcsCertificateProfile();
                case "#microsoft.graph.macOSScepCertificateProfile": return new MacOSScepCertificateProfile();
                case "#microsoft.graph.macOSSoftwareUpdateConfiguration": return new MacOSSoftwareUpdateConfiguration();
                case "#microsoft.graph.macOSTrustedRootCertificate": return new MacOSTrustedRootCertificate();
                case "#microsoft.graph.macOSVpnConfiguration": return new MacOSVpnConfiguration();
                case "#microsoft.graph.macOSWiFiConfiguration": return new MacOSWiFiConfiguration();
                case "#microsoft.graph.macOSWiredNetworkConfiguration": return new MacOSWiredNetworkConfiguration();
                case "#microsoft.graph.sharedPCConfiguration": return new SharedPCConfiguration();
                case "#microsoft.graph.unsupportedDeviceConfiguration": return new UnsupportedDeviceConfiguration();
                case "#microsoft.graph.vpnConfiguration": return new VpnConfiguration();
                case "#microsoft.graph.windows10CertificateProfileBase": return new Windows10CertificateProfileBase();
                case "#microsoft.graph.windows10CustomConfiguration": return new Windows10CustomConfiguration();
                case "#microsoft.graph.windows10DeviceFirmwareConfigurationInterface": return new Windows10DeviceFirmwareConfigurationInterface();
                case "#microsoft.graph.windows10EasEmailProfileConfiguration": return new Windows10EasEmailProfileConfiguration();
                case "#microsoft.graph.windows10EndpointProtectionConfiguration": return new Windows10EndpointProtectionConfiguration();
                case "#microsoft.graph.windows10EnterpriseModernAppManagementConfiguration": return new Windows10EnterpriseModernAppManagementConfiguration();
                case "#microsoft.graph.windows10GeneralConfiguration": return new Windows10GeneralConfiguration();
                case "#microsoft.graph.windows10ImportedPFXCertificateProfile": return new Windows10ImportedPFXCertificateProfile();
                case "#microsoft.graph.windows10NetworkBoundaryConfiguration": return new Windows10NetworkBoundaryConfiguration();
                case "#microsoft.graph.windows10PFXImportCertificateProfile": return new Windows10PFXImportCertificateProfile();
                case "#microsoft.graph.windows10PkcsCertificateProfile": return new Windows10PkcsCertificateProfile();
                case "#microsoft.graph.windows10SecureAssessmentConfiguration": return new Windows10SecureAssessmentConfiguration();
                case "#microsoft.graph.windows10TeamGeneralConfiguration": return new Windows10TeamGeneralConfiguration();
                case "#microsoft.graph.windows10VpnConfiguration": return new Windows10VpnConfiguration();
                case "#microsoft.graph.windows81CertificateProfileBase": return new Windows81CertificateProfileBase();
                case "#microsoft.graph.windows81GeneralConfiguration": return new Windows81GeneralConfiguration();
                case "#microsoft.graph.windows81SCEPCertificateProfile": return new Windows81SCEPCertificateProfile();
                case "#microsoft.graph.windows81TrustedRootCertificate": return new Windows81TrustedRootCertificate();
                case "#microsoft.graph.windows81VpnConfiguration": return new Windows81VpnConfiguration();
                case "#microsoft.graph.windows81WifiImportConfiguration": return new Windows81WifiImportConfiguration();
                case "#microsoft.graph.windowsCertificateProfileBase": return new WindowsCertificateProfileBase();
                case "#microsoft.graph.windowsDefenderAdvancedThreatProtectionConfiguration": return new WindowsDefenderAdvancedThreatProtectionConfiguration();
                case "#microsoft.graph.windowsDeliveryOptimizationConfiguration": return new WindowsDeliveryOptimizationConfiguration();
                case "#microsoft.graph.windowsDomainJoinConfiguration": return new WindowsDomainJoinConfiguration();
                case "#microsoft.graph.windowsHealthMonitoringConfiguration": return new WindowsHealthMonitoringConfiguration();
                case "#microsoft.graph.windowsIdentityProtectionConfiguration": return new WindowsIdentityProtectionConfiguration();
                case "#microsoft.graph.windowsKioskConfiguration": return new WindowsKioskConfiguration();
                case "#microsoft.graph.windowsPhone81CertificateProfileBase": return new WindowsPhone81CertificateProfileBase();
                case "#microsoft.graph.windowsPhone81CustomConfiguration": return new WindowsPhone81CustomConfiguration();
                case "#microsoft.graph.windowsPhone81GeneralConfiguration": return new WindowsPhone81GeneralConfiguration();
                case "#microsoft.graph.windowsPhone81ImportedPFXCertificateProfile": return new WindowsPhone81ImportedPFXCertificateProfile();
                case "#microsoft.graph.windowsPhone81SCEPCertificateProfile": return new WindowsPhone81SCEPCertificateProfile();
                case "#microsoft.graph.windowsPhone81TrustedRootCertificate": return new WindowsPhone81TrustedRootCertificate();
                case "#microsoft.graph.windowsPhone81VpnConfiguration": return new WindowsPhone81VpnConfiguration();
                case "#microsoft.graph.windowsPhoneEASEmailProfileConfiguration": return new WindowsPhoneEASEmailProfileConfiguration();
                case "#microsoft.graph.windowsUpdateForBusinessConfiguration": return new WindowsUpdateForBusinessConfiguration();
                case "#microsoft.graph.windowsVpnConfiguration": return new WindowsVpnConfiguration();
                case "#microsoft.graph.windowsWifiConfiguration": return new WindowsWifiConfiguration();
                case "#microsoft.graph.windowsWifiEnterpriseEAPConfiguration": return new WindowsWifiEnterpriseEAPConfiguration();
                case "#microsoft.graph.windowsWiredNetworkConfiguration": return new WindowsWiredNetworkConfiguration();
            }
        }
        return new DeviceConfiguration();
    }
    /**
     * Gets the assignments property value. The list of assignments for the device configuration profile.
     * @return a deviceConfigurationAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Admin provided description of the Device Configuration.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceManagementApplicabilityRuleDeviceMode property value. The device mode applicability rule for this Policy.
     * @return a deviceManagementApplicabilityRuleDeviceMode
     */
    @javax.annotation.Nullable
    public DeviceManagementApplicabilityRuleDeviceMode getDeviceManagementApplicabilityRuleDeviceMode() {
        return this._deviceManagementApplicabilityRuleDeviceMode;
    }
    /**
     * Gets the deviceManagementApplicabilityRuleOsEdition property value. The OS edition applicability for this Policy.
     * @return a deviceManagementApplicabilityRuleOsEdition
     */
    @javax.annotation.Nullable
    public DeviceManagementApplicabilityRuleOsEdition getDeviceManagementApplicabilityRuleOsEdition() {
        return this._deviceManagementApplicabilityRuleOsEdition;
    }
    /**
     * Gets the deviceManagementApplicabilityRuleOsVersion property value. The OS version applicability rule for this Policy.
     * @return a deviceManagementApplicabilityRuleOsVersion
     */
    @javax.annotation.Nullable
    public DeviceManagementApplicabilityRuleOsVersion getDeviceManagementApplicabilityRuleOsVersion() {
        return this._deviceManagementApplicabilityRuleOsVersion;
    }
    /**
     * Gets the deviceSettingStateSummaries property value. Device Configuration Setting State Device Summary
     * @return a settingStateDeviceSummary
     */
    @javax.annotation.Nullable
    public java.util.List<SettingStateDeviceSummary> getDeviceSettingStateSummaries() {
        return this._deviceSettingStateSummaries;
    }
    /**
     * Gets the deviceStatuses property value. Device configuration installation status by device.
     * @return a deviceConfigurationDeviceStatus
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationDeviceStatus> getDeviceStatuses() {
        return this._deviceStatuses;
    }
    /**
     * Gets the deviceStatusOverview property value. Device Configuration devices status overview
     * @return a deviceConfigurationDeviceOverview
     */
    @javax.annotation.Nullable
    public DeviceConfigurationDeviceOverview getDeviceStatusOverview() {
        return this._deviceStatusOverview;
    }
    /**
     * Gets the displayName property value. Admin provided name of the device configuration.
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
        final DeviceConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(DeviceConfigurationAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceManagementApplicabilityRuleDeviceMode", (n) -> { currentObject.setDeviceManagementApplicabilityRuleDeviceMode(n.getObjectValue(DeviceManagementApplicabilityRuleDeviceMode::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceManagementApplicabilityRuleOsEdition", (n) -> { currentObject.setDeviceManagementApplicabilityRuleOsEdition(n.getObjectValue(DeviceManagementApplicabilityRuleOsEdition::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceManagementApplicabilityRuleOsVersion", (n) -> { currentObject.setDeviceManagementApplicabilityRuleOsVersion(n.getObjectValue(DeviceManagementApplicabilityRuleOsVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceSettingStateSummaries", (n) -> { currentObject.setDeviceSettingStateSummaries(n.getCollectionOfObjectValues(SettingStateDeviceSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStatuses", (n) -> { currentObject.setDeviceStatuses(n.getCollectionOfObjectValues(DeviceConfigurationDeviceStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStatusOverview", (n) -> { currentObject.setDeviceStatusOverview(n.getObjectValue(DeviceConfigurationDeviceOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("groupAssignments", (n) -> { currentObject.setGroupAssignments(n.getCollectionOfObjectValues(DeviceConfigurationGroupAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { currentObject.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("supportsScopeTags", (n) -> { currentObject.setSupportsScopeTags(n.getBooleanValue()); });
        deserializerMap.put("userStatuses", (n) -> { currentObject.setUserStatuses(n.getCollectionOfObjectValues(DeviceConfigurationUserStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("userStatusOverview", (n) -> { currentObject.setUserStatusOverview(n.getObjectValue(DeviceConfigurationUserOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        return deserializerMap
    }
    /**
     * Gets the groupAssignments property value. The list of group assignments for the device configuration profile.
     * @return a deviceConfigurationGroupAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationGroupAssignment> getGroupAssignments() {
        return this._groupAssignments;
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this._roleScopeTagIds;
    }
    /**
     * Gets the supportsScopeTags property value. Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSupportsScopeTags() {
        return this._supportsScopeTags;
    }
    /**
     * Gets the userStatuses property value. Device configuration installation status by user.
     * @return a deviceConfigurationUserStatus
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationUserStatus> getUserStatuses() {
        return this._userStatuses;
    }
    /**
     * Gets the userStatusOverview property value. Device Configuration users status overview
     * @return a deviceConfigurationUserOverview
     */
    @javax.annotation.Nullable
    public DeviceConfigurationUserOverview getUserStatusOverview() {
        return this._userStatusOverview;
    }
    /**
     * Gets the version property value. Version of the device configuration.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
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
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("deviceManagementApplicabilityRuleDeviceMode", this.getDeviceManagementApplicabilityRuleDeviceMode());
        writer.writeObjectValue("deviceManagementApplicabilityRuleOsEdition", this.getDeviceManagementApplicabilityRuleOsEdition());
        writer.writeObjectValue("deviceManagementApplicabilityRuleOsVersion", this.getDeviceManagementApplicabilityRuleOsVersion());
        writer.writeCollectionOfObjectValues("deviceSettingStateSummaries", this.getDeviceSettingStateSummaries());
        writer.writeCollectionOfObjectValues("deviceStatuses", this.getDeviceStatuses());
        writer.writeObjectValue("deviceStatusOverview", this.getDeviceStatusOverview());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("groupAssignments", this.getGroupAssignments());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
        writer.writeCollectionOfObjectValues("userStatuses", this.getUserStatuses());
        writer.writeObjectValue("userStatusOverview", this.getUserStatusOverview());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the assignments property value. The list of assignments for the device configuration profile.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<DeviceConfigurationAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Admin provided description of the Device Configuration.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceManagementApplicabilityRuleDeviceMode property value. The device mode applicability rule for this Policy.
     * @param value Value to set for the deviceManagementApplicabilityRuleDeviceMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagementApplicabilityRuleDeviceMode(@javax.annotation.Nullable final DeviceManagementApplicabilityRuleDeviceMode value) {
        this._deviceManagementApplicabilityRuleDeviceMode = value;
    }
    /**
     * Sets the deviceManagementApplicabilityRuleOsEdition property value. The OS edition applicability for this Policy.
     * @param value Value to set for the deviceManagementApplicabilityRuleOsEdition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagementApplicabilityRuleOsEdition(@javax.annotation.Nullable final DeviceManagementApplicabilityRuleOsEdition value) {
        this._deviceManagementApplicabilityRuleOsEdition = value;
    }
    /**
     * Sets the deviceManagementApplicabilityRuleOsVersion property value. The OS version applicability rule for this Policy.
     * @param value Value to set for the deviceManagementApplicabilityRuleOsVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagementApplicabilityRuleOsVersion(@javax.annotation.Nullable final DeviceManagementApplicabilityRuleOsVersion value) {
        this._deviceManagementApplicabilityRuleOsVersion = value;
    }
    /**
     * Sets the deviceSettingStateSummaries property value. Device Configuration Setting State Device Summary
     * @param value Value to set for the deviceSettingStateSummaries property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceSettingStateSummaries(@javax.annotation.Nullable final java.util.List<SettingStateDeviceSummary> value) {
        this._deviceSettingStateSummaries = value;
    }
    /**
     * Sets the deviceStatuses property value. Device configuration installation status by device.
     * @param value Value to set for the deviceStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStatuses(@javax.annotation.Nullable final java.util.List<DeviceConfigurationDeviceStatus> value) {
        this._deviceStatuses = value;
    }
    /**
     * Sets the deviceStatusOverview property value. Device Configuration devices status overview
     * @param value Value to set for the deviceStatusOverview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceStatusOverview(@javax.annotation.Nullable final DeviceConfigurationDeviceOverview value) {
        this._deviceStatusOverview = value;
    }
    /**
     * Sets the displayName property value. Admin provided name of the device configuration.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the groupAssignments property value. The list of group assignments for the device configuration profile.
     * @param value Value to set for the groupAssignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupAssignments(@javax.annotation.Nullable final java.util.List<DeviceConfigurationGroupAssignment> value) {
        this._groupAssignments = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._roleScopeTagIds = value;
    }
    /**
     * Sets the supportsScopeTags property value. Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only.
     * @param value Value to set for the supportsScopeTags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportsScopeTags(@javax.annotation.Nullable final Boolean value) {
        this._supportsScopeTags = value;
    }
    /**
     * Sets the userStatuses property value. Device configuration installation status by user.
     * @param value Value to set for the userStatuses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserStatuses(@javax.annotation.Nullable final java.util.List<DeviceConfigurationUserStatus> value) {
        this._userStatuses = value;
    }
    /**
     * Sets the userStatusOverview property value. Device Configuration users status overview
     * @param value Value to set for the userStatusOverview property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserStatusOverview(@javax.annotation.Nullable final DeviceConfigurationUserOverview value) {
        this._userStatusOverview = value;
    }
    /**
     * Sets the version property value. Version of the device configuration.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}
